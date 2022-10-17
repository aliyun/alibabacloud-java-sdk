// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageprocess20200320.models;

import com.aliyun.tea.*;

public class ScreenECResponseBody extends TeaModel {
    @NameInMap("Data")
    public ScreenECResponseBodyData data;

    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static ScreenECResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ScreenECResponseBody self = new ScreenECResponseBody();
        return TeaModel.build(map, self);
    }

    public ScreenECResponseBody setData(ScreenECResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ScreenECResponseBodyData getData() {
        return this.data;
    }

    public ScreenECResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ScreenECResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class ScreenECResponseBodyDataLesion extends TeaModel {
        @NameInMap("BenignVolume")
        public String benignVolume;

        @NameInMap("EcVolume")
        public String ecVolume;

        @NameInMap("EsoVolume")
        public String esoVolume;

        @NameInMap("Mask")
        public String mask;

        @NameInMap("Possibilities")
        public java.util.List<String> possibilities;

        public static ScreenECResponseBodyDataLesion build(java.util.Map<String, ?> map) throws Exception {
            ScreenECResponseBodyDataLesion self = new ScreenECResponseBodyDataLesion();
            return TeaModel.build(map, self);
        }

        public ScreenECResponseBodyDataLesion setBenignVolume(String benignVolume) {
            this.benignVolume = benignVolume;
            return this;
        }
        public String getBenignVolume() {
            return this.benignVolume;
        }

        public ScreenECResponseBodyDataLesion setEcVolume(String ecVolume) {
            this.ecVolume = ecVolume;
            return this;
        }
        public String getEcVolume() {
            return this.ecVolume;
        }

        public ScreenECResponseBodyDataLesion setEsoVolume(String esoVolume) {
            this.esoVolume = esoVolume;
            return this;
        }
        public String getEsoVolume() {
            return this.esoVolume;
        }

        public ScreenECResponseBodyDataLesion setMask(String mask) {
            this.mask = mask;
            return this;
        }
        public String getMask() {
            return this.mask;
        }

        public ScreenECResponseBodyDataLesion setPossibilities(java.util.List<String> possibilities) {
            this.possibilities = possibilities;
            return this;
        }
        public java.util.List<String> getPossibilities() {
            return this.possibilities;
        }

    }

    public static class ScreenECResponseBodyData extends TeaModel {
        @NameInMap("Lesion")
        public ScreenECResponseBodyDataLesion lesion;

        public static ScreenECResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ScreenECResponseBodyData self = new ScreenECResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ScreenECResponseBodyData setLesion(ScreenECResponseBodyDataLesion lesion) {
            this.lesion = lesion;
            return this;
        }
        public ScreenECResponseBodyDataLesion getLesion() {
            return this.lesion;
        }

    }

}
