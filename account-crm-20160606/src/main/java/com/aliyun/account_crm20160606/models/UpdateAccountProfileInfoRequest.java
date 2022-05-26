// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class UpdateAccountProfileInfoRequest extends TeaModel {
    @NameInMap("AccountAttribute")
    public String accountAttribute;

    @NameInMap("Address")
    public String address;

    @NameInMap("Address2")
    public String address2;

    @NameInMap("BindAlipayNo")
    public String bindAlipayNo;

    @NameInMap("CertType")
    public String certType;

    @NameInMap("CityJsonString")
    public java.util.Map<String, ?> cityJsonString;

    @NameInMap("ContactMethod")
    public String contactMethod;

    @NameInMap("Fax")
    public String fax;

    @NameInMap("FirstName")
    public String firstName;

    @NameInMap("Head")
    public String head;

    @NameInMap("LastName")
    public String lastName;

    @NameInMap("PK")
    public String PK;

    @NameInMap("Phone")
    public String phone;

    @NameInMap("PostCode")
    public String postCode;

    @NameInMap("ProvinceJsonString")
    public java.util.Map<String, ?> provinceJsonString;

    @NameInMap("TrueName")
    public String trueName;

    public static UpdateAccountProfileInfoRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAccountProfileInfoRequest self = new UpdateAccountProfileInfoRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAccountProfileInfoRequest setAccountAttribute(String accountAttribute) {
        this.accountAttribute = accountAttribute;
        return this;
    }
    public String getAccountAttribute() {
        return this.accountAttribute;
    }

    public UpdateAccountProfileInfoRequest setAddress(String address) {
        this.address = address;
        return this;
    }
    public String getAddress() {
        return this.address;
    }

    public UpdateAccountProfileInfoRequest setAddress2(String address2) {
        this.address2 = address2;
        return this;
    }
    public String getAddress2() {
        return this.address2;
    }

    public UpdateAccountProfileInfoRequest setBindAlipayNo(String bindAlipayNo) {
        this.bindAlipayNo = bindAlipayNo;
        return this;
    }
    public String getBindAlipayNo() {
        return this.bindAlipayNo;
    }

    public UpdateAccountProfileInfoRequest setCertType(String certType) {
        this.certType = certType;
        return this;
    }
    public String getCertType() {
        return this.certType;
    }

    public UpdateAccountProfileInfoRequest setCityJsonString(java.util.Map<String, ?> cityJsonString) {
        this.cityJsonString = cityJsonString;
        return this;
    }
    public java.util.Map<String, ?> getCityJsonString() {
        return this.cityJsonString;
    }

    public UpdateAccountProfileInfoRequest setContactMethod(String contactMethod) {
        this.contactMethod = contactMethod;
        return this;
    }
    public String getContactMethod() {
        return this.contactMethod;
    }

    public UpdateAccountProfileInfoRequest setFax(String fax) {
        this.fax = fax;
        return this;
    }
    public String getFax() {
        return this.fax;
    }

    public UpdateAccountProfileInfoRequest setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }
    public String getFirstName() {
        return this.firstName;
    }

    public UpdateAccountProfileInfoRequest setHead(String head) {
        this.head = head;
        return this;
    }
    public String getHead() {
        return this.head;
    }

    public UpdateAccountProfileInfoRequest setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }
    public String getLastName() {
        return this.lastName;
    }

    public UpdateAccountProfileInfoRequest setPK(String PK) {
        this.PK = PK;
        return this;
    }
    public String getPK() {
        return this.PK;
    }

    public UpdateAccountProfileInfoRequest setPhone(String phone) {
        this.phone = phone;
        return this;
    }
    public String getPhone() {
        return this.phone;
    }

    public UpdateAccountProfileInfoRequest setPostCode(String postCode) {
        this.postCode = postCode;
        return this;
    }
    public String getPostCode() {
        return this.postCode;
    }

    public UpdateAccountProfileInfoRequest setProvinceJsonString(java.util.Map<String, ?> provinceJsonString) {
        this.provinceJsonString = provinceJsonString;
        return this;
    }
    public java.util.Map<String, ?> getProvinceJsonString() {
        return this.provinceJsonString;
    }

    public UpdateAccountProfileInfoRequest setTrueName(String trueName) {
        this.trueName = trueName;
        return this;
    }
    public String getTrueName() {
        return this.trueName;
    }

}
