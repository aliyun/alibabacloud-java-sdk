// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class RetryPipelineJobRunResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("errorMessage")
    public String errorMessage;

    @NameInMap("errorCode")
    public String errorCode;

    @NameInMap("success")
    public Boolean success;

    public static RetryPipelineJobRunResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RetryPipelineJobRunResponseBody self = new RetryPipelineJobRunResponseBody();
        return TeaModel.build(map, self);
    }

    public RetryPipelineJobRunResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RetryPipelineJobRunResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public RetryPipelineJobRunResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public RetryPipelineJobRunResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
