// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class CreateAScriptsRequest extends TeaModel {
    /**
     * <p>The AScripts to create.</p>
     */
    @NameInMap("AScripts")
    public java.util.List<CreateAScriptsRequestAScripts> AScripts;

    /**
     * <p>A client token used to ensure request idempotency.</p>
     * <p>You can generate this value on your client. The value must be unique across requests and contain only ASCII characters.</p>
     * 
     * <strong>example:</strong>
     * <p>5A2CFF0E-5718-45B5-9D4D-70B******</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to perform a dry run. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: performs a dry run without creating the AScript. The system checks the request for required parameters, format validity, and service limits. If the request fails the check, an error message is returned. If the request passes the check, the <code>DryRunOperation</code> error code is returned.</p>
     * </li>
     * <li><p><strong>false</strong> (default): sends a normal request. After the request passes the check, the system returns an HTTP 2xx status code and performs the operation.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The listener ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>lsn-6hfq3zs0x04ibn****</p>
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

    public static class CreateAScriptsRequestAScriptsExtAttributes extends TeaModel {
        /**
         * <p>The attribute key.</p>
         * <p>The only valid value is <strong>EsDebug</strong>. If a request contains the _es_dbg parameter and its value matches the secret key specified in AttributeValue, the system adds a debug header to the response, which contains rule execution logs.</p>
         * 
         * <strong>example:</strong>
         * <p>EsDebug</p>
         */
        @NameInMap("AttributeKey")
        public String attributeKey;

        /**
         * <p>The attribute value, which is used as the secret key for the EsDebug attribute. The value must be 1 to 128 characters long and can contain uppercase letters, lowercase letters, and digits.</p>
         * 
         * <strong>example:</strong>
         * <p>test123</p>
         */
        @NameInMap("AttributeValue")
        public String attributeValue;

        public static CreateAScriptsRequestAScriptsExtAttributes build(java.util.Map<String, ?> map) throws Exception {
            CreateAScriptsRequestAScriptsExtAttributes self = new CreateAScriptsRequestAScriptsExtAttributes();
            return TeaModel.build(map, self);
        }

        public CreateAScriptsRequestAScriptsExtAttributes setAttributeKey(String attributeKey) {
            this.attributeKey = attributeKey;
            return this;
        }
        public String getAttributeKey() {
            return this.attributeKey;
        }

        public CreateAScriptsRequestAScriptsExtAttributes setAttributeValue(String attributeValue) {
            this.attributeValue = attributeValue;
            return this;
        }
        public String getAttributeValue() {
            return this.attributeValue;
        }

    }

    public static class CreateAScriptsRequestAScripts extends TeaModel {
        /**
         * <p>The name of the AScript.</p>
         * <p>The name must be 2 to 128 characters long, and must start with a letter, a digit, or a Chinese character. It can contain digits, periods (.), underscores (_), hyphens (-), and spaces.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("AScriptName")
        public String AScriptName;

        /**
         * <p>Specifies whether the AScript is enabled. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: Enabled.</p>
         * </li>
         * <li><p><strong>false</strong> (default): Disabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Enabled")
        public Boolean enabled;

        /**
         * <p>Specifies whether to enable extended attributes for the AScript. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: Enabled.</p>
         * </li>
         * <li><p><strong>false</strong> (default): Disabled.</p>
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
        public java.util.List<CreateAScriptsRequestAScriptsExtAttributes> extAttributes;

        /**
         * <p>Specifies when the AScript is executed. Valid values:</p>
         * <ul>
         * <li><p><strong>RequestHead</strong> (default): Executes before request rules.</p>
         * </li>
         * <li><p><strong>RequestFoot</strong>: Executes after request rules.</p>
         * </li>
         * <li><p><strong>ResponseHead</strong>: Executes before response rules.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>RequestFoot</p>
         */
        @NameInMap("Position")
        public String position;

        /**
         * <p>The content of the AScript.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>if and(match_re($uri, \&quot;^/1.txt$\&quot;), $arg_type) {   rewrite(concat(\&quot;/1.\&quot;, $arg_type), \&quot;break\&quot;) }</p>
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

        public CreateAScriptsRequestAScripts setExtAttributeEnabled(Boolean extAttributeEnabled) {
            this.extAttributeEnabled = extAttributeEnabled;
            return this;
        }
        public Boolean getExtAttributeEnabled() {
            return this.extAttributeEnabled;
        }

        public CreateAScriptsRequestAScripts setExtAttributes(java.util.List<CreateAScriptsRequestAScriptsExtAttributes> extAttributes) {
            this.extAttributes = extAttributes;
            return this;
        }
        public java.util.List<CreateAScriptsRequestAScriptsExtAttributes> getExtAttributes() {
            return this.extAttributes;
        }

        public CreateAScriptsRequestAScripts setPosition(String position) {
            this.position = position;
            return this;
        }
        public String getPosition() {
            return this.position;
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
