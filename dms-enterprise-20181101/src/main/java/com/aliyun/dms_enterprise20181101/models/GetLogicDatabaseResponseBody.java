// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetLogicDatabaseResponseBody extends TeaModel {
    // The error code.
    @NameInMap("ErrorCode")
    public String errorCode;

    // The error message.
    @NameInMap("ErrorMessage")
    public String errorMessage;

    // The details about the logical database.
    @NameInMap("LogicDatabase")
    public GetLogicDatabaseResponseBodyLogicDatabase logicDatabase;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // Indicates whether the request is successful. Valid values:
    // 
    // - true: The request is successful.
    // - false: The request fails.
    @NameInMap("Success")
    public Boolean success;

    public static GetLogicDatabaseResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLogicDatabaseResponseBody self = new GetLogicDatabaseResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLogicDatabaseResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetLogicDatabaseResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetLogicDatabaseResponseBody setLogicDatabase(GetLogicDatabaseResponseBodyLogicDatabase logicDatabase) {
        this.logicDatabase = logicDatabase;
        return this;
    }
    public GetLogicDatabaseResponseBodyLogicDatabase getLogicDatabase() {
        return this.logicDatabase;
    }

    public GetLogicDatabaseResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLogicDatabaseResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetLogicDatabaseResponseBodyLogicDatabaseDatabaseIds extends TeaModel {
        @NameInMap("DatabaseIds")
        public java.util.List<Long> databaseIds;

        public static GetLogicDatabaseResponseBodyLogicDatabaseDatabaseIds build(java.util.Map<String, ?> map) throws Exception {
            GetLogicDatabaseResponseBodyLogicDatabaseDatabaseIds self = new GetLogicDatabaseResponseBodyLogicDatabaseDatabaseIds();
            return TeaModel.build(map, self);
        }

        public GetLogicDatabaseResponseBodyLogicDatabaseDatabaseIds setDatabaseIds(java.util.List<Long> databaseIds) {
            this.databaseIds = databaseIds;
            return this;
        }
        public java.util.List<Long> getDatabaseIds() {
            return this.databaseIds;
        }

    }

    public static class GetLogicDatabaseResponseBodyLogicDatabaseOwnerIdList extends TeaModel {
        @NameInMap("OwnerIds")
        public java.util.List<String> ownerIds;

        public static GetLogicDatabaseResponseBodyLogicDatabaseOwnerIdList build(java.util.Map<String, ?> map) throws Exception {
            GetLogicDatabaseResponseBodyLogicDatabaseOwnerIdList self = new GetLogicDatabaseResponseBodyLogicDatabaseOwnerIdList();
            return TeaModel.build(map, self);
        }

        public GetLogicDatabaseResponseBodyLogicDatabaseOwnerIdList setOwnerIds(java.util.List<String> ownerIds) {
            this.ownerIds = ownerIds;
            return this;
        }
        public java.util.List<String> getOwnerIds() {
            return this.ownerIds;
        }

    }

    public static class GetLogicDatabaseResponseBodyLogicDatabaseOwnerNameList extends TeaModel {
        @NameInMap("OwnerNames")
        public java.util.List<String> ownerNames;

        public static GetLogicDatabaseResponseBodyLogicDatabaseOwnerNameList build(java.util.Map<String, ?> map) throws Exception {
            GetLogicDatabaseResponseBodyLogicDatabaseOwnerNameList self = new GetLogicDatabaseResponseBodyLogicDatabaseOwnerNameList();
            return TeaModel.build(map, self);
        }

        public GetLogicDatabaseResponseBodyLogicDatabaseOwnerNameList setOwnerNames(java.util.List<String> ownerNames) {
            this.ownerNames = ownerNames;
            return this;
        }
        public java.util.List<String> getOwnerNames() {
            return this.ownerNames;
        }

    }

    public static class GetLogicDatabaseResponseBodyLogicDatabase extends TeaModel {
        // The alias of the logical database.
        @NameInMap("Alias")
        public String alias;

        // The ID of the logical database.
        @NameInMap("DatabaseId")
        public String databaseId;

        @NameInMap("DatabaseIds")
        public GetLogicDatabaseResponseBodyLogicDatabaseDatabaseIds databaseIds;

        // The type of the database. For more information about the valid values of the DbType parameter, see [DbType parameter](https://www.alibabacloud.com/help/en/data-management-service/latest/dbtype-parameter).
        @NameInMap("DbType")
        public String dbType;

        // The type of the environment to which the database belongs. Valid values:
        // 
        // - product: production environment
        // - dev: development environment
        // - pre: staging environment
        // - test: test environment
        // - sit: SIT environment
        // - uat: user acceptance testing (UAT) environment
        // - pet: stress testing environment
        // - stag: STAG environment
        @NameInMap("EnvType")
        public String envType;

        // Indicates whether the database is a logical database. The return value is true.
        @NameInMap("Logic")
        public Boolean logic;

        // The IDs of the owners of the logical database.
        @NameInMap("OwnerIdList")
        public GetLogicDatabaseResponseBodyLogicDatabaseOwnerIdList ownerIdList;

        // The names of the owners of the logical database.
        @NameInMap("OwnerNameList")
        public GetLogicDatabaseResponseBodyLogicDatabaseOwnerNameList ownerNameList;

        // The name of the logical database.
        @NameInMap("SchemaName")
        public String schemaName;

        // The name that is used to search for the logical database.
        @NameInMap("SearchName")
        public String searchName;

        public static GetLogicDatabaseResponseBodyLogicDatabase build(java.util.Map<String, ?> map) throws Exception {
            GetLogicDatabaseResponseBodyLogicDatabase self = new GetLogicDatabaseResponseBodyLogicDatabase();
            return TeaModel.build(map, self);
        }

        public GetLogicDatabaseResponseBodyLogicDatabase setAlias(String alias) {
            this.alias = alias;
            return this;
        }
        public String getAlias() {
            return this.alias;
        }

        public GetLogicDatabaseResponseBodyLogicDatabase setDatabaseId(String databaseId) {
            this.databaseId = databaseId;
            return this;
        }
        public String getDatabaseId() {
            return this.databaseId;
        }

        public GetLogicDatabaseResponseBodyLogicDatabase setDatabaseIds(GetLogicDatabaseResponseBodyLogicDatabaseDatabaseIds databaseIds) {
            this.databaseIds = databaseIds;
            return this;
        }
        public GetLogicDatabaseResponseBodyLogicDatabaseDatabaseIds getDatabaseIds() {
            return this.databaseIds;
        }

        public GetLogicDatabaseResponseBodyLogicDatabase setDbType(String dbType) {
            this.dbType = dbType;
            return this;
        }
        public String getDbType() {
            return this.dbType;
        }

        public GetLogicDatabaseResponseBodyLogicDatabase setEnvType(String envType) {
            this.envType = envType;
            return this;
        }
        public String getEnvType() {
            return this.envType;
        }

        public GetLogicDatabaseResponseBodyLogicDatabase setLogic(Boolean logic) {
            this.logic = logic;
            return this;
        }
        public Boolean getLogic() {
            return this.logic;
        }

        public GetLogicDatabaseResponseBodyLogicDatabase setOwnerIdList(GetLogicDatabaseResponseBodyLogicDatabaseOwnerIdList ownerIdList) {
            this.ownerIdList = ownerIdList;
            return this;
        }
        public GetLogicDatabaseResponseBodyLogicDatabaseOwnerIdList getOwnerIdList() {
            return this.ownerIdList;
        }

        public GetLogicDatabaseResponseBodyLogicDatabase setOwnerNameList(GetLogicDatabaseResponseBodyLogicDatabaseOwnerNameList ownerNameList) {
            this.ownerNameList = ownerNameList;
            return this;
        }
        public GetLogicDatabaseResponseBodyLogicDatabaseOwnerNameList getOwnerNameList() {
            return this.ownerNameList;
        }

        public GetLogicDatabaseResponseBodyLogicDatabase setSchemaName(String schemaName) {
            this.schemaName = schemaName;
            return this;
        }
        public String getSchemaName() {
            return this.schemaName;
        }

        public GetLogicDatabaseResponseBodyLogicDatabase setSearchName(String searchName) {
            this.searchName = searchName;
            return this;
        }
        public String getSearchName() {
            return this.searchName;
        }

    }

}
