// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.datatrust20220801.models;

import com.aliyun.tea.*;

public class DeleteOnlineServiceRequest extends TeaModel {
    @NameInMap("ApprovalStatus")
    public String approvalStatus;

    @NameInMap("CreatorId")
    public Long creatorId;

    @NameInMap("CreatorName")
    public String creatorName;

    @NameInMap("DeleteStatus")
    public Integer deleteStatus;

    @NameInMap("EndDate")
    public String endDate;

    @NameInMap("GmtModified")
    public String gmtModified;

    @NameInMap("JobId")
    public Long jobId;

    @NameInMap("JobName")
    public String jobName;

    @NameInMap("JobType")
    public Integer jobType;

    @NameInMap("JobTypeName")
    public String jobTypeName;

    @NameInMap("ProjectId")
    public Long projectId;

    @NameInMap("RunStatus")
    public Integer runStatus;

    @NameInMap("StartDate")
    public String startDate;

    @NameInMap("UpdateStatus")
    public Integer updateStatus;

    public static DeleteOnlineServiceRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteOnlineServiceRequest self = new DeleteOnlineServiceRequest();
        return TeaModel.build(map, self);
    }

    public DeleteOnlineServiceRequest setApprovalStatus(String approvalStatus) {
        this.approvalStatus = approvalStatus;
        return this;
    }
    public String getApprovalStatus() {
        return this.approvalStatus;
    }

    public DeleteOnlineServiceRequest setCreatorId(Long creatorId) {
        this.creatorId = creatorId;
        return this;
    }
    public Long getCreatorId() {
        return this.creatorId;
    }

    public DeleteOnlineServiceRequest setCreatorName(String creatorName) {
        this.creatorName = creatorName;
        return this;
    }
    public String getCreatorName() {
        return this.creatorName;
    }

    public DeleteOnlineServiceRequest setDeleteStatus(Integer deleteStatus) {
        this.deleteStatus = deleteStatus;
        return this;
    }
    public Integer getDeleteStatus() {
        return this.deleteStatus;
    }

    public DeleteOnlineServiceRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public DeleteOnlineServiceRequest setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public DeleteOnlineServiceRequest setJobId(Long jobId) {
        this.jobId = jobId;
        return this;
    }
    public Long getJobId() {
        return this.jobId;
    }

    public DeleteOnlineServiceRequest setJobName(String jobName) {
        this.jobName = jobName;
        return this;
    }
    public String getJobName() {
        return this.jobName;
    }

    public DeleteOnlineServiceRequest setJobType(Integer jobType) {
        this.jobType = jobType;
        return this;
    }
    public Integer getJobType() {
        return this.jobType;
    }

    public DeleteOnlineServiceRequest setJobTypeName(String jobTypeName) {
        this.jobTypeName = jobTypeName;
        return this;
    }
    public String getJobTypeName() {
        return this.jobTypeName;
    }

    public DeleteOnlineServiceRequest setProjectId(Long projectId) {
        this.projectId = projectId;
        return this;
    }
    public Long getProjectId() {
        return this.projectId;
    }

    public DeleteOnlineServiceRequest setRunStatus(Integer runStatus) {
        this.runStatus = runStatus;
        return this;
    }
    public Integer getRunStatus() {
        return this.runStatus;
    }

    public DeleteOnlineServiceRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

    public DeleteOnlineServiceRequest setUpdateStatus(Integer updateStatus) {
        this.updateStatus = updateStatus;
        return this;
    }
    public Integer getUpdateStatus() {
        return this.updateStatus;
    }

}
