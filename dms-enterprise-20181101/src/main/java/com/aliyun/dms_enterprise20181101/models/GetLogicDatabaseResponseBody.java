// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetLogicDatabaseResponseBody extends TeaModel {
    /**
     * <p>The error code.</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The details about the logical database.</p>
     */
    @NameInMap("LogicDatabase")
    public GetLogicDatabaseResponseBodyLogicDatabase logicDatabase;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful. Valid values:</p>
     * <br>
     * <p>- true: The request is successful.</p>
     * <p>- false: The request fails.</p>
     */
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
        /**
         * <p>The alias of the logical database.</p>
         */
        @NameInMap("Alias")
        public String alias;

        /**
         * <p>The ID of the logical database.</p>
         */
        @NameInMap("DatabaseId")
        public String databaseId;

        @NameInMap("DatabaseIds")
        public GetLogicDatabaseResponseBodyLogicDatabaseDatabaseIds databaseIds;

        /**
         * <p>The type of the database. For more information about the valid values of the DbType parameter, see [DbType parameter](https://www.alibabacloud.com/help/en/data-management-service/latest/dbtype-parameter).</p>
         */
        @NameInMap("DbType")
        public String dbType;

        /**
         * <p>The type of the environment to which the database belongs. Valid values:</p>
         * <br>
         * <p>- product: production environment</p>
         * <p>- dev: development environment</p>
         * <p>- pre: staging environment</p>
         * <p>- test: test environment</p>
         * <p>- sit: SIT environment</p>
         * <p>- uat: user acceptance testing (UAT) environment</p>
         * <p>- pet: stress testing environment</p>
         * <p>- stag: STAG environment</p>
         */
        @NameInMap("EnvType")
        public String envType;

        /**
         * <p>Indicates whether the database is a logical database. The return value is true.</p>
         */
        @NameInMap("Logic")
        public Boolean logic;

        /**
         * <p>The IDs of the owners of the logical database.</p>
         */
        @NameInMap("OwnerIdList")
        public GetLogicDatabaseResponseBodyLogicDatabaseOwnerIdList ownerIdList;

        /**
         * <p>The names of the owners of the logical database.</p>
         */
        @NameInMap("OwnerNameList")
        public GetLogicDatabaseResponseBodyLogicDatabaseOwnerNameList ownerNameList;

        /**
         * <p>The name of the logical database.</p>
         */
        @NameInMap("SchemaName")
        public String schemaName;

        /**
         * <p>The name that is used to search for the logical database.</p>
         */
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
