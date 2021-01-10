// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeCasterSceneAudioResponseBody extends TeaModel {
    @NameInMap("MixList")
    public DescribeCasterSceneAudioResponseBodyMixList mixList;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("AudioLayers")
    public DescribeCasterSceneAudioResponseBodyAudioLayers audioLayers;

    @NameInMap("CasterId")
    public String casterId;

    @NameInMap("FollowEnable")
    public Integer followEnable;

    public static DescribeCasterSceneAudioResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCasterSceneAudioResponseBody self = new DescribeCasterSceneAudioResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCasterSceneAudioResponseBody setMixList(DescribeCasterSceneAudioResponseBodyMixList mixList) {
        this.mixList = mixList;
        return this;
    }
    public DescribeCasterSceneAudioResponseBodyMixList getMixList() {
        return this.mixList;
    }

    public DescribeCasterSceneAudioResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeCasterSceneAudioResponseBody setAudioLayers(DescribeCasterSceneAudioResponseBodyAudioLayers audioLayers) {
        this.audioLayers = audioLayers;
        return this;
    }
    public DescribeCasterSceneAudioResponseBodyAudioLayers getAudioLayers() {
        return this.audioLayers;
    }

    public DescribeCasterSceneAudioResponseBody setCasterId(String casterId) {
        this.casterId = casterId;
        return this;
    }
    public String getCasterId() {
        return this.casterId;
    }

    public DescribeCasterSceneAudioResponseBody setFollowEnable(Integer followEnable) {
        this.followEnable = followEnable;
        return this;
    }
    public Integer getFollowEnable() {
        return this.followEnable;
    }

    public static class DescribeCasterSceneAudioResponseBodyMixList extends TeaModel {
        @NameInMap("LocationId")
        public java.util.List<String> locationId;

        public static DescribeCasterSceneAudioResponseBodyMixList build(java.util.Map<String, ?> map) throws Exception {
            DescribeCasterSceneAudioResponseBodyMixList self = new DescribeCasterSceneAudioResponseBodyMixList();
            return TeaModel.build(map, self);
        }

        public DescribeCasterSceneAudioResponseBodyMixList setLocationId(java.util.List<String> locationId) {
            this.locationId = locationId;
            return this;
        }
        public java.util.List<String> getLocationId() {
            return this.locationId;
        }

    }

    public static class DescribeCasterSceneAudioResponseBodyAudioLayersAudioLayer extends TeaModel {
        @NameInMap("VolumeRate")
        public Float volumeRate;

        @NameInMap("FixedDelayDuration")
        public Integer fixedDelayDuration;

        @NameInMap("ValidChannel")
        public String validChannel;

        public static DescribeCasterSceneAudioResponseBodyAudioLayersAudioLayer build(java.util.Map<String, ?> map) throws Exception {
            DescribeCasterSceneAudioResponseBodyAudioLayersAudioLayer self = new DescribeCasterSceneAudioResponseBodyAudioLayersAudioLayer();
            return TeaModel.build(map, self);
        }

        public DescribeCasterSceneAudioResponseBodyAudioLayersAudioLayer setVolumeRate(Float volumeRate) {
            this.volumeRate = volumeRate;
            return this;
        }
        public Float getVolumeRate() {
            return this.volumeRate;
        }

        public DescribeCasterSceneAudioResponseBodyAudioLayersAudioLayer setFixedDelayDuration(Integer fixedDelayDuration) {
            this.fixedDelayDuration = fixedDelayDuration;
            return this;
        }
        public Integer getFixedDelayDuration() {
            return this.fixedDelayDuration;
        }

        public DescribeCasterSceneAudioResponseBodyAudioLayersAudioLayer setValidChannel(String validChannel) {
            this.validChannel = validChannel;
            return this;
        }
        public String getValidChannel() {
            return this.validChannel;
        }

    }

    public static class DescribeCasterSceneAudioResponseBodyAudioLayers extends TeaModel {
        @NameInMap("AudioLayer")
        public java.util.List<DescribeCasterSceneAudioResponseBodyAudioLayersAudioLayer> audioLayer;

        public static DescribeCasterSceneAudioResponseBodyAudioLayers build(java.util.Map<String, ?> map) throws Exception {
            DescribeCasterSceneAudioResponseBodyAudioLayers self = new DescribeCasterSceneAudioResponseBodyAudioLayers();
            return TeaModel.build(map, self);
        }

        public DescribeCasterSceneAudioResponseBodyAudioLayers setAudioLayer(java.util.List<DescribeCasterSceneAudioResponseBodyAudioLayersAudioLayer> audioLayer) {
            this.audioLayer = audioLayer;
            return this;
        }
        public java.util.List<DescribeCasterSceneAudioResponseBodyAudioLayersAudioLayer> getAudioLayer() {
            return this.audioLayer;
        }

    }

}
