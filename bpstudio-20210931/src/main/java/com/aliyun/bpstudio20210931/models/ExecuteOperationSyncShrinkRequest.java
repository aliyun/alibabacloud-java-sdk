// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bpstudio20210931.models;

import com.aliyun.tea.*;

public class ExecuteOperationSyncShrinkRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>BE68D71ZY5YYIU9R</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

    @NameInMap("Attributes")
    public String attributesShrink;

    /**
     * <strong>example:</strong>
     * <p>1600765710019</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>rename</p>
     */
    @NameInMap("Operation")
    public String operation;

    /**
     * <strong>example:</strong>
     * <p>rg-acfmyjt3c5om3hi</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dds</p>
     */
    @NameInMap("ServiceType")
    public String serviceType;

    public static ExecuteOperationSyncShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecuteOperationSyncShrinkRequest self = new ExecuteOperationSyncShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ExecuteOperationSyncShrinkRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public ExecuteOperationSyncShrinkRequest setAttributesShrink(String attributesShrink) {
        this.attributesShrink = attributesShrink;
        return this;
    }
    public String getAttributesShrink() {
        return this.attributesShrink;
    }

    public ExecuteOperationSyncShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public ExecuteOperationSyncShrinkRequest setOperation(String operation) {
        this.operation = operation;
        return this;
    }
    public String getOperation() {
        return this.operation;
    }

    public ExecuteOperationSyncShrinkRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public ExecuteOperationSyncShrinkRequest setServiceType(String serviceType) {
        this.serviceType = serviceType;
        return this;
    }
    public String getServiceType() {
        return this.serviceType;
    }

}
