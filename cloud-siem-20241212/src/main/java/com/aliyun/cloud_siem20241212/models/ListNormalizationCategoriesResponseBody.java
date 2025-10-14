// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class ListNormalizationCategoriesResponseBody extends TeaModel {
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

    @NameInMap("NormalizationCategories")
    public java.util.List<ListNormalizationCategoriesResponseBodyNormalizationCategories> normalizationCategories;

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

    public static ListNormalizationCategoriesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListNormalizationCategoriesResponseBody self = new ListNormalizationCategoriesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListNormalizationCategoriesResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListNormalizationCategoriesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListNormalizationCategoriesResponseBody setNormalizationCategories(java.util.List<ListNormalizationCategoriesResponseBodyNormalizationCategories> normalizationCategories) {
        this.normalizationCategories = normalizationCategories;
        return this;
    }
    public java.util.List<ListNormalizationCategoriesResponseBodyNormalizationCategories> getNormalizationCategories() {
        return this.normalizationCategories;
    }

    public ListNormalizationCategoriesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListNormalizationCategoriesResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListNormalizationCategoriesResponseBodyNormalizationCategories extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>COMMON_CATEGORY。</p>
         */
        @NameInMap("NormalizationCategoryId")
        public String normalizationCategoryId;

        /**
         * <strong>example:</strong>
         * <p>COMMON_CATEGORY。</p>
         */
        @NameInMap("NormalizationCategoryName")
        public String normalizationCategoryName;

        public static ListNormalizationCategoriesResponseBodyNormalizationCategories build(java.util.Map<String, ?> map) throws Exception {
            ListNormalizationCategoriesResponseBodyNormalizationCategories self = new ListNormalizationCategoriesResponseBodyNormalizationCategories();
            return TeaModel.build(map, self);
        }

        public ListNormalizationCategoriesResponseBodyNormalizationCategories setNormalizationCategoryId(String normalizationCategoryId) {
            this.normalizationCategoryId = normalizationCategoryId;
            return this;
        }
        public String getNormalizationCategoryId() {
            return this.normalizationCategoryId;
        }

        public ListNormalizationCategoriesResponseBodyNormalizationCategories setNormalizationCategoryName(String normalizationCategoryName) {
            this.normalizationCategoryName = normalizationCategoryName;
            return this;
        }
        public String getNormalizationCategoryName() {
            return this.normalizationCategoryName;
        }

    }

}
