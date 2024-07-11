// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListUserPermissionsResponseBody extends TeaModel {
    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>UnknownError</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>UnknownError</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>C51420E3-144A-4A94-B473-8662FCF4AD10</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful. Valid values:</p>
     * <ul>
     * <li>true: The request is successful.</li>
     * <li>false: The request fails.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The total number of entries that meet the query conditions.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    /**
     * <p>The details of the permissions that the user has.</p>
     */
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
        /**
         * <p>The time when the permissions were granted.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-12-12 00:00:00</p>
         */
        @NameInMap("CreateDate")
        public String createDate;

        /**
         * <p>The time when the permissions expire.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-12-12 00:00:00</p>
         */
        @NameInMap("ExpireDate")
        public String expireDate;

        /**
         * <p>This parameter is reserved.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx</p>
         */
        @NameInMap("ExtraData")
        public String extraData;

        /**
         * <p>The user who grants the permissions.</p>
         * 
         * <strong>example:</strong>
         * <p>xxx authorization</p>
         */
        @NameInMap("OriginFrom")
        public String originFrom;

        /**
         * <p>The type of the permissions. Valid values:</p>
         * <ul>
         * <li>QUERY: the query permissions</li>
         * <li>EXPORT: the export permissions</li>
         * <li>CORRECT: the change permissions</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>QUERY</p>
         */
        @NameInMap("PermType")
        public String permType;

        /**
         * <p>The ID of the authorization record.</p>
         * 
         * <strong>example:</strong>
         * <p>758****</p>
         */
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
        /**
         * <p>The alias of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>instance_alias</p>
         */
        @NameInMap("Alias")
        public String alias;

        /**
         * <p>The name of the field.</p>
         * 
         * <strong>example:</strong>
         * <p>column_name</p>
         */
        @NameInMap("ColumnName")
        public String columnName;

        /**
         * <p>The ID of the database.</p>
         * 
         * <strong>example:</strong>
         * <p>1860****</p>
         */
        @NameInMap("DbId")
        public String dbId;

        /**
         * <p>The type of the database. For more information about the valid values of this parameter, see <a href="https://www.alibabacloud.com/help/en/data-management-service/latest/dbtype-parameter">DbType parameter</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>polardb</p>
         */
        @NameInMap("DbType")
        public String dbType;

        /**
         * <p>The permissions on a specific type of objects that are granted to the user. Valid values: </p>
         * <ul>
         * <li>DATABASE: permissions on physical databases</li>
         * <li>LOGIC_DATABASE: permissions on logical databases</li>
         * <li>TABLE: permissions on physical tables</li>
         * <li>LOGIC_TABLE: permissions on logical tables</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DATABASE</p>
         */
        @NameInMap("DsType")
        public String dsType;

        /**
         * <p>The type of the environment to which the database belongs. Valid values:</p>
         * <ul>
         * <li>product: production environment</li>
         * <li>dev: development environment</li>
         * <li>pre: staging environment</li>
         * <li>test: test environment</li>
         * <li>sit: SIT environment</li>
         * <li>uat: UAT environment</li>
         * <li>pet: stress testing environment</li>
         * <li>stag: STAG environment</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>dev</p>
         */
        @NameInMap("EnvType")
        public String envType;

        /**
         * <p>The endpoint that is used to connect the database.</p>
         * 
         * <strong>example:</strong>
         * <p>rm-bp144d5ky4l4r****</p>
         */
        @NameInMap("Host")
        public String host;

        /**
         * <p>The ID of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>174****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>Indicates whether the database is a logical database. Valid values:</p>
         * <ul>
         * <li>true: The database is a logical database.</li>
         * <li>false: The database is a physical database.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Logic")
        public Boolean logic;

        /**
         * <p>The details of permissions.</p>
         */
        @NameInMap("PermDetails")
        public ListUserPermissionsResponseBodyUserPermissionsUserPermissionPermDetails permDetails;

        /**
         * <p>The port that is used to connect to the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>3306</p>
         */
        @NameInMap("Port")
        public Long port;

        /**
         * <p>The name of the database.</p>
         * 
         * <strong>example:</strong>
         * <p>test_db</p>
         */
        @NameInMap("SchemaName")
        public String schemaName;

        /**
         * <p>The name that is used to search for the database.</p>
         * 
         * <strong>example:</strong>
         * <p>test_db@xxx:3306</p>
         */
        @NameInMap("SearchName")
        public String searchName;

        /**
         * <p>The ID of the table.</p>
         * 
         * <strong>example:</strong>
         * <p>13434</p>
         */
        @NameInMap("TableId")
        public String tableId;

        /**
         * <p>The name of the table.</p>
         * 
         * <strong>example:</strong>
         * <p>test_table</p>
         */
        @NameInMap("TableName")
        public String tableName;

        /**
         * <p>The ID of the user.</p>
         * 
         * <strong>example:</strong>
         * <p>51****</p>
         */
        @NameInMap("UserId")
        public String userId;

        /**
         * <p>The nickname of the user.</p>
         * 
         * <strong>example:</strong>
         * <p>nick_name</p>
         */
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
