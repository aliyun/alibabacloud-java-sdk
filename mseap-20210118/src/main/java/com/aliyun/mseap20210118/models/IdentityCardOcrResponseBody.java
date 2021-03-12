// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mseap20210118.models;

import com.aliyun.tea.*;

public class IdentityCardOcrResponseBody extends TeaModel {
    @NameInMap("Issue")
    public String issue;

    @NameInMap("ValidDate")
    public String validDate;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Address")
    public String address;

    @NameInMap("IdNumber")
    public String idNumber;

    @NameInMap("Gender")
    public String gender;

    @NameInMap("Nationality")
    public String nationality;

    @NameInMap("BirthDate")
    public String birthDate;

    @NameInMap("TrackId")
    public String trackId;

    @NameInMap("Name")
    public String name;

    public static IdentityCardOcrResponseBody build(java.util.Map<String, ?> map) throws Exception {
        IdentityCardOcrResponseBody self = new IdentityCardOcrResponseBody();
        return TeaModel.build(map, self);
    }

    public IdentityCardOcrResponseBody setIssue(String issue) {
        this.issue = issue;
        return this;
    }
    public String getIssue() {
        return this.issue;
    }

    public IdentityCardOcrResponseBody setValidDate(String validDate) {
        this.validDate = validDate;
        return this;
    }
    public String getValidDate() {
        return this.validDate;
    }

    public IdentityCardOcrResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public IdentityCardOcrResponseBody setAddress(String address) {
        this.address = address;
        return this;
    }
    public String getAddress() {
        return this.address;
    }

    public IdentityCardOcrResponseBody setIdNumber(String idNumber) {
        this.idNumber = idNumber;
        return this;
    }
    public String getIdNumber() {
        return this.idNumber;
    }

    public IdentityCardOcrResponseBody setGender(String gender) {
        this.gender = gender;
        return this;
    }
    public String getGender() {
        return this.gender;
    }

    public IdentityCardOcrResponseBody setNationality(String nationality) {
        this.nationality = nationality;
        return this;
    }
    public String getNationality() {
        return this.nationality;
    }

    public IdentityCardOcrResponseBody setBirthDate(String birthDate) {
        this.birthDate = birthDate;
        return this;
    }
    public String getBirthDate() {
        return this.birthDate;
    }

    public IdentityCardOcrResponseBody setTrackId(String trackId) {
        this.trackId = trackId;
        return this;
    }
    public String getTrackId() {
        return this.trackId;
    }

    public IdentityCardOcrResponseBody setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

}
