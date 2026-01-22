// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bssopenapi20230930.models;

import com.aliyun.tea.*;

public class QueryCostCenterShareRuleResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<QueryCostCenterShareRuleResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>{}</p>
     */
    @NameInMap("Metadata")
    public Object metadata;

    /**
     * <strong>example:</strong>
     * <p>eyJwYWdlTnVtIjoyLCJwYWdlU2l6ZSI6NH0=</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <strong>example:</strong>
     * <p>79EE7556-0CFD-44EB-9CD6-B3B526E3A85F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static QueryCostCenterShareRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryCostCenterShareRuleResponseBody self = new QueryCostCenterShareRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryCostCenterShareRuleResponseBody setData(java.util.List<QueryCostCenterShareRuleResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<QueryCostCenterShareRuleResponseBodyData> getData() {
        return this.data;
    }

    public QueryCostCenterShareRuleResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public QueryCostCenterShareRuleResponseBody setMetadata(Object metadata) {
        this.metadata = metadata;
        return this;
    }
    public Object getMetadata() {
        return this.metadata;
    }

    public QueryCostCenterShareRuleResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public QueryCostCenterShareRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryCostCenterShareRuleResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class QueryCostCenterShareRuleResponseBodyDataFromCostCenterShareRuleDetails extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>970354711219#</p>
         */
        @NameInMap("CostCenterCode")
        public String costCenterCode;

        /**
         * <strong>example:</strong>
         * <p>637127</p>
         */
        @NameInMap("CostCenterId")
        public Long costCenterId;

        @NameInMap("CostCenterName")
        public String costCenterName;

        /**
         * <strong>example:</strong>
         * <p>2025-07-16 13:49:59</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <strong>example:</strong>
         * <p>2025-07-16 13:49:59</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <strong>example:</strong>
         * <p>1529600453335198</p>
         */
        @NameInMap("OwnerAccountId")
        public Long ownerAccountId;

        /**
         * <strong>example:</strong>
         * <p>637537</p>
         */
        @NameInMap("ParentCostCenterId")
        public Long parentCostCenterId;

        /**
         * <strong>example:</strong>
         * <p>583059</p>
         */
        @NameInMap("PrevCostCenterId")
        public Long prevCostCenterId;

        /**
         * <strong>example:</strong>
         * <p>583050</p>
         */
        @NameInMap("RootCostCenterId")
        public Long rootCostCenterId;

        public static QueryCostCenterShareRuleResponseBodyDataFromCostCenterShareRuleDetails build(java.util.Map<String, ?> map) throws Exception {
            QueryCostCenterShareRuleResponseBodyDataFromCostCenterShareRuleDetails self = new QueryCostCenterShareRuleResponseBodyDataFromCostCenterShareRuleDetails();
            return TeaModel.build(map, self);
        }

        public QueryCostCenterShareRuleResponseBodyDataFromCostCenterShareRuleDetails setCostCenterCode(String costCenterCode) {
            this.costCenterCode = costCenterCode;
            return this;
        }
        public String getCostCenterCode() {
            return this.costCenterCode;
        }

        public QueryCostCenterShareRuleResponseBodyDataFromCostCenterShareRuleDetails setCostCenterId(Long costCenterId) {
            this.costCenterId = costCenterId;
            return this;
        }
        public Long getCostCenterId() {
            return this.costCenterId;
        }

        public QueryCostCenterShareRuleResponseBodyDataFromCostCenterShareRuleDetails setCostCenterName(String costCenterName) {
            this.costCenterName = costCenterName;
            return this;
        }
        public String getCostCenterName() {
            return this.costCenterName;
        }

        public QueryCostCenterShareRuleResponseBodyDataFromCostCenterShareRuleDetails setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public QueryCostCenterShareRuleResponseBodyDataFromCostCenterShareRuleDetails setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public QueryCostCenterShareRuleResponseBodyDataFromCostCenterShareRuleDetails setOwnerAccountId(Long ownerAccountId) {
            this.ownerAccountId = ownerAccountId;
            return this;
        }
        public Long getOwnerAccountId() {
            return this.ownerAccountId;
        }

        public QueryCostCenterShareRuleResponseBodyDataFromCostCenterShareRuleDetails setParentCostCenterId(Long parentCostCenterId) {
            this.parentCostCenterId = parentCostCenterId;
            return this;
        }
        public Long getParentCostCenterId() {
            return this.parentCostCenterId;
        }

        public QueryCostCenterShareRuleResponseBodyDataFromCostCenterShareRuleDetails setPrevCostCenterId(Long prevCostCenterId) {
            this.prevCostCenterId = prevCostCenterId;
            return this;
        }
        public Long getPrevCostCenterId() {
            return this.prevCostCenterId;
        }

        public QueryCostCenterShareRuleResponseBodyDataFromCostCenterShareRuleDetails setRootCostCenterId(Long rootCostCenterId) {
            this.rootCostCenterId = rootCostCenterId;
            return this;
        }
        public Long getRootCostCenterId() {
            return this.rootCostCenterId;
        }

    }

    public static class QueryCostCenterShareRuleResponseBodyDataToCostCenterShareRuleDetails extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>970354711215#</p>
         */
        @NameInMap("CostCenterCode")
        public String costCenterCode;

        /**
         * <strong>example:</strong>
         * <p>637127</p>
         */
        @NameInMap("CostCenterId")
        public Long costCenterId;

        @NameInMap("CostCenterName")
        public String costCenterName;

        /**
         * <strong>example:</strong>
         * <p>2025-07-16 13:49:59</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <strong>example:</strong>
         * <p>2025-07-16 13:49:59</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <strong>example:</strong>
         * <p>1529600453335198</p>
         */
        @NameInMap("OwnerAccountId")
        public Long ownerAccountId;

        /**
         * <strong>example:</strong>
         * <p>637537</p>
         */
        @NameInMap("ParentCostCenterId")
        public Long parentCostCenterId;

        /**
         * <strong>example:</strong>
         * <p>583055</p>
         */
        @NameInMap("PrevCostCenterId")
        public Long prevCostCenterId;

        /**
         * <strong>example:</strong>
         * <p>583050</p>
         */
        @NameInMap("RootCostCenterId")
        public Long rootCostCenterId;

        /**
         * <strong>example:</strong>
         * <p>0.2</p>
         */
        @NameInMap("ShareRatio")
        public Double shareRatio;

        public static QueryCostCenterShareRuleResponseBodyDataToCostCenterShareRuleDetails build(java.util.Map<String, ?> map) throws Exception {
            QueryCostCenterShareRuleResponseBodyDataToCostCenterShareRuleDetails self = new QueryCostCenterShareRuleResponseBodyDataToCostCenterShareRuleDetails();
            return TeaModel.build(map, self);
        }

        public QueryCostCenterShareRuleResponseBodyDataToCostCenterShareRuleDetails setCostCenterCode(String costCenterCode) {
            this.costCenterCode = costCenterCode;
            return this;
        }
        public String getCostCenterCode() {
            return this.costCenterCode;
        }

        public QueryCostCenterShareRuleResponseBodyDataToCostCenterShareRuleDetails setCostCenterId(Long costCenterId) {
            this.costCenterId = costCenterId;
            return this;
        }
        public Long getCostCenterId() {
            return this.costCenterId;
        }

        public QueryCostCenterShareRuleResponseBodyDataToCostCenterShareRuleDetails setCostCenterName(String costCenterName) {
            this.costCenterName = costCenterName;
            return this;
        }
        public String getCostCenterName() {
            return this.costCenterName;
        }

        public QueryCostCenterShareRuleResponseBodyDataToCostCenterShareRuleDetails setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public QueryCostCenterShareRuleResponseBodyDataToCostCenterShareRuleDetails setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public QueryCostCenterShareRuleResponseBodyDataToCostCenterShareRuleDetails setOwnerAccountId(Long ownerAccountId) {
            this.ownerAccountId = ownerAccountId;
            return this;
        }
        public Long getOwnerAccountId() {
            return this.ownerAccountId;
        }

        public QueryCostCenterShareRuleResponseBodyDataToCostCenterShareRuleDetails setParentCostCenterId(Long parentCostCenterId) {
            this.parentCostCenterId = parentCostCenterId;
            return this;
        }
        public Long getParentCostCenterId() {
            return this.parentCostCenterId;
        }

        public QueryCostCenterShareRuleResponseBodyDataToCostCenterShareRuleDetails setPrevCostCenterId(Long prevCostCenterId) {
            this.prevCostCenterId = prevCostCenterId;
            return this;
        }
        public Long getPrevCostCenterId() {
            return this.prevCostCenterId;
        }

        public QueryCostCenterShareRuleResponseBodyDataToCostCenterShareRuleDetails setRootCostCenterId(Long rootCostCenterId) {
            this.rootCostCenterId = rootCostCenterId;
            return this;
        }
        public Long getRootCostCenterId() {
            return this.rootCostCenterId;
        }

        public QueryCostCenterShareRuleResponseBodyDataToCostCenterShareRuleDetails setShareRatio(Double shareRatio) {
            this.shareRatio = shareRatio;
            return this;
        }
        public Double getShareRatio() {
            return this.shareRatio;
        }

    }

    public static class QueryCostCenterShareRuleResponseBodyData extends TeaModel {
        @NameInMap("FromCostCenterShareRuleDetails")
        public java.util.List<QueryCostCenterShareRuleResponseBodyDataFromCostCenterShareRuleDetails> fromCostCenterShareRuleDetails;

        /**
         * <strong>example:</strong>
         * <p>2026-01-01 00:00:00</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <strong>example:</strong>
         * <p>1529600453335198</p>
         */
        @NameInMap("OwnerAccountId")
        public Long ownerAccountId;

        /**
         * <strong>example:</strong>
         * <p>1826</p>
         */
        @NameInMap("ShareRuleId")
        public Long shareRuleId;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("ShareRuleName")
        public String shareRuleName;

        /**
         * <strong>example:</strong>
         * <p>AVERAGE</p>
         */
        @NameInMap("ShareRuleType")
        public String shareRuleType;

        @NameInMap("ToCostCenterShareRuleDetails")
        public java.util.List<QueryCostCenterShareRuleResponseBodyDataToCostCenterShareRuleDetails> toCostCenterShareRuleDetails;

        public static QueryCostCenterShareRuleResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryCostCenterShareRuleResponseBodyData self = new QueryCostCenterShareRuleResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryCostCenterShareRuleResponseBodyData setFromCostCenterShareRuleDetails(java.util.List<QueryCostCenterShareRuleResponseBodyDataFromCostCenterShareRuleDetails> fromCostCenterShareRuleDetails) {
            this.fromCostCenterShareRuleDetails = fromCostCenterShareRuleDetails;
            return this;
        }
        public java.util.List<QueryCostCenterShareRuleResponseBodyDataFromCostCenterShareRuleDetails> getFromCostCenterShareRuleDetails() {
            return this.fromCostCenterShareRuleDetails;
        }

        public QueryCostCenterShareRuleResponseBodyData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public QueryCostCenterShareRuleResponseBodyData setOwnerAccountId(Long ownerAccountId) {
            this.ownerAccountId = ownerAccountId;
            return this;
        }
        public Long getOwnerAccountId() {
            return this.ownerAccountId;
        }

        public QueryCostCenterShareRuleResponseBodyData setShareRuleId(Long shareRuleId) {
            this.shareRuleId = shareRuleId;
            return this;
        }
        public Long getShareRuleId() {
            return this.shareRuleId;
        }

        public QueryCostCenterShareRuleResponseBodyData setShareRuleName(String shareRuleName) {
            this.shareRuleName = shareRuleName;
            return this;
        }
        public String getShareRuleName() {
            return this.shareRuleName;
        }

        public QueryCostCenterShareRuleResponseBodyData setShareRuleType(String shareRuleType) {
            this.shareRuleType = shareRuleType;
            return this;
        }
        public String getShareRuleType() {
            return this.shareRuleType;
        }

        public QueryCostCenterShareRuleResponseBodyData setToCostCenterShareRuleDetails(java.util.List<QueryCostCenterShareRuleResponseBodyDataToCostCenterShareRuleDetails> toCostCenterShareRuleDetails) {
            this.toCostCenterShareRuleDetails = toCostCenterShareRuleDetails;
            return this;
        }
        public java.util.List<QueryCostCenterShareRuleResponseBodyDataToCostCenterShareRuleDetails> getToCostCenterShareRuleDetails() {
            return this.toCostCenterShareRuleDetails;
        }

    }

}
