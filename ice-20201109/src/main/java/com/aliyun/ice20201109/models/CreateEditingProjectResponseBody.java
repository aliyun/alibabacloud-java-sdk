// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class CreateEditingProjectResponseBody extends TeaModel {
    @NameInMap("Project")
    public CreateEditingProjectResponseBodyProject project;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong><strong>3B-0E1A-586A-AC29-742247</strong></strong></strong></p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>{ &quot;OutputMediaConfig&quot; :    { &quot;StorageLocation&quot;: &quot;test-bucket.oss-cn-shanghai.aliyuncs.com&quot;, &quot;Path&quot;: &quot;test-path&quot;   }, &quot;OutputMediaTarget&quot;: &quot;oss-object&quot;, &quot;ReservationTime&quot;: &quot;2021-06-21T08:05:00Z&quot; }</p>
         */
        @NameInMap("BusinessConfig")
        public String businessConfig;

        /**
         * <strong>example:</strong>
         * <p>Reserving</p>
         */
        @NameInMap("BusinessStatus")
        public String businessStatus;

        @NameInMap("ClipsParam")
        public String clipsParam;

        /**
         * <strong>example:</strong>
         * <p><a href="http://example-bucket.oss-cn-shanghai.aliyuncs.com/example.png?Expires=">http://example-bucket.oss-cn-shanghai.aliyuncs.com/example.png?Expires=</a><ExpireTime>&amp;OSSAccessKeyId=<OSSAccessKeyId>&amp;Signature=<Signature>&amp;security-token=<SecurityToken></p>
         */
        @NameInMap("CoverURL")
        public String coverURL;

        /**
         * <strong>example:</strong>
         * <p>WebSDK</p>
         */
        @NameInMap("CreateSource")
        public String createSource;

        /**
         * <strong>example:</strong>
         * <p>2021-01-08T16:52:07Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>example_description</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <strong>example:</strong>
         * <p>3.4200000</p>
         */
        @NameInMap("Duration")
        public Float duration;

        /**
         * <strong>example:</strong>
         * <p>WebSDK</p>
         */
        @NameInMap("ModifiedSource")
        public String modifiedSource;

        /**
         * <strong>example:</strong>
         * <p>2021-01-08T16:52:07Z</p>
         */
        @NameInMap("ModifiedTime")
        public String modifiedTime;

        /**
         * <strong>example:</strong>
         * <p><strong><strong>01bf24bf41c78b2754cb3187</strong></strong></p>
         */
        @NameInMap("ProjectId")
        public String projectId;

        /**
         * <strong>example:</strong>
         * <p>LiveEditingProject</p>
         */
        @NameInMap("ProjectType")
        public String projectType;

        /**
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Status")
        public Long status;

        /**
         * <strong>example:</strong>
         * <p>Editing</p>
         */
        @NameInMap("StatusName")
        public String statusName;

        /**
         * <strong>example:</strong>
         * <p><strong><strong>96e8864746a0b6f3</strong></strong></p>
         */
        @NameInMap("TemplateId")
        public String templateId;

        /**
         * <strong>example:</strong>
         * <p>Timeline</p>
         */
        @NameInMap("TemplateType")
        public String templateType;

        /**
         * <strong>example:</strong>
         * <p>{&quot;VideoTracks&quot;:[{&quot;VideoTrackClips&quot;:[{&quot;MediaId&quot;:&quot;<strong><strong>4d7cf14dc7b83b0e801c</strong></strong>&quot;},{&quot;MediaId&quot;:&quot;<strong><strong>4d7cf14dc7b83b0e801c</strong></strong>&quot;}]}]}</p>
         */
        @NameInMap("Timeline")
        public String timeline;

        /**
         * <strong>example:</strong>
         * <p>example_title</p>
         */
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
