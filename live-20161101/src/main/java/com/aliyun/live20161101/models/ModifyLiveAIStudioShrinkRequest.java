// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class ModifyLiveAIStudioShrinkRequest extends TeaModel {
    /**
     * <p>The ID of the background material in ApsaraVideo VOD. You can obtain the ID from the ApsaraVideo VOD console.</p>
     * 
     * <strong>example:</strong>
     * <p>d0eb493192c771efba644531858c0102</p>
     */
    @NameInMap("BackgroundResourceId")
    public String backgroundResourceId;

    /**
     * <p>The URL of the background material.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://xxx.com/2.mp4">https://xxx.com/2.mp4</a></p>
     */
    @NameInMap("BackgroundResourceUrl")
    public String backgroundResourceUrl;

    /**
     * <p>The type of the background material. Valid values:</p>
     * <ul>
     * <li>VOD: a video in ApsaraVideo VOD</li>
     * <li>PIC: an image</li>
     * <li>LIVE: a live stream</li>
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
     * <p>custom</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The preview height. Unit: pixels.</p>
     * <p>The following preview specifications (width × height) are supported:</p>
     * <ul>
     * <li>Landscape low definition 360p (640×360)</li>
     * <li>Portrait low definition 360p (360×640)</li>
     * <li>Landscape standard definition 480p (854×480)</li>
     * <li>Portrait standard definition 480p (480×854)</li>
     * <li>Landscape high definition 720p (1280×720)</li>
     * <li>Portrait high definition 720p (720×1280)</li>
     * <li>Landscape ultra-high definition 1080p (1920×1080)</li>
     * <li>Portrait ultra-high definition 1080p (1080×1920)</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1080</p>
     */
    @NameInMap("Height")
    public Integer height;

    /**
     * <p>The layout information of the chroma-keyed material.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("MattingLayout")
    public String mattingLayoutShrink;

    /**
     * <p>The type of chroma key. Valid values:</p>
     * <ul>
     * <li>green: green-screen chroma key</li>
     * <li>blue: blue-screen chroma key</li>
     * <li>complex: background replacement</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>complex</p>
     */
    @NameInMap("MattingType")
    public String mattingType;

    /**
     * <p>The layout information of the multimedia material.</p>
     */
    @NameInMap("MediaLayout")
    public String mediaLayoutShrink;

    /**
     * <p>The ID of the multimedia material in ApsaraVideo VOD. You can obtain the ID from the ApsaraVideo VOD console.</p>
     * 
     * <strong>example:</strong>
     * <p>d0eb493192c771efba644531858c01102</p>
     */
    @NameInMap("MediaResourceId")
    public String mediaResourceId;

    /**
     * <p>The URL of the multimedia material. Specify either this parameter or the MediaResourceId parameter.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://xxx.com/1.mp4">https://xxx.com/1.mp4</a></p>
     */
    @NameInMap("MediaResourceUrl")
    public String mediaResourceUrl;

    /**
     * <p>The type of the multimedia material. Valid values:</p>
     * <ul>
     * <li>VOD: a video in ApsaraVideo VOD</li>
     * <li>PIC: an image</li>
     * <li>LIVE: a live stream</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>VOD</p>
     */
    @NameInMap("MediaType")
    public String mediaType;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The name of the virtual studio template. The name is the same as the value of the StudioName parameter that was specified when you called the CreateLiveAIStudio operation to create the virtual studio template.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>stu02</p>
     */
    @NameInMap("StudioName")
    public String studioName;

    /**
     * <p>The preview width. Unit: pixels.</p>
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
