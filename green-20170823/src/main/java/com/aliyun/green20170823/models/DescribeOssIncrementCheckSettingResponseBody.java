// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class DescribeOssIncrementCheckSettingResponseBody extends TeaModel {
    @NameInMap("AudioAntispamFreezeConfig")
    public DescribeOssIncrementCheckSettingResponseBodyAudioAntispamFreezeConfig audioAntispamFreezeConfig;

    @NameInMap("AudioAutoFreezeOpened")
    public Boolean audioAutoFreezeOpened;

    @NameInMap("AudioMaxSize")
    public Integer audioMaxSize;

    @NameInMap("AudioScanLimit")
    public Long audioScanLimit;

    @NameInMap("AudioSceneList")
    public java.util.List<String> audioSceneList;

    @NameInMap("AutoFreezeType")
    public String autoFreezeType;

    @NameInMap("BizType")
    public String bizType;

    @NameInMap("BizTypeTemplate")
    public DescribeOssIncrementCheckSettingResponseBodyBizTypeTemplate bizTypeTemplate;

    @NameInMap("BucketConfigList")
    public java.util.List<DescribeOssIncrementCheckSettingResponseBodyBucketConfigList> bucketConfigList;

    @NameInMap("CallbackId")
    public String callbackId;

    @NameInMap("CallbackName")
    public String callbackName;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("ImageAdFreezeConfig")
    public DescribeOssIncrementCheckSettingResponseBodyImageAdFreezeConfig imageAdFreezeConfig;

    @NameInMap("ImageAutoFreeze")
    public DescribeOssIncrementCheckSettingResponseBodyImageAutoFreeze imageAutoFreeze;

    @NameInMap("ImageAutoFreezeOpened")
    public Boolean imageAutoFreezeOpened;

    @NameInMap("ImageEnableLimit")
    public Boolean imageEnableLimit;

    @NameInMap("ImageLiveFreezeConfig")
    public DescribeOssIncrementCheckSettingResponseBodyImageLiveFreezeConfig imageLiveFreezeConfig;

    @NameInMap("ImagePornFreezeConfig")
    public DescribeOssIncrementCheckSettingResponseBodyImagePornFreezeConfig imagePornFreezeConfig;

    @NameInMap("ImageScanLimit")
    public Long imageScanLimit;

    @NameInMap("ImageSceneList")
    public java.util.List<String> imageSceneList;

    @NameInMap("ImageTerrorismFreezeConfig")
    public DescribeOssIncrementCheckSettingResponseBodyImageTerrorismFreezeConfig imageTerrorismFreezeConfig;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ScanImageNoFileType")
    public Boolean scanImageNoFileType;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("VideoAdFreezeConfig")
    public DescribeOssIncrementCheckSettingResponseBodyVideoAdFreezeConfig videoAdFreezeConfig;

    @NameInMap("VideoAutoFreezeOpened")
    public Boolean videoAutoFreezeOpened;

    @NameInMap("VideoAutoFreezeSceneList")
    public java.util.List<String> videoAutoFreezeSceneList;

    @NameInMap("VideoFrameInterval")
    public Integer videoFrameInterval;

    @NameInMap("VideoLiveFreezeConfig")
    public DescribeOssIncrementCheckSettingResponseBodyVideoLiveFreezeConfig videoLiveFreezeConfig;

    @NameInMap("VideoMaxFrames")
    public Integer videoMaxFrames;

    @NameInMap("VideoMaxSize")
    public Integer videoMaxSize;

    @NameInMap("VideoPornFreezeConfig")
    public DescribeOssIncrementCheckSettingResponseBodyVideoPornFreezeConfig videoPornFreezeConfig;

    @NameInMap("VideoScanLimit")
    public Long videoScanLimit;

    @NameInMap("VideoSceneList")
    public java.util.List<String> videoSceneList;

    @NameInMap("VideoTerrorismFreezeConfig")
    public DescribeOssIncrementCheckSettingResponseBodyVideoTerrorismFreezeConfig videoTerrorismFreezeConfig;

    @NameInMap("VideoVoiceAntispamFreezeConfig")
    public DescribeOssIncrementCheckSettingResponseBodyVideoVoiceAntispamFreezeConfig videoVoiceAntispamFreezeConfig;

    public static DescribeOssIncrementCheckSettingResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeOssIncrementCheckSettingResponseBody self = new DescribeOssIncrementCheckSettingResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeOssIncrementCheckSettingResponseBody setAudioAntispamFreezeConfig(DescribeOssIncrementCheckSettingResponseBodyAudioAntispamFreezeConfig audioAntispamFreezeConfig) {
        this.audioAntispamFreezeConfig = audioAntispamFreezeConfig;
        return this;
    }
    public DescribeOssIncrementCheckSettingResponseBodyAudioAntispamFreezeConfig getAudioAntispamFreezeConfig() {
        return this.audioAntispamFreezeConfig;
    }

    public DescribeOssIncrementCheckSettingResponseBody setAudioAutoFreezeOpened(Boolean audioAutoFreezeOpened) {
        this.audioAutoFreezeOpened = audioAutoFreezeOpened;
        return this;
    }
    public Boolean getAudioAutoFreezeOpened() {
        return this.audioAutoFreezeOpened;
    }

    public DescribeOssIncrementCheckSettingResponseBody setAudioMaxSize(Integer audioMaxSize) {
        this.audioMaxSize = audioMaxSize;
        return this;
    }
    public Integer getAudioMaxSize() {
        return this.audioMaxSize;
    }

    public DescribeOssIncrementCheckSettingResponseBody setAudioScanLimit(Long audioScanLimit) {
        this.audioScanLimit = audioScanLimit;
        return this;
    }
    public Long getAudioScanLimit() {
        return this.audioScanLimit;
    }

    public DescribeOssIncrementCheckSettingResponseBody setAudioSceneList(java.util.List<String> audioSceneList) {
        this.audioSceneList = audioSceneList;
        return this;
    }
    public java.util.List<String> getAudioSceneList() {
        return this.audioSceneList;
    }

    public DescribeOssIncrementCheckSettingResponseBody setAutoFreezeType(String autoFreezeType) {
        this.autoFreezeType = autoFreezeType;
        return this;
    }
    public String getAutoFreezeType() {
        return this.autoFreezeType;
    }

    public DescribeOssIncrementCheckSettingResponseBody setBizType(String bizType) {
        this.bizType = bizType;
        return this;
    }
    public String getBizType() {
        return this.bizType;
    }

    public DescribeOssIncrementCheckSettingResponseBody setBizTypeTemplate(DescribeOssIncrementCheckSettingResponseBodyBizTypeTemplate bizTypeTemplate) {
        this.bizTypeTemplate = bizTypeTemplate;
        return this;
    }
    public DescribeOssIncrementCheckSettingResponseBodyBizTypeTemplate getBizTypeTemplate() {
        return this.bizTypeTemplate;
    }

    public DescribeOssIncrementCheckSettingResponseBody setBucketConfigList(java.util.List<DescribeOssIncrementCheckSettingResponseBodyBucketConfigList> bucketConfigList) {
        this.bucketConfigList = bucketConfigList;
        return this;
    }
    public java.util.List<DescribeOssIncrementCheckSettingResponseBodyBucketConfigList> getBucketConfigList() {
        return this.bucketConfigList;
    }

    public DescribeOssIncrementCheckSettingResponseBody setCallbackId(String callbackId) {
        this.callbackId = callbackId;
        return this;
    }
    public String getCallbackId() {
        return this.callbackId;
    }

    public DescribeOssIncrementCheckSettingResponseBody setCallbackName(String callbackName) {
        this.callbackName = callbackName;
        return this;
    }
    public String getCallbackName() {
        return this.callbackName;
    }

    public DescribeOssIncrementCheckSettingResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeOssIncrementCheckSettingResponseBody setImageAdFreezeConfig(DescribeOssIncrementCheckSettingResponseBodyImageAdFreezeConfig imageAdFreezeConfig) {
        this.imageAdFreezeConfig = imageAdFreezeConfig;
        return this;
    }
    public DescribeOssIncrementCheckSettingResponseBodyImageAdFreezeConfig getImageAdFreezeConfig() {
        return this.imageAdFreezeConfig;
    }

    public DescribeOssIncrementCheckSettingResponseBody setImageAutoFreeze(DescribeOssIncrementCheckSettingResponseBodyImageAutoFreeze imageAutoFreeze) {
        this.imageAutoFreeze = imageAutoFreeze;
        return this;
    }
    public DescribeOssIncrementCheckSettingResponseBodyImageAutoFreeze getImageAutoFreeze() {
        return this.imageAutoFreeze;
    }

    public DescribeOssIncrementCheckSettingResponseBody setImageAutoFreezeOpened(Boolean imageAutoFreezeOpened) {
        this.imageAutoFreezeOpened = imageAutoFreezeOpened;
        return this;
    }
    public Boolean getImageAutoFreezeOpened() {
        return this.imageAutoFreezeOpened;
    }

    public DescribeOssIncrementCheckSettingResponseBody setImageEnableLimit(Boolean imageEnableLimit) {
        this.imageEnableLimit = imageEnableLimit;
        return this;
    }
    public Boolean getImageEnableLimit() {
        return this.imageEnableLimit;
    }

    public DescribeOssIncrementCheckSettingResponseBody setImageLiveFreezeConfig(DescribeOssIncrementCheckSettingResponseBodyImageLiveFreezeConfig imageLiveFreezeConfig) {
        this.imageLiveFreezeConfig = imageLiveFreezeConfig;
        return this;
    }
    public DescribeOssIncrementCheckSettingResponseBodyImageLiveFreezeConfig getImageLiveFreezeConfig() {
        return this.imageLiveFreezeConfig;
    }

    public DescribeOssIncrementCheckSettingResponseBody setImagePornFreezeConfig(DescribeOssIncrementCheckSettingResponseBodyImagePornFreezeConfig imagePornFreezeConfig) {
        this.imagePornFreezeConfig = imagePornFreezeConfig;
        return this;
    }
    public DescribeOssIncrementCheckSettingResponseBodyImagePornFreezeConfig getImagePornFreezeConfig() {
        return this.imagePornFreezeConfig;
    }

    public DescribeOssIncrementCheckSettingResponseBody setImageScanLimit(Long imageScanLimit) {
        this.imageScanLimit = imageScanLimit;
        return this;
    }
    public Long getImageScanLimit() {
        return this.imageScanLimit;
    }

    public DescribeOssIncrementCheckSettingResponseBody setImageSceneList(java.util.List<String> imageSceneList) {
        this.imageSceneList = imageSceneList;
        return this;
    }
    public java.util.List<String> getImageSceneList() {
        return this.imageSceneList;
    }

    public DescribeOssIncrementCheckSettingResponseBody setImageTerrorismFreezeConfig(DescribeOssIncrementCheckSettingResponseBodyImageTerrorismFreezeConfig imageTerrorismFreezeConfig) {
        this.imageTerrorismFreezeConfig = imageTerrorismFreezeConfig;
        return this;
    }
    public DescribeOssIncrementCheckSettingResponseBodyImageTerrorismFreezeConfig getImageTerrorismFreezeConfig() {
        return this.imageTerrorismFreezeConfig;
    }

    public DescribeOssIncrementCheckSettingResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeOssIncrementCheckSettingResponseBody setScanImageNoFileType(Boolean scanImageNoFileType) {
        this.scanImageNoFileType = scanImageNoFileType;
        return this;
    }
    public Boolean getScanImageNoFileType() {
        return this.scanImageNoFileType;
    }

    public DescribeOssIncrementCheckSettingResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeOssIncrementCheckSettingResponseBody setVideoAdFreezeConfig(DescribeOssIncrementCheckSettingResponseBodyVideoAdFreezeConfig videoAdFreezeConfig) {
        this.videoAdFreezeConfig = videoAdFreezeConfig;
        return this;
    }
    public DescribeOssIncrementCheckSettingResponseBodyVideoAdFreezeConfig getVideoAdFreezeConfig() {
        return this.videoAdFreezeConfig;
    }

    public DescribeOssIncrementCheckSettingResponseBody setVideoAutoFreezeOpened(Boolean videoAutoFreezeOpened) {
        this.videoAutoFreezeOpened = videoAutoFreezeOpened;
        return this;
    }
    public Boolean getVideoAutoFreezeOpened() {
        return this.videoAutoFreezeOpened;
    }

    public DescribeOssIncrementCheckSettingResponseBody setVideoAutoFreezeSceneList(java.util.List<String> videoAutoFreezeSceneList) {
        this.videoAutoFreezeSceneList = videoAutoFreezeSceneList;
        return this;
    }
    public java.util.List<String> getVideoAutoFreezeSceneList() {
        return this.videoAutoFreezeSceneList;
    }

    public DescribeOssIncrementCheckSettingResponseBody setVideoFrameInterval(Integer videoFrameInterval) {
        this.videoFrameInterval = videoFrameInterval;
        return this;
    }
    public Integer getVideoFrameInterval() {
        return this.videoFrameInterval;
    }

    public DescribeOssIncrementCheckSettingResponseBody setVideoLiveFreezeConfig(DescribeOssIncrementCheckSettingResponseBodyVideoLiveFreezeConfig videoLiveFreezeConfig) {
        this.videoLiveFreezeConfig = videoLiveFreezeConfig;
        return this;
    }
    public DescribeOssIncrementCheckSettingResponseBodyVideoLiveFreezeConfig getVideoLiveFreezeConfig() {
        return this.videoLiveFreezeConfig;
    }

    public DescribeOssIncrementCheckSettingResponseBody setVideoMaxFrames(Integer videoMaxFrames) {
        this.videoMaxFrames = videoMaxFrames;
        return this;
    }
    public Integer getVideoMaxFrames() {
        return this.videoMaxFrames;
    }

    public DescribeOssIncrementCheckSettingResponseBody setVideoMaxSize(Integer videoMaxSize) {
        this.videoMaxSize = videoMaxSize;
        return this;
    }
    public Integer getVideoMaxSize() {
        return this.videoMaxSize;
    }

    public DescribeOssIncrementCheckSettingResponseBody setVideoPornFreezeConfig(DescribeOssIncrementCheckSettingResponseBodyVideoPornFreezeConfig videoPornFreezeConfig) {
        this.videoPornFreezeConfig = videoPornFreezeConfig;
        return this;
    }
    public DescribeOssIncrementCheckSettingResponseBodyVideoPornFreezeConfig getVideoPornFreezeConfig() {
        return this.videoPornFreezeConfig;
    }

    public DescribeOssIncrementCheckSettingResponseBody setVideoScanLimit(Long videoScanLimit) {
        this.videoScanLimit = videoScanLimit;
        return this;
    }
    public Long getVideoScanLimit() {
        return this.videoScanLimit;
    }

    public DescribeOssIncrementCheckSettingResponseBody setVideoSceneList(java.util.List<String> videoSceneList) {
        this.videoSceneList = videoSceneList;
        return this;
    }
    public java.util.List<String> getVideoSceneList() {
        return this.videoSceneList;
    }

    public DescribeOssIncrementCheckSettingResponseBody setVideoTerrorismFreezeConfig(DescribeOssIncrementCheckSettingResponseBodyVideoTerrorismFreezeConfig videoTerrorismFreezeConfig) {
        this.videoTerrorismFreezeConfig = videoTerrorismFreezeConfig;
        return this;
    }
    public DescribeOssIncrementCheckSettingResponseBodyVideoTerrorismFreezeConfig getVideoTerrorismFreezeConfig() {
        return this.videoTerrorismFreezeConfig;
    }

    public DescribeOssIncrementCheckSettingResponseBody setVideoVoiceAntispamFreezeConfig(DescribeOssIncrementCheckSettingResponseBodyVideoVoiceAntispamFreezeConfig videoVoiceAntispamFreezeConfig) {
        this.videoVoiceAntispamFreezeConfig = videoVoiceAntispamFreezeConfig;
        return this;
    }
    public DescribeOssIncrementCheckSettingResponseBodyVideoVoiceAntispamFreezeConfig getVideoVoiceAntispamFreezeConfig() {
        return this.videoVoiceAntispamFreezeConfig;
    }

    public static class DescribeOssIncrementCheckSettingResponseBodyAudioAntispamFreezeConfig extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("Value")
        public String value;

        public static DescribeOssIncrementCheckSettingResponseBodyAudioAntispamFreezeConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeOssIncrementCheckSettingResponseBodyAudioAntispamFreezeConfig self = new DescribeOssIncrementCheckSettingResponseBodyAudioAntispamFreezeConfig();
            return TeaModel.build(map, self);
        }

        public DescribeOssIncrementCheckSettingResponseBodyAudioAntispamFreezeConfig setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeOssIncrementCheckSettingResponseBodyAudioAntispamFreezeConfig setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeOssIncrementCheckSettingResponseBodyBizTypeTemplateImageConfigAd extends TeaModel {
        @NameInMap("Categories")
        public java.util.List<String> categories;

        public static DescribeOssIncrementCheckSettingResponseBodyBizTypeTemplateImageConfigAd build(java.util.Map<String, ?> map) throws Exception {
            DescribeOssIncrementCheckSettingResponseBodyBizTypeTemplateImageConfigAd self = new DescribeOssIncrementCheckSettingResponseBodyBizTypeTemplateImageConfigAd();
            return TeaModel.build(map, self);
        }

        public DescribeOssIncrementCheckSettingResponseBodyBizTypeTemplateImageConfigAd setCategories(java.util.List<String> categories) {
            this.categories = categories;
            return this;
        }
        public java.util.List<String> getCategories() {
            return this.categories;
        }

    }

    public static class DescribeOssIncrementCheckSettingResponseBodyBizTypeTemplateImageConfigLive extends TeaModel {
        @NameInMap("Categories")
        public java.util.List<String> categories;

        public static DescribeOssIncrementCheckSettingResponseBodyBizTypeTemplateImageConfigLive build(java.util.Map<String, ?> map) throws Exception {
            DescribeOssIncrementCheckSettingResponseBodyBizTypeTemplateImageConfigLive self = new DescribeOssIncrementCheckSettingResponseBodyBizTypeTemplateImageConfigLive();
            return TeaModel.build(map, self);
        }

        public DescribeOssIncrementCheckSettingResponseBodyBizTypeTemplateImageConfigLive setCategories(java.util.List<String> categories) {
            this.categories = categories;
            return this;
        }
        public java.util.List<String> getCategories() {
            return this.categories;
        }

    }

    public static class DescribeOssIncrementCheckSettingResponseBodyBizTypeTemplateImageConfigPorn extends TeaModel {
        @NameInMap("Categories")
        public java.util.List<String> categories;

        public static DescribeOssIncrementCheckSettingResponseBodyBizTypeTemplateImageConfigPorn build(java.util.Map<String, ?> map) throws Exception {
            DescribeOssIncrementCheckSettingResponseBodyBizTypeTemplateImageConfigPorn self = new DescribeOssIncrementCheckSettingResponseBodyBizTypeTemplateImageConfigPorn();
            return TeaModel.build(map, self);
        }

        public DescribeOssIncrementCheckSettingResponseBodyBizTypeTemplateImageConfigPorn setCategories(java.util.List<String> categories) {
            this.categories = categories;
            return this;
        }
        public java.util.List<String> getCategories() {
            return this.categories;
        }

    }

    public static class DescribeOssIncrementCheckSettingResponseBodyBizTypeTemplateImageConfigTerrorism extends TeaModel {
        @NameInMap("Categories")
        public java.util.List<String> categories;

        public static DescribeOssIncrementCheckSettingResponseBodyBizTypeTemplateImageConfigTerrorism build(java.util.Map<String, ?> map) throws Exception {
            DescribeOssIncrementCheckSettingResponseBodyBizTypeTemplateImageConfigTerrorism self = new DescribeOssIncrementCheckSettingResponseBodyBizTypeTemplateImageConfigTerrorism();
            return TeaModel.build(map, self);
        }

        public DescribeOssIncrementCheckSettingResponseBodyBizTypeTemplateImageConfigTerrorism setCategories(java.util.List<String> categories) {
            this.categories = categories;
            return this;
        }
        public java.util.List<String> getCategories() {
            return this.categories;
        }

    }

    public static class DescribeOssIncrementCheckSettingResponseBodyBizTypeTemplateImageConfig extends TeaModel {
        @NameInMap("Ad")
        public DescribeOssIncrementCheckSettingResponseBodyBizTypeTemplateImageConfigAd ad;

        @NameInMap("Live")
        public DescribeOssIncrementCheckSettingResponseBodyBizTypeTemplateImageConfigLive live;

        @NameInMap("Porn")
        public DescribeOssIncrementCheckSettingResponseBodyBizTypeTemplateImageConfigPorn porn;

        @NameInMap("Terrorism")
        public DescribeOssIncrementCheckSettingResponseBodyBizTypeTemplateImageConfigTerrorism terrorism;

        public static DescribeOssIncrementCheckSettingResponseBodyBizTypeTemplateImageConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeOssIncrementCheckSettingResponseBodyBizTypeTemplateImageConfig self = new DescribeOssIncrementCheckSettingResponseBodyBizTypeTemplateImageConfig();
            return TeaModel.build(map, self);
        }

        public DescribeOssIncrementCheckSettingResponseBodyBizTypeTemplateImageConfig setAd(DescribeOssIncrementCheckSettingResponseBodyBizTypeTemplateImageConfigAd ad) {
            this.ad = ad;
            return this;
        }
        public DescribeOssIncrementCheckSettingResponseBodyBizTypeTemplateImageConfigAd getAd() {
            return this.ad;
        }

        public DescribeOssIncrementCheckSettingResponseBodyBizTypeTemplateImageConfig setLive(DescribeOssIncrementCheckSettingResponseBodyBizTypeTemplateImageConfigLive live) {
            this.live = live;
            return this;
        }
        public DescribeOssIncrementCheckSettingResponseBodyBizTypeTemplateImageConfigLive getLive() {
            return this.live;
        }

        public DescribeOssIncrementCheckSettingResponseBodyBizTypeTemplateImageConfig setPorn(DescribeOssIncrementCheckSettingResponseBodyBizTypeTemplateImageConfigPorn porn) {
            this.porn = porn;
            return this;
        }
        public DescribeOssIncrementCheckSettingResponseBodyBizTypeTemplateImageConfigPorn getPorn() {
            return this.porn;
        }

        public DescribeOssIncrementCheckSettingResponseBodyBizTypeTemplateImageConfig setTerrorism(DescribeOssIncrementCheckSettingResponseBodyBizTypeTemplateImageConfigTerrorism terrorism) {
            this.terrorism = terrorism;
            return this;
        }
        public DescribeOssIncrementCheckSettingResponseBodyBizTypeTemplateImageConfigTerrorism getTerrorism() {
            return this.terrorism;
        }

    }

    public static class DescribeOssIncrementCheckSettingResponseBodyBizTypeTemplateVideoConfigAd extends TeaModel {
        @NameInMap("Categories")
        public java.util.List<String> categories;

        public static DescribeOssIncrementCheckSettingResponseBodyBizTypeTemplateVideoConfigAd build(java.util.Map<String, ?> map) throws Exception {
            DescribeOssIncrementCheckSettingResponseBodyBizTypeTemplateVideoConfigAd self = new DescribeOssIncrementCheckSettingResponseBodyBizTypeTemplateVideoConfigAd();
            return TeaModel.build(map, self);
        }

        public DescribeOssIncrementCheckSettingResponseBodyBizTypeTemplateVideoConfigAd setCategories(java.util.List<String> categories) {
            this.categories = categories;
            return this;
        }
        public java.util.List<String> getCategories() {
            return this.categories;
        }

    }

    public static class DescribeOssIncrementCheckSettingResponseBodyBizTypeTemplateVideoConfigLive extends TeaModel {
        @NameInMap("Categories")
        public java.util.List<String> categories;

        public static DescribeOssIncrementCheckSettingResponseBodyBizTypeTemplateVideoConfigLive build(java.util.Map<String, ?> map) throws Exception {
            DescribeOssIncrementCheckSettingResponseBodyBizTypeTemplateVideoConfigLive self = new DescribeOssIncrementCheckSettingResponseBodyBizTypeTemplateVideoConfigLive();
            return TeaModel.build(map, self);
        }

        public DescribeOssIncrementCheckSettingResponseBodyBizTypeTemplateVideoConfigLive setCategories(java.util.List<String> categories) {
            this.categories = categories;
            return this;
        }
        public java.util.List<String> getCategories() {
            return this.categories;
        }

    }

    public static class DescribeOssIncrementCheckSettingResponseBodyBizTypeTemplateVideoConfigPorn extends TeaModel {
        @NameInMap("Categories")
        public java.util.List<String> categories;

        public static DescribeOssIncrementCheckSettingResponseBodyBizTypeTemplateVideoConfigPorn build(java.util.Map<String, ?> map) throws Exception {
            DescribeOssIncrementCheckSettingResponseBodyBizTypeTemplateVideoConfigPorn self = new DescribeOssIncrementCheckSettingResponseBodyBizTypeTemplateVideoConfigPorn();
            return TeaModel.build(map, self);
        }

        public DescribeOssIncrementCheckSettingResponseBodyBizTypeTemplateVideoConfigPorn setCategories(java.util.List<String> categories) {
            this.categories = categories;
            return this;
        }
        public java.util.List<String> getCategories() {
            return this.categories;
        }

    }

    public static class DescribeOssIncrementCheckSettingResponseBodyBizTypeTemplateVideoConfigTerrorism extends TeaModel {
        @NameInMap("Categories")
        public java.util.List<String> categories;

        public static DescribeOssIncrementCheckSettingResponseBodyBizTypeTemplateVideoConfigTerrorism build(java.util.Map<String, ?> map) throws Exception {
            DescribeOssIncrementCheckSettingResponseBodyBizTypeTemplateVideoConfigTerrorism self = new DescribeOssIncrementCheckSettingResponseBodyBizTypeTemplateVideoConfigTerrorism();
            return TeaModel.build(map, self);
        }

        public DescribeOssIncrementCheckSettingResponseBodyBizTypeTemplateVideoConfigTerrorism setCategories(java.util.List<String> categories) {
            this.categories = categories;
            return this;
        }
        public java.util.List<String> getCategories() {
            return this.categories;
        }

    }

    public static class DescribeOssIncrementCheckSettingResponseBodyBizTypeTemplateVideoConfig extends TeaModel {
        @NameInMap("Ad")
        public DescribeOssIncrementCheckSettingResponseBodyBizTypeTemplateVideoConfigAd ad;

        @NameInMap("Live")
        public DescribeOssIncrementCheckSettingResponseBodyBizTypeTemplateVideoConfigLive live;

        @NameInMap("Porn")
        public DescribeOssIncrementCheckSettingResponseBodyBizTypeTemplateVideoConfigPorn porn;

        @NameInMap("Terrorism")
        public DescribeOssIncrementCheckSettingResponseBodyBizTypeTemplateVideoConfigTerrorism terrorism;

        public static DescribeOssIncrementCheckSettingResponseBodyBizTypeTemplateVideoConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeOssIncrementCheckSettingResponseBodyBizTypeTemplateVideoConfig self = new DescribeOssIncrementCheckSettingResponseBodyBizTypeTemplateVideoConfig();
            return TeaModel.build(map, self);
        }

        public DescribeOssIncrementCheckSettingResponseBodyBizTypeTemplateVideoConfig setAd(DescribeOssIncrementCheckSettingResponseBodyBizTypeTemplateVideoConfigAd ad) {
            this.ad = ad;
            return this;
        }
        public DescribeOssIncrementCheckSettingResponseBodyBizTypeTemplateVideoConfigAd getAd() {
            return this.ad;
        }

        public DescribeOssIncrementCheckSettingResponseBodyBizTypeTemplateVideoConfig setLive(DescribeOssIncrementCheckSettingResponseBodyBizTypeTemplateVideoConfigLive live) {
            this.live = live;
            return this;
        }
        public DescribeOssIncrementCheckSettingResponseBodyBizTypeTemplateVideoConfigLive getLive() {
            return this.live;
        }

        public DescribeOssIncrementCheckSettingResponseBodyBizTypeTemplateVideoConfig setPorn(DescribeOssIncrementCheckSettingResponseBodyBizTypeTemplateVideoConfigPorn porn) {
            this.porn = porn;
            return this;
        }
        public DescribeOssIncrementCheckSettingResponseBodyBizTypeTemplateVideoConfigPorn getPorn() {
            return this.porn;
        }

        public DescribeOssIncrementCheckSettingResponseBodyBizTypeTemplateVideoConfig setTerrorism(DescribeOssIncrementCheckSettingResponseBodyBizTypeTemplateVideoConfigTerrorism terrorism) {
            this.terrorism = terrorism;
            return this;
        }
        public DescribeOssIncrementCheckSettingResponseBodyBizTypeTemplateVideoConfigTerrorism getTerrorism() {
            return this.terrorism;
        }

    }

    public static class DescribeOssIncrementCheckSettingResponseBodyBizTypeTemplateVoiceConfigAntispam extends TeaModel {
        @NameInMap("Categories")
        public java.util.List<String> categories;

        public static DescribeOssIncrementCheckSettingResponseBodyBizTypeTemplateVoiceConfigAntispam build(java.util.Map<String, ?> map) throws Exception {
            DescribeOssIncrementCheckSettingResponseBodyBizTypeTemplateVoiceConfigAntispam self = new DescribeOssIncrementCheckSettingResponseBodyBizTypeTemplateVoiceConfigAntispam();
            return TeaModel.build(map, self);
        }

        public DescribeOssIncrementCheckSettingResponseBodyBizTypeTemplateVoiceConfigAntispam setCategories(java.util.List<String> categories) {
            this.categories = categories;
            return this;
        }
        public java.util.List<String> getCategories() {
            return this.categories;
        }

    }

    public static class DescribeOssIncrementCheckSettingResponseBodyBizTypeTemplateVoiceConfig extends TeaModel {
        @NameInMap("Antispam")
        public DescribeOssIncrementCheckSettingResponseBodyBizTypeTemplateVoiceConfigAntispam antispam;

        public static DescribeOssIncrementCheckSettingResponseBodyBizTypeTemplateVoiceConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeOssIncrementCheckSettingResponseBodyBizTypeTemplateVoiceConfig self = new DescribeOssIncrementCheckSettingResponseBodyBizTypeTemplateVoiceConfig();
            return TeaModel.build(map, self);
        }

        public DescribeOssIncrementCheckSettingResponseBodyBizTypeTemplateVoiceConfig setAntispam(DescribeOssIncrementCheckSettingResponseBodyBizTypeTemplateVoiceConfigAntispam antispam) {
            this.antispam = antispam;
            return this;
        }
        public DescribeOssIncrementCheckSettingResponseBodyBizTypeTemplateVoiceConfigAntispam getAntispam() {
            return this.antispam;
        }

    }

    public static class DescribeOssIncrementCheckSettingResponseBodyBizTypeTemplate extends TeaModel {
        @NameInMap("BizType")
        public String bizType;

        @NameInMap("Description")
        public String description;

        @NameInMap("ImageConfig")
        public DescribeOssIncrementCheckSettingResponseBodyBizTypeTemplateImageConfig imageConfig;

        @NameInMap("IncludeChannel")
        public Integer includeChannel;

        @NameInMap("Name")
        public String name;

        @NameInMap("VideoConfig")
        public DescribeOssIncrementCheckSettingResponseBodyBizTypeTemplateVideoConfig videoConfig;

        @NameInMap("VoiceConfig")
        public DescribeOssIncrementCheckSettingResponseBodyBizTypeTemplateVoiceConfig voiceConfig;

        public static DescribeOssIncrementCheckSettingResponseBodyBizTypeTemplate build(java.util.Map<String, ?> map) throws Exception {
            DescribeOssIncrementCheckSettingResponseBodyBizTypeTemplate self = new DescribeOssIncrementCheckSettingResponseBodyBizTypeTemplate();
            return TeaModel.build(map, self);
        }

        public DescribeOssIncrementCheckSettingResponseBodyBizTypeTemplate setBizType(String bizType) {
            this.bizType = bizType;
            return this;
        }
        public String getBizType() {
            return this.bizType;
        }

        public DescribeOssIncrementCheckSettingResponseBodyBizTypeTemplate setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeOssIncrementCheckSettingResponseBodyBizTypeTemplate setImageConfig(DescribeOssIncrementCheckSettingResponseBodyBizTypeTemplateImageConfig imageConfig) {
            this.imageConfig = imageConfig;
            return this;
        }
        public DescribeOssIncrementCheckSettingResponseBodyBizTypeTemplateImageConfig getImageConfig() {
            return this.imageConfig;
        }

        public DescribeOssIncrementCheckSettingResponseBodyBizTypeTemplate setIncludeChannel(Integer includeChannel) {
            this.includeChannel = includeChannel;
            return this;
        }
        public Integer getIncludeChannel() {
            return this.includeChannel;
        }

        public DescribeOssIncrementCheckSettingResponseBodyBizTypeTemplate setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public DescribeOssIncrementCheckSettingResponseBodyBizTypeTemplate setVideoConfig(DescribeOssIncrementCheckSettingResponseBodyBizTypeTemplateVideoConfig videoConfig) {
            this.videoConfig = videoConfig;
            return this;
        }
        public DescribeOssIncrementCheckSettingResponseBodyBizTypeTemplateVideoConfig getVideoConfig() {
            return this.videoConfig;
        }

        public DescribeOssIncrementCheckSettingResponseBodyBizTypeTemplate setVoiceConfig(DescribeOssIncrementCheckSettingResponseBodyBizTypeTemplateVoiceConfig voiceConfig) {
            this.voiceConfig = voiceConfig;
            return this;
        }
        public DescribeOssIncrementCheckSettingResponseBodyBizTypeTemplateVoiceConfig getVoiceConfig() {
            return this.voiceConfig;
        }

    }

    public static class DescribeOssIncrementCheckSettingResponseBodyBucketConfigList extends TeaModel {
        @NameInMap("Bucket")
        public String bucket;

        @NameInMap("Prefixes")
        public java.util.List<String> prefixes;

        @NameInMap("Selected")
        public Boolean selected;

        @NameInMap("Type")
        public String type;

        public static DescribeOssIncrementCheckSettingResponseBodyBucketConfigList build(java.util.Map<String, ?> map) throws Exception {
            DescribeOssIncrementCheckSettingResponseBodyBucketConfigList self = new DescribeOssIncrementCheckSettingResponseBodyBucketConfigList();
            return TeaModel.build(map, self);
        }

        public DescribeOssIncrementCheckSettingResponseBodyBucketConfigList setBucket(String bucket) {
            this.bucket = bucket;
            return this;
        }
        public String getBucket() {
            return this.bucket;
        }

        public DescribeOssIncrementCheckSettingResponseBodyBucketConfigList setPrefixes(java.util.List<String> prefixes) {
            this.prefixes = prefixes;
            return this;
        }
        public java.util.List<String> getPrefixes() {
            return this.prefixes;
        }

        public DescribeOssIncrementCheckSettingResponseBodyBucketConfigList setSelected(Boolean selected) {
            this.selected = selected;
            return this;
        }
        public Boolean getSelected() {
            return this.selected;
        }

        public DescribeOssIncrementCheckSettingResponseBodyBucketConfigList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeOssIncrementCheckSettingResponseBodyImageAdFreezeConfig extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("Value")
        public String value;

        public static DescribeOssIncrementCheckSettingResponseBodyImageAdFreezeConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeOssIncrementCheckSettingResponseBodyImageAdFreezeConfig self = new DescribeOssIncrementCheckSettingResponseBodyImageAdFreezeConfig();
            return TeaModel.build(map, self);
        }

        public DescribeOssIncrementCheckSettingResponseBodyImageAdFreezeConfig setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeOssIncrementCheckSettingResponseBodyImageAdFreezeConfig setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeOssIncrementCheckSettingResponseBodyImageAutoFreeze extends TeaModel {
        @NameInMap("Ad")
        public String ad;

        @NameInMap("Enabled")
        public Boolean enabled;

        @NameInMap("Live")
        public String live;

        @NameInMap("Porn")
        public String porn;

        @NameInMap("Terrorism")
        public String terrorism;

        public static DescribeOssIncrementCheckSettingResponseBodyImageAutoFreeze build(java.util.Map<String, ?> map) throws Exception {
            DescribeOssIncrementCheckSettingResponseBodyImageAutoFreeze self = new DescribeOssIncrementCheckSettingResponseBodyImageAutoFreeze();
            return TeaModel.build(map, self);
        }

        public DescribeOssIncrementCheckSettingResponseBodyImageAutoFreeze setAd(String ad) {
            this.ad = ad;
            return this;
        }
        public String getAd() {
            return this.ad;
        }

        public DescribeOssIncrementCheckSettingResponseBodyImageAutoFreeze setEnabled(Boolean enabled) {
            this.enabled = enabled;
            return this;
        }
        public Boolean getEnabled() {
            return this.enabled;
        }

        public DescribeOssIncrementCheckSettingResponseBodyImageAutoFreeze setLive(String live) {
            this.live = live;
            return this;
        }
        public String getLive() {
            return this.live;
        }

        public DescribeOssIncrementCheckSettingResponseBodyImageAutoFreeze setPorn(String porn) {
            this.porn = porn;
            return this;
        }
        public String getPorn() {
            return this.porn;
        }

        public DescribeOssIncrementCheckSettingResponseBodyImageAutoFreeze setTerrorism(String terrorism) {
            this.terrorism = terrorism;
            return this;
        }
        public String getTerrorism() {
            return this.terrorism;
        }

    }

    public static class DescribeOssIncrementCheckSettingResponseBodyImageLiveFreezeConfig extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("Value")
        public String value;

        public static DescribeOssIncrementCheckSettingResponseBodyImageLiveFreezeConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeOssIncrementCheckSettingResponseBodyImageLiveFreezeConfig self = new DescribeOssIncrementCheckSettingResponseBodyImageLiveFreezeConfig();
            return TeaModel.build(map, self);
        }

        public DescribeOssIncrementCheckSettingResponseBodyImageLiveFreezeConfig setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeOssIncrementCheckSettingResponseBodyImageLiveFreezeConfig setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeOssIncrementCheckSettingResponseBodyImagePornFreezeConfig extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("Value")
        public String value;

        public static DescribeOssIncrementCheckSettingResponseBodyImagePornFreezeConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeOssIncrementCheckSettingResponseBodyImagePornFreezeConfig self = new DescribeOssIncrementCheckSettingResponseBodyImagePornFreezeConfig();
            return TeaModel.build(map, self);
        }

        public DescribeOssIncrementCheckSettingResponseBodyImagePornFreezeConfig setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeOssIncrementCheckSettingResponseBodyImagePornFreezeConfig setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeOssIncrementCheckSettingResponseBodyImageTerrorismFreezeConfig extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("Value")
        public String value;

        public static DescribeOssIncrementCheckSettingResponseBodyImageTerrorismFreezeConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeOssIncrementCheckSettingResponseBodyImageTerrorismFreezeConfig self = new DescribeOssIncrementCheckSettingResponseBodyImageTerrorismFreezeConfig();
            return TeaModel.build(map, self);
        }

        public DescribeOssIncrementCheckSettingResponseBodyImageTerrorismFreezeConfig setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeOssIncrementCheckSettingResponseBodyImageTerrorismFreezeConfig setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeOssIncrementCheckSettingResponseBodyVideoAdFreezeConfig extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("Value")
        public String value;

        public static DescribeOssIncrementCheckSettingResponseBodyVideoAdFreezeConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeOssIncrementCheckSettingResponseBodyVideoAdFreezeConfig self = new DescribeOssIncrementCheckSettingResponseBodyVideoAdFreezeConfig();
            return TeaModel.build(map, self);
        }

        public DescribeOssIncrementCheckSettingResponseBodyVideoAdFreezeConfig setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeOssIncrementCheckSettingResponseBodyVideoAdFreezeConfig setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeOssIncrementCheckSettingResponseBodyVideoLiveFreezeConfig extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("Value")
        public String value;

        public static DescribeOssIncrementCheckSettingResponseBodyVideoLiveFreezeConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeOssIncrementCheckSettingResponseBodyVideoLiveFreezeConfig self = new DescribeOssIncrementCheckSettingResponseBodyVideoLiveFreezeConfig();
            return TeaModel.build(map, self);
        }

        public DescribeOssIncrementCheckSettingResponseBodyVideoLiveFreezeConfig setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeOssIncrementCheckSettingResponseBodyVideoLiveFreezeConfig setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeOssIncrementCheckSettingResponseBodyVideoPornFreezeConfig extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("Value")
        public String value;

        public static DescribeOssIncrementCheckSettingResponseBodyVideoPornFreezeConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeOssIncrementCheckSettingResponseBodyVideoPornFreezeConfig self = new DescribeOssIncrementCheckSettingResponseBodyVideoPornFreezeConfig();
            return TeaModel.build(map, self);
        }

        public DescribeOssIncrementCheckSettingResponseBodyVideoPornFreezeConfig setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeOssIncrementCheckSettingResponseBodyVideoPornFreezeConfig setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeOssIncrementCheckSettingResponseBodyVideoTerrorismFreezeConfig extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("Value")
        public String value;

        public static DescribeOssIncrementCheckSettingResponseBodyVideoTerrorismFreezeConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeOssIncrementCheckSettingResponseBodyVideoTerrorismFreezeConfig self = new DescribeOssIncrementCheckSettingResponseBodyVideoTerrorismFreezeConfig();
            return TeaModel.build(map, self);
        }

        public DescribeOssIncrementCheckSettingResponseBodyVideoTerrorismFreezeConfig setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeOssIncrementCheckSettingResponseBodyVideoTerrorismFreezeConfig setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class DescribeOssIncrementCheckSettingResponseBodyVideoVoiceAntispamFreezeConfig extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("Value")
        public String value;

        public static DescribeOssIncrementCheckSettingResponseBodyVideoVoiceAntispamFreezeConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeOssIncrementCheckSettingResponseBodyVideoVoiceAntispamFreezeConfig self = new DescribeOssIncrementCheckSettingResponseBodyVideoVoiceAntispamFreezeConfig();
            return TeaModel.build(map, self);
        }

        public DescribeOssIncrementCheckSettingResponseBodyVideoVoiceAntispamFreezeConfig setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeOssIncrementCheckSettingResponseBodyVideoVoiceAntispamFreezeConfig setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
