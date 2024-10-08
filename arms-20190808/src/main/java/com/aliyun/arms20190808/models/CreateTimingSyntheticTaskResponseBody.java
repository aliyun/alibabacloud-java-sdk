// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class CreateTimingSyntheticTaskResponseBody extends TeaModel {
    /**
     * <p>The HTTP status code returned. The status code 200 indicates that the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Long code;

    /**
     * <p>The struct returned.</p>
     */
    @NameInMap("Data")
    public CreateTimingSyntheticTaskResponseBodyData data;

    /**
     * <p>The message returned.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>53B5874D-EBC1-5567-B787-E4B7267F5CEB</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful. Valid values: true and false.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static CreateTimingSyntheticTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateTimingSyntheticTaskResponseBody self = new CreateTimingSyntheticTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateTimingSyntheticTaskResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public CreateTimingSyntheticTaskResponseBody setData(CreateTimingSyntheticTaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public CreateTimingSyntheticTaskResponseBodyData getData() {
        return this.data;
    }

    public CreateTimingSyntheticTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CreateTimingSyntheticTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateTimingSyntheticTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class CreateTimingSyntheticTaskResponseBodyData extends TeaModel {
        /**
         * <p>The task status. Valid values:</p>
         * <ul>
         * <li>INIT: The task is in the initial state.</li>
         * <li>RELEASE: The task is being parsed.</li>
         * <li>RUNNING: The task is running.</li>
         * <li>STOP: The task is suspended.</li>
         * <li>SYSTEM_STOP: The task is suspended by the system.</li>
         * <li>CANCEL: The task is canceled.</li>
         * <li>SYSTEM_CANCEL: The task is canceled by the system.</li>
         * <li>DONE: The task is complete.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The ID of the synthetic monitoring task.</p>
         * 
         * <strong>example:</strong>
         * <p>5308a2691f59422c8c3b7aeccec9cd3b</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        public static CreateTimingSyntheticTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            CreateTimingSyntheticTaskResponseBodyData self = new CreateTimingSyntheticTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public CreateTimingSyntheticTaskResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public CreateTimingSyntheticTaskResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

    }

}
