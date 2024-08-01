// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class Personalizedtxt2imgAddInferenceJobRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("imageNumber")
    public Integer imageNumber;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxxx-xxxx-xxxx</p>
     */
    @NameInMap("modelId")
    public String modelId;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>a <special-token> in the snow</p>
     */
    @NameInMap("prompt")
    public String prompt;

    /**
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
