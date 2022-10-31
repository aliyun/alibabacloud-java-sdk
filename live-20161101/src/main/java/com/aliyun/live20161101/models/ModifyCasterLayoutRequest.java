// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class ModifyCasterLayoutRequest extends TeaModel {
    @NameInMap("AudioLayer")
    public java.util.List<ModifyCasterLayoutRequestAudioLayer> audioLayer;

    @NameInMap("BlendList")
    public java.util.List<String> blendList;

    @NameInMap("CasterId")
    public String casterId;

    @NameInMap("LayoutId")
    public String layoutId;

    @NameInMap("MixList")
    public java.util.List<String> mixList;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("VideoLayer")
    public java.util.List<ModifyCasterLayoutRequestVideoLayer> videoLayer;

    public static ModifyCasterLayoutRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyCasterLayoutRequest self = new ModifyCasterLayoutRequest();
        return TeaModel.build(map, self);
    }

    public ModifyCasterLayoutRequest setAudioLayer(java.util.List<ModifyCasterLayoutRequestAudioLayer> audioLayer) {
        this.audioLayer = audioLayer;
        return this;
    }
    public java.util.List<ModifyCasterLayoutRequestAudioLayer> getAudioLayer() {
        return this.audioLayer;
    }

    public ModifyCasterLayoutRequest setBlendList(java.util.List<String> blendList) {
        this.blendList = blendList;
        return this;
    }
    public java.util.List<String> getBlendList() {
        return this.blendList;
    }

    public ModifyCasterLayoutRequest setCasterId(String casterId) {
        this.casterId = casterId;
        return this;
    }
    public String getCasterId() {
        return this.casterId;
    }

    public ModifyCasterLayoutRequest setLayoutId(String layoutId) {
        this.layoutId = layoutId;
        return this;
    }
    public String getLayoutId() {
        return this.layoutId;
    }

    public ModifyCasterLayoutRequest setMixList(java.util.List<String> mixList) {
        this.mixList = mixList;
        return this;
    }
    public java.util.List<String> getMixList() {
        return this.mixList;
    }

    public ModifyCasterLayoutRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public ModifyCasterLayoutRequest setVideoLayer(java.util.List<ModifyCasterLayoutRequestVideoLayer> videoLayer) {
        this.videoLayer = videoLayer;
        return this;
    }
    public java.util.List<ModifyCasterLayoutRequestVideoLayer> getVideoLayer() {
        return this.videoLayer;
    }

    public static class ModifyCasterLayoutRequestAudioLayer extends TeaModel {
        @NameInMap("FixedDelayDuration")
        public Integer fixedDelayDuration;

        @NameInMap("ValidChannel")
        public String validChannel;

        @NameInMap("VolumeRate")
        public Float volumeRate;

        public static ModifyCasterLayoutRequestAudioLayer build(java.util.Map<String, ?> map) throws Exception {
            ModifyCasterLayoutRequestAudioLayer self = new ModifyCasterLayoutRequestAudioLayer();
            return TeaModel.build(map, self);
        }

        public ModifyCasterLayoutRequestAudioLayer setFixedDelayDuration(Integer fixedDelayDuration) {
            this.fixedDelayDuration = fixedDelayDuration;
            return this;
        }
        public Integer getFixedDelayDuration() {
            return this.fixedDelayDuration;
        }

        public ModifyCasterLayoutRequestAudioLayer setValidChannel(String validChannel) {
            this.validChannel = validChannel;
            return this;
        }
        public String getValidChannel() {
            return this.validChannel;
        }

        public ModifyCasterLayoutRequestAudioLayer setVolumeRate(Float volumeRate) {
            this.volumeRate = volumeRate;
            return this;
        }
        public Float getVolumeRate() {
            return this.volumeRate;
        }

    }

    public static class ModifyCasterLayoutRequestVideoLayer extends TeaModel {
        @NameInMap("FillMode")
        public String fillMode;

        @NameInMap("FixedDelayDuration")
        public Integer fixedDelayDuration;

        @NameInMap("HeightNormalized")
        public Float heightNormalized;

        @NameInMap("PositionNormalized")
        public java.util.List<Float> positionNormalized;

        @NameInMap("PositionRefer")
        public String positionRefer;

        @NameInMap("WidthNormalized")
        public Float widthNormalized;

        public static ModifyCasterLayoutRequestVideoLayer build(java.util.Map<String, ?> map) throws Exception {
            ModifyCasterLayoutRequestVideoLayer self = new ModifyCasterLayoutRequestVideoLayer();
            return TeaModel.build(map, self);
        }

        public ModifyCasterLayoutRequestVideoLayer setFillMode(String fillMode) {
            this.fillMode = fillMode;
            return this;
        }
        public String getFillMode() {
            return this.fillMode;
        }

        public ModifyCasterLayoutRequestVideoLayer setFixedDelayDuration(Integer fixedDelayDuration) {
            this.fixedDelayDuration = fixedDelayDuration;
            return this;
        }
        public Integer getFixedDelayDuration() {
            return this.fixedDelayDuration;
        }

        public ModifyCasterLayoutRequestVideoLayer setHeightNormalized(Float heightNormalized) {
            this.heightNormalized = heightNormalized;
            return this;
        }
        public Float getHeightNormalized() {
            return this.heightNormalized;
        }

        public ModifyCasterLayoutRequestVideoLayer setPositionNormalized(java.util.List<Float> positionNormalized) {
            this.positionNormalized = positionNormalized;
            return this;
        }
        public java.util.List<Float> getPositionNormalized() {
            return this.positionNormalized;
        }

        public ModifyCasterLayoutRequestVideoLayer setPositionRefer(String positionRefer) {
            this.positionRefer = positionRefer;
            return this;
        }
        public String getPositionRefer() {
            return this.positionRefer;
        }

        public ModifyCasterLayoutRequestVideoLayer setWidthNormalized(Float widthNormalized) {
            this.widthNormalized = widthNormalized;
            return this;
        }
        public Float getWidthNormalized() {
            return this.widthNormalized;
        }

    }

}
