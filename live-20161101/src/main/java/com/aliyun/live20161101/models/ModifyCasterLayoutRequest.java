// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class ModifyCasterLayoutRequest extends TeaModel {
    /**
     * <p>The audio layers.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("AudioLayer")
    public java.util.List<ModifyCasterLayoutRequestAudioLayer> audioLayer;

    /**
     * <p>The location IDs of the video layers, which are in the same order as the video layers.</p>
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/2848020.html">AddCasterVideoResource</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>RV02</p>
     */
    @NameInMap("BlendList")
    public java.util.List<String> blendList;

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
     * <p>The ID of the layout. If the layout was added by calling the <a href="https://help.aliyun.com/document_detail/2848025.html">AddCasterLayout</a> operation, check the value of the response parameter LayoutId to obtain the ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>21926b36-7dd2-4fde-ae25-51b5bc8e****</p>
     */
    @NameInMap("LayoutId")
    public String layoutId;

    /**
     * <p>The location IDs of the audio layers, which are in the same order as the audio layers.</p>
     * <p>For more information, see <a href="https://help.aliyun.com/document_detail/2848020.html">AddCasterVideoResource</a>.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>RV02</p>
     */
    @NameInMap("MixList")
    public java.util.List<String> mixList;

    @NameInMap("OwnerId")
    public Long ownerId;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The video layers.</p>
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
         * <p>The fixed delay of the audio layer. This parameter is used to synchronize the audio with subtitles. Unit: milliseconds. Default value: <strong>0</strong>. Valid values: <strong>0 to 5000</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>5000</p>
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
         * <p>The normalized value of the height of the audio layer. The width of the audio layer is proportionally scaled based on this parameter.</p>
         * <p>The default value is <strong>0</strong>, which indicates that the audio layer is not scaled.</p>
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
         * <p>The scaling mode of the video layer. Valid values:</p>
         * <ul>
         * <li><strong>none</strong> (default): indicates that the video layer is not scaled. The video layer is displayed based on its original size.</li>
         * <li><strong>fit</strong>: indicates that the video layer is adapted to the fill area. In this case, the video layer is scaled proportionally, with its original aspect ratio retained. The video layer is placed in the center, with its longer sides aligned with the fill area. If the aspect ratio of the video layer is different from that of the fill area, the content of the lower layer is displayed alongside the shorter sides. If there is no lower layer, black bars are displayed instead.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>fit</p>
         */
        @NameInMap("FillMode")
        public String fillMode;

        /**
         * <p>The fixed delay of the video layer. This parameter is used to synchronize the video with subtitles. Unit: milliseconds. Default value: <strong>0</strong>. Valid values: <strong>0 to 5000</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>5000</p>
         */
        @NameInMap("FixedDelayDuration")
        public Integer fixedDelayDuration;

        /**
         * <p>The normalized value of the height of the video layer.</p>
         * <ul>
         * <li>If the FillMode parameter of the video layer is set to none, the width of the video layer is proportionally scaled based on this parameter. The default value is <strong>0</strong>, which indicates that the video layer is not scaled.</li>
         * <li>If the FillMode parameter of the video layer is set to fit, the value of this parameter is greater than <strong>0</strong>.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("HeightNormalized")
        public Float heightNormalized;

        /**
         * <p>The normalized value of the position of the video layer, in the format of <code>[x,y]</code>. Default value: <code>[0,0]</code>.</p>
         * <blockquote>
         * <p> The values of x and y are normalized.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>0.3</p>
         */
        @NameInMap("PositionNormalized")
        public java.util.List<Float> positionNormalized;

        /**
         * <p>The reference coordinates of the video layer. Valid values:</p>
         * <ul>
         * <li><strong>topLeft</strong> (default): the upper-left corner</li>
         * <li><strong>topRight</strong>: the upper-right corner</li>
         * <li><strong>bottomLeft</strong>: the lower-left corner</li>
         * <li><strong>bottomRight</strong>: the lower-right corner</li>
         * <li><strong>center</strong>: the center</li>
         * <li><strong>topCenter</strong>: the upper center</li>
         * <li><strong>bottomCenter</strong>: the lower center</li>
         * <li><strong>leftCenter</strong>: the left center</li>
         * <li><strong>rightCenter</strong>: the right center</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>topLeft</p>
         */
        @NameInMap("PositionRefer")
        public String positionRefer;

        /**
         * <p>The normalized value of the width of the video layer.</p>
         * <ul>
         * <li>If the FillMode parameter of the video layer is set to none, the height of the video layer is proportionally scaled based on this parameter. The default value is <strong>0</strong>, which indicates that the video layer is not scaled.</li>
         * <li>If the FillMode parameter of the video layer is set to fit, the value of this parameter is greater than <strong>0</strong>.</li>
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
