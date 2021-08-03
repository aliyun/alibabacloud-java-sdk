// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeBundlesResponseBody extends TeaModel {
    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Bundles")
    public java.util.List<DescribeBundlesResponseBodyBundles> bundles;

    public static DescribeBundlesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeBundlesResponseBody self = new DescribeBundlesResponseBody();
        return TeaModel.build(map, self);
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

    public DescribeBundlesResponseBody setBundles(java.util.List<DescribeBundlesResponseBodyBundles> bundles) {
        this.bundles = bundles;
        return this;
    }
    public java.util.List<DescribeBundlesResponseBodyBundles> getBundles() {
        return this.bundles;
    }

    public static class DescribeBundlesResponseBodyBundlesDisks extends TeaModel {
        @NameInMap("DiskType")
        public String diskType;

        @NameInMap("DiskSize")
        public Integer diskSize;

        public static DescribeBundlesResponseBodyBundlesDisks build(java.util.Map<String, ?> map) throws Exception {
            DescribeBundlesResponseBodyBundlesDisks self = new DescribeBundlesResponseBodyBundlesDisks();
            return TeaModel.build(map, self);
        }

        public DescribeBundlesResponseBodyBundlesDisks setDiskType(String diskType) {
            this.diskType = diskType;
            return this;
        }
        public String getDiskType() {
            return this.diskType;
        }

        public DescribeBundlesResponseBodyBundlesDisks setDiskSize(Integer diskSize) {
            this.diskSize = diskSize;
            return this;
        }
        public Integer getDiskSize() {
            return this.diskSize;
        }

    }

    public static class DescribeBundlesResponseBodyBundlesDesktopTypeAttribute extends TeaModel {
        @NameInMap("CpuCount")
        public Integer cpuCount;

        @NameInMap("GpuCount")
        public Float gpuCount;

        @NameInMap("GpuSpec")
        public String gpuSpec;

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

    public static class DescribeBundlesResponseBodyBundles extends TeaModel {
        @NameInMap("Description")
        public String description;

        @NameInMap("BundleType")
        public String bundleType;

        @NameInMap("OsType")
        public String osType;

        @NameInMap("StockState")
        public String stockState;

        @NameInMap("DesktopType")
        public String desktopType;

        @NameInMap("ProtocolType")
        public String protocolType;

        @NameInMap("BundleId")
        public String bundleId;

        @NameInMap("ImageId")
        public String imageId;

        @NameInMap("BundleName")
        public String bundleName;

        @NameInMap("Disks")
        public java.util.List<DescribeBundlesResponseBodyBundlesDisks> disks;

        @NameInMap("DesktopTypeAttribute")
        public DescribeBundlesResponseBodyBundlesDesktopTypeAttribute desktopTypeAttribute;

        public static DescribeBundlesResponseBodyBundles build(java.util.Map<String, ?> map) throws Exception {
            DescribeBundlesResponseBodyBundles self = new DescribeBundlesResponseBodyBundles();
            return TeaModel.build(map, self);
        }

        public DescribeBundlesResponseBodyBundles setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeBundlesResponseBodyBundles setBundleType(String bundleType) {
            this.bundleType = bundleType;
            return this;
        }
        public String getBundleType() {
            return this.bundleType;
        }

        public DescribeBundlesResponseBodyBundles setOsType(String osType) {
            this.osType = osType;
            return this;
        }
        public String getOsType() {
            return this.osType;
        }

        public DescribeBundlesResponseBodyBundles setStockState(String stockState) {
            this.stockState = stockState;
            return this;
        }
        public String getStockState() {
            return this.stockState;
        }

        public DescribeBundlesResponseBodyBundles setDesktopType(String desktopType) {
            this.desktopType = desktopType;
            return this;
        }
        public String getDesktopType() {
            return this.desktopType;
        }

        public DescribeBundlesResponseBodyBundles setProtocolType(String protocolType) {
            this.protocolType = protocolType;
            return this;
        }
        public String getProtocolType() {
            return this.protocolType;
        }

        public DescribeBundlesResponseBodyBundles setBundleId(String bundleId) {
            this.bundleId = bundleId;
            return this;
        }
        public String getBundleId() {
            return this.bundleId;
        }

        public DescribeBundlesResponseBodyBundles setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public DescribeBundlesResponseBodyBundles setBundleName(String bundleName) {
            this.bundleName = bundleName;
            return this;
        }
        public String getBundleName() {
            return this.bundleName;
        }

        public DescribeBundlesResponseBodyBundles setDisks(java.util.List<DescribeBundlesResponseBodyBundlesDisks> disks) {
            this.disks = disks;
            return this;
        }
        public java.util.List<DescribeBundlesResponseBodyBundlesDisks> getDisks() {
            return this.disks;
        }

        public DescribeBundlesResponseBodyBundles setDesktopTypeAttribute(DescribeBundlesResponseBodyBundlesDesktopTypeAttribute desktopTypeAttribute) {
            this.desktopTypeAttribute = desktopTypeAttribute;
            return this;
        }
        public DescribeBundlesResponseBodyBundlesDesktopTypeAttribute getDesktopTypeAttribute() {
            return this.desktopTypeAttribute;
        }

    }

}
