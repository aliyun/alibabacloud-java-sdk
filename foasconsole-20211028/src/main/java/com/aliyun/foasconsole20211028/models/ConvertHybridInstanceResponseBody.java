// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.foasconsole20211028.models;

import com.aliyun.tea.*;

public class ConvertHybridInstanceResponseBody extends TeaModel {
    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>000000</p>
     */
    @NameInMap("ErrCode")
    public String errCode;

    /**
     * <p>The order information.</p>
     */
    @NameInMap("OrderInfo")
    public ConvertHybridInstanceResponseBodyOrderInfo orderInfo;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>67F33190-946B-1105-B6A1-E2DF042*****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ConvertHybridInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ConvertHybridInstanceResponseBody self = new ConvertHybridInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public ConvertHybridInstanceResponseBody setErrCode(String errCode) {
        this.errCode = errCode;
        return this;
    }
    public String getErrCode() {
        return this.errCode;
    }

    public ConvertHybridInstanceResponseBody setOrderInfo(ConvertHybridInstanceResponseBodyOrderInfo orderInfo) {
        this.orderInfo = orderInfo;
        return this;
    }
    public ConvertHybridInstanceResponseBodyOrderInfo getOrderInfo() {
        return this.orderInfo;
    }

    public ConvertHybridInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ConvertHybridInstanceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ConvertHybridInstanceResponseBodyOrderInfo extends TeaModel {
        /**
         * <p>The instance ID of the pay-as-you-go portion of hybrid billing.</p>
         * 
         * <strong>example:</strong>
         * <p>f-cn-asd***</p>
         */
        @NameInMap("ElasticInstanceId")
        public String elasticInstanceId;

        /**
         * <p>The instance ID of the subscription portion of hybrid billing.</p>
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

        public static ConvertHybridInstanceResponseBodyOrderInfo build(java.util.Map<String, ?> map) throws Exception {
            ConvertHybridInstanceResponseBodyOrderInfo self = new ConvertHybridInstanceResponseBodyOrderInfo();
            return TeaModel.build(map, self);
        }

        public ConvertHybridInstanceResponseBodyOrderInfo setElasticInstanceId(String elasticInstanceId) {
            this.elasticInstanceId = elasticInstanceId;
            return this;
        }
        public String getElasticInstanceId() {
            return this.elasticInstanceId;
        }

        public ConvertHybridInstanceResponseBodyOrderInfo setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ConvertHybridInstanceResponseBodyOrderInfo setOrderId(Long orderId) {
            this.orderId = orderId;
            return this;
        }
        public Long getOrderId() {
            return this.orderId;
        }

    }

}
