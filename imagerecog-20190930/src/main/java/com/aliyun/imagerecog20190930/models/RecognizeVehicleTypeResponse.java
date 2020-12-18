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

    public RecognizeVehicleTypeResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RecognizeVehicleTypeResponse setData(RecognizeVehicleTypeResponseData data) {
        this.data = data;
        return this;
    }
    public RecognizeVehicleTypeResponseData getData() {
        return this.data;
    }

    public static class RecognizeVehicleTypeResponseDataElements extends TeaModel {
        @NameInMap("Name")
        @Validation(required = true)
        public String name;

        @NameInMap("Score")
        @Validation(required = true)
        public Float score;

        public static RecognizeVehicleTypeResponseDataElements build(java.util.Map<String, ?> map) throws Exception {
            RecognizeVehicleTypeResponseDataElements self = new RecognizeVehicleTypeResponseDataElements();
            return TeaModel.build(map, self);
        }

        public RecognizeVehicleTypeResponseDataElements setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public RecognizeVehicleTypeResponseDataElements setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

    }

    public static class RecognizeVehicleTypeResponseData extends TeaModel {
        @NameInMap("Threshold")
        @Validation(required = true)
        public Float threshold;

        @NameInMap("Elements")
        @Validation(required = true)
        public java.util.List<RecognizeVehicleTypeResponseDataElements> elements;

        public static RecognizeVehicleTypeResponseData build(java.util.Map<String, ?> map) throws Exception {
            RecognizeVehicleTypeResponseData self = new RecognizeVehicleTypeResponseData();
            return TeaModel.build(map, self);
        }

        public RecognizeVehicleTypeResponseData setThreshold(Float threshold) {
            this.threshold = threshold;
            return this;
        }
        public Float getThreshold() {
            return this.threshold;
        }

        public RecognizeVehicleTypeResponseData setElements(java.util.List<RecognizeVehicleTypeResponseDataElements> elements) {
            this.elements = elements;
            return this;
        }
        public java.util.List<RecognizeVehicleTypeResponseDataElements> getElements() {
            return this.elements;
        }

    }

}
