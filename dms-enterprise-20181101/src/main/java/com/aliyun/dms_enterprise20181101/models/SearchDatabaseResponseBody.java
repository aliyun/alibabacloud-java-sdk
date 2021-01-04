// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class SearchDatabaseResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Long totalCount;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SearchDatabaseList")
    public SearchDatabaseResponseBodySearchDatabaseList searchDatabaseList;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Success")
    public Boolean success;

    public static SearchDatabaseResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SearchDatabaseResponseBody self = new SearchDatabaseResponseBody();
        return TeaModel.build(map, self);
    }

    public SearchDatabaseResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
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

    public SearchDatabaseResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
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
        @NameInMap("DatabaseId")
        public String databaseId;

        @NameInMap("Host")
        public String host;

        @NameInMap("DbaId")
        public String dbaId;

        @NameInMap("SchemaName")
        public String schemaName;

        @NameInMap("Logic")
        public Boolean logic;

        @NameInMap("DatalinkName")
        public String datalinkName;

        @NameInMap("Port")
        public Integer port;

        @NameInMap("EnvType")
        public String envType;

        @NameInMap("Sid")
        public String sid;

        @NameInMap("OwnerIdList")
        public SearchDatabaseResponseBodySearchDatabaseListSearchDatabaseOwnerIdList ownerIdList;

        @NameInMap("Encoding")
        public String encoding;

        @NameInMap("DbType")
        public String dbType;

        @NameInMap("OwnerNameList")
        public SearchDatabaseResponseBodySearchDatabaseListSearchDatabaseOwnerNameList ownerNameList;

        @NameInMap("SearchName")
        public String searchName;

        @NameInMap("Alias")
        public String alias;

        public static SearchDatabaseResponseBodySearchDatabaseListSearchDatabase build(java.util.Map<String, ?> map) throws Exception {
            SearchDatabaseResponseBodySearchDatabaseListSearchDatabase self = new SearchDatabaseResponseBodySearchDatabaseListSearchDatabase();
            return TeaModel.build(map, self);
        }

        public SearchDatabaseResponseBodySearchDatabaseListSearchDatabase setDatabaseId(String databaseId) {
            this.databaseId = databaseId;
            return this;
        }
        public String getDatabaseId() {
            return this.databaseId;
        }

        public SearchDatabaseResponseBodySearchDatabaseListSearchDatabase setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public SearchDatabaseResponseBodySearchDatabaseListSearchDatabase setDbaId(String dbaId) {
            this.dbaId = dbaId;
            return this;
        }
        public String getDbaId() {
            return this.dbaId;
        }

        public SearchDatabaseResponseBodySearchDatabaseListSearchDatabase setSchemaName(String schemaName) {
            this.schemaName = schemaName;
            return this;
        }
        public String getSchemaName() {
            return this.schemaName;
        }

        public SearchDatabaseResponseBodySearchDatabaseListSearchDatabase setLogic(Boolean logic) {
            this.logic = logic;
            return this;
        }
        public Boolean getLogic() {
            return this.logic;
        }

        public SearchDatabaseResponseBodySearchDatabaseListSearchDatabase setDatalinkName(String datalinkName) {
            this.datalinkName = datalinkName;
            return this;
        }
        public String getDatalinkName() {
            return this.datalinkName;
        }

        public SearchDatabaseResponseBodySearchDatabaseListSearchDatabase setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public SearchDatabaseResponseBodySearchDatabaseListSearchDatabase setEnvType(String envType) {
            this.envType = envType;
            return this;
        }
        public String getEnvType() {
            return this.envType;
        }

        public SearchDatabaseResponseBodySearchDatabaseListSearchDatabase setSid(String sid) {
            this.sid = sid;
            return this;
        }
        public String getSid() {
            return this.sid;
        }

        public SearchDatabaseResponseBodySearchDatabaseListSearchDatabase setOwnerIdList(SearchDatabaseResponseBodySearchDatabaseListSearchDatabaseOwnerIdList ownerIdList) {
            this.ownerIdList = ownerIdList;
            return this;
        }
        public SearchDatabaseResponseBodySearchDatabaseListSearchDatabaseOwnerIdList getOwnerIdList() {
            return this.ownerIdList;
        }

        public SearchDatabaseResponseBodySearchDatabaseListSearchDatabase setEncoding(String encoding) {
            this.encoding = encoding;
            return this;
        }
        public String getEncoding() {
            return this.encoding;
        }

        public SearchDatabaseResponseBodySearchDatabaseListSearchDatabase setDbType(String dbType) {
            this.dbType = dbType;
            return this;
        }
        public String getDbType() {
            return this.dbType;
        }

        public SearchDatabaseResponseBodySearchDatabaseListSearchDatabase setOwnerNameList(SearchDatabaseResponseBodySearchDatabaseListSearchDatabaseOwnerNameList ownerNameList) {
            this.ownerNameList = ownerNameList;
            return this;
        }
        public SearchDatabaseResponseBodySearchDatabaseListSearchDatabaseOwnerNameList getOwnerNameList() {
            return this.ownerNameList;
        }

        public SearchDatabaseResponseBodySearchDatabaseListSearchDatabase setSearchName(String searchName) {
            this.searchName = searchName;
            return this;
        }
        public String getSearchName() {
            return this.searchName;
        }

        public SearchDatabaseResponseBodySearchDatabaseListSearchDatabase setAlias(String alias) {
            this.alias = alias;
            return this;
        }
        public String getAlias() {
            return this.alias;
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
