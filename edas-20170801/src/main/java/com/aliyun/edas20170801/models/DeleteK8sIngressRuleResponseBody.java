// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class DeleteK8sIngressRuleResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("ChangeOrderIds")
    public java.util.List<DeleteK8sIngressRuleResponseBodyChangeOrderIds> changeOrderIds;

    @NameInMap("Code")
    public Integer code;

    public static DeleteK8sIngressRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteK8sIngressRuleResponseBody self = new DeleteK8sIngressRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteK8sIngressRuleResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteK8sIngressRuleResponseBody setChangeOrderIds(java.util.List<DeleteK8sIngressRuleResponseBodyChangeOrderIds> changeOrderIds) {
        this.changeOrderIds = changeOrderIds;
        return this;
    }
    public java.util.List<DeleteK8sIngressRuleResponseBodyChangeOrderIds> getChangeOrderIds() {
        return this.changeOrderIds;
    }

    public DeleteK8sIngressRuleResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public static class DeleteK8sIngressRuleResponseBodyChangeOrderIds extends TeaModel {
        @NameInMap("ChangeOrderId")
        public String changeOrderId;

        @NameInMap("AppId")
        public String appId;

        public static DeleteK8sIngressRuleResponseBodyChangeOrderIds build(java.util.Map<String, ?> map) throws Exception {
            DeleteK8sIngressRuleResponseBodyChangeOrderIds self = new DeleteK8sIngressRuleResponseBodyChangeOrderIds();
            return TeaModel.build(map, self);
        }

        public DeleteK8sIngressRuleResponseBodyChangeOrderIds setChangeOrderId(String changeOrderId) {
            this.changeOrderId = changeOrderId;
            return this;
        }
        public String getChangeOrderId() {
            return this.changeOrderId;
        }

        public DeleteK8sIngressRuleResponseBodyChangeOrderIds setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

    }

}
