// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnSSLCertificateListResponseBody extends TeaModel {
    @NameInMap("CertificateListModel")
    public DescribeDcdnSSLCertificateListResponseBodyCertificateListModel certificateListModel;

    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDcdnSSLCertificateListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnSSLCertificateListResponseBody self = new DescribeDcdnSSLCertificateListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnSSLCertificateListResponseBody setCertificateListModel(DescribeDcdnSSLCertificateListResponseBodyCertificateListModel certificateListModel) {
        this.certificateListModel = certificateListModel;
        return this;
    }
    public DescribeDcdnSSLCertificateListResponseBodyCertificateListModel getCertificateListModel() {
        return this.certificateListModel;
    }

    public DescribeDcdnSSLCertificateListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDcdnSSLCertificateListResponseBodyCertificateListModelCertListCert extends TeaModel {
        @NameInMap("CertId")
        public Long certId;

        @NameInMap("CertName")
        public String certName;

        @NameInMap("CertRegion")
        public String certRegion;

        @NameInMap("Common")
        public String common;

        @NameInMap("Fingerprint")
        public String fingerprint;

        @NameInMap("Issuer")
        public String issuer;

        @NameInMap("LastTime")
        public Long lastTime;

        public static DescribeDcdnSSLCertificateListResponseBodyCertificateListModelCertListCert build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnSSLCertificateListResponseBodyCertificateListModelCertListCert self = new DescribeDcdnSSLCertificateListResponseBodyCertificateListModelCertListCert();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnSSLCertificateListResponseBodyCertificateListModelCertListCert setCertId(Long certId) {
            this.certId = certId;
            return this;
        }
        public Long getCertId() {
            return this.certId;
        }

        public DescribeDcdnSSLCertificateListResponseBodyCertificateListModelCertListCert setCertName(String certName) {
            this.certName = certName;
            return this;
        }
        public String getCertName() {
            return this.certName;
        }

        public DescribeDcdnSSLCertificateListResponseBodyCertificateListModelCertListCert setCertRegion(String certRegion) {
            this.certRegion = certRegion;
            return this;
        }
        public String getCertRegion() {
            return this.certRegion;
        }

        public DescribeDcdnSSLCertificateListResponseBodyCertificateListModelCertListCert setCommon(String common) {
            this.common = common;
            return this;
        }
        public String getCommon() {
            return this.common;
        }

        public DescribeDcdnSSLCertificateListResponseBodyCertificateListModelCertListCert setFingerprint(String fingerprint) {
            this.fingerprint = fingerprint;
            return this;
        }
        public String getFingerprint() {
            return this.fingerprint;
        }

        public DescribeDcdnSSLCertificateListResponseBodyCertificateListModelCertListCert setIssuer(String issuer) {
            this.issuer = issuer;
            return this;
        }
        public String getIssuer() {
            return this.issuer;
        }

        public DescribeDcdnSSLCertificateListResponseBodyCertificateListModelCertListCert setLastTime(Long lastTime) {
            this.lastTime = lastTime;
            return this;
        }
        public Long getLastTime() {
            return this.lastTime;
        }

    }

    public static class DescribeDcdnSSLCertificateListResponseBodyCertificateListModelCertList extends TeaModel {
        @NameInMap("Cert")
        public java.util.List<DescribeDcdnSSLCertificateListResponseBodyCertificateListModelCertListCert> cert;

        public static DescribeDcdnSSLCertificateListResponseBodyCertificateListModelCertList build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnSSLCertificateListResponseBodyCertificateListModelCertList self = new DescribeDcdnSSLCertificateListResponseBodyCertificateListModelCertList();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnSSLCertificateListResponseBodyCertificateListModelCertList setCert(java.util.List<DescribeDcdnSSLCertificateListResponseBodyCertificateListModelCertListCert> cert) {
            this.cert = cert;
            return this;
        }
        public java.util.List<DescribeDcdnSSLCertificateListResponseBodyCertificateListModelCertListCert> getCert() {
            return this.cert;
        }

    }

    public static class DescribeDcdnSSLCertificateListResponseBodyCertificateListModel extends TeaModel {
        @NameInMap("CertList")
        public DescribeDcdnSSLCertificateListResponseBodyCertificateListModelCertList certList;

        @NameInMap("Count")
        public Integer count;

        @NameInMap("PageNumber")
        public Long pageNumber;

        @NameInMap("PageSize")
        public Long pageSize;

        public static DescribeDcdnSSLCertificateListResponseBodyCertificateListModel build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnSSLCertificateListResponseBodyCertificateListModel self = new DescribeDcdnSSLCertificateListResponseBodyCertificateListModel();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnSSLCertificateListResponseBodyCertificateListModel setCertList(DescribeDcdnSSLCertificateListResponseBodyCertificateListModelCertList certList) {
            this.certList = certList;
            return this;
        }
        public DescribeDcdnSSLCertificateListResponseBodyCertificateListModelCertList getCertList() {
            return this.certList;
        }

        public DescribeDcdnSSLCertificateListResponseBodyCertificateListModel setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

        public DescribeDcdnSSLCertificateListResponseBodyCertificateListModel setPageNumber(Long pageNumber) {
            this.pageNumber = pageNumber;
            return this;
        }
        public Long getPageNumber() {
            return this.pageNumber;
        }

        public DescribeDcdnSSLCertificateListResponseBodyCertificateListModel setPageSize(Long pageSize) {
            this.pageSize = pageSize;
            return this;
        }
        public Long getPageSize() {
            return this.pageSize;
        }

    }

}
