// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ens20171110.models;

import com.aliyun.tea.*;

public class ModifySecurityGroupAttributeRequest extends TeaModel {
    /**
     * <p>The description of the security group.</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>The ID of the security group.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("SecurityGroupId")
    public String securityGroupId;

    /**
     * <p>The name of the security group. The name of a bucket must meet the following requirements:</p>
     * <br>
     * <p>*   The name must be 2 to 128 characters in length.</p>
     * <p>*   The name must start with a letter but cannot start with http:// or https://.</p>
     * <p>*   The name can contain letters, digits, colons (:), underscores (_), and hyphens (-).</p>
     */
    @NameInMap("SecurityGroupName")
    public String securityGroupName;

    public static ModifySecurityGroupAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifySecurityGroupAttributeRequest self = new ModifySecurityGroupAttributeRequest();
        return TeaModel.build(map, self);
    }

    public ModifySecurityGroupAttributeRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public ModifySecurityGroupAttributeRequest setSecurityGroupId(String securityGroupId) {
        this.securityGroupId = securityGroupId;
        return this;
    }
    public String getSecurityGroupId() {
        return this.securityGroupId;
    }

    public ModifySecurityGroupAttributeRequest setSecurityGroupName(String securityGroupName) {
        this.securityGroupName = securityGroupName;
        return this;
    }
    public String getSecurityGroupName() {
        return this.securityGroupName;
    }

}
