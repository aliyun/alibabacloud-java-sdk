// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageprocess20200320.models;

import com.aliyun.tea.*;

public class ScreenECResponseBody extends TeaModel {
    @NameInMap("Data")
    public ScreenECResponseBodyData data;

    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>9B65AC8E-311A-1ED1-BBE6-6AA6D35D31A6</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("BenignVolume")
        public String benignVolume;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("EcVolume")
        public String ecVolume;

        /**
         * <strong>example:</strong>
         * <p>26814</p>
         */
        @NameInMap("EsoVolume")
        public String esoVolume;

        /**
         * <strong>example:</strong>
         * <p><a href="http://vibktprfx-prod-prod-aic-med-cn-shanghai.oss-cn-shanghai.aliyuncs.com/screen-pdac/2022-05-25_14%3A33%3A30/4CA2BF25-BCDB-9C6C-B14C-EB41E8266588.nii.gz?Expires=1653462210&OSSAccessKeyId=LTAI4FoLmvQ9urWXgSR****&Signature=8t%2FknUrQyyyCU2p7QhMC%2BXBCR">http://vibktprfx-prod-prod-aic-med-cn-shanghai.oss-cn-shanghai.aliyuncs.com/screen-pdac/2022-05-25_14%3A33%3A30/4CA2BF25-BCDB-9C6C-B14C-EB41E8266588.nii.gz?Expires=1653462210&amp;OSSAccessKeyId=LTAI4FoLmvQ9urWXgSR****&amp;Signature=8t%2FknUrQyyyCU2p7QhMC%2BXBCR</a>****</p>
         */
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
