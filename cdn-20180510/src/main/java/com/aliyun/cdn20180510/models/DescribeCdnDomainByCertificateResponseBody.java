// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeCdnDomainByCertificateResponseBody extends TeaModel {
    @NameInMap("CertInfos")
    public DescribeCdnDomainByCertificateResponseBodyCertInfos certInfos;

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
        @NameInMap("CertStartTime")
        public String certStartTime;

        @NameInMap("CertExpireTime")
        public String certExpireTime;

        @NameInMap("CertCaIsLegacy")
        public String certCaIsLegacy;

        @NameInMap("CertSubjectCommonName")
        public String certSubjectCommonName;

        @NameInMap("CertType")
        public String certType;

        @NameInMap("DomainNames")
        public String domainNames;

        @NameInMap("CertExpired")
        public String certExpired;

        @NameInMap("Issuer")
        public String issuer;

        @NameInMap("DomainList")
        public String domainList;

        public static DescribeCdnDomainByCertificateResponseBodyCertInfosCertInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeCdnDomainByCertificateResponseBodyCertInfosCertInfo self = new DescribeCdnDomainByCertificateResponseBodyCertInfosCertInfo();
            return TeaModel.build(map, self);
        }

        public DescribeCdnDomainByCertificateResponseBodyCertInfosCertInfo setCertStartTime(String certStartTime) {
            this.certStartTime = certStartTime;
            return this;
        }
        public String getCertStartTime() {
            return this.certStartTime;
        }

        public DescribeCdnDomainByCertificateResponseBodyCertInfosCertInfo setCertExpireTime(String certExpireTime) {
            this.certExpireTime = certExpireTime;
            return this;
        }
        public String getCertExpireTime() {
            return this.certExpireTime;
        }

        public DescribeCdnDomainByCertificateResponseBodyCertInfosCertInfo setCertCaIsLegacy(String certCaIsLegacy) {
            this.certCaIsLegacy = certCaIsLegacy;
            return this;
        }
        public String getCertCaIsLegacy() {
            return this.certCaIsLegacy;
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

        public DescribeCdnDomainByCertificateResponseBodyCertInfosCertInfo setDomainNames(String domainNames) {
            this.domainNames = domainNames;
            return this;
        }
        public String getDomainNames() {
            return this.domainNames;
        }

        public DescribeCdnDomainByCertificateResponseBodyCertInfosCertInfo setCertExpired(String certExpired) {
            this.certExpired = certExpired;
            return this;
        }
        public String getCertExpired() {
            return this.certExpired;
        }

        public DescribeCdnDomainByCertificateResponseBodyCertInfosCertInfo setIssuer(String issuer) {
            this.issuer = issuer;
            return this;
        }
        public String getIssuer() {
            return this.issuer;
        }

        public DescribeCdnDomainByCertificateResponseBodyCertInfosCertInfo setDomainList(String domainList) {
            this.domainList = domainList;
            return this;
        }
        public String getDomainList() {
            return this.domainList;
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
