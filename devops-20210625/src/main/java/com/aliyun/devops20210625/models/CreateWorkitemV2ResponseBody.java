// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class CreateWorkitemV2ResponseBody extends TeaModel {
    @NameInMap("errorCode")
    public String errorCode;

    @NameInMap("errorMessage")
    public String errorMessage;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("success")
    public String success;

    @NameInMap("workitemIdentifier")
    public String workitemIdentifier;

    public static CreateWorkitemV2ResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateWorkitemV2ResponseBody self = new CreateWorkitemV2ResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateWorkitemV2ResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public CreateWorkitemV2ResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public CreateWorkitemV2ResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateWorkitemV2ResponseBody setSuccess(String success) {
        this.success = success;
        return this;
    }
    public String getSuccess() {
        return this.success;
    }

    public CreateWorkitemV2ResponseBody setWorkitemIdentifier(String workitemIdentifier) {
        this.workitemIdentifier = workitemIdentifier;
        return this;
    }
    public String getWorkitemIdentifier() {
        return this.workitemIdentifier;
    }

}
