// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class AddCasterLayoutRequest extends TeaModel {
    /**
     * <p>Audio layout.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("AudioLayer")
    public java.util.List<AddCasterLayoutRequestAudioLayer> audioLayer;

    /**
     * <p>The element represents the location ID of the video resource, i.e., LocationId. Refer to <a href="https://help.aliyun.com/document_detail/60250.html">Adding Video Source</a> for LocationId, which corresponds in order with the VideoLayers elements.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>RV01</p>
     */
    @NameInMap("BlendList")
    public java.util.List<String> blendList;

    /**
     * <p>The ID of the production studio.</p>
     * <p>If you create a production studio through the <a href="~~69338#doc-api-live-CreateCaster~~" title="Creates a production studio.">CreateCaster</a> interface, check the value of the CasterId parameter in the response.</p>
     * <p>If you create a production studio through the ApsaraVideo Live Console, log in to the console, then check the ID of the production studio through the following path:</p>
     * <p>Production Studios &gt; Production Studio Management</p>
     * <blockquote>
     * <p> The CasterId is reflected in the Name column on the Production Studio Management page.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>LIVEPRODUCER_POST-cn-0pp1czt****</p>
     */
    @NameInMap("CasterId")
    public String casterId;

    /**
     * <p>The element represents the location ID of the audio resource, i.e., LocationId.
     * LocationId is referred to in <a href="https://help.aliyun.com/document_detail/60250.html">Adding Video Source</a>, and corresponds in order with the AudioLayers elements.</p>
     * <p>This parameter is required.</p>
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
     * <p>Video layout.</p>
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
         * <p>The fixed delay of audio layer N. You can use this parameter to synchronize the audio with subtitles. Unit: milliseconds. Valid values: <strong>0 to 5000</strong>. Default value: <strong>0</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>5000</p>
         */
        @NameInMap("FixedDelayDuration")
        public Integer fixedDelayDuration;

        /**
         * <p>The valid voice channels of audio layer N. Valid values:</p>
         * <ul>
         * <li><strong>leftChannel</strong>: the left channel.</li>
         * <li><strong>rightChannel</strong>: the right channel.</li>
         * <li><strong>all</strong>: both the left and right channels. This is the default value.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>all</p>
         */
        @NameInMap("ValidChannel")
        public String validChannel;

        /**
         * <p>The multiples of the original volume at which audio layer N plays audio streams. Valid values: <strong>0 to 10.0</strong>.</p>
         * <ul>
         * <li>The default value <strong>1.0</strong> indicates that audio layer N plays audio streams at the original volume.</li>
         * <li>A value smaller than <strong>1.0</strong> indicates that audio layer N plays audio streams at a lower volume than the original one.</li>
         * <li>A value greater than <strong>1.0</strong> indicates that audio layer N plays audio streams at a higher volume than the original one.</li>
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
         * <p>The scaling mode of video layer N. Valid values:</p>
         * <ul>
         * <li><strong>none</strong>: The image is not scaled to fill in the specified layout section. Set video layer N based on the image size of the video resource. This is the default value.</li>
         * <li><strong>fit</strong>: The image is scaled with the original aspect ratio to fill in the specified layout section. Set video layer N based on the section size. The image is centered in the layout section with the long side of the image equaling that of the section. If the aspect ratio of the image is inconsistent with that of the section, the short side of the image may be shorter than that of the section. The area outside the image displays the next video layer or the background if no next video layer exists. By default, the background color is black.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>fit</p>
         */
        @NameInMap("FillMode")
        public String fillMode;

        /**
         * <p>The fixed delay of video layer N. You can use this parameter to synchronize the video with subtitles. Unit: milliseconds. Valid values: <strong>0 to 5000</strong>. Default value: <strong>0</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>5000</p>
         */
        @NameInMap("FixedDelayDuration")
        public Integer fixedDelayDuration;

        /**
         * <p>The normalized value of the height of the image of video layer N.</p>
         * <ul>
         * <li>If the FillMode parameter of video layer N is set to none, the width of the video image is scaled based on this parameter. The default value is <strong>0</strong>, which indicates that the video image is displayed in the original size.</li>
         * <li>If the FillMode parameter of video layer N is set to fit, you must set this parameter to a value greater than <strong>0</strong>. In this case, the video image is scaled with the original aspect ratio to fill in the specified layout section based on this parameter.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("HeightNormalized")
        public Float heightNormalized;

        /**
         * <p>The normalized value of the <code>[x,y]</code> coordinates of video layer N in the production studio. The default coordinates are <code>[0,0]</code>.</p>
         * <blockquote>
         * <p> The coordinates indicate the location of video layer N in the production studio. Set this parameter to the normalized value of the coordinates.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>0.3</p>
         */
        @NameInMap("PositionNormalized")
        public java.util.List<Float> positionNormalized;

        /**
         * <p>The reference coordinates of video layer N in the production studio. Valid values:</p>
         * <ul>
         * <li><strong>topLeft</strong>: the upper-left corner. This is the default value.</li>
         * <li><strong>topRight</strong>: the upper-right corner.</li>
         * <li><strong>bottomLeft</strong>: the lower-left corner.</li>
         * <li><strong>bottomRight</strong>: the lower-right corner.</li>
         * <li><strong>center</strong>: the center position.</li>
         * <li><strong>topCenter</strong>: the upper center position.</li>
         * <li><strong>bottomCenter</strong>: the lower center position.</li>
         * <li><strong>leftCenter</strong>: the left center position.</li>
         * <li><strong>rightCenter</strong>: the right center position.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>topLeft</p>
         */
        @NameInMap("PositionRefer")
        public String positionRefer;

        /**
         * <p>The normalized value of the width of the image of video layer N.</p>
         * <ul>
         * <li>If the FillMode parameter of video layer N is set to none, the height of the video image is scaled based on this parameter. The default value is <strong>0</strong>, which indicates that the video image is displayed in the original size.</li>
         * <li>If the FillMode parameter of video layer N is set to fit, you must set this parameter to a value greater than <strong>0</strong>. In this case, the video image is scaled with the original aspect ratio to fill in the specified layout section based on this parameter.</li>
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
