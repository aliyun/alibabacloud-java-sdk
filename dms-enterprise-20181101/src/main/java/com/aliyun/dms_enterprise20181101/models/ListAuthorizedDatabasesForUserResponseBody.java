// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListAuthorizedDatabasesForUserResponseBody extends TeaModel {
    @NameInMap("Databases")
    public java.util.List<ListAuthorizedDatabasesForUserResponseBodyDatabases> databases;

    /**
     * <strong>example:</strong>
     * <p>012AE0B5-4B52-532F-BD7C-1EE9F182089B</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListAuthorizedDatabasesForUserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAuthorizedDatabasesForUserResponseBody self = new ListAuthorizedDatabasesForUserResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAuthorizedDatabasesForUserResponseBody setDatabases(java.util.List<ListAuthorizedDatabasesForUserResponseBodyDatabases> databases) {
        this.databases = databases;
        return this;
    }
    public java.util.List<ListAuthorizedDatabasesForUserResponseBodyDatabases> getDatabases() {
        return this.databases;
    }

    public ListAuthorizedDatabasesForUserResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListAuthorizedDatabasesForUserResponseBodyDatabasesPermissionDetail extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>DATABASE</p>
         */
        @NameInMap("DsType")
        public String dsType;

        /**
         * <strong>example:</strong>
         * <p>2024-12-06 10:00:00</p>
         */
        @NameInMap("ExpireDate")
        public String expireDate;

        @NameInMap("Message")
        public String message;

        /**
         * <strong>example:</strong>
         * <p>CORRECT</p>
         */
        @NameInMap("PermType")
        public String permType;

        public static ListAuthorizedDatabasesForUserResponseBodyDatabasesPermissionDetail build(java.util.Map<String, ?> map) throws Exception {
            ListAuthorizedDatabasesForUserResponseBodyDatabasesPermissionDetail self = new ListAuthorizedDatabasesForUserResponseBodyDatabasesPermissionDetail();
            return TeaModel.build(map, self);
        }

        public ListAuthorizedDatabasesForUserResponseBodyDatabasesPermissionDetail setDsType(String dsType) {
            this.dsType = dsType;
            return this;
        }
        public String getDsType() {
            return this.dsType;
        }

        public ListAuthorizedDatabasesForUserResponseBodyDatabasesPermissionDetail setExpireDate(String expireDate) {
            this.expireDate = expireDate;
            return this;
        }
        public String getExpireDate() {
            return this.expireDate;
        }

        public ListAuthorizedDatabasesForUserResponseBodyDatabasesPermissionDetail setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ListAuthorizedDatabasesForUserResponseBodyDatabasesPermissionDetail setPermType(String permType) {
            this.permType = permType;
            return this;
        }
        public String getPermType() {
            return this.permType;
        }

    }

    public static class ListAuthorizedDatabasesForUserResponseBodyDatabases extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>254****</p>
         */
        @NameInMap("DbId")
        public String dbId;

        /**
         * <strong>example:</strong>
         * <p>MYSQL</p>
         */
        @NameInMap("DbType")
        public String dbType;

        /**
         * <strong>example:</strong>
         * <p>product</p>
         */
        @NameInMap("EnvType")
        public String envType;

        /**
         * <strong>example:</strong>
         * <p>235****</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("Logic")
        public Boolean logic;

        @NameInMap("PermissionDetail")
        public ListAuthorizedDatabasesForUserResponseBodyDatabasesPermissionDetail permissionDetail;

        /**
         * <strong>example:</strong>
         * <p>poc_testdb</p>
         */
        @NameInMap("SchemaName")
        public String schemaName;

        /**
         * <strong>example:</strong>
         * <p>poc</p>
         */
        @NameInMap("SearchName")
        public String searchName;

        /**
         * <strong>example:</strong>
         * <p>51****</p>
         */
        @NameInMap("UserId")
        public String userId;

        public static ListAuthorizedDatabasesForUserResponseBodyDatabases build(java.util.Map<String, ?> map) throws Exception {
            ListAuthorizedDatabasesForUserResponseBodyDatabases self = new ListAuthorizedDatabasesForUserResponseBodyDatabases();
            return TeaModel.build(map, self);
        }

        public ListAuthorizedDatabasesForUserResponseBodyDatabases setDbId(String dbId) {
            this.dbId = dbId;
            return this;
        }
        public String getDbId() {
            return this.dbId;
        }

        public ListAuthorizedDatabasesForUserResponseBodyDatabases setDbType(String dbType) {
            this.dbType = dbType;
            return this;
        }
        public String getDbType() {
            return this.dbType;
        }

        public ListAuthorizedDatabasesForUserResponseBodyDatabases setEnvType(String envType) {
            this.envType = envType;
            return this;
        }
        public String getEnvType() {
            return this.envType;
        }

        public ListAuthorizedDatabasesForUserResponseBodyDatabases setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListAuthorizedDatabasesForUserResponseBodyDatabases setLogic(Boolean logic) {
            this.logic = logic;
            return this;
        }
        public Boolean getLogic() {
            return this.logic;
        }

        public ListAuthorizedDatabasesForUserResponseBodyDatabases setPermissionDetail(ListAuthorizedDatabasesForUserResponseBodyDatabasesPermissionDetail permissionDetail) {
            this.permissionDetail = permissionDetail;
            return this;
        }
        public ListAuthorizedDatabasesForUserResponseBodyDatabasesPermissionDetail getPermissionDetail() {
            return this.permissionDetail;
        }

        public ListAuthorizedDatabasesForUserResponseBodyDatabases setSchemaName(String schemaName) {
            this.schemaName = schemaName;
            return this;
        }
        public String getSchemaName() {
            return this.schemaName;
        }

        public ListAuthorizedDatabasesForUserResponseBodyDatabases setSearchName(String searchName) {
            this.searchName = searchName;
            return this;
        }
        public String getSearchName() {
            return this.searchName;
        }

        public ListAuthorizedDatabasesForUserResponseBodyDatabases setUserId(String userId) {
            this.userId = userId;
            return this;
        }
        public String getUserId() {
            return this.userId;
        }

    }

}
