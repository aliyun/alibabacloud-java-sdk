// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.bailian20230601.models;

import com.aliyun.tea.*;

public class CreateFineTuneJobShrinkRequest extends TeaModel {
    @NameInMap("AgentKey")
    public String agentKey;

    @NameInMap("BaseModel")
    public String baseModel;

    @NameInMap("HyperParameters")
    public String hyperParametersShrink;

    @NameInMap("ModelName")
    public String modelName;

    @NameInMap("TrainingFiles")
    public String trainingFilesShrink;

    @NameInMap("TrainingType")
    public String trainingType;

    @NameInMap("ValidationFiles")
    public String validationFilesShrink;

    public static CreateFineTuneJobShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateFineTuneJobShrinkRequest self = new CreateFineTuneJobShrinkRequest();
        return TeaModel.build(map, self);
    }

    public CreateFineTuneJobShrinkRequest setAgentKey(String agentKey) {
        this.agentKey = agentKey;
        return this;
    }
    public String getAgentKey() {
        return this.agentKey;
    }

    public CreateFineTuneJobShrinkRequest setBaseModel(String baseModel) {
        this.baseModel = baseModel;
        return this;
    }
    public String getBaseModel() {
        return this.baseModel;
    }

    public CreateFineTuneJobShrinkRequest setHyperParametersShrink(String hyperParametersShrink) {
        this.hyperParametersShrink = hyperParametersShrink;
        return this;
    }
    public String getHyperParametersShrink() {
        return this.hyperParametersShrink;
    }

    public CreateFineTuneJobShrinkRequest setModelName(String modelName) {
        this.modelName = modelName;
        return this;
    }
    public String getModelName() {
        return this.modelName;
    }

    public CreateFineTuneJobShrinkRequest setTrainingFilesShrink(String trainingFilesShrink) {
        this.trainingFilesShrink = trainingFilesShrink;
        return this;
    }
    public String getTrainingFilesShrink() {
        return this.trainingFilesShrink;
    }

    public CreateFineTuneJobShrinkRequest setTrainingType(String trainingType) {
        this.trainingType = trainingType;
        return this;
    }
    public String getTrainingType() {
        return this.trainingType;
    }

    public CreateFineTuneJobShrinkRequest setValidationFilesShrink(String validationFilesShrink) {
        this.validationFilesShrink = validationFilesShrink;
        return this;
    }
    public String getValidationFilesShrink() {
        return this.validationFilesShrink;
    }

}
