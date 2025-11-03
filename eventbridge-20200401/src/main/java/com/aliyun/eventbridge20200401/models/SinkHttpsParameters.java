// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class SinkHttpsParameters extends TeaModel {
    @NameInMap("Body")
    public SinkHttpsParametersBody body;

    @NameInMap("Method")
    public String method;

    @NameInMap("NetworkType")
    public String networkType;

    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    @NameInMap("Token")
    public String token;

    @NameInMap("URL")
    public SinkHttpsParametersURL URL;

    @NameInMap("VSwitchIds")
    public String vSwitchIds;

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
        @NameInMap("Form")
        public String form;

        @NameInMap("Template")
        public String template;

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
        @NameInMap("Form")
        public String form;

        @NameInMap("Template")
        public String template;

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
