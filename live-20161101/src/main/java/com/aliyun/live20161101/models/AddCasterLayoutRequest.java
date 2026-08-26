// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class AddCasterLayoutRequest extends TeaModel {
    /**
     * <p>The audio layouts.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("AudioLayer")
    public java.util.List<AddCasterLayoutRequestAudioLayer> audioLayer;

    /**
     * <p>The location IDs of the video sources. The order of the location IDs corresponds to the order of the video layers specified in the <strong>VideoLayer</strong> parameter. For more information about location IDs, see <a href="https://help.aliyun.com/document_detail/2848020.html">AddCasterVideoResource</a>.</p>
     * <p>For LocationId, see <a href="https://help.aliyun.com/document_detail/2848020.html">Add a video source</a>. This ID corresponds to the order of the VideoLayers elements.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>RV01</p>
     */
    @NameInMap("BlendList")
    public java.util.List<String> blendList;

    /**
     * <p>The ID of the production studio.</p>
     * <ul>
     * <li><p>If you create a production studio by calling the <a href="https://help.aliyun.com/document_detail/2848009.html">CreateCaster</a> operation, the CasterId is returned in the response.</p>
     * </li>
     * <li><p>If you create a production studio in the LIVE console, go to <strong>Production Studio</strong> &gt; <strong>Cloud Production Studio</strong> to view the name of the production studio.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>The name of the production studio on the Cloud Production Studio page is the ID of the production studio.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>LIVEPRODUCER_POST-cn-0pp1czt****</p>
     */
    @NameInMap("CasterId")
    public String casterId;

    /**
     * <p>The location IDs of the audio sources. The order of the location IDs corresponds to the order of the audio layers specified in the <strong>AudioLayer</strong> parameter. For more information about location IDs, see <a href="https://help.aliyun.com/document_detail/2848020.html">AddCasterVideoResource</a>.</p>
     * <p>For \<code>LocationId\\</code>, see <a href="https://help.aliyun.com/document_detail/2848020.html">Add a video source</a>. It corresponds to the order of the \<code>AudioLayers\\</code> elements.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>RV01</p>
     */
    @NameInMap("MixList")
    public java.util.List<String> mixList;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The video layouts.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("VideoLayer")
    public java.util.List<AddCasterLayoutRequestVideoLayer> videoLayer;

    public static AddCasterLayoutRequest build(java.util.Map<String, ?> map) throws Exception {
        AddCasterLayoutRequest self = new AddCasterLayoutRequest();
        return TeaModel.build(map, self);
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

    public AddCasterLayoutRequest setCasterId(String casterId) {
        this.casterId = casterId;
        return this;
    }
    public String getCasterId() {
        return this.casterId;
    }

    public AddCasterLayoutRequest setMixList(java.util.List<String> mixList) {
        this.mixList = mixList;
        return this;
    }
    public java.util.List<String> getMixList() {
        return this.mixList;
    }

    public AddCasterLayoutRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public AddCasterLayoutRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public AddCasterLayoutRequest setVideoLayer(java.util.List<AddCasterLayoutRequestVideoLayer> videoLayer) {
        this.videoLayer = videoLayer;
        return this;
    }
    public java.util.List<AddCasterLayoutRequestVideoLayer> getVideoLayer() {
        return this.videoLayer;
    }

    public static class AddCasterLayoutRequestAudioLayer extends TeaModel {
        /**
         * <p>The fixed latency for the audio layer. Use this parameter to synchronize the audio with captions. Unit: milliseconds. Default value: 0. Valid values: <strong>0</strong> to <strong>5000</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>5000</p>
         */
        @NameInMap("FixedDelayDuration")
        public Integer fixedDelayDuration;

        /**
         * <p>The sound channels that are used for audio input. Valid values:</p>
         * <ul>
         * <li><p><strong>leftChannel</strong>: Left channel.</p>
         * </li>
         * <li><p><strong>rightChannel</strong>: Right channel.</p>
         * </li>
         * <li><p><strong>all</strong> (default): Both channels.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>all</p>
         */
        @NameInMap("ValidChannel")
        public String validChannel;

        /**
         * <p>The volume multiplication factor for the audio stream. Valid values: 0 to <strong>10.0</strong>.</p>
         * <ul>
         * <li><p><strong>1.0</strong> (default): The original volume is used.</p>
         * </li>
         * <li><p>A value less than <strong>1</strong> decreases the volume.</p>
         * </li>
         * <li><p>A value greater than <strong>1</strong> increases the volume.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1.0</p>
         */
        @NameInMap("VolumeRate")
        public Float volumeRate;

        public static AddCasterLayoutRequestAudioLayer build(java.util.Map<String, ?> map) throws Exception {
            AddCasterLayoutRequestAudioLayer self = new AddCasterLayoutRequestAudioLayer();
            return TeaModel.build(map, self);
        }

        public AddCasterLayoutRequestAudioLayer setFixedDelayDuration(Integer fixedDelayDuration) {
            this.fixedDelayDuration = fixedDelayDuration;
            return this;
        }
        public Integer getFixedDelayDuration() {
            return this.fixedDelayDuration;
        }

        public AddCasterLayoutRequestAudioLayer setValidChannel(String validChannel) {
            this.validChannel = validChannel;
            return this;
        }
        public String getValidChannel() {
            return this.validChannel;
        }

        public AddCasterLayoutRequestAudioLayer setVolumeRate(Float volumeRate) {
            this.volumeRate = volumeRate;
            return this;
        }
        public Float getVolumeRate() {
            return this.volumeRate;
        }

    }

    public static class AddCasterLayoutRequestVideoLayer extends TeaModel {
        /**
         * <p>The fill mode of the element. Valid values:</p>
         * <ul>
         * <li><p><strong>none</strong> (default): No scaling. The video is displayed in its original size.</p>
         * </li>
         * <li><p><strong>fit</strong>: The video is scaled to fit the fill area while maintaining its aspect ratio. The video is centered in the fill area. If the aspect ratio of the fill area is different from that of the video, the area along the shorter edge is not filled. This area displays the video of the underlying layer. If no underlying layer is configured, this area is black.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>fit</p>
         */
        @NameInMap("FillMode")
        public String fillMode;

        /**
         * <p>The fixed latency for the video layer. Use this parameter to synchronize the video with captions. Unit: milliseconds. Default value: 0. Valid values: <strong>0</strong> to <strong>5000</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>5000</p>
         */
        @NameInMap("FixedDelayDuration")
        public Integer fixedDelayDuration;

        /**
         * <p>The normalized height of the layer.</p>
         * <ul>
         * <li><p>If you set FillMode to none, the width of the layer is scaled in proportion to the height. The default value is <strong>0</strong>. A value of 0 indicates that the video is displayed in its original size.</p>
         * </li>
         * <li><p>If you set FillMode to fit, this parameter is required and its value must be greater than <strong>0</strong>. The value specifies the normalized height of the fill area.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("HeightNormalized")
        public Float heightNormalized;

        /**
         * <p>The position of the video layer. The value is a normalized coordinate <code>[x,y]</code>. Default value: <code>[0,0]</code>.</p>
         * <p>Note: The x and y coordinates must be normalized.</p>
         * 
         * <strong>example:</strong>
         * <p>0.3</p>
         */
        @NameInMap("PositionNormalized")
        public java.util.List<Float> positionNormalized;

        /**
         * <p>The reference point for the position of the layer. Valid values:</p>
         * <ul>
         * <li><p><strong>topLeft</strong> (default): Top-left.</p>
         * </li>
         * <li><p><strong>topRight</strong>: Top-right.</p>
         * </li>
         * <li><p><strong>bottomLeft</strong>: Bottom-left.</p>
         * </li>
         * <li><p><strong>bottomRight</strong>: Bottom-right.</p>
         * </li>
         * <li><p><strong>center</strong>: Center.</p>
         * </li>
         * <li><p><strong>topCenter</strong>: Top-center.</p>
         * </li>
         * <li><p><strong>bottomCenter</strong>: Bottom-center.</p>
         * </li>
         * <li><p><strong>leftCenter</strong>: Left-center.</p>
         * </li>
         * <li><p><strong>rightCenter</strong>: Right-center.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>topLeft</p>
         */
        @NameInMap("PositionRefer")
        public String positionRefer;

        /**
         * <p>The normalized width of the layer.</p>
         * <ul>
         * <li><p>If you set FillMode to none, the height of the layer is scaled in proportion to the width. The default value is <strong>0</strong>. A value of 0 indicates that the video is displayed in its original size.</p>
         * </li>
         * <li><p>If you set FillMode to fit, this parameter is required and its value must be greater than <strong>0</strong>. The value specifies the normalized width of the fill area.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("WidthNormalized")
        public Float widthNormalized;

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

        public AddCasterLayoutRequestVideoLayer setFixedDelayDuration(Integer fixedDelayDuration) {
            this.fixedDelayDuration = fixedDelayDuration;
            return this;
        }
        public Integer getFixedDelayDuration() {
            return this.fixedDelayDuration;
        }

        public AddCasterLayoutRequestVideoLayer setHeightNormalized(Float heightNormalized) {
            this.heightNormalized = heightNormalized;
            return this;
        }
        public Float getHeightNormalized() {
            return this.heightNormalized;
        }

        public AddCasterLayoutRequestVideoLayer setPositionNormalized(java.util.List<Float> positionNormalized) {
            this.positionNormalized = positionNormalized;
            return this;
        }
        public java.util.List<Float> getPositionNormalized() {
            return this.positionNormalized;
        }

        public AddCasterLayoutRequestVideoLayer setPositionRefer(String positionRefer) {
            this.positionRefer = positionRefer;
            return this;
        }
        public String getPositionRefer() {
            return this.positionRefer;
        }

        public AddCasterLayoutRequestVideoLayer setWidthNormalized(Float widthNormalized) {
            this.widthNormalized = widthNormalized;
            return this;
        }
        public Float getWidthNormalized() {
            return this.widthNormalized;
        }

    }

}
