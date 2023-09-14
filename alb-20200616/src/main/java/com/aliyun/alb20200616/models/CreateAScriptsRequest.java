// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class CreateAScriptsRequest extends TeaModel {
    /**
     * <p>The AScript rules.</p>
     */
    @NameInMap("AScripts")
    public java.util.List<CreateAScriptsRequestAScripts> AScripts;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <br>
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to perform only a dry run, without performing the actual request. Valid values:</p>
     * <br>
     * <p>*   **true**: performs only a dry run. The system checks the request for potential issues, including missing parameter values, incorrect request syntax, and service limits. If the request fails the dry run, an error message is returned. If the request passes the dry run, the `DryRunOperation` error code is returned.</p>
     * <p>*   **false**(default): performs a dry run and performs the actual request. If the request passes the dry run, a 2xx HTTP status code is returned and the operation is performed.</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The listener ID.</p>
     */
    @NameInMap("ListenerId")
    public String listenerId;

    public static CreateAScriptsRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateAScriptsRequest self = new CreateAScriptsRequest();
        return TeaModel.build(map, self);
    }

    public CreateAScriptsRequest setAScripts(java.util.List<CreateAScriptsRequestAScripts> AScripts) {
        this.AScripts = AScripts;
        return this;
    }
    public java.util.List<CreateAScriptsRequestAScripts> getAScripts() {
        return this.AScripts;
    }

    public CreateAScriptsRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateAScriptsRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public CreateAScriptsRequest setListenerId(String listenerId) {
        this.listenerId = listenerId;
        return this;
    }
    public String getListenerId() {
        return this.listenerId;
    }

    public static class CreateAScriptsRequestAScripts extends TeaModel {
        /**
         * <p>The name of the AScript rule.</p>
         * <br>
         * <p>The name must be 2 to 128 characters in length and can contain letters, digits, periods (.), underscores (\_), and hyphens (-). The name must start with a letter.</p>
         */
        @NameInMap("AScriptName")
        public String AScriptName;

        /**
         * <p>Specifies whether to enable the AScript rule. Valid values:</p>
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false** (default)</p>
         */
        @NameInMap("Enabled")
        public Boolean enabled;

        /**
         * <p>The content of the AScript rule.</p>
         */
        @NameInMap("ScriptContent")
        public String scriptContent;

        public static CreateAScriptsRequestAScripts build(java.util.Map<String, ?> map) throws Exception {
            CreateAScriptsRequestAScripts self = new CreateAScriptsRequestAScripts();
            return TeaModel.build(map, self);
        }

        public CreateAScriptsRequestAScripts setAScriptName(String AScriptName) {
            this.AScriptName = AScriptName;
            return this;
        }
        public String getAScriptName() {
            return this.AScriptName;
        }

        public CreateAScriptsRequestAScripts setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public CreateAScriptsRequestAScripts setScriptContent(String scriptContent) {
            this.scriptContent = scriptContent;
            return this;
        }
        public String getScriptContent() {
            return this.scriptContent;
        }

    }

}
