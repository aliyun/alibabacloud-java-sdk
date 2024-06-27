// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.gpdb20160503.models;

import com.aliyun.tea.*;

public class DescribeDBClusterPerformanceRequest extends TeaModel {
    /**
     * <p>The instance ID.</p>
     * <blockquote>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/86911.html">DescribeDBInstances</a> operation to query details about all AnalyticDB for PostgreSQL instances within a region, including instance IDs.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>gp-bp12ga6v69h86****</p>
     */
    @NameInMap("DBInstanceId")
    public String DBInstanceId;

    /**
     * <p>The end of the time range to query. Specify the time in the ISO 8601 standard in the <code>YYYY-MM-DDTHH:mmZ</code> format.</p>
     * <blockquote>
     * <p>The end time must be later than the start time. The maximum time range that can be specified is seven days.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-11-03T15:10Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The performance metric that you want to query. Separate multiple values with commas (,). For more information, see <a href="https://help.aliyun.com/document_detail/86943.html">Performance parameters</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>adbpg_conn_count</p>
     */
    @NameInMap("Key")
    public String key;

    /**
     * <p>The node type. Valid values:</p>
     * <ul>
     * <li><strong>master</strong>: coordinator node.</li>
     * <li><strong>segment</strong>: compute node.</li>
     * </ul>
     * <blockquote>
     * <p>If you do not specify this parameter, the performance metrics of all nodes are returned.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>master</p>
     */
    @NameInMap("NodeType")
    public String nodeType;

    /**
     * <p>The nodes for which you want to query performance metrics. Separate multiple values with commas (,). Example: <code>master-10******1,master-10******2</code>. You can call the <a href="https://help.aliyun.com/document_detail/390136.html">DescribeDBClusterNode</a> operation to query the names of nodes.</p>
     * <p>You can also filter the nodes based on their metric values. Valid values:</p>
     * <ul>
     * <li><strong>top10</strong>: the 10 nodes that have the highest metric values.</li>
     * <li><strong>top20</strong>: the 20 nodes that have the highest metric values.</li>
     * <li><strong>bottom10</strong>: the 10 nodes that have the lowest metric values.</li>
     * <li><strong>bottom20</strong>: the 20 nodes that have the lowest metric values.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>top10</p>
     */
    @NameInMap("Nodes")
    public String nodes;

    @NameInMap("ResourceGroupName")
    public String resourceGroupName;

    /**
     * <p>The beginning of the time range to query. Specify the time in the ISO 8601 standard in the <code>YYYY-MM-DDTHH:mmZ</code> format.</p>
     * <blockquote>
     * <p>You can query monitoring information only within the last 30 days.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>2021-11-03T15:00Z</p>
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

    public DescribeDBClusterPerformanceRequest setResourceGroupName(String resourceGroupName) {
        this.resourceGroupName = resourceGroupName;
        return this;
    }
    public String getResourceGroupName() {
        return this.resourceGroupName;
    }

    public DescribeDBClusterPerformanceRequest setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

}
