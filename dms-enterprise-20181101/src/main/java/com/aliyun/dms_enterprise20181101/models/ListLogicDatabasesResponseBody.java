// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListLogicDatabasesResponseBody extends TeaModel {
    /**
     * <p>The error code that is returned.</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message that is returned.</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The details of logical databases.</p>
     */
    @NameInMap("LogicDatabaseList")
    public ListLogicDatabasesResponseBodyLogicDatabaseList logicDatabaseList;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful. Valid values:</p>
     * <br>
     * <p>- **true**: The request is successful.</p>
     * <p>- **false**: The request fails.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The total number of logical databases.</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListLogicDatabasesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListLogicDatabasesResponseBody self = new ListLogicDatabasesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListLogicDatabasesResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListLogicDatabasesResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListLogicDatabasesResponseBody setLogicDatabaseList(ListLogicDatabasesResponseBodyLogicDatabaseList logicDatabaseList) {
        this.logicDatabaseList = logicDatabaseList;
        return this;
    }
    public ListLogicDatabasesResponseBodyLogicDatabaseList getLogicDatabaseList() {
        return this.logicDatabaseList;
    }

    public ListLogicDatabasesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListLogicDatabasesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListLogicDatabasesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListLogicDatabasesResponseBodyLogicDatabaseListLogicDatabaseDatabaseIds extends TeaModel {
        @NameInMap("DatabaseIds")
        public java.util.List<Long> databaseIds;

        public static ListLogicDatabasesResponseBodyLogicDatabaseListLogicDatabaseDatabaseIds build(java.util.Map<String, ?> map) throws Exception {
            ListLogicDatabasesResponseBodyLogicDatabaseListLogicDatabaseDatabaseIds self = new ListLogicDatabasesResponseBodyLogicDatabaseListLogicDatabaseDatabaseIds();
            return TeaModel.build(map, self);
        }

        public ListLogicDatabasesResponseBodyLogicDatabaseListLogicDatabaseDatabaseIds setDatabaseIds(java.util.List<Long> databaseIds) {
            this.databaseIds = databaseIds;
            return this;
        }
        public java.util.List<Long> getDatabaseIds() {
            return this.databaseIds;
        }

    }

    public static class ListLogicDatabasesResponseBodyLogicDatabaseListLogicDatabaseOwnerIdList extends TeaModel {
        @NameInMap("OwnerIds")
        public java.util.List<String> ownerIds;

        public static ListLogicDatabasesResponseBodyLogicDatabaseListLogicDatabaseOwnerIdList build(java.util.Map<String, ?> map) throws Exception {
            ListLogicDatabasesResponseBodyLogicDatabaseListLogicDatabaseOwnerIdList self = new ListLogicDatabasesResponseBodyLogicDatabaseListLogicDatabaseOwnerIdList();
            return TeaModel.build(map, self);
        }

        public ListLogicDatabasesResponseBodyLogicDatabaseListLogicDatabaseOwnerIdList setOwnerIds(java.util.List<String> ownerIds) {
            this.ownerIds = ownerIds;
            return this;
        }
        public java.util.List<String> getOwnerIds() {
            return this.ownerIds;
        }

    }

    public static class ListLogicDatabasesResponseBodyLogicDatabaseListLogicDatabaseOwnerNameList extends TeaModel {
        @NameInMap("OwnerNames")
        public java.util.List<String> ownerNames;

        public static ListLogicDatabasesResponseBodyLogicDatabaseListLogicDatabaseOwnerNameList build(java.util.Map<String, ?> map) throws Exception {
            ListLogicDatabasesResponseBodyLogicDatabaseListLogicDatabaseOwnerNameList self = new ListLogicDatabasesResponseBodyLogicDatabaseListLogicDatabaseOwnerNameList();
            return TeaModel.build(map, self);
        }

        public ListLogicDatabasesResponseBodyLogicDatabaseListLogicDatabaseOwnerNameList setOwnerNames(java.util.List<String> ownerNames) {
            this.ownerNames = ownerNames;
            return this;
        }
        public java.util.List<String> getOwnerNames() {
            return this.ownerNames;
        }

    }

    public static class ListLogicDatabasesResponseBodyLogicDatabaseListLogicDatabase extends TeaModel {
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

        /**
         * <p>Logical database sub-ID list.</p>
         */
        @NameInMap("DatabaseIds")
        public ListLogicDatabasesResponseBodyLogicDatabaseListLogicDatabaseDatabaseIds databaseIds;

        /**
         * <p>The type of the logical database. For more information about the valid values of this parameter, see [DbType parameter](https://www.alibabacloud.com/help/en/data-management-service/latest/dbtype-parameter).</p>
         */
        @NameInMap("DbType")
        public String dbType;

        /**
         * <p>The type of the environment to which the logical database belongs. Valid values:</p>
         * <br>
         * <p>- **product**: production environment</p>
         * <p>- **dev**: development environment</p>
         * <p>- **pre**: staging environment</p>
         * <p>- **test**: test environment</p>
         * <p>- **sit**: system integration testing (SIT) environment</p>
         * <p>- **uat**: user acceptance testing (UAT) environment</p>
         * <p>- **pet**: stress testing environment</p>
         * <p>- **stag**: STAG environment</p>
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
        public ListLogicDatabasesResponseBodyLogicDatabaseListLogicDatabaseOwnerIdList ownerIdList;

        /**
         * <p>The names of the owners of the logical database.</p>
         */
        @NameInMap("OwnerNameList")
        public ListLogicDatabasesResponseBodyLogicDatabaseListLogicDatabaseOwnerNameList ownerNameList;

        /**
         * <p>The name of the logical database.</p>
         */
        @NameInMap("SchemaName")
        public String schemaName;

        /**
         * <p>The name that is used to search for the logical database.</p>
         * <br>
         * <p>> We recommend that you do not use this parameter for business development. The format of the parameter value may be modified in later versions.</p>
         */
        @NameInMap("SearchName")
        public String searchName;

        public static ListLogicDatabasesResponseBodyLogicDatabaseListLogicDatabase build(java.util.Map<String, ?> map) throws Exception {
            ListLogicDatabasesResponseBodyLogicDatabaseListLogicDatabase self = new ListLogicDatabasesResponseBodyLogicDatabaseListLogicDatabase();
            return TeaModel.build(map, self);
        }

        public ListLogicDatabasesResponseBodyLogicDatabaseListLogicDatabase setAlias(String alias) {
            this.alias = alias;
            return this;
        }
        public String getAlias() {
            return this.alias;
        }

        public ListLogicDatabasesResponseBodyLogicDatabaseListLogicDatabase setDatabaseId(String databaseId) {
            this.databaseId = databaseId;
            return this;
        }
        public String getDatabaseId() {
            return this.databaseId;
        }

        public ListLogicDatabasesResponseBodyLogicDatabaseListLogicDatabase setDatabaseIds(ListLogicDatabasesResponseBodyLogicDatabaseListLogicDatabaseDatabaseIds databaseIds) {
            this.databaseIds = databaseIds;
            return this;
        }
        public ListLogicDatabasesResponseBodyLogicDatabaseListLogicDatabaseDatabaseIds getDatabaseIds() {
            return this.databaseIds;
        }

        public ListLogicDatabasesResponseBodyLogicDatabaseListLogicDatabase setDbType(String dbType) {
            this.dbType = dbType;
            return this;
        }
        public String getDbType() {
            return this.dbType;
        }

        public ListLogicDatabasesResponseBodyLogicDatabaseListLogicDatabase setEnvType(String envType) {
            this.envType = envType;
            return this;
        }
        public String getEnvType() {
            return this.envType;
        }

        public ListLogicDatabasesResponseBodyLogicDatabaseListLogicDatabase setLogic(Boolean logic) {
            this.logic = logic;
            return this;
        }
        public Boolean getLogic() {
            return this.logic;
        }

        public ListLogicDatabasesResponseBodyLogicDatabaseListLogicDatabase setOwnerIdList(ListLogicDatabasesResponseBodyLogicDatabaseListLogicDatabaseOwnerIdList ownerIdList) {
            this.ownerIdList = ownerIdList;
            return this;
        }
        public ListLogicDatabasesResponseBodyLogicDatabaseListLogicDatabaseOwnerIdList getOwnerIdList() {
            return this.ownerIdList;
        }

        public ListLogicDatabasesResponseBodyLogicDatabaseListLogicDatabase setOwnerNameList(ListLogicDatabasesResponseBodyLogicDatabaseListLogicDatabaseOwnerNameList ownerNameList) {
            this.ownerNameList = ownerNameList;
            return this;
        }
        public ListLogicDatabasesResponseBodyLogicDatabaseListLogicDatabaseOwnerNameList getOwnerNameList() {
            return this.ownerNameList;
        }

        public ListLogicDatabasesResponseBodyLogicDatabaseListLogicDatabase setSchemaName(String schemaName) {
            this.schemaName = schemaName;
            return this;
        }
        public String getSchemaName() {
            return this.schemaName;
        }

        public ListLogicDatabasesResponseBodyLogicDatabaseListLogicDatabase setSearchName(String searchName) {
            this.searchName = searchName;
            return this;
        }
        public String getSearchName() {
            return this.searchName;
        }

    }

    public static class ListLogicDatabasesResponseBodyLogicDatabaseList extends TeaModel {
        @NameInMap("LogicDatabase")
        public java.util.List<ListLogicDatabasesResponseBodyLogicDatabaseListLogicDatabase> logicDatabase;

        public static ListLogicDatabasesResponseBodyLogicDatabaseList build(java.util.Map<String, ?> map) throws Exception {
            ListLogicDatabasesResponseBodyLogicDatabaseList self = new ListLogicDatabasesResponseBodyLogicDatabaseList();
            return TeaModel.build(map, self);
        }

        public ListLogicDatabasesResponseBodyLogicDatabaseList setLogicDatabase(java.util.List<ListLogicDatabasesResponseBodyLogicDatabaseListLogicDatabase> logicDatabase) {
            this.logicDatabase = logicDatabase;
            return this;
        }
        public java.util.List<ListLogicDatabasesResponseBodyLogicDatabaseListLogicDatabase> getLogicDatabase() {
            return this.logicDatabase;
        }

    }

}
