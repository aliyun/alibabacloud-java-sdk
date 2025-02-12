// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class CreatePrePayInstanceResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public CreatePrePayInstanceResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>operation success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>E57A8862-DF68-4055-8E55-B80CB4****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CreatePrePayInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreatePrePayInstanceResponseBody self = new CreatePrePayInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreatePrePayInstanceResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public CreatePrePayInstanceResponseBody setData(CreatePrePayInstanceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreatePrePayInstanceResponseBodyData getData() {
        return this.data;
    }

    public CreatePrePayInstanceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreatePrePayInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreatePrePayInstanceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreatePrePayInstanceResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>alikafka_post-cn-xxxxxx</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <strong>example:</strong>
         * <p>236972661xxxx</p>
         */
        @NameInMap("OrderId")
        public Long orderId;

        public static CreatePrePayInstanceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreatePrePayInstanceResponseBodyData self = new CreatePrePayInstanceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreatePrePayInstanceResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public CreatePrePayInstanceResponseBodyData setOrderId(Long orderId) {
            this.orderId = orderId;
            return this;
        }
        public Long getOrderId() {
            return this.orderId;
        }

    }

}
