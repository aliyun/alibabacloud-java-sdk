// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class ListToolsOutputV2 extends TeaModel {
    /**
     * <p>当前页的工具详细信息列表</p>
     */
    @NameInMap("items")
    public java.util.List<Tool> items;

    /**
     * <p>当前页码，从 1 开始</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNumber")
    public Integer pageNumber;

    /**
     * <p>每页返回的工具数量</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <p>符合条件的工具总数</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("total")
    public Integer total;

    public static ListToolsOutputV2 build(java.util.Map<String, ?> map) throws Exception {
        ListToolsOutputV2 self = new ListToolsOutputV2();
        return TeaModel.build(map, self);
    }

    public ListToolsOutputV2 setItems(java.util.List<Tool> items) {
        this.items = items;
        return this;
    }
    public java.util.List<Tool> getItems() {
        return this.items;
    }

    public ListToolsOutputV2 setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListToolsOutputV2 setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListToolsOutputV2 setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

}
