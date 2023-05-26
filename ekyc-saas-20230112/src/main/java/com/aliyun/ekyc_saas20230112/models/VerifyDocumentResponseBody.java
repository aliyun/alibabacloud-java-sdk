// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ekyc_saas20230112.models;

import com.aliyun.tea.*;

public class VerifyDocumentResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public VerifyDocumentResponseBodyData data;

    @NameInMap("HttpCode")
    public Long httpCode;

    @NameInMap("Message")
    public String message;

    @NameInMap("Ok")
    public Boolean ok;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Status")
    public String status;

    public static VerifyDocumentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        VerifyDocumentResponseBody self = new VerifyDocumentResponseBody();
        return TeaModel.build(map, self);
    }

    public VerifyDocumentResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public VerifyDocumentResponseBody setData(VerifyDocumentResponseBodyData data) {
        this.data = data;
        return this;
    }
    public VerifyDocumentResponseBodyData getData() {
        return this.data;
    }

    public VerifyDocumentResponseBody setHttpCode(Long httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public Long getHttpCode() {
        return this.httpCode;
    }

    public VerifyDocumentResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public VerifyDocumentResponseBody setOk(Boolean ok) {
        this.ok = ok;
        return this;
    }
    public Boolean getOk() {
        return this.ok;
    }

    public VerifyDocumentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public VerifyDocumentResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public static class VerifyDocumentResponseBodyDataAntiSpoofingResult extends TeaModel {
        @NameInMap("Passed")
        public Boolean passed;

        @NameInMap("Risks")
        public java.util.List<String> risks;

        public static VerifyDocumentResponseBodyDataAntiSpoofingResult build(java.util.Map<String, ?> map) throws Exception {
            VerifyDocumentResponseBodyDataAntiSpoofingResult self = new VerifyDocumentResponseBodyDataAntiSpoofingResult();
            return TeaModel.build(map, self);
        }

        public VerifyDocumentResponseBodyDataAntiSpoofingResult setPassed(Boolean passed) {
            this.passed = passed;
            return this;
        }
        public Boolean getPassed() {
            return this.passed;
        }

        public VerifyDocumentResponseBodyDataAntiSpoofingResult setRisks(java.util.List<String> risks) {
            this.risks = risks;
            return this;
        }
        public java.util.List<String> getRisks() {
            return this.risks;
        }

    }

    public static class VerifyDocumentResponseBodyDataDetectionResult extends TeaModel {
        @NameInMap("CardRectangle")
        public java.util.List<Long> cardRectangle;

        @NameInMap("Height")
        public Long height;

        @NameInMap("PortraitRectangle")
        public java.util.List<Long> portraitRectangle;

        @NameInMap("Width")
        public Long width;

        public static VerifyDocumentResponseBodyDataDetectionResult build(java.util.Map<String, ?> map) throws Exception {
            VerifyDocumentResponseBodyDataDetectionResult self = new VerifyDocumentResponseBodyDataDetectionResult();
            return TeaModel.build(map, self);
        }

        public VerifyDocumentResponseBodyDataDetectionResult setCardRectangle(java.util.List<Long> cardRectangle) {
            this.cardRectangle = cardRectangle;
            return this;
        }
        public java.util.List<Long> getCardRectangle() {
            return this.cardRectangle;
        }

        public VerifyDocumentResponseBodyDataDetectionResult setHeight(Long height) {
            this.height = height;
            return this;
        }
        public Long getHeight() {
            return this.height;
        }

        public VerifyDocumentResponseBodyDataDetectionResult setPortraitRectangle(java.util.List<Long> portraitRectangle) {
            this.portraitRectangle = portraitRectangle;
            return this;
        }
        public java.util.List<Long> getPortraitRectangle() {
            return this.portraitRectangle;
        }

        public VerifyDocumentResponseBodyDataDetectionResult setWidth(Long width) {
            this.width = width;
            return this;
        }
        public Long getWidth() {
            return this.width;
        }

    }

    public static class VerifyDocumentResponseBodyData extends TeaModel {
        @NameInMap("AntiSpoofingResult")
        public VerifyDocumentResponseBodyDataAntiSpoofingResult antiSpoofingResult;

        @NameInMap("CountryCode")
        public String countryCode;

        @NameInMap("DetectionResult")
        public VerifyDocumentResponseBodyDataDetectionResult detectionResult;

        @NameInMap("DocumentType")
        public String documentType;

        @NameInMap("Passed")
        public Boolean passed;

        public static VerifyDocumentResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            VerifyDocumentResponseBodyData self = new VerifyDocumentResponseBodyData();
            return TeaModel.build(map, self);
        }

        public VerifyDocumentResponseBodyData setAntiSpoofingResult(VerifyDocumentResponseBodyDataAntiSpoofingResult antiSpoofingResult) {
            this.antiSpoofingResult = antiSpoofingResult;
            return this;
        }
        public VerifyDocumentResponseBodyDataAntiSpoofingResult getAntiSpoofingResult() {
            return this.antiSpoofingResult;
        }

        public VerifyDocumentResponseBodyData setCountryCode(String countryCode) {
            this.countryCode = countryCode;
            return this;
        }
        public String getCountryCode() {
            return this.countryCode;
        }

        public VerifyDocumentResponseBodyData setDetectionResult(VerifyDocumentResponseBodyDataDetectionResult detectionResult) {
            this.detectionResult = detectionResult;
            return this;
        }
        public VerifyDocumentResponseBodyDataDetectionResult getDetectionResult() {
            return this.detectionResult;
        }

        public VerifyDocumentResponseBodyData setDocumentType(String documentType) {
            this.documentType = documentType;
            return this;
        }
        public String getDocumentType() {
            return this.documentType;
        }

        public VerifyDocumentResponseBodyData setPassed(Boolean passed) {
            this.passed = passed;
            return this;
        }
        public Boolean getPassed() {
            return this.passed;
        }

    }

}
