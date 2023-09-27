// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20180601.models;

import com.aliyun.tea.*;

public class DescribePurchasedApiRequest extends TeaModel {
    @NameInMap("ApiId")
    public String apiId;

    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static DescribePurchasedApiRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePurchasedApiRequest self = new DescribePurchasedApiRequest();
        return TeaModel.build(map, self);
    }

    public DescribePurchasedApiRequest setApiId(String apiId) {
        this.apiId = apiId;
        return this;
    }
    public String getApiId() {
        return this.apiId;
    }

    public DescribePurchasedApiRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public DescribePurchasedApiRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
