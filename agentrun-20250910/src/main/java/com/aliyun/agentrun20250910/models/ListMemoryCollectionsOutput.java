// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class ListMemoryCollectionsOutput extends TeaModel {
    @NameInMap("items")
    public java.util.List<MemoryCollection> items;

    @NameInMap("pageNumber")
    public Integer pageNumber;

    @NameInMap("pageSize")
    public Integer pageSize;

    @NameInMap("total")
    public Long total;

    public static ListMemoryCollectionsOutput build(java.util.Map<String, ?> map) throws Exception {
        ListMemoryCollectionsOutput self = new ListMemoryCollectionsOutput();
        return TeaModel.build(map, self);
    }

    public ListMemoryCollectionsOutput setItems(java.util.List<MemoryCollection> items) {
        this.items = items;
        return this;
    }
    public java.util.List<MemoryCollection> getItems() {
        return this.items;
    }

    public ListMemoryCollectionsOutput setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListMemoryCollectionsOutput setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListMemoryCollectionsOutput setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

}
