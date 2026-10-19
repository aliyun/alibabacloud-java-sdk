// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class ModifyVSwitchAttributeRequest extends TeaModel {
    /**
     * <p>The description.</p>
     * <ul>
     * <li>The description must be 2 to 256 characters in length.</li>
     * <li>It cannot start with http:// or https://.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>this is my first vswitch</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Specifies whether to enable IPv6 for the vSwitch. Valid values:</p>
     * <ul>
     * <li>true: enables IPv6. The VPC to which the vSwitch belongs must have IPv6 enabled, and you must also specify Ipv6CidrBlock to assign an IPv6 CIDR block to the vSwitch.</li>
     * <li>false (default): disables IPv6. Before you disable IPv6 for the vSwitch, make sure that no IPv6 addresses are in use, and do not specify Ipv6CidrBlock at the same time.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EnableIPv6")
    public Boolean enableIPv6;

    /**
     * <p>The IPv6 CIDR block of the vSwitch.</p>
     * <blockquote>
     * <p>You can specify this parameter to assign an IPv6 CIDR block to the vSwitch only when IPv6 is enabled for the VPC to which the vSwitch belongs. After the IPv6 CIDR block is assigned, it cannot be changed. Make sure that the IPv6 CIDR block does not overlap with the CIDR blocks of other vSwitches in the same VPC.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>2408:XXXX:0:a600::/110</p>
     */
    @NameInMap("Ipv6CidrBlock")
    public String ipv6CidrBlock;

    /**
     * <p>The vSwitch ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>n-****</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>The vSwitch name.</p>
     * <ul>
     * <li>The name must be 2 to 128 characters in length.</li>
     * <li>It must start with a letter or a Chinese character and cannot start with http:// or https://.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Test-switch</p>
     */
    @NameInMap("VSwitchName")
    public String vSwitchName;

    public static ModifyVSwitchAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyVSwitchAttributeRequest self = new ModifyVSwitchAttributeRequest();
        return TeaModel.build(map, self);
    }

    public ModifyVSwitchAttributeRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifyVSwitchAttributeRequest setEnableIPv6(Boolean enableIPv6) {
        this.enableIPv6 = enableIPv6;
        return this;
    }
    public Boolean getEnableIPv6() {
        return this.enableIPv6;
    }

    public ModifyVSwitchAttributeRequest setIpv6CidrBlock(String ipv6CidrBlock) {
        this.ipv6CidrBlock = ipv6CidrBlock;
        return this;
    }
    public String getIpv6CidrBlock() {
        return this.ipv6CidrBlock;
    }

    public ModifyVSwitchAttributeRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

    public ModifyVSwitchAttributeRequest setVSwitchName(String vSwitchName) {
        this.vSwitchName = vSwitchName;
        return this;
    }
    public String getVSwitchName() {
        return this.vSwitchName;
    }

}
