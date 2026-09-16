// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class AiFilterTransformParameters extends TeaModel {
    /**
     * <p>The retention condition described in natural language. The model uses this condition to determine whether an event matches.</p>
     * 
     * <strong>example:</strong>
     * <p>Retain only content related to user complaints or refunds</p>
     */
    @NameInMap("Condition")
    public String condition;

    /**
     * <p>The input text field.</p>
     */
    @NameInMap("InputField")
    public AiTransformField inputField;

    /**
     * <p>The behavior when a mismatch occurs. Valid values: discard (default): discards the event. forward: forwards the event as-is.</p>
     * 
     * <strong>example:</strong>
     * <p>discard</p>
     */
    @NameInMap("OnMismatch")
    public String onMismatch;

    /**
     * <p>The field name in the CloudEvent to which the output is attached. Default value: transform0.</p>
     * 
     * <strong>example:</strong>
     * <p>filter_result</p>
     */
    @NameInMap("StepName")
    public String stepName;

    public static AiFilterTransformParameters build(java.util.Map<String, ?> map) throws Exception {
        AiFilterTransformParameters self = new AiFilterTransformParameters();
        return TeaModel.build(map, self);
    }

    public AiFilterTransformParameters setCondition(String condition) {
        this.condition = condition;
        return this;
    }
    public String getCondition() {
        return this.condition;
    }

    public AiFilterTransformParameters setInputField(AiTransformField inputField) {
        this.inputField = inputField;
        return this;
    }
    public AiTransformField getInputField() {
        return this.inputField;
    }

    public AiFilterTransformParameters setOnMismatch(String onMismatch) {
        this.onMismatch = onMismatch;
        return this;
    }
    public String getOnMismatch() {
        return this.onMismatch;
    }

    public AiFilterTransformParameters setStepName(String stepName) {
        this.stepName = stepName;
        return this;
    }
    public String getStepName() {
        return this.stepName;
    }

}
