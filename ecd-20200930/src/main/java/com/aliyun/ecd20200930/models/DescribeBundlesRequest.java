// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeBundlesRequest extends TeaModel {
    @NameInMap("BundleId")
    public java.util.List<String> bundleId;

    @NameInMap("BundleType")
    public String bundleType;

    @NameInMap("CheckStock")
    public Boolean checkStock;

    @NameInMap("CpuCount")
    public Integer cpuCount;

    @NameInMap("DesktopTypeFamily")
    public String desktopTypeFamily;

    @NameInMap("FotaChannel")
    public String fotaChannel;

    @NameInMap("FromDesktopGroup")
    public Boolean fromDesktopGroup;

    @NameInMap("GpuCount")
    public Float gpuCount;

    @NameInMap("ImageId")
    public java.util.List<String> imageId;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("MemorySize")
    public Integer memorySize;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("OsType")
    public String osType;

    @NameInMap("ProtocolType")
    public String protocolType;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("Scope")
    public String scope;

    @NameInMap("SelectedBundle")
    public Boolean selectedBundle;

    @NameInMap("SessionType")
    public String sessionType;

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

    public DescribeBundlesRequest setImageId(java.util.List<String> imageId) {
        this.imageId = imageId;
        return this;
    }
    public java.util.List<String> getImageId() {
        return this.imageId;
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

    public DescribeBundlesRequest setOsType(String osType) {
        this.osType = osType;
        return this;
    }
    public String getOsType() {
        return this.osType;
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

    public DescribeBundlesRequest setScope(String scope) {
        this.scope = scope;
        return this;
    }
    public String getScope() {
        return this.scope;
    }

    public DescribeBundlesRequest setSelectedBundle(Boolean selectedBundle) {
        this.selectedBundle = selectedBundle;
        return this;
    }
    public Boolean getSelectedBundle() {
        return this.selectedBundle;
    }

    public DescribeBundlesRequest setSessionType(String sessionType) {
        this.sessionType = sessionType;
        return this;
    }
    public String getSessionType() {
        return this.sessionType;
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
