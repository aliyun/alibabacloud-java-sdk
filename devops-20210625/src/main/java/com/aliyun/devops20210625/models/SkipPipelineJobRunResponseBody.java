// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class SkipPipelineJobRunResponseBody extends TeaModel {
    @NameInMap("requestId")
    public String requestId;

    @NameInMap("errorMessage")
    public String errorMessage;

    @NameInMap("errorCode")
    public String errorCode;

    @NameInMap("success")
    public Boolean success;

    public static SkipPipelineJobRunResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SkipPipelineJobRunResponseBody self = new SkipPipelineJobRunResponseBody();
        return TeaModel.build(map, self);
    }

    public SkipPipelineJobRunResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SkipPipelineJobRunResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public SkipPipelineJobRunResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public SkipPipelineJobRunResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
