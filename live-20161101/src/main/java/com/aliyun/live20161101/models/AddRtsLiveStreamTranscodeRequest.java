// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class AddRtsLiveStreamTranscodeRequest extends TeaModel {
    /**
     * <p>The name of the application to which the live stream belongs. Value requirements:</p>
     * <ul>
     * <li>The name can contain letters, digits, underscores (_), and hyphens (-).</li>
     * <li>We recommend that you specify a name that is more than three characters in length. The name must start with a letter or digit.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>aliyun-test</p>
     */
    @NameInMap("App")
    public String app;

    /**
     * <p>The bitrate of the output audio. Unit: Kbit/s. Valid values: <strong>1</strong> to <strong>1000</strong>.</p>
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
     * <li><strong>aac</strong></li>
     * <li><strong>mp3</strong></li>
     * </ul>
     * <blockquote>
     * <p>If you want to use the Opus encoding format, set the Opus parameter to true.</p>
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
     * <li><strong>aac_low</strong></li>
     * <li><strong>aac_he</strong></li>
     * <li><strong>aac_he_v2</strong></li>
     * <li><strong>aac_ld</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>aac_low</p>
     */
    @NameInMap("AudioProfile")
    public String audioProfile;

    /**
     * <p>The audio sampling rate. Valid values: <strong>22050 to 96000</strong>. The value 44100 is commonly used. Unit: Hz.</p>
     * <blockquote>
     * <p>If you set the AudioProfile parameter to aac_ld, the audio sampling rate cannot exceed 44,100 Hz.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>44100</p>
     */
    @NameInMap("AudioRate")
    public Integer audioRate;

    /**
     * <p>Specifies whether to remove B-frames during transcoding. Valid values:</p>
     * <blockquote>
     * <p> This parameter is required if you set the TemplateType parameter to h264, h264-nbhd, or h264-origin.</p>
     * </blockquote>
     * <ul>
     * <li><strong>true</strong>: removes B-frames.</li>
     * <li><strong>false</strong>: retains B-frames. This is the default value.</li>
     * </ul>
     * <blockquote>
     * <p>If you do not specify this parameter, the default value <strong>false</strong> is used.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DeleteBframes")
    public Boolean deleteBframes;

    /**
     * <p>The main streaming domain.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("Domain")
    public String domain;

    /**
     * <p>The frame rate of the output video. Unit: FPS. Valid values: <strong>1</strong> to <strong>60</strong>.</p>
     * <blockquote>
     * <p> This parameter is required if you set the TemplateType parameter to h264, h264-nbhd, or h264-origin.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("FPS")
    public Integer FPS;

    /**
     * <p>The group of pictures (GOP) size of the output video. This parameter is used to specify the keyframe interval. Unit: seconds. Valid values: <strong>1</strong> to <strong>3</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("Gop")
    public String gop;

    /**
     * <p>The height of the output video. Unit: pixels.</p>
     * <blockquote>
     * <p> This parameter is required if you set the TemplateType parameter to h264, h264-nbhd, or h264-origin.</p>
     * </blockquote>
     * <p>The value must comply with the following rules:****</p>
     * <ul>
     * <li><strong>Height ≥ 100</strong>: The height of the video is no less than 100 pixels.</li>
     * <li><strong>max(Height,Width) ≤ 2560</strong>: The width or height of the video, whichever is greater, cannot exceed 2,560 pixels.</li>
     * <li><strong>min(Height,Width) ≤ 1440</strong>: The width or height of the video, whichever is smaller, cannot exceed 1,440 pixels.</li>
     * </ul>
     * <p>For example, a resolution of 1560 × 1560 pixels is invalid.</p>
     * <blockquote>
     * <p>An original quality template needs to retain the source information. Therefore, the video resolution cannot exceed 4K.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>1280</p>
     */
    @NameInMap("Height")
    public Integer height;

    /**
     * <p>Specifies whether to trigger transcoding only when a stream is pulled. Valid values:</p>
     * <ul>
     * <li><strong>yes</strong>: triggers transcoding only when a stream is pulled.</li>
     * <li><strong>no</strong>: triggers transcoding whenever a stream is ingested, no matter whether the stream is pulled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>no</p>
     */
    @NameInMap("Lazy")
    public String lazy;

    /**
     * <p>Specifies whether to transcode audio to the Opus format to be compatible with native WebRTC. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: transcodes audio to the Opus format.</li>
     * <li><strong>false</strong>: does not transcode audio to the Opus format.</li>
     * </ul>
     * <blockquote>
     * <p>If you do not specify this parameter, the default value <strong>false</strong> is used.</p>
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
     * <p>The codec profile. The video codec profile determines how ApsaraVideo Live performs codec on the video. In normal cases, a greater value indicates a higher image quality and requires more codec resources. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: baseline, which is suitable for mobile devices.</li>
     * <li><strong>2</strong>: main, which is suitable for standard-definition devices.</li>
     * <li><strong>3</strong>: high, which is suitable for high-definition devices.</li>
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
     * <p>The name of the transcoding template. Value requirements:</p>
     * <ul>
     * <li>The name can contain letters, digits, underscores (_), and hyphens (-).</li>
     * <li>We recommend that you specify a name that is more than three characters in length. The name must start with a letter or digit.</li>
     * </ul>
     * <blockquote>
     * <p>The name cannot be the same as that of a default transcoding template.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ld</p>
     */
    @NameInMap("Template")
    public String template;

    /**
     * <p>The type of the transcoding template.</p>
     * <p>If you set this parameter to h264, h264-nbhd, or h264-origin, you must also specify the Height, Width, FPS, VideoBitrate, and DeleteBframes parameters. Valid values:</p>
     * <ul>
     * <li><strong>h264</strong>: H.264 standard transcoding template.</li>
     * <li><strong>h264-nbhd</strong>: H.264 Narrowband HD™ transcoding template.</li>
     * <li><strong>h264-origin</strong>: H.264 original quality template. If you use this type of template, the same transcoding parameters of the video source are retained by default.</li>
     * <li><strong>audio</strong>: audio-only transcoding template. If you use this type of template, images are removed from the video source and an audio-only stream is generated. In addition, you must also specify the AudioBitrate parameter.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>h264</p>
     */
    @NameInMap("TemplateType")
    public String templateType;

    /**
     * <p>The bitrate of the output video. Unit: Kbit/s. Valid values: <strong>1</strong> to <strong>6000</strong>.</p>
     * <blockquote>
     * <p> This parameter is required if you set the TemplateType parameter to h264, h264-nbhd, or h264-origin.</p>
     * </blockquote>
     * <blockquote>
     * <p>The bitrate of the output video is as close to the value that you specify as possible, but not exactly the same as the value, especially when the value is excessively large or small.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2000</p>
     */
    @NameInMap("VideoBitrate")
    public Integer videoBitrate;

    /**
     * <p>The width of the output video. Unit: pixels.</p>
     * <blockquote>
     * <p> This parameter is required if you set the TemplateType parameter to h264, h264-nbhd, or h264-origin.</p>
     * </blockquote>
     * <p>The value must comply with the following rules:</p>
     * <ul>
     * <li><strong>Width ≥ 100</strong>: The width of the video is no less than 100 pixels.</li>
     * <li><strong>max(Height,Width) ≤ 2560</strong>: The width or height of the video, whichever is greater, cannot exceed 2,560 pixels.</li>
     * <li><strong>min(Height,Width) ≤ 1440</strong>: The width or height of the video, whichever is smaller, cannot exceed 1,440 pixels.</li>
     * </ul>
     * <p>For example, a resolution of 1560 × 1560 pixels is invalid.</p>
     * <blockquote>
     * <p>An original quality template needs to retain the source information. Therefore, the video resolution cannot exceed 4K.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>720</p>
     */
    @NameInMap("Width")
    public Integer width;

    public static AddRtsLiveStreamTranscodeRequest build(java.util.Map<String, ?> map) throws Exception {
        AddRtsLiveStreamTranscodeRequest self = new AddRtsLiveStreamTranscodeRequest();
        return TeaModel.build(map, self);
    }

    public AddRtsLiveStreamTranscodeRequest setApp(String app) {
        this.app = app;
        return this;
    }
    public String getApp() {
        return this.app;
    }

    public AddRtsLiveStreamTranscodeRequest setAudioBitrate(Integer audioBitrate) {
        this.audioBitrate = audioBitrate;
        return this;
    }
    public Integer getAudioBitrate() {
        return this.audioBitrate;
    }

    public AddRtsLiveStreamTranscodeRequest setAudioChannelNum(Integer audioChannelNum) {
        this.audioChannelNum = audioChannelNum;
        return this;
    }
    public Integer getAudioChannelNum() {
        return this.audioChannelNum;
    }

    public AddRtsLiveStreamTranscodeRequest setAudioCodec(String audioCodec) {
        this.audioCodec = audioCodec;
        return this;
    }
    public String getAudioCodec() {
        return this.audioCodec;
    }

    public AddRtsLiveStreamTranscodeRequest setAudioProfile(String audioProfile) {
        this.audioProfile = audioProfile;
        return this;
    }
    public String getAudioProfile() {
        return this.audioProfile;
    }

    public AddRtsLiveStreamTranscodeRequest setAudioRate(Integer audioRate) {
        this.audioRate = audioRate;
        return this;
    }
    public Integer getAudioRate() {
        return this.audioRate;
    }

    public AddRtsLiveStreamTranscodeRequest setDeleteBframes(Boolean deleteBframes) {
        this.deleteBframes = deleteBframes;
        return this;
    }
    public Boolean getDeleteBframes() {
        return this.deleteBframes;
    }

    public AddRtsLiveStreamTranscodeRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public AddRtsLiveStreamTranscodeRequest setFPS(Integer FPS) {
        this.FPS = FPS;
        return this;
    }
    public Integer getFPS() {
        return this.FPS;
    }

    public AddRtsLiveStreamTranscodeRequest setGop(String gop) {
        this.gop = gop;
        return this;
    }
    public String getGop() {
        return this.gop;
    }

    public AddRtsLiveStreamTranscodeRequest setHeight(Integer height) {
        this.height = height;
        return this;
    }
    public Integer getHeight() {
        return this.height;
    }

    public AddRtsLiveStreamTranscodeRequest setLazy(String lazy) {
        this.lazy = lazy;
        return this;
    }
    public String getLazy() {
        return this.lazy;
    }

    public AddRtsLiveStreamTranscodeRequest setOpus(Boolean opus) {
        this.opus = opus;
        return this;
    }
    public Boolean getOpus() {
        return this.opus;
    }

    public AddRtsLiveStreamTranscodeRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public AddRtsLiveStreamTranscodeRequest setProfile(Integer profile) {
        this.profile = profile;
        return this;
    }
    public Integer getProfile() {
        return this.profile;
    }

    public AddRtsLiveStreamTranscodeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public AddRtsLiveStreamTranscodeRequest setTemplate(String template) {
        this.template = template;
        return this;
    }
    public String getTemplate() {
        return this.template;
    }

    public AddRtsLiveStreamTranscodeRequest setTemplateType(String templateType) {
        this.templateType = templateType;
        return this;
    }
    public String getTemplateType() {
        return this.templateType;
    }

    public AddRtsLiveStreamTranscodeRequest setVideoBitrate(Integer videoBitrate) {
        this.videoBitrate = videoBitrate;
        return this;
    }
    public Integer getVideoBitrate() {
        return this.videoBitrate;
    }

    public AddRtsLiveStreamTranscodeRequest setWidth(Integer width) {
        this.width = width;
        return this;
    }
    public Integer getWidth() {
        return this.width;
    }

}
