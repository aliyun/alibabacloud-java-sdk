// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeBundlesRequest extends TeaModel {
    @NameInMap("BundleId")
    public java.util.List<String> bundleId;

    // The type of the cloud desktop template. Valid values:
    // 
    // *   SYSTEM: the system template
    // *   CUSTOM: the custom template
    @NameInMap("BundleType")
    public String bundleType;

    // Specifies whether to query the inventory status of the cloud desktop type.
    @NameInMap("CheckStock")
    public Boolean checkStock;

    // The number of vCPUs that is defined in the cloud desktop type.
    @NameInMap("CpuCount")
    public Integer cpuCount;

    // The family of the cloud desktop type. Valid values:
    // 
    // *   eds.general: General Office
    // *   eds.hf: High Frequency
    // *   eds.graphics: Graphics
    @NameInMap("DesktopTypeFamily")
    public String desktopTypeFamily;

    @NameInMap("FotaChannel")
    public String fotaChannel;

    // Specifies whether the cloud desktop template belongs to a desktop group. Default value: false.
    @NameInMap("FromDesktopGroup")
    public Boolean fromDesktopGroup;

    // The number of GPUs that is defined in the cloud desktop type.
    @NameInMap("GpuCount")
    public Float gpuCount;

    // The number of entries to return on each page.
    // 
    // Maximum value: 100.
    // 
    // Default value: 10.
    @NameInMap("MaxResults")
    public Integer maxResults;

    // The memory size that is defined in the cloud desktop type. Unit: GiB.
    @NameInMap("MemorySize")
    public Integer memorySize;

    // The token that is used to start the next query.
    @NameInMap("NextToken")
    public String nextToken;

    // The protocol type.
    // 
    // *   HDX
    // *   ASP (Recommend)
    @NameInMap("ProtocolType")
    public String protocolType;

    // The ID of the region.
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("SelectedBundle")
    public Boolean selectedBundle;

    @NameInMap("SupportMultiSession")
    public Boolean supportMultiSession;

    @NameInMap("VolumeEncryptionEnabled")
    public Boolean volumeEncryptionEnabled;

    public static DescribeBundlesRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeBundlesRequest self = new DescribeBundlesRequest();
        return TeaModel.build(map, self);
    }

    public DescribeBundlesRequest setBundleId(java.util.List<String> bundleId) {
        this.bundleId = bundleId;
        return this;
    }
    public java.util.List<String> getBundleId() {
        return this.bundleId;
    }

    public DescribeBundlesRequest setBundleType(String bundleType) {
        this.bundleType = bundleType;
        return this;
    }
    public String getBundleType() {
        return this.bundleType;
    }

    public DescribeBundlesRequest setCheckStock(Boolean checkStock) {
        this.checkStock = checkStock;
        return this;
    }
    public Boolean getCheckStock() {
        return this.checkStock;
    }

    public DescribeBundlesRequest setCpuCount(Integer cpuCount) {
        this.cpuCount = cpuCount;
        return this;
    }
    public Integer getCpuCount() {
        return this.cpuCount;
    }

    public DescribeBundlesRequest setDesktopTypeFamily(String desktopTypeFamily) {
        this.desktopTypeFamily = desktopTypeFamily;
        return this;
    }
    public String getDesktopTypeFamily() {
        return this.desktopTypeFamily;
    }

    public DescribeBundlesRequest setFotaChannel(String fotaChannel) {
        this.fotaChannel = fotaChannel;
        return this;
    }
    public String getFotaChannel() {
        return this.fotaChannel;
    }

    public DescribeBundlesRequest setFromDesktopGroup(Boolean fromDesktopGroup) {
        this.fromDesktopGroup = fromDesktopGroup;
        return this;
    }
    public Boolean getFromDesktopGroup() {
        return this.fromDesktopGroup;
    }

    public DescribeBundlesRequest setGpuCount(Float gpuCount) {
        this.gpuCount = gpuCount;
        return this;
    }
    public Float getGpuCount() {
        return this.gpuCount;
    }

    public DescribeBundlesRequest setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public DescribeBundlesRequest setMemorySize(Integer memorySize) {
        this.memorySize = memorySize;
        return this;
    }
    public Integer getMemorySize() {
        return this.memorySize;
    }

    public DescribeBundlesRequest setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public DescribeBundlesRequest setProtocolType(String protocolType) {
        this.protocolType = protocolType;
        return this;
    }
    public String getProtocolType() {
        return this.protocolType;
    }

    public DescribeBundlesRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DescribeBundlesRequest setSelectedBundle(Boolean selectedBundle) {
        this.selectedBundle = selectedBundle;
        return this;
    }
    public Boolean getSelectedBundle() {
        return this.selectedBundle;
    }

    public DescribeBundlesRequest setSupportMultiSession(Boolean supportMultiSession) {
        this.supportMultiSession = supportMultiSession;
        return this;
    }
    public Boolean getSupportMultiSession() {
        return this.supportMultiSession;
    }

    public DescribeBundlesRequest setVolumeEncryptionEnabled(Boolean volumeEncryptionEnabled) {
        this.volumeEncryptionEnabled = volumeEncryptionEnabled;
        return this;
    }
    public Boolean getVolumeEncryptionEnabled() {
        return this.volumeEncryptionEnabled;
    }

}
