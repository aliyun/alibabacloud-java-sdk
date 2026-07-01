// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetMediaProducingJobResponseBody extends TeaModel {
    /**
     * <p>The details of the media producing job.</p>
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
         * <p>The clip parameters of the template used for the job.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;VideoArray&quot;:[&quot;<strong><strong>05512043f49f697f7425</strong></strong>&quot;,&quot;<strong><strong>05512043f49f697f7425</strong></strong>&quot;,&quot;<strong><strong>05512043f49f697f7425</strong></strong>&quot;]}</p>
         */
        @NameInMap("ClipsParam")
        public String clipsParam;

        /**
         * <p>The error code of the media producing job. &gt;Notice: This parameter is returned only if the job fails.</p>
         * 
         * <strong>example:</strong>
         * <p>ExceededMaximumValue</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The time in UTC when the media producing job was completed, formatted as <code>YYYY-MM-DD\\&quot;T\\&quot;hh:mm:ss\\&quot;Z\\&quot;</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-12-23T13:33:52Z</p>
         */
        @NameInMap("CompleteTime")
        public String completeTime;

        /**
         * <p>The time in UTC when the media producing job was created, formatted as <code>YYYY-MM-DD\\&quot;T\\&quot;hh:mm:ss\\&quot;Z\\&quot;</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-12-23T13:33:40Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The duration of the output media. &gt;Notice: This parameter is returned only if the job is successful and the output is an audio or video file.</p>
         * 
         * <strong>example:</strong>
         * <p>30.500000</p>
         */
        @NameInMap("Duration")
        public Float duration;

        /**
         * <p>The job ID.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong>cdb3e74639973036bc84</strong></strong></p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <p>The ID of the output media asset.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong>0cc6ba49eab379332c5b</strong></strong></p>
         */
        @NameInMap("MediaId")
        public String mediaId;

        /**
         * <p>The URL of the output media file.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://example-bucket.oss-cn-shanghai.aliyuncs.com/example2.mp4">http://example-bucket.oss-cn-shanghai.aliyuncs.com/example2.mp4</a></p>
         */
        @NameInMap("MediaURL")
        public String mediaURL;

        /**
         * <p>The error message of the media producing job.</p>
         * <blockquote>
         * <p>Notice: </p>
         * </blockquote>
         * <p>This parameter is returned only if the job fails.</p>
         * 
         * <strong>example:</strong>
         * <p>The specified &quot;Width_Height&quot; has exceeded maximum value.</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The time in UTC when the media producing job was last modified, formatted as <code>YYYY-MM-DD\\&quot;T\\&quot;hh:mm:ss\\&quot;Z\\&quot;</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-12-23T13:33:49Z</p>
         */
        @NameInMap("ModifiedTime")
        public String modifiedTime;

        /**
         * <p>The progress of the job. Valid values: 0 to 100.</p>
         */
        @NameInMap("Progress")
        public Integer progress;

        /**
         * <p>The project ID.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong>fddd7748b58bf1d47e95</strong></strong></p>
         */
        @NameInMap("ProjectId")
        public String projectId;

        /**
         * <p>The status of the media producing job. Valid values:</p>
         * <ul>
         * <li><p><code>Init</code> (Initialized)</p>
         * </li>
         * <li><p><code>Queuing</code> (In queue)</p>
         * </li>
         * <li><p><code>Processing</code> (In progress)</p>
         * </li>
         * <li><p><code>Success</code> (Successful)</p>
         * </li>
         * <li><p><code>Failed</code> (Failed)</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Failed</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>If the job is a subtask of a batch smart one-click video creation task, this parameter contains the subtask\&quot;s materials, such as the title and speech script.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;Title&quot;: &quot;标题&quot;, &quot;SpeechText&quot;: &quot;批量智能一键成片口播文案&quot;}</p>
         */
        @NameInMap("SubJobMaterials")
        public String subJobMaterials;

        /**
         * <p>The ID of the template used for the job.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong>6e76134d739cc3e85d3e</strong></strong></p>
         */
        @NameInMap("TemplateId")
        public String templateId;

        /**
         * <p>The timeline of the media producing job.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;VideoTracks&quot;:[{&quot;VideoTrackClips&quot;:[{&quot;MediaId&quot;:&quot;<strong><strong>4d7cf14dc7b83b0e801c</strong></strong>&quot;},{&quot;MediaId&quot;:&quot;<strong><strong>4d7cf14dc7b83b0e801c</strong></strong>&quot;}]}]}</p>
         */
        @NameInMap("Timeline")
        public String timeline;

        /**
         * <p>The user data, in JSON format.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;NotifyAddress&quot;:&quot;<a href="http://xx.xx.xxx%22,%22Key%22:%22Valuexxx%22%7D">http://xx.xx.xxx&quot;,&quot;Key&quot;:&quot;Valuexxx&quot;}</a></p>
         */
        @NameInMap("UserData")
        public String userData;

        /**
         * <p>The ID of the media asset in VOD (Video on Demand). This ID is returned if the job\&quot;s output is stored in VOD.</p>
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

        public GetMediaProducingJobResponseBodyMediaProducingJob setProgress(Integer progress) {
            this.progress = progress;
            return this;
        }
        public Integer getProgress() {
            return this.progress;
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
