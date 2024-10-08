// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.dcdn20180115.models;

import com.aliyun.tea.*;

public class DescribeDcdnCertificateListResponseBody extends TeaModel {
    /**
     * <p>Details about certificates.</p>
     */
    @NameInMap("CertificateListModel")
    public DescribeDcdnCertificateListResponseBodyCertificateListModel certificateListModel;

    /**
     * <p>The ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>FC0E34AC-0239-44A7-AB0E-800DE522C8DA</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static DescribeDcdnCertificateListResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDcdnCertificateListResponseBody self = new DescribeDcdnCertificateListResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDcdnCertificateListResponseBody setCertificateListModel(DescribeDcdnCertificateListResponseBodyCertificateListModel certificateListModel) {
        this.certificateListModel = certificateListModel;
        return this;
    }
    public DescribeDcdnCertificateListResponseBodyCertificateListModel getCertificateListModel() {
        return this.certificateListModel;
    }

    public DescribeDcdnCertificateListResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class DescribeDcdnCertificateListResponseBodyCertificateListModelCertListCert extends TeaModel {
        /**
         * <p>The ID of the certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("CertId")
        public Long certId;

        /**
         * <p>The name of the certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>Certificate 2</p>
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
         * <p>0151xxxx</p>
         */
        @NameInMap("Fingerprint")
        public String fingerprint;

        /**
         * <p>The certificate authority (CA) that issued the certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>DigiCert</p>
         */
        @NameInMap("Issuer")
        public String issuer;

        /**
         * <p>The timestamp.</p>
         * 
         * <strong>example:</strong>
         * <p>1548065550</p>
         */
        @NameInMap("LastTime")
        public Long lastTime;

        public static DescribeDcdnCertificateListResponseBodyCertificateListModelCertListCert build(java.util.Map<String, ?> map) throws Exception {
            DescribeDcdnCertificateListResponseBodyCertificateListModelCertListCert self = new DescribeDcdnCertificateListResponseBodyCertificateListModelCertListCert();
            return TeaModel.build(map, self);
        }

        public DescribeDcdnCertificateListResponseBodyCertificateListModelCertListCert setCertId(Long certId) {
            this.certId = certId;
            return this;
        }
        public Long getCertId() {
            return this.certId;
        }

        public DescribeDcdnCertificateListResponseBodyCertificateListModelCertListCert setCertName(String certName) {
            this.certName = certName;
            return this;
        }
        public String getCertName() {
            return this.certName;
        }

        public DescribeDcdnCertificateListResponseBodyCertificateListModelCertListCert setCommon(String common) {
            this.common = common;
            return this;
        }
        public String getCommon() {
            return this.common;
        }

        public DescribeDcdnCertificateListResponseBodyCertificateListModelCertListCert setFingerprint(String fingerprint) {
            this.fingerprint = fingerprint;
            return this;
        }
        public String getFingerprint() {
            return this.fingerprint;
        }

        public DescribeDcdnCertificateListResponseBodyCertificateListModelCertListCert setIssuer(String issuer) {
            this.issuer = issuer;
            return this;
        }
        public String getIssuer() {
            return this.issuer;
        }

        public DescribeDcdnCertificateListResponseBodyCertificateListModelCertListCert setLastTime(Long lastTime) {
            this.lastTime = lastTime;
            return this;
        }
        public Long getLastTime() {
            return this.lastTime;
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
        /**
         * <p>Details about each certificate.</p>
         */
        @NameInMap("CertList")
        public DescribeDcdnCertificateListResponseBodyCertificateListModelCertList certList;

        /**
         * <p>The number of certificates.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
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
