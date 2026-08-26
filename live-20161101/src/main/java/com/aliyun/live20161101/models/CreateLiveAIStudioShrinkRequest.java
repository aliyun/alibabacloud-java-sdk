// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class CreateLiveAIStudioShrinkRequest extends TeaModel {
    /**
     * <p>The video-on-demand resource ID of the background material. Obtain this value from the ApsaraVideo VOD console.</p>
     * 
     * <strong>example:</strong>
     * <p>d0eb493192c771efba644531858c0102</p>
     */
    @NameInMap("BackgroundResourceId")
    public String backgroundResourceId;

    /**
     * <p>The access URL of the background material. Specify either this parameter or the resource ID.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://xxx.com/1.mp4">https://xxx.com/1.mp4</a></p>
     */
    @NameInMap("BackgroundResourceUrl")
    public String backgroundResourceUrl;

    /**
     * <p>The type of the background material. Valid values:</p>
     * <ul>
     * <li>VOD: video-on-demand video.</li>
     * <li>PIC: image.</li>
     * <li>LIVE: live stream.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>VOD</p>
     */
    @NameInMap("BackgroundType")
    public String backgroundType;

    /**
     * <p>The custom description.</p>
     * 
     * <strong>example:</strong>
     * <p>template 1080</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The height of the preview screen. Unit: px.</p>
     * <p>The width × height of the preview screen supports only the following specifications:</p>
     * <ul>
     * <li>Landscape low definition 360P: 640 × 360</li>
     * <li>Portrait low definition 360P: 360 × 640</li>
     * <li>Landscape standard definition 480P: 854 × 480</li>
     * <li>Portrait standard definition 480P: 480 × 854</li>
     * <li>Landscape high definition 720P: 1280 × 720</li>
     * <li>Portrait high definition 720P: 720 × 1280</li>
     * <li>Landscape ultra-high definition 1080P: 1920 × 1080</li>
     * <li>Portrait ultra-high definition 1080P: 1080 × 1920.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1080</p>
     */
    @NameInMap("Height")
    public Integer height;

    /**
     * <p>The layout position information of the source stream after image matting.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("MattingLayout")
    public String mattingLayoutShrink;

    /**
     * <p>The image matting type. Valid values:</p>
     * <ul>
     * <li>green: green screen matting.</li>
     * <li>blue: blue screen matting.</li>
     * <li>complex: real-scene matting.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>complex</p>
     */
    @NameInMap("MattingType")
    public String mattingType;

    /**
     * <p>The layout position information of the multimedia material.</p>
     */
    @NameInMap("MediaLayout")
    public String mediaLayoutShrink;

    /**
     * <p>The video-on-demand resource ID of the multimedia material. Obtain this value from the ApsaraVideo VOD console.</p>
     * 
     * <strong>example:</strong>
     * <p>d0eb493192c771efba644531858c0102</p>
     */
    @NameInMap("MediaResourceId")
    public String mediaResourceId;

    /**
     * <p>The access URL of the multimedia material. Specify either this parameter or the resource ID.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://xxx.com/2.mp4">https://xxx.com/2.mp4</a></p>
     */
    @NameInMap("MediaResourceUrl")
    public String mediaResourceUrl;

    /**
     * <p>The type of the multimedia material. Valid values:</p>
     * <ul>
     * <li>VOD: video-on-demand video.</li>
     * <li>PIC: image.</li>
     * <li>LIVE: live stream.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>VOD</p>
     */
    @NameInMap("MediaType")
    public String mediaType;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The name of the virtual studio template. The name must be unique.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>stu02</p>
     */
    @NameInMap("StudioName")
    public String studioName;

    /**
     * <p>The width of the preview screen. Unit: px.</p>
     * 
     * <strong>example:</strong>
     * <p>1920</p>
     */
    @NameInMap("Width")
    public Integer width;

    public static CreateLiveAIStudioShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLiveAIStudioShrinkRequest self = new CreateLiveAIStudioShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateLiveAIStudioShrinkRequest setBackgroundResourceId(String backgroundResourceId) {
        this.backgroundResourceId = backgroundResourceId;
        return this;
    }
    public String getBackgroundResourceId() {
        return this.backgroundResourceId;
    }

    public CreateLiveAIStudioShrinkRequest setBackgroundResourceUrl(String backgroundResourceUrl) {
        this.backgroundResourceUrl = backgroundResourceUrl;
        return this;
    }
    public String getBackgroundResourceUrl() {
        return this.backgroundResourceUrl;
    }

    public CreateLiveAIStudioShrinkRequest setBackgroundType(String backgroundType) {
        this.backgroundType = backgroundType;
        return this;
    }
    public String getBackgroundType() {
        return this.backgroundType;
    }

    public CreateLiveAIStudioShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateLiveAIStudioShrinkRequest setHeight(Integer height) {
        this.height = height;
        return this;
    }
    public Integer getHeight() {
        return this.height;
    }

    public CreateLiveAIStudioShrinkRequest setMattingLayoutShrink(String mattingLayoutShrink) {
        this.mattingLayoutShrink = mattingLayoutShrink;
        return this;
    }
    public String getMattingLayoutShrink() {
        return this.mattingLayoutShrink;
    }

    public CreateLiveAIStudioShrinkRequest setMattingType(String mattingType) {
        this.mattingType = mattingType;
        return this;
    }
    public String getMattingType() {
        return this.mattingType;
    }

    public CreateLiveAIStudioShrinkRequest setMediaLayoutShrink(String mediaLayoutShrink) {
        this.mediaLayoutShrink = mediaLayoutShrink;
        return this;
    }
    public String getMediaLayoutShrink() {
        return this.mediaLayoutShrink;
    }

    public CreateLiveAIStudioShrinkRequest setMediaResourceId(String mediaResourceId) {
        this.mediaResourceId = mediaResourceId;
        return this;
    }
    public String getMediaResourceId() {
        return this.mediaResourceId;
    }

    public CreateLiveAIStudioShrinkRequest setMediaResourceUrl(String mediaResourceUrl) {
        this.mediaResourceUrl = mediaResourceUrl;
        return this;
    }
    public String getMediaResourceUrl() {
        return this.mediaResourceUrl;
    }

    public CreateLiveAIStudioShrinkRequest setMediaType(String mediaType) {
        this.mediaType = mediaType;
        return this;
    }
    public String getMediaType() {
        return this.mediaType;
    }

    public CreateLiveAIStudioShrinkRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateLiveAIStudioShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateLiveAIStudioShrinkRequest setStudioName(String studioName) {
        this.studioName = studioName;
        return this;
    }
    public String getStudioName() {
        return this.studioName;
    }

    public CreateLiveAIStudioShrinkRequest setWidth(Integer width) {
        this.width = width;
        return this;
    }
    public Integer getWidth() {
        return this.width;
    }

}
