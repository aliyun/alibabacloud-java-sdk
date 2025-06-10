// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageprocess20200320.models;

import com.aliyun.tea.*;

public class DetectPancResponseBody extends TeaModel {
    @NameInMap("Data")
    public DetectPancResponseBodyData data;

    /**
     * <p>提交异步任务后的提示信息。</p>
     * 
     * <strong>example:</strong>
     * <p>该调用为异步调用，任务已提交成功，请以requestId的值作为jobId参数调用同类目下GetAsyncJobResult接口查询任务执行状态和结果。</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>CA1C672A-4F85-1CD9-893D-3434C924C4B2</p>
     */
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
        /**
         * <strong>example:</strong>
         * <p><a href="http://vibktprfx-prod-prod-aic-med-cn-shanghai.oss-cn-shanghai.aliyuncs.com/screen-pdac/2022-05-25_14%3A33%3A30/4CA2BF25-BCDB-9C6C-B14C-EB41E8266588.nii.gz?Expires=1653462210&OSSAccessKeyId=LTAI4FoLmvQ9urWXgSR****&Signature=8t%2FknUrQyyyCU2p7QhMC%2BXBCR">http://vibktprfx-prod-prod-aic-med-cn-shanghai.oss-cn-shanghai.aliyuncs.com/screen-pdac/2022-05-25_14%3A33%3A30/4CA2BF25-BCDB-9C6C-B14C-EB41E8266588.nii.gz?Expires=1653462210&amp;OSSAccessKeyId=LTAI4FoLmvQ9urWXgSR****&amp;Signature=8t%2FknUrQyyyCU2p7QhMC%2BXBCR</a>****</p>
         */
        @NameInMap("Mask")
        public String mask;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("NonPdacVol")
        public String nonPdacVol;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("PancVol")
        public String pancVol;

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
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
