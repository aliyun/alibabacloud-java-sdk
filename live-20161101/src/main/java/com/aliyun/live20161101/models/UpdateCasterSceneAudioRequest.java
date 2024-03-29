// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class UpdateCasterSceneAudioRequest extends TeaModel {
    @NameInMap("AudioLayer")
    public java.util.List<UpdateCasterSceneAudioRequestAudioLayer> audioLayer;

    @NameInMap("CasterId")
    public String casterId;

    @NameInMap("FollowEnable")
    public Integer followEnable;

    @NameInMap("MixList")
    public java.util.List<String> mixList;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("SceneId")
    public String sceneId;

    public static UpdateCasterSceneAudioRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateCasterSceneAudioRequest self = new UpdateCasterSceneAudioRequest();
        return TeaModel.build(map, self);
    }

    public UpdateCasterSceneAudioRequest setAudioLayer(java.util.List<UpdateCasterSceneAudioRequestAudioLayer> audioLayer) {
        this.audioLayer = audioLayer;
        return this;
    }
    public java.util.List<UpdateCasterSceneAudioRequestAudioLayer> getAudioLayer() {
        return this.audioLayer;
    }

    public UpdateCasterSceneAudioRequest setCasterId(String casterId) {
        this.casterId = casterId;
        return this;
    }
    public String getCasterId() {
        return this.casterId;
    }

    public UpdateCasterSceneAudioRequest setFollowEnable(Integer followEnable) {
        this.followEnable = followEnable;
        return this;
    }
    public Integer getFollowEnable() {
        return this.followEnable;
    }

    public UpdateCasterSceneAudioRequest setMixList(java.util.List<String> mixList) {
        this.mixList = mixList;
        return this;
    }
    public java.util.List<String> getMixList() {
        return this.mixList;
    }

    public UpdateCasterSceneAudioRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UpdateCasterSceneAudioRequest setSceneId(String sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public String getSceneId() {
        return this.sceneId;
    }

    public static class UpdateCasterSceneAudioRequestAudioLayer extends TeaModel {
        @NameInMap("FixedDelayDuration")
        public Integer fixedDelayDuration;

        @NameInMap("ValidChannel")
        public String validChannel;

        @NameInMap("VolumeRate")
        public Float volumeRate;

        public static UpdateCasterSceneAudioRequestAudioLayer build(java.util.Map<String, ?> map) throws Exception {
            UpdateCasterSceneAudioRequestAudioLayer self = new UpdateCasterSceneAudioRequestAudioLayer();
            return TeaModel.build(map, self);
        }

        public UpdateCasterSceneAudioRequestAudioLayer setFixedDelayDuration(Integer fixedDelayDuration) {
            this.fixedDelayDuration = fixedDelayDuration;
            return this;
        }
        public Integer getFixedDelayDuration() {
            return this.fixedDelayDuration;
        }

        public UpdateCasterSceneAudioRequestAudioLayer setValidChannel(String validChannel) {
            this.validChannel = validChannel;
            return this;
        }
        public String getValidChannel() {
            return this.validChannel;
        }

        public UpdateCasterSceneAudioRequestAudioLayer setVolumeRate(Float volumeRate) {
            this.volumeRate = volumeRate;
            return this;
        }
        public Float getVolumeRate() {
            return this.volumeRate;
        }

    }

}
