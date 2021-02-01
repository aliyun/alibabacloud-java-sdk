// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imagerecog20190930.models;

import com.aliyun.tea.*;

public class RecognizeVehicleTypeResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public RecognizeVehicleTypeResponseBodyData data;

    public static RecognizeVehicleTypeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        RecognizeVehicleTypeResponseBody self = new RecognizeVehicleTypeResponseBody();
        return TeaModel.build(map, self);
    }

    public RecognizeVehicleTypeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public RecognizeVehicleTypeResponseBody setData(RecognizeVehicleTypeResponseBodyData data) {
        this.data = data;
        return this;
    }
    public RecognizeVehicleTypeResponseBodyData getData() {
        return this.data;
    }

    public static class RecognizeVehicleTypeResponseBodyDataElements extends TeaModel {
        @NameInMap("Score")
        public Float score;

        @NameInMap("Name")
        public String name;

        public static RecognizeVehicleTypeResponseBodyDataElements build(java.util.Map<String, ?> map) throws Exception {
            RecognizeVehicleTypeResponseBodyDataElements self = new RecognizeVehicleTypeResponseBodyDataElements();
            return TeaModel.build(map, self);
        }

        public RecognizeVehicleTypeResponseBodyDataElements setScore(Float score) {
            this.score = score;
            return this;
        }
        public Float getScore() {
            return this.score;
        }

        public RecognizeVehicleTypeResponseBodyDataElements setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class RecognizeVehicleTypeResponseBodyData extends TeaModel {
        @NameInMap("Elements")
        public java.util.List<RecognizeVehicleTypeResponseBodyDataElements> elements;

        @NameInMap("Threshold")
        public Float threshold;

        public static RecognizeVehicleTypeResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            RecognizeVehicleTypeResponseBodyData self = new RecognizeVehicleTypeResponseBodyData();
            return TeaModel.build(map, self);
        }

        public RecognizeVehicleTypeResponseBodyData setElements(java.util.List<RecognizeVehicleTypeResponseBodyDataElements> elements) {
            this.elements = elements;
            return this;
        }
        public java.util.List<RecognizeVehicleTypeResponseBodyDataElements> getElements() {
            return this.elements;
        }

        public RecognizeVehicleTypeResponseBodyData setThreshold(Float threshold) {
            this.threshold = threshold;
            return this;
        }
        public Float getThreshold() {
            return this.threshold;
        }

    }

}
