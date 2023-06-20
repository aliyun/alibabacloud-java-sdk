// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cs20151215.models;

import com.aliyun.tea.*;

public class DescribeTaskInfoResponseBody extends TeaModel {
    /**
     * <p>The ID of the ACK cluster.</p>
     */
    @NameInMap("cluster_id")
    public String clusterId;

    /**
     * <p>The time when the task was created.</p>
     */
    @NameInMap("created")
    public String created;

    @NameInMap("current_stage")
    public String currentStage;

    @NameInMap("error")
    public DescribeTaskInfoResponseBodyError error;

    @NameInMap("events")
    public java.util.List<DescribeTaskInfoResponseBodyEvents> events;

    @NameInMap("parameters")
    public java.util.Map<String, ?> parameters;

    @NameInMap("stages")
    public java.util.List<DescribeTaskInfoResponseBodyStages> stages;

    /**
     * <p>The state of the task. Valid values:</p>
     * <br>
     * <p>*   `running`: The task is running.</p>
     * <p>*   `fail`: The task failed.</p>
     * <p>*   `success`: The task is complete.</p>
     */
    @NameInMap("state")
    public String state;

    @NameInMap("target")
    public DescribeTaskInfoResponseBodyTarget target;

    /**
     * <p>The ID of the task.</p>
     */
    @NameInMap("task_id")
    public String taskId;

    /**
     * <p>The execution result of the task.</p>
     */
    @NameInMap("task_result")
    public java.util.List<DescribeTaskInfoResponseBodyTaskResult> taskResult;

    /**
     * <p>The task type. A value of `cluster_scaleout` indicates a scale-out task.</p>
     */
    @NameInMap("task_type")
    public String taskType;

    /**
     * <p>The time when the task was updated.</p>
     */
    @NameInMap("updated")
    public String updated;

    public static DescribeTaskInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeTaskInfoResponseBody self = new DescribeTaskInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeTaskInfoResponseBody setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public DescribeTaskInfoResponseBody setCreated(String created) {
        this.created = created;
        return this;
    }
    public String getCreated() {
        return this.created;
    }

    public DescribeTaskInfoResponseBody setCurrentStage(String currentStage) {
        this.currentStage = currentStage;
        return this;
    }
    public String getCurrentStage() {
        return this.currentStage;
    }

    public DescribeTaskInfoResponseBody setError(DescribeTaskInfoResponseBodyError error) {
        this.error = error;
        return this;
    }
    public DescribeTaskInfoResponseBodyError getError() {
        return this.error;
    }

    public DescribeTaskInfoResponseBody setEvents(java.util.List<DescribeTaskInfoResponseBodyEvents> events) {
        this.events = events;
        return this;
    }
    public java.util.List<DescribeTaskInfoResponseBodyEvents> getEvents() {
        return this.events;
    }

    public DescribeTaskInfoResponseBody setParameters(java.util.Map<String, ?> parameters) {
        this.parameters = parameters;
        return this;
    }
    public java.util.Map<String, ?> getParameters() {
        return this.parameters;
    }

    public DescribeTaskInfoResponseBody setStages(java.util.List<DescribeTaskInfoResponseBodyStages> stages) {
        this.stages = stages;
        return this;
    }
    public java.util.List<DescribeTaskInfoResponseBodyStages> getStages() {
        return this.stages;
    }

    public DescribeTaskInfoResponseBody setState(String state) {
        this.state = state;
        return this;
    }
    public String getState() {
        return this.state;
    }

    public DescribeTaskInfoResponseBody setTarget(DescribeTaskInfoResponseBodyTarget target) {
        this.target = target;
        return this;
    }
    public DescribeTaskInfoResponseBodyTarget getTarget() {
        return this.target;
    }

    public DescribeTaskInfoResponseBody setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public DescribeTaskInfoResponseBody setTaskResult(java.util.List<DescribeTaskInfoResponseBodyTaskResult> taskResult) {
        this.taskResult = taskResult;
        return this;
    }
    public java.util.List<DescribeTaskInfoResponseBodyTaskResult> getTaskResult() {
        return this.taskResult;
    }

    public DescribeTaskInfoResponseBody setTaskType(String taskType) {
        this.taskType = taskType;
        return this;
    }
    public String getTaskType() {
        return this.taskType;
    }

