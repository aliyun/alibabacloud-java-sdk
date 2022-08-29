// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class ListCsccApprovalsResponseBody extends TeaModel {
    @NameInMap("Code")
    public Long code;

    @NameInMap("Data")
    public ListCsccApprovalsResponseBodyData data;

    @NameInMap("HttpStatusCode")
    public Long httpStatusCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Success")
    public Boolean success;

    public static ListCsccApprovalsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCsccApprovalsResponseBody self = new ListCsccApprovalsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCsccApprovalsResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public ListCsccApprovalsResponseBody setData(ListCsccApprovalsResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ListCsccApprovalsResponseBodyData getData() {
        return this.data;
    }

    public ListCsccApprovalsResponseBody setHttpStatusCode(Long httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Long getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public ListCsccApprovalsResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ListCsccApprovalsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListCsccApprovalsResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class ListCsccApprovalsResponseBodyDataContent extends TeaModel {
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

        public static ListCsccApprovalsResponseBodyDataContent build(java.util.Map<String, ?> map) throws Exception {
            ListCsccApprovalsResponseBodyDataContent self = new ListCsccApprovalsResponseBodyDataContent();
            return TeaModel.build(map, self);
        }

        public ListCsccApprovalsResponseBodyDataContent setApprovalId(Long approvalId) {
            this.approvalId = approvalId;
            return this;
        }
        public Long getApprovalId() {
            return this.approvalId;
        }

        public ListCsccApprovalsResponseBodyDataContent setApprovalState(Integer approvalState) {
            this.approvalState = approvalState;
            return this;
        }
        public Integer getApprovalState() {
            return this.approvalState;
        }

        public ListCsccApprovalsResponseBodyDataContent setApprovalStateName(String approvalStateName) {
            this.approvalStateName = approvalStateName;
            return this;
        }
        public String getApprovalStateName() {
            return this.approvalStateName;
        }

        public ListCsccApprovalsResponseBodyDataContent setApprovalType(Integer approvalType) {
            this.approvalType = approvalType;
            return this;
        }
        public Integer getApprovalType() {
            return this.approvalType;
        }

        public ListCsccApprovalsResponseBodyDataContent setApprovalTypeName(String approvalTypeName) {
            this.approvalTypeName = approvalTypeName;
            return this;
        }
        public String getApprovalTypeName() {
            return this.approvalTypeName;
        }

        public ListCsccApprovalsResponseBodyDataContent setCompanyName(String companyName) {
            this.companyName = companyName;
            return this;
        }
        public String getCompanyName() {
            return this.companyName;
        }

        public ListCsccApprovalsResponseBodyDataContent setFullCompanyName(String fullCompanyName) {
            this.fullCompanyName = fullCompanyName;
            return this;
        }
        public String getFullCompanyName() {
            return this.fullCompanyName;
        }

        public ListCsccApprovalsResponseBodyDataContent setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public ListCsccApprovalsResponseBodyDataContent setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ListCsccApprovalsResponseBodyDataContent setJobId(Long jobId) {
            this.jobId = jobId;
            return this;
        }
        public Long getJobId() {
            return this.jobId;
        }

        public ListCsccApprovalsResponseBodyDataContent setJobName(String jobName) {
            this.jobName = jobName;
            return this;
        }
        public String getJobName() {
            return this.jobName;
        }

        public ListCsccApprovalsResponseBodyDataContent setProjectId(Long projectId) {
            this.projectId = projectId;
            return this;
        }
        public Long getProjectId() {
            return this.projectId;
        }

        public ListCsccApprovalsResponseBodyDataContent setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

        public ListCsccApprovalsResponseBodyDataContent setProposerId(Long proposerId) {
            this.proposerId = proposerId;
            return this;
        }
        public Long getProposerId() {
            return this.proposerId;
        }

        public ListCsccApprovalsResponseBodyDataContent setProposerName(String proposerName) {
            this.proposerName = proposerName;
            return this;
        }
        public String getProposerName() {
            return this.proposerName;
        }

        public ListCsccApprovalsResponseBodyDataContent setServiceHost(String serviceHost) {
            this.serviceHost = serviceHost;
            return this;
        }
        public String getServiceHost() {
            return this.serviceHost;
        }

        public ListCsccApprovalsResponseBodyDataContent setServicePort(String servicePort) {
            this.servicePort = servicePort;
            return this;
        }
        public String getServicePort() {
            return this.servicePort;
        }

        public ListCsccApprovalsResponseBodyDataContent setSnapShot(String snapShot) {
            this.snapShot = snapShot;
            return this;
        }
        public String getSnapShot() {
            return this.snapShot;
        }

        public ListCsccApprovalsResponseBodyDataContent setToken(String token) {
            this.token = token;
            return this;
        }
        public String getToken() {
            return this.token;
        }

        public ListCsccApprovalsResponseBodyDataContent setTransportHost(String transportHost) {
            this.transportHost = transportHost;
            return this;
        }
        public String getTransportHost() {
            return this.transportHost;
        }

        public ListCsccApprovalsResponseBodyDataContent setTransportPort(String transportPort) {
            this.transportPort = transportPort;
            return this;
        }
        public String getTransportPort() {
            return this.transportPort;
        }

    }

    public static class ListCsccApprovalsResponseBodyData extends TeaModel {
        @NameInMap("Content")
        public java.util.List<ListCsccApprovalsResponseBodyDataContent> content;

        @NameInMap("PageSize")
        public Integer pageSize;

        @NameInMap("TotalCount")
        public Integer totalCount;

        public static ListCsccApprovalsResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ListCsccApprovalsResponseBodyData self = new ListCsccApprovalsResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ListCsccApprovalsResponseBodyData setContent(java.util.List<ListCsccApprovalsResponseBodyDataContent> content) {
            this.content = content;
            return this;
        }
        public java.util.List<ListCsccApprovalsResponseBodyDataContent> getContent() {
            return this.content;
        }

        public ListCsccApprovalsResponseBodyData setPageSize(Integer pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Integer getPageSize() {
            return this.pageSize;
        }

        public ListCsccApprovalsResponseBodyData setTotalCount(Integer totalCount) {
            this.totalCount = totalCount;
            return this;
        }
        public Integer getTotalCount() {
            return this.totalCount;
        }

    }

}
