// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagerecog20190930.models;

import com.aliyun.tea.*;

public class RecognizeVehicleTypeResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("Data")
    @Validation(required = true)
    public RecognizeVehicleTypeResponseData data;

    public static RecognizeVehicleTypeResponse build(java.util.Map<String, ?> map) throws Exception {
        RecognizeVehicleTypeResponse self = new RecognizeVehicleTypeResponse();
        return TeaModel.build(map, self);
    }

    public static class RecognizeVehicleTypeResponseDataElements extends TeaModel {
        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("Score")
        @Validation(required = true)
        public Double score;

        public static RecognizeVehicleTypeResponseDataElements build(java.util.Map<String, ?> map) throws Exception {
            RecognizeVehicleTypeResponseDataElements self = new RecognizeVehicleTypeResponseDataElements();
            return TeaModel.build(map, self);
        }

    }

    public static class RecognizeVehicleTypeResponseData extends TeaModel {
        @NameInMap("Threshold")
        @Validation(required = true)
        public Double threshold;

        @NameInMap("Elements")
        @Validation(required = true)
        public java.util.List<RecognizeVehicleTypeResponseDataElements> elements;

        public static RecognizeVehicleTypeResponseData build(java.util.Map<String, ?> map) throws Exception {
            RecognizeVehicleTypeResponseData self = new RecognizeVehicleTypeResponseData();
            return TeaModel.build(map, self);
        }

    }

}
