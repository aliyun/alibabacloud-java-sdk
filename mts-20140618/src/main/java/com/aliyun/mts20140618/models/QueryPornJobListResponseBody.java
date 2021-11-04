// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class QueryPornJobListResponseBody extends TeaModel {
    @NameInMap("NonExistIds")
    public QueryPornJobListResponseBodyNonExistIds nonExistIds;

    @NameInMap("PornJobList")
    public QueryPornJobListResponseBodyPornJobList pornJobList;

    @NameInMap("RequestId")
    public String requestId;

    public static QueryPornJobListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryPornJobListResponseBody self = new QueryPornJobListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryPornJobListResponseBody setNonExistIds(QueryPornJobListResponseBodyNonExistIds nonExistIds) {
        this.nonExistIds = nonExistIds;
        return this;
    }
    public QueryPornJobListResponseBodyNonExistIds getNonExistIds() {
        return this.nonExistIds;
    }

    public QueryPornJobListResponseBody setPornJobList(QueryPornJobListResponseBodyPornJobList pornJobList) {
        this.pornJobList = pornJobList;
        return this;
    }
    public QueryPornJobListResponseBodyPornJobList getPornJobList() {
        return this.pornJobList;
    }

    public QueryPornJobListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class QueryPornJobListResponseBodyNonExistIds extends TeaModel {
        @NameInMap("String")
        public java.util.List<String> string;

        public static QueryPornJobListResponseBodyNonExistIds build(java.util.Map<String, ?> map) throws Exception {
            QueryPornJobListResponseBodyNonExistIds self = new QueryPornJobListResponseBodyNonExistIds();
            return TeaModel.build(map, self);
        }

        public QueryPornJobListResponseBodyNonExistIds setString(java.util.List<String> string) {
            this.string = string;
            return this;
        }
        public java.util.List<String> getString() {
            return this.string;
        }

    }

    public static class QueryPornJobListResponseBodyPornJobListPornJobCensorPornResultPornCounterListCounter extends TeaModel {
        @NameInMap("Count")
        public Integer count;

        @NameInMap("Label")
        public String label;

        public static QueryPornJobListResponseBodyPornJobListPornJobCensorPornResultPornCounterListCounter build(java.util.Map<String, ?> map) throws Exception {
            QueryPornJobListResponseBodyPornJobListPornJobCensorPornResultPornCounterListCounter self = new QueryPornJobListResponseBodyPornJobListPornJobCensorPornResultPornCounterListCounter();
            return TeaModel.build(map, self);
        }

        public QueryPornJobListResponseBodyPornJobListPornJobCensorPornResultPornCounterListCounter setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public QueryPornJobListResponseBodyPornJobListPornJobCensorPornResultPornCounterListCounter setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

    }

    public static class QueryPornJobListResponseBodyPornJobListPornJobCensorPornResultPornCounterList extends TeaModel {
        @NameInMap("Counter")
        public java.util.List<QueryPornJobListResponseBodyPornJobListPornJobCensorPornResultPornCounterListCounter> counter;

        public static QueryPornJobListResponseBodyPornJobListPornJobCensorPornResultPornCounterList build(java.util.Map<String, ?> map) throws Exception {
            QueryPornJobListResponseBodyPornJobListPornJobCensorPornResultPornCounterList self = new QueryPornJobListResponseBodyPornJobListPornJobCensorPornResultPornCounterList();
            return TeaModel.build(map, self);
        }

        public QueryPornJobListResponseBodyPornJobListPornJobCensorPornResultPornCounterList setCounter(java.util.List<QueryPornJobListResponseBodyPornJobListPornJobCensorPornResultPornCounterListCounter> counter) {
            this.counter = counter;
            return this;
        }
        public java.util.List<QueryPornJobListResponseBodyPornJobListPornJobCensorPornResultPornCounterListCounter> getCounter() {
            return this.counter;
        }

    }

    public static class QueryPornJobListResponseBodyPornJobListPornJobCensorPornResultPornTopListTop extends TeaModel {
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

        public static QueryPornJobListResponseBodyPornJobListPornJobCensorPornResultPornTopListTop build(java.util.Map<String, ?> map) throws Exception {
            QueryPornJobListResponseBodyPornJobListPornJobCensorPornResultPornTopListTop self = new QueryPornJobListResponseBodyPornJobListPornJobCensorPornResultPornTopListTop();
            return TeaModel.build(map, self);
        }

        public QueryPornJobListResponseBodyPornJobListPornJobCensorPornResultPornTopListTop setIndex(String index) {
            this.index = index;
            return this;
        }
        public String getIndex() {
            return this.index;
        }

        public QueryPornJobListResponseBodyPornJobListPornJobCensorPornResultPornTopListTop setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public QueryPornJobListResponseBodyPornJobListPornJobCensorPornResultPornTopListTop setObject(String object) {
            this.object = object;
            return this;
        }
        public String getObject() {
            return this.object;
        }

        public QueryPornJobListResponseBodyPornJobListPornJobCensorPornResultPornTopListTop setScore(String score) {
            this.score = score;
            return this;
        }
        public String getScore() {
            return this.score;
        }

        public QueryPornJobListResponseBodyPornJobListPornJobCensorPornResultPornTopListTop setTimestamp(String timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public String getTimestamp() {
            return this.timestamp;
        }

    }

    public static class QueryPornJobListResponseBodyPornJobListPornJobCensorPornResultPornTopList extends TeaModel {
        @NameInMap("Top")
        public java.util.List<QueryPornJobListResponseBodyPornJobListPornJobCensorPornResultPornTopListTop> top;

        public static QueryPornJobListResponseBodyPornJobListPornJobCensorPornResultPornTopList build(java.util.Map<String, ?> map) throws Exception {
            QueryPornJobListResponseBodyPornJobListPornJobCensorPornResultPornTopList self = new QueryPornJobListResponseBodyPornJobListPornJobCensorPornResultPornTopList();
            return TeaModel.build(map, self);
        }

        public QueryPornJobListResponseBodyPornJobListPornJobCensorPornResultPornTopList setTop(java.util.List<QueryPornJobListResponseBodyPornJobListPornJobCensorPornResultPornTopListTop> top) {
            this.top = top;
            return this;
        }
        public java.util.List<QueryPornJobListResponseBodyPornJobListPornJobCensorPornResultPornTopListTop> getTop() {
            return this.top;
        }

    }

    public static class QueryPornJobListResponseBodyPornJobListPornJobCensorPornResult extends TeaModel {
        @NameInMap("AverageScore")
        public String averageScore;

        @NameInMap("Label")
        public String label;

        @NameInMap("MaxScore")
        public String maxScore;

        @NameInMap("PornCounterList")
        public QueryPornJobListResponseBodyPornJobListPornJobCensorPornResultPornCounterList pornCounterList;

        @NameInMap("PornTopList")
        public QueryPornJobListResponseBodyPornJobListPornJobCensorPornResultPornTopList pornTopList;

        @NameInMap("Suggestion")
        public String suggestion;

        public static QueryPornJobListResponseBodyPornJobListPornJobCensorPornResult build(java.util.Map<String, ?> map) throws Exception {
            QueryPornJobListResponseBodyPornJobListPornJobCensorPornResult self = new QueryPornJobListResponseBodyPornJobListPornJobCensorPornResult();
            return TeaModel.build(map, self);
        }

        public QueryPornJobListResponseBodyPornJobListPornJobCensorPornResult setAverageScore(String averageScore) {
            this.averageScore = averageScore;
            return this;
        }
        public String getAverageScore() {
            return this.averageScore;
        }

        public QueryPornJobListResponseBodyPornJobListPornJobCensorPornResult setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public QueryPornJobListResponseBodyPornJobListPornJobCensorPornResult setMaxScore(String maxScore) {
            this.maxScore = maxScore;
            return this;
        }
        public String getMaxScore() {
            return this.maxScore;
        }

        public QueryPornJobListResponseBodyPornJobListPornJobCensorPornResult setPornCounterList(QueryPornJobListResponseBodyPornJobListPornJobCensorPornResultPornCounterList pornCounterList) {
            this.pornCounterList = pornCounterList;
            return this;
        }
        public QueryPornJobListResponseBodyPornJobListPornJobCensorPornResultPornCounterList getPornCounterList() {
            return this.pornCounterList;
        }

        public QueryPornJobListResponseBodyPornJobListPornJobCensorPornResult setPornTopList(QueryPornJobListResponseBodyPornJobListPornJobCensorPornResultPornTopList pornTopList) {
            this.pornTopList = pornTopList;
            return this;
        }
        public QueryPornJobListResponseBodyPornJobListPornJobCensorPornResultPornTopList getPornTopList() {
            return this.pornTopList;
        }

        public QueryPornJobListResponseBodyPornJobListPornJobCensorPornResult setSuggestion(String suggestion) {
            this.suggestion = suggestion;
            return this;
        }
        public String getSuggestion() {
            return this.suggestion;
        }

    }

    public static class QueryPornJobListResponseBodyPornJobListPornJobInput extends TeaModel {
        @NameInMap("Bucket")
        public String bucket;

        @NameInMap("Location")
        public String location;

        @NameInMap("Object")
        public String object;

        public static QueryPornJobListResponseBodyPornJobListPornJobInput build(java.util.Map<String, ?> map) throws Exception {
            QueryPornJobListResponseBodyPornJobListPornJobInput self = new QueryPornJobListResponseBodyPornJobListPornJobInput();
            return TeaModel.build(map, self);
        }

        public QueryPornJobListResponseBodyPornJobListPornJobInput setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

        public QueryPornJobListResponseBodyPornJobListPornJobInput setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public QueryPornJobListResponseBodyPornJobListPornJobInput setObject(String object) {
            this.object = object;
            return this;
        }
        public String getObject() {
            return this.object;
        }

    }

    public static class QueryPornJobListResponseBodyPornJobListPornJobPornConfigOutputFile extends TeaModel {
        @NameInMap("Bucket")
        public String bucket;

        @NameInMap("Location")
        public String location;

        @NameInMap("Object")
        public String object;

        public static QueryPornJobListResponseBodyPornJobListPornJobPornConfigOutputFile build(java.util.Map<String, ?> map) throws Exception {
            QueryPornJobListResponseBodyPornJobListPornJobPornConfigOutputFile self = new QueryPornJobListResponseBodyPornJobListPornJobPornConfigOutputFile();
            return TeaModel.build(map, self);
        }

        public QueryPornJobListResponseBodyPornJobListPornJobPornConfigOutputFile setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

        public QueryPornJobListResponseBodyPornJobListPornJobPornConfigOutputFile setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public QueryPornJobListResponseBodyPornJobListPornJobPornConfigOutputFile setObject(String object) {
            this.object = object;
            return this;
        }
        public String getObject() {
            return this.object;
        }

    }

    public static class QueryPornJobListResponseBodyPornJobListPornJobPornConfig extends TeaModel {
        @NameInMap("BizType")
        public String bizType;

        @NameInMap("Interval")
        public String interval;

        @NameInMap("OutputFile")
        public QueryPornJobListResponseBodyPornJobListPornJobPornConfigOutputFile outputFile;

        public static QueryPornJobListResponseBodyPornJobListPornJobPornConfig build(java.util.Map<String, ?> map) throws Exception {
            QueryPornJobListResponseBodyPornJobListPornJobPornConfig self = new QueryPornJobListResponseBodyPornJobListPornJobPornConfig();
            return TeaModel.build(map, self);
        }

        public QueryPornJobListResponseBodyPornJobListPornJobPornConfig setBizType(String bizType) {
            this.bizType = bizType;
            return this;
        }
        public String getBizType() {
            return this.bizType;
        }

        public QueryPornJobListResponseBodyPornJobListPornJobPornConfig setInterval(String interval) {
            this.interval = interval;
            return this;
        }
        public String getInterval() {
            return this.interval;
        }

        public QueryPornJobListResponseBodyPornJobListPornJobPornConfig setOutputFile(QueryPornJobListResponseBodyPornJobListPornJobPornConfigOutputFile outputFile) {
            this.outputFile = outputFile;
            return this;
        }
        public QueryPornJobListResponseBodyPornJobListPornJobPornConfigOutputFile getOutputFile() {
            return this.outputFile;
        }

    }

    public static class QueryPornJobListResponseBodyPornJobListPornJob extends TeaModel {
        @NameInMap("CensorPornResult")
        public QueryPornJobListResponseBodyPornJobListPornJobCensorPornResult censorPornResult;

        @NameInMap("Code")
        public String code;

        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("Id")
        public String id;

        @NameInMap("Input")
        public QueryPornJobListResponseBodyPornJobListPornJobInput input;

        @NameInMap("Message")
        public String message;

        @NameInMap("PipelineId")
        public String pipelineId;

        @NameInMap("PornConfig")
        public QueryPornJobListResponseBodyPornJobListPornJobPornConfig pornConfig;

        @NameInMap("State")
        public String state;

        @NameInMap("UserData")
        public String userData;

        public static QueryPornJobListResponseBodyPornJobListPornJob build(java.util.Map<String, ?> map) throws Exception {
            QueryPornJobListResponseBodyPornJobListPornJob self = new QueryPornJobListResponseBodyPornJobListPornJob();
            return TeaModel.build(map, self);
        }

        public QueryPornJobListResponseBodyPornJobListPornJob setCensorPornResult(QueryPornJobListResponseBodyPornJobListPornJobCensorPornResult censorPornResult) {
            this.censorPornResult = censorPornResult;
            return this;
        }
        public QueryPornJobListResponseBodyPornJobListPornJobCensorPornResult getCensorPornResult() {
            return this.censorPornResult;
        }

        public QueryPornJobListResponseBodyPornJobListPornJob setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryPornJobListResponseBodyPornJobListPornJob setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public QueryPornJobListResponseBodyPornJobListPornJob setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryPornJobListResponseBodyPornJobListPornJob setInput(QueryPornJobListResponseBodyPornJobListPornJobInput input) {
            this.input = input;
            return this;
        }
        public QueryPornJobListResponseBodyPornJobListPornJobInput getInput() {
            return this.input;
        }

        public QueryPornJobListResponseBodyPornJobListPornJob setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public QueryPornJobListResponseBodyPornJobListPornJob setPipelineId(String pipelineId) {
            this.pipelineId = pipelineId;
            return this;
        }
        public String getPipelineId() {
            return this.pipelineId;
        }

        public QueryPornJobListResponseBodyPornJobListPornJob setPornConfig(QueryPornJobListResponseBodyPornJobListPornJobPornConfig pornConfig) {
            this.pornConfig = pornConfig;
            return this;
        }
        public QueryPornJobListResponseBodyPornJobListPornJobPornConfig getPornConfig() {
            return this.pornConfig;
        }

        public QueryPornJobListResponseBodyPornJobListPornJob setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public QueryPornJobListResponseBodyPornJobListPornJob setUserData(String userData) {
            this.userData = userData;
            return this;
        }
        public String getUserData() {
            return this.userData;
        }

    }

    public static class QueryPornJobListResponseBodyPornJobList extends TeaModel {
        @NameInMap("PornJob")
        public java.util.List<QueryPornJobListResponseBodyPornJobListPornJob> pornJob;

        public static QueryPornJobListResponseBodyPornJobList build(java.util.Map<String, ?> map) throws Exception {
            QueryPornJobListResponseBodyPornJobList self = new QueryPornJobListResponseBodyPornJobList();
            return TeaModel.build(map, self);
        }

        public QueryPornJobListResponseBodyPornJobList setPornJob(java.util.List<QueryPornJobListResponseBodyPornJobListPornJob> pornJob) {
            this.pornJob = pornJob;
            return this;
        }
        public java.util.List<QueryPornJobListResponseBodyPornJobListPornJob> getPornJob() {
            return this.pornJob;
        }

    }

}
