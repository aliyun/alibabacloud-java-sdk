// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr_serverless_spark20230808.models;

import com.aliyun.tea.*;

public class ListReleaseVersionsResponseBody extends TeaModel {
    /**
     * <p>The maximum number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("maxResults")
    public Integer maxResults;

    /**
     * <p>A pagination token. It can be used in the next request to retrieve a new page of results.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("nextToken")
    public String nextToken;

    /**
     * <p>The versions.</p>
     */
    @NameInMap("releaseVersions")
    public java.util.List<ListReleaseVersionsResponseBodyReleaseVersions> releaseVersions;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>DD6B1B2A-5837-5237-ABE4-FF0C8944****</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
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
        /**
         * <p>The version number of open source Spark.</p>
         * 
         * <strong>example:</strong>
         * <p>Spark 3.3.1</p>
         */
        @NameInMap("communityVersion")
        public String communityVersion;

        /**
         * <p>The CPU architectures.</p>
         */
        @NameInMap("cpuArchitectures")
        public java.util.List<String> cpuArchitectures;

        /**
         * <p>The creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>1716215854101</p>
         */
        @NameInMap("gmtCreate")
        public Long gmtCreate;

        /**
         * <p>The type of the Infrastructure as a Service (IaaS) layer.</p>
         * 
         * <strong>example:</strong>
         * <p>ASI</p>
         */
        @NameInMap("iaasType")
        public String iaasType;

        /**
         * <p>The version.</p>
         * 
         * <strong>example:</strong>
         * <p>esr-2.1 (Spark 3.3.1, Scala 2.12, Java Runtime)</p>
         */
        @NameInMap("releaseVersion")
        public String releaseVersion;

        /**
         * <p>The version of Scala.</p>
         * 
         * <strong>example:</strong>
         * <p>2.12</p>
         */
        @NameInMap("scalaVersion")
        public String scalaVersion;

        /**
         * <p>The status of the version.</p>
         * 
         * <strong>example:</strong>
         * <p>ONLINE</p>
         */
        @NameInMap("state")
        public String state;

        /**
         * <p>The type of the version.</p>
         * 
         * <strong>example:</strong>
         * <p>stable</p>
         */
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
