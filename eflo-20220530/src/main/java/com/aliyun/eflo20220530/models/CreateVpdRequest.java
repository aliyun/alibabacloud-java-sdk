// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class CreateVpdRequest extends TeaModel {
    @NameInMap("Cidr")
    public String cidr;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("Subnets")
    public java.util.List<CreateVpdRequestSubnets> subnets;

    @NameInMap("Tag")
    public java.util.List<CreateVpdRequestTag> tag;

    @NameInMap("VpdName")
    public String vpdName;

    public static CreateVpdRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateVpdRequest self = new CreateVpdRequest();
        return TeaModel.build(map, self);
    }

    public CreateVpdRequest setCidr(String cidr) {
        this.cidr = cidr;
        return this;
    }
    public String getCidr() {
        return this.cidr;
    }

    public CreateVpdRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateVpdRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateVpdRequest setSubnets(java.util.List<CreateVpdRequestSubnets> subnets) {
        this.subnets = subnets;
        return this;
    }
    public java.util.List<CreateVpdRequestSubnets> getSubnets() {
        return this.subnets;
    }

    public CreateVpdRequest setTag(java.util.List<CreateVpdRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateVpdRequestTag> getTag() {
        return this.tag;
    }

    public CreateVpdRequest setVpdName(String vpdName) {
        this.vpdName = vpdName;
        return this;
    }
    public String getVpdName() {
        return this.vpdName;
    }

    public static class CreateVpdRequestSubnets extends TeaModel {
        @NameInMap("Cidr")
        public String cidr;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("SubnetName")
        public String subnetName;

        @NameInMap("Type")
        public String type;

        @NameInMap("ZoneId")
        public String zoneId;

        public static CreateVpdRequestSubnets build(java.util.Map<String, ?> map) throws Exception {
            CreateVpdRequestSubnets self = new CreateVpdRequestSubnets();
            return TeaModel.build(map, self);
        }

        public CreateVpdRequestSubnets setCidr(String cidr) {
            this.cidr = cidr;
            return this;
        }
        public String getCidr() {
            return this.cidr;
        }

        public CreateVpdRequestSubnets setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public CreateVpdRequestSubnets setSubnetName(String subnetName) {
            this.subnetName = subnetName;
            return this;
        }
        public String getSubnetName() {
            return this.subnetName;
        }

        public CreateVpdRequestSubnets setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public CreateVpdRequestSubnets setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

    public static class CreateVpdRequestTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static CreateVpdRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateVpdRequestTag self = new CreateVpdRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateVpdRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateVpdRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
