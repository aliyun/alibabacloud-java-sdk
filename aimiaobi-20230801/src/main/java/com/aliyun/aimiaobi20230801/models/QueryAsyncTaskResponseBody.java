// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class QueryAsyncTaskResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public QueryAsyncTaskResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>867C4ABE-4381-5BC2-9810-5A5F334F71CF</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>True</p>
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
         * <strong>example:</strong>
         * <p>2021-07-25 14:34:33</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>12121</p>
         */
        @NameInMap("CreateUser")
        public String createUser;

        /**
         * <strong>example:</strong>
         * <p>MaterialDocumentUpload</p>
         */
        @NameInMap("TaskCode")
        public String taskCode;

        /**
         * <strong>example:</strong>
         * <p>error</p>
         */
        @NameInMap("TaskErrorMessage")
        public String taskErrorMessage;

        /**
         * <strong>example:</strong>
         * <p>3f7045e099474ba28ceca1b4eb6d6e21</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("TaskIntermediateResult")
        public String taskIntermediateResult;

        @NameInMap("TaskName")
        public String taskName;

        /**
         * <strong>example:</strong>
         * <p>{&quot;fileKey&quot;:&quot;oss://default/xxxx/xxxx/xxx&quot;,&quot;fileName&quot;:&quot;xxxxx.doc&quot;}</p>
         */
        @NameInMap("TaskParam")
        public String taskParam;

        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("TaskProgressMessage")
        public String taskProgressMessage;

        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("TaskResult")
        public String taskResult;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("TaskRetryCount")
        public String taskRetryCount;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TaskStatus")
        public Integer taskStatus;

        /**
         * <strong>example:</strong>
         * <p>2023-04-27 18:07:43</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        /**
         * <strong>example:</strong>
         * <p>12121</p>
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
