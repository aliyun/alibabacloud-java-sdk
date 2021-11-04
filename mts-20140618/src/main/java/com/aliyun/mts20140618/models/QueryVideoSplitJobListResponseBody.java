// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class QueryVideoSplitJobListResponseBody extends TeaModel {
    @NameInMap("JobList")
    public QueryVideoSplitJobListResponseBodyJobList jobList;

    @NameInMap("NonExistIds")
    public QueryVideoSplitJobListResponseBodyNonExistIds nonExistIds;

    @NameInMap("RequestId")
    public String requestId;

    public static QueryVideoSplitJobListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryVideoSplitJobListResponseBody self = new QueryVideoSplitJobListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryVideoSplitJobListResponseBody setJobList(QueryVideoSplitJobListResponseBodyJobList jobList) {
        this.jobList = jobList;
        return this;
    }
    public QueryVideoSplitJobListResponseBodyJobList getJobList() {
        return this.jobList;
    }

    public QueryVideoSplitJobListResponseBody setNonExistIds(QueryVideoSplitJobListResponseBodyNonExistIds nonExistIds) {
        this.nonExistIds = nonExistIds;
        return this;
    }
    public QueryVideoSplitJobListResponseBodyNonExistIds getNonExistIds() {
        return this.nonExistIds;
    }

    public QueryVideoSplitJobListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class QueryVideoSplitJobListResponseBodyJobListJobInput extends TeaModel {
        @NameInMap("Bucket")
        public String bucket;

        @NameInMap("Location")
        public String location;

        @NameInMap("Object")
        public String object;

        public static QueryVideoSplitJobListResponseBodyJobListJobInput build(java.util.Map<String, ?> map) throws Exception {
            QueryVideoSplitJobListResponseBodyJobListJobInput self = new QueryVideoSplitJobListResponseBodyJobListJobInput();
            return TeaModel.build(map, self);
        }

        public QueryVideoSplitJobListResponseBodyJobListJobInput setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

        public QueryVideoSplitJobListResponseBodyJobListJobInput setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public QueryVideoSplitJobListResponseBodyJobListJobInput setObject(String object) {
            this.object = object;
            return this;
        }
        public String getObject() {
            return this.object;
        }

    }

    public static class QueryVideoSplitJobListResponseBodyJobListJobVideoSplitResultVideoSplitListVideoSplit extends TeaModel {
        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("Path")
        public String path;

        @NameInMap("StartTime")
        public String startTime;

        public static QueryVideoSplitJobListResponseBodyJobListJobVideoSplitResultVideoSplitListVideoSplit build(java.util.Map<String, ?> map) throws Exception {
            QueryVideoSplitJobListResponseBodyJobListJobVideoSplitResultVideoSplitListVideoSplit self = new QueryVideoSplitJobListResponseBodyJobListJobVideoSplitResultVideoSplitListVideoSplit();
            return TeaModel.build(map, self);
        }

        public QueryVideoSplitJobListResponseBodyJobListJobVideoSplitResultVideoSplitListVideoSplit setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public QueryVideoSplitJobListResponseBodyJobListJobVideoSplitResultVideoSplitListVideoSplit setPath(String path) {
            this.path = path;
            return this;
        }
        public String getPath() {
            return this.path;
        }

        public QueryVideoSplitJobListResponseBodyJobListJobVideoSplitResultVideoSplitListVideoSplit setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

    public static class QueryVideoSplitJobListResponseBodyJobListJobVideoSplitResultVideoSplitList extends TeaModel {
        @NameInMap("VideoSplit")
        public java.util.List<QueryVideoSplitJobListResponseBodyJobListJobVideoSplitResultVideoSplitListVideoSplit> videoSplit;

        public static QueryVideoSplitJobListResponseBodyJobListJobVideoSplitResultVideoSplitList build(java.util.Map<String, ?> map) throws Exception {
            QueryVideoSplitJobListResponseBodyJobListJobVideoSplitResultVideoSplitList self = new QueryVideoSplitJobListResponseBodyJobListJobVideoSplitResultVideoSplitList();
            return TeaModel.build(map, self);
        }

        public QueryVideoSplitJobListResponseBodyJobListJobVideoSplitResultVideoSplitList setVideoSplit(java.util.List<QueryVideoSplitJobListResponseBodyJobListJobVideoSplitResultVideoSplitListVideoSplit> videoSplit) {
            this.videoSplit = videoSplit;
            return this;
        }
        public java.util.List<QueryVideoSplitJobListResponseBodyJobListJobVideoSplitResultVideoSplitListVideoSplit> getVideoSplit() {
            return this.videoSplit;
        }

    }

    public static class QueryVideoSplitJobListResponseBodyJobListJobVideoSplitResult extends TeaModel {
        @NameInMap("VideoSplitList")
        public QueryVideoSplitJobListResponseBodyJobListJobVideoSplitResultVideoSplitList videoSplitList;

        public static QueryVideoSplitJobListResponseBodyJobListJobVideoSplitResult build(java.util.Map<String, ?> map) throws Exception {
            QueryVideoSplitJobListResponseBodyJobListJobVideoSplitResult self = new QueryVideoSplitJobListResponseBodyJobListJobVideoSplitResult();
            return TeaModel.build(map, self);
        }

        public QueryVideoSplitJobListResponseBodyJobListJobVideoSplitResult setVideoSplitList(QueryVideoSplitJobListResponseBodyJobListJobVideoSplitResultVideoSplitList videoSplitList) {
            this.videoSplitList = videoSplitList;
            return this;
        }
        public QueryVideoSplitJobListResponseBodyJobListJobVideoSplitResultVideoSplitList getVideoSplitList() {
            return this.videoSplitList;
        }

    }

    public static class QueryVideoSplitJobListResponseBodyJobListJob extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("Id")
        public String id;

        @NameInMap("Input")
        public QueryVideoSplitJobListResponseBodyJobListJobInput input;

        @NameInMap("Message")
        public String message;

        @NameInMap("PipelineId")
        public String pipelineId;

        @NameInMap("State")
        public String state;

        @NameInMap("UserData")
        public String userData;

        @NameInMap("VideoSplitResult")
        public QueryVideoSplitJobListResponseBodyJobListJobVideoSplitResult videoSplitResult;

        public static QueryVideoSplitJobListResponseBodyJobListJob build(java.util.Map<String, ?> map) throws Exception {
            QueryVideoSplitJobListResponseBodyJobListJob self = new QueryVideoSplitJobListResponseBodyJobListJob();
            return TeaModel.build(map, self);
        }

        public QueryVideoSplitJobListResponseBodyJobListJob setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryVideoSplitJobListResponseBodyJobListJob setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public QueryVideoSplitJobListResponseBodyJobListJob setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryVideoSplitJobListResponseBodyJobListJob setInput(QueryVideoSplitJobListResponseBodyJobListJobInput input) {
            this.input = input;
            return this;
        }
        public QueryVideoSplitJobListResponseBodyJobListJobInput getInput() {
            return this.input;
        }

        public QueryVideoSplitJobListResponseBodyJobListJob setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public QueryVideoSplitJobListResponseBodyJobListJob setPipelineId(String pipelineId) {
            this.pipelineId = pipelineId;
            return this;
        }
        public String getPipelineId() {
            return this.pipelineId;
        }

        public QueryVideoSplitJobListResponseBodyJobListJob setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public QueryVideoSplitJobListResponseBodyJobListJob setUserData(String userData) {
            this.userData = userData;
            return this;
        }
        public String getUserData() {
            return this.userData;
        }

        public QueryVideoSplitJobListResponseBodyJobListJob setVideoSplitResult(QueryVideoSplitJobListResponseBodyJobListJobVideoSplitResult videoSplitResult) {
            this.videoSplitResult = videoSplitResult;
            return this;
        }
        public QueryVideoSplitJobListResponseBodyJobListJobVideoSplitResult getVideoSplitResult() {
            return this.videoSplitResult;
        }

    }

    public static class QueryVideoSplitJobListResponseBodyJobList extends TeaModel {
        @NameInMap("Job")
        public java.util.List<QueryVideoSplitJobListResponseBodyJobListJob> job;

        public static QueryVideoSplitJobListResponseBodyJobList build(java.util.Map<String, ?> map) throws Exception {
            QueryVideoSplitJobListResponseBodyJobList self = new QueryVideoSplitJobListResponseBodyJobList();
            return TeaModel.build(map, self);
        }

        public QueryVideoSplitJobListResponseBodyJobList setJob(java.util.List<QueryVideoSplitJobListResponseBodyJobListJob> job) {
            this.job = job;
            return this;
        }
        public java.util.List<QueryVideoSplitJobListResponseBodyJobListJob> getJob() {
            return this.job;
        }

    }

    public static class QueryVideoSplitJobListResponseBodyNonExistIds extends TeaModel {
        @NameInMap("String")
        public java.util.List<String> string;

        public static QueryVideoSplitJobListResponseBodyNonExistIds build(java.util.Map<String, ?> map) throws Exception {
            QueryVideoSplitJobListResponseBodyNonExistIds self = new QueryVideoSplitJobListResponseBodyNonExistIds();
            return TeaModel.build(map, self);
        }

        public QueryVideoSplitJobListResponseBodyNonExistIds setString(java.util.List<String> string) {
            this.string = string;
            return this;
        }
        public java.util.List<String> getString() {
            return this.string;
        }

    }

}
