// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageprocess20200320.models;

import com.aliyun.tea.*;

public class DetectCovid19CadResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public DetectCovid19CadResponseData data;

    public static DetectCovid19CadResponse build(java.util.Map<String, ?> map) throws Exception {
        DetectCovid19CadResponse self = new DetectCovid19CadResponse();
        return TeaModel.build(map, self);
    }

    public DetectCovid19CadResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DetectCovid19CadResponse setData(DetectCovid19CadResponseData data) {
        this.data = data;
        return this;
    }
    public DetectCovid19CadResponseData getData() {
        return this.data;
    }

    public static class DetectCovid19CadResponseData extends TeaModel {
        @NameInMap("NewProbability")
        @Validation(required = true)
        public String newProbability;

        @NameInMap("NormalProbability")
        @Validation(required = true)
        public String normalProbability;

        @NameInMap("OtherProbability")
        @Validation(required = true)
        public String otherProbability;

        @NameInMap("LesionRatio")
        @Validation(required = true)
        public String lesionRatio;

        @NameInMap("Mask")
        @Validation(required = true)
        public String mask;

        public static DetectCovid19CadResponseData build(java.util.Map<String, ?> map) throws Exception {
            DetectCovid19CadResponseData self = new DetectCovid19CadResponseData();
            return TeaModel.build(map, self);
        }

        public DetectCovid19CadResponseData setNewProbability(String newProbability) {
            this.newProbability = newProbability;
            return this;
        }
        public String getNewProbability() {
            return this.newProbability;
        }

        public DetectCovid19CadResponseData setNormalProbability(String normalProbability) {
            this.normalProbability = normalProbability;
            return this;
        }
        public String getNormalProbability() {
            return this.normalProbability;
        }

        public DetectCovid19CadResponseData setOtherProbability(String otherProbability) {
            this.otherProbability = otherProbability;
            return this;
        }
        public String getOtherProbability() {
            return this.otherProbability;
        }

        public DetectCovid19CadResponseData setLesionRatio(String lesionRatio) {
            this.lesionRatio = lesionRatio;
            return this;
        }
        public String getLesionRatio() {
            return this.lesionRatio;
        }

        public DetectCovid19CadResponseData setMask(String mask) {
            this.mask = mask;
            return this;
        }
        public String getMask() {
            return this.mask;
        }

    }

}
