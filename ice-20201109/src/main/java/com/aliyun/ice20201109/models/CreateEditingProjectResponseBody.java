// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class CreateEditingProjectResponseBody extends TeaModel {
    // Id of the request
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
        @NameInMap("ProjectId")
        public String projectId;

        @NameInMap("Title")
        public String title;

        @NameInMap("Description")
        public String description;

        @NameInMap("Timeline")
        public String timeline;

        @NameInMap("CoverURL")
        public String coverURL;

        @NameInMap("Status")
        public Long status;

        @NameInMap("StatusName")
        public String statusName;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("ModifiedTime")
        public String modifiedTime;

        @NameInMap("Duration")
        public Float duration;

        @NameInMap("CreateSource")
        public String createSource;

        @NameInMap("ModifiedSource")
        public String modifiedSource;

        @NameInMap("TemplateType")
        public String templateType;

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

    }

}
