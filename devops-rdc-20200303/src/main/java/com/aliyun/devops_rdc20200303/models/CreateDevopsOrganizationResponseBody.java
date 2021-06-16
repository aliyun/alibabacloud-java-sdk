// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops_rdc20200303.models;

import com.aliyun.tea.*;

public class CreateDevopsOrganizationResponseBody extends TeaModel {
    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Object")
    public String object;

    @NameInMap("Success")
    public Boolean success;

    @NameInMap("ErrorCode")
    public String errorCode;

    public static CreateDevopsOrganizationResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateDevopsOrganizationResponseBody self = new CreateDevopsOrganizationResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateDevopsOrganizationResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public CreateDevopsOrganizationResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateDevopsOrganizationResponseBody setObject(String object) {
        this.object = object;
        return this;
    }
    public String getObject() {
        return this.object;
    }

    public CreateDevopsOrganizationResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public CreateDevopsOrganizationResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

}
