// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class QueryFacerecogJobListResponseBody extends TeaModel {
    @NameInMap("FacerecogJobList")
    public QueryFacerecogJobListResponseBodyFacerecogJobList facerecogJobList;

    @NameInMap("NonExistIds")
    public QueryFacerecogJobListResponseBodyNonExistIds nonExistIds;

    @NameInMap("RequestId")
    public String requestId;

    public static QueryFacerecogJobListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryFacerecogJobListResponseBody self = new QueryFacerecogJobListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryFacerecogJobListResponseBody setFacerecogJobList(QueryFacerecogJobListResponseBodyFacerecogJobList facerecogJobList) {
        this.facerecogJobList = facerecogJobList;
        return this;
    }
    public QueryFacerecogJobListResponseBodyFacerecogJobList getFacerecogJobList() {
        return this.facerecogJobList;
    }

    public QueryFacerecogJobListResponseBody setNonExistIds(QueryFacerecogJobListResponseBodyNonExistIds nonExistIds) {
        this.nonExistIds = nonExistIds;
        return this;
    }
    public QueryFacerecogJobListResponseBodyNonExistIds getNonExistIds() {
        return this.nonExistIds;
    }

    public QueryFacerecogJobListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class QueryFacerecogJobListResponseBodyFacerecogJobListFacerecogJobInput extends TeaModel {
        @NameInMap("Bucket")
        public String bucket;

        @NameInMap("Location")
        public String location;

        @NameInMap("Object")
        public String object;

        public static QueryFacerecogJobListResponseBodyFacerecogJobListFacerecogJobInput build(java.util.Map<String, ?> map) throws Exception {
            QueryFacerecogJobListResponseBodyFacerecogJobListFacerecogJobInput self = new QueryFacerecogJobListResponseBodyFacerecogJobListFacerecogJobInput();
            return TeaModel.build(map, self);
        }

        public QueryFacerecogJobListResponseBodyFacerecogJobListFacerecogJobInput setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

        public QueryFacerecogJobListResponseBodyFacerecogJobListFacerecogJobInput setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public QueryFacerecogJobListResponseBodyFacerecogJobListFacerecogJobInput setObject(String object) {
            this.object = object;
            return this;
        }
        public String getObject() {
            return this.object;
        }

    }

    public static class QueryFacerecogJobListResponseBodyFacerecogJobListFacerecogJobVideoFacerecogResultFacerecogsFacerecogFacesFace extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Score")
        public String score;

        @NameInMap("Target")
        public String target;

        public static QueryFacerecogJobListResponseBodyFacerecogJobListFacerecogJobVideoFacerecogResultFacerecogsFacerecogFacesFace build(java.util.Map<String, ?> map) throws Exception {
            QueryFacerecogJobListResponseBodyFacerecogJobListFacerecogJobVideoFacerecogResultFacerecogsFacerecogFacesFace self = new QueryFacerecogJobListResponseBodyFacerecogJobListFacerecogJobVideoFacerecogResultFacerecogsFacerecogFacesFace();
            return TeaModel.build(map, self);
        }

        public QueryFacerecogJobListResponseBodyFacerecogJobListFacerecogJobVideoFacerecogResultFacerecogsFacerecogFacesFace setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryFacerecogJobListResponseBodyFacerecogJobListFacerecogJobVideoFacerecogResultFacerecogsFacerecogFacesFace setScore(String score) {
            this.score = score;
            return this;
        }
        public String getScore() {
            return this.score;
        }

        public QueryFacerecogJobListResponseBodyFacerecogJobListFacerecogJobVideoFacerecogResultFacerecogsFacerecogFacesFace setTarget(String target) {
            this.target = target;
            return this;
        }
        public String getTarget() {
            return this.target;
        }

    }

    public static class QueryFacerecogJobListResponseBodyFacerecogJobListFacerecogJobVideoFacerecogResultFacerecogsFacerecogFaces extends TeaModel {
        @NameInMap("Face")
        public java.util.List<QueryFacerecogJobListResponseBodyFacerecogJobListFacerecogJobVideoFacerecogResultFacerecogsFacerecogFacesFace> face;

        public static QueryFacerecogJobListResponseBodyFacerecogJobListFacerecogJobVideoFacerecogResultFacerecogsFacerecogFaces build(java.util.Map<String, ?> map) throws Exception {
            QueryFacerecogJobListResponseBodyFacerecogJobListFacerecogJobVideoFacerecogResultFacerecogsFacerecogFaces self = new QueryFacerecogJobListResponseBodyFacerecogJobListFacerecogJobVideoFacerecogResultFacerecogsFacerecogFaces();
            return TeaModel.build(map, self);
        }

        public QueryFacerecogJobListResponseBodyFacerecogJobListFacerecogJobVideoFacerecogResultFacerecogsFacerecogFaces setFace(java.util.List<QueryFacerecogJobListResponseBodyFacerecogJobListFacerecogJobVideoFacerecogResultFacerecogsFacerecogFacesFace> face) {
            this.face = face;
            return this;
        }
        public java.util.List<QueryFacerecogJobListResponseBodyFacerecogJobListFacerecogJobVideoFacerecogResultFacerecogsFacerecogFacesFace> getFace() {
            return this.face;
        }

    }

    public static class QueryFacerecogJobListResponseBodyFacerecogJobListFacerecogJobVideoFacerecogResultFacerecogsFacerecog extends TeaModel {
        @NameInMap("Faces")
        public QueryFacerecogJobListResponseBodyFacerecogJobListFacerecogJobVideoFacerecogResultFacerecogsFacerecogFaces faces;

        @NameInMap("Time")
        public String time;

        public static QueryFacerecogJobListResponseBodyFacerecogJobListFacerecogJobVideoFacerecogResultFacerecogsFacerecog build(java.util.Map<String, ?> map) throws Exception {
            QueryFacerecogJobListResponseBodyFacerecogJobListFacerecogJobVideoFacerecogResultFacerecogsFacerecog self = new QueryFacerecogJobListResponseBodyFacerecogJobListFacerecogJobVideoFacerecogResultFacerecogsFacerecog();
            return TeaModel.build(map, self);
        }

        public QueryFacerecogJobListResponseBodyFacerecogJobListFacerecogJobVideoFacerecogResultFacerecogsFacerecog setFaces(QueryFacerecogJobListResponseBodyFacerecogJobListFacerecogJobVideoFacerecogResultFacerecogsFacerecogFaces faces) {
            this.faces = faces;
            return this;
        }
        public QueryFacerecogJobListResponseBodyFacerecogJobListFacerecogJobVideoFacerecogResultFacerecogsFacerecogFaces getFaces() {
            return this.faces;
        }

        public QueryFacerecogJobListResponseBodyFacerecogJobListFacerecogJobVideoFacerecogResultFacerecogsFacerecog setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
        }

    }

    public static class QueryFacerecogJobListResponseBodyFacerecogJobListFacerecogJobVideoFacerecogResultFacerecogs extends TeaModel {
        @NameInMap("Facerecog")
        public java.util.List<QueryFacerecogJobListResponseBodyFacerecogJobListFacerecogJobVideoFacerecogResultFacerecogsFacerecog> facerecog;

        public static QueryFacerecogJobListResponseBodyFacerecogJobListFacerecogJobVideoFacerecogResultFacerecogs build(java.util.Map<String, ?> map) throws Exception {
            QueryFacerecogJobListResponseBodyFacerecogJobListFacerecogJobVideoFacerecogResultFacerecogs self = new QueryFacerecogJobListResponseBodyFacerecogJobListFacerecogJobVideoFacerecogResultFacerecogs();
            return TeaModel.build(map, self);
        }

        public QueryFacerecogJobListResponseBodyFacerecogJobListFacerecogJobVideoFacerecogResultFacerecogs setFacerecog(java.util.List<QueryFacerecogJobListResponseBodyFacerecogJobListFacerecogJobVideoFacerecogResultFacerecogsFacerecog> facerecog) {
            this.facerecog = facerecog;
            return this;
        }
        public java.util.List<QueryFacerecogJobListResponseBodyFacerecogJobListFacerecogJobVideoFacerecogResultFacerecogsFacerecog> getFacerecog() {
            return this.facerecog;
        }

    }

    public static class QueryFacerecogJobListResponseBodyFacerecogJobListFacerecogJobVideoFacerecogResult extends TeaModel {
        @NameInMap("Facerecogs")
        public QueryFacerecogJobListResponseBodyFacerecogJobListFacerecogJobVideoFacerecogResultFacerecogs facerecogs;

        public static QueryFacerecogJobListResponseBodyFacerecogJobListFacerecogJobVideoFacerecogResult build(java.util.Map<String, ?> map) throws Exception {
            QueryFacerecogJobListResponseBodyFacerecogJobListFacerecogJobVideoFacerecogResult self = new QueryFacerecogJobListResponseBodyFacerecogJobListFacerecogJobVideoFacerecogResult();
            return TeaModel.build(map, self);
        }

        public QueryFacerecogJobListResponseBodyFacerecogJobListFacerecogJobVideoFacerecogResult setFacerecogs(QueryFacerecogJobListResponseBodyFacerecogJobListFacerecogJobVideoFacerecogResultFacerecogs facerecogs) {
            this.facerecogs = facerecogs;
            return this;
        }
        public QueryFacerecogJobListResponseBodyFacerecogJobListFacerecogJobVideoFacerecogResultFacerecogs getFacerecogs() {
            return this.facerecogs;
        }

    }

    public static class QueryFacerecogJobListResponseBodyFacerecogJobListFacerecogJob extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("Id")
        public String id;

        @NameInMap("Input")
        public QueryFacerecogJobListResponseBodyFacerecogJobListFacerecogJobInput input;

        @NameInMap("Message")
        public String message;

        @NameInMap("PipelineId")
        public String pipelineId;

        @NameInMap("State")
        public String state;

        @NameInMap("UserData")
        public String userData;

        @NameInMap("VideoFacerecogResult")
        public QueryFacerecogJobListResponseBodyFacerecogJobListFacerecogJobVideoFacerecogResult videoFacerecogResult;

        public static QueryFacerecogJobListResponseBodyFacerecogJobListFacerecogJob build(java.util.Map<String, ?> map) throws Exception {
            QueryFacerecogJobListResponseBodyFacerecogJobListFacerecogJob self = new QueryFacerecogJobListResponseBodyFacerecogJobListFacerecogJob();
            return TeaModel.build(map, self);
        }

        public QueryFacerecogJobListResponseBodyFacerecogJobListFacerecogJob setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryFacerecogJobListResponseBodyFacerecogJobListFacerecogJob setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public QueryFacerecogJobListResponseBodyFacerecogJobListFacerecogJob setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryFacerecogJobListResponseBodyFacerecogJobListFacerecogJob setInput(QueryFacerecogJobListResponseBodyFacerecogJobListFacerecogJobInput input) {
            this.input = input;
            return this;
        }
        public QueryFacerecogJobListResponseBodyFacerecogJobListFacerecogJobInput getInput() {
            return this.input;
        }

        public QueryFacerecogJobListResponseBodyFacerecogJobListFacerecogJob setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public QueryFacerecogJobListResponseBodyFacerecogJobListFacerecogJob setPipelineId(String pipelineId) {
            this.pipelineId = pipelineId;
            return this;
        }
        public String getPipelineId() {
            return this.pipelineId;
        }

        public QueryFacerecogJobListResponseBodyFacerecogJobListFacerecogJob setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public QueryFacerecogJobListResponseBodyFacerecogJobListFacerecogJob setUserData(String userData) {
            this.userData = userData;
            return this;
        }
        public String getUserData() {
            return this.userData;
        }

        public QueryFacerecogJobListResponseBodyFacerecogJobListFacerecogJob setVideoFacerecogResult(QueryFacerecogJobListResponseBodyFacerecogJobListFacerecogJobVideoFacerecogResult videoFacerecogResult) {
            this.videoFacerecogResult = videoFacerecogResult;
            return this;
        }
        public QueryFacerecogJobListResponseBodyFacerecogJobListFacerecogJobVideoFacerecogResult getVideoFacerecogResult() {
            return this.videoFacerecogResult;
        }

    }

    public static class QueryFacerecogJobListResponseBodyFacerecogJobList extends TeaModel {
        @NameInMap("FacerecogJob")
        public java.util.List<QueryFacerecogJobListResponseBodyFacerecogJobListFacerecogJob> facerecogJob;

        public static QueryFacerecogJobListResponseBodyFacerecogJobList build(java.util.Map<String, ?> map) throws Exception {
            QueryFacerecogJobListResponseBodyFacerecogJobList self = new QueryFacerecogJobListResponseBodyFacerecogJobList();
            return TeaModel.build(map, self);
        }

        public QueryFacerecogJobListResponseBodyFacerecogJobList setFacerecogJob(java.util.List<QueryFacerecogJobListResponseBodyFacerecogJobListFacerecogJob> facerecogJob) {
            this.facerecogJob = facerecogJob;
            return this;
        }
        public java.util.List<QueryFacerecogJobListResponseBodyFacerecogJobListFacerecogJob> getFacerecogJob() {
            return this.facerecogJob;
        }

    }

    public static class QueryFacerecogJobListResponseBodyNonExistIds extends TeaModel {
        @NameInMap("String")
        public java.util.List<String> string;

        public static QueryFacerecogJobListResponseBodyNonExistIds build(java.util.Map<String, ?> map) throws Exception {
            QueryFacerecogJobListResponseBodyNonExistIds self = new QueryFacerecogJobListResponseBodyNonExistIds();
            return TeaModel.build(map, self);
        }

        public QueryFacerecogJobListResponseBodyNonExistIds setString(java.util.List<String> string) {
            this.string = string;
            return this;
        }
        public java.util.List<String> getString() {
            return this.string;
        }

    }

}
