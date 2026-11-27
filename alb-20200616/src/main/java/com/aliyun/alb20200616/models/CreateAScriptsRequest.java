// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class CreateAScriptsRequest extends TeaModel {
    /**
     * <p>The list of programmable script information.</p>
     */
    @NameInMap("AScripts")
    public java.util.List<CreateAScriptsRequestAScripts> AScripts;

    /**
     * <p>The client token used to ensure the idempotence of the request.</p>
     * <p>Generate a unique value from your client for each request. ClientToken supports only ASCII characters.</p>
     * 
     * <strong>example:</strong>
     * <p>5A2CFF0E-5718-45B5-9D4D-70B******</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to perform a dry run. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Sends a dry run request. No programmable script is created. The system checks whether the required parameters are specified, the request format is valid, and business limits are met. If the check fails, the corresponding error is returned. If the check passes, the error code <code>DryRunOperation</code> is returned.</li>
     * <li><strong>false</strong> (default): Sends a regular request. If the check passes, an HTTP 2xx status code is returned and the operation is performed.</li>
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
         * <p>The attribute key of the AScript script.</p>
         * <p>Valid values: <strong>EsDebug</strong> only. When a request carries the _es_dbg parameter and its value matches the key configured here, the corresponding debug response headers are enabled to output rule execution records.</p>
         * 
         * <strong>example:</strong>
         * <p>EsDebug</p>
         */
        @NameInMap("AttributeKey")
        public String attributeKey;

        /**
         * <p>The attribute value. The value can contain uppercase and lowercase letters and digits, and must be 1 to 128 characters in length.</p>
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
         * <p>The name of the programmable script.</p>
         * <p>The name must be 2 to 128 characters in length, and can contain letters, digits, periods (.), underscores (_), hyphens (-), and spaces. It must start with a letter, Chinese character, or digit.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("AScriptName")
        public String AScriptName;

        /**
         * <p>Specifies whether to enable the programmable script. Valid values:</p>
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
         * <p>Specifies whether to enable the extended attributes of the programmable script. Valid values:</p>
         * <ul>
         * <li><p>true: Enabled.</p>
         * </li>
         * <li><p>false (default): Disabled.</p>
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
         * <p>The execution position of the programmable script. Valid values:</p>
         * <ul>
         * <li><p>RequestHead (default): before request-direction rules are executed.</p>
         * </li>
         * <li><p>RequestFoot: after request-direction rules are executed.</p>
         * </li>
         * <li><p>ResponseHead: before response-direction rules are executed.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>RequestFoot</p>
         */
        @NameInMap("Position")
        public String position;

        /**
         * <p>The content of the programmable script.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>if and(match_re($uri, &quot;^/1.txt$&quot;), $arg_type) {   rewrite(concat(&quot;/1.&quot;, $arg_type), &quot;break&quot;) }</p>
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
