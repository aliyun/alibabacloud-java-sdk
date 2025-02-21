// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emr20210320.models;

import com.aliyun.tea.*;

public class ListApplicationsResponseBody extends TeaModel {
    /**
     * <p>The applications.</p>
     */
    @NameInMap("Applications")
    public java.util.List<Applications> applications;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The page number of the next page returned.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>9E3A7161-EB7B-172B-8D18-FFB06BA3****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of pages.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
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
         * <p>The application name.</p>
         * 
         * <strong>example:</strong>
         * <p>HDFS</p>
         */
        @NameInMap("ApplicationName")
        public String applicationName;

        /**
         * <p>The status of the applications. Valid values:</p>
         * <ul>
         * <li>STOPPED: At least one application is in the Stopped state.</li>
         * <li>RUNNING: All applications are in the Running state.</li>
         * </ul>
         * <p>This parameter is returned only for DataLake, OLAP, Dataflow, DataServing, and custom clusters. For other types of clusters, no value is returned for this parameter.</p>
         * 
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        @NameInMap("ApplicationState")
        public String applicationState;

        /**
         * <p>The version of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>2.8.1</p>
         */
        @NameInMap("ApplicationVersion")
        @Deprecated
        public String applicationVersion;

        /**
         * <p>The community edition.</p>
         * 
         * <strong>example:</strong>
         * <p>2.8.5</p>
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

        @Deprecated
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
