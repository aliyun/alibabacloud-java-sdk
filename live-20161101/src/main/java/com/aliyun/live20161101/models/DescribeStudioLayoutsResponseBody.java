// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeStudioLayoutsResponseBody extends TeaModel {
    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>5c6a2a0d-f228-4a64-af62-20e91b9676b3</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The layout information.</p>
     */
    @NameInMap("StudioLayouts")
    public java.util.List<DescribeStudioLayoutsResponseBodyStudioLayouts> studioLayouts;

    /**
     * <p>The number of layouts.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Total")
    public Integer total;

    public static DescribeStudioLayoutsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeStudioLayoutsResponseBody self = new DescribeStudioLayoutsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeStudioLayoutsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeStudioLayoutsResponseBody setStudioLayouts(java.util.List<DescribeStudioLayoutsResponseBodyStudioLayouts> studioLayouts) {
        this.studioLayouts = studioLayouts;
        return this;
    }
    public java.util.List<DescribeStudioLayoutsResponseBodyStudioLayouts> getStudioLayouts() {
        return this.studioLayouts;
    }

    public DescribeStudioLayoutsResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public static class DescribeStudioLayoutsResponseBodyStudioLayoutsBgImageConfig extends TeaModel {
        /**
         * <p>The unique ID of the background material.</p>
         * 
         * <strong>example:</strong>
         * <p>k12kj31****</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The URL of the material.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://example.org">http://example.org</a></p>
         */
        @NameInMap("ImageUrl")
        public String imageUrl;

        /**
         * <p>The location ID.</p>
         * 
         * <strong>example:</strong>
         * <p>RV01</p>
         */
        @NameInMap("LocationId")
        public String locationId;

        /**
         * <p>The video-on-demand material ID.</p>
         * 
         * <strong>example:</strong>
         * <p>asdfas9df89asd8f9****</p>
         */
        @NameInMap("MaterialId")
        public String materialId;

        public static DescribeStudioLayoutsResponseBodyStudioLayoutsBgImageConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeStudioLayoutsResponseBodyStudioLayoutsBgImageConfig self = new DescribeStudioLayoutsResponseBodyStudioLayoutsBgImageConfig();
            return TeaModel.build(map, self);
        }

        public DescribeStudioLayoutsResponseBodyStudioLayoutsBgImageConfig setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeStudioLayoutsResponseBodyStudioLayoutsBgImageConfig setImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }
        public String getImageUrl() {
            return this.imageUrl;
        }

        public DescribeStudioLayoutsResponseBodyStudioLayoutsBgImageConfig setLocationId(String locationId) {
            this.locationId = locationId;
            return this;
        }
        public String getLocationId() {
            return this.locationId;
        }

        public DescribeStudioLayoutsResponseBodyStudioLayoutsBgImageConfig setMaterialId(String materialId) {
            this.materialId = materialId;
            return this;
        }
        public String getMaterialId() {
            return this.materialId;
        }

    }

    public static class DescribeStudioLayoutsResponseBodyStudioLayoutsCommonConfig extends TeaModel {
        /**
         * <p>The channel location ID to which the video resource is bound.</p>
         * 
         * <strong>example:</strong>
         * <p>RV01</p>
         */
        @NameInMap("ChannelId")
        public String channelId;

        /**
         * <p>The video resource ID.</p>
         * 
         * <strong>example:</strong>
         * <p>asdfasdfasdfasdfa****</p>
         */
        @NameInMap("VideoResourceId")
        public String videoResourceId;

        public static DescribeStudioLayoutsResponseBodyStudioLayoutsCommonConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeStudioLayoutsResponseBodyStudioLayoutsCommonConfig self = new DescribeStudioLayoutsResponseBodyStudioLayoutsCommonConfig();
            return TeaModel.build(map, self);
        }

        public DescribeStudioLayoutsResponseBodyStudioLayoutsCommonConfig setChannelId(String channelId) {
            this.channelId = channelId;
            return this;
        }
        public String getChannelId() {
            return this.channelId;
        }

        public DescribeStudioLayoutsResponseBodyStudioLayoutsCommonConfig setVideoResourceId(String videoResourceId) {
            this.videoResourceId = videoResourceId;
            return this;
        }
        public String getVideoResourceId() {
            return this.videoResourceId;
        }

    }

    public static class DescribeStudioLayoutsResponseBodyStudioLayoutsLayerOrderConfigList extends TeaModel {
        /**
         * <p>The unique ID of the resource.</p>
         * 
         * <strong>example:</strong>
         * <p>k12kj31****</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The type of the resource configuration. Valid values:</p>
         * <ul>
         * <li><strong>background</strong>: background material.</li>
         * <li><strong>media</strong>: multimedia material.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>media</p>
         */
        @NameInMap("Type")
        public String type;

        public static DescribeStudioLayoutsResponseBodyStudioLayoutsLayerOrderConfigList build(java.util.Map<String, ?> map) throws Exception {
            DescribeStudioLayoutsResponseBodyStudioLayoutsLayerOrderConfigList self = new DescribeStudioLayoutsResponseBodyStudioLayoutsLayerOrderConfigList();
            return TeaModel.build(map, self);
        }

        public DescribeStudioLayoutsResponseBodyStudioLayoutsLayerOrderConfigList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeStudioLayoutsResponseBodyStudioLayoutsLayerOrderConfigList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class DescribeStudioLayoutsResponseBodyStudioLayoutsMediaInputConfigList extends TeaModel {
        /**
         * <p>The channel location ID to which the video resource is bound.</p>
         * 
         * <strong>example:</strong>
         * <p>RV01</p>
         */
        @NameInMap("ChannelId")
        public String channelId;

        /**
         * <p>The fill type. Default value: none.</p>
         * 
         * <strong>example:</strong>
         * <p>none</p>
         */
        @NameInMap("FillMode")
        public String fillMode;

        /**
         * <p>The normalized height of the material. This is the height ratio of the material to the background. Valid values: <strong>0 to 1</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>0.4</p>
         */
        @NameInMap("HeightNormalized")
        public Float heightNormalized;

        /**
         * <p>The unique ID of the multimedia material.</p>
         * 
         * <strong>example:</strong>
         * <p>k12kj31****</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The video-on-demand image material ID.</p>
         * 
         * <strong>example:</strong>
         * <p>lkajsdfsa8fd89asd8****</p>
         */
        @NameInMap("ImageMaterialId")
        public String imageMaterialId;

        /**
         * <p>The multimedia material number. Used for frontend display only and has no logical function.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Index")
        public Integer index;

        /**
         * <p>The normalized position of the material fill area [x,y]. The values of x and y range from <strong>0 to 1</strong>. For example, [0.1,0.2] indicates a horizontal offset of 10% and a vertical offset of 20% from the upper-left corner.</p>
         */
        @NameInMap("PositionNormalized")
        public java.util.List<Float> positionNormalized;

        /**
         * <p>The position reference coordinate of the material. Default value: topLeft, which indicates that the position is set based on the upper-left corner.</p>
         * 
         * <strong>example:</strong>
         * <p>topLeft</p>
         */
        @NameInMap("PositionRefer")
        public String positionRefer;

        /**
         * <p>The video resource ID.</p>
         * 
         * <strong>example:</strong>
         * <p>asdfasdfasdfasdfa****</p>
         */
        @NameInMap("VideoResourceId")
        public String videoResourceId;

        /**
         * <p>The normalized width of the material. This is the width ratio of the material to the background. Valid values: <strong>0 to 1</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>0.4</p>
         */
        @NameInMap("WidthNormalized")
        public Float widthNormalized;

        public static DescribeStudioLayoutsResponseBodyStudioLayoutsMediaInputConfigList build(java.util.Map<String, ?> map) throws Exception {
            DescribeStudioLayoutsResponseBodyStudioLayoutsMediaInputConfigList self = new DescribeStudioLayoutsResponseBodyStudioLayoutsMediaInputConfigList();
            return TeaModel.build(map, self);
        }

        public DescribeStudioLayoutsResponseBodyStudioLayoutsMediaInputConfigList setChannelId(String channelId) {
            this.channelId = channelId;
            return this;
        }
        public String getChannelId() {
            return this.channelId;
        }

        public DescribeStudioLayoutsResponseBodyStudioLayoutsMediaInputConfigList setFillMode(String fillMode) {
            this.fillMode = fillMode;
            return this;
        }
        public String getFillMode() {
            return this.fillMode;
        }

        public DescribeStudioLayoutsResponseBodyStudioLayoutsMediaInputConfigList setHeightNormalized(Float heightNormalized) {
            this.heightNormalized = heightNormalized;
            return this;
        }
        public Float getHeightNormalized() {
            return this.heightNormalized;
        }

        public DescribeStudioLayoutsResponseBodyStudioLayoutsMediaInputConfigList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeStudioLayoutsResponseBodyStudioLayoutsMediaInputConfigList setImageMaterialId(String imageMaterialId) {
            this.imageMaterialId = imageMaterialId;
            return this;
        }
        public String getImageMaterialId() {
            return this.imageMaterialId;
        }

        public DescribeStudioLayoutsResponseBodyStudioLayoutsMediaInputConfigList setIndex(Integer index) {
            this.index = index;
            return this;
        }
        public Integer getIndex() {
            return this.index;
        }

        public DescribeStudioLayoutsResponseBodyStudioLayoutsMediaInputConfigList setPositionNormalized(java.util.List<Float> positionNormalized) {
            this.positionNormalized = positionNormalized;
            return this;
        }
        public java.util.List<Float> getPositionNormalized() {
            return this.positionNormalized;
        }

        public DescribeStudioLayoutsResponseBodyStudioLayoutsMediaInputConfigList setPositionRefer(String positionRefer) {
            this.positionRefer = positionRefer;
            return this;
        }
        public String getPositionRefer() {
            return this.positionRefer;
        }

        public DescribeStudioLayoutsResponseBodyStudioLayoutsMediaInputConfigList setVideoResourceId(String videoResourceId) {
            this.videoResourceId = videoResourceId;
            return this;
        }
        public String getVideoResourceId() {
            return this.videoResourceId;
        }

        public DescribeStudioLayoutsResponseBodyStudioLayoutsMediaInputConfigList setWidthNormalized(Float widthNormalized) {
            this.widthNormalized = widthNormalized;
            return this;
        }
        public Float getWidthNormalized() {
            return this.widthNormalized;
        }

    }

    public static class DescribeStudioLayoutsResponseBodyStudioLayoutsScreenInputConfigListAudioConfig extends TeaModel {
        /**
         * <p>The corresponding channel.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ValidChannel")
        public String validChannel;

        /**
         * <p>The volume.</p>
         * 
         * <strong>example:</strong>
         * <p>1.0</p>
         */
        @NameInMap("VolumeRate")
        public Float volumeRate;

        public static DescribeStudioLayoutsResponseBodyStudioLayoutsScreenInputConfigListAudioConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeStudioLayoutsResponseBodyStudioLayoutsScreenInputConfigListAudioConfig self = new DescribeStudioLayoutsResponseBodyStudioLayoutsScreenInputConfigListAudioConfig();
            return TeaModel.build(map, self);
        }

        public DescribeStudioLayoutsResponseBodyStudioLayoutsScreenInputConfigListAudioConfig setValidChannel(String validChannel) {
            this.validChannel = validChannel;
            return this;
        }
        public String getValidChannel() {
            return this.validChannel;
        }

        public DescribeStudioLayoutsResponseBodyStudioLayoutsScreenInputConfigListAudioConfig setVolumeRate(Float volumeRate) {
            this.volumeRate = volumeRate;
            return this;
        }
        public Float getVolumeRate() {
            return this.volumeRate;
        }

    }

    public static class DescribeStudioLayoutsResponseBodyStudioLayoutsScreenInputConfigList extends TeaModel {
        /**
         * <p>The audio configuration information.</p>
         */
        @NameInMap("AudioConfig")
        public DescribeStudioLayoutsResponseBodyStudioLayoutsScreenInputConfigListAudioConfig audioConfig;

        /**
         * <p>The channel location ID to which the video resource is bound.</p>
         * 
         * <strong>example:</strong>
         * <p>RV01</p>
         */
        @NameInMap("ChannelId")
        public String channelId;

        /**
         * <p>The chroma key color gamut. Valid values:</p>
         * <ul>
         * <li><strong>blue</strong>: blue screen background.</li>
         * <li><strong>green</strong>: green screen background.</li>
         * <li><strong>auto</strong>: automatic detection.</li>
         * <li><strong>complex</strong>: real-scene chroma keying.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>green</p>
         */
        @NameInMap("Color")
        public String color;

        /**
         * <p>The normalized height. This is the height ratio of the extracted portrait to the background. Valid values: <strong>0 to 1</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>0.4</p>
         */
        @NameInMap("HeightNormalized")
        public Float heightNormalized;

        /**
         * <p>The unique ID of the chroma key source material.</p>
         * 
         * <strong>example:</strong>
         * <p>k12kj31****</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The chroma key source number. Used for frontend display only and has no logical function.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Index")
        public Integer index;

        /**
         * <p>Indicates whether only audio is used.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("OnlyAudio")
        public Boolean onlyAudio;

        /**
         * <p>The portrait type. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: half-body.</li>
         * <li><strong>1</strong>: full-body.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("PortraitType")
        public Integer portraitType;

        /**
         * <p>The position parameter, x coordinate. Valid values: <strong>0 to 1</strong>. The material position is based on the upper-left corner.</p>
         * 
         * <strong>example:</strong>
         * <p>0.1</p>
         */
        @NameInMap("PositionX")
        public String positionX;

        /**
         * <p>The position parameter, y coordinate. Valid values: <strong>0 to 1</strong>. The material position is based on the upper-left corner.</p>
         * 
         * <strong>example:</strong>
         * <p>0.2</p>
         */
        @NameInMap("PositionY")
        public String positionY;

        /**
         * <p>The video resource ID.</p>
         * 
         * <strong>example:</strong>
         * <p>asdfasdfasdfasdfa****</p>
         */
        @NameInMap("VideoResourceId")
        public String videoResourceId;

        public static DescribeStudioLayoutsResponseBodyStudioLayoutsScreenInputConfigList build(java.util.Map<String, ?> map) throws Exception {
            DescribeStudioLayoutsResponseBodyStudioLayoutsScreenInputConfigList self = new DescribeStudioLayoutsResponseBodyStudioLayoutsScreenInputConfigList();
            return TeaModel.build(map, self);
        }

        public DescribeStudioLayoutsResponseBodyStudioLayoutsScreenInputConfigList setAudioConfig(DescribeStudioLayoutsResponseBodyStudioLayoutsScreenInputConfigListAudioConfig audioConfig) {
            this.audioConfig = audioConfig;
            return this;
        }
        public DescribeStudioLayoutsResponseBodyStudioLayoutsScreenInputConfigListAudioConfig getAudioConfig() {
            return this.audioConfig;
        }

        public DescribeStudioLayoutsResponseBodyStudioLayoutsScreenInputConfigList setChannelId(String channelId) {
            this.channelId = channelId;
            return this;
        }
        public String getChannelId() {
            return this.channelId;
        }

        public DescribeStudioLayoutsResponseBodyStudioLayoutsScreenInputConfigList setColor(String color) {
            this.color = color;
            return this;
        }
        public String getColor() {
            return this.color;
        }

        public DescribeStudioLayoutsResponseBodyStudioLayoutsScreenInputConfigList setHeightNormalized(Float heightNormalized) {
            this.heightNormalized = heightNormalized;
            return this;
        }
        public Float getHeightNormalized() {
            return this.heightNormalized;
        }

        public DescribeStudioLayoutsResponseBodyStudioLayoutsScreenInputConfigList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public DescribeStudioLayoutsResponseBodyStudioLayoutsScreenInputConfigList setIndex(Integer index) {
            this.index = index;
            return this;
        }
        public Integer getIndex() {
            return this.index;
        }

        public DescribeStudioLayoutsResponseBodyStudioLayoutsScreenInputConfigList setOnlyAudio(Boolean onlyAudio) {
            this.onlyAudio = onlyAudio;
            return this;
        }
        public Boolean getOnlyAudio() {
            return this.onlyAudio;
        }

        public DescribeStudioLayoutsResponseBodyStudioLayoutsScreenInputConfigList setPortraitType(Integer portraitType) {
            this.portraitType = portraitType;
            return this;
        }
        public Integer getPortraitType() {
            return this.portraitType;
        }

        public DescribeStudioLayoutsResponseBodyStudioLayoutsScreenInputConfigList setPositionX(String positionX) {
            this.positionX = positionX;
            return this;
        }
        public String getPositionX() {
            return this.positionX;
        }

        public DescribeStudioLayoutsResponseBodyStudioLayoutsScreenInputConfigList setPositionY(String positionY) {
            this.positionY = positionY;
            return this;
        }
        public String getPositionY() {
            return this.positionY;
        }

        public DescribeStudioLayoutsResponseBodyStudioLayoutsScreenInputConfigList setVideoResourceId(String videoResourceId) {
            this.videoResourceId = videoResourceId;
            return this;
        }
        public String getVideoResourceId() {
            return this.videoResourceId;
        }

    }

    public static class DescribeStudioLayoutsResponseBodyStudioLayouts extends TeaModel {
        /**
         * <p>The background resource configuration.</p>
         */
        @NameInMap("BgImageConfig")
        public DescribeStudioLayoutsResponseBodyStudioLayoutsBgImageConfig bgImageConfig;

        /**
         * <p>The common layout information. This field is returned when the layout is a common layout.</p>
         */
        @NameInMap("CommonConfig")
        public DescribeStudioLayoutsResponseBodyStudioLayoutsCommonConfig commonConfig;

        /**
         * <p>The layer order configuration.</p>
         */
        @NameInMap("LayerOrderConfigList")
        public java.util.List<DescribeStudioLayoutsResponseBodyStudioLayoutsLayerOrderConfigList> layerOrderConfigList;

        /**
         * <p>The studio layout ID.</p>
         * 
         * <strong>example:</strong>
         * <p>445409ec-7eaa-461d-8f29-4bec2eb9****</p>
         */
        @NameInMap("LayoutId")
        public String layoutId;

        /**
         * <p>The studio layout name.</p>
         * 
         * <strong>example:</strong>
         * <p>测试布局</p>
         */
        @NameInMap("LayoutName")
        public String layoutName;

        /**
         * <p>The studio layout type. Valid values:</p>
         * <ul>
         * <li><strong>common</strong>: common layout.</li>
         * <li><strong>studio</strong>: studio layout.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>studio</p>
         */
        @NameInMap("LayoutType")
        public String layoutType;

        /**
         * <p>The multimedia input resource configuration.</p>
         */
        @NameInMap("MediaInputConfigList")
        public java.util.List<DescribeStudioLayoutsResponseBodyStudioLayoutsMediaInputConfigList> mediaInputConfigList;

        /**
         * <p>The chroma key input configuration.</p>
         */
        @NameInMap("ScreenInputConfigList")
        public java.util.List<DescribeStudioLayoutsResponseBodyStudioLayoutsScreenInputConfigList> screenInputConfigList;

        public static DescribeStudioLayoutsResponseBodyStudioLayouts build(java.util.Map<String, ?> map) throws Exception {
            DescribeStudioLayoutsResponseBodyStudioLayouts self = new DescribeStudioLayoutsResponseBodyStudioLayouts();
            return TeaModel.build(map, self);
        }

        public DescribeStudioLayoutsResponseBodyStudioLayouts setBgImageConfig(DescribeStudioLayoutsResponseBodyStudioLayoutsBgImageConfig bgImageConfig) {
            this.bgImageConfig = bgImageConfig;
            return this;
        }
        public DescribeStudioLayoutsResponseBodyStudioLayoutsBgImageConfig getBgImageConfig() {
            return this.bgImageConfig;
        }

        public DescribeStudioLayoutsResponseBodyStudioLayouts setCommonConfig(DescribeStudioLayoutsResponseBodyStudioLayoutsCommonConfig commonConfig) {
            this.commonConfig = commonConfig;
            return this;
        }
        public DescribeStudioLayoutsResponseBodyStudioLayoutsCommonConfig getCommonConfig() {
            return this.commonConfig;
        }

        public DescribeStudioLayoutsResponseBodyStudioLayouts setLayerOrderConfigList(java.util.List<DescribeStudioLayoutsResponseBodyStudioLayoutsLayerOrderConfigList> layerOrderConfigList) {
            this.layerOrderConfigList = layerOrderConfigList;
            return this;
        }
        public java.util.List<DescribeStudioLayoutsResponseBodyStudioLayoutsLayerOrderConfigList> getLayerOrderConfigList() {
            return this.layerOrderConfigList;
        }

        public DescribeStudioLayoutsResponseBodyStudioLayouts setLayoutId(String layoutId) {
            this.layoutId = layoutId;
            return this;
        }
        public String getLayoutId() {
            return this.layoutId;
        }

        public DescribeStudioLayoutsResponseBodyStudioLayouts setLayoutName(String layoutName) {
            this.layoutName = layoutName;
            return this;
        }
        public String getLayoutName() {
            return this.layoutName;
        }

        public DescribeStudioLayoutsResponseBodyStudioLayouts setLayoutType(String layoutType) {
            this.layoutType = layoutType;
            return this;
        }
        public String getLayoutType() {
            return this.layoutType;
        }

        public DescribeStudioLayoutsResponseBodyStudioLayouts setMediaInputConfigList(java.util.List<DescribeStudioLayoutsResponseBodyStudioLayoutsMediaInputConfigList> mediaInputConfigList) {
            this.mediaInputConfigList = mediaInputConfigList;
            return this;
        }
        public java.util.List<DescribeStudioLayoutsResponseBodyStudioLayoutsMediaInputConfigList> getMediaInputConfigList() {
            return this.mediaInputConfigList;
        }

        public DescribeStudioLayoutsResponseBodyStudioLayouts setScreenInputConfigList(java.util.List<DescribeStudioLayoutsResponseBodyStudioLayoutsScreenInputConfigList> screenInputConfigList) {
            this.screenInputConfigList = screenInputConfigList;
            return this;
        }
        public java.util.List<DescribeStudioLayoutsResponseBodyStudioLayoutsScreenInputConfigList> getScreenInputConfigList() {
            return this.screenInputConfigList;
        }

    }

}
