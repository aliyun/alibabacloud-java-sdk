// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageprocess20200320.models;

import com.aliyun.tea.*;

public class DetectCovid19CadResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public DetectCovid19CadResponseBodyData data;

    public static DetectCovid19CadResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DetectCovid19CadResponseBody self = new DetectCovid19CadResponseBody();
        return TeaModel.build(map, self);
    }

    public DetectCovid19CadResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DetectCovid19CadResponseBody setData(DetectCovid19CadResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DetectCovid19CadResponseBodyData getData() {
        return this.data;
    }

    public static class DetectCovid19CadResponseBodyData extends TeaModel {
        @NameInMap("NormalProbability")
        public String normalProbability;

        @NameInMap("NewProbability")
        public String newProbability;

        @NameInMap("LesionRatio")
        public String lesionRatio;

        @NameInMap("OtherProbability")
        public String otherProbability;

        @NameInMap("Mask")
        public String mask;

        public static DetectCovid19CadResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DetectCovid19CadResponseBodyData self = new DetectCovid19CadResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DetectCovid19CadResponseBodyData setNormalProbability(String normalProbability) {
            this.normalProbability = normalProbability;
            return this;
        }
        public String getNormalProbability() {
            return this.normalProbability;
        }

        public DetectCovid19CadResponseBodyData setNewProbability(String newProbability) {
            this.newProbability = newProbability;
            return this;
        }
        public String getNewProbability() {
            return this.newProbability;
        }

        public DetectCovid19CadResponseBodyData setLesionRatio(String lesionRatio) {
            this.lesionRatio = lesionRatio;
            return this;
        }
        public String getLesionRatio() {
            return this.lesionRatio;
        }

        public DetectCovid19CadResponseBodyData setOtherProbability(String otherProbability) {
            this.otherProbability = otherProbability;
            return this;
        }
        public String getOtherProbability() {
            return this.otherProbability;
        }

        public DetectCovid19CadResponseBodyData setMask(String mask) {
            this.mask = mask;
            return this;
        }
        public String getMask() {
            return this.mask;
        }

    }

}
