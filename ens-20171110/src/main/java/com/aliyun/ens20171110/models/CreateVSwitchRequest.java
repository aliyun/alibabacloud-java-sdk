// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class CreateVSwitchRequest extends TeaModel {
    /**
     * <p>The CIDR block of the VSwitch. The following requirements apply:</p>
     * <ul>
     * <li><p>The prefix length must be an integer from 16 to 29.</p>
     * </li>
     * <li><p>The CIDR block of the VSwitch must be a subset of the CIDR block of the VPC to which the VSwitch belongs.</p>
     * </li>
     * <li><p>The CIDR block of the VSwitch cannot be the same as the destination CIDR block of an existing route in the VPC, but it can be a subset of the destination CIDR block.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>172.16.0.0/24</p>
     */
    @NameInMap("CidrBlock")
    public String cidrBlock;

    /**
     * <p>The description of the VSwitch.</p>
     * <p>The description must be 2 to 256 characters in length. It must start with a letter or a Chinese character, and cannot start with <code>http://</code> or <code>https://</code>.</p>
     * 
     * <strong>example:</strong>
     * <p>This is my vswitch.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The ID of the ENS node.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-xian-unicom</p>
     */
    @NameInMap("EnsRegionId")
    public String ensRegionId;

    /**
     * <strong>example:</strong>
     * <p>2408:XXXX:0:a600::/110</p>
     */
    @NameInMap("Ipv6CidrBlock")
    public String ipv6CidrBlock;

    /**
     * <p>The ID of the network to which the VSwitch belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>n-257gqcdfvx6n****</p>
     */
    @NameInMap("NetworkId")
    public String networkId;

    /**
     * <p>The tags of the resource. You can specify up to 20 tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateVSwitchRequestTag> tag;

    /**
     * <p>The name of the VSwitch. The following requirements apply:</p>
     * <ul>
     * <li><p>The name must be 2 to 128 characters in length.</p>
     * </li>
     * <li><p>The name must start with a letter or a Chinese character, and cannot start with <code>http://</code> or <code>https://</code>. The name can contain digits, colons (:), underscores (_), and hyphens (-).</p>
     * </li>
     * </ul>
     * <p>Default value: an empty string.</p>
     * 
     * <strong>example:</strong>
     * <p>Test vSwitch</p>
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

    public CreateVSwitchRequest setIpv6CidrBlock(String ipv6CidrBlock) {
        this.ipv6CidrBlock = ipv6CidrBlock;
        return this;
    }
    public String getIpv6CidrBlock() {
        return this.ipv6CidrBlock;
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
         * <p>The key of the tag.</p>
         * <ul>
         * <li><p>The tag key cannot start with <code>aliyun</code>, <code>acs:</code>, <code>http://</code>, or <code>https://</code>.</p>
         * </li>
         * <li><p>The tag key can be up to 64 characters long.</p>
         * </li>
         * <li><p>The tag key cannot be an empty string.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>team</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the tag. It can be up to 128 characters long, can be an empty string, and cannot start with <code>acs:</code> or contain <code>http://</code> or <code>https://</code>.</p>
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
