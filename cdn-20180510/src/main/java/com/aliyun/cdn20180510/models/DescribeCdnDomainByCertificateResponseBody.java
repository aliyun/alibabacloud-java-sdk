// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeCdnDomainByCertificateResponseBody extends TeaModel {
    /**
     * <p>The information about the certificate.</p>
     */
    @NameInMap("CertInfos")
    public DescribeCdnDomainByCertificateResponseBodyCertInfos certInfos;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>ASAF2FDS-12SADSA-DDSAE3D-DSADCD4C-CDADS2D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeCdnDomainByCertificateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCdnDomainByCertificateResponseBody self = new DescribeCdnDomainByCertificateResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCdnDomainByCertificateResponseBody setCertInfos(DescribeCdnDomainByCertificateResponseBodyCertInfos certInfos) {
        this.certInfos = certInfos;
        return this;
    }
    public DescribeCdnDomainByCertificateResponseBodyCertInfos getCertInfos() {
        return this.certInfos;
    }

    public DescribeCdnDomainByCertificateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeCdnDomainByCertificateResponseBodyCertInfosCertInfo extends TeaModel {
        /**
         * <p>Indicates whether the SSL certificate is obsolete. Valid values:</p>
         * <ul>
         * <li><strong>yes</strong>: The SSL certificate is obsolete.</li>
         * <li><strong>no</strong>: The SSL certificate is working as expected.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>yes</p>
         */
        @NameInMap("CertCaIsLegacy")
        public String certCaIsLegacy;

        /**
         * <p>The expiration time of the certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>Nov 29 00:00:00 2016 GMT</p>
         */
        @NameInMap("CertExpireTime")
        public String certExpireTime;

        /**
         * <p>Indicates whether the SSL certificate is expired. Valid values:</p>
         * <ul>
         * <li><strong>yes</strong>: The SSL certificate is expired.</li>
         * <li><strong>no</strong>: The SSL certificate is not expired.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>yes</p>
         */
        @NameInMap("CertExpired")
        public String certExpired;

        /**
         * <p>The time when the certificate became effective.</p>
         * 
         * <strong>example:</strong>
         * <p>Nov 29 23:59:59 2017 GMT</p>
         */
        @NameInMap("CertStartTime")
        public String certStartTime;

        /**
         * <p>The name of the SSL certificate owner.</p>
         * 
         * <strong>example:</strong>
         * <p>owner</p>
         */
        @NameInMap("CertSubjectCommonName")
        public String certSubjectCommonName;

        /**
         * <p>The type of the certificate. Valid values: <strong>RSA</strong>, <strong>DSA</strong>, and <strong>ECDSA</strong>.</p>
         * 
         * <strong>example:</strong>
         * <p>RSA</p>
         */
        @NameInMap("CertType")
        public String certType;

        /**
         * <p>If a value is returned, the value matches the SSL certificate. Multiple domain names are separated by commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>example.com,aliyundoc.com</p>
         */
        @NameInMap("DomainList")
        public String domainList;

        /**
         * <p>The domain names (DNS fields) that match the SSL certificate. Multiple domain names are separated by commas (,).</p>
         * 
         * <strong>example:</strong>
         * <p>*.example.com,aliyundoc.com</p>
         */
        @NameInMap("DomainNames")
        public String domainNames;

        /**
         * <p>The certificate authority (CA) that issued the certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>C=US, O=Symantec Corporation, OU=Symantec Trust Network, OU=Domain Validated SSL, CN=Symantec Basic DV SSL CA - G1</p>
         */
        @NameInMap("Issuer")
        public String issuer;

        public static DescribeCdnDomainByCertificateResponseBodyCertInfosCertInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeCdnDomainByCertificateResponseBodyCertInfosCertInfo self = new DescribeCdnDomainByCertificateResponseBodyCertInfosCertInfo();
            return TeaModel.build(map, self);
        }

        public DescribeCdnDomainByCertificateResponseBodyCertInfosCertInfo setCertCaIsLegacy(String certCaIsLegacy) {
            this.certCaIsLegacy = certCaIsLegacy;
            return this;
        }
        public String getCertCaIsLegacy() {
            return this.certCaIsLegacy;
        }

        public DescribeCdnDomainByCertificateResponseBodyCertInfosCertInfo setCertExpireTime(String certExpireTime) {
            this.certExpireTime = certExpireTime;
            return this;
        }
        public String getCertExpireTime() {
            return this.certExpireTime;
        }

        public DescribeCdnDomainByCertificateResponseBodyCertInfosCertInfo setCertExpired(String certExpired) {
            this.certExpired = certExpired;
            return this;
        }
        public String getCertExpired() {
            return this.certExpired;
        }

        public DescribeCdnDomainByCertificateResponseBodyCertInfosCertInfo setCertStartTime(String certStartTime) {
            this.certStartTime = certStartTime;
            return this;
        }
        public String getCertStartTime() {
            return this.certStartTime;
        }

        public DescribeCdnDomainByCertificateResponseBodyCertInfosCertInfo setCertSubjectCommonName(String certSubjectCommonName) {
            this.certSubjectCommonName = certSubjectCommonName;
            return this;
        }
        public String getCertSubjectCommonName() {
            return this.certSubjectCommonName;
        }

        public DescribeCdnDomainByCertificateResponseBodyCertInfosCertInfo setCertType(String certType) {
            this.certType = certType;
            return this;
        }
        public String getCertType() {
            return this.certType;
        }

        public DescribeCdnDomainByCertificateResponseBodyCertInfosCertInfo setDomainList(String domainList) {
            this.domainList = domainList;
            return this;
        }
        public String getDomainList() {
            return this.domainList;
        }

        public DescribeCdnDomainByCertificateResponseBodyCertInfosCertInfo setDomainNames(String domainNames) {
            this.domainNames = domainNames;
            return this;
        }
        public String getDomainNames() {
            return this.domainNames;
        }

        public DescribeCdnDomainByCertificateResponseBodyCertInfosCertInfo setIssuer(String issuer) {
            this.issuer = issuer;
            return this;
        }
        public String getIssuer() {
            return this.issuer;
        }

    }

    public static class DescribeCdnDomainByCertificateResponseBodyCertInfos extends TeaModel {
        @NameInMap("CertInfo")
        public java.util.List<DescribeCdnDomainByCertificateResponseBodyCertInfosCertInfo> certInfo;

        public static DescribeCdnDomainByCertificateResponseBodyCertInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeCdnDomainByCertificateResponseBodyCertInfos self = new DescribeCdnDomainByCertificateResponseBodyCertInfos();
            return TeaModel.build(map, self);
        }

        public DescribeCdnDomainByCertificateResponseBodyCertInfos setCertInfo(java.util.List<DescribeCdnDomainByCertificateResponseBodyCertInfosCertInfo> certInfo) {
            this.certInfo = certInfo;
            return this;
        }
        public java.util.List<DescribeCdnDomainByCertificateResponseBodyCertInfosCertInfo> getCertInfo() {
            return this.certInfo;
        }

    }

}
