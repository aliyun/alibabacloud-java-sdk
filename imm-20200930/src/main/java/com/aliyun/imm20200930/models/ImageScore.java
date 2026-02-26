// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class ImageScore extends TeaModel {
    /**
     * <p>The score for the overall image quality. The image is automatically evaluated by AI. The evaluation is mainly based on subjective aesthetics and is affected by various factors, such as composition, brightness, contrast, color, and definition.</p>
     * <p>Valid values: 0 to 1. A higher value indicates better quality.</p>
     * 
     * <strong>example:</strong>
     * <p>0.736</p>
     */
    @NameInMap("OverallQualityScore")
    public Float overallQualityScore;

    public static ImageScore build(java.util.Map<String, ?> map) throws Exception {
        ImageScore self = new ImageScore();
        return TeaModel.build(map, self);
    }

    public ImageScore setOverallQualityScore(Float overallQualityScore) {
        this.overallQualityScore = overallQualityScore;
        return this;
    }
    public Float getOverallQualityScore() {
        return this.overallQualityScore;
    }

}
