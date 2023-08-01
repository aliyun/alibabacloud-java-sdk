// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bpstudio20210931.models;

import com.aliyun.tea.*;

public class ExecuteOperationASyncRequest extends TeaModel {
    @NameInMap("ApplicationId")
    public String applicationId;

    @NameInMap("Attributes")
    public java.util.Map<String, ?> attributes;

    @NameInMap("Operation")
    public String operation;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The type of the service. If you want to perform operations on an Elastic Compute Service (ECS) instance, set ServiceType to ecs.</p>
     */
    @NameInMap("ServiceType")
    public String serviceType;

    public static ExecuteOperationASyncRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecuteOperationASyncRequest self = new ExecuteOperationASyncRequest();
        return TeaModel.build(map, self);
    }

    public ExecuteOperationASyncRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public ExecuteOperationASyncRequest setAttributes(java.util.Map<String, ?> attributes) {
        this.attributes = attributes;
        return this;
    }
    public java.util.Map<String, ?> getAttributes() {
        return this.attributes;
    }

    public ExecuteOperationASyncRequest setOperation(String operation) {
        this.operation = operation;
        return this;
    }
    public String getOperation() {
        return this.operation;
    }

    public ExecuteOperationASyncRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ExecuteOperationASyncRequest setServiceType(String serviceType) {
        this.serviceType = serviceType;
        return this;
    }
    public String getServiceType() {
        return this.serviceType;
    }

}
