// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class ListApprovalTasksByUserResponseBody extends TeaModel {
    /**
     * <p>The backend response code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The backend error details.</p>
     * 
     * <strong>example:</strong>
     * <p>internal error</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The paging query result.</p>
     */
    @NameInMap("PageResult")
    public ListApprovalTasksByUserResponseBodyPageResult pageResult;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>82E78D6B-AA8F-1FEF-8AA3-5C9DA2A79140</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request was successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static ListApprovalTasksByUserResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListApprovalTasksByUserResponseBody self = new ListApprovalTasksByUserResponseBody();
        return TeaModel.build(map, self);
    }

    public ListApprovalTasksByUserResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ListApprovalTasksByUserResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListApprovalTasksByUserResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListApprovalTasksByUserResponseBody setPageResult(ListApprovalTasksByUserResponseBodyPageResult pageResult) {
        this.pageResult = pageResult;
        return this;
    }
    public ListApprovalTasksByUserResponseBodyPageResult getPageResult() {
        return this.pageResult;
    }

    public ListApprovalTasksByUserResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListApprovalTasksByUserResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListApprovalTasksByUserResponseBodyPageResultTaskList extends TeaModel {
        /**
         * <p>The applicant ID.</p>
         * 
         * <strong>example:</strong>
         * <p>user001</p>
         */
        @NameInMap("ApplicantId")
        public String applicantId;

        /**
         * <p>The applicant name.</p>
         * 
         * <strong>example:</strong>
         * <p>John</p>
         */
        @NameInMap("ApplicantName")
        public String applicantName;

        /**
         * <p>The approval type.</p>
         * 
         * <strong>example:</strong>
         * <p>DATA_SOURCE</p>
         */
        @NameInMap("ApprovalType")
        public String approvalType;

        /**
         * <p>The approval flow ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The relationship between the current user and the approval task.</p>
         * 
         * <strong>example:</strong>
         * <p>SUBMITTED</p>
         */
        @NameInMap("RelationType")
        public String relationType;

        /**
         * <p>The source system.</p>
         * 
         * <strong>example:</strong>
         * <p>Dataphin</p>
         */
        @NameInMap("SourceSystem")
        public String sourceSystem;

        /**
         * <p>The approval status.</p>
         * 
         * <strong>example:</strong>
         * <p>APPROVED</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The submission time.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-07-30 10:00:00</p>
         */
        @NameInMap("SubmittedAt")
        public String submittedAt;

        /**
         * <p>The task name.</p>
         * 
         * <strong>example:</strong>
         * <p>Datasource application</p>
         */
        @NameInMap("Title")
        public String title;

        public static ListApprovalTasksByUserResponseBodyPageResultTaskList build(java.util.Map<String, ?> map) throws Exception {
            ListApprovalTasksByUserResponseBodyPageResultTaskList self = new ListApprovalTasksByUserResponseBodyPageResultTaskList();
            return TeaModel.build(map, self);
        }

        public ListApprovalTasksByUserResponseBodyPageResultTaskList setApplicantId(String applicantId) {
            this.applicantId = applicantId;
            return this;
        }
        public String getApplicantId() {
            return this.applicantId;
        }

        public ListApprovalTasksByUserResponseBodyPageResultTaskList setApplicantName(String applicantName) {
            this.applicantName = applicantName;
            return this;
        }
        public String getApplicantName() {
            return this.applicantName;
        }

        public ListApprovalTasksByUserResponseBodyPageResultTaskList setApprovalType(String approvalType) {
            this.approvalType = approvalType;
            return this;
        }
        public String getApprovalType() {
            return this.approvalType;
        }

        public ListApprovalTasksByUserResponseBodyPageResultTaskList setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListApprovalTasksByUserResponseBodyPageResultTaskList setRelationType(String relationType) {
            this.relationType = relationType;
            return this;
        }
        public String getRelationType() {
            return this.relationType;
        }

        public ListApprovalTasksByUserResponseBodyPageResultTaskList setSourceSystem(String sourceSystem) {
            this.sourceSystem = sourceSystem;
            return this;
        }
        public String getSourceSystem() {
            return this.sourceSystem;
        }

        public ListApprovalTasksByUserResponseBodyPageResultTaskList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListApprovalTasksByUserResponseBodyPageResultTaskList setSubmittedAt(String submittedAt) {
            this.submittedAt = submittedAt;
            return this;
        }
        public String getSubmittedAt() {
            return this.submittedAt;
        }

        public ListApprovalTasksByUserResponseBodyPageResultTaskList setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

    public static class ListApprovalTasksByUserResponseBodyPageResult extends TeaModel {
        /**
         * <p>The list of approval tasks.</p>
         */
        @NameInMap("TaskList")
        public java.util.List<ListApprovalTasksByUserResponseBodyPageResultTaskList> taskList;

        /**
         * <p>The total number of records.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("TotalCount")
        public Long totalCount;

        public static ListApprovalTasksByUserResponseBodyPageResult build(java.util.Map<String, ?> map) throws Exception {
            ListApprovalTasksByUserResponseBodyPageResult self = new ListApprovalTasksByUserResponseBodyPageResult();
            return TeaModel.build(map, self);
        }

        public ListApprovalTasksByUserResponseBodyPageResult setTaskList(java.util.List<ListApprovalTasksByUserResponseBodyPageResultTaskList> taskList) {
            this.taskList = taskList;
            return this;
        }
        public java.util.List<ListApprovalTasksByUserResponseBodyPageResultTaskList> getTaskList() {
            return this.taskList;
        }

        public ListApprovalTasksByUserResponseBodyPageResult setTotalCount(Long totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Long getTotalCount() {
            return this.totalCount;
        }

    }

}
