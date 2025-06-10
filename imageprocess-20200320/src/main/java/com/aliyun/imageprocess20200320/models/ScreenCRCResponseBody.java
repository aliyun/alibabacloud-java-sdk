// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageprocess20200320.models;

import com.aliyun.tea.*;

public class ScreenCRCResponseBody extends TeaModel {
    @NameInMap("Data")
    public ScreenCRCResponseBodyData data;

    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>39C848F7-D814-1A06-AE0D-AFC706B9700F</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>7.83</p>
         */
        @NameInMap("CRCVolume")
        public String CRCVolume;

        /**
         * <strong>example:</strong>
         * <p>255.93</p>
         */
        @NameInMap("ColorectumVolume")
        public String colorectumVolume;

        /**
         * <strong>example:</strong>
         * <p><a href="http://vibktprfx-prod-prod-aic-med-cn-shanghai.oss-cn-shanghai.aliyuncs.com/screen_crc/crc_case2_pre.nii.gz?Expires=1680766116&OSSAccessKeyId=LTAI4GC2dJzdf8ZvnC16MFC7&Signature=9n9C%2B2MnyvLwAC%2FwFyxgY">http://vibktprfx-prod-prod-aic-med-cn-shanghai.oss-cn-shanghai.aliyuncs.com/screen_crc/crc_case2_pre.nii.gz?Expires=1680766116&amp;OSSAccessKeyId=LTAI4GC2dJzdf8ZvnC16MFC7&amp;Signature=9n9C%2B2MnyvLwAC%2FwFyxgY</a>********</p>
         */
        @NameInMap("Mask")
        public String mask;

        /**
         * <strong>example:</strong>
         * <p>0.0779, 0.9221</p>
         */
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
