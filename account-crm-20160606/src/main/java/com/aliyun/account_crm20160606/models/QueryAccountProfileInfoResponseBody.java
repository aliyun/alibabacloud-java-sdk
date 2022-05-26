// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class QueryAccountProfileInfoResponseBody extends TeaModel {
    @NameInMap("ProfileInfo")
    public QueryAccountProfileInfoResponseBodyProfileInfo profileInfo;

    @NameInMap("RequestId")
    public String requestId;

    public static QueryAccountProfileInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryAccountProfileInfoResponseBody self = new QueryAccountProfileInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryAccountProfileInfoResponseBody setProfileInfo(QueryAccountProfileInfoResponseBodyProfileInfo profileInfo) {
        this.profileInfo = profileInfo;
        return this;
    }
    public QueryAccountProfileInfoResponseBodyProfileInfo getProfileInfo() {
        return this.profileInfo;
    }

    public QueryAccountProfileInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class QueryAccountProfileInfoResponseBodyProfileInfoCity extends TeaModel {
        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        public static QueryAccountProfileInfoResponseBodyProfileInfoCity build(java.util.Map<String, ?> map) throws Exception {
            QueryAccountProfileInfoResponseBodyProfileInfoCity self = new QueryAccountProfileInfoResponseBodyProfileInfoCity();
            return TeaModel.build(map, self);
        }

        public QueryAccountProfileInfoResponseBodyProfileInfoCity setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryAccountProfileInfoResponseBodyProfileInfoCity setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class QueryAccountProfileInfoResponseBodyProfileInfoProvince extends TeaModel {
        @NameInMap("Id")
        public String id;

        @NameInMap("Name")
        public String name;

        public static QueryAccountProfileInfoResponseBodyProfileInfoProvince build(java.util.Map<String, ?> map) throws Exception {
            QueryAccountProfileInfoResponseBodyProfileInfoProvince self = new QueryAccountProfileInfoResponseBodyProfileInfoProvince();
            return TeaModel.build(map, self);
        }

        public QueryAccountProfileInfoResponseBodyProfileInfoProvince setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public QueryAccountProfileInfoResponseBodyProfileInfoProvince setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

    }

    public static class QueryAccountProfileInfoResponseBodyProfileInfo extends TeaModel {
        @NameInMap("AccountAttr")
        public String accountAttr;

        @NameInMap("AccountCertifyType")
        public String accountCertifyType;

        @NameInMap("ActiveNotSetMobile")
        public String activeNotSetMobile;

        @NameInMap("Address")
        public String address;

        @NameInMap("Address2")
        public String address2;

        @NameInMap("Address3")
        public String address3;

        @NameInMap("Address4")
        public String address4;

        @NameInMap("Address5")
        public String address5;

        @NameInMap("Address6")
        public String address6;

        @NameInMap("AlipayAccount")
        public String alipayAccount;

        @NameInMap("AlipayUid")
        public String alipayUid;

        @NameInMap("AliyunID")
        public String aliyunID;

        @NameInMap("AliyunPK")
        public String aliyunPK;

        @NameInMap("AuthAlipay")
        public String authAlipay;

        @NameInMap("AuthDomainUserId")
        public String authDomainUserId;

        @NameInMap("B2bhid")
        public String b2bhid;

        @NameInMap("BankId")
        public String bankId;

        @NameInMap("BankName")
        public String bankName;

        @NameInMap("BeiAnAuthCId")
        public String beiAnAuthCId;

        @NameInMap("BeiAnIcpNumber")
        public String beiAnIcpNumber;

        @NameInMap("BeiAnMobile")
        public String beiAnMobile;

        @NameInMap("BindAlipayNo")
        public String bindAlipayNo;

        @NameInMap("CertType")
        public String certType;

        @NameInMap("CertifiedFrom")
        public String certifiedFrom;

        @NameInMap("CertifiedTime")
        public String certifiedTime;

        @NameInMap("City")
        public QueryAccountProfileInfoResponseBodyProfileInfoCity city;

        @NameInMap("ContactMethod")
        public String contactMethod;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("Eid")
        public String eid;

        @NameInMap("Email")
        public String email;

        @NameInMap("Fax")
        public String fax;

        @NameInMap("FirstName")
        public String firstName;

        @NameInMap("Fyl")
        public String fyl;

        @NameInMap("HavanaId")
        public String havanaId;

        @NameInMap("Head")
        public String head;

        @NameInMap("IDNumber")
        public String IDNumber;

        @NameInMap("IsBankIDAuth")
        public String isBankIDAuth;

        @NameInMap("IsCertified")
        public String isCertified;

        @NameInMap("LastName")
        public String lastName;

        @NameInMap("Mobile")
        public String mobile;

        @NameInMap("NationalityCode")
        public String nationalityCode;

        @NameInMap("NickName")
        public String nickName;

        @NameInMap("Own")
        public String own;

        @NameInMap("Phone")
        public String phone;

        @NameInMap("PostCode")
        public String postCode;

        @NameInMap("PreferredLanguage")
        public String preferredLanguage;

        @NameInMap("ProcessingEnterpriseCertify")
        public Boolean processingEnterpriseCertify;

        @NameInMap("Province")
        public QueryAccountProfileInfoResponseBodyProfileInfoProvince province;

        @NameInMap("RegisterIP")
        public String registerIP;

        @NameInMap("SecurityMobile")
        public String securityMobile;

        @NameInMap("SecurityQuestionExists")
        public Boolean securityQuestionExists;

        @NameInMap("Src")
        public String src;

        @NameInMap("TaobaoAccount")
        public String taobaoAccount;

        @NameInMap("TaobaoNickFromHavana")
        public String taobaoNickFromHavana;

        @NameInMap("Tbhid")
        public String tbhid;

        @NameInMap("TrueName")
        public String trueName;

        @NameInMap("UpdateTime")
        public String updateTime;

        @NameInMap("YahooEmail")
        public String yahooEmail;

        public static QueryAccountProfileInfoResponseBodyProfileInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryAccountProfileInfoResponseBodyProfileInfo self = new QueryAccountProfileInfoResponseBodyProfileInfo();
            return TeaModel.build(map, self);
        }

        public QueryAccountProfileInfoResponseBodyProfileInfo setAccountAttr(String accountAttr) {
            this.accountAttr = accountAttr;
            return this;
        }
        public String getAccountAttr() {
            return this.accountAttr;
        }

        public QueryAccountProfileInfoResponseBodyProfileInfo setAccountCertifyType(String accountCertifyType) {
            this.accountCertifyType = accountCertifyType;
            return this;
        }
        public String getAccountCertifyType() {
            return this.accountCertifyType;
        }

        public QueryAccountProfileInfoResponseBodyProfileInfo setActiveNotSetMobile(String activeNotSetMobile) {
            this.activeNotSetMobile = activeNotSetMobile;
            return this;
        }
        public String getActiveNotSetMobile() {
            return this.activeNotSetMobile;
        }

        public QueryAccountProfileInfoResponseBodyProfileInfo setAddress(String address) {
            this.address = address;
            return this;
        }
        public String getAddress() {
            return this.address;
        }

        public QueryAccountProfileInfoResponseBodyProfileInfo setAddress2(String address2) {
            this.address2 = address2;
            return this;
        }
        public String getAddress2() {
            return this.address2;
        }

        public QueryAccountProfileInfoResponseBodyProfileInfo setAddress3(String address3) {
            this.address3 = address3;
            return this;
        }
        public String getAddress3() {
            return this.address3;
        }

        public QueryAccountProfileInfoResponseBodyProfileInfo setAddress4(String address4) {
            this.address4 = address4;
            return this;
        }
        public String getAddress4() {
            return this.address4;
        }

        public QueryAccountProfileInfoResponseBodyProfileInfo setAddress5(String address5) {
            this.address5 = address5;
            return this;
        }
        public String getAddress5() {
            return this.address5;
        }

        public QueryAccountProfileInfoResponseBodyProfileInfo setAddress6(String address6) {
            this.address6 = address6;
            return this;
        }
        public String getAddress6() {
            return this.address6;
        }

        public QueryAccountProfileInfoResponseBodyProfileInfo setAlipayAccount(String alipayAccount) {
            this.alipayAccount = alipayAccount;
            return this;
        }
        public String getAlipayAccount() {
            return this.alipayAccount;
        }

        public QueryAccountProfileInfoResponseBodyProfileInfo setAlipayUid(String alipayUid) {
            this.alipayUid = alipayUid;
            return this;
        }
        public String getAlipayUid() {
            return this.alipayUid;
        }

        public QueryAccountProfileInfoResponseBodyProfileInfo setAliyunID(String aliyunID) {
            this.aliyunID = aliyunID;
            return this;
        }
        public String getAliyunID() {
            return this.aliyunID;
        }

        public QueryAccountProfileInfoResponseBodyProfileInfo setAliyunPK(String aliyunPK) {
            this.aliyunPK = aliyunPK;
            return this;
        }
        public String getAliyunPK() {
            return this.aliyunPK;
        }

        public QueryAccountProfileInfoResponseBodyProfileInfo setAuthAlipay(String authAlipay) {
            this.authAlipay = authAlipay;
            return this;
        }
        public String getAuthAlipay() {
            return this.authAlipay;
        }

        public QueryAccountProfileInfoResponseBodyProfileInfo setAuthDomainUserId(String authDomainUserId) {
            this.authDomainUserId = authDomainUserId;
            return this;
        }
        public String getAuthDomainUserId() {
            return this.authDomainUserId;
        }

        public QueryAccountProfileInfoResponseBodyProfileInfo setB2bhid(String b2bhid) {
            this.b2bhid = b2bhid;
            return this;
        }
        public String getB2bhid() {
            return this.b2bhid;
        }

        public QueryAccountProfileInfoResponseBodyProfileInfo setBankId(String bankId) {
            this.bankId = bankId;
            return this;
        }
        public String getBankId() {
            return this.bankId;
        }

        public QueryAccountProfileInfoResponseBodyProfileInfo setBankName(String bankName) {
            this.bankName = bankName;
            return this;
        }
        public String getBankName() {
            return this.bankName;
        }

        public QueryAccountProfileInfoResponseBodyProfileInfo setBeiAnAuthCId(String beiAnAuthCId) {
            this.beiAnAuthCId = beiAnAuthCId;
            return this;
        }
        public String getBeiAnAuthCId() {
            return this.beiAnAuthCId;
        }

        public QueryAccountProfileInfoResponseBodyProfileInfo setBeiAnIcpNumber(String beiAnIcpNumber) {
            this.beiAnIcpNumber = beiAnIcpNumber;
            return this;
        }
        public String getBeiAnIcpNumber() {
            return this.beiAnIcpNumber;
        }

        public QueryAccountProfileInfoResponseBodyProfileInfo setBeiAnMobile(String beiAnMobile) {
            this.beiAnMobile = beiAnMobile;
            return this;
        }
        public String getBeiAnMobile() {
            return this.beiAnMobile;
        }

        public QueryAccountProfileInfoResponseBodyProfileInfo setBindAlipayNo(String bindAlipayNo) {
            this.bindAlipayNo = bindAlipayNo;
            return this;
        }
        public String getBindAlipayNo() {
            return this.bindAlipayNo;
        }

        public QueryAccountProfileInfoResponseBodyProfileInfo setCertType(String certType) {
            this.certType = certType;
            return this;
        }
        public String getCertType() {
            return this.certType;
        }

        public QueryAccountProfileInfoResponseBodyProfileInfo setCertifiedFrom(String certifiedFrom) {
            this.certifiedFrom = certifiedFrom;
            return this;
        }
        public String getCertifiedFrom() {
            return this.certifiedFrom;
        }

        public QueryAccountProfileInfoResponseBodyProfileInfo setCertifiedTime(String certifiedTime) {
            this.certifiedTime = certifiedTime;
            return this;
        }
        public String getCertifiedTime() {
            return this.certifiedTime;
        }

        public QueryAccountProfileInfoResponseBodyProfileInfo setCity(QueryAccountProfileInfoResponseBodyProfileInfoCity city) {
            this.city = city;
            return this;
        }
        public QueryAccountProfileInfoResponseBodyProfileInfoCity getCity() {
            return this.city;
        }

        public QueryAccountProfileInfoResponseBodyProfileInfo setContactMethod(String contactMethod) {
            this.contactMethod = contactMethod;
            return this;
        }
        public String getContactMethod() {
            return this.contactMethod;
        }

        public QueryAccountProfileInfoResponseBodyProfileInfo setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public QueryAccountProfileInfoResponseBodyProfileInfo setEid(String eid) {
            this.eid = eid;
            return this;
        }
        public String getEid() {
            return this.eid;
        }

        public QueryAccountProfileInfoResponseBodyProfileInfo setEmail(String email) {
            this.email = email;
            return this;
        }
        public String getEmail() {
            return this.email;
        }

        public QueryAccountProfileInfoResponseBodyProfileInfo setFax(String fax) {
            this.fax = fax;
            return this;
        }
        public String getFax() {
            return this.fax;
        }

        public QueryAccountProfileInfoResponseBodyProfileInfo setFirstName(String firstName) {
            this.firstName = firstName;
            return this;
        }
        public String getFirstName() {
            return this.firstName;
        }

        public QueryAccountProfileInfoResponseBodyProfileInfo setFyl(String fyl) {
            this.fyl = fyl;
            return this;
        }
        public String getFyl() {
            return this.fyl;
        }

        public QueryAccountProfileInfoResponseBodyProfileInfo setHavanaId(String havanaId) {
            this.havanaId = havanaId;
            return this;
        }
        public String getHavanaId() {
            return this.havanaId;
        }

        public QueryAccountProfileInfoResponseBodyProfileInfo setHead(String head) {
            this.head = head;
            return this;
        }
        public String getHead() {
            return this.head;
        }

        public QueryAccountProfileInfoResponseBodyProfileInfo setIDNumber(String IDNumber) {
            this.IDNumber = IDNumber;
            return this;
        }
        public String getIDNumber() {
            return this.IDNumber;
        }

        public QueryAccountProfileInfoResponseBodyProfileInfo setIsBankIDAuth(String isBankIDAuth) {
            this.isBankIDAuth = isBankIDAuth;
            return this;
        }
        public String getIsBankIDAuth() {
            return this.isBankIDAuth;
        }

        public QueryAccountProfileInfoResponseBodyProfileInfo setIsCertified(String isCertified) {
            this.isCertified = isCertified;
            return this;
        }
        public String getIsCertified() {
            return this.isCertified;
        }

        public QueryAccountProfileInfoResponseBodyProfileInfo setLastName(String lastName) {
            this.lastName = lastName;
            return this;
        }
        public String getLastName() {
            return this.lastName;
        }

        public QueryAccountProfileInfoResponseBodyProfileInfo setMobile(String mobile) {
            this.mobile = mobile;
            return this;
        }
        public String getMobile() {
            return this.mobile;
        }

        public QueryAccountProfileInfoResponseBodyProfileInfo setNationalityCode(String nationalityCode) {
            this.nationalityCode = nationalityCode;
            return this;
        }
        public String getNationalityCode() {
            return this.nationalityCode;
        }

        public QueryAccountProfileInfoResponseBodyProfileInfo setNickName(String nickName) {
            this.nickName = nickName;
            return this;
        }
        public String getNickName() {
            return this.nickName;
        }

        public QueryAccountProfileInfoResponseBodyProfileInfo setOwn(String own) {
            this.own = own;
            return this;
        }
        public String getOwn() {
            return this.own;
        }

        public QueryAccountProfileInfoResponseBodyProfileInfo setPhone(String phone) {
            this.phone = phone;
            return this;
        }
        public String getPhone() {
            return this.phone;
        }

        public QueryAccountProfileInfoResponseBodyProfileInfo setPostCode(String postCode) {
            this.postCode = postCode;
            return this;
        }
        public String getPostCode() {
            return this.postCode;
        }

        public QueryAccountProfileInfoResponseBodyProfileInfo setPreferredLanguage(String preferredLanguage) {
            this.preferredLanguage = preferredLanguage;
            return this;
        }
        public String getPreferredLanguage() {
            return this.preferredLanguage;
        }

        public QueryAccountProfileInfoResponseBodyProfileInfo setProcessingEnterpriseCertify(Boolean processingEnterpriseCertify) {
            this.processingEnterpriseCertify = processingEnterpriseCertify;
            return this;
        }
        public Boolean getProcessingEnterpriseCertify() {
            return this.processingEnterpriseCertify;
        }

        public QueryAccountProfileInfoResponseBodyProfileInfo setProvince(QueryAccountProfileInfoResponseBodyProfileInfoProvince province) {
            this.province = province;
            return this;
        }
        public QueryAccountProfileInfoResponseBodyProfileInfoProvince getProvince() {
            return this.province;
        }

        public QueryAccountProfileInfoResponseBodyProfileInfo setRegisterIP(String registerIP) {
            this.registerIP = registerIP;
            return this;
        }
        public String getRegisterIP() {
            return this.registerIP;
        }

        public QueryAccountProfileInfoResponseBodyProfileInfo setSecurityMobile(String securityMobile) {
            this.securityMobile = securityMobile;
            return this;
        }
        public String getSecurityMobile() {
            return this.securityMobile;
        }

        public QueryAccountProfileInfoResponseBodyProfileInfo setSecurityQuestionExists(Boolean securityQuestionExists) {
            this.securityQuestionExists = securityQuestionExists;
            return this;
        }
        public Boolean getSecurityQuestionExists() {
            return this.securityQuestionExists;
        }

        public QueryAccountProfileInfoResponseBodyProfileInfo setSrc(String src) {
            this.src = src;
            return this;
        }
        public String getSrc() {
            return this.src;
        }

        public QueryAccountProfileInfoResponseBodyProfileInfo setTaobaoAccount(String taobaoAccount) {
            this.taobaoAccount = taobaoAccount;
            return this;
        }
        public String getTaobaoAccount() {
            return this.taobaoAccount;
        }

        public QueryAccountProfileInfoResponseBodyProfileInfo setTaobaoNickFromHavana(String taobaoNickFromHavana) {
            this.taobaoNickFromHavana = taobaoNickFromHavana;
            return this;
        }
        public String getTaobaoNickFromHavana() {
            return this.taobaoNickFromHavana;
        }

        public QueryAccountProfileInfoResponseBodyProfileInfo setTbhid(String tbhid) {
            this.tbhid = tbhid;
            return this;
        }
        public String getTbhid() {
            return this.tbhid;
        }

        public QueryAccountProfileInfoResponseBodyProfileInfo setTrueName(String trueName) {
            this.trueName = trueName;
            return this;
        }
        public String getTrueName() {
            return this.trueName;
        }

        public QueryAccountProfileInfoResponseBodyProfileInfo setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

        public QueryAccountProfileInfoResponseBodyProfileInfo setYahooEmail(String yahooEmail) {
            this.yahooEmail = yahooEmail;
            return this;
        }
        public String getYahooEmail() {
            return this.yahooEmail;
        }

    }

}
