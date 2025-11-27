// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class CheckBatchTableAccessPermissionRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>43153</p>
     */
    @NameInMap("DbId")
    public Long dbId;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Logic")
    public Boolean logic;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>QUERY</p>
     */
    @NameInMap("PermissionType")
    public String permissionType;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("TableNameList")
    public java.util.List<String> tableNameList;

    /**
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
