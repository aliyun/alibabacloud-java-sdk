// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class QueryDomainByDomainNameResponseBody extends TeaModel {
    @NameInMap("DnsList")
    public QueryDomainByDomainNameResponseBodyDnsList dnsList;

    @NameInMap("DomainGroupId")
    public Long domainGroupId;

    @NameInMap("DomainGroupName")
    public String domainGroupName;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("DomainNameProxyService")
    public Boolean domainNameProxyService;

    @NameInMap("DomainNameVerificationStatus")
    public String domainNameVerificationStatus;

    @NameInMap("DomainStatus")
    public String domainStatus;

    @NameInMap("DomainType")
    public String domainType;

    @NameInMap("Email")
    public String email;

    @NameInMap("EmailVerificationClientHold")
    public Boolean emailVerificationClientHold;

    @NameInMap("EmailVerificationStatus")
    public Integer emailVerificationStatus;

    @NameInMap("ExpirationCurrDateDiff")
    public Integer expirationCurrDateDiff;

    @NameInMap("ExpirationDate")
    public String expirationDate;

    @NameInMap("ExpirationDateLong")
    public Long expirationDateLong;

    @NameInMap("ExpirationDateStatus")
    public String expirationDateStatus;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("Premium")
    public Boolean premium;

    @NameInMap("RealNameStatus")
    public String realNameStatus;

    @NameInMap("RegistrantName")
    public String registrantName;

    @NameInMap("RegistrantOrganization")
    public String registrantOrganization;

    @NameInMap("RegistrantType")
    public String registrantType;

    @NameInMap("RegistrantUpdatingStatus")
    public String registrantUpdatingStatus;

    @NameInMap("RegistrationDate")
    public String registrationDate;

    @NameInMap("RegistrationDateLong")
    public Long registrationDateLong;

    @NameInMap("Remark")
    public String remark;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("Tag")
    public QueryDomainByDomainNameResponseBodyTag tag;

    @NameInMap("TransferOutStatus")
    public String transferOutStatus;

    @NameInMap("TransferProhibitionLock")
    public String transferProhibitionLock;

    @NameInMap("UpdateProhibitionLock")
    public String updateProhibitionLock;

    @NameInMap("UserId")
    public String userId;

    @NameInMap("ZhRegistrantName")
    public String zhRegistrantName;

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
