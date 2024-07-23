// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeCloudAssistantStatusResponseBody extends TeaModel {
    /**
     * <p>Details about the installation status of Cloud Assistant on the instances.</p>
     */
    @NameInMap("InstanceCloudAssistantStatusSet")
    public DescribeCloudAssistantStatusResponseBodyInstanceCloudAssistantStatusSet instanceCloudAssistantStatusSet;

    /**
     * <p>A pagination token. It can be used in the next request to retrieve a new page of results.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAdDWBF2</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of instances.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static DescribeCloudAssistantStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCloudAssistantStatusResponseBody self = new DescribeCloudAssistantStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCloudAssistantStatusResponseBody setInstanceCloudAssistantStatusSet(DescribeCloudAssistantStatusResponseBodyInstanceCloudAssistantStatusSet instanceCloudAssistantStatusSet) {
        this.instanceCloudAssistantStatusSet = instanceCloudAssistantStatusSet;
        return this;
    }
    public DescribeCloudAssistantStatusResponseBodyInstanceCloudAssistantStatusSet getInstanceCloudAssistantStatusSet() {
        return this.instanceCloudAssistantStatusSet;
    }

    public DescribeCloudAssistantStatusResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeCloudAssistantStatusResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public DescribeCloudAssistantStatusResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeCloudAssistantStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCloudAssistantStatusResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeCloudAssistantStatusResponseBodyInstanceCloudAssistantStatusSetInstanceCloudAssistantStatus extends TeaModel {
        /**
         * <p>The number of tasks that Cloud Assistant was running on the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ActiveTaskCount")
        public Long activeTaskCount;

        /**
         * <p>Indicates whether Cloud Assistant is running on the instance. Valid values:</p>
         * <ul>
         * <li>true: Heartbeats are detected in the last 2 minutes.</li>
         * <li>false: No heartbeats are detected in the last 2 minutes.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("CloudAssistantStatus")
        public String cloudAssistantStatus;

        /**
         * <p>The version number of Cloud Assistant Agent. This parameter is empty if Cloud Assistant Agent is not installed or is not running on the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>2.2.0.106</p>
         */
        @NameInMap("CloudAssistantVersion")
        public String cloudAssistantVersion;

        /**
         * <p>The ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>i-bp1iudwa5b1tqa****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The number of tasks that Cloud Assistant completed on the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("InvocationCount")
        public Long invocationCount;

        /**
         * <p>The last heartbeat time of Cloud Assistant. The value is updated every minute on average. The interval can be 55, 60, or 65 seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-03-15T09:00:00Z</p>
         */
        @NameInMap("LastHeartbeatTime")
        public String lastHeartbeatTime;

        /**
         * <p>The time when commands were last run.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-03-15T08:00:00Z</p>
         */
        @NameInMap("LastInvokedTime")
        public String lastInvokedTime;

        /**
         * <p>The operating system type of the instance. Valid values:</p>
         * <ul>
         * <li>Windows</li>
         * <li>Linux</li>
         * <li>FreeBSD</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Linux</p>
         */
        @NameInMap("OSType")
        public String OSType;

        /**
         * <p>Indicates whether Cloud Assistant supports Session Manager on the instance. If Session Manager is not supported, the version of Cloud Assistant Agent is outdated. Update Cloud Assistant Agent to the latest version.</p>
         * <p>To support Session Manager, the version of Cloud Assistant Agent cannot be earlier than the following versions:</p>
         * <ul>
         * <li>Linux: 2.2.3.189</li>
         * <li>Windows: 2.1.3.189</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("SupportSessionManager")
        public Boolean supportSessionManager;

        public static DescribeCloudAssistantStatusResponseBodyInstanceCloudAssistantStatusSetInstanceCloudAssistantStatus build(java.util.Map<String, ?> map) throws Exception {
            DescribeCloudAssistantStatusResponseBodyInstanceCloudAssistantStatusSetInstanceCloudAssistantStatus self = new DescribeCloudAssistantStatusResponseBodyInstanceCloudAssistantStatusSetInstanceCloudAssistantStatus();
            return TeaModel.build(map, self);
        }

        public DescribeCloudAssistantStatusResponseBodyInstanceCloudAssistantStatusSetInstanceCloudAssistantStatus setActiveTaskCount(Long activeTaskCount) {
            this.activeTaskCount = activeTaskCount;
            return this;
        }
        public Long getActiveTaskCount() {
            return this.activeTaskCount;
        }

        public DescribeCloudAssistantStatusResponseBodyInstanceCloudAssistantStatusSetInstanceCloudAssistantStatus setCloudAssistantStatus(String cloudAssistantStatus) {
            this.cloudAssistantStatus = cloudAssistantStatus;
            return this;
        }
        public String getCloudAssistantStatus() {
            return this.cloudAssistantStatus;
        }

        public DescribeCloudAssistantStatusResponseBodyInstanceCloudAssistantStatusSetInstanceCloudAssistantStatus setCloudAssistantVersion(String cloudAssistantVersion) {
            this.cloudAssistantVersion = cloudAssistantVersion;
            return this;
        }
        public String getCloudAssistantVersion() {
            return this.cloudAssistantVersion;
        }

        public DescribeCloudAssistantStatusResponseBodyInstanceCloudAssistantStatusSetInstanceCloudAssistantStatus setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeCloudAssistantStatusResponseBodyInstanceCloudAssistantStatusSetInstanceCloudAssistantStatus setInvocationCount(Long invocationCount) {
            this.invocationCount = invocationCount;
            return this;
        }
        public Long getInvocationCount() {
            return this.invocationCount;
        }

        public DescribeCloudAssistantStatusResponseBodyInstanceCloudAssistantStatusSetInstanceCloudAssistantStatus setLastHeartbeatTime(String lastHeartbeatTime) {
            this.lastHeartbeatTime = lastHeartbeatTime;
            return this;
        }
        public String getLastHeartbeatTime() {
            return this.lastHeartbeatTime;
        }

        public DescribeCloudAssistantStatusResponseBodyInstanceCloudAssistantStatusSetInstanceCloudAssistantStatus setLastInvokedTime(String lastInvokedTime) {
            this.lastInvokedTime = lastInvokedTime;
            return this;
        }
        public String getLastInvokedTime() {
            return this.lastInvokedTime;
        }

        public DescribeCloudAssistantStatusResponseBodyInstanceCloudAssistantStatusSetInstanceCloudAssistantStatus setOSType(String OSType) {
            this.OSType = OSType;
            return this;
        }
        public String getOSType() {
            return this.OSType;
        }

        public DescribeCloudAssistantStatusResponseBodyInstanceCloudAssistantStatusSetInstanceCloudAssistantStatus setSupportSessionManager(Boolean supportSessionManager) {
            this.supportSessionManager = supportSessionManager;
            return this;
        }
        public Boolean getSupportSessionManager() {
            return this.supportSessionManager;
        }

    }

    public static class DescribeCloudAssistantStatusResponseBodyInstanceCloudAssistantStatusSet extends TeaModel {
        @NameInMap("InstanceCloudAssistantStatus")
        public java.util.List<DescribeCloudAssistantStatusResponseBodyInstanceCloudAssistantStatusSetInstanceCloudAssistantStatus> instanceCloudAssistantStatus;

        public static DescribeCloudAssistantStatusResponseBodyInstanceCloudAssistantStatusSet build(java.util.Map<String, ?> map) throws Exception {
            DescribeCloudAssistantStatusResponseBodyInstanceCloudAssistantStatusSet self = new DescribeCloudAssistantStatusResponseBodyInstanceCloudAssistantStatusSet();
            return TeaModel.build(map, self);
        }

        public DescribeCloudAssistantStatusResponseBodyInstanceCloudAssistantStatusSet setInstanceCloudAssistantStatus(java.util.List<DescribeCloudAssistantStatusResponseBodyInstanceCloudAssistantStatusSetInstanceCloudAssistantStatus> instanceCloudAssistantStatus) {
            this.instanceCloudAssistantStatus = instanceCloudAssistantStatus;
            return this;
        }
        public java.util.List<DescribeCloudAssistantStatusResponseBodyInstanceCloudAssistantStatusSetInstanceCloudAssistantStatus> getInstanceCloudAssistantStatus() {
            return this.instanceCloudAssistantStatus;
        }

    }

}
