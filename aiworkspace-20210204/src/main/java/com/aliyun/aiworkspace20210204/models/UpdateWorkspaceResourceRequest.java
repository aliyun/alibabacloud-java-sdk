// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class UpdateWorkspaceResourceRequest extends TeaModel {
    @NameInMap("GroupName")
    public String groupName;

    @NameInMap("IsDefault")
    public Boolean isDefault;

    @NameInMap("ProductType")
    public String productType;

    @NameInMap("ResourceType")
    public String resourceType;

    public static UpdateWorkspaceResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateWorkspaceResourceRequest self = new UpdateWorkspaceResourceRequest();
        return TeaModel.build(map, self);
    }

    public UpdateWorkspaceResourceRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public UpdateWorkspaceResourceRequest setIsDefault(Boolean isDefault) {
        this.isDefault = isDefault;
        return this;
    }
    public Boolean getIsDefault() {
        return this.isDefault;
    }

    public UpdateWorkspaceResourceRequest setProductType(String productType) {
        this.productType = productType;
        return this;
    }
    public String getProductType() {
        return this.productType;
    }

    public UpdateWorkspaceResourceRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

}
