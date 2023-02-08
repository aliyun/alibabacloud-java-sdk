// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class AddTemplateRequest extends TeaModel {
    /**
     * <p>The audio stream configuration. The value must be a JSON object. For more information, see the [Parameters nested under the Audio parameter](~~29253~~) section of this topic.</p>
     * <br>
     * <p>>  If you do not set this parameter, output files do not contain audio streams. If you need to retain the audio streams, this parameter is required.</p>
     */
    @NameInMap("Audio")
    public String audio;

    /**
     * <p>The container configuration. The value must be a JSON object and contains the Format parameter. If you do not configure the container, the transcoded media file is in MP4 format by default. If you want to use the transcoding template to generate media files in other formats, this parameter is required. For more information, see the [Parameter nested under the Container parameter](~~29253~~) section of this topic.</p>
     * <br>
     * <p>*   Default value of the Format parameter: mp4.</p>
     * <p>*   Video formats include FLV, MP4, HLS (M3U8 + TS), and MPEG-DASH (MPD + fMP4)</p>
     * <br>
     * <p>>  If the container format is FLV, the video codec cannot be set to H.265.</p>
     * <br>
     * <p>*   Audio formats include MP3, MP4, Ogg, FLAC, and M4A</p>
     * <br>
     * <p>*   Image formats include GIF and WebP.</p>
     * <br>
     * <p>>*   If the container format is GIF, the video codec must be set to GIF.</p>
     * <p>  *   If the container format is WebP, the video codec must be set to WebP.</p>
     */
    @NameInMap("Container")
    public String container;

    /**
     * <p>The segment configuration. The value must be a JSON object. For more information, see the [Parameters nested under the MuxConfig parameter](~~29253~~) section of this topic. If you do not set this parameter, media segment files are not generated. If you want to generate media segment files, this parameter is required.</p>
     */
    @NameInMap("MuxConfig")
    public String muxConfig;

    /**
     * <p>The name of the template. The name can be up to 128 bytes in length.</p>
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
     * <p>The general transcoding configuration. The value must be a JSON object. For more information, see the [Parameters nested under the TransConfig parameter](~~29253~~) section of this topic. If you do not set this parameter, the default settings of this parameter are used. If the default settings cannot meet your transcoding needs, set the parameters nested under the TransConfig parameter as required.</p>
     */
    @NameInMap("TransConfig")
    public String transConfig;

    /**
     * <p>The video stream configuration. The value must be a JSON object. For more information, see the [Parameters nested under the Video parameter](~~29253~~) section of this topic.</p>
     * <br>
     * <p>>  If you do not set this parameter, output files do not contain video streams. If you need to retain the video streams, this parameter is required.</p>
     */
    @NameInMap("Video")
    public String video;

    public static AddTemplateRequest build(java.util.Map<String, ?> map) throws Exception {
        AddTemplateRequest self = new AddTemplateRequest();
        return TeaModel.build(map, self);
    }

    public AddTemplateRequest setAudio(String audio) {
        this.audio = audio;
        return this;
    }
    public String getAudio() {
        return this.audio;
    }

    public AddTemplateRequest setContainer(String container) {
        this.container = container;
        return this;
    }
    public String getContainer() {
        return this.container;
    }

    public AddTemplateRequest setMuxConfig(String muxConfig) {
        this.muxConfig = muxConfig;
        return this;
    }
    public String getMuxConfig() {
        return this.muxConfig;
    }

    public AddTemplateRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public AddTemplateRequest setOwnerAccount(String ownerAccount) {
        this.ownerAccount = ownerAccount;
        return this;
    }
    public String getOwnerAccount() {
        return this.ownerAccount;
    }

    public AddTemplateRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public AddTemplateRequest setResourceOwnerAccount(String resourceOwnerAccount) {
        this.resourceOwnerAccount = resourceOwnerAccount;
        return this;
    }
    public String getResourceOwnerAccount() {
        return this.resourceOwnerAccount;
    }

    public AddTemplateRequest setResourceOwnerId(Long resourceOwnerId) {
        this.resourceOwnerId = resourceOwnerId;
        return this;
    }
    public Long getResourceOwnerId() {
        return this.resourceOwnerId;
    }

    public AddTemplateRequest setTransConfig(String transConfig) {
        this.transConfig = transConfig;
        return this;
    }
    public String getTransConfig() {
        return this.transConfig;
    }

    public AddTemplateRequest setVideo(String video) {
        this.video = video;
        return this;
    }
    public String getVideo() {
        return this.video;
    }

}
