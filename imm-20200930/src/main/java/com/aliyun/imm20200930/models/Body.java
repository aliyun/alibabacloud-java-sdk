// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class Body extends TeaModel {
    @NameInMap("Boundary")
    public Boundary boundary;

    @NameInMap("Confidence")
    public Float confidence;

    public static Body build(java.util.Map<String, ?> map) throws Exception {
        Body self = new Body();
        return TeaModel.build(map, self);
    }

    public Body setBoundary(Boundary boundary) {
        this.boundary = boundary;
        return this;
    }
    public Boundary getBoundary() {
        return this.boundary;
    }

    public Body setConfidence(Float confidence) {
        this.confidence = confidence;
        return this;
    }
    public Float getConfidence() {
        return this.confidence;
    }

    public static class AddStoryFilesResponseBodyFiles extends TeaModel {
        @NameInMap("ErrorCode")
        public String errorCode;

        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("URI")
        public String URI;

        public static AddStoryFilesResponseBodyFiles build(java.util.Map<String, ?> map) throws Exception {
            AddStoryFilesResponseBodyFiles self = new AddStoryFilesResponseBodyFiles();
            return TeaModel.build(map, self);
        }

        public AddStoryFilesResponseBodyFiles setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public AddStoryFilesResponseBodyFiles setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public AddStoryFilesResponseBodyFiles setURI(String URI) {
            this.URI = URI;
            return this;
        }
        public String getURI() {
            return this.URI;
        }

    }

    public static class BatchUpdateFileMetaResponseBodyFiles extends TeaModel {
        @NameInMap("Message")
        public String message;

        @NameInMap("Success")
        public Boolean success;

        @NameInMap("URI")
        public String URI;

        public static BatchUpdateFileMetaResponseBodyFiles build(java.util.Map<String, ?> map) throws Exception {
            BatchUpdateFileMetaResponseBodyFiles self = new BatchUpdateFileMetaResponseBodyFiles();
            return TeaModel.build(map, self);
        }

        public BatchUpdateFileMetaResponseBodyFiles setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public BatchUpdateFileMetaResponseBodyFiles setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public BatchUpdateFileMetaResponseBodyFiles setURI(String URI) {
            this.URI = URI;
            return this;
        }
        public String getURI() {
            return this.URI;
        }

    }

    public static class DetectImageScoreResponseBodyImageScore extends TeaModel {
        @NameInMap("OverallQualityScore")
        public Float overallQualityScore;

        public static DetectImageScoreResponseBodyImageScore build(java.util.Map<String, ?> map) throws Exception {
            DetectImageScoreResponseBodyImageScore self = new DetectImageScoreResponseBodyImageScore();
            return TeaModel.build(map, self);
        }

        public DetectImageScoreResponseBodyImageScore setOverallQualityScore(Float overallQualityScore) {
            this.overallQualityScore = overallQualityScore;
            return this;
        }
        public Float getOverallQualityScore() {
            return this.overallQualityScore;
        }

    }

    public static class SearchImageFigureClusterResponseBodyClusters extends TeaModel {
        @NameInMap("Boundary")
        public Boundary boundary;

        @NameInMap("ClusterId")
        public String clusterId;

        @NameInMap("Similarity")
        public Float similarity;

        public static SearchImageFigureClusterResponseBodyClusters build(java.util.Map<String, ?> map) throws Exception {
            SearchImageFigureClusterResponseBodyClusters self = new SearchImageFigureClusterResponseBodyClusters();
            return TeaModel.build(map, self);
        }

        public SearchImageFigureClusterResponseBodyClusters setBoundary(Boundary boundary) {
            this.boundary = boundary;
            return this;
        }
        public Boundary getBoundary() {
            return this.boundary;
        }

        public SearchImageFigureClusterResponseBodyClusters setClusterId(String clusterId) {
            this.clusterId = clusterId;
            return this;
        }
        public String getClusterId() {
            return this.clusterId;
        }

        public SearchImageFigureClusterResponseBodyClusters setSimilarity(Float similarity) {
            this.similarity = similarity;
            return this;
        }
        public Float getSimilarity() {
            return this.similarity;
        }

    }

    public static class SimpleQueryResponseBodyAggregationsGroups extends TeaModel {
        @NameInMap("Count")
        public Long count;

        @NameInMap("Value")
        public String value;

        public static SimpleQueryResponseBodyAggregationsGroups build(java.util.Map<String, ?> map) throws Exception {
            SimpleQueryResponseBodyAggregationsGroups self = new SimpleQueryResponseBodyAggregationsGroups();
            return TeaModel.build(map, self);
        }

        public SimpleQueryResponseBodyAggregationsGroups setCount(Long count) {
            this.count = count;
            return this;
        }
        public Long getCount() {
            return this.count;
        }

        public SimpleQueryResponseBodyAggregationsGroups setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class SimpleQueryResponseBodyAggregations extends TeaModel {
        @NameInMap("Field")
        public String field;

        @NameInMap("Groups")
        public java.util.List<SimpleQueryResponseBodyAggregationsGroups> groups;

        @NameInMap("Operation")
        public String operation;

        @NameInMap("Value")
        public Double value;

        public static SimpleQueryResponseBodyAggregations build(java.util.Map<String, ?> map) throws Exception {
            SimpleQueryResponseBodyAggregations self = new SimpleQueryResponseBodyAggregations();
            return TeaModel.build(map, self);
        }

        public SimpleQueryResponseBodyAggregations setField(String field) {
            this.field = field;
            return this;
        }
        public String getField() {
            return this.field;
        }

        public SimpleQueryResponseBodyAggregations setGroups(java.util.List<SimpleQueryResponseBodyAggregationsGroups> groups) {
            this.groups = groups;
            return this;
        }
        public java.util.List<SimpleQueryResponseBodyAggregationsGroups> getGroups() {
            return this.groups;
        }

        public SimpleQueryResponseBodyAggregations setOperation(String operation) {
            this.operation = operation;
            return this;
        }
        public String getOperation() {
            return this.operation;
        }

        public SimpleQueryResponseBodyAggregations setValue(Double value) {
            this.value = value;
            return this;
        }
        public Double getValue() {
            return this.value;
        }

    }

}
