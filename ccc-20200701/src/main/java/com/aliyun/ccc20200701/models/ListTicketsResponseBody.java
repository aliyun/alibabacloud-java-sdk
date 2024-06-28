// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class ListTicketsResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public ListTicketsResponseBodyData data;

    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Long httpStatusCode;

    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>7BEEA660-A45A-45E3-98CC-AFC65E715C23</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListTicketsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListTicketsResponseBody self = new ListTicketsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListTicketsResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListTicketsResponseBody setData(ListTicketsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListTicketsResponseBodyData getData() {
        return this.data;
    }

    public ListTicketsResponseBody setHttpStatusCode(Long httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Long getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListTicketsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListTicketsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListTicketsResponseBodyDataList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>assignee@ccc-test</p>
         */
        @NameInMap("Assignee")
        public String assignee;

        /**
         * <strong>example:</strong>
         * <p>Assignee</p>
         */
        @NameInMap("AssigneeName")
        public String assigneeName;

        /**
         * <strong>example:</strong>
         * <p>43c2671b-*****-4223-86d0-6bd187905cc8</p>
         */
        @NameInMap("CategoryId")
        public String categoryId;

        @NameInMap("CategoryName")
        public String categoryName;

        /**
         * <strong>example:</strong>
         * <p>Completed</p>
         */
        @NameInMap("CloseCode")
        public String closeCode;

        @NameInMap("Comment")
        public String comment;

        /**
         * <strong>example:</strong>
         * <p>{&quot;productName&quot;:&quot;alynx&quot;}</p>
         */
        @NameInMap("Context")
        public String context;

        /**
         * <strong>example:</strong>
         * <p>1631440860000</p>
         */
        @NameInMap("CreatedTime")
        public String createdTime;

        /**
         * <strong>example:</strong>
         * <p>creator@ccc-test</p>
         */
        @NameInMap("Creator")
        public String creator;

        /**
         * <strong>example:</strong>
         * <p>Creator</p>
         */
        @NameInMap("CreatorName")
        public String creatorName;

        /**
         * <strong>example:</strong>
         * <p>0707dab6-34a8-11ef-9823-161e3802b2d4</p>
         */
        @NameInMap("CurrentTaskId")
        public String currentTaskId;

        @NameInMap("CurrentTaskName")
        public String currentTaskName;

        /**
         * <strong>example:</strong>
         * <p>1631440860000</p>
         */
        @NameInMap("CurrentTaskStartTime")
        public Long currentTaskStartTime;

        /**
         * <strong>example:</strong>
         * <p>51e155ce-*****1-b402-13c69597b920</p>
         */
        @NameInMap("CustomerId")
        public String customerId;

        /**
         * <strong>example:</strong>
         * <p>1631440860000</p>
         */
        @NameInMap("EndTime")
        public Long endTime;

        /**
         * <strong>example:</strong>
         * <p>ccc-test</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <strong>example:</strong>
         * <p>job-47150***150396416</p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <strong>example:</strong>
         * <p>CHAT</p>
         */
        @NameInMap("Source")
        public String source;

        /**
         * <strong>example:</strong>
         * <p>1631440860000</p>
         */
        @NameInMap("StartTime")
        public Long startTime;

        /**
         * <strong>example:</strong>
         * <p>Processing</p>
         */
        @NameInMap("State")
        public String state;

        /**
         * <strong>example:</strong>
         * <p>c844a5f0-496c-4c5b-8a0c-dd27686e8ff6</p>
         */
        @NameInMap("TemplateId")
        public String templateId;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("TemplateVersion")
        public String templateVersion;

        /**
         * <strong>example:</strong>
         * <p>feb83abd-9f08-49d2-9b56-41d1b66ca0ac</p>
         */
        @NameInMap("TicketId")
        public String ticketId;

        @NameInMap("Title")
        public String title;

        /**
         * <strong>example:</strong>
         * <p>1631440860000</p>
         */
        @NameInMap("UpdatedTime")
        public String updatedTime;

        public static ListTicketsResponseBodyDataList build(java.util.Map<String, ?> map) throws Exception {
            ListTicketsResponseBodyDataList self = new ListTicketsResponseBodyDataList();
            return TeaModel.build(map, self);
        }

        public ListTicketsResponseBodyDataList setAssignee(String assignee) {
            this.assignee = assignee;
            return this;
        }
        public String getAssignee() {
            return this.assignee;
        }

        public ListTicketsResponseBodyDataList setAssigneeName(String assigneeName) {
            this.assigneeName = assigneeName;
            return this;
        }
        public String getAssigneeName() {
            return this.assigneeName;
        }

        public ListTicketsResponseBodyDataList setCategoryId(String categoryId) {
            this.categoryId = categoryId;
            return this;
        }
        public String getCategoryId() {
            return this.categoryId;
        }

        public ListTicketsResponseBodyDataList setCategoryName(String categoryName) {
            this.categoryName = categoryName;
            return this;
        }
        public String getCategoryName() {
            return this.categoryName;
        }

        public ListTicketsResponseBodyDataList setCloseCode(String closeCode) {
            this.closeCode = closeCode;
            return this;
        }
        public String getCloseCode() {
            return this.closeCode;
        }

        public ListTicketsResponseBodyDataList setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public ListTicketsResponseBodyDataList setContext(String context) {
            this.context = context;
            return this;
        }
        public String getContext() {
            return this.context;
        }

        public ListTicketsResponseBodyDataList setCreatedTime(String createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public String getCreatedTime() {
            return this.createdTime;
        }

        public ListTicketsResponseBodyDataList setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public ListTicketsResponseBodyDataList setCreatorName(String creatorName) {
            this.creatorName = creatorName;
            return this;
        }
        public String getCreatorName() {
            return this.creatorName;
        }

        public ListTicketsResponseBodyDataList setCurrentTaskId(String currentTaskId) {
            this.currentTaskId = currentTaskId;
            return this;
        }
        public String getCurrentTaskId() {
            return this.currentTaskId;
        }

        public ListTicketsResponseBodyDataList setCurrentTaskName(String currentTaskName) {
            this.currentTaskName = currentTaskName;
            return this;
        }
        public String getCurrentTaskName() {
            return this.currentTaskName;
        }

        public ListTicketsResponseBodyDataList setCurrentTaskStartTime(Long currentTaskStartTime) {
            this.currentTaskStartTime = currentTaskStartTime;
            return this;
        }
        public Long getCurrentTaskStartTime() {
            return this.currentTaskStartTime;
        }

        public ListTicketsResponseBodyDataList setCustomerId(String customerId) {
            this.customerId = customerId;
            return this;
        }
        public String getCustomerId() {
            return this.customerId;
        }

        public ListTicketsResponseBodyDataList setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public ListTicketsResponseBodyDataList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListTicketsResponseBodyDataList setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public ListTicketsResponseBodyDataList setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public ListTicketsResponseBodyDataList setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public ListTicketsResponseBodyDataList setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public ListTicketsResponseBodyDataList setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public ListTicketsResponseBodyDataList setTemplateVersion(String templateVersion) {
            this.templateVersion = templateVersion;
            return this;
        }
        public String getTemplateVersion() {
            return this.templateVersion;
        }

        public ListTicketsResponseBodyDataList setTicketId(String ticketId) {
            this.ticketId = ticketId;
            return this;
        }
        public String getTicketId() {
            return this.ticketId;
        }

        public ListTicketsResponseBodyDataList setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public ListTicketsResponseBodyDataList setUpdatedTime(String updatedTime) {
            this.updatedTime = updatedTime;
            return this;
        }
        public String getUpdatedTime() {
            return this.updatedTime;
        }

    }

    public static class ListTicketsResponseBodyData extends TeaModel {
        @NameInMap("List")
        public java.util.List<ListTicketsResponseBodyDataList> list;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("PageNumber")
        public Long pageNumber;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("PageSize")
        public Long pageSize;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("TotalCount")
        public Long totalCount;

        public static ListTicketsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListTicketsResponseBodyData self = new ListTicketsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListTicketsResponseBodyData setList(java.util.List<ListTicketsResponseBodyDataList> list) {
            this.list = list;
            return this;
        }
        public java.util.List<ListTicketsResponseBodyDataList> getList() {
            return this.list;
        }

        public ListTicketsResponseBodyData setPageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Long getPageNumber() {
            return this.pageNumber;
        }

        public ListTicketsResponseBodyData setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

        public ListTicketsResponseBodyData setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
