// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class GetCompanyResponseBody extends TeaModel {
    /**
     * <p>The city.</p>
     * 
     * <strong>example:</strong>
     * <p>Beijing</p>
     */
    @NameInMap("City")
    public String city;

    /**
     * <p>The address of the company.</p>
     * 
     * <strong>example:</strong>
     * <p>test</p>
     */
    @NameInMap("CompanyAddress")
    public String companyAddress;

    /**
     * <p>The company code.</p>
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
     * 
     * <strong>example:</strong>
     * <p>51001</p>
     */
    @NameInMap("CompanyId")
    public Long companyId;

    /**
     * <p>The name of the company or organization.</p>
     * 
     * <strong>example:</strong>
     * <p>testYanwen045</p>
     */
    @NameInMap("CompanyName")
    public String companyName;

    /**
     * <p>The phone number of the company.</p>
     * 
     * <strong>example:</strong>
     * <p>1511</p>
     */
    @NameInMap("CompanyPhone")
    public String companyPhone;

    /**
     * <p>The company type.</p>
     * 
     * <strong>example:</strong>
     * <p>0</p>
     */
    @NameInMap("CompanyType")
    public Integer companyType;

    /**
     * <p>The country code.</p>
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
     * 
     * <strong>example:</strong>
     * <p>100000</p>
     */
    @NameInMap("PostCode")
    public String postCode;

    /**
     * <p>The province.</p>
     * 
     * <strong>example:</strong>
     * <p>Beijing</p>
     */
    @NameInMap("Province")
    public String province;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>0068247C-A454-5FC9-93BF-C41CBB5CD19E</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetCompanyResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCompanyResponseBody self = new GetCompanyResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCompanyResponseBody setCity(String city) {
        this.city = city;
        return this;
    }
    public String getCity() {
        return this.city;
    }

    public GetCompanyResponseBody setCompanyAddress(String companyAddress) {
        this.companyAddress = companyAddress;
        return this;
    }
    public String getCompanyAddress() {
        return this.companyAddress;
    }

    public GetCompanyResponseBody setCompanyCode(String companyCode) {
        this.companyCode = companyCode;
        return this;
    }
    public String getCompanyCode() {
        return this.companyCode;
    }

    public GetCompanyResponseBody setCompanyEmail(String companyEmail) {
        this.companyEmail = companyEmail;
        return this;
    }
    public String getCompanyEmail() {
        return this.companyEmail;
    }

    public GetCompanyResponseBody setCompanyId(Long companyId) {
        this.companyId = companyId;
        return this;
    }
    public Long getCompanyId() {
        return this.companyId;
    }

    public GetCompanyResponseBody setCompanyName(String companyName) {
        this.companyName = companyName;
        return this;
    }
    public String getCompanyName() {
        return this.companyName;
    }

    public GetCompanyResponseBody setCompanyPhone(String companyPhone) {
        this.companyPhone = companyPhone;
        return this;
    }
    public String getCompanyPhone() {
        return this.companyPhone;
    }

    public GetCompanyResponseBody setCompanyType(Integer companyType) {
        this.companyType = companyType;
        return this;
    }
    public Integer getCompanyType() {
        return this.companyType;
    }

    public GetCompanyResponseBody setCountryCode(String countryCode) {
        this.countryCode = countryCode;
        return this;
    }
    public String getCountryCode() {
        return this.countryCode;
    }

    public GetCompanyResponseBody setDepartment(String department) {
        this.department = department;
        return this;
    }
    public String getDepartment() {
        return this.department;
    }

    public GetCompanyResponseBody setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public GetCompanyResponseBody setPostCode(String postCode) {
        this.postCode = postCode;
        return this;
    }
    public String getPostCode() {
        return this.postCode;
    }

    public GetCompanyResponseBody setProvince(String province) {
        this.province = province;
        return this;
    }
    public String getProvince() {
        return this.province;
    }

    public GetCompanyResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

}
