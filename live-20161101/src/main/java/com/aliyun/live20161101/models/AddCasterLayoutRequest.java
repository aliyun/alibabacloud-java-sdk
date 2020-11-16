// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class AddCasterLayoutRequest extends TeaModel {
    @NameInMap("CasterId")
    @Validation(required = true)
    public String casterId;

    @NameInMap("VideoLayer")
    @Validation(required = true)
    public java.util.List<AddCasterLayoutRequestVideoLayer> videoLayer;

    @NameInMap("AudioLayer")
    @Validation(required = true)
    public java.util.List<AddCasterLayoutRequestAudioLayer> audioLayer;

    @NameInMap("BlendList")
    @Validation(required = true)
    public java.util.List<String> blendList;

    @NameInMap("MixList")
    @Validation(required = true)
    public java.util.List<String> mixList;

    public static AddCasterLayoutRequest build(java.util.Map<String, ?> map) throws Exception {
        AddCasterLayoutRequest self = new AddCasterLayoutRequest();
        return TeaModel.build(map, self);
    }

    public AddCasterLayoutRequest setCasterId(String casterId) {
        this.casterId = casterId;
        return this;
    }
    public String getCasterId() {
        return this.casterId;
    }

    public AddCasterLayoutRequest setVideoLayer(java.util.List<AddCasterLayoutRequestVideoLayer> videoLayer) {
        this.videoLayer = videoLayer;
        return this;
    }
    public java.util.List<AddCasterLayoutRequestVideoLayer> getVideoLayer() {
        return this.videoLayer;
    }

    public AddCasterLayoutRequest setAudioLayer(java.util.List<AddCasterLayoutRequestAudioLayer> audioLayer) {
        this.audioLayer = audioLayer;
        return this;
    }
    public java.util.List<AddCasterLayoutRequestAudioLayer> getAudioLayer() {
        return this.audioLayer;
    }

    public AddCasterLayoutRequest setBlendList(java.util.List<String> blendList) {
        this.blendList = blendList;
        return this;
    }
    public java.util.List<String> getBlendList() {
        return this.blendList;
    }

    public AddCasterLayoutRequest setMixList(java.util.List<String> mixList) {
        this.mixList = mixList;
        return this;
    }
    public java.util.List<String> getMixList() {
        return this.mixList;
    }

    public static class AddCasterLayoutRequestVideoLayer extends TeaModel {
        @NameInMap("FillMode")
        public String fillMode;

        @NameInMap("HeightNormalized")
        public Float heightNormalized;

        @NameInMap("WidthNormalized")
        public Float widthNormalized;

        @NameInMap("PositionRefer")
        public String positionRefer;

        @NameInMap("PositionNormalized")
        public java.util.List<Float> positionNormalized;

        @NameInMap("FixedDelayDuration")
        public Integer fixedDelayDuration;

        public static AddCasterLayoutRequestVideoLayer build(java.util.Map<String, ?> map) throws Exception {
            AddCasterLayoutRequestVideoLayer self = new AddCasterLayoutRequestVideoLayer();
            return TeaModel.build(map, self);
        }

        public AddCasterLayoutRequestVideoLayer setFillMode(String fillMode) {
            this.fillMode = fillMode;
            return this;
        }
        public String getFillMode() {
            return this.fillMode;
        }

        public AddCasterLayoutRequestVideoLayer setHeightNormalized(Float heightNormalized) {
            this.heightNormalized = heightNormalized;
            return this;
        }
        public Float getHeightNormalized() {
            return this.heightNormalized;
        }

        public AddCasterLayoutRequestVideoLayer setWidthNormalized(Float widthNormalized) {
            this.widthNormalized = widthNormalized;
            return this;
        }
        public Float getWidthNormalized() {
            return this.widthNormalized;
        }

        public AddCasterLayoutRequestVideoLayer setPositionRefer(String positionRefer) {
            this.positionRefer = positionRefer;
            return this;
        }
        public String getPositionRefer() {
            return this.positionRefer;
        }

        public AddCasterLayoutRequestVideoLayer setPositionNormalized(java.util.List<Float> positionNormalized) {
            this.positionNormalized = positionNormalized;
            return this;
        }
        public java.util.List<Float> getPositionNormalized() {
            return this.positionNormalized;
        }

        public AddCasterLayoutRequestVideoLayer setFixedDelayDuration(Integer fixedDelayDuration) {
            this.fixedDelayDuration = fixedDelayDuration;
            return this;
        }
        public Integer getFixedDelayDuration() {
            return this.fixedDelayDuration;
        }

    }

    public static class AddCasterLayoutRequestAudioLayer extends TeaModel {
        @NameInMap("VolumeRate")
        public Float volumeRate;

        @NameInMap("ValidChannel")
        public String validChannel;

        @NameInMap("FixedDelayDuration")
        public Integer fixedDelayDuration;

        public static AddCasterLayoutRequestAudioLayer build(java.util.Map<String, ?> map) throws Exception {
            AddCasterLayoutRequestAudioLayer self = new AddCasterLayoutRequestAudioLayer();
            return TeaModel.build(map, self);
        }

        public AddCasterLayoutRequestAudioLayer setVolumeRate(Float volumeRate) {
            this.volumeRate = volumeRate;
            return this;
        }
        public Float getVolumeRate() {
            return this.volumeRate;
        }

        public AddCasterLayoutRequestAudioLayer setValidChannel(String validChannel) {
            this.validChannel = validChannel;
            return this;
        }
        public String getValidChannel() {
            return this.validChannel;
        }

        public AddCasterLayoutRequestAudioLayer setFixedDelayDuration(Integer fixedDelayDuration) {
            this.fixedDelayDuration = fixedDelayDuration;
            return this;
        }
        public Integer getFixedDelayDuration() {
            return this.fixedDelayDuration;
        }

    }

}
