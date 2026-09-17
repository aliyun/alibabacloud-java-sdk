// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class CredentialRecognitionIntlV2ResponseBody extends TeaModel {
    /**
     * <p>The return code. A value of 200 indicates a successful request. Other values indicate failures.</p>
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
     * <p>7F971622-38C0-5F56-B2EC-315367979B4F</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The response result.</p>
     */
    @NameInMap("Result")
    public CredentialRecognitionIntlV2ResponseBodyResult result;

    public static CredentialRecognitionIntlV2ResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CredentialRecognitionIntlV2ResponseBody self = new CredentialRecognitionIntlV2ResponseBody();
        return TeaModel.build(map, self);
    }

    public CredentialRecognitionIntlV2ResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CredentialRecognitionIntlV2ResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CredentialRecognitionIntlV2ResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CredentialRecognitionIntlV2ResponseBody setResult(CredentialRecognitionIntlV2ResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public CredentialRecognitionIntlV2ResponseBodyResult getResult() {
        return this.result;
    }

    public static class CredentialRecognitionIntlV2ResponseBodyResult extends TeaModel {
        /**
         * <p>The recognized key information, in JSON format.</p>
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
         * <p>The result code. Valid values:</p>
         * <ul>
         * <li>200: OCR extraction succeeded and all rule checks passed.</li>
         * <li>204: Validation result is inconsistent. OCR extraction succeeded, but some fields in CheckRuleConfig did not pass (N).</li>
         * <li>211: Quality does not meet requirements. Quality detection did not pass when idQuality is set to Y (not yet supported in the current version).</li>
         * <li>212: Anti-forgery check did not pass. fraudCheck was triggered and anti-forgery verification failed.</li>
         * <li>213: No text was extracted, or the credential type check did not pass.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("SubCode")
        public String subCode;

        /**
         * <p>The extraction result. Valid values:</p>
         * <ul>
         * <li>S: Succeeded.</li>
         * <li>F: Failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>S</p>
         */
        @NameInMap("Success")
        public String success;

        public static CredentialRecognitionIntlV2ResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            CredentialRecognitionIntlV2ResponseBodyResult self = new CredentialRecognitionIntlV2ResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public CredentialRecognitionIntlV2ResponseBodyResult setExtIdInfo(String extIdInfo) {
            this.extIdInfo = extIdInfo;
            return this;
        }
        public String getExtIdInfo() {
            return this.extIdInfo;
        }

        public CredentialRecognitionIntlV2ResponseBodyResult setSubCode(String subCode) {
            this.subCode = subCode;
            return this;
        }
        public String getSubCode() {
            return this.subCode;
        }

        public CredentialRecognitionIntlV2ResponseBodyResult setSuccess(String success) {
            this.success = success;
            return this;
        }
        public String getSuccess() {
            return this.success;
        }

    }

}
