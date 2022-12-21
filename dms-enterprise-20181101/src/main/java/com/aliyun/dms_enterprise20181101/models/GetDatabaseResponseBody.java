// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetDatabaseResponseBody extends TeaModel {
    // The details of the database.
    @NameInMap("Database")
    public GetDatabaseResponseBodyDatabase database;

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
    // *   **true**: The request is successful.
    // *   **false**: The request fails.
    @NameInMap("Success")
    public Boolean success;

    public static GetDatabaseResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDatabaseResponseBody self = new GetDatabaseResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDatabaseResponseBody setDatabase(GetDatabaseResponseBodyDatabase database) {
        this.database = database;
        return this;
    }
    public GetDatabaseResponseBodyDatabase getDatabase() {
        return this.database;
    }

    public GetDatabaseResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetDatabaseResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetDatabaseResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDatabaseResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetDatabaseResponseBodyDatabaseOwnerIdList extends TeaModel {
        @NameInMap("OwnerIds")
        public java.util.List<String> ownerIds;

        public static GetDatabaseResponseBodyDatabaseOwnerIdList build(java.util.Map<String, ?> map) throws Exception {
            GetDatabaseResponseBodyDatabaseOwnerIdList self = new GetDatabaseResponseBodyDatabaseOwnerIdList();
            return TeaModel.build(map, self);
        }

        public GetDatabaseResponseBodyDatabaseOwnerIdList setOwnerIds(java.util.List<String> ownerIds) {
            this.ownerIds = ownerIds;
            return this;
        }
        public java.util.List<String> getOwnerIds() {
            return this.ownerIds;
        }

    }

    public static class GetDatabaseResponseBodyDatabaseOwnerNameList extends TeaModel {
        @NameInMap("OwnerNames")
        public java.util.List<String> ownerNames;

        public static GetDatabaseResponseBodyDatabaseOwnerNameList build(java.util.Map<String, ?> map) throws Exception {
            GetDatabaseResponseBodyDatabaseOwnerNameList self = new GetDatabaseResponseBodyDatabaseOwnerNameList();
            return TeaModel.build(map, self);
        }

        public GetDatabaseResponseBodyDatabaseOwnerNameList setOwnerNames(java.util.List<String> ownerNames) {
            this.ownerNames = ownerNames;
            return this;
        }
        public java.util.List<String> getOwnerNames() {
            return this.ownerNames;
        }

    }

    public static class GetDatabaseResponseBodyDatabase extends TeaModel {
        // The name of the catalog to which the database belongs.
        @NameInMap("CatalogName")
        public String catalogName;

        // The ID of the database.
        @NameInMap("DatabaseId")
        public String databaseId;

        // The type of the database. For more information about the valid values of this parameter, see [DbType parameter](~~198106~~).
        @NameInMap("DbType")
        public String dbType;

        // The ID of the database administrator (DBA).
        @NameInMap("DbaId")
        public String dbaId;

        // The nickname of the DBA.
        @NameInMap("DbaName")
        public String dbaName;

        // The encoding format of the database.
        @NameInMap("Encoding")
        public String encoding;

        // The type of the environment to which the database belongs. Valid values:
        // 
        // *   **product**: production environment
        // *   **dev**: development environment
        // *   **pre**: staging environment
        // *   **test**: test environment
        // *   **sit**: SIT environment
        // *   **uat**: user acceptance testing (UAT) environment
        // *   **pet**: stress testing environment
        // *   **stag**: STAG environment
        @NameInMap("EnvType")
        public String envType;

        // The endpoint that is used to connect to the database.
        @NameInMap("Host")
        public String host;

        // The ID of the instance.
        @NameInMap("InstanceId")
        public String instanceId;

        // The IDs of the owners of the database.
        @NameInMap("OwnerIdList")
        public GetDatabaseResponseBodyDatabaseOwnerIdList ownerIdList;

        // The names of the owners of the database.
        @NameInMap("OwnerNameList")
        public GetDatabaseResponseBodyDatabaseOwnerNameList ownerNameList;

        // The port that is used to connect to the database.
        @NameInMap("Port")
        public Integer port;

        // The name of the database.
        @NameInMap("SchemaName")
        public String schemaName;

        // The keyword that is used to search for the database.
        @NameInMap("SearchName")
        public String searchName;

        // The SID of the database.
        // 
        // >  The value of the parameter is returned only for Oracle databases.
        @NameInMap("Sid")
        public String sid;

        // The status of the database. Valid values:
        // 
        // *   **NORMAL**: The database is running as expected.
        // *   **DISABLE**: The database is disabled.
        // *   **OFFLINE**: The database is unpublished.
        // *   **NOT_EXIST**: The database does not exist.
        @NameInMap("State")
        public String state;

        public static GetDatabaseResponseBodyDatabase build(java.util.Map<String, ?> map) throws Exception {
            GetDatabaseResponseBodyDatabase self = new GetDatabaseResponseBodyDatabase();
            return TeaModel.build(map, self);
        }

        public GetDatabaseResponseBodyDatabase setCatalogName(String catalogName) {
            this.catalogName = catalogName;
            return this;
        }
        public String getCatalogName() {
            return this.catalogName;
        }

        public GetDatabaseResponseBodyDatabase setDatabaseId(String databaseId) {
            this.databaseId = databaseId;
            return this;
        }
        public String getDatabaseId() {
            return this.databaseId;
        }

        public GetDatabaseResponseBodyDatabase setDbType(String dbType) {
            this.dbType = dbType;
            return this;
        }
        public String getDbType() {
            return this.dbType;
        }

        public GetDatabaseResponseBodyDatabase setDbaId(String dbaId) {
            this.dbaId = dbaId;
            return this;
        }
        public String getDbaId() {
            return this.dbaId;
        }

        public GetDatabaseResponseBodyDatabase setDbaName(String dbaName) {
            this.dbaName = dbaName;
            return this;
        }
        public String getDbaName() {
            return this.dbaName;
        }

        public GetDatabaseResponseBodyDatabase setEncoding(String encoding) {
            this.encoding = encoding;
            return this;
        }
        public String getEncoding() {
            return this.encoding;
        }

        public GetDatabaseResponseBodyDatabase setEnvType(String envType) {
            this.envType = envType;
            return this;
        }
        public String getEnvType() {
            return this.envType;
        }

        public GetDatabaseResponseBodyDatabase setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public GetDatabaseResponseBodyDatabase setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetDatabaseResponseBodyDatabase setOwnerIdList(GetDatabaseResponseBodyDatabaseOwnerIdList ownerIdList) {
            this.ownerIdList = ownerIdList;
            return this;
        }
        public GetDatabaseResponseBodyDatabaseOwnerIdList getOwnerIdList() {
            return this.ownerIdList;
        }

        public GetDatabaseResponseBodyDatabase setOwnerNameList(GetDatabaseResponseBodyDatabaseOwnerNameList ownerNameList) {
            this.ownerNameList = ownerNameList;
            return this;
        }
        public GetDatabaseResponseBodyDatabaseOwnerNameList getOwnerNameList() {
            return this.ownerNameList;
        }

        public GetDatabaseResponseBodyDatabase setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public GetDatabaseResponseBodyDatabase setSchemaName(String schemaName) {
            this.schemaName = schemaName;
            return this;
        }
        public String getSchemaName() {
            return this.schemaName;
        }

        public GetDatabaseResponseBodyDatabase setSearchName(String searchName) {
            this.searchName = searchName;
            return this;
        }
        public String getSearchName() {
            return this.searchName;
        }

        public GetDatabaseResponseBodyDatabase setSid(String sid) {
            this.sid = sid;
            return this;
        }
        public String getSid() {
            return this.sid;
        }

        public GetDatabaseResponseBodyDatabase setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

    }

}
