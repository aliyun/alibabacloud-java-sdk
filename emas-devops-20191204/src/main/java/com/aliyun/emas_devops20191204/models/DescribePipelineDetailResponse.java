// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.emas_devops20191204.models;

import com.aliyun.tea.*;

public class DescribePipelineDetailResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("CurrentExecJobs")
    @Validation(required = true)
    public Integer currentExecJobs;

    @NameInMap("PipelineInstanceId")
    @Validation(required = true)
    public String pipelineInstanceId;

    @NameInMap("Status")
    @Validation(required = true)
    public String status;

    @NameInMap("DslJson")
    @Validation(required = true)
    public String dslJson;

    @NameInMap("Operator")
    @Validation(required = true)
    public String operator;

    @NameInMap("StartTime")
    @Validation(required = true)
    public String startTime;

    @NameInMap("EndTime")
    @Validation(required = true)
    public String endTime;

    @NameInMap("PipelineDefinitionName")
    @Validation(required = true)
    public String pipelineDefinitionName;

    @NameInMap("PipelineArtifacts")
    @Validation(required = true)
    public java.util.List<DescribePipelineDetailResponsePipelineArtifacts> pipelineArtifacts;

    @NameInMap("JobDetails")
    @Validation(required = true)
    public java.util.List<DescribePipelineDetailResponseJobDetails> jobDetails;

    public static DescribePipelineDetailResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribePipelineDetailResponse self = new DescribePipelineDetailResponse();
        return TeaModel.build(map, self);
    }

    public DescribePipelineDetailResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribePipelineDetailResponse setCurrentExecJobs(Integer currentExecJobs) {
        this.currentExecJobs = currentExecJobs;
        return this;
    }
    public Integer getCurrentExecJobs() {
        return this.currentExecJobs;
    }

    public DescribePipelineDetailResponse setPipelineInstanceId(String pipelineInstanceId) {
        this.pipelineInstanceId = pipelineInstanceId;
        return this;
    }
    public String getPipelineInstanceId() {
        return this.pipelineInstanceId;
    }

    public DescribePipelineDetailResponse setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribePipelineDetailResponse setDslJson(String dslJson) {
        this.dslJson = dslJson;
        return this;
    }
    public String getDslJson() {
        return this.dslJson;
    }

    public DescribePipelineDetailResponse setOperator(String operator) {
        this.operator = operator;
        return this;
    }
    public String getOperator() {
        return this.operator;
    }

    public DescribePipelineDetailResponse setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribePipelineDetailResponse setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribePipelineDetailResponse setPipelineDefinitionName(String pipelineDefinitionName) {
        this.pipelineDefinitionName = pipelineDefinitionName;
        return this;
    }
    public String getPipelineDefinitionName() {
        return this.pipelineDefinitionName;
    }

    public DescribePipelineDetailResponse setPipelineArtifacts(java.util.List<DescribePipelineDetailResponsePipelineArtifacts> pipelineArtifacts) {
        this.pipelineArtifacts = pipelineArtifacts;
        return this;
    }
    public java.util.List<DescribePipelineDetailResponsePipelineArtifacts> getPipelineArtifacts() {
        return this.pipelineArtifacts;
    }

    public DescribePipelineDetailResponse setJobDetails(java.util.List<DescribePipelineDetailResponseJobDetails> jobDetails) {
        this.jobDetails = jobDetails;
        return this;
    }
    public java.util.List<DescribePipelineDetailResponseJobDetails> getJobDetails() {
        return this.jobDetails;
    }

    public static class DescribePipelineDetailResponsePipelineArtifacts extends TeaModel {
        @NameInMap("FileKey")
        @Validation(required = true)
        public String fileKey;

        @NameInMap("FileName")
        @Validation(required = true)
        public String fileName;

        @NameInMap("FileType")
        @Validation(required = true)
        public String fileType;

        @NameInMap("FileUrl")
        @Validation(required = true)
        public String fileUrl;

        @NameInMap("StorageType")
        @Validation(required = true)
        public String storageType;

        @NameInMap("ArtifactType")
        @Validation(required = true)
        public String artifactType;

        @NameInMap("IsPublic")
        @Validation(required = true)
        public Boolean isPublic;

        @NameInMap("Size")
        @Validation(required = true)
        public Long size;

        @NameInMap("Md5")
        @Validation(required = true)
        public String md5;

        @NameInMap("JobInstanceId")
        @Validation(required = true)
        public String jobInstanceId;

        @NameInMap("CreateTime")
        @Validation(required = true)
        public Long createTime;

        @NameInMap("UpdateTime")
        @Validation(required = true)
        public Long updateTime;

        @NameInMap("Ext")
        @Validation(required = true)
        public java.util.Map<String, ?> ext;

        public static DescribePipelineDetailResponsePipelineArtifacts build(java.util.Map<String, ?> map) throws Exception {
            DescribePipelineDetailResponsePipelineArtifacts self = new DescribePipelineDetailResponsePipelineArtifacts();
            return TeaModel.build(map, self);
        }

        public DescribePipelineDetailResponsePipelineArtifacts setFileKey(String fileKey) {
            this.fileKey = fileKey;
            return this;
        }
        public String getFileKey() {
            return this.fileKey;
        }

        public DescribePipelineDetailResponsePipelineArtifacts setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public DescribePipelineDetailResponsePipelineArtifacts setFileType(String fileType) {
            this.fileType = fileType;
            return this;
        }
        public String getFileType() {
            return this.fileType;
        }

        public DescribePipelineDetailResponsePipelineArtifacts setFileUrl(String fileUrl) {
            this.fileUrl = fileUrl;
            return this;
        }
        public String getFileUrl() {
            return this.fileUrl;
        }

        public DescribePipelineDetailResponsePipelineArtifacts setStorageType(String storageType) {
            this.storageType = storageType;
            return this;
        }
        public String getStorageType() {
            return this.storageType;
        }

        public DescribePipelineDetailResponsePipelineArtifacts setArtifactType(String artifactType) {
            this.artifactType = artifactType;
            return this;
        }
        public String getArtifactType() {
            return this.artifactType;
        }

        public DescribePipelineDetailResponsePipelineArtifacts setIsPublic(Boolean isPublic) {
            this.isPublic = isPublic;
            return this;
        }
        public Boolean getIsPublic() {
            return this.isPublic;
        }

        public DescribePipelineDetailResponsePipelineArtifacts setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

        public DescribePipelineDetailResponsePipelineArtifacts setMd5(String md5) {
            this.md5 = md5;
            return this;
        }
        public String getMd5() {
            return this.md5;
        }

        public DescribePipelineDetailResponsePipelineArtifacts setJobInstanceId(String jobInstanceId) {
            this.jobInstanceId = jobInstanceId;
            return this;
        }
        public String getJobInstanceId() {
            return this.jobInstanceId;
        }

        public DescribePipelineDetailResponsePipelineArtifacts setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public DescribePipelineDetailResponsePipelineArtifacts setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public DescribePipelineDetailResponsePipelineArtifacts setExt(java.util.Map<String, ?> ext) {
            this.ext = ext;
            return this;
        }
        public java.util.Map<String, ?> getExt() {
            return this.ext;
        }

    }

    public static class DescribePipelineDetailResponseJobDetailsArtifacts extends TeaModel {
        @NameInMap("FileKey")
        @Validation(required = true)
        public String fileKey;

        @NameInMap("FileName")
        @Validation(required = true)
        public String fileName;

        @NameInMap("FileType")
        @Validation(required = true)
        public String fileType;

        @NameInMap("FileUrl")
        @Validation(required = true)
        public String fileUrl;

        @NameInMap("StorageType")
        @Validation(required = true)
        public String storageType;

        @NameInMap("ArtifactType")
        @Validation(required = true)
        public String artifactType;

        @NameInMap("IsPublic")
        @Validation(required = true)
        public Boolean isPublic;

        @NameInMap("Size")
        @Validation(required = true)
        public Long size;

        @NameInMap("Md5")
        @Validation(required = true)
        public String md5;

        @NameInMap("JobInstanceId")
        @Validation(required = true)
        public String jobInstanceId;

        @NameInMap("CreateTime")
        @Validation(required = true)
        public Long createTime;

        @NameInMap("UpdateTime")
        @Validation(required = true)
        public Long updateTime;

        @NameInMap("Ext")
        @Validation(required = true)
        public java.util.Map<String, ?> ext;

        public static DescribePipelineDetailResponseJobDetailsArtifacts build(java.util.Map<String, ?> map) throws Exception {
            DescribePipelineDetailResponseJobDetailsArtifacts self = new DescribePipelineDetailResponseJobDetailsArtifacts();
            return TeaModel.build(map, self);
        }

        public DescribePipelineDetailResponseJobDetailsArtifacts setFileKey(String fileKey) {
            this.fileKey = fileKey;
            return this;
        }
        public String getFileKey() {
            return this.fileKey;
        }

        public DescribePipelineDetailResponseJobDetailsArtifacts setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public DescribePipelineDetailResponseJobDetailsArtifacts setFileType(String fileType) {
            this.fileType = fileType;
            return this;
        }
        public String getFileType() {
            return this.fileType;
        }

        public DescribePipelineDetailResponseJobDetailsArtifacts setFileUrl(String fileUrl) {
            this.fileUrl = fileUrl;
            return this;
        }
        public String getFileUrl() {
            return this.fileUrl;
        }

        public DescribePipelineDetailResponseJobDetailsArtifacts setStorageType(String storageType) {
            this.storageType = storageType;
            return this;
        }
        public String getStorageType() {
            return this.storageType;
        }

        public DescribePipelineDetailResponseJobDetailsArtifacts setArtifactType(String artifactType) {
            this.artifactType = artifactType;
            return this;
        }
        public String getArtifactType() {
            return this.artifactType;
        }

        public DescribePipelineDetailResponseJobDetailsArtifacts setIsPublic(Boolean isPublic) {
            this.isPublic = isPublic;
            return this;
        }
        public Boolean getIsPublic() {
            return this.isPublic;
        }

        public DescribePipelineDetailResponseJobDetailsArtifacts setSize(Long size) {
            this.size = size;
            return this;
        }
        public Long getSize() {
            return this.size;
        }

        public DescribePipelineDetailResponseJobDetailsArtifacts setMd5(String md5) {
            this.md5 = md5;
            return this;
        }
        public String getMd5() {
            return this.md5;
        }

        public DescribePipelineDetailResponseJobDetailsArtifacts setJobInstanceId(String jobInstanceId) {
            this.jobInstanceId = jobInstanceId;
            return this;
        }
        public String getJobInstanceId() {
            return this.jobInstanceId;
        }

        public DescribePipelineDetailResponseJobDetailsArtifacts setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public DescribePipelineDetailResponseJobDetailsArtifacts setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public DescribePipelineDetailResponseJobDetailsArtifacts setExt(java.util.Map<String, ?> ext) {
            this.ext = ext;
            return this;
        }
        public java.util.Map<String, ?> getExt() {
            return this.ext;
        }

    }

    public static class DescribePipelineDetailResponseJobDetails extends TeaModel {
        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("Bid")
        @Validation(required = true)
        public String bid;

        @NameInMap("JobKey")
        @Validation(required = true)
        public String jobKey;

        @NameInMap("PipelineInstanceId")
        @Validation(required = true)
        public String pipelineInstanceId;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("StartTime")
        @Validation(required = true)
        public Long startTime;

        @NameInMap("EndTime")
        @Validation(required = true)
        public Long endTime;

        @NameInMap("GmtCreate")
        @Validation(required = true)
        public Long gmtCreate;

        @NameInMap("GmtModified")
        @Validation(required = true)
        public Long gmtModified;

        @NameInMap("JobInstanceId")
        @Validation(required = true)
        public String jobInstanceId;

        @NameInMap("CreateTime")
        @Validation(required = true)
        public Long createTime;

        @NameInMap("UpdateTime")
        @Validation(required = true)
        public Long updateTime;

        @NameInMap("CurrentExecSteps")
        @Validation(required = true)
        public Integer currentExecSteps;

        @NameInMap("Steps")
        @Validation(required = true)
        public Integer steps;

        @NameInMap("CurrentStepBid")
        @Validation(required = true)
        public String currentStepBid;

        @NameInMap("Artifacts")
        @Validation(required = true)
        public java.util.List<DescribePipelineDetailResponseJobDetailsArtifacts> artifacts;

        public static DescribePipelineDetailResponseJobDetails build(java.util.Map<String, ?> map) throws Exception {
            DescribePipelineDetailResponseJobDetails self = new DescribePipelineDetailResponseJobDetails();
            return TeaModel.build(map, self);
        }

        public DescribePipelineDetailResponseJobDetails setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribePipelineDetailResponseJobDetails setBid(String bid) {
            this.bid = bid;
            return this;
        }
        public String getBid() {
            return this.bid;
        }

        public DescribePipelineDetailResponseJobDetails setJobKey(String jobKey) {
            this.jobKey = jobKey;
            return this;
        }
        public String getJobKey() {
            return this.jobKey;
        }

        public DescribePipelineDetailResponseJobDetails setPipelineInstanceId(String pipelineInstanceId) {
            this.pipelineInstanceId = pipelineInstanceId;
            return this;
        }
        public String getPipelineInstanceId() {
            return this.pipelineInstanceId;
        }

        public DescribePipelineDetailResponseJobDetails setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribePipelineDetailResponseJobDetails setStartTime(Long startTime) {
            this.startTime = startTime;
            return this;
        }
        public Long getStartTime() {
            return this.startTime;
        }

        public DescribePipelineDetailResponseJobDetails setEndTime(Long endTime) {
            this.endTime = endTime;
            return this;
        }
        public Long getEndTime() {
            return this.endTime;
        }

        public DescribePipelineDetailResponseJobDetails setGmtCreate(Long gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public Long getGmtCreate() {
            return this.gmtCreate;
        }

        public DescribePipelineDetailResponseJobDetails setGmtModified(Long gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public Long getGmtModified() {
            return this.gmtModified;
        }

        public DescribePipelineDetailResponseJobDetails setJobInstanceId(String jobInstanceId) {
            this.jobInstanceId = jobInstanceId;
            return this;
        }
        public String getJobInstanceId() {
            return this.jobInstanceId;
        }

        public DescribePipelineDetailResponseJobDetails setCreateTime(Long createTime) {
            this.createTime = createTime;
            return this;
        }
        public Long getCreateTime() {
            return this.createTime;
        }

        public DescribePipelineDetailResponseJobDetails setUpdateTime(Long updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public Long getUpdateTime() {
            return this.updateTime;
        }

        public DescribePipelineDetailResponseJobDetails setCurrentExecSteps(Integer currentExecSteps) {
            this.currentExecSteps = currentExecSteps;
            return this;
        }
        public Integer getCurrentExecSteps() {
            return this.currentExecSteps;
        }

        public DescribePipelineDetailResponseJobDetails setSteps(Integer steps) {
            this.steps = steps;
            return this;
        }
        public Integer getSteps() {
            return this.steps;
        }

        public DescribePipelineDetailResponseJobDetails setCurrentStepBid(String currentStepBid) {
            this.currentStepBid = currentStepBid;
            return this;
        }
        public String getCurrentStepBid() {
            return this.currentStepBid;
        }

        public DescribePipelineDetailResponseJobDetails setArtifacts(java.util.List<DescribePipelineDetailResponseJobDetailsArtifacts> artifacts) {
            this.artifacts = artifacts;
            return this;
        }
        public java.util.List<DescribePipelineDetailResponseJobDetailsArtifacts> getArtifacts() {
            return this.artifacts;
        }

    }

}
