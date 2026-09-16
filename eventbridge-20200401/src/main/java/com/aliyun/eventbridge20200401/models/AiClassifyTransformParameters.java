// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class AiClassifyTransformParameters extends TeaModel {
    /**
     * <p>The input text field.</p>
     */
    @NameInMap("InputField")
    public AiTransformField inputField;

    /**
     * <p>The classification constraints provided to the model, such as priority rules or how to categorize uncertain cases. If left empty, classification is performed based on Labels only.</p>
     * 
     * <strong>example:</strong>
     * <p>Classify as bug when crash or exception is mentioned, classify as other when uncertain</p>
     */
    @NameInMap("Instruction")
    public String instruction;

    /**
     * <p>The candidate classification labels. The classification result must fall within this list. Specify at least two labels.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;bug&quot;,&quot;feature&quot;,&quot;question&quot;,&quot;other&quot;]</p>
     */
    @NameInMap("Labels")
    public java.util.List<String> labels;

    /**
     * <p>The output mode. Valid values: single: single-label. multi: multi-label. Default value: single.</p>
     * 
     * <strong>example:</strong>
     * <p>single</p>
     */
    @NameInMap("OutputMode")
    public String outputMode;

    /**
     * <p>The field name in the CloudEvent to which the output is attached. Default value: transform0.</p>
     * 
     * <strong>example:</strong>
     * <p>classify_result</p>
     */
    @NameInMap("StepName")
    public String stepName;

    public static AiClassifyTransformParameters build(java.util.Map<String, ?> map) throws Exception {
        AiClassifyTransformParameters self = new AiClassifyTransformParameters();
        return TeaModel.build(map, self);
    }

    public AiClassifyTransformParameters setInputField(AiTransformField inputField) {
        this.inputField = inputField;
        return this;
    }
    public AiTransformField getInputField() {
        return this.inputField;
    }

    public AiClassifyTransformParameters setInstruction(String instruction) {
        this.instruction = instruction;
        return this;
    }
    public String getInstruction() {
        return this.instruction;
    }

    public AiClassifyTransformParameters setLabels(java.util.List<String> labels) {
        this.labels = labels;
        return this;
    }
    public java.util.List<String> getLabels() {
        return this.labels;
    }

    public AiClassifyTransformParameters setOutputMode(String outputMode) {
        this.outputMode = outputMode;
        return this;
    }
    public String getOutputMode() {
        return this.outputMode;
    }

    public AiClassifyTransformParameters setStepName(String stepName) {
        this.stepName = stepName;
        return this;
    }
    public String getStepName() {
        return this.stepName;
    }

}
