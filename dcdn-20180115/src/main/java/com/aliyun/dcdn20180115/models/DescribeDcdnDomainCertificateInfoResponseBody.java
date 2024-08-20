// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnDomainCertificateInfoResponseBody extends TeaModel {
    /**
     * <p>The information about the certificate.</p>
     */
    @NameInMap("CertInfos")
    public DescribeDcdnDomainCertificateInfoResponseBodyCertInfos certInfos;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>5C1E43DC-9E51-4771-82C0-7D5ECEB547A1</p>
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
         * <p>The validity period of the certificate. Unit: <strong>months</strong> or <strong>years</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>3 months</p>
         */
        @NameInMap("CertLife")
        public String certLife;

        /**
         * <p>The name of the certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>cert-example.com</p>
         */
        @NameInMap("CertName")
        public String certName;

        /**
         * <p>The certificate authority (CA) that issued the certificate.</p>
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
         * <p>The type of the certificate.</p>
         * <ul>
         * <li><strong>cas</strong>: a certificate that is purchased by using Certificates Management Service</li>
         * <li><strong>upload</strong>: a custom certificate that you upload</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cas</p>
         */
        @NameInMap("CertType")
        public String certType;

        /**
         * <p>The accelerated domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        @NameInMap("DomainName")
        public String domainName;

        /**
         * <p>The status of HTTPS. Valid values:</p>
         * <ul>
         * <li><strong>on</strong></li>
         * <li><strong>off</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>on</p>
         */
        @NameInMap("SSLProtocol")
        public String SSLProtocol;

        /**
         * <p>The public key of the certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>xxxx</p>
         */
        @NameInMap("SSLPub")
        public String SSLPub;

        /**
         * <p>The status of the certificate. Valid values:</p>
         * <ul>
         * <li><strong>success</strong>: The certificate has taken effect.</li>
         * <li><strong>checking</strong>: The system is checking whether the domain name is using Dynamic Route for CDN (DCDN).</li>
         * <li><strong>cname_error</strong>: The domain name is not using DCDN.</li>
         * <li><strong>domain_invalid</strong>: The domain name contains invalid characters.</li>
         * <li><strong>unsupport_wildcard</strong>: The wildcard domain name is not supported.</li>
         * <li><strong>applying</strong>: Certificate application is in progress.</li>
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
