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
     * 
     * <strong>example:</strong>
     * <p>5C1E43DC-9E51-4771-82C0-7D5ECEB547A1</p>
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
         * 
         * <strong>example:</strong>
         * <p>2098-02-08 08:02:07 +0000 UTC</p>
         */
        @NameInMap("CertExpireTime")
        public String certExpireTime;

        /**
         * <p>The ID of the certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>1644xx</p>
         */
        @NameInMap("CertId")
        public String certId;

        /**
         * <p>The name of the certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>example_cert</p>
         */
        @NameInMap("CertName")
        public String certName;

        /**
         * <p>The type of the certificate.</p>
         * <ul>
         * <li>free: a free certificate</li>
         * <li>cas: a certificate purchased by using Certificate Management Service</li>
         * <li>upload: a user-uploaded certificate</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>cas</p>
         */
        @NameInMap("CertType")
        public String certType;

        /**
         * <p>The time when the certificate became effective.</p>
         * 
         * <strong>example:</strong>
         * <p>2015-12-21 08:02:07 +0000 UTC</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The domain names that use the certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;example.com&quot;]</p>
         */
        @NameInMap("DomainList")
        public String domainList;

        /**
         * <p>The content of the certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>-----BEGIN CERTIFICATE-----\nxxx-----END CERTIFICATE-----\n</p>
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
