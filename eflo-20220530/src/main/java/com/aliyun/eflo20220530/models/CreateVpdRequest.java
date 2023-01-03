// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class CreateVpdRequest extends TeaModel {
    @NameInMap("Cidr")
    public String cidr;

    @NameInMap("Name")
    public String name;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("Subnets")
    public java.util.List<CreateVpdRequestSubnets> subnets;

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

    public CreateVpdRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateVpdRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateVpdRequest setSubnets(java.util.List<CreateVpdRequestSubnets> subnets) {
        this.subnets = subnets;
        return this;
    }
    public java.util.List<CreateVpdRequestSubnets> getSubnets() {
        return this.subnets;
    }

    public static class CreateVpdRequestSubnets extends TeaModel {
        @NameInMap("Cidr")
        public String cidr;

        @NameInMap("Name")
        public String name;

        @NameInMap("RegionId")
        public String regionId;

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

        public CreateVpdRequestSubnets setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public CreateVpdRequestSubnets setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
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

}
