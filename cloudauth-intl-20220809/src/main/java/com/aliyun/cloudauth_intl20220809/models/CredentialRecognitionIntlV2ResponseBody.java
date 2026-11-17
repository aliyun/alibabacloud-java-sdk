// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class CredentialRecognitionIntlV2ResponseBody extends TeaModel {
    /**
     * <p>The return code. A value of 200 indicates that the request is successful. Other values indicate that the request failed.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned message.</p>
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
     * <p>The returned result.</p>
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
         * <p>The recognized key information in JSON format.</p>
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
         * <li>200: OCR extraction is successful and all rule checks are passed</li>
         * <li>204: verification results are inconsistent. OCR extraction is successful, but some fields in CheckRuleConfig fail the check (N)</li>
         * <li>211: quality does not meet the requirements. Quality detection fails when idQuality is set to Y. This feature is not available in the current version</li>
         * <li>212: anti-counterfeiting check fails. fraudCheck is triggered and anti-counterfeiting verification fails</li>
         * <li>213: no text is extracted or the credential type check fails</li>
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
         * <li>S: success.</li>
         * <li>F: failure.</li>
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
