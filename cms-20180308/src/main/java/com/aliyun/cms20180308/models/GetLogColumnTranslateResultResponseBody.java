// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20180308.models;

import com.aliyun.tea.*;

public class GetLogColumnTranslateResultResponseBody extends TeaModel {
    @NameInMap("Code")
    public Long code;

    @NameInMap("ErrorCode")
    public Long errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Resource")
    public String resource;

    @NameInMap("Success")
    public Boolean success;

    public static GetLogColumnTranslateResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetLogColumnTranslateResultResponseBody self = new GetLogColumnTranslateResultResponseBody();
        return TeaModel.build(map, self);
    }

    public GetLogColumnTranslateResultResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public GetLogColumnTranslateResultResponseBody setErrorCode(Long errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public Long getErrorCode() {
        return this.errorCode;
    }

    public GetLogColumnTranslateResultResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetLogColumnTranslateResultResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetLogColumnTranslateResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetLogColumnTranslateResultResponseBody setResource(String resource) {
        this.resource = resource;
        return this;
    }
    public String getResource() {
        return this.resource;
    }

    public GetLogColumnTranslateResultResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
