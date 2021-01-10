// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class QueryEditingJobListResponseBody extends TeaModel {
    @NameInMap("NonExistJobIds")
    public QueryEditingJobListResponseBodyNonExistJobIds nonExistJobIds;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("JobList")
    public QueryEditingJobListResponseBodyJobList jobList;

    public static QueryEditingJobListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryEditingJobListResponseBody self = new QueryEditingJobListResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryEditingJobListResponseBody setNonExistJobIds(QueryEditingJobListResponseBodyNonExistJobIds nonExistJobIds) {
        this.nonExistJobIds = nonExistJobIds;
        return this;
    }
    public QueryEditingJobListResponseBodyNonExistJobIds getNonExistJobIds() {
        return this.nonExistJobIds;
    }

    public QueryEditingJobListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryEditingJobListResponseBody setJobList(QueryEditingJobListResponseBodyJobList jobList) {
        this.jobList = jobList;
        return this;
    }
    public QueryEditingJobListResponseBodyJobList getJobList() {
        return this.jobList;
    }

    public static class QueryEditingJobListResponseBodyNonExistJobIds extends TeaModel {
        @NameInMap("String")
        public java.util.List<String> string;

        public static QueryEditingJobListResponseBodyNonExistJobIds build(java.util.Map<String, ?> map) throws Exception {
            QueryEditingJobListResponseBodyNonExistJobIds self = new QueryEditingJobListResponseBodyNonExistJobIds();
            return TeaModel.build(map, self);
        }

        public QueryEditingJobListResponseBodyNonExistJobIds setString(java.util.List<String> string) {
            this.string = string;
            return this;
        }
        public java.util.List<String> getString() {
            return this.string;
        }

    }

    public static class QueryEditingJobListResponseBodyJobListJobEditingInputsEditingInputInputFile extends TeaModel {
        @NameInMap("Object")
        public String object;

        @NameInMap("Location")
        public String location;

        @NameInMap("Bucket")
        public String bucket;

        public static QueryEditingJobListResponseBodyJobListJobEditingInputsEditingInputInputFile build(java.util.Map<String, ?> map) throws Exception {
            QueryEditingJobListResponseBodyJobListJobEditingInputsEditingInputInputFile self = new QueryEditingJobListResponseBodyJobListJobEditingInputsEditingInputInputFile();
            return TeaModel.build(map, self);
        }

        public QueryEditingJobListResponseBodyJobListJobEditingInputsEditingInputInputFile setObject(String object) {
            this.object = object;
            return this;
        }
        public String getObject() {
            return this.object;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingInputsEditingInputInputFile setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingInputsEditingInputInputFile setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

    }

    public static class QueryEditingJobListResponseBodyJobListJobEditingInputsEditingInputInputConfig extends TeaModel {
        @NameInMap("IsNormalSar")
        public String isNormalSar;

        @NameInMap("DeinterlaceMethod")
        public String deinterlaceMethod;

        public static QueryEditingJobListResponseBodyJobListJobEditingInputsEditingInputInputConfig build(java.util.Map<String, ?> map) throws Exception {
            QueryEditingJobListResponseBodyJobListJobEditingInputsEditingInputInputConfig self = new QueryEditingJobListResponseBodyJobListJobEditingInputsEditingInputInputConfig();
            return TeaModel.build(map, self);
        }

        public QueryEditingJobListResponseBodyJobListJobEditingInputsEditingInputInputConfig setIsNormalSar(String isNormalSar) {
            this.isNormalSar = isNormalSar;
            return this;
        }
        public String getIsNormalSar() {
            return this.isNormalSar;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingInputsEditingInputInputConfig setDeinterlaceMethod(String deinterlaceMethod) {
            this.deinterlaceMethod = deinterlaceMethod;
            return this;
        }
        public String getDeinterlaceMethod() {
            return this.deinterlaceMethod;
        }

    }

    public static class QueryEditingJobListResponseBodyJobListJobEditingInputsEditingInput extends TeaModel {
        @NameInMap("InputFile")
        public QueryEditingJobListResponseBodyJobListJobEditingInputsEditingInputInputFile inputFile;

        @NameInMap("InputConfig")
        public QueryEditingJobListResponseBodyJobListJobEditingInputsEditingInputInputConfig inputConfig;

        @NameInMap("Id")
        public String id;

        public static QueryEditingJobListResponseBodyJobListJobEditingInputsEditingInput build(java.util.Map<String, ?> map) throws Exception {
            QueryEditingJobListResponseBodyJobListJobEditingInputsEditingInput self = new QueryEditingJobListResponseBodyJobListJobEditingInputsEditingInput();
            return TeaModel.build(map, self);
        }

        public QueryEditingJobListResponseBodyJobListJobEditingInputsEditingInput setInputFile(QueryEditingJobListResponseBodyJobListJobEditingInputsEditingInputInputFile inputFile) {
            this.inputFile = inputFile;
            return this;
        }
        public QueryEditingJobListResponseBodyJobListJobEditingInputsEditingInputInputFile getInputFile() {
            return this.inputFile;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingInputsEditingInput setInputConfig(QueryEditingJobListResponseBodyJobListJobEditingInputsEditingInputInputConfig inputConfig) {
            this.inputConfig = inputConfig;
            return this;
        }
        public QueryEditingJobListResponseBodyJobListJobEditingInputsEditingInputInputConfig getInputConfig() {
            return this.inputConfig;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingInputsEditingInput setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

    public static class QueryEditingJobListResponseBodyJobListJobEditingInputs extends TeaModel {
        @NameInMap("EditingInput")
        public java.util.List<QueryEditingJobListResponseBodyJobListJobEditingInputsEditingInput> editingInput;

        public static QueryEditingJobListResponseBodyJobListJobEditingInputs build(java.util.Map<String, ?> map) throws Exception {
            QueryEditingJobListResponseBodyJobListJobEditingInputs self = new QueryEditingJobListResponseBodyJobListJobEditingInputs();
            return TeaModel.build(map, self);
        }

        public QueryEditingJobListResponseBodyJobListJobEditingInputs setEditingInput(java.util.List<QueryEditingJobListResponseBodyJobListJobEditingInputsEditingInput> editingInput) {
            this.editingInput = editingInput;
            return this;
        }
        public java.util.List<QueryEditingJobListResponseBodyJobListJobEditingInputsEditingInput> getEditingInput() {
            return this.editingInput;
        }

    }

    public static class QueryEditingJobListResponseBodyJobListJobEditingConfigVideoBitrateBnd extends TeaModel {
        @NameInMap("Max")
        public String max;

        @NameInMap("Min")
        public String min;

        public static QueryEditingJobListResponseBodyJobListJobEditingConfigVideoBitrateBnd build(java.util.Map<String, ?> map) throws Exception {
            QueryEditingJobListResponseBodyJobListJobEditingConfigVideoBitrateBnd self = new QueryEditingJobListResponseBodyJobListJobEditingConfigVideoBitrateBnd();
            return TeaModel.build(map, self);
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigVideoBitrateBnd setMax(String max) {
            this.max = max;
            return this;
        }
        public String getMax() {
            return this.max;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigVideoBitrateBnd setMin(String min) {
            this.min = min;
            return this;
        }
        public String getMin() {
            return this.min;
        }

    }

    public static class QueryEditingJobListResponseBodyJobListJobEditingConfigVideo extends TeaModel {
        @NameInMap("Bufsize")
        public String bufsize;

        @NameInMap("Degrain")
        public String degrain;

        @NameInMap("BitrateBnd")
        public QueryEditingJobListResponseBodyJobListJobEditingConfigVideoBitrateBnd bitrateBnd;

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

        public static QueryEditingJobListResponseBodyJobListJobEditingConfigVideo build(java.util.Map<String, ?> map) throws Exception {
            QueryEditingJobListResponseBodyJobListJobEditingConfigVideo self = new QueryEditingJobListResponseBodyJobListJobEditingConfigVideo();
            return TeaModel.build(map, self);
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigVideo setBufsize(String bufsize) {
            this.bufsize = bufsize;
            return this;
        }
        public String getBufsize() {
            return this.bufsize;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigVideo setDegrain(String degrain) {
            this.degrain = degrain;
            return this;
        }
        public String getDegrain() {
            return this.degrain;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigVideo setBitrateBnd(QueryEditingJobListResponseBodyJobListJobEditingConfigVideoBitrateBnd bitrateBnd) {
            this.bitrateBnd = bitrateBnd;
            return this;
        }
        public QueryEditingJobListResponseBodyJobListJobEditingConfigVideoBitrateBnd getBitrateBnd() {
            return this.bitrateBnd;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigVideo setPixFmt(String pixFmt) {
            this.pixFmt = pixFmt;
            return this;
        }
        public String getPixFmt() {
            return this.pixFmt;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigVideo setPad(String pad) {
            this.pad = pad;
            return this;
        }
        public String getPad() {
            return this.pad;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigVideo setCodec(String codec) {
            this.codec = codec;
            return this;
        }
        public String getCodec() {
            return this.codec;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigVideo setHeight(String height) {
            this.height = height;
            return this;
        }
        public String getHeight() {
            return this.height;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigVideo setQscale(String qscale) {
            this.qscale = qscale;
            return this;
        }
        public String getQscale() {
            return this.qscale;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigVideo setCrop(String crop) {
            this.crop = crop;
            return this;
        }
        public String getCrop() {
            return this.crop;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigVideo setBitrate(String bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public String getBitrate() {
            return this.bitrate;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigVideo setMaxrate(String maxrate) {
            this.maxrate = maxrate;
            return this;
        }
        public String getMaxrate() {
            return this.maxrate;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigVideo setMaxFps(String maxFps) {
            this.maxFps = maxFps;
            return this;
        }
        public String getMaxFps() {
            return this.maxFps;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigVideo setProfile(String profile) {
            this.profile = profile;
            return this;
        }
        public String getProfile() {
            return this.profile;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigVideo setCrf(String crf) {
            this.crf = crf;
            return this;
        }
        public String getCrf() {
            return this.crf;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigVideo setGop(String gop) {
            this.gop = gop;
            return this;
        }
        public String getGop() {
            return this.gop;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigVideo setWidth(String width) {
            this.width = width;
            return this;
        }
        public String getWidth() {
            return this.width;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigVideo setFps(String fps) {
            this.fps = fps;
            return this;
        }
        public String getFps() {
            return this.fps;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigVideo setPreset(String preset) {
            this.preset = preset;
            return this;
        }
        public String getPreset() {
            return this.preset;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigVideo setScanMode(String scanMode) {
            this.scanMode = scanMode;
            return this;
        }
        public String getScanMode() {
            return this.scanMode;
        }

    }

    public static class QueryEditingJobListResponseBodyJobListJobEditingConfigTransConfig extends TeaModel {
        @NameInMap("IsCheckAudioBitrate")
        public String isCheckAudioBitrate;

        @NameInMap("IsCheckReso")
        public String isCheckReso;

        @NameInMap("TransMode")
        public String transMode;

        @NameInMap("IsCheckVideoBitrateFail")
        public String isCheckVideoBitrateFail;

        @NameInMap("AdjDarMethod")
        public String adjDarMethod;

        @NameInMap("Duration")
        public String duration;

        @NameInMap("IsCheckVideoBitrate")
        public String isCheckVideoBitrate;

        @NameInMap("IsCheckResoFail")
        public String isCheckResoFail;

        @NameInMap("IsCheckAudioBitrateFail")
        public String isCheckAudioBitrateFail;

        public static QueryEditingJobListResponseBodyJobListJobEditingConfigTransConfig build(java.util.Map<String, ?> map) throws Exception {
            QueryEditingJobListResponseBodyJobListJobEditingConfigTransConfig self = new QueryEditingJobListResponseBodyJobListJobEditingConfigTransConfig();
            return TeaModel.build(map, self);
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigTransConfig setIsCheckAudioBitrate(String isCheckAudioBitrate) {
            this.isCheckAudioBitrate = isCheckAudioBitrate;
            return this;
        }
        public String getIsCheckAudioBitrate() {
            return this.isCheckAudioBitrate;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigTransConfig setIsCheckReso(String isCheckReso) {
            this.isCheckReso = isCheckReso;
            return this;
        }
        public String getIsCheckReso() {
            return this.isCheckReso;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigTransConfig setTransMode(String transMode) {
            this.transMode = transMode;
            return this;
        }
        public String getTransMode() {
            return this.transMode;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigTransConfig setIsCheckVideoBitrateFail(String isCheckVideoBitrateFail) {
            this.isCheckVideoBitrateFail = isCheckVideoBitrateFail;
            return this;
        }
        public String getIsCheckVideoBitrateFail() {
            return this.isCheckVideoBitrateFail;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigTransConfig setAdjDarMethod(String adjDarMethod) {
            this.adjDarMethod = adjDarMethod;
            return this;
        }
        public String getAdjDarMethod() {
            return this.adjDarMethod;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigTransConfig setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigTransConfig setIsCheckVideoBitrate(String isCheckVideoBitrate) {
            this.isCheckVideoBitrate = isCheckVideoBitrate;
            return this;
        }
        public String getIsCheckVideoBitrate() {
            return this.isCheckVideoBitrate;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigTransConfig setIsCheckResoFail(String isCheckResoFail) {
            this.isCheckResoFail = isCheckResoFail;
            return this;
        }
        public String getIsCheckResoFail() {
            return this.isCheckResoFail;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigTransConfig setIsCheckAudioBitrateFail(String isCheckAudioBitrateFail) {
            this.isCheckAudioBitrateFail = isCheckAudioBitrateFail;
            return this;
        }
        public String getIsCheckAudioBitrateFail() {
            return this.isCheckAudioBitrateFail;
        }

    }

    public static class QueryEditingJobListResponseBodyJobListJobEditingConfigEncryption extends TeaModel {
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

        public static QueryEditingJobListResponseBodyJobListJobEditingConfigEncryption build(java.util.Map<String, ?> map) throws Exception {
            QueryEditingJobListResponseBodyJobListJobEditingConfigEncryption self = new QueryEditingJobListResponseBodyJobListJobEditingConfigEncryption();
            return TeaModel.build(map, self);
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigEncryption setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigEncryption setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigEncryption setKeyType(String keyType) {
            this.keyType = keyType;
            return this;
        }
        public String getKeyType() {
            return this.keyType;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigEncryption setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigEncryption setKeyUri(String keyUri) {
            this.keyUri = keyUri;
            return this;
        }
        public String getKeyUri() {
            return this.keyUri;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigEncryption setSkipCnt(String skipCnt) {
            this.skipCnt = skipCnt;
            return this;
        }
        public String getSkipCnt() {
            return this.skipCnt;
        }

    }

    public static class QueryEditingJobListResponseBodyJobListJobEditingConfigWaterMarkListWaterMarkInputFile extends TeaModel {
        @NameInMap("Object")
        public String object;

        @NameInMap("Location")
        public String location;

        @NameInMap("Bucket")
        public String bucket;

        public static QueryEditingJobListResponseBodyJobListJobEditingConfigWaterMarkListWaterMarkInputFile build(java.util.Map<String, ?> map) throws Exception {
            QueryEditingJobListResponseBodyJobListJobEditingConfigWaterMarkListWaterMarkInputFile self = new QueryEditingJobListResponseBodyJobListJobEditingConfigWaterMarkListWaterMarkInputFile();
            return TeaModel.build(map, self);
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigWaterMarkListWaterMarkInputFile setObject(String object) {
            this.object = object;
            return this;
        }
        public String getObject() {
            return this.object;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigWaterMarkListWaterMarkInputFile setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigWaterMarkListWaterMarkInputFile setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

    }

    public static class QueryEditingJobListResponseBodyJobListJobEditingConfigWaterMarkListWaterMark extends TeaModel {
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
        public QueryEditingJobListResponseBodyJobListJobEditingConfigWaterMarkListWaterMarkInputFile inputFile;

        @NameInMap("WaterMarkTemplateId")
        public String waterMarkTemplateId;

        @NameInMap("Dy")
        public String dy;

        public static QueryEditingJobListResponseBodyJobListJobEditingConfigWaterMarkListWaterMark build(java.util.Map<String, ?> map) throws Exception {
            QueryEditingJobListResponseBodyJobListJobEditingConfigWaterMarkListWaterMark self = new QueryEditingJobListResponseBodyJobListJobEditingConfigWaterMarkListWaterMark();
            return TeaModel.build(map, self);
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigWaterMarkListWaterMark setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigWaterMarkListWaterMark setReferPos(String referPos) {
            this.referPos = referPos;
            return this;
        }
        public String getReferPos() {
            return this.referPos;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigWaterMarkListWaterMark setDx(String dx) {
            this.dx = dx;
            return this;
        }
        public String getDx() {
            return this.dx;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigWaterMarkListWaterMark setWidth(String width) {
            this.width = width;
            return this;
        }
        public String getWidth() {
            return this.width;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigWaterMarkListWaterMark setHeight(String height) {
            this.height = height;
            return this;
        }
        public String getHeight() {
            return this.height;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigWaterMarkListWaterMark setInputFile(QueryEditingJobListResponseBodyJobListJobEditingConfigWaterMarkListWaterMarkInputFile inputFile) {
            this.inputFile = inputFile;
            return this;
        }
        public QueryEditingJobListResponseBodyJobListJobEditingConfigWaterMarkListWaterMarkInputFile getInputFile() {
            return this.inputFile;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigWaterMarkListWaterMark setWaterMarkTemplateId(String waterMarkTemplateId) {
            this.waterMarkTemplateId = waterMarkTemplateId;
            return this;
        }
        public String getWaterMarkTemplateId() {
            return this.waterMarkTemplateId;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigWaterMarkListWaterMark setDy(String dy) {
            this.dy = dy;
            return this;
        }
        public String getDy() {
            return this.dy;
        }

    }

    public static class QueryEditingJobListResponseBodyJobListJobEditingConfigWaterMarkList extends TeaModel {
        @NameInMap("WaterMark")
        public java.util.List<QueryEditingJobListResponseBodyJobListJobEditingConfigWaterMarkListWaterMark> waterMark;

        public static QueryEditingJobListResponseBodyJobListJobEditingConfigWaterMarkList build(java.util.Map<String, ?> map) throws Exception {
            QueryEditingJobListResponseBodyJobListJobEditingConfigWaterMarkList self = new QueryEditingJobListResponseBodyJobListJobEditingConfigWaterMarkList();
            return TeaModel.build(map, self);
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigWaterMarkList setWaterMark(java.util.List<QueryEditingJobListResponseBodyJobListJobEditingConfigWaterMarkListWaterMark> waterMark) {
            this.waterMark = waterMark;
            return this;
        }
        public java.util.List<QueryEditingJobListResponseBodyJobListJobEditingConfigWaterMarkListWaterMark> getWaterMark() {
            return this.waterMark;
        }

    }

    public static class QueryEditingJobListResponseBodyJobListJobEditingConfigM3U8NonStandardSupportTS extends TeaModel {
        @NameInMap("SizeSupport")
        public Boolean sizeSupport;

        @NameInMap("Md5Support")
        public Boolean md5Support;

        public static QueryEditingJobListResponseBodyJobListJobEditingConfigM3U8NonStandardSupportTS build(java.util.Map<String, ?> map) throws Exception {
            QueryEditingJobListResponseBodyJobListJobEditingConfigM3U8NonStandardSupportTS self = new QueryEditingJobListResponseBodyJobListJobEditingConfigM3U8NonStandardSupportTS();
            return TeaModel.build(map, self);
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigM3U8NonStandardSupportTS setSizeSupport(Boolean sizeSupport) {
            this.sizeSupport = sizeSupport;
            return this;
        }
        public Boolean getSizeSupport() {
            return this.sizeSupport;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigM3U8NonStandardSupportTS setMd5Support(Boolean md5Support) {
            this.md5Support = md5Support;
            return this;
        }
        public Boolean getMd5Support() {
            return this.md5Support;
        }

    }

    public static class QueryEditingJobListResponseBodyJobListJobEditingConfigM3U8NonStandardSupport extends TeaModel {
        @NameInMap("TS")
        public QueryEditingJobListResponseBodyJobListJobEditingConfigM3U8NonStandardSupportTS TS;

        public static QueryEditingJobListResponseBodyJobListJobEditingConfigM3U8NonStandardSupport build(java.util.Map<String, ?> map) throws Exception {
            QueryEditingJobListResponseBodyJobListJobEditingConfigM3U8NonStandardSupport self = new QueryEditingJobListResponseBodyJobListJobEditingConfigM3U8NonStandardSupport();
            return TeaModel.build(map, self);
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigM3U8NonStandardSupport setTS(QueryEditingJobListResponseBodyJobListJobEditingConfigM3U8NonStandardSupportTS TS) {
            this.TS = TS;
            return this;
        }
        public QueryEditingJobListResponseBodyJobListJobEditingConfigM3U8NonStandardSupportTS getTS() {
            return this.TS;
        }

    }

    public static class QueryEditingJobListResponseBodyJobListJobEditingConfigAudioVolume extends TeaModel {
        @NameInMap("Method")
        public String method;

        @NameInMap("Level")
        public String level;

        public static QueryEditingJobListResponseBodyJobListJobEditingConfigAudioVolume build(java.util.Map<String, ?> map) throws Exception {
            QueryEditingJobListResponseBodyJobListJobEditingConfigAudioVolume self = new QueryEditingJobListResponseBodyJobListJobEditingConfigAudioVolume();
            return TeaModel.build(map, self);
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigAudioVolume setMethod(String method) {
            this.method = method;
            return this;
        }
        public String getMethod() {
            return this.method;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigAudioVolume setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

    }

    public static class QueryEditingJobListResponseBodyJobListJobEditingConfigAudio extends TeaModel {
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
        public QueryEditingJobListResponseBodyJobListJobEditingConfigAudioVolume volume;

        @NameInMap("Bitrate")
        public String bitrate;

        public static QueryEditingJobListResponseBodyJobListJobEditingConfigAudio build(java.util.Map<String, ?> map) throws Exception {
            QueryEditingJobListResponseBodyJobListJobEditingConfigAudio self = new QueryEditingJobListResponseBodyJobListJobEditingConfigAudio();
            return TeaModel.build(map, self);
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigAudio setProfile(String profile) {
            this.profile = profile;
            return this;
        }
        public String getProfile() {
            return this.profile;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigAudio setCodec(String codec) {
            this.codec = codec;
            return this;
        }
        public String getCodec() {
            return this.codec;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigAudio setSamplerate(String samplerate) {
            this.samplerate = samplerate;
            return this;
        }
        public String getSamplerate() {
            return this.samplerate;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigAudio setQscale(String qscale) {
            this.qscale = qscale;
            return this;
        }
        public String getQscale() {
            return this.qscale;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigAudio setChannels(String channels) {
            this.channels = channels;
            return this;
        }
        public String getChannels() {
            return this.channels;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigAudio setVolume(QueryEditingJobListResponseBodyJobListJobEditingConfigAudioVolume volume) {
            this.volume = volume;
            return this;
        }
        public QueryEditingJobListResponseBodyJobListJobEditingConfigAudioVolume getVolume() {
            return this.volume;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigAudio setBitrate(String bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public String getBitrate() {
            return this.bitrate;
        }

    }

    public static class QueryEditingJobListResponseBodyJobListJobEditingConfigMergeListMerge extends TeaModel {
        @NameInMap("Start")
        public String start;

        @NameInMap("RoleArn")
        public String roleArn;

        @NameInMap("MergeURL")
        public String mergeURL;

        @NameInMap("Duration")
        public String duration;

        public static QueryEditingJobListResponseBodyJobListJobEditingConfigMergeListMerge build(java.util.Map<String, ?> map) throws Exception {
            QueryEditingJobListResponseBodyJobListJobEditingConfigMergeListMerge self = new QueryEditingJobListResponseBodyJobListJobEditingConfigMergeListMerge();
            return TeaModel.build(map, self);
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigMergeListMerge setStart(String start) {
            this.start = start;
            return this;
        }
        public String getStart() {
            return this.start;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigMergeListMerge setRoleArn(String roleArn) {
            this.roleArn = roleArn;
            return this;
        }
        public String getRoleArn() {
            return this.roleArn;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigMergeListMerge setMergeURL(String mergeURL) {
            this.mergeURL = mergeURL;
            return this;
        }
        public String getMergeURL() {
            return this.mergeURL;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigMergeListMerge setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

    }

    public static class QueryEditingJobListResponseBodyJobListJobEditingConfigMergeList extends TeaModel {
        @NameInMap("Merge")
        public java.util.List<QueryEditingJobListResponseBodyJobListJobEditingConfigMergeListMerge> merge;

        public static QueryEditingJobListResponseBodyJobListJobEditingConfigMergeList build(java.util.Map<String, ?> map) throws Exception {
            QueryEditingJobListResponseBodyJobListJobEditingConfigMergeList self = new QueryEditingJobListResponseBodyJobListJobEditingConfigMergeList();
            return TeaModel.build(map, self);
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigMergeList setMerge(java.util.List<QueryEditingJobListResponseBodyJobListJobEditingConfigMergeListMerge> merge) {
            this.merge = merge;
            return this;
        }
        public java.util.List<QueryEditingJobListResponseBodyJobListJobEditingConfigMergeListMerge> getMerge() {
            return this.merge;
        }

    }

    public static class QueryEditingJobListResponseBodyJobListJobEditingConfigSuperReso extends TeaModel {
        @NameInMap("IsHalfSample")
        public String isHalfSample;

        public static QueryEditingJobListResponseBodyJobListJobEditingConfigSuperReso build(java.util.Map<String, ?> map) throws Exception {
            QueryEditingJobListResponseBodyJobListJobEditingConfigSuperReso self = new QueryEditingJobListResponseBodyJobListJobEditingConfigSuperReso();
            return TeaModel.build(map, self);
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigSuperReso setIsHalfSample(String isHalfSample) {
            this.isHalfSample = isHalfSample;
            return this;
        }
        public String getIsHalfSample() {
            return this.isHalfSample;
        }

    }

    public static class QueryEditingJobListResponseBodyJobListJobEditingConfigDigiWaterMarkInputFile extends TeaModel {
        @NameInMap("Object")
        public String object;

        @NameInMap("Location")
        public String location;

        @NameInMap("Bucket")
        public String bucket;

        public static QueryEditingJobListResponseBodyJobListJobEditingConfigDigiWaterMarkInputFile build(java.util.Map<String, ?> map) throws Exception {
            QueryEditingJobListResponseBodyJobListJobEditingConfigDigiWaterMarkInputFile self = new QueryEditingJobListResponseBodyJobListJobEditingConfigDigiWaterMarkInputFile();
            return TeaModel.build(map, self);
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigDigiWaterMarkInputFile setObject(String object) {
            this.object = object;
            return this;
        }
        public String getObject() {
            return this.object;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigDigiWaterMarkInputFile setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigDigiWaterMarkInputFile setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

    }

    public static class QueryEditingJobListResponseBodyJobListJobEditingConfigDigiWaterMark extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("Alpha")
        public String alpha;

        @NameInMap("InputFile")
        public QueryEditingJobListResponseBodyJobListJobEditingConfigDigiWaterMarkInputFile inputFile;

        public static QueryEditingJobListResponseBodyJobListJobEditingConfigDigiWaterMark build(java.util.Map<String, ?> map) throws Exception {
            QueryEditingJobListResponseBodyJobListJobEditingConfigDigiWaterMark self = new QueryEditingJobListResponseBodyJobListJobEditingConfigDigiWaterMark();
            return TeaModel.build(map, self);
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigDigiWaterMark setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigDigiWaterMark setAlpha(String alpha) {
            this.alpha = alpha;
            return this;
        }
        public String getAlpha() {
            return this.alpha;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigDigiWaterMark setInputFile(QueryEditingJobListResponseBodyJobListJobEditingConfigDigiWaterMarkInputFile inputFile) {
            this.inputFile = inputFile;
            return this;
        }
        public QueryEditingJobListResponseBodyJobListJobEditingConfigDigiWaterMarkInputFile getInputFile() {
            return this.inputFile;
        }

    }

    public static class QueryEditingJobListResponseBodyJobListJobEditingConfigOutputFile extends TeaModel {
        @NameInMap("RoleArn")
        public String roleArn;

        @NameInMap("Object")
        public String object;

        @NameInMap("Location")
        public String location;

        @NameInMap("Bucket")
        public String bucket;

        public static QueryEditingJobListResponseBodyJobListJobEditingConfigOutputFile build(java.util.Map<String, ?> map) throws Exception {
            QueryEditingJobListResponseBodyJobListJobEditingConfigOutputFile self = new QueryEditingJobListResponseBodyJobListJobEditingConfigOutputFile();
            return TeaModel.build(map, self);
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigOutputFile setRoleArn(String roleArn) {
            this.roleArn = roleArn;
            return this;
        }
        public String getRoleArn() {
            return this.roleArn;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigOutputFile setObject(String object) {
            this.object = object;
            return this;
        }
        public String getObject() {
            return this.object;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigOutputFile setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigOutputFile setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

    }

    public static class QueryEditingJobListResponseBodyJobListJobEditingConfigEditingTimelineTrackListTrackClipsClipClipsConfigClipsConfigVideo extends TeaModel {
        @NameInMap("T")
        public String t;

        @NameInMap("L")
        public String l;

        public static QueryEditingJobListResponseBodyJobListJobEditingConfigEditingTimelineTrackListTrackClipsClipClipsConfigClipsConfigVideo build(java.util.Map<String, ?> map) throws Exception {
            QueryEditingJobListResponseBodyJobListJobEditingConfigEditingTimelineTrackListTrackClipsClipClipsConfigClipsConfigVideo self = new QueryEditingJobListResponseBodyJobListJobEditingConfigEditingTimelineTrackListTrackClipsClipClipsConfigClipsConfigVideo();
            return TeaModel.build(map, self);
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigEditingTimelineTrackListTrackClipsClipClipsConfigClipsConfigVideo setT(String t) {
            this.t = t;
            return this;
        }
        public String getT() {
            return this.t;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigEditingTimelineTrackListTrackClipsClipClipsConfigClipsConfigVideo setL(String l) {
            this.l = l;
            return this;
        }
        public String getL() {
            return this.l;
        }

    }

    public static class QueryEditingJobListResponseBodyJobListJobEditingConfigEditingTimelineTrackListTrackClipsClipClipsConfig extends TeaModel {
        @NameInMap("ClipsConfigVideo")
        public QueryEditingJobListResponseBodyJobListJobEditingConfigEditingTimelineTrackListTrackClipsClipClipsConfigClipsConfigVideo clipsConfigVideo;

        public static QueryEditingJobListResponseBodyJobListJobEditingConfigEditingTimelineTrackListTrackClipsClipClipsConfig build(java.util.Map<String, ?> map) throws Exception {
            QueryEditingJobListResponseBodyJobListJobEditingConfigEditingTimelineTrackListTrackClipsClipClipsConfig self = new QueryEditingJobListResponseBodyJobListJobEditingConfigEditingTimelineTrackListTrackClipsClipClipsConfig();
            return TeaModel.build(map, self);
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigEditingTimelineTrackListTrackClipsClipClipsConfig setClipsConfigVideo(QueryEditingJobListResponseBodyJobListJobEditingConfigEditingTimelineTrackListTrackClipsClipClipsConfigClipsConfigVideo clipsConfigVideo) {
            this.clipsConfigVideo = clipsConfigVideo;
            return this;
        }
        public QueryEditingJobListResponseBodyJobListJobEditingConfigEditingTimelineTrackListTrackClipsClipClipsConfigClipsConfigVideo getClipsConfigVideo() {
            return this.clipsConfigVideo;
        }

    }

    public static class QueryEditingJobListResponseBodyJobListJobEditingConfigEditingTimelineTrackListTrackClipsClip extends TeaModel {
        @NameInMap("ClipsConfig")
        public QueryEditingJobListResponseBodyJobListJobEditingConfigEditingTimelineTrackListTrackClipsClipClipsConfig clipsConfig;

        @NameInMap("Out")
        public String out;

        @NameInMap("In")
        public String in;

        @NameInMap("clipID")
        public String clipID;

        public static QueryEditingJobListResponseBodyJobListJobEditingConfigEditingTimelineTrackListTrackClipsClip build(java.util.Map<String, ?> map) throws Exception {
            QueryEditingJobListResponseBodyJobListJobEditingConfigEditingTimelineTrackListTrackClipsClip self = new QueryEditingJobListResponseBodyJobListJobEditingConfigEditingTimelineTrackListTrackClipsClip();
            return TeaModel.build(map, self);
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigEditingTimelineTrackListTrackClipsClip setClipsConfig(QueryEditingJobListResponseBodyJobListJobEditingConfigEditingTimelineTrackListTrackClipsClipClipsConfig clipsConfig) {
            this.clipsConfig = clipsConfig;
            return this;
        }
        public QueryEditingJobListResponseBodyJobListJobEditingConfigEditingTimelineTrackListTrackClipsClipClipsConfig getClipsConfig() {
            return this.clipsConfig;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigEditingTimelineTrackListTrackClipsClip setOut(String out) {
            this.out = out;
            return this;
        }
        public String getOut() {
            return this.out;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigEditingTimelineTrackListTrackClipsClip setIn(String in) {
            this.in = in;
            return this;
        }
        public String getIn() {
            return this.in;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigEditingTimelineTrackListTrackClipsClip setClipID(String clipID) {
            this.clipID = clipID;
            return this;
        }
        public String getClipID() {
            return this.clipID;
        }

    }

    public static class QueryEditingJobListResponseBodyJobListJobEditingConfigEditingTimelineTrackListTrackClips extends TeaModel {
        @NameInMap("Clip")
        public java.util.List<QueryEditingJobListResponseBodyJobListJobEditingConfigEditingTimelineTrackListTrackClipsClip> clip;

        public static QueryEditingJobListResponseBodyJobListJobEditingConfigEditingTimelineTrackListTrackClips build(java.util.Map<String, ?> map) throws Exception {
            QueryEditingJobListResponseBodyJobListJobEditingConfigEditingTimelineTrackListTrackClips self = new QueryEditingJobListResponseBodyJobListJobEditingConfigEditingTimelineTrackListTrackClips();
            return TeaModel.build(map, self);
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigEditingTimelineTrackListTrackClips setClip(java.util.List<QueryEditingJobListResponseBodyJobListJobEditingConfigEditingTimelineTrackListTrackClipsClip> clip) {
            this.clip = clip;
            return this;
        }
        public java.util.List<QueryEditingJobListResponseBodyJobListJobEditingConfigEditingTimelineTrackListTrackClipsClip> getClip() {
            return this.clip;
        }

    }

    public static class QueryEditingJobListResponseBodyJobListJobEditingConfigEditingTimelineTrackListTrack extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("Order")
        public String order;

        @NameInMap("Id")
        public String id;

        @NameInMap("Clips")
        public QueryEditingJobListResponseBodyJobListJobEditingConfigEditingTimelineTrackListTrackClips clips;

        public static QueryEditingJobListResponseBodyJobListJobEditingConfigEditingTimelineTrackListTrack build(java.util.Map<String, ?> map) throws Exception {
            QueryEditingJobListResponseBodyJobListJobEditingConfigEditingTimelineTrackListTrack self = new QueryEditingJobListResponseBodyJobListJobEditingConfigEditingTimelineTrackListTrack();
            return TeaModel.build(map, self);
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigEditingTimelineTrackListTrack setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigEditingTimelineTrackListTrack setOrder(String order) {
            this.order = order;
            return this;
        }
        public String getOrder() {
            return this.order;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigEditingTimelineTrackListTrack setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigEditingTimelineTrackListTrack setClips(QueryEditingJobListResponseBodyJobListJobEditingConfigEditingTimelineTrackListTrackClips clips) {
            this.clips = clips;
            return this;
        }
        public QueryEditingJobListResponseBodyJobListJobEditingConfigEditingTimelineTrackListTrackClips getClips() {
            return this.clips;
        }

    }

    public static class QueryEditingJobListResponseBodyJobListJobEditingConfigEditingTimelineTrackList extends TeaModel {
        @NameInMap("Track")
        public java.util.List<QueryEditingJobListResponseBodyJobListJobEditingConfigEditingTimelineTrackListTrack> track;

        public static QueryEditingJobListResponseBodyJobListJobEditingConfigEditingTimelineTrackList build(java.util.Map<String, ?> map) throws Exception {
            QueryEditingJobListResponseBodyJobListJobEditingConfigEditingTimelineTrackList self = new QueryEditingJobListResponseBodyJobListJobEditingConfigEditingTimelineTrackList();
            return TeaModel.build(map, self);
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigEditingTimelineTrackList setTrack(java.util.List<QueryEditingJobListResponseBodyJobListJobEditingConfigEditingTimelineTrackListTrack> track) {
            this.track = track;
            return this;
        }
        public java.util.List<QueryEditingJobListResponseBodyJobListJobEditingConfigEditingTimelineTrackListTrack> getTrack() {
            return this.track;
        }

    }

    public static class QueryEditingJobListResponseBodyJobListJobEditingConfigEditingTimelineTimelineConfigTimelineConfigAudio extends TeaModel {
        @NameInMap("ChannelLayout")
        public String channelLayout;

        @NameInMap("Samplerate")
        public String samplerate;

        @NameInMap("Channels")
        public String channels;

        public static QueryEditingJobListResponseBodyJobListJobEditingConfigEditingTimelineTimelineConfigTimelineConfigAudio build(java.util.Map<String, ?> map) throws Exception {
            QueryEditingJobListResponseBodyJobListJobEditingConfigEditingTimelineTimelineConfigTimelineConfigAudio self = new QueryEditingJobListResponseBodyJobListJobEditingConfigEditingTimelineTimelineConfigTimelineConfigAudio();
            return TeaModel.build(map, self);
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigEditingTimelineTimelineConfigTimelineConfigAudio setChannelLayout(String channelLayout) {
            this.channelLayout = channelLayout;
            return this;
        }
        public String getChannelLayout() {
            return this.channelLayout;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigEditingTimelineTimelineConfigTimelineConfigAudio setSamplerate(String samplerate) {
            this.samplerate = samplerate;
            return this;
        }
        public String getSamplerate() {
            return this.samplerate;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigEditingTimelineTimelineConfigTimelineConfigAudio setChannels(String channels) {
            this.channels = channels;
            return this;
        }
        public String getChannels() {
            return this.channels;
        }

    }

    public static class QueryEditingJobListResponseBodyJobListJobEditingConfigEditingTimelineTimelineConfigTimelineConfigVideo extends TeaModel {
        @NameInMap("BgColor")
        public String bgColor;

        @NameInMap("Width")
        public String width;

        @NameInMap("RenderRatio")
        public String renderRatio;

        @NameInMap("IsGpuData")
        public String isGpuData;

        @NameInMap("Height")
        public String height;

        @NameInMap("IsOneTrackData")
        public String isOneTrackData;

        @NameInMap("Fps")
        public String fps;

        @NameInMap("ReclosePrec")
        public String reclosePrec;

        public static QueryEditingJobListResponseBodyJobListJobEditingConfigEditingTimelineTimelineConfigTimelineConfigVideo build(java.util.Map<String, ?> map) throws Exception {
            QueryEditingJobListResponseBodyJobListJobEditingConfigEditingTimelineTimelineConfigTimelineConfigVideo self = new QueryEditingJobListResponseBodyJobListJobEditingConfigEditingTimelineTimelineConfigTimelineConfigVideo();
            return TeaModel.build(map, self);
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigEditingTimelineTimelineConfigTimelineConfigVideo setBgColor(String bgColor) {
            this.bgColor = bgColor;
            return this;
        }
        public String getBgColor() {
            return this.bgColor;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigEditingTimelineTimelineConfigTimelineConfigVideo setWidth(String width) {
            this.width = width;
            return this;
        }
        public String getWidth() {
            return this.width;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigEditingTimelineTimelineConfigTimelineConfigVideo setRenderRatio(String renderRatio) {
            this.renderRatio = renderRatio;
            return this;
        }
        public String getRenderRatio() {
            return this.renderRatio;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigEditingTimelineTimelineConfigTimelineConfigVideo setIsGpuData(String isGpuData) {
            this.isGpuData = isGpuData;
            return this;
        }
        public String getIsGpuData() {
            return this.isGpuData;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigEditingTimelineTimelineConfigTimelineConfigVideo setHeight(String height) {
            this.height = height;
            return this;
        }
        public String getHeight() {
            return this.height;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigEditingTimelineTimelineConfigTimelineConfigVideo setIsOneTrackData(String isOneTrackData) {
            this.isOneTrackData = isOneTrackData;
            return this;
        }
        public String getIsOneTrackData() {
            return this.isOneTrackData;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigEditingTimelineTimelineConfigTimelineConfigVideo setFps(String fps) {
            this.fps = fps;
            return this;
        }
        public String getFps() {
            return this.fps;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigEditingTimelineTimelineConfigTimelineConfigVideo setReclosePrec(String reclosePrec) {
            this.reclosePrec = reclosePrec;
            return this;
        }
        public String getReclosePrec() {
            return this.reclosePrec;
        }

    }

    public static class QueryEditingJobListResponseBodyJobListJobEditingConfigEditingTimelineTimelineConfig extends TeaModel {
        @NameInMap("TimelineConfigAudio")
        public QueryEditingJobListResponseBodyJobListJobEditingConfigEditingTimelineTimelineConfigTimelineConfigAudio timelineConfigAudio;

        @NameInMap("TimelineConfigVideo")
        public QueryEditingJobListResponseBodyJobListJobEditingConfigEditingTimelineTimelineConfigTimelineConfigVideo timelineConfigVideo;

        public static QueryEditingJobListResponseBodyJobListJobEditingConfigEditingTimelineTimelineConfig build(java.util.Map<String, ?> map) throws Exception {
            QueryEditingJobListResponseBodyJobListJobEditingConfigEditingTimelineTimelineConfig self = new QueryEditingJobListResponseBodyJobListJobEditingConfigEditingTimelineTimelineConfig();
            return TeaModel.build(map, self);
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigEditingTimelineTimelineConfig setTimelineConfigAudio(QueryEditingJobListResponseBodyJobListJobEditingConfigEditingTimelineTimelineConfigTimelineConfigAudio timelineConfigAudio) {
            this.timelineConfigAudio = timelineConfigAudio;
            return this;
        }
        public QueryEditingJobListResponseBodyJobListJobEditingConfigEditingTimelineTimelineConfigTimelineConfigAudio getTimelineConfigAudio() {
            return this.timelineConfigAudio;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigEditingTimelineTimelineConfig setTimelineConfigVideo(QueryEditingJobListResponseBodyJobListJobEditingConfigEditingTimelineTimelineConfigTimelineConfigVideo timelineConfigVideo) {
            this.timelineConfigVideo = timelineConfigVideo;
            return this;
        }
        public QueryEditingJobListResponseBodyJobListJobEditingConfigEditingTimelineTimelineConfigTimelineConfigVideo getTimelineConfigVideo() {
            return this.timelineConfigVideo;
        }

    }

    public static class QueryEditingJobListResponseBodyJobListJobEditingConfigEditingTimeline extends TeaModel {
        @NameInMap("TrackList")
        public QueryEditingJobListResponseBodyJobListJobEditingConfigEditingTimelineTrackList trackList;

        @NameInMap("TimelineConfig")
        public QueryEditingJobListResponseBodyJobListJobEditingConfigEditingTimelineTimelineConfig timelineConfig;

        public static QueryEditingJobListResponseBodyJobListJobEditingConfigEditingTimeline build(java.util.Map<String, ?> map) throws Exception {
            QueryEditingJobListResponseBodyJobListJobEditingConfigEditingTimeline self = new QueryEditingJobListResponseBodyJobListJobEditingConfigEditingTimeline();
            return TeaModel.build(map, self);
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigEditingTimeline setTrackList(QueryEditingJobListResponseBodyJobListJobEditingConfigEditingTimelineTrackList trackList) {
            this.trackList = trackList;
            return this;
        }
        public QueryEditingJobListResponseBodyJobListJobEditingConfigEditingTimelineTrackList getTrackList() {
            return this.trackList;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigEditingTimeline setTimelineConfig(QueryEditingJobListResponseBodyJobListJobEditingConfigEditingTimelineTimelineConfig timelineConfig) {
            this.timelineConfig = timelineConfig;
            return this;
        }
        public QueryEditingJobListResponseBodyJobListJobEditingConfigEditingTimelineTimelineConfig getTimelineConfig() {
            return this.timelineConfig;
        }

    }

    public static class QueryEditingJobListResponseBodyJobListJobEditingConfigEditingClipListClipEffectsEffect extends TeaModel {
        @NameInMap("Effect")
        public String effect;

        @NameInMap("EffectConfig")
        public String effectConfig;

        public static QueryEditingJobListResponseBodyJobListJobEditingConfigEditingClipListClipEffectsEffect build(java.util.Map<String, ?> map) throws Exception {
            QueryEditingJobListResponseBodyJobListJobEditingConfigEditingClipListClipEffectsEffect self = new QueryEditingJobListResponseBodyJobListJobEditingConfigEditingClipListClipEffectsEffect();
            return TeaModel.build(map, self);
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigEditingClipListClipEffectsEffect setEffect(String effect) {
            this.effect = effect;
            return this;
        }
        public String getEffect() {
            return this.effect;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigEditingClipListClipEffectsEffect setEffectConfig(String effectConfig) {
            this.effectConfig = effectConfig;
            return this;
        }
        public String getEffectConfig() {
            return this.effectConfig;
        }

    }

    public static class QueryEditingJobListResponseBodyJobListJobEditingConfigEditingClipListClipEffects extends TeaModel {
        @NameInMap("Effect")
        public java.util.List<QueryEditingJobListResponseBodyJobListJobEditingConfigEditingClipListClipEffectsEffect> effect;

        public static QueryEditingJobListResponseBodyJobListJobEditingConfigEditingClipListClipEffects build(java.util.Map<String, ?> map) throws Exception {
            QueryEditingJobListResponseBodyJobListJobEditingConfigEditingClipListClipEffects self = new QueryEditingJobListResponseBodyJobListJobEditingConfigEditingClipListClipEffects();
            return TeaModel.build(map, self);
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigEditingClipListClipEffects setEffect(java.util.List<QueryEditingJobListResponseBodyJobListJobEditingConfigEditingClipListClipEffectsEffect> effect) {
            this.effect = effect;
            return this;
        }
        public java.util.List<QueryEditingJobListResponseBodyJobListJobEditingConfigEditingClipListClipEffectsEffect> getEffect() {
            return this.effect;
        }

    }

    public static class QueryEditingJobListResponseBodyJobListJobEditingConfigEditingClipListClip extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("SourceID")
        public String sourceID;

        @NameInMap("Effects")
        public QueryEditingJobListResponseBodyJobListJobEditingConfigEditingClipListClipEffects effects;

        @NameInMap("SourceType")
        public String sourceType;

        @NameInMap("SourceStrmMap")
        public String sourceStrmMap;

        @NameInMap("Out")
        public String out;

        @NameInMap("In")
        public String in;

        @NameInMap("Id")
        public String id;

        public static QueryEditingJobListResponseBodyJobListJobEditingConfigEditingClipListClip build(java.util.Map<String, ?> map) throws Exception {
            QueryEditingJobListResponseBodyJobListJobEditingConfigEditingClipListClip self = new QueryEditingJobListResponseBodyJobListJobEditingConfigEditingClipListClip();
            return TeaModel.build(map, self);
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigEditingClipListClip setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigEditingClipListClip setSourceID(String sourceID) {
            this.sourceID = sourceID;
            return this;
        }
        public String getSourceID() {
            return this.sourceID;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigEditingClipListClip setEffects(QueryEditingJobListResponseBodyJobListJobEditingConfigEditingClipListClipEffects effects) {
            this.effects = effects;
            return this;
        }
        public QueryEditingJobListResponseBodyJobListJobEditingConfigEditingClipListClipEffects getEffects() {
            return this.effects;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigEditingClipListClip setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigEditingClipListClip setSourceStrmMap(String sourceStrmMap) {
            this.sourceStrmMap = sourceStrmMap;
            return this;
        }
        public String getSourceStrmMap() {
            return this.sourceStrmMap;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigEditingClipListClip setOut(String out) {
            this.out = out;
            return this;
        }
        public String getOut() {
            return this.out;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigEditingClipListClip setIn(String in) {
            this.in = in;
            return this;
        }
        public String getIn() {
            return this.in;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigEditingClipListClip setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

    public static class QueryEditingJobListResponseBodyJobListJobEditingConfigEditingClipList extends TeaModel {
        @NameInMap("Clip")
        public java.util.List<QueryEditingJobListResponseBodyJobListJobEditingConfigEditingClipListClip> clip;

        public static QueryEditingJobListResponseBodyJobListJobEditingConfigEditingClipList build(java.util.Map<String, ?> map) throws Exception {
            QueryEditingJobListResponseBodyJobListJobEditingConfigEditingClipList self = new QueryEditingJobListResponseBodyJobListJobEditingConfigEditingClipList();
            return TeaModel.build(map, self);
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigEditingClipList setClip(java.util.List<QueryEditingJobListResponseBodyJobListJobEditingConfigEditingClipListClip> clip) {
            this.clip = clip;
            return this;
        }
        public java.util.List<QueryEditingJobListResponseBodyJobListJobEditingConfigEditingClipListClip> getClip() {
            return this.clip;
        }

    }

    public static class QueryEditingJobListResponseBodyJobListJobEditingConfigEditing extends TeaModel {
        @NameInMap("Timeline")
        public QueryEditingJobListResponseBodyJobListJobEditingConfigEditingTimeline timeline;

        @NameInMap("ClipList")
        public QueryEditingJobListResponseBodyJobListJobEditingConfigEditingClipList clipList;

        public static QueryEditingJobListResponseBodyJobListJobEditingConfigEditing build(java.util.Map<String, ?> map) throws Exception {
            QueryEditingJobListResponseBodyJobListJobEditingConfigEditing self = new QueryEditingJobListResponseBodyJobListJobEditingConfigEditing();
            return TeaModel.build(map, self);
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigEditing setTimeline(QueryEditingJobListResponseBodyJobListJobEditingConfigEditingTimeline timeline) {
            this.timeline = timeline;
            return this;
        }
        public QueryEditingJobListResponseBodyJobListJobEditingConfigEditingTimeline getTimeline() {
            return this.timeline;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigEditing setClipList(QueryEditingJobListResponseBodyJobListJobEditingConfigEditingClipList clipList) {
            this.clipList = clipList;
            return this;
        }
        public QueryEditingJobListResponseBodyJobListJobEditingConfigEditingClipList getClipList() {
            return this.clipList;
        }

    }

    public static class QueryEditingJobListResponseBodyJobListJobEditingConfigContainer extends TeaModel {
        @NameInMap("Format")
        public String format;

        public static QueryEditingJobListResponseBodyJobListJobEditingConfigContainer build(java.util.Map<String, ?> map) throws Exception {
            QueryEditingJobListResponseBodyJobListJobEditingConfigContainer self = new QueryEditingJobListResponseBodyJobListJobEditingConfigContainer();
            return TeaModel.build(map, self);
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigContainer setFormat(String format) {
            this.format = format;
            return this;
        }
        public String getFormat() {
            return this.format;
        }

    }

    public static class QueryEditingJobListResponseBodyJobListJobEditingConfigClipTimeSpan extends TeaModel {
        @NameInMap("Seek")
        public String seek;

        @NameInMap("Duration")
        public String duration;

        public static QueryEditingJobListResponseBodyJobListJobEditingConfigClipTimeSpan build(java.util.Map<String, ?> map) throws Exception {
            QueryEditingJobListResponseBodyJobListJobEditingConfigClipTimeSpan self = new QueryEditingJobListResponseBodyJobListJobEditingConfigClipTimeSpan();
            return TeaModel.build(map, self);
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigClipTimeSpan setSeek(String seek) {
            this.seek = seek;
            return this;
        }
        public String getSeek() {
            return this.seek;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigClipTimeSpan setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

    }

    public static class QueryEditingJobListResponseBodyJobListJobEditingConfigClip extends TeaModel {
        @NameInMap("TimeSpan")
        public QueryEditingJobListResponseBodyJobListJobEditingConfigClipTimeSpan timeSpan;

        public static QueryEditingJobListResponseBodyJobListJobEditingConfigClip build(java.util.Map<String, ?> map) throws Exception {
            QueryEditingJobListResponseBodyJobListJobEditingConfigClip self = new QueryEditingJobListResponseBodyJobListJobEditingConfigClip();
            return TeaModel.build(map, self);
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigClip setTimeSpan(QueryEditingJobListResponseBodyJobListJobEditingConfigClipTimeSpan timeSpan) {
            this.timeSpan = timeSpan;
            return this;
        }
        public QueryEditingJobListResponseBodyJobListJobEditingConfigClipTimeSpan getTimeSpan() {
            return this.timeSpan;
        }

    }

    public static class QueryEditingJobListResponseBodyJobListJobEditingConfigMuxConfigGif extends TeaModel {
        @NameInMap("FinalDelay")
        public String finalDelay;

        @NameInMap("DitherMode")
        public String ditherMode;

        @NameInMap("Loop")
        public String loop;

        @NameInMap("IsCustomPalette")
        public String isCustomPalette;

        public static QueryEditingJobListResponseBodyJobListJobEditingConfigMuxConfigGif build(java.util.Map<String, ?> map) throws Exception {
            QueryEditingJobListResponseBodyJobListJobEditingConfigMuxConfigGif self = new QueryEditingJobListResponseBodyJobListJobEditingConfigMuxConfigGif();
            return TeaModel.build(map, self);
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigMuxConfigGif setFinalDelay(String finalDelay) {
            this.finalDelay = finalDelay;
            return this;
        }
        public String getFinalDelay() {
            return this.finalDelay;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigMuxConfigGif setDitherMode(String ditherMode) {
            this.ditherMode = ditherMode;
            return this;
        }
        public String getDitherMode() {
            return this.ditherMode;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigMuxConfigGif setLoop(String loop) {
            this.loop = loop;
            return this;
        }
        public String getLoop() {
            return this.loop;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigMuxConfigGif setIsCustomPalette(String isCustomPalette) {
            this.isCustomPalette = isCustomPalette;
            return this;
        }
        public String getIsCustomPalette() {
            return this.isCustomPalette;
        }

    }

    public static class QueryEditingJobListResponseBodyJobListJobEditingConfigMuxConfigSegment extends TeaModel {
        @NameInMap("Duration")
        public String duration;

        public static QueryEditingJobListResponseBodyJobListJobEditingConfigMuxConfigSegment build(java.util.Map<String, ?> map) throws Exception {
            QueryEditingJobListResponseBodyJobListJobEditingConfigMuxConfigSegment self = new QueryEditingJobListResponseBodyJobListJobEditingConfigMuxConfigSegment();
            return TeaModel.build(map, self);
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigMuxConfigSegment setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

    }

    public static class QueryEditingJobListResponseBodyJobListJobEditingConfigMuxConfig extends TeaModel {
        @NameInMap("Gif")
        public QueryEditingJobListResponseBodyJobListJobEditingConfigMuxConfigGif gif;

        @NameInMap("Segment")
        public QueryEditingJobListResponseBodyJobListJobEditingConfigMuxConfigSegment segment;

        public static QueryEditingJobListResponseBodyJobListJobEditingConfigMuxConfig build(java.util.Map<String, ?> map) throws Exception {
            QueryEditingJobListResponseBodyJobListJobEditingConfigMuxConfig self = new QueryEditingJobListResponseBodyJobListJobEditingConfigMuxConfig();
            return TeaModel.build(map, self);
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigMuxConfig setGif(QueryEditingJobListResponseBodyJobListJobEditingConfigMuxConfigGif gif) {
            this.gif = gif;
            return this;
        }
        public QueryEditingJobListResponseBodyJobListJobEditingConfigMuxConfigGif getGif() {
            return this.gif;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigMuxConfig setSegment(QueryEditingJobListResponseBodyJobListJobEditingConfigMuxConfigSegment segment) {
            this.segment = segment;
            return this;
        }
        public QueryEditingJobListResponseBodyJobListJobEditingConfigMuxConfigSegment getSegment() {
            return this.segment;
        }

    }

    public static class QueryEditingJobListResponseBodyJobListJobEditingConfigSubtitleConfigExtSubtitleListExtSubtitleInput extends TeaModel {
        @NameInMap("Object")
        public String object;

        @NameInMap("Location")
        public String location;

        @NameInMap("Bucket")
        public String bucket;

        public static QueryEditingJobListResponseBodyJobListJobEditingConfigSubtitleConfigExtSubtitleListExtSubtitleInput build(java.util.Map<String, ?> map) throws Exception {
            QueryEditingJobListResponseBodyJobListJobEditingConfigSubtitleConfigExtSubtitleListExtSubtitleInput self = new QueryEditingJobListResponseBodyJobListJobEditingConfigSubtitleConfigExtSubtitleListExtSubtitleInput();
            return TeaModel.build(map, self);
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigSubtitleConfigExtSubtitleListExtSubtitleInput setObject(String object) {
            this.object = object;
            return this;
        }
        public String getObject() {
            return this.object;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigSubtitleConfigExtSubtitleListExtSubtitleInput setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigSubtitleConfigExtSubtitleListExtSubtitleInput setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

    }

    public static class QueryEditingJobListResponseBodyJobListJobEditingConfigSubtitleConfigExtSubtitleListExtSubtitle extends TeaModel {
        @NameInMap("CharEnc")
        public String charEnc;

        @NameInMap("FontName")
        public String fontName;

        @NameInMap("Input")
        public QueryEditingJobListResponseBodyJobListJobEditingConfigSubtitleConfigExtSubtitleListExtSubtitleInput input;

        public static QueryEditingJobListResponseBodyJobListJobEditingConfigSubtitleConfigExtSubtitleListExtSubtitle build(java.util.Map<String, ?> map) throws Exception {
            QueryEditingJobListResponseBodyJobListJobEditingConfigSubtitleConfigExtSubtitleListExtSubtitle self = new QueryEditingJobListResponseBodyJobListJobEditingConfigSubtitleConfigExtSubtitleListExtSubtitle();
            return TeaModel.build(map, self);
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigSubtitleConfigExtSubtitleListExtSubtitle setCharEnc(String charEnc) {
            this.charEnc = charEnc;
            return this;
        }
        public String getCharEnc() {
            return this.charEnc;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigSubtitleConfigExtSubtitleListExtSubtitle setFontName(String fontName) {
            this.fontName = fontName;
            return this;
        }
        public String getFontName() {
            return this.fontName;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigSubtitleConfigExtSubtitleListExtSubtitle setInput(QueryEditingJobListResponseBodyJobListJobEditingConfigSubtitleConfigExtSubtitleListExtSubtitleInput input) {
            this.input = input;
            return this;
        }
        public QueryEditingJobListResponseBodyJobListJobEditingConfigSubtitleConfigExtSubtitleListExtSubtitleInput getInput() {
            return this.input;
        }

    }

    public static class QueryEditingJobListResponseBodyJobListJobEditingConfigSubtitleConfigExtSubtitleList extends TeaModel {
        @NameInMap("ExtSubtitle")
        public java.util.List<QueryEditingJobListResponseBodyJobListJobEditingConfigSubtitleConfigExtSubtitleListExtSubtitle> extSubtitle;

        public static QueryEditingJobListResponseBodyJobListJobEditingConfigSubtitleConfigExtSubtitleList build(java.util.Map<String, ?> map) throws Exception {
            QueryEditingJobListResponseBodyJobListJobEditingConfigSubtitleConfigExtSubtitleList self = new QueryEditingJobListResponseBodyJobListJobEditingConfigSubtitleConfigExtSubtitleList();
            return TeaModel.build(map, self);
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigSubtitleConfigExtSubtitleList setExtSubtitle(java.util.List<QueryEditingJobListResponseBodyJobListJobEditingConfigSubtitleConfigExtSubtitleListExtSubtitle> extSubtitle) {
            this.extSubtitle = extSubtitle;
            return this;
        }
        public java.util.List<QueryEditingJobListResponseBodyJobListJobEditingConfigSubtitleConfigExtSubtitleListExtSubtitle> getExtSubtitle() {
            return this.extSubtitle;
        }

    }

    public static class QueryEditingJobListResponseBodyJobListJobEditingConfigSubtitleConfigSubtitleListSubtitle extends TeaModel {
        @NameInMap("Map")
        public String map;

        public static QueryEditingJobListResponseBodyJobListJobEditingConfigSubtitleConfigSubtitleListSubtitle build(java.util.Map<String, ?> map) throws Exception {
            QueryEditingJobListResponseBodyJobListJobEditingConfigSubtitleConfigSubtitleListSubtitle self = new QueryEditingJobListResponseBodyJobListJobEditingConfigSubtitleConfigSubtitleListSubtitle();
            return TeaModel.build(map, self);
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigSubtitleConfigSubtitleListSubtitle setMap(String map) {
            this.map = map;
            return this;
        }
        public String getMap() {
            return this.map;
        }

    }

    public static class QueryEditingJobListResponseBodyJobListJobEditingConfigSubtitleConfigSubtitleList extends TeaModel {
        @NameInMap("Subtitle")
        public java.util.List<QueryEditingJobListResponseBodyJobListJobEditingConfigSubtitleConfigSubtitleListSubtitle> subtitle;

        public static QueryEditingJobListResponseBodyJobListJobEditingConfigSubtitleConfigSubtitleList build(java.util.Map<String, ?> map) throws Exception {
            QueryEditingJobListResponseBodyJobListJobEditingConfigSubtitleConfigSubtitleList self = new QueryEditingJobListResponseBodyJobListJobEditingConfigSubtitleConfigSubtitleList();
            return TeaModel.build(map, self);
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigSubtitleConfigSubtitleList setSubtitle(java.util.List<QueryEditingJobListResponseBodyJobListJobEditingConfigSubtitleConfigSubtitleListSubtitle> subtitle) {
            this.subtitle = subtitle;
            return this;
        }
        public java.util.List<QueryEditingJobListResponseBodyJobListJobEditingConfigSubtitleConfigSubtitleListSubtitle> getSubtitle() {
            return this.subtitle;
        }

    }

    public static class QueryEditingJobListResponseBodyJobListJobEditingConfigSubtitleConfig extends TeaModel {
        @NameInMap("ExtSubtitleList")
        public QueryEditingJobListResponseBodyJobListJobEditingConfigSubtitleConfigExtSubtitleList extSubtitleList;

        @NameInMap("SubtitleList")
        public QueryEditingJobListResponseBodyJobListJobEditingConfigSubtitleConfigSubtitleList subtitleList;

        public static QueryEditingJobListResponseBodyJobListJobEditingConfigSubtitleConfig build(java.util.Map<String, ?> map) throws Exception {
            QueryEditingJobListResponseBodyJobListJobEditingConfigSubtitleConfig self = new QueryEditingJobListResponseBodyJobListJobEditingConfigSubtitleConfig();
            return TeaModel.build(map, self);
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigSubtitleConfig setExtSubtitleList(QueryEditingJobListResponseBodyJobListJobEditingConfigSubtitleConfigExtSubtitleList extSubtitleList) {
            this.extSubtitleList = extSubtitleList;
            return this;
        }
        public QueryEditingJobListResponseBodyJobListJobEditingConfigSubtitleConfigExtSubtitleList getExtSubtitleList() {
            return this.extSubtitleList;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigSubtitleConfig setSubtitleList(QueryEditingJobListResponseBodyJobListJobEditingConfigSubtitleConfigSubtitleList subtitleList) {
            this.subtitleList = subtitleList;
            return this;
        }
        public QueryEditingJobListResponseBodyJobListJobEditingConfigSubtitleConfigSubtitleList getSubtitleList() {
            return this.subtitleList;
        }

    }

    public static class QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreamsVideoStreamListVideoStreamNetworkCost extends TeaModel {
        @NameInMap("PreloadTime")
        public String preloadTime;

        @NameInMap("AvgBitrate")
        public String avgBitrate;

        @NameInMap("CostBandwidth")
        public String costBandwidth;

        public static QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreamsVideoStreamListVideoStreamNetworkCost build(java.util.Map<String, ?> map) throws Exception {
            QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreamsVideoStreamListVideoStreamNetworkCost self = new QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreamsVideoStreamListVideoStreamNetworkCost();
            return TeaModel.build(map, self);
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreamsVideoStreamListVideoStreamNetworkCost setPreloadTime(String preloadTime) {
            this.preloadTime = preloadTime;
            return this;
        }
        public String getPreloadTime() {
            return this.preloadTime;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreamsVideoStreamListVideoStreamNetworkCost setAvgBitrate(String avgBitrate) {
            this.avgBitrate = avgBitrate;
            return this;
        }
        public String getAvgBitrate() {
            return this.avgBitrate;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreamsVideoStreamListVideoStreamNetworkCost setCostBandwidth(String costBandwidth) {
            this.costBandwidth = costBandwidth;
            return this;
        }
        public String getCostBandwidth() {
            return this.costBandwidth;
        }

    }

    public static class QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreamsVideoStreamListVideoStream extends TeaModel {
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
        public QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreamsVideoStreamListVideoStreamNetworkCost networkCost;

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

        public static QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreamsVideoStreamListVideoStream build(java.util.Map<String, ?> map) throws Exception {
            QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreamsVideoStreamListVideoStream self = new QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreamsVideoStreamListVideoStream();
            return TeaModel.build(map, self);
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreamsVideoStreamListVideoStream setIndex(String index) {
            this.index = index;
            return this;
        }
        public String getIndex() {
            return this.index;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreamsVideoStreamListVideoStream setTimebase(String timebase) {
            this.timebase = timebase;
            return this;
        }
        public String getTimebase() {
            return this.timebase;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreamsVideoStreamListVideoStream setAvgFPS(String avgFPS) {
            this.avgFPS = avgFPS;
            return this;
        }
        public String getAvgFPS() {
            return this.avgFPS;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreamsVideoStreamListVideoStream setPixFmt(String pixFmt) {
            this.pixFmt = pixFmt;
            return this;
        }
        public String getPixFmt() {
            return this.pixFmt;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreamsVideoStreamListVideoStream setSar(String sar) {
            this.sar = sar;
            return this;
        }
        public String getSar() {
            return this.sar;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreamsVideoStreamListVideoStream setLang(String lang) {
            this.lang = lang;
            return this;
        }
        public String getLang() {
            return this.lang;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreamsVideoStreamListVideoStream setCodecLongName(String codecLongName) {
            this.codecLongName = codecLongName;
            return this;
        }
        public String getCodecLongName() {
            return this.codecLongName;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreamsVideoStreamListVideoStream setHeight(String height) {
            this.height = height;
            return this;
        }
        public String getHeight() {
            return this.height;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreamsVideoStreamListVideoStream setNumFrames(String numFrames) {
            this.numFrames = numFrames;
            return this;
        }
        public String getNumFrames() {
            return this.numFrames;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreamsVideoStreamListVideoStream setBitrate(String bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public String getBitrate() {
            return this.bitrate;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreamsVideoStreamListVideoStream setCodecTagString(String codecTagString) {
            this.codecTagString = codecTagString;
            return this;
        }
        public String getCodecTagString() {
            return this.codecTagString;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreamsVideoStreamListVideoStream setHasBFrames(String hasBFrames) {
            this.hasBFrames = hasBFrames;
            return this;
        }
        public String getHasBFrames() {
            return this.hasBFrames;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreamsVideoStreamListVideoStream setProfile(String profile) {
            this.profile = profile;
            return this;
        }
        public String getProfile() {
            return this.profile;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreamsVideoStreamListVideoStream setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreamsVideoStreamListVideoStream setNetworkCost(QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreamsVideoStreamListVideoStreamNetworkCost networkCost) {
            this.networkCost = networkCost;
            return this;
        }
        public QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreamsVideoStreamListVideoStreamNetworkCost getNetworkCost() {
            return this.networkCost;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreamsVideoStreamListVideoStream setDar(String dar) {
            this.dar = dar;
            return this;
        }
        public String getDar() {
            return this.dar;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreamsVideoStreamListVideoStream setCodecName(String codecName) {
            this.codecName = codecName;
            return this;
        }
        public String getCodecName() {
            return this.codecName;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreamsVideoStreamListVideoStream setWidth(String width) {
            this.width = width;
            return this;
        }
        public String getWidth() {
            return this.width;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreamsVideoStreamListVideoStream setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreamsVideoStreamListVideoStream setFps(String fps) {
            this.fps = fps;
            return this;
        }
        public String getFps() {
            return this.fps;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreamsVideoStreamListVideoStream setCodecTag(String codecTag) {
            this.codecTag = codecTag;
            return this;
        }
        public String getCodecTag() {
            return this.codecTag;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreamsVideoStreamListVideoStream setCodecTimeBase(String codecTimeBase) {
            this.codecTimeBase = codecTimeBase;
            return this;
        }
        public String getCodecTimeBase() {
            return this.codecTimeBase;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreamsVideoStreamListVideoStream setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

    }

    public static class QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreamsVideoStreamList extends TeaModel {
        @NameInMap("VideoStream")
        public java.util.List<QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreamsVideoStreamListVideoStream> videoStream;

        public static QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreamsVideoStreamList build(java.util.Map<String, ?> map) throws Exception {
            QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreamsVideoStreamList self = new QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreamsVideoStreamList();
            return TeaModel.build(map, self);
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreamsVideoStreamList setVideoStream(java.util.List<QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreamsVideoStreamListVideoStream> videoStream) {
            this.videoStream = videoStream;
            return this;
        }
        public java.util.List<QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreamsVideoStreamListVideoStream> getVideoStream() {
            return this.videoStream;
        }

    }

    public static class QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreamsAudioStreamListAudioStream extends TeaModel {
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

        public static QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreamsAudioStreamListAudioStream build(java.util.Map<String, ?> map) throws Exception {
            QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreamsAudioStreamListAudioStream self = new QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreamsAudioStreamListAudioStream();
            return TeaModel.build(map, self);
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreamsAudioStreamListAudioStream setTimebase(String timebase) {
            this.timebase = timebase;
            return this;
        }
        public String getTimebase() {
            return this.timebase;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreamsAudioStreamListAudioStream setIndex(String index) {
            this.index = index;
            return this;
        }
        public String getIndex() {
            return this.index;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreamsAudioStreamListAudioStream setSampleFmt(String sampleFmt) {
            this.sampleFmt = sampleFmt;
            return this;
        }
        public String getSampleFmt() {
            return this.sampleFmt;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreamsAudioStreamListAudioStream setChannelLayout(String channelLayout) {
            this.channelLayout = channelLayout;
            return this;
        }
        public String getChannelLayout() {
            return this.channelLayout;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreamsAudioStreamListAudioStream setLang(String lang) {
            this.lang = lang;
            return this;
        }
        public String getLang() {
            return this.lang;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreamsAudioStreamListAudioStream setSamplerate(String samplerate) {
            this.samplerate = samplerate;
            return this;
        }
        public String getSamplerate() {
            return this.samplerate;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreamsAudioStreamListAudioStream setCodecLongName(String codecLongName) {
            this.codecLongName = codecLongName;
            return this;
        }
        public String getCodecLongName() {
            return this.codecLongName;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreamsAudioStreamListAudioStream setChannels(String channels) {
            this.channels = channels;
            return this;
        }
        public String getChannels() {
            return this.channels;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreamsAudioStreamListAudioStream setNumFrames(String numFrames) {
            this.numFrames = numFrames;
            return this;
        }
        public String getNumFrames() {
            return this.numFrames;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreamsAudioStreamListAudioStream setBitrate(String bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public String getBitrate() {
            return this.bitrate;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreamsAudioStreamListAudioStream setCodecTagString(String codecTagString) {
            this.codecTagString = codecTagString;
            return this;
        }
        public String getCodecTagString() {
            return this.codecTagString;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreamsAudioStreamListAudioStream setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreamsAudioStreamListAudioStream setCodecName(String codecName) {
            this.codecName = codecName;
            return this;
        }
        public String getCodecName() {
            return this.codecName;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreamsAudioStreamListAudioStream setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreamsAudioStreamListAudioStream setCodecTag(String codecTag) {
            this.codecTag = codecTag;
            return this;
        }
        public String getCodecTag() {
            return this.codecTag;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreamsAudioStreamListAudioStream setCodecTimeBase(String codecTimeBase) {
            this.codecTimeBase = codecTimeBase;
            return this;
        }
        public String getCodecTimeBase() {
            return this.codecTimeBase;
        }

    }

    public static class QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreamsAudioStreamList extends TeaModel {
        @NameInMap("AudioStream")
        public java.util.List<QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreamsAudioStreamListAudioStream> audioStream;

        public static QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreamsAudioStreamList build(java.util.Map<String, ?> map) throws Exception {
            QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreamsAudioStreamList self = new QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreamsAudioStreamList();
            return TeaModel.build(map, self);
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreamsAudioStreamList setAudioStream(java.util.List<QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreamsAudioStreamListAudioStream> audioStream) {
            this.audioStream = audioStream;
            return this;
        }
        public java.util.List<QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreamsAudioStreamListAudioStream> getAudioStream() {
            return this.audioStream;
        }

    }

    public static class QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreamsSubtitleStreamListSubtitleStream extends TeaModel {
        @NameInMap("Index")
        public String index;

        @NameInMap("Lang")
        public String lang;

        public static QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreamsSubtitleStreamListSubtitleStream build(java.util.Map<String, ?> map) throws Exception {
            QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreamsSubtitleStreamListSubtitleStream self = new QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreamsSubtitleStreamListSubtitleStream();
            return TeaModel.build(map, self);
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreamsSubtitleStreamListSubtitleStream setIndex(String index) {
            this.index = index;
            return this;
        }
        public String getIndex() {
            return this.index;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreamsSubtitleStreamListSubtitleStream setLang(String lang) {
            this.lang = lang;
            return this;
        }
        public String getLang() {
            return this.lang;
        }

    }

    public static class QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreamsSubtitleStreamList extends TeaModel {
        @NameInMap("SubtitleStream")
        public java.util.List<QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreamsSubtitleStreamListSubtitleStream> subtitleStream;

        public static QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreamsSubtitleStreamList build(java.util.Map<String, ?> map) throws Exception {
            QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreamsSubtitleStreamList self = new QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreamsSubtitleStreamList();
            return TeaModel.build(map, self);
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreamsSubtitleStreamList setSubtitleStream(java.util.List<QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreamsSubtitleStreamListSubtitleStream> subtitleStream) {
            this.subtitleStream = subtitleStream;
            return this;
        }
        public java.util.List<QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreamsSubtitleStreamListSubtitleStream> getSubtitleStream() {
            return this.subtitleStream;
        }

    }

    public static class QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreams extends TeaModel {
        @NameInMap("VideoStreamList")
        public QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreamsVideoStreamList videoStreamList;

        @NameInMap("AudioStreamList")
        public QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreamsAudioStreamList audioStreamList;

        @NameInMap("SubtitleStreamList")
        public QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreamsSubtitleStreamList subtitleStreamList;

        public static QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreams build(java.util.Map<String, ?> map) throws Exception {
            QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreams self = new QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreams();
            return TeaModel.build(map, self);
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreams setVideoStreamList(QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreamsVideoStreamList videoStreamList) {
            this.videoStreamList = videoStreamList;
            return this;
        }
        public QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreamsVideoStreamList getVideoStreamList() {
            return this.videoStreamList;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreams setAudioStreamList(QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreamsAudioStreamList audioStreamList) {
            this.audioStreamList = audioStreamList;
            return this;
        }
        public QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreamsAudioStreamList getAudioStreamList() {
            return this.audioStreamList;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreams setSubtitleStreamList(QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreamsSubtitleStreamList subtitleStreamList) {
            this.subtitleStreamList = subtitleStreamList;
            return this;
        }
        public QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreamsSubtitleStreamList getSubtitleStreamList() {
            return this.subtitleStreamList;
        }

    }

    public static class QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesFormat extends TeaModel {
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

        public static QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesFormat build(java.util.Map<String, ?> map) throws Exception {
            QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesFormat self = new QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesFormat();
            return TeaModel.build(map, self);
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesFormat setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesFormat setNumPrograms(String numPrograms) {
            this.numPrograms = numPrograms;
            return this;
        }
        public String getNumPrograms() {
            return this.numPrograms;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesFormat setSize(String size) {
            this.size = size;
            return this;
        }
        public String getSize() {
            return this.size;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesFormat setNumStreams(String numStreams) {
            this.numStreams = numStreams;
            return this;
        }
        public String getNumStreams() {
            return this.numStreams;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesFormat setFormatLongName(String formatLongName) {
            this.formatLongName = formatLongName;
            return this;
        }
        public String getFormatLongName() {
            return this.formatLongName;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesFormat setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesFormat setBitrate(String bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public String getBitrate() {
            return this.bitrate;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesFormat setFormatName(String formatName) {
            this.formatName = formatName;
            return this;
        }
        public String getFormatName() {
            return this.formatName;
        }

    }

    public static class QueryEditingJobListResponseBodyJobListJobEditingConfigProperties extends TeaModel {
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
        public QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreams streams;

        @NameInMap("Format")
        public QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesFormat format;

        @NameInMap("FileSize")
        public String fileSize;

        public static QueryEditingJobListResponseBodyJobListJobEditingConfigProperties build(java.util.Map<String, ?> map) throws Exception {
            QueryEditingJobListResponseBodyJobListJobEditingConfigProperties self = new QueryEditingJobListResponseBodyJobListJobEditingConfigProperties();
            return TeaModel.build(map, self);
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigProperties setWidth(String width) {
            this.width = width;
            return this;
        }
        public String getWidth() {
            return this.width;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigProperties setHeight(String height) {
            this.height = height;
            return this;
        }
        public String getHeight() {
            return this.height;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigProperties setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigProperties setFps(String fps) {
            this.fps = fps;
            return this;
        }
        public String getFps() {
            return this.fps;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigProperties setBitrate(String bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public String getBitrate() {
            return this.bitrate;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigProperties setFileFormat(String fileFormat) {
            this.fileFormat = fileFormat;
            return this;
        }
        public String getFileFormat() {
            return this.fileFormat;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigProperties setStreams(QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreams streams) {
            this.streams = streams;
            return this;
        }
        public QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesStreams getStreams() {
            return this.streams;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigProperties setFormat(QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesFormat format) {
            this.format = format;
            return this;
        }
        public QueryEditingJobListResponseBodyJobListJobEditingConfigPropertiesFormat getFormat() {
            return this.format;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfigProperties setFileSize(String fileSize) {
            this.fileSize = fileSize;
            return this;
        }
        public String getFileSize() {
            return this.fileSize;
        }

    }

    public static class QueryEditingJobListResponseBodyJobListJobEditingConfig extends TeaModel {
        @NameInMap("Video")
        public QueryEditingJobListResponseBodyJobListJobEditingConfigVideo video;

        @NameInMap("TransConfig")
        public QueryEditingJobListResponseBodyJobListJobEditingConfigTransConfig transConfig;

        @NameInMap("Encryption")
        public QueryEditingJobListResponseBodyJobListJobEditingConfigEncryption encryption;

        @NameInMap("WaterMarkList")
        public QueryEditingJobListResponseBodyJobListJobEditingConfigWaterMarkList waterMarkList;

        @NameInMap("DeWatermark")
        public String deWatermark;

        @NameInMap("WaterMarkConfigUrl")
        public String waterMarkConfigUrl;

        @NameInMap("M3U8NonStandardSupport")
        public QueryEditingJobListResponseBodyJobListJobEditingConfigM3U8NonStandardSupport m3U8NonStandardSupport;

        @NameInMap("Priority")
        public String priority;

        @NameInMap("Audio")
        public QueryEditingJobListResponseBodyJobListJobEditingConfigAudio audio;

        @NameInMap("AudioStreamMap")
        public String audioStreamMap;

        @NameInMap("MergeList")
        public QueryEditingJobListResponseBodyJobListJobEditingConfigMergeList mergeList;

        @NameInMap("SuperReso")
        public QueryEditingJobListResponseBodyJobListJobEditingConfigSuperReso superReso;

        @NameInMap("UserData")
        public String userData;

        @NameInMap("DigiWaterMark")
        public QueryEditingJobListResponseBodyJobListJobEditingConfigDigiWaterMark digiWaterMark;

        @NameInMap("VideoStreamMap")
        public String videoStreamMap;

        @NameInMap("OutputFile")
        public QueryEditingJobListResponseBodyJobListJobEditingConfigOutputFile outputFile;

        @NameInMap("Rotate")
        public String rotate;

        @NameInMap("Editing")
        public QueryEditingJobListResponseBodyJobListJobEditingConfigEditing editing;

        @NameInMap("Container")
        public QueryEditingJobListResponseBodyJobListJobEditingConfigContainer container;

        @NameInMap("Clip")
        public QueryEditingJobListResponseBodyJobListJobEditingConfigClip clip;

        @NameInMap("MergeConfigUrl")
        public String mergeConfigUrl;

        @NameInMap("MuxConfig")
        public QueryEditingJobListResponseBodyJobListJobEditingConfigMuxConfig muxConfig;

        @NameInMap("TemplateId")
        public String templateId;

        @NameInMap("SubtitleConfig")
        public QueryEditingJobListResponseBodyJobListJobEditingConfigSubtitleConfig subtitleConfig;

        @NameInMap("Properties")
        public QueryEditingJobListResponseBodyJobListJobEditingConfigProperties properties;

        public static QueryEditingJobListResponseBodyJobListJobEditingConfig build(java.util.Map<String, ?> map) throws Exception {
            QueryEditingJobListResponseBodyJobListJobEditingConfig self = new QueryEditingJobListResponseBodyJobListJobEditingConfig();
            return TeaModel.build(map, self);
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfig setVideo(QueryEditingJobListResponseBodyJobListJobEditingConfigVideo video) {
            this.video = video;
            return this;
        }
        public QueryEditingJobListResponseBodyJobListJobEditingConfigVideo getVideo() {
            return this.video;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfig setTransConfig(QueryEditingJobListResponseBodyJobListJobEditingConfigTransConfig transConfig) {
            this.transConfig = transConfig;
            return this;
        }
        public QueryEditingJobListResponseBodyJobListJobEditingConfigTransConfig getTransConfig() {
            return this.transConfig;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfig setEncryption(QueryEditingJobListResponseBodyJobListJobEditingConfigEncryption encryption) {
            this.encryption = encryption;
            return this;
        }
        public QueryEditingJobListResponseBodyJobListJobEditingConfigEncryption getEncryption() {
            return this.encryption;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfig setWaterMarkList(QueryEditingJobListResponseBodyJobListJobEditingConfigWaterMarkList waterMarkList) {
            this.waterMarkList = waterMarkList;
            return this;
        }
        public QueryEditingJobListResponseBodyJobListJobEditingConfigWaterMarkList getWaterMarkList() {
            return this.waterMarkList;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfig setDeWatermark(String deWatermark) {
            this.deWatermark = deWatermark;
            return this;
        }
        public String getDeWatermark() {
            return this.deWatermark;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfig setWaterMarkConfigUrl(String waterMarkConfigUrl) {
            this.waterMarkConfigUrl = waterMarkConfigUrl;
            return this;
        }
        public String getWaterMarkConfigUrl() {
            return this.waterMarkConfigUrl;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfig setM3U8NonStandardSupport(QueryEditingJobListResponseBodyJobListJobEditingConfigM3U8NonStandardSupport m3U8NonStandardSupport) {
            this.m3U8NonStandardSupport = m3U8NonStandardSupport;
            return this;
        }
        public QueryEditingJobListResponseBodyJobListJobEditingConfigM3U8NonStandardSupport getM3U8NonStandardSupport() {
            return this.m3U8NonStandardSupport;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfig setPriority(String priority) {
            this.priority = priority;
            return this;
        }
        public String getPriority() {
            return this.priority;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfig setAudio(QueryEditingJobListResponseBodyJobListJobEditingConfigAudio audio) {
            this.audio = audio;
            return this;
        }
        public QueryEditingJobListResponseBodyJobListJobEditingConfigAudio getAudio() {
            return this.audio;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfig setAudioStreamMap(String audioStreamMap) {
            this.audioStreamMap = audioStreamMap;
            return this;
        }
        public String getAudioStreamMap() {
            return this.audioStreamMap;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfig setMergeList(QueryEditingJobListResponseBodyJobListJobEditingConfigMergeList mergeList) {
            this.mergeList = mergeList;
            return this;
        }
        public QueryEditingJobListResponseBodyJobListJobEditingConfigMergeList getMergeList() {
            return this.mergeList;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfig setSuperReso(QueryEditingJobListResponseBodyJobListJobEditingConfigSuperReso superReso) {
            this.superReso = superReso;
            return this;
        }
        public QueryEditingJobListResponseBodyJobListJobEditingConfigSuperReso getSuperReso() {
            return this.superReso;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfig setUserData(String userData) {
            this.userData = userData;
            return this;
        }
        public String getUserData() {
            return this.userData;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfig setDigiWaterMark(QueryEditingJobListResponseBodyJobListJobEditingConfigDigiWaterMark digiWaterMark) {
            this.digiWaterMark = digiWaterMark;
            return this;
        }
        public QueryEditingJobListResponseBodyJobListJobEditingConfigDigiWaterMark getDigiWaterMark() {
            return this.digiWaterMark;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfig setVideoStreamMap(String videoStreamMap) {
            this.videoStreamMap = videoStreamMap;
            return this;
        }
        public String getVideoStreamMap() {
            return this.videoStreamMap;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfig setOutputFile(QueryEditingJobListResponseBodyJobListJobEditingConfigOutputFile outputFile) {
            this.outputFile = outputFile;
            return this;
        }
        public QueryEditingJobListResponseBodyJobListJobEditingConfigOutputFile getOutputFile() {
            return this.outputFile;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfig setRotate(String rotate) {
            this.rotate = rotate;
            return this;
        }
        public String getRotate() {
            return this.rotate;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfig setEditing(QueryEditingJobListResponseBodyJobListJobEditingConfigEditing editing) {
            this.editing = editing;
            return this;
        }
        public QueryEditingJobListResponseBodyJobListJobEditingConfigEditing getEditing() {
            return this.editing;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfig setContainer(QueryEditingJobListResponseBodyJobListJobEditingConfigContainer container) {
            this.container = container;
            return this;
        }
        public QueryEditingJobListResponseBodyJobListJobEditingConfigContainer getContainer() {
            return this.container;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfig setClip(QueryEditingJobListResponseBodyJobListJobEditingConfigClip clip) {
            this.clip = clip;
            return this;
        }
        public QueryEditingJobListResponseBodyJobListJobEditingConfigClip getClip() {
            return this.clip;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfig setMergeConfigUrl(String mergeConfigUrl) {
            this.mergeConfigUrl = mergeConfigUrl;
            return this;
        }
        public String getMergeConfigUrl() {
            return this.mergeConfigUrl;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfig setMuxConfig(QueryEditingJobListResponseBodyJobListJobEditingConfigMuxConfig muxConfig) {
            this.muxConfig = muxConfig;
            return this;
        }
        public QueryEditingJobListResponseBodyJobListJobEditingConfigMuxConfig getMuxConfig() {
            return this.muxConfig;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfig setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfig setSubtitleConfig(QueryEditingJobListResponseBodyJobListJobEditingConfigSubtitleConfig subtitleConfig) {
            this.subtitleConfig = subtitleConfig;
            return this;
        }
        public QueryEditingJobListResponseBodyJobListJobEditingConfigSubtitleConfig getSubtitleConfig() {
            return this.subtitleConfig;
        }

        public QueryEditingJobListResponseBodyJobListJobEditingConfig setProperties(QueryEditingJobListResponseBodyJobListJobEditingConfigProperties properties) {
            this.properties = properties;
            return this;
        }
        public QueryEditingJobListResponseBodyJobListJobEditingConfigProperties getProperties() {
            return this.properties;
        }

    }

    public static class QueryEditingJobListResponseBodyJobListJobMNSMessageResult extends TeaModel {
        @NameInMap("MessageId")
        public String messageId;

        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("ErrorCode")
        public String errorCode;

        public static QueryEditingJobListResponseBodyJobListJobMNSMessageResult build(java.util.Map<String, ?> map) throws Exception {
            QueryEditingJobListResponseBodyJobListJobMNSMessageResult self = new QueryEditingJobListResponseBodyJobListJobMNSMessageResult();
            return TeaModel.build(map, self);
        }

        public QueryEditingJobListResponseBodyJobListJobMNSMessageResult setMessageId(String messageId) {
            this.messageId = messageId;
            return this;
        }
        public String getMessageId() {
            return this.messageId;
        }

        public QueryEditingJobListResponseBodyJobListJobMNSMessageResult setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public QueryEditingJobListResponseBodyJobListJobMNSMessageResult setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

    }

    public static class QueryEditingJobListResponseBodyJobListJob extends TeaModel {
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

        @NameInMap("EditingInputs")
        public QueryEditingJobListResponseBodyJobListJobEditingInputs editingInputs;

        @NameInMap("PipelineId")
        public String pipelineId;

        @NameInMap("EditingConfig")
        public QueryEditingJobListResponseBodyJobListJobEditingConfig editingConfig;

        @NameInMap("MNSMessageResult")
        public QueryEditingJobListResponseBodyJobListJobMNSMessageResult MNSMessageResult;

        public static QueryEditingJobListResponseBodyJobListJob build(java.util.Map<String, ?> map) throws Exception {
            QueryEditingJobListResponseBodyJobListJob self = new QueryEditingJobListResponseBodyJobListJob();
            return TeaModel.build(map, self);
        }

        public QueryEditingJobListResponseBodyJobListJob setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public QueryEditingJobListResponseBodyJobListJob setPercent(Long percent) {
            this.percent = percent;
            return this;
        }
        public Long getPercent() {
            return this.percent;
        }

        public QueryEditingJobListResponseBodyJobListJob setFinishTime(String finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public String getFinishTime() {
            return this.finishTime;
        }

        public QueryEditingJobListResponseBodyJobListJob setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public QueryEditingJobListResponseBodyJobListJob setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public QueryEditingJobListResponseBodyJobListJob setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public QueryEditingJobListResponseBodyJobListJob setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public QueryEditingJobListResponseBodyJobListJob setEditingInputs(QueryEditingJobListResponseBodyJobListJobEditingInputs editingInputs) {
            this.editingInputs = editingInputs;
            return this;
        }
        public QueryEditingJobListResponseBodyJobListJobEditingInputs getEditingInputs() {
            return this.editingInputs;
        }

        public QueryEditingJobListResponseBodyJobListJob setPipelineId(String pipelineId) {
            this.pipelineId = pipelineId;
            return this;
        }
        public String getPipelineId() {
            return this.pipelineId;
        }

        public QueryEditingJobListResponseBodyJobListJob setEditingConfig(QueryEditingJobListResponseBodyJobListJobEditingConfig editingConfig) {
            this.editingConfig = editingConfig;
            return this;
        }
        public QueryEditingJobListResponseBodyJobListJobEditingConfig getEditingConfig() {
            return this.editingConfig;
        }

        public QueryEditingJobListResponseBodyJobListJob setMNSMessageResult(QueryEditingJobListResponseBodyJobListJobMNSMessageResult MNSMessageResult) {
            this.MNSMessageResult = MNSMessageResult;
            return this;
        }
        public QueryEditingJobListResponseBodyJobListJobMNSMessageResult getMNSMessageResult() {
            return this.MNSMessageResult;
        }

    }

    public static class QueryEditingJobListResponseBodyJobList extends TeaModel {
        @NameInMap("Job")
        public java.util.List<QueryEditingJobListResponseBodyJobListJob> job;

        public static QueryEditingJobListResponseBodyJobList build(java.util.Map<String, ?> map) throws Exception {
            QueryEditingJobListResponseBodyJobList self = new QueryEditingJobListResponseBodyJobList();
            return TeaModel.build(map, self);
        }

        public QueryEditingJobListResponseBodyJobList setJob(java.util.List<QueryEditingJobListResponseBodyJobListJob> job) {
            this.job = job;
            return this;
        }
        public java.util.List<QueryEditingJobListResponseBodyJobListJob> getJob() {
            return this.job;
        }

    }

}
