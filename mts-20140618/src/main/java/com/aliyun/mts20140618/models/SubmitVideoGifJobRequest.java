// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class SubmitVideoGifJobRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("Input")
    public String input;

    @NameInMap("PipelineId")
    public String pipelineId;

    @NameInMap("VideoGifConfig")
    public String videoGifConfig;

    @NameInMap("UserData")
    public String userData;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    public static SubmitVideoGifJobRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitVideoGifJobRequest self = new SubmitVideoGifJobRequest();
        return TeaModel.build(map, self);
    }

    public SubmitVideoGifJobRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public SubmitVideoGifJobRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public SubmitVideoGifJobRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public SubmitVideoGifJobRequest setInput(String input) {
        this.input = input;
        return this;
    }
    public String getInput() {
        return this.input;
    }

    public SubmitVideoGifJobRequest setPipelineId(String pipelineId) {
        this.pipelineId = pipelineId;
        return this;
    }
    public String getPipelineId() {
        return this.pipelineId;
    }

    public SubmitVideoGifJobRequest setVideoGifConfig(String videoGifConfig) {
        this.videoGifConfig = videoGifConfig;
        return this;
    }
    public String getVideoGifConfig() {
        return this.videoGifConfig;
    }

    public SubmitVideoGifJobRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

    public SubmitVideoGifJobRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

}
