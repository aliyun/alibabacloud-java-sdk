// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailianmodelonchip20240816.models;

import com.aliyun.tea.*;

public class UpdateImageQuotaResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public UpdateImageQuotaResponseBodyData data;

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
     * <p>28BD530A-C469-5CF9-9F4E-DA0AF0A1AC73</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public String success;

    public static UpdateImageQuotaResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateImageQuotaResponseBody self = new UpdateImageQuotaResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateImageQuotaResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public UpdateImageQuotaResponseBody setData(UpdateImageQuotaResponseBodyData data) {
        this.data = data;
        return this;
    }
    public UpdateImageQuotaResponseBodyData getData() {
        return this.data;
    }

    public UpdateImageQuotaResponseBody setHttpStatusCode(String httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public UpdateImageQuotaResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateImageQuotaResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateImageQuotaResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class UpdateImageQuotaResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>FlUHDd8ol1yRmA92</p>
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

        public static UpdateImageQuotaResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            UpdateImageQuotaResponseBodyData self = new UpdateImageQuotaResponseBodyData();
            return TeaModel.build(map, self);
        }

        public UpdateImageQuotaResponseBodyData setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }
        public String getOrderId() {
            return this.orderId;
        }

        public UpdateImageQuotaResponseBodyData setProductKey(String productKey) {
            this.productKey = productKey;
            return this;
        }
        public String getProductKey() {
            return this.productKey;
        }

        public UpdateImageQuotaResponseBodyData setProductName(String productName) {
            this.productName = productName;
            return this;
        }
        public String getProductName() {
            return this.productName;
        }

        public UpdateImageQuotaResponseBodyData setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public UpdateImageQuotaResponseBodyData setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
