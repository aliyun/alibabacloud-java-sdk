// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class ReleasePublicIpAddressRequest extends TeaModel {
    @NameInMap("DryRun")
    public Boolean dryRun;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("PublicIpAddress")
    public String publicIpAddress;

    @NameInMap("RegionId")
    public String regionId;

    public static ReleasePublicIpAddressRequest build(java.util.Map<String, ?> map) throws Exception {
        ReleasePublicIpAddressRequest self = new ReleasePublicIpAddressRequest();
        return TeaModel.build(map, self);
    }

    public ReleasePublicIpAddressRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public ReleasePublicIpAddressRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ReleasePublicIpAddressRequest setPublicIpAddress(String publicIpAddress) {
        this.publicIpAddress = publicIpAddress;
        return this;
    }
    public String getPublicIpAddress() {
        return this.publicIpAddress;
    }

    public ReleasePublicIpAddressRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
