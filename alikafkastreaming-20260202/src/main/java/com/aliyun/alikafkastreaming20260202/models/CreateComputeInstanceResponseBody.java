// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafkastreaming20260202.models;

import com.aliyun.tea.*;

public class CreateComputeInstanceResponseBody extends TeaModel {
    /**
     * <p>The return code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Long code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public CreateComputeInstanceResponseBodyData data;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>062D8E8B-8D47-5DCC-BB12-5A1D93C3A66B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
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
        /**
         * <p>The compute instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>alikafka_streaming-cn-pe333xxxxxx</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The order ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1234567890</p>
         */
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
