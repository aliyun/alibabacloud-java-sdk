// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class AiSentimentAnalysisTransformParameters extends TeaModel {
    /**
     * <p>Performs emotion analysis on each specified aspect separately. If left empty, performs overall emotion analysis on the entire text.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;price&quot;,&quot;logistics&quot;,&quot;customer service&quot;]</p>
     */
    @NameInMap("Aspects")
    public java.util.List<String> aspects;

    /**
     * <p>The input text field.</p>
     */
    @NameInMap("InputField")
    public AiTransformField inputField;

    /**
     * <p>The field name attached to the CloudEvent for output. Default value: transform0.</p>
     * 
     * <strong>example:</strong>
     * <p>sentiment</p>
     */
    @NameInMap("StepName")
    public String stepName;

    public static AiSentimentAnalysisTransformParameters build(java.util.Map<String, ?> map) throws Exception {
        AiSentimentAnalysisTransformParameters self = new AiSentimentAnalysisTransformParameters();
        return TeaModel.build(map, self);
    }

    public AiSentimentAnalysisTransformParameters setAspects(java.util.List<String> aspects) {
        this.aspects = aspects;
        return this;
    }
    public java.util.List<String> getAspects() {
        return this.aspects;
    }

    public AiSentimentAnalysisTransformParameters setInputField(AiTransformField inputField) {
        this.inputField = inputField;
        return this;
    }
    public AiTransformField getInputField() {
        return this.inputField;
    }

    public AiSentimentAnalysisTransformParameters setStepName(String stepName) {
        this.stepName = stepName;
        return this;
    }
    public String getStepName() {
        return this.stepName;
    }

}
