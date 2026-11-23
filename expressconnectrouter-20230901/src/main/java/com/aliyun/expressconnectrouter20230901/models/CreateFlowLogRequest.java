// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.expressconnectrouter20230901.models;

import com.aliyun.tea.*;

public class CreateFlowLogRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can generate a parameter value on your client to ensure that the value is unique across different requests. The client token can contain only ASCII characters.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system automatically uses the <strong>RequestId</strong> of the API request as the <strong>ClientToken</strong>. The <strong>RequestId</strong> of each API request is different.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>02fb3da4-130e-11e9-8e44-00****</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The description of the flow log.</p>
     * <blockquote>
     * <p>The description can be empty or 0 to 256 characters in length. It cannot start with http:// or https://.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>myFlowlog</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Specifies whether the request is only a dry run. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: Performs a dry run without modifying EPS resources.</p>
     * </li>
     * <li><p><strong>false</strong> (default): Sends a normal request.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The instance ID of the Express Connect Router (ECR).</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ecr-mezk2idmsd0vx2****</p>
     */
    @NameInMap("EcrId")
    public String ecrId;

    /**
     * <p>The name of the flow log.</p>
     * <blockquote>
     * <p>The name can be empty or 0 to 128 characters in length. It cannot start with http:// or https://.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>myFlowlog</p>
     */
    @NameInMap("FlowLogName")
    public String flowLogName;

    /**
     * <p>The instance ID of the VBR.</p>
     * <blockquote>
     * <p>The VBR instance must be created by calling the CreateVirtualBorderRouter operation of the Vpc/2016-04-28 API version. The prerequisite is that a physical connection exists.
     * The VBR instance must be mounted as a child instance to the Express Connect Router (ECR) corresponding to EcrId by calling AttachExpressConnectRouterChildInstance, and the mount status must be ACTIVE before you can create a flow log. You can call DescribeExpressConnectRouterChildInstance to query the mount status of the child instance.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vbr-xxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The type of the network instance. Valid values:</p>
     * <ul>
     * <li><strong>VBR</strong>: virtual border router (VBR) instance.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>VBR</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <p>The duration of the capture window for traffic captured by the flow log. Unit: seconds. Valid values:</p>
     * <ul>
     * <li><strong>60</strong> </li>
     * <li><strong>600</strong></li>
     * </ul>
     * <p>Default value: <strong>600</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("Interval")
    public Integer interval;

    /**
     * <p>The name of the Logstore used to store catch traffic.</p>
     * <ul>
     * <li><p>If you have already created a Logstore in the current region, you can enter the name of the existing Logstore.</p>
     * </li>
     * <li><p>If you have not created a Logstore in the current region, you can specify a custom name for the Logstore, and the system will automatically create the Logstore. The naming rules for the Logstore name are as follows:</p>
     * </li>
     * <li><p>The Logstore name must be unique within the same project.</p>
     * </li>
     * <li><p>It can contain only lowercase letters, digits, hyphens (-), and underscores (_).</p>
     * </li>
     * <li><p>It must start and end with a lowercase letter or a digit.</p>
     * </li>
     * <li><p>It must be 3 to 63 characters in length.</p>
     * </li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>flowlog-logstore</p>
     */
    @NameInMap("LogStoreName")
    public String logStoreName;

    /**
     * <p>The name of the Simple Log Service project used to store catch traffic.</p>
     * <ul>
     * <li>If you have already created a project in the current region, you can enter the name of the existing project.</li>
     * <li>If you have not created a project in the current region, you can specify a custom name for the project, and the system will automatically create the project.</li>
     * </ul>
     * <p>The project name must be globally unique within an Alibaba Cloud region and cannot be modified after creation. The naming rules are as follows:</p>
     * <ul>
     * <li>The project name must be globally unique.</li>
     * <li>It can contain only lowercase</li>
     * <li>letters, digits, and hyphens (-).</li>
     * <li>It must start and end with a lowercase letter or a digit.</li>
     * <li>It must be 3 to 63 characters in length.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>flowlog-project</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    /**
     * <p>The ID of the resource group to which the flow log instance belongs.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-aek2aq7f4va****</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The sampling ratio. Valid values:</p>
     * <ul>
     * <li><strong>1:4096</strong></li>
     * <li><strong>1:2048</strong></li>
     * <li><strong>1:1024</strong></li>
     * </ul>
     * <p>Default value: <strong>1:4096</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1:4096</p>
     */
    @NameInMap("SamplingRate")
    public String samplingRate;

    /**
     * <p>The tags.</p>
     * <p>You can add up to 20 tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateFlowLogRequestTag> tag;

    /**
     * <p>The region where the project to which logs are delivered resides. You only need to specify this parameter for cross-region log delivery. You do not need to specify this parameter for same-region log delivery.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("TargetSlsRegionId")
    public String targetSlsRegionId;

    @NameInMap("Version")
    public String version;

    public static CreateFlowLogRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateFlowLogRequest self = new CreateFlowLogRequest();
        return TeaModel.build(map, self);
    }

    public CreateFlowLogRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateFlowLogRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public CreateFlowLogRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public CreateFlowLogRequest setEcrId(String ecrId) {
        this.ecrId = ecrId;
        return this;
    }
    public String getEcrId() {
        return this.ecrId;
    }

    public CreateFlowLogRequest setFlowLogName(String flowLogName) {
        this.flowLogName = flowLogName;
        return this;
    }
    public String getFlowLogName() {
        return this.flowLogName;
    }

    public CreateFlowLogRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public CreateFlowLogRequest setInstanceType(String instanceType) {
        this.instanceType = instanceType;
        return this;
    }
    public String getInstanceType() {
        return this.instanceType;
    }

    public CreateFlowLogRequest setInterval(Integer interval) {
        this.interval = interval;
        return this;
    }
    public Integer getInterval() {
        return this.interval;
    }

    public CreateFlowLogRequest setLogStoreName(String logStoreName) {
        this.logStoreName = logStoreName;
        return this;
    }
    public String getLogStoreName() {
        return this.logStoreName;
    }

    public CreateFlowLogRequest setProjectName(String projectName) {
        this.projectName = projectName;
        return this;
    }
    public String getProjectName() {
        return this.projectName;
    }

    public CreateFlowLogRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateFlowLogRequest setSamplingRate(String samplingRate) {
        this.samplingRate = samplingRate;
        return this;
    }
    public String getSamplingRate() {
        return this.samplingRate;
    }

    public CreateFlowLogRequest setTag(java.util.List<CreateFlowLogRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateFlowLogRequestTag> getTag() {
        return this.tag;
    }

    public CreateFlowLogRequest setTargetSlsRegionId(String targetSlsRegionId) {
        this.targetSlsRegionId = targetSlsRegionId;
        return this;
    }
    public String getTargetSlsRegionId() {
        return this.targetSlsRegionId;
    }

    public CreateFlowLogRequest setVersion(String version) {
        this.version = version;
        return this;
    }
    public String getVersion() {
        return this.version;
    }

    public static class CreateFlowLogRequestTag extends TeaModel {
        /**
         * <p>The tag key of the resource. If you specify this parameter, it cannot be an empty string. It can be up to 128 characters in length, and cannot start with aliyun or acs:. It cannot contain http:// or https://.</p>
         * 
         * <strong>example:</strong>
         * <p>TestKey</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value. Valid values of N: 1 to 20. If you specify this parameter, it can be an empty string. It can be up to 128 characters in length, and cannot start with acs:. It cannot contain http:// or https://.</p>
         * 
         * <strong>example:</strong>
         * <p>TestValue</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateFlowLogRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateFlowLogRequestTag self = new CreateFlowLogRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateFlowLogRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateFlowLogRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
