// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class ListAgentRuntimesRequest extends TeaModel {
    /**
     * <p>根据智能体运行时名称进行模糊匹配过滤</p>
     * 
     * <strong>example:</strong>
     * <p>my-runtime</p>
     */
    @NameInMap("agentRuntimeName")
    public String agentRuntimeName;

    /**
     * <p>当前页码，从1开始计数</p>
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
     * <p>10</p>
     */
    @NameInMap("pageSize")
    public Integer pageSize;

    @NameInMap("resourceGroupId")
    public String resourceGroupId;

    /**
     * <p>查询模式，支持精确查询和模糊查询</p>
     * 
     * <strong>example:</strong>
     * <p>fuzzy</p>
     */
    @NameInMap("searchMode")
    public String searchMode;

    /**
     * <p>根据状态进行过滤，多个状态用逗号分隔，支持精确匹配</p>
     * 
     * <strong>example:</strong>
     * <p>READY,CREATING</p>
     */
    @NameInMap("status")
    public String status;

    public static ListAgentRuntimesRequest build(java.util.Map<String, ?> map) throws Exception {
        ListAgentRuntimesRequest self = new ListAgentRuntimesRequest();
        return TeaModel.build(map, self);
    }

    public ListAgentRuntimesRequest setAgentRuntimeName(String agentRuntimeName) {
        this.agentRuntimeName = agentRuntimeName;
        return this;
    }
    public String getAgentRuntimeName() {
        return this.agentRuntimeName;
    }

    public ListAgentRuntimesRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListAgentRuntimesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListAgentRuntimesRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ListAgentRuntimesRequest setSearchMode(String searchMode) {
        this.searchMode = searchMode;
        return this;
    }
    public String getSearchMode() {
        return this.searchMode;
    }

    public ListAgentRuntimesRequest setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

}
