// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class AiPrepSearchTransformParameters extends TeaModel {
    /**
     * <p>The input text field.</p>
     */
    @NameInMap("InputField")
    public AiTransformField inputField;

    /**
     * <p>The maximum number of chunks. Valid values: 1 to 1000. Default value: 20.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("MaxChunkSize")
    public Integer maxChunkSize;

    /**
     * <p>The field name attached to the CloudEvent for output. Default value: transform0.</p>
     * 
     * <strong>example:</strong>
     * <p>chunks</p>
     */
    @NameInMap("StepName")
    public String stepName;

    public static AiPrepSearchTransformParameters build(java.util.Map<String, ?> map) throws Exception {
        AiPrepSearchTransformParameters self = new AiPrepSearchTransformParameters();
        return TeaModel.build(map, self);
    }

    public AiPrepSearchTransformParameters setInputField(AiTransformField inputField) {
        this.inputField = inputField;
        return this;
    }
    public AiTransformField getInputField() {
        return this.inputField;
    }

    public AiPrepSearchTransformParameters setMaxChunkSize(Integer maxChunkSize) {
        this.maxChunkSize = maxChunkSize;
        return this;
    }
    public Integer getMaxChunkSize() {
        return this.maxChunkSize;
    }

    public AiPrepSearchTransformParameters setStepName(String stepName) {
        this.stepName = stepName;
        return this;
    }
    public String getStepName() {
        return this.stepName;
    }

}
