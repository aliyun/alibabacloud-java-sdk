// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListMediaProducingJobsResponseBody extends TeaModel {
    /**
     * <p>The maximum number of entries returned.</p>
     * <p>Default value: 10. Valid values: 1 to 100.</p>
     * 
     * <strong>example:</strong>
     * <p>100</p>
     */
    @NameInMap("MaxResults")
    public String maxResults;

    /**
     * <p>The queried media editing and production jobs.</p>
     */
    @NameInMap("MediaProducingJobList")
    public java.util.List<ListMediaProducingJobsResponseBodyMediaProducingJobList> mediaProducingJobList;

    /**
     * <p>A pagination token. It can be used in the next request to retrieve a new page of results.</p>
     * 
     * <strong>example:</strong>
     * <p>8EqYpQbZ6Eh7+Zz8DxVYoQ==</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p><strong><strong><strong>11-DB8D-4A9A-875B-275798</strong></strong></strong></p>
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
        /**
         * <p>The template material parameters.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;Text1&quot;:&quot;text&quot;,&quot;Text0&quot;:&quot;text&quot;,&quot;Media1&quot;:&quot;mediaId&quot;,&quot;Media0&quot;:&quot;mediaId&quot;}</p>
         */
        @NameInMap("ClipsParam")
        public String clipsParam;

        /**
         * <p>The response code.</p>
         * 
         * <strong>example:</strong>
         * <p>Success</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The time when the job was complete. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-03-21T16:40:30Z</p>
         */
        @NameInMap("CompleteTime")
        public String completeTime;

        /**
         * <p>The time when the job was created. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-03-21T16:40:00Z</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The duration of the output file. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>15.5</p>
         */
        @NameInMap("Duration")
        public Float duration;

        /**
         * <p>The ID of the online editing job.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong><strong>8750b54e3c976a47da6f</strong></strong></strong></p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <p>The media asset ID of the output file.</p>
         * 
         * <strong>example:</strong>
         * <p>0ce4ea70f52471edab61f7e7d6786302</p>
         */
        @NameInMap("MediaId")
        public String mediaId;

        /**
         * <p>The URL of the output file.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://your-bucket.oss-cn-shanghai.aliyuncs.com/your-video.mp4">http://your-bucket.oss-cn-shanghai.aliyuncs.com/your-video.mp4</a></p>
         */
        @NameInMap("MediaURL")
        public String mediaURL;

        /**
         * <p>The returned message. Note: Pay attention to this parameter if the job failed.</p>
         * 
         * <strong>example:</strong>
         * <p>The resource operated InputFile is bad</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The time when the job was last modified.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-03-21T16:41:00Z</p>
         */
        @NameInMap("ModifiedTime")
        public String modifiedTime;

        /**
         * <p>The ID of the online editing project.</p>
         * 
         * <strong>example:</strong>
         * <p><strong><strong><strong>faa3b542f5a6135217e3</strong></strong></strong></p>
         */
        @NameInMap("ProjectId")
        public String projectId;

        /**
         * <p>The job state.</p>
         * 
         * <strong>example:</strong>
         * <p>Sucess</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The ID of the online editing template.</p>
         * 
         * <strong>example:</strong>
         * <p>cb786a39c5d44cecb23d8c864facffc1</p>
         */
        @NameInMap("TemplateId")
        public String templateId;

        /**
         * <p>The user-defined data in the JSON format.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;key&quot;:&quot;value&quot;}</p>
         */
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
