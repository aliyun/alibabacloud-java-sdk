// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class UpdateCompanyRequest extends TeaModel {
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
     * <p><a href="mailto:test@163.com">test@163.com</a></p>
     */
    @NameInMap("CompanyEmail")
    public String companyEmail;

    /**
     * <p>The company ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>51001</p>
     */
    @NameInMap("CompanyId")
    public Long companyId;

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
     * <p>1511</p>
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

    public static UpdateCompanyRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateCompanyRequest self = new UpdateCompanyRequest();
        return TeaModel.build(map, self);
    }

    public UpdateCompanyRequest setCity(String city) {
        this.city = city;
        return this;
    }
    public String getCity() {
        return this.city;
    }

    public UpdateCompanyRequest setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress;
        return this;
    }
    public String getCompanyAddress() {
        return this.companyAddress;
    }

    public UpdateCompanyRequest setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
        return this;
    }
    public String getCompanyCode() {
        return this.companyCode;
    }

    public UpdateCompanyRequest setCompanyEmail(String companyEmail) {
        this.companyEmail = companyEmail;
        return this;
    }
    public String getCompanyEmail() {
        return this.companyEmail;
    }

    public UpdateCompanyRequest setCompanyId(Long companyId) {
        this.companyId = companyId;
        return this;
    }
    public Long getCompanyId() {
        return this.companyId;
    }

    public UpdateCompanyRequest setCompanyName(String companyName) {
        this.companyName = companyName;
        return this;
    }
    public String getCompanyName() {
        return this.companyName;
    }

    public UpdateCompanyRequest setCompanyPhone(String companyPhone) {
        this.companyPhone = companyPhone;
        return this;
    }
    public String getCompanyPhone() {
        return this.companyPhone;
    }

    public UpdateCompanyRequest setCompanyType(Integer companyType) {
        this.companyType = companyType;
        return this;
    }
    public Integer getCompanyType() {
        return this.companyType;
    }

    public UpdateCompanyRequest setCountryCode(String countryCode) {
        this.countryCode = countryCode;
        return this;
    }
    public String getCountryCode() {
        return this.countryCode;
    }

    public UpdateCompanyRequest setDepartment(String department) {
        this.department = department;
        return this;
    }
    public String getDepartment() {
        return this.department;
    }

    public UpdateCompanyRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public UpdateCompanyRequest setPostCode(String postCode) {
        this.postCode = postCode;
        return this;
    }
    public String getPostCode() {
        return this.postCode;
    }

    public UpdateCompanyRequest setProvince(String province) {
        this.province = province;
        return this;
    }
    public String getProvince() {
        return this.province;
    }

}
