// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class QueryDomainByDomainNameResponseBody extends TeaModel {
    /**
     * <p>The Domain Name System (DNS) servers of the domain name.</p>
     */
    @NameInMap("DnsList")
    public QueryDomainByDomainNameResponseBodyDnsList dnsList;

    /**
     * <p>The ID of the domain name group. You can call the <a href="https://help.aliyun.com/document_detail/69362.html">QueryDomainGroupList</a> operation to query the ID of the domain name group.</p>
     * 
     * <strong>example:</strong>
     * <p>123456</p>
     */
    @NameInMap("DomainGroupId")
    public Long domainGroupId;

    /**
     * <p>The name of the domain name group.</p>
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
     * <p>Indicates whether privacy protection is enabled for the domain name.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DomainNameProxyService")
    public Boolean domainNameProxyService;

    /**
     * <p>The status of name auditing for the domain name. Valid values:</p>
     * <ul>
     * <li><strong>NONAUDIT</strong>: The name auditing for the domain name is not performed.</li>
     * <li><strong>SUCCEED</strong>: The name auditing for the domain name is successful.</li>
     * <li><strong>FAILED</strong>: The name auditing for the domain name fails.</li>
     * <li><strong>AUDITING</strong>: The name auditing for the domain name is in progress.</li>
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
     * <li>1: The domain name needs to be renewed.</li>
     * <li>2: The domain name needs to be redeemed.</li>
     * <li>3: The domain name is normal.</li>
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
     * <li>New gTLD</li>
     * <li>gTLD</li>
     * <li>ccTLD</li>
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
     * <p>Indicates whether the domain name is in the ClientHold state.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("EmailVerificationClientHold")
    public Boolean emailVerificationClientHold;

    /**
     * <p>Indicates whether the email address passes verification. Valid values:</p>
     * <ul>
     * <li><strong>0</strong>: The email address fails the verification.</li>
     * <li><strong>1</strong>: The email address passes the verification.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("EmailVerificationStatus")
    public Integer emailVerificationStatus;

    /**
     * <p>The number of days from the expiration date of the domain name to the current date.</p>
     * 
     * <strong>example:</strong>
     * <p>356</p>
     */
    @NameInMap("ExpirationCurrDateDiff")
    public Integer expirationCurrDateDiff;

    /**
     * <p>The expiration date.</p>
     * 
     * <strong>example:</strong>
     * <p>2019-12-07 17:02:13</p>
     */
    @NameInMap("ExpirationDate")
    public String expirationDate;

    /**
     * <p>The timestamp generated when the domain name expired.</p>
     * 
     * <strong>example:</strong>
     * <p>1625111915000</p>
     */
    @NameInMap("ExpirationDateLong")
    public Long expirationDateLong;

    /**
     * <p>Indicates whether the domain name expires. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: The domain name does not expire.</li>
     * <li><strong>2</strong>: The domain name expires.</li>
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
     * <p>Indicates whether the domain name is a premium domain name.</p>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("Premium")
    public Boolean premium;

    /**
     * <p>The status of real-name verification for the domain name. Valid values:</p>
     * <ul>
     * <li><strong>NONAUDIT</strong>: The real-name verification is not performed.</li>
     * <li><strong>SUCCEED</strong>: The real-name verification is successful.</li>
     * <li><strong>FAILED</strong>: The real-name verification fails.</li>
     * <li><strong>AUDITING</strong>: The real-name verification is in progress.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>NONAUDIT</p>
     */
    @NameInMap("RealNameStatus")
    public String realNameStatus;

    /**
     * <p>The name of the contact.</p>
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
     * <p>The type of contact who registers the domain name. Valid values:</p>
     * <ul>
     * <li><strong>1</strong>: individual.</li>
     * <li><strong>2</strong>: enterprise.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("RegistrantType")
    public String registrantType;

    /**
     * <p>The status of the information about the domain name registrant. Valid values:</p>
     * <ul>
     * <li><strong>PENDING</strong>: The information about the domain name registrant is being modified.</li>
     * <li><strong>NORMAL</strong>: normal.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>NORMAL</p>
     */
    @NameInMap("RegistrantUpdatingStatus")
    public String registrantUpdatingStatus;

    /**
     * <p>The time when the domain name was registered.</p>
     * 
     * <strong>example:</strong>
     * <p>2017-12-07 17:02:13</p>
     */
    @NameInMap("RegistrationDate")
    public String registrationDate;

    /**
     * <p>The timestamp generated when the domain name was registered.</p>
     * 
     * <strong>example:</strong>
     * <p>1584675448000</p>
     */
    @NameInMap("RegistrationDateLong")
    public Long registrationDateLong;

    /**
     * <p>The remarks on the domain name.</p>
     */
    @NameInMap("Remark")
    public String remark;

    /**
     * <p>The request ID.</p>
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
     * <p>The tags.</p>
     */
    @NameInMap("Tag")
    public QueryDomainByDomainNameResponseBodyTag tag;

    /**
     * <p>The transfer status of the domain name. Valid values:</p>
     * <ul>
     * <li><strong>NORMAL</strong>: The domain name is normal.</li>
     * <li><strong>PENDING</strong>: The domain name is being transferred out from Alibaba Cloud.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>NORMAL</p>
     */
    @NameInMap("TransferOutStatus")
    public String transferOutStatus;

    /**
     * <p>The status of the transfer lock for the domain name. Valid values:</p>
     * <ul>
     * <li><strong>NONE_SETTING</strong>: No transfer lock is configured.</li>
     * <li><strong>OPEN</strong>: The transfer lock is enabled.</li>
     * <li><strong>CLOSE</strong>: The transfer lock is disabled.</li>
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
     * <li><strong>NONE_SETTING</strong>: No security lock is configured.</li>
     * <li><strong>OPEN</strong>: The security lock is enabled.</li>
     * <li><strong>CLOSE</strong>: The security lock is disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>CLOSE</p>
     */
    @NameInMap("UpdateProhibitionLock")
    public String updateProhibitionLock;

    /**
     * <p>The user ID.</p>
     * 
     * <strong>example:</strong>
     * <p>121000000****</p>
     */
    @NameInMap("UserId")
    public String userId;

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

    public static QueryDomainByDomainNameResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryDomainByDomainNameResponseBody self = new QueryDomainByDomainNameResponseBody();
        return TeaModel.build(map, self);
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
        /**
         * <p>The tag key.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         */
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
