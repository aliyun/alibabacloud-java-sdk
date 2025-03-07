// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class CreateVodPackagingConfigurationRequest extends TeaModel {
    /**
     * <p>The name of the packaging configuration. The name must be unique in an account and can be up to 128 characters in length. Letters, digits, underscores (_), and hyphens (-) are supported.</p>
     * 
     * <strong>example:</strong>
     * <p>hls_3s</p>
     */
    @NameInMap("ConfigurationName")
    public String configurationName;

    /**
     * <p>The description of the packaging configuration.</p>
     * 
     * <strong>example:</strong>
     * <p>HLS 3s vod packaging</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The name of the packaging group. The name can be up to 128 characters in length. Letters, digits, underscores (_), and hyphens (-) are supported.</p>
     * 
     * <strong>example:</strong>
     * <p>vod_hls</p>
     */
    @NameInMap("GroupName")
    public String groupName;

    /**
     * <p>The packaging configuration.</p>
     */
    @NameInMap("PackageConfig")
    public CreateVodPackagingConfigurationRequestPackageConfig packageConfig;

    /**
     * <p>The package type.</p>
     * <ul>
     * <li>HLS: packages content into TS segments for delivery over the HLS protocol.</li>
     * <li>HLS_CMAF: packages content into CMAF segments for delivery over the HLS protocol.</li>
     * <li>DASH: packages content for delivery over the DASH protocol.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>HLS</p>
     */
    @NameInMap("Protocol")
    public String protocol;

    public static CreateVodPackagingConfigurationRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateVodPackagingConfigurationRequest self = new CreateVodPackagingConfigurationRequest();
        return TeaModel.build(map, self);
    }

    public CreateVodPackagingConfigurationRequest setConfigurationName(String configurationName) {
        this.configurationName = configurationName;
        return this;
    }
    public String getConfigurationName() {
        return this.configurationName;
    }

    public CreateVodPackagingConfigurationRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateVodPackagingConfigurationRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public CreateVodPackagingConfigurationRequest setPackageConfig(CreateVodPackagingConfigurationRequestPackageConfig packageConfig) {
        this.packageConfig = packageConfig;
        return this;
    }
    public CreateVodPackagingConfigurationRequestPackageConfig getPackageConfig() {
        return this.packageConfig;
    }

    public CreateVodPackagingConfigurationRequest setProtocol(String protocol) {
        this.protocol = protocol;
        return this;
    }
    public String getProtocol() {
        return this.protocol;
    }

    public static class CreateVodPackagingConfigurationRequestPackageConfigDrmProvider extends TeaModel {
        /**
         * <p>The encryption method. Valid values:</p>
         * <ul>
         * <li>AES_128: Advanced Encryption Standard (AES) with 128-bit key length.</li>
         * <li>SAMPLE_AES: an encryption method that encrypts individual media samples.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>AES_128</p>
         */
        @NameInMap("EncryptionMethod")
        public String encryptionMethod;

        /**
         * <p>A 128-bit, 16-byte hex value represented by a 32-character string that is used with the key for encrypting data blocks. If you leave this parameter empty, MediaPackage creates a constant initialization vector (IV). If it is specified, the value is passed to the DRM service.</p>
         * 
         * <strong>example:</strong>
         * <p>00001111222233334444555566667777</p>
         */
        @NameInMap("IV")
        public String IV;

        /**
         * <p>The ID of the DRM system. The maximum number of system IDs allowed is determined by the protocol type. Limits:</p>
         * <ul>
         * <li>DASH: 2</li>
         * <li>HLS: 1</li>
         * <li>HLS_CMAF: 2</li>
         * </ul>
         * <p>Apple FairPlay, Google Widevine, and Microsoft PlayReady are supported. Their system IDs are as follows:</p>
         * <ul>
         * <li>Apple FairPlay: 94ce86fb-07ff-4f43-adb8-93d2fa968ca2</li>
         * <li>Google Widevine: edef8ba9-79d6-4ace-a3c8-27dcd51d21e</li>
         * <li>Microsoft PlayReady: 9a04f079-9840-4286-ab92-e65be0885f95</li>
         * </ul>
         */
        @NameInMap("SystemIds")
        public java.util.List<String> systemIds;

        /**
         * <p>The URL of the DRM key provider.</p>
         */
        @NameInMap("Url")
        public String url;

        public static CreateVodPackagingConfigurationRequestPackageConfigDrmProvider build(java.util.Map<String, ?> map) throws Exception {
            CreateVodPackagingConfigurationRequestPackageConfigDrmProvider self = new CreateVodPackagingConfigurationRequestPackageConfigDrmProvider();
            return TeaModel.build(map, self);
        }

        public CreateVodPackagingConfigurationRequestPackageConfigDrmProvider setEncryptionMethod(String encryptionMethod) {
            this.encryptionMethod = encryptionMethod;
            return this;
        }
        public String getEncryptionMethod() {
            return this.encryptionMethod;
        }

        public CreateVodPackagingConfigurationRequestPackageConfigDrmProvider setIV(String IV) {
            this.IV = IV;
            return this;
        }
        public String getIV() {
            return this.IV;
        }

        public CreateVodPackagingConfigurationRequestPackageConfigDrmProvider setSystemIds(java.util.List<String> systemIds) {
            this.systemIds = systemIds;
            return this;
        }
        public java.util.List<String> getSystemIds() {
            return this.systemIds;
        }

        public CreateVodPackagingConfigurationRequestPackageConfigDrmProvider setUrl(String url) {
            this.url = url;
            return this;
        }
        public String getUrl() {
            return this.url;
        }

    }

    public static class CreateVodPackagingConfigurationRequestPackageConfigStreamSelection extends TeaModel {
        /**
         * <p>The maximum bitrate of the video stream. Unit: bit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>1000000000</p>
         */
        @NameInMap("MaxVideoBitsPerSecond")
        public Long maxVideoBitsPerSecond;

        /**
         * <p>The minimum bitrate of the video stream. Unit: bit/s.</p>
         * 
         * <strong>example:</strong>
         * <p>100000</p>
         */
        @NameInMap("MinVideoBitsPerSecond")
        public Long minVideoBitsPerSecond;

        /**
         * <p>The order of manifest files in the master playlist. Valid values:</p>
         * <ul>
         * <li>ORIGINAL: sorts the manifest files in the same order as the source.</li>
         * <li>VIDEO_BITRATE_ASCENDING: sorts the manifest files in ascending order of bitrates, from lowest to highest.</li>
         * <li>VIDEO_BITRATE_DESCENDING: sorts the manifest files in descending order of bitrates, from highest to lowest.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ORIGINAL</p>
         */
        @NameInMap("StreamOrder")
        public String streamOrder;

        public static CreateVodPackagingConfigurationRequestPackageConfigStreamSelection build(java.util.Map<String, ?> map) throws Exception {
            CreateVodPackagingConfigurationRequestPackageConfigStreamSelection self = new CreateVodPackagingConfigurationRequestPackageConfigStreamSelection();
            return TeaModel.build(map, self);
        }

        public CreateVodPackagingConfigurationRequestPackageConfigStreamSelection setMaxVideoBitsPerSecond(Long maxVideoBitsPerSecond) {
            this.maxVideoBitsPerSecond = maxVideoBitsPerSecond;
            return this;
        }
        public Long getMaxVideoBitsPerSecond() {
            return this.maxVideoBitsPerSecond;
        }

        public CreateVodPackagingConfigurationRequestPackageConfigStreamSelection setMinVideoBitsPerSecond(Long minVideoBitsPerSecond) {
            this.minVideoBitsPerSecond = minVideoBitsPerSecond;
            return this;
        }
        public Long getMinVideoBitsPerSecond() {
            return this.minVideoBitsPerSecond;
        }

        public CreateVodPackagingConfigurationRequestPackageConfigStreamSelection setStreamOrder(String streamOrder) {
            this.streamOrder = streamOrder;
            return this;
        }
        public String getStreamOrder() {
            return this.streamOrder;
        }

    }

    public static class CreateVodPackagingConfigurationRequestPackageConfig extends TeaModel {
        /**
         * <p>The settings of digital rights management (DRM) encryption.</p>
         * 
         * <strong>if can be null:</strong>
         * <p>true</p>
         */
        @NameInMap("DrmProvider")
        public CreateVodPackagingConfigurationRequestPackageConfigDrmProvider drmProvider;

        /**
         * <p>The manifest name. The name can be up to 128 characters in length. Letters, digits, underscores (_), and hyphens (-) are supported.</p>
         * 
         * <strong>example:</strong>
         * <p>index</p>
         */
        @NameInMap("ManifestName")
        public String manifestName;

        /**
         * <p>The duration of each segment in a packaged stream. Unit: seconds. MediaPackage rounds segments to the nearest multiple of the input segment duration. Valid values: 1 to 30.</p>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
        @NameInMap("SegmentDuration")
        public Long segmentDuration;

        /**
         * <p>The settings of stream selection.</p>
         */
        @NameInMap("StreamSelection")
        public CreateVodPackagingConfigurationRequestPackageConfigStreamSelection streamSelection;

        public static CreateVodPackagingConfigurationRequestPackageConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateVodPackagingConfigurationRequestPackageConfig self = new CreateVodPackagingConfigurationRequestPackageConfig();
            return TeaModel.build(map, self);
        }

        public CreateVodPackagingConfigurationRequestPackageConfig setDrmProvider(CreateVodPackagingConfigurationRequestPackageConfigDrmProvider drmProvider) {
            this.drmProvider = drmProvider;
            return this;
        }
        public CreateVodPackagingConfigurationRequestPackageConfigDrmProvider getDrmProvider() {
            return this.drmProvider;
        }

        public CreateVodPackagingConfigurationRequestPackageConfig setManifestName(String manifestName) {
            this.manifestName = manifestName;
            return this;
        }
        public String getManifestName() {
            return this.manifestName;
        }

        public CreateVodPackagingConfigurationRequestPackageConfig setSegmentDuration(Long segmentDuration) {
            this.segmentDuration = segmentDuration;
            return this;
        }
        public Long getSegmentDuration() {
            return this.segmentDuration;
        }

        public CreateVodPackagingConfigurationRequestPackageConfig setStreamSelection(CreateVodPackagingConfigurationRequestPackageConfigStreamSelection streamSelection) {
            this.streamSelection = streamSelection;
            return this;
        }
        public CreateVodPackagingConfigurationRequestPackageConfigStreamSelection getStreamSelection() {
            return this.streamSelection;
        }

    }

}
