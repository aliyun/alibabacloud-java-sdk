// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class QueryImageSearchJobListResponseBody extends TeaModel {
    @NameInMap("ImageSearchJobList")
    public QueryImageSearchJobListResponseBodyImageSearchJobList imageSearchJobList;

    @NameInMap("NonExistIds")
    public QueryImageSearchJobListResponseBodyNonExistIds nonExistIds;

    @NameInMap("RequestId")
    public String requestId;

    public static QueryImageSearchJobListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryImageSearchJobListResponseBody self = new QueryImageSearchJobListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryImageSearchJobListResponseBody setImageSearchJobList(QueryImageSearchJobListResponseBodyImageSearchJobList imageSearchJobList) {
        this.imageSearchJobList = imageSearchJobList;
        return this;
    }
    public QueryImageSearchJobListResponseBodyImageSearchJobList getImageSearchJobList() {
        return this.imageSearchJobList;
    }

    public QueryImageSearchJobListResponseBody setNonExistIds(QueryImageSearchJobListResponseBodyNonExistIds nonExistIds) {
        this.nonExistIds = nonExistIds;
        return this;
    }
    public QueryImageSearchJobListResponseBodyNonExistIds getNonExistIds() {
        return this.nonExistIds;
    }

    public QueryImageSearchJobListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class QueryImageSearchJobListResponseBodyImageSearchJobListImageSearchJobInputVideo extends TeaModel {
        @NameInMap("Bucket")
        public String bucket;

        @NameInMap("Location")
        public String location;

        @NameInMap("Object")
        public String object;

        public static QueryImageSearchJobListResponseBodyImageSearchJobListImageSearchJobInputVideo build(java.util.Map<String, ?> map) throws Exception {
            QueryImageSearchJobListResponseBodyImageSearchJobListImageSearchJobInputVideo self = new QueryImageSearchJobListResponseBodyImageSearchJobListImageSearchJobInputVideo();
            return TeaModel.build(map, self);
        }

        public QueryImageSearchJobListResponseBodyImageSearchJobListImageSearchJobInputVideo setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

        public QueryImageSearchJobListResponseBodyImageSearchJobListImageSearchJobInputVideo setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public QueryImageSearchJobListResponseBodyImageSearchJobListImageSearchJobInputVideo setObject(String object) {
            this.object = object;
            return this;
        }
        public String getObject() {
            return this.object;
        }

    }

    public static class QueryImageSearchJobListResponseBodyImageSearchJobListImageSearchJobResultImageSearchShotsImageSearchShots extends TeaModel {
        @NameInMap("MatchedFrame")
        public String matchedFrame;

        @NameInMap("MatchedTimestamp")
        public String matchedTimestamp;

        @NameInMap("Similarity")
        public String similarity;

        public static QueryImageSearchJobListResponseBodyImageSearchJobListImageSearchJobResultImageSearchShotsImageSearchShots build(java.util.Map<String, ?> map) throws Exception {
            QueryImageSearchJobListResponseBodyImageSearchJobListImageSearchJobResultImageSearchShotsImageSearchShots self = new QueryImageSearchJobListResponseBodyImageSearchJobListImageSearchJobResultImageSearchShotsImageSearchShots();
            return TeaModel.build(map, self);
        }

        public QueryImageSearchJobListResponseBodyImageSearchJobListImageSearchJobResultImageSearchShotsImageSearchShots setMatchedFrame(String matchedFrame) {
            this.matchedFrame = matchedFrame;
            return this;
        }
        public String getMatchedFrame() {
            return this.matchedFrame;
        }

        public QueryImageSearchJobListResponseBodyImageSearchJobListImageSearchJobResultImageSearchShotsImageSearchShots setMatchedTimestamp(String matchedTimestamp) {
            this.matchedTimestamp = matchedTimestamp;
            return this;
        }
        public String getMatchedTimestamp() {
            return this.matchedTimestamp;
        }

        public QueryImageSearchJobListResponseBodyImageSearchJobListImageSearchJobResultImageSearchShotsImageSearchShots setSimilarity(String similarity) {
            this.similarity = similarity;
            return this;
        }
        public String getSimilarity() {
            return this.similarity;
        }

    }

    public static class QueryImageSearchJobListResponseBodyImageSearchJobListImageSearchJobResultImageSearchShots extends TeaModel {
        @NameInMap("ImageSearchShots")
        public java.util.List<QueryImageSearchJobListResponseBodyImageSearchJobListImageSearchJobResultImageSearchShotsImageSearchShots> imageSearchShots;

        public static QueryImageSearchJobListResponseBodyImageSearchJobListImageSearchJobResultImageSearchShots build(java.util.Map<String, ?> map) throws Exception {
            QueryImageSearchJobListResponseBodyImageSearchJobListImageSearchJobResultImageSearchShots self = new QueryImageSearchJobListResponseBodyImageSearchJobListImageSearchJobResultImageSearchShots();
            return TeaModel.build(map, self);
        }

        public QueryImageSearchJobListResponseBodyImageSearchJobListImageSearchJobResultImageSearchShots setImageSearchShots(java.util.List<QueryImageSearchJobListResponseBodyImageSearchJobListImageSearchJobResultImageSearchShotsImageSearchShots> imageSearchShots) {
            this.imageSearchShots = imageSearchShots;
            return this;
        }
        public java.util.List<QueryImageSearchJobListResponseBodyImageSearchJobListImageSearchJobResultImageSearchShotsImageSearchShots> getImageSearchShots() {
            return this.imageSearchShots;
        }

    }

    public static class QueryImageSearchJobListResponseBodyImageSearchJobListImageSearchJobResult extends TeaModel {
        @NameInMap("ImageSearchShots")
        public QueryImageSearchJobListResponseBodyImageSearchJobListImageSearchJobResultImageSearchShots imageSearchShots;

        public static QueryImageSearchJobListResponseBodyImageSearchJobListImageSearchJobResult build(java.util.Map<String, ?> map) throws Exception {
            QueryImageSearchJobListResponseBodyImageSearchJobListImageSearchJobResult self = new QueryImageSearchJobListResponseBodyImageSearchJobListImageSearchJobResult();
            return TeaModel.build(map, self);
        }

        public QueryImageSearchJobListResponseBodyImageSearchJobListImageSearchJobResult setImageSearchShots(QueryImageSearchJobListResponseBodyImageSearchJobListImageSearchJobResultImageSearchShots imageSearchShots) {
            this.imageSearchShots = imageSearchShots;
            return this;
        }
        public QueryImageSearchJobListResponseBodyImageSearchJobListImageSearchJobResultImageSearchShots getImageSearchShots() {
            return this.imageSearchShots;
        }

    }

    public static class QueryImageSearchJobListResponseBodyImageSearchJobListImageSearchJobInputImage extends TeaModel {
        @NameInMap("Bucket")
        public String bucket;

        @NameInMap("Location")
        public String location;

        @NameInMap("Object")
        public String object;

        public static QueryImageSearchJobListResponseBodyImageSearchJobListImageSearchJobInputImage build(java.util.Map<String, ?> map) throws Exception {
            QueryImageSearchJobListResponseBodyImageSearchJobListImageSearchJobInputImage self = new QueryImageSearchJobListResponseBodyImageSearchJobListImageSearchJobInputImage();
            return TeaModel.build(map, self);
        }

        public QueryImageSearchJobListResponseBodyImageSearchJobListImageSearchJobInputImage setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

        public QueryImageSearchJobListResponseBodyImageSearchJobListImageSearchJobInputImage setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public QueryImageSearchJobListResponseBodyImageSearchJobListImageSearchJobInputImage setObject(String object) {
            this.object = object;
            return this;
        }
        public String getObject() {
            return this.object;
        }

    }

    public static class QueryImageSearchJobListResponseBodyImageSearchJobListImageSearchJob extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("FinishTime")
        public String finishTime;

        @NameInMap("Id")
        public String id;

        @NameInMap("InputVideo")
        public QueryImageSearchJobListResponseBodyImageSearchJobListImageSearchJobInputVideo inputVideo;

        @NameInMap("Message")
        public String message;

        @NameInMap("PipelineId")
        public String pipelineId;

        @NameInMap("Result")
        public QueryImageSearchJobListResponseBodyImageSearchJobListImageSearchJobResult result;

        @NameInMap("State")
        public String state;

        @NameInMap("UserData")
        public String userData;

        @NameInMap("inputImage")
        public QueryImageSearchJobListResponseBodyImageSearchJobListImageSearchJobInputImage inputImage;

        public static QueryImageSearchJobListResponseBodyImageSearchJobListImageSearchJob build(java.util.Map<String, ?> map) throws Exception {
            QueryImageSearchJobListResponseBodyImageSearchJobListImageSearchJob self = new QueryImageSearchJobListResponseBodyImageSearchJobListImageSearchJob();
            return TeaModel.build(map, self);
        }

        public QueryImageSearchJobListResponseBodyImageSearchJobListImageSearchJob setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryImageSearchJobListResponseBodyImageSearchJobListImageSearchJob setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public QueryImageSearchJobListResponseBodyImageSearchJobListImageSearchJob setFinishTime(String finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public String getFinishTime() {
            return this.finishTime;
        }

        public QueryImageSearchJobListResponseBodyImageSearchJobListImageSearchJob setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryImageSearchJobListResponseBodyImageSearchJobListImageSearchJob setInputVideo(QueryImageSearchJobListResponseBodyImageSearchJobListImageSearchJobInputVideo inputVideo) {
            this.inputVideo = inputVideo;
            return this;
        }
        public QueryImageSearchJobListResponseBodyImageSearchJobListImageSearchJobInputVideo getInputVideo() {
            return this.inputVideo;
        }

        public QueryImageSearchJobListResponseBodyImageSearchJobListImageSearchJob setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public QueryImageSearchJobListResponseBodyImageSearchJobListImageSearchJob setPipelineId(String pipelineId) {
            this.pipelineId = pipelineId;
            return this;
        }
        public String getPipelineId() {
            return this.pipelineId;
        }

        public QueryImageSearchJobListResponseBodyImageSearchJobListImageSearchJob setResult(QueryImageSearchJobListResponseBodyImageSearchJobListImageSearchJobResult result) {
            this.result = result;
            return this;
        }
        public QueryImageSearchJobListResponseBodyImageSearchJobListImageSearchJobResult getResult() {
            return this.result;
        }

        public QueryImageSearchJobListResponseBodyImageSearchJobListImageSearchJob setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public QueryImageSearchJobListResponseBodyImageSearchJobListImageSearchJob setUserData(String userData) {
            this.userData = userData;
            return this;
        }
        public String getUserData() {
            return this.userData;
        }

        public QueryImageSearchJobListResponseBodyImageSearchJobListImageSearchJob setInputImage(QueryImageSearchJobListResponseBodyImageSearchJobListImageSearchJobInputImage inputImage) {
            this.inputImage = inputImage;
            return this;
        }
        public QueryImageSearchJobListResponseBodyImageSearchJobListImageSearchJobInputImage getInputImage() {
            return this.inputImage;
        }

    }

    public static class QueryImageSearchJobListResponseBodyImageSearchJobList extends TeaModel {
        @NameInMap("ImageSearchJob")
        public java.util.List<QueryImageSearchJobListResponseBodyImageSearchJobListImageSearchJob> imageSearchJob;

        public static QueryImageSearchJobListResponseBodyImageSearchJobList build(java.util.Map<String, ?> map) throws Exception {
            QueryImageSearchJobListResponseBodyImageSearchJobList self = new QueryImageSearchJobListResponseBodyImageSearchJobList();
            return TeaModel.build(map, self);
        }

        public QueryImageSearchJobListResponseBodyImageSearchJobList setImageSearchJob(java.util.List<QueryImageSearchJobListResponseBodyImageSearchJobListImageSearchJob> imageSearchJob) {
            this.imageSearchJob = imageSearchJob;
            return this;
        }
        public java.util.List<QueryImageSearchJobListResponseBodyImageSearchJobListImageSearchJob> getImageSearchJob() {
            return this.imageSearchJob;
        }

    }

    public static class QueryImageSearchJobListResponseBodyNonExistIds extends TeaModel {
        @NameInMap("String")
        public java.util.List<String> string;

        public static QueryImageSearchJobListResponseBodyNonExistIds build(java.util.Map<String, ?> map) throws Exception {
            QueryImageSearchJobListResponseBodyNonExistIds self = new QueryImageSearchJobListResponseBodyNonExistIds();
            return TeaModel.build(map, self);
        }

        public QueryImageSearchJobListResponseBodyNonExistIds setString(java.util.List<String> string) {
            this.string = string;
            return this;
        }
        public java.util.List<String> getString() {
            return this.string;
        }

    }

}
