// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class AddSharedAccountsRequest extends TeaModel {
    @NameInMap("accountIds")
    public java.util.List<Long> accountIds;

    /**
     * <strong>example:</strong>
     * <p>Public</p>
     */
    @NameInMap("resourceId")
    public String resourceId;

    /**
     * <strong>example:</strong>
     * <p>RegistryModule</p>
     */
    @NameInMap("resourceType")
    public String resourceType;

    public static AddSharedAccountsRequest build(java.util.Map<String, ?> map) throws Exception {
        AddSharedAccountsRequest self = new AddSharedAccountsRequest();
        return TeaModel.build(map, self);
    }

    public AddSharedAccountsRequest setAccountIds(java.util.List<Long> accountIds) {
        this.accountIds = accountIds;
        return this;
    }
    public java.util.List<Long> getAccountIds() {
        return this.accountIds;
    }

    public AddSharedAccountsRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public AddSharedAccountsRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

}
