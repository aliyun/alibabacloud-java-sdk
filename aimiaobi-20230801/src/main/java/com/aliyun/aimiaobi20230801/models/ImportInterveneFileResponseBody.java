// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class ImportInterveneFileResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ImportInterveneFileResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ImportInterveneFileResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ImportInterveneFileResponseBody self = new ImportInterveneFileResponseBody();
        return TeaModel.build(map, self);
    }

    public ImportInterveneFileResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ImportInterveneFileResponseBody setData(ImportInterveneFileResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ImportInterveneFileResponseBodyData getData() {
        return this.data;
    }

    public ImportInterveneFileResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ImportInterveneFileResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ImportInterveneFileResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ImportInterveneFileResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ImportInterveneFileResponseBodyData extends TeaModel {
        @NameInMap("FailIdList")
        public java.util.List<String> failIdList;

        @NameInMap("TaskId")
        public String taskId;

        public static ImportInterveneFileResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ImportInterveneFileResponseBodyData self = new ImportInterveneFileResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ImportInterveneFileResponseBodyData setFailIdList(java.util.List<String> failIdList) {
            this.failIdList = failIdList;
            return this;
        }
        public java.util.List<String> getFailIdList() {
            return this.failIdList;
        }

        public ImportInterveneFileResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
