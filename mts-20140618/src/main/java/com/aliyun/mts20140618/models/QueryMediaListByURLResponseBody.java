// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class QueryMediaListByURLResponseBody extends TeaModel {
    /**
     * <p>The list of media files.</p>
     */
    @NameInMap("MediaList")
    public QueryMediaListByURLResponseBodyMediaList mediaList;

    /**
     * <p>The IDs of the media files that do not exist. This parameter is not returned if all specified media files exist.</p>
     */
    @NameInMap("NonExistFileURLs")
    public QueryMediaListByURLResponseBodyNonExistFileURLs nonExistFileURLs;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>1C8A0AEB-4321-485B-B4CB-DA4E9E6C9B42</p>
     */
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

    public static class QueryMediaListByURLResponseBodyMediaListMediaFile extends TeaModel {
        /**
         * <p>The status of the media file. Valid values:</p>
         * <ul>
         * <li><strong>Normal</strong>: The file is normal.</li>
         * <li><strong>Deleted</strong>: The file is deleted.</li>
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

    public static class QueryMediaListByURLResponseBodyMediaListMediaMediaInfoFormat extends TeaModel {
        /**
         * <p>The bitrate.</p>
         * 
         * <strong>example:</strong>
         * <p>593.192</p>
         */
        @NameInMap("Bitrate")
        public String bitrate;

        /**
         * <p>The duration.</p>
         * 
         * <strong>example:</strong>
         * <p>79.204000</p>
         */
        @NameInMap("Duration")
        public String duration;

        /**
         * <p>The full name of the encoding format.</p>
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
         * <p>0</p>
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
         * <p>The size.</p>
         * 
         * <strong>example:</strong>
         * <p>5872904</p>
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

        public static QueryMediaListByURLResponseBodyMediaListMediaMediaInfoFormat build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaListByURLResponseBodyMediaListMediaMediaInfoFormat self = new QueryMediaListByURLResponseBodyMediaListMediaMediaInfoFormat();
            return TeaModel.build(map, self);
        }

        public QueryMediaListByURLResponseBodyMediaListMediaMediaInfoFormat setBitrate(String bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public String getBitrate() {
            return this.bitrate;
        }

        public QueryMediaListByURLResponseBodyMediaListMediaMediaInfoFormat setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public QueryMediaListByURLResponseBodyMediaListMediaMediaInfoFormat setFormatLongName(String formatLongName) {
            this.formatLongName = formatLongName;
            return this;
        }
        public String getFormatLongName() {
            return this.formatLongName;
        }

        public QueryMediaListByURLResponseBodyMediaListMediaMediaInfoFormat setFormatName(String formatName) {
            this.formatName = formatName;
            return this;
        }
        public String getFormatName() {
            return this.formatName;
        }

        public QueryMediaListByURLResponseBodyMediaListMediaMediaInfoFormat setNumPrograms(String numPrograms) {
            this.numPrograms = numPrograms;
            return this;
        }
        public String getNumPrograms() {
            return this.numPrograms;
        }

        public QueryMediaListByURLResponseBodyMediaListMediaMediaInfoFormat setNumStreams(String numStreams) {
            this.numStreams = numStreams;
            return this;
        }
        public String getNumStreams() {
            return this.numStreams;
        }

        public QueryMediaListByURLResponseBodyMediaListMediaMediaInfoFormat setSize(String size) {
            this.size = size;
            return this;
        }
        public String getSize() {
            return this.size;
        }

        public QueryMediaListByURLResponseBodyMediaListMediaMediaInfoFormat setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

    public static class QueryMediaListByURLResponseBodyMediaListMediaMediaInfoStreamsAudioStreamListAudioStream extends TeaModel {
        /**
         * <p>The bitrate.</p>
         * 
         * <strong>example:</strong>
         * <p>76.356</p>
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
         * <p>AAC (Advanced Audio Coding)</p>
         */
        @NameInMap("CodecLongName")
        public String codecLongName;

        /**
         * <p>The short name of the encoding format. Valid values: H264, mov, aac, avc, and mpeg.</p>
         * 
         * <strong>example:</strong>
         * <p>aac</p>
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
         * <p>The duration of the media file.</p>
         * 
         * <strong>example:</strong>
         * <p>79.203265</p>
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
         * <p>The language. For more information, see <a href="https://www.ffmpeg.org/ffmpeg-all.html#Metadata">FFmpeg language definition</a>.</p>
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

        public static QueryMediaListByURLResponseBodyMediaListMediaMediaInfoStreamsAudioStreamListAudioStream build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaListByURLResponseBodyMediaListMediaMediaInfoStreamsAudioStreamListAudioStream self = new QueryMediaListByURLResponseBodyMediaListMediaMediaInfoStreamsAudioStreamListAudioStream();
            return TeaModel.build(map, self);
        }

        public QueryMediaListByURLResponseBodyMediaListMediaMediaInfoStreamsAudioStreamListAudioStream setBitrate(String bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public String getBitrate() {
            return this.bitrate;
        }

        public QueryMediaListByURLResponseBodyMediaListMediaMediaInfoStreamsAudioStreamListAudioStream setChannelLayout(String channelLayout) {
            this.channelLayout = channelLayout;
            return this;
        }
        public String getChannelLayout() {
            return this.channelLayout;
        }

        public QueryMediaListByURLResponseBodyMediaListMediaMediaInfoStreamsAudioStreamListAudioStream setChannels(String channels) {
            this.channels = channels;
            return this;
        }
        public String getChannels() {
            return this.channels;
        }

        public QueryMediaListByURLResponseBodyMediaListMediaMediaInfoStreamsAudioStreamListAudioStream setCodecLongName(String codecLongName) {
            this.codecLongName = codecLongName;
            return this;
        }
        public String getCodecLongName() {
            return this.codecLongName;
        }

        public QueryMediaListByURLResponseBodyMediaListMediaMediaInfoStreamsAudioStreamListAudioStream setCodecName(String codecName) {
            this.codecName = codecName;
            return this;
        }
        public String getCodecName() {
            return this.codecName;
        }

        public QueryMediaListByURLResponseBodyMediaListMediaMediaInfoStreamsAudioStreamListAudioStream setCodecTag(String codecTag) {
            this.codecTag = codecTag;
            return this;
        }
        public String getCodecTag() {
            return this.codecTag;
        }

        public QueryMediaListByURLResponseBodyMediaListMediaMediaInfoStreamsAudioStreamListAudioStream setCodecTagString(String codecTagString) {
            this.codecTagString = codecTagString;
            return this;
        }
        public String getCodecTagString() {
            return this.codecTagString;
        }

        public QueryMediaListByURLResponseBodyMediaListMediaMediaInfoStreamsAudioStreamListAudioStream setCodecTimeBase(String codecTimeBase) {
            this.codecTimeBase = codecTimeBase;
            return this;
        }
        public String getCodecTimeBase() {
            return this.codecTimeBase;
        }

        public QueryMediaListByURLResponseBodyMediaListMediaMediaInfoStreamsAudioStreamListAudioStream setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public QueryMediaListByURLResponseBodyMediaListMediaMediaInfoStreamsAudioStreamListAudioStream setIndex(String index) {
            this.index = index;
            return this;
        }
        public String getIndex() {
            return this.index;
        }

        public QueryMediaListByURLResponseBodyMediaListMediaMediaInfoStreamsAudioStreamListAudioStream setLang(String lang) {
            this.lang = lang;
            return this;
        }
        public String getLang() {
            return this.lang;
        }

        public QueryMediaListByURLResponseBodyMediaListMediaMediaInfoStreamsAudioStreamListAudioStream setNumFrames(String numFrames) {
            this.numFrames = numFrames;
            return this;
        }
        public String getNumFrames() {
            return this.numFrames;
        }

        public QueryMediaListByURLResponseBodyMediaListMediaMediaInfoStreamsAudioStreamListAudioStream setSampleFmt(String sampleFmt) {
            this.sampleFmt = sampleFmt;
            return this;
        }
        public String getSampleFmt() {
            return this.sampleFmt;
        }

        public QueryMediaListByURLResponseBodyMediaListMediaMediaInfoStreamsAudioStreamListAudioStream setSamplerate(String samplerate) {
            this.samplerate = samplerate;
            return this;
        }
        public String getSamplerate() {
            return this.samplerate;
        }

        public QueryMediaListByURLResponseBodyMediaListMediaMediaInfoStreamsAudioStreamListAudioStream setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public QueryMediaListByURLResponseBodyMediaListMediaMediaInfoStreamsAudioStreamListAudioStream setTimebase(String timebase) {
            this.timebase = timebase;
            return this;
        }
        public String getTimebase() {
            return this.timebase;
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
        /**
         * <p>The sequence number of the subtitle stream. The value indicates the position of the subtitle stream in all subtitle streams.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Index")
        public String index;

        /**
         * <p>The language. For more information, see <a href="https://www.ffmpeg.org/ffmpeg-all.html#Metadata">FFmpeg language definition</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>und</p>
         */
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

    public static class QueryMediaListByURLResponseBodyMediaListMediaMediaInfoStreamsVideoStreamListVideoStreamNetworkCost extends TeaModel {
        /**
         * <p>The average bitrate of the video stream.</p>
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

        public static QueryMediaListByURLResponseBodyMediaListMediaMediaInfoStreamsVideoStreamListVideoStreamNetworkCost build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaListByURLResponseBodyMediaListMediaMediaInfoStreamsVideoStreamListVideoStreamNetworkCost self = new QueryMediaListByURLResponseBodyMediaListMediaMediaInfoStreamsVideoStreamListVideoStreamNetworkCost();
            return TeaModel.build(map, self);
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

        public QueryMediaListByURLResponseBodyMediaListMediaMediaInfoStreamsVideoStreamListVideoStreamNetworkCost setPreloadTime(String preloadTime) {
            this.preloadTime = preloadTime;
            return this;
        }
        public String getPreloadTime() {
            return this.preloadTime;
        }

    }

    public static class QueryMediaListByURLResponseBodyMediaListMediaMediaInfoStreamsVideoStreamListVideoStream extends TeaModel {
        /**
         * <p>The average frame rate.</p>
         * 
         * <strong>example:</strong>
         * <p>15.0</p>
         */
        @NameInMap("AvgFPS")
        public String avgFPS;

        /**
         * <p>The bitrate.</p>
         * 
         * <strong>example:</strong>
         * <p>512.701</p>
         */
        @NameInMap("Bitrate")
        public String bitrate;

        /**
         * <p>The full name of the encoding format.</p>
         * 
         * <strong>example:</strong>
         * <p>H.264/AVC/MPEG-4 AVC/MPEG-4 part 10</p>
         */
        @NameInMap("CodecLongName")
        public String codecLongName;

        /**
         * <p>The short name of the encoding format. Valid values: H264, mov, aac, avc, and mpeg.</p>
         * 
         * <strong>example:</strong>
         * <p>H264</p>
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
         * <p>1/30</p>
         */
        @NameInMap("CodecTimeBase")
        public String codecTimeBase;

        /**
         * <p>The display aspect ratio (DAR) of the video stream.</p>
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
         * <p>79.200000</p>
         */
        @NameInMap("Duration")
        public String duration;

        /**
         * <p>The frame rate.</p>
         * 
         * <strong>example:</strong>
         * <p>15.0</p>
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
         * <p>360</p>
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
         * <p>31</p>
         */
        @NameInMap("Level")
        public String level;

        /**
         * <p>The network bandwidth consumption.</p>
         */
        @NameInMap("NetworkCost")
        public QueryMediaListByURLResponseBodyMediaListMediaMediaInfoStreamsVideoStreamListVideoStreamNetworkCost networkCost;

        /**
         * <p>The total number of frames.</p>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("NumFrames")
        public String numFrames;

        /**
         * <p>The pixel format of the video stream.</p>
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
         * <p>The rotation angle of the video.</p>
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
         * <p>0.046029</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The time base.</p>
         * 
         * <strong>example:</strong>
         * <p>1/15360</p>
         */
        @NameInMap("Timebase")
        public String timebase;

        /**
         * <p>The former number in the video resolution. The number indicates the video width and cannot be negative.</p>
         * 
         * <strong>example:</strong>
         * <p>640</p>
         */
        @NameInMap("Width")
        public String width;

        public static QueryMediaListByURLResponseBodyMediaListMediaMediaInfoStreamsVideoStreamListVideoStream build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaListByURLResponseBodyMediaListMediaMediaInfoStreamsVideoStreamListVideoStream self = new QueryMediaListByURLResponseBodyMediaListMediaMediaInfoStreamsVideoStreamListVideoStream();
            return TeaModel.build(map, self);
        }

        public QueryMediaListByURLResponseBodyMediaListMediaMediaInfoStreamsVideoStreamListVideoStream setAvgFPS(String avgFPS) {
            this.avgFPS = avgFPS;
            return this;
        }
        public String getAvgFPS() {
            return this.avgFPS;
        }

        public QueryMediaListByURLResponseBodyMediaListMediaMediaInfoStreamsVideoStreamListVideoStream setBitrate(String bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public String getBitrate() {
            return this.bitrate;
        }

        public QueryMediaListByURLResponseBodyMediaListMediaMediaInfoStreamsVideoStreamListVideoStream setCodecLongName(String codecLongName) {
            this.codecLongName = codecLongName;
            return this;
        }
        public String getCodecLongName() {
            return this.codecLongName;
        }

        public QueryMediaListByURLResponseBodyMediaListMediaMediaInfoStreamsVideoStreamListVideoStream setCodecName(String codecName) {
            this.codecName = codecName;
            return this;
        }
        public String getCodecName() {
            return this.codecName;
        }

        public QueryMediaListByURLResponseBodyMediaListMediaMediaInfoStreamsVideoStreamListVideoStream setCodecTag(String codecTag) {
            this.codecTag = codecTag;
            return this;
        }
        public String getCodecTag() {
            return this.codecTag;
        }

        public QueryMediaListByURLResponseBodyMediaListMediaMediaInfoStreamsVideoStreamListVideoStream setCodecTagString(String codecTagString) {
            this.codecTagString = codecTagString;
            return this;
        }
        public String getCodecTagString() {
            return this.codecTagString;
        }

        public QueryMediaListByURLResponseBodyMediaListMediaMediaInfoStreamsVideoStreamListVideoStream setCodecTimeBase(String codecTimeBase) {
            this.codecTimeBase = codecTimeBase;
            return this;
        }
        public String getCodecTimeBase() {
            return this.codecTimeBase;
        }

        public QueryMediaListByURLResponseBodyMediaListMediaMediaInfoStreamsVideoStreamListVideoStream setDar(String dar) {
            this.dar = dar;
            return this;
        }
        public String getDar() {
            return this.dar;
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

        public QueryMediaListByURLResponseBodyMediaListMediaMediaInfoStreamsVideoStreamListVideoStream setHasBFrames(String hasBFrames) {
            this.hasBFrames = hasBFrames;
            return this;
        }
        public String getHasBFrames() {
            return this.hasBFrames;
        }

        public QueryMediaListByURLResponseBodyMediaListMediaMediaInfoStreamsVideoStreamListVideoStream setHeight(String height) {
            this.height = height;
            return this;
        }
        public String getHeight() {
            return this.height;
        }

        public QueryMediaListByURLResponseBodyMediaListMediaMediaInfoStreamsVideoStreamListVideoStream setIndex(String index) {
            this.index = index;
            return this;
        }
        public String getIndex() {
            return this.index;
        }

        public QueryMediaListByURLResponseBodyMediaListMediaMediaInfoStreamsVideoStreamListVideoStream setLang(String lang) {
            this.lang = lang;
            return this;
        }
        public String getLang() {
            return this.lang;
        }

        public QueryMediaListByURLResponseBodyMediaListMediaMediaInfoStreamsVideoStreamListVideoStream setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public QueryMediaListByURLResponseBodyMediaListMediaMediaInfoStreamsVideoStreamListVideoStream setNetworkCost(QueryMediaListByURLResponseBodyMediaListMediaMediaInfoStreamsVideoStreamListVideoStreamNetworkCost networkCost) {
            this.networkCost = networkCost;
            return this;
        }
        public QueryMediaListByURLResponseBodyMediaListMediaMediaInfoStreamsVideoStreamListVideoStreamNetworkCost getNetworkCost() {
            return this.networkCost;
        }

        public QueryMediaListByURLResponseBodyMediaListMediaMediaInfoStreamsVideoStreamListVideoStream setNumFrames(String numFrames) {
            this.numFrames = numFrames;
            return this;
        }
        public String getNumFrames() {
            return this.numFrames;
        }

        public QueryMediaListByURLResponseBodyMediaListMediaMediaInfoStreamsVideoStreamListVideoStream setPixFmt(String pixFmt) {
            this.pixFmt = pixFmt;
            return this;
        }
        public String getPixFmt() {
            return this.pixFmt;
        }

        public QueryMediaListByURLResponseBodyMediaListMediaMediaInfoStreamsVideoStreamListVideoStream setProfile(String profile) {
            this.profile = profile;
            return this;
        }
        public String getProfile() {
            return this.profile;
        }

        public QueryMediaListByURLResponseBodyMediaListMediaMediaInfoStreamsVideoStreamListVideoStream setRotate(String rotate) {
            this.rotate = rotate;
            return this;
        }
        public String getRotate() {
            return this.rotate;
        }

        public QueryMediaListByURLResponseBodyMediaListMediaMediaInfoStreamsVideoStreamListVideoStream setSar(String sar) {
            this.sar = sar;
            return this;
        }
        public String getSar() {
            return this.sar;
        }

        public QueryMediaListByURLResponseBodyMediaListMediaMediaInfoStreamsVideoStreamListVideoStream setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public QueryMediaListByURLResponseBodyMediaListMediaMediaInfoStreamsVideoStreamListVideoStream setTimebase(String timebase) {
            this.timebase = timebase;
            return this;
        }
        public String getTimebase() {
            return this.timebase;
        }

        public QueryMediaListByURLResponseBodyMediaListMediaMediaInfoStreamsVideoStreamListVideoStream setWidth(String width) {
            this.width = width;
            return this;
        }
        public String getWidth() {
            return this.width;
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

    public static class QueryMediaListByURLResponseBodyMediaListMediaMediaInfoStreams extends TeaModel {
        /**
         * <p>The list of audio streams.</p>
         */
        @NameInMap("AudioStreamList")
        public QueryMediaListByURLResponseBodyMediaListMediaMediaInfoStreamsAudioStreamList audioStreamList;

        /**
         * <p>The list of subtitle streams.</p>
         */
        @NameInMap("SubtitleStreamList")
        public QueryMediaListByURLResponseBodyMediaListMediaMediaInfoStreamsSubtitleStreamList subtitleStreamList;

        /**
         * <p>The list of video streams.</p>
         */
        @NameInMap("VideoStreamList")
        public QueryMediaListByURLResponseBodyMediaListMediaMediaInfoStreamsVideoStreamList videoStreamList;

        public static QueryMediaListByURLResponseBodyMediaListMediaMediaInfoStreams build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaListByURLResponseBodyMediaListMediaMediaInfoStreams self = new QueryMediaListByURLResponseBodyMediaListMediaMediaInfoStreams();
            return TeaModel.build(map, self);
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

        public QueryMediaListByURLResponseBodyMediaListMediaMediaInfoStreams setVideoStreamList(QueryMediaListByURLResponseBodyMediaListMediaMediaInfoStreamsVideoStreamList videoStreamList) {
            this.videoStreamList = videoStreamList;
            return this;
        }
        public QueryMediaListByURLResponseBodyMediaListMediaMediaInfoStreamsVideoStreamList getVideoStreamList() {
            return this.videoStreamList;
        }

    }

    public static class QueryMediaListByURLResponseBodyMediaListMediaMediaInfo extends TeaModel {
        /**
         * <p>The format information.</p>
         */
        @NameInMap("Format")
        public QueryMediaListByURLResponseBodyMediaListMediaMediaInfoFormat format;

        /**
         * <p>The stream information.</p>
         */
        @NameInMap("Streams")
        public QueryMediaListByURLResponseBodyMediaListMediaMediaInfoStreams streams;

        public static QueryMediaListByURLResponseBodyMediaListMediaMediaInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaListByURLResponseBodyMediaListMediaMediaInfo self = new QueryMediaListByURLResponseBodyMediaListMediaMediaInfo();
            return TeaModel.build(map, self);
        }

        public QueryMediaListByURLResponseBodyMediaListMediaMediaInfo setFormat(QueryMediaListByURLResponseBodyMediaListMediaMediaInfoFormat format) {
            this.format = format;
            return this;
        }
        public QueryMediaListByURLResponseBodyMediaListMediaMediaInfoFormat getFormat() {
            return this.format;
        }

        public QueryMediaListByURLResponseBodyMediaListMediaMediaInfo setStreams(QueryMediaListByURLResponseBodyMediaListMediaMediaInfoStreams streams) {
            this.streams = streams;
            return this;
        }
        public QueryMediaListByURLResponseBodyMediaListMediaMediaInfoStreams getStreams() {
            return this.streams;
        }

    }

    public static class QueryMediaListByURLResponseBodyMediaListMediaPlayListPlayFile extends TeaModel {
        /**
         * <p>The status of the media file. Valid values:</p>
         * <ul>
         * <li><strong>Normal</strong>: The file is normal.</li>
         * <li><strong>Deleted</strong>: The file is deleted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("State")
        public String state;

        /**
         * <p>The OSS URL of the playback file.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://example-bucket-****.oss-cn-hangzhou.aliyuncs.com//example-****.mp4l-test/in/1.mp4">http://example-bucket-****.oss-cn-hangzhou.aliyuncs.com//example-****.mp4l-test/in/1.mp4</a></p>
         */
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
        /**
         * <p>The name of the workflow activity.</p>
         * 
         * <strong>example:</strong>
         * <p>test name</p>
         */
        @NameInMap("ActivityName")
        public String activityName;

        /**
         * <p>The bitrate of the media file.</p>
         * 
         * <strong>example:</strong>
         * <p>25.067</p>
         */
        @NameInMap("Bitrate")
        public String bitrate;

        /**
         * <p>The duration.</p>
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
         * <p>1</p>
         */
        @NameInMap("Encryption")
        public String encryption;

        /**
         * <p>The playback file.</p>
         */
        @NameInMap("File")
        public QueryMediaListByURLResponseBodyMediaListMediaPlayListPlayFile file;

        /**
         * <p>The encoding format of the media file. Valid values: mov, mp4, m4a, 3gp, 3g2, and mj2.</p>
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
         * <p>10</p>
         */
        @NameInMap("Height")
        public String height;

        /**
         * <p>The ID of the workflow that generates the playback file.</p>
         * 
         * <strong>example:</strong>
         * <p>6cc3aa66d1cb4bb2adf14e726c0a****</p>
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
         * <p>The size.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Size")
        public String size;

        /**
         * <p>The width.</p>
         * 
         * <strong>example:</strong>
         * <p>11</p>
         */
        @NameInMap("Width")
        public String width;

        public static QueryMediaListByURLResponseBodyMediaListMediaPlayListPlay build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaListByURLResponseBodyMediaListMediaPlayListPlay self = new QueryMediaListByURLResponseBodyMediaListMediaPlayListPlay();
            return TeaModel.build(map, self);
        }

        public QueryMediaListByURLResponseBodyMediaListMediaPlayListPlay setActivityName(String activityName) {
            this.activityName = activityName;
            return this;
        }
        public String getActivityName() {
            return this.activityName;
        }

        public QueryMediaListByURLResponseBodyMediaListMediaPlayListPlay setBitrate(String bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public String getBitrate() {
            return this.bitrate;
        }

        public QueryMediaListByURLResponseBodyMediaListMediaPlayListPlay setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public QueryMediaListByURLResponseBodyMediaListMediaPlayListPlay setEncryption(String encryption) {
            this.encryption = encryption;
            return this;
        }
        public String getEncryption() {
            return this.encryption;
        }

        public QueryMediaListByURLResponseBodyMediaListMediaPlayListPlay setFile(QueryMediaListByURLResponseBodyMediaListMediaPlayListPlayFile file) {
            this.file = file;
            return this;
        }
        public QueryMediaListByURLResponseBodyMediaListMediaPlayListPlayFile getFile() {
            return this.file;
        }

        public QueryMediaListByURLResponseBodyMediaListMediaPlayListPlay setFormat(String format) {
            this.format = format;
            return this;
        }
        public String getFormat() {
            return this.format;
        }

        public QueryMediaListByURLResponseBodyMediaListMediaPlayListPlay setFps(String fps) {
            this.fps = fps;
            return this;
        }
        public String getFps() {
            return this.fps;
        }

        public QueryMediaListByURLResponseBodyMediaListMediaPlayListPlay setHeight(String height) {
            this.height = height;
            return this;
        }
        public String getHeight() {
            return this.height;
        }

        public QueryMediaListByURLResponseBodyMediaListMediaPlayListPlay setMediaWorkflowId(String mediaWorkflowId) {
            this.mediaWorkflowId = mediaWorkflowId;
            return this;
        }
        public String getMediaWorkflowId() {
            return this.mediaWorkflowId;
        }

        public QueryMediaListByURLResponseBodyMediaListMediaPlayListPlay setMediaWorkflowName(String mediaWorkflowName) {
            this.mediaWorkflowName = mediaWorkflowName;
            return this;
        }
        public String getMediaWorkflowName() {
            return this.mediaWorkflowName;
        }

        public QueryMediaListByURLResponseBodyMediaListMediaPlayListPlay setSize(String size) {
            this.size = size;
            return this;
        }
        public String getSize() {
            return this.size;
        }

        public QueryMediaListByURLResponseBodyMediaListMediaPlayListPlay setWidth(String width) {
            this.width = width;
            return this;
        }
        public String getWidth() {
            return this.width;
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

    public static class QueryMediaListByURLResponseBodyMediaListMediaSnapshotListSnapshotFile extends TeaModel {
        /**
         * <p>The status of the file. Valid values:</p>
         * <ul>
         * <li><strong>Normal</strong>: The file is normal.</li>
         * <li><strong>Deleted</strong>: The file is deleted.</li>
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
         * <p>3</p>
         */
        @NameInMap("Count")
        public String count;

        /**
         * <p>The snapshot.</p>
         */
        @NameInMap("File")
        public QueryMediaListByURLResponseBodyMediaListMediaSnapshotListSnapshotFile file;

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
         * <li><strong>Single</strong>: a single snapshot</li>
         * <li><strong>Sequence</strong>: snapshots in sequence</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Single</p>
         */
        @NameInMap("Type")
        public String type;

        public static QueryMediaListByURLResponseBodyMediaListMediaSnapshotListSnapshot build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaListByURLResponseBodyMediaListMediaSnapshotListSnapshot self = new QueryMediaListByURLResponseBodyMediaListMediaSnapshotListSnapshot();
            return TeaModel.build(map, self);
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

        public QueryMediaListByURLResponseBodyMediaListMediaSnapshotListSnapshot setFile(QueryMediaListByURLResponseBodyMediaListMediaSnapshotListSnapshotFile file) {
            this.file = file;
            return this;
        }
        public QueryMediaListByURLResponseBodyMediaListMediaSnapshotListSnapshotFile getFile() {
            return this.file;
        }

        public QueryMediaListByURLResponseBodyMediaListMediaSnapshotListSnapshot setMediaWorkflowId(String mediaWorkflowId) {
            this.mediaWorkflowId = mediaWorkflowId;
            return this;
        }
        public String getMediaWorkflowId() {
            return this.mediaWorkflowId;
        }

        public QueryMediaListByURLResponseBodyMediaListMediaSnapshotListSnapshot setMediaWorkflowName(String mediaWorkflowName) {
            this.mediaWorkflowName = mediaWorkflowName;
            return this;
        }
        public String getMediaWorkflowName() {
            return this.mediaWorkflowName;
        }

        public QueryMediaListByURLResponseBodyMediaListMediaSnapshotListSnapshot setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
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

    public static class QueryMediaListByURLResponseBodyMediaListMediaSummaryListSummaryFile extends TeaModel {
        /**
         * <p>The status of the media file. Valid values:</p>
         * <ul>
         * <li><strong>Normal</strong>: The file is normal.</li>
         * <li><strong>Deleted</strong>: The file is deleted.</li>
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
         * <p><a href="http://example-bucket-****.o">http://example-bucket-****.o</a></p>
         */
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
        public QueryMediaListByURLResponseBodyMediaListMediaSummaryListSummaryFile file;

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
         * <p>Gif</p>
         */
        @NameInMap("Type")
        public String type;

        public static QueryMediaListByURLResponseBodyMediaListMediaSummaryListSummary build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaListByURLResponseBodyMediaListMediaSummaryListSummary self = new QueryMediaListByURLResponseBodyMediaListMediaSummaryListSummary();
            return TeaModel.build(map, self);
        }

        public QueryMediaListByURLResponseBodyMediaListMediaSummaryListSummary setActivityName(String activityName) {
            this.activityName = activityName;
            return this;
        }
        public String getActivityName() {
            return this.activityName;
        }

        public QueryMediaListByURLResponseBodyMediaListMediaSummaryListSummary setFile(QueryMediaListByURLResponseBodyMediaListMediaSummaryListSummaryFile file) {
            this.file = file;
            return this;
        }
        public QueryMediaListByURLResponseBodyMediaListMediaSummaryListSummaryFile getFile() {
            return this.file;
        }

        public QueryMediaListByURLResponseBodyMediaListMediaSummaryListSummary setMediaWorkflowId(String mediaWorkflowId) {
            this.mediaWorkflowId = mediaWorkflowId;
            return this;
        }
        public String getMediaWorkflowId() {
            return this.mediaWorkflowId;
        }

        public QueryMediaListByURLResponseBodyMediaListMediaSummaryListSummary setMediaWorkflowName(String mediaWorkflowName) {
            this.mediaWorkflowName = mediaWorkflowName;
            return this;
        }
        public String getMediaWorkflowName() {
            return this.mediaWorkflowName;
        }

        public QueryMediaListByURLResponseBodyMediaListMediaSummaryListSummary setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
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

    public static class QueryMediaListByURLResponseBodyMediaListMedia extends TeaModel {
        /**
         * <p>The bitrate.</p>
         * 
         * <strong>example:</strong>
         * <p>593.192</p>
         */
        @NameInMap("Bitrate")
        public String bitrate;

        /**
         * <p>The ID of the category to which the media file belongs.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
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
         * <p>2021-07-14T13:05:00Z</p>
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
         * <p>79.204000</p>
         */
        @NameInMap("Duration")
        public String duration;

        /**
         * <p>The details of the input file.</p>
         */
        @NameInMap("File")
        public QueryMediaListByURLResponseBodyMediaListMediaFile file;

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
         * <p>15.0</p>
         */
        @NameInMap("Fps")
        public String fps;

        /**
         * <p>The height of the queried media file.</p>
         * 
         * <strong>example:</strong>
         * <p>360</p>
         */
        @NameInMap("Height")
        public String height;

        /**
         * <p>The ID of the media file.</p>
         * 
         * <strong>example:</strong>
         * <p>52d7e98b05e648199612290bb819****</p>
         */
        @NameInMap("MediaId")
        public String mediaId;

        /**
         * <p>The media information.</p>
         */
        @NameInMap("MediaInfo")
        public QueryMediaListByURLResponseBodyMediaListMediaMediaInfo mediaInfo;

        /**
         * <p>The playlist.</p>
         */
        @NameInMap("PlayList")
        public QueryMediaListByURLResponseBodyMediaListMediaPlayList playList;

        /**
         * <p>The publishing status of the media file. Valid values:</p>
         * <ul>
         * <li><strong>Initiated</strong>: The media file is in the initial state.</li>
         * <li><strong>UnPublish</strong>: The media file has not been published, and the playback permission on the OSS object is Private.</li>
         * <li><strong>Published</strong>: The media file has been published, and the playback permission on the OSS object is Default.</li>
         * <li><strong>Deleted</strong>: The file is deleted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Published</p>
         */
        @NameInMap("PublishState")
        public String publishState;

        /**
         * <p>The IDs of the media workflow execution instances.</p>
         */
        @NameInMap("RunIdList")
        public QueryMediaListByURLResponseBodyMediaListMediaRunIdList runIdList;

        /**
         * <p>The size of the file.</p>
         * 
         * <strong>example:</strong>
         * <p>5872904</p>
         */
        @NameInMap("Size")
        public String size;

        /**
         * <p>The list of snapshots.</p>
         */
        @NameInMap("SnapshotList")
        public QueryMediaListByURLResponseBodyMediaListMediaSnapshotList snapshotList;

        /**
         * <p>The list of video summaries.</p>
         */
        @NameInMap("SummaryList")
        public QueryMediaListByURLResponseBodyMediaListMediaSummaryList summaryList;

        /**
         * <p>The tags of the media file.</p>
         */
        @NameInMap("Tags")
        public QueryMediaListByURLResponseBodyMediaListMediaTags tags;

        /**
         * <p>The title.</p>
         * 
         * <strong>example:</strong>
         * <p>kled.mp4</p>
         */
        @NameInMap("Title")
        public String title;

        /**
         * <p>The width.</p>
         * 
         * <strong>example:</strong>
         * <p>640</p>
         */
        @NameInMap("Width")
        public String width;

        public static QueryMediaListByURLResponseBodyMediaListMedia build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaListByURLResponseBodyMediaListMedia self = new QueryMediaListByURLResponseBodyMediaListMedia();
            return TeaModel.build(map, self);
        }

        public QueryMediaListByURLResponseBodyMediaListMedia setBitrate(String bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public String getBitrate() {
            return this.bitrate;
        }

        public QueryMediaListByURLResponseBodyMediaListMedia setCateId(Long cateId) {
            this.cateId = cateId;
            return this;
        }
        public Long getCateId() {
            return this.cateId;
        }

        public QueryMediaListByURLResponseBodyMediaListMedia setCensorState(String censorState) {
            this.censorState = censorState;
            return this;
        }
        public String getCensorState() {
            return this.censorState;
        }

        public QueryMediaListByURLResponseBodyMediaListMedia setCoverURL(String coverURL) {
            this.coverURL = coverURL;
            return this;
        }
        public String getCoverURL() {
            return this.coverURL;
        }

        public QueryMediaListByURLResponseBodyMediaListMedia setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public QueryMediaListByURLResponseBodyMediaListMedia setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public QueryMediaListByURLResponseBodyMediaListMedia setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public QueryMediaListByURLResponseBodyMediaListMedia setFile(QueryMediaListByURLResponseBodyMediaListMediaFile file) {
            this.file = file;
            return this;
        }
        public QueryMediaListByURLResponseBodyMediaListMediaFile getFile() {
            return this.file;
        }

        public QueryMediaListByURLResponseBodyMediaListMedia setFormat(String format) {
            this.format = format;
            return this;
        }
        public String getFormat() {
            return this.format;
        }

        public QueryMediaListByURLResponseBodyMediaListMedia setFps(String fps) {
            this.fps = fps;
            return this;
        }
        public String getFps() {
            return this.fps;
        }

        public QueryMediaListByURLResponseBodyMediaListMedia setHeight(String height) {
            this.height = height;
            return this;
        }
        public String getHeight() {
            return this.height;
        }

        public QueryMediaListByURLResponseBodyMediaListMedia setMediaId(String mediaId) {
            this.mediaId = mediaId;
            return this;
        }
        public String getMediaId() {
            return this.mediaId;
        }

        public QueryMediaListByURLResponseBodyMediaListMedia setMediaInfo(QueryMediaListByURLResponseBodyMediaListMediaMediaInfo mediaInfo) {
            this.mediaInfo = mediaInfo;
            return this;
        }
        public QueryMediaListByURLResponseBodyMediaListMediaMediaInfo getMediaInfo() {
            return this.mediaInfo;
        }

        public QueryMediaListByURLResponseBodyMediaListMedia setPlayList(QueryMediaListByURLResponseBodyMediaListMediaPlayList playList) {
            this.playList = playList;
            return this;
        }
        public QueryMediaListByURLResponseBodyMediaListMediaPlayList getPlayList() {
            return this.playList;
        }

        public QueryMediaListByURLResponseBodyMediaListMedia setPublishState(String publishState) {
            this.publishState = publishState;
            return this;
        }
        public String getPublishState() {
            return this.publishState;
        }

        public QueryMediaListByURLResponseBodyMediaListMedia setRunIdList(QueryMediaListByURLResponseBodyMediaListMediaRunIdList runIdList) {
            this.runIdList = runIdList;
            return this;
        }
        public QueryMediaListByURLResponseBodyMediaListMediaRunIdList getRunIdList() {
            return this.runIdList;
        }

        public QueryMediaListByURLResponseBodyMediaListMedia setSize(String size) {
            this.size = size;
            return this;
        }
        public String getSize() {
            return this.size;
        }

        public QueryMediaListByURLResponseBodyMediaListMedia setSnapshotList(QueryMediaListByURLResponseBodyMediaListMediaSnapshotList snapshotList) {
            this.snapshotList = snapshotList;
            return this;
        }
        public QueryMediaListByURLResponseBodyMediaListMediaSnapshotList getSnapshotList() {
            return this.snapshotList;
        }

        public QueryMediaListByURLResponseBodyMediaListMedia setSummaryList(QueryMediaListByURLResponseBodyMediaListMediaSummaryList summaryList) {
            this.summaryList = summaryList;
            return this;
        }
        public QueryMediaListByURLResponseBodyMediaListMediaSummaryList getSummaryList() {
            return this.summaryList;
        }

        public QueryMediaListByURLResponseBodyMediaListMedia setTags(QueryMediaListByURLResponseBodyMediaListMediaTags tags) {
            this.tags = tags;
            return this;
        }
        public QueryMediaListByURLResponseBodyMediaListMediaTags getTags() {
            return this.tags;
        }

        public QueryMediaListByURLResponseBodyMediaListMedia setTitle(String title) {
            this.title = title;
            return this;
        }
        public String getTitle() {
            return this.title;
        }

        public QueryMediaListByURLResponseBodyMediaListMedia setWidth(String width) {
            this.width = width;
            return this;
        }
        public String getWidth() {
            return this.width;
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
