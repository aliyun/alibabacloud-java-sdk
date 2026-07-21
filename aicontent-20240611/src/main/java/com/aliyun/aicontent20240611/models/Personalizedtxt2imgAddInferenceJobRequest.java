// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class Personalizedtxt2imgAddInferenceJobRequest extends TeaModel {
    /**
     * <p>The number of images to generate. Note: Due to resource limits in the test environment, you can generate up to 10 images per request. The system automatically sets values greater than 10 to 10.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("imageNumber")
    public Integer imageNumber;

    /**
     * <p>The model ID to use for the inference job.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxx-xxxx-xxxx</p>
     */
    @NameInMap("modelId")
    public String modelId;

    /**
     * <p>An English prompt describing the image to generate. Replace the subject with . For example, change &quot;a man in the snow&quot; to &quot;a in the snow&quot;, and &quot;a photo of a girl&quot; to &quot;a photo of a &quot;.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>a <special-token> in the snow</p>
     */
    @NameInMap("prompt")
    public String prompt;

    /**
     * <p>The seed for the random number generator. Using the same seed ensures reproducible results. The value must be between -1 and 2,147,483,647. If the value is outside this range or is not specified, the system automatically generates a suitable seed.</p>
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
