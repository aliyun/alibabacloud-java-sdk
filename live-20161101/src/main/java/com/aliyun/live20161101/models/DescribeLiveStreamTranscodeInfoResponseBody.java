// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveStreamTranscodeInfoResponseBody extends TeaModel {
    /**
     * <p>The transcoding configurations.</p>
     */
    @NameInMap("DomainTranscodeList")
    public DescribeLiveStreamTranscodeInfoResponseBodyDomainTranscodeList domainTranscodeList;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>62136AE6-7793-45ED-B14A-60D19A9486D3</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeLiveStreamTranscodeInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveStreamTranscodeInfoResponseBody self = new DescribeLiveStreamTranscodeInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLiveStreamTranscodeInfoResponseBody setDomainTranscodeList(DescribeLiveStreamTranscodeInfoResponseBodyDomainTranscodeList domainTranscodeList) {
        this.domainTranscodeList = domainTranscodeList;
        return this;
    }
    public DescribeLiveStreamTranscodeInfoResponseBodyDomainTranscodeList getDomainTranscodeList() {
        return this.domainTranscodeList;
    }

    public DescribeLiveStreamTranscodeInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeLiveStreamTranscodeInfoResponseBodyDomainTranscodeListDomainTranscodeInfoCustomTranscodeParameters extends TeaModel {
        /**
         * <p>The bitrate of the output audio. Unit: Kbit/s. Valid values: <strong>1 to 1000</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>64</p>
         */
        @NameInMap("AudioBitrate")
        public Integer audioBitrate;

        /**
         * <p>The number of sound channels. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: mono</li>
         * <li><strong>2</strong>: binaural</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("AudioChannelNum")
        public Integer audioChannelNum;

        /**
         * <p>The audio encoding format.</p>
         * 
         * <strong>example:</strong>
         * <p>ACC</p>
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
         * <p> If the value of AudioProfile is <strong>aac_ld</strong>, the audio sampling rate cannot exceed 44100.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>44100</p>
         */
        @NameInMap("AudioRate")
        public Integer audioRate;

        /**
         * <p>Indicates whether B-frame removal is enabled. Fixed value: <strong>0</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Bframes")
        public String bframes;

        /**
         * <p>The source-based bitrate settings.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;UpLimit\&quot;:2500,\&quot;LowerLimit\&quot;:800,\&quot;Factor\&quot;:1}</p>
         */
        @NameInMap("BitrateWithSource")
        public java.util.Map<String, ?> bitrateWithSource;

        /**
         * <p>Other source-based settings.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;KeyFrameOpen\&quot;:\&quot;yes\&quot;,\&quot;Copyts\&quot;:\&quot;yes\&quot;,\&quot;SeiMode\&quot;:1}</p>
         */
        @NameInMap("ExtWithSource")
        public java.util.Map<String, ?> extWithSource;

        /**
         * <p>The frame rate of the output video. Unit: frames per second (FPS).</p>
         * 
         * <strong>example:</strong>
         * <p>15</p>
         */
        @NameInMap("FPS")
        public Integer FPS;

        /**
         * <p>The source-based frame rate settings.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;UpLimit\&quot;:60,\&quot;LowerLimit\&quot;:1}</p>
         */
        @NameInMap("FpsWithSource")
        public java.util.Map<String, ?> fpsWithSource;

        /**
         * <p>The group of pictures (GOP) size of the output video. Unit: frames. Valid values: <strong>1 to 3000</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("Gop")
        public String gop;

        /**
         * <p>The height of the output video.</p>
         * 
         * <strong>example:</strong>
         * <p>1200</p>
         */
        @NameInMap("Height")
        public Integer height;

        /**
         * <p>The source-based resolution settings.</p>
         * 
         * <strong>example:</strong>
         * <p>{\&quot;Type\&quot;:\&quot;short\&quot;,\&quot;Value\&quot;:\&quot;1080\&quot;}</p>
         */
        @NameInMap("ResWithSource")
        public java.util.Map<String, ?> resWithSource;

        /**
         * <p>The Real-Time Transcoding (RTS) flag. Fixed value: <strong>true</strong>.</p>
         * <blockquote>
         * <p> This parameter is returned only if RTS is used for transcoding.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("RtsFlag")
        public String rtsFlag;

        /**
         * <p>The type of the custom transcoding template. Valid values:</p>
         * <ul>
         * <li><strong>h264</strong>: custom H.264 standard transcoding</li>
         * <li><strong>h264-nbhd</strong>: custom H.264 Narrowband HD™ transcoding</li>
         * <li><strong>h265</strong>: custom H.265 standard transcoding</li>
         * <li><strong>h265-nbhd</strong>: custom H.265 Narrowband HD™ transcoding</li>
         * <li><strong>audio</strong>: audio-only transcoding</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>h264</p>
         */
        @NameInMap("TemplateType")
        public String templateType;

        /**
         * <p>The bitrate of the output video. Unit: Kbit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>3000</p>
         */
        @NameInMap("VideoBitrate")
        public Integer videoBitrate;

        /**
         * <p>The video encoding profile. Valid values:</p>
         * <ul>
         * <li><strong>baseline</strong>: suitable for mobile devices.</li>
         * <li><strong>main</strong>: suitable for standard-definition devices.</li>
         * <li><strong>high</strong>: suitable for high-definition devices.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>high</p>
         */
        @NameInMap("VideoProfile")
        public String videoProfile;

        /**
         * <p>The width of the output video.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
         */
        @NameInMap("Width")
        public Integer width;

        public static DescribeLiveStreamTranscodeInfoResponseBodyDomainTranscodeListDomainTranscodeInfoCustomTranscodeParameters build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveStreamTranscodeInfoResponseBodyDomainTranscodeListDomainTranscodeInfoCustomTranscodeParameters self = new DescribeLiveStreamTranscodeInfoResponseBodyDomainTranscodeListDomainTranscodeInfoCustomTranscodeParameters();
            return TeaModel.build(map, self);
        }

        public DescribeLiveStreamTranscodeInfoResponseBodyDomainTranscodeListDomainTranscodeInfoCustomTranscodeParameters setAudioBitrate(Integer audioBitrate) {
            this.audioBitrate = audioBitrate;
            return this;
        }
        public Integer getAudioBitrate() {
            return this.audioBitrate;
        }

        public DescribeLiveStreamTranscodeInfoResponseBodyDomainTranscodeListDomainTranscodeInfoCustomTranscodeParameters setAudioChannelNum(Integer audioChannelNum) {
            this.audioChannelNum = audioChannelNum;
            return this;
        }
        public Integer getAudioChannelNum() {
            return this.audioChannelNum;
        }

        public DescribeLiveStreamTranscodeInfoResponseBodyDomainTranscodeListDomainTranscodeInfoCustomTranscodeParameters setAudioCodec(String audioCodec) {
            this.audioCodec = audioCodec;
            return this;
        }
        public String getAudioCodec() {
            return this.audioCodec;
        }

        public DescribeLiveStreamTranscodeInfoResponseBodyDomainTranscodeListDomainTranscodeInfoCustomTranscodeParameters setAudioProfile(String audioProfile) {
            this.audioProfile = audioProfile;
            return this;
        }
        public String getAudioProfile() {
            return this.audioProfile;
        }

        public DescribeLiveStreamTranscodeInfoResponseBodyDomainTranscodeListDomainTranscodeInfoCustomTranscodeParameters setAudioRate(Integer audioRate) {
            this.audioRate = audioRate;
            return this;
        }
        public Integer getAudioRate() {
            return this.audioRate;
        }

        public DescribeLiveStreamTranscodeInfoResponseBodyDomainTranscodeListDomainTranscodeInfoCustomTranscodeParameters setBframes(String bframes) {
            this.bframes = bframes;
            return this;
        }
        public String getBframes() {
            return this.bframes;
        }

        public DescribeLiveStreamTranscodeInfoResponseBodyDomainTranscodeListDomainTranscodeInfoCustomTranscodeParameters setBitrateWithSource(java.util.Map<String, ?> bitrateWithSource) {
            this.bitrateWithSource = bitrateWithSource;
            return this;
        }
        public java.util.Map<String, ?> getBitrateWithSource() {
            return this.bitrateWithSource;
        }

        public DescribeLiveStreamTranscodeInfoResponseBodyDomainTranscodeListDomainTranscodeInfoCustomTranscodeParameters setExtWithSource(java.util.Map<String, ?> extWithSource) {
            this.extWithSource = extWithSource;
            return this;
        }
        public java.util.Map<String, ?> getExtWithSource() {
            return this.extWithSource;
        }

        public DescribeLiveStreamTranscodeInfoResponseBodyDomainTranscodeListDomainTranscodeInfoCustomTranscodeParameters setFPS(Integer FPS) {
            this.FPS = FPS;
            return this;
        }
        public Integer getFPS() {
            return this.FPS;
        }

        public DescribeLiveStreamTranscodeInfoResponseBodyDomainTranscodeListDomainTranscodeInfoCustomTranscodeParameters setFpsWithSource(java.util.Map<String, ?> fpsWithSource) {
            this.fpsWithSource = fpsWithSource;
            return this;
        }
        public java.util.Map<String, ?> getFpsWithSource() {
            return this.fpsWithSource;
        }

        public DescribeLiveStreamTranscodeInfoResponseBodyDomainTranscodeListDomainTranscodeInfoCustomTranscodeParameters setGop(String gop) {
            this.gop = gop;
            return this;
        }
        public String getGop() {
            return this.gop;
        }

        public DescribeLiveStreamTranscodeInfoResponseBodyDomainTranscodeListDomainTranscodeInfoCustomTranscodeParameters setHeight(Integer height) {
            this.height = height;
            return this;
        }
        public Integer getHeight() {
            return this.height;
        }

        public DescribeLiveStreamTranscodeInfoResponseBodyDomainTranscodeListDomainTranscodeInfoCustomTranscodeParameters setResWithSource(java.util.Map<String, ?> resWithSource) {
            this.resWithSource = resWithSource;
            return this;
        }
        public java.util.Map<String, ?> getResWithSource() {
            return this.resWithSource;
        }

        public DescribeLiveStreamTranscodeInfoResponseBodyDomainTranscodeListDomainTranscodeInfoCustomTranscodeParameters setRtsFlag(String rtsFlag) {
            this.rtsFlag = rtsFlag;
            return this;
        }
        public String getRtsFlag() {
            return this.rtsFlag;
        }

        public DescribeLiveStreamTranscodeInfoResponseBodyDomainTranscodeListDomainTranscodeInfoCustomTranscodeParameters setTemplateType(String templateType) {
            this.templateType = templateType;
            return this;
        }
        public String getTemplateType() {
            return this.templateType;
        }

        public DescribeLiveStreamTranscodeInfoResponseBodyDomainTranscodeListDomainTranscodeInfoCustomTranscodeParameters setVideoBitrate(Integer videoBitrate) {
            this.videoBitrate = videoBitrate;
            return this;
        }
        public Integer getVideoBitrate() {
            return this.videoBitrate;
        }

        public DescribeLiveStreamTranscodeInfoResponseBodyDomainTranscodeListDomainTranscodeInfoCustomTranscodeParameters setVideoProfile(String videoProfile) {
            this.videoProfile = videoProfile;
            return this;
        }
        public String getVideoProfile() {
            return this.videoProfile;
        }

        public DescribeLiveStreamTranscodeInfoResponseBodyDomainTranscodeListDomainTranscodeInfoCustomTranscodeParameters setWidth(Integer width) {
            this.width = width;
            return this;
        }
        public Integer getWidth() {
            return this.width;
        }

    }

    public static class DescribeLiveStreamTranscodeInfoResponseBodyDomainTranscodeListDomainTranscodeInfoEncryptParameters extends TeaModel {
        /**
         * <p>The type of encryption. Fixed value: <strong>aliyun</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>aliyun</p>
         */
        @NameInMap("EncryptType")
        public String encryptType;

        /**
         * <p>The rotation period of the CMK. Valid values: <strong>60 to 3600</strong>. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>3600</p>
         */
        @NameInMap("KmsKeyExpireInterval")
        public String kmsKeyExpireInterval;

        /**
         * <p>The ID of the customer master key (CMK) in Key Management Service (KMS).</p>
         * 
         * <strong>example:</strong>
         * <p>afce5722-81d2-43c3-9930-7601da11****</p>
         */
        @NameInMap("KmsKeyID")
        public String kmsKeyID;

        public static DescribeLiveStreamTranscodeInfoResponseBodyDomainTranscodeListDomainTranscodeInfoEncryptParameters build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveStreamTranscodeInfoResponseBodyDomainTranscodeListDomainTranscodeInfoEncryptParameters self = new DescribeLiveStreamTranscodeInfoResponseBodyDomainTranscodeListDomainTranscodeInfoEncryptParameters();
            return TeaModel.build(map, self);
        }

        public DescribeLiveStreamTranscodeInfoResponseBodyDomainTranscodeListDomainTranscodeInfoEncryptParameters setEncryptType(String encryptType) {
            this.encryptType = encryptType;
            return this;
        }
        public String getEncryptType() {
            return this.encryptType;
        }

        public DescribeLiveStreamTranscodeInfoResponseBodyDomainTranscodeListDomainTranscodeInfoEncryptParameters setKmsKeyExpireInterval(String kmsKeyExpireInterval) {
            this.kmsKeyExpireInterval = kmsKeyExpireInterval;
            return this;
        }
        public String getKmsKeyExpireInterval() {
            return this.kmsKeyExpireInterval;
        }

        public DescribeLiveStreamTranscodeInfoResponseBodyDomainTranscodeListDomainTranscodeInfoEncryptParameters setKmsKeyID(String kmsKeyID) {
            this.kmsKeyID = kmsKeyID;
            return this;
        }
        public String getKmsKeyID() {
            return this.kmsKeyID;
        }

    }

    public static class DescribeLiveStreamTranscodeInfoResponseBodyDomainTranscodeListDomainTranscodeInfo extends TeaModel {
        /**
         * <p>The custom transcoding configuration.</p>
         */
        @NameInMap("CustomTranscodeParameters")
        public DescribeLiveStreamTranscodeInfoResponseBodyDomainTranscodeListDomainTranscodeInfoCustomTranscodeParameters customTranscodeParameters;

        /**
         * <p>The encryption settings.</p>
         */
        @NameInMap("EncryptParameters")
        public DescribeLiveStreamTranscodeInfoResponseBodyDomainTranscodeListDomainTranscodeInfoEncryptParameters encryptParameters;

        /**
         * <p>Indicates whether forcible transcoding is used. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Delayed transcoding is used.</li>
         * <li><strong>false</strong>: Forcible transcoding is used.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsLazy")
        public Boolean isLazy;

        /**
         * <p>The application name.</p>
         * 
         * <strong>example:</strong>
         * <p>liveApp****</p>
         */
        @NameInMap("TranscodeApp")
        public String transcodeApp;

        /**
         * <p>The main streaming domain.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        @NameInMap("TranscodeName")
        public String transcodeName;

        /**
         * <p>The transcoding template ID. Valid values:</p>
         * <ul>
         * <li><p><strong>Standard transcoding</strong>:</p>
         * <ul>
         * <li><strong>lld</strong>: low definition</li>
         * <li><strong>lsd</strong>: standard definition</li>
         * <li><strong>lhd</strong>: high definition</li>
         * <li><strong>lud</strong>: ultra-high definition</li>
         * </ul>
         * </li>
         * <li><p><strong>Narrowband HD™ transcoding</strong>:</p>
         * <ul>
         * <li><strong>ld</strong>: low definition</li>
         * <li><strong>sd</strong>: standard definition</li>
         * <li><strong>hd</strong>: high definition</li>
         * <li><strong>ud</strong>: ultra-high definition</li>
         * </ul>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>lld</p>
         */
        @NameInMap("TranscodeTemplate")
        public String transcodeTemplate;

        public static DescribeLiveStreamTranscodeInfoResponseBodyDomainTranscodeListDomainTranscodeInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveStreamTranscodeInfoResponseBodyDomainTranscodeListDomainTranscodeInfo self = new DescribeLiveStreamTranscodeInfoResponseBodyDomainTranscodeListDomainTranscodeInfo();
            return TeaModel.build(map, self);
        }

        public DescribeLiveStreamTranscodeInfoResponseBodyDomainTranscodeListDomainTranscodeInfo setCustomTranscodeParameters(DescribeLiveStreamTranscodeInfoResponseBodyDomainTranscodeListDomainTranscodeInfoCustomTranscodeParameters customTranscodeParameters) {
            this.customTranscodeParameters = customTranscodeParameters;
            return this;
        }
        public DescribeLiveStreamTranscodeInfoResponseBodyDomainTranscodeListDomainTranscodeInfoCustomTranscodeParameters getCustomTranscodeParameters() {
            return this.customTranscodeParameters;
        }

        public DescribeLiveStreamTranscodeInfoResponseBodyDomainTranscodeListDomainTranscodeInfo setEncryptParameters(DescribeLiveStreamTranscodeInfoResponseBodyDomainTranscodeListDomainTranscodeInfoEncryptParameters encryptParameters) {
            this.encryptParameters = encryptParameters;
            return this;
        }
        public DescribeLiveStreamTranscodeInfoResponseBodyDomainTranscodeListDomainTranscodeInfoEncryptParameters getEncryptParameters() {
            return this.encryptParameters;
        }

        public DescribeLiveStreamTranscodeInfoResponseBodyDomainTranscodeListDomainTranscodeInfo setIsLazy(Boolean isLazy) {
            this.isLazy = isLazy;
            return this;
        }
        public Boolean getIsLazy() {
            return this.isLazy;
        }

        public DescribeLiveStreamTranscodeInfoResponseBodyDomainTranscodeListDomainTranscodeInfo setTranscodeApp(String transcodeApp) {
            this.transcodeApp = transcodeApp;
            return this;
        }
        public String getTranscodeApp() {
            return this.transcodeApp;
        }

        public DescribeLiveStreamTranscodeInfoResponseBodyDomainTranscodeListDomainTranscodeInfo setTranscodeName(String transcodeName) {
            this.transcodeName = transcodeName;
            return this;
        }
        public String getTranscodeName() {
            return this.transcodeName;
        }

        public DescribeLiveStreamTranscodeInfoResponseBodyDomainTranscodeListDomainTranscodeInfo setTranscodeTemplate(String transcodeTemplate) {
            this.transcodeTemplate = transcodeTemplate;
            return this;
        }
        public String getTranscodeTemplate() {
            return this.transcodeTemplate;
        }

    }

    public static class DescribeLiveStreamTranscodeInfoResponseBodyDomainTranscodeList extends TeaModel {
        @NameInMap("DomainTranscodeInfo")
        public java.util.List<DescribeLiveStreamTranscodeInfoResponseBodyDomainTranscodeListDomainTranscodeInfo> domainTranscodeInfo;

        public static DescribeLiveStreamTranscodeInfoResponseBodyDomainTranscodeList build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveStreamTranscodeInfoResponseBodyDomainTranscodeList self = new DescribeLiveStreamTranscodeInfoResponseBodyDomainTranscodeList();
            return TeaModel.build(map, self);
        }

        public DescribeLiveStreamTranscodeInfoResponseBodyDomainTranscodeList setDomainTranscodeInfo(java.util.List<DescribeLiveStreamTranscodeInfoResponseBodyDomainTranscodeListDomainTranscodeInfo> domainTranscodeInfo) {
            this.domainTranscodeInfo = domainTranscodeInfo;
            return this;
        }
        public java.util.List<DescribeLiveStreamTranscodeInfoResponseBodyDomainTranscodeListDomainTranscodeInfo> getDomainTranscodeInfo() {
            return this.domainTranscodeInfo;
        }

    }

}
