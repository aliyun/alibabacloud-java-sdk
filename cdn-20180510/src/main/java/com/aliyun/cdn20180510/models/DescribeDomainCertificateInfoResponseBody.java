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
     * 
     * <strong>example:</strong>
     * <p>5C1E43DC-9E51-4771-82C0-7D5ECEB547A1</p>
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
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        @NameInMap("CertDomainName")
        public String certDomainName;

        /**
         * <p>The time at which the certificate expires.</p>
         * 
         * <strong>example:</strong>
         * <p>2018-06-03T22:03:39Z</p>
         */
        @NameInMap("CertExpireTime")
        public String certExpireTime;

        /**
         * <p>The ID of the certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>9002448</p>
         */
        @NameInMap("CertId")
        public String certId;

        /**
         * <p>The unit of the validity period of the certificate. Valid values:</p>
         * <ul>
         * <li><strong>months</strong></li>
         * <li><strong>years</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>months</p>
         */
        @NameInMap("CertLife")
        public String certLife;

        /**
         * <p>The name of the certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        @NameInMap("CertName")
        public String certName;

        /**
         * <p>The name of the certificate authority (CA) that issued the certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>Let\&quot;s Encrypt</p>
         */
        @NameInMap("CertOrg")
        public String certOrg;

        /**
         * <p>The region where the certificate is used.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("CertRegion")
        public String certRegion;

        /**
         * <p>The time when the certificate became effective.</p>
         * 
         * <strong>example:</strong>
         * <p>2018-06-03T22:03:39Z</p>
         */
        @NameInMap("CertStartTime")
        public String certStartTime;

        /**
         * <p>The type of the certificate.</p>
         * <ul>
         * <li><strong>free</strong>: a free certificate</li>
         * <li><strong>cas</strong>: a certificate that is purchased by using Certificate Management Service</li>
         * <li><strong>upload</strong>: a custom certificate that you upload</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>free</p>
         */
        @NameInMap("CertType")
        public String certType;

        /**
         * <p>The time at which the certificate was updated.</p>
         * 
         * <strong>example:</strong>
         * <p>2018-06-03T22:03:39Z</p>
         */
        @NameInMap("CertUpdateTime")
        public String certUpdateTime;

        /**
         * <p>The CNAME status of the domain name.</p>
         * <ul>
         * <li><strong>ok</strong>: The domain name points to the CNAME assigned by Alibaba Cloud CDN.</li>
         * <li><strong>cname_error</strong>: An error occurred and the domain name cannot point to the CNAME.</li>
         * <li><strong>op_domain_cname_error</strong> : An error occurred to the CNAME of the top-level domain. The domain name cannot point to the CNAME.</li>
         * <li><strong>unsupport_wildcard</strong>: The wildcard domain name is not supported.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ok</p>
         */
        @NameInMap("DomainCnameStatus")
        public String domainCnameStatus;

        /**
         * <p>The accelerated domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        @NameInMap("DomainName")
        public String domainName;

        /**
         * <p>The public key of the certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>asdadaxxxx</p>
         */
        @NameInMap("ServerCertificate")
        public String serverCertificate;

        /**
         * <p>The status of HTTPS.</p>
         * <ul>
         * <li><strong>on</strong></li>
         * <li><strong>off</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("ServerCertificateStatus")
        public String serverCertificateStatus;

        /**
         * <p>The status of the certificate. Valid values:</p>
         * <ul>
         * <li><strong>success</strong>: The certificate has taken effect.</li>
         * <li><strong>checking</strong>: The system is checking whether the domain name is using Alibaba Cloud CDN.</li>
         * <li><strong>cname_error</strong>: No valid CNAME record has been added for the domain name.</li>
         * <li><strong>top_domain_cname_error</strong>: No valid CNAME record has been added for the top-level domain.</li>
         * <li><strong>domain_invalid</strong>: The domain name contains invalid characters.</li>
         * <li><strong>unsupport_wildcard</strong>: The domain name is a wildcard domain name. Wildcard domain names are not supported.</li>
         * <li><strong>applying</strong>: The certificate application is in progress.</li>
         * <li><strong>get_token_timeout</strong>: The certificate application request has timed out.</li>
         * <li><strong>check_token_timeout</strong>: The verification has timed out.</li>
         * <li><strong>get_cert_timeout</strong>: The request to obtain the certificate has timed out.</li>
         * <li><strong>failed</strong>: The certificate application request failed.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>success</p>
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
