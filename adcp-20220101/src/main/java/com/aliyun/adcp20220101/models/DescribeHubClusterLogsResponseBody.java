// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adcp20220101.models;

import com.aliyun.tea.*;

public class DescribeHubClusterLogsResponseBody extends TeaModel {
    /**
     * <p>Brief information about operation logs.</p>
     */
    @NameInMap("Logs")
    public java.util.List<DescribeHubClusterLogsResponseBodyLogs> logs;

    /**
     * <p>The ID of the request.</p>
     */
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
        /**
         * <p>The ID of the master instance.</p>
         */
        @NameInMap("ClusterId")
        public String clusterId;

        /**
         * <p>A log of the master instance.</p>
         */
        @NameInMap("ClusterLog")
        public String clusterLog;

        /**
         * <p>The time when the log was created. Format: <i>yyyy-mm-dd</i>t<i>hh:mm:ss</i>z (UTC time).</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The severity level of the log. Valid values: - error: errors. - warn: warnings. - info: information.</p>
         */
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
