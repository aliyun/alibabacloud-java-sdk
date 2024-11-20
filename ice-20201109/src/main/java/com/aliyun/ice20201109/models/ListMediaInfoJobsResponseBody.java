// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class ListMediaInfoJobsResponseBody extends TeaModel {
    /**
     * <p>The list of media information analysis jobs.</p>
     */
    @NameInMap("Jobs")
    public java.util.List<ListMediaInfoJobsResponseBodyJobs> jobs;

    /**
     * <p>The pagination token that is used in the next request to retrieve a new page of results. You do not need to specify this parameter for the first request. The token of the next page is returned after you call this operation for the first time.</p>
     * 
     * <strong>example:</strong>
     * <p>019daf5780f74831b0e1a767c9f1c178</p>
     */
    @NameInMap("NextPageToken")
    public String nextPageToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>31E30781-9495-5E2D-A84D-759B0A01E262</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListMediaInfoJobsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListMediaInfoJobsResponseBody self = new ListMediaInfoJobsResponseBody();
        return TeaModel.build(map, self);
    }

    public ListMediaInfoJobsResponseBody setJobs(java.util.List<ListMediaInfoJobsResponseBodyJobs> jobs) {
        this.jobs = jobs;
        return this;
    }
    public java.util.List<ListMediaInfoJobsResponseBodyJobs> getJobs() {
        return this.jobs;
    }

    public ListMediaInfoJobsResponseBody setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
        return this;
    }
    public String getNextPageToken() {
        return this.nextPageToken;
    }

    public ListMediaInfoJobsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListMediaInfoJobsResponseBodyJobsInput extends TeaModel {
        /**
         * <p>The media object.</p>
         * <ul>
         * <li>If Type is set to OSS, the URL of an OSS object is returned. Both the OSS and HTTP protocols are supported.</li>
         * <li>If Type is set to Media, the ID of a media asset is returned.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>oss://bucket/path/to/video.mp4</p>
         */
        @NameInMap("Media")
        public String media;

        /**
         * <p>The type of the media object. Valid values:</p>
         * <ul>
         * <li>OSS: an Object Storage Service (OSS) object.</li>
         * <li>Media: a media asset.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OSS</p>
         */
        @NameInMap("Type")
        public String type;

        public static ListMediaInfoJobsResponseBodyJobsInput build(java.util.Map<String, ?> map) throws Exception {
            ListMediaInfoJobsResponseBodyJobsInput self = new ListMediaInfoJobsResponseBodyJobsInput();
            return TeaModel.build(map, self);
        }

        public ListMediaInfoJobsResponseBodyJobsInput setMedia(String media) {
            this.media = media;
            return this;
        }
        public String getMedia() {
            return this.media;
        }

        public ListMediaInfoJobsResponseBodyJobsInput setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListMediaInfoJobsResponseBodyJobsMediaInfoPropertyAudioStreamInfoList extends TeaModel {
        /**
         * <p>The bitrate.</p>
         * 
         * <strong>example:</strong>
         * <p>0.f</p>
         */
        @NameInMap("Bitrate")
        public String bitrate;

        /**
         * <p>The sound channel layout.</p>
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
         * <p>The name of the encoding format.</p>
         * 
         * <strong>example:</strong>
         * <p>AAC (Advanced Audio Coding)</p>
         */
        @NameInMap("CodecLongName")
        public String codecLongName;

        /**
         * <p>The encoding format.</p>
         * 
         * <strong>example:</strong>
         * <p>aac</p>
         */
        @NameInMap("CodecName")
        public String codecName;

        /**
         * <p>The encoder tag.</p>
         * 
         * <strong>example:</strong>
         * <p>0x000f</p>
         */
        @NameInMap("CodecTag")
        public String codecTag;

        /**
         * <p>The name of the encoder tag.</p>
         * 
         * <strong>example:</strong>
         * <p>[15][0][0][0]</p>
         */
        @NameInMap("CodecTagString")
        public String codecTagString;

        /**
         * <p>The time base of the encoder.</p>
         * 
         * <strong>example:</strong>
         * <p>1/44100</p>
         */
        @NameInMap("CodecTimeBase")
        public String codecTimeBase;

        /**
         * <p>The duration of the stream. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>403.039989</p>
         */
        @NameInMap("Duration")
        public String duration;

        /**
         * <p>The sequence number of the stream.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Index")
        public String index;

        /**
         * <p>The language of the stream.</p>
         * 
         * <strong>example:</strong>
         * <p>cn</p>
         */
        @NameInMap("Lang")
        public String lang;

        /**
         * <p>The sampling format.</p>
         * 
         * <strong>example:</strong>
         * <p>fltp</p>
         */
        @NameInMap("SampleFmt")
        public String sampleFmt;

        /**
         * <p>The sampling rate. Unit: Hz.</p>
         * 
         * <strong>example:</strong>
         * <p>44100</p>
         */
        @NameInMap("SampleRate")
        public String sampleRate;

        /**
         * <p>The start time of the stream.</p>
         * 
         * <strong>example:</strong>
         * <p>1.473556</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The time base.</p>
         * 
         * <strong>example:</strong>
         * <p>1/90000</p>
         */
        @NameInMap("Timebase")
        public String timebase;

        public static ListMediaInfoJobsResponseBodyJobsMediaInfoPropertyAudioStreamInfoList build(java.util.Map<String, ?> map) throws Exception {
            ListMediaInfoJobsResponseBodyJobsMediaInfoPropertyAudioStreamInfoList self = new ListMediaInfoJobsResponseBodyJobsMediaInfoPropertyAudioStreamInfoList();
            return TeaModel.build(map, self);
        }

        public ListMediaInfoJobsResponseBodyJobsMediaInfoPropertyAudioStreamInfoList setBitrate(String bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public String getBitrate() {
            return this.bitrate;
        }

        public ListMediaInfoJobsResponseBodyJobsMediaInfoPropertyAudioStreamInfoList setChannelLayout(String channelLayout) {
            this.channelLayout = channelLayout;
            return this;
        }
        public String getChannelLayout() {
            return this.channelLayout;
        }

        public ListMediaInfoJobsResponseBodyJobsMediaInfoPropertyAudioStreamInfoList setChannels(String channels) {
            this.channels = channels;
            return this;
        }
        public String getChannels() {
            return this.channels;
        }

        public ListMediaInfoJobsResponseBodyJobsMediaInfoPropertyAudioStreamInfoList setCodecLongName(String codecLongName) {
            this.codecLongName = codecLongName;
            return this;
        }
        public String getCodecLongName() {
            return this.codecLongName;
        }

        public ListMediaInfoJobsResponseBodyJobsMediaInfoPropertyAudioStreamInfoList setCodecName(String codecName) {
            this.codecName = codecName;
            return this;
        }
        public String getCodecName() {
            return this.codecName;
        }

        public ListMediaInfoJobsResponseBodyJobsMediaInfoPropertyAudioStreamInfoList setCodecTag(String codecTag) {
            this.codecTag = codecTag;
            return this;
        }
        public String getCodecTag() {
            return this.codecTag;
        }

        public ListMediaInfoJobsResponseBodyJobsMediaInfoPropertyAudioStreamInfoList setCodecTagString(String codecTagString) {
            this.codecTagString = codecTagString;
            return this;
        }
        public String getCodecTagString() {
            return this.codecTagString;
        }

        public ListMediaInfoJobsResponseBodyJobsMediaInfoPropertyAudioStreamInfoList setCodecTimeBase(String codecTimeBase) {
            this.codecTimeBase = codecTimeBase;
            return this;
        }
        public String getCodecTimeBase() {
            return this.codecTimeBase;
        }

        public ListMediaInfoJobsResponseBodyJobsMediaInfoPropertyAudioStreamInfoList setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public ListMediaInfoJobsResponseBodyJobsMediaInfoPropertyAudioStreamInfoList setIndex(String index) {
            this.index = index;
            return this;
        }
        public String getIndex() {
            return this.index;
        }

        public ListMediaInfoJobsResponseBodyJobsMediaInfoPropertyAudioStreamInfoList setLang(String lang) {
            this.lang = lang;
            return this;
        }
        public String getLang() {
            return this.lang;
        }

        public ListMediaInfoJobsResponseBodyJobsMediaInfoPropertyAudioStreamInfoList setSampleFmt(String sampleFmt) {
            this.sampleFmt = sampleFmt;
            return this;
        }
        public String getSampleFmt() {
            return this.sampleFmt;
        }

        public ListMediaInfoJobsResponseBodyJobsMediaInfoPropertyAudioStreamInfoList setSampleRate(String sampleRate) {
            this.sampleRate = sampleRate;
            return this;
        }
        public String getSampleRate() {
            return this.sampleRate;
        }

        public ListMediaInfoJobsResponseBodyJobsMediaInfoPropertyAudioStreamInfoList setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public ListMediaInfoJobsResponseBodyJobsMediaInfoPropertyAudioStreamInfoList setTimebase(String timebase) {
            this.timebase = timebase;
            return this;
        }
        public String getTimebase() {
            return this.timebase;
        }

    }

    public static class ListMediaInfoJobsResponseBodyJobsMediaInfoPropertyFileBasicInfo extends TeaModel {
        /**
         * <p>The video bitrate.</p>
         * 
         * <strong>example:</strong>
         * <p>888.563</p>
         */
        @NameInMap("Bitrate")
        public String bitrate;

        /**
         * <p>The duration of the video. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>403.039999</p>
         */
        @NameInMap("Duration")
        public String duration;

        /**
         * <p>The file name.</p>
         * 
         * <strong>example:</strong>
         * <p>file.m3u8</p>
         */
        @NameInMap("FileName")
        public String fileName;

        /**
         * <p>The file size. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>31737</p>
         */
        @NameInMap("FileSize")
        public String fileSize;

        /**
         * <p>The state of the file.</p>
         * 
         * <strong>example:</strong>
         * <p>Normal</p>
         */
        @NameInMap("FileStatus")
        public String fileStatus;

        /**
         * <p>The file type. Valid values: source_file and transcode_file.</p>
         * 
         * <strong>example:</strong>
         * <p>source_file</p>
         */
        @NameInMap("FileType")
        public String fileType;

        /**
         * <p>The URL of the file.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://bucket.oss-cn-shanghai.aliyuncs.com/path/to/file.m3u8">http://bucket.oss-cn-shanghai.aliyuncs.com/path/to/file.m3u8</a></p>
         */
        @NameInMap("FileUrl")
        public String fileUrl;

        /**
         * <p>The name of the video format.</p>
         * 
         * <strong>example:</strong>
         * <p>hls,applehttp</p>
         */
        @NameInMap("FormatName")
        public String formatName;

        /**
         * <p>The height.</p>
         * 
         * <strong>example:</strong>
         * <p>478</p>
         */
        @NameInMap("Height")
        public String height;

        /**
         * <p>The ID of the media asset.</p>
         * 
         * <strong>example:</strong>
         * <p>4765337007f571edbfdf81848c016303</p>
         */
        @NameInMap("MediaId")
        public String mediaId;

        /**
         * <p>The region in which the file resides.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-shanghai</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <p>The width.</p>
         * 
         * <strong>example:</strong>
         * <p>848</p>
         */
        @NameInMap("Width")
        public String width;

        public static ListMediaInfoJobsResponseBodyJobsMediaInfoPropertyFileBasicInfo build(java.util.Map<String, ?> map) throws Exception {
            ListMediaInfoJobsResponseBodyJobsMediaInfoPropertyFileBasicInfo self = new ListMediaInfoJobsResponseBodyJobsMediaInfoPropertyFileBasicInfo();
            return TeaModel.build(map, self);
        }

        public ListMediaInfoJobsResponseBodyJobsMediaInfoPropertyFileBasicInfo setBitrate(String bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public String getBitrate() {
            return this.bitrate;
        }

        public ListMediaInfoJobsResponseBodyJobsMediaInfoPropertyFileBasicInfo setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public ListMediaInfoJobsResponseBodyJobsMediaInfoPropertyFileBasicInfo setFileName(String fileName) {
            this.fileName = fileName;
            return this;
        }
        public String getFileName() {
            return this.fileName;
        }

        public ListMediaInfoJobsResponseBodyJobsMediaInfoPropertyFileBasicInfo setFileSize(String fileSize) {
            this.fileSize = fileSize;
            return this;
        }
        public String getFileSize() {
            return this.fileSize;
        }

        public ListMediaInfoJobsResponseBodyJobsMediaInfoPropertyFileBasicInfo setFileStatus(String fileStatus) {
            this.fileStatus = fileStatus;
            return this;
        }
        public String getFileStatus() {
            return this.fileStatus;
        }

        public ListMediaInfoJobsResponseBodyJobsMediaInfoPropertyFileBasicInfo setFileType(String fileType) {
            this.fileType = fileType;
            return this;
        }
        public String getFileType() {
            return this.fileType;
        }

        public ListMediaInfoJobsResponseBodyJobsMediaInfoPropertyFileBasicInfo setFileUrl(String fileUrl) {
            this.fileUrl = fileUrl;
            return this;
        }
        public String getFileUrl() {
            return this.fileUrl;
        }

        public ListMediaInfoJobsResponseBodyJobsMediaInfoPropertyFileBasicInfo setFormatName(String formatName) {
            this.formatName = formatName;
            return this;
        }
        public String getFormatName() {
            return this.formatName;
        }

        public ListMediaInfoJobsResponseBodyJobsMediaInfoPropertyFileBasicInfo setHeight(String height) {
            this.height = height;
            return this;
        }
        public String getHeight() {
            return this.height;
        }

        public ListMediaInfoJobsResponseBodyJobsMediaInfoPropertyFileBasicInfo setMediaId(String mediaId) {
            this.mediaId = mediaId;
            return this;
        }
        public String getMediaId() {
            return this.mediaId;
        }

        public ListMediaInfoJobsResponseBodyJobsMediaInfoPropertyFileBasicInfo setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public ListMediaInfoJobsResponseBodyJobsMediaInfoPropertyFileBasicInfo setWidth(String width) {
            this.width = width;
            return this;
        }
        public String getWidth() {
            return this.width;
        }

    }

    public static class ListMediaInfoJobsResponseBodyJobsMediaInfoPropertyVideoStreamInfoList extends TeaModel {
        /**
         * <p>The average frame rate.</p>
         * 
         * <strong>example:</strong>
         * <p>25.0</p>
         */
        @NameInMap("Avg_fps")
        public String avgFps;

        /**
         * <p>The bitrate.</p>
         * 
         * <strong>example:</strong>
         * <p>888.563</p>
         */
        @NameInMap("Bit_rate")
        public String bitRate;

        /**
         * <p>The name of the encoding format.</p>
         * 
         * <strong>example:</strong>
         * <p>H.264 / AVC / MPEG-4 AVC / MPEG-4 part 10</p>
         */
        @NameInMap("Codec_long_name")
        public String codecLongName;

        /**
         * <p>The encoding format.</p>
         * 
         * <strong>example:</strong>
         * <p>h264</p>
         */
        @NameInMap("Codec_name")
        public String codecName;

        /**
         * <p>The tag of the encoding format.</p>
         * 
         * <strong>example:</strong>
         * <p>0x001b</p>
         */
        @NameInMap("Codec_tag")
        public String codecTag;

        /**
         * <p>The tag string of the encoding format.</p>
         * 
         * <strong>example:</strong>
         * <p>[27][0][0][0]</p>
         */
        @NameInMap("Codec_tag_string")
        public String codecTagString;

        /**
         * <p>The time base of the encoder.</p>
         * 
         * <strong>example:</strong>
         * <p>1/50</p>
         */
        @NameInMap("Codec_time_base")
        public String codecTimeBase;

        /**
         * <p>The display aspect ratio.</p>
         * 
         * <strong>example:</strong>
         * <p>16:9</p>
         */
        @NameInMap("Dar")
        public String dar;

        /**
         * <p>The duration of the stream. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>403.039989</p>
         */
        @NameInMap("Duration")
        public String duration;

        /**
         * <p>The frame rate.</p>
         * 
         * <strong>example:</strong>
         * <p>25.0</p>
         */
        @NameInMap("Fps")
        public String fps;

        /**
         * <p>Indicates whether the video stream contains bidirectional frames (B-frames). Valid values:</p>
         * <ul>
         * <li>0: The stream contains no B-frames.</li>
         * <li>1: The stream contains one B-frame.</li>
         * <li>2: The stream contains multiple consecutive B-frames.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Has_b_frames")
        public String hasBFrames;

        /**
         * <p>The height.</p>
         * 
         * <strong>example:</strong>
         * <p>478</p>
         */
        @NameInMap("Height")
        public String height;

        /**
         * <p>The sequence number of the stream.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Index")
        public String index;

        /**
         * <p>The language of the stream.</p>
         * 
         * <strong>example:</strong>
         * <p>cn</p>
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
         * <p>The total number of frames.</p>
         * 
         * <strong>example:</strong>
         * <p>10040</p>
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
         * <p>The encoder profile.</p>
         * 
         * <strong>example:</strong>
         * <p>High</p>
         */
        @NameInMap("Profile")
        public String profile;

        /**
         * <p>The rotation angle of the video image.</p>
         * <ul>
         * <li>Valid values: 0, 90, 180, and 270.</li>
         * <li>Default value: 0.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Rotate")
        public String rotate;

        /**
         * <p>The aspect ratio of the area from which the sampling points are collected.</p>
         * 
         * <strong>example:</strong>
         * <p>478:477</p>
         */
        @NameInMap("Sar")
        public String sar;

        /**
         * <p>The start time of the stream.</p>
         * 
         * <strong>example:</strong>
         * <p>1.473556</p>
         */
        @NameInMap("Start_time")
        public String startTime;

        /**
         * <p>The time base.</p>
         * 
         * <strong>example:</strong>
         * <p>1/90000</p>
         */
        @NameInMap("Time_base")
        public String timeBase;

        /**
         * <p>The width.</p>
         * 
         * <strong>example:</strong>
         * <p>848</p>
         */
        @NameInMap("Width")
        public String width;

        public static ListMediaInfoJobsResponseBodyJobsMediaInfoPropertyVideoStreamInfoList build(java.util.Map<String, ?> map) throws Exception {
            ListMediaInfoJobsResponseBodyJobsMediaInfoPropertyVideoStreamInfoList self = new ListMediaInfoJobsResponseBodyJobsMediaInfoPropertyVideoStreamInfoList();
            return TeaModel.build(map, self);
        }

        public ListMediaInfoJobsResponseBodyJobsMediaInfoPropertyVideoStreamInfoList setAvgFps(String avgFps) {
            this.avgFps = avgFps;
            return this;
        }
        public String getAvgFps() {
            return this.avgFps;
        }

        public ListMediaInfoJobsResponseBodyJobsMediaInfoPropertyVideoStreamInfoList setBitRate(String bitRate) {
            this.bitRate = bitRate;
            return this;
        }
        public String getBitRate() {
            return this.bitRate;
        }

        public ListMediaInfoJobsResponseBodyJobsMediaInfoPropertyVideoStreamInfoList setCodecLongName(String codecLongName) {
            this.codecLongName = codecLongName;
            return this;
        }
        public String getCodecLongName() {
            return this.codecLongName;
        }

        public ListMediaInfoJobsResponseBodyJobsMediaInfoPropertyVideoStreamInfoList setCodecName(String codecName) {
            this.codecName = codecName;
            return this;
        }
        public String getCodecName() {
            return this.codecName;
        }

        public ListMediaInfoJobsResponseBodyJobsMediaInfoPropertyVideoStreamInfoList setCodecTag(String codecTag) {
            this.codecTag = codecTag;
            return this;
        }
        public String getCodecTag() {
            return this.codecTag;
        }

        public ListMediaInfoJobsResponseBodyJobsMediaInfoPropertyVideoStreamInfoList setCodecTagString(String codecTagString) {
            this.codecTagString = codecTagString;
            return this;
        }
        public String getCodecTagString() {
            return this.codecTagString;
        }

        public ListMediaInfoJobsResponseBodyJobsMediaInfoPropertyVideoStreamInfoList setCodecTimeBase(String codecTimeBase) {
            this.codecTimeBase = codecTimeBase;
            return this;
        }
        public String getCodecTimeBase() {
            return this.codecTimeBase;
        }

        public ListMediaInfoJobsResponseBodyJobsMediaInfoPropertyVideoStreamInfoList setDar(String dar) {
            this.dar = dar;
            return this;
        }
        public String getDar() {
            return this.dar;
        }

        public ListMediaInfoJobsResponseBodyJobsMediaInfoPropertyVideoStreamInfoList setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public ListMediaInfoJobsResponseBodyJobsMediaInfoPropertyVideoStreamInfoList setFps(String fps) {
            this.fps = fps;
            return this;
        }
        public String getFps() {
            return this.fps;
        }

        public ListMediaInfoJobsResponseBodyJobsMediaInfoPropertyVideoStreamInfoList setHasBFrames(String hasBFrames) {
            this.hasBFrames = hasBFrames;
            return this;
        }
        public String getHasBFrames() {
            return this.hasBFrames;
        }

        public ListMediaInfoJobsResponseBodyJobsMediaInfoPropertyVideoStreamInfoList setHeight(String height) {
            this.height = height;
            return this;
        }
        public String getHeight() {
            return this.height;
        }

        public ListMediaInfoJobsResponseBodyJobsMediaInfoPropertyVideoStreamInfoList setIndex(String index) {
            this.index = index;
            return this;
        }
        public String getIndex() {
            return this.index;
        }

        public ListMediaInfoJobsResponseBodyJobsMediaInfoPropertyVideoStreamInfoList setLang(String lang) {
            this.lang = lang;
            return this;
        }
        public String getLang() {
            return this.lang;
        }

        public ListMediaInfoJobsResponseBodyJobsMediaInfoPropertyVideoStreamInfoList setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public ListMediaInfoJobsResponseBodyJobsMediaInfoPropertyVideoStreamInfoList setNumFrames(String numFrames) {
            this.numFrames = numFrames;
            return this;
        }
        public String getNumFrames() {
            return this.numFrames;
        }

        public ListMediaInfoJobsResponseBodyJobsMediaInfoPropertyVideoStreamInfoList setPixFmt(String pixFmt) {
            this.pixFmt = pixFmt;
            return this;
        }
        public String getPixFmt() {
            return this.pixFmt;
        }

        public ListMediaInfoJobsResponseBodyJobsMediaInfoPropertyVideoStreamInfoList setProfile(String profile) {
            this.profile = profile;
            return this;
        }
        public String getProfile() {
            return this.profile;
        }

        public ListMediaInfoJobsResponseBodyJobsMediaInfoPropertyVideoStreamInfoList setRotate(String rotate) {
            this.rotate = rotate;
            return this;
        }
        public String getRotate() {
            return this.rotate;
        }

        public ListMediaInfoJobsResponseBodyJobsMediaInfoPropertyVideoStreamInfoList setSar(String sar) {
            this.sar = sar;
            return this;
        }
        public String getSar() {
            return this.sar;
        }

        public ListMediaInfoJobsResponseBodyJobsMediaInfoPropertyVideoStreamInfoList setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public ListMediaInfoJobsResponseBodyJobsMediaInfoPropertyVideoStreamInfoList setTimeBase(String timeBase) {
            this.timeBase = timeBase;
            return this;
        }
        public String getTimeBase() {
            return this.timeBase;
        }

        public ListMediaInfoJobsResponseBodyJobsMediaInfoPropertyVideoStreamInfoList setWidth(String width) {
            this.width = width;
            return this;
        }
        public String getWidth() {
            return this.width;
        }

    }

    public static class ListMediaInfoJobsResponseBodyJobsMediaInfoProperty extends TeaModel {
        /**
         * <p>The information about the audio stream.</p>
         */
        @NameInMap("AudioStreamInfoList")
        public java.util.List<ListMediaInfoJobsResponseBodyJobsMediaInfoPropertyAudioStreamInfoList> audioStreamInfoList;

        /**
         * <p>The basic file information.</p>
         */
        @NameInMap("FileBasicInfo")
        public ListMediaInfoJobsResponseBodyJobsMediaInfoPropertyFileBasicInfo fileBasicInfo;

        /**
         * <p>The information about the video stream.</p>
         */
        @NameInMap("VideoStreamInfoList")
        public java.util.List<ListMediaInfoJobsResponseBodyJobsMediaInfoPropertyVideoStreamInfoList> videoStreamInfoList;

        public static ListMediaInfoJobsResponseBodyJobsMediaInfoProperty build(java.util.Map<String, ?> map) throws Exception {
            ListMediaInfoJobsResponseBodyJobsMediaInfoProperty self = new ListMediaInfoJobsResponseBodyJobsMediaInfoProperty();
            return TeaModel.build(map, self);
        }

        public ListMediaInfoJobsResponseBodyJobsMediaInfoProperty setAudioStreamInfoList(java.util.List<ListMediaInfoJobsResponseBodyJobsMediaInfoPropertyAudioStreamInfoList> audioStreamInfoList) {
            this.audioStreamInfoList = audioStreamInfoList;
            return this;
        }
        public java.util.List<ListMediaInfoJobsResponseBodyJobsMediaInfoPropertyAudioStreamInfoList> getAudioStreamInfoList() {
            return this.audioStreamInfoList;
        }

        public ListMediaInfoJobsResponseBodyJobsMediaInfoProperty setFileBasicInfo(ListMediaInfoJobsResponseBodyJobsMediaInfoPropertyFileBasicInfo fileBasicInfo) {
            this.fileBasicInfo = fileBasicInfo;
            return this;
        }
        public ListMediaInfoJobsResponseBodyJobsMediaInfoPropertyFileBasicInfo getFileBasicInfo() {
            return this.fileBasicInfo;
        }

        public ListMediaInfoJobsResponseBodyJobsMediaInfoProperty setVideoStreamInfoList(java.util.List<ListMediaInfoJobsResponseBodyJobsMediaInfoPropertyVideoStreamInfoList> videoStreamInfoList) {
            this.videoStreamInfoList = videoStreamInfoList;
            return this;
        }
        public java.util.List<ListMediaInfoJobsResponseBodyJobsMediaInfoPropertyVideoStreamInfoList> getVideoStreamInfoList() {
            return this.videoStreamInfoList;
        }

    }

    public static class ListMediaInfoJobsResponseBodyJobsScheduleConfig extends TeaModel {
        /**
         * <p>The ID of the MPS queue to which the job was submitted.</p>
         * 
         * <strong>example:</strong>
         * <p>e37ebee5d98b4781897f6086e89f9c56</p>
         */
        @NameInMap("PipelineId")
        public String pipelineId;

        /**
         * <p>The priority of the job. Valid values: 1 to 10. The greater the value, the higher the priority.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("Priority")
        public Integer priority;

        public static ListMediaInfoJobsResponseBodyJobsScheduleConfig build(java.util.Map<String, ?> map) throws Exception {
            ListMediaInfoJobsResponseBodyJobsScheduleConfig self = new ListMediaInfoJobsResponseBodyJobsScheduleConfig();
            return TeaModel.build(map, self);
        }

        public ListMediaInfoJobsResponseBodyJobsScheduleConfig setPipelineId(String pipelineId) {
            this.pipelineId = pipelineId;
            return this;
        }
        public String getPipelineId() {
            return this.pipelineId;
        }

        public ListMediaInfoJobsResponseBodyJobsScheduleConfig setPriority(Integer priority) {
            this.priority = priority;
            return this;
        }
        public Integer getPriority() {
            return this.priority;
        }

    }

    public static class ListMediaInfoJobsResponseBodyJobs extends TeaModel {
        /**
         * <p>Indicates whether asynchronous processing was performed.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Async")
        public Boolean async;

        /**
         * <p>The time when the job was complete. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-01-12T08:49:41Z</p>
         */
        @NameInMap("FinishTime")
        public String finishTime;

        /**
         * <p>The input of the job.</p>
         */
        @NameInMap("Input")
        public ListMediaInfoJobsResponseBodyJobsInput input;

        /**
         * <p>The job ID.</p>
         * 
         * <strong>example:</strong>
         * <p>ab4802364a2e49208c99efab82dfa8e8</p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <p>The details of the media information.</p>
         */
        @NameInMap("MediaInfoProperty")
        public ListMediaInfoJobsResponseBodyJobsMediaInfoProperty mediaInfoProperty;

        /**
         * <p>The job name.</p>
         * 
         * <strong>example:</strong>
         * <p>job-name</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The request ID.</p>
         * 
         * <strong>example:</strong>
         * <p>4879B9DE-E4B6-19DC-91F5-9D5F4DCE4168</p>
         */
        @NameInMap("RequestId")
        public String requestId;

        /**
         * <p>The scheduling information.</p>
         */
        @NameInMap("ScheduleConfig")
        public ListMediaInfoJobsResponseBodyJobsScheduleConfig scheduleConfig;

        /**
         * <p>The state of the job. Valid values:</p>
         * <ul>
         * <li>Init: The job is submitted.</li>
         * <li>Success: The job is successful.</li>
         * <li>Fail: The job failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Init</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The job submission information.</p>
         */
        @NameInMap("SubmitResultJson")
        public java.util.Map<String, ?> submitResultJson;

        /**
         * <p>The time when the job was submitted. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-01-12T08:49:41Z</p>
         */
        @NameInMap("SubmitTime")
        public String submitTime;

        /**
         * <p>The source of the job. Valid values:</p>
         * <ul>
         * <li>API</li>
         * <li>WorkFlow</li>
         * <li>Console</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>API</p>
         */
        @NameInMap("TriggerSource")
        public String triggerSource;

        /**
         * <p>The user data.</p>
         * 
         * <strong>example:</strong>
         * <p>user-data</p>
         */
        @NameInMap("UserData")
        public String userData;

        public static ListMediaInfoJobsResponseBodyJobs build(java.util.Map<String, ?> map) throws Exception {
            ListMediaInfoJobsResponseBodyJobs self = new ListMediaInfoJobsResponseBodyJobs();
            return TeaModel.build(map, self);
        }

        public ListMediaInfoJobsResponseBodyJobs setAsync(Boolean async) {
            this.async = async;
            return this;
        }
        public Boolean getAsync() {
            return this.async;
        }

        public ListMediaInfoJobsResponseBodyJobs setFinishTime(String finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public String getFinishTime() {
            return this.finishTime;
        }

        public ListMediaInfoJobsResponseBodyJobs setInput(ListMediaInfoJobsResponseBodyJobsInput input) {
            this.input = input;
            return this;
        }
        public ListMediaInfoJobsResponseBodyJobsInput getInput() {
            return this.input;
        }

        public ListMediaInfoJobsResponseBodyJobs setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public ListMediaInfoJobsResponseBodyJobs setMediaInfoProperty(ListMediaInfoJobsResponseBodyJobsMediaInfoProperty mediaInfoProperty) {
            this.mediaInfoProperty = mediaInfoProperty;
            return this;
        }
        public ListMediaInfoJobsResponseBodyJobsMediaInfoProperty getMediaInfoProperty() {
            return this.mediaInfoProperty;
        }

        public ListMediaInfoJobsResponseBodyJobs setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public ListMediaInfoJobsResponseBodyJobs setRequestId(String requestId) {
            this.requestId = requestId;
            return this;
        }
        public String getRequestId() {
            return this.requestId;
        }

        public ListMediaInfoJobsResponseBodyJobs setScheduleConfig(ListMediaInfoJobsResponseBodyJobsScheduleConfig scheduleConfig) {
            this.scheduleConfig = scheduleConfig;
            return this;
        }
        public ListMediaInfoJobsResponseBodyJobsScheduleConfig getScheduleConfig() {
            return this.scheduleConfig;
        }

        public ListMediaInfoJobsResponseBodyJobs setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public ListMediaInfoJobsResponseBodyJobs setSubmitResultJson(java.util.Map<String, ?> submitResultJson) {
            this.submitResultJson = submitResultJson;
            return this;
        }
        public java.util.Map<String, ?> getSubmitResultJson() {
            return this.submitResultJson;
        }

        public ListMediaInfoJobsResponseBodyJobs setSubmitTime(String submitTime) {
            this.submitTime = submitTime;
            return this;
        }
        public String getSubmitTime() {
            return this.submitTime;
        }

        public ListMediaInfoJobsResponseBodyJobs setTriggerSource(String triggerSource) {
            this.triggerSource = triggerSource;
            return this;
        }
        public String getTriggerSource() {
            return this.triggerSource;
        }

        public ListMediaInfoJobsResponseBodyJobs setUserData(String userData) {
            this.userData = userData;
            return this;
        }
        public String getUserData() {
            return this.userData;
        }

    }

}
