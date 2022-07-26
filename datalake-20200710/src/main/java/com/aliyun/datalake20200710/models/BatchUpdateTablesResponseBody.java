// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class BatchUpdateTablesResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("TableErrors")
    public java.util.List<TableError> tableErrors;

    @NameInMap("TaskId")
    public String taskId;

    public static BatchUpdateTablesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchUpdateTablesResponseBody self = new BatchUpdateTablesResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchUpdateTablesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public BatchUpdateTablesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public BatchUpdateTablesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BatchUpdateTablesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public BatchUpdateTablesResponseBody setTableErrors(java.util.List<TableError> tableErrors) {
        this.tableErrors = tableErrors;
        return this;
    }
    public java.util.List<TableError> getTableErrors() {
        return this.tableErrors;
    }

    public BatchUpdateTablesResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

}
