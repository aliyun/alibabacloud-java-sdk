// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class GetCsccApprovalFlowResponseBody extends TeaModel {
    @NameInMap("Code")
    public Long code;

    @NameInMap("Data")
    public GetCsccApprovalFlowResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Long httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static GetCsccApprovalFlowResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCsccApprovalFlowResponseBody self = new GetCsccApprovalFlowResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCsccApprovalFlowResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public GetCsccApprovalFlowResponseBody setData(GetCsccApprovalFlowResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetCsccApprovalFlowResponseBodyData getData() {
        return this.data;
    }

    public GetCsccApprovalFlowResponseBody setHttpStatusCode(Long httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Long getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetCsccApprovalFlowResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetCsccApprovalFlowResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetCsccApprovalFlowResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetCsccApprovalFlowResponseBodyDataApproverDtos extends TeaModel {
        @NameInMap("ApprovalAction")
        public String approvalAction;

        @NameInMap("ApprovalId")
        public Long approvalId;

        @NameInMap("ApprovalState")
        public Integer approvalState;

        @NameInMap("ApprovalStateName")
        public String approvalStateName;

        @NameInMap("ApprovalType")
        public Integer approvalType;

        @NameInMap("ApprovalTypeName")
        public String approvalTypeName;

        @NameInMap("ApproverId")
        public Long approverId;

        @NameInMap("ApproverName")
        public String approverName;

        @NameInMap("ApproverUserId")
        public Long approverUserId;

        @NameInMap("CompanyName")
        public String companyName;

        @NameInMap("Current")
        public Boolean current;

        @NameInMap("Description")
        public String description;

        @NameInMap("Extend")
        public String extend;

        @NameInMap("FullCompanyName")
        public String fullCompanyName;

        @NameInMap("GmtCreate")
        public Long gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("Id")
        public Long id;

        @NameInMap("JobId")
        public Long jobId;

        @NameInMap("JobName")
        public String jobName;

        @NameInMap("ProjectId")
        public Long projectId;

        @NameInMap("ProjectName")
        public String projectName;

        @NameInMap("ProposerId")
        public Long proposerId;

        @NameInMap("ProposerName")
        public String proposerName;

        @NameInMap("RunEnvApprovalId")
        public String runEnvApprovalId;

        @NameInMap("RunEnvJobId")
        public String runEnvJobId;

        @NameInMap("ServiceHost")
        public String serviceHost;

        @NameInMap("ServicePort")
        public String servicePort;

        @NameInMap("Sign")
        public String sign;

        @NameInMap("SnapShot")
        public String snapShot;

        @NameInMap("Token")
        public String token;

        @NameInMap("TransportHost")
        public String transportHost;

        @NameInMap("TransportPort")
        public String transportPort;

        public static GetCsccApprovalFlowResponseBodyDataApproverDtos build(java.util.Map<String, ?> map) throws Exception {
            GetCsccApprovalFlowResponseBodyDataApproverDtos self = new GetCsccApprovalFlowResponseBodyDataApproverDtos();
            return TeaModel.build(map, self);
        }

        public GetCsccApprovalFlowResponseBodyDataApproverDtos setApprovalAction(String approvalAction) {
            this.approvalAction = approvalAction;
            return this;
        }
        public String getApprovalAction() {
            return this.approvalAction;
        }

        public GetCsccApprovalFlowResponseBodyDataApproverDtos setApprovalId(Long approvalId) {
            this.approvalId = approvalId;
            return this;
        }
        public Long getApprovalId() {
            return this.approvalId;
        }

        public GetCsccApprovalFlowResponseBodyDataApproverDtos setApprovalState(Integer approvalState) {
            this.approvalState = approvalState;
            return this;
        }
        public Integer getApprovalState() {
            return this.approvalState;
        }

        public GetCsccApprovalFlowResponseBodyDataApproverDtos setApprovalStateName(String approvalStateName) {
            this.approvalStateName = approvalStateName;
            return this;
        }
        public String getApprovalStateName() {
            return this.approvalStateName;
        }

        public GetCsccApprovalFlowResponseBodyDataApproverDtos setApprovalType(Integer approvalType) {
            this.approvalType = approvalType;
            return this;
        }
        public Integer getApprovalType() {
            return this.approvalType;
        }

        public GetCsccApprovalFlowResponseBodyDataApproverDtos setApprovalTypeName(String approvalTypeName) {
            this.approvalTypeName = approvalTypeName;
            return this;
        }
        public String getApprovalTypeName() {
            return this.approvalTypeName;
        }

        public GetCsccApprovalFlowResponseBodyDataApproverDtos setApproverId(Long approverId) {
            this.approverId = approverId;
            return this;
        }
        public Long getApproverId() {
            return this.approverId;
        }

        public GetCsccApprovalFlowResponseBodyDataApproverDtos setApproverName(String approverName) {
            this.approverName = approverName;
            return this;
        }
        public String getApproverName() {
            return this.approverName;
        }

        public GetCsccApprovalFlowResponseBodyDataApproverDtos setApproverUserId(Long approverUserId) {
            this.approverUserId = approverUserId;
            return this;
        }
        public Long getApproverUserId() {
            return this.approverUserId;
        }

        public GetCsccApprovalFlowResponseBodyDataApproverDtos setCompanyName(String companyName) {
            this.companyName = companyName;
            return this;
        }
        public String getCompanyName() {
            return this.companyName;
        }

        public GetCsccApprovalFlowResponseBodyDataApproverDtos setCurrent(Boolean current) {
            this.current = current;
            return this;
        }
        public Boolean getCurrent() {
            return this.current;
        }

        public GetCsccApprovalFlowResponseBodyDataApproverDtos setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetCsccApprovalFlowResponseBodyDataApproverDtos setExtend(String extend) {
            this.extend = extend;
            return this;
        }
        public String getExtend() {
            return this.extend;
        }

        public GetCsccApprovalFlowResponseBodyDataApproverDtos setFullCompanyName(String fullCompanyName) {
            this.fullCompanyName = fullCompanyName;
            return this;
        }
        public String getFullCompanyName() {
            return this.fullCompanyName;
        }

        public GetCsccApprovalFlowResponseBodyDataApproverDtos setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public GetCsccApprovalFlowResponseBodyDataApproverDtos setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetCsccApprovalFlowResponseBodyDataApproverDtos setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetCsccApprovalFlowResponseBodyDataApproverDtos setJobId(Long jobId) {
            this.jobId = jobId;
            return this;
        }
        public Long getJobId() {
            return this.jobId;
        }

        public GetCsccApprovalFlowResponseBodyDataApproverDtos setJobName(String jobName) {
            this.jobName = jobName;
            return this;
        }
        public String getJobName() {
            return this.jobName;
        }

        public GetCsccApprovalFlowResponseBodyDataApproverDtos setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public GetCsccApprovalFlowResponseBodyDataApproverDtos setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public GetCsccApprovalFlowResponseBodyDataApproverDtos setProposerId(Long proposerId) {
            this.proposerId = proposerId;
            return this;
        }
        public Long getProposerId() {
            return this.proposerId;
        }

        public GetCsccApprovalFlowResponseBodyDataApproverDtos setProposerName(String proposerName) {
            this.proposerName = proposerName;
            return this;
        }
        public String getProposerName() {
            return this.proposerName;
        }

        public GetCsccApprovalFlowResponseBodyDataApproverDtos setRunEnvApprovalId(String runEnvApprovalId) {
            this.runEnvApprovalId = runEnvApprovalId;
            return this;
        }
        public String getRunEnvApprovalId() {
            return this.runEnvApprovalId;
        }

        public GetCsccApprovalFlowResponseBodyDataApproverDtos setRunEnvJobId(String runEnvJobId) {
            this.runEnvJobId = runEnvJobId;
            return this;
        }
        public String getRunEnvJobId() {
            return this.runEnvJobId;
        }

        public GetCsccApprovalFlowResponseBodyDataApproverDtos setServiceHost(String serviceHost) {
            this.serviceHost = serviceHost;
            return this;
        }
        public String getServiceHost() {
            return this.serviceHost;
        }

        public GetCsccApprovalFlowResponseBodyDataApproverDtos setServicePort(String servicePort) {
            this.servicePort = servicePort;
            return this;
        }
        public String getServicePort() {
            return this.servicePort;
        }

        public GetCsccApprovalFlowResponseBodyDataApproverDtos setSign(String sign) {
            this.sign = sign;
            return this;
        }
        public String getSign() {
            return this.sign;
        }

        public GetCsccApprovalFlowResponseBodyDataApproverDtos setSnapShot(String snapShot) {
            this.snapShot = snapShot;
            return this;
        }
        public String getSnapShot() {
            return this.snapShot;
        }

        public GetCsccApprovalFlowResponseBodyDataApproverDtos setToken(String token) {
            this.token = token;
            return this;
        }
        public String getToken() {
            return this.token;
        }

        public GetCsccApprovalFlowResponseBodyDataApproverDtos setTransportHost(String transportHost) {
            this.transportHost = transportHost;
            return this;
        }
        public String getTransportHost() {
            return this.transportHost;
        }

        public GetCsccApprovalFlowResponseBodyDataApproverDtos setTransportPort(String transportPort) {
            this.transportPort = transportPort;
            return this;
        }
        public String getTransportPort() {
            return this.transportPort;
        }

    }

    public static class GetCsccApprovalFlowResponseBodyData extends TeaModel {
        @NameInMap("ApproverDtos")
        public java.util.List<GetCsccApprovalFlowResponseBodyDataApproverDtos> approverDtos;

        @NameInMap("CancelPermission")
        public Boolean cancelPermission;

        @NameInMap("SubmitPermission")
        public Boolean submitPermission;

        public static GetCsccApprovalFlowResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetCsccApprovalFlowResponseBodyData self = new GetCsccApprovalFlowResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetCsccApprovalFlowResponseBodyData setApproverDtos(java.util.List<GetCsccApprovalFlowResponseBodyDataApproverDtos> approverDtos) {
            this.approverDtos = approverDtos;
            return this;
        }
        public java.util.List<GetCsccApprovalFlowResponseBodyDataApproverDtos> getApproverDtos() {
            return this.approverDtos;
        }

        public GetCsccApprovalFlowResponseBodyData setCancelPermission(Boolean cancelPermission) {
            this.cancelPermission = cancelPermission;
            return this;
        }
        public Boolean getCancelPermission() {
            return this.cancelPermission;
        }

        public GetCsccApprovalFlowResponseBodyData setSubmitPermission(Boolean submitPermission) {
            this.submitPermission = submitPermission;
            return this;
        }
        public Boolean getSubmitPermission() {
            return this.submitPermission;
        }

    }

}
