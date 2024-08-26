// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class QueryRegistrantProfilesRequest extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DefaultRegistrantProfile")
    public Boolean defaultRegistrantProfile;

    /**
     * <strong>example:</strong>
     * <p><a href="mailto:username@example.com">username@example.com</a></p>
     */
    @NameInMap("Email")
    public String email;

    /**
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNum")
    public Integer pageNum;

    /**
     * <strong>example:</strong>
     * <p>500</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

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
    @NameInMap("RegistrantOrganization")
    public String registrantOrganization;

    /**
     * <strong>example:</strong>
     * <p>1234567</p>
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
     * <p>127.0.0.1</p>
     */
    @NameInMap("UserClientIp")
    public String userClientIp;

    @NameInMap("ZhRegistrantOrganization")
    public String zhRegistrantOrganization;

    public static QueryRegistrantProfilesRequest build(java.util.Map<String, ?> map) throws Exception {
        QueryRegistrantProfilesRequest self = new QueryRegistrantProfilesRequest();
        return TeaModel.build(map, self);
    }

    public QueryRegistrantProfilesRequest setDefaultRegistrantProfile(Boolean defaultRegistrantProfile) {
        this.defaultRegistrantProfile = defaultRegistrantProfile;
        return this;
    }
    public Boolean getDefaultRegistrantProfile() {
        return this.defaultRegistrantProfile;
    }

    public QueryRegistrantProfilesRequest setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public QueryRegistrantProfilesRequest setLang(String lang) {
        this.lang = lang;
        return this;
    }
    public String getLang() {
        return this.lang;
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

    public QueryRegistrantProfilesRequest setRealNameStatus(String realNameStatus) {
        this.realNameStatus = realNameStatus;
        return this;
    }
    public String getRealNameStatus() {
        return this.realNameStatus;
    }

    public QueryRegistrantProfilesRequest setRegistrantOrganization(String registrantOrganization) {
        this.registrantOrganization = registrantOrganization;
        return this;
    }
    public String getRegistrantOrganization() {
        return this.registrantOrganization;
    }

    public QueryRegistrantProfilesRequest setRegistrantProfileId(Long registrantProfileId) {
        this.registrantProfileId = registrantProfileId;
        return this;
    }
    public Long getRegistrantProfileId() {
        return this.registrantProfileId;
    }

    public QueryRegistrantProfilesRequest setRegistrantProfileType(String registrantProfileType) {
        this.registrantProfileType = registrantProfileType;
        return this;
    }
    public String getRegistrantProfileType() {
        return this.registrantProfileType;
    }

    public QueryRegistrantProfilesRequest setRegistrantType(String registrantType) {
        this.registrantType = registrantType;
        return this;
    }
    public String getRegistrantType() {
        return this.registrantType;
    }

    public QueryRegistrantProfilesRequest setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public QueryRegistrantProfilesRequest setUserClientIp(String userClientIp) {
        this.userClientIp = userClientIp;
        return this;
    }
    public String getUserClientIp() {
        return this.userClientIp;
    }

    public QueryRegistrantProfilesRequest setZhRegistrantOrganization(String zhRegistrantOrganization) {
        this.zhRegistrantOrganization = zhRegistrantOrganization;
        return this;
    }
    public String getZhRegistrantOrganization() {
        return this.zhRegistrantOrganization;
    }

}
