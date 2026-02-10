// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.live20161101.models;

import com.aliyun.tea.*;

public class DescribeLiveCertificateListResponseBody extends TeaModel {
    /**
     * <p>The details.</p>
     */
    @NameInMap("CertificateListModel")
    public DescribeLiveCertificateListResponseBodyCertificateListModel certificateListModel;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>16A96B9A-F203-4EC5-8E43-CB92E68F4CD8</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeLiveCertificateListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeLiveCertificateListResponseBody self = new DescribeLiveCertificateListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeLiveCertificateListResponseBody setCertificateListModel(DescribeLiveCertificateListResponseBodyCertificateListModel certificateListModel) {
        this.certificateListModel = certificateListModel;
        return this;
    }
    public DescribeLiveCertificateListResponseBodyCertificateListModel getCertificateListModel() {
        return this.certificateListModel;
    }

    public DescribeLiveCertificateListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeLiveCertificateListResponseBodyCertificateListModelCertListCert extends TeaModel {
        @NameInMap("CertId")
        public Long certId;

        @NameInMap("CertName")
        public String certName;

        @NameInMap("Common")
        public String common;

        @NameInMap("Fingerprint")
        public String fingerprint;

        @NameInMap("Issuer")
        public String issuer;

        @NameInMap("LastTime")
        public Long lastTime;

        public static DescribeLiveCertificateListResponseBodyCertificateListModelCertListCert build(java.util.Map<String, ?> map) throws Exception {
            DescribeLiveCertificateListResponseBodyCertificateListModelCertListCert self = new DescribeLiveCertificateListResponseBodyCertificateListModelCertListCert();
            return TeaModel.build(map, self);
        }

        public DescribeLiveCertificateListResponseBodyCertificateListModelCertListCert setCertId(Long certId) {
            this.certId = certId;
            return this;
        }
        public Long getCertId() {
            return this.certId;
        }

        public DescribeLiveCertificateListResponseBodyCertificateListModelCertListCert setCertName(String certName) {
            this.certName = certName;
            return this;
        }
        public String getCertName() {
            return this.certName;
        }

        public DescribeLiveCertificateListResponseBodyCertificateListModelCertListCert setCommon(String common) {
            this.common = common;
            return this;
        }
        public String getCommon() {
            return this.common;
        }

        public DescribeLiveCertificateListResponseBodyCertificateListModelCertListCert setFingerprint(String fingerprint) {
            this.fingerprint = fingerprint;
            return this;
        }
        public String getFingerprint() {
            return this.fingerprint;
        }

        public DescribeLiveCertificateListResponseBodyCertificateListModelCertListCert setIssuer(String issuer) {
            this.issuer = issuer;
            return this;
        }
        public String getIssuer() {
            return this.issuer;
        }

        public DescribeLiveCertificateListResponseBodyCertificateListModelCertListCert setLastTime(Long lastTime) {
            this.lastTime = lastTime;
            return this;
        }
        public Long getLastTime() {
            return this.lastTime;
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

        /**
         * <p>The number of certificates.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
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
