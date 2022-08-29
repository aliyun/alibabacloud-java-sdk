// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class SubmitCsccApprovalRequest extends TeaModel {
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

    public static SubmitCsccApprovalRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitCsccApprovalRequest self = new SubmitCsccApprovalRequest();
        return TeaModel.build(map, self);
    }

    public SubmitCsccApprovalRequest setApprovalAction(String approvalAction) {
        this.approvalAction = approvalAction;
        return this;
    }
    public String getApprovalAction() {
        return this.approvalAction;
    }

    public SubmitCsccApprovalRequest setApprovalId(Long approvalId) {
        this.approvalId = approvalId;
        return this;
    }
    public Long getApprovalId() {
        return this.approvalId;
    }

    public SubmitCsccApprovalRequest setApprovalState(Integer approvalState) {
        this.approvalState = approvalState;
        return this;
    }
    public Integer getApprovalState() {
        return this.approvalState;
    }

    public SubmitCsccApprovalRequest setApprovalStateName(String approvalStateName) {
        this.approvalStateName = approvalStateName;
        return this;
    }
    public String getApprovalStateName() {
        return this.approvalStateName;
    }

    public SubmitCsccApprovalRequest setApprovalType(Integer approvalType) {
        this.approvalType = approvalType;
        return this;
    }
    public Integer getApprovalType() {
        return this.approvalType;
    }

    public SubmitCsccApprovalRequest setApprovalTypeName(String approvalTypeName) {
        this.approvalTypeName = approvalTypeName;
        return this;
    }
    public String getApprovalTypeName() {
        return this.approvalTypeName;
    }

    public SubmitCsccApprovalRequest setApproverId(Long approverId) {
        this.approverId = approverId;
        return this;
    }
    public Long getApproverId() {
        return this.approverId;
    }

    public SubmitCsccApprovalRequest setApproverName(String approverName) {
        this.approverName = approverName;
        return this;
    }
    public String getApproverName() {
        return this.approverName;
    }

    public SubmitCsccApprovalRequest setApproverUserId(Long approverUserId) {
        this.approverUserId = approverUserId;
        return this;
    }
    public Long getApproverUserId() {
        return this.approverUserId;
    }

    public SubmitCsccApprovalRequest setCompanyName(String companyName) {
        this.companyName = companyName;
        return this;
    }
    public String getCompanyName() {
        return this.companyName;
    }

    public SubmitCsccApprovalRequest setCurrent(Boolean current) {
        this.current = current;
        return this;
    }
    public Boolean getCurrent() {
        return this.current;
    }

    public SubmitCsccApprovalRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public SubmitCsccApprovalRequest setExtend(String extend) {
        this.extend = extend;
        return this;
    }
    public String getExtend() {
        return this.extend;
    }

    public SubmitCsccApprovalRequest setFullCompanyName(String fullCompanyName) {
        this.fullCompanyName = fullCompanyName;
        return this;
    }
    public String getFullCompanyName() {
        return this.fullCompanyName;
    }

    public SubmitCsccApprovalRequest setGmtCreate(Long gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public Long getGmtCreate() {
        return this.gmtCreate;
    }

    public SubmitCsccApprovalRequest setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public SubmitCsccApprovalRequest setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public SubmitCsccApprovalRequest setJobId(Long jobId) {
        this.jobId = jobId;
        return this;
    }
    public Long getJobId() {
        return this.jobId;
    }

    public SubmitCsccApprovalRequest setJobName(String jobName) {
        this.jobName = jobName;
        return this;
    }
    public String getJobName() {
        return this.jobName;
    }

    public SubmitCsccApprovalRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public SubmitCsccApprovalRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public SubmitCsccApprovalRequest setProposerId(Long proposerId) {
        this.proposerId = proposerId;
        return this;
    }
    public Long getProposerId() {
        return this.proposerId;
    }

    public SubmitCsccApprovalRequest setProposerName(String proposerName) {
        this.proposerName = proposerName;
        return this;
    }
    public String getProposerName() {
        return this.proposerName;
    }

    public SubmitCsccApprovalRequest setRunEnvApprovalId(String runEnvApprovalId) {
        this.runEnvApprovalId = runEnvApprovalId;
        return this;
    }
    public String getRunEnvApprovalId() {
        return this.runEnvApprovalId;
    }

    public SubmitCsccApprovalRequest setRunEnvJobId(String runEnvJobId) {
        this.runEnvJobId = runEnvJobId;
        return this;
    }
    public String getRunEnvJobId() {
        return this.runEnvJobId;
    }

    public SubmitCsccApprovalRequest setServiceHost(String serviceHost) {
        this.serviceHost = serviceHost;
        return this;
    }
    public String getServiceHost() {
        return this.serviceHost;
    }

    public SubmitCsccApprovalRequest setServicePort(String servicePort) {
        this.servicePort = servicePort;
        return this;
    }
    public String getServicePort() {
        return this.servicePort;
    }

    public SubmitCsccApprovalRequest setSign(String sign) {
        this.sign = sign;
        return this;
    }
    public String getSign() {
        return this.sign;
    }

    public SubmitCsccApprovalRequest setSnapShot(String snapShot) {
        this.snapShot = snapShot;
        return this;
    }
    public String getSnapShot() {
        return this.snapShot;
    }

    public SubmitCsccApprovalRequest setToken(String token) {
        this.token = token;
        return this;
    }
    public String getToken() {
        return this.token;
    }

    public SubmitCsccApprovalRequest setTransportHost(String transportHost) {
        this.transportHost = transportHost;
        return this;
    }
    public String getTransportHost() {
        return this.transportHost;
    }

    public SubmitCsccApprovalRequest setTransportPort(String transportPort) {
        this.transportPort = transportPort;
        return this;
    }
    public String getTransportPort() {
        return this.transportPort;
    }

}
