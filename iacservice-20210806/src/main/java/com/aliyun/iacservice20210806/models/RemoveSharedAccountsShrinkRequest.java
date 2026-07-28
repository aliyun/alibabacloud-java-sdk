// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.iacservice20210806.models;

import com.aliyun.tea.*;

public class RemoveSharedAccountsShrinkRequest extends TeaModel {
    /**
     * <p>The list of Alibaba Cloud account IDs.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("accountIds")
    public String accountIdsShrink;

    /**
     * <p>The ID of the resource to unshare.</p>
     * <ul>
     * <li><p>If the type is Namespace, set this parameter to the workspace name. </p>
     * </li>
     * <li><p>If the type is RegistryModule, set this parameter to \<namespaceName>/\<ModuleName>.</p>
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
     * <li>Namespace: workspace.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>RegistryModule</p>
     */
    @NameInMap("resourceType")
    public String resourceType;

    public static RemoveSharedAccountsShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        RemoveSharedAccountsShrinkRequest self = new RemoveSharedAccountsShrinkRequest();
        return TeaModel.build(map, self);
    }

    public RemoveSharedAccountsShrinkRequest setAccountIdsShrink(String accountIdsShrink) {
        this.accountIdsShrink = accountIdsShrink;
        return this;
    }
    public String getAccountIdsShrink() {
        return this.accountIdsShrink;
    }

    public RemoveSharedAccountsShrinkRequest setResourceId(String resourceId) {
        this.resourceId = resourceId;
        return this;
    }
    public String getResourceId() {
        return this.resourceId;
    }

    public RemoveSharedAccountsShrinkRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

}
