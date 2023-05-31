// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageprocess20200320.models;

import com.aliyun.tea.*;

public class ScreenGCResponseBody extends TeaModel {
    @NameInMap("Data")
    public ScreenGCResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static ScreenGCResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ScreenGCResponseBody self = new ScreenGCResponseBody();
        return TeaModel.build(map, self);
    }

    public ScreenGCResponseBody setData(ScreenGCResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ScreenGCResponseBodyData getData() {
        return this.data;
    }

    public ScreenGCResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ScreenGCResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ScreenGCResponseBodyDataLesion extends TeaModel {
        @NameInMap("GCVolume")
        public String GCVolume;

        @NameInMap("Mask")
        public String mask;

        @NameInMap("NonGCVolume")
        public String nonGCVolume;

        @NameInMap("Probabilities")
        public String probabilities;

        @NameInMap("StomachVolume")
        public String stomachVolume;

        public static ScreenGCResponseBodyDataLesion build(java.util.Map<String, ?> map) throws Exception {
            ScreenGCResponseBodyDataLesion self = new ScreenGCResponseBodyDataLesion();
            return TeaModel.build(map, self);
        }

        public ScreenGCResponseBodyDataLesion setGCVolume(String GCVolume) {
            this.GCVolume = GCVolume;
            return this;
        }
        public String getGCVolume() {
            return this.GCVolume;
        }

        public ScreenGCResponseBodyDataLesion setMask(String mask) {
            this.mask = mask;
            return this;
        }
        public String getMask() {
            return this.mask;
        }

        public ScreenGCResponseBodyDataLesion setNonGCVolume(String nonGCVolume) {
            this.nonGCVolume = nonGCVolume;
            return this;
        }
        public String getNonGCVolume() {
            return this.nonGCVolume;
        }

        public ScreenGCResponseBodyDataLesion setProbabilities(String probabilities) {
            this.probabilities = probabilities;
            return this;
        }
        public String getProbabilities() {
            return this.probabilities;
        }

        public ScreenGCResponseBodyDataLesion setStomachVolume(String stomachVolume) {
            this.stomachVolume = stomachVolume;
            return this;
        }
        public String getStomachVolume() {
            return this.stomachVolume;
        }

    }

    public static class ScreenGCResponseBodyData extends TeaModel {
        @NameInMap("Lesion")
        public ScreenGCResponseBodyDataLesion lesion;

        public static ScreenGCResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ScreenGCResponseBodyData self = new ScreenGCResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ScreenGCResponseBodyData setLesion(ScreenGCResponseBodyDataLesion lesion) {
            this.lesion = lesion;
            return this;
        }
        public ScreenGCResponseBodyDataLesion getLesion() {
            return this.lesion;
        }

    }

}
