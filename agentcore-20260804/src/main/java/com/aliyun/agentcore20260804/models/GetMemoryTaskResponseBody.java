// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class GetMemoryTaskResponseBody extends TeaModel {
    /**
     * <p>The business status code.</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The task details.</p>
     */
    @NameInMap("data")
    public GetMemoryTaskResponseBodyData data;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("httpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>01A00000-0000-0000-0000-000000000001</p>
     */
    @NameInMap("requestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     */
    @NameInMap("success")
    public Boolean success;

    public static GetMemoryTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMemoryTaskResponseBody self = new GetMemoryTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMemoryTaskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetMemoryTaskResponseBody setData(GetMemoryTaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetMemoryTaskResponseBodyData getData() {
        return this.data;
    }

    public GetMemoryTaskResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetMemoryTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetMemoryTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetMemoryTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetMemoryTaskResponseBodyDataError extends TeaModel {
        /**
         * <p>The task error code.</p>
         * 
         * <strong>example:</strong>
         * <p>UnknownError</p>
         */
        @NameInMap("code")
        public String code;

        /**
         * <p>The task error message.</p>
         * 
         * <strong>example:</strong>
         * <p>Memory extraction failed.</p>
         */
        @NameInMap("message")
        public String message;

        public static GetMemoryTaskResponseBodyDataError build(java.util.Map<String, ?> map) throws Exception {
            GetMemoryTaskResponseBodyDataError self = new GetMemoryTaskResponseBodyDataError();
            return TeaModel.build(map, self);
        }

        public GetMemoryTaskResponseBodyDataError setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public GetMemoryTaskResponseBodyDataError setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

    public static class GetMemoryTaskResponseBodyDataMemories extends TeaModel {
        /**
         * <p>The long-term memory ID.</p>
         * 
         * <strong>example:</strong>
         * <p>mem-2f5f9c5a8d0e4c3b</p>
         */
        @NameInMap("memoryId")
        public String memoryId;

        public static GetMemoryTaskResponseBodyDataMemories build(java.util.Map<String, ?> map) throws Exception {
            GetMemoryTaskResponseBodyDataMemories self = new GetMemoryTaskResponseBodyDataMemories();
            return TeaModel.build(map, self);
        }

        public GetMemoryTaskResponseBodyDataMemories setMemoryId(String memoryId) {
            this.memoryId = memoryId;
            return this;
        }
        public String getMemoryId() {
            return this.memoryId;
        }

    }

    public static class GetMemoryTaskResponseBodyData extends TeaModel {
        /**
         * <p>The task error returned only when the status is FAILED or UNKNOWN. This does not indicate that the current query failed.</p>
         */
        @NameInMap("error")
        public GetMemoryTaskResponseBodyDataError error;

        /**
         * <p>The memories returned only when the status is SUCCEEDED. An empty array is allowed.</p>
         */
        @NameInMap("memories")
        public java.util.List<GetMemoryTaskResponseBodyDataMemories> memories;

        /**
         * <p>The extraction task status.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>SUCCEEDED</p>
         */
        @NameInMap("status")
        public String status;

        /**
         * <p>The task ID.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>task-2f5f9c5a8d0e4c3b</p>
         */
        @NameInMap("taskId")
        public String taskId;

        public static GetMemoryTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetMemoryTaskResponseBodyData self = new GetMemoryTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetMemoryTaskResponseBodyData setError(GetMemoryTaskResponseBodyDataError error) {
            this.error = error;
            return this;
        }
        public GetMemoryTaskResponseBodyDataError getError() {
            return this.error;
        }

        public GetMemoryTaskResponseBodyData setMemories(java.util.List<GetMemoryTaskResponseBodyDataMemories> memories) {
            this.memories = memories;
            return this;
        }
        public java.util.List<GetMemoryTaskResponseBodyDataMemories> getMemories() {
            return this.memories;
        }

        public GetMemoryTaskResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetMemoryTaskResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
