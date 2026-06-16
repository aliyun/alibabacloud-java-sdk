// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class DocOcrV2ResponseBody extends TeaModel {
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
     * <p>Id of the request</p>
     * 
     * <strong>example:</strong>
     * <p>86C40EC3-5940-5F47-995C-BFE90B70E540</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The returned result.</p>
     */
    @NameInMap("Result")
    public DocOcrV2ResponseBodyResult result;

    public static DocOcrV2ResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DocOcrV2ResponseBody self = new DocOcrV2ResponseBody();
        return TeaModel.build(map, self);
    }

    public DocOcrV2ResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DocOcrV2ResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DocOcrV2ResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DocOcrV2ResponseBody setResult(DocOcrV2ResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DocOcrV2ResponseBodyResult getResult() {
        return this.result;
    }

    public static class DocOcrV2ResponseBodyResult extends TeaModel {
        /**
         * <p>The card and certificate recognition result. This parameter is returned only when the API response is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *   &quot;idFaceQualityScore&quot;: 98.0
         *   &quot;ocrIdInfo&quot;: {
         *     &quot;expiryDate&quot;: &quot;&quot;,
         *     &quot;originOfIssue&quot;: &quot;公安部出入境管理局&quot;,
         *     &quot;englishName&quot;: &quot;LI SI&quot;,
         *     &quot;sex&quot;: &quot;男&quot;,
         *     &quot;name&quot;: &quot;李四&quot;,
         *     &quot;idNumber&quot;: &quot;H11111112&quot;,
         *     &quot;issueDate&quot;: &quot;2013-01-02&quot;,
         *     &quot;birthDate&quot;: &quot;1990-02-21&quot;
         *   },
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
         * <p>Indicates whether the authentication is passed. Valid values:</p>
         * <ul>
         * <li>Y: Passed.</li>
         * <li>N: Not passed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Y</p>
         */
        @NameInMap("Passed")
        public String passed;

        /**
         * <p>The sub-result code.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("SubCode")
        public String subCode;

        /**
         * <p>The unique ID of the authentication request.</p>
         * 
         * <strong>example:</strong>
         * <p>08573be80f944d95ac812e019e3655a8</p>
         */
        @NameInMap("TransactionId")
        public String transactionId;

        public static DocOcrV2ResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DocOcrV2ResponseBodyResult self = new DocOcrV2ResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DocOcrV2ResponseBodyResult setExtIdInfo(String extIdInfo) {
            this.extIdInfo = extIdInfo;
            return this;
        }
        public String getExtIdInfo() {
            return this.extIdInfo;
        }

        public DocOcrV2ResponseBodyResult setPassed(String passed) {
            this.passed = passed;
            return this;
        }
        public String getPassed() {
            return this.passed;
        }

        public DocOcrV2ResponseBodyResult setSubCode(String subCode) {
            this.subCode = subCode;
            return this;
        }
        public String getSubCode() {
            return this.subCode;
        }

        public DocOcrV2ResponseBodyResult setTransactionId(String transactionId) {
            this.transactionId = transactionId;
            return this;
        }
        public String getTransactionId() {
            return this.transactionId;
        }

    }

}
