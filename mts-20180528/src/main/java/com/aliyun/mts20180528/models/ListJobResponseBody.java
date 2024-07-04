// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20180528.models;

import com.aliyun.tea.*;

public class ListJobResponseBody extends TeaModel {
    @NameInMap("JobList")
    public ListJobResponseBodyJobList jobList;

    @NameInMap("NextPageToken")
    public String nextPageToken;

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
        @NameInMap("Bucket")
        public String bucket;

        @NameInMap("Location")
        public String location;

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
        @NameInMap("ErrorCode")
        public String errorCode;

        @NameInMap("ErrorMessage")
        public String errorMessage;

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

    public static class ListJobResponseBodyJobListJobOutputAmixListAmix extends TeaModel {
        @NameInMap("AmixURL")
        public String amixURL;

        @NameInMap("Duration")
        public String duration;

        @NameInMap("Map")
        public String map;

        @NameInMap("MixDurMode")
        public String mixDurMode;

        @NameInMap("Start")
        public String start;

        public static ListJobResponseBodyJobListJobOutputAmixListAmix build(java.util.Map<String, ?> map) throws Exception {
            ListJobResponseBodyJobListJobOutputAmixListAmix self = new ListJobResponseBodyJobListJobOutputAmixListAmix();
            return TeaModel.build(map, self);
        }

        public ListJobResponseBodyJobListJobOutputAmixListAmix setAmixURL(String amixURL) {
            this.amixURL = amixURL;
            return this;
        }
        public String getAmixURL() {
            return this.amixURL;
        }

        public ListJobResponseBodyJobListJobOutputAmixListAmix setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public ListJobResponseBodyJobListJobOutputAmixListAmix setMap(String map) {
            this.map = map;
            return this;
        }
        public String getMap() {
            return this.map;
        }

        public ListJobResponseBodyJobListJobOutputAmixListAmix setMixDurMode(String mixDurMode) {
            this.mixDurMode = mixDurMode;
            return this;
        }
        public String getMixDurMode() {
            return this.mixDurMode;
        }

        public ListJobResponseBodyJobListJobOutputAmixListAmix setStart(String start) {
            this.start = start;
            return this;
        }
        public String getStart() {
            return this.start;
        }

    }

    public static class ListJobResponseBodyJobListJobOutputAmixList extends TeaModel {
        @NameInMap("Amix")
        public java.util.List<ListJobResponseBodyJobListJobOutputAmixListAmix> amix;

        public static ListJobResponseBodyJobListJobOutputAmixList build(java.util.Map<String, ?> map) throws Exception {
            ListJobResponseBodyJobListJobOutputAmixList self = new ListJobResponseBodyJobListJobOutputAmixList();
            return TeaModel.build(map, self);
        }

        public ListJobResponseBodyJobListJobOutputAmixList setAmix(java.util.List<ListJobResponseBodyJobListJobOutputAmixListAmix> amix) {
            this.amix = amix;
            return this;
        }
        public java.util.List<ListJobResponseBodyJobListJobOutputAmixListAmix> getAmix() {
            return this.amix;
        }

    }

    public static class ListJobResponseBodyJobListJobOutputAudioVolume extends TeaModel {
        @NameInMap("Level")
        public String level;

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
        @NameInMap("Bitrate")
        public String bitrate;

        @NameInMap("Channels")
        public String channels;

        @NameInMap("Codec")
        public String codec;

        @NameInMap("Profile")
        public String profile;

        @NameInMap("Qscale")
        public String qscale;

        @NameInMap("Samplerate")
        public String samplerate;

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
        @NameInMap("Duration")
        public String duration;

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
        @NameInMap("Id")
        public String id;

        @NameInMap("Key")
        public String key;

        @NameInMap("KeyType")
        public String keyType;

        @NameInMap("KeyUri")
        public String keyUri;

        @NameInMap("SkipCnt")
        public String skipCnt;

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
        @NameInMap("Md5Support")
        public Boolean md5Support;

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
        @NameInMap("Duration")
        public String duration;

