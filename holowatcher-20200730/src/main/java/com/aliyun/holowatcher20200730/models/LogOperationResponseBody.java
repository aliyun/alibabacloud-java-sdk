// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class LogOperationResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMsg")
    public String errorMsg;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultObj")
    public Boolean resultObj;

    @NameInMap("Success")
    public String success;

    public static LogOperationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        LogOperationResponseBody self = new LogOperationResponseBody();
        return TeaModel.build(map, self);
    }

    public LogOperationResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public LogOperationResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public LogOperationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public LogOperationResponseBody setResultObj(Boolean resultObj) {
        this.resultObj = resultObj;
        return this;
    }
    public Boolean getResultObj() {
        return this.resultObj;
    }

    public LogOperationResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

}
