// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class QueryVideoPoseJobListResponseBody extends TeaModel {
    @NameInMap("JobList")
    public QueryVideoPoseJobListResponseBodyJobList jobList;

    @NameInMap("NonExistJobIds")
    public QueryVideoPoseJobListResponseBodyNonExistJobIds nonExistJobIds;

    @NameInMap("RequestId")
    public String requestId;

    public static QueryVideoPoseJobListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryVideoPoseJobListResponseBody self = new QueryVideoPoseJobListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryVideoPoseJobListResponseBody setJobList(QueryVideoPoseJobListResponseBodyJobList jobList) {
        this.jobList = jobList;
        return this;
    }
    public QueryVideoPoseJobListResponseBodyJobList getJobList() {
        return this.jobList;
    }

    public QueryVideoPoseJobListResponseBody setNonExistJobIds(QueryVideoPoseJobListResponseBodyNonExistJobIds nonExistJobIds) {
        this.nonExistJobIds = nonExistJobIds;
        return this;
    }
    public QueryVideoPoseJobListResponseBodyNonExistJobIds getNonExistJobIds() {
        return this.nonExistJobIds;
    }

    public QueryVideoPoseJobListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class QueryVideoPoseJobListResponseBodyJobListJobInput extends TeaModel {
        @NameInMap("Bucket")
        public String bucket;

        @NameInMap("Location")
        public String location;

        @NameInMap("Object")
        public String object;

        @NameInMap("RoleArn")
        public String roleArn;

        public static QueryVideoPoseJobListResponseBodyJobListJobInput build(java.util.Map<String, ?> map) throws Exception {
            QueryVideoPoseJobListResponseBodyJobListJobInput self = new QueryVideoPoseJobListResponseBodyJobListJobInput();
            return TeaModel.build(map, self);
        }

        public QueryVideoPoseJobListResponseBodyJobListJobInput setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

        public QueryVideoPoseJobListResponseBodyJobListJobInput setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public QueryVideoPoseJobListResponseBodyJobListJobInput setObject(String object) {
            this.object = object;
            return this;
        }
        public String getObject() {
            return this.object;
        }

        public QueryVideoPoseJobListResponseBodyJobListJobInput setRoleArn(String roleArn) {
            this.roleArn = roleArn;
            return this;
        }
        public String getRoleArn() {
            return this.roleArn;
        }

    }

    public static class QueryVideoPoseJobListResponseBodyJobListJobMNSMessageResult extends TeaModel {
        @NameInMap("ErrorCode")
        public String errorCode;

        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("MessageId")
        public String messageId;

        public static QueryVideoPoseJobListResponseBodyJobListJobMNSMessageResult build(java.util.Map<String, ?> map) throws Exception {
            QueryVideoPoseJobListResponseBodyJobListJobMNSMessageResult self = new QueryVideoPoseJobListResponseBodyJobListJobMNSMessageResult();
            return TeaModel.build(map, self);
        }

        public QueryVideoPoseJobListResponseBodyJobListJobMNSMessageResult setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public QueryVideoPoseJobListResponseBodyJobListJobMNSMessageResult setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public QueryVideoPoseJobListResponseBodyJobListJobMNSMessageResult setMessageId(String messageId) {
            this.messageId = messageId;
            return this;
        }
        public String getMessageId() {
            return this.messageId;
        }

    }

    public static class QueryVideoPoseJobListResponseBodyJobListJobOutputConfigDataFile extends TeaModel {
        @NameInMap("Bucket")
        public String bucket;

        @NameInMap("Location")
        public String location;

        @NameInMap("Object")
        public String object;

        @NameInMap("RoleArn")
        public String roleArn;

        public static QueryVideoPoseJobListResponseBodyJobListJobOutputConfigDataFile build(java.util.Map<String, ?> map) throws Exception {
            QueryVideoPoseJobListResponseBodyJobListJobOutputConfigDataFile self = new QueryVideoPoseJobListResponseBodyJobListJobOutputConfigDataFile();
            return TeaModel.build(map, self);
        }

        public QueryVideoPoseJobListResponseBodyJobListJobOutputConfigDataFile setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

        public QueryVideoPoseJobListResponseBodyJobListJobOutputConfigDataFile setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public QueryVideoPoseJobListResponseBodyJobListJobOutputConfigDataFile setObject(String object) {
            this.object = object;
            return this;
        }
        public String getObject() {
            return this.object;
        }

        public QueryVideoPoseJobListResponseBodyJobListJobOutputConfigDataFile setRoleArn(String roleArn) {
            this.roleArn = roleArn;
            return this;
        }
        public String getRoleArn() {
            return this.roleArn;
        }

    }

    public static class QueryVideoPoseJobListResponseBodyJobListJobOutputConfigVideoFile extends TeaModel {
        @NameInMap("Bucket")
        public String bucket;

        @NameInMap("Location")
        public String location;

        @NameInMap("Object")
        public String object;

        @NameInMap("RoleArn")
        public String roleArn;

        public static QueryVideoPoseJobListResponseBodyJobListJobOutputConfigVideoFile build(java.util.Map<String, ?> map) throws Exception {
            QueryVideoPoseJobListResponseBodyJobListJobOutputConfigVideoFile self = new QueryVideoPoseJobListResponseBodyJobListJobOutputConfigVideoFile();
            return TeaModel.build(map, self);
        }

        public QueryVideoPoseJobListResponseBodyJobListJobOutputConfigVideoFile setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

        public QueryVideoPoseJobListResponseBodyJobListJobOutputConfigVideoFile setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public QueryVideoPoseJobListResponseBodyJobListJobOutputConfigVideoFile setObject(String object) {
            this.object = object;
            return this;
        }
        public String getObject() {
            return this.object;
        }

        public QueryVideoPoseJobListResponseBodyJobListJobOutputConfigVideoFile setRoleArn(String roleArn) {
            this.roleArn = roleArn;
            return this;
        }
        public String getRoleArn() {
            return this.roleArn;
        }

    }

    public static class QueryVideoPoseJobListResponseBodyJobListJobOutputConfig extends TeaModel {
        @NameInMap("DataFile")
        public QueryVideoPoseJobListResponseBodyJobListJobOutputConfigDataFile dataFile;

        @NameInMap("VideoFile")
        public QueryVideoPoseJobListResponseBodyJobListJobOutputConfigVideoFile videoFile;

        public static QueryVideoPoseJobListResponseBodyJobListJobOutputConfig build(java.util.Map<String, ?> map) throws Exception {
            QueryVideoPoseJobListResponseBodyJobListJobOutputConfig self = new QueryVideoPoseJobListResponseBodyJobListJobOutputConfig();
            return TeaModel.build(map, self);
        }

        public QueryVideoPoseJobListResponseBodyJobListJobOutputConfig setDataFile(QueryVideoPoseJobListResponseBodyJobListJobOutputConfigDataFile dataFile) {
            this.dataFile = dataFile;
            return this;
        }
        public QueryVideoPoseJobListResponseBodyJobListJobOutputConfigDataFile getDataFile() {
            return this.dataFile;
        }

        public QueryVideoPoseJobListResponseBodyJobListJobOutputConfig setVideoFile(QueryVideoPoseJobListResponseBodyJobListJobOutputConfigVideoFile videoFile) {
            this.videoFile = videoFile;
            return this;
        }
        public QueryVideoPoseJobListResponseBodyJobListJobOutputConfigVideoFile getVideoFile() {
            return this.videoFile;
        }

    }

    public static class QueryVideoPoseJobListResponseBodyJobListJobPropertiesFormat extends TeaModel {
        @NameInMap("Bitrate")
        public String bitrate;

        @NameInMap("Duration")
        public String duration;

        @NameInMap("FormatLongName")
        public String formatLongName;

        @NameInMap("FormatName")
        public String formatName;

        @NameInMap("NumPrograms")
        public String numPrograms;

        @NameInMap("NumStreams")
        public String numStreams;

        @NameInMap("Size")
        public String size;

        @NameInMap("StartTime")
        public String startTime;

        public static QueryVideoPoseJobListResponseBodyJobListJobPropertiesFormat build(java.util.Map<String, ?> map) throws Exception {
            QueryVideoPoseJobListResponseBodyJobListJobPropertiesFormat self = new QueryVideoPoseJobListResponseBodyJobListJobPropertiesFormat();
            return TeaModel.build(map, self);
        }

        public QueryVideoPoseJobListResponseBodyJobListJobPropertiesFormat setBitrate(String bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public String getBitrate() {
            return this.bitrate;
        }

        public QueryVideoPoseJobListResponseBodyJobListJobPropertiesFormat setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public QueryVideoPoseJobListResponseBodyJobListJobPropertiesFormat setFormatLongName(String formatLongName) {
            this.formatLongName = formatLongName;
            return this;
        }
        public String getFormatLongName() {
            return this.formatLongName;
        }

        public QueryVideoPoseJobListResponseBodyJobListJobPropertiesFormat setFormatName(String formatName) {
            this.formatName = formatName;
            return this;
        }
        public String getFormatName() {
            return this.formatName;
        }

        public QueryVideoPoseJobListResponseBodyJobListJobPropertiesFormat setNumPrograms(String numPrograms) {
            this.numPrograms = numPrograms;
            return this;
        }
        public String getNumPrograms() {
            return this.numPrograms;
        }

        public QueryVideoPoseJobListResponseBodyJobListJobPropertiesFormat setNumStreams(String numStreams) {
            this.numStreams = numStreams;
            return this;
        }
        public String getNumStreams() {
            return this.numStreams;
        }

        public QueryVideoPoseJobListResponseBodyJobListJobPropertiesFormat setSize(String size) {
            this.size = size;
            return this;
        }
        public String getSize() {
            return this.size;
        }

        public QueryVideoPoseJobListResponseBodyJobListJobPropertiesFormat setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

    public static class QueryVideoPoseJobListResponseBodyJobListJobPropertiesStreamsAudioStreamListAudioStream extends TeaModel {
        @NameInMap("Bitrate")
        public String bitrate;

        @NameInMap("ChannelLayout")
        public String channelLayout;

        @NameInMap("Channels")
        public String channels;

        @NameInMap("CodecLongName")
        public String codecLongName;

        @NameInMap("CodecName")
        public String codecName;

        @NameInMap("CodecTag")
        public String codecTag;

        @NameInMap("CodecTagString")
        public String codecTagString;

        @NameInMap("CodecTimeBase")
        public String codecTimeBase;

        @NameInMap("Duration")
        public String duration;

        @NameInMap("Index")
        public String index;

        @NameInMap("Lang")
        public String lang;

        @NameInMap("NumFrames")
        public String numFrames;

        @NameInMap("SampleFmt")
        public String sampleFmt;

        @NameInMap("Samplerate")
        public String samplerate;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("Timebase")
        public String timebase;

        public static QueryVideoPoseJobListResponseBodyJobListJobPropertiesStreamsAudioStreamListAudioStream build(java.util.Map<String, ?> map) throws Exception {
            QueryVideoPoseJobListResponseBodyJobListJobPropertiesStreamsAudioStreamListAudioStream self = new QueryVideoPoseJobListResponseBodyJobListJobPropertiesStreamsAudioStreamListAudioStream();
            return TeaModel.build(map, self);
        }

        public QueryVideoPoseJobListResponseBodyJobListJobPropertiesStreamsAudioStreamListAudioStream setBitrate(String bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public String getBitrate() {
            return this.bitrate;
        }

        public QueryVideoPoseJobListResponseBodyJobListJobPropertiesStreamsAudioStreamListAudioStream setChannelLayout(String channelLayout) {
            this.channelLayout = channelLayout;
            return this;
        }
        public String getChannelLayout() {
            return this.channelLayout;
        }

        public QueryVideoPoseJobListResponseBodyJobListJobPropertiesStreamsAudioStreamListAudioStream setChannels(String channels) {
            this.channels = channels;
            return this;
        }
        public String getChannels() {
            return this.channels;
        }

        public QueryVideoPoseJobListResponseBodyJobListJobPropertiesStreamsAudioStreamListAudioStream setCodecLongName(String codecLongName) {
            this.codecLongName = codecLongName;
            return this;
        }
        public String getCodecLongName() {
            return this.codecLongName;
        }

        public QueryVideoPoseJobListResponseBodyJobListJobPropertiesStreamsAudioStreamListAudioStream setCodecName(String codecName) {
            this.codecName = codecName;
            return this;
        }
        public String getCodecName() {
            return this.codecName;
        }

        public QueryVideoPoseJobListResponseBodyJobListJobPropertiesStreamsAudioStreamListAudioStream setCodecTag(String codecTag) {
            this.codecTag = codecTag;
            return this;
        }
        public String getCodecTag() {
            return this.codecTag;
        }

        public QueryVideoPoseJobListResponseBodyJobListJobPropertiesStreamsAudioStreamListAudioStream setCodecTagString(String codecTagString) {
            this.codecTagString = codecTagString;
            return this;
        }
        public String getCodecTagString() {
            return this.codecTagString;
        }

        public QueryVideoPoseJobListResponseBodyJobListJobPropertiesStreamsAudioStreamListAudioStream setCodecTimeBase(String codecTimeBase) {
            this.codecTimeBase = codecTimeBase;
            return this;
        }
        public String getCodecTimeBase() {
            return this.codecTimeBase;
        }

        public QueryVideoPoseJobListResponseBodyJobListJobPropertiesStreamsAudioStreamListAudioStream setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public QueryVideoPoseJobListResponseBodyJobListJobPropertiesStreamsAudioStreamListAudioStream setIndex(String index) {
            this.index = index;
            return this;
        }
        public String getIndex() {
            return this.index;
        }

        public QueryVideoPoseJobListResponseBodyJobListJobPropertiesStreamsAudioStreamListAudioStream setLang(String lang) {
            this.lang = lang;
            return this;
        }
        public String getLang() {
            return this.lang;
        }

        public QueryVideoPoseJobListResponseBodyJobListJobPropertiesStreamsAudioStreamListAudioStream setNumFrames(String numFrames) {
            this.numFrames = numFrames;
            return this;
        }
        public String getNumFrames() {
            return this.numFrames;
        }

        public QueryVideoPoseJobListResponseBodyJobListJobPropertiesStreamsAudioStreamListAudioStream setSampleFmt(String sampleFmt) {
            this.sampleFmt = sampleFmt;
            return this;
        }
        public String getSampleFmt() {
            return this.sampleFmt;
        }

        public QueryVideoPoseJobListResponseBodyJobListJobPropertiesStreamsAudioStreamListAudioStream setSamplerate(String samplerate) {
            this.samplerate = samplerate;
            return this;
        }
        public String getSamplerate() {
            return this.samplerate;
        }

        public QueryVideoPoseJobListResponseBodyJobListJobPropertiesStreamsAudioStreamListAudioStream setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public QueryVideoPoseJobListResponseBodyJobListJobPropertiesStreamsAudioStreamListAudioStream setTimebase(String timebase) {
            this.timebase = timebase;
            return this;
        }
        public String getTimebase() {
            return this.timebase;
        }

    }

    public static class QueryVideoPoseJobListResponseBodyJobListJobPropertiesStreamsAudioStreamList extends TeaModel {
        @NameInMap("AudioStream")
        public java.util.List<QueryVideoPoseJobListResponseBodyJobListJobPropertiesStreamsAudioStreamListAudioStream> audioStream;

        public static QueryVideoPoseJobListResponseBodyJobListJobPropertiesStreamsAudioStreamList build(java.util.Map<String, ?> map) throws Exception {
            QueryVideoPoseJobListResponseBodyJobListJobPropertiesStreamsAudioStreamList self = new QueryVideoPoseJobListResponseBodyJobListJobPropertiesStreamsAudioStreamList();
            return TeaModel.build(map, self);
        }

        public QueryVideoPoseJobListResponseBodyJobListJobPropertiesStreamsAudioStreamList setAudioStream(java.util.List<QueryVideoPoseJobListResponseBodyJobListJobPropertiesStreamsAudioStreamListAudioStream> audioStream) {
            this.audioStream = audioStream;
            return this;
        }
        public java.util.List<QueryVideoPoseJobListResponseBodyJobListJobPropertiesStreamsAudioStreamListAudioStream> getAudioStream() {
            return this.audioStream;
        }

    }

    public static class QueryVideoPoseJobListResponseBodyJobListJobPropertiesStreamsSubtitleStreamListSubtitleStream extends TeaModel {
        @NameInMap("CodecLongName")
        public String codecLongName;

        @NameInMap("CodecName")
        public String codecName;

        @NameInMap("CodecTag")
        public String codecTag;

        @NameInMap("CodecTagString")
        public String codecTagString;

        @NameInMap("CodecTimeBase")
        public String codecTimeBase;

        @NameInMap("Duration")
        public String duration;

        @NameInMap("Index")
        public String index;

        @NameInMap("Lang")
        public String lang;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("Timebase")
        public String timebase;

        public static QueryVideoPoseJobListResponseBodyJobListJobPropertiesStreamsSubtitleStreamListSubtitleStream build(java.util.Map<String, ?> map) throws Exception {
            QueryVideoPoseJobListResponseBodyJobListJobPropertiesStreamsSubtitleStreamListSubtitleStream self = new QueryVideoPoseJobListResponseBodyJobListJobPropertiesStreamsSubtitleStreamListSubtitleStream();
            return TeaModel.build(map, self);
        }

        public QueryVideoPoseJobListResponseBodyJobListJobPropertiesStreamsSubtitleStreamListSubtitleStream setCodecLongName(String codecLongName) {
            this.codecLongName = codecLongName;
            return this;
        }
        public String getCodecLongName() {
            return this.codecLongName;
        }

        public QueryVideoPoseJobListResponseBodyJobListJobPropertiesStreamsSubtitleStreamListSubtitleStream setCodecName(String codecName) {
            this.codecName = codecName;
            return this;
        }
        public String getCodecName() {
            return this.codecName;
        }

        public QueryVideoPoseJobListResponseBodyJobListJobPropertiesStreamsSubtitleStreamListSubtitleStream setCodecTag(String codecTag) {
            this.codecTag = codecTag;
            return this;
        }
        public String getCodecTag() {
            return this.codecTag;
        }

        public QueryVideoPoseJobListResponseBodyJobListJobPropertiesStreamsSubtitleStreamListSubtitleStream setCodecTagString(String codecTagString) {
            this.codecTagString = codecTagString;
            return this;
        }
        public String getCodecTagString() {
            return this.codecTagString;
        }

        public QueryVideoPoseJobListResponseBodyJobListJobPropertiesStreamsSubtitleStreamListSubtitleStream setCodecTimeBase(String codecTimeBase) {
            this.codecTimeBase = codecTimeBase;
            return this;
        }
        public String getCodecTimeBase() {
            return this.codecTimeBase;
        }

        public QueryVideoPoseJobListResponseBodyJobListJobPropertiesStreamsSubtitleStreamListSubtitleStream setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public QueryVideoPoseJobListResponseBodyJobListJobPropertiesStreamsSubtitleStreamListSubtitleStream setIndex(String index) {
            this.index = index;
            return this;
        }
        public String getIndex() {
            return this.index;
        }

        public QueryVideoPoseJobListResponseBodyJobListJobPropertiesStreamsSubtitleStreamListSubtitleStream setLang(String lang) {
            this.lang = lang;
            return this;
        }
        public String getLang() {
            return this.lang;
        }

        public QueryVideoPoseJobListResponseBodyJobListJobPropertiesStreamsSubtitleStreamListSubtitleStream setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public QueryVideoPoseJobListResponseBodyJobListJobPropertiesStreamsSubtitleStreamListSubtitleStream setTimebase(String timebase) {
            this.timebase = timebase;
            return this;
        }
        public String getTimebase() {
            return this.timebase;
        }

    }

    public static class QueryVideoPoseJobListResponseBodyJobListJobPropertiesStreamsSubtitleStreamList extends TeaModel {
        @NameInMap("SubtitleStream")
        public java.util.List<QueryVideoPoseJobListResponseBodyJobListJobPropertiesStreamsSubtitleStreamListSubtitleStream> subtitleStream;

        public static QueryVideoPoseJobListResponseBodyJobListJobPropertiesStreamsSubtitleStreamList build(java.util.Map<String, ?> map) throws Exception {
            QueryVideoPoseJobListResponseBodyJobListJobPropertiesStreamsSubtitleStreamList self = new QueryVideoPoseJobListResponseBodyJobListJobPropertiesStreamsSubtitleStreamList();
            return TeaModel.build(map, self);
        }

        public QueryVideoPoseJobListResponseBodyJobListJobPropertiesStreamsSubtitleStreamList setSubtitleStream(java.util.List<QueryVideoPoseJobListResponseBodyJobListJobPropertiesStreamsSubtitleStreamListSubtitleStream> subtitleStream) {
            this.subtitleStream = subtitleStream;
            return this;
        }
        public java.util.List<QueryVideoPoseJobListResponseBodyJobListJobPropertiesStreamsSubtitleStreamListSubtitleStream> getSubtitleStream() {
            return this.subtitleStream;
        }

    }

    public static class QueryVideoPoseJobListResponseBodyJobListJobPropertiesStreamsVideoStreamListVideoStreamNetworkCost extends TeaModel {
        @NameInMap("AvgBitrate")
        public String avgBitrate;

        @NameInMap("CostBandwidth")
        public String costBandwidth;

        @NameInMap("PreloadTime")
        public String preloadTime;

        public static QueryVideoPoseJobListResponseBodyJobListJobPropertiesStreamsVideoStreamListVideoStreamNetworkCost build(java.util.Map<String, ?> map) throws Exception {
            QueryVideoPoseJobListResponseBodyJobListJobPropertiesStreamsVideoStreamListVideoStreamNetworkCost self = new QueryVideoPoseJobListResponseBodyJobListJobPropertiesStreamsVideoStreamListVideoStreamNetworkCost();
            return TeaModel.build(map, self);
        }

        public QueryVideoPoseJobListResponseBodyJobListJobPropertiesStreamsVideoStreamListVideoStreamNetworkCost setAvgBitrate(String avgBitrate) {
            this.avgBitrate = avgBitrate;
            return this;
        }
        public String getAvgBitrate() {
            return this.avgBitrate;
        }

        public QueryVideoPoseJobListResponseBodyJobListJobPropertiesStreamsVideoStreamListVideoStreamNetworkCost setCostBandwidth(String costBandwidth) {
            this.costBandwidth = costBandwidth;
            return this;
        }
        public String getCostBandwidth() {
            return this.costBandwidth;
        }

        public QueryVideoPoseJobListResponseBodyJobListJobPropertiesStreamsVideoStreamListVideoStreamNetworkCost setPreloadTime(String preloadTime) {
            this.preloadTime = preloadTime;
            return this;
        }
        public String getPreloadTime() {
            return this.preloadTime;
        }

    }

    public static class QueryVideoPoseJobListResponseBodyJobListJobPropertiesStreamsVideoStreamListVideoStream extends TeaModel {
        @NameInMap("AvgFPS")
        public String avgFPS;

        @NameInMap("Bitrate")
        public String bitrate;

        @NameInMap("CodecLongName")
        public String codecLongName;

        @NameInMap("CodecName")
        public String codecName;

        @NameInMap("CodecTag")
        public String codecTag;

        @NameInMap("CodecTagString")
        public String codecTagString;

        @NameInMap("CodecTimeBase")
        public String codecTimeBase;

        @NameInMap("Dar")
        public String dar;

        @NameInMap("Duration")
        public String duration;

        @NameInMap("Fps")
        public String fps;

        @NameInMap("HasBFrames")
        public String hasBFrames;

        @NameInMap("Height")
        public String height;

        @NameInMap("Index")
        public String index;

        @NameInMap("Lang")
        public String lang;

        @NameInMap("Level")
        public String level;

        @NameInMap("NetworkCost")
        public QueryVideoPoseJobListResponseBodyJobListJobPropertiesStreamsVideoStreamListVideoStreamNetworkCost networkCost;

        @NameInMap("NumFrames")
        public String numFrames;

        @NameInMap("PixFmt")
        public String pixFmt;

        @NameInMap("Profile")
        public String profile;

        @NameInMap("Rotate")
        public String rotate;

        @NameInMap("Sar")
        public String sar;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("Timebase")
        public String timebase;

        @NameInMap("Width")
        public String width;

        public static QueryVideoPoseJobListResponseBodyJobListJobPropertiesStreamsVideoStreamListVideoStream build(java.util.Map<String, ?> map) throws Exception {
            QueryVideoPoseJobListResponseBodyJobListJobPropertiesStreamsVideoStreamListVideoStream self = new QueryVideoPoseJobListResponseBodyJobListJobPropertiesStreamsVideoStreamListVideoStream();
            return TeaModel.build(map, self);
        }

        public QueryVideoPoseJobListResponseBodyJobListJobPropertiesStreamsVideoStreamListVideoStream setAvgFPS(String avgFPS) {
            this.avgFPS = avgFPS;
            return this;
        }
        public String getAvgFPS() {
            return this.avgFPS;
        }

        public QueryVideoPoseJobListResponseBodyJobListJobPropertiesStreamsVideoStreamListVideoStream setBitrate(String bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public String getBitrate() {
            return this.bitrate;
        }

        public QueryVideoPoseJobListResponseBodyJobListJobPropertiesStreamsVideoStreamListVideoStream setCodecLongName(String codecLongName) {
            this.codecLongName = codecLongName;
            return this;
        }
        public String getCodecLongName() {
            return this.codecLongName;
        }

        public QueryVideoPoseJobListResponseBodyJobListJobPropertiesStreamsVideoStreamListVideoStream setCodecName(String codecName) {
            this.codecName = codecName;
            return this;
        }
        public String getCodecName() {
            return this.codecName;
        }

        public QueryVideoPoseJobListResponseBodyJobListJobPropertiesStreamsVideoStreamListVideoStream setCodecTag(String codecTag) {
            this.codecTag = codecTag;
            return this;
        }
        public String getCodecTag() {
            return this.codecTag;
        }

        public QueryVideoPoseJobListResponseBodyJobListJobPropertiesStreamsVideoStreamListVideoStream setCodecTagString(String codecTagString) {
            this.codecTagString = codecTagString;
            return this;
        }
        public String getCodecTagString() {
            return this.codecTagString;
        }

        public QueryVideoPoseJobListResponseBodyJobListJobPropertiesStreamsVideoStreamListVideoStream setCodecTimeBase(String codecTimeBase) {
            this.codecTimeBase = codecTimeBase;
            return this;
        }
        public String getCodecTimeBase() {
            return this.codecTimeBase;
        }

        public QueryVideoPoseJobListResponseBodyJobListJobPropertiesStreamsVideoStreamListVideoStream setDar(String dar) {
            this.dar = dar;
            return this;
        }
        public String getDar() {
            return this.dar;
        }

        public QueryVideoPoseJobListResponseBodyJobListJobPropertiesStreamsVideoStreamListVideoStream setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public QueryVideoPoseJobListResponseBodyJobListJobPropertiesStreamsVideoStreamListVideoStream setFps(String fps) {
            this.fps = fps;
            return this;
        }
        public String getFps() {
            return this.fps;
        }

        public QueryVideoPoseJobListResponseBodyJobListJobPropertiesStreamsVideoStreamListVideoStream setHasBFrames(String hasBFrames) {
            this.hasBFrames = hasBFrames;
            return this;
        }
        public String getHasBFrames() {
            return this.hasBFrames;
        }

        public QueryVideoPoseJobListResponseBodyJobListJobPropertiesStreamsVideoStreamListVideoStream setHeight(String height) {
            this.height = height;
            return this;
        }
        public String getHeight() {
            return this.height;
        }

        public QueryVideoPoseJobListResponseBodyJobListJobPropertiesStreamsVideoStreamListVideoStream setIndex(String index) {
            this.index = index;
            return this;
        }
        public String getIndex() {
            return this.index;
        }

        public QueryVideoPoseJobListResponseBodyJobListJobPropertiesStreamsVideoStreamListVideoStream setLang(String lang) {
            this.lang = lang;
            return this;
        }
        public String getLang() {
            return this.lang;
        }

        public QueryVideoPoseJobListResponseBodyJobListJobPropertiesStreamsVideoStreamListVideoStream setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public QueryVideoPoseJobListResponseBodyJobListJobPropertiesStreamsVideoStreamListVideoStream setNetworkCost(QueryVideoPoseJobListResponseBodyJobListJobPropertiesStreamsVideoStreamListVideoStreamNetworkCost networkCost) {
            this.networkCost = networkCost;
            return this;
        }
        public QueryVideoPoseJobListResponseBodyJobListJobPropertiesStreamsVideoStreamListVideoStreamNetworkCost getNetworkCost() {
            return this.networkCost;
        }

        public QueryVideoPoseJobListResponseBodyJobListJobPropertiesStreamsVideoStreamListVideoStream setNumFrames(String numFrames) {
            this.numFrames = numFrames;
            return this;
        }
        public String getNumFrames() {
            return this.numFrames;
        }

        public QueryVideoPoseJobListResponseBodyJobListJobPropertiesStreamsVideoStreamListVideoStream setPixFmt(String pixFmt) {
            this.pixFmt = pixFmt;
            return this;
        }
        public String getPixFmt() {
            return this.pixFmt;
        }

        public QueryVideoPoseJobListResponseBodyJobListJobPropertiesStreamsVideoStreamListVideoStream setProfile(String profile) {
            this.profile = profile;
            return this;
        }
        public String getProfile() {
            return this.profile;
        }

        public QueryVideoPoseJobListResponseBodyJobListJobPropertiesStreamsVideoStreamListVideoStream setRotate(String rotate) {
            this.rotate = rotate;
            return this;
        }
        public String getRotate() {
            return this.rotate;
        }

        public QueryVideoPoseJobListResponseBodyJobListJobPropertiesStreamsVideoStreamListVideoStream setSar(String sar) {
            this.sar = sar;
            return this;
        }
        public String getSar() {
            return this.sar;
        }

        public QueryVideoPoseJobListResponseBodyJobListJobPropertiesStreamsVideoStreamListVideoStream setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public QueryVideoPoseJobListResponseBodyJobListJobPropertiesStreamsVideoStreamListVideoStream setTimebase(String timebase) {
            this.timebase = timebase;
            return this;
        }
        public String getTimebase() {
            return this.timebase;
        }

        public QueryVideoPoseJobListResponseBodyJobListJobPropertiesStreamsVideoStreamListVideoStream setWidth(String width) {
            this.width = width;
            return this;
        }
        public String getWidth() {
            return this.width;
        }

    }

    public static class QueryVideoPoseJobListResponseBodyJobListJobPropertiesStreamsVideoStreamList extends TeaModel {
        @NameInMap("VideoStream")
        public java.util.List<QueryVideoPoseJobListResponseBodyJobListJobPropertiesStreamsVideoStreamListVideoStream> videoStream;

        public static QueryVideoPoseJobListResponseBodyJobListJobPropertiesStreamsVideoStreamList build(java.util.Map<String, ?> map) throws Exception {
            QueryVideoPoseJobListResponseBodyJobListJobPropertiesStreamsVideoStreamList self = new QueryVideoPoseJobListResponseBodyJobListJobPropertiesStreamsVideoStreamList();
            return TeaModel.build(map, self);
        }

        public QueryVideoPoseJobListResponseBodyJobListJobPropertiesStreamsVideoStreamList setVideoStream(java.util.List<QueryVideoPoseJobListResponseBodyJobListJobPropertiesStreamsVideoStreamListVideoStream> videoStream) {
            this.videoStream = videoStream;
            return this;
        }
        public java.util.List<QueryVideoPoseJobListResponseBodyJobListJobPropertiesStreamsVideoStreamListVideoStream> getVideoStream() {
            return this.videoStream;
        }

    }

    public static class QueryVideoPoseJobListResponseBodyJobListJobPropertiesStreams extends TeaModel {
        @NameInMap("AudioStreamList")
        public QueryVideoPoseJobListResponseBodyJobListJobPropertiesStreamsAudioStreamList audioStreamList;

        @NameInMap("SubtitleStreamList")
        public QueryVideoPoseJobListResponseBodyJobListJobPropertiesStreamsSubtitleStreamList subtitleStreamList;

        @NameInMap("VideoStreamList")
        public QueryVideoPoseJobListResponseBodyJobListJobPropertiesStreamsVideoStreamList videoStreamList;

        public static QueryVideoPoseJobListResponseBodyJobListJobPropertiesStreams build(java.util.Map<String, ?> map) throws Exception {
            QueryVideoPoseJobListResponseBodyJobListJobPropertiesStreams self = new QueryVideoPoseJobListResponseBodyJobListJobPropertiesStreams();
            return TeaModel.build(map, self);
        }

        public QueryVideoPoseJobListResponseBodyJobListJobPropertiesStreams setAudioStreamList(QueryVideoPoseJobListResponseBodyJobListJobPropertiesStreamsAudioStreamList audioStreamList) {
            this.audioStreamList = audioStreamList;
            return this;
        }
        public QueryVideoPoseJobListResponseBodyJobListJobPropertiesStreamsAudioStreamList getAudioStreamList() {
            return this.audioStreamList;
        }

        public QueryVideoPoseJobListResponseBodyJobListJobPropertiesStreams setSubtitleStreamList(QueryVideoPoseJobListResponseBodyJobListJobPropertiesStreamsSubtitleStreamList subtitleStreamList) {
            this.subtitleStreamList = subtitleStreamList;
            return this;
        }
        public QueryVideoPoseJobListResponseBodyJobListJobPropertiesStreamsSubtitleStreamList getSubtitleStreamList() {
            return this.subtitleStreamList;
        }

        public QueryVideoPoseJobListResponseBodyJobListJobPropertiesStreams setVideoStreamList(QueryVideoPoseJobListResponseBodyJobListJobPropertiesStreamsVideoStreamList videoStreamList) {
            this.videoStreamList = videoStreamList;
            return this;
        }
        public QueryVideoPoseJobListResponseBodyJobListJobPropertiesStreamsVideoStreamList getVideoStreamList() {
            return this.videoStreamList;
        }

    }

    public static class QueryVideoPoseJobListResponseBodyJobListJobProperties extends TeaModel {
        @NameInMap("Bitrate")
        public String bitrate;

        @NameInMap("Duration")
        public String duration;

        @NameInMap("FileFormat")
        public String fileFormat;

        @NameInMap("FileSize")
        public String fileSize;

        @NameInMap("Format")
        public QueryVideoPoseJobListResponseBodyJobListJobPropertiesFormat format;

        @NameInMap("Fps")
        public String fps;

        @NameInMap("Height")
        public String height;

        @NameInMap("Streams")
        public QueryVideoPoseJobListResponseBodyJobListJobPropertiesStreams streams;

        @NameInMap("Width")
        public String width;

        public static QueryVideoPoseJobListResponseBodyJobListJobProperties build(java.util.Map<String, ?> map) throws Exception {
            QueryVideoPoseJobListResponseBodyJobListJobProperties self = new QueryVideoPoseJobListResponseBodyJobListJobProperties();
            return TeaModel.build(map, self);
        }

        public QueryVideoPoseJobListResponseBodyJobListJobProperties setBitrate(String bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public String getBitrate() {
            return this.bitrate;
        }

        public QueryVideoPoseJobListResponseBodyJobListJobProperties setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public QueryVideoPoseJobListResponseBodyJobListJobProperties setFileFormat(String fileFormat) {
            this.fileFormat = fileFormat;
            return this;
        }
        public String getFileFormat() {
            return this.fileFormat;
        }

        public QueryVideoPoseJobListResponseBodyJobListJobProperties setFileSize(String fileSize) {
            this.fileSize = fileSize;
            return this;
        }
        public String getFileSize() {
            return this.fileSize;
        }

        public QueryVideoPoseJobListResponseBodyJobListJobProperties setFormat(QueryVideoPoseJobListResponseBodyJobListJobPropertiesFormat format) {
            this.format = format;
            return this;
        }
        public QueryVideoPoseJobListResponseBodyJobListJobPropertiesFormat getFormat() {
            return this.format;
        }

        public QueryVideoPoseJobListResponseBodyJobListJobProperties setFps(String fps) {
            this.fps = fps;
            return this;
        }
        public String getFps() {
            return this.fps;
        }

        public QueryVideoPoseJobListResponseBodyJobListJobProperties setHeight(String height) {
            this.height = height;
            return this;
        }
        public String getHeight() {
            return this.height;
        }

        public QueryVideoPoseJobListResponseBodyJobListJobProperties setStreams(QueryVideoPoseJobListResponseBodyJobListJobPropertiesStreams streams) {
            this.streams = streams;
            return this;
        }
        public QueryVideoPoseJobListResponseBodyJobListJobPropertiesStreams getStreams() {
            return this.streams;
        }

        public QueryVideoPoseJobListResponseBodyJobListJobProperties setWidth(String width) {
            this.width = width;
            return this;
        }
        public String getWidth() {
            return this.width;
        }

    }

    public static class QueryVideoPoseJobListResponseBodyJobListJob extends TeaModel {
        @NameInMap("Input")
        public QueryVideoPoseJobListResponseBodyJobListJobInput input;

        @NameInMap("JobId")
        public String jobId;

        @NameInMap("MNSMessageResult")
        public QueryVideoPoseJobListResponseBodyJobListJobMNSMessageResult MNSMessageResult;

        @NameInMap("OutputConfig")
        public QueryVideoPoseJobListResponseBodyJobListJobOutputConfig outputConfig;

        @NameInMap("PipelineId")
        public String pipelineId;

        @NameInMap("Properties")
        public QueryVideoPoseJobListResponseBodyJobListJobProperties properties;

        @NameInMap("State")
        public String state;

        @NameInMap("UserData")
        public String userData;

        public static QueryVideoPoseJobListResponseBodyJobListJob build(java.util.Map<String, ?> map) throws Exception {
            QueryVideoPoseJobListResponseBodyJobListJob self = new QueryVideoPoseJobListResponseBodyJobListJob();
            return TeaModel.build(map, self);
        }

        public QueryVideoPoseJobListResponseBodyJobListJob setInput(QueryVideoPoseJobListResponseBodyJobListJobInput input) {
            this.input = input;
            return this;
        }
        public QueryVideoPoseJobListResponseBodyJobListJobInput getInput() {
            return this.input;
        }

        public QueryVideoPoseJobListResponseBodyJobListJob setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public QueryVideoPoseJobListResponseBodyJobListJob setMNSMessageResult(QueryVideoPoseJobListResponseBodyJobListJobMNSMessageResult MNSMessageResult) {
            this.MNSMessageResult = MNSMessageResult;
            return this;
        }
        public QueryVideoPoseJobListResponseBodyJobListJobMNSMessageResult getMNSMessageResult() {
            return this.MNSMessageResult;
        }

        public QueryVideoPoseJobListResponseBodyJobListJob setOutputConfig(QueryVideoPoseJobListResponseBodyJobListJobOutputConfig outputConfig) {
            this.outputConfig = outputConfig;
            return this;
        }
        public QueryVideoPoseJobListResponseBodyJobListJobOutputConfig getOutputConfig() {
            return this.outputConfig;
        }

        public QueryVideoPoseJobListResponseBodyJobListJob setPipelineId(String pipelineId) {
            this.pipelineId = pipelineId;
            return this;
        }
        public String getPipelineId() {
            return this.pipelineId;
        }

        public QueryVideoPoseJobListResponseBodyJobListJob setProperties(QueryVideoPoseJobListResponseBodyJobListJobProperties properties) {
            this.properties = properties;
            return this;
        }
        public QueryVideoPoseJobListResponseBodyJobListJobProperties getProperties() {
            return this.properties;
        }

        public QueryVideoPoseJobListResponseBodyJobListJob setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public QueryVideoPoseJobListResponseBodyJobListJob setUserData(String userData) {
            this.userData = userData;
            return this;
        }
        public String getUserData() {
            return this.userData;
        }

    }

    public static class QueryVideoPoseJobListResponseBodyJobList extends TeaModel {
        @NameInMap("Job")
        public java.util.List<QueryVideoPoseJobListResponseBodyJobListJob> job;

        public static QueryVideoPoseJobListResponseBodyJobList build(java.util.Map<String, ?> map) throws Exception {
            QueryVideoPoseJobListResponseBodyJobList self = new QueryVideoPoseJobListResponseBodyJobList();
            return TeaModel.build(map, self);
        }

        public QueryVideoPoseJobListResponseBodyJobList setJob(java.util.List<QueryVideoPoseJobListResponseBodyJobListJob> job) {
            this.job = job;
            return this;
        }
        public java.util.List<QueryVideoPoseJobListResponseBodyJobListJob> getJob() {
            return this.job;
        }

    }

    public static class QueryVideoPoseJobListResponseBodyNonExistJobIds extends TeaModel {
        @NameInMap("String")
        public java.util.List<String> string;

        public static QueryVideoPoseJobListResponseBodyNonExistJobIds build(java.util.Map<String, ?> map) throws Exception {
            QueryVideoPoseJobListResponseBodyNonExistJobIds self = new QueryVideoPoseJobListResponseBodyNonExistJobIds();
            return TeaModel.build(map, self);
        }

        public QueryVideoPoseJobListResponseBodyNonExistJobIds setString(java.util.List<String> string) {
            this.string = string;
            return this;
        }
        public java.util.List<String> getString() {
            return this.string;
        }

    }

}
