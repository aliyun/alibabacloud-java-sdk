// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetMediaProducingJobResponseBody extends TeaModel {
    /**
     * <p>The information about the online editing project.</p>
     */
    @NameInMap("MediaProducingJob")
    public GetMediaProducingJobResponseBodyMediaProducingJob mediaProducingJob;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong>83B7-7F87-4792-BFE9-63CD2137</strong></strong></p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetMediaProducingJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMediaProducingJobResponseBody self = new GetMediaProducingJobResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMediaProducingJobResponseBody setMediaProducingJob(GetMediaProducingJobResponseBodyMediaProducingJob mediaProducingJob) {
        this.mediaProducingJob = mediaProducingJob;
        return this;
    }
    public GetMediaProducingJobResponseBodyMediaProducingJob getMediaProducingJob() {
        return this.mediaProducingJob;
    }

    public GetMediaProducingJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetMediaProducingJobResponseBodyMediaProducingJob extends TeaModel {
        /**
         * <p>The template parameters of the media editing and production job.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;VideoArray&quot;:[&quot;<strong><strong>05512043f49f697f7425</strong></strong>&quot;,&quot;<strong><strong>05512043f49f697f7425</strong></strong>&quot;,&quot;<strong><strong>05512043f49f697f7425</strong></strong>&quot;]}</p>
         */
        @NameInMap("ClipsParam")
        public String clipsParam;

        /**
         * <p>The response code</p>
         * <p>Note: Pay attention to this parameter if the job failed.</p>
         * 
         * <strong>example:</strong>
         * <p>ExceededMaximumValue</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The time when the media editing and production job was complete.</p>
         * <p>The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-12-23T13:33:52Z</p>
         */
        @NameInMap("CompleteTime")
        public String completeTime;

        /**
         * <p>The time when the media editing and production job was created.</p>
         * <p>The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-12-23T13:33:40Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The duration of the output file.</p>
         * <p>Note: This parameter has a value if the job is successful and the output file is an audio or video file.</p>
         * 
         * <strong>example:</strong>
         * <p>30.500000</p>
         */
        @NameInMap("Duration")
        public Float duration;

        /**
         * <p>The ID of the media editing and production job.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong>cdb3e74639973036bc84</strong></strong></p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <p>The media asset ID of the output file.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong>0cc6ba49eab379332c5b</strong></strong></p>
         */
        @NameInMap("MediaId")
        public String mediaId;

        /**
         * <p>The URL of the output file.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://example-bucket.oss-cn-shanghai.aliyuncs.com/example2.mp4">http://example-bucket.oss-cn-shanghai.aliyuncs.com/example2.mp4</a></p>
         */
        @NameInMap("MediaURL")
        public String mediaURL;

        /**
         * <p>The returned message.</p>
         * <p>Note: Pay attention to this parameter if the job failed.</p>
         * 
         * <strong>example:</strong>
         * <p>The specified &quot;Width_Height&quot; has exceeded maximum value.</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The time when the media editing and production job was last modified.</p>
         * <p>The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-12-23T13:33:49Z</p>
         */
        @NameInMap("ModifiedTime")
        public String modifiedTime;

        /**
         * <p>The ID of the online editing project.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong>fddd7748b58bf1d47e95</strong></strong></p>
         */
        @NameInMap("ProjectId")
        public String projectId;

        /**
         * <p>The state of the media editing and production job. Valid values:</p>
         * <p>Init</p>
         * <p>Queuing</p>
         * <p>Processing</p>
         * <p>Success</p>
         * <p>Failed</p>
         * 
         * <strong>example:</strong>
         * <p>Failed</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The materials of the media editing and production job if the job is a subjob of a quick video production job, including the broadcast text and title.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;Title&quot;: &quot;Title&quot;, &quot;SpeechText&quot;: &quot;Broadcast text of a quick video production job&quot;}</p>
         */
        @NameInMap("SubJobMaterials")
        public String subJobMaterials;

        /**
         * <p>The ID of the template used by the media editing and production job.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong>6e76134d739cc3e85d3e</strong></strong></p>
         */
        @NameInMap("TemplateId")
        public String templateId;

        /**
         * <p>The timeline of the media editing and production job.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;VideoTracks&quot;:[{&quot;VideoTrackClips&quot;:[{&quot;MediaId&quot;:&quot;<strong><strong>4d7cf14dc7b83b0e801c</strong></strong>&quot;},{&quot;MediaId&quot;:&quot;<strong><strong>4d7cf14dc7b83b0e801c</strong></strong>&quot;}]}]}</p>
         */
        @NameInMap("Timeline")
        public String timeline;

        /**
         * <p>The user-defined data in the JSON format.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;NotifyAddress&quot;:&quot;<a href="http://xx.xx.xxx%22,%22Key%22:%22Valuexxx%22%7D">http://xx.xx.xxx&quot;,&quot;Key&quot;:&quot;Valuexxx&quot;}</a></p>
         */
        @NameInMap("UserData")
        public String userData;

        /**
         * <p>The media asset ID of the output file in ApsaraVideo VOD if the output file is stored in ApsaraVideo VOD.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong>332c5b0cc6ba49eab379</strong></strong></p>
         */
        @NameInMap("VodMediaId")
        public String vodMediaId;

        public static GetMediaProducingJobResponseBodyMediaProducingJob build(java.util.Map<String, ?> map) throws Exception {
            GetMediaProducingJobResponseBodyMediaProducingJob self = new GetMediaProducingJobResponseBodyMediaProducingJob();
            return TeaModel.build(map, self);
        }

        public GetMediaProducingJobResponseBodyMediaProducingJob setClipsParam(String clipsParam) {
            this.clipsParam = clipsParam;
            return this;
        }
        public String getClipsParam() {
            return this.clipsParam;
        }

        public GetMediaProducingJobResponseBodyMediaProducingJob setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public GetMediaProducingJobResponseBodyMediaProducingJob setCompleteTime(String completeTime) {
            this.completeTime = completeTime;
            return this;
        }
        public String getCompleteTime() {
            return this.completeTime;
        }

        public GetMediaProducingJobResponseBodyMediaProducingJob setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetMediaProducingJobResponseBodyMediaProducingJob setDuration(Float duration) {
            this.duration = duration;
            return this;
        }
        public Float getDuration() {
            return this.duration;
        }

        public GetMediaProducingJobResponseBodyMediaProducingJob setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public GetMediaProducingJobResponseBodyMediaProducingJob setMediaId(String mediaId) {
            this.mediaId = mediaId;
            return this;
        }
        public String getMediaId() {
            return this.mediaId;
        }

        public GetMediaProducingJobResponseBodyMediaProducingJob setMediaURL(String mediaURL) {
            this.mediaURL = mediaURL;
            return this;
        }
        public String getMediaURL() {
            return this.mediaURL;
        }

        public GetMediaProducingJobResponseBodyMediaProducingJob setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public GetMediaProducingJobResponseBodyMediaProducingJob setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public GetMediaProducingJobResponseBodyMediaProducingJob setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public GetMediaProducingJobResponseBodyMediaProducingJob setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetMediaProducingJobResponseBodyMediaProducingJob setSubJobMaterials(String subJobMaterials) {
            this.subJobMaterials = subJobMaterials;
            return this;
        }
        public String getSubJobMaterials() {
            return this.subJobMaterials;
        }

        public GetMediaProducingJobResponseBodyMediaProducingJob setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public GetMediaProducingJobResponseBodyMediaProducingJob setTimeline(String timeline) {
            this.timeline = timeline;
            return this;
        }
        public String getTimeline() {
            return this.timeline;
        }

        public GetMediaProducingJobResponseBodyMediaProducingJob setUserData(String userData) {
            this.userData = userData;
            return this;
        }
        public String getUserData() {
            return this.userData;
        }

        public GetMediaProducingJobResponseBodyMediaProducingJob setVodMediaId(String vodMediaId) {
            this.vodMediaId = vodMediaId;
            return this;
        }
        public String getVodMediaId() {
            return this.vodMediaId;
        }

    }

}
