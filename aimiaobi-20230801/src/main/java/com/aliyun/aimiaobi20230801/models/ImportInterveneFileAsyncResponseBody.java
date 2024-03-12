// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class ImportInterveneFileAsyncResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ImportInterveneFileAsyncResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ImportInterveneFileAsyncResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ImportInterveneFileAsyncResponseBody self = new ImportInterveneFileAsyncResponseBody();
        return TeaModel.build(map, self);
    }

    public ImportInterveneFileAsyncResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ImportInterveneFileAsyncResponseBody setData(ImportInterveneFileAsyncResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ImportInterveneFileAsyncResponseBodyData getData() {
        return this.data;
    }

    public ImportInterveneFileAsyncResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ImportInterveneFileAsyncResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ImportInterveneFileAsyncResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ImportInterveneFileAsyncResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ImportInterveneFileAsyncResponseBodyData extends TeaModel {
        @NameInMap("FailIdList")
        public java.util.List<String> failIdList;

        @NameInMap("TaskId")
        public String taskId;

        public static ImportInterveneFileAsyncResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ImportInterveneFileAsyncResponseBodyData self = new ImportInterveneFileAsyncResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ImportInterveneFileAsyncResponseBodyData setFailIdList(java.util.List<String> failIdList) {
            this.failIdList = failIdList;
            return this;
        }
        public java.util.List<String> getFailIdList() {
            return this.failIdList;
        }

        public ImportInterveneFileAsyncResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
