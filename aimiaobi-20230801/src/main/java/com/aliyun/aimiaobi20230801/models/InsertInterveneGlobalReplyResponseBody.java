// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class InsertInterveneGlobalReplyResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public InsertInterveneGlobalReplyResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static InsertInterveneGlobalReplyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        InsertInterveneGlobalReplyResponseBody self = new InsertInterveneGlobalReplyResponseBody();
        return TeaModel.build(map, self);
    }

    public InsertInterveneGlobalReplyResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public InsertInterveneGlobalReplyResponseBody setData(InsertInterveneGlobalReplyResponseBodyData data) {
        this.data = data;
        return this;
    }
    public InsertInterveneGlobalReplyResponseBodyData getData() {
        return this.data;
    }

    public InsertInterveneGlobalReplyResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public InsertInterveneGlobalReplyResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public InsertInterveneGlobalReplyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public InsertInterveneGlobalReplyResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class InsertInterveneGlobalReplyResponseBodyData extends TeaModel {
        @NameInMap("FailIdList")
        public java.util.List<String> failIdList;

        @NameInMap("TaskId")
        public String taskId;

        public static InsertInterveneGlobalReplyResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            InsertInterveneGlobalReplyResponseBodyData self = new InsertInterveneGlobalReplyResponseBodyData();
            return TeaModel.build(map, self);
        }

        public InsertInterveneGlobalReplyResponseBodyData setFailIdList(java.util.List<String> failIdList) {
            this.failIdList = failIdList;
            return this;
        }
        public java.util.List<String> getFailIdList() {
            return this.failIdList;
        }

        public InsertInterveneGlobalReplyResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
