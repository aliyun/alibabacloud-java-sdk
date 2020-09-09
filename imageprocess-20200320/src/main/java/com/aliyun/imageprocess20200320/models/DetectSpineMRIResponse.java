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

    public DetectSpineMRIResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DetectSpineMRIResponse setData(DetectSpineMRIResponseData data) {
        this.data = data;
        return this;
    }
    public DetectSpineMRIResponseData getData() {
        return this.data;
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
        public java.util.List<Float> location;

        public static DetectSpineMRIResponseDataDiscs build(java.util.Map<String, ?> map) throws Exception {
            DetectSpineMRIResponseDataDiscs self = new DetectSpineMRIResponseDataDiscs();
            return TeaModel.build(map, self);
        }

        public DetectSpineMRIResponseDataDiscs setDisease(String disease) {
            this.disease = disease;
            return this;
        }
        public String getDisease() {
            return this.disease;
        }

        public DetectSpineMRIResponseDataDiscs setIdentification(String identification) {
            this.identification = identification;
            return this;
        }
        public String getIdentification() {
            return this.identification;
        }

        public DetectSpineMRIResponseDataDiscs setLocation(java.util.List<Float> location) {
            this.location = location;
            return this;
        }
        public java.util.List<Float> getLocation() {
            return this.location;
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
        public java.util.List<Float> location;

        public static DetectSpineMRIResponseDataVertebras build(java.util.Map<String, ?> map) throws Exception {
            DetectSpineMRIResponseDataVertebras self = new DetectSpineMRIResponseDataVertebras();
            return TeaModel.build(map, self);
        }

        public DetectSpineMRIResponseDataVertebras setDisease(String disease) {
            this.disease = disease;
            return this;
        }
        public String getDisease() {
            return this.disease;
        }

        public DetectSpineMRIResponseDataVertebras setIdentification(String identification) {
            this.identification = identification;
            return this;
        }
        public String getIdentification() {
            return this.identification;
        }

        public DetectSpineMRIResponseDataVertebras setLocation(java.util.List<Float> location) {
            this.location = location;
            return this;
        }
        public java.util.List<Float> getLocation() {
            return this.location;
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

        public DetectSpineMRIResponseData setDiscs(java.util.List<DetectSpineMRIResponseDataDiscs> discs) {
            this.discs = discs;
            return this;
        }
        public java.util.List<DetectSpineMRIResponseDataDiscs> getDiscs() {
            return this.discs;
        }

        public DetectSpineMRIResponseData setVertebras(java.util.List<DetectSpineMRIResponseDataVertebras> vertebras) {
            this.vertebras = vertebras;
            return this;
        }
        public java.util.List<DetectSpineMRIResponseDataVertebras> getVertebras() {
            return this.vertebras;
        }

    }

}
