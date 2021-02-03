// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListMediaProducingJobsResponseBody extends TeaModel {
    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("MediaProducingJobList")
    public java.util.List<ListMediaProducingJobsResponseBodyMediaProducingJobList> mediaProducingJobList;

    public static ListMediaProducingJobsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMediaProducingJobsResponseBody self = new ListMediaProducingJobsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMediaProducingJobsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListMediaProducingJobsResponseBody setMediaProducingJobList(java.util.List<ListMediaProducingJobsResponseBodyMediaProducingJobList> mediaProducingJobList) {
        this.mediaProducingJobList = mediaProducingJobList;
        return this;
    }
    public java.util.List<ListMediaProducingJobsResponseBodyMediaProducingJobList> getMediaProducingJobList() {
        return this.mediaProducingJobList;
    }

    public static class ListMediaProducingJobsResponseBodyMediaProducingJobList extends TeaModel {
        @NameInMap("JobId")
        public String jobId;

        @NameInMap("ProjectId")
        public String projectId;

        @NameInMap("MediaId")
        public String mediaId;

        @NameInMap("MediaURL")
        public String mediaURL;

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

        @NameInMap("ModifiedTime")
        public String modifiedTime;

        @NameInMap("Status")
        public String status;

        @NameInMap("Code")
        public String code;

        @NameInMap("Message")
        public String message;

        public static ListMediaProducingJobsResponseBodyMediaProducingJobList build(java.util.Map<String, ?> map) throws Exception {
            ListMediaProducingJobsResponseBodyMediaProducingJobList self = new ListMediaProducingJobsResponseBodyMediaProducingJobList();
            return TeaModel.build(map, self);
        }

        public ListMediaProducingJobsResponseBodyMediaProducingJobList setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public ListMediaProducingJobsResponseBodyMediaProducingJobList setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public ListMediaProducingJobsResponseBodyMediaProducingJobList setMediaId(String mediaId) {
            this.mediaId = mediaId;
            return this;
        }
        public String getMediaId() {
            return this.mediaId;
        }

        public ListMediaProducingJobsResponseBodyMediaProducingJobList setMediaURL(String mediaURL) {
            this.mediaURL = mediaURL;
            return this;
        }
        public String getMediaURL() {
            return this.mediaURL;
        }

        public ListMediaProducingJobsResponseBodyMediaProducingJobList setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public ListMediaProducingJobsResponseBodyMediaProducingJobList setClipsParam(String clipsParam) {
            this.clipsParam = clipsParam;
            return this;
        }
        public String getClipsParam() {
            return this.clipsParam;
        }

        public ListMediaProducingJobsResponseBodyMediaProducingJobList setDuration(Float duration) {
            this.duration = duration;
            return this;
        }
        public Float getDuration() {
            return this.duration;
        }

        public ListMediaProducingJobsResponseBodyMediaProducingJobList setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListMediaProducingJobsResponseBodyMediaProducingJobList setCompleteTime(String completeTime) {
            this.completeTime = completeTime;
            return this;
        }
        public String getCompleteTime() {
            return this.completeTime;
        }

        public ListMediaProducingJobsResponseBodyMediaProducingJobList setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public ListMediaProducingJobsResponseBodyMediaProducingJobList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListMediaProducingJobsResponseBodyMediaProducingJobList setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ListMediaProducingJobsResponseBodyMediaProducingJobList setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

}
