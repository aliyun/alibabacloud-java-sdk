// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class QueryRegistrantProfilesResponseBody extends TeaModel {
    /**
     * <p>The page number returned.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPageNum")
    public Integer currentPageNum;

    /**
     * <p>Indicates whether the current page is followed by a page. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("NextPage")
    public Boolean nextPage;

    /**
     * <p>The number of entries returned on each page. Default value: <strong>0</strong>. Maximum value: <strong>5000</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <p>Indicates whether the current page is preceded by a page. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("PrePage")
    public Boolean prePage;

    /**
     * <p>The list of registrant profiles.</p>
     */
    @NameInMap("RegistrantProfiles")
    public QueryRegistrantProfilesResponseBodyRegistrantProfiles registrantProfiles;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>94053D79-7455-4F71-BF06-20EB2DEDE6BD</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries.</p>
     * <blockquote>
     * <p> This parameter indicates the total number of queried registrant profiles. If multiple registrant profiles are queried, the information about these profiles is returned in sequence by profile.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>9</p>
     */
    @NameInMap("TotalItemNum")
    public Integer totalItemNum;

    /**
     * <p>The total number of returned pages.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("TotalPageNum")
    public Integer totalPageNum;

    public static QueryRegistrantProfilesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryRegistrantProfilesResponseBody self = new QueryRegistrantProfilesResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryRegistrantProfilesResponseBody setCurrentPageNum(Integer currentPageNum) {
        this.currentPageNum = currentPageNum;
        return this;
    }
    public Integer getCurrentPageNum() {
        return this.currentPageNum;
    }

    public QueryRegistrantProfilesResponseBody setNextPage(Boolean nextPage) {
        this.nextPage = nextPage;
        return this;
    }
    public Boolean getNextPage() {
        return this.nextPage;
    }

    public QueryRegistrantProfilesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryRegistrantProfilesResponseBody setPrePage(Boolean prePage) {
        this.prePage = prePage;
        return this;
    }
    public Boolean getPrePage() {
        return this.prePage;
    }

    public QueryRegistrantProfilesResponseBody setRegistrantProfiles(QueryRegistrantProfilesResponseBodyRegistrantProfiles registrantProfiles) {
        this.registrantProfiles = registrantProfiles;
        return this;
    }
    public QueryRegistrantProfilesResponseBodyRegistrantProfiles getRegistrantProfiles() {
        return this.registrantProfiles;
    }

    public QueryRegistrantProfilesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryRegistrantProfilesResponseBody setTotalItemNum(Integer totalItemNum) {
        this.totalItemNum = totalItemNum;
        return this;
    }
    public Integer getTotalItemNum() {
        return this.totalItemNum;
    }

    public QueryRegistrantProfilesResponseBody setTotalPageNum(Integer totalPageNum) {
        this.totalPageNum = totalPageNum;
        return this;
    }
    public Integer getTotalPageNum() {
        return this.totalPageNum;
    }

    public static class QueryRegistrantProfilesResponseBodyRegistrantProfilesRegistrantProfile extends TeaModel {
        /**
         * <p>The address of the domain name registrant.</p>
         * 
         * <strong>example:</strong>
         * <p>zhe jiang sheng hang zhou shi shi li qu shi li zhen shi li da sha 1001 hao</p>
         */
        @NameInMap("Address")
        public String address;

        /**
         * <p>The city where the domain name registrant is located, in English.</p>
         * 
         * <strong>example:</strong>
         * <p>hang zhou shi</p>
         */
        @NameInMap("City")
        public String city;

        /**
         * <p>The code of the country or region where the domain name registrant is located, such as <strong>CN</strong> or <strong>US</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>CN</p>
         */
        @NameInMap("Country")
        public String country;

        /**
         * <p>The time when the registrant profile was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-02-18 10:46:47</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The certificate number.</p>
         * 
         * <strong>example:</strong>
         * <p>4****************1</p>
         */
        @NameInMap("CredentialNo")
        public String credentialNo;

        /**
         * <p>The certificate type.</p>
         * 
         * <strong>example:</strong>
         * <p>YYZZ</p>
         */
        @NameInMap("CredentialType")
        public String credentialType;

        /**
         * <p>Indicates whether the template is the default template. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * <p>Default value: <strong>false</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("DefaultRegistrantProfile")
        public Boolean defaultRegistrantProfile;

        /**
         * <p>The email address of the domain name registrant.</p>
         * 
         * <strong>example:</strong>
         * <p>82106****@qq.com</p>
         */
        @NameInMap("Email")
        public String email;

        /**
         * <p>The status of the verification for the email address. Valid values:</p>
         * <ul>
         * <li><strong>0</strong>: not verified</li>
         * <li><strong>1</strong>: verified</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("EmailVerificationStatus")
        public Integer emailVerificationStatus;

        @NameInMap("Params")
        public String params;

        /**
         * <p>The postal code of the region where the domain name registrant is located.</p>
         * 
         * <strong>example:</strong>
         * <p>310024</p>
         */
        @NameInMap("PostalCode")
        public String postalCode;

        /**
         * <p>The province where the domain name registrant is located.</p>
         * 
         * <strong>example:</strong>
         * <p>zhe jiang</p>
         */
        @NameInMap("Province")
        public String province;

        /**
         * <p>The state of real-name verification for the domain name registrant. Valid values:</p>
         * <ul>
         * <li><strong>FAILED</strong>: Real-name verification for the domain name fails.</li>
         * <li><strong>SUCCEED</strong>: Real-name verification for the domain name is successful.</li>
         * <li><strong>NONAUDIT</strong>: Real-name verification for the domain name is not performed.</li>
         * <li><strong>AUDITING</strong>: Real-name verification for the domain name is in progress.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>SUCCEED</p>
         */
        @NameInMap("RealNameStatus")
        public String realNameStatus;

        /**
         * <p>The name of the domain name contact.</p>
         * 
         * <strong>example:</strong>
         * <p>li si</p>
         */
        @NameInMap("RegistrantName")
        public String registrantName;

        /**
         * <p>The name of the domain name registrant.</p>
         * 
         * <strong>example:</strong>
         * <p>li si</p>
         */
        @NameInMap("RegistrantOrganization")
        public String registrantOrganization;

        /**
         * <p>The ID of the registrant profile.</p>
         * 
         * <strong>example:</strong>
         * <p>1000001</p>
         */
        @NameInMap("RegistrantProfileId")
        public Long registrantProfileId;

        /**
         * <p>The type of the registrant profile. Valid values:</p>
         * <ul>
         * <li><strong>common</strong>: common profile.</li>
         * <li><strong>cnnic</strong>: CNNIC profile.</li>
         * </ul>
         * <blockquote>
         * <p> Only the Alibaba Cloud international site (alibabacloud.com) supports CNNIC profiles. To register domain names provided by CNNIC such as the .cn and . domain names on the Alibaba Cloud international site, you must use a CNNIC profile. To register other domain names, use a common profile.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>common</p>
         */
        @NameInMap("RegistrantProfileType")
        public String registrantProfileType;

        /**
         * <p>The type of the domain name registrant. Valid values:</p>
         * <ul>
         * <li><strong>1</strong>: individual.</li>
         * <li><strong>2</strong>: enterprise.</li>
         * </ul>
         * <p>Default value: <strong>1</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RegistrantType")
        public String registrantType;

        /**
         * <p>The remarks.</p>
         * 
         * <strong>example:</strong>
         * <p>Test domain name</p>
         */
        @NameInMap("Remark")
        public String remark;

        /**
         * <p>The international dialing code of the country or region where the domain name contact is located. For example, the international dialing code of China is <strong>86</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>86</p>
         */
        @NameInMap("TelArea")
        public String telArea;

        /**
         * <p>The extension of the phone number.</p>
         * 
         * <strong>example:</strong>
         * <p>1234</p>
         */
        @NameInMap("TelExt")
        public String telExt;

        /**
         * <p>The phone number.</p>
         * 
         * <strong>example:</strong>
         * <p>1829756****</p>
         */
        @NameInMap("Telephone")
        public String telephone;

        /**
         * <p>The time when the registrant profile was updated.</p>
         * 
         * <strong>example:</strong>
         * <p>2019-03-15 15:32:45</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        /**
         * <p>The address of the domain name registrant, in Chinese.</p>
         */
        @NameInMap("ZhAddress")
        public String zhAddress;

        /**
         * <p>The city where the domain name registrant is located, in Chinese.</p>
         */
        @NameInMap("ZhCity")
        public String zhCity;

        /**
         * <p>The province where the domain name registrant is located, in Chinese.</p>
         */
        @NameInMap("ZhProvince")
        public String zhProvince;

        /**
         * <p>The Chinese name of the domain name contact.</p>
         */
        @NameInMap("ZhRegistrantName")
        public String zhRegistrantName;

        /**
         * <p>The Chinese name of the domain name registrant.</p>
         */
        @NameInMap("ZhRegistrantOrganization")
        public String zhRegistrantOrganization;

        public static QueryRegistrantProfilesResponseBodyRegistrantProfilesRegistrantProfile build(java.util.Map<String, ?> map) throws Exception {
            QueryRegistrantProfilesResponseBodyRegistrantProfilesRegistrantProfile self = new QueryRegistrantProfilesResponseBodyRegistrantProfilesRegistrantProfile();
            return TeaModel.build(map, self);
        }

        public QueryRegistrantProfilesResponseBodyRegistrantProfilesRegistrantProfile setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public QueryRegistrantProfilesResponseBodyRegistrantProfilesRegistrantProfile setCity(String city) {
            this.city = city;
            return this;
        }
        public String getCity() {
            return this.city;
        }

        public QueryRegistrantProfilesResponseBodyRegistrantProfilesRegistrantProfile setCountry(String country) {
            this.country = country;
            return this;
        }
        public String getCountry() {
            return this.country;
        }

        public QueryRegistrantProfilesResponseBodyRegistrantProfilesRegistrantProfile setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public QueryRegistrantProfilesResponseBodyRegistrantProfilesRegistrantProfile setCredentialNo(String credentialNo) {
            this.credentialNo = credentialNo;
            return this;
        }
        public String getCredentialNo() {
            return this.credentialNo;
        }

        public QueryRegistrantProfilesResponseBodyRegistrantProfilesRegistrantProfile setCredentialType(String credentialType) {
            this.credentialType = credentialType;
            return this;
        }
        public String getCredentialType() {
            return this.credentialType;
        }

        public QueryRegistrantProfilesResponseBodyRegistrantProfilesRegistrantProfile setDefaultRegistrantProfile(Boolean defaultRegistrantProfile) {
            this.defaultRegistrantProfile = defaultRegistrantProfile;
            return this;
        }
        public Boolean getDefaultRegistrantProfile() {
            return this.defaultRegistrantProfile;
        }

        public QueryRegistrantProfilesResponseBodyRegistrantProfilesRegistrantProfile setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public QueryRegistrantProfilesResponseBodyRegistrantProfilesRegistrantProfile setEmailVerificationStatus(Integer emailVerificationStatus) {
            this.emailVerificationStatus = emailVerificationStatus;
            return this;
        }
        public Integer getEmailVerificationStatus() {
            return this.emailVerificationStatus;
        }

        public QueryRegistrantProfilesResponseBodyRegistrantProfilesRegistrantProfile setParams(String params) {
            this.params = params;
            return this;
        }
        public String getParams() {
            return this.params;
        }

        public QueryRegistrantProfilesResponseBodyRegistrantProfilesRegistrantProfile setPostalCode(String postalCode) {
            this.postalCode = postalCode;
            return this;
        }
        public String getPostalCode() {
            return this.postalCode;
        }

        public QueryRegistrantProfilesResponseBodyRegistrantProfilesRegistrantProfile setProvince(String province) {
            this.province = province;
            return this;
        }
        public String getProvince() {
            return this.province;
        }

        public QueryRegistrantProfilesResponseBodyRegistrantProfilesRegistrantProfile setRealNameStatus(String realNameStatus) {
            this.realNameStatus = realNameStatus;
            return this;
        }
        public String getRealNameStatus() {
            return this.realNameStatus;
        }

        public QueryRegistrantProfilesResponseBodyRegistrantProfilesRegistrantProfile setRegistrantName(String registrantName) {
            this.registrantName = registrantName;
            return this;
        }
        public String getRegistrantName() {
            return this.registrantName;
        }

        public QueryRegistrantProfilesResponseBodyRegistrantProfilesRegistrantProfile setRegistrantOrganization(String registrantOrganization) {
            this.registrantOrganization = registrantOrganization;
            return this;
        }
        public String getRegistrantOrganization() {
            return this.registrantOrganization;
        }

        public QueryRegistrantProfilesResponseBodyRegistrantProfilesRegistrantProfile setRegistrantProfileId(Long registrantProfileId) {
            this.registrantProfileId = registrantProfileId;
            return this;
        }
        public Long getRegistrantProfileId() {
            return this.registrantProfileId;
        }

        public QueryRegistrantProfilesResponseBodyRegistrantProfilesRegistrantProfile setRegistrantProfileType(String registrantProfileType) {
            this.registrantProfileType = registrantProfileType;
            return this;
        }
        public String getRegistrantProfileType() {
            return this.registrantProfileType;
        }

        public QueryRegistrantProfilesResponseBodyRegistrantProfilesRegistrantProfile setRegistrantType(String registrantType) {
            this.registrantType = registrantType;
            return this;
        }
        public String getRegistrantType() {
            return this.registrantType;
        }

        public QueryRegistrantProfilesResponseBodyRegistrantProfilesRegistrantProfile setRemark(String remark) {
            this.remark = remark;
            return this;
        }
        public String getRemark() {
            return this.remark;
        }

        public QueryRegistrantProfilesResponseBodyRegistrantProfilesRegistrantProfile setTelArea(String telArea) {
            this.telArea = telArea;
            return this;
        }
        public String getTelArea() {
            return this.telArea;
        }

        public QueryRegistrantProfilesResponseBodyRegistrantProfilesRegistrantProfile setTelExt(String telExt) {
            this.telExt = telExt;
            return this;
        }
        public String getTelExt() {
            return this.telExt;
        }

        public QueryRegistrantProfilesResponseBodyRegistrantProfilesRegistrantProfile setTelephone(String telephone) {
            this.telephone = telephone;
            return this;
        }
        public String getTelephone() {
            return this.telephone;
        }

        public QueryRegistrantProfilesResponseBodyRegistrantProfilesRegistrantProfile setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public QueryRegistrantProfilesResponseBodyRegistrantProfilesRegistrantProfile setZhAddress(String zhAddress) {
            this.zhAddress = zhAddress;
            return this;
        }
        public String getZhAddress() {
            return this.zhAddress;
        }

        public QueryRegistrantProfilesResponseBodyRegistrantProfilesRegistrantProfile setZhCity(String zhCity) {
            this.zhCity = zhCity;
            return this;
        }
        public String getZhCity() {
            return this.zhCity;
        }

        public QueryRegistrantProfilesResponseBodyRegistrantProfilesRegistrantProfile setZhProvince(String zhProvince) {
            this.zhProvince = zhProvince;
            return this;
        }
        public String getZhProvince() {
            return this.zhProvince;
        }

        public QueryRegistrantProfilesResponseBodyRegistrantProfilesRegistrantProfile setZhRegistrantName(String zhRegistrantName) {
            this.zhRegistrantName = zhRegistrantName;
            return this;
        }
        public String getZhRegistrantName() {
            return this.zhRegistrantName;
        }

        public QueryRegistrantProfilesResponseBodyRegistrantProfilesRegistrantProfile setZhRegistrantOrganization(String zhRegistrantOrganization) {
            this.zhRegistrantOrganization = zhRegistrantOrganization;
            return this;
        }
        public String getZhRegistrantOrganization() {
            return this.zhRegistrantOrganization;
        }

    }

    public static class QueryRegistrantProfilesResponseBodyRegistrantProfiles extends TeaModel {
        @NameInMap("RegistrantProfile")
        public java.util.List<QueryRegistrantProfilesResponseBodyRegistrantProfilesRegistrantProfile> registrantProfile;

        public static QueryRegistrantProfilesResponseBodyRegistrantProfiles build(java.util.Map<String, ?> map) throws Exception {
            QueryRegistrantProfilesResponseBodyRegistrantProfiles self = new QueryRegistrantProfilesResponseBodyRegistrantProfiles();
            return TeaModel.build(map, self);
        }

        public QueryRegistrantProfilesResponseBodyRegistrantProfiles setRegistrantProfile(java.util.List<QueryRegistrantProfilesResponseBodyRegistrantProfilesRegistrantProfile> registrantProfile) {
            this.registrantProfile = registrantProfile;
            return this;
        }
        public java.util.List<QueryRegistrantProfilesResponseBodyRegistrantProfilesRegistrantProfile> getRegistrantProfile() {
            return this.registrantProfile;
        }

    }

}
