// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveCertificateListResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("CertificateListModel")
    @Validation(required = true)
    public DescribeLiveCertificateListResponseCertificateListModel certificateListModel;

    public static DescribeLiveCertificateListResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveCertificateListResponse self = new DescribeLiveCertificateListResponse();
        return TeaModel.build(map, self);
    }

    public DescribeLiveCertificateListResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLiveCertificateListResponse setCertificateListModel(DescribeLiveCertificateListResponseCertificateListModel certificateListModel) {
        this.certificateListModel = certificateListModel;
        return this;
    }
    public DescribeLiveCertificateListResponseCertificateListModel getCertificateListModel() {
        return this.certificateListModel;
    }

    public static class DescribeLiveCertificateListResponseCertificateListModelCertListCert extends TeaModel {
        @NameInMap("CertName")
        @Validation(required = true)
        public String certName;

        @NameInMap("CertId")
        @Validation(required = true)
        public Long certId;

        @NameInMap("Fingerprint")
        @Validation(required = true)
        public String fingerprint;

        @NameInMap("Common")
        @Validation(required = true)
        public String common;

        @NameInMap("Issuer")
        @Validation(required = true)
        public String issuer;

        @NameInMap("LastTime")
        @Validation(required = true)
        public Long lastTime;

        public static DescribeLiveCertificateListResponseCertificateListModelCertListCert build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveCertificateListResponseCertificateListModelCertListCert self = new DescribeLiveCertificateListResponseCertificateListModelCertListCert();
            return TeaModel.build(map, self);
        }

        public DescribeLiveCertificateListResponseCertificateListModelCertListCert setCertName(String certName) {
            this.certName = certName;
            return this;
        }
        public String getCertName() {
            return this.certName;
        }

        public DescribeLiveCertificateListResponseCertificateListModelCertListCert setCertId(Long certId) {
            this.certId = certId;
            return this;
        }
        public Long getCertId() {
            return this.certId;
        }

        public DescribeLiveCertificateListResponseCertificateListModelCertListCert setFingerprint(String fingerprint) {
            this.fingerprint = fingerprint;
            return this;
        }
        public String getFingerprint() {
            return this.fingerprint;
        }

        public DescribeLiveCertificateListResponseCertificateListModelCertListCert setCommon(String common) {
            this.common = common;
            return this;
        }
        public String getCommon() {
            return this.common;
        }

        public DescribeLiveCertificateListResponseCertificateListModelCertListCert setIssuer(String issuer) {
            this.issuer = issuer;
            return this;
        }
        public String getIssuer() {
            return this.issuer;
        }

        public DescribeLiveCertificateListResponseCertificateListModelCertListCert setLastTime(Long lastTime) {
            this.lastTime = lastTime;
            return this;
        }
        public Long getLastTime() {
            return this.lastTime;
        }

    }

    public static class DescribeLiveCertificateListResponseCertificateListModelCertList extends TeaModel {
        @NameInMap("Cert")
        @Validation(required = true)
        public java.util.List<DescribeLiveCertificateListResponseCertificateListModelCertListCert> cert;

        public static DescribeLiveCertificateListResponseCertificateListModelCertList build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveCertificateListResponseCertificateListModelCertList self = new DescribeLiveCertificateListResponseCertificateListModelCertList();
            return TeaModel.build(map, self);
        }

        public DescribeLiveCertificateListResponseCertificateListModelCertList setCert(java.util.List<DescribeLiveCertificateListResponseCertificateListModelCertListCert> cert) {
            this.cert = cert;
            return this;
        }
        public java.util.List<DescribeLiveCertificateListResponseCertificateListModelCertListCert> getCert() {
            return this.cert;
        }

    }

    public static class DescribeLiveCertificateListResponseCertificateListModel extends TeaModel {
        @NameInMap("Count")
        @Validation(required = true)
        public Integer count;

        @NameInMap("CertList")
        @Validation(required = true)
        public DescribeLiveCertificateListResponseCertificateListModelCertList certList;

        public static DescribeLiveCertificateListResponseCertificateListModel build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveCertificateListResponseCertificateListModel self = new DescribeLiveCertificateListResponseCertificateListModel();
            return TeaModel.build(map, self);
        }

        public DescribeLiveCertificateListResponseCertificateListModel setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public DescribeLiveCertificateListResponseCertificateListModel setCertList(DescribeLiveCertificateListResponseCertificateListModelCertList certList) {
            this.certList = certList;
            return this;
        }
        public DescribeLiveCertificateListResponseCertificateListModelCertList getCertList() {
            return this.certList;
        }

    }

}