        @NameInMap("MergeURL")
        public String mergeURL;

        @NameInMap("RoleArn")
        public String roleArn;

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
        @NameInMap("DitherMode")
        public String ditherMode;

        @NameInMap("FinalDelay")
        public String finalDelay;

        @NameInMap("IsCustomPalette")
        public String isCustomPalette;

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
        @NameInMap("Gif")
        public ListJobResponseBodyJobListJobOutputMuxConfigGif gif;

        @NameInMap("Segment")
        public ListJobResponseBodyJobListJobOutputMuxConfigSegment segment;

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
        @NameInMap("Height")
        public String height;

        @NameInMap("Start")
        public String start;

        @NameInMap("Width")
        public String width;

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
        @NameInMap("Bucket")
        public String bucket;

        @NameInMap("Location")
        public String location;

        @NameInMap("Object")
        public String object;

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
        @NameInMap("Map")
        public String map;

        @NameInMap("Message")
        public String message;

        @NameInMap("OutSubtitleFile")
        public ListJobResponseBodyJobListJobOutputOutSubtitleListOutSubtitleOutSubtitleFile outSubtitleFile;

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
        @NameInMap("Bucket")
        public String bucket;

        @NameInMap("Location")
        public String location;

        @NameInMap("Object")
        public String object;

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
        @NameInMap("Bitrate")
        public String bitrate;

        @NameInMap("Duration")
        public String duration;

        @NameInMap("FormatLongName")
        public String formatLongName;

        @NameInMap("FormatName")
        public String formatName;

        @NameInMap("NumPrograms")
        public String numPrograms;

        @NameInMap("NumStreams")
        public String numStreams;

        @NameInMap("Size")
        public String size;

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
        @NameInMap("Bitrate")
        public String bitrate;

        @NameInMap("ChannelLayout")
        public String channelLayout;

        @NameInMap("Channels")
        public String channels;

        @NameInMap("CodecLongName")
        public String codecLongName;

        @NameInMap("CodecName")
        public String codecName;

        @NameInMap("CodecTag")
        public String codecTag;

        @NameInMap("CodecTagString")
        public String codecTagString;

        @NameInMap("CodecTimeBase")
        public String codecTimeBase;

        @NameInMap("Duration")
        public String duration;

        @NameInMap("Index")
        public String index;

        @NameInMap("Lang")
        public String lang;

        @NameInMap("NumFrames")
        public String numFrames;

        @NameInMap("SampleFmt")
        public String sampleFmt;

        @NameInMap("Samplerate")
        public String samplerate;

        @NameInMap("StartTime")
        public String startTime;

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
        @NameInMap("Index")
        public String index;

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
        @NameInMap("AvgBitrate")
        public String avgBitrate;

        @NameInMap("CostBandwidth")
        public String costBandwidth;

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
        @NameInMap("AvgFPS")
        public String avgFPS;

        @NameInMap("Bitrate")
        public String bitrate;

        @NameInMap("CodecLongName")
        public String codecLongName;

        @NameInMap("CodecName")
        public String codecName;

        @NameInMap("CodecTag")
        public String codecTag;

        @NameInMap("CodecTagString")
        public String codecTagString;

        @NameInMap("CodecTimeBase")
        public String codecTimeBase;

        @NameInMap("Dar")
        public String dar;

        @NameInMap("Duration")
        public String duration;

        @NameInMap("Fps")
        public String fps;

        @NameInMap("HasBFrames")
        public String hasBFrames;

        @NameInMap("Height")
        public String height;

        @NameInMap("Index")
        public String index;

        @NameInMap("Lang")
        public String lang;

        @NameInMap("Level")
        public String level;

        @NameInMap("NetworkCost")
        public ListJobResponseBodyJobListJobOutputPropertiesStreamsVideoStreamListVideoStreamNetworkCost networkCost;

        @NameInMap("NumFrames")
        public String numFrames;

        @NameInMap("PixFmt")
        public String pixFmt;

        @NameInMap("Profile")
        public String profile;

