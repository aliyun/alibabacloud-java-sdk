// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.intelligentcreation20240118.models;

import com.aliyun.tea.*;

public class GetRemainResourceRequest extends TeaModel {
    @NameInMap("accountId")
    public String accountId;

    @NameInMap("resourceType")
    public String resourceType;

    @NameInMap("subAccountId")
    public String subAccountId;

    public static GetRemainResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        GetRemainResourceRequest self = new GetRemainResourceRequest();
        return TeaModel.build(map, self);
    }

    public GetRemainResourceRequest setAccountId(String accountId) {
        this.accountId = accountId;
        return this;
    }
    public String getAccountId() {
        return this.accountId;
    }

    public GetRemainResourceRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

    public GetRemainResourceRequest setSubAccountId(String subAccountId) {
        this.subAccountId = subAccountId;
        return this;
    }
    public String getSubAccountId() {
        return this.subAccountId;
    }

}
