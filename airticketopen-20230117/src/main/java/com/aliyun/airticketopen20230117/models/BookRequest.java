// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.airticketopen20230117.models;

import com.aliyun.tea.*;

public class BookRequest extends TeaModel {
    @NameInMap("contact")
    public BookRequestContact contact;

    @NameInMap("out_order_num")
    public String outOrderNum;

    @NameInMap("passenger_ancillary_purchase_map_list")
    public java.util.List<BookRequestPassengerAncillaryPurchaseMapList> passengerAncillaryPurchaseMapList;

    @NameInMap("passenger_list")
    public java.util.List<BookRequestPassengerList> passengerList;

    /**
     * <p>solution_id</p>
     */
    @NameInMap("solution_id")
    public String solutionId;

    public static BookRequest build(java.util.Map<String, ?> map) throws Exception {
        BookRequest self = new BookRequest();
        return TeaModel.build(map, self);
    }

    public BookRequest setContact(BookRequestContact contact) {
        this.contact = contact;
        return this;
    }
    public BookRequestContact getContact() {
        return this.contact;
    }

    public BookRequest setOutOrderNum(String outOrderNum) {
        this.outOrderNum = outOrderNum;
        return this;
    }
    public String getOutOrderNum() {
        return this.outOrderNum;
    }

    public BookRequest setPassengerAncillaryPurchaseMapList(java.util.List<BookRequestPassengerAncillaryPurchaseMapList> passengerAncillaryPurchaseMapList) {
        this.passengerAncillaryPurchaseMapList = passengerAncillaryPurchaseMapList;
        return this;
    }
    public java.util.List<BookRequestPassengerAncillaryPurchaseMapList> getPassengerAncillaryPurchaseMapList() {
        return this.passengerAncillaryPurchaseMapList;
    }

    public BookRequest setPassengerList(java.util.List<BookRequestPassengerList> passengerList) {
        this.passengerList = passengerList;
        return this;
    }
    public java.util.List<BookRequestPassengerList> getPassengerList() {
        return this.passengerList;
    }

    public BookRequest setSolutionId(String solutionId) {
        this.solutionId = solutionId;
        return this;
    }
    public String getSolutionId() {
        return this.solutionId;
    }

    public static class BookRequestContact extends TeaModel {
        @NameInMap("email")
        public String email;

        @NameInMap("first_name")
        public String firstName;

        @NameInMap("last_name")
        public String lastName;

        @NameInMap("mobile_country_code")
        public String mobileCountryCode;

        @NameInMap("mobile_phone_num")
        public String mobilePhoneNum;

        public static BookRequestContact build(java.util.Map<String, ?> map) throws Exception {
            BookRequestContact self = new BookRequestContact();
            return TeaModel.build(map, self);
        }

        public BookRequestContact setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public BookRequestContact setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }
        public String getFirstName() {
            return this.firstName;
        }

