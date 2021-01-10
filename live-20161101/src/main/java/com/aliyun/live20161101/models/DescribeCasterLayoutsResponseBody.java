// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeCasterLayoutsResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Layouts")
    public DescribeCasterLayoutsResponseBodyLayouts layouts;

    @NameInMap("Total")
    public Integer total;

    public static DescribeCasterLayoutsResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCasterLayoutsResponseBody self = new DescribeCasterLayoutsResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCasterLayoutsResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCasterLayoutsResponseBody setLayouts(DescribeCasterLayoutsResponseBodyLayouts layouts) {
        this.layouts = layouts;
        return this;
    }
    public DescribeCasterLayoutsResponseBodyLayouts getLayouts() {
        return this.layouts;
    }

    public DescribeCasterLayoutsResponseBody setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public static class DescribeCasterLayoutsResponseBodyLayoutsLayoutAudioLayersAudioLayer extends TeaModel {
        @NameInMap("VolumeRate")
        public Float volumeRate;

        @NameInMap("FixedDelayDuration")
        public Integer fixedDelayDuration;

        @NameInMap("ValidChannel")
        public String validChannel;

        public static DescribeCasterLayoutsResponseBodyLayoutsLayoutAudioLayersAudioLayer build(java.util.Map<String, ?> map) throws Exception {
            DescribeCasterLayoutsResponseBodyLayoutsLayoutAudioLayersAudioLayer self = new DescribeCasterLayoutsResponseBodyLayoutsLayoutAudioLayersAudioLayer();
            return TeaModel.build(map, self);
        }

        public DescribeCasterLayoutsResponseBodyLayoutsLayoutAudioLayersAudioLayer setVolumeRate(Float volumeRate) {
            this.volumeRate = volumeRate;
            return this;
        }
        public Float getVolumeRate() {
            return this.volumeRate;
        }

        public DescribeCasterLayoutsResponseBodyLayoutsLayoutAudioLayersAudioLayer setFixedDelayDuration(Integer fixedDelayDuration) {
            this.fixedDelayDuration = fixedDelayDuration;
            return this;
        }
        public Integer getFixedDelayDuration() {
            return this.fixedDelayDuration;
        }

        public DescribeCasterLayoutsResponseBodyLayoutsLayoutAudioLayersAudioLayer setValidChannel(String validChannel) {
            this.validChannel = validChannel;
            return this;
        }
        public String getValidChannel() {
            return this.validChannel;
        }

    }

    public static class DescribeCasterLayoutsResponseBodyLayoutsLayoutAudioLayers extends TeaModel {
        @NameInMap("AudioLayer")
        public java.util.List<DescribeCasterLayoutsResponseBodyLayoutsLayoutAudioLayersAudioLayer> audioLayer;

        public static DescribeCasterLayoutsResponseBodyLayoutsLayoutAudioLayers build(java.util.Map<String, ?> map) throws Exception {
            DescribeCasterLayoutsResponseBodyLayoutsLayoutAudioLayers self = new DescribeCasterLayoutsResponseBodyLayoutsLayoutAudioLayers();
            return TeaModel.build(map, self);
        }

        public DescribeCasterLayoutsResponseBodyLayoutsLayoutAudioLayers setAudioLayer(java.util.List<DescribeCasterLayoutsResponseBodyLayoutsLayoutAudioLayersAudioLayer> audioLayer) {
            this.audioLayer = audioLayer;
            return this;
        }
        public java.util.List<DescribeCasterLayoutsResponseBodyLayoutsLayoutAudioLayersAudioLayer> getAudioLayer() {
            return this.audioLayer;
        }

    }

    public static class DescribeCasterLayoutsResponseBodyLayoutsLayoutVideoLayersVideoLayerPositionNormalizeds extends TeaModel {
        @NameInMap("Position")
        public java.util.List<Float> position;

        public static DescribeCasterLayoutsResponseBodyLayoutsLayoutVideoLayersVideoLayerPositionNormalizeds build(java.util.Map<String, ?> map) throws Exception {
            DescribeCasterLayoutsResponseBodyLayoutsLayoutVideoLayersVideoLayerPositionNormalizeds self = new DescribeCasterLayoutsResponseBodyLayoutsLayoutVideoLayersVideoLayerPositionNormalizeds();
            return TeaModel.build(map, self);
        }

        public DescribeCasterLayoutsResponseBodyLayoutsLayoutVideoLayersVideoLayerPositionNormalizeds setPosition(java.util.List<Float> position) {
            this.position = position;
            return this;
        }
        public java.util.List<Float> getPosition() {
            return this.position;
        }

    }

    public static class DescribeCasterLayoutsResponseBodyLayoutsLayoutVideoLayersVideoLayer extends TeaModel {
        @NameInMap("FixedDelayDuration")
        public Integer fixedDelayDuration;

        @NameInMap("PositionNormalizeds")
        public DescribeCasterLayoutsResponseBodyLayoutsLayoutVideoLayersVideoLayerPositionNormalizeds positionNormalizeds;

        @NameInMap("HeightNormalized")
        public Float heightNormalized;

        @NameInMap("FillMode")
        public String fillMode;

        @NameInMap("PositionRefer")
        public String positionRefer;

        @NameInMap("WidthNormalized")
        public Float widthNormalized;

        public static DescribeCasterLayoutsResponseBodyLayoutsLayoutVideoLayersVideoLayer build(java.util.Map<String, ?> map) throws Exception {
            DescribeCasterLayoutsResponseBodyLayoutsLayoutVideoLayersVideoLayer self = new DescribeCasterLayoutsResponseBodyLayoutsLayoutVideoLayersVideoLayer();
            return TeaModel.build(map, self);
        }

        public DescribeCasterLayoutsResponseBodyLayoutsLayoutVideoLayersVideoLayer setFixedDelayDuration(Integer fixedDelayDuration) {
            this.fixedDelayDuration = fixedDelayDuration;
            return this;
        }
        public Integer getFixedDelayDuration() {
            return this.fixedDelayDuration;
        }

        public DescribeCasterLayoutsResponseBodyLayoutsLayoutVideoLayersVideoLayer setPositionNormalizeds(DescribeCasterLayoutsResponseBodyLayoutsLayoutVideoLayersVideoLayerPositionNormalizeds positionNormalizeds) {
            this.positionNormalizeds = positionNormalizeds;
            return this;
        }
        public DescribeCasterLayoutsResponseBodyLayoutsLayoutVideoLayersVideoLayerPositionNormalizeds getPositionNormalizeds() {
            return this.positionNormalizeds;
        }

        public DescribeCasterLayoutsResponseBodyLayoutsLayoutVideoLayersVideoLayer setHeightNormalized(Float heightNormalized) {
            this.heightNormalized = heightNormalized;
            return this;
        }
        public Float getHeightNormalized() {
            return this.heightNormalized;
        }

        public DescribeCasterLayoutsResponseBodyLayoutsLayoutVideoLayersVideoLayer setFillMode(String fillMode) {
            this.fillMode = fillMode;
            return this;
        }
        public String getFillMode() {
            return this.fillMode;
        }

        public DescribeCasterLayoutsResponseBodyLayoutsLayoutVideoLayersVideoLayer setPositionRefer(String positionRefer) {
            this.positionRefer = positionRefer;
            return this;
        }
        public String getPositionRefer() {
            return this.positionRefer;
        }

        public DescribeCasterLayoutsResponseBodyLayoutsLayoutVideoLayersVideoLayer setWidthNormalized(Float widthNormalized) {
            this.widthNormalized = widthNormalized;
            return this;
        }
        public Float getWidthNormalized() {
            return this.widthNormalized;
        }

    }

    public static class DescribeCasterLayoutsResponseBodyLayoutsLayoutVideoLayers extends TeaModel {
        @NameInMap("VideoLayer")
        public java.util.List<DescribeCasterLayoutsResponseBodyLayoutsLayoutVideoLayersVideoLayer> videoLayer;

        public static DescribeCasterLayoutsResponseBodyLayoutsLayoutVideoLayers build(java.util.Map<String, ?> map) throws Exception {
            DescribeCasterLayoutsResponseBodyLayoutsLayoutVideoLayers self = new DescribeCasterLayoutsResponseBodyLayoutsLayoutVideoLayers();
            return TeaModel.build(map, self);
        }

        public DescribeCasterLayoutsResponseBodyLayoutsLayoutVideoLayers setVideoLayer(java.util.List<DescribeCasterLayoutsResponseBodyLayoutsLayoutVideoLayersVideoLayer> videoLayer) {
            this.videoLayer = videoLayer;
            return this;
        }
        public java.util.List<DescribeCasterLayoutsResponseBodyLayoutsLayoutVideoLayersVideoLayer> getVideoLayer() {
            return this.videoLayer;
        }

    }

    public static class DescribeCasterLayoutsResponseBodyLayoutsLayoutMixList extends TeaModel {
        @NameInMap("LocationId")
        public java.util.List<String> locationId;

        public static DescribeCasterLayoutsResponseBodyLayoutsLayoutMixList build(java.util.Map<String, ?> map) throws Exception {
            DescribeCasterLayoutsResponseBodyLayoutsLayoutMixList self = new DescribeCasterLayoutsResponseBodyLayoutsLayoutMixList();
            return TeaModel.build(map, self);
        }

        public DescribeCasterLayoutsResponseBodyLayoutsLayoutMixList setLocationId(java.util.List<String> locationId) {
            this.locationId = locationId;
            return this;
        }
        public java.util.List<String> getLocationId() {
            return this.locationId;
        }

    }

    public static class DescribeCasterLayoutsResponseBodyLayoutsLayoutBlendList extends TeaModel {
        @NameInMap("LocationId")
        public java.util.List<String> locationId;

        public static DescribeCasterLayoutsResponseBodyLayoutsLayoutBlendList build(java.util.Map<String, ?> map) throws Exception {
            DescribeCasterLayoutsResponseBodyLayoutsLayoutBlendList self = new DescribeCasterLayoutsResponseBodyLayoutsLayoutBlendList();
            return TeaModel.build(map, self);
        }

        public DescribeCasterLayoutsResponseBodyLayoutsLayoutBlendList setLocationId(java.util.List<String> locationId) {
            this.locationId = locationId;
            return this;
        }
        public java.util.List<String> getLocationId() {
            return this.locationId;
        }

    }

    public static class DescribeCasterLayoutsResponseBodyLayoutsLayout extends TeaModel {
        @NameInMap("LayoutId")
        public String layoutId;

        @NameInMap("AudioLayers")
        public DescribeCasterLayoutsResponseBodyLayoutsLayoutAudioLayers audioLayers;

        @NameInMap("VideoLayers")
        public DescribeCasterLayoutsResponseBodyLayoutsLayoutVideoLayers videoLayers;

        @NameInMap("MixList")
        public DescribeCasterLayoutsResponseBodyLayoutsLayoutMixList mixList;

        @NameInMap("BlendList")
        public DescribeCasterLayoutsResponseBodyLayoutsLayoutBlendList blendList;

        public static DescribeCasterLayoutsResponseBodyLayoutsLayout build(java.util.Map<String, ?> map) throws Exception {
            DescribeCasterLayoutsResponseBodyLayoutsLayout self = new DescribeCasterLayoutsResponseBodyLayoutsLayout();
            return TeaModel.build(map, self);
        }

        public DescribeCasterLayoutsResponseBodyLayoutsLayout setLayoutId(String layoutId) {
            this.layoutId = layoutId;
            return this;
        }
        public String getLayoutId() {
            return this.layoutId;
        }

        public DescribeCasterLayoutsResponseBodyLayoutsLayout setAudioLayers(DescribeCasterLayoutsResponseBodyLayoutsLayoutAudioLayers audioLayers) {
            this.audioLayers = audioLayers;
            return this;
        }
        public DescribeCasterLayoutsResponseBodyLayoutsLayoutAudioLayers getAudioLayers() {
            return this.audioLayers;
        }

        public DescribeCasterLayoutsResponseBodyLayoutsLayout setVideoLayers(DescribeCasterLayoutsResponseBodyLayoutsLayoutVideoLayers videoLayers) {
            this.videoLayers = videoLayers;
            return this;
        }
        public DescribeCasterLayoutsResponseBodyLayoutsLayoutVideoLayers getVideoLayers() {
            return this.videoLayers;
        }

        public DescribeCasterLayoutsResponseBodyLayoutsLayout setMixList(DescribeCasterLayoutsResponseBodyLayoutsLayoutMixList mixList) {
            this.mixList = mixList;
            return this;
        }
        public DescribeCasterLayoutsResponseBodyLayoutsLayoutMixList getMixList() {
            return this.mixList;
        }

        public DescribeCasterLayoutsResponseBodyLayoutsLayout setBlendList(DescribeCasterLayoutsResponseBodyLayoutsLayoutBlendList blendList) {
            this.blendList = blendList;
            return this;
        }
        public DescribeCasterLayoutsResponseBodyLayoutsLayoutBlendList getBlendList() {
            return this.blendList;
        }

    }

    public static class DescribeCasterLayoutsResponseBodyLayouts extends TeaModel {
        @NameInMap("Layout")
        public java.util.List<DescribeCasterLayoutsResponseBodyLayoutsLayout> layout;

        public static DescribeCasterLayoutsResponseBodyLayouts build(java.util.Map<String, ?> map) throws Exception {
            DescribeCasterLayoutsResponseBodyLayouts self = new DescribeCasterLayoutsResponseBodyLayouts();
            return TeaModel.build(map, self);
        }

        public DescribeCasterLayoutsResponseBodyLayouts setLayout(java.util.List<DescribeCasterLayoutsResponseBodyLayoutsLayout> layout) {
            this.layout = layout;
            return this;
        }
        public java.util.List<DescribeCasterLayoutsResponseBodyLayoutsLayout> getLayout() {
            return this.layout;
        }

    }

}
