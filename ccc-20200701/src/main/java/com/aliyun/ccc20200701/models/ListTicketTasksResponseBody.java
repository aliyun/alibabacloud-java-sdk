// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListTicketTasksResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public java.util.List<ListTicketTasksResponseBodyData> data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("Params")
    public java.util.List<String> params;

    /**
     * <strong>example:</strong>
     * <p>DE803553-8AA9-4B9D-9E4E-A82BC69EDCEE</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListTicketTasksResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTicketTasksResponseBody self = new ListTicketTasksResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTicketTasksResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListTicketTasksResponseBody setData(java.util.List<ListTicketTasksResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<ListTicketTasksResponseBodyData> getData() {
        return this.data;
    }

    public ListTicketTasksResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListTicketTasksResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListTicketTasksResponseBody setParams(java.util.List<String> params) {
        this.params = params;
        return this;
    }
    public java.util.List<String> getParams() {
        return this.params;
    }

    public ListTicketTasksResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListTicketTasksResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>CounterSignTask</p>
         */
        @NameInMap("Action")
        public String action;

        /**
         * <strong>example:</strong>
         * <p>assignee@ccc-test</p>
         */
        @NameInMap("Assignee")
        public String assignee;

        /**
         * <strong>example:</strong>
         * <p>assignee</p>
         */
        @NameInMap("AssigneeName")
        public String assigneeName;

        @NameInMap("Comment")
        public String comment;

        /**
         * <strong>example:</strong>
         * <p>1620269200000</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        @NameInMap("FileKeys")
        public java.util.List<String> fileKeys;

        @NameInMap("FileUrls")
        public java.util.List<String> fileUrls;

        /**
         * <strong>example:</strong>
         * <p>ccc-test</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <strong>example:</strong>
         * <p>1620259200000</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        /**
         * <strong>example:</strong>
         * <p>APPROVAL__6zu2QjAz</p>
         */
        @NameInMap("TaskDefinitionNodeId")
        public String taskDefinitionNodeId;

        /**
         * <strong>example:</strong>
         * <p>APPROVAL</p>
         */
        @NameInMap("TaskDefinitionNodeType")
        public String taskDefinitionNodeType;

        /**
         * <strong>example:</strong>
         * <p>eb039a4a6a5742c6b44ccff0c1fca745</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        @NameInMap("TaskName")
        public String taskName;

        /**
         * <strong>example:</strong>
         * <p>5491d3b4-14ee-4341-b5f1-db2c78beddeb</p>
         */
        @NameInMap("TicketId")
        public String ticketId;

        public static ListTicketTasksResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListTicketTasksResponseBodyData self = new ListTicketTasksResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListTicketTasksResponseBodyData setAction(String action) {
            this.action = action;
            return this;
        }
        public String getAction() {
            return this.action;
        }

        public ListTicketTasksResponseBodyData setAssignee(String assignee) {
            this.assignee = assignee;
            return this;
        }
        public String getAssignee() {
            return this.assignee;
        }

        public ListTicketTasksResponseBodyData setAssigneeName(String assigneeName) {
            this.assigneeName = assigneeName;
            return this;
        }
        public String getAssigneeName() {
            return this.assigneeName;
        }

        public ListTicketTasksResponseBodyData setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public ListTicketTasksResponseBodyData setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public ListTicketTasksResponseBodyData setFileKeys(java.util.List<String> fileKeys) {
            this.fileKeys = fileKeys;
            return this;
        }
        public java.util.List<String> getFileKeys() {
            return this.fileKeys;
        }

        public ListTicketTasksResponseBodyData setFileUrls(java.util.List<String> fileUrls) {
            this.fileUrls = fileUrls;
            return this;
        }
        public java.util.List<String> getFileUrls() {
            return this.fileUrls;
        }

        public ListTicketTasksResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListTicketTasksResponseBodyData setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public ListTicketTasksResponseBodyData setTaskDefinitionNodeId(String taskDefinitionNodeId) {
            this.taskDefinitionNodeId = taskDefinitionNodeId;
            return this;
        }
        public String getTaskDefinitionNodeId() {
            return this.taskDefinitionNodeId;
        }

        public ListTicketTasksResponseBodyData setTaskDefinitionNodeType(String taskDefinitionNodeType) {
            this.taskDefinitionNodeType = taskDefinitionNodeType;
            return this;
        }
        public String getTaskDefinitionNodeType() {
            return this.taskDefinitionNodeType;
        }

        public ListTicketTasksResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public ListTicketTasksResponseBodyData setTaskName(String taskName) {
            this.taskName = taskName;
            return this;
        }
        public String getTaskName() {
            return this.taskName;
        }

        public ListTicketTasksResponseBodyData setTicketId(String ticketId) {
            this.ticketId = ticketId;
            return this;
        }
        public String getTicketId() {
            return this.ticketId;
        }

    }

}