        @NameInMap("Sar")
        public String sar;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("Timebase")
        public String timebase;

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
        @NameInMap("AudioStreamList")
        public ListJobResponseBodyJobListJobOutputPropertiesStreamsAudioStreamList audioStreamList;

        @NameInMap("SubtitleStreamList")
        public ListJobResponseBodyJobListJobOutputPropertiesStreamsSubtitleStreamList subtitleStreamList;

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
        @NameInMap("Bitrate")
        public String bitrate;

        @NameInMap("Duration")
        public String duration;

        @NameInMap("FileFormat")
        public String fileFormat;

        @NameInMap("FileSize")
        public String fileSize;

        @NameInMap("Format")
        public ListJobResponseBodyJobListJobOutputPropertiesFormat format;

        @NameInMap("Fps")
        public String fps;

        @NameInMap("Height")
        public String height;

        @NameInMap("Streams")
        public ListJobResponseBodyJobListJobOutputPropertiesStreams streams;

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
        @NameInMap("Bucket")
        public String bucket;

        @NameInMap("Location")
        public String location;

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
        @NameInMap("CharEnc")
        public String charEnc;

        @NameInMap("FontName")
        public String fontName;

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
        @NameInMap("ExtSubtitleList")
        public ListJobResponseBodyJobListJobOutputSubtitleConfigExtSubtitleList extSubtitleList;

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
        @NameInMap("BgColor")
        public String bgColor;

        @NameInMap("BlendDuration")
        public String blendDuration;

        @NameInMap("Height")
        public String height;

        @NameInMap("IsMergeAudio")
        public Boolean isMergeAudio;

        @NameInMap("Start")
        public String start;

        @NameInMap("TailUrl")
        public String tailUrl;

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
        @NameInMap("AdjDarMethod")
        public String adjDarMethod;

        @NameInMap("IsCheckAudioBitrate")
        public String isCheckAudioBitrate;

        @NameInMap("IsCheckAudioBitrateFail")
        public String isCheckAudioBitrateFail;

        @NameInMap("IsCheckReso")
        public String isCheckReso;

        @NameInMap("IsCheckResoFail")
        public String isCheckResoFail;

        @NameInMap("IsCheckVideoBitrate")
        public String isCheckVideoBitrate;

        @NameInMap("IsCheckVideoBitrateFail")
        public String isCheckVideoBitrateFail;

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
        @NameInMap("Max")
        public String max;

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
        @NameInMap("Bitrate")
        public String bitrate;

        @NameInMap("BitrateBnd")
        public ListJobResponseBodyJobListJobOutputVideoBitrateBnd bitrateBnd;

        @NameInMap("Bufsize")
        public String bufsize;

        @NameInMap("Codec")
        public String codec;

        @NameInMap("Crf")
        public String crf;

        @NameInMap("Crop")
        public String crop;

        @NameInMap("Degrain")
        public String degrain;

        @NameInMap("Fps")
        public String fps;

        @NameInMap("Gop")
        public String gop;

        @NameInMap("Height")
        public String height;

        @NameInMap("MaxFps")
        public String maxFps;

        @NameInMap("Maxrate")
        public String maxrate;

        @NameInMap("Pad")
        public String pad;

        @NameInMap("PixFmt")
        public String pixFmt;

        @NameInMap("Preset")
        public String preset;

        @NameInMap("Profile")
        public String profile;

        @NameInMap("Qscale")
        public String qscale;

        @NameInMap("ResoPriority")
        public String resoPriority;

        @NameInMap("ScanMode")
        public String scanMode;

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
        @NameInMap("Bucket")
        public String bucket;

        @NameInMap("Location")
        public String location;

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
        @NameInMap("Dx")
        public String dx;

        @NameInMap("Dy")
        public String dy;

        @NameInMap("Height")
        public String height;

        @NameInMap("InputFile")
        public ListJobResponseBodyJobListJobOutputWaterMarkListWaterMarkInputFile inputFile;

        @NameInMap("ReferPos")
        public String referPos;

