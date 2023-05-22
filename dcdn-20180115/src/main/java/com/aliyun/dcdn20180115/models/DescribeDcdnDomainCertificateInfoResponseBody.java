// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnDomainCertificateInfoResponseBody extends TeaModel {
    /**
     * <p>The validity period of the certificate. Unit: **months** or **years**.</p>
     */
    @NameInMap("CertInfos")
    public DescribeDcdnDomainCertificateInfoResponseBodyCertInfos certInfos;

    /**
     * <p>The status of the certificate. Valid values:</p>
     * <br>
     * <p>*   **success**: The certificate has taken effect.</p>
     * <p>*   **checking**: The system is checking whether the domain name is using Dynamic Route for CDN (DCDN).</p>
     * <p>*   **cname_error**: The domain name is not using DCDN.</p>
     * <p>*   **domain_invalid**: The domain name contains invalid characters.</p>
     * <p>*   **unsupport_wildcard**: The wildcard domain name is not supported.</p>
     * <p>*   **applying**: Certificate application is in progress.</p>
     * <p>*   **get_token_timeout**: The certificate application request has timed out.</p>
     * <p>*   **check_token_timeout**: The verification has timed out.</p>
     * <p>*   **get_cert_timeout**: The request to obtain the certificate has timed out.</p>
     * <p>*   **failed**: The certificate application request failed.</p>
     */
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
        /**
         * <p>The certificate authority (CA) that issued the certificate.</p>
         */
        @NameInMap("CertDomainName")
        public String certDomainName;

        /**
         * <p>The status of HTTPS. Valid values:</p>
         * <br>
         * <p>*   **on**: enabled</p>
         * <p>*   **off**: disabled</p>
         */
        @NameInMap("CertExpireTime")
        public String certExpireTime;

        /**
         * <p>The type of the certificate. Valid values:</p>
         * <br>
         * <p>*   **free**: a free certificate</p>
         * <p>*   **cas**: a certificate that is purchased from Alibaba Cloud SSL Certificates Service</p>
         * <p>*   **upload**: a certificate that is uploaded by the user</p>
         */
        @NameInMap("CertId")
        public String certId;

        /**
         * <p>The public key of the certificate.</p>
         */
        @NameInMap("CertLife")
        public String certLife;

        /**
         * <p>The accelerated domain name.</p>
         */
        @NameInMap("CertName")
        public String certName;

        /**
         * <p>>  The maximum number of times that each user can call this operation per second is 100.</p>
         */
        @NameInMap("CertOrg")
        public String certOrg;

        /**
         * <p>The expiration time of the certificate.</p>
         */
        @NameInMap("CertRegion")
        public String certRegion;

        /**
         * <p>The name of the certificate.</p>
         */
        @NameInMap("CertType")
        public String certType;

        /**
         * <p>The domain name that matches the certificate.</p>
         */
        @NameInMap("DomainName")
        public String domainName;

        /**
         * <p>The domain name that matches the certificate.</p>
         */
        @NameInMap("SSLProtocol")
        public String SSLProtocol;

        /**
         * <p>The type of the certificate. Valid values:</p>
         * <br>
         * <p>*   **free**: a free certificate</p>
         * <p>*   **cas**: a certificate that is purchased from Alibaba Cloud SSL Certificates Service</p>
         * <p>*   **upload**: a certificate that is uploaded by the user</p>
         */
        @NameInMap("SSLPub")
        public String SSLPub;

        /**
         * <p>The expiration time of the certificate.</p>
         */
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

        public DescribeDcdnDomainCertificateInfoResponseBodyCertInfosCertInfo setCertId(String certId) {
            this.certId = certId;
            return this;
        }
        public String getCertId() {
            return this.certId;
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

        public DescribeDcdnDomainCertificateInfoResponseBodyCertInfosCertInfo setCertRegion(String certRegion) {
            this.certRegion = certRegion;
            return this;
        }
        public String getCertRegion() {
            return this.certRegion;
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
