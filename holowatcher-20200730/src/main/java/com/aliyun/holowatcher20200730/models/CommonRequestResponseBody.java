// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class CommonRequestResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("TraceId")
    public String traceId;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("Retry")
    public Boolean retry;

    @NameInMap("ErrorMsg")
    public String errorMsg;

    @NameInMap("ResultObj")
    public String resultObj;

    @NameInMap("RequestId")
    public String requestId;

    public static CommonRequestResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CommonRequestResponseBody self = new CommonRequestResponseBody();
        return TeaModel.build(map, self);
    }

    public CommonRequestResponseBody setTraceId(String traceId) {
        this.traceId = traceId;
        return this;
    }
    public String getTraceId() {
        return this.traceId;
    }

    public CommonRequestResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public CommonRequestResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public CommonRequestResponseBody setRetry(Boolean retry) {
        this.retry = retry;
        return this;
    }
    public Boolean getRetry() {
        return this.retry;
    }

    public CommonRequestResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public CommonRequestResponseBody setResultObj(String resultObj) {
        this.resultObj = resultObj;
        return this;
    }
    public String getResultObj() {
        return this.resultObj;
    }

    public CommonRequestResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
