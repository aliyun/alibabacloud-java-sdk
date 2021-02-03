// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class GetMediaProducingJobResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("MediaProducingJob")
    public GetMediaProducingJobResponseBodyMediaProducingJob mediaProducingJob;

    public static GetMediaProducingJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetMediaProducingJobResponseBody self = new GetMediaProducingJobResponseBody();
        return TeaModel.build(map, self);
    }

    public GetMediaProducingJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetMediaProducingJobResponseBody setMediaProducingJob(GetMediaProducingJobResponseBodyMediaProducingJob mediaProducingJob) {
        this.mediaProducingJob = mediaProducingJob;
        return this;
    }
    public GetMediaProducingJobResponseBodyMediaProducingJob getMediaProducingJob() {
        return this.mediaProducingJob;
    }

    public static class GetMediaProducingJobResponseBodyMediaProducingJob extends TeaModel {
        @NameInMap("JobId")
        public String jobId;

        @NameInMap("ProjectId")
        public String projectId;

        @NameInMap("MediaId")
        public String mediaId;

        @NameInMap("MediaURL")
        public String mediaURL;

        @NameInMap("Timeline")
        public String timeline;

        @NameInMap("TemplateId")
        public String templateId;

        @NameInMap("ClipsParam")
        public String clipsParam;

        @NameInMap("Duration")
        public Float duration;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("CompleteTime")
        public String completeTime;

        @NameInMap("Status")
        public String status;

        @NameInMap("Code")
        public String code;

        @NameInMap("Message")
        public String message;

        public static GetMediaProducingJobResponseBodyMediaProducingJob build(java.util.Map<String, ?> map) throws Exception {
            GetMediaProducingJobResponseBodyMediaProducingJob self = new GetMediaProducingJobResponseBodyMediaProducingJob();
            return TeaModel.build(map, self);
        }

        public GetMediaProducingJobResponseBodyMediaProducingJob setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public GetMediaProducingJobResponseBodyMediaProducingJob setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
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

        public GetMediaProducingJobResponseBodyMediaProducingJob setTimeline(String timeline) {
            this.timeline = timeline;
            return this;
        }
        public String getTimeline() {
            return this.timeline;
        }

        public GetMediaProducingJobResponseBodyMediaProducingJob setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public GetMediaProducingJobResponseBodyMediaProducingJob setClipsParam(String clipsParam) {
            this.clipsParam = clipsParam;
            return this;
        }
        public String getClipsParam() {
            return this.clipsParam;
        }

        public GetMediaProducingJobResponseBodyMediaProducingJob setDuration(Float duration) {
            this.duration = duration;
            return this;
        }
        public Float getDuration() {
            return this.duration;
        }

        public GetMediaProducingJobResponseBodyMediaProducingJob setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetMediaProducingJobResponseBodyMediaProducingJob setCompleteTime(String completeTime) {
            this.completeTime = completeTime;
            return this;
        }
        public String getCompleteTime() {
            return this.completeTime;
        }

        public GetMediaProducingJobResponseBodyMediaProducingJob setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetMediaProducingJobResponseBodyMediaProducingJob setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public GetMediaProducingJobResponseBodyMediaProducingJob setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

}
