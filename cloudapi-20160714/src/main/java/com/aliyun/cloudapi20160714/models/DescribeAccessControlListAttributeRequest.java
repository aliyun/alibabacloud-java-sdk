// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeAccessControlListAttributeRequest extends TeaModel {
    /**
     * <p>The ID of the access control policy.</p>
     */
    @NameInMap("AclId")
    public String aclId;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static DescribeAccessControlListAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeAccessControlListAttributeRequest self = new DescribeAccessControlListAttributeRequest();
        return TeaModel.build(map, self);
    }

    public DescribeAccessControlListAttributeRequest setAclId(String aclId) {
        this.aclId = aclId;
        return this;
    }
    public String getAclId() {
        return this.aclId;
    }

    public DescribeAccessControlListAttributeRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
