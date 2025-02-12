// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class CreatePostPayInstanceResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    @NameInMap("Data")
    public CreatePostPayInstanceResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>operation success.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>ABA4A7FD-E10F-45C7-9774-A5236015A***</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CreatePostPayInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreatePostPayInstanceResponseBody self = new CreatePostPayInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public CreatePostPayInstanceResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public CreatePostPayInstanceResponseBody setData(CreatePostPayInstanceResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreatePostPayInstanceResponseBodyData getData() {
        return this.data;
    }

    public CreatePostPayInstanceResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreatePostPayInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreatePostPayInstanceResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreatePostPayInstanceResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>alikafka_pre-cn-pe333xxxxxx</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <strong>example:</strong>
         * <p>236972661580636</p>
         */
        @NameInMap("OrderId")
        public Long orderId;

        public static CreatePostPayInstanceResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreatePostPayInstanceResponseBodyData self = new CreatePostPayInstanceResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreatePostPayInstanceResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public CreatePostPayInstanceResponseBodyData setOrderId(Long orderId) {
            this.orderId = orderId;
            return this;
        }
        public Long getOrderId() {
            return this.orderId;
        }

    }

}
