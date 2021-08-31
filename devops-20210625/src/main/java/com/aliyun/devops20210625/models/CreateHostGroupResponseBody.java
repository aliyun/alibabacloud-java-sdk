// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class CreateHostGroupResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("errorMessage")
    public String errorMessage;

    @NameInMap("errorCode")
    public String errorCode;

    @NameInMap("success")
    public Boolean success;

    @NameInMap("hostGroupId")
    public Long hostGroupId;

    public static CreateHostGroupResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateHostGroupResponseBody self = new CreateHostGroupResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateHostGroupResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateHostGroupResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public CreateHostGroupResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public CreateHostGroupResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public CreateHostGroupResponseBody setHostGroupId(Long hostGroupId) {
        this.hostGroupId = hostGroupId;
        return this;
    }
    public Long getHostGroupId() {
        return this.hostGroupId;
    }

}
