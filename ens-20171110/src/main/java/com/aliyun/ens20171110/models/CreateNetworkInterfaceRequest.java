// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class CreateNetworkInterfaceRequest extends TeaModel {
    /**
     * <p>Description of the ENI.</p>
     * 
     * <strong>example:</strong>
     * <p>example</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>ENI name.</p>
     * 
     * <strong>example:</strong>
     * <p>name</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>Security group ID.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("SecurityGroupIds")
    public java.util.List<String> securityGroupIds;

    /**
     * <p>vSwitch ID.</p>
     * 
     * <strong>example:</strong>
     * <p>vsw-5****</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchId;

    public static CreateNetworkInterfaceRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateNetworkInterfaceRequest self = new CreateNetworkInterfaceRequest();
        return TeaModel.build(map, self);
    }

    public CreateNetworkInterfaceRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateNetworkInterfaceRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateNetworkInterfaceRequest setSecurityGroupIds(java.util.List<String> securityGroupIds) {
        this.securityGroupIds = securityGroupIds;
        return this;
    }
    public java.util.List<String> getSecurityGroupIds() {
        return this.securityGroupIds;
    }

    public CreateNetworkInterfaceRequest setVSwitchId(String vSwitchId) {
        this.vSwitchId = vSwitchId;
        return this;
    }
    public String getVSwitchId() {
        return this.vSwitchId;
    }

}
