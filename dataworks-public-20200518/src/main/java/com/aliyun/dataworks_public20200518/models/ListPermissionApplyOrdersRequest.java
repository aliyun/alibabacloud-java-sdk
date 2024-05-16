// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListPermissionApplyOrdersRequest extends TeaModel {
    /**
     * <p>The end time. You can query all permission request orders that have been submitted before the time. The parameter value is a UNIX timestamp. If you do not specify the parameter, all permission request orders that are submitted before the current time are queried.</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>The type of the compute engine with which the permission request order is associated. The parameter value is odps and cannot be changed. This value indicates that you can request permissions only on fields of tables in MaxCompute compute engine instances.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("EngineType")
    public String engineType;

    /**
     * <p>The status of the permission request order. Valid values:</p>
     * <br>
     * <p>*   1: pending approval</p>
     * <p>*   2: approved and authorized</p>
     * <p>*   3: approved but authorization failed</p>
     * <p>*   4: rejected</p>
     */
    @NameInMap("FlowStatus")
    public Integer flowStatus;

    /**
     * <p>The name of the MaxCompute project to which the permission request order belongs. If you do not specify the parameter, the permission request orders of all MaxCompute projects are returned.</p>
     */
    @NameInMap("MaxComputeProjectName")
    public String maxComputeProjectName;

    /**
     * <p>The type of the permission request order. The parameter value is 1 and cannot be changed. This value indicates ACL-based authorization.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("OrderType")
    public Integer orderType;

    /**
     * <p>The number of the page to return. Pages start from page 1. Default value: 1.</p>
     */
    @NameInMap("PageNum")
    public Integer pageNum;

    /**
     * <p>The number of entries to return on each page. Default value: 10. Maximum value: 100.</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The query type of the permission request order. Valid values:</p>
     * <br>
     * <p>*   0: The permission request orders you submitted.</p>
     * <p>*   1: The permission request orders you approved.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("QueryType")
    public Integer queryType;

    /**
     * <p>The start time. You can query all permission request orders that have been submitted after the time. The parameter value is a UNIX timestamp. If you do not specify the parameter, all permission request orders are queried.</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    /**
     * <p>The name of the table with which the permission request order is associated. If you do not specify the parameter, the permission request orders of all tables are returned.</p>
     */
    @NameInMap("TableName")
    public String tableName;

    /**
     * <p>The ID of the DataWorks workspace to which the permission request order belongs. If you do not specify the parameter, the permission request orders of all workspaces are returned. You can log on to the DataWorks console and go to the Workspace Management page to obtain the ID.</p>
     */
    @NameInMap("WorkspaceId")
    public Integer workspaceId;

    public static ListPermissionApplyOrdersRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPermissionApplyOrdersRequest self = new ListPermissionApplyOrdersRequest();
        return TeaModel.build(map, self);
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

    public ListPermissionApplyOrdersRequest setFlowStatus(Integer flowStatus) {
        this.flowStatus = flowStatus;
        return this;
    }
    public Integer getFlowStatus() {
        return this.flowStatus;
    }

    public ListPermissionApplyOrdersRequest setMaxComputeProjectName(String maxComputeProjectName) {
        this.maxComputeProjectName = maxComputeProjectName;
        return this;
    }
    public String getMaxComputeProjectName() {
        return this.maxComputeProjectName;
    }

    public ListPermissionApplyOrdersRequest setOrderType(Integer orderType) {
        this.orderType = orderType;
        return this;
    }
    public Integer getOrderType() {
        return this.orderType;
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

    public ListPermissionApplyOrdersRequest setStartTime(Long startTime) {
        this.startTime = startTime;
        return this;
    }
    public Long getStartTime() {
        return this.startTime;
    }

    public ListPermissionApplyOrdersRequest setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

    public ListPermissionApplyOrdersRequest setWorkspaceId(Integer workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public Integer getWorkspaceId() {
        return this.workspaceId;
    }

}
