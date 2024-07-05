// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class QueryJobListResponseBody extends TeaModel {
    /**
     * <p>The transcoding jobs.</p>
     */
    @NameInMap("JobList")
    public QueryJobListResponseBodyJobList jobList;

    /**
     * <p>The list of nonexistent job IDs. If all queried job IDs exist, the response does not contain this parameter.</p>
     */
    @NameInMap("NonExistJobIds")
    public QueryJobListResponseBodyNonExistJobIds nonExistJobIds;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>197ADF44-104C-514C-9F92-D8924CB34E2A</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static QueryJobListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryJobListResponseBody self = new QueryJobListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryJobListResponseBody setJobList(QueryJobListResponseBodyJobList jobList) {
        this.jobList = jobList;
        return this;
    }
    public QueryJobListResponseBodyJobList getJobList() {
        return this.jobList;
    }

    public QueryJobListResponseBody setNonExistJobIds(QueryJobListResponseBodyNonExistJobIds nonExistJobIds) {
        this.nonExistJobIds = nonExistJobIds;
        return this;
    }
    public QueryJobListResponseBodyNonExistJobIds getNonExistJobIds() {
        return this.nonExistJobIds;
    }

    public QueryJobListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class QueryJobListResponseBodyJobListJobInput extends TeaModel {
        /**
         * <p>The name of the OSS bucket in which the input file is stored.</p>
         * 
         * <strong>example:</strong>
         * <p>exampleBucket</p>
         */
        @NameInMap("Bucket")
        public String bucket;

        /**
         * <p>The OSS region in which the input file resides.</p>
         * 
         * <strong>example:</strong>
         * <p>oss-cn-shanghai</p>
         */
        @NameInMap("Location")
        public String location;

        /**
         * <p>The name of the OSS object that is used as the input file.</p>
         * 
         * <strong>example:</strong>
         * <p>video_01.mp4</p>
         */
        @NameInMap("Object")
        public String object;

        public static QueryJobListResponseBodyJobListJobInput build(java.util.Map<String, ?> map) throws Exception {
            QueryJobListResponseBodyJobListJobInput self = new QueryJobListResponseBodyJobListJobInput();
            return TeaModel.build(map, self);
        }

        public QueryJobListResponseBodyJobListJobInput setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

        public QueryJobListResponseBodyJobListJobInput setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public QueryJobListResponseBodyJobListJobInput setObject(String object) {
            this.object = object;
            return this;
        }
        public String getObject() {
            return this.object;
        }

    }

    public static class QueryJobListResponseBodyJobListJobMNSMessageResult extends TeaModel {
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

        public static QueryJobListResponseBodyJobListJobMNSMessageResult build(java.util.Map<String, ?> map) throws Exception {
            QueryJobListResponseBodyJobListJobMNSMessageResult self = new QueryJobListResponseBodyJobListJobMNSMessageResult();
            return TeaModel.build(map, self);
        }

        public QueryJobListResponseBodyJobListJobMNSMessageResult setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

        public QueryJobListResponseBodyJobListJobMNSMessageResult setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public QueryJobListResponseBodyJobListJobMNSMessageResult setMessageId(String messageId) {
            this.messageId = messageId;
            return this;
        }
        public String getMessageId() {
            return this.messageId;
        }

    }

    public static class QueryJobListResponseBodyJobListJobOutputAudioVolume extends TeaModel {
        /**
         * <p>The volume adjustment range. Default value: -20. Unit: dB.</p>
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

        public static QueryJobListResponseBodyJobListJobOutputAudioVolume build(java.util.Map<String, ?> map) throws Exception {
            QueryJobListResponseBodyJobListJobOutputAudioVolume self = new QueryJobListResponseBodyJobListJobOutputAudioVolume();
            return TeaModel.build(map, self);
        }

        public QueryJobListResponseBodyJobListJobOutputAudioVolume setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public QueryJobListResponseBodyJobListJobOutputAudioVolume setMethod(String method) {
            this.method = method;
            return this;
        }
        public String getMethod() {
            return this.method;
        }

    }

    public static class QueryJobListResponseBodyJobListJobOutputAudio extends TeaModel {
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
         * <li>Valid values: 1, 2, 3, 4, 5, 6, 7, and 8.</li>
         * <li>Default value: <strong>2</strong>.</li>
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
         * <p>The codec profile of the audio. Valid values when the value of Codec is aac: aaclow, aache, aachev2, aacld, and aaceld.</p>
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
         * </ul>
         * <blockquote>
         * <p> If the video container format is FLV and the audio codec is MP3, the value of this parameter cannot be 32000, 48000, or 96000. If the audio codec is MP3, the value of this parameter cannot be 96000.</p>
         * </blockquote>
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
        public QueryJobListResponseBodyJobListJobOutputAudioVolume volume;

        public static QueryJobListResponseBodyJobListJobOutputAudio build(java.util.Map<String, ?> map) throws Exception {
            QueryJobListResponseBodyJobListJobOutputAudio self = new QueryJobListResponseBodyJobListJobOutputAudio();
            return TeaModel.build(map, self);
        }

        public QueryJobListResponseBodyJobListJobOutputAudio setBitrate(String bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public String getBitrate() {
            return this.bitrate;
        }

        public QueryJobListResponseBodyJobListJobOutputAudio setChannels(String channels) {
            this.channels = channels;
            return this;
        }
        public String getChannels() {
            return this.channels;
        }

        public QueryJobListResponseBodyJobListJobOutputAudio setCodec(String codec) {
            this.codec = codec;
            return this;
        }
        public String getCodec() {
            return this.codec;
        }

        public QueryJobListResponseBodyJobListJobOutputAudio setProfile(String profile) {
            this.profile = profile;
            return this;
        }
        public String getProfile() {
            return this.profile;
        }

        public QueryJobListResponseBodyJobListJobOutputAudio setQscale(String qscale) {
            this.qscale = qscale;
            return this;
        }
        public String getQscale() {
            return this.qscale;
        }

        public QueryJobListResponseBodyJobListJobOutputAudio setSamplerate(String samplerate) {
            this.samplerate = samplerate;
            return this;
        }
        public String getSamplerate() {
            return this.samplerate;
        }

        public QueryJobListResponseBodyJobListJobOutputAudio setVolume(QueryJobListResponseBodyJobListJobOutputAudioVolume volume) {
            this.volume = volume;
            return this;
        }
        public QueryJobListResponseBodyJobListJobOutputAudioVolume getVolume() {
            return this.volume;
        }

    }

    public static class QueryJobListResponseBodyJobListJobOutputClipTimeSpan extends TeaModel {
        /**
         * <p>The duration of the clip.</p>
         * <ul>
         * <li>Format: <code>hh:mm:ss[.SSS]</code>.</li>
         * <li>Example: 01:00:59.999.</li>
         * </ul>
         * <p>Or</p>
         * <ul>
         * <li>Format: <code>sssss[.SSS]</code>.</li>
         * <li>Example: 32000.23.</li>
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
         * <li>Format: <code>hh:mm:ss[.SSS]</code>.</li>
         * <li>Example: 01:59:59.999.</li>
         * </ul>
         * <p>Or</p>
         * <ul>
         * <li>Format: <code>sssss[.SSS]</code>.</li>
         * <li>Example: 32000.23.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>01:59:59.999</p>
         */
        @NameInMap("Seek")
        public String seek;

        public static QueryJobListResponseBodyJobListJobOutputClipTimeSpan build(java.util.Map<String, ?> map) throws Exception {
            QueryJobListResponseBodyJobListJobOutputClipTimeSpan self = new QueryJobListResponseBodyJobListJobOutputClipTimeSpan();
            return TeaModel.build(map, self);
        }

        public QueryJobListResponseBodyJobListJobOutputClipTimeSpan setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public QueryJobListResponseBodyJobListJobOutputClipTimeSpan setSeek(String seek) {
            this.seek = seek;
            return this;
        }
        public String getSeek() {
            return this.seek;
        }

    }

    public static class QueryJobListResponseBodyJobListJobOutputClip extends TeaModel {
        /**
         * <p>The time span of the clip.</p>
         */
        @NameInMap("TimeSpan")
        public QueryJobListResponseBodyJobListJobOutputClipTimeSpan timeSpan;

        public static QueryJobListResponseBodyJobListJobOutputClip build(java.util.Map<String, ?> map) throws Exception {
            QueryJobListResponseBodyJobListJobOutputClip self = new QueryJobListResponseBodyJobListJobOutputClip();
            return TeaModel.build(map, self);
        }

        public QueryJobListResponseBodyJobListJobOutputClip setTimeSpan(QueryJobListResponseBodyJobListJobOutputClipTimeSpan timeSpan) {
            this.timeSpan = timeSpan;
            return this;
        }
        public QueryJobListResponseBodyJobListJobOutputClipTimeSpan getTimeSpan() {
            return this.timeSpan;
        }

    }

    public static class QueryJobListResponseBodyJobListJobOutputContainer extends TeaModel {
        /**
         * <p>The container format.</p>
         * <ul>
         * <li>Default value: mp4.</li>
         * <li>Video formats include FLV, MP4, HLS (M3U8 + TS), and MPEG-DASH (MPD + fMP4).</li>
         * <li>Audio formats include MP3, MP4, Ogg, FLAC, and M4A.</li>
         * <li>Image formats include GIF and WebP. If the container format is GIF, the video codec must be GIF.</li>
         * <li>If the container format is WebP, the video codec must be WebP.</li>
         * <li>If the container format is FLV, the video codec cannot be H.265.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>mp4</p>
         */
        @NameInMap("Format")
        public String format;

        public static QueryJobListResponseBodyJobListJobOutputContainer build(java.util.Map<String, ?> map) throws Exception {
            QueryJobListResponseBodyJobListJobOutputContainer self = new QueryJobListResponseBodyJobListJobOutputContainer();
            return TeaModel.build(map, self);
        }

        public QueryJobListResponseBodyJobListJobOutputContainer setFormat(String format) {
            this.format = format;
            return this;
        }
        public String getFormat() {
            return this.format;
        }

    }

    public static class QueryJobListResponseBodyJobListJobOutputEncryption extends TeaModel {
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
         * <p> For example, if the key is <code>encryptionkey128</code>, the key can be encrypted as <code>Base64(&quot;encryptionkey128&quot;)</code> or <code>KMS(Base64(&quot;encryptionkey128&quot;)</code> depending on the encryption method used.</p>
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
         * <p>The encryption type. Only <strong>hls-aes-128</strong> may be returned.</p>
         * 
         * <strong>example:</strong>
         * <p>hls-aes-128</p>
         */
        @NameInMap("Type")
        public String type;

        public static QueryJobListResponseBodyJobListJobOutputEncryption build(java.util.Map<String, ?> map) throws Exception {
            QueryJobListResponseBodyJobListJobOutputEncryption self = new QueryJobListResponseBodyJobListJobOutputEncryption();
            return TeaModel.build(map, self);
        }

        public QueryJobListResponseBodyJobListJobOutputEncryption setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryJobListResponseBodyJobListJobOutputEncryption setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public QueryJobListResponseBodyJobListJobOutputEncryption setKeyType(String keyType) {
            this.keyType = keyType;
            return this;
        }
        public String getKeyType() {
            return this.keyType;
        }

        public QueryJobListResponseBodyJobListJobOutputEncryption setKeyUri(String keyUri) {
            this.keyUri = keyUri;
            return this;
        }
        public String getKeyUri() {
            return this.keyUri;
        }

        public QueryJobListResponseBodyJobListJobOutputEncryption setSkipCnt(String skipCnt) {
            this.skipCnt = skipCnt;
            return this;
        }
        public String getSkipCnt() {
            return this.skipCnt;
        }

        public QueryJobListResponseBodyJobListJobOutputEncryption setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class QueryJobListResponseBodyJobListJobOutputM3U8NonStandardSupportTS extends TeaModel {
        /**
         * <p>Indicates whether the output of the MD5 value of the TS file is supported in the M3U8 file. Valid values:</p>
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
         * <p>Indicates whether the output of the size of the TS file is supported in the M3U8 file. Valid values:</p>
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

        public static QueryJobListResponseBodyJobListJobOutputM3U8NonStandardSupportTS build(java.util.Map<String, ?> map) throws Exception {
            QueryJobListResponseBodyJobListJobOutputM3U8NonStandardSupportTS self = new QueryJobListResponseBodyJobListJobOutputM3U8NonStandardSupportTS();
            return TeaModel.build(map, self);
        }

        public QueryJobListResponseBodyJobListJobOutputM3U8NonStandardSupportTS setMd5Support(Boolean md5Support) {
            this.md5Support = md5Support;
            return this;
        }
        public Boolean getMd5Support() {
            return this.md5Support;
        }

        public QueryJobListResponseBodyJobListJobOutputM3U8NonStandardSupportTS setSizeSupport(Boolean sizeSupport) {
            this.sizeSupport = sizeSupport;
            return this;
        }
        public Boolean getSizeSupport() {
            return this.sizeSupport;
        }

    }

    public static class QueryJobListResponseBodyJobListJobOutputM3U8NonStandardSupport extends TeaModel {
        /**
         * <p>The non-standard support configurations for TS files. The value is a JSON object. For more information, see the TS section of the <a href="https://help.aliyun.com/document_detail/29253.html">Parameter details</a> topic.</p>
         */
        @NameInMap("TS")
        public QueryJobListResponseBodyJobListJobOutputM3U8NonStandardSupportTS TS;

        public static QueryJobListResponseBodyJobListJobOutputM3U8NonStandardSupport build(java.util.Map<String, ?> map) throws Exception {
            QueryJobListResponseBodyJobListJobOutputM3U8NonStandardSupport self = new QueryJobListResponseBodyJobListJobOutputM3U8NonStandardSupport();
            return TeaModel.build(map, self);
        }

        public QueryJobListResponseBodyJobListJobOutputM3U8NonStandardSupport setTS(QueryJobListResponseBodyJobListJobOutputM3U8NonStandardSupportTS TS) {
            this.TS = TS;
            return this;
        }
        public QueryJobListResponseBodyJobListJobOutputM3U8NonStandardSupportTS getTS() {
            return this.TS;
        }

    }

    public static class QueryJobListResponseBodyJobListJobOutputMergeListMerge extends TeaModel {
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
         * <li>Example: <code>http://example-bucket-.oss-cn-hangzhou.aliyuncs.com/example-object.flv</code>.</li>
         * <li>The object must be URL-encoded by using the UTF-8 standard. For more information, see <a href="https://help.aliyun.com/document_detail/423796.html">URL encoding</a>.</li>
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
         * 
         * <strong>example:</strong>
         * <p>01:59:59.999</p>
         */
        @NameInMap("Start")
        public String start;

        public static QueryJobListResponseBodyJobListJobOutputMergeListMerge build(java.util.Map<String, ?> map) throws Exception {
            QueryJobListResponseBodyJobListJobOutputMergeListMerge self = new QueryJobListResponseBodyJobListJobOutputMergeListMerge();
            return TeaModel.build(map, self);
        }

        public QueryJobListResponseBodyJobListJobOutputMergeListMerge setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public QueryJobListResponseBodyJobListJobOutputMergeListMerge setMergeURL(String mergeURL) {
            this.mergeURL = mergeURL;
            return this;
        }
        public String getMergeURL() {
            return this.mergeURL;
        }

        public QueryJobListResponseBodyJobListJobOutputMergeListMerge setRoleArn(String roleArn) {
            this.roleArn = roleArn;
            return this;
        }
        public String getRoleArn() {
            return this.roleArn;
        }

        public QueryJobListResponseBodyJobListJobOutputMergeListMerge setStart(String start) {
            this.start = start;
            return this;
        }
        public String getStart() {
            return this.start;
        }

    }

    public static class QueryJobListResponseBodyJobListJobOutputMergeList extends TeaModel {
        @NameInMap("Merge")
        public java.util.List<QueryJobListResponseBodyJobListJobOutputMergeListMerge> merge;

        public static QueryJobListResponseBodyJobListJobOutputMergeList build(java.util.Map<String, ?> map) throws Exception {
            QueryJobListResponseBodyJobListJobOutputMergeList self = new QueryJobListResponseBodyJobListJobOutputMergeList();
            return TeaModel.build(map, self);
        }

        public QueryJobListResponseBodyJobListJobOutputMergeList setMerge(java.util.List<QueryJobListResponseBodyJobListJobOutputMergeListMerge> merge) {
            this.merge = merge;
            return this;
        }
        public java.util.List<QueryJobListResponseBodyJobListJobOutputMergeListMerge> getMerge() {
            return this.merge;
        }

    }

    public static class QueryJobListResponseBodyJobListJobOutputMultiSpeedInfo extends TeaModel {
        /**
         * <p>The error code returned if high-speed transcoding is not enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>Boost.NotNeedSpeed</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The downgrade policy if high-speed transcoding is not supported.</p>
         * 
         * <strong>example:</strong>
         * <p>NormalSpeed</p>
         */
        @NameInMap("DowngradePolicy")
        public String downgradePolicy;

        /**
         * <p>The duration of the output video.</p>
         * 
         * <strong>example:</strong>
         * <p>21.0</p>
         */
        @NameInMap("Duration")
        public Double duration;

        /**
         * <p>Indicates whether high-speed transcoding is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Enable")
        public String enable;

        /**
         * <p>The error message returned if high-speed transcoding is not enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The actual transcoding speed.</p>
         * 
         * <strong>example:</strong>
         * <p>6.576886940181647</p>
         */
        @NameInMap("RealSpeed")
        public Double realSpeed;

        /**
         * <p>The speed setting.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("SettingSpeed")
        public Integer settingSpeed;

        /**
         * <p>The amount of time consumed.</p>
         * 
         * <strong>example:</strong>
         * <p>3.193</p>
         */
        @NameInMap("TimeCost")
        public Double timeCost;

        public static QueryJobListResponseBodyJobListJobOutputMultiSpeedInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryJobListResponseBodyJobListJobOutputMultiSpeedInfo self = new QueryJobListResponseBodyJobListJobOutputMultiSpeedInfo();
            return TeaModel.build(map, self);
        }

        public QueryJobListResponseBodyJobListJobOutputMultiSpeedInfo setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryJobListResponseBodyJobListJobOutputMultiSpeedInfo setDowngradePolicy(String downgradePolicy) {
            this.downgradePolicy = downgradePolicy;
            return this;
        }
        public String getDowngradePolicy() {
            return this.downgradePolicy;
        }

        public QueryJobListResponseBodyJobListJobOutputMultiSpeedInfo setDuration(Double duration) {
            this.duration = duration;
            return this;
        }
        public Double getDuration() {
            return this.duration;
        }

        public QueryJobListResponseBodyJobListJobOutputMultiSpeedInfo setEnable(String enable) {
            this.enable = enable;
            return this;
        }
        public String getEnable() {
            return this.enable;
        }

        public QueryJobListResponseBodyJobListJobOutputMultiSpeedInfo setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public QueryJobListResponseBodyJobListJobOutputMultiSpeedInfo setRealSpeed(Double realSpeed) {
            this.realSpeed = realSpeed;
            return this;
        }
        public Double getRealSpeed() {
            return this.realSpeed;
        }

        public QueryJobListResponseBodyJobListJobOutputMultiSpeedInfo setSettingSpeed(Integer settingSpeed) {
            this.settingSpeed = settingSpeed;
            return this;
        }
        public Integer getSettingSpeed() {
            return this.settingSpeed;
        }

        public QueryJobListResponseBodyJobListJobOutputMultiSpeedInfo setTimeCost(Double timeCost) {
            this.timeCost = timeCost;
            return this;
        }
        public Double getTimeCost() {
            return this.timeCost;
        }

    }

    public static class QueryJobListResponseBodyJobListJobOutputMuxConfigGif extends TeaModel {
        /**
         * <p>The color dithering algorithm of the palette. Valid values: sierra and bayer.</p>
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

        public static QueryJobListResponseBodyJobListJobOutputMuxConfigGif build(java.util.Map<String, ?> map) throws Exception {
            QueryJobListResponseBodyJobListJobOutputMuxConfigGif self = new QueryJobListResponseBodyJobListJobOutputMuxConfigGif();
            return TeaModel.build(map, self);
        }

        public QueryJobListResponseBodyJobListJobOutputMuxConfigGif setDitherMode(String ditherMode) {
            this.ditherMode = ditherMode;
            return this;
        }
        public String getDitherMode() {
            return this.ditherMode;
        }

        public QueryJobListResponseBodyJobListJobOutputMuxConfigGif setFinalDelay(String finalDelay) {
            this.finalDelay = finalDelay;
            return this;
        }
        public String getFinalDelay() {
            return this.finalDelay;
        }

        public QueryJobListResponseBodyJobListJobOutputMuxConfigGif setIsCustomPalette(String isCustomPalette) {
            this.isCustomPalette = isCustomPalette;
            return this;
        }
        public String getIsCustomPalette() {
            return this.isCustomPalette;
        }

        public QueryJobListResponseBodyJobListJobOutputMuxConfigGif setLoop(String loop) {
            this.loop = loop;
            return this;
        }
        public String getLoop() {
            return this.loop;
        }

    }

    public static class QueryJobListResponseBodyJobListJobOutputMuxConfigSegment extends TeaModel {
        /**
         * <p>The segment length. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("Duration")
        public String duration;

        public static QueryJobListResponseBodyJobListJobOutputMuxConfigSegment build(java.util.Map<String, ?> map) throws Exception {
            QueryJobListResponseBodyJobListJobOutputMuxConfigSegment self = new QueryJobListResponseBodyJobListJobOutputMuxConfigSegment();
            return TeaModel.build(map, self);
        }

        public QueryJobListResponseBodyJobListJobOutputMuxConfigSegment setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

    }

    public static class QueryJobListResponseBodyJobListJobOutputMuxConfigWebp extends TeaModel {
        /**
         * <p>The loop count.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Loop")
        public String loop;

        public static QueryJobListResponseBodyJobListJobOutputMuxConfigWebp build(java.util.Map<String, ?> map) throws Exception {
            QueryJobListResponseBodyJobListJobOutputMuxConfigWebp self = new QueryJobListResponseBodyJobListJobOutputMuxConfigWebp();
            return TeaModel.build(map, self);
        }

        public QueryJobListResponseBodyJobListJobOutputMuxConfigWebp setLoop(String loop) {
            this.loop = loop;
            return this;
        }
        public String getLoop() {
            return this.loop;
        }

    }

    public static class QueryJobListResponseBodyJobListJobOutputMuxConfig extends TeaModel {
        /**
         * <p>The transmuxing configurations for GIF.</p>
         */
        @NameInMap("Gif")
        public QueryJobListResponseBodyJobListJobOutputMuxConfigGif gif;

        /**
         * <p>The segment configurations. The value is a JSON object.</p>
         */
        @NameInMap("Segment")
        public QueryJobListResponseBodyJobListJobOutputMuxConfigSegment segment;

        /**
         * <p>The transmuxing configurations for WebP.</p>
         */
        @NameInMap("Webp")
        public QueryJobListResponseBodyJobListJobOutputMuxConfigWebp webp;

        public static QueryJobListResponseBodyJobListJobOutputMuxConfig build(java.util.Map<String, ?> map) throws Exception {
            QueryJobListResponseBodyJobListJobOutputMuxConfig self = new QueryJobListResponseBodyJobListJobOutputMuxConfig();
            return TeaModel.build(map, self);
        }

        public QueryJobListResponseBodyJobListJobOutputMuxConfig setGif(QueryJobListResponseBodyJobListJobOutputMuxConfigGif gif) {
            this.gif = gif;
            return this;
        }
        public QueryJobListResponseBodyJobListJobOutputMuxConfigGif getGif() {
            return this.gif;
        }

        public QueryJobListResponseBodyJobListJobOutputMuxConfig setSegment(QueryJobListResponseBodyJobListJobOutputMuxConfigSegment segment) {
            this.segment = segment;
            return this;
        }
        public QueryJobListResponseBodyJobListJobOutputMuxConfigSegment getSegment() {
            return this.segment;
        }

        public QueryJobListResponseBodyJobListJobOutputMuxConfig setWebp(QueryJobListResponseBodyJobListJobOutputMuxConfigWebp webp) {
            this.webp = webp;
            return this;
        }
        public QueryJobListResponseBodyJobListJobOutputMuxConfigWebp getWebp() {
            return this.webp;
        }

    }

    public static class QueryJobListResponseBodyJobListJobOutputOpeningListOpening extends TeaModel {
        /**
         * <p>The height of the opening part.</p>
         * <ul>
         * <li>Valid values: values in the range of (0,4096), -1, and full.</li>
         * <li>A value of -1 indicates that the original height of the opening part is retained.</li>
         * <li>A value of full indicates that the height of the opening part equals the height of the main part.</li>
         * <li>Default value: <strong>-1</strong>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>-1</p>
         */
        @NameInMap("Height")
        public String height;

        /**
         * <p>The amount of time after which the opening part is played.</p>
         * <ul>
         * <li>The value starts from 0.</li>
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
         * <p>The width of the opening part.</p>
         * <ul>
         * <li>Valid values: values in the range of (0,4096), -1, and full.</li>
         * <li>A value of -1 indicates that the original width of the opening part is retained.</li>
         * <li>A value of full indicates that the width of the opening part equals the width of the main part.</li>
         * <li>Default value: <strong>-1</strong>.</li>
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
         * <p><a href="http://example.oss-cn-shanghai.aliyuncs.com/t5.mp4">http://example.oss-cn-shanghai.aliyuncs.com/t5.mp4</a></p>
         */
        @NameInMap("openUrl")
        public String openUrl;

        public static QueryJobListResponseBodyJobListJobOutputOpeningListOpening build(java.util.Map<String, ?> map) throws Exception {
            QueryJobListResponseBodyJobListJobOutputOpeningListOpening self = new QueryJobListResponseBodyJobListJobOutputOpeningListOpening();
            return TeaModel.build(map, self);
        }

        public QueryJobListResponseBodyJobListJobOutputOpeningListOpening setHeight(String height) {
            this.height = height;
            return this;
        }
        public String getHeight() {
            return this.height;
        }

        public QueryJobListResponseBodyJobListJobOutputOpeningListOpening setStart(String start) {
            this.start = start;
            return this;
        }
        public String getStart() {
            return this.start;
        }

        public QueryJobListResponseBodyJobListJobOutputOpeningListOpening setWidth(String width) {
            this.width = width;
            return this;
        }
        public String getWidth() {
            return this.width;
        }

        public QueryJobListResponseBodyJobListJobOutputOpeningListOpening setOpenUrl(String openUrl) {
            this.openUrl = openUrl;
            return this;
        }
        public String getOpenUrl() {
            return this.openUrl;
        }

    }

    public static class QueryJobListResponseBodyJobListJobOutputOpeningList extends TeaModel {
        @NameInMap("Opening")
        public java.util.List<QueryJobListResponseBodyJobListJobOutputOpeningListOpening> opening;

        public static QueryJobListResponseBodyJobListJobOutputOpeningList build(java.util.Map<String, ?> map) throws Exception {
            QueryJobListResponseBodyJobListJobOutputOpeningList self = new QueryJobListResponseBodyJobListJobOutputOpeningList();
            return TeaModel.build(map, self);
        }

        public QueryJobListResponseBodyJobListJobOutputOpeningList setOpening(java.util.List<QueryJobListResponseBodyJobListJobOutputOpeningListOpening> opening) {
            this.opening = opening;
            return this;
        }
        public java.util.List<QueryJobListResponseBodyJobListJobOutputOpeningListOpening> getOpening() {
            return this.opening;
        }

    }

    public static class QueryJobListResponseBodyJobListJobOutputOutSubtitleListOutSubtitleOutSubtitleFile extends TeaModel {
        /**
         * <p>The name of the OSS bucket in which the output caption is stored.</p>
         * 
         * <strong>example:</strong>
         * <p>exampleBucket</p>
         */
        @NameInMap("Bucket")
        public String bucket;

        /**
         * <p>The OSS region in which the output caption resides.</p>
         * 
         * <strong>example:</strong>
         * <p>oss-cn-hangzhou</p>
         */
        @NameInMap("Location")
        public String location;

        /**
         * <p>The name of the OSS object that is used as the output caption.</p>
         * 
         * <strong>example:</strong>
         * <p>example.flv</p>
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

        public static QueryJobListResponseBodyJobListJobOutputOutSubtitleListOutSubtitleOutSubtitleFile build(java.util.Map<String, ?> map) throws Exception {
            QueryJobListResponseBodyJobListJobOutputOutSubtitleListOutSubtitleOutSubtitleFile self = new QueryJobListResponseBodyJobListJobOutputOutSubtitleListOutSubtitleOutSubtitleFile();
            return TeaModel.build(map, self);
        }

        public QueryJobListResponseBodyJobListJobOutputOutSubtitleListOutSubtitleOutSubtitleFile setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

        public QueryJobListResponseBodyJobListJobOutputOutSubtitleListOutSubtitleOutSubtitleFile setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public QueryJobListResponseBodyJobListJobOutputOutSubtitleListOutSubtitleOutSubtitleFile setObject(String object) {
            this.object = object;
            return this;
        }
        public String getObject() {
            return this.object;
        }

        public QueryJobListResponseBodyJobListJobOutputOutSubtitleListOutSubtitleOutSubtitleFile setRoleArn(String roleArn) {
            this.roleArn = roleArn;
            return this;
        }
        public String getRoleArn() {
            return this.roleArn;
        }

    }

    public static class QueryJobListResponseBodyJobListJobOutputOutSubtitleListOutSubtitle extends TeaModel {
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
         * <p>The details of the output caption.</p>
         */
        @NameInMap("OutSubtitleFile")
        public QueryJobListResponseBodyJobListJobOutputOutSubtitleListOutSubtitleOutSubtitleFile outSubtitleFile;

        /**
         * <p>Indicates whether the job was successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The job was successful.</li>
         * <li><strong>false</strong>: The job failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Success")
        public Boolean success;

        public static QueryJobListResponseBodyJobListJobOutputOutSubtitleListOutSubtitle build(java.util.Map<String, ?> map) throws Exception {
            QueryJobListResponseBodyJobListJobOutputOutSubtitleListOutSubtitle self = new QueryJobListResponseBodyJobListJobOutputOutSubtitleListOutSubtitle();
            return TeaModel.build(map, self);
        }

        public QueryJobListResponseBodyJobListJobOutputOutSubtitleListOutSubtitle setMap(String map) {
            this.map = map;
            return this;
        }
        public String getMap() {
            return this.map;
        }

        public QueryJobListResponseBodyJobListJobOutputOutSubtitleListOutSubtitle setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public QueryJobListResponseBodyJobListJobOutputOutSubtitleListOutSubtitle setOutSubtitleFile(QueryJobListResponseBodyJobListJobOutputOutSubtitleListOutSubtitleOutSubtitleFile outSubtitleFile) {
            this.outSubtitleFile = outSubtitleFile;
            return this;
        }
        public QueryJobListResponseBodyJobListJobOutputOutSubtitleListOutSubtitleOutSubtitleFile getOutSubtitleFile() {
            return this.outSubtitleFile;
        }

        public QueryJobListResponseBodyJobListJobOutputOutSubtitleListOutSubtitle setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

    }

    public static class QueryJobListResponseBodyJobListJobOutputOutSubtitleList extends TeaModel {
        @NameInMap("OutSubtitle")
        public java.util.List<QueryJobListResponseBodyJobListJobOutputOutSubtitleListOutSubtitle> outSubtitle;

        public static QueryJobListResponseBodyJobListJobOutputOutSubtitleList build(java.util.Map<String, ?> map) throws Exception {
            QueryJobListResponseBodyJobListJobOutputOutSubtitleList self = new QueryJobListResponseBodyJobListJobOutputOutSubtitleList();
            return TeaModel.build(map, self);
        }

        public QueryJobListResponseBodyJobListJobOutputOutSubtitleList setOutSubtitle(java.util.List<QueryJobListResponseBodyJobListJobOutputOutSubtitleListOutSubtitle> outSubtitle) {
            this.outSubtitle = outSubtitle;
            return this;
        }
        public java.util.List<QueryJobListResponseBodyJobListJobOutputOutSubtitleListOutSubtitle> getOutSubtitle() {
            return this.outSubtitle;
        }

    }

    public static class QueryJobListResponseBodyJobListJobOutputOutputFile extends TeaModel {
        /**
         * <p>The name of the OSS bucket in which the output file is stored.</p>
         * 
         * <strong>example:</strong>
         * <p>example-bucket</p>
         */
        @NameInMap("Bucket")
        public String bucket;

        /**
         * <p>The OSS region in which the output file resides.</p>
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

        public static QueryJobListResponseBodyJobListJobOutputOutputFile build(java.util.Map<String, ?> map) throws Exception {
            QueryJobListResponseBodyJobListJobOutputOutputFile self = new QueryJobListResponseBodyJobListJobOutputOutputFile();
            return TeaModel.build(map, self);
        }

        public QueryJobListResponseBodyJobListJobOutputOutputFile setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

        public QueryJobListResponseBodyJobListJobOutputOutputFile setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public QueryJobListResponseBodyJobListJobOutputOutputFile setObject(String object) {
            this.object = object;
            return this;
        }
        public String getObject() {
            return this.object;
        }

        public QueryJobListResponseBodyJobListJobOutputOutputFile setRoleArn(String roleArn) {
            this.roleArn = roleArn;
            return this;
        }
        public String getRoleArn() {
            return this.roleArn;
        }

    }

    public static class QueryJobListResponseBodyJobListJobOutputPropertiesFormat extends TeaModel {
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
         * <p>The size of the media file.</p>
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
         * <p>-0.064000</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        public static QueryJobListResponseBodyJobListJobOutputPropertiesFormat build(java.util.Map<String, ?> map) throws Exception {
            QueryJobListResponseBodyJobListJobOutputPropertiesFormat self = new QueryJobListResponseBodyJobListJobOutputPropertiesFormat();
            return TeaModel.build(map, self);
        }

        public QueryJobListResponseBodyJobListJobOutputPropertiesFormat setBitrate(String bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public String getBitrate() {
            return this.bitrate;
        }

        public QueryJobListResponseBodyJobListJobOutputPropertiesFormat setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public QueryJobListResponseBodyJobListJobOutputPropertiesFormat setFormatLongName(String formatLongName) {
            this.formatLongName = formatLongName;
            return this;
        }
        public String getFormatLongName() {
            return this.formatLongName;
        }

        public QueryJobListResponseBodyJobListJobOutputPropertiesFormat setFormatName(String formatName) {
            this.formatName = formatName;
            return this;
        }
        public String getFormatName() {
            return this.formatName;
        }

        public QueryJobListResponseBodyJobListJobOutputPropertiesFormat setNumPrograms(String numPrograms) {
            this.numPrograms = numPrograms;
            return this;
        }
        public String getNumPrograms() {
            return this.numPrograms;
        }

        public QueryJobListResponseBodyJobListJobOutputPropertiesFormat setNumStreams(String numStreams) {
            this.numStreams = numStreams;
            return this;
        }
        public String getNumStreams() {
            return this.numStreams;
        }

        public QueryJobListResponseBodyJobListJobOutputPropertiesFormat setSize(String size) {
            this.size = size;
            return this;
        }
        public String getSize() {
            return this.size;
        }

        public QueryJobListResponseBodyJobListJobOutputPropertiesFormat setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

    }

    public static class QueryJobListResponseBodyJobListJobOutputPropertiesSourceLogosSourceLogo extends TeaModel {
        /**
         * <p>The keyword.</p>
         * 
         * <strong>example:</strong>
         * <p>example</p>
         */
        @NameInMap("Source")
        public String source;

        public static QueryJobListResponseBodyJobListJobOutputPropertiesSourceLogosSourceLogo build(java.util.Map<String, ?> map) throws Exception {
            QueryJobListResponseBodyJobListJobOutputPropertiesSourceLogosSourceLogo self = new QueryJobListResponseBodyJobListJobOutputPropertiesSourceLogosSourceLogo();
            return TeaModel.build(map, self);
        }

        public QueryJobListResponseBodyJobListJobOutputPropertiesSourceLogosSourceLogo setSource(String source) {
            this.source = source;
            return this;
        }
        public String getSource() {
            return this.source;
        }

    }

    public static class QueryJobListResponseBodyJobListJobOutputPropertiesSourceLogos extends TeaModel {
        @NameInMap("SourceLogo")
        public java.util.List<QueryJobListResponseBodyJobListJobOutputPropertiesSourceLogosSourceLogo> sourceLogo;

        public static QueryJobListResponseBodyJobListJobOutputPropertiesSourceLogos build(java.util.Map<String, ?> map) throws Exception {
            QueryJobListResponseBodyJobListJobOutputPropertiesSourceLogos self = new QueryJobListResponseBodyJobListJobOutputPropertiesSourceLogos();
            return TeaModel.build(map, self);
        }

        public QueryJobListResponseBodyJobListJobOutputPropertiesSourceLogos setSourceLogo(java.util.List<QueryJobListResponseBodyJobListJobOutputPropertiesSourceLogosSourceLogo> sourceLogo) {
            this.sourceLogo = sourceLogo;
            return this;
        }
        public java.util.List<QueryJobListResponseBodyJobListJobOutputPropertiesSourceLogosSourceLogo> getSourceLogo() {
            return this.sourceLogo;
        }

    }

    public static class QueryJobListResponseBodyJobListJobOutputPropertiesStreamsAudioStreamListAudioStream extends TeaModel {
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
         * <p>mp4</p>
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
         * <p>50</p>
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
         * <p>32000</p>
         */
        @NameInMap("Samplerate")
        public String samplerate;

        /**
         * <p>The start time.</p>
         * 
         * <strong>example:</strong>
         * <p>0.064000</p>
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

        public static QueryJobListResponseBodyJobListJobOutputPropertiesStreamsAudioStreamListAudioStream build(java.util.Map<String, ?> map) throws Exception {
            QueryJobListResponseBodyJobListJobOutputPropertiesStreamsAudioStreamListAudioStream self = new QueryJobListResponseBodyJobListJobOutputPropertiesStreamsAudioStreamListAudioStream();
            return TeaModel.build(map, self);
        }

        public QueryJobListResponseBodyJobListJobOutputPropertiesStreamsAudioStreamListAudioStream setBitrate(String bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public String getBitrate() {
            return this.bitrate;
        }

        public QueryJobListResponseBodyJobListJobOutputPropertiesStreamsAudioStreamListAudioStream setChannelLayout(String channelLayout) {
            this.channelLayout = channelLayout;
            return this;
        }
        public String getChannelLayout() {
            return this.channelLayout;
        }

        public QueryJobListResponseBodyJobListJobOutputPropertiesStreamsAudioStreamListAudioStream setChannels(String channels) {
            this.channels = channels;
            return this;
        }
        public String getChannels() {
            return this.channels;
        }

        public QueryJobListResponseBodyJobListJobOutputPropertiesStreamsAudioStreamListAudioStream setCodecLongName(String codecLongName) {
            this.codecLongName = codecLongName;
            return this;
        }
        public String getCodecLongName() {
            return this.codecLongName;
        }

        public QueryJobListResponseBodyJobListJobOutputPropertiesStreamsAudioStreamListAudioStream setCodecName(String codecName) {
            this.codecName = codecName;
            return this;
        }
        public String getCodecName() {
            return this.codecName;
        }

        public QueryJobListResponseBodyJobListJobOutputPropertiesStreamsAudioStreamListAudioStream setCodecTag(String codecTag) {
            this.codecTag = codecTag;
            return this;
        }
        public String getCodecTag() {
            return this.codecTag;
        }

        public QueryJobListResponseBodyJobListJobOutputPropertiesStreamsAudioStreamListAudioStream setCodecTagString(String codecTagString) {
            this.codecTagString = codecTagString;
            return this;
        }
        public String getCodecTagString() {
            return this.codecTagString;
        }

        public QueryJobListResponseBodyJobListJobOutputPropertiesStreamsAudioStreamListAudioStream setCodecTimeBase(String codecTimeBase) {
            this.codecTimeBase = codecTimeBase;
            return this;
        }
        public String getCodecTimeBase() {
            return this.codecTimeBase;
        }

        public QueryJobListResponseBodyJobListJobOutputPropertiesStreamsAudioStreamListAudioStream setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public QueryJobListResponseBodyJobListJobOutputPropertiesStreamsAudioStreamListAudioStream setIndex(String index) {
            this.index = index;
            return this;
        }
        public String getIndex() {
            return this.index;
        }

        public QueryJobListResponseBodyJobListJobOutputPropertiesStreamsAudioStreamListAudioStream setLang(String lang) {
            this.lang = lang;
            return this;
        }
        public String getLang() {
            return this.lang;
        }

        public QueryJobListResponseBodyJobListJobOutputPropertiesStreamsAudioStreamListAudioStream setNumFrames(String numFrames) {
            this.numFrames = numFrames;
            return this;
        }
        public String getNumFrames() {
            return this.numFrames;
        }

        public QueryJobListResponseBodyJobListJobOutputPropertiesStreamsAudioStreamListAudioStream setSampleFmt(String sampleFmt) {
            this.sampleFmt = sampleFmt;
            return this;
        }
        public String getSampleFmt() {
            return this.sampleFmt;
        }

        public QueryJobListResponseBodyJobListJobOutputPropertiesStreamsAudioStreamListAudioStream setSamplerate(String samplerate) {
            this.samplerate = samplerate;
            return this;
        }
        public String getSamplerate() {
            return this.samplerate;
        }

        public QueryJobListResponseBodyJobListJobOutputPropertiesStreamsAudioStreamListAudioStream setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public QueryJobListResponseBodyJobListJobOutputPropertiesStreamsAudioStreamListAudioStream setTimebase(String timebase) {
            this.timebase = timebase;
            return this;
        }
        public String getTimebase() {
            return this.timebase;
        }

    }

    public static class QueryJobListResponseBodyJobListJobOutputPropertiesStreamsAudioStreamList extends TeaModel {
        @NameInMap("AudioStream")
        public java.util.List<QueryJobListResponseBodyJobListJobOutputPropertiesStreamsAudioStreamListAudioStream> audioStream;

        public static QueryJobListResponseBodyJobListJobOutputPropertiesStreamsAudioStreamList build(java.util.Map<String, ?> map) throws Exception {
            QueryJobListResponseBodyJobListJobOutputPropertiesStreamsAudioStreamList self = new QueryJobListResponseBodyJobListJobOutputPropertiesStreamsAudioStreamList();
            return TeaModel.build(map, self);
        }

        public QueryJobListResponseBodyJobListJobOutputPropertiesStreamsAudioStreamList setAudioStream(java.util.List<QueryJobListResponseBodyJobListJobOutputPropertiesStreamsAudioStreamListAudioStream> audioStream) {
            this.audioStream = audioStream;
            return this;
        }
        public java.util.List<QueryJobListResponseBodyJobListJobOutputPropertiesStreamsAudioStreamListAudioStream> getAudioStream() {
            return this.audioStream;
        }

    }

    public static class QueryJobListResponseBodyJobListJobOutputPropertiesStreamsSubtitleStreamListSubtitleStream extends TeaModel {
        /**
         * <p>The sequence number of the caption stream. The value indicates the position of the caption stream in all caption streams.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Index")
        public String index;

        /**
         * <p>The language of the caption stream. For more information, see <a href="https://www.ffmpeg.org/ffmpeg-all.html#Metadata">FFmpeg documentation</a> and <a href="https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes">ISO 639</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>eng</p>
         */
        @NameInMap("Lang")
        public String lang;

        public static QueryJobListResponseBodyJobListJobOutputPropertiesStreamsSubtitleStreamListSubtitleStream build(java.util.Map<String, ?> map) throws Exception {
            QueryJobListResponseBodyJobListJobOutputPropertiesStreamsSubtitleStreamListSubtitleStream self = new QueryJobListResponseBodyJobListJobOutputPropertiesStreamsSubtitleStreamListSubtitleStream();
            return TeaModel.build(map, self);
        }

        public QueryJobListResponseBodyJobListJobOutputPropertiesStreamsSubtitleStreamListSubtitleStream setIndex(String index) {
            this.index = index;
            return this;
        }
        public String getIndex() {
            return this.index;
        }

        public QueryJobListResponseBodyJobListJobOutputPropertiesStreamsSubtitleStreamListSubtitleStream setLang(String lang) {
            this.lang = lang;
            return this;
        }
        public String getLang() {
            return this.lang;
        }

    }

    public static class QueryJobListResponseBodyJobListJobOutputPropertiesStreamsSubtitleStreamList extends TeaModel {
        @NameInMap("SubtitleStream")
        public java.util.List<QueryJobListResponseBodyJobListJobOutputPropertiesStreamsSubtitleStreamListSubtitleStream> subtitleStream;

        public static QueryJobListResponseBodyJobListJobOutputPropertiesStreamsSubtitleStreamList build(java.util.Map<String, ?> map) throws Exception {
            QueryJobListResponseBodyJobListJobOutputPropertiesStreamsSubtitleStreamList self = new QueryJobListResponseBodyJobListJobOutputPropertiesStreamsSubtitleStreamList();
            return TeaModel.build(map, self);
        }

        public QueryJobListResponseBodyJobListJobOutputPropertiesStreamsSubtitleStreamList setSubtitleStream(java.util.List<QueryJobListResponseBodyJobListJobOutputPropertiesStreamsSubtitleStreamListSubtitleStream> subtitleStream) {
            this.subtitleStream = subtitleStream;
            return this;
        }
        public java.util.List<QueryJobListResponseBodyJobListJobOutputPropertiesStreamsSubtitleStreamListSubtitleStream> getSubtitleStream() {
            return this.subtitleStream;
        }

    }

    public static class QueryJobListResponseBodyJobListJobOutputPropertiesStreamsVideoStreamListVideoStreamNetworkCost extends TeaModel {
        /**
         * <p>The average bitrate.</p>
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

        public static QueryJobListResponseBodyJobListJobOutputPropertiesStreamsVideoStreamListVideoStreamNetworkCost build(java.util.Map<String, ?> map) throws Exception {
            QueryJobListResponseBodyJobListJobOutputPropertiesStreamsVideoStreamListVideoStreamNetworkCost self = new QueryJobListResponseBodyJobListJobOutputPropertiesStreamsVideoStreamListVideoStreamNetworkCost();
            return TeaModel.build(map, self);
        }

        public QueryJobListResponseBodyJobListJobOutputPropertiesStreamsVideoStreamListVideoStreamNetworkCost setAvgBitrate(String avgBitrate) {
            this.avgBitrate = avgBitrate;
            return this;
        }
        public String getAvgBitrate() {
            return this.avgBitrate;
        }

        public QueryJobListResponseBodyJobListJobOutputPropertiesStreamsVideoStreamListVideoStreamNetworkCost setCostBandwidth(String costBandwidth) {
            this.costBandwidth = costBandwidth;
            return this;
        }
        public String getCostBandwidth() {
            return this.costBandwidth;
        }

        public QueryJobListResponseBodyJobListJobOutputPropertiesStreamsVideoStreamListVideoStreamNetworkCost setPreloadTime(String preloadTime) {
            this.preloadTime = preloadTime;
            return this;
        }
        public String getPreloadTime() {
            return this.preloadTime;
        }

    }

    public static class QueryJobListResponseBodyJobListJobOutputPropertiesStreamsVideoStreamListVideoStream extends TeaModel {
        /**
         * <p>The average frame rate of the video stream.</p>
         * 
         * <strong>example:</strong>
         * <p>30.0</p>
         */
        @NameInMap("AvgFPS")
        public String avgFPS;

        /**
         * <p>The video bitrate.</p>
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
         * <p>The display aspect ratio (DAR) of the video stream.</p>
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
         * <p>Indicates whether the video stream contains bidirectional frames (B-frames).</p>
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
         * <p>eng</p>
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
        public QueryJobListResponseBodyJobListJobOutputPropertiesStreamsVideoStreamListVideoStreamNetworkCost networkCost;

        /**
         * <p>The total number of frames.</p>
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

        /**
         * <p>The number of binary bits used by each sample or pixel.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("bitsPerRawSample")
        public String bitsPerRawSample;

        /**
         * <p>The primary colors.</p>
         * 
         * <strong>example:</strong>
         * <p>bt709</p>
         */
        @NameInMap("colorPrimaries")
        public String colorPrimaries;

        /**
         * <p>The color transfer configuration.</p>
         * 
         * <strong>example:</strong>
         * <p>bt709</p>
         */
        @NameInMap("colorTransfer")
        public String colorTransfer;

        public static QueryJobListResponseBodyJobListJobOutputPropertiesStreamsVideoStreamListVideoStream build(java.util.Map<String, ?> map) throws Exception {
            QueryJobListResponseBodyJobListJobOutputPropertiesStreamsVideoStreamListVideoStream self = new QueryJobListResponseBodyJobListJobOutputPropertiesStreamsVideoStreamListVideoStream();
            return TeaModel.build(map, self);
        }

        public QueryJobListResponseBodyJobListJobOutputPropertiesStreamsVideoStreamListVideoStream setAvgFPS(String avgFPS) {
            this.avgFPS = avgFPS;
            return this;
        }
        public String getAvgFPS() {
            return this.avgFPS;
        }

        public QueryJobListResponseBodyJobListJobOutputPropertiesStreamsVideoStreamListVideoStream setBitrate(String bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public String getBitrate() {
            return this.bitrate;
        }

        public QueryJobListResponseBodyJobListJobOutputPropertiesStreamsVideoStreamListVideoStream setCodecLongName(String codecLongName) {
            this.codecLongName = codecLongName;
            return this;
        }
        public String getCodecLongName() {
            return this.codecLongName;
        }

        public QueryJobListResponseBodyJobListJobOutputPropertiesStreamsVideoStreamListVideoStream setCodecName(String codecName) {
            this.codecName = codecName;
            return this;
        }
        public String getCodecName() {
            return this.codecName;
        }

        public QueryJobListResponseBodyJobListJobOutputPropertiesStreamsVideoStreamListVideoStream setCodecTag(String codecTag) {
            this.codecTag = codecTag;
            return this;
        }
        public String getCodecTag() {
            return this.codecTag;
        }

        public QueryJobListResponseBodyJobListJobOutputPropertiesStreamsVideoStreamListVideoStream setCodecTagString(String codecTagString) {
            this.codecTagString = codecTagString;
            return this;
        }
        public String getCodecTagString() {
            return this.codecTagString;
        }

        public QueryJobListResponseBodyJobListJobOutputPropertiesStreamsVideoStreamListVideoStream setCodecTimeBase(String codecTimeBase) {
            this.codecTimeBase = codecTimeBase;
            return this;
        }
        public String getCodecTimeBase() {
            return this.codecTimeBase;
        }

        public QueryJobListResponseBodyJobListJobOutputPropertiesStreamsVideoStreamListVideoStream setDar(String dar) {
            this.dar = dar;
            return this;
        }
        public String getDar() {
            return this.dar;
        }

        public QueryJobListResponseBodyJobListJobOutputPropertiesStreamsVideoStreamListVideoStream setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public QueryJobListResponseBodyJobListJobOutputPropertiesStreamsVideoStreamListVideoStream setFps(String fps) {
            this.fps = fps;
            return this;
        }
        public String getFps() {
            return this.fps;
        }

        public QueryJobListResponseBodyJobListJobOutputPropertiesStreamsVideoStreamListVideoStream setHasBFrames(String hasBFrames) {
            this.hasBFrames = hasBFrames;
            return this;
        }
        public String getHasBFrames() {
            return this.hasBFrames;
        }

        public QueryJobListResponseBodyJobListJobOutputPropertiesStreamsVideoStreamListVideoStream setHeight(String height) {
            this.height = height;
            return this;
        }
        public String getHeight() {
            return this.height;
        }

        public QueryJobListResponseBodyJobListJobOutputPropertiesStreamsVideoStreamListVideoStream setIndex(String index) {
            this.index = index;
            return this;
        }
        public String getIndex() {
            return this.index;
        }

        public QueryJobListResponseBodyJobListJobOutputPropertiesStreamsVideoStreamListVideoStream setLang(String lang) {
            this.lang = lang;
            return this;
        }
        public String getLang() {
            return this.lang;
        }

        public QueryJobListResponseBodyJobListJobOutputPropertiesStreamsVideoStreamListVideoStream setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

        public QueryJobListResponseBodyJobListJobOutputPropertiesStreamsVideoStreamListVideoStream setNetworkCost(QueryJobListResponseBodyJobListJobOutputPropertiesStreamsVideoStreamListVideoStreamNetworkCost networkCost) {
            this.networkCost = networkCost;
            return this;
        }
        public QueryJobListResponseBodyJobListJobOutputPropertiesStreamsVideoStreamListVideoStreamNetworkCost getNetworkCost() {
            return this.networkCost;
        }

        public QueryJobListResponseBodyJobListJobOutputPropertiesStreamsVideoStreamListVideoStream setNumFrames(String numFrames) {
            this.numFrames = numFrames;
            return this;
        }
        public String getNumFrames() {
            return this.numFrames;
        }

        public QueryJobListResponseBodyJobListJobOutputPropertiesStreamsVideoStreamListVideoStream setPixFmt(String pixFmt) {
            this.pixFmt = pixFmt;
            return this;
        }
        public String getPixFmt() {
            return this.pixFmt;
        }

        public QueryJobListResponseBodyJobListJobOutputPropertiesStreamsVideoStreamListVideoStream setProfile(String profile) {
            this.profile = profile;
            return this;
        }
        public String getProfile() {
            return this.profile;
        }

        public QueryJobListResponseBodyJobListJobOutputPropertiesStreamsVideoStreamListVideoStream setSar(String sar) {
            this.sar = sar;
            return this;
        }
        public String getSar() {
            return this.sar;
        }

        public QueryJobListResponseBodyJobListJobOutputPropertiesStreamsVideoStreamListVideoStream setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public QueryJobListResponseBodyJobListJobOutputPropertiesStreamsVideoStreamListVideoStream setTimebase(String timebase) {
            this.timebase = timebase;
            return this;
        }
        public String getTimebase() {
            return this.timebase;
        }

        public QueryJobListResponseBodyJobListJobOutputPropertiesStreamsVideoStreamListVideoStream setWidth(String width) {
            this.width = width;
            return this;
        }
        public String getWidth() {
            return this.width;
        }

        public QueryJobListResponseBodyJobListJobOutputPropertiesStreamsVideoStreamListVideoStream setBitsPerRawSample(String bitsPerRawSample) {
            this.bitsPerRawSample = bitsPerRawSample;
            return this;
        }
        public String getBitsPerRawSample() {
            return this.bitsPerRawSample;
        }

        public QueryJobListResponseBodyJobListJobOutputPropertiesStreamsVideoStreamListVideoStream setColorPrimaries(String colorPrimaries) {
            this.colorPrimaries = colorPrimaries;
            return this;
        }
        public String getColorPrimaries() {
            return this.colorPrimaries;
        }

        public QueryJobListResponseBodyJobListJobOutputPropertiesStreamsVideoStreamListVideoStream setColorTransfer(String colorTransfer) {
            this.colorTransfer = colorTransfer;
            return this;
        }
        public String getColorTransfer() {
            return this.colorTransfer;
        }

    }

    public static class QueryJobListResponseBodyJobListJobOutputPropertiesStreamsVideoStreamList extends TeaModel {
        @NameInMap("VideoStream")
        public java.util.List<QueryJobListResponseBodyJobListJobOutputPropertiesStreamsVideoStreamListVideoStream> videoStream;

        public static QueryJobListResponseBodyJobListJobOutputPropertiesStreamsVideoStreamList build(java.util.Map<String, ?> map) throws Exception {
            QueryJobListResponseBodyJobListJobOutputPropertiesStreamsVideoStreamList self = new QueryJobListResponseBodyJobListJobOutputPropertiesStreamsVideoStreamList();
            return TeaModel.build(map, self);
        }

        public QueryJobListResponseBodyJobListJobOutputPropertiesStreamsVideoStreamList setVideoStream(java.util.List<QueryJobListResponseBodyJobListJobOutputPropertiesStreamsVideoStreamListVideoStream> videoStream) {
            this.videoStream = videoStream;
            return this;
        }
        public java.util.List<QueryJobListResponseBodyJobListJobOutputPropertiesStreamsVideoStreamListVideoStream> getVideoStream() {
            return this.videoStream;
        }

    }

    public static class QueryJobListResponseBodyJobListJobOutputPropertiesStreams extends TeaModel {
        /**
         * <p>The audio streams.</p>
         */
        @NameInMap("AudioStreamList")
        public QueryJobListResponseBodyJobListJobOutputPropertiesStreamsAudioStreamList audioStreamList;

        /**
         * <p>The caption streams.</p>
         */
        @NameInMap("SubtitleStreamList")
        public QueryJobListResponseBodyJobListJobOutputPropertiesStreamsSubtitleStreamList subtitleStreamList;

        /**
         * <p>The video streams.</p>
         */
        @NameInMap("VideoStreamList")
        public QueryJobListResponseBodyJobListJobOutputPropertiesStreamsVideoStreamList videoStreamList;

        public static QueryJobListResponseBodyJobListJobOutputPropertiesStreams build(java.util.Map<String, ?> map) throws Exception {
            QueryJobListResponseBodyJobListJobOutputPropertiesStreams self = new QueryJobListResponseBodyJobListJobOutputPropertiesStreams();
            return TeaModel.build(map, self);
        }

        public QueryJobListResponseBodyJobListJobOutputPropertiesStreams setAudioStreamList(QueryJobListResponseBodyJobListJobOutputPropertiesStreamsAudioStreamList audioStreamList) {
            this.audioStreamList = audioStreamList;
            return this;
        }
        public QueryJobListResponseBodyJobListJobOutputPropertiesStreamsAudioStreamList getAudioStreamList() {
            return this.audioStreamList;
        }

        public QueryJobListResponseBodyJobListJobOutputPropertiesStreams setSubtitleStreamList(QueryJobListResponseBodyJobListJobOutputPropertiesStreamsSubtitleStreamList subtitleStreamList) {
            this.subtitleStreamList = subtitleStreamList;
            return this;
        }
        public QueryJobListResponseBodyJobListJobOutputPropertiesStreamsSubtitleStreamList getSubtitleStreamList() {
            return this.subtitleStreamList;
        }

        public QueryJobListResponseBodyJobListJobOutputPropertiesStreams setVideoStreamList(QueryJobListResponseBodyJobListJobOutputPropertiesStreamsVideoStreamList videoStreamList) {
            this.videoStreamList = videoStreamList;
            return this;
        }
        public QueryJobListResponseBodyJobListJobOutputPropertiesStreamsVideoStreamList getVideoStreamList() {
            return this.videoStreamList;
        }

    }

    public static class QueryJobListResponseBodyJobListJobOutputProperties extends TeaModel {
        /**
         * <p>The video bitrate.</p>
         * 
         * <strong>example:</strong>
         * <p>490</p>
         */
        @NameInMap("Bitrate")
        public String bitrate;

        /**
         * <p>The video duration.</p>
         * 
         * <strong>example:</strong>
         * <p>17</p>
         */
        @NameInMap("Duration")
        public String duration;

        /**
         * <p>The video format.</p>
         * 
         * <strong>example:</strong>
         * <p>mp4</p>
         */
        @NameInMap("FileFormat")
        public String fileFormat;

        /**
         * <p>The size of the media file.</p>
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
        public QueryJobListResponseBodyJobListJobOutputPropertiesFormat format;

        /**
         * <p>The frame rate of the video.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("Fps")
        public String fps;

        /**
         * <p>The video height.</p>
         * 
         * <strong>example:</strong>
         * <p>1280</p>
         */
        @NameInMap("Height")
        public String height;

        /**
         * <p>The non-engine layer keywords.</p>
         */
        @NameInMap("SourceLogos")
        public QueryJobListResponseBodyJobListJobOutputPropertiesSourceLogos sourceLogos;

        /**
         * <p>The stream information.</p>
         */
        @NameInMap("Streams")
        public QueryJobListResponseBodyJobListJobOutputPropertiesStreams streams;

        /**
         * <p>The video width.</p>
         * 
         * <strong>example:</strong>
         * <p>720</p>
         */
        @NameInMap("Width")
        public String width;

        public static QueryJobListResponseBodyJobListJobOutputProperties build(java.util.Map<String, ?> map) throws Exception {
            QueryJobListResponseBodyJobListJobOutputProperties self = new QueryJobListResponseBodyJobListJobOutputProperties();
            return TeaModel.build(map, self);
        }

        public QueryJobListResponseBodyJobListJobOutputProperties setBitrate(String bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public String getBitrate() {
            return this.bitrate;
        }

        public QueryJobListResponseBodyJobListJobOutputProperties setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public QueryJobListResponseBodyJobListJobOutputProperties setFileFormat(String fileFormat) {
            this.fileFormat = fileFormat;
            return this;
        }
        public String getFileFormat() {
            return this.fileFormat;
        }

        public QueryJobListResponseBodyJobListJobOutputProperties setFileSize(String fileSize) {
            this.fileSize = fileSize;
            return this;
        }
        public String getFileSize() {
            return this.fileSize;
        }

        public QueryJobListResponseBodyJobListJobOutputProperties setFormat(QueryJobListResponseBodyJobListJobOutputPropertiesFormat format) {
            this.format = format;
            return this;
        }
        public QueryJobListResponseBodyJobListJobOutputPropertiesFormat getFormat() {
            return this.format;
        }

        public QueryJobListResponseBodyJobListJobOutputProperties setFps(String fps) {
            this.fps = fps;
            return this;
        }
        public String getFps() {
            return this.fps;
        }

        public QueryJobListResponseBodyJobListJobOutputProperties setHeight(String height) {
            this.height = height;
            return this;
        }
        public String getHeight() {
            return this.height;
        }

        public QueryJobListResponseBodyJobListJobOutputProperties setSourceLogos(QueryJobListResponseBodyJobListJobOutputPropertiesSourceLogos sourceLogos) {
            this.sourceLogos = sourceLogos;
            return this;
        }
        public QueryJobListResponseBodyJobListJobOutputPropertiesSourceLogos getSourceLogos() {
            return this.sourceLogos;
        }

        public QueryJobListResponseBodyJobListJobOutputProperties setStreams(QueryJobListResponseBodyJobListJobOutputPropertiesStreams streams) {
            this.streams = streams;
            return this;
        }
        public QueryJobListResponseBodyJobListJobOutputPropertiesStreams getStreams() {
            return this.streams;
        }

        public QueryJobListResponseBodyJobListJobOutputProperties setWidth(String width) {
            this.width = width;
            return this;
        }
        public String getWidth() {
            return this.width;
        }

    }

    public static class QueryJobListResponseBodyJobListJobOutputSubtitleConfigExtSubtitleListExtSubtitleInput extends TeaModel {
        /**
         * <p>The name of the OSS bucket in which the input caption file is stored.</p>
         * 
         * <strong>example:</strong>
         * <p>example-bucket-****</p>
         */
        @NameInMap("Bucket")
        public String bucket;

        /**
         * <p>The OSS region in which the input caption file resides.</p>
         * 
         * <strong>example:</strong>
         * <p>oss-cn-hangzhou</p>
         */
        @NameInMap("Location")
        public String location;

        /**
         * <p>The name of the OSS object that is used as the input caption file.</p>
         * 
         * <strong>example:</strong>
         * <p>example-output.flv</p>
         */
        @NameInMap("Object")
        public String object;

        public static QueryJobListResponseBodyJobListJobOutputSubtitleConfigExtSubtitleListExtSubtitleInput build(java.util.Map<String, ?> map) throws Exception {
            QueryJobListResponseBodyJobListJobOutputSubtitleConfigExtSubtitleListExtSubtitleInput self = new QueryJobListResponseBodyJobListJobOutputSubtitleConfigExtSubtitleListExtSubtitleInput();
            return TeaModel.build(map, self);
        }

        public QueryJobListResponseBodyJobListJobOutputSubtitleConfigExtSubtitleListExtSubtitleInput setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

        public QueryJobListResponseBodyJobListJobOutputSubtitleConfigExtSubtitleListExtSubtitleInput setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public QueryJobListResponseBodyJobListJobOutputSubtitleConfigExtSubtitleListExtSubtitleInput setObject(String object) {
            this.object = object;
            return this;
        }
        public String getObject() {
            return this.object;
        }

    }

    public static class QueryJobListResponseBodyJobListJobOutputSubtitleConfigExtSubtitleListExtSubtitle extends TeaModel {
        /**
         * <p>The character set used by the external caption.</p>
         * <ul>
         * <li>Valid values: UTF-8, GBK, BIG5, and auto.</li>
         * <li>Default value: <strong>auto</strong>.</li>
         * </ul>
         * <blockquote>
         * <p> If the value of CharEnc is auto, the detected character set may not be the actual character set. We recommend that you set this parameter to another value.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>auto</p>
         */
        @NameInMap("CharEnc")
        public String charEnc;

        /**
         * <p>The font of the hardcoded captions converted from external captions. Default value: SimSum. For more information, see <a href="https://help.aliyun.com/document_detail/59950.html">Fonts</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;WenQuanYi Zen Hei&quot;, &quot;Yuanti SC Regular&quot;, &quot;SimSun&quot;</p>
         */
        @NameInMap("FontName")
        public String fontName;

        /**
         * <p>The input caption file.</p>
         * <ul>
         * <li>SRT and ASS files are supported. For more information, see the Input section of the <a href="https://help.aliyun.com/document_detail/29253.html">Parameter details</a> topic.</li>
         * <li>Example: <code>{&quot;Bucket&quot;:&quot;example-bucket&quot;,&quot;Location&quot;:&quot;oss-cn-hangzhou&quot;,&quot;Object&quot;:&quot;example.srt&quot;}</code>.</li>
         * </ul>
         */
        @NameInMap("Input")
        public QueryJobListResponseBodyJobListJobOutputSubtitleConfigExtSubtitleListExtSubtitleInput input;

        public static QueryJobListResponseBodyJobListJobOutputSubtitleConfigExtSubtitleListExtSubtitle build(java.util.Map<String, ?> map) throws Exception {
            QueryJobListResponseBodyJobListJobOutputSubtitleConfigExtSubtitleListExtSubtitle self = new QueryJobListResponseBodyJobListJobOutputSubtitleConfigExtSubtitleListExtSubtitle();
            return TeaModel.build(map, self);
        }

        public QueryJobListResponseBodyJobListJobOutputSubtitleConfigExtSubtitleListExtSubtitle setCharEnc(String charEnc) {
            this.charEnc = charEnc;
            return this;
        }
        public String getCharEnc() {
            return this.charEnc;
        }

        public QueryJobListResponseBodyJobListJobOutputSubtitleConfigExtSubtitleListExtSubtitle setFontName(String fontName) {
            this.fontName = fontName;
            return this;
        }
        public String getFontName() {
            return this.fontName;
        }

        public QueryJobListResponseBodyJobListJobOutputSubtitleConfigExtSubtitleListExtSubtitle setInput(QueryJobListResponseBodyJobListJobOutputSubtitleConfigExtSubtitleListExtSubtitleInput input) {
            this.input = input;
            return this;
        }
        public QueryJobListResponseBodyJobListJobOutputSubtitleConfigExtSubtitleListExtSubtitleInput getInput() {
            return this.input;
        }

    }

    public static class QueryJobListResponseBodyJobListJobOutputSubtitleConfigExtSubtitleList extends TeaModel {
        @NameInMap("ExtSubtitle")
        public java.util.List<QueryJobListResponseBodyJobListJobOutputSubtitleConfigExtSubtitleListExtSubtitle> extSubtitle;

        public static QueryJobListResponseBodyJobListJobOutputSubtitleConfigExtSubtitleList build(java.util.Map<String, ?> map) throws Exception {
            QueryJobListResponseBodyJobListJobOutputSubtitleConfigExtSubtitleList self = new QueryJobListResponseBodyJobListJobOutputSubtitleConfigExtSubtitleList();
            return TeaModel.build(map, self);
        }

        public QueryJobListResponseBodyJobListJobOutputSubtitleConfigExtSubtitleList setExtSubtitle(java.util.List<QueryJobListResponseBodyJobListJobOutputSubtitleConfigExtSubtitleListExtSubtitle> extSubtitle) {
            this.extSubtitle = extSubtitle;
            return this;
        }
        public java.util.List<QueryJobListResponseBodyJobListJobOutputSubtitleConfigExtSubtitleListExtSubtitle> getExtSubtitle() {
            return this.extSubtitle;
        }

    }

    public static class QueryJobListResponseBodyJobListJobOutputSubtitleConfigSubtitleListSubtitle extends TeaModel {
        /**
         * <p>The audio track. Format: <code>0:{Stream}:{Stream sequence number}</code>, which is <code>0:a:{audio_index}</code>. The value of Stream is a, which indicates an audio stream. The sequence number is the index of the audio stream in the list and starts from 0.</p>
         * 
         * <strong>example:</strong>
         * <p>0:a:0</p>
         */
        @NameInMap("Map")
        public String map;

        public static QueryJobListResponseBodyJobListJobOutputSubtitleConfigSubtitleListSubtitle build(java.util.Map<String, ?> map) throws Exception {
            QueryJobListResponseBodyJobListJobOutputSubtitleConfigSubtitleListSubtitle self = new QueryJobListResponseBodyJobListJobOutputSubtitleConfigSubtitleListSubtitle();
            return TeaModel.build(map, self);
        }

        public QueryJobListResponseBodyJobListJobOutputSubtitleConfigSubtitleListSubtitle setMap(String map) {
            this.map = map;
            return this;
        }
        public String getMap() {
            return this.map;
        }

    }

    public static class QueryJobListResponseBodyJobListJobOutputSubtitleConfigSubtitleList extends TeaModel {
        @NameInMap("Subtitle")
        public java.util.List<QueryJobListResponseBodyJobListJobOutputSubtitleConfigSubtitleListSubtitle> subtitle;

        public static QueryJobListResponseBodyJobListJobOutputSubtitleConfigSubtitleList build(java.util.Map<String, ?> map) throws Exception {
            QueryJobListResponseBodyJobListJobOutputSubtitleConfigSubtitleList self = new QueryJobListResponseBodyJobListJobOutputSubtitleConfigSubtitleList();
            return TeaModel.build(map, self);
        }

        public QueryJobListResponseBodyJobListJobOutputSubtitleConfigSubtitleList setSubtitle(java.util.List<QueryJobListResponseBodyJobListJobOutputSubtitleConfigSubtitleListSubtitle> subtitle) {
            this.subtitle = subtitle;
            return this;
        }
        public java.util.List<QueryJobListResponseBodyJobListJobOutputSubtitleConfigSubtitleListSubtitle> getSubtitle() {
            return this.subtitle;
        }

    }

    public static class QueryJobListResponseBodyJobListJobOutputSubtitleConfig extends TeaModel {
        /**
         * <p>The external captions.</p>
         */
        @NameInMap("ExtSubtitleList")
        public QueryJobListResponseBodyJobListJobOutputSubtitleConfigExtSubtitleList extSubtitleList;

        /**
         * <p>The captions.</p>
         */
        @NameInMap("SubtitleList")
        public QueryJobListResponseBodyJobListJobOutputSubtitleConfigSubtitleList subtitleList;

        public static QueryJobListResponseBodyJobListJobOutputSubtitleConfig build(java.util.Map<String, ?> map) throws Exception {
            QueryJobListResponseBodyJobListJobOutputSubtitleConfig self = new QueryJobListResponseBodyJobListJobOutputSubtitleConfig();
            return TeaModel.build(map, self);
        }

        public QueryJobListResponseBodyJobListJobOutputSubtitleConfig setExtSubtitleList(QueryJobListResponseBodyJobListJobOutputSubtitleConfigExtSubtitleList extSubtitleList) {
            this.extSubtitleList = extSubtitleList;
            return this;
        }
        public QueryJobListResponseBodyJobListJobOutputSubtitleConfigExtSubtitleList getExtSubtitleList() {
            return this.extSubtitleList;
        }

        public QueryJobListResponseBodyJobListJobOutputSubtitleConfig setSubtitleList(QueryJobListResponseBodyJobListJobOutputSubtitleConfigSubtitleList subtitleList) {
            this.subtitleList = subtitleList;
            return this;
        }
        public QueryJobListResponseBodyJobListJobOutputSubtitleConfigSubtitleList getSubtitleList() {
            return this.subtitleList;
        }

    }

    public static class QueryJobListResponseBodyJobListJobOutputSuperReso extends TeaModel {
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

        public static QueryJobListResponseBodyJobListJobOutputSuperReso build(java.util.Map<String, ?> map) throws Exception {
            QueryJobListResponseBodyJobListJobOutputSuperReso self = new QueryJobListResponseBodyJobListJobOutputSuperReso();
            return TeaModel.build(map, self);
        }

        public QueryJobListResponseBodyJobListJobOutputSuperReso setIsHalfSample(String isHalfSample) {
            this.isHalfSample = isHalfSample;
            return this;
        }
        public String getIsHalfSample() {
            return this.isHalfSample;
        }

    }

    public static class QueryJobListResponseBodyJobListJobOutputTailSlateListTailSlate extends TeaModel {
        /**
         * <p>The color of the bars that are added to the ending part if the size of the ending part is smaller than that of the main part. Default value: White. For more information, see <a href="https://help.aliyun.com/document_detail/29253.html">Parameter details</a>.</p>
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
         * <p>The height of the ending part.</p>
         * <ul>
         * <li>Valid values: values in the range of (0,4096), -1, and full.</li>
         * <li>A value of -1 indicates that the original height of the ending part is retained.</li>
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
         * <p>The time when the ending part is played.</p>
         * 
         * <strong>example:</strong>
         * <p>00000.00</p>
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
         * <p>The width of the ending part. Valid values: values in the range of (0,4096), -1, and full.</p>
         * <ul>
         * <li>A value of -1 indicates that the original width of the ending part is retained.</li>
         * <li>A value of full indicates that the width of the ending part equals the width of the main part.</li>
         * <li>Default value: -1.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>-1</p>
         */
        @NameInMap("Width")
        public String width;

        public static QueryJobListResponseBodyJobListJobOutputTailSlateListTailSlate build(java.util.Map<String, ?> map) throws Exception {
            QueryJobListResponseBodyJobListJobOutputTailSlateListTailSlate self = new QueryJobListResponseBodyJobListJobOutputTailSlateListTailSlate();
            return TeaModel.build(map, self);
        }

        public QueryJobListResponseBodyJobListJobOutputTailSlateListTailSlate setBgColor(String bgColor) {
            this.bgColor = bgColor;
            return this;
        }
        public String getBgColor() {
            return this.bgColor;
        }

        public QueryJobListResponseBodyJobListJobOutputTailSlateListTailSlate setBlendDuration(String blendDuration) {
            this.blendDuration = blendDuration;
            return this;
        }
        public String getBlendDuration() {
            return this.blendDuration;
        }

        public QueryJobListResponseBodyJobListJobOutputTailSlateListTailSlate setHeight(String height) {
            this.height = height;
            return this;
        }
        public String getHeight() {
            return this.height;
        }

        public QueryJobListResponseBodyJobListJobOutputTailSlateListTailSlate setIsMergeAudio(Boolean isMergeAudio) {
            this.isMergeAudio = isMergeAudio;
            return this;
        }
        public Boolean getIsMergeAudio() {
            return this.isMergeAudio;
        }

        public QueryJobListResponseBodyJobListJobOutputTailSlateListTailSlate setStart(String start) {
            this.start = start;
            return this;
        }
        public String getStart() {
            return this.start;
        }

        public QueryJobListResponseBodyJobListJobOutputTailSlateListTailSlate setTailUrl(String tailUrl) {
            this.tailUrl = tailUrl;
            return this;
        }
        public String getTailUrl() {
            return this.tailUrl;
        }

        public QueryJobListResponseBodyJobListJobOutputTailSlateListTailSlate setWidth(String width) {
            this.width = width;
            return this;
        }
        public String getWidth() {
            return this.width;
        }

    }

    public static class QueryJobListResponseBodyJobListJobOutputTailSlateList extends TeaModel {
        @NameInMap("TailSlate")
        public java.util.List<QueryJobListResponseBodyJobListJobOutputTailSlateListTailSlate> tailSlate;

        public static QueryJobListResponseBodyJobListJobOutputTailSlateList build(java.util.Map<String, ?> map) throws Exception {
            QueryJobListResponseBodyJobListJobOutputTailSlateList self = new QueryJobListResponseBodyJobListJobOutputTailSlateList();
            return TeaModel.build(map, self);
        }

        public QueryJobListResponseBodyJobListJobOutputTailSlateList setTailSlate(java.util.List<QueryJobListResponseBodyJobListJobOutputTailSlateListTailSlate> tailSlate) {
            this.tailSlate = tailSlate;
            return this;
        }
        public java.util.List<QueryJobListResponseBodyJobListJobOutputTailSlateListTailSlate> getTailSlate() {
            return this.tailSlate;
        }

    }

    public static class QueryJobListResponseBodyJobListJobOutputTransConfig extends TeaModel {
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
         * <li>If this parameter is empty and the codec of the output audio is different from that of the input audio, the default value is false.</li>
         * <li>If this parameter is empty and the codec of the output audio is the same as that of the input audio, the default value is true.</li>
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
         * <p>Indicates whether the audio bitrate is checked. If the bitrate of the output audio is higher than that of the input audio, the input audio is not transcoded and a transcoding failure is returned. This parameter has a higher priority than IsCheckAudioBitrate. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * <li>Default value: <strong>false</strong>.</li>
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
         * <li><strong>true</strong>:</li>
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
         * <p>Indicates whether the video bitrate is checked. If the bitrate of the output video is higher than that of the input video, the input video is not transcoded and a transcoding failure is returned. This parameter has a higher priority than IsCheckVideoBitrate. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * <li>Default value: <strong>false</strong>.</li>
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
         * <li>Default value: <strong>onepass</strong>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>onepass</p>
         */
        @NameInMap("TransMode")
        public String transMode;

        public static QueryJobListResponseBodyJobListJobOutputTransConfig build(java.util.Map<String, ?> map) throws Exception {
            QueryJobListResponseBodyJobListJobOutputTransConfig self = new QueryJobListResponseBodyJobListJobOutputTransConfig();
            return TeaModel.build(map, self);
        }

        public QueryJobListResponseBodyJobListJobOutputTransConfig setAdjDarMethod(String adjDarMethod) {
            this.adjDarMethod = adjDarMethod;
            return this;
        }
        public String getAdjDarMethod() {
            return this.adjDarMethod;
        }

        public QueryJobListResponseBodyJobListJobOutputTransConfig setIsCheckAudioBitrate(String isCheckAudioBitrate) {
            this.isCheckAudioBitrate = isCheckAudioBitrate;
            return this;
        }
        public String getIsCheckAudioBitrate() {
            return this.isCheckAudioBitrate;
        }

        public QueryJobListResponseBodyJobListJobOutputTransConfig setIsCheckAudioBitrateFail(String isCheckAudioBitrateFail) {
            this.isCheckAudioBitrateFail = isCheckAudioBitrateFail;
            return this;
        }
        public String getIsCheckAudioBitrateFail() {
            return this.isCheckAudioBitrateFail;
        }

        public QueryJobListResponseBodyJobListJobOutputTransConfig setIsCheckReso(String isCheckReso) {
            this.isCheckReso = isCheckReso;
            return this;
        }
        public String getIsCheckReso() {
            return this.isCheckReso;
        }

        public QueryJobListResponseBodyJobListJobOutputTransConfig setIsCheckResoFail(String isCheckResoFail) {
            this.isCheckResoFail = isCheckResoFail;
            return this;
        }
        public String getIsCheckResoFail() {
            return this.isCheckResoFail;
        }

        public QueryJobListResponseBodyJobListJobOutputTransConfig setIsCheckVideoBitrate(String isCheckVideoBitrate) {
            this.isCheckVideoBitrate = isCheckVideoBitrate;
            return this;
        }
        public String getIsCheckVideoBitrate() {
            return this.isCheckVideoBitrate;
        }

        public QueryJobListResponseBodyJobListJobOutputTransConfig setIsCheckVideoBitrateFail(String isCheckVideoBitrateFail) {
            this.isCheckVideoBitrateFail = isCheckVideoBitrateFail;
            return this;
        }
        public String getIsCheckVideoBitrateFail() {
            return this.isCheckVideoBitrateFail;
        }

        public QueryJobListResponseBodyJobListJobOutputTransConfig setTransMode(String transMode) {
            this.transMode = transMode;
            return this;
        }
        public String getTransMode() {
            return this.transMode;
        }

    }

    public static class QueryJobListResponseBodyJobListJobOutputVideoBitrateBnd extends TeaModel {
        /**
         * <p>The maximum bitrate.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("Max")
        public String max;

        /**
         * <p>The minimum bitrate.</p>
         * 
         * <strong>example:</strong>
         * <p>300</p>
         */
        @NameInMap("Min")
        public String min;

        public static QueryJobListResponseBodyJobListJobOutputVideoBitrateBnd build(java.util.Map<String, ?> map) throws Exception {
            QueryJobListResponseBodyJobListJobOutputVideoBitrateBnd self = new QueryJobListResponseBodyJobListJobOutputVideoBitrateBnd();
            return TeaModel.build(map, self);
        }

        public QueryJobListResponseBodyJobListJobOutputVideoBitrateBnd setMax(String max) {
            this.max = max;
            return this;
        }
        public String getMax() {
            return this.max;
        }

        public QueryJobListResponseBodyJobListJobOutputVideoBitrateBnd setMin(String min) {
            this.min = min;
            return this;
        }
        public String getMin() {
            return this.min;
        }

    }

    public static class QueryJobListResponseBodyJobListJobOutputVideo extends TeaModel {
        /**
         * <p>The average bitrate of the video. Unit: Kbit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>500</p>
         */
        @NameInMap("Bitrate")
        public String bitrate;

        /**
         * <p>The average bitrate range of the video.</p>
         */
        @NameInMap("BitrateBnd")
        public QueryJobListResponseBodyJobListJobOutputVideoBitrateBnd bitrateBnd;

        /**
         * <p>The buffer size.</p>
         * <ul>
         * <li>Unit: KB.</li>
         * <li>Default value: <strong>6000</strong>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>6000</p>
         */
        @NameInMap("Bufsize")
        public String bufsize;

        /**
         * <p>The video codec.</p>
         * <ul>
         * <li>Valid values: H.264 and H.265.</li>
         * <li>Default value: H.264.</li>
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
         * <li>Default value when the value of Codec is H.264: <strong>23</strong>, default value when the value of Codec is H.265: <strong>26</strong>.</li>
         * <li>If the value of this parameter is returned, the value of Bitrate becomes invalid.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>26</p>
         */
        @NameInMap("Crf")
        public String crf;

        /**
         * <p>The method of video cropping. Valid values:</p>
         * <ul>
         * <li><strong>border</strong>: automatically detects and removes borders.</li>
         * <li>A value in the width:height:left:top format: The video image is cropped based on custom settings.</li>
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
         * <p>The frame rate of the video.</p>
         * <ul>
         * <li>Unit: frames per second.</li>
         * <li>The value is 60 if the frame rate of the input file exceeds 60.</li>
         * <li>Default value: the frame rate of the input video.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>25</p>
         */
        @NameInMap("Fps")
        public String fps;

        /**
         * <p>The maximum interval between keyframes or the maximum number of frames in a frame group. Unit: seconds.</p>
         * <ul>
         * <li>Default value: <strong>250</strong>.</li>
         * <li>If the maximum number of frames is returned, the value does not contain a unit.</li>
         * </ul>
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
         * <p>3000</p>
         */
        @NameInMap("Maxrate")
        public String maxrate;

        /**
         * <p>The black bars that are added to the video.</p>
         * <ul>
         * <li>Unit: pixel.</li>
         * <li>Format: width:height:left:top.</li>
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
         * <p>medium</p>
         */
        @NameInMap("Preset")
        public String preset;

        /**
         * <p>The codec profile of the video. Valid values: baseline, main, and high.</p>
         * <blockquote>
         * <p> If multiple definitions are involved, we recommend that you use baseline for the lowest definition to ensure normal playback on low-end devices, and use main or high for other definitions.</p>
         * </blockquote>
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
         * <p>The resource priority.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ResoPriority")
        public String resoPriority;

        /**
         * <p>The scan mode. Valid values:</p>
         * <ul>
         * <li>If this parameter is left <strong>empty</strong>, the scan mode of the input video is used.</li>
         * <li><strong>auto</strong>: automatic deinterlacing.</li>
         * <li><strong>progressive</strong>: progressive scan.</li>
         * <li><strong>interlaced</strong>: interlaced scan.</li>
         * <li><strong>By default</strong>, this parameter is left empty.</li>
         * </ul>
         * <p><strong>Best practice</strong>: The interlaced scan mode saves data traffic than the progressive scan mode but provides poor image quality. Therefore, the progressive scan mode is commonly used in mainstream video production.</p>
         * <ul>
         * <li>If <strong>progressive</strong> or <strong>interlaced</strong> is used when the scan mode of the input video is neither of them, the transcoding job fails.</li>
         * <li>We recommend that you use <strong>the scan mode of the input video</strong> or <strong>automatic deinterlacing</strong> for higher compatibility.</li>
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

        public static QueryJobListResponseBodyJobListJobOutputVideo build(java.util.Map<String, ?> map) throws Exception {
            QueryJobListResponseBodyJobListJobOutputVideo self = new QueryJobListResponseBodyJobListJobOutputVideo();
            return TeaModel.build(map, self);
        }

        public QueryJobListResponseBodyJobListJobOutputVideo setBitrate(String bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public String getBitrate() {
            return this.bitrate;
        }

        public QueryJobListResponseBodyJobListJobOutputVideo setBitrateBnd(QueryJobListResponseBodyJobListJobOutputVideoBitrateBnd bitrateBnd) {
            this.bitrateBnd = bitrateBnd;
            return this;
        }
        public QueryJobListResponseBodyJobListJobOutputVideoBitrateBnd getBitrateBnd() {
            return this.bitrateBnd;
        }

        public QueryJobListResponseBodyJobListJobOutputVideo setBufsize(String bufsize) {
            this.bufsize = bufsize;
            return this;
        }
        public String getBufsize() {
            return this.bufsize;
        }

        public QueryJobListResponseBodyJobListJobOutputVideo setCodec(String codec) {
            this.codec = codec;
            return this;
        }
        public String getCodec() {
            return this.codec;
        }

        public QueryJobListResponseBodyJobListJobOutputVideo setCrf(String crf) {
            this.crf = crf;
            return this;
        }
        public String getCrf() {
            return this.crf;
        }

        public QueryJobListResponseBodyJobListJobOutputVideo setCrop(String crop) {
            this.crop = crop;
            return this;
        }
        public String getCrop() {
            return this.crop;
        }

        public QueryJobListResponseBodyJobListJobOutputVideo setDegrain(String degrain) {
            this.degrain = degrain;
            return this;
        }
        public String getDegrain() {
            return this.degrain;
        }

        public QueryJobListResponseBodyJobListJobOutputVideo setFps(String fps) {
            this.fps = fps;
            return this;
        }
        public String getFps() {
            return this.fps;
        }

        public QueryJobListResponseBodyJobListJobOutputVideo setGop(String gop) {
            this.gop = gop;
            return this;
        }
        public String getGop() {
            return this.gop;
        }

        public QueryJobListResponseBodyJobListJobOutputVideo setHeight(String height) {
            this.height = height;
            return this;
        }
        public String getHeight() {
            return this.height;
        }

        public QueryJobListResponseBodyJobListJobOutputVideo setMaxFps(String maxFps) {
            this.maxFps = maxFps;
            return this;
        }
        public String getMaxFps() {
            return this.maxFps;
        }

        public QueryJobListResponseBodyJobListJobOutputVideo setMaxrate(String maxrate) {
            this.maxrate = maxrate;
            return this;
        }
        public String getMaxrate() {
            return this.maxrate;
        }

        public QueryJobListResponseBodyJobListJobOutputVideo setPad(String pad) {
            this.pad = pad;
            return this;
        }
        public String getPad() {
            return this.pad;
        }

        public QueryJobListResponseBodyJobListJobOutputVideo setPixFmt(String pixFmt) {
            this.pixFmt = pixFmt;
            return this;
        }
        public String getPixFmt() {
            return this.pixFmt;
        }

        public QueryJobListResponseBodyJobListJobOutputVideo setPreset(String preset) {
            this.preset = preset;
            return this;
        }
        public String getPreset() {
            return this.preset;
        }

        public QueryJobListResponseBodyJobListJobOutputVideo setProfile(String profile) {
            this.profile = profile;
            return this;
        }
        public String getProfile() {
            return this.profile;
        }

        public QueryJobListResponseBodyJobListJobOutputVideo setQscale(String qscale) {
            this.qscale = qscale;
            return this;
        }
        public String getQscale() {
            return this.qscale;
        }

        public QueryJobListResponseBodyJobListJobOutputVideo setResoPriority(String resoPriority) {
            this.resoPriority = resoPriority;
            return this;
        }
        public String getResoPriority() {
            return this.resoPriority;
        }

        public QueryJobListResponseBodyJobListJobOutputVideo setScanMode(String scanMode) {
            this.scanMode = scanMode;
            return this;
        }
        public String getScanMode() {
            return this.scanMode;
        }

        public QueryJobListResponseBodyJobListJobOutputVideo setWidth(String width) {
            this.width = width;
            return this;
        }
        public String getWidth() {
            return this.width;
        }

    }

    public static class QueryJobListResponseBodyJobListJobOutputWaterMarkListWaterMarkInputFile extends TeaModel {
        /**
         * <p>The name of the OSS bucket in which the input file is stored.</p>
         * 
         * <strong>example:</strong>
         * <p>example-bucket</p>
         */
        @NameInMap("Bucket")
        public String bucket;

        /**
         * <p>The OSS region in which the input file resides.</p>
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

        public static QueryJobListResponseBodyJobListJobOutputWaterMarkListWaterMarkInputFile build(java.util.Map<String, ?> map) throws Exception {
            QueryJobListResponseBodyJobListJobOutputWaterMarkListWaterMarkInputFile self = new QueryJobListResponseBodyJobListJobOutputWaterMarkListWaterMarkInputFile();
            return TeaModel.build(map, self);
        }

        public QueryJobListResponseBodyJobListJobOutputWaterMarkListWaterMarkInputFile setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

        public QueryJobListResponseBodyJobListJobOutputWaterMarkListWaterMarkInputFile setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public QueryJobListResponseBodyJobListJobOutputWaterMarkListWaterMarkInputFile setObject(String object) {
            this.object = object;
            return this;
        }
        public String getObject() {
            return this.object;
        }

    }

    public static class QueryJobListResponseBodyJobListJobOutputWaterMarkListWaterMark extends TeaModel {
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
         * <li>The decimal number can be accurate to four decimal places, such as 0.9999. Excessive digits are automatically discarded.</li>
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
         * <li>Valid values: <strong>[8,4096]</strong>.</li>
         * <li>Unit: pixel.</li>
         * </ul>
         * </li>
         * <li><p>A decimal number indicates the ratio of the vertical offset to the height in the output video resolution.</p>
         * <ul>
         * <li>Valid values: <strong>(0,1)</strong>.</li>
         * <li>The decimal number can be accurate to four decimal places, such as 0.9999. Excessive digits are automatically discarded.</li>
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
         * <p>The height of the watermark image. If this parameter is specified in the request, the corresponding parameter in the watermark template is overwritten. The value can be an integer or a decimal number.</p>
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
         * <li>The decimal number can be accurate to four decimal places, such as 0.9999. Excessive digits are automatically discarded.</li>
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
         * <p>The watermark input file. PNG images and MOV files are supported.</p>
         */
        @NameInMap("InputFile")
        public QueryJobListResponseBodyJobListJobOutputWaterMarkListWaterMarkInputFile inputFile;

        /**
         * <p>The position of the watermark. If this parameter is specified in the request, the corresponding parameter in the watermark template is overwritten. Valid values:</p>
         * <ul>
         * <li>TopRight</li>
         * <li>TopLeft</li>
         * <li>BottomRight</li>
         * <li>BottomLeft</li>
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
         * <li>Image</li>
         * <li>Text</li>
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
         * <li>The decimal number can be accurate to four decimal places, such as 0.9999. Excessive digits are automatically discarded.</li>
         * </ul>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("Width")
        public String width;

        public static QueryJobListResponseBodyJobListJobOutputWaterMarkListWaterMark build(java.util.Map<String, ?> map) throws Exception {
            QueryJobListResponseBodyJobListJobOutputWaterMarkListWaterMark self = new QueryJobListResponseBodyJobListJobOutputWaterMarkListWaterMark();
            return TeaModel.build(map, self);
        }

        public QueryJobListResponseBodyJobListJobOutputWaterMarkListWaterMark setDx(String dx) {
            this.dx = dx;
            return this;
        }
        public String getDx() {
            return this.dx;
        }

        public QueryJobListResponseBodyJobListJobOutputWaterMarkListWaterMark setDy(String dy) {
            this.dy = dy;
            return this;
        }
        public String getDy() {
            return this.dy;
        }

        public QueryJobListResponseBodyJobListJobOutputWaterMarkListWaterMark setHeight(String height) {
            this.height = height;
            return this;
        }
        public String getHeight() {
            return this.height;
        }

        public QueryJobListResponseBodyJobListJobOutputWaterMarkListWaterMark setInputFile(QueryJobListResponseBodyJobListJobOutputWaterMarkListWaterMarkInputFile inputFile) {
            this.inputFile = inputFile;
            return this;
        }
        public QueryJobListResponseBodyJobListJobOutputWaterMarkListWaterMarkInputFile getInputFile() {
            return this.inputFile;
        }

        public QueryJobListResponseBodyJobListJobOutputWaterMarkListWaterMark setReferPos(String referPos) {
            this.referPos = referPos;
            return this;
        }
        public String getReferPos() {
            return this.referPos;
        }

        public QueryJobListResponseBodyJobListJobOutputWaterMarkListWaterMark setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public QueryJobListResponseBodyJobListJobOutputWaterMarkListWaterMark setWaterMarkTemplateId(String waterMarkTemplateId) {
            this.waterMarkTemplateId = waterMarkTemplateId;
            return this;
        }
        public String getWaterMarkTemplateId() {
            return this.waterMarkTemplateId;
        }

        public QueryJobListResponseBodyJobListJobOutputWaterMarkListWaterMark setWidth(String width) {
            this.width = width;
            return this;
        }
        public String getWidth() {
            return this.width;
        }

    }

    public static class QueryJobListResponseBodyJobListJobOutputWaterMarkList extends TeaModel {
        @NameInMap("WaterMark")
        public java.util.List<QueryJobListResponseBodyJobListJobOutputWaterMarkListWaterMark> waterMark;

        public static QueryJobListResponseBodyJobListJobOutputWaterMarkList build(java.util.Map<String, ?> map) throws Exception {
            QueryJobListResponseBodyJobListJobOutputWaterMarkList self = new QueryJobListResponseBodyJobListJobOutputWaterMarkList();
            return TeaModel.build(map, self);
        }

        public QueryJobListResponseBodyJobListJobOutputWaterMarkList setWaterMark(java.util.List<QueryJobListResponseBodyJobListJobOutputWaterMarkListWaterMark> waterMark) {
            this.waterMark = waterMark;
            return this;
        }
        public java.util.List<QueryJobListResponseBodyJobListJobOutputWaterMarkListWaterMark> getWaterMark() {
            return this.waterMark;
        }

    }

    public static class QueryJobListResponseBodyJobListJobOutput extends TeaModel {
        /**
         * <p>The audio configurations.</p>
         * <blockquote>
         * <p> If this parameter is specified in the request, the corresponding parameters in the specified transcoding template are overwritten.</p>
         * </blockquote>
         */
        @NameInMap("Audio")
        public QueryJobListResponseBodyJobListJobOutputAudio audio;

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
         * <p>The information about clips.</p>
         */
        @NameInMap("Clip")
        public QueryJobListResponseBodyJobListJobOutputClip clip;

        /**
         * <p>The container format configurations.</p>
         */
        @NameInMap("Container")
        public QueryJobListResponseBodyJobListJobOutputContainer container;

        /**
         * <p>The configurations of watermark blurring. The value is a JSON object. For more information, see the DeWatermark section of the <a href="https://help.aliyun.com/document_detail/29253.html">Parameter details</a> topic.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;0&quot;:[{&quot;l&quot;:10,&quot;t&quot;:10,&quot;w&quot;:10,&quot;h&quot;:10},{&quot;l&quot;:100,&quot;t&quot;:0.1,&quot;w&quot;:10,&quot;h&quot;:10}],&quot;128000&quot;:[],&quot;250000&quot;:[{&quot;l&quot;:0.2,&quot;t&quot;:0.1,&quot;w&quot;:0.01,&quot;h&quot;:0.05}]}</p>
         */
        @NameInMap("DeWatermark")
        public String deWatermark;

        /**
         * <p>The encryption configurations. The encrypted video file is generated in the M3U8 format.</p>
         */
        @NameInMap("Encryption")
        public QueryJobListResponseBodyJobListJobOutputEncryption encryption;

        /**
         * <p>The custom fields.</p>
         * 
         * <strong>example:</strong>
         * <p>testid-002</p>
         */
        @NameInMap("ExtendData")
        public String extendData;

        /**
         * <p>The non-standard support configurations for M3U8. The value is a JSON object. For more information, see the M3U8NonStandardSupport section of the <a href="https://help.aliyun.com/document_detail/29253.html">Parameter details</a> topic.</p>
         */
        @NameInMap("M3U8NonStandardSupport")
        public QueryJobListResponseBodyJobListJobOutputM3U8NonStandardSupport m3U8NonStandardSupport;

        /**
         * <p>The URL of the merging configuration file. Only one of MergeList and MergeConfigUrl takes effect.</p>
         * <ul>
         * <li>The configuration file specified by MergeConfigUrl can contain up to 50 clips.</li>
         * <li>MergeConfigUrl indicates the URL of the configuration file for merging clips. Make sure that the configuration file is stored as an object in OSS and that MPS can access the OSS object. For information about the file content, see the details about merging parameters.</li>
         * <li>Example of the content of the merging configuration file: <code>{&quot;MergeList&quot;:[{&quot;MergeURL&quot;:&quot;http://exampleBucket****.oss-cn-hangzhou.aliyuncs.com/video_01.mp4&quot;}]}</code>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p><a href="https://ceshi-***.oss-cn-shanghai.aliyuncs.com/ccc/p0903q9wkkb.m3u8">https://ceshi-***.oss-cn-shanghai.aliyuncs.com/ccc/p0903q9wkkb.m3u8</a></p>
         */
        @NameInMap("MergeConfigUrl")
        public String mergeConfigUrl;

        /**
         * <p>The configurations of clip merging. Up to four clips can be merged.</p>
         */
        @NameInMap("MergeList")
        public QueryJobListResponseBodyJobListJobOutputMergeList mergeList;

        /**
         * <p>The information about the high-speed transcoding job. This information is available only for jobs that are submitted by using an MPS queue for high-speed transcoding. This does not support MPS queues for high-speed transcoding of an earlier version.</p>
         */
        @NameInMap("MultiSpeedInfo")
        public QueryJobListResponseBodyJobListJobOutputMultiSpeedInfo multiSpeedInfo;

        /**
         * <p>The transmuxing configurations. The transmuxing configurations. If this parameter is specified in the request, the corresponding parameters in the specified transcoding template are overwritten.</p>
         */
        @NameInMap("MuxConfig")
        public QueryJobListResponseBodyJobListJobOutputMuxConfig muxConfig;

        /**
         * <p>The opening parts. The value is a JSON object.</p>
         */
        @NameInMap("OpeningList")
        public QueryJobListResponseBodyJobListJobOutputOpeningList openingList;

        /**
         * <p>The output captions.</p>
         */
        @NameInMap("OutSubtitleList")
        public QueryJobListResponseBodyJobListJobOutputOutSubtitleList outSubtitleList;

        /**
         * <p>The details of the output file.</p>
         */
        @NameInMap("OutputFile")
        public QueryJobListResponseBodyJobListJobOutputOutputFile outputFile;

        /**
         * <p>The priority of the job in the ApsaraVideo Media Processing (MPS) queue to which the job is added.</p>
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
        public QueryJobListResponseBodyJobListJobOutputProperties properties;

        /**
         * <p>The rotation angle of the video.</p>
         * 
         * <strong>example:</strong>
         * <p>90</p>
         */
        @NameInMap("Rotate")
        public String rotate;

        /**
         * <p>The caption configurations.</p>
         */
        @NameInMap("SubtitleConfig")
        public QueryJobListResponseBodyJobListJobOutputSubtitleConfig subtitleConfig;

        /**
         * <p>The configurations for using the resolution of the source video.</p>
         */
        @NameInMap("SuperReso")
        public QueryJobListResponseBodyJobListJobOutputSuperReso superReso;

        /**
         * <p>The ending parts.</p>
         */
        @NameInMap("TailSlateList")
        public QueryJobListResponseBodyJobListJobOutputTailSlateList tailSlateList;

        /**
         * <p>The template ID.</p>
         * 
         * <strong>example:</strong>
         * <p>S00000001-200010</p>
         */
        @NameInMap("TemplateId")
        public String templateId;

        /**
         * <p>The general transcoding configurations.</p>
         * <blockquote>
         * <p> If this parameter is specified in the request, the corresponding parameters in the specified transcoding template are overwritten.</p>
         * </blockquote>
         */
        @NameInMap("TransConfig")
        public QueryJobListResponseBodyJobListJobOutputTransConfig transConfig;

        /**
         * <p>The custom data.</p>
         * 
         * <strong>example:</strong>
         * <p>testid-001</p>
         */
        @NameInMap("UserData")
        public String userData;

        /**
         * <p>The video configurations.</p>
         */
        @NameInMap("Video")
        public QueryJobListResponseBodyJobListJobOutputVideo video;

        /**
         * <p>The sequence number of the video stream. The sequence number is the index of the video stream in the list and starts from 0. If no sequence number is specified, the default video stream is used.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
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
        public QueryJobListResponseBodyJobListJobOutputWaterMarkList waterMarkList;

        public static QueryJobListResponseBodyJobListJobOutput build(java.util.Map<String, ?> map) throws Exception {
            QueryJobListResponseBodyJobListJobOutput self = new QueryJobListResponseBodyJobListJobOutput();
            return TeaModel.build(map, self);
        }

        public QueryJobListResponseBodyJobListJobOutput setAudio(QueryJobListResponseBodyJobListJobOutputAudio audio) {
            this.audio = audio;
            return this;
        }
        public QueryJobListResponseBodyJobListJobOutputAudio getAudio() {
            return this.audio;
        }

        public QueryJobListResponseBodyJobListJobOutput setAudioStreamMap(String audioStreamMap) {
            this.audioStreamMap = audioStreamMap;
            return this;
        }
        public String getAudioStreamMap() {
            return this.audioStreamMap;
        }

        public QueryJobListResponseBodyJobListJobOutput setClip(QueryJobListResponseBodyJobListJobOutputClip clip) {
            this.clip = clip;
            return this;
        }
        public QueryJobListResponseBodyJobListJobOutputClip getClip() {
            return this.clip;
        }

        public QueryJobListResponseBodyJobListJobOutput setContainer(QueryJobListResponseBodyJobListJobOutputContainer container) {
            this.container = container;
            return this;
        }
        public QueryJobListResponseBodyJobListJobOutputContainer getContainer() {
            return this.container;
        }

        public QueryJobListResponseBodyJobListJobOutput setDeWatermark(String deWatermark) {
            this.deWatermark = deWatermark;
            return this;
        }
        public String getDeWatermark() {
            return this.deWatermark;
        }

        public QueryJobListResponseBodyJobListJobOutput setEncryption(QueryJobListResponseBodyJobListJobOutputEncryption encryption) {
            this.encryption = encryption;
            return this;
        }
        public QueryJobListResponseBodyJobListJobOutputEncryption getEncryption() {
            return this.encryption;
        }

        public QueryJobListResponseBodyJobListJobOutput setExtendData(String extendData) {
            this.extendData = extendData;
            return this;
        }
        public String getExtendData() {
            return this.extendData;
        }

        public QueryJobListResponseBodyJobListJobOutput setM3U8NonStandardSupport(QueryJobListResponseBodyJobListJobOutputM3U8NonStandardSupport m3U8NonStandardSupport) {
            this.m3U8NonStandardSupport = m3U8NonStandardSupport;
            return this;
        }
        public QueryJobListResponseBodyJobListJobOutputM3U8NonStandardSupport getM3U8NonStandardSupport() {
            return this.m3U8NonStandardSupport;
        }

        public QueryJobListResponseBodyJobListJobOutput setMergeConfigUrl(String mergeConfigUrl) {
            this.mergeConfigUrl = mergeConfigUrl;
            return this;
        }
        public String getMergeConfigUrl() {
            return this.mergeConfigUrl;
        }

        public QueryJobListResponseBodyJobListJobOutput setMergeList(QueryJobListResponseBodyJobListJobOutputMergeList mergeList) {
            this.mergeList = mergeList;
            return this;
        }
        public QueryJobListResponseBodyJobListJobOutputMergeList getMergeList() {
            return this.mergeList;
        }

        public QueryJobListResponseBodyJobListJobOutput setMultiSpeedInfo(QueryJobListResponseBodyJobListJobOutputMultiSpeedInfo multiSpeedInfo) {
            this.multiSpeedInfo = multiSpeedInfo;
            return this;
        }
        public QueryJobListResponseBodyJobListJobOutputMultiSpeedInfo getMultiSpeedInfo() {
            return this.multiSpeedInfo;
        }

        public QueryJobListResponseBodyJobListJobOutput setMuxConfig(QueryJobListResponseBodyJobListJobOutputMuxConfig muxConfig) {
            this.muxConfig = muxConfig;
            return this;
        }
        public QueryJobListResponseBodyJobListJobOutputMuxConfig getMuxConfig() {
            return this.muxConfig;
        }

        public QueryJobListResponseBodyJobListJobOutput setOpeningList(QueryJobListResponseBodyJobListJobOutputOpeningList openingList) {
            this.openingList = openingList;
            return this;
        }
        public QueryJobListResponseBodyJobListJobOutputOpeningList getOpeningList() {
            return this.openingList;
        }

        public QueryJobListResponseBodyJobListJobOutput setOutSubtitleList(QueryJobListResponseBodyJobListJobOutputOutSubtitleList outSubtitleList) {
            this.outSubtitleList = outSubtitleList;
            return this;
        }
        public QueryJobListResponseBodyJobListJobOutputOutSubtitleList getOutSubtitleList() {
            return this.outSubtitleList;
        }

        public QueryJobListResponseBodyJobListJobOutput setOutputFile(QueryJobListResponseBodyJobListJobOutputOutputFile outputFile) {
            this.outputFile = outputFile;
            return this;
        }
        public QueryJobListResponseBodyJobListJobOutputOutputFile getOutputFile() {
            return this.outputFile;
        }

        public QueryJobListResponseBodyJobListJobOutput setPriority(String priority) {
            this.priority = priority;
            return this;
        }
        public String getPriority() {
            return this.priority;
        }

        public QueryJobListResponseBodyJobListJobOutput setProperties(QueryJobListResponseBodyJobListJobOutputProperties properties) {
            this.properties = properties;
            return this;
        }
        public QueryJobListResponseBodyJobListJobOutputProperties getProperties() {
            return this.properties;
        }

        public QueryJobListResponseBodyJobListJobOutput setRotate(String rotate) {
            this.rotate = rotate;
            return this;
        }
        public String getRotate() {
            return this.rotate;
        }

        public QueryJobListResponseBodyJobListJobOutput setSubtitleConfig(QueryJobListResponseBodyJobListJobOutputSubtitleConfig subtitleConfig) {
            this.subtitleConfig = subtitleConfig;
            return this;
        }
        public QueryJobListResponseBodyJobListJobOutputSubtitleConfig getSubtitleConfig() {
            return this.subtitleConfig;
        }

        public QueryJobListResponseBodyJobListJobOutput setSuperReso(QueryJobListResponseBodyJobListJobOutputSuperReso superReso) {
            this.superReso = superReso;
            return this;
        }
        public QueryJobListResponseBodyJobListJobOutputSuperReso getSuperReso() {
            return this.superReso;
        }

        public QueryJobListResponseBodyJobListJobOutput setTailSlateList(QueryJobListResponseBodyJobListJobOutputTailSlateList tailSlateList) {
            this.tailSlateList = tailSlateList;
            return this;
        }
        public QueryJobListResponseBodyJobListJobOutputTailSlateList getTailSlateList() {
            return this.tailSlateList;
        }

        public QueryJobListResponseBodyJobListJobOutput setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public QueryJobListResponseBodyJobListJobOutput setTransConfig(QueryJobListResponseBodyJobListJobOutputTransConfig transConfig) {
            this.transConfig = transConfig;
            return this;
        }
        public QueryJobListResponseBodyJobListJobOutputTransConfig getTransConfig() {
            return this.transConfig;
        }

        public QueryJobListResponseBodyJobListJobOutput setUserData(String userData) {
            this.userData = userData;
            return this;
        }
        public String getUserData() {
            return this.userData;
        }

        public QueryJobListResponseBodyJobListJobOutput setVideo(QueryJobListResponseBodyJobListJobOutputVideo video) {
            this.video = video;
            return this;
        }
        public QueryJobListResponseBodyJobListJobOutputVideo getVideo() {
            return this.video;
        }

        public QueryJobListResponseBodyJobListJobOutput setVideoStreamMap(String videoStreamMap) {
            this.videoStreamMap = videoStreamMap;
            return this;
        }
        public String getVideoStreamMap() {
            return this.videoStreamMap;
        }

        public QueryJobListResponseBodyJobListJobOutput setWaterMarkConfigUrl(String waterMarkConfigUrl) {
            this.waterMarkConfigUrl = waterMarkConfigUrl;
            return this;
        }
        public String getWaterMarkConfigUrl() {
            return this.waterMarkConfigUrl;
        }

        public QueryJobListResponseBodyJobListJobOutput setWaterMarkList(QueryJobListResponseBodyJobListJobOutputWaterMarkList waterMarkList) {
            this.waterMarkList = waterMarkList;
            return this;
        }
        public QueryJobListResponseBodyJobListJobOutputWaterMarkList getWaterMarkList() {
            return this.waterMarkList;
        }

    }

    public static class QueryJobListResponseBodyJobListJob extends TeaModel {
        /**
         * <p>The error code returned if the job failed. If the job was successful, this parameter is not returned.</p>
         * 
         * <strong>example:</strong>
         * <p>InvalidParameter.NullValue</p>
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
        public QueryJobListResponseBodyJobListJobInput input;

        /**
         * <p>The job ID.</p>
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
        public QueryJobListResponseBodyJobListJobMNSMessageResult MNSMessageResult;

        /**
         * <p>The error message returned if the job failed. If the job was successful, this parameter is not returned.</p>
         * 
         * <strong>example:</strong>
         * <p>The specified parameter &quot;%s&quot; cannot be null.</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The job output.</p>
         */
        @NameInMap("Output")
        public QueryJobListResponseBodyJobListJobOutput output;

        /**
         * <p>The transcoding progress.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Percent")
        public Long percent;

        /**
         * <p>The ID of the MPS queue that is used to run the job.</p>
         * 
         * <strong>example:</strong>
         * <p>88c6ca184c0e47b665e2a1267971****</p>
         */
        @NameInMap("PipelineId")
        public String pipelineId;

        /**
         * <p>The job state. Valid values:</p>
         * <ul>
         * <li><strong>Submitted</strong>: The job was submitted.</li>
         * <li><strong>Transcoding</strong>: Transcoding is in process.</li>
         * <li><strong>TranscodeSuccess</strong>: The job was successful.</li>
         * <li><strong>TranscodeFail</strong>: The job failed.</li>
         * <li><strong>TranscodeCancelled</strong>: The job was canceled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>TranscodeSuccess</p>
         */
        @NameInMap("State")
        public String state;

        /**
         * <p>The time when the job was submitted.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-03-04T06:44:43Z</p>
         */
        @NameInMap("SubmitTime")
        public String submitTime;

        public static QueryJobListResponseBodyJobListJob build(java.util.Map<String, ?> map) throws Exception {
            QueryJobListResponseBodyJobListJob self = new QueryJobListResponseBodyJobListJob();
            return TeaModel.build(map, self);
        }

        public QueryJobListResponseBodyJobListJob setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryJobListResponseBodyJobListJob setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public QueryJobListResponseBodyJobListJob setFinishTime(String finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public String getFinishTime() {
            return this.finishTime;
        }

        public QueryJobListResponseBodyJobListJob setInput(QueryJobListResponseBodyJobListJobInput input) {
            this.input = input;
            return this;
        }
        public QueryJobListResponseBodyJobListJobInput getInput() {
            return this.input;
        }

        public QueryJobListResponseBodyJobListJob setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public QueryJobListResponseBodyJobListJob setMNSMessageResult(QueryJobListResponseBodyJobListJobMNSMessageResult MNSMessageResult) {
            this.MNSMessageResult = MNSMessageResult;
            return this;
        }
        public QueryJobListResponseBodyJobListJobMNSMessageResult getMNSMessageResult() {
            return this.MNSMessageResult;
        }

        public QueryJobListResponseBodyJobListJob setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public QueryJobListResponseBodyJobListJob setOutput(QueryJobListResponseBodyJobListJobOutput output) {
            this.output = output;
            return this;
        }
        public QueryJobListResponseBodyJobListJobOutput getOutput() {
            return this.output;
        }

        public QueryJobListResponseBodyJobListJob setPercent(Long percent) {
            this.percent = percent;
            return this;
        }
        public Long getPercent() {
            return this.percent;
        }

        public QueryJobListResponseBodyJobListJob setPipelineId(String pipelineId) {
            this.pipelineId = pipelineId;
            return this;
        }
        public String getPipelineId() {
            return this.pipelineId;
        }

        public QueryJobListResponseBodyJobListJob setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public QueryJobListResponseBodyJobListJob setSubmitTime(String submitTime) {
            this.submitTime = submitTime;
            return this;
        }
        public String getSubmitTime() {
            return this.submitTime;
        }

    }

    public static class QueryJobListResponseBodyJobList extends TeaModel {
        @NameInMap("Job")
        public java.util.List<QueryJobListResponseBodyJobListJob> job;

        public static QueryJobListResponseBodyJobList build(java.util.Map<String, ?> map) throws Exception {
            QueryJobListResponseBodyJobList self = new QueryJobListResponseBodyJobList();
            return TeaModel.build(map, self);
        }

        public QueryJobListResponseBodyJobList setJob(java.util.List<QueryJobListResponseBodyJobListJob> job) {
            this.job = job;
            return this;
        }
        public java.util.List<QueryJobListResponseBodyJobListJob> getJob() {
            return this.job;
        }

    }

    public static class QueryJobListResponseBodyNonExistJobIds extends TeaModel {
        @NameInMap("String")
        public java.util.List<String> string;

        public static QueryJobListResponseBodyNonExistJobIds build(java.util.Map<String, ?> map) throws Exception {
            QueryJobListResponseBodyNonExistJobIds self = new QueryJobListResponseBodyNonExistJobIds();
            return TeaModel.build(map, self);
        }

        public QueryJobListResponseBodyNonExistJobIds setString(java.util.List<String> string) {
            this.string = string;
            return this;
        }
        public java.util.List<String> getString() {
            return this.string;
        }

    }

}
