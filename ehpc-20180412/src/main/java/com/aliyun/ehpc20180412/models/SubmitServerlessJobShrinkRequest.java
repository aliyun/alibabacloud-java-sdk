// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class SubmitServerlessJobShrinkRequest extends TeaModel {
    /**
     * <p>The configuration of the array job.</p>
     * <br>
     * <p>>  The value of an array job index is passed to a serverless job container through the environment variable `EHPC_ARRAY_TASK_ID`. Users can access the container from business programs.</p>
     */
    @NameInMap("ArrayProperties")
    public String arrayPropertiesShrink;

    /**
     * <p>The ID of the E-HPC cluster.</p>
     * <br>
     * <p>You can call the [ListClusters](~~87116~~) operation to query the cluster ID.</p>
     */
    @NameInMap("ClusterId")
    public String clusterId;

    /**
     * <p>The properties of the serverless job container.</p>
     */
    @NameInMap("Container")
    public String containerShrink;

    /**
     * <p>The vCPU size of the serverless job container. Unit: cores.</p>
     */
    @NameInMap("Cpu")
    public Float cpu;

    /**
     * <p>The serverless job dependencies.</p>
     */
    @NameInMap("DependsOn")
    public String dependsOnShrink;

    /**
     * <p>The size of the temporary storage that is added to the serverless job container. Unit: GiB.</p>
     * <br>
     * <p>>  By default, the serverless job container provides 30 GiB of free storage quota. If you require storage of more than 30 GiB, you can use this parameter to specify the temporary storage to add to the job container.</p>
     */
    @NameInMap("EphemeralStorage")
    public Integer ephemeralStorage;

    /**
     * <p>The ECS instance types used by the serverless job container.</p>
     */
    @NameInMap("InstanceType")
    public String instanceTypeShrink;

    /**
     * <p>The name of the serverless job.</p>
     */
    @NameInMap("JobName")
    public String jobName;

    /**
     * <p>The scheduling priority of the serverless job. Valid values: 0 to 999. A greater value indicates a higher priority.</p>
     */
    @NameInMap("JobPriority")
    public Long jobPriority;

    /**
     * <p>The memory size of the serverless job container. Unit: GiB.</p>
     */
    @NameInMap("Memory")
    public Float memory;

    /**
     * <p>The name of the RAM role that is associated with the serverless job container.</p>
     */
    @NameInMap("RamRoleName")
    public String ramRoleName;

    @NameInMap("RetryStrategy")
    public String retryStrategyShrink;

    /**
     * <p>The maximum hourly price of the preemptible instance. The value can contain up to three decimal places.</p>
     * <br>
     * <p>If you set SpotStrategy to SpotWithPriceLimit, you must specify the SpotPriceLimit parameter.</p>
     */
    @NameInMap("SpotPriceLimit")
    public Float spotPriceLimit;

    /**
     * <p>The bidding policy for the instance. Valid values:</p>
     * <br>
     * <p>*   NoSpot: The instance is created as a pay-as-you-go instance.</p>
     * <p>*   SpotWithPriceLimit: The instance is created as a preemptible instance with a user-defined maximum hourly price.</p>
     * <p>*   SpotAsPriceGo: The instance is created as a preemptible instance for which the market price at the time of purchase is used as the bid price.</p>
     * <br>
     * <p>Default value: NoSpot.</p>
     */
    @NameInMap("SpotStrategy")
    public String spotStrategy;

    /**
     * <p>The validity period of the serverless job. After the validity period expires, the job is forcibly terminated. Unit: seconds.</p>
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
