// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class CheckBatchTableAccessPermissionRequest extends TeaModel {
    /**
     * <p>The database ID. You can call the <a href="https://help.aliyun.com/document_detail/141873.html">ListDatabases</a> operation to query the ID of a physical database and the <a href="https://help.aliyun.com/document_detail/141874.html">ListLogicDatabases</a> operation to query the ID of a logical database.</p>
     * <blockquote>
     * <p> The value of DatabaseId is that of DbId.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>43153</p>
     */
    @NameInMap("DbId")
    public Long dbId;

    /**
     * <p>Specifies whether the database is a logical database. Valid values:</p>
     * <ul>
     * <li>true: Logical database.</li>
     * <li>false: Physical database.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Logic")
    public Boolean logic;

    /**
     * <p>The type of the permission to be verified.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>QUERY</li>
     * <li>EXPORT</li>
     * <li>CORRECT</li>
     * <li>LOGIN</li>
     * <li>PERF</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>QUERY</p>
     */
    @NameInMap("PermissionType")
    public String permissionType;

    /**
     * <p>The name of the table.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("TableNameList")
    public java.util.List<String> tableNameList;

    /**
     * <p>The ID of the tenant.</p>
     * <blockquote>
     * <p> View Tenant ID by hovering over your profile icon in the DMS console. For more information, see the <a href="https://help.aliyun.com/document_detail/181330.html">View information about the current tenant</a> section of the &quot;Manage DMS tenants&quot; topic.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>3***</p>
     */
    @NameInMap("Tid")
    public Long tid;

    public static CheckBatchTableAccessPermissionRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckBatchTableAccessPermissionRequest self = new CheckBatchTableAccessPermissionRequest();
        return TeaModel.build(map, self);
    }

    public CheckBatchTableAccessPermissionRequest setDbId(Long dbId) {
        this.dbId = dbId;
        return this;
    }
    public Long getDbId() {
        return this.dbId;
    }

    public CheckBatchTableAccessPermissionRequest setLogic(Boolean logic) {
        this.logic = logic;
        return this;
    }
    public Boolean getLogic() {
        return this.logic;
    }

    public CheckBatchTableAccessPermissionRequest setPermissionType(String permissionType) {
        this.permissionType = permissionType;
        return this;
    }
    public String getPermissionType() {
        return this.permissionType;
    }

    public CheckBatchTableAccessPermissionRequest setTableNameList(java.util.List<String> tableNameList) {
        this.tableNameList = tableNameList;
        return this;
    }
    public java.util.List<String> getTableNameList() {
        return this.tableNameList;
    }

    public CheckBatchTableAccessPermissionRequest setTid(Long tid) {
        this.tid = tid;
        return this;
    }
    public Long getTid() {
        return this.tid;
    }

}
