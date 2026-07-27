// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class ListPermissionApplyOrdersRequest extends TeaModel {
    /**
     * <p>The type of the application order. Valid values:</p>
     * <ul>
     * <li>[MaxComputeTable] MaxCompute table permission application order.</li>
     * <li>[MaxComputeFunction] MaxCompute function application order.</li>
     * <li>[MaxComputeResource] MaxCompute resource application order.</li>
     * <li>[DLFSchema] DLF 1.0 schema permission application order.</li>
     * <li>[DLFTable] DLF 1.0 table permission application order.</li>
     * <li>[DLFColumn] DLF 1.0 column permission application order.</li>
     * <li>[DsApiDeploy] DataService publishing permission application order.</li>
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
     * <p>The end time for querying application orders, specified as a UNIX timestamp. If this parameter is not specified, application orders up to the current time are queried.</p>
     * 
     * <strong>example:</strong>
     * <p>1617200471885</p>
     */
    @NameInMap("EndTime")
    public Long endTime;

    /**
     * <p>This parameter is deprecated and does not take effect.</p>
     * 
     * <strong>example:</strong>
     * <p>odps</p>
     */
    @NameInMap("EngineType")
    public String engineType;

    /**
     * <p>The status of the application order. Valid values:</p>
     * <ul>
     * <li>1: Pending approval.</li>
     * <li>2: Approved, authorization succeeded.</li>
     * <li>3: Approved, authorization failed.</li>
     * <li>4: Rejected.</li>
     * <li>5: Withdrawn.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("FlowStatus")
    public Integer flowStatus;

    /**
     * <p>The name of the MaxCompute project to which the application order belongs. If this parameter is not specified, application orders from all MaxCompute projects are returned.</p>
     * 
     * <strong>example:</strong>
     * <p>aMaxComputeProject</p>
     */
    @NameInMap("MaxComputeProjectName")
    public String maxComputeProjectName;

    /**
     * <p>This parameter is deprecated and does not take effect.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("OrderType")
    public Integer orderType;

    /**
     * <p>The page number for paginated queries. The value must be a positive integer greater than or equal to 1. Default value: 1.</p>
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
     * <p>The query type of the application order. Valid values:</p>
     * <ul>
     * <li>0: Application orders submitted by me.</li>
     * <li>1: Application orders approved by me.</li>
     * <li>2: All application orders.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("QueryType")
    public Integer queryType;

    /**
     * <p>The start time for querying application orders, specified as a UNIX timestamp. If this parameter is not specified, all application orders are queried.</p>
     * 
     * <strong>example:</strong>
     * <p>1616200471885</p>
     */
    @NameInMap("StartTime")
    public Long startTime;

    /**
     * <p>The table name included in the application order. If this parameter is not specified, application orders for all tables are returned.</p>
     * 
     * <strong>example:</strong>
     * <p>aTableName</p>
     */
    @NameInMap("TableName")
    public String tableName;

    /**
     * <p>The ID of the workspace to which the application order belongs. If this parameter is not specified, application orders from all workspaces are returned. You can log on to the DataWorks console and go to the Workspace Settings page to obtain the workspace ID.</p>
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
