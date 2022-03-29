// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cro20200102.models;

import com.aliyun.tea.*;

public class GetVerifyResultResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("VerifyResult")
    public GetVerifyResultResponseBodyVerifyResult verifyResult;

    public static GetVerifyResultResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetVerifyResultResponseBody self = new GetVerifyResultResponseBody();
        return TeaModel.build(map, self);
    }

    public GetVerifyResultResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetVerifyResultResponseBody setVerifyResult(GetVerifyResultResponseBodyVerifyResult verifyResult) {
        this.verifyResult = verifyResult;
        return this;
    }
    public GetVerifyResultResponseBodyVerifyResult getVerifyResult() {
        return this.verifyResult;
    }

    public static class GetVerifyResultResponseBodyVerifyResultAuditInfo extends TeaModel {
        @NameInMap("AuthorityComparableCode")
        public Integer authorityComparableCode;

        @NameInMap("CardAuthorityComparePass")
        public Boolean cardAuthorityComparePass;

        @NameInMap("CardCopyCheckPass")
        public Boolean cardCopyCheckPass;

        @NameInMap("ExternalFailReason")
        public String externalFailReason;

        @NameInMap("FaceAuthorityComparePass")
        public Boolean faceAuthorityComparePass;

        @NameInMap("FaceCardComparePass")
        public Boolean faceCardComparePass;

        @NameInMap("FaceCopyCheckPass")
        public Boolean faceCopyCheckPass;

        @NameInMap("FaceExpressionCheckPass")
        public Boolean faceExpressionCheckPass;

        @NameInMap("IdCardOcrCheckPass")
        public Boolean idCardOcrCheckPass;

        @NameInMap("RealNameCheckPass")
        public Boolean realNameCheckPass;

        public static GetVerifyResultResponseBodyVerifyResultAuditInfo build(java.util.Map<String, ?> map) throws Exception {
            GetVerifyResultResponseBodyVerifyResultAuditInfo self = new GetVerifyResultResponseBodyVerifyResultAuditInfo();
            return TeaModel.build(map, self);
        }

        public GetVerifyResultResponseBodyVerifyResultAuditInfo setAuthorityComparableCode(Integer authorityComparableCode) {
            this.authorityComparableCode = authorityComparableCode;
            return this;
        }
        public Integer getAuthorityComparableCode() {
            return this.authorityComparableCode;
        }

        public GetVerifyResultResponseBodyVerifyResultAuditInfo setCardAuthorityComparePass(Boolean cardAuthorityComparePass) {
            this.cardAuthorityComparePass = cardAuthorityComparePass;
            return this;
        }
        public Boolean getCardAuthorityComparePass() {
            return this.cardAuthorityComparePass;
        }

        public GetVerifyResultResponseBodyVerifyResultAuditInfo setCardCopyCheckPass(Boolean cardCopyCheckPass) {
            this.cardCopyCheckPass = cardCopyCheckPass;
            return this;
        }
        public Boolean getCardCopyCheckPass() {
            return this.cardCopyCheckPass;
        }

        public GetVerifyResultResponseBodyVerifyResultAuditInfo setExternalFailReason(String externalFailReason) {
            this.externalFailReason = externalFailReason;
            return this;
        }
        public String getExternalFailReason() {
            return this.externalFailReason;
        }

        public GetVerifyResultResponseBodyVerifyResultAuditInfo setFaceAuthorityComparePass(Boolean faceAuthorityComparePass) {
            this.faceAuthorityComparePass = faceAuthorityComparePass;
            return this;
        }
        public Boolean getFaceAuthorityComparePass() {
            return this.faceAuthorityComparePass;
        }

        public GetVerifyResultResponseBodyVerifyResultAuditInfo setFaceCardComparePass(Boolean faceCardComparePass) {
            this.faceCardComparePass = faceCardComparePass;
            return this;
        }
        public Boolean getFaceCardComparePass() {
            return this.faceCardComparePass;
        }

        public GetVerifyResultResponseBodyVerifyResultAuditInfo setFaceCopyCheckPass(Boolean faceCopyCheckPass) {
            this.faceCopyCheckPass = faceCopyCheckPass;
            return this;
        }
        public Boolean getFaceCopyCheckPass() {
            return this.faceCopyCheckPass;
        }

        public GetVerifyResultResponseBodyVerifyResultAuditInfo setFaceExpressionCheckPass(Boolean faceExpressionCheckPass) {
            this.faceExpressionCheckPass = faceExpressionCheckPass;
            return this;
        }
        public Boolean getFaceExpressionCheckPass() {
            return this.faceExpressionCheckPass;
        }

        public GetVerifyResultResponseBodyVerifyResultAuditInfo setIdCardOcrCheckPass(Boolean idCardOcrCheckPass) {
            this.idCardOcrCheckPass = idCardOcrCheckPass;
            return this;
        }
        public Boolean getIdCardOcrCheckPass() {
            return this.idCardOcrCheckPass;
        }

        public GetVerifyResultResponseBodyVerifyResultAuditInfo setRealNameCheckPass(Boolean realNameCheckPass) {
            this.realNameCheckPass = realNameCheckPass;
            return this;
        }
        public Boolean getRealNameCheckPass() {
            return this.realNameCheckPass;
        }

    }

    public static class GetVerifyResultResponseBodyVerifyResultCardInfo extends TeaModel {
        @NameInMap("BackUrl")
        public String backUrl;

        @NameInMap("BeginDate")
        public String beginDate;

        @NameInMap("CardNumber")
        public String cardNumber;

        @NameInMap("EndDate")
        public String endDate;

        @NameInMap("FrontUrl")
        public String frontUrl;

        @NameInMap("Name")
        public String name;

        public static GetVerifyResultResponseBodyVerifyResultCardInfo build(java.util.Map<String, ?> map) throws Exception {
            GetVerifyResultResponseBodyVerifyResultCardInfo self = new GetVerifyResultResponseBodyVerifyResultCardInfo();
            return TeaModel.build(map, self);
        }

        public GetVerifyResultResponseBodyVerifyResultCardInfo setBackUrl(String backUrl) {
            this.backUrl = backUrl;
            return this;
        }
        public String getBackUrl() {
            return this.backUrl;
        }

        public GetVerifyResultResponseBodyVerifyResultCardInfo setBeginDate(String beginDate) {
            this.beginDate = beginDate;
            return this;
        }
        public String getBeginDate() {
            return this.beginDate;
        }

        public GetVerifyResultResponseBodyVerifyResultCardInfo setCardNumber(String cardNumber) {
            this.cardNumber = cardNumber;
            return this;
        }
        public String getCardNumber() {
            return this.cardNumber;
        }

        public GetVerifyResultResponseBodyVerifyResultCardInfo setEndDate(String endDate) {
            this.endDate = endDate;
            return this;
        }
        public String getEndDate() {
            return this.endDate;
        }

        public GetVerifyResultResponseBodyVerifyResultCardInfo setFrontUrl(String frontUrl) {
            this.frontUrl = frontUrl;
            return this;
        }
        public String getFrontUrl() {
            return this.frontUrl;
        }

        public GetVerifyResultResponseBodyVerifyResultCardInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class GetVerifyResultResponseBodyVerifyResultFaceInfo extends TeaModel {
        @NameInMap("BiometricVideoUrl")
        public String biometricVideoUrl;

        @NameInMap("FaceImageUrl")
        public String faceImageUrl;

        @NameInMap("OriginalFaceUrl")
        public String originalFaceUrl;

        public static GetVerifyResultResponseBodyVerifyResultFaceInfo build(java.util.Map<String, ?> map) throws Exception {
            GetVerifyResultResponseBodyVerifyResultFaceInfo self = new GetVerifyResultResponseBodyVerifyResultFaceInfo();
            return TeaModel.build(map, self);
        }

        public GetVerifyResultResponseBodyVerifyResultFaceInfo setBiometricVideoUrl(String biometricVideoUrl) {
            this.biometricVideoUrl = biometricVideoUrl;
            return this;
        }
        public String getBiometricVideoUrl() {
            return this.biometricVideoUrl;
        }

        public GetVerifyResultResponseBodyVerifyResultFaceInfo setFaceImageUrl(String faceImageUrl) {
            this.faceImageUrl = faceImageUrl;
            return this;
        }
        public String getFaceImageUrl() {
            return this.faceImageUrl;
        }

        public GetVerifyResultResponseBodyVerifyResultFaceInfo setOriginalFaceUrl(String originalFaceUrl) {
            this.originalFaceUrl = originalFaceUrl;
            return this;
        }
        public String getOriginalFaceUrl() {
            return this.originalFaceUrl;
        }

    }

    public static class GetVerifyResultResponseBodyVerifyResult extends TeaModel {
        @NameInMap("AuditInfo")
        public GetVerifyResultResponseBodyVerifyResultAuditInfo auditInfo;

        @NameInMap("CardInfo")
        public GetVerifyResultResponseBodyVerifyResultCardInfo cardInfo;

        @NameInMap("FaceInfo")
        public GetVerifyResultResponseBodyVerifyResultFaceInfo faceInfo;

        @NameInMap("Message")
        public String message;

        @NameInMap("Status")
        public Integer status;

        @NameInMap("SubStatus")
        public Integer subStatus;

        public static GetVerifyResultResponseBodyVerifyResult build(java.util.Map<String, ?> map) throws Exception {
            GetVerifyResultResponseBodyVerifyResult self = new GetVerifyResultResponseBodyVerifyResult();
            return TeaModel.build(map, self);
        }

        public GetVerifyResultResponseBodyVerifyResult setAuditInfo(GetVerifyResultResponseBodyVerifyResultAuditInfo auditInfo) {
            this.auditInfo = auditInfo;
            return this;
        }
        public GetVerifyResultResponseBodyVerifyResultAuditInfo getAuditInfo() {
            return this.auditInfo;
        }

        public GetVerifyResultResponseBodyVerifyResult setCardInfo(GetVerifyResultResponseBodyVerifyResultCardInfo cardInfo) {
            this.cardInfo = cardInfo;
            return this;
        }
        public GetVerifyResultResponseBodyVerifyResultCardInfo getCardInfo() {
            return this.cardInfo;
        }

        public GetVerifyResultResponseBodyVerifyResult setFaceInfo(GetVerifyResultResponseBodyVerifyResultFaceInfo faceInfo) {
            this.faceInfo = faceInfo;
            return this;
        }
        public GetVerifyResultResponseBodyVerifyResultFaceInfo getFaceInfo() {
            return this.faceInfo;
        }

        public GetVerifyResultResponseBodyVerifyResult setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public GetVerifyResultResponseBodyVerifyResult setStatus(Integer status) {
            this.status = status;
            return this;
        }
        public Integer getStatus() {
            return this.status;
        }

        public GetVerifyResultResponseBodyVerifyResult setSubStatus(Integer subStatus) {
            this.subStatus = subStatus;
            return this;
        }
        public Integer getSubStatus() {
            return this.subStatus;
        }

    }

}
