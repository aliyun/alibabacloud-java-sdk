// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ga20191120.models;

import com.aliyun.tea.*;

public class DeleteSpareIpsRequest extends TeaModel {
    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("AcceleratorId")
    public String acceleratorId;

    @NameInMap("SpareIps")
    public java.util.List<String> spareIps;

    public static DeleteSpareIpsRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteSpareIpsRequest self = new DeleteSpareIpsRequest();
        return TeaModel.build(map, self);
    }

    public DeleteSpareIpsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public DeleteSpareIpsRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DeleteSpareIpsRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public DeleteSpareIpsRequest setAcceleratorId(String acceleratorId) {
        this.acceleratorId = acceleratorId;
        return this;
    }
    public String getAcceleratorId() {
        return this.acceleratorId;
    }

    public DeleteSpareIpsRequest setSpareIps(java.util.List<String> spareIps) {
        this.spareIps = spareIps;
        return this;
    }
    public java.util.List<String> getSpareIps() {
        return this.spareIps;
    }

}
