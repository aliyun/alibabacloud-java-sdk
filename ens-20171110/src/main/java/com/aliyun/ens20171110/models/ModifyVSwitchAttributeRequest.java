// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class ModifyVSwitchAttributeRequest extends TeaModel {
    /**
     * <p>Description.</p>
     * <ul>
     * <li><p>Must be 2 to 256 characters in length and can contain English or Chinese characters.</p>
     * </li>
     * <li><p>Cannot start with http\:// or https\://.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>this is my first vswitch</p>
     */
    @NameInMap("Description")
    public String description;

    @NameInMap("EnableIPv6")
    public Boolean enableIPv6;

    /**
     * <strong>example:</strong>
     * <p>2408:XXXX:0:a600::/110</p>
     */
    @NameInMap("Ipv6CidrBlock")
    public String ipv6CidrBlock;

    /**
     * <p>vSwitch ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>n-****</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    /**
     * <p>vSwitch name.</p>
     * <ul>
     * <li><p>Must be 2 to 128 characters long. Can contain letters, digits, Chinese characters, underscores (_), and hyphens (-).</p>
     * </li>
     * <li><p>Must start with a letter or a Chinese character. Cannot start with http\:// or https\://.</p>
     * </li>
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
