// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveDomainCertificateInfoResponseBody extends TeaModel {
    /**
     * <p>The certificate information.</p>
     */
    @NameInMap("CertInfos")
    public DescribeLiveDomainCertificateInfoResponseBodyCertInfos certInfos;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>5C1E43DC-9E51-4771-82C0-7D5ECEB547A1</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeLiveDomainCertificateInfoResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveDomainCertificateInfoResponseBody self = new DescribeLiveDomainCertificateInfoResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLiveDomainCertificateInfoResponseBody setCertInfos(DescribeLiveDomainCertificateInfoResponseBodyCertInfos certInfos) {
        this.certInfos = certInfos;
        return this;
    }
    public DescribeLiveDomainCertificateInfoResponseBodyCertInfos getCertInfos() {
        return this.certInfos;
    }

    public DescribeLiveDomainCertificateInfoResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeLiveDomainCertificateInfoResponseBodyCertInfosCertInfo extends TeaModel {
        /**
         * <p>The streaming domain or ingest domain that matches the certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        @NameInMap("CertDomainName")
        public String certDomainName;

        /**
         * <p>The expiration time of the certificate. The time follows the ISO 8601 standard in the <em>yyyy-MM-dd</em>T<em>HH:mm:ss</em>Z format. The time is displayed in UTC.</p>
         * 
         * <strong>example:</strong>
         * <p>2018-06-03T22:03:39Z</p>
         */
        @NameInMap("CertExpireTime")
        public String certExpireTime;

        /**
         * <p>The validity period of the certificate.</p>
         * <ul>
         * <li>If the validity period is greater than 12 months, XX years XX months is displayed. For example, 2 years 3 months indicates that the validity period is 2 years and 3 months.</li>
         * <li>If the validity period is less than 12 months, XX months is displayed. For example, 3 months indicates that the validity period is 3 months.</li>
         * </ul>
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
         * <p>Cert-****</p>
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
         * <p>The type of the certificate. Valid values:</p>
         * <ul>
         * <li><strong>free</strong>: a free certificate (for testing)</li>
         * <li><strong>cas</strong>: a certificate that is purchased from Certificate Management Service</li>
         * <li><strong>upload</strong>: a custom certificate that you uploaded</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cas</p>
         */
        @NameInMap("CertType")
        public String certType;

        /**
         * <p>The streaming domain or ingest domain.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        @NameInMap("DomainName")
        public String domainName;

        /**
         * <p>The status of HTTPS. Valid values:</p>
         * <ul>
         * <li><strong>on</strong>: HTTPS is enabled.</li>
         * <li><strong>off</strong>: HTTPS is disabled.</li>
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
         * <p>yourSSLPub</p>
         */
        @NameInMap("SSLPub")
        public String SSLPub;

        /**
         * <p>The status of the free certificate that is used for testing. Valid values:</p>
         * <ul>
         * <li><strong>success</strong>: The certificate is effective.</li>
         * <li><strong>checking</strong>: The system is checking whether the domain name is mapped to the CNAME that is assigned by ApsaraVideo Live.</li>
         * <li><strong>cname_error</strong>: The domain name is not mapped to the CNAME that is assigned by ApsaraVideo Live.</li>
         * <li><strong>domain_invalid</strong>: The domain name contains invalid characters.</li>
         * <li><strong>unsupport_wildcard</strong>: The domain name is a wildcard domain name, which is not supported.</li>
         * <li><strong>applying</strong>: The certificate is in the application progress.</li>
         * <li><strong>failed</strong>: The application for the certificate failed.</li>
         * </ul>
         * <blockquote>
         * <p> The <strong>Status</strong> parameter is valid only if the certificate is a free certificate for testing. If the certificate is not a free certificate for testing, an empty value is returned.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("Status")
        public String status;

        public static DescribeLiveDomainCertificateInfoResponseBodyCertInfosCertInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveDomainCertificateInfoResponseBodyCertInfosCertInfo self = new DescribeLiveDomainCertificateInfoResponseBodyCertInfosCertInfo();
            return TeaModel.build(map, self);
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

        public DescribeLiveDomainCertificateInfoResponseBodyCertInfosCertInfo setCertName(String certName) {
            this.certName = certName;
            return this;
        }
        public String getCertName() {
            return this.certName;
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

        public DescribeLiveDomainCertificateInfoResponseBodyCertInfosCertInfo setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
        }

        public DescribeLiveDomainCertificateInfoResponseBodyCertInfosCertInfo setSSLProtocol(String SSLProtocol) {
            this.SSLProtocol = SSLProtocol;
            return this;
        }
        public String getSSLProtocol() {
            return this.SSLProtocol;
        }

        public DescribeLiveDomainCertificateInfoResponseBodyCertInfosCertInfo setSSLPub(String SSLPub) {
            this.SSLPub = SSLPub;
            return this;
        }
        public String getSSLPub() {
            return this.SSLPub;
        }

        public DescribeLiveDomainCertificateInfoResponseBodyCertInfosCertInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
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
