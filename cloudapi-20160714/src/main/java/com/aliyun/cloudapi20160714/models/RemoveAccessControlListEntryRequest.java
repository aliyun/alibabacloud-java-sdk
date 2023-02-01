// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class RemoveAccessControlListEntryRequest extends TeaModel {
    /**
     * <p>Sets the access control list (ACL).</p>
     * <br>
     * <p>*   entry: the IP addresses or CIDR blocks that you want to add to the ACL. Separate multiple IP addresses or CIDR blocks with commas (,).</p>
     * <p>*   comment: the description of the ACL.</p>
     * <br>
     * <p>> If the ACL is associated with a listener, you cannot remove all IP addresses from the ACL.</p>
     */
    @NameInMap("AclEntrys")
    public String aclEntrys;

    /**
     * <p>The ID of the access control policy.</p>
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
