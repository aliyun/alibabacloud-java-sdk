// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudapi20160714.models;

import com.aliyun.tea.*;

public class DescribePurchasedApiGroupRequest extends TeaModel {
    /**
     * <p>The status of the API group.</p>
     * <br>
     * <p>*   **NORMAL**: The API group is normal.</p>
     * <p>*   **DELETE**: The API group is deleted.</p>
     */
    @NameInMap("GroupId")
    public String groupId;

    @NameInMap("SecurityToken")
    public String securityToken;

    public static DescribePurchasedApiGroupRequest build(java.util.Map<String, ?> map) throws Exception {
        DescribePurchasedApiGroupRequest self = new DescribePurchasedApiGroupRequest();
        return TeaModel.build(map, self);
    }

    public DescribePurchasedApiGroupRequest setGroupId(String groupId) {
        this.groupId = groupId;
        return this;
    }
    public String getGroupId() {
        return this.groupId;
    }

    public DescribePurchasedApiGroupRequest setSecurityToken(String securityToken) {
        this.securityToken = securityToken;
        return this;
    }
    public String getSecurityToken() {
        return this.securityToken;
    }

}
