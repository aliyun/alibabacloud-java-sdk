// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GrantUserPermissionRequest extends TeaModel {
    /**
     * <p>The ID of the database. You can call the [ListDatabases](~~141873~~) operation to query the ID of a physical database and the [ListLogicDatabases](~~141874~~) operation to query the ID of a logical database.</p>
     * <br>
     * <p>>  The value of the DatabaseId parameter is that of the DbId parameter.</p>
     */
    @NameInMap("DbId")
    public String dbId;

    /**
     * <p>The permissions on a specific type of object that you want to grant to the user. Valid values:</p>
     * <br>
     * <p>*   INSTANCE: permissions on instances</p>
     * <p>*   DATABASE: permissions on physical databases</p>
     * <p>*   LOGIC_DATABASE: permissions on logical databases</p>
     * <p>*   TABLE: permissions on physical tables</p>
     * <p>*   LOGIC_TABLE: permissions on logical tables</p>
     */
    @NameInMap("DsType")
    public String dsType;

    /**
     * <p>The time when the permissions expire.</p>
     */
    @NameInMap("ExpireDate")
    public String expireDate;

    /**
     * <p>The ID of the instance. You must specify this parameter if you grant permissions on an instance to the user. You can call the [ListInstances](~~141936~~) or [GetInstance](~~141567~~) operation to query the ID of the instance.</p>
     */
    @NameInMap("InstanceId")
    public Long instanceId;

    /**
     * <p>Specifies whether the database is a logical database. You must specify this parameter if you grant permissions on a database to the user. Valid values:</p>
     * <br>
     * <p>*   true: The database is a logical database.</p>
     * <p>*   false: The database is a physical database.</p>
     */
    @NameInMap("Logic")
    public Boolean logic;

    /**
     * <p>The permission type. Separate multiple permission types with commas (,). Valid values:</p>
     * <br>
     * <p>*   **QUERY**: the query permissions</p>
     * <p>*   **EXPORT**: the export permissions</p>
     * <p>*   **CORRECT**: the change permissions</p>
     * <p>*   **LOGIN**: the logon permissions</p>
     * <p>*   **PERF**: the query permissions on the performance details of the instance</p>
     */
    @NameInMap("PermTypes")
    public String permTypes;

    /**
     * <p>The ID of the table. You must specify this parameter if you grant permissions on a table to the user. You can call the [ListTables](~~141878~~) operation to query the table ID.</p>
     */
    @NameInMap("TableId")
    public String tableId;

    /**
     * <p>The name of the table. You must specify this parameter if you grant permissions on a table to the user.</p>
     */
    @NameInMap("TableName")
    public String tableName;

    /**
     * <p>The ID of the tenant.</p>
     * <br>
     * <p>>  To view the ID of the tenant, move the pointer over the profile picture in the upper-right corner of the Data Management (DMS) console. For more information, see the "View information about the current tenant" section of the [Manage DMS tenants](~~181330~~) topic.</p>
     */
    @NameInMap("Tid")
    public Long tid;

    /**
     * <p>The ID of the user. You can call the [GetUser](~~147098~~) or [ListUsers](~~141938~~) operation to query the ID of the user.</p>
     * <br>
     * <p>>  The user ID is different from the ID of your Alibaba Cloud account.</p>
     */
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
