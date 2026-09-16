// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.eventbridge20200401.models;

import com.aliyun.tea.*;

public class AiRedactTransformParameters extends TeaModel {
    /**
     * <p>The entity types to identify and mask in the text, such as phone numbers, ID card numbers, and email addresses.</p>
     * 
     * <strong>example:</strong>
     * <p>[&quot;PHONE&quot;,&quot;ID_CARD&quot;,&quot;EMAIL&quot;]</p>
     */
    @NameInMap("Entities")
    public java.util.List<String> entities;

    /**
     * <p>The input text field.</p>
     */
    @NameInMap("InputField")
    public AiTransformField inputField;

    /**
     * <p>The mask character used in mask mode. Default value: *.</p>
     * 
     * <strong>example:</strong>
     * <ul>
     * <li></li>
     * </ul>
     */
    @NameInMap("MaskChar")
    public String maskChar;

    /**
     * <p>The masking mode. Valid values: mask, replace, and remove.</p>
     * 
     * <strong>example:</strong>
     * <p>mask</p>
     */
    @NameInMap("Mode")
    public String mode;

    /**
     * <p>The field name appended to the CloudEvent for output. Default value: transform0.</p>
     * 
     * <strong>example:</strong>
     * <p>redact_result</p>
     */
    @NameInMap("StepName")
    public String stepName;

    public static AiRedactTransformParameters build(java.util.Map<String, ?> map) throws Exception {
        AiRedactTransformParameters self = new AiRedactTransformParameters();
        return TeaModel.build(map, self);
    }

    public AiRedactTransformParameters setEntities(java.util.List<String> entities) {
        this.entities = entities;
        return this;
    }
    public java.util.List<String> getEntities() {
        return this.entities;
    }

    public AiRedactTransformParameters setInputField(AiTransformField inputField) {
        this.inputField = inputField;
        return this;
    }
    public AiTransformField getInputField() {
        return this.inputField;
    }

    public AiRedactTransformParameters setMaskChar(String maskChar) {
        this.maskChar = maskChar;
        return this;
    }
    public String getMaskChar() {
        return this.maskChar;
    }

    public AiRedactTransformParameters setMode(String mode) {
        this.mode = mode;
        return this;
    }
    public String getMode() {
        return this.mode;
    }

    public AiRedactTransformParameters setStepName(String stepName) {
        this.stepName = stepName;
        return this;
    }
    public String getStepName() {
        return this.stepName;
    }

}
