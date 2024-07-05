// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imm20200930.models;

import com.aliyun.tea.*;

public class DetectImageScoreResponseBody extends TeaModel {
    @NameInMap("ImageScore")
    public DetectImageScoreResponseBodyImageScore imageScore;

    /**
     * <strong>example:</strong>
     * <p>6E93D6C9-5AC0-49F9-914D-E02678D3****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DetectImageScoreResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DetectImageScoreResponseBody self = new DetectImageScoreResponseBody();
        return TeaModel.build(map, self);
    }

    public DetectImageScoreResponseBody setImageScore(DetectImageScoreResponseBodyImageScore imageScore) {
        this.imageScore = imageScore;
        return this;
    }
    public DetectImageScoreResponseBodyImageScore getImageScore() {
        return this.imageScore;
    }

    public DetectImageScoreResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DetectImageScoreResponseBodyImageScore extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0.6</p>
         */
        @NameInMap("OverallQualityScore")
        public Float overallQualityScore;

        public static DetectImageScoreResponseBodyImageScore build(java.util.Map<String, ?> map) throws Exception {
            DetectImageScoreResponseBodyImageScore self = new DetectImageScoreResponseBodyImageScore();
            return TeaModel.build(map, self);
        }

        public DetectImageScoreResponseBodyImageScore setOverallQualityScore(Float overallQualityScore) {
            this.overallQualityScore = overallQualityScore;
            return this;
        }
        public Float getOverallQualityScore() {
            return this.overallQualityScore;
        }

    }

}
