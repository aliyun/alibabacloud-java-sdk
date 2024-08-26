// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class QueryContactInfoResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>xi hu qu *** jiedao *** xiaoqu *** zhuang 101</p>
     */
    @NameInMap("Address")
    public String address;

    /**
     * <strong>example:</strong>
     * <p>hang zhou shi</p>
     */
    @NameInMap("City")
    public String city;

    /**
     * <strong>example:</strong>
     * <p>CN</p>
     */
    @NameInMap("Country")
    public String country;

    /**
     * <strong>example:</strong>
     * <p>2019-03-20 11:37:29</p>
     */
    @NameInMap("CreateDate")
    public String createDate;

    /**
     * <strong>example:</strong>
     * <p><a href="mailto:username@example.com">username@example.com</a></p>
     */
    @NameInMap("Email")
    public String email;

    /**
     * <strong>example:</strong>
     * <p>310024</p>
     */
    @NameInMap("PostalCode")
    public String postalCode;

    /**
     * <strong>example:</strong>
     * <p>zhe jiang</p>
     */
    @NameInMap("Province")
    public String province;

    /**
     * <strong>example:</strong>
     * <p>zhang san</p>
     */
    @NameInMap("RegistrantName")
    public String registrantName;

    /**
     * <strong>example:</strong>
     * <p>zhang san</p>
     */
    @NameInMap("RegistrantOrganization")
    public String registrantOrganization;

    /**
     * <strong>example:</strong>
     * <p>C39ECA8A-BB5E-4F92-B013-6A032FA06B04</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>86</p>
     */
    @NameInMap("TelArea")
    public String telArea;

    /**
     * <strong>example:</strong>
     * <p>1234</p>
     */
    @NameInMap("TelExt")
    public String telExt;

    /**
     * <strong>example:</strong>
     * <p>1820000****</p>
     */
    @NameInMap("Telephone")
    public String telephone;

    @NameInMap("ZhAddress")
    public String zhAddress;

    @NameInMap("ZhCity")
    public String zhCity;

    @NameInMap("ZhProvince")
    public String zhProvince;

    @NameInMap("ZhRegistrantName")
    public String zhRegistrantName;

    @NameInMap("ZhRegistrantOrganization")
    public String zhRegistrantOrganization;

    public static QueryContactInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryContactInfoResponseBody self = new QueryContactInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryContactInfoResponseBody setAddress(String address) {
        this.address = address;
        return this;
    }
    public String getAddress() {
        return this.address;
    }

    public QueryContactInfoResponseBody setCity(String city) {
        this.city = city;
        return this;
    }
    public String getCity() {
        return this.city;
    }

    public QueryContactInfoResponseBody setCountry(String country) {
        this.country = country;
        return this;
    }
    public String getCountry() {
        return this.country;
    }

    public QueryContactInfoResponseBody setCreateDate(String createDate) {
        this.createDate = createDate;
        return this;
    }
    public String getCreateDate() {
        return this.createDate;
    }

    public QueryContactInfoResponseBody setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public QueryContactInfoResponseBody setPostalCode(String postalCode) {
        this.postalCode = postalCode;
        return this;
    }
    public String getPostalCode() {
        return this.postalCode;
    }

    public QueryContactInfoResponseBody setProvince(String province) {
        this.province = province;
        return this;
    }
    public String getProvince() {
        return this.province;
    }

    public QueryContactInfoResponseBody setRegistrantName(String registrantName) {
        this.registrantName = registrantName;
        return this;
    }
    public String getRegistrantName() {
        return this.registrantName;
    }

    public QueryContactInfoResponseBody setRegistrantOrganization(String registrantOrganization) {
        this.registrantOrganization = registrantOrganization;
        return this;
    }
    public String getRegistrantOrganization() {
        return this.registrantOrganization;
    }

    public QueryContactInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryContactInfoResponseBody setTelArea(String telArea) {
        this.telArea = telArea;
        return this;
    }
    public String getTelArea() {
        return this.telArea;
    }

    public QueryContactInfoResponseBody setTelExt(String telExt) {
        this.telExt = telExt;
        return this;
    }
    public String getTelExt() {
        return this.telExt;
    }

    public QueryContactInfoResponseBody setTelephone(String telephone) {
        this.telephone = telephone;
        return this;
    }
    public String getTelephone() {
        return this.telephone;
    }

    public QueryContactInfoResponseBody setZhAddress(String zhAddress) {
        this.zhAddress = zhAddress;
        return this;
    }
    public String getZhAddress() {
        return this.zhAddress;
    }

    public QueryContactInfoResponseBody setZhCity(String zhCity) {
        this.zhCity = zhCity;
        return this;
    }
    public String getZhCity() {
        return this.zhCity;
    }

    public QueryContactInfoResponseBody setZhProvince(String zhProvince) {
        this.zhProvince = zhProvince;
        return this;
    }
    public String getZhProvince() {
        return this.zhProvince;
    }

    public QueryContactInfoResponseBody setZhRegistrantName(String zhRegistrantName) {
        this.zhRegistrantName = zhRegistrantName;
        return this;
    }
    public String getZhRegistrantName() {
        return this.zhRegistrantName;
    }

    public QueryContactInfoResponseBody setZhRegistrantOrganization(String zhRegistrantOrganization) {
        this.zhRegistrantOrganization = zhRegistrantOrganization;
        return this;
    }
    public String getZhRegistrantOrganization() {
        return this.zhRegistrantOrganization;
    }

}
