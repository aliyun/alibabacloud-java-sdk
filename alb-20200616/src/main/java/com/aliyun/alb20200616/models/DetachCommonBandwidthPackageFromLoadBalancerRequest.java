// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class DetachCommonBandwidthPackageFromLoadBalancerRequest extends TeaModel {
    /**
     * <p>The EIP bandwidth plan ID.</p>
     */
    @NameInMap("BandwidthPackageId")
    public String bandwidthPackageId;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <br>
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.</p>
     * <br>
     * <p>> If you do not specify this parameter, the system automatically uses the **request ID** as the **client token**. The **request ID** may be different for each request.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>Specifies whether to perform only a dry run, without performing the actual request. Valid values:</p>
     * <br>
     * <p>*   **true**: performs only a dry run. The system checks the request for potential issues, including missing parameter values, incorrect request syntax, and service limits. If the request fails the dry run, an error message is returned. If the request passes the dry run, the `DryRunOperation` error code is returned.</p>
     * <p>*   **false** (default): performs a dry run and performs the actual request. If the request passes the dry run, a 2xx HTTP status code is returned and the operation is performed.</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The ALB instance ID.</p>
     */
    @NameInMap("LoadBalancerId")
    public String loadBalancerId;

    /**
     * <p>The region ID of the ALB instance.</p>
     * <br>
     * <p>You can call the [DescribeRegions](~~36063~~) operation to query the most recent region list.</p>
     */
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
