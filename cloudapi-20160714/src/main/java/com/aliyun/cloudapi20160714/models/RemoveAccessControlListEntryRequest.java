// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class RemoveAccessControlListEntryRequest extends TeaModel {
    @NameInMap("AclEntrys")
    public String aclEntrys;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AclId")
    public String aclId;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static RemoveAccessControlListEntryRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveAccessControlListEntryRequest self = new RemoveAccessControlListEntryRequest();
        return TeaModel.build(map, self);
    }

    public RemoveAccessControlListEntryRequest setAclEntrys(String aclEntrys) {
        this.aclEntrys = aclEntrys;
        return this;
    }
    public String getAclEntrys() {
        return this.aclEntrys;
    }

    public RemoveAccessControlListEntryRequest setAclId(String aclId) {
        this.aclId = aclId;
        return this;
    }
    public String getAclId() {
        return this.aclId;
    }

    public RemoveAccessControlListEntryRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
