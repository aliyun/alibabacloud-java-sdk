// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class EkycVerifyResponseBody extends TeaModel {
    /**
     * <p>The <a href="https://www.alibabacloud.com/help/en/ekyc/latest/im1u641gyesiqmbg?spm=a2c63.p38356.0.i18#GiGmf">response code</a>.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>A detailed description of the response code.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>4EB356FE-BB6A-5DCC-B4C5-E8051787EBA1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Result object</p>
     */
    @NameInMap("Result")
    public EkycVerifyResponseBodyResult result;

    public static EkycVerifyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        EkycVerifyResponseBody self = new EkycVerifyResponseBody();
        return TeaModel.build(map, self);
    }

    public EkycVerifyResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public EkycVerifyResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public EkycVerifyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public EkycVerifyResponseBody setResult(EkycVerifyResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public EkycVerifyResponseBodyResult getResult() {
        return this.result;
    }

    public static class EkycVerifyResponseBodyResult extends TeaModel {
        /**
         * <p>Information about the face liveness verification result. For the JSON format, see the example on the right. For more information, see <a href="https://www.alibabacloud.com/help/en/ekyc/latest/im1u641gyesiqmbg?spm=a2c63.p38356.0.i18#JJ40j">ExtFaceInfo</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         * &quot;faceAttack&quot;: &quot;N&quot;,
         * &quot;faceComparisonScore&quot;: 52.57,
         * &quot;facePassed&quot;: &quot;N&quot;,
         * &quot;authorityComparisonScore&quot;: 80.39
         * }</p>
         */
        @NameInMap("ExtFaceInfo")
        public String extFaceInfo;

        /**
         * <p>Information about the certificate detection result.</p>
         * <p>For the JSON format, see the example on the right. For more information, see <a href="https://www.alibabacloud.com/help/en/ekyc/latest/im1u641gyesiqmbg?spm=a2c63.p38356.0.i18#iWOBY">ExtIdInfo</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *   &quot;ocrIdInfo&quot;: {
         *     &quot;expiryDate&quot;: &quot;&quot;,
         *     &quot;originOfIssue&quot;: &quot;Exit and Entry Administration of the Ministry of Public Security&quot;,
         *     &quot;englishName&quot;: &quot;LI SI&quot;,
         *     &quot;sex&quot;: &quot;Male&quot;,
         *     &quot;name&quot;: &quot;Li Si&quot;,
         *     &quot;idNumber&quot;: &quot;H11111112&quot;,
         *     &quot;issueDate&quot;: &quot;2013-01-02&quot;,
         *     &quot;birthDate&quot;: &quot;1990-02-21&quot;
         *   },
         *   &quot;ocrIdPassed&quot;: &quot;N&quot;,
         *   &quot;spoofInfo&quot;: {
         *     &quot;spoofResult&quot;: &quot;Y&quot;,
         *     &quot;spoofType&quot;: [
         *       &quot;SCREEN_REMARK&quot;
         *     ]
         *   }
         * }</p>
         */
        @NameInMap("ExtIdInfo")
        public String extIdInfo;

        /**
         * <p>The final authentication result. Valid values:</p>
         * <ul>
         * <li><p><strong>Y</strong>: The authentication is passed.</p>
         * </li>
         * <li><p><strong>N</strong>: The authentication fails.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Y</p>
         */
        @NameInMap("Passed")
        public String passed;

        /**
         * <p>A description of the authentication result. For more information, see <a href="https://www.alibabacloud.com/help/en/ekyc/latest/im1u641gyesiqmbg?spm=a2c63.p38356.0.i18#HCGLb">Error codes for ResultObject.SubCode</a>.</p>
         * 
         * <strong>example:</strong>
         * <p>205</p>
         */
        @NameInMap("SubCode")
        public String subCode;

        /**
         * <p>The transaction ID.</p>
         * 
         * <strong>example:</strong>
         * <p>4ab0b***cbde97</p>
         */
        @NameInMap("TransactionId")
        public String transactionId;

        public static EkycVerifyResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            EkycVerifyResponseBodyResult self = new EkycVerifyResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public EkycVerifyResponseBodyResult setExtFaceInfo(String extFaceInfo) {
            this.extFaceInfo = extFaceInfo;
            return this;
        }
        public String getExtFaceInfo() {
            return this.extFaceInfo;
        }

        public EkycVerifyResponseBodyResult setExtIdInfo(String extIdInfo) {
            this.extIdInfo = extIdInfo;
            return this;
        }
        public String getExtIdInfo() {
            return this.extIdInfo;
        }

        public EkycVerifyResponseBodyResult setPassed(String passed) {
            this.passed = passed;
            return this;
        }
        public String getPassed() {
            return this.passed;
        }

        public EkycVerifyResponseBodyResult setSubCode(String subCode) {
            this.subCode = subCode;
            return this;
        }
        public String getSubCode() {
            return this.subCode;
        }

        public EkycVerifyResponseBodyResult setTransactionId(String transactionId) {
            this.transactionId = transactionId;
            return this;
        }
        public String getTransactionId() {
            return this.transactionId;
        }

    }

}
