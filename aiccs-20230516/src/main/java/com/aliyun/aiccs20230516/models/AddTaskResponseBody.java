// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20230516.models;

import com.aliyun.tea.*;

public class AddTaskResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Code")
    public Long code;

    /**
     * <strong>example:</strong>
     * <p>示例值</p>
     */
    @NameInMap("Message")
    public String message;

    @NameInMap("Model")
    public AddTaskResponseBodyModel model;

    /**
     * <strong>example:</strong>
     * <p>5453cc9b-02bc-4dbb-9527-f28a9100b912</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>1686225227338</p>
     */
    @NameInMap("Timestamp")
    public Long timestamp;

    public static AddTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        AddTaskResponseBody self = new AddTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public AddTaskResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public AddTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public AddTaskResponseBody setModel(AddTaskResponseBodyModel model) {
        this.model = model;
        return this;
    }
    public AddTaskResponseBodyModel getModel() {
        return this.model;
    }

    public AddTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public AddTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public AddTaskResponseBody setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    public Long getTimestamp() {
        return this.timestamp;
    }

    public static class AddTaskResponseBodyModel extends TeaModel {
        /**
         * <p>任务ID</p>
         * 
         * <strong>example:</strong>
         * <p>47</p>
         */
        @NameInMap("TaskId")
        public Long taskId;

        public static AddTaskResponseBodyModel build(java.util.Map<String, ?> map) throws Exception {
            AddTaskResponseBodyModel self = new AddTaskResponseBodyModel();
            return TeaModel.build(map, self);
        }

        public AddTaskResponseBodyModel setTaskId(Long taskId) {
            this.taskId = taskId;
            return this;
        }
        public Long getTaskId() {
            return this.taskId;
        }

    }

}
