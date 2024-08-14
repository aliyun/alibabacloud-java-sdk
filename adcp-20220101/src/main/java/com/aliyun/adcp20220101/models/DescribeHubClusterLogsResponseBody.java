// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.adcp20220101.models;

import com.aliyun.tea.*;

public class DescribeHubClusterLogsResponseBody extends TeaModel {
    /**
     * <p>The details of operations logs.</p>
     */
    @NameInMap("Logs")
    public java.util.List<DescribeHubClusterLogsResponseBodyLogs> logs;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>661192D7-25A6-54C2-B643-1129CB7D2768</p>
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
         * <p>The ID of the Fleet instance.</p>
         * 
         * <strong>example:</strong>
         * <p>c102fe5f1ee5d4c87a68121a77d8b0f38</p>
         */
        @NameInMap("ClusterId")
        public String clusterId;

        /**
         * <p>The log of the Fleet instance.</p>
         * 
         * <strong>example:</strong>
         * <p>Cluster Created</p>
         */
        @NameInMap("ClusterLog")
        public String clusterLog;

        /**
         * <p>The time when the log was created. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-12-02T11:48:15+08:00</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The log level. Valid values:</p>
         * <ul>
         * <li>error</li>
         * <li>warn</li>
         * <li>info</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>INFO</p>
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
