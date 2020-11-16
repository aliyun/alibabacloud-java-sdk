// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveStreamTranscodeInfoResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("DomainTranscodeList")
    @Validation(required = true)
    public DescribeLiveStreamTranscodeInfoResponseDomainTranscodeList domainTranscodeList;

    public static DescribeLiveStreamTranscodeInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveStreamTranscodeInfoResponse self = new DescribeLiveStreamTranscodeInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLiveStreamTranscodeInfoResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLiveStreamTranscodeInfoResponse setDomainTranscodeList(DescribeLiveStreamTranscodeInfoResponseDomainTranscodeList domainTranscodeList) {
        this.domainTranscodeList = domainTranscodeList;
        return this;
    }
    public DescribeLiveStreamTranscodeInfoResponseDomainTranscodeList getDomainTranscodeList() {
        return this.domainTranscodeList;
    }

    public static class DescribeLiveStreamTranscodeInfoResponseDomainTranscodeListDomainTranscodeInfoCustomTranscodeParameters extends TeaModel {
        @NameInMap("RtsFlag")
        @Validation(required = true)
        public String rtsFlag;

        @NameInMap("Bframes")
        @Validation(required = true)
        public String bframes;

        @NameInMap("VideoBitrate")
        @Validation(required = true)
        public Integer videoBitrate;

        @NameInMap("FPS")
        @Validation(required = true)
        public Integer FPS;

        @NameInMap("Height")
        @Validation(required = true)
        public Integer height;

        @NameInMap("Width")
        @Validation(required = true)
        public Integer width;

        @NameInMap("TemplateType")
        @Validation(required = true)
        public String templateType;

        @NameInMap("VideoProfile")
        @Validation(required = true)
        public String videoProfile;

        @NameInMap("Gop")
        @Validation(required = true)
        public String gop;

        @NameInMap("AudioBitrate")
        @Validation(required = true)
        public Integer audioBitrate;

        @NameInMap("AudioProfile")
        @Validation(required = true)
        public String audioProfile;

        @NameInMap("AudioCodec")
        @Validation(required = true)
        public String audioCodec;

        @NameInMap("AudioRate")
        @Validation(required = true)
        public Integer audioRate;

        @NameInMap("AudioChannelNum")
        @Validation(required = true)
        public Integer audioChannelNum;

        public static DescribeLiveStreamTranscodeInfoResponseDomainTranscodeListDomainTranscodeInfoCustomTranscodeParameters build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveStreamTranscodeInfoResponseDomainTranscodeListDomainTranscodeInfoCustomTranscodeParameters self = new DescribeLiveStreamTranscodeInfoResponseDomainTranscodeListDomainTranscodeInfoCustomTranscodeParameters();
            return TeaModel.build(map, self);
        }

        public DescribeLiveStreamTranscodeInfoResponseDomainTranscodeListDomainTranscodeInfoCustomTranscodeParameters setRtsFlag(String rtsFlag) {
            this.rtsFlag = rtsFlag;
            return this;
        }
        public String getRtsFlag() {
            return this.rtsFlag;
        }

        public DescribeLiveStreamTranscodeInfoResponseDomainTranscodeListDomainTranscodeInfoCustomTranscodeParameters setBframes(String bframes) {
            this.bframes = bframes;
            return this;
        }
        public String getBframes() {
            return this.bframes;
        }

        public DescribeLiveStreamTranscodeInfoResponseDomainTranscodeListDomainTranscodeInfoCustomTranscodeParameters setVideoBitrate(Integer videoBitrate) {
            this.videoBitrate = videoBitrate;
            return this;
        }
        public Integer getVideoBitrate() {
            return this.videoBitrate;
        }

        public DescribeLiveStreamTranscodeInfoResponseDomainTranscodeListDomainTranscodeInfoCustomTranscodeParameters setFPS(Integer FPS) {
            this.FPS = FPS;
            return this;
        }
        public Integer getFPS() {
            return this.FPS;
        }

        public DescribeLiveStreamTranscodeInfoResponseDomainTranscodeListDomainTranscodeInfoCustomTranscodeParameters setHeight(Integer height) {
            this.height = height;
            return this;
        }
        public Integer getHeight() {
            return this.height;
        }

        public DescribeLiveStreamTranscodeInfoResponseDomainTranscodeListDomainTranscodeInfoCustomTranscodeParameters setWidth(Integer width) {
            this.width = width;
            return this;
        }
        public Integer getWidth() {
            return this.width;
        }

        public DescribeLiveStreamTranscodeInfoResponseDomainTranscodeListDomainTranscodeInfoCustomTranscodeParameters setTemplateType(String templateType) {
            this.templateType = templateType;
            return this;
        }
        public String getTemplateType() {
            return this.templateType;
        }

        public DescribeLiveStreamTranscodeInfoResponseDomainTranscodeListDomainTranscodeInfoCustomTranscodeParameters setVideoProfile(String videoProfile) {
            this.videoProfile = videoProfile;
            return this;
        }
        public String getVideoProfile() {
            return this.videoProfile;
        }

        public DescribeLiveStreamTranscodeInfoResponseDomainTranscodeListDomainTranscodeInfoCustomTranscodeParameters setGop(String gop) {
            this.gop = gop;
            return this;
        }
        public String getGop() {
            return this.gop;
        }

        public DescribeLiveStreamTranscodeInfoResponseDomainTranscodeListDomainTranscodeInfoCustomTranscodeParameters setAudioBitrate(Integer audioBitrate) {
            this.audioBitrate = audioBitrate;
            return this;
        }
        public Integer getAudioBitrate() {
            return this.audioBitrate;
        }

        public DescribeLiveStreamTranscodeInfoResponseDomainTranscodeListDomainTranscodeInfoCustomTranscodeParameters setAudioProfile(String audioProfile) {
            this.audioProfile = audioProfile;
            return this;
        }
        public String getAudioProfile() {
            return this.audioProfile;
        }

        public DescribeLiveStreamTranscodeInfoResponseDomainTranscodeListDomainTranscodeInfoCustomTranscodeParameters setAudioCodec(String audioCodec) {
            this.audioCodec = audioCodec;
            return this;
        }
        public String getAudioCodec() {
            return this.audioCodec;
        }

        public DescribeLiveStreamTranscodeInfoResponseDomainTranscodeListDomainTranscodeInfoCustomTranscodeParameters setAudioRate(Integer audioRate) {
            this.audioRate = audioRate;
            return this;
        }
        public Integer getAudioRate() {
            return this.audioRate;
        }

        public DescribeLiveStreamTranscodeInfoResponseDomainTranscodeListDomainTranscodeInfoCustomTranscodeParameters setAudioChannelNum(Integer audioChannelNum) {
            this.audioChannelNum = audioChannelNum;
            return this;
        }
        public Integer getAudioChannelNum() {
            return this.audioChannelNum;
        }

    }

    public static class DescribeLiveStreamTranscodeInfoResponseDomainTranscodeListDomainTranscodeInfo extends TeaModel {
        @NameInMap("TranscodeApp")
        @Validation(required = true)
        public String transcodeApp;

        @NameInMap("TranscodeName")
        @Validation(required = true)
        public String transcodeName;

        @NameInMap("TranscodeTemplate")
        @Validation(required = true)
        public String transcodeTemplate;

        @NameInMap("CustomTranscodeParameters")
        @Validation(required = true)
        public DescribeLiveStreamTranscodeInfoResponseDomainTranscodeListDomainTranscodeInfoCustomTranscodeParameters customTranscodeParameters;

        public static DescribeLiveStreamTranscodeInfoResponseDomainTranscodeListDomainTranscodeInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveStreamTranscodeInfoResponseDomainTranscodeListDomainTranscodeInfo self = new DescribeLiveStreamTranscodeInfoResponseDomainTranscodeListDomainTranscodeInfo();
            return TeaModel.build(map, self);
        }

        public DescribeLiveStreamTranscodeInfoResponseDomainTranscodeListDomainTranscodeInfo setTranscodeApp(String transcodeApp) {
            this.transcodeApp = transcodeApp;
            return this;
        }
        public String getTranscodeApp() {
            return this.transcodeApp;
        }

        public DescribeLiveStreamTranscodeInfoResponseDomainTranscodeListDomainTranscodeInfo setTranscodeName(String transcodeName) {
            this.transcodeName = transcodeName;
            return this;
        }
        public String getTranscodeName() {
            return this.transcodeName;
        }

        public DescribeLiveStreamTranscodeInfoResponseDomainTranscodeListDomainTranscodeInfo setTranscodeTemplate(String transcodeTemplate) {
            this.transcodeTemplate = transcodeTemplate;
            return this;
        }
        public String getTranscodeTemplate() {
            return this.transcodeTemplate;
        }

        public DescribeLiveStreamTranscodeInfoResponseDomainTranscodeListDomainTranscodeInfo setCustomTranscodeParameters(DescribeLiveStreamTranscodeInfoResponseDomainTranscodeListDomainTranscodeInfoCustomTranscodeParameters customTranscodeParameters) {
            this.customTranscodeParameters = customTranscodeParameters;
            return this;
        }
        public DescribeLiveStreamTranscodeInfoResponseDomainTranscodeListDomainTranscodeInfoCustomTranscodeParameters getCustomTranscodeParameters() {
            return this.customTranscodeParameters;
        }

    }

    public static class DescribeLiveStreamTranscodeInfoResponseDomainTranscodeList extends TeaModel {
        @NameInMap("DomainTranscodeInfo")
        @Validation(required = true)
        public java.util.List<DescribeLiveStreamTranscodeInfoResponseDomainTranscodeListDomainTranscodeInfo> domainTranscodeInfo;

        public static DescribeLiveStreamTranscodeInfoResponseDomainTranscodeList build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveStreamTranscodeInfoResponseDomainTranscodeList self = new DescribeLiveStreamTranscodeInfoResponseDomainTranscodeList();
            return TeaModel.build(map, self);
        }

        public DescribeLiveStreamTranscodeInfoResponseDomainTranscodeList setDomainTranscodeInfo(java.util.List<DescribeLiveStreamTranscodeInfoResponseDomainTranscodeListDomainTranscodeInfo> domainTranscodeInfo) {
            this.domainTranscodeInfo = domainTranscodeInfo;
            return this;
        }
        public java.util.List<DescribeLiveStreamTranscodeInfoResponseDomainTranscodeListDomainTranscodeInfo> getDomainTranscodeInfo() {
            return this.domainTranscodeInfo;
        }

    }

}
