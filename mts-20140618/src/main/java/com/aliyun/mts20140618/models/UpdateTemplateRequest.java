// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class UpdateTemplateRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    @NameInMap("TemplateId")
    public String templateId;

    @NameInMap("Name")
    public String name;

    @NameInMap("Container")
    public String container;

    @NameInMap("Video")
    public String video;

    @NameInMap("Audio")
    public String audio;

    @NameInMap("MuxConfig")
    public String muxConfig;

    @NameInMap("TransConfig")
    public String transConfig;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    public static UpdateTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateTemplateRequest self = new UpdateTemplateRequest();
        return TeaModel.build(map, self);
    }

    public UpdateTemplateRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UpdateTemplateRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public UpdateTemplateRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public UpdateTemplateRequest setTemplateId(String templateId) {
        this.templateId = templateId;
        return this;
    }
    public String getTemplateId() {
        return this.templateId;
    }

    public UpdateTemplateRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateTemplateRequest setContainer(String container) {
        this.container = container;
        return this;
    }
    public String getContainer() {
        return this.container;
    }

    public UpdateTemplateRequest setVideo(String video) {
        this.video = video;
        return this;
    }
    public String getVideo() {
        return this.video;
    }

    public UpdateTemplateRequest setAudio(String audio) {
        this.audio = audio;
        return this;
    }
    public String getAudio() {
        return this.audio;
    }

    public UpdateTemplateRequest setMuxConfig(String muxConfig) {
        this.muxConfig = muxConfig;
        return this;
    }
    public String getMuxConfig() {
        return this.muxConfig;
    }

    public UpdateTemplateRequest setTransConfig(String transConfig) {
        this.transConfig = transConfig;
        return this;
    }
    public String getTransConfig() {
        return this.transConfig;
    }

    public UpdateTemplateRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

}
