// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailianmodelonchip20240816.models;

import com.aliyun.tea.*;

public class QueryProductPageResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public QueryProductPageResponseBodyData data;

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
     * <p>EA4643D5-5FA8-55BA-A959-F7D3E38E0AE0</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public String success;

    public static QueryProductPageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryProductPageResponseBody self = new QueryProductPageResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryProductPageResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryProductPageResponseBody setData(QueryProductPageResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryProductPageResponseBodyData getData() {
        return this.data;
    }

    public QueryProductPageResponseBody setHttpStatusCode(String httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public QueryProductPageResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryProductPageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryProductPageResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class QueryProductPageResponseBodyDataData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("activeLicenseCount")
        public Long activeLicenseCount;

        /**
         * <strong>example:</strong>
         * <p>zcrzbqrF29pkgXukLaQ+6jGsohQiPhdOuIrUSVSvNO5oDntQdM76mNXj+AJ2i7eP</p>
         */
        @NameInMap("apiKey")
        public String apiKey;

        /**
         * <strong>example:</strong>
         * <p>2024-03-05 06:24:27</p>
         */
        @NameInMap("createTime")
        public String createTime;

        @NameInMap("description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("licenseCount")
        public Long licenseCount;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("maxQps")
        public Integer maxQps;

        /**
         * <strong>example:</strong>
         * <p>nnjNQQv3ZjyYE7H4</p>
         */
        @NameInMap("productKey")
        public String productKey;

        @NameInMap("productName")
        public String productName;

        /**
         * <strong>example:</strong>
         * <p>3dc95cac8272b86a5d10de7768d8fc41</p>
         */
        @NameInMap("productSecret")
        public String productSecret;

        /**
         * <strong>example:</strong>
         * <p>383756559581697</p>
         */
        @NameInMap("tenantId")
        public String tenantId;

        /**
         * <strong>example:</strong>
         * <p>100000</p>
         */
        @NameInMap("tokenCount")
        public Long tokenCount;

        /**
         * <strong>example:</strong>
         * <p>2024-03-05 06:24:27</p>
         */
        @NameInMap("updateTime")
        public String updateTime;

        /**
         * <strong>example:</strong>
         * <p>10000</p>
         */
        @NameInMap("usedToken")
        public Long usedToken;

        /**
         * <strong>example:</strong>
         * <p>359687</p>
         */
        @NameInMap("userId")
        public String userId;

        public static QueryProductPageResponseBodyDataData build(java.util.Map<String, ?> map) throws Exception {
            QueryProductPageResponseBodyDataData self = new QueryProductPageResponseBodyDataData();
            return TeaModel.build(map, self);
        }

        public QueryProductPageResponseBodyDataData setActiveLicenseCount(Long activeLicenseCount) {
            this.activeLicenseCount = activeLicenseCount;
            return this;
        }
        public Long getActiveLicenseCount() {
            return this.activeLicenseCount;
        }

        public QueryProductPageResponseBodyDataData setApiKey(String apiKey) {
            this.apiKey = apiKey;
            return this;
        }
        public String getApiKey() {
            return this.apiKey;
        }

        public QueryProductPageResponseBodyDataData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public QueryProductPageResponseBodyDataData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QueryProductPageResponseBodyDataData setLicenseCount(Long licenseCount) {
            this.licenseCount = licenseCount;
            return this;
        }
        public Long getLicenseCount() {
            return this.licenseCount;
        }

        public QueryProductPageResponseBodyDataData setMaxQps(Integer maxQps) {
            this.maxQps = maxQps;
            return this;
        }
        public Integer getMaxQps() {
            return this.maxQps;
        }

        public QueryProductPageResponseBodyDataData setProductKey(String productKey) {
            this.productKey = productKey;
            return this;
        }
        public String getProductKey() {
            return this.productKey;
        }

        public QueryProductPageResponseBodyDataData setProductName(String productName) {
            this.productName = productName;
            return this;
        }
        public String getProductName() {
            return this.productName;
        }

        public QueryProductPageResponseBodyDataData setProductSecret(String productSecret) {
            this.productSecret = productSecret;
            return this;
        }
        public String getProductSecret() {
            return this.productSecret;
        }

        public QueryProductPageResponseBodyDataData setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public QueryProductPageResponseBodyDataData setTokenCount(Long tokenCount) {
            this.tokenCount = tokenCount;
            return this;
        }
        public Long getTokenCount() {
            return this.tokenCount;
        }

        public QueryProductPageResponseBodyDataData setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public QueryProductPageResponseBodyDataData setUsedToken(Long usedToken) {
            this.usedToken = usedToken;
            return this;
        }
        public Long getUsedToken() {
            return this.usedToken;
        }

        public QueryProductPageResponseBodyDataData setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class QueryProductPageResponseBodyData extends TeaModel {
        @NameInMap("data")
        public java.util.List<QueryProductPageResponseBodyDataData> data;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("pageIndex")
        public Integer pageIndex;

        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("pageSize")
        public Integer pageSize;

        /**
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("total")
        public Long total;

        public static QueryProductPageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryProductPageResponseBodyData self = new QueryProductPageResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryProductPageResponseBodyData setData(java.util.List<QueryProductPageResponseBodyDataData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<QueryProductPageResponseBodyDataData> getData() {
            return this.data;
        }

        public QueryProductPageResponseBodyData setPageIndex(Integer pageIndex) {
            this.pageIndex = pageIndex;
            return this;
        }
        public Integer getPageIndex() {
            return this.pageIndex;
        }

        public QueryProductPageResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryProductPageResponseBodyData setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

}
