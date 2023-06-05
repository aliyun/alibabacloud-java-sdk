// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aiworkspace20210204.models;

import com.aliyun.tea.*;

public class DeleteWorkspaceResourceRequest extends TeaModel {
    @NameInMap("GroupName")
    public String groupName;

    @NameInMap("Option")
    public String option;

    @NameInMap("ProductType")
    public String productType;

    @NameInMap("ResourceType")
    public String resourceType;

    public static DeleteWorkspaceResourceRequest build(java.util.Map<String, ?> map) throws Exception {
        DeleteWorkspaceResourceRequest self = new DeleteWorkspaceResourceRequest();
        return TeaModel.build(map, self);
    }

    public DeleteWorkspaceResourceRequest setGroupName(String groupName) {
        this.groupName = groupName;
        return this;
    }
    public String getGroupName() {
        return this.groupName;
    }

    public DeleteWorkspaceResourceRequest setOption(String option) {
        this.option = option;
        return this;
    }
    public String getOption() {
        return this.option;
    }

    public DeleteWorkspaceResourceRequest setProductType(String productType) {
        this.productType = productType;
        return this;
    }
    public String getProductType() {
        return this.productType;
    }

    public DeleteWorkspaceResourceRequest setResourceType(String resourceType) {
        this.resourceType = resourceType;
        return this;
    }
    public String getResourceType() {
        return this.resourceType;
    }

}
