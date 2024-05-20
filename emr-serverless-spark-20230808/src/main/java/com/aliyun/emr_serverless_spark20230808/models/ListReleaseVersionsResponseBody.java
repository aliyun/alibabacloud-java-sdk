// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class ListReleaseVersionsResponseBody extends TeaModel {
    /**
     * <p>一次获取的最大记录数。</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>下一页TOKEN。</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    @NameInMap("releaseVersions")
    public java.util.List<ListReleaseVersionsResponseBodyReleaseVersions> releaseVersions;

    /**
     * <p>请求ID。</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>记录总数。</p>
     */
    @NameInMap("totalCount")
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

    public ListReleaseVersionsResponseBody setReleaseVersions(java.util.List<ListReleaseVersionsResponseBodyReleaseVersions> releaseVersions) {
        this.releaseVersions = releaseVersions;
        return this;
    }
    public java.util.List<ListReleaseVersionsResponseBodyReleaseVersions> getReleaseVersions() {
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

    public static class ListReleaseVersionsResponseBodyReleaseVersions extends TeaModel {
        @NameInMap("communityVersion")
        public String communityVersion;

        @NameInMap("cpuArchitectures")
        public java.util.List<String> cpuArchitectures;

        @NameInMap("gmtCreate")
        public Long gmtCreate;

        @NameInMap("iaasType")
        public String iaasType;

        @NameInMap("releaseVersion")
        public String releaseVersion;

        @NameInMap("scalaVersion")
        public String scalaVersion;

        @NameInMap("state")
        public String state;

        @NameInMap("type")
        public String type;

        public static ListReleaseVersionsResponseBodyReleaseVersions build(java.util.Map<String, ?> map) throws Exception {
            ListReleaseVersionsResponseBodyReleaseVersions self = new ListReleaseVersionsResponseBodyReleaseVersions();
            return TeaModel.build(map, self);
        }

        public ListReleaseVersionsResponseBodyReleaseVersions setCommunityVersion(String communityVersion) {
            this.communityVersion = communityVersion;
            return this;
        }
        public String getCommunityVersion() {
            return this.communityVersion;
        }

        public ListReleaseVersionsResponseBodyReleaseVersions setCpuArchitectures(java.util.List<String> cpuArchitectures) {
            this.cpuArchitectures = cpuArchitectures;
            return this;
        }
        public java.util.List<String> getCpuArchitectures() {
            return this.cpuArchitectures;
        }

        public ListReleaseVersionsResponseBodyReleaseVersions setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public ListReleaseVersionsResponseBodyReleaseVersions setIaasType(String iaasType) {
            this.iaasType = iaasType;
            return this;
        }
        public String getIaasType() {
            return this.iaasType;
        }

        public ListReleaseVersionsResponseBodyReleaseVersions setReleaseVersion(String releaseVersion) {
            this.releaseVersion = releaseVersion;
            return this;
        }
        public String getReleaseVersion() {
            return this.releaseVersion;
        }

        public ListReleaseVersionsResponseBodyReleaseVersions setScalaVersion(String scalaVersion) {
            this.scalaVersion = scalaVersion;
            return this;
        }
        public String getScalaVersion() {
            return this.scalaVersion;
        }

        public ListReleaseVersionsResponseBodyReleaseVersions setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public ListReleaseVersionsResponseBodyReleaseVersions setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

}
