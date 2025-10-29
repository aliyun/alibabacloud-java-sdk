// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class AddCustomLiveStreamTranscodeRequest extends TeaModel {
    /**
     * <p>The name of the application to which the live stream belongs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>liveApp****</p>
     */
    @NameInMap("App")
    public String app;

    /**
     * <p>The bitrate of the output audio. Unit: Kbit/s. Valid values: <strong>1 to 1000</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>512</p>
     */
    @NameInMap("AudioBitrate")
    public Integer audioBitrate;

    /**
     * <p>The number of sound channels. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: mono.</li>
     * <li><strong>2</strong>: binaural.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("AudioChannelNum")
    public Integer audioChannelNum;

    /**
     * <p>The audio encoding format. Valid values:</p>
     * <ul>
     * <li><strong>AAC</strong></li>
     * <li><strong>MP3</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>AAC</p>
     */
    @NameInMap("AudioCodec")
    public String audioCodec;

    /**
     * <p>The audio encoding profile. Valid values:</p>
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
     * <p>The audio sampling rate. Valid values: <strong>22050 to 96000</strong>.</p>
     * <blockquote>
     * <p>Notice: If you set AudioProfile to <strong>aac_ld</strong>, the audio sampling rate cannot exceed 44100.</p>
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
     * <li><strong>UpLimit</strong>: the maximum bitrate limit. Valid values: an integer from 128 to 10000. The value must be greater than the minimum bitrate.</li>
     * <li><strong>LowerLimit int</strong> : the minimum bitrate rate. Valid values: an integer from 128 to 10000. The value must be smaller than the maximum bitrate.</li>
     * <li><strong>Factor</strong>: The ratio of the output bitrate to the source bitrate. Valid values: 0.1 to 1. The value is accurate to one decimal place. A value of 1 indicates that the output video has the same bitrate as the source video.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;UpLimit&quot;:2500,&quot;LowerLimit&quot;:800,&quot;Factor&quot;:1}</p>
     */
    @NameInMap("BitrateWithSource")
    public String bitrateWithSource;

    @NameInMap("DeInterlaced")
    public Boolean deInterlaced;

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
     * <p>Encryption configuration. In JSON format, the fields are explained as follows:</p>
     * <ul>
     * <li><strong>EncryptType</strong>: Encryption type. Fixed value is aliyun.</li>
     * <li><strong>KmsKeyID</strong>: User KMS master key ID.</li>
     * <li><strong>KmsKeyExpireInterval</strong>: Key rotation period. Range: 60~3600, unit: seconds.<blockquote>
     * <p>If the EncryptParameters is configured, the KmsKeyID, KmsUID, and KmsKeyExpireInterval parameters cannot be empty</p>
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
     * <p>Other source-based settings, including the following fields:</p>
     * <ul>
     * <li><strong>KeyFrameOpen</strong>: specifies whether to use the key frames of the source video. Valid values: yes or no.</li>
     * <li><strong>Copyts</strong>: specifies whether to use the presentation time stamp (PTS) of the source video. Valid values: yes or no.</li>
     * <li><strong>SeiMode</strong>: specifies whether to pass through supplemental enhancement information (SEI) messages. Valid values: 0, 1, and 2, where 0 specifies that no SEI messages are passed through, 1 specifies that part of SEI messages are passed through, and 2 specifies that all SEI messages are passed through.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;KeyFrameOpen&quot;:&quot;yes&quot;,&quot;Copyts&quot;:&quot;yes&quot;,&quot;SeiMode&quot;:1}</p>
     */
    @NameInMap("ExtWithSource")
    public String extWithSource;

    /**
     * <p>The frame rate of the output video. Unit: frames per second (FPS). Valid values: <strong>1 to 60</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>30</p>
     */
    @NameInMap("FPS")
    public Integer FPS;

    /**
     * <p>The source-based frame rate settings. This parameter takes precedence over other frame rate settings. The following fields must be included:</p>
     * <ul>
     * <li><strong>UpLimit</strong>: the maximum frame rate. Valid values: an integer from 1 to 60. The value must be greater than the minimum frame rate.</li>
     * <li><strong>LowerLimit</strong>: the minimum frame rate. Valid values: an integer from 1 to 60. The value must be smaller than the maximum frame rate.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>{&quot;UpLimit&quot;:60,&quot;LowerLimit&quot;:1}</p>
     */
    @NameInMap("FpsWithSource")
    public String fpsWithSource;

    /**
     * <p>The Group of Picture (GOP) size of the video. Unit: frames or seconds.</p>
     * <ul>
     * <li>Unit: frames. Valid values: <strong>1 to 3000</strong>.</li>
     * <li>Unit: seconds. Valid value: <strong>1 to 20</strong>.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("Gop")
    public String gop;

    /**
     * <p>The height of the output video. Unit: pixel. Valid values:</p>
     * <p>The value must comply with all the following rules:</p>
     * <ul>
     * <li><strong>Height ≥ 100</strong>: The height of the video is greater than or equal to 100 pixels.</li>
     * <li><strong>max(Height,Width) ≤ 2560</strong>: The width or height of the video, whichever is greater, cannot exceed 2,560 pixels.</li>
     * <li><strong>min(Height,Width) ≤ 1440</strong>: The width or height of the video, whichever is smaller, cannot exceed 1,440 pixels.</li>
     * </ul>
     * <blockquote>
     * <p>The resolution of the output video that is transcoded by using the H.265 Narrowband HD™ transcoding template cannot exceed 1280 × 720 pixels.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>720</p>
     */
    @NameInMap("Height")
    public Integer height;

    /**
     * <p>The rotation period of the CMK. Valid values: 60 to 3600. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>3600</p>
     */
    @NameInMap("KmsKeyExpireInterval")
    public String kmsKeyExpireInterval;

    /**
     * <p>The ID of the customer master key (CMK) that you created in Key Management Service (KMS).</p>
     * 
     * <strong>example:</strong>
     * <p>afce5722-81d2-43c3-9930-7601da11****</p>
     */
    @NameInMap("KmsKeyID")
    public String kmsKeyID;

    /**
     * <p>The ID of your KMS account.</p>
     * 
     * <strong>example:</strong>
     * <p>25346073170691****</p>
     */
    @NameInMap("KmsUID")
    public String kmsUID;

    /**
     * <p>Specifies whether to use the load-on-demand mechanism for transcoding. Valid values: yes and no. Default value: <strong>yes</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>yes</p>
     */
    @NameInMap("Lazy")
    public String lazy;

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
     * <p>{&quot;Type&quot;:&quot;short&quot;,&quot;Value&quot;:&quot;1080&quot;}</p>
     */
    @NameInMap("ResWithSource")
    public String resWithSource;

    /**
     * <p>The name of the custom transcoding template.</p>
     * <blockquote>
     * <p>The name can contain digits, letters, and hyphens (-), and must start with a letter or digit. The name must be different from the names of any default transcoding templates.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>LiveCusTranscode****</p>
     */
    @NameInMap("Template")
    public String template;

    /**
     * <p>The type of the custom transcoding template. Valid values:</p>
     * <ul>
     * <li><strong>h264</strong>: custom H.264 standard transcoding.</li>
     * <li><strong>h264-nbhd</strong>: custom H.264 Narrowband HD™ transcoding.</li>
     * <li><strong>h265</strong>: custom H.265 standard transcoding.</li>
     * <li><strong>h265-nbhd</strong>: custom H.265 Narrowband HD™ transcoding.</li>
     * <li><strong>audio</strong>: audio-only transcoding.</li>
     * </ul>
     * <blockquote>
     * <p>If you set <strong>TemplateType</strong> to <strong>h264</strong>, <strong>h264-nbhd</strong>, <strong>h265</strong>, or <strong>h265-nbhd</strong>, the <strong>Height</strong>, <strong>Width</strong>, <strong>FPS</strong>, and <strong>VideoBitrate</strong> parameters are required.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>h264</p>
     */
    @NameInMap("TemplateType")
    public String templateType;

    /**
     * <p>The bitrate of the output video. Unit: Kbit/s. Valid values: <strong>1 to 6000</strong>.</p>
     * <blockquote>
     * <p>The bitrate of the output video may not be the same as the value that you specify, but is as close to the value as possible, especially when the value is excessively large or small.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>720</p>
     */
    @NameInMap("VideoBitrate")
    public Integer videoBitrate;

    /**
     * <p>The width of the output video. Unit: pixel. Valid values:</p>
     * <p>The value must comply with all the following rules:</p>
     * <ul>
     * <li><strong>Width ≥ 100</strong>: The width of the video is greater than or equal to 100 pixels.</li>
     * <li><strong>max(Height,Width) ≤ 2560</strong>: The width or height of the video, whichever is greater, cannot exceed 2,560 pixels.</li>
     * <li><strong>min(Height,Width) ≤ 1440</strong>: The width or height of the video, whichever is smaller, cannot exceed 1,440 pixels.</li>
     * </ul>
     * <blockquote>
     * <p>The resolution of the output video that is transcoded by using the H.265 Narrowband HD™ transcoding template cannot exceed 1280 × 720 pixels.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>576</p>
     */
    @NameInMap("Width")
    public Integer width;

    public static AddCustomLiveStreamTranscodeRequest build(java.util.Map<String, ?> map) throws Exception {
        AddCustomLiveStreamTranscodeRequest self = new AddCustomLiveStreamTranscodeRequest();
        return TeaModel.build(map, self);
    }

    public AddCustomLiveStreamTranscodeRequest setApp(String app) {
        this.app = app;
        return this;
    }
    public String getApp() {
        return this.app;
    }

    public AddCustomLiveStreamTranscodeRequest setAudioBitrate(Integer audioBitrate) {
        this.audioBitrate = audioBitrate;
        return this;
    }
    public Integer getAudioBitrate() {
        return this.audioBitrate;
    }

    public AddCustomLiveStreamTranscodeRequest setAudioChannelNum(Integer audioChannelNum) {
        this.audioChannelNum = audioChannelNum;
        return this;
    }
    public Integer getAudioChannelNum() {
        return this.audioChannelNum;
    }

    public AddCustomLiveStreamTranscodeRequest setAudioCodec(String audioCodec) {
        this.audioCodec = audioCodec;
        return this;
    }
    public String getAudioCodec() {
        return this.audioCodec;
    }

    public AddCustomLiveStreamTranscodeRequest setAudioProfile(String audioProfile) {
        this.audioProfile = audioProfile;
        return this;
    }
    public String getAudioProfile() {
        return this.audioProfile;
    }

    public AddCustomLiveStreamTranscodeRequest setAudioRate(Integer audioRate) {
        this.audioRate = audioRate;
        return this;
    }
    public Integer getAudioRate() {
        return this.audioRate;
    }

    public AddCustomLiveStreamTranscodeRequest setBitrateWithSource(String bitrateWithSource) {
        this.bitrateWithSource = bitrateWithSource;
        return this;
    }
    public String getBitrateWithSource() {
        return this.bitrateWithSource;
    }

    public AddCustomLiveStreamTranscodeRequest setDeInterlaced(Boolean deInterlaced) {
        this.deInterlaced = deInterlaced;
        return this;
    }
    public Boolean getDeInterlaced() {
        return this.deInterlaced;
    }

    public AddCustomLiveStreamTranscodeRequest setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public AddCustomLiveStreamTranscodeRequest setEncryptParameters(String encryptParameters) {
        this.encryptParameters = encryptParameters;
        return this;
    }
    public String getEncryptParameters() {
        return this.encryptParameters;
    }

    public AddCustomLiveStreamTranscodeRequest setExtWithSource(String extWithSource) {
        this.extWithSource = extWithSource;
        return this;
    }
    public String getExtWithSource() {
        return this.extWithSource;
    }

    public AddCustomLiveStreamTranscodeRequest setFPS(Integer FPS) {
        this.FPS = FPS;
        return this;
    }
    public Integer getFPS() {
        return this.FPS;
    }

    public AddCustomLiveStreamTranscodeRequest setFpsWithSource(String fpsWithSource) {
        this.fpsWithSource = fpsWithSource;
        return this;
    }
    public String getFpsWithSource() {
        return this.fpsWithSource;
    }

    public AddCustomLiveStreamTranscodeRequest setGop(String gop) {
        this.gop = gop;
        return this;
    }
    public String getGop() {
        return this.gop;
    }

    public AddCustomLiveStreamTranscodeRequest setHeight(Integer height) {
        this.height = height;
        return this;
    }
    public Integer getHeight() {
        return this.height;
    }

    public AddCustomLiveStreamTranscodeRequest setKmsKeyExpireInterval(String kmsKeyExpireInterval) {
        this.kmsKeyExpireInterval = kmsKeyExpireInterval;
        return this;
    }
    public String getKmsKeyExpireInterval() {
        return this.kmsKeyExpireInterval;
    }

    public AddCustomLiveStreamTranscodeRequest setKmsKeyID(String kmsKeyID) {
        this.kmsKeyID = kmsKeyID;
        return this;
    }
    public String getKmsKeyID() {
        return this.kmsKeyID;
    }

    public AddCustomLiveStreamTranscodeRequest setKmsUID(String kmsUID) {
        this.kmsUID = kmsUID;
        return this;
    }
    public String getKmsUID() {
        return this.kmsUID;
    }

    public AddCustomLiveStreamTranscodeRequest setLazy(String lazy) {
        this.lazy = lazy;
        return this;
    }
    public String getLazy() {
        return this.lazy;
    }

    public AddCustomLiveStreamTranscodeRequest setOwnerId(Long ownerId) {
        this.ownerId = ownerId;
        return this;
    }
    public Long getOwnerId() {
        return this.ownerId;
    }

    public AddCustomLiveStreamTranscodeRequest setProfile(Integer profile) {
        this.profile = profile;
        return this;
    }
    public Integer getProfile() {
        return this.profile;
    }

    public AddCustomLiveStreamTranscodeRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public AddCustomLiveStreamTranscodeRequest setResWithSource(String resWithSource) {
        this.resWithSource = resWithSource;
        return this;
    }
    public String getResWithSource() {
        return this.resWithSource;
    }

    public AddCustomLiveStreamTranscodeRequest setTemplate(String template) {
        this.template = template;
        return this;
    }
    public String getTemplate() {
        return this.template;
    }

    public AddCustomLiveStreamTranscodeRequest setTemplateType(String templateType) {
        this.templateType = templateType;
        return this;
    }
    public String getTemplateType() {
        return this.templateType;
    }

    public AddCustomLiveStreamTranscodeRequest setVideoBitrate(Integer videoBitrate) {
        this.videoBitrate = videoBitrate;
        return this;
    }
    public Integer getVideoBitrate() {
        return this.videoBitrate;
    }

    public AddCustomLiveStreamTranscodeRequest setWidth(Integer width) {
        this.width = width;
        return this;
    }
    public Integer getWidth() {
        return this.width;
    }

}
