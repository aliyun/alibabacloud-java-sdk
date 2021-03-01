// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.edas20170801.models;

import com.aliyun.tea.*;

public class ListChildrenStacksRequest extends TeaModel {
    @NameInMap("StackId")
    public Long stackId;

    @NameInMap("CurrentPage")
    public Integer currentPage;

    @NameInMap("PageSize")
    public Integer pageSize;

    public static ListChildrenStacksRequest build(java.util.Map<String, ?> map) throws Exception {
        ListChildrenStacksRequest self = new ListChildrenStacksRequest();
        return TeaModel.build(map, self);
    }

    public ListChildrenStacksRequest setStackId(Long stackId) {
        this.stackId = stackId;
        return this;
    }
    public Long getStackId() {
        return this.stackId;
    }

    public ListChildrenStacksRequest setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListChildrenStacksRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

}
