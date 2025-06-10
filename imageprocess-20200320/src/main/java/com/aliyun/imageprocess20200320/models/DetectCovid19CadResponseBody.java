// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.imageprocess20200320.models;

import com.aliyun.tea.*;

public class DetectCovid19CadResponseBody extends TeaModel {
    @NameInMap("Data")
    public DetectCovid19CadResponseBodyData data;

    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>7CB9B663-3EF8-4C9C-A464-FDA2B5F1E3A4</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DetectCovid19CadResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DetectCovid19CadResponseBody self = new DetectCovid19CadResponseBody();
        return TeaModel.build(map, self);
    }

    public DetectCovid19CadResponseBody setData(DetectCovid19CadResponseBodyData data) {
        this.data = data;
        return this;
    }
    public DetectCovid19CadResponseBodyData getData() {
        return this.data;
    }

    public DetectCovid19CadResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DetectCovid19CadResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DetectCovid19CadResponseBodyData extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>0.9387283236994219</p>
         */
        @NameInMap("LesionRatio")
        public String lesionRatio;

        /**
         * <strong>example:</strong>
         * <p><a href="http://algo-app-aic-med-cn-shanghai-prod.oss-cn-shanghai.aliyuncs.com/covid19-dcm/unspecified/2020032702/1b1e1018-6fcf-11ea-8fa1-d20b34387541.nii.gz?Expires=1585276394&OSSAccessKeyId=LTAI4FoLmvQ9urWXgSRp****&Signature=%2F1LNGWJUqvY0VRYGgg8Ldtb3BF">http://algo-app-aic-med-cn-shanghai-prod.oss-cn-shanghai.aliyuncs.com/covid19-dcm/unspecified/2020032702/1b1e1018-6fcf-11ea-8fa1-d20b34387541.nii.gz?Expires=1585276394&amp;OSSAccessKeyId=LTAI4FoLmvQ9urWXgSRp****&amp;Signature=%2F1LNGWJUqvY0VRYGgg8Ldtb3BF</a>****</p>
         */
        @NameInMap("Mask")
        public String mask;

        /**
         * <strong>example:</strong>
         * <p>4.062644e-06</p>
         */
        @NameInMap("NewProbability")
        public String newProbability;

        /**
         * <strong>example:</strong>
         * <p>0.7230905</p>
         */
        @NameInMap("NormalProbability")
        public String normalProbability;

        /**
         * <strong>example:</strong>
         * <p>0.27690542</p>
         */
        @NameInMap("OtherProbability")
        public String otherProbability;

        public static DetectCovid19CadResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            DetectCovid19CadResponseBodyData self = new DetectCovid19CadResponseBodyData();
            return TeaModel.build(map, self);
        }

        public DetectCovid19CadResponseBodyData setLesionRatio(String lesionRatio) {
            this.lesionRatio = lesionRatio;
            return this;
        }
        public String getLesionRatio() {
            return this.lesionRatio;
        }

        public DetectCovid19CadResponseBodyData setMask(String mask) {
            this.mask = mask;
            return this;
        }
        public String getMask() {
            return this.mask;
        }

        public DetectCovid19CadResponseBodyData setNewProbability(String newProbability) {
            this.newProbability = newProbability;
            return this;
        }
        public String getNewProbability() {
            return this.newProbability;
        }

        public DetectCovid19CadResponseBodyData setNormalProbability(String normalProbability) {
            this.normalProbability = normalProbability;
            return this;
        }
        public String getNormalProbability() {
            return this.normalProbability;
        }

        public DetectCovid19CadResponseBodyData setOtherProbability(String otherProbability) {
            this.otherProbability = otherProbability;
            return this;
        }
        public String getOtherProbability() {
            return this.otherProbability;
        }

    }

}
