// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class QueryTaskInfoHistoryResponseBody extends TeaModel {
    @NameInMap("CurrentPageCursor")
    public QueryTaskInfoHistoryResponseBodyCurrentPageCursor currentPageCursor;

    @NameInMap("NextPageCursor")
    public QueryTaskInfoHistoryResponseBodyNextPageCursor nextPageCursor;

    @NameInMap("Objects")
    public java.util.List<QueryTaskInfoHistoryResponseBodyObjects> objects;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("PrePageCursor")
    public QueryTaskInfoHistoryResponseBodyPrePageCursor prePageCursor;

    /**
     * <strong>example:</strong>
     * <p>EB3FCCBA-CA1F-4D31-9F34-test</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static QueryTaskInfoHistoryResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryTaskInfoHistoryResponseBody self = new QueryTaskInfoHistoryResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryTaskInfoHistoryResponseBody setCurrentPageCursor(QueryTaskInfoHistoryResponseBodyCurrentPageCursor currentPageCursor) {
        this.currentPageCursor = currentPageCursor;
        return this;
    }
    public QueryTaskInfoHistoryResponseBodyCurrentPageCursor getCurrentPageCursor() {
        return this.currentPageCursor;
    }

    public QueryTaskInfoHistoryResponseBody setNextPageCursor(QueryTaskInfoHistoryResponseBodyNextPageCursor nextPageCursor) {
        this.nextPageCursor = nextPageCursor;
        return this;
    }
    public QueryTaskInfoHistoryResponseBodyNextPageCursor getNextPageCursor() {
        return this.nextPageCursor;
    }

    public QueryTaskInfoHistoryResponseBody setObjects(java.util.List<QueryTaskInfoHistoryResponseBodyObjects> objects) {
        this.objects = objects;
        return this;
    }
    public java.util.List<QueryTaskInfoHistoryResponseBodyObjects> getObjects() {
        return this.objects;
    }

    public QueryTaskInfoHistoryResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryTaskInfoHistoryResponseBody setPrePageCursor(QueryTaskInfoHistoryResponseBodyPrePageCursor prePageCursor) {
        this.prePageCursor = prePageCursor;
        return this;
    }
    public QueryTaskInfoHistoryResponseBodyPrePageCursor getPrePageCursor() {
        return this.prePageCursor;
    }

    public QueryTaskInfoHistoryResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class QueryTaskInfoHistoryResponseBodyCurrentPageCursor extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>127.0.0.1</p>
         */
        @NameInMap("Clientip")
        public String clientip;

        /**
         * <strong>example:</strong>
         * <p>2017-11-01 17:22:51</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>1509528171000</p>
         */
        @NameInMap("CreateTimeLong")
        public Long createTimeLong;

        /**
         * <strong>example:</strong>
         * <p>aa634d3f-927e-4d17-9d2c-test</p>
         */
        @NameInMap("TaskNo")
        public String taskNo;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TaskNum")
        public Integer taskNum;

        /**
         * <strong>example:</strong>
         * <p>COMPLETE</p>
         */
        @NameInMap("TaskStatus")
        public String taskStatus;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("TaskStatusCode")
        public Integer taskStatusCode;

        /**
         * <strong>example:</strong>
         * <p>CHG_DNS</p>
         */
        @NameInMap("TaskType")
        public String taskType;

        @NameInMap("TaskTypeDescription")
        public String taskTypeDescription;

        public static QueryTaskInfoHistoryResponseBodyCurrentPageCursor build(java.util.Map<String, ?> map) throws Exception {
            QueryTaskInfoHistoryResponseBodyCurrentPageCursor self = new QueryTaskInfoHistoryResponseBodyCurrentPageCursor();
            return TeaModel.build(map, self);
        }

        public QueryTaskInfoHistoryResponseBodyCurrentPageCursor setClientip(String clientip) {
            this.clientip = clientip;
            return this;
        }
        public String getClientip() {
            return this.clientip;
        }

        public QueryTaskInfoHistoryResponseBodyCurrentPageCursor setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public QueryTaskInfoHistoryResponseBodyCurrentPageCursor setCreateTimeLong(Long createTimeLong) {
            this.createTimeLong = createTimeLong;
            return this;
        }
        public Long getCreateTimeLong() {
            return this.createTimeLong;
        }

        public QueryTaskInfoHistoryResponseBodyCurrentPageCursor setTaskNo(String taskNo) {
            this.taskNo = taskNo;
            return this;
        }
        public String getTaskNo() {
            return this.taskNo;
        }

        public QueryTaskInfoHistoryResponseBodyCurrentPageCursor setTaskNum(Integer taskNum) {
            this.taskNum = taskNum;
            return this;
        }
        public Integer getTaskNum() {
            return this.taskNum;
        }

        public QueryTaskInfoHistoryResponseBodyCurrentPageCursor setTaskStatus(String taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }
        public String getTaskStatus() {
            return this.taskStatus;
        }

        public QueryTaskInfoHistoryResponseBodyCurrentPageCursor setTaskStatusCode(Integer taskStatusCode) {
            this.taskStatusCode = taskStatusCode;
            return this;
        }
        public Integer getTaskStatusCode() {
            return this.taskStatusCode;
        }

        public QueryTaskInfoHistoryResponseBodyCurrentPageCursor setTaskType(String taskType) {
            this.taskType = taskType;
            return this;
        }
        public String getTaskType() {
            return this.taskType;
        }

        public QueryTaskInfoHistoryResponseBodyCurrentPageCursor setTaskTypeDescription(String taskTypeDescription) {
            this.taskTypeDescription = taskTypeDescription;
            return this;
        }
        public String getTaskTypeDescription() {
            return this.taskTypeDescription;
        }

    }

    public static class QueryTaskInfoHistoryResponseBodyNextPageCursor extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>127.0.0.1</p>
         */
        @NameInMap("Clientip")
        public String clientip;

        /**
         * <strong>example:</strong>
         * <p>2017-10-27 13:07:07</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>1509080827000</p>
         */
        @NameInMap("CreateTimeLong")
        public Long createTimeLong;

        /**
         * <strong>example:</strong>
         * <p>8f112aa1-98be-48c3-82f8-test</p>
         */
        @NameInMap("TaskNo")
        public String taskNo;

        /**
         * <strong>example:</strong>
         * <p>15</p>
         */
        @NameInMap("TaskNum")
        public Integer taskNum;

        /**
         * <strong>example:</strong>
         * <p>COMPLETE</p>
         */
        @NameInMap("TaskStatus")
        public String taskStatus;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("TaskStatusCode")
        public Integer taskStatusCode;

        /**
         * <strong>example:</strong>
         * <p>CHG_DNS</p>
         */
        @NameInMap("TaskType")
        public String taskType;

        @NameInMap("TaskTypeDescription")
        public String taskTypeDescription;

        public static QueryTaskInfoHistoryResponseBodyNextPageCursor build(java.util.Map<String, ?> map) throws Exception {
            QueryTaskInfoHistoryResponseBodyNextPageCursor self = new QueryTaskInfoHistoryResponseBodyNextPageCursor();
            return TeaModel.build(map, self);
        }

        public QueryTaskInfoHistoryResponseBodyNextPageCursor setClientip(String clientip) {
            this.clientip = clientip;
            return this;
        }
        public String getClientip() {
            return this.clientip;
        }

        public QueryTaskInfoHistoryResponseBodyNextPageCursor setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public QueryTaskInfoHistoryResponseBodyNextPageCursor setCreateTimeLong(Long createTimeLong) {
            this.createTimeLong = createTimeLong;
            return this;
        }
        public Long getCreateTimeLong() {
            return this.createTimeLong;
        }

        public QueryTaskInfoHistoryResponseBodyNextPageCursor setTaskNo(String taskNo) {
            this.taskNo = taskNo;
            return this;
        }
        public String getTaskNo() {
            return this.taskNo;
        }

        public QueryTaskInfoHistoryResponseBodyNextPageCursor setTaskNum(Integer taskNum) {
            this.taskNum = taskNum;
            return this;
        }
        public Integer getTaskNum() {
            return this.taskNum;
        }

        public QueryTaskInfoHistoryResponseBodyNextPageCursor setTaskStatus(String taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }
        public String getTaskStatus() {
            return this.taskStatus;
        }

        public QueryTaskInfoHistoryResponseBodyNextPageCursor setTaskStatusCode(Integer taskStatusCode) {
            this.taskStatusCode = taskStatusCode;
            return this;
        }
        public Integer getTaskStatusCode() {
            return this.taskStatusCode;
        }

        public QueryTaskInfoHistoryResponseBodyNextPageCursor setTaskType(String taskType) {
            this.taskType = taskType;
            return this;
        }
        public String getTaskType() {
            return this.taskType;
        }

        public QueryTaskInfoHistoryResponseBodyNextPageCursor setTaskTypeDescription(String taskTypeDescription) {
            this.taskTypeDescription = taskTypeDescription;
            return this;
        }
        public String getTaskTypeDescription() {
            return this.taskTypeDescription;
        }

    }

    public static class QueryTaskInfoHistoryResponseBodyObjects extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>127.0.0.1</p>
         */
        @NameInMap("Clientip")
        public String clientip;

        /**
         * <strong>example:</strong>
         * <p>2017-11-01 17:22:51</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>1509528171000</p>
         */
        @NameInMap("CreateTimeLong")
        public Long createTimeLong;

        /**
         * <strong>example:</strong>
         * <p>aa634d3f-927e-4d17-9d2c-test</p>
         */
        @NameInMap("TaskNo")
        public String taskNo;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TaskNum")
        public Integer taskNum;

        /**
         * <strong>example:</strong>
         * <p>COMPLETE</p>
         */
        @NameInMap("TaskStatus")
        public String taskStatus;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("TaskStatusCode")
        public Integer taskStatusCode;

        /**
         * <strong>example:</strong>
         * <p>CHG_DNS</p>
         */
        @NameInMap("TaskType")
        public String taskType;

        @NameInMap("TaskTypeDescription")
        public String taskTypeDescription;

        public static QueryTaskInfoHistoryResponseBodyObjects build(java.util.Map<String, ?> map) throws Exception {
            QueryTaskInfoHistoryResponseBodyObjects self = new QueryTaskInfoHistoryResponseBodyObjects();
            return TeaModel.build(map, self);
        }

        public QueryTaskInfoHistoryResponseBodyObjects setClientip(String clientip) {
            this.clientip = clientip;
            return this;
        }
        public String getClientip() {
            return this.clientip;
        }

        public QueryTaskInfoHistoryResponseBodyObjects setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public QueryTaskInfoHistoryResponseBodyObjects setCreateTimeLong(Long createTimeLong) {
            this.createTimeLong = createTimeLong;
            return this;
        }
        public Long getCreateTimeLong() {
            return this.createTimeLong;
        }

        public QueryTaskInfoHistoryResponseBodyObjects setTaskNo(String taskNo) {
            this.taskNo = taskNo;
            return this;
        }
        public String getTaskNo() {
            return this.taskNo;
        }

        public QueryTaskInfoHistoryResponseBodyObjects setTaskNum(Integer taskNum) {
            this.taskNum = taskNum;
            return this;
        }
        public Integer getTaskNum() {
            return this.taskNum;
        }

        public QueryTaskInfoHistoryResponseBodyObjects setTaskStatus(String taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }
        public String getTaskStatus() {
            return this.taskStatus;
        }

        public QueryTaskInfoHistoryResponseBodyObjects setTaskStatusCode(Integer taskStatusCode) {
            this.taskStatusCode = taskStatusCode;
            return this;
        }
        public Integer getTaskStatusCode() {
            return this.taskStatusCode;
        }

        public QueryTaskInfoHistoryResponseBodyObjects setTaskType(String taskType) {
            this.taskType = taskType;
            return this;
        }
        public String getTaskType() {
            return this.taskType;
        }

        public QueryTaskInfoHistoryResponseBodyObjects setTaskTypeDescription(String taskTypeDescription) {
            this.taskTypeDescription = taskTypeDescription;
            return this;
        }
        public String getTaskTypeDescription() {
            return this.taskTypeDescription;
        }

    }

    public static class QueryTaskInfoHistoryResponseBodyPrePageCursor extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>127.0.0.1</p>
         */
        @NameInMap("Clientip")
        public String clientip;

        /**
         * <strong>example:</strong>
         * <p>2017-11-01 17:19:47</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>1509527987000</p>
         */
        @NameInMap("CreateTimeLong")
        public Long createTimeLong;

        /**
         * <strong>example:</strong>
         * <p>f9baa3d5-33b9-4c81-8847-test</p>
         */
        @NameInMap("TaskNo")
        public String taskNo;

        /**
         * <strong>example:</strong>
         * <p>15</p>
         */
        @NameInMap("TaskNum")
        public Integer taskNum;

        /**
         * <strong>example:</strong>
         * <p>COMPLETE</p>
         */
        @NameInMap("TaskStatus")
        public String taskStatus;

        /**
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("TaskStatusCode")
        public Integer taskStatusCode;

        /**
         * <strong>example:</strong>
         * <p>CHG_DNS</p>
         */
        @NameInMap("TaskType")
        public String taskType;

        @NameInMap("TaskTypeDescription")
        public String taskTypeDescription;

        public static QueryTaskInfoHistoryResponseBodyPrePageCursor build(java.util.Map<String, ?> map) throws Exception {
            QueryTaskInfoHistoryResponseBodyPrePageCursor self = new QueryTaskInfoHistoryResponseBodyPrePageCursor();
            return TeaModel.build(map, self);
        }

        public QueryTaskInfoHistoryResponseBodyPrePageCursor setClientip(String clientip) {
            this.clientip = clientip;
            return this;
        }
        public String getClientip() {
            return this.clientip;
        }

        public QueryTaskInfoHistoryResponseBodyPrePageCursor setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public QueryTaskInfoHistoryResponseBodyPrePageCursor setCreateTimeLong(Long createTimeLong) {
            this.createTimeLong = createTimeLong;
            return this;
        }
        public Long getCreateTimeLong() {
            return this.createTimeLong;
        }

        public QueryTaskInfoHistoryResponseBodyPrePageCursor setTaskNo(String taskNo) {
            this.taskNo = taskNo;
            return this;
        }
        public String getTaskNo() {
            return this.taskNo;
        }

        public QueryTaskInfoHistoryResponseBodyPrePageCursor setTaskNum(Integer taskNum) {
            this.taskNum = taskNum;
            return this;
        }
        public Integer getTaskNum() {
            return this.taskNum;
        }

        public QueryTaskInfoHistoryResponseBodyPrePageCursor setTaskStatus(String taskStatus) {
            this.taskStatus = taskStatus;
            return this;
        }
        public String getTaskStatus() {
            return this.taskStatus;
        }

        public QueryTaskInfoHistoryResponseBodyPrePageCursor setTaskStatusCode(Integer taskStatusCode) {
            this.taskStatusCode = taskStatusCode;
            return this;
        }
        public Integer getTaskStatusCode() {
            return this.taskStatusCode;
        }

        public QueryTaskInfoHistoryResponseBodyPrePageCursor setTaskType(String taskType) {
            this.taskType = taskType;
            return this;
        }
        public String getTaskType() {
            return this.taskType;
        }

        public QueryTaskInfoHistoryResponseBodyPrePageCursor setTaskTypeDescription(String taskTypeDescription) {
            this.taskTypeDescription = taskTypeDescription;
            return this;
        }
        public String getTaskTypeDescription() {
            return this.taskTypeDescription;
        }

    }

}
