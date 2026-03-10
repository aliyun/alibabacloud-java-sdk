// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cms20240330.models;

import com.aliyun.tea.*;

public class ExperimentConfig extends TeaModel {
    @NameInMap("label")
    public String label;

    @NameInMap("modelName")
    public String modelName;

    @NameInMap("modelParameters")
    public ModelParameters modelParameters;

    @NameInMap("modelProvider")
    public String modelProvider;

    @NameInMap("name")
    public String name;

    @NameInMap("promptTemplate")
    public java.util.List<PromptTemplateItem> promptTemplate;

    public static ExperimentConfig build(java.util.Map<String, ?> map) throws Exception {
        ExperimentConfig self = new ExperimentConfig();
        return TeaModel.build(map, self);
    }

    public ExperimentConfig setLabel(String label) {
        this.label = label;
        return this;
    }
    public String getLabel() {
        return this.label;
    }

    public ExperimentConfig setModelName(String modelName) {
        this.modelName = modelName;
        return this;
    }
    public String getModelName() {
        return this.modelName;
    }

    public ExperimentConfig setModelParameters(ModelParameters modelParameters) {
        this.modelParameters = modelParameters;
        return this;
    }
    public ModelParameters getModelParameters() {
        return this.modelParameters;
    }

    public ExperimentConfig setModelProvider(String modelProvider) {
        this.modelProvider = modelProvider;
        return this;
    }
    public String getModelProvider() {
        return this.modelProvider;
    }

    public ExperimentConfig setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public ExperimentConfig setPromptTemplate(java.util.List<PromptTemplateItem> promptTemplate) {
        this.promptTemplate = promptTemplate;
        return this;
    }
    public java.util.List<PromptTemplateItem> getPromptTemplate() {
        return this.promptTemplate;
    }

}
