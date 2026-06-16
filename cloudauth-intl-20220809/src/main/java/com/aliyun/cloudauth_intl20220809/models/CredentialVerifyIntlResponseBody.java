// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth_intl20220809.models;

import com.aliyun.tea.*;

public class CredentialVerifyIntlResponseBody extends TeaModel {
    /**
     * <p>The return code. A value of 200 indicates success. Other values indicate failure.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
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
     * <p>130A2C10-B9EE-4D84-88E3-5384FF039795</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The result information.</p>
     */
    @NameInMap("ResultObject")
    public CredentialVerifyIntlResponseBodyResultObject resultObject;

    public static CredentialVerifyIntlResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CredentialVerifyIntlResponseBody self = new CredentialVerifyIntlResponseBody();
        return TeaModel.build(map, self);
    }

    public CredentialVerifyIntlResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CredentialVerifyIntlResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CredentialVerifyIntlResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CredentialVerifyIntlResponseBody setResultObject(CredentialVerifyIntlResponseBodyResultObject resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public CredentialVerifyIntlResponseBodyResultObject getResultObject() {
        return this.resultObject;
    }

    public static class CredentialVerifyIntlResponseBodyResultObject extends TeaModel {
        /**
         * <p>The additional information in JSON format.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *  &quot;sameBackgroundDetail&quot;: {
         *  // 相似背景对于的原始图请求RequestId
         *  &quot;originalRequestId&quot;: &quot;130A2C10-B9EE-4D84-88E3-5384FF03****&quot;;
         *  // 相似背景对于的原始图请求商户ID 
         *  &quot;originalMerchantId&quot;: &quot;xxxxxxxx&quot; 
         *  }
         * }</p>
         */
        @NameInMap("MaterialInfo")
        public String materialInfo;

        /**
         * <p>The risk result. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: Low risk.</li>
         * <li><strong>1</strong>: High risk.</li>
         * <li><strong>2</strong>: Suspicious.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Result")
        public String result;

        /**
         * <p>The risk score map.</p>
         */
        @NameInMap("RiskScore")
        public java.util.Map<String, String> riskScore;

        /**
         * <p>The risk tags, separated by commas (,). Valid values:</p>
         * <ul>
         * <li>PS: Image has been edited with photo editing software.</li>
         * <li>SCREEN_PHOTO: Photo taken from a screen.</li>
         * <li>SCREENSHOT: Screenshot.</li>
         * <li>ORIGINAL_PHOTO: Non-original image.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PS</p>
         */
        @NameInMap("RiskTag")
        public String riskTag;

        public static CredentialVerifyIntlResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            CredentialVerifyIntlResponseBodyResultObject self = new CredentialVerifyIntlResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public CredentialVerifyIntlResponseBodyResultObject setMaterialInfo(String materialInfo) {
            this.materialInfo = materialInfo;
            return this;
        }
        public String getMaterialInfo() {
            return this.materialInfo;
        }

        public CredentialVerifyIntlResponseBodyResultObject setResult(String result) {
            this.result = result;
            return this;
        }
        public String getResult() {
            return this.result;
        }

        public CredentialVerifyIntlResponseBodyResultObject setRiskScore(java.util.Map<String, String> riskScore) {
            this.riskScore = riskScore;
            return this;
        }
        public java.util.Map<String, String> getRiskScore() {
            return this.riskScore;
        }

        public CredentialVerifyIntlResponseBodyResultObject setRiskTag(String riskTag) {
            this.riskTag = riskTag;
            return this;
        }
        public String getRiskTag() {
            return this.riskTag;
        }

    }

}
