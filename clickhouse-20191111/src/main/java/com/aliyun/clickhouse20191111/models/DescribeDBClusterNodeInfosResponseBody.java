// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.clickhouse20191111.models;

import com.aliyun.tea.*;

public class DescribeDBClusterNodeInfosResponseBody extends TeaModel {
    @NameInMap("NodeInfos")
    public java.util.List<DescribeDBClusterNodeInfosResponseBodyNodeInfos> nodeInfos;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>746CD303-0B82-5E8D-886D-93A9FAF3A876</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalNodeCount")
    public Integer totalNodeCount;

    @NameInMap("ZkNodeInfos")
    public java.util.List<DescribeDBClusterNodeInfosResponseBodyZkNodeInfos> zkNodeInfos;

    public static DescribeDBClusterNodeInfosResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBClusterNodeInfosResponseBody self = new DescribeDBClusterNodeInfosResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDBClusterNodeInfosResponseBody setNodeInfos(java.util.List<DescribeDBClusterNodeInfosResponseBodyNodeInfos> nodeInfos) {
        this.nodeInfos = nodeInfos;
        return this;
    }
    public java.util.List<DescribeDBClusterNodeInfosResponseBodyNodeInfos> getNodeInfos() {
        return this.nodeInfos;
    }

    public DescribeDBClusterNodeInfosResponseBody setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDBClusterNodeInfosResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public DescribeDBClusterNodeInfosResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDBClusterNodeInfosResponseBody setTotalNodeCount(Integer totalNodeCount) {
        this.totalNodeCount = totalNodeCount;
        return this;
    }
    public Integer getTotalNodeCount() {
        return this.totalNodeCount;
    }

    public DescribeDBClusterNodeInfosResponseBody setZkNodeInfos(java.util.List<DescribeDBClusterNodeInfosResponseBodyZkNodeInfos> zkNodeInfos) {
        this.zkNodeInfos = zkNodeInfos;
        return this;
    }
    public java.util.List<DescribeDBClusterNodeInfosResponseBodyZkNodeInfos> getZkNodeInfos() {
        return this.zkNodeInfos;
    }

    public static class DescribeDBClusterNodeInfosResponseBodyNodeInfos extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("FailoverTesting")
        public Boolean failoverTesting;

        /**
         * <strong>example:</strong>
         * <p>172.168.0.1</p>
         */
        @NameInMap("NodeIp")
        public String nodeIp;

        /**
         * <strong>example:</strong>
         * <p>ck-bp108z124a8****</p>
         */
        @NameInMap("NodeName")
        public String nodeName;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ReplicaId")
        public String replicaId;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("ShardId")
        public String shardId;

        public static DescribeDBClusterNodeInfosResponseBodyNodeInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBClusterNodeInfosResponseBodyNodeInfos self = new DescribeDBClusterNodeInfosResponseBodyNodeInfos();
            return TeaModel.build(map, self);
        }

        public DescribeDBClusterNodeInfosResponseBodyNodeInfos setFailoverTesting(Boolean failoverTesting) {
            this.failoverTesting = failoverTesting;
            return this;
        }
        public Boolean getFailoverTesting() {
            return this.failoverTesting;
        }

        public DescribeDBClusterNodeInfosResponseBodyNodeInfos setNodeIp(String nodeIp) {
            this.nodeIp = nodeIp;
            return this;
        }
        public String getNodeIp() {
            return this.nodeIp;
        }

        public DescribeDBClusterNodeInfosResponseBodyNodeInfos setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

        public DescribeDBClusterNodeInfosResponseBodyNodeInfos setReplicaId(String replicaId) {
            this.replicaId = replicaId;
            return this;
        }
        public String getReplicaId() {
            return this.replicaId;
        }

        public DescribeDBClusterNodeInfosResponseBodyNodeInfos setShardId(String shardId) {
            this.shardId = shardId;
            return this;
        }
        public String getShardId() {
            return this.shardId;
        }

    }

    public static class DescribeDBClusterNodeInfosResponseBodyZkNodeInfos extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("FailoverTesting")
        public Boolean failoverTesting;

        /**
         * <strong>example:</strong>
         * <p>ck-bp108z124a8****</p>
         */
        @NameInMap("NodeName")
        public String nodeName;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ReplicaId")
        public String replicaId;

        public static DescribeDBClusterNodeInfosResponseBodyZkNodeInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeDBClusterNodeInfosResponseBodyZkNodeInfos self = new DescribeDBClusterNodeInfosResponseBodyZkNodeInfos();
            return TeaModel.build(map, self);
        }

        public DescribeDBClusterNodeInfosResponseBodyZkNodeInfos setFailoverTesting(Boolean failoverTesting) {
            this.failoverTesting = failoverTesting;
            return this;
        }
        public Boolean getFailoverTesting() {
            return this.failoverTesting;
        }

        public DescribeDBClusterNodeInfosResponseBodyZkNodeInfos setNodeName(String nodeName) {
            this.nodeName = nodeName;
            return this;
        }
        public String getNodeName() {
            return this.nodeName;
        }

        public DescribeDBClusterNodeInfosResponseBodyZkNodeInfos setReplicaId(String replicaId) {
            this.replicaId = replicaId;
            return this;
        }
        public String getReplicaId() {
            return this.replicaId;
        }

    }

}
