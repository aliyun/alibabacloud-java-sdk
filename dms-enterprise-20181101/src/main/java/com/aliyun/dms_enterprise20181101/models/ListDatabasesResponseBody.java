// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListDatabasesResponseBody extends TeaModel {
    @NameInMap("DatabaseList")
    public ListDatabasesResponseBodyDatabaseList databaseList;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListDatabasesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListDatabasesResponseBody self = new ListDatabasesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListDatabasesResponseBody setDatabaseList(ListDatabasesResponseBodyDatabaseList databaseList) {
        this.databaseList = databaseList;
        return this;
    }
    public ListDatabasesResponseBodyDatabaseList getDatabaseList() {
        return this.databaseList;
    }

    public ListDatabasesResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListDatabasesResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListDatabasesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDatabasesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListDatabasesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListDatabasesResponseBodyDatabaseListDatabaseOwnerIdList extends TeaModel {
        @NameInMap("OwnerIds")
        public java.util.List<String> ownerIds;

        public static ListDatabasesResponseBodyDatabaseListDatabaseOwnerIdList build(java.util.Map<String, ?> map) throws Exception {
            ListDatabasesResponseBodyDatabaseListDatabaseOwnerIdList self = new ListDatabasesResponseBodyDatabaseListDatabaseOwnerIdList();
            return TeaModel.build(map, self);
        }

        public ListDatabasesResponseBodyDatabaseListDatabaseOwnerIdList setOwnerIds(java.util.List<String> ownerIds) {
            this.ownerIds = ownerIds;
            return this;
        }
        public java.util.List<String> getOwnerIds() {
            return this.ownerIds;
        }

    }

    public static class ListDatabasesResponseBodyDatabaseListDatabaseOwnerNameList extends TeaModel {
        @NameInMap("OwnerNames")
        public java.util.List<String> ownerNames;

        public static ListDatabasesResponseBodyDatabaseListDatabaseOwnerNameList build(java.util.Map<String, ?> map) throws Exception {
            ListDatabasesResponseBodyDatabaseListDatabaseOwnerNameList self = new ListDatabasesResponseBodyDatabaseListDatabaseOwnerNameList();
            return TeaModel.build(map, self);
        }

        public ListDatabasesResponseBodyDatabaseListDatabaseOwnerNameList setOwnerNames(java.util.List<String> ownerNames) {
            this.ownerNames = ownerNames;
            return this;
        }
        public java.util.List<String> getOwnerNames() {
            return this.ownerNames;
        }

    }

    public static class ListDatabasesResponseBodyDatabaseListDatabase extends TeaModel {
        @NameInMap("CatalogName")
        public String catalogName;

        @NameInMap("DatabaseId")
        public String databaseId;

        @NameInMap("DbType")
        public String dbType;

        @NameInMap("DbaId")
        public String dbaId;

        @NameInMap("DbaName")
        public String dbaName;

        @NameInMap("Encoding")
        public String encoding;

        @NameInMap("EnvType")
        public String envType;

        @NameInMap("Host")
        public String host;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("OwnerIdList")
        public ListDatabasesResponseBodyDatabaseListDatabaseOwnerIdList ownerIdList;

        @NameInMap("OwnerNameList")
        public ListDatabasesResponseBodyDatabaseListDatabaseOwnerNameList ownerNameList;

        @NameInMap("Port")
        public Integer port;

        @NameInMap("SchemaName")
        public String schemaName;

        @NameInMap("SearchName")
        public String searchName;

        @NameInMap("Sid")
        public String sid;

        @NameInMap("State")
        public String state;

        public static ListDatabasesResponseBodyDatabaseListDatabase build(java.util.Map<String, ?> map) throws Exception {
            ListDatabasesResponseBodyDatabaseListDatabase self = new ListDatabasesResponseBodyDatabaseListDatabase();
            return TeaModel.build(map, self);
        }

        public ListDatabasesResponseBodyDatabaseListDatabase setCatalogName(String catalogName) {
            this.catalogName = catalogName;
            return this;
        }
        public String getCatalogName() {
            return this.catalogName;
        }

        public ListDatabasesResponseBodyDatabaseListDatabase setDatabaseId(String databaseId) {
            this.databaseId = databaseId;
            return this;
        }
        public String getDatabaseId() {
            return this.databaseId;
        }

        public ListDatabasesResponseBodyDatabaseListDatabase setDbType(String dbType) {
            this.dbType = dbType;
            return this;
        }
        public String getDbType() {
            return this.dbType;
        }

        public ListDatabasesResponseBodyDatabaseListDatabase setDbaId(String dbaId) {
            this.dbaId = dbaId;
            return this;
        }
        public String getDbaId() {
            return this.dbaId;
        }

        public ListDatabasesResponseBodyDatabaseListDatabase setDbaName(String dbaName) {
            this.dbaName = dbaName;
            return this;
        }
        public String getDbaName() {
            return this.dbaName;
        }

        public ListDatabasesResponseBodyDatabaseListDatabase setEncoding(String encoding) {
            this.encoding = encoding;
            return this;
        }
        public String getEncoding() {
            return this.encoding;
        }

        public ListDatabasesResponseBodyDatabaseListDatabase setEnvType(String envType) {
            this.envType = envType;
            return this;
        }
        public String getEnvType() {
            return this.envType;
        }

        public ListDatabasesResponseBodyDatabaseListDatabase setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public ListDatabasesResponseBodyDatabaseListDatabase setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListDatabasesResponseBodyDatabaseListDatabase setOwnerIdList(ListDatabasesResponseBodyDatabaseListDatabaseOwnerIdList ownerIdList) {
            this.ownerIdList = ownerIdList;
            return this;
        }
        public ListDatabasesResponseBodyDatabaseListDatabaseOwnerIdList getOwnerIdList() {
            return this.ownerIdList;
        }

        public ListDatabasesResponseBodyDatabaseListDatabase setOwnerNameList(ListDatabasesResponseBodyDatabaseListDatabaseOwnerNameList ownerNameList) {
            this.ownerNameList = ownerNameList;
            return this;
        }
        public ListDatabasesResponseBodyDatabaseListDatabaseOwnerNameList getOwnerNameList() {
            return this.ownerNameList;
        }

        public ListDatabasesResponseBodyDatabaseListDatabase setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public ListDatabasesResponseBodyDatabaseListDatabase setSchemaName(String schemaName) {
            this.schemaName = schemaName;
            return this;
        }
        public String getSchemaName() {
            return this.schemaName;
        }

        public ListDatabasesResponseBodyDatabaseListDatabase setSearchName(String searchName) {
            this.searchName = searchName;
            return this;
        }
        public String getSearchName() {
            return this.searchName;
        }

        public ListDatabasesResponseBodyDatabaseListDatabase setSid(String sid) {
            this.sid = sid;
            return this;
        }
        public String getSid() {
            return this.sid;
        }

        public ListDatabasesResponseBodyDatabaseListDatabase setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

    }

    public static class ListDatabasesResponseBodyDatabaseList extends TeaModel {
        @NameInMap("Database")
        public java.util.List<ListDatabasesResponseBodyDatabaseListDatabase> database;

        public static ListDatabasesResponseBodyDatabaseList build(java.util.Map<String, ?> map) throws Exception {
            ListDatabasesResponseBodyDatabaseList self = new ListDatabasesResponseBodyDatabaseList();
            return TeaModel.build(map, self);
        }

        public ListDatabasesResponseBodyDatabaseList setDatabase(java.util.List<ListDatabasesResponseBodyDatabaseListDatabase> database) {
            this.database = database;
            return this;
        }
        public java.util.List<ListDatabasesResponseBodyDatabaseListDatabase> getDatabase() {
            return this.database;
        }

    }

}
