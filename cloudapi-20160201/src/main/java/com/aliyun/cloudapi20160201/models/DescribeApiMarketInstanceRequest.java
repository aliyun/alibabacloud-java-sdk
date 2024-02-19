// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160201.models;

import com.aliyun.tea.*;

public class DescribeApiMarketInstanceRequest extends TeaModel {
    @NameInMap("AliUid")
    public String aliUid;

    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static DescribeApiMarketInstanceRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribeApiMarketInstanceRequest self = new DescribeApiMarketInstanceRequest();
        return TeaModel.build(map, self);
    }

    public DescribeApiMarketInstanceRequest setAliUid(String aliUid) {
        this.aliUid = aliUid;
        return this;
    }
    public String getAliUid() {
        return this.aliUid;
    }

    public DescribeApiMarketInstanceRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public DescribeApiMarketInstanceRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
