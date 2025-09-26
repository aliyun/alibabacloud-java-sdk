// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class ListGatewaysOutput extends TeaModel {
    @NameInMap("items")
    public Gateway items;

    @NameInMap("pageNumber")
    public Integer pageNumber;

    @NameInMap("pageSize")
    public Integer pageSize;

    @NameInMap("total")
    public Integer total;

    public static ListGatewaysOutput build(java.util.Map<String, ?> map) throws Exception {
        ListGatewaysOutput self = new ListGatewaysOutput();
        return TeaModel.build(map, self);
    }

    public ListGatewaysOutput setItems(Gateway items) {
        this.items = items;
        return this;
    }
    public Gateway getItems() {
        return this.items;
    }

    public ListGatewaysOutput setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListGatewaysOutput setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListGatewaysOutput setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

}
