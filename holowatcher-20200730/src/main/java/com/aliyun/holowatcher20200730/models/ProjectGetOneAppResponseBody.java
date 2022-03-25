// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.holowatcher20200730.models;

import com.aliyun.tea.*;

public class ProjectGetOneAppResponseBody extends TeaModel {
    @NameInMap("BizType")
    public String bizType;

    @NameInMap("BuildStatusInfo")
    public ProjectGetOneAppResponseBodyBuildStatusInfo buildStatusInfo;

    @NameInMap("Code")
    public String code;

    @NameInMap("DisplayName")
    public String displayName;

    @NameInMap("ExtInfo")
    public ProjectGetOneAppResponseBodyExtInfo extInfo;

    @NameInMap("FunctionStatusInfo")
    public ProjectGetOneAppResponseBodyFunctionStatusInfo functionStatusInfo;

    @NameInMap("GmtCreate")
    public String gmtCreate;

    @NameInMap("GmtModified")
    public String gmtModified;

    @NameInMap("HighmodelAssignedTime")
    public String highmodelAssignedTime;

    @NameInMap("Icon")
    public String icon;

    @NameInMap("Id")
    public Long id;

    @NameInMap("IsvAssignedTime")
    public String isvAssignedTime;

    @NameInMap("LatestPipelineUsageInstance")
    public java.util.Map<String, ?> latestPipelineUsageInstance;

    @NameInMap("Message")
    public String message;

    @NameInMap("ModelConfirmedTime")
    public String modelConfirmedTime;

    @NameInMap("NickName")
    public String nickName;

    @NameInMap("Note")
    public ProjectGetOneAppResponseBodyNote note;

    @NameInMap("OrderId")
    public Long orderId;

    @NameInMap("ProjectGroupId")
    public String projectGroupId;

    @NameInMap("ProjectSource")
    public String projectSource;

    @NameInMap("ProjectStatus")
    public String projectStatus;

    @NameInMap("PublishStatusInfo")
    public ProjectGetOneAppResponseBodyPublishStatusInfo publishStatusInfo;

    @NameInMap("RecentBuildTime")
    public String recentBuildTime;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Status")
    public String status;

    @NameInMap("Thumbnail")
    public String thumbnail;

    @NameInMap("UploadStatusInfo")
    public ProjectGetOneAppResponseBodyUploadStatusInfo uploadStatusInfo;

