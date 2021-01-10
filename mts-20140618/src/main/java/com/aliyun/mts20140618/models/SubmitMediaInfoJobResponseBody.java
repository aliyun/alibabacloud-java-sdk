// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class SubmitMediaInfoJobResponseBody extends TeaModel {
    @NameInMap("MediaInfoJob")
    public SubmitMediaInfoJobResponseBodyMediaInfoJob mediaInfoJob;

    @NameInMap("RequestId")
    public String requestId;

    public static SubmitMediaInfoJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitMediaInfoJobResponseBody self = new SubmitMediaInfoJobResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitMediaInfoJobResponseBody setMediaInfoJob(SubmitMediaInfoJobResponseBodyMediaInfoJob mediaInfoJob) {
        this.mediaInfoJob = mediaInfoJob;
        return this;
    }
    public SubmitMediaInfoJobResponseBodyMediaInfoJob getMediaInfoJob() {
        return this.mediaInfoJob;
    }

    public SubmitMediaInfoJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class SubmitMediaInfoJobResponseBodyMediaInfoJobInput extends TeaModel {
        @NameInMap("Object")
        public String object;

        @NameInMap("Location")
        public String location;

        @NameInMap("Bucket")
        public String bucket;

        public static SubmitMediaInfoJobResponseBodyMediaInfoJobInput build(java.util.Map<String, ?> map) throws Exception {
            SubmitMediaInfoJobResponseBodyMediaInfoJobInput self = new SubmitMediaInfoJobResponseBodyMediaInfoJobInput();
            return TeaModel.build(map, self);
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobInput setObject(String object) {
            this.object = object;
            return this;
        }
        public String getObject() {
            return this.object;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobInput setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobInput setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

    }

    public static class SubmitMediaInfoJobResponseBodyMediaInfoJobMNSMessageResult extends TeaModel {
        @NameInMap("MessageId")
        public String messageId;

        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("ErrorCode")
        public String errorCode;

        public static SubmitMediaInfoJobResponseBodyMediaInfoJobMNSMessageResult build(java.util.Map<String, ?> map) throws Exception {
            SubmitMediaInfoJobResponseBodyMediaInfoJobMNSMessageResult self = new SubmitMediaInfoJobResponseBodyMediaInfoJobMNSMessageResult();
            return TeaModel.build(map, self);
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobMNSMessageResult setMessageId(String messageId) {
            this.messageId = messageId;
            return this;
        }
        public String getMessageId() {
            return this.messageId;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobMNSMessageResult setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobMNSMessageResult setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

    }

    public static class SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesStreamsVideoStreamListVideoStreamNetworkCost extends TeaModel {
        @NameInMap("PreloadTime")
        public String preloadTime;

        @NameInMap("AvgBitrate")
        public String avgBitrate;

        @NameInMap("CostBandwidth")
        public String costBandwidth;

        public static SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesStreamsVideoStreamListVideoStreamNetworkCost build(java.util.Map<String, ?> map) throws Exception {
            SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesStreamsVideoStreamListVideoStreamNetworkCost self = new SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesStreamsVideoStreamListVideoStreamNetworkCost();
            return TeaModel.build(map, self);
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesStreamsVideoStreamListVideoStreamNetworkCost setPreloadTime(String preloadTime) {
            this.preloadTime = preloadTime;
            return this;
        }
        public String getPreloadTime() {
            return this.preloadTime;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesStreamsVideoStreamListVideoStreamNetworkCost setAvgBitrate(String avgBitrate) {
            this.avgBitrate = avgBitrate;
            return this;
        }
        public String getAvgBitrate() {
            return this.avgBitrate;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesStreamsVideoStreamListVideoStreamNetworkCost setCostBandwidth(String costBandwidth) {
            this.costBandwidth = costBandwidth;
            return this;
        }
        public String getCostBandwidth() {
            return this.costBandwidth;
        }

    }

    public static class SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesStreamsVideoStreamListVideoStream extends TeaModel {
        @NameInMap("Sar")
        public String sar;

        @NameInMap("Height")
        public String height;

        @NameInMap("CodecTagString")
        public String codecTagString;

        @NameInMap("NetworkCost")
        public SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesStreamsVideoStreamListVideoStreamNetworkCost networkCost;

        @NameInMap("Width")
        public String width;

        @NameInMap("Index")
        public String index;

        @NameInMap("Timebase")
        public String timebase;

        @NameInMap("AvgFPS")
        public String avgFPS;

        @NameInMap("PixFmt")
        public String pixFmt;

        @NameInMap("Lang")
        public String lang;

        @NameInMap("CodecLongName")
        public String codecLongName;

        @NameInMap("NumFrames")
        public String numFrames;

        @NameInMap("Rotate")
        public String rotate;

        @NameInMap("Bitrate")
        public String bitrate;

        @NameInMap("HasBFrames")
        public String hasBFrames;

        @NameInMap("Profile")
        public String profile;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("Dar")
        public String dar;

        @NameInMap("CodecName")
        public String codecName;

        @NameInMap("Duration")
        public String duration;

        @NameInMap("Fps")
        public String fps;

        @NameInMap("CodecTag")
        public String codecTag;

        @NameInMap("CodecTimeBase")
        public String codecTimeBase;

        @NameInMap("Level")
        public String level;

        public static SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesStreamsVideoStreamListVideoStream build(java.util.Map<String, ?> map) throws Exception {
            SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesStreamsVideoStreamListVideoStream self = new SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesStreamsVideoStreamListVideoStream();
            return TeaModel.build(map, self);
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesStreamsVideoStreamListVideoStream setSar(String sar) {
            this.sar = sar;
            return this;
        }
        public String getSar() {
            return this.sar;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesStreamsVideoStreamListVideoStream setHeight(String height) {
            this.height = height;
            return this;
        }
        public String getHeight() {
            return this.height;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesStreamsVideoStreamListVideoStream setCodecTagString(String codecTagString) {
            this.codecTagString = codecTagString;
            return this;
        }
        public String getCodecTagString() {
            return this.codecTagString;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesStreamsVideoStreamListVideoStream setNetworkCost(SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesStreamsVideoStreamListVideoStreamNetworkCost networkCost) {
            this.networkCost = networkCost;
            return this;
        }
        public SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesStreamsVideoStreamListVideoStreamNetworkCost getNetworkCost() {
            return this.networkCost;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesStreamsVideoStreamListVideoStream setWidth(String width) {
            this.width = width;
            return this;
        }
        public String getWidth() {
            return this.width;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesStreamsVideoStreamListVideoStream setIndex(String index) {
            this.index = index;
            return this;
        }
        public String getIndex() {
            return this.index;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesStreamsVideoStreamListVideoStream setTimebase(String timebase) {
            this.timebase = timebase;
            return this;
        }
        public String getTimebase() {
            return this.timebase;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesStreamsVideoStreamListVideoStream setAvgFPS(String avgFPS) {
            this.avgFPS = avgFPS;
            return this;
        }
        public String getAvgFPS() {
            return this.avgFPS;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesStreamsVideoStreamListVideoStream setPixFmt(String pixFmt) {
            this.pixFmt = pixFmt;
            return this;
        }
        public String getPixFmt() {
            return this.pixFmt;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesStreamsVideoStreamListVideoStream setLang(String lang) {
            this.lang = lang;
            return this;
        }
        public String getLang() {
            return this.lang;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesStreamsVideoStreamListVideoStream setCodecLongName(String codecLongName) {
            this.codecLongName = codecLongName;
            return this;
        }
        public String getCodecLongName() {
            return this.codecLongName;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesStreamsVideoStreamListVideoStream setNumFrames(String numFrames) {
            this.numFrames = numFrames;
            return this;
        }
        public String getNumFrames() {
            return this.numFrames;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesStreamsVideoStreamListVideoStream setRotate(String rotate) {
            this.rotate = rotate;
            return this;
        }
        public String getRotate() {
            return this.rotate;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesStreamsVideoStreamListVideoStream setBitrate(String bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public String getBitrate() {
            return this.bitrate;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesStreamsVideoStreamListVideoStream setHasBFrames(String hasBFrames) {
            this.hasBFrames = hasBFrames;
            return this;
        }
        public String getHasBFrames() {
            return this.hasBFrames;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesStreamsVideoStreamListVideoStream setProfile(String profile) {
            this.profile = profile;
            return this;
        }
        public String getProfile() {
            return this.profile;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesStreamsVideoStreamListVideoStream setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesStreamsVideoStreamListVideoStream setDar(String dar) {
            this.dar = dar;
            return this;
        }
        public String getDar() {
            return this.dar;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesStreamsVideoStreamListVideoStream setCodecName(String codecName) {
            this.codecName = codecName;
            return this;
        }
        public String getCodecName() {
            return this.codecName;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesStreamsVideoStreamListVideoStream setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesStreamsVideoStreamListVideoStream setFps(String fps) {
            this.fps = fps;
            return this;
        }
        public String getFps() {
            return this.fps;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesStreamsVideoStreamListVideoStream setCodecTag(String codecTag) {
            this.codecTag = codecTag;
            return this;
        }
        public String getCodecTag() {
            return this.codecTag;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesStreamsVideoStreamListVideoStream setCodecTimeBase(String codecTimeBase) {
            this.codecTimeBase = codecTimeBase;
            return this;
        }
        public String getCodecTimeBase() {
            return this.codecTimeBase;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesStreamsVideoStreamListVideoStream setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

    }

    public static class SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesStreamsVideoStreamList extends TeaModel {
        @NameInMap("VideoStream")
        public java.util.List<SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesStreamsVideoStreamListVideoStream> videoStream;

        public static SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesStreamsVideoStreamList build(java.util.Map<String, ?> map) throws Exception {
            SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesStreamsVideoStreamList self = new SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesStreamsVideoStreamList();
            return TeaModel.build(map, self);
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesStreamsVideoStreamList setVideoStream(java.util.List<SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesStreamsVideoStreamListVideoStream> videoStream) {
            this.videoStream = videoStream;
            return this;
        }
        public java.util.List<SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesStreamsVideoStreamListVideoStream> getVideoStream() {
            return this.videoStream;
        }

    }

    public static class SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesStreamsAudioStreamListAudioStream extends TeaModel {
        @NameInMap("Timebase")
        public String timebase;

        @NameInMap("Index")
        public String index;

        @NameInMap("SampleFmt")
        public String sampleFmt;

        @NameInMap("ChannelLayout")
        public String channelLayout;

        @NameInMap("Lang")
        public String lang;

        @NameInMap("Samplerate")
        public String samplerate;

        @NameInMap("CodecLongName")
        public String codecLongName;

        @NameInMap("Channels")
        public String channels;

        @NameInMap("NumFrames")
        public String numFrames;

        @NameInMap("Bitrate")
        public String bitrate;

        @NameInMap("CodecTagString")
        public String codecTagString;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("CodecName")
        public String codecName;

        @NameInMap("Duration")
        public String duration;

        @NameInMap("CodecTag")
        public String codecTag;

        @NameInMap("CodecTimeBase")
        public String codecTimeBase;

        public static SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesStreamsAudioStreamListAudioStream build(java.util.Map<String, ?> map) throws Exception {
            SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesStreamsAudioStreamListAudioStream self = new SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesStreamsAudioStreamListAudioStream();
            return TeaModel.build(map, self);
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesStreamsAudioStreamListAudioStream setTimebase(String timebase) {
            this.timebase = timebase;
            return this;
        }
        public String getTimebase() {
            return this.timebase;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesStreamsAudioStreamListAudioStream setIndex(String index) {
            this.index = index;
            return this;
        }
        public String getIndex() {
            return this.index;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesStreamsAudioStreamListAudioStream setSampleFmt(String sampleFmt) {
            this.sampleFmt = sampleFmt;
            return this;
        }
        public String getSampleFmt() {
            return this.sampleFmt;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesStreamsAudioStreamListAudioStream setChannelLayout(String channelLayout) {
            this.channelLayout = channelLayout;
            return this;
        }
        public String getChannelLayout() {
            return this.channelLayout;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesStreamsAudioStreamListAudioStream setLang(String lang) {
            this.lang = lang;
            return this;
        }
        public String getLang() {
            return this.lang;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesStreamsAudioStreamListAudioStream setSamplerate(String samplerate) {
            this.samplerate = samplerate;
            return this;
        }
        public String getSamplerate() {
            return this.samplerate;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesStreamsAudioStreamListAudioStream setCodecLongName(String codecLongName) {
            this.codecLongName = codecLongName;
            return this;
        }
        public String getCodecLongName() {
            return this.codecLongName;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesStreamsAudioStreamListAudioStream setChannels(String channels) {
            this.channels = channels;
            return this;
        }
        public String getChannels() {
            return this.channels;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesStreamsAudioStreamListAudioStream setNumFrames(String numFrames) {
            this.numFrames = numFrames;
            return this;
        }
        public String getNumFrames() {
            return this.numFrames;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesStreamsAudioStreamListAudioStream setBitrate(String bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public String getBitrate() {
            return this.bitrate;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesStreamsAudioStreamListAudioStream setCodecTagString(String codecTagString) {
            this.codecTagString = codecTagString;
            return this;
        }
        public String getCodecTagString() {
            return this.codecTagString;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesStreamsAudioStreamListAudioStream setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesStreamsAudioStreamListAudioStream setCodecName(String codecName) {
            this.codecName = codecName;
            return this;
        }
        public String getCodecName() {
            return this.codecName;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesStreamsAudioStreamListAudioStream setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesStreamsAudioStreamListAudioStream setCodecTag(String codecTag) {
            this.codecTag = codecTag;
            return this;
        }
        public String getCodecTag() {
            return this.codecTag;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesStreamsAudioStreamListAudioStream setCodecTimeBase(String codecTimeBase) {
            this.codecTimeBase = codecTimeBase;
            return this;
        }
        public String getCodecTimeBase() {
            return this.codecTimeBase;
        }

    }

    public static class SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesStreamsAudioStreamList extends TeaModel {
        @NameInMap("AudioStream")
        public java.util.List<SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesStreamsAudioStreamListAudioStream> audioStream;

        public static SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesStreamsAudioStreamList build(java.util.Map<String, ?> map) throws Exception {
            SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesStreamsAudioStreamList self = new SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesStreamsAudioStreamList();
            return TeaModel.build(map, self);
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesStreamsAudioStreamList setAudioStream(java.util.List<SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesStreamsAudioStreamListAudioStream> audioStream) {
            this.audioStream = audioStream;
            return this;
        }
        public java.util.List<SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesStreamsAudioStreamListAudioStream> getAudioStream() {
            return this.audioStream;
        }

    }

    public static class SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesStreamsSubtitleStreamListSubtitleStream extends TeaModel {
        @NameInMap("Timebase")
        public String timebase;

        @NameInMap("Index")
        public String index;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("CodecName")
        public String codecName;

        @NameInMap("Lang")
        public String lang;

        @NameInMap("CodecLongName")
        public String codecLongName;

        @NameInMap("Duration")
        public String duration;

        @NameInMap("CodecTag")
        public String codecTag;

        @NameInMap("CodecTimeBase")
        public String codecTimeBase;

        @NameInMap("CodecTagString")
        public String codecTagString;

        public static SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesStreamsSubtitleStreamListSubtitleStream build(java.util.Map<String, ?> map) throws Exception {
            SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesStreamsSubtitleStreamListSubtitleStream self = new SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesStreamsSubtitleStreamListSubtitleStream();
            return TeaModel.build(map, self);
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesStreamsSubtitleStreamListSubtitleStream setTimebase(String timebase) {
            this.timebase = timebase;
            return this;
        }
        public String getTimebase() {
            return this.timebase;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesStreamsSubtitleStreamListSubtitleStream setIndex(String index) {
            this.index = index;
            return this;
        }
        public String getIndex() {
            return this.index;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesStreamsSubtitleStreamListSubtitleStream setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesStreamsSubtitleStreamListSubtitleStream setCodecName(String codecName) {
            this.codecName = codecName;
            return this;
        }
        public String getCodecName() {
            return this.codecName;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesStreamsSubtitleStreamListSubtitleStream setLang(String lang) {
            this.lang = lang;
            return this;
        }
        public String getLang() {
            return this.lang;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesStreamsSubtitleStreamListSubtitleStream setCodecLongName(String codecLongName) {
            this.codecLongName = codecLongName;
            return this;
        }
        public String getCodecLongName() {
            return this.codecLongName;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesStreamsSubtitleStreamListSubtitleStream setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesStreamsSubtitleStreamListSubtitleStream setCodecTag(String codecTag) {
            this.codecTag = codecTag;
            return this;
        }
        public String getCodecTag() {
            return this.codecTag;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesStreamsSubtitleStreamListSubtitleStream setCodecTimeBase(String codecTimeBase) {
            this.codecTimeBase = codecTimeBase;
            return this;
        }
        public String getCodecTimeBase() {
            return this.codecTimeBase;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesStreamsSubtitleStreamListSubtitleStream setCodecTagString(String codecTagString) {
            this.codecTagString = codecTagString;
            return this;
        }
        public String getCodecTagString() {
            return this.codecTagString;
        }

    }

    public static class SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesStreamsSubtitleStreamList extends TeaModel {
        @NameInMap("SubtitleStream")
        public java.util.List<SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesStreamsSubtitleStreamListSubtitleStream> subtitleStream;

        public static SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesStreamsSubtitleStreamList build(java.util.Map<String, ?> map) throws Exception {
            SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesStreamsSubtitleStreamList self = new SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesStreamsSubtitleStreamList();
            return TeaModel.build(map, self);
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesStreamsSubtitleStreamList setSubtitleStream(java.util.List<SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesStreamsSubtitleStreamListSubtitleStream> subtitleStream) {
            this.subtitleStream = subtitleStream;
            return this;
        }
        public java.util.List<SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesStreamsSubtitleStreamListSubtitleStream> getSubtitleStream() {
            return this.subtitleStream;
        }

    }

    public static class SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesStreams extends TeaModel {
        @NameInMap("VideoStreamList")
        public SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesStreamsVideoStreamList videoStreamList;

        @NameInMap("AudioStreamList")
        public SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesStreamsAudioStreamList audioStreamList;

        @NameInMap("SubtitleStreamList")
        public SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesStreamsSubtitleStreamList subtitleStreamList;

        public static SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesStreams build(java.util.Map<String, ?> map) throws Exception {
            SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesStreams self = new SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesStreams();
            return TeaModel.build(map, self);
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesStreams setVideoStreamList(SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesStreamsVideoStreamList videoStreamList) {
            this.videoStreamList = videoStreamList;
            return this;
        }
        public SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesStreamsVideoStreamList getVideoStreamList() {
            return this.videoStreamList;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesStreams setAudioStreamList(SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesStreamsAudioStreamList audioStreamList) {
            this.audioStreamList = audioStreamList;
            return this;
        }
        public SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesStreamsAudioStreamList getAudioStreamList() {
            return this.audioStreamList;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesStreams setSubtitleStreamList(SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesStreamsSubtitleStreamList subtitleStreamList) {
            this.subtitleStreamList = subtitleStreamList;
            return this;
        }
        public SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesStreamsSubtitleStreamList getSubtitleStreamList() {
            return this.subtitleStreamList;
        }

    }

    public static class SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesFormat extends TeaModel {
        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("NumPrograms")
        public String numPrograms;

        @NameInMap("Size")
        public String size;

        @NameInMap("NumStreams")
        public String numStreams;

        @NameInMap("FormatLongName")
        public String formatLongName;

        @NameInMap("Duration")
        public String duration;

        @NameInMap("Bitrate")
        public String bitrate;

        @NameInMap("FormatName")
        public String formatName;

        public static SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesFormat build(java.util.Map<String, ?> map) throws Exception {
            SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesFormat self = new SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesFormat();
            return TeaModel.build(map, self);
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesFormat setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesFormat setNumPrograms(String numPrograms) {
            this.numPrograms = numPrograms;
            return this;
        }
        public String getNumPrograms() {
            return this.numPrograms;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesFormat setSize(String size) {
            this.size = size;
            return this;
        }
        public String getSize() {
            return this.size;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesFormat setNumStreams(String numStreams) {
            this.numStreams = numStreams;
            return this;
        }
        public String getNumStreams() {
            return this.numStreams;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesFormat setFormatLongName(String formatLongName) {
            this.formatLongName = formatLongName;
            return this;
        }
        public String getFormatLongName() {
            return this.formatLongName;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesFormat setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesFormat setBitrate(String bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public String getBitrate() {
            return this.bitrate;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesFormat setFormatName(String formatName) {
            this.formatName = formatName;
            return this;
        }
        public String getFormatName() {
            return this.formatName;
        }

    }

    public static class SubmitMediaInfoJobResponseBodyMediaInfoJobProperties extends TeaModel {
        @NameInMap("Width")
        public String width;

        @NameInMap("Height")
        public String height;

        @NameInMap("Duration")
        public String duration;

        @NameInMap("Fps")
        public String fps;

        @NameInMap("Bitrate")
        public String bitrate;

        @NameInMap("FileFormat")
        public String fileFormat;

        @NameInMap("Streams")
        public SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesStreams streams;

        @NameInMap("Format")
        public SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesFormat format;

        @NameInMap("FileSize")
        public String fileSize;

        public static SubmitMediaInfoJobResponseBodyMediaInfoJobProperties build(java.util.Map<String, ?> map) throws Exception {
            SubmitMediaInfoJobResponseBodyMediaInfoJobProperties self = new SubmitMediaInfoJobResponseBodyMediaInfoJobProperties();
            return TeaModel.build(map, self);
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobProperties setWidth(String width) {
            this.width = width;
            return this;
        }
        public String getWidth() {
            return this.width;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobProperties setHeight(String height) {
            this.height = height;
            return this;
        }
        public String getHeight() {
            return this.height;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobProperties setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobProperties setFps(String fps) {
            this.fps = fps;
            return this;
        }
        public String getFps() {
            return this.fps;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobProperties setBitrate(String bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public String getBitrate() {
            return this.bitrate;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobProperties setFileFormat(String fileFormat) {
            this.fileFormat = fileFormat;
            return this;
        }
        public String getFileFormat() {
            return this.fileFormat;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobProperties setStreams(SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesStreams streams) {
            this.streams = streams;
            return this;
        }
        public SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesStreams getStreams() {
            return this.streams;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobProperties setFormat(SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesFormat format) {
            this.format = format;
            return this;
        }
        public SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesFormat getFormat() {
            return this.format;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobProperties setFileSize(String fileSize) {
            this.fileSize = fileSize;
            return this;
        }
        public String getFileSize() {
            return this.fileSize;
        }

    }

    public static class SubmitMediaInfoJobResponseBodyMediaInfoJob extends TeaModel {
        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("State")
        public String state;

        @NameInMap("JobId")
        public String jobId;

        @NameInMap("UserData")
        public String userData;

        @NameInMap("Code")
        public String code;

        @NameInMap("Message")
        public String message;

        @NameInMap("PipelineId")
        public String pipelineId;

        @NameInMap("Async")
        public Boolean async;

        @NameInMap("Input")
        public SubmitMediaInfoJobResponseBodyMediaInfoJobInput input;

        @NameInMap("MNSMessageResult")
        public SubmitMediaInfoJobResponseBodyMediaInfoJobMNSMessageResult MNSMessageResult;

        @NameInMap("Properties")
        public SubmitMediaInfoJobResponseBodyMediaInfoJobProperties properties;

        public static SubmitMediaInfoJobResponseBodyMediaInfoJob build(java.util.Map<String, ?> map) throws Exception {
            SubmitMediaInfoJobResponseBodyMediaInfoJob self = new SubmitMediaInfoJobResponseBodyMediaInfoJob();
            return TeaModel.build(map, self);
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJob setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJob setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJob setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJob setUserData(String userData) {
            this.userData = userData;
            return this;
        }
        public String getUserData() {
            return this.userData;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJob setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJob setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJob setPipelineId(String pipelineId) {
            this.pipelineId = pipelineId;
            return this;
        }
        public String getPipelineId() {
            return this.pipelineId;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJob setAsync(Boolean async) {
            this.async = async;
            return this;
        }
        public Boolean getAsync() {
            return this.async;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJob setInput(SubmitMediaInfoJobResponseBodyMediaInfoJobInput input) {
            this.input = input;
            return this;
        }
        public SubmitMediaInfoJobResponseBodyMediaInfoJobInput getInput() {
            return this.input;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJob setMNSMessageResult(SubmitMediaInfoJobResponseBodyMediaInfoJobMNSMessageResult MNSMessageResult) {
            this.MNSMessageResult = MNSMessageResult;
            return this;
        }
        public SubmitMediaInfoJobResponseBodyMediaInfoJobMNSMessageResult getMNSMessageResult() {
            return this.MNSMessageResult;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJob setProperties(SubmitMediaInfoJobResponseBodyMediaInfoJobProperties properties) {
            this.properties = properties;
            return this;
        }
        public SubmitMediaInfoJobResponseBodyMediaInfoJobProperties getProperties() {
            return this.properties;
        }

    }

}
