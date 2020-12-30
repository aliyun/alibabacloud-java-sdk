// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gws20190618.models;

import com.aliyun.tea.*;

public class DescribeClusterConnectionsResponseBody extends TeaModel {
    @NameInMap("Connections")
    public java.util.List<DescribeClusterConnectionsResponseBodyConnections> connections;

    @NameInMap("TotalCount")
    public Long totalCount;

    @NameInMap("TaskId")
    public String taskId;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TaskFinished")
    public Boolean taskFinished;

    public static DescribeClusterConnectionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterConnectionsResponseBody self = new DescribeClusterConnectionsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeClusterConnectionsResponseBody setConnections(java.util.List<DescribeClusterConnectionsResponseBodyConnections> connections) {
        this.connections = connections;
        return this;
    }
    public java.util.List<DescribeClusterConnectionsResponseBodyConnections> getConnections() {
        return this.connections;
    }

    public DescribeClusterConnectionsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public DescribeClusterConnectionsResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public DescribeClusterConnectionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeClusterConnectionsResponseBody setTaskFinished(Boolean taskFinished) {
        this.taskFinished = taskFinished;
        return this;
    }
    public Boolean getTaskFinished() {
        return this.taskFinished;
    }

    public static class DescribeClusterConnectionsResponseBodyConnections extends TeaModel {
        @NameInMap("LogoffStatus")
        public String logoffStatus;

        @NameInMap("InstanceName")
        public String instanceName;

        @NameInMap("LogonTime")
        public String logonTime;

        @NameInMap("HostName")
        public String hostName;

        @NameInMap("LogoffTime")
        public String logoffTime;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("ClientName")
        public String clientName;

        public static DescribeClusterConnectionsResponseBodyConnections build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterConnectionsResponseBodyConnections self = new DescribeClusterConnectionsResponseBodyConnections();
            return TeaModel.build(map, self);
        }

        public DescribeClusterConnectionsResponseBodyConnections setLogoffStatus(String logoffStatus) {
            this.logoffStatus = logoffStatus;
            return this;
        }
        public String getLogoffStatus() {
            return this.logoffStatus;
        }

        public DescribeClusterConnectionsResponseBodyConnections setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribeClusterConnectionsResponseBodyConnections setLogonTime(String logonTime) {
            this.logonTime = logonTime;
            return this;
        }
        public String getLogonTime() {
            return this.logonTime;
        }

        public DescribeClusterConnectionsResponseBodyConnections setHostName(String hostName) {
            this.hostName = hostName;
            return this;
        }
        public String getHostName() {
            return this.hostName;
        }

        public DescribeClusterConnectionsResponseBodyConnections setLogoffTime(String logoffTime) {
            this.logoffTime = logoffTime;
            return this;
        }
        public String getLogoffTime() {
            return this.logoffTime;
        }

        public DescribeClusterConnectionsResponseBodyConnections setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeClusterConnectionsResponseBodyConnections setClientName(String clientName) {
            this.clientName = clientName;
            return this;
        }
        public String getClientName() {
            return this.clientName;
        }

    }

}
