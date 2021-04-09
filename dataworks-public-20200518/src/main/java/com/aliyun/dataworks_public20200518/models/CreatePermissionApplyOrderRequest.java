// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class CreatePermissionApplyOrderRequest extends TeaModel {
    @NameInMap("ApplyUserIds")
    @Validation(required = true)
    public String applyUserIds;

    @NameInMap("Deadline")
    public Long deadline;

    @NameInMap("ApplyReason")
    @Validation(required = true)
    public String applyReason;

    @NameInMap("MaxComputeProjectName")
    @Validation(required = true)
    public String maxComputeProjectName;

    @NameInMap("WorkspaceId")
    @Validation(required = true)
    public Integer workspaceId;

    @NameInMap("OrderType")
    public Integer orderType;

    @NameInMap("EngineType")
    public String engineType;

    @NameInMap("ApplyObject")
    @Validation(required = true)
    public java.util.List<CreatePermissionApplyOrderRequestApplyObject> applyObject;

    public static CreatePermissionApplyOrderRequest build(java.util.Map<String, ?> map) throws Exception {
        CreatePermissionApplyOrderRequest self = new CreatePermissionApplyOrderRequest();
        return TeaModel.build(map, self);
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

    public CreatePermissionApplyOrderRequest setApplyReason(String applyReason) {
        this.applyReason = applyReason;
        return this;
    }
    public String getApplyReason() {
        return this.applyReason;
    }

    public CreatePermissionApplyOrderRequest setMaxComputeProjectName(String maxComputeProjectName) {
        this.maxComputeProjectName = maxComputeProjectName;
        return this;
    }
    public String getMaxComputeProjectName() {
        return this.maxComputeProjectName;
    }

    public CreatePermissionApplyOrderRequest setWorkspaceId(Integer workspaceId) {
        this.workspaceId = workspaceId;
        return this;
    }
    public Integer getWorkspaceId() {
        return this.workspaceId;
    }

    public CreatePermissionApplyOrderRequest setOrderType(Integer orderType) {
        this.orderType = orderType;
        return this;
    }
    public Integer getOrderType() {
        return this.orderType;
    }

    public CreatePermissionApplyOrderRequest setEngineType(String engineType) {
        this.engineType = engineType;
        return this;
    }
    public String getEngineType() {
        return this.engineType;
    }

    public CreatePermissionApplyOrderRequest setApplyObject(java.util.List<CreatePermissionApplyOrderRequestApplyObject> applyObject) {
        this.applyObject = applyObject;
        return this;
    }
    public java.util.List<CreatePermissionApplyOrderRequestApplyObject> getApplyObject() {
        return this.applyObject;
    }

    public static class CreatePermissionApplyOrderRequestApplyObjectColumnMetaList extends TeaModel {
        @NameInMap("Name")
        @Validation(required = true)
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
        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("ColumnMetaList")
        @Validation(required = true)
        public java.util.List<CreatePermissionApplyOrderRequestApplyObjectColumnMetaList> columnMetaList;

        @NameInMap("Actions")
        @Validation(required = true)
        public String actions;

        public static CreatePermissionApplyOrderRequestApplyObject build(java.util.Map<String, ?> map) throws Exception {
            CreatePermissionApplyOrderRequestApplyObject self = new CreatePermissionApplyOrderRequestApplyObject();
            return TeaModel.build(map, self);
        }

        public CreatePermissionApplyOrderRequestApplyObject setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreatePermissionApplyOrderRequestApplyObject setColumnMetaList(java.util.List<CreatePermissionApplyOrderRequestApplyObjectColumnMetaList> columnMetaList) {
            this.columnMetaList = columnMetaList;
            return this;
        }
        public java.util.List<CreatePermissionApplyOrderRequestApplyObjectColumnMetaList> getColumnMetaList() {
            return this.columnMetaList;
        }

        public CreatePermissionApplyOrderRequestApplyObject setActions(String actions) {
            this.actions = actions;
            return this;
        }
        public String getActions() {
            return this.actions;
        }

    }

}
