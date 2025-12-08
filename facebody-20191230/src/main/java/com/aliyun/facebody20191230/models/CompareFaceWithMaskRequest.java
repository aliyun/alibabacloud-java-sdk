// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.facebody20191230.models;

import com.aliyun.tea.*;

public class CompareFaceWithMaskRequest extends TeaModel {
    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ImageURLA")
    public String imageURLA;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("ImageURLB")
    public String imageURLB;

    /**
     * <strong>example:</strong>
     * <p>97.0</p>
     */
    @NameInMap("QualityScoreThreshold")
    public Float qualityScoreThreshold;

    public static CompareFaceWithMaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CompareFaceWithMaskRequest self = new CompareFaceWithMaskRequest();
        return TeaModel.build(map, self);
    }

    public CompareFaceWithMaskRequest setImageURLA(String imageURLA) {
        this.imageURLA = imageURLA;
        return this;
    }
    public String getImageURLA() {
        return this.imageURLA;
    }

    public CompareFaceWithMaskRequest setImageURLB(String imageURLB) {
        this.imageURLB = imageURLB;
        return this;
    }
    public String getImageURLB() {
        return this.imageURLB;
    }

    public CompareFaceWithMaskRequest setQualityScoreThreshold(Float qualityScoreThreshold) {
        this.qualityScoreThreshold = qualityScoreThreshold;
        return this;
    }
    public Float getQualityScoreThreshold() {
        return this.qualityScoreThreshold;
    }

}
