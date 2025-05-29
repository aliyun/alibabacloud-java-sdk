// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailianmodelonchip20240816.models;

import com.aliyun.tea.*;

public class QueryTokenUsageResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public java.util.List<QueryTokenUsageResponseBodyData> data;

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
     * <p>B08AAA14-AD93-51F6-82AE-82AFAE9375B6</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public String success;

    public static QueryTokenUsageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryTokenUsageResponseBody self = new QueryTokenUsageResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryTokenUsageResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryTokenUsageResponseBody setData(java.util.List<QueryTokenUsageResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryTokenUsageResponseBodyData> getData() {
        return this.data;
    }

    public QueryTokenUsageResponseBody setHttpStatusCode(String httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public QueryTokenUsageResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryTokenUsageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryTokenUsageResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class QueryTokenUsageResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>oqYVtK7DnaVj4JpbFtghJV2CZy7HwhOI0do3mf8twx9TGCMNNXYBptJ0+ULqO3xD</p>
         */
        @NameInMap("apiKey")
        public String apiKey;

        /**
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("inputToken")
        public Long inputToken;

        /**
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("outputToken")
        public Long outputToken;

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
         * <p>2025-04-01</p>
         */
        @NameInMap("usageTime")
        public String usageTime;

        public static QueryTokenUsageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryTokenUsageResponseBodyData self = new QueryTokenUsageResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryTokenUsageResponseBodyData setApiKey(String apiKey) {
            this.apiKey = apiKey;
            return this;
        }
        public String getApiKey() {
            return this.apiKey;
        }

        public QueryTokenUsageResponseBodyData setInputToken(Long inputToken) {
            this.inputToken = inputToken;
            return this;
        }
        public Long getInputToken() {
            return this.inputToken;
        }

        public QueryTokenUsageResponseBodyData setOutputToken(Long outputToken) {
            this.outputToken = outputToken;
            return this;
        }
        public Long getOutputToken() {
            return this.outputToken;
        }

        public QueryTokenUsageResponseBodyData setProductKey(String productKey) {
            this.productKey = productKey;
            return this;
        }
        public String getProductKey() {
            return this.productKey;
        }

        public QueryTokenUsageResponseBodyData setProductName(String productName) {
            this.productName = productName;
            return this;
        }
        public String getProductName() {
            return this.productName;
        }

        public QueryTokenUsageResponseBodyData setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public QueryTokenUsageResponseBodyData setUsageTime(String usageTime) {
            this.usageTime = usageTime;
            return this;
        }
        public String getUsageTime() {
            return this.usageTime;
        }

    }

}
