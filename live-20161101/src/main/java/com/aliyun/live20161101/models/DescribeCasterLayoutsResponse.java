// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeCasterLayoutsResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Total")
    @Validation(required = true)
    public Integer total;

    @NameInMap("Layouts")
    @Validation(required = true)
    public DescribeCasterLayoutsResponseLayouts layouts;

    public static DescribeCasterLayoutsResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCasterLayoutsResponse self = new DescribeCasterLayoutsResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCasterLayoutsResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCasterLayoutsResponse setTotal(Integer total) {
        this.total = total;
        return this;
    }
    public Integer getTotal() {
        return this.total;
    }

    public DescribeCasterLayoutsResponse setLayouts(DescribeCasterLayoutsResponseLayouts layouts) {
        this.layouts = layouts;
        return this;
    }
    public DescribeCasterLayoutsResponseLayouts getLayouts() {
        return this.layouts;
    }

    public static class DescribeCasterLayoutsResponseLayoutsLayoutVideoLayersVideoLayerPositionNormalizeds extends TeaModel {
        // Position
        @NameInMap("Position")
        @Validation(required = true)
        public java.util.List<Float> position;

        public static DescribeCasterLayoutsResponseLayoutsLayoutVideoLayersVideoLayerPositionNormalizeds build(java.util.Map<String, ?> map) throws Exception {
            DescribeCasterLayoutsResponseLayoutsLayoutVideoLayersVideoLayerPositionNormalizeds self = new DescribeCasterLayoutsResponseLayoutsLayoutVideoLayersVideoLayerPositionNormalizeds();
            return TeaModel.build(map, self);
        }

        public DescribeCasterLayoutsResponseLayoutsLayoutVideoLayersVideoLayerPositionNormalizeds setPosition(java.util.List<Float> position) {
            this.position = position;
            return this;
        }
        public java.util.List<Float> getPosition() {
            return this.position;
        }

    }

    public static class DescribeCasterLayoutsResponseLayoutsLayoutVideoLayersVideoLayer extends TeaModel {
        @NameInMap("FillMode")
        @Validation(required = true)
        public String fillMode;

        @NameInMap("HeightNormalized")
        @Validation(required = true)
        public Float heightNormalized;

        @NameInMap("WidthNormalized")
        @Validation(required = true)
        public Float widthNormalized;

        @NameInMap("PositionRefer")
        @Validation(required = true)
        public String positionRefer;

        @NameInMap("FixedDelayDuration")
        @Validation(required = true)
        public Integer fixedDelayDuration;

        @NameInMap("PositionNormalizeds")
        @Validation(required = true)
        public DescribeCasterLayoutsResponseLayoutsLayoutVideoLayersVideoLayerPositionNormalizeds positionNormalizeds;

        public static DescribeCasterLayoutsResponseLayoutsLayoutVideoLayersVideoLayer build(java.util.Map<String, ?> map) throws Exception {
            DescribeCasterLayoutsResponseLayoutsLayoutVideoLayersVideoLayer self = new DescribeCasterLayoutsResponseLayoutsLayoutVideoLayersVideoLayer();
            return TeaModel.build(map, self);
        }

        public DescribeCasterLayoutsResponseLayoutsLayoutVideoLayersVideoLayer setFillMode(String fillMode) {
            this.fillMode = fillMode;
            return this;
        }
        public String getFillMode() {
            return this.fillMode;
        }

        public DescribeCasterLayoutsResponseLayoutsLayoutVideoLayersVideoLayer setHeightNormalized(Float heightNormalized) {
            this.heightNormalized = heightNormalized;
            return this;
        }
        public Float getHeightNormalized() {
            return this.heightNormalized;
        }

        public DescribeCasterLayoutsResponseLayoutsLayoutVideoLayersVideoLayer setWidthNormalized(Float widthNormalized) {
            this.widthNormalized = widthNormalized;
            return this;
        }
        public Float getWidthNormalized() {
            return this.widthNormalized;
        }

        public DescribeCasterLayoutsResponseLayoutsLayoutVideoLayersVideoLayer setPositionRefer(String positionRefer) {
            this.positionRefer = positionRefer;
            return this;
        }
        public String getPositionRefer() {
            return this.positionRefer;
        }

        public DescribeCasterLayoutsResponseLayoutsLayoutVideoLayersVideoLayer setFixedDelayDuration(Integer fixedDelayDuration) {
            this.fixedDelayDuration = fixedDelayDuration;
            return this;
        }
        public Integer getFixedDelayDuration() {
            return this.fixedDelayDuration;
        }

        public DescribeCasterLayoutsResponseLayoutsLayoutVideoLayersVideoLayer setPositionNormalizeds(DescribeCasterLayoutsResponseLayoutsLayoutVideoLayersVideoLayerPositionNormalizeds positionNormalizeds) {
            this.positionNormalizeds = positionNormalizeds;
            return this;
        }
        public DescribeCasterLayoutsResponseLayoutsLayoutVideoLayersVideoLayerPositionNormalizeds getPositionNormalizeds() {
            return this.positionNormalizeds;
        }

    }

    public static class DescribeCasterLayoutsResponseLayoutsLayoutVideoLayers extends TeaModel {
        @NameInMap("VideoLayer")
        @Validation(required = true)
        public java.util.List<DescribeCasterLayoutsResponseLayoutsLayoutVideoLayersVideoLayer> videoLayer;

        public static DescribeCasterLayoutsResponseLayoutsLayoutVideoLayers build(java.util.Map<String, ?> map) throws Exception {
            DescribeCasterLayoutsResponseLayoutsLayoutVideoLayers self = new DescribeCasterLayoutsResponseLayoutsLayoutVideoLayers();
            return TeaModel.build(map, self);
        }

        public DescribeCasterLayoutsResponseLayoutsLayoutVideoLayers setVideoLayer(java.util.List<DescribeCasterLayoutsResponseLayoutsLayoutVideoLayersVideoLayer> videoLayer) {
            this.videoLayer = videoLayer;
            return this;
        }
        public java.util.List<DescribeCasterLayoutsResponseLayoutsLayoutVideoLayersVideoLayer> getVideoLayer() {
            return this.videoLayer;
        }

    }

    public static class DescribeCasterLayoutsResponseLayoutsLayoutAudioLayersAudioLayer extends TeaModel {
        @NameInMap("VolumeRate")
        @Validation(required = true)
        public Float volumeRate;

        @NameInMap("ValidChannel")
        @Validation(required = true)
        public String validChannel;

        @NameInMap("FixedDelayDuration")
        @Validation(required = true)
        public Integer fixedDelayDuration;

        public static DescribeCasterLayoutsResponseLayoutsLayoutAudioLayersAudioLayer build(java.util.Map<String, ?> map) throws Exception {
            DescribeCasterLayoutsResponseLayoutsLayoutAudioLayersAudioLayer self = new DescribeCasterLayoutsResponseLayoutsLayoutAudioLayersAudioLayer();
            return TeaModel.build(map, self);
        }

        public DescribeCasterLayoutsResponseLayoutsLayoutAudioLayersAudioLayer setVolumeRate(Float volumeRate) {
            this.volumeRate = volumeRate;
            return this;
        }
        public Float getVolumeRate() {
            return this.volumeRate;
        }

        public DescribeCasterLayoutsResponseLayoutsLayoutAudioLayersAudioLayer setValidChannel(String validChannel) {
            this.validChannel = validChannel;
            return this;
        }
        public String getValidChannel() {
            return this.validChannel;
        }

        public DescribeCasterLayoutsResponseLayoutsLayoutAudioLayersAudioLayer setFixedDelayDuration(Integer fixedDelayDuration) {
            this.fixedDelayDuration = fixedDelayDuration;
            return this;
        }
        public Integer getFixedDelayDuration() {
            return this.fixedDelayDuration;
        }

    }

    public static class DescribeCasterLayoutsResponseLayoutsLayoutAudioLayers extends TeaModel {
        @NameInMap("AudioLayer")
        @Validation(required = true)
        public java.util.List<DescribeCasterLayoutsResponseLayoutsLayoutAudioLayersAudioLayer> audioLayer;

        public static DescribeCasterLayoutsResponseLayoutsLayoutAudioLayers build(java.util.Map<String, ?> map) throws Exception {
            DescribeCasterLayoutsResponseLayoutsLayoutAudioLayers self = new DescribeCasterLayoutsResponseLayoutsLayoutAudioLayers();
            return TeaModel.build(map, self);
        }

        public DescribeCasterLayoutsResponseLayoutsLayoutAudioLayers setAudioLayer(java.util.List<DescribeCasterLayoutsResponseLayoutsLayoutAudioLayersAudioLayer> audioLayer) {
            this.audioLayer = audioLayer;
            return this;
        }
        public java.util.List<DescribeCasterLayoutsResponseLayoutsLayoutAudioLayersAudioLayer> getAudioLayer() {
            return this.audioLayer;
        }

    }

    public static class DescribeCasterLayoutsResponseLayoutsLayoutBlendList extends TeaModel {
        // LocationId
        @NameInMap("LocationId")
        @Validation(required = true)
        public java.util.List<String> locationId;

        public static DescribeCasterLayoutsResponseLayoutsLayoutBlendList build(java.util.Map<String, ?> map) throws Exception {
            DescribeCasterLayoutsResponseLayoutsLayoutBlendList self = new DescribeCasterLayoutsResponseLayoutsLayoutBlendList();
            return TeaModel.build(map, self);
        }

        public DescribeCasterLayoutsResponseLayoutsLayoutBlendList setLocationId(java.util.List<String> locationId) {
            this.locationId = locationId;
            return this;
        }
        public java.util.List<String> getLocationId() {
            return this.locationId;
        }

    }

    public static class DescribeCasterLayoutsResponseLayoutsLayoutMixList extends TeaModel {
        // LocationId
        @NameInMap("LocationId")
        @Validation(required = true)
        public java.util.List<String> locationId;

        public static DescribeCasterLayoutsResponseLayoutsLayoutMixList build(java.util.Map<String, ?> map) throws Exception {
            DescribeCasterLayoutsResponseLayoutsLayoutMixList self = new DescribeCasterLayoutsResponseLayoutsLayoutMixList();
            return TeaModel.build(map, self);
        }

        public DescribeCasterLayoutsResponseLayoutsLayoutMixList setLocationId(java.util.List<String> locationId) {
            this.locationId = locationId;
            return this;
        }
        public java.util.List<String> getLocationId() {
            return this.locationId;
        }

    }

    public static class DescribeCasterLayoutsResponseLayoutsLayout extends TeaModel {
        @NameInMap("LayoutId")
        @Validation(required = true)
        public String layoutId;

        @NameInMap("VideoLayers")
        @Validation(required = true)
        public DescribeCasterLayoutsResponseLayoutsLayoutVideoLayers videoLayers;

        @NameInMap("AudioLayers")
        @Validation(required = true)
        public DescribeCasterLayoutsResponseLayoutsLayoutAudioLayers audioLayers;

        @NameInMap("BlendList")
        @Validation(required = true)
        public DescribeCasterLayoutsResponseLayoutsLayoutBlendList blendList;

        @NameInMap("MixList")
        @Validation(required = true)
        public DescribeCasterLayoutsResponseLayoutsLayoutMixList mixList;

        public static DescribeCasterLayoutsResponseLayoutsLayout build(java.util.Map<String, ?> map) throws Exception {
            DescribeCasterLayoutsResponseLayoutsLayout self = new DescribeCasterLayoutsResponseLayoutsLayout();
            return TeaModel.build(map, self);
        }

        public DescribeCasterLayoutsResponseLayoutsLayout setLayoutId(String layoutId) {
            this.layoutId = layoutId;
            return this;
        }
        public String getLayoutId() {
            return this.layoutId;
        }

        public DescribeCasterLayoutsResponseLayoutsLayout setVideoLayers(DescribeCasterLayoutsResponseLayoutsLayoutVideoLayers videoLayers) {
            this.videoLayers = videoLayers;
            return this;
        }
        public DescribeCasterLayoutsResponseLayoutsLayoutVideoLayers getVideoLayers() {
            return this.videoLayers;
        }

        public DescribeCasterLayoutsResponseLayoutsLayout setAudioLayers(DescribeCasterLayoutsResponseLayoutsLayoutAudioLayers audioLayers) {
            this.audioLayers = audioLayers;
            return this;
        }
        public DescribeCasterLayoutsResponseLayoutsLayoutAudioLayers getAudioLayers() {
            return this.audioLayers;
        }

        public DescribeCasterLayoutsResponseLayoutsLayout setBlendList(DescribeCasterLayoutsResponseLayoutsLayoutBlendList blendList) {
            this.blendList = blendList;
            return this;
        }
        public DescribeCasterLayoutsResponseLayoutsLayoutBlendList getBlendList() {
            return this.blendList;
        }

        public DescribeCasterLayoutsResponseLayoutsLayout setMixList(DescribeCasterLayoutsResponseLayoutsLayoutMixList mixList) {
            this.mixList = mixList;
            return this;
        }
        public DescribeCasterLayoutsResponseLayoutsLayoutMixList getMixList() {
            return this.mixList;
        }

    }

    public static class DescribeCasterLayoutsResponseLayouts extends TeaModel {
        @NameInMap("Layout")
        @Validation(required = true)
        public java.util.List<DescribeCasterLayoutsResponseLayoutsLayout> layout;

        public static DescribeCasterLayoutsResponseLayouts build(java.util.Map<String, ?> map) throws Exception {
            DescribeCasterLayoutsResponseLayouts self = new DescribeCasterLayoutsResponseLayouts();
            return TeaModel.build(map, self);
        }

        public DescribeCasterLayoutsResponseLayouts setLayout(java.util.List<DescribeCasterLayoutsResponseLayoutsLayout> layout) {
            this.layout = layout;
            return this;
        }
        public java.util.List<DescribeCasterLayoutsResponseLayoutsLayout> getLayout() {
            return this.layout;
        }

    }

}
