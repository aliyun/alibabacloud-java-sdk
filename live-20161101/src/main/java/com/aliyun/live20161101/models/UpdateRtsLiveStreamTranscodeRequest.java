// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class UpdateRtsLiveStreamTranscodeRequest extends TeaModel {
    /**
     * <p>The AppName of the live stream. This parameter cannot be modified.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>aliyun-test</p>
     */
    @NameInMap("App")
    public String app;

    /**
     * <p>The output audio bitrate. Unit: kbps. Valid values: 1 to <strong>1000</strong>.</p>
     * <blockquote>
     * <p>Required if you set TemplateType to audio.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>128</p>
     */
    @NameInMap("AudioBitrate")
    public Integer audioBitrate;

    /**
     * <p>The number of audio channels. Valid values:</p>
     * <ul>
     * <li><p><strong>1</strong>: mono.</p>
     * </li>
     * <li><p><strong>2</strong>: stereo.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("AudioChannelNum")
    public Integer audioChannelNum;

    /**
     * <p>The audio codec. Valid values:</p>
     * <ul>
     * <li><p>aac</p>
     * </li>
     * <li><p>mp3</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>To use the Opus codec, set the Opus parameter to true.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>aac</p>
     */
    @NameInMap("AudioCodec")
    public String audioCodec;

    /**
     * <p>The audio codec profile. Valid values:</p>
     * <ul>
     * <li><p>aac_low</p>
     * </li>
     * <li><p>aac_he</p>
     * </li>
     * <li><p>aac_he_v2</p>
     * </li>
     * <li><p>aac_ld</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>aac_low</p>
     */
    @NameInMap("AudioProfile")
    public String audioProfile;

    /**
     * <p>The audio sample rate. Valid values: 22050, 32000, 44100, 48000, 96000. Recommended: 44100. Unit: Hz.</p>
     * <blockquote>
     * <p>If AudioProfile is set to aac_ld, the sample rate cannot exceed 44100.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>44100</p>
     */
    @NameInMap("AudioRate")
    public Integer audioRate;

    /**
     * <p>Controls whether to remove B-frames from the transcoded output video. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: The transcoded video has no B-frames.</p>
     * </li>
     * <li><p><strong>false</strong>: The transcoded video contains B-frames. This is the default value.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>Required if you set TemplateType to h264, h264-nbhd, or h264-origin.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DeleteBframes")
    public Boolean deleteBframes;

    /**
     * <p>The streaming domain. This parameter cannot be modified.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("Domain")
    public String domain;

    /**
     * <p>The frame rate of the output video. Unit: frames per second (FPS). Valid values: 1 to <strong>60</strong>.</p>
     * <blockquote>
     * <p>Required if you set TemplateType to h264, h264-nbhd, or h264-origin.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("FPS")
    public Integer FPS;

    /**
     * <p>The Group of Pictures (GOP) size, which specifies the keyframe interval. Unit: seconds. Valid values: <strong>1</strong> to <strong>3</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("Gop")
    public String gop;

    /**
     * <p>Output video height in pixels.</p>
     * <p>Requirements:</p>
     * <ul>
     * <li><p>Height ≥ 100</p>
     * </li>
     * <li><p>max(Height, Width) ≤ 2560</p>
     * </li>
     * <li><p>min(Height, Width) ≤ 1440</p>
     * </li>
     * </ul>
     * <blockquote>
     * <ul>
     * <li><p>Required if you set TemplateType to h264, h264-nbhd, or h264-origin.</p>
     * </li>
     * <li><p>For h264-origin templates, the resolution can be up to 4K to retain the information of the source stream.</p>
     * </li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1280</p>
     */
    @NameInMap("Height")
    public Integer height;

    /**
     * <p>Specifies whether to enable on-demand transcoding. Valid values:</p>
     * <ul>
     * <li><p><strong>yes</strong>: Transcoding only starts when the first viewer requests this transcoded stream.</p>
     * </li>
     * <li><p><strong>no</strong>: Transcoding starts immediately after the stream is published.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>no</p>
     */
    @NameInMap("Lazy")
    public String lazy;

    /**
     * <p>Specifies whether to use the Opus codec for audio transcoding. This is mainly for compatibility with native WebRTC. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: Transcodes the audio to the Opus format.</p>
     * </li>
     * <li><p><strong>false</strong>: Does not use the Opus format for transcoding. This is the default value.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Opus")
    public Boolean opus;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The video codec profile. A larger value indicates better video quality and higher resource consumption for encoding and decoding. Valid values:</p>
     * <ul>
     * <li><p><strong>1</strong>: baseline (for mobile devices).</p>
     * </li>
     * <li><p><strong>2</strong>: main (for SD devices).</p>
     * </li>
     * <li><p><strong>3</strong>: high (for HD devices).</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("Profile")
    public Integer profile;

    /**
     * <p>The region ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-shanghai</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The name of the custom transcoding template. This parameter cannot be modified.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ld</p>
     */
    @NameInMap("Template")
    public String template;

    /**
     * <p>The type of the custom transcoding template. This parameter cannot be modified.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>h264</p>
     */
    @NameInMap("TemplateType")
    public String templateType;

    /**
     * <p>The output video bitrate. Unit: kbps. Valid values: 1 to <strong>6000</strong>.</p>
     * <blockquote>
     * <ul>
     * <li><p>Required if you set TemplateType to h264, h264-nbhd, or h264-origin.</p>
     * </li>
     * <li><p>The system tries to transcode the video at the specified bitrate. However, the actual bitrate may not be the same as the specified value, especially when the specified value is too high or too low.</p>
     * </li>
     * </ul>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2000</p>
     */
    @NameInMap("VideoBitrate")
    public Integer videoBitrate;

    /**
     * <p>Output video width in pixels.</p>
     * <p>Requirements:</p>
     * <ul>
     * <li><p>Width ≥ 100</p>
     * </li>
     * <li><p>max(Height, Width) ≤ 2560</p>
     * </li>
     * <li><p>min(Height, Width) ≤ 1440</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>Required if you set TemplateType to h264, h264-nbhd, or h264-origin.</p>
     * </blockquote>
     * <p>For h264-origin templates, the resolution can be up to 4K to retain the information of the source stream.</p>
     * 
     * <strong>example:</strong>
     * <p>720</p>
     */
    @NameInMap("Width")
    public Integer width;

    public static UpdateRtsLiveStreamTranscodeRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateRtsLiveStreamTranscodeRequest self = new UpdateRtsLiveStreamTranscodeRequest();
        return TeaModel.build(map, self);
    }

    public UpdateRtsLiveStreamTranscodeRequest setApp(String app) {
        this.app = app;
        return this;
    }
    public String getApp() {
        return this.app;
    }

    public UpdateRtsLiveStreamTranscodeRequest setAudioBitrate(Integer audioBitrate) {
        this.audioBitrate = audioBitrate;
        return this;
    }
    public Integer getAudioBitrate() {
        return this.audioBitrate;
    }

    public UpdateRtsLiveStreamTranscodeRequest setAudioChannelNum(Integer audioChannelNum) {
        this.audioChannelNum = audioChannelNum;
        return this;
    }
    public Integer getAudioChannelNum() {
        return this.audioChannelNum;
    }

    public UpdateRtsLiveStreamTranscodeRequest setAudioCodec(String audioCodec) {
        this.audioCodec = audioCodec;
        return this;
    }
    public String getAudioCodec() {
        return this.audioCodec;
    }

    public UpdateRtsLiveStreamTranscodeRequest setAudioProfile(String audioProfile) {
        this.audioProfile = audioProfile;
        return this;
    }
    public String getAudioProfile() {
        return this.audioProfile;
    }

    public UpdateRtsLiveStreamTranscodeRequest setAudioRate(Integer audioRate) {
        this.audioRate = audioRate;
        return this;
    }
    public Integer getAudioRate() {
        return this.audioRate;
    }

    public UpdateRtsLiveStreamTranscodeRequest setDeleteBframes(Boolean deleteBframes) {
        this.deleteBframes = deleteBframes;
        return this;
    }
    public Boolean getDeleteBframes() {
        return this.deleteBframes;
    }

    public UpdateRtsLiveStreamTranscodeRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public UpdateRtsLiveStreamTranscodeRequest setFPS(Integer FPS) {
        this.FPS = FPS;
        return this;
    }
    public Integer getFPS() {
        return this.FPS;
    }

    public UpdateRtsLiveStreamTranscodeRequest setGop(String gop) {
        this.gop = gop;
        return this;
    }
    public String getGop() {
        return this.gop;
    }

    public UpdateRtsLiveStreamTranscodeRequest setHeight(Integer height) {
        this.height = height;
        return this;
    }
    public Integer getHeight() {
        return this.height;
    }

    public UpdateRtsLiveStreamTranscodeRequest setLazy(String lazy) {
        this.lazy = lazy;
        return this;
    }
    public String getLazy() {
        return this.lazy;
    }

    public UpdateRtsLiveStreamTranscodeRequest setOpus(Boolean opus) {
        this.opus = opus;
        return this;
    }
    public Boolean getOpus() {
        return this.opus;
    }

    public UpdateRtsLiveStreamTranscodeRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UpdateRtsLiveStreamTranscodeRequest setProfile(Integer profile) {
        this.profile = profile;
        return this;
    }
    public Integer getProfile() {
        return this.profile;
    }

    public UpdateRtsLiveStreamTranscodeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateRtsLiveStreamTranscodeRequest setTemplate(String template) {
        this.template = template;
        return this;
    }
    public String getTemplate() {
        return this.template;
    }

    public UpdateRtsLiveStreamTranscodeRequest setTemplateType(String templateType) {
        this.templateType = templateType;
        return this;
    }
    public String getTemplateType() {
        return this.templateType;
    }

    public UpdateRtsLiveStreamTranscodeRequest setVideoBitrate(Integer videoBitrate) {
        this.videoBitrate = videoBitrate;
        return this;
    }
    public Integer getVideoBitrate() {
        return this.videoBitrate;
    }

    public UpdateRtsLiveStreamTranscodeRequest setWidth(Integer width) {
        this.width = width;
        return this;
    }
    public Integer getWidth() {
        return this.width;
    }

}
