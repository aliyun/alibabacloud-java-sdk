// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class AiTranslateTransformParameters extends TeaModel {
    @NameInMap("InputField")
    public AiTransformField inputField;

    /**
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("SourceLanguage")
    public String sourceLanguage;

    /**
     * <strong>example:</strong>
     * <p>translation</p>
     */
    @NameInMap("StepName")
    public String stepName;

    /**
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("TargetLanguage")
    public String targetLanguage;

    public static AiTranslateTransformParameters build(java.util.Map<String, ?> map) throws Exception {
        AiTranslateTransformParameters self = new AiTranslateTransformParameters();
        return TeaModel.build(map, self);
    }

    public AiTranslateTransformParameters setInputField(AiTransformField inputField) {
        this.inputField = inputField;
        return this;
    }
    public AiTransformField getInputField() {
        return this.inputField;
    }

    public AiTranslateTransformParameters setSourceLanguage(String sourceLanguage) {
        this.sourceLanguage = sourceLanguage;
        return this;
    }
    public String getSourceLanguage() {
        return this.sourceLanguage;
    }

    public AiTranslateTransformParameters setStepName(String stepName) {
        this.stepName = stepName;
        return this;
    }
    public String getStepName() {
        return this.stepName;
    }

    public AiTranslateTransformParameters setTargetLanguage(String targetLanguage) {
        this.targetLanguage = targetLanguage;
        return this;
    }
    public String getTargetLanguage() {
        return this.targetLanguage;
    }

}
