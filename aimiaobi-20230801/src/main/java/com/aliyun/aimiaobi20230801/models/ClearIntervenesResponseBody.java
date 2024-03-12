// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class ClearIntervenesResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ClearIntervenesResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ClearIntervenesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ClearIntervenesResponseBody self = new ClearIntervenesResponseBody();
        return TeaModel.build(map, self);
    }

    public ClearIntervenesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ClearIntervenesResponseBody setData(ClearIntervenesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ClearIntervenesResponseBodyData getData() {
        return this.data;
    }

    public ClearIntervenesResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ClearIntervenesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ClearIntervenesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ClearIntervenesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ClearIntervenesResponseBodyData extends TeaModel {
        @NameInMap("FailIdList")
        public java.util.List<String> failIdList;

        @NameInMap("TaskId")
        public String taskId;

        public static ClearIntervenesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ClearIntervenesResponseBodyData self = new ClearIntervenesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ClearIntervenesResponseBodyData setFailIdList(java.util.List<String> failIdList) {
            this.failIdList = failIdList;
            return this;
        }
        public java.util.List<String> getFailIdList() {
            return this.failIdList;
        }

        public ClearIntervenesResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
