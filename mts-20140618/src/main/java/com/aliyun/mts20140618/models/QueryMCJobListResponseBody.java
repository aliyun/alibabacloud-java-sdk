// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class QueryMCJobListResponseBody extends TeaModel {
    @NameInMap("JobList")
    public QueryMCJobListResponseBodyJobList jobList;

    @NameInMap("NextPageToken")
    public String nextPageToken;

    @NameInMap("NonExistIds")
    public QueryMCJobListResponseBodyNonExistIds nonExistIds;

    @NameInMap("RequestId")
    public String requestId;

    public static QueryMCJobListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryMCJobListResponseBody self = new QueryMCJobListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryMCJobListResponseBody setJobList(QueryMCJobListResponseBodyJobList jobList) {
        this.jobList = jobList;
        return this;
    }
    public QueryMCJobListResponseBodyJobList getJobList() {
        return this.jobList;
    }

    public QueryMCJobListResponseBody setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
        return this;
    }
    public String getNextPageToken() {
        return this.nextPageToken;
    }

    public QueryMCJobListResponseBody setNonExistIds(QueryMCJobListResponseBodyNonExistIds nonExistIds) {
        this.nonExistIds = nonExistIds;
        return this;
    }
    public QueryMCJobListResponseBodyNonExistIds getNonExistIds() {
        return this.nonExistIds;
    }

    public QueryMCJobListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class QueryMCJobListResponseBodyJobListJobResultAbuseResultAbuseAudiosAbuseAudio extends TeaModel {
        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("Object")
        public String object;

        @NameInMap("Score")
        public String score;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("Suggestion")
        public String suggestion;

        @NameInMap("Text")
        public String text;

        public static QueryMCJobListResponseBodyJobListJobResultAbuseResultAbuseAudiosAbuseAudio build(java.util.Map<String, ?> map) throws Exception {
            QueryMCJobListResponseBodyJobListJobResultAbuseResultAbuseAudiosAbuseAudio self = new QueryMCJobListResponseBodyJobListJobResultAbuseResultAbuseAudiosAbuseAudio();
            return TeaModel.build(map, self);
        }

        public QueryMCJobListResponseBodyJobListJobResultAbuseResultAbuseAudiosAbuseAudio setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public QueryMCJobListResponseBodyJobListJobResultAbuseResultAbuseAudiosAbuseAudio setObject(String object) {
            this.object = object;
            return this;
        }
        public String getObject() {
            return this.object;
        }

        public QueryMCJobListResponseBodyJobListJobResultAbuseResultAbuseAudiosAbuseAudio setScore(String score) {
            this.score = score;
            return this;
        }
        public String getScore() {
            return this.score;
        }

        public QueryMCJobListResponseBodyJobListJobResultAbuseResultAbuseAudiosAbuseAudio setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public QueryMCJobListResponseBodyJobListJobResultAbuseResultAbuseAudiosAbuseAudio setSuggestion(String suggestion) {
            this.suggestion = suggestion;
            return this;
        }
        public String getSuggestion() {
            return this.suggestion;
        }

        public QueryMCJobListResponseBodyJobListJobResultAbuseResultAbuseAudiosAbuseAudio setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class QueryMCJobListResponseBodyJobListJobResultAbuseResultAbuseAudios extends TeaModel {
        @NameInMap("AbuseAudio")
        public java.util.List<QueryMCJobListResponseBodyJobListJobResultAbuseResultAbuseAudiosAbuseAudio> abuseAudio;

        public static QueryMCJobListResponseBodyJobListJobResultAbuseResultAbuseAudios build(java.util.Map<String, ?> map) throws Exception {
            QueryMCJobListResponseBodyJobListJobResultAbuseResultAbuseAudios self = new QueryMCJobListResponseBodyJobListJobResultAbuseResultAbuseAudios();
            return TeaModel.build(map, self);
        }

        public QueryMCJobListResponseBodyJobListJobResultAbuseResultAbuseAudios setAbuseAudio(java.util.List<QueryMCJobListResponseBodyJobListJobResultAbuseResultAbuseAudiosAbuseAudio> abuseAudio) {
            this.abuseAudio = abuseAudio;
            return this;
        }
        public java.util.List<QueryMCJobListResponseBodyJobListJobResultAbuseResultAbuseAudiosAbuseAudio> getAbuseAudio() {
            return this.abuseAudio;
        }

    }

    public static class QueryMCJobListResponseBodyJobListJobResultAbuseResultAbuseOcrsAbuseOcr extends TeaModel {
        @NameInMap("Object")
        public String object;

        @NameInMap("Score")
        public String score;

        @NameInMap("Suggestion")
        public String suggestion;

        @NameInMap("Text")
        public String text;

        @NameInMap("Time")
        public String time;

        public static QueryMCJobListResponseBodyJobListJobResultAbuseResultAbuseOcrsAbuseOcr build(java.util.Map<String, ?> map) throws Exception {
            QueryMCJobListResponseBodyJobListJobResultAbuseResultAbuseOcrsAbuseOcr self = new QueryMCJobListResponseBodyJobListJobResultAbuseResultAbuseOcrsAbuseOcr();
            return TeaModel.build(map, self);
        }

        public QueryMCJobListResponseBodyJobListJobResultAbuseResultAbuseOcrsAbuseOcr setObject(String object) {
            this.object = object;
            return this;
        }
        public String getObject() {
            return this.object;
        }

        public QueryMCJobListResponseBodyJobListJobResultAbuseResultAbuseOcrsAbuseOcr setScore(String score) {
            this.score = score;
            return this;
        }
        public String getScore() {
            return this.score;
        }

        public QueryMCJobListResponseBodyJobListJobResultAbuseResultAbuseOcrsAbuseOcr setSuggestion(String suggestion) {
            this.suggestion = suggestion;
            return this;
        }
        public String getSuggestion() {
            return this.suggestion;
        }

        public QueryMCJobListResponseBodyJobListJobResultAbuseResultAbuseOcrsAbuseOcr setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

        public QueryMCJobListResponseBodyJobListJobResultAbuseResultAbuseOcrsAbuseOcr setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
        }

    }

    public static class QueryMCJobListResponseBodyJobListJobResultAbuseResultAbuseOcrs extends TeaModel {
        @NameInMap("AbuseOcr")
        public java.util.List<QueryMCJobListResponseBodyJobListJobResultAbuseResultAbuseOcrsAbuseOcr> abuseOcr;

        public static QueryMCJobListResponseBodyJobListJobResultAbuseResultAbuseOcrs build(java.util.Map<String, ?> map) throws Exception {
            QueryMCJobListResponseBodyJobListJobResultAbuseResultAbuseOcrs self = new QueryMCJobListResponseBodyJobListJobResultAbuseResultAbuseOcrs();
            return TeaModel.build(map, self);
        }

        public QueryMCJobListResponseBodyJobListJobResultAbuseResultAbuseOcrs setAbuseOcr(java.util.List<QueryMCJobListResponseBodyJobListJobResultAbuseResultAbuseOcrsAbuseOcr> abuseOcr) {
            this.abuseOcr = abuseOcr;
            return this;
        }
        public java.util.List<QueryMCJobListResponseBodyJobListJobResultAbuseResultAbuseOcrsAbuseOcr> getAbuseOcr() {
            return this.abuseOcr;
        }

    }

    public static class QueryMCJobListResponseBodyJobListJobResultAbuseResultAbuseTextsAbuseText extends TeaModel {
        @NameInMap("Score")
        public String score;

        @NameInMap("Suggestion")
        public String suggestion;

        @NameInMap("Text")
        public String text;

        public static QueryMCJobListResponseBodyJobListJobResultAbuseResultAbuseTextsAbuseText build(java.util.Map<String, ?> map) throws Exception {
            QueryMCJobListResponseBodyJobListJobResultAbuseResultAbuseTextsAbuseText self = new QueryMCJobListResponseBodyJobListJobResultAbuseResultAbuseTextsAbuseText();
            return TeaModel.build(map, self);
        }

        public QueryMCJobListResponseBodyJobListJobResultAbuseResultAbuseTextsAbuseText setScore(String score) {
            this.score = score;
            return this;
        }
        public String getScore() {
            return this.score;
        }

        public QueryMCJobListResponseBodyJobListJobResultAbuseResultAbuseTextsAbuseText setSuggestion(String suggestion) {
            this.suggestion = suggestion;
            return this;
        }
        public String getSuggestion() {
            return this.suggestion;
        }

        public QueryMCJobListResponseBodyJobListJobResultAbuseResultAbuseTextsAbuseText setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class QueryMCJobListResponseBodyJobListJobResultAbuseResultAbuseTexts extends TeaModel {
        @NameInMap("AbuseText")
        public java.util.List<QueryMCJobListResponseBodyJobListJobResultAbuseResultAbuseTextsAbuseText> abuseText;

        public static QueryMCJobListResponseBodyJobListJobResultAbuseResultAbuseTexts build(java.util.Map<String, ?> map) throws Exception {
            QueryMCJobListResponseBodyJobListJobResultAbuseResultAbuseTexts self = new QueryMCJobListResponseBodyJobListJobResultAbuseResultAbuseTexts();
            return TeaModel.build(map, self);
        }

        public QueryMCJobListResponseBodyJobListJobResultAbuseResultAbuseTexts setAbuseText(java.util.List<QueryMCJobListResponseBodyJobListJobResultAbuseResultAbuseTextsAbuseText> abuseText) {
            this.abuseText = abuseText;
            return this;
        }
        public java.util.List<QueryMCJobListResponseBodyJobListJobResultAbuseResultAbuseTextsAbuseText> getAbuseText() {
            return this.abuseText;
        }

    }

    public static class QueryMCJobListResponseBodyJobListJobResultAbuseResult extends TeaModel {
        @NameInMap("AbuseAudios")
        public QueryMCJobListResponseBodyJobListJobResultAbuseResultAbuseAudios abuseAudios;

        @NameInMap("AbuseOcrs")
        public QueryMCJobListResponseBodyJobListJobResultAbuseResultAbuseOcrs abuseOcrs;

        @NameInMap("AbuseTexts")
        public QueryMCJobListResponseBodyJobListJobResultAbuseResultAbuseTexts abuseTexts;

        public static QueryMCJobListResponseBodyJobListJobResultAbuseResult build(java.util.Map<String, ?> map) throws Exception {
            QueryMCJobListResponseBodyJobListJobResultAbuseResult self = new QueryMCJobListResponseBodyJobListJobResultAbuseResult();
            return TeaModel.build(map, self);
        }

        public QueryMCJobListResponseBodyJobListJobResultAbuseResult setAbuseAudios(QueryMCJobListResponseBodyJobListJobResultAbuseResultAbuseAudios abuseAudios) {
            this.abuseAudios = abuseAudios;
            return this;
        }
        public QueryMCJobListResponseBodyJobListJobResultAbuseResultAbuseAudios getAbuseAudios() {
            return this.abuseAudios;
        }

        public QueryMCJobListResponseBodyJobListJobResultAbuseResult setAbuseOcrs(QueryMCJobListResponseBodyJobListJobResultAbuseResultAbuseOcrs abuseOcrs) {
            this.abuseOcrs = abuseOcrs;
            return this;
        }
        public QueryMCJobListResponseBodyJobListJobResultAbuseResultAbuseOcrs getAbuseOcrs() {
            return this.abuseOcrs;
        }

        public QueryMCJobListResponseBodyJobListJobResultAbuseResult setAbuseTexts(QueryMCJobListResponseBodyJobListJobResultAbuseResultAbuseTexts abuseTexts) {
            this.abuseTexts = abuseTexts;
            return this;
        }
        public QueryMCJobListResponseBodyJobListJobResultAbuseResultAbuseTexts getAbuseTexts() {
            return this.abuseTexts;
        }

    }

    public static class QueryMCJobListResponseBodyJobListJobResultAdResultAdAudiosAdAudio extends TeaModel {
        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("Object")
        public String object;

        @NameInMap("Score")
        public String score;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("Suggestion")
        public String suggestion;

        @NameInMap("Text")
        public String text;

        public static QueryMCJobListResponseBodyJobListJobResultAdResultAdAudiosAdAudio build(java.util.Map<String, ?> map) throws Exception {
            QueryMCJobListResponseBodyJobListJobResultAdResultAdAudiosAdAudio self = new QueryMCJobListResponseBodyJobListJobResultAdResultAdAudiosAdAudio();
            return TeaModel.build(map, self);
        }

        public QueryMCJobListResponseBodyJobListJobResultAdResultAdAudiosAdAudio setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public QueryMCJobListResponseBodyJobListJobResultAdResultAdAudiosAdAudio setObject(String object) {
            this.object = object;
            return this;
        }
        public String getObject() {
            return this.object;
        }

        public QueryMCJobListResponseBodyJobListJobResultAdResultAdAudiosAdAudio setScore(String score) {
            this.score = score;
            return this;
        }
        public String getScore() {
            return this.score;
        }

        public QueryMCJobListResponseBodyJobListJobResultAdResultAdAudiosAdAudio setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public QueryMCJobListResponseBodyJobListJobResultAdResultAdAudiosAdAudio setSuggestion(String suggestion) {
            this.suggestion = suggestion;
            return this;
        }
        public String getSuggestion() {
            return this.suggestion;
        }

        public QueryMCJobListResponseBodyJobListJobResultAdResultAdAudiosAdAudio setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class QueryMCJobListResponseBodyJobListJobResultAdResultAdAudios extends TeaModel {
        @NameInMap("AdAudio")
        public java.util.List<QueryMCJobListResponseBodyJobListJobResultAdResultAdAudiosAdAudio> adAudio;

        public static QueryMCJobListResponseBodyJobListJobResultAdResultAdAudios build(java.util.Map<String, ?> map) throws Exception {
            QueryMCJobListResponseBodyJobListJobResultAdResultAdAudios self = new QueryMCJobListResponseBodyJobListJobResultAdResultAdAudios();
            return TeaModel.build(map, self);
        }

        public QueryMCJobListResponseBodyJobListJobResultAdResultAdAudios setAdAudio(java.util.List<QueryMCJobListResponseBodyJobListJobResultAdResultAdAudiosAdAudio> adAudio) {
            this.adAudio = adAudio;
            return this;
        }
        public java.util.List<QueryMCJobListResponseBodyJobListJobResultAdResultAdAudiosAdAudio> getAdAudio() {
            return this.adAudio;
        }

    }

    public static class QueryMCJobListResponseBodyJobListJobResultAdResultAdImagesAdImage extends TeaModel {
        @NameInMap("Score")
        public String score;

        @NameInMap("Suggestion")
        public String suggestion;

        @NameInMap("Text")
        public String text;

        @NameInMap("Url")
        public String url;

        public static QueryMCJobListResponseBodyJobListJobResultAdResultAdImagesAdImage build(java.util.Map<String, ?> map) throws Exception {
            QueryMCJobListResponseBodyJobListJobResultAdResultAdImagesAdImage self = new QueryMCJobListResponseBodyJobListJobResultAdResultAdImagesAdImage();
            return TeaModel.build(map, self);
        }

        public QueryMCJobListResponseBodyJobListJobResultAdResultAdImagesAdImage setScore(String score) {
            this.score = score;
            return this;
        }
        public String getScore() {
            return this.score;
        }

        public QueryMCJobListResponseBodyJobListJobResultAdResultAdImagesAdImage setSuggestion(String suggestion) {
            this.suggestion = suggestion;
            return this;
        }
        public String getSuggestion() {
            return this.suggestion;
        }

        public QueryMCJobListResponseBodyJobListJobResultAdResultAdImagesAdImage setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

        public QueryMCJobListResponseBodyJobListJobResultAdResultAdImagesAdImage setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class QueryMCJobListResponseBodyJobListJobResultAdResultAdImages extends TeaModel {
        @NameInMap("AdImage")
        public java.util.List<QueryMCJobListResponseBodyJobListJobResultAdResultAdImagesAdImage> adImage;

        public static QueryMCJobListResponseBodyJobListJobResultAdResultAdImages build(java.util.Map<String, ?> map) throws Exception {
            QueryMCJobListResponseBodyJobListJobResultAdResultAdImages self = new QueryMCJobListResponseBodyJobListJobResultAdResultAdImages();
            return TeaModel.build(map, self);
        }

        public QueryMCJobListResponseBodyJobListJobResultAdResultAdImages setAdImage(java.util.List<QueryMCJobListResponseBodyJobListJobResultAdResultAdImagesAdImage> adImage) {
            this.adImage = adImage;
            return this;
        }
        public java.util.List<QueryMCJobListResponseBodyJobListJobResultAdResultAdImagesAdImage> getAdImage() {
            return this.adImage;
        }

    }

    public static class QueryMCJobListResponseBodyJobListJobResultAdResultAdOcrsAdOcr extends TeaModel {
        @NameInMap("Object")
        public String object;

        @NameInMap("Score")
        public String score;

        @NameInMap("Suggestion")
        public String suggestion;

        @NameInMap("Text")
        public String text;

        @NameInMap("Time")
        public String time;

        public static QueryMCJobListResponseBodyJobListJobResultAdResultAdOcrsAdOcr build(java.util.Map<String, ?> map) throws Exception {
            QueryMCJobListResponseBodyJobListJobResultAdResultAdOcrsAdOcr self = new QueryMCJobListResponseBodyJobListJobResultAdResultAdOcrsAdOcr();
            return TeaModel.build(map, self);
        }

        public QueryMCJobListResponseBodyJobListJobResultAdResultAdOcrsAdOcr setObject(String object) {
            this.object = object;
            return this;
        }
        public String getObject() {
            return this.object;
        }

        public QueryMCJobListResponseBodyJobListJobResultAdResultAdOcrsAdOcr setScore(String score) {
            this.score = score;
            return this;
        }
        public String getScore() {
            return this.score;
        }

        public QueryMCJobListResponseBodyJobListJobResultAdResultAdOcrsAdOcr setSuggestion(String suggestion) {
            this.suggestion = suggestion;
            return this;
        }
        public String getSuggestion() {
            return this.suggestion;
        }

        public QueryMCJobListResponseBodyJobListJobResultAdResultAdOcrsAdOcr setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

        public QueryMCJobListResponseBodyJobListJobResultAdResultAdOcrsAdOcr setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
        }

    }

    public static class QueryMCJobListResponseBodyJobListJobResultAdResultAdOcrs extends TeaModel {
        @NameInMap("AdOcr")
        public java.util.List<QueryMCJobListResponseBodyJobListJobResultAdResultAdOcrsAdOcr> adOcr;

        public static QueryMCJobListResponseBodyJobListJobResultAdResultAdOcrs build(java.util.Map<String, ?> map) throws Exception {
            QueryMCJobListResponseBodyJobListJobResultAdResultAdOcrs self = new QueryMCJobListResponseBodyJobListJobResultAdResultAdOcrs();
            return TeaModel.build(map, self);
        }

        public QueryMCJobListResponseBodyJobListJobResultAdResultAdOcrs setAdOcr(java.util.List<QueryMCJobListResponseBodyJobListJobResultAdResultAdOcrsAdOcr> adOcr) {
            this.adOcr = adOcr;
            return this;
        }
        public java.util.List<QueryMCJobListResponseBodyJobListJobResultAdResultAdOcrsAdOcr> getAdOcr() {
            return this.adOcr;
        }

    }

    public static class QueryMCJobListResponseBodyJobListJobResultAdResultAdTextsAdText extends TeaModel {
        @NameInMap("Score")
        public String score;

        @NameInMap("Suggestion")
        public String suggestion;

        @NameInMap("Text")
        public String text;

        public static QueryMCJobListResponseBodyJobListJobResultAdResultAdTextsAdText build(java.util.Map<String, ?> map) throws Exception {
            QueryMCJobListResponseBodyJobListJobResultAdResultAdTextsAdText self = new QueryMCJobListResponseBodyJobListJobResultAdResultAdTextsAdText();
            return TeaModel.build(map, self);
        }

        public QueryMCJobListResponseBodyJobListJobResultAdResultAdTextsAdText setScore(String score) {
            this.score = score;
            return this;
        }
        public String getScore() {
            return this.score;
        }

        public QueryMCJobListResponseBodyJobListJobResultAdResultAdTextsAdText setSuggestion(String suggestion) {
            this.suggestion = suggestion;
            return this;
        }
        public String getSuggestion() {
            return this.suggestion;
        }

        public QueryMCJobListResponseBodyJobListJobResultAdResultAdTextsAdText setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class QueryMCJobListResponseBodyJobListJobResultAdResultAdTexts extends TeaModel {
        @NameInMap("AdText")
        public java.util.List<QueryMCJobListResponseBodyJobListJobResultAdResultAdTextsAdText> adText;

        public static QueryMCJobListResponseBodyJobListJobResultAdResultAdTexts build(java.util.Map<String, ?> map) throws Exception {
            QueryMCJobListResponseBodyJobListJobResultAdResultAdTexts self = new QueryMCJobListResponseBodyJobListJobResultAdResultAdTexts();
            return TeaModel.build(map, self);
        }

        public QueryMCJobListResponseBodyJobListJobResultAdResultAdTexts setAdText(java.util.List<QueryMCJobListResponseBodyJobListJobResultAdResultAdTextsAdText> adText) {
            this.adText = adText;
            return this;
        }
        public java.util.List<QueryMCJobListResponseBodyJobListJobResultAdResultAdTextsAdText> getAdText() {
            return this.adText;
        }

    }

    public static class QueryMCJobListResponseBodyJobListJobResultAdResultAdVideosAdVideo extends TeaModel {
        @NameInMap("Object")
        public String object;

        @NameInMap("Score")
        public String score;

        @NameInMap("Suggestion")
        public String suggestion;

        @NameInMap("Time")
        public String time;

        public static QueryMCJobListResponseBodyJobListJobResultAdResultAdVideosAdVideo build(java.util.Map<String, ?> map) throws Exception {
            QueryMCJobListResponseBodyJobListJobResultAdResultAdVideosAdVideo self = new QueryMCJobListResponseBodyJobListJobResultAdResultAdVideosAdVideo();
            return TeaModel.build(map, self);
        }

        public QueryMCJobListResponseBodyJobListJobResultAdResultAdVideosAdVideo setObject(String object) {
            this.object = object;
            return this;
        }
        public String getObject() {
            return this.object;
        }

        public QueryMCJobListResponseBodyJobListJobResultAdResultAdVideosAdVideo setScore(String score) {
            this.score = score;
            return this;
        }
        public String getScore() {
            return this.score;
        }

        public QueryMCJobListResponseBodyJobListJobResultAdResultAdVideosAdVideo setSuggestion(String suggestion) {
            this.suggestion = suggestion;
            return this;
        }
        public String getSuggestion() {
            return this.suggestion;
        }

        public QueryMCJobListResponseBodyJobListJobResultAdResultAdVideosAdVideo setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
        }

    }

    public static class QueryMCJobListResponseBodyJobListJobResultAdResultAdVideos extends TeaModel {
        @NameInMap("AdVideo")
        public java.util.List<QueryMCJobListResponseBodyJobListJobResultAdResultAdVideosAdVideo> adVideo;

        public static QueryMCJobListResponseBodyJobListJobResultAdResultAdVideos build(java.util.Map<String, ?> map) throws Exception {
            QueryMCJobListResponseBodyJobListJobResultAdResultAdVideos self = new QueryMCJobListResponseBodyJobListJobResultAdResultAdVideos();
            return TeaModel.build(map, self);
        }

        public QueryMCJobListResponseBodyJobListJobResultAdResultAdVideos setAdVideo(java.util.List<QueryMCJobListResponseBodyJobListJobResultAdResultAdVideosAdVideo> adVideo) {
            this.adVideo = adVideo;
            return this;
        }
        public java.util.List<QueryMCJobListResponseBodyJobListJobResultAdResultAdVideosAdVideo> getAdVideo() {
            return this.adVideo;
        }

    }

    public static class QueryMCJobListResponseBodyJobListJobResultAdResult extends TeaModel {
        @NameInMap("AdAudios")
        public QueryMCJobListResponseBodyJobListJobResultAdResultAdAudios adAudios;

        @NameInMap("AdImages")
        public QueryMCJobListResponseBodyJobListJobResultAdResultAdImages adImages;

        @NameInMap("AdOcrs")
        public QueryMCJobListResponseBodyJobListJobResultAdResultAdOcrs adOcrs;

        @NameInMap("AdTexts")
        public QueryMCJobListResponseBodyJobListJobResultAdResultAdTexts adTexts;

        @NameInMap("AdVideos")
        public QueryMCJobListResponseBodyJobListJobResultAdResultAdVideos adVideos;

        public static QueryMCJobListResponseBodyJobListJobResultAdResult build(java.util.Map<String, ?> map) throws Exception {
            QueryMCJobListResponseBodyJobListJobResultAdResult self = new QueryMCJobListResponseBodyJobListJobResultAdResult();
            return TeaModel.build(map, self);
        }

        public QueryMCJobListResponseBodyJobListJobResultAdResult setAdAudios(QueryMCJobListResponseBodyJobListJobResultAdResultAdAudios adAudios) {
            this.adAudios = adAudios;
            return this;
        }
        public QueryMCJobListResponseBodyJobListJobResultAdResultAdAudios getAdAudios() {
            return this.adAudios;
        }

        public QueryMCJobListResponseBodyJobListJobResultAdResult setAdImages(QueryMCJobListResponseBodyJobListJobResultAdResultAdImages adImages) {
            this.adImages = adImages;
            return this;
        }
        public QueryMCJobListResponseBodyJobListJobResultAdResultAdImages getAdImages() {
            return this.adImages;
        }

        public QueryMCJobListResponseBodyJobListJobResultAdResult setAdOcrs(QueryMCJobListResponseBodyJobListJobResultAdResultAdOcrs adOcrs) {
            this.adOcrs = adOcrs;
            return this;
        }
        public QueryMCJobListResponseBodyJobListJobResultAdResultAdOcrs getAdOcrs() {
            return this.adOcrs;
        }

        public QueryMCJobListResponseBodyJobListJobResultAdResult setAdTexts(QueryMCJobListResponseBodyJobListJobResultAdResultAdTexts adTexts) {
            this.adTexts = adTexts;
            return this;
        }
        public QueryMCJobListResponseBodyJobListJobResultAdResultAdTexts getAdTexts() {
            return this.adTexts;
        }

        public QueryMCJobListResponseBodyJobListJobResultAdResult setAdVideos(QueryMCJobListResponseBodyJobListJobResultAdResultAdVideos adVideos) {
            this.adVideos = adVideos;
            return this;
        }
        public QueryMCJobListResponseBodyJobListJobResultAdResultAdVideos getAdVideos() {
            return this.adVideos;
        }

    }

    public static class QueryMCJobListResponseBodyJobListJobResultContrabandResultContrabandAudiosContrabandAudio extends TeaModel {
        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("Object")
        public String object;

        @NameInMap("Score")
        public String score;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("Suggestion")
        public String suggestion;

        @NameInMap("Text")
        public String text;

        public static QueryMCJobListResponseBodyJobListJobResultContrabandResultContrabandAudiosContrabandAudio build(java.util.Map<String, ?> map) throws Exception {
            QueryMCJobListResponseBodyJobListJobResultContrabandResultContrabandAudiosContrabandAudio self = new QueryMCJobListResponseBodyJobListJobResultContrabandResultContrabandAudiosContrabandAudio();
            return TeaModel.build(map, self);
        }

        public QueryMCJobListResponseBodyJobListJobResultContrabandResultContrabandAudiosContrabandAudio setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public QueryMCJobListResponseBodyJobListJobResultContrabandResultContrabandAudiosContrabandAudio setObject(String object) {
            this.object = object;
            return this;
        }
        public String getObject() {
            return this.object;
        }

        public QueryMCJobListResponseBodyJobListJobResultContrabandResultContrabandAudiosContrabandAudio setScore(String score) {
            this.score = score;
            return this;
        }
        public String getScore() {
            return this.score;
        }

        public QueryMCJobListResponseBodyJobListJobResultContrabandResultContrabandAudiosContrabandAudio setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public QueryMCJobListResponseBodyJobListJobResultContrabandResultContrabandAudiosContrabandAudio setSuggestion(String suggestion) {
            this.suggestion = suggestion;
            return this;
        }
        public String getSuggestion() {
            return this.suggestion;
        }

        public QueryMCJobListResponseBodyJobListJobResultContrabandResultContrabandAudiosContrabandAudio setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class QueryMCJobListResponseBodyJobListJobResultContrabandResultContrabandAudios extends TeaModel {
        @NameInMap("ContrabandAudio")
        public java.util.List<QueryMCJobListResponseBodyJobListJobResultContrabandResultContrabandAudiosContrabandAudio> contrabandAudio;

        public static QueryMCJobListResponseBodyJobListJobResultContrabandResultContrabandAudios build(java.util.Map<String, ?> map) throws Exception {
            QueryMCJobListResponseBodyJobListJobResultContrabandResultContrabandAudios self = new QueryMCJobListResponseBodyJobListJobResultContrabandResultContrabandAudios();
            return TeaModel.build(map, self);
        }

        public QueryMCJobListResponseBodyJobListJobResultContrabandResultContrabandAudios setContrabandAudio(java.util.List<QueryMCJobListResponseBodyJobListJobResultContrabandResultContrabandAudiosContrabandAudio> contrabandAudio) {
            this.contrabandAudio = contrabandAudio;
            return this;
        }
        public java.util.List<QueryMCJobListResponseBodyJobListJobResultContrabandResultContrabandAudiosContrabandAudio> getContrabandAudio() {
            return this.contrabandAudio;
        }

    }

    public static class QueryMCJobListResponseBodyJobListJobResultContrabandResultContrabandOcrsContrabandOcr extends TeaModel {
        @NameInMap("Object")
        public String object;

        @NameInMap("Score")
        public String score;

        @NameInMap("Suggestion")
        public String suggestion;

        @NameInMap("Text")
        public String text;

        @NameInMap("Time")
        public String time;

        public static QueryMCJobListResponseBodyJobListJobResultContrabandResultContrabandOcrsContrabandOcr build(java.util.Map<String, ?> map) throws Exception {
            QueryMCJobListResponseBodyJobListJobResultContrabandResultContrabandOcrsContrabandOcr self = new QueryMCJobListResponseBodyJobListJobResultContrabandResultContrabandOcrsContrabandOcr();
            return TeaModel.build(map, self);
        }

        public QueryMCJobListResponseBodyJobListJobResultContrabandResultContrabandOcrsContrabandOcr setObject(String object) {
            this.object = object;
            return this;
        }
        public String getObject() {
            return this.object;
        }

        public QueryMCJobListResponseBodyJobListJobResultContrabandResultContrabandOcrsContrabandOcr setScore(String score) {
            this.score = score;
            return this;
        }
        public String getScore() {
            return this.score;
        }

        public QueryMCJobListResponseBodyJobListJobResultContrabandResultContrabandOcrsContrabandOcr setSuggestion(String suggestion) {
            this.suggestion = suggestion;
            return this;
        }
        public String getSuggestion() {
            return this.suggestion;
        }

        public QueryMCJobListResponseBodyJobListJobResultContrabandResultContrabandOcrsContrabandOcr setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

        public QueryMCJobListResponseBodyJobListJobResultContrabandResultContrabandOcrsContrabandOcr setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
        }

    }

    public static class QueryMCJobListResponseBodyJobListJobResultContrabandResultContrabandOcrs extends TeaModel {
        @NameInMap("ContrabandOcr")
        public java.util.List<QueryMCJobListResponseBodyJobListJobResultContrabandResultContrabandOcrsContrabandOcr> contrabandOcr;

        public static QueryMCJobListResponseBodyJobListJobResultContrabandResultContrabandOcrs build(java.util.Map<String, ?> map) throws Exception {
            QueryMCJobListResponseBodyJobListJobResultContrabandResultContrabandOcrs self = new QueryMCJobListResponseBodyJobListJobResultContrabandResultContrabandOcrs();
            return TeaModel.build(map, self);
        }

        public QueryMCJobListResponseBodyJobListJobResultContrabandResultContrabandOcrs setContrabandOcr(java.util.List<QueryMCJobListResponseBodyJobListJobResultContrabandResultContrabandOcrsContrabandOcr> contrabandOcr) {
            this.contrabandOcr = contrabandOcr;
            return this;
        }
        public java.util.List<QueryMCJobListResponseBodyJobListJobResultContrabandResultContrabandOcrsContrabandOcr> getContrabandOcr() {
            return this.contrabandOcr;
        }

    }

    public static class QueryMCJobListResponseBodyJobListJobResultContrabandResultContrabandTextsContrabandText extends TeaModel {
        @NameInMap("Score")
        public String score;

        @NameInMap("Suggestion")
        public String suggestion;

        @NameInMap("Text")
        public String text;

        public static QueryMCJobListResponseBodyJobListJobResultContrabandResultContrabandTextsContrabandText build(java.util.Map<String, ?> map) throws Exception {
            QueryMCJobListResponseBodyJobListJobResultContrabandResultContrabandTextsContrabandText self = new QueryMCJobListResponseBodyJobListJobResultContrabandResultContrabandTextsContrabandText();
            return TeaModel.build(map, self);
        }

        public QueryMCJobListResponseBodyJobListJobResultContrabandResultContrabandTextsContrabandText setScore(String score) {
            this.score = score;
            return this;
        }
        public String getScore() {
            return this.score;
        }

        public QueryMCJobListResponseBodyJobListJobResultContrabandResultContrabandTextsContrabandText setSuggestion(String suggestion) {
            this.suggestion = suggestion;
            return this;
        }
        public String getSuggestion() {
            return this.suggestion;
        }

        public QueryMCJobListResponseBodyJobListJobResultContrabandResultContrabandTextsContrabandText setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class QueryMCJobListResponseBodyJobListJobResultContrabandResultContrabandTexts extends TeaModel {
        @NameInMap("ContrabandText")
        public java.util.List<QueryMCJobListResponseBodyJobListJobResultContrabandResultContrabandTextsContrabandText> contrabandText;

        public static QueryMCJobListResponseBodyJobListJobResultContrabandResultContrabandTexts build(java.util.Map<String, ?> map) throws Exception {
            QueryMCJobListResponseBodyJobListJobResultContrabandResultContrabandTexts self = new QueryMCJobListResponseBodyJobListJobResultContrabandResultContrabandTexts();
            return TeaModel.build(map, self);
        }

        public QueryMCJobListResponseBodyJobListJobResultContrabandResultContrabandTexts setContrabandText(java.util.List<QueryMCJobListResponseBodyJobListJobResultContrabandResultContrabandTextsContrabandText> contrabandText) {
            this.contrabandText = contrabandText;
            return this;
        }
        public java.util.List<QueryMCJobListResponseBodyJobListJobResultContrabandResultContrabandTextsContrabandText> getContrabandText() {
            return this.contrabandText;
        }

    }

    public static class QueryMCJobListResponseBodyJobListJobResultContrabandResult extends TeaModel {
        @NameInMap("ContrabandAudios")
        public QueryMCJobListResponseBodyJobListJobResultContrabandResultContrabandAudios contrabandAudios;

        @NameInMap("ContrabandOcrs")
        public QueryMCJobListResponseBodyJobListJobResultContrabandResultContrabandOcrs contrabandOcrs;

        @NameInMap("ContrabandTexts")
        public QueryMCJobListResponseBodyJobListJobResultContrabandResultContrabandTexts contrabandTexts;

        public static QueryMCJobListResponseBodyJobListJobResultContrabandResult build(java.util.Map<String, ?> map) throws Exception {
            QueryMCJobListResponseBodyJobListJobResultContrabandResult self = new QueryMCJobListResponseBodyJobListJobResultContrabandResult();
            return TeaModel.build(map, self);
        }

        public QueryMCJobListResponseBodyJobListJobResultContrabandResult setContrabandAudios(QueryMCJobListResponseBodyJobListJobResultContrabandResultContrabandAudios contrabandAudios) {
            this.contrabandAudios = contrabandAudios;
            return this;
        }
        public QueryMCJobListResponseBodyJobListJobResultContrabandResultContrabandAudios getContrabandAudios() {
            return this.contrabandAudios;
        }

        public QueryMCJobListResponseBodyJobListJobResultContrabandResult setContrabandOcrs(QueryMCJobListResponseBodyJobListJobResultContrabandResultContrabandOcrs contrabandOcrs) {
            this.contrabandOcrs = contrabandOcrs;
            return this;
        }
        public QueryMCJobListResponseBodyJobListJobResultContrabandResultContrabandOcrs getContrabandOcrs() {
            return this.contrabandOcrs;
        }

        public QueryMCJobListResponseBodyJobListJobResultContrabandResult setContrabandTexts(QueryMCJobListResponseBodyJobListJobResultContrabandResultContrabandTexts contrabandTexts) {
            this.contrabandTexts = contrabandTexts;
            return this;
        }
        public QueryMCJobListResponseBodyJobListJobResultContrabandResultContrabandTexts getContrabandTexts() {
            return this.contrabandTexts;
        }

    }

    public static class QueryMCJobListResponseBodyJobListJobResultLiveResultLiveImagesLiveImage extends TeaModel {
        @NameInMap("Score")
        public String score;

        @NameInMap("Suggestion")
        public String suggestion;

        @NameInMap("Text")
        public String text;

        @NameInMap("Url")
        public String url;

        public static QueryMCJobListResponseBodyJobListJobResultLiveResultLiveImagesLiveImage build(java.util.Map<String, ?> map) throws Exception {
            QueryMCJobListResponseBodyJobListJobResultLiveResultLiveImagesLiveImage self = new QueryMCJobListResponseBodyJobListJobResultLiveResultLiveImagesLiveImage();
            return TeaModel.build(map, self);
        }

        public QueryMCJobListResponseBodyJobListJobResultLiveResultLiveImagesLiveImage setScore(String score) {
            this.score = score;
            return this;
        }
        public String getScore() {
            return this.score;
        }

        public QueryMCJobListResponseBodyJobListJobResultLiveResultLiveImagesLiveImage setSuggestion(String suggestion) {
            this.suggestion = suggestion;
            return this;
        }
        public String getSuggestion() {
            return this.suggestion;
        }

        public QueryMCJobListResponseBodyJobListJobResultLiveResultLiveImagesLiveImage setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

        public QueryMCJobListResponseBodyJobListJobResultLiveResultLiveImagesLiveImage setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class QueryMCJobListResponseBodyJobListJobResultLiveResultLiveImages extends TeaModel {
        @NameInMap("LiveImage")
        public java.util.List<QueryMCJobListResponseBodyJobListJobResultLiveResultLiveImagesLiveImage> liveImage;

        public static QueryMCJobListResponseBodyJobListJobResultLiveResultLiveImages build(java.util.Map<String, ?> map) throws Exception {
            QueryMCJobListResponseBodyJobListJobResultLiveResultLiveImages self = new QueryMCJobListResponseBodyJobListJobResultLiveResultLiveImages();
            return TeaModel.build(map, self);
        }

        public QueryMCJobListResponseBodyJobListJobResultLiveResultLiveImages setLiveImage(java.util.List<QueryMCJobListResponseBodyJobListJobResultLiveResultLiveImagesLiveImage> liveImage) {
            this.liveImage = liveImage;
            return this;
        }
        public java.util.List<QueryMCJobListResponseBodyJobListJobResultLiveResultLiveImagesLiveImage> getLiveImage() {
            return this.liveImage;
        }

    }

    public static class QueryMCJobListResponseBodyJobListJobResultLiveResultLiveVideosLiveVideo extends TeaModel {
        @NameInMap("Object")
        public String object;

        @NameInMap("Score")
        public String score;

        @NameInMap("Suggestion")
        public String suggestion;

        @NameInMap("Time")
        public String time;

        public static QueryMCJobListResponseBodyJobListJobResultLiveResultLiveVideosLiveVideo build(java.util.Map<String, ?> map) throws Exception {
            QueryMCJobListResponseBodyJobListJobResultLiveResultLiveVideosLiveVideo self = new QueryMCJobListResponseBodyJobListJobResultLiveResultLiveVideosLiveVideo();
            return TeaModel.build(map, self);
        }

        public QueryMCJobListResponseBodyJobListJobResultLiveResultLiveVideosLiveVideo setObject(String object) {
            this.object = object;
            return this;
        }
        public String getObject() {
            return this.object;
        }

        public QueryMCJobListResponseBodyJobListJobResultLiveResultLiveVideosLiveVideo setScore(String score) {
            this.score = score;
            return this;
        }
        public String getScore() {
            return this.score;
        }

        public QueryMCJobListResponseBodyJobListJobResultLiveResultLiveVideosLiveVideo setSuggestion(String suggestion) {
            this.suggestion = suggestion;
            return this;
        }
        public String getSuggestion() {
            return this.suggestion;
        }

        public QueryMCJobListResponseBodyJobListJobResultLiveResultLiveVideosLiveVideo setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
        }

    }

    public static class QueryMCJobListResponseBodyJobListJobResultLiveResultLiveVideos extends TeaModel {
        @NameInMap("LiveVideo")
        public java.util.List<QueryMCJobListResponseBodyJobListJobResultLiveResultLiveVideosLiveVideo> liveVideo;

        public static QueryMCJobListResponseBodyJobListJobResultLiveResultLiveVideos build(java.util.Map<String, ?> map) throws Exception {
            QueryMCJobListResponseBodyJobListJobResultLiveResultLiveVideos self = new QueryMCJobListResponseBodyJobListJobResultLiveResultLiveVideos();
            return TeaModel.build(map, self);
        }

        public QueryMCJobListResponseBodyJobListJobResultLiveResultLiveVideos setLiveVideo(java.util.List<QueryMCJobListResponseBodyJobListJobResultLiveResultLiveVideosLiveVideo> liveVideo) {
            this.liveVideo = liveVideo;
            return this;
        }
        public java.util.List<QueryMCJobListResponseBodyJobListJobResultLiveResultLiveVideosLiveVideo> getLiveVideo() {
            return this.liveVideo;
        }

    }

    public static class QueryMCJobListResponseBodyJobListJobResultLiveResult extends TeaModel {
        @NameInMap("LiveImages")
        public QueryMCJobListResponseBodyJobListJobResultLiveResultLiveImages liveImages;

        @NameInMap("LiveVideos")
        public QueryMCJobListResponseBodyJobListJobResultLiveResultLiveVideos liveVideos;

        public static QueryMCJobListResponseBodyJobListJobResultLiveResult build(java.util.Map<String, ?> map) throws Exception {
            QueryMCJobListResponseBodyJobListJobResultLiveResult self = new QueryMCJobListResponseBodyJobListJobResultLiveResult();
            return TeaModel.build(map, self);
        }

        public QueryMCJobListResponseBodyJobListJobResultLiveResult setLiveImages(QueryMCJobListResponseBodyJobListJobResultLiveResultLiveImages liveImages) {
            this.liveImages = liveImages;
            return this;
        }
        public QueryMCJobListResponseBodyJobListJobResultLiveResultLiveImages getLiveImages() {
            return this.liveImages;
        }

        public QueryMCJobListResponseBodyJobListJobResultLiveResult setLiveVideos(QueryMCJobListResponseBodyJobListJobResultLiveResultLiveVideos liveVideos) {
            this.liveVideos = liveVideos;
            return this;
        }
        public QueryMCJobListResponseBodyJobListJobResultLiveResultLiveVideos getLiveVideos() {
            return this.liveVideos;
        }

    }

    public static class QueryMCJobListResponseBodyJobListJobResultLogoResultLogoImagesLogoImage extends TeaModel {
        @NameInMap("Score")
        public String score;

        @NameInMap("Suggestion")
        public String suggestion;

        @NameInMap("Text")
        public String text;

        @NameInMap("Url")
        public String url;

        public static QueryMCJobListResponseBodyJobListJobResultLogoResultLogoImagesLogoImage build(java.util.Map<String, ?> map) throws Exception {
            QueryMCJobListResponseBodyJobListJobResultLogoResultLogoImagesLogoImage self = new QueryMCJobListResponseBodyJobListJobResultLogoResultLogoImagesLogoImage();
            return TeaModel.build(map, self);
        }

        public QueryMCJobListResponseBodyJobListJobResultLogoResultLogoImagesLogoImage setScore(String score) {
            this.score = score;
            return this;
        }
        public String getScore() {
            return this.score;
        }

        public QueryMCJobListResponseBodyJobListJobResultLogoResultLogoImagesLogoImage setSuggestion(String suggestion) {
            this.suggestion = suggestion;
            return this;
        }
        public String getSuggestion() {
            return this.suggestion;
        }

        public QueryMCJobListResponseBodyJobListJobResultLogoResultLogoImagesLogoImage setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

        public QueryMCJobListResponseBodyJobListJobResultLogoResultLogoImagesLogoImage setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class QueryMCJobListResponseBodyJobListJobResultLogoResultLogoImages extends TeaModel {
        @NameInMap("LogoImage")
        public java.util.List<QueryMCJobListResponseBodyJobListJobResultLogoResultLogoImagesLogoImage> logoImage;

        public static QueryMCJobListResponseBodyJobListJobResultLogoResultLogoImages build(java.util.Map<String, ?> map) throws Exception {
            QueryMCJobListResponseBodyJobListJobResultLogoResultLogoImages self = new QueryMCJobListResponseBodyJobListJobResultLogoResultLogoImages();
            return TeaModel.build(map, self);
        }

        public QueryMCJobListResponseBodyJobListJobResultLogoResultLogoImages setLogoImage(java.util.List<QueryMCJobListResponseBodyJobListJobResultLogoResultLogoImagesLogoImage> logoImage) {
            this.logoImage = logoImage;
            return this;
        }
        public java.util.List<QueryMCJobListResponseBodyJobListJobResultLogoResultLogoImagesLogoImage> getLogoImage() {
            return this.logoImage;
        }

    }

    public static class QueryMCJobListResponseBodyJobListJobResultLogoResultLogoVideosLogoVideo extends TeaModel {
        @NameInMap("Object")
        public String object;

        @NameInMap("Score")
        public String score;

        @NameInMap("Suggestion")
        public String suggestion;

        @NameInMap("Time")
        public String time;

        public static QueryMCJobListResponseBodyJobListJobResultLogoResultLogoVideosLogoVideo build(java.util.Map<String, ?> map) throws Exception {
            QueryMCJobListResponseBodyJobListJobResultLogoResultLogoVideosLogoVideo self = new QueryMCJobListResponseBodyJobListJobResultLogoResultLogoVideosLogoVideo();
            return TeaModel.build(map, self);
        }

        public QueryMCJobListResponseBodyJobListJobResultLogoResultLogoVideosLogoVideo setObject(String object) {
            this.object = object;
            return this;
        }
        public String getObject() {
            return this.object;
        }

        public QueryMCJobListResponseBodyJobListJobResultLogoResultLogoVideosLogoVideo setScore(String score) {
            this.score = score;
            return this;
        }
        public String getScore() {
            return this.score;
        }

        public QueryMCJobListResponseBodyJobListJobResultLogoResultLogoVideosLogoVideo setSuggestion(String suggestion) {
            this.suggestion = suggestion;
            return this;
        }
        public String getSuggestion() {
            return this.suggestion;
        }

        public QueryMCJobListResponseBodyJobListJobResultLogoResultLogoVideosLogoVideo setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
        }

    }

    public static class QueryMCJobListResponseBodyJobListJobResultLogoResultLogoVideos extends TeaModel {
        @NameInMap("LogoVideo")
        public java.util.List<QueryMCJobListResponseBodyJobListJobResultLogoResultLogoVideosLogoVideo> logoVideo;

        public static QueryMCJobListResponseBodyJobListJobResultLogoResultLogoVideos build(java.util.Map<String, ?> map) throws Exception {
            QueryMCJobListResponseBodyJobListJobResultLogoResultLogoVideos self = new QueryMCJobListResponseBodyJobListJobResultLogoResultLogoVideos();
            return TeaModel.build(map, self);
        }

        public QueryMCJobListResponseBodyJobListJobResultLogoResultLogoVideos setLogoVideo(java.util.List<QueryMCJobListResponseBodyJobListJobResultLogoResultLogoVideosLogoVideo> logoVideo) {
            this.logoVideo = logoVideo;
            return this;
        }
        public java.util.List<QueryMCJobListResponseBodyJobListJobResultLogoResultLogoVideosLogoVideo> getLogoVideo() {
            return this.logoVideo;
        }

    }

    public static class QueryMCJobListResponseBodyJobListJobResultLogoResult extends TeaModel {
        @NameInMap("LogoImages")
        public QueryMCJobListResponseBodyJobListJobResultLogoResultLogoImages logoImages;

        @NameInMap("LogoVideos")
        public QueryMCJobListResponseBodyJobListJobResultLogoResultLogoVideos logoVideos;

        public static QueryMCJobListResponseBodyJobListJobResultLogoResult build(java.util.Map<String, ?> map) throws Exception {
            QueryMCJobListResponseBodyJobListJobResultLogoResult self = new QueryMCJobListResponseBodyJobListJobResultLogoResult();
            return TeaModel.build(map, self);
        }

        public QueryMCJobListResponseBodyJobListJobResultLogoResult setLogoImages(QueryMCJobListResponseBodyJobListJobResultLogoResultLogoImages logoImages) {
            this.logoImages = logoImages;
            return this;
        }
        public QueryMCJobListResponseBodyJobListJobResultLogoResultLogoImages getLogoImages() {
            return this.logoImages;
        }

        public QueryMCJobListResponseBodyJobListJobResultLogoResult setLogoVideos(QueryMCJobListResponseBodyJobListJobResultLogoResultLogoVideos logoVideos) {
            this.logoVideos = logoVideos;
            return this;
        }
        public QueryMCJobListResponseBodyJobListJobResultLogoResultLogoVideos getLogoVideos() {
            return this.logoVideos;
        }

    }

    public static class QueryMCJobListResponseBodyJobListJobResultPoliticsResultPoliticsAudiosPoliticsAudio extends TeaModel {
        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("Object")
        public String object;

        @NameInMap("Score")
        public String score;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("Suggestion")
        public String suggestion;

        @NameInMap("Text")
        public String text;

        public static QueryMCJobListResponseBodyJobListJobResultPoliticsResultPoliticsAudiosPoliticsAudio build(java.util.Map<String, ?> map) throws Exception {
            QueryMCJobListResponseBodyJobListJobResultPoliticsResultPoliticsAudiosPoliticsAudio self = new QueryMCJobListResponseBodyJobListJobResultPoliticsResultPoliticsAudiosPoliticsAudio();
            return TeaModel.build(map, self);
        }

        public QueryMCJobListResponseBodyJobListJobResultPoliticsResultPoliticsAudiosPoliticsAudio setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public QueryMCJobListResponseBodyJobListJobResultPoliticsResultPoliticsAudiosPoliticsAudio setObject(String object) {
            this.object = object;
            return this;
        }
        public String getObject() {
            return this.object;
        }

        public QueryMCJobListResponseBodyJobListJobResultPoliticsResultPoliticsAudiosPoliticsAudio setScore(String score) {
            this.score = score;
            return this;
        }
        public String getScore() {
            return this.score;
        }

        public QueryMCJobListResponseBodyJobListJobResultPoliticsResultPoliticsAudiosPoliticsAudio setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public QueryMCJobListResponseBodyJobListJobResultPoliticsResultPoliticsAudiosPoliticsAudio setSuggestion(String suggestion) {
            this.suggestion = suggestion;
            return this;
        }
        public String getSuggestion() {
            return this.suggestion;
        }

        public QueryMCJobListResponseBodyJobListJobResultPoliticsResultPoliticsAudiosPoliticsAudio setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class QueryMCJobListResponseBodyJobListJobResultPoliticsResultPoliticsAudios extends TeaModel {
        @NameInMap("PoliticsAudio")
        public java.util.List<QueryMCJobListResponseBodyJobListJobResultPoliticsResultPoliticsAudiosPoliticsAudio> politicsAudio;

        public static QueryMCJobListResponseBodyJobListJobResultPoliticsResultPoliticsAudios build(java.util.Map<String, ?> map) throws Exception {
            QueryMCJobListResponseBodyJobListJobResultPoliticsResultPoliticsAudios self = new QueryMCJobListResponseBodyJobListJobResultPoliticsResultPoliticsAudios();
            return TeaModel.build(map, self);
        }

        public QueryMCJobListResponseBodyJobListJobResultPoliticsResultPoliticsAudios setPoliticsAudio(java.util.List<QueryMCJobListResponseBodyJobListJobResultPoliticsResultPoliticsAudiosPoliticsAudio> politicsAudio) {
            this.politicsAudio = politicsAudio;
            return this;
        }
        public java.util.List<QueryMCJobListResponseBodyJobListJobResultPoliticsResultPoliticsAudiosPoliticsAudio> getPoliticsAudio() {
            return this.politicsAudio;
        }

    }

    public static class QueryMCJobListResponseBodyJobListJobResultPoliticsResultPoliticsImagesPoliticsImage extends TeaModel {
        @NameInMap("Score")
        public String score;

        @NameInMap("Suggestion")
        public String suggestion;

        @NameInMap("Text")
        public String text;

        @NameInMap("Url")
        public String url;

        public static QueryMCJobListResponseBodyJobListJobResultPoliticsResultPoliticsImagesPoliticsImage build(java.util.Map<String, ?> map) throws Exception {
            QueryMCJobListResponseBodyJobListJobResultPoliticsResultPoliticsImagesPoliticsImage self = new QueryMCJobListResponseBodyJobListJobResultPoliticsResultPoliticsImagesPoliticsImage();
            return TeaModel.build(map, self);
        }

        public QueryMCJobListResponseBodyJobListJobResultPoliticsResultPoliticsImagesPoliticsImage setScore(String score) {
            this.score = score;
            return this;
        }
        public String getScore() {
            return this.score;
        }

        public QueryMCJobListResponseBodyJobListJobResultPoliticsResultPoliticsImagesPoliticsImage setSuggestion(String suggestion) {
            this.suggestion = suggestion;
            return this;
        }
        public String getSuggestion() {
            return this.suggestion;
        }

        public QueryMCJobListResponseBodyJobListJobResultPoliticsResultPoliticsImagesPoliticsImage setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

        public QueryMCJobListResponseBodyJobListJobResultPoliticsResultPoliticsImagesPoliticsImage setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class QueryMCJobListResponseBodyJobListJobResultPoliticsResultPoliticsImages extends TeaModel {
        @NameInMap("PoliticsImage")
        public java.util.List<QueryMCJobListResponseBodyJobListJobResultPoliticsResultPoliticsImagesPoliticsImage> politicsImage;

        public static QueryMCJobListResponseBodyJobListJobResultPoliticsResultPoliticsImages build(java.util.Map<String, ?> map) throws Exception {
            QueryMCJobListResponseBodyJobListJobResultPoliticsResultPoliticsImages self = new QueryMCJobListResponseBodyJobListJobResultPoliticsResultPoliticsImages();
            return TeaModel.build(map, self);
        }

        public QueryMCJobListResponseBodyJobListJobResultPoliticsResultPoliticsImages setPoliticsImage(java.util.List<QueryMCJobListResponseBodyJobListJobResultPoliticsResultPoliticsImagesPoliticsImage> politicsImage) {
            this.politicsImage = politicsImage;
            return this;
        }
        public java.util.List<QueryMCJobListResponseBodyJobListJobResultPoliticsResultPoliticsImagesPoliticsImage> getPoliticsImage() {
            return this.politicsImage;
        }

    }

    public static class QueryMCJobListResponseBodyJobListJobResultPoliticsResultPoliticsOcrsPoliticsOcr extends TeaModel {
        @NameInMap("Object")
        public String object;

        @NameInMap("Score")
        public String score;

        @NameInMap("Suggestion")
        public String suggestion;

        @NameInMap("Text")
        public String text;

        @NameInMap("Time")
        public String time;

        public static QueryMCJobListResponseBodyJobListJobResultPoliticsResultPoliticsOcrsPoliticsOcr build(java.util.Map<String, ?> map) throws Exception {
            QueryMCJobListResponseBodyJobListJobResultPoliticsResultPoliticsOcrsPoliticsOcr self = new QueryMCJobListResponseBodyJobListJobResultPoliticsResultPoliticsOcrsPoliticsOcr();
            return TeaModel.build(map, self);
        }

        public QueryMCJobListResponseBodyJobListJobResultPoliticsResultPoliticsOcrsPoliticsOcr setObject(String object) {
            this.object = object;
            return this;
        }
        public String getObject() {
            return this.object;
        }

        public QueryMCJobListResponseBodyJobListJobResultPoliticsResultPoliticsOcrsPoliticsOcr setScore(String score) {
            this.score = score;
            return this;
        }
        public String getScore() {
            return this.score;
        }

        public QueryMCJobListResponseBodyJobListJobResultPoliticsResultPoliticsOcrsPoliticsOcr setSuggestion(String suggestion) {
            this.suggestion = suggestion;
            return this;
        }
        public String getSuggestion() {
            return this.suggestion;
        }

        public QueryMCJobListResponseBodyJobListJobResultPoliticsResultPoliticsOcrsPoliticsOcr setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

        public QueryMCJobListResponseBodyJobListJobResultPoliticsResultPoliticsOcrsPoliticsOcr setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
        }

    }

    public static class QueryMCJobListResponseBodyJobListJobResultPoliticsResultPoliticsOcrs extends TeaModel {
        @NameInMap("PoliticsOcr")
        public java.util.List<QueryMCJobListResponseBodyJobListJobResultPoliticsResultPoliticsOcrsPoliticsOcr> politicsOcr;

        public static QueryMCJobListResponseBodyJobListJobResultPoliticsResultPoliticsOcrs build(java.util.Map<String, ?> map) throws Exception {
            QueryMCJobListResponseBodyJobListJobResultPoliticsResultPoliticsOcrs self = new QueryMCJobListResponseBodyJobListJobResultPoliticsResultPoliticsOcrs();
            return TeaModel.build(map, self);
        }

        public QueryMCJobListResponseBodyJobListJobResultPoliticsResultPoliticsOcrs setPoliticsOcr(java.util.List<QueryMCJobListResponseBodyJobListJobResultPoliticsResultPoliticsOcrsPoliticsOcr> politicsOcr) {
            this.politicsOcr = politicsOcr;
            return this;
        }
        public java.util.List<QueryMCJobListResponseBodyJobListJobResultPoliticsResultPoliticsOcrsPoliticsOcr> getPoliticsOcr() {
            return this.politicsOcr;
        }

    }

    public static class QueryMCJobListResponseBodyJobListJobResultPoliticsResultPoliticsTextsPoliticsText extends TeaModel {
        @NameInMap("Score")
        public String score;

        @NameInMap("Suggestion")
        public String suggestion;

        @NameInMap("Text")
        public String text;

        public static QueryMCJobListResponseBodyJobListJobResultPoliticsResultPoliticsTextsPoliticsText build(java.util.Map<String, ?> map) throws Exception {
            QueryMCJobListResponseBodyJobListJobResultPoliticsResultPoliticsTextsPoliticsText self = new QueryMCJobListResponseBodyJobListJobResultPoliticsResultPoliticsTextsPoliticsText();
            return TeaModel.build(map, self);
        }

        public QueryMCJobListResponseBodyJobListJobResultPoliticsResultPoliticsTextsPoliticsText setScore(String score) {
            this.score = score;
            return this;
        }
        public String getScore() {
            return this.score;
        }

        public QueryMCJobListResponseBodyJobListJobResultPoliticsResultPoliticsTextsPoliticsText setSuggestion(String suggestion) {
            this.suggestion = suggestion;
            return this;
        }
        public String getSuggestion() {
            return this.suggestion;
        }

        public QueryMCJobListResponseBodyJobListJobResultPoliticsResultPoliticsTextsPoliticsText setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class QueryMCJobListResponseBodyJobListJobResultPoliticsResultPoliticsTexts extends TeaModel {
        @NameInMap("PoliticsText")
        public java.util.List<QueryMCJobListResponseBodyJobListJobResultPoliticsResultPoliticsTextsPoliticsText> politicsText;

        public static QueryMCJobListResponseBodyJobListJobResultPoliticsResultPoliticsTexts build(java.util.Map<String, ?> map) throws Exception {
            QueryMCJobListResponseBodyJobListJobResultPoliticsResultPoliticsTexts self = new QueryMCJobListResponseBodyJobListJobResultPoliticsResultPoliticsTexts();
            return TeaModel.build(map, self);
        }

        public QueryMCJobListResponseBodyJobListJobResultPoliticsResultPoliticsTexts setPoliticsText(java.util.List<QueryMCJobListResponseBodyJobListJobResultPoliticsResultPoliticsTextsPoliticsText> politicsText) {
            this.politicsText = politicsText;
            return this;
        }
        public java.util.List<QueryMCJobListResponseBodyJobListJobResultPoliticsResultPoliticsTextsPoliticsText> getPoliticsText() {
            return this.politicsText;
        }

    }

    public static class QueryMCJobListResponseBodyJobListJobResultPoliticsResultPoliticsVideosPoliticsVideo extends TeaModel {
        @NameInMap("Object")
        public String object;

        @NameInMap("Score")
        public String score;

        @NameInMap("Suggestion")
        public String suggestion;

        @NameInMap("Time")
        public String time;

        public static QueryMCJobListResponseBodyJobListJobResultPoliticsResultPoliticsVideosPoliticsVideo build(java.util.Map<String, ?> map) throws Exception {
            QueryMCJobListResponseBodyJobListJobResultPoliticsResultPoliticsVideosPoliticsVideo self = new QueryMCJobListResponseBodyJobListJobResultPoliticsResultPoliticsVideosPoliticsVideo();
            return TeaModel.build(map, self);
        }

        public QueryMCJobListResponseBodyJobListJobResultPoliticsResultPoliticsVideosPoliticsVideo setObject(String object) {
            this.object = object;
            return this;
        }
        public String getObject() {
            return this.object;
        }

        public QueryMCJobListResponseBodyJobListJobResultPoliticsResultPoliticsVideosPoliticsVideo setScore(String score) {
            this.score = score;
            return this;
        }
        public String getScore() {
            return this.score;
        }

        public QueryMCJobListResponseBodyJobListJobResultPoliticsResultPoliticsVideosPoliticsVideo setSuggestion(String suggestion) {
            this.suggestion = suggestion;
            return this;
        }
        public String getSuggestion() {
            return this.suggestion;
        }

        public QueryMCJobListResponseBodyJobListJobResultPoliticsResultPoliticsVideosPoliticsVideo setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
        }

    }

    public static class QueryMCJobListResponseBodyJobListJobResultPoliticsResultPoliticsVideos extends TeaModel {
        @NameInMap("PoliticsVideo")
        public java.util.List<QueryMCJobListResponseBodyJobListJobResultPoliticsResultPoliticsVideosPoliticsVideo> politicsVideo;

        public static QueryMCJobListResponseBodyJobListJobResultPoliticsResultPoliticsVideos build(java.util.Map<String, ?> map) throws Exception {
            QueryMCJobListResponseBodyJobListJobResultPoliticsResultPoliticsVideos self = new QueryMCJobListResponseBodyJobListJobResultPoliticsResultPoliticsVideos();
            return TeaModel.build(map, self);
        }

        public QueryMCJobListResponseBodyJobListJobResultPoliticsResultPoliticsVideos setPoliticsVideo(java.util.List<QueryMCJobListResponseBodyJobListJobResultPoliticsResultPoliticsVideosPoliticsVideo> politicsVideo) {
            this.politicsVideo = politicsVideo;
            return this;
        }
        public java.util.List<QueryMCJobListResponseBodyJobListJobResultPoliticsResultPoliticsVideosPoliticsVideo> getPoliticsVideo() {
            return this.politicsVideo;
        }

    }

    public static class QueryMCJobListResponseBodyJobListJobResultPoliticsResult extends TeaModel {
        @NameInMap("PoliticsAudios")
        public QueryMCJobListResponseBodyJobListJobResultPoliticsResultPoliticsAudios politicsAudios;

        @NameInMap("PoliticsImages")
        public QueryMCJobListResponseBodyJobListJobResultPoliticsResultPoliticsImages politicsImages;

        @NameInMap("PoliticsOcrs")
        public QueryMCJobListResponseBodyJobListJobResultPoliticsResultPoliticsOcrs politicsOcrs;

        @NameInMap("PoliticsTexts")
        public QueryMCJobListResponseBodyJobListJobResultPoliticsResultPoliticsTexts politicsTexts;

        @NameInMap("PoliticsVideos")
        public QueryMCJobListResponseBodyJobListJobResultPoliticsResultPoliticsVideos politicsVideos;

        public static QueryMCJobListResponseBodyJobListJobResultPoliticsResult build(java.util.Map<String, ?> map) throws Exception {
            QueryMCJobListResponseBodyJobListJobResultPoliticsResult self = new QueryMCJobListResponseBodyJobListJobResultPoliticsResult();
            return TeaModel.build(map, self);
        }

        public QueryMCJobListResponseBodyJobListJobResultPoliticsResult setPoliticsAudios(QueryMCJobListResponseBodyJobListJobResultPoliticsResultPoliticsAudios politicsAudios) {
            this.politicsAudios = politicsAudios;
            return this;
        }
        public QueryMCJobListResponseBodyJobListJobResultPoliticsResultPoliticsAudios getPoliticsAudios() {
            return this.politicsAudios;
        }

        public QueryMCJobListResponseBodyJobListJobResultPoliticsResult setPoliticsImages(QueryMCJobListResponseBodyJobListJobResultPoliticsResultPoliticsImages politicsImages) {
            this.politicsImages = politicsImages;
            return this;
        }
        public QueryMCJobListResponseBodyJobListJobResultPoliticsResultPoliticsImages getPoliticsImages() {
            return this.politicsImages;
        }

        public QueryMCJobListResponseBodyJobListJobResultPoliticsResult setPoliticsOcrs(QueryMCJobListResponseBodyJobListJobResultPoliticsResultPoliticsOcrs politicsOcrs) {
            this.politicsOcrs = politicsOcrs;
            return this;
        }
        public QueryMCJobListResponseBodyJobListJobResultPoliticsResultPoliticsOcrs getPoliticsOcrs() {
            return this.politicsOcrs;
        }

        public QueryMCJobListResponseBodyJobListJobResultPoliticsResult setPoliticsTexts(QueryMCJobListResponseBodyJobListJobResultPoliticsResultPoliticsTexts politicsTexts) {
            this.politicsTexts = politicsTexts;
            return this;
        }
        public QueryMCJobListResponseBodyJobListJobResultPoliticsResultPoliticsTexts getPoliticsTexts() {
            return this.politicsTexts;
        }

        public QueryMCJobListResponseBodyJobListJobResultPoliticsResult setPoliticsVideos(QueryMCJobListResponseBodyJobListJobResultPoliticsResultPoliticsVideos politicsVideos) {
            this.politicsVideos = politicsVideos;
            return this;
        }
        public QueryMCJobListResponseBodyJobListJobResultPoliticsResultPoliticsVideos getPoliticsVideos() {
            return this.politicsVideos;
        }

    }

    public static class QueryMCJobListResponseBodyJobListJobResultPornResultPornAudiosPornAudio extends TeaModel {
        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("Object")
        public String object;

        @NameInMap("Score")
        public String score;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("Suggestion")
        public String suggestion;

        @NameInMap("Text")
        public String text;

        public static QueryMCJobListResponseBodyJobListJobResultPornResultPornAudiosPornAudio build(java.util.Map<String, ?> map) throws Exception {
            QueryMCJobListResponseBodyJobListJobResultPornResultPornAudiosPornAudio self = new QueryMCJobListResponseBodyJobListJobResultPornResultPornAudiosPornAudio();
            return TeaModel.build(map, self);
        }

        public QueryMCJobListResponseBodyJobListJobResultPornResultPornAudiosPornAudio setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public QueryMCJobListResponseBodyJobListJobResultPornResultPornAudiosPornAudio setObject(String object) {
            this.object = object;
            return this;
        }
        public String getObject() {
            return this.object;
        }

        public QueryMCJobListResponseBodyJobListJobResultPornResultPornAudiosPornAudio setScore(String score) {
            this.score = score;
            return this;
        }
        public String getScore() {
            return this.score;
        }

        public QueryMCJobListResponseBodyJobListJobResultPornResultPornAudiosPornAudio setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public QueryMCJobListResponseBodyJobListJobResultPornResultPornAudiosPornAudio setSuggestion(String suggestion) {
            this.suggestion = suggestion;
            return this;
        }
        public String getSuggestion() {
            return this.suggestion;
        }

        public QueryMCJobListResponseBodyJobListJobResultPornResultPornAudiosPornAudio setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class QueryMCJobListResponseBodyJobListJobResultPornResultPornAudios extends TeaModel {
        @NameInMap("PornAudio")
        public java.util.List<QueryMCJobListResponseBodyJobListJobResultPornResultPornAudiosPornAudio> pornAudio;

        public static QueryMCJobListResponseBodyJobListJobResultPornResultPornAudios build(java.util.Map<String, ?> map) throws Exception {
            QueryMCJobListResponseBodyJobListJobResultPornResultPornAudios self = new QueryMCJobListResponseBodyJobListJobResultPornResultPornAudios();
            return TeaModel.build(map, self);
        }

        public QueryMCJobListResponseBodyJobListJobResultPornResultPornAudios setPornAudio(java.util.List<QueryMCJobListResponseBodyJobListJobResultPornResultPornAudiosPornAudio> pornAudio) {
            this.pornAudio = pornAudio;
            return this;
        }
        public java.util.List<QueryMCJobListResponseBodyJobListJobResultPornResultPornAudiosPornAudio> getPornAudio() {
            return this.pornAudio;
        }

    }

    public static class QueryMCJobListResponseBodyJobListJobResultPornResultPornImagesPornImage extends TeaModel {
        @NameInMap("Score")
        public String score;

        @NameInMap("Suggestion")
        public String suggestion;

        @NameInMap("Text")
        public String text;

        @NameInMap("Url")
        public String url;

        public static QueryMCJobListResponseBodyJobListJobResultPornResultPornImagesPornImage build(java.util.Map<String, ?> map) throws Exception {
            QueryMCJobListResponseBodyJobListJobResultPornResultPornImagesPornImage self = new QueryMCJobListResponseBodyJobListJobResultPornResultPornImagesPornImage();
            return TeaModel.build(map, self);
        }

        public QueryMCJobListResponseBodyJobListJobResultPornResultPornImagesPornImage setScore(String score) {
            this.score = score;
            return this;
        }
        public String getScore() {
            return this.score;
        }

        public QueryMCJobListResponseBodyJobListJobResultPornResultPornImagesPornImage setSuggestion(String suggestion) {
            this.suggestion = suggestion;
            return this;
        }
        public String getSuggestion() {
            return this.suggestion;
        }

        public QueryMCJobListResponseBodyJobListJobResultPornResultPornImagesPornImage setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

        public QueryMCJobListResponseBodyJobListJobResultPornResultPornImagesPornImage setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class QueryMCJobListResponseBodyJobListJobResultPornResultPornImages extends TeaModel {
        @NameInMap("PornImage")
        public java.util.List<QueryMCJobListResponseBodyJobListJobResultPornResultPornImagesPornImage> pornImage;

        public static QueryMCJobListResponseBodyJobListJobResultPornResultPornImages build(java.util.Map<String, ?> map) throws Exception {
            QueryMCJobListResponseBodyJobListJobResultPornResultPornImages self = new QueryMCJobListResponseBodyJobListJobResultPornResultPornImages();
            return TeaModel.build(map, self);
        }

        public QueryMCJobListResponseBodyJobListJobResultPornResultPornImages setPornImage(java.util.List<QueryMCJobListResponseBodyJobListJobResultPornResultPornImagesPornImage> pornImage) {
            this.pornImage = pornImage;
            return this;
        }
        public java.util.List<QueryMCJobListResponseBodyJobListJobResultPornResultPornImagesPornImage> getPornImage() {
            return this.pornImage;
        }

    }

    public static class QueryMCJobListResponseBodyJobListJobResultPornResultPornOcrsPornOcr extends TeaModel {
        @NameInMap("Object")
        public String object;

        @NameInMap("Score")
        public String score;

        @NameInMap("Suggestion")
        public String suggestion;

        @NameInMap("Text")
        public String text;

        @NameInMap("Time")
        public String time;

        public static QueryMCJobListResponseBodyJobListJobResultPornResultPornOcrsPornOcr build(java.util.Map<String, ?> map) throws Exception {
            QueryMCJobListResponseBodyJobListJobResultPornResultPornOcrsPornOcr self = new QueryMCJobListResponseBodyJobListJobResultPornResultPornOcrsPornOcr();
            return TeaModel.build(map, self);
        }

        public QueryMCJobListResponseBodyJobListJobResultPornResultPornOcrsPornOcr setObject(String object) {
            this.object = object;
            return this;
        }
        public String getObject() {
            return this.object;
        }

        public QueryMCJobListResponseBodyJobListJobResultPornResultPornOcrsPornOcr setScore(String score) {
            this.score = score;
            return this;
        }
        public String getScore() {
            return this.score;
        }

        public QueryMCJobListResponseBodyJobListJobResultPornResultPornOcrsPornOcr setSuggestion(String suggestion) {
            this.suggestion = suggestion;
            return this;
        }
        public String getSuggestion() {
            return this.suggestion;
        }

        public QueryMCJobListResponseBodyJobListJobResultPornResultPornOcrsPornOcr setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

        public QueryMCJobListResponseBodyJobListJobResultPornResultPornOcrsPornOcr setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
        }

    }

    public static class QueryMCJobListResponseBodyJobListJobResultPornResultPornOcrs extends TeaModel {
        @NameInMap("PornOcr")
        public java.util.List<QueryMCJobListResponseBodyJobListJobResultPornResultPornOcrsPornOcr> pornOcr;

        public static QueryMCJobListResponseBodyJobListJobResultPornResultPornOcrs build(java.util.Map<String, ?> map) throws Exception {
            QueryMCJobListResponseBodyJobListJobResultPornResultPornOcrs self = new QueryMCJobListResponseBodyJobListJobResultPornResultPornOcrs();
            return TeaModel.build(map, self);
        }

        public QueryMCJobListResponseBodyJobListJobResultPornResultPornOcrs setPornOcr(java.util.List<QueryMCJobListResponseBodyJobListJobResultPornResultPornOcrsPornOcr> pornOcr) {
            this.pornOcr = pornOcr;
            return this;
        }
        public java.util.List<QueryMCJobListResponseBodyJobListJobResultPornResultPornOcrsPornOcr> getPornOcr() {
            return this.pornOcr;
        }

    }

    public static class QueryMCJobListResponseBodyJobListJobResultPornResultPornTextsPornText extends TeaModel {
        @NameInMap("Score")
        public String score;

        @NameInMap("Suggestion")
        public String suggestion;

        @NameInMap("Text")
        public String text;

        public static QueryMCJobListResponseBodyJobListJobResultPornResultPornTextsPornText build(java.util.Map<String, ?> map) throws Exception {
            QueryMCJobListResponseBodyJobListJobResultPornResultPornTextsPornText self = new QueryMCJobListResponseBodyJobListJobResultPornResultPornTextsPornText();
            return TeaModel.build(map, self);
        }

        public QueryMCJobListResponseBodyJobListJobResultPornResultPornTextsPornText setScore(String score) {
            this.score = score;
            return this;
        }
        public String getScore() {
            return this.score;
        }

        public QueryMCJobListResponseBodyJobListJobResultPornResultPornTextsPornText setSuggestion(String suggestion) {
            this.suggestion = suggestion;
            return this;
        }
        public String getSuggestion() {
            return this.suggestion;
        }

        public QueryMCJobListResponseBodyJobListJobResultPornResultPornTextsPornText setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class QueryMCJobListResponseBodyJobListJobResultPornResultPornTexts extends TeaModel {
        @NameInMap("PornText")
        public java.util.List<QueryMCJobListResponseBodyJobListJobResultPornResultPornTextsPornText> pornText;

        public static QueryMCJobListResponseBodyJobListJobResultPornResultPornTexts build(java.util.Map<String, ?> map) throws Exception {
            QueryMCJobListResponseBodyJobListJobResultPornResultPornTexts self = new QueryMCJobListResponseBodyJobListJobResultPornResultPornTexts();
            return TeaModel.build(map, self);
        }

        public QueryMCJobListResponseBodyJobListJobResultPornResultPornTexts setPornText(java.util.List<QueryMCJobListResponseBodyJobListJobResultPornResultPornTextsPornText> pornText) {
            this.pornText = pornText;
            return this;
        }
        public java.util.List<QueryMCJobListResponseBodyJobListJobResultPornResultPornTextsPornText> getPornText() {
            return this.pornText;
        }

    }

    public static class QueryMCJobListResponseBodyJobListJobResultPornResultPornVideosPornVideo extends TeaModel {
        @NameInMap("Object")
        public String object;

        @NameInMap("Score")
        public String score;

        @NameInMap("Suggestion")
        public String suggestion;

        @NameInMap("Time")
        public String time;

        public static QueryMCJobListResponseBodyJobListJobResultPornResultPornVideosPornVideo build(java.util.Map<String, ?> map) throws Exception {
            QueryMCJobListResponseBodyJobListJobResultPornResultPornVideosPornVideo self = new QueryMCJobListResponseBodyJobListJobResultPornResultPornVideosPornVideo();
            return TeaModel.build(map, self);
        }

        public QueryMCJobListResponseBodyJobListJobResultPornResultPornVideosPornVideo setObject(String object) {
            this.object = object;
            return this;
        }
        public String getObject() {
            return this.object;
        }

        public QueryMCJobListResponseBodyJobListJobResultPornResultPornVideosPornVideo setScore(String score) {
            this.score = score;
            return this;
        }
        public String getScore() {
            return this.score;
        }

        public QueryMCJobListResponseBodyJobListJobResultPornResultPornVideosPornVideo setSuggestion(String suggestion) {
            this.suggestion = suggestion;
            return this;
        }
        public String getSuggestion() {
            return this.suggestion;
        }

        public QueryMCJobListResponseBodyJobListJobResultPornResultPornVideosPornVideo setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
        }

    }

    public static class QueryMCJobListResponseBodyJobListJobResultPornResultPornVideos extends TeaModel {
        @NameInMap("PornVideo")
        public java.util.List<QueryMCJobListResponseBodyJobListJobResultPornResultPornVideosPornVideo> pornVideo;

        public static QueryMCJobListResponseBodyJobListJobResultPornResultPornVideos build(java.util.Map<String, ?> map) throws Exception {
            QueryMCJobListResponseBodyJobListJobResultPornResultPornVideos self = new QueryMCJobListResponseBodyJobListJobResultPornResultPornVideos();
            return TeaModel.build(map, self);
        }

        public QueryMCJobListResponseBodyJobListJobResultPornResultPornVideos setPornVideo(java.util.List<QueryMCJobListResponseBodyJobListJobResultPornResultPornVideosPornVideo> pornVideo) {
            this.pornVideo = pornVideo;
            return this;
        }
        public java.util.List<QueryMCJobListResponseBodyJobListJobResultPornResultPornVideosPornVideo> getPornVideo() {
            return this.pornVideo;
        }

    }

    public static class QueryMCJobListResponseBodyJobListJobResultPornResult extends TeaModel {
        @NameInMap("PornAudios")
        public QueryMCJobListResponseBodyJobListJobResultPornResultPornAudios pornAudios;

        @NameInMap("PornImages")
        public QueryMCJobListResponseBodyJobListJobResultPornResultPornImages pornImages;

        @NameInMap("PornOcrs")
        public QueryMCJobListResponseBodyJobListJobResultPornResultPornOcrs pornOcrs;

        @NameInMap("PornTexts")
        public QueryMCJobListResponseBodyJobListJobResultPornResultPornTexts pornTexts;

        @NameInMap("PornVideos")
        public QueryMCJobListResponseBodyJobListJobResultPornResultPornVideos pornVideos;

        public static QueryMCJobListResponseBodyJobListJobResultPornResult build(java.util.Map<String, ?> map) throws Exception {
            QueryMCJobListResponseBodyJobListJobResultPornResult self = new QueryMCJobListResponseBodyJobListJobResultPornResult();
            return TeaModel.build(map, self);
        }

        public QueryMCJobListResponseBodyJobListJobResultPornResult setPornAudios(QueryMCJobListResponseBodyJobListJobResultPornResultPornAudios pornAudios) {
            this.pornAudios = pornAudios;
            return this;
        }
        public QueryMCJobListResponseBodyJobListJobResultPornResultPornAudios getPornAudios() {
            return this.pornAudios;
        }

        public QueryMCJobListResponseBodyJobListJobResultPornResult setPornImages(QueryMCJobListResponseBodyJobListJobResultPornResultPornImages pornImages) {
            this.pornImages = pornImages;
            return this;
        }
        public QueryMCJobListResponseBodyJobListJobResultPornResultPornImages getPornImages() {
            return this.pornImages;
        }

        public QueryMCJobListResponseBodyJobListJobResultPornResult setPornOcrs(QueryMCJobListResponseBodyJobListJobResultPornResultPornOcrs pornOcrs) {
            this.pornOcrs = pornOcrs;
            return this;
        }
        public QueryMCJobListResponseBodyJobListJobResultPornResultPornOcrs getPornOcrs() {
            return this.pornOcrs;
        }

        public QueryMCJobListResponseBodyJobListJobResultPornResult setPornTexts(QueryMCJobListResponseBodyJobListJobResultPornResultPornTexts pornTexts) {
            this.pornTexts = pornTexts;
            return this;
        }
        public QueryMCJobListResponseBodyJobListJobResultPornResultPornTexts getPornTexts() {
            return this.pornTexts;
        }

        public QueryMCJobListResponseBodyJobListJobResultPornResult setPornVideos(QueryMCJobListResponseBodyJobListJobResultPornResultPornVideos pornVideos) {
            this.pornVideos = pornVideos;
            return this;
        }
        public QueryMCJobListResponseBodyJobListJobResultPornResultPornVideos getPornVideos() {
            return this.pornVideos;
        }

    }

    public static class QueryMCJobListResponseBodyJobListJobResultQrcodeResultQrcodeImagesQrcodeImage extends TeaModel {
        @NameInMap("Score")
        public String score;

        @NameInMap("Suggestion")
        public String suggestion;

        @NameInMap("Text")
        public String text;

        @NameInMap("Url")
        public String url;

        public static QueryMCJobListResponseBodyJobListJobResultQrcodeResultQrcodeImagesQrcodeImage build(java.util.Map<String, ?> map) throws Exception {
            QueryMCJobListResponseBodyJobListJobResultQrcodeResultQrcodeImagesQrcodeImage self = new QueryMCJobListResponseBodyJobListJobResultQrcodeResultQrcodeImagesQrcodeImage();
            return TeaModel.build(map, self);
        }

        public QueryMCJobListResponseBodyJobListJobResultQrcodeResultQrcodeImagesQrcodeImage setScore(String score) {
            this.score = score;
            return this;
        }
        public String getScore() {
            return this.score;
        }

        public QueryMCJobListResponseBodyJobListJobResultQrcodeResultQrcodeImagesQrcodeImage setSuggestion(String suggestion) {
            this.suggestion = suggestion;
            return this;
        }
        public String getSuggestion() {
            return this.suggestion;
        }

        public QueryMCJobListResponseBodyJobListJobResultQrcodeResultQrcodeImagesQrcodeImage setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

        public QueryMCJobListResponseBodyJobListJobResultQrcodeResultQrcodeImagesQrcodeImage setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class QueryMCJobListResponseBodyJobListJobResultQrcodeResultQrcodeImages extends TeaModel {
        @NameInMap("QrcodeImage")
        public java.util.List<QueryMCJobListResponseBodyJobListJobResultQrcodeResultQrcodeImagesQrcodeImage> qrcodeImage;

        public static QueryMCJobListResponseBodyJobListJobResultQrcodeResultQrcodeImages build(java.util.Map<String, ?> map) throws Exception {
            QueryMCJobListResponseBodyJobListJobResultQrcodeResultQrcodeImages self = new QueryMCJobListResponseBodyJobListJobResultQrcodeResultQrcodeImages();
            return TeaModel.build(map, self);
        }

        public QueryMCJobListResponseBodyJobListJobResultQrcodeResultQrcodeImages setQrcodeImage(java.util.List<QueryMCJobListResponseBodyJobListJobResultQrcodeResultQrcodeImagesQrcodeImage> qrcodeImage) {
            this.qrcodeImage = qrcodeImage;
            return this;
        }
        public java.util.List<QueryMCJobListResponseBodyJobListJobResultQrcodeResultQrcodeImagesQrcodeImage> getQrcodeImage() {
            return this.qrcodeImage;
        }

    }

    public static class QueryMCJobListResponseBodyJobListJobResultQrcodeResultQrcodeVideosQrcodeVideo extends TeaModel {
        @NameInMap("Object")
        public String object;

        @NameInMap("Score")
        public String score;

        @NameInMap("Suggestion")
        public String suggestion;

        @NameInMap("Time")
        public String time;

        public static QueryMCJobListResponseBodyJobListJobResultQrcodeResultQrcodeVideosQrcodeVideo build(java.util.Map<String, ?> map) throws Exception {
            QueryMCJobListResponseBodyJobListJobResultQrcodeResultQrcodeVideosQrcodeVideo self = new QueryMCJobListResponseBodyJobListJobResultQrcodeResultQrcodeVideosQrcodeVideo();
            return TeaModel.build(map, self);
        }

        public QueryMCJobListResponseBodyJobListJobResultQrcodeResultQrcodeVideosQrcodeVideo setObject(String object) {
            this.object = object;
            return this;
        }
        public String getObject() {
            return this.object;
        }

        public QueryMCJobListResponseBodyJobListJobResultQrcodeResultQrcodeVideosQrcodeVideo setScore(String score) {
            this.score = score;
            return this;
        }
        public String getScore() {
            return this.score;
        }

        public QueryMCJobListResponseBodyJobListJobResultQrcodeResultQrcodeVideosQrcodeVideo setSuggestion(String suggestion) {
            this.suggestion = suggestion;
            return this;
        }
        public String getSuggestion() {
            return this.suggestion;
        }

        public QueryMCJobListResponseBodyJobListJobResultQrcodeResultQrcodeVideosQrcodeVideo setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
        }

    }

    public static class QueryMCJobListResponseBodyJobListJobResultQrcodeResultQrcodeVideos extends TeaModel {
        @NameInMap("QrcodeVideo")
        public java.util.List<QueryMCJobListResponseBodyJobListJobResultQrcodeResultQrcodeVideosQrcodeVideo> qrcodeVideo;

        public static QueryMCJobListResponseBodyJobListJobResultQrcodeResultQrcodeVideos build(java.util.Map<String, ?> map) throws Exception {
            QueryMCJobListResponseBodyJobListJobResultQrcodeResultQrcodeVideos self = new QueryMCJobListResponseBodyJobListJobResultQrcodeResultQrcodeVideos();
            return TeaModel.build(map, self);
        }

        public QueryMCJobListResponseBodyJobListJobResultQrcodeResultQrcodeVideos setQrcodeVideo(java.util.List<QueryMCJobListResponseBodyJobListJobResultQrcodeResultQrcodeVideosQrcodeVideo> qrcodeVideo) {
            this.qrcodeVideo = qrcodeVideo;
            return this;
        }
        public java.util.List<QueryMCJobListResponseBodyJobListJobResultQrcodeResultQrcodeVideosQrcodeVideo> getQrcodeVideo() {
            return this.qrcodeVideo;
        }

    }

    public static class QueryMCJobListResponseBodyJobListJobResultQrcodeResult extends TeaModel {
        @NameInMap("QrcodeImages")
        public QueryMCJobListResponseBodyJobListJobResultQrcodeResultQrcodeImages qrcodeImages;

        @NameInMap("QrcodeVideos")
        public QueryMCJobListResponseBodyJobListJobResultQrcodeResultQrcodeVideos qrcodeVideos;

        public static QueryMCJobListResponseBodyJobListJobResultQrcodeResult build(java.util.Map<String, ?> map) throws Exception {
            QueryMCJobListResponseBodyJobListJobResultQrcodeResult self = new QueryMCJobListResponseBodyJobListJobResultQrcodeResult();
            return TeaModel.build(map, self);
        }

        public QueryMCJobListResponseBodyJobListJobResultQrcodeResult setQrcodeImages(QueryMCJobListResponseBodyJobListJobResultQrcodeResultQrcodeImages qrcodeImages) {
            this.qrcodeImages = qrcodeImages;
            return this;
        }
        public QueryMCJobListResponseBodyJobListJobResultQrcodeResultQrcodeImages getQrcodeImages() {
            return this.qrcodeImages;
        }

        public QueryMCJobListResponseBodyJobListJobResultQrcodeResult setQrcodeVideos(QueryMCJobListResponseBodyJobListJobResultQrcodeResultQrcodeVideos qrcodeVideos) {
            this.qrcodeVideos = qrcodeVideos;
            return this;
        }
        public QueryMCJobListResponseBodyJobListJobResultQrcodeResultQrcodeVideos getQrcodeVideos() {
            return this.qrcodeVideos;
        }

    }

    public static class QueryMCJobListResponseBodyJobListJobResultSpamResultSpamAudiosSpamAudio extends TeaModel {
        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("Object")
        public String object;

        @NameInMap("Score")
        public String score;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("Suggestion")
        public String suggestion;

        @NameInMap("Text")
        public String text;

        public static QueryMCJobListResponseBodyJobListJobResultSpamResultSpamAudiosSpamAudio build(java.util.Map<String, ?> map) throws Exception {
            QueryMCJobListResponseBodyJobListJobResultSpamResultSpamAudiosSpamAudio self = new QueryMCJobListResponseBodyJobListJobResultSpamResultSpamAudiosSpamAudio();
            return TeaModel.build(map, self);
        }

        public QueryMCJobListResponseBodyJobListJobResultSpamResultSpamAudiosSpamAudio setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public QueryMCJobListResponseBodyJobListJobResultSpamResultSpamAudiosSpamAudio setObject(String object) {
            this.object = object;
            return this;
        }
        public String getObject() {
            return this.object;
        }

        public QueryMCJobListResponseBodyJobListJobResultSpamResultSpamAudiosSpamAudio setScore(String score) {
            this.score = score;
            return this;
        }
        public String getScore() {
            return this.score;
        }

        public QueryMCJobListResponseBodyJobListJobResultSpamResultSpamAudiosSpamAudio setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public QueryMCJobListResponseBodyJobListJobResultSpamResultSpamAudiosSpamAudio setSuggestion(String suggestion) {
            this.suggestion = suggestion;
            return this;
        }
        public String getSuggestion() {
            return this.suggestion;
        }

        public QueryMCJobListResponseBodyJobListJobResultSpamResultSpamAudiosSpamAudio setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class QueryMCJobListResponseBodyJobListJobResultSpamResultSpamAudios extends TeaModel {
        @NameInMap("SpamAudio")
        public java.util.List<QueryMCJobListResponseBodyJobListJobResultSpamResultSpamAudiosSpamAudio> spamAudio;

        public static QueryMCJobListResponseBodyJobListJobResultSpamResultSpamAudios build(java.util.Map<String, ?> map) throws Exception {
            QueryMCJobListResponseBodyJobListJobResultSpamResultSpamAudios self = new QueryMCJobListResponseBodyJobListJobResultSpamResultSpamAudios();
            return TeaModel.build(map, self);
        }

        public QueryMCJobListResponseBodyJobListJobResultSpamResultSpamAudios setSpamAudio(java.util.List<QueryMCJobListResponseBodyJobListJobResultSpamResultSpamAudiosSpamAudio> spamAudio) {
            this.spamAudio = spamAudio;
            return this;
        }
        public java.util.List<QueryMCJobListResponseBodyJobListJobResultSpamResultSpamAudiosSpamAudio> getSpamAudio() {
            return this.spamAudio;
        }

    }

    public static class QueryMCJobListResponseBodyJobListJobResultSpamResultSpamOcrsSpamOcr extends TeaModel {
        @NameInMap("Object")
        public String object;

        @NameInMap("Score")
        public String score;

        @NameInMap("Suggestion")
        public String suggestion;

        @NameInMap("Text")
        public String text;

        @NameInMap("Time")
        public String time;

        public static QueryMCJobListResponseBodyJobListJobResultSpamResultSpamOcrsSpamOcr build(java.util.Map<String, ?> map) throws Exception {
            QueryMCJobListResponseBodyJobListJobResultSpamResultSpamOcrsSpamOcr self = new QueryMCJobListResponseBodyJobListJobResultSpamResultSpamOcrsSpamOcr();
            return TeaModel.build(map, self);
        }

        public QueryMCJobListResponseBodyJobListJobResultSpamResultSpamOcrsSpamOcr setObject(String object) {
            this.object = object;
            return this;
        }
        public String getObject() {
            return this.object;
        }

        public QueryMCJobListResponseBodyJobListJobResultSpamResultSpamOcrsSpamOcr setScore(String score) {
            this.score = score;
            return this;
        }
        public String getScore() {
            return this.score;
        }

        public QueryMCJobListResponseBodyJobListJobResultSpamResultSpamOcrsSpamOcr setSuggestion(String suggestion) {
            this.suggestion = suggestion;
            return this;
        }
        public String getSuggestion() {
            return this.suggestion;
        }

        public QueryMCJobListResponseBodyJobListJobResultSpamResultSpamOcrsSpamOcr setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

        public QueryMCJobListResponseBodyJobListJobResultSpamResultSpamOcrsSpamOcr setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
        }

    }

    public static class QueryMCJobListResponseBodyJobListJobResultSpamResultSpamOcrs extends TeaModel {
        @NameInMap("SpamOcr")
        public java.util.List<QueryMCJobListResponseBodyJobListJobResultSpamResultSpamOcrsSpamOcr> spamOcr;

        public static QueryMCJobListResponseBodyJobListJobResultSpamResultSpamOcrs build(java.util.Map<String, ?> map) throws Exception {
            QueryMCJobListResponseBodyJobListJobResultSpamResultSpamOcrs self = new QueryMCJobListResponseBodyJobListJobResultSpamResultSpamOcrs();
            return TeaModel.build(map, self);
        }

        public QueryMCJobListResponseBodyJobListJobResultSpamResultSpamOcrs setSpamOcr(java.util.List<QueryMCJobListResponseBodyJobListJobResultSpamResultSpamOcrsSpamOcr> spamOcr) {
            this.spamOcr = spamOcr;
            return this;
        }
        public java.util.List<QueryMCJobListResponseBodyJobListJobResultSpamResultSpamOcrsSpamOcr> getSpamOcr() {
            return this.spamOcr;
        }

    }

    public static class QueryMCJobListResponseBodyJobListJobResultSpamResultSpamTextsSpamText extends TeaModel {
        @NameInMap("Score")
        public String score;

        @NameInMap("Suggestion")
        public String suggestion;

        @NameInMap("Text")
        public String text;

        public static QueryMCJobListResponseBodyJobListJobResultSpamResultSpamTextsSpamText build(java.util.Map<String, ?> map) throws Exception {
            QueryMCJobListResponseBodyJobListJobResultSpamResultSpamTextsSpamText self = new QueryMCJobListResponseBodyJobListJobResultSpamResultSpamTextsSpamText();
            return TeaModel.build(map, self);
        }

        public QueryMCJobListResponseBodyJobListJobResultSpamResultSpamTextsSpamText setScore(String score) {
            this.score = score;
            return this;
        }
        public String getScore() {
            return this.score;
        }

        public QueryMCJobListResponseBodyJobListJobResultSpamResultSpamTextsSpamText setSuggestion(String suggestion) {
            this.suggestion = suggestion;
            return this;
        }
        public String getSuggestion() {
            return this.suggestion;
        }

        public QueryMCJobListResponseBodyJobListJobResultSpamResultSpamTextsSpamText setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class QueryMCJobListResponseBodyJobListJobResultSpamResultSpamTexts extends TeaModel {
        @NameInMap("SpamText")
        public java.util.List<QueryMCJobListResponseBodyJobListJobResultSpamResultSpamTextsSpamText> spamText;

        public static QueryMCJobListResponseBodyJobListJobResultSpamResultSpamTexts build(java.util.Map<String, ?> map) throws Exception {
            QueryMCJobListResponseBodyJobListJobResultSpamResultSpamTexts self = new QueryMCJobListResponseBodyJobListJobResultSpamResultSpamTexts();
            return TeaModel.build(map, self);
        }

        public QueryMCJobListResponseBodyJobListJobResultSpamResultSpamTexts setSpamText(java.util.List<QueryMCJobListResponseBodyJobListJobResultSpamResultSpamTextsSpamText> spamText) {
            this.spamText = spamText;
            return this;
        }
        public java.util.List<QueryMCJobListResponseBodyJobListJobResultSpamResultSpamTextsSpamText> getSpamText() {
            return this.spamText;
        }

    }

    public static class QueryMCJobListResponseBodyJobListJobResultSpamResult extends TeaModel {
        @NameInMap("SpamAudios")
        public QueryMCJobListResponseBodyJobListJobResultSpamResultSpamAudios spamAudios;

        @NameInMap("SpamOcrs")
        public QueryMCJobListResponseBodyJobListJobResultSpamResultSpamOcrs spamOcrs;

        @NameInMap("SpamTexts")
        public QueryMCJobListResponseBodyJobListJobResultSpamResultSpamTexts spamTexts;

        public static QueryMCJobListResponseBodyJobListJobResultSpamResult build(java.util.Map<String, ?> map) throws Exception {
            QueryMCJobListResponseBodyJobListJobResultSpamResult self = new QueryMCJobListResponseBodyJobListJobResultSpamResult();
            return TeaModel.build(map, self);
        }

        public QueryMCJobListResponseBodyJobListJobResultSpamResult setSpamAudios(QueryMCJobListResponseBodyJobListJobResultSpamResultSpamAudios spamAudios) {
            this.spamAudios = spamAudios;
            return this;
        }
        public QueryMCJobListResponseBodyJobListJobResultSpamResultSpamAudios getSpamAudios() {
            return this.spamAudios;
        }

        public QueryMCJobListResponseBodyJobListJobResultSpamResult setSpamOcrs(QueryMCJobListResponseBodyJobListJobResultSpamResultSpamOcrs spamOcrs) {
            this.spamOcrs = spamOcrs;
            return this;
        }
        public QueryMCJobListResponseBodyJobListJobResultSpamResultSpamOcrs getSpamOcrs() {
            return this.spamOcrs;
        }

        public QueryMCJobListResponseBodyJobListJobResultSpamResult setSpamTexts(QueryMCJobListResponseBodyJobListJobResultSpamResultSpamTexts spamTexts) {
            this.spamTexts = spamTexts;
            return this;
        }
        public QueryMCJobListResponseBodyJobListJobResultSpamResultSpamTexts getSpamTexts() {
            return this.spamTexts;
        }

    }

    public static class QueryMCJobListResponseBodyJobListJobResultTerrorismResultTerrorismAudiosTerrorismAudio extends TeaModel {
        @NameInMap("EndTime")
        public String endTime;

        @NameInMap("Object")
        public String object;

        @NameInMap("Score")
        public String score;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("Suggestion")
        public String suggestion;

        @NameInMap("Text")
        public String text;

        public static QueryMCJobListResponseBodyJobListJobResultTerrorismResultTerrorismAudiosTerrorismAudio build(java.util.Map<String, ?> map) throws Exception {
            QueryMCJobListResponseBodyJobListJobResultTerrorismResultTerrorismAudiosTerrorismAudio self = new QueryMCJobListResponseBodyJobListJobResultTerrorismResultTerrorismAudiosTerrorismAudio();
            return TeaModel.build(map, self);
        }

        public QueryMCJobListResponseBodyJobListJobResultTerrorismResultTerrorismAudiosTerrorismAudio setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public QueryMCJobListResponseBodyJobListJobResultTerrorismResultTerrorismAudiosTerrorismAudio setObject(String object) {
            this.object = object;
            return this;
        }
        public String getObject() {
            return this.object;
        }

        public QueryMCJobListResponseBodyJobListJobResultTerrorismResultTerrorismAudiosTerrorismAudio setScore(String score) {
            this.score = score;
            return this;
        }
        public String getScore() {
            return this.score;
        }

        public QueryMCJobListResponseBodyJobListJobResultTerrorismResultTerrorismAudiosTerrorismAudio setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public QueryMCJobListResponseBodyJobListJobResultTerrorismResultTerrorismAudiosTerrorismAudio setSuggestion(String suggestion) {
            this.suggestion = suggestion;
            return this;
        }
        public String getSuggestion() {
            return this.suggestion;
        }

        public QueryMCJobListResponseBodyJobListJobResultTerrorismResultTerrorismAudiosTerrorismAudio setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class QueryMCJobListResponseBodyJobListJobResultTerrorismResultTerrorismAudios extends TeaModel {
        @NameInMap("TerrorismAudio")
        public java.util.List<QueryMCJobListResponseBodyJobListJobResultTerrorismResultTerrorismAudiosTerrorismAudio> terrorismAudio;

        public static QueryMCJobListResponseBodyJobListJobResultTerrorismResultTerrorismAudios build(java.util.Map<String, ?> map) throws Exception {
            QueryMCJobListResponseBodyJobListJobResultTerrorismResultTerrorismAudios self = new QueryMCJobListResponseBodyJobListJobResultTerrorismResultTerrorismAudios();
            return TeaModel.build(map, self);
        }

        public QueryMCJobListResponseBodyJobListJobResultTerrorismResultTerrorismAudios setTerrorismAudio(java.util.List<QueryMCJobListResponseBodyJobListJobResultTerrorismResultTerrorismAudiosTerrorismAudio> terrorismAudio) {
            this.terrorismAudio = terrorismAudio;
            return this;
        }
        public java.util.List<QueryMCJobListResponseBodyJobListJobResultTerrorismResultTerrorismAudiosTerrorismAudio> getTerrorismAudio() {
            return this.terrorismAudio;
        }

    }

    public static class QueryMCJobListResponseBodyJobListJobResultTerrorismResultTerrorismImagesTerrorismImage extends TeaModel {
        @NameInMap("Score")
        public String score;

        @NameInMap("Suggestion")
        public String suggestion;

        @NameInMap("Text")
        public String text;

        @NameInMap("Url")
        public String url;

        public static QueryMCJobListResponseBodyJobListJobResultTerrorismResultTerrorismImagesTerrorismImage build(java.util.Map<String, ?> map) throws Exception {
            QueryMCJobListResponseBodyJobListJobResultTerrorismResultTerrorismImagesTerrorismImage self = new QueryMCJobListResponseBodyJobListJobResultTerrorismResultTerrorismImagesTerrorismImage();
            return TeaModel.build(map, self);
        }

        public QueryMCJobListResponseBodyJobListJobResultTerrorismResultTerrorismImagesTerrorismImage setScore(String score) {
            this.score = score;
            return this;
        }
        public String getScore() {
            return this.score;
        }

        public QueryMCJobListResponseBodyJobListJobResultTerrorismResultTerrorismImagesTerrorismImage setSuggestion(String suggestion) {
            this.suggestion = suggestion;
            return this;
        }
        public String getSuggestion() {
            return this.suggestion;
        }

        public QueryMCJobListResponseBodyJobListJobResultTerrorismResultTerrorismImagesTerrorismImage setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

        public QueryMCJobListResponseBodyJobListJobResultTerrorismResultTerrorismImagesTerrorismImage setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class QueryMCJobListResponseBodyJobListJobResultTerrorismResultTerrorismImages extends TeaModel {
        @NameInMap("TerrorismImage")
        public java.util.List<QueryMCJobListResponseBodyJobListJobResultTerrorismResultTerrorismImagesTerrorismImage> terrorismImage;

        public static QueryMCJobListResponseBodyJobListJobResultTerrorismResultTerrorismImages build(java.util.Map<String, ?> map) throws Exception {
            QueryMCJobListResponseBodyJobListJobResultTerrorismResultTerrorismImages self = new QueryMCJobListResponseBodyJobListJobResultTerrorismResultTerrorismImages();
            return TeaModel.build(map, self);
        }

        public QueryMCJobListResponseBodyJobListJobResultTerrorismResultTerrorismImages setTerrorismImage(java.util.List<QueryMCJobListResponseBodyJobListJobResultTerrorismResultTerrorismImagesTerrorismImage> terrorismImage) {
            this.terrorismImage = terrorismImage;
            return this;
        }
        public java.util.List<QueryMCJobListResponseBodyJobListJobResultTerrorismResultTerrorismImagesTerrorismImage> getTerrorismImage() {
            return this.terrorismImage;
        }

    }

    public static class QueryMCJobListResponseBodyJobListJobResultTerrorismResultTerrorismOcrsTerrorismOcr extends TeaModel {
        @NameInMap("Object")
        public String object;

        @NameInMap("Score")
        public String score;

        @NameInMap("Suggestion")
        public String suggestion;

        @NameInMap("Text")
        public String text;

        @NameInMap("Time")
        public String time;

        public static QueryMCJobListResponseBodyJobListJobResultTerrorismResultTerrorismOcrsTerrorismOcr build(java.util.Map<String, ?> map) throws Exception {
            QueryMCJobListResponseBodyJobListJobResultTerrorismResultTerrorismOcrsTerrorismOcr self = new QueryMCJobListResponseBodyJobListJobResultTerrorismResultTerrorismOcrsTerrorismOcr();
            return TeaModel.build(map, self);
        }

        public QueryMCJobListResponseBodyJobListJobResultTerrorismResultTerrorismOcrsTerrorismOcr setObject(String object) {
            this.object = object;
            return this;
        }
        public String getObject() {
            return this.object;
        }

        public QueryMCJobListResponseBodyJobListJobResultTerrorismResultTerrorismOcrsTerrorismOcr setScore(String score) {
            this.score = score;
            return this;
        }
        public String getScore() {
            return this.score;
        }

        public QueryMCJobListResponseBodyJobListJobResultTerrorismResultTerrorismOcrsTerrorismOcr setSuggestion(String suggestion) {
            this.suggestion = suggestion;
            return this;
        }
        public String getSuggestion() {
            return this.suggestion;
        }

        public QueryMCJobListResponseBodyJobListJobResultTerrorismResultTerrorismOcrsTerrorismOcr setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

        public QueryMCJobListResponseBodyJobListJobResultTerrorismResultTerrorismOcrsTerrorismOcr setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
        }

    }

    public static class QueryMCJobListResponseBodyJobListJobResultTerrorismResultTerrorismOcrs extends TeaModel {
        @NameInMap("TerrorismOcr")
        public java.util.List<QueryMCJobListResponseBodyJobListJobResultTerrorismResultTerrorismOcrsTerrorismOcr> terrorismOcr;

        public static QueryMCJobListResponseBodyJobListJobResultTerrorismResultTerrorismOcrs build(java.util.Map<String, ?> map) throws Exception {
            QueryMCJobListResponseBodyJobListJobResultTerrorismResultTerrorismOcrs self = new QueryMCJobListResponseBodyJobListJobResultTerrorismResultTerrorismOcrs();
            return TeaModel.build(map, self);
        }

        public QueryMCJobListResponseBodyJobListJobResultTerrorismResultTerrorismOcrs setTerrorismOcr(java.util.List<QueryMCJobListResponseBodyJobListJobResultTerrorismResultTerrorismOcrsTerrorismOcr> terrorismOcr) {
            this.terrorismOcr = terrorismOcr;
            return this;
        }
        public java.util.List<QueryMCJobListResponseBodyJobListJobResultTerrorismResultTerrorismOcrsTerrorismOcr> getTerrorismOcr() {
            return this.terrorismOcr;
        }

    }

    public static class QueryMCJobListResponseBodyJobListJobResultTerrorismResultTerrorismTextsTerrorismText extends TeaModel {
        @NameInMap("Score")
        public String score;

        @NameInMap("Suggestion")
        public String suggestion;

        @NameInMap("Text")
        public String text;

        public static QueryMCJobListResponseBodyJobListJobResultTerrorismResultTerrorismTextsTerrorismText build(java.util.Map<String, ?> map) throws Exception {
            QueryMCJobListResponseBodyJobListJobResultTerrorismResultTerrorismTextsTerrorismText self = new QueryMCJobListResponseBodyJobListJobResultTerrorismResultTerrorismTextsTerrorismText();
            return TeaModel.build(map, self);
        }

        public QueryMCJobListResponseBodyJobListJobResultTerrorismResultTerrorismTextsTerrorismText setScore(String score) {
            this.score = score;
            return this;
        }
        public String getScore() {
            return this.score;
        }

        public QueryMCJobListResponseBodyJobListJobResultTerrorismResultTerrorismTextsTerrorismText setSuggestion(String suggestion) {
            this.suggestion = suggestion;
            return this;
        }
        public String getSuggestion() {
            return this.suggestion;
        }

        public QueryMCJobListResponseBodyJobListJobResultTerrorismResultTerrorismTextsTerrorismText setText(String text) {
            this.text = text;
            return this;
        }
        public String getText() {
            return this.text;
        }

    }

    public static class QueryMCJobListResponseBodyJobListJobResultTerrorismResultTerrorismTexts extends TeaModel {
        @NameInMap("TerrorismText")
        public java.util.List<QueryMCJobListResponseBodyJobListJobResultTerrorismResultTerrorismTextsTerrorismText> terrorismText;

        public static QueryMCJobListResponseBodyJobListJobResultTerrorismResultTerrorismTexts build(java.util.Map<String, ?> map) throws Exception {
            QueryMCJobListResponseBodyJobListJobResultTerrorismResultTerrorismTexts self = new QueryMCJobListResponseBodyJobListJobResultTerrorismResultTerrorismTexts();
            return TeaModel.build(map, self);
        }

        public QueryMCJobListResponseBodyJobListJobResultTerrorismResultTerrorismTexts setTerrorismText(java.util.List<QueryMCJobListResponseBodyJobListJobResultTerrorismResultTerrorismTextsTerrorismText> terrorismText) {
            this.terrorismText = terrorismText;
            return this;
        }
        public java.util.List<QueryMCJobListResponseBodyJobListJobResultTerrorismResultTerrorismTextsTerrorismText> getTerrorismText() {
            return this.terrorismText;
        }

    }

    public static class QueryMCJobListResponseBodyJobListJobResultTerrorismResultTerrorismVideosTerrorismVideo extends TeaModel {
        @NameInMap("Object")
        public String object;

        @NameInMap("Score")
        public String score;

        @NameInMap("Suggestion")
        public String suggestion;

        @NameInMap("Time")
        public String time;

        public static QueryMCJobListResponseBodyJobListJobResultTerrorismResultTerrorismVideosTerrorismVideo build(java.util.Map<String, ?> map) throws Exception {
            QueryMCJobListResponseBodyJobListJobResultTerrorismResultTerrorismVideosTerrorismVideo self = new QueryMCJobListResponseBodyJobListJobResultTerrorismResultTerrorismVideosTerrorismVideo();
            return TeaModel.build(map, self);
        }

        public QueryMCJobListResponseBodyJobListJobResultTerrorismResultTerrorismVideosTerrorismVideo setObject(String object) {
            this.object = object;
            return this;
        }
        public String getObject() {
            return this.object;
        }

        public QueryMCJobListResponseBodyJobListJobResultTerrorismResultTerrorismVideosTerrorismVideo setScore(String score) {
            this.score = score;
            return this;
        }
        public String getScore() {
            return this.score;
        }

        public QueryMCJobListResponseBodyJobListJobResultTerrorismResultTerrorismVideosTerrorismVideo setSuggestion(String suggestion) {
            this.suggestion = suggestion;
            return this;
        }
        public String getSuggestion() {
            return this.suggestion;
        }

        public QueryMCJobListResponseBodyJobListJobResultTerrorismResultTerrorismVideosTerrorismVideo setTime(String time) {
            this.time = time;
            return this;
        }
        public String getTime() {
            return this.time;
        }

    }

    public static class QueryMCJobListResponseBodyJobListJobResultTerrorismResultTerrorismVideos extends TeaModel {
        @NameInMap("TerrorismVideo")
        public java.util.List<QueryMCJobListResponseBodyJobListJobResultTerrorismResultTerrorismVideosTerrorismVideo> terrorismVideo;

        public static QueryMCJobListResponseBodyJobListJobResultTerrorismResultTerrorismVideos build(java.util.Map<String, ?> map) throws Exception {
            QueryMCJobListResponseBodyJobListJobResultTerrorismResultTerrorismVideos self = new QueryMCJobListResponseBodyJobListJobResultTerrorismResultTerrorismVideos();
            return TeaModel.build(map, self);
        }

        public QueryMCJobListResponseBodyJobListJobResultTerrorismResultTerrorismVideos setTerrorismVideo(java.util.List<QueryMCJobListResponseBodyJobListJobResultTerrorismResultTerrorismVideosTerrorismVideo> terrorismVideo) {
            this.terrorismVideo = terrorismVideo;
            return this;
        }
        public java.util.List<QueryMCJobListResponseBodyJobListJobResultTerrorismResultTerrorismVideosTerrorismVideo> getTerrorismVideo() {
            return this.terrorismVideo;
        }

    }

    public static class QueryMCJobListResponseBodyJobListJobResultTerrorismResult extends TeaModel {
        @NameInMap("TerrorismAudios")
        public QueryMCJobListResponseBodyJobListJobResultTerrorismResultTerrorismAudios terrorismAudios;

        @NameInMap("TerrorismImages")
        public QueryMCJobListResponseBodyJobListJobResultTerrorismResultTerrorismImages terrorismImages;

        @NameInMap("TerrorismOcrs")
        public QueryMCJobListResponseBodyJobListJobResultTerrorismResultTerrorismOcrs terrorismOcrs;

        @NameInMap("TerrorismTexts")
        public QueryMCJobListResponseBodyJobListJobResultTerrorismResultTerrorismTexts terrorismTexts;

        @NameInMap("TerrorismVideos")
        public QueryMCJobListResponseBodyJobListJobResultTerrorismResultTerrorismVideos terrorismVideos;

        public static QueryMCJobListResponseBodyJobListJobResultTerrorismResult build(java.util.Map<String, ?> map) throws Exception {
            QueryMCJobListResponseBodyJobListJobResultTerrorismResult self = new QueryMCJobListResponseBodyJobListJobResultTerrorismResult();
            return TeaModel.build(map, self);
        }

        public QueryMCJobListResponseBodyJobListJobResultTerrorismResult setTerrorismAudios(QueryMCJobListResponseBodyJobListJobResultTerrorismResultTerrorismAudios terrorismAudios) {
            this.terrorismAudios = terrorismAudios;
            return this;
        }
        public QueryMCJobListResponseBodyJobListJobResultTerrorismResultTerrorismAudios getTerrorismAudios() {
            return this.terrorismAudios;
        }

        public QueryMCJobListResponseBodyJobListJobResultTerrorismResult setTerrorismImages(QueryMCJobListResponseBodyJobListJobResultTerrorismResultTerrorismImages terrorismImages) {
            this.terrorismImages = terrorismImages;
            return this;
        }
        public QueryMCJobListResponseBodyJobListJobResultTerrorismResultTerrorismImages getTerrorismImages() {
            return this.terrorismImages;
        }

        public QueryMCJobListResponseBodyJobListJobResultTerrorismResult setTerrorismOcrs(QueryMCJobListResponseBodyJobListJobResultTerrorismResultTerrorismOcrs terrorismOcrs) {
            this.terrorismOcrs = terrorismOcrs;
            return this;
        }
        public QueryMCJobListResponseBodyJobListJobResultTerrorismResultTerrorismOcrs getTerrorismOcrs() {
            return this.terrorismOcrs;
        }

        public QueryMCJobListResponseBodyJobListJobResultTerrorismResult setTerrorismTexts(QueryMCJobListResponseBodyJobListJobResultTerrorismResultTerrorismTexts terrorismTexts) {
            this.terrorismTexts = terrorismTexts;
            return this;
        }
        public QueryMCJobListResponseBodyJobListJobResultTerrorismResultTerrorismTexts getTerrorismTexts() {
            return this.terrorismTexts;
        }

        public QueryMCJobListResponseBodyJobListJobResultTerrorismResult setTerrorismVideos(QueryMCJobListResponseBodyJobListJobResultTerrorismResultTerrorismVideos terrorismVideos) {
            this.terrorismVideos = terrorismVideos;
            return this;
        }
        public QueryMCJobListResponseBodyJobListJobResultTerrorismResultTerrorismVideos getTerrorismVideos() {
            return this.terrorismVideos;
        }

    }

    public static class QueryMCJobListResponseBodyJobListJobResult extends TeaModel {
        @NameInMap("AbuseResult")
        public QueryMCJobListResponseBodyJobListJobResultAbuseResult abuseResult;

        @NameInMap("AdResult")
        public QueryMCJobListResponseBodyJobListJobResultAdResult adResult;

        @NameInMap("ContrabandResult")
        public QueryMCJobListResponseBodyJobListJobResultContrabandResult contrabandResult;

        @NameInMap("LiveResult")
        public QueryMCJobListResponseBodyJobListJobResultLiveResult liveResult;

        @NameInMap("LogoResult")
        public QueryMCJobListResponseBodyJobListJobResultLogoResult logoResult;

        @NameInMap("PoliticsResult")
        public QueryMCJobListResponseBodyJobListJobResultPoliticsResult politicsResult;

        @NameInMap("PornResult")
        public QueryMCJobListResponseBodyJobListJobResultPornResult pornResult;

        @NameInMap("QrcodeResult")
        public QueryMCJobListResponseBodyJobListJobResultQrcodeResult qrcodeResult;

        @NameInMap("Score")
        public String score;

        @NameInMap("SpamResult")
        public QueryMCJobListResponseBodyJobListJobResultSpamResult spamResult;

        @NameInMap("Suggestion")
        public String suggestion;

        @NameInMap("TerrorismResult")
        public QueryMCJobListResponseBodyJobListJobResultTerrorismResult terrorismResult;

        public static QueryMCJobListResponseBodyJobListJobResult build(java.util.Map<String, ?> map) throws Exception {
            QueryMCJobListResponseBodyJobListJobResult self = new QueryMCJobListResponseBodyJobListJobResult();
            return TeaModel.build(map, self);
        }

        public QueryMCJobListResponseBodyJobListJobResult setAbuseResult(QueryMCJobListResponseBodyJobListJobResultAbuseResult abuseResult) {
            this.abuseResult = abuseResult;
            return this;
        }
        public QueryMCJobListResponseBodyJobListJobResultAbuseResult getAbuseResult() {
            return this.abuseResult;
        }

        public QueryMCJobListResponseBodyJobListJobResult setAdResult(QueryMCJobListResponseBodyJobListJobResultAdResult adResult) {
            this.adResult = adResult;
            return this;
        }
        public QueryMCJobListResponseBodyJobListJobResultAdResult getAdResult() {
            return this.adResult;
        }

        public QueryMCJobListResponseBodyJobListJobResult setContrabandResult(QueryMCJobListResponseBodyJobListJobResultContrabandResult contrabandResult) {
            this.contrabandResult = contrabandResult;
            return this;
        }
        public QueryMCJobListResponseBodyJobListJobResultContrabandResult getContrabandResult() {
            return this.contrabandResult;
        }

        public QueryMCJobListResponseBodyJobListJobResult setLiveResult(QueryMCJobListResponseBodyJobListJobResultLiveResult liveResult) {
            this.liveResult = liveResult;
            return this;
        }
        public QueryMCJobListResponseBodyJobListJobResultLiveResult getLiveResult() {
            return this.liveResult;
        }

        public QueryMCJobListResponseBodyJobListJobResult setLogoResult(QueryMCJobListResponseBodyJobListJobResultLogoResult logoResult) {
            this.logoResult = logoResult;
            return this;
        }
        public QueryMCJobListResponseBodyJobListJobResultLogoResult getLogoResult() {
            return this.logoResult;
        }

        public QueryMCJobListResponseBodyJobListJobResult setPoliticsResult(QueryMCJobListResponseBodyJobListJobResultPoliticsResult politicsResult) {
            this.politicsResult = politicsResult;
            return this;
        }
        public QueryMCJobListResponseBodyJobListJobResultPoliticsResult getPoliticsResult() {
            return this.politicsResult;
        }

        public QueryMCJobListResponseBodyJobListJobResult setPornResult(QueryMCJobListResponseBodyJobListJobResultPornResult pornResult) {
            this.pornResult = pornResult;
            return this;
        }
        public QueryMCJobListResponseBodyJobListJobResultPornResult getPornResult() {
            return this.pornResult;
        }

        public QueryMCJobListResponseBodyJobListJobResult setQrcodeResult(QueryMCJobListResponseBodyJobListJobResultQrcodeResult qrcodeResult) {
            this.qrcodeResult = qrcodeResult;
            return this;
        }
        public QueryMCJobListResponseBodyJobListJobResultQrcodeResult getQrcodeResult() {
            return this.qrcodeResult;
        }

        public QueryMCJobListResponseBodyJobListJobResult setScore(String score) {
            this.score = score;
            return this;
        }
        public String getScore() {
            return this.score;
        }

        public QueryMCJobListResponseBodyJobListJobResult setSpamResult(QueryMCJobListResponseBodyJobListJobResultSpamResult spamResult) {
            this.spamResult = spamResult;
            return this;
        }
        public QueryMCJobListResponseBodyJobListJobResultSpamResult getSpamResult() {
            return this.spamResult;
        }

        public QueryMCJobListResponseBodyJobListJobResult setSuggestion(String suggestion) {
            this.suggestion = suggestion;
            return this;
        }
        public String getSuggestion() {
            return this.suggestion;
        }

        public QueryMCJobListResponseBodyJobListJobResult setTerrorismResult(QueryMCJobListResponseBodyJobListJobResultTerrorismResult terrorismResult) {
            this.terrorismResult = terrorismResult;
            return this;
        }
        public QueryMCJobListResponseBodyJobListJobResultTerrorismResult getTerrorismResult() {
            return this.terrorismResult;
        }

    }

    public static class QueryMCJobListResponseBodyJobListJob extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("JobId")
        public String jobId;

        @NameInMap("Message")
        public String message;

        @NameInMap("PipelineId")
        public String pipelineId;

        @NameInMap("Result")
        public QueryMCJobListResponseBodyJobListJobResult result;

        @NameInMap("ResultOutputFile")
        public String resultOutputFile;

        @NameInMap("State")
        public String state;

        @NameInMap("UserData")
        public String userData;

        public static QueryMCJobListResponseBodyJobListJob build(java.util.Map<String, ?> map) throws Exception {
            QueryMCJobListResponseBodyJobListJob self = new QueryMCJobListResponseBodyJobListJob();
            return TeaModel.build(map, self);
        }

        public QueryMCJobListResponseBodyJobListJob setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryMCJobListResponseBodyJobListJob setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public QueryMCJobListResponseBodyJobListJob setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public QueryMCJobListResponseBodyJobListJob setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public QueryMCJobListResponseBodyJobListJob setPipelineId(String pipelineId) {
            this.pipelineId = pipelineId;
            return this;
        }
        public String getPipelineId() {
            return this.pipelineId;
        }

        public QueryMCJobListResponseBodyJobListJob setResult(QueryMCJobListResponseBodyJobListJobResult result) {
            this.result = result;
            return this;
        }
        public QueryMCJobListResponseBodyJobListJobResult getResult() {
            return this.result;
        }

        public QueryMCJobListResponseBodyJobListJob setResultOutputFile(String resultOutputFile) {
            this.resultOutputFile = resultOutputFile;
            return this;
        }
        public String getResultOutputFile() {
            return this.resultOutputFile;
        }

        public QueryMCJobListResponseBodyJobListJob setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public QueryMCJobListResponseBodyJobListJob setUserData(String userData) {
            this.userData = userData;
            return this;
        }
        public String getUserData() {
            return this.userData;
        }

    }

    public static class QueryMCJobListResponseBodyJobList extends TeaModel {
        @NameInMap("Job")
        public java.util.List<QueryMCJobListResponseBodyJobListJob> job;

        public static QueryMCJobListResponseBodyJobList build(java.util.Map<String, ?> map) throws Exception {
            QueryMCJobListResponseBodyJobList self = new QueryMCJobListResponseBodyJobList();
            return TeaModel.build(map, self);
        }

        public QueryMCJobListResponseBodyJobList setJob(java.util.List<QueryMCJobListResponseBodyJobListJob> job) {
            this.job = job;
            return this;
        }
        public java.util.List<QueryMCJobListResponseBodyJobListJob> getJob() {
            return this.job;
        }

    }

    public static class QueryMCJobListResponseBodyNonExistIds extends TeaModel {
        @NameInMap("String")
        public java.util.List<String> string;

        public static QueryMCJobListResponseBodyNonExistIds build(java.util.Map<String, ?> map) throws Exception {
            QueryMCJobListResponseBodyNonExistIds self = new QueryMCJobListResponseBodyNonExistIds();
            return TeaModel.build(map, self);
        }

        public QueryMCJobListResponseBodyNonExistIds setString(java.util.List<String> string) {
            this.string = string;
            return this;
        }
        public java.util.List<String> getString() {
            return this.string;
        }

    }

}
