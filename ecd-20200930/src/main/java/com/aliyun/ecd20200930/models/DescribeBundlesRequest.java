// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class DescribeBundlesRequest extends TeaModel {
    /**
     * <p>The IDs of the cloud computer templates. You can specify 1 to 100 IDs.</p>
     * 
     * <strong>example:</strong>
     * <p>bundle_ecd_graphics.2xlarge_s15d15_win2019</p>
     */
    @NameInMap("BundleId")
    public java.util.List<String> bundleId;

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
     * <p>Specifies whether to query the inventory status of the cloud computer instance type.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("CheckStock")
    public Boolean checkStock;

    /**
     * <p>The number of vCPUs contained in the cloud computer instance type.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("CpuCount")
    public Integer cpuCount;

    /**
     * <p>The instance family of the cloud computers.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>eds.graphics: graphical instance families</li>
     * <li>eds.hf: instance families with high clock speeds</li>
     * <li>eds.general: general-purpose instance families</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>eds.general</p>
     */
    @NameInMap("DesktopTypeFamily")
    public String desktopTypeFamily;

    /**
     * <p>This parameter is now in invitational preview and not publicly available.</p>
     * 
     * <strong>example:</strong>
     * <p>This parameter is now in invitational preview and unavailable.</p>
     */
    @NameInMap("FotaChannel")
    public String fotaChannel;

    /**
     * <p>Specifies whether the cloud computers in the template belong to a cloud computer pool.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li><p>true</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- -->
     * </li>
     * <li><p>false</p>
     * <!-- -->
     * 
     * <!-- -->
     * 
     * <!-- --></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("FromDesktopGroup")
    public Boolean fromDesktopGroup;

    /**
     * <p>The number of GPUs contained in the cloud computer instance type.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("GpuCount")
    public Float gpuCount;

    /**
     * <p>The image ID.</p>
     */
    @NameInMap("ImageId")
    public java.util.List<String> imageId;

    /**
     * <p>The number of entries to return on each page.</p>
     * <p>Maximum value: 100.</p>
     * <p>Default value: 10.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The memory size of the cloud computer instance type. Unit: GiB.</p>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("MemorySize")
    public Integer memorySize;

    /**
     * <p>The token that is used to start the next query.</p>
     * 
     * <strong>example:</strong>
     * <p>caeba0bbb2be03f84eb48b699f0a4883</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

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
     * <p>The protocol type.</p>
     * <p>Valid values:</p>
     * <ul>
     * <li>HDX: High-definition Experience (HDX) protocol</li>
     * <li>ASP: in-house Adaptive Streaming Protocol (ASP) (recommend)</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>ASP</p>
     */
    @NameInMap("ProtocolType")
    public String protocolType;

    /**
     * <p>The region ID. You can call the <a href="https://help.aliyun.com/document_detail/196646.html">DescribeRegions</a> operation to query the most recent region list.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The scenario to use the image.</p>
     * 
     * <strong>example:</strong>
     * <p>FastBuy</p>
     */
    @NameInMap("Scope")
    public String scope;

    /**
     * <p>The desktop template that is selected based on specific criteria.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("SelectedBundle")
    public Boolean selectedBundle;

    /**
     * <p>The type of the session.</p>
     * <p>Enumeration Value:</p>
     * <ul>
     * <li><strong>SingleSession</strong></li>
     * <li><strong>MultipleSession</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>SingleSession</p>
     */
    @NameInMap("SessionType")
    public String sessionType;

    /**
     * <p>Specifies whether to return multi-session cloud computer templates. Default value: false.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("SupportMultiSession")
    public Boolean supportMultiSession;

    /**
     * <p>Specifies whether to enable disk encryption.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
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
