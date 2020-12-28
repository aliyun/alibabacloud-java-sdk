// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datalake20200710.models;

import com.aliyun.tea.*;

public class BatchDeleteTablesResponseBody extends TeaModel {
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

    // PartitionErrors
    @NameInMap("TableErrors")
    public java.util.List<TableError> tableErrors;

    public static BatchDeleteTablesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BatchDeleteTablesResponseBody self = new BatchDeleteTablesResponseBody();
        return TeaModel.build(map, self);
    }

    public BatchDeleteTablesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public BatchDeleteTablesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public BatchDeleteTablesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BatchDeleteTablesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public BatchDeleteTablesResponseBody setTableErrors(java.util.List<TableError> tableErrors) {
        this.tableErrors = tableErrors;
        return this;
    }
    public java.util.List<TableError> getTableErrors() {
        return this.tableErrors;
    }

}
