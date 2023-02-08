// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class QueryMediaInfoJobListResponseBody extends TeaModel {
    /**
     * <p>The details of each returned media information analysis job.</p>
     */
    @NameInMap("MediaInfoJobList")
    public QueryMediaInfoJobListResponseBodyMediaInfoJobList mediaInfoJobList;

    /**
     * <p>The IDs of the media information analysis jobs that do not exist. If all specified jobs exist, the response does not contain this parameter.</p>
     */
    @NameInMap("NonExistMediaInfoJobIds")
    public QueryMediaInfoJobListResponseBodyNonExistMediaInfoJobIds nonExistMediaInfoJobIds;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static QueryMediaInfoJobListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryMediaInfoJobListResponseBody self = new QueryMediaInfoJobListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryMediaInfoJobListResponseBody setMediaInfoJobList(QueryMediaInfoJobListResponseBodyMediaInfoJobList mediaInfoJobList) {
        this.mediaInfoJobList = mediaInfoJobList;
        return this;
    }
    public QueryMediaInfoJobListResponseBodyMediaInfoJobList getMediaInfoJobList() {
        return this.mediaInfoJobList;
    }

    public QueryMediaInfoJobListResponseBody setNonExistMediaInfoJobIds(QueryMediaInfoJobListResponseBodyNonExistMediaInfoJobIds nonExistMediaInfoJobIds) {
        this.nonExistMediaInfoJobIds = nonExistMediaInfoJobIds;
        return this;
    }
    public QueryMediaInfoJobListResponseBodyNonExistMediaInfoJobIds getNonExistMediaInfoJobIds() {
        return this.nonExistMediaInfoJobIds;
    }

    public QueryMediaInfoJobListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class QueryMediaInfoJobListResponseBodyMediaInfoJobListMediaInfoJobInput extends TeaModel {
        /**
         * <p>The name of the OSS bucket that stores the object.</p>
         */
        @NameInMap("Bucket")
        public String bucket;

        /**
         * <p>The ID of the OSS region.</p>
         */
        @NameInMap("Location")
        public String location;

        /**
         * <p>The name of the Object Storage Service (OSS) object used as the input file.</p>
         */
        @NameInMap("Object")
        public String object;

        public static QueryMediaInfoJobListResponseBodyMediaInfoJobListMediaInfoJobInput build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaInfoJobListResponseBodyMediaInfoJobListMediaInfoJobInput self = new QueryMediaInfoJobListResponseBodyMediaInfoJobListMediaInfoJobInput();
            return TeaModel.build(map, self);
        }

        public QueryMediaInfoJobListResponseBodyMediaInfoJobListMediaInfoJobInput setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

        public QueryMediaInfoJobListResponseBodyMediaInfoJobListMediaInfoJobInput setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public QueryMediaInfoJobListResponseBodyMediaInfoJobListMediaInfoJobInput setObject(String object) {
            this.object = object;
            return this;
        }
        public String getObject() {
            return this.object;
        }

    }

    public static class QueryMediaInfoJobListResponseBodyMediaInfoJobListMediaInfoJobMNSMessageResult extends TeaModel {
        /**
         * <p>The error code returned when the job fails. This parameter is not returned if the job is successful.</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>The error message returned when the job fails. This parameter is not returned if the job is successful.</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The ID of the success message returned when the job is successful. This parameter is not returned if the job fails.</p>
         */
        @NameInMap("MessageId")
        public String messageId;

        public static QueryMediaInfoJobListResponseBodyMediaInfoJobListMediaInfoJobMNSMessageResult build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaInfoJobListResponseBodyMediaInfoJobListMediaInfoJobMNSMessageResult self = new QueryMediaInfoJobListResponseBodyMediaInfoJobListMediaInfoJobMNSMessageResult();
            return TeaModel.build(map, self);
        }

        public QueryMediaInfoJobListResponseBodyMediaInfoJobListMediaInfoJobMNSMessageResult setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public QueryMediaInfoJobListResponseBodyMediaInfoJobListMediaInfoJobMNSMessageResult setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public QueryMediaInfoJobListResponseBodyMediaInfoJobListMediaInfoJobMNSMessageResult setMessageId(String messageId) {
            this.messageId = messageId;
            return this;
        }
        public String getMessageId() {
            return this.messageId;
        }

    }

    public static class QueryMediaInfoJobListResponseBodyMediaInfoJobListMediaInfoJobPropertiesFormat extends TeaModel {
        /**
         * <p>The total bitrate.</p>
         */
        @NameInMap("Bitrate")
        public String bitrate;

        /**
         * <p>The total duration.</p>
         */
        @NameInMap("Duration")
        public String duration;

        /**
         * <p>The full name of the container format.</p>
         */
        @NameInMap("FormatLongName")
        public String formatLongName;

        /**
         * <p>The short name of the container format.</p>
         */
        @NameInMap("FormatName")
        public String formatName;

        /**
         * <p>The total number of program streams.</p>
         */
        @NameInMap("NumPrograms")
        public String numPrograms;

        /**
         * <p>The total number of media streams.</p>
         */
        @NameInMap("NumStreams")
        public String numStreams;

        /**
         * <p>The size of the file.</p>
         */
        @NameInMap("Size")
        public String size;

        /**
         * <p>The start time.</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        public static QueryMediaInfoJobListResponseBodyMediaInfoJobListMediaInfoJobPropertiesFormat build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaInfoJobListResponseBodyMediaInfoJobListMediaInfoJobPropertiesFormat self = new QueryMediaInfoJobListResponseBodyMediaInfoJobListMediaInfoJobPropertiesFormat();
            return TeaModel.build(map, self);
        }

        public QueryMediaInfoJobListResponseBodyMediaInfoJobListMediaInfoJobPropertiesFormat setBitrate(String bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public String getBitrate() {
            return this.bitrate;
        }

        public QueryMediaInfoJobListResponseBodyMediaInfoJobListMediaInfoJobPropertiesFormat setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public QueryMediaInfoJobListResponseBodyMediaInfoJobListMediaInfoJobPropertiesFormat setFormatLongName(String formatLongName) {
            this.formatLongName = formatLongName;
            return this;
        }
        public String getFormatLongName() {
            return this.formatLongName;
        }

        public QueryMediaInfoJobListResponseBodyMediaInfoJobListMediaInfoJobPropertiesFormat setFormatName(String formatName) {
            this.formatName = formatName;
            return this;
        }
        public String getFormatName() {
            return this.formatName;
        }

        public QueryMediaInfoJobListResponseBodyMediaInfoJobListMediaInfoJobPropertiesFormat setNumPrograms(String numPrograms) {
            this.numPrograms = numPrograms;
            return this;
        }
        public String getNumPrograms() {
            return this.numPrograms;
        }

        public QueryMediaInfoJobListResponseBodyMediaInfoJobListMediaInfoJobPropertiesFormat setNumStreams(String numStreams) {
            this.numStreams = numStreams;
            return this;
        }
        public String getNumStreams() {
            return this.numStreams;
        }

        public QueryMediaInfoJobListResponseBodyMediaInfoJobListMediaInfoJobPropertiesFormat setSize(String size) {
            this.size = size;
            return this;
        }
        public String getSize() {
            return this.size;
        }

        public QueryMediaInfoJobListResponseBodyMediaInfoJobListMediaInfoJobPropertiesFormat setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

    public static class QueryMediaInfoJobListResponseBodyMediaInfoJobListMediaInfoJobPropertiesStreamsAudioStreamListAudioStream extends TeaModel {
        /**
         * <p>The bitrate.</p>
         */
        @NameInMap("Bitrate")
        public String bitrate;

        /**
         * <p>The number of sound channels.</p>
         */
        @NameInMap("ChannelLayout")
        public String channelLayout;

        /**
         * <p>The output layout of the sound channels.</p>
         */
        @NameInMap("Channels")
        public String channels;

        /**
         * <p>The full name of the encoding format.</p>
         */
        @NameInMap("CodecLongName")
        public String codecLongName;

        /**
         * <p>The short name of the encoding format. Valid values:</p>
         * <br>
         * <p>- **acc**</p>
         * <p>- **mp3**</p>
         * <p>- **mp4**</p>
         * <p>- **ogg**</p>
         * <p>- **flac**</p>
         */
        @NameInMap("CodecName")
        public String codecName;

        /**
         * <p>The tag of the encoding format.</p>
         */
        @NameInMap("CodecTag")
        public String codecTag;

        /**
         * <p>The tag string of the encoding format.</p>
         */
        @NameInMap("CodecTagString")
        public String codecTagString;

        /**
         * <p>The codec time base.</p>
         */
        @NameInMap("CodecTimeBase")
        public String codecTimeBase;

        /**
         * <p>The duration.</p>
         */
        @NameInMap("Duration")
        public String duration;

        /**
         * <p>The sequence number of the audio stream. The value indicates the position of the audio stream in all audio streams.</p>
         */
        @NameInMap("Index")
        public String index;

        /**
         * <p>The language. For more information, see [21.20.1 Metadata](https://www.ffmpeg.org/ffmpeg-all.html?spm=a2c4g.11186623.2.66.243851cd2SntfN#Metadata) in FFmpeg documentation.</p>
         */
        @NameInMap("Lang")
        public String lang;

        /**
         * <p>The total number of frames.</p>
         */
        @NameInMap("NumFrames")
        public String numFrames;

        /**
         * <p>The sampling format.</p>
         */
        @NameInMap("SampleFmt")
        public String sampleFmt;

        /**
         * <p>The sampling rate.</p>
         */
        @NameInMap("Samplerate")
        public String samplerate;

        /**
         * <p>The start time.</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The time base.</p>
         */
        @NameInMap("Timebase")
        public String timebase;

        public static QueryMediaInfoJobListResponseBodyMediaInfoJobListMediaInfoJobPropertiesStreamsAudioStreamListAudioStream build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaInfoJobListResponseBodyMediaInfoJobListMediaInfoJobPropertiesStreamsAudioStreamListAudioStream self = new QueryMediaInfoJobListResponseBodyMediaInfoJobListMediaInfoJobPropertiesStreamsAudioStreamListAudioStream();
            return TeaModel.build(map, self);
        }

        public QueryMediaInfoJobListResponseBodyMediaInfoJobListMediaInfoJobPropertiesStreamsAudioStreamListAudioStream setBitrate(String bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public String getBitrate() {
            return this.bitrate;
        }

        public QueryMediaInfoJobListResponseBodyMediaInfoJobListMediaInfoJobPropertiesStreamsAudioStreamListAudioStream setChannelLayout(String channelLayout) {
            this.channelLayout = channelLayout;
            return this;
        }
        public String getChannelLayout() {
            return this.channelLayout;
        }

        public QueryMediaInfoJobListResponseBodyMediaInfoJobListMediaInfoJobPropertiesStreamsAudioStreamListAudioStream setChannels(String channels) {
            this.channels = channels;
            return this;
        }
        public String getChannels() {
            return this.channels;
        }

        public QueryMediaInfoJobListResponseBodyMediaInfoJobListMediaInfoJobPropertiesStreamsAudioStreamListAudioStream setCodecLongName(String codecLongName) {
            this.codecLongName = codecLongName;
            return this;
        }
        public String getCodecLongName() {
            return this.codecLongName;
        }

        public QueryMediaInfoJobListResponseBodyMediaInfoJobListMediaInfoJobPropertiesStreamsAudioStreamListAudioStream setCodecName(String codecName) {
            this.codecName = codecName;
            return this;
        }
        public String getCodecName() {
            return this.codecName;
        }

        public QueryMediaInfoJobListResponseBodyMediaInfoJobListMediaInfoJobPropertiesStreamsAudioStreamListAudioStream setCodecTag(String codecTag) {
            this.codecTag = codecTag;
            return this;
        }
        public String getCodecTag() {
            return this.codecTag;
        }

        public QueryMediaInfoJobListResponseBodyMediaInfoJobListMediaInfoJobPropertiesStreamsAudioStreamListAudioStream setCodecTagString(String codecTagString) {
            this.codecTagString = codecTagString;
            return this;
        }
        public String getCodecTagString() {
            return this.codecTagString;
        }

        public QueryMediaInfoJobListResponseBodyMediaInfoJobListMediaInfoJobPropertiesStreamsAudioStreamListAudioStream setCodecTimeBase(String codecTimeBase) {
            this.codecTimeBase = codecTimeBase;
            return this;
        }
        public String getCodecTimeBase() {
            return this.codecTimeBase;
        }

        public QueryMediaInfoJobListResponseBodyMediaInfoJobListMediaInfoJobPropertiesStreamsAudioStreamListAudioStream setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public QueryMediaInfoJobListResponseBodyMediaInfoJobListMediaInfoJobPropertiesStreamsAudioStreamListAudioStream setIndex(String index) {
            this.index = index;
            return this;
        }
        public String getIndex() {
            return this.index;
        }

        public QueryMediaInfoJobListResponseBodyMediaInfoJobListMediaInfoJobPropertiesStreamsAudioStreamListAudioStream setLang(String lang) {
            this.lang = lang;
            return this;
        }
        public String getLang() {
            return this.lang;
        }

        public QueryMediaInfoJobListResponseBodyMediaInfoJobListMediaInfoJobPropertiesStreamsAudioStreamListAudioStream setNumFrames(String numFrames) {
            this.numFrames = numFrames;
            return this;
        }
        public String getNumFrames() {
            return this.numFrames;
        }

        public QueryMediaInfoJobListResponseBodyMediaInfoJobListMediaInfoJobPropertiesStreamsAudioStreamListAudioStream setSampleFmt(String sampleFmt) {
            this.sampleFmt = sampleFmt;
            return this;
        }
        public String getSampleFmt() {
            return this.sampleFmt;
        }

        public QueryMediaInfoJobListResponseBodyMediaInfoJobListMediaInfoJobPropertiesStreamsAudioStreamListAudioStream setSamplerate(String samplerate) {
            this.samplerate = samplerate;
            return this;
        }
        public String getSamplerate() {
            return this.samplerate;
        }

        public QueryMediaInfoJobListResponseBodyMediaInfoJobListMediaInfoJobPropertiesStreamsAudioStreamListAudioStream setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public QueryMediaInfoJobListResponseBodyMediaInfoJobListMediaInfoJobPropertiesStreamsAudioStreamListAudioStream setTimebase(String timebase) {
            this.timebase = timebase;
            return this;
        }
        public String getTimebase() {
            return this.timebase;
        }

    }

    public static class QueryMediaInfoJobListResponseBodyMediaInfoJobListMediaInfoJobPropertiesStreamsAudioStreamList extends TeaModel {
        @NameInMap("AudioStream")
        public java.util.List<QueryMediaInfoJobListResponseBodyMediaInfoJobListMediaInfoJobPropertiesStreamsAudioStreamListAudioStream> audioStream;

        public static QueryMediaInfoJobListResponseBodyMediaInfoJobListMediaInfoJobPropertiesStreamsAudioStreamList build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaInfoJobListResponseBodyMediaInfoJobListMediaInfoJobPropertiesStreamsAudioStreamList self = new QueryMediaInfoJobListResponseBodyMediaInfoJobListMediaInfoJobPropertiesStreamsAudioStreamList();
            return TeaModel.build(map, self);
        }

        public QueryMediaInfoJobListResponseBodyMediaInfoJobListMediaInfoJobPropertiesStreamsAudioStreamList setAudioStream(java.util.List<QueryMediaInfoJobListResponseBodyMediaInfoJobListMediaInfoJobPropertiesStreamsAudioStreamListAudioStream> audioStream) {
            this.audioStream = audioStream;
            return this;
        }
        public java.util.List<QueryMediaInfoJobListResponseBodyMediaInfoJobListMediaInfoJobPropertiesStreamsAudioStreamListAudioStream> getAudioStream() {
            return this.audioStream;
        }

    }

    public static class QueryMediaInfoJobListResponseBodyMediaInfoJobListMediaInfoJobPropertiesStreamsSubtitleStreamListSubtitleStream extends TeaModel {
        /**
         * <p>The full name of the encoding format.</p>
         */
        @NameInMap("CodecLongName")
        public String codecLongName;

        /**
         * <p>The short name of the encoding format. Valid values:</p>
         * <br>
         * <p>- **srt**</p>
         * <p>- **ass**</p>
         */
        @NameInMap("CodecName")
        public String codecName;

        /**
         * <p>The tag of the encoding format.</p>
         */
        @NameInMap("CodecTag")
        public String codecTag;

        /**
         * <p>The tag string of the encoding format.</p>
         */
        @NameInMap("CodecTagString")
        public String codecTagString;

        /**
         * <p>The codec time base.</p>
         */
        @NameInMap("CodecTimeBase")
        public String codecTimeBase;

        /**
         * <p>The duration. Unit: seconds.</p>
         */
        @NameInMap("Duration")
        public String duration;

        /**
         * <p>The sequence number of the subtitle stream. The value indicates the position of the subtitle stream in all subtitle streams.</p>
         */
        @NameInMap("Index")
        public String index;

        /**
         * <p>The language.</p>
         */
        @NameInMap("Lang")
        public String lang;

        /**
         * <p>The start time.</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The time base.</p>
         */
        @NameInMap("Timebase")
        public String timebase;

        public static QueryMediaInfoJobListResponseBodyMediaInfoJobListMediaInfoJobPropertiesStreamsSubtitleStreamListSubtitleStream build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaInfoJobListResponseBodyMediaInfoJobListMediaInfoJobPropertiesStreamsSubtitleStreamListSubtitleStream self = new QueryMediaInfoJobListResponseBodyMediaInfoJobListMediaInfoJobPropertiesStreamsSubtitleStreamListSubtitleStream();
            return TeaModel.build(map, self);
        }

        public QueryMediaInfoJobListResponseBodyMediaInfoJobListMediaInfoJobPropertiesStreamsSubtitleStreamListSubtitleStream setCodecLongName(String codecLongName) {
            this.codecLongName = codecLongName;
            return this;
        }
        public String getCodecLongName() {
            return this.codecLongName;
        }

        public QueryMediaInfoJobListResponseBodyMediaInfoJobListMediaInfoJobPropertiesStreamsSubtitleStreamListSubtitleStream setCodecName(String codecName) {
            this.codecName = codecName;
            return this;
        }
        public String getCodecName() {
            return this.codecName;
        }

        public QueryMediaInfoJobListResponseBodyMediaInfoJobListMediaInfoJobPropertiesStreamsSubtitleStreamListSubtitleStream setCodecTag(String codecTag) {
            this.codecTag = codecTag;
            return this;
        }
        public String getCodecTag() {
            return this.codecTag;
        }

        public QueryMediaInfoJobListResponseBodyMediaInfoJobListMediaInfoJobPropertiesStreamsSubtitleStreamListSubtitleStream setCodecTagString(String codecTagString) {
            this.codecTagString = codecTagString;
            return this;
        }
        public String getCodecTagString() {
            return this.codecTagString;
        }

        public QueryMediaInfoJobListResponseBodyMediaInfoJobListMediaInfoJobPropertiesStreamsSubtitleStreamListSubtitleStream setCodecTimeBase(String codecTimeBase) {
            this.codecTimeBase = codecTimeBase;
            return this;
        }
        public String getCodecTimeBase() {
            return this.codecTimeBase;
        }

        public QueryMediaInfoJobListResponseBodyMediaInfoJobListMediaInfoJobPropertiesStreamsSubtitleStreamListSubtitleStream setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public QueryMediaInfoJobListResponseBodyMediaInfoJobListMediaInfoJobPropertiesStreamsSubtitleStreamListSubtitleStream setIndex(String index) {
            this.index = index;
            return this;
        }
        public String getIndex() {
            return this.index;
        }

        public QueryMediaInfoJobListResponseBodyMediaInfoJobListMediaInfoJobPropertiesStreamsSubtitleStreamListSubtitleStream setLang(String lang) {
            this.lang = lang;
            return this;
        }
        public String getLang() {
            return this.lang;
        }

        public QueryMediaInfoJobListResponseBodyMediaInfoJobListMediaInfoJobPropertiesStreamsSubtitleStreamListSubtitleStream setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public QueryMediaInfoJobListResponseBodyMediaInfoJobListMediaInfoJobPropertiesStreamsSubtitleStreamListSubtitleStream setTimebase(String timebase) {
            this.timebase = timebase;
            return this;
        }
        public String getTimebase() {
            return this.timebase;
        }

    }

    public static class QueryMediaInfoJobListResponseBodyMediaInfoJobListMediaInfoJobPropertiesStreamsSubtitleStreamList extends TeaModel {
        @NameInMap("SubtitleStream")
        public java.util.List<QueryMediaInfoJobListResponseBodyMediaInfoJobListMediaInfoJobPropertiesStreamsSubtitleStreamListSubtitleStream> subtitleStream;

        public static QueryMediaInfoJobListResponseBodyMediaInfoJobListMediaInfoJobPropertiesStreamsSubtitleStreamList build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaInfoJobListResponseBodyMediaInfoJobListMediaInfoJobPropertiesStreamsSubtitleStreamList self = new QueryMediaInfoJobListResponseBodyMediaInfoJobListMediaInfoJobPropertiesStreamsSubtitleStreamList();
            return TeaModel.build(map, self);
        }

        public QueryMediaInfoJobListResponseBodyMediaInfoJobListMediaInfoJobPropertiesStreamsSubtitleStreamList setSubtitleStream(java.util.List<QueryMediaInfoJobListResponseBodyMediaInfoJobListMediaInfoJobPropertiesStreamsSubtitleStreamListSubtitleStream> subtitleStream) {
            this.subtitleStream = subtitleStream;
            return this;
        }
        public java.util.List<QueryMediaInfoJobListResponseBodyMediaInfoJobListMediaInfoJobPropertiesStreamsSubtitleStreamListSubtitleStream> getSubtitleStream() {
            return this.subtitleStream;
        }

    }

    public static class QueryMediaInfoJobListResponseBodyMediaInfoJobListMediaInfoJobPropertiesStreamsVideoStreamListVideoStreamNetworkCost extends TeaModel {
        /**
         * <p>The average bitrate.</p>
         */
        @NameInMap("AvgBitrate")
        public String avgBitrate;

        /**
         * <p>The maximum bandwidth consumption.</p>
         */
        @NameInMap("CostBandwidth")
        public String costBandwidth;

        /**
         * <p>The amount of preload time.</p>
         */
        @NameInMap("PreloadTime")
        public String preloadTime;

        public static QueryMediaInfoJobListResponseBodyMediaInfoJobListMediaInfoJobPropertiesStreamsVideoStreamListVideoStreamNetworkCost build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaInfoJobListResponseBodyMediaInfoJobListMediaInfoJobPropertiesStreamsVideoStreamListVideoStreamNetworkCost self = new QueryMediaInfoJobListResponseBodyMediaInfoJobListMediaInfoJobPropertiesStreamsVideoStreamListVideoStreamNetworkCost();
            return TeaModel.build(map, self);
        }

        public QueryMediaInfoJobListResponseBodyMediaInfoJobListMediaInfoJobPropertiesStreamsVideoStreamListVideoStreamNetworkCost setAvgBitrate(String avgBitrate) {
            this.avgBitrate = avgBitrate;
            return this;
        }
        public String getAvgBitrate() {
            return this.avgBitrate;
        }

        public QueryMediaInfoJobListResponseBodyMediaInfoJobListMediaInfoJobPropertiesStreamsVideoStreamListVideoStreamNetworkCost setCostBandwidth(String costBandwidth) {
            this.costBandwidth = costBandwidth;
            return this;
        }
        public String getCostBandwidth() {
            return this.costBandwidth;
        }

        public QueryMediaInfoJobListResponseBodyMediaInfoJobListMediaInfoJobPropertiesStreamsVideoStreamListVideoStreamNetworkCost setPreloadTime(String preloadTime) {
            this.preloadTime = preloadTime;
            return this;
        }
        public String getPreloadTime() {
            return this.preloadTime;
        }

    }

    public static class QueryMediaInfoJobListResponseBodyMediaInfoJobListMediaInfoJobPropertiesStreamsVideoStreamListVideoStream extends TeaModel {
        /**
         * <p>The average frame rate.</p>
         */
        @NameInMap("AvgFPS")
        public String avgFPS;

        /**
         * <p>The bitrate.</p>
         */
        @NameInMap("Bitrate")
        public String bitrate;

        /**
         * <p>The full name of the encoding format.</p>
         */
        @NameInMap("CodecLongName")
        public String codecLongName;

        /**
         * <p>The short name of the encoding format. Valid values:</p>
         * <br>
         * <p>*   **h264**</p>
         * <p>*   **h265**</p>
         * <p>*   **gif**</p>
         * <p>*   **webp**</p>
         */
        @NameInMap("CodecName")
        public String codecName;

        /**
         * <p>The tag of the encoding format.</p>
         */
        @NameInMap("CodecTag")
        public String codecTag;

        /**
         * <p>The tag string of the encoding format.</p>
         */
        @NameInMap("CodecTagString")
        public String codecTagString;

        /**
         * <p>The codec time base.</p>
         */
        @NameInMap("CodecTimeBase")
        public String codecTimeBase;

        /**
         * <p>The level of color reconstruction.</p>
         */
        @NameInMap("ColorPrimaries")
        public String colorPrimaries;

        /**
         * <p>The color range.</p>
         */
        @NameInMap("ColorRange")
        public String colorRange;

        /**
         * <p>The color channel.</p>
         */
        @NameInMap("ColorTransfer")
        public String colorTransfer;

        /**
         * <p>The display aspect ratio (DAR).</p>
         */
        @NameInMap("Dar")
        public String dar;

        /**
         * <p>The duration.</p>
         */
        @NameInMap("Duration")
        public String duration;

        /**
         * <p>The frame rate.</p>
         */
        @NameInMap("Fps")
        public String fps;

        /**
         * <p>Indicates whether the video stream contains bidirectional frames (B-frames). A value of 1 indicates that the video stream contains B-frames. A value of 0 indicates that the video stream does not contain B-frames.</p>
         */
        @NameInMap("HasBFrames")
        public String hasBFrames;

        /**
         * <p>The latter number in the video resolution. The number indicates the video height.</p>
         */
        @NameInMap("Height")
        public String height;

        /**
         * <p>The sequence number of the video stream. The value indicates the position of the video stream in all video streams.</p>
         */
        @NameInMap("Index")
        public String index;

        /**
         * <p>The language.</p>
         */
        @NameInMap("Lang")
        public String lang;

        /**
         * <p>The codec level.</p>
         */
        @NameInMap("Level")
        public String level;

        /**
         * <p>The network bandwidth consumption.</p>
         */
        @NameInMap("NetworkCost")
        public QueryMediaInfoJobListResponseBodyMediaInfoJobListMediaInfoJobPropertiesStreamsVideoStreamListVideoStreamNetworkCost networkCost;

        /**
         * <p>The total number of frames.</p>
         */
        @NameInMap("NumFrames")
        public String numFrames;

        /**
         * <p>The pixel format.</p>
         */
        @NameInMap("PixFmt")
        public String pixFmt;

        /**
         * <p>The codec profile.</p>
         */
        @NameInMap("Profile")
        public String profile;

        /**
         * <p>The video rotation angle.</p>
         */
        @NameInMap("Rotate")
        public String rotate;

        /**
         * <p>The sample aspect ratio (SAR).</p>
         */
        @NameInMap("Sar")
        public String sar;

        /**
         * <p>The start time.</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The time base.</p>
         */
        @NameInMap("Timebase")
        public String timebase;

        /**
         * <p>The former number in the video resolution. The number indicates the video width.</p>
         */
        @NameInMap("Width")
        public String width;

        public static QueryMediaInfoJobListResponseBodyMediaInfoJobListMediaInfoJobPropertiesStreamsVideoStreamListVideoStream build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaInfoJobListResponseBodyMediaInfoJobListMediaInfoJobPropertiesStreamsVideoStreamListVideoStream self = new QueryMediaInfoJobListResponseBodyMediaInfoJobListMediaInfoJobPropertiesStreamsVideoStreamListVideoStream();
            return TeaModel.build(map, self);
        }

        public QueryMediaInfoJobListResponseBodyMediaInfoJobListMediaInfoJobPropertiesStreamsVideoStreamListVideoStream setAvgFPS(String avgFPS) {
            this.avgFPS = avgFPS;
            return this;
        }
        public String getAvgFPS() {
            return this.avgFPS;
        }

        public QueryMediaInfoJobListResponseBodyMediaInfoJobListMediaInfoJobPropertiesStreamsVideoStreamListVideoStream setBitrate(String bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public String getBitrate() {
            return this.bitrate;
        }

        public QueryMediaInfoJobListResponseBodyMediaInfoJobListMediaInfoJobPropertiesStreamsVideoStreamListVideoStream setCodecLongName(String codecLongName) {
            this.codecLongName = codecLongName;
            return this;
        }
        public String getCodecLongName() {
            return this.codecLongName;
        }

        public QueryMediaInfoJobListResponseBodyMediaInfoJobListMediaInfoJobPropertiesStreamsVideoStreamListVideoStream setCodecName(String codecName) {
            this.codecName = codecName;
            return this;
        }
        public String getCodecName() {
            return this.codecName;
        }

        public QueryMediaInfoJobListResponseBodyMediaInfoJobListMediaInfoJobPropertiesStreamsVideoStreamListVideoStream setCodecTag(String codecTag) {
            this.codecTag = codecTag;
            return this;
        }
        public String getCodecTag() {
            return this.codecTag;
        }

        public QueryMediaInfoJobListResponseBodyMediaInfoJobListMediaInfoJobPropertiesStreamsVideoStreamListVideoStream setCodecTagString(String codecTagString) {
            this.codecTagString = codecTagString;
            return this;
        }
        public String getCodecTagString() {
            return this.codecTagString;
        }

        public QueryMediaInfoJobListResponseBodyMediaInfoJobListMediaInfoJobPropertiesStreamsVideoStreamListVideoStream setCodecTimeBase(String codecTimeBase) {
            this.codecTimeBase = codecTimeBase;
            return this;
        }
        public String getCodecTimeBase() {
            return this.codecTimeBase;
        }

        public QueryMediaInfoJobListResponseBodyMediaInfoJobListMediaInfoJobPropertiesStreamsVideoStreamListVideoStream setColorPrimaries(String colorPrimaries) {
            this.colorPrimaries = colorPrimaries;
            return this;
        }
        public String getColorPrimaries() {
            return this.colorPrimaries;
        }

        public QueryMediaInfoJobListResponseBodyMediaInfoJobListMediaInfoJobPropertiesStreamsVideoStreamListVideoStream setColorRange(String colorRange) {
            this.colorRange = colorRange;
            return this;
        }
        public String getColorRange() {
            return this.colorRange;
        }

        public QueryMediaInfoJobListResponseBodyMediaInfoJobListMediaInfoJobPropertiesStreamsVideoStreamListVideoStream setColorTransfer(String colorTransfer) {
            this.colorTransfer = colorTransfer;
            return this;
        }
        public String getColorTransfer() {
            return this.colorTransfer;
        }

        public QueryMediaInfoJobListResponseBodyMediaInfoJobListMediaInfoJobPropertiesStreamsVideoStreamListVideoStream setDar(String dar) {
            this.dar = dar;
            return this;
        }
        public String getDar() {
            return this.dar;
        }

        public QueryMediaInfoJobListResponseBodyMediaInfoJobListMediaInfoJobPropertiesStreamsVideoStreamListVideoStream setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public QueryMediaInfoJobListResponseBodyMediaInfoJobListMediaInfoJobPropertiesStreamsVideoStreamListVideoStream setFps(String fps) {
            this.fps = fps;
            return this;
        }
        public String getFps() {
            return this.fps;
        }

        public QueryMediaInfoJobListResponseBodyMediaInfoJobListMediaInfoJobPropertiesStreamsVideoStreamListVideoStream setHasBFrames(String hasBFrames) {
            this.hasBFrames = hasBFrames;
            return this;
        }
        public String getHasBFrames() {
            return this.hasBFrames;
        }

        public QueryMediaInfoJobListResponseBodyMediaInfoJobListMediaInfoJobPropertiesStreamsVideoStreamListVideoStream setHeight(String height) {
            this.height = height;
            return this;
        }
        public String getHeight() {
            return this.height;
        }

        public QueryMediaInfoJobListResponseBodyMediaInfoJobListMediaInfoJobPropertiesStreamsVideoStreamListVideoStream setIndex(String index) {
            this.index = index;
            return this;
        }
        public String getIndex() {
            return this.index;
        }

        public QueryMediaInfoJobListResponseBodyMediaInfoJobListMediaInfoJobPropertiesStreamsVideoStreamListVideoStream setLang(String lang) {
            this.lang = lang;
            return this;
        }
        public String getLang() {
            return this.lang;
        }

        public QueryMediaInfoJobListResponseBodyMediaInfoJobListMediaInfoJobPropertiesStreamsVideoStreamListVideoStream setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public QueryMediaInfoJobListResponseBodyMediaInfoJobListMediaInfoJobPropertiesStreamsVideoStreamListVideoStream setNetworkCost(QueryMediaInfoJobListResponseBodyMediaInfoJobListMediaInfoJobPropertiesStreamsVideoStreamListVideoStreamNetworkCost networkCost) {
            this.networkCost = networkCost;
            return this;
        }
        public QueryMediaInfoJobListResponseBodyMediaInfoJobListMediaInfoJobPropertiesStreamsVideoStreamListVideoStreamNetworkCost getNetworkCost() {
            return this.networkCost;
        }

        public QueryMediaInfoJobListResponseBodyMediaInfoJobListMediaInfoJobPropertiesStreamsVideoStreamListVideoStream setNumFrames(String numFrames) {
            this.numFrames = numFrames;
            return this;
        }
        public String getNumFrames() {
            return this.numFrames;
        }

        public QueryMediaInfoJobListResponseBodyMediaInfoJobListMediaInfoJobPropertiesStreamsVideoStreamListVideoStream setPixFmt(String pixFmt) {
            this.pixFmt = pixFmt;
            return this;
        }
        public String getPixFmt() {
            return this.pixFmt;
        }

        public QueryMediaInfoJobListResponseBodyMediaInfoJobListMediaInfoJobPropertiesStreamsVideoStreamListVideoStream setProfile(String profile) {
            this.profile = profile;
            return this;
        }
        public String getProfile() {
            return this.profile;
        }

        public QueryMediaInfoJobListResponseBodyMediaInfoJobListMediaInfoJobPropertiesStreamsVideoStreamListVideoStream setRotate(String rotate) {
            this.rotate = rotate;
            return this;
        }
        public String getRotate() {
            return this.rotate;
        }

        public QueryMediaInfoJobListResponseBodyMediaInfoJobListMediaInfoJobPropertiesStreamsVideoStreamListVideoStream setSar(String sar) {
            this.sar = sar;
            return this;
        }
        public String getSar() {
            return this.sar;
        }

        public QueryMediaInfoJobListResponseBodyMediaInfoJobListMediaInfoJobPropertiesStreamsVideoStreamListVideoStream setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public QueryMediaInfoJobListResponseBodyMediaInfoJobListMediaInfoJobPropertiesStreamsVideoStreamListVideoStream setTimebase(String timebase) {
            this.timebase = timebase;
            return this;
        }
        public String getTimebase() {
            return this.timebase;
        }

        public QueryMediaInfoJobListResponseBodyMediaInfoJobListMediaInfoJobPropertiesStreamsVideoStreamListVideoStream setWidth(String width) {
            this.width = width;
            return this;
        }
        public String getWidth() {
            return this.width;
        }

    }

    public static class QueryMediaInfoJobListResponseBodyMediaInfoJobListMediaInfoJobPropertiesStreamsVideoStreamList extends TeaModel {
        @NameInMap("VideoStream")
        public java.util.List<QueryMediaInfoJobListResponseBodyMediaInfoJobListMediaInfoJobPropertiesStreamsVideoStreamListVideoStream> videoStream;

        public static QueryMediaInfoJobListResponseBodyMediaInfoJobListMediaInfoJobPropertiesStreamsVideoStreamList build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaInfoJobListResponseBodyMediaInfoJobListMediaInfoJobPropertiesStreamsVideoStreamList self = new QueryMediaInfoJobListResponseBodyMediaInfoJobListMediaInfoJobPropertiesStreamsVideoStreamList();
            return TeaModel.build(map, self);
        }

        public QueryMediaInfoJobListResponseBodyMediaInfoJobListMediaInfoJobPropertiesStreamsVideoStreamList setVideoStream(java.util.List<QueryMediaInfoJobListResponseBodyMediaInfoJobListMediaInfoJobPropertiesStreamsVideoStreamListVideoStream> videoStream) {
            this.videoStream = videoStream;
            return this;
        }
        public java.util.List<QueryMediaInfoJobListResponseBodyMediaInfoJobListMediaInfoJobPropertiesStreamsVideoStreamListVideoStream> getVideoStream() {
            return this.videoStream;
        }

    }

    public static class QueryMediaInfoJobListResponseBodyMediaInfoJobListMediaInfoJobPropertiesStreams extends TeaModel {
        /**
         * <p>The information about each audio stream.</p>
         */
        @NameInMap("AudioStreamList")
        public QueryMediaInfoJobListResponseBodyMediaInfoJobListMediaInfoJobPropertiesStreamsAudioStreamList audioStreamList;

        /**
         * <p>The information about each subtitle stream.</p>
         */
        @NameInMap("SubtitleStreamList")
        public QueryMediaInfoJobListResponseBodyMediaInfoJobListMediaInfoJobPropertiesStreamsSubtitleStreamList subtitleStreamList;

        /**
         * <p>The information about each video stream.</p>
         */
        @NameInMap("VideoStreamList")
        public QueryMediaInfoJobListResponseBodyMediaInfoJobListMediaInfoJobPropertiesStreamsVideoStreamList videoStreamList;

        public static QueryMediaInfoJobListResponseBodyMediaInfoJobListMediaInfoJobPropertiesStreams build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaInfoJobListResponseBodyMediaInfoJobListMediaInfoJobPropertiesStreams self = new QueryMediaInfoJobListResponseBodyMediaInfoJobListMediaInfoJobPropertiesStreams();
            return TeaModel.build(map, self);
        }

        public QueryMediaInfoJobListResponseBodyMediaInfoJobListMediaInfoJobPropertiesStreams setAudioStreamList(QueryMediaInfoJobListResponseBodyMediaInfoJobListMediaInfoJobPropertiesStreamsAudioStreamList audioStreamList) {
            this.audioStreamList = audioStreamList;
            return this;
        }
        public QueryMediaInfoJobListResponseBodyMediaInfoJobListMediaInfoJobPropertiesStreamsAudioStreamList getAudioStreamList() {
            return this.audioStreamList;
        }

        public QueryMediaInfoJobListResponseBodyMediaInfoJobListMediaInfoJobPropertiesStreams setSubtitleStreamList(QueryMediaInfoJobListResponseBodyMediaInfoJobListMediaInfoJobPropertiesStreamsSubtitleStreamList subtitleStreamList) {
            this.subtitleStreamList = subtitleStreamList;
            return this;
        }
        public QueryMediaInfoJobListResponseBodyMediaInfoJobListMediaInfoJobPropertiesStreamsSubtitleStreamList getSubtitleStreamList() {
            return this.subtitleStreamList;
        }

        public QueryMediaInfoJobListResponseBodyMediaInfoJobListMediaInfoJobPropertiesStreams setVideoStreamList(QueryMediaInfoJobListResponseBodyMediaInfoJobListMediaInfoJobPropertiesStreamsVideoStreamList videoStreamList) {
            this.videoStreamList = videoStreamList;
            return this;
        }
        public QueryMediaInfoJobListResponseBodyMediaInfoJobListMediaInfoJobPropertiesStreamsVideoStreamList getVideoStreamList() {
            return this.videoStreamList;
        }

    }

    public static class QueryMediaInfoJobListResponseBodyMediaInfoJobListMediaInfoJobProperties extends TeaModel {
        /**
         * <p>The bitrate.</p>
         */
        @NameInMap("Bitrate")
        public String bitrate;

        /**
         * <p>The duration.</p>
         */
        @NameInMap("Duration")
        public String duration;

        /**
         * <p>The file format.</p>
         */
        @NameInMap("FileFormat")
        public String fileFormat;

        /**
         * <p>The size of the file.</p>
         */
        @NameInMap("FileSize")
        public String fileSize;

        /**
         * <p>The format information.</p>
         */
        @NameInMap("Format")
        public QueryMediaInfoJobListResponseBodyMediaInfoJobListMediaInfoJobPropertiesFormat format;

        /**
         * <p>The frame rate.</p>
         */
        @NameInMap("Fps")
        public String fps;

        /**
         * <p>The height of the video. Unit: pixel.</p>
         */
        @NameInMap("Height")
        public String height;

        /**
         * <p>The stream information.</p>
         */
        @NameInMap("Streams")
        public QueryMediaInfoJobListResponseBodyMediaInfoJobListMediaInfoJobPropertiesStreams streams;

        /**
         * <p>The width of the video. Unit: pixel.</p>
         */
        @NameInMap("Width")
        public String width;

        public static QueryMediaInfoJobListResponseBodyMediaInfoJobListMediaInfoJobProperties build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaInfoJobListResponseBodyMediaInfoJobListMediaInfoJobProperties self = new QueryMediaInfoJobListResponseBodyMediaInfoJobListMediaInfoJobProperties();
            return TeaModel.build(map, self);
        }

        public QueryMediaInfoJobListResponseBodyMediaInfoJobListMediaInfoJobProperties setBitrate(String bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public String getBitrate() {
            return this.bitrate;
        }

        public QueryMediaInfoJobListResponseBodyMediaInfoJobListMediaInfoJobProperties setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public QueryMediaInfoJobListResponseBodyMediaInfoJobListMediaInfoJobProperties setFileFormat(String fileFormat) {
            this.fileFormat = fileFormat;
            return this;
        }
        public String getFileFormat() {
            return this.fileFormat;
        }

        public QueryMediaInfoJobListResponseBodyMediaInfoJobListMediaInfoJobProperties setFileSize(String fileSize) {
            this.fileSize = fileSize;
            return this;
        }
        public String getFileSize() {
            return this.fileSize;
        }

        public QueryMediaInfoJobListResponseBodyMediaInfoJobListMediaInfoJobProperties setFormat(QueryMediaInfoJobListResponseBodyMediaInfoJobListMediaInfoJobPropertiesFormat format) {
            this.format = format;
            return this;
        }
        public QueryMediaInfoJobListResponseBodyMediaInfoJobListMediaInfoJobPropertiesFormat getFormat() {
            return this.format;
        }

        public QueryMediaInfoJobListResponseBodyMediaInfoJobListMediaInfoJobProperties setFps(String fps) {
            this.fps = fps;
            return this;
        }
        public String getFps() {
            return this.fps;
        }

        public QueryMediaInfoJobListResponseBodyMediaInfoJobListMediaInfoJobProperties setHeight(String height) {
            this.height = height;
            return this;
        }
        public String getHeight() {
            return this.height;
        }

        public QueryMediaInfoJobListResponseBodyMediaInfoJobListMediaInfoJobProperties setStreams(QueryMediaInfoJobListResponseBodyMediaInfoJobListMediaInfoJobPropertiesStreams streams) {
            this.streams = streams;
            return this;
        }
        public QueryMediaInfoJobListResponseBodyMediaInfoJobListMediaInfoJobPropertiesStreams getStreams() {
            return this.streams;
        }

        public QueryMediaInfoJobListResponseBodyMediaInfoJobListMediaInfoJobProperties setWidth(String width) {
            this.width = width;
            return this;
        }
        public String getWidth() {
            return this.width;
        }

    }

    public static class QueryMediaInfoJobListResponseBodyMediaInfoJobListMediaInfoJob extends TeaModel {
        /**
         * <p>Indicates whether the job is in asynchronous mode.</p>
         */
        @NameInMap("Async")
        public Boolean async;

        /**
         * <p>The error code returned when the job fails.</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The time when the job was created.</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The information about the job input.</p>
         */
        @NameInMap("Input")
        public QueryMediaInfoJobListResponseBodyMediaInfoJobListMediaInfoJobInput input;

        /**
         * <p>The ID of the job.</p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <p>The message sent by Message Service (MNS) to notify users of the job result.</p>
         */
        @NameInMap("MNSMessageResult")
        public QueryMediaInfoJobListResponseBodyMediaInfoJobListMediaInfoJobMNSMessageResult MNSMessageResult;

        /**
         * <p>The error message returned when the job fails.</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The ID of the MPS queue to which the job is added.</p>
         */
        @NameInMap("PipelineId")
        public String pipelineId;

        /**
         * <p>The information about the input file. For more information, see [AliyunProperties](~~29251~~).</p>
         */
        @NameInMap("Properties")
        public QueryMediaInfoJobListResponseBodyMediaInfoJobListMediaInfoJobProperties properties;

        /**
         * <p>The status of the job. Valid values:</p>
         * <br>
         * <p>*   **Analyzing**: The job is being run.</p>
         * <p>*   **Success**: The job is successful.</p>
         * <p>*   **Fail**: The job fails.</p>
         */
        @NameInMap("State")
        public String state;

        /**
         * <p>The custom data.</p>
         */
        @NameInMap("UserData")
        public String userData;

        public static QueryMediaInfoJobListResponseBodyMediaInfoJobListMediaInfoJob build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaInfoJobListResponseBodyMediaInfoJobListMediaInfoJob self = new QueryMediaInfoJobListResponseBodyMediaInfoJobListMediaInfoJob();
            return TeaModel.build(map, self);
        }

        public QueryMediaInfoJobListResponseBodyMediaInfoJobListMediaInfoJob setAsync(Boolean async) {
            this.async = async;
            return this;
        }
        public Boolean getAsync() {
            return this.async;
        }

        public QueryMediaInfoJobListResponseBodyMediaInfoJobListMediaInfoJob setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryMediaInfoJobListResponseBodyMediaInfoJobListMediaInfoJob setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public QueryMediaInfoJobListResponseBodyMediaInfoJobListMediaInfoJob setInput(QueryMediaInfoJobListResponseBodyMediaInfoJobListMediaInfoJobInput input) {
            this.input = input;
            return this;
        }
        public QueryMediaInfoJobListResponseBodyMediaInfoJobListMediaInfoJobInput getInput() {
            return this.input;
        }

        public QueryMediaInfoJobListResponseBodyMediaInfoJobListMediaInfoJob setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public QueryMediaInfoJobListResponseBodyMediaInfoJobListMediaInfoJob setMNSMessageResult(QueryMediaInfoJobListResponseBodyMediaInfoJobListMediaInfoJobMNSMessageResult MNSMessageResult) {
            this.MNSMessageResult = MNSMessageResult;
            return this;
        }
        public QueryMediaInfoJobListResponseBodyMediaInfoJobListMediaInfoJobMNSMessageResult getMNSMessageResult() {
            return this.MNSMessageResult;
        }

        public QueryMediaInfoJobListResponseBodyMediaInfoJobListMediaInfoJob setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public QueryMediaInfoJobListResponseBodyMediaInfoJobListMediaInfoJob setPipelineId(String pipelineId) {
            this.pipelineId = pipelineId;
            return this;
        }
        public String getPipelineId() {
            return this.pipelineId;
        }

        public QueryMediaInfoJobListResponseBodyMediaInfoJobListMediaInfoJob setProperties(QueryMediaInfoJobListResponseBodyMediaInfoJobListMediaInfoJobProperties properties) {
            this.properties = properties;
            return this;
        }
        public QueryMediaInfoJobListResponseBodyMediaInfoJobListMediaInfoJobProperties getProperties() {
            return this.properties;
        }

        public QueryMediaInfoJobListResponseBodyMediaInfoJobListMediaInfoJob setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public QueryMediaInfoJobListResponseBodyMediaInfoJobListMediaInfoJob setUserData(String userData) {
            this.userData = userData;
            return this;
        }
        public String getUserData() {
            return this.userData;
        }

    }

    public static class QueryMediaInfoJobListResponseBodyMediaInfoJobList extends TeaModel {
        @NameInMap("MediaInfoJob")
        public java.util.List<QueryMediaInfoJobListResponseBodyMediaInfoJobListMediaInfoJob> mediaInfoJob;

        public static QueryMediaInfoJobListResponseBodyMediaInfoJobList build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaInfoJobListResponseBodyMediaInfoJobList self = new QueryMediaInfoJobListResponseBodyMediaInfoJobList();
            return TeaModel.build(map, self);
        }

        public QueryMediaInfoJobListResponseBodyMediaInfoJobList setMediaInfoJob(java.util.List<QueryMediaInfoJobListResponseBodyMediaInfoJobListMediaInfoJob> mediaInfoJob) {
            this.mediaInfoJob = mediaInfoJob;
            return this;
        }
        public java.util.List<QueryMediaInfoJobListResponseBodyMediaInfoJobListMediaInfoJob> getMediaInfoJob() {
            return this.mediaInfoJob;
        }

    }

    public static class QueryMediaInfoJobListResponseBodyNonExistMediaInfoJobIds extends TeaModel {
        @NameInMap("String")
        public java.util.List<String> string;

        public static QueryMediaInfoJobListResponseBodyNonExistMediaInfoJobIds build(java.util.Map<String, ?> map) throws Exception {
            QueryMediaInfoJobListResponseBodyNonExistMediaInfoJobIds self = new QueryMediaInfoJobListResponseBodyNonExistMediaInfoJobIds();
            return TeaModel.build(map, self);
        }

        public QueryMediaInfoJobListResponseBodyNonExistMediaInfoJobIds setString(java.util.List<String> string) {
            this.string = string;
            return this;
        }
        public java.util.List<String> getString() {
            return this.string;
        }

    }

}
