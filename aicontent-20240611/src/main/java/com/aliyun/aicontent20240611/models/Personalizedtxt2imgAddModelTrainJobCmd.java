// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aicontent20240611.models;

import com.aliyun.tea.*;

public class Personalizedtxt2imgAddModelTrainJobCmd extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("imageUrl")
    public java.util.List<String> imageUrl;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>熊猫图片生成</p>
     */
    @NameInMap("name")
    public String name;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>dog</p>
     */
    @NameInMap("objectType")
    public String objectType;

    public static Personalizedtxt2imgAddModelTrainJobCmd build(java.util.Map<String, ?> map) throws Exception {
        Personalizedtxt2imgAddModelTrainJobCmd self = new Personalizedtxt2imgAddModelTrainJobCmd();
        return TeaModel.build(map, self);
    }

    public Personalizedtxt2imgAddModelTrainJobCmd setImageUrl(java.util.List<String> imageUrl) {
        this.imageUrl = imageUrl;
        return this;
    }
    public java.util.List<String> getImageUrl() {
        return this.imageUrl;
    }

    public Personalizedtxt2imgAddModelTrainJobCmd setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public Personalizedtxt2imgAddModelTrainJobCmd setObjectType(String objectType) {
        this.objectType = objectType;
        return this;
    }
    public String getObjectType() {
        return this.objectType;
    }

}
