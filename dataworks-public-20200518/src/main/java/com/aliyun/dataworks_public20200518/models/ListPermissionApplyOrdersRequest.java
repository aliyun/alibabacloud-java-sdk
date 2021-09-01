// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListPermissionApplyOrdersRequest extends TeaModel {
    @NameInMap("FlowStatus")
    public Integer flowStatus;

    @NameInMap("WorkspaceId")
    public Integer workspaceId;

    @NameInMap("OrderType")
    @Validation(required = true)
    public Integer orderType;

    @NameInMap("MaxComputeProjectName")
    public String maxComputeProjectName;

    @NameInMap("TableName")
    public String tableName;

    @NameInMap("StartTime")
    public Long startTime;

    @NameInMap("EndTime")
    public Long endTime;

    @NameInMap("EngineType")
    @Validation(required = true)
    public String engineType;

    @NameInMap("PageNum")
    public Integer pageNum;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("QueryType")
    @Validation(required = true)
    public Integer queryType;

    public static ListPermissionApplyOrdersRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPermissionApplyOrdersRequest self = new ListPermissionApplyOrdersRequest();
        return TeaModel.build(map, self);
    }

    public ListPermissionApplyOrdersRequest setFlowStatus(Integer flowStatus) {
        this.flowStatus = flowStatus;
        return this;
    }
    public Integer getFlowStatus() {
        return this.flowStatus;
    }

    public ListPermissionApplyOrdersRequest setWorkspaceId(Integer workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public Integer getWorkspaceId() {
        return this.workspaceId;
    }

    public ListPermissionApplyOrdersRequest setOrderType(Integer orderType) {
        this.orderType = orderType;
        return this;
    }
    public Integer getOrderType() {
        return this.orderType;
    }

    public ListPermissionApplyOrdersRequest setMaxComputeProjectName(String maxComputeProjectName) {
        this.maxComputeProjectName = maxComputeProjectName;
        return this;
    }
    public String getMaxComputeProjectName() {
        return this.maxComputeProjectName;
    }

    public ListPermissionApplyOrdersRequest setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

    public ListPermissionApplyOrdersRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public ListPermissionApplyOrdersRequest setEndTime(Long endTime) {
        this.endTime = endTime;
        return this;
    }
    public Long getEndTime() {
        return this.endTime;
    }

    public ListPermissionApplyOrdersRequest setEngineType(String engineType) {
        this.engineType = engineType;
        return this;
    }
    public String getEngineType() {
        return this.engineType;
    }

    public ListPermissionApplyOrdersRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public ListPermissionApplyOrdersRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public ListPermissionApplyOrdersRequest setQueryType(Integer queryType) {
        this.queryType = queryType;
        return this;
    }
    public Integer getQueryType() {
        return this.queryType;
    }

}
