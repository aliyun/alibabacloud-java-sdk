// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class CreatePermissionApplyOrderRequest extends TeaModel {
    /**
     * <p>The list of objects for which permissions are requested.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ApplyObject")
    public java.util.List<CreatePermissionApplyOrderRequestApplyObject> applyObject;

    /**
     * <p>The reason for the request. This is used by the administrator for evaluation and approval.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>I need to use this table</p>
     */
    @NameInMap("ApplyReason")
    public String applyReason;

    /**
     * <p>The type of the request order. Valid values:</p>
     * <ul>
     * <li>MaxComputeTable: MaxCompute table permission request order.</li>
     * <li>MaxComputeFunction: MaxCompute function permission request order.</li>
     * <li>MaxComputeResource: MaxCompute resource permission request order.</li>
     * <li>DLFSchema: Data Lake Formation (DLF) 1.0 schema permission request order.</li>
     * <li>DLFTable: DLF 1.0 table permission request order.</li>
     * <li>DLFColumn: DLF 1.0 column permission request order.</li>
     * <li>DsApiDeploy: Data service publication permission request order.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>MaxComputeTable</p>
     */
    @NameInMap("ApplyType")
    public String applyType;

    /**
     * <p>The UIDs of the Alibaba Cloud accounts for which permissions are requested. Separate multiple account UIDs with commas (,).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>26784260040899****,26784260040899****</p>
     */
    @NameInMap("ApplyUserIds")
    public String applyUserIds;

    /**
     * <p>The name of the data catalog to query. Go to the <a href="https://dlf.console.aliyun.com/ap-southeast-1/metadata/catalog?spm=a2c4g.11186623.0.0.5a225658pT4Dkr">Data Lake Formation console</a> to view the data catalog name.</p>
     * 
     * <strong>example:</strong>
     * <p>hive</p>
     */
    @NameInMap("CatalogName")
    public String catalogName;

    /**
     * <p>The expiration time of the requested permissions. Specify a UNIX timestamp. If you do not specify this parameter, the default expiration time is January 1, 2065.
     * If LabelSecurity is not enabled for the MaxCompute project, or the security level of the requested table field is 0 or less than or equal to the security level of the requesting account, you can request only permanent permissions.
     * Go to the management page of the DataWorks workspace and check the advanced configuration page of the MaxCompute engine to verify whether column-level access control is enabled.
     * Go to the DataWorks workspace to view the security level of fields in Data Map and the security level of accounts on the Member Management page.</p>
     * 
     * <strong>example:</strong>
     * <p>1617115071885</p>
     */
    @NameInMap("Deadline")
    public Long deadline;

    /**
     * <p>This field is deprecated. Set it to empty.</p>
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
     * <p>The name of the MaxCompute project for which permissions are requested.</p>
     * 
     * <strong>example:</strong>
     * <p>aMaxcomputeProjectName</p>
     */
    @NameInMap("MaxComputeProjectName")
    public String maxComputeProjectName;

    /**
     * <p>This field is deprecated. Set it to empty.</p>
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
     * <p>The ID of the DataWorks workspace to which the MaxCompute project belongs. Go to the DataWorks workspace configuration page to obtain the workspace ID.</p>
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
         * <p>The permission types to request. Separate multiple permission types with commas (,). Only Select, Describe, and Download types are supported.</p>
         * 
         * <strong>example:</strong>
         * <p>Select</p>
         */
        @NameInMap("Actions")
        public String actions;

        /**
         * <p>The name of the column for which permissions are requested. To request permissions on the entire table, enter all column names of the table.
         * You can request permissions on specific columns only if LabelSecurity is enabled for the MaxCompute project. If LabelSecurity is not enabled, you can request permissions only on the entire table.</p>
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
         * <p>The permission types to request. Separate multiple permission types with commas (,). Only Select, Describe, Drop, Alter, Update, and Download types are supported.</p>
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
         * <p>The object for which permissions are requested. Only MaxCompute table permissions are supported. Enter the name of the target table.</p>
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
