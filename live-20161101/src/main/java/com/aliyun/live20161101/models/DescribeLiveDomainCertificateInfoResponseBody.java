// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveDomainCertificateInfoResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("CertInfos")
    public DescribeLiveDomainCertificateInfoResponseBodyCertInfos certInfos;

    public static DescribeLiveDomainCertificateInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveDomainCertificateInfoResponseBody self = new DescribeLiveDomainCertificateInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLiveDomainCertificateInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLiveDomainCertificateInfoResponseBody setCertInfos(DescribeLiveDomainCertificateInfoResponseBodyCertInfos certInfos) {
        this.certInfos = certInfos;
        return this;
    }
    public DescribeLiveDomainCertificateInfoResponseBodyCertInfos getCertInfos() {
        return this.certInfos;
    }

    public static class DescribeLiveDomainCertificateInfoResponseBodyCertInfosCertInfo extends TeaModel {
        @NameInMap("DomainName")
        public String domainName;

        @NameInMap("CertName")
        public String certName;

        @NameInMap("CertDomainName")
        public String certDomainName;

        @NameInMap("CertExpireTime")
        public String certExpireTime;

        @NameInMap("CertLife")
        public String certLife;

        @NameInMap("CertOrg")
        public String certOrg;

        @NameInMap("CertType")
        public String certType;

        @NameInMap("SSLProtocol")
        public String SSLProtocol;

        @NameInMap("Status")
        public String status;

        @NameInMap("SSLPub")
        public String SSLPub;

        public static DescribeLiveDomainCertificateInfoResponseBodyCertInfosCertInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveDomainCertificateInfoResponseBodyCertInfosCertInfo self = new DescribeLiveDomainCertificateInfoResponseBodyCertInfosCertInfo();
            return TeaModel.build(map, self);
        }

        public DescribeLiveDomainCertificateInfoResponseBodyCertInfosCertInfo setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public DescribeLiveDomainCertificateInfoResponseBodyCertInfosCertInfo setCertName(String certName) {
            this.certName = certName;
            return this;
        }
        public String getCertName() {
            return this.certName;
        }

        public DescribeLiveDomainCertificateInfoResponseBodyCertInfosCertInfo setCertDomainName(String certDomainName) {
            this.certDomainName = certDomainName;
            return this;
        }
        public String getCertDomainName() {
            return this.certDomainName;
        }

        public DescribeLiveDomainCertificateInfoResponseBodyCertInfosCertInfo setCertExpireTime(String certExpireTime) {
            this.certExpireTime = certExpireTime;
            return this;
        }
        public String getCertExpireTime() {
            return this.certExpireTime;
        }

        public DescribeLiveDomainCertificateInfoResponseBodyCertInfosCertInfo setCertLife(String certLife) {
            this.certLife = certLife;
            return this;
        }
        public String getCertLife() {
            return this.certLife;
        }

        public DescribeLiveDomainCertificateInfoResponseBodyCertInfosCertInfo setCertOrg(String certOrg) {
            this.certOrg = certOrg;
            return this;
        }
        public String getCertOrg() {
            return this.certOrg;
        }

        public DescribeLiveDomainCertificateInfoResponseBodyCertInfosCertInfo setCertType(String certType) {
            this.certType = certType;
            return this;
        }
        public String getCertType() {
            return this.certType;
        }

        public DescribeLiveDomainCertificateInfoResponseBodyCertInfosCertInfo setSSLProtocol(String SSLProtocol) {
            this.SSLProtocol = SSLProtocol;
            return this;
        }
        public String getSSLProtocol() {
            return this.SSLProtocol;
        }

        public DescribeLiveDomainCertificateInfoResponseBodyCertInfosCertInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeLiveDomainCertificateInfoResponseBodyCertInfosCertInfo setSSLPub(String SSLPub) {
            this.SSLPub = SSLPub;
            return this;
        }
        public String getSSLPub() {
            return this.SSLPub;
        }

    }

    public static class DescribeLiveDomainCertificateInfoResponseBodyCertInfos extends TeaModel {
        @NameInMap("CertInfo")
        public java.util.List<DescribeLiveDomainCertificateInfoResponseBodyCertInfosCertInfo> certInfo;

        public static DescribeLiveDomainCertificateInfoResponseBodyCertInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveDomainCertificateInfoResponseBodyCertInfos self = new DescribeLiveDomainCertificateInfoResponseBodyCertInfos();
            return TeaModel.build(map, self);
        }

        public DescribeLiveDomainCertificateInfoResponseBodyCertInfos setCertInfo(java.util.List<DescribeLiveDomainCertificateInfoResponseBodyCertInfosCertInfo> certInfo) {
            this.certInfo = certInfo;
            return this;
        }
        public java.util.List<DescribeLiveDomainCertificateInfoResponseBodyCertInfosCertInfo> getCertInfo() {
            return this.certInfo;
        }

    }

}
