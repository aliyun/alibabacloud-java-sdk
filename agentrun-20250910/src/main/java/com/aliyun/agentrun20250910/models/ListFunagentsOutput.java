// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class ListFunagentsOutput extends TeaModel {
    @NameInMap("items")
    public java.util.List<Funagent> items;

    @NameInMap("pageNumber")
    public Integer pageNumber;

    @NameInMap("pageSize")
    public Integer pageSize;

    @NameInMap("total")
    public Integer total;

    public static ListFunagentsOutput build(java.util.Map<String, ?> map) throws Exception {
        ListFunagentsOutput self = new ListFunagentsOutput();
        return TeaModel.build(map, self);
    }

    public ListFunagentsOutput setItems(java.util.List<Funagent> items) {
        this.items = items;
        return this;
    }
    public java.util.List<Funagent> getItems() {
        return this.items;
    }

    public ListFunagentsOutput setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListFunagentsOutput setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListFunagentsOutput setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

}
