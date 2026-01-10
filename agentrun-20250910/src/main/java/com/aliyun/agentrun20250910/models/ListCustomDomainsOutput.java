// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class ListCustomDomainsOutput extends TeaModel {
    @NameInMap("items")
    public java.util.List<CustomDomain> items;

    @NameInMap("pageNumber")
    public Integer pageNumber;

    @NameInMap("pageSize")
    public Integer pageSize;

    @NameInMap("total")
    public Integer total;

    public static ListCustomDomainsOutput build(java.util.Map<String, ?> map) throws Exception {
        ListCustomDomainsOutput self = new ListCustomDomainsOutput();
        return TeaModel.build(map, self);
    }

    public ListCustomDomainsOutput setItems(java.util.List<CustomDomain> items) {
        this.items = items;
        return this;
    }
    public java.util.List<CustomDomain> getItems() {
        return this.items;
    }

    public ListCustomDomainsOutput setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListCustomDomainsOutput setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListCustomDomainsOutput setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

}
