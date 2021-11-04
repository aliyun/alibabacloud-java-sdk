// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetLogicDatabaseResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("LogicDatabase")
    public GetLogicDatabaseResponseBodyLogicDatabase logicDatabase;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("Alias")
        public String alias;

        @NameInMap("DatabaseId")
        public String databaseId;

        @NameInMap("DbType")
        public String dbType;

        @NameInMap("EnvType")
        public String envType;

        @NameInMap("Logic")
        public Boolean logic;

        @NameInMap("OwnerIdList")
        public GetLogicDatabaseResponseBodyLogicDatabaseOwnerIdList ownerIdList;

        @NameInMap("OwnerNameList")
        public GetLogicDatabaseResponseBodyLogicDatabaseOwnerNameList ownerNameList;

        @NameInMap("SchemaName")
        public String schemaName;

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
