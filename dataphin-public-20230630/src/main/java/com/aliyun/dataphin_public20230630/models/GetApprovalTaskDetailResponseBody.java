// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dataphin_public20230630.models;

import com.aliyun.tea.*;

public class GetApprovalTaskDetailResponseBody extends TeaModel {
    /**
     * <p>The backend response code.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The approval task details.</p>
     */
    @NameInMap("DetailInfo")
    public GetApprovalTaskDetailResponseBodyDetailInfo detailInfo;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The backend response exception details.</p>
     * 
     * <strong>example:</strong>
     * <p>internal error</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>82E78D6B-AA8F-1FEF-8AA3-5C9DA2A79140</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Indicates whether the request is successful.</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetApprovalTaskDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetApprovalTaskDetailResponseBody self = new GetApprovalTaskDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public GetApprovalTaskDetailResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public GetApprovalTaskDetailResponseBody setDetailInfo(GetApprovalTaskDetailResponseBodyDetailInfo detailInfo) {
        this.detailInfo = detailInfo;
        return this;
    }
    public GetApprovalTaskDetailResponseBodyDetailInfo getDetailInfo() {
        return this.detailInfo;
    }

    public GetApprovalTaskDetailResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetApprovalTaskDetailResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetApprovalTaskDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetApprovalTaskDetailResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetApprovalTaskDetailResponseBodyDetailInfoApproveProcessSteps extends TeaModel {
        /**
         * <p>The list of candidate approver IDs.</p>
         * 
         * <strong>example:</strong>
         * <p>user001,user002</p>
         */
        @NameInMap("ApproveUserIds")
        public String approveUserIds;

        /**
         * <p>The list of candidate approver names.</p>
         * 
         * <strong>example:</strong>
         * <p>Zhang San, Li Si</p>
         */
        @NameInMap("ApproveUserNames")
        public String approveUserNames;

        /**
         * <p>The operation time. Format: yyyy-MM-dd HH:mm:ss.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-07-30 11:00:00</p>
         */
        @NameInMap("OperateTime")
        public String operateTime;

        /**
         * <p>The ID of the operator.</p>
         * 
         * <strong>example:</strong>
         * <p>user001</p>
         */
        @NameInMap("OperateUserId")
        public String operateUserId;

        /**
         * <p>The name of the operator.</p>
         * 
         * <strong>example:</strong>
         * <p>Zhang San</p>
         */
        @NameInMap("OperateUserName")
        public String operateUserName;

        /**
         * <p>The operation.</p>
         * 
         * <strong>example:</strong>
         * <p>SUBMIT</p>
         */
        @NameInMap("Operation")
        public String operation;

        /**
         * <p>The step name.</p>
         * 
         * <strong>example:</strong>
         * <p>Submit application</p>
         */
        @NameInMap("ProcessStepName")
        public String processStepName;

        /**
         * <p>The approval comment.</p>
         * 
         * <strong>example:</strong>
         * <p>Approved</p>
         */
        @NameInMap("Reason")
        public String reason;

        /**
         * <p>The approval result.</p>
         * 
         * <strong>example:</strong>
         * <p>APPROVED</p>
         */
        @NameInMap("Result")
        public String result;

        public static GetApprovalTaskDetailResponseBodyDetailInfoApproveProcessSteps build(java.util.Map<String, ?> map) throws Exception {
            GetApprovalTaskDetailResponseBodyDetailInfoApproveProcessSteps self = new GetApprovalTaskDetailResponseBodyDetailInfoApproveProcessSteps();
            return TeaModel.build(map, self);
        }

        public GetApprovalTaskDetailResponseBodyDetailInfoApproveProcessSteps setApproveUserIds(String approveUserIds) {
            this.approveUserIds = approveUserIds;
            return this;
        }
        public String getApproveUserIds() {
            return this.approveUserIds;
        }

        public GetApprovalTaskDetailResponseBodyDetailInfoApproveProcessSteps setApproveUserNames(String approveUserNames) {
            this.approveUserNames = approveUserNames;
            return this;
        }
        public String getApproveUserNames() {
            return this.approveUserNames;
        }

        public GetApprovalTaskDetailResponseBodyDetailInfoApproveProcessSteps setOperateTime(String operateTime) {
            this.operateTime = operateTime;
            return this;
        }
        public String getOperateTime() {
            return this.operateTime;
        }

        public GetApprovalTaskDetailResponseBodyDetailInfoApproveProcessSteps setOperateUserId(String operateUserId) {
            this.operateUserId = operateUserId;
            return this;
        }
        public String getOperateUserId() {
            return this.operateUserId;
        }

        public GetApprovalTaskDetailResponseBodyDetailInfoApproveProcessSteps setOperateUserName(String operateUserName) {
            this.operateUserName = operateUserName;
            return this;
        }
        public String getOperateUserName() {
            return this.operateUserName;
        }

        public GetApprovalTaskDetailResponseBodyDetailInfoApproveProcessSteps setOperation(String operation) {
            this.operation = operation;
            return this;
        }
        public String getOperation() {
            return this.operation;
        }

        public GetApprovalTaskDetailResponseBodyDetailInfoApproveProcessSteps setProcessStepName(String processStepName) {
            this.processStepName = processStepName;
            return this;
        }
        public String getProcessStepName() {
            return this.processStepName;
        }

        public GetApprovalTaskDetailResponseBodyDetailInfoApproveProcessSteps setReason(String reason) {
            this.reason = reason;
            return this;
        }
        public String getReason() {
            return this.reason;
        }

        public GetApprovalTaskDetailResponseBodyDetailInfoApproveProcessSteps setResult(String result) {
            this.result = result;
            return this;
        }
        public String getResult() {
            return this.result;
        }

    }

