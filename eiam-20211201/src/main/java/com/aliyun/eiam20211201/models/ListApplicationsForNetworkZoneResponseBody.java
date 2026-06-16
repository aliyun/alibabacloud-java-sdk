// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eiam20211201.models;

import com.aliyun.tea.*;

public class ListApplicationsForNetworkZoneResponseBody extends TeaModel {
    /**
     * <p>The list of applications.</p>
     */
    @NameInMap("Applications")
    public java.util.List<ListApplicationsForNetworkZoneResponseBodyApplications> applications;

    /**
     * <p>The number of entries returned on each page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The token returned for the next query.</p>
     * 
     * <strong>example:</strong>
     * <p>NTxxxexample</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The token returned for the previous query.</p>
     * 
     * <strong>example:</strong>
     * <p>PTxxxexample</p>
     */
    @NameInMap("PreviousToken")
    public String previousToken;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>0441BD79-92F3-53AA-8657-F8CE4A2B912A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListApplicationsForNetworkZoneResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListApplicationsForNetworkZoneResponseBody self = new ListApplicationsForNetworkZoneResponseBody();
        return TeaModel.build(map, self);
    }

    public ListApplicationsForNetworkZoneResponseBody setApplications(java.util.List<ListApplicationsForNetworkZoneResponseBodyApplications> applications) {
        this.applications = applications;
        return this;
    }
    public java.util.List<ListApplicationsForNetworkZoneResponseBodyApplications> getApplications() {
        return this.applications;
    }

    public ListApplicationsForNetworkZoneResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListApplicationsForNetworkZoneResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListApplicationsForNetworkZoneResponseBody setPreviousToken(String previousToken) {
        this.previousToken = previousToken;
        return this;
    }
    public String getPreviousToken() {
        return this.previousToken;
    }

    public ListApplicationsForNetworkZoneResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListApplicationsForNetworkZoneResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListApplicationsForNetworkZoneResponseBodyApplications extends TeaModel {
        /**
         * <p>The ID of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>app_mkv7rgt4d7i4u7zqtzev2mxxxx</p>
         */
        @NameInMap("ApplicationId")
        public String applicationId;

        /**
         * <p>The name of the application.</p>
         * 
         * <strong>example:</strong>
         * <p>cloudSSO</p>
         */
        @NameInMap("ApplicationName")
        public String applicationName;

        /**
         * <p>The ID of the IDaaS EIAM instance.</p>
         * 
         * <strong>example:</strong>
         * <p>idaas_ue2jvisn35ea5lmthk267xxxxx</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        public static ListApplicationsForNetworkZoneResponseBodyApplications build(java.util.Map<String, ?> map) throws Exception {
            ListApplicationsForNetworkZoneResponseBodyApplications self = new ListApplicationsForNetworkZoneResponseBodyApplications();
            return TeaModel.build(map, self);
        }

        public ListApplicationsForNetworkZoneResponseBodyApplications setApplicationId(String applicationId) {
            this.applicationId = applicationId;
            return this;
        }
        public String getApplicationId() {
            return this.applicationId;
        }

        public ListApplicationsForNetworkZoneResponseBodyApplications setApplicationName(String applicationName) {
            this.applicationName = applicationName;
            return this;
        }
        public String getApplicationName() {
            return this.applicationName;
        }

        public ListApplicationsForNetworkZoneResponseBodyApplications setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

    }

}
