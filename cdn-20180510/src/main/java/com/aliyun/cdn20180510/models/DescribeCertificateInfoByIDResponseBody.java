// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeCertificateInfoByIDResponseBody extends TeaModel {
    // The information about the certificate.
    @NameInMap("CertInfos")
    public DescribeCertificateInfoByIDResponseBodyCertInfos certInfos;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeCertificateInfoByIDResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCertificateInfoByIDResponseBody self = new DescribeCertificateInfoByIDResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCertificateInfoByIDResponseBody setCertInfos(DescribeCertificateInfoByIDResponseBodyCertInfos certInfos) {
        this.certInfos = certInfos;
        return this;
    }
    public DescribeCertificateInfoByIDResponseBodyCertInfos getCertInfos() {
        return this.certInfos;
    }

    public DescribeCertificateInfoByIDResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeCertificateInfoByIDResponseBodyCertInfosCertInfo extends TeaModel {
        // The expiration time of the certificate.
        @NameInMap("CertExpireTime")
        public String certExpireTime;

        // The ID of the certificate.
        @NameInMap("CertId")
        public String certId;

        // The name of the certificate.
        @NameInMap("CertName")
        public String certName;

        // The type of the certificate.
        // 
        // *   free: a free certificate.
        // *   cas: a certificate purchased by using Certificate Management Service.
        // *   upload: a user-uploaded certificate.
        @NameInMap("CertType")
        public String certType;

        // The time when the certificate became effective.
        @NameInMap("CreateTime")
        public String createTime;

        // A list of domain names that use the certificate.
        @NameInMap("DomainList")
        public String domainList;

        // The content of the certificate.
        @NameInMap("HttpsCrt")
        public String httpsCrt;

        public static DescribeCertificateInfoByIDResponseBodyCertInfosCertInfo build(java.util.Map<String, ?> map) throws Exception {
            DescribeCertificateInfoByIDResponseBodyCertInfosCertInfo self = new DescribeCertificateInfoByIDResponseBodyCertInfosCertInfo();
            return TeaModel.build(map, self);
        }

        public DescribeCertificateInfoByIDResponseBodyCertInfosCertInfo setCertExpireTime(String certExpireTime) {
            this.certExpireTime = certExpireTime;
            return this;
        }
        public String getCertExpireTime() {
            return this.certExpireTime;
        }

        public DescribeCertificateInfoByIDResponseBodyCertInfosCertInfo setCertId(String certId) {
            this.certId = certId;
            return this;
        }
        public String getCertId() {
            return this.certId;
        }

        public DescribeCertificateInfoByIDResponseBodyCertInfosCertInfo setCertName(String certName) {
            this.certName = certName;
            return this;
        }
        public String getCertName() {
            return this.certName;
        }

        public DescribeCertificateInfoByIDResponseBodyCertInfosCertInfo setCertType(String certType) {
            this.certType = certType;
            return this;
        }
        public String getCertType() {
            return this.certType;
        }

        public DescribeCertificateInfoByIDResponseBodyCertInfosCertInfo setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeCertificateInfoByIDResponseBodyCertInfosCertInfo setDomainList(String domainList) {
            this.domainList = domainList;
            return this;
        }
        public String getDomainList() {
            return this.domainList;
        }

        public DescribeCertificateInfoByIDResponseBodyCertInfosCertInfo setHttpsCrt(String httpsCrt) {
            this.httpsCrt = httpsCrt;
            return this;
        }
        public String getHttpsCrt() {
            return this.httpsCrt;
        }

    }

    public static class DescribeCertificateInfoByIDResponseBodyCertInfos extends TeaModel {
        @NameInMap("CertInfo")
        public java.util.List<DescribeCertificateInfoByIDResponseBodyCertInfosCertInfo> certInfo;

        public static DescribeCertificateInfoByIDResponseBodyCertInfos build(java.util.Map<String, ?> map) throws Exception {
            DescribeCertificateInfoByIDResponseBodyCertInfos self = new DescribeCertificateInfoByIDResponseBodyCertInfos();
            return TeaModel.build(map, self);
        }

        public DescribeCertificateInfoByIDResponseBodyCertInfos setCertInfo(java.util.List<DescribeCertificateInfoByIDResponseBodyCertInfosCertInfo> certInfo) {
            this.certInfo = certInfo;
            return this;
        }
        public java.util.List<DescribeCertificateInfoByIDResponseBodyCertInfosCertInfo> getCertInfo() {
            return this.certInfo;
        }

    }

}
