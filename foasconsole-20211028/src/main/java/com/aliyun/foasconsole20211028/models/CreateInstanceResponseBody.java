// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foasconsole20211028.models;

import com.aliyun.tea.*;

public class CreateInstanceResponseBody extends TeaModel {
    // 订单信息
    @NameInMap("OrderInfo")
    public CreateInstanceResponseBodyOrderInfo orderInfo;

    // 请求id
    @NameInMap("RequestId")
    public String requestId;

    // 是否成功
    @NameInMap("Success")
    public Boolean success;

    public static CreateInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateInstanceResponseBody self = new CreateInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateInstanceResponseBody setOrderInfo(CreateInstanceResponseBodyOrderInfo orderInfo) {
        this.orderInfo = orderInfo;
        return this;
    }
    public CreateInstanceResponseBodyOrderInfo getOrderInfo() {
        return this.orderInfo;
    }

    public CreateInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateInstanceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateInstanceResponseBodyOrderInfo extends TeaModel {
        // 实例id
        @NameInMap("InstanceId")
        public String instanceId;

        // 订单id
        @NameInMap("OrderId")
        public Long orderId;

        public static CreateInstanceResponseBodyOrderInfo build(java.util.Map<String, ?> map) throws Exception {
            CreateInstanceResponseBodyOrderInfo self = new CreateInstanceResponseBodyOrderInfo();
            return TeaModel.build(map, self);
        }

        public CreateInstanceResponseBodyOrderInfo setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public CreateInstanceResponseBodyOrderInfo setOrderId(Long orderId) {
            this.orderId = orderId;
            return this;
        }
        public Long getOrderId() {
            return this.orderId;
        }

    }

}
