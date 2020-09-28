// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_lab20200915.models;

import com.aliyun.tea.*;

public class ListDatabasesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Success")
    @Validation(required = true)
    public Boolean success;

    @NameInMap("ErrorMessage")
    @Validation(required = true)
    public String errorMessage;

    @NameInMap("ErrorCode")
    @Validation(required = true)
    public String errorCode;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Long totalCount;

    @NameInMap("DatabaseList")
    @Validation(required = true)
    public ListDatabasesResponseDatabaseList databaseList;

    public static ListDatabasesResponse build(java.util.Map<String, ?> map) throws Exception {
        ListDatabasesResponse self = new ListDatabasesResponse();
        return TeaModel.build(map, self);
    }

    public ListDatabasesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListDatabasesResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListDatabasesResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ListDatabasesResponse setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ListDatabasesResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public ListDatabasesResponse setDatabaseList(ListDatabasesResponseDatabaseList databaseList) {
        this.databaseList = databaseList;
        return this;
    }
    public ListDatabasesResponseDatabaseList getDatabaseList() {
        return this.databaseList;
    }

    public static class ListDatabasesResponseDatabaseListDatabase extends TeaModel {
        @NameInMap("SchemaName")
        @Validation(required = true)
        public String schemaName;

        @NameInMap("Account")
        @Validation(required = true)
        public String account;

        @NameInMap("Password")
        @Validation(required = true)
        public String password;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("DbType")
        @Validation(required = true)
        public String dbType;

        @NameInMap("Host")
        @Validation(required = true)
        public String host;

        @NameInMap("Port")
        @Validation(required = true)
        public String port;

        @NameInMap("Sid")
        @Validation(required = true)
        public String sid;

        public static ListDatabasesResponseDatabaseListDatabase build(java.util.Map<String, ?> map) throws Exception {
            ListDatabasesResponseDatabaseListDatabase self = new ListDatabasesResponseDatabaseListDatabase();
            return TeaModel.build(map, self);
        }

        public ListDatabasesResponseDatabaseListDatabase setSchemaName(String schemaName) {
            this.schemaName = schemaName;
            return this;
        }
        public String getSchemaName() {
            return this.schemaName;
        }

        public ListDatabasesResponseDatabaseListDatabase setAccount(String account) {
            this.account = account;
            return this;
        }
        public String getAccount() {
            return this.account;
        }

        public ListDatabasesResponseDatabaseListDatabase setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public ListDatabasesResponseDatabaseListDatabase setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListDatabasesResponseDatabaseListDatabase setDbType(String dbType) {
            this.dbType = dbType;
            return this;
        }
        public String getDbType() {
            return this.dbType;
        }

        public ListDatabasesResponseDatabaseListDatabase setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public ListDatabasesResponseDatabaseListDatabase setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public ListDatabasesResponseDatabaseListDatabase setSid(String sid) {
            this.sid = sid;
            return this;
        }
        public String getSid() {
            return this.sid;
        }

    }

    public static class ListDatabasesResponseDatabaseList extends TeaModel {
        @NameInMap("Database")
        @Validation(required = true)
        public java.util.List<ListDatabasesResponseDatabaseListDatabase> database;

        public static ListDatabasesResponseDatabaseList build(java.util.Map<String, ?> map) throws Exception {
            ListDatabasesResponseDatabaseList self = new ListDatabasesResponseDatabaseList();
            return TeaModel.build(map, self);
        }

        public ListDatabasesResponseDatabaseList setDatabase(java.util.List<ListDatabasesResponseDatabaseListDatabase> database) {
            this.database = database;
            return this;
        }
        public java.util.List<ListDatabasesResponseDatabaseListDatabase> getDatabase() {
            return this.database;
        }

    }

}
