// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class UpdateTemplateRequest extends TeaModel {
    /**
     * <p>The transmuxing configurations. The value is a JSON object. For more information, see the <a href="https://help.aliyun.com/document_detail/29253.html">MuxConfig</a> parameter of the &quot;Parameter details&quot; topic.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Codec&quot;:&quot;aac&quot;,&quot;Samplerate&quot;:&quot;44100&quot;,&quot;Bitrate&quot;:&quot;500&quot;,&quot;Channels&quot;:&quot;2&quot;}</p>
     */
    @NameInMap("Audio")
    public String audio;

    /**
     * <p>The configurations of the video stream. The value is a JSON object. For more information, see the <a href="https://help.aliyun.com/document_detail/29253.html">Video</a> parameter of the &quot;Parameter details&quot; topic.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Format&quot;:&quot;mp4&quot;}</p>
     */
    @NameInMap("Container")
    public String container;

    /**
     * <p>The general transcoding configurations. The value is a JSON object. For more information, see the <a href="https://help.aliyun.com/document_detail/29253.html">TransConfig</a> parameter of the &quot;Parameter details&quot; topic.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Segment&quot;:{&quot;Duration&quot;:&quot;10&quot;}}</p>
     */
    @NameInMap("MuxConfig")
    public String muxConfig;

    /**
     * <p>The container format. The value is a JSON object. Default format: <strong>MP4</strong>.</p>
     * <ul>
     * <li>Video formats: FLV, MP4, HLS (M3U8 + TS), and MPEG-DASH (MPD + fMP4)</li>
     * <li>Audio formats: MP3, MP4, OGG, FLAC, and M4A</li>
     * <li>Images formats: GIF and WebP</li>
     * </ul>
     * <p>For more information, see the <a href="https://help.aliyun.com/document_detail/29253.html">Container</a> parameter of the &quot;Parameter details&quot; topic.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>MPS-example</p>
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
     * <p>The name of the template. The name can be up to 128 bytes in length.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>16f01ad6175e4230ac42bb5182cd****</p>
     */
    @NameInMap("TemplateId")
    public String templateId;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;TransMode&quot;:&quot;onepass&quot;}</p>
     */
    @NameInMap("TransConfig")
    public String transConfig;

    /**
     * <p>The configurations of the audio stream. The value is a JSON object. For more information, see the <a href="https://help.aliyun.com/document_detail/29253.html">Audio</a> parameter of the &quot;Parameter details&quot; topic.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Codec&quot;:&quot;H.264&quot;,&quot;Profile&quot;:&quot;high&quot;,&quot;Bitrate&quot;:&quot;500&quot;,&quot;Crf&quot;:&quot;15&quot;,&quot;Width&quot;:&quot;256&quot;,&quot;Height&quot;:&quot;800&quot;,&quot;Fps&quot;:&quot;25&quot;,&quot;Gop&quot;:&quot;10&quot;}</p>
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
