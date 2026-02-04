// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class ListNormalizationRulesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>50。</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>AAAAAUqcj6VO4E3ECWIrFczs****。</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("NormalizationRules")
    public java.util.List<ListNormalizationRulesResponseBodyNormalizationRules> normalizationRules;

    /**
     * <strong>example:</strong>
     * <p>1。</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>2。</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>6276D891-*****-55B2-87B9-74D413F7****。</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>5。</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    /**
     * <strong>example:</strong>
     * <p>1。</p>
     */
    @NameInMap("TotalPage")
    public Integer totalPage;

    public static ListNormalizationRulesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListNormalizationRulesResponseBody self = new ListNormalizationRulesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListNormalizationRulesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListNormalizationRulesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListNormalizationRulesResponseBody setNormalizationRules(java.util.List<ListNormalizationRulesResponseBodyNormalizationRules> normalizationRules) {
        this.normalizationRules = normalizationRules;
        return this;
    }
    public java.util.List<ListNormalizationRulesResponseBodyNormalizationRules> getNormalizationRules() {
        return this.normalizationRules;
    }

    public ListNormalizationRulesResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListNormalizationRulesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListNormalizationRulesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListNormalizationRulesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public ListNormalizationRulesResponseBody setTotalPage(Integer totalPage) {
        this.totalPage = totalPage;
        return this;
    }
    public Integer getTotalPage() {
        return this.totalPage;
    }

    public static class ListNormalizationRulesResponseBodyNormalizationRulesNormalizationRuleReferences extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>alibaba_cloud_bot_flow_ingestion_173326*******。</p>
         */
        @NameInMap("DataIngestionId")
        public String dataIngestionId;

        public static ListNormalizationRulesResponseBodyNormalizationRulesNormalizationRuleReferences build(java.util.Map<String, ?> map) throws Exception {
            ListNormalizationRulesResponseBodyNormalizationRulesNormalizationRuleReferences self = new ListNormalizationRulesResponseBodyNormalizationRulesNormalizationRuleReferences();
            return TeaModel.build(map, self);
        }

        public ListNormalizationRulesResponseBodyNormalizationRulesNormalizationRuleReferences setDataIngestionId(String dataIngestionId) {
            this.dataIngestionId = dataIngestionId;
            return this;
        }
        public String getDataIngestionId() {
            return this.dataIngestionId;
        }

    }

    public static class ListNormalizationRulesResponseBodyNormalizationRules extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>1733269771123。</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("ExtendContentPacked")
        public String extendContentPacked;

        /**
         * <strong>example:</strong>
         * <p>flat</p>
         */
        @NameInMap("ExtendFieldStoreMode")
        public String extendFieldStoreMode;

        /**
         * <strong>example:</strong>
         * <p>NETWORK_CATEGORY。</p>
         */
        @NameInMap("NormalizationCategoryId")
        public String normalizationCategoryId;

        /**
         * <strong>example:</strong>
         * <p>normalization_rule_Z57np。</p>
         */
        @NameInMap("NormalizationRuleDescription")
        public String normalizationRuleDescription;

        /**
         * <strong>example:</strong>
         * <ul>
         * <li>| pack-fields -include=\&quot;[\s\S]+\&quot; as extend_content。</li>
         * </ul>
         */
        @NameInMap("NormalizationRuleExpression")
        public String normalizationRuleExpression;

        /**
         * <strong>example:</strong>
         * <p>SPL。</p>
         */
        @NameInMap("NormalizationRuleFormat")
        public String normalizationRuleFormat;

        /**
         * <strong>example:</strong>
         * <p>nr-z0b2ssjteut85uoh9nzp。</p>
         */
        @NameInMap("NormalizationRuleId")
        public String normalizationRuleId;

        /**
         * <strong>example:</strong>
         * <p>both。</p>
         */
        @NameInMap("NormalizationRuleMode")
        public String normalizationRuleMode;

        /**
         * <strong>example:</strong>
         * <p>normalization_rule_Z57np。</p>
         */
        @NameInMap("NormalizationRuleName")
        public String normalizationRuleName;

        @NameInMap("NormalizationRuleReferences")
        public java.util.List<ListNormalizationRulesResponseBodyNormalizationRulesNormalizationRuleReferences> normalizationRuleReferences;

        /**
         * <strong>example:</strong>
         * <p>started。</p>
         */
        @NameInMap("NormalizationRuleStatus")
        public String normalizationRuleStatus;

        /**
         * <strong>example:</strong>
         * <p>predefined。</p>
         */
        @NameInMap("NormalizationRuleType")
        public String normalizationRuleType;

        /**
         * <strong>example:</strong>
         * <p>V1。</p>
         */
        @NameInMap("NormalizationRuleVersion")
        public String normalizationRuleVersion;

        /**
         * <strong>example:</strong>
         * <p>HTTP_ACTIVITY。</p>
         */
        @NameInMap("NormalizationSchemaId")
        public String normalizationSchemaId;

        /**
         * <strong>example:</strong>
         * <p>alibaba_cloud_sas。</p>
         */
        @NameInMap("ProductId")
        public String productId;

        /**
         * <strong>example:</strong>
         * <p>1733269771123。</p>
         */
        @NameInMap("UpdateTime")
        public Long updateTime;

        /**
         * <strong>example:</strong>
         * <p>alibaba_cloud。</p>
         */
        @NameInMap("VendorId")
        public String vendorId;

        public static ListNormalizationRulesResponseBodyNormalizationRules build(java.util.Map<String, ?> map) throws Exception {
            ListNormalizationRulesResponseBodyNormalizationRules self = new ListNormalizationRulesResponseBodyNormalizationRules();
            return TeaModel.build(map, self);
        }

        public ListNormalizationRulesResponseBodyNormalizationRules setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListNormalizationRulesResponseBodyNormalizationRules setExtendContentPacked(String extendContentPacked) {
            this.extendContentPacked = extendContentPacked;
            return this;
        }
        public String getExtendContentPacked() {
            return this.extendContentPacked;
        }

        public ListNormalizationRulesResponseBodyNormalizationRules setExtendFieldStoreMode(String extendFieldStoreMode) {
            this.extendFieldStoreMode = extendFieldStoreMode;
            return this;
        }
        public String getExtendFieldStoreMode() {
            return this.extendFieldStoreMode;
        }

        public ListNormalizationRulesResponseBodyNormalizationRules setNormalizationCategoryId(String normalizationCategoryId) {
            this.normalizationCategoryId = normalizationCategoryId;
            return this;
        }
        public String getNormalizationCategoryId() {
            return this.normalizationCategoryId;
        }

        public ListNormalizationRulesResponseBodyNormalizationRules setNormalizationRuleDescription(String normalizationRuleDescription) {
            this.normalizationRuleDescription = normalizationRuleDescription;
            return this;
        }
        public String getNormalizationRuleDescription() {
            return this.normalizationRuleDescription;
        }

        public ListNormalizationRulesResponseBodyNormalizationRules setNormalizationRuleExpression(String normalizationRuleExpression) {
            this.normalizationRuleExpression = normalizationRuleExpression;
            return this;
        }
        public String getNormalizationRuleExpression() {
            return this.normalizationRuleExpression;
        }

        public ListNormalizationRulesResponseBodyNormalizationRules setNormalizationRuleFormat(String normalizationRuleFormat) {
            this.normalizationRuleFormat = normalizationRuleFormat;
            return this;
        }
        public String getNormalizationRuleFormat() {
            return this.normalizationRuleFormat;
        }

        public ListNormalizationRulesResponseBodyNormalizationRules setNormalizationRuleId(String normalizationRuleId) {
            this.normalizationRuleId = normalizationRuleId;
            return this;
        }
        public String getNormalizationRuleId() {
            return this.normalizationRuleId;
        }

        public ListNormalizationRulesResponseBodyNormalizationRules setNormalizationRuleMode(String normalizationRuleMode) {
            this.normalizationRuleMode = normalizationRuleMode;
            return this;
        }
        public String getNormalizationRuleMode() {
            return this.normalizationRuleMode;
        }

        public ListNormalizationRulesResponseBodyNormalizationRules setNormalizationRuleName(String normalizationRuleName) {
            this.normalizationRuleName = normalizationRuleName;
            return this;
        }
        public String getNormalizationRuleName() {
            return this.normalizationRuleName;
        }

        public ListNormalizationRulesResponseBodyNormalizationRules setNormalizationRuleReferences(java.util.List<ListNormalizationRulesResponseBodyNormalizationRulesNormalizationRuleReferences> normalizationRuleReferences) {
            this.normalizationRuleReferences = normalizationRuleReferences;
            return this;
        }
        public java.util.List<ListNormalizationRulesResponseBodyNormalizationRulesNormalizationRuleReferences> getNormalizationRuleReferences() {
            return this.normalizationRuleReferences;
        }

        public ListNormalizationRulesResponseBodyNormalizationRules setNormalizationRuleStatus(String normalizationRuleStatus) {
            this.normalizationRuleStatus = normalizationRuleStatus;
            return this;
        }
        public String getNormalizationRuleStatus() {
            return this.normalizationRuleStatus;
        }

        public ListNormalizationRulesResponseBodyNormalizationRules setNormalizationRuleType(String normalizationRuleType) {
            this.normalizationRuleType = normalizationRuleType;
            return this;
        }
        public String getNormalizationRuleType() {
            return this.normalizationRuleType;
        }

        public ListNormalizationRulesResponseBodyNormalizationRules setNormalizationRuleVersion(String normalizationRuleVersion) {
            this.normalizationRuleVersion = normalizationRuleVersion;
            return this;
        }
        public String getNormalizationRuleVersion() {
            return this.normalizationRuleVersion;
        }

        public ListNormalizationRulesResponseBodyNormalizationRules setNormalizationSchemaId(String normalizationSchemaId) {
            this.normalizationSchemaId = normalizationSchemaId;
            return this;
        }
        public String getNormalizationSchemaId() {
            return this.normalizationSchemaId;
        }

        public ListNormalizationRulesResponseBodyNormalizationRules setProductId(String productId) {
            this.productId = productId;
            return this;
        }
        public String getProductId() {
            return this.productId;
        }

        public ListNormalizationRulesResponseBodyNormalizationRules setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public ListNormalizationRulesResponseBodyNormalizationRules setVendorId(String vendorId) {
            this.vendorId = vendorId;
            return this;
        }
        public String getVendorId() {
            return this.vendorId;
        }

    }

}
