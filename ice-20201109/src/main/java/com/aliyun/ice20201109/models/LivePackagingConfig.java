// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class LivePackagingConfig extends TeaModel {
    /**
     * <p>The DRM encryption provider configuration. If encryption is not required, leave all fields empty.</p>
     */
    @NameInMap("DrmConfig")
    public LivePackagingConfigDrmConfig drmConfig;

    /**
     * <p>The live manifest configurations. A maximum of one configuration is supported.</p>
     */
    @NameInMap("LiveManifestConfigs")
    public java.util.List<LiveManifestConfig> liveManifestConfigs;

    @NameInMap("PartDurationMs")
    public Integer partDurationMs;

    /**
     * <p>The duration of each segment, in seconds. Default value: the channel segment duration. The actual segment duration is the nearest multiple of the source segment duration that is greater than or equal to the configured value. Valid values: 1 to 30.</p>
     * 
     * <strong>example:</strong>
     * <p>6</p>
     */
    @NameInMap("SegmentDuration")
    public Integer segmentDuration;

    /**
     * <p>Specifies whether to separate audio tracks in TS segments.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("UseAudioRenditionGroups")
    public Boolean useAudioRenditionGroups;

    public static LivePackagingConfig build(java.util.Map<String, ?> map) throws Exception {
        LivePackagingConfig self = new LivePackagingConfig();
        return TeaModel.build(map, self);
    }

    public LivePackagingConfig setDrmConfig(LivePackagingConfigDrmConfig drmConfig) {
        this.drmConfig = drmConfig;
        return this;
    }
    public LivePackagingConfigDrmConfig getDrmConfig() {
        return this.drmConfig;
    }

    public LivePackagingConfig setLiveManifestConfigs(java.util.List<LiveManifestConfig> liveManifestConfigs) {
        this.liveManifestConfigs = liveManifestConfigs;
        return this;
    }
    public java.util.List<LiveManifestConfig> getLiveManifestConfigs() {
        return this.liveManifestConfigs;
    }

    public LivePackagingConfig setPartDurationMs(Integer partDurationMs) {
        this.partDurationMs = partDurationMs;
        return this;
    }
    public Integer getPartDurationMs() {
        return this.partDurationMs;
    }

    public LivePackagingConfig setSegmentDuration(Integer segmentDuration) {
        this.segmentDuration = segmentDuration;
        return this;
    }
    public Integer getSegmentDuration() {
        return this.segmentDuration;
    }

    public LivePackagingConfig setUseAudioRenditionGroups(Boolean useAudioRenditionGroups) {
        this.useAudioRenditionGroups = useAudioRenditionGroups;
        return this;
    }
    public Boolean getUseAudioRenditionGroups() {
        return this.useAudioRenditionGroups;
    }

    public static class LivePackagingConfigDrmConfig extends TeaModel {
        /**
         * <p>The content ID in the DRM system. Format: [A-Za-z0-9_-]+. Maximum length: 256 characters. Ensure that the content ID is unique. Otherwise, DRM playback may fail.</p>
         * 
         * <strong>example:</strong>
         * <p>live-axb1-9dd2fa123</p>
         */
        @NameInMap("ContentId")
        public String contentId;

        /**
         * <p>The encryption algorithm. Valid values:</p>
         * <ul>
         * <li>SAMPLE_AES</li>
         * </ul>
         * <p>Default value: empty, which indicates no encryption.</p>
         * 
         * <strong>example:</strong>
         * <p>SAMPLE_AES</p>
         */
        @NameInMap("EncryptionMethod")
        public String encryptionMethod;

        /**
         * <p>An optional 128-bit (16-byte) hexadecimal value represented by a 32-character string. This value is used together with the key to encrypt data blocks. If you do not specify this value, MediaPackage creates a constant initialization vector (IV). Default value: empty. If specified, the value is passed through to the provider as a constant initialization vector.</p>
         * 
         * <strong>example:</strong>
         * <p>00000000000000000000000000000000</p>
         */
        @NameInMap("IV")
        public String IV;

        /**
         * <p>The DRM key rotation interval. Unit: seconds. Default value: 0, which indicates that key rotation is disabled.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("RotatePeriod")
        public Integer rotatePeriod;

        /**
         * <p>The DRM system IDs, determined by the protocol type.</p>
         * <ul>
         * <li>DASH: supports Google Widevine and Microsoft PlayReady.</li>
         * <li>HLS: not supported.</li>
         * <li>HLS_CMAF: supports Apple FairPlay, Google Widevine, and Microsoft PlayReady.</li>
         * </ul>
         * <p>Three DRM systems are supported: Apple FairPlay, Google Widevine, and Microsoft PlayReady. The corresponding system IDs are:</p>
         * <ul>
         * <li>Apple FairPlay:
         * 94ce86fb-07ff-4f43-adb8-93d2fa968ca2</li>
         * <li>Google Widevine:
         * edef8ba9-79d6-4ace-a3c8-27dcd51d21ed</li>
         * <li>Microsoft PlayReady:
         * 9a04f079-9840-4286-ab92-e65be0885f95.</li>
         * </ul>
         */
        @NameInMap("SystemIds")
        public java.util.List<String> systemIds;

        /**
         * <p>The URL of the DRM key provider.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://exampledrm.com/path?arg1=xxx">https://exampledrm.com/path?arg1=xxx</a></p>
         */
        @NameInMap("Url")
        public String url;

        public static LivePackagingConfigDrmConfig build(java.util.Map<String, ?> map) throws Exception {
            LivePackagingConfigDrmConfig self = new LivePackagingConfigDrmConfig();
            return TeaModel.build(map, self);
        }

        public LivePackagingConfigDrmConfig setContentId(String contentId) {
            this.contentId = contentId;
            return this;
        }
        public String getContentId() {
            return this.contentId;
        }

        public LivePackagingConfigDrmConfig setEncryptionMethod(String encryptionMethod) {
            this.encryptionMethod = encryptionMethod;
            return this;
        }
        public String getEncryptionMethod() {
            return this.encryptionMethod;
        }

        public LivePackagingConfigDrmConfig setIV(String IV) {
            this.IV = IV;
            return this;
        }
        public String getIV() {
            return this.IV;
        }

        public LivePackagingConfigDrmConfig setRotatePeriod(Integer rotatePeriod) {
            this.rotatePeriod = rotatePeriod;
            return this;
        }
        public Integer getRotatePeriod() {
            return this.rotatePeriod;
        }

        public LivePackagingConfigDrmConfig setSystemIds(java.util.List<String> systemIds) {
            this.systemIds = systemIds;
            return this;
        }
        public java.util.List<String> getSystemIds() {
            return this.systemIds;
        }

        public LivePackagingConfigDrmConfig setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

}
