// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListMediaProducingJobsResponseBody extends TeaModel {
    @NameInMap("MaxResults")
    public String maxResults;

    @NameInMap("MediaProducingJobList")
    public java.util.List<ListMediaProducingJobsResponseBodyMediaProducingJobList> mediaProducingJobList;

    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>Id of the request</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListMediaProducingJobsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMediaProducingJobsResponseBody self = new ListMediaProducingJobsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMediaProducingJobsResponseBody setMaxResults(String maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public String getMaxResults() {
        return this.maxResults;
    }

    public ListMediaProducingJobsResponseBody setMediaProducingJobList(java.util.List<ListMediaProducingJobsResponseBodyMediaProducingJobList> mediaProducingJobList) {
        this.mediaProducingJobList = mediaProducingJobList;
        return this;
    }
    public java.util.List<ListMediaProducingJobsResponseBodyMediaProducingJobList> getMediaProducingJobList() {
        return this.mediaProducingJobList;
    }

    public ListMediaProducingJobsResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListMediaProducingJobsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListMediaProducingJobsResponseBodyMediaProducingJobList extends TeaModel {
        @NameInMap("ClipsParam")
        public String clipsParam;

        @NameInMap("Code")
        public String code;

        @NameInMap("CompleteTime")
        public String completeTime;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Duration")
        public Float duration;

        @NameInMap("JobId")
        public String jobId;

        @NameInMap("MediaId")
        public String mediaId;

        @NameInMap("MediaURL")
        public String mediaURL;

        @NameInMap("Message")
        public String message;

        @NameInMap("ModifiedTime")
        public String modifiedTime;

        @NameInMap("ProjectId")
        public String projectId;

        @NameInMap("Status")
        public String status;

        @NameInMap("TemplateId")
        public String templateId;

        @NameInMap("UserData")
        public String userData;

        public static ListMediaProducingJobsResponseBodyMediaProducingJobList build(java.util.Map<String, ?> map) throws Exception {
            ListMediaProducingJobsResponseBodyMediaProducingJobList self = new ListMediaProducingJobsResponseBodyMediaProducingJobList();
            return TeaModel.build(map, self);
        }

        public ListMediaProducingJobsResponseBodyMediaProducingJobList setClipsParam(String clipsParam) {
            this.clipsParam = clipsParam;
            return this;
        }
        public String getClipsParam() {
            return this.clipsParam;
        }

        public ListMediaProducingJobsResponseBodyMediaProducingJobList setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ListMediaProducingJobsResponseBodyMediaProducingJobList setCompleteTime(String completeTime) {
            this.completeTime = completeTime;
            return this;
        }
        public String getCompleteTime() {
            return this.completeTime;
        }

        public ListMediaProducingJobsResponseBodyMediaProducingJobList setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public ListMediaProducingJobsResponseBodyMediaProducingJobList setDuration(Float duration) {
            this.duration = duration;
            return this;
        }
        public Float getDuration() {
            return this.duration;
        }

        public ListMediaProducingJobsResponseBodyMediaProducingJobList setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
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

        public ListMediaProducingJobsResponseBodyMediaProducingJobList setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ListMediaProducingJobsResponseBodyMediaProducingJobList setModifiedTime(String modifiedTime) {
            this.modifiedTime = modifiedTime;
            return this;
        }
        public String getModifiedTime() {
            return this.modifiedTime;
        }

        public ListMediaProducingJobsResponseBodyMediaProducingJobList setProjectId(String projectId) {
            this.projectId = projectId;
            return this;
        }
        public String getProjectId() {
            return this.projectId;
        }

        public ListMediaProducingJobsResponseBodyMediaProducingJobList setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListMediaProducingJobsResponseBodyMediaProducingJobList setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public ListMediaProducingJobsResponseBodyMediaProducingJobList setUserData(String userData) {
            this.userData = userData;
            return this;
        }
        public String getUserData() {
            return this.userData;
        }

    }

}
