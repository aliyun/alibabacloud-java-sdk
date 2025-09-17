// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class CreatePermissionApplyOrderRequest extends TeaModel {
    /**
     * <p>The list of requested objects.</p>
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

    /**
     * <strong>example:</strong>
     * <p>MaxComputeTable</p>
     */
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

    /**
     * <strong>example:</strong>
     * <p>hive</p>
     */
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
     * <p>The type of compute engine for permission requests. Currently only supports ODPS, which means only MaxCompute compute engine permissions are supported.</p>
     * 
     * <strong>example:</strong>
     * <p>odps</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("EngineType")
    @Deprecated
    public String engineType;

    /**
     * <p>The name of the MaxCompute project you request access to.</p>
     * 
     * <strong>example:</strong>
     * <p>aMaxcomputeProjectName</p>
     */
    @NameInMap("MaxComputeProjectName")
    public String maxComputeProjectName;

    /**
     * <p>The request type. The only supported value is 1, which represents an object ACL permission request.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     * 
     * <strong>if can be null:</strong>
     * <p>true</p>
     */
    @NameInMap("OrderType")
    @Deprecated
    public Integer orderType;

    /**
     * <p>The DataWorks workspace ID to which the MaxCompute project belongs for permission requests. You can check the workspace ID on the DataWorks workspace configuration page.</p>
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

    @Deprecated
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

    @Deprecated
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
        /**
         * <strong>example:</strong>
         * <p>Select</p>
         */
        @NameInMap("Actions")
        public String actions;

        /**
         * <p>Permissions for the target columns. Enter the column names here. If applying for permissions on the entire table, enter all column names of the table. Permissions for specific columns can only be requested if labelSecurity is enabled for the MaxCompute project. Otherwise, you can only apply for permissions on the entire table.</p>
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
         * <p>The type of permissions requested. Use commas (,) to separate multiple permission types in a single request. Currently only supports Select, Describe, Drop, Alter, Update, and Download permission types.</p>
         * 
         * <strong>example:</strong>
         * <p>Select,Describe</p>
         */
        @NameInMap("Actions")
        public String actions;

        /**
         * <p>The list of column objects.</p>
         */
        @NameInMap("ColumnMetaList")
        public java.util.List<CreatePermissionApplyOrderRequestApplyObjectColumnMetaList> columnMetaList;

        /**
         * <p>The object you request access to. Currently, only permission requests for MaxCompute tables are supported. The name of the target table needs to be entered here.</p>
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
