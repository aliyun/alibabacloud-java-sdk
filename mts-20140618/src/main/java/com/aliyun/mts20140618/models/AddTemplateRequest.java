// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class AddTemplateRequest extends TeaModel {
    /**
     * <p>The audio stream settings. The value must be a JSON object. For more information, see <a href="https://help.aliyun.com/document_detail/29253.html">Audio</a>.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, output files do not contain audio streams. This parameter is required if you want to retain the audio streams.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Codec&quot;:&quot;H.264&quot;,&quot;Samplerate&quot;:&quot;44100&quot;,&quot;Bitrate&quot;:&quot;500&quot;,&quot;Channels&quot;:&quot;2&quot;}</p>
     */
    @NameInMap("Audio")
    public String audio;

    /**
     * <p>The container format. The value must be a JSON object that contains the Format parameter. If you do not specify this parameter, the transcoded media file is in MP4 format by default. This parameter is required if you want to use the transcoding template to generate media files in other formats. For more information, see <a href="https://help.aliyun.com/document_detail/29253.html">Container</a>.</p>
     * <ul>
     * <li>Default value: MP4.</li>
     * <li>Video transcoding supports the following formats: FLV, MP4, HLS (M3U8 + TS), and MPEG-DASH (MPD + fMP4).</li>
     * </ul>
     * <blockquote>
     * <p>If the container format is FLV, the video codec cannot be set to H.265.</p>
     * </blockquote>
     * <ul>
     * <li>Audio transcoding supports the following formats: MP3, MP4, OGG, FLAC, and M4A.</li>
     * <li>Image transcoding supports the GIF and WebP formats.</li>
     * </ul>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>If the container format is GIF, the video codec must be set to GIF.</p>
     * </li>
     * <li><p>If the container format is WebP, the video codec must be set to WebP.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Format&quot;:&quot;mp4&quot;}</p>
     */
    @NameInMap("Container")
    public String container;

    /**
     * <p>The segment settings. The value must be a JSON object. For more information, see <a href="https://help.aliyun.com/document_detail/29253.html">MuxConfig</a>. If you do not specify this parameter, media segment files are not generated. This parameter is required if you want to generate media segment files.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Segment&quot;:{&quot;Duration&quot;:&quot;10&quot;}}</p>
     */
    @NameInMap("MuxConfig")
    public String muxConfig;

    /**
     * <p>The name of the transcoding template. The name can be up to 128 bytes in length.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>mps-example</p>
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
     * <p>The general transcoding settings. The value must be a JSON object. For more information, see <a href="https://help.aliyun.com/document_detail/29253.html">TransConfig</a>. If you do not specify this parameter, the default settings are used. This parameter is required if the default settings cannot meet your business requirements.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;TransMode&quot;:&quot;onepass&quot;}</p>
     */
    @NameInMap("TransConfig")
    public String transConfig;

    /**
     * <p>The video stream settings. The value must be a JSON object. For more information, see <a href="https://help.aliyun.com/document_detail/29253.html">Video</a>.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, output files do not contain video streams. This parameter is required if you want to retain the video streams.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Codec&quot;:&quot;H.264&quot;,&quot;Profile&quot;:&quot;high&quot;,&quot;Bitrate&quot;:&quot;500&quot;,&quot;Crf&quot;:&quot;15&quot;,&quot;Width&quot;:&quot;256&quot;,&quot;Height&quot;:&quot;800&quot;,&quot;Fps&quot;:&quot;25&quot;,&quot;Gop&quot;:&quot;10s&quot;}</p>
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
