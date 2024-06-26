// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetMediaProducingJobResponseBody extends TeaModel {
    @NameInMap("MediaProducingJob")
    public GetMediaProducingJobResponseBodyMediaProducingJob mediaProducingJob;

    /**
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
         * <strong>example:</strong>
         * <p>{&quot;VideoArray&quot;:[&quot;<strong><strong>05512043f49f697f7425</strong></strong>&quot;,&quot;<strong><strong>05512043f49f697f7425</strong></strong>&quot;,&quot;<strong><strong>05512043f49f697f7425</strong></strong>&quot;]}</p>
         */
        @NameInMap("ClipsParam")
        public String clipsParam;

        /**
         * <strong>example:</strong>
         * <p>ExceededMaximumValue</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <strong>example:</strong>
         * <p>2020-12-23T13:33:52Z</p>
         */
        @NameInMap("CompleteTime")
        public String completeTime;

        /**
         * <strong>example:</strong>
         * <p>2020-12-23T13:33:40Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>30.500000</p>
         */
        @NameInMap("Duration")
        public Float duration;

        /**
         * <strong>example:</strong>
         * <p><strong><strong>cdb3e74639973036bc84</strong></strong></p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <strong>example:</strong>
         * <p><strong><strong>0cc6ba49eab379332c5b</strong></strong></p>
         */
        @NameInMap("MediaId")
        public String mediaId;

        /**
         * <strong>example:</strong>
         * <p><a href="http://example-bucket.oss-cn-shanghai.aliyuncs.com/example2.mp4">http://example-bucket.oss-cn-shanghai.aliyuncs.com/example2.mp4</a></p>
         */
        @NameInMap("MediaURL")
        public String mediaURL;

        /**
         * <strong>example:</strong>
         * <p>The specified &quot;Width_Height&quot; has exceeded maximum value.</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <strong>example:</strong>
         * <p>2020-12-23T13:33:49Z</p>
         */
        @NameInMap("ModifiedTime")
        public String modifiedTime;

        /**
         * <strong>example:</strong>
         * <p><strong><strong>fddd7748b58bf1d47e95</strong></strong></p>
         */
        @NameInMap("ProjectId")
        public String projectId;

        /**
         * <strong>example:</strong>
         * <p>Failed</p>
         */
        @NameInMap("Status")
        public String status;

        @NameInMap("SubJobMaterials")
        public String subJobMaterials;

        /**
         * <strong>example:</strong>
         * <p><strong><strong>6e76134d739cc3e85d3e</strong></strong></p>
         */
        @NameInMap("TemplateId")
        public String templateId;

        /**
         * <strong>example:</strong>
         * <p>{&quot;VideoTracks&quot;:[{&quot;VideoTrackClips&quot;:[{&quot;MediaId&quot;:&quot;<strong><strong>4d7cf14dc7b83b0e801c</strong></strong>&quot;},{&quot;MediaId&quot;:&quot;<strong><strong>4d7cf14dc7b83b0e801c</strong></strong>&quot;}]}]}</p>
         */
        @NameInMap("Timeline")
        public String timeline;

        @NameInMap("UserData")
        public String userData;

        /**
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
