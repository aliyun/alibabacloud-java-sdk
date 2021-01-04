// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListDatabaseUserPermssionsResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Long totalCount;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("UserPermissions")
    public ListDatabaseUserPermssionsResponseBodyUserPermissions userPermissions;

    @NameInMap("Success")
    public Boolean success;

    public static ListDatabaseUserPermssionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDatabaseUserPermssionsResponseBody self = new ListDatabaseUserPermssionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDatabaseUserPermssionsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public ListDatabaseUserPermssionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDatabaseUserPermssionsResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListDatabaseUserPermssionsResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListDatabaseUserPermssionsResponseBody setUserPermissions(ListDatabaseUserPermssionsResponseBodyUserPermissions userPermissions) {
        this.userPermissions = userPermissions;
        return this;
    }
    public ListDatabaseUserPermssionsResponseBodyUserPermissions getUserPermissions() {
        return this.userPermissions;
    }

    public ListDatabaseUserPermssionsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListDatabaseUserPermssionsResponseBodyUserPermissionsUserPermissionPermDetailsPermDetail extends TeaModel {
        @NameInMap("OriginFrom")
        public String originFrom;

        @NameInMap("PermType")
        public String permType;

        @NameInMap("ExpireDate")
        public String expireDate;

        @NameInMap("CreateDate")
        public String createDate;

        @NameInMap("UserAccessId")
        public String userAccessId;

        @NameInMap("ExtraData")
        public String extraData;

        public static ListDatabaseUserPermssionsResponseBodyUserPermissionsUserPermissionPermDetailsPermDetail build(java.util.Map<String, ?> map) throws Exception {
            ListDatabaseUserPermssionsResponseBodyUserPermissionsUserPermissionPermDetailsPermDetail self = new ListDatabaseUserPermssionsResponseBodyUserPermissionsUserPermissionPermDetailsPermDetail();
            return TeaModel.build(map, self);
        }

        public ListDatabaseUserPermssionsResponseBodyUserPermissionsUserPermissionPermDetailsPermDetail setOriginFrom(String originFrom) {
            this.originFrom = originFrom;
            return this;
        }
        public String getOriginFrom() {
            return this.originFrom;
        }

        public ListDatabaseUserPermssionsResponseBodyUserPermissionsUserPermissionPermDetailsPermDetail setPermType(String permType) {
            this.permType = permType;
            return this;
        }
        public String getPermType() {
            return this.permType;
        }

        public ListDatabaseUserPermssionsResponseBodyUserPermissionsUserPermissionPermDetailsPermDetail setExpireDate(String expireDate) {
            this.expireDate = expireDate;
            return this;
        }
        public String getExpireDate() {
            return this.expireDate;
        }

        public ListDatabaseUserPermssionsResponseBodyUserPermissionsUserPermissionPermDetailsPermDetail setCreateDate(String createDate) {
            this.createDate = createDate;
            return this;
        }
        public String getCreateDate() {
            return this.createDate;
        }

        public ListDatabaseUserPermssionsResponseBodyUserPermissionsUserPermissionPermDetailsPermDetail setUserAccessId(String userAccessId) {
            this.userAccessId = userAccessId;
            return this;
        }
        public String getUserAccessId() {
            return this.userAccessId;
        }

        public ListDatabaseUserPermssionsResponseBodyUserPermissionsUserPermissionPermDetailsPermDetail setExtraData(String extraData) {
            this.extraData = extraData;
            return this;
        }
        public String getExtraData() {
            return this.extraData;
        }

    }

    public static class ListDatabaseUserPermssionsResponseBodyUserPermissionsUserPermissionPermDetails extends TeaModel {
        @NameInMap("PermDetail")
        public java.util.List<ListDatabaseUserPermssionsResponseBodyUserPermissionsUserPermissionPermDetailsPermDetail> permDetail;

        public static ListDatabaseUserPermssionsResponseBodyUserPermissionsUserPermissionPermDetails build(java.util.Map<String, ?> map) throws Exception {
            ListDatabaseUserPermssionsResponseBodyUserPermissionsUserPermissionPermDetails self = new ListDatabaseUserPermssionsResponseBodyUserPermissionsUserPermissionPermDetails();
            return TeaModel.build(map, self);
        }

        public ListDatabaseUserPermssionsResponseBodyUserPermissionsUserPermissionPermDetails setPermDetail(java.util.List<ListDatabaseUserPermssionsResponseBodyUserPermissionsUserPermissionPermDetailsPermDetail> permDetail) {
            this.permDetail = permDetail;
            return this;
        }
        public java.util.List<ListDatabaseUserPermssionsResponseBodyUserPermissionsUserPermissionPermDetailsPermDetail> getPermDetail() {
            return this.permDetail;
        }

    }

    public static class ListDatabaseUserPermssionsResponseBodyUserPermissionsUserPermission extends TeaModel {
        @NameInMap("DbId")
        public String dbId;

        @NameInMap("TableName")
        public String tableName;

        @NameInMap("UserId")
        public String userId;

        @NameInMap("SchemaName")
        public String schemaName;

        @NameInMap("Logic")
        public Boolean logic;

        @NameInMap("UserNickName")
        public String userNickName;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("PermDetails")
        public ListDatabaseUserPermssionsResponseBodyUserPermissionsUserPermissionPermDetails permDetails;

        @NameInMap("EnvType")
        public String envType;

        @NameInMap("ColumnName")
        public String columnName;

        @NameInMap("DbType")
        public String dbType;

        @NameInMap("DsType")
        public String dsType;

        @NameInMap("TableId")
        public String tableId;

        @NameInMap("SearchName")
        public String searchName;

        @NameInMap("Alias")
        public String alias;

        public static ListDatabaseUserPermssionsResponseBodyUserPermissionsUserPermission build(java.util.Map<String, ?> map) throws Exception {
            ListDatabaseUserPermssionsResponseBodyUserPermissionsUserPermission self = new ListDatabaseUserPermssionsResponseBodyUserPermissionsUserPermission();
            return TeaModel.build(map, self);
        }

        public ListDatabaseUserPermssionsResponseBodyUserPermissionsUserPermission setDbId(String dbId) {
            this.dbId = dbId;
            return this;
        }
        public String getDbId() {
            return this.dbId;
        }

        public ListDatabaseUserPermssionsResponseBodyUserPermissionsUserPermission setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

        public ListDatabaseUserPermssionsResponseBodyUserPermissionsUserPermission setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public ListDatabaseUserPermssionsResponseBodyUserPermissionsUserPermission setSchemaName(String schemaName) {
            this.schemaName = schemaName;
            return this;
        }
        public String getSchemaName() {
            return this.schemaName;
        }

        public ListDatabaseUserPermssionsResponseBodyUserPermissionsUserPermission setLogic(Boolean logic) {
            this.logic = logic;
            return this;
        }
        public Boolean getLogic() {
            return this.logic;
        }

        public ListDatabaseUserPermssionsResponseBodyUserPermissionsUserPermission setUserNickName(String userNickName) {
            this.userNickName = userNickName;
            return this;
        }
        public String getUserNickName() {
            return this.userNickName;
        }

        public ListDatabaseUserPermssionsResponseBodyUserPermissionsUserPermission setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListDatabaseUserPermssionsResponseBodyUserPermissionsUserPermission setPermDetails(ListDatabaseUserPermssionsResponseBodyUserPermissionsUserPermissionPermDetails permDetails) {
            this.permDetails = permDetails;
            return this;
        }
        public ListDatabaseUserPermssionsResponseBodyUserPermissionsUserPermissionPermDetails getPermDetails() {
            return this.permDetails;
        }

        public ListDatabaseUserPermssionsResponseBodyUserPermissionsUserPermission setEnvType(String envType) {
            this.envType = envType;
            return this;
        }
        public String getEnvType() {
            return this.envType;
        }

        public ListDatabaseUserPermssionsResponseBodyUserPermissionsUserPermission setColumnName(String columnName) {
            this.columnName = columnName;
            return this;
        }
        public String getColumnName() {
            return this.columnName;
        }

        public ListDatabaseUserPermssionsResponseBodyUserPermissionsUserPermission setDbType(String dbType) {
            this.dbType = dbType;
            return this;
        }
        public String getDbType() {
            return this.dbType;
        }

        public ListDatabaseUserPermssionsResponseBodyUserPermissionsUserPermission setDsType(String dsType) {
            this.dsType = dsType;
            return this;
        }
        public String getDsType() {
            return this.dsType;
        }

        public ListDatabaseUserPermssionsResponseBodyUserPermissionsUserPermission setTableId(String tableId) {
            this.tableId = tableId;
            return this;
        }
        public String getTableId() {
            return this.tableId;
        }

        public ListDatabaseUserPermssionsResponseBodyUserPermissionsUserPermission setSearchName(String searchName) {
            this.searchName = searchName;
            return this;
        }
        public String getSearchName() {
            return this.searchName;
        }

        public ListDatabaseUserPermssionsResponseBodyUserPermissionsUserPermission setAlias(String alias) {
            this.alias = alias;
            return this;
        }
        public String getAlias() {
            return this.alias;
        }

    }

    public static class ListDatabaseUserPermssionsResponseBodyUserPermissions extends TeaModel {
        @NameInMap("UserPermission")
        public java.util.List<ListDatabaseUserPermssionsResponseBodyUserPermissionsUserPermission> userPermission;

        public static ListDatabaseUserPermssionsResponseBodyUserPermissions build(java.util.Map<String, ?> map) throws Exception {
            ListDatabaseUserPermssionsResponseBodyUserPermissions self = new ListDatabaseUserPermssionsResponseBodyUserPermissions();
            return TeaModel.build(map, self);
        }

        public ListDatabaseUserPermssionsResponseBodyUserPermissions setUserPermission(java.util.List<ListDatabaseUserPermssionsResponseBodyUserPermissionsUserPermission> userPermission) {
            this.userPermission = userPermission;
            return this;
        }
        public java.util.List<ListDatabaseUserPermssionsResponseBodyUserPermissionsUserPermission> getUserPermission() {
            return this.userPermission;
        }

    }

}
