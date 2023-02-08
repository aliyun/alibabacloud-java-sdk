// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class QueryJobListResponseBody extends TeaModel {
    /**
     * <p>The list of transcoding jobs.</p>
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
         */
        @NameInMap("Bucket")
        public String bucket;

        /**
         * <p>The ID of the OSS region in which the input file resides.</p>
         */
        @NameInMap("Location")
        public String location;

        /**
         * <p>The name of the OSS object that is used as the input file.</p>
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
         * <p>The error code returned if the job fails. This parameter is not returned if the job is successful.</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>The error message that is returned if the job fails. This parameter is not returned if the job is successful.</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The ID of the success message.</p>
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
         * <p>The volume adjustment range. Default value: **-20db**.</p>
         */
        @NameInMap("Level")
        public String level;

        /**
         * <p>The volume adjustment method. Valid values:</p>
         * <br>
         * <p>*   **auto**: The volume is automatically adjusted.</p>
         * <p>*   **dynamic**: The volume is dynamically adjusted.</p>
         * <p>*   **linear**: The volume is linearly adjusted.</p>
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
         * <br>
         * <p>*   Unit: Kbit/s.</p>
         * <p>*   Default value: **128**.</p>
         */
        @NameInMap("Bitrate")
        public String bitrate;

        /**
         * <p>The number of sound channels.</p>
         * <br>
         * <p>*   Valid values: 1, 2, 3, 4, 5, 6, 7, and 8.</p>
         * <p>*   Default value: **2**.</p>
         */
        @NameInMap("Channels")
        public String channels;

        /**
         * <p>The audio encoding and decoding format.</p>
         * <br>
         * <p>*   Valid values: aac, mp3, vorbis, and flac.</p>
         * <p>*   Default value: **aac**.</p>
         */
        @NameInMap("Codec")
        public String codec;

        /**
         * <p>The codec profile of the audio. Valid values when the Codec parameter is set to aac: aaclow, aache, aachev2, aacld, and aaceld.</p>
         */
        @NameInMap("Profile")
        public String profile;

        /**
         * <p>The level of quality control on the audio.</p>
         */
        @NameInMap("Qscale")
        public String qscale;

        /**
         * <p>The sampling rate.</p>
         * <br>
         * <p>*   Valid values: 22050, 32000, 44100, 48000, and 96000.</p>
         * <p>*   Unit: Hz</p>
         * <p>*   Default value: 44100.</p>
         * <br>
         * <p>>  If the video container format is FLV and the audio codec is MP3, you cannot set this parameter to 32000, 48000, or 96000. If the audio codec is MP3, you cannot set this parameter to 96000.</p>
         */
        @NameInMap("Samplerate")
        public String samplerate;

        /**
         * <p>The volume configuration.</p>
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
         * <br>
         * <p>*   Format: hh:mm:ss\[.SSS].</p>
         * <p>*   Example: 01:00:59.999.</p>
         * <br>
         * <p>Or</p>
         * <br>
         * <p>*   Format: sssss\[.SSS].</p>
         * <p>*   Example: 32000.23.</p>
         */
        @NameInMap("Duration")
        public String duration;

        /**
         * <p>The time when the clip starts.</p>
         * <br>
         * <p>*   Format: hh:mm:ss\[.SSS].</p>
         * <p>*   Example: 01:59:59.999.</p>
         * <br>
         * <p>Or</p>
         * <br>
         * <p>*   Format: sssss\[.SSS].</p>
         * <p>*   Example: 32000.23.</p>
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
         * <br>
         * <p>*   Default value: mp4.</p>
         * <p>*   Video formats include FLV, MP4, HLS (M3U8 + TS), and MPEG-DASH (MPD + fMP4)</p>
         * <p>*   Audio formats include MP3, MP4, Ogg, FLAC, and M4A.</p>
         * <p>*   Image formats include GIF and WebP. If the container format is GIF, the video codec must be set to GIF.</p>
         * <p>*   If the container format is WebP, the video codec must be set to WebP.</p>
         * <p>*   If the container format is FLV, the video codec cannot be set to H.265.</p>
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
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The key that is used to encrypt the video.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The key encryption method. Valid values: Base64 and KMS.</p>
         * <br>
         * <p>>  For example, if the key is `encryptionkey128`, the value can be `Base64("encryptionkey128")` or `KMS(Base64("encryptionkey128")`, depending on the encryption method used.</p>
         */
        @NameInMap("KeyType")
        public String keyType;

        /**
         * <p>The URL that is used to request the key. The URL is Base64-encoded.</p>
         */
        @NameInMap("KeyUri")
        public String keyUri;

        /**
         * <p>The number of unencrypted frames at the beginning of the video. Leaving these frames unencrypted enables video playback to quickly start.</p>
         */
        @NameInMap("SkipCnt")
        public String skipCnt;

        /**
         * <p>The encryption type. Valid value: **hls-aes-128**.</p>
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
         * <p>Indicates whether to support the output of the md5 value of the TS file in the M3U8 file. Valid values:</p>
         * <br>
         * <p>*   **true**: supported.</p>
         * <p>*   **false**: not supported.</p>
         */
        @NameInMap("Md5Support")
        public Boolean md5Support;

        /**
         * <p>Indicates whether to support the output of the size of the TS file in the M3U8 file. Valid values:</p>
         * <br>
         * <p>*   **true**: supported.</p>
         * <p>*   **false**: not supported.</p>
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
         * <p>The non-standard support configuration for M3U8 about TS files. The value must be a JSON object. For more information, see [Parameter details](~~29253~~).</p>
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
         * <br>
         * <p>*   Valid formats: hh:mm:ss\[.SSS] and sssss\[.SSS].</p>
         * <p>*   Examples: 01:59:59.999 and 32000.23.</p>
         */
        @NameInMap("Duration")
        public String duration;

        /**
         * <p>The OSS URL of the clip.</p>
         * <br>
         * <p>*   Example: `http://example-bucket-.oss-cn-hangzhou.aliyuncs.com/example-object.flv`.</p>
         * <p>*   The object must be URL-encoded by using the UTF-8 standard. For more information, see [URL encoding](~~423796~~).</p>
         */
        @NameInMap("MergeURL")
        public String mergeURL;

        /**
         * <p>The Alibaba Cloud Resource Name (ARN) of the role used for proxy authorization.</p>
         */
        @NameInMap("RoleArn")
        public String roleArn;

        /**
         * <p>The start point in time of the clip.</p>
         * <br>
         * <p>*   Valid formats: hh:mm:ss\[.SSS] and sssss\[.SSS].</p>
         * <p>*   Examples: 01:59:59.999 and 32000.23.</p>
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

    public static class QueryJobListResponseBodyJobListJobOutputMuxConfigGif extends TeaModel {
        /**
         * <p>The color dithering algorithm of the palette. Valid values: sierra and bayer.</p>
         */
        @NameInMap("DitherMode")
        public String ditherMode;

        /**
         * <p>The duration for which the final frame is paused. Unit: centiseconds.</p>
         */
        @NameInMap("FinalDelay")
        public String finalDelay;

        /**
         * <p>Indicates whether the custom palette was used. Valid values:</p>
         * <br>
         * <p>- **true**: custom.</p>
         * <p>- **false**: non-custom.</p>
         */
        @NameInMap("IsCustomPalette")
        public String isCustomPalette;

        /**
         * <p>The loop count.</p>
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
         * <p>The length of the segment. Unit: seconds.</p>
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
         * <p>The transmuxing configuration for GIF.</p>
         */
        @NameInMap("Gif")
        public QueryJobListResponseBodyJobListJobOutputMuxConfigGif gif;

        /**
         * <p>The segment configurations. The value is a JSON object.</p>
         */
        @NameInMap("Segment")
        public QueryJobListResponseBodyJobListJobOutputMuxConfigSegment segment;

        /**
         * <p>The transmuxing configuration for WebP.</p>
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
         * <br>
         * <p>*   Valid values: values in the range of (0, 4096), -1, and full.</p>
         * <p>*   A value of -1 indicates that the height of the source of the opening part is retained.</p>
         * <p>*   A value of full indicates that the height of the main part is used for the opening part.</p>
         * <p>*   Default value: **-1**.</p>
         */
        @NameInMap("Height")
        public String height;

        /**
         * <p>The amount of time after which the opening part is played.</p>
         * <br>
         * <p>*   The amount of time after which the opening part is played. The value starts from 0.</p>
         * <p>*   Unit: seconds.</p>
         * <p>*   Default value: **0**.</p>
         */
        @NameInMap("Start")
        public String start;

        /**
         * <p>The width of the opening part.</p>
         * <br>
         * <p>*   Valid values: values in the range of (0, 4096), -1, and full.</p>
         * <p>*   A value of -1 indicates that the width of the source of the opening part is retained.</p>
         * <p>*   A value of full indicates that the width of the main part is used for the opening part.</p>
         * <p>*   Default value: **-1**.</p>
         */
        @NameInMap("Width")
        public String width;

        /**
         * <p>The OSS URL of the opening part of the video.</p>
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
         * <p>The OSS bucket in which the output file is stored.</p>
         */
        @NameInMap("Bucket")
        public String bucket;

        /**
         * <p>The ID of the OSS region in which the output file resides.</p>
         */
        @NameInMap("Location")
        public String location;

        /**
         * <p>The name of the OSS object of the output file.</p>
         */
        @NameInMap("Object")
        public String object;

        /**
         * <p>The ARN of the role used for proxy authorization.</p>
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
         * <p>The video track. Format: `0:{stream}:{stream sequence number}`, that is, `0:v:{video_index}`. The value of stream is v, which indicates an audio stream of a video. The sequence number is the index of the audio stream in the list and starts from 0.</p>
         */
        @NameInMap("Map")
        public String map;

        /**
         * <p>The error message returned if the job fails to be created. This parameter is not returned if the job is created.</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The details of the output file.</p>
         */
        @NameInMap("OutSubtitleFile")
        public QueryJobListResponseBodyJobListJobOutputOutSubtitleListOutSubtitleOutSubtitleFile outSubtitleFile;

        /**
         * <p>Indicates whether the job succeeded. Valid values:</p>
         * <br>
         * <p>*   **true**: succeeded.</p>
         * <p>*   **fasle**: failed.</p>
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
         * <p>The OSS bucket in which the output file is stored.</p>
         */
        @NameInMap("Bucket")
        public String bucket;

        /**
         * <p>The ID of the OSS region in which the output file resides.</p>
         */
        @NameInMap("Location")
        public String location;

        /**
         * <p>The name of the OSS object of the output file.</p>
         */
        @NameInMap("Object")
        public String object;

        /**
         * <p>The ARN of the role used for proxy authorization.</p>
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
         * <p>The short name of the container format. Valid values: mov, mp4, m4a, 3gp, 3g2, and mj2.</p>
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
         * <p>The keywords.</p>
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
         * <p>The bitrate.</p>
         */
        @NameInMap("Bitrate")
        public String bitrate;

        /**
         * <p>The output layout of the sound channels.</p>
         */
        @NameInMap("ChannelLayout")
        public String channelLayout;

        /**
         * <p>The number of sound channels.</p>
         */
        @NameInMap("Channels")
        public String channels;

        /**
         * <p>The full name of the encoding format.</p>
         */
        @NameInMap("CodecLongName")
        public String codecLongName;

        /**
         * <p>The short name of the encoding format.</p>
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
         * <p>The language. For more information, see [FFmpeg language definition](https://www.ffmpeg.org/ffmpeg-all.html#Metadata) and [ISO 639](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes).</p>
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
         * <p>The sequence number of the subtitle stream. </p>
         * <br>
         * <p>This parameter indicates the position of the subtitle stream in all subtitle streams.</p>
         */
        @NameInMap("Index")
        public String index;

        /**
         * <p>The language. For more information, see [FFmpeg language definition](https://www.ffmpeg.org/ffmpeg-all.html#Metadata) and [ISO 639](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes).</p>
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
         */
        @NameInMap("AvgBitrate")
        public String avgBitrate;

        /**
         * <p>The maximum bandwidth that was consumed.</p>
         */
        @NameInMap("CostBandwidth")
        public String costBandwidth;

        /**
         * <p>The amount of preload time.</p>
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
         * <p>The short name of the encoding format.</p>
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
         * <p>Indicates whether the video stream contains bidirectional frames (B-frames).</p>
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
         * <p>The language. For more information, see [FFmpeg language definition](https://www.ffmpeg.org/ffmpeg-all.html#Metadata) and [ISO 639](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes).</p>
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
        public QueryJobListResponseBodyJobListJobOutputPropertiesStreamsVideoStreamListVideoStreamNetworkCost networkCost;

        /**
         * <p>The total number of frames.</p>
         */
        @NameInMap("NumFrames")
        public String numFrames;

        /**
         * <p>The pixel format of the video stream.</p>
         */
        @NameInMap("PixFmt")
        public String pixFmt;

        /**
         * <p>The codec profile.</p>
         */
        @NameInMap("Profile")
        public String profile;

        /**
         * <p>The sample aspect ratio (SAR) of the video stream.</p>
         */
        @NameInMap("Sar")
        public String sar;

        /**
         * <p>The start time.</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The time base of the video stream.</p>
         */
        @NameInMap("Timebase")
        public String timebase;

        /**
         * <p>The former number in the video resolution. The number indicates the video width.</p>
         */
        @NameInMap("Width")
        public String width;

        /**
         * <p>The number of binary bits used by each sample or pixel.</p>
         */
        @NameInMap("bitsPerRawSample")
        public String bitsPerRawSample;

        /**
         * <p>The primary colors.</p>
         */
        @NameInMap("colorPrimaries")
        public String colorPrimaries;

        /**
         * <p>The color transfer configuration.</p>
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
         * <p>The list of audio streams.</p>
         */
        @NameInMap("AudioStreamList")
        public QueryJobListResponseBodyJobListJobOutputPropertiesStreamsAudioStreamList audioStreamList;

        /**
         * <p>The list of subtitle streams.</p>
         */
        @NameInMap("SubtitleStreamList")
        public QueryJobListResponseBodyJobListJobOutputPropertiesStreamsSubtitleStreamList subtitleStreamList;

        /**
         * <p>The list of video streams.</p>
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
         * <p>The bitrate of the video.</p>
         */
        @NameInMap("Bitrate")
        public String bitrate;

        /**
         * <p>The duration of the video.</p>
         */
        @NameInMap("Duration")
        public String duration;

        /**
         * <p>The format of the video.</p>
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
        public QueryJobListResponseBodyJobListJobOutputPropertiesFormat format;

        /**
         * <p>The frame rate of the video.</p>
         */
        @NameInMap("Fps")
        public String fps;

        /**
         * <p>The length of the video.</p>
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
         * <p>The width of the video.</p>
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
         * <p>The OSS bucket in which the input file is stored.</p>
         */
        @NameInMap("Bucket")
        public String bucket;

        /**
         * <p>The ID of the OSS region in which the input file resides.</p>
         */
        @NameInMap("Location")
        public String location;

        /**
         * <p>The name of the OSS object that is used as the input file.</p>
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
         * <p>The character set used by the external subtitle. </p>
         * <br>
         * <p>- Valid values: UTF-8, GBK, BIG5, and auto.</p>
         * <p>- Default value: **auto**.</p>
         * <br>
         * <p>>  If you set this parameter to auto, the detected character set may not be the actual character set. We recommend that you set this parameter to another value.</p>
         */
        @NameInMap("CharEnc")
        public String charEnc;

        /**
         * <p>The font of the hard subtitles converted from external subtitles. Default value: SimSum. For more information, see [Fonts](https://www.alibabacloud.com/help/en/apsaravideo-for-media-processing/latest/font-name).</p>
         */
        @NameInMap("FontName")
        public String fontName;

        /**
         * <p>The input subtitle file. </p>
         * <br>
         * <p>- Files in the SRT or ASS format are supported. For more information, see the part about input parameters in [Parameter details](https://www.alibabacloud.com/help/en/apsaravideo-for-media-processing/latest/parameter-details).</p>
         * <p>- Example: `{“Bucket”:”example-bucket”,“Location”:”oss-cn-hangzhou”,“Object”:”example.srt”}`.</p>
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
         * <p>The audio track. Format: `0:{stream}:{stream sequence number}`, that is, `0:a:{audio_index}`. The value of stream is a, which indicates an audio stream. The sequence number is the index of the audio stream in the list and starts from 0.</p>
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
         * <p>The list of external subtitles.</p>
         */
        @NameInMap("ExtSubtitleList")
        public QueryJobListResponseBodyJobListJobOutputSubtitleConfigExtSubtitleList extSubtitleList;

        /**
         * <p>The list of subtitles.</p>
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
         * <p>Indicates whether to obtain parameters related to the sampling rate. Valid values:</p>
         * <br>
         * <p>- **true**: The parameters are obtained.</p>
         * <p>- **false**: The parameters are not obtained.</p>
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
         * <p>The color of the bars that are added to the ending part if the size of the ending part is smaller than that of the main part. Default value: White. For more information, see [Background colors](https://www.alibabacloud.com/help/en/apsaravideo-for-media-processing/latest/parameter-details).</p>
         */
        @NameInMap("BgColor")
        public String bgColor;

        /**
         * <p>The amount of time between the end of the main part and the beginning of the ending part. During the video part transition, the last frame of the main part fades out, and the first frame of the ending part fades in. Unit: seconds. Default value: 0.</p>
         */
        @NameInMap("BlendDuration")
        public String blendDuration;

        /**
         * <p>The height of the ending part. </p>
         * <br>
         * <p>- Valid values: values in the range of (0, 4096), -1, and full.</p>
         * <p>- A value of -1 indicates that the height of the source of the ending part is retained.</p>
         * <p>- A value of full indicates that the height of the main part is used for the ending part.</p>
         * <p>- Default value: **-1**.</p>
         */
        @NameInMap("Height")
        public String height;

        /**
         * <p>Indicates whether to merge the audio content of the ending part. Valid values:</p>
         * <br>
         * <p>- **true**: yes.</p>
         * <p>- **false**: no.</p>
         */
        @NameInMap("IsMergeAudio")
        public Boolean isMergeAudio;

        /**
         * <p>The time at which the ending part is played.</p>
         */
        @NameInMap("Start")
        public String start;

        /**
         * <p>The OSS URL of the ending part.</p>
         */
        @NameInMap("TailUrl")
        public String tailUrl;

        /**
         * <p>The width of the ending part. Valid values: values in the range of (0, 4096), -1, and full.  </p>
         * <br>
         * <p>- A value of -1 indicates that the width of the source of the ending part is retained.</p>
         * <p>- A value of full indicates that the width of the main part is used for the ending part.</p>
         * <p>- Default value: **-1**.</p>
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
         * <p>The method of resolution adjustment. Default value: **none**. Valid values: rescale, crop, pad, and none.</p>
         */
        @NameInMap("AdjDarMethod")
        public String adjDarMethod;

        /**
         * <p>Indicates whether the audio bitrate is checked.</p>
         * <br>
         * <p>*   If the output audio bitrate is higher than the input audio bitrate, the system considers that the output bitrate equals the input bitrate.</p>
         * <p>*   **true**: The audio bitrate is checked.</p>
         * <p>*   **false**: The audio bitrate is not checked.</p>
         * <p>*   Default value: **false**.</p>
         */
        @NameInMap("IsCheckAudioBitrate")
        public String isCheckAudioBitrate;

        /**
         * <p>Indicates whether the audio bitrate is checked. If the output audio bitrate is higher than the audio bitrate of the media source, a transcoding failure is returned without transcoding the media. This value has a higher priority than IsCheckAudioBitrate.</p>
         * <br>
         * <p>*   **true**: The audio bitrate is checked.</p>
         * <p>*   **false**: The audio bitrate is not checked.</p>
         * <p>*   Default value: **false**.</p>
         */
        @NameInMap("IsCheckAudioBitrateFail")
        public String isCheckAudioBitrateFail;

        /**
         * <p>Indicates whether the resolution is checked.</p>
         * <br>
         * <p>*   If the output resolution is higher than the input resolution based on the width or height, the system considers that the output resolution equals the input resolution.</p>
         * <p>*   **true**: The resolution is checked.</p>
         * <p>*   **false**: The resolution is not checked.</p>
         * <p>*   Default value: **false**.</p>
         */
        @NameInMap("IsCheckReso")
        public String isCheckReso;

        /**
         * <p>Indicates whether the resolution is checked.</p>
         * <br>
         * <p>*   If the output resolution is higher than the input resolution based on the width or height, a transcoding failure is returned.</p>
         * <p>*   **true**: The resolution is checked.</p>
         * <p>*   **false**: The resolution is not checked.</p>
         * <p>*   Default value: **false**.</p>
         */
        @NameInMap("IsCheckResoFail")
        public String isCheckResoFail;

        /**
         * <p>Indicates whether the video bitrate is checked.</p>
         * <br>
         * <p>*   If the output bitrate is higher than the input bitrate, the system considers that the output bitrate equals the input bitrate.</p>
         * <p>*   **true**: The video bitrate is checked.</p>
         * <p>*   **false**: The video bitrate is not checked.</p>
         * <p>*   Default value: **false**.</p>
         */
        @NameInMap("IsCheckVideoBitrate")
        public String isCheckVideoBitrate;

        /**
         * <p>Indicates whether the video bitrate is checked. If the bitrate of the output video is higher than that of the input video, a transcoding failure is returned without transcoding the video. This parameter takes precedence over the IsCheckVideoBitrate parameter.</p>
         * <br>
         * <p>*   **true**: The video bitrate is checked.</p>
         * <p>*   **false**: The video bitrate is not checked.</p>
         * <p>*   Default value: **false**.</p>
         */
        @NameInMap("IsCheckVideoBitrateFail")
        public String isCheckVideoBitrateFail;

        /**
         * <p>The transcoding mode.</p>
         * <br>
         * <p>*   Valid values: onepass, twopass, and CBR.</p>
         * <p>*   Default value: **onepass**.</p>
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
         */
        @NameInMap("Max")
        public String max;

        /**
         * <p>The minimum bitrate.</p>
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
         */
        @NameInMap("Bitrate")
        public String bitrate;

        /**
         * <p>The average bitrate range of the video.</p>
         */
        @NameInMap("BitrateBnd")
        public QueryJobListResponseBodyJobListJobOutputVideoBitrateBnd bitrateBnd;

        /**
         * <p>The size of the buffer.</p>
         * <br>
         * <p>*   Unit: KB.</p>
         * <p>*   Default value: **6000**.</p>
         */
        @NameInMap("Bufsize")
        public String bufsize;

        /**
         * <p>The codec.</p>
         * <br>
         * <p>*   Valid values: H.264 and H.265.</p>
         * <p>*   Default value: H.264.</p>
         */
        @NameInMap("Codec")
        public String codec;

        /**
         * <p>The constant rate factor.</p>
         * <br>
         * <p>*   Default value when the Codec parameter is set to H.264: **23**. Default value when the Codec parameter is set to H.265: **26**.</p>
         * <p>*   If this parameter is returned, the setting of the Bitrate parameter is invalid.</p>
         */
        @NameInMap("Crf")
        public String crf;

        /**
         * <p>The crop mode. The following two modes are supported:</p>
         * <br>
         * <p>*   **border**: automatically detects and removes black bars.</p>
         * <p>*   A value in the format of width:height:left:top: crops the video image based on the custom setting.</p>
         */
        @NameInMap("Crop")
        public String crop;

        /**
         * <p>The level of the independent denoising algorithm.</p>
         */
        @NameInMap("Degrain")
        public String degrain;

        /**
         * <p>The frame rate.</p>
         * <br>
         * <p>*   Unit: frames per second.</p>
         * <p>*   The value is 60 if the frame rate of the input file exceeds 60.</p>
         * <p>*   By default, the frame rate of the input file is used.</p>
         */
        @NameInMap("Fps")
        public String fps;

        /**
         * <p>The maximum interval between keyframes or the maximum number of frames in a frame group. Unit: seconds.</p>
         * <br>
         * <p>*   Default value: **250**.</p>
         * <p>*   If you specified the maximum number of frames, the value does not contain a unit.</p>
         */
        @NameInMap("Gop")
        public String gop;

        /**
         * <p>The height of the video.</p>
         * <br>
         * <p>*   Unit: pixels.</p>
         * <p>*   By default, the original video height is used.</p>
         */
        @NameInMap("Height")
        public String height;

        /**
         * <p>The maximum frame rate.</p>
         */
        @NameInMap("MaxFps")
        public String maxFps;

        /**
         * <p>The maximum bitrate of the video. Unit: Kbit/s.</p>
         */
        @NameInMap("Maxrate")
        public String maxrate;

        /**
         * <p>The black bars to be added to the video.</p>
         * <br>
         * <p>*   Unit: pixels.</p>
         * <p>*   Format: width:height:left:top.</p>
         */
        @NameInMap("Pad")
        public String pad;

        /**
         * <p>The pixel format. Standard pixel formats such as yuv420p and yuvj420p are supported.</p>
         */
        @NameInMap("PixFmt")
        public String pixFmt;

        /**
         * <p>The preset video algorithm. Default value: **medium**. Valid values:</p>
         * <br>
         * <p>*   **veryfast**</p>
         * <p>*   **fast**</p>
         * <p>*   **medium**</p>
         * <p>*   **slow**</p>
         * <p>*   **slower**</p>
         */
        @NameInMap("Preset")
        public String preset;

        /**
         * <p>The codec profile. Valid values: baseline, main, and high.</p>
         * <br>
         * <p>>  If multiple definitions exist, we recommend that you set this parameter to baseline for the lowest definition to ensure normal playback on low-end devices. Set this parameter to main or high for other definitions.</p>
         * <br>
         * <p>*   **baseline**: applicable to mobile devices.</p>
         * <p>*   **main**: applicable to standard-definition devices.</p>
         * <p>*   **high**: applicable to high-definition devices.</p>
         * <p>*   Default value: **high**.</p>
         */
        @NameInMap("Profile")
        public String profile;

        /**
         * <p>The level of quality control on the video.</p>
         */
        @NameInMap("Qscale")
        public String qscale;

        /**
         * <p>The priority of the resource.</p>
         */
        @NameInMap("ResoPriority")
        public String resoPriority;

        /**
         * <p>The scan mode. Valid values:</p>
         * <br>
         * <p>*   **interlaced**: An interlaced scan is performed.</p>
         * <p>*   **progressive**: A progressive scan is performed.</p>
         * <p>*   **auto**: A scan is performed based on the video source.</p>
         */
        @NameInMap("ScanMode")
        public String scanMode;

        /**
         * <p>The width of the video.</p>
         * <br>
         * <p>*   Unit: pixels.</p>
         * <p>*   By default, the original width of the video is used.</p>
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
         * <p>The name of the OSS bucket to which the input file is uploaded.</p>
         */
        @NameInMap("Bucket")
        public String bucket;

        /**
         * <p>The ID of the OSS region in which the input file resides.</p>
         */
        @NameInMap("Location")
        public String location;

        /**
         * <p>The name of the Object Storage Service (OSS) object that is used as the input file.</p>
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
         * <p>The horizontal offset of the watermark image relative to the output video. If this parameter is set in the request, the value overwrites the corresponding parameter in the watermark template. Default value: 0. The value can be an integer or a decimal.</p>
         * <br>
         * <p>*   An integer indicates the pixel value of the horizontal offset.</p>
         * <br>
         * <p>    *   Valid values: **\[8,4096]**.</p>
         * <p>    *   Unit: pixels.</p>
         * <br>
         * <p>*   A decimal indicates the ratio of the horizontal offset to the width in the output video resolution.</p>
         * <br>
         * <p>    *   Valid values: (0,1).</p>
         * <p>    *   The decimal number can be accurate to four decimal places, such as 0.9999. Excessive digits are automatically deleted.</p>
         */
        @NameInMap("Dx")
        public String dx;

        /**
         * <p>The vertical offset of the watermark image relative to the output video. If this parameter is set in the request, the value overwrites the vertical offset of the watermark image relative to the output video. The value can be an integer or a decimal.</p>
         * <br>
         * <p>*   An integer indicates the pixel value of the vertical offset.</p>
         * <br>
         * <p>    *   Valid values: **\[8,4096]**.</p>
         * <p>    *   Unit: pixels.</p>
         * <br>
         * <p>*   A decimal indicates the ratio of the pixel value to the height in the output video resolution in pixels.</p>
         * <br>
         * <p>    *   Valid values: **(0,1)**.</p>
         * <p>    *   The decimal number can be accurate to four decimal places, such as 0.9999. Excessive digits are automatically deleted.</p>
         */
        @NameInMap("Dy")
        public String dy;

        /**
         * <p>The height of the watermark image. If this parameter is set in the request, the value overwrites the corresponding parameter in the watermark template. The value can be an integer or a decimal.</p>
         * <br>
         * <p>*   An integer indicates the pixel value of the watermark height.</p>
         * <br>
         * <p>    *   Valid values: **\[8,4096]**.</p>
         * <p>    *   Unit: pixels.</p>
         * <br>
         * <p>*   A decimal indicates the ratio of the watermark height to the height in the output video resolution.</p>
         * <br>
         * <p>    *   Valid values: **(0,1)**.</p>
         * <p>    *   The decimal number can be accurate to four decimal places, such as 0.9999. Excessive digits are automatically deleted.</p>
         */
        @NameInMap("Height")
        public String height;

        /**
         * <p>The watermark input file. You can use an image in the PNG format or a file in the MOV format as the watermark input.</p>
         */
        @NameInMap("InputFile")
        public QueryJobListResponseBodyJobListJobOutputWaterMarkListWaterMarkInputFile inputFile;

        /**
         * <p>The position of the watermark. If this parameter is set in the request, the value overwrites the corresponding parameter in the watermark template. Valid values:</p>
         * <br>
         * <p>*   TopRight: the upper-right corner.</p>
         * <p>*   TopLeft: the upper-left corner.</p>
         * <p>*   BottomRight: the lower-right corner.</p>
         * <p>*   BottomLeft: the lower-left corner.</p>
         */
        @NameInMap("ReferPos")
        public String referPos;

        /**
         * <p>The type of the watermark. If this parameter is set in the request, the value overwrites the corresponding parameter in the watermark template. For more information, see [Parameter details](~~29253~~). Valid values:</p>
         * <br>
         * <p>*   Image: an image watermark.</p>
         * <p>*   Text: a text watermark.</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The ID of the watermark template.</p>
         */
        @NameInMap("WaterMarkTemplateId")
        public String waterMarkTemplateId;

        /**
         * <p>The width of the watermark image. If this parameter is set in the request, the value overwrites the corresponding parameter in the watermark template. The value can be an integer or a decimal.</p>
         * <br>
         * <p>*   An integer indicates the pixel value of the watermark width.</p>
         * <br>
         * <p>    *   Valid values: **\[8,4096]**.</p>
         * <p>    *   Unit: pixels.</p>
         * <br>
         * <p>*   A decimal indicates the ratio of the watermark width to the width in the output video resolution.</p>
         * <br>
         * <p>    *   Valid values: **(0,1)**.</p>
         * <p>    *   The decimal number can be accurate to four decimal places, such as 0.9999. Excessive digits are automatically deleted.</p>
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
         * <br>
         * <p>>  If this value was set in the request parameter, the corresponding parameters in the specified transcoding template are overwritten.</p>
         */
        @NameInMap("Audio")
        public QueryJobListResponseBodyJobListJobOutputAudio audio;

        /**
         * <p>The sequence number of the audio stream.</p>
         * <br>
         * <p>*   Format: 0:a:{sequence number}. Example: 0:a:0.</p>
         * <p>*   The sequence number is the index of the audio stream in the list and starts from 0.</p>
         * <p>*   If you do not specify a sequence number, the default audio stream is used.</p>
         */
        @NameInMap("AudioStreamMap")
        public String audioStreamMap;

        /**
         * <p>The information about the media clip.</p>
         */
        @NameInMap("Clip")
        public QueryJobListResponseBodyJobListJobOutputClip clip;

        /**
         * <p>Information about the container.</p>
         */
        @NameInMap("Container")
        public QueryJobListResponseBodyJobListJobOutputContainer container;

        /**
         * <p>The configuration of watermark blurring. The value must be a JSON object. For more information, see [Parameter details](~~29253~~).</p>
         */
        @NameInMap("DeWatermark")
        public String deWatermark;

        /**
         * <p>The encryption configuration. Only outputs in the M3U8 format are supported.</p>
         */
        @NameInMap("Encryption")
        public QueryJobListResponseBodyJobListJobOutputEncryption encryption;

        /**
         * <p>The custom fields.</p>
         */
        @NameInMap("ExtendData")
        public String extendData;

        /**
         * <p>The non-standard support configuration for M3U8. The value must be a JSON object. For more information, see [Parameter details](~~29253~~).</p>
         */
        @NameInMap("M3U8NonStandardSupport")
        public QueryJobListResponseBodyJobListJobOutputM3U8NonStandardSupport m3U8NonStandardSupport;

        /**
         * <p>The URL of the merging configuration file. You can specify only either the MergeList or MergeConfigUrl parameter.  </p>
         * <br>
         * <p>- The file that you specify for the MergeConfigUrl parameter can contain up to 50 merged clips.</p>
         * <p>- The MergeConfigUrl parameter specifies the URL of the configuration file for merging clips. Make sure that the configuration file is stored as an object in OSS and that MPS can access the OSS object. For information about the file content, see the details about merging parameters.</p>
         * <p>- Example of the content of mergeConfigfile: `{"MergeList":[{"MergeURL":"http://exampleBucket****.oss-cn-hangzhou.aliyuncs.com/video_01.mp4"}]}`.</p>
         */
        @NameInMap("MergeConfigUrl")
        public String mergeConfigUrl;

        /**
         * <p>The merging configuration. A maximum of four URLs can be merged.</p>
         */
        @NameInMap("MergeList")
        public QueryJobListResponseBodyJobListJobOutputMergeList mergeList;

        /**
         * <p>The transmuxing configurations. If this value was set in the request parameter, the corresponding parameters in the specified transcoding template are overwritten.</p>
         */
        @NameInMap("MuxConfig")
        public QueryJobListResponseBodyJobListJobOutputMuxConfig muxConfig;

        /**
         * <p>The list of opening parts. The value must be a JSON object.</p>
         */
        @NameInMap("OpeningList")
        public QueryJobListResponseBodyJobListJobOutputOpeningList openingList;

        /**
         * <p>The output subtitle list.</p>
         */
        @NameInMap("OutSubtitleList")
        public QueryJobListResponseBodyJobListJobOutputOutSubtitleList outSubtitleList;

        /**
         * <p>The information about the output file.</p>
         */
        @NameInMap("OutputFile")
        public QueryJobListResponseBodyJobListJobOutputOutputFile outputFile;

        /**
         * <p>The priority of the job in the MPS queue to which the job is added. </p>
         * <br>
         * <p>- A value of 10 indicates the highest priority.</p>
         * <p>- Default value: **6**.</p>
         */
        @NameInMap("Priority")
        public String priority;

        /**
         * <p>The media properties.</p>
         */
        @NameInMap("Properties")
        public QueryJobListResponseBodyJobListJobOutputProperties properties;

        /**
         * <p>The video rotation angle.</p>
         */
        @NameInMap("Rotate")
        public String rotate;

        /**
         * <p>The subtitle configuration.</p>
         */
        @NameInMap("SubtitleConfig")
        public QueryJobListResponseBodyJobListJobOutputSubtitleConfig subtitleConfig;

        /**
         * <p>Indicates that the resolution of the source video is used.</p>
         */
        @NameInMap("SuperReso")
        public QueryJobListResponseBodyJobListJobOutputSuperReso superReso;

        /**
         * <p>The list of ending parts.</p>
         */
        @NameInMap("TailSlateList")
        public QueryJobListResponseBodyJobListJobOutputTailSlateList tailSlateList;

        /**
         * <p>The ID of the template.</p>
         */
        @NameInMap("TemplateId")
        public String templateId;

        /**
         * <p>The general transcoding configurations.</p>
         * <br>
         * <p>>  If this value was set in the request parameter, the corresponding parameters in the specified transcoding template are overwritten.</p>
         */
        @NameInMap("TransConfig")
        public QueryJobListResponseBodyJobListJobOutputTransConfig transConfig;

        /**
         * <p>The custom data.</p>
         */
        @NameInMap("UserData")
        public String userData;

        /**
         * <p>The video configuration.</p>
         */
        @NameInMap("Video")
        public QueryJobListResponseBodyJobListJobOutputVideo video;

        /**
         * <p>The sequence number of the video stream. The sequence number is the index of the video stream in the list and starts from 0. If you do not set the corresponding parameter in the request, the default video stream is selected.</p>
         */
        @NameInMap("VideoStreamMap")
        public String videoStreamMap;

        /**
         * <p>The URL of the watermark configuration file.</p>
         */
        @NameInMap("WaterMarkConfigUrl")
        public String waterMarkConfigUrl;

        /**
         * <p>The list of watermarks.</p>
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
         * <p>The error code that is returned if the transcoding job fails. This parameter is not returned if the job succeeds.</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The time when the job was created.</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The time when the job was complete.</p>
         */
        @NameInMap("FinishTime")
        public String finishTime;

        /**
         * <p>The information about the job input.</p>
         */
        @NameInMap("Input")
        public QueryJobListResponseBodyJobListJobInput input;

        /**
         * <p>The ID of the job.</p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <p>The message sent by Message Service (MNS) to notify the user of the job result.</p>
         */
        @NameInMap("MNSMessageResult")
        public QueryJobListResponseBodyJobListJobMNSMessageResult MNSMessageResult;

        /**
         * <p>The message that is returned if the job fails. This parameter is not returned if the job succeeds.</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The output of the job.</p>
         */
        @NameInMap("Output")
        public QueryJobListResponseBodyJobListJobOutput output;

        /**
         * <p>The transcoding progress.</p>
         */
        @NameInMap("Percent")
        public Long percent;

        /**
         * <p>The ID of the MPS queue.</p>
         */
        @NameInMap("PipelineId")
        public String pipelineId;

        /**
         * <p>The status of the job. Valid values:</p>
         * <br>
         * <p>*   **Submitted**: The job has been submitted.</p>
         * <p>*   **Transcoding**: The job is being processed.</p>
         * <p>*   **TranscodeSuccess**: The job succeeded.</p>
         * <p>*   **TranscodeFail**: Transcoding failed.</p>
         * <p>*   **TranscodeCancelled**: The job has been canceled.</p>
         */
        @NameInMap("State")
        public String state;

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
