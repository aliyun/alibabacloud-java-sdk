// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ekyc_saas20230112.models;

import com.aliyun.tea.*;

public class IdDetectionAndScanDocumentResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public IdDetectionAndScanDocumentResponseBodyData data;

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

    public static IdDetectionAndScanDocumentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        IdDetectionAndScanDocumentResponseBody self = new IdDetectionAndScanDocumentResponseBody();
        return TeaModel.build(map, self);
    }

    public IdDetectionAndScanDocumentResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public IdDetectionAndScanDocumentResponseBody setData(IdDetectionAndScanDocumentResponseBodyData data) {
        this.data = data;
        return this;
    }
    public IdDetectionAndScanDocumentResponseBodyData getData() {
        return this.data;
    }

    public IdDetectionAndScanDocumentResponseBody setHttpCode(Long httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public Long getHttpCode() {
        return this.httpCode;
    }

    public IdDetectionAndScanDocumentResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public IdDetectionAndScanDocumentResponseBody setOk(Boolean ok) {
        this.ok = ok;
        return this;
    }
    public Boolean getOk() {
        return this.ok;
    }

    public IdDetectionAndScanDocumentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public IdDetectionAndScanDocumentResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public static class IdDetectionAndScanDocumentResponseBodyDataIdDetectResultAntiSpoofingResult extends TeaModel {
        @NameInMap("Passed")
        public Boolean passed;

        @NameInMap("Risks")
        public java.util.List<String> risks;

        public static IdDetectionAndScanDocumentResponseBodyDataIdDetectResultAntiSpoofingResult build(java.util.Map<String, ?> map) throws Exception {
            IdDetectionAndScanDocumentResponseBodyDataIdDetectResultAntiSpoofingResult self = new IdDetectionAndScanDocumentResponseBodyDataIdDetectResultAntiSpoofingResult();
            return TeaModel.build(map, self);
        }

        public IdDetectionAndScanDocumentResponseBodyDataIdDetectResultAntiSpoofingResult setPassed(Boolean passed) {
            this.passed = passed;
            return this;
        }
        public Boolean getPassed() {
            return this.passed;
        }

        public IdDetectionAndScanDocumentResponseBodyDataIdDetectResultAntiSpoofingResult setRisks(java.util.List<String> risks) {
            this.risks = risks;
            return this;
        }
        public java.util.List<String> getRisks() {
            return this.risks;
        }

    }

    public static class IdDetectionAndScanDocumentResponseBodyDataIdDetectResultDetectionResult extends TeaModel {
        @NameInMap("CardRectangle")
        public java.util.List<Long> cardRectangle;

        @NameInMap("Height")
        public Long height;

        @NameInMap("PortraitRectangle")
        public java.util.List<Long> portraitRectangle;

        @NameInMap("Width")
        public Long width;

        public static IdDetectionAndScanDocumentResponseBodyDataIdDetectResultDetectionResult build(java.util.Map<String, ?> map) throws Exception {
            IdDetectionAndScanDocumentResponseBodyDataIdDetectResultDetectionResult self = new IdDetectionAndScanDocumentResponseBodyDataIdDetectResultDetectionResult();
            return TeaModel.build(map, self);
        }

        public IdDetectionAndScanDocumentResponseBodyDataIdDetectResultDetectionResult setCardRectangle(java.util.List<Long> cardRectangle) {
            this.cardRectangle = cardRectangle;
            return this;
        }
        public java.util.List<Long> getCardRectangle() {
            return this.cardRectangle;
        }

        public IdDetectionAndScanDocumentResponseBodyDataIdDetectResultDetectionResult setHeight(Long height) {
            this.height = height;
            return this;
        }
        public Long getHeight() {
            return this.height;
        }

        public IdDetectionAndScanDocumentResponseBodyDataIdDetectResultDetectionResult setPortraitRectangle(java.util.List<Long> portraitRectangle) {
            this.portraitRectangle = portraitRectangle;
            return this;
        }
        public java.util.List<Long> getPortraitRectangle() {
            return this.portraitRectangle;
        }

        public IdDetectionAndScanDocumentResponseBodyDataIdDetectResultDetectionResult setWidth(Long width) {
            this.width = width;
            return this;
        }
        public Long getWidth() {
            return this.width;
        }

    }

    public static class IdDetectionAndScanDocumentResponseBodyDataIdDetectResult extends TeaModel {
        @NameInMap("AntiSpoofingResult")
        public IdDetectionAndScanDocumentResponseBodyDataIdDetectResultAntiSpoofingResult antiSpoofingResult;

        @NameInMap("CountryCode")
        public String countryCode;

        @NameInMap("DetectionResult")
        public IdDetectionAndScanDocumentResponseBodyDataIdDetectResultDetectionResult detectionResult;

        @NameInMap("DocumentType")
        public String documentType;

        @NameInMap("Passed")
        public Boolean passed;

        @NameInMap("Warning")
        public java.util.List<String> warning;

        public static IdDetectionAndScanDocumentResponseBodyDataIdDetectResult build(java.util.Map<String, ?> map) throws Exception {
            IdDetectionAndScanDocumentResponseBodyDataIdDetectResult self = new IdDetectionAndScanDocumentResponseBodyDataIdDetectResult();
            return TeaModel.build(map, self);
        }

        public IdDetectionAndScanDocumentResponseBodyDataIdDetectResult setAntiSpoofingResult(IdDetectionAndScanDocumentResponseBodyDataIdDetectResultAntiSpoofingResult antiSpoofingResult) {
            this.antiSpoofingResult = antiSpoofingResult;
            return this;
        }
        public IdDetectionAndScanDocumentResponseBodyDataIdDetectResultAntiSpoofingResult getAntiSpoofingResult() {
            return this.antiSpoofingResult;
        }

        public IdDetectionAndScanDocumentResponseBodyDataIdDetectResult setCountryCode(String countryCode) {
            this.countryCode = countryCode;
            return this;
        }
        public String getCountryCode() {
            return this.countryCode;
        }

        public IdDetectionAndScanDocumentResponseBodyDataIdDetectResult setDetectionResult(IdDetectionAndScanDocumentResponseBodyDataIdDetectResultDetectionResult detectionResult) {
            this.detectionResult = detectionResult;
            return this;
        }
        public IdDetectionAndScanDocumentResponseBodyDataIdDetectResultDetectionResult getDetectionResult() {
            return this.detectionResult;
        }

        public IdDetectionAndScanDocumentResponseBodyDataIdDetectResult setDocumentType(String documentType) {
            this.documentType = documentType;
            return this;
        }
        public String getDocumentType() {
            return this.documentType;
        }

        public IdDetectionAndScanDocumentResponseBodyDataIdDetectResult setPassed(Boolean passed) {
            this.passed = passed;
            return this;
        }
        public Boolean getPassed() {
            return this.passed;
        }

        public IdDetectionAndScanDocumentResponseBodyDataIdDetectResult setWarning(java.util.List<String> warning) {
            this.warning = warning;
            return this;
        }
        public java.util.List<String> getWarning() {
            return this.warning;
        }

    }

    public static class IdDetectionAndScanDocumentResponseBodyDataOcrResult extends TeaModel {
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

        public static IdDetectionAndScanDocumentResponseBodyDataOcrResult build(java.util.Map<String, ?> map) throws Exception {
            IdDetectionAndScanDocumentResponseBodyDataOcrResult self = new IdDetectionAndScanDocumentResponseBodyDataOcrResult();
            return TeaModel.build(map, self);
        }

        public IdDetectionAndScanDocumentResponseBodyDataOcrResult setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public IdDetectionAndScanDocumentResponseBodyDataOcrResult setAddressConfidence(Double addressConfidence) {
            this.addressConfidence = addressConfidence;
            return this;
        }
        public Double getAddressConfidence() {
            return this.addressConfidence;
        }

        public IdDetectionAndScanDocumentResponseBodyDataOcrResult setAddressPosition(java.util.List<Long> addressPosition) {
            this.addressPosition = addressPosition;
            return this;
        }
        public java.util.List<Long> getAddressPosition() {
            return this.addressPosition;
        }

        public IdDetectionAndScanDocumentResponseBodyDataOcrResult setDateOfBirth(String dateOfBirth) {
            this.dateOfBirth = dateOfBirth;
            return this;
        }
        public String getDateOfBirth() {
            return this.dateOfBirth;
        }

        public IdDetectionAndScanDocumentResponseBodyDataOcrResult setDateOfBirthConfidence(Double dateOfBirthConfidence) {
            this.dateOfBirthConfidence = dateOfBirthConfidence;
            return this;
        }
        public Double getDateOfBirthConfidence() {
            return this.dateOfBirthConfidence;
        }

        public IdDetectionAndScanDocumentResponseBodyDataOcrResult setDateOfBirthPosition(java.util.List<Long> dateOfBirthPosition) {
            this.dateOfBirthPosition = dateOfBirthPosition;
            return this;
        }
        public java.util.List<Long> getDateOfBirthPosition() {
            return this.dateOfBirthPosition;
        }

        public IdDetectionAndScanDocumentResponseBodyDataOcrResult setDocumentNumber(String documentNumber) {
            this.documentNumber = documentNumber;
            return this;
        }
        public String getDocumentNumber() {
            return this.documentNumber;
        }

        public IdDetectionAndScanDocumentResponseBodyDataOcrResult setDocumentNumber2(String documentNumber2) {
            this.documentNumber2 = documentNumber2;
            return this;
        }
        public String getDocumentNumber2() {
            return this.documentNumber2;
        }

        public IdDetectionAndScanDocumentResponseBodyDataOcrResult setDocumentNumber2Confidence(Double documentNumber2Confidence) {
            this.documentNumber2Confidence = documentNumber2Confidence;
            return this;
        }
        public Double getDocumentNumber2Confidence() {
            return this.documentNumber2Confidence;
        }

        public IdDetectionAndScanDocumentResponseBodyDataOcrResult setDocumentNumber2Position(java.util.List<Long> documentNumber2Position) {
            this.documentNumber2Position = documentNumber2Position;
            return this;
        }
        public java.util.List<Long> getDocumentNumber2Position() {
            return this.documentNumber2Position;
        }

        public IdDetectionAndScanDocumentResponseBodyDataOcrResult setDocumentNumberConfidence(Double documentNumberConfidence) {
            this.documentNumberConfidence = documentNumberConfidence;
            return this;
        }
        public Double getDocumentNumberConfidence() {
            return this.documentNumberConfidence;
        }

        public IdDetectionAndScanDocumentResponseBodyDataOcrResult setDocumentNumberPosition(java.util.List<Long> documentNumberPosition) {
            this.documentNumberPosition = documentNumberPosition;
            return this;
        }
        public java.util.List<Long> getDocumentNumberPosition() {
            return this.documentNumberPosition;
        }

        public IdDetectionAndScanDocumentResponseBodyDataOcrResult setExpirationDate(String expirationDate) {
            this.expirationDate = expirationDate;
            return this;
        }
        public String getExpirationDate() {
            return this.expirationDate;
        }

        public IdDetectionAndScanDocumentResponseBodyDataOcrResult setExpirationDateConfidence(Double expirationDateConfidence) {
            this.expirationDateConfidence = expirationDateConfidence;
            return this;
        }
        public Double getExpirationDateConfidence() {
            return this.expirationDateConfidence;
        }

        public IdDetectionAndScanDocumentResponseBodyDataOcrResult setExpirationDatePosition(java.util.List<Long> expirationDatePosition) {
            this.expirationDatePosition = expirationDatePosition;
            return this;
        }
        public java.util.List<Long> getExpirationDatePosition() {
            return this.expirationDatePosition;
        }

        public IdDetectionAndScanDocumentResponseBodyDataOcrResult setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }
        public String getFirstName() {
            return this.firstName;
        }

        public IdDetectionAndScanDocumentResponseBodyDataOcrResult setFirstNameConfidence(Double firstNameConfidence) {
            this.firstNameConfidence = firstNameConfidence;
            return this;
        }
        public Double getFirstNameConfidence() {
            return this.firstNameConfidence;
        }

        public IdDetectionAndScanDocumentResponseBodyDataOcrResult setFirstNamePosition(java.util.List<Long> firstNamePosition) {
            this.firstNamePosition = firstNamePosition;
            return this;
        }
        public java.util.List<Long> getFirstNamePosition() {
            return this.firstNamePosition;
        }

        public IdDetectionAndScanDocumentResponseBodyDataOcrResult setFullName(String fullName) {
            this.fullName = fullName;
            return this;
        }
        public String getFullName() {
            return this.fullName;
        }

        public IdDetectionAndScanDocumentResponseBodyDataOcrResult setFullNameConfidence(Double fullNameConfidence) {
            this.fullNameConfidence = fullNameConfidence;
            return this;
        }
        public Double getFullNameConfidence() {
            return this.fullNameConfidence;
        }

        public IdDetectionAndScanDocumentResponseBodyDataOcrResult setFullNamePosition(java.util.List<Long> fullNamePosition) {
            this.fullNamePosition = fullNamePosition;
            return this;
        }
        public java.util.List<Long> getFullNamePosition() {
            return this.fullNamePosition;
        }

        public IdDetectionAndScanDocumentResponseBodyDataOcrResult setIssuedDate(String issuedDate) {
            this.issuedDate = issuedDate;
            return this;
        }
        public String getIssuedDate() {
            return this.issuedDate;
        }

        public IdDetectionAndScanDocumentResponseBodyDataOcrResult setIssuedDateConfidence(Double issuedDateConfidence) {
            this.issuedDateConfidence = issuedDateConfidence;
            return this;
        }
        public Double getIssuedDateConfidence() {
            return this.issuedDateConfidence;
        }

        public IdDetectionAndScanDocumentResponseBodyDataOcrResult setIssuedDatePosition(java.util.List<Long> issuedDatePosition) {
            this.issuedDatePosition = issuedDatePosition;
            return this;
        }
        public java.util.List<Long> getIssuedDatePosition() {
            return this.issuedDatePosition;
        }

        public IdDetectionAndScanDocumentResponseBodyDataOcrResult setIssuingAuthority(String issuingAuthority) {
            this.issuingAuthority = issuingAuthority;
            return this;
        }
        public String getIssuingAuthority() {
            return this.issuingAuthority;
        }

        public IdDetectionAndScanDocumentResponseBodyDataOcrResult setIssuingAuthorityConfidence(Double issuingAuthorityConfidence) {
            this.issuingAuthorityConfidence = issuingAuthorityConfidence;
            return this;
        }
        public Double getIssuingAuthorityConfidence() {
            return this.issuingAuthorityConfidence;
        }

        public IdDetectionAndScanDocumentResponseBodyDataOcrResult setIssuingAuthorityPosition(java.util.List<Long> issuingAuthorityPosition) {
            this.issuingAuthorityPosition = issuingAuthorityPosition;
            return this;
        }
        public java.util.List<Long> getIssuingAuthorityPosition() {
            return this.issuingAuthorityPosition;
        }

        public IdDetectionAndScanDocumentResponseBodyDataOcrResult setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }
        public String getLastName() {
            return this.lastName;
        }

        public IdDetectionAndScanDocumentResponseBodyDataOcrResult setLastNameConfidence(Double lastNameConfidence) {
            this.lastNameConfidence = lastNameConfidence;
            return this;
        }
        public Double getLastNameConfidence() {
            return this.lastNameConfidence;
        }

        public IdDetectionAndScanDocumentResponseBodyDataOcrResult setLastNamePosition(java.util.List<Long> lastNamePosition) {
            this.lastNamePosition = lastNamePosition;
            return this;
        }
        public java.util.List<Long> getLastNamePosition() {
            return this.lastNamePosition;
        }

        public IdDetectionAndScanDocumentResponseBodyDataOcrResult setNationalityCode(String nationalityCode) {
            this.nationalityCode = nationalityCode;
            return this;
        }
        public String getNationalityCode() {
            return this.nationalityCode;
        }

        public IdDetectionAndScanDocumentResponseBodyDataOcrResult setNationalityCodeConfidence(Double nationalityCodeConfidence) {
            this.nationalityCodeConfidence = nationalityCodeConfidence;
            return this;
        }
        public Double getNationalityCodeConfidence() {
            return this.nationalityCodeConfidence;
        }

        public IdDetectionAndScanDocumentResponseBodyDataOcrResult setNationalityCodePosition(java.util.List<Long> nationalityCodePosition) {
            this.nationalityCodePosition = nationalityCodePosition;
            return this;
        }
        public java.util.List<Long> getNationalityCodePosition() {
            return this.nationalityCodePosition;
        }

        public IdDetectionAndScanDocumentResponseBodyDataOcrResult setNormalizedDateOfBirth(String normalizedDateOfBirth) {
            this.normalizedDateOfBirth = normalizedDateOfBirth;
            return this;
        }
        public String getNormalizedDateOfBirth() {
            return this.normalizedDateOfBirth;
        }

        public IdDetectionAndScanDocumentResponseBodyDataOcrResult setNormalizedExpirationDate(String normalizedExpirationDate) {
            this.normalizedExpirationDate = normalizedExpirationDate;
            return this;
        }
        public String getNormalizedExpirationDate() {
            return this.normalizedExpirationDate;
        }

        public IdDetectionAndScanDocumentResponseBodyDataOcrResult setNormalizedIssuedDate(String normalizedIssuedDate) {
            this.normalizedIssuedDate = normalizedIssuedDate;
            return this;
        }
        public String getNormalizedIssuedDate() {
            return this.normalizedIssuedDate;
        }

        public IdDetectionAndScanDocumentResponseBodyDataOcrResult setNormalizedNationalityCode(String normalizedNationalityCode) {
            this.normalizedNationalityCode = normalizedNationalityCode;
            return this;
        }
        public String getNormalizedNationalityCode() {
            return this.normalizedNationalityCode;
        }

        public IdDetectionAndScanDocumentResponseBodyDataOcrResult setNormalizedSex(String normalizedSex) {
            this.normalizedSex = normalizedSex;
            return this;
        }
        public String getNormalizedSex() {
            return this.normalizedSex;
        }

        public IdDetectionAndScanDocumentResponseBodyDataOcrResult setSex(String sex) {
            this.sex = sex;
            return this;
        }
        public String getSex() {
            return this.sex;
        }

        public IdDetectionAndScanDocumentResponseBodyDataOcrResult setSexConfidence(Double sexConfidence) {
            this.sexConfidence = sexConfidence;
            return this;
        }
        public Double getSexConfidence() {
            return this.sexConfidence;
        }

        public IdDetectionAndScanDocumentResponseBodyDataOcrResult setSexPosition(java.util.List<Long> sexPosition) {
            this.sexPosition = sexPosition;
            return this;
        }
        public java.util.List<Long> getSexPosition() {
            return this.sexPosition;
        }

    }

    public static class IdDetectionAndScanDocumentResponseBodyData extends TeaModel {
        @NameInMap("IdDetectResult")
        public IdDetectionAndScanDocumentResponseBodyDataIdDetectResult idDetectResult;

        @NameInMap("OcrResult")
        public IdDetectionAndScanDocumentResponseBodyDataOcrResult ocrResult;

        public static IdDetectionAndScanDocumentResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            IdDetectionAndScanDocumentResponseBodyData self = new IdDetectionAndScanDocumentResponseBodyData();
            return TeaModel.build(map, self);
        }

        public IdDetectionAndScanDocumentResponseBodyData setIdDetectResult(IdDetectionAndScanDocumentResponseBodyDataIdDetectResult idDetectResult) {
            this.idDetectResult = idDetectResult;
            return this;
        }
        public IdDetectionAndScanDocumentResponseBodyDataIdDetectResult getIdDetectResult() {
            return this.idDetectResult;
        }

        public IdDetectionAndScanDocumentResponseBodyData setOcrResult(IdDetectionAndScanDocumentResponseBodyDataOcrResult ocrResult) {
            this.ocrResult = ocrResult;
            return this;
        }
        public IdDetectionAndScanDocumentResponseBodyDataOcrResult getOcrResult() {
            return this.ocrResult;
        }

    }

}
