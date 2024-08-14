// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class ListAsyncTasksResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Current")
    public Integer current;

    @NameInMap("Data")
    public java.util.List<ListAsyncTasksResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>428DCC0D-3C63-5306-BD1B-124396AB97BE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("Size")
    public Integer size;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    /**
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("Total")
    public Integer total;

    public static ListAsyncTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAsyncTasksResponseBody self = new ListAsyncTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAsyncTasksResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListAsyncTasksResponseBody setCurrent(Integer current) {
        this.current = current;
        return this;
    }
    public Integer getCurrent() {
        return this.current;
    }

    public ListAsyncTasksResponseBody setData(java.util.List<ListAsyncTasksResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListAsyncTasksResponseBodyData> getData() {
        return this.data;
    }

    public ListAsyncTasksResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListAsyncTasksResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListAsyncTasksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAsyncTasksResponseBody setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

    public ListAsyncTasksResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListAsyncTasksResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public static class ListAsyncTasksResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2020-12-23 15:41:58</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>1111</p>
         */
        @NameInMap("CreateUser")
        public String createUser;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <strong>example:</strong>
         * <p>MaterialDocumentUpload</p>
         */
        @NameInMap("TaskCode")
        public String taskCode;

        /**
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("TaskDefinition")
        public String taskDefinition;

        /**
         * <strong>example:</strong>
         * <p>2023-03-09 00:00:00</p>
         */
        @NameInMap("TaskEndTime")
        public String taskEndTime;

        @NameInMap("TaskErrorMessage")
        public String taskErrorMessage;

        /**
         * <strong>example:</strong>
         * <p>2023-10-14 14:30:00</p>
         */
        @NameInMap("TaskExecuteTime")
        public String taskExecuteTime;

        /**
         * <strong>example:</strong>
         * <p>3f7045e099474ba28ceca1b4eb6d6e21</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        @NameInMap("TaskInnerErrorMessage")
        public String taskInnerErrorMessage;

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
         * <p>{}</p>
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
         * <p>1</p>
         */
        @NameInMap("TaskRetryCount")
        public String taskRetryCount;

        /**
         * <strong>example:</strong>
         * <p>2023-03-20 10:53:00</p>
         */
        @NameInMap("TaskStartTime")
        public String taskStartTime;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TaskStatus")
        public Integer taskStatus;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("TaskType")
        public String taskType;

        /**
         * <strong>example:</strong>
         * <p>2023-02-16 10:29:16</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        /**
         * <strong>example:</strong>
         * <p>111</p>
         */
        @NameInMap("UpdateUser")
        public String updateUser;

        public static ListAsyncTasksResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListAsyncTasksResponseBodyData self = new ListAsyncTasksResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListAsyncTasksResponseBodyData setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListAsyncTasksResponseBodyData setCreateUser(String createUser) {
            this.createUser = createUser;
            return this;
        }
        public String getCreateUser() {
            return this.createUser;
        }

        public ListAsyncTasksResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListAsyncTasksResponseBodyData setTaskCode(String taskCode) {
            this.taskCode = taskCode;
            return this;
        }
        public String getTaskCode() {
            return this.taskCode;
        }

        public ListAsyncTasksResponseBodyData setTaskDefinition(String taskDefinition) {
            this.taskDefinition = taskDefinition;
            return this;
        }
        public String getTaskDefinition() {
            return this.taskDefinition;
        }

        public ListAsyncTasksResponseBodyData setTaskEndTime(String taskEndTime) {
            this.taskEndTime = taskEndTime;
            return this;
        }
        public String getTaskEndTime() {
            return this.taskEndTime;
        }

        public ListAsyncTasksResponseBodyData setTaskErrorMessage(String taskErrorMessage) {
            this.taskErrorMessage = taskErrorMessage;
            return this;
        }
        public String getTaskErrorMessage() {
            return this.taskErrorMessage;
        }

        public ListAsyncTasksResponseBodyData setTaskExecuteTime(String taskExecuteTime) {
            this.taskExecuteTime = taskExecuteTime;
            return this;
        }
        public String getTaskExecuteTime() {
            return this.taskExecuteTime;
        }

        public ListAsyncTasksResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public ListAsyncTasksResponseBodyData setTaskInnerErrorMessage(String taskInnerErrorMessage) {
            this.taskInnerErrorMessage = taskInnerErrorMessage;
            return this;
        }
        public String getTaskInnerErrorMessage() {
            return this.taskInnerErrorMessage;
        }

        public ListAsyncTasksResponseBodyData setTaskIntermediateResult(String taskIntermediateResult) {
            this.taskIntermediateResult = taskIntermediateResult;
            return this;
        }
        public String getTaskIntermediateResult() {
            return this.taskIntermediateResult;
        }

        public ListAsyncTasksResponseBodyData setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

        public ListAsyncTasksResponseBodyData setTaskParam(String taskParam) {
            this.taskParam = taskParam;
            return this;
        }
        public String getTaskParam() {
            return this.taskParam;
        }

        public ListAsyncTasksResponseBodyData setTaskProgressMessage(String taskProgressMessage) {
            this.taskProgressMessage = taskProgressMessage;
            return this;
        }
        public String getTaskProgressMessage() {
            return this.taskProgressMessage;
        }

        public ListAsyncTasksResponseBodyData setTaskResult(String taskResult) {
            this.taskResult = taskResult;
            return this;
        }
        public String getTaskResult() {
            return this.taskResult;
        }

        public ListAsyncTasksResponseBodyData setTaskRetryCount(String taskRetryCount) {
            this.taskRetryCount = taskRetryCount;
            return this;
        }
        public String getTaskRetryCount() {
            return this.taskRetryCount;
        }

        public ListAsyncTasksResponseBodyData setTaskStartTime(String taskStartTime) {
            this.taskStartTime = taskStartTime;
            return this;
        }
        public String getTaskStartTime() {
            return this.taskStartTime;
        }

        public ListAsyncTasksResponseBodyData setTaskStatus(Integer taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }
        public Integer getTaskStatus() {
            return this.taskStatus;
        }

        public ListAsyncTasksResponseBodyData setTaskType(String taskType) {
            this.taskType = taskType;
            return this;
        }
        public String getTaskType() {
            return this.taskType;
        }

        public ListAsyncTasksResponseBodyData setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public ListAsyncTasksResponseBodyData setUpdateUser(String updateUser) {
            this.updateUser = updateUser;
            return this;
        }
        public String getUpdateUser() {
            return this.updateUser;
        }

    }

}
