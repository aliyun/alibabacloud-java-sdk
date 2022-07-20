// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class QueryCensorJobListResponseBody extends TeaModel {
    @NameInMap("Jobs")
    public QueryCensorJobListResponseBodyJobs jobs;

    @NameInMap("NonExistIds")
    public QueryCensorJobListResponseBodyNonExistIds nonExistIds;

    @NameInMap("RequestId")
    public String requestId;

    public static QueryCensorJobListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryCensorJobListResponseBody self = new QueryCensorJobListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryCensorJobListResponseBody setJobs(QueryCensorJobListResponseBodyJobs jobs) {
        this.jobs = jobs;
        return this;
    }
    public QueryCensorJobListResponseBodyJobs getJobs() {
        return this.jobs;
    }

    public QueryCensorJobListResponseBody setNonExistIds(QueryCensorJobListResponseBodyNonExistIds nonExistIds) {
        this.nonExistIds = nonExistIds;
        return this;
    }
    public QueryCensorJobListResponseBodyNonExistIds getNonExistIds() {
        return this.nonExistIds;
    }

    public QueryCensorJobListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class QueryCensorJobListResponseBodyJobsCensorJobCensorConfigOutputFile extends TeaModel {
        @NameInMap("Bucket")
        public String bucket;

        @NameInMap("Location")
        public String location;

        @NameInMap("Object")
        public String object;

        public static QueryCensorJobListResponseBodyJobsCensorJobCensorConfigOutputFile build(java.util.Map<String, ?> map) throws Exception {
            QueryCensorJobListResponseBodyJobsCensorJobCensorConfigOutputFile self = new QueryCensorJobListResponseBodyJobsCensorJobCensorConfigOutputFile();
            return TeaModel.build(map, self);
        }

        public QueryCensorJobListResponseBodyJobsCensorJobCensorConfigOutputFile setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

        public QueryCensorJobListResponseBodyJobsCensorJobCensorConfigOutputFile setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public QueryCensorJobListResponseBodyJobsCensorJobCensorConfigOutputFile setObject(String object) {
            this.object = object;
            return this;
        }
        public String getObject() {
            return this.object;
        }

    }

    public static class QueryCensorJobListResponseBodyJobsCensorJobCensorConfig extends TeaModel {
        @NameInMap("BizType")
        public String bizType;

        @NameInMap("Interval")
        public String interval;

        @NameInMap("OutputFile")
        public QueryCensorJobListResponseBodyJobsCensorJobCensorConfigOutputFile outputFile;

        @NameInMap("SaveType")
        public String saveType;

        @NameInMap("Scenes")
        public String scenes;

        public static QueryCensorJobListResponseBodyJobsCensorJobCensorConfig build(java.util.Map<String, ?> map) throws Exception {
            QueryCensorJobListResponseBodyJobsCensorJobCensorConfig self = new QueryCensorJobListResponseBodyJobsCensorJobCensorConfig();
            return TeaModel.build(map, self);
        }

        public QueryCensorJobListResponseBodyJobsCensorJobCensorConfig setBizType(String bizType) {
            this.bizType = bizType;
            return this;
        }
        public String getBizType() {
            return this.bizType;
        }

        public QueryCensorJobListResponseBodyJobsCensorJobCensorConfig setInterval(String interval) {
            this.interval = interval;
            return this;
        }
        public String getInterval() {
            return this.interval;
        }

        public QueryCensorJobListResponseBodyJobsCensorJobCensorConfig setOutputFile(QueryCensorJobListResponseBodyJobsCensorJobCensorConfigOutputFile outputFile) {
            this.outputFile = outputFile;
            return this;
        }
        public QueryCensorJobListResponseBodyJobsCensorJobCensorConfigOutputFile getOutputFile() {
            return this.outputFile;
        }

        public QueryCensorJobListResponseBodyJobsCensorJobCensorConfig setSaveType(String saveType) {
            this.saveType = saveType;
            return this;
        }
        public String getSaveType() {
            return this.saveType;
        }

        public QueryCensorJobListResponseBodyJobsCensorJobCensorConfig setScenes(String scenes) {
            this.scenes = scenes;
            return this;
        }
        public String getScenes() {
            return this.scenes;
        }

    }

    public static class QueryCensorJobListResponseBodyJobsCensorJobCensorPornResultPornCounterListCounter extends TeaModel {
        @NameInMap("Count")
        public Integer count;

        @NameInMap("Label")
        public String label;

        public static QueryCensorJobListResponseBodyJobsCensorJobCensorPornResultPornCounterListCounter build(java.util.Map<String, ?> map) throws Exception {
            QueryCensorJobListResponseBodyJobsCensorJobCensorPornResultPornCounterListCounter self = new QueryCensorJobListResponseBodyJobsCensorJobCensorPornResultPornCounterListCounter();
            return TeaModel.build(map, self);
        }

        public QueryCensorJobListResponseBodyJobsCensorJobCensorPornResultPornCounterListCounter setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public QueryCensorJobListResponseBodyJobsCensorJobCensorPornResultPornCounterListCounter setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

    }

    public static class QueryCensorJobListResponseBodyJobsCensorJobCensorPornResultPornCounterList extends TeaModel {
        @NameInMap("Counter")
        public java.util.List<QueryCensorJobListResponseBodyJobsCensorJobCensorPornResultPornCounterListCounter> counter;

        public static QueryCensorJobListResponseBodyJobsCensorJobCensorPornResultPornCounterList build(java.util.Map<String, ?> map) throws Exception {
            QueryCensorJobListResponseBodyJobsCensorJobCensorPornResultPornCounterList self = new QueryCensorJobListResponseBodyJobsCensorJobCensorPornResultPornCounterList();
            return TeaModel.build(map, self);
        }

        public QueryCensorJobListResponseBodyJobsCensorJobCensorPornResultPornCounterList setCounter(java.util.List<QueryCensorJobListResponseBodyJobsCensorJobCensorPornResultPornCounterListCounter> counter) {
            this.counter = counter;
            return this;
        }
        public java.util.List<QueryCensorJobListResponseBodyJobsCensorJobCensorPornResultPornCounterListCounter> getCounter() {
            return this.counter;
        }

    }

    public static class QueryCensorJobListResponseBodyJobsCensorJobCensorPornResultPornTopListTop extends TeaModel {
        @NameInMap("Index")
        public String index;

        @NameInMap("Label")
        public String label;

        @NameInMap("Object")
        public String object;

        @NameInMap("Score")
        public String score;

        @NameInMap("Timestamp")
        public String timestamp;

        public static QueryCensorJobListResponseBodyJobsCensorJobCensorPornResultPornTopListTop build(java.util.Map<String, ?> map) throws Exception {
            QueryCensorJobListResponseBodyJobsCensorJobCensorPornResultPornTopListTop self = new QueryCensorJobListResponseBodyJobsCensorJobCensorPornResultPornTopListTop();
            return TeaModel.build(map, self);
        }

        public QueryCensorJobListResponseBodyJobsCensorJobCensorPornResultPornTopListTop setIndex(String index) {
            this.index = index;
            return this;
        }
        public String getIndex() {
            return this.index;
        }

        public QueryCensorJobListResponseBodyJobsCensorJobCensorPornResultPornTopListTop setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public QueryCensorJobListResponseBodyJobsCensorJobCensorPornResultPornTopListTop setObject(String object) {
            this.object = object;
            return this;
        }
        public String getObject() {
            return this.object;
        }

        public QueryCensorJobListResponseBodyJobsCensorJobCensorPornResultPornTopListTop setScore(String score) {
            this.score = score;
            return this;
        }
        public String getScore() {
            return this.score;
        }

        public QueryCensorJobListResponseBodyJobsCensorJobCensorPornResultPornTopListTop setTimestamp(String timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public String getTimestamp() {
            return this.timestamp;
        }

    }

    public static class QueryCensorJobListResponseBodyJobsCensorJobCensorPornResultPornTopList extends TeaModel {
        @NameInMap("Top")
        public java.util.List<QueryCensorJobListResponseBodyJobsCensorJobCensorPornResultPornTopListTop> top;

        public static QueryCensorJobListResponseBodyJobsCensorJobCensorPornResultPornTopList build(java.util.Map<String, ?> map) throws Exception {
            QueryCensorJobListResponseBodyJobsCensorJobCensorPornResultPornTopList self = new QueryCensorJobListResponseBodyJobsCensorJobCensorPornResultPornTopList();
            return TeaModel.build(map, self);
        }

        public QueryCensorJobListResponseBodyJobsCensorJobCensorPornResultPornTopList setTop(java.util.List<QueryCensorJobListResponseBodyJobsCensorJobCensorPornResultPornTopListTop> top) {
            this.top = top;
            return this;
        }
        public java.util.List<QueryCensorJobListResponseBodyJobsCensorJobCensorPornResultPornTopListTop> getTop() {
            return this.top;
        }

    }

    public static class QueryCensorJobListResponseBodyJobsCensorJobCensorPornResult extends TeaModel {
        @NameInMap("AverageScore")
        public String averageScore;

        @NameInMap("Label")
        public String label;

        @NameInMap("MaxScore")
        public String maxScore;

        @NameInMap("PornCounterList")
        public QueryCensorJobListResponseBodyJobsCensorJobCensorPornResultPornCounterList pornCounterList;

        @NameInMap("PornTopList")
        public QueryCensorJobListResponseBodyJobsCensorJobCensorPornResultPornTopList pornTopList;

        @NameInMap("Suggestion")
        public String suggestion;

        public static QueryCensorJobListResponseBodyJobsCensorJobCensorPornResult build(java.util.Map<String, ?> map) throws Exception {
            QueryCensorJobListResponseBodyJobsCensorJobCensorPornResult self = new QueryCensorJobListResponseBodyJobsCensorJobCensorPornResult();
            return TeaModel.build(map, self);
        }

        public QueryCensorJobListResponseBodyJobsCensorJobCensorPornResult setAverageScore(String averageScore) {
            this.averageScore = averageScore;
            return this;
        }
        public String getAverageScore() {
            return this.averageScore;
        }

        public QueryCensorJobListResponseBodyJobsCensorJobCensorPornResult setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public QueryCensorJobListResponseBodyJobsCensorJobCensorPornResult setMaxScore(String maxScore) {
            this.maxScore = maxScore;
            return this;
        }
        public String getMaxScore() {
            return this.maxScore;
        }

        public QueryCensorJobListResponseBodyJobsCensorJobCensorPornResult setPornCounterList(QueryCensorJobListResponseBodyJobsCensorJobCensorPornResultPornCounterList pornCounterList) {
            this.pornCounterList = pornCounterList;
            return this;
        }
        public QueryCensorJobListResponseBodyJobsCensorJobCensorPornResultPornCounterList getPornCounterList() {
            return this.pornCounterList;
        }

        public QueryCensorJobListResponseBodyJobsCensorJobCensorPornResult setPornTopList(QueryCensorJobListResponseBodyJobsCensorJobCensorPornResultPornTopList pornTopList) {
            this.pornTopList = pornTopList;
            return this;
        }
        public QueryCensorJobListResponseBodyJobsCensorJobCensorPornResultPornTopList getPornTopList() {
            return this.pornTopList;
        }

        public QueryCensorJobListResponseBodyJobsCensorJobCensorPornResult setSuggestion(String suggestion) {
            this.suggestion = suggestion;
            return this;
        }
        public String getSuggestion() {
            return this.suggestion;
        }

    }

    public static class QueryCensorJobListResponseBodyJobsCensorJobCensorTerrorismResultTerrorismCounterListCounter extends TeaModel {
        @NameInMap("Count")
        public Integer count;

        @NameInMap("Label")
        public String label;

        public static QueryCensorJobListResponseBodyJobsCensorJobCensorTerrorismResultTerrorismCounterListCounter build(java.util.Map<String, ?> map) throws Exception {
            QueryCensorJobListResponseBodyJobsCensorJobCensorTerrorismResultTerrorismCounterListCounter self = new QueryCensorJobListResponseBodyJobsCensorJobCensorTerrorismResultTerrorismCounterListCounter();
            return TeaModel.build(map, self);
        }

        public QueryCensorJobListResponseBodyJobsCensorJobCensorTerrorismResultTerrorismCounterListCounter setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public QueryCensorJobListResponseBodyJobsCensorJobCensorTerrorismResultTerrorismCounterListCounter setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

    }

    public static class QueryCensorJobListResponseBodyJobsCensorJobCensorTerrorismResultTerrorismCounterList extends TeaModel {
        @NameInMap("Counter")
        public java.util.List<QueryCensorJobListResponseBodyJobsCensorJobCensorTerrorismResultTerrorismCounterListCounter> counter;

        public static QueryCensorJobListResponseBodyJobsCensorJobCensorTerrorismResultTerrorismCounterList build(java.util.Map<String, ?> map) throws Exception {
            QueryCensorJobListResponseBodyJobsCensorJobCensorTerrorismResultTerrorismCounterList self = new QueryCensorJobListResponseBodyJobsCensorJobCensorTerrorismResultTerrorismCounterList();
            return TeaModel.build(map, self);
        }

        public QueryCensorJobListResponseBodyJobsCensorJobCensorTerrorismResultTerrorismCounterList setCounter(java.util.List<QueryCensorJobListResponseBodyJobsCensorJobCensorTerrorismResultTerrorismCounterListCounter> counter) {
            this.counter = counter;
            return this;
        }
        public java.util.List<QueryCensorJobListResponseBodyJobsCensorJobCensorTerrorismResultTerrorismCounterListCounter> getCounter() {
            return this.counter;
        }

    }

    public static class QueryCensorJobListResponseBodyJobsCensorJobCensorTerrorismResultTerrorismTopListTop extends TeaModel {
        @NameInMap("Index")
        public String index;

        @NameInMap("Label")
        public String label;

        @NameInMap("Object")
        public String object;

        @NameInMap("Score")
        public String score;

        @NameInMap("Timestamp")
        public String timestamp;

        public static QueryCensorJobListResponseBodyJobsCensorJobCensorTerrorismResultTerrorismTopListTop build(java.util.Map<String, ?> map) throws Exception {
            QueryCensorJobListResponseBodyJobsCensorJobCensorTerrorismResultTerrorismTopListTop self = new QueryCensorJobListResponseBodyJobsCensorJobCensorTerrorismResultTerrorismTopListTop();
            return TeaModel.build(map, self);
        }

        public QueryCensorJobListResponseBodyJobsCensorJobCensorTerrorismResultTerrorismTopListTop setIndex(String index) {
            this.index = index;
            return this;
        }
        public String getIndex() {
            return this.index;
        }

        public QueryCensorJobListResponseBodyJobsCensorJobCensorTerrorismResultTerrorismTopListTop setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public QueryCensorJobListResponseBodyJobsCensorJobCensorTerrorismResultTerrorismTopListTop setObject(String object) {
            this.object = object;
            return this;
        }
        public String getObject() {
            return this.object;
        }

        public QueryCensorJobListResponseBodyJobsCensorJobCensorTerrorismResultTerrorismTopListTop setScore(String score) {
            this.score = score;
            return this;
        }
        public String getScore() {
            return this.score;
        }

        public QueryCensorJobListResponseBodyJobsCensorJobCensorTerrorismResultTerrorismTopListTop setTimestamp(String timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public String getTimestamp() {
            return this.timestamp;
        }

    }

    public static class QueryCensorJobListResponseBodyJobsCensorJobCensorTerrorismResultTerrorismTopList extends TeaModel {
        @NameInMap("Top")
        public java.util.List<QueryCensorJobListResponseBodyJobsCensorJobCensorTerrorismResultTerrorismTopListTop> top;

        public static QueryCensorJobListResponseBodyJobsCensorJobCensorTerrorismResultTerrorismTopList build(java.util.Map<String, ?> map) throws Exception {
            QueryCensorJobListResponseBodyJobsCensorJobCensorTerrorismResultTerrorismTopList self = new QueryCensorJobListResponseBodyJobsCensorJobCensorTerrorismResultTerrorismTopList();
            return TeaModel.build(map, self);
        }

        public QueryCensorJobListResponseBodyJobsCensorJobCensorTerrorismResultTerrorismTopList setTop(java.util.List<QueryCensorJobListResponseBodyJobsCensorJobCensorTerrorismResultTerrorismTopListTop> top) {
            this.top = top;
            return this;
        }
        public java.util.List<QueryCensorJobListResponseBodyJobsCensorJobCensorTerrorismResultTerrorismTopListTop> getTop() {
            return this.top;
        }

    }

    public static class QueryCensorJobListResponseBodyJobsCensorJobCensorTerrorismResult extends TeaModel {
        @NameInMap("AverageScore")
        public String averageScore;

        @NameInMap("Label")
        public String label;

        @NameInMap("MaxScore")
        public String maxScore;

        @NameInMap("Suggestion")
        public String suggestion;

        @NameInMap("TerrorismCounterList")
        public QueryCensorJobListResponseBodyJobsCensorJobCensorTerrorismResultTerrorismCounterList terrorismCounterList;

        @NameInMap("TerrorismTopList")
        public QueryCensorJobListResponseBodyJobsCensorJobCensorTerrorismResultTerrorismTopList terrorismTopList;

        public static QueryCensorJobListResponseBodyJobsCensorJobCensorTerrorismResult build(java.util.Map<String, ?> map) throws Exception {
            QueryCensorJobListResponseBodyJobsCensorJobCensorTerrorismResult self = new QueryCensorJobListResponseBodyJobsCensorJobCensorTerrorismResult();
            return TeaModel.build(map, self);
        }

        public QueryCensorJobListResponseBodyJobsCensorJobCensorTerrorismResult setAverageScore(String averageScore) {
            this.averageScore = averageScore;
            return this;
        }
        public String getAverageScore() {
            return this.averageScore;
        }

        public QueryCensorJobListResponseBodyJobsCensorJobCensorTerrorismResult setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public QueryCensorJobListResponseBodyJobsCensorJobCensorTerrorismResult setMaxScore(String maxScore) {
            this.maxScore = maxScore;
            return this;
        }
        public String getMaxScore() {
            return this.maxScore;
        }

        public QueryCensorJobListResponseBodyJobsCensorJobCensorTerrorismResult setSuggestion(String suggestion) {
            this.suggestion = suggestion;
            return this;
        }
        public String getSuggestion() {
            return this.suggestion;
        }

        public QueryCensorJobListResponseBodyJobsCensorJobCensorTerrorismResult setTerrorismCounterList(QueryCensorJobListResponseBodyJobsCensorJobCensorTerrorismResultTerrorismCounterList terrorismCounterList) {
            this.terrorismCounterList = terrorismCounterList;
            return this;
        }
        public QueryCensorJobListResponseBodyJobsCensorJobCensorTerrorismResultTerrorismCounterList getTerrorismCounterList() {
            return this.terrorismCounterList;
        }

        public QueryCensorJobListResponseBodyJobsCensorJobCensorTerrorismResult setTerrorismTopList(QueryCensorJobListResponseBodyJobsCensorJobCensorTerrorismResultTerrorismTopList terrorismTopList) {
            this.terrorismTopList = terrorismTopList;
            return this;
        }
        public QueryCensorJobListResponseBodyJobsCensorJobCensorTerrorismResultTerrorismTopList getTerrorismTopList() {
            return this.terrorismTopList;
        }

    }

    public static class QueryCensorJobListResponseBodyJobsCensorJobImageCensorResultsImageCensorResult extends TeaModel {
        @NameInMap("ImageBucket")
        public String imageBucket;

        @NameInMap("ImageLocation")
        public String imageLocation;

        @NameInMap("ImageObject")
        public String imageObject;

        @NameInMap("Result")
        public String result;

        public static QueryCensorJobListResponseBodyJobsCensorJobImageCensorResultsImageCensorResult build(java.util.Map<String, ?> map) throws Exception {
            QueryCensorJobListResponseBodyJobsCensorJobImageCensorResultsImageCensorResult self = new QueryCensorJobListResponseBodyJobsCensorJobImageCensorResultsImageCensorResult();
            return TeaModel.build(map, self);
        }

        public QueryCensorJobListResponseBodyJobsCensorJobImageCensorResultsImageCensorResult setImageBucket(String imageBucket) {
            this.imageBucket = imageBucket;
            return this;
        }
        public String getImageBucket() {
            return this.imageBucket;
        }

        public QueryCensorJobListResponseBodyJobsCensorJobImageCensorResultsImageCensorResult setImageLocation(String imageLocation) {
            this.imageLocation = imageLocation;
            return this;
        }
        public String getImageLocation() {
            return this.imageLocation;
        }

        public QueryCensorJobListResponseBodyJobsCensorJobImageCensorResultsImageCensorResult setImageObject(String imageObject) {
            this.imageObject = imageObject;
            return this;
        }
        public String getImageObject() {
            return this.imageObject;
        }

        public QueryCensorJobListResponseBodyJobsCensorJobImageCensorResultsImageCensorResult setResult(String result) {
            this.result = result;
            return this;
        }
        public String getResult() {
            return this.result;
        }

    }

    public static class QueryCensorJobListResponseBodyJobsCensorJobImageCensorResults extends TeaModel {
        @NameInMap("ImageCensorResult")
        public java.util.List<QueryCensorJobListResponseBodyJobsCensorJobImageCensorResultsImageCensorResult> imageCensorResult;

        public static QueryCensorJobListResponseBodyJobsCensorJobImageCensorResults build(java.util.Map<String, ?> map) throws Exception {
            QueryCensorJobListResponseBodyJobsCensorJobImageCensorResults self = new QueryCensorJobListResponseBodyJobsCensorJobImageCensorResults();
            return TeaModel.build(map, self);
        }

        public QueryCensorJobListResponseBodyJobsCensorJobImageCensorResults setImageCensorResult(java.util.List<QueryCensorJobListResponseBodyJobsCensorJobImageCensorResultsImageCensorResult> imageCensorResult) {
            this.imageCensorResult = imageCensorResult;
            return this;
        }
        public java.util.List<QueryCensorJobListResponseBodyJobsCensorJobImageCensorResultsImageCensorResult> getImageCensorResult() {
            return this.imageCensorResult;
        }

    }

    public static class QueryCensorJobListResponseBodyJobsCensorJobInput extends TeaModel {
        @NameInMap("Bucket")
        public String bucket;

        @NameInMap("Location")
        public String location;

        @NameInMap("Object")
        public String object;

        public static QueryCensorJobListResponseBodyJobsCensorJobInput build(java.util.Map<String, ?> map) throws Exception {
            QueryCensorJobListResponseBodyJobsCensorJobInput self = new QueryCensorJobListResponseBodyJobsCensorJobInput();
            return TeaModel.build(map, self);
        }

        public QueryCensorJobListResponseBodyJobsCensorJobInput setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

        public QueryCensorJobListResponseBodyJobsCensorJobInput setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public QueryCensorJobListResponseBodyJobsCensorJobInput setObject(String object) {
            this.object = object;
            return this;
        }
        public String getObject() {
            return this.object;
        }

    }

    public static class QueryCensorJobListResponseBodyJobsCensorJob extends TeaModel {
        @NameInMap("BarrageCensorResult")
        public String barrageCensorResult;

        @NameInMap("CensorConfig")
        public QueryCensorJobListResponseBodyJobsCensorJobCensorConfig censorConfig;

        @NameInMap("CensorPornResult")
        public QueryCensorJobListResponseBodyJobsCensorJobCensorPornResult censorPornResult;

        @NameInMap("CensorTerrorismResult")
        public QueryCensorJobListResponseBodyJobsCensorJobCensorTerrorismResult censorTerrorismResult;

        @NameInMap("Code")
        public String code;

        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("DescCensorResult")
        public String descCensorResult;

        @NameInMap("Id")
        public String id;

        @NameInMap("ImageCensorResults")
        public QueryCensorJobListResponseBodyJobsCensorJobImageCensorResults imageCensorResults;

        @NameInMap("Input")
        public QueryCensorJobListResponseBodyJobsCensorJobInput input;

        @NameInMap("Message")
        public String message;

        @NameInMap("PipelineId")
        public String pipelineId;

        @NameInMap("ResultSaveObject")
        public String resultSaveObject;

        @NameInMap("State")
        public String state;

        @NameInMap("TitleCensorResult")
        public String titleCensorResult;

        @NameInMap("UserData")
        public String userData;

        public static QueryCensorJobListResponseBodyJobsCensorJob build(java.util.Map<String, ?> map) throws Exception {
            QueryCensorJobListResponseBodyJobsCensorJob self = new QueryCensorJobListResponseBodyJobsCensorJob();
            return TeaModel.build(map, self);
        }

        public QueryCensorJobListResponseBodyJobsCensorJob setBarrageCensorResult(String barrageCensorResult) {
            this.barrageCensorResult = barrageCensorResult;
            return this;
        }
        public String getBarrageCensorResult() {
            return this.barrageCensorResult;
        }

        public QueryCensorJobListResponseBodyJobsCensorJob setCensorConfig(QueryCensorJobListResponseBodyJobsCensorJobCensorConfig censorConfig) {
            this.censorConfig = censorConfig;
            return this;
        }
        public QueryCensorJobListResponseBodyJobsCensorJobCensorConfig getCensorConfig() {
            return this.censorConfig;
        }

        public QueryCensorJobListResponseBodyJobsCensorJob setCensorPornResult(QueryCensorJobListResponseBodyJobsCensorJobCensorPornResult censorPornResult) {
            this.censorPornResult = censorPornResult;
            return this;
        }
        public QueryCensorJobListResponseBodyJobsCensorJobCensorPornResult getCensorPornResult() {
            return this.censorPornResult;
        }

        public QueryCensorJobListResponseBodyJobsCensorJob setCensorTerrorismResult(QueryCensorJobListResponseBodyJobsCensorJobCensorTerrorismResult censorTerrorismResult) {
            this.censorTerrorismResult = censorTerrorismResult;
            return this;
        }
        public QueryCensorJobListResponseBodyJobsCensorJobCensorTerrorismResult getCensorTerrorismResult() {
            return this.censorTerrorismResult;
        }

        public QueryCensorJobListResponseBodyJobsCensorJob setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryCensorJobListResponseBodyJobsCensorJob setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public QueryCensorJobListResponseBodyJobsCensorJob setDescCensorResult(String descCensorResult) {
            this.descCensorResult = descCensorResult;
            return this;
        }
        public String getDescCensorResult() {
            return this.descCensorResult;
        }

        public QueryCensorJobListResponseBodyJobsCensorJob setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryCensorJobListResponseBodyJobsCensorJob setImageCensorResults(QueryCensorJobListResponseBodyJobsCensorJobImageCensorResults imageCensorResults) {
            this.imageCensorResults = imageCensorResults;
            return this;
        }
        public QueryCensorJobListResponseBodyJobsCensorJobImageCensorResults getImageCensorResults() {
            return this.imageCensorResults;
        }

        public QueryCensorJobListResponseBodyJobsCensorJob setInput(QueryCensorJobListResponseBodyJobsCensorJobInput input) {
            this.input = input;
            return this;
        }
        public QueryCensorJobListResponseBodyJobsCensorJobInput getInput() {
            return this.input;
        }

        public QueryCensorJobListResponseBodyJobsCensorJob setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public QueryCensorJobListResponseBodyJobsCensorJob setPipelineId(String pipelineId) {
            this.pipelineId = pipelineId;
            return this;
        }
        public String getPipelineId() {
            return this.pipelineId;
        }

        public QueryCensorJobListResponseBodyJobsCensorJob setResultSaveObject(String resultSaveObject) {
            this.resultSaveObject = resultSaveObject;
            return this;
        }
        public String getResultSaveObject() {
            return this.resultSaveObject;
        }

        public QueryCensorJobListResponseBodyJobsCensorJob setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public QueryCensorJobListResponseBodyJobsCensorJob setTitleCensorResult(String titleCensorResult) {
            this.titleCensorResult = titleCensorResult;
            return this;
        }
        public String getTitleCensorResult() {
            return this.titleCensorResult;
        }

        public QueryCensorJobListResponseBodyJobsCensorJob setUserData(String userData) {
            this.userData = userData;
            return this;
        }
        public String getUserData() {
            return this.userData;
        }

    }

    public static class QueryCensorJobListResponseBodyJobs extends TeaModel {
        @NameInMap("CensorJob")
        public java.util.List<QueryCensorJobListResponseBodyJobsCensorJob> censorJob;

        public static QueryCensorJobListResponseBodyJobs build(java.util.Map<String, ?> map) throws Exception {
            QueryCensorJobListResponseBodyJobs self = new QueryCensorJobListResponseBodyJobs();
            return TeaModel.build(map, self);
        }

        public QueryCensorJobListResponseBodyJobs setCensorJob(java.util.List<QueryCensorJobListResponseBodyJobsCensorJob> censorJob) {
            this.censorJob = censorJob;
            return this;
        }
        public java.util.List<QueryCensorJobListResponseBodyJobsCensorJob> getCensorJob() {
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
