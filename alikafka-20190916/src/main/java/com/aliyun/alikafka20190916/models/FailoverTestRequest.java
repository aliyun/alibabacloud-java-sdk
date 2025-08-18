// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alikafka20190916.models;

import com.aliyun.tea.*;

public class FailoverTestRequest extends TeaModel {
    @NameInMap("Configs")
    public String configs;

    @NameInMap("Description")
    public String description;

    @NameInMap("Duration")
    public Long duration;

    @NameInMap("ExecuteTime")
    public Long executeTime;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Name")
    public String name;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("Type")
    public String type;

    public static FailoverTestRequest build(java.util.Map<String, ?> map) throws Exception {
        FailoverTestRequest self = new FailoverTestRequest();
        return TeaModel.build(map, self);
    }

    public FailoverTestRequest setConfigs(String configs) {
        this.configs = configs;
        return this;
    }
    public String getConfigs() {
        return this.configs;
    }

    public FailoverTestRequest setDescription(String description) {
        this.description = description;
        return this;
    }
    public String getDescription() {
        return this.description;
    }

    public FailoverTestRequest setDuration(Long duration) {
        this.duration = duration;
        return this;
    }
    public Long getDuration() {
        return this.duration;
    }

    public FailoverTestRequest setExecuteTime(Long executeTime) {
        this.executeTime = executeTime;
        return this;
    }
    public Long getExecuteTime() {
        return this.executeTime;
    }

    public FailoverTestRequest setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public FailoverTestRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public FailoverTestRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public FailoverTestRequest setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

}
