// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class DocOcrMaxV2ResponseBody extends TeaModel {
    /**
     * <p>The response code.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The response message.</p>
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
     * <p>5E63B760-0ECB-5C07-8503-A65C27876968</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The returned result.</p>
     */
    @NameInMap("Result")
    public DocOcrMaxV2ResponseBodyResult result;

    public static DocOcrMaxV2ResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DocOcrMaxV2ResponseBody self = new DocOcrMaxV2ResponseBody();
        return TeaModel.build(map, self);
    }

    public DocOcrMaxV2ResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public DocOcrMaxV2ResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public DocOcrMaxV2ResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DocOcrMaxV2ResponseBody setResult(DocOcrMaxV2ResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public DocOcrMaxV2ResponseBodyResult getResult() {
        return this.result;
    }

    public static class DocOcrMaxV2ResponseBodyResult extends TeaModel {
        /**
         * <p>The card and certificate recognition result. This parameter is returned only when the API response is successful.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *   &quot;ocrIdInfo&quot;: {
         *     &quot;id_number&quot;: &quot;<em><strong><strong>719</strong></strong></em><em>&quot;,
         *     &quot;address&quot;: &quot;xxxxxx,
         *     &quot;ethnicity&quot;: &quot;汉&quot;,
         *     &quot;date_of_birth&quot;: &quot;1990年06月02日&quot;,
         *     &quot;sex&quot;: &quot;女&quot;,
         *     &quot;name&quot;: &quot;何</em>*&quot;
         *   },
         *   &quot;ocrStandardData&quot;: {
         *     &quot;given_name_s&quot;: &quot;**&quot;,
         *     &quot;surname_s&quot;: &quot;HE&quot;,
         *     &quot;date_of_birth_s&quot;: &quot;1990-06-02&quot;,
         *     &quot;sex_s&quot;: &quot;F&quot;
         *   }
         * }</p>
         */
        @NameInMap("ExtIdInfo")
        public String extIdInfo;

        /**
         * <p>Indicates whether the verification passed. Valid values:</p>
         * <ul>
         * <li>Y: passed.</li>
         * <li>N: not passed.</li>
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
         * <p>The unique identifier of the verification request.</p>
         * 
         * <strong>example:</strong>
         * <p>08573be80f944d95ac812e019e3655a8</p>
         */
        @NameInMap("TransactionId")
        public String transactionId;

        public static DocOcrMaxV2ResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            DocOcrMaxV2ResponseBodyResult self = new DocOcrMaxV2ResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public DocOcrMaxV2ResponseBodyResult setExtIdInfo(String extIdInfo) {
            this.extIdInfo = extIdInfo;
            return this;
        }
        public String getExtIdInfo() {
            return this.extIdInfo;
        }

        public DocOcrMaxV2ResponseBodyResult setPassed(String passed) {
            this.passed = passed;
            return this;
        }
        public String getPassed() {
            return this.passed;
        }

        public DocOcrMaxV2ResponseBodyResult setSubCode(String subCode) {
            this.subCode = subCode;
            return this;
        }
        public String getSubCode() {
            return this.subCode;
        }

        public DocOcrMaxV2ResponseBodyResult setTransactionId(String transactionId) {
            this.transactionId = transactionId;
            return this;
        }
        public String getTransactionId() {
            return this.transactionId;
        }

    }

}
