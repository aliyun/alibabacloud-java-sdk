// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeClusterNodePoolsRequest extends TeaModel {
    /**
     * <p>节点池名称。</p>
     * 
     * <strong>example:</strong>
     * <p>nodepool-test</p>
     */
    @NameInMap("NodepoolName")
    public String nodepoolName;

    public static DescribeClusterNodePoolsRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterNodePoolsRequest self = new DescribeClusterNodePoolsRequest();
        return TeaModel.build(map, self);
    }

    public DescribeClusterNodePoolsRequest setNodepoolName(String nodepoolName) {
        this.nodepoolName = nodepoolName;
        return this;
    }
    public String getNodepoolName() {
        return this.nodepoolName;
    }

}
