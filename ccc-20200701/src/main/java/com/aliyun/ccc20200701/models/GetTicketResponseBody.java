// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ccc20200701.models;

import com.aliyun.tea.*;

public class GetTicketResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public GetTicketResponseBodyData data;

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
     * <p>BF268B34-09C2-43FD-BAC4-5D31EA633111</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetTicketResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTicketResponseBody self = new GetTicketResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTicketResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetTicketResponseBody setData(GetTicketResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetTicketResponseBodyData getData() {
        return this.data;
    }

    public GetTicketResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetTicketResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetTicketResponseBody setParams(java.util.List<String> params) {
        this.params = params;
        return this;
    }
    public java.util.List<String> getParams() {
        return this.params;
    }

    public GetTicketResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetTicketResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>agent1@ccc-test</p>
         */
        @NameInMap("Assignee")
        public String assignee;

        @NameInMap("AssigneeName")
        public String assigneeName;

        /**
         * <strong>example:</strong>
         * <p>8939-4223-86d0-6bd187905cc8</p>
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

        @NameInMap("Context")
        public String context;

        /**
         * <strong>example:</strong>
         * <p>1620259200000</p>
         */
        @NameInMap("CreatedTime")
        public Long createdTime;

        /**
         * <strong>example:</strong>
         * <p>creator@ccc-test</p>
         */
        @NameInMap("Creator")
        public String creator;

        @NameInMap("CreatorName")
        public String creatorName;

        /**
         * <strong>example:</strong>
         * <p>912f0b78-6639-4a93-ae18-0d832885c27e</p>
         */
        @NameInMap("CurrentTaskId")
        public String currentTaskId;

        @NameInMap("CurrentTaskName")
        public String currentTaskName;

        /**
         * <strong>example:</strong>
         * <p>1693793208075</p>
         */
        @NameInMap("CurrentTaskStartTime")
        public Long currentTaskStartTime;

        /**
         * <strong>example:</strong>
         * <p>4223-86d0-6bd187905-891798749</p>
         */
        @NameInMap("CustomerId")
        public String customerId;

        /**
         * <strong>example:</strong>
         * <p>1687846259999</p>
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
         * <p>job-399383842187575296</p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <strong>example:</strong>
         * <p>Audio</p>
         */
        @NameInMap("Source")
        public String source;

        /**
         * <strong>example:</strong>
         * <p>1620259200000</p>
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
         * <p>ccc-test_43c2671b-8939-4223-86d0-6bd187905cc8_*****0666238</p>
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
         * <p>b3a6a131-359e-46bd-9bc5-1f5cb0ea093f</p>
         */
        @NameInMap("TicketId")
        public String ticketId;

        @NameInMap("Title")
        public String title;

        /**
         * <strong>example:</strong>
         * <p>1693793208075</p>
         */
        @NameInMap("UpdatedTime")
        public Long updatedTime;

        public static GetTicketResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetTicketResponseBodyData self = new GetTicketResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetTicketResponseBodyData setAssignee(String assignee) {
            this.assignee = assignee;
            return this;
        }
        public String getAssignee() {
            return this.assignee;
        }

        public GetTicketResponseBodyData setAssigneeName(String assigneeName) {
            this.assigneeName = assigneeName;
            return this;
        }
        public String getAssigneeName() {
            return this.assigneeName;
        }

        public GetTicketResponseBodyData setCategoryId(String categoryId) {
            this.categoryId = categoryId;
            return this;
        }
        public String getCategoryId() {
            return this.categoryId;
        }

        public GetTicketResponseBodyData setCategoryName(String categoryName) {
            this.categoryName = categoryName;
            return this;
        }
        public String getCategoryName() {
            return this.categoryName;
        }

        public GetTicketResponseBodyData setCloseCode(String closeCode) {
            this.closeCode = closeCode;
            return this;
        }
        public String getCloseCode() {
            return this.closeCode;
        }

        public GetTicketResponseBodyData setComment(String comment) {
            this.comment = comment;
            return this;
        }
        public String getComment() {
            return this.comment;
        }

        public GetTicketResponseBodyData setContext(String context) {
            this.context = context;
            return this;
        }
        public String getContext() {
            return this.context;
        }

        public GetTicketResponseBodyData setCreatedTime(Long createdTime) {
            this.createdTime = createdTime;
            return this;
        }
        public Long getCreatedTime() {
            return this.createdTime;
        }

        public GetTicketResponseBodyData setCreator(String creator) {
            this.creator = creator;
            return this;
        }
        public String getCreator() {
            return this.creator;
        }

        public GetTicketResponseBodyData setCreatorName(String creatorName) {
            this.creatorName = creatorName;
            return this;
        }
        public String getCreatorName() {
            return this.creatorName;
        }

        public GetTicketResponseBodyData setCurrentTaskId(String currentTaskId) {
            this.currentTaskId = currentTaskId;
            return this;
        }
        public String getCurrentTaskId() {
            return this.currentTaskId;
        }

        public GetTicketResponseBodyData setCurrentTaskName(String currentTaskName) {
            this.currentTaskName = currentTaskName;
            return this;
        }
        public String getCurrentTaskName() {
            return this.currentTaskName;
        }

        public GetTicketResponseBodyData setCurrentTaskStartTime(Long currentTaskStartTime) {
            this.currentTaskStartTime = currentTaskStartTime;
            return this;
        }
        public Long getCurrentTaskStartTime() {
            return this.currentTaskStartTime;
        }

        public GetTicketResponseBodyData setCustomerId(String customerId) {
            this.customerId = customerId;
            return this;
        }
        public String getCustomerId() {
            return this.customerId;
        }

        public GetTicketResponseBodyData setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public GetTicketResponseBodyData setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public GetTicketResponseBodyData setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public GetTicketResponseBodyData setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

        public GetTicketResponseBodyData setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public GetTicketResponseBodyData setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public GetTicketResponseBodyData setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public GetTicketResponseBodyData setTemplateVersion(String templateVersion) {
            this.templateVersion = templateVersion;
            return this;
        }
        public String getTemplateVersion() {
            return this.templateVersion;
        }

        public GetTicketResponseBodyData setTicketId(String ticketId) {
            this.ticketId = ticketId;
            return this;
        }
        public String getTicketId() {
            return this.ticketId;
        }

        public GetTicketResponseBodyData setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public GetTicketResponseBodyData setUpdatedTime(Long updatedTime) {
            this.updatedTime = updatedTime;
            return this;
        }
        public Long getUpdatedTime() {
            return this.updatedTime;
        }

    }

}
