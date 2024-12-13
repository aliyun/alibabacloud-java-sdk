// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataworks_public20200518.models;

import com.aliyun.tea.*;

public class GetMetaTableProducingTasksResponseBody extends TeaModel {
    /**
     * <p>The output tasks of the metatable.</p>
     */
    @NameInMap("Data")
    public java.util.List<GetMetaTableProducingTasksResponseBodyData> data;

    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;0&quot;</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("ErrorMessage")
    public String errorMessage;

    /**
     * <p>The HTTP status code returned.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>00000-00000-00000-00000</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values: true and false. The value true indicates that the request was successful. The value false indicates that the request failed.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
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
        /**
         * <p>The ID of the output task.</p>
         * 
         * <strong>example:</strong>
         * <p>9876543210</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <p>The name of the output task.</p>
         */
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
