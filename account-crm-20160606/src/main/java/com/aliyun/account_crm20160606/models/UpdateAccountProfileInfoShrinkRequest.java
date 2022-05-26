// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class UpdateAccountProfileInfoShrinkRequest extends TeaModel {
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
    public String cityJsonStringShrink;

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
    public String provinceJsonStringShrink;

    @NameInMap("TrueName")
    public String trueName;

    public static UpdateAccountProfileInfoShrinkRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateAccountProfileInfoShrinkRequest self = new UpdateAccountProfileInfoShrinkRequest();
        return TeaModel.build(map, self);
    }

    public UpdateAccountProfileInfoShrinkRequest setAccountAttribute(String accountAttribute) {
        this.accountAttribute = accountAttribute;
        return this;
    }
    public String getAccountAttribute() {
        return this.accountAttribute;
    }

    public UpdateAccountProfileInfoShrinkRequest setAddress(String address) {
        this.address = address;
        return this;
    }
    public String getAddress() {
        return this.address;
    }

    public UpdateAccountProfileInfoShrinkRequest setAddress2(String address2) {
        this.address2 = address2;
        return this;
    }
    public String getAddress2() {
        return this.address2;
    }

    public UpdateAccountProfileInfoShrinkRequest setBindAlipayNo(String bindAlipayNo) {
        this.bindAlipayNo = bindAlipayNo;
        return this;
    }
    public String getBindAlipayNo() {
        return this.bindAlipayNo;
    }

    public UpdateAccountProfileInfoShrinkRequest setCertType(String certType) {
        this.certType = certType;
        return this;
    }
    public String getCertType() {
        return this.certType;
    }

    public UpdateAccountProfileInfoShrinkRequest setCityJsonStringShrink(String cityJsonStringShrink) {
        this.cityJsonStringShrink = cityJsonStringShrink;
        return this;
    }
    public String getCityJsonStringShrink() {
        return this.cityJsonStringShrink;
    }

    public UpdateAccountProfileInfoShrinkRequest setContactMethod(String contactMethod) {
        this.contactMethod = contactMethod;
        return this;
    }
    public String getContactMethod() {
        return this.contactMethod;
    }

    public UpdateAccountProfileInfoShrinkRequest setFax(String fax) {
        this.fax = fax;
        return this;
    }
    public String getFax() {
        return this.fax;
    }

    public UpdateAccountProfileInfoShrinkRequest setFirstName(String firstName) {
        this.firstName = firstName;
        return this;
    }
    public String getFirstName() {
        return this.firstName;
    }

    public UpdateAccountProfileInfoShrinkRequest setHead(String head) {
        this.head = head;
        return this;
    }
    public String getHead() {
        return this.head;
    }

    public UpdateAccountProfileInfoShrinkRequest setLastName(String lastName) {
        this.lastName = lastName;
        return this;
    }
    public String getLastName() {
        return this.lastName;
    }

    public UpdateAccountProfileInfoShrinkRequest setPK(String PK) {
        this.PK = PK;
        return this;
    }
    public String getPK() {
        return this.PK;
    }

    public UpdateAccountProfileInfoShrinkRequest setPhone(String phone) {
        this.phone = phone;
        return this;
    }
    public String getPhone() {
        return this.phone;
    }

    public UpdateAccountProfileInfoShrinkRequest setPostCode(String postCode) {
        this.postCode = postCode;
        return this;
    }
    public String getPostCode() {
        return this.postCode;
    }

    public UpdateAccountProfileInfoShrinkRequest setProvinceJsonStringShrink(String provinceJsonStringShrink) {
        this.provinceJsonStringShrink = provinceJsonStringShrink;
        return this;
    }
    public String getProvinceJsonStringShrink() {
        return this.provinceJsonStringShrink;
    }

    public UpdateAccountProfileInfoShrinkRequest setTrueName(String trueName) {
        this.trueName = trueName;
        return this;
    }
    public String getTrueName() {
        return this.trueName;
    }

}
