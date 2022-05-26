// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.account_crm20160606.models;

import com.aliyun.tea.*;

public class LoadRealNameInfoByPkResponseBody extends TeaModel {
    @NameInMap("Code")
    public String code;

    @NameInMap("Data")
    public LoadRealNameInfoByPkResponseBodyData data;

    @NameInMap("Msg")
    public String msg;

    @NameInMap("RequestId")
    public String requestId;

    public static LoadRealNameInfoByPkResponseBody build(java.util.Map<String, ?> map) throws Exception {
        LoadRealNameInfoByPkResponseBody self = new LoadRealNameInfoByPkResponseBody();
        return TeaModel.build(map, self);
    }

    public LoadRealNameInfoByPkResponseBody setCode(String code) {
        this.code = code;
        return this;
    }
    public String getCode() {
        return this.code;
    }

    public LoadRealNameInfoByPkResponseBody setData(LoadRealNameInfoByPkResponseBodyData data) {
        this.data = data;
        return this;
    }
    public LoadRealNameInfoByPkResponseBodyData getData() {
        return this.data;
    }

    public LoadRealNameInfoByPkResponseBody setMsg(String msg) {
        this.msg = msg;
        return this;
    }
    public String getMsg() {
        return this.msg;
    }

    public LoadRealNameInfoByPkResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class LoadRealNameInfoByPkResponseBodyData extends TeaModel {
        @NameInMap("AccountCertifyType")
        public String accountCertifyType;

        @NameInMap("AuthAlipay")
        public String authAlipay;

        @NameInMap("AuthAlipayDomain")
        public String authAlipayDomain;

        @NameInMap("AuthAlipayLoginId")
        public String authAlipayLoginId;

        @NameInMap("AuthBeiAnCid")
        public String authBeiAnCid;

        @NameInMap("AuthDomain")
        public String authDomain;

        @NameInMap("CertifiedFrom")
        public String certifiedFrom;

        @NameInMap("CertifiedTime")
        public String certifiedTime;

        @NameInMap("CertifyStatus")
        public Integer certifyStatus;

        @NameInMap("CicCertifyFrom")
        public Integer cicCertifyFrom;

        @NameInMap("CicCertifyProduct")
        public Long cicCertifyProduct;

        @NameInMap("IsBankIDAuth")
        public Boolean isBankIDAuth;

        @NameInMap("IsCertified")
        public Boolean isCertified;

        @NameInMap("LicenseNumber")
        public String licenseNumber;

        @NameInMap("LicenseType")
        public String licenseType;

        @NameInMap("Name")
        public String name;

        @NameInMap("NewUnityRealNameAccount")
        public String newUnityRealNameAccount;

        @NameInMap("ProcessingEnterpriseCertify")
        public Boolean processingEnterpriseCertify;

        public static LoadRealNameInfoByPkResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            LoadRealNameInfoByPkResponseBodyData self = new LoadRealNameInfoByPkResponseBodyData();
            return TeaModel.build(map, self);
        }

        public LoadRealNameInfoByPkResponseBodyData setAccountCertifyType(String accountCertifyType) {
            this.accountCertifyType = accountCertifyType;
            return this;
        }
        public String getAccountCertifyType() {
            return this.accountCertifyType;
        }

        public LoadRealNameInfoByPkResponseBodyData setAuthAlipay(String authAlipay) {
            this.authAlipay = authAlipay;
            return this;
        }
        public String getAuthAlipay() {
            return this.authAlipay;
        }

        public LoadRealNameInfoByPkResponseBodyData setAuthAlipayDomain(String authAlipayDomain) {
            this.authAlipayDomain = authAlipayDomain;
            return this;
        }
        public String getAuthAlipayDomain() {
            return this.authAlipayDomain;
        }

        public LoadRealNameInfoByPkResponseBodyData setAuthAlipayLoginId(String authAlipayLoginId) {
            this.authAlipayLoginId = authAlipayLoginId;
            return this;
        }
        public String getAuthAlipayLoginId() {
            return this.authAlipayLoginId;
        }

        public LoadRealNameInfoByPkResponseBodyData setAuthBeiAnCid(String authBeiAnCid) {
            this.authBeiAnCid = authBeiAnCid;
            return this;
        }
        public String getAuthBeiAnCid() {
            return this.authBeiAnCid;
        }

        public LoadRealNameInfoByPkResponseBodyData setAuthDomain(String authDomain) {
            this.authDomain = authDomain;
            return this;
        }
        public String getAuthDomain() {
            return this.authDomain;
        }

        public LoadRealNameInfoByPkResponseBodyData setCertifiedFrom(String certifiedFrom) {
            this.certifiedFrom = certifiedFrom;
            return this;
        }
        public String getCertifiedFrom() {
            return this.certifiedFrom;
        }

        public LoadRealNameInfoByPkResponseBodyData setCertifiedTime(String certifiedTime) {
            this.certifiedTime = certifiedTime;
            return this;
        }
        public String getCertifiedTime() {
            return this.certifiedTime;
        }

        public LoadRealNameInfoByPkResponseBodyData setCertifyStatus(Integer certifyStatus) {
            this.certifyStatus = certifyStatus;
            return this;
        }
        public Integer getCertifyStatus() {
            return this.certifyStatus;
        }

        public LoadRealNameInfoByPkResponseBodyData setCicCertifyFrom(Integer cicCertifyFrom) {
            this.cicCertifyFrom = cicCertifyFrom;
            return this;
        }
        public Integer getCicCertifyFrom() {
            return this.cicCertifyFrom;
        }

        public LoadRealNameInfoByPkResponseBodyData setCicCertifyProduct(Long cicCertifyProduct) {
            this.cicCertifyProduct = cicCertifyProduct;
            return this;
        }
        public Long getCicCertifyProduct() {
            return this.cicCertifyProduct;
        }

        public LoadRealNameInfoByPkResponseBodyData setIsBankIDAuth(Boolean isBankIDAuth) {
            this.isBankIDAuth = isBankIDAuth;
            return this;
        }
        public Boolean getIsBankIDAuth() {
            return this.isBankIDAuth;
        }

        public LoadRealNameInfoByPkResponseBodyData setIsCertified(Boolean isCertified) {
            this.isCertified = isCertified;
            return this;
        }
        public Boolean getIsCertified() {
            return this.isCertified;
        }

        public LoadRealNameInfoByPkResponseBodyData setLicenseNumber(String licenseNumber) {
            this.licenseNumber = licenseNumber;
            return this;
        }
        public String getLicenseNumber() {
            return this.licenseNumber;
        }

        public LoadRealNameInfoByPkResponseBodyData setLicenseType(String licenseType) {
            this.licenseType = licenseType;
            return this;
        }
        public String getLicenseType() {
            return this.licenseType;
        }

        public LoadRealNameInfoByPkResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public LoadRealNameInfoByPkResponseBodyData setNewUnityRealNameAccount(String newUnityRealNameAccount) {
            this.newUnityRealNameAccount = newUnityRealNameAccount;
            return this;
        }
        public String getNewUnityRealNameAccount() {
            return this.newUnityRealNameAccount;
        }

        public LoadRealNameInfoByPkResponseBodyData setProcessingEnterpriseCertify(Boolean processingEnterpriseCertify) {
            this.processingEnterpriseCertify = processingEnterpriseCertify;
            return this;
        }
        public Boolean getProcessingEnterpriseCertify() {
            return this.processingEnterpriseCertify;
        }

    }

}
