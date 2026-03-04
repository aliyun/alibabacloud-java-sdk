// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class LivePackagingConfig extends TeaModel {
    /**
     * <p>Configuration for the DRM provider. To disable DRM, leave all fields in this object empty.</p>
     */
    @NameInMap("DrmConfig")
    public LivePackagingConfigDrmConfig drmConfig;

    /**
     * <p>Live stream manifest configuration. Only one configuration is supported.</p>
     */
    @NameInMap("LiveManifestConfigs")
    public java.util.List<LiveManifestConfig> liveManifestConfigs;

    /**
     * <p>The duration of each output segment, in seconds. If not set, this defaults to the channel\&quot;s configured segment duration. The final segment duration is a multiple of the source segment duration that is closest to and not less than this value. Valid values: 1 to 30.</p>
     * 
     * <strong>example:</strong>
     * <p>6</p>
     */
    @NameInMap("SegmentDuration")
    public Integer segmentDuration;

    /**
     * <p>Specifies whether to create separate audio rendition groups for TS segments.</p>
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
         * <p>The content ID in the DRM system. The maximum length is 256 characters. Letters, digits, underscores (_), and hyphens (-) are supported. You must ensure this ID is unique to prevent playback failures.</p>
         * 
         * <strong>example:</strong>
         * <p>live-axb1-9dd2fa123</p>
         */
        @NameInMap("ContentId")
        public String contentId;

        /**
         * <p>The encryption method. Valid value:</p>
         * <ul>
         * <li>SAMPLE_AES</li>
         * </ul>
         * <p>If not specified, encryption is disabled.</p>
         * 
         * <strong>example:</strong>
         * <p>SAMPLE_AES</p>
         */
        @NameInMap("EncryptionMethod")
        public String encryptionMethod;

        /**
         * <p>A 128-bit, 16-byte hex value represented by a 32-character string that is used with the key for encrypting data blocks. If you leave this parameter empty, MediaPackage creates a constant initialization vector (IV). If it is specified, the value is passed to the DRM service.</p>
         * 
         * <strong>example:</strong>
         * <p>00000000000000000000000000000000</p>
         */
        @NameInMap("IV")
        public String IV;

        /**
         * <p>The key rotation interval for DRM, in seconds. The default value of 0 disables key rotation.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("RotatePeriod")
        public Integer rotatePeriod;

        /**
         * <p>The ID of the DRM system. The supported systems depend on the protocol.</p>
         * <ul>
         * <li>DASH: Supports Google Widevine and Microsoft PlayReady.</li>
         * <li>HLS: DRM is not supported.</li>
         * <li>HLS-CMAF: Supports Apple FairPlay, Google Widevine, and Microsoft PlayReady.</li>
         * </ul>
         * <p>The corresponding System IDs are:</p>
         * <ul>
         * <li>Apple FairPlay: 94ce86fb-07ff-4f43-adb8-93d2fa968ca2</li>
         * <li>Google Widevine: edef8ba9-79d6-4ace-a3c8-27dcd51d21ed</li>
         * <li>Microsoft PlayReady: 9a04f079-9840-4286-ab92-e65be0885f95</li>
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
