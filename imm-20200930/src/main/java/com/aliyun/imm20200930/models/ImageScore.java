// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class ImageScore extends TeaModel {
    // OverallQualityScore
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
