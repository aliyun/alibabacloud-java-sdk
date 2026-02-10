// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeCasterSceneAudioResponseBody extends TeaModel {
    @NameInMap("AudioLayers")
    public DescribeCasterSceneAudioResponseBodyAudioLayers audioLayers;

    /**
     * <p>The ID of the production studio. You can specify the ID in a request to start a scene in the production studio.</p>
     * 
     * <strong>example:</strong>
     * <p>97df6b7f-3490-47d2-ac50-88338765****</p>
     */
    @NameInMap("CasterId")
    public String casterId;

    /**
     * <p>The audio mode. By default, the audio follows video (AFV) mode is used. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: the audio mixing mode</li>
     * <li><strong>1</strong>: the AFV mode</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("FollowEnable")
    public Integer followEnable;

    @NameInMap("MixList")
    public DescribeCasterSceneAudioResponseBodyMixList mixList;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>98745637-3490-47d2-ac50-883387567098</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeCasterSceneAudioResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCasterSceneAudioResponseBody self = new DescribeCasterSceneAudioResponseBody();
        return TeaModel.build(map, self);
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

    public static class DescribeCasterSceneAudioResponseBodyAudioLayersAudioLayer extends TeaModel {
        @NameInMap("FixedDelayDuration")
        public Integer fixedDelayDuration;

        @NameInMap("ValidChannel")
        public String validChannel;

        @NameInMap("VolumeRate")
        public Float volumeRate;

        public static DescribeCasterSceneAudioResponseBodyAudioLayersAudioLayer build(java.util.Map<String, ?> map) throws Exception {
            DescribeCasterSceneAudioResponseBodyAudioLayersAudioLayer self = new DescribeCasterSceneAudioResponseBodyAudioLayersAudioLayer();
            return TeaModel.build(map, self);
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

        public DescribeCasterSceneAudioResponseBodyAudioLayersAudioLayer setVolumeRate(Float volumeRate) {
            this.volumeRate = volumeRate;
            return this;
        }
        public Float getVolumeRate() {
            return this.volumeRate;
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

}
