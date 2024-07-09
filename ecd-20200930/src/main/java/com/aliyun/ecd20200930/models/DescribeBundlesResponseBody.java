// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeBundlesResponseBody extends TeaModel {
    /**
     * <p>The details of the queried cloud computer templates.</p>
     */
    @NameInMap("Bundles")
    public java.util.List<DescribeBundlesResponseBodyBundles> bundles;

    /**
     * <p>The token that is used for the next query. If this parameter is empty, all results have been returned.</p>
     * 
     * <strong>example:</strong>
     * <p>AAAAAV3MpHK1AP0pfERHZN5pu6lu3PTF6h3zE8egwlYuv8M8</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>BCC854D8-5D1E-46D3-96EF-797A5DD36789</p>
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
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("CpuCount")
        public Integer cpuCount;

        /**
         * <p>The number of GPUs.</p>
         * 
         * <strong>example:</strong>
         * <p>0.5</p>
         */
        @NameInMap("GpuCount")
        public Float gpuCount;

        /**
         * <p>The GPU type.</p>
         * 
         * <strong>example:</strong>
         * <p>NVIDIA T4</p>
         */
        @NameInMap("GpuSpec")
        public String gpuSpec;

        /**
         * <p>The memory size. Unit: MiB.</p>
         * 
         * <strong>example:</strong>
         * <p>47104</p>
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
         * <p>The PL of the disk.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><p>PL1</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>PL0</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>PL3</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>PL2</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- --></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PL0</p>
         */
        @NameInMap("DiskPerformanceLevel")
        public String diskPerformanceLevel;

        /**
         * <p>The size of the disk. Unit: GiB.</p>
         * 
         * <strong>example:</strong>
         * <p>150</p>
         */
        @NameInMap("DiskSize")
        public Integer diskSize;

        /**
         * <p>The type of the disk.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><p>SYSTEM: system disk</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>DATA: data disk</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- --></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SYSTEM</p>
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
         * <p>The ID of the cloud computer template.</p>
         * 
         * <strong>example:</strong>
         * <p>bundle_ecd_graphics.2xlarge_s15d15_win2019</p>
         */
        @NameInMap("BundleId")
        public String bundleId;

        /**
         * <p>The name of the cloud computer template.</p>
         * 
         * <strong>example:</strong>
         * <p>Advanced graphics with Windows 2019</p>
         */
        @NameInMap("BundleName")
        public String bundleName;

        /**
         * <p>The type of the cloud computer template.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><p>SYSTEM: system template</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>CUSTOM: custom template</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- --></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SYSTEM</p>
         */
        @NameInMap("BundleType")
        public String bundleType;

        /**
         * <p>The time when the cloud computer template was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2021-09-30T06:09Z</p>
         */
        @NameInMap("CreationTime")
        public String creationTime;

        /**
         * <p>The description of the cloud computer template.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("Description")
        public String description;

        /**
         * <p>The instance type of the cloud computer.</p>
         * 
         * <strong>example:</strong>
         * <p>ecd.graphics.2xlarge</p>
         */
        @NameInMap("DesktopType")
        public String desktopType;

        /**
         * <p>The details of the cloud computer instance type.</p>
         */
        @NameInMap("DesktopTypeAttribute")
        public DescribeBundlesResponseBodyBundlesDesktopTypeAttribute desktopTypeAttribute;

        /**
         * <p>The instance family of the cloud computer.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>eds.graphics: graphical instance family</li>
         * <li>eds.hf: instance family with a high clock speed</li>
         * <li>eds.general: general-purpose instance family</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>eds.general</p>
         */
        @NameInMap("DesktopTypeFamily")
        public String desktopTypeFamily;

        /**
         * <p>Details of the disks.</p>
         */
        @NameInMap("Disks")
        public java.util.List<DescribeBundlesResponseBodyBundlesDisks> disks;

        /**
         * <p>The image ID.</p>
         * 
         * <strong>example:</strong>
         * <p>desktopimage-windows-server-2019-64-ch-vgpu</p>
         */
        @NameInMap("ImageId")
        public String imageId;

        /**
         * <p>The image name.</p>
         * 
         * <strong>example:</strong>
         * <p>Windows server 2019 Chinese</p>
         */
        @NameInMap("ImageName")
        public String imageName;

        /**
         * <p>The status of the image.</p>
         * 
         * <strong>example:</strong>
         * <p>Available</p>
         */
        @NameInMap("ImageStatus")
        public String imageStatus;

        /**
         * <p>The OS language of the image.</p>
         * 
         * <strong>example:</strong>
         * <p>en-US</p>
         */
        @NameInMap("Language")
        public String language;

        /**
         * <p>The type of the OS.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><p>Linux</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>Windows</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- --></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Windows</p>
         */
        @NameInMap("OsType")
        public String osType;

        /**
         * <p>The OS.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li><p>Ubuntu</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>Windows Server 2022</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>UOS</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>CentOS</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>Windows Server 2019</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- -->
         * </li>
         * <li><p>Windows Server 2016</p>
         * <!-- -->
         * 
         * <!-- -->
         * 
         * <!-- --></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Windows Server 2019</p>
         */
        @NameInMap("Platform")
        public String platform;

        /**
         * <p>The protocol type.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>HDX: HDX protocol</li>
         * <li>ASP: in-house ASP</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ASP</p>
         */
        @NameInMap("ProtocolType")
        public String protocolType;

        /**
         * <p>The session type.</p>
         * <p>Valid values:</p>
         * <ul>
         * <li>0: single-session</li>
         * <li>1: multi-session</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("SessionType")
        public String sessionType;

        /**
         * <p>The inventory status of the cloud computer instance type. This parameter is returned only if you set the <code>CheckStock</code> parameter to <code>true</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>Sufficient</p>
         */
        @NameInMap("StockState")
        public String stockState;

        /**
         * <p>Indicates whether disk encryption is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("VolumeEncryptionEnabled")
        public Boolean volumeEncryptionEnabled;

        /**
         * <p>The ID of the Key Management Service (KMS) key that is used when disk encryption is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>08c33a6f-4e0a-4a1b-a3fa-7ddfa1d4****</p>
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
