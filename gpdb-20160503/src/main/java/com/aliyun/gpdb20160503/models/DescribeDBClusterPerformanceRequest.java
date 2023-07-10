// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeDBClusterPerformanceRequest extends TeaModel {
    /**
     * <p>The ID of the instance.</p>
     * <br>
     * <p>>  You can call the [DescribeDBInstances](~~86911~~) operation to query the details of all AnalyticDB for PostgreSQL instances in a specific region, including instance IDs.</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The end of the time range to query. Specify the time in the ISO 8601 standard in the `YYYY-MM-DDTHH:mmZ` format.</p>
     * <br>
     * <p>>  The end time must be later than the start time. The interval cannot be more than seven days.</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The performance metric that you want to query. Separate multiple values with commas (,). For more information, see [Performance parameters](~~86943~~).</p>
     */
    @NameInMap("Key")
    public String key;

    /**
     * <p>The node type. Valid values:</p>
     * <br>
     * <p>*   **master**: coordinator node</p>
     * <p>*   **segment**: compute node</p>
     * <br>
     * <p>>  If you do not specify this parameter, the performance metrics of all nodes are returned.</p>
     */
    @NameInMap("NodeType")
    public String nodeType;

    /**
     * <p>The nodes for which you want to query performance metrics. Separate multiple values with commas (,). Example: `master-10******1,master-10******2`. You can call the [DescribeDBClusterNode](~~390136~~) operation to query the names of nodes.</p>
     * <br>
     * <p>The nodes can also be filtered based on their metric values. Valid values:</p>
     * <br>
     * <p>*   **top10**: the 10 nodes that have the highest metric values</p>
     * <p>*   **top20**: the 20 nodes that have the highest metric values</p>
     * <p>*   **bottom10**: the 10 nodes that have the lowest metric values</p>
     * <p>*   **bottom20**: the 20 nodes that have the lowest metric values</p>
     */
    @NameInMap("Nodes")
    public String nodes;

    /**
     * <p>The beginning of the time range to query. Specify the time in the ISO 8601 standard in the `YYYY-MM-DDTHH:mmZ` format.</p>
     * <br>
     * <p>>  You can query monitoring information only within the last 30 days.</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    public static DescribeDBClusterPerformanceRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeDBClusterPerformanceRequest self = new DescribeDBClusterPerformanceRequest();
        return TeaModel.build(map, self);
    }

    public DescribeDBClusterPerformanceRequest setDBInstanceId(String DBInstanceId) {
        this.DBInstanceId = DBInstanceId;
        return this;
    }
    public String getDBInstanceId() {
        return this.DBInstanceId;
    }

    public DescribeDBClusterPerformanceRequest setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeDBClusterPerformanceRequest setKey(String key) {
        this.key = key;
        return this;
    }
    public String getKey() {
        return this.key;
    }

    public DescribeDBClusterPerformanceRequest setNodeType(String nodeType) {
        this.nodeType = nodeType;
        return this;
    }
    public String getNodeType() {
        return this.nodeType;
    }

    public DescribeDBClusterPerformanceRequest setNodes(String nodes) {
        this.nodes = nodes;
        return this;
    }
    public String getNodes() {
        return this.nodes;
    }

    public DescribeDBClusterPerformanceRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
