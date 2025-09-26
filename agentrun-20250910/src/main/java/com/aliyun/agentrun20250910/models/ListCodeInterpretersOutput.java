// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class ListCodeInterpretersOutput extends TeaModel {
    @NameInMap("items")
    public java.util.List<CodeInterpreter> items;

    @NameInMap("pageNumber")
    public Integer pageNumber;

    @NameInMap("pageSize")
    public Integer pageSize;

    @NameInMap("total")
    public Long total;

    public static ListCodeInterpretersOutput build(java.util.Map<String, ?> map) throws Exception {
        ListCodeInterpretersOutput self = new ListCodeInterpretersOutput();
        return TeaModel.build(map, self);
    }

    public ListCodeInterpretersOutput setItems(java.util.List<CodeInterpreter> items) {
        this.items = items;
        return this;
    }
    public java.util.List<CodeInterpreter> getItems() {
        return this.items;
    }

    public ListCodeInterpretersOutput setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListCodeInterpretersOutput setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListCodeInterpretersOutput setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

}
