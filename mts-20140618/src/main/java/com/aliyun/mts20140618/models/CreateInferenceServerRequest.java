// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class CreateInferenceServerRequest extends TeaModel {
    @NameInMap("TestId")
    public String testId;

    @NameInMap("ModelType")
    public String modelType;

    @NameInMap("ModelPath")
    public String modelPath;

    @NameInMap("FunctionName")
    public String functionName;

    @NameInMap("PipelineId")
    public String pipelineId;

    @NameInMap("UserData")
    public String userData;

    public static CreateInferenceServerRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateInferenceServerRequest self = new CreateInferenceServerRequest();
        return TeaModel.build(map, self);
    }

    public CreateInferenceServerRequest setTestId(String testId) {
        this.testId = testId;
        return this;
    }
    public String getTestId() {
        return this.testId;
    }

    public CreateInferenceServerRequest setModelType(String modelType) {
        this.modelType = modelType;
        return this;
    }
    public String getModelType() {
        return this.modelType;
    }

    public CreateInferenceServerRequest setModelPath(String modelPath) {
        this.modelPath = modelPath;
        return this;
    }
    public String getModelPath() {
        return this.modelPath;
    }

    public CreateInferenceServerRequest setFunctionName(String functionName) {
        this.functionName = functionName;
        return this;
    }
    public String getFunctionName() {
        return this.functionName;
    }

    public CreateInferenceServerRequest setPipelineId(String pipelineId) {
        this.pipelineId = pipelineId;
        return this;
    }
    public String getPipelineId() {
        return this.pipelineId;
    }

    public CreateInferenceServerRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

}
