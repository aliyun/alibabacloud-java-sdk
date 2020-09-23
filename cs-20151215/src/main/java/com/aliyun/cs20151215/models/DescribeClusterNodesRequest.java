// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeClusterNodesRequest extends TeaModel {
    // 每页展示结果数。
    @NameInMap("pageSize")
    public String pageSize;

    // 结果只展示几页。
    @NameInMap("pageNumber")
    public String pageNumber;

    // 节点池ID。
    @NameInMap("nodepool_id")
    public String nodepoolId;

    // 节点状态信息。
    @NameInMap("state")
    public String state;

    public static DescribeClusterNodesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterNodesRequest self = new DescribeClusterNodesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeClusterNodesRequest setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public DescribeClusterNodesRequest setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

    public DescribeClusterNodesRequest setNodepoolId(String nodepoolId) {
        this.nodepoolId = nodepoolId;
        return this;
    }
    public String getNodepoolId() {
        return this.nodepoolId;
    }

    public DescribeClusterNodesRequest setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

}
