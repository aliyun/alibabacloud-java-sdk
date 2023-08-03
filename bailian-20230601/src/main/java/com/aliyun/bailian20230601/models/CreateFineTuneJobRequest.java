// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20230601.models;

import com.aliyun.tea.*;

public class CreateFineTuneJobRequest extends TeaModel {
    @NameInMap("AgentKey")
    public String agentKey;

    @NameInMap("BaseModel")
    public String baseModel;

    @NameInMap("HyperParameters")
    public CreateFineTuneJobRequestHyperParameters hyperParameters;

    @NameInMap("ModelName")
    public String modelName;

    @NameInMap("TrainingFiles")
    public java.util.List<String> trainingFiles;

    @NameInMap("TrainingType")
    public String trainingType;

    @NameInMap("ValidationFiles")
    public java.util.List<String> validationFiles;

    public static CreateFineTuneJobRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateFineTuneJobRequest self = new CreateFineTuneJobRequest();
        return TeaModel.build(map, self);
    }

    public CreateFineTuneJobRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public CreateFineTuneJobRequest setBaseModel(String baseModel) {
        this.baseModel = baseModel;
        return this;
    }
    public String getBaseModel() {
        return this.baseModel;
    }

    public CreateFineTuneJobRequest setHyperParameters(CreateFineTuneJobRequestHyperParameters hyperParameters) {
        this.hyperParameters = hyperParameters;
        return this;
    }
    public CreateFineTuneJobRequestHyperParameters getHyperParameters() {
        return this.hyperParameters;
    }

    public CreateFineTuneJobRequest setModelName(String modelName) {
        this.modelName = modelName;
        return this;
    }
    public String getModelName() {
        return this.modelName;
    }

    public CreateFineTuneJobRequest setTrainingFiles(java.util.List<String> trainingFiles) {
        this.trainingFiles = trainingFiles;
        return this;
    }
    public java.util.List<String> getTrainingFiles() {
        return this.trainingFiles;
    }

    public CreateFineTuneJobRequest setTrainingType(String trainingType) {
        this.trainingType = trainingType;
        return this;
    }
    public String getTrainingType() {
        return this.trainingType;
    }

    public CreateFineTuneJobRequest setValidationFiles(java.util.List<String> validationFiles) {
        this.validationFiles = validationFiles;
        return this;
    }
    public java.util.List<String> getValidationFiles() {
        return this.validationFiles;
    }

    public static class CreateFineTuneJobRequestHyperParameters extends TeaModel {
        @NameInMap("BatchSize")
        public Integer batchSize;

        @NameInMap("Epochs")
        public Integer epochs;

        @NameInMap("LearningRate")
        public String learningRate;

        @NameInMap("PromptLossWeight")
        public Double promptLossWeight;

        public static CreateFineTuneJobRequestHyperParameters build(java.util.Map<String, ?> map) throws Exception {
            CreateFineTuneJobRequestHyperParameters self = new CreateFineTuneJobRequestHyperParameters();
            return TeaModel.build(map, self);
        }

        public CreateFineTuneJobRequestHyperParameters setBatchSize(Integer batchSize) {
            this.batchSize = batchSize;
            return this;
        }
        public Integer getBatchSize() {
            return this.batchSize;
        }

        public CreateFineTuneJobRequestHyperParameters setEpochs(Integer epochs) {
            this.epochs = epochs;
            return this;
        }
        public Integer getEpochs() {
            return this.epochs;
        }

        public CreateFineTuneJobRequestHyperParameters setLearningRate(String learningRate) {
            this.learningRate = learningRate;
            return this;
        }
        public String getLearningRate() {
            return this.learningRate;
        }

        public CreateFineTuneJobRequestHyperParameters setPromptLossWeight(Double promptLossWeight) {
            this.promptLossWeight = promptLossWeight;
            return this;
        }
        public Double getPromptLossWeight() {
            return this.promptLossWeight;
        }

    }

}
