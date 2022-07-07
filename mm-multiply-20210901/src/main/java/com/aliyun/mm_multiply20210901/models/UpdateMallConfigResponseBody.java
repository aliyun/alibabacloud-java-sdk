// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mm_multiply20210901.models;

import com.aliyun.tea.*;

public class UpdateMallConfigResponseBody extends TeaModel {
    @NameInMap("Code")
    public Long code;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("IsConfigureSuccess")
    public Boolean isConfigureSuccess;

    @NameInMap("Message")
    public String message;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static UpdateMallConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateMallConfigResponseBody self = new UpdateMallConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateMallConfigResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public UpdateMallConfigResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public UpdateMallConfigResponseBody setIsConfigureSuccess(Boolean isConfigureSuccess) {
        this.isConfigureSuccess = isConfigureSuccess;
        return this;
    }
    public Boolean getIsConfigureSuccess() {
        return this.isConfigureSuccess;
    }

    public UpdateMallConfigResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public UpdateMallConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateMallConfigResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
