// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class UpdateCustomLiveStreamTranscodeRequest extends TeaModel {
    /**
     * <p>The AppName of the live stream. This parameter cannot be modified.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>liveApp****</p>
     */
    @NameInMap("App")
    public String app;

    /**
     * <p>The output audio bitrate. Unit: kbps. Valid values: 1 to <strong>1000</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>512</p>
     */
    @NameInMap("AudioBitrate")
    public Integer audioBitrate;

    /**
     * <p>The number of audio channels. Valid values:</p>
     * <ul>
     * <li><p>1: mono.</p>
     * </li>
     * <li><p>2: stereo.</p>
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
     * 
     * <strong>example:</strong>
     * <p>aac</p>
     */
    @NameInMap("AudioCodec")
    public String audioCodec;

    /**
     * <p>The audio profile. Valid values:</p>
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
     * <p>The audio sample rate. Valid values: 22050, 32000, 44100, 48000, and 96000. Unit: Hz.</p>
     * <blockquote>
     * <p>If you set <strong>AudioProfile</strong> to <strong>aac_ld</strong>, the sample rate cannot exceed 44100.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>96000</p>
     */
    @NameInMap("AudioRate")
    public Integer audioRate;

    /**
     * <p>The adaptive bitrate settings. If specified, it overrides the VideoBitrate parameter. Fields:</p>
     * <ul>
     * <li><p><strong>UpLimit (integer):</strong> Required. The upper limit of the bitrate. This must be an integer from 128 to 10000 and greater than the lower limit.</p>
     * </li>
     * <li><p><strong>LowerLimit (integer):</strong> Required. The lower limit of the bitrate. This must be an integer from 128 to 10000 and less than the upper limit.</p>
     * </li>
     * <li><p><strong>Factor (float):</strong> Required: The factor by which the source bitrate is multiplied to calculate the output bitrate. Valid values: 0.1 to 1. The value can be accurate to one decimal place. A value of 1 indicates that the output bitrate is the same as the source bitrate.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;UpLimit&quot;:2500,&quot;LowerLimit&quot;:800,&quot;Factor&quot;:1}</p>
     */
    @NameInMap("BitrateWithSource")
    public String bitrateWithSource;

    /**
     * <p>Specifies whether to automatically detect and remove interlacing during transcoding. Deinterlacing converts interlaced video into progressive video.</p>
     * <ul>
     * <li><p>true: enables deinterlacing.</p>
     * </li>
     * <li><p>false: keeps the source format. This is the default value.</p>
     * </li>
     * </ul>
     */
    @NameInMap("DeInterlaced")
    public Boolean deInterlaced;

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
     * <p>The encryption settings, formatted as a JSON string.</p>
     * <ul>
     * <li><p><strong>EncryptType</strong>: The encryption type. Set the value to aliyun.</p>
     * </li>
     * <li><p><strong>KmsKeyID</strong>: The ID of the customer master key (CMK) in Key Management Service (KMS).</p>
     * </li>
     * <li><p><strong>KmsKeyExpireInterval</strong>: The key rotation period. Unit: seconds. Valid values: <strong>60 to 3600.</strong></p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>When you use Digital Rights Management (DRM) encryption, you cannot modify KmsKeyID.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>{&quot;EncryptType&quot;: &quot;aliyun&quot;, &quot;KmsKeyID&quot;:&quot;afce5722-81d2-43c3-9930-7601da11****&quot;,&quot;KmsKeyExpireInterval&quot;:&quot;3600&quot;}</p>
     */
    @NameInMap("EncryptParameters")
    public String encryptParameters;

    /**
     * <p>Other adaptive settings that align the transcoded stream with the source stream. Fields:</p>
     * <ul>
     * <li><p><strong>KeyFrameOpen</strong>: Specifies whether to align keyframes with the source stream. Valid values: yes and no.</p>
     * </li>
     * <li><p><strong>Copyts (string)</strong>: Specifies whether to align the presentation timestamp (PTS) with the source stream. Valid values: yes and no.</p>
     * </li>
     * <li><p><strong>SeiMode</strong>: The pass-through mode for Supplemental Enhancement Information (SEI). Valid values: 0 (disabled), 1 (pass through partial parameters), and 2 (pass through all).</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;KeyFrameOpen&quot;:&quot;yes&quot;,&quot;Copyts&quot;:&quot;yes&quot;,&quot;SeiMode&quot;:1}</p>
     */
    @NameInMap("ExtWithSource")
    public String extWithSource;

    /**
     * <p>The frame rate of the output video. Unit: frames per second (FPS). Valid values: 1 to <strong>60</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("FPS")
    public Integer FPS;

    /**
     * <p>Adapts the output frame rate based on the source\&quot;s frame rate, while keeping it within a specified range. If specified, it overrides the FPS parameter. Fields:</p>
     * <ul>
     * <li><p><strong>UpLimit (integer):</strong> Required. The upper limit of the frame rate. This must be an integer from 1 to 60 and greater than the lower limit.</p>
     * </li>
     * <li><p><strong>LowerLimit (integer):</strong> Required. The lower limit of the frame rate. This must be an integer from 1 to 60 and less than the upper limit.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;UpLimit&quot;:60,&quot;LowerLimit&quot;:1}</p>
     */
    @NameInMap("FpsWithSource")
    public String fpsWithSource;

    /**
     * <p>The Group of Pictures (GOP) size. The unit can be frame or second. Valid values:</p>
     * <ul>
     * <li><p>By frames: 1 to 3000.</p>
     * </li>
     * <li><p>By seconds: 1s to 20s.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Gop")
    public String gop;

    /**
     * <p>Output video height in pixels. Requirements:</p>
     * <ul>
     * <li><p><strong>Height ≥ 100</strong></p>
     * </li>
     * <li><p><strong>max(Height, Width) ≤ 2560</strong></p>
     * </li>
     * <li><p><strong>min(Height, Width) ≤ 1440</strong></p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>For h265-nbhd templates, it cannot exceed 720.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>720</p>
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
     * <p>yes</p>
     */
    @NameInMap("Lazy")
    public String lazy;

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
     * <p>The adaptive resolution settings. If specified, it overrides the Height and Width parameters. Fieds:</p>
     * <ul>
     * <li><p><strong>Type (string):</strong> Required. Valid values:</p>
     * <ul>
     * <li><p><strong>short</strong>: sets the shorter edge of the video to the specified value and scales the other edge to maintain the original aspect ratio.</p>
     * </li>
     * <li><p><strong>long</strong>: sets the longer edge of the video to the specified value and scales the other edge to maintain the original aspect ratio.</p>
     * </li>
     * <li><p><strong>screen</strong>: Matches the output to a standard resolution, automatically flipping the dimensions based on the source\&quot;s orientation.</p>
     * </li>
     * </ul>
     * </li>
     * <li><p><strong>Value (string):</strong> Required. Valid values:</p>
     * <ul>
     * <li><p>For short: 360, 480, 540, 720, and 1080.</p>
     * </li>
     * <li><p>For long: 640, 848, 960, 1280, and 1920.</p>
     * </li>
     * <li><p>For screen: 640×360, 848×480, 960×540, 1280×720, and 1920×1080.</p>
     * </li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;Type&quot;:&quot;short&quot;,&quot;Value&quot;:&quot;1080&quot;}</p>
     */
    @NameInMap("ResWithSource")
    public String resWithSource;

    /**
     * <p>The custom name of the transcoding template. This parameter cannot be modified.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>LiveCusTranscode****</p>
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
     * <p>The system tries to transcode the video at the specified bitrate. However, the actual bitrate may not be the same as the specified value, especially when the specified value is too high or too low.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>720</p>
     */
    @NameInMap("VideoBitrate")
    public Integer videoBitrate;

    /**
     * <p>Output video width in pixels.</p>
     * <p>Requirements:</p>
     * <ul>
     * <li><p><strong>Width ≥ 100</strong></p>
     * </li>
     * <li><p><strong>max(Height, Width) ≤ 2560</strong></p>
     * </li>
     * <li><p><strong>min(Height, Width) ≤ 1440</strong></p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>For h265-nbhd templates, it cannot exceed 1280.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>576</p>
     */
    @NameInMap("Width")
    public Integer width;

    public static UpdateCustomLiveStreamTranscodeRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateCustomLiveStreamTranscodeRequest self = new UpdateCustomLiveStreamTranscodeRequest();
        return TeaModel.build(map, self);
    }

    public UpdateCustomLiveStreamTranscodeRequest setApp(String app) {
        this.app = app;
        return this;
    }
    public String getApp() {
        return this.app;
    }

    public UpdateCustomLiveStreamTranscodeRequest setAudioBitrate(Integer audioBitrate) {
        this.audioBitrate = audioBitrate;
        return this;
    }
    public Integer getAudioBitrate() {
        return this.audioBitrate;
    }

    public UpdateCustomLiveStreamTranscodeRequest setAudioChannelNum(Integer audioChannelNum) {
        this.audioChannelNum = audioChannelNum;
        return this;
    }
    public Integer getAudioChannelNum() {
        return this.audioChannelNum;
    }

    public UpdateCustomLiveStreamTranscodeRequest setAudioCodec(String audioCodec) {
        this.audioCodec = audioCodec;
        return this;
    }
    public String getAudioCodec() {
        return this.audioCodec;
    }

    public UpdateCustomLiveStreamTranscodeRequest setAudioProfile(String audioProfile) {
        this.audioProfile = audioProfile;
        return this;
    }
    public String getAudioProfile() {
        return this.audioProfile;
    }

    public UpdateCustomLiveStreamTranscodeRequest setAudioRate(Integer audioRate) {
        this.audioRate = audioRate;
        return this;
    }
    public Integer getAudioRate() {
        return this.audioRate;
    }

    public UpdateCustomLiveStreamTranscodeRequest setBitrateWithSource(String bitrateWithSource) {
        this.bitrateWithSource = bitrateWithSource;
        return this;
    }
    public String getBitrateWithSource() {
        return this.bitrateWithSource;
    }

    public UpdateCustomLiveStreamTranscodeRequest setDeInterlaced(Boolean deInterlaced) {
        this.deInterlaced = deInterlaced;
        return this;
    }
    public Boolean getDeInterlaced() {
        return this.deInterlaced;
    }

    public UpdateCustomLiveStreamTranscodeRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public UpdateCustomLiveStreamTranscodeRequest setEncryptParameters(String encryptParameters) {
        this.encryptParameters = encryptParameters;
        return this;
    }
    public String getEncryptParameters() {
        return this.encryptParameters;
    }

    public UpdateCustomLiveStreamTranscodeRequest setExtWithSource(String extWithSource) {
        this.extWithSource = extWithSource;
        return this;
    }
    public String getExtWithSource() {
        return this.extWithSource;
    }

    public UpdateCustomLiveStreamTranscodeRequest setFPS(Integer FPS) {
        this.FPS = FPS;
        return this;
    }
    public Integer getFPS() {
        return this.FPS;
    }

    public UpdateCustomLiveStreamTranscodeRequest setFpsWithSource(String fpsWithSource) {
        this.fpsWithSource = fpsWithSource;
        return this;
    }
    public String getFpsWithSource() {
        return this.fpsWithSource;
    }

    public UpdateCustomLiveStreamTranscodeRequest setGop(String gop) {
        this.gop = gop;
        return this;
    }
    public String getGop() {
        return this.gop;
    }

    public UpdateCustomLiveStreamTranscodeRequest setHeight(Integer height) {
        this.height = height;
        return this;
    }
    public Integer getHeight() {
        return this.height;
    }

    public UpdateCustomLiveStreamTranscodeRequest setLazy(String lazy) {
        this.lazy = lazy;
        return this;
    }
    public String getLazy() {
        return this.lazy;
    }

    public UpdateCustomLiveStreamTranscodeRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public UpdateCustomLiveStreamTranscodeRequest setProfile(Integer profile) {
        this.profile = profile;
        return this;
    }
    public Integer getProfile() {
        return this.profile;
    }

    public UpdateCustomLiveStreamTranscodeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateCustomLiveStreamTranscodeRequest setResWithSource(String resWithSource) {
        this.resWithSource = resWithSource;
        return this;
    }
    public String getResWithSource() {
        return this.resWithSource;
    }

    public UpdateCustomLiveStreamTranscodeRequest setTemplate(String template) {
        this.template = template;
        return this;
    }
    public String getTemplate() {
        return this.template;
    }

    public UpdateCustomLiveStreamTranscodeRequest setTemplateType(String templateType) {
        this.templateType = templateType;
        return this;
    }
    public String getTemplateType() {
        return this.templateType;
    }

    public UpdateCustomLiveStreamTranscodeRequest setVideoBitrate(Integer videoBitrate) {
        this.videoBitrate = videoBitrate;
        return this;
    }
    public Integer getVideoBitrate() {
        return this.videoBitrate;
    }

    public UpdateCustomLiveStreamTranscodeRequest setWidth(Integer width) {
        this.width = width;
        return this;
    }
    public Integer getWidth() {
        return this.width;
    }

}
