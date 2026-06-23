// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeClusterLogsResponse extends TeaModel {
    @NameInMap("headers")
    public java.util.Map<String, String> headers;

    @NameInMap("statusCode")
    public Integer statusCode;

    @NameInMap("body")
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
        /**
         * <p>日志ID。</p>
         * 
         * <strong>example:</strong>
         * <p>73117232145******</p>
         */
        @NameInMap("ID")
        public Long ID;

        /**
         * <p>集群ID。</p>
         * 
         * <strong>example:</strong>
         * <p>c23421cfa74454bc8b37163fd19af***</p>
         */
        @NameInMap("cluster_id")
        public String clusterId;

        /**
         * <p>日志内容。</p>
         * 
         * <strong>example:</strong>
         * <p>start to update cluster status to CREATE_COMPLETE</p>
         */
        @NameInMap("cluster_log")
        public String clusterLog;

        /**
         * <p>日志产生时间。</p>
         * 
         * <strong>example:</strong>
         * <p>2025-04-10T17:54:26+08:00</p>
         */
        @NameInMap("created")
        public String created;

        /**
         * <p>日志更新时间。</p>
         * 
         * <strong>example:</strong>
         * <p>2025-04-10T17:54:26+08:00</p>
         */
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
