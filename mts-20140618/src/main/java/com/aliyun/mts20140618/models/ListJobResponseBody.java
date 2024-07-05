// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class ListJobResponseBody extends TeaModel {
    /**
     * <p>The transcoding jobs.</p>
     */
    @NameInMap("JobList")
    public ListJobResponseBodyJobList jobList;

    /**
     * <p>The pagination token. It can be used in the next request to retrieve a new page of results.</p>
     * 
     * <strong>example:</strong>
     * <p>16f01ad6175e4230ac42bb5182cd****</p>
     */
    @NameInMap("NextPageToken")
    public String nextPageToken;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>BC860F04-778A-472F-AB39-E1BF329C1EA8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static ListJobResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListJobResponseBody self = new ListJobResponseBody();
        return TeaModel.build(map, self);
    }

    public ListJobResponseBody setJobList(ListJobResponseBodyJobList jobList) {
        this.jobList = jobList;
        return this;
    }
    public ListJobResponseBodyJobList getJobList() {
        return this.jobList;
    }

    public ListJobResponseBody setNextPageToken(String nextPageToken) {
        this.nextPageToken = nextPageToken;
        return this;
    }
    public String getNextPageToken() {
        return this.nextPageToken;
    }

    public ListJobResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ListJobResponseBodyJobListJobInput extends TeaModel {
        /**
         * <p>The name of the OSS bucket in which the job input is stored.</p>
         * 
         * <strong>example:</strong>
         * <p>example-bucket</p>
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

        public static ListJobResponseBodyJobListJobInput build(java.util.Map<String, ?> map) throws Exception {
            ListJobResponseBodyJobListJobInput self = new ListJobResponseBodyJobListJobInput();
            return TeaModel.build(map, self);
        }

        public ListJobResponseBodyJobListJobInput setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

        public ListJobResponseBodyJobListJobInput setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public ListJobResponseBodyJobListJobInput setObject(String object) {
            this.object = object;
            return this;
        }
        public String getObject() {
            return this.object;
        }

    }

    public static class ListJobResponseBodyJobListJobMNSMessageResult extends TeaModel {
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
         * <p>The resource operated “%s” cannot be found.</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The ID of the message returned if the job was successful.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("MessageId")
        public String messageId;

        public static ListJobResponseBodyJobListJobMNSMessageResult build(java.util.Map<String, ?> map) throws Exception {
            ListJobResponseBodyJobListJobMNSMessageResult self = new ListJobResponseBodyJobListJobMNSMessageResult();
            return TeaModel.build(map, self);
        }

        public ListJobResponseBodyJobListJobMNSMessageResult setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public ListJobResponseBodyJobListJobMNSMessageResult setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public ListJobResponseBodyJobListJobMNSMessageResult setMessageId(String messageId) {
            this.messageId = messageId;
            return this;
        }
        public String getMessageId() {
            return this.messageId;
        }

    }

    public static class ListJobResponseBodyJobListJobOutputAudioVolume extends TeaModel {
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

        public static ListJobResponseBodyJobListJobOutputAudioVolume build(java.util.Map<String, ?> map) throws Exception {
            ListJobResponseBodyJobListJobOutputAudioVolume self = new ListJobResponseBodyJobListJobOutputAudioVolume();
            return TeaModel.build(map, self);
        }

        public ListJobResponseBodyJobListJobOutputAudioVolume setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public ListJobResponseBodyJobListJobOutputAudioVolume setMethod(String method) {
            this.method = method;
            return this;
        }
        public String getMethod() {
            return this.method;
        }

    }

    public static class ListJobResponseBodyJobListJobOutputAudio extends TeaModel {
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
         * <li>If the value of Codec is mp3, the value of this parameter can only be 1 or 2.</li>
         * <li>If the value of Codec is aac, the value of this parameter can only be 1, 2, 4, 5, 6, or 8.</li>
         * <li>Default value: 2.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("Channels")
        public String channels;

        /**
         * <p>The audio codec.</p>
         * <ul>
         * <li>Valid values: aac, mp3, vorbis, and flac.</li>
         * <li>Default value: <strong>aac</strong>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>aac</p>
         */
        @NameInMap("Codec")
        public String codec;

        /**
         * <p>The codec profile of the audio. Valid values if the value of Codec is aac: aaclow, aache, aachev2, aacld, and aaceld.</p>
         * 
         * <strong>example:</strong>
         * <p>aaclow</p>
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
         * <li>Valid values: 22050, 32000, 44100, 48000, and 96000.</li>
         * <li>Unit: Hz.</li>
         * <li>Default value: 44100.</li>
         * <li>If the video container format is FLV and the audio codec is MP3, the value of this parameter cannot be 32000, 48000, or 96000. If the audio codec is MP3, the value of this parameter cannot be 96000.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>44100</p>
         */
        @NameInMap("Samplerate")
        public String samplerate;

        /**
         * <p>The volume configurations.</p>
         */
        @NameInMap("Volume")
        public ListJobResponseBodyJobListJobOutputAudioVolume volume;

        public static ListJobResponseBodyJobListJobOutputAudio build(java.util.Map<String, ?> map) throws Exception {
            ListJobResponseBodyJobListJobOutputAudio self = new ListJobResponseBodyJobListJobOutputAudio();
            return TeaModel.build(map, self);
        }

        public ListJobResponseBodyJobListJobOutputAudio setBitrate(String bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public String getBitrate() {
            return this.bitrate;
        }

        public ListJobResponseBodyJobListJobOutputAudio setChannels(String channels) {
            this.channels = channels;
            return this;
        }
        public String getChannels() {
            return this.channels;
        }

        public ListJobResponseBodyJobListJobOutputAudio setCodec(String codec) {
            this.codec = codec;
            return this;
        }
        public String getCodec() {
            return this.codec;
        }

        public ListJobResponseBodyJobListJobOutputAudio setProfile(String profile) {
            this.profile = profile;
            return this;
        }
        public String getProfile() {
            return this.profile;
        }

        public ListJobResponseBodyJobListJobOutputAudio setQscale(String qscale) {
            this.qscale = qscale;
            return this;
        }
        public String getQscale() {
            return this.qscale;
        }

        public ListJobResponseBodyJobListJobOutputAudio setSamplerate(String samplerate) {
            this.samplerate = samplerate;
            return this;
        }
        public String getSamplerate() {
            return this.samplerate;
        }

        public ListJobResponseBodyJobListJobOutputAudio setVolume(ListJobResponseBodyJobListJobOutputAudioVolume volume) {
            this.volume = volume;
            return this;
        }
        public ListJobResponseBodyJobListJobOutputAudioVolume getVolume() {
            return this.volume;
        }

    }

    public static class ListJobResponseBodyJobListJobOutputClipTimeSpan extends TeaModel {
        /**
         * <p>The duration of the clip.</p>
         * <ul>
         * <li>Format: <code>hh:mm:ss[.SSS]</code> or <code>sssss[.SSS]</code>.</li>
         * <li>Valid values: <code>[00:00:00.000,23:59:59.999]</code> or <code>[0.000,86399.999]</code>.</li>
         * <li>Examples: 01:00:59.999 and 32000.23.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>01:00:59.999</p>
         */
        @NameInMap("Duration")
        public String duration;

        /**
         * <p>The point in time when the clip starts.</p>
         * <ul>
         * <li>Format: <code>hh:mm:ss[.SSS]</code> or <code>sssss[.SSS]</code>.</li>
         * <li>Valid values: <code>[00:00:00.000,23:59:59.999]</code> or <code>[0.000,86399.999]</code>.</li>
         * <li>Examples: 01:59:59.999 and 32000.23.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>01:00:59.999</p>
         */
        @NameInMap("Seek")
        public String seek;

        public static ListJobResponseBodyJobListJobOutputClipTimeSpan build(java.util.Map<String, ?> map) throws Exception {
            ListJobResponseBodyJobListJobOutputClipTimeSpan self = new ListJobResponseBodyJobListJobOutputClipTimeSpan();
            return TeaModel.build(map, self);
        }

        public ListJobResponseBodyJobListJobOutputClipTimeSpan setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public ListJobResponseBodyJobListJobOutputClipTimeSpan setSeek(String seek) {
            this.seek = seek;
            return this;
        }
        public String getSeek() {
            return this.seek;
        }

    }

    public static class ListJobResponseBodyJobListJobOutputClip extends TeaModel {
        /**
         * <p>The time span of the clip.</p>
         */
        @NameInMap("TimeSpan")
        public ListJobResponseBodyJobListJobOutputClipTimeSpan timeSpan;

        public static ListJobResponseBodyJobListJobOutputClip build(java.util.Map<String, ?> map) throws Exception {
            ListJobResponseBodyJobListJobOutputClip self = new ListJobResponseBodyJobListJobOutputClip();
            return TeaModel.build(map, self);
        }

        public ListJobResponseBodyJobListJobOutputClip setTimeSpan(ListJobResponseBodyJobListJobOutputClipTimeSpan timeSpan) {
            this.timeSpan = timeSpan;
            return this;
        }
        public ListJobResponseBodyJobListJobOutputClipTimeSpan getTimeSpan() {
            return this.timeSpan;
        }

    }

    public static class ListJobResponseBodyJobListJobOutputContainer extends TeaModel {
        /**
         * <p>The container format.</p>
         * <ul>
         * <li>Default value: mp4.</li>
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

        public static ListJobResponseBodyJobListJobOutputContainer build(java.util.Map<String, ?> map) throws Exception {
            ListJobResponseBodyJobListJobOutputContainer self = new ListJobResponseBodyJobListJobOutputContainer();
            return TeaModel.build(map, self);
        }

        public ListJobResponseBodyJobListJobOutputContainer setFormat(String format) {
            this.format = format;
            return this;
        }
        public String getFormat() {
            return this.format;
        }

    }

    public static class ListJobResponseBodyJobListJobOutputEncryption extends TeaModel {
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
         * <p>The key encryption method. Valid values: Base64 and KMS.</p>
         * <blockquote>
         * <p> For example, if the key is encryptionkey128, you can encrypt the key in the Base64 format or use Key Management Service (KMS) to encrypt the key.``````</p>
         * </blockquote>
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
         * <p>The encryption type. Only hls-aes-128 may be returned.</p>
         * 
         * <strong>example:</strong>
         * <p>hls-aes-128</p>
         */
        @NameInMap("Type")
        public String type;

        public static ListJobResponseBodyJobListJobOutputEncryption build(java.util.Map<String, ?> map) throws Exception {
            ListJobResponseBodyJobListJobOutputEncryption self = new ListJobResponseBodyJobListJobOutputEncryption();
            return TeaModel.build(map, self);
        }

        public ListJobResponseBodyJobListJobOutputEncryption setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public ListJobResponseBodyJobListJobOutputEncryption setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListJobResponseBodyJobListJobOutputEncryption setKeyType(String keyType) {
            this.keyType = keyType;
            return this;
        }
        public String getKeyType() {
            return this.keyType;
        }

        public ListJobResponseBodyJobListJobOutputEncryption setKeyUri(String keyUri) {
            this.keyUri = keyUri;
            return this;
        }
        public String getKeyUri() {
            return this.keyUri;
        }

        public ListJobResponseBodyJobListJobOutputEncryption setSkipCnt(String skipCnt) {
            this.skipCnt = skipCnt;
            return this;
        }
        public String getSkipCnt() {
            return this.skipCnt;
        }

        public ListJobResponseBodyJobListJobOutputEncryption setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListJobResponseBodyJobListJobOutputM3U8NonStandardSupportTS extends TeaModel {
        /**
         * <p>Indicates whether the MD5 value of the TS file is included in the M3U8 file. Valid values:</p>
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
         * <p>Indicates whether the size of the TS file is included in the M3U8 file.</p>
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

        public static ListJobResponseBodyJobListJobOutputM3U8NonStandardSupportTS build(java.util.Map<String, ?> map) throws Exception {
            ListJobResponseBodyJobListJobOutputM3U8NonStandardSupportTS self = new ListJobResponseBodyJobListJobOutputM3U8NonStandardSupportTS();
            return TeaModel.build(map, self);
        }

        public ListJobResponseBodyJobListJobOutputM3U8NonStandardSupportTS setMd5Support(Boolean md5Support) {
            this.md5Support = md5Support;
            return this;
        }
        public Boolean getMd5Support() {
            return this.md5Support;
        }

        public ListJobResponseBodyJobListJobOutputM3U8NonStandardSupportTS setSizeSupport(Boolean sizeSupport) {
            this.sizeSupport = sizeSupport;
            return this;
        }
        public Boolean getSizeSupport() {
            return this.sizeSupport;
        }

    }

    public static class ListJobResponseBodyJobListJobOutputM3U8NonStandardSupport extends TeaModel {
        /**
         * <p>The non-standard support configurations for TS files. The value is a JSON object. For more information, see <a href="https://help.aliyun.com/document_detail/29253.html">Parameter details</a>.</p>
         */
        @NameInMap("TS")
        public ListJobResponseBodyJobListJobOutputM3U8NonStandardSupportTS TS;

        public static ListJobResponseBodyJobListJobOutputM3U8NonStandardSupport build(java.util.Map<String, ?> map) throws Exception {
            ListJobResponseBodyJobListJobOutputM3U8NonStandardSupport self = new ListJobResponseBodyJobListJobOutputM3U8NonStandardSupport();
            return TeaModel.build(map, self);
        }

        public ListJobResponseBodyJobListJobOutputM3U8NonStandardSupport setTS(ListJobResponseBodyJobListJobOutputM3U8NonStandardSupportTS TS) {
            this.TS = TS;
            return this;
        }
        public ListJobResponseBodyJobListJobOutputM3U8NonStandardSupportTS getTS() {
            return this.TS;
        }

    }

    public static class ListJobResponseBodyJobListJobOutputMergeListMerge extends TeaModel {
        /**
         * <p>The duration of the clip.</p>
         * <ul>
         * <li>Format: <code>hh:mm:ss[.SSS]</code> or <code>sssss[.SSS]</code>.</li>
         * <li>Examples: 01:59:59.999 and 32000.23.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>01:59:59.999</p>
         */
        @NameInMap("Duration")
        public String duration;

        /**
         * <p>The OSS URL of the clip.</p>
         * <ul>
         * <li>Example: <code>http://example-bucket-****.oss-cn-hangzhou.aliyuncs.com/example-object.flv</code>.</li>
         * <li>The object must be URL-encoded by using the UTF-8 standard.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p><a href="http://example-bucket.oss-cn-hangzhou.aliyuncs.com/example-object.flv">http://example-bucket.oss-cn-hangzhou.aliyuncs.com/example-object.flv</a></p>
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
         */
        @NameInMap("Start")
        public String start;

        public static ListJobResponseBodyJobListJobOutputMergeListMerge build(java.util.Map<String, ?> map) throws Exception {
            ListJobResponseBodyJobListJobOutputMergeListMerge self = new ListJobResponseBodyJobListJobOutputMergeListMerge();
            return TeaModel.build(map, self);
        }

        public ListJobResponseBodyJobListJobOutputMergeListMerge setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public ListJobResponseBodyJobListJobOutputMergeListMerge setMergeURL(String mergeURL) {
            this.mergeURL = mergeURL;
            return this;
        }
        public String getMergeURL() {
            return this.mergeURL;
        }

        public ListJobResponseBodyJobListJobOutputMergeListMerge setRoleArn(String roleArn) {
            this.roleArn = roleArn;
            return this;
        }
        public String getRoleArn() {
            return this.roleArn;
        }

        public ListJobResponseBodyJobListJobOutputMergeListMerge setStart(String start) {
            this.start = start;
            return this;
        }
        public String getStart() {
            return this.start;
        }

    }

    public static class ListJobResponseBodyJobListJobOutputMergeList extends TeaModel {
        @NameInMap("Merge")
        public java.util.List<ListJobResponseBodyJobListJobOutputMergeListMerge> merge;

        public static ListJobResponseBodyJobListJobOutputMergeList build(java.util.Map<String, ?> map) throws Exception {
            ListJobResponseBodyJobListJobOutputMergeList self = new ListJobResponseBodyJobListJobOutputMergeList();
            return TeaModel.build(map, self);
        }

        public ListJobResponseBodyJobListJobOutputMergeList setMerge(java.util.List<ListJobResponseBodyJobListJobOutputMergeListMerge> merge) {
            this.merge = merge;
            return this;
        }
        public java.util.List<ListJobResponseBodyJobListJobOutputMergeListMerge> getMerge() {
            return this.merge;
        }

    }

    public static class ListJobResponseBodyJobListJobOutputMuxConfigGif extends TeaModel {
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
         * <p>true</p>
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

        public static ListJobResponseBodyJobListJobOutputMuxConfigGif build(java.util.Map<String, ?> map) throws Exception {
            ListJobResponseBodyJobListJobOutputMuxConfigGif self = new ListJobResponseBodyJobListJobOutputMuxConfigGif();
            return TeaModel.build(map, self);
        }

        public ListJobResponseBodyJobListJobOutputMuxConfigGif setDitherMode(String ditherMode) {
            this.ditherMode = ditherMode;
            return this;
        }
        public String getDitherMode() {
            return this.ditherMode;
        }

        public ListJobResponseBodyJobListJobOutputMuxConfigGif setFinalDelay(String finalDelay) {
            this.finalDelay = finalDelay;
            return this;
        }
        public String getFinalDelay() {
            return this.finalDelay;
        }

        public ListJobResponseBodyJobListJobOutputMuxConfigGif setIsCustomPalette(String isCustomPalette) {
            this.isCustomPalette = isCustomPalette;
            return this;
        }
        public String getIsCustomPalette() {
            return this.isCustomPalette;
        }

        public ListJobResponseBodyJobListJobOutputMuxConfigGif setLoop(String loop) {
            this.loop = loop;
            return this;
        }
        public String getLoop() {
            return this.loop;
        }

    }

    public static class ListJobResponseBodyJobListJobOutputMuxConfigSegment extends TeaModel {
        /**
         * <p>The length of the segment. The value must be an integer. Unit: seconds.</p>
         * <ul>
         * <li>Valid values: [1,10].</li>
         * <li>Default value: 10.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Duration")
        public String duration;

        public static ListJobResponseBodyJobListJobOutputMuxConfigSegment build(java.util.Map<String, ?> map) throws Exception {
            ListJobResponseBodyJobListJobOutputMuxConfigSegment self = new ListJobResponseBodyJobListJobOutputMuxConfigSegment();
            return TeaModel.build(map, self);
        }

        public ListJobResponseBodyJobListJobOutputMuxConfigSegment setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

    }

    public static class ListJobResponseBodyJobListJobOutputMuxConfigWebp extends TeaModel {
        /**
         * <p>The loop count.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Loop")
        public String loop;

        public static ListJobResponseBodyJobListJobOutputMuxConfigWebp build(java.util.Map<String, ?> map) throws Exception {
            ListJobResponseBodyJobListJobOutputMuxConfigWebp self = new ListJobResponseBodyJobListJobOutputMuxConfigWebp();
            return TeaModel.build(map, self);
        }

        public ListJobResponseBodyJobListJobOutputMuxConfigWebp setLoop(String loop) {
            this.loop = loop;
            return this;
        }
        public String getLoop() {
            return this.loop;
        }

    }

    public static class ListJobResponseBodyJobListJobOutputMuxConfig extends TeaModel {
        /**
         * <p>The transmuxing configurations for GIF.</p>
         */
        @NameInMap("Gif")
        public ListJobResponseBodyJobListJobOutputMuxConfigGif gif;

        /**
         * <p>The segment configurations. The value is a JSON object.</p>
         */
        @NameInMap("Segment")
        public ListJobResponseBodyJobListJobOutputMuxConfigSegment segment;

        /**
         * <p>The transmuxing configurations for WebP.</p>
         */
        @NameInMap("Webp")
        public ListJobResponseBodyJobListJobOutputMuxConfigWebp webp;

        public static ListJobResponseBodyJobListJobOutputMuxConfig build(java.util.Map<String, ?> map) throws Exception {
            ListJobResponseBodyJobListJobOutputMuxConfig self = new ListJobResponseBodyJobListJobOutputMuxConfig();
            return TeaModel.build(map, self);
        }

        public ListJobResponseBodyJobListJobOutputMuxConfig setGif(ListJobResponseBodyJobListJobOutputMuxConfigGif gif) {
            this.gif = gif;
            return this;
        }
        public ListJobResponseBodyJobListJobOutputMuxConfigGif getGif() {
            return this.gif;
        }

        public ListJobResponseBodyJobListJobOutputMuxConfig setSegment(ListJobResponseBodyJobListJobOutputMuxConfigSegment segment) {
            this.segment = segment;
            return this;
        }
        public ListJobResponseBodyJobListJobOutputMuxConfigSegment getSegment() {
            return this.segment;
        }

        public ListJobResponseBodyJobListJobOutputMuxConfig setWebp(ListJobResponseBodyJobListJobOutputMuxConfigWebp webp) {
            this.webp = webp;
            return this;
        }
        public ListJobResponseBodyJobListJobOutputMuxConfigWebp getWebp() {
            return this.webp;
        }

    }

    public static class ListJobResponseBodyJobListJobOutputOpeningListOpening extends TeaModel {
        /**
         * <p>The height of the opening part. Valid values: values in the range of (0, 4096), -1, and full.</p>
         * <ul>
         * <li>Default value: <strong>-1</strong>.</li>
         * <li>A value of -1 indicates that the height of the source of the opening part is retained.</li>
         * <li>A value of full indicates that the height of the opening part equals the height of the main part.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>-1</p>
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
         * <p>0</p>
         */
        @NameInMap("Start")
        public String start;

        /**
         * <p>The width of the opening part. Valid values: values in the range of (0, 4096), -1, and full.</p>
         * <ul>
         * <li>Default value: <strong>-1</strong>.</li>
         * <li>A value of -1 indicates that the width of the source of the opening part is retained.</li>
         * <li>A value of full indicates that the width of the opening part equals the width of the main part.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>-1</p>
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

        public static ListJobResponseBodyJobListJobOutputOpeningListOpening build(java.util.Map<String, ?> map) throws Exception {
            ListJobResponseBodyJobListJobOutputOpeningListOpening self = new ListJobResponseBodyJobListJobOutputOpeningListOpening();
            return TeaModel.build(map, self);
        }

        public ListJobResponseBodyJobListJobOutputOpeningListOpening setHeight(String height) {
            this.height = height;
            return this;
        }
        public String getHeight() {
            return this.height;
        }

        public ListJobResponseBodyJobListJobOutputOpeningListOpening setStart(String start) {
            this.start = start;
            return this;
        }
        public String getStart() {
            return this.start;
        }

        public ListJobResponseBodyJobListJobOutputOpeningListOpening setWidth(String width) {
            this.width = width;
            return this;
        }
        public String getWidth() {
            return this.width;
        }

        public ListJobResponseBodyJobListJobOutputOpeningListOpening setOpenUrl(String openUrl) {
            this.openUrl = openUrl;
            return this;
        }
        public String getOpenUrl() {
            return this.openUrl;
        }

    }

    public static class ListJobResponseBodyJobListJobOutputOpeningList extends TeaModel {
        @NameInMap("Opening")
        public java.util.List<ListJobResponseBodyJobListJobOutputOpeningListOpening> opening;

        public static ListJobResponseBodyJobListJobOutputOpeningList build(java.util.Map<String, ?> map) throws Exception {
            ListJobResponseBodyJobListJobOutputOpeningList self = new ListJobResponseBodyJobListJobOutputOpeningList();
            return TeaModel.build(map, self);
        }

        public ListJobResponseBodyJobListJobOutputOpeningList setOpening(java.util.List<ListJobResponseBodyJobListJobOutputOpeningListOpening> opening) {
            this.opening = opening;
            return this;
        }
        public java.util.List<ListJobResponseBodyJobListJobOutputOpeningListOpening> getOpening() {
            return this.opening;
        }

    }

    public static class ListJobResponseBodyJobListJobOutputOutSubtitleListOutSubtitleOutSubtitleFile extends TeaModel {
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

        public static ListJobResponseBodyJobListJobOutputOutSubtitleListOutSubtitleOutSubtitleFile build(java.util.Map<String, ?> map) throws Exception {
            ListJobResponseBodyJobListJobOutputOutSubtitleListOutSubtitleOutSubtitleFile self = new ListJobResponseBodyJobListJobOutputOutSubtitleListOutSubtitleOutSubtitleFile();
            return TeaModel.build(map, self);
        }

        public ListJobResponseBodyJobListJobOutputOutSubtitleListOutSubtitleOutSubtitleFile setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

        public ListJobResponseBodyJobListJobOutputOutSubtitleListOutSubtitleOutSubtitleFile setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public ListJobResponseBodyJobListJobOutputOutSubtitleListOutSubtitleOutSubtitleFile setObject(String object) {
            this.object = object;
            return this;
        }
        public String getObject() {
            return this.object;
        }

        public ListJobResponseBodyJobListJobOutputOutSubtitleListOutSubtitleOutSubtitleFile setRoleArn(String roleArn) {
            this.roleArn = roleArn;
            return this;
        }
        public String getRoleArn() {
            return this.roleArn;
        }

    }

    public static class ListJobResponseBodyJobListJobOutputOutSubtitleListOutSubtitle extends TeaModel {
        /**
         * <p>The video track. Format: 0:{Stream}:{Stream sequence number}, that is, 0:v:{video_index}. The value of Stream is v, which indicates a video stream. The sequence number is the index of the video stream in the list and starts from 0.</p>
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
        public ListJobResponseBodyJobListJobOutputOutSubtitleListOutSubtitleOutSubtitleFile outSubtitleFile;

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

        public static ListJobResponseBodyJobListJobOutputOutSubtitleListOutSubtitle build(java.util.Map<String, ?> map) throws Exception {
            ListJobResponseBodyJobListJobOutputOutSubtitleListOutSubtitle self = new ListJobResponseBodyJobListJobOutputOutSubtitleListOutSubtitle();
            return TeaModel.build(map, self);
        }

        public ListJobResponseBodyJobListJobOutputOutSubtitleListOutSubtitle setMap(String map) {
            this.map = map;
            return this;
        }
        public String getMap() {
            return this.map;
        }

        public ListJobResponseBodyJobListJobOutputOutSubtitleListOutSubtitle setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ListJobResponseBodyJobListJobOutputOutSubtitleListOutSubtitle setOutSubtitleFile(ListJobResponseBodyJobListJobOutputOutSubtitleListOutSubtitleOutSubtitleFile outSubtitleFile) {
            this.outSubtitleFile = outSubtitleFile;
            return this;
        }
        public ListJobResponseBodyJobListJobOutputOutSubtitleListOutSubtitleOutSubtitleFile getOutSubtitleFile() {
            return this.outSubtitleFile;
        }

        public ListJobResponseBodyJobListJobOutputOutSubtitleListOutSubtitle setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

    public static class ListJobResponseBodyJobListJobOutputOutSubtitleList extends TeaModel {
        @NameInMap("OutSubtitle")
        public java.util.List<ListJobResponseBodyJobListJobOutputOutSubtitleListOutSubtitle> outSubtitle;

        public static ListJobResponseBodyJobListJobOutputOutSubtitleList build(java.util.Map<String, ?> map) throws Exception {
            ListJobResponseBodyJobListJobOutputOutSubtitleList self = new ListJobResponseBodyJobListJobOutputOutSubtitleList();
            return TeaModel.build(map, self);
        }

        public ListJobResponseBodyJobListJobOutputOutSubtitleList setOutSubtitle(java.util.List<ListJobResponseBodyJobListJobOutputOutSubtitleListOutSubtitle> outSubtitle) {
            this.outSubtitle = outSubtitle;
            return this;
        }
        public java.util.List<ListJobResponseBodyJobListJobOutputOutSubtitleListOutSubtitle> getOutSubtitle() {
            return this.outSubtitle;
        }

    }

    public static class ListJobResponseBodyJobListJobOutputOutputFile extends TeaModel {
        /**
         * <p>The name of the OSS bucket in which the input file is stored.</p>
         * 
         * <strong>example:</strong>
         * <p>example-bucket</p>
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

        public static ListJobResponseBodyJobListJobOutputOutputFile build(java.util.Map<String, ?> map) throws Exception {
            ListJobResponseBodyJobListJobOutputOutputFile self = new ListJobResponseBodyJobListJobOutputOutputFile();
            return TeaModel.build(map, self);
        }

        public ListJobResponseBodyJobListJobOutputOutputFile setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

        public ListJobResponseBodyJobListJobOutputOutputFile setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public ListJobResponseBodyJobListJobOutputOutputFile setObject(String object) {
            this.object = object;
            return this;
        }
        public String getObject() {
            return this.object;
        }

        public ListJobResponseBodyJobListJobOutputOutputFile setRoleArn(String roleArn) {
            this.roleArn = roleArn;
            return this;
        }
        public String getRoleArn() {
            return this.roleArn;
        }

    }

    public static class ListJobResponseBodyJobListJobOutputPropertiesFormat extends TeaModel {
        /**
         * <p>The total bitrate.</p>
         * 
         * <strong>example:</strong>
         * <p>490.784</p>
         */
        @NameInMap("Bitrate")
        public String bitrate;

        /**
         * <p>The total duration.</p>
         * 
         * <strong>example:</strong>
         * <p>17.234000</p>
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
         * <p>1057273</p>
         */
        @NameInMap("Size")
        public String size;

        /**
         * <p>The start time.</p>
         * 
         * <strong>example:</strong>
         * <p>0.064000</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        public static ListJobResponseBodyJobListJobOutputPropertiesFormat build(java.util.Map<String, ?> map) throws Exception {
            ListJobResponseBodyJobListJobOutputPropertiesFormat self = new ListJobResponseBodyJobListJobOutputPropertiesFormat();
            return TeaModel.build(map, self);
        }

        public ListJobResponseBodyJobListJobOutputPropertiesFormat setBitrate(String bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public String getBitrate() {
            return this.bitrate;
        }

        public ListJobResponseBodyJobListJobOutputPropertiesFormat setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public ListJobResponseBodyJobListJobOutputPropertiesFormat setFormatLongName(String formatLongName) {
            this.formatLongName = formatLongName;
            return this;
        }
        public String getFormatLongName() {
            return this.formatLongName;
        }

        public ListJobResponseBodyJobListJobOutputPropertiesFormat setFormatName(String formatName) {
            this.formatName = formatName;
            return this;
        }
        public String getFormatName() {
            return this.formatName;
        }

        public ListJobResponseBodyJobListJobOutputPropertiesFormat setNumPrograms(String numPrograms) {
            this.numPrograms = numPrograms;
            return this;
        }
        public String getNumPrograms() {
            return this.numPrograms;
        }

        public ListJobResponseBodyJobListJobOutputPropertiesFormat setNumStreams(String numStreams) {
            this.numStreams = numStreams;
            return this;
        }
        public String getNumStreams() {
            return this.numStreams;
        }

        public ListJobResponseBodyJobListJobOutputPropertiesFormat setSize(String size) {
            this.size = size;
            return this;
        }
        public String getSize() {
            return this.size;
        }

        public ListJobResponseBodyJobListJobOutputPropertiesFormat setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

    public static class ListJobResponseBodyJobListJobOutputPropertiesStreamsAudioStreamListAudioStream extends TeaModel {
        /**
         * <p>The bitrate of the audio stream.</p>
         * 
         * <strong>example:</strong>
         * <p>64.136</p>
         */
        @NameInMap("Bitrate")
        public String bitrate;

        /**
         * <p>The output layout of the sound channels.</p>
         * 
         * <strong>example:</strong>
         * <p>mono</p>
         */
        @NameInMap("ChannelLayout")
        public String channelLayout;

        /**
         * <p>The number of sound channels.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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
         * <p>1/32000</p>
         */
        @NameInMap("CodecTimeBase")
        public String codecTimeBase;

        /**
         * <p>The duration of the audio stream.</p>
         * 
         * <strong>example:</strong>
         * <p>17.223562</p>
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
         * <p>und</p>
         */
        @NameInMap("Lang")
        public String lang;

        /**
         * <p>The total number of frames.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
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
         * <p>32000</p>
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
         * <p>The time base of the audio stream.</p>
         * 
         * <strong>example:</strong>
         * <p>1/32000</p>
         */
        @NameInMap("Timebase")
        public String timebase;

        public static ListJobResponseBodyJobListJobOutputPropertiesStreamsAudioStreamListAudioStream build(java.util.Map<String, ?> map) throws Exception {
            ListJobResponseBodyJobListJobOutputPropertiesStreamsAudioStreamListAudioStream self = new ListJobResponseBodyJobListJobOutputPropertiesStreamsAudioStreamListAudioStream();
            return TeaModel.build(map, self);
        }

        public ListJobResponseBodyJobListJobOutputPropertiesStreamsAudioStreamListAudioStream setBitrate(String bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public String getBitrate() {
            return this.bitrate;
        }

        public ListJobResponseBodyJobListJobOutputPropertiesStreamsAudioStreamListAudioStream setChannelLayout(String channelLayout) {
            this.channelLayout = channelLayout;
            return this;
        }
        public String getChannelLayout() {
            return this.channelLayout;
        }

        public ListJobResponseBodyJobListJobOutputPropertiesStreamsAudioStreamListAudioStream setChannels(String channels) {
            this.channels = channels;
            return this;
        }
        public String getChannels() {
            return this.channels;
        }

        public ListJobResponseBodyJobListJobOutputPropertiesStreamsAudioStreamListAudioStream setCodecLongName(String codecLongName) {
            this.codecLongName = codecLongName;
            return this;
        }
        public String getCodecLongName() {
            return this.codecLongName;
        }

        public ListJobResponseBodyJobListJobOutputPropertiesStreamsAudioStreamListAudioStream setCodecName(String codecName) {
            this.codecName = codecName;
            return this;
        }
        public String getCodecName() {
            return this.codecName;
        }

        public ListJobResponseBodyJobListJobOutputPropertiesStreamsAudioStreamListAudioStream setCodecTag(String codecTag) {
            this.codecTag = codecTag;
            return this;
        }
        public String getCodecTag() {
            return this.codecTag;
        }

        public ListJobResponseBodyJobListJobOutputPropertiesStreamsAudioStreamListAudioStream setCodecTagString(String codecTagString) {
            this.codecTagString = codecTagString;
            return this;
        }
        public String getCodecTagString() {
            return this.codecTagString;
        }

        public ListJobResponseBodyJobListJobOutputPropertiesStreamsAudioStreamListAudioStream setCodecTimeBase(String codecTimeBase) {
            this.codecTimeBase = codecTimeBase;
            return this;
        }
        public String getCodecTimeBase() {
            return this.codecTimeBase;
        }

        public ListJobResponseBodyJobListJobOutputPropertiesStreamsAudioStreamListAudioStream setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public ListJobResponseBodyJobListJobOutputPropertiesStreamsAudioStreamListAudioStream setIndex(String index) {
            this.index = index;
            return this;
        }
        public String getIndex() {
            return this.index;
        }

        public ListJobResponseBodyJobListJobOutputPropertiesStreamsAudioStreamListAudioStream setLang(String lang) {
            this.lang = lang;
            return this;
        }
        public String getLang() {
            return this.lang;
        }

        public ListJobResponseBodyJobListJobOutputPropertiesStreamsAudioStreamListAudioStream setNumFrames(String numFrames) {
            this.numFrames = numFrames;
            return this;
        }
        public String getNumFrames() {
            return this.numFrames;
        }

        public ListJobResponseBodyJobListJobOutputPropertiesStreamsAudioStreamListAudioStream setSampleFmt(String sampleFmt) {
            this.sampleFmt = sampleFmt;
            return this;
        }
        public String getSampleFmt() {
            return this.sampleFmt;
        }

        public ListJobResponseBodyJobListJobOutputPropertiesStreamsAudioStreamListAudioStream setSamplerate(String samplerate) {
            this.samplerate = samplerate;
            return this;
        }
        public String getSamplerate() {
            return this.samplerate;
        }

        public ListJobResponseBodyJobListJobOutputPropertiesStreamsAudioStreamListAudioStream setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public ListJobResponseBodyJobListJobOutputPropertiesStreamsAudioStreamListAudioStream setTimebase(String timebase) {
            this.timebase = timebase;
            return this;
        }
        public String getTimebase() {
            return this.timebase;
        }

    }

    public static class ListJobResponseBodyJobListJobOutputPropertiesStreamsAudioStreamList extends TeaModel {
        @NameInMap("AudioStream")
        public java.util.List<ListJobResponseBodyJobListJobOutputPropertiesStreamsAudioStreamListAudioStream> audioStream;

        public static ListJobResponseBodyJobListJobOutputPropertiesStreamsAudioStreamList build(java.util.Map<String, ?> map) throws Exception {
            ListJobResponseBodyJobListJobOutputPropertiesStreamsAudioStreamList self = new ListJobResponseBodyJobListJobOutputPropertiesStreamsAudioStreamList();
            return TeaModel.build(map, self);
        }

        public ListJobResponseBodyJobListJobOutputPropertiesStreamsAudioStreamList setAudioStream(java.util.List<ListJobResponseBodyJobListJobOutputPropertiesStreamsAudioStreamListAudioStream> audioStream) {
            this.audioStream = audioStream;
            return this;
        }
        public java.util.List<ListJobResponseBodyJobListJobOutputPropertiesStreamsAudioStreamListAudioStream> getAudioStream() {
            return this.audioStream;
        }

    }

    public static class ListJobResponseBodyJobListJobOutputPropertiesStreamsSubtitleStreamListSubtitleStream extends TeaModel {
        /**
         * <p>The sequence number of the subtitle stream. The value indicates the position of the subtitle stream in all subtitle streams.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Index")
        public String index;

        /**
         * <p>The language of the subtitle stream.</p>
         * 
         * <strong>example:</strong>
         * <p>und</p>
         */
        @NameInMap("Lang")
        public String lang;

        public static ListJobResponseBodyJobListJobOutputPropertiesStreamsSubtitleStreamListSubtitleStream build(java.util.Map<String, ?> map) throws Exception {
            ListJobResponseBodyJobListJobOutputPropertiesStreamsSubtitleStreamListSubtitleStream self = new ListJobResponseBodyJobListJobOutputPropertiesStreamsSubtitleStreamListSubtitleStream();
            return TeaModel.build(map, self);
        }

        public ListJobResponseBodyJobListJobOutputPropertiesStreamsSubtitleStreamListSubtitleStream setIndex(String index) {
            this.index = index;
            return this;
        }
        public String getIndex() {
            return this.index;
        }

        public ListJobResponseBodyJobListJobOutputPropertiesStreamsSubtitleStreamListSubtitleStream setLang(String lang) {
            this.lang = lang;
            return this;
        }
        public String getLang() {
            return this.lang;
        }

    }

    public static class ListJobResponseBodyJobListJobOutputPropertiesStreamsSubtitleStreamList extends TeaModel {
        @NameInMap("SubtitleStream")
        public java.util.List<ListJobResponseBodyJobListJobOutputPropertiesStreamsSubtitleStreamListSubtitleStream> subtitleStream;

        public static ListJobResponseBodyJobListJobOutputPropertiesStreamsSubtitleStreamList build(java.util.Map<String, ?> map) throws Exception {
            ListJobResponseBodyJobListJobOutputPropertiesStreamsSubtitleStreamList self = new ListJobResponseBodyJobListJobOutputPropertiesStreamsSubtitleStreamList();
            return TeaModel.build(map, self);
        }

        public ListJobResponseBodyJobListJobOutputPropertiesStreamsSubtitleStreamList setSubtitleStream(java.util.List<ListJobResponseBodyJobListJobOutputPropertiesStreamsSubtitleStreamListSubtitleStream> subtitleStream) {
            this.subtitleStream = subtitleStream;
            return this;
        }
        public java.util.List<ListJobResponseBodyJobListJobOutputPropertiesStreamsSubtitleStreamListSubtitleStream> getSubtitleStream() {
            return this.subtitleStream;
        }

    }

    public static class ListJobResponseBodyJobListJobOutputPropertiesStreamsVideoStreamListVideoStreamNetworkCost extends TeaModel {
        /**
         * <p>The average bitrate of the video stream.</p>
         * 
         * <strong>example:</strong>
         * <p>300</p>
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

        public static ListJobResponseBodyJobListJobOutputPropertiesStreamsVideoStreamListVideoStreamNetworkCost build(java.util.Map<String, ?> map) throws Exception {
            ListJobResponseBodyJobListJobOutputPropertiesStreamsVideoStreamListVideoStreamNetworkCost self = new ListJobResponseBodyJobListJobOutputPropertiesStreamsVideoStreamListVideoStreamNetworkCost();
            return TeaModel.build(map, self);
        }

        public ListJobResponseBodyJobListJobOutputPropertiesStreamsVideoStreamListVideoStreamNetworkCost setAvgBitrate(String avgBitrate) {
            this.avgBitrate = avgBitrate;
            return this;
        }
        public String getAvgBitrate() {
            return this.avgBitrate;
        }

        public ListJobResponseBodyJobListJobOutputPropertiesStreamsVideoStreamListVideoStreamNetworkCost setCostBandwidth(String costBandwidth) {
            this.costBandwidth = costBandwidth;
            return this;
        }
        public String getCostBandwidth() {
            return this.costBandwidth;
        }

        public ListJobResponseBodyJobListJobOutputPropertiesStreamsVideoStreamListVideoStreamNetworkCost setPreloadTime(String preloadTime) {
            this.preloadTime = preloadTime;
            return this;
        }
        public String getPreloadTime() {
            return this.preloadTime;
        }

    }

    public static class ListJobResponseBodyJobListJobOutputPropertiesStreamsVideoStreamListVideoStream extends TeaModel {
        /**
         * <p>The average frame rate of the video stream.</p>
         * 
         * <strong>example:</strong>
         * <p>30.0</p>
         */
        @NameInMap("AvgFPS")
        public String avgFPS;

        /**
         * <p>The bitrate of the video stream.</p>
         * 
         * <strong>example:</strong>
         * <p>421.117</p>
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
         * <p>1/60</p>
         */
        @NameInMap("CodecTimeBase")
        public String codecTimeBase;

        /**
         * <p>The display aspect ratio (DAR).</p>
         * 
         * <strong>example:</strong>
         * <p>9:16</p>
         */
        @NameInMap("Dar")
        public String dar;

        /**
         * <p>The duration of the video stream.</p>
         * 
         * <strong>example:</strong>
         * <p>17.233333</p>
         */
        @NameInMap("Duration")
        public String duration;

        /**
         * <p>The frame rate of the video stream.</p>
         * 
         * <strong>example:</strong>
         * <p>30.0</p>
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
         * <p>1280</p>
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
         * <p>The network bandwidth that was consumed.</p>
         */
        @NameInMap("NetworkCost")
        public ListJobResponseBodyJobListJobOutputPropertiesStreamsVideoStreamListVideoStreamNetworkCost networkCost;

        /**
         * <p>The total frame rate.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
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
         * <p>The start time.</p>
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
         * <p>1/15360</p>
         */
        @NameInMap("Timebase")
        public String timebase;

        /**
         * <p>The width of the video stream in pixels.</p>
         * 
         * <strong>example:</strong>
         * <p>720</p>
         */
        @NameInMap("Width")
        public String width;

        public static ListJobResponseBodyJobListJobOutputPropertiesStreamsVideoStreamListVideoStream build(java.util.Map<String, ?> map) throws Exception {
            ListJobResponseBodyJobListJobOutputPropertiesStreamsVideoStreamListVideoStream self = new ListJobResponseBodyJobListJobOutputPropertiesStreamsVideoStreamListVideoStream();
            return TeaModel.build(map, self);
        }

        public ListJobResponseBodyJobListJobOutputPropertiesStreamsVideoStreamListVideoStream setAvgFPS(String avgFPS) {
            this.avgFPS = avgFPS;
            return this;
        }
        public String getAvgFPS() {
            return this.avgFPS;
        }

        public ListJobResponseBodyJobListJobOutputPropertiesStreamsVideoStreamListVideoStream setBitrate(String bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public String getBitrate() {
            return this.bitrate;
        }

        public ListJobResponseBodyJobListJobOutputPropertiesStreamsVideoStreamListVideoStream setCodecLongName(String codecLongName) {
            this.codecLongName = codecLongName;
            return this;
        }
        public String getCodecLongName() {
            return this.codecLongName;
        }

        public ListJobResponseBodyJobListJobOutputPropertiesStreamsVideoStreamListVideoStream setCodecName(String codecName) {
            this.codecName = codecName;
            return this;
        }
        public String getCodecName() {
            return this.codecName;
        }

        public ListJobResponseBodyJobListJobOutputPropertiesStreamsVideoStreamListVideoStream setCodecTag(String codecTag) {
            this.codecTag = codecTag;
            return this;
        }
        public String getCodecTag() {
            return this.codecTag;
        }

        public ListJobResponseBodyJobListJobOutputPropertiesStreamsVideoStreamListVideoStream setCodecTagString(String codecTagString) {
            this.codecTagString = codecTagString;
            return this;
        }
        public String getCodecTagString() {
            return this.codecTagString;
        }

        public ListJobResponseBodyJobListJobOutputPropertiesStreamsVideoStreamListVideoStream setCodecTimeBase(String codecTimeBase) {
            this.codecTimeBase = codecTimeBase;
            return this;
        }
        public String getCodecTimeBase() {
            return this.codecTimeBase;
        }

        public ListJobResponseBodyJobListJobOutputPropertiesStreamsVideoStreamListVideoStream setDar(String dar) {
            this.dar = dar;
            return this;
        }
        public String getDar() {
            return this.dar;
        }

        public ListJobResponseBodyJobListJobOutputPropertiesStreamsVideoStreamListVideoStream setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public ListJobResponseBodyJobListJobOutputPropertiesStreamsVideoStreamListVideoStream setFps(String fps) {
            this.fps = fps;
            return this;
        }
        public String getFps() {
            return this.fps;
        }

        public ListJobResponseBodyJobListJobOutputPropertiesStreamsVideoStreamListVideoStream setHasBFrames(String hasBFrames) {
            this.hasBFrames = hasBFrames;
            return this;
        }
        public String getHasBFrames() {
            return this.hasBFrames;
        }

        public ListJobResponseBodyJobListJobOutputPropertiesStreamsVideoStreamListVideoStream setHeight(String height) {
            this.height = height;
            return this;
        }
        public String getHeight() {
            return this.height;
        }

        public ListJobResponseBodyJobListJobOutputPropertiesStreamsVideoStreamListVideoStream setIndex(String index) {
            this.index = index;
            return this;
        }
        public String getIndex() {
            return this.index;
        }

        public ListJobResponseBodyJobListJobOutputPropertiesStreamsVideoStreamListVideoStream setLang(String lang) {
            this.lang = lang;
            return this;
        }
        public String getLang() {
            return this.lang;
        }

        public ListJobResponseBodyJobListJobOutputPropertiesStreamsVideoStreamListVideoStream setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public ListJobResponseBodyJobListJobOutputPropertiesStreamsVideoStreamListVideoStream setNetworkCost(ListJobResponseBodyJobListJobOutputPropertiesStreamsVideoStreamListVideoStreamNetworkCost networkCost) {
            this.networkCost = networkCost;
            return this;
        }
        public ListJobResponseBodyJobListJobOutputPropertiesStreamsVideoStreamListVideoStreamNetworkCost getNetworkCost() {
            return this.networkCost;
        }

        public ListJobResponseBodyJobListJobOutputPropertiesStreamsVideoStreamListVideoStream setNumFrames(String numFrames) {
            this.numFrames = numFrames;
            return this;
        }
        public String getNumFrames() {
            return this.numFrames;
        }

        public ListJobResponseBodyJobListJobOutputPropertiesStreamsVideoStreamListVideoStream setPixFmt(String pixFmt) {
            this.pixFmt = pixFmt;
            return this;
        }
        public String getPixFmt() {
            return this.pixFmt;
        }

        public ListJobResponseBodyJobListJobOutputPropertiesStreamsVideoStreamListVideoStream setProfile(String profile) {
            this.profile = profile;
            return this;
        }
        public String getProfile() {
            return this.profile;
        }

        public ListJobResponseBodyJobListJobOutputPropertiesStreamsVideoStreamListVideoStream setSar(String sar) {
            this.sar = sar;
            return this;
        }
        public String getSar() {
            return this.sar;
        }

        public ListJobResponseBodyJobListJobOutputPropertiesStreamsVideoStreamListVideoStream setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public ListJobResponseBodyJobListJobOutputPropertiesStreamsVideoStreamListVideoStream setTimebase(String timebase) {
            this.timebase = timebase;
            return this;
        }
        public String getTimebase() {
            return this.timebase;
        }

        public ListJobResponseBodyJobListJobOutputPropertiesStreamsVideoStreamListVideoStream setWidth(String width) {
            this.width = width;
            return this;
        }
        public String getWidth() {
            return this.width;
        }

    }

    public static class ListJobResponseBodyJobListJobOutputPropertiesStreamsVideoStreamList extends TeaModel {
        @NameInMap("VideoStream")
        public java.util.List<ListJobResponseBodyJobListJobOutputPropertiesStreamsVideoStreamListVideoStream> videoStream;

        public static ListJobResponseBodyJobListJobOutputPropertiesStreamsVideoStreamList build(java.util.Map<String, ?> map) throws Exception {
            ListJobResponseBodyJobListJobOutputPropertiesStreamsVideoStreamList self = new ListJobResponseBodyJobListJobOutputPropertiesStreamsVideoStreamList();
            return TeaModel.build(map, self);
        }

        public ListJobResponseBodyJobListJobOutputPropertiesStreamsVideoStreamList setVideoStream(java.util.List<ListJobResponseBodyJobListJobOutputPropertiesStreamsVideoStreamListVideoStream> videoStream) {
            this.videoStream = videoStream;
            return this;
        }
        public java.util.List<ListJobResponseBodyJobListJobOutputPropertiesStreamsVideoStreamListVideoStream> getVideoStream() {
            return this.videoStream;
        }

    }

    public static class ListJobResponseBodyJobListJobOutputPropertiesStreams extends TeaModel {
        /**
         * <p>The audio streams.</p>
         */
        @NameInMap("AudioStreamList")
        public ListJobResponseBodyJobListJobOutputPropertiesStreamsAudioStreamList audioStreamList;

        /**
         * <p>The subtitle streams.</p>
         */
        @NameInMap("SubtitleStreamList")
        public ListJobResponseBodyJobListJobOutputPropertiesStreamsSubtitleStreamList subtitleStreamList;

        /**
         * <p>The video streams.</p>
         */
        @NameInMap("VideoStreamList")
        public ListJobResponseBodyJobListJobOutputPropertiesStreamsVideoStreamList videoStreamList;

        public static ListJobResponseBodyJobListJobOutputPropertiesStreams build(java.util.Map<String, ?> map) throws Exception {
            ListJobResponseBodyJobListJobOutputPropertiesStreams self = new ListJobResponseBodyJobListJobOutputPropertiesStreams();
            return TeaModel.build(map, self);
        }

        public ListJobResponseBodyJobListJobOutputPropertiesStreams setAudioStreamList(ListJobResponseBodyJobListJobOutputPropertiesStreamsAudioStreamList audioStreamList) {
            this.audioStreamList = audioStreamList;
            return this;
        }
        public ListJobResponseBodyJobListJobOutputPropertiesStreamsAudioStreamList getAudioStreamList() {
            return this.audioStreamList;
        }

        public ListJobResponseBodyJobListJobOutputPropertiesStreams setSubtitleStreamList(ListJobResponseBodyJobListJobOutputPropertiesStreamsSubtitleStreamList subtitleStreamList) {
            this.subtitleStreamList = subtitleStreamList;
            return this;
        }
        public ListJobResponseBodyJobListJobOutputPropertiesStreamsSubtitleStreamList getSubtitleStreamList() {
            return this.subtitleStreamList;
        }

        public ListJobResponseBodyJobListJobOutputPropertiesStreams setVideoStreamList(ListJobResponseBodyJobListJobOutputPropertiesStreamsVideoStreamList videoStreamList) {
            this.videoStreamList = videoStreamList;
            return this;
        }
        public ListJobResponseBodyJobListJobOutputPropertiesStreamsVideoStreamList getVideoStreamList() {
            return this.videoStreamList;
        }

    }

    public static class ListJobResponseBodyJobListJobOutputProperties extends TeaModel {
        /**
         * <p>The bitrate of the video.</p>
         * 
         * <strong>example:</strong>
         * <p>490</p>
         */
        @NameInMap("Bitrate")
        public String bitrate;

        /**
         * <p>The duration of the video.</p>
         * 
         * <strong>example:</strong>
         * <p>17</p>
         */
        @NameInMap("Duration")
        public String duration;

        /**
         * <p>The format of the video.</p>
         * 
         * <strong>example:</strong>
         * <p>mp4</p>
         */
        @NameInMap("FileFormat")
        public String fileFormat;

        /**
         * <p>The size of the file.</p>
         * 
         * <strong>example:</strong>
         * <p>1057273</p>
         */
        @NameInMap("FileSize")
        public String fileSize;

        /**
         * <p>The format information.</p>
         */
        @NameInMap("Format")
        public ListJobResponseBodyJobListJobOutputPropertiesFormat format;

        /**
         * <p>The frame rate of the video.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("Fps")
        public String fps;

        /**
         * <p>The height of the video.</p>
         * 
         * <strong>example:</strong>
         * <p>1280</p>
         */
        @NameInMap("Height")
        public String height;

        /**
         * <p>The stream information.</p>
         */
        @NameInMap("Streams")
        public ListJobResponseBodyJobListJobOutputPropertiesStreams streams;

        /**
         * <p>The width of the video.</p>
         * 
         * <strong>example:</strong>
         * <p>720</p>
         */
        @NameInMap("Width")
        public String width;

        public static ListJobResponseBodyJobListJobOutputProperties build(java.util.Map<String, ?> map) throws Exception {
            ListJobResponseBodyJobListJobOutputProperties self = new ListJobResponseBodyJobListJobOutputProperties();
            return TeaModel.build(map, self);
        }

        public ListJobResponseBodyJobListJobOutputProperties setBitrate(String bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public String getBitrate() {
            return this.bitrate;
        }

        public ListJobResponseBodyJobListJobOutputProperties setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public ListJobResponseBodyJobListJobOutputProperties setFileFormat(String fileFormat) {
            this.fileFormat = fileFormat;
            return this;
        }
        public String getFileFormat() {
            return this.fileFormat;
        }

        public ListJobResponseBodyJobListJobOutputProperties setFileSize(String fileSize) {
            this.fileSize = fileSize;
            return this;
        }
        public String getFileSize() {
            return this.fileSize;
        }

        public ListJobResponseBodyJobListJobOutputProperties setFormat(ListJobResponseBodyJobListJobOutputPropertiesFormat format) {
            this.format = format;
            return this;
        }
        public ListJobResponseBodyJobListJobOutputPropertiesFormat getFormat() {
            return this.format;
        }

        public ListJobResponseBodyJobListJobOutputProperties setFps(String fps) {
            this.fps = fps;
            return this;
        }
        public String getFps() {
            return this.fps;
        }

        public ListJobResponseBodyJobListJobOutputProperties setHeight(String height) {
            this.height = height;
            return this;
        }
        public String getHeight() {
            return this.height;
        }

        public ListJobResponseBodyJobListJobOutputProperties setStreams(ListJobResponseBodyJobListJobOutputPropertiesStreams streams) {
            this.streams = streams;
            return this;
        }
        public ListJobResponseBodyJobListJobOutputPropertiesStreams getStreams() {
            return this.streams;
        }

        public ListJobResponseBodyJobListJobOutputProperties setWidth(String width) {
            this.width = width;
            return this;
        }
        public String getWidth() {
            return this.width;
        }

    }

    public static class ListJobResponseBodyJobListJobOutputSubtitleConfigExtSubtitleListExtSubtitleInput extends TeaModel {
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

        public static ListJobResponseBodyJobListJobOutputSubtitleConfigExtSubtitleListExtSubtitleInput build(java.util.Map<String, ?> map) throws Exception {
            ListJobResponseBodyJobListJobOutputSubtitleConfigExtSubtitleListExtSubtitleInput self = new ListJobResponseBodyJobListJobOutputSubtitleConfigExtSubtitleListExtSubtitleInput();
            return TeaModel.build(map, self);
        }

        public ListJobResponseBodyJobListJobOutputSubtitleConfigExtSubtitleListExtSubtitleInput setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

        public ListJobResponseBodyJobListJobOutputSubtitleConfigExtSubtitleListExtSubtitleInput setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public ListJobResponseBodyJobListJobOutputSubtitleConfigExtSubtitleListExtSubtitleInput setObject(String object) {
            this.object = object;
            return this;
        }
        public String getObject() {
            return this.object;
        }

    }

    public static class ListJobResponseBodyJobListJobOutputSubtitleConfigExtSubtitleListExtSubtitle extends TeaModel {
        /**
         * <p>The character set used by the external subtitle.</p>
         * <ul>
         * <li>Valid values: UTF-8, GBK, BIG5, and auto.</li>
         * <li>Default value: <strong>auto</strong>.</li>
         * </ul>
         * <blockquote>
         * <p> If this parameter is set to auto, the detected character set may not be the actual character set. We recommend that you set this parameter to another value.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>auto</p>
         */
        @NameInMap("CharEnc")
        public String charEnc;

        /**
         * <p>The font of the hardcoded subtitles converted from external subtitles.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;WenQuanYi Zen Hei&quot;, &quot;Yuanti SC Regular&quot;, &quot;SimSun&quot;</p>
         */
        @NameInMap("FontName")
        public String fontName;

        /**
         * <p>The input subtitle file.</p>
         * <ul>
         * <li>Files in the SRT or ASS format are supported. For more information, see <a href="https://help.aliyun.com/document_detail/29253.html">Parameter details</a>.</li>
         * <li>Example: <code>{&quot;Bucket&quot;:&quot;example-bucket&quot;,&quot;Location&quot;:&quot;oss-cn-hangzhou&quot;,&quot;Object&quot;:&quot;example.srt&quot;}</code>.</li>
         * </ul>
         */
        @NameInMap("Input")
        public ListJobResponseBodyJobListJobOutputSubtitleConfigExtSubtitleListExtSubtitleInput input;

        public static ListJobResponseBodyJobListJobOutputSubtitleConfigExtSubtitleListExtSubtitle build(java.util.Map<String, ?> map) throws Exception {
            ListJobResponseBodyJobListJobOutputSubtitleConfigExtSubtitleListExtSubtitle self = new ListJobResponseBodyJobListJobOutputSubtitleConfigExtSubtitleListExtSubtitle();
            return TeaModel.build(map, self);
        }

        public ListJobResponseBodyJobListJobOutputSubtitleConfigExtSubtitleListExtSubtitle setCharEnc(String charEnc) {
            this.charEnc = charEnc;
            return this;
        }
        public String getCharEnc() {
            return this.charEnc;
        }

        public ListJobResponseBodyJobListJobOutputSubtitleConfigExtSubtitleListExtSubtitle setFontName(String fontName) {
            this.fontName = fontName;
            return this;
        }
        public String getFontName() {
            return this.fontName;
        }

        public ListJobResponseBodyJobListJobOutputSubtitleConfigExtSubtitleListExtSubtitle setInput(ListJobResponseBodyJobListJobOutputSubtitleConfigExtSubtitleListExtSubtitleInput input) {
            this.input = input;
            return this;
        }
        public ListJobResponseBodyJobListJobOutputSubtitleConfigExtSubtitleListExtSubtitleInput getInput() {
            return this.input;
        }

    }

    public static class ListJobResponseBodyJobListJobOutputSubtitleConfigExtSubtitleList extends TeaModel {
        @NameInMap("ExtSubtitle")
        public java.util.List<ListJobResponseBodyJobListJobOutputSubtitleConfigExtSubtitleListExtSubtitle> extSubtitle;

        public static ListJobResponseBodyJobListJobOutputSubtitleConfigExtSubtitleList build(java.util.Map<String, ?> map) throws Exception {
            ListJobResponseBodyJobListJobOutputSubtitleConfigExtSubtitleList self = new ListJobResponseBodyJobListJobOutputSubtitleConfigExtSubtitleList();
            return TeaModel.build(map, self);
        }

        public ListJobResponseBodyJobListJobOutputSubtitleConfigExtSubtitleList setExtSubtitle(java.util.List<ListJobResponseBodyJobListJobOutputSubtitleConfigExtSubtitleListExtSubtitle> extSubtitle) {
            this.extSubtitle = extSubtitle;
            return this;
        }
        public java.util.List<ListJobResponseBodyJobListJobOutputSubtitleConfigExtSubtitleListExtSubtitle> getExtSubtitle() {
            return this.extSubtitle;
        }

    }

    public static class ListJobResponseBodyJobListJobOutputSubtitleConfigSubtitleListSubtitle extends TeaModel {
        /**
         * <p>The sequence number of the video stream. The sequence number is the index of the video stream in the list and starts from 0. If you do not set the corresponding parameter in the request, the default video stream is selected.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Map")
        public String map;

        public static ListJobResponseBodyJobListJobOutputSubtitleConfigSubtitleListSubtitle build(java.util.Map<String, ?> map) throws Exception {
            ListJobResponseBodyJobListJobOutputSubtitleConfigSubtitleListSubtitle self = new ListJobResponseBodyJobListJobOutputSubtitleConfigSubtitleListSubtitle();
            return TeaModel.build(map, self);
        }

        public ListJobResponseBodyJobListJobOutputSubtitleConfigSubtitleListSubtitle setMap(String map) {
            this.map = map;
            return this;
        }
        public String getMap() {
            return this.map;
        }

    }

    public static class ListJobResponseBodyJobListJobOutputSubtitleConfigSubtitleList extends TeaModel {
        @NameInMap("Subtitle")
        public java.util.List<ListJobResponseBodyJobListJobOutputSubtitleConfigSubtitleListSubtitle> subtitle;

        public static ListJobResponseBodyJobListJobOutputSubtitleConfigSubtitleList build(java.util.Map<String, ?> map) throws Exception {
            ListJobResponseBodyJobListJobOutputSubtitleConfigSubtitleList self = new ListJobResponseBodyJobListJobOutputSubtitleConfigSubtitleList();
            return TeaModel.build(map, self);
        }

        public ListJobResponseBodyJobListJobOutputSubtitleConfigSubtitleList setSubtitle(java.util.List<ListJobResponseBodyJobListJobOutputSubtitleConfigSubtitleListSubtitle> subtitle) {
            this.subtitle = subtitle;
            return this;
        }
        public java.util.List<ListJobResponseBodyJobListJobOutputSubtitleConfigSubtitleListSubtitle> getSubtitle() {
            return this.subtitle;
        }

    }

    public static class ListJobResponseBodyJobListJobOutputSubtitleConfig extends TeaModel {
        /**
         * <p>The external subtitles. The value is a JSON array.</p>
         */
        @NameInMap("ExtSubtitleList")
        public ListJobResponseBodyJobListJobOutputSubtitleConfigExtSubtitleList extSubtitleList;

        /**
         * <p>The subtitles.</p>
         */
        @NameInMap("SubtitleList")
        public ListJobResponseBodyJobListJobOutputSubtitleConfigSubtitleList subtitleList;

        public static ListJobResponseBodyJobListJobOutputSubtitleConfig build(java.util.Map<String, ?> map) throws Exception {
            ListJobResponseBodyJobListJobOutputSubtitleConfig self = new ListJobResponseBodyJobListJobOutputSubtitleConfig();
            return TeaModel.build(map, self);
        }

        public ListJobResponseBodyJobListJobOutputSubtitleConfig setExtSubtitleList(ListJobResponseBodyJobListJobOutputSubtitleConfigExtSubtitleList extSubtitleList) {
            this.extSubtitleList = extSubtitleList;
            return this;
        }
        public ListJobResponseBodyJobListJobOutputSubtitleConfigExtSubtitleList getExtSubtitleList() {
            return this.extSubtitleList;
        }

        public ListJobResponseBodyJobListJobOutputSubtitleConfig setSubtitleList(ListJobResponseBodyJobListJobOutputSubtitleConfigSubtitleList subtitleList) {
            this.subtitleList = subtitleList;
            return this;
        }
        public ListJobResponseBodyJobListJobOutputSubtitleConfigSubtitleList getSubtitleList() {
            return this.subtitleList;
        }

    }

    public static class ListJobResponseBodyJobListJobOutputSuperReso extends TeaModel {
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

        public static ListJobResponseBodyJobListJobOutputSuperReso build(java.util.Map<String, ?> map) throws Exception {
            ListJobResponseBodyJobListJobOutputSuperReso self = new ListJobResponseBodyJobListJobOutputSuperReso();
            return TeaModel.build(map, self);
        }

        public ListJobResponseBodyJobListJobOutputSuperReso setIsHalfSample(String isHalfSample) {
            this.isHalfSample = isHalfSample;
            return this;
        }
        public String getIsHalfSample() {
            return this.isHalfSample;
        }

    }

    public static class ListJobResponseBodyJobListJobOutputTailSlateListTailSlate extends TeaModel {
        /**
         * <p>The color of the bars that are added to the ending part if the size of the ending part is smaller than that of the main part. Default value: <strong>White</strong>. For more information, see <a href="https://docs-aliyun.cn-hangzhou.oss.aliyun-inc.com/assets/attach/29253/cn_zh/1502784952344/color.txt?spm=a2c4g.11186623.2.63.1df840f74IH4Eq%5C&file=color.txt">Background colors</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>White</p>
         */
        @NameInMap("BgColor")
        public String bgColor;

        /**
         * <p>The duration of the transition between the main part and the ending part. A fade transition is used: The last frame of the main part fades out, and the first frame of the ending part fades in. Unit: seconds. Default value: 0.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("BlendDuration")
        public String blendDuration;

        /**
         * <p>The height of the ending part. Valid values: values in the range of (0, 4096), -1, and full.</p>
         * <ul>
         * <li>A value of -1 indicates that the height of the source of the ending part is retained.</li>
         * <li>A value of full indicates that the height of the ending part equals the height of the main part.</li>
         * <li>Default value: -1.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>-1</p>
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
         * <p>true</p>
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
         * <p>The width of the ending part. Valid values: values in the range of (0, 4096), -1, and full.</p>
         * <ul>
         * <li>A value of -1 indicates that the width of the source of the ending part is retained. A value of full indicates that the width of the ending part equals the width of the main part.</li>
         * <li>Default value: -1.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>-1</p>
         */
        @NameInMap("Width")
        public String width;

        public static ListJobResponseBodyJobListJobOutputTailSlateListTailSlate build(java.util.Map<String, ?> map) throws Exception {
            ListJobResponseBodyJobListJobOutputTailSlateListTailSlate self = new ListJobResponseBodyJobListJobOutputTailSlateListTailSlate();
            return TeaModel.build(map, self);
        }

        public ListJobResponseBodyJobListJobOutputTailSlateListTailSlate setBgColor(String bgColor) {
            this.bgColor = bgColor;
            return this;
        }
        public String getBgColor() {
            return this.bgColor;
        }

        public ListJobResponseBodyJobListJobOutputTailSlateListTailSlate setBlendDuration(String blendDuration) {
            this.blendDuration = blendDuration;
            return this;
        }
        public String getBlendDuration() {
            return this.blendDuration;
        }

        public ListJobResponseBodyJobListJobOutputTailSlateListTailSlate setHeight(String height) {
            this.height = height;
            return this;
        }
        public String getHeight() {
            return this.height;
        }

        public ListJobResponseBodyJobListJobOutputTailSlateListTailSlate setIsMergeAudio(Boolean isMergeAudio) {
            this.isMergeAudio = isMergeAudio;
            return this;
        }
        public Boolean getIsMergeAudio() {
            return this.isMergeAudio;
        }

        public ListJobResponseBodyJobListJobOutputTailSlateListTailSlate setStart(String start) {
            this.start = start;
            return this;
        }
        public String getStart() {
            return this.start;
        }

        public ListJobResponseBodyJobListJobOutputTailSlateListTailSlate setTailUrl(String tailUrl) {
            this.tailUrl = tailUrl;
            return this;
        }
        public String getTailUrl() {
            return this.tailUrl;
        }

        public ListJobResponseBodyJobListJobOutputTailSlateListTailSlate setWidth(String width) {
            this.width = width;
            return this;
        }
        public String getWidth() {
            return this.width;
        }

    }

    public static class ListJobResponseBodyJobListJobOutputTailSlateList extends TeaModel {
        @NameInMap("TailSlate")
        public java.util.List<ListJobResponseBodyJobListJobOutputTailSlateListTailSlate> tailSlate;

        public static ListJobResponseBodyJobListJobOutputTailSlateList build(java.util.Map<String, ?> map) throws Exception {
            ListJobResponseBodyJobListJobOutputTailSlateList self = new ListJobResponseBodyJobListJobOutputTailSlateList();
            return TeaModel.build(map, self);
        }

        public ListJobResponseBodyJobListJobOutputTailSlateList setTailSlate(java.util.List<ListJobResponseBodyJobListJobOutputTailSlateListTailSlate> tailSlate) {
            this.tailSlate = tailSlate;
            return this;
        }
        public java.util.List<ListJobResponseBodyJobListJobOutputTailSlateListTailSlate> getTailSlate() {
            return this.tailSlate;
        }

    }

    public static class ListJobResponseBodyJobListJobOutputTransConfig extends TeaModel {
        /**
         * <p>The method of resolution adjustment. Default value: <strong>none</strong>. Valid values: rescale, crop, pad, and none.</p>
         * 
         * <strong>example:</strong>
         * <p>none</p>
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
         * <p>Indicates whether the audio bitrate is checked. If the bitrate of the output audio is higher than that of the input audio, a transcoding failure is returned without transcoding the audio. This parameter has a higher priority than IsCheckAudioBitrate. Valid values:</p>
         * <ul>
         * <li><strong>false</strong>: The audio bitrate is checked.</li>
         * <li><strong>true</strong>: The audio bitrate is not checked.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
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
         * <p>Indicates whether the resolution is checked. If the output resolution is higher than the input resolution based on the width or height, a transcoding failure is returned. Valid values:</p>
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
         * <p>Indicates whether the video bitrate is checked. If the bitrate of the output video is higher than that of the input video, a transcoding failure is returned without transcoding the video. This parameter has a higher priority than IsCheckVideoBitrate. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * <li>Default value: false.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("IsCheckVideoBitrateFail")
        public String isCheckVideoBitrateFail;

        /**
         * <p>The transcoding mode.</p>
         * <ul>
         * <li>Valid values: onepass, twopass, and CBR.</li>
         * <li>Default value: onepass.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>onepass</p>
         */
        @NameInMap("TransMode")
        public String transMode;

        public static ListJobResponseBodyJobListJobOutputTransConfig build(java.util.Map<String, ?> map) throws Exception {
            ListJobResponseBodyJobListJobOutputTransConfig self = new ListJobResponseBodyJobListJobOutputTransConfig();
            return TeaModel.build(map, self);
        }

        public ListJobResponseBodyJobListJobOutputTransConfig setAdjDarMethod(String adjDarMethod) {
            this.adjDarMethod = adjDarMethod;
            return this;
        }
        public String getAdjDarMethod() {
            return this.adjDarMethod;
        }

        public ListJobResponseBodyJobListJobOutputTransConfig setIsCheckAudioBitrate(String isCheckAudioBitrate) {
            this.isCheckAudioBitrate = isCheckAudioBitrate;
            return this;
        }
        public String getIsCheckAudioBitrate() {
            return this.isCheckAudioBitrate;
        }

        public ListJobResponseBodyJobListJobOutputTransConfig setIsCheckAudioBitrateFail(String isCheckAudioBitrateFail) {
            this.isCheckAudioBitrateFail = isCheckAudioBitrateFail;
            return this;
        }
        public String getIsCheckAudioBitrateFail() {
            return this.isCheckAudioBitrateFail;
        }

        public ListJobResponseBodyJobListJobOutputTransConfig setIsCheckReso(String isCheckReso) {
            this.isCheckReso = isCheckReso;
            return this;
        }
        public String getIsCheckReso() {
            return this.isCheckReso;
        }

        public ListJobResponseBodyJobListJobOutputTransConfig setIsCheckResoFail(String isCheckResoFail) {
            this.isCheckResoFail = isCheckResoFail;
            return this;
        }
        public String getIsCheckResoFail() {
            return this.isCheckResoFail;
        }

        public ListJobResponseBodyJobListJobOutputTransConfig setIsCheckVideoBitrate(String isCheckVideoBitrate) {
            this.isCheckVideoBitrate = isCheckVideoBitrate;
            return this;
        }
        public String getIsCheckVideoBitrate() {
            return this.isCheckVideoBitrate;
        }

        public ListJobResponseBodyJobListJobOutputTransConfig setIsCheckVideoBitrateFail(String isCheckVideoBitrateFail) {
            this.isCheckVideoBitrateFail = isCheckVideoBitrateFail;
            return this;
        }
        public String getIsCheckVideoBitrateFail() {
            return this.isCheckVideoBitrateFail;
        }

        public ListJobResponseBodyJobListJobOutputTransConfig setTransMode(String transMode) {
            this.transMode = transMode;
            return this;
        }
        public String getTransMode() {
            return this.transMode;
        }

    }

    public static class ListJobResponseBodyJobListJobOutputVideoBitrateBnd extends TeaModel {
        /**
         * <p>The maximum bitrate. Unit: Kbit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("Max")
        public String max;

        /**
         * <p>The minimum bitrate. Unit: Kbit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("Min")
        public String min;

        public static ListJobResponseBodyJobListJobOutputVideoBitrateBnd build(java.util.Map<String, ?> map) throws Exception {
            ListJobResponseBodyJobListJobOutputVideoBitrateBnd self = new ListJobResponseBodyJobListJobOutputVideoBitrateBnd();
            return TeaModel.build(map, self);
        }

        public ListJobResponseBodyJobListJobOutputVideoBitrateBnd setMax(String max) {
            this.max = max;
            return this;
        }
        public String getMax() {
            return this.max;
        }

        public ListJobResponseBodyJobListJobOutputVideoBitrateBnd setMin(String min) {
            this.min = min;
            return this;
        }
        public String getMin() {
            return this.min;
        }

    }

    public static class ListJobResponseBodyJobListJobOutputVideo extends TeaModel {
        /**
         * <p>The average bitrate of the video. Unit: Kbit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>428</p>
         */
        @NameInMap("Bitrate")
        public String bitrate;

        /**
         * <p>The bitrate range of the video.</p>
         */
        @NameInMap("BitrateBnd")
        public ListJobResponseBodyJobListJobOutputVideoBitrateBnd bitrateBnd;

        /**
         * <p>The size of the buffer.</p>
         * 
         * <strong>example:</strong>
         * <p>6000</p>
         */
        @NameInMap("Bufsize")
        public String bufsize;

        /**
         * <p>The video codec. Valid values: <strong>H.264</strong>, <strong>H.265</strong>, <strong>GIF</strong>, and <strong>WEBP</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>H.264</p>
         */
        @NameInMap("Codec")
        public String codec;

        /**
         * <p>The constant rate factor. If this parameter is returned, the value of Bitrate is invalid. Default value: <strong>26</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>26</p>
         */
        @NameInMap("Crf")
        public String crf;

        /**
         * <p>The video cropping mode. Valid values:</p>
         * <ul>
         * <li><strong>border</strong>: automatically detects and removes black borders.</li>
         * <li>A value in the width:height:left:top format: crops the videos based on the custom settings. Example: 1280:800:0:140.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>border</p>
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
         * <li>The value is 60 if the frame rate of the input video exceeds 60.</li>
         * <li>Default value: the frame rate of the input file.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>25</p>
         */
        @NameInMap("Fps")
        public String fps;

        /**
         * <p>The maximum number of frames between two keyframes. Default value: 250.</p>
         * 
         * <strong>example:</strong>
         * <p>250</p>
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
         * <p>720</p>
         */
        @NameInMap("Height")
        public String height;

        /**
         * <p>The maximum frame rate.</p>
         * 
         * <strong>example:</strong>
         * <p>60</p>
         */
        @NameInMap("MaxFps")
        public String maxFps;

        /**
         * <p>The maximum bitrate of the video. Unit: Kbit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("Maxrate")
        public String maxrate;

        /**
         * <p>The black borders that are added to the video. Unit: pixel.</p>
         * <ul>
         * <li>Format: width:height:left:top.</li>
         * <li>Example: 1280:800:0:140.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1280:800:0:140</p>
         */
        @NameInMap("Pad")
        public String pad;

        /**
         * <p>The pixel format of the video. Valid values: standard pixel formats such as yuv420p and yuvj420p.</p>
         * 
         * <strong>example:</strong>
         * <p>yuv420p</p>
         */
        @NameInMap("PixFmt")
        public String pixFmt;

        /**
         * <p>The preset video algorithm. Default value: medium. Valid values:</p>
         * <ul>
         * <li><strong>veryfast</strong></li>
         * <li><strong>fast</strong></li>
         * <li><strong>medium</strong></li>
         * <li><strong>slow</strong></li>
         * <li><strong>slower</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>medium</p>
         */
        @NameInMap("Preset")
        public String preset;

        /**
         * <p>The codec profile. Valid values:</p>
         * <ul>
         * <li><strong>baseline</strong>: applicable to mobile devices.</li>
         * <li><strong>main</strong>: applicable to standard-definition devices.</li>
         * <li><strong>high</strong>: applicable to high-definition devices.</li>
         * <li>Default value: <strong>high</strong>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>high</p>
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
         * <li>Default value: the width of the input video.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1280</p>
         */
        @NameInMap("Width")
        public String width;

        public static ListJobResponseBodyJobListJobOutputVideo build(java.util.Map<String, ?> map) throws Exception {
            ListJobResponseBodyJobListJobOutputVideo self = new ListJobResponseBodyJobListJobOutputVideo();
            return TeaModel.build(map, self);
        }

        public ListJobResponseBodyJobListJobOutputVideo setBitrate(String bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public String getBitrate() {
            return this.bitrate;
        }

        public ListJobResponseBodyJobListJobOutputVideo setBitrateBnd(ListJobResponseBodyJobListJobOutputVideoBitrateBnd bitrateBnd) {
            this.bitrateBnd = bitrateBnd;
            return this;
        }
        public ListJobResponseBodyJobListJobOutputVideoBitrateBnd getBitrateBnd() {
            return this.bitrateBnd;
        }

        public ListJobResponseBodyJobListJobOutputVideo setBufsize(String bufsize) {
            this.bufsize = bufsize;
            return this;
        }
        public String getBufsize() {
            return this.bufsize;
        }

        public ListJobResponseBodyJobListJobOutputVideo setCodec(String codec) {
            this.codec = codec;
            return this;
        }
        public String getCodec() {
            return this.codec;
        }

        public ListJobResponseBodyJobListJobOutputVideo setCrf(String crf) {
            this.crf = crf;
            return this;
        }
        public String getCrf() {
            return this.crf;
        }

        public ListJobResponseBodyJobListJobOutputVideo setCrop(String crop) {
            this.crop = crop;
            return this;
        }
        public String getCrop() {
            return this.crop;
        }

        public ListJobResponseBodyJobListJobOutputVideo setDegrain(String degrain) {
            this.degrain = degrain;
            return this;
        }
        public String getDegrain() {
            return this.degrain;
        }

        public ListJobResponseBodyJobListJobOutputVideo setFps(String fps) {
            this.fps = fps;
            return this;
        }
        public String getFps() {
            return this.fps;
        }

        public ListJobResponseBodyJobListJobOutputVideo setGop(String gop) {
            this.gop = gop;
            return this;
        }
        public String getGop() {
            return this.gop;
        }

        public ListJobResponseBodyJobListJobOutputVideo setHeight(String height) {
            this.height = height;
            return this;
        }
        public String getHeight() {
            return this.height;
        }

        public ListJobResponseBodyJobListJobOutputVideo setMaxFps(String maxFps) {
            this.maxFps = maxFps;
            return this;
        }
        public String getMaxFps() {
            return this.maxFps;
        }

        public ListJobResponseBodyJobListJobOutputVideo setMaxrate(String maxrate) {
            this.maxrate = maxrate;
            return this;
        }
        public String getMaxrate() {
            return this.maxrate;
        }

        public ListJobResponseBodyJobListJobOutputVideo setPad(String pad) {
            this.pad = pad;
            return this;
        }
        public String getPad() {
            return this.pad;
        }

        public ListJobResponseBodyJobListJobOutputVideo setPixFmt(String pixFmt) {
            this.pixFmt = pixFmt;
            return this;
        }
        public String getPixFmt() {
            return this.pixFmt;
        }

        public ListJobResponseBodyJobListJobOutputVideo setPreset(String preset) {
            this.preset = preset;
            return this;
        }
        public String getPreset() {
            return this.preset;
        }

        public ListJobResponseBodyJobListJobOutputVideo setProfile(String profile) {
            this.profile = profile;
            return this;
        }
        public String getProfile() {
            return this.profile;
        }

        public ListJobResponseBodyJobListJobOutputVideo setQscale(String qscale) {
            this.qscale = qscale;
            return this;
        }
        public String getQscale() {
            return this.qscale;
        }

        public ListJobResponseBodyJobListJobOutputVideo setResoPriority(String resoPriority) {
            this.resoPriority = resoPriority;
            return this;
        }
        public String getResoPriority() {
            return this.resoPriority;
        }

        public ListJobResponseBodyJobListJobOutputVideo setScanMode(String scanMode) {
            this.scanMode = scanMode;
            return this;
        }
        public String getScanMode() {
            return this.scanMode;
        }

        public ListJobResponseBodyJobListJobOutputVideo setWidth(String width) {
            this.width = width;
            return this;
        }
        public String getWidth() {
            return this.width;
        }

    }

    public static class ListJobResponseBodyJobListJobOutputWaterMarkListWaterMarkInputFile extends TeaModel {
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
         * <p>The name of the Object Storage Service (OSS) object that is used as the input file.</p>
         * 
         * <strong>example:</strong>
         * <p>example-logo-****.png</p>
         */
        @NameInMap("Object")
        public String object;

        public static ListJobResponseBodyJobListJobOutputWaterMarkListWaterMarkInputFile build(java.util.Map<String, ?> map) throws Exception {
            ListJobResponseBodyJobListJobOutputWaterMarkListWaterMarkInputFile self = new ListJobResponseBodyJobListJobOutputWaterMarkListWaterMarkInputFile();
            return TeaModel.build(map, self);
        }

        public ListJobResponseBodyJobListJobOutputWaterMarkListWaterMarkInputFile setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

        public ListJobResponseBodyJobListJobOutputWaterMarkListWaterMarkInputFile setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public ListJobResponseBodyJobListJobOutputWaterMarkListWaterMarkInputFile setObject(String object) {
            this.object = object;
            return this;
        }
        public String getObject() {
            return this.object;
        }

    }

    public static class ListJobResponseBodyJobListJobOutputWaterMarkListWaterMark extends TeaModel {
        /**
         * <p>The horizontal offset of the watermark image relative to the output video. If this parameter is specified in the request, the corresponding parameter in the watermark template is overwritten. Default value: 0. The value can be an integer or a decimal number.</p>
         * <ul>
         * <li><p>An integer indicates the pixel value of the horizontal offset.</p>
         * <ul>
         * <li>Valid values: [8,4096].</li>
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
         * <p>100</p>
         */
        @NameInMap("Dx")
        public String dx;

        /**
         * <p>The vertical offset of the watermark image relative to the output video. If this parameter is specified in the request, the corresponding parameter in the watermark template is overwritten. The value can be an integer or a decimal number.</p>
         * <ul>
         * <li><p>An integer indicates the pixel value of the vertical offset.</p>
         * <ul>
         * <li>Valid values: [8,4096].</li>
         * <li>Unit: pixel.</li>
         * </ul>
         * </li>
         * <li><p>A decimal indicates the ratio of the vertical offset to the height in the output video resolution.</p>
         * <ul>
         * <li>Valid values: (0,1).</li>
         * <li>The decimal number can be accurate to four decimal places, such as 0.9999. Excess digits are automatically deleted.</li>
         * </ul>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Dy")
        public String dy;

        /**
         * <p>The height of the watermark. If this parameter is specified in the request, the corresponding parameter in the specified watermark template is overwritten. The value can be an integer or a decimal number.</p>
         * <ul>
         * <li><p>An integer indicates the pixel value of the watermark height.</p>
         * <ul>
         * <li>Valid values: [8,4096].</li>
         * <li>Unit: pixel.</li>
         * </ul>
         * </li>
         * <li><p>A decimal indicates the ratio of the watermark height to the height in the output video resolution.</p>
         * <ul>
         * <li>Valid values: (0,1).</li>
         * <li>The decimal number can be accurate to four decimal places, such as 0.9999. Excess digits are automatically deleted.</li>
         * </ul>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("Height")
        public String height;

        /**
         * <p>The watermark input file.</p>
         */
        @NameInMap("InputFile")
        public ListJobResponseBodyJobListJobOutputWaterMarkListWaterMarkInputFile inputFile;

        /**
         * <p>The position of the watermark.</p>
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
         * <li>Valid values: [8,4096].</li>
         * <li>Unit: pixel.</li>
         * </ul>
         * </li>
         * <li><p>A decimal indicates the ratio of the watermark width to the width in the output video resolution.</p>
         * <ul>
         * <li>Valid values: (0,1).</li>
         * <li>The decimal number can be accurate to four decimal places, such as 0.9999. Excess digits are automatically deleted.</li>
         * </ul>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("Width")
        public String width;

        public static ListJobResponseBodyJobListJobOutputWaterMarkListWaterMark build(java.util.Map<String, ?> map) throws Exception {
            ListJobResponseBodyJobListJobOutputWaterMarkListWaterMark self = new ListJobResponseBodyJobListJobOutputWaterMarkListWaterMark();
            return TeaModel.build(map, self);
        }

        public ListJobResponseBodyJobListJobOutputWaterMarkListWaterMark setDx(String dx) {
            this.dx = dx;
            return this;
        }
        public String getDx() {
            return this.dx;
        }

        public ListJobResponseBodyJobListJobOutputWaterMarkListWaterMark setDy(String dy) {
            this.dy = dy;
            return this;
        }
        public String getDy() {
            return this.dy;
        }

        public ListJobResponseBodyJobListJobOutputWaterMarkListWaterMark setHeight(String height) {
            this.height = height;
            return this;
        }
        public String getHeight() {
            return this.height;
        }

        public ListJobResponseBodyJobListJobOutputWaterMarkListWaterMark setInputFile(ListJobResponseBodyJobListJobOutputWaterMarkListWaterMarkInputFile inputFile) {
            this.inputFile = inputFile;
            return this;
        }
        public ListJobResponseBodyJobListJobOutputWaterMarkListWaterMarkInputFile getInputFile() {
            return this.inputFile;
        }

        public ListJobResponseBodyJobListJobOutputWaterMarkListWaterMark setReferPos(String referPos) {
            this.referPos = referPos;
            return this;
        }
        public String getReferPos() {
            return this.referPos;
        }

        public ListJobResponseBodyJobListJobOutputWaterMarkListWaterMark setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public ListJobResponseBodyJobListJobOutputWaterMarkListWaterMark setWaterMarkTemplateId(String waterMarkTemplateId) {
            this.waterMarkTemplateId = waterMarkTemplateId;
            return this;
        }
        public String getWaterMarkTemplateId() {
            return this.waterMarkTemplateId;
        }

        public ListJobResponseBodyJobListJobOutputWaterMarkListWaterMark setWidth(String width) {
            this.width = width;
            return this;
        }
        public String getWidth() {
            return this.width;
        }

    }

    public static class ListJobResponseBodyJobListJobOutputWaterMarkList extends TeaModel {
        @NameInMap("WaterMark")
        public java.util.List<ListJobResponseBodyJobListJobOutputWaterMarkListWaterMark> waterMark;

        public static ListJobResponseBodyJobListJobOutputWaterMarkList build(java.util.Map<String, ?> map) throws Exception {
            ListJobResponseBodyJobListJobOutputWaterMarkList self = new ListJobResponseBodyJobListJobOutputWaterMarkList();
            return TeaModel.build(map, self);
        }

        public ListJobResponseBodyJobListJobOutputWaterMarkList setWaterMark(java.util.List<ListJobResponseBodyJobListJobOutputWaterMarkListWaterMark> waterMark) {
            this.waterMark = waterMark;
            return this;
        }
        public java.util.List<ListJobResponseBodyJobListJobOutputWaterMarkListWaterMark> getWaterMark() {
            return this.waterMark;
        }

    }

    public static class ListJobResponseBodyJobListJobOutput extends TeaModel {
        /**
         * <p>The audio configurations.</p>
         */
        @NameInMap("Audio")
        public ListJobResponseBodyJobListJobOutputAudio audio;

        /**
         * <p>The sequence number of the audio stream.</p>
         * <ul>
         * <li>Format: <code>0:a:{Sequence number}</code>.</li>
         * <li>The sequence number is the index of the audio stream in the list and starts from 0. If no sequence number is specified, the default audio stream is used.</li>
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
        public ListJobResponseBodyJobListJobOutputClip clip;

        /**
         * <p>The container format configurations.</p>
         */
        @NameInMap("Container")
        public ListJobResponseBodyJobListJobOutputContainer container;

        /**
         * <p>The configurations of watermark blurring. The value is a JSON object. For more information, see <a href="https://help.aliyun.com/document_detail/29253.html">Parameter details</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;0&quot;: [{&quot;l&quot;: 10,&quot;t&quot;: 10,&quot;w&quot;: 10,&quot;h&quot;: 10},{&quot;l&quot;: 100,&quot;t&quot;: 0.1,&quot;w&quot;: 10,&quot;h&quot;: 10}],&quot;128000&quot;: [],&quot;250000&quot;: [{&quot;l&quot;: 0.2,&quot;t&quot;: 0.1,&quot;w&quot;: 0.01,&quot;h&quot;: 0.05}]}</p>
         */
        @NameInMap("DeWatermark")
        public String deWatermark;

        /**
         * <p>The encryption configurations. Only outputs in the M3U8 format are supported.</p>
         */
        @NameInMap("Encryption")
        public ListJobResponseBodyJobListJobOutputEncryption encryption;

        /**
         * <p>The non-standard support configuration for M3U8. The value must be a JSON object. For more information, see <a href="https://help.aliyun.com/document_detail/29253.html">Parameter details</a>.</p>
         */
        @NameInMap("M3U8NonStandardSupport")
        public ListJobResponseBodyJobListJobOutputM3U8NonStandardSupport m3U8NonStandardSupport;

        /**
         * <p>The URL of the merging configuration file. You can specify either MergeList or MergeConfigUrl when you submit the transcoding job.</p>
         * <ul>
         * <li>The configuration file specified by MergeConfigUrl can contain up to 50 clips.</li>
         * <li>MergeConfigUrl indicates the URL of the configuration file for merging clips.</li>
         * <li>Make sure that the configuration file is stored as an object in OSS and that MPS can access the OSS object. For information about the file content, see the details of merging parameters.</li>
         * <li>Example of the content of the merging configuration file: <code>{&quot;MergeList&quot;:[{&quot;MergeURL&quot;:&quot;http://exampleBucket****.oss-cn-hangzhou.aliyuncs.com/video_01.mp4&quot;}]}</code>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{&quot;MergeList&quot;:[{&quot;MergeURL&quot;:&quot;<a href="http://exampleBucket****.oss-cn-hangzhou.aliyuncs.com/video_01.mp4%22%7D%5D%7D">http://exampleBucket****.oss-cn-hangzhou.aliyuncs.com/video_01.mp4&quot;}]}</a></p>
         */
        @NameInMap("MergeConfigUrl")
        public String mergeConfigUrl;

        /**
         * <p>The configurations for merging clips.</p>
         */
        @NameInMap("MergeList")
        public ListJobResponseBodyJobListJobOutputMergeList mergeList;

        /**
         * <p>The transmuxing configurations.</p>
         */
        @NameInMap("MuxConfig")
        public ListJobResponseBodyJobListJobOutputMuxConfig muxConfig;

        /**
         * <p>The opening parts.</p>
         */
        @NameInMap("OpeningList")
        public ListJobResponseBodyJobListJobOutputOpeningList openingList;

        /**
         * <p>The output subtitles.</p>
         */
        @NameInMap("OutSubtitleList")
        public ListJobResponseBodyJobListJobOutputOutSubtitleList outSubtitleList;

        /**
         * <p>The details of the output file.</p>
         */
        @NameInMap("OutputFile")
        public ListJobResponseBodyJobListJobOutputOutputFile outputFile;

        /**
         * <p>The priority of the job in the MPS queue to which the job is added.</p>
         * <ul>
         * <li>A value of 10 indicates the highest priority.</li>
         * <li>Default value: <strong>6</strong>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
        @NameInMap("Priority")
        public String priority;

        /**
         * <p>The media properties.</p>
         */
        @NameInMap("Properties")
        public ListJobResponseBodyJobListJobOutputProperties properties;

        /**
         * <p>The rotation angle of the video.</p>
         * 
         * <strong>example:</strong>
         * <p>90</p>
         */
        @NameInMap("Rotate")
        public String rotate;

        /**
         * <p>The subtitle configurations.</p>
         */
        @NameInMap("SubtitleConfig")
        public ListJobResponseBodyJobListJobOutputSubtitleConfig subtitleConfig;

        /**
         * <p>The configurations for using the resolution of the source video.</p>
         */
        @NameInMap("SuperReso")
        public ListJobResponseBodyJobListJobOutputSuperReso superReso;

        /**
         * <p>The ending parts.</p>
         */
        @NameInMap("TailSlateList")
        public ListJobResponseBodyJobListJobOutputTailSlateList tailSlateList;

        /**
         * <p>The template ID.</p>
         * 
         * <strong>example:</strong>
         * <p>S00000000-000010</p>
         */
        @NameInMap("TemplateId")
        public String templateId;

        /**
         * <p>The general transcoding configurations. If this parameter is specified in the request, the corresponding parameters in the specified transcoding template are overwritten.</p>
         */
        @NameInMap("TransConfig")
        public ListJobResponseBodyJobListJobOutputTransConfig transConfig;

        /**
         * <p>The custom data.</p>
         * 
         * <strong>example:</strong>
         * <p>test-001</p>
         */
        @NameInMap("UserData")
        public String userData;

        /**
         * <p>The video configurations.</p>
         */
        @NameInMap("Video")
        public ListJobResponseBodyJobListJobOutputVideo video;

        /**
         * <p>The sequence number of the video stream.</p>
         * <ul>
         * <li>Format: 0:a:{Sequence number}. Example value: 0:a:0.</li>
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
         */
        @NameInMap("WaterMarkList")
        public ListJobResponseBodyJobListJobOutputWaterMarkList waterMarkList;

        public static ListJobResponseBodyJobListJobOutput build(java.util.Map<String, ?> map) throws Exception {
            ListJobResponseBodyJobListJobOutput self = new ListJobResponseBodyJobListJobOutput();
            return TeaModel.build(map, self);
        }

        public ListJobResponseBodyJobListJobOutput setAudio(ListJobResponseBodyJobListJobOutputAudio audio) {
            this.audio = audio;
            return this;
        }
        public ListJobResponseBodyJobListJobOutputAudio getAudio() {
            return this.audio;
        }

        public ListJobResponseBodyJobListJobOutput setAudioStreamMap(String audioStreamMap) {
            this.audioStreamMap = audioStreamMap;
            return this;
        }
        public String getAudioStreamMap() {
            return this.audioStreamMap;
        }

        public ListJobResponseBodyJobListJobOutput setClip(ListJobResponseBodyJobListJobOutputClip clip) {
            this.clip = clip;
            return this;
        }
        public ListJobResponseBodyJobListJobOutputClip getClip() {
            return this.clip;
        }

        public ListJobResponseBodyJobListJobOutput setContainer(ListJobResponseBodyJobListJobOutputContainer container) {
            this.container = container;
            return this;
        }
        public ListJobResponseBodyJobListJobOutputContainer getContainer() {
            return this.container;
        }

        public ListJobResponseBodyJobListJobOutput setDeWatermark(String deWatermark) {
            this.deWatermark = deWatermark;
            return this;
        }
        public String getDeWatermark() {
            return this.deWatermark;
        }

        public ListJobResponseBodyJobListJobOutput setEncryption(ListJobResponseBodyJobListJobOutputEncryption encryption) {
            this.encryption = encryption;
            return this;
        }
        public ListJobResponseBodyJobListJobOutputEncryption getEncryption() {
            return this.encryption;
        }

        public ListJobResponseBodyJobListJobOutput setM3U8NonStandardSupport(ListJobResponseBodyJobListJobOutputM3U8NonStandardSupport m3U8NonStandardSupport) {
            this.m3U8NonStandardSupport = m3U8NonStandardSupport;
            return this;
        }
        public ListJobResponseBodyJobListJobOutputM3U8NonStandardSupport getM3U8NonStandardSupport() {
            return this.m3U8NonStandardSupport;
        }

        public ListJobResponseBodyJobListJobOutput setMergeConfigUrl(String mergeConfigUrl) {
            this.mergeConfigUrl = mergeConfigUrl;
            return this;
        }
        public String getMergeConfigUrl() {
            return this.mergeConfigUrl;
        }

        public ListJobResponseBodyJobListJobOutput setMergeList(ListJobResponseBodyJobListJobOutputMergeList mergeList) {
            this.mergeList = mergeList;
            return this;
        }
        public ListJobResponseBodyJobListJobOutputMergeList getMergeList() {
            return this.mergeList;
        }

        public ListJobResponseBodyJobListJobOutput setMuxConfig(ListJobResponseBodyJobListJobOutputMuxConfig muxConfig) {
            this.muxConfig = muxConfig;
            return this;
        }
        public ListJobResponseBodyJobListJobOutputMuxConfig getMuxConfig() {
            return this.muxConfig;
        }

        public ListJobResponseBodyJobListJobOutput setOpeningList(ListJobResponseBodyJobListJobOutputOpeningList openingList) {
            this.openingList = openingList;
            return this;
        }
        public ListJobResponseBodyJobListJobOutputOpeningList getOpeningList() {
            return this.openingList;
        }

        public ListJobResponseBodyJobListJobOutput setOutSubtitleList(ListJobResponseBodyJobListJobOutputOutSubtitleList outSubtitleList) {
            this.outSubtitleList = outSubtitleList;
            return this;
        }
        public ListJobResponseBodyJobListJobOutputOutSubtitleList getOutSubtitleList() {
            return this.outSubtitleList;
        }

        public ListJobResponseBodyJobListJobOutput setOutputFile(ListJobResponseBodyJobListJobOutputOutputFile outputFile) {
            this.outputFile = outputFile;
            return this;
        }
        public ListJobResponseBodyJobListJobOutputOutputFile getOutputFile() {
            return this.outputFile;
        }

        public ListJobResponseBodyJobListJobOutput setPriority(String priority) {
            this.priority = priority;
            return this;
        }
        public String getPriority() {
            return this.priority;
        }

        public ListJobResponseBodyJobListJobOutput setProperties(ListJobResponseBodyJobListJobOutputProperties properties) {
            this.properties = properties;
            return this;
        }
        public ListJobResponseBodyJobListJobOutputProperties getProperties() {
            return this.properties;
        }

        public ListJobResponseBodyJobListJobOutput setRotate(String rotate) {
            this.rotate = rotate;
            return this;
        }
        public String getRotate() {
            return this.rotate;
        }

        public ListJobResponseBodyJobListJobOutput setSubtitleConfig(ListJobResponseBodyJobListJobOutputSubtitleConfig subtitleConfig) {
            this.subtitleConfig = subtitleConfig;
            return this;
        }
        public ListJobResponseBodyJobListJobOutputSubtitleConfig getSubtitleConfig() {
            return this.subtitleConfig;
        }

        public ListJobResponseBodyJobListJobOutput setSuperReso(ListJobResponseBodyJobListJobOutputSuperReso superReso) {
            this.superReso = superReso;
            return this;
        }
        public ListJobResponseBodyJobListJobOutputSuperReso getSuperReso() {
            return this.superReso;
        }

        public ListJobResponseBodyJobListJobOutput setTailSlateList(ListJobResponseBodyJobListJobOutputTailSlateList tailSlateList) {
            this.tailSlateList = tailSlateList;
            return this;
        }
        public ListJobResponseBodyJobListJobOutputTailSlateList getTailSlateList() {
            return this.tailSlateList;
        }

        public ListJobResponseBodyJobListJobOutput setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public ListJobResponseBodyJobListJobOutput setTransConfig(ListJobResponseBodyJobListJobOutputTransConfig transConfig) {
            this.transConfig = transConfig;
            return this;
        }
        public ListJobResponseBodyJobListJobOutputTransConfig getTransConfig() {
            return this.transConfig;
        }

        public ListJobResponseBodyJobListJobOutput setUserData(String userData) {
            this.userData = userData;
            return this;
        }
        public String getUserData() {
            return this.userData;
        }

        public ListJobResponseBodyJobListJobOutput setVideo(ListJobResponseBodyJobListJobOutputVideo video) {
            this.video = video;
            return this;
        }
        public ListJobResponseBodyJobListJobOutputVideo getVideo() {
            return this.video;
        }

        public ListJobResponseBodyJobListJobOutput setVideoStreamMap(String videoStreamMap) {
            this.videoStreamMap = videoStreamMap;
            return this;
        }
        public String getVideoStreamMap() {
            return this.videoStreamMap;
        }

        public ListJobResponseBodyJobListJobOutput setWaterMarkConfigUrl(String waterMarkConfigUrl) {
            this.waterMarkConfigUrl = waterMarkConfigUrl;
            return this;
        }
        public String getWaterMarkConfigUrl() {
            return this.waterMarkConfigUrl;
        }

        public ListJobResponseBodyJobListJobOutput setWaterMarkList(ListJobResponseBodyJobListJobOutputWaterMarkList waterMarkList) {
            this.waterMarkList = waterMarkList;
            return this;
        }
        public ListJobResponseBodyJobListJobOutputWaterMarkList getWaterMarkList() {
            return this.waterMarkList;
        }

    }

    public static class ListJobResponseBodyJobListJob extends TeaModel {
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
         * <p>2014-01-10T12:20:25Z</p>
         */
        @NameInMap("FinishTime")
        public String finishTime;

        /**
         * <p>The information about the job input.</p>
         */
        @NameInMap("Input")
        public ListJobResponseBodyJobListJobInput input;

        /**
         * <p>The task ID.</p>
         * 
         * <strong>example:</strong>
         * <p>31fa3c9ca8134fb4b0b0f7878301****</p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <p>The message sent by Message Service (MNS) to notify users of the job result.</p>
         */
        @NameInMap("MNSMessageResult")
        public ListJobResponseBodyJobListJobMNSMessageResult MNSMessageResult;

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
        public ListJobResponseBodyJobListJobOutput output;

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
         * <p>88c6ca184c0e47b665e2a1267971****</p>
         */
        @NameInMap("PipelineId")
        public String pipelineId;

        /**
         * <p>The state of the job. Valid values:</p>
         * <ul>
         * <li><strong>Submitted</strong></li>
         * <li><strong>Transcoding</strong></li>
         * <li><strong>TranscodeSuccess</strong></li>
         * <li><strong>TranscodeFail</strong></li>
         * <li><strong>TranscodeCancelled</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>TranscodeSuccess</p>
         */
        @NameInMap("State")
        public String state;

        public static ListJobResponseBodyJobListJob build(java.util.Map<String, ?> map) throws Exception {
            ListJobResponseBodyJobListJob self = new ListJobResponseBodyJobListJob();
            return TeaModel.build(map, self);
        }

        public ListJobResponseBodyJobListJob setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public ListJobResponseBodyJobListJob setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public ListJobResponseBodyJobListJob setFinishTime(String finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public String getFinishTime() {
            return this.finishTime;
        }

        public ListJobResponseBodyJobListJob setInput(ListJobResponseBodyJobListJobInput input) {
            this.input = input;
            return this;
        }
        public ListJobResponseBodyJobListJobInput getInput() {
            return this.input;
        }

        public ListJobResponseBodyJobListJob setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public ListJobResponseBodyJobListJob setMNSMessageResult(ListJobResponseBodyJobListJobMNSMessageResult MNSMessageResult) {
            this.MNSMessageResult = MNSMessageResult;
            return this;
        }
        public ListJobResponseBodyJobListJobMNSMessageResult getMNSMessageResult() {
            return this.MNSMessageResult;
        }

        public ListJobResponseBodyJobListJob setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public ListJobResponseBodyJobListJob setOutput(ListJobResponseBodyJobListJobOutput output) {
            this.output = output;
            return this;
        }
        public ListJobResponseBodyJobListJobOutput getOutput() {
            return this.output;
        }

        public ListJobResponseBodyJobListJob setPercent(Long percent) {
            this.percent = percent;
            return this;
        }
        public Long getPercent() {
            return this.percent;
        }

        public ListJobResponseBodyJobListJob setPipelineId(String pipelineId) {
            this.pipelineId = pipelineId;
            return this;
        }
        public String getPipelineId() {
            return this.pipelineId;
        }

        public ListJobResponseBodyJobListJob setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

    }

    public static class ListJobResponseBodyJobList extends TeaModel {
        @NameInMap("Job")
        public java.util.List<ListJobResponseBodyJobListJob> job;

        public static ListJobResponseBodyJobList build(java.util.Map<String, ?> map) throws Exception {
            ListJobResponseBodyJobList self = new ListJobResponseBodyJobList();
            return TeaModel.build(map, self);
        }

        public ListJobResponseBodyJobList setJob(java.util.List<ListJobResponseBodyJobListJob> job) {
            this.job = job;
            return this;
        }
        public java.util.List<ListJobResponseBodyJobListJob> getJob() {
            return this.job;
        }

    }

}
