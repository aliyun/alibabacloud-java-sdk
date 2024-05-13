// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class SearchDatabaseResponseBody extends TeaModel {
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
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The information about the databases.</p>
     */
    @NameInMap("SearchDatabaseList")
    public SearchDatabaseResponseBodySearchDatabaseList searchDatabaseList;

    /**
     * <p>Indicates whether the request is successful. Valid values:</p>
     * <br>
     * <p>*   **true**: The request is successful.</p>
     * <p>*   **false**: The request fails.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <p>The total number of entries returned.</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static SearchDatabaseResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SearchDatabaseResponseBody self = new SearchDatabaseResponseBody();
        return TeaModel.build(map, self);
    }

    public SearchDatabaseResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public SearchDatabaseResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public SearchDatabaseResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SearchDatabaseResponseBody setSearchDatabaseList(SearchDatabaseResponseBodySearchDatabaseList searchDatabaseList) {
        this.searchDatabaseList = searchDatabaseList;
        return this;
    }
    public SearchDatabaseResponseBodySearchDatabaseList getSearchDatabaseList() {
        return this.searchDatabaseList;
    }

    public SearchDatabaseResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public SearchDatabaseResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class SearchDatabaseResponseBodySearchDatabaseListSearchDatabaseOwnerIdList extends TeaModel {
        @NameInMap("OwnerIds")
        public java.util.List<String> ownerIds;

        public static SearchDatabaseResponseBodySearchDatabaseListSearchDatabaseOwnerIdList build(java.util.Map<String, ?> map) throws Exception {
            SearchDatabaseResponseBodySearchDatabaseListSearchDatabaseOwnerIdList self = new SearchDatabaseResponseBodySearchDatabaseListSearchDatabaseOwnerIdList();
            return TeaModel.build(map, self);
        }

        public SearchDatabaseResponseBodySearchDatabaseListSearchDatabaseOwnerIdList setOwnerIds(java.util.List<String> ownerIds) {
            this.ownerIds = ownerIds;
            return this;
        }
        public java.util.List<String> getOwnerIds() {
            return this.ownerIds;
        }

    }

    public static class SearchDatabaseResponseBodySearchDatabaseListSearchDatabaseOwnerNameList extends TeaModel {
        @NameInMap("OwnerNames")
        public java.util.List<String> ownerNames;

        public static SearchDatabaseResponseBodySearchDatabaseListSearchDatabaseOwnerNameList build(java.util.Map<String, ?> map) throws Exception {
            SearchDatabaseResponseBodySearchDatabaseListSearchDatabaseOwnerNameList self = new SearchDatabaseResponseBodySearchDatabaseListSearchDatabaseOwnerNameList();
            return TeaModel.build(map, self);
        }

        public SearchDatabaseResponseBodySearchDatabaseListSearchDatabaseOwnerNameList setOwnerNames(java.util.List<String> ownerNames) {
            this.ownerNames = ownerNames;
            return this;
        }
        public java.util.List<String> getOwnerNames() {
            return this.ownerNames;
        }

    }

    public static class SearchDatabaseResponseBodySearchDatabaseListSearchDatabase extends TeaModel {
        /**
         * <p>The alias of the database.</p>
         */
        @NameInMap("Alias")
        public String alias;

        /**
         * <p>The name of the catalog to which the database belongs.</p>
         * <br>
         * <p>> If the type of the database engine is PostgreSQL, the name of the database is displayed.</p>
         */
        @NameInMap("CatalogName")
        public String catalogName;

        /**
         * <p>The ID of the database.</p>
         */
        @NameInMap("DatabaseId")
        public String databaseId;

        /**
         * <p>The name of the data link for cross-database queries.</p>
         */
        @NameInMap("DatalinkName")
        public String datalinkName;

        /**
         * <p>The type of the database engine.</p>
         */
        @NameInMap("DbType")
        public String dbType;

        /**
         * <p>The ID of the user who assumes the database administrator (DBA) role.</p>
         */
        @NameInMap("DbaId")
        public String dbaId;

        /**
         * <p>The encoding method of the database.</p>
         */
        @NameInMap("Encoding")
        public String encoding;

        /**
         * <p>The environment type of the database. For more information, see [Change the environment type of an instance](https://help.aliyun.com/document_detail/163309.html).</p>
         */
        @NameInMap("EnvType")
        public String envType;

        /**
         * <p>The endpoint of the instance in which the database resides.</p>
         */
        @NameInMap("Host")
        public String host;

        /**
         * <p>Indicates whether the database is a logical database. Valid values:</p>
         * <br>
         * <p>*   **true**: The database is a logical database.</p>
         * <p>*   **false**: The database is not a logical database.</p>
         */
        @NameInMap("Logic")
        public Boolean logic;

        /**
         * <p>The IDs of the owners of the databases.</p>
         */
        @NameInMap("OwnerIdList")
        public SearchDatabaseResponseBodySearchDatabaseListSearchDatabaseOwnerIdList ownerIdList;

        /**
         * <p>The nicknames of the database owners.</p>
         */
        @NameInMap("OwnerNameList")
        public SearchDatabaseResponseBodySearchDatabaseListSearchDatabaseOwnerNameList ownerNameList;

        /**
         * <p>The port of the instance in which the database resides.</p>
         */
        @NameInMap("Port")
        public Integer port;

        /**
         * <p>The name of the database.</p>
         */
        @NameInMap("SchemaName")
        public String schemaName;

        /**
         * <p>The name that is used to search for the database.</p>
         */
        @NameInMap("SearchName")
        public String searchName;

        /**
         * <p>The system ID (SID) of the instance in which the database resides.</p>
         */
        @NameInMap("Sid")
        public String sid;

        public static SearchDatabaseResponseBodySearchDatabaseListSearchDatabase build(java.util.Map<String, ?> map) throws Exception {
            SearchDatabaseResponseBodySearchDatabaseListSearchDatabase self = new SearchDatabaseResponseBodySearchDatabaseListSearchDatabase();
            return TeaModel.build(map, self);
        }

        public SearchDatabaseResponseBodySearchDatabaseListSearchDatabase setAlias(String alias) {
            this.alias = alias;
            return this;
        }
        public String getAlias() {
            return this.alias;
        }

        public SearchDatabaseResponseBodySearchDatabaseListSearchDatabase setCatalogName(String catalogName) {
            this.catalogName = catalogName;
            return this;
        }
        public String getCatalogName() {
            return this.catalogName;
        }

        public SearchDatabaseResponseBodySearchDatabaseListSearchDatabase setDatabaseId(String databaseId) {
            this.databaseId = databaseId;
            return this;
        }
        public String getDatabaseId() {
            return this.databaseId;
        }

        public SearchDatabaseResponseBodySearchDatabaseListSearchDatabase setDatalinkName(String datalinkName) {
            this.datalinkName = datalinkName;
            return this;
        }
        public String getDatalinkName() {
            return this.datalinkName;
        }

        public SearchDatabaseResponseBodySearchDatabaseListSearchDatabase setDbType(String dbType) {
            this.dbType = dbType;
            return this;
        }
        public String getDbType() {
            return this.dbType;
        }

        public SearchDatabaseResponseBodySearchDatabaseListSearchDatabase setDbaId(String dbaId) {
            this.dbaId = dbaId;
            return this;
        }
        public String getDbaId() {
            return this.dbaId;
        }

        public SearchDatabaseResponseBodySearchDatabaseListSearchDatabase setEncoding(String encoding) {
            this.encoding = encoding;
            return this;
        }
        public String getEncoding() {
            return this.encoding;
        }

        public SearchDatabaseResponseBodySearchDatabaseListSearchDatabase setEnvType(String envType) {
            this.envType = envType;
            return this;
        }
        public String getEnvType() {
            return this.envType;
        }

        public SearchDatabaseResponseBodySearchDatabaseListSearchDatabase setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public SearchDatabaseResponseBodySearchDatabaseListSearchDatabase setLogic(Boolean logic) {
            this.logic = logic;
            return this;
        }
        public Boolean getLogic() {
            return this.logic;
        }

        public SearchDatabaseResponseBodySearchDatabaseListSearchDatabase setOwnerIdList(SearchDatabaseResponseBodySearchDatabaseListSearchDatabaseOwnerIdList ownerIdList) {
            this.ownerIdList = ownerIdList;
            return this;
        }
        public SearchDatabaseResponseBodySearchDatabaseListSearchDatabaseOwnerIdList getOwnerIdList() {
            return this.ownerIdList;
        }

        public SearchDatabaseResponseBodySearchDatabaseListSearchDatabase setOwnerNameList(SearchDatabaseResponseBodySearchDatabaseListSearchDatabaseOwnerNameList ownerNameList) {
            this.ownerNameList = ownerNameList;
            return this;
        }
        public SearchDatabaseResponseBodySearchDatabaseListSearchDatabaseOwnerNameList getOwnerNameList() {
            return this.ownerNameList;
        }

        public SearchDatabaseResponseBodySearchDatabaseListSearchDatabase setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public SearchDatabaseResponseBodySearchDatabaseListSearchDatabase setSchemaName(String schemaName) {
            this.schemaName = schemaName;
            return this;
        }
        public String getSchemaName() {
            return this.schemaName;
        }

        public SearchDatabaseResponseBodySearchDatabaseListSearchDatabase setSearchName(String searchName) {
            this.searchName = searchName;
            return this;
        }
        public String getSearchName() {
            return this.searchName;
        }

        public SearchDatabaseResponseBodySearchDatabaseListSearchDatabase setSid(String sid) {
            this.sid = sid;
            return this;
        }
        public String getSid() {
            return this.sid;
        }

    }

    public static class SearchDatabaseResponseBodySearchDatabaseList extends TeaModel {
        @NameInMap("SearchDatabase")
        public java.util.List<SearchDatabaseResponseBodySearchDatabaseListSearchDatabase> searchDatabase;

        public static SearchDatabaseResponseBodySearchDatabaseList build(java.util.Map<String, ?> map) throws Exception {
            SearchDatabaseResponseBodySearchDatabaseList self = new SearchDatabaseResponseBodySearchDatabaseList();
            return TeaModel.build(map, self);
        }

        public SearchDatabaseResponseBodySearchDatabaseList setSearchDatabase(java.util.List<SearchDatabaseResponseBodySearchDatabaseListSearchDatabase> searchDatabase) {
            this.searchDatabase = searchDatabase;
            return this;
        }
        public java.util.List<SearchDatabaseResponseBodySearchDatabaseListSearchDatabase> getSearchDatabase() {
            return this.searchDatabase;
        }

    }

}
