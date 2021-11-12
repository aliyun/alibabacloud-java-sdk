// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class DetachCommonBandwidthPackageFromLoadBalancerRequest extends TeaModel {
    // 带宽包ID
    @NameInMap("BandwidthPackageId")
    public String bandwidthPackageId;

    // 幂等参数
    @NameInMap("ClientToken")
    public String clientToken;

    // 预校验
    @NameInMap("DryRun")
    public Boolean dryRun;

    // 实例ID
    @NameInMap("LoadBalancerId")
    public String loadBalancerId;

    // 地域ID
    @NameInMap("RegionId")
    public String regionId;

    public static DetachCommonBandwidthPackageFromLoadBalancerRequest build(java.util.Map<String, ?> map) throws Exception {
        DetachCommonBandwidthPackageFromLoadBalancerRequest self = new DetachCommonBandwidthPackageFromLoadBalancerRequest();
        return TeaModel.build(map, self);
    }

    public DetachCommonBandwidthPackageFromLoadBalancerRequest setBandwidthPackageId(String bandwidthPackageId) {
        this.bandwidthPackageId = bandwidthPackageId;
        return this;
    }
    public String getBandwidthPackageId() {
        return this.bandwidthPackageId;
    }

    public DetachCommonBandwidthPackageFromLoadBalancerRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public DetachCommonBandwidthPackageFromLoadBalancerRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public DetachCommonBandwidthPackageFromLoadBalancerRequest setLoadBalancerId(String loadBalancerId) {
        this.loadBalancerId = loadBalancerId;
        return this;
    }
    public String getLoadBalancerId() {
        return this.loadBalancerId;
    }

    public DetachCommonBandwidthPackageFromLoadBalancerRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

}
