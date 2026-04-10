// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dianjin20240628.models;

import com.aliyun.tea.*;

public class QueryRedemptionRecordsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("code")
    public String code;

    @NameInMap("data")
    public QueryRedemptionRecordsResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("retryAble")
    public Boolean retryAble;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static QueryRedemptionRecordsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryRedemptionRecordsResponseBody self = new QueryRedemptionRecordsResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryRedemptionRecordsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryRedemptionRecordsResponseBody setData(QueryRedemptionRecordsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryRedemptionRecordsResponseBodyData getData() {
        return this.data;
    }

    public QueryRedemptionRecordsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryRedemptionRecordsResponseBody setRetryAble(Boolean retryAble) {
        this.retryAble = retryAble;
        return this;
    }
    public Boolean getRetryAble() {
        return this.retryAble;
    }

    public QueryRedemptionRecordsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryRedemptionRecordsResponseBodyDataItems extends TeaModel {
        @NameInMap("allowedModels")
        public java.util.List<String> allowedModels;

        /**
         * <strong>example:</strong>
         * <p>2024-01-01T00:00:00Z</p>
         */
        @NameInMap("effectiveAt")
        public String effectiveAt;

        /**
         * <strong>example:</strong>
         * <p>2024-01-31T23:59:59Z</p>
         */
        @NameInMap("expireAt")
        public String expireAt;

        /**
         * <strong>example:</strong>
         * <p>2024-01-01T00:00:00Z</p>
         */
        @NameInMap("gmtCreate")
        public String gmtCreate;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("id")
        public Long id;

        /**
         * <strong>example:</strong>
         * <p>a1b2c3d4e5f6...</p>
         */
        @NameInMap("keyHash")
        public String keyHash;

        /**
         * <strong>example:</strong>
         * <p>AR123233333</p>
         */
        @NameInMap("outBizNo")
        public String outBizNo;

        /**
         * <strong>example:</strong>
         * <p>500</p>
         */
        @NameInMap("quotaBalance")
        public Long quotaBalance;

        /**
         * <strong>example:</strong>
         * <p>AVAILABLE</p>
         */
        @NameInMap("quotaStatus")
        public String quotaStatus;

        /**
         * <strong>example:</strong>
         * <p>ORD20240101000001</p>
         */
        @NameInMap("redemptionOrderNo")
        public String redemptionOrderNo;

        /**
         * <strong>example:</strong>
         * <p>ACTIVE</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>37624</p>
         */
        @NameInMap("templateId")
        public Long templateId;

        /**
         * <strong>example:</strong>
         * <p>10001</p>
         */
        @NameInMap("tenantId")
        public Long tenantId;

        public static QueryRedemptionRecordsResponseBodyDataItems build(java.util.Map<String, ?> map) throws Exception {
            QueryRedemptionRecordsResponseBodyDataItems self = new QueryRedemptionRecordsResponseBodyDataItems();
            return TeaModel.build(map, self);
        }

        public QueryRedemptionRecordsResponseBodyDataItems setAllowedModels(java.util.List<String> allowedModels) {
            this.allowedModels = allowedModels;
            return this;
        }
        public java.util.List<String> getAllowedModels() {
            return this.allowedModels;
        }

        public QueryRedemptionRecordsResponseBodyDataItems setEffectiveAt(String effectiveAt) {
            this.effectiveAt = effectiveAt;
            return this;
        }
        public String getEffectiveAt() {
            return this.effectiveAt;
        }

        public QueryRedemptionRecordsResponseBodyDataItems setExpireAt(String expireAt) {
            this.expireAt = expireAt;
            return this;
        }
        public String getExpireAt() {
            return this.expireAt;
        }

        public QueryRedemptionRecordsResponseBodyDataItems setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public QueryRedemptionRecordsResponseBodyDataItems setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public QueryRedemptionRecordsResponseBodyDataItems setKeyHash(String keyHash) {
            this.keyHash = keyHash;
            return this;
        }
        public String getKeyHash() {
            return this.keyHash;
        }

        public QueryRedemptionRecordsResponseBodyDataItems setOutBizNo(String outBizNo) {
            this.outBizNo = outBizNo;
            return this;
        }
        public String getOutBizNo() {
            return this.outBizNo;
        }

        public QueryRedemptionRecordsResponseBodyDataItems setQuotaBalance(Long quotaBalance) {
            this.quotaBalance = quotaBalance;
            return this;
        }
        public Long getQuotaBalance() {
            return this.quotaBalance;
        }

        public QueryRedemptionRecordsResponseBodyDataItems setQuotaStatus(String quotaStatus) {
            this.quotaStatus = quotaStatus;
            return this;
        }
        public String getQuotaStatus() {
            return this.quotaStatus;
        }

        public QueryRedemptionRecordsResponseBodyDataItems setRedemptionOrderNo(String redemptionOrderNo) {
            this.redemptionOrderNo = redemptionOrderNo;
            return this;
        }
        public String getRedemptionOrderNo() {
            return this.redemptionOrderNo;
        }

        public QueryRedemptionRecordsResponseBodyDataItems setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryRedemptionRecordsResponseBodyDataItems setTemplateId(Long templateId) {
            this.templateId = templateId;
            return this;
        }
        public Long getTemplateId() {
            return this.templateId;
        }

        public QueryRedemptionRecordsResponseBodyDataItems setTenantId(Long tenantId) {
            this.tenantId = tenantId;
            return this;
        }
        public Long getTenantId() {
            return this.tenantId;
        }

    }

    public static class QueryRedemptionRecordsResponseBodyData extends TeaModel {
        @NameInMap("items")
        public java.util.List<QueryRedemptionRecordsResponseBodyDataItems> items;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("page")
        public Integer page;

        /**
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("pageSize")
        public Integer pageSize;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("total")
        public Long total;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("totalPages")
        public Integer totalPages;

        public static QueryRedemptionRecordsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryRedemptionRecordsResponseBodyData self = new QueryRedemptionRecordsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryRedemptionRecordsResponseBodyData setItems(java.util.List<QueryRedemptionRecordsResponseBodyDataItems> items) {
            this.items = items;
            return this;
        }
        public java.util.List<QueryRedemptionRecordsResponseBodyDataItems> getItems() {
            return this.items;
        }

        public QueryRedemptionRecordsResponseBodyData setPage(Integer page) {
            this.page = page;
            return this;
        }
        public Integer getPage() {
            return this.page;
        }

        public QueryRedemptionRecordsResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public QueryRedemptionRecordsResponseBodyData setTotal(Long total) {
            this.total = total;
            return this;
        }
        public Long getTotal() {
            return this.total;
        }

        public QueryRedemptionRecordsResponseBodyData setTotalPages(Integer totalPages) {
            this.totalPages = totalPages;
            return this;
        }
        public Integer getTotalPages() {
            return this.totalPages;
        }

    }

}
