// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class QueryTagJobListResponseBody extends TeaModel {
    @NameInMap("TagJobList")
    public QueryTagJobListResponseBodyTagJobList tagJobList;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("NonExistIds")
    public QueryTagJobListResponseBodyNonExistIds nonExistIds;

    public static QueryTagJobListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryTagJobListResponseBody self = new QueryTagJobListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryTagJobListResponseBody setTagJobList(QueryTagJobListResponseBodyTagJobList tagJobList) {
        this.tagJobList = tagJobList;
        return this;
    }
    public QueryTagJobListResponseBodyTagJobList getTagJobList() {
        return this.tagJobList;
    }

    public QueryTagJobListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryTagJobListResponseBody setNonExistIds(QueryTagJobListResponseBodyNonExistIds nonExistIds) {
        this.nonExistIds = nonExistIds;
        return this;
    }
    public QueryTagJobListResponseBodyNonExistIds getNonExistIds() {
        return this.nonExistIds;
    }

    public static class QueryTagJobListResponseBodyTagJobListTagJobVideoTagResultTagAnResultsTagAnResult extends TeaModel {
        @NameInMap("Score")
        public String score;

        @NameInMap("Label")
        public String label;

        public static QueryTagJobListResponseBodyTagJobListTagJobVideoTagResultTagAnResultsTagAnResult build(java.util.Map<String, ?> map) throws Exception {
            QueryTagJobListResponseBodyTagJobListTagJobVideoTagResultTagAnResultsTagAnResult self = new QueryTagJobListResponseBodyTagJobListTagJobVideoTagResultTagAnResultsTagAnResult();
            return TeaModel.build(map, self);
        }

        public QueryTagJobListResponseBodyTagJobListTagJobVideoTagResultTagAnResultsTagAnResult setScore(String score) {
            this.score = score;
            return this;
        }
        public String getScore() {
            return this.score;
        }

        public QueryTagJobListResponseBodyTagJobListTagJobVideoTagResultTagAnResultsTagAnResult setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

    }

    public static class QueryTagJobListResponseBodyTagJobListTagJobVideoTagResultTagAnResults extends TeaModel {
        @NameInMap("TagAnResult")
        public java.util.List<QueryTagJobListResponseBodyTagJobListTagJobVideoTagResultTagAnResultsTagAnResult> tagAnResult;

        public static QueryTagJobListResponseBodyTagJobListTagJobVideoTagResultTagAnResults build(java.util.Map<String, ?> map) throws Exception {
            QueryTagJobListResponseBodyTagJobListTagJobVideoTagResultTagAnResults self = new QueryTagJobListResponseBodyTagJobListTagJobVideoTagResultTagAnResults();
            return TeaModel.build(map, self);
        }

        public QueryTagJobListResponseBodyTagJobListTagJobVideoTagResultTagAnResults setTagAnResult(java.util.List<QueryTagJobListResponseBodyTagJobListTagJobVideoTagResultTagAnResultsTagAnResult> tagAnResult) {
            this.tagAnResult = tagAnResult;
            return this;
        }
        public java.util.List<QueryTagJobListResponseBodyTagJobListTagJobVideoTagResultTagAnResultsTagAnResult> getTagAnResult() {
            return this.tagAnResult;
        }

    }

    public static class QueryTagJobListResponseBodyTagJobListTagJobVideoTagResultTagFrResultsTagFrResultTagFacesTagFace extends TeaModel {
        @NameInMap("Score")
        public String score;

        @NameInMap("Name")
        public String name;

        @NameInMap("Target")
        public String target;

        public static QueryTagJobListResponseBodyTagJobListTagJobVideoTagResultTagFrResultsTagFrResultTagFacesTagFace build(java.util.Map<String, ?> map) throws Exception {
            QueryTagJobListResponseBodyTagJobListTagJobVideoTagResultTagFrResultsTagFrResultTagFacesTagFace self = new QueryTagJobListResponseBodyTagJobListTagJobVideoTagResultTagFrResultsTagFrResultTagFacesTagFace();
            return TeaModel.build(map, self);
        }

        public QueryTagJobListResponseBodyTagJobListTagJobVideoTagResultTagFrResultsTagFrResultTagFacesTagFace setScore(String score) {
            this.score = score;
            return this;
        }
        public String getScore() {
            return this.score;
        }

        public QueryTagJobListResponseBodyTagJobListTagJobVideoTagResultTagFrResultsTagFrResultTagFacesTagFace setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryTagJobListResponseBodyTagJobListTagJobVideoTagResultTagFrResultsTagFrResultTagFacesTagFace setTarget(String target) {
            this.target = target;
            return this;
        }
        public String getTarget() {
            return this.target;
        }

    }

    public static class QueryTagJobListResponseBodyTagJobListTagJobVideoTagResultTagFrResultsTagFrResultTagFaces extends TeaModel {
        @NameInMap("TagFace")
        public java.util.List<QueryTagJobListResponseBodyTagJobListTagJobVideoTagResultTagFrResultsTagFrResultTagFacesTagFace> tagFace;

        public static QueryTagJobListResponseBodyTagJobListTagJobVideoTagResultTagFrResultsTagFrResultTagFaces build(java.util.Map<String, ?> map) throws Exception {
            QueryTagJobListResponseBodyTagJobListTagJobVideoTagResultTagFrResultsTagFrResultTagFaces self = new QueryTagJobListResponseBodyTagJobListTagJobVideoTagResultTagFrResultsTagFrResultTagFaces();
            return TeaModel.build(map, self);
        }

        public QueryTagJobListResponseBodyTagJobListTagJobVideoTagResultTagFrResultsTagFrResultTagFaces setTagFace(java.util.List<QueryTagJobListResponseBodyTagJobListTagJobVideoTagResultTagFrResultsTagFrResultTagFacesTagFace> tagFace) {
            this.tagFace = tagFace;
            return this;
        }
        public java.util.List<QueryTagJobListResponseBodyTagJobListTagJobVideoTagResultTagFrResultsTagFrResultTagFacesTagFace> getTagFace() {
            return this.tagFace;
        }

    }

    public static class QueryTagJobListResponseBodyTagJobListTagJobVideoTagResultTagFrResultsTagFrResult extends TeaModel {
        @NameInMap("TagFaces")
        public QueryTagJobListResponseBodyTagJobListTagJobVideoTagResultTagFrResultsTagFrResultTagFaces tagFaces;

        @NameInMap("Time")
        public String time;

        public static QueryTagJobListResponseBodyTagJobListTagJobVideoTagResultTagFrResultsTagFrResult build(java.util.Map<String, ?> map) throws Exception {
            QueryTagJobListResponseBodyTagJobListTagJobVideoTagResultTagFrResultsTagFrResult self = new QueryTagJobListResponseBodyTagJobListTagJobVideoTagResultTagFrResultsTagFrResult();
            return TeaModel.build(map, self);
        }

        public QueryTagJobListResponseBodyTagJobListTagJobVideoTagResultTagFrResultsTagFrResult setTagFaces(QueryTagJobListResponseBodyTagJobListTagJobVideoTagResultTagFrResultsTagFrResultTagFaces tagFaces) {
            this.tagFaces = tagFaces;
            return this;
        }
        public QueryTagJobListResponseBodyTagJobListTagJobVideoTagResultTagFrResultsTagFrResultTagFaces getTagFaces() {
            return this.tagFaces;
        }

        public QueryTagJobListResponseBodyTagJobListTagJobVideoTagResultTagFrResultsTagFrResult setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
        }

    }

    public static class QueryTagJobListResponseBodyTagJobListTagJobVideoTagResultTagFrResults extends TeaModel {
        @NameInMap("TagFrResult")
        public java.util.List<QueryTagJobListResponseBodyTagJobListTagJobVideoTagResultTagFrResultsTagFrResult> tagFrResult;

        public static QueryTagJobListResponseBodyTagJobListTagJobVideoTagResultTagFrResults build(java.util.Map<String, ?> map) throws Exception {
            QueryTagJobListResponseBodyTagJobListTagJobVideoTagResultTagFrResults self = new QueryTagJobListResponseBodyTagJobListTagJobVideoTagResultTagFrResults();
            return TeaModel.build(map, self);
        }

        public QueryTagJobListResponseBodyTagJobListTagJobVideoTagResultTagFrResults setTagFrResult(java.util.List<QueryTagJobListResponseBodyTagJobListTagJobVideoTagResultTagFrResultsTagFrResult> tagFrResult) {
            this.tagFrResult = tagFrResult;
            return this;
        }
        public java.util.List<QueryTagJobListResponseBodyTagJobListTagJobVideoTagResultTagFrResultsTagFrResult> getTagFrResult() {
            return this.tagFrResult;
        }

    }

    public static class QueryTagJobListResponseBodyTagJobListTagJobVideoTagResult extends TeaModel {
        @NameInMap("TagAnResults")
        public QueryTagJobListResponseBodyTagJobListTagJobVideoTagResultTagAnResults tagAnResults;

        @NameInMap("TagFrResults")
        public QueryTagJobListResponseBodyTagJobListTagJobVideoTagResultTagFrResults tagFrResults;

        @NameInMap("Details")
        public String details;

        public static QueryTagJobListResponseBodyTagJobListTagJobVideoTagResult build(java.util.Map<String, ?> map) throws Exception {
            QueryTagJobListResponseBodyTagJobListTagJobVideoTagResult self = new QueryTagJobListResponseBodyTagJobListTagJobVideoTagResult();
            return TeaModel.build(map, self);
        }

        public QueryTagJobListResponseBodyTagJobListTagJobVideoTagResult setTagAnResults(QueryTagJobListResponseBodyTagJobListTagJobVideoTagResultTagAnResults tagAnResults) {
            this.tagAnResults = tagAnResults;
            return this;
        }
        public QueryTagJobListResponseBodyTagJobListTagJobVideoTagResultTagAnResults getTagAnResults() {
            return this.tagAnResults;
        }

        public QueryTagJobListResponseBodyTagJobListTagJobVideoTagResult setTagFrResults(QueryTagJobListResponseBodyTagJobListTagJobVideoTagResultTagFrResults tagFrResults) {
            this.tagFrResults = tagFrResults;
            return this;
        }
        public QueryTagJobListResponseBodyTagJobListTagJobVideoTagResultTagFrResults getTagFrResults() {
            return this.tagFrResults;
        }

        public QueryTagJobListResponseBodyTagJobListTagJobVideoTagResult setDetails(String details) {
            this.details = details;
            return this;
        }
        public String getDetails() {
            return this.details;
        }

    }

    public static class QueryTagJobListResponseBodyTagJobListTagJobInput extends TeaModel {
        @NameInMap("Object")
        public String object;

        @NameInMap("Location")
        public String location;

        @NameInMap("Bucket")
        public String bucket;

        public static QueryTagJobListResponseBodyTagJobListTagJobInput build(java.util.Map<String, ?> map) throws Exception {
            QueryTagJobListResponseBodyTagJobListTagJobInput self = new QueryTagJobListResponseBodyTagJobListTagJobInput();
            return TeaModel.build(map, self);
        }

        public QueryTagJobListResponseBodyTagJobListTagJobInput setObject(String object) {
            this.object = object;
            return this;
        }
        public String getObject() {
            return this.object;
        }

        public QueryTagJobListResponseBodyTagJobListTagJobInput setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public QueryTagJobListResponseBodyTagJobListTagJobInput setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

    }

    public static class QueryTagJobListResponseBodyTagJobListTagJob extends TeaModel {
        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("VideoTagResult")
        public QueryTagJobListResponseBodyTagJobListTagJobVideoTagResult videoTagResult;

        @NameInMap("State")
        public String state;

        @NameInMap("UserData")
        public String userData;

        @NameInMap("Code")
        public String code;

        @NameInMap("Message")
        public String message;

        @NameInMap("PipelineId")
        public String pipelineId;

        @NameInMap("Input")
        public QueryTagJobListResponseBodyTagJobListTagJobInput input;

        @NameInMap("Id")
        public String id;

        public static QueryTagJobListResponseBodyTagJobListTagJob build(java.util.Map<String, ?> map) throws Exception {
            QueryTagJobListResponseBodyTagJobListTagJob self = new QueryTagJobListResponseBodyTagJobListTagJob();
            return TeaModel.build(map, self);
        }

        public QueryTagJobListResponseBodyTagJobListTagJob setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public QueryTagJobListResponseBodyTagJobListTagJob setVideoTagResult(QueryTagJobListResponseBodyTagJobListTagJobVideoTagResult videoTagResult) {
            this.videoTagResult = videoTagResult;
            return this;
        }
        public QueryTagJobListResponseBodyTagJobListTagJobVideoTagResult getVideoTagResult() {
            return this.videoTagResult;
        }

        public QueryTagJobListResponseBodyTagJobListTagJob setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public QueryTagJobListResponseBodyTagJobListTagJob setUserData(String userData) {
            this.userData = userData;
            return this;
        }
        public String getUserData() {
            return this.userData;
        }

        public QueryTagJobListResponseBodyTagJobListTagJob setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryTagJobListResponseBodyTagJobListTagJob setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public QueryTagJobListResponseBodyTagJobListTagJob setPipelineId(String pipelineId) {
            this.pipelineId = pipelineId;
            return this;
        }
        public String getPipelineId() {
            return this.pipelineId;
        }

        public QueryTagJobListResponseBodyTagJobListTagJob setInput(QueryTagJobListResponseBodyTagJobListTagJobInput input) {
            this.input = input;
            return this;
        }
        public QueryTagJobListResponseBodyTagJobListTagJobInput getInput() {
            return this.input;
        }

        public QueryTagJobListResponseBodyTagJobListTagJob setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

    public static class QueryTagJobListResponseBodyTagJobList extends TeaModel {
        @NameInMap("TagJob")
        public java.util.List<QueryTagJobListResponseBodyTagJobListTagJob> tagJob;

        public static QueryTagJobListResponseBodyTagJobList build(java.util.Map<String, ?> map) throws Exception {
            QueryTagJobListResponseBodyTagJobList self = new QueryTagJobListResponseBodyTagJobList();
            return TeaModel.build(map, self);
        }

        public QueryTagJobListResponseBodyTagJobList setTagJob(java.util.List<QueryTagJobListResponseBodyTagJobListTagJob> tagJob) {
            this.tagJob = tagJob;
            return this;
        }
        public java.util.List<QueryTagJobListResponseBodyTagJobListTagJob> getTagJob() {
            return this.tagJob;
        }

    }

    public static class QueryTagJobListResponseBodyNonExistIds extends TeaModel {
        @NameInMap("String")
        public java.util.List<String> string;

        public static QueryTagJobListResponseBodyNonExistIds build(java.util.Map<String, ?> map) throws Exception {
            QueryTagJobListResponseBodyNonExistIds self = new QueryTagJobListResponseBodyNonExistIds();
            return TeaModel.build(map, self);
        }

        public QueryTagJobListResponseBodyNonExistIds setString(java.util.List<String> string) {
            this.string = string;
            return this;
        }
        public java.util.List<String> getString() {
            return this.string;
        }

    }

}
