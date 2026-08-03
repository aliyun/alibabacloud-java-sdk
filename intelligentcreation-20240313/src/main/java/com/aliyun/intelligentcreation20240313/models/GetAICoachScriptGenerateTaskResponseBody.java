// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240313.models;

import com.aliyun.tea.*;

public class GetAICoachScriptGenerateTaskResponseBody extends TeaModel {
    @NameInMap("data")
    public GetAICoachScriptGenerateTaskResponseBodyData data;

    @NameInMap("errorCode")
    public String errorCode;

    @NameInMap("errorMessage")
    public String errorMessage;

    @NameInMap("requestId")
    public String requestId;

    @NameInMap("success")
    public Boolean success;

    public static GetAICoachScriptGenerateTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetAICoachScriptGenerateTaskResponseBody self = new GetAICoachScriptGenerateTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public GetAICoachScriptGenerateTaskResponseBody setData(GetAICoachScriptGenerateTaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetAICoachScriptGenerateTaskResponseBodyData getData() {
        return this.data;
    }

    public GetAICoachScriptGenerateTaskResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetAICoachScriptGenerateTaskResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetAICoachScriptGenerateTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetAICoachScriptGenerateTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetAICoachScriptGenerateTaskResponseBodyData extends TeaModel {
        @NameInMap("scriptRecordId")
        public String scriptRecordId;

        @NameInMap("status")
        public String status;

        @NameInMap("taskId")
        public String taskId;

        @NameInMap("totalTokens")
        public Long totalTokens;

        public static GetAICoachScriptGenerateTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetAICoachScriptGenerateTaskResponseBodyData self = new GetAICoachScriptGenerateTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetAICoachScriptGenerateTaskResponseBodyData setScriptRecordId(String scriptRecordId) {
            this.scriptRecordId = scriptRecordId;
            return this;
        }
        public String getScriptRecordId() {
            return this.scriptRecordId;
        }

        public GetAICoachScriptGenerateTaskResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetAICoachScriptGenerateTaskResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public GetAICoachScriptGenerateTaskResponseBodyData setTotalTokens(Long totalTokens) {
            this.totalTokens = totalTokens;
            return this;
        }
        public Long getTotalTokens() {
            return this.totalTokens;
        }

    }

}
