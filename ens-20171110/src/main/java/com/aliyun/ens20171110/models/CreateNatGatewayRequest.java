// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class CreateNatGatewayRequest extends TeaModel {
    /**
     * <p>The ID of the Edge Node Service (ENS) node.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("EnsRegionId")
    public String ensRegionId;

    /**
     * <p>The instance type of the NAT gateway. Set the value to **enat.default**.</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <p>The name of the NAT gateway. The name must be 1 to 128 characters in length. The name cannot start with `http://` or `https://`.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The ID of the network.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("NetworkId")
    public String networkId;

    /**
     * <p>The ID of the vSwitch.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    public static CreateNatGatewayRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateNatGatewayRequest self = new CreateNatGatewayRequest();
        return TeaModel.build(map, self);
    }

    public CreateNatGatewayRequest setEnsRegionId(String ensRegionId) {
        this.ensRegionId = ensRegionId;
        return this;
    }
    public String getEnsRegionId() {
        return this.ensRegionId;
    }

    public CreateNatGatewayRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public CreateNatGatewayRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateNatGatewayRequest setNetworkId(String networkId) {
        this.networkId = networkId;
        return this;
    }
    public String getNetworkId() {
        return this.networkId;
    }

    public CreateNatGatewayRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

}
