// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeDomainCertificateInfoResponseBody extends TeaModel {
    @NameInMap("CertInfos")
    public DescribeDomainCertificateInfoResponseBodyCertInfos certInfos;

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
        @NameInMap("Status")
        public String status;

        @NameInMap("CertLife")
        public String certLife;

        @NameInMap("CertExpireTime")
        public String certExpireTime;

        @NameInMap("CertUpdateTime")
        public String certUpdateTime;

        @NameInMap("ServerCertificateStatus")
        public String serverCertificateStatus;

        @NameInMap("CertDomainName")
        public String certDomainName;

        @NameInMap("CertOrg")
        public String certOrg;

        @NameInMap("DomainName")
        public String domainName;

        @NameInMap("CertStartTime")
        public String certStartTime;

        @NameInMap("CertType")
        public String certType;

        @NameInMap("CertName")
        public String certName;

        @NameInMap("DomainCnameStatus")
        public String domainCnameStatus;

        @NameInMap("ServerCertificate")
        public String serverCertificate;

        public static DescribeDomainCertificateInfoResponseBodyCertInfosCertInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeDomainCertificateInfoResponseBodyCertInfosCertInfo self = new DescribeDomainCertificateInfoResponseBodyCertInfosCertInfo();
            return TeaModel.build(map, self);
        }

        public DescribeDomainCertificateInfoResponseBodyCertInfosCertInfo setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public DescribeDomainCertificateInfoResponseBodyCertInfosCertInfo setCertLife(String certLife) {
            this.certLife = certLife;
            return this;
        }
        public String getCertLife() {
            return this.certLife;
        }

        public DescribeDomainCertificateInfoResponseBodyCertInfosCertInfo setCertExpireTime(String certExpireTime) {
            this.certExpireTime = certExpireTime;
            return this;
        }
        public String getCertExpireTime() {
            return this.certExpireTime;
        }

        public DescribeDomainCertificateInfoResponseBodyCertInfosCertInfo setCertUpdateTime(String certUpdateTime) {
            this.certUpdateTime = certUpdateTime;
            return this;
        }
        public String getCertUpdateTime() {
            return this.certUpdateTime;
        }

        public DescribeDomainCertificateInfoResponseBodyCertInfosCertInfo setServerCertificateStatus(String serverCertificateStatus) {
            this.serverCertificateStatus = serverCertificateStatus;
            return this;
        }
        public String getServerCertificateStatus() {
            return this.serverCertificateStatus;
        }

        public DescribeDomainCertificateInfoResponseBodyCertInfosCertInfo setCertDomainName(String certDomainName) {
            this.certDomainName = certDomainName;
            return this;
        }
        public String getCertDomainName() {
            return this.certDomainName;
        }

        public DescribeDomainCertificateInfoResponseBodyCertInfosCertInfo setCertOrg(String certOrg) {
            this.certOrg = certOrg;
            return this;
        }
        public String getCertOrg() {
            return this.certOrg;
        }

        public DescribeDomainCertificateInfoResponseBodyCertInfosCertInfo setDomainName(String domainName) {
            this.domainName = domainName;
            return this;
        }
        public String getDomainName() {
            return this.domainName;
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

        public DescribeDomainCertificateInfoResponseBodyCertInfosCertInfo setCertName(String certName) {
            this.certName = certName;
            return this;
        }
        public String getCertName() {
            return this.certName;
        }

        public DescribeDomainCertificateInfoResponseBodyCertInfosCertInfo setDomainCnameStatus(String domainCnameStatus) {
            this.domainCnameStatus = domainCnameStatus;
            return this;
        }
        public String getDomainCnameStatus() {
            return this.domainCnameStatus;
        }

        public DescribeDomainCertificateInfoResponseBodyCertInfosCertInfo setServerCertificate(String serverCertificate) {
            this.serverCertificate = serverCertificate;
            return this;
        }
        public String getServerCertificate() {
            return this.serverCertificate;
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
