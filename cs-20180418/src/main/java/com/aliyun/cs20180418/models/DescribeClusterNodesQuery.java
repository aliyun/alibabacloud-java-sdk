// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20180418.models;

import com.aliyun.tea.*;

public class DescribeClusterNodesQuery extends TeaModel {
    @NameInMap("pageSize")
    public String pageSize;

    @NameInMap("pageNumber")
    public String pageNumber;

    public static DescribeClusterNodesQuery build(java.util.Map<String, ?> map) throws Exception {
        DescribeClusterNodesQuery self = new DescribeClusterNodesQuery();
        return TeaModel.build(map, self);
    }

    public DescribeClusterNodesQuery setPageSize(String pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public String getPageSize() {
        return this.pageSize;
    }

    public DescribeClusterNodesQuery setPageNumber(String pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public String getPageNumber() {
        return this.pageNumber;
    }

}
