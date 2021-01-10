// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class QueryJobListResponseBody extends TeaModel {
    @NameInMap("NonExistJobIds")
    public QueryJobListResponseBodyNonExistJobIds nonExistJobIds;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("JobList")
    public QueryJobListResponseBodyJobList jobList;

    public static QueryJobListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryJobListResponseBody self = new QueryJobListResponseBody();
        return TeaModel.build(map, self);
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

    public QueryJobListResponseBody setJobList(QueryJobListResponseBodyJobList jobList) {
        this.jobList = jobList;
        return this;
    }
    public QueryJobListResponseBodyJobList getJobList() {
        return this.jobList;
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

    public static class QueryJobListResponseBodyJobListJobOutputVideoBitrateBnd extends TeaModel {
        @NameInMap("Max")
        public String max;

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
        @NameInMap("Bufsize")
        public String bufsize;

        @NameInMap("Degrain")
        public String degrain;

        @NameInMap("BitrateBnd")
        public QueryJobListResponseBodyJobListJobOutputVideoBitrateBnd bitrateBnd;

        @NameInMap("PixFmt")
        public String pixFmt;

        @NameInMap("Pad")
        public String pad;

        @NameInMap("Codec")
        public String codec;

        @NameInMap("Height")
        public String height;

        @NameInMap("Qscale")
        public String qscale;

        @NameInMap("Crop")
        public String crop;

        @NameInMap("Bitrate")
        public String bitrate;

        @NameInMap("Maxrate")
        public String maxrate;

        @NameInMap("MaxFps")
        public String maxFps;

        @NameInMap("Profile")
        public String profile;

        @NameInMap("Crf")
        public String crf;

        @NameInMap("Gop")
        public String gop;

        @NameInMap("Width")
        public String width;

        @NameInMap("Fps")
        public String fps;

        @NameInMap("Preset")
        public String preset;

        @NameInMap("ScanMode")
        public String scanMode;

        @NameInMap("ResoPriority")
        public String resoPriority;

        public static QueryJobListResponseBodyJobListJobOutputVideo build(java.util.Map<String, ?> map) throws Exception {
            QueryJobListResponseBodyJobListJobOutputVideo self = new QueryJobListResponseBodyJobListJobOutputVideo();
            return TeaModel.build(map, self);
        }

        public QueryJobListResponseBodyJobListJobOutputVideo setBufsize(String bufsize) {
            this.bufsize = bufsize;
            return this;
        }
        public String getBufsize() {
            return this.bufsize;
        }

        public QueryJobListResponseBodyJobListJobOutputVideo setDegrain(String degrain) {
            this.degrain = degrain;
            return this;
        }
        public String getDegrain() {
            return this.degrain;
        }

        public QueryJobListResponseBodyJobListJobOutputVideo setBitrateBnd(QueryJobListResponseBodyJobListJobOutputVideoBitrateBnd bitrateBnd) {
            this.bitrateBnd = bitrateBnd;
            return this;
        }
        public QueryJobListResponseBodyJobListJobOutputVideoBitrateBnd getBitrateBnd() {
            return this.bitrateBnd;
        }

        public QueryJobListResponseBodyJobListJobOutputVideo setPixFmt(String pixFmt) {
            this.pixFmt = pixFmt;
            return this;
        }
        public String getPixFmt() {
            return this.pixFmt;
        }

        public QueryJobListResponseBodyJobListJobOutputVideo setPad(String pad) {
            this.pad = pad;
            return this;
        }
        public String getPad() {
            return this.pad;
        }

        public QueryJobListResponseBodyJobListJobOutputVideo setCodec(String codec) {
            this.codec = codec;
            return this;
        }
        public String getCodec() {
            return this.codec;
        }

        public QueryJobListResponseBodyJobListJobOutputVideo setHeight(String height) {
            this.height = height;
            return this;
        }
        public String getHeight() {
            return this.height;
        }

        public QueryJobListResponseBodyJobListJobOutputVideo setQscale(String qscale) {
            this.qscale = qscale;
            return this;
        }
        public String getQscale() {
            return this.qscale;
        }

        public QueryJobListResponseBodyJobListJobOutputVideo setCrop(String crop) {
            this.crop = crop;
            return this;
        }
        public String getCrop() {
            return this.crop;
        }

        public QueryJobListResponseBodyJobListJobOutputVideo setBitrate(String bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public String getBitrate() {
            return this.bitrate;
        }

        public QueryJobListResponseBodyJobListJobOutputVideo setMaxrate(String maxrate) {
            this.maxrate = maxrate;
            return this;
        }
        public String getMaxrate() {
            return this.maxrate;
        }

        public QueryJobListResponseBodyJobListJobOutputVideo setMaxFps(String maxFps) {
            this.maxFps = maxFps;
            return this;
        }
        public String getMaxFps() {
            return this.maxFps;
        }

        public QueryJobListResponseBodyJobListJobOutputVideo setProfile(String profile) {
            this.profile = profile;
            return this;
        }
        public String getProfile() {
            return this.profile;
        }

        public QueryJobListResponseBodyJobListJobOutputVideo setCrf(String crf) {
            this.crf = crf;
            return this;
        }
        public String getCrf() {
            return this.crf;
        }

        public QueryJobListResponseBodyJobListJobOutputVideo setGop(String gop) {
            this.gop = gop;
            return this;
        }
        public String getGop() {
            return this.gop;
        }

        public QueryJobListResponseBodyJobListJobOutputVideo setWidth(String width) {
            this.width = width;
            return this;
        }
        public String getWidth() {
            return this.width;
        }

        public QueryJobListResponseBodyJobListJobOutputVideo setFps(String fps) {
            this.fps = fps;
            return this;
        }
        public String getFps() {
            return this.fps;
        }

        public QueryJobListResponseBodyJobListJobOutputVideo setPreset(String preset) {
            this.preset = preset;
            return this;
        }
        public String getPreset() {
            return this.preset;
        }

        public QueryJobListResponseBodyJobListJobOutputVideo setScanMode(String scanMode) {
            this.scanMode = scanMode;
            return this;
        }
        public String getScanMode() {
            return this.scanMode;
        }

        public QueryJobListResponseBodyJobListJobOutputVideo setResoPriority(String resoPriority) {
            this.resoPriority = resoPriority;
            return this;
        }
        public String getResoPriority() {
            return this.resoPriority;
        }

    }

    public static class QueryJobListResponseBodyJobListJobOutputTransConfig extends TeaModel {
        @NameInMap("IsCheckAudioBitrate")
        public String isCheckAudioBitrate;

        @NameInMap("TransMode")
        public String transMode;

        @NameInMap("IsCheckReso")
        public String isCheckReso;

        @NameInMap("IsCheckVideoBitrateFail")
        public String isCheckVideoBitrateFail;

        @NameInMap("AdjDarMethod")
        public String adjDarMethod;

        @NameInMap("IsCheckVideoBitrate")
        public String isCheckVideoBitrate;

        @NameInMap("IsCheckResoFail")
        public String isCheckResoFail;

        @NameInMap("IsCheckAudioBitrateFail")
        public String isCheckAudioBitrateFail;

        public static QueryJobListResponseBodyJobListJobOutputTransConfig build(java.util.Map<String, ?> map) throws Exception {
            QueryJobListResponseBodyJobListJobOutputTransConfig self = new QueryJobListResponseBodyJobListJobOutputTransConfig();
            return TeaModel.build(map, self);
        }

        public QueryJobListResponseBodyJobListJobOutputTransConfig setIsCheckAudioBitrate(String isCheckAudioBitrate) {
            this.isCheckAudioBitrate = isCheckAudioBitrate;
            return this;
        }
        public String getIsCheckAudioBitrate() {
            return this.isCheckAudioBitrate;
        }

        public QueryJobListResponseBodyJobListJobOutputTransConfig setTransMode(String transMode) {
            this.transMode = transMode;
            return this;
        }
        public String getTransMode() {
            return this.transMode;
        }

        public QueryJobListResponseBodyJobListJobOutputTransConfig setIsCheckReso(String isCheckReso) {
            this.isCheckReso = isCheckReso;
            return this;
        }
        public String getIsCheckReso() {
            return this.isCheckReso;
        }

        public QueryJobListResponseBodyJobListJobOutputTransConfig setIsCheckVideoBitrateFail(String isCheckVideoBitrateFail) {
            this.isCheckVideoBitrateFail = isCheckVideoBitrateFail;
            return this;
        }
        public String getIsCheckVideoBitrateFail() {
            return this.isCheckVideoBitrateFail;
        }

        public QueryJobListResponseBodyJobListJobOutputTransConfig setAdjDarMethod(String adjDarMethod) {
            this.adjDarMethod = adjDarMethod;
            return this;
        }
        public String getAdjDarMethod() {
            return this.adjDarMethod;
        }

        public QueryJobListResponseBodyJobListJobOutputTransConfig setIsCheckVideoBitrate(String isCheckVideoBitrate) {
            this.isCheckVideoBitrate = isCheckVideoBitrate;
            return this;
        }
        public String getIsCheckVideoBitrate() {
            return this.isCheckVideoBitrate;
        }

        public QueryJobListResponseBodyJobListJobOutputTransConfig setIsCheckResoFail(String isCheckResoFail) {
            this.isCheckResoFail = isCheckResoFail;
            return this;
        }
        public String getIsCheckResoFail() {
            return this.isCheckResoFail;
        }

        public QueryJobListResponseBodyJobListJobOutputTransConfig setIsCheckAudioBitrateFail(String isCheckAudioBitrateFail) {
            this.isCheckAudioBitrateFail = isCheckAudioBitrateFail;
            return this;
        }
        public String getIsCheckAudioBitrateFail() {
            return this.isCheckAudioBitrateFail;
        }

    }

    public static class QueryJobListResponseBodyJobListJobOutputEncryption extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("Key")
        public String key;

        @NameInMap("KeyType")
        public String keyType;

        @NameInMap("Id")
        public String id;

        @NameInMap("KeyUri")
        public String keyUri;

        @NameInMap("SkipCnt")
        public String skipCnt;

        public static QueryJobListResponseBodyJobListJobOutputEncryption build(java.util.Map<String, ?> map) throws Exception {
            QueryJobListResponseBodyJobListJobOutputEncryption self = new QueryJobListResponseBodyJobListJobOutputEncryption();
            return TeaModel.build(map, self);
        }

        public QueryJobListResponseBodyJobListJobOutputEncryption setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
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

        public QueryJobListResponseBodyJobListJobOutputEncryption setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
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

    }

    public static class QueryJobListResponseBodyJobListJobOutputWaterMarkListWaterMarkInputFile extends TeaModel {
        @NameInMap("Object")
        public String object;

        @NameInMap("Location")
        public String location;

        @NameInMap("Bucket")
        public String bucket;

        public static QueryJobListResponseBodyJobListJobOutputWaterMarkListWaterMarkInputFile build(java.util.Map<String, ?> map) throws Exception {
            QueryJobListResponseBodyJobListJobOutputWaterMarkListWaterMarkInputFile self = new QueryJobListResponseBodyJobListJobOutputWaterMarkListWaterMarkInputFile();
            return TeaModel.build(map, self);
        }

        public QueryJobListResponseBodyJobListJobOutputWaterMarkListWaterMarkInputFile setObject(String object) {
            this.object = object;
            return this;
        }
        public String getObject() {
            return this.object;
        }

        public QueryJobListResponseBodyJobListJobOutputWaterMarkListWaterMarkInputFile setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public QueryJobListResponseBodyJobListJobOutputWaterMarkListWaterMarkInputFile setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

    }

    public static class QueryJobListResponseBodyJobListJobOutputWaterMarkListWaterMark extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("ReferPos")
        public String referPos;

        @NameInMap("Dx")
        public String dx;

        @NameInMap("Width")
        public String width;

        @NameInMap("Height")
        public String height;

        @NameInMap("InputFile")
        public QueryJobListResponseBodyJobListJobOutputWaterMarkListWaterMarkInputFile inputFile;

        @NameInMap("WaterMarkTemplateId")
        public String waterMarkTemplateId;

        @NameInMap("Dy")
        public String dy;

        public static QueryJobListResponseBodyJobListJobOutputWaterMarkListWaterMark build(java.util.Map<String, ?> map) throws Exception {
            QueryJobListResponseBodyJobListJobOutputWaterMarkListWaterMark self = new QueryJobListResponseBodyJobListJobOutputWaterMarkListWaterMark();
            return TeaModel.build(map, self);
        }

        public QueryJobListResponseBodyJobListJobOutputWaterMarkListWaterMark setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public QueryJobListResponseBodyJobListJobOutputWaterMarkListWaterMark setReferPos(String referPos) {
            this.referPos = referPos;
            return this;
        }
        public String getReferPos() {
            return this.referPos;
        }

        public QueryJobListResponseBodyJobListJobOutputWaterMarkListWaterMark setDx(String dx) {
            this.dx = dx;
            return this;
        }
        public String getDx() {
            return this.dx;
        }

        public QueryJobListResponseBodyJobListJobOutputWaterMarkListWaterMark setWidth(String width) {
            this.width = width;
            return this;
        }
        public String getWidth() {
            return this.width;
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

        public QueryJobListResponseBodyJobListJobOutputWaterMarkListWaterMark setWaterMarkTemplateId(String waterMarkTemplateId) {
            this.waterMarkTemplateId = waterMarkTemplateId;
            return this;
        }
        public String getWaterMarkTemplateId() {
            return this.waterMarkTemplateId;
        }

        public QueryJobListResponseBodyJobListJobOutputWaterMarkListWaterMark setDy(String dy) {
            this.dy = dy;
            return this;
        }
        public String getDy() {
            return this.dy;
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

    public static class QueryJobListResponseBodyJobListJobOutputM3U8NonStandardSupportTS extends TeaModel {
        @NameInMap("SizeSupport")
        public Boolean sizeSupport;

        @NameInMap("Md5Support")
        public Boolean md5Support;

        public static QueryJobListResponseBodyJobListJobOutputM3U8NonStandardSupportTS build(java.util.Map<String, ?> map) throws Exception {
            QueryJobListResponseBodyJobListJobOutputM3U8NonStandardSupportTS self = new QueryJobListResponseBodyJobListJobOutputM3U8NonStandardSupportTS();
            return TeaModel.build(map, self);
        }

        public QueryJobListResponseBodyJobListJobOutputM3U8NonStandardSupportTS setSizeSupport(Boolean sizeSupport) {
            this.sizeSupport = sizeSupport;
            return this;
        }
        public Boolean getSizeSupport() {
            return this.sizeSupport;
        }

        public QueryJobListResponseBodyJobListJobOutputM3U8NonStandardSupportTS setMd5Support(Boolean md5Support) {
            this.md5Support = md5Support;
            return this;
        }
        public Boolean getMd5Support() {
            return this.md5Support;
        }

    }

    public static class QueryJobListResponseBodyJobListJobOutputM3U8NonStandardSupport extends TeaModel {
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

    public static class QueryJobListResponseBodyJobListJobOutputAudioVolume extends TeaModel {
        @NameInMap("Method")
        public String method;

        @NameInMap("Level")
        public String level;

        public static QueryJobListResponseBodyJobListJobOutputAudioVolume build(java.util.Map<String, ?> map) throws Exception {
            QueryJobListResponseBodyJobListJobOutputAudioVolume self = new QueryJobListResponseBodyJobListJobOutputAudioVolume();
            return TeaModel.build(map, self);
        }

        public QueryJobListResponseBodyJobListJobOutputAudioVolume setMethod(String method) {
            this.method = method;
            return this;
        }
        public String getMethod() {
            return this.method;
        }

        public QueryJobListResponseBodyJobListJobOutputAudioVolume setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

    }

    public static class QueryJobListResponseBodyJobListJobOutputAudio extends TeaModel {
        @NameInMap("Profile")
        public String profile;

        @NameInMap("Codec")
        public String codec;

        @NameInMap("Samplerate")
        public String samplerate;

        @NameInMap("Qscale")
        public String qscale;

        @NameInMap("Channels")
        public String channels;

        @NameInMap("Volume")
        public QueryJobListResponseBodyJobListJobOutputAudioVolume volume;

        @NameInMap("Bitrate")
        public String bitrate;

        public static QueryJobListResponseBodyJobListJobOutputAudio build(java.util.Map<String, ?> map) throws Exception {
            QueryJobListResponseBodyJobListJobOutputAudio self = new QueryJobListResponseBodyJobListJobOutputAudio();
            return TeaModel.build(map, self);
        }

        public QueryJobListResponseBodyJobListJobOutputAudio setProfile(String profile) {
            this.profile = profile;
            return this;
        }
        public String getProfile() {
            return this.profile;
        }

        public QueryJobListResponseBodyJobListJobOutputAudio setCodec(String codec) {
            this.codec = codec;
            return this;
        }
        public String getCodec() {
            return this.codec;
        }

        public QueryJobListResponseBodyJobListJobOutputAudio setSamplerate(String samplerate) {
            this.samplerate = samplerate;
            return this;
        }
        public String getSamplerate() {
            return this.samplerate;
        }

        public QueryJobListResponseBodyJobListJobOutputAudio setQscale(String qscale) {
            this.qscale = qscale;
            return this;
        }
        public String getQscale() {
            return this.qscale;
        }

        public QueryJobListResponseBodyJobListJobOutputAudio setChannels(String channels) {
            this.channels = channels;
            return this;
        }
        public String getChannels() {
            return this.channels;
        }

        public QueryJobListResponseBodyJobListJobOutputAudio setVolume(QueryJobListResponseBodyJobListJobOutputAudioVolume volume) {
            this.volume = volume;
            return this;
        }
        public QueryJobListResponseBodyJobListJobOutputAudioVolume getVolume() {
            return this.volume;
        }

        public QueryJobListResponseBodyJobListJobOutputAudio setBitrate(String bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public String getBitrate() {
            return this.bitrate;
        }

    }

    public static class QueryJobListResponseBodyJobListJobOutputMergeListMerge extends TeaModel {
        @NameInMap("Start")
        public String start;

        @NameInMap("RoleArn")
        public String roleArn;

        @NameInMap("MergeURL")
        public String mergeURL;

        @NameInMap("Duration")
        public String duration;

        public static QueryJobListResponseBodyJobListJobOutputMergeListMerge build(java.util.Map<String, ?> map) throws Exception {
            QueryJobListResponseBodyJobListJobOutputMergeListMerge self = new QueryJobListResponseBodyJobListJobOutputMergeListMerge();
            return TeaModel.build(map, self);
        }

        public QueryJobListResponseBodyJobListJobOutputMergeListMerge setStart(String start) {
            this.start = start;
            return this;
        }
        public String getStart() {
            return this.start;
        }

        public QueryJobListResponseBodyJobListJobOutputMergeListMerge setRoleArn(String roleArn) {
            this.roleArn = roleArn;
            return this;
        }
        public String getRoleArn() {
            return this.roleArn;
        }

        public QueryJobListResponseBodyJobListJobOutputMergeListMerge setMergeURL(String mergeURL) {
            this.mergeURL = mergeURL;
            return this;
        }
        public String getMergeURL() {
            return this.mergeURL;
        }

        public QueryJobListResponseBodyJobListJobOutputMergeListMerge setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
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

    public static class QueryJobListResponseBodyJobListJobOutputSuperReso extends TeaModel {
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

    public static class QueryJobListResponseBodyJobListJobOutputOutSubtitleListOutSubtitleOutSubtitleFile extends TeaModel {
        @NameInMap("RoleArn")
        public String roleArn;

        @NameInMap("Object")
        public String object;

        @NameInMap("Location")
        public String location;

        @NameInMap("Bucket")
        public String bucket;

        public static QueryJobListResponseBodyJobListJobOutputOutSubtitleListOutSubtitleOutSubtitleFile build(java.util.Map<String, ?> map) throws Exception {
            QueryJobListResponseBodyJobListJobOutputOutSubtitleListOutSubtitleOutSubtitleFile self = new QueryJobListResponseBodyJobListJobOutputOutSubtitleListOutSubtitleOutSubtitleFile();
            return TeaModel.build(map, self);
        }

        public QueryJobListResponseBodyJobListJobOutputOutSubtitleListOutSubtitleOutSubtitleFile setRoleArn(String roleArn) {
            this.roleArn = roleArn;
            return this;
        }
        public String getRoleArn() {
            return this.roleArn;
        }

        public QueryJobListResponseBodyJobListJobOutputOutSubtitleListOutSubtitleOutSubtitleFile setObject(String object) {
            this.object = object;
            return this;
        }
        public String getObject() {
            return this.object;
        }

        public QueryJobListResponseBodyJobListJobOutputOutSubtitleListOutSubtitleOutSubtitleFile setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public QueryJobListResponseBodyJobListJobOutputOutSubtitleListOutSubtitleOutSubtitleFile setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

    }

    public static class QueryJobListResponseBodyJobListJobOutputOutSubtitleListOutSubtitle extends TeaModel {
        @NameInMap("Map")
        public String map;

        @NameInMap("OutSubtitleFile")
        public QueryJobListResponseBodyJobListJobOutputOutSubtitleListOutSubtitleOutSubtitleFile outSubtitleFile;

        @NameInMap("Success")
        public Boolean success;

        @NameInMap("Message")
        public String message;

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

        public QueryJobListResponseBodyJobListJobOutputOutSubtitleListOutSubtitle setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
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
        @NameInMap("RoleArn")
        public String roleArn;

        @NameInMap("Object")
        public String object;

        @NameInMap("Location")
        public String location;

        @NameInMap("Bucket")
        public String bucket;

        public static QueryJobListResponseBodyJobListJobOutputOutputFile build(java.util.Map<String, ?> map) throws Exception {
            QueryJobListResponseBodyJobListJobOutputOutputFile self = new QueryJobListResponseBodyJobListJobOutputOutputFile();
            return TeaModel.build(map, self);
        }

        public QueryJobListResponseBodyJobListJobOutputOutputFile setRoleArn(String roleArn) {
            this.roleArn = roleArn;
            return this;
        }
        public String getRoleArn() {
            return this.roleArn;
        }

        public QueryJobListResponseBodyJobListJobOutputOutputFile setObject(String object) {
            this.object = object;
            return this;
        }
        public String getObject() {
            return this.object;
        }

        public QueryJobListResponseBodyJobListJobOutputOutputFile setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public QueryJobListResponseBodyJobListJobOutputOutputFile setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

    }

    public static class QueryJobListResponseBodyJobListJobOutputContainer extends TeaModel {
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

    public static class QueryJobListResponseBodyJobListJobOutputClipTimeSpan extends TeaModel {
        @NameInMap("Seek")
        public String seek;

        @NameInMap("Duration")
        public String duration;

        public static QueryJobListResponseBodyJobListJobOutputClipTimeSpan build(java.util.Map<String, ?> map) throws Exception {
            QueryJobListResponseBodyJobListJobOutputClipTimeSpan self = new QueryJobListResponseBodyJobListJobOutputClipTimeSpan();
            return TeaModel.build(map, self);
        }

        public QueryJobListResponseBodyJobListJobOutputClipTimeSpan setSeek(String seek) {
            this.seek = seek;
            return this;
        }
        public String getSeek() {
            return this.seek;
        }

        public QueryJobListResponseBodyJobListJobOutputClipTimeSpan setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

    }

    public static class QueryJobListResponseBodyJobListJobOutputClip extends TeaModel {
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

    public static class QueryJobListResponseBodyJobListJobOutputOpeningListOpening extends TeaModel {
        @NameInMap("openUrl")
        public String openUrl;

        @NameInMap("Start")
        public String start;

        @NameInMap("Width")
        public String width;

        @NameInMap("Height")
        public String height;

        public static QueryJobListResponseBodyJobListJobOutputOpeningListOpening build(java.util.Map<String, ?> map) throws Exception {
            QueryJobListResponseBodyJobListJobOutputOpeningListOpening self = new QueryJobListResponseBodyJobListJobOutputOpeningListOpening();
            return TeaModel.build(map, self);
        }

        public QueryJobListResponseBodyJobListJobOutputOpeningListOpening setOpenUrl(String openUrl) {
            this.openUrl = openUrl;
            return this;
        }
        public String getOpenUrl() {
            return this.openUrl;
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

        public QueryJobListResponseBodyJobListJobOutputOpeningListOpening setHeight(String height) {
            this.height = height;
            return this;
        }
        public String getHeight() {
            return this.height;
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

    public static class QueryJobListResponseBodyJobListJobOutputMuxConfigWebp extends TeaModel {
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

    public static class QueryJobListResponseBodyJobListJobOutputMuxConfigGif extends TeaModel {
        @NameInMap("FinalDelay")
        public String finalDelay;

        @NameInMap("DitherMode")
        public String ditherMode;

        @NameInMap("Loop")
        public String loop;

        @NameInMap("IsCustomPalette")
        public String isCustomPalette;

        public static QueryJobListResponseBodyJobListJobOutputMuxConfigGif build(java.util.Map<String, ?> map) throws Exception {
            QueryJobListResponseBodyJobListJobOutputMuxConfigGif self = new QueryJobListResponseBodyJobListJobOutputMuxConfigGif();
            return TeaModel.build(map, self);
        }

        public QueryJobListResponseBodyJobListJobOutputMuxConfigGif setFinalDelay(String finalDelay) {
            this.finalDelay = finalDelay;
            return this;
        }
        public String getFinalDelay() {
            return this.finalDelay;
        }

        public QueryJobListResponseBodyJobListJobOutputMuxConfigGif setDitherMode(String ditherMode) {
            this.ditherMode = ditherMode;
            return this;
        }
        public String getDitherMode() {
            return this.ditherMode;
        }

        public QueryJobListResponseBodyJobListJobOutputMuxConfigGif setLoop(String loop) {
            this.loop = loop;
            return this;
        }
        public String getLoop() {
            return this.loop;
        }

        public QueryJobListResponseBodyJobListJobOutputMuxConfigGif setIsCustomPalette(String isCustomPalette) {
            this.isCustomPalette = isCustomPalette;
            return this;
        }
        public String getIsCustomPalette() {
            return this.isCustomPalette;
        }

    }

    public static class QueryJobListResponseBodyJobListJobOutputMuxConfigSegment extends TeaModel {
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

    public static class QueryJobListResponseBodyJobListJobOutputMuxConfig extends TeaModel {
        @NameInMap("Webp")
        public QueryJobListResponseBodyJobListJobOutputMuxConfigWebp webp;

        @NameInMap("Gif")
        public QueryJobListResponseBodyJobListJobOutputMuxConfigGif gif;

        @NameInMap("Segment")
        public QueryJobListResponseBodyJobListJobOutputMuxConfigSegment segment;

        public static QueryJobListResponseBodyJobListJobOutputMuxConfig build(java.util.Map<String, ?> map) throws Exception {
            QueryJobListResponseBodyJobListJobOutputMuxConfig self = new QueryJobListResponseBodyJobListJobOutputMuxConfig();
            return TeaModel.build(map, self);
        }

        public QueryJobListResponseBodyJobListJobOutputMuxConfig setWebp(QueryJobListResponseBodyJobListJobOutputMuxConfigWebp webp) {
            this.webp = webp;
            return this;
        }
        public QueryJobListResponseBodyJobListJobOutputMuxConfigWebp getWebp() {
            return this.webp;
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

    }

    public static class QueryJobListResponseBodyJobListJobOutputTailSlateListTailSlate extends TeaModel {
        @NameInMap("Start")
        public String start;

        @NameInMap("BgColor")
        public String bgColor;

        @NameInMap("IsMergeAudio")
        public Boolean isMergeAudio;

        @NameInMap("Width")
        public String width;

        @NameInMap("Height")
        public String height;

        @NameInMap("BlendDuration")
        public String blendDuration;

        @NameInMap("TailUrl")
        public String tailUrl;

        public static QueryJobListResponseBodyJobListJobOutputTailSlateListTailSlate build(java.util.Map<String, ?> map) throws Exception {
            QueryJobListResponseBodyJobListJobOutputTailSlateListTailSlate self = new QueryJobListResponseBodyJobListJobOutputTailSlateListTailSlate();
            return TeaModel.build(map, self);
        }

        public QueryJobListResponseBodyJobListJobOutputTailSlateListTailSlate setStart(String start) {
            this.start = start;
            return this;
        }
        public String getStart() {
            return this.start;
        }

        public QueryJobListResponseBodyJobListJobOutputTailSlateListTailSlate setBgColor(String bgColor) {
            this.bgColor = bgColor;
            return this;
        }
        public String getBgColor() {
            return this.bgColor;
        }

        public QueryJobListResponseBodyJobListJobOutputTailSlateListTailSlate setIsMergeAudio(Boolean isMergeAudio) {
            this.isMergeAudio = isMergeAudio;
            return this;
        }
        public Boolean getIsMergeAudio() {
            return this.isMergeAudio;
        }

        public QueryJobListResponseBodyJobListJobOutputTailSlateListTailSlate setWidth(String width) {
            this.width = width;
            return this;
        }
        public String getWidth() {
            return this.width;
        }

        public QueryJobListResponseBodyJobListJobOutputTailSlateListTailSlate setHeight(String height) {
            this.height = height;
            return this;
        }
        public String getHeight() {
            return this.height;
        }

        public QueryJobListResponseBodyJobListJobOutputTailSlateListTailSlate setBlendDuration(String blendDuration) {
            this.blendDuration = blendDuration;
            return this;
        }
        public String getBlendDuration() {
            return this.blendDuration;
        }

        public QueryJobListResponseBodyJobListJobOutputTailSlateListTailSlate setTailUrl(String tailUrl) {
            this.tailUrl = tailUrl;
            return this;
        }
        public String getTailUrl() {
            return this.tailUrl;
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

    public static class QueryJobListResponseBodyJobListJobOutputSubtitleConfigExtSubtitleListExtSubtitleInput extends TeaModel {
        @NameInMap("Object")
        public String object;

        @NameInMap("Location")
        public String location;

        @NameInMap("Bucket")
        public String bucket;

        public static QueryJobListResponseBodyJobListJobOutputSubtitleConfigExtSubtitleListExtSubtitleInput build(java.util.Map<String, ?> map) throws Exception {
            QueryJobListResponseBodyJobListJobOutputSubtitleConfigExtSubtitleListExtSubtitleInput self = new QueryJobListResponseBodyJobListJobOutputSubtitleConfigExtSubtitleListExtSubtitleInput();
            return TeaModel.build(map, self);
        }

        public QueryJobListResponseBodyJobListJobOutputSubtitleConfigExtSubtitleListExtSubtitleInput setObject(String object) {
            this.object = object;
            return this;
        }
        public String getObject() {
            return this.object;
        }

        public QueryJobListResponseBodyJobListJobOutputSubtitleConfigExtSubtitleListExtSubtitleInput setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public QueryJobListResponseBodyJobListJobOutputSubtitleConfigExtSubtitleListExtSubtitleInput setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

    }

    public static class QueryJobListResponseBodyJobListJobOutputSubtitleConfigExtSubtitleListExtSubtitle extends TeaModel {
        @NameInMap("CharEnc")
        public String charEnc;

        @NameInMap("FontName")
        public String fontName;

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
        @NameInMap("ExtSubtitleList")
        public QueryJobListResponseBodyJobListJobOutputSubtitleConfigExtSubtitleList extSubtitleList;

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

    public static class QueryJobListResponseBodyJobListJobOutputPropertiesSourceLogosSourceLogo extends TeaModel {
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

    public static class QueryJobListResponseBodyJobListJobOutputPropertiesStreamsVideoStreamListVideoStreamNetworkCost extends TeaModel {
        @NameInMap("PreloadTime")
        public String preloadTime;

        @NameInMap("AvgBitrate")
        public String avgBitrate;

        @NameInMap("CostBandwidth")
        public String costBandwidth;

        public static QueryJobListResponseBodyJobListJobOutputPropertiesStreamsVideoStreamListVideoStreamNetworkCost build(java.util.Map<String, ?> map) throws Exception {
            QueryJobListResponseBodyJobListJobOutputPropertiesStreamsVideoStreamListVideoStreamNetworkCost self = new QueryJobListResponseBodyJobListJobOutputPropertiesStreamsVideoStreamListVideoStreamNetworkCost();
            return TeaModel.build(map, self);
        }

        public QueryJobListResponseBodyJobListJobOutputPropertiesStreamsVideoStreamListVideoStreamNetworkCost setPreloadTime(String preloadTime) {
            this.preloadTime = preloadTime;
            return this;
        }
        public String getPreloadTime() {
            return this.preloadTime;
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

    }

    public static class QueryJobListResponseBodyJobListJobOutputPropertiesStreamsVideoStreamListVideoStream extends TeaModel {
        @NameInMap("Index")
        public String index;

        @NameInMap("Timebase")
        public String timebase;

        @NameInMap("AvgFPS")
        public String avgFPS;

        @NameInMap("PixFmt")
        public String pixFmt;

        @NameInMap("Sar")
        public String sar;

        @NameInMap("Lang")
        public String lang;

        @NameInMap("CodecLongName")
        public String codecLongName;

        @NameInMap("Height")
        public String height;

        @NameInMap("NumFrames")
        public String numFrames;

        @NameInMap("Bitrate")
        public String bitrate;

        @NameInMap("CodecTagString")
        public String codecTagString;

        @NameInMap("HasBFrames")
        public String hasBFrames;

        @NameInMap("Profile")
        public String profile;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("NetworkCost")
        public QueryJobListResponseBodyJobListJobOutputPropertiesStreamsVideoStreamListVideoStreamNetworkCost networkCost;

        @NameInMap("Dar")
        public String dar;

        @NameInMap("CodecName")
        public String codecName;

        @NameInMap("Width")
        public String width;

        @NameInMap("Duration")
        public String duration;

        @NameInMap("Fps")
        public String fps;

        @NameInMap("CodecTag")
        public String codecTag;

        @NameInMap("CodecTimeBase")
        public String codecTimeBase;

        @NameInMap("Level")
        public String level;

        public static QueryJobListResponseBodyJobListJobOutputPropertiesStreamsVideoStreamListVideoStream build(java.util.Map<String, ?> map) throws Exception {
            QueryJobListResponseBodyJobListJobOutputPropertiesStreamsVideoStreamListVideoStream self = new QueryJobListResponseBodyJobListJobOutputPropertiesStreamsVideoStreamListVideoStream();
            return TeaModel.build(map, self);
        }

        public QueryJobListResponseBodyJobListJobOutputPropertiesStreamsVideoStreamListVideoStream setIndex(String index) {
            this.index = index;
            return this;
        }
        public String getIndex() {
            return this.index;
        }

        public QueryJobListResponseBodyJobListJobOutputPropertiesStreamsVideoStreamListVideoStream setTimebase(String timebase) {
            this.timebase = timebase;
            return this;
        }
        public String getTimebase() {
            return this.timebase;
        }

        public QueryJobListResponseBodyJobListJobOutputPropertiesStreamsVideoStreamListVideoStream setAvgFPS(String avgFPS) {
            this.avgFPS = avgFPS;
            return this;
        }
        public String getAvgFPS() {
            return this.avgFPS;
        }

        public QueryJobListResponseBodyJobListJobOutputPropertiesStreamsVideoStreamListVideoStream setPixFmt(String pixFmt) {
            this.pixFmt = pixFmt;
            return this;
        }
        public String getPixFmt() {
            return this.pixFmt;
        }

        public QueryJobListResponseBodyJobListJobOutputPropertiesStreamsVideoStreamListVideoStream setSar(String sar) {
            this.sar = sar;
            return this;
        }
        public String getSar() {
            return this.sar;
        }

        public QueryJobListResponseBodyJobListJobOutputPropertiesStreamsVideoStreamListVideoStream setLang(String lang) {
            this.lang = lang;
            return this;
        }
        public String getLang() {
            return this.lang;
        }

        public QueryJobListResponseBodyJobListJobOutputPropertiesStreamsVideoStreamListVideoStream setCodecLongName(String codecLongName) {
            this.codecLongName = codecLongName;
            return this;
        }
        public String getCodecLongName() {
            return this.codecLongName;
        }

        public QueryJobListResponseBodyJobListJobOutputPropertiesStreamsVideoStreamListVideoStream setHeight(String height) {
            this.height = height;
            return this;
        }
        public String getHeight() {
            return this.height;
        }

        public QueryJobListResponseBodyJobListJobOutputPropertiesStreamsVideoStreamListVideoStream setNumFrames(String numFrames) {
            this.numFrames = numFrames;
            return this;
        }
        public String getNumFrames() {
            return this.numFrames;
        }

        public QueryJobListResponseBodyJobListJobOutputPropertiesStreamsVideoStreamListVideoStream setBitrate(String bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public String getBitrate() {
            return this.bitrate;
        }

        public QueryJobListResponseBodyJobListJobOutputPropertiesStreamsVideoStreamListVideoStream setCodecTagString(String codecTagString) {
            this.codecTagString = codecTagString;
            return this;
        }
        public String getCodecTagString() {
            return this.codecTagString;
        }

        public QueryJobListResponseBodyJobListJobOutputPropertiesStreamsVideoStreamListVideoStream setHasBFrames(String hasBFrames) {
            this.hasBFrames = hasBFrames;
            return this;
        }
        public String getHasBFrames() {
            return this.hasBFrames;
        }

        public QueryJobListResponseBodyJobListJobOutputPropertiesStreamsVideoStreamListVideoStream setProfile(String profile) {
            this.profile = profile;
            return this;
        }
        public String getProfile() {
            return this.profile;
        }

        public QueryJobListResponseBodyJobListJobOutputPropertiesStreamsVideoStreamListVideoStream setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public QueryJobListResponseBodyJobListJobOutputPropertiesStreamsVideoStreamListVideoStream setNetworkCost(QueryJobListResponseBodyJobListJobOutputPropertiesStreamsVideoStreamListVideoStreamNetworkCost networkCost) {
            this.networkCost = networkCost;
            return this;
        }
        public QueryJobListResponseBodyJobListJobOutputPropertiesStreamsVideoStreamListVideoStreamNetworkCost getNetworkCost() {
            return this.networkCost;
        }

        public QueryJobListResponseBodyJobListJobOutputPropertiesStreamsVideoStreamListVideoStream setDar(String dar) {
            this.dar = dar;
            return this;
        }
        public String getDar() {
            return this.dar;
        }

        public QueryJobListResponseBodyJobListJobOutputPropertiesStreamsVideoStreamListVideoStream setCodecName(String codecName) {
            this.codecName = codecName;
            return this;
        }
        public String getCodecName() {
            return this.codecName;
        }

        public QueryJobListResponseBodyJobListJobOutputPropertiesStreamsVideoStreamListVideoStream setWidth(String width) {
            this.width = width;
            return this;
        }
        public String getWidth() {
            return this.width;
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

        public QueryJobListResponseBodyJobListJobOutputPropertiesStreamsVideoStreamListVideoStream setCodecTag(String codecTag) {
            this.codecTag = codecTag;
            return this;
        }
        public String getCodecTag() {
            return this.codecTag;
        }

        public QueryJobListResponseBodyJobListJobOutputPropertiesStreamsVideoStreamListVideoStream setCodecTimeBase(String codecTimeBase) {
            this.codecTimeBase = codecTimeBase;
            return this;
        }
        public String getCodecTimeBase() {
            return this.codecTimeBase;
        }

        public QueryJobListResponseBodyJobListJobOutputPropertiesStreamsVideoStreamListVideoStream setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
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

    public static class QueryJobListResponseBodyJobListJobOutputPropertiesStreamsAudioStreamListAudioStream extends TeaModel {
        @NameInMap("Timebase")
        public String timebase;

        @NameInMap("Index")
        public String index;

        @NameInMap("SampleFmt")
        public String sampleFmt;

        @NameInMap("ChannelLayout")
        public String channelLayout;

        @NameInMap("Lang")
        public String lang;

        @NameInMap("Samplerate")
        public String samplerate;

        @NameInMap("CodecLongName")
        public String codecLongName;

        @NameInMap("Channels")
        public String channels;

        @NameInMap("NumFrames")
        public String numFrames;

        @NameInMap("Bitrate")
        public String bitrate;

        @NameInMap("CodecTagString")
        public String codecTagString;

        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("CodecName")
        public String codecName;

        @NameInMap("Duration")
        public String duration;

        @NameInMap("CodecTag")
        public String codecTag;

        @NameInMap("CodecTimeBase")
        public String codecTimeBase;

        public static QueryJobListResponseBodyJobListJobOutputPropertiesStreamsAudioStreamListAudioStream build(java.util.Map<String, ?> map) throws Exception {
            QueryJobListResponseBodyJobListJobOutputPropertiesStreamsAudioStreamListAudioStream self = new QueryJobListResponseBodyJobListJobOutputPropertiesStreamsAudioStreamListAudioStream();
            return TeaModel.build(map, self);
        }

        public QueryJobListResponseBodyJobListJobOutputPropertiesStreamsAudioStreamListAudioStream setTimebase(String timebase) {
            this.timebase = timebase;
            return this;
        }
        public String getTimebase() {
            return this.timebase;
        }

        public QueryJobListResponseBodyJobListJobOutputPropertiesStreamsAudioStreamListAudioStream setIndex(String index) {
            this.index = index;
            return this;
        }
        public String getIndex() {
            return this.index;
        }

        public QueryJobListResponseBodyJobListJobOutputPropertiesStreamsAudioStreamListAudioStream setSampleFmt(String sampleFmt) {
            this.sampleFmt = sampleFmt;
            return this;
        }
        public String getSampleFmt() {
            return this.sampleFmt;
        }

        public QueryJobListResponseBodyJobListJobOutputPropertiesStreamsAudioStreamListAudioStream setChannelLayout(String channelLayout) {
            this.channelLayout = channelLayout;
            return this;
        }
        public String getChannelLayout() {
            return this.channelLayout;
        }

        public QueryJobListResponseBodyJobListJobOutputPropertiesStreamsAudioStreamListAudioStream setLang(String lang) {
            this.lang = lang;
            return this;
        }
        public String getLang() {
            return this.lang;
        }

        public QueryJobListResponseBodyJobListJobOutputPropertiesStreamsAudioStreamListAudioStream setSamplerate(String samplerate) {
            this.samplerate = samplerate;
            return this;
        }
        public String getSamplerate() {
            return this.samplerate;
        }

        public QueryJobListResponseBodyJobListJobOutputPropertiesStreamsAudioStreamListAudioStream setCodecLongName(String codecLongName) {
            this.codecLongName = codecLongName;
            return this;
        }
        public String getCodecLongName() {
            return this.codecLongName;
        }

        public QueryJobListResponseBodyJobListJobOutputPropertiesStreamsAudioStreamListAudioStream setChannels(String channels) {
            this.channels = channels;
            return this;
        }
        public String getChannels() {
            return this.channels;
        }

        public QueryJobListResponseBodyJobListJobOutputPropertiesStreamsAudioStreamListAudioStream setNumFrames(String numFrames) {
            this.numFrames = numFrames;
            return this;
        }
        public String getNumFrames() {
            return this.numFrames;
        }

        public QueryJobListResponseBodyJobListJobOutputPropertiesStreamsAudioStreamListAudioStream setBitrate(String bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public String getBitrate() {
            return this.bitrate;
        }

        public QueryJobListResponseBodyJobListJobOutputPropertiesStreamsAudioStreamListAudioStream setCodecTagString(String codecTagString) {
            this.codecTagString = codecTagString;
            return this;
        }
        public String getCodecTagString() {
            return this.codecTagString;
        }

        public QueryJobListResponseBodyJobListJobOutputPropertiesStreamsAudioStreamListAudioStream setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public QueryJobListResponseBodyJobListJobOutputPropertiesStreamsAudioStreamListAudioStream setCodecName(String codecName) {
            this.codecName = codecName;
            return this;
        }
        public String getCodecName() {
            return this.codecName;
        }

        public QueryJobListResponseBodyJobListJobOutputPropertiesStreamsAudioStreamListAudioStream setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public QueryJobListResponseBodyJobListJobOutputPropertiesStreamsAudioStreamListAudioStream setCodecTag(String codecTag) {
            this.codecTag = codecTag;
            return this;
        }
        public String getCodecTag() {
            return this.codecTag;
        }

        public QueryJobListResponseBodyJobListJobOutputPropertiesStreamsAudioStreamListAudioStream setCodecTimeBase(String codecTimeBase) {
            this.codecTimeBase = codecTimeBase;
            return this;
        }
        public String getCodecTimeBase() {
            return this.codecTimeBase;
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
        @NameInMap("Index")
        public String index;

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

    public static class QueryJobListResponseBodyJobListJobOutputPropertiesStreams extends TeaModel {
        @NameInMap("VideoStreamList")
        public QueryJobListResponseBodyJobListJobOutputPropertiesStreamsVideoStreamList videoStreamList;

        @NameInMap("AudioStreamList")
        public QueryJobListResponseBodyJobListJobOutputPropertiesStreamsAudioStreamList audioStreamList;

        @NameInMap("SubtitleStreamList")
        public QueryJobListResponseBodyJobListJobOutputPropertiesStreamsSubtitleStreamList subtitleStreamList;

        public static QueryJobListResponseBodyJobListJobOutputPropertiesStreams build(java.util.Map<String, ?> map) throws Exception {
            QueryJobListResponseBodyJobListJobOutputPropertiesStreams self = new QueryJobListResponseBodyJobListJobOutputPropertiesStreams();
            return TeaModel.build(map, self);
        }

        public QueryJobListResponseBodyJobListJobOutputPropertiesStreams setVideoStreamList(QueryJobListResponseBodyJobListJobOutputPropertiesStreamsVideoStreamList videoStreamList) {
            this.videoStreamList = videoStreamList;
            return this;
        }
        public QueryJobListResponseBodyJobListJobOutputPropertiesStreamsVideoStreamList getVideoStreamList() {
            return this.videoStreamList;
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

    }

    public static class QueryJobListResponseBodyJobListJobOutputPropertiesFormat extends TeaModel {
        @NameInMap("StartTime")
        public String startTime;

        @NameInMap("NumPrograms")
        public String numPrograms;

        @NameInMap("Size")
        public String size;

        @NameInMap("NumStreams")
        public String numStreams;

        @NameInMap("FormatLongName")
        public String formatLongName;

        @NameInMap("Duration")
        public String duration;

        @NameInMap("Bitrate")
        public String bitrate;

        @NameInMap("FormatName")
        public String formatName;

        public static QueryJobListResponseBodyJobListJobOutputPropertiesFormat build(java.util.Map<String, ?> map) throws Exception {
            QueryJobListResponseBodyJobListJobOutputPropertiesFormat self = new QueryJobListResponseBodyJobListJobOutputPropertiesFormat();
            return TeaModel.build(map, self);
        }

        public QueryJobListResponseBodyJobListJobOutputPropertiesFormat setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public QueryJobListResponseBodyJobListJobOutputPropertiesFormat setNumPrograms(String numPrograms) {
            this.numPrograms = numPrograms;
            return this;
        }
        public String getNumPrograms() {
            return this.numPrograms;
        }

        public QueryJobListResponseBodyJobListJobOutputPropertiesFormat setSize(String size) {
            this.size = size;
            return this;
        }
        public String getSize() {
            return this.size;
        }

        public QueryJobListResponseBodyJobListJobOutputPropertiesFormat setNumStreams(String numStreams) {
            this.numStreams = numStreams;
            return this;
        }
        public String getNumStreams() {
            return this.numStreams;
        }

        public QueryJobListResponseBodyJobListJobOutputPropertiesFormat setFormatLongName(String formatLongName) {
            this.formatLongName = formatLongName;
            return this;
        }
        public String getFormatLongName() {
            return this.formatLongName;
        }

        public QueryJobListResponseBodyJobListJobOutputPropertiesFormat setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public QueryJobListResponseBodyJobListJobOutputPropertiesFormat setBitrate(String bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public String getBitrate() {
            return this.bitrate;
        }

        public QueryJobListResponseBodyJobListJobOutputPropertiesFormat setFormatName(String formatName) {
            this.formatName = formatName;
            return this;
        }
        public String getFormatName() {
            return this.formatName;
        }

    }

    public static class QueryJobListResponseBodyJobListJobOutputProperties extends TeaModel {
        @NameInMap("Width")
        public String width;

        @NameInMap("Height")
        public String height;

        @NameInMap("SourceLogos")
        public QueryJobListResponseBodyJobListJobOutputPropertiesSourceLogos sourceLogos;

        @NameInMap("Duration")
        public String duration;

        @NameInMap("Fps")
        public String fps;

        @NameInMap("Bitrate")
        public String bitrate;

        @NameInMap("FileFormat")
        public String fileFormat;

        @NameInMap("Streams")
        public QueryJobListResponseBodyJobListJobOutputPropertiesStreams streams;

        @NameInMap("Format")
        public QueryJobListResponseBodyJobListJobOutputPropertiesFormat format;

        @NameInMap("FileSize")
        public String fileSize;

        public static QueryJobListResponseBodyJobListJobOutputProperties build(java.util.Map<String, ?> map) throws Exception {
            QueryJobListResponseBodyJobListJobOutputProperties self = new QueryJobListResponseBodyJobListJobOutputProperties();
            return TeaModel.build(map, self);
        }

        public QueryJobListResponseBodyJobListJobOutputProperties setWidth(String width) {
            this.width = width;
            return this;
        }
        public String getWidth() {
            return this.width;
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

        public QueryJobListResponseBodyJobListJobOutputProperties setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public QueryJobListResponseBodyJobListJobOutputProperties setFps(String fps) {
            this.fps = fps;
            return this;
        }
        public String getFps() {
            return this.fps;
        }

        public QueryJobListResponseBodyJobListJobOutputProperties setBitrate(String bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public String getBitrate() {
            return this.bitrate;
        }

        public QueryJobListResponseBodyJobListJobOutputProperties setFileFormat(String fileFormat) {
            this.fileFormat = fileFormat;
            return this;
        }
        public String getFileFormat() {
            return this.fileFormat;
        }

        public QueryJobListResponseBodyJobListJobOutputProperties setStreams(QueryJobListResponseBodyJobListJobOutputPropertiesStreams streams) {
            this.streams = streams;
            return this;
        }
        public QueryJobListResponseBodyJobListJobOutputPropertiesStreams getStreams() {
            return this.streams;
        }

        public QueryJobListResponseBodyJobListJobOutputProperties setFormat(QueryJobListResponseBodyJobListJobOutputPropertiesFormat format) {
            this.format = format;
            return this;
        }
        public QueryJobListResponseBodyJobListJobOutputPropertiesFormat getFormat() {
            return this.format;
        }

        public QueryJobListResponseBodyJobListJobOutputProperties setFileSize(String fileSize) {
            this.fileSize = fileSize;
            return this;
        }
        public String getFileSize() {
            return this.fileSize;
        }

    }

    public static class QueryJobListResponseBodyJobListJobOutput extends TeaModel {
        @NameInMap("Video")
        public QueryJobListResponseBodyJobListJobOutputVideo video;

        @NameInMap("TransConfig")
        public QueryJobListResponseBodyJobListJobOutputTransConfig transConfig;

        @NameInMap("Encryption")
        public QueryJobListResponseBodyJobListJobOutputEncryption encryption;

        @NameInMap("WaterMarkList")
        public QueryJobListResponseBodyJobListJobOutputWaterMarkList waterMarkList;

        @NameInMap("WaterMarkConfigUrl")
        public String waterMarkConfigUrl;

        @NameInMap("DeWatermark")
        public String deWatermark;

        @NameInMap("M3U8NonStandardSupport")
        public QueryJobListResponseBodyJobListJobOutputM3U8NonStandardSupport m3U8NonStandardSupport;

        @NameInMap("Priority")
        public String priority;

        @NameInMap("Audio")
        public QueryJobListResponseBodyJobListJobOutputAudio audio;

        @NameInMap("AudioStreamMap")
        public String audioStreamMap;

        @NameInMap("MergeList")
        public QueryJobListResponseBodyJobListJobOutputMergeList mergeList;

        @NameInMap("SuperReso")
        public QueryJobListResponseBodyJobListJobOutputSuperReso superReso;

        @NameInMap("UserData")
        public String userData;

        @NameInMap("OutSubtitleList")
        public QueryJobListResponseBodyJobListJobOutputOutSubtitleList outSubtitleList;

        @NameInMap("VideoStreamMap")
        public String videoStreamMap;

        @NameInMap("OutputFile")
        public QueryJobListResponseBodyJobListJobOutputOutputFile outputFile;

        @NameInMap("Rotate")
        public String rotate;

        @NameInMap("Container")
        public QueryJobListResponseBodyJobListJobOutputContainer container;

        @NameInMap("Clip")
        public QueryJobListResponseBodyJobListJobOutputClip clip;

        @NameInMap("MergeConfigUrl")
        public String mergeConfigUrl;

        @NameInMap("OpeningList")
        public QueryJobListResponseBodyJobListJobOutputOpeningList openingList;

        @NameInMap("MuxConfig")
        public QueryJobListResponseBodyJobListJobOutputMuxConfig muxConfig;

        @NameInMap("TailSlateList")
        public QueryJobListResponseBodyJobListJobOutputTailSlateList tailSlateList;

        @NameInMap("TemplateId")
        public String templateId;

        @NameInMap("SubtitleConfig")
        public QueryJobListResponseBodyJobListJobOutputSubtitleConfig subtitleConfig;

        @NameInMap("Properties")
        public QueryJobListResponseBodyJobListJobOutputProperties properties;

        public static QueryJobListResponseBodyJobListJobOutput build(java.util.Map<String, ?> map) throws Exception {
            QueryJobListResponseBodyJobListJobOutput self = new QueryJobListResponseBodyJobListJobOutput();
            return TeaModel.build(map, self);
        }

        public QueryJobListResponseBodyJobListJobOutput setVideo(QueryJobListResponseBodyJobListJobOutputVideo video) {
            this.video = video;
            return this;
        }
        public QueryJobListResponseBodyJobListJobOutputVideo getVideo() {
            return this.video;
        }

        public QueryJobListResponseBodyJobListJobOutput setTransConfig(QueryJobListResponseBodyJobListJobOutputTransConfig transConfig) {
            this.transConfig = transConfig;
            return this;
        }
        public QueryJobListResponseBodyJobListJobOutputTransConfig getTransConfig() {
            return this.transConfig;
        }

        public QueryJobListResponseBodyJobListJobOutput setEncryption(QueryJobListResponseBodyJobListJobOutputEncryption encryption) {
            this.encryption = encryption;
            return this;
        }
        public QueryJobListResponseBodyJobListJobOutputEncryption getEncryption() {
            return this.encryption;
        }

        public QueryJobListResponseBodyJobListJobOutput setWaterMarkList(QueryJobListResponseBodyJobListJobOutputWaterMarkList waterMarkList) {
            this.waterMarkList = waterMarkList;
            return this;
        }
        public QueryJobListResponseBodyJobListJobOutputWaterMarkList getWaterMarkList() {
            return this.waterMarkList;
        }

        public QueryJobListResponseBodyJobListJobOutput setWaterMarkConfigUrl(String waterMarkConfigUrl) {
            this.waterMarkConfigUrl = waterMarkConfigUrl;
            return this;
        }
        public String getWaterMarkConfigUrl() {
            return this.waterMarkConfigUrl;
        }

        public QueryJobListResponseBodyJobListJobOutput setDeWatermark(String deWatermark) {
            this.deWatermark = deWatermark;
            return this;
        }
        public String getDeWatermark() {
            return this.deWatermark;
        }

        public QueryJobListResponseBodyJobListJobOutput setM3U8NonStandardSupport(QueryJobListResponseBodyJobListJobOutputM3U8NonStandardSupport m3U8NonStandardSupport) {
            this.m3U8NonStandardSupport = m3U8NonStandardSupport;
            return this;
        }
        public QueryJobListResponseBodyJobListJobOutputM3U8NonStandardSupport getM3U8NonStandardSupport() {
            return this.m3U8NonStandardSupport;
        }

        public QueryJobListResponseBodyJobListJobOutput setPriority(String priority) {
            this.priority = priority;
            return this;
        }
        public String getPriority() {
            return this.priority;
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

        public QueryJobListResponseBodyJobListJobOutput setMergeList(QueryJobListResponseBodyJobListJobOutputMergeList mergeList) {
            this.mergeList = mergeList;
            return this;
        }
        public QueryJobListResponseBodyJobListJobOutputMergeList getMergeList() {
            return this.mergeList;
        }

        public QueryJobListResponseBodyJobListJobOutput setSuperReso(QueryJobListResponseBodyJobListJobOutputSuperReso superReso) {
            this.superReso = superReso;
            return this;
        }
        public QueryJobListResponseBodyJobListJobOutputSuperReso getSuperReso() {
            return this.superReso;
        }

        public QueryJobListResponseBodyJobListJobOutput setUserData(String userData) {
            this.userData = userData;
            return this;
        }
        public String getUserData() {
            return this.userData;
        }

        public QueryJobListResponseBodyJobListJobOutput setOutSubtitleList(QueryJobListResponseBodyJobListJobOutputOutSubtitleList outSubtitleList) {
            this.outSubtitleList = outSubtitleList;
            return this;
        }
        public QueryJobListResponseBodyJobListJobOutputOutSubtitleList getOutSubtitleList() {
            return this.outSubtitleList;
        }

        public QueryJobListResponseBodyJobListJobOutput setVideoStreamMap(String videoStreamMap) {
            this.videoStreamMap = videoStreamMap;
            return this;
        }
        public String getVideoStreamMap() {
            return this.videoStreamMap;
        }

        public QueryJobListResponseBodyJobListJobOutput setOutputFile(QueryJobListResponseBodyJobListJobOutputOutputFile outputFile) {
            this.outputFile = outputFile;
            return this;
        }
        public QueryJobListResponseBodyJobListJobOutputOutputFile getOutputFile() {
            return this.outputFile;
        }

        public QueryJobListResponseBodyJobListJobOutput setRotate(String rotate) {
            this.rotate = rotate;
            return this;
        }
        public String getRotate() {
            return this.rotate;
        }

        public QueryJobListResponseBodyJobListJobOutput setContainer(QueryJobListResponseBodyJobListJobOutputContainer container) {
            this.container = container;
            return this;
        }
        public QueryJobListResponseBodyJobListJobOutputContainer getContainer() {
            return this.container;
        }

        public QueryJobListResponseBodyJobListJobOutput setClip(QueryJobListResponseBodyJobListJobOutputClip clip) {
            this.clip = clip;
            return this;
        }
        public QueryJobListResponseBodyJobListJobOutputClip getClip() {
            return this.clip;
        }

        public QueryJobListResponseBodyJobListJobOutput setMergeConfigUrl(String mergeConfigUrl) {
            this.mergeConfigUrl = mergeConfigUrl;
            return this;
        }
        public String getMergeConfigUrl() {
            return this.mergeConfigUrl;
        }

        public QueryJobListResponseBodyJobListJobOutput setOpeningList(QueryJobListResponseBodyJobListJobOutputOpeningList openingList) {
            this.openingList = openingList;
            return this;
        }
        public QueryJobListResponseBodyJobListJobOutputOpeningList getOpeningList() {
            return this.openingList;
        }

        public QueryJobListResponseBodyJobListJobOutput setMuxConfig(QueryJobListResponseBodyJobListJobOutputMuxConfig muxConfig) {
            this.muxConfig = muxConfig;
            return this;
        }
        public QueryJobListResponseBodyJobListJobOutputMuxConfig getMuxConfig() {
            return this.muxConfig;
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

        public QueryJobListResponseBodyJobListJobOutput setSubtitleConfig(QueryJobListResponseBodyJobListJobOutputSubtitleConfig subtitleConfig) {
            this.subtitleConfig = subtitleConfig;
            return this;
        }
        public QueryJobListResponseBodyJobListJobOutputSubtitleConfig getSubtitleConfig() {
            return this.subtitleConfig;
        }

        public QueryJobListResponseBodyJobListJobOutput setProperties(QueryJobListResponseBodyJobListJobOutputProperties properties) {
            this.properties = properties;
            return this;
        }
        public QueryJobListResponseBodyJobListJobOutputProperties getProperties() {
            return this.properties;
        }

    }

    public static class QueryJobListResponseBodyJobListJobInput extends TeaModel {
        @NameInMap("Object")
        public String object;

        @NameInMap("Location")
        public String location;

        @NameInMap("Bucket")
        public String bucket;

        public static QueryJobListResponseBodyJobListJobInput build(java.util.Map<String, ?> map) throws Exception {
            QueryJobListResponseBodyJobListJobInput self = new QueryJobListResponseBodyJobListJobInput();
            return TeaModel.build(map, self);
        }

        public QueryJobListResponseBodyJobListJobInput setObject(String object) {
            this.object = object;
            return this;
        }
        public String getObject() {
            return this.object;
        }

        public QueryJobListResponseBodyJobListJobInput setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public QueryJobListResponseBodyJobListJobInput setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

    }

    public static class QueryJobListResponseBodyJobListJobMNSMessageResult extends TeaModel {
        @NameInMap("MessageId")
        public String messageId;

        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("ErrorCode")
        public String errorCode;

        public static QueryJobListResponseBodyJobListJobMNSMessageResult build(java.util.Map<String, ?> map) throws Exception {
            QueryJobListResponseBodyJobListJobMNSMessageResult self = new QueryJobListResponseBodyJobListJobMNSMessageResult();
            return TeaModel.build(map, self);
        }

        public QueryJobListResponseBodyJobListJobMNSMessageResult setMessageId(String messageId) {
            this.messageId = messageId;
            return this;
        }
        public String getMessageId() {
            return this.messageId;
        }

        public QueryJobListResponseBodyJobListJobMNSMessageResult setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public QueryJobListResponseBodyJobListJobMNSMessageResult setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

    }

    public static class QueryJobListResponseBodyJobListJob extends TeaModel {
        @NameInMap("CreationTime")
        public String creationTime;

        @NameInMap("Percent")
        public Long percent;

        @NameInMap("FinishTime")
        public String finishTime;

        @NameInMap("State")
        public String state;

        @NameInMap("JobId")
        public String jobId;

        @NameInMap("Code")
        public String code;

        @NameInMap("Message")
        public String message;

        @NameInMap("Output")
        public QueryJobListResponseBodyJobListJobOutput output;

        @NameInMap("PipelineId")
        public String pipelineId;

        @NameInMap("Input")
        public QueryJobListResponseBodyJobListJobInput input;

        @NameInMap("MNSMessageResult")
        public QueryJobListResponseBodyJobListJobMNSMessageResult MNSMessageResult;

        public static QueryJobListResponseBodyJobListJob build(java.util.Map<String, ?> map) throws Exception {
            QueryJobListResponseBodyJobListJob self = new QueryJobListResponseBodyJobListJob();
            return TeaModel.build(map, self);
        }

        public QueryJobListResponseBodyJobListJob setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public QueryJobListResponseBodyJobListJob setPercent(Long percent) {
            this.percent = percent;
            return this;
        }
        public Long getPercent() {
            return this.percent;
        }

        public QueryJobListResponseBodyJobListJob setFinishTime(String finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public String getFinishTime() {
            return this.finishTime;
        }

        public QueryJobListResponseBodyJobListJob setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public QueryJobListResponseBodyJobListJob setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public QueryJobListResponseBodyJobListJob setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
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

        public QueryJobListResponseBodyJobListJob setPipelineId(String pipelineId) {
            this.pipelineId = pipelineId;
            return this;
        }
        public String getPipelineId() {
            return this.pipelineId;
        }

        public QueryJobListResponseBodyJobListJob setInput(QueryJobListResponseBodyJobListJobInput input) {
            this.input = input;
            return this;
        }
        public QueryJobListResponseBodyJobListJobInput getInput() {
            return this.input;
        }

        public QueryJobListResponseBodyJobListJob setMNSMessageResult(QueryJobListResponseBodyJobListJobMNSMessageResult MNSMessageResult) {
            this.MNSMessageResult = MNSMessageResult;
            return this;
        }
        public QueryJobListResponseBodyJobListJobMNSMessageResult getMNSMessageResult() {
            return this.MNSMessageResult;
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

}