    public DescribeTaskInfoResponseBody setUpdated(String updated) {
        this.updated = updated;
        return this;
    }
    public String getUpdated() {
        return this.updated;
    }

    public static class DescribeTaskInfoResponseBodyError extends TeaModel {
        @NameInMap("code")
        public String code;

        @NameInMap("message")
        public String message;

        public static DescribeTaskInfoResponseBodyError build(java.util.Map<String, ?> map) throws Exception {
            DescribeTaskInfoResponseBodyError self = new DescribeTaskInfoResponseBodyError();
            return TeaModel.build(map, self);
        }

        public DescribeTaskInfoResponseBodyError setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public DescribeTaskInfoResponseBodyError setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

    public static class DescribeTaskInfoResponseBodyEvents extends TeaModel {
        @NameInMap("action")
        public String action;

        @NameInMap("level")
        public String level;

        @NameInMap("message")
        public String message;

        @NameInMap("reason")
        public String reason;

        @NameInMap("source")
        public String source;

        @NameInMap("timestamp")
        public String timestamp;

        public static DescribeTaskInfoResponseBodyEvents build(java.util.Map<String, ?> map) throws Exception {
            DescribeTaskInfoResponseBodyEvents self = new DescribeTaskInfoResponseBodyEvents();
            return TeaModel.build(map, self);
        }

        public DescribeTaskInfoResponseBodyEvents setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public DescribeTaskInfoResponseBodyEvents setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public DescribeTaskInfoResponseBodyEvents setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public DescribeTaskInfoResponseBodyEvents setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public DescribeTaskInfoResponseBodyEvents setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public DescribeTaskInfoResponseBodyEvents setTimestamp(String timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public String getTimestamp() {
            return this.timestamp;
        }

    }

    public static class DescribeTaskInfoResponseBodyStages extends TeaModel {
        @NameInMap("end_time")
        public String endTime;

        @NameInMap("message")
        public String message;

        @NameInMap("outputs")
        public java.util.Map<String, ?> outputs;

        @NameInMap("start_time")
        public String startTime;

        @NameInMap("state")
        public String state;

        public static DescribeTaskInfoResponseBodyStages build(java.util.Map<String, ?> map) throws Exception {
            DescribeTaskInfoResponseBodyStages self = new DescribeTaskInfoResponseBodyStages();
            return TeaModel.build(map, self);
        }

        public DescribeTaskInfoResponseBodyStages setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribeTaskInfoResponseBodyStages setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public DescribeTaskInfoResponseBodyStages setOutputs(java.util.Map<String, ?> outputs) {
            this.outputs = outputs;
            return this;
        }
        public java.util.Map<String, ?> getOutputs() {
            return this.outputs;
        }

        public DescribeTaskInfoResponseBodyStages setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeTaskInfoResponseBodyStages setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

    }

    public static class DescribeTaskInfoResponseBodyTarget extends TeaModel {
        @NameInMap("id")
        public String id;

        @NameInMap("type")
        public String type;

        public static DescribeTaskInfoResponseBodyTarget build(java.util.Map<String, ?> map) throws Exception {
            DescribeTaskInfoResponseBodyTarget self = new DescribeTaskInfoResponseBodyTarget();
            return TeaModel.build(map, self);
        }

        public DescribeTaskInfoResponseBodyTarget setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeTaskInfoResponseBodyTarget setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeTaskInfoResponseBodyTaskResult extends TeaModel {
        /**
         * <p>The resources that are managed by the task. For a scale-out task, the value of this parameter the ID of the instance that is added by the task.</p>
         */
        @NameInMap("data")
        public String data;

        /**
         * <p>The state of the scaling of the resource. Valid values:</p>
         * <br>
         * <p>*   `success`: The scale-out task is successful.</p>
         * <p>*   `failed`: The scale-out task failed.</p>
         * <p>*   `initail`: The scale-out task is initializing.</p>
         */
        @NameInMap("status")
        public String status;

        public static DescribeTaskInfoResponseBodyTaskResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeTaskInfoResponseBodyTaskResult self = new DescribeTaskInfoResponseBodyTaskResult();
            return TeaModel.build(map, self);
        }

        public DescribeTaskInfoResponseBodyTaskResult setData(String data) {
            this.data = data;
            return this;
        }
        public String getData() {
            return this.data;
        }

        public DescribeTaskInfoResponseBodyTaskResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

}
