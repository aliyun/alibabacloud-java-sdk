// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnDomainByCertificateResponseBody extends TeaModel {
    /**
     * <p>The information about the certificate.</p>
     */
    @NameInMap("CertInfos")
    public DescribeDcdnDomainByCertificateResponseBodyCertInfos certInfos;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDcdnDomainByCertificateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnDomainByCertificateResponseBody self = new DescribeDcdnDomainByCertificateResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnDomainByCertificateResponseBody setCertInfos(DescribeDcdnDomainByCertificateResponseBodyCertInfos certInfos) {
        this.certInfos = certInfos;
        return this;
    }
    public DescribeDcdnDomainByCertificateResponseBodyCertInfos getCertInfos() {
        return this.certInfos;
    }

    public DescribeDcdnDomainByCertificateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDcdnDomainByCertificateResponseBodyCertInfosCertInfo extends TeaModel {
        /**
         * <p>Indicates whether the SSL certificate is obsolete. Valid values:</p>
         * <br>
         * <p>*   **yes**: The SSL certificate is obsolete.</p>
         * <p>*   **no**: The SSL certificate is working as expected.</p>
         */
        @NameInMap("CertCaIsLegacy")
        public String certCaIsLegacy;

        /**
         * <p>The time at which the certificate expires.</p>
         */
        @NameInMap("CertExpireTime")
        public String certExpireTime;

        /**
         * <p>Indicates whether the SSL certificate is expired. Valid values:</p>
         * <br>
         * <p>*   **yes**: The SSL certificate is expired.</p>
         * <p>*   **no**: The SSL certificate is not expired.</p>
         */
        @NameInMap("CertExpired")
        public String certExpired;

        /**
         * <p>The time at which the certificate became effective.</p>
         */
        @NameInMap("CertStartTime")
        public String certStartTime;

        /**
         * <p>The name of the SSL certificate owner.</p>
         */
        @NameInMap("CertSubjectCommonName")
        public String certSubjectCommonName;

        /**
         * <p>The type of the certificate. **RSA**, **DSA**, and **ECDSA**.</p>
         */
        @NameInMap("CertType")
        public String certType;

        /**
         * <p>The list of domain names that use the certificate.</p>
         * <br>
         * <p>If one or more domain names are returned, the domain names are matched with the specified certificate. Multiple domain names are separated with commas (,).</p>
         */
        @NameInMap("DomainList")
        public String domainList;

        /**
         * <p>The domain names (DNS fields) that match the certificate. Multiple domain names are separated with commas (,).</p>
         */
        @NameInMap("DomainNames")
        public String domainNames;

        /**
         * <p>The certificate authority (CA) that issued the certificate.</p>
         */
        @NameInMap("Issuer")
        public String issuer;

        public static DescribeDcdnDomainByCertificateResponseBodyCertInfosCertInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnDomainByCertificateResponseBodyCertInfosCertInfo self = new DescribeDcdnDomainByCertificateResponseBodyCertInfosCertInfo();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnDomainByCertificateResponseBodyCertInfosCertInfo setCertCaIsLegacy(String certCaIsLegacy) {
            this.certCaIsLegacy = certCaIsLegacy;
            return this;
        }
        public String getCertCaIsLegacy() {
            return this.certCaIsLegacy;
        }

        public DescribeDcdnDomainByCertificateResponseBodyCertInfosCertInfo setCertExpireTime(String certExpireTime) {
            this.certExpireTime = certExpireTime;
            return this;
        }
        public String getCertExpireTime() {
            return this.certExpireTime;
        }

        public DescribeDcdnDomainByCertificateResponseBodyCertInfosCertInfo setCertExpired(String certExpired) {
            this.certExpired = certExpired;
            return this;
        }
        public String getCertExpired() {
            return this.certExpired;
        }

        public DescribeDcdnDomainByCertificateResponseBodyCertInfosCertInfo setCertStartTime(String certStartTime) {
            this.certStartTime = certStartTime;
            return this;
        }
        public String getCertStartTime() {
            return this.certStartTime;
        }

        public DescribeDcdnDomainByCertificateResponseBodyCertInfosCertInfo setCertSubjectCommonName(String certSubjectCommonName) {
            this.certSubjectCommonName = certSubjectCommonName;
            return this;
        }
        public String getCertSubjectCommonName() {
            return this.certSubjectCommonName;
        }

        public DescribeDcdnDomainByCertificateResponseBodyCertInfosCertInfo setCertType(String certType) {
            this.certType = certType;
            return this;
        }
        public String getCertType() {
            return this.certType;
        }

        public DescribeDcdnDomainByCertificateResponseBodyCertInfosCertInfo setDomainList(String domainList) {
            this.domainList = domainList;
            return this;
        }
        public String getDomainList() {
            return this.domainList;
        }

        public DescribeDcdnDomainByCertificateResponseBodyCertInfosCertInfo setDomainNames(String domainNames) {
            this.domainNames = domainNames;
            return this;
        }
        public String getDomainNames() {
            return this.domainNames;
        }

        public DescribeDcdnDomainByCertificateResponseBodyCertInfosCertInfo setIssuer(String issuer) {
            this.issuer = issuer;
            return this;
        }
        public String getIssuer() {
            return this.issuer;
        }

    }

    public static class DescribeDcdnDomainByCertificateResponseBodyCertInfos extends TeaModel {
        @NameInMap("CertInfo")
        public java.util.List<DescribeDcdnDomainByCertificateResponseBodyCertInfosCertInfo> certInfo;

        public static DescribeDcdnDomainByCertificateResponseBodyCertInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnDomainByCertificateResponseBodyCertInfos self = new DescribeDcdnDomainByCertificateResponseBodyCertInfos();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnDomainByCertificateResponseBodyCertInfos setCertInfo(java.util.List<DescribeDcdnDomainByCertificateResponseBodyCertInfosCertInfo> certInfo) {
            this.certInfo = certInfo;
            return this;
        }
        public java.util.List<DescribeDcdnDomainByCertificateResponseBodyCertInfosCertInfo> getCertInfo() {
            return this.certInfo;
        }

    }

}
