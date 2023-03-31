// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bpstudio20210931.models;

import com.aliyun.tea.*;

public class ExecuteOperationASyncRequest extends TeaModel {
    /**
     * <p>The parameters that you need to specify when you perform an operation. The parameters vary based on the operation and are specified in the map format. The following examples show how to specify the parameters if you perform an operation on an ECS instance:</p>
     * <br>
     * <p>*   The following common parameters need to be specified for operations on an ECS instance:</p>
     * <br>
     * <p>change_type, regionId, instanceId, and appId.</p>
     * <br>
     * <p>*   To change the instance type of an ECS instance, specify the following parameters:</p>
     * <br>
     * <p>{ "ServiceType": "ecs", "Operation": "modifyInstanceType", "Attributes": "{"change_type":"modify_instance_type","instance_type":"ecs.hfr7.2xlarge","instanceId":"i-xxxxxxxxx","regionId":"cn-beijing","appId":"xxxxxxxxxxxxx"}" }</p>
     * <br>
     * <p>*   To stop an ECS instance, specify the following parameters:</p>
     * <br>
     * <p>{ "ServiceType": "ecs", "Operation": "modifyInstanceType", "Attributes": "{"change_type":"modify_status","status":"Stopped","instanceId":"i-xxxxxxxxx","regionId":"cn-beijing","appId":"xxxxxxxxxxxxx"}" }</p>
     * <br>
     * <p>*   To start an ECS instance, specify the following parameters:</p>
     * <br>
     * <p>{ "ServiceType": "ecs", "Operation": "modifyInstanceType", "Attributes": "{"change_type":"modify_status","status":"Running","instanceId":"i-xxxxxxxxx","regionId":"cn-beijing","appId":"xxxxxxxxxxxxx"}" }</p>
     * <br>
     * <p>*   To restart an ECS instance, specify the following parameters:</p>
     * <br>
     * <p>{ "ServiceType": "ecs", "Operation": "modifyInstanceType", "Attributes": "{"change_type":"modify_status","status":"Restart","instanceId":"i-xxxxxxxxx","regionId":"cn-beijing","appId":"xxxxxxxxxxxxx"}" }</p>
     * <br>
     * <p>Enumeration values</p>
     * <br>
     * <p><!-- --></p>
     * <br>
     * <p>:</p>
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
     */
    @NameInMap("Attributes")
    public java.util.Map<String, String> attributes;

    /**
     * <p>The type of the operation to be performed to modify the parameters of an instance of the specified service. Some operations are common to different services, and other operations are specific to each service. For example, set this parameter to one of the following values to perform the corresponding operation on an ECS instance:</p>
     * <br>
     * <p>*   rename: modifies the name of an ECS instance.</p>
     * <p>*   modifyInstanceType: changes the instance type of an ECS instance.</p>
     * <p>*   modifyInstanceType: starts an ECS instance.</p>
     * <p>*   modifyInstanceType: stops an ECS instance.</p>
     * <p>*   modifyInstanceType: restarts an ECS instance.</p>
     * <p>*   addTags: adds tags to an ECS instance.</p>
     * <p>*   ecsDelete: deletes an ECS instance.</p>
     * <p>*   modifyPayType: changes the billing method of an ECS instance.</p>
     */
    @NameInMap("Operation")
    public String operation;

    /**
     * <p>The ID of the resource group. This parameter is specified to verify the permissions on the resource group.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The type of the service. If you want to modify the parameters of an Elastic Compute Service (ECS) instance, set this parameter to ecs.</p>
     */
    @NameInMap("ServiceType")
    public String serviceType;

    public static ExecuteOperationASyncRequest build(java.util.Map<String, ?> map) throws Exception {
        ExecuteOperationASyncRequest self = new ExecuteOperationASyncRequest();
        return TeaModel.build(map, self);
    }

    public ExecuteOperationASyncRequest setAttributes(java.util.Map<String, String> attributes) {
        this.attributes = attributes;
        return this;
    }
    public java.util.Map<String, String> getAttributes() {
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
