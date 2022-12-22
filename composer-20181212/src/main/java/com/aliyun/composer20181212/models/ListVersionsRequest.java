// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.composer20181212.models;

import com.aliyun.tea.*;

public class ListVersionsRequest extends TeaModel {
    // The ID of the workflow whose versions you want to query.
    @NameInMap("FlowId")
    public String flowId;

    // The page number of the page to return. The value must be an integer that is greater than 0. Default value: 1.
    @NameInMap("PageNumber")
    public Integer pageNumber;

    // The number of versions to return on each page. One page contains a maximum of 100 versions. Default value: 10.
    @NameInMap("PageSize")
    public Integer pageSize;

    public static ListVersionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListVersionsRequest self = new ListVersionsRequest();
        return TeaModel.build(map, self);
    }

    public ListVersionsRequest setFlowId(String flowId) {
        this.flowId = flowId;
        return this;
    }
    public String getFlowId() {
        return this.flowId;
    }

    public ListVersionsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListVersionsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
