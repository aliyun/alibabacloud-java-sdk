// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class ListModelConnectionsOutput extends TeaModel {
    /**
     * <p>模型连接列表</p>
     */
    @NameInMap("items")
    public java.util.List<ModelConnection> items;

    /**
     * <p>当前页码</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNumber")
    public Integer pageNumber;

    /**
     * <p>每页记录数</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <p>符合条件的模型连接总数</p>
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
