// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ecs20140526.models;

import com.aliyun.tea.*;

public class RemoveBandwidthPackageIpsRequest extends TeaModel {
    @NameInMap("RegionId")
    @Validation(required = true)
    public String regionId;

    @NameInMap("BandwidthPackageId")
    @Validation(required = true)
    public String bandwidthPackageId;

    @NameInMap("ClientToken")
    public String clientToken;

    @NameInMap("RemovedIpAddresses")
    @Validation(required = true)
    public java.util.List<String> removedIpAddresses;

    public static RemoveBandwidthPackageIpsRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveBandwidthPackageIpsRequest self = new RemoveBandwidthPackageIpsRequest();
        return TeaModel.build(map, self);
    }

    public RemoveBandwidthPackageIpsRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public RemoveBandwidthPackageIpsRequest setBandwidthPackageId(String bandwidthPackageId) {
        this.bandwidthPackageId = bandwidthPackageId;
        return this;
    }
    public String getBandwidthPackageId() {
        return this.bandwidthPackageId;
    }

    public RemoveBandwidthPackageIpsRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public RemoveBandwidthPackageIpsRequest setRemovedIpAddresses(java.util.List<String> removedIpAddresses) {
        this.removedIpAddresses = removedIpAddresses;
        return this;
    }
    public java.util.List<String> getRemovedIpAddresses() {
        return this.removedIpAddresses;
    }

}
