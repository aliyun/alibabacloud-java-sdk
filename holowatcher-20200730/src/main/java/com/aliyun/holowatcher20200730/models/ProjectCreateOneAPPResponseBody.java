// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class ProjectCreateOneAPPResponseBody extends TeaModel {
    @NameInMap("BizType")
    public String bizType;

    @NameInMap("BuildStatusInfo")
    public ProjectCreateOneAPPResponseBodyBuildStatusInfo buildStatusInfo;

    @NameInMap("Code")
    public String code;

    @NameInMap("DisplayName")
    public String displayName;

    @NameInMap("ExtInfo")
    public java.util.Map<String, ?> extInfo;

    @NameInMap("FunctionStatusInfo")
    public ProjectCreateOneAPPResponseBodyFunctionStatusInfo functionStatusInfo;

    @NameInMap("GmtCreate")
    public String gmtCreate;

    @NameInMap("GmtModified")
    public String gmtModified;

    @NameInMap("HighmodelAssignedTime")
    public String highmodelAssignedTime;

    @NameInMap("Id")
    public Long id;

    @NameInMap("IsvAssignedTime")
    public String isvAssignedTime;

    @NameInMap("LatestPipelineUsageInstance")
    public ProjectCreateOneAPPResponseBodyLatestPipelineUsageInstance latestPipelineUsageInstance;

    @NameInMap("Message")
    public String message;

    @NameInMap("ModelConfirmedTime")
    public String modelConfirmedTime;

    @NameInMap("Note")
    public ProjectCreateOneAPPResponseBodyNote note;

    @NameInMap("OrderId")
    public Long orderId;

    @NameInMap("ProjectGroupId")
    public String projectGroupId;

    @NameInMap("ProjectSource")
    public String projectSource;

    @NameInMap("ProjectStatus")
    public String projectStatus;

    @NameInMap("PublishStatusInfo")
    public ProjectCreateOneAPPResponseBodyPublishStatusInfo publishStatusInfo;

    @NameInMap("RecentBuildTime")
    public String recentBuildTime;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("UploadStatusInfo")
    public ProjectCreateOneAPPResponseBodyUploadStatusInfo uploadStatusInfo;

    public static ProjectCreateOneAPPResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ProjectCreateOneAPPResponseBody self = new ProjectCreateOneAPPResponseBody();
        return TeaModel.build(map, self);
    }

    public ProjectCreateOneAPPResponseBody setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public ProjectCreateOneAPPResponseBody setBuildStatusInfo(ProjectCreateOneAPPResponseBodyBuildStatusInfo buildStatusInfo) {
        this.buildStatusInfo = buildStatusInfo;
        return this;
    }
    public ProjectCreateOneAPPResponseBodyBuildStatusInfo getBuildStatusInfo() {
        return this.buildStatusInfo;
    }

    public ProjectCreateOneAPPResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ProjectCreateOneAPPResponseBody setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public ProjectCreateOneAPPResponseBody setExtInfo(java.util.Map<String, ?> extInfo) {
        this.extInfo = extInfo;
        return this;
    }
    public java.util.Map<String, ?> getExtInfo() {
        return this.extInfo;
    }

    public ProjectCreateOneAPPResponseBody setFunctionStatusInfo(ProjectCreateOneAPPResponseBodyFunctionStatusInfo functionStatusInfo) {
        this.functionStatusInfo = functionStatusInfo;
        return this;
    }
    public ProjectCreateOneAPPResponseBodyFunctionStatusInfo getFunctionStatusInfo() {
        return this.functionStatusInfo;
    }

    public ProjectCreateOneAPPResponseBody setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public ProjectCreateOneAPPResponseBody setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public ProjectCreateOneAPPResponseBody setHighmodelAssignedTime(String highmodelAssignedTime) {
        this.highmodelAssignedTime = highmodelAssignedTime;
        return this;
    }
    public String getHighmodelAssignedTime() {
        return this.highmodelAssignedTime;
    }

    public ProjectCreateOneAPPResponseBody setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public ProjectCreateOneAPPResponseBody setIsvAssignedTime(String isvAssignedTime) {
        this.isvAssignedTime = isvAssignedTime;
        return this;
    }
    public String getIsvAssignedTime() {
        return this.isvAssignedTime;
    }

    public ProjectCreateOneAPPResponseBody setLatestPipelineUsageInstance(ProjectCreateOneAPPResponseBodyLatestPipelineUsageInstance latestPipelineUsageInstance) {
        this.latestPipelineUsageInstance = latestPipelineUsageInstance;
        return this;
    }
    public ProjectCreateOneAPPResponseBodyLatestPipelineUsageInstance getLatestPipelineUsageInstance() {
        return this.latestPipelineUsageInstance;
    }

    public ProjectCreateOneAPPResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ProjectCreateOneAPPResponseBody setModelConfirmedTime(String modelConfirmedTime) {
        this.modelConfirmedTime = modelConfirmedTime;
        return this;
    }
    public String getModelConfirmedTime() {
        return this.modelConfirmedTime;
    }

    public ProjectCreateOneAPPResponseBody setNote(ProjectCreateOneAPPResponseBodyNote note) {
        this.note = note;
        return this;
    }
    public ProjectCreateOneAPPResponseBodyNote getNote() {
        return this.note;
    }

    public ProjectCreateOneAPPResponseBody setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

    public ProjectCreateOneAPPResponseBody setProjectGroupId(String projectGroupId) {
        this.projectGroupId = projectGroupId;
        return this;
    }
    public String getProjectGroupId() {
        return this.projectGroupId;
    }

    public ProjectCreateOneAPPResponseBody setProjectSource(String projectSource) {
        this.projectSource = projectSource;
        return this;
    }
    public String getProjectSource() {
        return this.projectSource;
    }

    public ProjectCreateOneAPPResponseBody setProjectStatus(String projectStatus) {
        this.projectStatus = projectStatus;
        return this;
    }
    public String getProjectStatus() {
        return this.projectStatus;
    }

    public ProjectCreateOneAPPResponseBody setPublishStatusInfo(ProjectCreateOneAPPResponseBodyPublishStatusInfo publishStatusInfo) {
        this.publishStatusInfo = publishStatusInfo;
        return this;
    }
    public ProjectCreateOneAPPResponseBodyPublishStatusInfo getPublishStatusInfo() {
        return this.publishStatusInfo;
    }

    public ProjectCreateOneAPPResponseBody setRecentBuildTime(String recentBuildTime) {
        this.recentBuildTime = recentBuildTime;
        return this;
    }
    public String getRecentBuildTime() {
        return this.recentBuildTime;
    }

    public ProjectCreateOneAPPResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ProjectCreateOneAPPResponseBody setUploadStatusInfo(ProjectCreateOneAPPResponseBodyUploadStatusInfo uploadStatusInfo) {
        this.uploadStatusInfo = uploadStatusInfo;
        return this;
    }
    public ProjectCreateOneAPPResponseBodyUploadStatusInfo getUploadStatusInfo() {
        return this.uploadStatusInfo;
    }

    public static class ProjectCreateOneAPPResponseBodyBuildStatusInfo extends TeaModel {
        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("Progress")
        public Long progress;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("Status")
        public String status;

        @NameInMap("Tips")
        public String tips;

        public static ProjectCreateOneAPPResponseBodyBuildStatusInfo build(java.util.Map<String, ?> map) throws Exception {
            ProjectCreateOneAPPResponseBodyBuildStatusInfo self = new ProjectCreateOneAPPResponseBodyBuildStatusInfo();
            return TeaModel.build(map, self);
        }

        public ProjectCreateOneAPPResponseBodyBuildStatusInfo setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public ProjectCreateOneAPPResponseBodyBuildStatusInfo setProgress(Long progress) {
            this.progress = progress;
            return this;
        }
        public Long getProgress() {
            return this.progress;
        }

        public ProjectCreateOneAPPResponseBodyBuildStatusInfo setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public ProjectCreateOneAPPResponseBodyBuildStatusInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ProjectCreateOneAPPResponseBodyBuildStatusInfo setTips(String tips) {
            this.tips = tips;
            return this;
        }
        public String getTips() {
            return this.tips;
        }

    }

    public static class ProjectCreateOneAPPResponseBodyFunctionStatusInfo extends TeaModel {
        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("Progress")
        public Long progress;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("Status")
        public String status;

        @NameInMap("Tips")
        public String tips;

        public static ProjectCreateOneAPPResponseBodyFunctionStatusInfo build(java.util.Map<String, ?> map) throws Exception {
            ProjectCreateOneAPPResponseBodyFunctionStatusInfo self = new ProjectCreateOneAPPResponseBodyFunctionStatusInfo();
            return TeaModel.build(map, self);
        }

        public ProjectCreateOneAPPResponseBodyFunctionStatusInfo setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public ProjectCreateOneAPPResponseBodyFunctionStatusInfo setProgress(Long progress) {
            this.progress = progress;
            return this;
        }
        public Long getProgress() {
            return this.progress;
        }

        public ProjectCreateOneAPPResponseBodyFunctionStatusInfo setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public ProjectCreateOneAPPResponseBodyFunctionStatusInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ProjectCreateOneAPPResponseBodyFunctionStatusInfo setTips(String tips) {
            this.tips = tips;
            return this;
        }
        public String getTips() {
            return this.tips;
        }

    }

    public static class ProjectCreateOneAPPResponseBodyLatestPipelineUsageInstance extends TeaModel {
        @NameInMap("APPENDPUBLISH")
        public String APPENDPUBLISH;

        @NameInMap("HIGHMODELBUILD")
        public String HIGHMODELBUILD;

        @NameInMap("MIRRORANNOTATION")
        public String MIRRORANNOTATION;

        @NameInMap("MODELREBUILDPUB")
        public String MODELREBUILDPUB;

        @NameInMap("MODELREPLACE")
        public String MODELREPLACE;

        @NameInMap("MODELREPLACENODATASET")
        public String MODELREPLACENODATASET;

        @NameInMap("OSSCOVER")
        public String OSSCOVER;

        @NameInMap("PTZMODELREBUILDPUB")
        public String PTZMODELREBUILDPUB;

        @NameInMap("PUBLISH")
        public String PUBLISH;

        @NameInMap("REBUID")
        public String REBUID;

        public static ProjectCreateOneAPPResponseBodyLatestPipelineUsageInstance build(java.util.Map<String, ?> map) throws Exception {
            ProjectCreateOneAPPResponseBodyLatestPipelineUsageInstance self = new ProjectCreateOneAPPResponseBodyLatestPipelineUsageInstance();
            return TeaModel.build(map, self);
        }

        public ProjectCreateOneAPPResponseBodyLatestPipelineUsageInstance setAPPENDPUBLISH(String APPENDPUBLISH) {
            this.APPENDPUBLISH = APPENDPUBLISH;
            return this;
        }
        public String getAPPENDPUBLISH() {
            return this.APPENDPUBLISH;
        }

        public ProjectCreateOneAPPResponseBodyLatestPipelineUsageInstance setHIGHMODELBUILD(String HIGHMODELBUILD) {
            this.HIGHMODELBUILD = HIGHMODELBUILD;
            return this;
        }
        public String getHIGHMODELBUILD() {
            return this.HIGHMODELBUILD;
        }

        public ProjectCreateOneAPPResponseBodyLatestPipelineUsageInstance setMIRRORANNOTATION(String MIRRORANNOTATION) {
            this.MIRRORANNOTATION = MIRRORANNOTATION;
            return this;
        }
        public String getMIRRORANNOTATION() {
            return this.MIRRORANNOTATION;
        }

        public ProjectCreateOneAPPResponseBodyLatestPipelineUsageInstance setMODELREBUILDPUB(String MODELREBUILDPUB) {
            this.MODELREBUILDPUB = MODELREBUILDPUB;
            return this;
        }
        public String getMODELREBUILDPUB() {
            return this.MODELREBUILDPUB;
        }

        public ProjectCreateOneAPPResponseBodyLatestPipelineUsageInstance setMODELREPLACE(String MODELREPLACE) {
            this.MODELREPLACE = MODELREPLACE;
            return this;
        }
        public String getMODELREPLACE() {
            return this.MODELREPLACE;
        }

        public ProjectCreateOneAPPResponseBodyLatestPipelineUsageInstance setMODELREPLACENODATASET(String MODELREPLACENODATASET) {
            this.MODELREPLACENODATASET = MODELREPLACENODATASET;
            return this;
        }
        public String getMODELREPLACENODATASET() {
            return this.MODELREPLACENODATASET;
        }

        public ProjectCreateOneAPPResponseBodyLatestPipelineUsageInstance setOSSCOVER(String OSSCOVER) {
            this.OSSCOVER = OSSCOVER;
            return this;
        }
        public String getOSSCOVER() {
            return this.OSSCOVER;
        }

        public ProjectCreateOneAPPResponseBodyLatestPipelineUsageInstance setPTZMODELREBUILDPUB(String PTZMODELREBUILDPUB) {
            this.PTZMODELREBUILDPUB = PTZMODELREBUILDPUB;
            return this;
        }
        public String getPTZMODELREBUILDPUB() {
            return this.PTZMODELREBUILDPUB;
        }

        public ProjectCreateOneAPPResponseBodyLatestPipelineUsageInstance setPUBLISH(String PUBLISH) {
            this.PUBLISH = PUBLISH;
            return this;
        }
        public String getPUBLISH() {
            return this.PUBLISH;
        }

        public ProjectCreateOneAPPResponseBodyLatestPipelineUsageInstance setREBUID(String REBUID) {
            this.REBUID = REBUID;
            return this;
        }
        public String getREBUID() {
            return this.REBUID;
        }

    }

    public static class ProjectCreateOneAPPResponseBodyNote extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("GmtCreate")
        public String gmtCreate;

        @NameInMap("GmtModified")
        public String gmtModified;

        @NameInMap("Id")
        public Long id;

        @NameInMap("Name")
        public String name;

        public static ProjectCreateOneAPPResponseBodyNote build(java.util.Map<String, ?> map) throws Exception {
            ProjectCreateOneAPPResponseBodyNote self = new ProjectCreateOneAPPResponseBodyNote();
            return TeaModel.build(map, self);
        }

        public ProjectCreateOneAPPResponseBodyNote setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ProjectCreateOneAPPResponseBodyNote setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ProjectCreateOneAPPResponseBodyNote setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ProjectCreateOneAPPResponseBodyNote setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ProjectCreateOneAPPResponseBodyNote setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ProjectCreateOneAPPResponseBodyPublishStatusInfo extends TeaModel {
        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("Progress")
        public Long progress;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("Status")
        public String status;

        @NameInMap("Tips")
        public String tips;

        public static ProjectCreateOneAPPResponseBodyPublishStatusInfo build(java.util.Map<String, ?> map) throws Exception {
            ProjectCreateOneAPPResponseBodyPublishStatusInfo self = new ProjectCreateOneAPPResponseBodyPublishStatusInfo();
            return TeaModel.build(map, self);
        }

        public ProjectCreateOneAPPResponseBodyPublishStatusInfo setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public ProjectCreateOneAPPResponseBodyPublishStatusInfo setProgress(Long progress) {
            this.progress = progress;
            return this;
        }
        public Long getProgress() {
            return this.progress;
        }

        public ProjectCreateOneAPPResponseBodyPublishStatusInfo setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public ProjectCreateOneAPPResponseBodyPublishStatusInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ProjectCreateOneAPPResponseBodyPublishStatusInfo setTips(String tips) {
            this.tips = tips;
            return this;
        }
        public String getTips() {
            return this.tips;
        }

    }

    public static class ProjectCreateOneAPPResponseBodyUploadStatusInfo extends TeaModel {
        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("Progress")
        public Long progress;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("Status")
        public String status;

        @NameInMap("Tips")
        public String tips;

        public static ProjectCreateOneAPPResponseBodyUploadStatusInfo build(java.util.Map<String, ?> map) throws Exception {
            ProjectCreateOneAPPResponseBodyUploadStatusInfo self = new ProjectCreateOneAPPResponseBodyUploadStatusInfo();
            return TeaModel.build(map, self);
        }

        public ProjectCreateOneAPPResponseBodyUploadStatusInfo setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public ProjectCreateOneAPPResponseBodyUploadStatusInfo setProgress(Long progress) {
            this.progress = progress;
            return this;
        }
        public Long getProgress() {
            return this.progress;
        }

        public ProjectCreateOneAPPResponseBodyUploadStatusInfo setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public ProjectCreateOneAPPResponseBodyUploadStatusInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ProjectCreateOneAPPResponseBodyUploadStatusInfo setTips(String tips) {
            this.tips = tips;
            return this;
        }
        public String getTips() {
            return this.tips;
        }

    }

}
