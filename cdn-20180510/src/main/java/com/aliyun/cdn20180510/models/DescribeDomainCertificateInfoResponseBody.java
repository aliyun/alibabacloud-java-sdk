// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeDomainCertificateInfoResponseBody extends TeaModel {
    // The information about the SSL certificate.
    @NameInMap("CertInfos")
    public DescribeDomainCertificateInfoResponseBodyCertInfos certInfos;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDomainCertificateInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDomainCertificateInfoResponseBody self = new DescribeDomainCertificateInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDomainCertificateInfoResponseBody setCertInfos(DescribeDomainCertificateInfoResponseBodyCertInfos certInfos) {
        this.certInfos = certInfos;
        return this;
    }
    public DescribeDomainCertificateInfoResponseBodyCertInfos getCertInfos() {
        return this.certInfos;
    }

    public DescribeDomainCertificateInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDomainCertificateInfoResponseBodyCertInfosCertInfo extends TeaModel {
        // The domain name that matches the SSL certificate.
        @NameInMap("CertDomainName")
        public String certDomainName;

        // The time when the SSL certificate expires.
        @NameInMap("CertExpireTime")
        public String certExpireTime;

        // The unit of the validity period of the SSL certificate.
        // 
        // *   **months**: The validity period is measured in months.
        // *   **years**: The validity period is measured in years.
        @NameInMap("CertLife")
        public String certLife;

        // The name of the SSL certificate.
        @NameInMap("CertName")
        public String certName;

        // The name of the certificate authority (CA) that issued the SSL certificate.
        @NameInMap("CertOrg")
        public String certOrg;

        // The time when the SSL certificate became effective.
        @NameInMap("CertStartTime")
        public String certStartTime;

        // The type of the SSL certificate. Valid values:
        // 
        // *   **free**: a free SSL certificate.
        // *   **cas**: an SSL certificate purchased from Alibaba Cloud SSL Certificates Service.
        // *   **upload**: a user-uploaded SSL certificate.
        @NameInMap("CertType")
        public String certType;

        // The time when the certificate was renewed.
        @NameInMap("CertUpdateTime")
        public String certUpdateTime;

        // The status of the CNAME of the domain name.
        // 
        // *   **ok**: The domain name points to the CNAME assigned from Alibaba Cloud Content Delivery Network (CDN).
        // *   **cname_error**: An error occurred and the domain name cannot point to the CNAME.
        // *   **top_domain_cname_error**: An error occurred to the CNAME of the top-level domain name. The domain name cannot point to the CNAME.
        // *   **unsupport_wildcard**: Wildcard domain names are not supported.
        @NameInMap("DomainCnameStatus")
        public String domainCnameStatus;

        // The accelerated domain name.
        @NameInMap("DomainName")
        public String domainName;

        // The public key of the SSL certificate.
        @NameInMap("ServerCertificate")
        public String serverCertificate;

        // The status of HTTPS.
        // 
        // *   **on**: enabled.
        // *   **off**: disabled.
        @NameInMap("ServerCertificateStatus")
        public String serverCertificateStatus;

        // The status of the SSL certificate.
        // 
        // *   **success**: The SSL certificate is effective.
        // *   **checking**: The system is checking whether the domain name is accelerated by Alibaba Cloud CDN.
        // *   **cname_error**: The domain name is not accelerated by Alibaba Cloud CDN.
        // *   **top_domain_cname_error**: The top-level domain name is not an accelerated domain name.
        // *   **domain_invalid**: The domain name contains invalid characters.
        // *   **unsupport_wildcard**: Wildcard domain names are not supported.
        // *   **applying**: The application for a certificate is in progress.
        // *   **fget_token_timeout**: The application for a certificate timed out.
        // *   **check_token_timeout**: The verification timed out.
        // *   **get_cert_timeout**: The request to obtain the certificate timed out.
        // *   **failed**: The application for a certificate failed.
        @NameInMap("Status")
        public String status;

        public static DescribeDomainCertificateInfoResponseBodyCertInfosCertInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainCertificateInfoResponseBodyCertInfosCertInfo self = new DescribeDomainCertificateInfoResponseBodyCertInfosCertInfo();
            return TeaModel.build(map, self);
        }

        public DescribeDomainCertificateInfoResponseBodyCertInfosCertInfo setCertDomainName(String certDomainName) {
            this.certDomainName = certDomainName;
            return this;
        }
        public String getCertDomainName() {
            return this.certDomainName;
        }

        public DescribeDomainCertificateInfoResponseBodyCertInfosCertInfo setCertExpireTime(String certExpireTime) {
            this.certExpireTime = certExpireTime;
            return this;
        }
        public String getCertExpireTime() {
            return this.certExpireTime;
        }

        public DescribeDomainCertificateInfoResponseBodyCertInfosCertInfo setCertLife(String certLife) {
            this.certLife = certLife;
            return this;
        }
        public String getCertLife() {
            return this.certLife;
        }

        public DescribeDomainCertificateInfoResponseBodyCertInfosCertInfo setCertName(String certName) {
            this.certName = certName;
            return this;
        }
        public String getCertName() {
            return this.certName;
        }

        public DescribeDomainCertificateInfoResponseBodyCertInfosCertInfo setCertOrg(String certOrg) {
            this.certOrg = certOrg;
            return this;
        }
        public String getCertOrg() {
            return this.certOrg;
        }

        public DescribeDomainCertificateInfoResponseBodyCertInfosCertInfo setCertStartTime(String certStartTime) {
            this.certStartTime = certStartTime;
            return this;
        }
        public String getCertStartTime() {
            return this.certStartTime;
        }

        public DescribeDomainCertificateInfoResponseBodyCertInfosCertInfo setCertType(String certType) {
            this.certType = certType;
            return this;
        }
        public String getCertType() {
            return this.certType;
        }

        public DescribeDomainCertificateInfoResponseBodyCertInfosCertInfo setCertUpdateTime(String certUpdateTime) {
            this.certUpdateTime = certUpdateTime;
            return this;
        }
        public String getCertUpdateTime() {
            return this.certUpdateTime;
        }

        public DescribeDomainCertificateInfoResponseBodyCertInfosCertInfo setDomainCnameStatus(String domainCnameStatus) {
            this.domainCnameStatus = domainCnameStatus;
            return this;
        }
        public String getDomainCnameStatus() {
            return this.domainCnameStatus;
        }

        public DescribeDomainCertificateInfoResponseBodyCertInfosCertInfo setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public DescribeDomainCertificateInfoResponseBodyCertInfosCertInfo setServerCertificate(String serverCertificate) {
            this.serverCertificate = serverCertificate;
            return this;
        }
        public String getServerCertificate() {
            return this.serverCertificate;
        }

        public DescribeDomainCertificateInfoResponseBodyCertInfosCertInfo setServerCertificateStatus(String serverCertificateStatus) {
            this.serverCertificateStatus = serverCertificateStatus;
            return this;
        }
        public String getServerCertificateStatus() {
            return this.serverCertificateStatus;
        }

        public DescribeDomainCertificateInfoResponseBodyCertInfosCertInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class DescribeDomainCertificateInfoResponseBodyCertInfos extends TeaModel {
        @NameInMap("CertInfo")
        public java.util.List<DescribeDomainCertificateInfoResponseBodyCertInfosCertInfo> certInfo;

        public static DescribeDomainCertificateInfoResponseBodyCertInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainCertificateInfoResponseBodyCertInfos self = new DescribeDomainCertificateInfoResponseBodyCertInfos();
            return TeaModel.build(map, self);
        }

        public DescribeDomainCertificateInfoResponseBodyCertInfos setCertInfo(java.util.List<DescribeDomainCertificateInfoResponseBodyCertInfosCertInfo> certInfo) {
            this.certInfo = certInfo;
            return this;
        }
        public java.util.List<DescribeDomainCertificateInfoResponseBodyCertInfosCertInfo> getCertInfo() {
            return this.certInfo;
        }

    }

}
