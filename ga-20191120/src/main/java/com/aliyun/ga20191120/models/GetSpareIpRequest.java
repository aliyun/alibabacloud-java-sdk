// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class GetSpareIpRequest extends TeaModel {
    @NameInMap("AcceleratorId")
    public String acceleratorId;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("SpareIp")
    public String spareIp;

    public static GetSpareIpRequest build(java.util.Map<String, ?> map) throws Exception {
        GetSpareIpRequest self = new GetSpareIpRequest();
        return TeaModel.build(map, self);
    }

    public GetSpareIpRequest setAcceleratorId(String acceleratorId) {
        this.acceleratorId = acceleratorId;
        return this;
    }
    public String getAcceleratorId() {
        return this.acceleratorId;
    }

    public GetSpareIpRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public GetSpareIpRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public GetSpareIpRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public GetSpareIpRequest setSpareIp(String spareIp) {
        this.spareIp = spareIp;
        return this;
    }
    public String getSpareIp() {
        return this.spareIp;
    }

}