    public static class GetApprovalTaskDetailResponseBodyDetailInfo extends TeaModel {
        /**
         * <p>The ID of the applicant.</p>
         * 
         * <strong>example:</strong>
         * <p>user001</p>
         */
        @NameInMap("ApplicantId")
        public String applicantId;

        /**
         * <p>The name of the applicant.</p>
         * 
         * <strong>example:</strong>
         * <p>Zhang San</p>
         */
        @NameInMap("ApplicantName")
        public String applicantName;

        /**
         * <p>The approval type. Valid values:</p>
         * <ul>
         * <li>APPROVE: Permission approval.</li>
         * <li>MANAGE: Management.</li>
         * <li>OTHERS: Others.</li>
         * <li>ATOMIC: Atomic metric approval.</li>
         * <li>BIZ_OBJECT: Business object approval.</li>
         * <li>BIZ_PROCESS: Business activity approval.</li>
         * <li>PUBLISH_APPROVE: Publish approval.</li>
         * <li>BASELINE_APPROVE: Baseline approval.</li>
         * <li>CODE_REVIEW: Asset approval.</li>
         * <li>OBJECT_CODE_REVIEW: Code review.</li>
         * <li>STANDARD_APPROVAL: Standard online approval.</li>
         * <li>BATCH_STANDARD_APPROVAL: Batch standard online approval.</li>
         * <li>STANDARD_OFFLINE_APPROVAL: Standard offline approval.</li>
         * <li>BATCH_STANDARD_OFFLINE_APPROVAL: Batch standard offline approval.</li>
         * <li>PRIVILEGE_TRANSFER_APPROVAL: Privilege transfer approval.</li>
         * <li>QD_FEATURE_ONLINE: Tag listing.</li>
         * <li>QD_FEATURE_OFFLINE: Tag delisting.</li>
         * <li>QD_CLUSTER_ONLINE: Group online.</li>
         * <li>QD_CLUSTER_OFFLINE: Group offline.</li>
         * <li>QD_MEMBER_ADD_APP: Member added to application.</li>
         * <li>QD_FEATURE_ADD_APP: Tag added to application.</li>
         * <li>QD_CLUSTER_ADD_APP: Group added to application.</li>
         * <li>QD_FEATURE_ADD_PROJECT: Tag added to project.</li>
         * <li>QD_CLUSTER_ADD_PROJECT: Group added to project.</li>
         * <li>TASK_DATA_DOWNLOAD: Data download.</li>
         * <li>CUSTOM_OPERATE: Custom operation.</li>
         * <li>PRIVACY_COMPUTING: Privacy-preserving computation.</li>
         * <li>MDC_TOPIC_DIR_PUBLISH: Asset topic directory publishing.</li>
         * <li>ASSET_PUBLISH: Asset listing approval.</li>
         * <li>ASSET_UN_PUBLISH: Asset delisting approval.</li>
         * <li>APPLICATION_CREATE: Application creation approval.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>DATA_SOURCE</p>
         */
        @NameInMap("ApprovalType")
        public String approvalType;

