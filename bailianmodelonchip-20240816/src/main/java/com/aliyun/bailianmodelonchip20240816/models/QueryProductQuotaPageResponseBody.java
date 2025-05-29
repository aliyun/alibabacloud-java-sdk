// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailianmodelonchip20240816.models;

import com.aliyun.tea.*;

public class QueryProductQuotaPageResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public QueryProductQuotaPageResponseBodyData data;

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
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>32B81CD6-D583-5056-A6EB-3C1107AB26C3</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public String success;

    public static QueryProductQuotaPageResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryProductQuotaPageResponseBody self = new QueryProductQuotaPageResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryProductQuotaPageResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryProductQuotaPageResponseBody setData(QueryProductQuotaPageResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryProductQuotaPageResponseBodyData getData() {
        return this.data;
    }

    public QueryProductQuotaPageResponseBody setHttpStatusCode(String httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public String getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public QueryProductQuotaPageResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryProductQuotaPageResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryProductQuotaPageResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public static class QueryProductQuotaPageResponseBodyDataData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2025-03-23 02:02:03</p>
         */
        @NameInMap("createTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("duration")
        public Integer duration;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("durationType")
        public Integer durationType;

        /**
         * <strong>example:</strong>
         * <p>2025-05-31 00:00:00</p>
         */
        @NameInMap("expireTime")
        public String expireTime;

        /**
         * <p>ID。</p>
         * 
         * <strong>example:</strong>
         * <p>67241348</p>
         */
        @NameInMap("id")
        public Long id;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ifUnsubscribe")
        public Integer ifUnsubscribe;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ifUsed")
        public Integer ifUsed;

        /**
         * <strong>example:</strong>
         * <p>100</p>
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
         * <p>1</p>
         */
        @NameInMap("purchaseModel")
        public Integer purchaseModel;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("purchaseType")
        public Integer purchaseType;

        /**
         * <strong>example:</strong>
         * <p>100.0</p>
         */
        @NameInMap("settlementFee")
        public Double settlementFee;

        /**
         * <strong>example:</strong>
         * <p>217037888563265</p>
         */
        @NameInMap("tenantId")
        public String tenantId;

        /**
         * <strong>example:</strong>
         * <p>10000</p>
         */
        @NameInMap("tokenNumber")
        public Long tokenNumber;

        /**
         * <strong>example:</strong>
         * <p>1.0</p>
         */
        @NameInMap("unitPrice")
        public Double unitPrice;

        /**
         * <strong>example:</strong>
         * <p>2025-03-23 02:02:03</p>
         */
        @NameInMap("updateTime")
        public String updateTime;

        /**
         * <strong>example:</strong>
         * <p>123456</p>
         */
        @NameInMap("userId")
        public String userId;

        public static QueryProductQuotaPageResponseBodyDataData build(java.util.Map<String, ?> map) throws Exception {
            QueryProductQuotaPageResponseBodyDataData self = new QueryProductQuotaPageResponseBodyDataData();
            return TeaModel.build(map, self);
        }

        public QueryProductQuotaPageResponseBodyDataData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public QueryProductQuotaPageResponseBodyDataData setDuration(Integer duration) {
            this.duration = duration;
            return this;
        }
        public Integer getDuration() {
            return this.duration;
        }

        public QueryProductQuotaPageResponseBodyDataData setDurationType(Integer durationType) {
            this.durationType = durationType;
            return this;
        }
        public Integer getDurationType() {
            return this.durationType;
        }

        public QueryProductQuotaPageResponseBodyDataData setExpireTime(String expireTime) {
            this.expireTime = expireTime;
            return this;
        }
        public String getExpireTime() {
            return this.expireTime;
        }

        public QueryProductQuotaPageResponseBodyDataData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryProductQuotaPageResponseBodyDataData setIfUnsubscribe(Integer ifUnsubscribe) {
            this.ifUnsubscribe = ifUnsubscribe;
            return this;
        }
        public Integer getIfUnsubscribe() {
            return this.ifUnsubscribe;
        }

        public QueryProductQuotaPageResponseBodyDataData setIfUsed(Integer ifUsed) {
            this.ifUsed = ifUsed;
            return this;
        }
        public Integer getIfUsed() {
            return this.ifUsed;
        }

        public QueryProductQuotaPageResponseBodyDataData setLicenseCount(Long licenseCount) {
            this.licenseCount = licenseCount;
            return this;
        }
        public Long getLicenseCount() {
            return this.licenseCount;
        }

        public QueryProductQuotaPageResponseBodyDataData setMaxQps(Integer maxQps) {
            this.maxQps = maxQps;
            return this;
        }
        public Integer getMaxQps() {
            return this.maxQps;
        }

        public QueryProductQuotaPageResponseBodyDataData setOrderId(String orderId) {
            this.orderId = orderId;
            return this;
        }
        public String getOrderId() {
            return this.orderId;
        }

        public QueryProductQuotaPageResponseBodyDataData setProductKey(String productKey) {
            this.productKey = productKey;
            return this;
        }
        public String getProductKey() {
            return this.productKey;
        }

        public QueryProductQuotaPageResponseBodyDataData setProductName(String productName) {
            this.productName = productName;
            return this;
        }
        public String getProductName() {
            return this.productName;
        }

        public QueryProductQuotaPageResponseBodyDataData setPurchaseModel(Integer purchaseModel) {
            this.purchaseModel = purchaseModel;
            return this;
        }
        public Integer getPurchaseModel() {
            return this.purchaseModel;
        }

        public QueryProductQuotaPageResponseBodyDataData setPurchaseType(Integer purchaseType) {
            this.purchaseType = purchaseType;
            return this;
        }
        public Integer getPurchaseType() {
            return this.purchaseType;
        }

        public QueryProductQuotaPageResponseBodyDataData setSettlementFee(Double settlementFee) {
            this.settlementFee = settlementFee;
            return this;
        }
        public Double getSettlementFee() {
            return this.settlementFee;
        }

        public QueryProductQuotaPageResponseBodyDataData setTenantId(String tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public String getTenantId() {
            return this.tenantId;
        }

        public QueryProductQuotaPageResponseBodyDataData setTokenNumber(Long tokenNumber) {
            this.tokenNumber = tokenNumber;
            return this;
        }
        public Long getTokenNumber() {
            return this.tokenNumber;
        }

        public QueryProductQuotaPageResponseBodyDataData setUnitPrice(Double unitPrice) {
            this.unitPrice = unitPrice;
            return this;
        }
        public Double getUnitPrice() {
            return this.unitPrice;
        }

        public QueryProductQuotaPageResponseBodyDataData setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public QueryProductQuotaPageResponseBodyDataData setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

    public static class QueryProductQuotaPageResponseBodyData extends TeaModel {
        @NameInMap("data")
        public java.util.List<QueryProductQuotaPageResponseBodyDataData> data;

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
         * <p>151</p>
         */
        @NameInMap("total")
        public Long total;

        public static QueryProductQuotaPageResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryProductQuotaPageResponseBodyData self = new QueryProductQuotaPageResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryProductQuotaPageResponseBodyData setData(java.util.List<QueryProductQuotaPageResponseBodyDataData> data) {
            this.data = data;
            return this;
        }
        public java.util.List<QueryProductQuotaPageResponseBodyDataData> getData() {
            return this.data;
        }

        public QueryProductQuotaPageResponseBodyData setPageIndex(Integer pageIndex) {
            this.pageIndex = pageIndex;
            return this;
        }
        public Integer getPageIndex() {
            return this.pageIndex;
        }

        public QueryProductQuotaPageResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryProductQuotaPageResponseBodyData setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

    }

}
