// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class QueryMediaCensorJobListResponseBody extends TeaModel {
    @NameInMap("MediaCensorJobList")
    public QueryMediaCensorJobListResponseBodyMediaCensorJobList mediaCensorJobList;

    @NameInMap("NextPageToken")
    public String nextPageToken;

    @NameInMap("NonExistIds")
    public QueryMediaCensorJobListResponseBodyNonExistIds nonExistIds;

    @NameInMap("RequestId")
    public String requestId;

    public static QueryMediaCensorJobListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryMediaCensorJobListResponseBody self = new QueryMediaCensorJobListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryMediaCensorJobListResponseBody setMediaCensorJobList(QueryMediaCensorJobListResponseBodyMediaCensorJobList mediaCensorJobList) {
        this.mediaCensorJobList = mediaCensorJobList;
        return this;
    }
    public QueryMediaCensorJobListResponseBodyMediaCensorJobList getMediaCensorJobList() {
        return this.mediaCensorJobList;
    }

    public QueryMediaCensorJobListResponseBody setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
        return this;
    }
    public String getNextPageToken() {
        return this.nextPageToken;
    }

    public QueryMediaCensorJobListResponseBody setNonExistIds(QueryMediaCensorJobListResponseBodyNonExistIds nonExistIds) {
        this.nonExistIds = nonExistIds;
        return this;
    }
    public QueryMediaCensorJobListResponseBodyNonExistIds getNonExistIds() {
        return this.nonExistIds;
    }

    public QueryMediaCensorJobListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobBarrageCensorResult extends TeaModel {
        @NameInMap("Label")
        public String label;

        @NameInMap("Rate")
        public String rate;

        @NameInMap("Scene")
        public String scene;

        @NameInMap("Suggestion")
        public String suggestion;

        public static QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobBarrageCensorResult build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobBarrageCensorResult self = new QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobBarrageCensorResult();
            return TeaModel.build(map, self);
        }

        public QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobBarrageCensorResult setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobBarrageCensorResult setRate(String rate) {
            this.rate = rate;
            return this;
        }
        public String getRate() {
            return this.rate;
        }

        public QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobBarrageCensorResult setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobBarrageCensorResult setSuggestion(String suggestion) {
            this.suggestion = suggestion;
            return this;
        }
        public String getSuggestion() {
            return this.suggestion;
        }

    }

    public static class QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobCoverImageCensorResultsCoverImageCensorResultResultsResult extends TeaModel {
        @NameInMap("Label")
        public String label;

        @NameInMap("Rate")
        public String rate;

        @NameInMap("Scene")
        public String scene;

        @NameInMap("Suggestion")
        public String suggestion;

        public static QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobCoverImageCensorResultsCoverImageCensorResultResultsResult build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobCoverImageCensorResultsCoverImageCensorResultResultsResult self = new QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobCoverImageCensorResultsCoverImageCensorResultResultsResult();
            return TeaModel.build(map, self);
        }

        public QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobCoverImageCensorResultsCoverImageCensorResultResultsResult setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobCoverImageCensorResultsCoverImageCensorResultResultsResult setRate(String rate) {
            this.rate = rate;
            return this;
        }
        public String getRate() {
            return this.rate;
        }

        public QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobCoverImageCensorResultsCoverImageCensorResultResultsResult setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobCoverImageCensorResultsCoverImageCensorResultResultsResult setSuggestion(String suggestion) {
            this.suggestion = suggestion;
            return this;
        }
        public String getSuggestion() {
            return this.suggestion;
        }

    }

    public static class QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobCoverImageCensorResultsCoverImageCensorResultResults extends TeaModel {
        @NameInMap("Result")
        public java.util.List<QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobCoverImageCensorResultsCoverImageCensorResultResultsResult> result;

        public static QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobCoverImageCensorResultsCoverImageCensorResultResults build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobCoverImageCensorResultsCoverImageCensorResultResults self = new QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobCoverImageCensorResultsCoverImageCensorResultResults();
            return TeaModel.build(map, self);
        }

        public QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobCoverImageCensorResultsCoverImageCensorResultResults setResult(java.util.List<QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobCoverImageCensorResultsCoverImageCensorResultResultsResult> result) {
            this.result = result;
            return this;
        }
        public java.util.List<QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobCoverImageCensorResultsCoverImageCensorResultResultsResult> getResult() {
            return this.result;
        }

    }

    public static class QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobCoverImageCensorResultsCoverImageCensorResult extends TeaModel {
        @NameInMap("Bucket")
        public String bucket;

        @NameInMap("Location")
        public String location;

        @NameInMap("Object")
        public String object;

        @NameInMap("Results")
        public QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobCoverImageCensorResultsCoverImageCensorResultResults results;

        public static QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobCoverImageCensorResultsCoverImageCensorResult build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobCoverImageCensorResultsCoverImageCensorResult self = new QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobCoverImageCensorResultsCoverImageCensorResult();
            return TeaModel.build(map, self);
        }

        public QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobCoverImageCensorResultsCoverImageCensorResult setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

        public QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobCoverImageCensorResultsCoverImageCensorResult setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobCoverImageCensorResultsCoverImageCensorResult setObject(String object) {
            this.object = object;
            return this;
        }
        public String getObject() {
            return this.object;
        }

        public QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobCoverImageCensorResultsCoverImageCensorResult setResults(QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobCoverImageCensorResultsCoverImageCensorResultResults results) {
            this.results = results;
            return this;
        }
        public QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobCoverImageCensorResultsCoverImageCensorResultResults getResults() {
            return this.results;
        }

    }

    public static class QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobCoverImageCensorResults extends TeaModel {
        @NameInMap("CoverImageCensorResult")
        public java.util.List<QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobCoverImageCensorResultsCoverImageCensorResult> coverImageCensorResult;

        public static QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobCoverImageCensorResults build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobCoverImageCensorResults self = new QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobCoverImageCensorResults();
            return TeaModel.build(map, self);
        }

        public QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobCoverImageCensorResults setCoverImageCensorResult(java.util.List<QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobCoverImageCensorResultsCoverImageCensorResult> coverImageCensorResult) {
            this.coverImageCensorResult = coverImageCensorResult;
            return this;
        }
        public java.util.List<QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobCoverImageCensorResultsCoverImageCensorResult> getCoverImageCensorResult() {
            return this.coverImageCensorResult;
        }

    }

    public static class QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobDescCensorResult extends TeaModel {
        @NameInMap("Label")
        public String label;

        @NameInMap("Rate")
        public String rate;

        @NameInMap("Scene")
        public String scene;

        @NameInMap("Suggestion")
        public String suggestion;

        public static QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobDescCensorResult build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobDescCensorResult self = new QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobDescCensorResult();
            return TeaModel.build(map, self);
        }

        public QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobDescCensorResult setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobDescCensorResult setRate(String rate) {
            this.rate = rate;
            return this;
        }
        public String getRate() {
            return this.rate;
        }

        public QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobDescCensorResult setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobDescCensorResult setSuggestion(String suggestion) {
            this.suggestion = suggestion;
            return this;
        }
        public String getSuggestion() {
            return this.suggestion;
        }

    }

    public static class QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobInput extends TeaModel {
        @NameInMap("Bucket")
        public String bucket;

        @NameInMap("Location")
        public String location;

        @NameInMap("Object")
        public String object;

        public static QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobInput build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobInput self = new QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobInput();
            return TeaModel.build(map, self);
        }

        public QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobInput setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

        public QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobInput setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobInput setObject(String object) {
            this.object = object;
            return this;
        }
        public String getObject() {
            return this.object;
        }

    }

    public static class QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobTitleCensorResult extends TeaModel {
        @NameInMap("Label")
        public String label;

        @NameInMap("Rate")
        public String rate;

        @NameInMap("Scene")
        public String scene;

        @NameInMap("Suggestion")
        public String suggestion;

        public static QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobTitleCensorResult build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobTitleCensorResult self = new QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobTitleCensorResult();
            return TeaModel.build(map, self);
        }

        public QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobTitleCensorResult setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobTitleCensorResult setRate(String rate) {
            this.rate = rate;
            return this;
        }
        public String getRate() {
            return this.rate;
        }

        public QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobTitleCensorResult setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobTitleCensorResult setSuggestion(String suggestion) {
            this.suggestion = suggestion;
            return this;
        }
        public String getSuggestion() {
            return this.suggestion;
        }

    }

    public static class QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobVensorCensorResultCensorResultsCensorResult extends TeaModel {
        @NameInMap("Label")
        public String label;

        @NameInMap("Rate")
        public String rate;

        @NameInMap("Scene")
        public String scene;

        @NameInMap("Suggestion")
        public String suggestion;

        public static QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobVensorCensorResultCensorResultsCensorResult build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobVensorCensorResultCensorResultsCensorResult self = new QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobVensorCensorResultCensorResultsCensorResult();
            return TeaModel.build(map, self);
        }

        public QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobVensorCensorResultCensorResultsCensorResult setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobVensorCensorResultCensorResultsCensorResult setRate(String rate) {
            this.rate = rate;
            return this;
        }
        public String getRate() {
            return this.rate;
        }

        public QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobVensorCensorResultCensorResultsCensorResult setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobVensorCensorResultCensorResultsCensorResult setSuggestion(String suggestion) {
            this.suggestion = suggestion;
            return this;
        }
        public String getSuggestion() {
            return this.suggestion;
        }

    }

    public static class QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobVensorCensorResultCensorResults extends TeaModel {
        @NameInMap("CensorResult")
        public java.util.List<QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobVensorCensorResultCensorResultsCensorResult> censorResult;

        public static QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobVensorCensorResultCensorResults build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobVensorCensorResultCensorResults self = new QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobVensorCensorResultCensorResults();
            return TeaModel.build(map, self);
        }

        public QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobVensorCensorResultCensorResults setCensorResult(java.util.List<QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobVensorCensorResultCensorResultsCensorResult> censorResult) {
            this.censorResult = censorResult;
            return this;
        }
        public java.util.List<QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobVensorCensorResultCensorResultsCensorResult> getCensorResult() {
            return this.censorResult;
        }

    }

    public static class QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobVensorCensorResultVideoTimelinesVideoTimelineCensorResultsCensorResult extends TeaModel {
        @NameInMap("Label")
        public String label;

        @NameInMap("Rate")
        public String rate;

        @NameInMap("Scene")
        public String scene;

        @NameInMap("Suggestion")
        public String suggestion;

        public static QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobVensorCensorResultVideoTimelinesVideoTimelineCensorResultsCensorResult build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobVensorCensorResultVideoTimelinesVideoTimelineCensorResultsCensorResult self = new QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobVensorCensorResultVideoTimelinesVideoTimelineCensorResultsCensorResult();
            return TeaModel.build(map, self);
        }

        public QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobVensorCensorResultVideoTimelinesVideoTimelineCensorResultsCensorResult setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobVensorCensorResultVideoTimelinesVideoTimelineCensorResultsCensorResult setRate(String rate) {
            this.rate = rate;
            return this;
        }
        public String getRate() {
            return this.rate;
        }

        public QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobVensorCensorResultVideoTimelinesVideoTimelineCensorResultsCensorResult setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

        public QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobVensorCensorResultVideoTimelinesVideoTimelineCensorResultsCensorResult setSuggestion(String suggestion) {
            this.suggestion = suggestion;
            return this;
        }
        public String getSuggestion() {
            return this.suggestion;
        }

    }

    public static class QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobVensorCensorResultVideoTimelinesVideoTimelineCensorResults extends TeaModel {
        @NameInMap("CensorResult")
        public java.util.List<QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobVensorCensorResultVideoTimelinesVideoTimelineCensorResultsCensorResult> censorResult;

        public static QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobVensorCensorResultVideoTimelinesVideoTimelineCensorResults build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobVensorCensorResultVideoTimelinesVideoTimelineCensorResults self = new QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobVensorCensorResultVideoTimelinesVideoTimelineCensorResults();
            return TeaModel.build(map, self);
        }

        public QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobVensorCensorResultVideoTimelinesVideoTimelineCensorResults setCensorResult(java.util.List<QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobVensorCensorResultVideoTimelinesVideoTimelineCensorResultsCensorResult> censorResult) {
            this.censorResult = censorResult;
            return this;
        }
        public java.util.List<QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobVensorCensorResultVideoTimelinesVideoTimelineCensorResultsCensorResult> getCensorResult() {
            return this.censorResult;
        }

    }

    public static class QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobVensorCensorResultVideoTimelinesVideoTimeline extends TeaModel {
        @NameInMap("CensorResults")
        public QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobVensorCensorResultVideoTimelinesVideoTimelineCensorResults censorResults;

        @NameInMap("Object")
        public String object;

        @NameInMap("Timestamp")
        public String timestamp;

        public static QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobVensorCensorResultVideoTimelinesVideoTimeline build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobVensorCensorResultVideoTimelinesVideoTimeline self = new QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobVensorCensorResultVideoTimelinesVideoTimeline();
            return TeaModel.build(map, self);
        }

        public QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobVensorCensorResultVideoTimelinesVideoTimeline setCensorResults(QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobVensorCensorResultVideoTimelinesVideoTimelineCensorResults censorResults) {
            this.censorResults = censorResults;
            return this;
        }
        public QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobVensorCensorResultVideoTimelinesVideoTimelineCensorResults getCensorResults() {
            return this.censorResults;
        }

        public QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobVensorCensorResultVideoTimelinesVideoTimeline setObject(String object) {
            this.object = object;
            return this;
        }
        public String getObject() {
            return this.object;
        }

        public QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobVensorCensorResultVideoTimelinesVideoTimeline setTimestamp(String timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public String getTimestamp() {
            return this.timestamp;
        }

    }

    public static class QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobVensorCensorResultVideoTimelines extends TeaModel {
        @NameInMap("VideoTimeline")
        public java.util.List<QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobVensorCensorResultVideoTimelinesVideoTimeline> videoTimeline;

        public static QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobVensorCensorResultVideoTimelines build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobVensorCensorResultVideoTimelines self = new QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobVensorCensorResultVideoTimelines();
            return TeaModel.build(map, self);
        }

        public QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobVensorCensorResultVideoTimelines setVideoTimeline(java.util.List<QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobVensorCensorResultVideoTimelinesVideoTimeline> videoTimeline) {
            this.videoTimeline = videoTimeline;
            return this;
        }
        public java.util.List<QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobVensorCensorResultVideoTimelinesVideoTimeline> getVideoTimeline() {
            return this.videoTimeline;
        }

    }

    public static class QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobVensorCensorResult extends TeaModel {
        @NameInMap("CensorResults")
        public QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobVensorCensorResultCensorResults censorResults;

        @NameInMap("NextPageToken")
        public String nextPageToken;

        @NameInMap("VideoTimelines")
        public QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobVensorCensorResultVideoTimelines videoTimelines;

        public static QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobVensorCensorResult build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobVensorCensorResult self = new QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobVensorCensorResult();
            return TeaModel.build(map, self);
        }

        public QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobVensorCensorResult setCensorResults(QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobVensorCensorResultCensorResults censorResults) {
            this.censorResults = censorResults;
            return this;
        }
        public QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobVensorCensorResultCensorResults getCensorResults() {
            return this.censorResults;
        }

        public QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobVensorCensorResult setNextPageToken(String nextPageToken) {
            this.nextPageToken = nextPageToken;
            return this;
        }
        public String getNextPageToken() {
            return this.nextPageToken;
        }

        public QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobVensorCensorResult setVideoTimelines(QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobVensorCensorResultVideoTimelines videoTimelines) {
            this.videoTimelines = videoTimelines;
            return this;
        }
        public QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobVensorCensorResultVideoTimelines getVideoTimelines() {
            return this.videoTimelines;
        }

    }

    public static class QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobVideoCensorConfigOutputFile extends TeaModel {
        @NameInMap("Bucket")
        public String bucket;

        @NameInMap("Location")
        public String location;

        @NameInMap("Object")
        public String object;

        public static QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobVideoCensorConfigOutputFile build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobVideoCensorConfigOutputFile self = new QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobVideoCensorConfigOutputFile();
            return TeaModel.build(map, self);
        }

        public QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobVideoCensorConfigOutputFile setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

        public QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobVideoCensorConfigOutputFile setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobVideoCensorConfigOutputFile setObject(String object) {
            this.object = object;
            return this;
        }
        public String getObject() {
            return this.object;
        }

    }

    public static class QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobVideoCensorConfig extends TeaModel {
        @NameInMap("BizType")
        public String bizType;

        @NameInMap("OutputFile")
        public QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobVideoCensorConfigOutputFile outputFile;

        @NameInMap("VideoCensor")
        public String videoCensor;

        public static QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobVideoCensorConfig build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobVideoCensorConfig self = new QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobVideoCensorConfig();
            return TeaModel.build(map, self);
        }

        public QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobVideoCensorConfig setBizType(String bizType) {
            this.bizType = bizType;
            return this;
        }
        public String getBizType() {
            return this.bizType;
        }

        public QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobVideoCensorConfig setOutputFile(QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobVideoCensorConfigOutputFile outputFile) {
            this.outputFile = outputFile;
            return this;
        }
        public QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobVideoCensorConfigOutputFile getOutputFile() {
            return this.outputFile;
        }

        public QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobVideoCensorConfig setVideoCensor(String videoCensor) {
            this.videoCensor = videoCensor;
            return this;
        }
        public String getVideoCensor() {
            return this.videoCensor;
        }

    }

    public static class QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJob extends TeaModel {
        @NameInMap("BarrageCensorResult")
        public QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobBarrageCensorResult barrageCensorResult;

        @NameInMap("Code")
        public String code;

        @NameInMap("CoverImageCensorResults")
        public QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobCoverImageCensorResults coverImageCensorResults;

        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("DescCensorResult")
        public QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobDescCensorResult descCensorResult;

        @NameInMap("FinishTime")
        public String finishTime;

        @NameInMap("Input")
        public QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobInput input;

        @NameInMap("JobId")
        public String jobId;

        @NameInMap("Message")
        public String message;

        @NameInMap("PipelineId")
        public String pipelineId;

        @NameInMap("State")
        public String state;

        @NameInMap("Suggestion")
        public String suggestion;

        @NameInMap("TitleCensorResult")
        public QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobTitleCensorResult titleCensorResult;

        @NameInMap("UserData")
        public String userData;

        @NameInMap("VensorCensorResult")
        public QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobVensorCensorResult vensorCensorResult;

        @NameInMap("VideoCensorConfig")
        public QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobVideoCensorConfig videoCensorConfig;

        public static QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJob build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJob self = new QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJob();
            return TeaModel.build(map, self);
        }

        public QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJob setBarrageCensorResult(QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobBarrageCensorResult barrageCensorResult) {
            this.barrageCensorResult = barrageCensorResult;
            return this;
        }
        public QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobBarrageCensorResult getBarrageCensorResult() {
            return this.barrageCensorResult;
        }

        public QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJob setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJob setCoverImageCensorResults(QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobCoverImageCensorResults coverImageCensorResults) {
            this.coverImageCensorResults = coverImageCensorResults;
            return this;
        }
        public QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobCoverImageCensorResults getCoverImageCensorResults() {
            return this.coverImageCensorResults;
        }

        public QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJob setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJob setDescCensorResult(QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobDescCensorResult descCensorResult) {
            this.descCensorResult = descCensorResult;
            return this;
        }
        public QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobDescCensorResult getDescCensorResult() {
            return this.descCensorResult;
        }

        public QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJob setFinishTime(String finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public String getFinishTime() {
            return this.finishTime;
        }

        public QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJob setInput(QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobInput input) {
            this.input = input;
            return this;
        }
        public QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobInput getInput() {
            return this.input;
        }

        public QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJob setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJob setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJob setPipelineId(String pipelineId) {
            this.pipelineId = pipelineId;
            return this;
        }
        public String getPipelineId() {
            return this.pipelineId;
        }

        public QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJob setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJob setSuggestion(String suggestion) {
            this.suggestion = suggestion;
            return this;
        }
        public String getSuggestion() {
            return this.suggestion;
        }

        public QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJob setTitleCensorResult(QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobTitleCensorResult titleCensorResult) {
            this.titleCensorResult = titleCensorResult;
            return this;
        }
        public QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobTitleCensorResult getTitleCensorResult() {
            return this.titleCensorResult;
        }

        public QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJob setUserData(String userData) {
            this.userData = userData;
            return this;
        }
        public String getUserData() {
            return this.userData;
        }

        public QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJob setVensorCensorResult(QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobVensorCensorResult vensorCensorResult) {
            this.vensorCensorResult = vensorCensorResult;
            return this;
        }
        public QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobVensorCensorResult getVensorCensorResult() {
            return this.vensorCensorResult;
        }

        public QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJob setVideoCensorConfig(QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobVideoCensorConfig videoCensorConfig) {
            this.videoCensorConfig = videoCensorConfig;
            return this;
        }
        public QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJobVideoCensorConfig getVideoCensorConfig() {
            return this.videoCensorConfig;
        }

    }

    public static class QueryMediaCensorJobListResponseBodyMediaCensorJobList extends TeaModel {
        @NameInMap("MediaCensorJob")
        public java.util.List<QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJob> mediaCensorJob;

        public static QueryMediaCensorJobListResponseBodyMediaCensorJobList build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaCensorJobListResponseBodyMediaCensorJobList self = new QueryMediaCensorJobListResponseBodyMediaCensorJobList();
            return TeaModel.build(map, self);
        }

        public QueryMediaCensorJobListResponseBodyMediaCensorJobList setMediaCensorJob(java.util.List<QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJob> mediaCensorJob) {
            this.mediaCensorJob = mediaCensorJob;
            return this;
        }
        public java.util.List<QueryMediaCensorJobListResponseBodyMediaCensorJobListMediaCensorJob> getMediaCensorJob() {
            return this.mediaCensorJob;
        }

    }

    public static class QueryMediaCensorJobListResponseBodyNonExistIds extends TeaModel {
        @NameInMap("String")
        public java.util.List<String> string;

        public static QueryMediaCensorJobListResponseBodyNonExistIds build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaCensorJobListResponseBodyNonExistIds self = new QueryMediaCensorJobListResponseBodyNonExistIds();
            return TeaModel.build(map, self);
        }

        public QueryMediaCensorJobListResponseBodyNonExistIds setString(java.util.List<String> string) {
            this.string = string;
            return this;
        }
        public java.util.List<String> getString() {
            return this.string;
        }

    }

}
