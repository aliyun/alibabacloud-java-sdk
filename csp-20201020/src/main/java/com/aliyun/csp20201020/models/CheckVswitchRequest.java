// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csp20201020.models;

import com.aliyun.tea.*;

public class CheckVswitchRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("VSwitchIds")
    public String vSwitchIds;

    @NameInMap("VpcId")
    public String vpcId;

    @NameInMap("ZoneId")
    public String zoneId;

    public static CheckVswitchRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckVswitchRequest self = new CheckVswitchRequest();
        return TeaModel.build(map, self);
    }

    public CheckVswitchRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CheckVswitchRequest setVSwitchIds(String vSwitchIds) {
        this.vSwitchIds = vSwitchIds;
        return this;
    }
    public String getVSwitchIds() {
        return this.vSwitchIds;
    }

    public CheckVswitchRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public CheckVswitchRequest setZoneId(String zoneId) {
        this.zoneId = zoneId;
        return this;
    }
    public String getZoneId() {
        return this.zoneId;
    }

}
