// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class AiSummarizeTransformParameters extends TeaModel {
    /**
     * <p>The input text field.</p>
     */
    @NameInMap("InputField")
    public AiTransformField inputField;

    /**
     * <p>The maximum summary length. The value must be a positive integer. Default value: 200.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("MaxLength")
    public Integer maxLength;

    /**
     * <p>The field name attached to the CloudEvent for output. Default value: transform0.</p>
     * 
     * <strong>example:</strong>
     * <p>summary</p>
     */
    @NameInMap("StepName")
    public String stepName;

    public static AiSummarizeTransformParameters build(java.util.Map<String, ?> map) throws Exception {
        AiSummarizeTransformParameters self = new AiSummarizeTransformParameters();
        return TeaModel.build(map, self);
    }

    public AiSummarizeTransformParameters setInputField(AiTransformField inputField) {
        this.inputField = inputField;
        return this;
    }
    public AiTransformField getInputField() {
        return this.inputField;
    }

    public AiSummarizeTransformParameters setMaxLength(Integer maxLength) {
        this.maxLength = maxLength;
        return this;
    }
    public Integer getMaxLength() {
        return this.maxLength;
    }

    public AiSummarizeTransformParameters setStepName(String stepName) {
        this.stepName = stepName;
        return this;
    }
    public String getStepName() {
        return this.stepName;
    }

}
