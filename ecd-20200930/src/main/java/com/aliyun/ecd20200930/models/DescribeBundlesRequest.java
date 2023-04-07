// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeBundlesRequest extends TeaModel {
    /**
     * <p>The IDs of the desktop templates. You can specify 1 to 100 desktop templates.</p>
     */
    @NameInMap("BundleId")
    public java.util.List<String> bundleId;

    /**
     * <p>The type of the desktop template.</p>
     */
    @NameInMap("BundleType")
    public String bundleType;

    /**
     * <p>Specifies whether to query the inventory status of the desktop type.</p>
     */
    @NameInMap("CheckStock")
    public Boolean checkStock;

    /**
     * <p>The number of vCPUs of the desktop type.</p>
     */
    @NameInMap("CpuCount")
    public Integer cpuCount;

    /**
     * <p>The family of the desktop type.</p>
     */
    @NameInMap("DesktopTypeFamily")
    public String desktopTypeFamily;

    /**
     * <p>This parameter is now in invitational preview and unavailable.</p>
     */
    @NameInMap("FotaChannel")
    public String fotaChannel;

    /**
     * <p>Specifies whether the cloud desktop that uses the desktop template belongs to the desktop group. Default value: `false`.</p>
     */
    @NameInMap("FromDesktopGroup")
    public Boolean fromDesktopGroup;

    /**
     * <p>The number of GPUs of the desktop type.</p>
     */
    @NameInMap("GpuCount")
    public Float gpuCount;

    @NameInMap("ImageId")
    public java.util.List<String> imageId;

    /**
     * <p>The number of entries to return on each page.</p>
     * <br>
     * <p>*   Maximum value: 100.</p>
     * <p>*   Default value: 10.</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The memory size of the desktop type. Unit: GiB.</p>
     */
    @NameInMap("MemorySize")
    public Integer memorySize;

    /**
     * <p>The token that determines the start point of the next query.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The type of the protocol.</p>
     */
    @NameInMap("ProtocolType")
    public String protocolType;

    /**
     * <p>The ID of the region. You can call the [DescribeRegions](~~196646~~) operation to query the most recent region list.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The desktop template that is selected based on specific criteria.</p>
     */
    @NameInMap("SelectedBundle")
    public Boolean selectedBundle;

    /**
     * <p>The type of the session.</p>
     */
    @NameInMap("SessionType")
    public String sessionType;

    /**
     * <p>Specifies whether to return multi-session desktop templates in this call. Default value: false.</p>
     */
    @NameInMap("SupportMultiSession")
    public Boolean supportMultiSession;

    /**
     * <p>Specifies whether to enable disk encryption.</p>
     */
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
