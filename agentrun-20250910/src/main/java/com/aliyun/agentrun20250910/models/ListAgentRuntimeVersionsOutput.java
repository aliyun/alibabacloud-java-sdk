// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class ListAgentRuntimeVersionsOutput extends TeaModel {
    @NameInMap("items")
    public java.util.List<AgentRuntimeVersion> items;

    @NameInMap("pageNumber")
    public Integer pageNumber;

    @NameInMap("pageSize")
    public Integer pageSize;

    @NameInMap("total")
    public Integer total;

    public static ListAgentRuntimeVersionsOutput build(java.util.Map<String, ?> map) throws Exception {
        ListAgentRuntimeVersionsOutput self = new ListAgentRuntimeVersionsOutput();
        return TeaModel.build(map, self);
    }

    public ListAgentRuntimeVersionsOutput setItems(java.util.List<AgentRuntimeVersion> items) {
        this.items = items;
        return this;
    }
    public java.util.List<AgentRuntimeVersion> getItems() {
        return this.items;
    }

    public ListAgentRuntimeVersionsOutput setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListAgentRuntimeVersionsOutput setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListAgentRuntimeVersionsOutput setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

}
