// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class ListReleaseVersionsResponseBody extends TeaModel {
    /**
     * <p>The maximum number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>Returns the location of the data that was read.</p>
     * 
     * <strong>example:</strong>
     * <p>DD6B1B2A-5837-5237-ABE4-FF0C89568980</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The major EMR versions.</p>
     */
    @NameInMap("ReleaseVersions")
    public java.util.List<ReleaseVersions> releaseVersions;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>DD6B1B2A-5837-5237-ABE4-FF0C8944****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
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
         * <p>The IaaS type.</p>
         * 
         * <strong>example:</strong>
         * <p>ECS</p>
         */
        @NameInMap("IaasType")
        public String iaasType;

        /**
         * <p>The EMR version.</p>
         * 
         * <strong>example:</strong>
         * <p>EMR-5.3.0</p>
         */
        @NameInMap("ReleaseVersion")
        public String releaseVersion;

        /**
         * <p>The version series.</p>
         * 
         * <strong>example:</strong>
         * <p>EMR-6.X</p>
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
