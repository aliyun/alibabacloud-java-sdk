// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloud_siem20241212.models;

import com.aliyun.tea.*;

public class ListNormalizationRuleVersionsResponseBody extends TeaModel {
    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("NormalizationRuleVersions")
    public java.util.List<ListNormalizationRuleVersionsResponseBodyNormalizationRuleVersions> normalizationRuleVersions;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("CreateTime")
        public Long createTime;

        @NameInMap("NormalizationRuleExpression")
        public String normalizationRuleExpression;

        @NameInMap("NormalizationRuleId")
        public String normalizationRuleId;

        @NameInMap("NormalizationRuleVersion")
        public Integer normalizationRuleVersion;

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
