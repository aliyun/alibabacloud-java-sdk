// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class UpdateK8sIngressRuleResponseBody extends TeaModel {
    @NameInMap("Message")
    public String message;

    @NameInMap("ChangeOrderIds")
    public java.util.List<UpdateK8sIngressRuleResponseBodyChangeOrderIds> changeOrderIds;

    @NameInMap("Code")
    public Integer code;

    public static UpdateK8sIngressRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateK8sIngressRuleResponseBody self = new UpdateK8sIngressRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateK8sIngressRuleResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateK8sIngressRuleResponseBody setChangeOrderIds(java.util.List<UpdateK8sIngressRuleResponseBodyChangeOrderIds> changeOrderIds) {
        this.changeOrderIds = changeOrderIds;
        return this;
    }
    public java.util.List<UpdateK8sIngressRuleResponseBodyChangeOrderIds> getChangeOrderIds() {
        return this.changeOrderIds;
    }

    public UpdateK8sIngressRuleResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public static class UpdateK8sIngressRuleResponseBodyChangeOrderIds extends TeaModel {
        @NameInMap("ChangeOrderId")
        public String changeOrderId;

        @NameInMap("AppId")
        public String appId;

        public static UpdateK8sIngressRuleResponseBodyChangeOrderIds build(java.util.Map<String, ?> map) throws Exception {
            UpdateK8sIngressRuleResponseBodyChangeOrderIds self = new UpdateK8sIngressRuleResponseBodyChangeOrderIds();
            return TeaModel.build(map, self);
        }

        public UpdateK8sIngressRuleResponseBodyChangeOrderIds setChangeOrderId(String changeOrderId) {
            this.changeOrderId = changeOrderId;
            return this;
        }
        public String getChangeOrderId() {
            return this.changeOrderId;
        }

        public UpdateK8sIngressRuleResponseBodyChangeOrderIds setAppId(String appId) {
            this.appId = appId;
            return this;
        }
        public String getAppId() {
            return this.appId;
        }

    }

}
