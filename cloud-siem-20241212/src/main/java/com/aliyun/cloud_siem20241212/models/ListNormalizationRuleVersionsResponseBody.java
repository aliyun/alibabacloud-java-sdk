// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class ListNormalizationRuleVersionsResponseBody extends TeaModel {
    /**
     * <p>The maximum number of entries returned on each page.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results. If the NextToken parameter is empty, no more results are available.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAUqcj6VO4E3ECWIrFczs****</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The list of normalization rule versions.</p>
     */
    @NameInMap("NormalizationRuleVersions")
    public java.util.List<ListNormalizationRuleVersionsResponseBodyNormalizationRuleVersions> normalizationRuleVersions;

    /**
     * <p>The ID of the request.</p>
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

    public static ListNormalizationRuleVersionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListNormalizationRuleVersionsResponseBody self = new ListNormalizationRuleVersionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListNormalizationRuleVersionsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListNormalizationRuleVersionsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListNormalizationRuleVersionsResponseBody setNormalizationRuleVersions(java.util.List<ListNormalizationRuleVersionsResponseBodyNormalizationRuleVersions> normalizationRuleVersions) {
        this.normalizationRuleVersions = normalizationRuleVersions;
        return this;
    }
    public java.util.List<ListNormalizationRuleVersionsResponseBodyNormalizationRuleVersions> getNormalizationRuleVersions() {
        return this.normalizationRuleVersions;
    }

    public ListNormalizationRuleVersionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListNormalizationRuleVersionsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListNormalizationRuleVersionsResponseBodyNormalizationRuleVersions extends TeaModel {
        /**
         * <p>The time when the version was created.</p>
         * 
         * <strong>example:</strong>
         * <p>1733269771123</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

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
         * <p>The ID of the normalization rule.</p>
         * 
         * <strong>example:</strong>
         * <p>nr-z0b2ssjteut85uoh9nzp</p>
         */
        @NameInMap("NormalizationRuleId")
        public String normalizationRuleId;

        /**
         * <p>The version of the normalization rule.</p>
         * 
         * <strong>example:</strong>
         * <p>V1</p>
         */
        @NameInMap("NormalizationRuleVersion")
        public Integer normalizationRuleVersion;

        /**
         * <p>The time when the version was updated.</p>
         * 
         * <strong>example:</strong>
         * <p>1733269771123</p>
         */
        @NameInMap("UpdateTime")
        public Long updateTime;

        public static ListNormalizationRuleVersionsResponseBodyNormalizationRuleVersions build(java.util.Map<String, ?> map) throws Exception {
            ListNormalizationRuleVersionsResponseBodyNormalizationRuleVersions self = new ListNormalizationRuleVersionsResponseBodyNormalizationRuleVersions();
            return TeaModel.build(map, self);
        }

        public ListNormalizationRuleVersionsResponseBodyNormalizationRuleVersions setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public ListNormalizationRuleVersionsResponseBodyNormalizationRuleVersions setNormalizationRuleExpression(String normalizationRuleExpression) {
            this.normalizationRuleExpression = normalizationRuleExpression;
            return this;
        }
        public String getNormalizationRuleExpression() {
            return this.normalizationRuleExpression;
        }

        public ListNormalizationRuleVersionsResponseBodyNormalizationRuleVersions setNormalizationRuleId(String normalizationRuleId) {
            this.normalizationRuleId = normalizationRuleId;
            return this;
        }
        public String getNormalizationRuleId() {
            return this.normalizationRuleId;
        }

        public ListNormalizationRuleVersionsResponseBodyNormalizationRuleVersions setNormalizationRuleVersion(Integer normalizationRuleVersion) {
            this.normalizationRuleVersion = normalizationRuleVersion;
            return this;
        }
        public Integer getNormalizationRuleVersion() {
            return this.normalizationRuleVersion;
        }

        public ListNormalizationRuleVersionsResponseBodyNormalizationRuleVersions setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

    }

}
