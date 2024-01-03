// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bpstudio20210931.models;

import com.aliyun.tea.*;

public class ExecuteOperationASyncShrinkRequest extends TeaModel {
    /**
     * <p>The ID of the Cloud Architect Design Tools (CADT) application.</p>
     */
    @NameInMap("ApplicationId")
    public String applicationId;

    /**
     * <p>The parameters related to the action. Specify the parameters based on the value of Operation. The parameters are passed in the map format. The following examples show how to specify the parameters if you want to change the specifications of an Elastic Compute Service (ECS) instance:</p>
     * <br>
     * <p>*   The following common parameters are required: change_type, regionId, instanceId, appId</p>
     * <p>*   Example values for changing the instance type of the ECS instance: { "ServiceType": "ecs", "Operation": "modifyInstanceType", "Attributes": "{"change_type":"modify_instance_type","instance_type":"ecs.hfr7.2xlarge","instanceId":"i-xxxxxxxxx","regionId":"cn-beijing","appId":"xxxxxxxxxxxxx"}" }</p>
     * <p>*   Example values for stopping the ECS instance: { "ServiceType": "ecs", "Operation": "modifyInstanceType", "Attributes": "{"change_type":"modify_status","status":"Stopped","instanceId":"i-xxxxxxxxx","regionId":"cn-beijing","appId":"xxxxxxxxxxxxx"}" }</p>
     * <p>*   Example values for starting the ECS instance: { "ServiceType": "ecs", "Operation": "modifyInstanceType", "Attributes": "{"change_type":"modify_status","status":"Running","instanceId":"i-xxxxxxxxx","regionId":"cn-beijing","appId":"xxxxxxxxxxxxx"}" }</p>
     * <p>*   Example values for restarting the ECS instance: { "ServiceType": "ecs", "Operation": "modifyInstanceType", "Attributes": "{"change_type":"modify_status","status":"Restart","instanceId":"i-xxxxxxxxx","regionId":"cn-beijing","appId":"xxxxxxxxxxxxx"}" }</p>
     * <br>
     * <p>Example of enumerating more than one set of parameters:</p>
     * <br>
     * <p>*   { "ServiceType": "ecs", "Operation": "modifyInstanceType", "Attributes": "{\\"change_type\\":\\"modify_instance_type\\",\\"instance_type\\":\\"ecs.hfr7.2xlarge\\",\\"instanceId\\":\\"i-xxxxxxxxx\\",\\"regionId\\":\\"cn-beijing\\",\\"appId\\":\\"xxxxxxxxxxxxx\\"}" }</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    :</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    { "ServiceType": "ecs", "Operation": "modifyInstanceType", "Attributes": "{\\"change_type\\":\\"modify_instance_type\\",\\"instance_type\\":\\"ecs.hfr7.2xlarge\\",\\"instanceId\\":\\"i-xxxxxxxxx\\",\\"regionId\\":\\"cn-beijing\\",\\"appId\\":\\"xxxxxxxxxxxxx\\"}" }</p>
     * <br>
     * <p>    <!-- --></p>
     */
    @NameInMap("Attributes")
    public String attributesShrink;

    /**
     * <p>This operation type is the operation type of modifying the product, some operation types are generic, and some are used alone. The following is an example of ECS deployment:</p>
     * <p>- The name of the ECS: rename</p>
     * <p>- Specificationof ecs: modifyInstanceType</p>
     * <p>- Startup of ecs: modifyInstanceType</p>
     * <p>- Stop of ecs: modifyInstanceType</p>
     * <p>- Restart of ecs: modifyInstanceType</p>
     * <p>- Ecs Tag: addTags</p>
     * <p>- Deletion of ecs: ecsDelete</p>
     * <p>- Paid type for ecs: modifyPayType</p>
     */
    @NameInMap("Operation")
    public String operation;

    /**
     * <p>Resource group ID, which is used to verify the permissions of the resource group</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The type of the service. If you want to perform operations on an Elastic Compute Service (ECS) instance, set ServiceType to ecs.</p>
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
