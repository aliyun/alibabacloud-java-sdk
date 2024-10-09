// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class CredentialVerifyResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <strong>example:</strong>
     * <p>D6163397-15C5-419C-9ACC-B7C83E0B4C10</p>
     */
    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("Success")
        public Boolean success;

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
        @NameInMap("MaterialInfo")
        public String materialInfo;

        @NameInMap("OcrInfo")
        public String ocrInfo;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Result")
        public String result;

        @NameInMap("RiskScore")
        public java.util.Map<String, String> riskScore;

        /**
         * <strong>example:</strong>
         * <p>PS,SCREEN_PHOTO</p>
         */
        @NameInMap("RiskTag")
        public String riskTag;

        /**
         * <strong>example:</strong>
         * <p>**</p>
         */
        @NameInMap("VerifyDetail")
        public String verifyDetail;

        /**
         * <strong>example:</strong>
         * <ul>
         * <li></li>
         * </ul>
         */
        @NameInMap("VerifyResult")
        public String verifyResult;

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
