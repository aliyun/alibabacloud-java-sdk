// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class VodPackagingConfig extends TeaModel {
    /**
     * <p>The DRM encryption provider configuration.</p>
     */
    @NameInMap("DrmProvider")
    public VodPackagingConfigDrmProvider drmProvider;

    /**
     * <p>The manifest name. The value must match the regular expression [A-Za-z0-9_]+ and cannot exceed 128 characters in length.</p>
     */
    @NameInMap("ManifestName")
    public String manifestName;

    /**
     * <p>The duration of each segment in seconds. The actual segment duration is rounded to the nearest multiple of the source segment duration. Valid values: 1 to 30.</p>
     * 
     * <strong>example:</strong>
     * <p>6</p>
     */
    @NameInMap("SegmentDuration")
    public Long segmentDuration;

    /**
     * <p>The stream selection configuration for packaging output.</p>
     */
    @NameInMap("StreamSelection")
    public VodPackagingConfigStreamSelection streamSelection;

    public static VodPackagingConfig build(java.util.Map<String, ?> map) throws Exception {
        VodPackagingConfig self = new VodPackagingConfig();
        return TeaModel.build(map, self);
    }

    public VodPackagingConfig setDrmProvider(VodPackagingConfigDrmProvider drmProvider) {
        this.drmProvider = drmProvider;
        return this;
    }
    public VodPackagingConfigDrmProvider getDrmProvider() {
        return this.drmProvider;
    }

    public VodPackagingConfig setManifestName(String manifestName) {
        this.manifestName = manifestName;
        return this;
    }
    public String getManifestName() {
        return this.manifestName;
    }

    public VodPackagingConfig setSegmentDuration(Long segmentDuration) {
        this.segmentDuration = segmentDuration;
        return this;
    }
    public Long getSegmentDuration() {
        return this.segmentDuration;
    }

    public VodPackagingConfig setStreamSelection(VodPackagingConfigStreamSelection streamSelection) {
        this.streamSelection = streamSelection;
        return this;
    }
    public VodPackagingConfigStreamSelection getStreamSelection() {
        return this.streamSelection;
    }

    public static class VodPackagingConfigDrmProvider extends TeaModel {
        /**
         * <p>The encryption algorithm. Valid values:</p>
         * <ul>
         * <li>AES_128</li>
         * <li>SAMPLE_AES</li>
         * </ul>
         */
        @NameInMap("EncryptionMethod")
        public String encryptionMethod;

        /**
         * <p>The optional 128-bit (16-byte) hexadecimal value represented by a 32-character string, which is used with the key for encrypted data blocks. If you do not specify this value, MediaPackage creates a constant initialization vector (IV). Default value: empty. If specified, the value is passed through to the provider as a constant initialization vector.</p>
         * 
         * <strong>example:</strong>
         * <p>0123456789abcdef0123456789abcdef</p>
         */
        @NameInMap("IV")
        public String IV;

        /**
         * <p>The DRM system IDs. The number of system IDs depends on the protocol type used:</p>
         * <ul>
         * <li>DASH: up to two</li>
         * <li>HLS: one</li>
         * <li>HLS_CMAF: up to two
         * Only the following three DRM systems are supported: Apple FairPlay, Google Widevine, and Microsoft PlayReady. The corresponding system IDs are:
         * Apple FairPlay:
         * 94ce86fb-07ff-4f43-adb8-93d2fa968ca2
         * Google Widevine:
         * edef8ba9-79d6-4ace-a3c8-27dcd51d21ed
         * Microsoft PlayReady:
         * 9a04f079-9840-4286-ab92-e65be0885f95.</li>
         * </ul>
         */
        @NameInMap("SystemIds")
        public java.util.List<String> systemIds;

        /**
         * <p>The URL of the DRM key provider.</p>
         */
        @NameInMap("Url")
        public String url;

        public static VodPackagingConfigDrmProvider build(java.util.Map<String, ?> map) throws Exception {
            VodPackagingConfigDrmProvider self = new VodPackagingConfigDrmProvider();
            return TeaModel.build(map, self);
        }

        public VodPackagingConfigDrmProvider setEncryptionMethod(String encryptionMethod) {
            this.encryptionMethod = encryptionMethod;
            return this;
        }
        public String getEncryptionMethod() {
            return this.encryptionMethod;
        }

        public VodPackagingConfigDrmProvider setIV(String IV) {
            this.IV = IV;
            return this;
        }
        public String getIV() {
            return this.IV;
        }

        public VodPackagingConfigDrmProvider setSystemIds(java.util.List<String> systemIds) {
            this.systemIds = systemIds;
            return this;
        }
        public java.util.List<String> getSystemIds() {
            return this.systemIds;
        }

        public VodPackagingConfigDrmProvider setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class VodPackagingConfigStreamSelection extends TeaModel {
        /**
         * <p>The maximum video stream bitrate in bps.</p>
         */
        @NameInMap("MaxVideoBitsPerSecond")
        public Long maxVideoBitsPerSecond;

        /**
         * <p>The minimum video stream bitrate in bps.</p>
         */
        @NameInMap("MinVideoBitsPerSecond")
        public Long minVideoBitsPerSecond;

        /**
         * <p>The stream sorting rule. Valid values:</p>
         * <ul>
         * <li>ORIGINAL: Keeps the input sequence number.</li>
         * <li>VIDEO_BITRATE_ASCENDING: Sorts streams by video bitrate in ascending order.</li>
         * <li>VIDEO_BITRATE_DESCENDING: Sorts streams by video bitrate in descending order.</li>
         * </ul>
         */
        @NameInMap("StreamOrder")
        public String streamOrder;

        public static VodPackagingConfigStreamSelection build(java.util.Map<String, ?> map) throws Exception {
            VodPackagingConfigStreamSelection self = new VodPackagingConfigStreamSelection();
            return TeaModel.build(map, self);
        }

        public VodPackagingConfigStreamSelection setMaxVideoBitsPerSecond(Long maxVideoBitsPerSecond) {
            this.maxVideoBitsPerSecond = maxVideoBitsPerSecond;
            return this;
        }
        public Long getMaxVideoBitsPerSecond() {
            return this.maxVideoBitsPerSecond;
        }

        public VodPackagingConfigStreamSelection setMinVideoBitsPerSecond(Long minVideoBitsPerSecond) {
            this.minVideoBitsPerSecond = minVideoBitsPerSecond;
            return this;
        }
        public Long getMinVideoBitsPerSecond() {
            return this.minVideoBitsPerSecond;
        }

        public VodPackagingConfigStreamSelection setStreamOrder(String streamOrder) {
            this.streamOrder = streamOrder;
            return this;
        }
        public String getStreamOrder() {
            return this.streamOrder;
        }

    }

}
