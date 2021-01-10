// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class ModifyCasterLayoutRequest extends TeaModel {
    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("CasterId")
    public String casterId;

    @NameInMap("LayoutId")
    public String layoutId;

    @NameInMap("VideoLayer")
    public java.util.List<ModifyCasterLayoutRequestVideoLayer> videoLayer;

    @NameInMap("AudioLayer")
    public java.util.List<ModifyCasterLayoutRequestAudioLayer> audioLayer;

    @NameInMap("BlendList")
    public java.util.List<String> blendList;

    @NameInMap("MixList")
    public java.util.List<String> mixList;

    public static ModifyCasterLayoutRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyCasterLayoutRequest self = new ModifyCasterLayoutRequest();
        return TeaModel.build(map, self);
    }

    public ModifyCasterLayoutRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
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

    public ModifyCasterLayoutRequest setVideoLayer(java.util.List<ModifyCasterLayoutRequestVideoLayer> videoLayer) {
        this.videoLayer = videoLayer;
        return this;
    }
    public java.util.List<ModifyCasterLayoutRequestVideoLayer> getVideoLayer() {
        return this.videoLayer;
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

    public ModifyCasterLayoutRequest setMixList(java.util.List<String> mixList) {
        this.mixList = mixList;
        return this;
    }
    public java.util.List<String> getMixList() {
        return this.mixList;
    }

    public static class ModifyCasterLayoutRequestVideoLayer extends TeaModel {
        @NameInMap("FixedDelayDuration")
        public Integer fixedDelayDuration;

        @NameInMap("HeightNormalized")
        public Float heightNormalized;

        @NameInMap("FillMode")
        public String fillMode;

        @NameInMap("PositionRefer")
        public String positionRefer;

        @NameInMap("PositionNormalized")
        public java.util.List<Integer> positionNormalized;

        @NameInMap("WidthNormalized")
        public Float widthNormalized;

        public static ModifyCasterLayoutRequestVideoLayer build(java.util.Map<String, ?> map) throws Exception {
            ModifyCasterLayoutRequestVideoLayer self = new ModifyCasterLayoutRequestVideoLayer();
            return TeaModel.build(map, self);
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

        public ModifyCasterLayoutRequestVideoLayer setFillMode(String fillMode) {
            this.fillMode = fillMode;
            return this;
        }
        public String getFillMode() {
            return this.fillMode;
        }

        public ModifyCasterLayoutRequestVideoLayer setPositionRefer(String positionRefer) {
            this.positionRefer = positionRefer;
            return this;
        }
        public String getPositionRefer() {
            return this.positionRefer;
        }

        public ModifyCasterLayoutRequestVideoLayer setPositionNormalized(java.util.List<Integer> positionNormalized) {
            this.positionNormalized = positionNormalized;
            return this;
        }
        public java.util.List<Integer> getPositionNormalized() {
            return this.positionNormalized;
        }

        public ModifyCasterLayoutRequestVideoLayer setWidthNormalized(Float widthNormalized) {
            this.widthNormalized = widthNormalized;
            return this;
        }
        public Float getWidthNormalized() {
            return this.widthNormalized;
        }

    }

    public static class ModifyCasterLayoutRequestAudioLayer extends TeaModel {
        @NameInMap("VolumeRate")
        public Float volumeRate;

        @NameInMap("FixedDelayDuration")
        public Integer fixedDelayDuration;

        @NameInMap("ValidChannel")
        public String validChannel;

        public static ModifyCasterLayoutRequestAudioLayer build(java.util.Map<String, ?> map) throws Exception {
            ModifyCasterLayoutRequestAudioLayer self = new ModifyCasterLayoutRequestAudioLayer();
            return TeaModel.build(map, self);
        }

        public ModifyCasterLayoutRequestAudioLayer setVolumeRate(Float volumeRate) {
            this.volumeRate = volumeRate;
            return this;
        }
        public Float getVolumeRate() {
            return this.volumeRate;
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

    }

}
