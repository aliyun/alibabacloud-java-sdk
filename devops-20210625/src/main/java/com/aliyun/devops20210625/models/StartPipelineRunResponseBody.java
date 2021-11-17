// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.devops20210625.models;

import com.aliyun.tea.*;

public class StartPipelineRunResponseBody extends TeaModel {
    // 错误码
    @NameInMap("errorCode")
    public String errorCode;

    // 错误信息
    @NameInMap("errorMessage")
    public String errorMessage;

    // 流水线运行实例id
    @NameInMap("pipelineRunId")
    public Long pipelineRunId;

    // 请求id，每次请求都是唯一值，便于后续排查问题
    @NameInMap("requestId")
    public String requestId;

    // true 接口调用成功，false 接口调用失败
    @NameInMap("success")
    public Boolean success;

    public static StartPipelineRunResponseBody build(java.util.Map<String, ?> map) throws Exception {
        StartPipelineRunResponseBody self = new StartPipelineRunResponseBody();
        return TeaModel.build(map, self);
    }

    public StartPipelineRunResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public StartPipelineRunResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public StartPipelineRunResponseBody setPipelineRunId(Long pipelineRunId) {
        this.pipelineRunId = pipelineRunId;
        return this;
    }
    public Long getPipelineRunId() {
        return this.pipelineRunId;
    }

    public StartPipelineRunResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public StartPipelineRunResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

}
