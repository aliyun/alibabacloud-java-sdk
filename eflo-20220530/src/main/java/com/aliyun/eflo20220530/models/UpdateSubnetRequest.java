// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eflo20220530.models;

import com.aliyun.tea.*;

public class UpdateSubnetRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("SubnetId")
    public String subnetId;

    @NameInMap("SubnetName")
    public String subnetName;

    @NameInMap("VpdId")
    public String vpdId;

    @NameInMap("ZoneId")
    public String zoneId;

    public static UpdateSubnetRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateSubnetRequest self = new UpdateSubnetRequest();
        return TeaModel.build(map, self);
    }

    public UpdateSubnetRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateSubnetRequest setSubnetId(String subnetId) {
        this.subnetId = subnetId;
        return this;
    }
    public String getSubnetId() {
        return this.subnetId;
    }

    public UpdateSubnetRequest setSubnetName(String subnetName) {
        this.subnetName = subnetName;
        return this;
    }
    public String getSubnetName() {
        return this.subnetName;
    }

    public UpdateSubnetRequest setVpdId(String vpdId) {
        this.vpdId = vpdId;
        return this;
    }
    public String getVpdId() {
        return this.vpdId;
    }

    public UpdateSubnetRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}
