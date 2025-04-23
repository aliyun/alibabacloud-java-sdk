// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class SubmitServerlessJobShrinkRequest extends TeaModel {
    /**
     * <p>The configuration of the array job.</p>
     * <blockquote>
     * <p> The value of an array job index is passed to a serverless job container through the environment variable <code>EHPC_ARRAY_TASK_ID</code>. Users can access the container from business programs.</p>
     * </blockquote>
     */
    @NameInMap("ArrayProperties")
    public String arrayPropertiesShrink;

    /**
     * <p>The cluster ID.</p>
     * <p>You can call the <a href="https://help.aliyun.com/document_detail/87116.html">ListClusters</a> operation to query the cluster ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>ehpc-hz-FYUr32****</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The properties of the Serverless job container.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("Container")
    public String containerShrink;

    /**
     * <p>The vCPU size of the serverless job container. Unit: cores.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("Cpu")
    public Float cpu;

    /**
     * <p>The dependencies of the serverless job.</p>
     */
    @NameInMap("DependsOn")
    public String dependsOnShrink;

    /**
     * <p>The size of the temporary storage space added to the serverless job container. Unit: GiB.</p>
     * <blockquote>
     * <p> By default, a space of 30 GiB is provided free of charge. If you require a larger space, you can pass this parameter to specify your required space size.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("EphemeralStorage")
    public Integer ephemeralStorage;

    /**
     * <p>The Elastic Compute Service (ECS) instance types used by the serverless job container.</p>
     */
    @NameInMap("InstanceType")
    public String instanceTypeShrink;

    /**
     * <p>The name of the serverless job.</p>
     * <blockquote>
     * <p> The name can contain lowercase letters, digits, and hyphens (-). It cannot start or end with a hyphen.</p>
     * </blockquote>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>testjob</p>
     */
    @NameInMap("JobName")
    public String jobName;

    /**
     * <p>The scheduling priority of the serverless job. Valid values: 0 to 999. A greater value indicates a higher priority.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("JobPriority")
    public Long jobPriority;

    /**
     * <p>The memory size of the serverless job container. Unit: GiB.</p>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("Memory")
    public Float memory;

    /**
     * <p>The Resource Access Manamement (RAM) role that is associated with the Serverless job container.</p>
     * 
     * <strong>example:</strong>
     * <p>testRamRoleName</p>
     */
    @NameInMap("RamRoleName")
    public String ramRoleName;

    /**
     * <p>The retry policy of the serverless job.</p>
     */
    @NameInMap("RetryStrategy")
    public String retryStrategyShrink;

    /**
     * <p>The maximum hourly price of the preemptible elastic container instance. The value can be accurate to three decimal places.</p>
     * <p>If you set SpotStrategy to SpotWithPriceLimit, you must specify the SpotPriceLimit parameter.</p>
     * 
     * <strong>example:</strong>
     * <p>0.062</p>
     */
    @NameInMap("SpotPriceLimit")
    public Float spotPriceLimit;

    /**
     * <p>The bidding policy of the ECS instances. Valid values:</p>
     * <ul>
     * <li>NoSpot: The instance is created as a pay-as-you-go instance.</li>
     * <li>SpotWithPriceLimit: The instance is created as a preemptible instance for which you specify the maximum hourly price.</li>
     * <li>SpotAsPriceGo: The instance is created as a preemptible instance for which the market price at the time of purchase is automatically used as the bid price.</li>
     * </ul>
     * <p>Default value: NoSpot.</p>
     * 
     * <strong>example:</strong>
     * <p>SpotWithPriceLimit</p>
     */
    @NameInMap("SpotStrategy")
    public String spotStrategy;

    /**
     * <p>The validity period of the serverless job. After the validity period expires, the job is forcibly terminated. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>3600</p>
     */
    @NameInMap("Timeout")
    public Long timeout;

    /**
     * <p>The IDs of the vSwitches to which the serverless job container belongs.</p>
     */
    @NameInMap("VSwitchId")
    public String vSwitchIdShrink;

    public static SubmitServerlessJobShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitServerlessJobShrinkRequest self = new SubmitServerlessJobShrinkRequest();
        return TeaModel.build(map, self);
    }

    public SubmitServerlessJobShrinkRequest setArrayPropertiesShrink(String arrayPropertiesShrink) {
        this.arrayPropertiesShrink = arrayPropertiesShrink;
        return this;
    }
    public String getArrayPropertiesShrink() {
        return this.arrayPropertiesShrink;
    }

    public SubmitServerlessJobShrinkRequest setClusterId(String clusterId) {
        this.clusterId = clusterId;
        return this;
    }
    public String getClusterId() {
        return this.clusterId;
    }

    public SubmitServerlessJobShrinkRequest setContainerShrink(String containerShrink) {
        this.containerShrink = containerShrink;
        return this;
    }
    public String getContainerShrink() {
        return this.containerShrink;
    }

    public SubmitServerlessJobShrinkRequest setCpu(Float cpu) {
        this.cpu = cpu;
        return this;
    }
    public Float getCpu() {
        return this.cpu;
    }

    public SubmitServerlessJobShrinkRequest setDependsOnShrink(String dependsOnShrink) {
        this.dependsOnShrink = dependsOnShrink;
        return this;
    }
    public String getDependsOnShrink() {
        return this.dependsOnShrink;
    }

    public SubmitServerlessJobShrinkRequest setEphemeralStorage(Integer ephemeralStorage) {
        this.ephemeralStorage = ephemeralStorage;
        return this;
    }
    public Integer getEphemeralStorage() {
        return this.ephemeralStorage;
    }

    public SubmitServerlessJobShrinkRequest setInstanceTypeShrink(String instanceTypeShrink) {
        this.instanceTypeShrink = instanceTypeShrink;
        return this;
    }
    public String getInstanceTypeShrink() {
        return this.instanceTypeShrink;
    }

    public SubmitServerlessJobShrinkRequest setJobName(String jobName) {
        this.jobName = jobName;
        return this;
    }
    public String getJobName() {
        return this.jobName;
    }

    public SubmitServerlessJobShrinkRequest setJobPriority(Long jobPriority) {
        this.jobPriority = jobPriority;
        return this;
    }
    public Long getJobPriority() {
        return this.jobPriority;
    }

    public SubmitServerlessJobShrinkRequest setMemory(Float memory) {
        this.memory = memory;
        return this;
    }
    public Float getMemory() {
        return this.memory;
    }

    public SubmitServerlessJobShrinkRequest setRamRoleName(String ramRoleName) {
        this.ramRoleName = ramRoleName;
        return this;
    }
    public String getRamRoleName() {
        return this.ramRoleName;
    }

    public SubmitServerlessJobShrinkRequest setRetryStrategyShrink(String retryStrategyShrink) {
        this.retryStrategyShrink = retryStrategyShrink;
        return this;
    }
    public String getRetryStrategyShrink() {
        return this.retryStrategyShrink;
    }

    public SubmitServerlessJobShrinkRequest setSpotPriceLimit(Float spotPriceLimit) {
        this.spotPriceLimit = spotPriceLimit;
        return this;
    }
    public Float getSpotPriceLimit() {
        return this.spotPriceLimit;
    }

    public SubmitServerlessJobShrinkRequest setSpotStrategy(String spotStrategy) {
        this.spotStrategy = spotStrategy;
        return this;
    }
    public String getSpotStrategy() {
        return this.spotStrategy;
    }

    public SubmitServerlessJobShrinkRequest setTimeout(Long timeout) {
        this.timeout = timeout;
        return this;
    }
    public Long getTimeout() {
        return this.timeout;
    }

    public SubmitServerlessJobShrinkRequest setVSwitchIdShrink(String vSwitchIdShrink) {
        this.vSwitchIdShrink = vSwitchIdShrink;
        return this;
    }
    public String getVSwitchIdShrink() {
        return this.vSwitchIdShrink;
    }

}
