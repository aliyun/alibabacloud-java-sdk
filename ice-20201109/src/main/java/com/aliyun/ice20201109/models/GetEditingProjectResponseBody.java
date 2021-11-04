// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetEditingProjectResponseBody extends TeaModel {
    @NameInMap("Project")
    public GetEditingProjectResponseBodyProject project;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static GetEditingProjectResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetEditingProjectResponseBody self = new GetEditingProjectResponseBody();
        return TeaModel.build(map, self);
    }

    public GetEditingProjectResponseBody setProject(GetEditingProjectResponseBodyProject project) {
        this.project = project;
        return this;
    }
    public GetEditingProjectResponseBodyProject getProject() {
        return this.project;
    }

    public GetEditingProjectResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetEditingProjectResponseBodyProject extends TeaModel {
        @NameInMap("BusinessConfig")
        public String businessConfig;

        @NameInMap("BusinessStatus")
        public String businessStatus;

        // 云剪辑工程封面
        @NameInMap("CoverURL")
        public String coverURL;

        // 云剪辑工程创建来源
        @NameInMap("CreateSource")
        public String createSource;

        // 云剪辑工程创建时间
        @NameInMap("CreateTime")
        public String createTime;

        // 云剪辑工程描述
        @NameInMap("Description")
        public String description;

        // 云剪辑工程总时长
        @NameInMap("Duration")
        public Long duration;

        // 云剪辑工程修改来源
        @NameInMap("ModifiedSource")
        public String modifiedSource;

        // 云剪辑工程最新修改时间
        @NameInMap("ModifiedTime")
        public String modifiedTime;

        // 云剪辑工程ID
        @NameInMap("ProjectId")
        public String projectId;

        @NameInMap("ProjectType")
        public String projectType;

        // 云剪辑工程状态
        @NameInMap("Status")
        public String status;

        // 云剪辑工程模板类型
        @NameInMap("TemplateType")
        public String templateType;

        // 云剪辑工程时间线
        @NameInMap("Timeline")
        public String timeline;

        // 云剪辑工程标题
        @NameInMap("Title")
        public String title;

        public static GetEditingProjectResponseBodyProject build(java.util.Map<String, ?> map) throws Exception {
            GetEditingProjectResponseBodyProject self = new GetEditingProjectResponseBodyProject();
            return TeaModel.build(map, self);
        }

        public GetEditingProjectResponseBodyProject setBusinessConfig(String businessConfig) {
            this.businessConfig = businessConfig;
            return this;
        }
        public String getBusinessConfig() {
            return this.businessConfig;
        }

        public GetEditingProjectResponseBodyProject setBusinessStatus(String businessStatus) {
            this.businessStatus = businessStatus;
            return this;
        }
        public String getBusinessStatus() {
            return this.businessStatus;
        }

        public GetEditingProjectResponseBodyProject setCoverURL(String coverURL) {
            this.coverURL = coverURL;
            return this;
        }
        public String getCoverURL() {
            return this.coverURL;
        }

        public GetEditingProjectResponseBodyProject setCreateSource(String createSource) {
            this.createSource = createSource;
            return this;
        }
        public String getCreateSource() {
            return this.createSource;
        }

        public GetEditingProjectResponseBodyProject setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetEditingProjectResponseBodyProject setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public GetEditingProjectResponseBodyProject setDuration(Long duration) {
            this.duration = duration;
            return this;
        }
        public Long getDuration() {
            return this.duration;
        }

        public GetEditingProjectResponseBodyProject setModifiedSource(String modifiedSource) {
            this.modifiedSource = modifiedSource;
            return this;
        }
        public String getModifiedSource() {
            return this.modifiedSource;
        }

        public GetEditingProjectResponseBodyProject setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public GetEditingProjectResponseBodyProject setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public GetEditingProjectResponseBodyProject setProjectType(String projectType) {
            this.projectType = projectType;
            return this;
        }
        public String getProjectType() {
            return this.projectType;
        }

        public GetEditingProjectResponseBodyProject setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetEditingProjectResponseBodyProject setTemplateType(String templateType) {
            this.templateType = templateType;
            return this;
        }
        public String getTemplateType() {
            return this.templateType;
        }

        public GetEditingProjectResponseBodyProject setTimeline(String timeline) {
            this.timeline = timeline;
            return this;
        }
        public String getTimeline() {
            return this.timeline;
        }

        public GetEditingProjectResponseBodyProject setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

}
