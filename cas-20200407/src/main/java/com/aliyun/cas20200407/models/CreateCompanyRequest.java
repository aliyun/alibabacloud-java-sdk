// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class CreateCompanyRequest extends TeaModel {
    /**
     * <p>The city.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Beijing</p>
     */
    @NameInMap("City")
    public String city;

    /**
     * <p>The address of the company.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("CompanyAddress")
    public String companyAddress;

    /**
     * <p>The company code.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>xxx</p>
     */
    @NameInMap("CompanyCode")
    public String companyCode;

    /**
     * <p>The email address of the company.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="mailto:test@123.com">test@123.com</a></p>
     */
    @NameInMap("CompanyEmail")
    public String companyEmail;

    /**
     * <p>The name of the company or organization.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>testYanwen045</p>
     */
    @NameInMap("CompanyName")
    public String companyName;

    /**
     * <p>The phone number of the company.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1999</p>
     */
    @NameInMap("CompanyPhone")
    public String companyPhone;

    /**
     * <p>The company type.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("CompanyType")
    public Integer companyType;

    /**
     * <p>The country code.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>CN</p>
     */
    @NameInMap("CountryCode")
    public String countryCode;

    /**
     * <p>The department.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("Department")
    public String department;

    /**
     * <p>The language.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>zh</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The postal code.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>100000</p>
     */
    @NameInMap("PostCode")
    public String postCode;

    /**
     * <p>The province.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>Beijing</p>
     */
    @NameInMap("Province")
    public String province;

    public static CreateCompanyRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateCompanyRequest self = new CreateCompanyRequest();
        return TeaModel.build(map, self);
    }

    public CreateCompanyRequest setCity(String city) {
        this.city = city;
        return this;
    }
    public String getCity() {
        return this.city;
    }

    public CreateCompanyRequest setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress;
        return this;
    }
    public String getCompanyAddress() {
        return this.companyAddress;
    }

    public CreateCompanyRequest setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
        return this;
    }
    public String getCompanyCode() {
        return this.companyCode;
    }

    public CreateCompanyRequest setCompanyEmail(String companyEmail) {
        this.companyEmail = companyEmail;
        return this;
    }
    public String getCompanyEmail() {
        return this.companyEmail;
    }

    public CreateCompanyRequest setCompanyName(String companyName) {
        this.companyName = companyName;
        return this;
    }
    public String getCompanyName() {
        return this.companyName;
    }

    public CreateCompanyRequest setCompanyPhone(String companyPhone) {
        this.companyPhone = companyPhone;
        return this;
    }
    public String getCompanyPhone() {
        return this.companyPhone;
    }

    public CreateCompanyRequest setCompanyType(Integer companyType) {
        this.companyType = companyType;
        return this;
    }
    public Integer getCompanyType() {
        return this.companyType;
    }

    public CreateCompanyRequest setCountryCode(String countryCode) {
        this.countryCode = countryCode;
        return this;
    }
    public String getCountryCode() {
        return this.countryCode;
    }

    public CreateCompanyRequest setDepartment(String department) {
        this.department = department;
        return this;
    }
    public String getDepartment() {
        return this.department;
    }

    public CreateCompanyRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public CreateCompanyRequest setPostCode(String postCode) {
        this.postCode = postCode;
        return this;
    }
    public String getPostCode() {
        return this.postCode;
    }

    public CreateCompanyRequest setProvince(String province) {
        this.province = province;
        return this;
    }
    public String getProvince() {
        return this.province;
    }

}
