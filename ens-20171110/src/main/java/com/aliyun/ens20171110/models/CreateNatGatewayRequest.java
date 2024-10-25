// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class CreateNatGatewayRequest extends TeaModel {
    /**
     * <p>The ID of the Edge Node Service (ENS) node.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-suzhou-telecom</p>
     */
    @NameInMap("EnsRegionId")
    public String ensRegionId;

    /**
     * <p>The instance type of the NAT gateway. Set the value to <strong>enat.default</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>enat.default</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <p>The name of the NAT gateway. The name must be 1 to 128 characters in length. The name cannot start with <code>http://</code> or <code>https://</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>name</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The ID of the network.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>n-5qj7ykuxmjn7k96l090sp****</p>
     */
    @NameInMap("NetworkId")
    public String networkId;

    @NameInMap("Tag")
    public java.util.List<CreateNatGatewayRequestTag> tag;

    /**
     * <p>The ID of the vSwitch.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-5savh5ngxh8sbj14bu7n****</p>
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

    public CreateNatGatewayRequest setTag(java.util.List<CreateNatGatewayRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateNatGatewayRequestTag> getTag() {
        return this.tag;
    }

    public CreateNatGatewayRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public static class CreateNatGatewayRequestTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static CreateNatGatewayRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateNatGatewayRequestTag self = new CreateNatGatewayRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateNatGatewayRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateNatGatewayRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
