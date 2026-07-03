// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class ListNormalizationRulesResponseBody extends TeaModel {
    /**
     * <p>The maximum number of entries to return in this request.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token for the next query. Leave this parameter empty for the first query or if no more results exist. If more results exist, set this parameter to the NextToken value returned by the previous API call.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAUqcj6VO4E3ECWIrFczs****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The list of normalization rules.</p>
     */
    @NameInMap("NormalizationRules")
    public java.util.List<ListNormalizationRulesResponseBodyNormalizationRules> normalizationRules;

    /**
     * <p>The page number of the current page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>6276D891-*****-55B2-87B9-74D413F7****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of records.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    /**
     * <p>The total number of pages.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
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
         * <p>The data ingestion ID.</p>
         * 
         * <strong>example:</strong>
         * <p>alibaba_cloud_bot_flow_ingestion_173326*******</p>
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
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>1733269771123</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>Specifies whether non-standard fields are packed into the extend_content field. Valid values:</p>
         * <ul>
         * <li>enabled: Enabled.</li>
         * <li>disabled: Disabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>enabled</p>
         */
        @NameInMap("ExtendContentPacked")
        public String extendContentPacked;

        /**
         * <p>The storage mode for extended fields. Valid values: flat (ingest as-is), reject (do not ingest), and pack (pack into the extend_content field).</p>
         * 
         * <strong>example:</strong>
         * <p>flat</p>
         */
        @NameInMap("ExtendFieldStoreMode")
        public String extendFieldStoreMode;

        /**
         * <p>The category ID of the normalization rule.</p>
         * 
         * <strong>example:</strong>
         * <p>NETWORK_CATEGORY</p>
         */
        @NameInMap("NormalizationCategoryId")
        public String normalizationCategoryId;

        /**
         * <strong>example:</strong>
         * <p>normalized</p>
         */
        @NameInMap("NormalizationFieldSource")
        public String normalizationFieldSource;

        /**
         * <p>The description of the normalization rule.</p>
         * 
         * <strong>example:</strong>
         * <p>normalization_rule_Z57np</p>
         */
        @NameInMap("NormalizationRuleDescription")
        public String normalizationRuleDescription;

        /**
         * <p>The expression of the normalization rule.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li>| pack-fields -include=\&quot;[\s\S]+\&quot; as extend_content</li>
         * </ul>
         */
        @NameInMap("NormalizationRuleExpression")
        public String normalizationRuleExpression;

        /**
         * <p>The format of the normalization rule.</p>
         * 
         * <strong>example:</strong>
         * <p>SPL</p>
         */
        @NameInMap("NormalizationRuleFormat")
        public String normalizationRuleFormat;

        /**
         * <p>The normalization rule ID.</p>
         * 
         * <strong>example:</strong>
         * <p>nr-z0b2ssjteut85uoh9nzp</p>
         */
        @NameInMap("NormalizationRuleId")
        public String normalizationRuleId;

        /**
         * <p>The mode of the normalization rule. Valid values:</p>
         * <ul>
         * <li>both</li>
         * <li>scan</li>
         * <li>realtime.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>both</p>
         */
        @NameInMap("NormalizationRuleMode")
        public String normalizationRuleMode;

        /**
         * <p>The name of the normalization rule.</p>
         * 
         * <strong>example:</strong>
         * <p>normalization_rule_Z57np</p>
         */
        @NameInMap("NormalizationRuleName")
        public String normalizationRuleName;

        /**
         * <p>The list of associated ingestion policies.</p>
         */
        @NameInMap("NormalizationRuleReferences")
        public java.util.List<ListNormalizationRulesResponseBodyNormalizationRulesNormalizationRuleReferences> normalizationRuleReferences;

        /**
         * <p>The status of the normalization rule.</p>
         * 
         * <strong>example:</strong>
         * <p>started</p>
         */
        @NameInMap("NormalizationRuleStatus")
        public String normalizationRuleStatus;

        /**
         * <p>The type of the normalization rule. Valid values:</p>
         * <ul>
         * <li>predefined: predefined normalization rule.</li>
         * <li>custom: custom normalization rule.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>predefined</p>
         */
        @NameInMap("NormalizationRuleType")
        public String normalizationRuleType;

        /**
         * <p>The current version of the normalization rule.</p>
         * 
         * <strong>example:</strong>
         * <p>V1</p>
         */
        @NameInMap("NormalizationRuleVersion")
        public String normalizationRuleVersion;

        /**
         * <p>The normalization schema ID.</p>
         * 
         * <strong>example:</strong>
         * <p>HTTP_ACTIVITY</p>
         */
        @NameInMap("NormalizationSchemaId")
        public String normalizationSchemaId;

        /**
         * <strong>example:</strong>
         * <p>NETWORK_AND_WEB_SECURITY</p>
         */
        @NameInMap("NormalizationSecurityDomainId")
        public String normalizationSecurityDomainId;

        /**
         * <p>The product ID.</p>
         * 
         * <strong>example:</strong>
         * <p>alibaba_cloud_sas</p>
         */
        @NameInMap("ProductId")
        public String productId;

        /**
         * <p>The update time.</p>
         * 
         * <strong>example:</strong>
         * <p>1733269771123</p>
         */
        @NameInMap("UpdateTime")
        public Long updateTime;

        /**
         * <p>The vendor ID associated with the normalization rule.</p>
         * 
         * <strong>example:</strong>
         * <p>alibaba_cloud</p>
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

        public ListNormalizationRulesResponseBodyNormalizationRules setNormalizationFieldSource(String normalizationFieldSource) {
            this.normalizationFieldSource = normalizationFieldSource;
            return this;
        }
        public String getNormalizationFieldSource() {
            return this.normalizationFieldSource;
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

        public ListNormalizationRulesResponseBodyNormalizationRules setNormalizationSecurityDomainId(String normalizationSecurityDomainId) {
            this.normalizationSecurityDomainId = normalizationSecurityDomainId;
            return this;
        }
        public String getNormalizationSecurityDomainId() {
            return this.normalizationSecurityDomainId;
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
