// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.agentrun20250910.models;

import com.aliyun.tea.*;

public class ModelInfoConfig extends TeaModel {
    @NameInMap("modelFeatures")
    public ModelFeatures modelFeatures;

    @NameInMap("modelName")
    public String modelName;

    @NameInMap("modelParameterRules")
    public java.util.List<ModelParameterRule> modelParameterRules;

    @NameInMap("modelProperties")
    public ModelProperties modelProperties;

    public static ModelInfoConfig build(java.util.Map<String, ?> map) throws Exception {
        ModelInfoConfig self = new ModelInfoConfig();
        return TeaModel.build(map, self);
    }

    public ModelInfoConfig setModelFeatures(ModelFeatures modelFeatures) {
        this.modelFeatures = modelFeatures;
        return this;
    }
    public ModelFeatures getModelFeatures() {
        return this.modelFeatures;
    }

    public ModelInfoConfig setModelName(String modelName) {
        this.modelName = modelName;
        return this;
    }
    public String getModelName() {
        return this.modelName;
    }

    public ModelInfoConfig setModelParameterRules(java.util.List<ModelParameterRule> modelParameterRules) {
        this.modelParameterRules = modelParameterRules;
        return this;
    }
    public java.util.List<ModelParameterRule> getModelParameterRules() {
        return this.modelParameterRules;
    }

    public ModelInfoConfig setModelProperties(ModelProperties modelProperties) {
        this.modelProperties = modelProperties;
        return this;
    }
    public ModelProperties getModelProperties() {
        return this.modelProperties;
    }

}
