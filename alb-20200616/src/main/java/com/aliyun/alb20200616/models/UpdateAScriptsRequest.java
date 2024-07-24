// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class UpdateAScriptsRequest extends TeaModel {
    /**
     * <p>The information about the AScript rule.</p>
     */
    @NameInMap("AScripts")
    public java.util.List<UpdateAScriptsRequestAScripts> AScripts;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.</p>
     * <blockquote>
     * <p> If you do not specify this parameter, the system automatically uses the <strong>request ID</strong> as the <strong>client token</strong>. The <strong>request ID</strong> may be different for each request.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>b1f642ac-5558-4a36-b7d9-cf53f40ea5c8</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to perform only a dry run, without performing the actual request. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: performs only a dry run. The system checks the request for potential issues, including missing parameter values, incorrect request syntax, and service limits. If the request fails the dry run, an error message is returned. If the request passes the dry run, the <code>DryRunOperation</code> error code is returned.</li>
     * <li><strong>false</strong>(default): performs a dry run and performs the actual request. If the request passes the dry run, a 2xx HTTP status code is returned and the operation is performed.</li>
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
         * <p>The attribute name.</p>
         * <p>Set the value to <strong>EsDebug</strong>, which specifies that when requests carry the _es_dbg parameter whose value is the specified key, the debugging header is enabled to output the execution result.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>EsDebug</p>
         */
        @NameInMap("AttributeKey")
        public String attributeKey;

        /**
         * <p>The attribute value, which must be 1 to 128 characters in length, and can contain letters and digits.</p>
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
         * <p>The rule ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>as-mhqxcanmivn4g5****</p>
         */
        @NameInMap("AScriptId")
        public String AScriptId;

        /**
         * <p>The name of the AScript rule.</p>
         * <p>The name must be 2 to 128 character in length, and can contain letters, digits, periods (.), underscores (_), and hyphens (-). It must start with a letter.</p>
         * 
         * <strong>example:</strong>
         * <p>Group1</p>
         */
        @NameInMap("AScriptName")
        public String AScriptName;

        /**
         * <p>Specifies whether to enable the AScript rule. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong> (default)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Enabled")
        public Boolean enabled;

        /**
         * <p>Specifies whether to enable the extended attributes of the Ascript rule. Valid values:</p>
         * <ul>
         * <li>true</li>
         * <li>false (false)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ExtAttributeEnabled")
        public Boolean extAttributeEnabled;

        /**
         * <p>The extended attribute.</p>
         */
        @NameInMap("ExtAttributes")
        public java.util.List<UpdateAScriptsRequestAScriptsExtAttributes> extAttributes;

        /**
         * <p>The content of the AScript rule.</p>
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
