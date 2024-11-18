// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class CreateNetworkInterfaceShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <strong>example:</strong>
     * <p>name</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("SecurityGroupIds")
    public String securityGroupIdsShrink;

    /**
     * <strong>example:</strong>
     * <p>vsw-5****</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    public static CreateNetworkInterfaceShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateNetworkInterfaceShrinkRequest self = new CreateNetworkInterfaceShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateNetworkInterfaceShrinkRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateNetworkInterfaceShrinkRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateNetworkInterfaceShrinkRequest setSecurityGroupIdsShrink(String securityGroupIdsShrink) {
        this.securityGroupIdsShrink = securityGroupIdsShrink;
        return this;
    }
    public String getSecurityGroupIdsShrink() {
        return this.securityGroupIdsShrink;
    }

    public CreateNetworkInterfaceShrinkRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

}
