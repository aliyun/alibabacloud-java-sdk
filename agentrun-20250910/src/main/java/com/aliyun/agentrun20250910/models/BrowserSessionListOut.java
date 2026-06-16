// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class BrowserSessionListOut extends TeaModel {
    /**
     * <p>An array of browser session objects.</p>
     * 
     * <strong>example:</strong>
     * <p>[]</p>
     */
    @NameInMap("items")
    public java.util.List<BrowserSessionOut> items;

    /**
     * <p>The current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of sessions per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <p>The total number of sessions.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("total")
    public Long total;

    public static BrowserSessionListOut build(java.util.Map<String, ?> map) throws Exception {
        BrowserSessionListOut self = new BrowserSessionListOut();
        return TeaModel.build(map, self);
    }

    public BrowserSessionListOut setItems(java.util.List<BrowserSessionOut> items) {
        this.items = items;
        return this;
    }
    public java.util.List<BrowserSessionOut> getItems() {
        return this.items;
    }

    public BrowserSessionListOut setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public BrowserSessionListOut setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public BrowserSessionListOut setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

}
