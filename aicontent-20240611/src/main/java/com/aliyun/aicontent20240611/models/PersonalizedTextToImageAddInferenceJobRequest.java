// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class PersonalizedTextToImageAddInferenceJobRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("imageNumber")
    public Integer imageNumber;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("imageUrl")
    public java.util.List<String> imageUrl;

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

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("strength")
    public Double strength;

    /**
     * <strong>example:</strong>
     * <p>800</p>
     */
    @NameInMap("trainSteps")
    public Integer trainSteps;

    public static PersonalizedTextToImageAddInferenceJobRequest build(java.util.Map<String, ?> map) throws Exception {
        PersonalizedTextToImageAddInferenceJobRequest self = new PersonalizedTextToImageAddInferenceJobRequest();
        return TeaModel.build(map, self);
    }

    public PersonalizedTextToImageAddInferenceJobRequest setImageNumber(Integer imageNumber) {
        this.imageNumber = imageNumber;
        return this;
    }
    public Integer getImageNumber() {
        return this.imageNumber;
    }

    public PersonalizedTextToImageAddInferenceJobRequest setImageUrl(java.util.List<String> imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
    public java.util.List<String> getImageUrl() {
        return this.imageUrl;
    }

    public PersonalizedTextToImageAddInferenceJobRequest setPrompt(String prompt) {
        this.prompt = prompt;
        return this;
    }
    public String getPrompt() {
        return this.prompt;
    }

    public PersonalizedTextToImageAddInferenceJobRequest setSeed(Long seed) {
        this.seed = seed;
        return this;
    }
    public Long getSeed() {
        return this.seed;
    }

    public PersonalizedTextToImageAddInferenceJobRequest setStrength(Double strength) {
        this.strength = strength;
        return this;
    }
    public Double getStrength() {
        return this.strength;
    }

    public PersonalizedTextToImageAddInferenceJobRequest setTrainSteps(Integer trainSteps) {
        this.trainSteps = trainSteps;
        return this;
    }
    public Integer getTrainSteps() {
        return this.trainSteps;
    }

}
