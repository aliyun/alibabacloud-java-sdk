// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class SubmitMediaInfoJobResponseBody extends TeaModel {
    /**
     * <p>The details of the media information analysis job.</p>
     */
    @NameInMap("MediaInfoJob")
    public SubmitMediaInfoJobResponseBodyMediaInfoJob mediaInfoJob;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>62D9BE16-B7D5-550C-A482-7A0F60E09877</p>
     */
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
        /**
         * <p>The name of the OSS bucket in which the input media file is stored.</p>
         * 
         * <strong>example:</strong>
         * <p>example-bucket</p>
         */
        @NameInMap("Bucket")
        public String bucket;

        /**
         * <p>The region in which the OSS bucket that stores the input media file resides.</p>
         * 
         * <strong>example:</strong>
         * <p>example-location</p>
         */
        @NameInMap("Location")
        public String location;

        /**
         * <p>The name of the OSS object that is used as the input media file.</p>
         * 
         * <strong>example:</strong>
         * <p>example.flv</p>
         */
        @NameInMap("Object")
        public String object;

        public static SubmitMediaInfoJobResponseBodyMediaInfoJobInput build(java.util.Map<String, ?> map) throws Exception {
            SubmitMediaInfoJobResponseBodyMediaInfoJobInput self = new SubmitMediaInfoJobResponseBodyMediaInfoJobInput();
            return TeaModel.build(map, self);
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobInput setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobInput setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobInput setObject(String object) {
            this.object = object;
            return this;
        }
        public String getObject() {
            return this.object;
        }

    }

    public static class SubmitMediaInfoJobResponseBodyMediaInfoJobMNSMessageResult extends TeaModel {
        /**
         * <p>The error code that is returned if the job fails. This parameter is not returned if the job is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>The parameter \&quot;Input\&quot; does not conform to the JSON Object specification</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>The error message that is returned if the job fails. This parameter is not returned if the job is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>InvalidParameter.JsonObjectFormatInvalid</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The ID of the message that is returned if the job is successful. This parameter is not returned if the job fails.</p>
         * 
         * <strong>example:</strong>
         * <p>16f01ad6175e4230ac42bb5182cd****</p>
         */
        @NameInMap("MessageId")
        public String messageId;

        public static SubmitMediaInfoJobResponseBodyMediaInfoJobMNSMessageResult build(java.util.Map<String, ?> map) throws Exception {
            SubmitMediaInfoJobResponseBodyMediaInfoJobMNSMessageResult self = new SubmitMediaInfoJobResponseBodyMediaInfoJobMNSMessageResult();
            return TeaModel.build(map, self);
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobMNSMessageResult setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobMNSMessageResult setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobMNSMessageResult setMessageId(String messageId) {
            this.messageId = messageId;
            return this;
        }
        public String getMessageId() {
            return this.messageId;
        }

    }

    public static class SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesFormat extends TeaModel {
        /**
         * <p>The total bitrate. Unit: Kbit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>1630.045</p>
         */
        @NameInMap("Bitrate")
        public String bitrate;

        /**
         * <p>The duration of the input media file. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>17.226000</p>
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
         * <p>The short name of the container format. For more information about the parameters, see <a href="https://www.alibabacloud.com/help/zh/apsaravideo-for-media-processing/latest/parameter-details-a">Parameter details</a>.</p>
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
         * <p>The size of the file. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>3509895</p>
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

        public static SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesFormat build(java.util.Map<String, ?> map) throws Exception {
            SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesFormat self = new SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesFormat();
            return TeaModel.build(map, self);
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesFormat setBitrate(String bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public String getBitrate() {
            return this.bitrate;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesFormat setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesFormat setFormatLongName(String formatLongName) {
            this.formatLongName = formatLongName;
            return this;
        }
        public String getFormatLongName() {
            return this.formatLongName;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesFormat setFormatName(String formatName) {
            this.formatName = formatName;
            return this;
        }
        public String getFormatName() {
            return this.formatName;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesFormat setNumPrograms(String numPrograms) {
            this.numPrograms = numPrograms;
            return this;
        }
        public String getNumPrograms() {
            return this.numPrograms;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesFormat setNumStreams(String numStreams) {
            this.numStreams = numStreams;
            return this;
        }
        public String getNumStreams() {
            return this.numStreams;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesFormat setSize(String size) {
            this.size = size;
            return this;
        }
        public String getSize() {
            return this.size;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesFormat setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

    public static class SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesStreamsAudioStreamListAudioStream extends TeaModel {
        /**
         * <p>The bitrate. Unit: Kbit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>128.806</p>
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
         * <p>The short name of the encoding format. Default value: acc. Valid values:</p>
         * <ul>
         * <li><strong>acc</strong></li>
         * <li><strong>mp3</strong></li>
         * <li><strong>mp4</strong></li>
         * <li><strong>ogg</strong></li>
         * <li><strong>flac</strong></li>
         * </ul>
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
         * <p>The duration of the audio stream. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>17.159546</p>
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
         * <p>The language.</p>
         * 
         * <strong>example:</strong>
         * <p>eng</p>
         */
        @NameInMap("Lang")
        public String lang;

        /**
         * <p>The total number of frames.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
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
         * <p>The sampling rate. Unit: Hz.</p>
         * 
         * <strong>example:</strong>
         * <p>44100</p>
         */
        @NameInMap("Samplerate")
        public String samplerate;

        /**
         * <p>The start time of the audio stream.</p>
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

        public static SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesStreamsAudioStreamListAudioStream build(java.util.Map<String, ?> map) throws Exception {
            SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesStreamsAudioStreamListAudioStream self = new SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesStreamsAudioStreamListAudioStream();
            return TeaModel.build(map, self);
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesStreamsAudioStreamListAudioStream setBitrate(String bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public String getBitrate() {
            return this.bitrate;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesStreamsAudioStreamListAudioStream setChannelLayout(String channelLayout) {
            this.channelLayout = channelLayout;
            return this;
        }
        public String getChannelLayout() {
            return this.channelLayout;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesStreamsAudioStreamListAudioStream setChannels(String channels) {
            this.channels = channels;
            return this;
        }
        public String getChannels() {
            return this.channels;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesStreamsAudioStreamListAudioStream setCodecLongName(String codecLongName) {
            this.codecLongName = codecLongName;
            return this;
        }
        public String getCodecLongName() {
            return this.codecLongName;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesStreamsAudioStreamListAudioStream setCodecName(String codecName) {
            this.codecName = codecName;
            return this;
        }
        public String getCodecName() {
            return this.codecName;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesStreamsAudioStreamListAudioStream setCodecTag(String codecTag) {
            this.codecTag = codecTag;
            return this;
        }
        public String getCodecTag() {
            return this.codecTag;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesStreamsAudioStreamListAudioStream setCodecTagString(String codecTagString) {
            this.codecTagString = codecTagString;
            return this;
        }
        public String getCodecTagString() {
            return this.codecTagString;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesStreamsAudioStreamListAudioStream setCodecTimeBase(String codecTimeBase) {
            this.codecTimeBase = codecTimeBase;
            return this;
        }
        public String getCodecTimeBase() {
            return this.codecTimeBase;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesStreamsAudioStreamListAudioStream setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesStreamsAudioStreamListAudioStream setIndex(String index) {
            this.index = index;
            return this;
        }
        public String getIndex() {
            return this.index;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesStreamsAudioStreamListAudioStream setLang(String lang) {
            this.lang = lang;
            return this;
        }
        public String getLang() {
            return this.lang;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesStreamsAudioStreamListAudioStream setNumFrames(String numFrames) {
            this.numFrames = numFrames;
            return this;
        }
        public String getNumFrames() {
            return this.numFrames;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesStreamsAudioStreamListAudioStream setSampleFmt(String sampleFmt) {
            this.sampleFmt = sampleFmt;
            return this;
        }
        public String getSampleFmt() {
            return this.sampleFmt;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesStreamsAudioStreamListAudioStream setSamplerate(String samplerate) {
            this.samplerate = samplerate;
            return this;
        }
        public String getSamplerate() {
            return this.samplerate;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesStreamsAudioStreamListAudioStream setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesStreamsAudioStreamListAudioStream setTimebase(String timebase) {
            this.timebase = timebase;
            return this;
        }
        public String getTimebase() {
            return this.timebase;
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
        /**
         * <p>The full name of the encoding format.</p>
         * 
         * <strong>example:</strong>
         * <p>ASS (Advanced SSA) subtitle</p>
         */
        @NameInMap("CodecLongName")
        public String codecLongName;

        /**
         * <p>The short name of the encoding format. Valid values:</p>
         * <ul>
         * <li><strong>srt</strong></li>
         * <li><strong>ass</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ass</p>
         */
        @NameInMap("CodecName")
        public String codecName;

        /**
         * <p>The tag of the encoding format.</p>
         * 
         * <strong>example:</strong>
         * <p>0x0000</p>
         */
        @NameInMap("CodecTag")
        public String codecTag;

        /**
         * <p>The tag string of the encoding format.</p>
         * 
         * <strong>example:</strong>
         * <p>[0][0][0][0]</p>
         */
        @NameInMap("CodecTagString")
        public String codecTagString;

        /**
         * <p>The codec time base.</p>
         * 
         * <strong>example:</strong>
         * <p>0/1</p>
         */
        @NameInMap("CodecTimeBase")
        public String codecTimeBase;

        /**
         * <p>The duration of the audio stream. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>1370.116000</p>
         */
        @NameInMap("Duration")
        public String duration;

        /**
         * <p>The sequence number of the subtitle stream. The value indicates the position of the subtitle stream in all subtitle streams.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("Index")
        public String index;

        /**
         * <p>The language.</p>
         * 
         * <strong>example:</strong>
         * <p>eng</p>
         */
        @NameInMap("Lang")
        public String lang;

        /**
         * <p>The start time of the subtitle stream.</p>
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
         * <p>1/1000</p>
         */
        @NameInMap("Timebase")
        public String timebase;

        public static SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesStreamsSubtitleStreamListSubtitleStream build(java.util.Map<String, ?> map) throws Exception {
            SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesStreamsSubtitleStreamListSubtitleStream self = new SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesStreamsSubtitleStreamListSubtitleStream();
            return TeaModel.build(map, self);
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesStreamsSubtitleStreamListSubtitleStream setCodecLongName(String codecLongName) {
            this.codecLongName = codecLongName;
            return this;
        }
        public String getCodecLongName() {
            return this.codecLongName;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesStreamsSubtitleStreamListSubtitleStream setCodecName(String codecName) {
            this.codecName = codecName;
            return this;
        }
        public String getCodecName() {
            return this.codecName;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesStreamsSubtitleStreamListSubtitleStream setCodecTag(String codecTag) {
            this.codecTag = codecTag;
            return this;
        }
        public String getCodecTag() {
            return this.codecTag;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesStreamsSubtitleStreamListSubtitleStream setCodecTagString(String codecTagString) {
            this.codecTagString = codecTagString;
            return this;
        }
        public String getCodecTagString() {
            return this.codecTagString;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesStreamsSubtitleStreamListSubtitleStream setCodecTimeBase(String codecTimeBase) {
            this.codecTimeBase = codecTimeBase;
            return this;
        }
        public String getCodecTimeBase() {
            return this.codecTimeBase;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesStreamsSubtitleStreamListSubtitleStream setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesStreamsSubtitleStreamListSubtitleStream setIndex(String index) {
            this.index = index;
            return this;
        }
        public String getIndex() {
            return this.index;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesStreamsSubtitleStreamListSubtitleStream setLang(String lang) {
            this.lang = lang;
            return this;
        }
        public String getLang() {
            return this.lang;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesStreamsSubtitleStreamListSubtitleStream setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesStreamsSubtitleStreamListSubtitleStream setTimebase(String timebase) {
            this.timebase = timebase;
            return this;
        }
        public String getTimebase() {
            return this.timebase;
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

    public static class SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesStreamsVideoStreamListVideoStreamNetworkCost extends TeaModel {
        /**
         * <p>The average bitrate. Unit: Kbit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>300.34</p>
         */
        @NameInMap("AvgBitrate")
        public String avgBitrate;

        /**
         * <p>The maximum bandwidth that is consumed.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("CostBandwidth")
        public String costBandwidth;

        /**
         * <p>The time consumed to preload the video.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("PreloadTime")
        public String preloadTime;

        public static SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesStreamsVideoStreamListVideoStreamNetworkCost build(java.util.Map<String, ?> map) throws Exception {
            SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesStreamsVideoStreamListVideoStreamNetworkCost self = new SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesStreamsVideoStreamListVideoStreamNetworkCost();
            return TeaModel.build(map, self);
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

        public SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesStreamsVideoStreamListVideoStreamNetworkCost setPreloadTime(String preloadTime) {
            this.preloadTime = preloadTime;
            return this;
        }
        public String getPreloadTime() {
            return this.preloadTime;
        }

    }

    public static class SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesStreamsVideoStreamListVideoStream extends TeaModel {
        /**
         * <p>The average frame rate.</p>
         * 
         * <strong>example:</strong>
         * <p>23.976025</p>
         */
        @NameInMap("AvgFPS")
        public String avgFPS;

        /**
         * <p>The bitrate. Unit: Kbit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>1496.46</p>
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
         * <p>The short name of the encoding format. Valid values:</p>
         * <ul>
         * <li><strong>h264</strong></li>
         * <li><strong>h265</strong></li>
         * <li><strong>gif</strong></li>
         * <li><strong>webp</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>h264</p>
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
         * <p>1001/48000</p>
         */
        @NameInMap("CodecTimeBase")
        public String codecTimeBase;

        /**
         * <p>The level of color reconstruction.</p>
         * 
         * <strong>example:</strong>
         * <p>700</p>
         */
        @NameInMap("ColorPrimaries")
        public String colorPrimaries;

        /**
         * <p>The color range.</p>
         * 
         * <strong>example:</strong>
         * <p>700</p>
         */
        @NameInMap("ColorRange")
        public String colorRange;

        /**
         * <p>The color channel.</p>
         * 
         * <strong>example:</strong>
         * <p>R255 G83 B170</p>
         */
        @NameInMap("ColorTransfer")
        public String colorTransfer;

        /**
         * <p>The display aspect ratio (DAR). DAR is the proportional relationship between the width and the height of a video. The value is used to determine whether the video is in portrait mode or landscape mode.</p>
         * 
         * <strong>example:</strong>
         * <p>16:9</p>
         */
        @NameInMap("Dar")
        public String dar;

        /**
         * <p>The duration of the video stream. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>17.225542</p>
         */
        @NameInMap("Duration")
        public String duration;

        /**
         * <p>The frame rate.</p>
         * 
         * <strong>example:</strong>
         * <p>25</p>
         */
        @NameInMap("Fps")
        public String fps;

        /**
         * <p>Indicates whether the video stream contains bidirectional frames (B-frames). A value of 1 indicates that the video stream contains B-frames. A value of 0 indicates that the video stream does not contain B-frames.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("HasBFrames")
        public String hasBFrames;

        /**
         * <p>The height of the video. Unit: pixel.</p>
         * 
         * <strong>example:</strong>
         * <p>1080</p>
         */
        @NameInMap("Height")
        public String height;

        /**
         * <p>The sequence number of the video stream. The value indicates the position of the video stream in all video streams. The sequence number of the first video stream to be played can be specified in some players. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Index")
        public String index;

        /**
         * <p>The language.</p>
         * 
         * <strong>example:</strong>
         * <p>eng</p>
         */
        @NameInMap("Lang")
        public String lang;

        /**
         * <p>The codec level.</p>
         * 
         * <strong>example:</strong>
         * <p>41</p>
         */
        @NameInMap("Level")
        public String level;

        /**
         * <p>The network bandwidth that is consumed.</p>
         */
        @NameInMap("NetworkCost")
        public SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesStreamsVideoStreamListVideoStreamNetworkCost networkCost;

        /**
         * <p>The total number of frames.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
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
         * <p>The start time of the video stream.</p>
         * 
         * <strong>example:</strong>
         * <p>0.042000</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The time base.</p>
         * 
         * <strong>example:</strong>
         * <p>1/24000</p>
         */
        @NameInMap("Timebase")
        public String timebase;

        /**
         * <p>The width of the video. Unit: pixel.</p>
         * 
         * <strong>example:</strong>
         * <p>1920</p>
         */
        @NameInMap("Width")
        public String width;

        public static SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesStreamsVideoStreamListVideoStream build(java.util.Map<String, ?> map) throws Exception {
            SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesStreamsVideoStreamListVideoStream self = new SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesStreamsVideoStreamListVideoStream();
            return TeaModel.build(map, self);
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesStreamsVideoStreamListVideoStream setAvgFPS(String avgFPS) {
            this.avgFPS = avgFPS;
            return this;
        }
        public String getAvgFPS() {
            return this.avgFPS;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesStreamsVideoStreamListVideoStream setBitrate(String bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public String getBitrate() {
            return this.bitrate;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesStreamsVideoStreamListVideoStream setCodecLongName(String codecLongName) {
            this.codecLongName = codecLongName;
            return this;
        }
        public String getCodecLongName() {
            return this.codecLongName;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesStreamsVideoStreamListVideoStream setCodecName(String codecName) {
            this.codecName = codecName;
            return this;
        }
        public String getCodecName() {
            return this.codecName;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesStreamsVideoStreamListVideoStream setCodecTag(String codecTag) {
            this.codecTag = codecTag;
            return this;
        }
        public String getCodecTag() {
            return this.codecTag;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesStreamsVideoStreamListVideoStream setCodecTagString(String codecTagString) {
            this.codecTagString = codecTagString;
            return this;
        }
        public String getCodecTagString() {
            return this.codecTagString;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesStreamsVideoStreamListVideoStream setCodecTimeBase(String codecTimeBase) {
            this.codecTimeBase = codecTimeBase;
            return this;
        }
        public String getCodecTimeBase() {
            return this.codecTimeBase;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesStreamsVideoStreamListVideoStream setColorPrimaries(String colorPrimaries) {
            this.colorPrimaries = colorPrimaries;
            return this;
        }
        public String getColorPrimaries() {
            return this.colorPrimaries;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesStreamsVideoStreamListVideoStream setColorRange(String colorRange) {
            this.colorRange = colorRange;
            return this;
        }
        public String getColorRange() {
            return this.colorRange;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesStreamsVideoStreamListVideoStream setColorTransfer(String colorTransfer) {
            this.colorTransfer = colorTransfer;
            return this;
        }
        public String getColorTransfer() {
            return this.colorTransfer;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesStreamsVideoStreamListVideoStream setDar(String dar) {
            this.dar = dar;
            return this;
        }
        public String getDar() {
            return this.dar;
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

        public SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesStreamsVideoStreamListVideoStream setHasBFrames(String hasBFrames) {
            this.hasBFrames = hasBFrames;
            return this;
        }
        public String getHasBFrames() {
            return this.hasBFrames;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesStreamsVideoStreamListVideoStream setHeight(String height) {
            this.height = height;
            return this;
        }
        public String getHeight() {
            return this.height;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesStreamsVideoStreamListVideoStream setIndex(String index) {
            this.index = index;
            return this;
        }
        public String getIndex() {
            return this.index;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesStreamsVideoStreamListVideoStream setLang(String lang) {
            this.lang = lang;
            return this;
        }
        public String getLang() {
            return this.lang;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesStreamsVideoStreamListVideoStream setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesStreamsVideoStreamListVideoStream setNetworkCost(SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesStreamsVideoStreamListVideoStreamNetworkCost networkCost) {
            this.networkCost = networkCost;
            return this;
        }
        public SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesStreamsVideoStreamListVideoStreamNetworkCost getNetworkCost() {
            return this.networkCost;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesStreamsVideoStreamListVideoStream setNumFrames(String numFrames) {
            this.numFrames = numFrames;
            return this;
        }
        public String getNumFrames() {
            return this.numFrames;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesStreamsVideoStreamListVideoStream setPixFmt(String pixFmt) {
            this.pixFmt = pixFmt;
            return this;
        }
        public String getPixFmt() {
            return this.pixFmt;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesStreamsVideoStreamListVideoStream setProfile(String profile) {
            this.profile = profile;
            return this;
        }
        public String getProfile() {
            return this.profile;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesStreamsVideoStreamListVideoStream setRotate(String rotate) {
            this.rotate = rotate;
            return this;
        }
        public String getRotate() {
            return this.rotate;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesStreamsVideoStreamListVideoStream setSar(String sar) {
            this.sar = sar;
            return this;
        }
        public String getSar() {
            return this.sar;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesStreamsVideoStreamListVideoStream setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesStreamsVideoStreamListVideoStream setTimebase(String timebase) {
            this.timebase = timebase;
            return this;
        }
        public String getTimebase() {
            return this.timebase;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesStreamsVideoStreamListVideoStream setWidth(String width) {
            this.width = width;
            return this;
        }
        public String getWidth() {
            return this.width;
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

    public static class SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesStreams extends TeaModel {
        /**
         * <p>The audio streams. A media file can contain up to four audio streams.</p>
         */
        @NameInMap("AudioStreamList")
        public SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesStreamsAudioStreamList audioStreamList;

        /**
         * <p>The subtitle streams. A media file can contain up to four subtitle streams.</p>
         */
        @NameInMap("SubtitleStreamList")
        public SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesStreamsSubtitleStreamList subtitleStreamList;

        /**
         * <p>The video streams. A media file can contain up to four video streams.</p>
         */
        @NameInMap("VideoStreamList")
        public SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesStreamsVideoStreamList videoStreamList;

        public static SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesStreams build(java.util.Map<String, ?> map) throws Exception {
            SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesStreams self = new SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesStreams();
            return TeaModel.build(map, self);
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

        public SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesStreams setVideoStreamList(SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesStreamsVideoStreamList videoStreamList) {
            this.videoStreamList = videoStreamList;
            return this;
        }
        public SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesStreamsVideoStreamList getVideoStreamList() {
            return this.videoStreamList;
        }

    }

    public static class SubmitMediaInfoJobResponseBodyMediaInfoJobProperties extends TeaModel {
        /**
         * <p>The bitrate. Unit: Kbit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>1630.045</p>
         */
        @NameInMap("Bitrate")
        public String bitrate;

        /**
         * <p>The duration of the input media file. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>17.226000</p>
         */
        @NameInMap("Duration")
        public String duration;

        /**
         * <p>The format of the input media file.</p>
         * 
         * <strong>example:</strong>
         * <p>QuickTime/MOV</p>
         */
        @NameInMap("FileFormat")
        public String fileFormat;

        /**
         * <p>The size of the file. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>3509895</p>
         */
        @NameInMap("FileSize")
        public String fileSize;

        /**
         * <p>The format information.</p>
         */
        @NameInMap("Format")
        public SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesFormat format;

        /**
         * <p>The frame rate.</p>
         * 
         * <strong>example:</strong>
         * <p>25</p>
         */
        @NameInMap("Fps")
        public String fps;

        /**
         * <p>The height of the video. Unit: pixel.</p>
         * 
         * <strong>example:</strong>
         * <p>1080</p>
         */
        @NameInMap("Height")
        public String height;

        /**
         * <p>The media streams that are contained in the input media file.</p>
         */
        @NameInMap("Streams")
        public SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesStreams streams;

        /**
         * <p>The width of the video. Unit: pixel.</p>
         * 
         * <strong>example:</strong>
         * <p>1920</p>
         */
        @NameInMap("Width")
        public String width;

        public static SubmitMediaInfoJobResponseBodyMediaInfoJobProperties build(java.util.Map<String, ?> map) throws Exception {
            SubmitMediaInfoJobResponseBodyMediaInfoJobProperties self = new SubmitMediaInfoJobResponseBodyMediaInfoJobProperties();
            return TeaModel.build(map, self);
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobProperties setBitrate(String bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public String getBitrate() {
            return this.bitrate;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobProperties setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobProperties setFileFormat(String fileFormat) {
            this.fileFormat = fileFormat;
            return this;
        }
        public String getFileFormat() {
            return this.fileFormat;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobProperties setFileSize(String fileSize) {
            this.fileSize = fileSize;
            return this;
        }
        public String getFileSize() {
            return this.fileSize;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobProperties setFormat(SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesFormat format) {
            this.format = format;
            return this;
        }
        public SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesFormat getFormat() {
            return this.format;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobProperties setFps(String fps) {
            this.fps = fps;
            return this;
        }
        public String getFps() {
            return this.fps;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobProperties setHeight(String height) {
            this.height = height;
            return this;
        }
        public String getHeight() {
            return this.height;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobProperties setStreams(SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesStreams streams) {
            this.streams = streams;
            return this;
        }
        public SubmitMediaInfoJobResponseBodyMediaInfoJobPropertiesStreams getStreams() {
            return this.streams;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJobProperties setWidth(String width) {
            this.width = width;
            return this;
        }
        public String getWidth() {
            return this.width;
        }

    }

    public static class SubmitMediaInfoJobResponseBodyMediaInfoJob extends TeaModel {
        /**
         * <p>Indicates whether the job is run in asynchronous mode.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Async")
        public Boolean async;

        /**
         * <p>The error code returned if the job fails.</p>
         * 
         * <strong>example:</strong>
         * <p>InvalidParameter.JsonObjectFormatInvalid</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The time when the job was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2014-01-10T12:00:00Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The information about the input media file.</p>
         */
        @NameInMap("Input")
        public SubmitMediaInfoJobResponseBodyMediaInfoJobInput input;

        /**
         * <p>The ID of the job.</p>
         * 
         * <strong>example:</strong>
         * <p>23ca1d184c0e4341e5b665e2a12****</p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <p>The message sent by Message Service (MNS) to notify users of the job result.</p>
         */
        @NameInMap("MNSMessageResult")
        public SubmitMediaInfoJobResponseBodyMediaInfoJobMNSMessageResult MNSMessageResult;

        /**
         * <p>The error message returned if the job fails.</p>
         * 
         * <strong>example:</strong>
         * <p>The parameter ”*” does not conform to the JSON Object specification</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The ID of the MPS queue to which the analysis job is submitted.</p>
         * 
         * <strong>example:</strong>
         * <p>88c6ca184c0e432bbf5b665e2a15****</p>
         */
        @NameInMap("PipelineId")
        public String pipelineId;

        /**
         * <p>The properties of the input media file.</p>
         */
        @NameInMap("Properties")
        public SubmitMediaInfoJobResponseBodyMediaInfoJobProperties properties;

        /**
         * <p>The status of the job. Valid values:</p>
         * <ul>
         * <li><strong>Success</strong>: The job is successful.</li>
         * <li><strong>Fail</strong>: The job fails.</li>
         * <li><strong>Analyzing</strong>: The job is being run.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Analyzing</p>
         */
        @NameInMap("State")
        public String state;

        /**
         * <p>The custom data.</p>
         * 
         * <strong>example:</strong>
         * <p>testid-001</p>
         */
        @NameInMap("UserData")
        public String userData;

        public static SubmitMediaInfoJobResponseBodyMediaInfoJob build(java.util.Map<String, ?> map) throws Exception {
            SubmitMediaInfoJobResponseBodyMediaInfoJob self = new SubmitMediaInfoJobResponseBodyMediaInfoJob();
            return TeaModel.build(map, self);
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJob setAsync(Boolean async) {
            this.async = async;
            return this;
        }
        public Boolean getAsync() {
            return this.async;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJob setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJob setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJob setInput(SubmitMediaInfoJobResponseBodyMediaInfoJobInput input) {
            this.input = input;
            return this;
        }
        public SubmitMediaInfoJobResponseBodyMediaInfoJobInput getInput() {
            return this.input;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJob setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJob setMNSMessageResult(SubmitMediaInfoJobResponseBodyMediaInfoJobMNSMessageResult MNSMessageResult) {
            this.MNSMessageResult = MNSMessageResult;
            return this;
        }
        public SubmitMediaInfoJobResponseBodyMediaInfoJobMNSMessageResult getMNSMessageResult() {
            return this.MNSMessageResult;
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

        public SubmitMediaInfoJobResponseBodyMediaInfoJob setProperties(SubmitMediaInfoJobResponseBodyMediaInfoJobProperties properties) {
            this.properties = properties;
            return this;
        }
        public SubmitMediaInfoJobResponseBodyMediaInfoJobProperties getProperties() {
            return this.properties;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJob setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public SubmitMediaInfoJobResponseBodyMediaInfoJob setUserData(String userData) {
            this.userData = userData;
            return this;
        }
        public String getUserData() {
            return this.userData;
        }

    }

}
