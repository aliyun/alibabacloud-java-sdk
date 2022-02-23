// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.csp20201020.models;

import com.aliyun.tea.*;

public class CheckUserResourceRequest extends TeaModel {
    @NameInMap("EnableMultiAvailableZone")
    public Boolean enableMultiAvailableZone;

    @NameInMap("MainZoneId")
    public String mainZoneId;

    @NameInMap("PublicNetworkEnabled")
    public Boolean publicNetworkEnabled;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("Type")
    public String type;

    @NameInMap("ZoneVswitchList")
    public String zoneVswitchList;

    public static CheckUserResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        CheckUserResourceRequest self = new CheckUserResourceRequest();
        return TeaModel.build(map, self);
    }

    public CheckUserResourceRequest setEnableMultiAvailableZone(Boolean enableMultiAvailableZone) {
        this.enableMultiAvailableZone = enableMultiAvailableZone;
        return this;
    }
    public Boolean getEnableMultiAvailableZone() {
        return this.enableMultiAvailableZone;
    }

    public CheckUserResourceRequest setMainZoneId(String mainZoneId) {
        this.mainZoneId = mainZoneId;
        return this;
    }
    public String getMainZoneId() {
        return this.mainZoneId;
    }

    public CheckUserResourceRequest setPublicNetworkEnabled(Boolean publicNetworkEnabled) {
        this.publicNetworkEnabled = publicNetworkEnabled;
        return this;
    }
    public Boolean getPublicNetworkEnabled() {
        return this.publicNetworkEnabled;
    }

    public CheckUserResourceRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CheckUserResourceRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public CheckUserResourceRequest setZoneVswitchList(String zoneVswitchList) {
        this.zoneVswitchList = zoneVswitchList;
        return this;
    }
    public String getZoneVswitchList() {
        return this.zoneVswitchList;
    }

}
