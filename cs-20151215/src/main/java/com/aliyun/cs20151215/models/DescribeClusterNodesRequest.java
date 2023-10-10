// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeClusterNodesRequest extends TeaModel {
    /**
     * <p>The IDs of the nodes that you want to query. Separate multiple node IDs with commas (,).</p>
     */
    @NameInMap("instanceIds")
    public String instanceIds;

    /**
     * <p>The node pool ID.</p>
     */
    @NameInMap("nodepool_id")
    public String nodepoolId;

    /**
     * <p>The page number.</p>
     * <br>
     * <p>Default value: 1.</p>
     */
    @NameInMap("pageNumber")
    public String pageNumber;

    /**
     * <p>The number of entries per page. Valid values: 1 to 100.</p>
     * <br>
     * <p>Default value: 10.</p>
     */
    @NameInMap("pageSize")
    public String pageSize;

    /**
     * <p>The node state that you want to use to filter nodes. Valid values:</p>
     * <br>
     * <p>*   `all`: query nodes in the following four states.</p>
     * <p>*   `running`: query nodes in the running state.</p>
     * <p>*   `removing`: query nodes that are being removed.</p>
     * <p>*   `initial`: query nodes that are being initialized.</p>
     * <p>*   `failed`: query nodes that fail to be created.</p>
     * <br>
     * <p>Default value: `all`.</p>
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
