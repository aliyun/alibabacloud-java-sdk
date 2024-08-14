// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class GenerateImageTaskResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GenerateImageTaskResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>F2F366D6-E9FE-1006-BB70-2C650896AAB5</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GenerateImageTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GenerateImageTaskResponseBody self = new GenerateImageTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public GenerateImageTaskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GenerateImageTaskResponseBody setData(GenerateImageTaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GenerateImageTaskResponseBodyData getData() {
        return this.data;
    }

    public GenerateImageTaskResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GenerateImageTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GenerateImageTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GenerateImageTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GenerateImageTaskResponseBodyDataTaskList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>一直忧伤的猫</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <strong>example:</strong>
         * <p>e1be065b-adc3-435e-bd01-1c18c5ed75d3</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <strong>example:</strong>
         * <p>SUCCESSED</p>
         */
        @NameInMap("TaskStatus")
        public String taskStatus;

        public static GenerateImageTaskResponseBodyDataTaskList build(java.util.Map<String, ?> map) throws Exception {
            GenerateImageTaskResponseBodyDataTaskList self = new GenerateImageTaskResponseBodyDataTaskList();
            return TeaModel.build(map, self);
        }

        public GenerateImageTaskResponseBodyDataTaskList setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public GenerateImageTaskResponseBodyDataTaskList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GenerateImageTaskResponseBodyDataTaskList setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public GenerateImageTaskResponseBodyDataTaskList setTaskStatus(String taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }
        public String getTaskStatus() {
            return this.taskStatus;
        }

    }

    public static class GenerateImageTaskResponseBodyData extends TeaModel {
        @NameInMap("TaskList")
        public java.util.List<GenerateImageTaskResponseBodyDataTaskList> taskList;

        public static GenerateImageTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GenerateImageTaskResponseBodyData self = new GenerateImageTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GenerateImageTaskResponseBodyData setTaskList(java.util.List<GenerateImageTaskResponseBodyDataTaskList> taskList) {
            this.taskList = taskList;
            return this;
        }
        public java.util.List<GenerateImageTaskResponseBodyDataTaskList> getTaskList() {
            return this.taskList;
        }

    }

}
