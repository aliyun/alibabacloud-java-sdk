// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20180129.models;

import com.aliyun.tea.*;

public class QueryDomainByDomainNameResponseBody extends TeaModel {
    @NameInMap("Email")
    public String email;

    @NameInMap("RegistrationDate")
    public String registrationDate;

    @NameInMap("RegistrationDateLong")
    public Long registrationDateLong;

    @NameInMap("RealNameStatus")
    public String realNameStatus;

    @NameInMap("Premium")
    public Boolean premium;

    @NameInMap("DomainNameVerificationStatus")
    public String domainNameVerificationStatus;

    @NameInMap("ExpirationDateLong")
    public Long expirationDateLong;

    @NameInMap("DnsList")
    public QueryDomainByDomainNameResponseBodyDnsList dnsList;

    @NameInMap("TransferOutStatus")
    public String transferOutStatus;

    @NameInMap("ZhRegistrantOrganization")
    public String zhRegistrantOrganization;

    @NameInMap("EmailVerificationClientHold")
    public Boolean emailVerificationClientHold;

    @NameInMap("EmailVerificationStatus")
    public Integer emailVerificationStatus;

    @NameInMap("RegistrantOrganization")
    public String registrantOrganization;

    @NameInMap("TransferProhibitionLock")
    public String transferProhibitionLock;

    @NameInMap("DomainNameProxyService")
    public Boolean domainNameProxyService;

    @NameInMap("RegistrantType")
    public String registrantType;

    @NameInMap("RegistrantUpdatingStatus")
    public String registrantUpdatingStatus;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("ZhRegistrantName")
    public String zhRegistrantName;

    @NameInMap("ExpirationDate")
    public String expirationDate;

    @NameInMap("RegistrantName")
    public String registrantName;

    @NameInMap("UserId")
    public String userId;

    @NameInMap("UpdateProhibitionLock")
    public String updateProhibitionLock;

    public static QueryDomainByDomainNameResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryDomainByDomainNameResponseBody self = new QueryDomainByDomainNameResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryDomainByDomainNameResponseBody setEmail(String email) {
        this.email = email;
        return this;
    }
    public String getEmail() {
        return this.email;
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

    public QueryDomainByDomainNameResponseBody setRealNameStatus(String realNameStatus) {
        this.realNameStatus = realNameStatus;
        return this;
    }
    public String getRealNameStatus() {
        return this.realNameStatus;
    }

    public QueryDomainByDomainNameResponseBody setPremium(Boolean premium) {
        this.premium = premium;
        return this;
    }
    public Boolean getPremium() {
        return this.premium;
    }

    public QueryDomainByDomainNameResponseBody setDomainNameVerificationStatus(String domainNameVerificationStatus) {
        this.domainNameVerificationStatus = domainNameVerificationStatus;
        return this;
    }
    public String getDomainNameVerificationStatus() {
        return this.domainNameVerificationStatus;
    }

    public QueryDomainByDomainNameResponseBody setExpirationDateLong(Long expirationDateLong) {
        this.expirationDateLong = expirationDateLong;
        return this;
    }
    public Long getExpirationDateLong() {
        return this.expirationDateLong;
    }

    public QueryDomainByDomainNameResponseBody setDnsList(QueryDomainByDomainNameResponseBodyDnsList dnsList) {
        this.dnsList = dnsList;
        return this;
    }
    public QueryDomainByDomainNameResponseBodyDnsList getDnsList() {
        return this.dnsList;
    }

    public QueryDomainByDomainNameResponseBody setTransferOutStatus(String transferOutStatus) {
        this.transferOutStatus = transferOutStatus;
        return this;
    }
    public String getTransferOutStatus() {
        return this.transferOutStatus;
    }

    public QueryDomainByDomainNameResponseBody setZhRegistrantOrganization(String zhRegistrantOrganization) {
        this.zhRegistrantOrganization = zhRegistrantOrganization;
        return this;
    }
    public String getZhRegistrantOrganization() {
        return this.zhRegistrantOrganization;
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

    public QueryDomainByDomainNameResponseBody setRegistrantOrganization(String registrantOrganization) {
        this.registrantOrganization = registrantOrganization;
        return this;
    }
    public String getRegistrantOrganization() {
        return this.registrantOrganization;
    }

    public QueryDomainByDomainNameResponseBody setTransferProhibitionLock(String transferProhibitionLock) {
        this.transferProhibitionLock = transferProhibitionLock;
        return this;
    }
    public String getTransferProhibitionLock() {
        return this.transferProhibitionLock;
    }

    public QueryDomainByDomainNameResponseBody setDomainNameProxyService(Boolean domainNameProxyService) {
        this.domainNameProxyService = domainNameProxyService;
        return this;
    }
    public Boolean getDomainNameProxyService() {
        return this.domainNameProxyService;
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

    public QueryDomainByDomainNameResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public QueryDomainByDomainNameResponseBody setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public QueryDomainByDomainNameResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public QueryDomainByDomainNameResponseBody setZhRegistrantName(String zhRegistrantName) {
        this.zhRegistrantName = zhRegistrantName;
        return this;
    }
    public String getZhRegistrantName() {
        return this.zhRegistrantName;
    }

    public QueryDomainByDomainNameResponseBody setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
        return this;
    }
    public String getExpirationDate() {
        return this.expirationDate;
    }

    public QueryDomainByDomainNameResponseBody setRegistrantName(String registrantName) {
        this.registrantName = registrantName;
        return this;
    }
    public String getRegistrantName() {
        return this.registrantName;
    }

    public QueryDomainByDomainNameResponseBody setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public QueryDomainByDomainNameResponseBody setUpdateProhibitionLock(String updateProhibitionLock) {
        this.updateProhibitionLock = updateProhibitionLock;
        return this;
    }
    public String getUpdateProhibitionLock() {
        return this.updateProhibitionLock;
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

}
