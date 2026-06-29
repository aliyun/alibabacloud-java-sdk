// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ExecuteAdHocTaskResponseBody extends TeaModel {
    /**
     * <p>The error code. A value of OK indicates that the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The execution result.</p>
     */
    @NameInMap("ExecuteResult")
    public ExecuteAdHocTaskResponseBodyExecuteResult executeResult;

    /**
     * <p>The HTTP status code returned by the backend.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The error message.</p>
     * 
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>75DD06F8-1661-5A6E-B0A6-7E23133BDC60</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ExecuteAdHocTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ExecuteAdHocTaskResponseBody self = new ExecuteAdHocTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public ExecuteAdHocTaskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ExecuteAdHocTaskResponseBody setExecuteResult(ExecuteAdHocTaskResponseBodyExecuteResult executeResult) {
        this.executeResult = executeResult;
        return this;
    }
    public ExecuteAdHocTaskResponseBodyExecuteResult getExecuteResult() {
        return this.executeResult;
    }

    public ExecuteAdHocTaskResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ExecuteAdHocTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ExecuteAdHocTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ExecuteAdHocTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ExecuteAdHocTaskResponseBodyExecuteResult extends TeaModel {
        /**
         * <p>The number of subtasks split from the parsed task.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("SubTaskCount")
        public Integer subTaskCount;

        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>MaxCompute_SQL_300000843_1611548758327</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        public static ExecuteAdHocTaskResponseBodyExecuteResult build(java.util.Map<String, ?> map) throws Exception {
            ExecuteAdHocTaskResponseBodyExecuteResult self = new ExecuteAdHocTaskResponseBodyExecuteResult();
            return TeaModel.build(map, self);
        }

        public ExecuteAdHocTaskResponseBodyExecuteResult setSubTaskCount(Integer subTaskCount) {
            this.subTaskCount = subTaskCount;
            return this;
        }
        public Integer getSubTaskCount() {
            return this.subTaskCount;
        }

        public ExecuteAdHocTaskResponseBodyExecuteResult setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
