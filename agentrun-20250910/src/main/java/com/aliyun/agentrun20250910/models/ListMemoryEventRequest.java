// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class ListMemoryEventRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1742347023</p>
     */
    @NameInMap("from")
    public Long from;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNumber")
    public Integer pageNumber;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>1736561650</p>
     */
    @NameInMap("to")
    public Long to;

    public static ListMemoryEventRequest build(java.util.Map<String, ?> map) throws Exception {
        ListMemoryEventRequest self = new ListMemoryEventRequest();
        return TeaModel.build(map, self);
    }

    public ListMemoryEventRequest setFrom(Long from) {
        this.from = from;
        return this;
    }
    public Long getFrom() {
        return this.from;
    }

    public ListMemoryEventRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListMemoryEventRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListMemoryEventRequest setTo(Long to) {
        this.to = to;
        return this;
    }
    public Long getTo() {
        return this.to;
    }

}
