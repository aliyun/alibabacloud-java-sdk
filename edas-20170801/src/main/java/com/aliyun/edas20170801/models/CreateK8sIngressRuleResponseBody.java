// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class CreateK8sIngressRuleResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("ChangeOrderIds")
    public java.util.List<CreateK8sIngressRuleResponseBodyChangeOrderIds> changeOrderIds;

    @NameInMap("Code")
    public Integer code;

    public static CreateK8sIngressRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateK8sIngressRuleResponseBody self = new CreateK8sIngressRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateK8sIngressRuleResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateK8sIngressRuleResponseBody setChangeOrderIds(java.util.List<CreateK8sIngressRuleResponseBodyChangeOrderIds> changeOrderIds) {
        this.changeOrderIds = changeOrderIds;
        return this;
    }
    public java.util.List<CreateK8sIngressRuleResponseBodyChangeOrderIds> getChangeOrderIds() {
        return this.changeOrderIds;
    }

    public CreateK8sIngressRuleResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public static class CreateK8sIngressRuleResponseBodyChangeOrderIds extends TeaModel {
        @NameInMap("ChangeOrderId")
        public String changeOrderId;

        @NameInMap("AppId")
        public String appId;

        public static CreateK8sIngressRuleResponseBodyChangeOrderIds build(java.util.Map<String, ?> map) throws Exception {
            CreateK8sIngressRuleResponseBodyChangeOrderIds self = new CreateK8sIngressRuleResponseBodyChangeOrderIds();
            return TeaModel.build(map, self);
        }

        public CreateK8sIngressRuleResponseBodyChangeOrderIds setChangeOrderId(String changeOrderId) {
            this.changeOrderId = changeOrderId;
            return this;
        }
        public String getChangeOrderId() {
            return this.changeOrderId;
        }

        public CreateK8sIngressRuleResponseBodyChangeOrderIds setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

    }

}
