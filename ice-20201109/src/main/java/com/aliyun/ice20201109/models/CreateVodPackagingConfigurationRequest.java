// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class CreateVodPackagingConfigurationRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>hls_3s</p>
     */
    @NameInMap("ConfigurationName")
    public String configurationName;

    /**
     * <strong>example:</strong>
     * <p>HLS 3s vod packaging</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <strong>example:</strong>
     * <p>vod_hls</p>
     */
    @NameInMap("GroupName")
    public String groupName;

    @NameInMap("PackageConfig")
    public CreateVodPackagingConfigurationRequestPackageConfig packageConfig;

    /**
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
         * <strong>example:</strong>
         * <p>AES_128</p>
         */
        @NameInMap("EncryptionMethod")
        public String encryptionMethod;

        /**
         * <strong>example:</strong>
         * <p>00001111222233334444555566667777</p>
         */
        @NameInMap("IV")
        public String IV;

        @NameInMap("SystemIds")
        public java.util.List<String> systemIds;

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
         * <strong>example:</strong>
         * <p>1000000000</p>
         */
        @NameInMap("MaxVideoBitsPerSecond")
        public Long maxVideoBitsPerSecond;

        /**
         * <strong>example:</strong>
         * <p>100000</p>
         */
        @NameInMap("MinVideoBitsPerSecond")
        public Long minVideoBitsPerSecond;

        /**
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
         * <strong>if can be null:</strong>
         * <p>true</p>
         */
        @NameInMap("DrmProvider")
        public CreateVodPackagingConfigurationRequestPackageConfigDrmProvider drmProvider;

        /**
         * <strong>example:</strong>
         * <p>index</p>
         */
        @NameInMap("ManifestName")
        public String manifestName;

        /**
         * <strong>example:</strong>
         * <p>6</p>
         */
        @NameInMap("SegmentDuration")
        public Long segmentDuration;

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
