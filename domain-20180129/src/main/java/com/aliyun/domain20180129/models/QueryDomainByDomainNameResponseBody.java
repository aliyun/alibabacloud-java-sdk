// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class QueryDomainByDomainNameResponseBody extends TeaModel {
    /**
     * <p>The status of the privacy protection service for .cn domain names.</p>
     * 
     * <strong>example:</strong>
     * <p>UN_SUPPORT</p>
     */
    @NameInMap("CnnicPrivacyServiceStatus")
    public String cnnicPrivacyServiceStatus;

    @NameInMap("DnsList")
    public QueryDomainByDomainNameResponseBodyDnsList dnsList;

    /**
     * <p>The ID of the domain group. You can obtain the ID by calling the <a href="https://help.aliyun.com/document_detail/69362.html">QueryDomainGroupList</a> operation.</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("DomainGroupId")
    public Long domainGroupId;

    /**
     * <p>The name of the domain group.</p>
     * 
     * <strong>example:</strong>
     * <p>测试分组</p>
     */
    @NameInMap("DomainGroupName")
    public String domainGroupName;

    /**
     * <p>The domain name.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>Indicates whether privacy protection is enabled.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DomainNameProxyService")
    public Boolean domainNameProxyService;

    /**
     * <p>The status of the domain name review. Valid values:</p>
     * <ul>
     * <li><p><strong>NONAUDIT</strong>: Not reviewed.</p>
     * </li>
     * <li><p><strong>SUCCEED</strong>: Successful.</p>
     * </li>
     * <li><p><strong>FAILED</strong>: Failed.</p>
     * </li>
     * <li><p><strong>AUDITING</strong>: In review.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>SUCCEED</p>
     */
    @NameInMap("DomainNameVerificationStatus")
    public String domainNameVerificationStatus;

    /**
     * <p>The status of the domain name. Valid values:</p>
     * <ul>
     * <li><p><strong>1</strong>: Renewal required.</p>
     * </li>
     * <li><p><strong>2</strong>: Redemption required.</p>
     * </li>
     * <li><p><strong>3</strong>: Active.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("DomainStatus")
    public String domainStatus;

    /**
     * <p>The type of the domain name. Valid values:</p>
     * <ul>
     * <li><p>New gTLD</p>
     * </li>
     * <li><p>gTLD</p>
     * </li>
     * <li><p>ccTLD</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>gTLD</p>
     */
    @NameInMap("DomainType")
    public String domainType;

    /**
     * <p>The registrant\&quot;s email.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="mailto:username@example.com">username@example.com</a></p>
     */
    @NameInMap("Email")
    public String email;

    /**
     * <p>Indicates whether the domain name has a <code>clientHold</code> status due to email verification failure.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EmailVerificationClientHold")
    public Boolean emailVerificationClientHold;

    /**
     * <p>The email verification status. Valid values:</p>
     * <ul>
     * <li><p><strong>0</strong>: Not verified.</p>
     * </li>
     * <li><p><strong>1</strong>: Verified.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("EmailVerificationStatus")
    public Integer emailVerificationStatus;

    /**
     * <p>The number of days until the expiration date.</p>
     * 
     * <strong>example:</strong>
     * <p>356</p>
     */
    @NameInMap("ExpirationCurrDateDiff")
    public Integer expirationCurrDateDiff;

    /**
     * <p>The expiration date of the domain name.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-12-07 17:02:13</p>
     */
    @NameInMap("ExpirationDate")
    public String expirationDate;

    /**
     * <p>The timestamp of the expiration date.</p>
     * 
     * <strong>example:</strong>
     * <p>1625111915000</p>
     */
    @NameInMap("ExpirationDateLong")
    public Long expirationDateLong;

    /**
     * <p>The expiration status of the domain name. Valid values:</p>
     * <ul>
     * <li><p><strong>1</strong>: The domain name has not expired.</p>
     * </li>
     * <li><p><strong>2</strong>: The domain name has expired.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("ExpirationDateStatus")
    public String expirationDateStatus;

    /**
     * <p>The instance ID of the domain name.</p>
     * 
     * <strong>example:</strong>
     * <p>S20179H1BBI9****</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>Indicates whether the domain name is a premium domain.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Premium")
    public Boolean premium;

    /**
     * <p>The status of the privacy protection service.</p>
     * 
     * <strong>example:</strong>
     * <p>UN_SUPPORT</p>
     */
    @NameInMap("PrivacyServiceStatus")
    public String privacyServiceStatus;

    /**
     * <p>The real-name verification status of the domain name. Valid values:</p>
     * <ul>
     * <li><p><strong>NONAUDIT</strong>: Not verified.</p>
     * </li>
     * <li><p><strong>SUCCEED</strong>: Successful.</p>
     * </li>
     * <li><p><strong>FAILED</strong>: Failed.</p>
     * </li>
     * <li><p><strong>AUDITING</strong>: In review.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>NONAUDIT</p>
     */
    @NameInMap("RealNameStatus")
    public String realNameStatus;

    /**
     * <p>The name of the individual registrant or the contact person for an organization.</p>
     * 
     * <strong>example:</strong>
     * <p>Test litm</p>
     */
    @NameInMap("RegistrantName")
    public String registrantName;

    /**
     * <p>The name of the registrant organization.</p>
     * 
     * <strong>example:</strong>
     * <p>Test litm</p>
     */
    @NameInMap("RegistrantOrganization")
    public String registrantOrganization;

    /**
     * <p>The type of the registrant. Valid values:</p>
     * <ul>
     * <li><p><strong>1</strong>: Individual.</p>
     * </li>
     * <li><p><strong>2</strong>: Enterprise.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RegistrantType")
    public String registrantType;

    /**
     * <p>The status of registrant information updates. Valid values:</p>
     * <ul>
     * <li><p><strong>PENDING</strong>: The registrant information is being updated.</p>
     * </li>
     * <li><p><strong>NORMAL</strong>: No update is in progress.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>NORMAL</p>
     */
    @NameInMap("RegistrantUpdatingStatus")
    public String registrantUpdatingStatus;

    /**
     * <p>The registrar of the domain name.</p>
     */
    @NameInMap("Registrar")
    public String registrar;

    /**
     * <p>The registration date of the domain name.</p>
     * 
     * <strong>example:</strong>
     * <p>2017-12-07 17:02:13</p>
     */
    @NameInMap("RegistrationDate")
    public String registrationDate;

    /**
     * <p>The timestamp of the registration date.</p>
     * 
     * <strong>example:</strong>
     * <p>1584675448000</p>
     */
    @NameInMap("RegistrationDateLong")
    public Long registrationDateLong;

    /**
     * <p>The user-provided remark for the domain name.</p>
     * 
     * <strong>example:</strong>
     * <p>测试备注</p>
     */
    @NameInMap("Remark")
    public String remark;

    /**
     * <p>The unique request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>44101664-3E70-4F0E-89E5-CCB74BF*****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The ID of the resource group.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmw6bpc6n7zai</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The tags attached to the domain name.</p>
     */
    @NameInMap("Tag")
    public QueryDomainByDomainNameResponseBodyTag tag;

    /**
     * <p>The status of the domain transfer out. Valid values:</p>
     * <ul>
     * <li><p><strong>NORMAL</strong>: The domain name is not being transferred out.</p>
     * </li>
     * <li><p><strong>PENDING</strong>: The domain name is being transferred out from HiChina.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>NORMAL</p>
     */
    @NameInMap("TransferOutStatus")
    public String transferOutStatus;

    /**
     * <p>The status of the domain transfer lock. Valid values:</p>
     * <ul>
     * <li><p><strong>NONE_SETTING</strong>: Not set.</p>
     * </li>
     * <li><p><strong>OPEN</strong>: Enabled.</p>
     * </li>
     * <li><p><strong>CLOSE</strong>: Disabled.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>CLOSE</p>
     */
    @NameInMap("TransferProhibitionLock")
    public String transferProhibitionLock;

    /**
     * <p>The status of the domain name security lock. Valid values:</p>
     * <ul>
     * <li><p><strong>NONE_SETTING</strong>: Not set.</p>
     * </li>
     * <li><p><strong>OPEN</strong>: Enabled.</p>
     * </li>
     * <li><p><strong>CLOSE</strong>: Disabled.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>CLOSE</p>
     */
    @NameInMap("UpdateProhibitionLock")
    public String updateProhibitionLock;

    /**
     * <p>The ID of the Alibaba Cloud account.</p>
     * 
     * <strong>example:</strong>
     * <p>121000000****</p>
     */
    @NameInMap("UserId")
    public String userId;

    /**
     * <p>The name of the contact person in Chinese.</p>
     * 
     * <strong>example:</strong>
     * <p>王先生</p>
     */
    @NameInMap("ZhRegistrantName")
    public String zhRegistrantName;

    /**
     * <p>The name of the registrant in Chinese.</p>
     * 
     * <strong>example:</strong>
     * <p>王先生</p>
     */
    @NameInMap("ZhRegistrantOrganization")
    public String zhRegistrantOrganization;

    public static QueryDomainByDomainNameResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryDomainByDomainNameResponseBody self = new QueryDomainByDomainNameResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryDomainByDomainNameResponseBody setCnnicPrivacyServiceStatus(String cnnicPrivacyServiceStatus) {
        this.cnnicPrivacyServiceStatus = cnnicPrivacyServiceStatus;
        return this;
    }
    public String getCnnicPrivacyServiceStatus() {
        return this.cnnicPrivacyServiceStatus;
    }

    public QueryDomainByDomainNameResponseBody setDnsList(QueryDomainByDomainNameResponseBodyDnsList dnsList) {
        this.dnsList = dnsList;
        return this;
    }
    public QueryDomainByDomainNameResponseBodyDnsList getDnsList() {
        return this.dnsList;
    }

    public QueryDomainByDomainNameResponseBody setDomainGroupId(Long domainGroupId) {
        this.domainGroupId = domainGroupId;
        return this;
    }
    public Long getDomainGroupId() {
        return this.domainGroupId;
    }

    public QueryDomainByDomainNameResponseBody setDomainGroupName(String domainGroupName) {
        this.domainGroupName = domainGroupName;
        return this;
    }
    public String getDomainGroupName() {
        return this.domainGroupName;
    }

    public QueryDomainByDomainNameResponseBody setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public QueryDomainByDomainNameResponseBody setDomainNameProxyService(Boolean domainNameProxyService) {
        this.domainNameProxyService = domainNameProxyService;
        return this;
    }
    public Boolean getDomainNameProxyService() {
        return this.domainNameProxyService;
    }

    public QueryDomainByDomainNameResponseBody setDomainNameVerificationStatus(String domainNameVerificationStatus) {
        this.domainNameVerificationStatus = domainNameVerificationStatus;
        return this;
    }
    public String getDomainNameVerificationStatus() {
        return this.domainNameVerificationStatus;
    }

    public QueryDomainByDomainNameResponseBody setDomainStatus(String domainStatus) {
        this.domainStatus = domainStatus;
        return this;
    }
    public String getDomainStatus() {
        return this.domainStatus;
    }

    public QueryDomainByDomainNameResponseBody setDomainType(String domainType) {
        this.domainType = domainType;
        return this;
    }
    public String getDomainType() {
        return this.domainType;
    }

    public QueryDomainByDomainNameResponseBody setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public QueryDomainByDomainNameResponseBody setEmailVerificationClientHold(Boolean emailVerificationClientHold) {
        this.emailVerificationClientHold = emailVerificationClientHold;
        return this;
    }
    public Boolean getEmailVerificationClientHold() {
        return this.emailVerificationClientHold;
    }

    public QueryDomainByDomainNameResponseBody setEmailVerificationStatus(Integer emailVerificationStatus) {
        this.emailVerificationStatus = emailVerificationStatus;
        return this;
    }
    public Integer getEmailVerificationStatus() {
        return this.emailVerificationStatus;
    }

    public QueryDomainByDomainNameResponseBody setExpirationCurrDateDiff(Integer expirationCurrDateDiff) {
        this.expirationCurrDateDiff = expirationCurrDateDiff;
        return this;
    }
    public Integer getExpirationCurrDateDiff() {
        return this.expirationCurrDateDiff;
    }

    public QueryDomainByDomainNameResponseBody setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
        return this;
    }
    public String getExpirationDate() {
        return this.expirationDate;
    }

    public QueryDomainByDomainNameResponseBody setExpirationDateLong(Long expirationDateLong) {
        this.expirationDateLong = expirationDateLong;
        return this;
    }
    public Long getExpirationDateLong() {
        return this.expirationDateLong;
    }

    public QueryDomainByDomainNameResponseBody setExpirationDateStatus(String expirationDateStatus) {
        this.expirationDateStatus = expirationDateStatus;
        return this;
    }
    public String getExpirationDateStatus() {
        return this.expirationDateStatus;
    }

    public QueryDomainByDomainNameResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public QueryDomainByDomainNameResponseBody setPremium(Boolean premium) {
        this.premium = premium;
        return this;
    }
    public Boolean getPremium() {
        return this.premium;
    }

    public QueryDomainByDomainNameResponseBody setPrivacyServiceStatus(String privacyServiceStatus) {
        this.privacyServiceStatus = privacyServiceStatus;
        return this;
    }
    public String getPrivacyServiceStatus() {
        return this.privacyServiceStatus;
    }

    public QueryDomainByDomainNameResponseBody setRealNameStatus(String realNameStatus) {
        this.realNameStatus = realNameStatus;
        return this;
    }
    public String getRealNameStatus() {
        return this.realNameStatus;
    }

    public QueryDomainByDomainNameResponseBody setRegistrantName(String registrantName) {
        this.registrantName = registrantName;
        return this;
    }
    public String getRegistrantName() {
        return this.registrantName;
    }

    public QueryDomainByDomainNameResponseBody setRegistrantOrganization(String registrantOrganization) {
        this.registrantOrganization = registrantOrganization;
        return this;
    }
    public String getRegistrantOrganization() {
        return this.registrantOrganization;
    }

    public QueryDomainByDomainNameResponseBody setRegistrantType(String registrantType) {
        this.registrantType = registrantType;
        return this;
    }
    public String getRegistrantType() {
        return this.registrantType;
    }

    public QueryDomainByDomainNameResponseBody setRegistrantUpdatingStatus(String registrantUpdatingStatus) {
        this.registrantUpdatingStatus = registrantUpdatingStatus;
        return this;
    }
    public String getRegistrantUpdatingStatus() {
        return this.registrantUpdatingStatus;
    }

    public QueryDomainByDomainNameResponseBody setRegistrar(String registrar) {
        this.registrar = registrar;
        return this;
    }
    public String getRegistrar() {
        return this.registrar;
    }

    public QueryDomainByDomainNameResponseBody setRegistrationDate(String registrationDate) {
        this.registrationDate = registrationDate;
        return this;
    }
    public String getRegistrationDate() {
        return this.registrationDate;
    }

    public QueryDomainByDomainNameResponseBody setRegistrationDateLong(Long registrationDateLong) {
        this.registrationDateLong = registrationDateLong;
        return this;
    }
    public Long getRegistrationDateLong() {
        return this.registrationDateLong;
    }

    public QueryDomainByDomainNameResponseBody setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public QueryDomainByDomainNameResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryDomainByDomainNameResponseBody setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public QueryDomainByDomainNameResponseBody setTag(QueryDomainByDomainNameResponseBodyTag tag) {
        this.tag = tag;
        return this;
    }
    public QueryDomainByDomainNameResponseBodyTag getTag() {
        return this.tag;
    }

    public QueryDomainByDomainNameResponseBody setTransferOutStatus(String transferOutStatus) {
        this.transferOutStatus = transferOutStatus;
        return this;
    }
    public String getTransferOutStatus() {
        return this.transferOutStatus;
    }

    public QueryDomainByDomainNameResponseBody setTransferProhibitionLock(String transferProhibitionLock) {
        this.transferProhibitionLock = transferProhibitionLock;
        return this;
    }
    public String getTransferProhibitionLock() {
        return this.transferProhibitionLock;
    }

    public QueryDomainByDomainNameResponseBody setUpdateProhibitionLock(String updateProhibitionLock) {
        this.updateProhibitionLock = updateProhibitionLock;
        return this;
    }
    public String getUpdateProhibitionLock() {
        return this.updateProhibitionLock;
    }

    public QueryDomainByDomainNameResponseBody setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public QueryDomainByDomainNameResponseBody setZhRegistrantName(String zhRegistrantName) {
        this.zhRegistrantName = zhRegistrantName;
        return this;
    }
    public String getZhRegistrantName() {
        return this.zhRegistrantName;
    }

    public QueryDomainByDomainNameResponseBody setZhRegistrantOrganization(String zhRegistrantOrganization) {
        this.zhRegistrantOrganization = zhRegistrantOrganization;
        return this;
    }
    public String getZhRegistrantOrganization() {
        return this.zhRegistrantOrganization;
    }

    public static class QueryDomainByDomainNameResponseBodyDnsList extends TeaModel {
        @NameInMap("Dns")
        public java.util.List<String> dns;

        public static QueryDomainByDomainNameResponseBodyDnsList build(java.util.Map<String, ?> map) throws Exception {
            QueryDomainByDomainNameResponseBodyDnsList self = new QueryDomainByDomainNameResponseBodyDnsList();
            return TeaModel.build(map, self);
        }

        public QueryDomainByDomainNameResponseBodyDnsList setDns(java.util.List<String> dns) {
            this.dns = dns;
            return this;
        }
        public java.util.List<String> getDns() {
            return this.dns;
        }

    }

    public static class QueryDomainByDomainNameResponseBodyTagTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Vaue")
        public String vaue;

        public static QueryDomainByDomainNameResponseBodyTagTag build(java.util.Map<String, ?> map) throws Exception {
            QueryDomainByDomainNameResponseBodyTagTag self = new QueryDomainByDomainNameResponseBodyTagTag();
            return TeaModel.build(map, self);
        }

        public QueryDomainByDomainNameResponseBodyTagTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public QueryDomainByDomainNameResponseBodyTagTag setVaue(String vaue) {
            this.vaue = vaue;
            return this;
        }
        public String getVaue() {
            return this.vaue;
        }

    }

    public static class QueryDomainByDomainNameResponseBodyTag extends TeaModel {
        @NameInMap("Tag")
        public java.util.List<QueryDomainByDomainNameResponseBodyTagTag> tag;

        public static QueryDomainByDomainNameResponseBodyTag build(java.util.Map<String, ?> map) throws Exception {
            QueryDomainByDomainNameResponseBodyTag self = new QueryDomainByDomainNameResponseBodyTag();
            return TeaModel.build(map, self);
        }

        public QueryDomainByDomainNameResponseBodyTag setTag(java.util.List<QueryDomainByDomainNameResponseBodyTagTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<QueryDomainByDomainNameResponseBodyTagTag> getTag() {
            return this.tag;
        }

    }

}
