// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiccs20230516.models;

import com.aliyun.tea.*;

public class EditTaskResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("Code")
    public Long code;

    /**
     * <strong>example:</strong>
     * <p>示例值示例值</p>
     */
    @NameInMap("Message")
    public String message;

    @NameInMap("Model")
    public EditTaskResponseBodyModel model;

    /**
     * <strong>example:</strong>
     * <p>5453cc9b-02bc-4dbb-9527-f28a9100b912</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>1686225227338</p>
     */
    @NameInMap("Timestamp")
    public Long timestamp;

    public static EditTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EditTaskResponseBody self = new EditTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public EditTaskResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public EditTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public EditTaskResponseBody setModel(EditTaskResponseBodyModel model) {
        this.model = model;
        return this;
    }
    public EditTaskResponseBodyModel getModel() {
        return this.model;
    }

    public EditTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public EditTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public EditTaskResponseBody setTimestamp(Long timestamp) {
        this.timestamp = timestamp;
        return this;
    }
    public Long getTimestamp() {
        return this.timestamp;
    }

    public static class EditTaskResponseBodyModel extends TeaModel {
        /**
         * <p>任务ID</p>
         * 
         * <strong>example:</strong>
         * <p>92</p>
         */
        @NameInMap("TaskId")
        public Long taskId;

        public static EditTaskResponseBodyModel build(java.util.Map<String, ?> map) throws Exception {
            EditTaskResponseBodyModel self = new EditTaskResponseBodyModel();
            return TeaModel.build(map, self);
        }

        public EditTaskResponseBodyModel setTaskId(Long taskId) {
            this.taskId = taskId;
            return this;
        }
        public Long getTaskId() {
            return this.taskId;
        }

    }

}
