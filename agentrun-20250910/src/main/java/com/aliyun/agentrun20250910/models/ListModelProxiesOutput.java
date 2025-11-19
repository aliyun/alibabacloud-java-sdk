// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class ListModelProxiesOutput extends TeaModel {
    @NameInMap("items")
    public java.util.List<ModelProxy> items;

    @NameInMap("pageNumber")
    public Integer pageNumber;

    @NameInMap("pageSize")
    public Integer pageSize;

    @NameInMap("total")
    public Long total;

    public static ListModelProxiesOutput build(java.util.Map<String, ?> map) throws Exception {
        ListModelProxiesOutput self = new ListModelProxiesOutput();
        return TeaModel.build(map, self);
    }

    public ListModelProxiesOutput setItems(java.util.List<ModelProxy> items) {
        this.items = items;
        return this;
    }
    public java.util.List<ModelProxy> getItems() {
        return this.items;
    }

    public ListModelProxiesOutput setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListModelProxiesOutput setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListModelProxiesOutput setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

}
