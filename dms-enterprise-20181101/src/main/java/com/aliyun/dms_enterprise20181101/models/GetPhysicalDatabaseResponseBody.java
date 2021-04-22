// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetPhysicalDatabaseResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Database")
    public GetPhysicalDatabaseResponseBodyDatabase database;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Success")
    public Boolean success;

    public static GetPhysicalDatabaseResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPhysicalDatabaseResponseBody self = new GetPhysicalDatabaseResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPhysicalDatabaseResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetPhysicalDatabaseResponseBody setDatabase(GetPhysicalDatabaseResponseBodyDatabase database) {
        this.database = database;
        return this;
    }
    public GetPhysicalDatabaseResponseBodyDatabase getDatabase() {
        return this.database;
    }

    public GetPhysicalDatabaseResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetPhysicalDatabaseResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetPhysicalDatabaseResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetPhysicalDatabaseResponseBodyDatabaseOwnerIdList extends TeaModel {
        @NameInMap("OwnerIds")
        public java.util.List<String> ownerIds;

        public static GetPhysicalDatabaseResponseBodyDatabaseOwnerIdList build(java.util.Map<String, ?> map) throws Exception {
            GetPhysicalDatabaseResponseBodyDatabaseOwnerIdList self = new GetPhysicalDatabaseResponseBodyDatabaseOwnerIdList();
            return TeaModel.build(map, self);
        }

        public GetPhysicalDatabaseResponseBodyDatabaseOwnerIdList setOwnerIds(java.util.List<String> ownerIds) {
            this.ownerIds = ownerIds;
            return this;
        }
        public java.util.List<String> getOwnerIds() {
            return this.ownerIds;
        }

    }

    public static class GetPhysicalDatabaseResponseBodyDatabaseOwnerNameList extends TeaModel {
        @NameInMap("OwnerNames")
        public java.util.List<String> ownerNames;

        public static GetPhysicalDatabaseResponseBodyDatabaseOwnerNameList build(java.util.Map<String, ?> map) throws Exception {
            GetPhysicalDatabaseResponseBodyDatabaseOwnerNameList self = new GetPhysicalDatabaseResponseBodyDatabaseOwnerNameList();
            return TeaModel.build(map, self);
        }

        public GetPhysicalDatabaseResponseBodyDatabaseOwnerNameList setOwnerNames(java.util.List<String> ownerNames) {
            this.ownerNames = ownerNames;
            return this;
        }
        public java.util.List<String> getOwnerNames() {
            return this.ownerNames;
        }

    }

    public static class GetPhysicalDatabaseResponseBodyDatabase extends TeaModel {
        @NameInMap("DatabaseId")
        public String databaseId;

        @NameInMap("Host")
        public String host;

        @NameInMap("CatalogName")
        public String catalogName;

        @NameInMap("DbaName")
        public String dbaName;

        @NameInMap("State")
        public String state;

        @NameInMap("DbaId")
        public String dbaId;

        @NameInMap("SchemaName")
        public String schemaName;

        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("Port")
        public Integer port;

        @NameInMap("EnvType")
        public String envType;

        @NameInMap("Sid")
        public String sid;

        @NameInMap("OwnerIdList")
        public GetPhysicalDatabaseResponseBodyDatabaseOwnerIdList ownerIdList;

        @NameInMap("Encoding")
        public String encoding;

        @NameInMap("DbType")
        public String dbType;

        @NameInMap("OwnerNameList")
        public GetPhysicalDatabaseResponseBodyDatabaseOwnerNameList ownerNameList;

        @NameInMap("SearchName")
        public String searchName;

        public static GetPhysicalDatabaseResponseBodyDatabase build(java.util.Map<String, ?> map) throws Exception {
            GetPhysicalDatabaseResponseBodyDatabase self = new GetPhysicalDatabaseResponseBodyDatabase();
            return TeaModel.build(map, self);
        }

        public GetPhysicalDatabaseResponseBodyDatabase setDatabaseId(String databaseId) {
            this.databaseId = databaseId;
            return this;
        }
        public String getDatabaseId() {
            return this.databaseId;
        }

        public GetPhysicalDatabaseResponseBodyDatabase setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public GetPhysicalDatabaseResponseBodyDatabase setCatalogName(String catalogName) {
            this.catalogName = catalogName;
            return this;
        }
        public String getCatalogName() {
            return this.catalogName;
        }

        public GetPhysicalDatabaseResponseBodyDatabase setDbaName(String dbaName) {
            this.dbaName = dbaName;
            return this;
        }
        public String getDbaName() {
            return this.dbaName;
        }

        public GetPhysicalDatabaseResponseBodyDatabase setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public GetPhysicalDatabaseResponseBodyDatabase setDbaId(String dbaId) {
            this.dbaId = dbaId;
            return this;
        }
        public String getDbaId() {
            return this.dbaId;
        }

        public GetPhysicalDatabaseResponseBodyDatabase setSchemaName(String schemaName) {
            this.schemaName = schemaName;
            return this;
        }
        public String getSchemaName() {
            return this.schemaName;
        }

        public GetPhysicalDatabaseResponseBodyDatabase setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetPhysicalDatabaseResponseBodyDatabase setPort(Integer port) {
            this.port = port;
            return this;
        }
        public Integer getPort() {
            return this.port;
        }

        public GetPhysicalDatabaseResponseBodyDatabase setEnvType(String envType) {
            this.envType = envType;
            return this;
        }
        public String getEnvType() {
            return this.envType;
        }

        public GetPhysicalDatabaseResponseBodyDatabase setSid(String sid) {
            this.sid = sid;
            return this;
        }
        public String getSid() {
            return this.sid;
        }

        public GetPhysicalDatabaseResponseBodyDatabase setOwnerIdList(GetPhysicalDatabaseResponseBodyDatabaseOwnerIdList ownerIdList) {
            this.ownerIdList = ownerIdList;
            return this;
        }
        public GetPhysicalDatabaseResponseBodyDatabaseOwnerIdList getOwnerIdList() {
            return this.ownerIdList;
        }

        public GetPhysicalDatabaseResponseBodyDatabase setEncoding(String encoding) {
            this.encoding = encoding;
            return this;
        }
        public String getEncoding() {
            return this.encoding;
        }

        public GetPhysicalDatabaseResponseBodyDatabase setDbType(String dbType) {
            this.dbType = dbType;
            return this;
        }
        public String getDbType() {
            return this.dbType;
        }

        public GetPhysicalDatabaseResponseBodyDatabase setOwnerNameList(GetPhysicalDatabaseResponseBodyDatabaseOwnerNameList ownerNameList) {
            this.ownerNameList = ownerNameList;
            return this;
        }
        public GetPhysicalDatabaseResponseBodyDatabaseOwnerNameList getOwnerNameList() {
            return this.ownerNameList;
        }

        public GetPhysicalDatabaseResponseBodyDatabase setSearchName(String searchName) {
            this.searchName = searchName;
            return this;
        }
        public String getSearchName() {
            return this.searchName;
        }

    }

}