        @NameInMap("Type")
        public String type;

        @NameInMap("WaterMarkTemplateId")
        public String waterMarkTemplateId;

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
        @NameInMap("AmixList")
        public ListJobResponseBodyJobListJobOutputAmixList amixList;

        @NameInMap("Audio")
        public ListJobResponseBodyJobListJobOutputAudio audio;

        @NameInMap("AudioStreamMap")
        public String audioStreamMap;

        @NameInMap("Clip")
        public ListJobResponseBodyJobListJobOutputClip clip;

        @NameInMap("Container")
        public ListJobResponseBodyJobListJobOutputContainer container;

        @NameInMap("DeWatermark")
        public String deWatermark;

        @NameInMap("Encryption")
        public ListJobResponseBodyJobListJobOutputEncryption encryption;

        @NameInMap("M3U8NonStandardSupport")
        public ListJobResponseBodyJobListJobOutputM3U8NonStandardSupport m3U8NonStandardSupport;

        @NameInMap("MergeConfigUrl")
        public String mergeConfigUrl;

        @NameInMap("MergeList")
        public ListJobResponseBodyJobListJobOutputMergeList mergeList;

        @NameInMap("MuxConfig")
        public ListJobResponseBodyJobListJobOutputMuxConfig muxConfig;

        @NameInMap("OpeningList")
        public ListJobResponseBodyJobListJobOutputOpeningList openingList;

        @NameInMap("OutSubtitleList")
        public ListJobResponseBodyJobListJobOutputOutSubtitleList outSubtitleList;

        @NameInMap("OutputFile")
        public ListJobResponseBodyJobListJobOutputOutputFile outputFile;

        @NameInMap("Priority")
        public String priority;

        @NameInMap("Properties")
        public ListJobResponseBodyJobListJobOutputProperties properties;

        @NameInMap("Rotate")
        public String rotate;

        @NameInMap("SubtitleConfig")
        public ListJobResponseBodyJobListJobOutputSubtitleConfig subtitleConfig;

        @NameInMap("SuperReso")
        public ListJobResponseBodyJobListJobOutputSuperReso superReso;

        @NameInMap("TailSlateList")
        public ListJobResponseBodyJobListJobOutputTailSlateList tailSlateList;

        @NameInMap("TemplateId")
        public String templateId;

        @NameInMap("TransConfig")
        public ListJobResponseBodyJobListJobOutputTransConfig transConfig;

        @NameInMap("UserData")
        public String userData;

        @NameInMap("Video")
        public ListJobResponseBodyJobListJobOutputVideo video;

        @NameInMap("VideoStreamMap")
        public String videoStreamMap;

        @NameInMap("WaterMarkConfigUrl")
        public String waterMarkConfigUrl;

        @NameInMap("WaterMarkList")
        public ListJobResponseBodyJobListJobOutputWaterMarkList waterMarkList;

        public static ListJobResponseBodyJobListJobOutput build(java.util.Map<String, ?> map) throws Exception {
            ListJobResponseBodyJobListJobOutput self = new ListJobResponseBodyJobListJobOutput();
            return TeaModel.build(map, self);
        }

        public ListJobResponseBodyJobListJobOutput setAmixList(ListJobResponseBodyJobListJobOutputAmixList amixList) {
            this.amixList = amixList;
            return this;
        }
        public ListJobResponseBodyJobListJobOutputAmixList getAmixList() {
            return this.amixList;
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
        @NameInMap("Code")
        public String code;

        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("FinishTime")
        public String finishTime;

        @NameInMap("Input")
        public ListJobResponseBodyJobListJobInput input;

        @NameInMap("JobId")
        public String jobId;

        @NameInMap("MNSMessageResult")
        public ListJobResponseBodyJobListJobMNSMessageResult MNSMessageResult;

        @NameInMap("Message")
        public String message;

        @NameInMap("Output")
        public ListJobResponseBodyJobListJobOutput output;

        @NameInMap("Percent")
        public Long percent;

        @NameInMap("PipelineId")
        public String pipelineId;

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
