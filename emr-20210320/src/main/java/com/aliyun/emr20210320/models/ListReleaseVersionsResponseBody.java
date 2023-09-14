// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class ListReleaseVersionsResponseBody extends TeaModel {
    /**
     * <p>The maximum number of entries returned.</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>Returns the location of the data that was read.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("ReleaseVersions")
    public java.util.List<ReleaseVersions> releaseVersions;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListReleaseVersionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListReleaseVersionsResponseBody self = new ListReleaseVersionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListReleaseVersionsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListReleaseVersionsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListReleaseVersionsResponseBody setReleaseVersions(java.util.List<ReleaseVersions> releaseVersions) {
        this.releaseVersions = releaseVersions;
        return this;
    }
    public java.util.List<ReleaseVersions> getReleaseVersions() {
        return this.releaseVersions;
    }

    public ListReleaseVersionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListReleaseVersionsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ReleaseVersions extends TeaModel {
        /**
         * <p>IaaS类型。取值范围：</p>
         * <p>- ECS：基于ECS构建。</p>
         * <p>- K8S：基于K8S构建。</p>
         */
        @NameInMap("IaasType")
        public String iaasType;

        /**
         * <p>EMR发行版。</p>
         */
        @NameInMap("ReleaseVersion")
        public String releaseVersion;

        /**
         * <p>版本序列。</p>
         */
        @NameInMap("Series")
        public String series;

        public static ReleaseVersions build(java.util.Map<String, ?> map) throws Exception {
            ReleaseVersions self = new ReleaseVersions();
            return TeaModel.build(map, self);
        }

        public ReleaseVersions setIaasType(String iaasType) {
            this.iaasType = iaasType;
            return this;
        }
        public String getIaasType() {
            return this.iaasType;
        }

        public ReleaseVersions setReleaseVersion(String releaseVersion) {
            this.releaseVersion = releaseVersion;
            return this;
        }
        public String getReleaseVersion() {
            return this.releaseVersion;
        }

        public ReleaseVersions setSeries(String series) {
            this.series = series;
            return this;
        }
        public String getSeries() {
            return this.series;
        }

    }

}
