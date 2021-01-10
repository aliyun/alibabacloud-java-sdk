// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class QueryMediaListByURLResponseBody extends TeaModel {
    @NameInMap("MediaList")
    public QueryMediaListByURLResponseBodyMediaList mediaList;

    @NameInMap("NonExistFileURLs")
    public QueryMediaListByURLResponseBodyNonExistFileURLs nonExistFileURLs;

    @NameInMap("RequestId")
    public String requestId;

    public static QueryMediaListByURLResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryMediaListByURLResponseBody self = new QueryMediaListByURLResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryMediaListByURLResponseBody setMediaList(QueryMediaListByURLResponseBodyMediaList mediaList) {
        this.mediaList = mediaList;
        return this;
    }
    public QueryMediaListByURLResponseBodyMediaList getMediaList() {
        return this.mediaList;
    }

    public QueryMediaListByURLResponseBody setNonExistFileURLs(QueryMediaListByURLResponseBodyNonExistFileURLs nonExistFileURLs) {
        this.nonExistFileURLs = nonExistFileURLs;
        return this;
    }
    public QueryMediaListByURLResponseBodyNonExistFileURLs getNonExistFileURLs() {
        return this.nonExistFileURLs;
    }

    public QueryMediaListByURLResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class QueryMediaListByURLResponseBodyMediaListMediaTags extends TeaModel {
        @NameInMap("Tag")
        public java.util.List<String> tag;

        public static QueryMediaListByURLResponseBodyMediaListMediaTags build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaListByURLResponseBodyMediaListMediaTags self = new QueryMediaListByURLResponseBodyMediaListMediaTags();
            return TeaModel.build(map, self);
        }

        public QueryMediaListByURLResponseBodyMediaListMediaTags setTag(java.util.List<String> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<String> getTag() {
            return this.tag;
        }

    }

    public static class QueryMediaListByURLResponseBodyMediaListMediaPlayListPlayFile extends TeaModel {
        @NameInMap("State")
        public String state;

        @NameInMap("URL")
        public String URL;

        public static QueryMediaListByURLResponseBodyMediaListMediaPlayListPlayFile build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaListByURLResponseBodyMediaListMediaPlayListPlayFile self = new QueryMediaListByURLResponseBodyMediaListMediaPlayListPlayFile();
            return TeaModel.build(map, self);
        }

        public QueryMediaListByURLResponseBodyMediaListMediaPlayListPlayFile setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public QueryMediaListByURLResponseBodyMediaListMediaPlayListPlayFile setURL(String URL) {
            this.URL = URL;
            return this;
        }
        public String getURL() {
            return this.URL;
        }

    }

    public static class QueryMediaListByURLResponseBodyMediaListMediaPlayListPlay extends TeaModel {
        @NameInMap("Encryption")
        public String encryption;

        @NameInMap("Height")
        public String height;

        @NameInMap("Bitrate")
        public String bitrate;

        @NameInMap("File")
        public QueryMediaListByURLResponseBodyMediaListMediaPlayListPlayFile file;

        @NameInMap("MediaWorkflowId")
        public String mediaWorkflowId;

        @NameInMap("Width")
        public String width;

        @NameInMap("Size")
        public String size;

        @NameInMap("Fps")
        public String fps;

        @NameInMap("Duration")
        public String duration;

        @NameInMap("ActivityName")
        public String activityName;

        @NameInMap("Format")
        public String format;

        @NameInMap("MediaWorkflowName")
        public String mediaWorkflowName;

        public static QueryMediaListByURLResponseBodyMediaListMediaPlayListPlay build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaListByURLResponseBodyMediaListMediaPlayListPlay self = new QueryMediaListByURLResponseBodyMediaListMediaPlayListPlay();
            return TeaModel.build(map, self);
        }

        public QueryMediaListByURLResponseBodyMediaListMediaPlayListPlay setEncryption(String encryption) {
            this.encryption = encryption;
            return this;
        }
        public String getEncryption() {
            return this.encryption;
        }

        public QueryMediaListByURLResponseBodyMediaListMediaPlayListPlay setHeight(String height) {
            this.height = height;
            return this;
        }
        public String getHeight() {
            return this.height;
        }

        public QueryMediaListByURLResponseBodyMediaListMediaPlayListPlay setBitrate(String bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public String getBitrate() {
            return this.bitrate;
        }

        public QueryMediaListByURLResponseBodyMediaListMediaPlayListPlay setFile(QueryMediaListByURLResponseBodyMediaListMediaPlayListPlayFile file) {
            this.file = file;
            return this;
        }
        public QueryMediaListByURLResponseBodyMediaListMediaPlayListPlayFile getFile() {
            return this.file;
        }

        public QueryMediaListByURLResponseBodyMediaListMediaPlayListPlay setMediaWorkflowId(String mediaWorkflowId) {
            this.mediaWorkflowId = mediaWorkflowId;
            return this;
        }
        public String getMediaWorkflowId() {
            return this.mediaWorkflowId;
        }

        public QueryMediaListByURLResponseBodyMediaListMediaPlayListPlay setWidth(String width) {
            this.width = width;
            return this;
        }
        public String getWidth() {
            return this.width;
        }

        public QueryMediaListByURLResponseBodyMediaListMediaPlayListPlay setSize(String size) {
            this.size = size;
            return this;
        }
        public String getSize() {
            return this.size;
        }

        public QueryMediaListByURLResponseBodyMediaListMediaPlayListPlay setFps(String fps) {
            this.fps = fps;
            return this;
        }
        public String getFps() {
            return this.fps;
        }

        public QueryMediaListByURLResponseBodyMediaListMediaPlayListPlay setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public QueryMediaListByURLResponseBodyMediaListMediaPlayListPlay setActivityName(String activityName) {
            this.activityName = activityName;
            return this;
        }
        public String getActivityName() {
            return this.activityName;
        }

        public QueryMediaListByURLResponseBodyMediaListMediaPlayListPlay setFormat(String format) {
            this.format = format;
            return this;
        }
        public String getFormat() {
            return this.format;
        }

        public QueryMediaListByURLResponseBodyMediaListMediaPlayListPlay setMediaWorkflowName(String mediaWorkflowName) {
            this.mediaWorkflowName = mediaWorkflowName;
            return this;
        }
        public String getMediaWorkflowName() {
            return this.mediaWorkflowName;
        }

    }

    public static class QueryMediaListByURLResponseBodyMediaListMediaPlayList extends TeaModel {
        @NameInMap("Play")
        public java.util.List<QueryMediaListByURLResponseBodyMediaListMediaPlayListPlay> play;

        public static QueryMediaListByURLResponseBodyMediaListMediaPlayList build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaListByURLResponseBodyMediaListMediaPlayList self = new QueryMediaListByURLResponseBodyMediaListMediaPlayList();
            return TeaModel.build(map, self);
        }

        public QueryMediaListByURLResponseBodyMediaListMediaPlayList setPlay(java.util.List<QueryMediaListByURLResponseBodyMediaListMediaPlayListPlay> play) {
            this.play = play;
            return this;
        }
        public java.util.List<QueryMediaListByURLResponseBodyMediaListMediaPlayListPlay> getPlay() {
            return this.play;
        }

    }

    public static class QueryMediaListByURLResponseBodyMediaListMediaFile extends TeaModel {
        @NameInMap("State")
        public String state;

        @NameInMap("URL")
        public String URL;

        public static QueryMediaListByURLResponseBodyMediaListMediaFile build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaListByURLResponseBodyMediaListMediaFile self = new QueryMediaListByURLResponseBodyMediaListMediaFile();
            return TeaModel.build(map, self);
        }

        public QueryMediaListByURLResponseBodyMediaListMediaFile setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public QueryMediaListByURLResponseBodyMediaListMediaFile setURL(String URL) {
            this.URL = URL;
            return this;
        }
        public String getURL() {
            return this.URL;
        }

    }

    public static class QueryMediaListByURLResponseBodyMediaListMediaSummaryListSummaryFile extends TeaModel {
        @NameInMap("State")
        public String state;

        @NameInMap("URL")
        public String URL;

        public static QueryMediaListByURLResponseBodyMediaListMediaSummaryListSummaryFile build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaListByURLResponseBodyMediaListMediaSummaryListSummaryFile self = new QueryMediaListByURLResponseBodyMediaListMediaSummaryListSummaryFile();
            return TeaModel.build(map, self);
        }

        public QueryMediaListByURLResponseBodyMediaListMediaSummaryListSummaryFile setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public QueryMediaListByURLResponseBodyMediaListMediaSummaryListSummaryFile setURL(String URL) {
            this.URL = URL;
            return this;
        }
        public String getURL() {
            return this.URL;
        }

    }

    public static class QueryMediaListByURLResponseBodyMediaListMediaSummaryListSummary extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("MediaWorkflowId")
        public String mediaWorkflowId;

        @NameInMap("ActivityName")
        public String activityName;

        @NameInMap("MediaWorkflowName")
        public String mediaWorkflowName;

        @NameInMap("File")
        public QueryMediaListByURLResponseBodyMediaListMediaSummaryListSummaryFile file;

        public static QueryMediaListByURLResponseBodyMediaListMediaSummaryListSummary build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaListByURLResponseBodyMediaListMediaSummaryListSummary self = new QueryMediaListByURLResponseBodyMediaListMediaSummaryListSummary();
            return TeaModel.build(map, self);
        }

        public QueryMediaListByURLResponseBodyMediaListMediaSummaryListSummary setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public QueryMediaListByURLResponseBodyMediaListMediaSummaryListSummary setMediaWorkflowId(String mediaWorkflowId) {
            this.mediaWorkflowId = mediaWorkflowId;
            return this;
        }
        public String getMediaWorkflowId() {
            return this.mediaWorkflowId;
        }

        public QueryMediaListByURLResponseBodyMediaListMediaSummaryListSummary setActivityName(String activityName) {
            this.activityName = activityName;
            return this;
        }
        public String getActivityName() {
            return this.activityName;
        }

        public QueryMediaListByURLResponseBodyMediaListMediaSummaryListSummary setMediaWorkflowName(String mediaWorkflowName) {
            this.mediaWorkflowName = mediaWorkflowName;
            return this;
        }
        public String getMediaWorkflowName() {
            return this.mediaWorkflowName;
        }

        public QueryMediaListByURLResponseBodyMediaListMediaSummaryListSummary setFile(QueryMediaListByURLResponseBodyMediaListMediaSummaryListSummaryFile file) {
            this.file = file;
            return this;
        }
        public QueryMediaListByURLResponseBodyMediaListMediaSummaryListSummaryFile getFile() {
            return this.file;
        }

    }

    public static class QueryMediaListByURLResponseBodyMediaListMediaSummaryList extends TeaModel {
        @NameInMap("Summary")
        public java.util.List<QueryMediaListByURLResponseBodyMediaListMediaSummaryListSummary> summary;

        public static QueryMediaListByURLResponseBodyMediaListMediaSummaryList build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaListByURLResponseBodyMediaListMediaSummaryList self = new QueryMediaListByURLResponseBodyMediaListMediaSummaryList();
            return TeaModel.build(map, self);
        }

        public QueryMediaListByURLResponseBodyMediaListMediaSummaryList setSummary(java.util.List<QueryMediaListByURLResponseBodyMediaListMediaSummaryListSummary> summary) {
            this.summary = summary;
            return this;
        }
        public java.util.List<QueryMediaListByURLResponseBodyMediaListMediaSummaryListSummary> getSummary() {
            return this.summary;
        }

    }

    public static class QueryMediaListByURLResponseBodyMediaListMediaMediaInfoStreamsVideoStreamListVideoStreamNetworkCost extends TeaModel {
        @NameInMap("PreloadTime")
        public String preloadTime;

        @NameInMap("AvgBitrate")
        public String avgBitrate;

        @NameInMap("CostBandwidth")
        public String costBandwidth;

        public static QueryMediaListByURLResponseBodyMediaListMediaMediaInfoStreamsVideoStreamListVideoStreamNetworkCost build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaListByURLResponseBodyMediaListMediaMediaInfoStreamsVideoStreamListVideoStreamNetworkCost self = new QueryMediaListByURLResponseBodyMediaListMediaMediaInfoStreamsVideoStreamListVideoStreamNetworkCost();
            return TeaModel.build(map, self);
        }

        public QueryMediaListByURLResponseBodyMediaListMediaMediaInfoStreamsVideoStreamListVideoStreamNetworkCost setPreloadTime(String preloadTime) {
            this.preloadTime = preloadTime;
            return this;
        }
        public String getPreloadTime() {
            return this.preloadTime;
        }

        public QueryMediaListByURLResponseBodyMediaListMediaMediaInfoStreamsVideoStreamListVideoStreamNetworkCost setAvgBitrate(String avgBitrate) {
            this.avgBitrate = avgBitrate;
            return this;
        }
        public String getAvgBitrate() {
            return this.avgBitrate;
        }

        public QueryMediaListByURLResponseBodyMediaListMediaMediaInfoStreamsVideoStreamListVideoStreamNetworkCost setCostBandwidth(String costBandwidth) {
            this.costBandwidth = costBandwidth;
            return this;
        }
        public String getCostBandwidth() {
            return this.costBandwidth;
        }

    }

    public static class QueryMediaListByURLResponseBodyMediaListMediaMediaInfoStreamsVideoStreamListVideoStream extends TeaModel {
        @NameInMap("Sar")
        public String sar;

        @NameInMap("Height")
        public String height;

        @NameInMap("CodecTagString")
        public String codecTagString;

        @NameInMap("NetworkCost")
        public QueryMediaListByURLResponseBodyMediaListMediaMediaInfoStreamsVideoStreamListVideoStreamNetworkCost networkCost;

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

        public static QueryMediaListByURLResponseBodyMediaListMediaMediaInfoStreamsVideoStreamListVideoStream build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaListByURLResponseBodyMediaListMediaMediaInfoStreamsVideoStreamListVideoStream self = new QueryMediaListByURLResponseBodyMediaListMediaMediaInfoStreamsVideoStreamListVideoStream();
            return TeaModel.build(map, self);
        }

        public QueryMediaListByURLResponseBodyMediaListMediaMediaInfoStreamsVideoStreamListVideoStream setSar(String sar) {
            this.sar = sar;
            return this;
        }
        public String getSar() {
            return this.sar;
        }

        public QueryMediaListByURLResponseBodyMediaListMediaMediaInfoStreamsVideoStreamListVideoStream setHeight(String height) {
            this.height = height;
            return this;
        }
        public String getHeight() {
            return this.height;
        }

        public QueryMediaListByURLResponseBodyMediaListMediaMediaInfoStreamsVideoStreamListVideoStream setCodecTagString(String codecTagString) {
            this.codecTagString = codecTagString;
            return this;
        }
        public String getCodecTagString() {
            return this.codecTagString;
        }

        public QueryMediaListByURLResponseBodyMediaListMediaMediaInfoStreamsVideoStreamListVideoStream setNetworkCost(QueryMediaListByURLResponseBodyMediaListMediaMediaInfoStreamsVideoStreamListVideoStreamNetworkCost networkCost) {
            this.networkCost = networkCost;
            return this;
        }
        public QueryMediaListByURLResponseBodyMediaListMediaMediaInfoStreamsVideoStreamListVideoStreamNetworkCost getNetworkCost() {
            return this.networkCost;
        }

        public QueryMediaListByURLResponseBodyMediaListMediaMediaInfoStreamsVideoStreamListVideoStream setWidth(String width) {
            this.width = width;
            return this;
        }
        public String getWidth() {
            return this.width;
        }

        public QueryMediaListByURLResponseBodyMediaListMediaMediaInfoStreamsVideoStreamListVideoStream setIndex(String index) {
            this.index = index;
            return this;
        }
        public String getIndex() {
            return this.index;
        }

        public QueryMediaListByURLResponseBodyMediaListMediaMediaInfoStreamsVideoStreamListVideoStream setTimebase(String timebase) {
            this.timebase = timebase;
            return this;
        }
        public String getTimebase() {
            return this.timebase;
        }

        public QueryMediaListByURLResponseBodyMediaListMediaMediaInfoStreamsVideoStreamListVideoStream setAvgFPS(String avgFPS) {
            this.avgFPS = avgFPS;
            return this;
        }
        public String getAvgFPS() {
            return this.avgFPS;
        }

        public QueryMediaListByURLResponseBodyMediaListMediaMediaInfoStreamsVideoStreamListVideoStream setPixFmt(String pixFmt) {
            this.pixFmt = pixFmt;
            return this;
        }
        public String getPixFmt() {
            return this.pixFmt;
        }

        public QueryMediaListByURLResponseBodyMediaListMediaMediaInfoStreamsVideoStreamListVideoStream setLang(String lang) {
            this.lang = lang;
            return this;
        }
        public String getLang() {
            return this.lang;
        }

        public QueryMediaListByURLResponseBodyMediaListMediaMediaInfoStreamsVideoStreamListVideoStream setCodecLongName(String codecLongName) {
            this.codecLongName = codecLongName;
            return this;
        }
        public String getCodecLongName() {
            return this.codecLongName;
        }

        public QueryMediaListByURLResponseBodyMediaListMediaMediaInfoStreamsVideoStreamListVideoStream setNumFrames(String numFrames) {
            this.numFrames = numFrames;
            return this;
        }
        public String getNumFrames() {
            return this.numFrames;
        }

        public QueryMediaListByURLResponseBodyMediaListMediaMediaInfoStreamsVideoStreamListVideoStream setRotate(String rotate) {
            this.rotate = rotate;
            return this;
        }
        public String getRotate() {
            return this.rotate;
        }

        public QueryMediaListByURLResponseBodyMediaListMediaMediaInfoStreamsVideoStreamListVideoStream setBitrate(String bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public String getBitrate() {
            return this.bitrate;
        }

        public QueryMediaListByURLResponseBodyMediaListMediaMediaInfoStreamsVideoStreamListVideoStream setHasBFrames(String hasBFrames) {
            this.hasBFrames = hasBFrames;
            return this;
        }
        public String getHasBFrames() {
            return this.hasBFrames;
        }

        public QueryMediaListByURLResponseBodyMediaListMediaMediaInfoStreamsVideoStreamListVideoStream setProfile(String profile) {
            this.profile = profile;
            return this;
        }
        public String getProfile() {
            return this.profile;
        }

        public QueryMediaListByURLResponseBodyMediaListMediaMediaInfoStreamsVideoStreamListVideoStream setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public QueryMediaListByURLResponseBodyMediaListMediaMediaInfoStreamsVideoStreamListVideoStream setDar(String dar) {
            this.dar = dar;
            return this;
        }
        public String getDar() {
            return this.dar;
        }

        public QueryMediaListByURLResponseBodyMediaListMediaMediaInfoStreamsVideoStreamListVideoStream setCodecName(String codecName) {
            this.codecName = codecName;
            return this;
        }
        public String getCodecName() {
            return this.codecName;
        }

        public QueryMediaListByURLResponseBodyMediaListMediaMediaInfoStreamsVideoStreamListVideoStream setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public QueryMediaListByURLResponseBodyMediaListMediaMediaInfoStreamsVideoStreamListVideoStream setFps(String fps) {
            this.fps = fps;
            return this;
        }
        public String getFps() {
            return this.fps;
        }

        public QueryMediaListByURLResponseBodyMediaListMediaMediaInfoStreamsVideoStreamListVideoStream setCodecTag(String codecTag) {
            this.codecTag = codecTag;
            return this;
        }
        public String getCodecTag() {
            return this.codecTag;
        }

        public QueryMediaListByURLResponseBodyMediaListMediaMediaInfoStreamsVideoStreamListVideoStream setCodecTimeBase(String codecTimeBase) {
            this.codecTimeBase = codecTimeBase;
            return this;
        }
        public String getCodecTimeBase() {
            return this.codecTimeBase;
        }

        public QueryMediaListByURLResponseBodyMediaListMediaMediaInfoStreamsVideoStreamListVideoStream setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

    }

    public static class QueryMediaListByURLResponseBodyMediaListMediaMediaInfoStreamsVideoStreamList extends TeaModel {
        @NameInMap("VideoStream")
        public java.util.List<QueryMediaListByURLResponseBodyMediaListMediaMediaInfoStreamsVideoStreamListVideoStream> videoStream;

        public static QueryMediaListByURLResponseBodyMediaListMediaMediaInfoStreamsVideoStreamList build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaListByURLResponseBodyMediaListMediaMediaInfoStreamsVideoStreamList self = new QueryMediaListByURLResponseBodyMediaListMediaMediaInfoStreamsVideoStreamList();
            return TeaModel.build(map, self);
        }

        public QueryMediaListByURLResponseBodyMediaListMediaMediaInfoStreamsVideoStreamList setVideoStream(java.util.List<QueryMediaListByURLResponseBodyMediaListMediaMediaInfoStreamsVideoStreamListVideoStream> videoStream) {
            this.videoStream = videoStream;
            return this;
        }
        public java.util.List<QueryMediaListByURLResponseBodyMediaListMediaMediaInfoStreamsVideoStreamListVideoStream> getVideoStream() {
            return this.videoStream;
        }

    }

    public static class QueryMediaListByURLResponseBodyMediaListMediaMediaInfoStreamsAudioStreamListAudioStream extends TeaModel {
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

        public static QueryMediaListByURLResponseBodyMediaListMediaMediaInfoStreamsAudioStreamListAudioStream build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaListByURLResponseBodyMediaListMediaMediaInfoStreamsAudioStreamListAudioStream self = new QueryMediaListByURLResponseBodyMediaListMediaMediaInfoStreamsAudioStreamListAudioStream();
            return TeaModel.build(map, self);
        }

        public QueryMediaListByURLResponseBodyMediaListMediaMediaInfoStreamsAudioStreamListAudioStream setTimebase(String timebase) {
            this.timebase = timebase;
            return this;
        }
        public String getTimebase() {
            return this.timebase;
        }

        public QueryMediaListByURLResponseBodyMediaListMediaMediaInfoStreamsAudioStreamListAudioStream setIndex(String index) {
            this.index = index;
            return this;
        }
        public String getIndex() {
            return this.index;
        }

        public QueryMediaListByURLResponseBodyMediaListMediaMediaInfoStreamsAudioStreamListAudioStream setSampleFmt(String sampleFmt) {
            this.sampleFmt = sampleFmt;
            return this;
        }
        public String getSampleFmt() {
            return this.sampleFmt;
        }

        public QueryMediaListByURLResponseBodyMediaListMediaMediaInfoStreamsAudioStreamListAudioStream setChannelLayout(String channelLayout) {
            this.channelLayout = channelLayout;
            return this;
        }
        public String getChannelLayout() {
            return this.channelLayout;
        }

        public QueryMediaListByURLResponseBodyMediaListMediaMediaInfoStreamsAudioStreamListAudioStream setLang(String lang) {
            this.lang = lang;
            return this;
        }
        public String getLang() {
            return this.lang;
        }

        public QueryMediaListByURLResponseBodyMediaListMediaMediaInfoStreamsAudioStreamListAudioStream setSamplerate(String samplerate) {
            this.samplerate = samplerate;
            return this;
        }
        public String getSamplerate() {
            return this.samplerate;
        }

        public QueryMediaListByURLResponseBodyMediaListMediaMediaInfoStreamsAudioStreamListAudioStream setCodecLongName(String codecLongName) {
            this.codecLongName = codecLongName;
            return this;
        }
        public String getCodecLongName() {
            return this.codecLongName;
        }

        public QueryMediaListByURLResponseBodyMediaListMediaMediaInfoStreamsAudioStreamListAudioStream setChannels(String channels) {
            this.channels = channels;
            return this;
        }
        public String getChannels() {
            return this.channels;
        }

        public QueryMediaListByURLResponseBodyMediaListMediaMediaInfoStreamsAudioStreamListAudioStream setNumFrames(String numFrames) {
            this.numFrames = numFrames;
            return this;
        }
        public String getNumFrames() {
            return this.numFrames;
        }

        public QueryMediaListByURLResponseBodyMediaListMediaMediaInfoStreamsAudioStreamListAudioStream setBitrate(String bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public String getBitrate() {
            return this.bitrate;
        }

        public QueryMediaListByURLResponseBodyMediaListMediaMediaInfoStreamsAudioStreamListAudioStream setCodecTagString(String codecTagString) {
            this.codecTagString = codecTagString;
            return this;
        }
        public String getCodecTagString() {
            return this.codecTagString;
        }

        public QueryMediaListByURLResponseBodyMediaListMediaMediaInfoStreamsAudioStreamListAudioStream setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public QueryMediaListByURLResponseBodyMediaListMediaMediaInfoStreamsAudioStreamListAudioStream setCodecName(String codecName) {
            this.codecName = codecName;
            return this;
        }
        public String getCodecName() {
            return this.codecName;
        }

        public QueryMediaListByURLResponseBodyMediaListMediaMediaInfoStreamsAudioStreamListAudioStream setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public QueryMediaListByURLResponseBodyMediaListMediaMediaInfoStreamsAudioStreamListAudioStream setCodecTag(String codecTag) {
            this.codecTag = codecTag;
            return this;
        }
        public String getCodecTag() {
            return this.codecTag;
        }

        public QueryMediaListByURLResponseBodyMediaListMediaMediaInfoStreamsAudioStreamListAudioStream setCodecTimeBase(String codecTimeBase) {
            this.codecTimeBase = codecTimeBase;
            return this;
        }
        public String getCodecTimeBase() {
            return this.codecTimeBase;
        }

    }

    public static class QueryMediaListByURLResponseBodyMediaListMediaMediaInfoStreamsAudioStreamList extends TeaModel {
        @NameInMap("AudioStream")
        public java.util.List<QueryMediaListByURLResponseBodyMediaListMediaMediaInfoStreamsAudioStreamListAudioStream> audioStream;

        public static QueryMediaListByURLResponseBodyMediaListMediaMediaInfoStreamsAudioStreamList build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaListByURLResponseBodyMediaListMediaMediaInfoStreamsAudioStreamList self = new QueryMediaListByURLResponseBodyMediaListMediaMediaInfoStreamsAudioStreamList();
            return TeaModel.build(map, self);
        }

        public QueryMediaListByURLResponseBodyMediaListMediaMediaInfoStreamsAudioStreamList setAudioStream(java.util.List<QueryMediaListByURLResponseBodyMediaListMediaMediaInfoStreamsAudioStreamListAudioStream> audioStream) {
            this.audioStream = audioStream;
            return this;
        }
        public java.util.List<QueryMediaListByURLResponseBodyMediaListMediaMediaInfoStreamsAudioStreamListAudioStream> getAudioStream() {
            return this.audioStream;
        }

    }

    public static class QueryMediaListByURLResponseBodyMediaListMediaMediaInfoStreamsSubtitleStreamListSubtitleStream extends TeaModel {
        @NameInMap("Index")
        public String index;

        @NameInMap("Lang")
        public String lang;

        public static QueryMediaListByURLResponseBodyMediaListMediaMediaInfoStreamsSubtitleStreamListSubtitleStream build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaListByURLResponseBodyMediaListMediaMediaInfoStreamsSubtitleStreamListSubtitleStream self = new QueryMediaListByURLResponseBodyMediaListMediaMediaInfoStreamsSubtitleStreamListSubtitleStream();
            return TeaModel.build(map, self);
        }

        public QueryMediaListByURLResponseBodyMediaListMediaMediaInfoStreamsSubtitleStreamListSubtitleStream setIndex(String index) {
            this.index = index;
            return this;
        }
        public String getIndex() {
            return this.index;
        }

        public QueryMediaListByURLResponseBodyMediaListMediaMediaInfoStreamsSubtitleStreamListSubtitleStream setLang(String lang) {
            this.lang = lang;
            return this;
        }
        public String getLang() {
            return this.lang;
        }

    }

    public static class QueryMediaListByURLResponseBodyMediaListMediaMediaInfoStreamsSubtitleStreamList extends TeaModel {
        @NameInMap("SubtitleStream")
        public java.util.List<QueryMediaListByURLResponseBodyMediaListMediaMediaInfoStreamsSubtitleStreamListSubtitleStream> subtitleStream;

        public static QueryMediaListByURLResponseBodyMediaListMediaMediaInfoStreamsSubtitleStreamList build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaListByURLResponseBodyMediaListMediaMediaInfoStreamsSubtitleStreamList self = new QueryMediaListByURLResponseBodyMediaListMediaMediaInfoStreamsSubtitleStreamList();
            return TeaModel.build(map, self);
        }

        public QueryMediaListByURLResponseBodyMediaListMediaMediaInfoStreamsSubtitleStreamList setSubtitleStream(java.util.List<QueryMediaListByURLResponseBodyMediaListMediaMediaInfoStreamsSubtitleStreamListSubtitleStream> subtitleStream) {
            this.subtitleStream = subtitleStream;
            return this;
        }
        public java.util.List<QueryMediaListByURLResponseBodyMediaListMediaMediaInfoStreamsSubtitleStreamListSubtitleStream> getSubtitleStream() {
            return this.subtitleStream;
        }

    }

    public static class QueryMediaListByURLResponseBodyMediaListMediaMediaInfoStreams extends TeaModel {
        @NameInMap("VideoStreamList")
        public QueryMediaListByURLResponseBodyMediaListMediaMediaInfoStreamsVideoStreamList videoStreamList;

        @NameInMap("AudioStreamList")
        public QueryMediaListByURLResponseBodyMediaListMediaMediaInfoStreamsAudioStreamList audioStreamList;

        @NameInMap("SubtitleStreamList")
        public QueryMediaListByURLResponseBodyMediaListMediaMediaInfoStreamsSubtitleStreamList subtitleStreamList;

        public static QueryMediaListByURLResponseBodyMediaListMediaMediaInfoStreams build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaListByURLResponseBodyMediaListMediaMediaInfoStreams self = new QueryMediaListByURLResponseBodyMediaListMediaMediaInfoStreams();
            return TeaModel.build(map, self);
        }

        public QueryMediaListByURLResponseBodyMediaListMediaMediaInfoStreams setVideoStreamList(QueryMediaListByURLResponseBodyMediaListMediaMediaInfoStreamsVideoStreamList videoStreamList) {
            this.videoStreamList = videoStreamList;
            return this;
        }
        public QueryMediaListByURLResponseBodyMediaListMediaMediaInfoStreamsVideoStreamList getVideoStreamList() {
            return this.videoStreamList;
        }

        public QueryMediaListByURLResponseBodyMediaListMediaMediaInfoStreams setAudioStreamList(QueryMediaListByURLResponseBodyMediaListMediaMediaInfoStreamsAudioStreamList audioStreamList) {
            this.audioStreamList = audioStreamList;
            return this;
        }
        public QueryMediaListByURLResponseBodyMediaListMediaMediaInfoStreamsAudioStreamList getAudioStreamList() {
            return this.audioStreamList;
        }

        public QueryMediaListByURLResponseBodyMediaListMediaMediaInfoStreams setSubtitleStreamList(QueryMediaListByURLResponseBodyMediaListMediaMediaInfoStreamsSubtitleStreamList subtitleStreamList) {
            this.subtitleStreamList = subtitleStreamList;
            return this;
        }
        public QueryMediaListByURLResponseBodyMediaListMediaMediaInfoStreamsSubtitleStreamList getSubtitleStreamList() {
            return this.subtitleStreamList;
        }

    }

    public static class QueryMediaListByURLResponseBodyMediaListMediaMediaInfoFormat extends TeaModel {
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

        public static QueryMediaListByURLResponseBodyMediaListMediaMediaInfoFormat build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaListByURLResponseBodyMediaListMediaMediaInfoFormat self = new QueryMediaListByURLResponseBodyMediaListMediaMediaInfoFormat();
            return TeaModel.build(map, self);
        }

        public QueryMediaListByURLResponseBodyMediaListMediaMediaInfoFormat setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public QueryMediaListByURLResponseBodyMediaListMediaMediaInfoFormat setNumPrograms(String numPrograms) {
            this.numPrograms = numPrograms;
            return this;
        }
        public String getNumPrograms() {
            return this.numPrograms;
        }

        public QueryMediaListByURLResponseBodyMediaListMediaMediaInfoFormat setSize(String size) {
            this.size = size;
            return this;
        }
        public String getSize() {
            return this.size;
        }

        public QueryMediaListByURLResponseBodyMediaListMediaMediaInfoFormat setNumStreams(String numStreams) {
            this.numStreams = numStreams;
            return this;
        }
        public String getNumStreams() {
            return this.numStreams;
        }

        public QueryMediaListByURLResponseBodyMediaListMediaMediaInfoFormat setFormatLongName(String formatLongName) {
            this.formatLongName = formatLongName;
            return this;
        }
        public String getFormatLongName() {
            return this.formatLongName;
        }

        public QueryMediaListByURLResponseBodyMediaListMediaMediaInfoFormat setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public QueryMediaListByURLResponseBodyMediaListMediaMediaInfoFormat setBitrate(String bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public String getBitrate() {
            return this.bitrate;
        }

        public QueryMediaListByURLResponseBodyMediaListMediaMediaInfoFormat setFormatName(String formatName) {
            this.formatName = formatName;
            return this;
        }
        public String getFormatName() {
            return this.formatName;
        }

    }

    public static class QueryMediaListByURLResponseBodyMediaListMediaMediaInfo extends TeaModel {
        @NameInMap("Streams")
        public QueryMediaListByURLResponseBodyMediaListMediaMediaInfoStreams streams;

        @NameInMap("Format")
        public QueryMediaListByURLResponseBodyMediaListMediaMediaInfoFormat format;

        public static QueryMediaListByURLResponseBodyMediaListMediaMediaInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaListByURLResponseBodyMediaListMediaMediaInfo self = new QueryMediaListByURLResponseBodyMediaListMediaMediaInfo();
            return TeaModel.build(map, self);
        }

        public QueryMediaListByURLResponseBodyMediaListMediaMediaInfo setStreams(QueryMediaListByURLResponseBodyMediaListMediaMediaInfoStreams streams) {
            this.streams = streams;
            return this;
        }
        public QueryMediaListByURLResponseBodyMediaListMediaMediaInfoStreams getStreams() {
            return this.streams;
        }

        public QueryMediaListByURLResponseBodyMediaListMediaMediaInfo setFormat(QueryMediaListByURLResponseBodyMediaListMediaMediaInfoFormat format) {
            this.format = format;
            return this;
        }
        public QueryMediaListByURLResponseBodyMediaListMediaMediaInfoFormat getFormat() {
            return this.format;
        }

    }

    public static class QueryMediaListByURLResponseBodyMediaListMediaSnapshotListSnapshotFile extends TeaModel {
        @NameInMap("State")
        public String state;

        @NameInMap("URL")
        public String URL;

        public static QueryMediaListByURLResponseBodyMediaListMediaSnapshotListSnapshotFile build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaListByURLResponseBodyMediaListMediaSnapshotListSnapshotFile self = new QueryMediaListByURLResponseBodyMediaListMediaSnapshotListSnapshotFile();
            return TeaModel.build(map, self);
        }

        public QueryMediaListByURLResponseBodyMediaListMediaSnapshotListSnapshotFile setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public QueryMediaListByURLResponseBodyMediaListMediaSnapshotListSnapshotFile setURL(String URL) {
            this.URL = URL;
            return this;
        }
        public String getURL() {
            return this.URL;
        }

    }

    public static class QueryMediaListByURLResponseBodyMediaListMediaSnapshotListSnapshot extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("MediaWorkflowId")
        public String mediaWorkflowId;

        @NameInMap("ActivityName")
        public String activityName;

        @NameInMap("Count")
        public String count;

        @NameInMap("MediaWorkflowName")
        public String mediaWorkflowName;

        @NameInMap("File")
        public QueryMediaListByURLResponseBodyMediaListMediaSnapshotListSnapshotFile file;

        public static QueryMediaListByURLResponseBodyMediaListMediaSnapshotListSnapshot build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaListByURLResponseBodyMediaListMediaSnapshotListSnapshot self = new QueryMediaListByURLResponseBodyMediaListMediaSnapshotListSnapshot();
            return TeaModel.build(map, self);
        }

        public QueryMediaListByURLResponseBodyMediaListMediaSnapshotListSnapshot setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public QueryMediaListByURLResponseBodyMediaListMediaSnapshotListSnapshot setMediaWorkflowId(String mediaWorkflowId) {
            this.mediaWorkflowId = mediaWorkflowId;
            return this;
        }
        public String getMediaWorkflowId() {
            return this.mediaWorkflowId;
        }

        public QueryMediaListByURLResponseBodyMediaListMediaSnapshotListSnapshot setActivityName(String activityName) {
            this.activityName = activityName;
            return this;
        }
        public String getActivityName() {
            return this.activityName;
        }

        public QueryMediaListByURLResponseBodyMediaListMediaSnapshotListSnapshot setCount(String count) {
            this.count = count;
            return this;
        }
        public String getCount() {
            return this.count;
        }

        public QueryMediaListByURLResponseBodyMediaListMediaSnapshotListSnapshot setMediaWorkflowName(String mediaWorkflowName) {
            this.mediaWorkflowName = mediaWorkflowName;
            return this;
        }
        public String getMediaWorkflowName() {
            return this.mediaWorkflowName;
        }

        public QueryMediaListByURLResponseBodyMediaListMediaSnapshotListSnapshot setFile(QueryMediaListByURLResponseBodyMediaListMediaSnapshotListSnapshotFile file) {
            this.file = file;
            return this;
        }
        public QueryMediaListByURLResponseBodyMediaListMediaSnapshotListSnapshotFile getFile() {
            return this.file;
        }

    }

    public static class QueryMediaListByURLResponseBodyMediaListMediaSnapshotList extends TeaModel {
        @NameInMap("Snapshot")
        public java.util.List<QueryMediaListByURLResponseBodyMediaListMediaSnapshotListSnapshot> snapshot;

        public static QueryMediaListByURLResponseBodyMediaListMediaSnapshotList build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaListByURLResponseBodyMediaListMediaSnapshotList self = new QueryMediaListByURLResponseBodyMediaListMediaSnapshotList();
            return TeaModel.build(map, self);
        }

        public QueryMediaListByURLResponseBodyMediaListMediaSnapshotList setSnapshot(java.util.List<QueryMediaListByURLResponseBodyMediaListMediaSnapshotListSnapshot> snapshot) {
            this.snapshot = snapshot;
            return this;
        }
        public java.util.List<QueryMediaListByURLResponseBodyMediaListMediaSnapshotListSnapshot> getSnapshot() {
            return this.snapshot;
        }

    }

    public static class QueryMediaListByURLResponseBodyMediaListMediaRunIdList extends TeaModel {
        @NameInMap("RunId")
        public java.util.List<String> runId;

        public static QueryMediaListByURLResponseBodyMediaListMediaRunIdList build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaListByURLResponseBodyMediaListMediaRunIdList self = new QueryMediaListByURLResponseBodyMediaListMediaRunIdList();
            return TeaModel.build(map, self);
        }

        public QueryMediaListByURLResponseBodyMediaListMediaRunIdList setRunId(java.util.List<String> runId) {
            this.runId = runId;
            return this;
        }
        public java.util.List<String> getRunId() {
            return this.runId;
        }

    }

    public static class QueryMediaListByURLResponseBodyMediaListMedia extends TeaModel {
        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("CateId")
        public Long cateId;

        @NameInMap("Height")
        public String height;

        @NameInMap("CensorState")
        public String censorState;

        @NameInMap("Tags")
        public QueryMediaListByURLResponseBodyMediaListMediaTags tags;

        @NameInMap("PlayList")
        public QueryMediaListByURLResponseBodyMediaListMediaPlayList playList;

        @NameInMap("Bitrate")
        public String bitrate;

        @NameInMap("MediaId")
        public String mediaId;

        @NameInMap("File")
        public QueryMediaListByURLResponseBodyMediaListMediaFile file;

        @NameInMap("SummaryList")
        public QueryMediaListByURLResponseBodyMediaListMediaSummaryList summaryList;

        @NameInMap("PublishState")
        public String publishState;

        @NameInMap("MediaInfo")
        public QueryMediaListByURLResponseBodyMediaListMediaMediaInfo mediaInfo;

        @NameInMap("Description")
        public String description;

        @NameInMap("Size")
        public String size;

        @NameInMap("Width")
        public String width;

        @NameInMap("CoverURL")
        public String coverURL;

        @NameInMap("SnapshotList")
        public QueryMediaListByURLResponseBodyMediaListMediaSnapshotList snapshotList;

        @NameInMap("RunIdList")
        public QueryMediaListByURLResponseBodyMediaListMediaRunIdList runIdList;

        @NameInMap("Duration")
        public String duration;

        @NameInMap("Fps")
        public String fps;

        @NameInMap("Title")
        public String title;

        @NameInMap("Format")
        public String format;

        public static QueryMediaListByURLResponseBodyMediaListMedia build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaListByURLResponseBodyMediaListMedia self = new QueryMediaListByURLResponseBodyMediaListMedia();
            return TeaModel.build(map, self);
        }

        public QueryMediaListByURLResponseBodyMediaListMedia setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public QueryMediaListByURLResponseBodyMediaListMedia setCateId(Long cateId) {
            this.cateId = cateId;
            return this;
        }
        public Long getCateId() {
            return this.cateId;
        }

        public QueryMediaListByURLResponseBodyMediaListMedia setHeight(String height) {
            this.height = height;
            return this;
        }
        public String getHeight() {
            return this.height;
        }

        public QueryMediaListByURLResponseBodyMediaListMedia setCensorState(String censorState) {
            this.censorState = censorState;
            return this;
        }
        public String getCensorState() {
            return this.censorState;
        }

        public QueryMediaListByURLResponseBodyMediaListMedia setTags(QueryMediaListByURLResponseBodyMediaListMediaTags tags) {
            this.tags = tags;
            return this;
        }
        public QueryMediaListByURLResponseBodyMediaListMediaTags getTags() {
            return this.tags;
        }

        public QueryMediaListByURLResponseBodyMediaListMedia setPlayList(QueryMediaListByURLResponseBodyMediaListMediaPlayList playList) {
            this.playList = playList;
            return this;
        }
        public QueryMediaListByURLResponseBodyMediaListMediaPlayList getPlayList() {
            return this.playList;
        }

        public QueryMediaListByURLResponseBodyMediaListMedia setBitrate(String bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public String getBitrate() {
            return this.bitrate;
        }

        public QueryMediaListByURLResponseBodyMediaListMedia setMediaId(String mediaId) {
            this.mediaId = mediaId;
            return this;
        }
        public String getMediaId() {
            return this.mediaId;
        }

        public QueryMediaListByURLResponseBodyMediaListMedia setFile(QueryMediaListByURLResponseBodyMediaListMediaFile file) {
            this.file = file;
            return this;
        }
        public QueryMediaListByURLResponseBodyMediaListMediaFile getFile() {
            return this.file;
        }

        public QueryMediaListByURLResponseBodyMediaListMedia setSummaryList(QueryMediaListByURLResponseBodyMediaListMediaSummaryList summaryList) {
            this.summaryList = summaryList;
            return this;
        }
        public QueryMediaListByURLResponseBodyMediaListMediaSummaryList getSummaryList() {
            return this.summaryList;
        }

        public QueryMediaListByURLResponseBodyMediaListMedia setPublishState(String publishState) {
            this.publishState = publishState;
            return this;
        }
        public String getPublishState() {
            return this.publishState;
        }

        public QueryMediaListByURLResponseBodyMediaListMedia setMediaInfo(QueryMediaListByURLResponseBodyMediaListMediaMediaInfo mediaInfo) {
            this.mediaInfo = mediaInfo;
            return this;
        }
        public QueryMediaListByURLResponseBodyMediaListMediaMediaInfo getMediaInfo() {
            return this.mediaInfo;
        }

        public QueryMediaListByURLResponseBodyMediaListMedia setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QueryMediaListByURLResponseBodyMediaListMedia setSize(String size) {
            this.size = size;
            return this;
        }
        public String getSize() {
            return this.size;
        }

        public QueryMediaListByURLResponseBodyMediaListMedia setWidth(String width) {
            this.width = width;
            return this;
        }
        public String getWidth() {
            return this.width;
        }

        public QueryMediaListByURLResponseBodyMediaListMedia setCoverURL(String coverURL) {
            this.coverURL = coverURL;
            return this;
        }
        public String getCoverURL() {
            return this.coverURL;
        }

        public QueryMediaListByURLResponseBodyMediaListMedia setSnapshotList(QueryMediaListByURLResponseBodyMediaListMediaSnapshotList snapshotList) {
            this.snapshotList = snapshotList;
            return this;
        }
        public QueryMediaListByURLResponseBodyMediaListMediaSnapshotList getSnapshotList() {
            return this.snapshotList;
        }

        public QueryMediaListByURLResponseBodyMediaListMedia setRunIdList(QueryMediaListByURLResponseBodyMediaListMediaRunIdList runIdList) {
            this.runIdList = runIdList;
            return this;
        }
        public QueryMediaListByURLResponseBodyMediaListMediaRunIdList getRunIdList() {
            return this.runIdList;
        }

        public QueryMediaListByURLResponseBodyMediaListMedia setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public QueryMediaListByURLResponseBodyMediaListMedia setFps(String fps) {
            this.fps = fps;
            return this;
        }
        public String getFps() {
            return this.fps;
        }

        public QueryMediaListByURLResponseBodyMediaListMedia setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public QueryMediaListByURLResponseBodyMediaListMedia setFormat(String format) {
            this.format = format;
            return this;
        }
        public String getFormat() {
            return this.format;
        }

    }

    public static class QueryMediaListByURLResponseBodyMediaList extends TeaModel {
        @NameInMap("Media")
        public java.util.List<QueryMediaListByURLResponseBodyMediaListMedia> media;

        public static QueryMediaListByURLResponseBodyMediaList build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaListByURLResponseBodyMediaList self = new QueryMediaListByURLResponseBodyMediaList();
            return TeaModel.build(map, self);
        }

        public QueryMediaListByURLResponseBodyMediaList setMedia(java.util.List<QueryMediaListByURLResponseBodyMediaListMedia> media) {
            this.media = media;
            return this;
        }
        public java.util.List<QueryMediaListByURLResponseBodyMediaListMedia> getMedia() {
            return this.media;
        }

    }

    public static class QueryMediaListByURLResponseBodyNonExistFileURLs extends TeaModel {
        @NameInMap("FileURL")
        public java.util.List<String> fileURL;

        public static QueryMediaListByURLResponseBodyNonExistFileURLs build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaListByURLResponseBodyNonExistFileURLs self = new QueryMediaListByURLResponseBodyNonExistFileURLs();
            return TeaModel.build(map, self);
        }

        public QueryMediaListByURLResponseBodyNonExistFileURLs setFileURL(java.util.List<String> fileURL) {
            this.fileURL = fileURL;
            return this;
        }
        public java.util.List<String> getFileURL() {
            return this.fileURL;
        }

    }

}
