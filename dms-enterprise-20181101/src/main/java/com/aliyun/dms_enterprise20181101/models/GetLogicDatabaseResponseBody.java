// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetLogicDatabaseResponseBody extends TeaModel {
    /**
     * <p>The status code.</p>
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
     * <p>The details of the logical database.</p>
     */
    @NameInMap("LogicDatabase")
    public GetLogicDatabaseResponseBodyLogicDatabase logicDatabase;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>90260530-565C-42B9-A6E8-893481FE6AB6</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values:</p>
     * <ul>
     * <li>true: The request was successful.</li>
     * <li>false: The request failed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
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
         * 
         * <strong>example:</strong>
         * <p>test_logic_alias</p>
         */
        @NameInMap("Alias")
        public String alias;

        /**
         * <p>The ID of the logical database.</p>
         * 
         * <strong>example:</strong>
         * <p>1***</p>
         */
        @NameInMap("DatabaseId")
        public String databaseId;

        /**
         * <p>The IDs of database shards of the logical database.</p>
         */
        @NameInMap("DatabaseIds")
        public GetLogicDatabaseResponseBodyLogicDatabaseDatabaseIds databaseIds;

        /**
         * <p>The database engine. For more information about the valid values of the DbType parameter, see <a href="https://help.aliyun.com/document_detail/198106.html">DbType parameter</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>POLARDB</p>
         */
        @NameInMap("DbType")
        public String dbType;

        /**
         * <p>The type of the environment to which the database belongs. Valid values:</p>
         * <ul>
         * <li>product: production environment</li>
         * <li>dev: development environment</li>
         * <li>pre: pre-release environment</li>
         * <li>test: test environment</li>
         * <li>sit: system integration testing (SIT) environment</li>
         * <li>uat: user acceptance testing (UAT) environment</li>
         * <li>pet: stress testing environment</li>
         * <li>stag: staging environment</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>dev</p>
         */
        @NameInMap("EnvType")
        public String envType;

        /**
         * <p>Indicates whether the database is a logical database. The return value is true.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
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
         * 
         * <strong>example:</strong>
         * <p>test_logic_db</p>
         */
        @NameInMap("SchemaName")
        public String schemaName;

        /**
         * <p>The name that is used to search for the logical database.</p>
         * 
         * <strong>example:</strong>
         * <p>test_logic_db[test_logic_alias]</p>
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
