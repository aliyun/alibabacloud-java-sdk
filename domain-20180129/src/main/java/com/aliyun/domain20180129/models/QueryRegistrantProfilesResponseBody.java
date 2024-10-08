// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class QueryRegistrantProfilesResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPageNum")
    public Integer currentPageNum;

    /**
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("NextPage")
    public Boolean nextPage;

    /**
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("PrePage")
    public Boolean prePage;

    @NameInMap("RegistrantProfiles")
    public QueryRegistrantProfilesResponseBodyRegistrantProfiles registrantProfiles;

    /**
     * <strong>example:</strong>
     * <p>94053D79-7455-4F71-BF06-20EB2DEDE6BD</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>9</p>
     */
    @NameInMap("TotalItemNum")
    public Integer totalItemNum;

    /**
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
         * <strong>example:</strong>
         * <p>zhe jiang sheng hang zhou shi shi li qu shi li zhen shi li da sha 1001 hao</p>
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
         * <p>2019-02-18 10:46:47</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("CredentialNo")
        public String credentialNo;

        @NameInMap("CredentialType")
        public String credentialType;

        /**
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("DefaultRegistrantProfile")
        public Boolean defaultRegistrantProfile;

        /**
         * <strong>example:</strong>
         * <p>82106****@qq.com</p>
         */
        @NameInMap("Email")
        public String email;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("EmailVerificationStatus")
        public Integer emailVerificationStatus;

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
         * <p>SUCCEED</p>
         */
        @NameInMap("RealNameStatus")
        public String realNameStatus;

        /**
         * <strong>example:</strong>
         * <p>li si</p>
         */
        @NameInMap("RegistrantName")
        public String registrantName;

        /**
         * <strong>example:</strong>
         * <p>li si</p>
         */
        @NameInMap("RegistrantOrganization")
        public String registrantOrganization;

        /**
         * <strong>example:</strong>
         * <p>1000001</p>
         */
        @NameInMap("RegistrantProfileId")
        public Long registrantProfileId;

        /**
         * <strong>example:</strong>
         * <p>common</p>
         */
        @NameInMap("RegistrantProfileType")
        public String registrantProfileType;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("RegistrantType")
        public String registrantType;

        @NameInMap("Remark")
        public String remark;

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
         * <p>1829756****</p>
         */
        @NameInMap("Telephone")
        public String telephone;

        /**
         * <strong>example:</strong>
         * <p>2019-03-15 15:32:45</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

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
