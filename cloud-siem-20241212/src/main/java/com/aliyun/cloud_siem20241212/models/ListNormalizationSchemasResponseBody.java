// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class ListNormalizationSchemasResponseBody extends TeaModel {
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

    @NameInMap("NormalizationSchemas")
    public java.util.List<ListNormalizationSchemasResponseBodyNormalizationSchemas> normalizationSchemas;

    /**
     * <strong>example:</strong>
     * <p>6276D891-*****-55B2-87B9-74D413F7****。</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>57。</p>
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
         * <strong>example:</strong>
         * <p>1736386610000</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

        /**
         * <strong>example:</strong>
         * <p>NETWORK_CATEGORY。</p>
         */
        @NameInMap("NormalizationCategoryId")
        public String normalizationCategoryId;

        /**
         * <strong>example:</strong>
         * <p>网络五元组日志</p>
         */
        @NameInMap("NormalizationSchemaDescription")
        public String normalizationSchemaDescription;

        /**
         * <strong>example:</strong>
         * <p>preset</p>
         */
        @NameInMap("NormalizationSchemaFrom")
        public String normalizationSchemaFrom;

        /**
         * <strong>example:</strong>
         * <p>HTTP_ACTIVITY。</p>
         */
        @NameInMap("NormalizationSchemaId")
        public String normalizationSchemaId;

        /**
         * <strong>example:</strong>
         * <p>normalization_rule_Z57np。</p>
         */
        @NameInMap("NormalizationSchemaName")
        public String normalizationSchemaName;

        /**
         * <strong>example:</strong>
         * <p>network-activity。</p>
         */
        @NameInMap("NormalizationSchemaTargetLogStore")
        public String normalizationSchemaTargetLogStore;

        /**
         * <strong>example:</strong>
         * <p>network-activity</p>
         */
        @NameInMap("TargetLogStore")
        public String targetLogStore;

        /**
         * <strong>example:</strong>
         * <p>network-activity</p>
         */
        @NameInMap("TargetStoreView")
        public String targetStoreView;

        /**
         * <strong>example:</strong>
         * <p>1736386610000</p>
         */
        @NameInMap("UpdateTime")
        public Long updateTime;

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

    }

}
