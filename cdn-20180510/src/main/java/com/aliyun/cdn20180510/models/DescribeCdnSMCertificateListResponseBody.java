// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeCdnSMCertificateListResponseBody extends TeaModel {
    /**
     * <p>The type of the certificate information.</p>
     */
    @NameInMap("CertificateListModel")
    public DescribeCdnSMCertificateListResponseBodyCertificateListModel certificateListModel;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeCdnSMCertificateListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeCdnSMCertificateListResponseBody self = new DescribeCdnSMCertificateListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeCdnSMCertificateListResponseBody setCertificateListModel(DescribeCdnSMCertificateListResponseBodyCertificateListModel certificateListModel) {
        this.certificateListModel = certificateListModel;
        return this;
    }
    public DescribeCdnSMCertificateListResponseBodyCertificateListModel getCertificateListModel() {
        return this.certificateListModel;
    }

    public DescribeCdnSMCertificateListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeCdnSMCertificateListResponseBodyCertificateListModelCertListCert extends TeaModel {
        /**
         * <p>The ID of the certificate.</p>
         */
        @NameInMap("CertIdentifier")
        public String certIdentifier;

        /**
         * <p>The name of the certificate.</p>
         */
        @NameInMap("CertName")
        public String certName;

        /**
         * <p>The common name of the certificate.</p>
         */
        @NameInMap("Common")
        public String common;

        /**
         * <p>The certificate authority (CA) that issued the certificate.</p>
         */
        @NameInMap("Issuer")
        public String issuer;

        public static DescribeCdnSMCertificateListResponseBodyCertificateListModelCertListCert build(java.util.Map<String, ?> map) throws Exception {
            DescribeCdnSMCertificateListResponseBodyCertificateListModelCertListCert self = new DescribeCdnSMCertificateListResponseBodyCertificateListModelCertListCert();
            return TeaModel.build(map, self);
        }

        public DescribeCdnSMCertificateListResponseBodyCertificateListModelCertListCert setCertIdentifier(String certIdentifier) {
            this.certIdentifier = certIdentifier;
            return this;
        }
        public String getCertIdentifier() {
            return this.certIdentifier;
        }

        public DescribeCdnSMCertificateListResponseBodyCertificateListModelCertListCert setCertName(String certName) {
            this.certName = certName;
            return this;
        }
        public String getCertName() {
            return this.certName;
        }

        public DescribeCdnSMCertificateListResponseBodyCertificateListModelCertListCert setCommon(String common) {
            this.common = common;
            return this;
        }
        public String getCommon() {
            return this.common;
        }

        public DescribeCdnSMCertificateListResponseBodyCertificateListModelCertListCert setIssuer(String issuer) {
            this.issuer = issuer;
            return this;
        }
        public String getIssuer() {
            return this.issuer;
        }

    }

    public static class DescribeCdnSMCertificateListResponseBodyCertificateListModelCertList extends TeaModel {
        @NameInMap("Cert")
        public java.util.List<DescribeCdnSMCertificateListResponseBodyCertificateListModelCertListCert> cert;

        public static DescribeCdnSMCertificateListResponseBodyCertificateListModelCertList build(java.util.Map<String, ?> map) throws Exception {
            DescribeCdnSMCertificateListResponseBodyCertificateListModelCertList self = new DescribeCdnSMCertificateListResponseBodyCertificateListModelCertList();
            return TeaModel.build(map, self);
        }

        public DescribeCdnSMCertificateListResponseBodyCertificateListModelCertList setCert(java.util.List<DescribeCdnSMCertificateListResponseBodyCertificateListModelCertListCert> cert) {
            this.cert = cert;
            return this;
        }
        public java.util.List<DescribeCdnSMCertificateListResponseBodyCertificateListModelCertListCert> getCert() {
            return this.cert;
        }

    }

    public static class DescribeCdnSMCertificateListResponseBodyCertificateListModel extends TeaModel {
        /**
         * <p>A list of certificates.</p>
         */
        @NameInMap("CertList")
        public DescribeCdnSMCertificateListResponseBodyCertificateListModelCertList certList;

        /**
         * <p>The number of certificates that are returned.</p>
         */
        @NameInMap("Count")
        public Integer count;

        public static DescribeCdnSMCertificateListResponseBodyCertificateListModel build(java.util.Map<String, ?> map) throws Exception {
            DescribeCdnSMCertificateListResponseBodyCertificateListModel self = new DescribeCdnSMCertificateListResponseBodyCertificateListModel();
            return TeaModel.build(map, self);
        }

        public DescribeCdnSMCertificateListResponseBodyCertificateListModel setCertList(DescribeCdnSMCertificateListResponseBodyCertificateListModelCertList certList) {
            this.certList = certList;
            return this;
        }
        public DescribeCdnSMCertificateListResponseBodyCertificateListModelCertList getCertList() {
            return this.certList;
        }

        public DescribeCdnSMCertificateListResponseBodyCertificateListModel setCount(Integer count) {
            this.count = count;
            return this;
        }
        public Integer getCount() {
            return this.count;
        }

    }

}
