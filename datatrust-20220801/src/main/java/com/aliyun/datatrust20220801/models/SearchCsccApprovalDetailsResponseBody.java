// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class SearchCsccApprovalDetailsResponseBody extends TeaModel {
    @NameInMap("Code")
    public Long code;

    @NameInMap("Data")
    public java.util.List<SearchCsccApprovalDetailsResponseBodyData> data;

    @NameInMap("HttpStatusCode")
    public Long httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static SearchCsccApprovalDetailsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SearchCsccApprovalDetailsResponseBody self = new SearchCsccApprovalDetailsResponseBody();
        return TeaModel.build(map, self);
    }

    public SearchCsccApprovalDetailsResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public SearchCsccApprovalDetailsResponseBody setData(java.util.List<SearchCsccApprovalDetailsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<SearchCsccApprovalDetailsResponseBodyData> getData() {
        return this.data;
    }

    public SearchCsccApprovalDetailsResponseBody setHttpStatusCode(Long httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Long getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public SearchCsccApprovalDetailsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SearchCsccApprovalDetailsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SearchCsccApprovalDetailsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SearchCsccApprovalDetailsResponseBodyData extends TeaModel {
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

        public static SearchCsccApprovalDetailsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SearchCsccApprovalDetailsResponseBodyData self = new SearchCsccApprovalDetailsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SearchCsccApprovalDetailsResponseBodyData setApprovalAction(String approvalAction) {
            this.approvalAction = approvalAction;
            return this;
        }
        public String getApprovalAction() {
            return this.approvalAction;
        }

        public SearchCsccApprovalDetailsResponseBodyData setApprovalId(Long approvalId) {
            this.approvalId = approvalId;
            return this;
        }
        public Long getApprovalId() {
            return this.approvalId;
        }

        public SearchCsccApprovalDetailsResponseBodyData setApprovalState(Integer approvalState) {
            this.approvalState = approvalState;
            return this;
        }
        public Integer getApprovalState() {
            return this.approvalState;
        }

        public SearchCsccApprovalDetailsResponseBodyData setApprovalStateName(String approvalStateName) {
            this.approvalStateName = approvalStateName;
            return this;
        }
        public String getApprovalStateName() {
            return this.approvalStateName;
        }

        public SearchCsccApprovalDetailsResponseBodyData setApprovalType(Integer approvalType) {
            this.approvalType = approvalType;
            return this;
        }
        public Integer getApprovalType() {
            return this.approvalType;
        }

        public SearchCsccApprovalDetailsResponseBodyData setApprovalTypeName(String approvalTypeName) {
            this.approvalTypeName = approvalTypeName;
            return this;
        }
        public String getApprovalTypeName() {
            return this.approvalTypeName;
        }

        public SearchCsccApprovalDetailsResponseBodyData setApproverId(Long approverId) {
            this.approverId = approverId;
            return this;
        }
        public Long getApproverId() {
            return this.approverId;
        }

        public SearchCsccApprovalDetailsResponseBodyData setApproverName(String approverName) {
            this.approverName = approverName;
            return this;
        }
        public String getApproverName() {
            return this.approverName;
        }

        public SearchCsccApprovalDetailsResponseBodyData setApproverUserId(Long approverUserId) {
            this.approverUserId = approverUserId;
            return this;
        }
        public Long getApproverUserId() {
            return this.approverUserId;
        }

        public SearchCsccApprovalDetailsResponseBodyData setCompanyName(String companyName) {
            this.companyName = companyName;
            return this;
        }
        public String getCompanyName() {
            return this.companyName;
        }

        public SearchCsccApprovalDetailsResponseBodyData setCurrent(Boolean current) {
            this.current = current;
            return this;
        }
        public Boolean getCurrent() {
            return this.current;
        }

        public SearchCsccApprovalDetailsResponseBodyData setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public SearchCsccApprovalDetailsResponseBodyData setExtend(String extend) {
            this.extend = extend;
            return this;
        }
        public String getExtend() {
            return this.extend;
        }

        public SearchCsccApprovalDetailsResponseBodyData setFullCompanyName(String fullCompanyName) {
            this.fullCompanyName = fullCompanyName;
            return this;
        }
        public String getFullCompanyName() {
            return this.fullCompanyName;
        }

        public SearchCsccApprovalDetailsResponseBodyData setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public SearchCsccApprovalDetailsResponseBodyData setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public SearchCsccApprovalDetailsResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public SearchCsccApprovalDetailsResponseBodyData setJobId(Long jobId) {
            this.jobId = jobId;
            return this;
        }
        public Long getJobId() {
            return this.jobId;
        }

        public SearchCsccApprovalDetailsResponseBodyData setJobName(String jobName) {
            this.jobName = jobName;
            return this;
        }
        public String getJobName() {
            return this.jobName;
        }

        public SearchCsccApprovalDetailsResponseBodyData setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public SearchCsccApprovalDetailsResponseBodyData setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public SearchCsccApprovalDetailsResponseBodyData setProposerId(Long proposerId) {
            this.proposerId = proposerId;
            return this;
        }
        public Long getProposerId() {
            return this.proposerId;
        }

        public SearchCsccApprovalDetailsResponseBodyData setProposerName(String proposerName) {
            this.proposerName = proposerName;
            return this;
        }
        public String getProposerName() {
            return this.proposerName;
        }

        public SearchCsccApprovalDetailsResponseBodyData setRunEnvApprovalId(String runEnvApprovalId) {
            this.runEnvApprovalId = runEnvApprovalId;
            return this;
        }
        public String getRunEnvApprovalId() {
            return this.runEnvApprovalId;
        }

        public SearchCsccApprovalDetailsResponseBodyData setRunEnvJobId(String runEnvJobId) {
            this.runEnvJobId = runEnvJobId;
            return this;
        }
        public String getRunEnvJobId() {
            return this.runEnvJobId;
        }

        public SearchCsccApprovalDetailsResponseBodyData setServiceHost(String serviceHost) {
            this.serviceHost = serviceHost;
            return this;
        }
        public String getServiceHost() {
            return this.serviceHost;
        }

        public SearchCsccApprovalDetailsResponseBodyData setServicePort(String servicePort) {
            this.servicePort = servicePort;
            return this;
        }
        public String getServicePort() {
            return this.servicePort;
        }

        public SearchCsccApprovalDetailsResponseBodyData setSign(String sign) {
            this.sign = sign;
            return this;
        }
        public String getSign() {
            return this.sign;
        }

        public SearchCsccApprovalDetailsResponseBodyData setSnapShot(String snapShot) {
            this.snapShot = snapShot;
            return this;
        }
        public String getSnapShot() {
            return this.snapShot;
        }

        public SearchCsccApprovalDetailsResponseBodyData setToken(String token) {
            this.token = token;
            return this;
        }
        public String getToken() {
            return this.token;
        }

        public SearchCsccApprovalDetailsResponseBodyData setTransportHost(String transportHost) {
            this.transportHost = transportHost;
            return this;
        }
        public String getTransportHost() {
            return this.transportHost;
        }

        public SearchCsccApprovalDetailsResponseBodyData setTransportPort(String transportPort) {
            this.transportPort = transportPort;
            return this;
        }
        public String getTransportPort() {
            return this.transportPort;
        }

    }

}
