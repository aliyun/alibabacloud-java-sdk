// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class ListModelConnectionsOutput extends TeaModel {
    /**
     * <p>A list of ModelConnection objects.</p>
     */
    @NameInMap("items")
    public java.util.List<ModelConnection> items;

    /**
     * <p>The current page number.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNumber")
    public Integer pageNumber;

    /**
     * <p>The number of entries per page.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <p>The total number of matching ModelConnection objects.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("total")
    public Integer total;

    public static ListModelConnectionsOutput build(java.util.Map<String, ?> map) throws Exception {
        ListModelConnectionsOutput self = new ListModelConnectionsOutput();
        return TeaModel.build(map, self);
    }

    public ListModelConnectionsOutput setItems(java.util.List<ModelConnection> items) {
        this.items = items;
        return this;
    }
    public java.util.List<ModelConnection> getItems() {
        return this.items;
    }

    public ListModelConnectionsOutput setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListModelConnectionsOutput setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListModelConnectionsOutput setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

}
