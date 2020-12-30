// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class QueryRegistrantProfilesResponseBody extends TeaModel {
    @NameInMap("PrePage")
    public Boolean prePage;

    @NameInMap("CurrentPageNum")
    public Integer currentPageNum;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("TotalPageNum")
    public Integer totalPageNum;

    @NameInMap("RegistrantProfiles")
    public QueryRegistrantProfilesResponseBodyRegistrantProfiles registrantProfiles;

    @NameInMap("TotalItemNum")
    public Integer totalItemNum;

    @NameInMap("NextPage")
    public Boolean nextPage;

    public static QueryRegistrantProfilesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryRegistrantProfilesResponseBody self = new QueryRegistrantProfilesResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryRegistrantProfilesResponseBody setPrePage(Boolean prePage) {
        this.prePage = prePage;
        return this;
    }
    public Boolean getPrePage() {
        return this.prePage;
    }

    public QueryRegistrantProfilesResponseBody setCurrentPageNum(Integer currentPageNum) {
        this.currentPageNum = currentPageNum;
        return this;
    }
    public Integer getCurrentPageNum() {
        return this.currentPageNum;
    }

    public QueryRegistrantProfilesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryRegistrantProfilesResponseBody setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryRegistrantProfilesResponseBody setTotalPageNum(Integer totalPageNum) {
        this.totalPageNum = totalPageNum;
        return this;
    }
    public Integer getTotalPageNum() {
        return this.totalPageNum;
    }

    public QueryRegistrantProfilesResponseBody setRegistrantProfiles(QueryRegistrantProfilesResponseBodyRegistrantProfiles registrantProfiles) {
        this.registrantProfiles = registrantProfiles;
        return this;
    }
    public QueryRegistrantProfilesResponseBodyRegistrantProfiles getRegistrantProfiles() {
        return this.registrantProfiles;
    }

    public QueryRegistrantProfilesResponseBody setTotalItemNum(Integer totalItemNum) {
        this.totalItemNum = totalItemNum;
        return this;
    }
    public Integer getTotalItemNum() {
        return this.totalItemNum;
    }

    public QueryRegistrantProfilesResponseBody setNextPage(Boolean nextPage) {
        this.nextPage = nextPage;
        return this;
    }
    public Boolean getNextPage() {
        return this.nextPage;
    }

    public static class QueryRegistrantProfilesResponseBodyRegistrantProfilesRegistrantProfile extends TeaModel {
        @NameInMap("TelExt")
        public String telExt;

        @NameInMap("UpdateTime")
        public String updateTime;

        @NameInMap("ZhProvince")
        public String zhProvince;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Telephone")
        public String telephone;

        @NameInMap("RegistrantOrganization")
        public String registrantOrganization;

        @NameInMap("City")
        public String city;

        @NameInMap("ZhCity")
        public String zhCity;

        @NameInMap("TelArea")
        public String telArea;

        @NameInMap("Address")
        public String address;

        @NameInMap("RealNameStatus")
        public String realNameStatus;

        @NameInMap("PostalCode")
        public String postalCode;

        @NameInMap("RegistrantProfileType")
        public String registrantProfileType;

        @NameInMap("RegistrantProfileId")
        public Long registrantProfileId;

        @NameInMap("ZhRegistrantOrganization")
        public String zhRegistrantOrganization;

        @NameInMap("DefaultRegistrantProfile")
        public Boolean defaultRegistrantProfile;

        @NameInMap("ZhRegistrantName")
        public String zhRegistrantName;

        @NameInMap("Email")
        public String email;

        @NameInMap("RegistrantType")
        public String registrantType;

        @NameInMap("Country")
        public String country;

        @NameInMap("RegistrantName")
        public String registrantName;

        @NameInMap("EmailVerificationStatus")
        public Integer emailVerificationStatus;

        @NameInMap("ZhAddress")
        public String zhAddress;

        @NameInMap("Province")
        public String province;

        public static QueryRegistrantProfilesResponseBodyRegistrantProfilesRegistrantProfile build(java.util.Map<String, ?> map) throws Exception {
            QueryRegistrantProfilesResponseBodyRegistrantProfilesRegistrantProfile self = new QueryRegistrantProfilesResponseBodyRegistrantProfilesRegistrantProfile();
            return TeaModel.build(map, self);
        }

        public QueryRegistrantProfilesResponseBodyRegistrantProfilesRegistrantProfile setTelExt(String telExt) {
            this.telExt = telExt;
            return this;
        }
        public String getTelExt() {
            return this.telExt;
        }

        public QueryRegistrantProfilesResponseBodyRegistrantProfilesRegistrantProfile setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public QueryRegistrantProfilesResponseBodyRegistrantProfilesRegistrantProfile setZhProvince(String zhProvince) {
            this.zhProvince = zhProvince;
            return this;
        }
        public String getZhProvince() {
            return this.zhProvince;
        }

        public QueryRegistrantProfilesResponseBodyRegistrantProfilesRegistrantProfile setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public QueryRegistrantProfilesResponseBodyRegistrantProfilesRegistrantProfile setTelephone(String telephone) {
            this.telephone = telephone;
            return this;
        }
        public String getTelephone() {
            return this.telephone;
        }

        public QueryRegistrantProfilesResponseBodyRegistrantProfilesRegistrantProfile setRegistrantOrganization(String registrantOrganization) {
            this.registrantOrganization = registrantOrganization;
            return this;
        }
        public String getRegistrantOrganization() {
            return this.registrantOrganization;
        }

        public QueryRegistrantProfilesResponseBodyRegistrantProfilesRegistrantProfile setCity(String city) {
            this.city = city;
            return this;
        }
        public String getCity() {
            return this.city;
        }

        public QueryRegistrantProfilesResponseBodyRegistrantProfilesRegistrantProfile setZhCity(String zhCity) {
            this.zhCity = zhCity;
            return this;
        }
        public String getZhCity() {
            return this.zhCity;
        }

        public QueryRegistrantProfilesResponseBodyRegistrantProfilesRegistrantProfile setTelArea(String telArea) {
            this.telArea = telArea;
            return this;
        }
        public String getTelArea() {
            return this.telArea;
        }

        public QueryRegistrantProfilesResponseBodyRegistrantProfilesRegistrantProfile setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public QueryRegistrantProfilesResponseBodyRegistrantProfilesRegistrantProfile setRealNameStatus(String realNameStatus) {
            this.realNameStatus = realNameStatus;
            return this;
        }
        public String getRealNameStatus() {
            return this.realNameStatus;
        }

        public QueryRegistrantProfilesResponseBodyRegistrantProfilesRegistrantProfile setPostalCode(String postalCode) {
            this.postalCode = postalCode;
            return this;
        }
        public String getPostalCode() {
            return this.postalCode;
        }

        public QueryRegistrantProfilesResponseBodyRegistrantProfilesRegistrantProfile setRegistrantProfileType(String registrantProfileType) {
            this.registrantProfileType = registrantProfileType;
            return this;
        }
        public String getRegistrantProfileType() {
            return this.registrantProfileType;
        }

        public QueryRegistrantProfilesResponseBodyRegistrantProfilesRegistrantProfile setRegistrantProfileId(Long registrantProfileId) {
            this.registrantProfileId = registrantProfileId;
            return this;
        }
        public Long getRegistrantProfileId() {
            return this.registrantProfileId;
        }

        public QueryRegistrantProfilesResponseBodyRegistrantProfilesRegistrantProfile setZhRegistrantOrganization(String zhRegistrantOrganization) {
            this.zhRegistrantOrganization = zhRegistrantOrganization;
            return this;
        }
        public String getZhRegistrantOrganization() {
            return this.zhRegistrantOrganization;
        }

        public QueryRegistrantProfilesResponseBodyRegistrantProfilesRegistrantProfile setDefaultRegistrantProfile(Boolean defaultRegistrantProfile) {
            this.defaultRegistrantProfile = defaultRegistrantProfile;
            return this;
        }
        public Boolean getDefaultRegistrantProfile() {
            return this.defaultRegistrantProfile;
        }

        public QueryRegistrantProfilesResponseBodyRegistrantProfilesRegistrantProfile setZhRegistrantName(String zhRegistrantName) {
            this.zhRegistrantName = zhRegistrantName;
            return this;
        }
        public String getZhRegistrantName() {
            return this.zhRegistrantName;
        }

        public QueryRegistrantProfilesResponseBodyRegistrantProfilesRegistrantProfile setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public QueryRegistrantProfilesResponseBodyRegistrantProfilesRegistrantProfile setRegistrantType(String registrantType) {
            this.registrantType = registrantType;
            return this;
        }
        public String getRegistrantType() {
            return this.registrantType;
        }

        public QueryRegistrantProfilesResponseBodyRegistrantProfilesRegistrantProfile setCountry(String country) {
            this.country = country;
            return this;
        }
        public String getCountry() {
            return this.country;
        }

        public QueryRegistrantProfilesResponseBodyRegistrantProfilesRegistrantProfile setRegistrantName(String registrantName) {
            this.registrantName = registrantName;
            return this;
        }
        public String getRegistrantName() {
            return this.registrantName;
        }

        public QueryRegistrantProfilesResponseBodyRegistrantProfilesRegistrantProfile setEmailVerificationStatus(Integer emailVerificationStatus) {
            this.emailVerificationStatus = emailVerificationStatus;
            return this;
        }
        public Integer getEmailVerificationStatus() {
            return this.emailVerificationStatus;
        }

        public QueryRegistrantProfilesResponseBodyRegistrantProfilesRegistrantProfile setZhAddress(String zhAddress) {
            this.zhAddress = zhAddress;
            return this;
        }
        public String getZhAddress() {
            return this.zhAddress;
        }

        public QueryRegistrantProfilesResponseBodyRegistrantProfilesRegistrantProfile setProvince(String province) {
            this.province = province;
            return this;
        }
        public String getProvince() {
            return this.province;
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
