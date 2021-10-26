// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class RefreshMarketGroupAuthorizationsRequest extends TeaModel {
    @NameInMap("SecurityToken")
    public String securityToken;

    @NameInMap("GroupId")
    public String groupId;

    public static RefreshMarketGroupAuthorizationsRequest build(java.util.Map<String, ?> map) throws Exception {
        RefreshMarketGroupAuthorizationsRequest self = new RefreshMarketGroupAuthorizationsRequest();
        return TeaModel.build(map, self);
    }

    public RefreshMarketGroupAuthorizationsRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

    public RefreshMarketGroupAuthorizationsRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

}
