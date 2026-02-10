// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveStreamTranscodeInfoResponseBody extends TeaModel {
    @NameInMap("DomainTranscodeList")
    public DescribeLiveStreamTranscodeInfoResponseBodyDomainTranscodeList domainTranscodeList;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>62136AE6-7793-45ED-B14A-60D19A9486D3</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeLiveStreamTranscodeInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveStreamTranscodeInfoResponseBody self = new DescribeLiveStreamTranscodeInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLiveStreamTranscodeInfoResponseBody setDomainTranscodeList(DescribeLiveStreamTranscodeInfoResponseBodyDomainTranscodeList domainTranscodeList) {
        this.domainTranscodeList = domainTranscodeList;
        return this;
    }
    public DescribeLiveStreamTranscodeInfoResponseBodyDomainTranscodeList getDomainTranscodeList() {
        return this.domainTranscodeList;
    }

    public DescribeLiveStreamTranscodeInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeLiveStreamTranscodeInfoResponseBodyDomainTranscodeListDomainTranscodeInfoCustomTranscodeParameters extends TeaModel {
        @NameInMap("AudioBitrate")
        public Integer audioBitrate;

        @NameInMap("AudioChannelNum")
        public Integer audioChannelNum;

        @NameInMap("AudioCodec")
        public String audioCodec;

        @NameInMap("AudioProfile")
        public String audioProfile;

        @NameInMap("AudioRate")
        public Integer audioRate;

        @NameInMap("Bframes")
        public String bframes;

        @NameInMap("BitrateWithSource")
        public java.util.Map<String, ?> bitrateWithSource;

        @NameInMap("DeInterlaced")
        public Boolean deInterlaced;

        @NameInMap("ExtWithSource")
        public java.util.Map<String, ?> extWithSource;

        @NameInMap("FPS")
        public Integer FPS;

        @NameInMap("FpsWithSource")
        public java.util.Map<String, ?> fpsWithSource;

        @NameInMap("Gop")
        public String gop;

        @NameInMap("Height")
        public Integer height;

        @NameInMap("ResWithSource")
        public java.util.Map<String, ?> resWithSource;

        @NameInMap("RtsFlag")
        public String rtsFlag;

        @NameInMap("TemplateType")
        public String templateType;

        @NameInMap("VideoBitrate")
        public Integer videoBitrate;

        @NameInMap("VideoProfile")
        public String videoProfile;

        @NameInMap("Width")
        public Integer width;

        public static DescribeLiveStreamTranscodeInfoResponseBodyDomainTranscodeListDomainTranscodeInfoCustomTranscodeParameters build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveStreamTranscodeInfoResponseBodyDomainTranscodeListDomainTranscodeInfoCustomTranscodeParameters self = new DescribeLiveStreamTranscodeInfoResponseBodyDomainTranscodeListDomainTranscodeInfoCustomTranscodeParameters();
            return TeaModel.build(map, self);
        }

        public DescribeLiveStreamTranscodeInfoResponseBodyDomainTranscodeListDomainTranscodeInfoCustomTranscodeParameters setAudioBitrate(Integer audioBitrate) {
            this.audioBitrate = audioBitrate;
            return this;
        }
        public Integer getAudioBitrate() {
            return this.audioBitrate;
        }

        public DescribeLiveStreamTranscodeInfoResponseBodyDomainTranscodeListDomainTranscodeInfoCustomTranscodeParameters setAudioChannelNum(Integer audioChannelNum) {
            this.audioChannelNum = audioChannelNum;
            return this;
        }
        public Integer getAudioChannelNum() {
            return this.audioChannelNum;
        }

        public DescribeLiveStreamTranscodeInfoResponseBodyDomainTranscodeListDomainTranscodeInfoCustomTranscodeParameters setAudioCodec(String audioCodec) {
            this.audioCodec = audioCodec;
            return this;
        }
        public String getAudioCodec() {
            return this.audioCodec;
        }

        public DescribeLiveStreamTranscodeInfoResponseBodyDomainTranscodeListDomainTranscodeInfoCustomTranscodeParameters setAudioProfile(String audioProfile) {
            this.audioProfile = audioProfile;
            return this;
        }
        public String getAudioProfile() {
            return this.audioProfile;
        }

        public DescribeLiveStreamTranscodeInfoResponseBodyDomainTranscodeListDomainTranscodeInfoCustomTranscodeParameters setAudioRate(Integer audioRate) {
            this.audioRate = audioRate;
            return this;
        }
        public Integer getAudioRate() {
            return this.audioRate;
        }

        public DescribeLiveStreamTranscodeInfoResponseBodyDomainTranscodeListDomainTranscodeInfoCustomTranscodeParameters setBframes(String bframes) {
            this.bframes = bframes;
            return this;
        }
        public String getBframes() {
            return this.bframes;
        }

        public DescribeLiveStreamTranscodeInfoResponseBodyDomainTranscodeListDomainTranscodeInfoCustomTranscodeParameters setBitrateWithSource(java.util.Map<String, ?> bitrateWithSource) {
            this.bitrateWithSource = bitrateWithSource;
            return this;
        }
        public java.util.Map<String, ?> getBitrateWithSource() {
            return this.bitrateWithSource;
        }

        public DescribeLiveStreamTranscodeInfoResponseBodyDomainTranscodeListDomainTranscodeInfoCustomTranscodeParameters setDeInterlaced(Boolean deInterlaced) {
            this.deInterlaced = deInterlaced;
            return this;
        }
        public Boolean getDeInterlaced() {
            return this.deInterlaced;
        }

        public DescribeLiveStreamTranscodeInfoResponseBodyDomainTranscodeListDomainTranscodeInfoCustomTranscodeParameters setExtWithSource(java.util.Map<String, ?> extWithSource) {
            this.extWithSource = extWithSource;
            return this;
        }
        public java.util.Map<String, ?> getExtWithSource() {
            return this.extWithSource;
        }

        public DescribeLiveStreamTranscodeInfoResponseBodyDomainTranscodeListDomainTranscodeInfoCustomTranscodeParameters setFPS(Integer FPS) {
            this.FPS = FPS;
            return this;
        }
        public Integer getFPS() {
            return this.FPS;
        }

        public DescribeLiveStreamTranscodeInfoResponseBodyDomainTranscodeListDomainTranscodeInfoCustomTranscodeParameters setFpsWithSource(java.util.Map<String, ?> fpsWithSource) {
            this.fpsWithSource = fpsWithSource;
            return this;
        }
        public java.util.Map<String, ?> getFpsWithSource() {
            return this.fpsWithSource;
        }

        public DescribeLiveStreamTranscodeInfoResponseBodyDomainTranscodeListDomainTranscodeInfoCustomTranscodeParameters setGop(String gop) {
            this.gop = gop;
            return this;
        }
        public String getGop() {
            return this.gop;
        }

        public DescribeLiveStreamTranscodeInfoResponseBodyDomainTranscodeListDomainTranscodeInfoCustomTranscodeParameters setHeight(Integer height) {
            this.height = height;
            return this;
        }
        public Integer getHeight() {
            return this.height;
        }

        public DescribeLiveStreamTranscodeInfoResponseBodyDomainTranscodeListDomainTranscodeInfoCustomTranscodeParameters setResWithSource(java.util.Map<String, ?> resWithSource) {
            this.resWithSource = resWithSource;
            return this;
        }
        public java.util.Map<String, ?> getResWithSource() {
            return this.resWithSource;
        }

        public DescribeLiveStreamTranscodeInfoResponseBodyDomainTranscodeListDomainTranscodeInfoCustomTranscodeParameters setRtsFlag(String rtsFlag) {
            this.rtsFlag = rtsFlag;
            return this;
        }
        public String getRtsFlag() {
            return this.rtsFlag;
        }

        public DescribeLiveStreamTranscodeInfoResponseBodyDomainTranscodeListDomainTranscodeInfoCustomTranscodeParameters setTemplateType(String templateType) {
            this.templateType = templateType;
            return this;
        }
        public String getTemplateType() {
            return this.templateType;
        }

        public DescribeLiveStreamTranscodeInfoResponseBodyDomainTranscodeListDomainTranscodeInfoCustomTranscodeParameters setVideoBitrate(Integer videoBitrate) {
            this.videoBitrate = videoBitrate;
            return this;
        }
        public Integer getVideoBitrate() {
            return this.videoBitrate;
        }

        public DescribeLiveStreamTranscodeInfoResponseBodyDomainTranscodeListDomainTranscodeInfoCustomTranscodeParameters setVideoProfile(String videoProfile) {
            this.videoProfile = videoProfile;
            return this;
        }
        public String getVideoProfile() {
            return this.videoProfile;
        }

        public DescribeLiveStreamTranscodeInfoResponseBodyDomainTranscodeListDomainTranscodeInfoCustomTranscodeParameters setWidth(Integer width) {
            this.width = width;
            return this;
        }
        public Integer getWidth() {
            return this.width;
        }

    }

    public static class DescribeLiveStreamTranscodeInfoResponseBodyDomainTranscodeListDomainTranscodeInfoEncryptParameters extends TeaModel {
        @NameInMap("EncryptType")
        public String encryptType;

        @NameInMap("KmsKeyExpireInterval")
        public String kmsKeyExpireInterval;

        @NameInMap("KmsKeyID")
        public String kmsKeyID;

        public static DescribeLiveStreamTranscodeInfoResponseBodyDomainTranscodeListDomainTranscodeInfoEncryptParameters build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveStreamTranscodeInfoResponseBodyDomainTranscodeListDomainTranscodeInfoEncryptParameters self = new DescribeLiveStreamTranscodeInfoResponseBodyDomainTranscodeListDomainTranscodeInfoEncryptParameters();
            return TeaModel.build(map, self);
        }

        public DescribeLiveStreamTranscodeInfoResponseBodyDomainTranscodeListDomainTranscodeInfoEncryptParameters setEncryptType(String encryptType) {
            this.encryptType = encryptType;
            return this;
        }
        public String getEncryptType() {
            return this.encryptType;
        }

        public DescribeLiveStreamTranscodeInfoResponseBodyDomainTranscodeListDomainTranscodeInfoEncryptParameters setKmsKeyExpireInterval(String kmsKeyExpireInterval) {
            this.kmsKeyExpireInterval = kmsKeyExpireInterval;
            return this;
        }
        public String getKmsKeyExpireInterval() {
            return this.kmsKeyExpireInterval;
        }

        public DescribeLiveStreamTranscodeInfoResponseBodyDomainTranscodeListDomainTranscodeInfoEncryptParameters setKmsKeyID(String kmsKeyID) {
            this.kmsKeyID = kmsKeyID;
            return this;
        }
        public String getKmsKeyID() {
            return this.kmsKeyID;
        }

    }

    public static class DescribeLiveStreamTranscodeInfoResponseBodyDomainTranscodeListDomainTranscodeInfo extends TeaModel {
        @NameInMap("CustomTranscodeParameters")
        public DescribeLiveStreamTranscodeInfoResponseBodyDomainTranscodeListDomainTranscodeInfoCustomTranscodeParameters customTranscodeParameters;

        @NameInMap("EncryptParameters")
        public DescribeLiveStreamTranscodeInfoResponseBodyDomainTranscodeListDomainTranscodeInfoEncryptParameters encryptParameters;

        @NameInMap("IsLazy")
        public Boolean isLazy;

        @NameInMap("TranscodeApp")
        public String transcodeApp;

        @NameInMap("TranscodeName")
        public String transcodeName;

        @NameInMap("TranscodeTemplate")
        public String transcodeTemplate;

        public static DescribeLiveStreamTranscodeInfoResponseBodyDomainTranscodeListDomainTranscodeInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveStreamTranscodeInfoResponseBodyDomainTranscodeListDomainTranscodeInfo self = new DescribeLiveStreamTranscodeInfoResponseBodyDomainTranscodeListDomainTranscodeInfo();
            return TeaModel.build(map, self);
        }

        public DescribeLiveStreamTranscodeInfoResponseBodyDomainTranscodeListDomainTranscodeInfo setCustomTranscodeParameters(DescribeLiveStreamTranscodeInfoResponseBodyDomainTranscodeListDomainTranscodeInfoCustomTranscodeParameters customTranscodeParameters) {
            this.customTranscodeParameters = customTranscodeParameters;
            return this;
        }
        public DescribeLiveStreamTranscodeInfoResponseBodyDomainTranscodeListDomainTranscodeInfoCustomTranscodeParameters getCustomTranscodeParameters() {
            return this.customTranscodeParameters;
        }

        public DescribeLiveStreamTranscodeInfoResponseBodyDomainTranscodeListDomainTranscodeInfo setEncryptParameters(DescribeLiveStreamTranscodeInfoResponseBodyDomainTranscodeListDomainTranscodeInfoEncryptParameters encryptParameters) {
            this.encryptParameters = encryptParameters;
            return this;
        }
        public DescribeLiveStreamTranscodeInfoResponseBodyDomainTranscodeListDomainTranscodeInfoEncryptParameters getEncryptParameters() {
            return this.encryptParameters;
        }

        public DescribeLiveStreamTranscodeInfoResponseBodyDomainTranscodeListDomainTranscodeInfo setIsLazy(Boolean isLazy) {
            this.isLazy = isLazy;
            return this;
        }
        public Boolean getIsLazy() {
            return this.isLazy;
        }

        public DescribeLiveStreamTranscodeInfoResponseBodyDomainTranscodeListDomainTranscodeInfo setTranscodeApp(String transcodeApp) {
            this.transcodeApp = transcodeApp;
            return this;
        }
        public String getTranscodeApp() {
            return this.transcodeApp;
        }

        public DescribeLiveStreamTranscodeInfoResponseBodyDomainTranscodeListDomainTranscodeInfo setTranscodeName(String transcodeName) {
            this.transcodeName = transcodeName;
            return this;
        }
        public String getTranscodeName() {
            return this.transcodeName;
        }

        public DescribeLiveStreamTranscodeInfoResponseBodyDomainTranscodeListDomainTranscodeInfo setTranscodeTemplate(String transcodeTemplate) {
            this.transcodeTemplate = transcodeTemplate;
            return this;
        }
        public String getTranscodeTemplate() {
            return this.transcodeTemplate;
        }

    }

    public static class DescribeLiveStreamTranscodeInfoResponseBodyDomainTranscodeList extends TeaModel {
        @NameInMap("DomainTranscodeInfo")
        public java.util.List<DescribeLiveStreamTranscodeInfoResponseBodyDomainTranscodeListDomainTranscodeInfo> domainTranscodeInfo;

        public static DescribeLiveStreamTranscodeInfoResponseBodyDomainTranscodeList build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveStreamTranscodeInfoResponseBodyDomainTranscodeList self = new DescribeLiveStreamTranscodeInfoResponseBodyDomainTranscodeList();
            return TeaModel.build(map, self);
        }

        public DescribeLiveStreamTranscodeInfoResponseBodyDomainTranscodeList setDomainTranscodeInfo(java.util.List<DescribeLiveStreamTranscodeInfoResponseBodyDomainTranscodeListDomainTranscodeInfo> domainTranscodeInfo) {
            this.domainTranscodeInfo = domainTranscodeInfo;
            return this;
        }
        public java.util.List<DescribeLiveStreamTranscodeInfoResponseBodyDomainTranscodeListDomainTranscodeInfo> getDomainTranscodeInfo() {
            return this.domainTranscodeInfo;
        }

    }

}
