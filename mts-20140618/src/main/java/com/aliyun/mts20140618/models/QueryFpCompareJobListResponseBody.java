// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class QueryFpCompareJobListResponseBody extends TeaModel {
    @NameInMap("FpCompareJobList")
    public QueryFpCompareJobListResponseBodyFpCompareJobList fpCompareJobList;

    @NameInMap("NonExistIds")
    public QueryFpCompareJobListResponseBodyNonExistIds nonExistIds;

    @NameInMap("RequestId")
    public String requestId;

    public static QueryFpCompareJobListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryFpCompareJobListResponseBody self = new QueryFpCompareJobListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryFpCompareJobListResponseBody setFpCompareJobList(QueryFpCompareJobListResponseBodyFpCompareJobList fpCompareJobList) {
        this.fpCompareJobList = fpCompareJobList;
        return this;
    }
    public QueryFpCompareJobListResponseBodyFpCompareJobList getFpCompareJobList() {
        return this.fpCompareJobList;
    }

    public QueryFpCompareJobListResponseBody setNonExistIds(QueryFpCompareJobListResponseBodyNonExistIds nonExistIds) {
        this.nonExistIds = nonExistIds;
        return this;
    }
    public QueryFpCompareJobListResponseBodyNonExistIds getNonExistIds() {
        return this.nonExistIds;
    }

    public QueryFpCompareJobListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class QueryFpCompareJobListResponseBodyFpCompareJobListFpCompareJobFpCompareResultMasterMediaInfo extends TeaModel {
        @NameInMap("AudioBitRate")
        public String audioBitRate;

        @NameInMap("AudioChannels")
        public String audioChannels;

        @NameInMap("AudioSampleRate")
        public String audioSampleRate;

        @NameInMap("Duration")
        public String duration;

        @NameInMap("FpNum")
        public String fpNum;

        @NameInMap("Fps")
        public String fps;

        @NameInMap("Height")
        public String height;

        @NameInMap("TotalVideoFrame")
        public String totalVideoFrame;

        @NameInMap("Width")
        public String width;

        public static QueryFpCompareJobListResponseBodyFpCompareJobListFpCompareJobFpCompareResultMasterMediaInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryFpCompareJobListResponseBodyFpCompareJobListFpCompareJobFpCompareResultMasterMediaInfo self = new QueryFpCompareJobListResponseBodyFpCompareJobListFpCompareJobFpCompareResultMasterMediaInfo();
            return TeaModel.build(map, self);
        }

        public QueryFpCompareJobListResponseBodyFpCompareJobListFpCompareJobFpCompareResultMasterMediaInfo setAudioBitRate(String audioBitRate) {
            this.audioBitRate = audioBitRate;
            return this;
        }
        public String getAudioBitRate() {
            return this.audioBitRate;
        }

        public QueryFpCompareJobListResponseBodyFpCompareJobListFpCompareJobFpCompareResultMasterMediaInfo setAudioChannels(String audioChannels) {
            this.audioChannels = audioChannels;
            return this;
        }
        public String getAudioChannels() {
            return this.audioChannels;
        }

        public QueryFpCompareJobListResponseBodyFpCompareJobListFpCompareJobFpCompareResultMasterMediaInfo setAudioSampleRate(String audioSampleRate) {
            this.audioSampleRate = audioSampleRate;
            return this;
        }
        public String getAudioSampleRate() {
            return this.audioSampleRate;
        }

        public QueryFpCompareJobListResponseBodyFpCompareJobListFpCompareJobFpCompareResultMasterMediaInfo setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public QueryFpCompareJobListResponseBodyFpCompareJobListFpCompareJobFpCompareResultMasterMediaInfo setFpNum(String fpNum) {
            this.fpNum = fpNum;
            return this;
        }
        public String getFpNum() {
            return this.fpNum;
        }

        public QueryFpCompareJobListResponseBodyFpCompareJobListFpCompareJobFpCompareResultMasterMediaInfo setFps(String fps) {
            this.fps = fps;
            return this;
        }
        public String getFps() {
            return this.fps;
        }

        public QueryFpCompareJobListResponseBodyFpCompareJobListFpCompareJobFpCompareResultMasterMediaInfo setHeight(String height) {
            this.height = height;
            return this;
        }
        public String getHeight() {
            return this.height;
        }

        public QueryFpCompareJobListResponseBodyFpCompareJobListFpCompareJobFpCompareResultMasterMediaInfo setTotalVideoFrame(String totalVideoFrame) {
            this.totalVideoFrame = totalVideoFrame;
            return this;
        }
        public String getTotalVideoFrame() {
            return this.totalVideoFrame;
        }

        public QueryFpCompareJobListResponseBodyFpCompareJobListFpCompareJobFpCompareResultMasterMediaInfo setWidth(String width) {
            this.width = width;
            return this;
        }
        public String getWidth() {
            return this.width;
        }

    }

    public static class QueryFpCompareJobListResponseBodyFpCompareJobListFpCompareJobFpCompareResultMediaMatchSegmentsMediaMatchSegment extends TeaModel {
        @NameInMap("MasterEndFrame")
        public String masterEndFrame;

        @NameInMap("MasterEndTime")
        public String masterEndTime;

        @NameInMap("MasterStartFrame")
        public String masterStartFrame;

        @NameInMap("MasterStartTime")
        public String masterStartTime;

        @NameInMap("QueryEndFrame")
        public String queryEndFrame;

        @NameInMap("QueryEndTime")
        public String queryEndTime;

        @NameInMap("QueryStartFrame")
        public String queryStartFrame;

        @NameInMap("QueryStartTime")
        public String queryStartTime;

        @NameInMap("Score")
        public String score;

        @NameInMap("TotalMatchFrameNum")
        public String totalMatchFrameNum;

        public static QueryFpCompareJobListResponseBodyFpCompareJobListFpCompareJobFpCompareResultMediaMatchSegmentsMediaMatchSegment build(java.util.Map<String, ?> map) throws Exception {
            QueryFpCompareJobListResponseBodyFpCompareJobListFpCompareJobFpCompareResultMediaMatchSegmentsMediaMatchSegment self = new QueryFpCompareJobListResponseBodyFpCompareJobListFpCompareJobFpCompareResultMediaMatchSegmentsMediaMatchSegment();
            return TeaModel.build(map, self);
        }

        public QueryFpCompareJobListResponseBodyFpCompareJobListFpCompareJobFpCompareResultMediaMatchSegmentsMediaMatchSegment setMasterEndFrame(String masterEndFrame) {
            this.masterEndFrame = masterEndFrame;
            return this;
        }
        public String getMasterEndFrame() {
            return this.masterEndFrame;
        }

        public QueryFpCompareJobListResponseBodyFpCompareJobListFpCompareJobFpCompareResultMediaMatchSegmentsMediaMatchSegment setMasterEndTime(String masterEndTime) {
            this.masterEndTime = masterEndTime;
            return this;
        }
        public String getMasterEndTime() {
            return this.masterEndTime;
        }

        public QueryFpCompareJobListResponseBodyFpCompareJobListFpCompareJobFpCompareResultMediaMatchSegmentsMediaMatchSegment setMasterStartFrame(String masterStartFrame) {
            this.masterStartFrame = masterStartFrame;
            return this;
        }
        public String getMasterStartFrame() {
            return this.masterStartFrame;
        }

        public QueryFpCompareJobListResponseBodyFpCompareJobListFpCompareJobFpCompareResultMediaMatchSegmentsMediaMatchSegment setMasterStartTime(String masterStartTime) {
            this.masterStartTime = masterStartTime;
            return this;
        }
        public String getMasterStartTime() {
            return this.masterStartTime;
        }

        public QueryFpCompareJobListResponseBodyFpCompareJobListFpCompareJobFpCompareResultMediaMatchSegmentsMediaMatchSegment setQueryEndFrame(String queryEndFrame) {
            this.queryEndFrame = queryEndFrame;
            return this;
        }
        public String getQueryEndFrame() {
            return this.queryEndFrame;
        }

        public QueryFpCompareJobListResponseBodyFpCompareJobListFpCompareJobFpCompareResultMediaMatchSegmentsMediaMatchSegment setQueryEndTime(String queryEndTime) {
            this.queryEndTime = queryEndTime;
            return this;
        }
        public String getQueryEndTime() {
            return this.queryEndTime;
        }

        public QueryFpCompareJobListResponseBodyFpCompareJobListFpCompareJobFpCompareResultMediaMatchSegmentsMediaMatchSegment setQueryStartFrame(String queryStartFrame) {
            this.queryStartFrame = queryStartFrame;
            return this;
        }
        public String getQueryStartFrame() {
            return this.queryStartFrame;
        }

        public QueryFpCompareJobListResponseBodyFpCompareJobListFpCompareJobFpCompareResultMediaMatchSegmentsMediaMatchSegment setQueryStartTime(String queryStartTime) {
            this.queryStartTime = queryStartTime;
            return this;
        }
        public String getQueryStartTime() {
            return this.queryStartTime;
        }

        public QueryFpCompareJobListResponseBodyFpCompareJobListFpCompareJobFpCompareResultMediaMatchSegmentsMediaMatchSegment setScore(String score) {
            this.score = score;
            return this;
        }
        public String getScore() {
            return this.score;
        }

        public QueryFpCompareJobListResponseBodyFpCompareJobListFpCompareJobFpCompareResultMediaMatchSegmentsMediaMatchSegment setTotalMatchFrameNum(String totalMatchFrameNum) {
            this.totalMatchFrameNum = totalMatchFrameNum;
            return this;
        }
        public String getTotalMatchFrameNum() {
            return this.totalMatchFrameNum;
        }

    }

    public static class QueryFpCompareJobListResponseBodyFpCompareJobListFpCompareJobFpCompareResultMediaMatchSegments extends TeaModel {
        @NameInMap("MediaMatchSegment")
        public java.util.List<QueryFpCompareJobListResponseBodyFpCompareJobListFpCompareJobFpCompareResultMediaMatchSegmentsMediaMatchSegment> mediaMatchSegment;

        public static QueryFpCompareJobListResponseBodyFpCompareJobListFpCompareJobFpCompareResultMediaMatchSegments build(java.util.Map<String, ?> map) throws Exception {
            QueryFpCompareJobListResponseBodyFpCompareJobListFpCompareJobFpCompareResultMediaMatchSegments self = new QueryFpCompareJobListResponseBodyFpCompareJobListFpCompareJobFpCompareResultMediaMatchSegments();
            return TeaModel.build(map, self);
        }

        public QueryFpCompareJobListResponseBodyFpCompareJobListFpCompareJobFpCompareResultMediaMatchSegments setMediaMatchSegment(java.util.List<QueryFpCompareJobListResponseBodyFpCompareJobListFpCompareJobFpCompareResultMediaMatchSegmentsMediaMatchSegment> mediaMatchSegment) {
            this.mediaMatchSegment = mediaMatchSegment;
            return this;
        }
        public java.util.List<QueryFpCompareJobListResponseBodyFpCompareJobListFpCompareJobFpCompareResultMediaMatchSegmentsMediaMatchSegment> getMediaMatchSegment() {
            return this.mediaMatchSegment;
        }

    }

    public static class QueryFpCompareJobListResponseBodyFpCompareJobListFpCompareJobFpCompareResultQueryMediaInfo extends TeaModel {
        @NameInMap("AudioBitRate")
        public String audioBitRate;

        @NameInMap("AudioChannels")
        public String audioChannels;

        @NameInMap("AudioSampleRate")
        public String audioSampleRate;

        @NameInMap("Duration")
        public String duration;

        @NameInMap("FpNum")
        public String fpNum;

        @NameInMap("Fps")
        public String fps;

        @NameInMap("Height")
        public String height;

        @NameInMap("TotalVideoFrame")
        public String totalVideoFrame;

        @NameInMap("Width")
        public String width;

        public static QueryFpCompareJobListResponseBodyFpCompareJobListFpCompareJobFpCompareResultQueryMediaInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryFpCompareJobListResponseBodyFpCompareJobListFpCompareJobFpCompareResultQueryMediaInfo self = new QueryFpCompareJobListResponseBodyFpCompareJobListFpCompareJobFpCompareResultQueryMediaInfo();
            return TeaModel.build(map, self);
        }

        public QueryFpCompareJobListResponseBodyFpCompareJobListFpCompareJobFpCompareResultQueryMediaInfo setAudioBitRate(String audioBitRate) {
            this.audioBitRate = audioBitRate;
            return this;
        }
        public String getAudioBitRate() {
            return this.audioBitRate;
        }

        public QueryFpCompareJobListResponseBodyFpCompareJobListFpCompareJobFpCompareResultQueryMediaInfo setAudioChannels(String audioChannels) {
            this.audioChannels = audioChannels;
            return this;
        }
        public String getAudioChannels() {
            return this.audioChannels;
        }

        public QueryFpCompareJobListResponseBodyFpCompareJobListFpCompareJobFpCompareResultQueryMediaInfo setAudioSampleRate(String audioSampleRate) {
            this.audioSampleRate = audioSampleRate;
            return this;
        }
        public String getAudioSampleRate() {
            return this.audioSampleRate;
        }

        public QueryFpCompareJobListResponseBodyFpCompareJobListFpCompareJobFpCompareResultQueryMediaInfo setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public QueryFpCompareJobListResponseBodyFpCompareJobListFpCompareJobFpCompareResultQueryMediaInfo setFpNum(String fpNum) {
            this.fpNum = fpNum;
            return this;
        }
        public String getFpNum() {
            return this.fpNum;
        }

        public QueryFpCompareJobListResponseBodyFpCompareJobListFpCompareJobFpCompareResultQueryMediaInfo setFps(String fps) {
            this.fps = fps;
            return this;
        }
        public String getFps() {
            return this.fps;
        }

        public QueryFpCompareJobListResponseBodyFpCompareJobListFpCompareJobFpCompareResultQueryMediaInfo setHeight(String height) {
            this.height = height;
            return this;
        }
        public String getHeight() {
            return this.height;
        }

        public QueryFpCompareJobListResponseBodyFpCompareJobListFpCompareJobFpCompareResultQueryMediaInfo setTotalVideoFrame(String totalVideoFrame) {
            this.totalVideoFrame = totalVideoFrame;
            return this;
        }
        public String getTotalVideoFrame() {
            return this.totalVideoFrame;
        }

        public QueryFpCompareJobListResponseBodyFpCompareJobListFpCompareJobFpCompareResultQueryMediaInfo setWidth(String width) {
            this.width = width;
            return this;
        }
        public String getWidth() {
            return this.width;
        }

    }

    public static class QueryFpCompareJobListResponseBodyFpCompareJobListFpCompareJobFpCompareResult extends TeaModel {
        @NameInMap("MasterMediaInfo")
        public QueryFpCompareJobListResponseBodyFpCompareJobListFpCompareJobFpCompareResultMasterMediaInfo masterMediaInfo;

        @NameInMap("MediaMatchSegments")
        public QueryFpCompareJobListResponseBodyFpCompareJobListFpCompareJobFpCompareResultMediaMatchSegments mediaMatchSegments;

        @NameInMap("QueryMediaInfo")
        public QueryFpCompareJobListResponseBodyFpCompareJobListFpCompareJobFpCompareResultQueryMediaInfo queryMediaInfo;

        public static QueryFpCompareJobListResponseBodyFpCompareJobListFpCompareJobFpCompareResult build(java.util.Map<String, ?> map) throws Exception {
            QueryFpCompareJobListResponseBodyFpCompareJobListFpCompareJobFpCompareResult self = new QueryFpCompareJobListResponseBodyFpCompareJobListFpCompareJobFpCompareResult();
            return TeaModel.build(map, self);
        }

        public QueryFpCompareJobListResponseBodyFpCompareJobListFpCompareJobFpCompareResult setMasterMediaInfo(QueryFpCompareJobListResponseBodyFpCompareJobListFpCompareJobFpCompareResultMasterMediaInfo masterMediaInfo) {
            this.masterMediaInfo = masterMediaInfo;
            return this;
        }
        public QueryFpCompareJobListResponseBodyFpCompareJobListFpCompareJobFpCompareResultMasterMediaInfo getMasterMediaInfo() {
            return this.masterMediaInfo;
        }

        public QueryFpCompareJobListResponseBodyFpCompareJobListFpCompareJobFpCompareResult setMediaMatchSegments(QueryFpCompareJobListResponseBodyFpCompareJobListFpCompareJobFpCompareResultMediaMatchSegments mediaMatchSegments) {
            this.mediaMatchSegments = mediaMatchSegments;
            return this;
        }
        public QueryFpCompareJobListResponseBodyFpCompareJobListFpCompareJobFpCompareResultMediaMatchSegments getMediaMatchSegments() {
            return this.mediaMatchSegments;
        }

        public QueryFpCompareJobListResponseBodyFpCompareJobListFpCompareJobFpCompareResult setQueryMediaInfo(QueryFpCompareJobListResponseBodyFpCompareJobListFpCompareJobFpCompareResultQueryMediaInfo queryMediaInfo) {
            this.queryMediaInfo = queryMediaInfo;
            return this;
        }
        public QueryFpCompareJobListResponseBodyFpCompareJobListFpCompareJobFpCompareResultQueryMediaInfo getQueryMediaInfo() {
            return this.queryMediaInfo;
        }

    }

    public static class QueryFpCompareJobListResponseBodyFpCompareJobListFpCompareJobMasterFile extends TeaModel {
        @NameInMap("Bucket")
        public String bucket;

        @NameInMap("Location")
        public String location;

        @NameInMap("Object")
        public String object;

        public static QueryFpCompareJobListResponseBodyFpCompareJobListFpCompareJobMasterFile build(java.util.Map<String, ?> map) throws Exception {
            QueryFpCompareJobListResponseBodyFpCompareJobListFpCompareJobMasterFile self = new QueryFpCompareJobListResponseBodyFpCompareJobListFpCompareJobMasterFile();
            return TeaModel.build(map, self);
        }

        public QueryFpCompareJobListResponseBodyFpCompareJobListFpCompareJobMasterFile setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

        public QueryFpCompareJobListResponseBodyFpCompareJobListFpCompareJobMasterFile setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public QueryFpCompareJobListResponseBodyFpCompareJobListFpCompareJobMasterFile setObject(String object) {
            this.object = object;
            return this;
        }
        public String getObject() {
            return this.object;
        }

    }

    public static class QueryFpCompareJobListResponseBodyFpCompareJobListFpCompareJobMatchFrameStorageMasterMediaFrames extends TeaModel {
        @NameInMap("Bucket")
        public String bucket;

        @NameInMap("Location")
        public String location;

        @NameInMap("Object")
        public String object;

        public static QueryFpCompareJobListResponseBodyFpCompareJobListFpCompareJobMatchFrameStorageMasterMediaFrames build(java.util.Map<String, ?> map) throws Exception {
            QueryFpCompareJobListResponseBodyFpCompareJobListFpCompareJobMatchFrameStorageMasterMediaFrames self = new QueryFpCompareJobListResponseBodyFpCompareJobListFpCompareJobMatchFrameStorageMasterMediaFrames();
            return TeaModel.build(map, self);
        }

        public QueryFpCompareJobListResponseBodyFpCompareJobListFpCompareJobMatchFrameStorageMasterMediaFrames setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

        public QueryFpCompareJobListResponseBodyFpCompareJobListFpCompareJobMatchFrameStorageMasterMediaFrames setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public QueryFpCompareJobListResponseBodyFpCompareJobListFpCompareJobMatchFrameStorageMasterMediaFrames setObject(String object) {
            this.object = object;
            return this;
        }
        public String getObject() {
            return this.object;
        }

    }

    public static class QueryFpCompareJobListResponseBodyFpCompareJobListFpCompareJobMatchFrameStorageMatchedFramesDescFile extends TeaModel {
        @NameInMap("Bucket")
        public String bucket;

        @NameInMap("Location")
        public String location;

        @NameInMap("Object")
        public String object;

        public static QueryFpCompareJobListResponseBodyFpCompareJobListFpCompareJobMatchFrameStorageMatchedFramesDescFile build(java.util.Map<String, ?> map) throws Exception {
            QueryFpCompareJobListResponseBodyFpCompareJobListFpCompareJobMatchFrameStorageMatchedFramesDescFile self = new QueryFpCompareJobListResponseBodyFpCompareJobListFpCompareJobMatchFrameStorageMatchedFramesDescFile();
            return TeaModel.build(map, self);
        }

        public QueryFpCompareJobListResponseBodyFpCompareJobListFpCompareJobMatchFrameStorageMatchedFramesDescFile setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

        public QueryFpCompareJobListResponseBodyFpCompareJobListFpCompareJobMatchFrameStorageMatchedFramesDescFile setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public QueryFpCompareJobListResponseBodyFpCompareJobListFpCompareJobMatchFrameStorageMatchedFramesDescFile setObject(String object) {
            this.object = object;
            return this;
        }
        public String getObject() {
            return this.object;
        }

    }

    public static class QueryFpCompareJobListResponseBodyFpCompareJobListFpCompareJobMatchFrameStorageQueryMediaFrames extends TeaModel {
        @NameInMap("Bucket")
        public String bucket;

        @NameInMap("Location")
        public String location;

        @NameInMap("Object")
        public String object;

        public static QueryFpCompareJobListResponseBodyFpCompareJobListFpCompareJobMatchFrameStorageQueryMediaFrames build(java.util.Map<String, ?> map) throws Exception {
            QueryFpCompareJobListResponseBodyFpCompareJobListFpCompareJobMatchFrameStorageQueryMediaFrames self = new QueryFpCompareJobListResponseBodyFpCompareJobListFpCompareJobMatchFrameStorageQueryMediaFrames();
            return TeaModel.build(map, self);
        }

        public QueryFpCompareJobListResponseBodyFpCompareJobListFpCompareJobMatchFrameStorageQueryMediaFrames setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

        public QueryFpCompareJobListResponseBodyFpCompareJobListFpCompareJobMatchFrameStorageQueryMediaFrames setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public QueryFpCompareJobListResponseBodyFpCompareJobListFpCompareJobMatchFrameStorageQueryMediaFrames setObject(String object) {
            this.object = object;
            return this;
        }
        public String getObject() {
            return this.object;
        }

    }

    public static class QueryFpCompareJobListResponseBodyFpCompareJobListFpCompareJobMatchFrameStorage extends TeaModel {
        @NameInMap("MasterMediaFrames")
        public QueryFpCompareJobListResponseBodyFpCompareJobListFpCompareJobMatchFrameStorageMasterMediaFrames masterMediaFrames;

        @NameInMap("MatchedFramesDescFile")
        public QueryFpCompareJobListResponseBodyFpCompareJobListFpCompareJobMatchFrameStorageMatchedFramesDescFile matchedFramesDescFile;

        @NameInMap("QueryMediaFrames")
        public QueryFpCompareJobListResponseBodyFpCompareJobListFpCompareJobMatchFrameStorageQueryMediaFrames queryMediaFrames;

        public static QueryFpCompareJobListResponseBodyFpCompareJobListFpCompareJobMatchFrameStorage build(java.util.Map<String, ?> map) throws Exception {
            QueryFpCompareJobListResponseBodyFpCompareJobListFpCompareJobMatchFrameStorage self = new QueryFpCompareJobListResponseBodyFpCompareJobListFpCompareJobMatchFrameStorage();
            return TeaModel.build(map, self);
        }

        public QueryFpCompareJobListResponseBodyFpCompareJobListFpCompareJobMatchFrameStorage setMasterMediaFrames(QueryFpCompareJobListResponseBodyFpCompareJobListFpCompareJobMatchFrameStorageMasterMediaFrames masterMediaFrames) {
            this.masterMediaFrames = masterMediaFrames;
            return this;
        }
        public QueryFpCompareJobListResponseBodyFpCompareJobListFpCompareJobMatchFrameStorageMasterMediaFrames getMasterMediaFrames() {
            return this.masterMediaFrames;
        }

        public QueryFpCompareJobListResponseBodyFpCompareJobListFpCompareJobMatchFrameStorage setMatchedFramesDescFile(QueryFpCompareJobListResponseBodyFpCompareJobListFpCompareJobMatchFrameStorageMatchedFramesDescFile matchedFramesDescFile) {
            this.matchedFramesDescFile = matchedFramesDescFile;
            return this;
        }
        public QueryFpCompareJobListResponseBodyFpCompareJobListFpCompareJobMatchFrameStorageMatchedFramesDescFile getMatchedFramesDescFile() {
            return this.matchedFramesDescFile;
        }

        public QueryFpCompareJobListResponseBodyFpCompareJobListFpCompareJobMatchFrameStorage setQueryMediaFrames(QueryFpCompareJobListResponseBodyFpCompareJobListFpCompareJobMatchFrameStorageQueryMediaFrames queryMediaFrames) {
            this.queryMediaFrames = queryMediaFrames;
            return this;
        }
        public QueryFpCompareJobListResponseBodyFpCompareJobListFpCompareJobMatchFrameStorageQueryMediaFrames getQueryMediaFrames() {
            return this.queryMediaFrames;
        }

    }

    public static class QueryFpCompareJobListResponseBodyFpCompareJobListFpCompareJobQueryFile extends TeaModel {
        @NameInMap("Bucket")
        public String bucket;

        @NameInMap("Location")
        public String location;

        @NameInMap("Object")
        public String object;

        public static QueryFpCompareJobListResponseBodyFpCompareJobListFpCompareJobQueryFile build(java.util.Map<String, ?> map) throws Exception {
            QueryFpCompareJobListResponseBodyFpCompareJobListFpCompareJobQueryFile self = new QueryFpCompareJobListResponseBodyFpCompareJobListFpCompareJobQueryFile();
            return TeaModel.build(map, self);
        }

        public QueryFpCompareJobListResponseBodyFpCompareJobListFpCompareJobQueryFile setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

        public QueryFpCompareJobListResponseBodyFpCompareJobListFpCompareJobQueryFile setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public QueryFpCompareJobListResponseBodyFpCompareJobListFpCompareJobQueryFile setObject(String object) {
            this.object = object;
            return this;
        }
        public String getObject() {
            return this.object;
        }

    }

    public static class QueryFpCompareJobListResponseBodyFpCompareJobListFpCompareJob extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("FinishTime")
        public String finishTime;

        @NameInMap("FpCompareResult")
        public QueryFpCompareJobListResponseBodyFpCompareJobListFpCompareJobFpCompareResult fpCompareResult;

        @NameInMap("FpDBId")
        public String fpDBId;

        @NameInMap("Id")
        public String id;

        @NameInMap("MasterFile")
        public QueryFpCompareJobListResponseBodyFpCompareJobListFpCompareJobMasterFile masterFile;

        @NameInMap("MatchFrameStorage")
        public QueryFpCompareJobListResponseBodyFpCompareJobListFpCompareJobMatchFrameStorage matchFrameStorage;

        @NameInMap("Message")
        public String message;

        @NameInMap("PipelineId")
        public String pipelineId;

        @NameInMap("QueryFile")
        public QueryFpCompareJobListResponseBodyFpCompareJobListFpCompareJobQueryFile queryFile;

        @NameInMap("State")
        public String state;

        @NameInMap("UserData")
        public String userData;

        public static QueryFpCompareJobListResponseBodyFpCompareJobListFpCompareJob build(java.util.Map<String, ?> map) throws Exception {
            QueryFpCompareJobListResponseBodyFpCompareJobListFpCompareJob self = new QueryFpCompareJobListResponseBodyFpCompareJobListFpCompareJob();
            return TeaModel.build(map, self);
        }

        public QueryFpCompareJobListResponseBodyFpCompareJobListFpCompareJob setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryFpCompareJobListResponseBodyFpCompareJobListFpCompareJob setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public QueryFpCompareJobListResponseBodyFpCompareJobListFpCompareJob setFinishTime(String finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public String getFinishTime() {
            return this.finishTime;
        }

        public QueryFpCompareJobListResponseBodyFpCompareJobListFpCompareJob setFpCompareResult(QueryFpCompareJobListResponseBodyFpCompareJobListFpCompareJobFpCompareResult fpCompareResult) {
            this.fpCompareResult = fpCompareResult;
            return this;
        }
        public QueryFpCompareJobListResponseBodyFpCompareJobListFpCompareJobFpCompareResult getFpCompareResult() {
            return this.fpCompareResult;
        }

        public QueryFpCompareJobListResponseBodyFpCompareJobListFpCompareJob setFpDBId(String fpDBId) {
            this.fpDBId = fpDBId;
            return this;
        }
        public String getFpDBId() {
            return this.fpDBId;
        }

        public QueryFpCompareJobListResponseBodyFpCompareJobListFpCompareJob setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryFpCompareJobListResponseBodyFpCompareJobListFpCompareJob setMasterFile(QueryFpCompareJobListResponseBodyFpCompareJobListFpCompareJobMasterFile masterFile) {
            this.masterFile = masterFile;
            return this;
        }
        public QueryFpCompareJobListResponseBodyFpCompareJobListFpCompareJobMasterFile getMasterFile() {
            return this.masterFile;
        }

        public QueryFpCompareJobListResponseBodyFpCompareJobListFpCompareJob setMatchFrameStorage(QueryFpCompareJobListResponseBodyFpCompareJobListFpCompareJobMatchFrameStorage matchFrameStorage) {
            this.matchFrameStorage = matchFrameStorage;
            return this;
        }
        public QueryFpCompareJobListResponseBodyFpCompareJobListFpCompareJobMatchFrameStorage getMatchFrameStorage() {
            return this.matchFrameStorage;
        }

        public QueryFpCompareJobListResponseBodyFpCompareJobListFpCompareJob setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public QueryFpCompareJobListResponseBodyFpCompareJobListFpCompareJob setPipelineId(String pipelineId) {
            this.pipelineId = pipelineId;
            return this;
        }
        public String getPipelineId() {
            return this.pipelineId;
        }

        public QueryFpCompareJobListResponseBodyFpCompareJobListFpCompareJob setQueryFile(QueryFpCompareJobListResponseBodyFpCompareJobListFpCompareJobQueryFile queryFile) {
            this.queryFile = queryFile;
            return this;
        }
        public QueryFpCompareJobListResponseBodyFpCompareJobListFpCompareJobQueryFile getQueryFile() {
            return this.queryFile;
        }

        public QueryFpCompareJobListResponseBodyFpCompareJobListFpCompareJob setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public QueryFpCompareJobListResponseBodyFpCompareJobListFpCompareJob setUserData(String userData) {
            this.userData = userData;
            return this;
        }
        public String getUserData() {
            return this.userData;
        }

    }

    public static class QueryFpCompareJobListResponseBodyFpCompareJobList extends TeaModel {
        @NameInMap("FpCompareJob")
        public java.util.List<QueryFpCompareJobListResponseBodyFpCompareJobListFpCompareJob> fpCompareJob;

        public static QueryFpCompareJobListResponseBodyFpCompareJobList build(java.util.Map<String, ?> map) throws Exception {
            QueryFpCompareJobListResponseBodyFpCompareJobList self = new QueryFpCompareJobListResponseBodyFpCompareJobList();
            return TeaModel.build(map, self);
        }

        public QueryFpCompareJobListResponseBodyFpCompareJobList setFpCompareJob(java.util.List<QueryFpCompareJobListResponseBodyFpCompareJobListFpCompareJob> fpCompareJob) {
            this.fpCompareJob = fpCompareJob;
            return this;
        }
        public java.util.List<QueryFpCompareJobListResponseBodyFpCompareJobListFpCompareJob> getFpCompareJob() {
            return this.fpCompareJob;
        }

    }

    public static class QueryFpCompareJobListResponseBodyNonExistIds extends TeaModel {
        @NameInMap("String")
        public java.util.List<String> string;

        public static QueryFpCompareJobListResponseBodyNonExistIds build(java.util.Map<String, ?> map) throws Exception {
            QueryFpCompareJobListResponseBodyNonExistIds self = new QueryFpCompareJobListResponseBodyNonExistIds();
            return TeaModel.build(map, self);
        }

        public QueryFpCompareJobListResponseBodyNonExistIds setString(java.util.List<String> string) {
            this.string = string;
            return this;
        }
        public java.util.List<String> getString() {
            return this.string;
        }

    }

}
