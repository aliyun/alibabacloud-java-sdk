// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class QueryCensorJobListResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("CensorJobList")
    public QueryCensorJobListResponseBodyCensorJobList censorJobList;

    @NameInMap("NonExistIds")
    public QueryCensorJobListResponseBodyNonExistIds nonExistIds;

    public static QueryCensorJobListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryCensorJobListResponseBody self = new QueryCensorJobListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryCensorJobListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryCensorJobListResponseBody setCensorJobList(QueryCensorJobListResponseBodyCensorJobList censorJobList) {
        this.censorJobList = censorJobList;
        return this;
    }
    public QueryCensorJobListResponseBodyCensorJobList getCensorJobList() {
        return this.censorJobList;
    }

    public QueryCensorJobListResponseBody setNonExistIds(QueryCensorJobListResponseBodyNonExistIds nonExistIds) {
        this.nonExistIds = nonExistIds;
        return this;
    }
    public QueryCensorJobListResponseBodyNonExistIds getNonExistIds() {
        return this.nonExistIds;
    }

    public static class QueryCensorJobListResponseBodyCensorJobListCensorJobCensorTerrorismResultTerrorismTopListTop extends TeaModel {
        @NameInMap("Index")
        public String index;

        @NameInMap("Score")
        public String score;

        @NameInMap("Timestamp")
        public String timestamp;

        @NameInMap("Object")
        public String object;

        @NameInMap("Label")
        public String label;

        public static QueryCensorJobListResponseBodyCensorJobListCensorJobCensorTerrorismResultTerrorismTopListTop build(java.util.Map<String, ?> map) throws Exception {
            QueryCensorJobListResponseBodyCensorJobListCensorJobCensorTerrorismResultTerrorismTopListTop self = new QueryCensorJobListResponseBodyCensorJobListCensorJobCensorTerrorismResultTerrorismTopListTop();
            return TeaModel.build(map, self);
        }

        public QueryCensorJobListResponseBodyCensorJobListCensorJobCensorTerrorismResultTerrorismTopListTop setIndex(String index) {
            this.index = index;
            return this;
        }
        public String getIndex() {
            return this.index;
        }

        public QueryCensorJobListResponseBodyCensorJobListCensorJobCensorTerrorismResultTerrorismTopListTop setScore(String score) {
            this.score = score;
            return this;
        }
        public String getScore() {
            return this.score;
        }

        public QueryCensorJobListResponseBodyCensorJobListCensorJobCensorTerrorismResultTerrorismTopListTop setTimestamp(String timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public String getTimestamp() {
            return this.timestamp;
        }

        public QueryCensorJobListResponseBodyCensorJobListCensorJobCensorTerrorismResultTerrorismTopListTop setObject(String object) {
            this.object = object;
            return this;
        }
        public String getObject() {
            return this.object;
        }

        public QueryCensorJobListResponseBodyCensorJobListCensorJobCensorTerrorismResultTerrorismTopListTop setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

    }

    public static class QueryCensorJobListResponseBodyCensorJobListCensorJobCensorTerrorismResultTerrorismTopList extends TeaModel {
        @NameInMap("Top")
        public java.util.List<QueryCensorJobListResponseBodyCensorJobListCensorJobCensorTerrorismResultTerrorismTopListTop> top;

        public static QueryCensorJobListResponseBodyCensorJobListCensorJobCensorTerrorismResultTerrorismTopList build(java.util.Map<String, ?> map) throws Exception {
            QueryCensorJobListResponseBodyCensorJobListCensorJobCensorTerrorismResultTerrorismTopList self = new QueryCensorJobListResponseBodyCensorJobListCensorJobCensorTerrorismResultTerrorismTopList();
            return TeaModel.build(map, self);
        }

        public QueryCensorJobListResponseBodyCensorJobListCensorJobCensorTerrorismResultTerrorismTopList setTop(java.util.List<QueryCensorJobListResponseBodyCensorJobListCensorJobCensorTerrorismResultTerrorismTopListTop> top) {
            this.top = top;
            return this;
        }
        public java.util.List<QueryCensorJobListResponseBodyCensorJobListCensorJobCensorTerrorismResultTerrorismTopListTop> getTop() {
            return this.top;
        }

    }

    public static class QueryCensorJobListResponseBodyCensorJobListCensorJobCensorTerrorismResultTerrorismCounterListCounter extends TeaModel {
        @NameInMap("Label")
        public String label;

        @NameInMap("Count")
        public Integer count;

        public static QueryCensorJobListResponseBodyCensorJobListCensorJobCensorTerrorismResultTerrorismCounterListCounter build(java.util.Map<String, ?> map) throws Exception {
            QueryCensorJobListResponseBodyCensorJobListCensorJobCensorTerrorismResultTerrorismCounterListCounter self = new QueryCensorJobListResponseBodyCensorJobListCensorJobCensorTerrorismResultTerrorismCounterListCounter();
            return TeaModel.build(map, self);
        }

        public QueryCensorJobListResponseBodyCensorJobListCensorJobCensorTerrorismResultTerrorismCounterListCounter setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public QueryCensorJobListResponseBodyCensorJobListCensorJobCensorTerrorismResultTerrorismCounterListCounter setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

    }

    public static class QueryCensorJobListResponseBodyCensorJobListCensorJobCensorTerrorismResultTerrorismCounterList extends TeaModel {
        @NameInMap("Counter")
        public java.util.List<QueryCensorJobListResponseBodyCensorJobListCensorJobCensorTerrorismResultTerrorismCounterListCounter> counter;

        public static QueryCensorJobListResponseBodyCensorJobListCensorJobCensorTerrorismResultTerrorismCounterList build(java.util.Map<String, ?> map) throws Exception {
            QueryCensorJobListResponseBodyCensorJobListCensorJobCensorTerrorismResultTerrorismCounterList self = new QueryCensorJobListResponseBodyCensorJobListCensorJobCensorTerrorismResultTerrorismCounterList();
            return TeaModel.build(map, self);
        }

        public QueryCensorJobListResponseBodyCensorJobListCensorJobCensorTerrorismResultTerrorismCounterList setCounter(java.util.List<QueryCensorJobListResponseBodyCensorJobListCensorJobCensorTerrorismResultTerrorismCounterListCounter> counter) {
            this.counter = counter;
            return this;
        }
        public java.util.List<QueryCensorJobListResponseBodyCensorJobListCensorJobCensorTerrorismResultTerrorismCounterListCounter> getCounter() {
            return this.counter;
        }

    }

    public static class QueryCensorJobListResponseBodyCensorJobListCensorJobCensorTerrorismResult extends TeaModel {
        @NameInMap("TerrorismTopList")
        public QueryCensorJobListResponseBodyCensorJobListCensorJobCensorTerrorismResultTerrorismTopList terrorismTopList;

        @NameInMap("Suggestion")
        public String suggestion;

        @NameInMap("AverageScore")
        public String averageScore;

        @NameInMap("TerrorismCounterList")
        public QueryCensorJobListResponseBodyCensorJobListCensorJobCensorTerrorismResultTerrorismCounterList terrorismCounterList;

        @NameInMap("Label")
        public String label;

        @NameInMap("MaxScore")
        public String maxScore;

        public static QueryCensorJobListResponseBodyCensorJobListCensorJobCensorTerrorismResult build(java.util.Map<String, ?> map) throws Exception {
            QueryCensorJobListResponseBodyCensorJobListCensorJobCensorTerrorismResult self = new QueryCensorJobListResponseBodyCensorJobListCensorJobCensorTerrorismResult();
            return TeaModel.build(map, self);
        }

        public QueryCensorJobListResponseBodyCensorJobListCensorJobCensorTerrorismResult setTerrorismTopList(QueryCensorJobListResponseBodyCensorJobListCensorJobCensorTerrorismResultTerrorismTopList terrorismTopList) {
            this.terrorismTopList = terrorismTopList;
            return this;
        }
        public QueryCensorJobListResponseBodyCensorJobListCensorJobCensorTerrorismResultTerrorismTopList getTerrorismTopList() {
            return this.terrorismTopList;
        }

        public QueryCensorJobListResponseBodyCensorJobListCensorJobCensorTerrorismResult setSuggestion(String suggestion) {
            this.suggestion = suggestion;
            return this;
        }
        public String getSuggestion() {
            return this.suggestion;
        }

        public QueryCensorJobListResponseBodyCensorJobListCensorJobCensorTerrorismResult setAverageScore(String averageScore) {
            this.averageScore = averageScore;
            return this;
        }
        public String getAverageScore() {
            return this.averageScore;
        }

        public QueryCensorJobListResponseBodyCensorJobListCensorJobCensorTerrorismResult setTerrorismCounterList(QueryCensorJobListResponseBodyCensorJobListCensorJobCensorTerrorismResultTerrorismCounterList terrorismCounterList) {
            this.terrorismCounterList = terrorismCounterList;
            return this;
        }
        public QueryCensorJobListResponseBodyCensorJobListCensorJobCensorTerrorismResultTerrorismCounterList getTerrorismCounterList() {
            return this.terrorismCounterList;
        }

        public QueryCensorJobListResponseBodyCensorJobListCensorJobCensorTerrorismResult setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public QueryCensorJobListResponseBodyCensorJobListCensorJobCensorTerrorismResult setMaxScore(String maxScore) {
            this.maxScore = maxScore;
            return this;
        }
        public String getMaxScore() {
            return this.maxScore;
        }

    }

    public static class QueryCensorJobListResponseBodyCensorJobListCensorJobImageCensorResultsImageCensorResult extends TeaModel {
        @NameInMap("ImageBucket")
        public String imageBucket;

        @NameInMap("Result")
        public String result;

        @NameInMap("ImageLocation")
        public String imageLocation;

        @NameInMap("ImageObject")
        public String imageObject;

        public static QueryCensorJobListResponseBodyCensorJobListCensorJobImageCensorResultsImageCensorResult build(java.util.Map<String, ?> map) throws Exception {
            QueryCensorJobListResponseBodyCensorJobListCensorJobImageCensorResultsImageCensorResult self = new QueryCensorJobListResponseBodyCensorJobListCensorJobImageCensorResultsImageCensorResult();
            return TeaModel.build(map, self);
        }

        public QueryCensorJobListResponseBodyCensorJobListCensorJobImageCensorResultsImageCensorResult setImageBucket(String imageBucket) {
            this.imageBucket = imageBucket;
            return this;
        }
        public String getImageBucket() {
            return this.imageBucket;
        }

        public QueryCensorJobListResponseBodyCensorJobListCensorJobImageCensorResultsImageCensorResult setResult(String result) {
            this.result = result;
            return this;
        }
        public String getResult() {
            return this.result;
        }

        public QueryCensorJobListResponseBodyCensorJobListCensorJobImageCensorResultsImageCensorResult setImageLocation(String imageLocation) {
            this.imageLocation = imageLocation;
            return this;
        }
        public String getImageLocation() {
            return this.imageLocation;
        }

        public QueryCensorJobListResponseBodyCensorJobListCensorJobImageCensorResultsImageCensorResult setImageObject(String imageObject) {
            this.imageObject = imageObject;
            return this;
        }
        public String getImageObject() {
            return this.imageObject;
        }

    }

    public static class QueryCensorJobListResponseBodyCensorJobListCensorJobImageCensorResults extends TeaModel {
        @NameInMap("ImageCensorResult")
        public java.util.List<QueryCensorJobListResponseBodyCensorJobListCensorJobImageCensorResultsImageCensorResult> imageCensorResult;

        public static QueryCensorJobListResponseBodyCensorJobListCensorJobImageCensorResults build(java.util.Map<String, ?> map) throws Exception {
            QueryCensorJobListResponseBodyCensorJobListCensorJobImageCensorResults self = new QueryCensorJobListResponseBodyCensorJobListCensorJobImageCensorResults();
            return TeaModel.build(map, self);
        }

        public QueryCensorJobListResponseBodyCensorJobListCensorJobImageCensorResults setImageCensorResult(java.util.List<QueryCensorJobListResponseBodyCensorJobListCensorJobImageCensorResultsImageCensorResult> imageCensorResult) {
            this.imageCensorResult = imageCensorResult;
            return this;
        }
        public java.util.List<QueryCensorJobListResponseBodyCensorJobListCensorJobImageCensorResultsImageCensorResult> getImageCensorResult() {
            return this.imageCensorResult;
        }

    }

    public static class QueryCensorJobListResponseBodyCensorJobListCensorJobInput extends TeaModel {
        @NameInMap("Object")
        public String object;

        @NameInMap("Location")
        public String location;

        @NameInMap("Bucket")
        public String bucket;

        public static QueryCensorJobListResponseBodyCensorJobListCensorJobInput build(java.util.Map<String, ?> map) throws Exception {
            QueryCensorJobListResponseBodyCensorJobListCensorJobInput self = new QueryCensorJobListResponseBodyCensorJobListCensorJobInput();
            return TeaModel.build(map, self);
        }

        public QueryCensorJobListResponseBodyCensorJobListCensorJobInput setObject(String object) {
            this.object = object;
            return this;
        }
        public String getObject() {
            return this.object;
        }

        public QueryCensorJobListResponseBodyCensorJobListCensorJobInput setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public QueryCensorJobListResponseBodyCensorJobListCensorJobInput setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

    }

    public static class QueryCensorJobListResponseBodyCensorJobListCensorJobCensorConfigOutputFile extends TeaModel {
        @NameInMap("Object")
        public String object;

        @NameInMap("Location")
        public String location;

        @NameInMap("Bucket")
        public String bucket;

        public static QueryCensorJobListResponseBodyCensorJobListCensorJobCensorConfigOutputFile build(java.util.Map<String, ?> map) throws Exception {
            QueryCensorJobListResponseBodyCensorJobListCensorJobCensorConfigOutputFile self = new QueryCensorJobListResponseBodyCensorJobListCensorJobCensorConfigOutputFile();
            return TeaModel.build(map, self);
        }

        public QueryCensorJobListResponseBodyCensorJobListCensorJobCensorConfigOutputFile setObject(String object) {
            this.object = object;
            return this;
        }
        public String getObject() {
            return this.object;
        }

        public QueryCensorJobListResponseBodyCensorJobListCensorJobCensorConfigOutputFile setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public QueryCensorJobListResponseBodyCensorJobListCensorJobCensorConfigOutputFile setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

    }

    public static class QueryCensorJobListResponseBodyCensorJobListCensorJobCensorConfig extends TeaModel {
        @NameInMap("Interval")
        public String interval;

        @NameInMap("SaveType")
        public String saveType;

        @NameInMap("OutputFile")
        public QueryCensorJobListResponseBodyCensorJobListCensorJobCensorConfigOutputFile outputFile;

        @NameInMap("Scenes")
        public String scenes;

        @NameInMap("BizType")
        public String bizType;

        public static QueryCensorJobListResponseBodyCensorJobListCensorJobCensorConfig build(java.util.Map<String, ?> map) throws Exception {
            QueryCensorJobListResponseBodyCensorJobListCensorJobCensorConfig self = new QueryCensorJobListResponseBodyCensorJobListCensorJobCensorConfig();
            return TeaModel.build(map, self);
        }

        public QueryCensorJobListResponseBodyCensorJobListCensorJobCensorConfig setInterval(String interval) {
            this.interval = interval;
            return this;
        }
        public String getInterval() {
            return this.interval;
        }

        public QueryCensorJobListResponseBodyCensorJobListCensorJobCensorConfig setSaveType(String saveType) {
            this.saveType = saveType;
            return this;
        }
        public String getSaveType() {
            return this.saveType;
        }

        public QueryCensorJobListResponseBodyCensorJobListCensorJobCensorConfig setOutputFile(QueryCensorJobListResponseBodyCensorJobListCensorJobCensorConfigOutputFile outputFile) {
            this.outputFile = outputFile;
            return this;
        }
        public QueryCensorJobListResponseBodyCensorJobListCensorJobCensorConfigOutputFile getOutputFile() {
            return this.outputFile;
        }

        public QueryCensorJobListResponseBodyCensorJobListCensorJobCensorConfig setScenes(String scenes) {
            this.scenes = scenes;
            return this;
        }
        public String getScenes() {
            return this.scenes;
        }

        public QueryCensorJobListResponseBodyCensorJobListCensorJobCensorConfig setBizType(String bizType) {
            this.bizType = bizType;
            return this;
        }
        public String getBizType() {
            return this.bizType;
        }

    }

    public static class QueryCensorJobListResponseBodyCensorJobListCensorJobCensorPornResultPornCounterListCounter extends TeaModel {
        @NameInMap("Label")
        public String label;

        @NameInMap("Count")
        public Integer count;

        public static QueryCensorJobListResponseBodyCensorJobListCensorJobCensorPornResultPornCounterListCounter build(java.util.Map<String, ?> map) throws Exception {
            QueryCensorJobListResponseBodyCensorJobListCensorJobCensorPornResultPornCounterListCounter self = new QueryCensorJobListResponseBodyCensorJobListCensorJobCensorPornResultPornCounterListCounter();
            return TeaModel.build(map, self);
        }

        public QueryCensorJobListResponseBodyCensorJobListCensorJobCensorPornResultPornCounterListCounter setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public QueryCensorJobListResponseBodyCensorJobListCensorJobCensorPornResultPornCounterListCounter setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

    }

    public static class QueryCensorJobListResponseBodyCensorJobListCensorJobCensorPornResultPornCounterList extends TeaModel {
        @NameInMap("Counter")
        public java.util.List<QueryCensorJobListResponseBodyCensorJobListCensorJobCensorPornResultPornCounterListCounter> counter;

        public static QueryCensorJobListResponseBodyCensorJobListCensorJobCensorPornResultPornCounterList build(java.util.Map<String, ?> map) throws Exception {
            QueryCensorJobListResponseBodyCensorJobListCensorJobCensorPornResultPornCounterList self = new QueryCensorJobListResponseBodyCensorJobListCensorJobCensorPornResultPornCounterList();
            return TeaModel.build(map, self);
        }

        public QueryCensorJobListResponseBodyCensorJobListCensorJobCensorPornResultPornCounterList setCounter(java.util.List<QueryCensorJobListResponseBodyCensorJobListCensorJobCensorPornResultPornCounterListCounter> counter) {
            this.counter = counter;
            return this;
        }
        public java.util.List<QueryCensorJobListResponseBodyCensorJobListCensorJobCensorPornResultPornCounterListCounter> getCounter() {
            return this.counter;
        }

    }

    public static class QueryCensorJobListResponseBodyCensorJobListCensorJobCensorPornResultPornTopListTop extends TeaModel {
        @NameInMap("Index")
        public String index;

        @NameInMap("Score")
        public String score;

        @NameInMap("Timestamp")
        public String timestamp;

        @NameInMap("Object")
        public String object;

        @NameInMap("Label")
        public String label;

        public static QueryCensorJobListResponseBodyCensorJobListCensorJobCensorPornResultPornTopListTop build(java.util.Map<String, ?> map) throws Exception {
            QueryCensorJobListResponseBodyCensorJobListCensorJobCensorPornResultPornTopListTop self = new QueryCensorJobListResponseBodyCensorJobListCensorJobCensorPornResultPornTopListTop();
            return TeaModel.build(map, self);
        }

        public QueryCensorJobListResponseBodyCensorJobListCensorJobCensorPornResultPornTopListTop setIndex(String index) {
            this.index = index;
            return this;
        }
        public String getIndex() {
            return this.index;
        }

        public QueryCensorJobListResponseBodyCensorJobListCensorJobCensorPornResultPornTopListTop setScore(String score) {
            this.score = score;
            return this;
        }
        public String getScore() {
            return this.score;
        }

        public QueryCensorJobListResponseBodyCensorJobListCensorJobCensorPornResultPornTopListTop setTimestamp(String timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public String getTimestamp() {
            return this.timestamp;
        }

        public QueryCensorJobListResponseBodyCensorJobListCensorJobCensorPornResultPornTopListTop setObject(String object) {
            this.object = object;
            return this;
        }
        public String getObject() {
            return this.object;
        }

        public QueryCensorJobListResponseBodyCensorJobListCensorJobCensorPornResultPornTopListTop setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

    }

    public static class QueryCensorJobListResponseBodyCensorJobListCensorJobCensorPornResultPornTopList extends TeaModel {
        @NameInMap("Top")
        public java.util.List<QueryCensorJobListResponseBodyCensorJobListCensorJobCensorPornResultPornTopListTop> top;

        public static QueryCensorJobListResponseBodyCensorJobListCensorJobCensorPornResultPornTopList build(java.util.Map<String, ?> map) throws Exception {
            QueryCensorJobListResponseBodyCensorJobListCensorJobCensorPornResultPornTopList self = new QueryCensorJobListResponseBodyCensorJobListCensorJobCensorPornResultPornTopList();
            return TeaModel.build(map, self);
        }

        public QueryCensorJobListResponseBodyCensorJobListCensorJobCensorPornResultPornTopList setTop(java.util.List<QueryCensorJobListResponseBodyCensorJobListCensorJobCensorPornResultPornTopListTop> top) {
            this.top = top;
            return this;
        }
        public java.util.List<QueryCensorJobListResponseBodyCensorJobListCensorJobCensorPornResultPornTopListTop> getTop() {
            return this.top;
        }

    }

    public static class QueryCensorJobListResponseBodyCensorJobListCensorJobCensorPornResult extends TeaModel {
        @NameInMap("PornCounterList")
        public QueryCensorJobListResponseBodyCensorJobListCensorJobCensorPornResultPornCounterList pornCounterList;

        @NameInMap("Suggestion")
        public String suggestion;

        @NameInMap("AverageScore")
        public String averageScore;

        @NameInMap("PornTopList")
        public QueryCensorJobListResponseBodyCensorJobListCensorJobCensorPornResultPornTopList pornTopList;

        @NameInMap("Label")
        public String label;

        @NameInMap("MaxScore")
        public String maxScore;

        public static QueryCensorJobListResponseBodyCensorJobListCensorJobCensorPornResult build(java.util.Map<String, ?> map) throws Exception {
            QueryCensorJobListResponseBodyCensorJobListCensorJobCensorPornResult self = new QueryCensorJobListResponseBodyCensorJobListCensorJobCensorPornResult();
            return TeaModel.build(map, self);
        }

        public QueryCensorJobListResponseBodyCensorJobListCensorJobCensorPornResult setPornCounterList(QueryCensorJobListResponseBodyCensorJobListCensorJobCensorPornResultPornCounterList pornCounterList) {
            this.pornCounterList = pornCounterList;
            return this;
        }
        public QueryCensorJobListResponseBodyCensorJobListCensorJobCensorPornResultPornCounterList getPornCounterList() {
            return this.pornCounterList;
        }

        public QueryCensorJobListResponseBodyCensorJobListCensorJobCensorPornResult setSuggestion(String suggestion) {
            this.suggestion = suggestion;
            return this;
        }
        public String getSuggestion() {
            return this.suggestion;
        }

        public QueryCensorJobListResponseBodyCensorJobListCensorJobCensorPornResult setAverageScore(String averageScore) {
            this.averageScore = averageScore;
            return this;
        }
        public String getAverageScore() {
            return this.averageScore;
        }

        public QueryCensorJobListResponseBodyCensorJobListCensorJobCensorPornResult setPornTopList(QueryCensorJobListResponseBodyCensorJobListCensorJobCensorPornResultPornTopList pornTopList) {
            this.pornTopList = pornTopList;
            return this;
        }
        public QueryCensorJobListResponseBodyCensorJobListCensorJobCensorPornResultPornTopList getPornTopList() {
            return this.pornTopList;
        }

        public QueryCensorJobListResponseBodyCensorJobListCensorJobCensorPornResult setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public QueryCensorJobListResponseBodyCensorJobListCensorJobCensorPornResult setMaxScore(String maxScore) {
            this.maxScore = maxScore;
            return this;
        }
        public String getMaxScore() {
            return this.maxScore;
        }

    }

    public static class QueryCensorJobListResponseBodyCensorJobListCensorJob extends TeaModel {
        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("State")
        public String state;

        @NameInMap("CensorTerrorismResult")
        public QueryCensorJobListResponseBodyCensorJobListCensorJobCensorTerrorismResult censorTerrorismResult;

        @NameInMap("ImageCensorResults")
        public QueryCensorJobListResponseBodyCensorJobListCensorJobImageCensorResults imageCensorResults;

        @NameInMap("TitleCensorResult")
        public String titleCensorResult;

        @NameInMap("Message")
        public String message;

        @NameInMap("Input")
        public QueryCensorJobListResponseBodyCensorJobListCensorJobInput input;

        @NameInMap("BarrageCensorResult")
        public String barrageCensorResult;

        @NameInMap("DescCensorResult")
        public String descCensorResult;

        @NameInMap("ResultSaveObject")
        public String resultSaveObject;

        @NameInMap("CensorConfig")
        public QueryCensorJobListResponseBodyCensorJobListCensorJobCensorConfig censorConfig;

        @NameInMap("UserData")
        public String userData;

        @NameInMap("Code")
        public String code;

        @NameInMap("CensorPornResult")
        public QueryCensorJobListResponseBodyCensorJobListCensorJobCensorPornResult censorPornResult;

        @NameInMap("PipelineId")
        public String pipelineId;

        @NameInMap("Id")
        public String id;

        public static QueryCensorJobListResponseBodyCensorJobListCensorJob build(java.util.Map<String, ?> map) throws Exception {
            QueryCensorJobListResponseBodyCensorJobListCensorJob self = new QueryCensorJobListResponseBodyCensorJobListCensorJob();
            return TeaModel.build(map, self);
        }

        public QueryCensorJobListResponseBodyCensorJobListCensorJob setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public QueryCensorJobListResponseBodyCensorJobListCensorJob setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public QueryCensorJobListResponseBodyCensorJobListCensorJob setCensorTerrorismResult(QueryCensorJobListResponseBodyCensorJobListCensorJobCensorTerrorismResult censorTerrorismResult) {
            this.censorTerrorismResult = censorTerrorismResult;
            return this;
        }
        public QueryCensorJobListResponseBodyCensorJobListCensorJobCensorTerrorismResult getCensorTerrorismResult() {
            return this.censorTerrorismResult;
        }

        public QueryCensorJobListResponseBodyCensorJobListCensorJob setImageCensorResults(QueryCensorJobListResponseBodyCensorJobListCensorJobImageCensorResults imageCensorResults) {
            this.imageCensorResults = imageCensorResults;
            return this;
        }
        public QueryCensorJobListResponseBodyCensorJobListCensorJobImageCensorResults getImageCensorResults() {
            return this.imageCensorResults;
        }

        public QueryCensorJobListResponseBodyCensorJobListCensorJob setTitleCensorResult(String titleCensorResult) {
            this.titleCensorResult = titleCensorResult;
            return this;
        }
        public String getTitleCensorResult() {
            return this.titleCensorResult;
        }

        public QueryCensorJobListResponseBodyCensorJobListCensorJob setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public QueryCensorJobListResponseBodyCensorJobListCensorJob setInput(QueryCensorJobListResponseBodyCensorJobListCensorJobInput input) {
            this.input = input;
            return this;
        }
        public QueryCensorJobListResponseBodyCensorJobListCensorJobInput getInput() {
            return this.input;
        }

        public QueryCensorJobListResponseBodyCensorJobListCensorJob setBarrageCensorResult(String barrageCensorResult) {
            this.barrageCensorResult = barrageCensorResult;
            return this;
        }
        public String getBarrageCensorResult() {
            return this.barrageCensorResult;
        }

        public QueryCensorJobListResponseBodyCensorJobListCensorJob setDescCensorResult(String descCensorResult) {
            this.descCensorResult = descCensorResult;
            return this;
        }
        public String getDescCensorResult() {
            return this.descCensorResult;
        }

        public QueryCensorJobListResponseBodyCensorJobListCensorJob setResultSaveObject(String resultSaveObject) {
            this.resultSaveObject = resultSaveObject;
            return this;
        }
        public String getResultSaveObject() {
            return this.resultSaveObject;
        }

        public QueryCensorJobListResponseBodyCensorJobListCensorJob setCensorConfig(QueryCensorJobListResponseBodyCensorJobListCensorJobCensorConfig censorConfig) {
            this.censorConfig = censorConfig;
            return this;
        }
        public QueryCensorJobListResponseBodyCensorJobListCensorJobCensorConfig getCensorConfig() {
            return this.censorConfig;
        }

        public QueryCensorJobListResponseBodyCensorJobListCensorJob setUserData(String userData) {
            this.userData = userData;
            return this;
        }
        public String getUserData() {
            return this.userData;
        }

        public QueryCensorJobListResponseBodyCensorJobListCensorJob setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryCensorJobListResponseBodyCensorJobListCensorJob setCensorPornResult(QueryCensorJobListResponseBodyCensorJobListCensorJobCensorPornResult censorPornResult) {
            this.censorPornResult = censorPornResult;
            return this;
        }
        public QueryCensorJobListResponseBodyCensorJobListCensorJobCensorPornResult getCensorPornResult() {
            return this.censorPornResult;
        }

        public QueryCensorJobListResponseBodyCensorJobListCensorJob setPipelineId(String pipelineId) {
            this.pipelineId = pipelineId;
            return this;
        }
        public String getPipelineId() {
            return this.pipelineId;
        }

        public QueryCensorJobListResponseBodyCensorJobListCensorJob setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

    public static class QueryCensorJobListResponseBodyCensorJobList extends TeaModel {
        @NameInMap("CensorJob")
        public java.util.List<QueryCensorJobListResponseBodyCensorJobListCensorJob> censorJob;

        public static QueryCensorJobListResponseBodyCensorJobList build(java.util.Map<String, ?> map) throws Exception {
            QueryCensorJobListResponseBodyCensorJobList self = new QueryCensorJobListResponseBodyCensorJobList();
            return TeaModel.build(map, self);
        }

        public QueryCensorJobListResponseBodyCensorJobList setCensorJob(java.util.List<QueryCensorJobListResponseBodyCensorJobListCensorJob> censorJob) {
            this.censorJob = censorJob;
            return this;
        }
        public java.util.List<QueryCensorJobListResponseBodyCensorJobListCensorJob> getCensorJob() {
            return this.censorJob;
        }

    }

    public static class QueryCensorJobListResponseBodyNonExistIds extends TeaModel {
        @NameInMap("String")
        public java.util.List<String> string;

        public static QueryCensorJobListResponseBodyNonExistIds build(java.util.Map<String, ?> map) throws Exception {
            QueryCensorJobListResponseBodyNonExistIds self = new QueryCensorJobListResponseBodyNonExistIds();
            return TeaModel.build(map, self);
        }

        public QueryCensorJobListResponseBodyNonExistIds setString(java.util.List<String> string) {
            this.string = string;
            return this;
        }
        public java.util.List<String> getString() {
            return this.string;
        }

    }

}
