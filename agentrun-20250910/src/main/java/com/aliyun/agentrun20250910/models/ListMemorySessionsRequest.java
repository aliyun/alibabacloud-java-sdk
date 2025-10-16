// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class ListMemorySessionsRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1740622996</p>
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
     * <p>20</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>1747275768</p>
     */
    @NameInMap("to")
    public Long to;

    public static ListMemorySessionsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListMemorySessionsRequest self = new ListMemorySessionsRequest();
        return TeaModel.build(map, self);
    }

    public ListMemorySessionsRequest setFrom(Long from) {
        this.from = from;
        return this;
    }
    public Long getFrom() {
        return this.from;
    }

    public ListMemorySessionsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListMemorySessionsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListMemorySessionsRequest setTo(Long to) {
        this.to = to;
        return this;
    }
    public Long getTo() {
        return this.to;
    }

}
