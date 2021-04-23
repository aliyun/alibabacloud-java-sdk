// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeStudioLayoutsResponseBody extends TeaModel {
    @NameInMap("StudioLayouts")
    public java.util.List<DescribeStudioLayoutsResponseBodyStudioLayouts> studioLayouts;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Total")
    public Integer total;

    public static DescribeStudioLayoutsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeStudioLayoutsResponseBody self = new DescribeStudioLayoutsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeStudioLayoutsResponseBody setStudioLayouts(java.util.List<DescribeStudioLayoutsResponseBodyStudioLayouts> studioLayouts) {
        this.studioLayouts = studioLayouts;
        return this;
    }
    public java.util.List<DescribeStudioLayoutsResponseBodyStudioLayouts> getStudioLayouts() {
        return this.studioLayouts;
    }

    public DescribeStudioLayoutsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeStudioLayoutsResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public static class DescribeStudioLayoutsResponseBodyStudioLayoutsBgImageConfig extends TeaModel {
        @NameInMap("MaterialId")
        public String materialId;

        @NameInMap("ImageUrl")
        public String imageUrl;

        @NameInMap("Id")
        public String id;

        public static DescribeStudioLayoutsResponseBodyStudioLayoutsBgImageConfig build(java.util.Map<String, ?> map) throws Exception {
            DescribeStudioLayoutsResponseBodyStudioLayoutsBgImageConfig self = new DescribeStudioLayoutsResponseBodyStudioLayoutsBgImageConfig();
            return TeaModel.build(map, self);
        }

        public DescribeStudioLayoutsResponseBodyStudioLayoutsBgImageConfig setMaterialId(String materialId) {
            this.materialId = materialId;
            return this;
        }
        public String getMaterialId() {
            return this.materialId;
        }

        public DescribeStudioLayoutsResponseBodyStudioLayoutsBgImageConfig setImageUrl(String imageUrl) {
            this.imageUrl = imageUrl;
            return this;
        }
        public String getImageUrl() {
            return this.imageUrl;
        }

        public DescribeStudioLayoutsResponseBodyStudioLayoutsBgImageConfig setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

    public static class DescribeStudioLayoutsResponseBodyStudioLayoutsScreenInputConfigList extends TeaModel {
        @NameInMap("PortraitType")
        public Integer portraitType;

        @NameInMap("Index")
        public Integer index;

        @NameInMap("PositionX")
        public String positionX;

        @NameInMap("Color")
        public String color;

        @NameInMap("HeightNormalized")
        public Float heightNormalized;

        @NameInMap("PositionY")
        public String positionY;

        @NameInMap("ChannelId")
        public String channelId;

        @NameInMap("VideoResourceId")
        public String videoResourceId;

        @NameInMap("Id")
        public String id;

        public static DescribeStudioLayoutsResponseBodyStudioLayoutsScreenInputConfigList build(java.util.Map<String, ?> map) throws Exception {
            DescribeStudioLayoutsResponseBodyStudioLayoutsScreenInputConfigList self = new DescribeStudioLayoutsResponseBodyStudioLayoutsScreenInputConfigList();
            return TeaModel.build(map, self);
        }

        public DescribeStudioLayoutsResponseBodyStudioLayoutsScreenInputConfigList setPortraitType(Integer portraitType) {
            this.portraitType = portraitType;
            return this;
        }
        public Integer getPortraitType() {
            return this.portraitType;
        }

        public DescribeStudioLayoutsResponseBodyStudioLayoutsScreenInputConfigList setIndex(Integer index) {
            this.index = index;
            return this;
        }
        public Integer getIndex() {
            return this.index;
        }

        public DescribeStudioLayoutsResponseBodyStudioLayoutsScreenInputConfigList setPositionX(String positionX) {
            this.positionX = positionX;
            return this;
        }
        public String getPositionX() {
            return this.positionX;
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

        public DescribeStudioLayoutsResponseBodyStudioLayoutsScreenInputConfigList setPositionY(String positionY) {
            this.positionY = positionY;
            return this;
        }
        public String getPositionY() {
            return this.positionY;
        }

        public DescribeStudioLayoutsResponseBodyStudioLayoutsScreenInputConfigList setChannelId(String channelId) {
            this.channelId = channelId;
            return this;
        }
        public String getChannelId() {
            return this.channelId;
        }

        public DescribeStudioLayoutsResponseBodyStudioLayoutsScreenInputConfigList setVideoResourceId(String videoResourceId) {
            this.videoResourceId = videoResourceId;
            return this;
        }
        public String getVideoResourceId() {
            return this.videoResourceId;
        }

        public DescribeStudioLayoutsResponseBodyStudioLayoutsScreenInputConfigList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

    public static class DescribeStudioLayoutsResponseBodyStudioLayoutsLayerOrderConfigList extends TeaModel {
        @NameInMap("Type")
        public String type;

        @NameInMap("Id")
        public String id;

        public static DescribeStudioLayoutsResponseBodyStudioLayoutsLayerOrderConfigList build(java.util.Map<String, ?> map) throws Exception {
            DescribeStudioLayoutsResponseBodyStudioLayoutsLayerOrderConfigList self = new DescribeStudioLayoutsResponseBodyStudioLayoutsLayerOrderConfigList();
            return TeaModel.build(map, self);
        }

        public DescribeStudioLayoutsResponseBodyStudioLayoutsLayerOrderConfigList setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public DescribeStudioLayoutsResponseBodyStudioLayoutsLayerOrderConfigList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

    public static class DescribeStudioLayoutsResponseBodyStudioLayoutsMediaInputConfigList extends TeaModel {
        @NameInMap("Index")
        public Integer index;

        @NameInMap("HeightNormalized")
        public Float heightNormalized;

        @NameInMap("FillMode")
        public String fillMode;

        @NameInMap("PositionRefer")
        public String positionRefer;

        @NameInMap("ChannelId")
        public String channelId;

        @NameInMap("PositionNormalized")
        public java.util.List<Float> positionNormalized;

        @NameInMap("VideoResourceId")
        public String videoResourceId;

        @NameInMap("WidthNormalized")
        public Float widthNormalized;

        @NameInMap("ImageMaterialId")
        public String imageMaterialId;

        @NameInMap("Id")
        public String id;

        public static DescribeStudioLayoutsResponseBodyStudioLayoutsMediaInputConfigList build(java.util.Map<String, ?> map) throws Exception {
            DescribeStudioLayoutsResponseBodyStudioLayoutsMediaInputConfigList self = new DescribeStudioLayoutsResponseBodyStudioLayoutsMediaInputConfigList();
            return TeaModel.build(map, self);
        }

        public DescribeStudioLayoutsResponseBodyStudioLayoutsMediaInputConfigList setIndex(Integer index) {
            this.index = index;
            return this;
        }
        public Integer getIndex() {
            return this.index;
        }

        public DescribeStudioLayoutsResponseBodyStudioLayoutsMediaInputConfigList setHeightNormalized(Float heightNormalized) {
            this.heightNormalized = heightNormalized;
            return this;
        }
        public Float getHeightNormalized() {
            return this.heightNormalized;
        }

        public DescribeStudioLayoutsResponseBodyStudioLayoutsMediaInputConfigList setFillMode(String fillMode) {
            this.fillMode = fillMode;
            return this;
        }
        public String getFillMode() {
            return this.fillMode;
        }

        public DescribeStudioLayoutsResponseBodyStudioLayoutsMediaInputConfigList setPositionRefer(String positionRefer) {
            this.positionRefer = positionRefer;
            return this;
        }
        public String getPositionRefer() {
            return this.positionRefer;
        }

        public DescribeStudioLayoutsResponseBodyStudioLayoutsMediaInputConfigList setChannelId(String channelId) {
            this.channelId = channelId;
            return this;
        }
        public String getChannelId() {
            return this.channelId;
        }

        public DescribeStudioLayoutsResponseBodyStudioLayoutsMediaInputConfigList setPositionNormalized(java.util.List<Float> positionNormalized) {
            this.positionNormalized = positionNormalized;
            return this;
        }
        public java.util.List<Float> getPositionNormalized() {
            return this.positionNormalized;
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

        public DescribeStudioLayoutsResponseBodyStudioLayoutsMediaInputConfigList setImageMaterialId(String imageMaterialId) {
            this.imageMaterialId = imageMaterialId;
            return this;
        }
        public String getImageMaterialId() {
            return this.imageMaterialId;
        }

        public DescribeStudioLayoutsResponseBodyStudioLayoutsMediaInputConfigList setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

    }

    public static class DescribeStudioLayoutsResponseBodyStudioLayoutsCommonConfig extends TeaModel {
        @NameInMap("ChannelId")
        public String channelId;

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

    public static class DescribeStudioLayoutsResponseBodyStudioLayouts extends TeaModel {
        @NameInMap("LayoutType")
        public String layoutType;

        @NameInMap("LayoutId")
        public String layoutId;

        @NameInMap("BgImageConfig")
        public DescribeStudioLayoutsResponseBodyStudioLayoutsBgImageConfig bgImageConfig;

        @NameInMap("ScreenInputConfigList")
        public java.util.List<DescribeStudioLayoutsResponseBodyStudioLayoutsScreenInputConfigList> screenInputConfigList;

        @NameInMap("LayoutName")
        public String layoutName;

        @NameInMap("LayerOrderConfigList")
        public java.util.List<DescribeStudioLayoutsResponseBodyStudioLayoutsLayerOrderConfigList> layerOrderConfigList;

        @NameInMap("MediaInputConfigList")
        public java.util.List<DescribeStudioLayoutsResponseBodyStudioLayoutsMediaInputConfigList> mediaInputConfigList;

        @NameInMap("CommonConfig")
        public DescribeStudioLayoutsResponseBodyStudioLayoutsCommonConfig commonConfig;

        public static DescribeStudioLayoutsResponseBodyStudioLayouts build(java.util.Map<String, ?> map) throws Exception {
            DescribeStudioLayoutsResponseBodyStudioLayouts self = new DescribeStudioLayoutsResponseBodyStudioLayouts();
            return TeaModel.build(map, self);
        }

        public DescribeStudioLayoutsResponseBodyStudioLayouts setLayoutType(String layoutType) {
            this.layoutType = layoutType;
            return this;
        }
        public String getLayoutType() {
            return this.layoutType;
        }

        public DescribeStudioLayoutsResponseBodyStudioLayouts setLayoutId(String layoutId) {
            this.layoutId = layoutId;
            return this;
        }
        public String getLayoutId() {
            return this.layoutId;
        }

        public DescribeStudioLayoutsResponseBodyStudioLayouts setBgImageConfig(DescribeStudioLayoutsResponseBodyStudioLayoutsBgImageConfig bgImageConfig) {
            this.bgImageConfig = bgImageConfig;
            return this;
        }
        public DescribeStudioLayoutsResponseBodyStudioLayoutsBgImageConfig getBgImageConfig() {
            return this.bgImageConfig;
        }

        public DescribeStudioLayoutsResponseBodyStudioLayouts setScreenInputConfigList(java.util.List<DescribeStudioLayoutsResponseBodyStudioLayoutsScreenInputConfigList> screenInputConfigList) {
            this.screenInputConfigList = screenInputConfigList;
            return this;
        }
        public java.util.List<DescribeStudioLayoutsResponseBodyStudioLayoutsScreenInputConfigList> getScreenInputConfigList() {
            return this.screenInputConfigList;
        }

        public DescribeStudioLayoutsResponseBodyStudioLayouts setLayoutName(String layoutName) {
            this.layoutName = layoutName;
            return this;
        }
        public String getLayoutName() {
            return this.layoutName;
        }

        public DescribeStudioLayoutsResponseBodyStudioLayouts setLayerOrderConfigList(java.util.List<DescribeStudioLayoutsResponseBodyStudioLayoutsLayerOrderConfigList> layerOrderConfigList) {
            this.layerOrderConfigList = layerOrderConfigList;
            return this;
        }
        public java.util.List<DescribeStudioLayoutsResponseBodyStudioLayoutsLayerOrderConfigList> getLayerOrderConfigList() {
            return this.layerOrderConfigList;
        }

        public DescribeStudioLayoutsResponseBodyStudioLayouts setMediaInputConfigList(java.util.List<DescribeStudioLayoutsResponseBodyStudioLayoutsMediaInputConfigList> mediaInputConfigList) {
            this.mediaInputConfigList = mediaInputConfigList;
            return this;
        }
        public java.util.List<DescribeStudioLayoutsResponseBodyStudioLayoutsMediaInputConfigList> getMediaInputConfigList() {
            return this.mediaInputConfigList;
        }

        public DescribeStudioLayoutsResponseBodyStudioLayouts setCommonConfig(DescribeStudioLayoutsResponseBodyStudioLayoutsCommonConfig commonConfig) {
            this.commonConfig = commonConfig;
            return this;
        }
        public DescribeStudioLayoutsResponseBodyStudioLayoutsCommonConfig getCommonConfig() {
            return this.commonConfig;
        }

    }

}
