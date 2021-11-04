// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class SubmitMediaCensorJobRequest extends TeaModel {
    @NameInMap("Barrages")
    public String barrages;

    @NameInMap("CoverImages")
    public String coverImages;

    @NameInMap("Description")
    public String description;

    @NameInMap("ExternalUrl")
    public String externalUrl;

    @NameInMap("Input")
    public String input;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("PipelineId")
    public String pipelineId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("Title")
    public String title;

    @NameInMap("UserData")
    public String userData;

    @NameInMap("VideoCensorConfig")
    public String videoCensorConfig;

    public static SubmitMediaCensorJobRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitMediaCensorJobRequest self = new SubmitMediaCensorJobRequest();
        return TeaModel.build(map, self);
    }

    public SubmitMediaCensorJobRequest setBarrages(String barrages) {
        this.barrages = barrages;
        return this;
    }
    public String getBarrages() {
        return this.barrages;
    }

    public SubmitMediaCensorJobRequest setCoverImages(String coverImages) {
        this.coverImages = coverImages;
        return this;
    }
    public String getCoverImages() {
        return this.coverImages;
    }

    public SubmitMediaCensorJobRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public SubmitMediaCensorJobRequest setExternalUrl(String externalUrl) {
        this.externalUrl = externalUrl;
        return this;
    }
    public String getExternalUrl() {
        return this.externalUrl;
    }

    public SubmitMediaCensorJobRequest setInput(String input) {
        this.input = input;
        return this;
    }
    public String getInput() {
        return this.input;
    }

    public SubmitMediaCensorJobRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public SubmitMediaCensorJobRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public SubmitMediaCensorJobRequest setPipelineId(String pipelineId) {
        this.pipelineId = pipelineId;
        return this;
    }
    public String getPipelineId() {
        return this.pipelineId;
    }

    public SubmitMediaCensorJobRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public SubmitMediaCensorJobRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public SubmitMediaCensorJobRequest setTitle(String title) {
        this.title = title;
        return this;
    }
    public String getTitle() {
        return this.title;
    }

    public SubmitMediaCensorJobRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

    public SubmitMediaCensorJobRequest setVideoCensorConfig(String videoCensorConfig) {
        this.videoCensorConfig = videoCensorConfig;
        return this;
    }
    public String getVideoCensorConfig() {
        return this.videoCensorConfig;
    }

}
