// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class UpdateAScriptsRequest extends TeaModel {
    /**
     * <p>The list of programmable scripts.</p>
     */
    @NameInMap("AScripts")
    public java.util.List<UpdateAScriptsRequestAScripts> AScripts;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system automatically uses the <strong>RequestId</strong> value as the <strong>ClientToken</strong> value. The <strong>RequestId</strong> value of each API request is different.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>b1f642ac-5558-4a36-b7d9-cf53******</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to perform a dry run. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: performs a dry run. The system checks the request for potential issues, including missing parameter values, incorrect request syntax, and service limits. If the request fails the dry run, an error code is returned. If the request passes the dry run, the <code>DryRunOperation</code> error code is returned.</li>
     * <li><strong>false</strong> (default): performs a dry run and sends the request. If the request passes the dry run, an HTTP 2xx status code is returned and the operation is performed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    public static UpdateAScriptsRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAScriptsRequest self = new UpdateAScriptsRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAScriptsRequest setAScripts(java.util.List<UpdateAScriptsRequestAScripts> AScripts) {
        this.AScripts = AScripts;
        return this;
    }
    public java.util.List<UpdateAScriptsRequestAScripts> getAScripts() {
        return this.AScripts;
    }

    public UpdateAScriptsRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateAScriptsRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public static class UpdateAScriptsRequestAScriptsExtAttributes extends TeaModel {
        /**
         * <p>The attribute name of the AScript script.</p>
         * <p>The only valid value is <strong>EsDebug</strong>: when a request carries the _es_dbg parameter and the value matches the key configured here, the corresponding debug response headers are enabled to output rule execution records.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>EsDebug</p>
         */
        @NameInMap("AttributeKey")
        public String attributeKey;

        /**
         * <p>The attribute value. The value can contain uppercase and lowercase letters or digits and must be 1 to 128 characters in length.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test123</p>
         */
        @NameInMap("AttributeValue")
        public String attributeValue;

        public static UpdateAScriptsRequestAScriptsExtAttributes build(java.util.Map<String, ?> map) throws Exception {
            UpdateAScriptsRequestAScriptsExtAttributes self = new UpdateAScriptsRequestAScriptsExtAttributes();
            return TeaModel.build(map, self);
        }

        public UpdateAScriptsRequestAScriptsExtAttributes setAttributeKey(String attributeKey) {
            this.attributeKey = attributeKey;
            return this;
        }
        public String getAttributeKey() {
            return this.attributeKey;
        }

        public UpdateAScriptsRequestAScriptsExtAttributes setAttributeValue(String attributeValue) {
            this.attributeValue = attributeValue;
            return this;
        }
        public String getAttributeValue() {
            return this.attributeValue;
        }

    }

    public static class UpdateAScriptsRequestAScripts extends TeaModel {
        /**
         * <p>The ID of the programmable script.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>as-mhqxcanmivn4g5****</p>
         */
        @NameInMap("AScriptId")
        public String AScriptId;

        /**
         * <p>The name of the programmable script.</p>
         * <p>The name must be 2 to 128 characters in length, and can contain letters, digits, periods (.), underscores (_), hyphens (-), and spaces. The name must start with a letter, a Chinese character, or a digit.</p>
         * 
         * <strong>example:</strong>
         * <p>Group1</p>
         */
        @NameInMap("AScriptName")
        public String AScriptName;

        /**
         * <p>Specifies whether to enable the programmable script. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: enables the programmable script.</p>
         * </li>
         * <li><p><strong>false</strong> (default): does not enable the programmable script.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Enabled")
        public Boolean enabled;

        /**
         * <p>Specifies whether to enable extended attributes for the programmable script. Valid values:</p>
         * <ul>
         * <li><p>true: enables extended attributes.</p>
         * </li>
         * <li><p>false (default): does not enable extended attributes.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ExtAttributeEnabled")
        public Boolean extAttributeEnabled;

        /**
         * <p>The extended attributes.</p>
         */
        @NameInMap("ExtAttributes")
        public java.util.List<UpdateAScriptsRequestAScriptsExtAttributes> extAttributes;

        /**
         * <p>The content of the programmable script.</p>
         * 
         * <strong>example:</strong>
         * <p>if and(match_re($uri, \&quot;^/1.txt$\&quot;), $arg_type) { rewrite(concat(\&quot;/1.\&quot;, $arg_type), \&quot;break\&quot;) }</p>
         */
        @NameInMap("ScriptContent")
        public String scriptContent;

        public static UpdateAScriptsRequestAScripts build(java.util.Map<String, ?> map) throws Exception {
            UpdateAScriptsRequestAScripts self = new UpdateAScriptsRequestAScripts();
            return TeaModel.build(map, self);
        }

        public UpdateAScriptsRequestAScripts setAScriptId(String AScriptId) {
            this.AScriptId = AScriptId;
            return this;
        }
        public String getAScriptId() {
            return this.AScriptId;
        }

        public UpdateAScriptsRequestAScripts setAScriptName(String AScriptName) {
            this.AScriptName = AScriptName;
            return this;
        }
        public String getAScriptName() {
            return this.AScriptName;
        }

        public UpdateAScriptsRequestAScripts setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public UpdateAScriptsRequestAScripts setExtAttributeEnabled(Boolean extAttributeEnabled) {
            this.extAttributeEnabled = extAttributeEnabled;
            return this;
        }
        public Boolean getExtAttributeEnabled() {
            return this.extAttributeEnabled;
        }

        public UpdateAScriptsRequestAScripts setExtAttributes(java.util.List<UpdateAScriptsRequestAScriptsExtAttributes> extAttributes) {
            this.extAttributes = extAttributes;
            return this;
        }
        public java.util.List<UpdateAScriptsRequestAScriptsExtAttributes> getExtAttributes() {
            return this.extAttributes;
        }

        public UpdateAScriptsRequestAScripts setScriptContent(String scriptContent) {
            this.scriptContent = scriptContent;
            return this;
        }
        public String getScriptContent() {
            return this.scriptContent;
        }

    }

}
