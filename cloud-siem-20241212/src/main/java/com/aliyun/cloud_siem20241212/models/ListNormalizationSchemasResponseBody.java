// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class ListNormalizationSchemasResponseBody extends TeaModel {
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
     * <p>The list of normalization schemas.</p>
     */
    @NameInMap("NormalizationSchemas")
    public java.util.List<ListNormalizationSchemasResponseBodyNormalizationSchemas> normalizationSchemas;

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
     * <p>57</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListNormalizationSchemasResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListNormalizationSchemasResponseBody self = new ListNormalizationSchemasResponseBody();
        return TeaModel.build(map, self);
    }

    public ListNormalizationSchemasResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListNormalizationSchemasResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListNormalizationSchemasResponseBody setNormalizationSchemas(java.util.List<ListNormalizationSchemasResponseBodyNormalizationSchemas> normalizationSchemas) {
        this.normalizationSchemas = normalizationSchemas;
        return this;
    }
    public java.util.List<ListNormalizationSchemasResponseBodyNormalizationSchemas> getNormalizationSchemas() {
        return this.normalizationSchemas;
    }

    public ListNormalizationSchemasResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListNormalizationSchemasResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListNormalizationSchemasResponseBodyNormalizationSchemas extends TeaModel {
        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>1736386610000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <p>The ID of the normalization rule category.</p>
         * 
         * <strong>example:</strong>
         * <p>NETWORK_CATEGORY</p>
         */
        @NameInMap("NormalizationCategoryId")
        public String normalizationCategoryId;

        /**
         * <p>The field source. Valid values:
         * normalized: normalized field.
         * native: native field.</p>
         * 
         * <strong>example:</strong>
         * <p>normalized</p>
         */
        @NameInMap("NormalizationFieldSource")
        public String normalizationFieldSource;

        /**
         * <p>The description of the normalization schema.</p>
         * 
         * <strong>example:</strong>
         * <p>Network flow log</p>
         */
        @NameInMap("NormalizationSchemaDescription")
        public String normalizationSchemaDescription;

        /**
         * <p>The source of the normalization schema. Valid values: preset (predefined) and custom (user-defined).</p>
         * 
         * <strong>example:</strong>
         * <p>preset</p>
         */
        @NameInMap("NormalizationSchemaFrom")
        public String normalizationSchemaFrom;

        /**
         * <p>The ID of the normalization schema.</p>
         * 
         * <strong>example:</strong>
         * <p>HTTP_ACTIVITY</p>
         */
        @NameInMap("NormalizationSchemaId")
        public String normalizationSchemaId;

        /**
         * <p>The name of the normalization schema.</p>
         * 
         * <strong>example:</strong>
         * <p>normalization_rule_Z57np</p>
         */
        @NameInMap("NormalizationSchemaName")
        public String normalizationSchemaName;

        /**
         * <p>The LogStore to which the normalization output is written.</p>
         * 
         * <strong>example:</strong>
         * <p>network-activity</p>
         */
        @NameInMap("NormalizationSchemaTargetLogStore")
        public String normalizationSchemaTargetLogStore;

        /**
         * <p>The normalization schema type.</p>
         * 
         * <strong>example:</strong>
         * <p>log</p>
         */
        @NameInMap("NormalizationSchemaType")
        public String normalizationSchemaType;

        /**
         * <p>The security domain ID.</p>
         * 
         * <strong>example:</strong>
         * <p>NETWORK_AND_WEB_SECURITY</p>
         */
        @NameInMap("NormalizationSecurityDomainId")
        public String normalizationSecurityDomainId;

        /**
         * <p>The product ID.</p>
         * 
         * <strong>example:</strong>
         * <p>sas</p>
         */
        @NameInMap("ProductId")
        public String productId;

        @NameInMap("RecommendEntities")
        public java.util.List<String> recommendEntities;

        /**
         * <p>The Simple Log Service LogStore.</p>
         * 
         * <strong>example:</strong>
         * <p>network-activity</p>
         */
        @NameInMap("TargetLogStore")
        public String targetLogStore;

        /**
         * <p>The Simple Log Service StoreView.</p>
         * 
         * <strong>example:</strong>
         * <p>network-activity</p>
         */
        @NameInMap("TargetStoreView")
        public String targetStoreView;

        /**
         * <p>The update time.</p>
         * 
         * <strong>example:</strong>
         * <p>1736386610000</p>
         */
        @NameInMap("UpdateTime")
        public Long updateTime;

        /**
         * <p>The vendor ID.</p>
         * 
         * <strong>example:</strong>
         * <p>alibaba</p>
         */
        @NameInMap("VendorId")
        public String vendorId;

        public static ListNormalizationSchemasResponseBodyNormalizationSchemas build(java.util.Map<String, ?> map) throws Exception {
            ListNormalizationSchemasResponseBodyNormalizationSchemas self = new ListNormalizationSchemasResponseBodyNormalizationSchemas();
            return TeaModel.build(map, self);
        }

        public ListNormalizationSchemasResponseBodyNormalizationSchemas setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListNormalizationSchemasResponseBodyNormalizationSchemas setNormalizationCategoryId(String normalizationCategoryId) {
            this.normalizationCategoryId = normalizationCategoryId;
            return this;
        }
        public String getNormalizationCategoryId() {
            return this.normalizationCategoryId;
        }

        public ListNormalizationSchemasResponseBodyNormalizationSchemas setNormalizationFieldSource(String normalizationFieldSource) {
            this.normalizationFieldSource = normalizationFieldSource;
            return this;
        }
        public String getNormalizationFieldSource() {
            return this.normalizationFieldSource;
        }

        public ListNormalizationSchemasResponseBodyNormalizationSchemas setNormalizationSchemaDescription(String normalizationSchemaDescription) {
            this.normalizationSchemaDescription = normalizationSchemaDescription;
            return this;
        }
        public String getNormalizationSchemaDescription() {
            return this.normalizationSchemaDescription;
        }

        public ListNormalizationSchemasResponseBodyNormalizationSchemas setNormalizationSchemaFrom(String normalizationSchemaFrom) {
            this.normalizationSchemaFrom = normalizationSchemaFrom;
            return this;
        }
        public String getNormalizationSchemaFrom() {
            return this.normalizationSchemaFrom;
        }

        public ListNormalizationSchemasResponseBodyNormalizationSchemas setNormalizationSchemaId(String normalizationSchemaId) {
            this.normalizationSchemaId = normalizationSchemaId;
            return this;
        }
        public String getNormalizationSchemaId() {
            return this.normalizationSchemaId;
        }

        public ListNormalizationSchemasResponseBodyNormalizationSchemas setNormalizationSchemaName(String normalizationSchemaName) {
            this.normalizationSchemaName = normalizationSchemaName;
            return this;
        }
        public String getNormalizationSchemaName() {
            return this.normalizationSchemaName;
        }

        public ListNormalizationSchemasResponseBodyNormalizationSchemas setNormalizationSchemaTargetLogStore(String normalizationSchemaTargetLogStore) {
            this.normalizationSchemaTargetLogStore = normalizationSchemaTargetLogStore;
            return this;
        }
        public String getNormalizationSchemaTargetLogStore() {
            return this.normalizationSchemaTargetLogStore;
        }

        public ListNormalizationSchemasResponseBodyNormalizationSchemas setNormalizationSchemaType(String normalizationSchemaType) {
            this.normalizationSchemaType = normalizationSchemaType;
            return this;
        }
        public String getNormalizationSchemaType() {
            return this.normalizationSchemaType;
        }

        public ListNormalizationSchemasResponseBodyNormalizationSchemas setNormalizationSecurityDomainId(String normalizationSecurityDomainId) {
            this.normalizationSecurityDomainId = normalizationSecurityDomainId;
            return this;
        }
        public String getNormalizationSecurityDomainId() {
            return this.normalizationSecurityDomainId;
        }

        public ListNormalizationSchemasResponseBodyNormalizationSchemas setProductId(String productId) {
            this.productId = productId;
            return this;
        }
        public String getProductId() {
            return this.productId;
        }

        public ListNormalizationSchemasResponseBodyNormalizationSchemas setRecommendEntities(java.util.List<String> recommendEntities) {
            this.recommendEntities = recommendEntities;
            return this;
        }
        public java.util.List<String> getRecommendEntities() {
            return this.recommendEntities;
        }

        public ListNormalizationSchemasResponseBodyNormalizationSchemas setTargetLogStore(String targetLogStore) {
            this.targetLogStore = targetLogStore;
            return this;
        }
        public String getTargetLogStore() {
            return this.targetLogStore;
        }

        public ListNormalizationSchemasResponseBodyNormalizationSchemas setTargetStoreView(String targetStoreView) {
            this.targetStoreView = targetStoreView;
            return this;
        }
        public String getTargetStoreView() {
            return this.targetStoreView;
        }

        public ListNormalizationSchemasResponseBodyNormalizationSchemas setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public ListNormalizationSchemasResponseBodyNormalizationSchemas setVendorId(String vendorId) {
            this.vendorId = vendorId;
            return this;
        }
        public String getVendorId() {
            return this.vendorId;
        }

    }

}
