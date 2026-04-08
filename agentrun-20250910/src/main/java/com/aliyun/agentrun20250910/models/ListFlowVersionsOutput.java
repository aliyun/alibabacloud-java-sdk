// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class ListFlowVersionsOutput extends TeaModel {
    @NameInMap("items")
    public java.util.List<FlowVersion> items;

    @NameInMap("pageNumber")
    public Integer pageNumber;

    @NameInMap("pageSize")
    public Integer pageSize;

    @NameInMap("total")
    public Integer total;

    public static ListFlowVersionsOutput build(java.util.Map<String, ?> map) throws Exception {
        ListFlowVersionsOutput self = new ListFlowVersionsOutput();
        return TeaModel.build(map, self);
    }

    public ListFlowVersionsOutput setItems(java.util.List<FlowVersion> items) {
        this.items = items;
        return this;
    }
    public java.util.List<FlowVersion> getItems() {
        return this.items;
    }

    public ListFlowVersionsOutput setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListFlowVersionsOutput setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListFlowVersionsOutput setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

}
