// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class ListAgentRuntimeEndpointsOutput extends TeaModel {
    /**
     * <p>List of projects</p>
     */
    @NameInMap("items")
    public java.util.List<AgentRuntimeEndpoint> items;

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
     * <p>Total number</p>
     */
    @NameInMap("total")
    public Integer total;

    public static ListAgentRuntimeEndpointsOutput build(java.util.Map<String, ?> map) throws Exception {
        ListAgentRuntimeEndpointsOutput self = new ListAgentRuntimeEndpointsOutput();
        return TeaModel.build(map, self);
    }

    public ListAgentRuntimeEndpointsOutput setItems(java.util.List<AgentRuntimeEndpoint> items) {
        this.items = items;
        return this;
    }
    public java.util.List<AgentRuntimeEndpoint> getItems() {
        return this.items;
    }

    public ListAgentRuntimeEndpointsOutput setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListAgentRuntimeEndpointsOutput setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListAgentRuntimeEndpointsOutput setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

}
