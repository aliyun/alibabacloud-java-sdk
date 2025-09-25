// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class CredentialVerifyResponseBody extends TeaModel {
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
     * <p>D6163397-15C5-419C-9ACC-B7C83E0B4C10</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>Returned result</p>
     */
    @NameInMap("ResultObject")
    public CredentialVerifyResponseBodyResultObject resultObject;

    public static CredentialVerifyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        CredentialVerifyResponseBody self = new CredentialVerifyResponseBody();
        return TeaModel.build(map, self);
    }

    public CredentialVerifyResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public CredentialVerifyResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public CredentialVerifyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public CredentialVerifyResponseBody setResultObject(CredentialVerifyResponseBodyResultObject resultObject) {
        this.resultObject = resultObject;
        return this;
    }
    public CredentialVerifyResponseBodyResultObject getResultObject() {
        return this.resultObject;
    }

    public static class CredentialVerifyResponseBodyResultObjectVlResult extends TeaModel {
        /**
         * <p>Indicates whether the call was successful. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: The call was successful.</li>
         * <li><strong>false</strong>: The call failed.</li>
         * </ul>
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
         * <p>{\&quot;这张图有没有明显的PS特征\&quot;:0,\&quot;图片是否为正常经营照片\&quot;:1,\&quot;图片中有没有58、美团、大众点评字样\&quot;:0,\&quot;这张图有没有网站信息\&quot;:0,\&quot;图片经营的场景是否为酒店\&quot;:0}</p>
         */
        @NameInMap("VlContent")
        public String vlContent;

        public static CredentialVerifyResponseBodyResultObjectVlResult build(java.util.Map<String, ?> map) throws Exception {
            CredentialVerifyResponseBodyResultObjectVlResult self = new CredentialVerifyResponseBodyResultObjectVlResult();
            return TeaModel.build(map, self);
        }

        public CredentialVerifyResponseBodyResultObjectVlResult setSuccess(Boolean success) {
            this.success = success;
            return this;
        }
        public Boolean getSuccess() {
            return this.success;
        }

        public CredentialVerifyResponseBodyResultObjectVlResult setVlContent(String vlContent) {
            this.vlContent = vlContent;
            return this;
        }
        public String getVlContent() {
            return this.vlContent;
        }

    }

    public static class CredentialVerifyResponseBodyResultObject extends TeaModel {
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
         * <li><strong>0</strong>: Low risk</li>
         * <li><strong>1</strong>: High risk</li>
         * <li><strong>2</strong>: Suspicious</li>
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
         * <li><strong>PS</strong>: Image manipulation.</li>
         * <li><strong>SCREEN_PHOTO</strong>: Screen recapture.</li>
         * <li><strong>SCREENSHOT</strong>: Screenshot.</li>
         * <li><strong>WATERMARK</strong>: Watermark.</li>
         * <li><strong>SAME_BACKGROUND</strong>: Similar background.</li>
         * <li><strong>ORIGINAL_PHOTO</strong>: Not the original image</li>
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
         * <p>The verification result.</p>
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
        public CredentialVerifyResponseBodyResultObjectVlResult vlResult;

        public static CredentialVerifyResponseBodyResultObject build(java.util.Map<String, ?> map) throws Exception {
            CredentialVerifyResponseBodyResultObject self = new CredentialVerifyResponseBodyResultObject();
            return TeaModel.build(map, self);
        }

        public CredentialVerifyResponseBodyResultObject setMaterialInfo(String materialInfo) {
            this.materialInfo = materialInfo;
            return this;
        }
        public String getMaterialInfo() {
            return this.materialInfo;
        }

        public CredentialVerifyResponseBodyResultObject setOcrInfo(String ocrInfo) {
            this.ocrInfo = ocrInfo;
            return this;
        }
        public String getOcrInfo() {
            return this.ocrInfo;
        }

        public CredentialVerifyResponseBodyResultObject setResult(String result) {
            this.result = result;
            return this;
        }
        public String getResult() {
            return this.result;
        }

        public CredentialVerifyResponseBodyResultObject setRiskScore(java.util.Map<String, String> riskScore) {
            this.riskScore = riskScore;
            return this;
        }
        public java.util.Map<String, String> getRiskScore() {
            return this.riskScore;
        }

        public CredentialVerifyResponseBodyResultObject setRiskTag(String riskTag) {
            this.riskTag = riskTag;
            return this;
        }
        public String getRiskTag() {
            return this.riskTag;
        }

        public CredentialVerifyResponseBodyResultObject setVerifyDetail(String verifyDetail) {
            this.verifyDetail = verifyDetail;
            return this;
        }
        public String getVerifyDetail() {
            return this.verifyDetail;
        }

        public CredentialVerifyResponseBodyResultObject setVerifyResult(String verifyResult) {
            this.verifyResult = verifyResult;
            return this;
        }
        public String getVerifyResult() {
            return this.verifyResult;
        }

        public CredentialVerifyResponseBodyResultObject setVlResult(CredentialVerifyResponseBodyResultObjectVlResult vlResult) {
            this.vlResult = vlResult;
            return this;
        }
        public CredentialVerifyResponseBodyResultObjectVlResult getVlResult() {
            return this.vlResult;
        }

    }

}