    public static ProjectGetOneAppResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ProjectGetOneAppResponseBody self = new ProjectGetOneAppResponseBody();
        return TeaModel.build(map, self);
    }

    public ProjectGetOneAppResponseBody setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public ProjectGetOneAppResponseBody setBuildStatusInfo(ProjectGetOneAppResponseBodyBuildStatusInfo buildStatusInfo) {
        this.buildStatusInfo = buildStatusInfo;
        return this;
    }
    public ProjectGetOneAppResponseBodyBuildStatusInfo getBuildStatusInfo() {
        return this.buildStatusInfo;
    }

    public ProjectGetOneAppResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ProjectGetOneAppResponseBody setDisplayName(String displayName) {
        this.displayName = displayName;
        return this;
    }
    public String getDisplayName() {
        return this.displayName;
    }

    public ProjectGetOneAppResponseBody setExtInfo(ProjectGetOneAppResponseBodyExtInfo extInfo) {
        this.extInfo = extInfo;
        return this;
    }
    public ProjectGetOneAppResponseBodyExtInfo getExtInfo() {
        return this.extInfo;
    }

    public ProjectGetOneAppResponseBody setFunctionStatusInfo(ProjectGetOneAppResponseBodyFunctionStatusInfo functionStatusInfo) {
        this.functionStatusInfo = functionStatusInfo;
        return this;
    }
    public ProjectGetOneAppResponseBodyFunctionStatusInfo getFunctionStatusInfo() {
        return this.functionStatusInfo;
    }

    public ProjectGetOneAppResponseBody setGmtCreate(String gmtCreate) {
        this.gmtCreate = gmtCreate;
        return this;
    }
    public String getGmtCreate() {
        return this.gmtCreate;
    }

    public ProjectGetOneAppResponseBody setGmtModified(String gmtModified) {
        this.gmtModified = gmtModified;
        return this;
    }
    public String getGmtModified() {
        return this.gmtModified;
    }

    public ProjectGetOneAppResponseBody setHighmodelAssignedTime(String highmodelAssignedTime) {
        this.highmodelAssignedTime = highmodelAssignedTime;
        return this;
    }
    public String getHighmodelAssignedTime() {
        return this.highmodelAssignedTime;
    }

    public ProjectGetOneAppResponseBody setIcon(String icon) {
        this.icon = icon;
        return this;
    }
    public String getIcon() {
        return this.icon;
    }

    public ProjectGetOneAppResponseBody setId(Long id) {
        this.id = id;
        return this;
    }
    public Long getId() {
        return this.id;
    }

    public ProjectGetOneAppResponseBody setIsvAssignedTime(String isvAssignedTime) {
        this.isvAssignedTime = isvAssignedTime;
        return this;
    }
    public String getIsvAssignedTime() {
        return this.isvAssignedTime;
    }

    public ProjectGetOneAppResponseBody setLatestPipelineUsageInstance(java.util.Map<String, ?> latestPipelineUsageInstance) {
        this.latestPipelineUsageInstance = latestPipelineUsageInstance;
        return this;
    }
    public java.util.Map<String, ?> getLatestPipelineUsageInstance() {
        return this.latestPipelineUsageInstance;
    }

    public ProjectGetOneAppResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ProjectGetOneAppResponseBody setModelConfirmedTime(String modelConfirmedTime) {
        this.modelConfirmedTime = modelConfirmedTime;
        return this;
    }
    public String getModelConfirmedTime() {
        return this.modelConfirmedTime;
    }

    public ProjectGetOneAppResponseBody setNickName(String nickName) {
        this.nickName = nickName;
        return this;
    }
    public String getNickName() {
        return this.nickName;
    }

    public ProjectGetOneAppResponseBody setNote(ProjectGetOneAppResponseBodyNote note) {
        this.note = note;
        return this;
    }
    public ProjectGetOneAppResponseBodyNote getNote() {
        return this.note;
    }

    public ProjectGetOneAppResponseBody setOrderId(Long orderId) {
        this.orderId = orderId;
        return this;
    }
    public Long getOrderId() {
        return this.orderId;
    }

    public ProjectGetOneAppResponseBody setProjectGroupId(String projectGroupId) {
        this.projectGroupId = projectGroupId;
        return this;
    }
    public String getProjectGroupId() {
        return this.projectGroupId;
    }

    public ProjectGetOneAppResponseBody setProjectSource(String projectSource) {
        this.projectSource = projectSource;
        return this;
    }
    public String getProjectSource() {
        return this.projectSource;
    }

    public ProjectGetOneAppResponseBody setProjectStatus(String projectStatus) {
        this.projectStatus = projectStatus;
        return this;
    }
    public String getProjectStatus() {
        return this.projectStatus;
    }

    public ProjectGetOneAppResponseBody setPublishStatusInfo(ProjectGetOneAppResponseBodyPublishStatusInfo publishStatusInfo) {
        this.publishStatusInfo = publishStatusInfo;
        return this;
    }
    public ProjectGetOneAppResponseBodyPublishStatusInfo getPublishStatusInfo() {
        return this.publishStatusInfo;
    }

    public ProjectGetOneAppResponseBody setRecentBuildTime(String recentBuildTime) {
        this.recentBuildTime = recentBuildTime;
        return this;
    }
    public String getRecentBuildTime() {
        return this.recentBuildTime;
    }

    public ProjectGetOneAppResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ProjectGetOneAppResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public ProjectGetOneAppResponseBody setThumbnail(String thumbnail) {
        this.thumbnail = thumbnail;
        return this;
    }
    public String getThumbnail() {
        return this.thumbnail;
    }

    public ProjectGetOneAppResponseBody setUploadStatusInfo(ProjectGetOneAppResponseBodyUploadStatusInfo uploadStatusInfo) {
        this.uploadStatusInfo = uploadStatusInfo;
        return this;
    }
    public ProjectGetOneAppResponseBodyUploadStatusInfo getUploadStatusInfo() {
        return this.uploadStatusInfo;
    }

    public static class ProjectGetOneAppResponseBodyBuildStatusInfo extends TeaModel {
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

        public static ProjectGetOneAppResponseBodyBuildStatusInfo build(java.util.Map<String, ?> map) throws Exception {
            ProjectGetOneAppResponseBodyBuildStatusInfo self = new ProjectGetOneAppResponseBodyBuildStatusInfo();
            return TeaModel.build(map, self);
        }

        public ProjectGetOneAppResponseBodyBuildStatusInfo setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public ProjectGetOneAppResponseBodyBuildStatusInfo setProgress(Long progress) {
            this.progress = progress;
            return this;
        }
        public Long getProgress() {
            return this.progress;
        }

        public ProjectGetOneAppResponseBodyBuildStatusInfo setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public ProjectGetOneAppResponseBodyBuildStatusInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ProjectGetOneAppResponseBodyBuildStatusInfo setTips(String tips) {
            this.tips = tips;
            return this;
        }
        public String getTips() {
            return this.tips;
        }

    }

    public static class ProjectGetOneAppResponseBodyExtInfo extends TeaModel {
        @NameInMap("FLOORPLANAREA")
        public String FLOORPLANAREA;

        @NameInMap("ONLINEDNS")
        public String ONLINEDNS;

        @NameInMap("STATUS")
        public String STATUS;

        public static ProjectGetOneAppResponseBodyExtInfo build(java.util.Map<String, ?> map) throws Exception {
            ProjectGetOneAppResponseBodyExtInfo self = new ProjectGetOneAppResponseBodyExtInfo();
            return TeaModel.build(map, self);
        }

        public ProjectGetOneAppResponseBodyExtInfo setFLOORPLANAREA(String FLOORPLANAREA) {
            this.FLOORPLANAREA = FLOORPLANAREA;
            return this;
        }
        public String getFLOORPLANAREA() {
            return this.FLOORPLANAREA;
        }

        public ProjectGetOneAppResponseBodyExtInfo setONLINEDNS(String ONLINEDNS) {
            this.ONLINEDNS = ONLINEDNS;
            return this;
        }
        public String getONLINEDNS() {
            return this.ONLINEDNS;
        }

        public ProjectGetOneAppResponseBodyExtInfo setSTATUS(String STATUS) {
            this.STATUS = STATUS;
            return this;
        }
        public String getSTATUS() {
            return this.STATUS;
        }

    }

    public static class ProjectGetOneAppResponseBodyFunctionStatusInfo extends TeaModel {
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

        public static ProjectGetOneAppResponseBodyFunctionStatusInfo build(java.util.Map<String, ?> map) throws Exception {
            ProjectGetOneAppResponseBodyFunctionStatusInfo self = new ProjectGetOneAppResponseBodyFunctionStatusInfo();
            return TeaModel.build(map, self);
        }

        public ProjectGetOneAppResponseBodyFunctionStatusInfo setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public ProjectGetOneAppResponseBodyFunctionStatusInfo setProgress(Long progress) {
            this.progress = progress;
            return this;
        }
        public Long getProgress() {
            return this.progress;
        }

        public ProjectGetOneAppResponseBodyFunctionStatusInfo setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public ProjectGetOneAppResponseBodyFunctionStatusInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ProjectGetOneAppResponseBodyFunctionStatusInfo setTips(String tips) {
            this.tips = tips;
            return this;
        }
        public String getTips() {
            return this.tips;
        }

    }

    public static class ProjectGetOneAppResponseBodyNote extends TeaModel {
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

        public static ProjectGetOneAppResponseBodyNote build(java.util.Map<String, ?> map) throws Exception {
            ProjectGetOneAppResponseBodyNote self = new ProjectGetOneAppResponseBodyNote();
            return TeaModel.build(map, self);
        }

        public ProjectGetOneAppResponseBodyNote setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public ProjectGetOneAppResponseBodyNote setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public ProjectGetOneAppResponseBodyNote setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public ProjectGetOneAppResponseBodyNote setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public ProjectGetOneAppResponseBodyNote setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class ProjectGetOneAppResponseBodyPublishStatusInfo extends TeaModel {
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

        public static ProjectGetOneAppResponseBodyPublishStatusInfo build(java.util.Map<String, ?> map) throws Exception {
            ProjectGetOneAppResponseBodyPublishStatusInfo self = new ProjectGetOneAppResponseBodyPublishStatusInfo();
            return TeaModel.build(map, self);
        }

        public ProjectGetOneAppResponseBodyPublishStatusInfo setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public ProjectGetOneAppResponseBodyPublishStatusInfo setProgress(Long progress) {
            this.progress = progress;
            return this;
        }
        public Long getProgress() {
            return this.progress;
        }

        public ProjectGetOneAppResponseBodyPublishStatusInfo setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public ProjectGetOneAppResponseBodyPublishStatusInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ProjectGetOneAppResponseBodyPublishStatusInfo setTips(String tips) {
            this.tips = tips;
            return this;
        }
        public String getTips() {
            return this.tips;
        }

    }

    public static class ProjectGetOneAppResponseBodyUploadStatusInfo extends TeaModel {
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

        public static ProjectGetOneAppResponseBodyUploadStatusInfo build(java.util.Map<String, ?> map) throws Exception {
            ProjectGetOneAppResponseBodyUploadStatusInfo self = new ProjectGetOneAppResponseBodyUploadStatusInfo();
            return TeaModel.build(map, self);
        }

        public ProjectGetOneAppResponseBodyUploadStatusInfo setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public ProjectGetOneAppResponseBodyUploadStatusInfo setProgress(Long progress) {
            this.progress = progress;
            return this;
        }
        public Long getProgress() {
            return this.progress;
        }

        public ProjectGetOneAppResponseBodyUploadStatusInfo setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public ProjectGetOneAppResponseBodyUploadStatusInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ProjectGetOneAppResponseBodyUploadStatusInfo setTips(String tips) {
            this.tips = tips;
            return this;
        }
        public String getTips() {
            return this.tips;
        }

    }

}
