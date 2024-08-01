// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class Personalizedtxt2imgAddInferenceJobCmd extends TeaModel {
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
    public Integer seed;

    public static Personalizedtxt2imgAddInferenceJobCmd build(java.util.Map<String, ?> map) throws Exception {
        Personalizedtxt2imgAddInferenceJobCmd self = new Personalizedtxt2imgAddInferenceJobCmd();
        return TeaModel.build(map, self);
    }

    public Personalizedtxt2imgAddInferenceJobCmd setImageNumber(Integer imageNumber) {
        this.imageNumber = imageNumber;
        return this;
    }
    public Integer getImageNumber() {
        return this.imageNumber;
    }

    public Personalizedtxt2imgAddInferenceJobCmd setModelId(String modelId) {
        this.modelId = modelId;
        return this;
    }
    public String getModelId() {
        return this.modelId;
    }

    public Personalizedtxt2imgAddInferenceJobCmd setPrompt(String prompt) {
        this.prompt = prompt;
        return this;
    }
    public String getPrompt() {
        return this.prompt;
    }

    public Personalizedtxt2imgAddInferenceJobCmd setSeed(Integer seed) {
        this.seed = seed;
        return this;
    }
    public Integer getSeed() {
        return this.seed;
    }

}
