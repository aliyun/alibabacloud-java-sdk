// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class SetAccessControlListAttributeRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AclId")
    public String aclId;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("AclName")
    public String aclName;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static SetAccessControlListAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        SetAccessControlListAttributeRequest self = new SetAccessControlListAttributeRequest();
        return TeaModel.build(map, self);
    }

    public SetAccessControlListAttributeRequest setAclId(String aclId) {
        this.aclId = aclId;
        return this;
    }
    public String getAclId() {
        return this.aclId;
    }

    public SetAccessControlListAttributeRequest setAclName(String aclName) {
        this.aclName = aclName;
        return this;
    }
    public String getAclName() {
        return this.aclName;
    }

    public SetAccessControlListAttributeRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
