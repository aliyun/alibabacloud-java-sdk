// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveDomainCertificateInfoResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("CertInfos")
    @Validation(required = true)
    public DescribeLiveDomainCertificateInfoResponseCertInfos certInfos;

    public static DescribeLiveDomainCertificateInfoResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveDomainCertificateInfoResponse self = new DescribeLiveDomainCertificateInfoResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLiveDomainCertificateInfoResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLiveDomainCertificateInfoResponse setCertInfos(DescribeLiveDomainCertificateInfoResponseCertInfos certInfos) {
        this.certInfos = certInfos;
        return this;
    }
    public DescribeLiveDomainCertificateInfoResponseCertInfos getCertInfos() {
        return this.certInfos;
    }

    public static class DescribeLiveDomainCertificateInfoResponseCertInfosCertInfo extends TeaModel {
        @NameInMap("DomainName")
        @Validation(required = true)
        public String domainName;

        @NameInMap("CertName")
        @Validation(required = true)
        public String certName;

        @NameInMap("CertDomainName")
        @Validation(required = true)
        public String certDomainName;

        @NameInMap("CertExpireTime")
        @Validation(required = true)
        public String certExpireTime;

        @NameInMap("CertLife")
        @Validation(required = true)
        public String certLife;

        @NameInMap("CertOrg")
        @Validation(required = true)
        public String certOrg;

        @NameInMap("CertType")
        @Validation(required = true)
        public String certType;

        @NameInMap("SSLProtocol")
        @Validation(required = true)
        public String SSLProtocol;

        @NameInMap("Status")
        @Validation(required = true)
        public String status;

        @NameInMap("SSLPub")
        @Validation(required = true)
        public String SSLPub;

        public static DescribeLiveDomainCertificateInfoResponseCertInfosCertInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveDomainCertificateInfoResponseCertInfosCertInfo self = new DescribeLiveDomainCertificateInfoResponseCertInfosCertInfo();
            return TeaModel.build(map, self);
        }

        public DescribeLiveDomainCertificateInfoResponseCertInfosCertInfo setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public DescribeLiveDomainCertificateInfoResponseCertInfosCertInfo setCertName(String certName) {
            this.certName = certName;
            return this;
        }
        public String getCertName() {
            return this.certName;
        }

        public DescribeLiveDomainCertificateInfoResponseCertInfosCertInfo setCertDomainName(String certDomainName) {
            this.certDomainName = certDomainName;
            return this;
        }
        public String getCertDomainName() {
            return this.certDomainName;
        }

        public DescribeLiveDomainCertificateInfoResponseCertInfosCertInfo setCertExpireTime(String certExpireTime) {
            this.certExpireTime = certExpireTime;
            return this;
        }
        public String getCertExpireTime() {
            return this.certExpireTime;
        }

        public DescribeLiveDomainCertificateInfoResponseCertInfosCertInfo setCertLife(String certLife) {
            this.certLife = certLife;
            return this;
        }
        public String getCertLife() {
            return this.certLife;
        }

        public DescribeLiveDomainCertificateInfoResponseCertInfosCertInfo setCertOrg(String certOrg) {
            this.certOrg = certOrg;
            return this;
        }
        public String getCertOrg() {
            return this.certOrg;
        }

        public DescribeLiveDomainCertificateInfoResponseCertInfosCertInfo setCertType(String certType) {
            this.certType = certType;
            return this;
        }
        public String getCertType() {
            return this.certType;
        }

        public DescribeLiveDomainCertificateInfoResponseCertInfosCertInfo setSSLProtocol(String SSLProtocol) {
            this.SSLProtocol = SSLProtocol;
            return this;
        }
        public String getSSLProtocol() {
            return this.SSLProtocol;
        }

        public DescribeLiveDomainCertificateInfoResponseCertInfosCertInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeLiveDomainCertificateInfoResponseCertInfosCertInfo setSSLPub(String SSLPub) {
            this.SSLPub = SSLPub;
            return this;
        }
        public String getSSLPub() {
            return this.SSLPub;
        }

    }

    public static class DescribeLiveDomainCertificateInfoResponseCertInfos extends TeaModel {
        @NameInMap("CertInfo")
        @Validation(required = true)
        public java.util.List<DescribeLiveDomainCertificateInfoResponseCertInfosCertInfo> certInfo;

        public static DescribeLiveDomainCertificateInfoResponseCertInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveDomainCertificateInfoResponseCertInfos self = new DescribeLiveDomainCertificateInfoResponseCertInfos();
            return TeaModel.build(map, self);
        }

        public DescribeLiveDomainCertificateInfoResponseCertInfos setCertInfo(java.util.List<DescribeLiveDomainCertificateInfoResponseCertInfosCertInfo> certInfo) {
            this.certInfo = certInfo;
            return this;
        }
        public java.util.List<DescribeLiveDomainCertificateInfoResponseCertInfosCertInfo> getCertInfo() {
            return this.certInfo;
        }

    }

}
