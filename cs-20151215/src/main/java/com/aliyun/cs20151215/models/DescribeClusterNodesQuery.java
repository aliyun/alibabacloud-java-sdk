// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeClusterNodesQuery extends TeaModel {
    @NameInMap("pageSize")
    public String pageSize;

    @NameInMap("pageNumber")
    public String pageNumber;

    @NameInMap("nodepool_id")
    public String nodepoolId;

    @NameInMap("state")
    public String state;

    public static DescribeClusterNodesQuery build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterNodesQuery self = new DescribeClusterNodesQuery();
        return TeaModel.build(map, self);
    }

}