        /**
         * <p>The list of approval process steps.</p>
         */
        @NameInMap("ApproveProcessSteps")
        public java.util.List<GetApprovalTaskDetailResponseBodyDetailInfoApproveProcessSteps> approveProcessSteps;

        /**
         * <p>The JSON string of the task details.</p>
         * 
         * <strong>example:</strong>
         * <p>{}</p>
         */
        @NameInMap("BizContent")
        public String bizContent;

        /**
         * <p>The completion time. Format: yyyy-MM-dd HH:mm:ss. This field is empty if the task is not completed.</p>
         * 
         * <strong>example:</strong>
         * <p>2025-07-30 12:00:00</p>
         */
        @NameInMap("FinishedAt")
        public String finishedAt;

        /**
         * <p>The approval flow ID.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The source system.</p>
         * 
         * <strong>example:</strong>
         * <p>Dataphin</p>
         */
        @NameInMap("SourceSystem")
        public String sourceSystem;

        /**
         * <p>The approval status. Valid values:</p>
         * <ul>
         * <li>APPROVING: Approving.</li>
         * <li>APPROVED: Approved.</li>
         * <li>REJECTED: Rejected.</li>
         * <li>REVOKED: Revoked.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>APPROVED</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The submission time. Format: yyyy-MM-dd HH:mm:ss.</p>
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
         * <p>Data source application</p>
         */
        @NameInMap("Title")
        public String title;

        public static GetApprovalTaskDetailResponseBodyDetailInfo build(java.util.Map<String, ?> map) throws Exception {
            GetApprovalTaskDetailResponseBodyDetailInfo self = new GetApprovalTaskDetailResponseBodyDetailInfo();
            return TeaModel.build(map, self);
        }

        public GetApprovalTaskDetailResponseBodyDetailInfo setApplicantId(String applicantId) {
            this.applicantId = applicantId;
            return this;
        }
        public String getApplicantId() {
            return this.applicantId;
        }

        public GetApprovalTaskDetailResponseBodyDetailInfo setApplicantName(String applicantName) {
            this.applicantName = applicantName;
            return this;
        }
        public String getApplicantName() {
            return this.applicantName;
        }

        public GetApprovalTaskDetailResponseBodyDetailInfo setApprovalType(String approvalType) {
            this.approvalType = approvalType;
            return this;
        }
        public String getApprovalType() {
            return this.approvalType;
        }

        public GetApprovalTaskDetailResponseBodyDetailInfo setApproveProcessSteps(java.util.List<GetApprovalTaskDetailResponseBodyDetailInfoApproveProcessSteps> approveProcessSteps) {
            this.approveProcessSteps = approveProcessSteps;
            return this;
        }
        public java.util.List<GetApprovalTaskDetailResponseBodyDetailInfoApproveProcessSteps> getApproveProcessSteps() {
            return this.approveProcessSteps;
        }

        public GetApprovalTaskDetailResponseBodyDetailInfo setBizContent(String bizContent) {
            this.bizContent = bizContent;
            return this;
        }
        public String getBizContent() {
            return this.bizContent;
        }

        public GetApprovalTaskDetailResponseBodyDetailInfo setFinishedAt(String finishedAt) {
            this.finishedAt = finishedAt;
            return this;
        }
        public String getFinishedAt() {
            return this.finishedAt;
        }

        public GetApprovalTaskDetailResponseBodyDetailInfo setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetApprovalTaskDetailResponseBodyDetailInfo setSourceSystem(String sourceSystem) {
            this.sourceSystem = sourceSystem;
            return this;
        }
        public String getSourceSystem() {
            return this.sourceSystem;
        }

        public GetApprovalTaskDetailResponseBodyDetailInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetApprovalTaskDetailResponseBodyDetailInfo setSubmittedAt(String submittedAt) {
            this.submittedAt = submittedAt;
            return this;
        }
        public String getSubmittedAt() {
            return this.submittedAt;
        }

        public GetApprovalTaskDetailResponseBodyDetailInfo setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

}
