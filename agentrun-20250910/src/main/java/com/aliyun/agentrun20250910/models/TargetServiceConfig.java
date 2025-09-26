// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class TargetServiceConfig extends TeaModel {
    @NameInMap("modelId")
    public String modelId;

    @NameInMap("modelName")
    public String modelName;

    @NameInMap("modelNamePattern")
    public String modelNamePattern;

    @NameInMap("weight")
    public Long weight;

    public static TargetServiceConfig build(java.util.Map<String, ?> map) throws Exception {
        TargetServiceConfig self = new TargetServiceConfig();
        return TeaModel.build(map, self);
    }

    public TargetServiceConfig setModelId(String modelId) {
        this.modelId = modelId;
        return this;
    }
    public String getModelId() {
        return this.modelId;
    }

    public TargetServiceConfig setModelName(String modelName) {
        this.modelName = modelName;
        return this;
    }
    public String getModelName() {
        return this.modelName;
    }

    public TargetServiceConfig setModelNamePattern(String modelNamePattern) {
        this.modelNamePattern = modelNamePattern;
        return this;
    }
    public String getModelNamePattern() {
        return this.modelNamePattern;
    }

    public TargetServiceConfig setWeight(Long weight) {
        this.weight = weight;
        return this;
    }
    public Long getWeight() {
        return this.weight;
    }

}
