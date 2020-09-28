// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_lab20200915.models;

import com.aliyun.tea.*;

public class GetDatabaseResponse extends TeaModel {
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

    @NameInMap("LabDatabase")
    @Validation(required = true)
    public GetDatabaseResponseLabDatabase labDatabase;

    public static GetDatabaseResponse build(java.util.Map<String, ?> map) throws Exception {
        GetDatabaseResponse self = new GetDatabaseResponse();
        return TeaModel.build(map, self);
    }

    public GetDatabaseResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDatabaseResponse setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public GetDatabaseResponse setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetDatabaseResponse setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetDatabaseResponse setLabDatabase(GetDatabaseResponseLabDatabase labDatabase) {
        this.labDatabase = labDatabase;
        return this;
    }
    public GetDatabaseResponseLabDatabase getLabDatabase() {
        return this.labDatabase;
    }

    public static class GetDatabaseResponseLabDatabase extends TeaModel {
        @NameInMap("SchemaName")
        @Validation(required = true)
        public String schemaName;

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

        @NameInMap("Account")
        @Validation(required = true)
        public String account;

        @NameInMap("Password")
        @Validation(required = true)
        public String password;

        @NameInMap("Sid")
        @Validation(required = true)
        public String sid;

        public static GetDatabaseResponseLabDatabase build(java.util.Map<String, ?> map) throws Exception {
            GetDatabaseResponseLabDatabase self = new GetDatabaseResponseLabDatabase();
            return TeaModel.build(map, self);
        }

        public GetDatabaseResponseLabDatabase setSchemaName(String schemaName) {
            this.schemaName = schemaName;
            return this;
        }
        public String getSchemaName() {
            return this.schemaName;
        }

        public GetDatabaseResponseLabDatabase setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetDatabaseResponseLabDatabase setDbType(String dbType) {
            this.dbType = dbType;
            return this;
        }
        public String getDbType() {
            return this.dbType;
        }

        public GetDatabaseResponseLabDatabase setHost(String host) {
            this.host = host;
            return this;
        }
        public String getHost() {
            return this.host;
        }

        public GetDatabaseResponseLabDatabase setPort(String port) {
            this.port = port;
            return this;
        }
        public String getPort() {
            return this.port;
        }

        public GetDatabaseResponseLabDatabase setAccount(String account) {
            this.account = account;
            return this;
        }
        public String getAccount() {
            return this.account;
        }

        public GetDatabaseResponseLabDatabase setPassword(String password) {
            this.password = password;
            return this;
        }
        public String getPassword() {
            return this.password;
        }

        public GetDatabaseResponseLabDatabase setSid(String sid) {
            this.sid = sid;
            return this;
        }
        public String getSid() {
            return this.sid;
        }

    }

}
