// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class QueryCoverJobListResponseBody extends TeaModel {
    @NameInMap("CoverJobList")
    public QueryCoverJobListResponseBodyCoverJobList coverJobList;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("NextPageToken")
    public String nextPageToken;

    @NameInMap("NonExistIds")
    public QueryCoverJobListResponseBodyNonExistIds nonExistIds;

    public static QueryCoverJobListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryCoverJobListResponseBody self = new QueryCoverJobListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryCoverJobListResponseBody setCoverJobList(QueryCoverJobListResponseBodyCoverJobList coverJobList) {
        this.coverJobList = coverJobList;
        return this;
    }
    public QueryCoverJobListResponseBodyCoverJobList getCoverJobList() {
        return this.coverJobList;
    }

    public QueryCoverJobListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryCoverJobListResponseBody setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
        return this;
    }
    public String getNextPageToken() {
        return this.nextPageToken;
    }

    public QueryCoverJobListResponseBody setNonExistIds(QueryCoverJobListResponseBodyNonExistIds nonExistIds) {
        this.nonExistIds = nonExistIds;
        return this;
    }
    public QueryCoverJobListResponseBodyNonExistIds getNonExistIds() {
        return this.nonExistIds;
    }

    public static class QueryCoverJobListResponseBodyCoverJobListCoverJobCoverImageListCoverImage extends TeaModel {
        @NameInMap("Time")
        public String time;

        @NameInMap("Score")
        public String score;

        @NameInMap("Url")
        public String url;

        public static QueryCoverJobListResponseBodyCoverJobListCoverJobCoverImageListCoverImage build(java.util.Map<String, ?> map) throws Exception {
            QueryCoverJobListResponseBodyCoverJobListCoverJobCoverImageListCoverImage self = new QueryCoverJobListResponseBodyCoverJobListCoverJobCoverImageListCoverImage();
            return TeaModel.build(map, self);
        }

        public QueryCoverJobListResponseBodyCoverJobListCoverJobCoverImageListCoverImage setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
        }

        public QueryCoverJobListResponseBodyCoverJobListCoverJobCoverImageListCoverImage setScore(String score) {
            this.score = score;
            return this;
        }
        public String getScore() {
            return this.score;
        }

        public QueryCoverJobListResponseBodyCoverJobListCoverJobCoverImageListCoverImage setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class QueryCoverJobListResponseBodyCoverJobListCoverJobCoverImageList extends TeaModel {
        @NameInMap("CoverImage")
        public java.util.List<QueryCoverJobListResponseBodyCoverJobListCoverJobCoverImageListCoverImage> coverImage;

        public static QueryCoverJobListResponseBodyCoverJobListCoverJobCoverImageList build(java.util.Map<String, ?> map) throws Exception {
            QueryCoverJobListResponseBodyCoverJobListCoverJobCoverImageList self = new QueryCoverJobListResponseBodyCoverJobListCoverJobCoverImageList();
            return TeaModel.build(map, self);
        }

        public QueryCoverJobListResponseBodyCoverJobListCoverJobCoverImageList setCoverImage(java.util.List<QueryCoverJobListResponseBodyCoverJobListCoverJobCoverImageListCoverImage> coverImage) {
            this.coverImage = coverImage;
            return this;
        }
        public java.util.List<QueryCoverJobListResponseBodyCoverJobListCoverJobCoverImageListCoverImage> getCoverImage() {
            return this.coverImage;
        }

    }

    public static class QueryCoverJobListResponseBodyCoverJobListCoverJobInput extends TeaModel {
        @NameInMap("Object")
        public String object;

        @NameInMap("Location")
        public String location;

        @NameInMap("Bucket")
        public String bucket;

        public static QueryCoverJobListResponseBodyCoverJobListCoverJobInput build(java.util.Map<String, ?> map) throws Exception {
            QueryCoverJobListResponseBodyCoverJobListCoverJobInput self = new QueryCoverJobListResponseBodyCoverJobListCoverJobInput();
            return TeaModel.build(map, self);
        }

        public QueryCoverJobListResponseBodyCoverJobListCoverJobInput setObject(String object) {
            this.object = object;
            return this;
        }
        public String getObject() {
            return this.object;
        }

        public QueryCoverJobListResponseBodyCoverJobListCoverJobInput setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public QueryCoverJobListResponseBodyCoverJobListCoverJobInput setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

    }

    public static class QueryCoverJobListResponseBodyCoverJobListCoverJobCoverConfigOutputFile extends TeaModel {
        @NameInMap("Object")
        public String object;

        @NameInMap("Location")
        public String location;

        @NameInMap("Bucket")
        public String bucket;

        public static QueryCoverJobListResponseBodyCoverJobListCoverJobCoverConfigOutputFile build(java.util.Map<String, ?> map) throws Exception {
            QueryCoverJobListResponseBodyCoverJobListCoverJobCoverConfigOutputFile self = new QueryCoverJobListResponseBodyCoverJobListCoverJobCoverConfigOutputFile();
            return TeaModel.build(map, self);
        }

        public QueryCoverJobListResponseBodyCoverJobListCoverJobCoverConfigOutputFile setObject(String object) {
            this.object = object;
            return this;
        }
        public String getObject() {
            return this.object;
        }

        public QueryCoverJobListResponseBodyCoverJobListCoverJobCoverConfigOutputFile setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public QueryCoverJobListResponseBodyCoverJobListCoverJobCoverConfigOutputFile setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

    }

    public static class QueryCoverJobListResponseBodyCoverJobListCoverJobCoverConfig extends TeaModel {
        @NameInMap("OutputFile")
        public QueryCoverJobListResponseBodyCoverJobListCoverJobCoverConfigOutputFile outputFile;

        public static QueryCoverJobListResponseBodyCoverJobListCoverJobCoverConfig build(java.util.Map<String, ?> map) throws Exception {
            QueryCoverJobListResponseBodyCoverJobListCoverJobCoverConfig self = new QueryCoverJobListResponseBodyCoverJobListCoverJobCoverConfig();
            return TeaModel.build(map, self);
        }

        public QueryCoverJobListResponseBodyCoverJobListCoverJobCoverConfig setOutputFile(QueryCoverJobListResponseBodyCoverJobListCoverJobCoverConfigOutputFile outputFile) {
            this.outputFile = outputFile;
            return this;
        }
        public QueryCoverJobListResponseBodyCoverJobListCoverJobCoverConfigOutputFile getOutputFile() {
            return this.outputFile;
        }

    }

    public static class QueryCoverJobListResponseBodyCoverJobListCoverJob extends TeaModel {
        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("State")
        public String state;

        @NameInMap("CoverImageList")
        public QueryCoverJobListResponseBodyCoverJobListCoverJobCoverImageList coverImageList;

        @NameInMap("UserData")
        public String userData;

        @NameInMap("Code")
        public String code;

        @NameInMap("Message")
        public String message;

        @NameInMap("PipelineId")
        public String pipelineId;

        @NameInMap("Input")
        public QueryCoverJobListResponseBodyCoverJobListCoverJobInput input;

        @NameInMap("Id")
        public String id;

        @NameInMap("CoverConfig")
        public QueryCoverJobListResponseBodyCoverJobListCoverJobCoverConfig coverConfig;

        public static QueryCoverJobListResponseBodyCoverJobListCoverJob build(java.util.Map<String, ?> map) throws Exception {
            QueryCoverJobListResponseBodyCoverJobListCoverJob self = new QueryCoverJobListResponseBodyCoverJobListCoverJob();
            return TeaModel.build(map, self);
        }

        public QueryCoverJobListResponseBodyCoverJobListCoverJob setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public QueryCoverJobListResponseBodyCoverJobListCoverJob setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public QueryCoverJobListResponseBodyCoverJobListCoverJob setCoverImageList(QueryCoverJobListResponseBodyCoverJobListCoverJobCoverImageList coverImageList) {
            this.coverImageList = coverImageList;
            return this;
        }
        public QueryCoverJobListResponseBodyCoverJobListCoverJobCoverImageList getCoverImageList() {
            return this.coverImageList;
        }

        public QueryCoverJobListResponseBodyCoverJobListCoverJob setUserData(String userData) {
            this.userData = userData;
            return this;
        }
        public String getUserData() {
            return this.userData;
        }

        public QueryCoverJobListResponseBodyCoverJobListCoverJob setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryCoverJobListResponseBodyCoverJobListCoverJob setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public QueryCoverJobListResponseBodyCoverJobListCoverJob setPipelineId(String pipelineId) {
            this.pipelineId = pipelineId;
            return this;
        }
        public String getPipelineId() {
            return this.pipelineId;
        }

        public QueryCoverJobListResponseBodyCoverJobListCoverJob setInput(QueryCoverJobListResponseBodyCoverJobListCoverJobInput input) {
            this.input = input;
            return this;
        }
        public QueryCoverJobListResponseBodyCoverJobListCoverJobInput getInput() {
            return this.input;
        }

        public QueryCoverJobListResponseBodyCoverJobListCoverJob setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryCoverJobListResponseBodyCoverJobListCoverJob setCoverConfig(QueryCoverJobListResponseBodyCoverJobListCoverJobCoverConfig coverConfig) {
            this.coverConfig = coverConfig;
            return this;
        }
        public QueryCoverJobListResponseBodyCoverJobListCoverJobCoverConfig getCoverConfig() {
            return this.coverConfig;
        }

    }

    public static class QueryCoverJobListResponseBodyCoverJobList extends TeaModel {
        @NameInMap("CoverJob")
        public java.util.List<QueryCoverJobListResponseBodyCoverJobListCoverJob> coverJob;

        public static QueryCoverJobListResponseBodyCoverJobList build(java.util.Map<String, ?> map) throws Exception {
            QueryCoverJobListResponseBodyCoverJobList self = new QueryCoverJobListResponseBodyCoverJobList();
            return TeaModel.build(map, self);
        }

        public QueryCoverJobListResponseBodyCoverJobList setCoverJob(java.util.List<QueryCoverJobListResponseBodyCoverJobListCoverJob> coverJob) {
            this.coverJob = coverJob;
            return this;
        }
        public java.util.List<QueryCoverJobListResponseBodyCoverJobListCoverJob> getCoverJob() {
            return this.coverJob;
        }

    }

    public static class QueryCoverJobListResponseBodyNonExistIds extends TeaModel {
        @NameInMap("String")
        public java.util.List<String> string;

        public static QueryCoverJobListResponseBodyNonExistIds build(java.util.Map<String, ?> map) throws Exception {
            QueryCoverJobListResponseBodyNonExistIds self = new QueryCoverJobListResponseBodyNonExistIds();
            return TeaModel.build(map, self);
        }

        public QueryCoverJobListResponseBodyNonExistIds setString(java.util.List<String> string) {
            this.string = string;
            return this;
        }
        public java.util.List<String> getString() {
            return this.string;
        }

    }

}
