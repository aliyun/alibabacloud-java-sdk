// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class QueryAnnotationJobListResponseBody extends TeaModel {
    @NameInMap("AnnotationJobList")
    public QueryAnnotationJobListResponseBodyAnnotationJobList annotationJobList;

    @NameInMap("NonExistIds")
    public QueryAnnotationJobListResponseBodyNonExistIds nonExistIds;

    @NameInMap("RequestId")
    public String requestId;

    public static QueryAnnotationJobListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryAnnotationJobListResponseBody self = new QueryAnnotationJobListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryAnnotationJobListResponseBody setAnnotationJobList(QueryAnnotationJobListResponseBodyAnnotationJobList annotationJobList) {
        this.annotationJobList = annotationJobList;
        return this;
    }
    public QueryAnnotationJobListResponseBodyAnnotationJobList getAnnotationJobList() {
        return this.annotationJobList;
    }

    public QueryAnnotationJobListResponseBody setNonExistIds(QueryAnnotationJobListResponseBodyNonExistIds nonExistIds) {
        this.nonExistIds = nonExistIds;
        return this;
    }
    public QueryAnnotationJobListResponseBodyNonExistIds getNonExistIds() {
        return this.nonExistIds;
    }

    public QueryAnnotationJobListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class QueryAnnotationJobListResponseBodyAnnotationJobListAnnotationJobInput extends TeaModel {
        @NameInMap("Bucket")
        public String bucket;

        @NameInMap("Location")
        public String location;

        @NameInMap("Object")
        public String object;

        public static QueryAnnotationJobListResponseBodyAnnotationJobListAnnotationJobInput build(java.util.Map<String, ?> map) throws Exception {
            QueryAnnotationJobListResponseBodyAnnotationJobListAnnotationJobInput self = new QueryAnnotationJobListResponseBodyAnnotationJobListAnnotationJobInput();
            return TeaModel.build(map, self);
        }

        public QueryAnnotationJobListResponseBodyAnnotationJobListAnnotationJobInput setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

        public QueryAnnotationJobListResponseBodyAnnotationJobListAnnotationJobInput setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public QueryAnnotationJobListResponseBodyAnnotationJobListAnnotationJobInput setObject(String object) {
            this.object = object;
            return this;
        }
        public String getObject() {
            return this.object;
        }

    }

    public static class QueryAnnotationJobListResponseBodyAnnotationJobListAnnotationJobVideoAnnotationResultAnnotationsAnnotation extends TeaModel {
        @NameInMap("Label")
        public String label;

        @NameInMap("Score")
        public String score;

        public static QueryAnnotationJobListResponseBodyAnnotationJobListAnnotationJobVideoAnnotationResultAnnotationsAnnotation build(java.util.Map<String, ?> map) throws Exception {
            QueryAnnotationJobListResponseBodyAnnotationJobListAnnotationJobVideoAnnotationResultAnnotationsAnnotation self = new QueryAnnotationJobListResponseBodyAnnotationJobListAnnotationJobVideoAnnotationResultAnnotationsAnnotation();
            return TeaModel.build(map, self);
        }

        public QueryAnnotationJobListResponseBodyAnnotationJobListAnnotationJobVideoAnnotationResultAnnotationsAnnotation setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public QueryAnnotationJobListResponseBodyAnnotationJobListAnnotationJobVideoAnnotationResultAnnotationsAnnotation setScore(String score) {
            this.score = score;
            return this;
        }
        public String getScore() {
            return this.score;
        }

    }

    public static class QueryAnnotationJobListResponseBodyAnnotationJobListAnnotationJobVideoAnnotationResultAnnotations extends TeaModel {
        @NameInMap("Annotation")
        public java.util.List<QueryAnnotationJobListResponseBodyAnnotationJobListAnnotationJobVideoAnnotationResultAnnotationsAnnotation> annotation;

        public static QueryAnnotationJobListResponseBodyAnnotationJobListAnnotationJobVideoAnnotationResultAnnotations build(java.util.Map<String, ?> map) throws Exception {
            QueryAnnotationJobListResponseBodyAnnotationJobListAnnotationJobVideoAnnotationResultAnnotations self = new QueryAnnotationJobListResponseBodyAnnotationJobListAnnotationJobVideoAnnotationResultAnnotations();
            return TeaModel.build(map, self);
        }

        public QueryAnnotationJobListResponseBodyAnnotationJobListAnnotationJobVideoAnnotationResultAnnotations setAnnotation(java.util.List<QueryAnnotationJobListResponseBodyAnnotationJobListAnnotationJobVideoAnnotationResultAnnotationsAnnotation> annotation) {
            this.annotation = annotation;
            return this;
        }
        public java.util.List<QueryAnnotationJobListResponseBodyAnnotationJobListAnnotationJobVideoAnnotationResultAnnotationsAnnotation> getAnnotation() {
            return this.annotation;
        }

    }

    public static class QueryAnnotationJobListResponseBodyAnnotationJobListAnnotationJobVideoAnnotationResult extends TeaModel {
        @NameInMap("Annotations")
        public QueryAnnotationJobListResponseBodyAnnotationJobListAnnotationJobVideoAnnotationResultAnnotations annotations;

        @NameInMap("Details")
        public String details;

        public static QueryAnnotationJobListResponseBodyAnnotationJobListAnnotationJobVideoAnnotationResult build(java.util.Map<String, ?> map) throws Exception {
            QueryAnnotationJobListResponseBodyAnnotationJobListAnnotationJobVideoAnnotationResult self = new QueryAnnotationJobListResponseBodyAnnotationJobListAnnotationJobVideoAnnotationResult();
            return TeaModel.build(map, self);
        }

        public QueryAnnotationJobListResponseBodyAnnotationJobListAnnotationJobVideoAnnotationResult setAnnotations(QueryAnnotationJobListResponseBodyAnnotationJobListAnnotationJobVideoAnnotationResultAnnotations annotations) {
            this.annotations = annotations;
            return this;
        }
        public QueryAnnotationJobListResponseBodyAnnotationJobListAnnotationJobVideoAnnotationResultAnnotations getAnnotations() {
            return this.annotations;
        }

        public QueryAnnotationJobListResponseBodyAnnotationJobListAnnotationJobVideoAnnotationResult setDetails(String details) {
            this.details = details;
            return this;
        }
        public String getDetails() {
            return this.details;
        }

    }

    public static class QueryAnnotationJobListResponseBodyAnnotationJobListAnnotationJob extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("Id")
        public String id;

        @NameInMap("Input")
        public QueryAnnotationJobListResponseBodyAnnotationJobListAnnotationJobInput input;

        @NameInMap("Message")
        public String message;

        @NameInMap("PipelineId")
        public String pipelineId;

        @NameInMap("State")
        public String state;

        @NameInMap("UserData")
        public String userData;

        @NameInMap("VideoAnnotationResult")
        public QueryAnnotationJobListResponseBodyAnnotationJobListAnnotationJobVideoAnnotationResult videoAnnotationResult;

        public static QueryAnnotationJobListResponseBodyAnnotationJobListAnnotationJob build(java.util.Map<String, ?> map) throws Exception {
            QueryAnnotationJobListResponseBodyAnnotationJobListAnnotationJob self = new QueryAnnotationJobListResponseBodyAnnotationJobListAnnotationJob();
            return TeaModel.build(map, self);
        }

        public QueryAnnotationJobListResponseBodyAnnotationJobListAnnotationJob setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryAnnotationJobListResponseBodyAnnotationJobListAnnotationJob setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public QueryAnnotationJobListResponseBodyAnnotationJobListAnnotationJob setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryAnnotationJobListResponseBodyAnnotationJobListAnnotationJob setInput(QueryAnnotationJobListResponseBodyAnnotationJobListAnnotationJobInput input) {
            this.input = input;
            return this;
        }
        public QueryAnnotationJobListResponseBodyAnnotationJobListAnnotationJobInput getInput() {
            return this.input;
        }

        public QueryAnnotationJobListResponseBodyAnnotationJobListAnnotationJob setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public QueryAnnotationJobListResponseBodyAnnotationJobListAnnotationJob setPipelineId(String pipelineId) {
            this.pipelineId = pipelineId;
            return this;
        }
        public String getPipelineId() {
            return this.pipelineId;
        }

        public QueryAnnotationJobListResponseBodyAnnotationJobListAnnotationJob setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public QueryAnnotationJobListResponseBodyAnnotationJobListAnnotationJob setUserData(String userData) {
            this.userData = userData;
            return this;
        }
        public String getUserData() {
            return this.userData;
        }

        public QueryAnnotationJobListResponseBodyAnnotationJobListAnnotationJob setVideoAnnotationResult(QueryAnnotationJobListResponseBodyAnnotationJobListAnnotationJobVideoAnnotationResult videoAnnotationResult) {
            this.videoAnnotationResult = videoAnnotationResult;
            return this;
        }
        public QueryAnnotationJobListResponseBodyAnnotationJobListAnnotationJobVideoAnnotationResult getVideoAnnotationResult() {
            return this.videoAnnotationResult;
        }

    }

    public static class QueryAnnotationJobListResponseBodyAnnotationJobList extends TeaModel {
        @NameInMap("AnnotationJob")
        public java.util.List<QueryAnnotationJobListResponseBodyAnnotationJobListAnnotationJob> annotationJob;

        public static QueryAnnotationJobListResponseBodyAnnotationJobList build(java.util.Map<String, ?> map) throws Exception {
            QueryAnnotationJobListResponseBodyAnnotationJobList self = new QueryAnnotationJobListResponseBodyAnnotationJobList();
            return TeaModel.build(map, self);
        }

        public QueryAnnotationJobListResponseBodyAnnotationJobList setAnnotationJob(java.util.List<QueryAnnotationJobListResponseBodyAnnotationJobListAnnotationJob> annotationJob) {
            this.annotationJob = annotationJob;
            return this;
        }
        public java.util.List<QueryAnnotationJobListResponseBodyAnnotationJobListAnnotationJob> getAnnotationJob() {
            return this.annotationJob;
        }

    }

    public static class QueryAnnotationJobListResponseBodyNonExistIds extends TeaModel {
        @NameInMap("String")
        public java.util.List<String> string;

        public static QueryAnnotationJobListResponseBodyNonExistIds build(java.util.Map<String, ?> map) throws Exception {
            QueryAnnotationJobListResponseBodyNonExistIds self = new QueryAnnotationJobListResponseBodyNonExistIds();
            return TeaModel.build(map, self);
        }

        public QueryAnnotationJobListResponseBodyNonExistIds setString(java.util.List<String> string) {
            this.string = string;
            return this;
        }
        public java.util.List<String> getString() {
            return this.string;
        }

    }

}
