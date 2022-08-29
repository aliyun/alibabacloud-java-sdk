// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class SearchCsccApprovalsResponseBody extends TeaModel {
    @NameInMap("Code")
    public Long code;

    @NameInMap("Data")
    public java.util.List<SearchCsccApprovalsResponseBodyData> data;

    @NameInMap("HttpStatusCode")
    public Long httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static SearchCsccApprovalsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SearchCsccApprovalsResponseBody self = new SearchCsccApprovalsResponseBody();
        return TeaModel.build(map, self);
    }

    public SearchCsccApprovalsResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public SearchCsccApprovalsResponseBody setData(java.util.List<SearchCsccApprovalsResponseBodyData> data) {
        this.data = data;
        return this;
    }
    public java.util.List<SearchCsccApprovalsResponseBodyData> getData() {
        return this.data;
    }

    public SearchCsccApprovalsResponseBody setHttpStatusCode(Long httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Long getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public SearchCsccApprovalsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public SearchCsccApprovalsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SearchCsccApprovalsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class SearchCsccApprovalsResponseBodyData extends TeaModel {
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

        @NameInMap("CompanyName")
        public String companyName;

        @NameInMap("FullCompanyName")
        public String fullCompanyName;

        @NameInMap("GmtCreate")
        public Long gmtCreate;

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

        @NameInMap("ServiceHost")
        public String serviceHost;

        @NameInMap("ServicePort")
        public String servicePort;

        @NameInMap("SnapShot")
        public String snapShot;

        @NameInMap("Token")
        public String token;

        @NameInMap("TransportHost")
        public String transportHost;

        @NameInMap("TransportPort")
        public String transportPort;

        public static SearchCsccApprovalsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            SearchCsccApprovalsResponseBodyData self = new SearchCsccApprovalsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public SearchCsccApprovalsResponseBodyData setApprovalId(Long approvalId) {
            this.approvalId = approvalId;
            return this;
        }
        public Long getApprovalId() {
            return this.approvalId;
        }

        public SearchCsccApprovalsResponseBodyData setApprovalState(Integer approvalState) {
            this.approvalState = approvalState;
            return this;
        }
        public Integer getApprovalState() {
            return this.approvalState;
        }

        public SearchCsccApprovalsResponseBodyData setApprovalStateName(String approvalStateName) {
            this.approvalStateName = approvalStateName;
            return this;
        }
        public String getApprovalStateName() {
            return this.approvalStateName;
        }

        public SearchCsccApprovalsResponseBodyData setApprovalType(Integer approvalType) {
            this.approvalType = approvalType;
            return this;
        }
        public Integer getApprovalType() {
            return this.approvalType;
        }

        public SearchCsccApprovalsResponseBodyData setApprovalTypeName(String approvalTypeName) {
            this.approvalTypeName = approvalTypeName;
            return this;
        }
        public String getApprovalTypeName() {
            return this.approvalTypeName;
        }

        public SearchCsccApprovalsResponseBodyData setCompanyName(String companyName) {
            this.companyName = companyName;
            return this;
        }
        public String getCompanyName() {
            return this.companyName;
        }

        public SearchCsccApprovalsResponseBodyData setFullCompanyName(String fullCompanyName) {
            this.fullCompanyName = fullCompanyName;
            return this;
        }
        public String getFullCompanyName() {
            return this.fullCompanyName;
        }

        public SearchCsccApprovalsResponseBodyData setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public SearchCsccApprovalsResponseBodyData setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public SearchCsccApprovalsResponseBodyData setJobId(Long jobId) {
            this.jobId = jobId;
            return this;
        }
        public Long getJobId() {
            return this.jobId;
        }

        public SearchCsccApprovalsResponseBodyData setJobName(String jobName) {
            this.jobName = jobName;
            return this;
        }
        public String getJobName() {
            return this.jobName;
        }

        public SearchCsccApprovalsResponseBodyData setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public SearchCsccApprovalsResponseBodyData setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public SearchCsccApprovalsResponseBodyData setProposerId(Long proposerId) {
            this.proposerId = proposerId;
            return this;
        }
        public Long getProposerId() {
            return this.proposerId;
        }

        public SearchCsccApprovalsResponseBodyData setProposerName(String proposerName) {
            this.proposerName = proposerName;
            return this;
        }
        public String getProposerName() {
            return this.proposerName;
        }

        public SearchCsccApprovalsResponseBodyData setServiceHost(String serviceHost) {
            this.serviceHost = serviceHost;
            return this;
        }
        public String getServiceHost() {
            return this.serviceHost;
        }

        public SearchCsccApprovalsResponseBodyData setServicePort(String servicePort) {
            this.servicePort = servicePort;
            return this;
        }
        public String getServicePort() {
            return this.servicePort;
        }

        public SearchCsccApprovalsResponseBodyData setSnapShot(String snapShot) {
            this.snapShot = snapShot;
            return this;
        }
        public String getSnapShot() {
            return this.snapShot;
        }

        public SearchCsccApprovalsResponseBodyData setToken(String token) {
            this.token = token;
            return this;
        }
        public String getToken() {
            return this.token;
        }

        public SearchCsccApprovalsResponseBodyData setTransportHost(String transportHost) {
            this.transportHost = transportHost;
            return this;
        }
        public String getTransportHost() {
            return this.transportHost;
        }

        public SearchCsccApprovalsResponseBodyData setTransportPort(String transportPort) {
            this.transportPort = transportPort;
            return this;
        }
        public String getTransportPort() {
            return this.transportPort;
        }

    }

}
