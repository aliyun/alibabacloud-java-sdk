// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class QueryDomainByInstanceIdResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>UN_SUPPORT</p>
     */
    @NameInMap("CnnicPrivacyServiceStatus")
    public String cnnicPrivacyServiceStatus;

    @NameInMap("DnsList")
    public QueryDomainByInstanceIdResponseBodyDnsList dnsList;

    /**
     * <p>The ID of the domain name group. You can call the <a href="https://help.aliyun.com/document_detail/69362.html">QueryDomainGroupList</a> operation to obtain the ID of the domain name group.</p>
     * 
     * <strong>example:</strong>
     * <p>1234</p>
     */
    @NameInMap("DomainGroupId")
    public Long domainGroupId;

    /**
     * <p>The name of the domain name group.</p>
     * 
     * <strong>example:</strong>
     * <p>测试分组</p>
     */
    @NameInMap("DomainGroupName")
    public String domainGroupName;

    @NameInMap("DomainLifecycleStatus")
    public String domainLifecycleStatus;

    /**
     * <p>The domain name.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("DomainName")
    public String domainName;

    /**
     * <p>Indicates whether the domain name privacy protection service is enabled.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DomainNameProxyService")
    public Boolean domainNameProxyService;

    /**
     * <p>The status of the domain name review. Valid values:</p>
     * <ul>
     * <li><p><strong>NONAUDIT</strong>: The domain name is not verified.</p>
     * </li>
     * <li><p><strong>SUCCEED</strong>: The domain name is verified.</p>
     * </li>
     * <li><p><strong>FAILED</strong>: The domain name fails to be verified.</p>
     * </li>
     * <li><p><strong>AUDITING</strong>: The domain name is being verified.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>NONAUDIT</p>
     */
    @NameInMap("DomainNameVerificationStatus")
    public String domainNameVerificationStatus;

    /**
     * <p>The status of the domain name. Valid values:</p>
     * <ul>
     * <li><p>1: The domain name needs to be renewed.</p>
     * </li>
     * <li><p>2: The domain name needs to be redeemed.</p>
     * </li>
     * <li><p>3: The domain name is normal.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("DomainStatus")
    public String domainStatus;

    /**
     * <p>The type of the domain name. Valid values:</p>
     * <ul>
     * <li><p>New gTLD.</p>
     * </li>
     * <li><p>gTLD.</p>
     * </li>
     * <li><p>ccTLD.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>gTLD</p>
     */
    @NameInMap("DomainType")
    public String domainType;

    /**
     * <p>The email address of the domain name registrant.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="mailto:username@example.com">username@example.com</a></p>
     */
    @NameInMap("Email")
    public String email;

    /**
     * <p>Indicates whether the DNS resolution for the domain name is suspended. Valid values:</p>
     * <ul>
     * <li><p><strong>false</strong>: The DNS resolution for the domain name is not suspended.</p>
     * </li>
     * <li><p><strong>true</strong>: The DNS resolution for the domain name is suspended.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EmailVerificationClientHold")
    public Boolean emailVerificationClientHold;

    /**
     * <p>Indicates whether the email address of the domain name registrant is verified. Valid values:</p>
     * <ul>
     * <li><p><strong>0</strong>: The email address is not verified.</p>
     * </li>
     * <li><p><strong>1</strong>: The email address is verified.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("EmailVerificationStatus")
    public Integer emailVerificationStatus;

    /**
     * <p>The number of days from the expiration date to the current date.</p>
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
     * <p>The expiration timestamp of the domain name.</p>
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
     * <p>S20179H1BBI9test</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>Indicates whether the domain name is a premium domain name. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: a premium domain name.</p>
     * </li>
     * <li><p><strong>false</strong>: not a premium domain name.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Premium")
    public Boolean premium;

    /**
     * <strong>example:</strong>
     * <p>UN_SUPPORT</p>
     */
    @NameInMap("PrivacyServiceStatus")
    public String privacyServiceStatus;

    /**
     * <p>The real-name verification status of the domain name. Valid values:</p>
     * <ul>
     * <li><p><strong>NONAUDIT</strong>: The real-name verification is not performed.</p>
     * </li>
     * <li><p><strong>SUCCEED</strong>: The real-name verification is successful.</p>
     * </li>
     * <li><p><strong>FAILED</strong>: The real-name verification fails.</p>
     * </li>
     * <li><p><strong>AUDITING</strong>: The real-name verification is in progress.</p>
     * </li>
     * </ul>
     * <blockquote>
     * <p>The real-name verification status of a domain name is a composite status of domain name review and real-name verification. The real-name verification of a domain name is successful only when both the domain name review and real-name verification are successful.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>NONAUDIT</p>
     */
    @NameInMap("RealNameStatus")
    public String realNameStatus;

    /**
     * <p>The name of the contact person.</p>
     * 
     * <strong>example:</strong>
     * <p>Test litm</p>
     */
    @NameInMap("RegistrantName")
    public String registrantName;

    /**
     * <p>The registrant of the domain name.</p>
     * 
     * <strong>example:</strong>
     * <p>Test litm</p>
     */
    @NameInMap("RegistrantOrganization")
    public String registrantOrganization;

    /**
     * <p>The type of the domain name registrant. Valid values:</p>
     * <ul>
     * <li><p><strong>1</strong>: an individual.</p>
     * </li>
     * <li><p><strong>2</strong>: an enterprise.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RegistrantType")
    public String registrantType;

    /**
     * <p>The status of the domain name registrant. Valid values:</p>
     * <ul>
     * <li><p><strong>PENDING</strong>: The information about the domain name registrant is being modified.</p>
     * </li>
     * <li><p><strong>NORMAL</strong>: The information about the domain name registrant is not being modified.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>NORMAL</p>
     */
    @NameInMap("RegistrantUpdatingStatus")
    public String registrantUpdatingStatus;

    /**
     * <p>The registration date of the domain name.</p>
     * 
     * <strong>example:</strong>
     * <p>2017-12-07 17:02:13</p>
     */
    @NameInMap("RegistrationDate")
    public String registrationDate;

    /**
     * <p>The registration timestamp of the domain name.</p>
     * 
     * <strong>example:</strong>
     * <p>1625111915000</p>
     */
    @NameInMap("RegistrationDateLong")
    public Long registrationDateLong;

    /**
     * <p>The remarks of the domain name.</p>
     * 
     * <strong>example:</strong>
     * <p>测试备注</p>
     */
    @NameInMap("Remark")
    public String remark;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>23C9B3C4-9E2C-4405-A88D-BD33E459D140</p>
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

    @NameInMap("Tag")
    public QueryDomainByInstanceIdResponseBodyTag tag;

    /**
     * <p>The status of the domain name transfer. Valid values:</p>
     * <ul>
     * <li><p><strong>NORMAL</strong>: The domain name is not being transferred out of Alibaba Cloud.</p>
     * </li>
     * <li><p><strong>PENDING</strong>: The domain name is being transferred out of Alibaba Cloud.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>NORMAL</p>
     */
    @NameInMap("TransferOutStatus")
    public String transferOutStatus;

    /**
     * <p>The status of the domain name transfer lock. Valid values:</p>
     * <ul>
     * <li><p><strong>NONE_SETTING</strong>: The domain name transfer lock is not enabled.</p>
     * </li>
     * <li><p><strong>OPEN</strong>: The domain name transfer lock is enabled.</p>
     * </li>
     * <li><p><strong>CLOSE</strong>: The domain name transfer lock is disabled.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>CLOSE</p>
     */
    @NameInMap("TransferProhibitionLock")
    public String transferProhibitionLock;

    /**
     * <p>The status of the security lock for the domain name. Valid values:</p>
     * <ul>
     * <li><p><strong>NONE_SETTING</strong>: The security lock is not enabled.</p>
     * </li>
     * <li><p><strong>OPEN</strong>: The security lock is enabled.</p>
     * </li>
     * <li><p><strong>CLOSE</strong>: The security lock is disabled.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>CLOSE</p>
     */
    @NameInMap("UpdateProhibitionLock")
    public String updateProhibitionLock;

    /**
     * <p>The user ID (UID) of the Alibaba Cloud account.</p>
     * 
     * <strong>example:</strong>
     * <p>121000000****</p>
     */
    @NameInMap("UserId")
    public String userId;

    /**
     * <p>The contact person in Chinese.</p>
     * <blockquote>
     * <p>This parameter is applicable only to the China site.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>李四</p>
     */
    @NameInMap("ZhRegistrantName")
    public String zhRegistrantName;

    /**
     * <p>The registrant of the domain name in Chinese.</p>
     * <blockquote>
     * <p>This parameter is applicable only to the China site.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>李四</p>
     */
    @NameInMap("ZhRegistrantOrganization")
    public String zhRegistrantOrganization;

    public static QueryDomainByInstanceIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryDomainByInstanceIdResponseBody self = new QueryDomainByInstanceIdResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryDomainByInstanceIdResponseBody setCnnicPrivacyServiceStatus(String cnnicPrivacyServiceStatus) {
        this.cnnicPrivacyServiceStatus = cnnicPrivacyServiceStatus;
        return this;
    }
    public String getCnnicPrivacyServiceStatus() {
        return this.cnnicPrivacyServiceStatus;
    }

    public QueryDomainByInstanceIdResponseBody setDnsList(QueryDomainByInstanceIdResponseBodyDnsList dnsList) {
        this.dnsList = dnsList;
        return this;
    }
    public QueryDomainByInstanceIdResponseBodyDnsList getDnsList() {
        return this.dnsList;
    }

    public QueryDomainByInstanceIdResponseBody setDomainGroupId(Long domainGroupId) {
        this.domainGroupId = domainGroupId;
        return this;
    }
    public Long getDomainGroupId() {
        return this.domainGroupId;
    }

    public QueryDomainByInstanceIdResponseBody setDomainGroupName(String domainGroupName) {
        this.domainGroupName = domainGroupName;
        return this;
    }
    public String getDomainGroupName() {
        return this.domainGroupName;
    }

    public QueryDomainByInstanceIdResponseBody setDomainLifecycleStatus(String domainLifecycleStatus) {
        this.domainLifecycleStatus = domainLifecycleStatus;
        return this;
    }
    public String getDomainLifecycleStatus() {
        return this.domainLifecycleStatus;
    }

    public QueryDomainByInstanceIdResponseBody setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public QueryDomainByInstanceIdResponseBody setDomainNameProxyService(Boolean domainNameProxyService) {
        this.domainNameProxyService = domainNameProxyService;
        return this;
    }
    public Boolean getDomainNameProxyService() {
        return this.domainNameProxyService;
    }

    public QueryDomainByInstanceIdResponseBody setDomainNameVerificationStatus(String domainNameVerificationStatus) {
        this.domainNameVerificationStatus = domainNameVerificationStatus;
        return this;
    }
    public String getDomainNameVerificationStatus() {
        return this.domainNameVerificationStatus;
    }

    public QueryDomainByInstanceIdResponseBody setDomainStatus(String domainStatus) {
        this.domainStatus = domainStatus;
        return this;
    }
    public String getDomainStatus() {
        return this.domainStatus;
    }

    public QueryDomainByInstanceIdResponseBody setDomainType(String domainType) {
        this.domainType = domainType;
        return this;
    }
    public String getDomainType() {
        return this.domainType;
    }

    public QueryDomainByInstanceIdResponseBody setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
    }

    public QueryDomainByInstanceIdResponseBody setEmailVerificationClientHold(Boolean emailVerificationClientHold) {
        this.emailVerificationClientHold = emailVerificationClientHold;
        return this;
    }
    public Boolean getEmailVerificationClientHold() {
        return this.emailVerificationClientHold;
    }

    public QueryDomainByInstanceIdResponseBody setEmailVerificationStatus(Integer emailVerificationStatus) {
        this.emailVerificationStatus = emailVerificationStatus;
        return this;
    }
    public Integer getEmailVerificationStatus() {
        return this.emailVerificationStatus;
    }

    public QueryDomainByInstanceIdResponseBody setExpirationCurrDateDiff(Integer expirationCurrDateDiff) {
        this.expirationCurrDateDiff = expirationCurrDateDiff;
        return this;
    }
    public Integer getExpirationCurrDateDiff() {
        return this.expirationCurrDateDiff;
    }

    public QueryDomainByInstanceIdResponseBody setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
        return this;
    }
    public String getExpirationDate() {
        return this.expirationDate;
    }

    public QueryDomainByInstanceIdResponseBody setExpirationDateLong(Long expirationDateLong) {
        this.expirationDateLong = expirationDateLong;
        return this;
    }
    public Long getExpirationDateLong() {
        return this.expirationDateLong;
    }

    public QueryDomainByInstanceIdResponseBody setExpirationDateStatus(String expirationDateStatus) {
        this.expirationDateStatus = expirationDateStatus;
        return this;
    }
    public String getExpirationDateStatus() {
        return this.expirationDateStatus;
    }

    public QueryDomainByInstanceIdResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public QueryDomainByInstanceIdResponseBody setPremium(Boolean premium) {
        this.premium = premium;
        return this;
    }
    public Boolean getPremium() {
        return this.premium;
    }

    public QueryDomainByInstanceIdResponseBody setPrivacyServiceStatus(String privacyServiceStatus) {
        this.privacyServiceStatus = privacyServiceStatus;
        return this;
    }
    public String getPrivacyServiceStatus() {
        return this.privacyServiceStatus;
    }

    public QueryDomainByInstanceIdResponseBody setRealNameStatus(String realNameStatus) {
        this.realNameStatus = realNameStatus;
        return this;
    }
    public String getRealNameStatus() {
        return this.realNameStatus;
    }

    public QueryDomainByInstanceIdResponseBody setRegistrantName(String registrantName) {
        this.registrantName = registrantName;
        return this;
    }
    public String getRegistrantName() {
        return this.registrantName;
    }

    public QueryDomainByInstanceIdResponseBody setRegistrantOrganization(String registrantOrganization) {
        this.registrantOrganization = registrantOrganization;
        return this;
    }
    public String getRegistrantOrganization() {
        return this.registrantOrganization;
    }

    public QueryDomainByInstanceIdResponseBody setRegistrantType(String registrantType) {
        this.registrantType = registrantType;
        return this;
    }
    public String getRegistrantType() {
        return this.registrantType;
    }

    public QueryDomainByInstanceIdResponseBody setRegistrantUpdatingStatus(String registrantUpdatingStatus) {
        this.registrantUpdatingStatus = registrantUpdatingStatus;
        return this;
    }
    public String getRegistrantUpdatingStatus() {
        return this.registrantUpdatingStatus;
    }

    public QueryDomainByInstanceIdResponseBody setRegistrationDate(String registrationDate) {
        this.registrationDate = registrationDate;
        return this;
    }
    public String getRegistrationDate() {
        return this.registrationDate;
    }

    public QueryDomainByInstanceIdResponseBody setRegistrationDateLong(Long registrationDateLong) {
        this.registrationDateLong = registrationDateLong;
        return this;
    }
    public Long getRegistrationDateLong() {
        return this.registrationDateLong;
    }

    public QueryDomainByInstanceIdResponseBody setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public QueryDomainByInstanceIdResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryDomainByInstanceIdResponseBody setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public QueryDomainByInstanceIdResponseBody setTag(QueryDomainByInstanceIdResponseBodyTag tag) {
        this.tag = tag;
        return this;
    }
    public QueryDomainByInstanceIdResponseBodyTag getTag() {
        return this.tag;
    }

    public QueryDomainByInstanceIdResponseBody setTransferOutStatus(String transferOutStatus) {
        this.transferOutStatus = transferOutStatus;
        return this;
    }
    public String getTransferOutStatus() {
        return this.transferOutStatus;
    }

    public QueryDomainByInstanceIdResponseBody setTransferProhibitionLock(String transferProhibitionLock) {
        this.transferProhibitionLock = transferProhibitionLock;
        return this;
    }
    public String getTransferProhibitionLock() {
        return this.transferProhibitionLock;
    }

    public QueryDomainByInstanceIdResponseBody setUpdateProhibitionLock(String updateProhibitionLock) {
        this.updateProhibitionLock = updateProhibitionLock;
        return this;
    }
    public String getUpdateProhibitionLock() {
        return this.updateProhibitionLock;
    }

    public QueryDomainByInstanceIdResponseBody setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public QueryDomainByInstanceIdResponseBody setZhRegistrantName(String zhRegistrantName) {
        this.zhRegistrantName = zhRegistrantName;
        return this;
    }
    public String getZhRegistrantName() {
        return this.zhRegistrantName;
    }

    public QueryDomainByInstanceIdResponseBody setZhRegistrantOrganization(String zhRegistrantOrganization) {
        this.zhRegistrantOrganization = zhRegistrantOrganization;
        return this;
    }
    public String getZhRegistrantOrganization() {
        return this.zhRegistrantOrganization;
    }

    public static class QueryDomainByInstanceIdResponseBodyDnsList extends TeaModel {
        @NameInMap("Dns")
        public java.util.List<String> dns;

        public static QueryDomainByInstanceIdResponseBodyDnsList build(java.util.Map<String, ?> map) throws Exception {
            QueryDomainByInstanceIdResponseBodyDnsList self = new QueryDomainByInstanceIdResponseBodyDnsList();
            return TeaModel.build(map, self);
        }

        public QueryDomainByInstanceIdResponseBodyDnsList setDns(java.util.List<String> dns) {
            this.dns = dns;
            return this;
        }
        public java.util.List<String> getDns() {
            return this.dns;
        }

    }

    public static class QueryDomainByInstanceIdResponseBodyTagTag extends TeaModel {
        @NameInMap("Key")
        public String key;

        @NameInMap("Value")
        public String value;

        public static QueryDomainByInstanceIdResponseBodyTagTag build(java.util.Map<String, ?> map) throws Exception {
            QueryDomainByInstanceIdResponseBodyTagTag self = new QueryDomainByInstanceIdResponseBodyTagTag();
            return TeaModel.build(map, self);
        }

        public QueryDomainByInstanceIdResponseBodyTagTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public QueryDomainByInstanceIdResponseBodyTagTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class QueryDomainByInstanceIdResponseBodyTag extends TeaModel {
        @NameInMap("Tag")
        public java.util.List<QueryDomainByInstanceIdResponseBodyTagTag> tag;

        public static QueryDomainByInstanceIdResponseBodyTag build(java.util.Map<String, ?> map) throws Exception {
            QueryDomainByInstanceIdResponseBodyTag self = new QueryDomainByInstanceIdResponseBodyTag();
            return TeaModel.build(map, self);
        }

        public QueryDomainByInstanceIdResponseBodyTag setTag(java.util.List<QueryDomainByInstanceIdResponseBodyTagTag> tag) {
            this.tag = tag;
            return this;
        }
        public java.util.List<QueryDomainByInstanceIdResponseBodyTagTag> getTag() {
            return this.tag;
        }

    }

}
