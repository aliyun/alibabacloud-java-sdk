// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeCertificateInfoByIDResponseBody extends TeaModel {
    @NameInMap("CertInfos")
    public DescribeCertificateInfoByIDResponseBodyCertInfos certInfos;

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
        @NameInMap("CertExpireTime")
        public String certExpireTime;

        @NameInMap("CreateTime")
        public String createTime;

        @NameInMap("CertType")
        public String certType;

        @NameInMap("CertName")
        public String certName;

        @NameInMap("CertId")
        public String certId;

        @NameInMap("DomainList")
        public String domainList;

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

        public DescribeCertificateInfoByIDResponseBodyCertInfosCertInfo setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public DescribeCertificateInfoByIDResponseBodyCertInfosCertInfo setCertType(String certType) {
            this.certType = certType;
            return this;
        }
        public String getCertType() {
            return this.certType;
        }

        public DescribeCertificateInfoByIDResponseBodyCertInfosCertInfo setCertName(String certName) {
            this.certName = certName;
            return this;
        }
        public String getCertName() {
            return this.certName;
        }

        public DescribeCertificateInfoByIDResponseBodyCertInfosCertInfo setCertId(String certId) {
            this.certId = certId;
            return this;
        }
        public String getCertId() {
            return this.certId;
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
