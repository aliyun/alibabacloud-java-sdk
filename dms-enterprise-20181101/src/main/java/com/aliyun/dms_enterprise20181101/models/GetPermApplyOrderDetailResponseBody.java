// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetPermApplyOrderDetailResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("PermApplyOrderDetail")
    public GetPermApplyOrderDetailResponseBodyPermApplyOrderDetail permApplyOrderDetail;

    public static GetPermApplyOrderDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPermApplyOrderDetailResponseBody self = new GetPermApplyOrderDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPermApplyOrderDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetPermApplyOrderDetailResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetPermApplyOrderDetailResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetPermApplyOrderDetailResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetPermApplyOrderDetailResponseBody setPermApplyOrderDetail(GetPermApplyOrderDetailResponseBodyPermApplyOrderDetail permApplyOrderDetail) {
        this.permApplyOrderDetail = permApplyOrderDetail;
        return this;
    }
    public GetPermApplyOrderDetailResponseBodyPermApplyOrderDetail getPermApplyOrderDetail() {
        return this.permApplyOrderDetail;
    }

    public static class GetPermApplyOrderDetailResponseBodyPermApplyOrderDetailResourcesDatabaseInfo extends TeaModel {
        @NameInMap("DbId")
        public Long dbId;

        @NameInMap("Logic")
        public Boolean logic;

        @NameInMap("DbType")
        public String dbType;

        @NameInMap("SearchName")
        public String searchName;

        @NameInMap("OwnerIds")
        public java.util.List<Long> ownerIds;

        @NameInMap("OwnerNickNames")
        public java.util.List<String> ownerNickNames;

        @NameInMap("EnvType")
        public String envType;

        public static GetPermApplyOrderDetailResponseBodyPermApplyOrderDetailResourcesDatabaseInfo build(java.util.Map<String, ?> map) throws Exception {
            GetPermApplyOrderDetailResponseBodyPermApplyOrderDetailResourcesDatabaseInfo self = new GetPermApplyOrderDetailResponseBodyPermApplyOrderDetailResourcesDatabaseInfo();
            return TeaModel.build(map, self);
        }

        public GetPermApplyOrderDetailResponseBodyPermApplyOrderDetailResourcesDatabaseInfo setDbId(Long dbId) {
            this.dbId = dbId;
            return this;
        }
        public Long getDbId() {
            return this.dbId;
        }

        public GetPermApplyOrderDetailResponseBodyPermApplyOrderDetailResourcesDatabaseInfo setLogic(Boolean logic) {
            this.logic = logic;
            return this;
        }
        public Boolean getLogic() {
            return this.logic;
        }

        public GetPermApplyOrderDetailResponseBodyPermApplyOrderDetailResourcesDatabaseInfo setDbType(String dbType) {
            this.dbType = dbType;
            return this;
        }
        public String getDbType() {
            return this.dbType;
        }

        public GetPermApplyOrderDetailResponseBodyPermApplyOrderDetailResourcesDatabaseInfo setSearchName(String searchName) {
            this.searchName = searchName;
            return this;
        }
        public String getSearchName() {
            return this.searchName;
        }

        public GetPermApplyOrderDetailResponseBodyPermApplyOrderDetailResourcesDatabaseInfo setOwnerIds(java.util.List<Long> ownerIds) {
            this.ownerIds = ownerIds;
            return this;
        }
        public java.util.List<Long> getOwnerIds() {
            return this.ownerIds;
        }

        public GetPermApplyOrderDetailResponseBodyPermApplyOrderDetailResourcesDatabaseInfo setOwnerNickNames(java.util.List<String> ownerNickNames) {
            this.ownerNickNames = ownerNickNames;
            return this;
        }
        public java.util.List<String> getOwnerNickNames() {
            return this.ownerNickNames;
        }

        public GetPermApplyOrderDetailResponseBodyPermApplyOrderDetailResourcesDatabaseInfo setEnvType(String envType) {
            this.envType = envType;
            return this;
        }
        public String getEnvType() {
            return this.envType;
        }

    }

    public static class GetPermApplyOrderDetailResponseBodyPermApplyOrderDetailResourcesTableInfo extends TeaModel {
        @NameInMap("TableName")
        public String tableName;

        public static GetPermApplyOrderDetailResponseBodyPermApplyOrderDetailResourcesTableInfo build(java.util.Map<String, ?> map) throws Exception {
            GetPermApplyOrderDetailResponseBodyPermApplyOrderDetailResourcesTableInfo self = new GetPermApplyOrderDetailResponseBodyPermApplyOrderDetailResourcesTableInfo();
            return TeaModel.build(map, self);
        }

        public GetPermApplyOrderDetailResponseBodyPermApplyOrderDetailResourcesTableInfo setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

    }

    public static class GetPermApplyOrderDetailResponseBodyPermApplyOrderDetailResourcesColumnInfo extends TeaModel {
        @NameInMap("TableName")
        public String tableName;

        @NameInMap("ColumnName")
        public String columnName;

        public static GetPermApplyOrderDetailResponseBodyPermApplyOrderDetailResourcesColumnInfo build(java.util.Map<String, ?> map) throws Exception {
            GetPermApplyOrderDetailResponseBodyPermApplyOrderDetailResourcesColumnInfo self = new GetPermApplyOrderDetailResponseBodyPermApplyOrderDetailResourcesColumnInfo();
            return TeaModel.build(map, self);
        }

        public GetPermApplyOrderDetailResponseBodyPermApplyOrderDetailResourcesColumnInfo setTableName(String tableName) {
            this.tableName = tableName;
            return this;
        }
        public String getTableName() {
            return this.tableName;
        }

        public GetPermApplyOrderDetailResponseBodyPermApplyOrderDetailResourcesColumnInfo setColumnName(String columnName) {
            this.columnName = columnName;
            return this;
        }
        public String getColumnName() {
            return this.columnName;
        }

    }

    public static class GetPermApplyOrderDetailResponseBodyPermApplyOrderDetailResourcesInstanceInfo extends TeaModel {
        @NameInMap("InstanceId")
        public String instanceId;

        @NameInMap("SearchName")
        public String searchName;

        @NameInMap("DbType")
        public String dbType;

        @NameInMap("EnvType")
        public String envType;

        @NameInMap("Host")
        public String host;

        @NameInMap("Port")
        public Long port;

        @NameInMap("OwnerIds")
        public java.util.List<Long> ownerIds;

        @NameInMap("OwnerNickName")
        public java.util.List<String> ownerNickName;

        @NameInMap("DbaId")
        public Long dbaId;

        @NameInMap("DbaNickName")
        public String dbaNickName;

        public static GetPermApplyOrderDetailResponseBodyPermApplyOrderDetailResourcesInstanceInfo build(java.util.Map<String, ?> map) throws Exception {
            GetPermApplyOrderDetailResponseBodyPermApplyOrderDetailResourcesInstanceInfo self = new GetPermApplyOrderDetailResponseBodyPermApplyOrderDetailResourcesInstanceInfo();
            return TeaModel.build(map, self);
        }

        public GetPermApplyOrderDetailResponseBodyPermApplyOrderDetailResourcesInstanceInfo setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetPermApplyOrderDetailResponseBodyPermApplyOrderDetailResourcesInstanceInfo setSearchName(String searchName) {
            this.searchName = searchName;
            return this;
        }
        public String getSearchName() {
            return this.searchName;
        }

        public GetPermApplyOrderDetailResponseBodyPermApplyOrderDetailResourcesInstanceInfo setDbType(String dbType) {
            this.dbType = dbType;
            return this;
        }
        public String getDbType() {
            return this.dbType;
        }

        public GetPermApplyOrderDetailResponseBodyPermApplyOrderDetailResourcesInstanceInfo setEnvType(String envType) {
            this.envType = envType;
            return this;
        }
        public String getEnvType() {
            return this.envType;
        }

        public GetPermApplyOrderDetailResponseBodyPermApplyOrderDetailResourcesInstanceInfo setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public GetPermApplyOrderDetailResponseBodyPermApplyOrderDetailResourcesInstanceInfo setPort(Long port) {
            this.port = port;
            return this;
        }
        public Long getPort() {
            return this.port;
        }

        public GetPermApplyOrderDetailResponseBodyPermApplyOrderDetailResourcesInstanceInfo setOwnerIds(java.util.List<Long> ownerIds) {
            this.ownerIds = ownerIds;
            return this;
        }
        public java.util.List<Long> getOwnerIds() {
            return this.ownerIds;
        }

        public GetPermApplyOrderDetailResponseBodyPermApplyOrderDetailResourcesInstanceInfo setOwnerNickName(java.util.List<String> ownerNickName) {
            this.ownerNickName = ownerNickName;
            return this;
        }
        public java.util.List<String> getOwnerNickName() {
            return this.ownerNickName;
        }

        public GetPermApplyOrderDetailResponseBodyPermApplyOrderDetailResourcesInstanceInfo setDbaId(Long dbaId) {
            this.dbaId = dbaId;
            return this;
        }
        public Long getDbaId() {
            return this.dbaId;
        }

        public GetPermApplyOrderDetailResponseBodyPermApplyOrderDetailResourcesInstanceInfo setDbaNickName(String dbaNickName) {
            this.dbaNickName = dbaNickName;
            return this;
        }
        public String getDbaNickName() {
            return this.dbaNickName;
        }

    }

    public static class GetPermApplyOrderDetailResponseBodyPermApplyOrderDetailResources extends TeaModel {
        @NameInMap("DatabaseInfo")
        public GetPermApplyOrderDetailResponseBodyPermApplyOrderDetailResourcesDatabaseInfo databaseInfo;

        @NameInMap("TableInfo")
        public GetPermApplyOrderDetailResponseBodyPermApplyOrderDetailResourcesTableInfo tableInfo;

        @NameInMap("ColumnInfo")
        public GetPermApplyOrderDetailResponseBodyPermApplyOrderDetailResourcesColumnInfo columnInfo;

        @NameInMap("InstanceInfo")
        public GetPermApplyOrderDetailResponseBodyPermApplyOrderDetailResourcesInstanceInfo instanceInfo;

        public static GetPermApplyOrderDetailResponseBodyPermApplyOrderDetailResources build(java.util.Map<String, ?> map) throws Exception {
            GetPermApplyOrderDetailResponseBodyPermApplyOrderDetailResources self = new GetPermApplyOrderDetailResponseBodyPermApplyOrderDetailResources();
            return TeaModel.build(map, self);
        }

        public GetPermApplyOrderDetailResponseBodyPermApplyOrderDetailResources setDatabaseInfo(GetPermApplyOrderDetailResponseBodyPermApplyOrderDetailResourcesDatabaseInfo databaseInfo) {
            this.databaseInfo = databaseInfo;
            return this;
        }
        public GetPermApplyOrderDetailResponseBodyPermApplyOrderDetailResourcesDatabaseInfo getDatabaseInfo() {
            return this.databaseInfo;
        }

        public GetPermApplyOrderDetailResponseBodyPermApplyOrderDetailResources setTableInfo(GetPermApplyOrderDetailResponseBodyPermApplyOrderDetailResourcesTableInfo tableInfo) {
            this.tableInfo = tableInfo;
            return this;
        }
        public GetPermApplyOrderDetailResponseBodyPermApplyOrderDetailResourcesTableInfo getTableInfo() {
            return this.tableInfo;
        }

        public GetPermApplyOrderDetailResponseBodyPermApplyOrderDetailResources setColumnInfo(GetPermApplyOrderDetailResponseBodyPermApplyOrderDetailResourcesColumnInfo columnInfo) {
            this.columnInfo = columnInfo;
            return this;
        }
        public GetPermApplyOrderDetailResponseBodyPermApplyOrderDetailResourcesColumnInfo getColumnInfo() {
            return this.columnInfo;
        }

        public GetPermApplyOrderDetailResponseBodyPermApplyOrderDetailResources setInstanceInfo(GetPermApplyOrderDetailResponseBodyPermApplyOrderDetailResourcesInstanceInfo instanceInfo) {
            this.instanceInfo = instanceInfo;
            return this;
        }
        public GetPermApplyOrderDetailResponseBodyPermApplyOrderDetailResourcesInstanceInfo getInstanceInfo() {
            return this.instanceInfo;
        }

    }

    public static class GetPermApplyOrderDetailResponseBodyPermApplyOrderDetail extends TeaModel {
        @NameInMap("Resources")
        public java.util.List<GetPermApplyOrderDetailResponseBodyPermApplyOrderDetailResources> resources;

        @NameInMap("PermType")
        public Long permType;

        @NameInMap("Seconds")
        public Long seconds;

        @NameInMap("ApplyType")
        public String applyType;

        public static GetPermApplyOrderDetailResponseBodyPermApplyOrderDetail build(java.util.Map<String, ?> map) throws Exception {
            GetPermApplyOrderDetailResponseBodyPermApplyOrderDetail self = new GetPermApplyOrderDetailResponseBodyPermApplyOrderDetail();
            return TeaModel.build(map, self);
        }

        public GetPermApplyOrderDetailResponseBodyPermApplyOrderDetail setResources(java.util.List<GetPermApplyOrderDetailResponseBodyPermApplyOrderDetailResources> resources) {
            this.resources = resources;
            return this;
        }
        public java.util.List<GetPermApplyOrderDetailResponseBodyPermApplyOrderDetailResources> getResources() {
            return this.resources;
        }

        public GetPermApplyOrderDetailResponseBodyPermApplyOrderDetail setPermType(Long permType) {
            this.permType = permType;
            return this;
        }
        public Long getPermType() {
            return this.permType;
        }

        public GetPermApplyOrderDetailResponseBodyPermApplyOrderDetail setSeconds(Long seconds) {
            this.seconds = seconds;
            return this;
        }
        public Long getSeconds() {
            return this.seconds;
        }

        public GetPermApplyOrderDetailResponseBodyPermApplyOrderDetail setApplyType(String applyType) {
            this.applyType = applyType;
            return this;
        }
        public String getApplyType() {
            return this.applyType;
        }

    }

}
