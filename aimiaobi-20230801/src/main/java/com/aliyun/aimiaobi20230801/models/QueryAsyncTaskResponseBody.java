// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class QueryAsyncTaskResponseBody extends TeaModel {
    /**
     * <p>Status code</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Business data</p>
     */
    @NameInMap("Data")
    public QueryAsyncTaskResponseBodyData data;

    /**
     * <p>HTTP status code</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>Error description</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Unique request ID</p>
     * 
     * <strong>example:</strong>
     * <p>867C4ABE-4381-5BC2-9810-5A5F334F71CF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Success status: true for success, false for failure.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static QueryAsyncTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryAsyncTaskResponseBody self = new QueryAsyncTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryAsyncTaskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public QueryAsyncTaskResponseBody setData(QueryAsyncTaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public QueryAsyncTaskResponseBodyData getData() {
        return this.data;
    }

    public QueryAsyncTaskResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public QueryAsyncTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public QueryAsyncTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryAsyncTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class QueryAsyncTaskResponseBodyData extends TeaModel {
        /**
         * <p>Creation date</p>
         * 
         * <strong>example:</strong>
         * <p>2021-07-25 14:34:33</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>Creator</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;12121&quot;</p>
         */
        @NameInMap("CreateUser")
        public String createUser;

        /**
         * <p>Task ID, indicates the specific task.</p>
         * 
         * <strong>example:</strong>
         * <p>MaterialDocumentUpload</p>
         */
        @NameInMap("TaskCode")
        public String taskCode;

        /**
         * <p>Task execution error message</p>
         * 
         * <strong>example:</strong>
         * <p>error</p>
         */
        @NameInMap("TaskErrorMessage")
        public String taskErrorMessage;

        /**
         * <p>Unique task ID</p>
         * 
         * <strong>example:</strong>
         * <p>3f7045e099474ba28ceca1b4eb6d6e21</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <p>Intermediate task execution result. When a task has multiple steps, save the output of each step here. When resuming from a pause, read the intermediate result and continue from there.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;{}&quot;</p>
         */
        @NameInMap("TaskIntermediateResult")
        public String taskIntermediateResult;

        /**
         * <p>Task name</p>
         * 
         * <strong>example:</strong>
         * <p>任务名称</p>
         */
        @NameInMap("TaskName")
        public String taskName;

        /**
         * <p>Task execution input parameters, JSON format</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;{\&quot;fileKey\&quot;:\&quot;oss://default/xxxx/xxxx/xxx\&quot;,\&quot;fileName\&quot;:\&quot;xxxxx.doc\&quot;}&quot;</p>
         */
        @NameInMap("TaskParam")
        public String taskParam;

        /**
         * <p>Task execution progress message</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;{}&quot;</p>
         */
        @NameInMap("TaskProgressMessage")
        public String taskProgressMessage;

        /**
         * <p>Task execution result message</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;{}&quot;</p>
         */
        @NameInMap("TaskResult")
        public String taskResult;

        /**
         * <p>Number of task retries</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;3&quot;</p>
         */
        @NameInMap("TaskRetryCount")
        public String taskRetryCount;

        /**
         * <p>Task execution status: 0-Pending, 1-Executing, 2-Execution successful, 3-Paused, 4-Execution failed (retryable), 5-Execution failed (not retryable), 6-Task canceled.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TaskStatus")
        public Integer taskStatus;

        /**
         * <p>Update date</p>
         * 
         * <strong>example:</strong>
         * <p>2023-04-27 18:07:43</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        /**
         * <p>Updater</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;12121&quot;</p>
         */
        @NameInMap("UpdateUser")
        public String updateUser;

        public static QueryAsyncTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            QueryAsyncTaskResponseBodyData self = new QueryAsyncTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public QueryAsyncTaskResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public QueryAsyncTaskResponseBodyData setCreateUser(String createUser) {
            this.createUser = createUser;
            return this;
        }
        public String getCreateUser() {
            return this.createUser;
        }

        public QueryAsyncTaskResponseBodyData setTaskCode(String taskCode) {
            this.taskCode = taskCode;
            return this;
        }
        public String getTaskCode() {
            return this.taskCode;
        }

        public QueryAsyncTaskResponseBodyData setTaskErrorMessage(String taskErrorMessage) {
            this.taskErrorMessage = taskErrorMessage;
            return this;
        }
        public String getTaskErrorMessage() {
            return this.taskErrorMessage;
        }

        public QueryAsyncTaskResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public QueryAsyncTaskResponseBodyData setTaskIntermediateResult(String taskIntermediateResult) {
            this.taskIntermediateResult = taskIntermediateResult;
            return this;
        }
        public String getTaskIntermediateResult() {
            return this.taskIntermediateResult;
        }

        public QueryAsyncTaskResponseBodyData setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

        public QueryAsyncTaskResponseBodyData setTaskParam(String taskParam) {
            this.taskParam = taskParam;
            return this;
        }
        public String getTaskParam() {
            return this.taskParam;
        }

        public QueryAsyncTaskResponseBodyData setTaskProgressMessage(String taskProgressMessage) {
            this.taskProgressMessage = taskProgressMessage;
            return this;
        }
        public String getTaskProgressMessage() {
            return this.taskProgressMessage;
        }

        public QueryAsyncTaskResponseBodyData setTaskResult(String taskResult) {
            this.taskResult = taskResult;
            return this;
        }
        public String getTaskResult() {
            return this.taskResult;
        }

        public QueryAsyncTaskResponseBodyData setTaskRetryCount(String taskRetryCount) {
            this.taskRetryCount = taskRetryCount;
            return this;
        }
        public String getTaskRetryCount() {
            return this.taskRetryCount;
        }

        public QueryAsyncTaskResponseBodyData setTaskStatus(Integer taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }
        public Integer getTaskStatus() {
            return this.taskStatus;
        }

        public QueryAsyncTaskResponseBodyData setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public QueryAsyncTaskResponseBodyData setUpdateUser(String updateUser) {
            this.updateUser = updateUser;
            return this;
        }
        public String getUpdateUser() {
            return this.updateUser;
        }

    }

}
