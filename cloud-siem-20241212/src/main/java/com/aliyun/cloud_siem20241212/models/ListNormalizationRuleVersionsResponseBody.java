// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class ListNormalizationRuleVersionsResponseBody extends TeaModel {
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

    @NameInMap("NormalizationRuleVersions")
    public java.util.List<ListNormalizationRuleVersionsResponseBodyNormalizationRuleVersions> normalizationRuleVersions;

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
         * <strong>example:</strong>
         * <p>1733269771123。</p>
         */
        @NameInMap("CreateTime")
        public Long createTime;

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
         * <p>nr-z0b2ssjteut85uoh9nzp。</p>
         */
        @NameInMap("NormalizationRuleId")
        public String normalizationRuleId;

        /**
         * <strong>example:</strong>
         * <p>V1。</p>
         */
        @NameInMap("NormalizationRuleVersion")
        public Integer normalizationRuleVersion;

        /**
         * <strong>example:</strong>
         * <p>1733269771123。</p>
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
