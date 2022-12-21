// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class RevokeUserPermissionRequest extends TeaModel {
    // The ID of the database. The database can be a physical database or a logical database.
    // 
    // *   To query the ID of a physical database, call the [ListDatabases](~~141873~~) or [SearchDatabase](~~141876~~) operation.
    // *   To query the ID of a logical database, call the [ListLogicDatabases](~~141874~~) or [SearchDatabase](~~141876~~) operation.
    @NameInMap("DbId")
    public String dbId;

    // The object type on which the permission you want to revoke from the user. Valid values:
    // 
    // *   **INSTANCE**: database instances
    // *   **DATABASE**: physical databases
    // *   **LOGIC_DATABASE**: logical databases
    // *   **TABLE**: physical tables
    // *   **LOGIC_TABLE**: logical tables
    @NameInMap("DsType")
    public String dsType;

    // The ID of the database instance. You must specify this parameter when you revoke a permission from the database instance. You can call the [ListInstances](~~141936~~) or [GetInstance](~~141567~~) operation to query the database instance ID.
    @NameInMap("InstanceId")
    public Long instanceId;

    // Specifies whether the database is a logical database. Valid values:
    // 
    // *   **true**: The database is a logical database.
    // *   **false**: The database is a physical database.
    // 
    // > 
    // *   If the database is a logical database, set this parameter to **true**.
    // *   If the database is a physical database, set this parameter to **false**.
    @NameInMap("Logic")
    public Boolean logic;

    // The type of the permission. Valid values:
    // 
    // *   **QUERY**: the data query permission
    // *   **EXPORT**: the data export permission
    // *   **CORRECT**: the data change permission
    @NameInMap("PermTypes")
    public String permTypes;

    // The ID of the table. You must specify this parameter when you revoke a permission from the table. You can call the [ListTables](~~141878~~) operation to query the table ID.
    @NameInMap("TableId")
    public String tableId;

    // The name of the table. You can call the [ListTables](~~141878~~) operation to query the table name.
    @NameInMap("TableName")
    public String tableName;

    // The ID of the tenant. You can call the [GetUserActiveTenant](~~198073~~) operation to query the tenant ID.
    @NameInMap("Tid")
    public Long tid;

    // The ID of the permission. You can call the [ListUserPermission](~~146957~~) operation to query the permission ID.
    @NameInMap("UserAccessId")
    public String userAccessId;

    // The ID of the user. You can call the [ListUsers](~~141938~~) or [GetUser](~~147098~~) operation to query the user ID.
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
