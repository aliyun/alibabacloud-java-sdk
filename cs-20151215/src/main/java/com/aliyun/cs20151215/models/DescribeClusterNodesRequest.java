// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeClusterNodesRequest extends TeaModel {
    /**
     * <p>The IDs of the nodes that you want to query. Separate multiple node IDs with commas (,).</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;i-bp11xjhwkj8k966u****,i-bp1dmhc2bu5igkyq****&quot;</p>
     */
    @NameInMap("instanceIds")
    public String instanceIds;

    /**
     * <p>The node pool ID.</p>
     * 
     * <strong>example:</strong>
     * <p>np****</p>
     */
    @NameInMap("nodepool_id")
    public String nodepoolId;

    /**
     * <p>The page number.</p>
     * <p>Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNumber")
    public String pageNumber;

    /**
     * <p>The number of entries per page. Valid values: 1 to 100.</p>
     * <p>Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public String pageSize;

    /**
     * <p>The node state that you want to use to filter nodes. Valid values:</p>
     * <ul>
     * <li><code>all</code>: query nodes in the following four states.</li>
     * <li><code>running</code>: query nodes in the running state.</li>
     * <li><code>removing</code>: query nodes that are being removed.</li>
     * <li><code>initial</code>: query nodes that are being initialized.</li>
     * <li><code>failed</code>: query nodes that fail to be created.</li>
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
