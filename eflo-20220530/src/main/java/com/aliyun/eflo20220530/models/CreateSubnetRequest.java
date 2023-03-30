// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class CreateSubnetRequest extends TeaModel {
    @NameInMap("Cidr")
    public String cidr;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("SubnetName")
    public String subnetName;

    @NameInMap("Tag")
    public java.util.List<CreateSubnetRequestTag> tag;

    @NameInMap("Type")
    public String type;

    @NameInMap("VpdId")
    public String vpdId;

    @NameInMap("ZoneId")
    public String zoneId;

    public static CreateSubnetRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSubnetRequest self = new CreateSubnetRequest();
        return TeaModel.build(map, self);
    }

    public CreateSubnetRequest setCidr(String cidr) {
        this.cidr = cidr;
        return this;
    }
    public String getCidr() {
        return this.cidr;
    }

    public CreateSubnetRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateSubnetRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateSubnetRequest setSubnetName(String subnetName) {
        this.subnetName = subnetName;
        return this;
    }
    public String getSubnetName() {
        return this.subnetName;
    }

    public CreateSubnetRequest setTag(java.util.List<CreateSubnetRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateSubnetRequestTag> getTag() {
        return this.tag;
    }

    public CreateSubnetRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public CreateSubnetRequest setVpdId(String vpdId) {
        this.vpdId = vpdId;
        return this;
    }
    public String getVpdId() {
        return this.vpdId;
    }

    public CreateSubnetRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

    public static class CreateSubnetRequestTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static CreateSubnetRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateSubnetRequestTag self = new CreateSubnetRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateSubnetRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateSubnetRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
