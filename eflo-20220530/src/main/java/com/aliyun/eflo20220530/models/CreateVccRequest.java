// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class CreateVccRequest extends TeaModel {
    @NameInMap("AccessCouldService")
    public Boolean accessCouldService;

    @NameInMap("Bandwidth")
    public Integer bandwidth;

    @NameInMap("BgpCidr")
    public String bgpCidr;

    @NameInMap("CenId")
    public String cenId;

    @NameInMap("ConnectionType")
    public String connectionType;

    @NameInMap("Description")
    public String description;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("Tag")
    public java.util.List<CreateVccRequestTag> tag;

    @NameInMap("VSwitchId")
    public String vSwitchId;

    @NameInMap("VccId")
    public String vccId;

    @NameInMap("VccName")
    public String vccName;

    @NameInMap("VpcId")
    public String vpcId;

    @NameInMap("VpdId")
    public String vpdId;

    @NameInMap("ZoneId")
    public String zoneId;

    public static CreateVccRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateVccRequest self = new CreateVccRequest();
        return TeaModel.build(map, self);
    }

    public CreateVccRequest setAccessCouldService(Boolean accessCouldService) {
        this.accessCouldService = accessCouldService;
        return this;
    }
    public Boolean getAccessCouldService() {
        return this.accessCouldService;
    }

    public CreateVccRequest setBandwidth(Integer bandwidth) {
        this.bandwidth = bandwidth;
        return this;
    }
    public Integer getBandwidth() {
        return this.bandwidth;
    }

    public CreateVccRequest setBgpCidr(String bgpCidr) {
        this.bgpCidr = bgpCidr;
        return this;
    }
    public String getBgpCidr() {
        return this.bgpCidr;
    }

    public CreateVccRequest setCenId(String cenId) {
        this.cenId = cenId;
        return this;
    }
    public String getCenId() {
        return this.cenId;
    }

    public CreateVccRequest setConnectionType(String connectionType) {
        this.connectionType = connectionType;
        return this;
    }
    public String getConnectionType() {
        return this.connectionType;
    }

    public CreateVccRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateVccRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateVccRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateVccRequest setTag(java.util.List<CreateVccRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateVccRequestTag> getTag() {
        return this.tag;
    }

    public CreateVccRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public CreateVccRequest setVccId(String vccId) {
        this.vccId = vccId;
        return this;
    }
    public String getVccId() {
        return this.vccId;
    }

    public CreateVccRequest setVccName(String vccName) {
        this.vccName = vccName;
        return this;
    }
    public String getVccName() {
        return this.vccName;
    }

    public CreateVccRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public CreateVccRequest setVpdId(String vpdId) {
        this.vpdId = vpdId;
        return this;
    }
    public String getVpdId() {
        return this.vpdId;
    }

    public CreateVccRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public static class CreateVccRequestTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static CreateVccRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateVccRequestTag self = new CreateVccRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateVccRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateVccRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
