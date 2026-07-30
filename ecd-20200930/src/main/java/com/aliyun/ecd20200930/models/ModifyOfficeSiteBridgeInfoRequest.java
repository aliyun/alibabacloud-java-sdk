// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecd20200930.models;

import com.aliyun.tea.*;

public class ModifyOfficeSiteBridgeInfoRequest extends TeaModel {
    /**
     * <p>The virtual bridge ID.</p>
     * 
     * <strong>example:</strong>
     * <p>vb-fsifhaiushfishf***</p>
     */
    @NameInMap("BridgeId")
    public String bridgeId;

    /**
     * <p>The virtual bridge specifications.</p>
     * 
     * <strong>example:</strong>
     * <p>vb.pro</p>
     */
    @NameInMap("BridgeLevel")
    public String bridgeLevel;

    /**
     * <p>The third-party plugin type of the virtual bridge.</p>
     * 
     * <strong>example:</strong>
     * <p>unsr</p>
     */
    @NameInMap("BridgeType")
    public String bridgeType;

    /**
     * <p>Specifies whether to enable the bridge.</p>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("EnableBridge")
    public Boolean enableBridge;

    /**
     * <p>The activation code object.</p>
     * 
     * <strong>example:</strong>
     * <p>ab5b76f4c0bf4a5abd06ea23991a47afa1a4bb4acb4e4204882b40795f946e74</p>
     */
    @NameInMap("License")
    public String license;

    /**
     * <p>The office network ID.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou+dir-387822****</p>
     */
    @NameInMap("OfficeSiteId")
    public String officeSiteId;

    /**
     * <p>The region ID. You can call <a href="~~DescribeRegions~~">DescribeRegions</a> to query the regions supported by Elastic Desktop Service.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    public static ModifyOfficeSiteBridgeInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyOfficeSiteBridgeInfoRequest self = new ModifyOfficeSiteBridgeInfoRequest();
        return TeaModel.build(map, self);
    }

    public ModifyOfficeSiteBridgeInfoRequest setBridgeId(String bridgeId) {
        this.bridgeId = bridgeId;
        return this;
    }
    public String getBridgeId() {
        return this.bridgeId;
    }

    public ModifyOfficeSiteBridgeInfoRequest setBridgeLevel(String bridgeLevel) {
        this.bridgeLevel = bridgeLevel;
        return this;
    }
    public String getBridgeLevel() {
        return this.bridgeLevel;
    }

    public ModifyOfficeSiteBridgeInfoRequest setBridgeType(String bridgeType) {
        this.bridgeType = bridgeType;
        return this;
    }
    public String getBridgeType() {
        return this.bridgeType;
    }

    public ModifyOfficeSiteBridgeInfoRequest setEnableBridge(Boolean enableBridge) {
        this.enableBridge = enableBridge;
        return this;
    }
    public Boolean getEnableBridge() {
        return this.enableBridge;
    }

    public ModifyOfficeSiteBridgeInfoRequest setLicense(String license) {
        this.license = license;
        return this;
    }
    public String getLicense() {
        return this.license;
    }

    public ModifyOfficeSiteBridgeInfoRequest setOfficeSiteId(String officeSiteId) {
        this.officeSiteId = officeSiteId;
        return this;
    }
    public String getOfficeSiteId() {
        return this.officeSiteId;
    }

    public ModifyOfficeSiteBridgeInfoRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
