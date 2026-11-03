// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class CredentialVerifyResponseBody extends TeaModel {
    /**
     * <p>The return code. A value of 200 indicates success, and other values indicate failure.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
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
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>D6163397-15C5-419C-9ACC-B7C83E0B4C10</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The returned result.</p>
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
         * <p>Indicates whether the Qwen explanation is successful. Valid values:</p>
         * <ul>
         * <li>true: Successful.</li>
         * <li>false: Failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Success")
        public Boolean success;

        /**
         * <p>The content of the Qwen explanation.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;Does this image have obvious Photoshop features&quot;:0,&quot;Is the image a normal business photo&quot;:1,&quot;Does the image contain the words 58, Meituan, or Dianping&quot;:0,&quot;Does this image contain website information&quot;:0,&quot;Is the business scene in the image a hotel&quot;:0}</p>
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
         * <p>The other information in JSON format.</p>
         * 
         * <strong>example:</strong>
         * <p>{</p>
         * <p>&quot;sameBackgroundDetail&quot;: {</p>
         * <p>// The request ID of the original image for the similar background</p>
         * <p>&quot;originalRequestId&quot;: &quot;130A2C10-B9EE-4D84-88E3-5384FF03****&quot;;</p>
         * <p>// The merchant ID of the original image request for the similar background</p>
         * <p>&quot;originalMerchantId&quot;: &quot;xxxxxxxx&quot;</p>
         * <p>}</p>
         * <p>}</p>
         */
        @NameInMap("MaterialInfo")
        public String materialInfo;

        /**
         * <p>The OCR result.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *    &quot;certNo&quot;:&quot;20216*********&quot;,
         *   &quot;certType&quot;:&quot;Primary School Teacher Qualification&quot;,
         *    &quot;gender&quot;:&quot;Male&quot;,
         *    &quot;subject&quot;:&quot;Fine Arts&quot;,
         *     &quot;name&quot;:&quot;Li**&quot;,
         *     &quot;ext_info&quot;:&quot;{}&quot;,
         *     &quot;birthDate&quot;:&quot;1998-07-28&quot;,
         *     &quot;idNo&quot;:&quot;620************&quot;,
         *     &quot;certOrg&quot;:&quot;&quot;
         * }</p>
         */
        @NameInMap("OcrInfo")
        public String ocrInfo;

        /**
         * <p>The risk result. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: Low risk.</li>
         * <li><strong>1</strong>: High risk.</li>
         * <li><strong><strong>2</strong></strong>: Suspicious.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Result")
        public String result;

        /**
         * <p>The map of risk scores.</p>
         */
        @NameInMap("RiskScore")
        public java.util.Map<String, String> riskScore;

        /**
         * <p>The risk tags. Multiple tags are separated by commas (,). Valid values:</p>
         * <ul>
         * <li>PS: The image is photoshopped.</li>
         * <li>SCREEN_PHOTO: The image is a photo of a screen.</li>
         * <li>SCREENSHOT: The image is a screenshot.</li>
         * <li>WATERMARK: The image contains a watermark.</li>
         * <li>COLOR_PRINT: The image is a color print or copy.</li>
         * <li>WEB_IMAGE: The image is a web image.</li>
         * <li>SAME_FACE: The face is similar to another face.</li>
         * <li>SAME_BACKGROUND: The background is similar to another background.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>PS,SCREEN_PHOTO</p>
         */
        @NameInMap("RiskTag")
        public String riskTag;

        /**
         * <p>The authoritative verification details.</p>
         * 
         * <strong>example:</strong>
         * <p>**</p>
         */
        @NameInMap("VerifyDetail")
        public String verifyDetail;

        /**
         * <p>The authoritative verification result.</p>
         * 
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("VerifyResult")
        public String verifyResult;

        /**
         * <p>The Qwen explanation.</p>
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
