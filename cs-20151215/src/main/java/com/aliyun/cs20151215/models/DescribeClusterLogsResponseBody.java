// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeClusterLogsResponseBody extends TeaModel {
    // 日志ID。
    @NameInMap("ID")
    public String ID;

    // 集群ID。
    @NameInMap("cluster_id")
    public String clusterId;

    // 日志详情。
    @NameInMap("cluster_log")
    public String clusterLog;

    // 日志创建时间。
    @NameInMap("created")
    public String created;

    // 日志级别。
    @NameInMap("log_level")
    public String logLevel;

    // 日志更新时间。
    @NameInMap("updated")
    public String updated;

    public static DescribeClusterLogsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterLogsResponseBody self = new DescribeClusterLogsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeClusterLogsResponseBody setID(String ID) {
        this.ID = ID;
        return this;
    }
    public String getID() {
        return this.ID;
    }

    public DescribeClusterLogsResponseBody setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DescribeClusterLogsResponseBody setClusterLog(String clusterLog) {
        this.clusterLog = clusterLog;
        return this;
    }
    public String getClusterLog() {
        return this.clusterLog;
    }

    public DescribeClusterLogsResponseBody setCreated(String created) {
        this.created = created;
        return this;
    }
    public String getCreated() {
        return this.created;
    }

    public DescribeClusterLogsResponseBody setLogLevel(String logLevel) {
        this.logLevel = logLevel;
        return this;
    }
    public String getLogLevel() {
        return this.logLevel;
    }

    public DescribeClusterLogsResponseBody setUpdated(String updated) {
        this.updated = updated;
        return this;
    }
    public String getUpdated() {
        return this.updated;
    }

}
