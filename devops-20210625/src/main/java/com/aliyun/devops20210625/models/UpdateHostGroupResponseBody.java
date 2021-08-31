// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class UpdateHostGroupResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("errorMessage")
    public String errorMessage;

    @NameInMap("errorCode")
    public String errorCode;

    @NameInMap("success")
    public Boolean success;

    public static UpdateHostGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        UpdateHostGroupResponseBody self = new UpdateHostGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public UpdateHostGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public UpdateHostGroupResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public UpdateHostGroupResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public UpdateHostGroupResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
