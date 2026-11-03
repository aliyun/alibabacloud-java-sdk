// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class DescribeAuthVerifyResponseBody extends TeaModel {
    /**
     * <p>The return code.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The return message.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>473469C7-AA6F-4DC5-B3DB-A3DC0DE3C83E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The result.</p>
     */
    @NameInMap("Result")
    public DescribeAuthVerifyResponseBodyResult result;

    public static DescribeAuthVerifyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAuthVerifyResponseBody self = new DescribeAuthVerifyResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAuthVerifyResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DescribeAuthVerifyResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DescribeAuthVerifyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAuthVerifyResponseBody setResult(DescribeAuthVerifyResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DescribeAuthVerifyResponseBodyResult getResult() {
        return this.result;
    }

    public static class DescribeAuthVerifyResponseBodyResult extends TeaModel {
        /**
         * <ul>
         * <li>The card and certificate information read by OCR (ocrIdCardInfo)</li>
         * <li>The photo of the card and certificate information edited on the client (ocrIdEditInfo)</li>
         * <li>The OSS storage location and URL of the OCR photo (ocrPictureFront)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>&quot;ocrIdCardInfo&quot;: {
         *     &quot;certName&quot;: &quot;Mr. Zhang&quot;,
         *     &quot;sex&quot;: &quot;Male&quot;,
         *     &quot;nationality&quot;: &quot;Han&quot;,
         *     &quot;birth&quot;: &quot;20010213&quot;,
         *     &quot;address&quot;: &quot;No. X, XX Street, XXX District, XX City, XXX Province&quot;,
         *     &quot;certNo&quot;: &quot;4<strong><strong><strong><strong><strong><strong><strong><strong>X&quot;,
         *     &quot;authority&quot;: &quot;XXX Branch of XXX Public Security Bureau&quot;,
         *     &quot;startDate&quot;: &quot;20250523&quot;,
         *     &quot;endDate&quot;: &quot;20450523&quot;
         *   },
         * &quot;ocrIdEditInfo&quot;: {
         *     &quot;certName&quot;: &quot;Mr. Zhang&quot;,
         *     &quot;sex&quot;: &quot;Male&quot;,
         *     &quot;nationality&quot;: &quot;Han&quot;,
         *     &quot;birth&quot;: &quot;20010213&quot;,
         *     &quot;address&quot;: &quot;No. X, XX Street, XXX District, XX City, XXX Province&quot;,
         *     &quot;certNo&quot;: &quot;4</strong></strong></strong></strong></strong></strong></strong></strong>X&quot;,
         *     &quot;authority&quot;: &quot;XXX Branch of XXX Public Security Bureau&quot;,
         *     &quot;startDate&quot;: &quot;20250523&quot;,
         *     &quot;endDate&quot;: &quot;20450523&quot;
         *   },
         *   &quot;ocrPictureFront&quot;: {
         *     &quot;ossBucketName&quot;: &quot;cn-shanghai-aliyun-cloudauth-12********&quot;,
         *     &quot;ossIdFaceObjectName&quot;: &quot;verify/1234567890/f7ed1ef80ad1234fdsd95c<strong><strong><strong><strong>cd_ocridface_b749.jpeg&quot;,
         *     &quot;ossIdFaceUrl&quot;: &quot;<a href="http://cn-shanghai-aliyun-cloudauth-1234567890.oss-cn-shanghai.aliyuncs.com/verify/1234567890/f7ed1ef80ad1234fdsd95c66d83340cd_ocridface_b749.jpeg?security-token=CAISjdfgeJ1q6F">http://cn-shanghai-aliyun-cloudauth-1234567890.oss-cn-shanghai.aliyuncs.com/verify/1234567890/f7ed1ef80ad1234fdsd95c66d83340cd_ocridface_b749.jpeg?security-token=CAISjdfgeJ1q6F</a>...&quot;,
         *     &quot;ossIdNationalEmblemObjectName&quot;: &quot;verify/1234567890/f7ed1ef80ad1234fdsd95c</strong></strong></strong></strong>cd_ocridnationalemblem_a3hf.jpeg&quot;,
         *     &quot;ossIdNationalEmblemUrl&quot;: &quot;<a href="http://cn-shanghai-aliyun-cloudauth-1234567890.oss-cn-shanghai.aliyuncs.com/verify/1234567890/f7ed1ef80ad1234fdsd95c66d83340cd_ocridnationalemblem_a3hf.jpeg?security-token=CAISjgJ1q6">http://cn-shanghai-aliyun-cloudauth-1234567890.oss-cn-shanghai.aliyuncs.com/verify/1234567890/f7ed1ef80ad1234fdsd95c66d83340cd_ocridnationalemblem_a3hf.jpeg?security-token=CAISjgJ1q6</a>...&quot;
         *   }</p>
         */
        @NameInMap("MaterialInfo")
        public String materialInfo;

        /**
         * <p>The anti-spoofing detection result for the back side of the ID card, including the risk determination result and risk type:</p>
         * <blockquote>
         * <p>- 
         * Anti-spoofing detection for the back side of the card is enabled only when IdSpoof is set to Y in the Initialize operation. Otherwise, spoofRiskResult defaults to N, and spoofType is empty.</p>
         * </blockquote>
         * <p>spoofRiskResult:</p>
         * <ul>
         * <li>Y: Risk detected</li>
         * <li>N: No risk detected</li>
         * </ul>
         * <p>spoofType:</p>
         * <ul>
         * <li>SCREEN_REMARK: Screen recapture</li>
         * <li>PHOTO_COPY: Photocopy</li>
         * <li>TAMPER: Image tampering</li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>This field contains algorithm prediction results and may not be returned. Avoid building critical business dependencies on this field.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>spoofRiskResult：Y
         * spoofType：SCREEN_REMARK</p>
         */
        @NameInMap("SpoofBackInfo")
        public String spoofBackInfo;

        /**
         * <p>The anti-spoofing detection result for the front side of the ID card, including the risk determination result and risk type:</p>
         * <blockquote>
         * <p>- 
         * Anti-spoofing detection for the front side of the card is enabled only when IdSpoof is set to Y in the Initialize operation. Otherwise, spoofRiskResult defaults to N, and spoofType is empty.</p>
         * </blockquote>
         * <p>spoofRiskResult:</p>
         * <ul>
         * <li>Y: Risk detected</li>
         * <li>N: No risk detected</li>
         * </ul>
         * <p>spoofType:</p>
         * <ul>
         * <li>SCREEN_REMARK: Screen recapture</li>
         * <li>PHOTO_COPY: Photocopy</li>
         * <li>TAMPER: Image tampering</li>
         * </ul>
         * <blockquote>
         * <ul>
         * <li>This field contains algorithm prediction results and may not be returned. Avoid building critical business dependencies on this field.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>spoofRiskResult：Y
         * spoofType：SCREEN_REMARK</p>
         */
        @NameInMap("SpoofInfo")
        public String spoofInfo;

        /**
         * <p>The result description.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("SubCode")
        public String subCode;

        public static DescribeAuthVerifyResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DescribeAuthVerifyResponseBodyResult self = new DescribeAuthVerifyResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DescribeAuthVerifyResponseBodyResult setMaterialInfo(String materialInfo) {
            this.materialInfo = materialInfo;
            return this;
        }
        public String getMaterialInfo() {
            return this.materialInfo;
        }

        public DescribeAuthVerifyResponseBodyResult setSpoofBackInfo(String spoofBackInfo) {
            this.spoofBackInfo = spoofBackInfo;
            return this;
        }
        public String getSpoofBackInfo() {
            return this.spoofBackInfo;
        }

        public DescribeAuthVerifyResponseBodyResult setSpoofInfo(String spoofInfo) {
            this.spoofInfo = spoofInfo;
            return this;
        }
        public String getSpoofInfo() {
            return this.spoofInfo;
        }

        public DescribeAuthVerifyResponseBodyResult setSubCode(String subCode) {
            this.subCode = subCode;
            return this;
        }
        public String getSubCode() {
            return this.subCode;
        }

    }

}
