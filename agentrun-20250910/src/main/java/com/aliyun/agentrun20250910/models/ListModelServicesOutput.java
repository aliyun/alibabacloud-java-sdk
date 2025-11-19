// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class ListModelServicesOutput extends TeaModel {
    @NameInMap("items")
    public java.util.List<ModelService> items;

    @NameInMap("pageNumber")
    public Integer pageNumber;

    @NameInMap("pageSize")
    public Integer pageSize;

    @NameInMap("total")
    public Long total;

    public static ListModelServicesOutput build(java.util.Map<String, ?> map) throws Exception {
        ListModelServicesOutput self = new ListModelServicesOutput();
        return TeaModel.build(map, self);
    }

    public ListModelServicesOutput setItems(java.util.List<ModelService> items) {
        this.items = items;
        return this;
    }
    public java.util.List<ModelService> getItems() {
        return this.items;
    }

    public ListModelServicesOutput setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListModelServicesOutput setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListModelServicesOutput setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

}
