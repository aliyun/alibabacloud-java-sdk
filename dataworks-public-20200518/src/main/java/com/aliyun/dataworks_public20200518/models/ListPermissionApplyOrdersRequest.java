// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListPermissionApplyOrdersRequest extends TeaModel {
    /**
     * <p>The type of permission request. Valid values:</p>
     * <ul>
     * <li>MaxComputeTable: Permission request for MaxCompute tables</li>
     * <li>MaxComputeFunction: Permission request for MaxCompute functions</li>
     * <li>MaxComputeResource: Permission request for MaxCompute resources</li>
     * <li>DLFSchema: Permission request for DLF 1.0 schemas</li>
     * <li>DLFTable: Permission request for DLF 1.0 tables</li>
     * <li>DLFColumn: Permission request for DLF 1.0 columns</li>
     * <li>DsApiDeploy: Permission request for publishing data services</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>MaxComputeTable</p>
     */
    @NameInMap("ApplyType")
    public String applyType;

    /**
     * <p>The name of the data catalog to query.</p>
     * 
     * <strong>example:</strong>
     * <p>hive</p>
     */
    @NameInMap("CatalogName")
    public String catalogName;

    /**
     * <p>The end of the time range to query. You can query all the permissions request orders that have been submitted before the time. The parameter value is a UNIX timestamp. If you do not specify the parameter, all permission request orders that are submitted before the current time are queried.</p>
     * 
     * <strong>example:</strong>
     * <p>1617200471885</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>This parameter is deprecated and does not take effect.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>odps</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>odps</p>
     */
    @NameInMap("EngineType")
    public String engineType;

    /**
     * <p>The status of the permission request. Valid values:</p>
     * <ul>
     * <li>1: Pending approval</li>
     * <li>2: Approved and authorization succeeded</li>
     * <li>3: Approved but authorization failed</li>
     * <li>4: Rejected</li>
     * <li>5: Withdrawn</li>
     * </ul>
     * <p>Valid values:</p>
     * <ul>
     * <li>0</li>
     * <li>1</li>
     * <li>2</li>
     * <li>3</li>
     * <li>4</li>
     * <li>5</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("FlowStatus")
    public Integer flowStatus;

    /**
     * <p>The name of the MaxCompute project with which the permission request order is associated. If you do not specify the parameter, the permission request orders of all MaxCompute projects are returned.</p>
     * 
     * <strong>example:</strong>
     * <p>aMaxComputeProject</p>
     */
    @NameInMap("MaxComputeProjectName")
    public String maxComputeProjectName;

    /**
     * <p>This parameter is deprecated and does not take effect.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>1</li>
     * <li>0</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("OrderType")
    public Integer orderType;

    /**
     * <p>The page number for pagination. The value must be a positive integer greater than or equal to 1. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNum")
    public Integer pageNum;

    /**
     * <p>The number of entries per page. Default value: 10. Maximum value: 100.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>The query type for permission requests. Valid values:</p>
     * <ul>
     * <li>0: Permission requests submitted by me</li>
     * <li>1: Permission requests pending my approval</li>
     * <li>2: All permission requests</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("QueryType")
    public Integer queryType;

    /**
     * <p>The beginning of the time range to query. You can query all the permissions request orders that have been submitted after the time. The parameter value is a UNIX timestamp. If you do not specify the parameter, all permission request orders are queried.</p>
     * 
     * <strong>example:</strong>
     * <p>1616200471885</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    /**
     * <p>The name of the table with which the permission request order is associated. If you do not specify the parameter, the permission request orders of all tables are returned.</p>
     * 
     * <strong>example:</strong>
     * <p>aTableName</p>
     */
    @NameInMap("TableName")
    public String tableName;

    /**
     * <p>The ID of the workspace to which the permission request belongs. If you do not specify this parameter, permission requests from all workspaces are returned. To obtain the workspace ID, log on to the DataWorks console and navigate to the workspace configuration page.</p>
     * 
     * <strong>example:</strong>
     * <p>12345</p>
     */
    @NameInMap("WorkspaceId")
    public Integer workspaceId;

    public static ListPermissionApplyOrdersRequest build(java.util.Map<String, ?> map) throws Exception {
        ListPermissionApplyOrdersRequest self = new ListPermissionApplyOrdersRequest();
        return TeaModel.build(map, self);
    }

    public ListPermissionApplyOrdersRequest setApplyType(String applyType) {
        this.applyType = applyType;
        return this;
    }
    public String getApplyType() {
        return this.applyType;
    }

    public ListPermissionApplyOrdersRequest setCatalogName(String catalogName) {
        this.catalogName = catalogName;
        return this;
    }
    public String getCatalogName() {
        return this.catalogName;
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
