// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class Personalizedtxt2imgAddInferenceJobRequest extends TeaModel {
    /**
     * <p>The number of images to generate. Note: Due to resource limits in the test environment, a maximum of 10 images can be generated at a time. If this value is greater than 10, it is treated as 10.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("imageNumber")
    public Integer imageNumber;

    /**
     * <p>The ID of the model training task. Specifies the model to use for inference.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxx-xxxx-xxxx</p>
     */
    @NameInMap("modelId")
    public String modelId;

    /**
     * <p>The English prompt that describes the image to be generated. Replace the character to be generated with <special-token>. For example, change &quot;a man in the snow&quot; to &quot;a <special-token> in the snow&quot; and &quot;a photo of a girl&quot; to &quot;a photo of a <special-token>&quot;.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>a <special-token> in the snow</p>
     */
    @NameInMap("prompt")
    public String prompt;

    /**
     * <p>The random seed. A fixed seed generates the same image and ensures the reproducibility of the results. Note: The input value must be in the range of [-1, 2147483647]. If the input value is out of this range or not provided, a suitable seed is automatically generated.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("seed")
    public Long seed;

    public static Personalizedtxt2imgAddInferenceJobRequest build(java.util.Map<String, ?> map) throws Exception {
        Personalizedtxt2imgAddInferenceJobRequest self = new Personalizedtxt2imgAddInferenceJobRequest();
        return TeaModel.build(map, self);
    }

    public Personalizedtxt2imgAddInferenceJobRequest setImageNumber(Integer imageNumber) {
        this.imageNumber = imageNumber;
        return this;
    }
    public Integer getImageNumber() {
        return this.imageNumber;
    }

    public Personalizedtxt2imgAddInferenceJobRequest setModelId(String modelId) {
        this.modelId = modelId;
        return this;
    }
    public String getModelId() {
        return this.modelId;
    }

    public Personalizedtxt2imgAddInferenceJobRequest setPrompt(String prompt) {
        this.prompt = prompt;
        return this;
    }
    public String getPrompt() {
        return this.prompt;
    }

    public Personalizedtxt2imgAddInferenceJobRequest setSeed(Long seed) {
        this.seed = seed;
        return this;
    }
    public Long getSeed() {
        return this.seed;
    }

}
