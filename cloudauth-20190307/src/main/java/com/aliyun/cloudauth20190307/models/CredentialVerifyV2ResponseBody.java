// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class CredentialVerifyV2ResponseBody extends TeaModel {
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
     * <p>04F0F334-1335-436C-A1D7-6C044FE73368</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Returned result information.</p>
     */
    @NameInMap("ResultObject")
    public CredentialVerifyV2ResponseBodyResultObject resultObject;

    public static CredentialVerifyV2ResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CredentialVerifyV2ResponseBody self = new CredentialVerifyV2ResponseBody();
        return TeaModel.build(map, self);
    }

    public CredentialVerifyV2ResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CredentialVerifyV2ResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CredentialVerifyV2ResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CredentialVerifyV2ResponseBody setResultObject(CredentialVerifyV2ResponseBodyResultObject resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public CredentialVerifyV2ResponseBodyResultObject getResultObject() {
        return this.resultObject;
    }

    public static class CredentialVerifyV2ResponseBodyResultObjectVlResult extends TeaModel {
        /**
         * <p>Qwen interpretation success indicator</p>
         * <p>true: Success</p>
         * <p>false: Failure</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Success")
        public Boolean success;

        /**
         * <p>Image understanding result:</p>
         * <ul>
         * <li><p>When PromptModel is DEFAULT, the output format refers to the example on the right.</p>
         * </li>
         * <li><p>When PromptModel is CUSTOM, the output format follows the agreed format of the Prompt.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>{
         *  &quot;CHK_DOOR_PHOTO&quot;:1, -- 是否门头照 1：是 0：否
         *  &quot;CHK_INTERIOR_PHOTO&quot;:0, -- 是否内景照 1：是 0：否
         *  &quot;CHK_COUNTER_PHOTO&quot;:0 -- 是否柜台照 1：是 0：否
         * }</p>
         */
        @NameInMap("VlContent")
        public String vlContent;

        public static CredentialVerifyV2ResponseBodyResultObjectVlResult build(java.util.Map<String, ?> map) throws Exception {
            CredentialVerifyV2ResponseBodyResultObjectVlResult self = new CredentialVerifyV2ResponseBodyResultObjectVlResult();
            return TeaModel.build(map, self);
        }

        public CredentialVerifyV2ResponseBodyResultObjectVlResult setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public CredentialVerifyV2ResponseBodyResultObjectVlResult setVlContent(String vlContent) {
            this.vlContent = vlContent;
            return this;
        }
        public String getVlContent() {
            return this.vlContent;
        }

    }

    public static class CredentialVerifyV2ResponseBodyResultObject extends TeaModel {
        /**
         * <p>Additional information in JSON format.</p>
         * 
         * <strong>example:</strong>
         * <p>{</p>
         * <p>&quot;sameBackgroundDetail&quot;: {</p>
         * <p>// 相似背景对于的原始图请求RequestId</p>
         * <p>&quot;originalRequestId&quot;: &quot;130A2C10-B9EE-4D84-88E3-5384FF03****&quot;;</p>
         * <p>// 相似背景对于的原始图请求商户ID</p>
         * <p>&quot;originalMerchantId&quot;: &quot;xxxxxxxx&quot;</p>
         * <p>}</p>
         * <p>}</p>
         */
        @NameInMap("MaterialInfo")
        public String materialInfo;

        /**
         * <p>OCR recognition result.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *    &quot;certNo&quot;:&quot;20216*********&quot;,
         *   &quot;certType&quot;:&quot;小学教师资格&quot;,
         *    &quot;gender&quot;:&quot;男&quot;,
         *    &quot;subject&quot;:&quot;美术&quot;,
         *     &quot;name&quot;:&quot;李**&quot;,
         *     &quot;ext_info&quot;:&quot;{}&quot;,
         *     &quot;birthDate&quot;:&quot;1998-07-28&quot;,
         *     &quot;idNo&quot;:&quot;620************&quot;,
         *     &quot;certOrg&quot;:&quot;&quot;
         * }</p>
         */
        @NameInMap("OcrInfo")
        public String ocrInfo;

        /**
         * <p>Risk result</p>
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
         * <p>Risk score map.</p>
         */
        @NameInMap("RiskScore")
        public java.util.Map<String, String> riskScore;

        /**
         * <p>Risk tags, separated by commas (,), including:</p>
         * <ul>
         * <li>PS: Image manipulation.</li>
         * <li>SCREEN_PHOTO: Screen recapture.</li>
         * <li>SCREENSHOT: Screenshot.</li>
         * <li>WATERMARK: Watermark.</li>
         * <li>SAME_BACKGROUND: Similar background.</li>
         * <li>ORIGINAL_PHOTO: Not the original image</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PS,SCREEN_PHOTO</p>
         */
        @NameInMap("RiskTag")
        public String riskTag;

        /**
         * <p>Authority verification details.</p>
         * 
         * <strong>example:</strong>
         * <p>**</p>
         */
        @NameInMap("VerifyDetail")
        public String verifyDetail;

        /**
         * <p>Authority verification result</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("VerifyResult")
        public String verifyResult;

        /**
         * <p>Qwen interpretation.</p>
         */
        @NameInMap("VlResult")
        public CredentialVerifyV2ResponseBodyResultObjectVlResult vlResult;

        public static CredentialVerifyV2ResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            CredentialVerifyV2ResponseBodyResultObject self = new CredentialVerifyV2ResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public CredentialVerifyV2ResponseBodyResultObject setMaterialInfo(String materialInfo) {
            this.materialInfo = materialInfo;
            return this;
        }
        public String getMaterialInfo() {
            return this.materialInfo;
        }

        public CredentialVerifyV2ResponseBodyResultObject setOcrInfo(String ocrInfo) {
            this.ocrInfo = ocrInfo;
            return this;
        }
        public String getOcrInfo() {
            return this.ocrInfo;
        }

        public CredentialVerifyV2ResponseBodyResultObject setResult(String result) {
            this.result = result;
            return this;
        }
        public String getResult() {
            return this.result;
        }

        public CredentialVerifyV2ResponseBodyResultObject setRiskScore(java.util.Map<String, String> riskScore) {
            this.riskScore = riskScore;
            return this;
        }
        public java.util.Map<String, String> getRiskScore() {
            return this.riskScore;
        }

        public CredentialVerifyV2ResponseBodyResultObject setRiskTag(String riskTag) {
            this.riskTag = riskTag;
            return this;
        }
        public String getRiskTag() {
            return this.riskTag;
        }

        public CredentialVerifyV2ResponseBodyResultObject setVerifyDetail(String verifyDetail) {
            this.verifyDetail = verifyDetail;
            return this;
        }
        public String getVerifyDetail() {
            return this.verifyDetail;
        }

        public CredentialVerifyV2ResponseBodyResultObject setVerifyResult(String verifyResult) {
            this.verifyResult = verifyResult;
            return this;
        }
        public String getVerifyResult() {
            return this.verifyResult;
        }

        public CredentialVerifyV2ResponseBodyResultObject setVlResult(CredentialVerifyV2ResponseBodyResultObjectVlResult vlResult) {
            this.vlResult = vlResult;
            return this;
        }
        public CredentialVerifyV2ResponseBodyResultObjectVlResult getVlResult() {
            return this.vlResult;
        }

    }

}
