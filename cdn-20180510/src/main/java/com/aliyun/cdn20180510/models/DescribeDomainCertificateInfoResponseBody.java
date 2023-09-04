// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeDomainCertificateInfoResponseBody extends TeaModel {
    /**
     * <p>The information about the certificate.</p>
     */
    @NameInMap("CertInfos")
    public DescribeDomainCertificateInfoResponseBodyCertInfos certInfos;

    /**
     * <p>The ID of the request.</p>
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
         * <p>The domain name that matches the certificate.</p>
         */
        @NameInMap("CertDomainName")
        public String certDomainName;

        /**
         * <p>The time at which the certificate expires.</p>
         */
        @NameInMap("CertExpireTime")
        public String certExpireTime;

        /**
         * <p>The ID of the certificate.</p>
         */
        @NameInMap("CertId")
        public String certId;

        /**
         * <p>The unit of the validity period of the certificate. Valid values:</p>
         * <br>
         * <p>*   **months**</p>
         * <p>*   **years**</p>
         */
        @NameInMap("CertLife")
        public String certLife;

        /**
         * <p>The name of the certificate.</p>
         */
        @NameInMap("CertName")
        public String certName;

        /**
         * <p>The name of the certificate authority (CA) that issued the certificate.</p>
         */
        @NameInMap("CertOrg")
        public String certOrg;

        /**
         * <p>The region where the certificate is used.</p>
         */
        @NameInMap("CertRegion")
        public String certRegion;

        /**
         * <p>The time when the certificate became effective.</p>
         */
        @NameInMap("CertStartTime")
        public String certStartTime;

        /**
         * <p>The type of the certificate.</p>
         * <br>
         * <p>*   **free**: a free certificate</p>
         * <p>*   **cas**: a certificate that is purchased by using Certificate Management Service</p>
         * <p>*   **upload**: a custom certificate that you upload</p>
         */
        @NameInMap("CertType")
        public String certType;

        /**
         * <p>The time at which the certificate was updated.</p>
         */
        @NameInMap("CertUpdateTime")
        public String certUpdateTime;

        /**
         * <p>The CNAME status of the domain name.</p>
         * <br>
         * <p>*   **ok**: The domain name points to the CNAME assigned by Alibaba Cloud CDN.</p>
         * <p>*   **cname_error**: An error occurred and the domain name cannot point to the CNAME.</p>
         * <p>*   **op_domain_cname_error** : An error occurred to the CNAME of the top-level domain. The domain name cannot point to the CNAME.</p>
         * <p>*   **unsupport_wildcard**: The wildcard domain name is not supported.</p>
         */
        @NameInMap("DomainCnameStatus")
        public String domainCnameStatus;

        /**
         * <p>The accelerated domain name.</p>
         */
        @NameInMap("DomainName")
        public String domainName;

        /**
         * <p>The public key of the certificate.</p>
         */
        @NameInMap("ServerCertificate")
        public String serverCertificate;

        /**
         * <p>The status of HTTPS.</p>
         * <br>
         * <p>*   **on**</p>
         * <p>*   **off**</p>
         */
        @NameInMap("ServerCertificateStatus")
        public String serverCertificateStatus;

        /**
         * <p>The status of the certificate. Valid values:</p>
         * <br>
         * <p>*   **success**: The certificate has taken effect.</p>
         * <p>*   **checking**: The system is checking whether the domain name is using Alibaba Cloud CDN.</p>
         * <p>*   **cname_error**: No valid CNAME record has been added for the domain name.</p>
         * <p>*   **top_domain_cname_error**: No valid CNAME record has been added for the top-level domain.</p>
         * <p>*   **domain_invalid**: The domain name contains invalid characters.</p>
         * <p>*   **unsupport_wildcard**: The domain name is a wildcard domain name. Wildcard domain names are not supported.</p>
         * <p>*   **applying**: The certificate application is in progress.</p>
         * <p>*   **get_token_timeout**: The certificate application request has timed out.</p>
         * <p>*   **check_token_timeout**: The verification has timed out.</p>
         * <p>*   **get_cert_timeout**: The request to obtain the certificate has timed out.</p>
         * <p>*   **failed**: The certificate application request failed.</p>
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
