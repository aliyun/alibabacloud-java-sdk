// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeBundlesResponse extends TeaModel {
    @NameInMap("NextToken")
    @Validation(required = true)
    public String nextToken;

    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Bundles")
    @Validation(required = true)
    public java.util.List<DescribeBundlesResponseBundles> bundles;

    public static DescribeBundlesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeBundlesResponse self = new DescribeBundlesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeBundlesResponse setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeBundlesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeBundlesResponse setBundles(java.util.List<DescribeBundlesResponseBundles> bundles) {
        this.bundles = bundles;
        return this;
    }
    public java.util.List<DescribeBundlesResponseBundles> getBundles() {
        return this.bundles;
    }

    public static class DescribeBundlesResponseBundlesDisks extends TeaModel {
        @NameInMap("DiskSize")
        @Validation(required = true)
        public Integer diskSize;

        @NameInMap("DiskType")
        @Validation(required = true)
        public String diskType;

        public static DescribeBundlesResponseBundlesDisks build(java.util.Map<String, ?> map) throws Exception {
            DescribeBundlesResponseBundlesDisks self = new DescribeBundlesResponseBundlesDisks();
            return TeaModel.build(map, self);
        }

        public DescribeBundlesResponseBundlesDisks setDiskSize(Integer diskSize) {
            this.diskSize = diskSize;
            return this;
        }
        public Integer getDiskSize() {
            return this.diskSize;
        }

        public DescribeBundlesResponseBundlesDisks setDiskType(String diskType) {
            this.diskType = diskType;
            return this;
        }
        public String getDiskType() {
            return this.diskType;
        }

    }

    public static class DescribeBundlesResponseBundlesDesktopTypeAttribute extends TeaModel {
        @NameInMap("CpuCount")
        @Validation(required = true)
        public Integer cpuCount;

        @NameInMap("MemorySize")
        @Validation(required = true)
        public Integer memorySize;

        @NameInMap("GpuCount")
        @Validation(required = true)
        public Float gpuCount;

        @NameInMap("GpuSpec")
        @Validation(required = true)
        public String gpuSpec;

        public static DescribeBundlesResponseBundlesDesktopTypeAttribute build(java.util.Map<String, ?> map) throws Exception {
            DescribeBundlesResponseBundlesDesktopTypeAttribute self = new DescribeBundlesResponseBundlesDesktopTypeAttribute();
            return TeaModel.build(map, self);
        }

        public DescribeBundlesResponseBundlesDesktopTypeAttribute setCpuCount(Integer cpuCount) {
            this.cpuCount = cpuCount;
            return this;
        }
        public Integer getCpuCount() {
            return this.cpuCount;
        }

        public DescribeBundlesResponseBundlesDesktopTypeAttribute setMemorySize(Integer memorySize) {
            this.memorySize = memorySize;
            return this;
        }
        public Integer getMemorySize() {
            return this.memorySize;
        }

        public DescribeBundlesResponseBundlesDesktopTypeAttribute setGpuCount(Float gpuCount) {
            this.gpuCount = gpuCount;
            return this;
        }
        public Float getGpuCount() {
            return this.gpuCount;
        }

        public DescribeBundlesResponseBundlesDesktopTypeAttribute setGpuSpec(String gpuSpec) {
            this.gpuSpec = gpuSpec;
            return this;
        }
        public String getGpuSpec() {
            return this.gpuSpec;
        }

    }

    public static class DescribeBundlesResponseBundles extends TeaModel {
        @NameInMap("ImageId")
        @Validation(required = true)
        public String imageId;

        @NameInMap("BundleId")
        @Validation(required = true)
        public String bundleId;

        @NameInMap("BundleType")
        @Validation(required = true)
        public String bundleType;

        @NameInMap("BundleName")
        @Validation(required = true)
        public String bundleName;

        @NameInMap("Description")
        @Validation(required = true)
        public String description;

        @NameInMap("DesktopType")
        @Validation(required = true)
        public String desktopType;

        @NameInMap("OsType")
        @Validation(required = true)
        public String osType;

        @NameInMap("Disks")
        @Validation(required = true)
        public java.util.List<DescribeBundlesResponseBundlesDisks> disks;

        @NameInMap("DesktopTypeAttribute")
        @Validation(required = true)
        public DescribeBundlesResponseBundlesDesktopTypeAttribute desktopTypeAttribute;

        public static DescribeBundlesResponseBundles build(java.util.Map<String, ?> map) throws Exception {
            DescribeBundlesResponseBundles self = new DescribeBundlesResponseBundles();
            return TeaModel.build(map, self);
        }

        public DescribeBundlesResponseBundles setImageId(String imageId) {
            this.imageId = imageId;
            return this;
        }
        public String getImageId() {
            return this.imageId;
        }

        public DescribeBundlesResponseBundles setBundleId(String bundleId) {
            this.bundleId = bundleId;
            return this;
        }
        public String getBundleId() {
            return this.bundleId;
        }

        public DescribeBundlesResponseBundles setBundleType(String bundleType) {
            this.bundleType = bundleType;
            return this;
        }
        public String getBundleType() {
            return this.bundleType;
        }

        public DescribeBundlesResponseBundles setBundleName(String bundleName) {
            this.bundleName = bundleName;
            return this;
        }
        public String getBundleName() {
            return this.bundleName;
        }

        public DescribeBundlesResponseBundles setDescription(String description) {
            this.description = description;
            return this;
        }
        public String getDescription() {
            return this.description;
        }

        public DescribeBundlesResponseBundles setDesktopType(String desktopType) {
            this.desktopType = desktopType;
            return this;
        }
        public String getDesktopType() {
            return this.desktopType;
        }

        public DescribeBundlesResponseBundles setOsType(String osType) {
            this.osType = osType;
            return this;
        }
        public String getOsType() {
            return this.osType;
        }

        public DescribeBundlesResponseBundles setDisks(java.util.List<DescribeBundlesResponseBundlesDisks> disks) {
            this.disks = disks;
            return this;
        }
        public java.util.List<DescribeBundlesResponseBundlesDisks> getDisks() {
            return this.disks;
        }

        public DescribeBundlesResponseBundles setDesktopTypeAttribute(DescribeBundlesResponseBundlesDesktopTypeAttribute desktopTypeAttribute) {
            this.desktopTypeAttribute = desktopTypeAttribute;
            return this;
        }
        public DescribeBundlesResponseBundlesDesktopTypeAttribute getDesktopTypeAttribute() {
            return this.desktopTypeAttribute;
        }

    }

}
