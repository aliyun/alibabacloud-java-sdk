// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mseap20210118.models;

import com.aliyun.tea.*;

public class BusinessLicenseOcrResponseBody extends TeaModel {
    @NameInMap("RegisterNumber")
    public String registerNumber;

    @NameInMap("Type")
    public String type;

    @NameInMap("ValidPeriod")
    public String validPeriod;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Address")
    public String address;

    @NameInMap("Capital")
    public String capital;

    @NameInMap("LegalPerson")
    public String legalPerson;

    @NameInMap("EstablishDate")
    public String establishDate;

    @NameInMap("Nationality")
    public String nationality;

    @NameInMap("Name")
    public String name;

    @NameInMap("Business")
    public String business;

    @NameInMap("TrackId")
    public String trackId;

    public static BusinessLicenseOcrResponseBody build(java.util.Map<String, ?> map) throws Exception {
        BusinessLicenseOcrResponseBody self = new BusinessLicenseOcrResponseBody();
        return TeaModel.build(map, self);
    }

    public BusinessLicenseOcrResponseBody setRegisterNumber(String registerNumber) {
        this.registerNumber = registerNumber;
        return this;
    }
    public String getRegisterNumber() {
        return this.registerNumber;
    }

    public BusinessLicenseOcrResponseBody setType(String type) {
        this.type = type;
        return this;
    }
    public String getType() {
        return this.type;
    }

    public BusinessLicenseOcrResponseBody setValidPeriod(String validPeriod) {
        this.validPeriod = validPeriod;
        return this;
    }
    public String getValidPeriod() {
        return this.validPeriod;
    }

    public BusinessLicenseOcrResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public BusinessLicenseOcrResponseBody setAddress(String address) {
        this.address = address;
        return this;
    }
    public String getAddress() {
        return this.address;
    }

    public BusinessLicenseOcrResponseBody setCapital(String capital) {
        this.capital = capital;
        return this;
    }
    public String getCapital() {
        return this.capital;
    }

    public BusinessLicenseOcrResponseBody setLegalPerson(String legalPerson) {
        this.legalPerson = legalPerson;
        return this;
    }
    public String getLegalPerson() {
        return this.legalPerson;
    }

    public BusinessLicenseOcrResponseBody setEstablishDate(String establishDate) {
        this.establishDate = establishDate;
        return this;
    }
    public String getEstablishDate() {
        return this.establishDate;
    }

    public BusinessLicenseOcrResponseBody setNationality(String nationality) {
        this.nationality = nationality;
        return this;
    }
    public String getNationality() {
        return this.nationality;
    }

    public BusinessLicenseOcrResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public BusinessLicenseOcrResponseBody setBusiness(String business) {
        this.business = business;
        return this;
    }
    public String getBusiness() {
        return this.business;
    }

    public BusinessLicenseOcrResponseBody setTrackId(String trackId) {
        this.trackId = trackId;
        return this;
    }
    public String getTrackId() {
        return this.trackId;
    }

}
