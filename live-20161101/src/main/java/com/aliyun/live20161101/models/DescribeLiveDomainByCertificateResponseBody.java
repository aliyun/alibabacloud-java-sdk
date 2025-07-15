// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveDomainByCertificateResponseBody extends TeaModel {
    /**
     * <p>The information about the certificate.</p>
     */
    @NameInMap("CertInfos")
    public DescribeLiveDomainByCertificateResponseBodyCertInfos certInfos;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>ASAF2FDS-12SADSA-DDSAE3D-DSADCD4C-CDADS2D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeLiveDomainByCertificateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveDomainByCertificateResponseBody self = new DescribeLiveDomainByCertificateResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLiveDomainByCertificateResponseBody setCertInfos(DescribeLiveDomainByCertificateResponseBodyCertInfos certInfos) {
        this.certInfos = certInfos;
        return this;
    }
    public DescribeLiveDomainByCertificateResponseBodyCertInfos getCertInfos() {
        return this.certInfos;
    }

    public DescribeLiveDomainByCertificateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeLiveDomainByCertificateResponseBodyCertInfosCertInfo extends TeaModel {
        /**
         * <p>Indicates whether the SSL certificate is obsolete. Valid values:</p>
         * <ul>
         * <li><strong>yes</strong></li>
         * <li><strong>no</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>yes</p>
         */
        @NameInMap("CertCaIsLegacy")
        public String certCaIsLegacy;

        /**
         * <p>The time at which the certificate expires.</p>
         * 
         * <strong>example:</strong>
         * <p>Nov 29 00:00:00 2016 GMT</p>
         */
        @NameInMap("CertExpireTime")
        public String certExpireTime;

        /**
         * <p>Indicates whether the SSL certificate is expired. Valid values:</p>
         * <ul>
         * <li><strong>yes</strong></li>
         * <li><strong>no</strong></li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>yes</p>
         */
        @NameInMap("CertExpired")
        public String certExpired;

        /**
         * <p>The effective time of the certificate.</p>
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
         * <p>The list of domain names. If a value is returned, the value matches the SSL certificate. Multiple domain names are separated by commas (,).</p>
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
         * <p>The certificate authority (CA) that issued the SSL certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>C=US, O=Symantec Corporation, OU=Symantec Trust Network, OU=Domain Validated SSL, CN=Symantec Basic DV SSL CA - G1</p>
         */
        @NameInMap("Issuer")
        public String issuer;

        public static DescribeLiveDomainByCertificateResponseBodyCertInfosCertInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveDomainByCertificateResponseBodyCertInfosCertInfo self = new DescribeLiveDomainByCertificateResponseBodyCertInfosCertInfo();
            return TeaModel.build(map, self);
        }

        public DescribeLiveDomainByCertificateResponseBodyCertInfosCertInfo setCertCaIsLegacy(String certCaIsLegacy) {
            this.certCaIsLegacy = certCaIsLegacy;
            return this;
        }
        public String getCertCaIsLegacy() {
            return this.certCaIsLegacy;
        }

        public DescribeLiveDomainByCertificateResponseBodyCertInfosCertInfo setCertExpireTime(String certExpireTime) {
            this.certExpireTime = certExpireTime;
            return this;
        }
        public String getCertExpireTime() {
            return this.certExpireTime;
        }

        public DescribeLiveDomainByCertificateResponseBodyCertInfosCertInfo setCertExpired(String certExpired) {
            this.certExpired = certExpired;
            return this;
        }
        public String getCertExpired() {
            return this.certExpired;
        }

        public DescribeLiveDomainByCertificateResponseBodyCertInfosCertInfo setCertStartTime(String certStartTime) {
            this.certStartTime = certStartTime;
            return this;
        }
        public String getCertStartTime() {
            return this.certStartTime;
        }

        public DescribeLiveDomainByCertificateResponseBodyCertInfosCertInfo setCertSubjectCommonName(String certSubjectCommonName) {
            this.certSubjectCommonName = certSubjectCommonName;
            return this;
        }
        public String getCertSubjectCommonName() {
            return this.certSubjectCommonName;
        }

        public DescribeLiveDomainByCertificateResponseBodyCertInfosCertInfo setCertType(String certType) {
            this.certType = certType;
            return this;
        }
        public String getCertType() {
            return this.certType;
        }

        public DescribeLiveDomainByCertificateResponseBodyCertInfosCertInfo setDomainList(String domainList) {
            this.domainList = domainList;
            return this;
        }
        public String getDomainList() {
            return this.domainList;
        }

        public DescribeLiveDomainByCertificateResponseBodyCertInfosCertInfo setDomainNames(String domainNames) {
            this.domainNames = domainNames;
            return this;
        }
        public String getDomainNames() {
            return this.domainNames;
        }

        public DescribeLiveDomainByCertificateResponseBodyCertInfosCertInfo setIssuer(String issuer) {
            this.issuer = issuer;
            return this;
        }
        public String getIssuer() {
            return this.issuer;
        }

    }

    public static class DescribeLiveDomainByCertificateResponseBodyCertInfos extends TeaModel {
        @NameInMap("CertInfo")
        public java.util.List<DescribeLiveDomainByCertificateResponseBodyCertInfosCertInfo> certInfo;

        public static DescribeLiveDomainByCertificateResponseBodyCertInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveDomainByCertificateResponseBodyCertInfos self = new DescribeLiveDomainByCertificateResponseBodyCertInfos();
            return TeaModel.build(map, self);
        }

        public DescribeLiveDomainByCertificateResponseBodyCertInfos setCertInfo(java.util.List<DescribeLiveDomainByCertificateResponseBodyCertInfosCertInfo> certInfo) {
            this.certInfo = certInfo;
            return this;
        }
        public java.util.List<DescribeLiveDomainByCertificateResponseBodyCertInfosCertInfo> getCertInfo() {
            return this.certInfo;
        }

    }

}
