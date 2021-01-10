// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class SubmitJobsResponseBody extends TeaModel {
    @NameInMap("JobResultList")
    public SubmitJobsResponseBodyJobResultList jobResultList;

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

    public static class SubmitJobsResponseBodyJobResultListJobResultJobOutputVideoBitrateBnd extends TeaModel {
        @NameInMap("Max")
        public String max;

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
        @NameInMap("Bufsize")
        public String bufsize;

        @NameInMap("Degrain")
        public String degrain;

        @NameInMap("BitrateBnd")
        public SubmitJobsResponseBodyJobResultListJobResultJobOutputVideoBitrateBnd bitrateBnd;

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

        public static SubmitJobsResponseBodyJobResultListJobResultJobOutputVideo build(java.util.Map<String, ?> map) throws Exception {
            SubmitJobsResponseBodyJobResultListJobResultJobOutputVideo self = new SubmitJobsResponseBodyJobResultListJobResultJobOutputVideo();
            return TeaModel.build(map, self);
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputVideo setBufsize(String bufsize) {
            this.bufsize = bufsize;
            return this;
        }
        public String getBufsize() {
            return this.bufsize;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputVideo setDegrain(String degrain) {
            this.degrain = degrain;
            return this;
        }
        public String getDegrain() {
            return this.degrain;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputVideo setBitrateBnd(SubmitJobsResponseBodyJobResultListJobResultJobOutputVideoBitrateBnd bitrateBnd) {
            this.bitrateBnd = bitrateBnd;
            return this;
        }
        public SubmitJobsResponseBodyJobResultListJobResultJobOutputVideoBitrateBnd getBitrateBnd() {
            return this.bitrateBnd;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputVideo setPixFmt(String pixFmt) {
            this.pixFmt = pixFmt;
            return this;
        }
        public String getPixFmt() {
            return this.pixFmt;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputVideo setPad(String pad) {
            this.pad = pad;
            return this;
        }
        public String getPad() {
            return this.pad;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputVideo setCodec(String codec) {
            this.codec = codec;
            return this;
        }
        public String getCodec() {
            return this.codec;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputVideo setHeight(String height) {
            this.height = height;
            return this;
        }
        public String getHeight() {
            return this.height;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputVideo setQscale(String qscale) {
            this.qscale = qscale;
            return this;
        }
        public String getQscale() {
            return this.qscale;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputVideo setCrop(String crop) {
            this.crop = crop;
            return this;
        }
        public String getCrop() {
            return this.crop;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputVideo setBitrate(String bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public String getBitrate() {
            return this.bitrate;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputVideo setMaxrate(String maxrate) {
            this.maxrate = maxrate;
            return this;
        }
        public String getMaxrate() {
            return this.maxrate;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputVideo setMaxFps(String maxFps) {
            this.maxFps = maxFps;
            return this;
        }
        public String getMaxFps() {
            return this.maxFps;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputVideo setProfile(String profile) {
            this.profile = profile;
            return this;
        }
        public String getProfile() {
            return this.profile;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputVideo setCrf(String crf) {
            this.crf = crf;
            return this;
        }
        public String getCrf() {
            return this.crf;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputVideo setGop(String gop) {
            this.gop = gop;
            return this;
        }
        public String getGop() {
            return this.gop;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputVideo setWidth(String width) {
            this.width = width;
            return this;
        }
        public String getWidth() {
            return this.width;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputVideo setFps(String fps) {
            this.fps = fps;
            return this;
        }
        public String getFps() {
            return this.fps;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputVideo setPreset(String preset) {
            this.preset = preset;
            return this;
        }
        public String getPreset() {
            return this.preset;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputVideo setScanMode(String scanMode) {
            this.scanMode = scanMode;
            return this;
        }
        public String getScanMode() {
            return this.scanMode;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputVideo setResoPriority(String resoPriority) {
            this.resoPriority = resoPriority;
            return this;
        }
        public String getResoPriority() {
            return this.resoPriority;
        }

    }

    public static class SubmitJobsResponseBodyJobResultListJobResultJobOutputTransConfig extends TeaModel {
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

        public static SubmitJobsResponseBodyJobResultListJobResultJobOutputTransConfig build(java.util.Map<String, ?> map) throws Exception {
            SubmitJobsResponseBodyJobResultListJobResultJobOutputTransConfig self = new SubmitJobsResponseBodyJobResultListJobResultJobOutputTransConfig();
            return TeaModel.build(map, self);
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputTransConfig setIsCheckAudioBitrate(String isCheckAudioBitrate) {
            this.isCheckAudioBitrate = isCheckAudioBitrate;
            return this;
        }
        public String getIsCheckAudioBitrate() {
            return this.isCheckAudioBitrate;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputTransConfig setTransMode(String transMode) {
            this.transMode = transMode;
            return this;
        }
        public String getTransMode() {
            return this.transMode;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputTransConfig setIsCheckReso(String isCheckReso) {
            this.isCheckReso = isCheckReso;
            return this;
        }
        public String getIsCheckReso() {
            return this.isCheckReso;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputTransConfig setIsCheckVideoBitrateFail(String isCheckVideoBitrateFail) {
            this.isCheckVideoBitrateFail = isCheckVideoBitrateFail;
            return this;
        }
        public String getIsCheckVideoBitrateFail() {
            return this.isCheckVideoBitrateFail;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputTransConfig setAdjDarMethod(String adjDarMethod) {
            this.adjDarMethod = adjDarMethod;
            return this;
        }
        public String getAdjDarMethod() {
            return this.adjDarMethod;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputTransConfig setIsCheckVideoBitrate(String isCheckVideoBitrate) {
            this.isCheckVideoBitrate = isCheckVideoBitrate;
            return this;
        }
        public String getIsCheckVideoBitrate() {
            return this.isCheckVideoBitrate;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputTransConfig setIsCheckResoFail(String isCheckResoFail) {
            this.isCheckResoFail = isCheckResoFail;
            return this;
        }
        public String getIsCheckResoFail() {
            return this.isCheckResoFail;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputTransConfig setIsCheckAudioBitrateFail(String isCheckAudioBitrateFail) {
            this.isCheckAudioBitrateFail = isCheckAudioBitrateFail;
            return this;
        }
        public String getIsCheckAudioBitrateFail() {
            return this.isCheckAudioBitrateFail;
        }

    }

    public static class SubmitJobsResponseBodyJobResultListJobResultJobOutputEncryption extends TeaModel {
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

        public static SubmitJobsResponseBodyJobResultListJobResultJobOutputEncryption build(java.util.Map<String, ?> map) throws Exception {
            SubmitJobsResponseBodyJobResultListJobResultJobOutputEncryption self = new SubmitJobsResponseBodyJobResultListJobResultJobOutputEncryption();
            return TeaModel.build(map, self);
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputEncryption setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
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

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputEncryption setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
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

    }

    public static class SubmitJobsResponseBodyJobResultListJobResultJobOutputWaterMarkListWaterMarkInputFile extends TeaModel {
        @NameInMap("Object")
        public String object;

        @NameInMap("Location")
        public String location;

        @NameInMap("Bucket")
        public String bucket;

        public static SubmitJobsResponseBodyJobResultListJobResultJobOutputWaterMarkListWaterMarkInputFile build(java.util.Map<String, ?> map) throws Exception {
            SubmitJobsResponseBodyJobResultListJobResultJobOutputWaterMarkListWaterMarkInputFile self = new SubmitJobsResponseBodyJobResultListJobResultJobOutputWaterMarkListWaterMarkInputFile();
            return TeaModel.build(map, self);
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputWaterMarkListWaterMarkInputFile setObject(String object) {
            this.object = object;
            return this;
        }
        public String getObject() {
            return this.object;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputWaterMarkListWaterMarkInputFile setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputWaterMarkListWaterMarkInputFile setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

    }

    public static class SubmitJobsResponseBodyJobResultListJobResultJobOutputWaterMarkListWaterMark extends TeaModel {
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
        public SubmitJobsResponseBodyJobResultListJobResultJobOutputWaterMarkListWaterMarkInputFile inputFile;

        @NameInMap("WaterMarkTemplateId")
        public String waterMarkTemplateId;

        @NameInMap("Dy")
        public String dy;

        public static SubmitJobsResponseBodyJobResultListJobResultJobOutputWaterMarkListWaterMark build(java.util.Map<String, ?> map) throws Exception {
            SubmitJobsResponseBodyJobResultListJobResultJobOutputWaterMarkListWaterMark self = new SubmitJobsResponseBodyJobResultListJobResultJobOutputWaterMarkListWaterMark();
            return TeaModel.build(map, self);
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputWaterMarkListWaterMark setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputWaterMarkListWaterMark setReferPos(String referPos) {
            this.referPos = referPos;
            return this;
        }
        public String getReferPos() {
            return this.referPos;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputWaterMarkListWaterMark setDx(String dx) {
            this.dx = dx;
            return this;
        }
        public String getDx() {
            return this.dx;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputWaterMarkListWaterMark setWidth(String width) {
            this.width = width;
            return this;
        }
        public String getWidth() {
            return this.width;
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

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputWaterMarkListWaterMark setWaterMarkTemplateId(String waterMarkTemplateId) {
            this.waterMarkTemplateId = waterMarkTemplateId;
            return this;
        }
        public String getWaterMarkTemplateId() {
            return this.waterMarkTemplateId;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputWaterMarkListWaterMark setDy(String dy) {
            this.dy = dy;
            return this;
        }
        public String getDy() {
            return this.dy;
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

    public static class SubmitJobsResponseBodyJobResultListJobResultJobOutputM3U8NonStandardSupportTS extends TeaModel {
        @NameInMap("SizeSupport")
        public Boolean sizeSupport;

        @NameInMap("Md5Support")
        public Boolean md5Support;

        public static SubmitJobsResponseBodyJobResultListJobResultJobOutputM3U8NonStandardSupportTS build(java.util.Map<String, ?> map) throws Exception {
            SubmitJobsResponseBodyJobResultListJobResultJobOutputM3U8NonStandardSupportTS self = new SubmitJobsResponseBodyJobResultListJobResultJobOutputM3U8NonStandardSupportTS();
            return TeaModel.build(map, self);
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputM3U8NonStandardSupportTS setSizeSupport(Boolean sizeSupport) {
            this.sizeSupport = sizeSupport;
            return this;
        }
        public Boolean getSizeSupport() {
            return this.sizeSupport;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputM3U8NonStandardSupportTS setMd5Support(Boolean md5Support) {
            this.md5Support = md5Support;
            return this;
        }
        public Boolean getMd5Support() {
            return this.md5Support;
        }

    }

    public static class SubmitJobsResponseBodyJobResultListJobResultJobOutputM3U8NonStandardSupport extends TeaModel {
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

    public static class SubmitJobsResponseBodyJobResultListJobResultJobOutputAudioVolume extends TeaModel {
        @NameInMap("Method")
        public String method;

        @NameInMap("Level")
        public String level;

        public static SubmitJobsResponseBodyJobResultListJobResultJobOutputAudioVolume build(java.util.Map<String, ?> map) throws Exception {
            SubmitJobsResponseBodyJobResultListJobResultJobOutputAudioVolume self = new SubmitJobsResponseBodyJobResultListJobResultJobOutputAudioVolume();
            return TeaModel.build(map, self);
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputAudioVolume setMethod(String method) {
            this.method = method;
            return this;
        }
        public String getMethod() {
            return this.method;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputAudioVolume setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

    }

    public static class SubmitJobsResponseBodyJobResultListJobResultJobOutputAudio extends TeaModel {
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
        public SubmitJobsResponseBodyJobResultListJobResultJobOutputAudioVolume volume;

        @NameInMap("Bitrate")
        public String bitrate;

        public static SubmitJobsResponseBodyJobResultListJobResultJobOutputAudio build(java.util.Map<String, ?> map) throws Exception {
            SubmitJobsResponseBodyJobResultListJobResultJobOutputAudio self = new SubmitJobsResponseBodyJobResultListJobResultJobOutputAudio();
            return TeaModel.build(map, self);
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputAudio setProfile(String profile) {
            this.profile = profile;
            return this;
        }
        public String getProfile() {
            return this.profile;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputAudio setCodec(String codec) {
            this.codec = codec;
            return this;
        }
        public String getCodec() {
            return this.codec;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputAudio setSamplerate(String samplerate) {
            this.samplerate = samplerate;
            return this;
        }
        public String getSamplerate() {
            return this.samplerate;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputAudio setQscale(String qscale) {
            this.qscale = qscale;
            return this;
        }
        public String getQscale() {
            return this.qscale;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputAudio setChannels(String channels) {
            this.channels = channels;
            return this;
        }
        public String getChannels() {
            return this.channels;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputAudio setVolume(SubmitJobsResponseBodyJobResultListJobResultJobOutputAudioVolume volume) {
            this.volume = volume;
            return this;
        }
        public SubmitJobsResponseBodyJobResultListJobResultJobOutputAudioVolume getVolume() {
            return this.volume;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputAudio setBitrate(String bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public String getBitrate() {
            return this.bitrate;
        }

    }

    public static class SubmitJobsResponseBodyJobResultListJobResultJobOutputMergeListMerge extends TeaModel {
        @NameInMap("Start")
        public String start;

        @NameInMap("RoleArn")
        public String roleArn;

        @NameInMap("MergeURL")
        public String mergeURL;

        @NameInMap("Duration")
        public String duration;

        public static SubmitJobsResponseBodyJobResultListJobResultJobOutputMergeListMerge build(java.util.Map<String, ?> map) throws Exception {
            SubmitJobsResponseBodyJobResultListJobResultJobOutputMergeListMerge self = new SubmitJobsResponseBodyJobResultListJobResultJobOutputMergeListMerge();
            return TeaModel.build(map, self);
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputMergeListMerge setStart(String start) {
            this.start = start;
            return this;
        }
        public String getStart() {
            return this.start;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputMergeListMerge setRoleArn(String roleArn) {
            this.roleArn = roleArn;
            return this;
        }
        public String getRoleArn() {
            return this.roleArn;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputMergeListMerge setMergeURL(String mergeURL) {
            this.mergeURL = mergeURL;
            return this;
        }
        public String getMergeURL() {
            return this.mergeURL;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputMergeListMerge setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
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

    public static class SubmitJobsResponseBodyJobResultListJobResultJobOutputSuperReso extends TeaModel {
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

    public static class SubmitJobsResponseBodyJobResultListJobResultJobOutputOutSubtitleListOutSubtitleOutSubtitleFile extends TeaModel {
        @NameInMap("RoleArn")
        public String roleArn;

        @NameInMap("Object")
        public String object;

        @NameInMap("Location")
        public String location;

        @NameInMap("Bucket")
        public String bucket;

        public static SubmitJobsResponseBodyJobResultListJobResultJobOutputOutSubtitleListOutSubtitleOutSubtitleFile build(java.util.Map<String, ?> map) throws Exception {
            SubmitJobsResponseBodyJobResultListJobResultJobOutputOutSubtitleListOutSubtitleOutSubtitleFile self = new SubmitJobsResponseBodyJobResultListJobResultJobOutputOutSubtitleListOutSubtitleOutSubtitleFile();
            return TeaModel.build(map, self);
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputOutSubtitleListOutSubtitleOutSubtitleFile setRoleArn(String roleArn) {
            this.roleArn = roleArn;
            return this;
        }
        public String getRoleArn() {
            return this.roleArn;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputOutSubtitleListOutSubtitleOutSubtitleFile setObject(String object) {
            this.object = object;
            return this;
        }
        public String getObject() {
            return this.object;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputOutSubtitleListOutSubtitleOutSubtitleFile setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputOutSubtitleListOutSubtitleOutSubtitleFile setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

    }

    public static class SubmitJobsResponseBodyJobResultListJobResultJobOutputOutSubtitleListOutSubtitle extends TeaModel {
        @NameInMap("Map")
        public String map;

        @NameInMap("OutSubtitleFile")
        public SubmitJobsResponseBodyJobResultListJobResultJobOutputOutSubtitleListOutSubtitleOutSubtitleFile outSubtitleFile;

        @NameInMap("Success")
        public Boolean success;

        @NameInMap("Message")
        public String message;

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

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputOutSubtitleListOutSubtitle setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
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

    public static class SubmitJobsResponseBodyJobResultListJobResultJobOutputDigiWaterMarkInputFile extends TeaModel {
        @NameInMap("Object")
        public String object;

        @NameInMap("Location")
        public String location;

        @NameInMap("Bucket")
        public String bucket;

        public static SubmitJobsResponseBodyJobResultListJobResultJobOutputDigiWaterMarkInputFile build(java.util.Map<String, ?> map) throws Exception {
            SubmitJobsResponseBodyJobResultListJobResultJobOutputDigiWaterMarkInputFile self = new SubmitJobsResponseBodyJobResultListJobResultJobOutputDigiWaterMarkInputFile();
            return TeaModel.build(map, self);
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputDigiWaterMarkInputFile setObject(String object) {
            this.object = object;
            return this;
        }
        public String getObject() {
            return this.object;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputDigiWaterMarkInputFile setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputDigiWaterMarkInputFile setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

    }

    public static class SubmitJobsResponseBodyJobResultListJobResultJobOutputDigiWaterMark extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("Alpha")
        public String alpha;

        @NameInMap("InputFile")
        public SubmitJobsResponseBodyJobResultListJobResultJobOutputDigiWaterMarkInputFile inputFile;

        public static SubmitJobsResponseBodyJobResultListJobResultJobOutputDigiWaterMark build(java.util.Map<String, ?> map) throws Exception {
            SubmitJobsResponseBodyJobResultListJobResultJobOutputDigiWaterMark self = new SubmitJobsResponseBodyJobResultListJobResultJobOutputDigiWaterMark();
            return TeaModel.build(map, self);
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputDigiWaterMark setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
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

    }

    public static class SubmitJobsResponseBodyJobResultListJobResultJobOutputOutputFile extends TeaModel {
        @NameInMap("RoleArn")
        public String roleArn;

        @NameInMap("Object")
        public String object;

        @NameInMap("Location")
        public String location;

        @NameInMap("Bucket")
        public String bucket;

        public static SubmitJobsResponseBodyJobResultListJobResultJobOutputOutputFile build(java.util.Map<String, ?> map) throws Exception {
            SubmitJobsResponseBodyJobResultListJobResultJobOutputOutputFile self = new SubmitJobsResponseBodyJobResultListJobResultJobOutputOutputFile();
            return TeaModel.build(map, self);
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputOutputFile setRoleArn(String roleArn) {
            this.roleArn = roleArn;
            return this;
        }
        public String getRoleArn() {
            return this.roleArn;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputOutputFile setObject(String object) {
            this.object = object;
            return this;
        }
        public String getObject() {
            return this.object;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputOutputFile setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputOutputFile setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

    }

    public static class SubmitJobsResponseBodyJobResultListJobResultJobOutputAmixListAmix extends TeaModel {
        @NameInMap("Map")
        public String map;

        @NameInMap("Start")
        public String start;

        @NameInMap("AmixURL")
        public String amixURL;

        @NameInMap("Duration")
        public String duration;

        @NameInMap("MixDurMode")
        public String mixDurMode;

        public static SubmitJobsResponseBodyJobResultListJobResultJobOutputAmixListAmix build(java.util.Map<String, ?> map) throws Exception {
            SubmitJobsResponseBodyJobResultListJobResultJobOutputAmixListAmix self = new SubmitJobsResponseBodyJobResultListJobResultJobOutputAmixListAmix();
            return TeaModel.build(map, self);
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputAmixListAmix setMap(String map) {
            this.map = map;
            return this;
        }
        public String getMap() {
            return this.map;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputAmixListAmix setStart(String start) {
            this.start = start;
            return this;
        }
        public String getStart() {
            return this.start;
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

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputAmixListAmix setMixDurMode(String mixDurMode) {
            this.mixDurMode = mixDurMode;
            return this;
        }
        public String getMixDurMode() {
            return this.mixDurMode;
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

    public static class SubmitJobsResponseBodyJobResultListJobResultJobOutputContainer extends TeaModel {
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

    public static class SubmitJobsResponseBodyJobResultListJobResultJobOutputClipTimeSpan extends TeaModel {
        @NameInMap("Seek")
        public String seek;

        @NameInMap("Duration")
        public String duration;

        public static SubmitJobsResponseBodyJobResultListJobResultJobOutputClipTimeSpan build(java.util.Map<String, ?> map) throws Exception {
            SubmitJobsResponseBodyJobResultListJobResultJobOutputClipTimeSpan self = new SubmitJobsResponseBodyJobResultListJobResultJobOutputClipTimeSpan();
            return TeaModel.build(map, self);
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputClipTimeSpan setSeek(String seek) {
            this.seek = seek;
            return this;
        }
        public String getSeek() {
            return this.seek;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputClipTimeSpan setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

    }

    public static class SubmitJobsResponseBodyJobResultListJobResultJobOutputClip extends TeaModel {
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

    public static class SubmitJobsResponseBodyJobResultListJobResultJobOutputOpeningListOpening extends TeaModel {
        @NameInMap("openUrl")
        public String openUrl;

        @NameInMap("Start")
        public String start;

        @NameInMap("Width")
        public String width;

        @NameInMap("Height")
        public String height;

        public static SubmitJobsResponseBodyJobResultListJobResultJobOutputOpeningListOpening build(java.util.Map<String, ?> map) throws Exception {
            SubmitJobsResponseBodyJobResultListJobResultJobOutputOpeningListOpening self = new SubmitJobsResponseBodyJobResultListJobResultJobOutputOpeningListOpening();
            return TeaModel.build(map, self);
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputOpeningListOpening setOpenUrl(String openUrl) {
            this.openUrl = openUrl;
            return this;
        }
        public String getOpenUrl() {
            return this.openUrl;
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

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputOpeningListOpening setHeight(String height) {
            this.height = height;
            return this;
        }
        public String getHeight() {
            return this.height;
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

    public static class SubmitJobsResponseBodyJobResultListJobResultJobOutputMuxConfigWebp extends TeaModel {
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

    public static class SubmitJobsResponseBodyJobResultListJobResultJobOutputMuxConfigGif extends TeaModel {
        @NameInMap("FinalDelay")
        public String finalDelay;

        @NameInMap("DitherMode")
        public String ditherMode;

        @NameInMap("Loop")
        public String loop;

        @NameInMap("IsCustomPalette")
        public String isCustomPalette;

        public static SubmitJobsResponseBodyJobResultListJobResultJobOutputMuxConfigGif build(java.util.Map<String, ?> map) throws Exception {
            SubmitJobsResponseBodyJobResultListJobResultJobOutputMuxConfigGif self = new SubmitJobsResponseBodyJobResultListJobResultJobOutputMuxConfigGif();
            return TeaModel.build(map, self);
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputMuxConfigGif setFinalDelay(String finalDelay) {
            this.finalDelay = finalDelay;
            return this;
        }
        public String getFinalDelay() {
            return this.finalDelay;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputMuxConfigGif setDitherMode(String ditherMode) {
            this.ditherMode = ditherMode;
            return this;
        }
        public String getDitherMode() {
            return this.ditherMode;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputMuxConfigGif setLoop(String loop) {
            this.loop = loop;
            return this;
        }
        public String getLoop() {
            return this.loop;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputMuxConfigGif setIsCustomPalette(String isCustomPalette) {
            this.isCustomPalette = isCustomPalette;
            return this;
        }
        public String getIsCustomPalette() {
            return this.isCustomPalette;
        }

    }

    public static class SubmitJobsResponseBodyJobResultListJobResultJobOutputMuxConfigSegment extends TeaModel {
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

    public static class SubmitJobsResponseBodyJobResultListJobResultJobOutputMuxConfig extends TeaModel {
        @NameInMap("Webp")
        public SubmitJobsResponseBodyJobResultListJobResultJobOutputMuxConfigWebp webp;

        @NameInMap("Gif")
        public SubmitJobsResponseBodyJobResultListJobResultJobOutputMuxConfigGif gif;

        @NameInMap("Segment")
        public SubmitJobsResponseBodyJobResultListJobResultJobOutputMuxConfigSegment segment;

        public static SubmitJobsResponseBodyJobResultListJobResultJobOutputMuxConfig build(java.util.Map<String, ?> map) throws Exception {
            SubmitJobsResponseBodyJobResultListJobResultJobOutputMuxConfig self = new SubmitJobsResponseBodyJobResultListJobResultJobOutputMuxConfig();
            return TeaModel.build(map, self);
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputMuxConfig setWebp(SubmitJobsResponseBodyJobResultListJobResultJobOutputMuxConfigWebp webp) {
            this.webp = webp;
            return this;
        }
        public SubmitJobsResponseBodyJobResultListJobResultJobOutputMuxConfigWebp getWebp() {
            return this.webp;
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

    }

    public static class SubmitJobsResponseBodyJobResultListJobResultJobOutputTailSlateListTailSlate extends TeaModel {
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

        public static SubmitJobsResponseBodyJobResultListJobResultJobOutputTailSlateListTailSlate build(java.util.Map<String, ?> map) throws Exception {
            SubmitJobsResponseBodyJobResultListJobResultJobOutputTailSlateListTailSlate self = new SubmitJobsResponseBodyJobResultListJobResultJobOutputTailSlateListTailSlate();
            return TeaModel.build(map, self);
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputTailSlateListTailSlate setStart(String start) {
            this.start = start;
            return this;
        }
        public String getStart() {
            return this.start;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputTailSlateListTailSlate setBgColor(String bgColor) {
            this.bgColor = bgColor;
            return this;
        }
        public String getBgColor() {
            return this.bgColor;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputTailSlateListTailSlate setIsMergeAudio(Boolean isMergeAudio) {
            this.isMergeAudio = isMergeAudio;
            return this;
        }
        public Boolean getIsMergeAudio() {
            return this.isMergeAudio;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputTailSlateListTailSlate setWidth(String width) {
            this.width = width;
            return this;
        }
        public String getWidth() {
            return this.width;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputTailSlateListTailSlate setHeight(String height) {
            this.height = height;
            return this;
        }
        public String getHeight() {
            return this.height;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputTailSlateListTailSlate setBlendDuration(String blendDuration) {
            this.blendDuration = blendDuration;
            return this;
        }
        public String getBlendDuration() {
            return this.blendDuration;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputTailSlateListTailSlate setTailUrl(String tailUrl) {
            this.tailUrl = tailUrl;
            return this;
        }
        public String getTailUrl() {
            return this.tailUrl;
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

    public static class SubmitJobsResponseBodyJobResultListJobResultJobOutputSubtitleConfigExtSubtitleListExtSubtitleInput extends TeaModel {
        @NameInMap("Object")
        public String object;

        @NameInMap("Location")
        public String location;

        @NameInMap("Bucket")
        public String bucket;

        public static SubmitJobsResponseBodyJobResultListJobResultJobOutputSubtitleConfigExtSubtitleListExtSubtitleInput build(java.util.Map<String, ?> map) throws Exception {
            SubmitJobsResponseBodyJobResultListJobResultJobOutputSubtitleConfigExtSubtitleListExtSubtitleInput self = new SubmitJobsResponseBodyJobResultListJobResultJobOutputSubtitleConfigExtSubtitleListExtSubtitleInput();
            return TeaModel.build(map, self);
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputSubtitleConfigExtSubtitleListExtSubtitleInput setObject(String object) {
            this.object = object;
            return this;
        }
        public String getObject() {
            return this.object;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputSubtitleConfigExtSubtitleListExtSubtitleInput setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputSubtitleConfigExtSubtitleListExtSubtitleInput setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

    }

    public static class SubmitJobsResponseBodyJobResultListJobResultJobOutputSubtitleConfigExtSubtitleListExtSubtitle extends TeaModel {
        @NameInMap("CharEnc")
        public String charEnc;

        @NameInMap("FontName")
        public String fontName;

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
        @NameInMap("ExtSubtitleList")
        public SubmitJobsResponseBodyJobResultListJobResultJobOutputSubtitleConfigExtSubtitleList extSubtitleList;

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

    public static class SubmitJobsResponseBodyJobResultListJobResultJobOutputPropertiesStreamsVideoStreamListVideoStreamNetworkCost extends TeaModel {
        @NameInMap("PreloadTime")
        public String preloadTime;

        @NameInMap("AvgBitrate")
        public String avgBitrate;

        @NameInMap("CostBandwidth")
        public String costBandwidth;

        public static SubmitJobsResponseBodyJobResultListJobResultJobOutputPropertiesStreamsVideoStreamListVideoStreamNetworkCost build(java.util.Map<String, ?> map) throws Exception {
            SubmitJobsResponseBodyJobResultListJobResultJobOutputPropertiesStreamsVideoStreamListVideoStreamNetworkCost self = new SubmitJobsResponseBodyJobResultListJobResultJobOutputPropertiesStreamsVideoStreamListVideoStreamNetworkCost();
            return TeaModel.build(map, self);
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputPropertiesStreamsVideoStreamListVideoStreamNetworkCost setPreloadTime(String preloadTime) {
            this.preloadTime = preloadTime;
            return this;
        }
        public String getPreloadTime() {
            return this.preloadTime;
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

    }

    public static class SubmitJobsResponseBodyJobResultListJobResultJobOutputPropertiesStreamsVideoStreamListVideoStream extends TeaModel {
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
        public SubmitJobsResponseBodyJobResultListJobResultJobOutputPropertiesStreamsVideoStreamListVideoStreamNetworkCost networkCost;

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

        public static SubmitJobsResponseBodyJobResultListJobResultJobOutputPropertiesStreamsVideoStreamListVideoStream build(java.util.Map<String, ?> map) throws Exception {
            SubmitJobsResponseBodyJobResultListJobResultJobOutputPropertiesStreamsVideoStreamListVideoStream self = new SubmitJobsResponseBodyJobResultListJobResultJobOutputPropertiesStreamsVideoStreamListVideoStream();
            return TeaModel.build(map, self);
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputPropertiesStreamsVideoStreamListVideoStream setIndex(String index) {
            this.index = index;
            return this;
        }
        public String getIndex() {
            return this.index;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputPropertiesStreamsVideoStreamListVideoStream setTimebase(String timebase) {
            this.timebase = timebase;
            return this;
        }
        public String getTimebase() {
            return this.timebase;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputPropertiesStreamsVideoStreamListVideoStream setAvgFPS(String avgFPS) {
            this.avgFPS = avgFPS;
            return this;
        }
        public String getAvgFPS() {
            return this.avgFPS;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputPropertiesStreamsVideoStreamListVideoStream setPixFmt(String pixFmt) {
            this.pixFmt = pixFmt;
            return this;
        }
        public String getPixFmt() {
            return this.pixFmt;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputPropertiesStreamsVideoStreamListVideoStream setSar(String sar) {
            this.sar = sar;
            return this;
        }
        public String getSar() {
            return this.sar;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputPropertiesStreamsVideoStreamListVideoStream setLang(String lang) {
            this.lang = lang;
            return this;
        }
        public String getLang() {
            return this.lang;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputPropertiesStreamsVideoStreamListVideoStream setCodecLongName(String codecLongName) {
            this.codecLongName = codecLongName;
            return this;
        }
        public String getCodecLongName() {
            return this.codecLongName;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputPropertiesStreamsVideoStreamListVideoStream setHeight(String height) {
            this.height = height;
            return this;
        }
        public String getHeight() {
            return this.height;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputPropertiesStreamsVideoStreamListVideoStream setNumFrames(String numFrames) {
            this.numFrames = numFrames;
            return this;
        }
        public String getNumFrames() {
            return this.numFrames;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputPropertiesStreamsVideoStreamListVideoStream setBitrate(String bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public String getBitrate() {
            return this.bitrate;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputPropertiesStreamsVideoStreamListVideoStream setCodecTagString(String codecTagString) {
            this.codecTagString = codecTagString;
            return this;
        }
        public String getCodecTagString() {
            return this.codecTagString;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputPropertiesStreamsVideoStreamListVideoStream setHasBFrames(String hasBFrames) {
            this.hasBFrames = hasBFrames;
            return this;
        }
        public String getHasBFrames() {
            return this.hasBFrames;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputPropertiesStreamsVideoStreamListVideoStream setProfile(String profile) {
            this.profile = profile;
            return this;
        }
        public String getProfile() {
            return this.profile;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputPropertiesStreamsVideoStreamListVideoStream setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputPropertiesStreamsVideoStreamListVideoStream setNetworkCost(SubmitJobsResponseBodyJobResultListJobResultJobOutputPropertiesStreamsVideoStreamListVideoStreamNetworkCost networkCost) {
            this.networkCost = networkCost;
            return this;
        }
        public SubmitJobsResponseBodyJobResultListJobResultJobOutputPropertiesStreamsVideoStreamListVideoStreamNetworkCost getNetworkCost() {
            return this.networkCost;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputPropertiesStreamsVideoStreamListVideoStream setDar(String dar) {
            this.dar = dar;
            return this;
        }
        public String getDar() {
            return this.dar;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputPropertiesStreamsVideoStreamListVideoStream setCodecName(String codecName) {
            this.codecName = codecName;
            return this;
        }
        public String getCodecName() {
            return this.codecName;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputPropertiesStreamsVideoStreamListVideoStream setWidth(String width) {
            this.width = width;
            return this;
        }
        public String getWidth() {
            return this.width;
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

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputPropertiesStreamsVideoStreamListVideoStream setCodecTag(String codecTag) {
            this.codecTag = codecTag;
            return this;
        }
        public String getCodecTag() {
            return this.codecTag;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputPropertiesStreamsVideoStreamListVideoStream setCodecTimeBase(String codecTimeBase) {
            this.codecTimeBase = codecTimeBase;
            return this;
        }
        public String getCodecTimeBase() {
            return this.codecTimeBase;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputPropertiesStreamsVideoStreamListVideoStream setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
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

    public static class SubmitJobsResponseBodyJobResultListJobResultJobOutputPropertiesStreamsAudioStreamListAudioStream extends TeaModel {
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

        public static SubmitJobsResponseBodyJobResultListJobResultJobOutputPropertiesStreamsAudioStreamListAudioStream build(java.util.Map<String, ?> map) throws Exception {
            SubmitJobsResponseBodyJobResultListJobResultJobOutputPropertiesStreamsAudioStreamListAudioStream self = new SubmitJobsResponseBodyJobResultListJobResultJobOutputPropertiesStreamsAudioStreamListAudioStream();
            return TeaModel.build(map, self);
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputPropertiesStreamsAudioStreamListAudioStream setTimebase(String timebase) {
            this.timebase = timebase;
            return this;
        }
        public String getTimebase() {
            return this.timebase;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputPropertiesStreamsAudioStreamListAudioStream setIndex(String index) {
            this.index = index;
            return this;
        }
        public String getIndex() {
            return this.index;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputPropertiesStreamsAudioStreamListAudioStream setSampleFmt(String sampleFmt) {
            this.sampleFmt = sampleFmt;
            return this;
        }
        public String getSampleFmt() {
            return this.sampleFmt;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputPropertiesStreamsAudioStreamListAudioStream setChannelLayout(String channelLayout) {
            this.channelLayout = channelLayout;
            return this;
        }
        public String getChannelLayout() {
            return this.channelLayout;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputPropertiesStreamsAudioStreamListAudioStream setLang(String lang) {
            this.lang = lang;
            return this;
        }
        public String getLang() {
            return this.lang;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputPropertiesStreamsAudioStreamListAudioStream setSamplerate(String samplerate) {
            this.samplerate = samplerate;
            return this;
        }
        public String getSamplerate() {
            return this.samplerate;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputPropertiesStreamsAudioStreamListAudioStream setCodecLongName(String codecLongName) {
            this.codecLongName = codecLongName;
            return this;
        }
        public String getCodecLongName() {
            return this.codecLongName;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputPropertiesStreamsAudioStreamListAudioStream setChannels(String channels) {
            this.channels = channels;
            return this;
        }
        public String getChannels() {
            return this.channels;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputPropertiesStreamsAudioStreamListAudioStream setNumFrames(String numFrames) {
            this.numFrames = numFrames;
            return this;
        }
        public String getNumFrames() {
            return this.numFrames;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputPropertiesStreamsAudioStreamListAudioStream setBitrate(String bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public String getBitrate() {
            return this.bitrate;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputPropertiesStreamsAudioStreamListAudioStream setCodecTagString(String codecTagString) {
            this.codecTagString = codecTagString;
            return this;
        }
        public String getCodecTagString() {
            return this.codecTagString;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputPropertiesStreamsAudioStreamListAudioStream setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputPropertiesStreamsAudioStreamListAudioStream setCodecName(String codecName) {
            this.codecName = codecName;
            return this;
        }
        public String getCodecName() {
            return this.codecName;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputPropertiesStreamsAudioStreamListAudioStream setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputPropertiesStreamsAudioStreamListAudioStream setCodecTag(String codecTag) {
            this.codecTag = codecTag;
            return this;
        }
        public String getCodecTag() {
            return this.codecTag;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputPropertiesStreamsAudioStreamListAudioStream setCodecTimeBase(String codecTimeBase) {
            this.codecTimeBase = codecTimeBase;
            return this;
        }
        public String getCodecTimeBase() {
            return this.codecTimeBase;
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
        @NameInMap("Index")
        public String index;

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

    public static class SubmitJobsResponseBodyJobResultListJobResultJobOutputPropertiesStreams extends TeaModel {
        @NameInMap("VideoStreamList")
        public SubmitJobsResponseBodyJobResultListJobResultJobOutputPropertiesStreamsVideoStreamList videoStreamList;

        @NameInMap("AudioStreamList")
        public SubmitJobsResponseBodyJobResultListJobResultJobOutputPropertiesStreamsAudioStreamList audioStreamList;

        @NameInMap("SubtitleStreamList")
        public SubmitJobsResponseBodyJobResultListJobResultJobOutputPropertiesStreamsSubtitleStreamList subtitleStreamList;

        public static SubmitJobsResponseBodyJobResultListJobResultJobOutputPropertiesStreams build(java.util.Map<String, ?> map) throws Exception {
            SubmitJobsResponseBodyJobResultListJobResultJobOutputPropertiesStreams self = new SubmitJobsResponseBodyJobResultListJobResultJobOutputPropertiesStreams();
            return TeaModel.build(map, self);
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputPropertiesStreams setVideoStreamList(SubmitJobsResponseBodyJobResultListJobResultJobOutputPropertiesStreamsVideoStreamList videoStreamList) {
            this.videoStreamList = videoStreamList;
            return this;
        }
        public SubmitJobsResponseBodyJobResultListJobResultJobOutputPropertiesStreamsVideoStreamList getVideoStreamList() {
            return this.videoStreamList;
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

    }

    public static class SubmitJobsResponseBodyJobResultListJobResultJobOutputPropertiesFormat extends TeaModel {
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

        public static SubmitJobsResponseBodyJobResultListJobResultJobOutputPropertiesFormat build(java.util.Map<String, ?> map) throws Exception {
            SubmitJobsResponseBodyJobResultListJobResultJobOutputPropertiesFormat self = new SubmitJobsResponseBodyJobResultListJobResultJobOutputPropertiesFormat();
            return TeaModel.build(map, self);
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputPropertiesFormat setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputPropertiesFormat setNumPrograms(String numPrograms) {
            this.numPrograms = numPrograms;
            return this;
        }
        public String getNumPrograms() {
            return this.numPrograms;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputPropertiesFormat setSize(String size) {
            this.size = size;
            return this;
        }
        public String getSize() {
            return this.size;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputPropertiesFormat setNumStreams(String numStreams) {
            this.numStreams = numStreams;
            return this;
        }
        public String getNumStreams() {
            return this.numStreams;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputPropertiesFormat setFormatLongName(String formatLongName) {
            this.formatLongName = formatLongName;
            return this;
        }
        public String getFormatLongName() {
            return this.formatLongName;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputPropertiesFormat setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputPropertiesFormat setBitrate(String bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public String getBitrate() {
            return this.bitrate;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputPropertiesFormat setFormatName(String formatName) {
            this.formatName = formatName;
            return this;
        }
        public String getFormatName() {
            return this.formatName;
        }

    }

    public static class SubmitJobsResponseBodyJobResultListJobResultJobOutputProperties extends TeaModel {
        @NameInMap("Width")
        public String width;

        @NameInMap("Height")
        public String height;

        @NameInMap("Duration")
        public String duration;

        @NameInMap("Fps")
        public String fps;

        @NameInMap("Bitrate")
        public String bitrate;

        @NameInMap("FileFormat")
        public String fileFormat;

        @NameInMap("Streams")
        public SubmitJobsResponseBodyJobResultListJobResultJobOutputPropertiesStreams streams;

        @NameInMap("Format")
        public SubmitJobsResponseBodyJobResultListJobResultJobOutputPropertiesFormat format;

        @NameInMap("FileSize")
        public String fileSize;

        public static SubmitJobsResponseBodyJobResultListJobResultJobOutputProperties build(java.util.Map<String, ?> map) throws Exception {
            SubmitJobsResponseBodyJobResultListJobResultJobOutputProperties self = new SubmitJobsResponseBodyJobResultListJobResultJobOutputProperties();
            return TeaModel.build(map, self);
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputProperties setWidth(String width) {
            this.width = width;
            return this;
        }
        public String getWidth() {
            return this.width;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputProperties setHeight(String height) {
            this.height = height;
            return this;
        }
        public String getHeight() {
            return this.height;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputProperties setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputProperties setFps(String fps) {
            this.fps = fps;
            return this;
        }
        public String getFps() {
            return this.fps;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputProperties setBitrate(String bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public String getBitrate() {
            return this.bitrate;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputProperties setFileFormat(String fileFormat) {
            this.fileFormat = fileFormat;
            return this;
        }
        public String getFileFormat() {
            return this.fileFormat;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputProperties setStreams(SubmitJobsResponseBodyJobResultListJobResultJobOutputPropertiesStreams streams) {
            this.streams = streams;
            return this;
        }
        public SubmitJobsResponseBodyJobResultListJobResultJobOutputPropertiesStreams getStreams() {
            return this.streams;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputProperties setFormat(SubmitJobsResponseBodyJobResultListJobResultJobOutputPropertiesFormat format) {
            this.format = format;
            return this;
        }
        public SubmitJobsResponseBodyJobResultListJobResultJobOutputPropertiesFormat getFormat() {
            return this.format;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutputProperties setFileSize(String fileSize) {
            this.fileSize = fileSize;
            return this;
        }
        public String getFileSize() {
            return this.fileSize;
        }

    }

    public static class SubmitJobsResponseBodyJobResultListJobResultJobOutput extends TeaModel {
        @NameInMap("Video")
        public SubmitJobsResponseBodyJobResultListJobResultJobOutputVideo video;

        @NameInMap("TransConfig")
        public SubmitJobsResponseBodyJobResultListJobResultJobOutputTransConfig transConfig;

        @NameInMap("Encryption")
        public SubmitJobsResponseBodyJobResultListJobResultJobOutputEncryption encryption;

        @NameInMap("WaterMarkList")
        public SubmitJobsResponseBodyJobResultListJobResultJobOutputWaterMarkList waterMarkList;

        @NameInMap("WaterMarkConfigUrl")
        public String waterMarkConfigUrl;

        @NameInMap("DeWatermark")
        public String deWatermark;

        @NameInMap("M3U8NonStandardSupport")
        public SubmitJobsResponseBodyJobResultListJobResultJobOutputM3U8NonStandardSupport m3U8NonStandardSupport;

        @NameInMap("Priority")
        public String priority;

        @NameInMap("Audio")
        public SubmitJobsResponseBodyJobResultListJobResultJobOutputAudio audio;

        @NameInMap("AudioStreamMap")
        public String audioStreamMap;

        @NameInMap("MergeList")
        public SubmitJobsResponseBodyJobResultListJobResultJobOutputMergeList mergeList;

        @NameInMap("SuperReso")
        public SubmitJobsResponseBodyJobResultListJobResultJobOutputSuperReso superReso;

        @NameInMap("UserData")
        public String userData;

        @NameInMap("OutSubtitleList")
        public SubmitJobsResponseBodyJobResultListJobResultJobOutputOutSubtitleList outSubtitleList;

        @NameInMap("DigiWaterMark")
        public SubmitJobsResponseBodyJobResultListJobResultJobOutputDigiWaterMark digiWaterMark;

        @NameInMap("VideoStreamMap")
        public String videoStreamMap;

        @NameInMap("OutputFile")
        public SubmitJobsResponseBodyJobResultListJobResultJobOutputOutputFile outputFile;

        @NameInMap("AmixList")
        public SubmitJobsResponseBodyJobResultListJobResultJobOutputAmixList amixList;

        @NameInMap("Rotate")
        public String rotate;

        @NameInMap("Container")
        public SubmitJobsResponseBodyJobResultListJobResultJobOutputContainer container;

        @NameInMap("Clip")
        public SubmitJobsResponseBodyJobResultListJobResultJobOutputClip clip;

        @NameInMap("MergeConfigUrl")
        public String mergeConfigUrl;

        @NameInMap("OpeningList")
        public SubmitJobsResponseBodyJobResultListJobResultJobOutputOpeningList openingList;

        @NameInMap("MuxConfig")
        public SubmitJobsResponseBodyJobResultListJobResultJobOutputMuxConfig muxConfig;

        @NameInMap("TailSlateList")
        public SubmitJobsResponseBodyJobResultListJobResultJobOutputTailSlateList tailSlateList;

        @NameInMap("TemplateId")
        public String templateId;

        @NameInMap("SubtitleConfig")
        public SubmitJobsResponseBodyJobResultListJobResultJobOutputSubtitleConfig subtitleConfig;

        @NameInMap("Properties")
        public SubmitJobsResponseBodyJobResultListJobResultJobOutputProperties properties;

        public static SubmitJobsResponseBodyJobResultListJobResultJobOutput build(java.util.Map<String, ?> map) throws Exception {
            SubmitJobsResponseBodyJobResultListJobResultJobOutput self = new SubmitJobsResponseBodyJobResultListJobResultJobOutput();
            return TeaModel.build(map, self);
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutput setVideo(SubmitJobsResponseBodyJobResultListJobResultJobOutputVideo video) {
            this.video = video;
            return this;
        }
        public SubmitJobsResponseBodyJobResultListJobResultJobOutputVideo getVideo() {
            return this.video;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutput setTransConfig(SubmitJobsResponseBodyJobResultListJobResultJobOutputTransConfig transConfig) {
            this.transConfig = transConfig;
            return this;
        }
        public SubmitJobsResponseBodyJobResultListJobResultJobOutputTransConfig getTransConfig() {
            return this.transConfig;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutput setEncryption(SubmitJobsResponseBodyJobResultListJobResultJobOutputEncryption encryption) {
            this.encryption = encryption;
            return this;
        }
        public SubmitJobsResponseBodyJobResultListJobResultJobOutputEncryption getEncryption() {
            return this.encryption;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutput setWaterMarkList(SubmitJobsResponseBodyJobResultListJobResultJobOutputWaterMarkList waterMarkList) {
            this.waterMarkList = waterMarkList;
            return this;
        }
        public SubmitJobsResponseBodyJobResultListJobResultJobOutputWaterMarkList getWaterMarkList() {
            return this.waterMarkList;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutput setWaterMarkConfigUrl(String waterMarkConfigUrl) {
            this.waterMarkConfigUrl = waterMarkConfigUrl;
            return this;
        }
        public String getWaterMarkConfigUrl() {
            return this.waterMarkConfigUrl;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutput setDeWatermark(String deWatermark) {
            this.deWatermark = deWatermark;
            return this;
        }
        public String getDeWatermark() {
            return this.deWatermark;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutput setM3U8NonStandardSupport(SubmitJobsResponseBodyJobResultListJobResultJobOutputM3U8NonStandardSupport m3U8NonStandardSupport) {
            this.m3U8NonStandardSupport = m3U8NonStandardSupport;
            return this;
        }
        public SubmitJobsResponseBodyJobResultListJobResultJobOutputM3U8NonStandardSupport getM3U8NonStandardSupport() {
            return this.m3U8NonStandardSupport;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutput setPriority(String priority) {
            this.priority = priority;
            return this;
        }
        public String getPriority() {
            return this.priority;
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

        public SubmitJobsResponseBodyJobResultListJobResultJobOutput setMergeList(SubmitJobsResponseBodyJobResultListJobResultJobOutputMergeList mergeList) {
            this.mergeList = mergeList;
            return this;
        }
        public SubmitJobsResponseBodyJobResultListJobResultJobOutputMergeList getMergeList() {
            return this.mergeList;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutput setSuperReso(SubmitJobsResponseBodyJobResultListJobResultJobOutputSuperReso superReso) {
            this.superReso = superReso;
            return this;
        }
        public SubmitJobsResponseBodyJobResultListJobResultJobOutputSuperReso getSuperReso() {
            return this.superReso;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutput setUserData(String userData) {
            this.userData = userData;
            return this;
        }
        public String getUserData() {
            return this.userData;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutput setOutSubtitleList(SubmitJobsResponseBodyJobResultListJobResultJobOutputOutSubtitleList outSubtitleList) {
            this.outSubtitleList = outSubtitleList;
            return this;
        }
        public SubmitJobsResponseBodyJobResultListJobResultJobOutputOutSubtitleList getOutSubtitleList() {
            return this.outSubtitleList;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutput setDigiWaterMark(SubmitJobsResponseBodyJobResultListJobResultJobOutputDigiWaterMark digiWaterMark) {
            this.digiWaterMark = digiWaterMark;
            return this;
        }
        public SubmitJobsResponseBodyJobResultListJobResultJobOutputDigiWaterMark getDigiWaterMark() {
            return this.digiWaterMark;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutput setVideoStreamMap(String videoStreamMap) {
            this.videoStreamMap = videoStreamMap;
            return this;
        }
        public String getVideoStreamMap() {
            return this.videoStreamMap;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutput setOutputFile(SubmitJobsResponseBodyJobResultListJobResultJobOutputOutputFile outputFile) {
            this.outputFile = outputFile;
            return this;
        }
        public SubmitJobsResponseBodyJobResultListJobResultJobOutputOutputFile getOutputFile() {
            return this.outputFile;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutput setAmixList(SubmitJobsResponseBodyJobResultListJobResultJobOutputAmixList amixList) {
            this.amixList = amixList;
            return this;
        }
        public SubmitJobsResponseBodyJobResultListJobResultJobOutputAmixList getAmixList() {
            return this.amixList;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutput setRotate(String rotate) {
            this.rotate = rotate;
            return this;
        }
        public String getRotate() {
            return this.rotate;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutput setContainer(SubmitJobsResponseBodyJobResultListJobResultJobOutputContainer container) {
            this.container = container;
            return this;
        }
        public SubmitJobsResponseBodyJobResultListJobResultJobOutputContainer getContainer() {
            return this.container;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutput setClip(SubmitJobsResponseBodyJobResultListJobResultJobOutputClip clip) {
            this.clip = clip;
            return this;
        }
        public SubmitJobsResponseBodyJobResultListJobResultJobOutputClip getClip() {
            return this.clip;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutput setMergeConfigUrl(String mergeConfigUrl) {
            this.mergeConfigUrl = mergeConfigUrl;
            return this;
        }
        public String getMergeConfigUrl() {
            return this.mergeConfigUrl;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutput setOpeningList(SubmitJobsResponseBodyJobResultListJobResultJobOutputOpeningList openingList) {
            this.openingList = openingList;
            return this;
        }
        public SubmitJobsResponseBodyJobResultListJobResultJobOutputOpeningList getOpeningList() {
            return this.openingList;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutput setMuxConfig(SubmitJobsResponseBodyJobResultListJobResultJobOutputMuxConfig muxConfig) {
            this.muxConfig = muxConfig;
            return this;
        }
        public SubmitJobsResponseBodyJobResultListJobResultJobOutputMuxConfig getMuxConfig() {
            return this.muxConfig;
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

        public SubmitJobsResponseBodyJobResultListJobResultJobOutput setSubtitleConfig(SubmitJobsResponseBodyJobResultListJobResultJobOutputSubtitleConfig subtitleConfig) {
            this.subtitleConfig = subtitleConfig;
            return this;
        }
        public SubmitJobsResponseBodyJobResultListJobResultJobOutputSubtitleConfig getSubtitleConfig() {
            return this.subtitleConfig;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobOutput setProperties(SubmitJobsResponseBodyJobResultListJobResultJobOutputProperties properties) {
            this.properties = properties;
            return this;
        }
        public SubmitJobsResponseBodyJobResultListJobResultJobOutputProperties getProperties() {
            return this.properties;
        }

    }

    public static class SubmitJobsResponseBodyJobResultListJobResultJobInput extends TeaModel {
        @NameInMap("Object")
        public String object;

        @NameInMap("Location")
        public String location;

        @NameInMap("Bucket")
        public String bucket;

        public static SubmitJobsResponseBodyJobResultListJobResultJobInput build(java.util.Map<String, ?> map) throws Exception {
            SubmitJobsResponseBodyJobResultListJobResultJobInput self = new SubmitJobsResponseBodyJobResultListJobResultJobInput();
            return TeaModel.build(map, self);
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobInput setObject(String object) {
            this.object = object;
            return this;
        }
        public String getObject() {
            return this.object;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobInput setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobInput setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

    }

    public static class SubmitJobsResponseBodyJobResultListJobResultJobMNSMessageResult extends TeaModel {
        @NameInMap("MessageId")
        public String messageId;

        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("ErrorCode")
        public String errorCode;

        public static SubmitJobsResponseBodyJobResultListJobResultJobMNSMessageResult build(java.util.Map<String, ?> map) throws Exception {
            SubmitJobsResponseBodyJobResultListJobResultJobMNSMessageResult self = new SubmitJobsResponseBodyJobResultListJobResultJobMNSMessageResult();
            return TeaModel.build(map, self);
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobMNSMessageResult setMessageId(String messageId) {
            this.messageId = messageId;
            return this;
        }
        public String getMessageId() {
            return this.messageId;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobMNSMessageResult setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJobMNSMessageResult setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

    }

    public static class SubmitJobsResponseBodyJobResultListJobResultJob extends TeaModel {
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
        public SubmitJobsResponseBodyJobResultListJobResultJobOutput output;

        @NameInMap("PipelineId")
        public String pipelineId;

        @NameInMap("Input")
        public SubmitJobsResponseBodyJobResultListJobResultJobInput input;

        @NameInMap("MNSMessageResult")
        public SubmitJobsResponseBodyJobResultListJobResultJobMNSMessageResult MNSMessageResult;

        public static SubmitJobsResponseBodyJobResultListJobResultJob build(java.util.Map<String, ?> map) throws Exception {
            SubmitJobsResponseBodyJobResultListJobResultJob self = new SubmitJobsResponseBodyJobResultListJobResultJob();
            return TeaModel.build(map, self);
        }

        public SubmitJobsResponseBodyJobResultListJobResultJob setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJob setPercent(Long percent) {
            this.percent = percent;
            return this;
        }
        public Long getPercent() {
            return this.percent;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJob setFinishTime(String finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public String getFinishTime() {
            return this.finishTime;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJob setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJob setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJob setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
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

        public SubmitJobsResponseBodyJobResultListJobResultJob setPipelineId(String pipelineId) {
            this.pipelineId = pipelineId;
            return this;
        }
        public String getPipelineId() {
            return this.pipelineId;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJob setInput(SubmitJobsResponseBodyJobResultListJobResultJobInput input) {
            this.input = input;
            return this;
        }
        public SubmitJobsResponseBodyJobResultListJobResultJobInput getInput() {
            return this.input;
        }

        public SubmitJobsResponseBodyJobResultListJobResultJob setMNSMessageResult(SubmitJobsResponseBodyJobResultListJobResultJobMNSMessageResult MNSMessageResult) {
            this.MNSMessageResult = MNSMessageResult;
            return this;
        }
        public SubmitJobsResponseBodyJobResultListJobResultJobMNSMessageResult getMNSMessageResult() {
            return this.MNSMessageResult;
        }

    }

    public static class SubmitJobsResponseBodyJobResultListJobResult extends TeaModel {
        @NameInMap("Job")
        public SubmitJobsResponseBodyJobResultListJobResultJob job;

        @NameInMap("Success")
        public Boolean success;

        @NameInMap("Code")
        public String code;

        @NameInMap("Message")
        public String message;

        public static SubmitJobsResponseBodyJobResultListJobResult build(java.util.Map<String, ?> map) throws Exception {
            SubmitJobsResponseBodyJobResultListJobResult self = new SubmitJobsResponseBodyJobResultListJobResult();
            return TeaModel.build(map, self);
        }

        public SubmitJobsResponseBodyJobResultListJobResult setJob(SubmitJobsResponseBodyJobResultListJobResultJob job) {
            this.job = job;
            return this;
        }
        public SubmitJobsResponseBodyJobResultListJobResultJob getJob() {
            return this.job;
        }

        public SubmitJobsResponseBodyJobResultListJobResult setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public SubmitJobsResponseBodyJobResultListJobResult setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public SubmitJobsResponseBodyJobResultListJobResult setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
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
