// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class SearchDatabaseResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SearchDatabaseList")
    public SearchDatabaseResponseBodySearchDatabaseList searchDatabaseList;

    @NameInMap("Success")
    public Boolean success;

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
        @NameInMap("Alias")
        public String alias;

        @NameInMap("DatabaseId")
        public String databaseId;

        @NameInMap("DatalinkName")
        public String datalinkName;

        @NameInMap("DbType")
        public String dbType;

        @NameInMap("DbaId")
        public String dbaId;

        @NameInMap("Encoding")
        public String encoding;

        @NameInMap("EnvType")
        public String envType;

        @NameInMap("Host")
        public String host;

        @NameInMap("Logic")
        public Boolean logic;

        @NameInMap("OwnerIdList")
        public SearchDatabaseResponseBodySearchDatabaseListSearchDatabaseOwnerIdList ownerIdList;

        @NameInMap("OwnerNameList")
        public SearchDatabaseResponseBodySearchDatabaseListSearchDatabaseOwnerNameList ownerNameList;

        @NameInMap("Port")
        public Integer port;

        @NameInMap("SchemaName")
        public String schemaName;

        @NameInMap("SearchName")
        public String searchName;

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
