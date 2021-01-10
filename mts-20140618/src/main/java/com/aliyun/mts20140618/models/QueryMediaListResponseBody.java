// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class QueryMediaListResponseBody extends TeaModel {
    @NameInMap("NonExistMediaIds")
    public QueryMediaListResponseBodyNonExistMediaIds nonExistMediaIds;

    @NameInMap("MediaList")
    public QueryMediaListResponseBodyMediaList mediaList;

    @NameInMap("RequestId")
    public String requestId;

    public static QueryMediaListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryMediaListResponseBody self = new QueryMediaListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryMediaListResponseBody setNonExistMediaIds(QueryMediaListResponseBodyNonExistMediaIds nonExistMediaIds) {
        this.nonExistMediaIds = nonExistMediaIds;
        return this;
    }
    public QueryMediaListResponseBodyNonExistMediaIds getNonExistMediaIds() {
        return this.nonExistMediaIds;
    }

    public QueryMediaListResponseBody setMediaList(QueryMediaListResponseBodyMediaList mediaList) {
        this.mediaList = mediaList;
        return this;
    }
    public QueryMediaListResponseBodyMediaList getMediaList() {
        return this.mediaList;
    }

    public QueryMediaListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class QueryMediaListResponseBodyNonExistMediaIds extends TeaModel {
        @NameInMap("MediaId")
        public java.util.List<String> mediaId;

        public static QueryMediaListResponseBodyNonExistMediaIds build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaListResponseBodyNonExistMediaIds self = new QueryMediaListResponseBodyNonExistMediaIds();
            return TeaModel.build(map, self);
        }

        public QueryMediaListResponseBodyNonExistMediaIds setMediaId(java.util.List<String> mediaId) {
            this.mediaId = mediaId;
            return this;
        }
        public java.util.List<String> getMediaId() {
            return this.mediaId;
        }

    }

    public static class QueryMediaListResponseBodyMediaListMediaTags extends TeaModel {
        @NameInMap("Tag")
        public java.util.List<String> tag;

        public static QueryMediaListResponseBodyMediaListMediaTags build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaListResponseBodyMediaListMediaTags self = new QueryMediaListResponseBodyMediaListMediaTags();
            return TeaModel.build(map, self);
        }

        public QueryMediaListResponseBodyMediaListMediaTags setTag(java.util.List<String> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<String> getTag() {
            return this.tag;
        }

    }

    public static class QueryMediaListResponseBodyMediaListMediaPlayListPlayFile extends TeaModel {
        @NameInMap("State")
        public String state;

        @NameInMap("URL")
        public String URL;

        public static QueryMediaListResponseBodyMediaListMediaPlayListPlayFile build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaListResponseBodyMediaListMediaPlayListPlayFile self = new QueryMediaListResponseBodyMediaListMediaPlayListPlayFile();
            return TeaModel.build(map, self);
        }

        public QueryMediaListResponseBodyMediaListMediaPlayListPlayFile setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public QueryMediaListResponseBodyMediaListMediaPlayListPlayFile setURL(String URL) {
            this.URL = URL;
            return this;
        }
        public String getURL() {
            return this.URL;
        }

    }

    public static class QueryMediaListResponseBodyMediaListMediaPlayListPlay extends TeaModel {
        @NameInMap("Encryption")
        public String encryption;

        @NameInMap("Height")
        public String height;

        @NameInMap("Bitrate")
        public String bitrate;

        @NameInMap("File")
        public QueryMediaListResponseBodyMediaListMediaPlayListPlayFile file;

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

        public static QueryMediaListResponseBodyMediaListMediaPlayListPlay build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaListResponseBodyMediaListMediaPlayListPlay self = new QueryMediaListResponseBodyMediaListMediaPlayListPlay();
            return TeaModel.build(map, self);
        }

        public QueryMediaListResponseBodyMediaListMediaPlayListPlay setEncryption(String encryption) {
            this.encryption = encryption;
            return this;
        }
        public String getEncryption() {
            return this.encryption;
        }

        public QueryMediaListResponseBodyMediaListMediaPlayListPlay setHeight(String height) {
            this.height = height;
            return this;
        }
        public String getHeight() {
            return this.height;
        }

        public QueryMediaListResponseBodyMediaListMediaPlayListPlay setBitrate(String bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public String getBitrate() {
            return this.bitrate;
        }

        public QueryMediaListResponseBodyMediaListMediaPlayListPlay setFile(QueryMediaListResponseBodyMediaListMediaPlayListPlayFile file) {
            this.file = file;
            return this;
        }
        public QueryMediaListResponseBodyMediaListMediaPlayListPlayFile getFile() {
            return this.file;
        }

        public QueryMediaListResponseBodyMediaListMediaPlayListPlay setMediaWorkflowId(String mediaWorkflowId) {
            this.mediaWorkflowId = mediaWorkflowId;
            return this;
        }
        public String getMediaWorkflowId() {
            return this.mediaWorkflowId;
        }

        public QueryMediaListResponseBodyMediaListMediaPlayListPlay setWidth(String width) {
            this.width = width;
            return this;
        }
        public String getWidth() {
            return this.width;
        }

        public QueryMediaListResponseBodyMediaListMediaPlayListPlay setSize(String size) {
            this.size = size;
            return this;
        }
        public String getSize() {
            return this.size;
        }

        public QueryMediaListResponseBodyMediaListMediaPlayListPlay setFps(String fps) {
            this.fps = fps;
            return this;
        }
        public String getFps() {
            return this.fps;
        }

        public QueryMediaListResponseBodyMediaListMediaPlayListPlay setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public QueryMediaListResponseBodyMediaListMediaPlayListPlay setActivityName(String activityName) {
            this.activityName = activityName;
            return this;
        }
        public String getActivityName() {
            return this.activityName;
        }

        public QueryMediaListResponseBodyMediaListMediaPlayListPlay setFormat(String format) {
            this.format = format;
            return this;
        }
        public String getFormat() {
            return this.format;
        }

        public QueryMediaListResponseBodyMediaListMediaPlayListPlay setMediaWorkflowName(String mediaWorkflowName) {
            this.mediaWorkflowName = mediaWorkflowName;
            return this;
        }
        public String getMediaWorkflowName() {
            return this.mediaWorkflowName;
        }

    }

    public static class QueryMediaListResponseBodyMediaListMediaPlayList extends TeaModel {
        @NameInMap("Play")
        public java.util.List<QueryMediaListResponseBodyMediaListMediaPlayListPlay> play;

        public static QueryMediaListResponseBodyMediaListMediaPlayList build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaListResponseBodyMediaListMediaPlayList self = new QueryMediaListResponseBodyMediaListMediaPlayList();
            return TeaModel.build(map, self);
        }

        public QueryMediaListResponseBodyMediaListMediaPlayList setPlay(java.util.List<QueryMediaListResponseBodyMediaListMediaPlayListPlay> play) {
            this.play = play;
            return this;
        }
        public java.util.List<QueryMediaListResponseBodyMediaListMediaPlayListPlay> getPlay() {
            return this.play;
        }

    }

    public static class QueryMediaListResponseBodyMediaListMediaFile extends TeaModel {
        @NameInMap("State")
        public String state;

        @NameInMap("URL")
        public String URL;

        public static QueryMediaListResponseBodyMediaListMediaFile build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaListResponseBodyMediaListMediaFile self = new QueryMediaListResponseBodyMediaListMediaFile();
            return TeaModel.build(map, self);
        }

        public QueryMediaListResponseBodyMediaListMediaFile setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public QueryMediaListResponseBodyMediaListMediaFile setURL(String URL) {
            this.URL = URL;
            return this;
        }
        public String getURL() {
            return this.URL;
        }

    }

    public static class QueryMediaListResponseBodyMediaListMediaSummaryListSummaryFile extends TeaModel {
        @NameInMap("State")
        public String state;

        @NameInMap("URL")
        public String URL;

        public static QueryMediaListResponseBodyMediaListMediaSummaryListSummaryFile build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaListResponseBodyMediaListMediaSummaryListSummaryFile self = new QueryMediaListResponseBodyMediaListMediaSummaryListSummaryFile();
            return TeaModel.build(map, self);
        }

        public QueryMediaListResponseBodyMediaListMediaSummaryListSummaryFile setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public QueryMediaListResponseBodyMediaListMediaSummaryListSummaryFile setURL(String URL) {
            this.URL = URL;
            return this;
        }
        public String getURL() {
            return this.URL;
        }

    }

    public static class QueryMediaListResponseBodyMediaListMediaSummaryListSummary extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("MediaWorkflowId")
        public String mediaWorkflowId;

        @NameInMap("ActivityName")
        public String activityName;

        @NameInMap("MediaWorkflowName")
        public String mediaWorkflowName;

        @NameInMap("File")
        public QueryMediaListResponseBodyMediaListMediaSummaryListSummaryFile file;

        public static QueryMediaListResponseBodyMediaListMediaSummaryListSummary build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaListResponseBodyMediaListMediaSummaryListSummary self = new QueryMediaListResponseBodyMediaListMediaSummaryListSummary();
            return TeaModel.build(map, self);
        }

        public QueryMediaListResponseBodyMediaListMediaSummaryListSummary setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public QueryMediaListResponseBodyMediaListMediaSummaryListSummary setMediaWorkflowId(String mediaWorkflowId) {
            this.mediaWorkflowId = mediaWorkflowId;
            return this;
        }
        public String getMediaWorkflowId() {
            return this.mediaWorkflowId;
        }

        public QueryMediaListResponseBodyMediaListMediaSummaryListSummary setActivityName(String activityName) {
            this.activityName = activityName;
            return this;
        }
        public String getActivityName() {
            return this.activityName;
        }

        public QueryMediaListResponseBodyMediaListMediaSummaryListSummary setMediaWorkflowName(String mediaWorkflowName) {
            this.mediaWorkflowName = mediaWorkflowName;
            return this;
        }
        public String getMediaWorkflowName() {
            return this.mediaWorkflowName;
        }

        public QueryMediaListResponseBodyMediaListMediaSummaryListSummary setFile(QueryMediaListResponseBodyMediaListMediaSummaryListSummaryFile file) {
            this.file = file;
            return this;
        }
        public QueryMediaListResponseBodyMediaListMediaSummaryListSummaryFile getFile() {
            return this.file;
        }

    }

    public static class QueryMediaListResponseBodyMediaListMediaSummaryList extends TeaModel {
        @NameInMap("Summary")
        public java.util.List<QueryMediaListResponseBodyMediaListMediaSummaryListSummary> summary;

        public static QueryMediaListResponseBodyMediaListMediaSummaryList build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaListResponseBodyMediaListMediaSummaryList self = new QueryMediaListResponseBodyMediaListMediaSummaryList();
            return TeaModel.build(map, self);
        }

        public QueryMediaListResponseBodyMediaListMediaSummaryList setSummary(java.util.List<QueryMediaListResponseBodyMediaListMediaSummaryListSummary> summary) {
            this.summary = summary;
            return this;
        }
        public java.util.List<QueryMediaListResponseBodyMediaListMediaSummaryListSummary> getSummary() {
            return this.summary;
        }

    }

    public static class QueryMediaListResponseBodyMediaListMediaMediaInfoStreamsVideoStreamListVideoStreamNetworkCost extends TeaModel {
        @NameInMap("PreloadTime")
        public String preloadTime;

        @NameInMap("AvgBitrate")
        public String avgBitrate;

        @NameInMap("CostBandwidth")
        public String costBandwidth;

        public static QueryMediaListResponseBodyMediaListMediaMediaInfoStreamsVideoStreamListVideoStreamNetworkCost build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaListResponseBodyMediaListMediaMediaInfoStreamsVideoStreamListVideoStreamNetworkCost self = new QueryMediaListResponseBodyMediaListMediaMediaInfoStreamsVideoStreamListVideoStreamNetworkCost();
            return TeaModel.build(map, self);
        }

        public QueryMediaListResponseBodyMediaListMediaMediaInfoStreamsVideoStreamListVideoStreamNetworkCost setPreloadTime(String preloadTime) {
            this.preloadTime = preloadTime;
            return this;
        }
        public String getPreloadTime() {
            return this.preloadTime;
        }

        public QueryMediaListResponseBodyMediaListMediaMediaInfoStreamsVideoStreamListVideoStreamNetworkCost setAvgBitrate(String avgBitrate) {
            this.avgBitrate = avgBitrate;
            return this;
        }
        public String getAvgBitrate() {
            return this.avgBitrate;
        }

        public QueryMediaListResponseBodyMediaListMediaMediaInfoStreamsVideoStreamListVideoStreamNetworkCost setCostBandwidth(String costBandwidth) {
            this.costBandwidth = costBandwidth;
            return this;
        }
        public String getCostBandwidth() {
            return this.costBandwidth;
        }

    }

    public static class QueryMediaListResponseBodyMediaListMediaMediaInfoStreamsVideoStreamListVideoStream extends TeaModel {
        @NameInMap("Sar")
        public String sar;

        @NameInMap("Height")
        public String height;

        @NameInMap("CodecTagString")
        public String codecTagString;

        @NameInMap("NetworkCost")
        public QueryMediaListResponseBodyMediaListMediaMediaInfoStreamsVideoStreamListVideoStreamNetworkCost networkCost;

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

        public static QueryMediaListResponseBodyMediaListMediaMediaInfoStreamsVideoStreamListVideoStream build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaListResponseBodyMediaListMediaMediaInfoStreamsVideoStreamListVideoStream self = new QueryMediaListResponseBodyMediaListMediaMediaInfoStreamsVideoStreamListVideoStream();
            return TeaModel.build(map, self);
        }

        public QueryMediaListResponseBodyMediaListMediaMediaInfoStreamsVideoStreamListVideoStream setSar(String sar) {
            this.sar = sar;
            return this;
        }
        public String getSar() {
            return this.sar;
        }

        public QueryMediaListResponseBodyMediaListMediaMediaInfoStreamsVideoStreamListVideoStream setHeight(String height) {
            this.height = height;
            return this;
        }
        public String getHeight() {
            return this.height;
        }

        public QueryMediaListResponseBodyMediaListMediaMediaInfoStreamsVideoStreamListVideoStream setCodecTagString(String codecTagString) {
            this.codecTagString = codecTagString;
            return this;
        }
        public String getCodecTagString() {
            return this.codecTagString;
        }

        public QueryMediaListResponseBodyMediaListMediaMediaInfoStreamsVideoStreamListVideoStream setNetworkCost(QueryMediaListResponseBodyMediaListMediaMediaInfoStreamsVideoStreamListVideoStreamNetworkCost networkCost) {
            this.networkCost = networkCost;
            return this;
        }
        public QueryMediaListResponseBodyMediaListMediaMediaInfoStreamsVideoStreamListVideoStreamNetworkCost getNetworkCost() {
            return this.networkCost;
        }

        public QueryMediaListResponseBodyMediaListMediaMediaInfoStreamsVideoStreamListVideoStream setWidth(String width) {
            this.width = width;
            return this;
        }
        public String getWidth() {
            return this.width;
        }

        public QueryMediaListResponseBodyMediaListMediaMediaInfoStreamsVideoStreamListVideoStream setIndex(String index) {
            this.index = index;
            return this;
        }
        public String getIndex() {
            return this.index;
        }

        public QueryMediaListResponseBodyMediaListMediaMediaInfoStreamsVideoStreamListVideoStream setTimebase(String timebase) {
            this.timebase = timebase;
            return this;
        }
        public String getTimebase() {
            return this.timebase;
        }

        public QueryMediaListResponseBodyMediaListMediaMediaInfoStreamsVideoStreamListVideoStream setAvgFPS(String avgFPS) {
            this.avgFPS = avgFPS;
            return this;
        }
        public String getAvgFPS() {
            return this.avgFPS;
        }

        public QueryMediaListResponseBodyMediaListMediaMediaInfoStreamsVideoStreamListVideoStream setPixFmt(String pixFmt) {
            this.pixFmt = pixFmt;
            return this;
        }
        public String getPixFmt() {
            return this.pixFmt;
        }

        public QueryMediaListResponseBodyMediaListMediaMediaInfoStreamsVideoStreamListVideoStream setLang(String lang) {
            this.lang = lang;
            return this;
        }
        public String getLang() {
            return this.lang;
        }

        public QueryMediaListResponseBodyMediaListMediaMediaInfoStreamsVideoStreamListVideoStream setCodecLongName(String codecLongName) {
            this.codecLongName = codecLongName;
            return this;
        }
        public String getCodecLongName() {
            return this.codecLongName;
        }

        public QueryMediaListResponseBodyMediaListMediaMediaInfoStreamsVideoStreamListVideoStream setNumFrames(String numFrames) {
            this.numFrames = numFrames;
            return this;
        }
        public String getNumFrames() {
            return this.numFrames;
        }

        public QueryMediaListResponseBodyMediaListMediaMediaInfoStreamsVideoStreamListVideoStream setRotate(String rotate) {
            this.rotate = rotate;
            return this;
        }
        public String getRotate() {
            return this.rotate;
        }

        public QueryMediaListResponseBodyMediaListMediaMediaInfoStreamsVideoStreamListVideoStream setBitrate(String bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public String getBitrate() {
            return this.bitrate;
        }

        public QueryMediaListResponseBodyMediaListMediaMediaInfoStreamsVideoStreamListVideoStream setHasBFrames(String hasBFrames) {
            this.hasBFrames = hasBFrames;
            return this;
        }
        public String getHasBFrames() {
            return this.hasBFrames;
        }

        public QueryMediaListResponseBodyMediaListMediaMediaInfoStreamsVideoStreamListVideoStream setProfile(String profile) {
            this.profile = profile;
            return this;
        }
        public String getProfile() {
            return this.profile;
        }

        public QueryMediaListResponseBodyMediaListMediaMediaInfoStreamsVideoStreamListVideoStream setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public QueryMediaListResponseBodyMediaListMediaMediaInfoStreamsVideoStreamListVideoStream setDar(String dar) {
            this.dar = dar;
            return this;
        }
        public String getDar() {
            return this.dar;
        }

        public QueryMediaListResponseBodyMediaListMediaMediaInfoStreamsVideoStreamListVideoStream setCodecName(String codecName) {
            this.codecName = codecName;
            return this;
        }
        public String getCodecName() {
            return this.codecName;
        }

        public QueryMediaListResponseBodyMediaListMediaMediaInfoStreamsVideoStreamListVideoStream setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public QueryMediaListResponseBodyMediaListMediaMediaInfoStreamsVideoStreamListVideoStream setFps(String fps) {
            this.fps = fps;
            return this;
        }
        public String getFps() {
            return this.fps;
        }

        public QueryMediaListResponseBodyMediaListMediaMediaInfoStreamsVideoStreamListVideoStream setCodecTag(String codecTag) {
            this.codecTag = codecTag;
            return this;
        }
        public String getCodecTag() {
            return this.codecTag;
        }

        public QueryMediaListResponseBodyMediaListMediaMediaInfoStreamsVideoStreamListVideoStream setCodecTimeBase(String codecTimeBase) {
            this.codecTimeBase = codecTimeBase;
            return this;
        }
        public String getCodecTimeBase() {
            return this.codecTimeBase;
        }

        public QueryMediaListResponseBodyMediaListMediaMediaInfoStreamsVideoStreamListVideoStream setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

    }

    public static class QueryMediaListResponseBodyMediaListMediaMediaInfoStreamsVideoStreamList extends TeaModel {
        @NameInMap("VideoStream")
        public java.util.List<QueryMediaListResponseBodyMediaListMediaMediaInfoStreamsVideoStreamListVideoStream> videoStream;

        public static QueryMediaListResponseBodyMediaListMediaMediaInfoStreamsVideoStreamList build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaListResponseBodyMediaListMediaMediaInfoStreamsVideoStreamList self = new QueryMediaListResponseBodyMediaListMediaMediaInfoStreamsVideoStreamList();
            return TeaModel.build(map, self);
        }

        public QueryMediaListResponseBodyMediaListMediaMediaInfoStreamsVideoStreamList setVideoStream(java.util.List<QueryMediaListResponseBodyMediaListMediaMediaInfoStreamsVideoStreamListVideoStream> videoStream) {
            this.videoStream = videoStream;
            return this;
        }
        public java.util.List<QueryMediaListResponseBodyMediaListMediaMediaInfoStreamsVideoStreamListVideoStream> getVideoStream() {
            return this.videoStream;
        }

    }

    public static class QueryMediaListResponseBodyMediaListMediaMediaInfoStreamsAudioStreamListAudioStream extends TeaModel {
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

        public static QueryMediaListResponseBodyMediaListMediaMediaInfoStreamsAudioStreamListAudioStream build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaListResponseBodyMediaListMediaMediaInfoStreamsAudioStreamListAudioStream self = new QueryMediaListResponseBodyMediaListMediaMediaInfoStreamsAudioStreamListAudioStream();
            return TeaModel.build(map, self);
        }

        public QueryMediaListResponseBodyMediaListMediaMediaInfoStreamsAudioStreamListAudioStream setTimebase(String timebase) {
            this.timebase = timebase;
            return this;
        }
        public String getTimebase() {
            return this.timebase;
        }

        public QueryMediaListResponseBodyMediaListMediaMediaInfoStreamsAudioStreamListAudioStream setIndex(String index) {
            this.index = index;
            return this;
        }
        public String getIndex() {
            return this.index;
        }

        public QueryMediaListResponseBodyMediaListMediaMediaInfoStreamsAudioStreamListAudioStream setSampleFmt(String sampleFmt) {
            this.sampleFmt = sampleFmt;
            return this;
        }
        public String getSampleFmt() {
            return this.sampleFmt;
        }

        public QueryMediaListResponseBodyMediaListMediaMediaInfoStreamsAudioStreamListAudioStream setChannelLayout(String channelLayout) {
            this.channelLayout = channelLayout;
            return this;
        }
        public String getChannelLayout() {
            return this.channelLayout;
        }

        public QueryMediaListResponseBodyMediaListMediaMediaInfoStreamsAudioStreamListAudioStream setLang(String lang) {
            this.lang = lang;
            return this;
        }
        public String getLang() {
            return this.lang;
        }

        public QueryMediaListResponseBodyMediaListMediaMediaInfoStreamsAudioStreamListAudioStream setSamplerate(String samplerate) {
            this.samplerate = samplerate;
            return this;
        }
        public String getSamplerate() {
            return this.samplerate;
        }

        public QueryMediaListResponseBodyMediaListMediaMediaInfoStreamsAudioStreamListAudioStream setCodecLongName(String codecLongName) {
            this.codecLongName = codecLongName;
            return this;
        }
        public String getCodecLongName() {
            return this.codecLongName;
        }

        public QueryMediaListResponseBodyMediaListMediaMediaInfoStreamsAudioStreamListAudioStream setChannels(String channels) {
            this.channels = channels;
            return this;
        }
        public String getChannels() {
            return this.channels;
        }

        public QueryMediaListResponseBodyMediaListMediaMediaInfoStreamsAudioStreamListAudioStream setNumFrames(String numFrames) {
            this.numFrames = numFrames;
            return this;
        }
        public String getNumFrames() {
            return this.numFrames;
        }

        public QueryMediaListResponseBodyMediaListMediaMediaInfoStreamsAudioStreamListAudioStream setBitrate(String bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public String getBitrate() {
            return this.bitrate;
        }

        public QueryMediaListResponseBodyMediaListMediaMediaInfoStreamsAudioStreamListAudioStream setCodecTagString(String codecTagString) {
            this.codecTagString = codecTagString;
            return this;
        }
        public String getCodecTagString() {
            return this.codecTagString;
        }

        public QueryMediaListResponseBodyMediaListMediaMediaInfoStreamsAudioStreamListAudioStream setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public QueryMediaListResponseBodyMediaListMediaMediaInfoStreamsAudioStreamListAudioStream setCodecName(String codecName) {
            this.codecName = codecName;
            return this;
        }
        public String getCodecName() {
            return this.codecName;
        }

        public QueryMediaListResponseBodyMediaListMediaMediaInfoStreamsAudioStreamListAudioStream setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public QueryMediaListResponseBodyMediaListMediaMediaInfoStreamsAudioStreamListAudioStream setCodecTag(String codecTag) {
            this.codecTag = codecTag;
            return this;
        }
        public String getCodecTag() {
            return this.codecTag;
        }

        public QueryMediaListResponseBodyMediaListMediaMediaInfoStreamsAudioStreamListAudioStream setCodecTimeBase(String codecTimeBase) {
            this.codecTimeBase = codecTimeBase;
            return this;
        }
        public String getCodecTimeBase() {
            return this.codecTimeBase;
        }

    }

    public static class QueryMediaListResponseBodyMediaListMediaMediaInfoStreamsAudioStreamList extends TeaModel {
        @NameInMap("AudioStream")
        public java.util.List<QueryMediaListResponseBodyMediaListMediaMediaInfoStreamsAudioStreamListAudioStream> audioStream;

        public static QueryMediaListResponseBodyMediaListMediaMediaInfoStreamsAudioStreamList build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaListResponseBodyMediaListMediaMediaInfoStreamsAudioStreamList self = new QueryMediaListResponseBodyMediaListMediaMediaInfoStreamsAudioStreamList();
            return TeaModel.build(map, self);
        }

        public QueryMediaListResponseBodyMediaListMediaMediaInfoStreamsAudioStreamList setAudioStream(java.util.List<QueryMediaListResponseBodyMediaListMediaMediaInfoStreamsAudioStreamListAudioStream> audioStream) {
            this.audioStream = audioStream;
            return this;
        }
        public java.util.List<QueryMediaListResponseBodyMediaListMediaMediaInfoStreamsAudioStreamListAudioStream> getAudioStream() {
            return this.audioStream;
        }

    }

    public static class QueryMediaListResponseBodyMediaListMediaMediaInfoStreamsSubtitleStreamListSubtitleStream extends TeaModel {
        @NameInMap("Index")
        public String index;

        @NameInMap("Lang")
        public String lang;

        public static QueryMediaListResponseBodyMediaListMediaMediaInfoStreamsSubtitleStreamListSubtitleStream build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaListResponseBodyMediaListMediaMediaInfoStreamsSubtitleStreamListSubtitleStream self = new QueryMediaListResponseBodyMediaListMediaMediaInfoStreamsSubtitleStreamListSubtitleStream();
            return TeaModel.build(map, self);
        }

        public QueryMediaListResponseBodyMediaListMediaMediaInfoStreamsSubtitleStreamListSubtitleStream setIndex(String index) {
            this.index = index;
            return this;
        }
        public String getIndex() {
            return this.index;
        }

        public QueryMediaListResponseBodyMediaListMediaMediaInfoStreamsSubtitleStreamListSubtitleStream setLang(String lang) {
            this.lang = lang;
            return this;
        }
        public String getLang() {
            return this.lang;
        }

    }

    public static class QueryMediaListResponseBodyMediaListMediaMediaInfoStreamsSubtitleStreamList extends TeaModel {
        @NameInMap("SubtitleStream")
        public java.util.List<QueryMediaListResponseBodyMediaListMediaMediaInfoStreamsSubtitleStreamListSubtitleStream> subtitleStream;

        public static QueryMediaListResponseBodyMediaListMediaMediaInfoStreamsSubtitleStreamList build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaListResponseBodyMediaListMediaMediaInfoStreamsSubtitleStreamList self = new QueryMediaListResponseBodyMediaListMediaMediaInfoStreamsSubtitleStreamList();
            return TeaModel.build(map, self);
        }

        public QueryMediaListResponseBodyMediaListMediaMediaInfoStreamsSubtitleStreamList setSubtitleStream(java.util.List<QueryMediaListResponseBodyMediaListMediaMediaInfoStreamsSubtitleStreamListSubtitleStream> subtitleStream) {
            this.subtitleStream = subtitleStream;
            return this;
        }
        public java.util.List<QueryMediaListResponseBodyMediaListMediaMediaInfoStreamsSubtitleStreamListSubtitleStream> getSubtitleStream() {
            return this.subtitleStream;
        }

    }

    public static class QueryMediaListResponseBodyMediaListMediaMediaInfoStreams extends TeaModel {
        @NameInMap("VideoStreamList")
        public QueryMediaListResponseBodyMediaListMediaMediaInfoStreamsVideoStreamList videoStreamList;

        @NameInMap("AudioStreamList")
        public QueryMediaListResponseBodyMediaListMediaMediaInfoStreamsAudioStreamList audioStreamList;

        @NameInMap("SubtitleStreamList")
        public QueryMediaListResponseBodyMediaListMediaMediaInfoStreamsSubtitleStreamList subtitleStreamList;

        public static QueryMediaListResponseBodyMediaListMediaMediaInfoStreams build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaListResponseBodyMediaListMediaMediaInfoStreams self = new QueryMediaListResponseBodyMediaListMediaMediaInfoStreams();
            return TeaModel.build(map, self);
        }

        public QueryMediaListResponseBodyMediaListMediaMediaInfoStreams setVideoStreamList(QueryMediaListResponseBodyMediaListMediaMediaInfoStreamsVideoStreamList videoStreamList) {
            this.videoStreamList = videoStreamList;
            return this;
        }
        public QueryMediaListResponseBodyMediaListMediaMediaInfoStreamsVideoStreamList getVideoStreamList() {
            return this.videoStreamList;
        }

        public QueryMediaListResponseBodyMediaListMediaMediaInfoStreams setAudioStreamList(QueryMediaListResponseBodyMediaListMediaMediaInfoStreamsAudioStreamList audioStreamList) {
            this.audioStreamList = audioStreamList;
            return this;
        }
        public QueryMediaListResponseBodyMediaListMediaMediaInfoStreamsAudioStreamList getAudioStreamList() {
            return this.audioStreamList;
        }

        public QueryMediaListResponseBodyMediaListMediaMediaInfoStreams setSubtitleStreamList(QueryMediaListResponseBodyMediaListMediaMediaInfoStreamsSubtitleStreamList subtitleStreamList) {
            this.subtitleStreamList = subtitleStreamList;
            return this;
        }
        public QueryMediaListResponseBodyMediaListMediaMediaInfoStreamsSubtitleStreamList getSubtitleStreamList() {
            return this.subtitleStreamList;
        }

    }

    public static class QueryMediaListResponseBodyMediaListMediaMediaInfoFormat extends TeaModel {
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

        public static QueryMediaListResponseBodyMediaListMediaMediaInfoFormat build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaListResponseBodyMediaListMediaMediaInfoFormat self = new QueryMediaListResponseBodyMediaListMediaMediaInfoFormat();
            return TeaModel.build(map, self);
        }

        public QueryMediaListResponseBodyMediaListMediaMediaInfoFormat setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public QueryMediaListResponseBodyMediaListMediaMediaInfoFormat setNumPrograms(String numPrograms) {
            this.numPrograms = numPrograms;
            return this;
        }
        public String getNumPrograms() {
            return this.numPrograms;
        }

        public QueryMediaListResponseBodyMediaListMediaMediaInfoFormat setSize(String size) {
            this.size = size;
            return this;
        }
        public String getSize() {
            return this.size;
        }

        public QueryMediaListResponseBodyMediaListMediaMediaInfoFormat setNumStreams(String numStreams) {
            this.numStreams = numStreams;
            return this;
        }
        public String getNumStreams() {
            return this.numStreams;
        }

        public QueryMediaListResponseBodyMediaListMediaMediaInfoFormat setFormatLongName(String formatLongName) {
            this.formatLongName = formatLongName;
            return this;
        }
        public String getFormatLongName() {
            return this.formatLongName;
        }

        public QueryMediaListResponseBodyMediaListMediaMediaInfoFormat setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public QueryMediaListResponseBodyMediaListMediaMediaInfoFormat setBitrate(String bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public String getBitrate() {
            return this.bitrate;
        }

        public QueryMediaListResponseBodyMediaListMediaMediaInfoFormat setFormatName(String formatName) {
            this.formatName = formatName;
            return this;
        }
        public String getFormatName() {
            return this.formatName;
        }

    }

    public static class QueryMediaListResponseBodyMediaListMediaMediaInfo extends TeaModel {
        @NameInMap("Streams")
        public QueryMediaListResponseBodyMediaListMediaMediaInfoStreams streams;

        @NameInMap("Format")
        public QueryMediaListResponseBodyMediaListMediaMediaInfoFormat format;

        public static QueryMediaListResponseBodyMediaListMediaMediaInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaListResponseBodyMediaListMediaMediaInfo self = new QueryMediaListResponseBodyMediaListMediaMediaInfo();
            return TeaModel.build(map, self);
        }

        public QueryMediaListResponseBodyMediaListMediaMediaInfo setStreams(QueryMediaListResponseBodyMediaListMediaMediaInfoStreams streams) {
            this.streams = streams;
            return this;
        }
        public QueryMediaListResponseBodyMediaListMediaMediaInfoStreams getStreams() {
            return this.streams;
        }

        public QueryMediaListResponseBodyMediaListMediaMediaInfo setFormat(QueryMediaListResponseBodyMediaListMediaMediaInfoFormat format) {
            this.format = format;
            return this;
        }
        public QueryMediaListResponseBodyMediaListMediaMediaInfoFormat getFormat() {
            return this.format;
        }

    }

    public static class QueryMediaListResponseBodyMediaListMediaSnapshotListSnapshotFile extends TeaModel {
        @NameInMap("State")
        public String state;

        @NameInMap("URL")
        public String URL;

        public static QueryMediaListResponseBodyMediaListMediaSnapshotListSnapshotFile build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaListResponseBodyMediaListMediaSnapshotListSnapshotFile self = new QueryMediaListResponseBodyMediaListMediaSnapshotListSnapshotFile();
            return TeaModel.build(map, self);
        }

        public QueryMediaListResponseBodyMediaListMediaSnapshotListSnapshotFile setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public QueryMediaListResponseBodyMediaListMediaSnapshotListSnapshotFile setURL(String URL) {
            this.URL = URL;
            return this;
        }
        public String getURL() {
            return this.URL;
        }

    }

    public static class QueryMediaListResponseBodyMediaListMediaSnapshotListSnapshot extends TeaModel {
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
        public QueryMediaListResponseBodyMediaListMediaSnapshotListSnapshotFile file;

        public static QueryMediaListResponseBodyMediaListMediaSnapshotListSnapshot build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaListResponseBodyMediaListMediaSnapshotListSnapshot self = new QueryMediaListResponseBodyMediaListMediaSnapshotListSnapshot();
            return TeaModel.build(map, self);
        }

        public QueryMediaListResponseBodyMediaListMediaSnapshotListSnapshot setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public QueryMediaListResponseBodyMediaListMediaSnapshotListSnapshot setMediaWorkflowId(String mediaWorkflowId) {
            this.mediaWorkflowId = mediaWorkflowId;
            return this;
        }
        public String getMediaWorkflowId() {
            return this.mediaWorkflowId;
        }

        public QueryMediaListResponseBodyMediaListMediaSnapshotListSnapshot setActivityName(String activityName) {
            this.activityName = activityName;
            return this;
        }
        public String getActivityName() {
            return this.activityName;
        }

        public QueryMediaListResponseBodyMediaListMediaSnapshotListSnapshot setCount(String count) {
            this.count = count;
            return this;
        }
        public String getCount() {
            return this.count;
        }

        public QueryMediaListResponseBodyMediaListMediaSnapshotListSnapshot setMediaWorkflowName(String mediaWorkflowName) {
            this.mediaWorkflowName = mediaWorkflowName;
            return this;
        }
        public String getMediaWorkflowName() {
            return this.mediaWorkflowName;
        }

        public QueryMediaListResponseBodyMediaListMediaSnapshotListSnapshot setFile(QueryMediaListResponseBodyMediaListMediaSnapshotListSnapshotFile file) {
            this.file = file;
            return this;
        }
        public QueryMediaListResponseBodyMediaListMediaSnapshotListSnapshotFile getFile() {
            return this.file;
        }

    }

    public static class QueryMediaListResponseBodyMediaListMediaSnapshotList extends TeaModel {
        @NameInMap("Snapshot")
        public java.util.List<QueryMediaListResponseBodyMediaListMediaSnapshotListSnapshot> snapshot;

        public static QueryMediaListResponseBodyMediaListMediaSnapshotList build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaListResponseBodyMediaListMediaSnapshotList self = new QueryMediaListResponseBodyMediaListMediaSnapshotList();
            return TeaModel.build(map, self);
        }

        public QueryMediaListResponseBodyMediaListMediaSnapshotList setSnapshot(java.util.List<QueryMediaListResponseBodyMediaListMediaSnapshotListSnapshot> snapshot) {
            this.snapshot = snapshot;
            return this;
        }
        public java.util.List<QueryMediaListResponseBodyMediaListMediaSnapshotListSnapshot> getSnapshot() {
            return this.snapshot;
        }

    }

    public static class QueryMediaListResponseBodyMediaListMediaRunIdList extends TeaModel {
        @NameInMap("RunId")
        public java.util.List<String> runId;

        public static QueryMediaListResponseBodyMediaListMediaRunIdList build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaListResponseBodyMediaListMediaRunIdList self = new QueryMediaListResponseBodyMediaListMediaRunIdList();
            return TeaModel.build(map, self);
        }

        public QueryMediaListResponseBodyMediaListMediaRunIdList setRunId(java.util.List<String> runId) {
            this.runId = runId;
            return this;
        }
        public java.util.List<String> getRunId() {
            return this.runId;
        }

    }

    public static class QueryMediaListResponseBodyMediaListMedia extends TeaModel {
        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("CateId")
        public Long cateId;

        @NameInMap("Height")
        public String height;

        @NameInMap("CensorState")
        public String censorState;

        @NameInMap("Tags")
        public QueryMediaListResponseBodyMediaListMediaTags tags;

        @NameInMap("PlayList")
        public QueryMediaListResponseBodyMediaListMediaPlayList playList;

        @NameInMap("Bitrate")
        public String bitrate;

        @NameInMap("MediaId")
        public String mediaId;

        @NameInMap("File")
        public QueryMediaListResponseBodyMediaListMediaFile file;

        @NameInMap("SummaryList")
        public QueryMediaListResponseBodyMediaListMediaSummaryList summaryList;

        @NameInMap("PublishState")
        public String publishState;

        @NameInMap("MediaInfo")
        public QueryMediaListResponseBodyMediaListMediaMediaInfo mediaInfo;

        @NameInMap("Description")
        public String description;

        @NameInMap("Size")
        public String size;

        @NameInMap("Width")
        public String width;

        @NameInMap("CoverURL")
        public String coverURL;

        @NameInMap("SnapshotList")
        public QueryMediaListResponseBodyMediaListMediaSnapshotList snapshotList;

        @NameInMap("RunIdList")
        public QueryMediaListResponseBodyMediaListMediaRunIdList runIdList;

        @NameInMap("Duration")
        public String duration;

        @NameInMap("Fps")
        public String fps;

        @NameInMap("Title")
        public String title;

        @NameInMap("Format")
        public String format;

        public static QueryMediaListResponseBodyMediaListMedia build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaListResponseBodyMediaListMedia self = new QueryMediaListResponseBodyMediaListMedia();
            return TeaModel.build(map, self);
        }

        public QueryMediaListResponseBodyMediaListMedia setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public QueryMediaListResponseBodyMediaListMedia setCateId(Long cateId) {
            this.cateId = cateId;
            return this;
        }
        public Long getCateId() {
            return this.cateId;
        }

        public QueryMediaListResponseBodyMediaListMedia setHeight(String height) {
            this.height = height;
            return this;
        }
        public String getHeight() {
            return this.height;
        }

        public QueryMediaListResponseBodyMediaListMedia setCensorState(String censorState) {
            this.censorState = censorState;
            return this;
        }
        public String getCensorState() {
            return this.censorState;
        }

        public QueryMediaListResponseBodyMediaListMedia setTags(QueryMediaListResponseBodyMediaListMediaTags tags) {
            this.tags = tags;
            return this;
        }
        public QueryMediaListResponseBodyMediaListMediaTags getTags() {
            return this.tags;
        }

        public QueryMediaListResponseBodyMediaListMedia setPlayList(QueryMediaListResponseBodyMediaListMediaPlayList playList) {
            this.playList = playList;
            return this;
        }
        public QueryMediaListResponseBodyMediaListMediaPlayList getPlayList() {
            return this.playList;
        }

        public QueryMediaListResponseBodyMediaListMedia setBitrate(String bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public String getBitrate() {
            return this.bitrate;
        }

        public QueryMediaListResponseBodyMediaListMedia setMediaId(String mediaId) {
            this.mediaId = mediaId;
            return this;
        }
        public String getMediaId() {
            return this.mediaId;
        }

        public QueryMediaListResponseBodyMediaListMedia setFile(QueryMediaListResponseBodyMediaListMediaFile file) {
            this.file = file;
            return this;
        }
        public QueryMediaListResponseBodyMediaListMediaFile getFile() {
            return this.file;
        }

        public QueryMediaListResponseBodyMediaListMedia setSummaryList(QueryMediaListResponseBodyMediaListMediaSummaryList summaryList) {
            this.summaryList = summaryList;
            return this;
        }
        public QueryMediaListResponseBodyMediaListMediaSummaryList getSummaryList() {
            return this.summaryList;
        }

        public QueryMediaListResponseBodyMediaListMedia setPublishState(String publishState) {
            this.publishState = publishState;
            return this;
        }
        public String getPublishState() {
            return this.publishState;
        }

        public QueryMediaListResponseBodyMediaListMedia setMediaInfo(QueryMediaListResponseBodyMediaListMediaMediaInfo mediaInfo) {
            this.mediaInfo = mediaInfo;
            return this;
        }
        public QueryMediaListResponseBodyMediaListMediaMediaInfo getMediaInfo() {
            return this.mediaInfo;
        }

        public QueryMediaListResponseBodyMediaListMedia setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QueryMediaListResponseBodyMediaListMedia setSize(String size) {
            this.size = size;
            return this;
        }
        public String getSize() {
            return this.size;
        }

        public QueryMediaListResponseBodyMediaListMedia setWidth(String width) {
            this.width = width;
            return this;
        }
        public String getWidth() {
            return this.width;
        }

        public QueryMediaListResponseBodyMediaListMedia setCoverURL(String coverURL) {
            this.coverURL = coverURL;
            return this;
        }
        public String getCoverURL() {
            return this.coverURL;
        }

        public QueryMediaListResponseBodyMediaListMedia setSnapshotList(QueryMediaListResponseBodyMediaListMediaSnapshotList snapshotList) {
            this.snapshotList = snapshotList;
            return this;
        }
        public QueryMediaListResponseBodyMediaListMediaSnapshotList getSnapshotList() {
            return this.snapshotList;
        }

        public QueryMediaListResponseBodyMediaListMedia setRunIdList(QueryMediaListResponseBodyMediaListMediaRunIdList runIdList) {
            this.runIdList = runIdList;
            return this;
        }
        public QueryMediaListResponseBodyMediaListMediaRunIdList getRunIdList() {
            return this.runIdList;
        }

        public QueryMediaListResponseBodyMediaListMedia setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public QueryMediaListResponseBodyMediaListMedia setFps(String fps) {
            this.fps = fps;
            return this;
        }
        public String getFps() {
            return this.fps;
        }

        public QueryMediaListResponseBodyMediaListMedia setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public QueryMediaListResponseBodyMediaListMedia setFormat(String format) {
            this.format = format;
            return this;
        }
        public String getFormat() {
            return this.format;
        }

    }

    public static class QueryMediaListResponseBodyMediaList extends TeaModel {
        @NameInMap("Media")
        public java.util.List<QueryMediaListResponseBodyMediaListMedia> media;

        public static QueryMediaListResponseBodyMediaList build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaListResponseBodyMediaList self = new QueryMediaListResponseBodyMediaList();
            return TeaModel.build(map, self);
        }

        public QueryMediaListResponseBodyMediaList setMedia(java.util.List<QueryMediaListResponseBodyMediaListMedia> media) {
            this.media = media;
            return this;
        }
        public java.util.List<QueryMediaListResponseBodyMediaListMedia> getMedia() {
            return this.media;
        }

    }

}
