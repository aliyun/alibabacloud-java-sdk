// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentteams20260605.models;

import com.aliyun.tea.*;

public class CreateInstanceShrinkRequest extends TeaModel {
    /**
     * <p>The idempotency token that is used to ensure the idempotence of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>client-token-xxx</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p><code>instanceName</code>: <code>string</code>, required.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>agentteams-demo</p>
     */
    @NameInMap("InstanceName")
    public String instanceName;

    /**
     * <p><code>instanceSpec</code>: <code>string</code>, optional, default <code>SMALL_X1</code></p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>SMALL_X1</p>
     */
    @NameInMap("InstanceSpec")
    public String instanceSpec;

    /**
     * <p><code>networkType</code>: <code>string</code>, optional, default <code>PRIVATE_NET</code><br>Valid values:</p>
     * <ul>
     * <li><code>PRIVATE_PUBNET</code></li>
     * <li><code>PRIVATE_NET</code></li>
     * <li><code>PUB_NET</code></li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>PRIVATE_NET</p>
     */
    @NameInMap("NetworkType")
    public String networkType;

    /**
     * <p>The billing method.</p>
     * 
     * <strong>example:</strong>
     * <p>Subscription</p>
     */
    @NameInMap("PaymentType")
    public String paymentType;

    /**
     * <p><code>vpcId</code>: <code>string</code>, required.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vpc-bp1xxxx</p>
     */
    @NameInMap("VpcId")
    public String vpcId;

    /**
     * <p>The zones.</p>
     * 
     * <strong>example:</strong>
     * <p>[]</p>
     */
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
