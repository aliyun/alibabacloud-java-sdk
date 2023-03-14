// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bpstudio20210931.models;

import com.aliyun.tea.*;

public class ExecuteOperationASyncShrinkRequest extends TeaModel {
    @NameInMap("Attributes")
    public String attributesShrink;

    @NameInMap("Operation")
    public String operation;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("ServiceType")
    public String serviceType;

    public static ExecuteOperationASyncShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecuteOperationASyncShrinkRequest self = new ExecuteOperationASyncShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ExecuteOperationASyncShrinkRequest setAttributesShrink(String attributesShrink) {
        this.attributesShrink = attributesShrink;
        return this;
    }
    public String getAttributesShrink() {
        return this.attributesShrink;
    }

    public ExecuteOperationASyncShrinkRequest setOperation(String operation) {
        this.operation = operation;
        return this;
    }
    public String getOperation() {
        return this.operation;
    }

    public ExecuteOperationASyncShrinkRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ExecuteOperationASyncShrinkRequest setServiceType(String serviceType) {
        this.serviceType = serviceType;
        return this;
    }
    public String getServiceType() {
        return this.serviceType;
    }

}
