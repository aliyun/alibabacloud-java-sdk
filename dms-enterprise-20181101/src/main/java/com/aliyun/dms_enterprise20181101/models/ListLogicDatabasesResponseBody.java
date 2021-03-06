// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class ListLogicDatabasesResponseBody extends TeaModel {
    @NameInMap("TotalCount")
    public Long totalCount;

    @NameInMap("LogicDatabaseList")
    public ListLogicDatabasesResponseBodyLogicDatabaseList logicDatabaseList;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Success")
    public Boolean success;

    public static ListLogicDatabasesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListLogicDatabasesResponseBody self = new ListLogicDatabasesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListLogicDatabasesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
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

    public ListLogicDatabasesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
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
        @NameInMap("DatabaseId")
        public String databaseId;

        @NameInMap("OwnerIdList")
        public ListLogicDatabasesResponseBodyLogicDatabaseListLogicDatabaseOwnerIdList ownerIdList;

        @NameInMap("DbType")
        public String dbType;

        @NameInMap("OwnerNameList")
        public ListLogicDatabasesResponseBodyLogicDatabaseListLogicDatabaseOwnerNameList ownerNameList;

        @NameInMap("Logic")
        public Boolean logic;

        @NameInMap("SchemaName")
        public String schemaName;

        @NameInMap("SearchName")
        public String searchName;

        @NameInMap("EnvType")
        public String envType;

        public static ListLogicDatabasesResponseBodyLogicDatabaseListLogicDatabase build(java.util.Map<String, ?> map) throws Exception {
            ListLogicDatabasesResponseBodyLogicDatabaseListLogicDatabase self = new ListLogicDatabasesResponseBodyLogicDatabaseListLogicDatabase();
            return TeaModel.build(map, self);
        }

        public ListLogicDatabasesResponseBodyLogicDatabaseListLogicDatabase setDatabaseId(String databaseId) {
            this.databaseId = databaseId;
            return this;
        }
        public String getDatabaseId() {
            return this.databaseId;
        }

        public ListLogicDatabasesResponseBodyLogicDatabaseListLogicDatabase setOwnerIdList(ListLogicDatabasesResponseBodyLogicDatabaseListLogicDatabaseOwnerIdList ownerIdList) {
            this.ownerIdList = ownerIdList;
            return this;
        }
        public ListLogicDatabasesResponseBodyLogicDatabaseListLogicDatabaseOwnerIdList getOwnerIdList() {
            return this.ownerIdList;
        }

        public ListLogicDatabasesResponseBodyLogicDatabaseListLogicDatabase setDbType(String dbType) {
            this.dbType = dbType;
            return this;
        }
        public String getDbType() {
            return this.dbType;
        }

        public ListLogicDatabasesResponseBodyLogicDatabaseListLogicDatabase setOwnerNameList(ListLogicDatabasesResponseBodyLogicDatabaseListLogicDatabaseOwnerNameList ownerNameList) {
            this.ownerNameList = ownerNameList;
            return this;
        }
        public ListLogicDatabasesResponseBodyLogicDatabaseListLogicDatabaseOwnerNameList getOwnerNameList() {
            return this.ownerNameList;
        }

        public ListLogicDatabasesResponseBodyLogicDatabaseListLogicDatabase setLogic(Boolean logic) {
            this.logic = logic;
            return this;
        }
        public Boolean getLogic() {
            return this.logic;
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

        public ListLogicDatabasesResponseBodyLogicDatabaseListLogicDatabase setEnvType(String envType) {
            this.envType = envType;
            return this;
        }
        public String getEnvType() {
            return this.envType;
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
