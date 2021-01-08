// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops_rdc20200303.models;

import com.aliyun.tea.*;

public class CreateServiceConnectionResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Object")
    public Long object;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Success")
    public Boolean success;

    public static CreateServiceConnectionResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateServiceConnectionResponseBody self = new CreateServiceConnectionResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateServiceConnectionResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateServiceConnectionResponseBody setObject(Long object) {
        this.object = object;
        return this;
    }
    public Long getObject() {
        return this.object;
    }

    public CreateServiceConnectionResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public CreateServiceConnectionResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public CreateServiceConnectionResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
