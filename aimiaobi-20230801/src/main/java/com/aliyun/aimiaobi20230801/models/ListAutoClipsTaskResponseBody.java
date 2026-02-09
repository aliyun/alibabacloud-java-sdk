// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aimiaobi20230801.models;

import com.aliyun.tea.*;

public class ListAutoClipsTaskResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>success</p>
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
    public java.util.List<ListAutoClipsTaskResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <strong>example:</strong>
     * <p>successful</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>1813ceee-7fe5-41b4-87e5-982a4d18cca5</p>
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

    /**
     * <strong>example:</strong>
     * <p>null</p>
     */
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListAutoClipsTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListAutoClipsTaskResponseBody self = new ListAutoClipsTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public ListAutoClipsTaskResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListAutoClipsTaskResponseBody setCurrent(Integer current) {
        this.current = current;
        return this;
    }
    public Integer getCurrent() {
        return this.current;
    }

    public ListAutoClipsTaskResponseBody setData(java.util.List<ListAutoClipsTaskResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListAutoClipsTaskResponseBodyData> getData() {
        return this.data;
    }

    public ListAutoClipsTaskResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListAutoClipsTaskResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListAutoClipsTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListAutoClipsTaskResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListAutoClipsTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListAutoClipsTaskResponseBody setSize(Integer size) {
        this.size = size;
        return this;
    }
    public Integer getSize() {
        return this.size;
    }

    public ListAutoClipsTaskResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public ListAutoClipsTaskResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public ListAutoClipsTaskResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListAutoClipsTaskResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>2023-03-18 02:00:00</p>
         */
        @NameInMap("CreateTimeStart")
        public String createTimeStart;

        /**
         * <strong>example:</strong>
         * <p>3f7045e099474ba28ceca1b4eb6d6e21</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        @NameInMap("TaskName")
        public String taskName;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("TaskStatus")
        public Integer taskStatus;

        /**
         * <p>upload</p>
         * 
         * <strong>example:</strong>
         * <p>upload
         * clips
         * generate</p>
         */
        @NameInMap("TaskStep")
        public String taskStep;

        /**
         * <strong>example:</strong>
         * <p>type001</p>
         */
        @NameInMap("TaskType")
        public String taskType;

        public static ListAutoClipsTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListAutoClipsTaskResponseBodyData self = new ListAutoClipsTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListAutoClipsTaskResponseBodyData setCreateTimeStart(String createTimeStart) {
            this.createTimeStart = createTimeStart;
            return this;
        }
        public String getCreateTimeStart() {
            return this.createTimeStart;
        }

        public ListAutoClipsTaskResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public ListAutoClipsTaskResponseBodyData setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

        public ListAutoClipsTaskResponseBodyData setTaskStatus(Integer taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }
        public Integer getTaskStatus() {
            return this.taskStatus;
        }

        public ListAutoClipsTaskResponseBodyData setTaskStep(String taskStep) {
            this.taskStep = taskStep;
            return this;
        }
        public String getTaskStep() {
            return this.taskStep;
        }

        public ListAutoClipsTaskResponseBodyData setTaskType(String taskType) {
            this.taskType = taskType;
            return this;
        }
        public String getTaskType() {
            return this.taskType;
        }

    }

}
