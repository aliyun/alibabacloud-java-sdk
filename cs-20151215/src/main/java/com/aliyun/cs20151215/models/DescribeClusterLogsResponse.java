// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeClusterLogsResponse extends TeaModel {
    @NameInMap("headers")
    @Validation(required = true)
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    @Validation(required = true)
    public Integer statusCode;

    @NameInMap("body")
    @Validation(required = true)
    public java.util.List<DescribeClusterLogsResponseBody> body;

    public static DescribeClusterLogsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterLogsResponse self = new DescribeClusterLogsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeClusterLogsResponse setHeaders(java.util.Map<String, String> headers) {
        this.headers = headers;
        return this;
    }
    public java.util.Map<String, String> getHeaders() {
        return this.headers;
    }

    public DescribeClusterLogsResponse setStatusCode(Integer statusCode) {
        this.statusCode = statusCode;
        return this;
    }
    public Integer getStatusCode() {
        return this.statusCode;
    }

    public DescribeClusterLogsResponse setBody(java.util.List<DescribeClusterLogsResponseBody> body) {
        this.body = body;
        return this;
    }
    public java.util.List<DescribeClusterLogsResponseBody> getBody() {
        return this.body;
    }

    public static class DescribeClusterLogsResponseBody extends TeaModel {
        // 日志ID。
        @NameInMap("ID")
        public Long ID;

        // 集群ID。
        @NameInMap("cluster_id")
        public String clusterId;

        // 日志内容。
        @NameInMap("cluster_log")
        public String clusterLog;

        // 日志创建时间。
        @NameInMap("created")
        public String created;

        // 日志更新时间。
        @NameInMap("updated")
        public String updated;

        public static DescribeClusterLogsResponseBody build(java.util.Map<String, ?> map) throws Exception {
            DescribeClusterLogsResponseBody self = new DescribeClusterLogsResponseBody();
            return TeaModel.build(map, self);
        }

        public DescribeClusterLogsResponseBody setID(Long ID) {
            this.ID = ID;
            return this;
        }
        public Long getID() {
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

        public DescribeClusterLogsResponseBody setUpdated(String updated) {
            this.updated = updated;
            return this;
        }
        public String getUpdated() {
            return this.updated;
        }

    }

}
