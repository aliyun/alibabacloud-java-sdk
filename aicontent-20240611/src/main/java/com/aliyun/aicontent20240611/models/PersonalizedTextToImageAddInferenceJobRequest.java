// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class PersonalizedTextToImageAddInferenceJobRequest extends TeaModel {
    /**
     * <p>The number of images to generate. Note: The maximum is 10 images per request in the test environment. If the value exceeds 10, it is treated as 10.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("imageNumber")
    public Integer imageNumber;

    /**
     * <p>An array containing one or more image URLs. For example, <code>[&quot;url_1&quot;, &quot;url_2&quot;, ...]</code>.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("imageUrl")
    public java.util.List<String> imageUrl;

    /**
     * <p>The English prompt for image generation. Use the placeholder for the subject. For example, change &quot;a man in the snow&quot; to &quot;a in the snow&quot;.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>a <special-token> in the snow</p>
     */
    @NameInMap("prompt")
    public String prompt;

    /**
     * <p>A random seed to ensure reproducible image generation. The value must be within <code>[-1, 2147483647]</code>. If the value is outside this range or omitted, the system automatically generates a seed.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("seed")
    public Long seed;

    /**
     * <p>Determines the influence of the reference image.
     * Valid values: <code>0.3</code>, <code>0.4</code>, <code>0.5</code>, <code>0.6</code>, <code>0.7</code>, and <code>0.8</code>.
     * A lower value decreases the influence of the reference image and increases the influence of the text prompt.
     * The default is <code>0.5</code>, and you typically do not need to change this value.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("strength")
    public Double strength;

    /**
     * <p>The number of training steps for the model.</p>
     * 
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
