// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class ScanDataRemoveRoleResponseBody extends TeaModel {
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

    // resultObj
    @NameInMap("ProjectId")
    public Long projectId;

    // traceId
    @NameInMap("RequestId")
    public String requestId;

    // retry
    @NameInMap("Retry")
    public Boolean retry;

    // success
    @NameInMap("Success")
    public Boolean success;

    public static ScanDataRemoveRoleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ScanDataRemoveRoleResponseBody self = new ScanDataRemoveRoleResponseBody();
        return TeaModel.build(map, self);
    }

    public ScanDataRemoveRoleResponseBody setAsync(Boolean async) {
        this.async = async;
        return this;
    }
    public Boolean getAsync() {
        return this.async;
    }

    public ScanDataRemoveRoleResponseBody setAsyncToken(String asyncToken) {
        this.asyncToken = asyncToken;
        return this;
    }
    public String getAsyncToken() {
        return this.asyncToken;
    }

    public ScanDataRemoveRoleResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ScanDataRemoveRoleResponseBody setErrorMsg(String errorMsg) {
        this.errorMsg = errorMsg;
        return this;
    }
    public String getErrorMsg() {
        return this.errorMsg;
    }

    public ScanDataRemoveRoleResponseBody setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public ScanDataRemoveRoleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ScanDataRemoveRoleResponseBody setRetry(Boolean retry) {
        this.retry = retry;
        return this;
    }
    public Boolean getRetry() {
        return this.retry;
    }

    public ScanDataRemoveRoleResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
