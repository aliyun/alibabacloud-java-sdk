// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class CreateSpareIpsRequest extends TeaModel {
    @NameInMap("AcceleratorId")
    public String acceleratorId;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("SpareIps")
    public java.util.List<String> spareIps;

    public static CreateSpareIpsRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateSpareIpsRequest self = new CreateSpareIpsRequest();
        return TeaModel.build(map, self);
    }

    public CreateSpareIpsRequest setAcceleratorId(String acceleratorId) {
        this.acceleratorId = acceleratorId;
        return this;
    }
    public String getAcceleratorId() {
        return this.acceleratorId;
    }

    public CreateSpareIpsRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateSpareIpsRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public CreateSpareIpsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateSpareIpsRequest setSpareIps(java.util.List<String> spareIps) {
        this.spareIps = spareIps;
        return this;
    }
    public java.util.List<String> getSpareIps() {
        return this.spareIps;
    }

}
