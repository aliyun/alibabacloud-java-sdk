// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class SubmitEditingJobsResponseBody extends TeaModel {
    @NameInMap("JobResultList")
    public SubmitEditingJobsResponseBodyJobResultList jobResultList;

    @NameInMap("RequestId")
    public String requestId;

    public static SubmitEditingJobsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        SubmitEditingJobsResponseBody self = new SubmitEditingJobsResponseBody();
        return TeaModel.build(map, self);
    }

    public SubmitEditingJobsResponseBody setJobResultList(SubmitEditingJobsResponseBodyJobResultList jobResultList) {
        this.jobResultList = jobResultList;
        return this;
    }
    public SubmitEditingJobsResponseBodyJobResultList getJobResultList() {
        return this.jobResultList;
    }

    public SubmitEditingJobsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingInputsEditingInputInputFile extends TeaModel {
        @NameInMap("Object")
        public String object;

        @NameInMap("Location")
        public String location;

        @NameInMap("Bucket")
        public String bucket;

        public static SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingInputsEditingInputInputFile build(java.util.Map<String, ?> map) throws Exception {
            SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingInputsEditingInputInputFile self = new SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingInputsEditingInputInputFile();
            return TeaModel.build(map, self);
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingInputsEditingInputInputFile setObject(String object) {
            this.object = object;
            return this;
        }
        public String getObject() {
            return this.object;
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingInputsEditingInputInputFile setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingInputsEditingInputInputFile setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

    }

    public static class SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingInputsEditingInputInputConfig extends TeaModel {
        @NameInMap("IsNormalSar")
        public String isNormalSar;

        @NameInMap("DeinterlaceMethod")
        public String deinterlaceMethod;

        public static SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingInputsEditingInputInputConfig build(java.util.Map<String, ?> map) throws Exception {
            SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingInputsEditingInputInputConfig self = new SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingInputsEditingInputInputConfig();
            return TeaModel.build(map, self);
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingInputsEditingInputInputConfig setIsNormalSar(String isNormalSar) {
            this.isNormalSar = isNormalSar;
            return this;
        }
        public String getIsNormalSar() {
            return this.isNormalSar;
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingInputsEditingInputInputConfig setDeinterlaceMethod(String deinterlaceMethod) {
            this.deinterlaceMethod = deinterlaceMethod;
            return this;
        }
        public String getDeinterlaceMethod() {
            return this.deinterlaceMethod;
        }

    }

    public static class SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingInputsEditingInput extends TeaModel {
        @NameInMap("InputFile")
        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingInputsEditingInputInputFile inputFile;

        @NameInMap("InputConfig")
        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingInputsEditingInputInputConfig inputConfig;

        @NameInMap("Id")
        public String id;

        public static SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingInputsEditingInput build(java.util.Map<String, ?> map) throws Exception {
            SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingInputsEditingInput self = new SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingInputsEditingInput();
            return TeaModel.build(map, self);
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingInputsEditingInput setInputFile(SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingInputsEditingInputInputFile inputFile) {
            this.inputFile = inputFile;
            return this;
        }
        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingInputsEditingInputInputFile getInputFile() {
            return this.inputFile;
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingInputsEditingInput setInputConfig(SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingInputsEditingInputInputConfig inputConfig) {
            this.inputConfig = inputConfig;
            return this;
        }
        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingInputsEditingInputInputConfig getInputConfig() {
            return this.inputConfig;
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingInputsEditingInput setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

    public static class SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingInputs extends TeaModel {
        @NameInMap("EditingInput")
        public java.util.List<SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingInputsEditingInput> editingInput;

        public static SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingInputs build(java.util.Map<String, ?> map) throws Exception {
            SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingInputs self = new SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingInputs();
            return TeaModel.build(map, self);
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingInputs setEditingInput(java.util.List<SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingInputsEditingInput> editingInput) {
            this.editingInput = editingInput;
            return this;
        }
        public java.util.List<SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingInputsEditingInput> getEditingInput() {
            return this.editingInput;
        }

    }

    public static class SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigVideoBitrateBnd extends TeaModel {
        @NameInMap("Max")
        public String max;

        @NameInMap("Min")
        public String min;

        public static SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigVideoBitrateBnd build(java.util.Map<String, ?> map) throws Exception {
            SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigVideoBitrateBnd self = new SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigVideoBitrateBnd();
            return TeaModel.build(map, self);
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigVideoBitrateBnd setMax(String max) {
            this.max = max;
            return this;
        }
        public String getMax() {
            return this.max;
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigVideoBitrateBnd setMin(String min) {
            this.min = min;
            return this;
        }
        public String getMin() {
            return this.min;
        }

    }

    public static class SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigVideo extends TeaModel {
        @NameInMap("Bufsize")
        public String bufsize;

        @NameInMap("Degrain")
        public String degrain;

        @NameInMap("BitrateBnd")
        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigVideoBitrateBnd bitrateBnd;

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

        public static SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigVideo build(java.util.Map<String, ?> map) throws Exception {
            SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigVideo self = new SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigVideo();
            return TeaModel.build(map, self);
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigVideo setBufsize(String bufsize) {
            this.bufsize = bufsize;
            return this;
        }
        public String getBufsize() {
            return this.bufsize;
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigVideo setDegrain(String degrain) {
            this.degrain = degrain;
            return this;
        }
        public String getDegrain() {
            return this.degrain;
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigVideo setBitrateBnd(SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigVideoBitrateBnd bitrateBnd) {
            this.bitrateBnd = bitrateBnd;
            return this;
        }
        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigVideoBitrateBnd getBitrateBnd() {
            return this.bitrateBnd;
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigVideo setPixFmt(String pixFmt) {
            this.pixFmt = pixFmt;
            return this;
        }
        public String getPixFmt() {
            return this.pixFmt;
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigVideo setPad(String pad) {
            this.pad = pad;
            return this;
        }
        public String getPad() {
            return this.pad;
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigVideo setCodec(String codec) {
            this.codec = codec;
            return this;
        }
        public String getCodec() {
            return this.codec;
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigVideo setHeight(String height) {
            this.height = height;
            return this;
        }
        public String getHeight() {
            return this.height;
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigVideo setQscale(String qscale) {
            this.qscale = qscale;
            return this;
        }
        public String getQscale() {
            return this.qscale;
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigVideo setCrop(String crop) {
            this.crop = crop;
            return this;
        }
        public String getCrop() {
            return this.crop;
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigVideo setBitrate(String bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public String getBitrate() {
            return this.bitrate;
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigVideo setMaxrate(String maxrate) {
            this.maxrate = maxrate;
            return this;
        }
        public String getMaxrate() {
            return this.maxrate;
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigVideo setMaxFps(String maxFps) {
            this.maxFps = maxFps;
            return this;
        }
        public String getMaxFps() {
            return this.maxFps;
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigVideo setProfile(String profile) {
            this.profile = profile;
            return this;
        }
        public String getProfile() {
            return this.profile;
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigVideo setCrf(String crf) {
            this.crf = crf;
            return this;
        }
        public String getCrf() {
            return this.crf;
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigVideo setGop(String gop) {
            this.gop = gop;
            return this;
        }
        public String getGop() {
            return this.gop;
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigVideo setWidth(String width) {
            this.width = width;
            return this;
        }
        public String getWidth() {
            return this.width;
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigVideo setFps(String fps) {
            this.fps = fps;
            return this;
        }
        public String getFps() {
            return this.fps;
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigVideo setPreset(String preset) {
            this.preset = preset;
            return this;
        }
        public String getPreset() {
            return this.preset;
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigVideo setScanMode(String scanMode) {
            this.scanMode = scanMode;
            return this;
        }
        public String getScanMode() {
            return this.scanMode;
        }

    }

    public static class SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigTransConfig extends TeaModel {
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

        public static SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigTransConfig build(java.util.Map<String, ?> map) throws Exception {
            SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigTransConfig self = new SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigTransConfig();
            return TeaModel.build(map, self);
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigTransConfig setIsCheckAudioBitrate(String isCheckAudioBitrate) {
            this.isCheckAudioBitrate = isCheckAudioBitrate;
            return this;
        }
        public String getIsCheckAudioBitrate() {
            return this.isCheckAudioBitrate;
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigTransConfig setIsCheckReso(String isCheckReso) {
            this.isCheckReso = isCheckReso;
            return this;
        }
        public String getIsCheckReso() {
            return this.isCheckReso;
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigTransConfig setTransMode(String transMode) {
            this.transMode = transMode;
            return this;
        }
        public String getTransMode() {
            return this.transMode;
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigTransConfig setIsCheckVideoBitrateFail(String isCheckVideoBitrateFail) {
            this.isCheckVideoBitrateFail = isCheckVideoBitrateFail;
            return this;
        }
        public String getIsCheckVideoBitrateFail() {
            return this.isCheckVideoBitrateFail;
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigTransConfig setAdjDarMethod(String adjDarMethod) {
            this.adjDarMethod = adjDarMethod;
            return this;
        }
        public String getAdjDarMethod() {
            return this.adjDarMethod;
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigTransConfig setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigTransConfig setIsCheckVideoBitrate(String isCheckVideoBitrate) {
            this.isCheckVideoBitrate = isCheckVideoBitrate;
            return this;
        }
        public String getIsCheckVideoBitrate() {
            return this.isCheckVideoBitrate;
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigTransConfig setIsCheckResoFail(String isCheckResoFail) {
            this.isCheckResoFail = isCheckResoFail;
            return this;
        }
        public String getIsCheckResoFail() {
            return this.isCheckResoFail;
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigTransConfig setIsCheckAudioBitrateFail(String isCheckAudioBitrateFail) {
            this.isCheckAudioBitrateFail = isCheckAudioBitrateFail;
            return this;
        }
        public String getIsCheckAudioBitrateFail() {
            return this.isCheckAudioBitrateFail;
        }

    }

    public static class SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigEncryption extends TeaModel {
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

        public static SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigEncryption build(java.util.Map<String, ?> map) throws Exception {
            SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigEncryption self = new SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigEncryption();
            return TeaModel.build(map, self);
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigEncryption setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigEncryption setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigEncryption setKeyType(String keyType) {
            this.keyType = keyType;
            return this;
        }
        public String getKeyType() {
            return this.keyType;
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigEncryption setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigEncryption setKeyUri(String keyUri) {
            this.keyUri = keyUri;
            return this;
        }
        public String getKeyUri() {
            return this.keyUri;
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigEncryption setSkipCnt(String skipCnt) {
            this.skipCnt = skipCnt;
            return this;
        }
        public String getSkipCnt() {
            return this.skipCnt;
        }

    }

    public static class SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigWaterMarkListWaterMarkInputFile extends TeaModel {
        @NameInMap("Object")
        public String object;

        @NameInMap("Location")
        public String location;

        @NameInMap("Bucket")
        public String bucket;

        public static SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigWaterMarkListWaterMarkInputFile build(java.util.Map<String, ?> map) throws Exception {
            SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigWaterMarkListWaterMarkInputFile self = new SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigWaterMarkListWaterMarkInputFile();
            return TeaModel.build(map, self);
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigWaterMarkListWaterMarkInputFile setObject(String object) {
            this.object = object;
            return this;
        }
        public String getObject() {
            return this.object;
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigWaterMarkListWaterMarkInputFile setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigWaterMarkListWaterMarkInputFile setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

    }

    public static class SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigWaterMarkListWaterMark extends TeaModel {
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
        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigWaterMarkListWaterMarkInputFile inputFile;

        @NameInMap("WaterMarkTemplateId")
        public String waterMarkTemplateId;

        @NameInMap("Dy")
        public String dy;

        public static SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigWaterMarkListWaterMark build(java.util.Map<String, ?> map) throws Exception {
            SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigWaterMarkListWaterMark self = new SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigWaterMarkListWaterMark();
            return TeaModel.build(map, self);
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigWaterMarkListWaterMark setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigWaterMarkListWaterMark setReferPos(String referPos) {
            this.referPos = referPos;
            return this;
        }
        public String getReferPos() {
            return this.referPos;
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigWaterMarkListWaterMark setDx(String dx) {
            this.dx = dx;
            return this;
        }
        public String getDx() {
            return this.dx;
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigWaterMarkListWaterMark setWidth(String width) {
            this.width = width;
            return this;
        }
        public String getWidth() {
            return this.width;
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigWaterMarkListWaterMark setHeight(String height) {
            this.height = height;
            return this;
        }
        public String getHeight() {
            return this.height;
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigWaterMarkListWaterMark setInputFile(SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigWaterMarkListWaterMarkInputFile inputFile) {
            this.inputFile = inputFile;
            return this;
        }
        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigWaterMarkListWaterMarkInputFile getInputFile() {
            return this.inputFile;
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigWaterMarkListWaterMark setWaterMarkTemplateId(String waterMarkTemplateId) {
            this.waterMarkTemplateId = waterMarkTemplateId;
            return this;
        }
        public String getWaterMarkTemplateId() {
            return this.waterMarkTemplateId;
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigWaterMarkListWaterMark setDy(String dy) {
            this.dy = dy;
            return this;
        }
        public String getDy() {
            return this.dy;
        }

    }

    public static class SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigWaterMarkList extends TeaModel {
        @NameInMap("WaterMark")
        public java.util.List<SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigWaterMarkListWaterMark> waterMark;

        public static SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigWaterMarkList build(java.util.Map<String, ?> map) throws Exception {
            SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigWaterMarkList self = new SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigWaterMarkList();
            return TeaModel.build(map, self);
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigWaterMarkList setWaterMark(java.util.List<SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigWaterMarkListWaterMark> waterMark) {
            this.waterMark = waterMark;
            return this;
        }
        public java.util.List<SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigWaterMarkListWaterMark> getWaterMark() {
            return this.waterMark;
        }

    }

    public static class SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigM3U8NonStandardSupportTS extends TeaModel {
        @NameInMap("SizeSupport")
        public Boolean sizeSupport;

        @NameInMap("Md5Support")
        public Boolean md5Support;

        public static SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigM3U8NonStandardSupportTS build(java.util.Map<String, ?> map) throws Exception {
            SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigM3U8NonStandardSupportTS self = new SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigM3U8NonStandardSupportTS();
            return TeaModel.build(map, self);
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigM3U8NonStandardSupportTS setSizeSupport(Boolean sizeSupport) {
            this.sizeSupport = sizeSupport;
            return this;
        }
        public Boolean getSizeSupport() {
            return this.sizeSupport;
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigM3U8NonStandardSupportTS setMd5Support(Boolean md5Support) {
            this.md5Support = md5Support;
            return this;
        }
        public Boolean getMd5Support() {
            return this.md5Support;
        }

    }

    public static class SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigM3U8NonStandardSupport extends TeaModel {
        @NameInMap("TS")
        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigM3U8NonStandardSupportTS TS;

        public static SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigM3U8NonStandardSupport build(java.util.Map<String, ?> map) throws Exception {
            SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigM3U8NonStandardSupport self = new SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigM3U8NonStandardSupport();
            return TeaModel.build(map, self);
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigM3U8NonStandardSupport setTS(SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigM3U8NonStandardSupportTS TS) {
            this.TS = TS;
            return this;
        }
        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigM3U8NonStandardSupportTS getTS() {
            return this.TS;
        }

    }

    public static class SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigAudioVolume extends TeaModel {
        @NameInMap("Method")
        public String method;

        @NameInMap("Level")
        public String level;

        public static SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigAudioVolume build(java.util.Map<String, ?> map) throws Exception {
            SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigAudioVolume self = new SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigAudioVolume();
            return TeaModel.build(map, self);
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigAudioVolume setMethod(String method) {
            this.method = method;
            return this;
        }
        public String getMethod() {
            return this.method;
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigAudioVolume setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

    }

    public static class SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigAudio extends TeaModel {
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
        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigAudioVolume volume;

        @NameInMap("Bitrate")
        public String bitrate;

        public static SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigAudio build(java.util.Map<String, ?> map) throws Exception {
            SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigAudio self = new SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigAudio();
            return TeaModel.build(map, self);
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigAudio setProfile(String profile) {
            this.profile = profile;
            return this;
        }
        public String getProfile() {
            return this.profile;
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigAudio setCodec(String codec) {
            this.codec = codec;
            return this;
        }
        public String getCodec() {
            return this.codec;
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigAudio setSamplerate(String samplerate) {
            this.samplerate = samplerate;
            return this;
        }
        public String getSamplerate() {
            return this.samplerate;
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigAudio setQscale(String qscale) {
            this.qscale = qscale;
            return this;
        }
        public String getQscale() {
            return this.qscale;
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigAudio setChannels(String channels) {
            this.channels = channels;
            return this;
        }
        public String getChannels() {
            return this.channels;
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigAudio setVolume(SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigAudioVolume volume) {
            this.volume = volume;
            return this;
        }
        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigAudioVolume getVolume() {
            return this.volume;
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigAudio setBitrate(String bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public String getBitrate() {
            return this.bitrate;
        }

    }

    public static class SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigMergeListMerge extends TeaModel {
        @NameInMap("Start")
        public String start;

        @NameInMap("RoleArn")
        public String roleArn;

        @NameInMap("MergeURL")
        public String mergeURL;

        @NameInMap("Duration")
        public String duration;

        public static SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigMergeListMerge build(java.util.Map<String, ?> map) throws Exception {
            SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigMergeListMerge self = new SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigMergeListMerge();
            return TeaModel.build(map, self);
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigMergeListMerge setStart(String start) {
            this.start = start;
            return this;
        }
        public String getStart() {
            return this.start;
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigMergeListMerge setRoleArn(String roleArn) {
            this.roleArn = roleArn;
            return this;
        }
        public String getRoleArn() {
            return this.roleArn;
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigMergeListMerge setMergeURL(String mergeURL) {
            this.mergeURL = mergeURL;
            return this;
        }
        public String getMergeURL() {
            return this.mergeURL;
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigMergeListMerge setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

    }

    public static class SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigMergeList extends TeaModel {
        @NameInMap("Merge")
        public java.util.List<SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigMergeListMerge> merge;

        public static SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigMergeList build(java.util.Map<String, ?> map) throws Exception {
            SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigMergeList self = new SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigMergeList();
            return TeaModel.build(map, self);
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigMergeList setMerge(java.util.List<SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigMergeListMerge> merge) {
            this.merge = merge;
            return this;
        }
        public java.util.List<SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigMergeListMerge> getMerge() {
            return this.merge;
        }

    }

    public static class SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigSuperReso extends TeaModel {
        @NameInMap("IsHalfSample")
        public String isHalfSample;

        public static SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigSuperReso build(java.util.Map<String, ?> map) throws Exception {
            SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigSuperReso self = new SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigSuperReso();
            return TeaModel.build(map, self);
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigSuperReso setIsHalfSample(String isHalfSample) {
            this.isHalfSample = isHalfSample;
            return this;
        }
        public String getIsHalfSample() {
            return this.isHalfSample;
        }

    }

    public static class SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigDigiWaterMarkInputFile extends TeaModel {
        @NameInMap("Object")
        public String object;

        @NameInMap("Location")
        public String location;

        @NameInMap("Bucket")
        public String bucket;

        public static SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigDigiWaterMarkInputFile build(java.util.Map<String, ?> map) throws Exception {
            SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigDigiWaterMarkInputFile self = new SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigDigiWaterMarkInputFile();
            return TeaModel.build(map, self);
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigDigiWaterMarkInputFile setObject(String object) {
            this.object = object;
            return this;
        }
        public String getObject() {
            return this.object;
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigDigiWaterMarkInputFile setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigDigiWaterMarkInputFile setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

    }

    public static class SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigDigiWaterMark extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("Alpha")
        public String alpha;

        @NameInMap("InputFile")
        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigDigiWaterMarkInputFile inputFile;

        public static SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigDigiWaterMark build(java.util.Map<String, ?> map) throws Exception {
            SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigDigiWaterMark self = new SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigDigiWaterMark();
            return TeaModel.build(map, self);
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigDigiWaterMark setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigDigiWaterMark setAlpha(String alpha) {
            this.alpha = alpha;
            return this;
        }
        public String getAlpha() {
            return this.alpha;
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigDigiWaterMark setInputFile(SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigDigiWaterMarkInputFile inputFile) {
            this.inputFile = inputFile;
            return this;
        }
        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigDigiWaterMarkInputFile getInputFile() {
            return this.inputFile;
        }

    }

    public static class SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigOutputFile extends TeaModel {
        @NameInMap("RoleArn")
        public String roleArn;

        @NameInMap("Object")
        public String object;

        @NameInMap("Location")
        public String location;

        @NameInMap("Bucket")
        public String bucket;

        public static SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigOutputFile build(java.util.Map<String, ?> map) throws Exception {
            SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigOutputFile self = new SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigOutputFile();
            return TeaModel.build(map, self);
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigOutputFile setRoleArn(String roleArn) {
            this.roleArn = roleArn;
            return this;
        }
        public String getRoleArn() {
            return this.roleArn;
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigOutputFile setObject(String object) {
            this.object = object;
            return this;
        }
        public String getObject() {
            return this.object;
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigOutputFile setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigOutputFile setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

    }

    public static class SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigEditingTimelineTrackListTrackClipsClipClipsConfigClipsConfigVideo extends TeaModel {
        @NameInMap("T")
        public String t;

        @NameInMap("L")
        public String l;

        public static SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigEditingTimelineTrackListTrackClipsClipClipsConfigClipsConfigVideo build(java.util.Map<String, ?> map) throws Exception {
            SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigEditingTimelineTrackListTrackClipsClipClipsConfigClipsConfigVideo self = new SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigEditingTimelineTrackListTrackClipsClipClipsConfigClipsConfigVideo();
            return TeaModel.build(map, self);
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigEditingTimelineTrackListTrackClipsClipClipsConfigClipsConfigVideo setT(String t) {
            this.t = t;
            return this;
        }
        public String getT() {
            return this.t;
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigEditingTimelineTrackListTrackClipsClipClipsConfigClipsConfigVideo setL(String l) {
            this.l = l;
            return this;
        }
        public String getL() {
            return this.l;
        }

    }

    public static class SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigEditingTimelineTrackListTrackClipsClipClipsConfig extends TeaModel {
        @NameInMap("ClipsConfigVideo")
        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigEditingTimelineTrackListTrackClipsClipClipsConfigClipsConfigVideo clipsConfigVideo;

        public static SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigEditingTimelineTrackListTrackClipsClipClipsConfig build(java.util.Map<String, ?> map) throws Exception {
            SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigEditingTimelineTrackListTrackClipsClipClipsConfig self = new SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigEditingTimelineTrackListTrackClipsClipClipsConfig();
            return TeaModel.build(map, self);
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigEditingTimelineTrackListTrackClipsClipClipsConfig setClipsConfigVideo(SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigEditingTimelineTrackListTrackClipsClipClipsConfigClipsConfigVideo clipsConfigVideo) {
            this.clipsConfigVideo = clipsConfigVideo;
            return this;
        }
        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigEditingTimelineTrackListTrackClipsClipClipsConfigClipsConfigVideo getClipsConfigVideo() {
            return this.clipsConfigVideo;
        }

    }

    public static class SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigEditingTimelineTrackListTrackClipsClip extends TeaModel {
        @NameInMap("ClipsConfig")
        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigEditingTimelineTrackListTrackClipsClipClipsConfig clipsConfig;

        @NameInMap("Out")
        public String out;

        @NameInMap("In")
        public String in;

        @NameInMap("clipID")
        public String clipID;

        public static SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigEditingTimelineTrackListTrackClipsClip build(java.util.Map<String, ?> map) throws Exception {
            SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigEditingTimelineTrackListTrackClipsClip self = new SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigEditingTimelineTrackListTrackClipsClip();
            return TeaModel.build(map, self);
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigEditingTimelineTrackListTrackClipsClip setClipsConfig(SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigEditingTimelineTrackListTrackClipsClipClipsConfig clipsConfig) {
            this.clipsConfig = clipsConfig;
            return this;
        }
        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigEditingTimelineTrackListTrackClipsClipClipsConfig getClipsConfig() {
            return this.clipsConfig;
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigEditingTimelineTrackListTrackClipsClip setOut(String out) {
            this.out = out;
            return this;
        }
        public String getOut() {
            return this.out;
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigEditingTimelineTrackListTrackClipsClip setIn(String in) {
            this.in = in;
            return this;
        }
        public String getIn() {
            return this.in;
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigEditingTimelineTrackListTrackClipsClip setClipID(String clipID) {
            this.clipID = clipID;
            return this;
        }
        public String getClipID() {
            return this.clipID;
        }

    }

    public static class SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigEditingTimelineTrackListTrackClips extends TeaModel {
        @NameInMap("Clip")
        public java.util.List<SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigEditingTimelineTrackListTrackClipsClip> clip;

        public static SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigEditingTimelineTrackListTrackClips build(java.util.Map<String, ?> map) throws Exception {
            SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigEditingTimelineTrackListTrackClips self = new SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigEditingTimelineTrackListTrackClips();
            return TeaModel.build(map, self);
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigEditingTimelineTrackListTrackClips setClip(java.util.List<SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigEditingTimelineTrackListTrackClipsClip> clip) {
            this.clip = clip;
            return this;
        }
        public java.util.List<SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigEditingTimelineTrackListTrackClipsClip> getClip() {
            return this.clip;
        }

    }

    public static class SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigEditingTimelineTrackListTrack extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("Order")
        public String order;

        @NameInMap("Id")
        public String id;

        @NameInMap("Clips")
        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigEditingTimelineTrackListTrackClips clips;

        public static SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigEditingTimelineTrackListTrack build(java.util.Map<String, ?> map) throws Exception {
            SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigEditingTimelineTrackListTrack self = new SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigEditingTimelineTrackListTrack();
            return TeaModel.build(map, self);
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigEditingTimelineTrackListTrack setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigEditingTimelineTrackListTrack setOrder(String order) {
            this.order = order;
            return this;
        }
        public String getOrder() {
            return this.order;
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigEditingTimelineTrackListTrack setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigEditingTimelineTrackListTrack setClips(SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigEditingTimelineTrackListTrackClips clips) {
            this.clips = clips;
            return this;
        }
        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigEditingTimelineTrackListTrackClips getClips() {
            return this.clips;
        }

    }

    public static class SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigEditingTimelineTrackList extends TeaModel {
        @NameInMap("Track")
        public java.util.List<SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigEditingTimelineTrackListTrack> track;

        public static SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigEditingTimelineTrackList build(java.util.Map<String, ?> map) throws Exception {
            SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigEditingTimelineTrackList self = new SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigEditingTimelineTrackList();
            return TeaModel.build(map, self);
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigEditingTimelineTrackList setTrack(java.util.List<SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigEditingTimelineTrackListTrack> track) {
            this.track = track;
            return this;
        }
        public java.util.List<SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigEditingTimelineTrackListTrack> getTrack() {
            return this.track;
        }

    }

    public static class SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigEditingTimelineTimelineConfigTimelineConfigAudio extends TeaModel {
        @NameInMap("ChannelLayout")
        public String channelLayout;

        @NameInMap("Samplerate")
        public String samplerate;

        @NameInMap("Channels")
        public String channels;

        public static SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigEditingTimelineTimelineConfigTimelineConfigAudio build(java.util.Map<String, ?> map) throws Exception {
            SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigEditingTimelineTimelineConfigTimelineConfigAudio self = new SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigEditingTimelineTimelineConfigTimelineConfigAudio();
            return TeaModel.build(map, self);
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigEditingTimelineTimelineConfigTimelineConfigAudio setChannelLayout(String channelLayout) {
            this.channelLayout = channelLayout;
            return this;
        }
        public String getChannelLayout() {
            return this.channelLayout;
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigEditingTimelineTimelineConfigTimelineConfigAudio setSamplerate(String samplerate) {
            this.samplerate = samplerate;
            return this;
        }
        public String getSamplerate() {
            return this.samplerate;
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigEditingTimelineTimelineConfigTimelineConfigAudio setChannels(String channels) {
            this.channels = channels;
            return this;
        }
        public String getChannels() {
            return this.channels;
        }

    }

    public static class SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigEditingTimelineTimelineConfigTimelineConfigVideo extends TeaModel {
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

        public static SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigEditingTimelineTimelineConfigTimelineConfigVideo build(java.util.Map<String, ?> map) throws Exception {
            SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigEditingTimelineTimelineConfigTimelineConfigVideo self = new SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigEditingTimelineTimelineConfigTimelineConfigVideo();
            return TeaModel.build(map, self);
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigEditingTimelineTimelineConfigTimelineConfigVideo setBgColor(String bgColor) {
            this.bgColor = bgColor;
            return this;
        }
        public String getBgColor() {
            return this.bgColor;
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigEditingTimelineTimelineConfigTimelineConfigVideo setWidth(String width) {
            this.width = width;
            return this;
        }
        public String getWidth() {
            return this.width;
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigEditingTimelineTimelineConfigTimelineConfigVideo setRenderRatio(String renderRatio) {
            this.renderRatio = renderRatio;
            return this;
        }
        public String getRenderRatio() {
            return this.renderRatio;
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigEditingTimelineTimelineConfigTimelineConfigVideo setIsGpuData(String isGpuData) {
            this.isGpuData = isGpuData;
            return this;
        }
        public String getIsGpuData() {
            return this.isGpuData;
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigEditingTimelineTimelineConfigTimelineConfigVideo setHeight(String height) {
            this.height = height;
            return this;
        }
        public String getHeight() {
            return this.height;
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigEditingTimelineTimelineConfigTimelineConfigVideo setIsOneTrackData(String isOneTrackData) {
            this.isOneTrackData = isOneTrackData;
            return this;
        }
        public String getIsOneTrackData() {
            return this.isOneTrackData;
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigEditingTimelineTimelineConfigTimelineConfigVideo setFps(String fps) {
            this.fps = fps;
            return this;
        }
        public String getFps() {
            return this.fps;
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigEditingTimelineTimelineConfigTimelineConfigVideo setReclosePrec(String reclosePrec) {
            this.reclosePrec = reclosePrec;
            return this;
        }
        public String getReclosePrec() {
            return this.reclosePrec;
        }

    }

    public static class SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigEditingTimelineTimelineConfig extends TeaModel {
        @NameInMap("TimelineConfigAudio")
        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigEditingTimelineTimelineConfigTimelineConfigAudio timelineConfigAudio;

        @NameInMap("TimelineConfigVideo")
        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigEditingTimelineTimelineConfigTimelineConfigVideo timelineConfigVideo;

        public static SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigEditingTimelineTimelineConfig build(java.util.Map<String, ?> map) throws Exception {
            SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigEditingTimelineTimelineConfig self = new SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigEditingTimelineTimelineConfig();
            return TeaModel.build(map, self);
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigEditingTimelineTimelineConfig setTimelineConfigAudio(SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigEditingTimelineTimelineConfigTimelineConfigAudio timelineConfigAudio) {
            this.timelineConfigAudio = timelineConfigAudio;
            return this;
        }
        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigEditingTimelineTimelineConfigTimelineConfigAudio getTimelineConfigAudio() {
            return this.timelineConfigAudio;
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigEditingTimelineTimelineConfig setTimelineConfigVideo(SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigEditingTimelineTimelineConfigTimelineConfigVideo timelineConfigVideo) {
            this.timelineConfigVideo = timelineConfigVideo;
            return this;
        }
        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigEditingTimelineTimelineConfigTimelineConfigVideo getTimelineConfigVideo() {
            return this.timelineConfigVideo;
        }

    }

    public static class SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigEditingTimeline extends TeaModel {
        @NameInMap("TrackList")
        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigEditingTimelineTrackList trackList;

        @NameInMap("TimelineConfig")
        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigEditingTimelineTimelineConfig timelineConfig;

        public static SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigEditingTimeline build(java.util.Map<String, ?> map) throws Exception {
            SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigEditingTimeline self = new SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigEditingTimeline();
            return TeaModel.build(map, self);
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigEditingTimeline setTrackList(SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigEditingTimelineTrackList trackList) {
            this.trackList = trackList;
            return this;
        }
        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigEditingTimelineTrackList getTrackList() {
            return this.trackList;
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigEditingTimeline setTimelineConfig(SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigEditingTimelineTimelineConfig timelineConfig) {
            this.timelineConfig = timelineConfig;
            return this;
        }
        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigEditingTimelineTimelineConfig getTimelineConfig() {
            return this.timelineConfig;
        }

    }

    public static class SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigEditingClipListClipEffectsEffect extends TeaModel {
        @NameInMap("Effect")
        public String effect;

        @NameInMap("EffectConfig")
        public String effectConfig;

        public static SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigEditingClipListClipEffectsEffect build(java.util.Map<String, ?> map) throws Exception {
            SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigEditingClipListClipEffectsEffect self = new SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigEditingClipListClipEffectsEffect();
            return TeaModel.build(map, self);
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigEditingClipListClipEffectsEffect setEffect(String effect) {
            this.effect = effect;
            return this;
        }
        public String getEffect() {
            return this.effect;
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigEditingClipListClipEffectsEffect setEffectConfig(String effectConfig) {
            this.effectConfig = effectConfig;
            return this;
        }
        public String getEffectConfig() {
            return this.effectConfig;
        }

    }

    public static class SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigEditingClipListClipEffects extends TeaModel {
        @NameInMap("Effect")
        public java.util.List<SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigEditingClipListClipEffectsEffect> effect;

        public static SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigEditingClipListClipEffects build(java.util.Map<String, ?> map) throws Exception {
            SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigEditingClipListClipEffects self = new SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigEditingClipListClipEffects();
            return TeaModel.build(map, self);
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigEditingClipListClipEffects setEffect(java.util.List<SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigEditingClipListClipEffectsEffect> effect) {
            this.effect = effect;
            return this;
        }
        public java.util.List<SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigEditingClipListClipEffectsEffect> getEffect() {
            return this.effect;
        }

    }

    public static class SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigEditingClipListClip extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("SourceID")
        public String sourceID;

        @NameInMap("Effects")
        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigEditingClipListClipEffects effects;

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

        public static SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigEditingClipListClip build(java.util.Map<String, ?> map) throws Exception {
            SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigEditingClipListClip self = new SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigEditingClipListClip();
            return TeaModel.build(map, self);
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigEditingClipListClip setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigEditingClipListClip setSourceID(String sourceID) {
            this.sourceID = sourceID;
            return this;
        }
        public String getSourceID() {
            return this.sourceID;
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigEditingClipListClip setEffects(SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigEditingClipListClipEffects effects) {
            this.effects = effects;
            return this;
        }
        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigEditingClipListClipEffects getEffects() {
            return this.effects;
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigEditingClipListClip setSourceType(String sourceType) {
            this.sourceType = sourceType;
            return this;
        }
        public String getSourceType() {
            return this.sourceType;
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigEditingClipListClip setSourceStrmMap(String sourceStrmMap) {
            this.sourceStrmMap = sourceStrmMap;
            return this;
        }
        public String getSourceStrmMap() {
            return this.sourceStrmMap;
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigEditingClipListClip setOut(String out) {
            this.out = out;
            return this;
        }
        public String getOut() {
            return this.out;
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigEditingClipListClip setIn(String in) {
            this.in = in;
            return this;
        }
        public String getIn() {
            return this.in;
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigEditingClipListClip setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

    public static class SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigEditingClipList extends TeaModel {
        @NameInMap("Clip")
        public java.util.List<SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigEditingClipListClip> clip;

        public static SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigEditingClipList build(java.util.Map<String, ?> map) throws Exception {
            SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigEditingClipList self = new SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigEditingClipList();
            return TeaModel.build(map, self);
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigEditingClipList setClip(java.util.List<SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigEditingClipListClip> clip) {
            this.clip = clip;
            return this;
        }
        public java.util.List<SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigEditingClipListClip> getClip() {
            return this.clip;
        }

    }

    public static class SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigEditing extends TeaModel {
        @NameInMap("Timeline")
        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigEditingTimeline timeline;

        @NameInMap("ClipList")
        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigEditingClipList clipList;

        public static SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigEditing build(java.util.Map<String, ?> map) throws Exception {
            SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigEditing self = new SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigEditing();
            return TeaModel.build(map, self);
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigEditing setTimeline(SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigEditingTimeline timeline) {
            this.timeline = timeline;
            return this;
        }
        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigEditingTimeline getTimeline() {
            return this.timeline;
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigEditing setClipList(SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigEditingClipList clipList) {
            this.clipList = clipList;
            return this;
        }
        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigEditingClipList getClipList() {
            return this.clipList;
        }

    }

    public static class SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigContainer extends TeaModel {
        @NameInMap("Format")
        public String format;

        public static SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigContainer build(java.util.Map<String, ?> map) throws Exception {
            SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigContainer self = new SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigContainer();
            return TeaModel.build(map, self);
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigContainer setFormat(String format) {
            this.format = format;
            return this;
        }
        public String getFormat() {
            return this.format;
        }

    }

    public static class SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigClipTimeSpan extends TeaModel {
        @NameInMap("Seek")
        public String seek;

        @NameInMap("Duration")
        public String duration;

        public static SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigClipTimeSpan build(java.util.Map<String, ?> map) throws Exception {
            SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigClipTimeSpan self = new SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigClipTimeSpan();
            return TeaModel.build(map, self);
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigClipTimeSpan setSeek(String seek) {
            this.seek = seek;
            return this;
        }
        public String getSeek() {
            return this.seek;
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigClipTimeSpan setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

    }

    public static class SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigClip extends TeaModel {
        @NameInMap("TimeSpan")
        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigClipTimeSpan timeSpan;

        public static SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigClip build(java.util.Map<String, ?> map) throws Exception {
            SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigClip self = new SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigClip();
            return TeaModel.build(map, self);
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigClip setTimeSpan(SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigClipTimeSpan timeSpan) {
            this.timeSpan = timeSpan;
            return this;
        }
        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigClipTimeSpan getTimeSpan() {
            return this.timeSpan;
        }

    }

    public static class SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigMuxConfigGif extends TeaModel {
        @NameInMap("FinalDelay")
        public String finalDelay;

        @NameInMap("DitherMode")
        public String ditherMode;

        @NameInMap("Loop")
        public String loop;

        @NameInMap("IsCustomPalette")
        public String isCustomPalette;

        public static SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigMuxConfigGif build(java.util.Map<String, ?> map) throws Exception {
            SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigMuxConfigGif self = new SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigMuxConfigGif();
            return TeaModel.build(map, self);
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigMuxConfigGif setFinalDelay(String finalDelay) {
            this.finalDelay = finalDelay;
            return this;
        }
        public String getFinalDelay() {
            return this.finalDelay;
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigMuxConfigGif setDitherMode(String ditherMode) {
            this.ditherMode = ditherMode;
            return this;
        }
        public String getDitherMode() {
            return this.ditherMode;
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigMuxConfigGif setLoop(String loop) {
            this.loop = loop;
            return this;
        }
        public String getLoop() {
            return this.loop;
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigMuxConfigGif setIsCustomPalette(String isCustomPalette) {
            this.isCustomPalette = isCustomPalette;
            return this;
        }
        public String getIsCustomPalette() {
            return this.isCustomPalette;
        }

    }

    public static class SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigMuxConfigSegment extends TeaModel {
        @NameInMap("Duration")
        public String duration;

        public static SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigMuxConfigSegment build(java.util.Map<String, ?> map) throws Exception {
            SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigMuxConfigSegment self = new SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigMuxConfigSegment();
            return TeaModel.build(map, self);
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigMuxConfigSegment setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

    }

    public static class SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigMuxConfig extends TeaModel {
        @NameInMap("Gif")
        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigMuxConfigGif gif;

        @NameInMap("Segment")
        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigMuxConfigSegment segment;

        public static SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigMuxConfig build(java.util.Map<String, ?> map) throws Exception {
            SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigMuxConfig self = new SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigMuxConfig();
            return TeaModel.build(map, self);
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigMuxConfig setGif(SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigMuxConfigGif gif) {
            this.gif = gif;
            return this;
        }
        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigMuxConfigGif getGif() {
            return this.gif;
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigMuxConfig setSegment(SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigMuxConfigSegment segment) {
            this.segment = segment;
            return this;
        }
        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigMuxConfigSegment getSegment() {
            return this.segment;
        }

    }

    public static class SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigSubtitleConfigExtSubtitleListExtSubtitleInput extends TeaModel {
        @NameInMap("Object")
        public String object;

        @NameInMap("Location")
        public String location;

        @NameInMap("Bucket")
        public String bucket;

        public static SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigSubtitleConfigExtSubtitleListExtSubtitleInput build(java.util.Map<String, ?> map) throws Exception {
            SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigSubtitleConfigExtSubtitleListExtSubtitleInput self = new SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigSubtitleConfigExtSubtitleListExtSubtitleInput();
            return TeaModel.build(map, self);
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigSubtitleConfigExtSubtitleListExtSubtitleInput setObject(String object) {
            this.object = object;
            return this;
        }
        public String getObject() {
            return this.object;
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigSubtitleConfigExtSubtitleListExtSubtitleInput setLocation(String location) {
            this.location = location;
            return this;
        }
        public String getLocation() {
            return this.location;
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigSubtitleConfigExtSubtitleListExtSubtitleInput setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

    }

    public static class SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigSubtitleConfigExtSubtitleListExtSubtitle extends TeaModel {
        @NameInMap("CharEnc")
        public String charEnc;

        @NameInMap("FontName")
        public String fontName;

        @NameInMap("Input")
        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigSubtitleConfigExtSubtitleListExtSubtitleInput input;

        public static SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigSubtitleConfigExtSubtitleListExtSubtitle build(java.util.Map<String, ?> map) throws Exception {
            SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigSubtitleConfigExtSubtitleListExtSubtitle self = new SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigSubtitleConfigExtSubtitleListExtSubtitle();
            return TeaModel.build(map, self);
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigSubtitleConfigExtSubtitleListExtSubtitle setCharEnc(String charEnc) {
            this.charEnc = charEnc;
            return this;
        }
        public String getCharEnc() {
            return this.charEnc;
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigSubtitleConfigExtSubtitleListExtSubtitle setFontName(String fontName) {
            this.fontName = fontName;
            return this;
        }
        public String getFontName() {
            return this.fontName;
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigSubtitleConfigExtSubtitleListExtSubtitle setInput(SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigSubtitleConfigExtSubtitleListExtSubtitleInput input) {
            this.input = input;
            return this;
        }
        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigSubtitleConfigExtSubtitleListExtSubtitleInput getInput() {
            return this.input;
        }

    }

    public static class SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigSubtitleConfigExtSubtitleList extends TeaModel {
        @NameInMap("ExtSubtitle")
        public java.util.List<SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigSubtitleConfigExtSubtitleListExtSubtitle> extSubtitle;

        public static SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigSubtitleConfigExtSubtitleList build(java.util.Map<String, ?> map) throws Exception {
            SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigSubtitleConfigExtSubtitleList self = new SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigSubtitleConfigExtSubtitleList();
            return TeaModel.build(map, self);
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigSubtitleConfigExtSubtitleList setExtSubtitle(java.util.List<SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigSubtitleConfigExtSubtitleListExtSubtitle> extSubtitle) {
            this.extSubtitle = extSubtitle;
            return this;
        }
        public java.util.List<SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigSubtitleConfigExtSubtitleListExtSubtitle> getExtSubtitle() {
            return this.extSubtitle;
        }

    }

    public static class SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigSubtitleConfigSubtitleListSubtitle extends TeaModel {
        @NameInMap("Map")
        public String map;

        public static SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigSubtitleConfigSubtitleListSubtitle build(java.util.Map<String, ?> map) throws Exception {
            SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigSubtitleConfigSubtitleListSubtitle self = new SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigSubtitleConfigSubtitleListSubtitle();
            return TeaModel.build(map, self);
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigSubtitleConfigSubtitleListSubtitle setMap(String map) {
            this.map = map;
            return this;
        }
        public String getMap() {
            return this.map;
        }

    }

    public static class SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigSubtitleConfigSubtitleList extends TeaModel {
        @NameInMap("Subtitle")
        public java.util.List<SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigSubtitleConfigSubtitleListSubtitle> subtitle;

        public static SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigSubtitleConfigSubtitleList build(java.util.Map<String, ?> map) throws Exception {
            SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigSubtitleConfigSubtitleList self = new SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigSubtitleConfigSubtitleList();
            return TeaModel.build(map, self);
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigSubtitleConfigSubtitleList setSubtitle(java.util.List<SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigSubtitleConfigSubtitleListSubtitle> subtitle) {
            this.subtitle = subtitle;
            return this;
        }
        public java.util.List<SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigSubtitleConfigSubtitleListSubtitle> getSubtitle() {
            return this.subtitle;
        }

    }

    public static class SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigSubtitleConfig extends TeaModel {
        @NameInMap("ExtSubtitleList")
        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigSubtitleConfigExtSubtitleList extSubtitleList;

        @NameInMap("SubtitleList")
        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigSubtitleConfigSubtitleList subtitleList;

        public static SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigSubtitleConfig build(java.util.Map<String, ?> map) throws Exception {
            SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigSubtitleConfig self = new SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigSubtitleConfig();
            return TeaModel.build(map, self);
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigSubtitleConfig setExtSubtitleList(SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigSubtitleConfigExtSubtitleList extSubtitleList) {
            this.extSubtitleList = extSubtitleList;
            return this;
        }
        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigSubtitleConfigExtSubtitleList getExtSubtitleList() {
            return this.extSubtitleList;
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigSubtitleConfig setSubtitleList(SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigSubtitleConfigSubtitleList subtitleList) {
            this.subtitleList = subtitleList;
            return this;
        }
        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigSubtitleConfigSubtitleList getSubtitleList() {
            return this.subtitleList;
        }

    }

    public static class SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigPropertiesStreamsVideoStreamListVideoStreamNetworkCost extends TeaModel {
        @NameInMap("PreloadTime")
        public String preloadTime;

        @NameInMap("AvgBitrate")
        public String avgBitrate;

        @NameInMap("CostBandwidth")
        public String costBandwidth;

        public static SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigPropertiesStreamsVideoStreamListVideoStreamNetworkCost build(java.util.Map<String, ?> map) throws Exception {
            SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigPropertiesStreamsVideoStreamListVideoStreamNetworkCost self = new SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigPropertiesStreamsVideoStreamListVideoStreamNetworkCost();
            return TeaModel.build(map, self);
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigPropertiesStreamsVideoStreamListVideoStreamNetworkCost setPreloadTime(String preloadTime) {
            this.preloadTime = preloadTime;
            return this;
        }
        public String getPreloadTime() {
            return this.preloadTime;
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigPropertiesStreamsVideoStreamListVideoStreamNetworkCost setAvgBitrate(String avgBitrate) {
            this.avgBitrate = avgBitrate;
            return this;
        }
        public String getAvgBitrate() {
            return this.avgBitrate;
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigPropertiesStreamsVideoStreamListVideoStreamNetworkCost setCostBandwidth(String costBandwidth) {
            this.costBandwidth = costBandwidth;
            return this;
        }
        public String getCostBandwidth() {
            return this.costBandwidth;
        }

    }

    public static class SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigPropertiesStreamsVideoStreamListVideoStream extends TeaModel {
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
        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigPropertiesStreamsVideoStreamListVideoStreamNetworkCost networkCost;

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

        public static SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigPropertiesStreamsVideoStreamListVideoStream build(java.util.Map<String, ?> map) throws Exception {
            SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigPropertiesStreamsVideoStreamListVideoStream self = new SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigPropertiesStreamsVideoStreamListVideoStream();
            return TeaModel.build(map, self);
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigPropertiesStreamsVideoStreamListVideoStream setIndex(String index) {
            this.index = index;
            return this;
        }
        public String getIndex() {
            return this.index;
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigPropertiesStreamsVideoStreamListVideoStream setTimebase(String timebase) {
            this.timebase = timebase;
            return this;
        }
        public String getTimebase() {
            return this.timebase;
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigPropertiesStreamsVideoStreamListVideoStream setAvgFPS(String avgFPS) {
            this.avgFPS = avgFPS;
            return this;
        }
        public String getAvgFPS() {
            return this.avgFPS;
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigPropertiesStreamsVideoStreamListVideoStream setPixFmt(String pixFmt) {
            this.pixFmt = pixFmt;
            return this;
        }
        public String getPixFmt() {
            return this.pixFmt;
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigPropertiesStreamsVideoStreamListVideoStream setSar(String sar) {
            this.sar = sar;
            return this;
        }
        public String getSar() {
            return this.sar;
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigPropertiesStreamsVideoStreamListVideoStream setLang(String lang) {
            this.lang = lang;
            return this;
        }
        public String getLang() {
            return this.lang;
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigPropertiesStreamsVideoStreamListVideoStream setCodecLongName(String codecLongName) {
            this.codecLongName = codecLongName;
            return this;
        }
        public String getCodecLongName() {
            return this.codecLongName;
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigPropertiesStreamsVideoStreamListVideoStream setHeight(String height) {
            this.height = height;
            return this;
        }
        public String getHeight() {
            return this.height;
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigPropertiesStreamsVideoStreamListVideoStream setNumFrames(String numFrames) {
            this.numFrames = numFrames;
            return this;
        }
        public String getNumFrames() {
            return this.numFrames;
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigPropertiesStreamsVideoStreamListVideoStream setBitrate(String bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public String getBitrate() {
            return this.bitrate;
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigPropertiesStreamsVideoStreamListVideoStream setCodecTagString(String codecTagString) {
            this.codecTagString = codecTagString;
            return this;
        }
        public String getCodecTagString() {
            return this.codecTagString;
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigPropertiesStreamsVideoStreamListVideoStream setHasBFrames(String hasBFrames) {
            this.hasBFrames = hasBFrames;
            return this;
        }
        public String getHasBFrames() {
            return this.hasBFrames;
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigPropertiesStreamsVideoStreamListVideoStream setProfile(String profile) {
            this.profile = profile;
            return this;
        }
        public String getProfile() {
            return this.profile;
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigPropertiesStreamsVideoStreamListVideoStream setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigPropertiesStreamsVideoStreamListVideoStream setNetworkCost(SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigPropertiesStreamsVideoStreamListVideoStreamNetworkCost networkCost) {
            this.networkCost = networkCost;
            return this;
        }
        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigPropertiesStreamsVideoStreamListVideoStreamNetworkCost getNetworkCost() {
            return this.networkCost;
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigPropertiesStreamsVideoStreamListVideoStream setDar(String dar) {
            this.dar = dar;
            return this;
        }
        public String getDar() {
            return this.dar;
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigPropertiesStreamsVideoStreamListVideoStream setCodecName(String codecName) {
            this.codecName = codecName;
            return this;
        }
        public String getCodecName() {
            return this.codecName;
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigPropertiesStreamsVideoStreamListVideoStream setWidth(String width) {
            this.width = width;
            return this;
        }
        public String getWidth() {
            return this.width;
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigPropertiesStreamsVideoStreamListVideoStream setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigPropertiesStreamsVideoStreamListVideoStream setFps(String fps) {
            this.fps = fps;
            return this;
        }
        public String getFps() {
            return this.fps;
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigPropertiesStreamsVideoStreamListVideoStream setCodecTag(String codecTag) {
            this.codecTag = codecTag;
            return this;
        }
        public String getCodecTag() {
            return this.codecTag;
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigPropertiesStreamsVideoStreamListVideoStream setCodecTimeBase(String codecTimeBase) {
            this.codecTimeBase = codecTimeBase;
            return this;
        }
        public String getCodecTimeBase() {
            return this.codecTimeBase;
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigPropertiesStreamsVideoStreamListVideoStream setLevel(String level) {
            this.level = level;
            return this;
        }
        public String getLevel() {
            return this.level;
        }

    }

    public static class SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigPropertiesStreamsVideoStreamList extends TeaModel {
        @NameInMap("VideoStream")
        public java.util.List<SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigPropertiesStreamsVideoStreamListVideoStream> videoStream;

        public static SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigPropertiesStreamsVideoStreamList build(java.util.Map<String, ?> map) throws Exception {
            SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigPropertiesStreamsVideoStreamList self = new SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigPropertiesStreamsVideoStreamList();
            return TeaModel.build(map, self);
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigPropertiesStreamsVideoStreamList setVideoStream(java.util.List<SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigPropertiesStreamsVideoStreamListVideoStream> videoStream) {
            this.videoStream = videoStream;
            return this;
        }
        public java.util.List<SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigPropertiesStreamsVideoStreamListVideoStream> getVideoStream() {
            return this.videoStream;
        }

    }

    public static class SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigPropertiesStreamsAudioStreamListAudioStream extends TeaModel {
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

        public static SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigPropertiesStreamsAudioStreamListAudioStream build(java.util.Map<String, ?> map) throws Exception {
            SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigPropertiesStreamsAudioStreamListAudioStream self = new SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigPropertiesStreamsAudioStreamListAudioStream();
            return TeaModel.build(map, self);
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigPropertiesStreamsAudioStreamListAudioStream setTimebase(String timebase) {
            this.timebase = timebase;
            return this;
        }
        public String getTimebase() {
            return this.timebase;
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigPropertiesStreamsAudioStreamListAudioStream setIndex(String index) {
            this.index = index;
            return this;
        }
        public String getIndex() {
            return this.index;
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigPropertiesStreamsAudioStreamListAudioStream setSampleFmt(String sampleFmt) {
            this.sampleFmt = sampleFmt;
            return this;
        }
        public String getSampleFmt() {
            return this.sampleFmt;
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigPropertiesStreamsAudioStreamListAudioStream setChannelLayout(String channelLayout) {
            this.channelLayout = channelLayout;
            return this;
        }
        public String getChannelLayout() {
            return this.channelLayout;
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigPropertiesStreamsAudioStreamListAudioStream setLang(String lang) {
            this.lang = lang;
            return this;
        }
        public String getLang() {
            return this.lang;
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigPropertiesStreamsAudioStreamListAudioStream setSamplerate(String samplerate) {
            this.samplerate = samplerate;
            return this;
        }
        public String getSamplerate() {
            return this.samplerate;
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigPropertiesStreamsAudioStreamListAudioStream setCodecLongName(String codecLongName) {
            this.codecLongName = codecLongName;
            return this;
        }
        public String getCodecLongName() {
            return this.codecLongName;
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigPropertiesStreamsAudioStreamListAudioStream setChannels(String channels) {
            this.channels = channels;
            return this;
        }
        public String getChannels() {
            return this.channels;
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigPropertiesStreamsAudioStreamListAudioStream setNumFrames(String numFrames) {
            this.numFrames = numFrames;
            return this;
        }
        public String getNumFrames() {
            return this.numFrames;
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigPropertiesStreamsAudioStreamListAudioStream setBitrate(String bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public String getBitrate() {
            return this.bitrate;
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigPropertiesStreamsAudioStreamListAudioStream setCodecTagString(String codecTagString) {
            this.codecTagString = codecTagString;
            return this;
        }
        public String getCodecTagString() {
            return this.codecTagString;
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigPropertiesStreamsAudioStreamListAudioStream setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigPropertiesStreamsAudioStreamListAudioStream setCodecName(String codecName) {
            this.codecName = codecName;
            return this;
        }
        public String getCodecName() {
            return this.codecName;
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigPropertiesStreamsAudioStreamListAudioStream setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigPropertiesStreamsAudioStreamListAudioStream setCodecTag(String codecTag) {
            this.codecTag = codecTag;
            return this;
        }
        public String getCodecTag() {
            return this.codecTag;
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigPropertiesStreamsAudioStreamListAudioStream setCodecTimeBase(String codecTimeBase) {
            this.codecTimeBase = codecTimeBase;
            return this;
        }
        public String getCodecTimeBase() {
            return this.codecTimeBase;
        }

    }

    public static class SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigPropertiesStreamsAudioStreamList extends TeaModel {
        @NameInMap("AudioStream")
        public java.util.List<SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigPropertiesStreamsAudioStreamListAudioStream> audioStream;

        public static SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigPropertiesStreamsAudioStreamList build(java.util.Map<String, ?> map) throws Exception {
            SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigPropertiesStreamsAudioStreamList self = new SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigPropertiesStreamsAudioStreamList();
            return TeaModel.build(map, self);
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigPropertiesStreamsAudioStreamList setAudioStream(java.util.List<SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigPropertiesStreamsAudioStreamListAudioStream> audioStream) {
            this.audioStream = audioStream;
            return this;
        }
        public java.util.List<SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigPropertiesStreamsAudioStreamListAudioStream> getAudioStream() {
            return this.audioStream;
        }

    }

    public static class SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigPropertiesStreamsSubtitleStreamListSubtitleStream extends TeaModel {
        @NameInMap("Index")
        public String index;

        @NameInMap("Lang")
        public String lang;

        public static SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigPropertiesStreamsSubtitleStreamListSubtitleStream build(java.util.Map<String, ?> map) throws Exception {
            SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigPropertiesStreamsSubtitleStreamListSubtitleStream self = new SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigPropertiesStreamsSubtitleStreamListSubtitleStream();
            return TeaModel.build(map, self);
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigPropertiesStreamsSubtitleStreamListSubtitleStream setIndex(String index) {
            this.index = index;
            return this;
        }
        public String getIndex() {
            return this.index;
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigPropertiesStreamsSubtitleStreamListSubtitleStream setLang(String lang) {
            this.lang = lang;
            return this;
        }
        public String getLang() {
            return this.lang;
        }

    }

    public static class SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigPropertiesStreamsSubtitleStreamList extends TeaModel {
        @NameInMap("SubtitleStream")
        public java.util.List<SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigPropertiesStreamsSubtitleStreamListSubtitleStream> subtitleStream;

        public static SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigPropertiesStreamsSubtitleStreamList build(java.util.Map<String, ?> map) throws Exception {
            SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigPropertiesStreamsSubtitleStreamList self = new SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigPropertiesStreamsSubtitleStreamList();
            return TeaModel.build(map, self);
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigPropertiesStreamsSubtitleStreamList setSubtitleStream(java.util.List<SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigPropertiesStreamsSubtitleStreamListSubtitleStream> subtitleStream) {
            this.subtitleStream = subtitleStream;
            return this;
        }
        public java.util.List<SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigPropertiesStreamsSubtitleStreamListSubtitleStream> getSubtitleStream() {
            return this.subtitleStream;
        }

    }

    public static class SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigPropertiesStreams extends TeaModel {
        @NameInMap("VideoStreamList")
        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigPropertiesStreamsVideoStreamList videoStreamList;

        @NameInMap("AudioStreamList")
        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigPropertiesStreamsAudioStreamList audioStreamList;

        @NameInMap("SubtitleStreamList")
        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigPropertiesStreamsSubtitleStreamList subtitleStreamList;

        public static SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigPropertiesStreams build(java.util.Map<String, ?> map) throws Exception {
            SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigPropertiesStreams self = new SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigPropertiesStreams();
            return TeaModel.build(map, self);
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigPropertiesStreams setVideoStreamList(SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigPropertiesStreamsVideoStreamList videoStreamList) {
            this.videoStreamList = videoStreamList;
            return this;
        }
        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigPropertiesStreamsVideoStreamList getVideoStreamList() {
            return this.videoStreamList;
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigPropertiesStreams setAudioStreamList(SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigPropertiesStreamsAudioStreamList audioStreamList) {
            this.audioStreamList = audioStreamList;
            return this;
        }
        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigPropertiesStreamsAudioStreamList getAudioStreamList() {
            return this.audioStreamList;
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigPropertiesStreams setSubtitleStreamList(SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigPropertiesStreamsSubtitleStreamList subtitleStreamList) {
            this.subtitleStreamList = subtitleStreamList;
            return this;
        }
        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigPropertiesStreamsSubtitleStreamList getSubtitleStreamList() {
            return this.subtitleStreamList;
        }

    }

    public static class SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigPropertiesFormat extends TeaModel {
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

        public static SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigPropertiesFormat build(java.util.Map<String, ?> map) throws Exception {
            SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigPropertiesFormat self = new SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigPropertiesFormat();
            return TeaModel.build(map, self);
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigPropertiesFormat setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigPropertiesFormat setNumPrograms(String numPrograms) {
            this.numPrograms = numPrograms;
            return this;
        }
        public String getNumPrograms() {
            return this.numPrograms;
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigPropertiesFormat setSize(String size) {
            this.size = size;
            return this;
        }
        public String getSize() {
            return this.size;
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigPropertiesFormat setNumStreams(String numStreams) {
            this.numStreams = numStreams;
            return this;
        }
        public String getNumStreams() {
            return this.numStreams;
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigPropertiesFormat setFormatLongName(String formatLongName) {
            this.formatLongName = formatLongName;
            return this;
        }
        public String getFormatLongName() {
            return this.formatLongName;
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigPropertiesFormat setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigPropertiesFormat setBitrate(String bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public String getBitrate() {
            return this.bitrate;
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigPropertiesFormat setFormatName(String formatName) {
            this.formatName = formatName;
            return this;
        }
        public String getFormatName() {
            return this.formatName;
        }

    }

    public static class SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigProperties extends TeaModel {
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
        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigPropertiesStreams streams;

        @NameInMap("Format")
        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigPropertiesFormat format;

        @NameInMap("FileSize")
        public String fileSize;

        public static SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigProperties build(java.util.Map<String, ?> map) throws Exception {
            SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigProperties self = new SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigProperties();
            return TeaModel.build(map, self);
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigProperties setWidth(String width) {
            this.width = width;
            return this;
        }
        public String getWidth() {
            return this.width;
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigProperties setHeight(String height) {
            this.height = height;
            return this;
        }
        public String getHeight() {
            return this.height;
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigProperties setDuration(String duration) {
            this.duration = duration;
            return this;
        }
        public String getDuration() {
            return this.duration;
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigProperties setFps(String fps) {
            this.fps = fps;
            return this;
        }
        public String getFps() {
            return this.fps;
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigProperties setBitrate(String bitrate) {
            this.bitrate = bitrate;
            return this;
        }
        public String getBitrate() {
            return this.bitrate;
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigProperties setFileFormat(String fileFormat) {
            this.fileFormat = fileFormat;
            return this;
        }
        public String getFileFormat() {
            return this.fileFormat;
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigProperties setStreams(SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigPropertiesStreams streams) {
            this.streams = streams;
            return this;
        }
        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigPropertiesStreams getStreams() {
            return this.streams;
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigProperties setFormat(SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigPropertiesFormat format) {
            this.format = format;
            return this;
        }
        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigPropertiesFormat getFormat() {
            return this.format;
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigProperties setFileSize(String fileSize) {
            this.fileSize = fileSize;
            return this;
        }
        public String getFileSize() {
            return this.fileSize;
        }

    }

    public static class SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfig extends TeaModel {
        @NameInMap("Video")
        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigVideo video;

        @NameInMap("TransConfig")
        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigTransConfig transConfig;

        @NameInMap("Encryption")
        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigEncryption encryption;

        @NameInMap("WaterMarkList")
        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigWaterMarkList waterMarkList;

        @NameInMap("DeWatermark")
        public String deWatermark;

        @NameInMap("WaterMarkConfigUrl")
        public String waterMarkConfigUrl;

        @NameInMap("M3U8NonStandardSupport")
        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigM3U8NonStandardSupport m3U8NonStandardSupport;

        @NameInMap("Priority")
        public String priority;

        @NameInMap("Audio")
        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigAudio audio;

        @NameInMap("AudioStreamMap")
        public String audioStreamMap;

        @NameInMap("MergeList")
        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigMergeList mergeList;

        @NameInMap("SuperReso")
        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigSuperReso superReso;

        @NameInMap("UserData")
        public String userData;

        @NameInMap("DigiWaterMark")
        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigDigiWaterMark digiWaterMark;

        @NameInMap("VideoStreamMap")
        public String videoStreamMap;

        @NameInMap("OutputFile")
        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigOutputFile outputFile;

        @NameInMap("Rotate")
        public String rotate;

        @NameInMap("Editing")
        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigEditing editing;

        @NameInMap("Container")
        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigContainer container;

        @NameInMap("Clip")
        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigClip clip;

        @NameInMap("MergeConfigUrl")
        public String mergeConfigUrl;

        @NameInMap("MuxConfig")
        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigMuxConfig muxConfig;

        @NameInMap("TemplateId")
        public String templateId;

        @NameInMap("SubtitleConfig")
        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigSubtitleConfig subtitleConfig;

        @NameInMap("Properties")
        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigProperties properties;

        public static SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfig build(java.util.Map<String, ?> map) throws Exception {
            SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfig self = new SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfig();
            return TeaModel.build(map, self);
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfig setVideo(SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigVideo video) {
            this.video = video;
            return this;
        }
        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigVideo getVideo() {
            return this.video;
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfig setTransConfig(SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigTransConfig transConfig) {
            this.transConfig = transConfig;
            return this;
        }
        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigTransConfig getTransConfig() {
            return this.transConfig;
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfig setEncryption(SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigEncryption encryption) {
            this.encryption = encryption;
            return this;
        }
        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigEncryption getEncryption() {
            return this.encryption;
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfig setWaterMarkList(SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigWaterMarkList waterMarkList) {
            this.waterMarkList = waterMarkList;
            return this;
        }
        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigWaterMarkList getWaterMarkList() {
            return this.waterMarkList;
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfig setDeWatermark(String deWatermark) {
            this.deWatermark = deWatermark;
            return this;
        }
        public String getDeWatermark() {
            return this.deWatermark;
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfig setWaterMarkConfigUrl(String waterMarkConfigUrl) {
            this.waterMarkConfigUrl = waterMarkConfigUrl;
            return this;
        }
        public String getWaterMarkConfigUrl() {
            return this.waterMarkConfigUrl;
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfig setM3U8NonStandardSupport(SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigM3U8NonStandardSupport m3U8NonStandardSupport) {
            this.m3U8NonStandardSupport = m3U8NonStandardSupport;
            return this;
        }
        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigM3U8NonStandardSupport getM3U8NonStandardSupport() {
            return this.m3U8NonStandardSupport;
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfig setPriority(String priority) {
            this.priority = priority;
            return this;
        }
        public String getPriority() {
            return this.priority;
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfig setAudio(SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigAudio audio) {
            this.audio = audio;
            return this;
        }
        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigAudio getAudio() {
            return this.audio;
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfig setAudioStreamMap(String audioStreamMap) {
            this.audioStreamMap = audioStreamMap;
            return this;
        }
        public String getAudioStreamMap() {
            return this.audioStreamMap;
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfig setMergeList(SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigMergeList mergeList) {
            this.mergeList = mergeList;
            return this;
        }
        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigMergeList getMergeList() {
            return this.mergeList;
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfig setSuperReso(SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigSuperReso superReso) {
            this.superReso = superReso;
            return this;
        }
        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigSuperReso getSuperReso() {
            return this.superReso;
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfig setUserData(String userData) {
            this.userData = userData;
            return this;
        }
        public String getUserData() {
            return this.userData;
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfig setDigiWaterMark(SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigDigiWaterMark digiWaterMark) {
            this.digiWaterMark = digiWaterMark;
            return this;
        }
        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigDigiWaterMark getDigiWaterMark() {
            return this.digiWaterMark;
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfig setVideoStreamMap(String videoStreamMap) {
            this.videoStreamMap = videoStreamMap;
            return this;
        }
        public String getVideoStreamMap() {
            return this.videoStreamMap;
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfig setOutputFile(SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigOutputFile outputFile) {
            this.outputFile = outputFile;
            return this;
        }
        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigOutputFile getOutputFile() {
            return this.outputFile;
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfig setRotate(String rotate) {
            this.rotate = rotate;
            return this;
        }
        public String getRotate() {
            return this.rotate;
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfig setEditing(SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigEditing editing) {
            this.editing = editing;
            return this;
        }
        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigEditing getEditing() {
            return this.editing;
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfig setContainer(SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigContainer container) {
            this.container = container;
            return this;
        }
        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigContainer getContainer() {
            return this.container;
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfig setClip(SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigClip clip) {
            this.clip = clip;
            return this;
        }
        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigClip getClip() {
            return this.clip;
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfig setMergeConfigUrl(String mergeConfigUrl) {
            this.mergeConfigUrl = mergeConfigUrl;
            return this;
        }
        public String getMergeConfigUrl() {
            return this.mergeConfigUrl;
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfig setMuxConfig(SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigMuxConfig muxConfig) {
            this.muxConfig = muxConfig;
            return this;
        }
        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigMuxConfig getMuxConfig() {
            return this.muxConfig;
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfig setTemplateId(String templateId) {
            this.templateId = templateId;
            return this;
        }
        public String getTemplateId() {
            return this.templateId;
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfig setSubtitleConfig(SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigSubtitleConfig subtitleConfig) {
            this.subtitleConfig = subtitleConfig;
            return this;
        }
        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigSubtitleConfig getSubtitleConfig() {
            return this.subtitleConfig;
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfig setProperties(SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigProperties properties) {
            this.properties = properties;
            return this;
        }
        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfigProperties getProperties() {
            return this.properties;
        }

    }

    public static class SubmitEditingJobsResponseBodyJobResultListJobResultJobMNSMessageResult extends TeaModel {
        @NameInMap("MessageId")
        public String messageId;

        @NameInMap("ErrorMessage")
        public String errorMessage;

        @NameInMap("ErrorCode")
        public String errorCode;

        public static SubmitEditingJobsResponseBodyJobResultListJobResultJobMNSMessageResult build(java.util.Map<String, ?> map) throws Exception {
            SubmitEditingJobsResponseBodyJobResultListJobResultJobMNSMessageResult self = new SubmitEditingJobsResponseBodyJobResultListJobResultJobMNSMessageResult();
            return TeaModel.build(map, self);
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobMNSMessageResult setMessageId(String messageId) {
            this.messageId = messageId;
            return this;
        }
        public String getMessageId() {
            return this.messageId;
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobMNSMessageResult setErrorMessage(String errorMessage) {
            this.errorMessage = errorMessage;
            return this;
        }
        public String getErrorMessage() {
            return this.errorMessage;
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJobMNSMessageResult setErrorCode(String errorCode) {
            this.errorCode = errorCode;
            return this;
        }
        public String getErrorCode() {
            return this.errorCode;
        }

    }

    public static class SubmitEditingJobsResponseBodyJobResultListJobResultJob extends TeaModel {
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
        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingInputs editingInputs;

        @NameInMap("PipelineId")
        public String pipelineId;

        @NameInMap("EditingConfig")
        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfig editingConfig;

        @NameInMap("MNSMessageResult")
        public SubmitEditingJobsResponseBodyJobResultListJobResultJobMNSMessageResult MNSMessageResult;

        public static SubmitEditingJobsResponseBodyJobResultListJobResultJob build(java.util.Map<String, ?> map) throws Exception {
            SubmitEditingJobsResponseBodyJobResultListJobResultJob self = new SubmitEditingJobsResponseBodyJobResultListJobResultJob();
            return TeaModel.build(map, self);
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJob setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJob setPercent(Long percent) {
            this.percent = percent;
            return this;
        }
        public Long getPercent() {
            return this.percent;
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJob setFinishTime(String finishTime) {
            this.finishTime = finishTime;
            return this;
        }
        public String getFinishTime() {
            return this.finishTime;
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJob setState(String state) {
            this.state = state;
            return this;
        }
        public String getState() {
            return this.state;
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJob setJobId(String jobId) {
            this.jobId = jobId;
            return this;
        }
        public String getJobId() {
            return this.jobId;
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJob setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJob setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJob setEditingInputs(SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingInputs editingInputs) {
            this.editingInputs = editingInputs;
            return this;
        }
        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingInputs getEditingInputs() {
            return this.editingInputs;
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJob setPipelineId(String pipelineId) {
            this.pipelineId = pipelineId;
            return this;
        }
        public String getPipelineId() {
            return this.pipelineId;
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJob setEditingConfig(SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfig editingConfig) {
            this.editingConfig = editingConfig;
            return this;
        }
        public SubmitEditingJobsResponseBodyJobResultListJobResultJobEditingConfig getEditingConfig() {
            return this.editingConfig;
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResultJob setMNSMessageResult(SubmitEditingJobsResponseBodyJobResultListJobResultJobMNSMessageResult MNSMessageResult) {
            this.MNSMessageResult = MNSMessageResult;
            return this;
        }
        public SubmitEditingJobsResponseBodyJobResultListJobResultJobMNSMessageResult getMNSMessageResult() {
            return this.MNSMessageResult;
        }

    }

    public static class SubmitEditingJobsResponseBodyJobResultListJobResult extends TeaModel {
        @NameInMap("Job")
        public SubmitEditingJobsResponseBodyJobResultListJobResultJob job;

        @NameInMap("Success")
        public Boolean success;

        @NameInMap("Code")
        public String code;

        @NameInMap("Message")
        public String message;

        public static SubmitEditingJobsResponseBodyJobResultListJobResult build(java.util.Map<String, ?> map) throws Exception {
            SubmitEditingJobsResponseBodyJobResultListJobResult self = new SubmitEditingJobsResponseBodyJobResultListJobResult();
            return TeaModel.build(map, self);
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResult setJob(SubmitEditingJobsResponseBodyJobResultListJobResultJob job) {
            this.job = job;
            return this;
        }
        public SubmitEditingJobsResponseBodyJobResultListJobResultJob getJob() {
            return this.job;
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResult setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResult setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public SubmitEditingJobsResponseBodyJobResultListJobResult setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

    public static class SubmitEditingJobsResponseBodyJobResultList extends TeaModel {
        @NameInMap("JobResult")
        public java.util.List<SubmitEditingJobsResponseBodyJobResultListJobResult> jobResult;

        public static SubmitEditingJobsResponseBodyJobResultList build(java.util.Map<String, ?> map) throws Exception {
            SubmitEditingJobsResponseBodyJobResultList self = new SubmitEditingJobsResponseBodyJobResultList();
            return TeaModel.build(map, self);
        }

        public SubmitEditingJobsResponseBodyJobResultList setJobResult(java.util.List<SubmitEditingJobsResponseBodyJobResultListJobResult> jobResult) {
            this.jobResult = jobResult;
            return this;
        }
        public java.util.List<SubmitEditingJobsResponseBodyJobResultListJobResult> getJobResult() {
            return this.jobResult;
        }

    }

}
