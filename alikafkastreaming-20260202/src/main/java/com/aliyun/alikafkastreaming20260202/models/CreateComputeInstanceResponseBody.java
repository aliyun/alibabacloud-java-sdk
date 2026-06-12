// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafkastreaming20260202.models;

import com.aliyun.tea.*;

public class CreateComputeInstanceResponseBody extends TeaModel {
    @NameInMap("Code")
    public Long code;

    @NameInMap("Data")
    public CreateComputeInstanceResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static CreateComputeInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateComputeInstanceResponseBody self = new CreateComputeInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateComputeInstanceResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public CreateComputeInstanceResponseBody setData(CreateComputeInstanceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateComputeInstanceResponseBodyData getData() {
        return this.data;
    }

    public CreateComputeInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateComputeInstanceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateComputeInstanceResponseBodyData extends TeaModel {
        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("OrderId")
        public String orderId;

        public static CreateComputeInstanceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateComputeInstanceResponseBodyData self = new CreateComputeInstanceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateComputeInstanceResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public CreateComputeInstanceResponseBodyData setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }
        public String getOrderId() {
            return this.orderId;
        }

    }

}
