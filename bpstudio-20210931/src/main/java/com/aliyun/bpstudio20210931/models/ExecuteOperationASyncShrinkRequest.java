// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bpstudio20210931.models;

import com.aliyun.tea.*;

public class ExecuteOperationASyncShrinkRequest extends TeaModel {
    /**
     * <p>The ID of the Cloud Architect Design Tools (CADT) application.</p>
     * 
     * <strong>example:</strong>
     * <p>BG**********UQ</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

    /**
     * <p>The parameters related to the action. Specify the parameters based on the value of Operation. The parameters are passed in the map format. The following examples show how to specify the parameters if you want to change the specifications of an Elastic Compute Service (ECS) instance:</p>
     * <ul>
     * <li>The following common parameters are required: change_type, regionId, instanceId, appId</li>
     * <li>Example values for changing the instance type of the ECS instance: { &quot;ServiceType&quot;: &quot;ecs&quot;, &quot;Operation&quot;: &quot;modifyInstanceType&quot;, &quot;Attributes&quot;: &quot;{&quot;change_type&quot;:&quot;modify_instance_type&quot;,&quot;instance_type&quot;:&quot;ecs.hfr7.2xlarge&quot;,&quot;instanceId&quot;:&quot;i-xxxxxxxxx&quot;,&quot;regionId&quot;:&quot;cn-beijing&quot;,&quot;appId&quot;:&quot;xxxxxxxxxxxxx&quot;}&quot; }</li>
     * <li>Example values for stopping the ECS instance: { &quot;ServiceType&quot;: &quot;ecs&quot;, &quot;Operation&quot;: &quot;modifyInstanceType&quot;, &quot;Attributes&quot;: &quot;{&quot;change_type&quot;:&quot;modify_status&quot;,&quot;status&quot;:&quot;Stopped&quot;,&quot;instanceId&quot;:&quot;i-xxxxxxxxx&quot;,&quot;regionId&quot;:&quot;cn-beijing&quot;,&quot;appId&quot;:&quot;xxxxxxxxxxxxx&quot;}&quot; }</li>
     * <li>Example values for starting the ECS instance: { &quot;ServiceType&quot;: &quot;ecs&quot;, &quot;Operation&quot;: &quot;modifyInstanceType&quot;, &quot;Attributes&quot;: &quot;{&quot;change_type&quot;:&quot;modify_status&quot;,&quot;status&quot;:&quot;Running&quot;,&quot;instanceId&quot;:&quot;i-xxxxxxxxx&quot;,&quot;regionId&quot;:&quot;cn-beijing&quot;,&quot;appId&quot;:&quot;xxxxxxxxxxxxx&quot;}&quot; }</li>
     * <li>Example values for restarting the ECS instance: { &quot;ServiceType&quot;: &quot;ecs&quot;, &quot;Operation&quot;: &quot;modifyInstanceType&quot;, &quot;Attributes&quot;: &quot;{&quot;change_type&quot;:&quot;modify_status&quot;,&quot;status&quot;:&quot;Restart&quot;,&quot;instanceId&quot;:&quot;i-xxxxxxxxx&quot;,&quot;regionId&quot;:&quot;cn-beijing&quot;,&quot;appId&quot;:&quot;xxxxxxxxxxxxx&quot;}&quot; }</li>
     * </ul>
     * <p>Example of enumerating more than one set of parameters:</p>
     * <ul>
     * <li><p>{ &quot;ServiceType&quot;: &quot;ecs&quot;, &quot;Operation&quot;: &quot;modifyInstanceType&quot;, &quot;Attributes&quot;: &quot;{\\&quot;change_type\\&quot;:\\&quot;modify_instance_type\\&quot;,\\&quot;instance_type\\&quot;:\\&quot;ecs.hfr7.2xlarge\\&quot;,\\&quot;instanceId\\&quot;:\\&quot;i-xxxxxxxxx\\&quot;,\\&quot;regionId\\&quot;:\\&quot;cn-beijing\\&quot;,\\&quot;appId\\&quot;:\\&quot;xxxxxxxxxxxxx\\&quot;}&quot; }</p>
     * <!-- -->
     * 
     * <p>:</p>
     * <!-- -->
     * 
     * <p>{ &quot;ServiceType&quot;: &quot;ecs&quot;, &quot;Operation&quot;: &quot;modifyInstanceType&quot;, &quot;Attributes&quot;: &quot;{\\&quot;change_type\\&quot;:\\&quot;modify_instance_type\\&quot;,\\&quot;instance_type\\&quot;:\\&quot;ecs.hfr7.2xlarge\\&quot;,\\&quot;instanceId\\&quot;:\\&quot;i-xxxxxxxxx\\&quot;,\\&quot;regionId\\&quot;:\\&quot;cn-beijing\\&quot;,\\&quot;appId\\&quot;:\\&quot;xxxxxxxxxxxxx\\&quot;}&quot; }</p>
     * <!-- --></li>
     * </ul>
     */
    @NameInMap("Attributes")
    public String attributesShrink;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>1600765710019</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>This operation type is the operation type of modifying the product, some operation types are generic, and some are used alone. The following is an example of ECS deployment:</p>
     * <ul>
     * <li>The name of the ECS: rename</li>
     * <li>Specification of ecs: modifyInstanceType</li>
     * <li>Startup of ecs: modifyInstanceType</li>
     * <li>Stop of ecs: modifyInstanceType</li>
     * <li>Restart of ecs: modifyInstanceType</li>
     * <li>Ecs Tag: addTags</li>
     * <li>Deletion of ecs: ecsDelete</li>
     * <li>Paid type for ecs: modifyPayType</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>queryTopo</p>
     */
    @NameInMap("Operation")
    public String operation;

    /**
     * <p>Resource group ID, which is used to verify the permissions of the resource group</p>
     * 
     * <strong>example:</strong>
     * <p>ceshi</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The type of the service. If you want to perform operations on an Elastic Compute Service (ECS) instance, set ServiceType to ecs.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ACK</p>
     */
    @NameInMap("ServiceType")
    public String serviceType;

    public static ExecuteOperationASyncShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecuteOperationASyncShrinkRequest self = new ExecuteOperationASyncShrinkRequest();
        return TeaModel.build(map, self);
    }

    public ExecuteOperationASyncShrinkRequest setApplicationId(String applicationId) {
        this.applicationId = applicationId;
        return this;
    }
    public String getApplicationId() {
        return this.applicationId;
    }

    public ExecuteOperationASyncShrinkRequest setAttributesShrink(String attributesShrink) {
        this.attributesShrink = attributesShrink;
        return this;
    }
    public String getAttributesShrink() {
        return this.attributesShrink;
    }

    public ExecuteOperationASyncShrinkRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
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
