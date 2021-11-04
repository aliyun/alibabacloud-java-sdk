// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class QueryTerrorismJobListResponseBody extends TeaModel {
    @NameInMap("NonExistIds")
    public QueryTerrorismJobListResponseBodyNonExistIds nonExistIds;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TerrorismJobList")
    public QueryTerrorismJobListResponseBodyTerrorismJobList terrorismJobList;

    public static QueryTerrorismJobListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryTerrorismJobListResponseBody self = new QueryTerrorismJobListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryTerrorismJobListResponseBody setNonExistIds(QueryTerrorismJobListResponseBodyNonExistIds nonExistIds) {
        this.nonExistIds = nonExistIds;
        return this;
    }
    public QueryTerrorismJobListResponseBodyNonExistIds getNonExistIds() {
        return this.nonExistIds;
    }

    public QueryTerrorismJobListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryTerrorismJobListResponseBody setTerrorismJobList(QueryTerrorismJobListResponseBodyTerrorismJobList terrorismJobList) {
        this.terrorismJobList = terrorismJobList;
        return this;
    }
    public QueryTerrorismJobListResponseBodyTerrorismJobList getTerrorismJobList() {
        return this.terrorismJobList;
    }

    public static class QueryTerrorismJobListResponseBodyNonExistIds extends TeaModel {
        @NameInMap("String")
        public java.util.List<String> string;

        public static QueryTerrorismJobListResponseBodyNonExistIds build(java.util.Map<String, ?> map) throws Exception {
            QueryTerrorismJobListResponseBodyNonExistIds self = new QueryTerrorismJobListResponseBodyNonExistIds();
            return TeaModel.build(map, self);
        }

        public QueryTerrorismJobListResponseBodyNonExistIds setString(java.util.List<String> string) {
            this.string = string;
            return this;
        }
        public java.util.List<String> getString() {
            return this.string;
        }

    }

    public static class QueryTerrorismJobListResponseBodyTerrorismJobListTerrorismJobCensorTerrorismResultTerrorismCounterListCounter extends TeaModel {
        @NameInMap("Count")
        public Integer count;

        @NameInMap("Label")
        public String label;

        public static QueryTerrorismJobListResponseBodyTerrorismJobListTerrorismJobCensorTerrorismResultTerrorismCounterListCounter build(java.util.Map<String, ?> map) throws Exception {
            QueryTerrorismJobListResponseBodyTerrorismJobListTerrorismJobCensorTerrorismResultTerrorismCounterListCounter self = new QueryTerrorismJobListResponseBodyTerrorismJobListTerrorismJobCensorTerrorismResultTerrorismCounterListCounter();
            return TeaModel.build(map, self);
        }

        public QueryTerrorismJobListResponseBodyTerrorismJobListTerrorismJobCensorTerrorismResultTerrorismCounterListCounter setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public QueryTerrorismJobListResponseBodyTerrorismJobListTerrorismJobCensorTerrorismResultTerrorismCounterListCounter setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

    }

    public static class QueryTerrorismJobListResponseBodyTerrorismJobListTerrorismJobCensorTerrorismResultTerrorismCounterList extends TeaModel {
        @NameInMap("Counter")
        public java.util.List<QueryTerrorismJobListResponseBodyTerrorismJobListTerrorismJobCensorTerrorismResultTerrorismCounterListCounter> counter;

        public static QueryTerrorismJobListResponseBodyTerrorismJobListTerrorismJobCensorTerrorismResultTerrorismCounterList build(java.util.Map<String, ?> map) throws Exception {
            QueryTerrorismJobListResponseBodyTerrorismJobListTerrorismJobCensorTerrorismResultTerrorismCounterList self = new QueryTerrorismJobListResponseBodyTerrorismJobListTerrorismJobCensorTerrorismResultTerrorismCounterList();
            return TeaModel.build(map, self);
        }

        public QueryTerrorismJobListResponseBodyTerrorismJobListTerrorismJobCensorTerrorismResultTerrorismCounterList setCounter(java.util.List<QueryTerrorismJobListResponseBodyTerrorismJobListTerrorismJobCensorTerrorismResultTerrorismCounterListCounter> counter) {
            this.counter = counter;
            return this;
        }
        public java.util.List<QueryTerrorismJobListResponseBodyTerrorismJobListTerrorismJobCensorTerrorismResultTerrorismCounterListCounter> getCounter() {
            return this.counter;
        }

    }

    public static class QueryTerrorismJobListResponseBodyTerrorismJobListTerrorismJobCensorTerrorismResultTerrorismTopListTop extends TeaModel {
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

        public static QueryTerrorismJobListResponseBodyTerrorismJobListTerrorismJobCensorTerrorismResultTerrorismTopListTop build(java.util.Map<String, ?> map) throws Exception {
            QueryTerrorismJobListResponseBodyTerrorismJobListTerrorismJobCensorTerrorismResultTerrorismTopListTop self = new QueryTerrorismJobListResponseBodyTerrorismJobListTerrorismJobCensorTerrorismResultTerrorismTopListTop();
            return TeaModel.build(map, self);
        }

        public QueryTerrorismJobListResponseBodyTerrorismJobListTerrorismJobCensorTerrorismResultTerrorismTopListTop setIndex(String index) {
            this.index = index;
            return this;
        }
        public String getIndex() {
            return this.index;
        }

        public QueryTerrorismJobListResponseBodyTerrorismJobListTerrorismJobCensorTerrorismResultTerrorismTopListTop setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public QueryTerrorismJobListResponseBodyTerrorismJobListTerrorismJobCensorTerrorismResultTerrorismTopListTop setObject(String object) {
            this.object = object;
            return this;
        }
        public String getObject() {
            return this.object;
        }

        public QueryTerrorismJobListResponseBodyTerrorismJobListTerrorismJobCensorTerrorismResultTerrorismTopListTop setScore(String score) {
            this.score = score;
            return this;
        }
        public String getScore() {
            return this.score;
        }

        public QueryTerrorismJobListResponseBodyTerrorismJobListTerrorismJobCensorTerrorismResultTerrorismTopListTop setTimestamp(String timestamp) {
            this.timestamp = timestamp;
            return this;
        }
        public String getTimestamp() {
            return this.timestamp;
        }

    }

    public static class QueryTerrorismJobListResponseBodyTerrorismJobListTerrorismJobCensorTerrorismResultTerrorismTopList extends TeaModel {
        @NameInMap("Top")
        public java.util.List<QueryTerrorismJobListResponseBodyTerrorismJobListTerrorismJobCensorTerrorismResultTerrorismTopListTop> top;

        public static QueryTerrorismJobListResponseBodyTerrorismJobListTerrorismJobCensorTerrorismResultTerrorismTopList build(java.util.Map<String, ?> map) throws Exception {
            QueryTerrorismJobListResponseBodyTerrorismJobListTerrorismJobCensorTerrorismResultTerrorismTopList self = new QueryTerrorismJobListResponseBodyTerrorismJobListTerrorismJobCensorTerrorismResultTerrorismTopList();
            return TeaModel.build(map, self);
        }

        public QueryTerrorismJobListResponseBodyTerrorismJobListTerrorismJobCensorTerrorismResultTerrorismTopList setTop(java.util.List<QueryTerrorismJobListResponseBodyTerrorismJobListTerrorismJobCensorTerrorismResultTerrorismTopListTop> top) {
            this.top = top;
            return this;
        }
        public java.util.List<QueryTerrorismJobListResponseBodyTerrorismJobListTerrorismJobCensorTerrorismResultTerrorismTopListTop> getTop() {
            return this.top;
        }

    }

    public static class QueryTerrorismJobListResponseBodyTerrorismJobListTerrorismJobCensorTerrorismResult extends TeaModel {
        @NameInMap("AverageScore")
        public String averageScore;

        @NameInMap("Label")
        public String label;

        @NameInMap("MaxScore")
        public String maxScore;

        @NameInMap("Suggestion")
        public String suggestion;

        @NameInMap("TerrorismCounterList")
        public QueryTerrorismJobListResponseBodyTerrorismJobListTerrorismJobCensorTerrorismResultTerrorismCounterList terrorismCounterList;

        @NameInMap("TerrorismTopList")
        public QueryTerrorismJobListResponseBodyTerrorismJobListTerrorismJobCensorTerrorismResultTerrorismTopList terrorismTopList;

        public static QueryTerrorismJobListResponseBodyTerrorismJobListTerrorismJobCensorTerrorismResult build(java.util.Map<String, ?> map) throws Exception {
            QueryTerrorismJobListResponseBodyTerrorismJobListTerrorismJobCensorTerrorismResult self = new QueryTerrorismJobListResponseBodyTerrorismJobListTerrorismJobCensorTerrorismResult();
            return TeaModel.build(map, self);
        }

        public QueryTerrorismJobListResponseBodyTerrorismJobListTerrorismJobCensorTerrorismResult setAverageScore(String averageScore) {
            this.averageScore = averageScore;
            return this;
        }
        public String getAverageScore() {
            return this.averageScore;
        }

        public QueryTerrorismJobListResponseBodyTerrorismJobListTerrorismJobCensorTerrorismResult setLabel(String label) {
            this.label = label;
            return this;
        }
        public String getLabel() {
            return this.label;
        }

        public QueryTerrorismJobListResponseBodyTerrorismJobListTerrorismJobCensorTerrorismResult setMaxScore(String maxScore) {
            this.maxScore = maxScore;
            return this;
        }
        public String getMaxScore() {
            return this.maxScore;
        }

        public QueryTerrorismJobListResponseBodyTerrorismJobListTerrorismJobCensorTerrorismResult setSuggestion(String suggestion) {
            this.suggestion = suggestion;
            return this;
        }
        public String getSuggestion() {
            return this.suggestion;
        }

        public QueryTerrorismJobListResponseBodyTerrorismJobListTerrorismJobCensorTerrorismResult setTerrorismCounterList(QueryTerrorismJobListResponseBodyTerrorismJobListTerrorismJobCensorTerrorismResultTerrorismCounterList terrorismCounterList) {
            this.terrorismCounterList = terrorismCounterList;
            return this;
        }
        public QueryTerrorismJobListResponseBodyTerrorismJobListTerrorismJobCensorTerrorismResultTerrorismCounterList getTerrorismCounterList() {
            return this.terrorismCounterList;
        }

        public QueryTerrorismJobListResponseBodyTerrorismJobListTerrorismJobCensorTerrorismResult setTerrorismTopList(QueryTerrorismJobListResponseBodyTerrorismJobListTerrorismJobCensorTerrorismResultTerrorismTopList terrorismTopList) {
            this.terrorismTopList = terrorismTopList;
            return this;
        }
        public QueryTerrorismJobListResponseBodyTerrorismJobListTerrorismJobCensorTerrorismResultTerrorismTopList getTerrorismTopList() {
            return this.terrorismTopList;
        }

    }

    public static class QueryTerrorismJobListResponseBodyTerrorismJobListTerrorismJobInput extends TeaModel {
        @NameInMap("Bucket")
        public String bucket;

        @NameInMap("Location")
        public String location;

        @NameInMap("Object")
        public String object;

        public static QueryTerrorismJobListResponseBodyTerrorismJobListTerrorismJobInput build(java.util.Map<String, ?> map) throws Exception {
            QueryTerrorismJobListResponseBodyTerrorismJobListTerrorismJobInput self = new QueryTerrorismJobListResponseBodyTerrorismJobListTerrorismJobInput();
            return TeaModel.build(map, self);
        }

        public QueryTerrorismJobListResponseBodyTerrorismJobListTerrorismJobInput setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

        public QueryTerrorismJobListResponseBodyTerrorismJobListTerrorismJobInput setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public QueryTerrorismJobListResponseBodyTerrorismJobListTerrorismJobInput setObject(String object) {
            this.object = object;
            return this;
        }
        public String getObject() {
            return this.object;
        }

    }

    public static class QueryTerrorismJobListResponseBodyTerrorismJobListTerrorismJobTerrorismConfigOutputFile extends TeaModel {
        @NameInMap("Bucket")
        public String bucket;

        @NameInMap("Location")
        public String location;

        @NameInMap("Object")
        public String object;

        public static QueryTerrorismJobListResponseBodyTerrorismJobListTerrorismJobTerrorismConfigOutputFile build(java.util.Map<String, ?> map) throws Exception {
            QueryTerrorismJobListResponseBodyTerrorismJobListTerrorismJobTerrorismConfigOutputFile self = new QueryTerrorismJobListResponseBodyTerrorismJobListTerrorismJobTerrorismConfigOutputFile();
            return TeaModel.build(map, self);
        }

        public QueryTerrorismJobListResponseBodyTerrorismJobListTerrorismJobTerrorismConfigOutputFile setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

        public QueryTerrorismJobListResponseBodyTerrorismJobListTerrorismJobTerrorismConfigOutputFile setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public QueryTerrorismJobListResponseBodyTerrorismJobListTerrorismJobTerrorismConfigOutputFile setObject(String object) {
            this.object = object;
            return this;
        }
        public String getObject() {
            return this.object;
        }

    }

    public static class QueryTerrorismJobListResponseBodyTerrorismJobListTerrorismJobTerrorismConfig extends TeaModel {
        @NameInMap("BizType")
        public String bizType;

        @NameInMap("Interval")
        public String interval;

        @NameInMap("OutputFile")
        public QueryTerrorismJobListResponseBodyTerrorismJobListTerrorismJobTerrorismConfigOutputFile outputFile;

        public static QueryTerrorismJobListResponseBodyTerrorismJobListTerrorismJobTerrorismConfig build(java.util.Map<String, ?> map) throws Exception {
            QueryTerrorismJobListResponseBodyTerrorismJobListTerrorismJobTerrorismConfig self = new QueryTerrorismJobListResponseBodyTerrorismJobListTerrorismJobTerrorismConfig();
            return TeaModel.build(map, self);
        }

        public QueryTerrorismJobListResponseBodyTerrorismJobListTerrorismJobTerrorismConfig setBizType(String bizType) {
            this.bizType = bizType;
            return this;
        }
        public String getBizType() {
            return this.bizType;
        }

        public QueryTerrorismJobListResponseBodyTerrorismJobListTerrorismJobTerrorismConfig setInterval(String interval) {
            this.interval = interval;
            return this;
        }
        public String getInterval() {
            return this.interval;
        }

        public QueryTerrorismJobListResponseBodyTerrorismJobListTerrorismJobTerrorismConfig setOutputFile(QueryTerrorismJobListResponseBodyTerrorismJobListTerrorismJobTerrorismConfigOutputFile outputFile) {
            this.outputFile = outputFile;
            return this;
        }
        public QueryTerrorismJobListResponseBodyTerrorismJobListTerrorismJobTerrorismConfigOutputFile getOutputFile() {
            return this.outputFile;
        }

    }

    public static class QueryTerrorismJobListResponseBodyTerrorismJobListTerrorismJob extends TeaModel {
        @NameInMap("CensorTerrorismResult")
        public QueryTerrorismJobListResponseBodyTerrorismJobListTerrorismJobCensorTerrorismResult censorTerrorismResult;

        @NameInMap("Code")
        public String code;

        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("Id")
        public String id;

        @NameInMap("Input")
        public QueryTerrorismJobListResponseBodyTerrorismJobListTerrorismJobInput input;

        @NameInMap("Message")
        public String message;

        @NameInMap("PipelineId")
        public String pipelineId;

        @NameInMap("State")
        public String state;

        @NameInMap("TerrorismConfig")
        public QueryTerrorismJobListResponseBodyTerrorismJobListTerrorismJobTerrorismConfig terrorismConfig;

        @NameInMap("UserData")
        public String userData;

        public static QueryTerrorismJobListResponseBodyTerrorismJobListTerrorismJob build(java.util.Map<String, ?> map) throws Exception {
            QueryTerrorismJobListResponseBodyTerrorismJobListTerrorismJob self = new QueryTerrorismJobListResponseBodyTerrorismJobListTerrorismJob();
            return TeaModel.build(map, self);
        }

        public QueryTerrorismJobListResponseBodyTerrorismJobListTerrorismJob setCensorTerrorismResult(QueryTerrorismJobListResponseBodyTerrorismJobListTerrorismJobCensorTerrorismResult censorTerrorismResult) {
            this.censorTerrorismResult = censorTerrorismResult;
            return this;
        }
        public QueryTerrorismJobListResponseBodyTerrorismJobListTerrorismJobCensorTerrorismResult getCensorTerrorismResult() {
            return this.censorTerrorismResult;
        }

        public QueryTerrorismJobListResponseBodyTerrorismJobListTerrorismJob setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryTerrorismJobListResponseBodyTerrorismJobListTerrorismJob setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public QueryTerrorismJobListResponseBodyTerrorismJobListTerrorismJob setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryTerrorismJobListResponseBodyTerrorismJobListTerrorismJob setInput(QueryTerrorismJobListResponseBodyTerrorismJobListTerrorismJobInput input) {
            this.input = input;
            return this;
        }
        public QueryTerrorismJobListResponseBodyTerrorismJobListTerrorismJobInput getInput() {
            return this.input;
        }

        public QueryTerrorismJobListResponseBodyTerrorismJobListTerrorismJob setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public QueryTerrorismJobListResponseBodyTerrorismJobListTerrorismJob setPipelineId(String pipelineId) {
            this.pipelineId = pipelineId;
            return this;
        }
        public String getPipelineId() {
            return this.pipelineId;
        }

        public QueryTerrorismJobListResponseBodyTerrorismJobListTerrorismJob setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public QueryTerrorismJobListResponseBodyTerrorismJobListTerrorismJob setTerrorismConfig(QueryTerrorismJobListResponseBodyTerrorismJobListTerrorismJobTerrorismConfig terrorismConfig) {
            this.terrorismConfig = terrorismConfig;
            return this;
        }
        public QueryTerrorismJobListResponseBodyTerrorismJobListTerrorismJobTerrorismConfig getTerrorismConfig() {
            return this.terrorismConfig;
        }

        public QueryTerrorismJobListResponseBodyTerrorismJobListTerrorismJob setUserData(String userData) {
            this.userData = userData;
            return this;
        }
        public String getUserData() {
            return this.userData;
        }

    }

    public static class QueryTerrorismJobListResponseBodyTerrorismJobList extends TeaModel {
        @NameInMap("TerrorismJob")
        public java.util.List<QueryTerrorismJobListResponseBodyTerrorismJobListTerrorismJob> terrorismJob;

        public static QueryTerrorismJobListResponseBodyTerrorismJobList build(java.util.Map<String, ?> map) throws Exception {
            QueryTerrorismJobListResponseBodyTerrorismJobList self = new QueryTerrorismJobListResponseBodyTerrorismJobList();
            return TeaModel.build(map, self);
        }

        public QueryTerrorismJobListResponseBodyTerrorismJobList setTerrorismJob(java.util.List<QueryTerrorismJobListResponseBodyTerrorismJobListTerrorismJob> terrorismJob) {
            this.terrorismJob = terrorismJob;
            return this;
        }
        public java.util.List<QueryTerrorismJobListResponseBodyTerrorismJobListTerrorismJob> getTerrorismJob() {
            return this.terrorismJob;
        }

    }

}
