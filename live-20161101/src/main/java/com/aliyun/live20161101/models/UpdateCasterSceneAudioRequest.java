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
     * <li><p>If you create a production studio by calling the <a href="https://help.aliyun.com/document_detail/2848009.html">CreateCaster</a> operation, you can obtain the ID from the CasterId parameter in the response.</p>
     * </li>
     * <li><p>If you create a production studio in the LIVE console, go to the <strong>LIVE Console</strong> &gt; <strong>Production Studio</strong> &gt; <strong>Cloud Production Studio</strong> page to view the ID.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>The name of the production studio in the list on the Cloud Production Studio page is the ID of the production studio.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>LIVEPRODUCER_POST-cn-0pp1czt****</p>
     */
    @NameInMap("CasterId")
    public String casterId;

    /**
     * <p>Specifies whether to enable the AFV mode. If you leave this parameter empty, the last configuration is retained. Valid values:</p>
     * <ul>
     * <li><p><strong>0</strong>: audio mixing mode.</p>
     * </li>
     * <li><p><strong>1</strong>: audio-follows-video mode.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("FollowEnable")
    public Integer followEnable;

    /**
     * <p>The list of associated location IDs. The order of the location IDs must be the same as the order of the audio layers.</p>
     * 
     * <strong>example:</strong>
     * <p>RV01</p>
     */
    @NameInMap("MixList")
    public java.util.List<String> mixList;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The ID of the region.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the scene. If you query the list of scenes in a production studio by calling the <a href="https://help.aliyun.com/document_detail/2848039.html">DescribeCasterScenes</a> operation, you can obtain the ID from the ComponentId parameter in the response.</p>
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
         * <p>Specifies whether to enable the features provided by the 3A audio algorithm. This parameter consists of the following fields:</p>
         * <ul>
         * <li><p><strong>enableAgc</strong>: (Optional) Specifies whether to enable the automatic gain control (AGC) feature of the 3A algorithm. Valid values: <strong>0</strong> (disabled, default) and <strong>1</strong> (enabled).</p>
         * </li>
         * <li><p><strong>enableAns</strong>: (Optional) Specifies whether to enable the intelligent noise reduction feature of the 3A algorithm. Valid values: <strong>0</strong> (disabled, default) and <strong>1</strong> (enabled).</p>
         * </li>
         * <li><p><strong>ansMode</strong>: (Optional) The mode of the intelligent noise reduction feature. This field is active only when <strong>enableAns</strong> is set to <strong>1</strong>. Valid values: <strong>0</strong> (speech noise reduction, default) and <strong>1</strong> (music noise reduction).</p>
         * </li>
         * </ul>
         * <blockquote>
         * <p>For better noise reduction, set ansMode to 1.</p>
         * </blockquote>
         * <ul>
         * <li><p><strong>enableBeautify</strong>: (Optional) Specifies whether to enable voice beautification. Valid values: <strong>0</strong> (disabled, default) and <strong>1</strong> (enabled).</p>
         * </li>
         * <li><p><strong>voiceBeautifyMode</strong>: (Optional) The voice beautification mode. This field is active only when <strong>enableBeautify</strong> is set to <strong>1</strong>. Valid values: <strong>0</strong> (magnetic male voice, default) and <strong>1</strong> (fresh female voice).</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{   &quot;enableAgc&quot;:0,   &quot;enableAns&quot;:1 }</p>
         */
        @NameInMap("Filter")
        public String filter;

        /**
         * <p>The fixed latency of the audio layer. This parameter is used to synchronize the audio with captions.</p>
         * <p>Unit: milliseconds. Valid values: 0 to <strong>5000</strong>. Default value: <strong>0</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("FixedDelayDuration")
        public Integer fixedDelayDuration;

        /**
         * <p>The sound channels that are used for volume input. Valid values:</p>
         * <ul>
         * <li><p><strong>leftChannel</strong>: the left sound channel.</p>
         * </li>
         * <li><p><strong>rightChannel</strong>: the right sound channel.</p>
         * </li>
         * <li><p><strong>all</strong> (default): both sound channels.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>all</p>
         */
        @NameInMap("ValidChannel")
        public String validChannel;

        /**
         * <p>The volume multiplier for the audio stream. Valid values: 0 to <strong>10.0</strong>. Default value: <strong>1.0</strong>.</p>
         * <ul>
         * <li><p><strong>1.0</strong>: The original volume is used.</p>
         * </li>
         * <li><p>A value less than <strong>1</strong> decreases the volume.</p>
         * </li>
         * <li><p>A value greater than <strong>1</strong> increases the volume.</p>
         * </li>
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
