// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class CommonRequestResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMsg")
    public String errorMsg;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResultObj")
    public String resultObj;

    @NameInMap("Retry")
    public Boolean retry;

    @NameInMap("Success")
    public Boolean success;

    // Id of the request
    @NameInMap("TraceId")
    public String traceId;

    public static CommonRequestResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CommonRequestResponseBody self = new CommonRequestResponseBody();
        return TeaModel.build(map, self);
    }

    public CommonRequestResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public CommonRequestResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public CommonRequestResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CommonRequestResponseBody setResultObj(String resultObj) {
        this.resultObj = resultObj;
        return this;
    }
    public String getResultObj() {
        return this.resultObj;
    }

    public CommonRequestResponseBody setRetry(Boolean retry) {
        this.retry = retry;
        return this;
    }
    public Boolean getRetry() {
        return this.retry;
    }

    public CommonRequestResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public CommonRequestResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

}
