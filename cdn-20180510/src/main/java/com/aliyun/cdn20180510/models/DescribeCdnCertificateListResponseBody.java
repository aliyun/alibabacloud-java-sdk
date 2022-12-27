// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeCdnCertificateListResponseBody extends TeaModel {
    // The data type of the SSL certificate information.
    @NameInMap("CertificateListModel")
    public DescribeCdnCertificateListResponseBodyCertificateListModel certificateListModel;

    // The ID of the request.
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeCdnCertificateListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCdnCertificateListResponseBody self = new DescribeCdnCertificateListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCdnCertificateListResponseBody setCertificateListModel(DescribeCdnCertificateListResponseBodyCertificateListModel certificateListModel) {
        this.certificateListModel = certificateListModel;
        return this;
    }
    public DescribeCdnCertificateListResponseBodyCertificateListModel getCertificateListModel() {
        return this.certificateListModel;
    }

    public DescribeCdnCertificateListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeCdnCertificateListResponseBodyCertificateListModelCertListCert extends TeaModel {
        // The ID of the SSL certificate.
        @NameInMap("CertId")
        public Long certId;

        // The name of the SSL certificate.
        @NameInMap("CertName")
        public String certName;

        // The Common Name (CN) attribute of the SSL certificate. In most cases, the value is a domain name.
        @NameInMap("Common")
        public String common;

        // The fingerprint of the SSL certificate.
        @NameInMap("Fingerprint")
        public String fingerprint;

        // The certificate authority (CA) that issued the SSL certificate.
        @NameInMap("Issuer")
        public String issuer;

        // The timestamp when the SSL certificate was issued.
        @NameInMap("LastTime")
        public Long lastTime;

        public static DescribeCdnCertificateListResponseBodyCertificateListModelCertListCert build(java.util.Map<String, ?> map) throws Exception {
            DescribeCdnCertificateListResponseBodyCertificateListModelCertListCert self = new DescribeCdnCertificateListResponseBodyCertificateListModelCertListCert();
            return TeaModel.build(map, self);
        }

        public DescribeCdnCertificateListResponseBodyCertificateListModelCertListCert setCertId(Long certId) {
            this.certId = certId;
            return this;
        }
        public Long getCertId() {
            return this.certId;
        }

        public DescribeCdnCertificateListResponseBodyCertificateListModelCertListCert setCertName(String certName) {
            this.certName = certName;
            return this;
        }
        public String getCertName() {
            return this.certName;
        }

        public DescribeCdnCertificateListResponseBodyCertificateListModelCertListCert setCommon(String common) {
            this.common = common;
            return this;
        }
        public String getCommon() {
            return this.common;
        }

        public DescribeCdnCertificateListResponseBodyCertificateListModelCertListCert setFingerprint(String fingerprint) {
            this.fingerprint = fingerprint;
            return this;
        }
        public String getFingerprint() {
            return this.fingerprint;
        }

        public DescribeCdnCertificateListResponseBodyCertificateListModelCertListCert setIssuer(String issuer) {
            this.issuer = issuer;
            return this;
        }
        public String getIssuer() {
            return this.issuer;
        }

        public DescribeCdnCertificateListResponseBodyCertificateListModelCertListCert setLastTime(Long lastTime) {
            this.lastTime = lastTime;
            return this;
        }
        public Long getLastTime() {
            return this.lastTime;
        }

    }

    public static class DescribeCdnCertificateListResponseBodyCertificateListModelCertList extends TeaModel {
        @NameInMap("Cert")
        public java.util.List<DescribeCdnCertificateListResponseBodyCertificateListModelCertListCert> cert;

        public static DescribeCdnCertificateListResponseBodyCertificateListModelCertList build(java.util.Map<String, ?> map) throws Exception {
            DescribeCdnCertificateListResponseBodyCertificateListModelCertList self = new DescribeCdnCertificateListResponseBodyCertificateListModelCertList();
            return TeaModel.build(map, self);
        }

        public DescribeCdnCertificateListResponseBodyCertificateListModelCertList setCert(java.util.List<DescribeCdnCertificateListResponseBodyCertificateListModelCertListCert> cert) {
            this.cert = cert;
            return this;
        }
        public java.util.List<DescribeCdnCertificateListResponseBodyCertificateListModelCertListCert> getCert() {
            return this.cert;
        }

    }

    public static class DescribeCdnCertificateListResponseBodyCertificateListModel extends TeaModel {
        // The details about each SSL certificate.
        @NameInMap("CertList")
        public DescribeCdnCertificateListResponseBodyCertificateListModelCertList certList;

        // The number of SSL certificates returned.
        @NameInMap("Count")
        public Integer count;

        public static DescribeCdnCertificateListResponseBodyCertificateListModel build(java.util.Map<String, ?> map) throws Exception {
            DescribeCdnCertificateListResponseBodyCertificateListModel self = new DescribeCdnCertificateListResponseBodyCertificateListModel();
            return TeaModel.build(map, self);
        }

        public DescribeCdnCertificateListResponseBodyCertificateListModel setCertList(DescribeCdnCertificateListResponseBodyCertificateListModelCertList certList) {
            this.certList = certList;
            return this;
        }
        public DescribeCdnCertificateListResponseBodyCertificateListModelCertList getCertList() {
            return this.certList;
        }

        public DescribeCdnCertificateListResponseBodyCertificateListModel setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

    }

}
