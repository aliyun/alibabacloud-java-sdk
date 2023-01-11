// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mseap20210118.models;

import com.aliyun.tea.*;

public class IdentityCardOcrResponseBody extends TeaModel {
    @NameInMap("Address")
    public String address;

    @NameInMap("BirthDate")
    public String birthDate;

    @NameInMap("Gender")
    public String gender;

    @NameInMap("IdNumber")
    public String idNumber;

    @NameInMap("Issue")
    public String issue;

    @NameInMap("Name")
    public String name;

    @NameInMap("Nationality")
    public String nationality;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("TrackId")
    public String trackId;

    @NameInMap("ValidDate")
    public String validDate;

    public static IdentityCardOcrResponseBody build(java.util.Map<String, ?> map) throws Exception {
        IdentityCardOcrResponseBody self = new IdentityCardOcrResponseBody();
        return TeaModel.build(map, self);
    }

    public IdentityCardOcrResponseBody setAddress(String address) {
        this.address = address;
        return this;
    }
    public String getAddress() {
        return this.address;
    }

    public IdentityCardOcrResponseBody setBirthDate(String birthDate) {
        this.birthDate = birthDate;
        return this;
    }
    public String getBirthDate() {
        return this.birthDate;
    }

    public IdentityCardOcrResponseBody setGender(String gender) {
        this.gender = gender;
        return this;
    }
    public String getGender() {
        return this.gender;
    }

    public IdentityCardOcrResponseBody setIdNumber(String idNumber) {
        this.idNumber = idNumber;
        return this;
    }
    public String getIdNumber() {
        return this.idNumber;
    }

    public IdentityCardOcrResponseBody setIssue(String issue) {
        this.issue = issue;
        return this;
    }
    public String getIssue() {
        return this.issue;
    }

    public IdentityCardOcrResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public IdentityCardOcrResponseBody setNationality(String nationality) {
        this.nationality = nationality;
        return this;
    }
    public String getNationality() {
        return this.nationality;
    }

    public IdentityCardOcrResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public IdentityCardOcrResponseBody setTrackId(String trackId) {
        this.trackId = trackId;
        return this;
    }
    public String getTrackId() {
        return this.trackId;
    }

    public IdentityCardOcrResponseBody setValidDate(String validDate) {
        this.validDate = validDate;
        return this;
    }
    public String getValidDate() {
        return this.validDate;
    }

}
