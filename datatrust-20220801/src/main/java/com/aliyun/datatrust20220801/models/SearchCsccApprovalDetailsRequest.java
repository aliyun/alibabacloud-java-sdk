// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class SearchCsccApprovalDetailsRequest extends TeaModel {
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

    public static SearchCsccApprovalDetailsRequest build(java.util.Map<String, ?> map) throws Exception {
        SearchCsccApprovalDetailsRequest self = new SearchCsccApprovalDetailsRequest();
        return TeaModel.build(map, self);
    }

    public SearchCsccApprovalDetailsRequest setApprovalAction(String approvalAction) {
        this.approvalAction = approvalAction;
        return this;
    }
    public String getApprovalAction() {
        return this.approvalAction;
    }

    public SearchCsccApprovalDetailsRequest setApprovalId(Long approvalId) {
        this.approvalId = approvalId;
        return this;
    }
    public Long getApprovalId() {
        return this.approvalId;
    }

    public SearchCsccApprovalDetailsRequest setApprovalState(Integer approvalState) {
        this.approvalState = approvalState;
        return this;
    }
    public Integer getApprovalState() {
        return this.approvalState;
    }

    public SearchCsccApprovalDetailsRequest setApprovalStateName(String approvalStateName) {
        this.approvalStateName = approvalStateName;
        return this;
    }
    public String getApprovalStateName() {
        return this.approvalStateName;
    }

    public SearchCsccApprovalDetailsRequest setApprovalType(Integer approvalType) {
        this.approvalType = approvalType;
        return this;
    }
    public Integer getApprovalType() {
        return this.approvalType;
    }

    public SearchCsccApprovalDetailsRequest setApprovalTypeName(String approvalTypeName) {
        this.approvalTypeName = approvalTypeName;
        return this;
    }
    public String getApprovalTypeName() {
        return this.approvalTypeName;
    }

    public SearchCsccApprovalDetailsRequest setApproverId(Long approverId) {
        this.approverId = approverId;
        return this;
    }
    public Long getApproverId() {
        return this.approverId;
    }

    public SearchCsccApprovalDetailsRequest setApproverName(String approverName) {
        this.approverName = approverName;
        return this;
    }
    public String getApproverName() {
        return this.approverName;
    }

    public SearchCsccApprovalDetailsRequest setApproverUserId(Long approverUserId) {
        this.approverUserId = approverUserId;
        return this;
    }
    public Long getApproverUserId() {
        return this.approverUserId;
    }

    public SearchCsccApprovalDetailsRequest setCompanyName(String companyName) {
        this.companyName = companyName;
        return this;
    }
    public String getCompanyName() {
        return this.companyName;
    }

    public SearchCsccApprovalDetailsRequest setCurrent(Boolean current) {
        this.current = current;
        return this;
    }
    public Boolean getCurrent() {
        return this.current;
    }

    public SearchCsccApprovalDetailsRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public SearchCsccApprovalDetailsRequest setExtend(String extend) {
        this.extend = extend;
        return this;
    }
    public String getExtend() {
        return this.extend;
    }

    public SearchCsccApprovalDetailsRequest setFullCompanyName(String fullCompanyName) {
        this.fullCompanyName = fullCompanyName;
        return this;
    }
    public String getFullCompanyName() {
        return this.fullCompanyName;
    }

    public SearchCsccApprovalDetailsRequest setGmtCreate(Long gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public Long getGmtCreate() {
        return this.gmtCreate;
    }

    public SearchCsccApprovalDetailsRequest setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public SearchCsccApprovalDetailsRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public SearchCsccApprovalDetailsRequest setJobId(Long jobId) {
        this.jobId = jobId;
        return this;
    }
    public Long getJobId() {
        return this.jobId;
    }

    public SearchCsccApprovalDetailsRequest setJobName(String jobName) {
        this.jobName = jobName;
        return this;
    }
    public String getJobName() {
        return this.jobName;
    }

    public SearchCsccApprovalDetailsRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public SearchCsccApprovalDetailsRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public SearchCsccApprovalDetailsRequest setProposerId(Long proposerId) {
        this.proposerId = proposerId;
        return this;
    }
    public Long getProposerId() {
        return this.proposerId;
    }

    public SearchCsccApprovalDetailsRequest setProposerName(String proposerName) {
        this.proposerName = proposerName;
        return this;
    }
    public String getProposerName() {
        return this.proposerName;
    }

    public SearchCsccApprovalDetailsRequest setRunEnvApprovalId(String runEnvApprovalId) {
        this.runEnvApprovalId = runEnvApprovalId;
        return this;
    }
    public String getRunEnvApprovalId() {
        return this.runEnvApprovalId;
    }

    public SearchCsccApprovalDetailsRequest setRunEnvJobId(String runEnvJobId) {
        this.runEnvJobId = runEnvJobId;
        return this;
    }
    public String getRunEnvJobId() {
        return this.runEnvJobId;
    }

    public SearchCsccApprovalDetailsRequest setServiceHost(String serviceHost) {
        this.serviceHost = serviceHost;
        return this;
    }
    public String getServiceHost() {
        return this.serviceHost;
    }

    public SearchCsccApprovalDetailsRequest setServicePort(String servicePort) {
        this.servicePort = servicePort;
        return this;
    }
    public String getServicePort() {
        return this.servicePort;
    }

    public SearchCsccApprovalDetailsRequest setSign(String sign) {
        this.sign = sign;
        return this;
    }
    public String getSign() {
        return this.sign;
    }

    public SearchCsccApprovalDetailsRequest setSnapShot(String snapShot) {
        this.snapShot = snapShot;
        return this;
    }
    public String getSnapShot() {
        return this.snapShot;
    }

    public SearchCsccApprovalDetailsRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

    public SearchCsccApprovalDetailsRequest setTransportHost(String transportHost) {
        this.transportHost = transportHost;
        return this;
    }
    public String getTransportHost() {
        return this.transportHost;
    }

    public SearchCsccApprovalDetailsRequest setTransportPort(String transportPort) {
        this.transportPort = transportPort;
        return this;
    }
    public String getTransportPort() {
        return this.transportPort;
    }

}
