// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentteams20260605.models;

import com.aliyun.tea.*;

public class CreateInstanceShrinkRequest extends TeaModel {
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>agentteams-demo</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>SMALL_X1</p>
     */
    @NameInMap("InstanceSpec")
    public String instanceSpec;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>PRIVATE_NET</p>
     */
    @NameInMap("NetworkType")
    public String networkType;

    @NameInMap("PaymentType")
    public String paymentType;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-bp1xxxx</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    @NameInMap("Zones")
    public String zonesShrink;

    public static CreateInstanceShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateInstanceShrinkRequest self = new CreateInstanceShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateInstanceShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateInstanceShrinkRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public CreateInstanceShrinkRequest setInstanceSpec(String instanceSpec) {
        this.instanceSpec = instanceSpec;
        return this;
    }
    public String getInstanceSpec() {
        return this.instanceSpec;
    }

    public CreateInstanceShrinkRequest setNetworkType(String networkType) {
        this.networkType = networkType;
        return this;
    }
    public String getNetworkType() {
        return this.networkType;
    }

    public CreateInstanceShrinkRequest setPaymentType(String paymentType) {
        this.paymentType = paymentType;
        return this;
    }
    public String getPaymentType() {
        return this.paymentType;
    }

    public CreateInstanceShrinkRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public CreateInstanceShrinkRequest setZonesShrink(String zonesShrink) {
        this.zonesShrink = zonesShrink;
        return this;
    }
    public String getZonesShrink() {
        return this.zonesShrink;
    }

}
