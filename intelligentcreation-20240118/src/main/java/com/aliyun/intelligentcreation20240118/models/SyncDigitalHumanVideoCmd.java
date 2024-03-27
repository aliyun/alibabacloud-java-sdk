// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240118.models;

import com.aliyun.tea.*;

public class SyncDigitalHumanVideoCmd extends TeaModel {
    @NameInMap("accountId")
    public String accountId;

    @NameInMap("actionType")
    public String actionType;

    @NameInMap("idempotentId")
    public String idempotentId;

    @NameInMap("imageScale")
    public String imageScale;

    @NameInMap("imageUrl")
    public String imageUrl;

    @NameInMap("videoDuration")
    public Integer videoDuration;

    @NameInMap("videoId")
    public String videoId;

    @NameInMap("videoTitle")
    public String videoTitle;

    @NameInMap("videoUrl")
    public String videoUrl;

    public static SyncDigitalHumanVideoCmd build(java.util.Map<String, ?> map) throws Exception {
        SyncDigitalHumanVideoCmd self = new SyncDigitalHumanVideoCmd();
        return TeaModel.build(map, self);
    }

    public SyncDigitalHumanVideoCmd setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public SyncDigitalHumanVideoCmd setActionType(String actionType) {
        this.actionType = actionType;
        return this;
    }
    public String getActionType() {
        return this.actionType;
    }

    public SyncDigitalHumanVideoCmd setIdempotentId(String idempotentId) {
        this.idempotentId = idempotentId;
        return this;
    }
    public String getIdempotentId() {
        return this.idempotentId;
    }

    public SyncDigitalHumanVideoCmd setImageScale(String imageScale) {
        this.imageScale = imageScale;
        return this;
    }
    public String getImageScale() {
        return this.imageScale;
    }

    public SyncDigitalHumanVideoCmd setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
    public String getImageUrl() {
        return this.imageUrl;
    }

    public SyncDigitalHumanVideoCmd setVideoDuration(Integer videoDuration) {
        this.videoDuration = videoDuration;
        return this;
    }
    public Integer getVideoDuration() {
        return this.videoDuration;
    }

    public SyncDigitalHumanVideoCmd setVideoId(String videoId) {
        this.videoId = videoId;
        return this;
    }
    public String getVideoId() {
        return this.videoId;
    }

    public SyncDigitalHumanVideoCmd setVideoTitle(String videoTitle) {
        this.videoTitle = videoTitle;
        return this;
    }
    public String getVideoTitle() {
        return this.videoTitle;
    }

    public SyncDigitalHumanVideoCmd setVideoUrl(String videoUrl) {
        this.videoUrl = videoUrl;
        return this;
    }
    public String getVideoUrl() {
        return this.videoUrl;
    }

}
