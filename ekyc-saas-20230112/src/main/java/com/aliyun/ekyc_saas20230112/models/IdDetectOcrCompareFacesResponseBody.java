// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ekyc_saas20230112.models;

import com.aliyun.tea.*;

public class IdDetectOcrCompareFacesResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public IdDetectOcrCompareFacesResponseBodyData data;

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

    public static IdDetectOcrCompareFacesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        IdDetectOcrCompareFacesResponseBody self = new IdDetectOcrCompareFacesResponseBody();
        return TeaModel.build(map, self);
    }

    public IdDetectOcrCompareFacesResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public IdDetectOcrCompareFacesResponseBody setData(IdDetectOcrCompareFacesResponseBodyData data) {
        this.data = data;
        return this;
    }
    public IdDetectOcrCompareFacesResponseBodyData getData() {
        return this.data;
    }

    public IdDetectOcrCompareFacesResponseBody setHttpCode(Long httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public Long getHttpCode() {
        return this.httpCode;
    }

    public IdDetectOcrCompareFacesResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public IdDetectOcrCompareFacesResponseBody setOk(Boolean ok) {
        this.ok = ok;
        return this;
    }
    public Boolean getOk() {
        return this.ok;
    }

    public IdDetectOcrCompareFacesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public IdDetectOcrCompareFacesResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public static class IdDetectOcrCompareFacesResponseBodyDataCompareResultCompareResultData extends TeaModel {
        @NameInMap("Match")
        public String match;

        @NameInMap("Risks")
        public java.util.List<String> risks;

        @NameInMap("Score")
        public Double score;

        public static IdDetectOcrCompareFacesResponseBodyDataCompareResultCompareResultData build(java.util.Map<String, ?> map) throws Exception {
            IdDetectOcrCompareFacesResponseBodyDataCompareResultCompareResultData self = new IdDetectOcrCompareFacesResponseBodyDataCompareResultCompareResultData();
            return TeaModel.build(map, self);
        }

        public IdDetectOcrCompareFacesResponseBodyDataCompareResultCompareResultData setMatch(String match) {
            this.match = match;
            return this;
        }
        public String getMatch() {
            return this.match;
        }

        public IdDetectOcrCompareFacesResponseBodyDataCompareResultCompareResultData setRisks(java.util.List<String> risks) {
            this.risks = risks;
            return this;
        }
        public java.util.List<String> getRisks() {
            return this.risks;
        }

        public IdDetectOcrCompareFacesResponseBodyDataCompareResultCompareResultData setScore(Double score) {
            this.score = score;
            return this;
        }
        public Double getScore() {
            return this.score;
        }

    }

    public static class IdDetectOcrCompareFacesResponseBodyDataCompareResult extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("CompareResultData")
        public IdDetectOcrCompareFacesResponseBodyDataCompareResultCompareResultData compareResultData;

        @NameInMap("Message")
        public String message;

        public static IdDetectOcrCompareFacesResponseBodyDataCompareResult build(java.util.Map<String, ?> map) throws Exception {
            IdDetectOcrCompareFacesResponseBodyDataCompareResult self = new IdDetectOcrCompareFacesResponseBodyDataCompareResult();
            return TeaModel.build(map, self);
        }

        public IdDetectOcrCompareFacesResponseBodyDataCompareResult setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public IdDetectOcrCompareFacesResponseBodyDataCompareResult setCompareResultData(IdDetectOcrCompareFacesResponseBodyDataCompareResultCompareResultData compareResultData) {
            this.compareResultData = compareResultData;
            return this;
        }
        public IdDetectOcrCompareFacesResponseBodyDataCompareResultCompareResultData getCompareResultData() {
            return this.compareResultData;
        }

        public IdDetectOcrCompareFacesResponseBodyDataCompareResult setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

    public static class IdDetectOcrCompareFacesResponseBodyDataIdDetectResultIdDetectResultDataAntiSpoofingResult extends TeaModel {
        @NameInMap("Passed")
        public Boolean passed;

        @NameInMap("Risks")
        public java.util.List<String> risks;

        public static IdDetectOcrCompareFacesResponseBodyDataIdDetectResultIdDetectResultDataAntiSpoofingResult build(java.util.Map<String, ?> map) throws Exception {
            IdDetectOcrCompareFacesResponseBodyDataIdDetectResultIdDetectResultDataAntiSpoofingResult self = new IdDetectOcrCompareFacesResponseBodyDataIdDetectResultIdDetectResultDataAntiSpoofingResult();
            return TeaModel.build(map, self);
        }

        public IdDetectOcrCompareFacesResponseBodyDataIdDetectResultIdDetectResultDataAntiSpoofingResult setPassed(Boolean passed) {
            this.passed = passed;
            return this;
        }
        public Boolean getPassed() {
            return this.passed;
        }

        public IdDetectOcrCompareFacesResponseBodyDataIdDetectResultIdDetectResultDataAntiSpoofingResult setRisks(java.util.List<String> risks) {
            this.risks = risks;
            return this;
        }
        public java.util.List<String> getRisks() {
            return this.risks;
        }

    }

    public static class IdDetectOcrCompareFacesResponseBodyDataIdDetectResultIdDetectResultDataDetectionResult extends TeaModel {
        @NameInMap("CardRectangle")
        public java.util.List<Long> cardRectangle;

        @NameInMap("Height")
        public Long height;

        @NameInMap("PortraitRectangle")
        public java.util.List<Long> portraitRectangle;

        @NameInMap("Width")
        public Long width;

        public static IdDetectOcrCompareFacesResponseBodyDataIdDetectResultIdDetectResultDataDetectionResult build(java.util.Map<String, ?> map) throws Exception {
            IdDetectOcrCompareFacesResponseBodyDataIdDetectResultIdDetectResultDataDetectionResult self = new IdDetectOcrCompareFacesResponseBodyDataIdDetectResultIdDetectResultDataDetectionResult();
            return TeaModel.build(map, self);
        }

        public IdDetectOcrCompareFacesResponseBodyDataIdDetectResultIdDetectResultDataDetectionResult setCardRectangle(java.util.List<Long> cardRectangle) {
            this.cardRectangle = cardRectangle;
            return this;
        }
        public java.util.List<Long> getCardRectangle() {
            return this.cardRectangle;
        }

        public IdDetectOcrCompareFacesResponseBodyDataIdDetectResultIdDetectResultDataDetectionResult setHeight(Long height) {
            this.height = height;
            return this;
        }
        public Long getHeight() {
            return this.height;
        }

        public IdDetectOcrCompareFacesResponseBodyDataIdDetectResultIdDetectResultDataDetectionResult setPortraitRectangle(java.util.List<Long> portraitRectangle) {
            this.portraitRectangle = portraitRectangle;
            return this;
        }
        public java.util.List<Long> getPortraitRectangle() {
            return this.portraitRectangle;
        }

        public IdDetectOcrCompareFacesResponseBodyDataIdDetectResultIdDetectResultDataDetectionResult setWidth(Long width) {
            this.width = width;
            return this;
        }
        public Long getWidth() {
            return this.width;
        }

    }

    public static class IdDetectOcrCompareFacesResponseBodyDataIdDetectResultIdDetectResultData extends TeaModel {
        @NameInMap("AntiSpoofingResult")
        public IdDetectOcrCompareFacesResponseBodyDataIdDetectResultIdDetectResultDataAntiSpoofingResult antiSpoofingResult;

        @NameInMap("CountryCode")
        public String countryCode;

        @NameInMap("DetectionResult")
        public IdDetectOcrCompareFacesResponseBodyDataIdDetectResultIdDetectResultDataDetectionResult detectionResult;

        @NameInMap("DocumentType")
        public String documentType;

        @NameInMap("Passed")
        public Boolean passed;

        @NameInMap("Warning")
        public java.util.List<String> warning;

        public static IdDetectOcrCompareFacesResponseBodyDataIdDetectResultIdDetectResultData build(java.util.Map<String, ?> map) throws Exception {
            IdDetectOcrCompareFacesResponseBodyDataIdDetectResultIdDetectResultData self = new IdDetectOcrCompareFacesResponseBodyDataIdDetectResultIdDetectResultData();
            return TeaModel.build(map, self);
        }

        public IdDetectOcrCompareFacesResponseBodyDataIdDetectResultIdDetectResultData setAntiSpoofingResult(IdDetectOcrCompareFacesResponseBodyDataIdDetectResultIdDetectResultDataAntiSpoofingResult antiSpoofingResult) {
            this.antiSpoofingResult = antiSpoofingResult;
            return this;
        }
        public IdDetectOcrCompareFacesResponseBodyDataIdDetectResultIdDetectResultDataAntiSpoofingResult getAntiSpoofingResult() {
            return this.antiSpoofingResult;
        }

        public IdDetectOcrCompareFacesResponseBodyDataIdDetectResultIdDetectResultData setCountryCode(String countryCode) {
            this.countryCode = countryCode;
            return this;
        }
        public String getCountryCode() {
            return this.countryCode;
        }

        public IdDetectOcrCompareFacesResponseBodyDataIdDetectResultIdDetectResultData setDetectionResult(IdDetectOcrCompareFacesResponseBodyDataIdDetectResultIdDetectResultDataDetectionResult detectionResult) {
            this.detectionResult = detectionResult;
            return this;
        }
        public IdDetectOcrCompareFacesResponseBodyDataIdDetectResultIdDetectResultDataDetectionResult getDetectionResult() {
            return this.detectionResult;
        }

        public IdDetectOcrCompareFacesResponseBodyDataIdDetectResultIdDetectResultData setDocumentType(String documentType) {
            this.documentType = documentType;
            return this;
        }
        public String getDocumentType() {
            return this.documentType;
        }

        public IdDetectOcrCompareFacesResponseBodyDataIdDetectResultIdDetectResultData setPassed(Boolean passed) {
            this.passed = passed;
            return this;
        }
        public Boolean getPassed() {
            return this.passed;
        }

        public IdDetectOcrCompareFacesResponseBodyDataIdDetectResultIdDetectResultData setWarning(java.util.List<String> warning) {
            this.warning = warning;
            return this;
        }
        public java.util.List<String> getWarning() {
            return this.warning;
        }

    }

    public static class IdDetectOcrCompareFacesResponseBodyDataIdDetectResult extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("IdDetectResultData")
        public IdDetectOcrCompareFacesResponseBodyDataIdDetectResultIdDetectResultData idDetectResultData;

        @NameInMap("Message")
        public String message;

        public static IdDetectOcrCompareFacesResponseBodyDataIdDetectResult build(java.util.Map<String, ?> map) throws Exception {
            IdDetectOcrCompareFacesResponseBodyDataIdDetectResult self = new IdDetectOcrCompareFacesResponseBodyDataIdDetectResult();
            return TeaModel.build(map, self);
        }

        public IdDetectOcrCompareFacesResponseBodyDataIdDetectResult setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public IdDetectOcrCompareFacesResponseBodyDataIdDetectResult setIdDetectResultData(IdDetectOcrCompareFacesResponseBodyDataIdDetectResultIdDetectResultData idDetectResultData) {
            this.idDetectResultData = idDetectResultData;
            return this;
        }
        public IdDetectOcrCompareFacesResponseBodyDataIdDetectResultIdDetectResultData getIdDetectResultData() {
            return this.idDetectResultData;
        }

        public IdDetectOcrCompareFacesResponseBodyDataIdDetectResult setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

    public static class IdDetectOcrCompareFacesResponseBodyDataLivenessResultLivenessResultData extends TeaModel {
        @NameInMap("Liveness")
        public String liveness;

        @NameInMap("Risks")
        public java.util.List<String> risks;

        @NameInMap("Score")
        public Double score;

        public static IdDetectOcrCompareFacesResponseBodyDataLivenessResultLivenessResultData build(java.util.Map<String, ?> map) throws Exception {
            IdDetectOcrCompareFacesResponseBodyDataLivenessResultLivenessResultData self = new IdDetectOcrCompareFacesResponseBodyDataLivenessResultLivenessResultData();
            return TeaModel.build(map, self);
        }

        public IdDetectOcrCompareFacesResponseBodyDataLivenessResultLivenessResultData setLiveness(String liveness) {
            this.liveness = liveness;
            return this;
        }
        public String getLiveness() {
            return this.liveness;
        }

        public IdDetectOcrCompareFacesResponseBodyDataLivenessResultLivenessResultData setRisks(java.util.List<String> risks) {
            this.risks = risks;
            return this;
        }
        public java.util.List<String> getRisks() {
            return this.risks;
        }

        public IdDetectOcrCompareFacesResponseBodyDataLivenessResultLivenessResultData setScore(Double score) {
            this.score = score;
            return this;
        }
        public Double getScore() {
            return this.score;
        }

    }

    public static class IdDetectOcrCompareFacesResponseBodyDataLivenessResult extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("LivenessResultData")
        public IdDetectOcrCompareFacesResponseBodyDataLivenessResultLivenessResultData livenessResultData;

        @NameInMap("Message")
        public String message;

        public static IdDetectOcrCompareFacesResponseBodyDataLivenessResult build(java.util.Map<String, ?> map) throws Exception {
            IdDetectOcrCompareFacesResponseBodyDataLivenessResult self = new IdDetectOcrCompareFacesResponseBodyDataLivenessResult();
            return TeaModel.build(map, self);
        }

        public IdDetectOcrCompareFacesResponseBodyDataLivenessResult setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public IdDetectOcrCompareFacesResponseBodyDataLivenessResult setLivenessResultData(IdDetectOcrCompareFacesResponseBodyDataLivenessResultLivenessResultData livenessResultData) {
            this.livenessResultData = livenessResultData;
            return this;
        }
        public IdDetectOcrCompareFacesResponseBodyDataLivenessResultLivenessResultData getLivenessResultData() {
            return this.livenessResultData;
        }

        public IdDetectOcrCompareFacesResponseBodyDataLivenessResult setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

    public static class IdDetectOcrCompareFacesResponseBodyDataOcrResultOcrResultData extends TeaModel {
        @NameInMap("Address")
        public String address;

        @NameInMap("AddressConfidence")
        public Double addressConfidence;

        @NameInMap("AddressPosition")
        public java.util.List<Long> addressPosition;

        @NameInMap("DateOfBirth")
        public String dateOfBirth;

        @NameInMap("DateOfBirthConfidence")
        public Double dateOfBirthConfidence;

        @NameInMap("DateOfBirthPosition")
        public java.util.List<Long> dateOfBirthPosition;

        @NameInMap("DocumentNumber")
        public String documentNumber;

        @NameInMap("DocumentNumber2")
        public String documentNumber2;

        @NameInMap("DocumentNumber2Confidence")
        public Double documentNumber2Confidence;

        @NameInMap("DocumentNumber2Position")
        public java.util.List<Long> documentNumber2Position;

        @NameInMap("DocumentNumberConfidence")
        public Double documentNumberConfidence;

        @NameInMap("DocumentNumberPosition")
        public java.util.List<Long> documentNumberPosition;

        @NameInMap("ExpirationDate")
        public String expirationDate;

        @NameInMap("ExpirationDateConfidence")
        public Double expirationDateConfidence;

        @NameInMap("ExpirationDatePosition")
        public java.util.List<Long> expirationDatePosition;

        @NameInMap("FirstName")
        public String firstName;

        @NameInMap("FirstNameConfidence")
        public Double firstNameConfidence;

        @NameInMap("FirstNamePosition")
        public java.util.List<Long> firstNamePosition;

        @NameInMap("FullName")
        public String fullName;

        @NameInMap("FullNameConfidence")
        public Double fullNameConfidence;

        @NameInMap("FullNamePosition")
        public java.util.List<Long> fullNamePosition;

        @NameInMap("IssuedDate")
        public String issuedDate;

        @NameInMap("IssuedDateConfidence")
        public Double issuedDateConfidence;

        @NameInMap("IssuedDatePosition")
        public java.util.List<Long> issuedDatePosition;

        @NameInMap("IssuingAuthority")
        public String issuingAuthority;

        @NameInMap("IssuingAuthorityConfidence")
        public Double issuingAuthorityConfidence;

        @NameInMap("IssuingAuthorityPosition")
        public java.util.List<Long> issuingAuthorityPosition;

        @NameInMap("LastName")
        public String lastName;

        @NameInMap("LastNameConfidence")
        public Double lastNameConfidence;

        @NameInMap("LastNamePosition")
        public java.util.List<Long> lastNamePosition;

        @NameInMap("NationalityCode")
        public String nationalityCode;

        @NameInMap("NationalityCodeConfidence")
        public Double nationalityCodeConfidence;

        @NameInMap("NationalityCodePosition")
        public java.util.List<Long> nationalityCodePosition;

        @NameInMap("NormalizedDateOfBirth")
        public String normalizedDateOfBirth;

        @NameInMap("NormalizedExpirationDate")
        public String normalizedExpirationDate;

        @NameInMap("NormalizedIssuedDate")
        public String normalizedIssuedDate;

        @NameInMap("NormalizedNationalityCode")
        public String normalizedNationalityCode;

        @NameInMap("NormalizedSex")
        public String normalizedSex;

        @NameInMap("Sex")
        public String sex;

        @NameInMap("SexConfidence")
        public Double sexConfidence;

        @NameInMap("SexPosition")
        public java.util.List<Long> sexPosition;

        public static IdDetectOcrCompareFacesResponseBodyDataOcrResultOcrResultData build(java.util.Map<String, ?> map) throws Exception {
            IdDetectOcrCompareFacesResponseBodyDataOcrResultOcrResultData self = new IdDetectOcrCompareFacesResponseBodyDataOcrResultOcrResultData();
            return TeaModel.build(map, self);
        }

        public IdDetectOcrCompareFacesResponseBodyDataOcrResultOcrResultData setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public IdDetectOcrCompareFacesResponseBodyDataOcrResultOcrResultData setAddressConfidence(Double addressConfidence) {
            this.addressConfidence = addressConfidence;
            return this;
        }
        public Double getAddressConfidence() {
            return this.addressConfidence;
        }

        public IdDetectOcrCompareFacesResponseBodyDataOcrResultOcrResultData setAddressPosition(java.util.List<Long> addressPosition) {
            this.addressPosition = addressPosition;
            return this;
        }
        public java.util.List<Long> getAddressPosition() {
            return this.addressPosition;
        }

        public IdDetectOcrCompareFacesResponseBodyDataOcrResultOcrResultData setDateOfBirth(String dateOfBirth) {
            this.dateOfBirth = dateOfBirth;
            return this;
        }
        public String getDateOfBirth() {
            return this.dateOfBirth;
        }

        public IdDetectOcrCompareFacesResponseBodyDataOcrResultOcrResultData setDateOfBirthConfidence(Double dateOfBirthConfidence) {
            this.dateOfBirthConfidence = dateOfBirthConfidence;
            return this;
        }
        public Double getDateOfBirthConfidence() {
            return this.dateOfBirthConfidence;
        }

        public IdDetectOcrCompareFacesResponseBodyDataOcrResultOcrResultData setDateOfBirthPosition(java.util.List<Long> dateOfBirthPosition) {
            this.dateOfBirthPosition = dateOfBirthPosition;
            return this;
        }
        public java.util.List<Long> getDateOfBirthPosition() {
            return this.dateOfBirthPosition;
        }

        public IdDetectOcrCompareFacesResponseBodyDataOcrResultOcrResultData setDocumentNumber(String documentNumber) {
            this.documentNumber = documentNumber;
            return this;
        }
        public String getDocumentNumber() {
            return this.documentNumber;
        }

        public IdDetectOcrCompareFacesResponseBodyDataOcrResultOcrResultData setDocumentNumber2(String documentNumber2) {
            this.documentNumber2 = documentNumber2;
            return this;
        }
        public String getDocumentNumber2() {
            return this.documentNumber2;
        }

        public IdDetectOcrCompareFacesResponseBodyDataOcrResultOcrResultData setDocumentNumber2Confidence(Double documentNumber2Confidence) {
            this.documentNumber2Confidence = documentNumber2Confidence;
            return this;
        }
        public Double getDocumentNumber2Confidence() {
            return this.documentNumber2Confidence;
        }

        public IdDetectOcrCompareFacesResponseBodyDataOcrResultOcrResultData setDocumentNumber2Position(java.util.List<Long> documentNumber2Position) {
            this.documentNumber2Position = documentNumber2Position;
            return this;
        }
        public java.util.List<Long> getDocumentNumber2Position() {
            return this.documentNumber2Position;
        }

        public IdDetectOcrCompareFacesResponseBodyDataOcrResultOcrResultData setDocumentNumberConfidence(Double documentNumberConfidence) {
            this.documentNumberConfidence = documentNumberConfidence;
            return this;
        }
        public Double getDocumentNumberConfidence() {
            return this.documentNumberConfidence;
        }

        public IdDetectOcrCompareFacesResponseBodyDataOcrResultOcrResultData setDocumentNumberPosition(java.util.List<Long> documentNumberPosition) {
            this.documentNumberPosition = documentNumberPosition;
            return this;
        }
        public java.util.List<Long> getDocumentNumberPosition() {
            return this.documentNumberPosition;
        }

        public IdDetectOcrCompareFacesResponseBodyDataOcrResultOcrResultData setExpirationDate(String expirationDate) {
            this.expirationDate = expirationDate;
            return this;
        }
        public String getExpirationDate() {
            return this.expirationDate;
        }

        public IdDetectOcrCompareFacesResponseBodyDataOcrResultOcrResultData setExpirationDateConfidence(Double expirationDateConfidence) {
            this.expirationDateConfidence = expirationDateConfidence;
            return this;
        }
        public Double getExpirationDateConfidence() {
            return this.expirationDateConfidence;
        }

        public IdDetectOcrCompareFacesResponseBodyDataOcrResultOcrResultData setExpirationDatePosition(java.util.List<Long> expirationDatePosition) {
            this.expirationDatePosition = expirationDatePosition;
            return this;
        }
        public java.util.List<Long> getExpirationDatePosition() {
            return this.expirationDatePosition;
        }

        public IdDetectOcrCompareFacesResponseBodyDataOcrResultOcrResultData setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }
        public String getFirstName() {
            return this.firstName;
        }

        public IdDetectOcrCompareFacesResponseBodyDataOcrResultOcrResultData setFirstNameConfidence(Double firstNameConfidence) {
            this.firstNameConfidence = firstNameConfidence;
            return this;
        }
        public Double getFirstNameConfidence() {
            return this.firstNameConfidence;
        }

        public IdDetectOcrCompareFacesResponseBodyDataOcrResultOcrResultData setFirstNamePosition(java.util.List<Long> firstNamePosition) {
            this.firstNamePosition = firstNamePosition;
            return this;
        }
        public java.util.List<Long> getFirstNamePosition() {
            return this.firstNamePosition;
        }

        public IdDetectOcrCompareFacesResponseBodyDataOcrResultOcrResultData setFullName(String fullName) {
            this.fullName = fullName;
            return this;
        }
        public String getFullName() {
            return this.fullName;
        }

        public IdDetectOcrCompareFacesResponseBodyDataOcrResultOcrResultData setFullNameConfidence(Double fullNameConfidence) {
            this.fullNameConfidence = fullNameConfidence;
            return this;
        }
        public Double getFullNameConfidence() {
            return this.fullNameConfidence;
        }

        public IdDetectOcrCompareFacesResponseBodyDataOcrResultOcrResultData setFullNamePosition(java.util.List<Long> fullNamePosition) {
            this.fullNamePosition = fullNamePosition;
            return this;
        }
        public java.util.List<Long> getFullNamePosition() {
            return this.fullNamePosition;
        }

        public IdDetectOcrCompareFacesResponseBodyDataOcrResultOcrResultData setIssuedDate(String issuedDate) {
            this.issuedDate = issuedDate;
            return this;
        }
        public String getIssuedDate() {
            return this.issuedDate;
        }

        public IdDetectOcrCompareFacesResponseBodyDataOcrResultOcrResultData setIssuedDateConfidence(Double issuedDateConfidence) {
            this.issuedDateConfidence = issuedDateConfidence;
            return this;
        }
        public Double getIssuedDateConfidence() {
            return this.issuedDateConfidence;
        }

        public IdDetectOcrCompareFacesResponseBodyDataOcrResultOcrResultData setIssuedDatePosition(java.util.List<Long> issuedDatePosition) {
            this.issuedDatePosition = issuedDatePosition;
            return this;
        }
        public java.util.List<Long> getIssuedDatePosition() {
            return this.issuedDatePosition;
        }

        public IdDetectOcrCompareFacesResponseBodyDataOcrResultOcrResultData setIssuingAuthority(String issuingAuthority) {
            this.issuingAuthority = issuingAuthority;
            return this;
        }
        public String getIssuingAuthority() {
            return this.issuingAuthority;
        }

        public IdDetectOcrCompareFacesResponseBodyDataOcrResultOcrResultData setIssuingAuthorityConfidence(Double issuingAuthorityConfidence) {
            this.issuingAuthorityConfidence = issuingAuthorityConfidence;
            return this;
        }
        public Double getIssuingAuthorityConfidence() {
            return this.issuingAuthorityConfidence;
        }

        public IdDetectOcrCompareFacesResponseBodyDataOcrResultOcrResultData setIssuingAuthorityPosition(java.util.List<Long> issuingAuthorityPosition) {
            this.issuingAuthorityPosition = issuingAuthorityPosition;
            return this;
        }
        public java.util.List<Long> getIssuingAuthorityPosition() {
            return this.issuingAuthorityPosition;
        }

        public IdDetectOcrCompareFacesResponseBodyDataOcrResultOcrResultData setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }
        public String getLastName() {
            return this.lastName;
        }

        public IdDetectOcrCompareFacesResponseBodyDataOcrResultOcrResultData setLastNameConfidence(Double lastNameConfidence) {
            this.lastNameConfidence = lastNameConfidence;
            return this;
        }
        public Double getLastNameConfidence() {
            return this.lastNameConfidence;
        }

        public IdDetectOcrCompareFacesResponseBodyDataOcrResultOcrResultData setLastNamePosition(java.util.List<Long> lastNamePosition) {
            this.lastNamePosition = lastNamePosition;
            return this;
        }
        public java.util.List<Long> getLastNamePosition() {
            return this.lastNamePosition;
        }

        public IdDetectOcrCompareFacesResponseBodyDataOcrResultOcrResultData setNationalityCode(String nationalityCode) {
            this.nationalityCode = nationalityCode;
            return this;
        }
        public String getNationalityCode() {
            return this.nationalityCode;
        }

        public IdDetectOcrCompareFacesResponseBodyDataOcrResultOcrResultData setNationalityCodeConfidence(Double nationalityCodeConfidence) {
            this.nationalityCodeConfidence = nationalityCodeConfidence;
            return this;
        }
        public Double getNationalityCodeConfidence() {
            return this.nationalityCodeConfidence;
        }

        public IdDetectOcrCompareFacesResponseBodyDataOcrResultOcrResultData setNationalityCodePosition(java.util.List<Long> nationalityCodePosition) {
            this.nationalityCodePosition = nationalityCodePosition;
            return this;
        }
        public java.util.List<Long> getNationalityCodePosition() {
            return this.nationalityCodePosition;
        }

        public IdDetectOcrCompareFacesResponseBodyDataOcrResultOcrResultData setNormalizedDateOfBirth(String normalizedDateOfBirth) {
            this.normalizedDateOfBirth = normalizedDateOfBirth;
            return this;
        }
        public String getNormalizedDateOfBirth() {
            return this.normalizedDateOfBirth;
        }

        public IdDetectOcrCompareFacesResponseBodyDataOcrResultOcrResultData setNormalizedExpirationDate(String normalizedExpirationDate) {
            this.normalizedExpirationDate = normalizedExpirationDate;
            return this;
        }
        public String getNormalizedExpirationDate() {
            return this.normalizedExpirationDate;
        }

        public IdDetectOcrCompareFacesResponseBodyDataOcrResultOcrResultData setNormalizedIssuedDate(String normalizedIssuedDate) {
            this.normalizedIssuedDate = normalizedIssuedDate;
            return this;
        }
        public String getNormalizedIssuedDate() {
            return this.normalizedIssuedDate;
        }

        public IdDetectOcrCompareFacesResponseBodyDataOcrResultOcrResultData setNormalizedNationalityCode(String normalizedNationalityCode) {
            this.normalizedNationalityCode = normalizedNationalityCode;
            return this;
        }
        public String getNormalizedNationalityCode() {
            return this.normalizedNationalityCode;
        }

        public IdDetectOcrCompareFacesResponseBodyDataOcrResultOcrResultData setNormalizedSex(String normalizedSex) {
            this.normalizedSex = normalizedSex;
            return this;
        }
        public String getNormalizedSex() {
            return this.normalizedSex;
        }

        public IdDetectOcrCompareFacesResponseBodyDataOcrResultOcrResultData setSex(String sex) {
            this.sex = sex;
            return this;
        }
        public String getSex() {
            return this.sex;
        }

        public IdDetectOcrCompareFacesResponseBodyDataOcrResultOcrResultData setSexConfidence(Double sexConfidence) {
            this.sexConfidence = sexConfidence;
            return this;
        }
        public Double getSexConfidence() {
            return this.sexConfidence;
        }

        public IdDetectOcrCompareFacesResponseBodyDataOcrResultOcrResultData setSexPosition(java.util.List<Long> sexPosition) {
            this.sexPosition = sexPosition;
            return this;
        }
        public java.util.List<Long> getSexPosition() {
            return this.sexPosition;
        }

    }

    public static class IdDetectOcrCompareFacesResponseBodyDataOcrResult extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Message")
        public String message;

        @NameInMap("OcrResultData")
        public IdDetectOcrCompareFacesResponseBodyDataOcrResultOcrResultData ocrResultData;

        public static IdDetectOcrCompareFacesResponseBodyDataOcrResult build(java.util.Map<String, ?> map) throws Exception {
            IdDetectOcrCompareFacesResponseBodyDataOcrResult self = new IdDetectOcrCompareFacesResponseBodyDataOcrResult();
            return TeaModel.build(map, self);
        }

        public IdDetectOcrCompareFacesResponseBodyDataOcrResult setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public IdDetectOcrCompareFacesResponseBodyDataOcrResult setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public IdDetectOcrCompareFacesResponseBodyDataOcrResult setOcrResultData(IdDetectOcrCompareFacesResponseBodyDataOcrResultOcrResultData ocrResultData) {
            this.ocrResultData = ocrResultData;
            return this;
        }
        public IdDetectOcrCompareFacesResponseBodyDataOcrResultOcrResultData getOcrResultData() {
            return this.ocrResultData;
        }

    }

    public static class IdDetectOcrCompareFacesResponseBodyDataUnrepeatResultCardImageResultCardImageResultData extends TeaModel {
        @NameInMap("Dbname")
        public String dbname;

        @NameInMap("EntityId")
        public String entityId;

        @NameInMap("ExtraData")
        public String extraData;

        @NameInMap("Score")
        public Double score;

        public static IdDetectOcrCompareFacesResponseBodyDataUnrepeatResultCardImageResultCardImageResultData build(java.util.Map<String, ?> map) throws Exception {
            IdDetectOcrCompareFacesResponseBodyDataUnrepeatResultCardImageResultCardImageResultData self = new IdDetectOcrCompareFacesResponseBodyDataUnrepeatResultCardImageResultCardImageResultData();
            return TeaModel.build(map, self);
        }

        public IdDetectOcrCompareFacesResponseBodyDataUnrepeatResultCardImageResultCardImageResultData setDbname(String dbname) {
            this.dbname = dbname;
            return this;
        }
        public String getDbname() {
            return this.dbname;
        }

        public IdDetectOcrCompareFacesResponseBodyDataUnrepeatResultCardImageResultCardImageResultData setEntityId(String entityId) {
            this.entityId = entityId;
            return this;
        }
        public String getEntityId() {
            return this.entityId;
        }

        public IdDetectOcrCompareFacesResponseBodyDataUnrepeatResultCardImageResultCardImageResultData setExtraData(String extraData) {
            this.extraData = extraData;
            return this;
        }
        public String getExtraData() {
            return this.extraData;
        }

        public IdDetectOcrCompareFacesResponseBodyDataUnrepeatResultCardImageResultCardImageResultData setScore(Double score) {
            this.score = score;
            return this;
        }
        public Double getScore() {
            return this.score;
        }

    }

    public static class IdDetectOcrCompareFacesResponseBodyDataUnrepeatResultCardImageResult extends TeaModel {
        @NameInMap("CardImageResultData")
        public IdDetectOcrCompareFacesResponseBodyDataUnrepeatResultCardImageResultCardImageResultData cardImageResultData;

        @NameInMap("Code")
        public String code;

        @NameInMap("Message")
        public String message;

        public static IdDetectOcrCompareFacesResponseBodyDataUnrepeatResultCardImageResult build(java.util.Map<String, ?> map) throws Exception {
            IdDetectOcrCompareFacesResponseBodyDataUnrepeatResultCardImageResult self = new IdDetectOcrCompareFacesResponseBodyDataUnrepeatResultCardImageResult();
            return TeaModel.build(map, self);
        }

        public IdDetectOcrCompareFacesResponseBodyDataUnrepeatResultCardImageResult setCardImageResultData(IdDetectOcrCompareFacesResponseBodyDataUnrepeatResultCardImageResultCardImageResultData cardImageResultData) {
            this.cardImageResultData = cardImageResultData;
            return this;
        }
        public IdDetectOcrCompareFacesResponseBodyDataUnrepeatResultCardImageResultCardImageResultData getCardImageResultData() {
            return this.cardImageResultData;
        }

        public IdDetectOcrCompareFacesResponseBodyDataUnrepeatResultCardImageResult setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public IdDetectOcrCompareFacesResponseBodyDataUnrepeatResultCardImageResult setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

    }

    public static class IdDetectOcrCompareFacesResponseBodyDataUnrepeatResultPortraitImageResultPortraitImageResultData extends TeaModel {
        @NameInMap("Dbname")
        public String dbname;

        @NameInMap("EntityId")
        public String entityId;

        @NameInMap("ExtraData")
        public String extraData;

        @NameInMap("Score")
        public Double score;

        public static IdDetectOcrCompareFacesResponseBodyDataUnrepeatResultPortraitImageResultPortraitImageResultData build(java.util.Map<String, ?> map) throws Exception {
            IdDetectOcrCompareFacesResponseBodyDataUnrepeatResultPortraitImageResultPortraitImageResultData self = new IdDetectOcrCompareFacesResponseBodyDataUnrepeatResultPortraitImageResultPortraitImageResultData();
            return TeaModel.build(map, self);
        }

        public IdDetectOcrCompareFacesResponseBodyDataUnrepeatResultPortraitImageResultPortraitImageResultData setDbname(String dbname) {
            this.dbname = dbname;
            return this;
        }
        public String getDbname() {
            return this.dbname;
        }

        public IdDetectOcrCompareFacesResponseBodyDataUnrepeatResultPortraitImageResultPortraitImageResultData setEntityId(String entityId) {
            this.entityId = entityId;
            return this;
        }
        public String getEntityId() {
            return this.entityId;
        }

        public IdDetectOcrCompareFacesResponseBodyDataUnrepeatResultPortraitImageResultPortraitImageResultData setExtraData(String extraData) {
            this.extraData = extraData;
            return this;
        }
        public String getExtraData() {
            return this.extraData;
        }

        public IdDetectOcrCompareFacesResponseBodyDataUnrepeatResultPortraitImageResultPortraitImageResultData setScore(Double score) {
            this.score = score;
            return this;
        }
        public Double getScore() {
            return this.score;
        }

    }

    public static class IdDetectOcrCompareFacesResponseBodyDataUnrepeatResultPortraitImageResult extends TeaModel {
        @NameInMap("Code")
        public String code;

        @NameInMap("Message")
        public String message;

        @NameInMap("PortraitImageResultData")
        public IdDetectOcrCompareFacesResponseBodyDataUnrepeatResultPortraitImageResultPortraitImageResultData portraitImageResultData;

        public static IdDetectOcrCompareFacesResponseBodyDataUnrepeatResultPortraitImageResult build(java.util.Map<String, ?> map) throws Exception {
            IdDetectOcrCompareFacesResponseBodyDataUnrepeatResultPortraitImageResult self = new IdDetectOcrCompareFacesResponseBodyDataUnrepeatResultPortraitImageResult();
            return TeaModel.build(map, self);
        }

        public IdDetectOcrCompareFacesResponseBodyDataUnrepeatResultPortraitImageResult setCode(String code) {
            this.code = code;
            return this;
        }
        public String getCode() {
            return this.code;
        }

        public IdDetectOcrCompareFacesResponseBodyDataUnrepeatResultPortraitImageResult setMessage(String message) {
            this.message = message;
            return this;
        }
        public String getMessage() {
            return this.message;
        }

        public IdDetectOcrCompareFacesResponseBodyDataUnrepeatResultPortraitImageResult setPortraitImageResultData(IdDetectOcrCompareFacesResponseBodyDataUnrepeatResultPortraitImageResultPortraitImageResultData portraitImageResultData) {
            this.portraitImageResultData = portraitImageResultData;
            return this;
        }
        public IdDetectOcrCompareFacesResponseBodyDataUnrepeatResultPortraitImageResultPortraitImageResultData getPortraitImageResultData() {
            return this.portraitImageResultData;
        }

    }

    public static class IdDetectOcrCompareFacesResponseBodyDataUnrepeatResult extends TeaModel {
        @NameInMap("CardImageResult")
        public IdDetectOcrCompareFacesResponseBodyDataUnrepeatResultCardImageResult cardImageResult;

        @NameInMap("PortraitImageResult")
        public IdDetectOcrCompareFacesResponseBodyDataUnrepeatResultPortraitImageResult portraitImageResult;

        public static IdDetectOcrCompareFacesResponseBodyDataUnrepeatResult build(java.util.Map<String, ?> map) throws Exception {
            IdDetectOcrCompareFacesResponseBodyDataUnrepeatResult self = new IdDetectOcrCompareFacesResponseBodyDataUnrepeatResult();
            return TeaModel.build(map, self);
        }

        public IdDetectOcrCompareFacesResponseBodyDataUnrepeatResult setCardImageResult(IdDetectOcrCompareFacesResponseBodyDataUnrepeatResultCardImageResult cardImageResult) {
            this.cardImageResult = cardImageResult;
            return this;
        }
        public IdDetectOcrCompareFacesResponseBodyDataUnrepeatResultCardImageResult getCardImageResult() {
            return this.cardImageResult;
        }

        public IdDetectOcrCompareFacesResponseBodyDataUnrepeatResult setPortraitImageResult(IdDetectOcrCompareFacesResponseBodyDataUnrepeatResultPortraitImageResult portraitImageResult) {
            this.portraitImageResult = portraitImageResult;
            return this;
        }
        public IdDetectOcrCompareFacesResponseBodyDataUnrepeatResultPortraitImageResult getPortraitImageResult() {
            return this.portraitImageResult;
        }

    }

    public static class IdDetectOcrCompareFacesResponseBodyData extends TeaModel {
        @NameInMap("CompareResult")
        public IdDetectOcrCompareFacesResponseBodyDataCompareResult compareResult;

        @NameInMap("IdDetectResult")
        public IdDetectOcrCompareFacesResponseBodyDataIdDetectResult idDetectResult;

        @NameInMap("LivenessResult")
        public IdDetectOcrCompareFacesResponseBodyDataLivenessResult livenessResult;

        @NameInMap("OcrResult")
        public IdDetectOcrCompareFacesResponseBodyDataOcrResult ocrResult;

        @NameInMap("UnrepeatResult")
        public IdDetectOcrCompareFacesResponseBodyDataUnrepeatResult unrepeatResult;

        public static IdDetectOcrCompareFacesResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            IdDetectOcrCompareFacesResponseBodyData self = new IdDetectOcrCompareFacesResponseBodyData();
            return TeaModel.build(map, self);
        }

        public IdDetectOcrCompareFacesResponseBodyData setCompareResult(IdDetectOcrCompareFacesResponseBodyDataCompareResult compareResult) {
            this.compareResult = compareResult;
            return this;
        }
        public IdDetectOcrCompareFacesResponseBodyDataCompareResult getCompareResult() {
            return this.compareResult;
        }

        public IdDetectOcrCompareFacesResponseBodyData setIdDetectResult(IdDetectOcrCompareFacesResponseBodyDataIdDetectResult idDetectResult) {
            this.idDetectResult = idDetectResult;
            return this;
        }
        public IdDetectOcrCompareFacesResponseBodyDataIdDetectResult getIdDetectResult() {
            return this.idDetectResult;
        }

        public IdDetectOcrCompareFacesResponseBodyData setLivenessResult(IdDetectOcrCompareFacesResponseBodyDataLivenessResult livenessResult) {
            this.livenessResult = livenessResult;
            return this;
        }
        public IdDetectOcrCompareFacesResponseBodyDataLivenessResult getLivenessResult() {
            return this.livenessResult;
        }

        public IdDetectOcrCompareFacesResponseBodyData setOcrResult(IdDetectOcrCompareFacesResponseBodyDataOcrResult ocrResult) {
            this.ocrResult = ocrResult;
            return this;
        }
        public IdDetectOcrCompareFacesResponseBodyDataOcrResult getOcrResult() {
            return this.ocrResult;
        }

        public IdDetectOcrCompareFacesResponseBodyData setUnrepeatResult(IdDetectOcrCompareFacesResponseBodyDataUnrepeatResult unrepeatResult) {
            this.unrepeatResult = unrepeatResult;
            return this;
        }
        public IdDetectOcrCompareFacesResponseBodyDataUnrepeatResult getUnrepeatResult() {
            return this.unrepeatResult;
        }

    }

}
