// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnDomainCertificateInfoResponseBody extends TeaModel {
    @NameInMap("CertInfos")
    public DescribeDcdnDomainCertificateInfoResponseBodyCertInfos certInfos;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDcdnDomainCertificateInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnDomainCertificateInfoResponseBody self = new DescribeDcdnDomainCertificateInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnDomainCertificateInfoResponseBody setCertInfos(DescribeDcdnDomainCertificateInfoResponseBodyCertInfos certInfos) {
        this.certInfos = certInfos;
        return this;
    }
    public DescribeDcdnDomainCertificateInfoResponseBodyCertInfos getCertInfos() {
        return this.certInfos;
    }

    public DescribeDcdnDomainCertificateInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDcdnDomainCertificateInfoResponseBodyCertInfosCertInfo extends TeaModel {
        @NameInMap("CertDomainName")
        public String certDomainName;

        @NameInMap("CertExpireTime")
        public String certExpireTime;

        @NameInMap("CertLife")
        public String certLife;

        @NameInMap("CertName")
        public String certName;

        @NameInMap("CertOrg")
        public String certOrg;

        @NameInMap("CertType")
        public String certType;

        @NameInMap("DomainName")
        public String domainName;

        @NameInMap("SSLProtocol")
        public String SSLProtocol;

        @NameInMap("SSLPub")
        public String SSLPub;

        @NameInMap("Status")
        public String status;

        public static DescribeDcdnDomainCertificateInfoResponseBodyCertInfosCertInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnDomainCertificateInfoResponseBodyCertInfosCertInfo self = new DescribeDcdnDomainCertificateInfoResponseBodyCertInfosCertInfo();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnDomainCertificateInfoResponseBodyCertInfosCertInfo setCertDomainName(String certDomainName) {
            this.certDomainName = certDomainName;
            return this;
        }
        public String getCertDomainName() {
            return this.certDomainName;
        }

        public DescribeDcdnDomainCertificateInfoResponseBodyCertInfosCertInfo setCertExpireTime(String certExpireTime) {
            this.certExpireTime = certExpireTime;
            return this;
        }
        public String getCertExpireTime() {
            return this.certExpireTime;
        }

        public DescribeDcdnDomainCertificateInfoResponseBodyCertInfosCertInfo setCertLife(String certLife) {
            this.certLife = certLife;
            return this;
        }
        public String getCertLife() {
            return this.certLife;
        }

        public DescribeDcdnDomainCertificateInfoResponseBodyCertInfosCertInfo setCertName(String certName) {
            this.certName = certName;
            return this;
        }
        public String getCertName() {
            return this.certName;
        }

        public DescribeDcdnDomainCertificateInfoResponseBodyCertInfosCertInfo setCertOrg(String certOrg) {
            this.certOrg = certOrg;
            return this;
        }
        public String getCertOrg() {
            return this.certOrg;
        }

        public DescribeDcdnDomainCertificateInfoResponseBodyCertInfosCertInfo setCertType(String certType) {
            this.certType = certType;
            return this;
        }
        public String getCertType() {
            return this.certType;
        }

        public DescribeDcdnDomainCertificateInfoResponseBodyCertInfosCertInfo setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public DescribeDcdnDomainCertificateInfoResponseBodyCertInfosCertInfo setSSLProtocol(String SSLProtocol) {
            this.SSLProtocol = SSLProtocol;
            return this;
        }
        public String getSSLProtocol() {
            return this.SSLProtocol;
        }

        public DescribeDcdnDomainCertificateInfoResponseBodyCertInfosCertInfo setSSLPub(String SSLPub) {
            this.SSLPub = SSLPub;
            return this;
        }
        public String getSSLPub() {
            return this.SSLPub;
        }

        public DescribeDcdnDomainCertificateInfoResponseBodyCertInfosCertInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeDcdnDomainCertificateInfoResponseBodyCertInfos extends TeaModel {
        @NameInMap("CertInfo")
        public java.util.List<DescribeDcdnDomainCertificateInfoResponseBodyCertInfosCertInfo> certInfo;

        public static DescribeDcdnDomainCertificateInfoResponseBodyCertInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnDomainCertificateInfoResponseBodyCertInfos self = new DescribeDcdnDomainCertificateInfoResponseBodyCertInfos();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnDomainCertificateInfoResponseBodyCertInfos setCertInfo(java.util.List<DescribeDcdnDomainCertificateInfoResponseBodyCertInfosCertInfo> certInfo) {
            this.certInfo = certInfo;
            return this;
        }
        public java.util.List<DescribeDcdnDomainCertificateInfoResponseBodyCertInfosCertInfo> getCertInfo() {
            return this.certInfo;
        }

    }

}
