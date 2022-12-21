// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListUserPermissionsResponseBody extends TeaModel {
    // The error code.
    @NameInMap("ErrorCode")
    public String errorCode;

    // The error message.
    @NameInMap("ErrorMessage")
    public String errorMessage;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // Indicates whether the request is successful. Valid values:
    // 
    // - true: The request is successful.
    // - false: The request fails.
    @NameInMap("Success")
    public Boolean success;

    // The total number of entries that meet the query conditions.
    @NameInMap("TotalCount")
    public Long totalCount;

    // The details of the permissions that the user has.
    @NameInMap("UserPermissions")
    public ListUserPermissionsResponseBodyUserPermissions userPermissions;

    public static ListUserPermissionsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListUserPermissionsResponseBody self = new ListUserPermissionsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListUserPermissionsResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListUserPermissionsResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListUserPermissionsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListUserPermissionsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListUserPermissionsResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public ListUserPermissionsResponseBody setUserPermissions(ListUserPermissionsResponseBodyUserPermissions userPermissions) {
        this.userPermissions = userPermissions;
        return this;
    }
    public ListUserPermissionsResponseBodyUserPermissions getUserPermissions() {
        return this.userPermissions;
    }

    public static class ListUserPermissionsResponseBodyUserPermissionsUserPermissionPermDetailsPermDetail extends TeaModel {
        // The time when the permissions were granted.
        @NameInMap("CreateDate")
        public String createDate;

        // The time when the permissions expire.
        @NameInMap("ExpireDate")
        public String expireDate;

        // This parameter is reserved.
        @NameInMap("ExtraData")
        public String extraData;

        // The user who grants the permissions.
        @NameInMap("OriginFrom")
        public String originFrom;

        // The type of the permissions. Valid values:
        // 
        // *   QUERY: the query permissions
        // *   EXPORT: the export permissions
        // *   CORRECT: the change permissions
        @NameInMap("PermType")
        public String permType;

        // The ID of the authorization record.
        @NameInMap("UserAccessId")
        public String userAccessId;

        public static ListUserPermissionsResponseBodyUserPermissionsUserPermissionPermDetailsPermDetail build(java.util.Map<String, ?> map) throws Exception {
            ListUserPermissionsResponseBodyUserPermissionsUserPermissionPermDetailsPermDetail self = new ListUserPermissionsResponseBodyUserPermissionsUserPermissionPermDetailsPermDetail();
            return TeaModel.build(map, self);
        }

        public ListUserPermissionsResponseBodyUserPermissionsUserPermissionPermDetailsPermDetail setCreateDate(String createDate) {
            this.createDate = createDate;
            return this;
        }
        public String getCreateDate() {
            return this.createDate;
        }

        public ListUserPermissionsResponseBodyUserPermissionsUserPermissionPermDetailsPermDetail setExpireDate(String expireDate) {
            this.expireDate = expireDate;
            return this;
        }
        public String getExpireDate() {
            return this.expireDate;
        }

        public ListUserPermissionsResponseBodyUserPermissionsUserPermissionPermDetailsPermDetail setExtraData(String extraData) {
            this.extraData = extraData;
            return this;
        }
        public String getExtraData() {
            return this.extraData;
        }

        public ListUserPermissionsResponseBodyUserPermissionsUserPermissionPermDetailsPermDetail setOriginFrom(String originFrom) {
            this.originFrom = originFrom;
            return this;
        }
        public String getOriginFrom() {
            return this.originFrom;
        }

        public ListUserPermissionsResponseBodyUserPermissionsUserPermissionPermDetailsPermDetail setPermType(String permType) {
            this.permType = permType;
            return this;
        }
        public String getPermType() {
            return this.permType;
        }

        public ListUserPermissionsResponseBodyUserPermissionsUserPermissionPermDetailsPermDetail setUserAccessId(String userAccessId) {
            this.userAccessId = userAccessId;
            return this;
        }
        public String getUserAccessId() {
            return this.userAccessId;
        }

    }

    public static class ListUserPermissionsResponseBodyUserPermissionsUserPermissionPermDetails extends TeaModel {
        @NameInMap("PermDetail")
        public java.util.List<ListUserPermissionsResponseBodyUserPermissionsUserPermissionPermDetailsPermDetail> permDetail;

        public static ListUserPermissionsResponseBodyUserPermissionsUserPermissionPermDetails build(java.util.Map<String, ?> map) throws Exception {
            ListUserPermissionsResponseBodyUserPermissionsUserPermissionPermDetails self = new ListUserPermissionsResponseBodyUserPermissionsUserPermissionPermDetails();
            return TeaModel.build(map, self);
        }

        public ListUserPermissionsResponseBodyUserPermissionsUserPermissionPermDetails setPermDetail(java.util.List<ListUserPermissionsResponseBodyUserPermissionsUserPermissionPermDetailsPermDetail> permDetail) {
            this.permDetail = permDetail;
            return this;
        }
        public java.util.List<ListUserPermissionsResponseBodyUserPermissionsUserPermissionPermDetailsPermDetail> getPermDetail() {
            return this.permDetail;
        }

    }

    public static class ListUserPermissionsResponseBodyUserPermissionsUserPermission extends TeaModel {
        // The alias of the instance.
        @NameInMap("Alias")
        public String alias;

        // The name of the field.
        @NameInMap("ColumnName")
        public String columnName;

        // The ID of the database.
        @NameInMap("DbId")
        public String dbId;

        // The type of the database. For more information about the valid values of this parameter, see [DbType parameter](https://www.alibabacloud.com/help/en/data-management-service/latest/dbtype-parameter).
        @NameInMap("DbType")
        public String dbType;

        // The permissions on a specific type of objects that are granted to the user. Valid values: 
        // 
        // - DATABASE: permissions on physical databases
        // - LOGIC_DATABASE: permissions on logical databases
        // - TABLE: permissions on physical tables
        // - LOGIC_TABLE: permissions on logical tables
        @NameInMap("DsType")
        public String dsType;

        // The type of the environment to which the database belongs. Valid values:
        // 
        // - product: production environment
        // - dev: development environment
        // - pre: staging environment
        // - test: test environment
        // - sit: SIT environment
        // - uat: UAT environment
        // - pet: stress testing environment
        // - stag: STAG environment
        @NameInMap("EnvType")
        public String envType;

        // The endpoint that is used to connect the database.
        @NameInMap("Host")
        public String host;

        // The ID of the instance.
        @NameInMap("InstanceId")
        public String instanceId;

        // Indicates whether the database is a logical database. Valid values:
        // 
        // *   true: The database is a logical database.
        // *   false: The database is a physical database.
        @NameInMap("Logic")
        public Boolean logic;

        // The details of permissions.
        @NameInMap("PermDetails")
        public ListUserPermissionsResponseBodyUserPermissionsUserPermissionPermDetails permDetails;

        // The port that is used to connect to the instance.
        @NameInMap("Port")
        public Long port;

        // The name of the database.
        @NameInMap("SchemaName")
        public String schemaName;

        // The name that is used to search for the database.
        @NameInMap("SearchName")
        public String searchName;

        // The ID of the table.
        @NameInMap("TableId")
        public String tableId;

        // The name of the table.
        @NameInMap("TableName")
        public String tableName;

        // The ID of the user.
        @NameInMap("UserId")
        public String userId;

        // The nickname of the user.
        @NameInMap("UserNickName")
        public String userNickName;

        public static ListUserPermissionsResponseBodyUserPermissionsUserPermission build(java.util.Map<String, ?> map) throws Exception {
            ListUserPermissionsResponseBodyUserPermissionsUserPermission self = new ListUserPermissionsResponseBodyUserPermissionsUserPermission();
            return TeaModel.build(map, self);
        }

        public ListUserPermissionsResponseBodyUserPermissionsUserPermission setAlias(String alias) {
            this.alias = alias;
            return this;
        }
        public String getAlias() {
            return this.alias;
        }

        public ListUserPermissionsResponseBodyUserPermissionsUserPermission setColumnName(String columnName) {
            this.columnName = columnName;
            return this;
        }
        public String getColumnName() {
            return this.columnName;
        }

        public ListUserPermissionsResponseBodyUserPermissionsUserPermission setDbId(String dbId) {
            this.dbId = dbId;
            return this;
        }
        public String getDbId() {
            return this.dbId;
        }

        public ListUserPermissionsResponseBodyUserPermissionsUserPermission setDbType(String dbType) {
            this.dbType = dbType;
            return this;
        }
        public String getDbType() {
            return this.dbType;
        }

        public ListUserPermissionsResponseBodyUserPermissionsUserPermission setDsType(String dsType) {
            this.dsType = dsType;
            return this;
        }
        public String getDsType() {
            return this.dsType;
        }

        public ListUserPermissionsResponseBodyUserPermissionsUserPermission setEnvType(String envType) {
            this.envType = envType;
            return this;
        }
        public String getEnvType() {
            return this.envType;
        }

        public ListUserPermissionsResponseBodyUserPermissionsUserPermission setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public ListUserPermissionsResponseBodyUserPermissionsUserPermission setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListUserPermissionsResponseBodyUserPermissionsUserPermission setLogic(Boolean logic) {
            this.logic = logic;
            return this;
        }
        public Boolean getLogic() {
            return this.logic;
        }

        public ListUserPermissionsResponseBodyUserPermissionsUserPermission setPermDetails(ListUserPermissionsResponseBodyUserPermissionsUserPermissionPermDetails permDetails) {
            this.permDetails = permDetails;
            return this;
        }
        public ListUserPermissionsResponseBodyUserPermissionsUserPermissionPermDetails getPermDetails() {
            return this.permDetails;
        }

        public ListUserPermissionsResponseBodyUserPermissionsUserPermission setPort(Long port) {
            this.port = port;
            return this;
        }
        public Long getPort() {
            return this.port;
        }

        public ListUserPermissionsResponseBodyUserPermissionsUserPermission setSchemaName(String schemaName) {
            this.schemaName = schemaName;
            return this;
        }
        public String getSchemaName() {
            return this.schemaName;
        }

        public ListUserPermissionsResponseBodyUserPermissionsUserPermission setSearchName(String searchName) {
            this.searchName = searchName;
            return this;
        }
        public String getSearchName() {
            return this.searchName;
        }

        public ListUserPermissionsResponseBodyUserPermissionsUserPermission setTableId(String tableId) {
            this.tableId = tableId;
            return this;
        }
        public String getTableId() {
            return this.tableId;
        }

        public ListUserPermissionsResponseBodyUserPermissionsUserPermission setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

        public ListUserPermissionsResponseBodyUserPermissionsUserPermission setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

        public ListUserPermissionsResponseBodyUserPermissionsUserPermission setUserNickName(String userNickName) {
            this.userNickName = userNickName;
            return this;
        }
        public String getUserNickName() {
            return this.userNickName;
        }

    }

    public static class ListUserPermissionsResponseBodyUserPermissions extends TeaModel {
        @NameInMap("UserPermission")
        public java.util.List<ListUserPermissionsResponseBodyUserPermissionsUserPermission> userPermission;

        public static ListUserPermissionsResponseBodyUserPermissions build(java.util.Map<String, ?> map) throws Exception {
            ListUserPermissionsResponseBodyUserPermissions self = new ListUserPermissionsResponseBodyUserPermissions();
            return TeaModel.build(map, self);
        }

        public ListUserPermissionsResponseBodyUserPermissions setUserPermission(java.util.List<ListUserPermissionsResponseBodyUserPermissionsUserPermission> userPermission) {
            this.userPermission = userPermission;
            return this;
        }
        public java.util.List<ListUserPermissionsResponseBodyUserPermissionsUserPermission> getUserPermission() {
            return this.userPermission;
        }

    }

}
