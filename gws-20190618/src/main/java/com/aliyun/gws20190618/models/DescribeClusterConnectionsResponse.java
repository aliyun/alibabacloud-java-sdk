// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gws20190618.models;

import com.aliyun.tea.*;

public class DescribeClusterConnectionsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TaskFinished")
    @Validation(required = true)
    public Boolean taskFinished;

    @NameInMap("TaskId")
    @Validation(required = true)
    public String taskId;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Long totalCount;

    @NameInMap("Connections")
    @Validation(required = true)
    public java.util.List<DescribeClusterConnectionsResponseConnections> connections;

    public static DescribeClusterConnectionsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterConnectionsResponse self = new DescribeClusterConnectionsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeClusterConnectionsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeClusterConnectionsResponse setTaskFinished(Boolean taskFinished) {
        this.taskFinished = taskFinished;
        return this;
    }
    public Boolean getTaskFinished() {
        return this.taskFinished;
    }

    public DescribeClusterConnectionsResponse setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public DescribeClusterConnectionsResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public DescribeClusterConnectionsResponse setConnections(java.util.List<DescribeClusterConnectionsResponseConnections> connections) {
        this.connections = connections;
        return this;
    }
    public java.util.List<DescribeClusterConnectionsResponseConnections> getConnections() {
        return this.connections;
    }

    public static class DescribeClusterConnectionsResponseConnections extends TeaModel {
        @NameInMap("InstanceId")
        @Validation(required = true)
        public String instanceId;

        @NameInMap("InstanceName")
        @Validation(required = true)
        public String instanceName;

        @NameInMap("HostName")
        @Validation(required = true)
        public String hostName;

        @NameInMap("ClientName")
        @Validation(required = true)
        public String clientName;

        @NameInMap("LogonTime")
        @Validation(required = true)
        public String logonTime;

        @NameInMap("LogoffTime")
        @Validation(required = true)
        public String logoffTime;

        @NameInMap("LogoffStatus")
        @Validation(required = true)
        public String logoffStatus;

        public static DescribeClusterConnectionsResponseConnections build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterConnectionsResponseConnections self = new DescribeClusterConnectionsResponseConnections();
            return TeaModel.build(map, self);
        }

        public DescribeClusterConnectionsResponseConnections setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeClusterConnectionsResponseConnections setInstanceName(String instanceName) {
            this.instanceName = instanceName;
            return this;
        }
        public String getInstanceName() {
            return this.instanceName;
        }

        public DescribeClusterConnectionsResponseConnections setHostName(String hostName) {
            this.hostName = hostName;
            return this;
        }
        public String getHostName() {
            return this.hostName;
        }

        public DescribeClusterConnectionsResponseConnections setClientName(String clientName) {
            this.clientName = clientName;
            return this;
        }
        public String getClientName() {
            return this.clientName;
        }

        public DescribeClusterConnectionsResponseConnections setLogonTime(String logonTime) {
            this.logonTime = logonTime;
            return this;
        }
        public String getLogonTime() {
            return this.logonTime;
        }

        public DescribeClusterConnectionsResponseConnections setLogoffTime(String logoffTime) {
            this.logoffTime = logoffTime;
            return this;
        }
        public String getLogoffTime() {
            return this.logoffTime;
        }

        public DescribeClusterConnectionsResponseConnections setLogoffStatus(String logoffStatus) {
            this.logoffStatus = logoffStatus;
            return this;
        }
        public String getLogoffStatus() {
            return this.logoffStatus;
        }

    }

}
