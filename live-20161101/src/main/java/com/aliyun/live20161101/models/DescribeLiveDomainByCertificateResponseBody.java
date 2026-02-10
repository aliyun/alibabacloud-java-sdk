// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveDomainByCertificateResponseBody extends TeaModel {
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
        @NameInMap("CertCaIsLegacy")
        public String certCaIsLegacy;

        @NameInMap("CertExpireTime")
        public String certExpireTime;

        @NameInMap("CertExpired")
        public String certExpired;

        @NameInMap("CertStartTime")
        public String certStartTime;

        @NameInMap("CertSubjectCommonName")
        public String certSubjectCommonName;

        @NameInMap("CertType")
        public String certType;

        @NameInMap("DomainList")
        public String domainList;

        @NameInMap("DomainNames")
        public String domainNames;

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
