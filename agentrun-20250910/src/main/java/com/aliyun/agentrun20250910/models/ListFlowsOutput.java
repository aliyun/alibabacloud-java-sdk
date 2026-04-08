// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class ListFlowsOutput extends TeaModel {
    @NameInMap("items")
    public java.util.List<Flow> items;

    @NameInMap("pageNumber")
    public Integer pageNumber;

    @NameInMap("pageSize")
    public Integer pageSize;

    @NameInMap("total")
    public Integer total;

    public static ListFlowsOutput build(java.util.Map<String, ?> map) throws Exception {
        ListFlowsOutput self = new ListFlowsOutput();
        return TeaModel.build(map, self);
    }

    public ListFlowsOutput setItems(java.util.List<Flow> items) {
        this.items = items;
        return this;
    }
    public java.util.List<Flow> getItems() {
        return this.items;
    }

    public ListFlowsOutput setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListFlowsOutput setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListFlowsOutput setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

}
