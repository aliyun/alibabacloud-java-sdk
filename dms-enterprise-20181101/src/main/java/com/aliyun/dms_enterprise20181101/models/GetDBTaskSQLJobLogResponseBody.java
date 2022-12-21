// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetDBTaskSQLJobLogResponseBody extends TeaModel {
    // The error code returned.
    @NameInMap("ErrorCode")
    public String errorCode;

    // The error message returned.
    @NameInMap("ErrorMessage")
    public String errorMessage;

    // The log that records the scheduling details.
    @NameInMap("Log")
    public String log;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    // Indicates whether the request was successful. Valid values:
    // 
    // *   **true**: The request was successful.
    // *   **false**: The request failed.
    @NameInMap("Success")
    public Boolean success;

    public static GetDBTaskSQLJobLogResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetDBTaskSQLJobLogResponseBody self = new GetDBTaskSQLJobLogResponseBody();
        return TeaModel.build(map, self);
    }

    public GetDBTaskSQLJobLogResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetDBTaskSQLJobLogResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetDBTaskSQLJobLogResponseBody setLog(String log) {
        this.log = log;
        return this;
    }
    public String getLog() {
        return this.log;
    }

    public GetDBTaskSQLJobLogResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetDBTaskSQLJobLogResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
