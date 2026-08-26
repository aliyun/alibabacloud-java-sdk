// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class ModifyCasterLayoutRequest extends TeaModel {
    /**
     * <p>The audio information.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("AudioLayer")
    public java.util.List<ModifyCasterLayoutRequestAudioLayer> audioLayer;

    /**
     * <p>The location ID (LocationId) of the video resource element.</p>
     * <p>For the LocationId, see <a href="https://help.aliyun.com/document_detail/2848020.html">Add a video source</a>. The elements correspond to the VideoLayers elements in order.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>RV02</p>
     */
    @NameInMap("BlendList")
    public java.util.List<String> blendList;

    /**
     * <p>The production studio ID.</p>
     * <ul>
     * <li><p>If you created the production studio by calling the <a href="https://help.aliyun.com/document_detail/2848009.html">CreateCaster operation</a>, check the CasterId parameter returned by the CreateCaster operation.</p>
     * </li>
     * <li><p>If you created the production studio in the ApsaraVideo Live console, go to <strong>ApsaraVideo Live console</strong> &gt; <strong>Production Studio</strong> &gt; <strong>Cloud Production Studio</strong> to view the ID.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>The production studio name in the production studio list on the Cloud Production Studio page of the ApsaraVideo Live console is the production studio ID.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>LIVEPRODUCER_POST-cn-0pp1czt****</p>
     */
    @NameInMap("CasterId")
    public String casterId;

    /**
     * <p>The layout ID. If you added the production studio layout by calling the <a href="https://help.aliyun.com/document_detail/2848025.html">AddCasterLayout operation</a>, check the LayoutId parameter returned by the AddCasterLayout operation.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>21926b36-7dd2-4fde-ae25-51b5bc8e****</p>
     */
    @NameInMap("LayoutId")
    public String layoutId;

    /**
     * <p>The location ID (LocationId) of the audio resource element.</p>
     * <p>For the LocationId, see <a href="https://help.aliyun.com/document_detail/2848020.html">Add a video source</a>. The elements correspond to the AudioLayers elements in order.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>RV02</p>
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
     * <p>The video information.</p>
     * <p>This parameter is required.</p>
     */
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

    public ModifyCasterLayoutRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public ModifyCasterLayoutRequest setVideoLayer(java.util.List<ModifyCasterLayoutRequestVideoLayer> videoLayer) {
        this.videoLayer = videoLayer;
        return this;
    }
    public java.util.List<ModifyCasterLayoutRequestVideoLayer> getVideoLayer() {
        return this.videoLayer;
    }

    public static class ModifyCasterLayoutRequestAudioLayer extends TeaModel {
        /**
         * <p>The fixed delay for the audio. This can be used for subtitle synchronization. Unit: milliseconds. Default value: <strong>0</strong>. Valid values: <strong>0 to 5000</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>5000</p>
         */
        @NameInMap("FixedDelayDuration")
        public Integer fixedDelayDuration;

        /**
         * <p>The audio channels that can be used as volume input. Valid values:</p>
         * <ul>
         * <li><strong>leftChannel</strong>: left channel.</li>
         * <li><strong>rightChannel</strong>: right channel.</li>
         * <li><strong>all</strong> (default): both channels.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>all</p>
         */
        @NameInMap("ValidChannel")
        public String validChannel;

        /**
         * <p>The normalized height ratio of the Layer element. The width of the element is proportionally scaled based on this height. </p>
         * <p>Default value: <strong>0</strong>, which indicates that the element is displayed at its original size.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
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
        /**
         * <p>The element fill mode. </p>
         * <ul>
         * <li><strong>none</strong> (default): no fill. The Layer settings are configured with the image as the target.</li>
         * <li><strong>fit</strong>: adaptive. The Layer settings are configured with the fill area (box) as the target. The image is scaled based on the original aspect ratio and centered within the fill area (box) using a long-edge alignment method. If the aspect ratio of the fill area does not match the image, the short edges are not filled (the lower Layer image is displayed. If no lower Layer is configured, the default black background is displayed).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>fit</p>
         */
        @NameInMap("FillMode")
        public String fillMode;

        /**
         * <p>The fixed delay for the video. This can be used for subtitle synchronization. Unit: milliseconds. Default value: <strong>0</strong>. Valid values: <strong>0 to 5000</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>5000</p>
         */
        @NameInMap("FixedDelayDuration")
        public Integer fixedDelayDuration;

        /**
         * <p>The normalized height ratio of the Layer element. </p>
         * <ul>
         * <li>If the no-fill mode is used, the width of the element is proportionally scaled based on this height. Default value: <strong>0</strong>, which indicates that the image is displayed at its original size.</li>
         * <li>If the adaptive mode is used, this field is required and must be greater than <strong>0</strong>. It specifies the normalized height ratio of the fill area (box).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("HeightNormalized")
        public Float heightNormalized;

        /**
         * <p>The normalized position values <code>[x,y]</code> of the Layer element. Default value: <code>[0,0]</code>.</p>
         * <blockquote>
         * <p>Note: The x and y values must be normalized.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>0.3</p>
         */
        @NameInMap("PositionNormalized")
        public java.util.List<Float> positionNormalized;

        /**
         * <p>The reference coordinate for the position of the element. Valid values:</p>
         * <ul>
         * <li><strong>topLeft</strong> (default): top-left.</li>
         * <li><strong>topRight</strong>: top-right.</li>
         * <li><strong>bottomLeft</strong>: bottom-left.</li>
         * <li><strong>bottomRight</strong>: bottom-right.</li>
         * <li><strong>center</strong>: center.</li>
         * <li><strong>topCenter</strong>: top-center.</li>
         * <li><strong>bottomCenter</strong>: bottom-center.</li>
         * <li><strong>leftCenter</strong>: left-center.</li>
         * <li><strong>rightCenter</strong>: right-center.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>topLeft</p>
         */
        @NameInMap("PositionRefer")
        public String positionRefer;

        /**
         * <p>The normalized width ratio of the Layer element. </p>
         * <ul>
         * <li>If the no-fill mode is used, the height of the element is proportionally scaled based on this width. Default value: <strong>0</strong>, which indicates that the image is displayed at its original size.</li>
         * <li>If the adaptive mode is used, this field is required and must be greater than <strong>0</strong>. It specifies the normalized width ratio of the fill area (box).</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
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
