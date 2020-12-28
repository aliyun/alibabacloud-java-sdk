// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class BatchGetTablesResponseBody extends TeaModel {
    // Code
    @NameInMap("Code")
    public String code;

    // Message
    @NameInMap("Message")
    public String message;

    // RequestId
    @NameInMap("RequestId")
    public String requestId;

    // Success
    @NameInMap("Success")
    public Boolean success;

    // TableErrors
    @NameInMap("TableErrors")
    public java.util.List<TableError> tableErrors;

    // Tables
    @NameInMap("Tables")
    public java.util.List<Table> tables;

    public static BatchGetTablesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchGetTablesResponseBody self = new BatchGetTablesResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchGetTablesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public BatchGetTablesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public BatchGetTablesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BatchGetTablesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public BatchGetTablesResponseBody setTableErrors(java.util.List<TableError> tableErrors) {
        this.tableErrors = tableErrors;
        return this;
    }
    public java.util.List<TableError> getTableErrors() {
        return this.tableErrors;
    }

    public BatchGetTablesResponseBody setTables(java.util.List<Table> tables) {
        this.tables = tables;
        return this;
    }
    public java.util.List<Table> getTables() {
        return this.tables;
    }

}
