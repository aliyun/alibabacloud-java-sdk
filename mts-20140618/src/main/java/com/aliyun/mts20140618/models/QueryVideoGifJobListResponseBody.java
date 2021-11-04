// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class QueryVideoGifJobListResponseBody extends TeaModel {
    @NameInMap("JobList")
    public QueryVideoGifJobListResponseBodyJobList jobList;

    @NameInMap("NonExistIds")
    public QueryVideoGifJobListResponseBodyNonExistIds nonExistIds;

    @NameInMap("RequestId")
    public String requestId;

    public static QueryVideoGifJobListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryVideoGifJobListResponseBody self = new QueryVideoGifJobListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryVideoGifJobListResponseBody setJobList(QueryVideoGifJobListResponseBodyJobList jobList) {
        this.jobList = jobList;
        return this;
    }
    public QueryVideoGifJobListResponseBodyJobList getJobList() {
        return this.jobList;
    }

    public QueryVideoGifJobListResponseBody setNonExistIds(QueryVideoGifJobListResponseBodyNonExistIds nonExistIds) {
        this.nonExistIds = nonExistIds;
        return this;
    }
    public QueryVideoGifJobListResponseBodyNonExistIds getNonExistIds() {
        return this.nonExistIds;
    }

    public QueryVideoGifJobListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class QueryVideoGifJobListResponseBodyJobListJobInput extends TeaModel {
        @NameInMap("Bucket")
        public String bucket;

        @NameInMap("Location")
        public String location;

        @NameInMap("Object")
        public String object;

        public static QueryVideoGifJobListResponseBodyJobListJobInput build(java.util.Map<String, ?> map) throws Exception {
            QueryVideoGifJobListResponseBodyJobListJobInput self = new QueryVideoGifJobListResponseBodyJobListJobInput();
            return TeaModel.build(map, self);
        }

        public QueryVideoGifJobListResponseBodyJobListJobInput setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

        public QueryVideoGifJobListResponseBodyJobListJobInput setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public QueryVideoGifJobListResponseBodyJobListJobInput setObject(String object) {
            this.object = object;
            return this;
        }
        public String getObject() {
            return this.object;
        }

    }

    public static class QueryVideoGifJobListResponseBodyJobListJobVideoGifResultOutputFile extends TeaModel {
        @NameInMap("Bucket")
        public String bucket;

        @NameInMap("Location")
        public String location;

        @NameInMap("Object")
        public String object;

        public static QueryVideoGifJobListResponseBodyJobListJobVideoGifResultOutputFile build(java.util.Map<String, ?> map) throws Exception {
            QueryVideoGifJobListResponseBodyJobListJobVideoGifResultOutputFile self = new QueryVideoGifJobListResponseBodyJobListJobVideoGifResultOutputFile();
            return TeaModel.build(map, self);
        }

        public QueryVideoGifJobListResponseBodyJobListJobVideoGifResultOutputFile setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

        public QueryVideoGifJobListResponseBodyJobListJobVideoGifResultOutputFile setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public QueryVideoGifJobListResponseBodyJobListJobVideoGifResultOutputFile setObject(String object) {
            this.object = object;
            return this;
        }
        public String getObject() {
            return this.object;
        }

    }

    public static class QueryVideoGifJobListResponseBodyJobListJobVideoGifResult extends TeaModel {
        @NameInMap("OutputFile")
        public QueryVideoGifJobListResponseBodyJobListJobVideoGifResultOutputFile outputFile;

        public static QueryVideoGifJobListResponseBodyJobListJobVideoGifResult build(java.util.Map<String, ?> map) throws Exception {
            QueryVideoGifJobListResponseBodyJobListJobVideoGifResult self = new QueryVideoGifJobListResponseBodyJobListJobVideoGifResult();
            return TeaModel.build(map, self);
        }

        public QueryVideoGifJobListResponseBodyJobListJobVideoGifResult setOutputFile(QueryVideoGifJobListResponseBodyJobListJobVideoGifResultOutputFile outputFile) {
            this.outputFile = outputFile;
            return this;
        }
        public QueryVideoGifJobListResponseBodyJobListJobVideoGifResultOutputFile getOutputFile() {
            return this.outputFile;
        }

    }

    public static class QueryVideoGifJobListResponseBodyJobListJob extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("Id")
        public String id;

        @NameInMap("Input")
        public QueryVideoGifJobListResponseBodyJobListJobInput input;

        @NameInMap("Message")
        public String message;

        @NameInMap("PipelineId")
        public String pipelineId;

        @NameInMap("State")
        public String state;

        @NameInMap("UserData")
        public String userData;

        @NameInMap("VideoGifResult")
        public QueryVideoGifJobListResponseBodyJobListJobVideoGifResult videoGifResult;

        public static QueryVideoGifJobListResponseBodyJobListJob build(java.util.Map<String, ?> map) throws Exception {
            QueryVideoGifJobListResponseBodyJobListJob self = new QueryVideoGifJobListResponseBodyJobListJob();
            return TeaModel.build(map, self);
        }

        public QueryVideoGifJobListResponseBodyJobListJob setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryVideoGifJobListResponseBodyJobListJob setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public QueryVideoGifJobListResponseBodyJobListJob setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryVideoGifJobListResponseBodyJobListJob setInput(QueryVideoGifJobListResponseBodyJobListJobInput input) {
            this.input = input;
            return this;
        }
        public QueryVideoGifJobListResponseBodyJobListJobInput getInput() {
            return this.input;
        }

        public QueryVideoGifJobListResponseBodyJobListJob setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public QueryVideoGifJobListResponseBodyJobListJob setPipelineId(String pipelineId) {
            this.pipelineId = pipelineId;
            return this;
        }
        public String getPipelineId() {
            return this.pipelineId;
        }

        public QueryVideoGifJobListResponseBodyJobListJob setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public QueryVideoGifJobListResponseBodyJobListJob setUserData(String userData) {
            this.userData = userData;
            return this;
        }
        public String getUserData() {
            return this.userData;
        }

        public QueryVideoGifJobListResponseBodyJobListJob setVideoGifResult(QueryVideoGifJobListResponseBodyJobListJobVideoGifResult videoGifResult) {
            this.videoGifResult = videoGifResult;
            return this;
        }
        public QueryVideoGifJobListResponseBodyJobListJobVideoGifResult getVideoGifResult() {
            return this.videoGifResult;
        }

    }

    public static class QueryVideoGifJobListResponseBodyJobList extends TeaModel {
        @NameInMap("Job")
        public java.util.List<QueryVideoGifJobListResponseBodyJobListJob> job;

        public static QueryVideoGifJobListResponseBodyJobList build(java.util.Map<String, ?> map) throws Exception {
            QueryVideoGifJobListResponseBodyJobList self = new QueryVideoGifJobListResponseBodyJobList();
            return TeaModel.build(map, self);
        }

        public QueryVideoGifJobListResponseBodyJobList setJob(java.util.List<QueryVideoGifJobListResponseBodyJobListJob> job) {
            this.job = job;
            return this;
        }
        public java.util.List<QueryVideoGifJobListResponseBodyJobListJob> getJob() {
            return this.job;
        }

    }

    public static class QueryVideoGifJobListResponseBodyNonExistIds extends TeaModel {
        @NameInMap("String")
        public java.util.List<String> string;

        public static QueryVideoGifJobListResponseBodyNonExistIds build(java.util.Map<String, ?> map) throws Exception {
            QueryVideoGifJobListResponseBodyNonExistIds self = new QueryVideoGifJobListResponseBodyNonExistIds();
            return TeaModel.build(map, self);
        }

        public QueryVideoGifJobListResponseBodyNonExistIds setString(java.util.List<String> string) {
            this.string = string;
            return this;
        }
        public java.util.List<String> getString() {
            return this.string;
        }

    }

}
