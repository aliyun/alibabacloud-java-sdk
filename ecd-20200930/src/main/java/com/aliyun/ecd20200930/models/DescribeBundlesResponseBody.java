// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeBundlesResponseBody extends TeaModel {
    /**
     * <p>Details of the desktop templates.</p>
     */
    @NameInMap("Bundles")
    public java.util.List<DescribeBundlesResponseBodyBundles> bundles;

    /**
     * <p>The token that is used to start the next query. If null is returned, the next query is not required.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeBundlesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeBundlesResponseBody self = new DescribeBundlesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeBundlesResponseBody setBundles(java.util.List<DescribeBundlesResponseBodyBundles> bundles) {
        this.bundles = bundles;
        return this;
    }
    public java.util.List<DescribeBundlesResponseBodyBundles> getBundles() {
        return this.bundles;
    }

    public DescribeBundlesResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeBundlesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeBundlesResponseBodyBundlesDesktopTypeAttribute extends TeaModel {
        /**
         * <p>The number of vCPUs.</p>
         */
        @NameInMap("CpuCount")
        public Integer cpuCount;

        /**
         * <p>The number of GPUs.</p>
         */
        @NameInMap("GpuCount")
        public Float gpuCount;

        /**
         * <p>The type of the GPU.</p>
         */
        @NameInMap("GpuSpec")
        public String gpuSpec;

        /**
         * <p>The size of the memory. Unit: MB.</p>
         */
        @NameInMap("MemorySize")
        public Integer memorySize;

        public static DescribeBundlesResponseBodyBundlesDesktopTypeAttribute build(java.util.Map<String, ?> map) throws Exception {
            DescribeBundlesResponseBodyBundlesDesktopTypeAttribute self = new DescribeBundlesResponseBodyBundlesDesktopTypeAttribute();
            return TeaModel.build(map, self);
        }

        public DescribeBundlesResponseBodyBundlesDesktopTypeAttribute setCpuCount(Integer cpuCount) {
            this.cpuCount = cpuCount;
            return this;
        }
        public Integer getCpuCount() {
            return this.cpuCount;
        }

        public DescribeBundlesResponseBodyBundlesDesktopTypeAttribute setGpuCount(Float gpuCount) {
            this.gpuCount = gpuCount;
            return this;
        }
        public Float getGpuCount() {
            return this.gpuCount;
        }

        public DescribeBundlesResponseBodyBundlesDesktopTypeAttribute setGpuSpec(String gpuSpec) {
            this.gpuSpec = gpuSpec;
            return this;
        }
        public String getGpuSpec() {
            return this.gpuSpec;
        }

        public DescribeBundlesResponseBodyBundlesDesktopTypeAttribute setMemorySize(Integer memorySize) {
            this.memorySize = memorySize;
            return this;
        }
        public Integer getMemorySize() {
            return this.memorySize;
        }

    }

    public static class DescribeBundlesResponseBodyBundlesDisks extends TeaModel {
        /**
         * <p>The performance level (PL) of the disk.</p>
         */
        @NameInMap("DiskPerformanceLevel")
        public String diskPerformanceLevel;

        /**
         * <p>The size of the disk. Unit: GiB.</p>
         */
        @NameInMap("DiskSize")
        public Integer diskSize;

        /**
         * <p>The type of the disk.</p>
         */
        @NameInMap("DiskType")
        public String diskType;

        public static DescribeBundlesResponseBodyBundlesDisks build(java.util.Map<String, ?> map) throws Exception {
            DescribeBundlesResponseBodyBundlesDisks self = new DescribeBundlesResponseBodyBundlesDisks();
            return TeaModel.build(map, self);
        }

        public DescribeBundlesResponseBodyBundlesDisks setDiskPerformanceLevel(String diskPerformanceLevel) {
            this.diskPerformanceLevel = diskPerformanceLevel;
            return this;
        }
        public String getDiskPerformanceLevel() {
            return this.diskPerformanceLevel;
        }

        public DescribeBundlesResponseBodyBundlesDisks setDiskSize(Integer diskSize) {
            this.diskSize = diskSize;
            return this;
        }
        public Integer getDiskSize() {
            return this.diskSize;
        }

        public DescribeBundlesResponseBodyBundlesDisks setDiskType(String diskType) {
            this.diskType = diskType;
            return this;
        }
        public String getDiskType() {
            return this.diskType;
        }

    }

    public static class DescribeBundlesResponseBodyBundles extends TeaModel {
        /**
         * <p>The ID of the desktop template.</p>
         */
        @NameInMap("BundleId")
        public String bundleId;

        /**
         * <p>The name of the desktop template.</p>
         */
        @NameInMap("BundleName")
        public String bundleName;

        /**
         * <p>The type of the desktop template.</p>
         */
        @NameInMap("BundleType")
        public String bundleType;

        /**
         * <p>The time when the desktop template was created.</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The description of the desktop template.</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The desktop type.</p>
         */
        @NameInMap("DesktopType")
        public String desktopType;

        /**
         * <p>Details of the desktop type.</p>
         */
        @NameInMap("DesktopTypeAttribute")
        public DescribeBundlesResponseBodyBundlesDesktopTypeAttribute desktopTypeAttribute;

        /**
         * <p>The family of the desktop type.</p>
         */
        @NameInMap("DesktopTypeFamily")
        public String desktopTypeFamily;

        /**
         * <p>Details of the disks.</p>
         */
        @NameInMap("Disks")
        public java.util.List<DescribeBundlesResponseBodyBundlesDisks> disks;

        /**
         * <p>The ID of the image.</p>
         */
        @NameInMap("ImageId")
        public String imageId;

        /**
         * <p>The name of the image.</p>
         */
        @NameInMap("ImageName")
        public String imageName;

        @NameInMap("ImageStatus")
        public String imageStatus;

        /**
         * <p>The OS language of the image.</p>
         */
        @NameInMap("Language")
        public String language;

        /**
         * <p>The type of the OS.</p>
         */
        @NameInMap("OsType")
        public String osType;

        /**
         * <p>The information about the OS platform. Valid values:</p>
         * <br>
         * <p>*   CentOS</p>
         * <p>*   Ubuntu</p>
         * <p>*   Windows Server 2016</p>
         * <p>*   Windows Server 2019</p>
         * <p>*   UOS</p>
         */
        @NameInMap("Platform")
        public String platform;

        /**
         * <p>The type of the protocol.</p>
         */
        @NameInMap("ProtocolType")
        public String protocolType;

        /**
         * <p>The type of the session.</p>
         */
        @NameInMap("SessionType")
        public String sessionType;

        /**
         * <p>The inventory status of the desktop type. This parameter is returned only if you set the `CheckStock` parameter to `True`.</p>
         */
        @NameInMap("StockState")
        public String stockState;

        /**
         * <p>Indicates whether disk encryption is enabled.</p>
         */
        @NameInMap("VolumeEncryptionEnabled")
        public Boolean volumeEncryptionEnabled;

        /**
         * <p>The ID of the Key Management Service (KMS) key that is used when disk encryption is enabled.</p>
         */
        @NameInMap("VolumeEncryptionKey")
        public String volumeEncryptionKey;

        public static DescribeBundlesResponseBodyBundles build(java.util.Map<String, ?> map) throws Exception {
            DescribeBundlesResponseBodyBundles self = new DescribeBundlesResponseBodyBundles();
            return TeaModel.build(map, self);
        }

        public DescribeBundlesResponseBodyBundles setBundleId(String bundleId) {
            this.bundleId = bundleId;
            return this;
        }
        public String getBundleId() {
            return this.bundleId;
        }

        public DescribeBundlesResponseBodyBundles setBundleName(String bundleName) {
            this.bundleName = bundleName;
            return this;
        }
        public String getBundleName() {
            return this.bundleName;
        }

        public DescribeBundlesResponseBodyBundles setBundleType(String bundleType) {
            this.bundleType = bundleType;
            return this;
        }
        public String getBundleType() {
            return this.bundleType;
        }

        public DescribeBundlesResponseBodyBundles setCreationTime(String creationTime) {
            this.creationTime = creationTime;
            return this;
        }
        public String getCreationTime() {
            return this.creationTime;
        }

        public DescribeBundlesResponseBodyBundles setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeBundlesResponseBodyBundles setDesktopType(String desktopType) {
            this.desktopType = desktopType;
            return this;
        }
        public String getDesktopType() {
            return this.desktopType;
        }

        public DescribeBundlesResponseBodyBundles setDesktopTypeAttribute(DescribeBundlesResponseBodyBundlesDesktopTypeAttribute desktopTypeAttribute) {
            this.desktopTypeAttribute = desktopTypeAttribute;
            return this;
        }
        public DescribeBundlesResponseBodyBundlesDesktopTypeAttribute getDesktopTypeAttribute() {
            return this.desktopTypeAttribute;
        }

        public DescribeBundlesResponseBodyBundles setDesktopTypeFamily(String desktopTypeFamily) {
            this.desktopTypeFamily = desktopTypeFamily;
            return this;
        }
        public String getDesktopTypeFamily() {
            return this.desktopTypeFamily;
        }

        public DescribeBundlesResponseBodyBundles setDisks(java.util.List<DescribeBundlesResponseBodyBundlesDisks> disks) {
            this.disks = disks;
            return this;
        }
        public java.util.List<DescribeBundlesResponseBodyBundlesDisks> getDisks() {
            return this.disks;
        }

        public DescribeBundlesResponseBodyBundles setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public DescribeBundlesResponseBodyBundles setImageName(String imageName) {
            this.imageName = imageName;
            return this;
        }
        public String getImageName() {
            return this.imageName;
        }

        public DescribeBundlesResponseBodyBundles setImageStatus(String imageStatus) {
            this.imageStatus = imageStatus;
            return this;
        }
        public String getImageStatus() {
            return this.imageStatus;
        }

        public DescribeBundlesResponseBodyBundles setLanguage(String language) {
            this.language = language;
            return this;
        }
        public String getLanguage() {
            return this.language;
        }

        public DescribeBundlesResponseBodyBundles setOsType(String osType) {
            this.osType = osType;
            return this;
        }
        public String getOsType() {
            return this.osType;
        }

        public DescribeBundlesResponseBodyBundles setPlatform(String platform) {
            this.platform = platform;
            return this;
        }
        public String getPlatform() {
            return this.platform;
        }

        public DescribeBundlesResponseBodyBundles setProtocolType(String protocolType) {
            this.protocolType = protocolType;
            return this;
        }
        public String getProtocolType() {
            return this.protocolType;
        }

        public DescribeBundlesResponseBodyBundles setSessionType(String sessionType) {
            this.sessionType = sessionType;
            return this;
        }
        public String getSessionType() {
            return this.sessionType;
        }

        public DescribeBundlesResponseBodyBundles setStockState(String stockState) {
            this.stockState = stockState;
            return this;
        }
        public String getStockState() {
            return this.stockState;
        }

        public DescribeBundlesResponseBodyBundles setVolumeEncryptionEnabled(Boolean volumeEncryptionEnabled) {
            this.volumeEncryptionEnabled = volumeEncryptionEnabled;
            return this;
        }
        public Boolean getVolumeEncryptionEnabled() {
            return this.volumeEncryptionEnabled;
        }

        public DescribeBundlesResponseBodyBundles setVolumeEncryptionKey(String volumeEncryptionKey) {
            this.volumeEncryptionKey = volumeEncryptionKey;
            return this;
        }
        public String getVolumeEncryptionKey() {
            return this.volumeEncryptionKey;
        }

    }

}
