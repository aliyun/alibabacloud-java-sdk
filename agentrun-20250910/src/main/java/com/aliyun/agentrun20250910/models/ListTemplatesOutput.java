// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class ListTemplatesOutput extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("items")
    public java.util.List<Template> items;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNumber")
    public Integer pageNumber;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("total")
    public Integer total;

    public static ListTemplatesOutput build(java.util.Map<String, ?> map) throws Exception {
        ListTemplatesOutput self = new ListTemplatesOutput();
        return TeaModel.build(map, self);
    }

    public ListTemplatesOutput setItems(java.util.List<Template> items) {
        this.items = items;
        return this;
    }
    public java.util.List<Template> getItems() {
        return this.items;
    }

    public ListTemplatesOutput setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListTemplatesOutput setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListTemplatesOutput setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

}
