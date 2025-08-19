// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class CredentialProductVerifyV2ResponseBody extends TeaModel {
    /**
     * <p>Return code: 200 for success, others for failure.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>Return message.</p>
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
     * <p>130A2C10-B9EE-4D84-88E3-5384FF039795</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Result object.</p>
     */
    @NameInMap("ResultObject")
    public CredentialProductVerifyV2ResponseBodyResultObject resultObject;

    public static CredentialProductVerifyV2ResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CredentialProductVerifyV2ResponseBody self = new CredentialProductVerifyV2ResponseBody();
        return TeaModel.build(map, self);
    }

    public CredentialProductVerifyV2ResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CredentialProductVerifyV2ResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CredentialProductVerifyV2ResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CredentialProductVerifyV2ResponseBody setResultObject(CredentialProductVerifyV2ResponseBodyResultObject resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public CredentialProductVerifyV2ResponseBodyResultObject getResultObject() {
        return this.resultObject;
    }

    public static class CredentialProductVerifyV2ResponseBodyResultObject extends TeaModel {
        /**
         * <p>Additional information in JSON format.</p>
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
         * <ul>
         * <li>0: Low risk</li>
         * <li>1: High risk</li>
         * <li>2: Suspicious</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Result")
        public String result;

        /**
         * <p>Map of risk scores.</p>
         */
        @NameInMap("RiskScore")
        public java.util.Map<String, String> riskScore;

        /**
         * <p>Risk tags, separated by commas, including:</p>
         * <ul>
         * <li>PS: Image has been photoshopped</li>
         * <li>LOW_QUALITY_PRODUCT: Low quality (low clarity)</li>
         * <li>SAME_BACKGROUND: Similar background</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PS,LOW_QUALITY_PRODUCT</p>
         */
        @NameInMap("RiskTag")
        public String riskTag;

        public static CredentialProductVerifyV2ResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            CredentialProductVerifyV2ResponseBodyResultObject self = new CredentialProductVerifyV2ResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public CredentialProductVerifyV2ResponseBodyResultObject setMaterialInfo(String materialInfo) {
            this.materialInfo = materialInfo;
            return this;
        }
        public String getMaterialInfo() {
            return this.materialInfo;
        }

        public CredentialProductVerifyV2ResponseBodyResultObject setResult(String result) {
            this.result = result;
            return this;
        }
        public String getResult() {
            return this.result;
        }

        public CredentialProductVerifyV2ResponseBodyResultObject setRiskScore(java.util.Map<String, String> riskScore) {
            this.riskScore = riskScore;
            return this;
        }
        public java.util.Map<String, String> getRiskScore() {
            return this.riskScore;
        }

        public CredentialProductVerifyV2ResponseBodyResultObject setRiskTag(String riskTag) {
            this.riskTag = riskTag;
            return this;
        }
        public String getRiskTag() {
            return this.riskTag;
        }

    }

}
