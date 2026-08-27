// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentteams20260605.models;

import com.aliyun.tea.*;

public class ConfigureNatGatewayRequest extends TeaModel {
    /**
     * <p>The client idempotency token.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The description for the NAT gateway, EIP, and SNAT rule creation.</p>
     * 
     * <strong>example:</strong>
     * <p>create public nat gateway for agentteams instance</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The allocation ID of the EIP.</p>
     * 
     * <strong>example:</strong>
     * <p>eip-xxx</p>
     */
    @NameInMap("EipAllocationId")
    public String eipAllocationId;

    /**
     * <p>The bandwidth of the automatically applied EIP. Valid values: 1 to 200. Unit: Mbit/s.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("EipBandwidth")
    public Integer eipBandwidth;

    /**
     * <p>The ID of the AgentTeams instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <instanceId>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The ID of the NAT gateway instance.</p>
     * 
     * <strong>example:</strong>
     * <p>nat-xxxx</p>
     */
    @NameInMap("NatGatewayInstanceId")
    public String natGatewayInstanceId;

    public static ConfigureNatGatewayRequest build(java.util.Map<String, ?> map) throws Exception {
        ConfigureNatGatewayRequest self = new ConfigureNatGatewayRequest();
        return TeaModel.build(map, self);
    }

    public ConfigureNatGatewayRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ConfigureNatGatewayRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ConfigureNatGatewayRequest setEipAllocationId(String eipAllocationId) {
        this.eipAllocationId = eipAllocationId;
        return this;
    }
    public String getEipAllocationId() {
        return this.eipAllocationId;
    }

    public ConfigureNatGatewayRequest setEipBandwidth(Integer eipBandwidth) {
        this.eipBandwidth = eipBandwidth;
        return this;
    }
    public Integer getEipBandwidth() {
        return this.eipBandwidth;
    }

    public ConfigureNatGatewayRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public ConfigureNatGatewayRequest setNatGatewayInstanceId(String natGatewayInstanceId) {
        this.natGatewayInstanceId = natGatewayInstanceId;
        return this;
    }
    public String getNatGatewayInstanceId() {
        return this.natGatewayInstanceId;
    }

}
