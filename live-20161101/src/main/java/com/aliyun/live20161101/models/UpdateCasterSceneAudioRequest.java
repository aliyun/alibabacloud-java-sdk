// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class UpdateCasterSceneAudioRequest extends TeaModel {
    /**
     * <p>The audio configurations.</p>
     */
    @NameInMap("AudioLayer")
    public java.util.List<UpdateCasterSceneAudioRequestAudioLayer> audioLayer;

    /**
     * <p>The ID of the production studio.</p>
     * <ul>
     * <li>If the production studio was created by calling the <a href="https://help.aliyun.com/document_detail/2848009.html">CreateCaster</a> operation, check the value of the response parameter CasterId to obtain the ID.</li>
     * <li>If the production studio was created by using the ApsaraVideo Live console, obtain the ID on the <strong>Production Studio Management</strong> page. To go to the page, log on to the <strong>ApsaraVideo Live console</strong> and click <strong>Production Studios</strong> in the left-side navigation pane.</li>
     * </ul>
     * <blockquote>
     * <p> You can find the ID of the production studio in the Instance ID/Name column.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>LIVEPRODUCER_POST-cn-0pp1czt****</p>
     */
    @NameInMap("CasterId")
    public String casterId;

    /**
     * <p>The audio mode. By default, the AFV mode is used. If you do not specify this parameter, the scene retains the last configuration. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: the audio mixing mode.</li>
     * <li><strong>1</strong>: the AFV mode.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("FollowEnable")
    public Integer followEnable;

    /**
     * <p>The location IDs of the audio layers, which are in the same order as the audio layers.</p>
     * 
     * <strong>example:</strong>
     * <p>RV01</p>
     */
    @NameInMap("MixList")
    public java.util.List<String> mixList;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the scene. If you call the <a href="https://help.aliyun.com/document_detail/2848039.html">DescribeCasterScenes</a> operation to query scenes of the production studio, check the value of the response parameter ComponentId to obtain the ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>a2b8e671-2fe5-4642-a2ec-bf93880e1****</p>
     */
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

    public UpdateCasterSceneAudioRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateCasterSceneAudioRequest setSceneId(String sceneId) {
        this.sceneId = sceneId;
        return this;
    }
    public String getSceneId() {
        return this.sceneId;
    }

    public static class UpdateCasterSceneAudioRequestAudioLayer extends TeaModel {
        /**
         * <p>Specifies whether to enable the features provided by the audio 3A algorithms. This parameter consists of the following fields:</p>
         * <ul>
         * <li><strong>enableAgc</strong>: specifies whether to enable automatic gain control (AGC). This field is optional. Valid values: 0 and 1. <strong>0</strong> is the default value, which specifies that AGC is disabled. <strong>1</strong> specifies that AGC is enabled.</li>
         * <li><strong>enableAns</strong>: specifies whether to enable active noise suppression (ANS). This field is optional. Valid values: 0 and 1. <strong>0</strong> is the default value, which specifies that ANS is disabled. <strong>1</strong> specifies that ANS is enabled.</li>
         * <li><strong>ansMode</strong>: specifies the mode for ANS. This field is optional and takes effect only if you set <strong>enableAns</strong> to <strong>1</strong>. Valid values: 0 and 1. <strong>0</strong> is the default value, which specifies the speech noise reduction mode. <strong>1</strong> specifies the music noise reduction mode.</li>
         * </ul>
         * <blockquote>
         * <p> To ensure a better noise reduction effect, we recommend that you set ansMode to 1.</p>
         * </blockquote>
         * <ul>
         * <li><strong>enableBeautify</strong>: specifies whether to enable voice change. This field is optional. Valid values: 0 and 1. <strong>0</strong> is the default value, which specifies that voice change is disabled. <strong>1</strong> specifies that voice change is enabled.</li>
         * <li><strong>voiceBeautifyMode</strong>: specifies the mode for voice change. This field is optional and takes effect only if you set <strong>enableBeautify</strong> to <strong>1</strong>. Valid values: 0 and 1. <strong>0</strong> is the default value, which specifies the magnetic male voice mode. <strong>1</strong> specifies the fresh female voice mode.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{   &quot;enableAgc&quot;:0,   &quot;enableAns&quot;:1 }</p>
         */
        @NameInMap("Filter")
        public String filter;

        /**
         * <p>The fixed delay of the audio layer. This parameter is used to synchronize the audio with subtitles.</p>
         * <p>Unit: milliseconds. Valid values: <strong>0 to 5000</strong>. Default value: <strong>0</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("FixedDelayDuration")
        public Integer fixedDelayDuration;

        /**
         * <p>The sound channels that are used for volume input in the audio layer. Valid values:</p>
         * <ul>
         * <li><strong>leftChannel</strong>: the left channel</li>
         * <li><strong>rightChannel</strong>: the right channel</li>
         * <li><strong>all</strong> (default): both the left and right channels</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>all</p>
         */
        @NameInMap("ValidChannel")
        public String validChannel;

        /**
         * <p>The multiple of the original volume at which the audio layer plays audio. Valid values: <strong>0 to 10.0</strong>. Default value: <strong>1.0</strong>.</p>
         * <ul>
         * <li><strong>1.0</strong>: specifies that the audio layer plays audio at the original volume.</li>
         * <li>A value smaller than <strong>1</strong>: specifies that the audio layer plays audio at a volume that is less than the original volume.</li>
         * <li>A value greater than <strong>1</strong>: specifies that the audio layer plays audio at a volume that is more than the original volume.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("VolumeRate")
        public Float volumeRate;

        public static UpdateCasterSceneAudioRequestAudioLayer build(java.util.Map<String, ?> map) throws Exception {
            UpdateCasterSceneAudioRequestAudioLayer self = new UpdateCasterSceneAudioRequestAudioLayer();
            return TeaModel.build(map, self);
        }

        public UpdateCasterSceneAudioRequestAudioLayer setFilter(String filter) {
            this.filter = filter;
            return this;
        }
        public String getFilter() {
            return this.filter;
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
