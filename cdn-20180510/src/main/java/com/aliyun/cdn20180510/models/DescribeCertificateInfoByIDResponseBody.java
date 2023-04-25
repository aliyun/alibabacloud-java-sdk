// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeCertificateInfoByIDResponseBody extends TeaModel {
    /**
     * <p>The information about the certificate.</p>
     */
    @NameInMap("CertInfos")
    public DescribeCertificateInfoByIDResponseBodyCertInfos certInfos;

    /**
     * <p>The ID of the request.</p>
     */
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
        /**
         * <p>The time at which the certificate expires.</p>
         */
        @NameInMap("CertExpireTime")
        public String certExpireTime;

        /**
         * <p>The ID of the certificate.</p>
         */
        @NameInMap("CertId")
        public String certId;

        /**
         * <p>The name of the certificate.</p>
         */
        @NameInMap("CertName")
        public String certName;

        /**
         * <p>The type of the certificate.</p>
         * <br>
         * <p>*   free: a free certificate</p>
         * <p>*   cas: a certificate purchased by using Certificate Management Service</p>
         * <p>*   upload: a user-uploaded certificate</p>
         */
        @NameInMap("CertType")
        public String certType;

        /**
         * <p>The time when the certificate became effective.</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The domain names that use the certificate.</p>
         */
        @NameInMap("DomainList")
        public String domainList;

        /**
         * <p>The content of the certificate.</p>
         */
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
