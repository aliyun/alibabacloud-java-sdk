// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class UpdateCustomLiveStreamTranscodeRequest extends TeaModel {
    /**
     * <p>The name of the application to which the stream belongs, and it cannot be modified.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>liveApp****</p>
     */
    @NameInMap("App")
    public String app;

    /**
     * <p>Audio transcoding bitrate. Unit: kbps, value range: 1 to 1000.</p>
     * 
     * <strong>example:</strong>
     * <p>512</p>
     */
    @NameInMap("AudioBitrate")
    public Integer audioBitrate;

    /**
     * <p>Number of audio channels. Values: </p>
     * <ul>
     * <li>1: Mono. </li>
     * <li>2: Stereo.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("AudioChannelNum")
    public Integer audioChannelNum;

    /**
     * <p>Audio encoding format. Values: </p>
     * <ul>
     * <li>aac </li>
     * <li>mp3</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>aac</p>
     */
    @NameInMap("AudioCodec")
    public String audioCodec;

    /**
     * <p>Audio encoding. Values: </p>
     * <ul>
     * <li>aac_low</li>
     * <li>aac_he</li>
     * <li>aac_he_v2 </li>
     * <li>aac_ld</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>aac_low</p>
     */
    @NameInMap("AudioProfile")
    public String audioProfile;

    /**
     * <p>Audio sampling rate. Values: 22050, 32000, 44100, 48000, 96000. Unit: Hz.</p>
     * <blockquote>
     * <p>If <strong>AudioProfile</strong> is set to <strong>aac_ld</strong>, the sampling rate must not exceed 44100.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>96000</p>
     */
    @NameInMap("AudioRate")
    public Integer audioRate;

    /**
     * <p>The source-based bitrate settings. This parameter takes precedence over other bitrate settings. The following fields must be included:</p>
     * <ul>
     * <li><strong>UpLimit</strong>: the maximum bitrate. Set this field to an integer from 128 to 10000. The value must be greater than the minimum bitrate.</li>
     * <li><strong>LowerLimit</strong>: the minimum bitrate. Set this field to an integer from 128 to 10000. The value must be smaller than the maximum bitrate.</li>
     * <li><strong>Factor</strong>: the ratio of the output bitrate to the source bitrate. Valid values: 0.1 to 1. The value is accurate to one decimal place. A value of 1 indicates that the output video has the same bitrate as the source video.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;UpLimit\&quot;:2500,\&quot;LowerLimit\&quot;:800,\&quot;Factor\&quot;:1}</p>
     */
    @NameInMap("BitrateWithSource")
    public String bitrateWithSource;

    /**
     * <p>Streamer domain name, unmodifiable.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("Domain")
    public String domain;

    /**
     * <p>Encryption configuration. JSON format, with the following fields: </p>
     * <ul>
     * <li>EncryptType: Type of encryption. Fixed value is aliyun.</li>
     * <li>KmsKeyID: User\&quot;s KMS master key ID. </li>
     * <li>KmsKeyExpireInterval: Key rotation period. Value range: 60~3600, unit: seconds.<blockquote>
     * <p>When using DRM encryption, KmsKeyID cannot be modified.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;EncryptType&quot;: &quot;aliyun&quot;, &quot;KmsKeyID&quot;:&quot;afce5722-81d2-43c3-9930-7601da11****&quot;,&quot;KmsKeyExpireInterval&quot;:&quot;3600&quot;}</p>
     */
    @NameInMap("EncryptParameters")
    public String encryptParameters;

    /**
     * <p>Other source-based settings. The following fields are included:</p>
     * <ul>
     * <li><strong>KeyFrameOpen</strong>: Valid values: yes and no.</li>
     * <li><strong>Copyts</strong>: Valid values: yes and no.</li>
     * <li><strong>SeiMode</strong>: Valid values: 0, 1, and 2. 0 specifies that no supplemental enhancement information (SEI) messages are passed through, 1 specifies that part of SEI messages are passed through, and 2 specifies that all SEI messages are passed through.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;KeyFrameOpen\&quot;:\&quot;yes\&quot;,\&quot;Copyts\&quot;:\&quot;yes\&quot;,\&quot;SeiMode\&quot;:1}</p>
     */
    @NameInMap("ExtWithSource")
    public String extWithSource;

    /**
     * <p>Transcode video frame rate. Unit: FPS, value range: 1 to 60.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("FPS")
    public Integer FPS;

    /**
     * <p>The source-based frame rate settings. This parameter takes precedence over other frame rate settings. The following fields must be included:</p>
     * <ul>
     * <li><strong>UpLimit</strong>: the maximum frame rate. Set this field to an integer from 1 to 60. The value must be greater than the minimum frame rate.</li>
     * <li><strong>LowerLimit</strong>: the minimum frame rate. Set this field to an integer from 1 to 60. The value must be smaller than the maximum frame rate.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;UpLimit\&quot;:60,\&quot;LowerLimit\&quot;:1}</p>
     */
    @NameInMap("FpsWithSource")
    public String fpsWithSource;

    /**
     * <p>Video GOP (Group of Pictures), supports units in frames or seconds. When the unit is frames, the value should be {number}; when the unit is seconds, the value should be {number}s. </p>
     * <ul>
     * <li>For frames, the range is 1 to 3000. </li>
     * <li>For seconds, the range is 1 to 20s.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Gop")
    public String gop;

    /**
     * <p>Video transcoding height. Unit: pixels. The value must meet the following three conditions:</p>
     * <ul>
     * <li>Height ≥ 100: The height of the video must be no less than 100 pixels.</li>
     * <li>max(Height, Width) ≤ 2560: The larger of the video\&quot;s width and height cannot exceed 2560.</li>
     * <li>min(Height, Width) ≤ 1440: The smaller of the video\&quot;s width and height cannot exceed 1440.<blockquote>
     * <p>For 265 narrowband HD templates, the maximum resolution is 1280×720.</p>
     * </blockquote>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>720</p>
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
     * <p>yes</p>
     */
    @NameInMap("Lazy")
    public String lazy;

    @NameInMap("OwnerId")
    public Long ownerId;

    /**
     * <p>Encoding level. A set of specific encoding features supported by the video, generally, the higher the value, the better the picture quality, but also the higher the resources consumed for encoding and decoding. Values: </p>
     * <ul>
     * <li>1: baseline (suitable for mobile devices).</li>
     * <li>2: main (suitable for standard resolution devices). </li>
     * <li>3: high (suitable for high-resolution devices).</li>
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
     * <p>The source-based resolution settings. This parameter takes precedence over other resolution settings. The following fields must be included:</p>
     * <ul>
     * <li><p><strong>Type</strong>: You can set this field to short, long, or screen. short specifies that the resolution of the output video is adapted to the shorter side, long specifies that the resolution of the output video is adapted to the longer side, and screen specifies that the output video has an adaptive resolution.</p>
     * </li>
     * <li><p><strong>Value</strong>:</p>
     * <ul>
     * <li>Set this field to 360, 480, 540, 720, or 1080 if the Type field is set to short.</li>
     * <li>Set this field to 640, 848, 960, 1280, or 1920 if the Type field is set to long.</li>
     * <li>Set this field to 640\*360, 848\*480, 960\*540, 1280\*720, or 1920\*1080 if the Type field is set to screen.</li>
     * </ul>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{\&quot;Type\&quot;:\&quot;short\&quot;,\&quot;Value\&quot;:\&quot;1080\&quot;}</p>
     */
    @NameInMap("ResWithSource")
    public String resWithSource;

    /**
     * <p>Custom name of the transcoding template, not modifiable.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>LiveCusTranscode****</p>
     */
    @NameInMap("Template")
    public String template;

    /**
     * <p>Custom transcoding template type, unmodifiable.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>h264</p>
     */
    @NameInMap("TemplateType")
    public String templateType;

    /**
     * <p>Video transcoding bitrate. Unit: kbps, value range: 1 to 6000.</p>
     * <blockquote>
     * <p>The actual bitrate of the transcoded video will try to be as close as possible to the one you set, but it cannot be guaranteed to be exactly the same, especially when the set bitrate is too high or too low.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>720</p>
     */
    @NameInMap("VideoBitrate")
    public Integer videoBitrate;

    /**
     * <p>Video transcoding width. Unit: pixels. The value must meet the following three conditions: </p>
     * <ul>
     * <li>Width ≥ 100: The video width must be no less than 100 pixels. </li>
     * <li>max(Height, Width) ≤ 2560: The larger of the video\&quot;s height and width cannot exceed 2560. </li>
     * <li>min(Height, Width) ≤ 1440: The smaller of the video\&quot;s height and width cannot exceed 1440.<blockquote>
     * <p>For 265 narrowband HD templates, the maximum resolution is 1280×720.</p>
     * </blockquote>
     * </li>
     * </ul>
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
