// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class QueryAsrJobListResponseBody extends TeaModel {
    @NameInMap("JobList")
    public QueryAsrJobListResponseBodyJobList jobList;

    @NameInMap("NonExistIds")
    public QueryAsrJobListResponseBodyNonExistIds nonExistIds;

    @NameInMap("RequestId")
    public String requestId;

    public static QueryAsrJobListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryAsrJobListResponseBody self = new QueryAsrJobListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryAsrJobListResponseBody setJobList(QueryAsrJobListResponseBodyJobList jobList) {
        this.jobList = jobList;
        return this;
    }
    public QueryAsrJobListResponseBodyJobList getJobList() {
        return this.jobList;
    }

    public QueryAsrJobListResponseBody setNonExistIds(QueryAsrJobListResponseBodyNonExistIds nonExistIds) {
        this.nonExistIds = nonExistIds;
        return this;
    }
    public QueryAsrJobListResponseBodyNonExistIds getNonExistIds() {
        return this.nonExistIds;
    }

    public QueryAsrJobListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class QueryAsrJobListResponseBodyJobListJobAsrConfig extends TeaModel {
        @NameInMap("Scene")
        public String scene;

        public static QueryAsrJobListResponseBodyJobListJobAsrConfig build(java.util.Map<String, ?> map) throws Exception {
            QueryAsrJobListResponseBodyJobListJobAsrConfig self = new QueryAsrJobListResponseBodyJobListJobAsrConfig();
            return TeaModel.build(map, self);
        }

        public QueryAsrJobListResponseBodyJobListJobAsrConfig setScene(String scene) {
            this.scene = scene;
            return this;
        }
        public String getScene() {
            return this.scene;
        }

    }

    public static class QueryAsrJobListResponseBodyJobListJobAsrResultAsrTextListAsrText extends TeaModel {
        @NameInMap("ChannelId")
        public String channelId;

        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("SpeechRate")
        public String speechRate;

        @NameInMap("StartTime")
        public Integer startTime;

        @NameInMap("Text")
        public String text;

        public static QueryAsrJobListResponseBodyJobListJobAsrResultAsrTextListAsrText build(java.util.Map<String, ?> map) throws Exception {
            QueryAsrJobListResponseBodyJobListJobAsrResultAsrTextListAsrText self = new QueryAsrJobListResponseBodyJobListJobAsrResultAsrTextListAsrText();
            return TeaModel.build(map, self);
        }

        public QueryAsrJobListResponseBodyJobListJobAsrResultAsrTextListAsrText setChannelId(String channelId) {
            this.channelId = channelId;
            return this;
        }
        public String getChannelId() {
            return this.channelId;
        }

        public QueryAsrJobListResponseBodyJobListJobAsrResultAsrTextListAsrText setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public QueryAsrJobListResponseBodyJobListJobAsrResultAsrTextListAsrText setSpeechRate(String speechRate) {
            this.speechRate = speechRate;
            return this;
        }
        public String getSpeechRate() {
            return this.speechRate;
        }

        public QueryAsrJobListResponseBodyJobListJobAsrResultAsrTextListAsrText setStartTime(Integer startTime) {
            this.startTime = startTime;
            return this;
        }
        public Integer getStartTime() {
            return this.startTime;
        }

        public QueryAsrJobListResponseBodyJobListJobAsrResultAsrTextListAsrText setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class QueryAsrJobListResponseBodyJobListJobAsrResultAsrTextList extends TeaModel {
        @NameInMap("AsrText")
        public java.util.List<QueryAsrJobListResponseBodyJobListJobAsrResultAsrTextListAsrText> asrText;

        public static QueryAsrJobListResponseBodyJobListJobAsrResultAsrTextList build(java.util.Map<String, ?> map) throws Exception {
            QueryAsrJobListResponseBodyJobListJobAsrResultAsrTextList self = new QueryAsrJobListResponseBodyJobListJobAsrResultAsrTextList();
            return TeaModel.build(map, self);
        }

        public QueryAsrJobListResponseBodyJobListJobAsrResultAsrTextList setAsrText(java.util.List<QueryAsrJobListResponseBodyJobListJobAsrResultAsrTextListAsrText> asrText) {
            this.asrText = asrText;
            return this;
        }
        public java.util.List<QueryAsrJobListResponseBodyJobListJobAsrResultAsrTextListAsrText> getAsrText() {
            return this.asrText;
        }

    }

    public static class QueryAsrJobListResponseBodyJobListJobAsrResult extends TeaModel {
        @NameInMap("AsrTextList")
        public QueryAsrJobListResponseBodyJobListJobAsrResultAsrTextList asrTextList;

        @NameInMap("Duration")
        public String duration;

        public static QueryAsrJobListResponseBodyJobListJobAsrResult build(java.util.Map<String, ?> map) throws Exception {
            QueryAsrJobListResponseBodyJobListJobAsrResult self = new QueryAsrJobListResponseBodyJobListJobAsrResult();
            return TeaModel.build(map, self);
        }

        public QueryAsrJobListResponseBodyJobListJobAsrResult setAsrTextList(QueryAsrJobListResponseBodyJobListJobAsrResultAsrTextList asrTextList) {
            this.asrTextList = asrTextList;
            return this;
        }
        public QueryAsrJobListResponseBodyJobListJobAsrResultAsrTextList getAsrTextList() {
            return this.asrTextList;
        }

        public QueryAsrJobListResponseBodyJobListJobAsrResult setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

    }

    public static class QueryAsrJobListResponseBodyJobListJobInput extends TeaModel {
        @NameInMap("Bucket")
        public String bucket;

        @NameInMap("Location")
        public String location;

        @NameInMap("Object")
        public String object;

        public static QueryAsrJobListResponseBodyJobListJobInput build(java.util.Map<String, ?> map) throws Exception {
            QueryAsrJobListResponseBodyJobListJobInput self = new QueryAsrJobListResponseBodyJobListJobInput();
            return TeaModel.build(map, self);
        }

        public QueryAsrJobListResponseBodyJobListJobInput setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

        public QueryAsrJobListResponseBodyJobListJobInput setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public QueryAsrJobListResponseBodyJobListJobInput setObject(String object) {
            this.object = object;
            return this;
        }
        public String getObject() {
            return this.object;
        }

    }

    public static class QueryAsrJobListResponseBodyJobListJob extends TeaModel {
        @NameInMap("AsrConfig")
        public QueryAsrJobListResponseBodyJobListJobAsrConfig asrConfig;

        @NameInMap("AsrResult")
        public QueryAsrJobListResponseBodyJobListJobAsrResult asrResult;

        @NameInMap("Code")
        public String code;

        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("Id")
        public String id;

        @NameInMap("Input")
        public QueryAsrJobListResponseBodyJobListJobInput input;

        @NameInMap("Message")
        public String message;

        @NameInMap("PipelineId")
        public String pipelineId;

        @NameInMap("State")
        public String state;

        @NameInMap("UserData")
        public String userData;

        public static QueryAsrJobListResponseBodyJobListJob build(java.util.Map<String, ?> map) throws Exception {
            QueryAsrJobListResponseBodyJobListJob self = new QueryAsrJobListResponseBodyJobListJob();
            return TeaModel.build(map, self);
        }

        public QueryAsrJobListResponseBodyJobListJob setAsrConfig(QueryAsrJobListResponseBodyJobListJobAsrConfig asrConfig) {
            this.asrConfig = asrConfig;
            return this;
        }
        public QueryAsrJobListResponseBodyJobListJobAsrConfig getAsrConfig() {
            return this.asrConfig;
        }

        public QueryAsrJobListResponseBodyJobListJob setAsrResult(QueryAsrJobListResponseBodyJobListJobAsrResult asrResult) {
            this.asrResult = asrResult;
            return this;
        }
        public QueryAsrJobListResponseBodyJobListJobAsrResult getAsrResult() {
            return this.asrResult;
        }

        public QueryAsrJobListResponseBodyJobListJob setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryAsrJobListResponseBodyJobListJob setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public QueryAsrJobListResponseBodyJobListJob setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryAsrJobListResponseBodyJobListJob setInput(QueryAsrJobListResponseBodyJobListJobInput input) {
            this.input = input;
            return this;
        }
        public QueryAsrJobListResponseBodyJobListJobInput getInput() {
            return this.input;
        }

        public QueryAsrJobListResponseBodyJobListJob setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public QueryAsrJobListResponseBodyJobListJob setPipelineId(String pipelineId) {
            this.pipelineId = pipelineId;
            return this;
        }
        public String getPipelineId() {
            return this.pipelineId;
        }

        public QueryAsrJobListResponseBodyJobListJob setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public QueryAsrJobListResponseBodyJobListJob setUserData(String userData) {
            this.userData = userData;
            return this;
        }
        public String getUserData() {
            return this.userData;
        }

    }

    public static class QueryAsrJobListResponseBodyJobList extends TeaModel {
        @NameInMap("Job")
        public java.util.List<QueryAsrJobListResponseBodyJobListJob> job;

        public static QueryAsrJobListResponseBodyJobList build(java.util.Map<String, ?> map) throws Exception {
            QueryAsrJobListResponseBodyJobList self = new QueryAsrJobListResponseBodyJobList();
            return TeaModel.build(map, self);
        }

        public QueryAsrJobListResponseBodyJobList setJob(java.util.List<QueryAsrJobListResponseBodyJobListJob> job) {
            this.job = job;
            return this;
        }
        public java.util.List<QueryAsrJobListResponseBodyJobListJob> getJob() {
            return this.job;
        }

    }

    public static class QueryAsrJobListResponseBodyNonExistIds extends TeaModel {
        @NameInMap("String")
        public java.util.List<String> string;

        public static QueryAsrJobListResponseBodyNonExistIds build(java.util.Map<String, ?> map) throws Exception {
            QueryAsrJobListResponseBodyNonExistIds self = new QueryAsrJobListResponseBodyNonExistIds();
            return TeaModel.build(map, self);
        }

        public QueryAsrJobListResponseBodyNonExistIds setString(java.util.List<String> string) {
            this.string = string;
            return this;
        }
        public java.util.List<String> getString() {
            return this.string;
        }

    }

}
