// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class QueryMediaDetailJobListResponseBody extends TeaModel {
    @NameInMap("JobList")
    public QueryMediaDetailJobListResponseBodyJobList jobList;

    @NameInMap("NonExistIds")
    public QueryMediaDetailJobListResponseBodyNonExistIds nonExistIds;

    @NameInMap("RequestId")
    public String requestId;

    public static QueryMediaDetailJobListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryMediaDetailJobListResponseBody self = new QueryMediaDetailJobListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryMediaDetailJobListResponseBody setJobList(QueryMediaDetailJobListResponseBodyJobList jobList) {
        this.jobList = jobList;
        return this;
    }
    public QueryMediaDetailJobListResponseBodyJobList getJobList() {
        return this.jobList;
    }

    public QueryMediaDetailJobListResponseBody setNonExistIds(QueryMediaDetailJobListResponseBodyNonExistIds nonExistIds) {
        this.nonExistIds = nonExistIds;
        return this;
    }
    public QueryMediaDetailJobListResponseBodyNonExistIds getNonExistIds() {
        return this.nonExistIds;
    }

    public QueryMediaDetailJobListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class QueryMediaDetailJobListResponseBodyJobListJobInput extends TeaModel {
        @NameInMap("Bucket")
        public String bucket;

        @NameInMap("Location")
        public String location;

        @NameInMap("Object")
        public String object;

        public static QueryMediaDetailJobListResponseBodyJobListJobInput build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaDetailJobListResponseBodyJobListJobInput self = new QueryMediaDetailJobListResponseBodyJobListJobInput();
            return TeaModel.build(map, self);
        }

        public QueryMediaDetailJobListResponseBodyJobListJobInput setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

        public QueryMediaDetailJobListResponseBodyJobListJobInput setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public QueryMediaDetailJobListResponseBodyJobListJobInput setObject(String object) {
            this.object = object;
            return this;
        }
        public String getObject() {
            return this.object;
        }

    }

    public static class QueryMediaDetailJobListResponseBodyJobListJobMediaDetailConfigOutputFile extends TeaModel {
        @NameInMap("Bucket")
        public String bucket;

        @NameInMap("Location")
        public String location;

        @NameInMap("Object")
        public String object;

        public static QueryMediaDetailJobListResponseBodyJobListJobMediaDetailConfigOutputFile build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaDetailJobListResponseBodyJobListJobMediaDetailConfigOutputFile self = new QueryMediaDetailJobListResponseBodyJobListJobMediaDetailConfigOutputFile();
            return TeaModel.build(map, self);
        }

        public QueryMediaDetailJobListResponseBodyJobListJobMediaDetailConfigOutputFile setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

        public QueryMediaDetailJobListResponseBodyJobListJobMediaDetailConfigOutputFile setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public QueryMediaDetailJobListResponseBodyJobListJobMediaDetailConfigOutputFile setObject(String object) {
            this.object = object;
            return this;
        }
        public String getObject() {
            return this.object;
        }

    }

    public static class QueryMediaDetailJobListResponseBodyJobListJobMediaDetailConfig extends TeaModel {
        @NameInMap("DetailType")
        public String detailType;

        @NameInMap("OutputFile")
        public QueryMediaDetailJobListResponseBodyJobListJobMediaDetailConfigOutputFile outputFile;

        @NameInMap("Scenario")
        public String scenario;

        public static QueryMediaDetailJobListResponseBodyJobListJobMediaDetailConfig build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaDetailJobListResponseBodyJobListJobMediaDetailConfig self = new QueryMediaDetailJobListResponseBodyJobListJobMediaDetailConfig();
            return TeaModel.build(map, self);
        }

        public QueryMediaDetailJobListResponseBodyJobListJobMediaDetailConfig setDetailType(String detailType) {
            this.detailType = detailType;
            return this;
        }
        public String getDetailType() {
            return this.detailType;
        }

        public QueryMediaDetailJobListResponseBodyJobListJobMediaDetailConfig setOutputFile(QueryMediaDetailJobListResponseBodyJobListJobMediaDetailConfigOutputFile outputFile) {
            this.outputFile = outputFile;
            return this;
        }
        public QueryMediaDetailJobListResponseBodyJobListJobMediaDetailConfigOutputFile getOutputFile() {
            return this.outputFile;
        }

        public QueryMediaDetailJobListResponseBodyJobListJobMediaDetailConfig setScenario(String scenario) {
            this.scenario = scenario;
            return this;
        }
        public String getScenario() {
            return this.scenario;
        }

    }

    public static class QueryMediaDetailJobListResponseBodyJobListJobMediaDetailResultMediaDetailRecgResultsMediaDetailRecgResultCelebritiesCelebrity extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Score")
        public String score;

        @NameInMap("Target")
        public String target;

        public static QueryMediaDetailJobListResponseBodyJobListJobMediaDetailResultMediaDetailRecgResultsMediaDetailRecgResultCelebritiesCelebrity build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaDetailJobListResponseBodyJobListJobMediaDetailResultMediaDetailRecgResultsMediaDetailRecgResultCelebritiesCelebrity self = new QueryMediaDetailJobListResponseBodyJobListJobMediaDetailResultMediaDetailRecgResultsMediaDetailRecgResultCelebritiesCelebrity();
            return TeaModel.build(map, self);
        }

        public QueryMediaDetailJobListResponseBodyJobListJobMediaDetailResultMediaDetailRecgResultsMediaDetailRecgResultCelebritiesCelebrity setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryMediaDetailJobListResponseBodyJobListJobMediaDetailResultMediaDetailRecgResultsMediaDetailRecgResultCelebritiesCelebrity setScore(String score) {
            this.score = score;
            return this;
        }
        public String getScore() {
            return this.score;
        }

        public QueryMediaDetailJobListResponseBodyJobListJobMediaDetailResultMediaDetailRecgResultsMediaDetailRecgResultCelebritiesCelebrity setTarget(String target) {
            this.target = target;
            return this;
        }
        public String getTarget() {
            return this.target;
        }

    }

    public static class QueryMediaDetailJobListResponseBodyJobListJobMediaDetailResultMediaDetailRecgResultsMediaDetailRecgResultCelebrities extends TeaModel {
        @NameInMap("Celebrity")
        public java.util.List<QueryMediaDetailJobListResponseBodyJobListJobMediaDetailResultMediaDetailRecgResultsMediaDetailRecgResultCelebritiesCelebrity> celebrity;

        public static QueryMediaDetailJobListResponseBodyJobListJobMediaDetailResultMediaDetailRecgResultsMediaDetailRecgResultCelebrities build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaDetailJobListResponseBodyJobListJobMediaDetailResultMediaDetailRecgResultsMediaDetailRecgResultCelebrities self = new QueryMediaDetailJobListResponseBodyJobListJobMediaDetailResultMediaDetailRecgResultsMediaDetailRecgResultCelebrities();
            return TeaModel.build(map, self);
        }

        public QueryMediaDetailJobListResponseBodyJobListJobMediaDetailResultMediaDetailRecgResultsMediaDetailRecgResultCelebrities setCelebrity(java.util.List<QueryMediaDetailJobListResponseBodyJobListJobMediaDetailResultMediaDetailRecgResultsMediaDetailRecgResultCelebritiesCelebrity> celebrity) {
            this.celebrity = celebrity;
            return this;
        }
        public java.util.List<QueryMediaDetailJobListResponseBodyJobListJobMediaDetailResultMediaDetailRecgResultsMediaDetailRecgResultCelebritiesCelebrity> getCelebrity() {
            return this.celebrity;
        }

    }

    public static class QueryMediaDetailJobListResponseBodyJobListJobMediaDetailResultMediaDetailRecgResultsMediaDetailRecgResultCustomsCustomClipsClip extends TeaModel {
        @NameInMap("AvgScore")
        public String avgScore;

        @NameInMap("EndTarget")
        public String endTarget;

        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("MaxScore")
        public String maxScore;

        @NameInMap("MinScore")
        public String minScore;

        @NameInMap("StartTarget")
        public String startTarget;

        @NameInMap("StartTime")
        public String startTime;

        public static QueryMediaDetailJobListResponseBodyJobListJobMediaDetailResultMediaDetailRecgResultsMediaDetailRecgResultCustomsCustomClipsClip build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaDetailJobListResponseBodyJobListJobMediaDetailResultMediaDetailRecgResultsMediaDetailRecgResultCustomsCustomClipsClip self = new QueryMediaDetailJobListResponseBodyJobListJobMediaDetailResultMediaDetailRecgResultsMediaDetailRecgResultCustomsCustomClipsClip();
            return TeaModel.build(map, self);
        }

        public QueryMediaDetailJobListResponseBodyJobListJobMediaDetailResultMediaDetailRecgResultsMediaDetailRecgResultCustomsCustomClipsClip setAvgScore(String avgScore) {
            this.avgScore = avgScore;
            return this;
        }
        public String getAvgScore() {
            return this.avgScore;
        }

        public QueryMediaDetailJobListResponseBodyJobListJobMediaDetailResultMediaDetailRecgResultsMediaDetailRecgResultCustomsCustomClipsClip setEndTarget(String endTarget) {
            this.endTarget = endTarget;
            return this;
        }
        public String getEndTarget() {
            return this.endTarget;
        }

        public QueryMediaDetailJobListResponseBodyJobListJobMediaDetailResultMediaDetailRecgResultsMediaDetailRecgResultCustomsCustomClipsClip setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public QueryMediaDetailJobListResponseBodyJobListJobMediaDetailResultMediaDetailRecgResultsMediaDetailRecgResultCustomsCustomClipsClip setMaxScore(String maxScore) {
            this.maxScore = maxScore;
            return this;
        }
        public String getMaxScore() {
            return this.maxScore;
        }

        public QueryMediaDetailJobListResponseBodyJobListJobMediaDetailResultMediaDetailRecgResultsMediaDetailRecgResultCustomsCustomClipsClip setMinScore(String minScore) {
            this.minScore = minScore;
            return this;
        }
        public String getMinScore() {
            return this.minScore;
        }

        public QueryMediaDetailJobListResponseBodyJobListJobMediaDetailResultMediaDetailRecgResultsMediaDetailRecgResultCustomsCustomClipsClip setStartTarget(String startTarget) {
            this.startTarget = startTarget;
            return this;
        }
        public String getStartTarget() {
            return this.startTarget;
        }

        public QueryMediaDetailJobListResponseBodyJobListJobMediaDetailResultMediaDetailRecgResultsMediaDetailRecgResultCustomsCustomClipsClip setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

    public static class QueryMediaDetailJobListResponseBodyJobListJobMediaDetailResultMediaDetailRecgResultsMediaDetailRecgResultCustomsCustomClips extends TeaModel {
        @NameInMap("Clip")
        public java.util.List<QueryMediaDetailJobListResponseBodyJobListJobMediaDetailResultMediaDetailRecgResultsMediaDetailRecgResultCustomsCustomClipsClip> clip;

        public static QueryMediaDetailJobListResponseBodyJobListJobMediaDetailResultMediaDetailRecgResultsMediaDetailRecgResultCustomsCustomClips build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaDetailJobListResponseBodyJobListJobMediaDetailResultMediaDetailRecgResultsMediaDetailRecgResultCustomsCustomClips self = new QueryMediaDetailJobListResponseBodyJobListJobMediaDetailResultMediaDetailRecgResultsMediaDetailRecgResultCustomsCustomClips();
            return TeaModel.build(map, self);
        }

        public QueryMediaDetailJobListResponseBodyJobListJobMediaDetailResultMediaDetailRecgResultsMediaDetailRecgResultCustomsCustomClips setClip(java.util.List<QueryMediaDetailJobListResponseBodyJobListJobMediaDetailResultMediaDetailRecgResultsMediaDetailRecgResultCustomsCustomClipsClip> clip) {
            this.clip = clip;
            return this;
        }
        public java.util.List<QueryMediaDetailJobListResponseBodyJobListJobMediaDetailResultMediaDetailRecgResultsMediaDetailRecgResultCustomsCustomClipsClip> getClip() {
            return this.clip;
        }

    }

    public static class QueryMediaDetailJobListResponseBodyJobListJobMediaDetailResultMediaDetailRecgResultsMediaDetailRecgResultCustomsCustom extends TeaModel {
        @NameInMap("Clips")
        public QueryMediaDetailJobListResponseBodyJobListJobMediaDetailResultMediaDetailRecgResultsMediaDetailRecgResultCustomsCustomClips clips;

        @NameInMap("Name")
        public String name;

        public static QueryMediaDetailJobListResponseBodyJobListJobMediaDetailResultMediaDetailRecgResultsMediaDetailRecgResultCustomsCustom build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaDetailJobListResponseBodyJobListJobMediaDetailResultMediaDetailRecgResultsMediaDetailRecgResultCustomsCustom self = new QueryMediaDetailJobListResponseBodyJobListJobMediaDetailResultMediaDetailRecgResultsMediaDetailRecgResultCustomsCustom();
            return TeaModel.build(map, self);
        }

        public QueryMediaDetailJobListResponseBodyJobListJobMediaDetailResultMediaDetailRecgResultsMediaDetailRecgResultCustomsCustom setClips(QueryMediaDetailJobListResponseBodyJobListJobMediaDetailResultMediaDetailRecgResultsMediaDetailRecgResultCustomsCustomClips clips) {
            this.clips = clips;
            return this;
        }
        public QueryMediaDetailJobListResponseBodyJobListJobMediaDetailResultMediaDetailRecgResultsMediaDetailRecgResultCustomsCustomClips getClips() {
            return this.clips;
        }

        public QueryMediaDetailJobListResponseBodyJobListJobMediaDetailResultMediaDetailRecgResultsMediaDetailRecgResultCustomsCustom setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class QueryMediaDetailJobListResponseBodyJobListJobMediaDetailResultMediaDetailRecgResultsMediaDetailRecgResultCustoms extends TeaModel {
        @NameInMap("Custom")
        public java.util.List<QueryMediaDetailJobListResponseBodyJobListJobMediaDetailResultMediaDetailRecgResultsMediaDetailRecgResultCustomsCustom> custom;

        public static QueryMediaDetailJobListResponseBodyJobListJobMediaDetailResultMediaDetailRecgResultsMediaDetailRecgResultCustoms build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaDetailJobListResponseBodyJobListJobMediaDetailResultMediaDetailRecgResultsMediaDetailRecgResultCustoms self = new QueryMediaDetailJobListResponseBodyJobListJobMediaDetailResultMediaDetailRecgResultsMediaDetailRecgResultCustoms();
            return TeaModel.build(map, self);
        }

        public QueryMediaDetailJobListResponseBodyJobListJobMediaDetailResultMediaDetailRecgResultsMediaDetailRecgResultCustoms setCustom(java.util.List<QueryMediaDetailJobListResponseBodyJobListJobMediaDetailResultMediaDetailRecgResultsMediaDetailRecgResultCustomsCustom> custom) {
            this.custom = custom;
            return this;
        }
        public java.util.List<QueryMediaDetailJobListResponseBodyJobListJobMediaDetailResultMediaDetailRecgResultsMediaDetailRecgResultCustomsCustom> getCustom() {
            return this.custom;
        }

    }

    public static class QueryMediaDetailJobListResponseBodyJobListJobMediaDetailResultMediaDetailRecgResultsMediaDetailRecgResultFrameTagInfosFrameTagInfo extends TeaModel {
        @NameInMap("Category")
        public String category;

        @NameInMap("Score")
        public String score;

        @NameInMap("Tag")
        public String tag;

        public static QueryMediaDetailJobListResponseBodyJobListJobMediaDetailResultMediaDetailRecgResultsMediaDetailRecgResultFrameTagInfosFrameTagInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaDetailJobListResponseBodyJobListJobMediaDetailResultMediaDetailRecgResultsMediaDetailRecgResultFrameTagInfosFrameTagInfo self = new QueryMediaDetailJobListResponseBodyJobListJobMediaDetailResultMediaDetailRecgResultsMediaDetailRecgResultFrameTagInfosFrameTagInfo();
            return TeaModel.build(map, self);
        }

        public QueryMediaDetailJobListResponseBodyJobListJobMediaDetailResultMediaDetailRecgResultsMediaDetailRecgResultFrameTagInfosFrameTagInfo setCategory(String category) {
            this.category = category;
            return this;
        }
        public String getCategory() {
            return this.category;
        }

        public QueryMediaDetailJobListResponseBodyJobListJobMediaDetailResultMediaDetailRecgResultsMediaDetailRecgResultFrameTagInfosFrameTagInfo setScore(String score) {
            this.score = score;
            return this;
        }
        public String getScore() {
            return this.score;
        }

        public QueryMediaDetailJobListResponseBodyJobListJobMediaDetailResultMediaDetailRecgResultsMediaDetailRecgResultFrameTagInfosFrameTagInfo setTag(String tag) {
            this.tag = tag;
            return this;
        }
        public String getTag() {
            return this.tag;
        }

    }

    public static class QueryMediaDetailJobListResponseBodyJobListJobMediaDetailResultMediaDetailRecgResultsMediaDetailRecgResultFrameTagInfos extends TeaModel {
        @NameInMap("FrameTagInfo")
        public java.util.List<QueryMediaDetailJobListResponseBodyJobListJobMediaDetailResultMediaDetailRecgResultsMediaDetailRecgResultFrameTagInfosFrameTagInfo> frameTagInfo;

        public static QueryMediaDetailJobListResponseBodyJobListJobMediaDetailResultMediaDetailRecgResultsMediaDetailRecgResultFrameTagInfos build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaDetailJobListResponseBodyJobListJobMediaDetailResultMediaDetailRecgResultsMediaDetailRecgResultFrameTagInfos self = new QueryMediaDetailJobListResponseBodyJobListJobMediaDetailResultMediaDetailRecgResultsMediaDetailRecgResultFrameTagInfos();
            return TeaModel.build(map, self);
        }

        public QueryMediaDetailJobListResponseBodyJobListJobMediaDetailResultMediaDetailRecgResultsMediaDetailRecgResultFrameTagInfos setFrameTagInfo(java.util.List<QueryMediaDetailJobListResponseBodyJobListJobMediaDetailResultMediaDetailRecgResultsMediaDetailRecgResultFrameTagInfosFrameTagInfo> frameTagInfo) {
            this.frameTagInfo = frameTagInfo;
            return this;
        }
        public java.util.List<QueryMediaDetailJobListResponseBodyJobListJobMediaDetailResultMediaDetailRecgResultsMediaDetailRecgResultFrameTagInfosFrameTagInfo> getFrameTagInfo() {
            return this.frameTagInfo;
        }

    }

    public static class QueryMediaDetailJobListResponseBodyJobListJobMediaDetailResultMediaDetailRecgResultsMediaDetailRecgResultFrameTags extends TeaModel {
        @NameInMap("String")
        public java.util.List<String> string;

        public static QueryMediaDetailJobListResponseBodyJobListJobMediaDetailResultMediaDetailRecgResultsMediaDetailRecgResultFrameTags build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaDetailJobListResponseBodyJobListJobMediaDetailResultMediaDetailRecgResultsMediaDetailRecgResultFrameTags self = new QueryMediaDetailJobListResponseBodyJobListJobMediaDetailResultMediaDetailRecgResultsMediaDetailRecgResultFrameTags();
            return TeaModel.build(map, self);
        }

        public QueryMediaDetailJobListResponseBodyJobListJobMediaDetailResultMediaDetailRecgResultsMediaDetailRecgResultFrameTags setString(java.util.List<String> string) {
            this.string = string;
            return this;
        }
        public java.util.List<String> getString() {
            return this.string;
        }

    }

    public static class QueryMediaDetailJobListResponseBodyJobListJobMediaDetailResultMediaDetailRecgResultsMediaDetailRecgResultPoliticiansPolitician extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Score")
        public String score;

        @NameInMap("Target")
        public String target;

        public static QueryMediaDetailJobListResponseBodyJobListJobMediaDetailResultMediaDetailRecgResultsMediaDetailRecgResultPoliticiansPolitician build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaDetailJobListResponseBodyJobListJobMediaDetailResultMediaDetailRecgResultsMediaDetailRecgResultPoliticiansPolitician self = new QueryMediaDetailJobListResponseBodyJobListJobMediaDetailResultMediaDetailRecgResultsMediaDetailRecgResultPoliticiansPolitician();
            return TeaModel.build(map, self);
        }

        public QueryMediaDetailJobListResponseBodyJobListJobMediaDetailResultMediaDetailRecgResultsMediaDetailRecgResultPoliticiansPolitician setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryMediaDetailJobListResponseBodyJobListJobMediaDetailResultMediaDetailRecgResultsMediaDetailRecgResultPoliticiansPolitician setScore(String score) {
            this.score = score;
            return this;
        }
        public String getScore() {
            return this.score;
        }

        public QueryMediaDetailJobListResponseBodyJobListJobMediaDetailResultMediaDetailRecgResultsMediaDetailRecgResultPoliticiansPolitician setTarget(String target) {
            this.target = target;
            return this;
        }
        public String getTarget() {
            return this.target;
        }

    }

    public static class QueryMediaDetailJobListResponseBodyJobListJobMediaDetailResultMediaDetailRecgResultsMediaDetailRecgResultPoliticians extends TeaModel {
        @NameInMap("Politician")
        public java.util.List<QueryMediaDetailJobListResponseBodyJobListJobMediaDetailResultMediaDetailRecgResultsMediaDetailRecgResultPoliticiansPolitician> politician;

        public static QueryMediaDetailJobListResponseBodyJobListJobMediaDetailResultMediaDetailRecgResultsMediaDetailRecgResultPoliticians build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaDetailJobListResponseBodyJobListJobMediaDetailResultMediaDetailRecgResultsMediaDetailRecgResultPoliticians self = new QueryMediaDetailJobListResponseBodyJobListJobMediaDetailResultMediaDetailRecgResultsMediaDetailRecgResultPoliticians();
            return TeaModel.build(map, self);
        }

        public QueryMediaDetailJobListResponseBodyJobListJobMediaDetailResultMediaDetailRecgResultsMediaDetailRecgResultPoliticians setPolitician(java.util.List<QueryMediaDetailJobListResponseBodyJobListJobMediaDetailResultMediaDetailRecgResultsMediaDetailRecgResultPoliticiansPolitician> politician) {
            this.politician = politician;
            return this;
        }
        public java.util.List<QueryMediaDetailJobListResponseBodyJobListJobMediaDetailResultMediaDetailRecgResultsMediaDetailRecgResultPoliticiansPolitician> getPolitician() {
            return this.politician;
        }

    }

    public static class QueryMediaDetailJobListResponseBodyJobListJobMediaDetailResultMediaDetailRecgResultsMediaDetailRecgResultSensitivesSensitive extends TeaModel {
        @NameInMap("Name")
        public String name;

        @NameInMap("Score")
        public String score;

        @NameInMap("Target")
        public String target;

        public static QueryMediaDetailJobListResponseBodyJobListJobMediaDetailResultMediaDetailRecgResultsMediaDetailRecgResultSensitivesSensitive build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaDetailJobListResponseBodyJobListJobMediaDetailResultMediaDetailRecgResultsMediaDetailRecgResultSensitivesSensitive self = new QueryMediaDetailJobListResponseBodyJobListJobMediaDetailResultMediaDetailRecgResultsMediaDetailRecgResultSensitivesSensitive();
            return TeaModel.build(map, self);
        }

        public QueryMediaDetailJobListResponseBodyJobListJobMediaDetailResultMediaDetailRecgResultsMediaDetailRecgResultSensitivesSensitive setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryMediaDetailJobListResponseBodyJobListJobMediaDetailResultMediaDetailRecgResultsMediaDetailRecgResultSensitivesSensitive setScore(String score) {
            this.score = score;
            return this;
        }
        public String getScore() {
            return this.score;
        }

        public QueryMediaDetailJobListResponseBodyJobListJobMediaDetailResultMediaDetailRecgResultsMediaDetailRecgResultSensitivesSensitive setTarget(String target) {
            this.target = target;
            return this;
        }
        public String getTarget() {
            return this.target;
        }

    }

    public static class QueryMediaDetailJobListResponseBodyJobListJobMediaDetailResultMediaDetailRecgResultsMediaDetailRecgResultSensitives extends TeaModel {
        @NameInMap("Sensitive")
        public java.util.List<QueryMediaDetailJobListResponseBodyJobListJobMediaDetailResultMediaDetailRecgResultsMediaDetailRecgResultSensitivesSensitive> sensitive;

        public static QueryMediaDetailJobListResponseBodyJobListJobMediaDetailResultMediaDetailRecgResultsMediaDetailRecgResultSensitives build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaDetailJobListResponseBodyJobListJobMediaDetailResultMediaDetailRecgResultsMediaDetailRecgResultSensitives self = new QueryMediaDetailJobListResponseBodyJobListJobMediaDetailResultMediaDetailRecgResultsMediaDetailRecgResultSensitives();
            return TeaModel.build(map, self);
        }

        public QueryMediaDetailJobListResponseBodyJobListJobMediaDetailResultMediaDetailRecgResultsMediaDetailRecgResultSensitives setSensitive(java.util.List<QueryMediaDetailJobListResponseBodyJobListJobMediaDetailResultMediaDetailRecgResultsMediaDetailRecgResultSensitivesSensitive> sensitive) {
            this.sensitive = sensitive;
            return this;
        }
        public java.util.List<QueryMediaDetailJobListResponseBodyJobListJobMediaDetailResultMediaDetailRecgResultsMediaDetailRecgResultSensitivesSensitive> getSensitive() {
            return this.sensitive;
        }

    }

    public static class QueryMediaDetailJobListResponseBodyJobListJobMediaDetailResultMediaDetailRecgResultsMediaDetailRecgResult extends TeaModel {
        @NameInMap("Celebrities")
        public QueryMediaDetailJobListResponseBodyJobListJobMediaDetailResultMediaDetailRecgResultsMediaDetailRecgResultCelebrities celebrities;

        @NameInMap("Customs")
        public QueryMediaDetailJobListResponseBodyJobListJobMediaDetailResultMediaDetailRecgResultsMediaDetailRecgResultCustoms customs;

        @NameInMap("FrameTagInfos")
        public QueryMediaDetailJobListResponseBodyJobListJobMediaDetailResultMediaDetailRecgResultsMediaDetailRecgResultFrameTagInfos frameTagInfos;

        @NameInMap("FrameTags")
        public QueryMediaDetailJobListResponseBodyJobListJobMediaDetailResultMediaDetailRecgResultsMediaDetailRecgResultFrameTags frameTags;

        @NameInMap("ImageUrl")
        public String imageUrl;

        @NameInMap("OcrText")
        public String ocrText;

        @NameInMap("Politicians")
        public QueryMediaDetailJobListResponseBodyJobListJobMediaDetailResultMediaDetailRecgResultsMediaDetailRecgResultPoliticians politicians;

        @NameInMap("Sensitives")
        public QueryMediaDetailJobListResponseBodyJobListJobMediaDetailResultMediaDetailRecgResultsMediaDetailRecgResultSensitives sensitives;

        @NameInMap("Time")
        public String time;

        public static QueryMediaDetailJobListResponseBodyJobListJobMediaDetailResultMediaDetailRecgResultsMediaDetailRecgResult build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaDetailJobListResponseBodyJobListJobMediaDetailResultMediaDetailRecgResultsMediaDetailRecgResult self = new QueryMediaDetailJobListResponseBodyJobListJobMediaDetailResultMediaDetailRecgResultsMediaDetailRecgResult();
            return TeaModel.build(map, self);
        }

        public QueryMediaDetailJobListResponseBodyJobListJobMediaDetailResultMediaDetailRecgResultsMediaDetailRecgResult setCelebrities(QueryMediaDetailJobListResponseBodyJobListJobMediaDetailResultMediaDetailRecgResultsMediaDetailRecgResultCelebrities celebrities) {
            this.celebrities = celebrities;
            return this;
        }
        public QueryMediaDetailJobListResponseBodyJobListJobMediaDetailResultMediaDetailRecgResultsMediaDetailRecgResultCelebrities getCelebrities() {
            return this.celebrities;
        }

        public QueryMediaDetailJobListResponseBodyJobListJobMediaDetailResultMediaDetailRecgResultsMediaDetailRecgResult setCustoms(QueryMediaDetailJobListResponseBodyJobListJobMediaDetailResultMediaDetailRecgResultsMediaDetailRecgResultCustoms customs) {
            this.customs = customs;
            return this;
        }
        public QueryMediaDetailJobListResponseBodyJobListJobMediaDetailResultMediaDetailRecgResultsMediaDetailRecgResultCustoms getCustoms() {
            return this.customs;
        }

        public QueryMediaDetailJobListResponseBodyJobListJobMediaDetailResultMediaDetailRecgResultsMediaDetailRecgResult setFrameTagInfos(QueryMediaDetailJobListResponseBodyJobListJobMediaDetailResultMediaDetailRecgResultsMediaDetailRecgResultFrameTagInfos frameTagInfos) {
            this.frameTagInfos = frameTagInfos;
            return this;
        }
        public QueryMediaDetailJobListResponseBodyJobListJobMediaDetailResultMediaDetailRecgResultsMediaDetailRecgResultFrameTagInfos getFrameTagInfos() {
            return this.frameTagInfos;
        }

        public QueryMediaDetailJobListResponseBodyJobListJobMediaDetailResultMediaDetailRecgResultsMediaDetailRecgResult setFrameTags(QueryMediaDetailJobListResponseBodyJobListJobMediaDetailResultMediaDetailRecgResultsMediaDetailRecgResultFrameTags frameTags) {
            this.frameTags = frameTags;
            return this;
        }
        public QueryMediaDetailJobListResponseBodyJobListJobMediaDetailResultMediaDetailRecgResultsMediaDetailRecgResultFrameTags getFrameTags() {
            return this.frameTags;
        }

        public QueryMediaDetailJobListResponseBodyJobListJobMediaDetailResultMediaDetailRecgResultsMediaDetailRecgResult setImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }
        public String getImageUrl() {
            return this.imageUrl;
        }

        public QueryMediaDetailJobListResponseBodyJobListJobMediaDetailResultMediaDetailRecgResultsMediaDetailRecgResult setOcrText(String ocrText) {
            this.ocrText = ocrText;
            return this;
        }
        public String getOcrText() {
            return this.ocrText;
        }

        public QueryMediaDetailJobListResponseBodyJobListJobMediaDetailResultMediaDetailRecgResultsMediaDetailRecgResult setPoliticians(QueryMediaDetailJobListResponseBodyJobListJobMediaDetailResultMediaDetailRecgResultsMediaDetailRecgResultPoliticians politicians) {
            this.politicians = politicians;
            return this;
        }
        public QueryMediaDetailJobListResponseBodyJobListJobMediaDetailResultMediaDetailRecgResultsMediaDetailRecgResultPoliticians getPoliticians() {
            return this.politicians;
        }

        public QueryMediaDetailJobListResponseBodyJobListJobMediaDetailResultMediaDetailRecgResultsMediaDetailRecgResult setSensitives(QueryMediaDetailJobListResponseBodyJobListJobMediaDetailResultMediaDetailRecgResultsMediaDetailRecgResultSensitives sensitives) {
            this.sensitives = sensitives;
            return this;
        }
        public QueryMediaDetailJobListResponseBodyJobListJobMediaDetailResultMediaDetailRecgResultsMediaDetailRecgResultSensitives getSensitives() {
            return this.sensitives;
        }

        public QueryMediaDetailJobListResponseBodyJobListJobMediaDetailResultMediaDetailRecgResultsMediaDetailRecgResult setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
        }

    }

    public static class QueryMediaDetailJobListResponseBodyJobListJobMediaDetailResultMediaDetailRecgResults extends TeaModel {
        @NameInMap("MediaDetailRecgResult")
        public java.util.List<QueryMediaDetailJobListResponseBodyJobListJobMediaDetailResultMediaDetailRecgResultsMediaDetailRecgResult> mediaDetailRecgResult;

        public static QueryMediaDetailJobListResponseBodyJobListJobMediaDetailResultMediaDetailRecgResults build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaDetailJobListResponseBodyJobListJobMediaDetailResultMediaDetailRecgResults self = new QueryMediaDetailJobListResponseBodyJobListJobMediaDetailResultMediaDetailRecgResults();
            return TeaModel.build(map, self);
        }

        public QueryMediaDetailJobListResponseBodyJobListJobMediaDetailResultMediaDetailRecgResults setMediaDetailRecgResult(java.util.List<QueryMediaDetailJobListResponseBodyJobListJobMediaDetailResultMediaDetailRecgResultsMediaDetailRecgResult> mediaDetailRecgResult) {
            this.mediaDetailRecgResult = mediaDetailRecgResult;
            return this;
        }
        public java.util.List<QueryMediaDetailJobListResponseBodyJobListJobMediaDetailResultMediaDetailRecgResultsMediaDetailRecgResult> getMediaDetailRecgResult() {
            return this.mediaDetailRecgResult;
        }

    }

    public static class QueryMediaDetailJobListResponseBodyJobListJobMediaDetailResultTags extends TeaModel {
        @NameInMap("String")
        public java.util.List<String> string;

        public static QueryMediaDetailJobListResponseBodyJobListJobMediaDetailResultTags build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaDetailJobListResponseBodyJobListJobMediaDetailResultTags self = new QueryMediaDetailJobListResponseBodyJobListJobMediaDetailResultTags();
            return TeaModel.build(map, self);
        }

        public QueryMediaDetailJobListResponseBodyJobListJobMediaDetailResultTags setString(java.util.List<String> string) {
            this.string = string;
            return this;
        }
        public java.util.List<String> getString() {
            return this.string;
        }

    }

    public static class QueryMediaDetailJobListResponseBodyJobListJobMediaDetailResult extends TeaModel {
        @NameInMap("MediaDetailRecgResults")
        public QueryMediaDetailJobListResponseBodyJobListJobMediaDetailResultMediaDetailRecgResults mediaDetailRecgResults;

        @NameInMap("Status")
        public String status;

        @NameInMap("Tags")
        public QueryMediaDetailJobListResponseBodyJobListJobMediaDetailResultTags tags;

        public static QueryMediaDetailJobListResponseBodyJobListJobMediaDetailResult build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaDetailJobListResponseBodyJobListJobMediaDetailResult self = new QueryMediaDetailJobListResponseBodyJobListJobMediaDetailResult();
            return TeaModel.build(map, self);
        }

        public QueryMediaDetailJobListResponseBodyJobListJobMediaDetailResult setMediaDetailRecgResults(QueryMediaDetailJobListResponseBodyJobListJobMediaDetailResultMediaDetailRecgResults mediaDetailRecgResults) {
            this.mediaDetailRecgResults = mediaDetailRecgResults;
            return this;
        }
        public QueryMediaDetailJobListResponseBodyJobListJobMediaDetailResultMediaDetailRecgResults getMediaDetailRecgResults() {
            return this.mediaDetailRecgResults;
        }

        public QueryMediaDetailJobListResponseBodyJobListJobMediaDetailResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public QueryMediaDetailJobListResponseBodyJobListJobMediaDetailResult setTags(QueryMediaDetailJobListResponseBodyJobListJobMediaDetailResultTags tags) {
            this.tags = tags;
            return this;
        }
        public QueryMediaDetailJobListResponseBodyJobListJobMediaDetailResultTags getTags() {
            return this.tags;
        }

    }

    public static class QueryMediaDetailJobListResponseBodyJobListJob extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("Id")
        public String id;

        @NameInMap("Input")
        public QueryMediaDetailJobListResponseBodyJobListJobInput input;

        @NameInMap("MediaDetailConfig")
        public QueryMediaDetailJobListResponseBodyJobListJobMediaDetailConfig mediaDetailConfig;

        @NameInMap("MediaDetailResult")
        public QueryMediaDetailJobListResponseBodyJobListJobMediaDetailResult mediaDetailResult;

        @NameInMap("Message")
        public String message;

        @NameInMap("PipelineId")
        public String pipelineId;

        @NameInMap("State")
        public String state;

        @NameInMap("UserData")
        public String userData;

        public static QueryMediaDetailJobListResponseBodyJobListJob build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaDetailJobListResponseBodyJobListJob self = new QueryMediaDetailJobListResponseBodyJobListJob();
            return TeaModel.build(map, self);
        }

        public QueryMediaDetailJobListResponseBodyJobListJob setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryMediaDetailJobListResponseBodyJobListJob setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public QueryMediaDetailJobListResponseBodyJobListJob setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryMediaDetailJobListResponseBodyJobListJob setInput(QueryMediaDetailJobListResponseBodyJobListJobInput input) {
            this.input = input;
            return this;
        }
        public QueryMediaDetailJobListResponseBodyJobListJobInput getInput() {
            return this.input;
        }

        public QueryMediaDetailJobListResponseBodyJobListJob setMediaDetailConfig(QueryMediaDetailJobListResponseBodyJobListJobMediaDetailConfig mediaDetailConfig) {
            this.mediaDetailConfig = mediaDetailConfig;
            return this;
        }
        public QueryMediaDetailJobListResponseBodyJobListJobMediaDetailConfig getMediaDetailConfig() {
            return this.mediaDetailConfig;
        }

        public QueryMediaDetailJobListResponseBodyJobListJob setMediaDetailResult(QueryMediaDetailJobListResponseBodyJobListJobMediaDetailResult mediaDetailResult) {
            this.mediaDetailResult = mediaDetailResult;
            return this;
        }
        public QueryMediaDetailJobListResponseBodyJobListJobMediaDetailResult getMediaDetailResult() {
            return this.mediaDetailResult;
        }

        public QueryMediaDetailJobListResponseBodyJobListJob setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public QueryMediaDetailJobListResponseBodyJobListJob setPipelineId(String pipelineId) {
            this.pipelineId = pipelineId;
            return this;
        }
        public String getPipelineId() {
            return this.pipelineId;
        }

        public QueryMediaDetailJobListResponseBodyJobListJob setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public QueryMediaDetailJobListResponseBodyJobListJob setUserData(String userData) {
            this.userData = userData;
            return this;
        }
        public String getUserData() {
            return this.userData;
        }

    }

    public static class QueryMediaDetailJobListResponseBodyJobList extends TeaModel {
        @NameInMap("Job")
        public java.util.List<QueryMediaDetailJobListResponseBodyJobListJob> job;

        public static QueryMediaDetailJobListResponseBodyJobList build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaDetailJobListResponseBodyJobList self = new QueryMediaDetailJobListResponseBodyJobList();
            return TeaModel.build(map, self);
        }

        public QueryMediaDetailJobListResponseBodyJobList setJob(java.util.List<QueryMediaDetailJobListResponseBodyJobListJob> job) {
            this.job = job;
            return this;
        }
        public java.util.List<QueryMediaDetailJobListResponseBodyJobListJob> getJob() {
            return this.job;
        }

    }

    public static class QueryMediaDetailJobListResponseBodyNonExistIds extends TeaModel {
        @NameInMap("String")
        public java.util.List<String> string;

        public static QueryMediaDetailJobListResponseBodyNonExistIds build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaDetailJobListResponseBodyNonExistIds self = new QueryMediaDetailJobListResponseBodyNonExistIds();
            return TeaModel.build(map, self);
        }

        public QueryMediaDetailJobListResponseBodyNonExistIds setString(java.util.List<String> string) {
            this.string = string;
            return this;
        }
        public java.util.List<String> getString() {
            return this.string;
        }

    }

}
