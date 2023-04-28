// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageprocess20200320.models;

import com.aliyun.tea.*;

public class DetectPancResponseBody extends TeaModel {
    @NameInMap("Data")
    public DetectPancResponseBodyData data;

    /**
     * <p>提交异步任务后的提示信息。</p>
     */
    @NameInMap("Message")
    public String message;

    @NameInMap("RequestId")
    public String requestId;

    public static DetectPancResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DetectPancResponseBody self = new DetectPancResponseBody();
        return TeaModel.build(map, self);
    }

    public DetectPancResponseBody setData(DetectPancResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DetectPancResponseBodyData getData() {
        return this.data;
    }

    public DetectPancResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DetectPancResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DetectPancResponseBodyDataLesion extends TeaModel {
        @NameInMap("Mask")
        public String mask;

        @NameInMap("NonPdacVol")
        public String nonPdacVol;

        @NameInMap("PancVol")
        public String pancVol;

        @NameInMap("PdacVol")
        public String pdacVol;

        @NameInMap("Possibilities")
        public java.util.List<String> possibilities;

        public static DetectPancResponseBodyDataLesion build(java.util.Map<String, ?> map) throws Exception {
            DetectPancResponseBodyDataLesion self = new DetectPancResponseBodyDataLesion();
            return TeaModel.build(map, self);
        }

        public DetectPancResponseBodyDataLesion setMask(String mask) {
            this.mask = mask;
            return this;
        }
        public String getMask() {
            return this.mask;
        }

        public DetectPancResponseBodyDataLesion setNonPdacVol(String nonPdacVol) {
            this.nonPdacVol = nonPdacVol;
            return this;
        }
        public String getNonPdacVol() {
            return this.nonPdacVol;
        }

        public DetectPancResponseBodyDataLesion setPancVol(String pancVol) {
            this.pancVol = pancVol;
            return this;
        }
        public String getPancVol() {
            return this.pancVol;
        }

        public DetectPancResponseBodyDataLesion setPdacVol(String pdacVol) {
            this.pdacVol = pdacVol;
            return this;
        }
        public String getPdacVol() {
            return this.pdacVol;
        }

        public DetectPancResponseBodyDataLesion setPossibilities(java.util.List<String> possibilities) {
            this.possibilities = possibilities;
            return this;
        }
        public java.util.List<String> getPossibilities() {
            return this.possibilities;
        }

    }

    public static class DetectPancResponseBodyData extends TeaModel {
        @NameInMap("Lesion")
        public DetectPancResponseBodyDataLesion lesion;

        public static DetectPancResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DetectPancResponseBodyData self = new DetectPancResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DetectPancResponseBodyData setLesion(DetectPancResponseBodyDataLesion lesion) {
            this.lesion = lesion;
            return this;
        }
        public DetectPancResponseBodyDataLesion getLesion() {
            return this.lesion;
        }

    }

}
