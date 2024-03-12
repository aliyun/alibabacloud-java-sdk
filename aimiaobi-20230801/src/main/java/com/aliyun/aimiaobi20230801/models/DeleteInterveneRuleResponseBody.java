// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class DeleteInterveneRuleResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public DeleteInterveneRuleResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static DeleteInterveneRuleResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DeleteInterveneRuleResponseBody self = new DeleteInterveneRuleResponseBody();
        return TeaModel.build(map, self);
    }

    public DeleteInterveneRuleResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DeleteInterveneRuleResponseBody setData(DeleteInterveneRuleResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DeleteInterveneRuleResponseBodyData getData() {
        return this.data;
    }

    public DeleteInterveneRuleResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public DeleteInterveneRuleResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DeleteInterveneRuleResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DeleteInterveneRuleResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class DeleteInterveneRuleResponseBodyData extends TeaModel {
        @NameInMap("FailIdList")
        public java.util.List<String> failIdList;

        @NameInMap("TaskId")
        public String taskId;

        public static DeleteInterveneRuleResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DeleteInterveneRuleResponseBodyData self = new DeleteInterveneRuleResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DeleteInterveneRuleResponseBodyData setFailIdList(java.util.List<String> failIdList) {
            this.failIdList = failIdList;
            return this;
        }
        public java.util.List<String> getFailIdList() {
            return this.failIdList;
        }

        public DeleteInterveneRuleResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
