// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class AiEmbedTransformParameters extends TeaModel {
    /**
     * <p>The vector dimensions. Must be a dimension supported by the selected model. If not specified, the default value of the model is used (1024 for most models, 1536 for v1/v2/async).</p>
     * 
     * <strong>example:</strong>
     * <p>1024</p>
     */
    @NameInMap("Dimension")
    public Integer dimension;

    /**
     * <p>The input text field.</p>
     */
    @NameInMap("InputField")
    public AiTransformField inputField;

    /**
     * <p>The embedding model. Default value: text-embedding-v4.</p>
     * 
     * <strong>example:</strong>
     * <p>text-embedding-v4</p>
     */
    @NameInMap("Model")
    public String model;

    /**
     * <p>The field name in the CloudEvent to which the output is attached. Default value: transform0.</p>
     * 
     * <strong>example:</strong>
     * <p>embedding</p>
     */
    @NameInMap("StepName")
    public String stepName;

    public static AiEmbedTransformParameters build(java.util.Map<String, ?> map) throws Exception {
        AiEmbedTransformParameters self = new AiEmbedTransformParameters();
        return TeaModel.build(map, self);
    }

    public AiEmbedTransformParameters setDimension(Integer dimension) {
        this.dimension = dimension;
        return this;
    }
    public Integer getDimension() {
        return this.dimension;
    }

    public AiEmbedTransformParameters setInputField(AiTransformField inputField) {
        this.inputField = inputField;
        return this;
    }
    public AiTransformField getInputField() {
        return this.inputField;
    }

    public AiEmbedTransformParameters setModel(String model) {
        this.model = model;
        return this;
    }
    public String getModel() {
        return this.model;
    }

    public AiEmbedTransformParameters setStepName(String stepName) {
        this.stepName = stepName;
        return this;
    }
    public String getStepName() {
        return this.stepName;
    }

}
