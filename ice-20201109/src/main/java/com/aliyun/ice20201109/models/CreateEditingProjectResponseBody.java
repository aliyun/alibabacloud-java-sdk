// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class CreateEditingProjectResponseBody extends TeaModel {
    // 请求ID
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Project")
    public CreateEditingProjectResponseBodyProject project;

    public static CreateEditingProjectResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateEditingProjectResponseBody self = new CreateEditingProjectResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateEditingProjectResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CreateEditingProjectResponseBody setProject(CreateEditingProjectResponseBodyProject project) {
        this.project = project;
        return this;
    }
    public CreateEditingProjectResponseBodyProject getProject() {
        return this.project;
    }

    public static class CreateEditingProjectResponseBodyProject extends TeaModel {
        // 云剪辑工程ID
        @NameInMap("ProjectId")
        public String projectId;

        // 云剪辑工程标题
        @NameInMap("Title")
        public String title;

        // 云剪辑工程描述
        @NameInMap("Description")
        public String description;

        // 云剪辑工程时间线，Json格式
        @NameInMap("Timeline")
        public String timeline;

        // 云剪辑工程封面。
        @NameInMap("CoverURL")
        public String coverURL;

        // 云剪辑工程状态。  所有云剪辑工程状态列表：  -1:Draft  -2:Editing  -3:Producing  -4:Produced  -5:ProduceFailed  -7:Deleted
        @NameInMap("Status")
        public Long status;

        // 云剪辑状态名称，对应状态列表中状态名称。
        @NameInMap("StatusName")
        public String statusName;

        // 云剪辑工程创建时间
        @NameInMap("CreateTime")
        public String createTime;

        // 云剪辑工程编辑时间
        @NameInMap("ModifiedTime")
        public String modifiedTime;

        // 云剪辑工程时长
        @NameInMap("Duration")
        public Float duration;

        // 云剪辑工程创建方式  -OpenAPI  -AliyunConsole  -WebSDK -LiveEditingOpenAPI -LiveEditingConsole
        @NameInMap("CreateSource")
        public String createSource;

        // 云剪辑工程创建方式  -OpenAPI  -AliyunConsole  -WebSDK -LiveEditingOpenAPI -LiveEditingConsole
        @NameInMap("ModifiedSource")
        public String modifiedSource;

        @NameInMap("TemplateType")
        public String templateType;

        // 工程业务配置
        @NameInMap("BusinessConfig")
        public String businessConfig;

        // 剪辑工程类型，EditingProject: 普通剪辑工程；LiveEditingProject: 直播剪辑工程
        @NameInMap("ProjectType")
        public String projectType;

        // 业务状态，业务状态 /** 预约中 **/ RESERVING(0, "Reserving"), /** 预约取消 **/ RESERVATION_CANCELED(1, "ReservationCanceled"), /** 直播中 **/ BROADCASTING(3, "BroadCasting"), /** 加载失败 **/ LOADING_FAILED(4, "LoadingFailed"), /** 直播结束 **/ LIVE_FINISHED(5, "LiveFinished");
        @NameInMap("BusinessStatus")
        public String businessStatus;

        public static CreateEditingProjectResponseBodyProject build(java.util.Map<String, ?> map) throws Exception {
            CreateEditingProjectResponseBodyProject self = new CreateEditingProjectResponseBodyProject();
            return TeaModel.build(map, self);
        }

        public CreateEditingProjectResponseBodyProject setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public CreateEditingProjectResponseBodyProject setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public CreateEditingProjectResponseBodyProject setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateEditingProjectResponseBodyProject setTimeline(String timeline) {
            this.timeline = timeline;
            return this;
        }
        public String getTimeline() {
            return this.timeline;
        }

        public CreateEditingProjectResponseBodyProject setCoverURL(String coverURL) {
            this.coverURL = coverURL;
            return this;
        }
        public String getCoverURL() {
            return this.coverURL;
        }

        public CreateEditingProjectResponseBodyProject setStatus(Long status) {
            this.status = status;
            return this;
        }
        public Long getStatus() {
            return this.status;
        }

        public CreateEditingProjectResponseBodyProject setStatusName(String statusName) {
            this.statusName = statusName;
            return this;
        }
        public String getStatusName() {
            return this.statusName;
        }

        public CreateEditingProjectResponseBodyProject setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public CreateEditingProjectResponseBodyProject setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public CreateEditingProjectResponseBodyProject setDuration(Float duration) {
            this.duration = duration;
            return this;
        }
        public Float getDuration() {
            return this.duration;
        }

        public CreateEditingProjectResponseBodyProject setCreateSource(String createSource) {
            this.createSource = createSource;
            return this;
        }
        public String getCreateSource() {
            return this.createSource;
        }

        public CreateEditingProjectResponseBodyProject setModifiedSource(String modifiedSource) {
            this.modifiedSource = modifiedSource;
            return this;
        }
        public String getModifiedSource() {
            return this.modifiedSource;
        }

        public CreateEditingProjectResponseBodyProject setTemplateType(String templateType) {
            this.templateType = templateType;
            return this;
        }
        public String getTemplateType() {
            return this.templateType;
        }

        public CreateEditingProjectResponseBodyProject setBusinessConfig(String businessConfig) {
            this.businessConfig = businessConfig;
            return this;
        }
        public String getBusinessConfig() {
            return this.businessConfig;
        }

        public CreateEditingProjectResponseBodyProject setProjectType(String projectType) {
            this.projectType = projectType;
            return this;
        }
        public String getProjectType() {
            return this.projectType;
        }

        public CreateEditingProjectResponseBodyProject setBusinessStatus(String businessStatus) {
            this.businessStatus = businessStatus;
            return this;
        }
        public String getBusinessStatus() {
            return this.businessStatus;
        }

    }

}
