// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mpserverless20190615.models;

import com.aliyun.tea.*;

public class UpdateFunctionRequest extends TeaModel {
    @NameInMap("Desc")
    public String desc;

    @NameInMap("HttpTriggerPath")
    public String httpTriggerPath;

    @NameInMap("InstanceConcurrency")
    public Integer instanceConcurrency;

    @NameInMap("Memory")
    public Integer memory;

    @NameInMap("Name")
    public String name;

    @NameInMap("Runtime")
    public String runtime;

    @NameInMap("SpaceId")
    public String spaceId;

    @NameInMap("Timeout")
    public Integer timeout;

    @NameInMap("TimingTriggerConfig")
    public String timingTriggerConfig;

    public static UpdateFunctionRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateFunctionRequest self = new UpdateFunctionRequest();
        return TeaModel.build(map, self);
    }

    public UpdateFunctionRequest setDesc(String desc) {
        this.desc = desc;
        return this;
    }
    public String getDesc() {
        return this.desc;
    }

    public UpdateFunctionRequest setHttpTriggerPath(String httpTriggerPath) {
        this.httpTriggerPath = httpTriggerPath;
        return this;
    }
    public String getHttpTriggerPath() {
        return this.httpTriggerPath;
    }

    public UpdateFunctionRequest setInstanceConcurrency(Integer instanceConcurrency) {
        this.instanceConcurrency = instanceConcurrency;
        return this;
    }
    public Integer getInstanceConcurrency() {
        return this.instanceConcurrency;
    }

    public UpdateFunctionRequest setMemory(Integer memory) {
        this.memory = memory;
        return this;
    }
    public Integer getMemory() {
        return this.memory;
    }

    public UpdateFunctionRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateFunctionRequest setRuntime(String runtime) {
        this.runtime = runtime;
        return this;
    }
    public String getRuntime() {
        return this.runtime;
    }

    public UpdateFunctionRequest setSpaceId(String spaceId) {
        this.spaceId = spaceId;
        return this;
    }
    public String getSpaceId() {
        return this.spaceId;
    }

    public UpdateFunctionRequest setTimeout(Integer timeout) {
        this.timeout = timeout;
        return this;
    }
    public Integer getTimeout() {
        return this.timeout;
    }

    public UpdateFunctionRequest setTimingTriggerConfig(String timingTriggerConfig) {
        this.timingTriggerConfig = timingTriggerConfig;
        return this;
    }
    public String getTimingTriggerConfig() {
        return this.timingTriggerConfig;
    }

}
