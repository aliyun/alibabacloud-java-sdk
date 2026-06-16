// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class ListCodeInterpretersOutput extends TeaModel {
    /**
     * <p>List of code interpreters</p>
     */
    @NameInMap("items")
    public java.util.List<CodeInterpreter> items;

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
