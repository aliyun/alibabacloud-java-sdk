// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentcore20260804.models;

import com.aliyun.tea.*;

public class AddMemoriesResponseBody extends TeaModel {
    /**
     * <p>The business status code.</p>
     * 
     * <strong>example:</strong>
     * <p>SUCCESS</p>
     */
    @NameInMap("code")
    public String code;

    /**
     * <p>The result of the write operation.</p>
     */
    @NameInMap("data")
    public AddMemoriesResponseBodyData data;

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
     * <p>The ID of the request.</p>
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

    public static AddMemoriesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddMemoriesResponseBody self = new AddMemoriesResponseBody();
        return TeaModel.build(map, self);
    }

    public AddMemoriesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public AddMemoriesResponseBody setData(AddMemoriesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public AddMemoriesResponseBodyData getData() {
        return this.data;
    }

    public AddMemoriesResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public AddMemoriesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AddMemoriesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddMemoriesResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class AddMemoriesResponseBodyDataMemories extends TeaModel {
        /**
         * <p>The ID of the long-term memory.</p>
         * 
         * <strong>example:</strong>
         * <p>mem-2f5f9c5a8d0e4c3b</p>
         */
        @NameInMap("memoryId")
        public String memoryId;

        public static AddMemoriesResponseBodyDataMemories build(java.util.Map<String, ?> map) throws Exception {
            AddMemoriesResponseBodyDataMemories self = new AddMemoriesResponseBodyDataMemories();
            return TeaModel.build(map, self);
        }

        public AddMemoriesResponseBodyDataMemories setMemoryId(String memoryId) {
            this.memoryId = memoryId;
            return this;
        }
        public String getMemoryId() {
            return this.memoryId;
        }

    }

    public static class AddMemoriesResponseBodyData extends TeaModel {
        /**
         * <p>The memory references returned only when sync is set to true. An empty array is allowed. This parameter is not returned together with taskId.</p>
         */
        @NameInMap("memories")
        public java.util.List<AddMemoriesResponseBodyDataMemories> memories;

        /**
         * <p>The ID of the task returned only when sync is set to false. This parameter is not returned together with memories.</p>
         * 
         * <strong>example:</strong>
         * <p>task-2f5f9c5a8d0e4c3b</p>
         */
        @NameInMap("taskId")
        public String taskId;

        public static AddMemoriesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            AddMemoriesResponseBodyData self = new AddMemoriesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public AddMemoriesResponseBodyData setMemories(java.util.List<AddMemoriesResponseBodyDataMemories> memories) {
            this.memories = memories;
            return this;
        }
        public java.util.List<AddMemoriesResponseBodyDataMemories> getMemories() {
            return this.memories;
        }

        public AddMemoriesResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
