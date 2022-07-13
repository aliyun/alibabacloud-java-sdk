// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imp20210630.models;

import com.aliyun.tea.*;

public class V1MediaSecurityStorageResponse extends TeaModel {
    @NameInMap("AssetId")
    public String assetId;

    @NameInMap("Image")
    public CommonMediaResource image;

    @NameInMap("ImageStorage")
    public CommonStorage imageStorage;

    @NameInMap("MediaId")
    public String mediaId;

    @NameInMap("Video")
    public CommonMediaResource video;

    @NameInMap("VideoStorage")
    public CommonStorage videoStorage;

    public static V1MediaSecurityStorageResponse build(java.util.Map<String, ?> map) throws Exception {
        V1MediaSecurityStorageResponse self = new V1MediaSecurityStorageResponse();
        return TeaModel.build(map, self);
    }

    public V1MediaSecurityStorageResponse setAssetId(String assetId) {
        this.assetId = assetId;
        return this;
    }
    public String getAssetId() {
        return this.assetId;
    }

    public V1MediaSecurityStorageResponse setImage(CommonMediaResource image) {
        this.image = image;
        return this;
    }
    public CommonMediaResource getImage() {
        return this.image;
    }

    public V1MediaSecurityStorageResponse setImageStorage(CommonStorage imageStorage) {
        this.imageStorage = imageStorage;
        return this;
    }
    public CommonStorage getImageStorage() {
        return this.imageStorage;
    }

    public V1MediaSecurityStorageResponse setMediaId(String mediaId) {
        this.mediaId = mediaId;
        return this;
    }
    public String getMediaId() {
        return this.mediaId;
    }

    public V1MediaSecurityStorageResponse setVideo(CommonMediaResource video) {
        this.video = video;
        return this;
    }
    public CommonMediaResource getVideo() {
        return this.video;
    }

    public V1MediaSecurityStorageResponse setVideoStorage(CommonStorage videoStorage) {
        this.videoStorage = videoStorage;
        return this;
    }
    public CommonStorage getVideoStorage() {
        return this.videoStorage;
    }

}
