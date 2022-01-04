// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class BatchUpdateTablesResponseBody extends TeaModel {
    // 响应代码
    @NameInMap("Code")
    public String code;

    // 响应消息
    @NameInMap("Message")
    public String message;

    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    // 是否成功
    @NameInMap("Success")
    public Boolean success;

    // 表出错信息
    @NameInMap("TableErrors")
    public java.util.List<TableError> tableErrors;

    // 异步更新 taskId
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
