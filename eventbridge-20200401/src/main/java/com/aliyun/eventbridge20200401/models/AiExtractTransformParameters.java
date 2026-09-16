// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class AiExtractTransformParameters extends TeaModel {
    /**
     * <p>The JSON Schema of the extraction results. Pass a serialized JSON object string or JSON Schema text.</p>
     * 
     * <strong>example:</strong>
     * <p>{&quot;type&quot;:&quot;object&quot;,&quot;properties&quot;:{&quot;orderId&quot;:{&quot;type&quot;:&quot;string&quot;},&quot;amount&quot;:{&quot;type&quot;:&quot;number&quot;}}}</p>
     */
    @NameInMap("ExtractSchema")
    public String extractSchema;

    /**
     * <p>The input text field.</p>
     */
    @NameInMap("InputField")
    public AiTransformField inputField;

    /**
     * <p>The field name attached to the CloudEvent for output. Default value: transform0.</p>
     * 
     * <strong>example:</strong>
     * <p>extract_result</p>
     */
    @NameInMap("StepName")
    public String stepName;

    public static AiExtractTransformParameters build(java.util.Map<String, ?> map) throws Exception {
        AiExtractTransformParameters self = new AiExtractTransformParameters();
        return TeaModel.build(map, self);
    }

    public AiExtractTransformParameters setExtractSchema(String extractSchema) {
        this.extractSchema = extractSchema;
        return this;
    }
    public String getExtractSchema() {
        return this.extractSchema;
    }

    public AiExtractTransformParameters setInputField(AiTransformField inputField) {
        this.inputField = inputField;
        return this;
    }
    public AiTransformField getInputField() {
        return this.inputField;
    }

    public AiExtractTransformParameters setStepName(String stepName) {
        this.stepName = stepName;
        return this;
    }
    public String getStepName() {
        return this.stepName;
    }

}
