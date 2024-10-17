// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetEditingProjectResponseBody extends TeaModel {
    /**
     * <p>The information about the online editing project.</p>
     */
    @NameInMap("Project")
    public GetEditingProjectResponseBodyProject project;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong>63E8B7C7-4812-46AD-0FA56029AC86</strong></strong></p>
     */
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
        /**
         * <p>The business configuration of the project. This parameter can be ignored for general editing projects.</p>
         * 
         * <strong>example:</strong>
         * <p>{ &quot;OutputMediaConfig&quot; : { &quot;StorageLocation&quot;: &quot;test-bucket.oss-cn-shanghai.aliyuncs.com&quot;, &quot;Path&quot;: &quot;test-path&quot; }, &quot;OutputMediaTarget&quot;: &quot;oss-object&quot;, &quot;ReservationTime&quot;: &quot;2021-06-21T08:05:00Z&quot; }</p>
         */
        @NameInMap("BusinessConfig")
        public String businessConfig;

        /**
         * <p>The business status of the project. This parameter can be ignored for general editing projects. Valid values:</p>
         * <p>Reserving</p>
         * <p>ReservationCanceled</p>
         * <p>BroadCasting</p>
         * <p>LoadingFailed</p>
         * <p>LiveFinished</p>
         * 
         * <strong>example:</strong>
         * <p>Reserving</p>
         */
        @NameInMap("BusinessStatus")
        public String businessStatus;

        /**
         * <p>The material parameter corresponding to the template, in the JSON format. If TemplateId is specified, ClipsParam must also be specified. For more information&lt;props=&quot;china&quot;&gt;, see <a href="https://help.aliyun.com/document_detail/328557.html">Create and use a regular template</a> and <a href="https://help.aliyun.com/document_detail/291418.html">Create and use an advanced template</a>.</p>
         */
        @NameInMap("ClipsParam")
        public String clipsParam;

        /**
         * <p>The thumbnail URL of the online editing project.</p>
         * 
         * <strong>example:</strong>
         * <p>oss://example-bucket/example.jpg</p>
         */
        @NameInMap("CoverURL")
        public String coverURL;

        /**
         * <p>The method for creating the online editing project. Valid values:</p>
         * <p>\- OpenAPI</p>
         * <p>\- AliyunConsole</p>
         * <p>\- WebSDK</p>
         * <p>\- LiveEditingOpenAPI</p>
         * <p>\- LiveEditingConsole</p>
         * 
         * <strong>example:</strong>
         * <p>OpenAPI</p>
         */
        @NameInMap("CreateSource")
        public String createSource;

        /**
         * <p>The time when the online editing project was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-12-20T12:00:00Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The description of the online editing project.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The total duration of the online editing project.</p>
         * 
         * <strong>example:</strong>
         * <p>24.120000</p>
         */
        @NameInMap("Duration")
        public Long duration;

        /**
         * <p>The method for editing the online editing project. Valid values:</p>
         * <p>\- OpenAPI</p>
         * <p>\- AliyunConsole</p>
         * <p>\- WebSDK</p>
         * <p>\- LiveEditingOpenAPI</p>
         * <p>\- LiveEditingConsole</p>
         * 
         * <strong>example:</strong>
         * <p>OpenAPI</p>
         */
        @NameInMap("ModifiedSource")
        public String modifiedSource;

        /**
         * <p>The time when the online editing project was last modified.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-12-20T13:00:00Z</p>
         */
        @NameInMap("ModifiedTime")
        public String modifiedTime;

        /**
         * <p>The ID of the online editing project.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong>fb2101bf24b2754cb318787dc</strong></strong></p>
         */
        @NameInMap("ProjectId")
        public String projectId;

        /**
         * <p>The type of the editing project. Default value: EditingProject. Valid values:</p>
         * <p>\- EditingProject: a regular editing project.</p>
         * <p>\- LiveEditingProject: a live stream editing project.</p>
         * 
         * <strong>example:</strong>
         * <p>EditingProject</p>
         */
        @NameInMap("ProjectType")
        public String projectType;

        /**
         * <p>The status of the online editing project. Valid values:</p>
         * <p>\- Draft</p>
         * <p>\- Editing</p>
         * <p>\- Producing</p>
         * <p>\- Produced</p>
         * <p>\- ProduceFailed</p>
         * <p>\- Deleted</p>
         * 
         * <strong>example:</strong>
         * <p>Editing</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The template ID.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong>96e8864746a0b6f3</strong></strong></p>
         */
        @NameInMap("TemplateId")
        public String templateId;

        /**
         * <p>The template type of the online editing project. Valid values:</p>
         * <p>\- Timeline</p>
         * <p>\- VETemplate</p>
         * 
         * <strong>example:</strong>
         * <p>Timeline</p>
         */
        @NameInMap("TemplateType")
        public String templateType;

        /**
         * <p>The timeline of the online editing project.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;VideoTracks&quot;:[{&quot;VideoTrackClips&quot;:[{&quot;MediaId&quot;:&quot;<strong><strong>9b4d7cf14dc7b83b0e801cbe</strong></strong>&quot;},{&quot;MediaId&quot;:&quot;<strong><strong>9b4d7cf14dc7b83b0e801cbe</strong></strong>&quot;},{&quot;MediaId&quot;:&quot;<strong><strong>1656bca4474999c961a6d2a2</strong></strong>&quot;}]}]}</p>
         */
        @NameInMap("Timeline")
        public String timeline;

        /**
         * <p>The error message returned if the project conversion failed. The error message displays the detailed information about the failure, and is returned only if the value of TimelineConvertStatus is ConvertFailed.</p>
         * 
         * <strong>example:</strong>
         * <p>The StorageLocation must be in the same division(apiRegion) as ICE service access point.</p>
         */
        @NameInMap("TimelineConvertErrorMessage")
        public String timelineConvertErrorMessage;

        /**
         * <p>The project conversion status. Conversion of an API-style timeline into a frontend-style timeline is an asynchronous process and takes effect only if RequestSource:WebSDK is specified.</p>
         * <p>\- Unconverted</p>
         * <p>\- Converting</p>
         * <p>\- Converted</p>
         * <p>\- ConvertFailed</p>
         * 
         * <strong>example:</strong>
         * <p>Converted</p>
         */
        @NameInMap("TimelineConvertStatus")
        public String timelineConvertStatus;

        /**
         * <p>The title of the online editing project.</p>
         */
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

        public GetEditingProjectResponseBodyProject setClipsParam(String clipsParam) {
            this.clipsParam = clipsParam;
            return this;
        }
        public String getClipsParam() {
            return this.clipsParam;
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

        public GetEditingProjectResponseBodyProject setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
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

        public GetEditingProjectResponseBodyProject setTimelineConvertErrorMessage(String timelineConvertErrorMessage) {
            this.timelineConvertErrorMessage = timelineConvertErrorMessage;
            return this;
        }
        public String getTimelineConvertErrorMessage() {
            return this.timelineConvertErrorMessage;
        }

        public GetEditingProjectResponseBodyProject setTimelineConvertStatus(String timelineConvertStatus) {
            this.timelineConvertStatus = timelineConvertStatus;
            return this;
        }
        public String getTimelineConvertStatus() {
            return this.timelineConvertStatus;
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
