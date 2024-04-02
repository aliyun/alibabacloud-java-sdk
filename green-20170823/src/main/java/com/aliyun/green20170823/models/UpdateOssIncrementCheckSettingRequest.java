// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class UpdateOssIncrementCheckSettingRequest extends TeaModel {
    @NameInMap("AudioAntispamFreezeConfig")
    public String audioAntispamFreezeConfig;

    @NameInMap("AudioAutoFreezeOpened")
    public Boolean audioAutoFreezeOpened;

    @NameInMap("AudioMaxSize")
    public Integer audioMaxSize;

    @NameInMap("AudioScanLimit")
    public Long audioScanLimit;

    @NameInMap("AudioSceneList")
    public String audioSceneList;

    @NameInMap("AutoFreezeType")
    public String autoFreezeType;

    @NameInMap("BizType")
    public String bizType;

    @NameInMap("BucketConfigList")
    public String bucketConfigList;

    @NameInMap("CallbackId")
    public String callbackId;

    @NameInMap("ImageAdFreezeConfig")
    public String imageAdFreezeConfig;

    @NameInMap("ImageAutoFreeze")
    public String imageAutoFreeze;

    @NameInMap("ImageAutoFreezeOpened")
    public Boolean imageAutoFreezeOpened;

    @NameInMap("ImageLiveFreezeConfig")
    public String imageLiveFreezeConfig;

    @NameInMap("ImagePornFreezeConfig")
    public String imagePornFreezeConfig;

    @NameInMap("ImageScanLimit")
    public String imageScanLimit;

    @NameInMap("ImageSceneList")
    public String imageSceneList;

    @NameInMap("ImageTerrorismFreezeConfig")
    public String imageTerrorismFreezeConfig;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("ScanImageNoFileType")
    public Boolean scanImageNoFileType;

    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("VideoAdFreezeConfig")
    public String videoAdFreezeConfig;

    @NameInMap("VideoAutoFreezeOpened")
    public Boolean videoAutoFreezeOpened;

    @NameInMap("VideoAutoFreezeSceneList")
    public String videoAutoFreezeSceneList;

    @NameInMap("VideoFrameInterval")
    public Integer videoFrameInterval;

    @NameInMap("VideoLiveFreezeConfig")
    public String videoLiveFreezeConfig;

    @NameInMap("VideoMaxFrames")
    public Integer videoMaxFrames;

    @NameInMap("VideoMaxSize")
    public Integer videoMaxSize;

    @NameInMap("VideoPornFreezeConfig")
    public String videoPornFreezeConfig;

    @NameInMap("VideoScanLimit")
    public Long videoScanLimit;

    @NameInMap("VideoSceneList")
    public String videoSceneList;

    @NameInMap("VideoTerrorismFreezeConfig")
    public String videoTerrorismFreezeConfig;

    @NameInMap("VideoVoiceAntispamFreezeConfig")
    public String videoVoiceAntispamFreezeConfig;

    public static UpdateOssIncrementCheckSettingRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateOssIncrementCheckSettingRequest self = new UpdateOssIncrementCheckSettingRequest();
        return TeaModel.build(map, self);
    }

    public UpdateOssIncrementCheckSettingRequest setAudioAntispamFreezeConfig(String audioAntispamFreezeConfig) {
        this.audioAntispamFreezeConfig = audioAntispamFreezeConfig;
        return this;
    }
    public String getAudioAntispamFreezeConfig() {
        return this.audioAntispamFreezeConfig;
    }

    public UpdateOssIncrementCheckSettingRequest setAudioAutoFreezeOpened(Boolean audioAutoFreezeOpened) {
        this.audioAutoFreezeOpened = audioAutoFreezeOpened;
        return this;
    }
    public Boolean getAudioAutoFreezeOpened() {
        return this.audioAutoFreezeOpened;
    }

    public UpdateOssIncrementCheckSettingRequest setAudioMaxSize(Integer audioMaxSize) {
        this.audioMaxSize = audioMaxSize;
        return this;
    }
    public Integer getAudioMaxSize() {
        return this.audioMaxSize;
    }

    public UpdateOssIncrementCheckSettingRequest setAudioScanLimit(Long audioScanLimit) {
        this.audioScanLimit = audioScanLimit;
        return this;
    }
    public Long getAudioScanLimit() {
        return this.audioScanLimit;
    }

    public UpdateOssIncrementCheckSettingRequest setAudioSceneList(String audioSceneList) {
        this.audioSceneList = audioSceneList;
        return this;
    }
    public String getAudioSceneList() {
        return this.audioSceneList;
    }

    public UpdateOssIncrementCheckSettingRequest setAutoFreezeType(String autoFreezeType) {
        this.autoFreezeType = autoFreezeType;
        return this;
    }
    public String getAutoFreezeType() {
        return this.autoFreezeType;
    }

    public UpdateOssIncrementCheckSettingRequest setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public UpdateOssIncrementCheckSettingRequest setBucketConfigList(String bucketConfigList) {
        this.bucketConfigList = bucketConfigList;
        return this;
    }
    public String getBucketConfigList() {
        return this.bucketConfigList;
    }

    public UpdateOssIncrementCheckSettingRequest setCallbackId(String callbackId) {
        this.callbackId = callbackId;
        return this;
    }
    public String getCallbackId() {
        return this.callbackId;
    }

    public UpdateOssIncrementCheckSettingRequest setImageAdFreezeConfig(String imageAdFreezeConfig) {
        this.imageAdFreezeConfig = imageAdFreezeConfig;
        return this;
    }
    public String getImageAdFreezeConfig() {
        return this.imageAdFreezeConfig;
    }

    public UpdateOssIncrementCheckSettingRequest setImageAutoFreeze(String imageAutoFreeze) {
        this.imageAutoFreeze = imageAutoFreeze;
        return this;
    }
    public String getImageAutoFreeze() {
        return this.imageAutoFreeze;
    }

    public UpdateOssIncrementCheckSettingRequest setImageAutoFreezeOpened(Boolean imageAutoFreezeOpened) {
        this.imageAutoFreezeOpened = imageAutoFreezeOpened;
        return this;
    }
    public Boolean getImageAutoFreezeOpened() {
        return this.imageAutoFreezeOpened;
    }

    public UpdateOssIncrementCheckSettingRequest setImageLiveFreezeConfig(String imageLiveFreezeConfig) {
        this.imageLiveFreezeConfig = imageLiveFreezeConfig;
        return this;
    }
    public String getImageLiveFreezeConfig() {
        return this.imageLiveFreezeConfig;
    }

    public UpdateOssIncrementCheckSettingRequest setImagePornFreezeConfig(String imagePornFreezeConfig) {
        this.imagePornFreezeConfig = imagePornFreezeConfig;
        return this;
    }
    public String getImagePornFreezeConfig() {
        return this.imagePornFreezeConfig;
    }

    public UpdateOssIncrementCheckSettingRequest setImageScanLimit(String imageScanLimit) {
        this.imageScanLimit = imageScanLimit;
        return this;
    }
    public String getImageScanLimit() {
        return this.imageScanLimit;
    }

    public UpdateOssIncrementCheckSettingRequest setImageSceneList(String imageSceneList) {
        this.imageSceneList = imageSceneList;
        return this;
    }
    public String getImageSceneList() {
        return this.imageSceneList;
    }

    public UpdateOssIncrementCheckSettingRequest setImageTerrorismFreezeConfig(String imageTerrorismFreezeConfig) {
        this.imageTerrorismFreezeConfig = imageTerrorismFreezeConfig;
        return this;
    }
    public String getImageTerrorismFreezeConfig() {
        return this.imageTerrorismFreezeConfig;
    }

    public UpdateOssIncrementCheckSettingRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public UpdateOssIncrementCheckSettingRequest setScanImageNoFileType(Boolean scanImageNoFileType) {
        this.scanImageNoFileType = scanImageNoFileType;
        return this;
    }
    public Boolean getScanImageNoFileType() {
        return this.scanImageNoFileType;
    }

    public UpdateOssIncrementCheckSettingRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public UpdateOssIncrementCheckSettingRequest setVideoAdFreezeConfig(String videoAdFreezeConfig) {
        this.videoAdFreezeConfig = videoAdFreezeConfig;
        return this;
    }
    public String getVideoAdFreezeConfig() {
        return this.videoAdFreezeConfig;
    }

    public UpdateOssIncrementCheckSettingRequest setVideoAutoFreezeOpened(Boolean videoAutoFreezeOpened) {
        this.videoAutoFreezeOpened = videoAutoFreezeOpened;
        return this;
    }
    public Boolean getVideoAutoFreezeOpened() {
        return this.videoAutoFreezeOpened;
    }

    public UpdateOssIncrementCheckSettingRequest setVideoAutoFreezeSceneList(String videoAutoFreezeSceneList) {
        this.videoAutoFreezeSceneList = videoAutoFreezeSceneList;
        return this;
    }
    public String getVideoAutoFreezeSceneList() {
        return this.videoAutoFreezeSceneList;
    }

    public UpdateOssIncrementCheckSettingRequest setVideoFrameInterval(Integer videoFrameInterval) {
        this.videoFrameInterval = videoFrameInterval;
        return this;
    }
    public Integer getVideoFrameInterval() {
        return this.videoFrameInterval;
    }

    public UpdateOssIncrementCheckSettingRequest setVideoLiveFreezeConfig(String videoLiveFreezeConfig) {
        this.videoLiveFreezeConfig = videoLiveFreezeConfig;
        return this;
    }
    public String getVideoLiveFreezeConfig() {
        return this.videoLiveFreezeConfig;
    }

    public UpdateOssIncrementCheckSettingRequest setVideoMaxFrames(Integer videoMaxFrames) {
        this.videoMaxFrames = videoMaxFrames;
        return this;
    }
    public Integer getVideoMaxFrames() {
        return this.videoMaxFrames;
    }

    public UpdateOssIncrementCheckSettingRequest setVideoMaxSize(Integer videoMaxSize) {
        this.videoMaxSize = videoMaxSize;
        return this;
    }
    public Integer getVideoMaxSize() {
        return this.videoMaxSize;
    }

    public UpdateOssIncrementCheckSettingRequest setVideoPornFreezeConfig(String videoPornFreezeConfig) {
        this.videoPornFreezeConfig = videoPornFreezeConfig;
        return this;
    }
    public String getVideoPornFreezeConfig() {
        return this.videoPornFreezeConfig;
    }

    public UpdateOssIncrementCheckSettingRequest setVideoScanLimit(Long videoScanLimit) {
        this.videoScanLimit = videoScanLimit;
        return this;
    }
    public Long getVideoScanLimit() {
        return this.videoScanLimit;
    }

    public UpdateOssIncrementCheckSettingRequest setVideoSceneList(String videoSceneList) {
        this.videoSceneList = videoSceneList;
        return this;
    }
    public String getVideoSceneList() {
        return this.videoSceneList;
    }

    public UpdateOssIncrementCheckSettingRequest setVideoTerrorismFreezeConfig(String videoTerrorismFreezeConfig) {
        this.videoTerrorismFreezeConfig = videoTerrorismFreezeConfig;
        return this;
    }
    public String getVideoTerrorismFreezeConfig() {
        return this.videoTerrorismFreezeConfig;
    }

    public UpdateOssIncrementCheckSettingRequest setVideoVoiceAntispamFreezeConfig(String videoVoiceAntispamFreezeConfig) {
        this.videoVoiceAntispamFreezeConfig = videoVoiceAntispamFreezeConfig;
        return this;
    }
    public String getVideoVoiceAntispamFreezeConfig() {
        return this.videoVoiceAntispamFreezeConfig;
    }

}
