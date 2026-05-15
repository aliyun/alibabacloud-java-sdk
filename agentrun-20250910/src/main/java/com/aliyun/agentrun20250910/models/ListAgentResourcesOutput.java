// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class ListAgentResourcesOutput extends TeaModel {
    /**
     * <p>智能体资源的列表</p>
     */
    @NameInMap("items")
    public java.util.List<AgentResource> items;

    /**
     * <p>当前页码，从 1 开始计数</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("pageNumber")
    public Integer pageNumber;

    /**
     * <p>每页返回的记录数量</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    /**
     * <p>符合条件的资源总数</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("total")
    public Long total;

    public static ListAgentResourcesOutput build(java.util.Map<String, ?> map) throws Exception {
        ListAgentResourcesOutput self = new ListAgentResourcesOutput();
        return TeaModel.build(map, self);
    }

    public ListAgentResourcesOutput setItems(java.util.List<AgentResource> items) {
        this.items = items;
        return this;
    }
    public java.util.List<AgentResource> getItems() {
        return this.items;
    }

    public ListAgentResourcesOutput setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListAgentResourcesOutput setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListAgentResourcesOutput setTotal(Long total) {
        this.total = total;
        return this;
    }
    public Long getTotal() {
        return this.total;
    }

}
