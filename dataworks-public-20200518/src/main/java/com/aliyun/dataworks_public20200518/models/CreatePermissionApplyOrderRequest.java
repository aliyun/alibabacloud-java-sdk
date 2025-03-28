// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class CreatePermissionApplyOrderRequest extends TeaModel {
    /**
     * <p>The objects on which you want to request permissions.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ApplyObject")
    public java.util.List<CreatePermissionApplyOrderRequestApplyObject> applyObject;

    /**
     * <p>The reason for your request. The administrator determines whether to approve the request based on the reason.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>I need to use this table</p>
     */
    @NameInMap("ApplyReason")
    public String applyReason;

    @NameInMap("ApplyType")
    public String applyType;

    /**
     * <p>The ID of the Alibaba Cloud account for which you want to request permissions. If you want to request permissions for multiple Alibaba Cloud accounts, separate the IDs of the accounts with commas (,).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>267842600408993176,267842600408993177</p>
     */
    @NameInMap("ApplyUserIds")
    public String applyUserIds;

    @NameInMap("CatalogName")
    public String catalogName;

    /**
     * <p>The expiration time of the permissions that you request. This value is a UNIX timestamp. The default value is January 1, 2065. If LabelSecurity is disabled for the MaxCompute project in which you want to request permissions on the fields of a table, or the security level of the fields is 0 or is lower than or equal to the security level of the Alibaba Cloud account for which you want to request permissions, you can request only permanent permissions. You can go to the Workspace Management page in the DataWorks console, click MaxCompute Management in the left-side navigation pane, and then check whether column-level access control is enabled. You can go to your DataWorks workspace, view the security level of the fields in Data Map, and then view the security level of the Alibaba Cloud account on the User Management page.</p>
     * 
     * <strong>example:</strong>
     * <p>1617115071885</p>
     */
    @NameInMap("Deadline")
    public Long deadline;

    /**
     * <p>The type of the compute engine in which you want to request permissions on the fields of a table. The parameter value is odps and cannot be changed. This value indicates that you can request permissions only on fields of tables in the MaxCompute compute engine.</p>
     * 
     * <strong>example:</strong>
     * <p>odps</p>
     */
    @NameInMap("EngineType")
    public String engineType;

    /**
     * <p>The name of the MaxCompute project in which you request permissions on the fields of a table.</p>
     * 
     * <strong>example:</strong>
     * <p>aMaxcomputeProjectName</p>
     */
    @NameInMap("MaxComputeProjectName")
    public String maxComputeProjectName;

    /**
     * <p>The type of the permission request order. The parameter value is 1 and cannot be changed. This value indicates ACL-based authorization.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("OrderType")
    public Integer orderType;

    /**
     * <p>The ID of the DataWorks workspace that is associated with the MaxCompute project in which you want to request permissions on the fields of a table. You can go to the SettingCenter page in the DataWorks console to view the workspace ID.</p>
     * 
     * <strong>example:</strong>
     * <p>12345</p>
     */
    @NameInMap("WorkspaceId")
    public Integer workspaceId;

    public static CreatePermissionApplyOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePermissionApplyOrderRequest self = new CreatePermissionApplyOrderRequest();
        return TeaModel.build(map, self);
    }

    public CreatePermissionApplyOrderRequest setApplyObject(java.util.List<CreatePermissionApplyOrderRequestApplyObject> applyObject) {
        this.applyObject = applyObject;
        return this;
    }
    public java.util.List<CreatePermissionApplyOrderRequestApplyObject> getApplyObject() {
        return this.applyObject;
    }

    public CreatePermissionApplyOrderRequest setApplyReason(String applyReason) {
        this.applyReason = applyReason;
        return this;
    }
    public String getApplyReason() {
        return this.applyReason;
    }

    public CreatePermissionApplyOrderRequest setApplyType(String applyType) {
        this.applyType = applyType;
        return this;
    }
    public String getApplyType() {
        return this.applyType;
    }

    public CreatePermissionApplyOrderRequest setApplyUserIds(String applyUserIds) {
        this.applyUserIds = applyUserIds;
        return this;
    }
    public String getApplyUserIds() {
        return this.applyUserIds;
    }

    public CreatePermissionApplyOrderRequest setCatalogName(String catalogName) {
        this.catalogName = catalogName;
        return this;
    }
    public String getCatalogName() {
        return this.catalogName;
    }

    public CreatePermissionApplyOrderRequest setDeadline(Long deadline) {
        this.deadline = deadline;
        return this;
    }
    public Long getDeadline() {
        return this.deadline;
    }

    public CreatePermissionApplyOrderRequest setEngineType(String engineType) {
        this.engineType = engineType;
        return this;
    }
    public String getEngineType() {
        return this.engineType;
    }

    public CreatePermissionApplyOrderRequest setMaxComputeProjectName(String maxComputeProjectName) {
        this.maxComputeProjectName = maxComputeProjectName;
        return this;
    }
    public String getMaxComputeProjectName() {
        return this.maxComputeProjectName;
    }

    public CreatePermissionApplyOrderRequest setOrderType(Integer orderType) {
        this.orderType = orderType;
        return this;
    }
    public Integer getOrderType() {
        return this.orderType;
    }

    public CreatePermissionApplyOrderRequest setWorkspaceId(Integer workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public Integer getWorkspaceId() {
        return this.workspaceId;
    }

    public static class CreatePermissionApplyOrderRequestApplyObjectColumnMetaList extends TeaModel {
        @NameInMap("Actions")
        public String actions;

        /**
         * <p>The field on which you want to request permissions. If you want to request permissions on an entire table, enter all fields in the table. You can request permissions on specific fields of a table in a MaxCompute project only after LabelSecurity is enabled for this project. If LabelSecurity is disabled, you can request permissions only on an entire table.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>aColumnName</p>
         */
        @NameInMap("Name")
        public String name;

        public static CreatePermissionApplyOrderRequestApplyObjectColumnMetaList build(java.util.Map<String, ?> map) throws Exception {
            CreatePermissionApplyOrderRequestApplyObjectColumnMetaList self = new CreatePermissionApplyOrderRequestApplyObjectColumnMetaList();
            return TeaModel.build(map, self);
        }

        public CreatePermissionApplyOrderRequestApplyObjectColumnMetaList setActions(String actions) {
            this.actions = actions;
            return this;
        }
        public String getActions() {
            return this.actions;
        }

        public CreatePermissionApplyOrderRequestApplyObjectColumnMetaList setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class CreatePermissionApplyOrderRequestApplyObject extends TeaModel {
        /**
         * <p>The permission that you want to request. If you want to request multiple permissions at the same time, separate them with commas (,). You can request only the following permissions: Select, Describe, Drop, Alter, Update, and Download.</p>
         * 
         * <strong>example:</strong>
         * <p>Select,Describe</p>
         */
        @NameInMap("Actions")
        public String actions;

        /**
         * <p>The fields on which you want to request permissions.</p>
         */
        @NameInMap("ColumnMetaList")
        public java.util.List<CreatePermissionApplyOrderRequestApplyObjectColumnMetaList> columnMetaList;

        /**
         * <p>The name of the object on which you want to request permissions. You can request permissions only on MaxCompute tables. Set this parameter to the name of the table on which you want to request permissions.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>aTableName</p>
         */
        @NameInMap("Name")
        public String name;

        public static CreatePermissionApplyOrderRequestApplyObject build(java.util.Map<String, ?> map) throws Exception {
            CreatePermissionApplyOrderRequestApplyObject self = new CreatePermissionApplyOrderRequestApplyObject();
            return TeaModel.build(map, self);
        }

        public CreatePermissionApplyOrderRequestApplyObject setActions(String actions) {
            this.actions = actions;
            return this;
        }
        public String getActions() {
            return this.actions;
        }

        public CreatePermissionApplyOrderRequestApplyObject setColumnMetaList(java.util.List<CreatePermissionApplyOrderRequestApplyObjectColumnMetaList> columnMetaList) {
            this.columnMetaList = columnMetaList;
            return this;
        }
        public java.util.List<CreatePermissionApplyOrderRequestApplyObjectColumnMetaList> getColumnMetaList() {
            return this.columnMetaList;
        }

        public CreatePermissionApplyOrderRequestApplyObject setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

}
