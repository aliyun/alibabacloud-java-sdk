// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.domain20160511.models;

import com.aliyun.tea.*;

public class QueryDomainBySaleIdResponseBody extends TeaModel {
    @NameInMap("ChineseContactPerson")
    public String chineseContactPerson;

    @NameInMap("ChineseHolder")
    public String chineseHolder;

    @NameInMap("CreationDate")
    public String creationDate;

    @NameInMap("DnsList")
    public QueryDomainBySaleIdResponseBodyDnsList dnsList;

    @NameInMap("DomainName")
    public String domainName;

    @NameInMap("DomainRegType")
    public String domainRegType;

    @NameInMap("EmailVerificationClientHold")
    public Boolean emailVerificationClientHold;

    @NameInMap("EmailVerificationStatus")
    public Integer emailVerificationStatus;

    @NameInMap("EnglishContactPerson")
    public String englishContactPerson;

    @NameInMap("EnglishHolder")
    public String englishHolder;

    @NameInMap("ExpirationDate")
    public String expirationDate;

    @NameInMap("HolderEmail")
    public String holderEmail;

    @NameInMap("Premium")
    public Boolean premium;

    @NameInMap("Remark")
    public String remark;

    @NameInMap("SafetyLock")
    public String safetyLock;

    @NameInMap("SaleId")
    public String saleId;

    @NameInMap("TransferLock")
    public String transferLock;

    @NameInMap("TransferOutStatus")
    public String transferOutStatus;

    @NameInMap("UserId")
    public String userId;

    @NameInMap("WhoisProtected")
    public Boolean whoisProtected;

    public static QueryDomainBySaleIdResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryDomainBySaleIdResponseBody self = new QueryDomainBySaleIdResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryDomainBySaleIdResponseBody setChineseContactPerson(String chineseContactPerson) {
        this.chineseContactPerson = chineseContactPerson;
        return this;
    }
    public String getChineseContactPerson() {
        return this.chineseContactPerson;
    }

    public QueryDomainBySaleIdResponseBody setChineseHolder(String chineseHolder) {
        this.chineseHolder = chineseHolder;
        return this;
    }
    public String getChineseHolder() {
        return this.chineseHolder;
    }

    public QueryDomainBySaleIdResponseBody setCreationDate(String creationDate) {
        this.creationDate = creationDate;
        return this;
    }
    public String getCreationDate() {
        return this.creationDate;
    }

    public QueryDomainBySaleIdResponseBody setDnsList(QueryDomainBySaleIdResponseBodyDnsList dnsList) {
        this.dnsList = dnsList;
        return this;
    }
    public QueryDomainBySaleIdResponseBodyDnsList getDnsList() {
        return this.dnsList;
    }

    public QueryDomainBySaleIdResponseBody setDomainName(String domainName) {
        this.domainName = domainName;
        return this;
    }
    public String getDomainName() {
        return this.domainName;
    }

    public QueryDomainBySaleIdResponseBody setDomainRegType(String domainRegType) {
        this.domainRegType = domainRegType;
        return this;
    }
    public String getDomainRegType() {
        return this.domainRegType;
    }

    public QueryDomainBySaleIdResponseBody setEmailVerificationClientHold(Boolean emailVerificationClientHold) {
        this.emailVerificationClientHold = emailVerificationClientHold;
        return this;
    }
    public Boolean getEmailVerificationClientHold() {
        return this.emailVerificationClientHold;
    }

    public QueryDomainBySaleIdResponseBody setEmailVerificationStatus(Integer emailVerificationStatus) {
        this.emailVerificationStatus = emailVerificationStatus;
        return this;
    }
    public Integer getEmailVerificationStatus() {
        return this.emailVerificationStatus;
    }

    public QueryDomainBySaleIdResponseBody setEnglishContactPerson(String englishContactPerson) {
        this.englishContactPerson = englishContactPerson;
        return this;
    }
    public String getEnglishContactPerson() {
        return this.englishContactPerson;
    }

    public QueryDomainBySaleIdResponseBody setEnglishHolder(String englishHolder) {
        this.englishHolder = englishHolder;
        return this;
    }
    public String getEnglishHolder() {
        return this.englishHolder;
    }

    public QueryDomainBySaleIdResponseBody setExpirationDate(String expirationDate) {
        this.expirationDate = expirationDate;
        return this;
    }
    public String getExpirationDate() {
        return this.expirationDate;
    }

    public QueryDomainBySaleIdResponseBody setHolderEmail(String holderEmail) {
        this.holderEmail = holderEmail;
        return this;
    }
    public String getHolderEmail() {
        return this.holderEmail;
    }

    public QueryDomainBySaleIdResponseBody setPremium(Boolean premium) {
        this.premium = premium;
        return this;
    }
    public Boolean getPremium() {
        return this.premium;
    }

    public QueryDomainBySaleIdResponseBody setRemark(String remark) {
        this.remark = remark;
        return this;
    }
    public String getRemark() {
        return this.remark;
    }

    public QueryDomainBySaleIdResponseBody setSafetyLock(String safetyLock) {
        this.safetyLock = safetyLock;
        return this;
    }
    public String getSafetyLock() {
        return this.safetyLock;
    }

    public QueryDomainBySaleIdResponseBody setSaleId(String saleId) {
        this.saleId = saleId;
        return this;
    }
    public String getSaleId() {
        return this.saleId;
    }

    public QueryDomainBySaleIdResponseBody setTransferLock(String transferLock) {
        this.transferLock = transferLock;
        return this;
    }
    public String getTransferLock() {
        return this.transferLock;
    }

    public QueryDomainBySaleIdResponseBody setTransferOutStatus(String transferOutStatus) {
        this.transferOutStatus = transferOutStatus;
        return this;
    }
    public String getTransferOutStatus() {
        return this.transferOutStatus;
    }

    public QueryDomainBySaleIdResponseBody setUserId(String userId) {
        this.userId = userId;
        return this;
    }
    public String getUserId() {
        return this.userId;
    }

    public QueryDomainBySaleIdResponseBody setWhoisProtected(Boolean whoisProtected) {
        this.whoisProtected = whoisProtected;
        return this;
    }
    public Boolean getWhoisProtected() {
        return this.whoisProtected;
    }

    public static class QueryDomainBySaleIdResponseBodyDnsList extends TeaModel {
        @NameInMap("Dns")
        public java.util.List<String> dns;

        public static QueryDomainBySaleIdResponseBodyDnsList build(java.util.Map<String, ?> map) throws Exception {
            QueryDomainBySaleIdResponseBodyDnsList self = new QueryDomainBySaleIdResponseBodyDnsList();
            return TeaModel.build(map, self);
        }

        public QueryDomainBySaleIdResponseBodyDnsList setDns(java.util.List<String> dns) {
            this.dns = dns;
            return this;
        }
        public java.util.List<String> getDns() {
            return this.dns;
        }

    }

}
