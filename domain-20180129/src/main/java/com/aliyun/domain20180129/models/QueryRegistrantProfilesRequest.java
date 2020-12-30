// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class QueryRegistrantProfilesRequest extends TeaModel {
    @NameInMap("Lang")
    public String lang;

    @NameInMap("RegistrantOrganization")
    public String registrantOrganization;

    @NameInMap("UserClientIp")
    public String userClientIp;

    @NameInMap("RegistrantProfileId")
    public Long registrantProfileId;

    @NameInMap("DefaultRegistrantProfile")
    public Boolean defaultRegistrantProfile;

    @NameInMap("PageNum")
    public Integer pageNum;

    @NameInMap("PageSize")
    public Integer pageSize;

    @NameInMap("ZhRegistrantOrganization")
    public String zhRegistrantOrganization;

    @NameInMap("RegistrantType")
    public String registrantType;

    @NameInMap("RealNameStatus")
    public String realNameStatus;

    @NameInMap("Email")
    public String email;

    @NameInMap("RegistrantProfileType")
    public String registrantProfileType;

    public static QueryRegistrantProfilesRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryRegistrantProfilesRequest self = new QueryRegistrantProfilesRequest();
        return TeaModel.build(map, self);
    }

    public QueryRegistrantProfilesRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
    }

    public QueryRegistrantProfilesRequest setRegistrantOrganization(String registrantOrganization) {
        this.registrantOrganization = registrantOrganization;
        return this;
    }
    public String getRegistrantOrganization() {
        return this.registrantOrganization;
    }

    public QueryRegistrantProfilesRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
    }

    public QueryRegistrantProfilesRequest setRegistrantProfileId(Long registrantProfileId) {
        this.registrantProfileId = registrantProfileId;
        return this;
    }
    public Long getRegistrantProfileId() {
        return this.registrantProfileId;
    }

    public QueryRegistrantProfilesRequest setDefaultRegistrantProfile(Boolean defaultRegistrantProfile) {
        this.defaultRegistrantProfile = defaultRegistrantProfile;
        return this;
    }
    public Boolean getDefaultRegistrantProfile() {
        return this.defaultRegistrantProfile;
    }

    public QueryRegistrantProfilesRequest setPageNum(Integer pageNum) {
        this.pageNum = pageNum;
        return this;
    }
    public Integer getPageNum() {
        return this.pageNum;
    }

    public QueryRegistrantProfilesRequest setPageSize(Integer pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Integer getPageSize() {
        return this.pageSize;
    }

    public QueryRegistrantProfilesRequest setZhRegistrantOrganization(String zhRegistrantOrganization) {
        this.zhRegistrantOrganization = zhRegistrantOrganization;
        return this;
    }
    public String getZhRegistrantOrganization() {
        return this.zhRegistrantOrganization;
    }

    public QueryRegistrantProfilesRequest setRegistrantType(String registrantType) {
        this.registrantType = registrantType;
        return this;
    }
    public String getRegistrantType() {
        return this.registrantType;
    }

    public QueryRegistrantProfilesRequest setRealNameStatus(String realNameStatus) {
        this.realNameStatus = realNameStatus;
        return this;
    }
    public String getRealNameStatus() {
        return this.realNameStatus;
    }

    public QueryRegistrantProfilesRequest setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public QueryRegistrantProfilesRequest setRegistrantProfileType(String registrantProfileType) {
        this.registrantProfileType = registrantProfileType;
        return this;
    }
    public String getRegistrantProfileType() {
        return this.registrantProfileType;
    }

}
