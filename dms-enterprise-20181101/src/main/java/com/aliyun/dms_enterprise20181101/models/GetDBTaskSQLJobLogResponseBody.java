// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dms_enterprise20181101.models;

import com.aliyun.tea.*;

public class GetDBTaskSQLJobLogResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Log")
    public String log;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The operation that you want to perform. Set the value to **GetDBTaskSQLJobLog**.</p>
     */
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
