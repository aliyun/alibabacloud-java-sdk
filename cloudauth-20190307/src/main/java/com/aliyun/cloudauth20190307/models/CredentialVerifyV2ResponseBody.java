// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cloudauth20190307.models;

import com.aliyun.tea.*;

public class CredentialVerifyV2ResponseBody extends TeaModel {
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
     * <p>04F0F334-1335-436C-A1D7-6C044FE73368</p>
     */
    @NameInMap("RequestId")
    public String requestId;

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
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Success")
        public Boolean success;

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
