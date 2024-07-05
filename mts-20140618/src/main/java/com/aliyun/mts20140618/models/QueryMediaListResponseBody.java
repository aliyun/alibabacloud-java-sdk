// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class QueryMediaListResponseBody extends TeaModel {
    /**
     * <p>The list of media files.</p>
     */
    @NameInMap("MediaList")
    public QueryMediaListResponseBodyMediaList mediaList;

    /**
     * <p>The IDs of the media files that do not exist. This parameter is not returned when all specified media files exist.</p>
     */
    @NameInMap("NonExistMediaIds")
    public QueryMediaListResponseBodyNonExistMediaIds nonExistMediaIds;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>283DC68C-146F-4489-A2A1-2F88F1472A56</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static QueryMediaListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryMediaListResponseBody self = new QueryMediaListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryMediaListResponseBody setMediaList(QueryMediaListResponseBodyMediaList mediaList) {
        this.mediaList = mediaList;
        return this;
    }
    public QueryMediaListResponseBodyMediaList getMediaList() {
        return this.mediaList;
    }

    public QueryMediaListResponseBody setNonExistMediaIds(QueryMediaListResponseBodyNonExistMediaIds nonExistMediaIds) {
        this.nonExistMediaIds = nonExistMediaIds;
        return this;
    }
    public QueryMediaListResponseBodyNonExistMediaIds getNonExistMediaIds() {
        return this.nonExistMediaIds;
    }

    public QueryMediaListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class QueryMediaListResponseBodyMediaListMediaFile extends TeaModel {
        /**
         * <p>The status of the input file. Valid values:</p>
         * <ul>
         * <li><strong>Normal</strong>: normal</li>
         * <li><strong>Deleted</strong>: deleted</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("State")
        public String state;

        /**
         * <p>The OSS URL of the input file.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://example-bucket-****.oss-cn-hangzhou.aliyuncs.com//example-****.mp4">http://example-bucket-****.oss-cn-hangzhou.aliyuncs.com//example-****.mp4</a></p>
         */
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

    public static class QueryMediaListResponseBodyMediaListMediaMediaInfoFormat extends TeaModel {
        /**
         * <p>The bitrate.</p>
         * 
         * <strong>example:</strong>
         * <p>2659.326</p>
         */
        @NameInMap("Bitrate")
        public String bitrate;

        /**
         * <p>The total duration.</p>
         * 
         * <strong>example:</strong>
         * <p>7.965000</p>
         */
        @NameInMap("Duration")
        public String duration;

        /**
         * <p>The full name of the container format.</p>
         * 
         * <strong>example:</strong>
         * <p>QuickTime/MOV</p>
         */
        @NameInMap("FormatLongName")
        public String formatLongName;

        /**
         * <p>The short name of the container format. Valid values: mov, mp4, m4a, 3gp, 3g2, and mj2.</p>
         * 
         * <strong>example:</strong>
         * <p>mov</p>
         */
        @NameInMap("FormatName")
        public String formatName;

        /**
         * <p>The total number of program streams.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("NumPrograms")
        public String numPrograms;

        /**
         * <p>The total number of media streams.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("NumStreams")
        public String numStreams;

        /**
         * <p>The size of the file.</p>
         * 
         * <strong>example:</strong>
         * <p>2647692</p>
         */
        @NameInMap("Size")
        public String size;

        /**
         * <p>The start time.</p>
         * 
         * <strong>example:</strong>
         * <p>0.000000</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        public static QueryMediaListResponseBodyMediaListMediaMediaInfoFormat build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaListResponseBodyMediaListMediaMediaInfoFormat self = new QueryMediaListResponseBodyMediaListMediaMediaInfoFormat();
            return TeaModel.build(map, self);
        }

        public QueryMediaListResponseBodyMediaListMediaMediaInfoFormat setBitrate(String bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public String getBitrate() {
            return this.bitrate;
        }

        public QueryMediaListResponseBodyMediaListMediaMediaInfoFormat setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public QueryMediaListResponseBodyMediaListMediaMediaInfoFormat setFormatLongName(String formatLongName) {
            this.formatLongName = formatLongName;
            return this;
        }
        public String getFormatLongName() {
            return this.formatLongName;
        }

        public QueryMediaListResponseBodyMediaListMediaMediaInfoFormat setFormatName(String formatName) {
            this.formatName = formatName;
            return this;
        }
        public String getFormatName() {
            return this.formatName;
        }

        public QueryMediaListResponseBodyMediaListMediaMediaInfoFormat setNumPrograms(String numPrograms) {
            this.numPrograms = numPrograms;
            return this;
        }
        public String getNumPrograms() {
            return this.numPrograms;
        }

        public QueryMediaListResponseBodyMediaListMediaMediaInfoFormat setNumStreams(String numStreams) {
            this.numStreams = numStreams;
            return this;
        }
        public String getNumStreams() {
            return this.numStreams;
        }

        public QueryMediaListResponseBodyMediaListMediaMediaInfoFormat setSize(String size) {
            this.size = size;
            return this;
        }
        public String getSize() {
            return this.size;
        }

        public QueryMediaListResponseBodyMediaListMediaMediaInfoFormat setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

    public static class QueryMediaListResponseBodyMediaListMediaMediaInfoStreamsAudioStreamListAudioStream extends TeaModel {
        /**
         * <p>The bitrate.</p>
         * 
         * <strong>example:</strong>
         * <p>160.008</p>
         */
        @NameInMap("Bitrate")
        public String bitrate;

        /**
         * <p>The output layout of the sound channels.</p>
         * 
         * <strong>example:</strong>
         * <p>stereo</p>
         */
        @NameInMap("ChannelLayout")
        public String channelLayout;

        /**
         * <p>The number of sound channels.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Channels")
        public String channels;

        /**
         * <p>The full name of the encoding format.</p>
         * 
         * <strong>example:</strong>
         * <p>AAC(Advanced Audio Coding)</p>
         */
        @NameInMap("CodecLongName")
        public String codecLongName;

        /**
         * <p>The short name of the encoding format. Valid values: H264, mov, aac, avc, and mpeg.</p>
         * 
         * <strong>example:</strong>
         * <p>mov</p>
         */
        @NameInMap("CodecName")
        public String codecName;

        /**
         * <p>The tag of the encoding format.</p>
         * 
         * <strong>example:</strong>
         * <p>0x6134706d</p>
         */
        @NameInMap("CodecTag")
        public String codecTag;

        /**
         * <p>The tag string of the encoding format.</p>
         * 
         * <strong>example:</strong>
         * <p>mp4a</p>
         */
        @NameInMap("CodecTagString")
        public String codecTagString;

        /**
         * <p>The codec time base.</p>
         * 
         * <strong>example:</strong>
         * <p>1/44100</p>
         */
        @NameInMap("CodecTimeBase")
        public String codecTimeBase;

        /**
         * <p>The duration.</p>
         * 
         * <strong>example:</strong>
         * <p>182.591995</p>
         */
        @NameInMap("Duration")
        public String duration;

        /**
         * <p>The sequence number of the audio stream. The value indicates the position of the audio stream in all audio streams.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Index")
        public String index;

        /**
         * <p>The language. For more information, see <a href="https://www.ffmpeg.org/ffmpeg-all.html#Metadata">FFmpeg documentation</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>und</p>
         */
        @NameInMap("Lang")
        public String lang;

        /**
         * <p>The total number of frames.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("NumFrames")
        public String numFrames;

        /**
         * <p>The sampling format.</p>
         * 
         * <strong>example:</strong>
         * <p>fltp</p>
         */
        @NameInMap("SampleFmt")
        public String sampleFmt;

        /**
         * <p>The sampling rate.</p>
         * 
         * <strong>example:</strong>
         * <p>44100</p>
         */
        @NameInMap("Samplerate")
        public String samplerate;

        /**
         * <p>The start time.</p>
         * 
         * <strong>example:</strong>
         * <p>0.000000</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The time base.</p>
         * 
         * <strong>example:</strong>
         * <p>1/44100</p>
         */
        @NameInMap("Timebase")
        public String timebase;

        public static QueryMediaListResponseBodyMediaListMediaMediaInfoStreamsAudioStreamListAudioStream build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaListResponseBodyMediaListMediaMediaInfoStreamsAudioStreamListAudioStream self = new QueryMediaListResponseBodyMediaListMediaMediaInfoStreamsAudioStreamListAudioStream();
            return TeaModel.build(map, self);
        }

        public QueryMediaListResponseBodyMediaListMediaMediaInfoStreamsAudioStreamListAudioStream setBitrate(String bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public String getBitrate() {
            return this.bitrate;
        }

        public QueryMediaListResponseBodyMediaListMediaMediaInfoStreamsAudioStreamListAudioStream setChannelLayout(String channelLayout) {
            this.channelLayout = channelLayout;
            return this;
        }
        public String getChannelLayout() {
            return this.channelLayout;
        }

        public QueryMediaListResponseBodyMediaListMediaMediaInfoStreamsAudioStreamListAudioStream setChannels(String channels) {
            this.channels = channels;
            return this;
        }
        public String getChannels() {
            return this.channels;
        }

        public QueryMediaListResponseBodyMediaListMediaMediaInfoStreamsAudioStreamListAudioStream setCodecLongName(String codecLongName) {
            this.codecLongName = codecLongName;
            return this;
        }
        public String getCodecLongName() {
            return this.codecLongName;
        }

        public QueryMediaListResponseBodyMediaListMediaMediaInfoStreamsAudioStreamListAudioStream setCodecName(String codecName) {
            this.codecName = codecName;
            return this;
        }
        public String getCodecName() {
            return this.codecName;
        }

        public QueryMediaListResponseBodyMediaListMediaMediaInfoStreamsAudioStreamListAudioStream setCodecTag(String codecTag) {
            this.codecTag = codecTag;
            return this;
        }
        public String getCodecTag() {
            return this.codecTag;
        }

        public QueryMediaListResponseBodyMediaListMediaMediaInfoStreamsAudioStreamListAudioStream setCodecTagString(String codecTagString) {
            this.codecTagString = codecTagString;
            return this;
        }
        public String getCodecTagString() {
            return this.codecTagString;
        }

        public QueryMediaListResponseBodyMediaListMediaMediaInfoStreamsAudioStreamListAudioStream setCodecTimeBase(String codecTimeBase) {
            this.codecTimeBase = codecTimeBase;
            return this;
        }
        public String getCodecTimeBase() {
            return this.codecTimeBase;
        }

        public QueryMediaListResponseBodyMediaListMediaMediaInfoStreamsAudioStreamListAudioStream setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public QueryMediaListResponseBodyMediaListMediaMediaInfoStreamsAudioStreamListAudioStream setIndex(String index) {
            this.index = index;
            return this;
        }
        public String getIndex() {
            return this.index;
        }

        public QueryMediaListResponseBodyMediaListMediaMediaInfoStreamsAudioStreamListAudioStream setLang(String lang) {
            this.lang = lang;
            return this;
        }
        public String getLang() {
            return this.lang;
        }

        public QueryMediaListResponseBodyMediaListMediaMediaInfoStreamsAudioStreamListAudioStream setNumFrames(String numFrames) {
            this.numFrames = numFrames;
            return this;
        }
        public String getNumFrames() {
            return this.numFrames;
        }

        public QueryMediaListResponseBodyMediaListMediaMediaInfoStreamsAudioStreamListAudioStream setSampleFmt(String sampleFmt) {
            this.sampleFmt = sampleFmt;
            return this;
        }
        public String getSampleFmt() {
            return this.sampleFmt;
        }

        public QueryMediaListResponseBodyMediaListMediaMediaInfoStreamsAudioStreamListAudioStream setSamplerate(String samplerate) {
            this.samplerate = samplerate;
            return this;
        }
        public String getSamplerate() {
            return this.samplerate;
        }

        public QueryMediaListResponseBodyMediaListMediaMediaInfoStreamsAudioStreamListAudioStream setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public QueryMediaListResponseBodyMediaListMediaMediaInfoStreamsAudioStreamListAudioStream setTimebase(String timebase) {
            this.timebase = timebase;
            return this;
        }
        public String getTimebase() {
            return this.timebase;
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
        /**
         * <p>The sequence number of the subtitle stream. The value indicates the position of the subtitle stream in all subtitle streams.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Index")
        public String index;

        /**
         * <p>The language. For more information, see <a href="https://www.ffmpeg.org/ffmpeg-all.html#Metadata">FFmpeg documentation</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>und</p>
         */
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

    public static class QueryMediaListResponseBodyMediaListMediaMediaInfoStreamsVideoStreamListVideoStreamNetworkCost extends TeaModel {
        /**
         * <p>The average bitrate.</p>
         * 
         * <strong>example:</strong>
         * <p>2659.326</p>
         */
        @NameInMap("AvgBitrate")
        public String avgBitrate;

        /**
         * <p>The maximum bandwidth that was consumed.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("CostBandwidth")
        public String costBandwidth;

        /**
         * <p>The amount of preload time.</p>
         * 
         * <strong>example:</strong>
         * <p>0.01</p>
         */
        @NameInMap("PreloadTime")
        public String preloadTime;

        public static QueryMediaListResponseBodyMediaListMediaMediaInfoStreamsVideoStreamListVideoStreamNetworkCost build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaListResponseBodyMediaListMediaMediaInfoStreamsVideoStreamListVideoStreamNetworkCost self = new QueryMediaListResponseBodyMediaListMediaMediaInfoStreamsVideoStreamListVideoStreamNetworkCost();
            return TeaModel.build(map, self);
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

        public QueryMediaListResponseBodyMediaListMediaMediaInfoStreamsVideoStreamListVideoStreamNetworkCost setPreloadTime(String preloadTime) {
            this.preloadTime = preloadTime;
            return this;
        }
        public String getPreloadTime() {
            return this.preloadTime;
        }

    }

    public static class QueryMediaListResponseBodyMediaListMediaMediaInfoStreamsVideoStreamListVideoStream extends TeaModel {
        /**
         * <p>The average frame rate.</p>
         * 
         * <strong>example:</strong>
         * <p>29.97003</p>
         */
        @NameInMap("AvgFPS")
        public String avgFPS;

        /**
         * <p>The bitrate.</p>
         * 
         * <strong>example:</strong>
         * <p>2659.326</p>
         */
        @NameInMap("Bitrate")
        public String bitrate;

        /**
         * <p>The full name of the encoding format.</p>
         * 
         * <strong>example:</strong>
         * <p>QuickTime/MOV</p>
         */
        @NameInMap("CodecLongName")
        public String codecLongName;

        /**
         * <p>The short name of the encoding format. Valid values: mov, mp4, m4a, 3gp, 3g2, and mj2.</p>
         * 
         * <strong>example:</strong>
         * <p>mov</p>
         */
        @NameInMap("CodecName")
        public String codecName;

        /**
         * <p>The tag of the encoding format.</p>
         * 
         * <strong>example:</strong>
         * <p>0x31637661</p>
         */
        @NameInMap("CodecTag")
        public String codecTag;

        /**
         * <p>The tag string of the encoding format.</p>
         * 
         * <strong>example:</strong>
         * <p>avc1</p>
         */
        @NameInMap("CodecTagString")
        public String codecTagString;

        /**
         * <p>The codec time base.</p>
         * 
         * <strong>example:</strong>
         * <p>1001/60000</p>
         */
        @NameInMap("CodecTimeBase")
        public String codecTimeBase;

        /**
         * <p>The display aspect ratio (DAR).</p>
         * 
         * <strong>example:</strong>
         * <p>16:9</p>
         */
        @NameInMap("Dar")
        public String dar;

        /**
         * <p>The duration.</p>
         * 
         * <strong>example:</strong>
         * <p>182.683000</p>
         */
        @NameInMap("Duration")
        public String duration;

        /**
         * <p>The frame rate.</p>
         * 
         * <strong>example:</strong>
         * <p>29.97003</p>
         */
        @NameInMap("Fps")
        public String fps;

        /**
         * <p>Indicates whether the video stream contains bidirectional frames (B-frames). A value of <strong>1</strong> indicates that the video stream contains B-frames. A value of <strong>2</strong> indicates that the video stream does not contain B-frames.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("HasBFrames")
        public String hasBFrames;

        /**
         * <p>The latter number in the video resolution. The number indicates the video height.</p>
         * 
         * <strong>example:</strong>
         * <p>1080</p>
         */
        @NameInMap("Height")
        public String height;

        /**
         * <p>The sequence number of the video stream. The value indicates the position of the video stream in all video streams.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("Index")
        public String index;

        /**
         * <p>The language. For more information, see <a href="https://www.ffmpeg.org/ffmpeg-all.html#Metadata">FFmpeg documentation</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>und</p>
         */
        @NameInMap("Lang")
        public String lang;

        /**
         * <p>The codec level.</p>
         * 
         * <strong>example:</strong>
         * <p>40</p>
         */
        @NameInMap("Level")
        public String level;

        /**
         * <p>The network bandwidth consumption.</p>
         */
        @NameInMap("NetworkCost")
        public QueryMediaListResponseBodyMediaListMediaMediaInfoStreamsVideoStreamListVideoStreamNetworkCost networkCost;

        /**
         * <p>The total number of frames.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("NumFrames")
        public String numFrames;

        /**
         * <p>The pixel format.</p>
         * 
         * <strong>example:</strong>
         * <p>yuv420p</p>
         */
        @NameInMap("PixFmt")
        public String pixFmt;

        /**
         * <p>The codec profile.</p>
         * 
         * <strong>example:</strong>
         * <p>High</p>
         */
        @NameInMap("Profile")
        public String profile;

        /**
         * <p>The video rotation angle.</p>
         * 
         * <strong>example:</strong>
         * <p>90</p>
         */
        @NameInMap("Rotate")
        public String rotate;

        /**
         * <p>The sample aspect ratio (SAR).</p>
         * 
         * <strong>example:</strong>
         * <p>1:1</p>
         */
        @NameInMap("Sar")
        public String sar;

        /**
         * <p>The start time.</p>
         * 
         * <strong>example:</strong>
         * <p>0.000000</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The time base.</p>
         * 
         * <strong>example:</strong>
         * <p>1/30000</p>
         */
        @NameInMap("Timebase")
        public String timebase;

        /**
         * <p>The former number in the video resolution. The number indicates the video width.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Width")
        public String width;

        public static QueryMediaListResponseBodyMediaListMediaMediaInfoStreamsVideoStreamListVideoStream build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaListResponseBodyMediaListMediaMediaInfoStreamsVideoStreamListVideoStream self = new QueryMediaListResponseBodyMediaListMediaMediaInfoStreamsVideoStreamListVideoStream();
            return TeaModel.build(map, self);
        }

        public QueryMediaListResponseBodyMediaListMediaMediaInfoStreamsVideoStreamListVideoStream setAvgFPS(String avgFPS) {
            this.avgFPS = avgFPS;
            return this;
        }
        public String getAvgFPS() {
            return this.avgFPS;
        }

        public QueryMediaListResponseBodyMediaListMediaMediaInfoStreamsVideoStreamListVideoStream setBitrate(String bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public String getBitrate() {
            return this.bitrate;
        }

        public QueryMediaListResponseBodyMediaListMediaMediaInfoStreamsVideoStreamListVideoStream setCodecLongName(String codecLongName) {
            this.codecLongName = codecLongName;
            return this;
        }
        public String getCodecLongName() {
            return this.codecLongName;
        }

        public QueryMediaListResponseBodyMediaListMediaMediaInfoStreamsVideoStreamListVideoStream setCodecName(String codecName) {
            this.codecName = codecName;
            return this;
        }
        public String getCodecName() {
            return this.codecName;
        }

        public QueryMediaListResponseBodyMediaListMediaMediaInfoStreamsVideoStreamListVideoStream setCodecTag(String codecTag) {
            this.codecTag = codecTag;
            return this;
        }
        public String getCodecTag() {
            return this.codecTag;
        }

        public QueryMediaListResponseBodyMediaListMediaMediaInfoStreamsVideoStreamListVideoStream setCodecTagString(String codecTagString) {
            this.codecTagString = codecTagString;
            return this;
        }
        public String getCodecTagString() {
            return this.codecTagString;
        }

        public QueryMediaListResponseBodyMediaListMediaMediaInfoStreamsVideoStreamListVideoStream setCodecTimeBase(String codecTimeBase) {
            this.codecTimeBase = codecTimeBase;
            return this;
        }
        public String getCodecTimeBase() {
            return this.codecTimeBase;
        }

        public QueryMediaListResponseBodyMediaListMediaMediaInfoStreamsVideoStreamListVideoStream setDar(String dar) {
            this.dar = dar;
            return this;
        }
        public String getDar() {
            return this.dar;
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

        public QueryMediaListResponseBodyMediaListMediaMediaInfoStreamsVideoStreamListVideoStream setHasBFrames(String hasBFrames) {
            this.hasBFrames = hasBFrames;
            return this;
        }
        public String getHasBFrames() {
            return this.hasBFrames;
        }

        public QueryMediaListResponseBodyMediaListMediaMediaInfoStreamsVideoStreamListVideoStream setHeight(String height) {
            this.height = height;
            return this;
        }
        public String getHeight() {
            return this.height;
        }

        public QueryMediaListResponseBodyMediaListMediaMediaInfoStreamsVideoStreamListVideoStream setIndex(String index) {
            this.index = index;
            return this;
        }
        public String getIndex() {
            return this.index;
        }

        public QueryMediaListResponseBodyMediaListMediaMediaInfoStreamsVideoStreamListVideoStream setLang(String lang) {
            this.lang = lang;
            return this;
        }
        public String getLang() {
            return this.lang;
        }

        public QueryMediaListResponseBodyMediaListMediaMediaInfoStreamsVideoStreamListVideoStream setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public QueryMediaListResponseBodyMediaListMediaMediaInfoStreamsVideoStreamListVideoStream setNetworkCost(QueryMediaListResponseBodyMediaListMediaMediaInfoStreamsVideoStreamListVideoStreamNetworkCost networkCost) {
            this.networkCost = networkCost;
            return this;
        }
        public QueryMediaListResponseBodyMediaListMediaMediaInfoStreamsVideoStreamListVideoStreamNetworkCost getNetworkCost() {
            return this.networkCost;
        }

        public QueryMediaListResponseBodyMediaListMediaMediaInfoStreamsVideoStreamListVideoStream setNumFrames(String numFrames) {
            this.numFrames = numFrames;
            return this;
        }
        public String getNumFrames() {
            return this.numFrames;
        }

        public QueryMediaListResponseBodyMediaListMediaMediaInfoStreamsVideoStreamListVideoStream setPixFmt(String pixFmt) {
            this.pixFmt = pixFmt;
            return this;
        }
        public String getPixFmt() {
            return this.pixFmt;
        }

        public QueryMediaListResponseBodyMediaListMediaMediaInfoStreamsVideoStreamListVideoStream setProfile(String profile) {
            this.profile = profile;
            return this;
        }
        public String getProfile() {
            return this.profile;
        }

        public QueryMediaListResponseBodyMediaListMediaMediaInfoStreamsVideoStreamListVideoStream setRotate(String rotate) {
            this.rotate = rotate;
            return this;
        }
        public String getRotate() {
            return this.rotate;
        }

        public QueryMediaListResponseBodyMediaListMediaMediaInfoStreamsVideoStreamListVideoStream setSar(String sar) {
            this.sar = sar;
            return this;
        }
        public String getSar() {
            return this.sar;
        }

        public QueryMediaListResponseBodyMediaListMediaMediaInfoStreamsVideoStreamListVideoStream setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public QueryMediaListResponseBodyMediaListMediaMediaInfoStreamsVideoStreamListVideoStream setTimebase(String timebase) {
            this.timebase = timebase;
            return this;
        }
        public String getTimebase() {
            return this.timebase;
        }

        public QueryMediaListResponseBodyMediaListMediaMediaInfoStreamsVideoStreamListVideoStream setWidth(String width) {
            this.width = width;
            return this;
        }
        public String getWidth() {
            return this.width;
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

    public static class QueryMediaListResponseBodyMediaListMediaMediaInfoStreams extends TeaModel {
        /**
         * <p>The list of audio streams.</p>
         */
        @NameInMap("AudioStreamList")
        public QueryMediaListResponseBodyMediaListMediaMediaInfoStreamsAudioStreamList audioStreamList;

        /**
         * <p>The list of subtitle streams.</p>
         */
        @NameInMap("SubtitleStreamList")
        public QueryMediaListResponseBodyMediaListMediaMediaInfoStreamsSubtitleStreamList subtitleStreamList;

        /**
         * <p>The list of video streams.</p>
         */
        @NameInMap("VideoStreamList")
        public QueryMediaListResponseBodyMediaListMediaMediaInfoStreamsVideoStreamList videoStreamList;

        public static QueryMediaListResponseBodyMediaListMediaMediaInfoStreams build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaListResponseBodyMediaListMediaMediaInfoStreams self = new QueryMediaListResponseBodyMediaListMediaMediaInfoStreams();
            return TeaModel.build(map, self);
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

        public QueryMediaListResponseBodyMediaListMediaMediaInfoStreams setVideoStreamList(QueryMediaListResponseBodyMediaListMediaMediaInfoStreamsVideoStreamList videoStreamList) {
            this.videoStreamList = videoStreamList;
            return this;
        }
        public QueryMediaListResponseBodyMediaListMediaMediaInfoStreamsVideoStreamList getVideoStreamList() {
            return this.videoStreamList;
        }

    }

    public static class QueryMediaListResponseBodyMediaListMediaMediaInfo extends TeaModel {
        /**
         * <p>The format information.</p>
         */
        @NameInMap("Format")
        public QueryMediaListResponseBodyMediaListMediaMediaInfoFormat format;

        /**
         * <p>The stream information.</p>
         */
        @NameInMap("Streams")
        public QueryMediaListResponseBodyMediaListMediaMediaInfoStreams streams;

        public static QueryMediaListResponseBodyMediaListMediaMediaInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaListResponseBodyMediaListMediaMediaInfo self = new QueryMediaListResponseBodyMediaListMediaMediaInfo();
            return TeaModel.build(map, self);
        }

        public QueryMediaListResponseBodyMediaListMediaMediaInfo setFormat(QueryMediaListResponseBodyMediaListMediaMediaInfoFormat format) {
            this.format = format;
            return this;
        }
        public QueryMediaListResponseBodyMediaListMediaMediaInfoFormat getFormat() {
            return this.format;
        }

        public QueryMediaListResponseBodyMediaListMediaMediaInfo setStreams(QueryMediaListResponseBodyMediaListMediaMediaInfoStreams streams) {
            this.streams = streams;
            return this;
        }
        public QueryMediaListResponseBodyMediaListMediaMediaInfoStreams getStreams() {
            return this.streams;
        }

    }

    public static class QueryMediaListResponseBodyMediaListMediaPlayListPlayFile extends TeaModel {
        /**
         * <p>The status of the file. Valid values:</p>
         * <ul>
         * <li><strong>Normal</strong>: normal</li>
         * <li><strong>Deleted</strong>: deleted</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("State")
        public String state;

        /**
         * <p>The Object Storage Service (OSS) URL of the output file.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://example-bucket-****.oss-cn-hangzhou.aliyuncs.com//example-****.mp4">http://example-bucket-****.oss-cn-hangzhou.aliyuncs.com//example-****.mp4</a></p>
         */
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
        /**
         * <p>The name of the workflow activity.</p>
         * 
         * <strong>example:</strong>
         * <p>example-activity-****</p>
         */
        @NameInMap("ActivityName")
        public String activityName;

        /**
         * <p>The bitrate of the media file.</p>
         * 
         * <strong>example:</strong>
         * <p>2659.326</p>
         */
        @NameInMap("Bitrate")
        public String bitrate;

        /**
         * <p>The duration of the media file.</p>
         * 
         * <strong>example:</strong>
         * <p>7.965000</p>
         */
        @NameInMap("Duration")
        public String duration;

        /**
         * <p>Indicates whether the media file is encrypted. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: The media file is not encrypted.</li>
         * <li><strong>1</strong>: The media file is encrypted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Encryption")
        public String encryption;

        /**
         * <p>The playback file.</p>
         */
        @NameInMap("File")
        public QueryMediaListResponseBodyMediaListMediaPlayListPlayFile file;

        /**
         * <p>The encoding format of the media file. Valid values: mov, mp4, m4a, 3gp, 3g2, and mj2.</p>
         * 
         * <strong>example:</strong>
         * <p>mp4</p>
         */
        @NameInMap("Format")
        public String format;

        /**
         * <p>The frame rate of the media file.</p>
         * 
         * <strong>example:</strong>
         * <p>25.0</p>
         */
        @NameInMap("Fps")
        public String fps;

        /**
         * <p>The height.</p>
         * 
         * <strong>example:</strong>
         * <p>1080</p>
         */
        @NameInMap("Height")
        public String height;

        /**
         * <p>The ID of the workflow that generates the playback file.</p>
         * 
         * <strong>example:</strong>
         * <p>93ab850b4f6f44eab54b6e91d24d****</p>
         */
        @NameInMap("MediaWorkflowId")
        public String mediaWorkflowId;

        /**
         * <p>The name of the workflow that generates the playback file.</p>
         * 
         * <strong>example:</strong>
         * <p>example-mediaworkflow-****</p>
         */
        @NameInMap("MediaWorkflowName")
        public String mediaWorkflowName;

        /**
         * <p>The size of the media file.</p>
         * 
         * <strong>example:</strong>
         * <p>2647692</p>
         */
        @NameInMap("Size")
        public String size;

        /**
         * <p>The width of the media file.</p>
         * 
         * <strong>example:</strong>
         * <p>760</p>
         */
        @NameInMap("Width")
        public String width;

        public static QueryMediaListResponseBodyMediaListMediaPlayListPlay build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaListResponseBodyMediaListMediaPlayListPlay self = new QueryMediaListResponseBodyMediaListMediaPlayListPlay();
            return TeaModel.build(map, self);
        }

        public QueryMediaListResponseBodyMediaListMediaPlayListPlay setActivityName(String activityName) {
            this.activityName = activityName;
            return this;
        }
        public String getActivityName() {
            return this.activityName;
        }

        public QueryMediaListResponseBodyMediaListMediaPlayListPlay setBitrate(String bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public String getBitrate() {
            return this.bitrate;
        }

        public QueryMediaListResponseBodyMediaListMediaPlayListPlay setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public QueryMediaListResponseBodyMediaListMediaPlayListPlay setEncryption(String encryption) {
            this.encryption = encryption;
            return this;
        }
        public String getEncryption() {
            return this.encryption;
        }

        public QueryMediaListResponseBodyMediaListMediaPlayListPlay setFile(QueryMediaListResponseBodyMediaListMediaPlayListPlayFile file) {
            this.file = file;
            return this;
        }
        public QueryMediaListResponseBodyMediaListMediaPlayListPlayFile getFile() {
            return this.file;
        }

        public QueryMediaListResponseBodyMediaListMediaPlayListPlay setFormat(String format) {
            this.format = format;
            return this;
        }
        public String getFormat() {
            return this.format;
        }

        public QueryMediaListResponseBodyMediaListMediaPlayListPlay setFps(String fps) {
            this.fps = fps;
            return this;
        }
        public String getFps() {
            return this.fps;
        }

        public QueryMediaListResponseBodyMediaListMediaPlayListPlay setHeight(String height) {
            this.height = height;
            return this;
        }
        public String getHeight() {
            return this.height;
        }

        public QueryMediaListResponseBodyMediaListMediaPlayListPlay setMediaWorkflowId(String mediaWorkflowId) {
            this.mediaWorkflowId = mediaWorkflowId;
            return this;
        }
        public String getMediaWorkflowId() {
            return this.mediaWorkflowId;
        }

        public QueryMediaListResponseBodyMediaListMediaPlayListPlay setMediaWorkflowName(String mediaWorkflowName) {
            this.mediaWorkflowName = mediaWorkflowName;
            return this;
        }
        public String getMediaWorkflowName() {
            return this.mediaWorkflowName;
        }

        public QueryMediaListResponseBodyMediaListMediaPlayListPlay setSize(String size) {
            this.size = size;
            return this;
        }
        public String getSize() {
            return this.size;
        }

        public QueryMediaListResponseBodyMediaListMediaPlayListPlay setWidth(String width) {
            this.width = width;
            return this;
        }
        public String getWidth() {
            return this.width;
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

    public static class QueryMediaListResponseBodyMediaListMediaSnapshotListSnapshotFile extends TeaModel {
        /**
         * <p>The status of the file. Valid values:</p>
         * <ul>
         * <li><strong>Normal</strong>: normal</li>
         * <li><strong>Deleted</strong>: deleted</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("State")
        public String state;

        /**
         * <p>The OSS URL of the snapshot.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://example1-bucket1-****.oss-cn-hangzhou.aliyuncs.com//example111-****.png">http://example1-bucket1-****.oss-cn-hangzhou.aliyuncs.com//example111-****.png</a></p>
         */
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
        /**
         * <p>The name of the workflow activity that generates the snapshot.</p>
         * 
         * <strong>example:</strong>
         * <p>example-activity1-****</p>
         */
        @NameInMap("ActivityName")
        public String activityName;

        /**
         * <p>The number of snapshots. This parameter is valid only when the value of the <strong>Type</strong> parameter is <strong>Sequence</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("Count")
        public String count;

        /**
         * <p>The snapshot.</p>
         */
        @NameInMap("File")
        public QueryMediaListResponseBodyMediaListMediaSnapshotListSnapshotFile file;

        /**
         * <p>The ID of the workflow that generates the snapshot.</p>
         * 
         * <strong>example:</strong>
         * <p>6cc3aa66d1cb4bb2adf14e726c0a****</p>
         */
        @NameInMap("MediaWorkflowId")
        public String mediaWorkflowId;

        /**
         * <p>The name of the workflow that generates the snapshot.</p>
         * 
         * <strong>example:</strong>
         * <p>example-workflow-****</p>
         */
        @NameInMap("MediaWorkflowName")
        public String mediaWorkflowName;

        /**
         * <p>The type of the snapshot. Valid values:</p>
         * <ul>
         * <li><strong>Single</strong></li>
         * <li><strong>Sequence</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Sequence</p>
         */
        @NameInMap("Type")
        public String type;

        public static QueryMediaListResponseBodyMediaListMediaSnapshotListSnapshot build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaListResponseBodyMediaListMediaSnapshotListSnapshot self = new QueryMediaListResponseBodyMediaListMediaSnapshotListSnapshot();
            return TeaModel.build(map, self);
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

        public QueryMediaListResponseBodyMediaListMediaSnapshotListSnapshot setFile(QueryMediaListResponseBodyMediaListMediaSnapshotListSnapshotFile file) {
            this.file = file;
            return this;
        }
        public QueryMediaListResponseBodyMediaListMediaSnapshotListSnapshotFile getFile() {
            return this.file;
        }

        public QueryMediaListResponseBodyMediaListMediaSnapshotListSnapshot setMediaWorkflowId(String mediaWorkflowId) {
            this.mediaWorkflowId = mediaWorkflowId;
            return this;
        }
        public String getMediaWorkflowId() {
            return this.mediaWorkflowId;
        }

        public QueryMediaListResponseBodyMediaListMediaSnapshotListSnapshot setMediaWorkflowName(String mediaWorkflowName) {
            this.mediaWorkflowName = mediaWorkflowName;
            return this;
        }
        public String getMediaWorkflowName() {
            return this.mediaWorkflowName;
        }

        public QueryMediaListResponseBodyMediaListMediaSnapshotListSnapshot setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
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

    public static class QueryMediaListResponseBodyMediaListMediaSummaryListSummaryFile extends TeaModel {
        /**
         * <p>The status of the file. Valid values:</p>
         * <ul>
         * <li><strong>Normal</strong>: normal</li>
         * <li><strong>Deleted</strong>: deleted</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("State")
        public String state;

        /**
         * <p>The OSS URL of the input file.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://example-bucket-****.oss-cn-hangzhou.aliyuncs.com//example-****.mp4">http://example-bucket-****.oss-cn-hangzhou.aliyuncs.com//example-****.mp4</a></p>
         */
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
        /**
         * <p>The name of the workflow activity.</p>
         * 
         * <strong>example:</strong>
         * <p>example-activity-****</p>
         */
        @NameInMap("ActivityName")
        public String activityName;

        /**
         * <p>The information about the input file.</p>
         */
        @NameInMap("File")
        public QueryMediaListResponseBodyMediaListMediaSummaryListSummaryFile file;

        /**
         * <p>The ID of the workflow that generates the summary.</p>
         * 
         * <strong>example:</strong>
         * <p>93ab850b4f6f44eab54b6e91d24d****</p>
         */
        @NameInMap("MediaWorkflowId")
        public String mediaWorkflowId;

        /**
         * <p>The name of the workflow that generates the summary.</p>
         * 
         * <strong>example:</strong>
         * <p>example-mediaworkflow-****</p>
         */
        @NameInMap("MediaWorkflowName")
        public String mediaWorkflowName;

        /**
         * <p>The type of the summary. Valid values:</p>
         * <ul>
         * <li><strong>Video</strong>: video</li>
         * <li><strong>Gif</strong>: dynamic image</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Video</p>
         */
        @NameInMap("Type")
        public String type;

        public static QueryMediaListResponseBodyMediaListMediaSummaryListSummary build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaListResponseBodyMediaListMediaSummaryListSummary self = new QueryMediaListResponseBodyMediaListMediaSummaryListSummary();
            return TeaModel.build(map, self);
        }

        public QueryMediaListResponseBodyMediaListMediaSummaryListSummary setActivityName(String activityName) {
            this.activityName = activityName;
            return this;
        }
        public String getActivityName() {
            return this.activityName;
        }

        public QueryMediaListResponseBodyMediaListMediaSummaryListSummary setFile(QueryMediaListResponseBodyMediaListMediaSummaryListSummaryFile file) {
            this.file = file;
            return this;
        }
        public QueryMediaListResponseBodyMediaListMediaSummaryListSummaryFile getFile() {
            return this.file;
        }

        public QueryMediaListResponseBodyMediaListMediaSummaryListSummary setMediaWorkflowId(String mediaWorkflowId) {
            this.mediaWorkflowId = mediaWorkflowId;
            return this;
        }
        public String getMediaWorkflowId() {
            return this.mediaWorkflowId;
        }

        public QueryMediaListResponseBodyMediaListMediaSummaryListSummary setMediaWorkflowName(String mediaWorkflowName) {
            this.mediaWorkflowName = mediaWorkflowName;
            return this;
        }
        public String getMediaWorkflowName() {
            return this.mediaWorkflowName;
        }

        public QueryMediaListResponseBodyMediaListMediaSummaryListSummary setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
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

    public static class QueryMediaListResponseBodyMediaListMedia extends TeaModel {
        /**
         * <p>The bitrate.</p>
         * 
         * <strong>example:</strong>
         * <p>2659.326</p>
         */
        @NameInMap("Bitrate")
        public String bitrate;

        /**
         * <p>The ID of the category to which the media file belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CateId")
        public Long cateId;

        /**
         * <p>The review status of the media file. Valid values:</p>
         * <ul>
         * <li><strong>Initiated</strong>: The media file is uploaded but not reviewed.</li>
         * <li><strong>Pass</strong>: The media file is uploaded and passes the review.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Initiated</p>
         */
        @NameInMap("CensorState")
        public String censorState;

        /**
         * <p>The OSS URL of the thumbnail.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://example-bucket1-****.oss-cn-hangzhou.aliyuncs.com//example-****.png">http://example-bucket1-****.oss-cn-hangzhou.aliyuncs.com//example-****.png</a></p>
         */
        @NameInMap("CoverURL")
        public String coverURL;

        /**
         * <p>The time when the media file was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2016-09-14T08:30:33Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The description.</p>
         * 
         * <strong>example:</strong>
         * <p>This is description ****</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The duration.</p>
         * 
         * <strong>example:</strong>
         * <p>7.965000</p>
         */
        @NameInMap("Duration")
        public String duration;

        /**
         * <p>The details of the input file.</p>
         */
        @NameInMap("File")
        public QueryMediaListResponseBodyMediaListMediaFile file;

        /**
         * <p>The encoding format. Valid values: mov, mp4, m4a, 3gp, 3g2, and mj2.</p>
         * 
         * <strong>example:</strong>
         * <p>mov</p>
         */
        @NameInMap("Format")
        public String format;

        /**
         * <p>The frame rate.</p>
         * 
         * <strong>example:</strong>
         * <p>25.0</p>
         */
        @NameInMap("Fps")
        public String fps;

        /**
         * <p>The height of the media file.</p>
         * 
         * <strong>example:</strong>
         * <p>1080</p>
         */
        @NameInMap("Height")
        public String height;

        /**
         * <p>The ID of the media file.</p>
         * 
         * <strong>example:</strong>
         * <p>3e1cd21131a94525be55acf65888****</p>
         */
        @NameInMap("MediaId")
        public String mediaId;

        /**
         * <p>The media information.</p>
         */
        @NameInMap("MediaInfo")
        public QueryMediaListResponseBodyMediaListMediaMediaInfo mediaInfo;

        /**
         * <p>The playlist.</p>
         */
        @NameInMap("PlayList")
        public QueryMediaListResponseBodyMediaListMediaPlayList playList;

        /**
         * <p>The publishing status of the media file. Valid values:</p>
         * <ul>
         * <li><strong>Initiated</strong>: The media file is in the initial state.</li>
         * <li><strong>UnPublish</strong>: The media file has not been published, and the playback permission on the OSS object is Private.</li>
         * <li><strong>Published</strong>: The media file has been published, and the playback permission on the OSS object is Default.</li>
         * <li><strong>Deleted</strong>: The media file has been deleted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Published</p>
         */
        @NameInMap("PublishState")
        public String publishState;

        /**
         * <p>The ID of the instance.</p>
         */
        @NameInMap("RunIdList")
        public QueryMediaListResponseBodyMediaListMediaRunIdList runIdList;

        /**
         * <p>The size of the file.</p>
         * 
         * <strong>example:</strong>
         * <p>2647692</p>
         */
        @NameInMap("Size")
        public String size;

        /**
         * <p>The list of snapshots.</p>
         */
        @NameInMap("SnapshotList")
        public QueryMediaListResponseBodyMediaListMediaSnapshotList snapshotList;

        /**
         * <p>The list of video summaries.</p>
         */
        @NameInMap("SummaryList")
        public QueryMediaListResponseBodyMediaListMediaSummaryList summaryList;

        /**
         * <p>The tags of the media file.</p>
         */
        @NameInMap("Tags")
        public QueryMediaListResponseBodyMediaListMediaTags tags;

        /**
         * <p>The title.</p>
         * 
         * <strong>example:</strong>
         * <p>example-title-****</p>
         */
        @NameInMap("Title")
        public String title;

        /**
         * <p>The width.</p>
         * 
         * <strong>example:</strong>
         * <p>1920</p>
         */
        @NameInMap("Width")
        public String width;

        public static QueryMediaListResponseBodyMediaListMedia build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaListResponseBodyMediaListMedia self = new QueryMediaListResponseBodyMediaListMedia();
            return TeaModel.build(map, self);
        }

        public QueryMediaListResponseBodyMediaListMedia setBitrate(String bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public String getBitrate() {
            return this.bitrate;
        }

        public QueryMediaListResponseBodyMediaListMedia setCateId(Long cateId) {
            this.cateId = cateId;
            return this;
        }
        public Long getCateId() {
            return this.cateId;
        }

        public QueryMediaListResponseBodyMediaListMedia setCensorState(String censorState) {
            this.censorState = censorState;
            return this;
        }
        public String getCensorState() {
            return this.censorState;
        }

        public QueryMediaListResponseBodyMediaListMedia setCoverURL(String coverURL) {
            this.coverURL = coverURL;
            return this;
        }
        public String getCoverURL() {
            return this.coverURL;
        }

        public QueryMediaListResponseBodyMediaListMedia setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public QueryMediaListResponseBodyMediaListMedia setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QueryMediaListResponseBodyMediaListMedia setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public QueryMediaListResponseBodyMediaListMedia setFile(QueryMediaListResponseBodyMediaListMediaFile file) {
            this.file = file;
            return this;
        }
        public QueryMediaListResponseBodyMediaListMediaFile getFile() {
            return this.file;
        }

        public QueryMediaListResponseBodyMediaListMedia setFormat(String format) {
            this.format = format;
            return this;
        }
        public String getFormat() {
            return this.format;
        }

        public QueryMediaListResponseBodyMediaListMedia setFps(String fps) {
            this.fps = fps;
            return this;
        }
        public String getFps() {
            return this.fps;
        }

        public QueryMediaListResponseBodyMediaListMedia setHeight(String height) {
            this.height = height;
            return this;
        }
        public String getHeight() {
            return this.height;
        }

        public QueryMediaListResponseBodyMediaListMedia setMediaId(String mediaId) {
            this.mediaId = mediaId;
            return this;
        }
        public String getMediaId() {
            return this.mediaId;
        }

        public QueryMediaListResponseBodyMediaListMedia setMediaInfo(QueryMediaListResponseBodyMediaListMediaMediaInfo mediaInfo) {
            this.mediaInfo = mediaInfo;
            return this;
        }
        public QueryMediaListResponseBodyMediaListMediaMediaInfo getMediaInfo() {
            return this.mediaInfo;
        }

        public QueryMediaListResponseBodyMediaListMedia setPlayList(QueryMediaListResponseBodyMediaListMediaPlayList playList) {
            this.playList = playList;
            return this;
        }
        public QueryMediaListResponseBodyMediaListMediaPlayList getPlayList() {
            return this.playList;
        }

        public QueryMediaListResponseBodyMediaListMedia setPublishState(String publishState) {
            this.publishState = publishState;
            return this;
        }
        public String getPublishState() {
            return this.publishState;
        }

        public QueryMediaListResponseBodyMediaListMedia setRunIdList(QueryMediaListResponseBodyMediaListMediaRunIdList runIdList) {
            this.runIdList = runIdList;
            return this;
        }
        public QueryMediaListResponseBodyMediaListMediaRunIdList getRunIdList() {
            return this.runIdList;
        }

        public QueryMediaListResponseBodyMediaListMedia setSize(String size) {
            this.size = size;
            return this;
        }
        public String getSize() {
            return this.size;
        }

        public QueryMediaListResponseBodyMediaListMedia setSnapshotList(QueryMediaListResponseBodyMediaListMediaSnapshotList snapshotList) {
            this.snapshotList = snapshotList;
            return this;
        }
        public QueryMediaListResponseBodyMediaListMediaSnapshotList getSnapshotList() {
            return this.snapshotList;
        }

        public QueryMediaListResponseBodyMediaListMedia setSummaryList(QueryMediaListResponseBodyMediaListMediaSummaryList summaryList) {
            this.summaryList = summaryList;
            return this;
        }
        public QueryMediaListResponseBodyMediaListMediaSummaryList getSummaryList() {
            return this.summaryList;
        }

        public QueryMediaListResponseBodyMediaListMedia setTags(QueryMediaListResponseBodyMediaListMediaTags tags) {
            this.tags = tags;
            return this;
        }
        public QueryMediaListResponseBodyMediaListMediaTags getTags() {
            return this.tags;
        }

        public QueryMediaListResponseBodyMediaListMedia setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public QueryMediaListResponseBodyMediaListMedia setWidth(String width) {
            this.width = width;
            return this;
        }
        public String getWidth() {
            return this.width;
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

}
