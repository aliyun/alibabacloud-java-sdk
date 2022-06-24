// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DeleteAccessControlListRequest extends TeaModel {
    @NameInMap("AclId")
    public String aclId;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static DeleteAccessControlListRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteAccessControlListRequest self = new DeleteAccessControlListRequest();
        return TeaModel.build(map, self);
    }

    public DeleteAccessControlListRequest setAclId(String aclId) {
        this.aclId = aclId;
        return this;
    }
    public String getAclId() {
        return this.aclId;
    }

    public DeleteAccessControlListRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
