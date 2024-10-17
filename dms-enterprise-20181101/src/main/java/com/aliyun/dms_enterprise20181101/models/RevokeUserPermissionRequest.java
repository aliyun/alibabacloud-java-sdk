// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class RevokeUserPermissionRequest extends TeaModel {
    /**
     * <p>The database ID. The database can be a physical database or a logical database.</p>
     * <ul>
     * <li>To query the ID of a physical database, call the <a href="https://help.aliyun.com/document_detail/141873.html">ListDatabases</a> or <a href="https://help.aliyun.com/document_detail/141876.html">SearchDatabase</a> operation.</li>
     * <li>To query the ID of a logical database, call the <a href="https://help.aliyun.com/document_detail/141874.html">ListLogicDatabases</a> or <a href="https://help.aliyun.com/document_detail/141876.html">SearchDatabase</a> operation.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1860****</p>
     */
    @NameInMap("DbId")
    public String dbId;

    /**
     * <p>The type of the object on which you want to revoke permissions from a user. Valid values:</p>
     * <ul>
     * <li><strong>INSTANCE</strong>: instances.</li>
     * <li><strong>DATABASE</strong>: physical databases.</li>
     * <li><strong>LOGIC_DATABASE</strong>: logical databases.</li>
     * <li><strong>TABLE</strong>: physical tables.</li>
     * <li><strong>LOGIC_TABLE</strong>: logical tables.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>DATABASE</p>
     */
    @NameInMap("DsType")
    public String dsType;

    /**
     * <p>The database instance ID. You must specify this parameter if you revoke a permission from the database instance. You can call the <a href="https://help.aliyun.com/document_detail/141936.html">ListInstances</a> or <a href="https://help.aliyun.com/document_detail/141567.html">GetInstance</a> operation to query the ID of the database instance.</p>
     * 
     * <strong>example:</strong>
     * <p>174****</p>
     */
    @NameInMap("InstanceId")
    public Long instanceId;

    /**
     * <p>Specifies whether the database is a logical database. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: The database is a logical database.</li>
     * <li><strong>false</strong>: The database is a physical database.</li>
     * </ul>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>If the database is a logical database, set this parameter to <strong>true</strong>.</p>
     * </li>
     * <li><p>If the database is a physical database, set this parameter to <strong>false</strong>.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Logic")
    public Boolean logic;

    /**
     * <p>The type of the permissions. Valid values:</p>
     * <ul>
     * <li><strong>QUERY</strong>: query permissions.</li>
     * <li><strong>EXPORT</strong>: export permissions.</li>
     * <li><strong>CORRECT</strong>: change permissions.</li>
     * <li><strong>LOGIN</strong>: logon permissions.</li>
     * <li><strong>PERF</strong>: query permissions on the performance details of an instance.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>CORRECT</p>
     */
    @NameInMap("PermTypes")
    public String permTypes;

    /**
     * <p>The table ID. You must specify this parameter if you revoke a permission from the table. You can call the <a href="https://help.aliyun.com/document_detail/141878.html">ListTables</a> operation to query the table ID.</p>
     * 
     * <strong>example:</strong>
     * <p>13****</p>
     */
    @NameInMap("TableId")
    public String tableId;

    /**
     * <p>The name of the table. You can call the <a href="https://help.aliyun.com/document_detail/141878.html">ListTables</a> operation to query the table name.</p>
     * 
     * <strong>example:</strong>
     * <p>table_name</p>
     */
    @NameInMap("TableName")
    public String tableName;

    /**
     * <p>The tenant ID. You can call the <a href="https://help.aliyun.com/document_detail/198073.html">GetUserActiveTenant</a> operation to query the tenant ID.</p>
     * 
     * <strong>example:</strong>
     * <p>3***</p>
     */
    @NameInMap("Tid")
    public Long tid;

    /**
     * <p>The permission ID. You can call the <a href="https://help.aliyun.com/document_detail/146957.html">ListUserPermission</a> operation to query the permission ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>774****</p>
     */
    @NameInMap("UserAccessId")
    public String userAccessId;

    /**
     * <p>The user ID. You can call the <a href="https://help.aliyun.com/document_detail/141938.html">ListUsers</a> or <a href="https://help.aliyun.com/document_detail/147098.html">GetUser</a> operation to query the ID of the user.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>51****</p>
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
