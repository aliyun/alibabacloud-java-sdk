// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeCasterSceneAudioResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("CasterId")
    @Validation(required = true)
    public String casterId;

    @NameInMap("FollowEnable")
    @Validation(required = true)
    public Integer followEnable;

    @NameInMap("AudioLayers")
    @Validation(required = true)
    public DescribeCasterSceneAudioResponseAudioLayers audioLayers;

    @NameInMap("MixList")
    @Validation(required = true)
    public DescribeCasterSceneAudioResponseMixList mixList;

    public static DescribeCasterSceneAudioResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeCasterSceneAudioResponse self = new DescribeCasterSceneAudioResponse();
        return TeaModel.build(map, self);
    }

    public DescribeCasterSceneAudioResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCasterSceneAudioResponse setCasterId(String casterId) {
        this.casterId = casterId;
        return this;
    }
    public String getCasterId() {
        return this.casterId;
    }

    public DescribeCasterSceneAudioResponse setFollowEnable(Integer followEnable) {
        this.followEnable = followEnable;
        return this;
    }
    public Integer getFollowEnable() {
        return this.followEnable;
    }

    public DescribeCasterSceneAudioResponse setAudioLayers(DescribeCasterSceneAudioResponseAudioLayers audioLayers) {
        this.audioLayers = audioLayers;
        return this;
    }
    public DescribeCasterSceneAudioResponseAudioLayers getAudioLayers() {
        return this.audioLayers;
    }

    public DescribeCasterSceneAudioResponse setMixList(DescribeCasterSceneAudioResponseMixList mixList) {
        this.mixList = mixList;
        return this;
    }
    public DescribeCasterSceneAudioResponseMixList getMixList() {
        return this.mixList;
    }

    public static class DescribeCasterSceneAudioResponseAudioLayersAudioLayer extends TeaModel {
        @NameInMap("VolumeRate")
        @Validation(required = true)
        public Float volumeRate;

        @NameInMap("ValidChannel")
        @Validation(required = true)
        public String validChannel;

        @NameInMap("FixedDelayDuration")
        @Validation(required = true)
        public Integer fixedDelayDuration;

        public static DescribeCasterSceneAudioResponseAudioLayersAudioLayer build(java.util.Map<String, ?> map) throws Exception {
            DescribeCasterSceneAudioResponseAudioLayersAudioLayer self = new DescribeCasterSceneAudioResponseAudioLayersAudioLayer();
            return TeaModel.build(map, self);
        }

        public DescribeCasterSceneAudioResponseAudioLayersAudioLayer setVolumeRate(Float volumeRate) {
            this.volumeRate = volumeRate;
            return this;
        }
        public Float getVolumeRate() {
            return this.volumeRate;
        }

        public DescribeCasterSceneAudioResponseAudioLayersAudioLayer setValidChannel(String validChannel) {
            this.validChannel = validChannel;
            return this;
        }
        public String getValidChannel() {
            return this.validChannel;
        }

        public DescribeCasterSceneAudioResponseAudioLayersAudioLayer setFixedDelayDuration(Integer fixedDelayDuration) {
            this.fixedDelayDuration = fixedDelayDuration;
            return this;
        }
        public Integer getFixedDelayDuration() {
            return this.fixedDelayDuration;
        }

    }

    public static class DescribeCasterSceneAudioResponseAudioLayers extends TeaModel {
        @NameInMap("AudioLayer")
        @Validation(required = true)
        public java.util.List<DescribeCasterSceneAudioResponseAudioLayersAudioLayer> audioLayer;

        public static DescribeCasterSceneAudioResponseAudioLayers build(java.util.Map<String, ?> map) throws Exception {
            DescribeCasterSceneAudioResponseAudioLayers self = new DescribeCasterSceneAudioResponseAudioLayers();
            return TeaModel.build(map, self);
        }

        public DescribeCasterSceneAudioResponseAudioLayers setAudioLayer(java.util.List<DescribeCasterSceneAudioResponseAudioLayersAudioLayer> audioLayer) {
            this.audioLayer = audioLayer;
            return this;
        }
        public java.util.List<DescribeCasterSceneAudioResponseAudioLayersAudioLayer> getAudioLayer() {
            return this.audioLayer;
        }

    }

    public static class DescribeCasterSceneAudioResponseMixList extends TeaModel {
        @NameInMap("LocationId")
        @Validation(required = true)
        public java.util.List<String> locationId;

        public static DescribeCasterSceneAudioResponseMixList build(java.util.Map<String, ?> map) throws Exception {
            DescribeCasterSceneAudioResponseMixList self = new DescribeCasterSceneAudioResponseMixList();
            return TeaModel.build(map, self);
        }

        public DescribeCasterSceneAudioResponseMixList setLocationId(java.util.List<String> locationId) {
            this.locationId = locationId;
            return this;
        }
        public java.util.List<String> getLocationId() {
            return this.locationId;
        }

    }

}
