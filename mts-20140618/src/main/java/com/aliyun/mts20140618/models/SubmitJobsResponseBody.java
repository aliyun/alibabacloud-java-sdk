// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class SubmitJobsResponseBody extends TeaModel {
    /**
     * <p>The transcoding jobs that are generated.</p>
     */
    @NameInMap("JobResultList")
    public SubmitJobsResponseBodyJobResultList jobResultList;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>25818875-5F78-4A45S71F6-D73936451234</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static SubmitJobsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitJobsResponseBody self = new SubmitJobsResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitJobsResponseBody setJobResultList(SubmitJobsResponseBodyJobResultList jobResultList) {
        this.jobResultList = jobResultList;
        return this;
    }
    public SubmitJobsResponseBodyJobResultList getJobResultList() {
        return this.jobResultList;
    }

    public SubmitJobsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class SubmitJobsResponseBodyJobResultListJobResultJobInput extends TeaModel {
        /**
         * <p>The name of the OSS bucket in which the job input is stored.</p>
         * 
         * <strong>example:</strong>
         * <p>example-bucket-****</p>
         */
        @NameInMap("Bucket")
        public String bucket;

        /**
         * <p>The ID of the OSS region in which the job input is stored.</p>
         * 
         * <strong>example:</strong>
         * <p>oss-cn-hangzhou</p>
         */
        @NameInMap("Location")
        public String location;

        /**
         * <p>The name of the OSS object that is used as the job input.</p>
         * 
         * <strong>example:</strong>
         * <p>example.flv</p>
         */
        @NameInMap("Object")
        public String object;

        public static SubmitJobsResponseBodyJobResultListJobResultJobInput build(java.util.Map<String, ?> map) throws Exception {
            SubmitJobsResponseBodyJobResultListJobResultJobInput self = new SubmitJobsResponseBodyJobResultListJobResultJobInput();
            return TeaModel.build(map, self);
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobInput setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobInput setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobInput setObject(String object) {
            this.object = object;
            return this;
        }
        public String getObject() {
            return this.object;
        }

    }

    public static class SubmitJobsResponseBodyJobResultListJobResultJobMNSMessageResult extends TeaModel {
        /**
         * <p>The error code returned if the job failed. This parameter is not returned if the job was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>InvalidParameter.ResourceNotFound</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>The error message returned if the job failed. This parameter is not returned if the job was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>The resource operated &quot;%s&quot; cannot be found.</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The ID of the error message returned if the job failed. This parameter is not returned if the job was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("MessageId")
        public String messageId;

        public static SubmitJobsResponseBodyJobResultListJobResultJobMNSMessageResult build(java.util.Map<String, ?> map) throws Exception {
            SubmitJobsResponseBodyJobResultListJobResultJobMNSMessageResult self = new SubmitJobsResponseBodyJobResultListJobResultJobMNSMessageResult();
            return TeaModel.build(map, self);
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobMNSMessageResult setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobMNSMessageResult setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobMNSMessageResult setMessageId(String messageId) {
            this.messageId = messageId;
            return this;
        }
        public String getMessageId() {
            return this.messageId;
        }

    }

    public static class SubmitJobsResponseBodyJobResultListJobResultJobOutputAmixListAmix extends TeaModel {
        /**
         * <p>The URL of the audio track that is mixed as the background music.</p>
         * <ul>
         * <li>The URL can be an OSS URL or the string <code>input</code>.</li>
         * <li>A value of input indicates that two audio tracks are mixed in a video.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p><a href="https://outpu***.oss-cn-shanghai.aliyuncs.com/mp4-to-mp3%5E1571025263578816%40.mp3">https://outpu***.oss-cn-shanghai.aliyuncs.com/mp4-to-mp3%5E1571025263578816%40.mp3</a></p>
         */
        @NameInMap("AmixURL")
        public String amixURL;

        /**
         * <p>The duration of the mixed audio track. The value is in the number or time format.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("Duration")
        public String duration;

        /**
         * <p>The audio track that is mixed. Format: 0:a:{audio_index}. Example: 0:a:0.</p>
         * 
         * <strong>example:</strong>
         * <p>0:a:0</p>
         */
        @NameInMap("Map")
        public String map;

        /**
         * <p>The mode to specify the mixing duration. Valid values: <strong>first</strong> and <strong>long</strong>.</p>
         * <ul>
         * <li><strong>first</strong>: The length of the output media equals the length of the input media.</li>
         * <li><strong>long</strong>: The length of the output media equals the length of the output media or the length of the input media, whichever is longer.</li>
         * <li>Default value: <strong>long</strong>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>long</p>
         */
        @NameInMap("MixDurMode")
        public String mixDurMode;

        /**
         * <p>The start time. The value is in the number or time format. Examples: 1:25:36.240 and 32000.23.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Start")
        public String start;

        public static SubmitJobsResponseBodyJobResultListJobResultJobOutputAmixListAmix build(java.util.Map<String, ?> map) throws Exception {
            SubmitJobsResponseBodyJobResultListJobResultJobOutputAmixListAmix self = new SubmitJobsResponseBodyJobResultListJobResultJobOutputAmixListAmix();
            return TeaModel.build(map, self);
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputAmixListAmix setAmixURL(String amixURL) {
            this.amixURL = amixURL;
            return this;
        }
        public String getAmixURL() {
            return this.amixURL;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputAmixListAmix setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputAmixListAmix setMap(String map) {
            this.map = map;
            return this;
        }
        public String getMap() {
            return this.map;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputAmixListAmix setMixDurMode(String mixDurMode) {
            this.mixDurMode = mixDurMode;
            return this;
        }
        public String getMixDurMode() {
            return this.mixDurMode;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputAmixListAmix setStart(String start) {
            this.start = start;
            return this;
        }
        public String getStart() {
            return this.start;
        }

    }

    public static class SubmitJobsResponseBodyJobResultListJobResultJobOutputAmixList extends TeaModel {
        @NameInMap("Amix")
        public java.util.List<SubmitJobsResponseBodyJobResultListJobResultJobOutputAmixListAmix> amix;

        public static SubmitJobsResponseBodyJobResultListJobResultJobOutputAmixList build(java.util.Map<String, ?> map) throws Exception {
            SubmitJobsResponseBodyJobResultListJobResultJobOutputAmixList self = new SubmitJobsResponseBodyJobResultListJobResultJobOutputAmixList();
            return TeaModel.build(map, self);
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputAmixList setAmix(java.util.List<SubmitJobsResponseBodyJobResultListJobResultJobOutputAmixListAmix> amix) {
            this.amix = amix;
            return this;
        }
        public java.util.List<SubmitJobsResponseBodyJobResultListJobResultJobOutputAmixListAmix> getAmix() {
            return this.amix;
        }

    }

    public static class SubmitJobsResponseBodyJobResultListJobResultJobOutputAudioVolume extends TeaModel {
        /**
         * <p>The volume adjustment range.</p>
         * <ul>
         * <li>Unit: decibel.</li>
         * <li>Default value: <strong>-20</strong>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>-20</p>
         */
        @NameInMap("Level")
        public String level;

        /**
         * <p>The method that is used to adjust the volume. Valid values:</p>
         * <ul>
         * <li><strong>auto</strong></li>
         * <li><strong>dynamic</strong></li>
         * <li><strong>linear</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>auto</p>
         */
        @NameInMap("Method")
        public String method;

        public static SubmitJobsResponseBodyJobResultListJobResultJobOutputAudioVolume build(java.util.Map<String, ?> map) throws Exception {
            SubmitJobsResponseBodyJobResultListJobResultJobOutputAudioVolume self = new SubmitJobsResponseBodyJobResultListJobResultJobOutputAudioVolume();
            return TeaModel.build(map, self);
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputAudioVolume setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputAudioVolume setMethod(String method) {
            this.method = method;
            return this;
        }
        public String getMethod() {
            return this.method;
        }

    }

    public static class SubmitJobsResponseBodyJobResultListJobResultJobOutputAudio extends TeaModel {
        /**
         * <p>The audio bitrate of the output file.</p>
         * <ul>
         * <li>Unit: Kbit/s.</li>
         * <li>Default value: <strong>128</strong>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>128</p>
         */
        @NameInMap("Bitrate")
        public String bitrate;

        /**
         * <p>The number of sound channels.</p>
         * <ul>
         * <li>If the value of Codec is mp3, the value of this parameter can only be <strong>1</strong> or <strong>2</strong>.</li>
         * <li>If the value of Codec is aac, the value of this parameter can only be <strong>1</strong>, <strong>2</strong>, <strong>4</strong>, <strong>5</strong>, <strong>6</strong>, or <strong>8</strong>.</li>
         * <li>Default value: <strong>2</strong>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
        @NameInMap("Channels")
        public String channels;

        /**
         * <p>The audio codec.</p>
         * <ul>
         * <li>Valid values: <strong>aac</strong>, <strong>mp3</strong>, <strong>vorbis</strong>, and <strong>flac</strong>.</li>
         * <li>Default value: <strong>aac</strong>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>aac</p>
         */
        @NameInMap("Codec")
        public String codec;

        /**
         * <p>The codec profile of the audio.</p>
         * <blockquote>
         * <p> Valid values if the value of <strong>Codec</strong> is <strong>aac</strong>: <strong>aac_low</strong>, <strong>aac_he</strong>, <strong>aac_he_v2</strong>, <strong>aac_ld</strong>, and <strong>aac_eld</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>aac_low</p>
         */
        @NameInMap("Profile")
        public String profile;

        /**
         * <p>The level of quality control on the audio.</p>
         * 
         * <strong>example:</strong>
         * <p>15</p>
         */
        @NameInMap("Qscale")
        public String qscale;

        /**
         * <p>The sampling rate.</p>
         * <ul>
         * <li>Valid values: <strong>22050</strong>, <strong>32000</strong>, <strong>44100</strong>, <strong>48000</strong>, and <strong>96000</strong>.</li>
         * <li>Unit: Hz.</li>
         * <li>Default value: <strong>44100</strong>.</li>
         * </ul>
         * <blockquote>
         * <p> If the video container format is FLV and the audio codec is MP3, the value of this parameter cannot be 32000, 48000, or 96000. If the audio codec is MP3, the value of this parameter cannot be 96000.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>32000</p>
         */
        @NameInMap("Samplerate")
        public String samplerate;

        /**
         * <p>The volume configurations.</p>
         */
        @NameInMap("Volume")
        public SubmitJobsResponseBodyJobResultListJobResultJobOutputAudioVolume volume;

        public static SubmitJobsResponseBodyJobResultListJobResultJobOutputAudio build(java.util.Map<String, ?> map) throws Exception {
            SubmitJobsResponseBodyJobResultListJobResultJobOutputAudio self = new SubmitJobsResponseBodyJobResultListJobResultJobOutputAudio();
            return TeaModel.build(map, self);
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputAudio setBitrate(String bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public String getBitrate() {
            return this.bitrate;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputAudio setChannels(String channels) {
            this.channels = channels;
            return this;
        }
        public String getChannels() {
            return this.channels;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputAudio setCodec(String codec) {
            this.codec = codec;
            return this;
        }
        public String getCodec() {
            return this.codec;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputAudio setProfile(String profile) {
            this.profile = profile;
            return this;
        }
        public String getProfile() {
            return this.profile;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputAudio setQscale(String qscale) {
            this.qscale = qscale;
            return this;
        }
        public String getQscale() {
            return this.qscale;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputAudio setSamplerate(String samplerate) {
            this.samplerate = samplerate;
            return this;
        }
        public String getSamplerate() {
            return this.samplerate;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputAudio setVolume(SubmitJobsResponseBodyJobResultListJobResultJobOutputAudioVolume volume) {
            this.volume = volume;
            return this;
        }
        public SubmitJobsResponseBodyJobResultListJobResultJobOutputAudioVolume getVolume() {
            return this.volume;
        }

    }

    public static class SubmitJobsResponseBodyJobResultListJobResultJobOutputClipTimeSpan extends TeaModel {
        /**
         * <p>The duration of the clip.</p>
         * <ul>
         * <li>Format: <code>hh:mm:ss[.SSS]</code> or <code>sssss[.SSS]</code>.</li>
         * <li>Valid values: <code>[00:00:00.000,23:59:59.999]</code> or <code>[0.000,86399.999]</code>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>01:00:59.999</p>
         */
        @NameInMap("Duration")
        public String duration;

        /**
         * <p>The start time.</p>
         * <ul>
         * <li>Format: <code>hh:mm:ss[.SSS]</code> or <code>sssss[.SSS]</code>.</li>
         * <li>Valid values: <code>[00:00:00.000,23:59:59.999]</code> or <code>[0.000,86399.999]</code>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>01:59:59.999</p>
         */
        @NameInMap("Seek")
        public String seek;

        public static SubmitJobsResponseBodyJobResultListJobResultJobOutputClipTimeSpan build(java.util.Map<String, ?> map) throws Exception {
            SubmitJobsResponseBodyJobResultListJobResultJobOutputClipTimeSpan self = new SubmitJobsResponseBodyJobResultListJobResultJobOutputClipTimeSpan();
            return TeaModel.build(map, self);
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputClipTimeSpan setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputClipTimeSpan setSeek(String seek) {
            this.seek = seek;
            return this;
        }
        public String getSeek() {
            return this.seek;
        }

    }

    public static class SubmitJobsResponseBodyJobResultListJobResultJobOutputClip extends TeaModel {
        /**
         * <p>The time span of the clip.</p>
         */
        @NameInMap("TimeSpan")
        public SubmitJobsResponseBodyJobResultListJobResultJobOutputClipTimeSpan timeSpan;

        public static SubmitJobsResponseBodyJobResultListJobResultJobOutputClip build(java.util.Map<String, ?> map) throws Exception {
            SubmitJobsResponseBodyJobResultListJobResultJobOutputClip self = new SubmitJobsResponseBodyJobResultListJobResultJobOutputClip();
            return TeaModel.build(map, self);
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputClip setTimeSpan(SubmitJobsResponseBodyJobResultListJobResultJobOutputClipTimeSpan timeSpan) {
            this.timeSpan = timeSpan;
            return this;
        }
        public SubmitJobsResponseBodyJobResultListJobResultJobOutputClipTimeSpan getTimeSpan() {
            return this.timeSpan;
        }

    }

    public static class SubmitJobsResponseBodyJobResultListJobResultJobOutputContainer extends TeaModel {
        /**
         * <p>The container format.</p>
         * <ul>
         * <li>Default value: <strong>mp4</strong>.</li>
         * <li>Video formats include FLV, MP4, HLS (M3U8 + TS), and MPEG-DASH (MPD + fMP4).</li>
         * <li>Audio formats include MP3, MP4, Ogg, FLAC, and M4A.</li>
         * <li>Image formats include GIF and WebP.</li>
         * <li>If the container format is GIF, the video codec must be GIF.</li>
         * <li>If the container format is WebP, the video codec must be WebP.</li>
         * <li>If the container format is FLV, the video codec cannot be H.265.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>flv</p>
         */
        @NameInMap("Format")
        public String format;

        public static SubmitJobsResponseBodyJobResultListJobResultJobOutputContainer build(java.util.Map<String, ?> map) throws Exception {
            SubmitJobsResponseBodyJobResultListJobResultJobOutputContainer self = new SubmitJobsResponseBodyJobResultListJobResultJobOutputContainer();
            return TeaModel.build(map, self);
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputContainer setFormat(String format) {
            this.format = format;
            return this;
        }
        public String getFormat() {
            return this.format;
        }

    }

    public static class SubmitJobsResponseBodyJobResultListJobResultJobOutputDigiWaterMarkInputFile extends TeaModel {
        /**
         * <p>The name of the OSS bucket in which the input file is stored.</p>
         * 
         * <strong>example:</strong>
         * <p>example-bucket-****</p>
         */
        @NameInMap("Bucket")
        public String bucket;

        /**
         * <p>The ID of the OSS region in which the input file is stored.</p>
         * 
         * <strong>example:</strong>
         * <p>oss-cn-hangzhou</p>
         */
        @NameInMap("Location")
        public String location;

        /**
         * <p>The name of the OSS object that is used as the input file.</p>
         * 
         * <strong>example:</strong>
         * <p>example-intput.flv</p>
         */
        @NameInMap("Object")
        public String object;

        public static SubmitJobsResponseBodyJobResultListJobResultJobOutputDigiWaterMarkInputFile build(java.util.Map<String, ?> map) throws Exception {
            SubmitJobsResponseBodyJobResultListJobResultJobOutputDigiWaterMarkInputFile self = new SubmitJobsResponseBodyJobResultListJobResultJobOutputDigiWaterMarkInputFile();
            return TeaModel.build(map, self);
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputDigiWaterMarkInputFile setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputDigiWaterMarkInputFile setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputDigiWaterMarkInputFile setObject(String object) {
            this.object = object;
            return this;
        }
        public String getObject() {
            return this.object;
        }

    }

    public static class SubmitJobsResponseBodyJobResultListJobResultJobOutputDigiWaterMark extends TeaModel {
        /**
         * <p>The transparency of the text or image.</p>
         * <ul>
         * <li>Value values: <strong>(0,1]</strong>.</li>
         * <li>Default value: <strong>1.0</strong>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1.0</p>
         */
        @NameInMap("Alpha")
        public String alpha;

        /**
         * <p>The details of the input file.</p>
         */
        @NameInMap("InputFile")
        public SubmitJobsResponseBodyJobResultListJobResultJobOutputDigiWaterMarkInputFile inputFile;

        /**
         * <p>The type of the watermark. If this parameter is specified in the request, the corresponding parameter in the watermark template is overwritten. Valid values:</p>
         * <ul>
         * <li><strong>Image</strong> (default)</li>
         * <li><strong>Text</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Image</p>
         */
        @NameInMap("Type")
        public String type;

        public static SubmitJobsResponseBodyJobResultListJobResultJobOutputDigiWaterMark build(java.util.Map<String, ?> map) throws Exception {
            SubmitJobsResponseBodyJobResultListJobResultJobOutputDigiWaterMark self = new SubmitJobsResponseBodyJobResultListJobResultJobOutputDigiWaterMark();
            return TeaModel.build(map, self);
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputDigiWaterMark setAlpha(String alpha) {
            this.alpha = alpha;
            return this;
        }
        public String getAlpha() {
            return this.alpha;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputDigiWaterMark setInputFile(SubmitJobsResponseBodyJobResultListJobResultJobOutputDigiWaterMarkInputFile inputFile) {
            this.inputFile = inputFile;
            return this;
        }
        public SubmitJobsResponseBodyJobResultListJobResultJobOutputDigiWaterMarkInputFile getInputFile() {
            return this.inputFile;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputDigiWaterMark setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class SubmitJobsResponseBodyJobResultListJobResultJobOutputEncryption extends TeaModel {
        /**
         * <p>The encryption ID.</p>
         * 
         * <strong>example:</strong>
         * <p>31fa3c9ca8134f9cec2b4b0b0f78****</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The key that is used to encrypt the video.</p>
         * 
         * <strong>example:</strong>
         * <p>encryptionkey128</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The key encryption method. Keys cannot be transmitted to MPS in plaintext. Keys must be encrypted by using Base64 or Key Management Service (KMS). For example, if the key is encryptionkey128, you can encrypt the key by using the following method: Base64(&quot;encryptionkey128&quot;) or KMS(Base64(&quot;encryptionkey128&quot;).</p>
         * 
         * <strong>example:</strong>
         * <p>Base64</p>
         */
        @NameInMap("KeyType")
        public String keyType;

        /**
         * <p>The URL that is used to request the key. The URL is Base64-encoded.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://1161758785*****.cn-shanghai.fc.aliyuncs.com/2016-08-15/proxy/HLS-decyptServer/decyptServer/">https://1161758785*****.cn-shanghai.fc.aliyuncs.com/2016-08-15/proxy/HLS-decyptServer/decyptServer/</a></p>
         */
        @NameInMap("KeyUri")
        public String keyUri;

        /**
         * <p>The number of unencrypted frames at the beginning of the video. Leaving these frames unencrypted enables video playback to quickly start.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("SkipCnt")
        public String skipCnt;

        /**
         * <p>The encryption type. Only <strong>hls-aes-128</strong> may be returned.</p>
         * 
         * <strong>example:</strong>
         * <p>hls-aes-128</p>
         */
        @NameInMap("Type")
        public String type;

        public static SubmitJobsResponseBodyJobResultListJobResultJobOutputEncryption build(java.util.Map<String, ?> map) throws Exception {
            SubmitJobsResponseBodyJobResultListJobResultJobOutputEncryption self = new SubmitJobsResponseBodyJobResultListJobResultJobOutputEncryption();
            return TeaModel.build(map, self);
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputEncryption setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputEncryption setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputEncryption setKeyType(String keyType) {
            this.keyType = keyType;
            return this;
        }
        public String getKeyType() {
            return this.keyType;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputEncryption setKeyUri(String keyUri) {
            this.keyUri = keyUri;
            return this;
        }
        public String getKeyUri() {
            return this.keyUri;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputEncryption setSkipCnt(String skipCnt) {
            this.skipCnt = skipCnt;
            return this;
        }
        public String getSkipCnt() {
            return this.skipCnt;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputEncryption setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class SubmitJobsResponseBodyJobResultListJobResultJobOutputM3U8NonStandardSupportTS extends TeaModel {
        /**
         * <p>Indicates whether the output of the MD5 value of the TS file is supported in the M3U8 video. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Md5Support")
        public Boolean md5Support;

        /**
         * <p>Indicates whether the size of the TS file is generated in the output M3U8 video. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("SizeSupport")
        public Boolean sizeSupport;

        public static SubmitJobsResponseBodyJobResultListJobResultJobOutputM3U8NonStandardSupportTS build(java.util.Map<String, ?> map) throws Exception {
            SubmitJobsResponseBodyJobResultListJobResultJobOutputM3U8NonStandardSupportTS self = new SubmitJobsResponseBodyJobResultListJobResultJobOutputM3U8NonStandardSupportTS();
            return TeaModel.build(map, self);
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputM3U8NonStandardSupportTS setMd5Support(Boolean md5Support) {
            this.md5Support = md5Support;
            return this;
        }
        public Boolean getMd5Support() {
            return this.md5Support;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputM3U8NonStandardSupportTS setSizeSupport(Boolean sizeSupport) {
            this.sizeSupport = sizeSupport;
            return this;
        }
        public Boolean getSizeSupport() {
            return this.sizeSupport;
        }

    }

    public static class SubmitJobsResponseBodyJobResultListJobResultJobOutputM3U8NonStandardSupport extends TeaModel {
        /**
         * <p>The non-standard support configurations for TS files. The value is a JSON object. For more information, see the <strong>TS</strong> section of the <a href="https://help.aliyun.com/document_detail/29253.html">Parameter details</a> topic.</p>
         */
        @NameInMap("TS")
        public SubmitJobsResponseBodyJobResultListJobResultJobOutputM3U8NonStandardSupportTS TS;

        public static SubmitJobsResponseBodyJobResultListJobResultJobOutputM3U8NonStandardSupport build(java.util.Map<String, ?> map) throws Exception {
            SubmitJobsResponseBodyJobResultListJobResultJobOutputM3U8NonStandardSupport self = new SubmitJobsResponseBodyJobResultListJobResultJobOutputM3U8NonStandardSupport();
            return TeaModel.build(map, self);
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputM3U8NonStandardSupport setTS(SubmitJobsResponseBodyJobResultListJobResultJobOutputM3U8NonStandardSupportTS TS) {
            this.TS = TS;
            return this;
        }
        public SubmitJobsResponseBodyJobResultListJobResultJobOutputM3U8NonStandardSupportTS getTS() {
            return this.TS;
        }

    }

    public static class SubmitJobsResponseBodyJobResultListJobResultJobOutputMergeListMerge extends TeaModel {
        /**
         * <p>The duration of the clip.</p>
         * <ul>
         * <li>Format: <code>hh:mm:ss[.SSS]</code> or <code>sssss[.SSS]</code>.</li>
         * <li>Examples: 01:59:59.999 and 32000.23.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>00000.20</p>
         */
        @NameInMap("Duration")
        public String duration;

        /**
         * <p>The OSS URL of the clip.</p>
         * <ul>
         * <li>Example: <code>http://example-bucket-****.oss-cn-hangzhou.aliyuncs.com/example-object-****.flv</code>.</li>
         * <li>The OSS URL of the object must be URL-encoded by using the UTF-8 standard.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p><a href="http://example-bucket-****.oss-cn-hangzhou.aliyuncs.com/example-object-****.flv">http://example-bucket-****.oss-cn-hangzhou.aliyuncs.com/example-object-****.flv</a></p>
         */
        @NameInMap("MergeURL")
        public String mergeURL;

        /**
         * <p>The Alibaba Cloud Resource Name (ARN) of the Resource Access Management (RAM) role used for delegated authorization.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:ram::<your uid>:role/<your role name></p>
         */
        @NameInMap("RoleArn")
        public String roleArn;

        /**
         * <p>The start point in time of the clip.</p>
         * <ul>
         * <li>Format: <code>hh:mm:ss[.SSS]</code> or <code>sssss[.SSS]</code>.</li>
         * <li>Examples: 01:59:59.999 and 32000.23.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>00000.50</p>
         */
        @NameInMap("Start")
        public String start;

        public static SubmitJobsResponseBodyJobResultListJobResultJobOutputMergeListMerge build(java.util.Map<String, ?> map) throws Exception {
            SubmitJobsResponseBodyJobResultListJobResultJobOutputMergeListMerge self = new SubmitJobsResponseBodyJobResultListJobResultJobOutputMergeListMerge();
            return TeaModel.build(map, self);
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputMergeListMerge setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputMergeListMerge setMergeURL(String mergeURL) {
            this.mergeURL = mergeURL;
            return this;
        }
        public String getMergeURL() {
            return this.mergeURL;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputMergeListMerge setRoleArn(String roleArn) {
            this.roleArn = roleArn;
            return this;
        }
        public String getRoleArn() {
            return this.roleArn;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputMergeListMerge setStart(String start) {
            this.start = start;
            return this;
        }
        public String getStart() {
            return this.start;
        }

    }

    public static class SubmitJobsResponseBodyJobResultListJobResultJobOutputMergeList extends TeaModel {
        @NameInMap("Merge")
        public java.util.List<SubmitJobsResponseBodyJobResultListJobResultJobOutputMergeListMerge> merge;

        public static SubmitJobsResponseBodyJobResultListJobResultJobOutputMergeList build(java.util.Map<String, ?> map) throws Exception {
            SubmitJobsResponseBodyJobResultListJobResultJobOutputMergeList self = new SubmitJobsResponseBodyJobResultListJobResultJobOutputMergeList();
            return TeaModel.build(map, self);
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputMergeList setMerge(java.util.List<SubmitJobsResponseBodyJobResultListJobResultJobOutputMergeListMerge> merge) {
            this.merge = merge;
            return this;
        }
        public java.util.List<SubmitJobsResponseBodyJobResultListJobResultJobOutputMergeListMerge> getMerge() {
            return this.merge;
        }

    }

    public static class SubmitJobsResponseBodyJobResultListJobResultJobOutputMuxConfigGif extends TeaModel {
        /**
         * <p>The color dithering algorithm of the palette. Valid values: <strong>sierra</strong> and <strong>bayer</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>bayer</p>
         */
        @NameInMap("DitherMode")
        public String ditherMode;

        /**
         * <p>The duration for which the final frame is paused. Unit: centisecond.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("FinalDelay")
        public String finalDelay;

        /**
         * <p>Indicates whether a custom palette is used. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsCustomPalette")
        public String isCustomPalette;

        /**
         * <p>The loop count.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Loop")
        public String loop;

        public static SubmitJobsResponseBodyJobResultListJobResultJobOutputMuxConfigGif build(java.util.Map<String, ?> map) throws Exception {
            SubmitJobsResponseBodyJobResultListJobResultJobOutputMuxConfigGif self = new SubmitJobsResponseBodyJobResultListJobResultJobOutputMuxConfigGif();
            return TeaModel.build(map, self);
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputMuxConfigGif setDitherMode(String ditherMode) {
            this.ditherMode = ditherMode;
            return this;
        }
        public String getDitherMode() {
            return this.ditherMode;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputMuxConfigGif setFinalDelay(String finalDelay) {
            this.finalDelay = finalDelay;
            return this;
        }
        public String getFinalDelay() {
            return this.finalDelay;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputMuxConfigGif setIsCustomPalette(String isCustomPalette) {
            this.isCustomPalette = isCustomPalette;
            return this;
        }
        public String getIsCustomPalette() {
            return this.isCustomPalette;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputMuxConfigGif setLoop(String loop) {
            this.loop = loop;
            return this;
        }
        public String getLoop() {
            return this.loop;
        }

    }

    public static class SubmitJobsResponseBodyJobResultListJobResultJobOutputMuxConfigSegment extends TeaModel {
        /**
         * <p>The length of the segment. The value is an integer. Unit: seconds.</p>
         * <ul>
         * <li>Valid values: <strong>[1,10]</strong>.</li>
         * <li>Default value: <strong>10</strong>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("Duration")
        public String duration;

        public static SubmitJobsResponseBodyJobResultListJobResultJobOutputMuxConfigSegment build(java.util.Map<String, ?> map) throws Exception {
            SubmitJobsResponseBodyJobResultListJobResultJobOutputMuxConfigSegment self = new SubmitJobsResponseBodyJobResultListJobResultJobOutputMuxConfigSegment();
            return TeaModel.build(map, self);
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputMuxConfigSegment setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

    }

    public static class SubmitJobsResponseBodyJobResultListJobResultJobOutputMuxConfigWebp extends TeaModel {
        /**
         * <p>The loop count.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Loop")
        public String loop;

        public static SubmitJobsResponseBodyJobResultListJobResultJobOutputMuxConfigWebp build(java.util.Map<String, ?> map) throws Exception {
            SubmitJobsResponseBodyJobResultListJobResultJobOutputMuxConfigWebp self = new SubmitJobsResponseBodyJobResultListJobResultJobOutputMuxConfigWebp();
            return TeaModel.build(map, self);
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputMuxConfigWebp setLoop(String loop) {
            this.loop = loop;
            return this;
        }
        public String getLoop() {
            return this.loop;
        }

    }

    public static class SubmitJobsResponseBodyJobResultListJobResultJobOutputMuxConfig extends TeaModel {
        /**
         * <p>The transmuxing configurations for GIF.</p>
         */
        @NameInMap("Gif")
        public SubmitJobsResponseBodyJobResultListJobResultJobOutputMuxConfigGif gif;

        /**
         * <p>The segment configuration. The value is a JSON object.</p>
         */
        @NameInMap("Segment")
        public SubmitJobsResponseBodyJobResultListJobResultJobOutputMuxConfigSegment segment;

        /**
         * <p>The transmuxing configurations for WebP.</p>
         */
        @NameInMap("Webp")
        public SubmitJobsResponseBodyJobResultListJobResultJobOutputMuxConfigWebp webp;

        public static SubmitJobsResponseBodyJobResultListJobResultJobOutputMuxConfig build(java.util.Map<String, ?> map) throws Exception {
            SubmitJobsResponseBodyJobResultListJobResultJobOutputMuxConfig self = new SubmitJobsResponseBodyJobResultListJobResultJobOutputMuxConfig();
            return TeaModel.build(map, self);
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputMuxConfig setGif(SubmitJobsResponseBodyJobResultListJobResultJobOutputMuxConfigGif gif) {
            this.gif = gif;
            return this;
        }
        public SubmitJobsResponseBodyJobResultListJobResultJobOutputMuxConfigGif getGif() {
            return this.gif;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputMuxConfig setSegment(SubmitJobsResponseBodyJobResultListJobResultJobOutputMuxConfigSegment segment) {
            this.segment = segment;
            return this;
        }
        public SubmitJobsResponseBodyJobResultListJobResultJobOutputMuxConfigSegment getSegment() {
            return this.segment;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputMuxConfig setWebp(SubmitJobsResponseBodyJobResultListJobResultJobOutputMuxConfigWebp webp) {
            this.webp = webp;
            return this;
        }
        public SubmitJobsResponseBodyJobResultListJobResultJobOutputMuxConfigWebp getWebp() {
            return this.webp;
        }

    }

    public static class SubmitJobsResponseBodyJobResultListJobResultJobOutputOpeningListOpening extends TeaModel {
        /**
         * <p>The height of the opening part.</p>
         * <ul>
         * <li>Valid values: values in the range of <strong>(0,4096)</strong>, <strong>-1</strong>, and <strong>full</strong>.</li>
         * <li>Default value: <strong>-1</strong>.</li>
         * <li>A value of <strong>-1</strong> indicates that the height of the source of the opening part is retained.</li>
         * <li>A value of <strong>full</strong> indicates that the height of the main part is used for the opening part.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1080</p>
         */
        @NameInMap("Height")
        public String height;

        /**
         * <p>The amount of time after which the opening part is played. The value starts from 0.</p>
         * <ul>
         * <li>Unit: seconds.</li>
         * <li>Default value: <strong>0</strong>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Start")
        public String start;

        /**
         * <p>The width of the opening part.</p>
         * <ul>
         * <li>Valid values: values in the range of <strong>(0,4096)</strong>, <strong>-1</strong>, and <strong>full</strong>.</li>
         * <li>Default value: <strong>-1</strong>.</li>
         * <li>A value of <strong>-1</strong> indicates that the width of the source of the opening part is retained.</li>
         * <li>A value of <strong>full</strong> indicates that the width of the main part is used for the opening part.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1920</p>
         */
        @NameInMap("Width")
        public String width;

        /**
         * <p>The OSS URL of the opening part.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://example-bucket-****.oss-cn-hangzhou.aliyuncs.com/opening_01.flv">http://example-bucket-****.oss-cn-hangzhou.aliyuncs.com/opening_01.flv</a></p>
         */
        @NameInMap("openUrl")
        public String openUrl;

        public static SubmitJobsResponseBodyJobResultListJobResultJobOutputOpeningListOpening build(java.util.Map<String, ?> map) throws Exception {
            SubmitJobsResponseBodyJobResultListJobResultJobOutputOpeningListOpening self = new SubmitJobsResponseBodyJobResultListJobResultJobOutputOpeningListOpening();
            return TeaModel.build(map, self);
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputOpeningListOpening setHeight(String height) {
            this.height = height;
            return this;
        }
        public String getHeight() {
            return this.height;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputOpeningListOpening setStart(String start) {
            this.start = start;
            return this;
        }
        public String getStart() {
            return this.start;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputOpeningListOpening setWidth(String width) {
            this.width = width;
            return this;
        }
        public String getWidth() {
            return this.width;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputOpeningListOpening setOpenUrl(String openUrl) {
            this.openUrl = openUrl;
            return this;
        }
        public String getOpenUrl() {
            return this.openUrl;
        }

    }

    public static class SubmitJobsResponseBodyJobResultListJobResultJobOutputOpeningList extends TeaModel {
        @NameInMap("Opening")
        public java.util.List<SubmitJobsResponseBodyJobResultListJobResultJobOutputOpeningListOpening> opening;

        public static SubmitJobsResponseBodyJobResultListJobResultJobOutputOpeningList build(java.util.Map<String, ?> map) throws Exception {
            SubmitJobsResponseBodyJobResultListJobResultJobOutputOpeningList self = new SubmitJobsResponseBodyJobResultListJobResultJobOutputOpeningList();
            return TeaModel.build(map, self);
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputOpeningList setOpening(java.util.List<SubmitJobsResponseBodyJobResultListJobResultJobOutputOpeningListOpening> opening) {
            this.opening = opening;
            return this;
        }
        public java.util.List<SubmitJobsResponseBodyJobResultListJobResultJobOutputOpeningListOpening> getOpening() {
            return this.opening;
        }

    }

    public static class SubmitJobsResponseBodyJobResultListJobResultJobOutputOutSubtitleListOutSubtitleOutSubtitleFile extends TeaModel {
        /**
         * <p>The name of the OSS bucket in which the input file is stored.</p>
         * 
         * <strong>example:</strong>
         * <p>example-bucket-****</p>
         */
        @NameInMap("Bucket")
        public String bucket;

        /**
         * <p>The ID of the OSS region in which the output file is stored.</p>
         * 
         * <strong>example:</strong>
         * <p>oss-cn-hangzhou</p>
         */
        @NameInMap("Location")
        public String location;

        /**
         * <p>The name of the OSS object that is used as the output file.</p>
         * 
         * <strong>example:</strong>
         * <p>example-output.flv</p>
         */
        @NameInMap("Object")
        public String object;

        /**
         * <p>The ARN of the RAM role used for delegated authorization.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:ram::<your uid>:role/<your role name></p>
         */
        @NameInMap("RoleArn")
        public String roleArn;

        public static SubmitJobsResponseBodyJobResultListJobResultJobOutputOutSubtitleListOutSubtitleOutSubtitleFile build(java.util.Map<String, ?> map) throws Exception {
            SubmitJobsResponseBodyJobResultListJobResultJobOutputOutSubtitleListOutSubtitleOutSubtitleFile self = new SubmitJobsResponseBodyJobResultListJobResultJobOutputOutSubtitleListOutSubtitleOutSubtitleFile();
            return TeaModel.build(map, self);
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputOutSubtitleListOutSubtitleOutSubtitleFile setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputOutSubtitleListOutSubtitleOutSubtitleFile setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputOutSubtitleListOutSubtitleOutSubtitleFile setObject(String object) {
            this.object = object;
            return this;
        }
        public String getObject() {
            return this.object;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputOutSubtitleListOutSubtitleOutSubtitleFile setRoleArn(String roleArn) {
            this.roleArn = roleArn;
            return this;
        }
        public String getRoleArn() {
            return this.roleArn;
        }

    }

    public static class SubmitJobsResponseBodyJobResultListJobResultJobOutputOutSubtitleListOutSubtitle extends TeaModel {
        /**
         * <p>The video track. Format: <code>0:{Stream}:{Stream sequence number}</code>, which is <code>0:v:{video_index}</code>. The value of Stream is v, which indicates a video stream. The sequence number is the index of the video stream in the list and starts from 0.</p>
         * 
         * <strong>example:</strong>
         * <p>0:v:0</p>
         */
        @NameInMap("Map")
        public String map;

        /**
         * <p>The error message returned if the job failed to be created. This parameter is not returned if the job was created.</p>
         * 
         * <strong>example:</strong>
         * <p>The specified parameter “%s” cannot be null.</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The details of the output file.</p>
         */
        @NameInMap("OutSubtitleFile")
        public SubmitJobsResponseBodyJobResultListJobResultJobOutputOutSubtitleListOutSubtitleOutSubtitleFile outSubtitleFile;

        /**
         * <p>Indicates whether the job was created. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Success")
        public Boolean success;

        public static SubmitJobsResponseBodyJobResultListJobResultJobOutputOutSubtitleListOutSubtitle build(java.util.Map<String, ?> map) throws Exception {
            SubmitJobsResponseBodyJobResultListJobResultJobOutputOutSubtitleListOutSubtitle self = new SubmitJobsResponseBodyJobResultListJobResultJobOutputOutSubtitleListOutSubtitle();
            return TeaModel.build(map, self);
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputOutSubtitleListOutSubtitle setMap(String map) {
            this.map = map;
            return this;
        }
        public String getMap() {
            return this.map;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputOutSubtitleListOutSubtitle setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputOutSubtitleListOutSubtitle setOutSubtitleFile(SubmitJobsResponseBodyJobResultListJobResultJobOutputOutSubtitleListOutSubtitleOutSubtitleFile outSubtitleFile) {
            this.outSubtitleFile = outSubtitleFile;
            return this;
        }
        public SubmitJobsResponseBodyJobResultListJobResultJobOutputOutSubtitleListOutSubtitleOutSubtitleFile getOutSubtitleFile() {
            return this.outSubtitleFile;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputOutSubtitleListOutSubtitle setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

    public static class SubmitJobsResponseBodyJobResultListJobResultJobOutputOutSubtitleList extends TeaModel {
        @NameInMap("OutSubtitle")
        public java.util.List<SubmitJobsResponseBodyJobResultListJobResultJobOutputOutSubtitleListOutSubtitle> outSubtitle;

        public static SubmitJobsResponseBodyJobResultListJobResultJobOutputOutSubtitleList build(java.util.Map<String, ?> map) throws Exception {
            SubmitJobsResponseBodyJobResultListJobResultJobOutputOutSubtitleList self = new SubmitJobsResponseBodyJobResultListJobResultJobOutputOutSubtitleList();
            return TeaModel.build(map, self);
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputOutSubtitleList setOutSubtitle(java.util.List<SubmitJobsResponseBodyJobResultListJobResultJobOutputOutSubtitleListOutSubtitle> outSubtitle) {
            this.outSubtitle = outSubtitle;
            return this;
        }
        public java.util.List<SubmitJobsResponseBodyJobResultListJobResultJobOutputOutSubtitleListOutSubtitle> getOutSubtitle() {
            return this.outSubtitle;
        }

    }

    public static class SubmitJobsResponseBodyJobResultListJobResultJobOutputOutputFile extends TeaModel {
        /**
         * <p>The name of the OSS bucket in which the input file is stored.</p>
         * 
         * <strong>example:</strong>
         * <p>example-bucket-****</p>
         */
        @NameInMap("Bucket")
        public String bucket;

        /**
         * <p>The ID of the OSS region in which the output file is stored.</p>
         * 
         * <strong>example:</strong>
         * <p>oss-cn-hangzhou</p>
         */
        @NameInMap("Location")
        public String location;

        /**
         * <p>The name of the OSS object that is used as the output file.</p>
         * 
         * <strong>example:</strong>
         * <p>example-output.flv</p>
         */
        @NameInMap("Object")
        public String object;

        /**
         * <p>The ARN of the RAM role used for delegated authorization.</p>
         * 
         * <strong>example:</strong>
         * <p>acs:ram::<your uid>:role/<your role name></p>
         */
        @NameInMap("RoleArn")
        public String roleArn;

        public static SubmitJobsResponseBodyJobResultListJobResultJobOutputOutputFile build(java.util.Map<String, ?> map) throws Exception {
            SubmitJobsResponseBodyJobResultListJobResultJobOutputOutputFile self = new SubmitJobsResponseBodyJobResultListJobResultJobOutputOutputFile();
            return TeaModel.build(map, self);
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputOutputFile setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputOutputFile setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputOutputFile setObject(String object) {
            this.object = object;
            return this;
        }
        public String getObject() {
            return this.object;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputOutputFile setRoleArn(String roleArn) {
            this.roleArn = roleArn;
            return this;
        }
        public String getRoleArn() {
            return this.roleArn;
        }

    }

    public static class SubmitJobsResponseBodyJobResultListJobResultJobOutputPropertiesFormat extends TeaModel {
        /**
         * <p>The total bitrate.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("Bitrate")
        public String bitrate;

        /**
         * <p>The total duration.</p>
         * 
         * <strong>example:</strong>
         * <p>55</p>
         */
        @NameInMap("Duration")
        public String duration;

        /**
         * <p>The full name of the container format.</p>
         * 
         * <strong>example:</strong>
         * <p>QuickTime / MOV</p>
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
         * <p>The size of the file.</p>
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

        public static SubmitJobsResponseBodyJobResultListJobResultJobOutputPropertiesFormat build(java.util.Map<String, ?> map) throws Exception {
            SubmitJobsResponseBodyJobResultListJobResultJobOutputPropertiesFormat self = new SubmitJobsResponseBodyJobResultListJobResultJobOutputPropertiesFormat();
            return TeaModel.build(map, self);
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputPropertiesFormat setBitrate(String bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public String getBitrate() {
            return this.bitrate;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputPropertiesFormat setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputPropertiesFormat setFormatLongName(String formatLongName) {
            this.formatLongName = formatLongName;
            return this;
        }
        public String getFormatLongName() {
            return this.formatLongName;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputPropertiesFormat setFormatName(String formatName) {
            this.formatName = formatName;
            return this;
        }
        public String getFormatName() {
            return this.formatName;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputPropertiesFormat setNumPrograms(String numPrograms) {
            this.numPrograms = numPrograms;
            return this;
        }
        public String getNumPrograms() {
            return this.numPrograms;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputPropertiesFormat setNumStreams(String numStreams) {
            this.numStreams = numStreams;
            return this;
        }
        public String getNumStreams() {
            return this.numStreams;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputPropertiesFormat setSize(String size) {
            this.size = size;
            return this;
        }
        public String getSize() {
            return this.size;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputPropertiesFormat setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

    public static class SubmitJobsResponseBodyJobResultListJobResultJobOutputPropertiesStreamsAudioStreamListAudioStream extends TeaModel {
        /**
         * <p>The bitrate of the audio stream.</p>
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
         * <p>The full name of the codec.</p>
         * 
         * <strong>example:</strong>
         * <p>AAC (Advanced Audio Coding)</p>
         */
        @NameInMap("CodecLongName")
        public String codecLongName;

        /**
         * <p>The short name of the codec.</p>
         * 
         * <strong>example:</strong>
         * <p>aac</p>
         */
        @NameInMap("CodecName")
        public String codecName;

        /**
         * <p>The tag of the codec.</p>
         * 
         * <strong>example:</strong>
         * <p>0x6134706d</p>
         */
        @NameInMap("CodecTag")
        public String codecTag;

        /**
         * <p>The tag string of the codec.</p>
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
         * <p>The duration of the audio stream.</p>
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
         * <p>The language of the audio stream. For more information, see <a href="https://www.ffmpeg.org/ffmpeg-all.html#Metadata">FFmpeg documentation</a> and <a href="https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes">ISO 639</a>.</p>
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
         * <p>25</p>
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
         * <p>The sampling rate of the audio stream.</p>
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
         * <p>The time base of the audio stream.</p>
         * 
         * <strong>example:</strong>
         * <p>1/44100</p>
         */
        @NameInMap("Timebase")
        public String timebase;

        public static SubmitJobsResponseBodyJobResultListJobResultJobOutputPropertiesStreamsAudioStreamListAudioStream build(java.util.Map<String, ?> map) throws Exception {
            SubmitJobsResponseBodyJobResultListJobResultJobOutputPropertiesStreamsAudioStreamListAudioStream self = new SubmitJobsResponseBodyJobResultListJobResultJobOutputPropertiesStreamsAudioStreamListAudioStream();
            return TeaModel.build(map, self);
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputPropertiesStreamsAudioStreamListAudioStream setBitrate(String bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public String getBitrate() {
            return this.bitrate;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputPropertiesStreamsAudioStreamListAudioStream setChannelLayout(String channelLayout) {
            this.channelLayout = channelLayout;
            return this;
        }
        public String getChannelLayout() {
            return this.channelLayout;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputPropertiesStreamsAudioStreamListAudioStream setChannels(String channels) {
            this.channels = channels;
            return this;
        }
        public String getChannels() {
            return this.channels;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputPropertiesStreamsAudioStreamListAudioStream setCodecLongName(String codecLongName) {
            this.codecLongName = codecLongName;
            return this;
        }
        public String getCodecLongName() {
            return this.codecLongName;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputPropertiesStreamsAudioStreamListAudioStream setCodecName(String codecName) {
            this.codecName = codecName;
            return this;
        }
        public String getCodecName() {
            return this.codecName;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputPropertiesStreamsAudioStreamListAudioStream setCodecTag(String codecTag) {
            this.codecTag = codecTag;
            return this;
        }
        public String getCodecTag() {
            return this.codecTag;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputPropertiesStreamsAudioStreamListAudioStream setCodecTagString(String codecTagString) {
            this.codecTagString = codecTagString;
            return this;
        }
        public String getCodecTagString() {
            return this.codecTagString;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputPropertiesStreamsAudioStreamListAudioStream setCodecTimeBase(String codecTimeBase) {
            this.codecTimeBase = codecTimeBase;
            return this;
        }
        public String getCodecTimeBase() {
            return this.codecTimeBase;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputPropertiesStreamsAudioStreamListAudioStream setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputPropertiesStreamsAudioStreamListAudioStream setIndex(String index) {
            this.index = index;
            return this;
        }
        public String getIndex() {
            return this.index;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputPropertiesStreamsAudioStreamListAudioStream setLang(String lang) {
            this.lang = lang;
            return this;
        }
        public String getLang() {
            return this.lang;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputPropertiesStreamsAudioStreamListAudioStream setNumFrames(String numFrames) {
            this.numFrames = numFrames;
            return this;
        }
        public String getNumFrames() {
            return this.numFrames;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputPropertiesStreamsAudioStreamListAudioStream setSampleFmt(String sampleFmt) {
            this.sampleFmt = sampleFmt;
            return this;
        }
        public String getSampleFmt() {
            return this.sampleFmt;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputPropertiesStreamsAudioStreamListAudioStream setSamplerate(String samplerate) {
            this.samplerate = samplerate;
            return this;
        }
        public String getSamplerate() {
            return this.samplerate;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputPropertiesStreamsAudioStreamListAudioStream setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputPropertiesStreamsAudioStreamListAudioStream setTimebase(String timebase) {
            this.timebase = timebase;
            return this;
        }
        public String getTimebase() {
            return this.timebase;
        }

    }

    public static class SubmitJobsResponseBodyJobResultListJobResultJobOutputPropertiesStreamsAudioStreamList extends TeaModel {
        @NameInMap("AudioStream")
        public java.util.List<SubmitJobsResponseBodyJobResultListJobResultJobOutputPropertiesStreamsAudioStreamListAudioStream> audioStream;

        public static SubmitJobsResponseBodyJobResultListJobResultJobOutputPropertiesStreamsAudioStreamList build(java.util.Map<String, ?> map) throws Exception {
            SubmitJobsResponseBodyJobResultListJobResultJobOutputPropertiesStreamsAudioStreamList self = new SubmitJobsResponseBodyJobResultListJobResultJobOutputPropertiesStreamsAudioStreamList();
            return TeaModel.build(map, self);
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputPropertiesStreamsAudioStreamList setAudioStream(java.util.List<SubmitJobsResponseBodyJobResultListJobResultJobOutputPropertiesStreamsAudioStreamListAudioStream> audioStream) {
            this.audioStream = audioStream;
            return this;
        }
        public java.util.List<SubmitJobsResponseBodyJobResultListJobResultJobOutputPropertiesStreamsAudioStreamListAudioStream> getAudioStream() {
            return this.audioStream;
        }

    }

    public static class SubmitJobsResponseBodyJobResultListJobResultJobOutputPropertiesStreamsSubtitleStreamListSubtitleStream extends TeaModel {
        /**
         * <p>The sequence number of the subtitle stream. The value indicates the position of the subtitle stream in all subtitle streams.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Index")
        public String index;

        /**
         * <p>The language of the subtitle stream. For more information, see <a href="https://www.ffmpeg.org/ffmpeg-all.html#Metadata">FFmpeg documentation</a> and <a href="https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes">ISO 639</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>eng</p>
         */
        @NameInMap("Lang")
        public String lang;

        public static SubmitJobsResponseBodyJobResultListJobResultJobOutputPropertiesStreamsSubtitleStreamListSubtitleStream build(java.util.Map<String, ?> map) throws Exception {
            SubmitJobsResponseBodyJobResultListJobResultJobOutputPropertiesStreamsSubtitleStreamListSubtitleStream self = new SubmitJobsResponseBodyJobResultListJobResultJobOutputPropertiesStreamsSubtitleStreamListSubtitleStream();
            return TeaModel.build(map, self);
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputPropertiesStreamsSubtitleStreamListSubtitleStream setIndex(String index) {
            this.index = index;
            return this;
        }
        public String getIndex() {
            return this.index;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputPropertiesStreamsSubtitleStreamListSubtitleStream setLang(String lang) {
            this.lang = lang;
            return this;
        }
        public String getLang() {
            return this.lang;
        }

    }

    public static class SubmitJobsResponseBodyJobResultListJobResultJobOutputPropertiesStreamsSubtitleStreamList extends TeaModel {
        @NameInMap("SubtitleStream")
        public java.util.List<SubmitJobsResponseBodyJobResultListJobResultJobOutputPropertiesStreamsSubtitleStreamListSubtitleStream> subtitleStream;

        public static SubmitJobsResponseBodyJobResultListJobResultJobOutputPropertiesStreamsSubtitleStreamList build(java.util.Map<String, ?> map) throws Exception {
            SubmitJobsResponseBodyJobResultListJobResultJobOutputPropertiesStreamsSubtitleStreamList self = new SubmitJobsResponseBodyJobResultListJobResultJobOutputPropertiesStreamsSubtitleStreamList();
            return TeaModel.build(map, self);
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputPropertiesStreamsSubtitleStreamList setSubtitleStream(java.util.List<SubmitJobsResponseBodyJobResultListJobResultJobOutputPropertiesStreamsSubtitleStreamListSubtitleStream> subtitleStream) {
            this.subtitleStream = subtitleStream;
            return this;
        }
        public java.util.List<SubmitJobsResponseBodyJobResultListJobResultJobOutputPropertiesStreamsSubtitleStreamListSubtitleStream> getSubtitleStream() {
            return this.subtitleStream;
        }

    }

    public static class SubmitJobsResponseBodyJobResultListJobResultJobOutputPropertiesStreamsVideoStreamListVideoStreamNetworkCost extends TeaModel {
        /**
         * <p>The average bitrate of the video stream.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("AvgBitrate")
        public String avgBitrate;

        /**
         * <p>The maximum bandwidth that was consumed.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("CostBandwidth")
        public String costBandwidth;

        /**
         * <p>The amount of time consumed to preload the video stream.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("PreloadTime")
        public String preloadTime;

        public static SubmitJobsResponseBodyJobResultListJobResultJobOutputPropertiesStreamsVideoStreamListVideoStreamNetworkCost build(java.util.Map<String, ?> map) throws Exception {
            SubmitJobsResponseBodyJobResultListJobResultJobOutputPropertiesStreamsVideoStreamListVideoStreamNetworkCost self = new SubmitJobsResponseBodyJobResultListJobResultJobOutputPropertiesStreamsVideoStreamListVideoStreamNetworkCost();
            return TeaModel.build(map, self);
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputPropertiesStreamsVideoStreamListVideoStreamNetworkCost setAvgBitrate(String avgBitrate) {
            this.avgBitrate = avgBitrate;
            return this;
        }
        public String getAvgBitrate() {
            return this.avgBitrate;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputPropertiesStreamsVideoStreamListVideoStreamNetworkCost setCostBandwidth(String costBandwidth) {
            this.costBandwidth = costBandwidth;
            return this;
        }
        public String getCostBandwidth() {
            return this.costBandwidth;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputPropertiesStreamsVideoStreamListVideoStreamNetworkCost setPreloadTime(String preloadTime) {
            this.preloadTime = preloadTime;
            return this;
        }
        public String getPreloadTime() {
            return this.preloadTime;
        }

    }

    public static class SubmitJobsResponseBodyJobResultListJobResultJobOutputPropertiesStreamsVideoStreamListVideoStream extends TeaModel {
        /**
         * <p>The average frame rate of the video stream.</p>
         * 
         * <strong>example:</strong>
         * <p>23.976025</p>
         */
        @NameInMap("AvgFPS")
        public String avgFPS;

        /**
         * <p>The bitrate of the video stream.</p>
         * 
         * <strong>example:</strong>
         * <p>1496.46</p>
         */
        @NameInMap("Bitrate")
        public String bitrate;

        /**
         * <p>The full name of the codec.</p>
         * 
         * <strong>example:</strong>
         * <p>H.264 / AVC / MPEG-4 AVC / MPEG-4 part 10</p>
         */
        @NameInMap("CodecLongName")
        public String codecLongName;

        /**
         * <p>The short name of the codec.</p>
         * 
         * <strong>example:</strong>
         * <p>h264</p>
         */
        @NameInMap("CodecName")
        public String codecName;

        /**
         * <p>The tag of the codec.</p>
         * 
         * <strong>example:</strong>
         * <p>0x31637661</p>
         */
        @NameInMap("CodecTag")
        public String codecTag;

        /**
         * <p>The tag string of the codec.</p>
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
         * <p>The display aspect ratio (DAR) of the video stream.</p>
         * 
         * <strong>example:</strong>
         * <p>16:9</p>
         */
        @NameInMap("Dar")
        public String dar;

        /**
         * <p>The duration of the video stream.</p>
         * 
         * <strong>example:</strong>
         * <p>17.225542</p>
         */
        @NameInMap("Duration")
        public String duration;

        /**
         * <p>The frame rate of the video stream.</p>
         * 
         * <strong>example:</strong>
         * <p>23.976025</p>
         */
        @NameInMap("Fps")
        public String fps;

        /**
         * <p>Indicates whether the video stream contains B-frames.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("HasBFrames")
        public String hasBFrames;

        /**
         * <p>The height of the video stream in pixels.</p>
         * 
         * <strong>example:</strong>
         * <p>720</p>
         */
        @NameInMap("Height")
        public String height;

        /**
         * <p>The sequence number of the video stream. The value indicates the position of the video stream in all video streams.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Index")
        public String index;

        /**
         * <p>The language of the video stream. For more information, see <a href="https://www.ffmpeg.org/ffmpeg-all.html#Metadata">FFmpeg documentation</a> and <a href="https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes">ISO 639</a>.</p>
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
         * <p>51</p>
         */
        @NameInMap("Level")
        public String level;

        /**
         * <p>The network bandwidth that was consumed.</p>
         */
        @NameInMap("NetworkCost")
        public SubmitJobsResponseBodyJobResultListJobResultJobOutputPropertiesStreamsVideoStreamListVideoStreamNetworkCost networkCost;

        /**
         * <p>The total number of frames.</p>
         * 
         * <strong>example:</strong>
         * <p>25</p>
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
         * <p>high</p>
         */
        @NameInMap("Profile")
        public String profile;

        /**
         * <p>The sample aspect ratio (SAR) of the video stream.</p>
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
         * <p>0.000000</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The time base of the video stream.</p>
         * 
         * <strong>example:</strong>
         * <p>1/24000</p>
         */
        @NameInMap("Timebase")
        public String timebase;

        /**
         * <p>The width of the video stream in pixels.</p>
         * 
         * <strong>example:</strong>
         * <p>1280</p>
         */
        @NameInMap("Width")
        public String width;

        public static SubmitJobsResponseBodyJobResultListJobResultJobOutputPropertiesStreamsVideoStreamListVideoStream build(java.util.Map<String, ?> map) throws Exception {
            SubmitJobsResponseBodyJobResultListJobResultJobOutputPropertiesStreamsVideoStreamListVideoStream self = new SubmitJobsResponseBodyJobResultListJobResultJobOutputPropertiesStreamsVideoStreamListVideoStream();
            return TeaModel.build(map, self);
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputPropertiesStreamsVideoStreamListVideoStream setAvgFPS(String avgFPS) {
            this.avgFPS = avgFPS;
            return this;
        }
        public String getAvgFPS() {
            return this.avgFPS;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputPropertiesStreamsVideoStreamListVideoStream setBitrate(String bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public String getBitrate() {
            return this.bitrate;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputPropertiesStreamsVideoStreamListVideoStream setCodecLongName(String codecLongName) {
            this.codecLongName = codecLongName;
            return this;
        }
        public String getCodecLongName() {
            return this.codecLongName;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputPropertiesStreamsVideoStreamListVideoStream setCodecName(String codecName) {
            this.codecName = codecName;
            return this;
        }
        public String getCodecName() {
            return this.codecName;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputPropertiesStreamsVideoStreamListVideoStream setCodecTag(String codecTag) {
            this.codecTag = codecTag;
            return this;
        }
        public String getCodecTag() {
            return this.codecTag;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputPropertiesStreamsVideoStreamListVideoStream setCodecTagString(String codecTagString) {
            this.codecTagString = codecTagString;
            return this;
        }
        public String getCodecTagString() {
            return this.codecTagString;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputPropertiesStreamsVideoStreamListVideoStream setCodecTimeBase(String codecTimeBase) {
            this.codecTimeBase = codecTimeBase;
            return this;
        }
        public String getCodecTimeBase() {
            return this.codecTimeBase;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputPropertiesStreamsVideoStreamListVideoStream setDar(String dar) {
            this.dar = dar;
            return this;
        }
        public String getDar() {
            return this.dar;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputPropertiesStreamsVideoStreamListVideoStream setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputPropertiesStreamsVideoStreamListVideoStream setFps(String fps) {
            this.fps = fps;
            return this;
        }
        public String getFps() {
            return this.fps;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputPropertiesStreamsVideoStreamListVideoStream setHasBFrames(String hasBFrames) {
            this.hasBFrames = hasBFrames;
            return this;
        }
        public String getHasBFrames() {
            return this.hasBFrames;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputPropertiesStreamsVideoStreamListVideoStream setHeight(String height) {
            this.height = height;
            return this;
        }
        public String getHeight() {
            return this.height;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputPropertiesStreamsVideoStreamListVideoStream setIndex(String index) {
            this.index = index;
            return this;
        }
        public String getIndex() {
            return this.index;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputPropertiesStreamsVideoStreamListVideoStream setLang(String lang) {
            this.lang = lang;
            return this;
        }
        public String getLang() {
            return this.lang;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputPropertiesStreamsVideoStreamListVideoStream setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputPropertiesStreamsVideoStreamListVideoStream setNetworkCost(SubmitJobsResponseBodyJobResultListJobResultJobOutputPropertiesStreamsVideoStreamListVideoStreamNetworkCost networkCost) {
            this.networkCost = networkCost;
            return this;
        }
        public SubmitJobsResponseBodyJobResultListJobResultJobOutputPropertiesStreamsVideoStreamListVideoStreamNetworkCost getNetworkCost() {
            return this.networkCost;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputPropertiesStreamsVideoStreamListVideoStream setNumFrames(String numFrames) {
            this.numFrames = numFrames;
            return this;
        }
        public String getNumFrames() {
            return this.numFrames;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputPropertiesStreamsVideoStreamListVideoStream setPixFmt(String pixFmt) {
            this.pixFmt = pixFmt;
            return this;
        }
        public String getPixFmt() {
            return this.pixFmt;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputPropertiesStreamsVideoStreamListVideoStream setProfile(String profile) {
            this.profile = profile;
            return this;
        }
        public String getProfile() {
            return this.profile;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputPropertiesStreamsVideoStreamListVideoStream setSar(String sar) {
            this.sar = sar;
            return this;
        }
        public String getSar() {
            return this.sar;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputPropertiesStreamsVideoStreamListVideoStream setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputPropertiesStreamsVideoStreamListVideoStream setTimebase(String timebase) {
            this.timebase = timebase;
            return this;
        }
        public String getTimebase() {
            return this.timebase;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputPropertiesStreamsVideoStreamListVideoStream setWidth(String width) {
            this.width = width;
            return this;
        }
        public String getWidth() {
            return this.width;
        }

    }

    public static class SubmitJobsResponseBodyJobResultListJobResultJobOutputPropertiesStreamsVideoStreamList extends TeaModel {
        @NameInMap("VideoStream")
        public java.util.List<SubmitJobsResponseBodyJobResultListJobResultJobOutputPropertiesStreamsVideoStreamListVideoStream> videoStream;

        public static SubmitJobsResponseBodyJobResultListJobResultJobOutputPropertiesStreamsVideoStreamList build(java.util.Map<String, ?> map) throws Exception {
            SubmitJobsResponseBodyJobResultListJobResultJobOutputPropertiesStreamsVideoStreamList self = new SubmitJobsResponseBodyJobResultListJobResultJobOutputPropertiesStreamsVideoStreamList();
            return TeaModel.build(map, self);
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputPropertiesStreamsVideoStreamList setVideoStream(java.util.List<SubmitJobsResponseBodyJobResultListJobResultJobOutputPropertiesStreamsVideoStreamListVideoStream> videoStream) {
            this.videoStream = videoStream;
            return this;
        }
        public java.util.List<SubmitJobsResponseBodyJobResultListJobResultJobOutputPropertiesStreamsVideoStreamListVideoStream> getVideoStream() {
            return this.videoStream;
        }

    }

    public static class SubmitJobsResponseBodyJobResultListJobResultJobOutputPropertiesStreams extends TeaModel {
        /**
         * <p>The audio streams.</p>
         */
        @NameInMap("AudioStreamList")
        public SubmitJobsResponseBodyJobResultListJobResultJobOutputPropertiesStreamsAudioStreamList audioStreamList;

        /**
         * <p>The subtitle streams.</p>
         */
        @NameInMap("SubtitleStreamList")
        public SubmitJobsResponseBodyJobResultListJobResultJobOutputPropertiesStreamsSubtitleStreamList subtitleStreamList;

        /**
         * <p>The video streams.</p>
         */
        @NameInMap("VideoStreamList")
        public SubmitJobsResponseBodyJobResultListJobResultJobOutputPropertiesStreamsVideoStreamList videoStreamList;

        public static SubmitJobsResponseBodyJobResultListJobResultJobOutputPropertiesStreams build(java.util.Map<String, ?> map) throws Exception {
            SubmitJobsResponseBodyJobResultListJobResultJobOutputPropertiesStreams self = new SubmitJobsResponseBodyJobResultListJobResultJobOutputPropertiesStreams();
            return TeaModel.build(map, self);
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputPropertiesStreams setAudioStreamList(SubmitJobsResponseBodyJobResultListJobResultJobOutputPropertiesStreamsAudioStreamList audioStreamList) {
            this.audioStreamList = audioStreamList;
            return this;
        }
        public SubmitJobsResponseBodyJobResultListJobResultJobOutputPropertiesStreamsAudioStreamList getAudioStreamList() {
            return this.audioStreamList;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputPropertiesStreams setSubtitleStreamList(SubmitJobsResponseBodyJobResultListJobResultJobOutputPropertiesStreamsSubtitleStreamList subtitleStreamList) {
            this.subtitleStreamList = subtitleStreamList;
            return this;
        }
        public SubmitJobsResponseBodyJobResultListJobResultJobOutputPropertiesStreamsSubtitleStreamList getSubtitleStreamList() {
            return this.subtitleStreamList;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputPropertiesStreams setVideoStreamList(SubmitJobsResponseBodyJobResultListJobResultJobOutputPropertiesStreamsVideoStreamList videoStreamList) {
            this.videoStreamList = videoStreamList;
            return this;
        }
        public SubmitJobsResponseBodyJobResultListJobResultJobOutputPropertiesStreamsVideoStreamList getVideoStreamList() {
            return this.videoStreamList;
        }

    }

    public static class SubmitJobsResponseBodyJobResultListJobResultJobOutputProperties extends TeaModel {
        /**
         * <p>The bitrate of the video.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("Bitrate")
        public String bitrate;

        /**
         * <p>The duration of the video.</p>
         * 
         * <strong>example:</strong>
         * <p>55</p>
         */
        @NameInMap("Duration")
        public String duration;

        /**
         * <p>The format of the video.</p>
         * 
         * <strong>example:</strong>
         * <p>QuickTime / MOV</p>
         */
        @NameInMap("FileFormat")
        public String fileFormat;

        /**
         * <p>The size of the file.</p>
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
        public SubmitJobsResponseBodyJobResultListJobResultJobOutputPropertiesFormat format;

        /**
         * <p>The frame rate of the video. The value is a number.</p>
         * 
         * <strong>example:</strong>
         * <p>25</p>
         */
        @NameInMap("Fps")
        public String fps;

        /**
         * <p>The height of the video.</p>
         * 
         * <strong>example:</strong>
         * <p>720</p>
         */
        @NameInMap("Height")
        public String height;

        /**
         * <p>The stream information.</p>
         */
        @NameInMap("Streams")
        public SubmitJobsResponseBodyJobResultListJobResultJobOutputPropertiesStreams streams;

        /**
         * <p>The width of the video.</p>
         * 
         * <strong>example:</strong>
         * <p>1280</p>
         */
        @NameInMap("Width")
        public String width;

        public static SubmitJobsResponseBodyJobResultListJobResultJobOutputProperties build(java.util.Map<String, ?> map) throws Exception {
            SubmitJobsResponseBodyJobResultListJobResultJobOutputProperties self = new SubmitJobsResponseBodyJobResultListJobResultJobOutputProperties();
            return TeaModel.build(map, self);
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputProperties setBitrate(String bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public String getBitrate() {
            return this.bitrate;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputProperties setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputProperties setFileFormat(String fileFormat) {
            this.fileFormat = fileFormat;
            return this;
        }
        public String getFileFormat() {
            return this.fileFormat;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputProperties setFileSize(String fileSize) {
            this.fileSize = fileSize;
            return this;
        }
        public String getFileSize() {
            return this.fileSize;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputProperties setFormat(SubmitJobsResponseBodyJobResultListJobResultJobOutputPropertiesFormat format) {
            this.format = format;
            return this;
        }
        public SubmitJobsResponseBodyJobResultListJobResultJobOutputPropertiesFormat getFormat() {
            return this.format;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputProperties setFps(String fps) {
            this.fps = fps;
            return this;
        }
        public String getFps() {
            return this.fps;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputProperties setHeight(String height) {
            this.height = height;
            return this;
        }
        public String getHeight() {
            return this.height;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputProperties setStreams(SubmitJobsResponseBodyJobResultListJobResultJobOutputPropertiesStreams streams) {
            this.streams = streams;
            return this;
        }
        public SubmitJobsResponseBodyJobResultListJobResultJobOutputPropertiesStreams getStreams() {
            return this.streams;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputProperties setWidth(String width) {
            this.width = width;
            return this;
        }
        public String getWidth() {
            return this.width;
        }

    }

    public static class SubmitJobsResponseBodyJobResultListJobResultJobOutputSubtitleConfigExtSubtitleListExtSubtitleInput extends TeaModel {
        /**
         * <p>The name of the OSS bucket in which the input file is stored.</p>
         * 
         * <strong>example:</strong>
         * <p>example-bucket-****</p>
         */
        @NameInMap("Bucket")
        public String bucket;

        /**
         * <p>The ID of the OSS region in which the input file is stored.</p>
         * 
         * <strong>example:</strong>
         * <p>oss-cn-hangzhou</p>
         */
        @NameInMap("Location")
        public String location;

        /**
         * <p>The name of the OSS object that is used as the input file.</p>
         * 
         * <strong>example:</strong>
         * <p>example-output.flv</p>
         */
        @NameInMap("Object")
        public String object;

        public static SubmitJobsResponseBodyJobResultListJobResultJobOutputSubtitleConfigExtSubtitleListExtSubtitleInput build(java.util.Map<String, ?> map) throws Exception {
            SubmitJobsResponseBodyJobResultListJobResultJobOutputSubtitleConfigExtSubtitleListExtSubtitleInput self = new SubmitJobsResponseBodyJobResultListJobResultJobOutputSubtitleConfigExtSubtitleListExtSubtitleInput();
            return TeaModel.build(map, self);
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputSubtitleConfigExtSubtitleListExtSubtitleInput setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputSubtitleConfigExtSubtitleListExtSubtitleInput setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputSubtitleConfigExtSubtitleListExtSubtitleInput setObject(String object) {
            this.object = object;
            return this;
        }
        public String getObject() {
            return this.object;
        }

    }

    public static class SubmitJobsResponseBodyJobResultListJobResultJobOutputSubtitleConfigExtSubtitleListExtSubtitle extends TeaModel {
        /**
         * <p>The character set used by the external subtitle.</p>
         * <ul>
         * <li>Valid values: <strong>UTF-8</strong>, <strong>GBK</strong>, <strong>BIG5</strong>, and <strong>auto</strong>.</li>
         * <li>Default value: <strong>auto</strong>.</li>
         * </ul>
         * <blockquote>
         * <p> If this parameter is set to <strong>auto</strong>, the detected character set may not be the actual character set. We recommend that you set this parameter to another value.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>UTF-8</p>
         */
        @NameInMap("CharEnc")
        public String charEnc;

        /**
         * <p>The font of the hardcoded subtitles converted from external subtitles. Default value: <strong>SimSun</strong>. For more information, see <a href="https://help.aliyun.com/document_detail/59950.html">Fonts</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;WenQuanYi Zen Hei&quot;, &quot;Yuanti SC Regular&quot;, &quot;SimSun&quot;</p>
         */
        @NameInMap("FontName")
        public String fontName;

        /**
         * <p>The OSS object that is used as the external subtitle. The value is a JSON object. Files in the <strong>SRT</strong> or <strong>ASS</strong> format are supported.</p>
         */
        @NameInMap("Input")
        public SubmitJobsResponseBodyJobResultListJobResultJobOutputSubtitleConfigExtSubtitleListExtSubtitleInput input;

        public static SubmitJobsResponseBodyJobResultListJobResultJobOutputSubtitleConfigExtSubtitleListExtSubtitle build(java.util.Map<String, ?> map) throws Exception {
            SubmitJobsResponseBodyJobResultListJobResultJobOutputSubtitleConfigExtSubtitleListExtSubtitle self = new SubmitJobsResponseBodyJobResultListJobResultJobOutputSubtitleConfigExtSubtitleListExtSubtitle();
            return TeaModel.build(map, self);
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputSubtitleConfigExtSubtitleListExtSubtitle setCharEnc(String charEnc) {
            this.charEnc = charEnc;
            return this;
        }
        public String getCharEnc() {
            return this.charEnc;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputSubtitleConfigExtSubtitleListExtSubtitle setFontName(String fontName) {
            this.fontName = fontName;
            return this;
        }
        public String getFontName() {
            return this.fontName;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputSubtitleConfigExtSubtitleListExtSubtitle setInput(SubmitJobsResponseBodyJobResultListJobResultJobOutputSubtitleConfigExtSubtitleListExtSubtitleInput input) {
            this.input = input;
            return this;
        }
        public SubmitJobsResponseBodyJobResultListJobResultJobOutputSubtitleConfigExtSubtitleListExtSubtitleInput getInput() {
            return this.input;
        }

    }

    public static class SubmitJobsResponseBodyJobResultListJobResultJobOutputSubtitleConfigExtSubtitleList extends TeaModel {
        @NameInMap("ExtSubtitle")
        public java.util.List<SubmitJobsResponseBodyJobResultListJobResultJobOutputSubtitleConfigExtSubtitleListExtSubtitle> extSubtitle;

        public static SubmitJobsResponseBodyJobResultListJobResultJobOutputSubtitleConfigExtSubtitleList build(java.util.Map<String, ?> map) throws Exception {
            SubmitJobsResponseBodyJobResultListJobResultJobOutputSubtitleConfigExtSubtitleList self = new SubmitJobsResponseBodyJobResultListJobResultJobOutputSubtitleConfigExtSubtitleList();
            return TeaModel.build(map, self);
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputSubtitleConfigExtSubtitleList setExtSubtitle(java.util.List<SubmitJobsResponseBodyJobResultListJobResultJobOutputSubtitleConfigExtSubtitleListExtSubtitle> extSubtitle) {
            this.extSubtitle = extSubtitle;
            return this;
        }
        public java.util.List<SubmitJobsResponseBodyJobResultListJobResultJobOutputSubtitleConfigExtSubtitleListExtSubtitle> getExtSubtitle() {
            return this.extSubtitle;
        }

    }

    public static class SubmitJobsResponseBodyJobResultListJobResultJobOutputSubtitleConfigSubtitleListSubtitle extends TeaModel {
        /**
         * <p>The audio track. Format: <code>0:{Stream}:{Stream sequence number}</code>, which is <code>0:a:{audio_index}</code>. The value of Stream is a, which indicates an audio stream. The sequence number is the index of the audio stream in the list and starts from 0.</p>
         * 
         * <strong>example:</strong>
         * <p>0:a:0</p>
         */
        @NameInMap("Map")
        public String map;

        public static SubmitJobsResponseBodyJobResultListJobResultJobOutputSubtitleConfigSubtitleListSubtitle build(java.util.Map<String, ?> map) throws Exception {
            SubmitJobsResponseBodyJobResultListJobResultJobOutputSubtitleConfigSubtitleListSubtitle self = new SubmitJobsResponseBodyJobResultListJobResultJobOutputSubtitleConfigSubtitleListSubtitle();
            return TeaModel.build(map, self);
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputSubtitleConfigSubtitleListSubtitle setMap(String map) {
            this.map = map;
            return this;
        }
        public String getMap() {
            return this.map;
        }

    }

    public static class SubmitJobsResponseBodyJobResultListJobResultJobOutputSubtitleConfigSubtitleList extends TeaModel {
        @NameInMap("Subtitle")
        public java.util.List<SubmitJobsResponseBodyJobResultListJobResultJobOutputSubtitleConfigSubtitleListSubtitle> subtitle;

        public static SubmitJobsResponseBodyJobResultListJobResultJobOutputSubtitleConfigSubtitleList build(java.util.Map<String, ?> map) throws Exception {
            SubmitJobsResponseBodyJobResultListJobResultJobOutputSubtitleConfigSubtitleList self = new SubmitJobsResponseBodyJobResultListJobResultJobOutputSubtitleConfigSubtitleList();
            return TeaModel.build(map, self);
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputSubtitleConfigSubtitleList setSubtitle(java.util.List<SubmitJobsResponseBodyJobResultListJobResultJobOutputSubtitleConfigSubtitleListSubtitle> subtitle) {
            this.subtitle = subtitle;
            return this;
        }
        public java.util.List<SubmitJobsResponseBodyJobResultListJobResultJobOutputSubtitleConfigSubtitleListSubtitle> getSubtitle() {
            return this.subtitle;
        }

    }

    public static class SubmitJobsResponseBodyJobResultListJobResultJobOutputSubtitleConfig extends TeaModel {
        /**
         * <p>The external subtitles. The value is a JSON array that contains up to <strong>four</strong> objects.</p>
         */
        @NameInMap("ExtSubtitleList")
        public SubmitJobsResponseBodyJobResultListJobResultJobOutputSubtitleConfigExtSubtitleList extSubtitleList;

        /**
         * <p>The subtitles.</p>
         */
        @NameInMap("SubtitleList")
        public SubmitJobsResponseBodyJobResultListJobResultJobOutputSubtitleConfigSubtitleList subtitleList;

        public static SubmitJobsResponseBodyJobResultListJobResultJobOutputSubtitleConfig build(java.util.Map<String, ?> map) throws Exception {
            SubmitJobsResponseBodyJobResultListJobResultJobOutputSubtitleConfig self = new SubmitJobsResponseBodyJobResultListJobResultJobOutputSubtitleConfig();
            return TeaModel.build(map, self);
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputSubtitleConfig setExtSubtitleList(SubmitJobsResponseBodyJobResultListJobResultJobOutputSubtitleConfigExtSubtitleList extSubtitleList) {
            this.extSubtitleList = extSubtitleList;
            return this;
        }
        public SubmitJobsResponseBodyJobResultListJobResultJobOutputSubtitleConfigExtSubtitleList getExtSubtitleList() {
            return this.extSubtitleList;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputSubtitleConfig setSubtitleList(SubmitJobsResponseBodyJobResultListJobResultJobOutputSubtitleConfigSubtitleList subtitleList) {
            this.subtitleList = subtitleList;
            return this;
        }
        public SubmitJobsResponseBodyJobResultListJobResultJobOutputSubtitleConfigSubtitleList getSubtitleList() {
            return this.subtitleList;
        }

    }

    public static class SubmitJobsResponseBodyJobResultListJobResultJobOutputSuperReso extends TeaModel {
        /**
         * <p>Indicates whether parameters related to the sampling rate are obtained. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsHalfSample")
        public String isHalfSample;

        public static SubmitJobsResponseBodyJobResultListJobResultJobOutputSuperReso build(java.util.Map<String, ?> map) throws Exception {
            SubmitJobsResponseBodyJobResultListJobResultJobOutputSuperReso self = new SubmitJobsResponseBodyJobResultListJobResultJobOutputSuperReso();
            return TeaModel.build(map, self);
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputSuperReso setIsHalfSample(String isHalfSample) {
            this.isHalfSample = isHalfSample;
            return this;
        }
        public String getIsHalfSample() {
            return this.isHalfSample;
        }

    }

    public static class SubmitJobsResponseBodyJobResultListJobResultJobOutputTailSlateListTailSlate extends TeaModel {
        /**
         * <p>The color of the bars that are added to the ending part if the size of the ending part is smaller than that of the main part. Default value: <strong>White</strong>. For more information, see <a href="https://docs-aliyun.cn-hangzhou.oss.aliyun-inc.com/assets/attach/29253/cn_zh/1502784952344/color.txt?spm=a2c4g.11186623.2.63.241240f77qp3Yy%5C&file=color.txt">Background colors</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>White</p>
         */
        @NameInMap("BgColor")
        public String bgColor;

        /**
         * <p>The duration of the transition between the main part and the ending part. A fade transition is used: The last frame of the main part fades out, and the first frame of the ending part fades in. Unit: seconds. Default value: <strong>0</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("BlendDuration")
        public String blendDuration;

        /**
         * <p>The height of the ending part.</p>
         * <ul>
         * <li>Valid values: values in the range of <strong>(0,4096)</strong>, <strong>-1</strong>, and <strong>full</strong>.</li>
         * <li>A value of <strong>-1</strong> indicates that the height of the source of the ending part is retained. A value of <strong>full</strong> indicates that the height of the main part is used for the ending part.</li>
         * <li>Default value: -1.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1080</p>
         */
        @NameInMap("Height")
        public String height;

        /**
         * <p>Indicates whether the audio content of the ending part is merged. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsMergeAudio")
        public Boolean isMergeAudio;

        /**
         * <p>The start time.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Start")
        public String start;

        /**
         * <p>The OSS URL of the ending part.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://example-bucket-****.oss-cn-hangzhou.aliyuncs.com/opening_01.flv">http://example-bucket-****.oss-cn-hangzhou.aliyuncs.com/opening_01.flv</a></p>
         */
        @NameInMap("TailUrl")
        public String tailUrl;

        /**
         * <p>The width of the ending part.</p>
         * <ul>
         * <li>Valid values: values in the range of <strong>(0,4096)</strong>, <strong>-1</strong>, and <strong>full</strong>.</li>
         * <li>A value of <strong>-1</strong> indicates that the width of the source of the ending part is retained. A value of <strong>full</strong> indicates that the width of the main part is used for the ending part.</li>
         * <li>Default value: -1.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1920</p>
         */
        @NameInMap("Width")
        public String width;

        public static SubmitJobsResponseBodyJobResultListJobResultJobOutputTailSlateListTailSlate build(java.util.Map<String, ?> map) throws Exception {
            SubmitJobsResponseBodyJobResultListJobResultJobOutputTailSlateListTailSlate self = new SubmitJobsResponseBodyJobResultListJobResultJobOutputTailSlateListTailSlate();
            return TeaModel.build(map, self);
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputTailSlateListTailSlate setBgColor(String bgColor) {
            this.bgColor = bgColor;
            return this;
        }
        public String getBgColor() {
            return this.bgColor;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputTailSlateListTailSlate setBlendDuration(String blendDuration) {
            this.blendDuration = blendDuration;
            return this;
        }
        public String getBlendDuration() {
            return this.blendDuration;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputTailSlateListTailSlate setHeight(String height) {
            this.height = height;
            return this;
        }
        public String getHeight() {
            return this.height;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputTailSlateListTailSlate setIsMergeAudio(Boolean isMergeAudio) {
            this.isMergeAudio = isMergeAudio;
            return this;
        }
        public Boolean getIsMergeAudio() {
            return this.isMergeAudio;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputTailSlateListTailSlate setStart(String start) {
            this.start = start;
            return this;
        }
        public String getStart() {
            return this.start;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputTailSlateListTailSlate setTailUrl(String tailUrl) {
            this.tailUrl = tailUrl;
            return this;
        }
        public String getTailUrl() {
            return this.tailUrl;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputTailSlateListTailSlate setWidth(String width) {
            this.width = width;
            return this;
        }
        public String getWidth() {
            return this.width;
        }

    }

    public static class SubmitJobsResponseBodyJobResultListJobResultJobOutputTailSlateList extends TeaModel {
        @NameInMap("TailSlate")
        public java.util.List<SubmitJobsResponseBodyJobResultListJobResultJobOutputTailSlateListTailSlate> tailSlate;

        public static SubmitJobsResponseBodyJobResultListJobResultJobOutputTailSlateList build(java.util.Map<String, ?> map) throws Exception {
            SubmitJobsResponseBodyJobResultListJobResultJobOutputTailSlateList self = new SubmitJobsResponseBodyJobResultListJobResultJobOutputTailSlateList();
            return TeaModel.build(map, self);
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputTailSlateList setTailSlate(java.util.List<SubmitJobsResponseBodyJobResultListJobResultJobOutputTailSlateListTailSlate> tailSlate) {
            this.tailSlate = tailSlate;
            return this;
        }
        public java.util.List<SubmitJobsResponseBodyJobResultListJobResultJobOutputTailSlateListTailSlate> getTailSlate() {
            return this.tailSlate;
        }

    }

    public static class SubmitJobsResponseBodyJobResultListJobResultJobOutputTransConfig extends TeaModel {
        /**
         * <p>The method of resolution adjustment. Default value: <strong>none</strong>. Valid values:</p>
         * <ul>
         * <li>rescale: The video image is resized.</li>
         * <li>crop: The video image is cropped.</li>
         * <li>pad: The video image is scaled out to fill the view.</li>
         * <li>none: The resolution is not adjusted.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>crop</p>
         */
        @NameInMap("AdjDarMethod")
        public String adjDarMethod;

        /**
         * <p>Indicates whether the audio bitrate is checked. If the bitrate of the output audio is higher than that of the input audio, the input bitrate is retained and the specified audio bitrate does not take effect. This parameter has a lower priority than IsCheckAudioBitrateFail. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong></p>
         * </li>
         * <li><p><strong>false</strong></p>
         * </li>
         * <li><p>Default value:</p>
         * <ul>
         * <li>If this parameter is empty and the codec of the output audio is different from the codec of the input audio, the default value is false.</li>
         * <li>If this parameter is empty and the codec of the output audio is the same as the codec of the input audio, the default value is true.</li>
         * </ul>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsCheckAudioBitrate")
        public String isCheckAudioBitrate;

        /**
         * <p>Indicates whether the audio bitrate is checked. This parameter has a higher priority than <strong>IsCheckAudioBitrate</strong>. If the bitrate of the output audio is higher than that of the input audio, a transcoding failure is returned without transcoding the audio. Valid values:</p>
         * <ul>
         * <li><strong>false</strong></li>
         * <li><strong>true</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsCheckAudioBitrateFail")
        public String isCheckAudioBitrateFail;

        /**
         * <p>Indicates whether the resolution is checked. If the output resolution is higher than the input resolution based on the width or height, the input resolution is retained. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * <li>Default value: <strong>false</strong>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsCheckReso")
        public String isCheckReso;

        /**
         * <p>Indicates whether the resolution is checked. This parameter has a higher priority than IsCheckReso. If the output resolution is higher than the input resolution based on the width or height, a transcoding failure is returned without transcoding the video. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * <li>Default value: <strong>false</strong>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsCheckResoFail")
        public String isCheckResoFail;

        /**
         * <p>Indicates whether the video bitrate is checked. If the bitrate of the output video is higher than that of the input video, the input bitrate is retained. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * <li>Default value: <strong>false</strong>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsCheckVideoBitrate")
        public String isCheckVideoBitrate;

        /**
         * <p>Indicates whether the video bitrate is checked. If the bitrate of the output video is higher than that of the input video, a transcoding failure is returned without transcoding the video. This parameter has a higher priority than<strong>IsCheckVideoBitrate</strong>. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * <li>Default value: <strong>false</strong>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsCheckVideoBitrateFail")
        public String isCheckVideoBitrateFail;

        /**
         * <p>The transcoding mode. Valid values:</p>
         * <ul>
         * <li><strong>onepass</strong>: transcoding based on one-pass algorithms, which has higher accuracy.</li>
         * <li><strong>twopass</strong>: transcoding based on two-pass algorithms, which has lower accuracy.</li>
         * <li><strong>CBR</strong>: transcoding based on a fixed bitrate.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>onepass</p>
         */
        @NameInMap("TransMode")
        public String transMode;

        public static SubmitJobsResponseBodyJobResultListJobResultJobOutputTransConfig build(java.util.Map<String, ?> map) throws Exception {
            SubmitJobsResponseBodyJobResultListJobResultJobOutputTransConfig self = new SubmitJobsResponseBodyJobResultListJobResultJobOutputTransConfig();
            return TeaModel.build(map, self);
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputTransConfig setAdjDarMethod(String adjDarMethod) {
            this.adjDarMethod = adjDarMethod;
            return this;
        }
        public String getAdjDarMethod() {
            return this.adjDarMethod;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputTransConfig setIsCheckAudioBitrate(String isCheckAudioBitrate) {
            this.isCheckAudioBitrate = isCheckAudioBitrate;
            return this;
        }
        public String getIsCheckAudioBitrate() {
            return this.isCheckAudioBitrate;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputTransConfig setIsCheckAudioBitrateFail(String isCheckAudioBitrateFail) {
            this.isCheckAudioBitrateFail = isCheckAudioBitrateFail;
            return this;
        }
        public String getIsCheckAudioBitrateFail() {
            return this.isCheckAudioBitrateFail;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputTransConfig setIsCheckReso(String isCheckReso) {
            this.isCheckReso = isCheckReso;
            return this;
        }
        public String getIsCheckReso() {
            return this.isCheckReso;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputTransConfig setIsCheckResoFail(String isCheckResoFail) {
            this.isCheckResoFail = isCheckResoFail;
            return this;
        }
        public String getIsCheckResoFail() {
            return this.isCheckResoFail;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputTransConfig setIsCheckVideoBitrate(String isCheckVideoBitrate) {
            this.isCheckVideoBitrate = isCheckVideoBitrate;
            return this;
        }
        public String getIsCheckVideoBitrate() {
            return this.isCheckVideoBitrate;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputTransConfig setIsCheckVideoBitrateFail(String isCheckVideoBitrateFail) {
            this.isCheckVideoBitrateFail = isCheckVideoBitrateFail;
            return this;
        }
        public String getIsCheckVideoBitrateFail() {
            return this.isCheckVideoBitrateFail;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputTransConfig setTransMode(String transMode) {
            this.transMode = transMode;
            return this;
        }
        public String getTransMode() {
            return this.transMode;
        }

    }

    public static class SubmitJobsResponseBodyJobResultListJobResultJobOutputVideoBitrateBnd extends TeaModel {
        /**
         * <p>The upper limit of the total bitrate. Unit: Kbit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("Max")
        public String max;

        /**
         * <p>The lower limit of the total bitrate. Unit: Kbit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Min")
        public String min;

        public static SubmitJobsResponseBodyJobResultListJobResultJobOutputVideoBitrateBnd build(java.util.Map<String, ?> map) throws Exception {
            SubmitJobsResponseBodyJobResultListJobResultJobOutputVideoBitrateBnd self = new SubmitJobsResponseBodyJobResultListJobResultJobOutputVideoBitrateBnd();
            return TeaModel.build(map, self);
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputVideoBitrateBnd setMax(String max) {
            this.max = max;
            return this;
        }
        public String getMax() {
            return this.max;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputVideoBitrateBnd setMin(String min) {
            this.min = min;
            return this;
        }
        public String getMin() {
            return this.min;
        }

    }

    public static class SubmitJobsResponseBodyJobResultListJobResultJobOutputVideo extends TeaModel {
        /**
         * <p>The bitrate of the output video. Unit: Kbit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Bitrate")
        public String bitrate;

        /**
         * <p>The average bitrate range of the video.</p>
         */
        @NameInMap("BitrateBnd")
        public SubmitJobsResponseBodyJobResultListJobResultJobOutputVideoBitrateBnd bitrateBnd;

        /**
         * <p>The size of the buffer.</p>
         * <ul>
         * <li>Unit: KB.</li>
         * <li>Default value: <strong>6000</strong>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("Bufsize")
        public String bufsize;

        /**
         * <p>The video codec.</p>
         * <ul>
         * <li>Valid values: <strong>H.264</strong>, <strong>H.265</strong>, <strong>GIF</strong>, and <strong>WEBP</strong>.</li>
         * <li>Default value: <strong>H.264</strong>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>H.264</p>
         */
        @NameInMap("Codec")
        public String codec;

        /**
         * <p>The constant rate factor.</p>
         * <ul>
         * <li>If <strong>Crf</strong> is returned, the value of <strong>Bitrate</strong> is invalid.</li>
         * <li>Default value if the value of Codec is H.264: <strong>23</strong>. Default value if the value of Codec is H.265: <strong>26</strong>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>22</p>
         */
        @NameInMap("Crf")
        public String crf;

        /**
         * <p>The method of video cropping. Valid values:</p>
         * <ul>
         * <li><strong>border</strong>: Black borders are automatically detected and removed.</li>
         * <li>A value in the format of width:height:left:top: The video is cropped based on the custom settings.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1280:800:0:140</p>
         */
        @NameInMap("Crop")
        public String crop;

        /**
         * <p>The strength of the independent noise reduction algorithm.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("Degrain")
        public String degrain;

        /**
         * <p>The frame rate.</p>
         * <ul>
         * <li>Unit: frames per second.</li>
         * <li>Valid values: 0 to 60. The value is 60 if the frame rate of the input file exceeds 60.</li>
         * <li>Default value: the frame rate of the input file.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("Fps")
        public String fps;

        /**
         * <p>The maximum interval between keyframes or the maximum number of frames in a frame group. Unit: seconds.</p>
         * <ul>
         * <li>Default value: 10.</li>
         * <li>If the maximum number of frames is returned, the value does not have a unit.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Gop")
        public String gop;

        /**
         * <p>The height of the video.</p>
         * <ul>
         * <li>Unit: pixel.</li>
         * <li>Default value: the height of the input video.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1280</p>
         */
        @NameInMap("Height")
        public String height;

        /**
         * <p>The maximum frame rate.</p>
         * 
         * <strong>example:</strong>
         * <p>15</p>
         */
        @NameInMap("MaxFps")
        public String maxFps;

        /**
         * <p>The maximum bitrate of the video. Unit: Kbit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Maxrate")
        public String maxrate;

        /**
         * <p>The black borders that are added to the video.</p>
         * <ul>
         * <li>The value is in the width:height:left:top format.</li>
         * <li>Unit: pixel.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1280:800:0:140</p>
         */
        @NameInMap("Pad")
        public String pad;

        /**
         * <p>The pixel format of the video.</p>
         * <ul>
         * <li><p>The default pixel format can be <strong>yuv420p</strong> or the pixel format of the input file.</p>
         * </li>
         * <li><p>Valid values: standard pixel formats such as <strong>yuv420p</strong> and <strong>yuvj420p</strong>.</p>
         * <p>**</p>
         * <p><strong>Note</strong> If a non-standard pixel format such as yuvj420p(pc, bt470bg/bt470bg/smpte170m) is used, compatibility with the pixel format must be configured. Otherwise, the transcoding job fails.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>yuvj420p</p>
         */
        @NameInMap("PixFmt")
        public String pixFmt;

        /**
         * <p>The preset video algorithm. Default value: <strong>medium</strong>. Valid values:</p>
         * <ul>
         * <li><strong>veryfast</strong></li>
         * <li><strong>fast</strong></li>
         * <li><strong>medium</strong></li>
         * <li><strong>slow</strong></li>
         * <li><strong>slower</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>veryfast</p>
         */
        @NameInMap("Preset")
        public String preset;

        /**
         * <p>The encoding profile. This parameter is returned only for the H.264 codec. Default value: <strong>high</strong>. Valid values:</p>
         * <blockquote>
         * <p> If multiple definitions are involved, we recommend that you use baseline for the lowest definition to ensure normal playback on low-definition devices, and use main or high for other definitions.</p>
         * </blockquote>
         * <ul>
         * <li><strong>baseline</strong>: applicable to mobile devices.</li>
         * <li><strong>main</strong>: applicable to standard-definition devices.</li>
         * <li><strong>high</strong>: applicable to high-definition devices.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>baseline</p>
         */
        @NameInMap("Profile")
        public String profile;

        /**
         * <p>The level of quality control on the video.</p>
         * 
         * <strong>example:</strong>
         * <p>15</p>
         */
        @NameInMap("Qscale")
        public String qscale;

        /**
         * <p>The priority of the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ResoPriority")
        public String resoPriority;

        /**
         * <p>The scan mode. Valid values:</p>
         * <ul>
         * <li>If this parameter is <strong>empty</strong>, the scan mode of the input file is used.</li>
         * <li><strong>auto</strong>: automatic deinterlacing.</li>
         * <li><strong>progressive</strong>: progressive scan.</li>
         * <li><strong>interlaced</strong>: interlaced scan.</li>
         * <li><strong>By default</strong>, this parameter is empty.</li>
         * </ul>
         * <p><strong>Best practice</strong>: Interlaced scan consumes less bandwidth than progressive scan, but the image quality is poor. Therefore, mainstream video production uses progressive scan.</p>
         * <ul>
         * <li>If <strong>progressive scan</strong> or <strong>interlaced scan</strong> is used when the scan mode of the input file is neither of them, the transcoding job fails.</li>
         * <li>We recommend that you use <strong>the scan mode of the input file</strong> or <strong>automatic deinterlacing</strong> to improve compatibility.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>interlaced</p>
         */
        @NameInMap("ScanMode")
        public String scanMode;

        /**
         * <p>The width of the video.</p>
         * <ul>
         * <li>Unit: pixel.</li>
         * <li>Default value: <strong>the width of the input video</strong>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1080</p>
         */
        @NameInMap("Width")
        public String width;

        public static SubmitJobsResponseBodyJobResultListJobResultJobOutputVideo build(java.util.Map<String, ?> map) throws Exception {
            SubmitJobsResponseBodyJobResultListJobResultJobOutputVideo self = new SubmitJobsResponseBodyJobResultListJobResultJobOutputVideo();
            return TeaModel.build(map, self);
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputVideo setBitrate(String bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public String getBitrate() {
            return this.bitrate;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputVideo setBitrateBnd(SubmitJobsResponseBodyJobResultListJobResultJobOutputVideoBitrateBnd bitrateBnd) {
            this.bitrateBnd = bitrateBnd;
            return this;
        }
        public SubmitJobsResponseBodyJobResultListJobResultJobOutputVideoBitrateBnd getBitrateBnd() {
            return this.bitrateBnd;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputVideo setBufsize(String bufsize) {
            this.bufsize = bufsize;
            return this;
        }
        public String getBufsize() {
            return this.bufsize;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputVideo setCodec(String codec) {
            this.codec = codec;
            return this;
        }
        public String getCodec() {
            return this.codec;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputVideo setCrf(String crf) {
            this.crf = crf;
            return this;
        }
        public String getCrf() {
            return this.crf;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputVideo setCrop(String crop) {
            this.crop = crop;
            return this;
        }
        public String getCrop() {
            return this.crop;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputVideo setDegrain(String degrain) {
            this.degrain = degrain;
            return this;
        }
        public String getDegrain() {
            return this.degrain;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputVideo setFps(String fps) {
            this.fps = fps;
            return this;
        }
        public String getFps() {
            return this.fps;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputVideo setGop(String gop) {
            this.gop = gop;
            return this;
        }
        public String getGop() {
            return this.gop;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputVideo setHeight(String height) {
            this.height = height;
            return this;
        }
        public String getHeight() {
            return this.height;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputVideo setMaxFps(String maxFps) {
            this.maxFps = maxFps;
            return this;
        }
        public String getMaxFps() {
            return this.maxFps;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputVideo setMaxrate(String maxrate) {
            this.maxrate = maxrate;
            return this;
        }
        public String getMaxrate() {
            return this.maxrate;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputVideo setPad(String pad) {
            this.pad = pad;
            return this;
        }
        public String getPad() {
            return this.pad;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputVideo setPixFmt(String pixFmt) {
            this.pixFmt = pixFmt;
            return this;
        }
        public String getPixFmt() {
            return this.pixFmt;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputVideo setPreset(String preset) {
            this.preset = preset;
            return this;
        }
        public String getPreset() {
            return this.preset;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputVideo setProfile(String profile) {
            this.profile = profile;
            return this;
        }
        public String getProfile() {
            return this.profile;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputVideo setQscale(String qscale) {
            this.qscale = qscale;
            return this;
        }
        public String getQscale() {
            return this.qscale;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputVideo setResoPriority(String resoPriority) {
            this.resoPriority = resoPriority;
            return this;
        }
        public String getResoPriority() {
            return this.resoPriority;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputVideo setScanMode(String scanMode) {
            this.scanMode = scanMode;
            return this;
        }
        public String getScanMode() {
            return this.scanMode;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputVideo setWidth(String width) {
            this.width = width;
            return this;
        }
        public String getWidth() {
            return this.width;
        }

    }

    public static class SubmitJobsResponseBodyJobResultListJobResultJobOutputWaterMarkListWaterMarkInputFile extends TeaModel {
        /**
         * <p>The name of the OSS bucket in which the input file is stored.</p>
         * 
         * <strong>example:</strong>
         * <p>example-bucket</p>
         */
        @NameInMap("Bucket")
        public String bucket;

        /**
         * <p>The ID of the OSS region in which the input file is stored.</p>
         * 
         * <strong>example:</strong>
         * <p>oss-cn-hangzhou</p>
         */
        @NameInMap("Location")
        public String location;

        /**
         * <p>The name of the OSS object that is used as the input file.</p>
         * 
         * <strong>example:</strong>
         * <p>example-logo-****.png</p>
         */
        @NameInMap("Object")
        public String object;

        public static SubmitJobsResponseBodyJobResultListJobResultJobOutputWaterMarkListWaterMarkInputFile build(java.util.Map<String, ?> map) throws Exception {
            SubmitJobsResponseBodyJobResultListJobResultJobOutputWaterMarkListWaterMarkInputFile self = new SubmitJobsResponseBodyJobResultListJobResultJobOutputWaterMarkListWaterMarkInputFile();
            return TeaModel.build(map, self);
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputWaterMarkListWaterMarkInputFile setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputWaterMarkListWaterMarkInputFile setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputWaterMarkListWaterMarkInputFile setObject(String object) {
            this.object = object;
            return this;
        }
        public String getObject() {
            return this.object;
        }

    }

    public static class SubmitJobsResponseBodyJobResultListJobResultJobOutputWaterMarkListWaterMark extends TeaModel {
        /**
         * <p>The horizontal offset of the watermark image relative to the output video. If this parameter is specified in the request, the corresponding parameter in the watermark template is overwritten. Default value: 0. The value can be an integer or a decimal number.</p>
         * <ul>
         * <li><p>An integer indicates the pixel value of the horizontal offset.</p>
         * <ul>
         * <li>Valid values: <strong>[8,4096]</strong>.</li>
         * <li>Unit: pixel.</li>
         * </ul>
         * </li>
         * <li><p>A decimal number indicates the ratio of the horizontal offset to the width in the output video resolution.</p>
         * <ul>
         * <li>Valid values: (0,1).</li>
         * <li>The decimal number can be accurate to four decimal places, such as 0.9999. Excess digits are automatically deleted.</li>
         * </ul>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Dx")
        public String dx;

        /**
         * <p>The vertical offset of the watermark image relative to the output video. If this parameter is specified in the request, the corresponding parameter in the watermark template is overwritten. The value can be an integer or a decimal number.</p>
         * <ul>
         * <li><p>An integer indicates the pixel value of the vertical offset.</p>
         * <ul>
         * <li>Valid values: <strong>[8,4096]</strong>.</li>
         * <li>Unit: pixel.</li>
         * </ul>
         * </li>
         * <li><p>A decimal number indicates the ratio of the vertical offset to the height in the output video resolution.</p>
         * <ul>
         * <li>Valid values: <strong>(0,1)</strong>.</li>
         * <li>The decimal number can be accurate to four decimal places, such as 0.9999. Excess digits are automatically deleted.</li>
         * </ul>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Dy")
        public String dy;

        /**
         * <p>The height of the watermark. If this parameter is specified in the request, the corresponding parameter in the watermark template is overwritten. The value can be an integer or a decimal number.</p>
         * <ul>
         * <li><p>An integer indicates the pixel value of the watermark height.</p>
         * <ul>
         * <li>Valid values: <strong>[8,4096]</strong>.</li>
         * <li>Unit: pixel.</li>
         * </ul>
         * </li>
         * <li><p>A decimal number indicates the ratio of the watermark height to the height in the output video resolution.</p>
         * <ul>
         * <li>Valid values: <strong>(0,1)</strong>.</li>
         * <li>The decimal number can be accurate to four decimal places, such as 0.9999. Excess digits are automatically deleted.</li>
         * </ul>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1280</p>
         */
        @NameInMap("Height")
        public String height;

        /**
         * <p>The watermark input file. PNG images and MOV files are supported.</p>
         */
        @NameInMap("InputFile")
        public SubmitJobsResponseBodyJobResultListJobResultJobOutputWaterMarkListWaterMarkInputFile inputFile;

        /**
         * <p>The position of the watermark. If this parameter is specified in the request, the corresponding parameter in the watermark template is overwritten. Valid values:</p>
         * <ul>
         * <li><strong>TopRight</strong></li>
         * <li><strong>TopLeft</strong></li>
         * <li><strong>BottomRight</strong></li>
         * <li><strong>BottomLeft</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>TopRight</p>
         */
        @NameInMap("ReferPos")
        public String referPos;

        /**
         * <p>The type of the watermark. If this parameter is specified in the request, the corresponding parameter in the watermark template is overwritten. For more information, see <a href="https://help.aliyun.com/document_detail/29253.html">Parameter details</a>. Valid values:</p>
         * <ul>
         * <li><strong>Image</strong></li>
         * <li><strong>Text</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Image</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The ID of the watermark template.</p>
         * 
         * <strong>example:</strong>
         * <p>88c6ca184c0e47098a5b665e2a12****</p>
         */
        @NameInMap("WaterMarkTemplateId")
        public String waterMarkTemplateId;

        /**
         * <p>The width of the watermark image. If this parameter is specified in the request, the corresponding parameter in the watermark template is overwritten. The value can be an integer or a decimal number.</p>
         * <ul>
         * <li><p>An integer indicates the pixel value of the watermark width.</p>
         * <ul>
         * <li>Valid values: <strong>[8,4096]</strong>.</li>
         * <li>Unit: pixel.</li>
         * </ul>
         * </li>
         * <li><p>A decimal number indicates the ratio of the watermark width to the width in the output video resolution.</p>
         * <ul>
         * <li>Valid values: <strong>(0,1)</strong>.</li>
         * <li>The decimal number can be accurate to four decimal places, such as 0.9999. Excess digits are automatically deleted.</li>
         * </ul>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1080</p>
         */
        @NameInMap("Width")
        public String width;

        public static SubmitJobsResponseBodyJobResultListJobResultJobOutputWaterMarkListWaterMark build(java.util.Map<String, ?> map) throws Exception {
            SubmitJobsResponseBodyJobResultListJobResultJobOutputWaterMarkListWaterMark self = new SubmitJobsResponseBodyJobResultListJobResultJobOutputWaterMarkListWaterMark();
            return TeaModel.build(map, self);
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputWaterMarkListWaterMark setDx(String dx) {
            this.dx = dx;
            return this;
        }
        public String getDx() {
            return this.dx;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputWaterMarkListWaterMark setDy(String dy) {
            this.dy = dy;
            return this;
        }
        public String getDy() {
            return this.dy;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputWaterMarkListWaterMark setHeight(String height) {
            this.height = height;
            return this;
        }
        public String getHeight() {
            return this.height;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputWaterMarkListWaterMark setInputFile(SubmitJobsResponseBodyJobResultListJobResultJobOutputWaterMarkListWaterMarkInputFile inputFile) {
            this.inputFile = inputFile;
            return this;
        }
        public SubmitJobsResponseBodyJobResultListJobResultJobOutputWaterMarkListWaterMarkInputFile getInputFile() {
            return this.inputFile;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputWaterMarkListWaterMark setReferPos(String referPos) {
            this.referPos = referPos;
            return this;
        }
        public String getReferPos() {
            return this.referPos;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputWaterMarkListWaterMark setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputWaterMarkListWaterMark setWaterMarkTemplateId(String waterMarkTemplateId) {
            this.waterMarkTemplateId = waterMarkTemplateId;
            return this;
        }
        public String getWaterMarkTemplateId() {
            return this.waterMarkTemplateId;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputWaterMarkListWaterMark setWidth(String width) {
            this.width = width;
            return this;
        }
        public String getWidth() {
            return this.width;
        }

    }

    public static class SubmitJobsResponseBodyJobResultListJobResultJobOutputWaterMarkList extends TeaModel {
        @NameInMap("WaterMark")
        public java.util.List<SubmitJobsResponseBodyJobResultListJobResultJobOutputWaterMarkListWaterMark> waterMark;

        public static SubmitJobsResponseBodyJobResultListJobResultJobOutputWaterMarkList build(java.util.Map<String, ?> map) throws Exception {
            SubmitJobsResponseBodyJobResultListJobResultJobOutputWaterMarkList self = new SubmitJobsResponseBodyJobResultListJobResultJobOutputWaterMarkList();
            return TeaModel.build(map, self);
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputWaterMarkList setWaterMark(java.util.List<SubmitJobsResponseBodyJobResultListJobResultJobOutputWaterMarkListWaterMark> waterMark) {
            this.waterMark = waterMark;
            return this;
        }
        public java.util.List<SubmitJobsResponseBodyJobResultListJobResultJobOutputWaterMarkListWaterMark> getWaterMark() {
            return this.waterMark;
        }

    }

    public static class SubmitJobsResponseBodyJobResultListJobResultJobOutput extends TeaModel {
        /**
         * <p>The audio tracks that are mixed.</p>
         */
        @NameInMap("AmixList")
        public SubmitJobsResponseBodyJobResultListJobResultJobOutputAmixList amixList;

        /**
         * <p>The audio configurations.</p>
         * <blockquote>
         * <p> If this parameter is specified in the request, the corresponding configurations in the specified transcoding template are overwritten.</p>
         * </blockquote>
         */
        @NameInMap("Audio")
        public SubmitJobsResponseBodyJobResultListJobResultJobOutputAudio audio;

        /**
         * <p>The sequence number of the audio stream.</p>
         * <ul>
         * <li>Format: 0:a:{Sequence number}. Example: 0:a:0.</li>
         * <li>The sequence number is the index of the audio stream in the list and starts from 0.</li>
         * <li>If no sequence number is specified, the default audio stream is used.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0:a:0</p>
         */
        @NameInMap("AudioStreamMap")
        public String audioStreamMap;

        /**
         * <p>The information about the clip.</p>
         */
        @NameInMap("Clip")
        public SubmitJobsResponseBodyJobResultListJobResultJobOutputClip clip;

        /**
         * <p>The container format configurations.</p>
         */
        @NameInMap("Container")
        public SubmitJobsResponseBodyJobResultListJobResultJobOutputContainer container;

        /**
         * <p>The configurations of watermark blurring. The value is a JSON object. For more information, see the <strong>DeWatermark</strong> section of the <a href="https://help.aliyun.com/document_detail/29253.html">Parameter details</a> topic.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;0&quot;: [{&quot;l&quot;: 10,&quot;t&quot;: 10,&quot;w&quot;: 10,&quot;h&quot;: 10},{&quot;l&quot;: 100,&quot;t&quot;: 0.1,&quot;w&quot;: 10,&quot;h&quot;: 10}],&quot;128000&quot;: [],&quot;250000&quot;: [{&quot;l&quot;: 0.2,&quot;t&quot;: 0.1,&quot;w&quot;: 0.01,&quot;h&quot;: 0.05}]}</p>
         */
        @NameInMap("DeWatermark")
        public String deWatermark;

        /**
         * <p>The digital watermarks.</p>
         */
        @NameInMap("DigiWaterMark")
        public SubmitJobsResponseBodyJobResultListJobResultJobOutputDigiWaterMark digiWaterMark;

        /**
         * <p>The encryption configurations. Only outputs in the M3U8 format are supported.</p>
         */
        @NameInMap("Encryption")
        public SubmitJobsResponseBodyJobResultListJobResultJobOutputEncryption encryption;

        /**
         * <p>The non-standard support configuration for M3U8. The value is a JSON object. For more information, see the <strong>M3U8NonStandardSupport</strong> section of the <a href="https://help.aliyun.com/document_detail/29253.html">Parameter details</a> topic.</p>
         */
        @NameInMap("M3U8NonStandardSupport")
        public SubmitJobsResponseBodyJobResultListJobResultJobOutputM3U8NonStandardSupport m3U8NonStandardSupport;

        /**
         * <p>The URL of the merging configuration file. Only one of <strong>MergeList</strong> and <strong>MergeConfigUrl</strong> takes effect.</p>
         * <ul>
         * <li>The configuration file specified by MergeConfigUrl can contain up to 50 clips.</li>
         * <li>MergeConfigUrl indicates the URL of the configuration file for merging clips.</li>
         * <li>Make sure that the configuration file is stored as an object in OSS and that MPS can access the OSS object. For information about the file content, see the details about merging parameters.</li>
         * <li>Example of the content of the merging configuration file: <code>{&quot;MergeList&quot;:[{&quot;MergeURL&quot;:&quot;http://exampleBucket****.oss-cn-hangzhou.aliyuncs.com/video_01.mp4&quot;}]}</code>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>`{&quot;MergeList&quot;:[{&quot;MergeURL&quot;:&quot;<a href="http://exampleBucket****.oss-cn-hangzhou.aliyuncs.com/video_01.mp4%22%7D%5D%7D">http://exampleBucket****.oss-cn-hangzhou.aliyuncs.com/video_01.mp4&quot;}]}</a></p>
         */
        @NameInMap("MergeConfigUrl")
        public String mergeConfigUrl;

        /**
         * <p>The configurations for merging clips.</p>
         */
        @NameInMap("MergeList")
        public SubmitJobsResponseBodyJobResultListJobResultJobOutputMergeList mergeList;

        /**
         * <p>The transmuxing configurations. If this parameter is specified in the request, the corresponding configurations in the specified transcoding template are overwritten.</p>
         */
        @NameInMap("MuxConfig")
        public SubmitJobsResponseBodyJobResultListJobResultJobOutputMuxConfig muxConfig;

        /**
         * <p>The opening parts. The value is a JSON object.</p>
         */
        @NameInMap("OpeningList")
        public SubmitJobsResponseBodyJobResultListJobResultJobOutputOpeningList openingList;

        /**
         * <p>The output subtitles.</p>
         */
        @NameInMap("OutSubtitleList")
        public SubmitJobsResponseBodyJobResultListJobResultJobOutputOutSubtitleList outSubtitleList;

        /**
         * <p>The details of the output file.</p>
         */
        @NameInMap("OutputFile")
        public SubmitJobsResponseBodyJobResultListJobResultJobOutputOutputFile outputFile;

        /**
         * <p>The priority of the job in the MPS queue to which the job is added.</p>
         * <ul>
         * <li>A value of <strong>10</strong> indicates the highest priority.</li>
         * <li>Default value: <strong>6</strong>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("Priority")
        public String priority;

        /**
         * <p>The media properties.</p>
         */
        @NameInMap("Properties")
        public SubmitJobsResponseBodyJobResultListJobResultJobOutputProperties properties;

        /**
         * <p>The rotation angle of the video, in the clockwise direction.</p>
         * 
         * <strong>example:</strong>
         * <p>180</p>
         */
        @NameInMap("Rotate")
        public String rotate;

        /**
         * <p>The subtitle configurations.</p>
         */
        @NameInMap("SubtitleConfig")
        public SubmitJobsResponseBodyJobResultListJobResultJobOutputSubtitleConfig subtitleConfig;

        /**
         * <p>The configurations for using the resolution of the source video.</p>
         */
        @NameInMap("SuperReso")
        public SubmitJobsResponseBodyJobResultListJobResultJobOutputSuperReso superReso;

        /**
         * <p>The ending parts. The value is a JSON object.</p>
         */
        @NameInMap("TailSlateList")
        public SubmitJobsResponseBodyJobResultListJobResultJobOutputTailSlateList tailSlateList;

        /**
         * <p>The ID of the transcoding template.</p>
         * 
         * <strong>example:</strong>
         * <p>S00000000-000010</p>
         */
        @NameInMap("TemplateId")
        public String templateId;

        /**
         * <p>The general transcoding configurations.</p>
         * <blockquote>
         * <p> If this parameter is specified in the request, the corresponding parameter in the specified transcoding template are overwritten.</p>
         * </blockquote>
         */
        @NameInMap("TransConfig")
        public SubmitJobsResponseBodyJobResultListJobResultJobOutputTransConfig transConfig;

        /**
         * <p>The custom data.</p>
         * 
         * <strong>example:</strong>
         * <p>example data</p>
         */
        @NameInMap("UserData")
        public String userData;

        /**
         * <p>The video configurations.</p>
         * <blockquote>
         * <p> If this parameter is specified, <strong>AliyunVideoCodec</strong> in the template specified by <strong>TemplateId</strong> is overwritten.</p>
         * </blockquote>
         */
        @NameInMap("Video")
        public SubmitJobsResponseBodyJobResultListJobResultJobOutputVideo video;

        /**
         * <p>The sequence number of the video stream.</p>
         * <ul>
         * <li>Format: 0:a:{Sequence number}. Example: 0:a:0.</li>
         * <li>The sequence number is the index of the video stream in the list and starts from 0.</li>
         * <li>If no sequence number is specified, the default video stream is used.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0:a:0</p>
         */
        @NameInMap("VideoStreamMap")
        public String videoStreamMap;

        /**
         * <p>The URL of the watermark configuration file.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://example.com/configure">http://example.com/configure</a></p>
         */
        @NameInMap("WaterMarkConfigUrl")
        public String waterMarkConfigUrl;

        /**
         * <p>The watermarks.</p>
         * <blockquote>
         * <p> If watermarks are truncated or fail to be generated, check whether the text watermarks that you add contain special characters. If the text watermarks contain special characters, you must escape the special characters before you add the watermarks. Alternatively, you can <a href="https://workorder-intl.console.aliyun.com/?spm=5176.12246746.top-nav.dticket.68797bbcm8H408#/ticket/add/?productId=1232">submit a ticket</a> to contact Alibaba Cloud customer service for compatibility processing.</p>
         * </blockquote>
         */
        @NameInMap("WaterMarkList")
        public SubmitJobsResponseBodyJobResultListJobResultJobOutputWaterMarkList waterMarkList;

        public static SubmitJobsResponseBodyJobResultListJobResultJobOutput build(java.util.Map<String, ?> map) throws Exception {
            SubmitJobsResponseBodyJobResultListJobResultJobOutput self = new SubmitJobsResponseBodyJobResultListJobResultJobOutput();
            return TeaModel.build(map, self);
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutput setAmixList(SubmitJobsResponseBodyJobResultListJobResultJobOutputAmixList amixList) {
            this.amixList = amixList;
            return this;
        }
        public SubmitJobsResponseBodyJobResultListJobResultJobOutputAmixList getAmixList() {
            return this.amixList;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutput setAudio(SubmitJobsResponseBodyJobResultListJobResultJobOutputAudio audio) {
            this.audio = audio;
            return this;
        }
        public SubmitJobsResponseBodyJobResultListJobResultJobOutputAudio getAudio() {
            return this.audio;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutput setAudioStreamMap(String audioStreamMap) {
            this.audioStreamMap = audioStreamMap;
            return this;
        }
        public String getAudioStreamMap() {
            return this.audioStreamMap;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutput setClip(SubmitJobsResponseBodyJobResultListJobResultJobOutputClip clip) {
            this.clip = clip;
            return this;
        }
        public SubmitJobsResponseBodyJobResultListJobResultJobOutputClip getClip() {
            return this.clip;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutput setContainer(SubmitJobsResponseBodyJobResultListJobResultJobOutputContainer container) {
            this.container = container;
            return this;
        }
        public SubmitJobsResponseBodyJobResultListJobResultJobOutputContainer getContainer() {
            return this.container;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutput setDeWatermark(String deWatermark) {
            this.deWatermark = deWatermark;
            return this;
        }
        public String getDeWatermark() {
            return this.deWatermark;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutput setDigiWaterMark(SubmitJobsResponseBodyJobResultListJobResultJobOutputDigiWaterMark digiWaterMark) {
            this.digiWaterMark = digiWaterMark;
            return this;
        }
        public SubmitJobsResponseBodyJobResultListJobResultJobOutputDigiWaterMark getDigiWaterMark() {
            return this.digiWaterMark;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutput setEncryption(SubmitJobsResponseBodyJobResultListJobResultJobOutputEncryption encryption) {
            this.encryption = encryption;
            return this;
        }
        public SubmitJobsResponseBodyJobResultListJobResultJobOutputEncryption getEncryption() {
            return this.encryption;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutput setM3U8NonStandardSupport(SubmitJobsResponseBodyJobResultListJobResultJobOutputM3U8NonStandardSupport m3U8NonStandardSupport) {
            this.m3U8NonStandardSupport = m3U8NonStandardSupport;
            return this;
        }
        public SubmitJobsResponseBodyJobResultListJobResultJobOutputM3U8NonStandardSupport getM3U8NonStandardSupport() {
            return this.m3U8NonStandardSupport;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutput setMergeConfigUrl(String mergeConfigUrl) {
            this.mergeConfigUrl = mergeConfigUrl;
            return this;
        }
        public String getMergeConfigUrl() {
            return this.mergeConfigUrl;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutput setMergeList(SubmitJobsResponseBodyJobResultListJobResultJobOutputMergeList mergeList) {
            this.mergeList = mergeList;
            return this;
        }
        public SubmitJobsResponseBodyJobResultListJobResultJobOutputMergeList getMergeList() {
            return this.mergeList;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutput setMuxConfig(SubmitJobsResponseBodyJobResultListJobResultJobOutputMuxConfig muxConfig) {
            this.muxConfig = muxConfig;
            return this;
        }
        public SubmitJobsResponseBodyJobResultListJobResultJobOutputMuxConfig getMuxConfig() {
            return this.muxConfig;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutput setOpeningList(SubmitJobsResponseBodyJobResultListJobResultJobOutputOpeningList openingList) {
            this.openingList = openingList;
            return this;
        }
        public SubmitJobsResponseBodyJobResultListJobResultJobOutputOpeningList getOpeningList() {
            return this.openingList;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutput setOutSubtitleList(SubmitJobsResponseBodyJobResultListJobResultJobOutputOutSubtitleList outSubtitleList) {
            this.outSubtitleList = outSubtitleList;
            return this;
        }
        public SubmitJobsResponseBodyJobResultListJobResultJobOutputOutSubtitleList getOutSubtitleList() {
            return this.outSubtitleList;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutput setOutputFile(SubmitJobsResponseBodyJobResultListJobResultJobOutputOutputFile outputFile) {
            this.outputFile = outputFile;
            return this;
        }
        public SubmitJobsResponseBodyJobResultListJobResultJobOutputOutputFile getOutputFile() {
            return this.outputFile;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutput setPriority(String priority) {
            this.priority = priority;
            return this;
        }
        public String getPriority() {
            return this.priority;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutput setProperties(SubmitJobsResponseBodyJobResultListJobResultJobOutputProperties properties) {
            this.properties = properties;
            return this;
        }
        public SubmitJobsResponseBodyJobResultListJobResultJobOutputProperties getProperties() {
            return this.properties;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutput setRotate(String rotate) {
            this.rotate = rotate;
            return this;
        }
        public String getRotate() {
            return this.rotate;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutput setSubtitleConfig(SubmitJobsResponseBodyJobResultListJobResultJobOutputSubtitleConfig subtitleConfig) {
            this.subtitleConfig = subtitleConfig;
            return this;
        }
        public SubmitJobsResponseBodyJobResultListJobResultJobOutputSubtitleConfig getSubtitleConfig() {
            return this.subtitleConfig;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutput setSuperReso(SubmitJobsResponseBodyJobResultListJobResultJobOutputSuperReso superReso) {
            this.superReso = superReso;
            return this;
        }
        public SubmitJobsResponseBodyJobResultListJobResultJobOutputSuperReso getSuperReso() {
            return this.superReso;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutput setTailSlateList(SubmitJobsResponseBodyJobResultListJobResultJobOutputTailSlateList tailSlateList) {
            this.tailSlateList = tailSlateList;
            return this;
        }
        public SubmitJobsResponseBodyJobResultListJobResultJobOutputTailSlateList getTailSlateList() {
            return this.tailSlateList;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutput setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutput setTransConfig(SubmitJobsResponseBodyJobResultListJobResultJobOutputTransConfig transConfig) {
            this.transConfig = transConfig;
            return this;
        }
        public SubmitJobsResponseBodyJobResultListJobResultJobOutputTransConfig getTransConfig() {
            return this.transConfig;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutput setUserData(String userData) {
            this.userData = userData;
            return this;
        }
        public String getUserData() {
            return this.userData;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutput setVideo(SubmitJobsResponseBodyJobResultListJobResultJobOutputVideo video) {
            this.video = video;
            return this;
        }
        public SubmitJobsResponseBodyJobResultListJobResultJobOutputVideo getVideo() {
            return this.video;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutput setVideoStreamMap(String videoStreamMap) {
            this.videoStreamMap = videoStreamMap;
            return this;
        }
        public String getVideoStreamMap() {
            return this.videoStreamMap;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutput setWaterMarkConfigUrl(String waterMarkConfigUrl) {
            this.waterMarkConfigUrl = waterMarkConfigUrl;
            return this;
        }
        public String getWaterMarkConfigUrl() {
            return this.waterMarkConfigUrl;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutput setWaterMarkList(SubmitJobsResponseBodyJobResultListJobResultJobOutputWaterMarkList waterMarkList) {
            this.waterMarkList = waterMarkList;
            return this;
        }
        public SubmitJobsResponseBodyJobResultListJobResultJobOutputWaterMarkList getWaterMarkList() {
            return this.waterMarkList;
        }

    }

    public static class SubmitJobsResponseBodyJobResultListJobResultJob extends TeaModel {
        /**
         * <p>The error code returned if the job failed. This parameter is not returned if the job was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>InternalError</p>
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
         * <p>The time when the job was complete.</p>
         * 
         * <strong>example:</strong>
         * <p>2014-01-10T12:20:00Z</p>
         */
        @NameInMap("FinishTime")
        public String finishTime;

        /**
         * <p>The information about the job input.</p>
         */
        @NameInMap("Input")
        public SubmitJobsResponseBodyJobResultListJobResultJobInput input;

        /**
         * <p>The job ID.</p>
         * 
         * <strong>example:</strong>
         * <p>31fa3c9ca8134f9cec2b4b0b0f78****</p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <p>The message sent by MNS to notify users of the job result.</p>
         */
        @NameInMap("MNSMessageResult")
        public SubmitJobsResponseBodyJobResultListJobResultJobMNSMessageResult MNSMessageResult;

        /**
         * <p>The error message returned if the job failed. This parameter is not returned if the job was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>The operation has failed due to some unknown error, exception or failure.</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The output of the job.</p>
         */
        @NameInMap("Output")
        public SubmitJobsResponseBodyJobResultListJobResultJobOutput output;

        /**
         * <p>The transcoding progress.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Percent")
        public Long percent;

        /**
         * <p>The ID of the MPS queue.</p>
         * 
         * <strong>example:</strong>
         * <p>88c6ca184c0e47098a5b665e2a126797</p>
         */
        @NameInMap("PipelineId")
        public String pipelineId;

        /**
         * <p>The state of the job. Valid values:</p>
         * <ul>
         * <li><strong>Submitted</strong></li>
         * <li><strong>TranscodeFail</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Submitted</p>
         */
        @NameInMap("State")
        public String state;

        public static SubmitJobsResponseBodyJobResultListJobResultJob build(java.util.Map<String, ?> map) throws Exception {
            SubmitJobsResponseBodyJobResultListJobResultJob self = new SubmitJobsResponseBodyJobResultListJobResultJob();
            return TeaModel.build(map, self);
        }

        public SubmitJobsResponseBodyJobResultListJobResultJob setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJob setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJob setFinishTime(String finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public String getFinishTime() {
            return this.finishTime;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJob setInput(SubmitJobsResponseBodyJobResultListJobResultJobInput input) {
            this.input = input;
            return this;
        }
        public SubmitJobsResponseBodyJobResultListJobResultJobInput getInput() {
            return this.input;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJob setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJob setMNSMessageResult(SubmitJobsResponseBodyJobResultListJobResultJobMNSMessageResult MNSMessageResult) {
            this.MNSMessageResult = MNSMessageResult;
            return this;
        }
        public SubmitJobsResponseBodyJobResultListJobResultJobMNSMessageResult getMNSMessageResult() {
            return this.MNSMessageResult;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJob setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJob setOutput(SubmitJobsResponseBodyJobResultListJobResultJobOutput output) {
            this.output = output;
            return this;
        }
        public SubmitJobsResponseBodyJobResultListJobResultJobOutput getOutput() {
            return this.output;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJob setPercent(Long percent) {
            this.percent = percent;
            return this;
        }
        public Long getPercent() {
            return this.percent;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJob setPipelineId(String pipelineId) {
            this.pipelineId = pipelineId;
            return this;
        }
        public String getPipelineId() {
            return this.pipelineId;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJob setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

    }

    public static class SubmitJobsResponseBodyJobResultListJobResult extends TeaModel {
        /**
         * <p>The error code returned if the job failed to be created. This parameter is not returned if the job was created.</p>
         * 
         * <strong>example:</strong>
         * <p>InvalidParameter.NullValue</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The details of the job. If the job fails to be submitted, no job ID is generated.</p>
         */
        @NameInMap("Job")
        public SubmitJobsResponseBodyJobResultListJobResultJob job;

        /**
         * <p>The error message returned if the job failed to be created. This parameter is not returned if the job was created.</p>
         * 
         * <strong>example:</strong>
         * <p>The specified parameter &quot;%s&quot; cannot be null.</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>Indicates whether the job was successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Success")
        public Boolean success;

        public static SubmitJobsResponseBodyJobResultListJobResult build(java.util.Map<String, ?> map) throws Exception {
            SubmitJobsResponseBodyJobResultListJobResult self = new SubmitJobsResponseBodyJobResultListJobResult();
            return TeaModel.build(map, self);
        }

        public SubmitJobsResponseBodyJobResultListJobResult setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public SubmitJobsResponseBodyJobResultListJobResult setJob(SubmitJobsResponseBodyJobResultListJobResultJob job) {
            this.job = job;
            return this;
        }
        public SubmitJobsResponseBodyJobResultListJobResultJob getJob() {
            return this.job;
        }

        public SubmitJobsResponseBodyJobResultListJobResult setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public SubmitJobsResponseBodyJobResultListJobResult setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

    public static class SubmitJobsResponseBodyJobResultList extends TeaModel {
        @NameInMap("JobResult")
        public java.util.List<SubmitJobsResponseBodyJobResultListJobResult> jobResult;

        public static SubmitJobsResponseBodyJobResultList build(java.util.Map<String, ?> map) throws Exception {
            SubmitJobsResponseBodyJobResultList self = new SubmitJobsResponseBodyJobResultList();
            return TeaModel.build(map, self);
        }

        public SubmitJobsResponseBodyJobResultList setJobResult(java.util.List<SubmitJobsResponseBodyJobResultListJobResult> jobResult) {
            this.jobResult = jobResult;
            return this;
        }
        public java.util.List<SubmitJobsResponseBodyJobResultListJobResult> getJobResult() {
            return this.jobResult;
        }

    }

}
