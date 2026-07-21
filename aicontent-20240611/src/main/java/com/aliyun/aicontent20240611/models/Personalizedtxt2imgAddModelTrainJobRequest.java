// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class Personalizedtxt2imgAddModelTrainJobRequest extends TeaModel {
    /**
     * <p>A list of one or more image URLs for training. For example: [&quot;url_1&quot;, &quot;url_2&quot;, ...]</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("imageUrl")
    public java.util.List<String> imageUrl;

    /**
     * <p>The name of the model training job.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>熊猫图片生成</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>A single word that defines the object type in the training images, such as &quot;girl&quot;, &quot;person&quot;, &quot;man&quot;, &quot;boy&quot;, or &quot;dog&quot;.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dog</p>
     */
    @NameInMap("objectType")
    public String objectType;

    /**
     * <p>The number of training steps for the model training job.</p>
     * 
     * <strong>example:</strong>
     * <p>800</p>
     */
    @NameInMap("trainSteps")
    public Integer trainSteps;

    public static Personalizedtxt2imgAddModelTrainJobRequest build(java.util.Map<String, ?> map) throws Exception {
        Personalizedtxt2imgAddModelTrainJobRequest self = new Personalizedtxt2imgAddModelTrainJobRequest();
        return TeaModel.build(map, self);
    }

    public Personalizedtxt2imgAddModelTrainJobRequest setImageUrl(java.util.List<String> imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
    public java.util.List<String> getImageUrl() {
        return this.imageUrl;
    }

    public Personalizedtxt2imgAddModelTrainJobRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public Personalizedtxt2imgAddModelTrainJobRequest setObjectType(String objectType) {
        this.objectType = objectType;
        return this;
    }
    public String getObjectType() {
        return this.objectType;
    }

    public Personalizedtxt2imgAddModelTrainJobRequest setTrainSteps(Integer trainSteps) {
        this.trainSteps = trainSteps;
        return this;
    }
    public Integer getTrainSteps() {
        return this.trainSteps;
    }

}
