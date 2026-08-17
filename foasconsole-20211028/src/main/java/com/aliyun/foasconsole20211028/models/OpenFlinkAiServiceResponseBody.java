// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foasconsole20211028.models;

import com.aliyun.tea.*;

public class OpenFlinkAiServiceResponseBody extends TeaModel {
    /**
     * <p>The order information.</p>
     */
    @NameInMap("OrderInfo")
    public OpenFlinkAiServiceResponseBodyOrderInfo orderInfo;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>67F33190-946B-1105-B6A1-E2DF0426DD51</p>
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

    public static OpenFlinkAiServiceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        OpenFlinkAiServiceResponseBody self = new OpenFlinkAiServiceResponseBody();
        return TeaModel.build(map, self);
    }

    public OpenFlinkAiServiceResponseBody setOrderInfo(OpenFlinkAiServiceResponseBodyOrderInfo orderInfo) {
        this.orderInfo = orderInfo;
        return this;
    }
    public OpenFlinkAiServiceResponseBodyOrderInfo getOrderInfo() {
        return this.orderInfo;
    }

    public OpenFlinkAiServiceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public OpenFlinkAiServiceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class OpenFlinkAiServiceResponseBodyOrderInfo extends TeaModel {
        /**
         * <p>The instance ID.</p>
         * 
         * <strong>example:</strong>
         * <p>f-cn-zvp2q*****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The order ID.</p>
         * 
         * <strong>example:</strong>
         * <p>2104063546****</p>
         */
        @NameInMap("OrderId")
        public Long orderId;

        public static OpenFlinkAiServiceResponseBodyOrderInfo build(java.util.Map<String, ?> map) throws Exception {
            OpenFlinkAiServiceResponseBodyOrderInfo self = new OpenFlinkAiServiceResponseBodyOrderInfo();
            return TeaModel.build(map, self);
        }

        public OpenFlinkAiServiceResponseBodyOrderInfo setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public OpenFlinkAiServiceResponseBodyOrderInfo setOrderId(Long orderId) {
            this.orderId = orderId;
            return this;
        }
        public Long getOrderId() {
            return this.orderId;
        }

    }

}
