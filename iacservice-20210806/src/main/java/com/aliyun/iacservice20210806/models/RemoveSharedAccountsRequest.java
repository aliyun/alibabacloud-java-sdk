// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class RemoveSharedAccountsRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("accountIds")
    public java.util.List<Long> accountIds;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test_namespace</p>
     */
    @NameInMap("resourceId")
    public String resourceId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Namespace</p>
     */
    @NameInMap("resourceType")
    public String resourceType;

    public static RemoveSharedAccountsRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveSharedAccountsRequest self = new RemoveSharedAccountsRequest();
        return TeaModel.build(map, self);
    }

    public RemoveSharedAccountsRequest setAccountIds(java.util.List<Long> accountIds) {
        this.accountIds = accountIds;
        return this;
    }
    public java.util.List<Long> getAccountIds() {
        return this.accountIds;
    }

    public RemoveSharedAccountsRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public RemoveSharedAccountsRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

}
