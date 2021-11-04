// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class RevokeUserPermissionRequest extends TeaModel {
    @NameInMap("DbId")
    public String dbId;

    @NameInMap("DsType")
    public String dsType;

    @NameInMap("InstanceId")
    public Long instanceId;

    @NameInMap("Logic")
    public Boolean logic;

    @NameInMap("PermTypes")
    public String permTypes;

    @NameInMap("TableId")
    public String tableId;

    @NameInMap("TableName")
    public String tableName;

    @NameInMap("Tid")
    public Long tid;

    @NameInMap("UserAccessId")
    public String userAccessId;

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
