// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class ListJobResponseBody extends TeaModel {
    /**
     * <p>The list of transcoding jobs.</p>
     */
    @NameInMap("JobList")
    public ListJobResponseBodyJobList jobList;

    /**
     * <p>The token that is used to retrieve the next page of the query results. You must record the token and specify it in the next request.</p>
     */
    @NameInMap("NextPageToken")
    public String nextPageToken;

    /**
     * <p>The ID of the request.</p>
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
         * <p>The OSS bucket in which the job input is stored.</p>
         */
        @NameInMap("Bucket")
        public String bucket;

        /**
         * <p>The OSS region where the job input resides.</p>
         */
        @NameInMap("Location")
        public String location;

        /**
         * <p>The name of the OSS object of the job input.</p>
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
         * <p>The error code that is returned when the job fails. This parameter is not returned if the job is created.</p>
         */
        @NameInMap("ErrorCode")
        public String errorCode;

        /**
         * <p>The error message that is returned when the job fails. This parameter is not returned if the job is created.</p>
         */
        @NameInMap("ErrorMessage")
        public String errorMessage;

        /**
         * <p>The ID of the success message.</p>
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
         * <br>
         * <p>*   Unit: dB.</p>
         * <p>*   Default: **-20db**.</p>
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
         * <br>
         * <p>*   Unit: Kbit/s.</p>
         * <p>*   Default value: **128**.</p>
         */
        @NameInMap("Bitrate")
        public String bitrate;

        /**
         * <p>The number of sound channels.</p>
         * <br>
         * <p>*   If the Codec parameter is set to mp3, this parameter can be set only to 1 or 2.</p>
         * <p>*   If the Codec parameter is set to aac, this parameter can be set only to 1, 2, 4, 5, 6, or 8.</p>
         * <p>*   Default value: 2.</p>
         */
        @NameInMap("Channels")
        public String channels;

        /**
         * <p>The audio codec.</p>
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
         * <p>*   Unit: Hz.</p>
         * <p>*   Default value: 44100.</p>
         * <p>*   If the video container format is FLV and the audio codec is MP3, you cannot set this parameter to 32000, 48000, or 96000. If the audio codec is MP3, you cannot set this parameter to 96000.</p>
         */
        @NameInMap("Samplerate")
        public String samplerate;

        /**
         * <p>The volume configuration.</p>
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
         * <br>
         * <p>*   Format: `hh:mm:ss[.SSS]` or `sssss[.SSS]`.</p>
         * <p>*   Valid values: `[00:00:00.000,23:59:59.999]` or `[0.000,86399.999]`.</p>
         * <p>*   Examples: 01:00:59.999 and 32000.23.</p>
         */
        @NameInMap("Duration")
        public String duration;

        /**
         * <p>The time when the clip starts.</p>
         * <br>
         * <p>*   Format: `hh:mm:ss[.SSS]` or `sssss[.SSS]`.</p>
         * <p>*   Valid values: `[00:00:00.000,23:59:59.999]` or `[0.000,86399.999]`.</p>
         * <p>*   Examples: 01:59:59.999 and 32000.23.</p>
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
         * <p>The format of the container.</p>
         * <br>
         * <p>*   Default value: mp4.</p>
         * <p>*   Video formats include FLV, MP4, HLS (M3U8 + TS), and MPEG-DASH (MPD + fMP4)</p>
         * <p>*   Audio formats include MP3, MP4, Ogg, FLAC, and M4A.</p>
         * <p>*   Image formats include GIF and WebP.</p>
         * <p>*   If the container format is GIF, the video codec must be set to GIF.</p>
         * <p>*   If the container format is WebP, the video codec must be set to WebP.</p>
         * <p>*   If the container format is FLV, the video codec cannot be set to H.265.</p>
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
         * <p>>  For example, if the key is `"encryptionkey128”`, you can encrypt the key in the Base64 format or use Key Management Service (KMS) to encrypt the key.````</p>
         */
        @NameInMap("KeyType")
        public String keyType;

        /**
         * <p>The URL that is used to request the key. The URL is Base64-encoded.</p>
         */
        @NameInMap("KeyUri")
        public String keyUri;

        /**
         * <p>The number of unencrypted frames at the beginning of the video. Leaving these frames unencrypted enables video playback to start quickly.</p>
         */
        @NameInMap("SkipCnt")
        public String skipCnt;

        /**
         * <p>The encryption type. Valid value: hls-aes-128.</p>
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
         * <p>Indicates whether to support the output of the md5 value of the TS file in the M3U8 video. Valid values:</p>
         * <br>
         * <p>*   **true**: supported.</p>
         * <p>*   **false**: not supported.</p>
         */
        @NameInMap("Md5Support")
        public Boolean md5Support;

        /**
         * <p>Indicates whether to support the output of the size of the TS file in the M3U8 video.</p>
         * <br>
         * <p>*   **true**: supported.</p>
         * <p>*   **false**: not supported.</p>
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
         * <p>The non-standard support configuration for TS files. The value must be a JSON object. For more information, see [Parameter details](~~29253~~).</p>
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
         * <p>The start point in time of the clip.</p>
         * <br>
         * <p>*   Format: `hh:mm:ss[.SSS]` or `sssss[.SSS]`.</p>
         * <p>*   Example values: 01:59:59.999 and 32000.23.</p>
         */
        @NameInMap("Duration")
        public String duration;

        /**
         * <p>The OSS URL of the clip.</p>
         * <br>
         * <p>*   Example: `http://example-bucket-****.oss-cn-hangzhou.aliyuncs.com/example-object.flv`.</p>
         * <p>*   The object must be URL-encoded by using the UTF-8 standard.</p>
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
         * <p>*   Format: `hh:mm:ss[.SSS]` or `sssss[.SSS]`.</p>
         * <p>*   Example values: 01:59:59.999 and 32000.23.</p>
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
         * <p>The color dithering algorithm of the palette. Valid values: **sierra** and **bayer**.</p>
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
         * <p>The length of the segment. The value must be an integer. Unit: seconds. </p>
         * <br>
         * <p>- Valid values: [1,10].</p>
         * <p>- Default value: 10.</p>
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
         * <p>The transmuxing configuration for GIF.</p>
         */
        @NameInMap("Gif")
        public ListJobResponseBodyJobListJobOutputMuxConfigGif gif;

        /**
         * <p>The segment configuration. The value is a JSON object.</p>
         */
        @NameInMap("Segment")
        public ListJobResponseBodyJobListJobOutputMuxConfigSegment segment;

        /**
         * <p>The transmuxing configuration for WebP.</p>
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
         * <br>
         * <p>*   Default value: **-1**.</p>
         * <p>*   A value of -1 indicates that the height of the source of the opening part is retained.</p>
         * <p>*   A value of full indicates that the height of the main part is used for the opening part.</p>
         */
        @NameInMap("Height")
        public String height;

        /**
         * <p>The amount of time after which the opening part is played. The value starts from 0.</p>
         * <br>
         * <p>*   Unit: seconds.</p>
         * <p>*   Default value: **0**.</p>
         */
        @NameInMap("Start")
        public String start;

        /**
         * <p>The width of the opening part. Valid values: values in the range of (0, 4096), -1, and full.</p>
         * <br>
         * <p>*   Default value: **-1**.</p>
         * <p>*   A value of -1 indicates that the width of the source of the opening part is retained.</p>
         * <p>*   A value of full indicates that the width of the main part is used for the opening part.</p>
         */
        @NameInMap("Width")
        public String width;

        /**
         * <p>The OSS URL of the opening part of the video.</p>
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
         */
        @NameInMap("Bucket")
        public String bucket;

        /**
         * <p>The OSS region where the output file resides.</p>
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
         * <p>The video track. Format: 0:{stream}:{stream sequence number}, that is, 0:v:{video_index}. The value of stream is v, which indicates an audio stream of a video. The sequence number is the index of the audio stream in the list and starts from 0.</p>
         */
        @NameInMap("Map")
        public String map;

        /**
         * <p>The error message that is returned when the job fails to be created. This parameter is not returned if the job is created.</p>
         */
        @NameInMap("Message")
        public String message;

        /**
         * <p>The details of the output file.</p>
         */
        @NameInMap("OutSubtitleFile")
        public ListJobResponseBodyJobListJobOutputOutSubtitleListOutSubtitleOutSubtitleFile outSubtitleFile;

        /**
         * <p>Indicates whether the job was successful. Valid values:</p>
         * <br>
         * <p>*   **true**: The job was successful.</p>
         * <p>*   **fasle**: The job failed.</p>
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
         */
        @NameInMap("Bucket")
        public String bucket;

        /**
         * <p>The OSS region where the output file resides.</p>
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
         * <p>The language. For more information, see [FFmeg language definition](https://www.ffmpeg.org/ffmpeg-all.html#Metadata) and [ISO-639](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes).</p>
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
         * <p>The sequence number of the subtitle stream. </p>
         * <br>
         * <p>The value specifies the position of the subtitle stream in all subtitle streams.</p>
         */
        @NameInMap("Index")
        public String index;

        /**
         * <p>The language.</p>
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
         * <p>The height of the video in pixels.</p>
         */
        @NameInMap("Height")
        public String height;

        /**
         * <p>The sequence number of the video stream. The value indicates the position of the video stream in all video streams.</p>
         */
        @NameInMap("Index")
        public String index;

        /**
         * <p>The language. For more information, see [FFmeg language definition](https://www.ffmpeg.org/ffmpeg-all.html#Metadata) and [ISO-639](https://en.wikipedia.org/wiki/List_of_ISO_639-1_codes).</p>
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
        public ListJobResponseBodyJobListJobOutputPropertiesStreamsVideoStreamListVideoStreamNetworkCost networkCost;

        /**
         * <p>The total frame rate.</p>
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
         * <p>The time base.</p>
         */
        @NameInMap("Timebase")
        public String timebase;

        /**
         * <p>The width of the video in pixels.</p>
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
         * <p>The list of audio streams.</p>
         */
        @NameInMap("AudioStreamList")
        public ListJobResponseBodyJobListJobOutputPropertiesStreamsAudioStreamList audioStreamList;

        /**
         * <p>The list of subtitle streams.</p>
         */
        @NameInMap("SubtitleStreamList")
        public ListJobResponseBodyJobListJobOutputPropertiesStreamsSubtitleStreamList subtitleStreamList;

        /**
         * <p>The list of video streams.</p>
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
         * <p>The format of the video file.</p>
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
        public ListJobResponseBodyJobListJobOutputPropertiesFormat format;

        /**
         * <p>The frame rate.</p>
         */
        @NameInMap("Fps")
        public String fps;

        /**
         * <p>The length of the video.</p>
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
         * <p>The OSS bucket in which the input file is stored.</p>
         */
        @NameInMap("Bucket")
        public String bucket;

        /**
         * <p>The OSS region where the input file resides.</p>
         */
        @NameInMap("Location")
        public String location;

        /**
         * <p>The name of the OSS object that is used as the input file.</p>
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
         * <p>The font of the hard subtitles converted from external subtitles.</p>
         */
        @NameInMap("FontName")
        public String fontName;

        /**
         * <p>The input subtitle file. </p>
         * <br>
         * <p>- Files in the SRT or ASS format are supported. For more information, see [Parameter details](https://www.alibabacloud.com/help/en/apsaravideo-for-media-processing/latest/parameter-details).</p>
         * <p>- Example: `{“Bucket”:”example-bucket”,“Location”:”oss-cn-hangzhou”,“Object”:”example.srt”}`.</p>
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
         * <p>The list of external subtitles. The value is a JSON array.</p>
         */
        @NameInMap("ExtSubtitleList")
        public ListJobResponseBodyJobListJobOutputSubtitleConfigExtSubtitleList extSubtitleList;

        /**
         * <p>The list of subtitles.</p>
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
         * <p>Indicates whether to obtain parameters related to the sampling rate. Valid values:</p>
         * <br>
         * <p>- **true**: The parameters are obtained.</p>
         * <p>- **false**: The parameters are not obtained.</p>
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
         * <p>The color of the bars that are added to the ending part if the size of the ending part is smaller than that of the main part. Default value: **White**. For more information, see [Background colors](https://docs-aliyun.cn-hangzhou.oss.aliyun-inc.com/assets/attach/29253/cn_zh/1502784952344/color.txt?spm=a2c4g.11186623.2.63.1df840f74IH4Eq&file=color.txt).</p>
         */
        @NameInMap("BgColor")
        public String bgColor;

        /**
         * <p>The amount of time between the end of the main part and the beginning of the ending part. During the transition, the last frame of the main part fades out, and the first frame of the ending part fades in. Unit: seconds. Default value: 0.</p>
         */
        @NameInMap("BlendDuration")
        public String blendDuration;

        /**
         * <p>The height of the ending part. Valid values: values in the range of (0, 4096), -1, and full. </p>
         * <br>
         * <p>- A value of -1 indicates that the height of the source of the ending part is retained.</p>
         * <p>- A value of full indicates that the height of the main part is used for the ending part.</p>
         * <p>- Default value: **-1**.</p>
         */
        @NameInMap("Height")
        public String height;

        /**
         * <p>Indicates whether to merge the audio content of the ending part. Valid values:</p>
         * <br>
         * <p>- **true**: The audio content of the ending part is merged.</p>
         * <p>- **false**: The audio content of the ending part is not merged.</p>
         */
        @NameInMap("IsMergeAudio")
        public Boolean isMergeAudio;

        /**
         * <p>The start time.</p>
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
         * <p>- A value of -1 indicates that the width of the source of the ending part is retained. A value of full indicates that the width of the main part is used for the ending part.</p>
         * <p>- Default value: **-1**.</p>
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
         * <p>The method of resolution adjustment. Default value: **none**. Valid values: rescale, crop, pad, and none.</p>
         */
        @NameInMap("AdjDarMethod")
        public String adjDarMethod;

        /**
         * <p>Indicates whether the audio bitrate is checked. If the output audio bitrate is higher than the input audio bitrate, the system considers that the output bitrate equals the input bitrate.</p>
         * <br>
         * <p>*   **true**: The audio bitrate is checked.</p>
         * <p>*   **false**: The audio bitrate is not checked.</p>
         * <p>*   Default value: **false**.</p>
         */
        @NameInMap("IsCheckAudioBitrate")
        public String isCheckAudioBitrate;

        /**
         * <p>Indicates whether the audio bitrate is checked. If the output audio bitrate is higher than the audio bitrate of the media source, a transcoding failure is returned without transcoding the media. This parameter takes precedence over the IsCheckAudioBitrate parameter.</p>
         * <br>
         * <p>*   **true**: The audio bitrate is checked.</p>
         * <p>*   **false**: The audio bitrate is not checked.</p>
         */
        @NameInMap("IsCheckAudioBitrateFail")
        public String isCheckAudioBitrateFail;

        /**
         * <p>Indicates whether the resolution is checked. If the output resolution is higher than the input resolution based on the width or height, the system considers that the output resolution equals the input resolution.</p>
         * <br>
         * <p>*   **true**: The resolution is checked.</p>
         * <p>*   **false**: The resolution is not checked.</p>
         * <p>*   Default value: **false**.</p>
         */
        @NameInMap("IsCheckReso")
        public String isCheckReso;

        /**
         * <p>Indicates whether the resolution is checked. If the output resolution is higher than the input resolution based on the width or height, a transcoding failure is returned.</p>
         * <br>
         * <p>*   **true**: The resolution is checked.</p>
         * <p>*   **false**: The resolution is not checked.</p>
         * <p>*   Default value: **false**.</p>
         */
        @NameInMap("IsCheckResoFail")
        public String isCheckResoFail;

        /**
         * <p>Indicates whether the video bitrate is checked. If the output video bitrate is higher than the input video bitrate, the system considers that the output bitrate equals the input bitrate.</p>
         * <br>
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
         * <p>*   Default value: false.</p>
         */
        @NameInMap("IsCheckVideoBitrateFail")
        public String isCheckVideoBitrateFail;

        /**
         * <p>The transcoding mode.</p>
         * <br>
         * <p>*   Valid values: onepass, twopass, and CBR.</p>
         * <p>*   Default value: onepass.</p>
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
         */
        @NameInMap("Max")
        public String max;

        /**
         * <p>The minimum bitrate. Unit: Kbit/s.</p>
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
         */
        @NameInMap("Bufsize")
        public String bufsize;

        /**
         * <p>The codec. Valid values: **H.264**, **H.265**, **GIF**, and **WEBP**.</p>
         */
        @NameInMap("Codec")
        public String codec;

        /**
         * <p>The constant rate factor. If this parameter is specified, the setting of the Bitrate parameter becomes invalid. Default value: **26**.</p>
         */
        @NameInMap("Crf")
        public String crf;

        /**
         * <p>The video cropping mode. The following modes are supported:</p>
         * <br>
         * <p>*   **border**: automatically detects and removes borders.</p>
         * <p>*   Custom cropping. Specify a value in the format of width:height:left:top to crop the video based on the custom settings. Example: 1280:800:0:140.</p>
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
         * <p>*   The value is 60 if the frame rate of the input file exceeds 60.</p>
         * <p>*   Default value: the frame rate of the input file.</p>
         */
        @NameInMap("Fps")
        public String fps;

        /**
         * <p>The maximum number of frames between two keyframes. Default value: 250.</p>
         */
        @NameInMap("Gop")
        public String gop;

        /**
         * <p>The height.</p>
         * <br>
         * <p>*   Unit: pixels.</p>
         * <p>*   Default value: the original height of the video.</p>
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
         * <p>The black borders to be added to the video. Unit: pixels.</p>
         * <br>
         * <p>*   Format: width:height:left:top.</p>
         * <p>*   Example: 1280:800:0:140.</p>
         */
        @NameInMap("Pad")
        public String pad;

        /**
         * <p>The video color format. Valid values: standard pixel formats such as yuv420p and yuvj420p.</p>
         */
        @NameInMap("PixFmt")
        public String pixFmt;

        /**
         * <p>The preset video algorithm. Default value: medium. Valid values:</p>
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
         * <p>The codec profile. Valid values:</p>
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
         * <p>*   **interlaced**: An interlaced scan was performed.</p>
         * <p>*   **progressive**: A progressive scan was performed.</p>
         * <p>*   **auto**: A scan was performed based on the video source.</p>
         */
        @NameInMap("ScanMode")
        public String scanMode;

        /**
         * <p>The width.</p>
         * <br>
         * <p>*   Unit: pixels.</p>
         * <p>*   Default value: the original width of the video.</p>
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
         */
        @NameInMap("Bucket")
        public String bucket;

        /**
         * <p>The OSS region where the input file resides.</p>
         */
        @NameInMap("Location")
        public String location;

        /**
         * <p>The name of the OSS object that is used as the input file.</p>
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
         * <p>The horizontal offset of the watermark relative to the output video. If this parameter was specified in the request, the value overwrites the corresponding parameter in the watermark template. Default value: 0. The value can be an integer or a decimal.</p>
         * <br>
         * <p>*   An integer indicates the pixel value of the horizontal offset.</p>
         * <br>
         * <p>    *   Valid values: \[8,4096].</p>
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
         * <p>The vertical offset of the watermark image relative to the output video. If this parameter was specified in the request, the value overwrites the corresponding parameter in the watermark template. The value can be an integer or a decimal.</p>
         * <br>
         * <p>*   An integer indicates the pixel value of the vertical offset.</p>
         * <br>
         * <p>    *   Valid values: \[8,4096].</p>
         * <p>    *   Unit: pixels.</p>
         * <br>
         * <p>*   A decimal indicates the ratio of the vertical offset to the height in the output video resolution.</p>
         * <br>
         * <p>    *   Valid values: (0,1).</p>
         * <p>    *   The decimal number can be accurate to four decimal places, such as 0.9999. Excessive digits are automatically deleted.</p>
         */
        @NameInMap("Dy")
        public String dy;

        /**
         * <p>The height of the watermark. If this parameter was specified in the request, the value overwrites the corresponding parameter in the watermark template. The value can be an integer or a decimal.</p>
         * <br>
         * <p>*   An integer indicates the pixel value of the watermark height.</p>
         * <br>
         * <p>    *   Valid values: \[8,4096].</p>
         * <p>    *   Unit: pixels.</p>
         * <br>
         * <p>*   A decimal indicates the ratio of the watermark height to the height in the output video resolution.</p>
         * <br>
         * <p>    *   Valid values: (0,1).</p>
         * <p>    *   The decimal number can be accurate to four decimal places, such as 0.9999. Excessive digits are automatically deleted.</p>
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
         * <br>
         * <p>*   **TopRight**: the upper-right corner.</p>
         * <p>*   **TopLeft**: the upper-left corner.</p>
         * <p>*   **BottomRight**: the lower-right corner.</p>
         * <p>*   **BottomLeft**: the lower-left corner.</p>
         */
        @NameInMap("ReferPos")
        public String referPos;

        /**
         * <p>The type of the watermark. If this parameter was specified in the request, the value overwrites the corresponding parameter in the watermark template. For more information, see [Parameter details](~~29253~~). Valid values:</p>
         * <br>
         * <p>*   **Image**: an image watermark.</p>
         * <p>*   **Text**: a text watermark.</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The ID of the watermark template.</p>
         */
        @NameInMap("WaterMarkTemplateId")
        public String waterMarkTemplateId;

        /**
         * <p>The width of the watermark. If this parameter was specified in the request, the value overwrites the corresponding parameter in the watermark template. The value can be an integer or a decimal.</p>
         * <br>
         * <p>*   An integer indicates the pixel value of the watermark width.</p>
         * <br>
         * <p>    *   Valid values: \[8,4096].</p>
         * <p>    *   Unit: pixels.</p>
         * <br>
         * <p>*   A decimal indicates the ratio of the watermark width to the width in the output video resolution.</p>
         * <br>
         * <p>    *   Valid values: (0,1).</p>
         * <p>    *   The decimal number can be accurate to four decimal places, such as 0.9999. Excessive digits are automatically deleted.</p>
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
         * <p>The audio configuration.</p>
         */
        @NameInMap("Audio")
        public ListJobResponseBodyJobListJobOutputAudio audio;

        /**
         * <p>The sequence number of the audio stream.</p>
         * <br>
         * <p>*   Format: `0:a:{sequence number}`.</p>
         * <p>*   The sequence number is the index of the audio stream in the list and starts from 0. If you do not set the corresponding parameter in the request, the default audio stream is selected.</p>
         */
        @NameInMap("AudioStreamMap")
        public String audioStreamMap;

        /**
         * <p>The information about the clip.</p>
         */
        @NameInMap("Clip")
        public ListJobResponseBodyJobListJobOutputClip clip;

        /**
         * <p>The information about the container.</p>
         */
        @NameInMap("Container")
        public ListJobResponseBodyJobListJobOutputContainer container;

        /**
         * <p>The configuration of watermark blurring. The value must be a JSON object. For more information, see [Parameter details](~~29253~~).</p>
         */
        @NameInMap("DeWatermark")
        public String deWatermark;

        /**
         * <p>The encryption configuration. Only outputs in the M3U8 format are supported.</p>
         */
        @NameInMap("Encryption")
        public ListJobResponseBodyJobListJobOutputEncryption encryption;

        /**
         * <p>The non-standard support configuration for M3U8. The value must be a JSON object. For more information, see [Parameter details](~~29253~~).</p>
         */
        @NameInMap("M3U8NonStandardSupport")
        public ListJobResponseBodyJobListJobOutputM3U8NonStandardSupport m3U8NonStandardSupport;

        /**
         * <p>The URL of the merging configuration file. You can specify either the MergeList or MergeConfigUrl parameter.  </p>
         * <br>
         * <p>- The configuration file that you specify by using the MergeConfigUrl parameter can contain up to 50 merged clips.</p>
         * <p>- The MergeConfigUrl parameter specifies the URL of the configuration file for clip merging.</p>
         * <p>- Make sure that the configuration file is stored as an object in OSS and that MPS can access the OSS object. For information about the file content, see the details about merging parameters.</p>
         * <p>- Example of the content of mergeConfigfile: `{"MergeList":[{"MergeURL":"http://exampleBucket****.oss-cn-hangzhou.aliyuncs.com/video_01.mp4"}]}`.</p>
         */
        @NameInMap("MergeConfigUrl")
        public String mergeConfigUrl;

        /**
         * <p>The clip merging configuration.</p>
         */
        @NameInMap("MergeList")
        public ListJobResponseBodyJobListJobOutputMergeList mergeList;

        /**
         * <p>The transmuxing configuration.</p>
         */
        @NameInMap("MuxConfig")
        public ListJobResponseBodyJobListJobOutputMuxConfig muxConfig;

        /**
         * <p>The list of opening parts.</p>
         */
        @NameInMap("OpeningList")
        public ListJobResponseBodyJobListJobOutputOpeningList openingList;

        /**
         * <p>The output subtitle list.</p>
         */
        @NameInMap("OutSubtitleList")
        public ListJobResponseBodyJobListJobOutputOutSubtitleList outSubtitleList;

        /**
         * <p>The information about the output file.</p>
         */
        @NameInMap("OutputFile")
        public ListJobResponseBodyJobListJobOutputOutputFile outputFile;

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
        public ListJobResponseBodyJobListJobOutputProperties properties;

        /**
         * <p>The video rotation angle.</p>
         */
        @NameInMap("Rotate")
        public String rotate;

        /**
         * <p>The subtitle configuration.</p>
         */
        @NameInMap("SubtitleConfig")
        public ListJobResponseBodyJobListJobOutputSubtitleConfig subtitleConfig;

        /**
         * <p>Indicates that the resolution of the source video is used.</p>
         */
        @NameInMap("SuperReso")
        public ListJobResponseBodyJobListJobOutputSuperReso superReso;

        /**
         * <p>The list of ending parts.</p>
         */
        @NameInMap("TailSlateList")
        public ListJobResponseBodyJobListJobOutputTailSlateList tailSlateList;

        /**
         * <p>The ID of the template.</p>
         */
        @NameInMap("TemplateId")
        public String templateId;

        /**
         * <p>The general transcoding configuration. If this parameter was specified in the request, the value overwrites the corresponding parameter in the specified transcoding template.</p>
         */
        @NameInMap("TransConfig")
        public ListJobResponseBodyJobListJobOutputTransConfig transConfig;

        /**
         * <p>The custom data.</p>
         */
        @NameInMap("UserData")
        public String userData;

        /**
         * <p>The video configuration.</p>
         */
        @NameInMap("Video")
        public ListJobResponseBodyJobListJobOutputVideo video;

        /**
         * <p>The sequence number of the video stream. </p>
         * <br>
         * <p>- Format: 0:a:{Sequence number}. Example value: 0:a:0.</p>
         * <p>- The sequence number is the index of the video stream in the list and starts from 0.</p>
         * <p>- If you do not set the corresponding parameter in the request, the default video stream is selected.</p>
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
         * <p>The error code that is returned when the job fails. This parameter is not returned if the job is successful.</p>
         */
        @NameInMap("Code")
        public String code;

        /**
         * <p>The time when the job was created.</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The time when the transcoding job was complete.</p>
         */
        @NameInMap("FinishTime")
        public String finishTime;

        /**
         * <p>The information about the job input.</p>
         */
        @NameInMap("Input")
        public ListJobResponseBodyJobListJobInput input;

        /**
         * <p>The ID of the job.</p>
         */
        @NameInMap("JobId")
        public String jobId;

        /**
         * <p>The message sent by Message Service (MNS) to notify the user of the job result.</p>
         */
        @NameInMap("MNSMessageResult")
        public ListJobResponseBodyJobListJobMNSMessageResult MNSMessageResult;

        /**
         * <p>The message that is returned when the job fails. This parameter is not returned if the job is successful.</p>
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
         * <p>*   **Submitted**: The job is submitted.</p>
         * <p>*   **Transcoding**: The job is being transcoded.</p>
         * <p>*   **TranscodeSuccess**: Transcoding is successful.</p>
         * <p>*   **TranscodeFail**: Transcoding failed.</p>
         * <p>*   **TranscodeCancelled**: Transcoding is canceled.</p>
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
