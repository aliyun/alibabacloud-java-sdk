// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops_rdc20200303.models;

import com.aliyun.tea.*;

public class GetPipelineInstanceStatusResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("Object")
    public String object;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("Success")
    public Boolean success;

    public static GetPipelineInstanceStatusResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetPipelineInstanceStatusResponseBody self = new GetPipelineInstanceStatusResponseBody();
        return TeaModel.build(map, self);
    }

    public GetPipelineInstanceStatusResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetPipelineInstanceStatusResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetPipelineInstanceStatusResponseBody setObject(String object) {
        this.object = object;
        return this;
    }
    public String getObject() {
        return this.object;
    }

    public GetPipelineInstanceStatusResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetPipelineInstanceStatusResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
