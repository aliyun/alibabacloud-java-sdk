// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.ekyc_saas20230112.models;

import com.aliyun.tea.*;

public class ScanDocumentResponseBody extends TeaModel {
    /**
     * <p>The error code. A value of 0 indicates that the request is successful.</p>
     */
    @NameInMap("Code")
    public String code;

    /**
     * <p>The returned data.</p>
     */
    @NameInMap("Data")
    public ScanDocumentResponseBodyData data;

    /**
     * <p>The HTTP status code.</p>
     */
    @NameInMap("HttpCode")
    public Long httpCode;

    /**
     * <p>The error messages.</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>Indicates whether the request is successful.</p>
     * <br>
     * <p>Valid values:</p>
     * <br>
     * <p>*   true</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>*   false</p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     * <br>
     * <p>    <!-- --></p>
     */
    @NameInMap("Ok")
    public Boolean ok;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The status of the request.</p>
     */
    @NameInMap("Status")
    public String status;

    public static ScanDocumentResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ScanDocumentResponseBody self = new ScanDocumentResponseBody();
        return TeaModel.build(map, self);
    }

    public ScanDocumentResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public ScanDocumentResponseBody setData(ScanDocumentResponseBodyData data) {
        this.data = data;
        return this;
    }
    public ScanDocumentResponseBodyData getData() {
        return this.data;
    }

    public ScanDocumentResponseBody setHttpCode(Long httpCode) {
        this.httpCode = httpCode;
        return this;
    }
    public Long getHttpCode() {
        return this.httpCode;
    }

    public ScanDocumentResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public ScanDocumentResponseBody setOk(Boolean ok) {
        this.ok = ok;
        return this;
    }
    public Boolean getOk() {
        return this.ok;
    }

    public ScanDocumentResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ScanDocumentResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public static class ScanDocumentResponseBodyData extends TeaModel {
        /**
         * <p>The address.</p>
         */
        @NameInMap("Address")
        public String address;

        /**
         * <p>The confidence level of the recognized Address.</p>
         */
        @NameInMap("AddressConfidence")
        public Double addressConfidence;

        /**
         * <p>The coordinates of four vertices of the Address field area in the clockwise sequence: the upper left, upper right, lower right, and lower left.</p>
         */
        @NameInMap("AddressPosition")
        public java.util.List<Long> addressPosition;

        /**
         * <p>The date of birth.</p>
         */
        @NameInMap("DateOfBirth")
        public String dateOfBirth;

        /**
         * <p>The confidence level of the recognized DateOfBirth.</p>
         */
        @NameInMap("DateOfBirthConfidence")
        public Double dateOfBirthConfidence;

        /**
         * <p>The coordinates of four vertices of the DateOfBirth field area in the clockwise sequence: the upper left, upper right, lower right, and lower left.</p>
         */
        @NameInMap("DateOfBirthPosition")
        public java.util.List<Long> dateOfBirthPosition;

        /**
         * <p>The certificate number.</p>
         */
        @NameInMap("DocumentNumber")
        public String documentNumber;

        /**
         * <p>The secondary certificate number.</p>
         */
        @NameInMap("DocumentNumber2")
        public String documentNumber2;

        /**
         * <p>The confidence level of the recognized DocumentNumber2.</p>
         */
        @NameInMap("DocumentNumber2Confidence")
        public Double documentNumber2Confidence;

        /**
         * <p>The coordinates of four vertices of the DocumentNumber2 field area in the clockwise sequence: the upper left, upper right, lower right, and lower left.</p>
         */
        @NameInMap("DocumentNumber2Position")
        public java.util.List<Long> documentNumber2Position;

        /**
         * <p>The confidence level of the recognized DocumentNumber.</p>
         */
        @NameInMap("DocumentNumberConfidence")
        public Double documentNumberConfidence;

        /**
         * <p>The coordinates of four vertices of the DocumentNumber field area in the clockwise sequence: the upper left, upper right, lower right, and lower left.</p>
         */
        @NameInMap("DocumentNumberPosition")
        public java.util.List<Long> documentNumberPosition;

        /**
         * <p>The expiration date of the certificate.</p>
         */
        @NameInMap("ExpirationDate")
        public String expirationDate;

        /**
         * <p>The confidence level of the recognized ExpirationDate.</p>
         */
        @NameInMap("ExpirationDateConfidence")
        public Double expirationDateConfidence;

        /**
         * <p>The coordinates of four vertices of the ExpirationDate field area in the clockwise sequence: the upper left, upper right, lower right, and lower left.</p>
         */
        @NameInMap("ExpirationDatePosition")
        public java.util.List<Long> expirationDatePosition;

        /**
         * <p>The first name.</p>
         */
        @NameInMap("FirstName")
        public String firstName;

        /**
         * <p>The confidence level of the recognized FirstName field.</p>
         */
        @NameInMap("FirstNameConfidence")
        public Double firstNameConfidence;

        /**
         * <p>The coordinates of four vertices of the FirstName field area in the clockwise sequence: the upper left, upper right, lower right, and lower left.</p>
         */
        @NameInMap("FirstNamePosition")
        public java.util.List<Long> firstNamePosition;

        /**
         * <p>The full name.</p>
         */
        @NameInMap("FullName")
        public String fullName;

        /**
         * <p>The confidence level of the recognized FullName.</p>
         */
        @NameInMap("FullNameConfidence")
        public Double fullNameConfidence;

        /**
         * <p>The coordinates of four vertices of the FullName field area in the clockwise sequence: the upper left, upper right, lower right, and lower left.</p>
         */
        @NameInMap("FullNamePosition")
        public java.util.List<Long> fullNamePosition;

        /**
         * <p>The date of issue.</p>
         */
        @NameInMap("IssuedDate")
        public String issuedDate;

        /**
         * <p>The confidence level of the recognized IssuedDate.</p>
         */
        @NameInMap("IssuedDateConfidence")
        public Double issuedDateConfidence;

        /**
         * <p>The coordinates of four vertices of the IssuedDate field area in the clockwise sequence: the upper left, upper right, lower right, and lower left.</p>
         */
        @NameInMap("IssuedDatePosition")
        public java.util.List<Long> issuedDatePosition;

        /**
         * <p>The organization that issued the certificate.</p>
         */
        @NameInMap("IssuingAuthority")
        public String issuingAuthority;

        /**
         * <p>The confidence level of the recognized IssuingAuthority.</p>
         */
        @NameInMap("IssuingAuthorityConfidence")
        public Double issuingAuthorityConfidence;

        /**
         * <p>The coordinates of four vertices of the IssuingAuthority field area in the clockwise sequence: the upper left, upper right, lower right, and lower left.</p>
         */
        @NameInMap("IssuingAuthorityPosition")
        public java.util.List<Long> issuingAuthorityPosition;

        /**
         * <p>The last name.</p>
         */
        @NameInMap("LastName")
        public String lastName;

        /**
         * <p>The confidence level of the recognized LastName.</p>
         */
        @NameInMap("LastNameConfidence")
        public Double lastNameConfidence;

        /**
         * <p>The coordinates of four vertices of the LastName field area in the clockwise sequence: the upper left, upper right, lower right, and lower left.</p>
         */
        @NameInMap("LastNamePosition")
        public java.util.List<Long> lastNamePosition;

        /**
         * <p>The country or region code on the certificate.</p>
         */
        @NameInMap("NationalityCode")
        public String nationalityCode;

        /**
         * <p>The confidence level of the recognized NationalityCode.</p>
         */
        @NameInMap("NationalityCodeConfidence")
        public Double nationalityCodeConfidence;

        /**
         * <p>The coordinates of four vertices of the NationalityCode field area in the clockwise sequence: the upper left, upper right, lower right, and lower left.</p>
         */
        @NameInMap("NationalityCodePosition")
        public java.util.List<Long> nationalityCodePosition;

        /**
         * <p>The date of birth in the format of YYYY/MM/dd.</p>
         */
        @NameInMap("NormalizedDateOfBirth")
        public String normalizedDateOfBirth;

        /**
         * <p>The expiration date in the format of YYYY/MM/dd.</p>
         */
        @NameInMap("NormalizedExpirationDate")
        public String normalizedExpirationDate;

        /**
         * <p>The date of issue in the format of YYYY/MM/dd.</p>
         */
        @NameInMap("NormalizedIssuedDate")
        public String normalizedIssuedDate;

        /**
         * <p>The country or region code in the ISO 3166 alpha-3 format.</p>
         */
        @NameInMap("NormalizedNationalityCode")
        public String normalizedNationalityCode;

        /**
         * <p>The gender.</p>
         * <br>
         * <p>Valid values:</p>
         * <br>
         * <p>*   null</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   F</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    :</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    female</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>*   M</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    :</p>
         * <br>
         * <p>    <!-- --></p>
         * <br>
         * <p>    male</p>
         * <br>
         * <p>    <!-- --></p>
         */
        @NameInMap("NormalizedSex")
        public String normalizedSex;

        /**
         * <p>The gender.</p>
         */
        @NameInMap("Sex")
        public String sex;

        /**
         * <p>The confidence level of the recognized Sex.</p>
         */
        @NameInMap("SexConfidence")
        public Double sexConfidence;

        /**
         * <p>The coordinates of four vertices of the Sex field area in the clockwise sequence: the upper left, upper right, lower right, and lower left.</p>
         */
        @NameInMap("SexPosition")
        public java.util.List<Long> sexPosition;

        public static ScanDocumentResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            ScanDocumentResponseBodyData self = new ScanDocumentResponseBodyData();
            return TeaModel.build(map, self);
        }

        public ScanDocumentResponseBodyData setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public ScanDocumentResponseBodyData setAddressConfidence(Double addressConfidence) {
            this.addressConfidence = addressConfidence;
            return this;
        }
        public Double getAddressConfidence() {
            return this.addressConfidence;
        }

        public ScanDocumentResponseBodyData setAddressPosition(java.util.List<Long> addressPosition) {
            this.addressPosition = addressPosition;
            return this;
        }
        public java.util.List<Long> getAddressPosition() {
            return this.addressPosition;
        }

        public ScanDocumentResponseBodyData setDateOfBirth(String dateOfBirth) {
            this.dateOfBirth = dateOfBirth;
            return this;
        }
        public String getDateOfBirth() {
            return this.dateOfBirth;
        }

        public ScanDocumentResponseBodyData setDateOfBirthConfidence(Double dateOfBirthConfidence) {
            this.dateOfBirthConfidence = dateOfBirthConfidence;
            return this;
        }
        public Double getDateOfBirthConfidence() {
            return this.dateOfBirthConfidence;
        }

        public ScanDocumentResponseBodyData setDateOfBirthPosition(java.util.List<Long> dateOfBirthPosition) {
            this.dateOfBirthPosition = dateOfBirthPosition;
            return this;
        }
        public java.util.List<Long> getDateOfBirthPosition() {
            return this.dateOfBirthPosition;
        }

        public ScanDocumentResponseBodyData setDocumentNumber(String documentNumber) {
            this.documentNumber = documentNumber;
            return this;
        }
        public String getDocumentNumber() {
            return this.documentNumber;
        }

        public ScanDocumentResponseBodyData setDocumentNumber2(String documentNumber2) {
            this.documentNumber2 = documentNumber2;
            return this;
        }
        public String getDocumentNumber2() {
            return this.documentNumber2;
        }

        public ScanDocumentResponseBodyData setDocumentNumber2Confidence(Double documentNumber2Confidence) {
            this.documentNumber2Confidence = documentNumber2Confidence;
            return this;
        }
        public Double getDocumentNumber2Confidence() {
            return this.documentNumber2Confidence;
        }

        public ScanDocumentResponseBodyData setDocumentNumber2Position(java.util.List<Long> documentNumber2Position) {
            this.documentNumber2Position = documentNumber2Position;
            return this;
        }
        public java.util.List<Long> getDocumentNumber2Position() {
            return this.documentNumber2Position;
        }

        public ScanDocumentResponseBodyData setDocumentNumberConfidence(Double documentNumberConfidence) {
            this.documentNumberConfidence = documentNumberConfidence;
            return this;
        }
        public Double getDocumentNumberConfidence() {
            return this.documentNumberConfidence;
        }

        public ScanDocumentResponseBodyData setDocumentNumberPosition(java.util.List<Long> documentNumberPosition) {
            this.documentNumberPosition = documentNumberPosition;
            return this;
        }
        public java.util.List<Long> getDocumentNumberPosition() {
            return this.documentNumberPosition;
        }

        public ScanDocumentResponseBodyData setExpirationDate(String expirationDate) {
            this.expirationDate = expirationDate;
            return this;
        }
        public String getExpirationDate() {
            return this.expirationDate;
        }

        public ScanDocumentResponseBodyData setExpirationDateConfidence(Double expirationDateConfidence) {
            this.expirationDateConfidence = expirationDateConfidence;
            return this;
        }
        public Double getExpirationDateConfidence() {
            return this.expirationDateConfidence;
        }

        public ScanDocumentResponseBodyData setExpirationDatePosition(java.util.List<Long> expirationDatePosition) {
            this.expirationDatePosition = expirationDatePosition;
            return this;
        }
        public java.util.List<Long> getExpirationDatePosition() {
            return this.expirationDatePosition;
        }

        public ScanDocumentResponseBodyData setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }
        public String getFirstName() {
            return this.firstName;
        }

        public ScanDocumentResponseBodyData setFirstNameConfidence(Double firstNameConfidence) {
            this.firstNameConfidence = firstNameConfidence;
            return this;
        }
        public Double getFirstNameConfidence() {
            return this.firstNameConfidence;
        }

        public ScanDocumentResponseBodyData setFirstNamePosition(java.util.List<Long> firstNamePosition) {
            this.firstNamePosition = firstNamePosition;
            return this;
        }
        public java.util.List<Long> getFirstNamePosition() {
            return this.firstNamePosition;
        }

        public ScanDocumentResponseBodyData setFullName(String fullName) {
            this.fullName = fullName;
            return this;
        }
        public String getFullName() {
            return this.fullName;
        }

        public ScanDocumentResponseBodyData setFullNameConfidence(Double fullNameConfidence) {
            this.fullNameConfidence = fullNameConfidence;
            return this;
        }
        public Double getFullNameConfidence() {
            return this.fullNameConfidence;
        }

        public ScanDocumentResponseBodyData setFullNamePosition(java.util.List<Long> fullNamePosition) {
            this.fullNamePosition = fullNamePosition;
            return this;
        }
        public java.util.List<Long> getFullNamePosition() {
            return this.fullNamePosition;
        }

        public ScanDocumentResponseBodyData setIssuedDate(String issuedDate) {
            this.issuedDate = issuedDate;
            return this;
        }
        public String getIssuedDate() {
            return this.issuedDate;
        }

        public ScanDocumentResponseBodyData setIssuedDateConfidence(Double issuedDateConfidence) {
            this.issuedDateConfidence = issuedDateConfidence;
            return this;
        }
        public Double getIssuedDateConfidence() {
            return this.issuedDateConfidence;
        }

        public ScanDocumentResponseBodyData setIssuedDatePosition(java.util.List<Long> issuedDatePosition) {
            this.issuedDatePosition = issuedDatePosition;
            return this;
        }
        public java.util.List<Long> getIssuedDatePosition() {
            return this.issuedDatePosition;
        }

        public ScanDocumentResponseBodyData setIssuingAuthority(String issuingAuthority) {
            this.issuingAuthority = issuingAuthority;
            return this;
        }
        public String getIssuingAuthority() {
            return this.issuingAuthority;
        }

        public ScanDocumentResponseBodyData setIssuingAuthorityConfidence(Double issuingAuthorityConfidence) {
            this.issuingAuthorityConfidence = issuingAuthorityConfidence;
            return this;
        }
        public Double getIssuingAuthorityConfidence() {
            return this.issuingAuthorityConfidence;
        }

        public ScanDocumentResponseBodyData setIssuingAuthorityPosition(java.util.List<Long> issuingAuthorityPosition) {
            this.issuingAuthorityPosition = issuingAuthorityPosition;
            return this;
        }
        public java.util.List<Long> getIssuingAuthorityPosition() {
            return this.issuingAuthorityPosition;
        }

        public ScanDocumentResponseBodyData setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }
        public String getLastName() {
            return this.lastName;
        }

        public ScanDocumentResponseBodyData setLastNameConfidence(Double lastNameConfidence) {
            this.lastNameConfidence = lastNameConfidence;
            return this;
        }
        public Double getLastNameConfidence() {
            return this.lastNameConfidence;
        }

        public ScanDocumentResponseBodyData setLastNamePosition(java.util.List<Long> lastNamePosition) {
            this.lastNamePosition = lastNamePosition;
            return this;
        }
        public java.util.List<Long> getLastNamePosition() {
            return this.lastNamePosition;
        }

        public ScanDocumentResponseBodyData setNationalityCode(String nationalityCode) {
            this.nationalityCode = nationalityCode;
            return this;
        }
        public String getNationalityCode() {
            return this.nationalityCode;
        }

        public ScanDocumentResponseBodyData setNationalityCodeConfidence(Double nationalityCodeConfidence) {
            this.nationalityCodeConfidence = nationalityCodeConfidence;
            return this;
        }
        public Double getNationalityCodeConfidence() {
            return this.nationalityCodeConfidence;
        }

        public ScanDocumentResponseBodyData setNationalityCodePosition(java.util.List<Long> nationalityCodePosition) {
            this.nationalityCodePosition = nationalityCodePosition;
            return this;
        }
        public java.util.List<Long> getNationalityCodePosition() {
            return this.nationalityCodePosition;
        }

        public ScanDocumentResponseBodyData setNormalizedDateOfBirth(String normalizedDateOfBirth) {
            this.normalizedDateOfBirth = normalizedDateOfBirth;
            return this;
        }
        public String getNormalizedDateOfBirth() {
            return this.normalizedDateOfBirth;
        }

        public ScanDocumentResponseBodyData setNormalizedExpirationDate(String normalizedExpirationDate) {
            this.normalizedExpirationDate = normalizedExpirationDate;
            return this;
        }
        public String getNormalizedExpirationDate() {
            return this.normalizedExpirationDate;
        }

        public ScanDocumentResponseBodyData setNormalizedIssuedDate(String normalizedIssuedDate) {
            this.normalizedIssuedDate = normalizedIssuedDate;
            return this;
        }
        public String getNormalizedIssuedDate() {
            return this.normalizedIssuedDate;
        }

        public ScanDocumentResponseBodyData setNormalizedNationalityCode(String normalizedNationalityCode) {
            this.normalizedNationalityCode = normalizedNationalityCode;
            return this;
        }
        public String getNormalizedNationalityCode() {
            return this.normalizedNationalityCode;
        }

        public ScanDocumentResponseBodyData setNormalizedSex(String normalizedSex) {
            this.normalizedSex = normalizedSex;
            return this;
        }
        public String getNormalizedSex() {
            return this.normalizedSex;
        }

        public ScanDocumentResponseBodyData setSex(String sex) {
            this.sex = sex;
            return this;
        }
        public String getSex() {
            return this.sex;
        }

        public ScanDocumentResponseBodyData setSexConfidence(Double sexConfidence) {
            this.sexConfidence = sexConfidence;
            return this;
        }
        public Double getSexConfidence() {
            return this.sexConfidence;
        }

        public ScanDocumentResponseBodyData setSexPosition(java.util.List<Long> sexPosition) {
            this.sexPosition = sexPosition;
            return this;
        }
        public java.util.List<Long> getSexPosition() {
            return this.sexPosition;
        }

    }

}
