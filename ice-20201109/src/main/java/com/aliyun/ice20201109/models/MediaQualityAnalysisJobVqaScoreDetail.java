// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ice20201109.models;

import com.aliyun.tea.*;

public class MediaQualityAnalysisJobVqaScoreDetail extends TeaModel {
    @NameInMap("IntensityValue")
    public Double intensityValue;

    @NameInMap("PerceptualScore")
    public Double perceptualScore;

    public static MediaQualityAnalysisJobVqaScoreDetail build(java.util.Map<String, ?> map) throws Exception {
        MediaQualityAnalysisJobVqaScoreDetail self = new MediaQualityAnalysisJobVqaScoreDetail();
        return TeaModel.build(map, self);
    }

    public MediaQualityAnalysisJobVqaScoreDetail setIntensityValue(Double intensityValue) {
        this.intensityValue = intensityValue;
        return this;
    }
    public Double getIntensityValue() {
        return this.intensityValue;
    }

    public MediaQualityAnalysisJobVqaScoreDetail setPerceptualScore(Double perceptualScore) {
        this.perceptualScore = perceptualScore;
        return this;
    }
    public Double getPerceptualScore() {
        return this.perceptualScore;
    }

}
