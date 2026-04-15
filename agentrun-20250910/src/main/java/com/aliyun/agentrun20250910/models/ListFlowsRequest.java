// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class ListFlowsRequest extends TeaModel {
    /**
     * <p>根据工作流名称进行模糊匹配过滤</p>
     * 
     * <strong>example:</strong>
     * <p>my-flow</p>
     */
    @NameInMap("flowName")
    public String flowName;

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

    /**
     * <p>根据工作空间ID进行过滤，用于资源隔离和权限管理</p>
     * 
     * <strong>example:</strong>
     * <p>ws-1234567890abcdef</p>
     */
    @NameInMap("workspaceId")
    public String workspaceId;

    /**
     * <strong>example:</strong>
     * <p>ws-1234567890abcdef,ws-1234567890bcdefg</p>
     */
    @NameInMap("workspaceIds")
    public String workspaceIds;

    public static ListFlowsRequest build(java.util.Map<String, ?> map) throws Exception {
        ListFlowsRequest self = new ListFlowsRequest();
        return TeaModel.build(map, self);
    }

    public ListFlowsRequest setFlowName(String flowName) {
        this.flowName = flowName;
        return this;
    }
    public String getFlowName() {
        return this.flowName;
    }

    public ListFlowsRequest setPageNumber(Integer pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Integer getPageNumber() {
        return this.pageNumber;
    }

    public ListFlowsRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListFlowsRequest setWorkspaceId(String workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public String getWorkspaceId() {
        return this.workspaceId;
    }

    public ListFlowsRequest setWorkspaceIds(String workspaceIds) {
        this.workspaceIds = workspaceIds;
        return this;
    }
    public String getWorkspaceIds() {
        return this.workspaceIds;
    }

}
