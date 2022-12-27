// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class DescribeCloudAssistantStatusResponseBody extends TeaModel {
    // Details about the installation status of the Cloud Assistant client.
    @NameInMap("InstanceCloudAssistantStatusSet")
    public DescribeCloudAssistantStatusResponseBodyInstanceCloudAssistantStatusSet instanceCloudAssistantStatusSet;

    // The page number of the returned page.
    @NameInMap("PageNumber")
    public Long pageNumber;

    // The number of entries returned per page.
    @NameInMap("PageSize")
    public Long pageSize;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // The total number of instances.
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
        // The number of commands that are being run.
        @NameInMap("ActiveTaskCount")
        public Long activeTaskCount;

        // Indicates whether the Cloud Assistant client is installed on the instance.
        @NameInMap("CloudAssistantStatus")
        public String cloudAssistantStatus;

        // The version number of the Cloud Assistant client.
        @NameInMap("CloudAssistantVersion")
        public String cloudAssistantVersion;

        // The ID of the instance.
        @NameInMap("InstanceId")
        public String instanceId;

        // The total number of commands that have been run.
        @NameInMap("InvocationCount")
        public Long invocationCount;

        // The last heartbeat time of Cloud Assistant.
        @NameInMap("LastHeartbeatTime")
        public String lastHeartbeatTime;

        // The time when commands were last run.
        @NameInMap("LastInvokedTime")
        public String lastInvokedTime;

        // The operating system type of the instance. Valid values:
        // 
        // *   Windows
        // *   Linux
        @NameInMap("OSType")
        public String OSType;

        // Indicates whether the version of the Cloud Assistant client supports the session management feature.
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
