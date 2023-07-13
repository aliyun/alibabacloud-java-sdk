// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ehpc20180412.models;

import com.aliyun.tea.*;

public class SubmitServerlessJobShrinkRequest extends TeaModel {
    @NameInMap("ArrayProperties")
    public String arrayPropertiesShrink;

    @NameInMap("ClusterId")
    public String clusterId;

    @NameInMap("Container")
    public String containerShrink;

    @NameInMap("Cpu")
    public Float cpu;

    @NameInMap("DependsOn")
    public String dependsOnShrink;

    @NameInMap("EphemeralStorage")
    public Integer ephemeralStorage;

    @NameInMap("InstanceType")
    public String instanceTypeShrink;

    @NameInMap("JobName")
    public String jobName;

    @NameInMap("JobPriority")
    public Long jobPriority;

    @NameInMap("Memory")
    public Float memory;

    @NameInMap("RamRoleName")
    public String ramRoleName;

    @NameInMap("SpotPriceLimit")
    public Float spotPriceLimit;

    @NameInMap("SpotStrategy")
    public String spotStrategy;

    @NameInMap("Timeout")
    public Long timeout;

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
