// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnCertificateListResponseBody extends TeaModel {
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("CertificateListModel")
    public DescribeDcdnCertificateListResponseBodyCertificateListModel certificateListModel;

    public static DescribeDcdnCertificateListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnCertificateListResponseBody self = new DescribeDcdnCertificateListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnCertificateListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDcdnCertificateListResponseBody setCertificateListModel(DescribeDcdnCertificateListResponseBodyCertificateListModel certificateListModel) {
        this.certificateListModel = certificateListModel;
        return this;
    }
    public DescribeDcdnCertificateListResponseBodyCertificateListModel getCertificateListModel() {
        return this.certificateListModel;
    }

    public static class DescribeDcdnCertificateListResponseBodyCertificateListModelCertListCert extends TeaModel {
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

        public static DescribeDcdnCertificateListResponseBodyCertificateListModelCertListCert build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnCertificateListResponseBodyCertificateListModelCertListCert self = new DescribeDcdnCertificateListResponseBodyCertificateListModelCertListCert();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnCertificateListResponseBodyCertificateListModelCertListCert setLastTime(Long lastTime) {
            this.lastTime = lastTime;
            return this;
        }
        public Long getLastTime() {
            return this.lastTime;
        }

        public DescribeDcdnCertificateListResponseBodyCertificateListModelCertListCert setFingerprint(String fingerprint) {
            this.fingerprint = fingerprint;
            return this;
        }
        public String getFingerprint() {
            return this.fingerprint;
        }

        public DescribeDcdnCertificateListResponseBodyCertificateListModelCertListCert setCertName(String certName) {
            this.certName = certName;
            return this;
        }
        public String getCertName() {
            return this.certName;
        }

        public DescribeDcdnCertificateListResponseBodyCertificateListModelCertListCert setIssuer(String issuer) {
            this.issuer = issuer;
            return this;
        }
        public String getIssuer() {
            return this.issuer;
        }

        public DescribeDcdnCertificateListResponseBodyCertificateListModelCertListCert setCertId(Long certId) {
            this.certId = certId;
            return this;
        }
        public Long getCertId() {
            return this.certId;
        }

        public DescribeDcdnCertificateListResponseBodyCertificateListModelCertListCert setCommon(String common) {
            this.common = common;
            return this;
        }
        public String getCommon() {
            return this.common;
        }

    }

    public static class DescribeDcdnCertificateListResponseBodyCertificateListModelCertList extends TeaModel {
        @NameInMap("Cert")
        public java.util.List<DescribeDcdnCertificateListResponseBodyCertificateListModelCertListCert> cert;

        public static DescribeDcdnCertificateListResponseBodyCertificateListModelCertList build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnCertificateListResponseBodyCertificateListModelCertList self = new DescribeDcdnCertificateListResponseBodyCertificateListModelCertList();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnCertificateListResponseBodyCertificateListModelCertList setCert(java.util.List<DescribeDcdnCertificateListResponseBodyCertificateListModelCertListCert> cert) {
            this.cert = cert;
            return this;
        }
        public java.util.List<DescribeDcdnCertificateListResponseBodyCertificateListModelCertListCert> getCert() {
            return this.cert;
        }

    }

    public static class DescribeDcdnCertificateListResponseBodyCertificateListModel extends TeaModel {
        @NameInMap("CertList")
        public DescribeDcdnCertificateListResponseBodyCertificateListModelCertList certList;

        @NameInMap("Count")
        public Integer count;

        public static DescribeDcdnCertificateListResponseBodyCertificateListModel build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnCertificateListResponseBodyCertificateListModel self = new DescribeDcdnCertificateListResponseBodyCertificateListModel();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnCertificateListResponseBodyCertificateListModel setCertList(DescribeDcdnCertificateListResponseBodyCertificateListModelCertList certList) {
            this.certList = certList;
            return this;
        }
        public DescribeDcdnCertificateListResponseBodyCertificateListModelCertList getCertList() {
            return this.certList;
        }

        public DescribeDcdnCertificateListResponseBodyCertificateListModel setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

    }

}
