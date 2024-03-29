// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class ScanDataQueryProjectResponseBody extends TeaModel {
    // async
    @NameInMap("Async")
    public Boolean async;

    // asyncToken
    @NameInMap("AsyncToken")
    public String asyncToken;

    // errorCode
    @NameInMap("ErrorCode")
    public String errorCode;

    // errorMsg
    @NameInMap("ErrorMsg")
    public String errorMsg;

    // traceId
    @NameInMap("RequestId")
    public String requestId;

    // resultObj
    @NameInMap("ResultObj")
    public java.util.Map<String, ?> resultObj;

    // retry
    @NameInMap("Retry")
    public Boolean retry;

    // success
    @NameInMap("Success")
    public Boolean success;

    public static ScanDataQueryProjectResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ScanDataQueryProjectResponseBody self = new ScanDataQueryProjectResponseBody();
        return TeaModel.build(map, self);
    }

    public ScanDataQueryProjectResponseBody setAsync(Boolean async) {
        this.async = async;
        return this;
    }
    public Boolean getAsync() {
        return this.async;
    }

    public ScanDataQueryProjectResponseBody setAsyncToken(String asyncToken) {
        this.asyncToken = asyncToken;
        return this;
    }
    public String getAsyncToken() {
        return this.asyncToken;
    }

    public ScanDataQueryProjectResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ScanDataQueryProjectResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public ScanDataQueryProjectResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ScanDataQueryProjectResponseBody setResultObj(java.util.Map<String, ?> resultObj) {
        this.resultObj = resultObj;
        return this;
    }
    public java.util.Map<String, ?> getResultObj() {
        return this.resultObj;
    }

    public ScanDataQueryProjectResponseBody setRetry(Boolean retry) {
        this.retry = retry;
        return this;
    }
    public Boolean getRetry() {
        return this.retry;
    }

    public ScanDataQueryProjectResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
