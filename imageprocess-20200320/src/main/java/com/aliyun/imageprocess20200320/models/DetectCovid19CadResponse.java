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

    }

}
