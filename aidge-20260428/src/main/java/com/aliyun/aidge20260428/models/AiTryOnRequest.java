// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.aidge20260428.models;

import com.aliyun.tea.*;

public class AiTryOnRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://example.com/cloth.png">https://example.com/cloth.png</a></p>
     */
    @NameInMap("ClothImageUrl")
    public String clothImageUrl;

    /**
     * <strong>example:</strong>
     * <p>tops</p>
     */
    @NameInMap("ClothType")
    public String clothType;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="https://example.com/model.png">https://example.com/model.png</a></p>
     */
    @NameInMap("ModelImageUrl")
    public String modelImageUrl;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1K</p>
     */
    @NameInMap("Resolution")
    public String resolution;

    public static AiTryOnRequest build(java.util.Map<String, ?> map) throws Exception {
        AiTryOnRequest self = new AiTryOnRequest();
        return TeaModel.build(map, self);
    }

    public AiTryOnRequest setClothImageUrl(String clothImageUrl) {
        this.clothImageUrl = clothImageUrl;
        return this;
    }
    public String getClothImageUrl() {
        return this.clothImageUrl;
    }

    public AiTryOnRequest setClothType(String clothType) {
        this.clothType = clothType;
        return this;
    }
    public String getClothType() {
        return this.clothType;
    }

    public AiTryOnRequest setModelImageUrl(String modelImageUrl) {
        this.modelImageUrl = modelImageUrl;
        return this;
    }
    public String getModelImageUrl() {
        return this.modelImageUrl;
    }

    public AiTryOnRequest setResolution(String resolution) {
        this.resolution = resolution;
        return this;
    }
    public String getResolution() {
        return this.resolution;
    }

}
