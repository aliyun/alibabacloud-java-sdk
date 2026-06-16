// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class ListBrowsersOutput extends TeaModel {
    /**
     * <p>Browser list</p>
     */
    @NameInMap("items")
    public java.util.List<Browser> items;

    /**
     * <p>Page number</p>
     */
    @NameInMap("pageNumber")
    public Integer pageNumber;

    /**
     * <p>Page size</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <p>Total count</p>
     */
    @NameInMap("total")
    public Long total;

    public static ListBrowsersOutput build(java.util.Map<String, ?> map) throws Exception {
        ListBrowsersOutput self = new ListBrowsersOutput();
        return TeaModel.build(map, self);
    }

    public ListBrowsersOutput setItems(java.util.List<Browser> items) {
        this.items = items;
        return this;
    }
    public java.util.List<Browser> getItems() {
        return this.items;
    }

    public ListBrowsersOutput setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListBrowsersOutput setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListBrowsersOutput setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

}
