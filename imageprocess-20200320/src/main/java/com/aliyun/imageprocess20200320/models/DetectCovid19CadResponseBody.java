// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageprocess20200320.models;

import com.aliyun.tea.*;

public class DetectCovid19CadResponseBody extends TeaModel {
    @NameInMap("Data")
    public DetectCovid19CadResponseBodyData data;

    @NameInMap("RequestId")
    public String requestId;

    public static DetectCovid19CadResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DetectCovid19CadResponseBody self = new DetectCovid19CadResponseBody();
        return TeaModel.build(map, self);
    }

    public DetectCovid19CadResponseBody setData(DetectCovid19CadResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DetectCovid19CadResponseBodyData getData() {
        return this.data;
    }

    public DetectCovid19CadResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DetectCovid19CadResponseBodyData extends TeaModel {
        @NameInMap("LesionRatio")
        public String lesionRatio;

        @NameInMap("Mask")
        public String mask;

        @NameInMap("NewProbability")
        public String newProbability;

        @NameInMap("NormalProbability")
        public String normalProbability;

        @NameInMap("OtherProbability")
        public String otherProbability;

        public static DetectCovid19CadResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DetectCovid19CadResponseBodyData self = new DetectCovid19CadResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DetectCovid19CadResponseBodyData setLesionRatio(String lesionRatio) {
            this.lesionRatio = lesionRatio;
            return this;
        }
        public String getLesionRatio() {
            return this.lesionRatio;
        }

        public DetectCovid19CadResponseBodyData setMask(String mask) {
            this.mask = mask;
            return this;
        }
        public String getMask() {
            return this.mask;
        }

        public DetectCovid19CadResponseBodyData setNewProbability(String newProbability) {
            this.newProbability = newProbability;
            return this;
        }
        public String getNewProbability() {
            return this.newProbability;
        }

        public DetectCovid19CadResponseBodyData setNormalProbability(String normalProbability) {
            this.normalProbability = normalProbability;
            return this;
        }
        public String getNormalProbability() {
            return this.normalProbability;
        }

        public DetectCovid19CadResponseBodyData setOtherProbability(String otherProbability) {
            this.otherProbability = otherProbability;
            return this;
        }
        public String getOtherProbability() {
            return this.otherProbability;
        }

    }

}
