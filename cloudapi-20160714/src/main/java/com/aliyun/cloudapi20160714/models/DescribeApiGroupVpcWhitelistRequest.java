// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribeApiGroupVpcWhitelistRequest extends TeaModel {
    /**
     * <p>The ID of the API group.</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static DescribeApiGroupVpcWhitelistRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeApiGroupVpcWhitelistRequest self = new DescribeApiGroupVpcWhitelistRequest();
        return TeaModel.build(map, self);
    }

    public DescribeApiGroupVpcWhitelistRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public DescribeApiGroupVpcWhitelistRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
