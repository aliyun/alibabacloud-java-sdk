// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mm_multiply20210901.models;

import com.aliyun.tea.*;

public class AddMallConfigResponseBody extends TeaModel {
    @NameInMap("Code")
    public Long code;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("IsConfigureSuccess")
    public Boolean isConfigureSuccess;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static AddMallConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddMallConfigResponseBody self = new AddMallConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public AddMallConfigResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public AddMallConfigResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public AddMallConfigResponseBody setIsConfigureSuccess(Boolean isConfigureSuccess) {
        this.isConfigureSuccess = isConfigureSuccess;
        return this;
    }
    public Boolean getIsConfigureSuccess() {
        return this.isConfigureSuccess;
    }

    public AddMallConfigResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AddMallConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddMallConfigResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
