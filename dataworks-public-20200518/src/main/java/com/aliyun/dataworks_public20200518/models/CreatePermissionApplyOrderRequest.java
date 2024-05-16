// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class CreatePermissionApplyOrderRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ApplyObject")
    public java.util.List<CreatePermissionApplyOrderRequestApplyObject> applyObject;

    /**
     * <p>The reason for your request. The administrator determines whether to approve the request based on the reason.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ApplyReason")
    public String applyReason;

    /**
     * <p>The ID of the Alibaba Cloud account for which you want to request permissions. If you want to request permissions for multiple Alibaba Cloud accounts, separate the IDs of the accounts with commas (,).</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ApplyUserIds")
    public String applyUserIds;

    /**
     * <p>The expiration time of the permissions that you request. This value is a UNIX timestamp. If you do not specify a value for this parameter, January 1, 2065 is used as the expiration time.</p>
     * <br>
     * <p>If LabelSecurity is disabled for the MaxCompute project in which you want to request permissions on the fields of a table, or the security level of the fields is 0 or is lower than or equal to the security level of the Alibaba Cloud account for which you want to request permissions, you can request only permanent permissions.</p>
     * <br>
     * <p>You can go to the Workspace Management page of the DataWorks console, click MaxCompute Management in the left-side navigation pane, and then check whether column-level access control is enabled.</p>
     * <br>
     * <p>You can go to your DataWorks workspace, view the security level of the fields in DataMap, and then view the security level of the Alibaba Cloud account on the User Management page.</p>
     */
    @NameInMap("Deadline")
    public Long deadline;

    /**
     * <p>The type of the compute engine instance in which you want to request permissions on the fields of a table. The parameter value is odps and cannot be changed. This value indicates that you can request permissions only on fields of tables in MaxCompute compute engine instances.</p>
     */
    @NameInMap("EngineType")
    public String engineType;

    /**
     * <p>The name of the MaxCompute project in which you request permissions on the fields of a table.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("MaxComputeProjectName")
    public String maxComputeProjectName;

    /**
     * <p>The type of the permission request order. The parameter value is 1 and cannot be changed. This value indicates ACL-based authorization.</p>
     */
    @NameInMap("OrderType")
    public Integer orderType;

    /**
     * <p>The ID of the DataWorks workspace that is associated with the MaxCompute project in which you want to request permissions on the fields of a table. You can go to the Workspace Management page in the DataWorks console to view the workspace ID.</p>
     * <br>
     * <p>This parameter is required.</p>
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

    public CreatePermissionApplyOrderRequest setApplyUserIds(String applyUserIds) {
        this.applyUserIds = applyUserIds;
        return this;
    }
    public String getApplyUserIds() {
        return this.applyUserIds;
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
        /**
         * <p>The name of the field on which you want to request permissions. If you want to request permissions on an entire table, enter the names of all fields in the table.</p>
         * <br>
         * <p>You can request permissions on specific fields of a table in a MaxCompute project only after LabelSecurity is enabled for this project. If LabelSecurity is disabled, you can request permissions only on an entire table.</p>
         * <br>
         * <p>This parameter is required.</p>
         */
        @NameInMap("Name")
        public String name;

        public static CreatePermissionApplyOrderRequestApplyObjectColumnMetaList build(java.util.Map<String, ?> map) throws Exception {
            CreatePermissionApplyOrderRequestApplyObjectColumnMetaList self = new CreatePermissionApplyOrderRequestApplyObjectColumnMetaList();
            return TeaModel.build(map, self);
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
         * <br>
         * <p>This parameter is required.</p>
         */
        @NameInMap("Actions")
        public String actions;

        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("ColumnMetaList")
        public java.util.List<CreatePermissionApplyOrderRequestApplyObjectColumnMetaList> columnMetaList;

        /**
         * <p>The name of the object on which you want to request permissions. You can request permissions only on MaxCompute tables. Set this parameter to the name of the table on which you want to request permissions.</p>
         * <br>
         * <p>This parameter is required.</p>
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
