// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class SearchCsccApprovalsRequest extends TeaModel {
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

    public static SearchCsccApprovalsRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchCsccApprovalsRequest self = new SearchCsccApprovalsRequest();
        return TeaModel.build(map, self);
    }

    public SearchCsccApprovalsRequest setApprovalId(Long approvalId) {
        this.approvalId = approvalId;
        return this;
    }
    public Long getApprovalId() {
        return this.approvalId;
    }

    public SearchCsccApprovalsRequest setApprovalState(Integer approvalState) {
        this.approvalState = approvalState;
        return this;
    }
    public Integer getApprovalState() {
        return this.approvalState;
    }

    public SearchCsccApprovalsRequest setApprovalStateName(String approvalStateName) {
        this.approvalStateName = approvalStateName;
        return this;
    }
    public String getApprovalStateName() {
        return this.approvalStateName;
    }

    public SearchCsccApprovalsRequest setApprovalType(Integer approvalType) {
        this.approvalType = approvalType;
        return this;
    }
    public Integer getApprovalType() {
        return this.approvalType;
    }

    public SearchCsccApprovalsRequest setApprovalTypeName(String approvalTypeName) {
        this.approvalTypeName = approvalTypeName;
        return this;
    }
    public String getApprovalTypeName() {
        return this.approvalTypeName;
    }

    public SearchCsccApprovalsRequest setCompanyName(String companyName) {
        this.companyName = companyName;
        return this;
    }
    public String getCompanyName() {
        return this.companyName;
    }

    public SearchCsccApprovalsRequest setFullCompanyName(String fullCompanyName) {
        this.fullCompanyName = fullCompanyName;
        return this;
    }
    public String getFullCompanyName() {
        return this.fullCompanyName;
    }

    public SearchCsccApprovalsRequest setGmtCreate(Long gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public Long getGmtCreate() {
        return this.gmtCreate;
    }

    public SearchCsccApprovalsRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public SearchCsccApprovalsRequest setJobId(Long jobId) {
        this.jobId = jobId;
        return this;
    }
    public Long getJobId() {
        return this.jobId;
    }

    public SearchCsccApprovalsRequest setJobName(String jobName) {
        this.jobName = jobName;
        return this;
    }
    public String getJobName() {
        return this.jobName;
    }

    public SearchCsccApprovalsRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public SearchCsccApprovalsRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public SearchCsccApprovalsRequest setProposerId(Long proposerId) {
        this.proposerId = proposerId;
        return this;
    }
    public Long getProposerId() {
        return this.proposerId;
    }

    public SearchCsccApprovalsRequest setProposerName(String proposerName) {
        this.proposerName = proposerName;
        return this;
    }
    public String getProposerName() {
        return this.proposerName;
    }

    public SearchCsccApprovalsRequest setServiceHost(String serviceHost) {
        this.serviceHost = serviceHost;
        return this;
    }
    public String getServiceHost() {
        return this.serviceHost;
    }

    public SearchCsccApprovalsRequest setServicePort(String servicePort) {
        this.servicePort = servicePort;
        return this;
    }
    public String getServicePort() {
        return this.servicePort;
    }

    public SearchCsccApprovalsRequest setSnapShot(String snapShot) {
        this.snapShot = snapShot;
        return this;
    }
    public String getSnapShot() {
        return this.snapShot;
    }

    public SearchCsccApprovalsRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

    public SearchCsccApprovalsRequest setTransportHost(String transportHost) {
        this.transportHost = transportHost;
        return this;
    }
    public String getTransportHost() {
        return this.transportHost;
    }

    public SearchCsccApprovalsRequest setTransportPort(String transportPort) {
        this.transportPort = transportPort;
        return this;
    }
    public String getTransportPort() {
        return this.transportPort;
    }

}
