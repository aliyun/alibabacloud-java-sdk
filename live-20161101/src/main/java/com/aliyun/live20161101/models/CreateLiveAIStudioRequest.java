// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class CreateLiveAIStudioRequest extends TeaModel {
    /**
     * <p>The ID of the background material in ApsaraVideo VOD. You can obtain the ID from the ApsaraVideo VOD console.</p>
     * 
     * <strong>example:</strong>
     * <p>d0eb493192c771efba644531858c0102</p>
     */
    @NameInMap("BackgroundResourceId")
    public String backgroundResourceId;

    /**
     * <p>The URL of the background material. Specify either this parameter or the BackgroundResourceId parameter.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://xxx.com/1.mp4">https://xxx.com/1.mp4</a></p>
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
     * <p>template 1080</p>
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
    public CreateLiveAIStudioRequestMattingLayout mattingLayout;

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
    public CreateLiveAIStudioRequestMediaLayout mediaLayout;

    /**
     * <p>The ID of the multimedia material in ApsaraVideo VOD. You can obtain the ID from the ApsaraVideo VOD console.</p>
     * 
     * <strong>example:</strong>
     * <p>d0eb493192c771efba644531858c0102</p>
     */
    @NameInMap("MediaResourceId")
    public String mediaResourceId;

    /**
     * <p>The URL of the multimedia material. Specify either this parameter or the MediaResourceId parameter.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://xxx.com/2.mp4">https://xxx.com/2.mp4</a></p>
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
     * <p>The name of the virtual studio template. The name must be unique.</p>
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

    public static CreateLiveAIStudioRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLiveAIStudioRequest self = new CreateLiveAIStudioRequest();
        return TeaModel.build(map, self);
    }

    public CreateLiveAIStudioRequest setBackgroundResourceId(String backgroundResourceId) {
        this.backgroundResourceId = backgroundResourceId;
        return this;
    }
    public String getBackgroundResourceId() {
        return this.backgroundResourceId;
    }

    public CreateLiveAIStudioRequest setBackgroundResourceUrl(String backgroundResourceUrl) {
        this.backgroundResourceUrl = backgroundResourceUrl;
        return this;
    }
    public String getBackgroundResourceUrl() {
        return this.backgroundResourceUrl;
    }

    public CreateLiveAIStudioRequest setBackgroundType(String backgroundType) {
        this.backgroundType = backgroundType;
        return this;
    }
    public String getBackgroundType() {
        return this.backgroundType;
    }

    public CreateLiveAIStudioRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateLiveAIStudioRequest setHeight(Integer height) {
        this.height = height;
        return this;
    }
    public Integer getHeight() {
        return this.height;
    }

    public CreateLiveAIStudioRequest setMattingLayout(CreateLiveAIStudioRequestMattingLayout mattingLayout) {
        this.mattingLayout = mattingLayout;
        return this;
    }
    public CreateLiveAIStudioRequestMattingLayout getMattingLayout() {
        return this.mattingLayout;
    }

    public CreateLiveAIStudioRequest setMattingType(String mattingType) {
        this.mattingType = mattingType;
        return this;
    }
    public String getMattingType() {
        return this.mattingType;
    }

    public CreateLiveAIStudioRequest setMediaLayout(CreateLiveAIStudioRequestMediaLayout mediaLayout) {
        this.mediaLayout = mediaLayout;
        return this;
    }
    public CreateLiveAIStudioRequestMediaLayout getMediaLayout() {
        return this.mediaLayout;
    }

    public CreateLiveAIStudioRequest setMediaResourceId(String mediaResourceId) {
        this.mediaResourceId = mediaResourceId;
        return this;
    }
    public String getMediaResourceId() {
        return this.mediaResourceId;
    }

    public CreateLiveAIStudioRequest setMediaResourceUrl(String mediaResourceUrl) {
        this.mediaResourceUrl = mediaResourceUrl;
        return this;
    }
    public String getMediaResourceUrl() {
        return this.mediaResourceUrl;
    }

    public CreateLiveAIStudioRequest setMediaType(String mediaType) {
        this.mediaType = mediaType;
        return this;
    }
    public String getMediaType() {
        return this.mediaType;
    }

    public CreateLiveAIStudioRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public CreateLiveAIStudioRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateLiveAIStudioRequest setStudioName(String studioName) {
        this.studioName = studioName;
        return this;
    }
    public String getStudioName() {
        return this.studioName;
    }

    public CreateLiveAIStudioRequest setWidth(Integer width) {
        this.width = width;
        return this;
    }
    public Integer getWidth() {
        return this.width;
    }

    public static class CreateLiveAIStudioRequestMattingLayout extends TeaModel {
        /**
         * <p>The normalized value of the material height. The value indicates the ratio of the material height to the height of the background. Valid values: <strong>0 to 1</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>0.5</p>
         */
        @NameInMap("HeightNormalized")
        public Float heightNormalized;

        /**
         * <p>The x-coordinate of the material. Valid values: <strong>0 to 1</strong>. The upper-left corner is used as the coordinate origin for the material.</p>
         * 
         * <strong>example:</strong>
         * <p>0.3</p>
         */
        @NameInMap("PositionX")
        public Float positionX;

        /**
         * <p>The y-coordinate of the material. Valid values: <strong>0 to 1</strong>. The upper-left corner is used as the coordinate origin for the material.</p>
         * 
         * <strong>example:</strong>
         * <p>0.3</p>
         */
        @NameInMap("PositionY")
        public Float positionY;

        public static CreateLiveAIStudioRequestMattingLayout build(java.util.Map<String, ?> map) throws Exception {
            CreateLiveAIStudioRequestMattingLayout self = new CreateLiveAIStudioRequestMattingLayout();
            return TeaModel.build(map, self);
        }

        public CreateLiveAIStudioRequestMattingLayout setHeightNormalized(Float heightNormalized) {
            this.heightNormalized = heightNormalized;
            return this;
        }
        public Float getHeightNormalized() {
            return this.heightNormalized;
        }

        public CreateLiveAIStudioRequestMattingLayout setPositionX(Float positionX) {
            this.positionX = positionX;
            return this;
        }
        public Float getPositionX() {
            return this.positionX;
        }

        public CreateLiveAIStudioRequestMattingLayout setPositionY(Float positionY) {
            this.positionY = positionY;
            return this;
        }
        public Float getPositionY() {
            return this.positionY;
        }

    }

    public static class CreateLiveAIStudioRequestMediaLayout extends TeaModel {
        /**
         * <p>The normalized value of the material height. The value indicates the ratio of the material height to the height of the background. Valid values: <strong>0 to 1</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>0.5</p>
         */
        @NameInMap("HeightNormalized")
        public Float heightNormalized;

        /**
         * <p>The x-coordinate of the material. Valid values: <strong>0 to 1</strong>. The upper-left corner is used as the coordinate origin for the material.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("PositionX")
        public Float positionX;

        /**
         * <p>The y-coordinate of the material. Valid values: <strong>0 to 1</strong>. The upper-left corner is used as the coordinate origin for the material.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("PositionY")
        public Float positionY;

        public static CreateLiveAIStudioRequestMediaLayout build(java.util.Map<String, ?> map) throws Exception {
            CreateLiveAIStudioRequestMediaLayout self = new CreateLiveAIStudioRequestMediaLayout();
            return TeaModel.build(map, self);
        }

        public CreateLiveAIStudioRequestMediaLayout setHeightNormalized(Float heightNormalized) {
            this.heightNormalized = heightNormalized;
            return this;
        }
        public Float getHeightNormalized() {
            return this.heightNormalized;
        }

        public CreateLiveAIStudioRequestMediaLayout setPositionX(Float positionX) {
            this.positionX = positionX;
            return this;
        }
        public Float getPositionX() {
            return this.positionX;
        }

        public CreateLiveAIStudioRequestMediaLayout setPositionY(Float positionY) {
            this.positionY = positionY;
            return this;
        }
        public Float getPositionY() {
            return this.positionY;
        }

    }

}
