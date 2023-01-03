// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class CreateSubnetRequest extends TeaModel {
    @NameInMap("Cidr")
    public String cidr;

    @NameInMap("Name")
    public String name;

    @NameInMap("RegionId")
    public String regionId;

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

    public CreateSubnetRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateSubnetRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
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

}
