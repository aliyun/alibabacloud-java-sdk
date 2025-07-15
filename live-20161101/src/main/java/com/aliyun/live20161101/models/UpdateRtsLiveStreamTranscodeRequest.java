// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class UpdateRtsLiveStreamTranscodeRequest extends TeaModel {
    /**
     * <p>The name of the application to which the live stream belongs, which cannot be modified.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>aliyun-test</p>
     */
    @NameInMap("App")
    public String app;

    /**
     * <p>The bitrate of the output audio. Unit: Kbit/s. Valid values: 1 to 1000.</p>
     * <blockquote>
     * <p> This parameter is required if you set the TemplateType parameter to audio.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>128</p>
     */
    @NameInMap("AudioBitrate")
    public Integer audioBitrate;

    /**
     * <p>The number of sound channels. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: mono</li>
     * <li><strong>2</strong>: stereo</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("AudioChannelNum")
    public Integer audioChannelNum;

    /**
     * <p>The audio encoder. Valid values:</p>
     * <ul>
     * <li>aac</li>
     * <li>mp3</li>
     * </ul>
     * <blockquote>
     * <p> To use the Opus encoder, you need only to set the Opus parameter to true.</p>
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
     * <li>aac_low</li>
     * <li>aac_he</li>
     * <li>aac_he_v2</li>
     * <li>aac_ld</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>aac_low</p>
     */
    @NameInMap("AudioProfile")
    public String audioProfile;

    /**
     * <p>The audio sampling rate. Valid values: 22050, 32000, 44100, 48000, and 96000. 44100 is commonly used. Unit: Hz.</p>
     * <blockquote>
     * <p> If the value of the AudioProfile parameter is aac_ld, the audio sampling rate cannot exceed 44,100.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>44100</p>
     */
    @NameInMap("AudioRate")
    public Integer audioRate;

    /**
     * <p>Specifies whether to remove B frames during transcoding. Valid values:</p>
     * <ul>
     * <li>true: Remove B frames.</li>
     * <li>false (default): Retain B frames.</li>
     * </ul>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>This parameter is required when the TemplateType parameter is set to h264, h264-nbhd, or h264-origin.</p>
     * </li>
     * <li><p>If this parameter is not specified, the default value false is used.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DeleteBframes")
    public Boolean deleteBframes;

    /**
     * <p>The main streaming domain, which cannot be modified.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("Domain")
    public String domain;

    /**
     * <p>The frame rate of the output video. Unit: frames per second (FPS). Valid values: 1 to 60.</p>
     * <blockquote>
     * <p> This parameter is required when the TemplateType parameter is set to h264, h264-nbhd, or h264-origin.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("FPS")
    public Integer FPS;

    /**
     * <p>The group of pictures (GOP) of the output video. This parameter is used to specify the keyframe interval. Unit: seconds. Valid values: 1 to 3.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("Gop")
    public String gop;

    /**
     * <p>The height of the output video. Unit: pixel.</p>
     * <p>The value must comply with the following rules:</p>
     * <ul>
     * <li>Height ≥ 100: The height of the video is at least 100 pixels.</li>
     * <li>max(Height,Width) ≤ 2560: The larger of the width and height of the video cannot exceed 2,560 pixels.</li>
     * <li>min(Height,Width) ≤ 1440: The smaller of the width and height of the video cannot exceed 1,440 pixels. For example, a resolution of 1560 × 1560 pixels is invalid.</li>
     * </ul>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>This parameter is required when the TemplateType parameter is set to h264, h264-nbhd, or h264-origin.</p>
     * </li>
     * <li><p>If the TemplateType parameter is set to h264-origin, the highest resolution supported is 4K.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1280</p>
     */
    @NameInMap("Height")
    public Integer height;

    /**
     * <p>Specifies whether to enable triggered transcoding. Valid values:</p>
     * <ul>
     * <li><strong>yes</strong>: enables triggered transcoding.</li>
     * <li><strong>no</strong>: disables triggered transcoding.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>no</p>
     */
    @NameInMap("Lazy")
    public String lazy;

    /**
     * <p>Specifies whether to transcode streams to the Opus format to be compatible with native WebRTC. Valid values:</p>
     * <ul>
     * <li>true: Transcode streams to the Opus format.</li>
     * <li>false: Do not transcode streams to the Opus format.</li>
     * </ul>
     * <blockquote>
     * <p> If this parameter is not specified, the default value false is used.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Opus")
    public Boolean opus;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>The video encoding profile. The profile defines a set of parameters that are used to encode a video. In most cases, a greater value indicates better image quality and higher resource consumption. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: baseline. This value is suitable for mobile devices.</li>
     * <li><strong>2</strong>: main. This value is suitable for standard-definition devices.</li>
     * <li><strong>3</strong>: high. This value is suitable for high-definition devices.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("Profile")
    public Integer profile;

    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The ID of the custom transcoding template, which cannot be modified.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ld</p>
     */
    @NameInMap("Template")
    public String template;

    /**
     * <p>The type of the custom transcoding template, which cannot be modified.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>h264</p>
     */
    @NameInMap("TemplateType")
    public String templateType;

    /**
     * <p>The bitrate of the output video. Unit: Kbit/s. Valid values: 1 to 6000.</p>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>This parameter is required when the TemplateType parameter is set to h264, h264-nbhd, or h264-origin.</p>
     * </li>
     * <li><p>The bitrate of the output video is as close to the value that you specify as possible, but not the same as the value, especially when the value is excessively large or small.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2000</p>
     */
    @NameInMap("VideoBitrate")
    public Integer videoBitrate;

    /**
     * <p>The width of the output video. Unit: pixel.</p>
     * <p>The value must comply with the following rules:</p>
     * <ul>
     * <li>Width ≥ 100: The width of the video is at least 100 pixels.</li>
     * <li>max(Height,Width) ≤ 2560: The larger of the width and height of the video cannot exceed 2,560 pixels.</li>
     * <li>min(Height,Width) ≤ 1440: The smaller of the width and height of the video cannot exceed 1,440 pixels. For example, a resolution of 1560 × 1560 pixels is invalid.</li>
     * </ul>
     * <blockquote>
     * </blockquote>
     * <ul>
     * <li><p>This parameter is required when the TemplateType parameter is set to h264, h264-nbhd, or h264-origin.</p>
     * </li>
     * <li><p>If the TemplateType parameter is set to h264-origin, the highest resolution supported is 4K.</p>
     * </li>
     * </ul>
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
