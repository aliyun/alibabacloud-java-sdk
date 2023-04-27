// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class RevokeUserPermissionRequest extends TeaModel {
    /**
     * <p>Specifies whether the database is a logical database. Valid values:</p>
     * <br>
     * <p>*   **true**: The database is a logical database.</p>
     * <p>*   **false**: The database is a physical database.</p>
     * <br>
     * <p>> </p>
     * <p>*   If the database is a logical database, set this parameter to **true**.</p>
     * <p>*   If the database is a physical database, set this parameter to **false**.</p>
     */
    @NameInMap("DbId")
    public String dbId;

    /**
     * <p>The ID of the database. The database can be a physical database or a logical database.</p>
     * <br>
     * <p>*   To query the ID of a physical database, call the [ListDatabases](~~141873~~) or [SearchDatabase](~~141876~~) operation.</p>
     * <p>*   To query the ID of a logical database, call the [ListLogicDatabases](~~141874~~) or [SearchDatabase](~~141876~~) operation.</p>
     */
    @NameInMap("DsType")
    public String dsType;

    /**
     * <p>The error message returned.</p>
     */
    @NameInMap("InstanceId")
    public Long instanceId;

    /**
     * <p>The type of the permission. Valid values:</p>
     * <br>
     * <p>*   **QUERY**: the data query permission</p>
     * <p>*   **EXPORT**: the data export permission</p>
     * <p>*   **CORRECT**: the data change permission</p>
     */
    @NameInMap("Logic")
    public Boolean logic;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("PermTypes")
    public String permTypes;

    /**
     * <p>The ID of the tenant. You can call the [GetUserActiveTenant](~~198073~~) operation to query the tenant ID.</p>
     */
    @NameInMap("TableId")
    public String tableId;

    /**
     * <p>The ID of the database instance. You must specify this parameter when you revoke a permission from the database instance. You can call the [ListInstances](~~141936~~) or [GetInstance](~~141567~~) operation to query the database instance ID.</p>
     */
    @NameInMap("TableName")
    public String tableName;

    /**
     * <p>The error code returned.</p>
     */
    @NameInMap("Tid")
    public Long tid;

    /**
     * <p>Revokes a permission on a resource from a user.</p>
     */
    @NameInMap("UserAccessId")
    public String userAccessId;

    /**
     * <p>The operation that you want to perform. Set the value to **RevokeUserPermission**.</p>
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
