// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cciotgw20210721.models;

import com.aliyun.tea.*;

public class SwitchVpcRouteToBackUpZoneRequest extends TeaModel {
    @NameInMap("CciotGwId")
    public String cciotGwId;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("Zone")
    public String zone;

    public static SwitchVpcRouteToBackUpZoneRequest build(java.util.Map<String, ?> map) throws Exception {
        SwitchVpcRouteToBackUpZoneRequest self = new SwitchVpcRouteToBackUpZoneRequest();
        return TeaModel.build(map, self);
    }

    public SwitchVpcRouteToBackUpZoneRequest setCciotGwId(String cciotGwId) {
        this.cciotGwId = cciotGwId;
        return this;
    }
    public String getCciotGwId() {
        return this.cciotGwId;
    }

    public SwitchVpcRouteToBackUpZoneRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public SwitchVpcRouteToBackUpZoneRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public SwitchVpcRouteToBackUpZoneRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public SwitchVpcRouteToBackUpZoneRequest setZone(String zone) {
        this.zone = zone;
        return this;
    }
    public String getZone() {
        return this.zone;
    }

}
