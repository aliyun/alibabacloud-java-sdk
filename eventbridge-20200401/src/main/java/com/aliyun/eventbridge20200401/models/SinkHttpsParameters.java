// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class SinkHttpsParameters extends TeaModel {
    /**
     * <p>HTTP Body</p>
     */
    @NameInMap("Body")
    public SinkHttpsParametersBody body;

    /**
     * <p>The HTTP method.</p>
     * 
     * <strong>example:</strong>
     * <p>POST</p>
     */
    @NameInMap("Method")
    public String method;

    /**
     * <p>The network type, PrivateNetwork/PublicNetwork.</p>
     * 
     * <strong>example:</strong>
     * <p>PublicNetwork</p>
     */
    @NameInMap("NetworkType")
    public String networkType;

    /**
     * <p>The security group.</p>
     * 
     * <strong>example:</strong>
     * <p>sg-a1b2c3d4e5f6g7h8i9j0</p>
     */
    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    /**
     * <p>HTTP Token</p>
     * 
     * <strong>example:</strong>
     * <p>token-****</p>
     */
    @NameInMap("Token")
    public String token;

    /**
     * <p>The HTTP/HTTPS address.</p>
     */
    @NameInMap("URL")
    public SinkHttpsParametersURL URL;

    /**
     * <p>The vSwitch IDs.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-a1b2c3d4e5f6g7h8i9j0k</p>
     */
    @NameInMap("VSwitchIds")
    public String vSwitchIds;

    /**
     * <p>vpc ID</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-a1b2c3d4e5f6g7h8i9j0k</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    public static SinkHttpsParameters build(java.util.Map<String, ?> map) throws Exception {
        SinkHttpsParameters self = new SinkHttpsParameters();
        return TeaModel.build(map, self);
    }

    public SinkHttpsParameters setBody(SinkHttpsParametersBody body) {
        this.body = body;
        return this;
    }
    public SinkHttpsParametersBody getBody() {
        return this.body;
    }

    public SinkHttpsParameters setMethod(String method) {
        this.method = method;
        return this;
    }
    public String getMethod() {
        return this.method;
    }

    public SinkHttpsParameters setNetworkType(String networkType) {
        this.networkType = networkType;
        return this;
    }
    public String getNetworkType() {
        return this.networkType;
    }

    public SinkHttpsParameters setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public SinkHttpsParameters setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

    public SinkHttpsParameters setURL(SinkHttpsParametersURL URL) {
        this.URL = URL;
        return this;
    }
    public SinkHttpsParametersURL getURL() {
        return this.URL;
    }

    public SinkHttpsParameters setVSwitchIds(String vSwitchIds) {
        this.vSwitchIds = vSwitchIds;
        return this;
    }
    public String getVSwitchIds() {
        return this.vSwitchIds;
    }

    public SinkHttpsParameters setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public static class SinkHttpsParametersBody extends TeaModel {
        /**
         * <p>Form</p>
         * 
         * <strong>example:</strong>
         * <p>TEMPLATE</p>
         */
        @NameInMap("Form")
        public String form;

        /**
         * <p>Template</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;message&quot;:&quot;${message}&quot;}</p>
         */
        @NameInMap("Template")
        public String template;

        /**
         * <p>Value</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;message&quot;:&quot;$.data.message&quot;}</p>
         */
        @NameInMap("Value")
        public String value;

        public static SinkHttpsParametersBody build(java.util.Map<String, ?> map) throws Exception {
            SinkHttpsParametersBody self = new SinkHttpsParametersBody();
            return TeaModel.build(map, self);
        }

        public SinkHttpsParametersBody setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public SinkHttpsParametersBody setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public SinkHttpsParametersBody setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class SinkHttpsParametersURL extends TeaModel {
        /**
         * <p>Form</p>
         * 
         * <strong>example:</strong>
         * <p>CONSTANT</p>
         */
        @NameInMap("Form")
        public String form;

        /**
         * <p>Template</p>
         * 
         * <strong>example:</strong>
         * <p>https://${host}/events</p>
         */
        @NameInMap("Template")
        public String template;

        /**
         * <p>Value</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://example.com/events">https://example.com/events</a></p>
         */
        @NameInMap("Value")
        public String value;

        public static SinkHttpsParametersURL build(java.util.Map<String, ?> map) throws Exception {
            SinkHttpsParametersURL self = new SinkHttpsParametersURL();
            return TeaModel.build(map, self);
        }

        public SinkHttpsParametersURL setForm(String form) {
            this.form = form;
            return this;
        }
        public String getForm() {
            return this.form;
        }

        public SinkHttpsParametersURL setTemplate(String template) {
            this.template = template;
            return this;
        }
        public String getTemplate() {
            return this.template;
        }

        public SinkHttpsParametersURL setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
