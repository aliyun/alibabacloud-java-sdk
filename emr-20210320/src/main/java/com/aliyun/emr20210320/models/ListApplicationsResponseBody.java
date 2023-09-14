// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class ListApplicationsResponseBody extends TeaModel {
    @NameInMap("Applications")
    public java.util.List<Applications> applications;

    /**
     * <p>本次请求所返回的最大记录条数。</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>返回读取到的数据位置，空代表数据已经读取完毕。</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>请求ID。</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>本次请求条件下的数据总量。</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListApplicationsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListApplicationsResponseBody self = new ListApplicationsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListApplicationsResponseBody setApplications(java.util.List<Applications> applications) {
        this.applications = applications;
        return this;
    }
    public java.util.List<Applications> getApplications() {
        return this.applications;
    }

    public ListApplicationsResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListApplicationsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListApplicationsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListApplicationsResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class Applications extends TeaModel {
        /**
         * <p>应用名称。</p>
         */
        @NameInMap("ApplicationName")
        public String applicationName;

        /**
         * <p>应用操作状态</p>
         */
        @NameInMap("ApplicationState")
        public String applicationState;

        /**
         * <p>应用版本。</p>
         */
        @NameInMap("ApplicationVersion")
        @Deprecated
        public String applicationVersion;

        /**
         * <p>社区版本。</p>
         */
        @NameInMap("CommunityVersion")
        public String communityVersion;

        public static Applications build(java.util.Map<String, ?> map) throws Exception {
            Applications self = new Applications();
            return TeaModel.build(map, self);
        }

        public Applications setApplicationName(String applicationName) {
            this.applicationName = applicationName;
            return this;
        }
        public String getApplicationName() {
            return this.applicationName;
        }

        public Applications setApplicationState(String applicationState) {
            this.applicationState = applicationState;
            return this;
        }
        public String getApplicationState() {
            return this.applicationState;
        }

        public Applications setApplicationVersion(String applicationVersion) {
            this.applicationVersion = applicationVersion;
            return this;
        }
        public String getApplicationVersion() {
            return this.applicationVersion;
        }

        public Applications setCommunityVersion(String communityVersion) {
            this.communityVersion = communityVersion;
            return this;
        }
        public String getCommunityVersion() {
            return this.communityVersion;
        }

    }

}
