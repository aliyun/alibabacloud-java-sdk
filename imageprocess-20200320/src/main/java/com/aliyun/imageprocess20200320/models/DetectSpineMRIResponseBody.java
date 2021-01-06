// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageprocess20200320.models;

import com.aliyun.tea.*;

public class DetectSpineMRIResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Data")
    public DetectSpineMRIResponseBodyData data;

    public static DetectSpineMRIResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DetectSpineMRIResponseBody self = new DetectSpineMRIResponseBody();
        return TeaModel.build(map, self);
    }

    public DetectSpineMRIResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DetectSpineMRIResponseBody setData(DetectSpineMRIResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DetectSpineMRIResponseBodyData getData() {
        return this.data;
    }

    public static class DetectSpineMRIResponseBodyDataDiscs extends TeaModel {
        @NameInMap("Identification")
        public String identification;

        @NameInMap("Disease")
        public String disease;

        @NameInMap("Location")
        public java.util.List<Float> location;

        public static DetectSpineMRIResponseBodyDataDiscs build(java.util.Map<String, ?> map) throws Exception {
            DetectSpineMRIResponseBodyDataDiscs self = new DetectSpineMRIResponseBodyDataDiscs();
            return TeaModel.build(map, self);
        }

        public DetectSpineMRIResponseBodyDataDiscs setIdentification(String identification) {
            this.identification = identification;
            return this;
        }
        public String getIdentification() {
            return this.identification;
        }

        public DetectSpineMRIResponseBodyDataDiscs setDisease(String disease) {
            this.disease = disease;
            return this;
        }
        public String getDisease() {
            return this.disease;
        }

        public DetectSpineMRIResponseBodyDataDiscs setLocation(java.util.List<Float> location) {
            this.location = location;
            return this;
        }
        public java.util.List<Float> getLocation() {
            return this.location;
        }

    }

    public static class DetectSpineMRIResponseBodyDataVertebras extends TeaModel {
        @NameInMap("Identification")
        public String identification;

        @NameInMap("Disease")
        public String disease;

        @NameInMap("Location")
        public java.util.List<Float> location;

        public static DetectSpineMRIResponseBodyDataVertebras build(java.util.Map<String, ?> map) throws Exception {
            DetectSpineMRIResponseBodyDataVertebras self = new DetectSpineMRIResponseBodyDataVertebras();
            return TeaModel.build(map, self);
        }

        public DetectSpineMRIResponseBodyDataVertebras setIdentification(String identification) {
            this.identification = identification;
            return this;
        }
        public String getIdentification() {
            return this.identification;
        }

        public DetectSpineMRIResponseBodyDataVertebras setDisease(String disease) {
            this.disease = disease;
            return this;
        }
        public String getDisease() {
            return this.disease;
        }

        public DetectSpineMRIResponseBodyDataVertebras setLocation(java.util.List<Float> location) {
            this.location = location;
            return this;
        }
        public java.util.List<Float> getLocation() {
            return this.location;
        }

    }

    public static class DetectSpineMRIResponseBodyData extends TeaModel {
        @NameInMap("Discs")
        public java.util.List<DetectSpineMRIResponseBodyDataDiscs> discs;

        @NameInMap("Vertebras")
        public java.util.List<DetectSpineMRIResponseBodyDataVertebras> vertebras;

        public static DetectSpineMRIResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DetectSpineMRIResponseBodyData self = new DetectSpineMRIResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DetectSpineMRIResponseBodyData setDiscs(java.util.List<DetectSpineMRIResponseBodyDataDiscs> discs) {
            this.discs = discs;
            return this;
        }
        public java.util.List<DetectSpineMRIResponseBodyDataDiscs> getDiscs() {
            return this.discs;
        }

        public DetectSpineMRIResponseBodyData setVertebras(java.util.List<DetectSpineMRIResponseBodyDataVertebras> vertebras) {
            this.vertebras = vertebras;
            return this;
        }
        public java.util.List<DetectSpineMRIResponseBodyDataVertebras> getVertebras() {
            return this.vertebras;
        }

    }

}
