// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class CreateEditingProjectResponseBody extends TeaModel {
    @NameInMap("Project")
    public CreateEditingProjectResponseBodyProject project;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    public static CreateEditingProjectResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CreateEditingProjectResponseBody self = new CreateEditingProjectResponseBody();
        return TeaModel.build(map, self);
    }

    public CreateEditingProjectResponseBody setProject(CreateEditingProjectResponseBodyProject project) {
        this.project = project;
        return this;
    }
    public CreateEditingProjectResponseBodyProject getProject() {
        return this.project;
    }

    public CreateEditingProjectResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class CreateEditingProjectResponseBodyProject extends TeaModel {
        @NameInMap("BusinessConfig")
        public String businessConfig;

        @NameInMap("BusinessStatus")
        public String businessStatus;

        @NameInMap("ClipsParam")
        public String clipsParam;

        @NameInMap("CoverURL")
        public String coverURL;

        @NameInMap("CreateSource")
        public String createSource;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Description")
        public String description;

        @NameInMap("Duration")
        public Float duration;

        @NameInMap("ModifiedSource")
        public String modifiedSource;

        @NameInMap("ModifiedTime")
        public String modifiedTime;

        @NameInMap("ProjectId")
        public String projectId;

        @NameInMap("ProjectType")
        public String projectType;

        @NameInMap("Status")
        public Long status;

        @NameInMap("StatusName")
        public String statusName;

        @NameInMap("TemplateId")
        public String templateId;

        @NameInMap("TemplateType")
        public String templateType;

        @NameInMap("Timeline")
        public String timeline;

        @NameInMap("Title")
        public String title;

        public static CreateEditingProjectResponseBodyProject build(java.util.Map<String, ?> map) throws Exception {
            CreateEditingProjectResponseBodyProject self = new CreateEditingProjectResponseBodyProject();
            return TeaModel.build(map, self);
        }

        public CreateEditingProjectResponseBodyProject setBusinessConfig(String businessConfig) {
            this.businessConfig = businessConfig;
            return this;
        }
        public String getBusinessConfig() {
            return this.businessConfig;
        }

        public CreateEditingProjectResponseBodyProject setBusinessStatus(String businessStatus) {
            this.businessStatus = businessStatus;
            return this;
        }
        public String getBusinessStatus() {
            return this.businessStatus;
        }

        public CreateEditingProjectResponseBodyProject setClipsParam(String clipsParam) {
            this.clipsParam = clipsParam;
            return this;
        }
        public String getClipsParam() {
            return this.clipsParam;
        }

        public CreateEditingProjectResponseBodyProject setCoverURL(String coverURL) {
            this.coverURL = coverURL;
            return this;
        }
        public String getCoverURL() {
            return this.coverURL;
        }

        public CreateEditingProjectResponseBodyProject setCreateSource(String createSource) {
            this.createSource = createSource;
            return this;
        }
        public String getCreateSource() {
            return this.createSource;
        }

        public CreateEditingProjectResponseBodyProject setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public CreateEditingProjectResponseBodyProject setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public CreateEditingProjectResponseBodyProject setDuration(Float duration) {
            this.duration = duration;
            return this;
        }
        public Float getDuration() {
            return this.duration;
        }

        public CreateEditingProjectResponseBodyProject setModifiedSource(String modifiedSource) {
            this.modifiedSource = modifiedSource;
            return this;
        }
        public String getModifiedSource() {
            return this.modifiedSource;
        }

        public CreateEditingProjectResponseBodyProject setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public CreateEditingProjectResponseBodyProject setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public CreateEditingProjectResponseBodyProject setProjectType(String projectType) {
            this.projectType = projectType;
            return this;
        }
        public String getProjectType() {
            return this.projectType;
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

        public CreateEditingProjectResponseBodyProject setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public CreateEditingProjectResponseBodyProject setTemplateType(String templateType) {
            this.templateType = templateType;
            return this;
        }
        public String getTemplateType() {
            return this.templateType;
        }

        public CreateEditingProjectResponseBodyProject setTimeline(String timeline) {
            this.timeline = timeline;
            return this;
        }
        public String getTimeline() {
            return this.timeline;
        }

        public CreateEditingProjectResponseBodyProject setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

    }

}
