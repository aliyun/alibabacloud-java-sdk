// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class RemoveSharedAccountsRequest extends TeaModel {
    /**
     * <p>The list of Alibaba Cloud account IDs.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("accountIds")
    public java.util.List<Long> accountIds;

    /**
     * <p>The ID of the resource to be unshared.</p>
     * <ul>
     * <li><p>If the type is Namespace, the value is the workspace name. </p>
     * </li>
     * <li><p>If the type is RegistryModule, the value is \<namespaceName>/\<ModuleName>.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>terraform-alicloud-modules/mongodb</p>
     */
    @NameInMap("resourceId")
    public String resourceId;

    /**
     * <p>The resource type. Valid values:</p>
     * <ul>
     * <li>RegistryModule: Registry template.</li>
     * <li>Namespace: Workspace.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>RegistryModule</p>
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
