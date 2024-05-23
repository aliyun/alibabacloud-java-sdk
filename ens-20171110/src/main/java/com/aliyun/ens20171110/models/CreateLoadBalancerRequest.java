// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class CreateLoadBalancerRequest extends TeaModel {
    /**
     * <p>The ID of the Edge Node Service (ENS) node.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("EnsRegionId")
    public String ensRegionId;

    /**
     * <p>The name of the ELB instance. The name must be 1 to 80 characters in length. If you leave this parameter empty, the system randomly allocates a name as the value of this parameter.</p>
     * <br>
     * <p>>  The value cannot start with `http://` or `https://`.</p>
     */
    @NameInMap("LoadBalancerName")
    public String loadBalancerName;

    /**
     * <p>The specification of the ELB instance.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("LoadBalancerSpec")
    public String loadBalancerSpec;

    /**
     * <p>The network ID of the created ELB instance.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("NetworkId")
    public String networkId;

    /**
     * <p>The billing method of the instance. Valid value: PostPaid. PostPaid specifies the pay-as-you-go billing method.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("PayType")
    public String payType;

    /**
     * <p>The ID of the vSwitch to which the internal-facing ELB instance belongs.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    public static CreateLoadBalancerRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateLoadBalancerRequest self = new CreateLoadBalancerRequest();
        return TeaModel.build(map, self);
    }

    public CreateLoadBalancerRequest setEnsRegionId(String ensRegionId) {
        this.ensRegionId = ensRegionId;
        return this;
    }
    public String getEnsRegionId() {
        return this.ensRegionId;
    }

    public CreateLoadBalancerRequest setLoadBalancerName(String loadBalancerName) {
        this.loadBalancerName = loadBalancerName;
        return this;
    }
    public String getLoadBalancerName() {
        return this.loadBalancerName;
    }

    public CreateLoadBalancerRequest setLoadBalancerSpec(String loadBalancerSpec) {
        this.loadBalancerSpec = loadBalancerSpec;
        return this;
    }
    public String getLoadBalancerSpec() {
        return this.loadBalancerSpec;
    }

    public CreateLoadBalancerRequest setNetworkId(String networkId) {
        this.networkId = networkId;
        return this;
    }
    public String getNetworkId() {
        return this.networkId;
    }

    public CreateLoadBalancerRequest setPayType(String payType) {
        this.payType = payType;
        return this;
    }
    public String getPayType() {
        return this.payType;
    }

    public CreateLoadBalancerRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

}
