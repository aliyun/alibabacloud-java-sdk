// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetMetaTableProducingTasksResponseBody extends TeaModel {
    @NameInMap("Data")
    public java.util.List<GetMetaTableProducingTasksResponseBodyData> data;

    @NameInMap("ErrorCode")
    public String errorCode;

    @NameInMap("ErrorMessage")
    public String errorMessage;

    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetMetaTableProducingTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMetaTableProducingTasksResponseBody self = new GetMetaTableProducingTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMetaTableProducingTasksResponseBody setData(java.util.List<GetMetaTableProducingTasksResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<GetMetaTableProducingTasksResponseBodyData> getData() {
        return this.data;
    }

    public GetMetaTableProducingTasksResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetMetaTableProducingTasksResponseBody setErrorMessage(String errorMessage) {
        this.errorMessage = errorMessage;
        return this;
    }
    public String getErrorMessage() {
        return this.errorMessage;
    }

    public GetMetaTableProducingTasksResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetMetaTableProducingTasksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetMetaTableProducingTasksResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetMetaTableProducingTasksResponseBodyData extends TeaModel {
        @NameInMap("TaskId")
        public String taskId;

        @NameInMap("TaskName")
        public String taskName;

        public static GetMetaTableProducingTasksResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetMetaTableProducingTasksResponseBodyData self = new GetMetaTableProducingTasksResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetMetaTableProducingTasksResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public GetMetaTableProducingTasksResponseBodyData setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

    }

}
