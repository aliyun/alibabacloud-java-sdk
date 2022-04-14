// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adcp20220101.models;

import com.aliyun.tea.*;

public class DescribeHubClusterLogsResponseBody extends TeaModel {
    @NameInMap("Logs")
    public java.util.List<DescribeHubClusterLogsResponseBodyLogs> logs;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeHubClusterLogsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeHubClusterLogsResponseBody self = new DescribeHubClusterLogsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeHubClusterLogsResponseBody setLogs(java.util.List<DescribeHubClusterLogsResponseBodyLogs> logs) {
        this.logs = logs;
        return this;
    }
    public java.util.List<DescribeHubClusterLogsResponseBodyLogs> getLogs() {
        return this.logs;
    }

    public DescribeHubClusterLogsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeHubClusterLogsResponseBodyLogs extends TeaModel {
        @NameInMap("ClusterId")
        public String clusterId;

        @NameInMap("ClusterLog")
        public String clusterLog;

        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("LogLevel")
        public String logLevel;

        public static DescribeHubClusterLogsResponseBodyLogs build(java.util.Map<String, ?> map) throws Exception {
            DescribeHubClusterLogsResponseBodyLogs self = new DescribeHubClusterLogsResponseBodyLogs();
            return TeaModel.build(map, self);
        }

        public DescribeHubClusterLogsResponseBodyLogs setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public DescribeHubClusterLogsResponseBodyLogs setClusterLog(String clusterLog) {
            this.clusterLog = clusterLog;
            return this;
        }
        public String getClusterLog() {
            return this.clusterLog;
        }

        public DescribeHubClusterLogsResponseBodyLogs setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeHubClusterLogsResponseBodyLogs setLogLevel(String logLevel) {
            this.logLevel = logLevel;
            return this;
        }
        public String getLogLevel() {
            return this.logLevel;
        }

    }

}
