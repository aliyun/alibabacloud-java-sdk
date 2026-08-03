// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class CreateGenerateAICoachScriptTaskResponseBody extends TeaModel {
    @NameInMap("data")
    public CreateGenerateAICoachScriptTaskResponseBodyData data;

    @NameInMap("errorCode")
    public String errorCode;

    @NameInMap("errorMessage")
    public String errorMessage;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("success")
    public Boolean success;

    public static CreateGenerateAICoachScriptTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateGenerateAICoachScriptTaskResponseBody self = new CreateGenerateAICoachScriptTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateGenerateAICoachScriptTaskResponseBody setData(CreateGenerateAICoachScriptTaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateGenerateAICoachScriptTaskResponseBodyData getData() {
        return this.data;
    }

    public CreateGenerateAICoachScriptTaskResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public CreateGenerateAICoachScriptTaskResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public CreateGenerateAICoachScriptTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateGenerateAICoachScriptTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateGenerateAICoachScriptTaskResponseBodyData extends TeaModel {
        @NameInMap("taskId")
        public String taskId;

        public static CreateGenerateAICoachScriptTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateGenerateAICoachScriptTaskResponseBodyData self = new CreateGenerateAICoachScriptTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateGenerateAICoachScriptTaskResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
