// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class ListAgentRuntimesOutput extends TeaModel {
    @NameInMap("items")
    public java.util.List<AgentRuntime> items;

    @NameInMap("pageNumber")
    public Integer pageNumber;

    @NameInMap("pageSize")
    public Integer pageSize;

    @NameInMap("total")
    public Integer total;

    public static ListAgentRuntimesOutput build(java.util.Map<String, ?> map) throws Exception {
        ListAgentRuntimesOutput self = new ListAgentRuntimesOutput();
        return TeaModel.build(map, self);
    }

    public ListAgentRuntimesOutput setItems(java.util.List<AgentRuntime> items) {
        this.items = items;
        return this;
    }
    public java.util.List<AgentRuntime> getItems() {
        return this.items;
    }

    public ListAgentRuntimesOutput setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListAgentRuntimesOutput setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListAgentRuntimesOutput setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

}
