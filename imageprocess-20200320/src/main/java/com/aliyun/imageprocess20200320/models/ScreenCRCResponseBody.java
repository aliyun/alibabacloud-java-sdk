// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageprocess20200320.models;

import com.aliyun.tea.*;

public class ScreenCRCResponseBody extends TeaModel {
    @NameInMap("Data")
    public ScreenCRCResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static ScreenCRCResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ScreenCRCResponseBody self = new ScreenCRCResponseBody();
        return TeaModel.build(map, self);
    }

    public ScreenCRCResponseBody setData(ScreenCRCResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ScreenCRCResponseBodyData getData() {
        return this.data;
    }

    public ScreenCRCResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ScreenCRCResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ScreenCRCResponseBodyDataLesion extends TeaModel {
        @NameInMap("CRCVolume")
        public String CRCVolume;

        @NameInMap("ColorectumVolume")
        public String colorectumVolume;

        @NameInMap("Mask")
        public String mask;

        @NameInMap("Probabilities")
        public String probabilities;

        public static ScreenCRCResponseBodyDataLesion build(java.util.Map<String, ?> map) throws Exception {
            ScreenCRCResponseBodyDataLesion self = new ScreenCRCResponseBodyDataLesion();
            return TeaModel.build(map, self);
        }

        public ScreenCRCResponseBodyDataLesion setCRCVolume(String CRCVolume) {
            this.CRCVolume = CRCVolume;
            return this;
        }
        public String getCRCVolume() {
            return this.CRCVolume;
        }

        public ScreenCRCResponseBodyDataLesion setColorectumVolume(String colorectumVolume) {
            this.colorectumVolume = colorectumVolume;
            return this;
        }
        public String getColorectumVolume() {
            return this.colorectumVolume;
        }

        public ScreenCRCResponseBodyDataLesion setMask(String mask) {
            this.mask = mask;
            return this;
        }
        public String getMask() {
            return this.mask;
        }

        public ScreenCRCResponseBodyDataLesion setProbabilities(String probabilities) {
            this.probabilities = probabilities;
            return this;
        }
        public String getProbabilities() {
            return this.probabilities;
        }

    }

    public static class ScreenCRCResponseBodyData extends TeaModel {
        @NameInMap("Lesion")
        public ScreenCRCResponseBodyDataLesion lesion;

        public static ScreenCRCResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ScreenCRCResponseBodyData self = new ScreenCRCResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ScreenCRCResponseBodyData setLesion(ScreenCRCResponseBodyDataLesion lesion) {
            this.lesion = lesion;
            return this;
        }
        public ScreenCRCResponseBodyDataLesion getLesion() {
            return this.lesion;
        }

    }

}
