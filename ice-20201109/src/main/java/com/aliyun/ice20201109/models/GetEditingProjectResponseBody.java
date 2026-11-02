// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetEditingProjectResponseBody extends TeaModel {
    /**
     * <p>The cloud editing project.</p>
     */
    @NameInMap("Project")
    public GetEditingProjectResponseBodyProject project;

    /**
     * <p>The ID of the request.</p>
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
         * <p>The business configuration of the project. This can be ignored for standard editing projects.</p>
         * 
         * <strong>example:</strong>
         * <p>{ &quot;OutputMediaConfig&quot; : { &quot;StorageLocation&quot;: &quot;test-bucket.oss-cn-shanghai.aliyuncs.com&quot;, &quot;Path&quot;: &quot;test-path&quot; }, &quot;OutputMediaTarget&quot;: &quot;oss-object&quot;, &quot;ReservationTime&quot;: &quot;2021-06-21T08:05:00Z&quot; }</p>
         */
        @NameInMap("BusinessConfig")
        public String businessConfig;

        /**
         * <p>The business status of the project. This can be ignored for standard editing projects. Valid values:</p>
         * <ul>
         * <li>Reserving: Reserving.</li>
         * <li>ReservationCanceled: Reservation canceled.</li>
         * <li>BroadCasting: Broadcasting.</li>
         * <li>LoadingFailed: Loading failed.</li>
         * <li>LiveFinished: Live streaming finished.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Reserving</p>
         */
        @NameInMap("BusinessStatus")
        public String businessStatus;

        /**
         * <p>The media asset parameters corresponding to the template, in JSON format. When TemplateId is not empty, ClipsParam cannot be empty. For the specific format, see <a href="https://help.aliyun.com/document_detail/445399.html">Create and use standard templates</a> and <a href="https://help.aliyun.com/document_detail/445389.html">Create and use advanced templates</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>See the template usage documentation</p>
         */
        @NameInMap("ClipsParam")
        public String clipsParam;

        /**
         * <p>The cover of the cloud editing project.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://aaa.bbb/your-cover.jpg">http://aaa.bbb/your-cover.jpg</a></p>
         */
        @NameInMap("CoverURL")
        public String coverURL;

        /**
         * <p>The creation method of the cloud editing project. Valid values:</p>
         * <ul>
         * <li>OpenAPI</li>
         * <li>AliyunConsole</li>
         * <li>WebSDK</li>
         * <li>LiveEditingOpenAPI</li>
         * <li>LiveEditingConsole</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OpenAPI</p>
         */
        @NameInMap("CreateSource")
        public String createSource;

        /**
         * <p>The creation time of the cloud editing project. The time follows the ISO 8601 standard and is displayed in UTC (ending with Z).</p>
         * 
         * <strong>example:</strong>
         * <p>2020-12-20T12:00:00Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The description of the cloud editing project.</p>
         * 
         * <strong>example:</strong>
         * <p>Sample description</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The total duration of the cloud editing project.</p>
         * 
         * <strong>example:</strong>
         * <p>24.120000</p>
         */
        @NameInMap("Duration")
        public Long duration;

        /**
         * <p>The editing method of the cloud editing project. Valid values:</p>
         * <ul>
         * <li>OpenAPI</li>
         * <li>AliyunConsole</li>
         * <li>WebSDK</li>
         * <li>LiveEditingOpenAPI</li>
         * <li>LiveEditingConsole</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OpenAPI</p>
         */
        @NameInMap("ModifiedSource")
        public String modifiedSource;

        /**
         * <p>The last modified time of the cloud editing project. The time follows the ISO 8601 standard and is displayed in UTC (ending with Z).</p>
         * 
         * <strong>example:</strong>
         * <p>2020-12-20T13:00:00Z</p>
         */
        @NameInMap("ModifiedTime")
        public String modifiedTime;

        /**
         * <p>The ID of the cloud editing project.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong>fb2101bf24b2754cb318787dc</strong></strong></p>
         */
        @NameInMap("ProjectId")
        public String projectId;

        /**
         * <p>The type of the editing project. Default value: EditingProject. Valid values:</p>
         * <ul>
         * <li>EditingProject: Standard editing project.</li>
         * <li>LiveEditingProject: Live editing project.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>EditingProject</p>
         */
        @NameInMap("ProjectType")
        public String projectType;

        /**
         * <p>The status of the cloud editing project. Valid values:</p>
         * <ul>
         * <li>Draft</li>
         * <li>Editing</li>
         * <li>Producing</li>
         * <li>Produced</li>
         * <li>ProduceFailed</li>
         * <li>Deleted</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Editing</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The ID of the template.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong>96e8864746a0b6f3</strong></strong></p>
         */
        @NameInMap("TemplateId")
        public String templateId;

        /**
         * <p>The template type of the cloud editing project. Valid values:</p>
         * <ul>
         * <li>Timeline</li>
         * <li>VETemplate</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Timeline</p>
         */
        @NameInMap("TemplateType")
        public String templateType;

        /**
         * <p>The timeline of the cloud editing project.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;VideoTracks&quot;:[{&quot;VideoTrackClips&quot;:[{&quot;MediaId&quot;:&quot;<strong><strong>9b4d7cf14dc7b83b0e801cbe</strong></strong>&quot;},{&quot;MediaId&quot;:&quot;<strong><strong>9b4d7cf14dc7b83b0e801cbe</strong></strong>&quot;},{&quot;MediaId&quot;:&quot;<strong><strong>1656bca4474999c961a6d2a2</strong></strong>&quot;}]}]}</p>
         */
        @NameInMap("Timeline")
        public String timeline;

        /**
         * <p>The error message for project conversion failure. This is returned only when TimelineConvertStatus is ConvertFailed and contains detailed information about the conversion failure.</p>
         * 
         * <strong>example:</strong>
         * <p>The StorageLocation must be in the same division(apiRegion) as ICE service access point.</p>
         */
        @NameInMap("TimelineConvertErrorMessage")
        public String timelineConvertErrorMessage;

        /**
         * <p>The timeline conversion status of the project. Converting an API-style timeline to a frontend-style timeline is an asynchronous process and takes effect only when RequestSource is set to WebSDK. Valid values:</p>
         * <ul>
         * <li>Unconverted: The timeline is not converted.</li>
         * <li>Converting: The project is being converted.</li>
         * <li>Converted: The project conversion is completed.</li>
         * <li>ConvertFailed: The project conversion failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Converted</p>
         */
        @NameInMap("TimelineConvertStatus")
        public String timelineConvertStatus;

        /**
         * <p>The title of the cloud editing project.</p>
         * 
         * <strong>example:</strong>
         * <p>Sample title</p>
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
