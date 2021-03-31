// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mts20140618.models;

import com.aliyun.tea.*;

public class SubmitInferenceJobRequest extends TeaModel {
    @NameInMap("UserId")
    public Long userId;

    @NameInMap("TestId")
    public String testId;

    @NameInMap("ModelType")
    public String modelType;

    @NameInMap("ModelPath")
    public String modelPath;

    @NameInMap("Input")
    public String input;

    @NameInMap("PipelineId")
    public String pipelineId;

    @NameInMap("UserData")
    public String userData;

    @NameInMap("NotifyUrl")
    public String notifyUrl;

    public static SubmitInferenceJobRequest build(java.util.Map<String, ?> map) throws Exception {
        SubmitInferenceJobRequest self = new SubmitInferenceJobRequest();
        return TeaModel.build(map, self);
    }

    public SubmitInferenceJobRequest setUserId(Long userId) {
        this.userId = userId;
        return this;
    }
    public Long getUserId() {
        return this.userId;
    }

    public SubmitInferenceJobRequest setTestId(String testId) {
        this.testId = testId;
        return this;
    }
    public String getTestId() {
        return this.testId;
    }

    public SubmitInferenceJobRequest setModelType(String modelType) {
        this.modelType = modelType;
        return this;
    }
    public String getModelType() {
        return this.modelType;
    }

    public SubmitInferenceJobRequest setModelPath(String modelPath) {
        this.modelPath = modelPath;
        return this;
    }
    public String getModelPath() {
        return this.modelPath;
    }

    public SubmitInferenceJobRequest setInput(String input) {
        this.input = input;
        return this;
    }
    public String getInput() {
        return this.input;
    }

    public SubmitInferenceJobRequest setPipelineId(String pipelineId) {
        this.pipelineId = pipelineId;
        return this;
    }
    public String getPipelineId() {
        return this.pipelineId;
    }

    public SubmitInferenceJobRequest setUserData(String userData) {
        this.userData = userData;
        return this;
    }
    public String getUserData() {
        return this.userData;
    }

    public SubmitInferenceJobRequest setNotifyUrl(String notifyUrl) {
        this.notifyUrl = notifyUrl;
        return this;
    }
    public String getNotifyUrl() {
        return this.notifyUrl;
    }

}
