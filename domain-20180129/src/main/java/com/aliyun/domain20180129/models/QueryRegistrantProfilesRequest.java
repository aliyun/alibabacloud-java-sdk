// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class QueryRegistrantProfilesRequest extends TeaModel {
    /**
     * <p>Specifies whether to query the default profile. Valid values:</p>
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
     * <p><a href="mailto:username@example.com">username@example.com</a></p>
     */
    @NameInMap("Email")
    public String email;

    /**
     * <p>The language of the error message to return if the request fails. Valid values:</p>
     * <ul>
     * <li><strong>zh</strong>: Chinese</li>
     * <li><strong>en</strong>: English</li>
     * </ul>
     * <p>Default value: <strong>en</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>en</p>
     */
    @NameInMap("Lang")
    public String lang;

    /**
     * <p>The number of the page to return. Default value: <strong>0</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNum")
    public Integer pageNum;

    /**
     * <p>The number of entries per page. Default value: <strong>0</strong>. Maximum value: <strong>5000</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>500</p>
     */
    @NameInMap("PageSize")
    public Integer pageSize;

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
     * <p>The name of the domain name registrant.</p>
     * 
     * <strong>example:</strong>
     * <p>li si</p>
     */
    @NameInMap("RegistrantOrganization")
    public String registrantOrganization;

    /**
     * <p>The ID of the registrant profile that you want to query. The system generates an ID after you create a registrant profile.</p>
     * 
     * <strong>example:</strong>
     * <p>1234567</p>
     */
    @NameInMap("RegistrantProfileId")
    public Long registrantProfileId;

    /**
     * <p>The type of the registrant profile. Valid values:</p>
     * <ul>
     * <li><strong>common</strong>: common profile.</li>
     * <li><strong>cnnic</strong>: China Internet Network Information Center (CNNIC) profile.</li>
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
     * <p>The IP address of the client. Set the value to 127.0.0.1.</p>
     * 
     * <strong>example:</strong>
     * <p>127.0.0.1</p>
     */
    @NameInMap("UserClientIp")
    public String userClientIp;

    /**
     * <p>The Chinese name of the domain name registrant.</p>
     */
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
