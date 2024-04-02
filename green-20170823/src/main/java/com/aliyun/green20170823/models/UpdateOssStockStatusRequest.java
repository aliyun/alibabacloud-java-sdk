// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.green20170823.models;

import com.aliyun.tea.*;

public class UpdateOssStockStatusRequest extends TeaModel {
    @NameInMap("AudioAutoFreezeSceneList")
    public String audioAutoFreezeSceneList;

    @NameInMap("AudioMaxSize")
    public Integer audioMaxSize;

    @NameInMap("AutoFreezeType")
    public String autoFreezeType;

    @NameInMap("BucketConfigList")
    public String bucketConfigList;

    @NameInMap("EndDate")
    public String endDate;

    @NameInMap("ImageAutoFreeze")
    public String imageAutoFreeze;

    @NameInMap("Lang")
    public String lang;

    @NameInMap("Operation")
    public String operation;

    @NameInMap("ResourceTypeList")
    public String resourceTypeList;

    @NameInMap("SceneList")
    public String sceneList;

    @NameInMap("SourceIp")
    public String sourceIp;

    @NameInMap("StartDate")
    public String startDate;

    @NameInMap("VideoAutoFreezeSceneList")
    public String videoAutoFreezeSceneList;

    @NameInMap("VideoFrameInterval")
    public Integer videoFrameInterval;

    @NameInMap("VideoMaxFrames")
    public Integer videoMaxFrames;

    @NameInMap("VideoMaxSize")
    public Integer videoMaxSize;

    public static UpdateOssStockStatusRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateOssStockStatusRequest self = new UpdateOssStockStatusRequest();
        return TeaModel.build(map, self);
    }

    public UpdateOssStockStatusRequest setAudioAutoFreezeSceneList(String audioAutoFreezeSceneList) {
        this.audioAutoFreezeSceneList = audioAutoFreezeSceneList;
        return this;
    }
    public String getAudioAutoFreezeSceneList() {
        return this.audioAutoFreezeSceneList;
    }

    public UpdateOssStockStatusRequest setAudioMaxSize(Integer audioMaxSize) {
        this.audioMaxSize = audioMaxSize;
        return this;
    }
    public Integer getAudioMaxSize() {
        return this.audioMaxSize;
    }

    public UpdateOssStockStatusRequest setAutoFreezeType(String autoFreezeType) {
        this.autoFreezeType = autoFreezeType;
        return this;
    }
    public String getAutoFreezeType() {
        return this.autoFreezeType;
    }

    public UpdateOssStockStatusRequest setBucketConfigList(String bucketConfigList) {
        this.bucketConfigList = bucketConfigList;
        return this;
    }
    public String getBucketConfigList() {
        return this.bucketConfigList;
    }

    public UpdateOssStockStatusRequest setEndDate(String endDate) {
        this.endDate = endDate;
        return this;
    }
    public String getEndDate() {
        return this.endDate;
    }

    public UpdateOssStockStatusRequest setImageAutoFreeze(String imageAutoFreeze) {
        this.imageAutoFreeze = imageAutoFreeze;
        return this;
    }
    public String getImageAutoFreeze() {
        return this.imageAutoFreeze;
    }

    public UpdateOssStockStatusRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public UpdateOssStockStatusRequest setOperation(String operation) {
        this.operation = operation;
        return this;
    }
    public String getOperation() {
        return this.operation;
    }

    public UpdateOssStockStatusRequest setResourceTypeList(String resourceTypeList) {
        this.resourceTypeList = resourceTypeList;
        return this;
    }
    public String getResourceTypeList() {
        return this.resourceTypeList;
    }

    public UpdateOssStockStatusRequest setSceneList(String sceneList) {
        this.sceneList = sceneList;
        return this;
    }
    public String getSceneList() {
        return this.sceneList;
    }

    public UpdateOssStockStatusRequest setSourceIp(String sourceIp) {
        this.sourceIp = sourceIp;
        return this;
    }
    public String getSourceIp() {
        return this.sourceIp;
    }

    public UpdateOssStockStatusRequest setStartDate(String startDate) {
        this.startDate = startDate;
        return this;
    }
    public String getStartDate() {
        return this.startDate;
    }

    public UpdateOssStockStatusRequest setVideoAutoFreezeSceneList(String videoAutoFreezeSceneList) {
        this.videoAutoFreezeSceneList = videoAutoFreezeSceneList;
        return this;
    }
    public String getVideoAutoFreezeSceneList() {
        return this.videoAutoFreezeSceneList;
    }

    public UpdateOssStockStatusRequest setVideoFrameInterval(Integer videoFrameInterval) {
        this.videoFrameInterval = videoFrameInterval;
        return this;
    }
    public Integer getVideoFrameInterval() {
        return this.videoFrameInterval;
    }

    public UpdateOssStockStatusRequest setVideoMaxFrames(Integer videoMaxFrames) {
        this.videoMaxFrames = videoMaxFrames;
        return this;
    }
    public Integer getVideoMaxFrames() {
        return this.videoMaxFrames;
    }

    public UpdateOssStockStatusRequest setVideoMaxSize(Integer videoMaxSize) {
        this.videoMaxSize = videoMaxSize;
        return this;
    }
    public Integer getVideoMaxSize() {
        return this.videoMaxSize;
    }

}
