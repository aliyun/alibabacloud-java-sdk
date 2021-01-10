// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class SubmitVideoPoseJobResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("VideoPoseJob")
    public SubmitVideoPoseJobResponseBodyVideoPoseJob videoPoseJob;

    public static SubmitVideoPoseJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitVideoPoseJobResponseBody self = new SubmitVideoPoseJobResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitVideoPoseJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public SubmitVideoPoseJobResponseBody setVideoPoseJob(SubmitVideoPoseJobResponseBodyVideoPoseJob videoPoseJob) {
        this.videoPoseJob = videoPoseJob;
        return this;
    }
    public SubmitVideoPoseJobResponseBodyVideoPoseJob getVideoPoseJob() {
        return this.videoPoseJob;
    }

    public static class SubmitVideoPoseJobResponseBodyVideoPoseJobInput extends TeaModel {
        @NameInMap("Bucket")
        public String bucket;

        @NameInMap("Location")
        public String location;

        @NameInMap("Object")
        public String object;

        @NameInMap("RoleArn")
        public String roleArn;

        public static SubmitVideoPoseJobResponseBodyVideoPoseJobInput build(java.util.Map<String, ?> map) throws Exception {
            SubmitVideoPoseJobResponseBodyVideoPoseJobInput self = new SubmitVideoPoseJobResponseBodyVideoPoseJobInput();
            return TeaModel.build(map, self);
        }

        public SubmitVideoPoseJobResponseBodyVideoPoseJobInput setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

        public SubmitVideoPoseJobResponseBodyVideoPoseJobInput setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public SubmitVideoPoseJobResponseBodyVideoPoseJobInput setObject(String object) {
            this.object = object;
            return this;
        }
        public String getObject() {
            return this.object;
        }

        public SubmitVideoPoseJobResponseBodyVideoPoseJobInput setRoleArn(String roleArn) {
            this.roleArn = roleArn;
            return this;
        }
        public String getRoleArn() {
            return this.roleArn;
        }

    }

    public static class SubmitVideoPoseJobResponseBodyVideoPoseJobOutputConfigVideoFile extends TeaModel {
        @NameInMap("Bucket")
        public String bucket;

        @NameInMap("Location")
        public String location;

        @NameInMap("Object")
        public String object;

        @NameInMap("RoleArn")
        public String roleArn;

        public static SubmitVideoPoseJobResponseBodyVideoPoseJobOutputConfigVideoFile build(java.util.Map<String, ?> map) throws Exception {
            SubmitVideoPoseJobResponseBodyVideoPoseJobOutputConfigVideoFile self = new SubmitVideoPoseJobResponseBodyVideoPoseJobOutputConfigVideoFile();
            return TeaModel.build(map, self);
        }

        public SubmitVideoPoseJobResponseBodyVideoPoseJobOutputConfigVideoFile setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

        public SubmitVideoPoseJobResponseBodyVideoPoseJobOutputConfigVideoFile setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public SubmitVideoPoseJobResponseBodyVideoPoseJobOutputConfigVideoFile setObject(String object) {
            this.object = object;
            return this;
        }
        public String getObject() {
            return this.object;
        }

        public SubmitVideoPoseJobResponseBodyVideoPoseJobOutputConfigVideoFile setRoleArn(String roleArn) {
            this.roleArn = roleArn;
            return this;
        }
        public String getRoleArn() {
            return this.roleArn;
        }

    }

    public static class SubmitVideoPoseJobResponseBodyVideoPoseJobOutputConfigDataFile extends TeaModel {
        @NameInMap("Bucket")
        public String bucket;

        @NameInMap("Location")
        public String location;

        @NameInMap("Object")
        public String object;

        @NameInMap("RoleArn")
        public String roleArn;

        public static SubmitVideoPoseJobResponseBodyVideoPoseJobOutputConfigDataFile build(java.util.Map<String, ?> map) throws Exception {
            SubmitVideoPoseJobResponseBodyVideoPoseJobOutputConfigDataFile self = new SubmitVideoPoseJobResponseBodyVideoPoseJobOutputConfigDataFile();
            return TeaModel.build(map, self);
        }

        public SubmitVideoPoseJobResponseBodyVideoPoseJobOutputConfigDataFile setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

        public SubmitVideoPoseJobResponseBodyVideoPoseJobOutputConfigDataFile setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public SubmitVideoPoseJobResponseBodyVideoPoseJobOutputConfigDataFile setObject(String object) {
            this.object = object;
            return this;
        }
        public String getObject() {
            return this.object;
        }

        public SubmitVideoPoseJobResponseBodyVideoPoseJobOutputConfigDataFile setRoleArn(String roleArn) {
            this.roleArn = roleArn;
            return this;
        }
        public String getRoleArn() {
            return this.roleArn;
        }

    }

    public static class SubmitVideoPoseJobResponseBodyVideoPoseJobOutputConfig extends TeaModel {
        @NameInMap("VideoFile")
        public SubmitVideoPoseJobResponseBodyVideoPoseJobOutputConfigVideoFile videoFile;

        @NameInMap("DataFile")
        public SubmitVideoPoseJobResponseBodyVideoPoseJobOutputConfigDataFile dataFile;

        public static SubmitVideoPoseJobResponseBodyVideoPoseJobOutputConfig build(java.util.Map<String, ?> map) throws Exception {
            SubmitVideoPoseJobResponseBodyVideoPoseJobOutputConfig self = new SubmitVideoPoseJobResponseBodyVideoPoseJobOutputConfig();
            return TeaModel.build(map, self);
        }

        public SubmitVideoPoseJobResponseBodyVideoPoseJobOutputConfig setVideoFile(SubmitVideoPoseJobResponseBodyVideoPoseJobOutputConfigVideoFile videoFile) {
            this.videoFile = videoFile;
            return this;
        }
        public SubmitVideoPoseJobResponseBodyVideoPoseJobOutputConfigVideoFile getVideoFile() {
            return this.videoFile;
        }

        public SubmitVideoPoseJobResponseBodyVideoPoseJobOutputConfig setDataFile(SubmitVideoPoseJobResponseBodyVideoPoseJobOutputConfigDataFile dataFile) {
            this.dataFile = dataFile;
            return this;
        }
        public SubmitVideoPoseJobResponseBodyVideoPoseJobOutputConfigDataFile getDataFile() {
            return this.dataFile;
        }

    }

    public static class SubmitVideoPoseJobResponseBodyVideoPoseJobPropertiesStreamsVideoStreamListVideoStreamNetworkCost extends TeaModel {
        @NameInMap("PreloadTime")
        public String preloadTime;

        @NameInMap("CostBandwidth")
        public String costBandwidth;

        @NameInMap("AvgBitrate")
        public String avgBitrate;

        public static SubmitVideoPoseJobResponseBodyVideoPoseJobPropertiesStreamsVideoStreamListVideoStreamNetworkCost build(java.util.Map<String, ?> map) throws Exception {
            SubmitVideoPoseJobResponseBodyVideoPoseJobPropertiesStreamsVideoStreamListVideoStreamNetworkCost self = new SubmitVideoPoseJobResponseBodyVideoPoseJobPropertiesStreamsVideoStreamListVideoStreamNetworkCost();
            return TeaModel.build(map, self);
        }

        public SubmitVideoPoseJobResponseBodyVideoPoseJobPropertiesStreamsVideoStreamListVideoStreamNetworkCost setPreloadTime(String preloadTime) {
            this.preloadTime = preloadTime;
            return this;
        }
        public String getPreloadTime() {
            return this.preloadTime;
        }

        public SubmitVideoPoseJobResponseBodyVideoPoseJobPropertiesStreamsVideoStreamListVideoStreamNetworkCost setCostBandwidth(String costBandwidth) {
            this.costBandwidth = costBandwidth;
            return this;
        }
        public String getCostBandwidth() {
            return this.costBandwidth;
        }

        public SubmitVideoPoseJobResponseBodyVideoPoseJobPropertiesStreamsVideoStreamListVideoStreamNetworkCost setAvgBitrate(String avgBitrate) {
            this.avgBitrate = avgBitrate;
            return this;
        }
        public String getAvgBitrate() {
            return this.avgBitrate;
        }

    }

    public static class SubmitVideoPoseJobResponseBodyVideoPoseJobPropertiesStreamsVideoStreamListVideoStream extends TeaModel {
        @NameInMap("Index")
        public String index;

        @NameInMap("CodecName")
        public String codecName;

        @NameInMap("CodecLongName")
        public String codecLongName;

        @NameInMap("Profile")
        public String profile;

        @NameInMap("CodecTimeBase")
        public String codecTimeBase;

        @NameInMap("CodecTagString")
        public String codecTagString;

        @NameInMap("CodecTag")
        public String codecTag;

        @NameInMap("Width")
        public String width;

        @NameInMap("Height")
        public String height;

        @NameInMap("HasBFrames")
        public String hasBFrames;

        @NameInMap("Sar")
        public String sar;

        @NameInMap("Dar")
        public String dar;

        @NameInMap("PixFmt")
        public String pixFmt;

        @NameInMap("Level")
        public String level;

        @NameInMap("Fps")
        public String fps;

        @NameInMap("AvgFPS")
        public String avgFPS;

        @NameInMap("Timebase")
        public String timebase;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("Duration")
        public String duration;

        @NameInMap("Bitrate")
        public String bitrate;

        @NameInMap("NumFrames")
        public String numFrames;

        @NameInMap("Lang")
        public String lang;

        @NameInMap("Rotate")
        public String rotate;

        @NameInMap("NetworkCost")
        public SubmitVideoPoseJobResponseBodyVideoPoseJobPropertiesStreamsVideoStreamListVideoStreamNetworkCost networkCost;

        public static SubmitVideoPoseJobResponseBodyVideoPoseJobPropertiesStreamsVideoStreamListVideoStream build(java.util.Map<String, ?> map) throws Exception {
            SubmitVideoPoseJobResponseBodyVideoPoseJobPropertiesStreamsVideoStreamListVideoStream self = new SubmitVideoPoseJobResponseBodyVideoPoseJobPropertiesStreamsVideoStreamListVideoStream();
            return TeaModel.build(map, self);
        }

        public SubmitVideoPoseJobResponseBodyVideoPoseJobPropertiesStreamsVideoStreamListVideoStream setIndex(String index) {
            this.index = index;
            return this;
        }
        public String getIndex() {
            return this.index;
        }

        public SubmitVideoPoseJobResponseBodyVideoPoseJobPropertiesStreamsVideoStreamListVideoStream setCodecName(String codecName) {
            this.codecName = codecName;
            return this;
        }
        public String getCodecName() {
            return this.codecName;
        }

        public SubmitVideoPoseJobResponseBodyVideoPoseJobPropertiesStreamsVideoStreamListVideoStream setCodecLongName(String codecLongName) {
            this.codecLongName = codecLongName;
            return this;
        }
        public String getCodecLongName() {
            return this.codecLongName;
        }

        public SubmitVideoPoseJobResponseBodyVideoPoseJobPropertiesStreamsVideoStreamListVideoStream setProfile(String profile) {
            this.profile = profile;
            return this;
        }
        public String getProfile() {
            return this.profile;
        }

        public SubmitVideoPoseJobResponseBodyVideoPoseJobPropertiesStreamsVideoStreamListVideoStream setCodecTimeBase(String codecTimeBase) {
            this.codecTimeBase = codecTimeBase;
            return this;
        }
        public String getCodecTimeBase() {
            return this.codecTimeBase;
        }

        public SubmitVideoPoseJobResponseBodyVideoPoseJobPropertiesStreamsVideoStreamListVideoStream setCodecTagString(String codecTagString) {
            this.codecTagString = codecTagString;
            return this;
        }
        public String getCodecTagString() {
            return this.codecTagString;
        }

        public SubmitVideoPoseJobResponseBodyVideoPoseJobPropertiesStreamsVideoStreamListVideoStream setCodecTag(String codecTag) {
            this.codecTag = codecTag;
            return this;
        }
        public String getCodecTag() {
            return this.codecTag;
        }

        public SubmitVideoPoseJobResponseBodyVideoPoseJobPropertiesStreamsVideoStreamListVideoStream setWidth(String width) {
            this.width = width;
            return this;
        }
        public String getWidth() {
            return this.width;
        }

        public SubmitVideoPoseJobResponseBodyVideoPoseJobPropertiesStreamsVideoStreamListVideoStream setHeight(String height) {
            this.height = height;
            return this;
        }
        public String getHeight() {
            return this.height;
        }

        public SubmitVideoPoseJobResponseBodyVideoPoseJobPropertiesStreamsVideoStreamListVideoStream setHasBFrames(String hasBFrames) {
            this.hasBFrames = hasBFrames;
            return this;
        }
        public String getHasBFrames() {
            return this.hasBFrames;
        }

        public SubmitVideoPoseJobResponseBodyVideoPoseJobPropertiesStreamsVideoStreamListVideoStream setSar(String sar) {
            this.sar = sar;
            return this;
        }
        public String getSar() {
            return this.sar;
        }

        public SubmitVideoPoseJobResponseBodyVideoPoseJobPropertiesStreamsVideoStreamListVideoStream setDar(String dar) {
            this.dar = dar;
            return this;
        }
        public String getDar() {
            return this.dar;
        }

        public SubmitVideoPoseJobResponseBodyVideoPoseJobPropertiesStreamsVideoStreamListVideoStream setPixFmt(String pixFmt) {
            this.pixFmt = pixFmt;
            return this;
        }
        public String getPixFmt() {
            return this.pixFmt;
        }

        public SubmitVideoPoseJobResponseBodyVideoPoseJobPropertiesStreamsVideoStreamListVideoStream setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public SubmitVideoPoseJobResponseBodyVideoPoseJobPropertiesStreamsVideoStreamListVideoStream setFps(String fps) {
            this.fps = fps;
            return this;
        }
        public String getFps() {
            return this.fps;
        }

        public SubmitVideoPoseJobResponseBodyVideoPoseJobPropertiesStreamsVideoStreamListVideoStream setAvgFPS(String avgFPS) {
            this.avgFPS = avgFPS;
            return this;
        }
        public String getAvgFPS() {
            return this.avgFPS;
        }

        public SubmitVideoPoseJobResponseBodyVideoPoseJobPropertiesStreamsVideoStreamListVideoStream setTimebase(String timebase) {
            this.timebase = timebase;
            return this;
        }
        public String getTimebase() {
            return this.timebase;
        }

        public SubmitVideoPoseJobResponseBodyVideoPoseJobPropertiesStreamsVideoStreamListVideoStream setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public SubmitVideoPoseJobResponseBodyVideoPoseJobPropertiesStreamsVideoStreamListVideoStream setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public SubmitVideoPoseJobResponseBodyVideoPoseJobPropertiesStreamsVideoStreamListVideoStream setBitrate(String bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public String getBitrate() {
            return this.bitrate;
        }

        public SubmitVideoPoseJobResponseBodyVideoPoseJobPropertiesStreamsVideoStreamListVideoStream setNumFrames(String numFrames) {
            this.numFrames = numFrames;
            return this;
        }
        public String getNumFrames() {
            return this.numFrames;
        }

        public SubmitVideoPoseJobResponseBodyVideoPoseJobPropertiesStreamsVideoStreamListVideoStream setLang(String lang) {
            this.lang = lang;
            return this;
        }
        public String getLang() {
            return this.lang;
        }

        public SubmitVideoPoseJobResponseBodyVideoPoseJobPropertiesStreamsVideoStreamListVideoStream setRotate(String rotate) {
            this.rotate = rotate;
            return this;
        }
        public String getRotate() {
            return this.rotate;
        }

        public SubmitVideoPoseJobResponseBodyVideoPoseJobPropertiesStreamsVideoStreamListVideoStream setNetworkCost(SubmitVideoPoseJobResponseBodyVideoPoseJobPropertiesStreamsVideoStreamListVideoStreamNetworkCost networkCost) {
            this.networkCost = networkCost;
            return this;
        }
        public SubmitVideoPoseJobResponseBodyVideoPoseJobPropertiesStreamsVideoStreamListVideoStreamNetworkCost getNetworkCost() {
            return this.networkCost;
        }

    }

    public static class SubmitVideoPoseJobResponseBodyVideoPoseJobPropertiesStreamsVideoStreamList extends TeaModel {
        @NameInMap("VideoStream")
        public java.util.List<SubmitVideoPoseJobResponseBodyVideoPoseJobPropertiesStreamsVideoStreamListVideoStream> videoStream;

        public static SubmitVideoPoseJobResponseBodyVideoPoseJobPropertiesStreamsVideoStreamList build(java.util.Map<String, ?> map) throws Exception {
            SubmitVideoPoseJobResponseBodyVideoPoseJobPropertiesStreamsVideoStreamList self = new SubmitVideoPoseJobResponseBodyVideoPoseJobPropertiesStreamsVideoStreamList();
            return TeaModel.build(map, self);
        }

        public SubmitVideoPoseJobResponseBodyVideoPoseJobPropertiesStreamsVideoStreamList setVideoStream(java.util.List<SubmitVideoPoseJobResponseBodyVideoPoseJobPropertiesStreamsVideoStreamListVideoStream> videoStream) {
            this.videoStream = videoStream;
            return this;
        }
        public java.util.List<SubmitVideoPoseJobResponseBodyVideoPoseJobPropertiesStreamsVideoStreamListVideoStream> getVideoStream() {
            return this.videoStream;
        }

    }

    public static class SubmitVideoPoseJobResponseBodyVideoPoseJobPropertiesStreamsAudioStreamListAudioStream extends TeaModel {
        @NameInMap("Index")
        public String index;

        @NameInMap("CodecName")
        public String codecName;

        @NameInMap("CodecTimeBase")
        public String codecTimeBase;

        @NameInMap("CodecLongName")
        public String codecLongName;

        @NameInMap("CodecTagString")
        public String codecTagString;

        @NameInMap("CodecTag")
        public String codecTag;

        @NameInMap("SampleFmt")
        public String sampleFmt;

        @NameInMap("Samplerate")
        public String samplerate;

        @NameInMap("Channels")
        public String channels;

        @NameInMap("ChannelLayout")
        public String channelLayout;

        @NameInMap("Timebase")
        public String timebase;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("Duration")
        public String duration;

        @NameInMap("Bitrate")
        public String bitrate;

        @NameInMap("NumFrames")
        public String numFrames;

        @NameInMap("Lang")
        public String lang;

        public static SubmitVideoPoseJobResponseBodyVideoPoseJobPropertiesStreamsAudioStreamListAudioStream build(java.util.Map<String, ?> map) throws Exception {
            SubmitVideoPoseJobResponseBodyVideoPoseJobPropertiesStreamsAudioStreamListAudioStream self = new SubmitVideoPoseJobResponseBodyVideoPoseJobPropertiesStreamsAudioStreamListAudioStream();
            return TeaModel.build(map, self);
        }

        public SubmitVideoPoseJobResponseBodyVideoPoseJobPropertiesStreamsAudioStreamListAudioStream setIndex(String index) {
            this.index = index;
            return this;
        }
        public String getIndex() {
            return this.index;
        }

        public SubmitVideoPoseJobResponseBodyVideoPoseJobPropertiesStreamsAudioStreamListAudioStream setCodecName(String codecName) {
            this.codecName = codecName;
            return this;
        }
        public String getCodecName() {
            return this.codecName;
        }

        public SubmitVideoPoseJobResponseBodyVideoPoseJobPropertiesStreamsAudioStreamListAudioStream setCodecTimeBase(String codecTimeBase) {
            this.codecTimeBase = codecTimeBase;
            return this;
        }
        public String getCodecTimeBase() {
            return this.codecTimeBase;
        }

        public SubmitVideoPoseJobResponseBodyVideoPoseJobPropertiesStreamsAudioStreamListAudioStream setCodecLongName(String codecLongName) {
            this.codecLongName = codecLongName;
            return this;
        }
        public String getCodecLongName() {
            return this.codecLongName;
        }

        public SubmitVideoPoseJobResponseBodyVideoPoseJobPropertiesStreamsAudioStreamListAudioStream setCodecTagString(String codecTagString) {
            this.codecTagString = codecTagString;
            return this;
        }
        public String getCodecTagString() {
            return this.codecTagString;
        }

        public SubmitVideoPoseJobResponseBodyVideoPoseJobPropertiesStreamsAudioStreamListAudioStream setCodecTag(String codecTag) {
            this.codecTag = codecTag;
            return this;
        }
        public String getCodecTag() {
            return this.codecTag;
        }

        public SubmitVideoPoseJobResponseBodyVideoPoseJobPropertiesStreamsAudioStreamListAudioStream setSampleFmt(String sampleFmt) {
            this.sampleFmt = sampleFmt;
            return this;
        }
        public String getSampleFmt() {
            return this.sampleFmt;
        }

        public SubmitVideoPoseJobResponseBodyVideoPoseJobPropertiesStreamsAudioStreamListAudioStream setSamplerate(String samplerate) {
            this.samplerate = samplerate;
            return this;
        }
        public String getSamplerate() {
            return this.samplerate;
        }

        public SubmitVideoPoseJobResponseBodyVideoPoseJobPropertiesStreamsAudioStreamListAudioStream setChannels(String channels) {
            this.channels = channels;
            return this;
        }
        public String getChannels() {
            return this.channels;
        }

        public SubmitVideoPoseJobResponseBodyVideoPoseJobPropertiesStreamsAudioStreamListAudioStream setChannelLayout(String channelLayout) {
            this.channelLayout = channelLayout;
            return this;
        }
        public String getChannelLayout() {
            return this.channelLayout;
        }

        public SubmitVideoPoseJobResponseBodyVideoPoseJobPropertiesStreamsAudioStreamListAudioStream setTimebase(String timebase) {
            this.timebase = timebase;
            return this;
        }
        public String getTimebase() {
            return this.timebase;
        }

        public SubmitVideoPoseJobResponseBodyVideoPoseJobPropertiesStreamsAudioStreamListAudioStream setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public SubmitVideoPoseJobResponseBodyVideoPoseJobPropertiesStreamsAudioStreamListAudioStream setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public SubmitVideoPoseJobResponseBodyVideoPoseJobPropertiesStreamsAudioStreamListAudioStream setBitrate(String bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public String getBitrate() {
            return this.bitrate;
        }

        public SubmitVideoPoseJobResponseBodyVideoPoseJobPropertiesStreamsAudioStreamListAudioStream setNumFrames(String numFrames) {
            this.numFrames = numFrames;
            return this;
        }
        public String getNumFrames() {
            return this.numFrames;
        }

        public SubmitVideoPoseJobResponseBodyVideoPoseJobPropertiesStreamsAudioStreamListAudioStream setLang(String lang) {
            this.lang = lang;
            return this;
        }
        public String getLang() {
            return this.lang;
        }

    }

    public static class SubmitVideoPoseJobResponseBodyVideoPoseJobPropertiesStreamsAudioStreamList extends TeaModel {
        @NameInMap("AudioStream")
        public java.util.List<SubmitVideoPoseJobResponseBodyVideoPoseJobPropertiesStreamsAudioStreamListAudioStream> audioStream;

        public static SubmitVideoPoseJobResponseBodyVideoPoseJobPropertiesStreamsAudioStreamList build(java.util.Map<String, ?> map) throws Exception {
            SubmitVideoPoseJobResponseBodyVideoPoseJobPropertiesStreamsAudioStreamList self = new SubmitVideoPoseJobResponseBodyVideoPoseJobPropertiesStreamsAudioStreamList();
            return TeaModel.build(map, self);
        }

        public SubmitVideoPoseJobResponseBodyVideoPoseJobPropertiesStreamsAudioStreamList setAudioStream(java.util.List<SubmitVideoPoseJobResponseBodyVideoPoseJobPropertiesStreamsAudioStreamListAudioStream> audioStream) {
            this.audioStream = audioStream;
            return this;
        }
        public java.util.List<SubmitVideoPoseJobResponseBodyVideoPoseJobPropertiesStreamsAudioStreamListAudioStream> getAudioStream() {
            return this.audioStream;
        }

    }

    public static class SubmitVideoPoseJobResponseBodyVideoPoseJobPropertiesStreamsSubtitleStreamListSubtitleStream extends TeaModel {
        @NameInMap("Index")
        public String index;

        @NameInMap("CodecName")
        public String codecName;

        @NameInMap("CodecTimeBase")
        public String codecTimeBase;

        @NameInMap("CodecLongName")
        public String codecLongName;

        @NameInMap("CodecTagString")
        public String codecTagString;

        @NameInMap("CodecTag")
        public String codecTag;

        @NameInMap("Timebase")
        public String timebase;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("Duration")
        public String duration;

        @NameInMap("Lang")
        public String lang;

        public static SubmitVideoPoseJobResponseBodyVideoPoseJobPropertiesStreamsSubtitleStreamListSubtitleStream build(java.util.Map<String, ?> map) throws Exception {
            SubmitVideoPoseJobResponseBodyVideoPoseJobPropertiesStreamsSubtitleStreamListSubtitleStream self = new SubmitVideoPoseJobResponseBodyVideoPoseJobPropertiesStreamsSubtitleStreamListSubtitleStream();
            return TeaModel.build(map, self);
        }

        public SubmitVideoPoseJobResponseBodyVideoPoseJobPropertiesStreamsSubtitleStreamListSubtitleStream setIndex(String index) {
            this.index = index;
            return this;
        }
        public String getIndex() {
            return this.index;
        }

        public SubmitVideoPoseJobResponseBodyVideoPoseJobPropertiesStreamsSubtitleStreamListSubtitleStream setCodecName(String codecName) {
            this.codecName = codecName;
            return this;
        }
        public String getCodecName() {
            return this.codecName;
        }

        public SubmitVideoPoseJobResponseBodyVideoPoseJobPropertiesStreamsSubtitleStreamListSubtitleStream setCodecTimeBase(String codecTimeBase) {
            this.codecTimeBase = codecTimeBase;
            return this;
        }
        public String getCodecTimeBase() {
            return this.codecTimeBase;
        }

        public SubmitVideoPoseJobResponseBodyVideoPoseJobPropertiesStreamsSubtitleStreamListSubtitleStream setCodecLongName(String codecLongName) {
            this.codecLongName = codecLongName;
            return this;
        }
        public String getCodecLongName() {
            return this.codecLongName;
        }

        public SubmitVideoPoseJobResponseBodyVideoPoseJobPropertiesStreamsSubtitleStreamListSubtitleStream setCodecTagString(String codecTagString) {
            this.codecTagString = codecTagString;
            return this;
        }
        public String getCodecTagString() {
            return this.codecTagString;
        }

        public SubmitVideoPoseJobResponseBodyVideoPoseJobPropertiesStreamsSubtitleStreamListSubtitleStream setCodecTag(String codecTag) {
            this.codecTag = codecTag;
            return this;
        }
        public String getCodecTag() {
            return this.codecTag;
        }

        public SubmitVideoPoseJobResponseBodyVideoPoseJobPropertiesStreamsSubtitleStreamListSubtitleStream setTimebase(String timebase) {
            this.timebase = timebase;
            return this;
        }
        public String getTimebase() {
            return this.timebase;
        }

        public SubmitVideoPoseJobResponseBodyVideoPoseJobPropertiesStreamsSubtitleStreamListSubtitleStream setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public SubmitVideoPoseJobResponseBodyVideoPoseJobPropertiesStreamsSubtitleStreamListSubtitleStream setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public SubmitVideoPoseJobResponseBodyVideoPoseJobPropertiesStreamsSubtitleStreamListSubtitleStream setLang(String lang) {
            this.lang = lang;
            return this;
        }
        public String getLang() {
            return this.lang;
        }

    }

    public static class SubmitVideoPoseJobResponseBodyVideoPoseJobPropertiesStreamsSubtitleStreamList extends TeaModel {
        @NameInMap("SubtitleStream")
        public java.util.List<SubmitVideoPoseJobResponseBodyVideoPoseJobPropertiesStreamsSubtitleStreamListSubtitleStream> subtitleStream;

        public static SubmitVideoPoseJobResponseBodyVideoPoseJobPropertiesStreamsSubtitleStreamList build(java.util.Map<String, ?> map) throws Exception {
            SubmitVideoPoseJobResponseBodyVideoPoseJobPropertiesStreamsSubtitleStreamList self = new SubmitVideoPoseJobResponseBodyVideoPoseJobPropertiesStreamsSubtitleStreamList();
            return TeaModel.build(map, self);
        }

        public SubmitVideoPoseJobResponseBodyVideoPoseJobPropertiesStreamsSubtitleStreamList setSubtitleStream(java.util.List<SubmitVideoPoseJobResponseBodyVideoPoseJobPropertiesStreamsSubtitleStreamListSubtitleStream> subtitleStream) {
            this.subtitleStream = subtitleStream;
            return this;
        }
        public java.util.List<SubmitVideoPoseJobResponseBodyVideoPoseJobPropertiesStreamsSubtitleStreamListSubtitleStream> getSubtitleStream() {
            return this.subtitleStream;
        }

    }

    public static class SubmitVideoPoseJobResponseBodyVideoPoseJobPropertiesStreams extends TeaModel {
        @NameInMap("VideoStreamList")
        public SubmitVideoPoseJobResponseBodyVideoPoseJobPropertiesStreamsVideoStreamList videoStreamList;

        @NameInMap("AudioStreamList")
        public SubmitVideoPoseJobResponseBodyVideoPoseJobPropertiesStreamsAudioStreamList audioStreamList;

        @NameInMap("SubtitleStreamList")
        public SubmitVideoPoseJobResponseBodyVideoPoseJobPropertiesStreamsSubtitleStreamList subtitleStreamList;

        public static SubmitVideoPoseJobResponseBodyVideoPoseJobPropertiesStreams build(java.util.Map<String, ?> map) throws Exception {
            SubmitVideoPoseJobResponseBodyVideoPoseJobPropertiesStreams self = new SubmitVideoPoseJobResponseBodyVideoPoseJobPropertiesStreams();
            return TeaModel.build(map, self);
        }

        public SubmitVideoPoseJobResponseBodyVideoPoseJobPropertiesStreams setVideoStreamList(SubmitVideoPoseJobResponseBodyVideoPoseJobPropertiesStreamsVideoStreamList videoStreamList) {
            this.videoStreamList = videoStreamList;
            return this;
        }
        public SubmitVideoPoseJobResponseBodyVideoPoseJobPropertiesStreamsVideoStreamList getVideoStreamList() {
            return this.videoStreamList;
        }

        public SubmitVideoPoseJobResponseBodyVideoPoseJobPropertiesStreams setAudioStreamList(SubmitVideoPoseJobResponseBodyVideoPoseJobPropertiesStreamsAudioStreamList audioStreamList) {
            this.audioStreamList = audioStreamList;
            return this;
        }
        public SubmitVideoPoseJobResponseBodyVideoPoseJobPropertiesStreamsAudioStreamList getAudioStreamList() {
            return this.audioStreamList;
        }

        public SubmitVideoPoseJobResponseBodyVideoPoseJobPropertiesStreams setSubtitleStreamList(SubmitVideoPoseJobResponseBodyVideoPoseJobPropertiesStreamsSubtitleStreamList subtitleStreamList) {
            this.subtitleStreamList = subtitleStreamList;
            return this;
        }
        public SubmitVideoPoseJobResponseBodyVideoPoseJobPropertiesStreamsSubtitleStreamList getSubtitleStreamList() {
            return this.subtitleStreamList;
        }

    }

    public static class SubmitVideoPoseJobResponseBodyVideoPoseJobPropertiesFormat extends TeaModel {
        @NameInMap("NumStreams")
        public String numStreams;

        @NameInMap("NumPrograms")
        public String numPrograms;

        @NameInMap("FormatName")
        public String formatName;

        @NameInMap("FormatLongName")
        public String formatLongName;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("Duration")
        public String duration;

        @NameInMap("Size")
        public String size;

        @NameInMap("Bitrate")
        public String bitrate;

        public static SubmitVideoPoseJobResponseBodyVideoPoseJobPropertiesFormat build(java.util.Map<String, ?> map) throws Exception {
            SubmitVideoPoseJobResponseBodyVideoPoseJobPropertiesFormat self = new SubmitVideoPoseJobResponseBodyVideoPoseJobPropertiesFormat();
            return TeaModel.build(map, self);
        }

        public SubmitVideoPoseJobResponseBodyVideoPoseJobPropertiesFormat setNumStreams(String numStreams) {
            this.numStreams = numStreams;
            return this;
        }
        public String getNumStreams() {
            return this.numStreams;
        }

        public SubmitVideoPoseJobResponseBodyVideoPoseJobPropertiesFormat setNumPrograms(String numPrograms) {
            this.numPrograms = numPrograms;
            return this;
        }
        public String getNumPrograms() {
            return this.numPrograms;
        }

        public SubmitVideoPoseJobResponseBodyVideoPoseJobPropertiesFormat setFormatName(String formatName) {
            this.formatName = formatName;
            return this;
        }
        public String getFormatName() {
            return this.formatName;
        }

        public SubmitVideoPoseJobResponseBodyVideoPoseJobPropertiesFormat setFormatLongName(String formatLongName) {
            this.formatLongName = formatLongName;
            return this;
        }
        public String getFormatLongName() {
            return this.formatLongName;
        }

        public SubmitVideoPoseJobResponseBodyVideoPoseJobPropertiesFormat setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public SubmitVideoPoseJobResponseBodyVideoPoseJobPropertiesFormat setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public SubmitVideoPoseJobResponseBodyVideoPoseJobPropertiesFormat setSize(String size) {
            this.size = size;
            return this;
        }
        public String getSize() {
            return this.size;
        }

        public SubmitVideoPoseJobResponseBodyVideoPoseJobPropertiesFormat setBitrate(String bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public String getBitrate() {
            return this.bitrate;
        }

    }

    public static class SubmitVideoPoseJobResponseBodyVideoPoseJobProperties extends TeaModel {
        @NameInMap("Width")
        public String width;

        @NameInMap("Height")
        public String height;

        @NameInMap("Bitrate")
        public String bitrate;

        @NameInMap("Duration")
        public String duration;

        @NameInMap("Fps")
        public String fps;

        @NameInMap("FileSize")
        public String fileSize;

        @NameInMap("FileFormat")
        public String fileFormat;

        @NameInMap("Streams")
        public SubmitVideoPoseJobResponseBodyVideoPoseJobPropertiesStreams streams;

        @NameInMap("Format")
        public SubmitVideoPoseJobResponseBodyVideoPoseJobPropertiesFormat format;

        public static SubmitVideoPoseJobResponseBodyVideoPoseJobProperties build(java.util.Map<String, ?> map) throws Exception {
            SubmitVideoPoseJobResponseBodyVideoPoseJobProperties self = new SubmitVideoPoseJobResponseBodyVideoPoseJobProperties();
            return TeaModel.build(map, self);
        }

        public SubmitVideoPoseJobResponseBodyVideoPoseJobProperties setWidth(String width) {
            this.width = width;
            return this;
        }
        public String getWidth() {
            return this.width;
        }

        public SubmitVideoPoseJobResponseBodyVideoPoseJobProperties setHeight(String height) {
            this.height = height;
            return this;
        }
        public String getHeight() {
            return this.height;
        }

        public SubmitVideoPoseJobResponseBodyVideoPoseJobProperties setBitrate(String bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public String getBitrate() {
            return this.bitrate;
        }

        public SubmitVideoPoseJobResponseBodyVideoPoseJobProperties setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public SubmitVideoPoseJobResponseBodyVideoPoseJobProperties setFps(String fps) {
            this.fps = fps;
            return this;
        }
        public String getFps() {
            return this.fps;
        }

        public SubmitVideoPoseJobResponseBodyVideoPoseJobProperties setFileSize(String fileSize) {
            this.fileSize = fileSize;
            return this;
        }
        public String getFileSize() {
            return this.fileSize;
        }

        public SubmitVideoPoseJobResponseBodyVideoPoseJobProperties setFileFormat(String fileFormat) {
            this.fileFormat = fileFormat;
            return this;
        }
        public String getFileFormat() {
            return this.fileFormat;
        }

        public SubmitVideoPoseJobResponseBodyVideoPoseJobProperties setStreams(SubmitVideoPoseJobResponseBodyVideoPoseJobPropertiesStreams streams) {
            this.streams = streams;
            return this;
        }
        public SubmitVideoPoseJobResponseBodyVideoPoseJobPropertiesStreams getStreams() {
            return this.streams;
        }

        public SubmitVideoPoseJobResponseBodyVideoPoseJobProperties setFormat(SubmitVideoPoseJobResponseBodyVideoPoseJobPropertiesFormat format) {
            this.format = format;
            return this;
        }
        public SubmitVideoPoseJobResponseBodyVideoPoseJobPropertiesFormat getFormat() {
            return this.format;
        }

    }

    public static class SubmitVideoPoseJobResponseBodyVideoPoseJobMNSMessageResult extends TeaModel {
        @NameInMap("MessageId")
        public String messageId;

        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("ErrorCode")
        public String errorCode;

        public static SubmitVideoPoseJobResponseBodyVideoPoseJobMNSMessageResult build(java.util.Map<String, ?> map) throws Exception {
            SubmitVideoPoseJobResponseBodyVideoPoseJobMNSMessageResult self = new SubmitVideoPoseJobResponseBodyVideoPoseJobMNSMessageResult();
            return TeaModel.build(map, self);
        }

        public SubmitVideoPoseJobResponseBodyVideoPoseJobMNSMessageResult setMessageId(String messageId) {
            this.messageId = messageId;
            return this;
        }
        public String getMessageId() {
            return this.messageId;
        }

        public SubmitVideoPoseJobResponseBodyVideoPoseJobMNSMessageResult setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public SubmitVideoPoseJobResponseBodyVideoPoseJobMNSMessageResult setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

    }

    public static class SubmitVideoPoseJobResponseBodyVideoPoseJob extends TeaModel {
        @NameInMap("JobId")
        public String jobId;

        @NameInMap("PipelineId")
        public String pipelineId;

        @NameInMap("UserData")
        public String userData;

        @NameInMap("State")
        public String state;

        @NameInMap("Input")
        public SubmitVideoPoseJobResponseBodyVideoPoseJobInput input;

        @NameInMap("OutputConfig")
        public SubmitVideoPoseJobResponseBodyVideoPoseJobOutputConfig outputConfig;

        @NameInMap("Properties")
        public SubmitVideoPoseJobResponseBodyVideoPoseJobProperties properties;

        @NameInMap("MNSMessageResult")
        public SubmitVideoPoseJobResponseBodyVideoPoseJobMNSMessageResult MNSMessageResult;

        public static SubmitVideoPoseJobResponseBodyVideoPoseJob build(java.util.Map<String, ?> map) throws Exception {
            SubmitVideoPoseJobResponseBodyVideoPoseJob self = new SubmitVideoPoseJobResponseBodyVideoPoseJob();
            return TeaModel.build(map, self);
        }

        public SubmitVideoPoseJobResponseBodyVideoPoseJob setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public SubmitVideoPoseJobResponseBodyVideoPoseJob setPipelineId(String pipelineId) {
            this.pipelineId = pipelineId;
            return this;
        }
        public String getPipelineId() {
            return this.pipelineId;
        }

        public SubmitVideoPoseJobResponseBodyVideoPoseJob setUserData(String userData) {
            this.userData = userData;
            return this;
        }
        public String getUserData() {
            return this.userData;
        }

        public SubmitVideoPoseJobResponseBodyVideoPoseJob setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public SubmitVideoPoseJobResponseBodyVideoPoseJob setInput(SubmitVideoPoseJobResponseBodyVideoPoseJobInput input) {
            this.input = input;
            return this;
        }
        public SubmitVideoPoseJobResponseBodyVideoPoseJobInput getInput() {
            return this.input;
        }

        public SubmitVideoPoseJobResponseBodyVideoPoseJob setOutputConfig(SubmitVideoPoseJobResponseBodyVideoPoseJobOutputConfig outputConfig) {
            this.outputConfig = outputConfig;
            return this;
        }
        public SubmitVideoPoseJobResponseBodyVideoPoseJobOutputConfig getOutputConfig() {
            return this.outputConfig;
        }

        public SubmitVideoPoseJobResponseBodyVideoPoseJob setProperties(SubmitVideoPoseJobResponseBodyVideoPoseJobProperties properties) {
            this.properties = properties;
            return this;
        }
        public SubmitVideoPoseJobResponseBodyVideoPoseJobProperties getProperties() {
            return this.properties;
        }

        public SubmitVideoPoseJobResponseBodyVideoPoseJob setMNSMessageResult(SubmitVideoPoseJobResponseBodyVideoPoseJobMNSMessageResult MNSMessageResult) {
            this.MNSMessageResult = MNSMessageResult;
            return this;
        }
        public SubmitVideoPoseJobResponseBodyVideoPoseJobMNSMessageResult getMNSMessageResult() {
            return this.MNSMessageResult;
        }

    }

}
