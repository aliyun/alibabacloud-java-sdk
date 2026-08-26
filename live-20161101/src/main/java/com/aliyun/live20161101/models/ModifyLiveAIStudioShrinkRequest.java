// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class ModifyLiveAIStudioShrinkRequest extends TeaModel {
    /**
     * <p>VOD resource ID of the background material, obtained from the VOD console.</p>
     * 
     * <strong>example:</strong>
     * <p>d0eb493192c771efba644531858c0102</p>
     */
    @NameInMap("BackgroundResourceId")
    public String backgroundResourceId;

    /**
     * <p>Resource access URL of the background material.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://xxx.com/2.mp4">https://xxx.com/2.mp4</a></p>
     */
    @NameInMap("BackgroundResourceUrl")
    public String backgroundResourceUrl;

    /**
     * <p>Background material type:</p>
     * <ul>
     * <li>VOD: Video on demand</li>
     * <li>PIC: Image</li>
     * <li>LIVE: Live stream</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>VOD</p>
     */
    @NameInMap("BackgroundType")
    public String backgroundType;

    /**
     * <p>Custom description.</p>
     * 
     * <strong>example:</strong>
     * <p>custom</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Preview screen height, unit: px.</p>
     * <p>The preview screen width x height only supports the following specifications:</p>
     * <ul>
     * <li>Landscape Smooth 360P 640x360</li>
     * <li>Portrait Smooth 360P 360x640</li>
     * <li>Landscape Standard Definition 480P 854x480</li>
     * <li>Portrait Standard Definition 480P 480x854</li>
     * <li>Landscape HD 720P 1280x720</li>
     * <li>Portrait HD 720P 720x1280</li>
     * <li>Landscape Full HD 1080P 1920x1080</li>
     * <li>Portrait Full HD 1080P 1080x1920</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1080</p>
     */
    @NameInMap("Height")
    public Integer height;

    /**
     * <p>Layout position information of the source stream after matting.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("MattingLayout")
    public String mattingLayoutShrink;

    /**
     * <p>Matting type:</p>
     * <ul>
     * <li>green: Green screen matting</li>
     * <li>blue: Blue screen matting</li>
     * <li>complex: Real-scene matting</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>complex</p>
     */
    @NameInMap("MattingType")
    public String mattingType;

    /**
     * <p>Layout position information of the multimedia material.</p>
     */
    @NameInMap("MediaLayout")
    public String mediaLayoutShrink;

    /**
     * <p>VOD resource ID of the multimedia material, obtained from the VOD console.</p>
     * 
     * <strong>example:</strong>
     * <p>d0eb493192c771efba644531858c01102</p>
     */
    @NameInMap("MediaResourceId")
    public String mediaResourceId;

    /**
     * <p>Resource access URL of the multimedia material. Either this or the resource ID should be provided.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://xxx.com/1.mp4">https://xxx.com/1.mp4</a></p>
     */
    @NameInMap("MediaResourceUrl")
    public String mediaResourceUrl;

    /**
     * <p>Multimedia material type:</p>
     * <ul>
     * <li>VOD: Video on demand</li>
     * <li>PIC: Image</li>
     * <li>LIVE: Live stream</li>
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
     * <p>Region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>Virtual studio template name, same as the StudioName parameter in the create API.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>stu02</p>
     */
    @NameInMap("StudioName")
    public String studioName;

    /**
     * <p>Preview screen width, unit: px.</p>
     * 
     * <strong>example:</strong>
     * <p>1920</p>
     */
    @NameInMap("Width")
    public Integer width;

    public static ModifyLiveAIStudioShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyLiveAIStudioShrinkRequest self = new ModifyLiveAIStudioShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ModifyLiveAIStudioShrinkRequest setBackgroundResourceId(String backgroundResourceId) {
        this.backgroundResourceId = backgroundResourceId;
        return this;
    }
    public String getBackgroundResourceId() {
        return this.backgroundResourceId;
    }

    public ModifyLiveAIStudioShrinkRequest setBackgroundResourceUrl(String backgroundResourceUrl) {
        this.backgroundResourceUrl = backgroundResourceUrl;
        return this;
    }
    public String getBackgroundResourceUrl() {
        return this.backgroundResourceUrl;
    }

    public ModifyLiveAIStudioShrinkRequest setBackgroundType(String backgroundType) {
        this.backgroundType = backgroundType;
        return this;
    }
    public String getBackgroundType() {
        return this.backgroundType;
    }

    public ModifyLiveAIStudioShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyLiveAIStudioShrinkRequest setHeight(Integer height) {
        this.height = height;
        return this;
    }
    public Integer getHeight() {
        return this.height;
    }

    public ModifyLiveAIStudioShrinkRequest setMattingLayoutShrink(String mattingLayoutShrink) {
        this.mattingLayoutShrink = mattingLayoutShrink;
        return this;
    }
    public String getMattingLayoutShrink() {
        return this.mattingLayoutShrink;
    }

    public ModifyLiveAIStudioShrinkRequest setMattingType(String mattingType) {
        this.mattingType = mattingType;
        return this;
    }
    public String getMattingType() {
        return this.mattingType;
    }

    public ModifyLiveAIStudioShrinkRequest setMediaLayoutShrink(String mediaLayoutShrink) {
        this.mediaLayoutShrink = mediaLayoutShrink;
        return this;
    }
    public String getMediaLayoutShrink() {
        return this.mediaLayoutShrink;
    }

    public ModifyLiveAIStudioShrinkRequest setMediaResourceId(String mediaResourceId) {
        this.mediaResourceId = mediaResourceId;
        return this;
    }
    public String getMediaResourceId() {
        return this.mediaResourceId;
    }

    public ModifyLiveAIStudioShrinkRequest setMediaResourceUrl(String mediaResourceUrl) {
        this.mediaResourceUrl = mediaResourceUrl;
        return this;
    }
    public String getMediaResourceUrl() {
        return this.mediaResourceUrl;
    }

    public ModifyLiveAIStudioShrinkRequest setMediaType(String mediaType) {
        this.mediaType = mediaType;
        return this;
    }
    public String getMediaType() {
        return this.mediaType;
    }

    public ModifyLiveAIStudioShrinkRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyLiveAIStudioShrinkRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyLiveAIStudioShrinkRequest setStudioName(String studioName) {
        this.studioName = studioName;
        return this;
    }
    public String getStudioName() {
        return this.studioName;
    }

    public ModifyLiveAIStudioShrinkRequest setWidth(Integer width) {
        this.width = width;
        return this;
    }
    public Integer getWidth() {
        return this.width;
    }

}
