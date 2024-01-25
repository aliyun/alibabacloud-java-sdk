// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mindlive20210301.models;

import com.aliyun.tea.*;

public class ReportLiveStateResponseBody extends TeaModel {
    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ReportLiveStateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ReportLiveStateResponseBody self = new ReportLiveStateResponseBody();
        return TeaModel.build(map, self);
    }

    public ReportLiveStateResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public ReportLiveStateResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public ReportLiveStateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ReportLiveStateResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
