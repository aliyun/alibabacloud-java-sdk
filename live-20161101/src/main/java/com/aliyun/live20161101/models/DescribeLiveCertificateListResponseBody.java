// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveCertificateListResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("CertificateListModel")
    public DescribeLiveCertificateListResponseBodyCertificateListModel certificateListModel;

    public static DescribeLiveCertificateListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveCertificateListResponseBody self = new DescribeLiveCertificateListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLiveCertificateListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeLiveCertificateListResponseBody setCertificateListModel(DescribeLiveCertificateListResponseBodyCertificateListModel certificateListModel) {
        this.certificateListModel = certificateListModel;
        return this;
    }
    public DescribeLiveCertificateListResponseBodyCertificateListModel getCertificateListModel() {
        return this.certificateListModel;
    }

    public static class DescribeLiveCertificateListResponseBodyCertificateListModelCertListCert extends TeaModel {
        @NameInMap("LastTime")
        public Long lastTime;

        @NameInMap("Fingerprint")
        public String fingerprint;

        @NameInMap("CertName")
        public String certName;

        @NameInMap("Issuer")
        public String issuer;

        @NameInMap("CertId")
        public Long certId;

        @NameInMap("Common")
        public String common;

        public static DescribeLiveCertificateListResponseBodyCertificateListModelCertListCert build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveCertificateListResponseBodyCertificateListModelCertListCert self = new DescribeLiveCertificateListResponseBodyCertificateListModelCertListCert();
            return TeaModel.build(map, self);
        }

        public DescribeLiveCertificateListResponseBodyCertificateListModelCertListCert setLastTime(Long lastTime) {
            this.lastTime = lastTime;
            return this;
        }
        public Long getLastTime() {
            return this.lastTime;
        }

        public DescribeLiveCertificateListResponseBodyCertificateListModelCertListCert setFingerprint(String fingerprint) {
            this.fingerprint = fingerprint;
            return this;
        }
        public String getFingerprint() {
            return this.fingerprint;
        }

        public DescribeLiveCertificateListResponseBodyCertificateListModelCertListCert setCertName(String certName) {
            this.certName = certName;
            return this;
        }
        public String getCertName() {
            return this.certName;
        }

        public DescribeLiveCertificateListResponseBodyCertificateListModelCertListCert setIssuer(String issuer) {
            this.issuer = issuer;
            return this;
        }
        public String getIssuer() {
            return this.issuer;
        }

        public DescribeLiveCertificateListResponseBodyCertificateListModelCertListCert setCertId(Long certId) {
            this.certId = certId;
            return this;
        }
        public Long getCertId() {
            return this.certId;
        }

        public DescribeLiveCertificateListResponseBodyCertificateListModelCertListCert setCommon(String common) {
            this.common = common;
            return this;
        }
        public String getCommon() {
            return this.common;
        }

    }

    public static class DescribeLiveCertificateListResponseBodyCertificateListModelCertList extends TeaModel {
        @NameInMap("Cert")
        public java.util.List<DescribeLiveCertificateListResponseBodyCertificateListModelCertListCert> cert;

        public static DescribeLiveCertificateListResponseBodyCertificateListModelCertList build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveCertificateListResponseBodyCertificateListModelCertList self = new DescribeLiveCertificateListResponseBodyCertificateListModelCertList();
            return TeaModel.build(map, self);
        }

        public DescribeLiveCertificateListResponseBodyCertificateListModelCertList setCert(java.util.List<DescribeLiveCertificateListResponseBodyCertificateListModelCertListCert> cert) {
            this.cert = cert;
            return this;
        }
        public java.util.List<DescribeLiveCertificateListResponseBodyCertificateListModelCertListCert> getCert() {
            return this.cert;
        }

    }

    public static class DescribeLiveCertificateListResponseBodyCertificateListModel extends TeaModel {
        @NameInMap("CertList")
        public DescribeLiveCertificateListResponseBodyCertificateListModelCertList certList;

        @NameInMap("Count")
        public Integer count;

        public static DescribeLiveCertificateListResponseBodyCertificateListModel build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveCertificateListResponseBodyCertificateListModel self = new DescribeLiveCertificateListResponseBodyCertificateListModel();
            return TeaModel.build(map, self);
        }

        public DescribeLiveCertificateListResponseBodyCertificateListModel setCertList(DescribeLiveCertificateListResponseBodyCertificateListModelCertList certList) {
            this.certList = certList;
            return this;
        }
        public DescribeLiveCertificateListResponseBodyCertificateListModelCertList getCertList() {
            return this.certList;
        }

        public DescribeLiveCertificateListResponseBodyCertificateListModel setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

    }

}
