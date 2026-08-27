// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentteams20260605.models;

import com.aliyun.tea.*;

public class CreateInstanceRequest extends TeaModel {
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
    public java.util.List<CreateInstanceRequestZones> zones;

    public static CreateInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateInstanceRequest self = new CreateInstanceRequest();
        return TeaModel.build(map, self);
    }

    public CreateInstanceRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateInstanceRequest setInstanceName(String instanceName) {
        this.instanceName = instanceName;
        return this;
    }
    public String getInstanceName() {
        return this.instanceName;
    }

    public CreateInstanceRequest setInstanceSpec(String instanceSpec) {
        this.instanceSpec = instanceSpec;
        return this;
    }
    public String getInstanceSpec() {
        return this.instanceSpec;
    }

    public CreateInstanceRequest setNetworkType(String networkType) {
        this.networkType = networkType;
        return this;
    }
    public String getNetworkType() {
        return this.networkType;
    }

    public CreateInstanceRequest setPaymentType(String paymentType) {
        this.paymentType = paymentType;
        return this;
    }
    public String getPaymentType() {
        return this.paymentType;
    }

    public CreateInstanceRequest setVpcId(String vpcId) {
        this.vpcId = vpcId;
        return this;
    }
    public String getVpcId() {
        return this.vpcId;
    }

    public CreateInstanceRequest setZones(java.util.List<CreateInstanceRequestZones> zones) {
        this.zones = zones;
        return this;
    }
    public java.util.List<CreateInstanceRequestZones> getZones() {
        return this.zones;
    }

    public static class CreateInstanceRequestZones extends TeaModel {
        /**
         * <p>The vSwitch ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-bp1xxxx</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>The zone ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou-h</p>
         */
        @NameInMap("ZoneId")
        public String zoneId;

        public static CreateInstanceRequestZones build(java.util.Map<String, ?> map) throws Exception {
            CreateInstanceRequestZones self = new CreateInstanceRequestZones();
            return TeaModel.build(map, self);
        }

        public CreateInstanceRequestZones setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public CreateInstanceRequestZones setZoneId(String zoneId) {
            this.zoneId = zoneId;
            return this;
        }
        public String getZoneId() {
            return this.zoneId;
        }

    }

}
