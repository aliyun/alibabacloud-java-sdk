// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class CredentialRecognitionIntlResponseBody extends TeaModel {
    /**
     * <p>Return code.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Response message for the returned information.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>4EB35****87EBA1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Returned result.</p>
     */
    @NameInMap("Result")
    public CredentialRecognitionIntlResponseBodyResult result;

    public static CredentialRecognitionIntlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CredentialRecognitionIntlResponseBody self = new CredentialRecognitionIntlResponseBody();
        return TeaModel.build(map, self);
    }

    public CredentialRecognitionIntlResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CredentialRecognitionIntlResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CredentialRecognitionIntlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CredentialRecognitionIntlResponseBody setResult(CredentialRecognitionIntlResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public CredentialRecognitionIntlResponseBodyResult getResult() {
        return this.result;
    }

    public static class CredentialRecognitionIntlResponseBodyResult extends TeaModel {
        /**
         * <p>Identified key information in JSON format.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *   &quot;address&quot;: &quot;&quot;,
         *   &quot;name&quot;:&quot;&quot;
         * }</p>
         */
        @NameInMap("ExtIdInfo")
        public String extIdInfo;

        /**
         * <p>Authentication result description</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("SubCode")
        public String subCode;

        /**
         * <p>Extraction result. Values:</p>
         * <ul>
         * <li>S: Success.</li>
         * <li>F: Failure.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>S</p>
         */
        @NameInMap("Success")
        public String success;

        public static CredentialRecognitionIntlResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            CredentialRecognitionIntlResponseBodyResult self = new CredentialRecognitionIntlResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public CredentialRecognitionIntlResponseBodyResult setExtIdInfo(String extIdInfo) {
            this.extIdInfo = extIdInfo;
            return this;
        }
        public String getExtIdInfo() {
            return this.extIdInfo;
        }

        public CredentialRecognitionIntlResponseBodyResult setSubCode(String subCode) {
            this.subCode = subCode;
            return this;
        }
        public String getSubCode() {
            return this.subCode;
        }

        public CredentialRecognitionIntlResponseBodyResult setSuccess(String success) {
            this.success = success;
            return this;
        }
        public String getSuccess() {
            return this.success;
        }

    }

}
