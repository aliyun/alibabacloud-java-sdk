// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.expressconnectrouter20230901.models;

import com.aliyun.tea.*;

public class CreateFlowLogRequest extends TeaModel {
    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.</p>
     * <blockquote>
     * <p> If you do not specify this parameter, the system automatically uses the <strong>request ID</strong> as the <strong>client token</strong>. The <strong>request ID</strong> may be different for each request.</p>
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
     * <p>The description can be empty or 1 to 256 characters in length. It cannot start with http:// or https://.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>myFlowlog</p>
     */
    @NameInMap("Description")
    public String description;

    /**
     * <p>Specifies whether to perform only a dry run, without performing the actual request. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: performs only a dry run.</li>
     * <li><strong>false</strong> (default): performs a dry run and performs the actual request.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>The ID of the ECR.</p>
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
     * <p>The name can be empty or 1 to 128 characters in length and cannot start with http:// or https://.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>myFlowlog</p>
     */
    @NameInMap("FlowLogName")
    public String flowLogName;

    /**
     * <p>The VBR ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>vbr-xxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The type of network instance. Valid values:</p>
     * <ul>
     * <li><strong>VBR</strong></li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>VBR</p>
     */
    @NameInMap("InstanceType")
    public String instanceType;

    /**
     * <p>The time window for collecting log data. Unit: seconds. Valid values:</p>
     * <ul>
     * <li><strong>60</strong></li>
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
     * <p>The Logstore that stores the captured traffic data.</p>
     * <ul>
     * <li>If a Logstore is already created in the selected region, enter the name of the Logstore.</li>
     * <li>If no Logstores are created in the selected region, enter a name and the system automatically creates a Logstore. The name of the Logstore. The name must meet the following requirements:</li>
     * <li>The name must be unique in a project.</li>
     * <li>It can contain only lowercase letters, digits, hyphens (-), and underscores (_).</li>
     * <li>The name must start and end with a lowercase letter or a digit.</li>
     * <li>The name must be 3 to 63 characters in length.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>flowlog-logstore</p>
     */
    @NameInMap("LogStoreName")
    public String logStoreName;

    /**
     * <p>The project that stores the captured traffic data.</p>
     * <ul>
     * <li>If a project is already created in the selected region, enter the name of the project.</li>
     * <li>If no projects are created in the selected region, enter a name and the system automatically creates a project.</li>
     * </ul>
     * <p>The project name must be unique in a region. You cannot change the name after the project is created. The name must meet the following requirements:</p>
     * <ul>
     * <li>The name must be globally unique.</li>
     * <li>The name can contain only lowercase letters,</li>
     * <li>digits, and hyphens (-).</li>
     * <li>The name must start and end with a lowercase letter or a digit.</li>
     * <li>The name must be 3 to 63 characters in length.</li>
     * </ul>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>flowlog-project</p>
     */
    @NameInMap("ProjectName")
    public String projectName;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The sampling proportion. Valid values:</p>
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

    @NameInMap("Tag")
    public java.util.List<CreateFlowLogRequestTag> tag;

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
        @NameInMap("Key")
        public String key;

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
