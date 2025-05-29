// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailianmodelonchip20240816.models;

import com.aliyun.tea.*;

public class UpdateQuotaResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public UpdateQuotaResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public String httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>89946BAA-E4E1-5114-8A5E-A542FEDC9B16</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public String success;

    public static UpdateQuotaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateQuotaResponseBody self = new UpdateQuotaResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateQuotaResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateQuotaResponseBody setData(UpdateQuotaResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpdateQuotaResponseBodyData getData() {
        return this.data;
    }

    public UpdateQuotaResponseBody setHttpStatusCode(String httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public UpdateQuotaResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateQuotaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateQuotaResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class UpdateQuotaResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>g6RD6uvFYNZv44ky</p>
         */
        @NameInMap("orderId")
        public String orderId;

        /**
         * <strong>example:</strong>
         * <p>2oImhCz4f8XCviiM</p>
         */
        @NameInMap("productKey")
        public String productKey;

        @NameInMap("productName")
        public String productName;

        /**
         * <strong>example:</strong>
         * <p>520539530998273</p>
         */
        @NameInMap("tenantId")
        public String tenantId;

        /**
         * <strong>example:</strong>
         * <p>123456</p>
         */
        @NameInMap("userId")
        public String userId;

        public static UpdateQuotaResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpdateQuotaResponseBodyData self = new UpdateQuotaResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpdateQuotaResponseBodyData setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }
        public String getOrderId() {
            return this.orderId;
        }

        public UpdateQuotaResponseBodyData setProductKey(String productKey) {
            this.productKey = productKey;
            return this;
        }
        public String getProductKey() {
            return this.productKey;
        }

        public UpdateQuotaResponseBodyData setProductName(String productName) {
            this.productName = productName;
            return this;
        }
        public String getProductName() {
            return this.productName;
        }

        public UpdateQuotaResponseBodyData setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public UpdateQuotaResponseBodyData setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
