// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class V1MediaSecurityStorageRequest extends TeaModel {
    @NameInMap("AppId")
    public String appId;

    @NameInMap("AppSettings")
    public AppsSettings appSettings;

    @NameInMap("AssetId")
    public String assetId;

    @NameInMap("Customer")
    public CommonCustomer customer;

    @NameInMap("Image")
    public CommonMediaResource image;

    @NameInMap("ImageStorage")
    public CommonStorage imageStorage;

    @NameInMap("Video")
    public CommonMediaResource video;

    @NameInMap("VideoStorage")
    public CommonStorage videoStorage;

    public static V1MediaSecurityStorageRequest build(java.util.Map<String, ?> map) throws Exception {
        V1MediaSecurityStorageRequest self = new V1MediaSecurityStorageRequest();
        return TeaModel.build(map, self);
    }

    public V1MediaSecurityStorageRequest setAppId(String appId) {
        this.appId = appId;
        return this;
    }
    public String getAppId() {
        return this.appId;
    }

    public V1MediaSecurityStorageRequest setAppSettings(AppsSettings appSettings) {
        this.appSettings = appSettings;
        return this;
    }
    public AppsSettings getAppSettings() {
        return this.appSettings;
    }

    public V1MediaSecurityStorageRequest setAssetId(String assetId) {
        this.assetId = assetId;
        return this;
    }
    public String getAssetId() {
        return this.assetId;
    }

    public V1MediaSecurityStorageRequest setCustomer(CommonCustomer customer) {
        this.customer = customer;
        return this;
    }
    public CommonCustomer getCustomer() {
        return this.customer;
    }

    public V1MediaSecurityStorageRequest setImage(CommonMediaResource image) {
        this.image = image;
        return this;
    }
    public CommonMediaResource getImage() {
        return this.image;
    }

    public V1MediaSecurityStorageRequest setImageStorage(CommonStorage imageStorage) {
        this.imageStorage = imageStorage;
        return this;
    }
    public CommonStorage getImageStorage() {
        return this.imageStorage;
    }

    public V1MediaSecurityStorageRequest setVideo(CommonMediaResource video) {
        this.video = video;
        return this;
    }
    public CommonMediaResource getVideo() {
        return this.video;
    }

    public V1MediaSecurityStorageRequest setVideoStorage(CommonStorage videoStorage) {
        this.videoStorage = videoStorage;
        return this;
    }
    public CommonStorage getVideoStorage() {
        return this.videoStorage;
    }

}
