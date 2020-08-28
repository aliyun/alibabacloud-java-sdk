// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageprocess20200320.models;

import com.aliyun.tea.*;

public class DetectSpineMRIResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public DetectSpineMRIResponseData data;

    public static DetectSpineMRIResponse build(java.util.Map<String, ?> map) throws Exception {
        DetectSpineMRIResponse self = new DetectSpineMRIResponse();
        return TeaModel.build(map, self);
    }

    public static class DetectSpineMRIResponseDataDiscs extends TeaModel {
        @NameInMap("Disease")
        @Validation(required = true)
        public String disease;

        @NameInMap("Identification")
        @Validation(required = true)
        public String identification;

        @NameInMap("Location")
        @Validation(required = true)
        public java.util.List<Double> location;

        public static DetectSpineMRIResponseDataDiscs build(java.util.Map<String, ?> map) throws Exception {
            DetectSpineMRIResponseDataDiscs self = new DetectSpineMRIResponseDataDiscs();
            return TeaModel.build(map, self);
        }

    }

    public static class DetectSpineMRIResponseDataVertebras extends TeaModel {
        @NameInMap("Disease")
        @Validation(required = true)
        public String disease;

        @NameInMap("Identification")
        @Validation(required = true)
        public String identification;

        @NameInMap("Location")
        @Validation(required = true)
        public java.util.List<Double> location;

        public static DetectSpineMRIResponseDataVertebras build(java.util.Map<String, ?> map) throws Exception {
            DetectSpineMRIResponseDataVertebras self = new DetectSpineMRIResponseDataVertebras();
            return TeaModel.build(map, self);
        }

    }

    public static class DetectSpineMRIResponseData extends TeaModel {
        @NameInMap("Discs")
        @Validation(required = true)
        public java.util.List<DetectSpineMRIResponseDataDiscs> discs;

        @NameInMap("Vertebras")
        @Validation(required = true)
        public java.util.List<DetectSpineMRIResponseDataVertebras> vertebras;

        public static DetectSpineMRIResponseData build(java.util.Map<String, ?> map) throws Exception {
            DetectSpineMRIResponseData self = new DetectSpineMRIResponseData();
            return TeaModel.build(map, self);
        }

    }

}
