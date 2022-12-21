// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GrantUserPermissionRequest extends TeaModel {
    // The ID of the database. You can call the [ListDatabases](~~141873~~) operation to query the ID of a physical database and the [ListLogicDatabases](~~141874~~) operation to query the ID of a logical database.
    // 
    // >  The value of the DatabaseId parameter is that of the DbId parameter.
    @NameInMap("DbId")
    public String dbId;

    // The permissions on a specific type of object that you want to grant to the user. Valid values:
    // 
    // *   INSTANCE: permissions on instances
    // *   DATABASE: permissions on physical databases
    // *   LOGIC_DATABASE: permissions on logical databases
    // *   TABLE: permissions on physical tables
    // *   LOGIC_TABLE: permissions on logical tables
    @NameInMap("DsType")
    public String dsType;

    // The time when the permissions expire.
    @NameInMap("ExpireDate")
    public String expireDate;

    // The ID of the instance. You must specify this parameter if you grant permissions on an instance to the user. You can call the [ListInstances](~~141936~~) or [GetInstance](~~141567~~) operation to query the ID of the instance.
    @NameInMap("InstanceId")
    public Long instanceId;

    // Specifies whether the database is a logical database. You must specify this parameter if you grant permissions on a database to the user. Valid values:
    // 
    // *   true: The database is a logical database.
    // *   false: The database is a physical database.
    @NameInMap("Logic")
    public Boolean logic;

    // The permission type. Separate multiple permission types with commas (,). Valid values:
    // 
    // *   **QUERY**: the query permissions
    // *   **EXPORT**: the export permissions
    // *   **CORRECT**: the change permissions
    // *   **LOGIN**: the logon permissions
    // *   **PERF**: the query permissions on the performance details of the instance
    @NameInMap("PermTypes")
    public String permTypes;

    // The ID of the table. You must specify this parameter if you grant permissions on a table to the user. You can call the [ListTables](~~141878~~) operation to query the table ID.
    @NameInMap("TableId")
    public String tableId;

    // The name of the table. You must specify this parameter if you grant permissions on a table to the user.
    @NameInMap("TableName")
    public String tableName;

    // The ID of the tenant.
    // 
    // >  To view the ID of the tenant, move the pointer over the profile picture in the upper-right corner of the Data Management (DMS) console. For more information, see the "View information about the current tenant" section of the [Manage DMS tenants](~~181330~~) topic.
    @NameInMap("Tid")
    public Long tid;

    // The ID of the user. You can call the [GetUser](~~147098~~) or [ListUsers](~~141938~~) operation to query the ID of the user.
    // 
    // >  The user ID is different from the ID of your Alibaba Cloud account.
    @NameInMap("UserId")
    public String userId;

    public static GrantUserPermissionRequest build(java.util.Map<String, ?> map) throws Exception {
        GrantUserPermissionRequest self = new GrantUserPermissionRequest();
        return TeaModel.build(map, self);
    }

    public GrantUserPermissionRequest setDbId(String dbId) {
        this.dbId = dbId;
        return this;
    }
    public String getDbId() {
        return this.dbId;
    }

    public GrantUserPermissionRequest setDsType(String dsType) {
        this.dsType = dsType;
        return this;
    }
    public String getDsType() {
        return this.dsType;
    }

    public GrantUserPermissionRequest setExpireDate(String expireDate) {
        this.expireDate = expireDate;
        return this;
    }
    public String getExpireDate() {
        return this.expireDate;
    }

    public GrantUserPermissionRequest setInstanceId(Long instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public Long getInstanceId() {
        return this.instanceId;
    }

    public GrantUserPermissionRequest setLogic(Boolean logic) {
        this.logic = logic;
        return this;
    }
    public Boolean getLogic() {
        return this.logic;
    }

    public GrantUserPermissionRequest setPermTypes(String permTypes) {
        this.permTypes = permTypes;
        return this;
    }
    public String getPermTypes() {
        return this.permTypes;
    }

    public GrantUserPermissionRequest setTableId(String tableId) {
        this.tableId = tableId;
        return this;
    }
    public String getTableId() {
        return this.tableId;
    }

    public GrantUserPermissionRequest setTableName(String tableName) {
        this.tableName = tableName;
        return this;
    }
    public String getTableName() {
        return this.tableName;
    }

    public GrantUserPermissionRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

    public GrantUserPermissionRequest setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

}
