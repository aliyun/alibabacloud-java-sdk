// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class QueryAccountRealNameInfoResponseBody extends TeaModel {
    @NameInMap("ProfileInfo")
    public QueryAccountRealNameInfoResponseBodyProfileInfo profileInfo;

    @NameInMap("RequestId")
    public String requestId;

    public static QueryAccountRealNameInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        QueryAccountRealNameInfoResponseBody self = new QueryAccountRealNameInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public QueryAccountRealNameInfoResponseBody setProfileInfo(QueryAccountRealNameInfoResponseBodyProfileInfo profileInfo) {
        this.profileInfo = profileInfo;
        return this;
    }
    public QueryAccountRealNameInfoResponseBodyProfileInfo getProfileInfo() {
        return this.profileInfo;
    }

    public QueryAccountRealNameInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class QueryAccountRealNameInfoResponseBodyProfileInfo extends TeaModel {
        @NameInMap("AccountCertifyType")
        public String accountCertifyType;

        @NameInMap("AuthAlipay")
        public String authAlipay;

        @NameInMap("AuthBeiAnCid")
        public String authBeiAnCid;

        @NameInMap("AuthDomain")
        public String authDomain;

        @NameInMap("CertifiedFrom")
        public String certifiedFrom;

        @NameInMap("CertifiedTime")
        public String certifiedTime;

        @NameInMap("IsBankIDAuth")
        public String isBankIDAuth;

        @NameInMap("IsCertified")
        public String isCertified;

        @NameInMap("LicenseNumber")
        public String licenseNumber;

        @NameInMap("LicenseType")
        public String licenseType;

        @NameInMap("Name")
        public String name;

        @NameInMap("ProcessingEnterpriseCertify")
        public Boolean processingEnterpriseCertify;

        public static QueryAccountRealNameInfoResponseBodyProfileInfo build(java.util.Map<String, ?> map) throws Exception {
            QueryAccountRealNameInfoResponseBodyProfileInfo self = new QueryAccountRealNameInfoResponseBodyProfileInfo();
            return TeaModel.build(map, self);
        }

        public QueryAccountRealNameInfoResponseBodyProfileInfo setAccountCertifyType(String accountCertifyType) {
            this.accountCertifyType = accountCertifyType;
            return this;
        }
        public String getAccountCertifyType() {
            return this.accountCertifyType;
        }

        public QueryAccountRealNameInfoResponseBodyProfileInfo setAuthAlipay(String authAlipay) {
            this.authAlipay = authAlipay;
            return this;
        }
        public String getAuthAlipay() {
            return this.authAlipay;
        }

        public QueryAccountRealNameInfoResponseBodyProfileInfo setAuthBeiAnCid(String authBeiAnCid) {
            this.authBeiAnCid = authBeiAnCid;
            return this;
        }
        public String getAuthBeiAnCid() {
            return this.authBeiAnCid;
        }

        public QueryAccountRealNameInfoResponseBodyProfileInfo setAuthDomain(String authDomain) {
            this.authDomain = authDomain;
            return this;
        }
        public String getAuthDomain() {
            return this.authDomain;
        }

        public QueryAccountRealNameInfoResponseBodyProfileInfo setCertifiedFrom(String certifiedFrom) {
            this.certifiedFrom = certifiedFrom;
            return this;
        }
        public String getCertifiedFrom() {
            return this.certifiedFrom;
        }

        public QueryAccountRealNameInfoResponseBodyProfileInfo setCertifiedTime(String certifiedTime) {
            this.certifiedTime = certifiedTime;
            return this;
        }
        public String getCertifiedTime() {
            return this.certifiedTime;
        }

        public QueryAccountRealNameInfoResponseBodyProfileInfo setIsBankIDAuth(String isBankIDAuth) {
            this.isBankIDAuth = isBankIDAuth;
            return this;
        }
        public String getIsBankIDAuth() {
            return this.isBankIDAuth;
        }

        public QueryAccountRealNameInfoResponseBodyProfileInfo setIsCertified(String isCertified) {
            this.isCertified = isCertified;
            return this;
        }
        public String getIsCertified() {
            return this.isCertified;
        }

        public QueryAccountRealNameInfoResponseBodyProfileInfo setLicenseNumber(String licenseNumber) {
            this.licenseNumber = licenseNumber;
            return this;
        }
        public String getLicenseNumber() {
            return this.licenseNumber;
        }

        public QueryAccountRealNameInfoResponseBodyProfileInfo setLicenseType(String licenseType) {
            this.licenseType = licenseType;
            return this;
        }
        public String getLicenseType() {
            return this.licenseType;
        }

        public QueryAccountRealNameInfoResponseBodyProfileInfo setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public QueryAccountRealNameInfoResponseBodyProfileInfo setProcessingEnterpriseCertify(Boolean processingEnterpriseCertify) {
            this.processingEnterpriseCertify = processingEnterpriseCertify;
            return this;
        }
        public Boolean getProcessingEnterpriseCertify() {
            return this.processingEnterpriseCertify;
        }

    }

}
