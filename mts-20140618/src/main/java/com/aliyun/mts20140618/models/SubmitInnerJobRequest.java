// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class SubmitInnerJobRequest extends TeaModel {
    @NameInMap("Config")
    public String config;

    @NameInMap("Images")
    public String images;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("PipelineId")
    public String pipelineId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("Uid")
    public Long uid;

    @NameInMap("Video")
    public String video;

    public static SubmitInnerJobRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitInnerJobRequest self = new SubmitInnerJobRequest();
        return TeaModel.build(map, self);
    }

    public SubmitInnerJobRequest setConfig(String config) {
        this.config = config;
        return this;
    }
    public String getConfig() {
        return this.config;
    }

    public SubmitInnerJobRequest setImages(String images) {
        this.images = images;
        return this;
    }
    public String getImages() {
        return this.images;
    }

    public SubmitInnerJobRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public SubmitInnerJobRequest setPipelineId(String pipelineId) {
        this.pipelineId = pipelineId;
        return this;
    }
    public String getPipelineId() {
        return this.pipelineId;
    }

    public SubmitInnerJobRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public SubmitInnerJobRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public SubmitInnerJobRequest setUid(Long uid) {
        this.uid = uid;
        return this;
    }
    public Long getUid() {
        return this.uid;
    }

    public SubmitInnerJobRequest setVideo(String video) {
        this.video = video;
        return this;
    }
    public String getVideo() {
        return this.video;
    }

}
