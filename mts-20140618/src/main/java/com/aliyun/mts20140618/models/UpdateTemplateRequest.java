// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class UpdateTemplateRequest extends TeaModel {
    /**
     * <p>The configuration of the audio stream. The value is a JSON object. For more information, see [Audio](~~29253~~).</p>
     */
    @NameInMap("Audio")
    public String audio;

    /**
     * <p>The container format. The value is a JSON object. Default format: **MP4**.</p>
     * <br>
     * <p>*   Video formats: FLV, MP4, HLS (m3u8 + TS), and MPEG-DASH (MPD + fMP4)</p>
     * <p>*   Audio formats: MP3, MP4, Ogg, FLAC, and M4A</p>
     * <p>*   Images formats: GIF and WebP</p>
     * <br>
     * <p>For more information, see [Container](~~29253~~).</p>
     */
    @NameInMap("Container")
    public String container;

    /**
     * <p>The transmuxing configuration. The value is a JSON object. For more information, see [MuxConfig](~~29253~~).</p>
     */
    @NameInMap("MuxConfig")
    public String muxConfig;

    /**
     * <p>The name of the template. The value can be up to 128 bytes in size.</p>
     */
    @NameInMap("Name")
    public String name;

    @NameInMap("OwnerAccount")
    public String ownerAccount;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("ResourceOwnerAccount")
    public String resourceOwnerAccount;

    @NameInMap("ResourceOwnerId")
    public Long resourceOwnerId;

    /**
     * <p>The ID of the template. You can obtain the template ID from the response of the [AddTemplate](~~213306~~) operation.</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    /**
     * <p>The general transcoding configuration. The value is a JSON object. For more information, see [TransConfig](~~29253~~).</p>
     */
    @NameInMap("TransConfig")
    public String transConfig;

    /**
     * <p>The configuration of the video stream. The value is a JSON object. For more information, see [Video](~~29253~~).</p>
     */
    @NameInMap("Video")
    public String video;

    public static UpdateTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateTemplateRequest self = new UpdateTemplateRequest();
        return TeaModel.build(map, self);
    }

    public UpdateTemplateRequest setAudio(String audio) {
        this.audio = audio;
        return this;
    }
    public String getAudio() {
        return this.audio;
    }

    public UpdateTemplateRequest setContainer(String container) {
        this.container = container;
        return this;
    }
    public String getContainer() {
        return this.container;
    }

    public UpdateTemplateRequest setMuxConfig(String muxConfig) {
        this.muxConfig = muxConfig;
        return this;
    }
    public String getMuxConfig() {
        return this.muxConfig;
    }

    public UpdateTemplateRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateTemplateRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
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

    public UpdateTemplateRequest setTransConfig(String transConfig) {
        this.transConfig = transConfig;
        return this;
    }
    public String getTransConfig() {
        return this.transConfig;
    }

    public UpdateTemplateRequest setVideo(String video) {
        this.video = video;
        return this;
    }
    public String getVideo() {
        return this.video;
    }

}
