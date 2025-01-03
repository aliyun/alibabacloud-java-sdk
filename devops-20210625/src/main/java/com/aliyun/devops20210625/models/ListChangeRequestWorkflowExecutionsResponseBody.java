// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class ListChangeRequestWorkflowExecutionsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("current")
    public Long current;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("pageSize")
    public Long pageSize;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pages")
    public Long pages;

    @NameInMap("records")
    public java.util.List<?> records;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("total")
    public Long total;

    public static ListChangeRequestWorkflowExecutionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListChangeRequestWorkflowExecutionsResponseBody self = new ListChangeRequestWorkflowExecutionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListChangeRequestWorkflowExecutionsResponseBody setCurrent(Long current) {
        this.current = current;
        return this;
    }
    public Long getCurrent() {
        return this.current;
    }

    public ListChangeRequestWorkflowExecutionsResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public ListChangeRequestWorkflowExecutionsResponseBody setPages(Long pages) {
        this.pages = pages;
        return this;
    }
    public Long getPages() {
        return this.pages;
    }

    public ListChangeRequestWorkflowExecutionsResponseBody setRecords(java.util.List<?> records) {
        this.records = records;
        return this;
    }
    public java.util.List<?> getRecords() {
        return this.records;
    }

    public ListChangeRequestWorkflowExecutionsResponseBody setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

}
