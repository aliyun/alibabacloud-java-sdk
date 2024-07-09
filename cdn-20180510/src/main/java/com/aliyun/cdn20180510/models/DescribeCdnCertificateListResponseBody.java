// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cdn20180510.models;

import com.aliyun.tea.*;

public class DescribeCdnCertificateListResponseBody extends TeaModel {
    /**
     * <p>Details about certificates.</p>
     */
    @NameInMap("CertificateListModel")
    public DescribeCdnCertificateListResponseBodyCertificateListModel certificateListModel;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>FC0E34AC-0239-44A7-AB0E-800DE522C8DA</p>
     */
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
        /**
         * <p>The ID of the certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("CertId")
        public Long certId;

        /**
         * <p>The name of the certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>Certificate1</p>
         */
        @NameInMap("CertName")
        public String certName;

        /**
         * <p>The Common Name (CN) attribute of the certificate. In most cases, the CN is a domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        @NameInMap("Common")
        public String common;

        /**
         * <p>The fingerprint of the certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>2ED68FD33786C5B42950D40A6C50353575BB****</p>
         */
        @NameInMap("Fingerprint")
        public String fingerprint;

        /**
         * <p>The certificate authority (CA) that issued the certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>CO****</p>
         */
        @NameInMap("Issuer")
        public String issuer;

        /**
         * <p>The timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1512388610</p>
         */
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
        /**
         * <p>The list of certificates.</p>
         */
        @NameInMap("CertList")
        public DescribeCdnCertificateListResponseBodyCertificateListModelCertList certList;

        /**
         * <p>The number of certificates that are returned.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
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
