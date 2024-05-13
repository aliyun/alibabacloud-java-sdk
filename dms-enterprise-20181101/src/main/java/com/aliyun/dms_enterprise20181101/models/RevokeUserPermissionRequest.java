// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class RevokeUserPermissionRequest extends TeaModel {
    /**
     * <p>The ID of the database. The database can be a physical database or a logical database.</p>
     * <br>
     * <p>*   To query the ID of a physical database, call the [ListDatabases](https://help.aliyun.com/document_detail/141873.html) or [SearchDatabase](https://help.aliyun.com/document_detail/141876.html) operation.</p>
     * <p>*   To query the ID of a logical database, call the [ListLogicDatabases](https://help.aliyun.com/document_detail/141874.html) or [SearchDatabase](https://help.aliyun.com/document_detail/141876.html) operation.</p>
     */
    @NameInMap("DbId")
    public String dbId;

    /**
     * <p>The object type on which the permission you want to revoke from the user. Valid values:</p>
     * <br>
     * <p>*   **INSTANCE**: database instances</p>
     * <p>*   **DATABASE**: physical databases</p>
     * <p>*   **LOGIC_DATABASE**: logical databases</p>
     * <p>*   **TABLE**: physical tables</p>
     * <p>*   **LOGIC_TABLE**: logical tables</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("DsType")
    public String dsType;

    /**
     * <p>The ID of the database instance. You must specify this parameter when you revoke a permission from the database instance. You can call the [ListInstances](https://help.aliyun.com/document_detail/141936.html) or [GetInstance](https://help.aliyun.com/document_detail/141567.html) operation to query the database instance ID.</p>
     */
    @NameInMap("InstanceId")
    public Long instanceId;

    /**
     * <p>Specifies whether the database is a logical database. Valid values:</p>
     * <br>
     * <p>* **true**: The database is a logical database.</p>
     * <p>* **false**: The database is a physical database.</p>
     * <br>
     * <p>> * If the database is a logical database, set this parameter to **true**.</p>
     * <p>> * If the database is a physical database, set this parameter to **false**.</p>
     */
    @NameInMap("Logic")
    public Boolean logic;

    /**
     * <p>The type of the permission. Valid values:</p>
     * <br>
     * <p>*   **QUERY**: the data query permission</p>
     * <p>*   **EXPORT**: the data export permission</p>
     * <p>*   **CORRECT**: the data change permission</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("PermTypes")
    public String permTypes;

    /**
     * <p>The ID of the table. You must specify this parameter when you revoke a permission from the table. You can call the [ListTables](https://help.aliyun.com/document_detail/141878.html) operation to query the table ID.</p>
     */
    @NameInMap("TableId")
    public String tableId;

    /**
     * <p>The name of the table. You can call the [ListTables](https://help.aliyun.com/document_detail/141878.html) operation to query the table name.</p>
     */
    @NameInMap("TableName")
    public String tableName;

    /**
     * <p>The ID of the tenant. You can call the [GetUserActiveTenant](https://help.aliyun.com/document_detail/198073.html) operation to query the tenant ID.</p>
     */
    @NameInMap("Tid")
    public Long tid;

    /**
     * <p>The ID of the permission. You can call the [ListUserPermission](https://help.aliyun.com/document_detail/146957.html) operation to query the permission ID.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("UserAccessId")
    public String userAccessId;

    /**
     * <p>The ID of the user. You can call the [ListUsers](https://help.aliyun.com/document_detail/141938.html) or [GetUser](https://help.aliyun.com/document_detail/147098.html) operation to query the user ID.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("UserId")
    public String userId;

    public static RevokeUserPermissionRequest build(java.util.Map<String, ?> map) throws Exception {
        RevokeUserPermissionRequest self = new RevokeUserPermissionRequest();
        return TeaModel.build(map, self);
    }

    public RevokeUserPermissionRequest setDbId(String dbId) {
        this.dbId = dbId;
        return this;
    }
    public String getDbId() {
        return this.dbId;
    }

    public RevokeUserPermissionRequest setDsType(String dsType) {
        this.dsType = dsType;
        return this;
    }
    public String getDsType() {
        return this.dsType;
    }

    public RevokeUserPermissionRequest setInstanceId(Long instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public Long getInstanceId() {
        return this.instanceId;
    }

    public RevokeUserPermissionRequest setLogic(Boolean logic) {
        this.logic = logic;
        return this;
    }
    public Boolean getLogic() {
        return this.logic;
    }

    public RevokeUserPermissionRequest setPermTypes(String permTypes) {
        this.permTypes = permTypes;
        return this;
    }
    public String getPermTypes() {
        return this.permTypes;
    }

    public RevokeUserPermissionRequest setTableId(String tableId) {
        this.tableId = tableId;
        return this;
    }
    public String getTableId() {
        return this.tableId;
    }

    public RevokeUserPermissionRequest setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

    public RevokeUserPermissionRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

    public RevokeUserPermissionRequest setUserAccessId(String userAccessId) {
        this.userAccessId = userAccessId;
        return this;
    }
    public String getUserAccessId() {
        return this.userAccessId;
    }

    public RevokeUserPermissionRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
