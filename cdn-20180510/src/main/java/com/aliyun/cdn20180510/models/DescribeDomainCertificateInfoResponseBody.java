// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeDomainCertificateInfoResponseBody extends TeaModel {
    /**
     * <p>The unit of the validity period of the SSL certificate.</p>
     * <br>
     * <p>*   **months**: The validity period is measured in months.</p>
     * <p>*   **years**: The validity period is measured in years.</p>
     */
    @NameInMap("CertInfos")
    public DescribeDomainCertificateInfoResponseBodyCertInfos certInfos;

    /**
     * <p>The time when the SSL certificate expires.</p>
     */
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
        /**
         * <p>The name of the certificate authority (CA) that issued the SSL certificate.</p>
         */
        @NameInMap("CertDomainName")
        public String certDomainName;

        /**
         * <p>The status of the SSL certificate.</p>
         * <br>
         * <p>*   **success**: The SSL certificate is effective.</p>
         * <p>*   **checking**: The system is checking whether the domain name is accelerated by Alibaba Cloud CDN.</p>
         * <p>*   **cname_error**: The domain name is not accelerated by Alibaba Cloud CDN.</p>
         * <p>*   **top_domain_cname_error**: The top-level domain name is not an accelerated domain name.</p>
         * <p>*   **domain_invalid**: The domain name contains invalid characters.</p>
         * <p>*   **unsupport_wildcard**: Wildcard domain names are not supported.</p>
         * <p>*   **applying**: The application for a certificate is in progress.</p>
         * <p>*   **fget_token_timeout**: The application for a certificate timed out.</p>
         * <p>*   **check_token_timeout**: The verification timed out.</p>
         * <p>*   **get_cert_timeout**: The request to obtain the certificate timed out.</p>
         * <p>*   **failed**: The application for a certificate failed.</p>
         */
        @NameInMap("CertExpireTime")
        public String certExpireTime;

        /**
         * <p>The domain name that matches the SSL certificate.</p>
         */
        @NameInMap("CertId")
        public String certId;

        /**
         * <p>The time when the certificate was renewed.</p>
         */
        @NameInMap("CertLife")
        public String certLife;

        /**
         * <p>The public key of the SSL certificate.</p>
         */
        @NameInMap("CertName")
        public String certName;

        /**
         * <p>The time when the SSL certificate became effective.</p>
         */
        @NameInMap("CertOrg")
        public String certOrg;

        /**
         * <p>The status of HTTPS.</p>
         * <br>
         * <p>*   **on**: enabled.</p>
         * <p>*   **off**: disabled.</p>
         */
        @NameInMap("CertRegion")
        public String certRegion;

        /**
         * <p>The name of the SSL certificate.</p>
         */
        @NameInMap("CertStartTime")
        public String certStartTime;

        /**
         * <p>The status of the CNAME of the domain name.</p>
         * <br>
         * <p>*   **ok**: The domain name points to the CNAME assigned from Alibaba Cloud Content Delivery Network (CDN).</p>
         * <p>*   **cname_error**: An error occurred and the domain name cannot point to the CNAME.</p>
         * <p>*   **top_domain_cname_error**: An error occurred to the CNAME of the top-level domain name. The domain name cannot point to the CNAME.</p>
         * <p>*   **unsupport_wildcard**: Wildcard domain names are not supported.</p>
         */
        @NameInMap("CertType")
        public String certType;

        /**
         * <p>The status of HTTPS.</p>
         * <br>
         * <p>*   **on**: enabled.</p>
         * <p>*   **off**: disabled.</p>
         */
        @NameInMap("CertUpdateTime")
        public String certUpdateTime;

        /**
         * <p>>  The maximum number of times that each user can call this operation per second is 100.</p>
         */
        @NameInMap("DomainCnameStatus")
        public String domainCnameStatus;

        /**
         * <p>The type of the SSL certificate. Valid values:</p>
         * <br>
         * <p>*   **free**: a free SSL certificate.</p>
         * <p>*   **cas**: an SSL certificate purchased from Alibaba Cloud SSL Certificates Service.</p>
         * <p>*   **upload**: a user-uploaded SSL certificate.</p>
         */
        @NameInMap("DomainName")
        public String domainName;

        /**
         * <p>The public key of the SSL certificate.</p>
         */
        @NameInMap("ServerCertificate")
        public String serverCertificate;

        /**
         * <p>The accelerated domain name.</p>
         */
        @NameInMap("ServerCertificateStatus")
        public String serverCertificateStatus;

        /**
         * <p>The domain name that matches the SSL certificate.</p>
         */
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

        public DescribeDomainCertificateInfoResponseBodyCertInfosCertInfo setCertId(String certId) {
            this.certId = certId;
            return this;
        }
        public String getCertId() {
            return this.certId;
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

        public DescribeDomainCertificateInfoResponseBodyCertInfosCertInfo setCertRegion(String certRegion) {
            this.certRegion = certRegion;
            return this;
        }
        public String getCertRegion() {
            return this.certRegion;
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
