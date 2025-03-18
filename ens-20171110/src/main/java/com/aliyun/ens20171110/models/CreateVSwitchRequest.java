// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class CreateVSwitchRequest extends TeaModel {
    /**
     * <p>The CIDR block of the vSwitch. Take note of the following limits:</p>
     * <ul>
     * <li>The subnet mask must be 16 to 29 bits in length.</li>
     * <li>The CIDR block of the vSwitch must fall within the CIDR block of the VPC to which the vSwitch belongs.</li>
     * <li>The CIDR block of the vSwitch cannot be the same as the destination CIDR block in a route entry of the VPC. However, it can be a subset of the destination CIDR block.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>172.16.0.0/24</p>
     */
    @NameInMap("CidrBlock")
    public String cidrBlock;

    /**
     * <p>The description of the vSwitch.</p>
     * <p>The description must be 2 to 256 characters in length. It must start with a letter but cannot start with http:// or https://.</p>
     * 
     * <strong>example:</strong>
     * <p>This is my vswitch.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The ID of the edge node.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-xian-unicom</p>
     */
    @NameInMap("EnsRegionId")
    public String ensRegionId;

    /**
     * <p>The ID of the network to which the vSwitch that you want to create belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>n-257gqcdfvx6n****</p>
     */
    @NameInMap("NetworkId")
    public String networkId;

    /**
     * <p>The tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateVSwitchRequestTag> tag;

    /**
     * <p>The name of the vSwitch. The name must meet the following requirements:</p>
     * <ul>
     * <li>The name must be 2 to 128 characters in length.</li>
     * <li>The name must start with a letter and cannot start with http:// or https://. It can contain letters, digits, colons (:), underscores (_), and hyphens (-).</li>
     * </ul>
     * <p>Default value: null.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("VSwitchName")
    public String vSwitchName;

    public static CreateVSwitchRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateVSwitchRequest self = new CreateVSwitchRequest();
        return TeaModel.build(map, self);
    }

    public CreateVSwitchRequest setCidrBlock(String cidrBlock) {
        this.cidrBlock = cidrBlock;
        return this;
    }
    public String getCidrBlock() {
        return this.cidrBlock;
    }

    public CreateVSwitchRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateVSwitchRequest setEnsRegionId(String ensRegionId) {
        this.ensRegionId = ensRegionId;
        return this;
    }
    public String getEnsRegionId() {
        return this.ensRegionId;
    }

    public CreateVSwitchRequest setNetworkId(String networkId) {
        this.networkId = networkId;
        return this;
    }
    public String getNetworkId() {
        return this.networkId;
    }

    public CreateVSwitchRequest setTag(java.util.List<CreateVSwitchRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateVSwitchRequestTag> getTag() {
        return this.tag;
    }

    public CreateVSwitchRequest setVSwitchName(String vSwitchName) {
        this.vSwitchName = vSwitchName;
        return this;
    }
    public String getVSwitchName() {
        return this.vSwitchName;
    }

    public static class CreateVSwitchRequestTag extends TeaModel {
        /**
         * <p>The key of the tag that are to add to the instance. Valid values of N: <strong>1</strong> to <strong>20</strong>.</p>
         * <ul>
         * <li>The key cannot start with <code>aliyun</code>, <code>acs:</code>, <code>http://</code>, or <code>https://</code>.</li>
         * <li>The key must be up to 64 characters in length.</li>
         * <li>The tag key cannot be an empty string.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>team</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of tag N that is added to the resource. Valid values of N: 1 to 20. The tag value can be an empty string. The tag value can be up to 128 characters in length. It cannot start with acs: or contain http:// or https://.</p>
         * 
         * <strong>example:</strong>
         * <p>Deep</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateVSwitchRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateVSwitchRequestTag self = new CreateVSwitchRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateVSwitchRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateVSwitchRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