        public BookRequestContact setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }
        public String getLastName() {
            return this.lastName;
        }

        public BookRequestContact setMobileCountryCode(String mobileCountryCode) {
            this.mobileCountryCode = mobileCountryCode;
            return this;
        }
        public String getMobileCountryCode() {
            return this.mobileCountryCode;
        }

        public BookRequestContact setMobilePhoneNum(String mobilePhoneNum) {
            this.mobilePhoneNum = mobilePhoneNum;
            return this;
        }
        public String getMobilePhoneNum() {
            return this.mobilePhoneNum;
        }

    }

    public static class BookRequestPassengerAncillaryPurchaseMapListBookAncillaryReqItem extends TeaModel {
        @NameInMap("ancillary_id")
        public String ancillaryId;

        @NameInMap("ancillary_type")
        public Integer ancillaryType;

        public static BookRequestPassengerAncillaryPurchaseMapListBookAncillaryReqItem build(java.util.Map<String, ?> map) throws Exception {
            BookRequestPassengerAncillaryPurchaseMapListBookAncillaryReqItem self = new BookRequestPassengerAncillaryPurchaseMapListBookAncillaryReqItem();
            return TeaModel.build(map, self);
        }

        public BookRequestPassengerAncillaryPurchaseMapListBookAncillaryReqItem setAncillaryId(String ancillaryId) {
            this.ancillaryId = ancillaryId;
            return this;
        }
        public String getAncillaryId() {
            return this.ancillaryId;
        }

        public BookRequestPassengerAncillaryPurchaseMapListBookAncillaryReqItem setAncillaryType(Integer ancillaryType) {
            this.ancillaryType = ancillaryType;
            return this;
        }
        public Integer getAncillaryType() {
            return this.ancillaryType;
        }

    }

    public static class BookRequestPassengerAncillaryPurchaseMapListPassengerListCredential extends TeaModel {
        @NameInMap("cert_issue_place")
        public String certIssuePlace;

        @NameInMap("credential_num")
        public String credentialNum;

        @NameInMap("credential_type")
        public Integer credentialType;

        @NameInMap("expire_date")
        public String expireDate;

        public static BookRequestPassengerAncillaryPurchaseMapListPassengerListCredential build(java.util.Map<String, ?> map) throws Exception {
            BookRequestPassengerAncillaryPurchaseMapListPassengerListCredential self = new BookRequestPassengerAncillaryPurchaseMapListPassengerListCredential();
            return TeaModel.build(map, self);
        }

        public BookRequestPassengerAncillaryPurchaseMapListPassengerListCredential setCertIssuePlace(String certIssuePlace) {
            this.certIssuePlace = certIssuePlace;
            return this;
        }
        public String getCertIssuePlace() {
            return this.certIssuePlace;
        }

        public BookRequestPassengerAncillaryPurchaseMapListPassengerListCredential setCredentialNum(String credentialNum) {
            this.credentialNum = credentialNum;
            return this;
        }
        public String getCredentialNum() {
            return this.credentialNum;
        }

        public BookRequestPassengerAncillaryPurchaseMapListPassengerListCredential setCredentialType(Integer credentialType) {
            this.credentialType = credentialType;
            return this;
        }
        public Integer getCredentialType() {
            return this.credentialType;
        }

        public BookRequestPassengerAncillaryPurchaseMapListPassengerListCredential setExpireDate(String expireDate) {
            this.expireDate = expireDate;
            return this;
        }
        public String getExpireDate() {
            return this.expireDate;
        }

    }

    public static class BookRequestPassengerAncillaryPurchaseMapListPassengerList extends TeaModel {
        @NameInMap("birthday")
        public String birthday;

        @NameInMap("credential")
        public BookRequestPassengerAncillaryPurchaseMapListPassengerListCredential credential;

        @NameInMap("first_name")
        public String firstName;

        @NameInMap("gender")
        public Integer gender;

        @NameInMap("last_name")
        public String lastName;

        @NameInMap("mobile_country_code")
        public String mobileCountryCode;

        @NameInMap("mobile_phone_number")
        public String mobilePhoneNumber;

        @NameInMap("nationality")
        public String nationality;

        @NameInMap("type")
        public Integer type;

        public static BookRequestPassengerAncillaryPurchaseMapListPassengerList build(java.util.Map<String, ?> map) throws Exception {
            BookRequestPassengerAncillaryPurchaseMapListPassengerList self = new BookRequestPassengerAncillaryPurchaseMapListPassengerList();
            return TeaModel.build(map, self);
        }

        public BookRequestPassengerAncillaryPurchaseMapListPassengerList setBirthday(String birthday) {
            this.birthday = birthday;
            return this;
        }
        public String getBirthday() {
            return this.birthday;
        }

        public BookRequestPassengerAncillaryPurchaseMapListPassengerList setCredential(BookRequestPassengerAncillaryPurchaseMapListPassengerListCredential credential) {
            this.credential = credential;
            return this;
        }
        public BookRequestPassengerAncillaryPurchaseMapListPassengerListCredential getCredential() {
            return this.credential;
        }

        public BookRequestPassengerAncillaryPurchaseMapListPassengerList setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }
        public String getFirstName() {
            return this.firstName;
        }

        public BookRequestPassengerAncillaryPurchaseMapListPassengerList setGender(Integer gender) {
            this.gender = gender;
            return this;
        }
        public Integer getGender() {
            return this.gender;
        }

        public BookRequestPassengerAncillaryPurchaseMapListPassengerList setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }
        public String getLastName() {
            return this.lastName;
        }

        public BookRequestPassengerAncillaryPurchaseMapListPassengerList setMobileCountryCode(String mobileCountryCode) {
            this.mobileCountryCode = mobileCountryCode;
            return this;
        }
        public String getMobileCountryCode() {
            return this.mobileCountryCode;
        }

        public BookRequestPassengerAncillaryPurchaseMapListPassengerList setMobilePhoneNumber(String mobilePhoneNumber) {
            this.mobilePhoneNumber = mobilePhoneNumber;
            return this;
        }
        public String getMobilePhoneNumber() {
            return this.mobilePhoneNumber;
        }

        public BookRequestPassengerAncillaryPurchaseMapListPassengerList setNationality(String nationality) {
            this.nationality = nationality;
            return this;
        }
        public String getNationality() {
            return this.nationality;
        }

        public BookRequestPassengerAncillaryPurchaseMapListPassengerList setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

    }

    public static class BookRequestPassengerAncillaryPurchaseMapList extends TeaModel {
        @NameInMap("book_ancillary_req_item")
        public BookRequestPassengerAncillaryPurchaseMapListBookAncillaryReqItem bookAncillaryReqItem;

        @NameInMap("passenger_list")
        public java.util.List<BookRequestPassengerAncillaryPurchaseMapListPassengerList> passengerList;

        public static BookRequestPassengerAncillaryPurchaseMapList build(java.util.Map<String, ?> map) throws Exception {
            BookRequestPassengerAncillaryPurchaseMapList self = new BookRequestPassengerAncillaryPurchaseMapList();
            return TeaModel.build(map, self);
        }

        public BookRequestPassengerAncillaryPurchaseMapList setBookAncillaryReqItem(BookRequestPassengerAncillaryPurchaseMapListBookAncillaryReqItem bookAncillaryReqItem) {
            this.bookAncillaryReqItem = bookAncillaryReqItem;
            return this;
        }
        public BookRequestPassengerAncillaryPurchaseMapListBookAncillaryReqItem getBookAncillaryReqItem() {
            return this.bookAncillaryReqItem;
        }

        public BookRequestPassengerAncillaryPurchaseMapList setPassengerList(java.util.List<BookRequestPassengerAncillaryPurchaseMapListPassengerList> passengerList) {
            this.passengerList = passengerList;
            return this;
        }
        public java.util.List<BookRequestPassengerAncillaryPurchaseMapListPassengerList> getPassengerList() {
            return this.passengerList;
        }

    }

    public static class BookRequestPassengerListCredential extends TeaModel {
        @NameInMap("cert_issue_place")
        public String certIssuePlace;

        @NameInMap("credential_num")
        public String credentialNum;

        @NameInMap("credential_type")
        public Integer credentialType;

        @NameInMap("expire_date")
        public String expireDate;

        public static BookRequestPassengerListCredential build(java.util.Map<String, ?> map) throws Exception {
            BookRequestPassengerListCredential self = new BookRequestPassengerListCredential();
            return TeaModel.build(map, self);
        }

        public BookRequestPassengerListCredential setCertIssuePlace(String certIssuePlace) {
            this.certIssuePlace = certIssuePlace;
            return this;
        }
        public String getCertIssuePlace() {
            return this.certIssuePlace;
        }

        public BookRequestPassengerListCredential setCredentialNum(String credentialNum) {
            this.credentialNum = credentialNum;
            return this;
        }
        public String getCredentialNum() {
            return this.credentialNum;
        }

        public BookRequestPassengerListCredential setCredentialType(Integer credentialType) {
            this.credentialType = credentialType;
            return this;
        }
        public Integer getCredentialType() {
            return this.credentialType;
        }

        public BookRequestPassengerListCredential setExpireDate(String expireDate) {
            this.expireDate = expireDate;
            return this;
        }
        public String getExpireDate() {
            return this.expireDate;
        }

    }

    public static class BookRequestPassengerList extends TeaModel {
        @NameInMap("birthday")
        public String birthday;

        @NameInMap("credential")
        public BookRequestPassengerListCredential credential;

        @NameInMap("first_name")
        public String firstName;

        @NameInMap("gender")
        public Integer gender;

        @NameInMap("last_name")
        public String lastName;

        @NameInMap("mobile_country_code")
        public String mobileCountryCode;

        @NameInMap("mobile_phone_number")
        public String mobilePhoneNumber;

        @NameInMap("nationality")
        public String nationality;

        @NameInMap("type")
        public Integer type;

        public static BookRequestPassengerList build(java.util.Map<String, ?> map) throws Exception {
            BookRequestPassengerList self = new BookRequestPassengerList();
            return TeaModel.build(map, self);
        }

        public BookRequestPassengerList setBirthday(String birthday) {
            this.birthday = birthday;
            return this;
        }
        public String getBirthday() {
            return this.birthday;
        }

        public BookRequestPassengerList setCredential(BookRequestPassengerListCredential credential) {
            this.credential = credential;
            return this;
        }
        public BookRequestPassengerListCredential getCredential() {
            return this.credential;
        }

        public BookRequestPassengerList setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }
        public String getFirstName() {
            return this.firstName;
        }

        public BookRequestPassengerList setGender(Integer gender) {
            this.gender = gender;
            return this;
        }
        public Integer getGender() {
            return this.gender;
        }

        public BookRequestPassengerList setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }
        public String getLastName() {
            return this.lastName;
        }

        public BookRequestPassengerList setMobileCountryCode(String mobileCountryCode) {
            this.mobileCountryCode = mobileCountryCode;
            return this;
        }
        public String getMobileCountryCode() {
            return this.mobileCountryCode;
        }

        public BookRequestPassengerList setMobilePhoneNumber(String mobilePhoneNumber) {
            this.mobilePhoneNumber = mobilePhoneNumber;
            return this;
        }
        public String getMobilePhoneNumber() {
            return this.mobilePhoneNumber;
        }

        public BookRequestPassengerList setNationality(String nationality) {
            this.nationality = nationality;
            return this;
        }
        public String getNationality() {
            return this.nationality;
        }

        public BookRequestPassengerList setType(Integer type) {
            this.type = type;
            return this;
        }
        public Integer getType() {
            return this.type;
        }

    }

}
