// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class ModifyApiGroupVpcWhitelistRequest extends TeaModel {
    /**
     * <p>The ID of the API group.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("SecurityToken")
    public String securityToken;

    /**
     * <p>The ID of the VPC instance.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("VpcIds")
    public String vpcIds;

    public static ModifyApiGroupVpcWhitelistRequest build(java.util.Map<String, ?> map) throws Exception {
        ModifyApiGroupVpcWhitelistRequest self = new ModifyApiGroupVpcWhitelistRequest();
        return TeaModel.build(map, self);
    }

    public ModifyApiGroupVpcWhitelistRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public ModifyApiGroupVpcWhitelistRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public ModifyApiGroupVpcWhitelistRequest setVpcIds(String vpcIds) {
        this.vpcIds = vpcIds;
        return this;
    }
    public String getVpcIds() {
        return this.vpcIds;
    }

}
