// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class QueryMediaCensorJobDetailResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("MediaCensorJobDetail")
    public QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetail mediaCensorJobDetail;

    public static QueryMediaCensorJobDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryMediaCensorJobDetailResponseBody self = new QueryMediaCensorJobDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryMediaCensorJobDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryMediaCensorJobDetailResponseBody setMediaCensorJobDetail(QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetail mediaCensorJobDetail) {
        this.mediaCensorJobDetail = mediaCensorJobDetail;
        return this;
    }
    public QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetail getMediaCensorJobDetail() {
        return this.mediaCensorJobDetail;
    }

    public static class QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailCoverImageCensorResultsCoverImageCensorResultResultsResult extends TeaModel {
        @NameInMap("Suggestion")
        public String suggestion;

        @NameInMap("Label")
        public String label;

        @NameInMap("Scene")
        public String scene;

        @NameInMap("Rate")
        public String rate;

        public static QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailCoverImageCensorResultsCoverImageCensorResultResultsResult build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailCoverImageCensorResultsCoverImageCensorResultResultsResult self = new QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailCoverImageCensorResultsCoverImageCensorResultResultsResult();
            return TeaModel.build(map, self);
        }

        public QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailCoverImageCensorResultsCoverImageCensorResultResultsResult setSuggestion(String suggestion) {
            this.suggestion = suggestion;
            return this;
        }
        public String getSuggestion() {
            return this.suggestion;
        }

        public QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailCoverImageCensorResultsCoverImageCensorResultResultsResult setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailCoverImageCensorResultsCoverImageCensorResultResultsResult setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailCoverImageCensorResultsCoverImageCensorResultResultsResult setRate(String rate) {
            this.rate = rate;
            return this;
        }
        public String getRate() {
            return this.rate;
        }

    }

    public static class QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailCoverImageCensorResultsCoverImageCensorResultResults extends TeaModel {
        @NameInMap("Result")
        public java.util.List<QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailCoverImageCensorResultsCoverImageCensorResultResultsResult> result;

        public static QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailCoverImageCensorResultsCoverImageCensorResultResults build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailCoverImageCensorResultsCoverImageCensorResultResults self = new QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailCoverImageCensorResultsCoverImageCensorResultResults();
            return TeaModel.build(map, self);
        }

        public QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailCoverImageCensorResultsCoverImageCensorResultResults setResult(java.util.List<QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailCoverImageCensorResultsCoverImageCensorResultResultsResult> result) {
            this.result = result;
            return this;
        }
        public java.util.List<QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailCoverImageCensorResultsCoverImageCensorResultResultsResult> getResult() {
            return this.result;
        }

    }

    public static class QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailCoverImageCensorResultsCoverImageCensorResult extends TeaModel {
        @NameInMap("Object")
        public String object;

        @NameInMap("Location")
        public String location;

        @NameInMap("Bucket")
        public String bucket;

        @NameInMap("Results")
        public QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailCoverImageCensorResultsCoverImageCensorResultResults results;

        public static QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailCoverImageCensorResultsCoverImageCensorResult build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailCoverImageCensorResultsCoverImageCensorResult self = new QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailCoverImageCensorResultsCoverImageCensorResult();
            return TeaModel.build(map, self);
        }

        public QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailCoverImageCensorResultsCoverImageCensorResult setObject(String object) {
            this.object = object;
            return this;
        }
        public String getObject() {
            return this.object;
        }

        public QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailCoverImageCensorResultsCoverImageCensorResult setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailCoverImageCensorResultsCoverImageCensorResult setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

        public QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailCoverImageCensorResultsCoverImageCensorResult setResults(QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailCoverImageCensorResultsCoverImageCensorResultResults results) {
            this.results = results;
            return this;
        }
        public QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailCoverImageCensorResultsCoverImageCensorResultResults getResults() {
            return this.results;
        }

    }

    public static class QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailCoverImageCensorResults extends TeaModel {
        @NameInMap("CoverImageCensorResult")
        public java.util.List<QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailCoverImageCensorResultsCoverImageCensorResult> coverImageCensorResult;

        public static QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailCoverImageCensorResults build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailCoverImageCensorResults self = new QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailCoverImageCensorResults();
            return TeaModel.build(map, self);
        }

        public QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailCoverImageCensorResults setCoverImageCensorResult(java.util.List<QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailCoverImageCensorResultsCoverImageCensorResult> coverImageCensorResult) {
            this.coverImageCensorResult = coverImageCensorResult;
            return this;
        }
        public java.util.List<QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailCoverImageCensorResultsCoverImageCensorResult> getCoverImageCensorResult() {
            return this.coverImageCensorResult;
        }

    }

    public static class QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailTitleCensorResult extends TeaModel {
        @NameInMap("Suggestion")
        public String suggestion;

        @NameInMap("Label")
        public String label;

        @NameInMap("Scene")
        public String scene;

        @NameInMap("Rate")
        public String rate;

        public static QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailTitleCensorResult build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailTitleCensorResult self = new QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailTitleCensorResult();
            return TeaModel.build(map, self);
        }

        public QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailTitleCensorResult setSuggestion(String suggestion) {
            this.suggestion = suggestion;
            return this;
        }
        public String getSuggestion() {
            return this.suggestion;
        }

        public QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailTitleCensorResult setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailTitleCensorResult setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailTitleCensorResult setRate(String rate) {
            this.rate = rate;
            return this;
        }
        public String getRate() {
            return this.rate;
        }

    }

    public static class QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailInput extends TeaModel {
        @NameInMap("Object")
        public String object;

        @NameInMap("Location")
        public String location;

        @NameInMap("Bucket")
        public String bucket;

        public static QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailInput build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailInput self = new QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailInput();
            return TeaModel.build(map, self);
        }

        public QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailInput setObject(String object) {
            this.object = object;
            return this;
        }
        public String getObject() {
            return this.object;
        }

        public QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailInput setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailInput setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

    }

    public static class QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailBarrageCensorResult extends TeaModel {
        @NameInMap("Suggestion")
        public String suggestion;

        @NameInMap("Label")
        public String label;

        @NameInMap("Scene")
        public String scene;

        @NameInMap("Rate")
        public String rate;

        public static QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailBarrageCensorResult build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailBarrageCensorResult self = new QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailBarrageCensorResult();
            return TeaModel.build(map, self);
        }

        public QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailBarrageCensorResult setSuggestion(String suggestion) {
            this.suggestion = suggestion;
            return this;
        }
        public String getSuggestion() {
            return this.suggestion;
        }

        public QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailBarrageCensorResult setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailBarrageCensorResult setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailBarrageCensorResult setRate(String rate) {
            this.rate = rate;
            return this;
        }
        public String getRate() {
            return this.rate;
        }

    }

    public static class QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailDescCensorResult extends TeaModel {
        @NameInMap("Suggestion")
        public String suggestion;

        @NameInMap("Label")
        public String label;

        @NameInMap("Scene")
        public String scene;

        @NameInMap("Rate")
        public String rate;

        public static QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailDescCensorResult build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailDescCensorResult self = new QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailDescCensorResult();
            return TeaModel.build(map, self);
        }

        public QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailDescCensorResult setSuggestion(String suggestion) {
            this.suggestion = suggestion;
            return this;
        }
        public String getSuggestion() {
            return this.suggestion;
        }

        public QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailDescCensorResult setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailDescCensorResult setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailDescCensorResult setRate(String rate) {
            this.rate = rate;
            return this;
        }
        public String getRate() {
            return this.rate;
        }

    }

    public static class QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailVideoCensorConfigOutputFile extends TeaModel {
        @NameInMap("Object")
        public String object;

        @NameInMap("Location")
        public String location;

        @NameInMap("Bucket")
        public String bucket;

        public static QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailVideoCensorConfigOutputFile build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailVideoCensorConfigOutputFile self = new QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailVideoCensorConfigOutputFile();
            return TeaModel.build(map, self);
        }

        public QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailVideoCensorConfigOutputFile setObject(String object) {
            this.object = object;
            return this;
        }
        public String getObject() {
            return this.object;
        }

        public QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailVideoCensorConfigOutputFile setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailVideoCensorConfigOutputFile setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

    }

    public static class QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailVideoCensorConfig extends TeaModel {
        @NameInMap("OutputFile")
        public QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailVideoCensorConfigOutputFile outputFile;

        @NameInMap("VideoCensor")
        public String videoCensor;

        @NameInMap("BizType")
        public String bizType;

        public static QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailVideoCensorConfig build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailVideoCensorConfig self = new QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailVideoCensorConfig();
            return TeaModel.build(map, self);
        }

        public QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailVideoCensorConfig setOutputFile(QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailVideoCensorConfigOutputFile outputFile) {
            this.outputFile = outputFile;
            return this;
        }
        public QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailVideoCensorConfigOutputFile getOutputFile() {
            return this.outputFile;
        }

        public QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailVideoCensorConfig setVideoCensor(String videoCensor) {
            this.videoCensor = videoCensor;
            return this;
        }
        public String getVideoCensor() {
            return this.videoCensor;
        }

        public QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailVideoCensorConfig setBizType(String bizType) {
            this.bizType = bizType;
            return this;
        }
        public String getBizType() {
            return this.bizType;
        }

    }

    public static class QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailVensorCensorResultVideoTimelinesVideoTimelineCensorResultsCensorResult extends TeaModel {
        @NameInMap("Suggestion")
        public String suggestion;

        @NameInMap("Label")
        public String label;

        @NameInMap("Scene")
        public String scene;

        @NameInMap("Rate")
        public String rate;

        public static QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailVensorCensorResultVideoTimelinesVideoTimelineCensorResultsCensorResult build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailVensorCensorResultVideoTimelinesVideoTimelineCensorResultsCensorResult self = new QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailVensorCensorResultVideoTimelinesVideoTimelineCensorResultsCensorResult();
            return TeaModel.build(map, self);
        }

        public QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailVensorCensorResultVideoTimelinesVideoTimelineCensorResultsCensorResult setSuggestion(String suggestion) {
            this.suggestion = suggestion;
            return this;
        }
        public String getSuggestion() {
            return this.suggestion;
        }

        public QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailVensorCensorResultVideoTimelinesVideoTimelineCensorResultsCensorResult setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailVensorCensorResultVideoTimelinesVideoTimelineCensorResultsCensorResult setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailVensorCensorResultVideoTimelinesVideoTimelineCensorResultsCensorResult setRate(String rate) {
            this.rate = rate;
            return this;
        }
        public String getRate() {
            return this.rate;
        }

    }

    public static class QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailVensorCensorResultVideoTimelinesVideoTimelineCensorResults extends TeaModel {
        @NameInMap("CensorResult")
        public java.util.List<QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailVensorCensorResultVideoTimelinesVideoTimelineCensorResultsCensorResult> censorResult;

        public static QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailVensorCensorResultVideoTimelinesVideoTimelineCensorResults build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailVensorCensorResultVideoTimelinesVideoTimelineCensorResults self = new QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailVensorCensorResultVideoTimelinesVideoTimelineCensorResults();
            return TeaModel.build(map, self);
        }

        public QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailVensorCensorResultVideoTimelinesVideoTimelineCensorResults setCensorResult(java.util.List<QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailVensorCensorResultVideoTimelinesVideoTimelineCensorResultsCensorResult> censorResult) {
            this.censorResult = censorResult;
            return this;
        }
        public java.util.List<QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailVensorCensorResultVideoTimelinesVideoTimelineCensorResultsCensorResult> getCensorResult() {
            return this.censorResult;
        }

    }

    public static class QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailVensorCensorResultVideoTimelinesVideoTimeline extends TeaModel {
        @NameInMap("Timestamp")
        public String timestamp;

        @NameInMap("Object")
        public String object;

        @NameInMap("CensorResults")
        public QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailVensorCensorResultVideoTimelinesVideoTimelineCensorResults censorResults;

        public static QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailVensorCensorResultVideoTimelinesVideoTimeline build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailVensorCensorResultVideoTimelinesVideoTimeline self = new QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailVensorCensorResultVideoTimelinesVideoTimeline();
            return TeaModel.build(map, self);
        }

        public QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailVensorCensorResultVideoTimelinesVideoTimeline setTimestamp(String timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public String getTimestamp() {
            return this.timestamp;
        }

        public QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailVensorCensorResultVideoTimelinesVideoTimeline setObject(String object) {
            this.object = object;
            return this;
        }
        public String getObject() {
            return this.object;
        }

        public QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailVensorCensorResultVideoTimelinesVideoTimeline setCensorResults(QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailVensorCensorResultVideoTimelinesVideoTimelineCensorResults censorResults) {
            this.censorResults = censorResults;
            return this;
        }
        public QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailVensorCensorResultVideoTimelinesVideoTimelineCensorResults getCensorResults() {
            return this.censorResults;
        }

    }

    public static class QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailVensorCensorResultVideoTimelines extends TeaModel {
        @NameInMap("VideoTimeline")
        public java.util.List<QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailVensorCensorResultVideoTimelinesVideoTimeline> videoTimeline;

        public static QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailVensorCensorResultVideoTimelines build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailVensorCensorResultVideoTimelines self = new QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailVensorCensorResultVideoTimelines();
            return TeaModel.build(map, self);
        }

        public QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailVensorCensorResultVideoTimelines setVideoTimeline(java.util.List<QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailVensorCensorResultVideoTimelinesVideoTimeline> videoTimeline) {
            this.videoTimeline = videoTimeline;
            return this;
        }
        public java.util.List<QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailVensorCensorResultVideoTimelinesVideoTimeline> getVideoTimeline() {
            return this.videoTimeline;
        }

    }

    public static class QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailVensorCensorResultCensorResultsCensorResult extends TeaModel {
        @NameInMap("Suggestion")
        public String suggestion;

        @NameInMap("Label")
        public String label;

        @NameInMap("Scene")
        public String scene;

        @NameInMap("Rate")
        public String rate;

        public static QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailVensorCensorResultCensorResultsCensorResult build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailVensorCensorResultCensorResultsCensorResult self = new QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailVensorCensorResultCensorResultsCensorResult();
            return TeaModel.build(map, self);
        }

        public QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailVensorCensorResultCensorResultsCensorResult setSuggestion(String suggestion) {
            this.suggestion = suggestion;
            return this;
        }
        public String getSuggestion() {
            return this.suggestion;
        }

        public QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailVensorCensorResultCensorResultsCensorResult setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailVensorCensorResultCensorResultsCensorResult setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailVensorCensorResultCensorResultsCensorResult setRate(String rate) {
            this.rate = rate;
            return this;
        }
        public String getRate() {
            return this.rate;
        }

    }

    public static class QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailVensorCensorResultCensorResults extends TeaModel {
        @NameInMap("CensorResult")
        public java.util.List<QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailVensorCensorResultCensorResultsCensorResult> censorResult;

        public static QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailVensorCensorResultCensorResults build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailVensorCensorResultCensorResults self = new QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailVensorCensorResultCensorResults();
            return TeaModel.build(map, self);
        }

        public QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailVensorCensorResultCensorResults setCensorResult(java.util.List<QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailVensorCensorResultCensorResultsCensorResult> censorResult) {
            this.censorResult = censorResult;
            return this;
        }
        public java.util.List<QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailVensorCensorResultCensorResultsCensorResult> getCensorResult() {
            return this.censorResult;
        }

    }

    public static class QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailVensorCensorResult extends TeaModel {
        @NameInMap("VideoTimelines")
        public QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailVensorCensorResultVideoTimelines videoTimelines;

        @NameInMap("NextPageToken")
        public String nextPageToken;

        @NameInMap("CensorResults")
        public QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailVensorCensorResultCensorResults censorResults;

        public static QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailVensorCensorResult build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailVensorCensorResult self = new QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailVensorCensorResult();
            return TeaModel.build(map, self);
        }

        public QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailVensorCensorResult setVideoTimelines(QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailVensorCensorResultVideoTimelines videoTimelines) {
            this.videoTimelines = videoTimelines;
            return this;
        }
        public QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailVensorCensorResultVideoTimelines getVideoTimelines() {
            return this.videoTimelines;
        }

        public QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailVensorCensorResult setNextPageToken(String nextPageToken) {
            this.nextPageToken = nextPageToken;
            return this;
        }
        public String getNextPageToken() {
            return this.nextPageToken;
        }

        public QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailVensorCensorResult setCensorResults(QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailVensorCensorResultCensorResults censorResults) {
            this.censorResults = censorResults;
            return this;
        }
        public QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailVensorCensorResultCensorResults getCensorResults() {
            return this.censorResults;
        }

    }

    public static class QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetail extends TeaModel {
        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("FinishTime")
        public String finishTime;

        @NameInMap("Suggestion")
        public String suggestion;

        @NameInMap("CoverImageCensorResults")
        public QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailCoverImageCensorResults coverImageCensorResults;

        @NameInMap("State")
        public String state;

        @NameInMap("TitleCensorResult")
        public QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailTitleCensorResult titleCensorResult;

        @NameInMap("Message")
        public String message;

        @NameInMap("Input")
        public QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailInput input;

        @NameInMap("BarrageCensorResult")
        public QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailBarrageCensorResult barrageCensorResult;

        @NameInMap("DescCensorResult")
        public QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailDescCensorResult descCensorResult;

        @NameInMap("VideoCensorConfig")
        public QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailVideoCensorConfig videoCensorConfig;

        @NameInMap("JobId")
        public String jobId;

        @NameInMap("UserData")
        public String userData;

        @NameInMap("Code")
        public String code;

        @NameInMap("VensorCensorResult")
        public QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailVensorCensorResult vensorCensorResult;

        @NameInMap("PipelineId")
        public String pipelineId;

        public static QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetail build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetail self = new QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetail();
            return TeaModel.build(map, self);
        }

        public QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetail setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetail setFinishTime(String finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public String getFinishTime() {
            return this.finishTime;
        }

        public QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetail setSuggestion(String suggestion) {
            this.suggestion = suggestion;
            return this;
        }
        public String getSuggestion() {
            return this.suggestion;
        }

        public QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetail setCoverImageCensorResults(QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailCoverImageCensorResults coverImageCensorResults) {
            this.coverImageCensorResults = coverImageCensorResults;
            return this;
        }
        public QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailCoverImageCensorResults getCoverImageCensorResults() {
            return this.coverImageCensorResults;
        }

        public QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetail setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetail setTitleCensorResult(QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailTitleCensorResult titleCensorResult) {
            this.titleCensorResult = titleCensorResult;
            return this;
        }
        public QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailTitleCensorResult getTitleCensorResult() {
            return this.titleCensorResult;
        }

        public QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetail setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetail setInput(QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailInput input) {
            this.input = input;
            return this;
        }
        public QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailInput getInput() {
            return this.input;
        }

        public QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetail setBarrageCensorResult(QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailBarrageCensorResult barrageCensorResult) {
            this.barrageCensorResult = barrageCensorResult;
            return this;
        }
        public QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailBarrageCensorResult getBarrageCensorResult() {
            return this.barrageCensorResult;
        }

        public QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetail setDescCensorResult(QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailDescCensorResult descCensorResult) {
            this.descCensorResult = descCensorResult;
            return this;
        }
        public QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailDescCensorResult getDescCensorResult() {
            return this.descCensorResult;
        }

        public QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetail setVideoCensorConfig(QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailVideoCensorConfig videoCensorConfig) {
            this.videoCensorConfig = videoCensorConfig;
            return this;
        }
        public QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailVideoCensorConfig getVideoCensorConfig() {
            return this.videoCensorConfig;
        }

        public QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetail setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetail setUserData(String userData) {
            this.userData = userData;
            return this;
        }
        public String getUserData() {
            return this.userData;
        }

        public QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetail setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetail setVensorCensorResult(QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailVensorCensorResult vensorCensorResult) {
            this.vensorCensorResult = vensorCensorResult;
            return this;
        }
        public QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetailVensorCensorResult getVensorCensorResult() {
            return this.vensorCensorResult;
        }

        public QueryMediaCensorJobDetailResponseBodyMediaCensorJobDetail setPipelineId(String pipelineId) {
            this.pipelineId = pipelineId;
            return this;
        }
        public String getPipelineId() {
            return this.pipelineId;
        }

    }

}
