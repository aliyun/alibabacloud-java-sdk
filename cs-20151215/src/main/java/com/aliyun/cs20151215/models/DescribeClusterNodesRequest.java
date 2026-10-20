// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeClusterNodesRequest extends TeaModel {
    /**
     * <p>The list of node instance IDs. Separate multiple values with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;i-bp11xjhwkj8k966u****,i-bp1dmhc2bu5igkyq****&quot;</p>
     */
    @NameInMap("instanceIds")
    public String instanceIds;

    /**
     * <p>The list of node IP addresses used for filtering. Separate multiple values with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>192.168.0.1</p>
     */
    @NameInMap("nodeIps")
    public String nodeIps;

    /**
     * <p>The node labels used for filtering. Specify the labels as key=value pairs separated by commas (,). Multiple labels are evaluated with the AND operator. Only nodes that match all specified labels are returned.</p>
     * 
     * <strong>example:</strong>
     * <p>nodeLabels=app=nginx,env=prod</p>
     */
    @NameInMap("nodeLabels")
    public String nodeLabels;

    /**
     * <p>The list of node names used for filtering. Separate multiple values with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou.192.168.0.1</p>
     */
    @NameInMap("nodeNames")
    public String nodeNames;

    /**
     * <p>The node pool ID.</p>
     * 
     * <strong>example:</strong>
     * <p>npe25633140a7d4fbea56cd0479c******</p>
     */
    @NameInMap("nodepool_id")
    public String nodepoolId;

    /**
     * <p>The page number of the current query.</p>
     * <p>Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNumber")
    public String pageNumber;

    /**
     * <p>The maximum number of records to return per page. Valid values: 1 to 100.</p>
     * <p>Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public String pageSize;

    /**
     * <p>The running states of the cluster nodes used for filtering. Valid values:</p>
     * <ul>
     * <li><code>all</code>: does not filter nodes by running state and queries nodes in all states.</li>
     * <li><code>running</code>: the cluster nodes that are running.</li>
     * <li><code>removing</code>: the cluster nodes that are being removed.</li>
     * <li><code>initial</code>: the cluster nodes that are being initialized.</li>
     * <li><code>failed</code>: the cluster nodes that failed to be created.</li>
     * </ul>
     * <p>Default value: <code>all</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>running</p>
     */
    @NameInMap("state")
    public String state;

    public static DescribeClusterNodesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterNodesRequest self = new DescribeClusterNodesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeClusterNodesRequest setInstanceIds(String instanceIds) {
        this.instanceIds = instanceIds;
        return this;
    }
    public String getInstanceIds() {
        return this.instanceIds;
    }

    public DescribeClusterNodesRequest setNodeIps(String nodeIps) {
        this.nodeIps = nodeIps;
        return this;
    }
    public String getNodeIps() {
        return this.nodeIps;
    }

    public DescribeClusterNodesRequest setNodeLabels(String nodeLabels) {
        this.nodeLabels = nodeLabels;
        return this;
    }
    public String getNodeLabels() {
        return this.nodeLabels;
    }

    public DescribeClusterNodesRequest setNodeNames(String nodeNames) {
        this.nodeNames = nodeNames;
        return this;
    }
    public String getNodeNames() {
        return this.nodeNames;
    }

    public DescribeClusterNodesRequest setNodepoolId(String nodepoolId) {
        this.nodepoolId = nodepoolId;
        return this;
    }
    public String getNodepoolId() {
        return this.nodepoolId;
    }

    public DescribeClusterNodesRequest setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public DescribeClusterNodesRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public DescribeClusterNodesRequest setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

}
