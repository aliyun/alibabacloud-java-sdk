// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class ListCertificatesResponseBody extends TeaModel {
    @NameInMap("CertificateList")
    public java.util.List<ListCertificatesResponseBodyCertificateList> certificateList;

    /**
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <strong>example:</strong>
     * <p>CBF1E9B7-D6A0-4E9E-AD3E-2B47E6C2837D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("ShowSize")
    public Integer showSize;

    /**
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static ListCertificatesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListCertificatesResponseBody self = new ListCertificatesResponseBody();
        return TeaModel.build(map, self);
    }

    public ListCertificatesResponseBody setCertificateList(java.util.List<ListCertificatesResponseBodyCertificateList> certificateList) {
        this.certificateList = certificateList;
        return this;
    }
    public java.util.List<ListCertificatesResponseBodyCertificateList> getCertificateList() {
        return this.certificateList;
    }

    public ListCertificatesResponseBody setCurrentPage(Integer currentPage) {
        this.currentPage = currentPage;
        return this;
    }
    public Integer getCurrentPage() {
        return this.currentPage;
    }

    public ListCertificatesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListCertificatesResponseBody setShowSize(Integer showSize) {
        this.showSize = showSize;
        return this;
    }
    public Integer getShowSize() {
        return this.showSize;
    }

    public ListCertificatesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class ListCertificatesResponseBodyCertificateList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>RSA</p>
         */
        @NameInMap("Algorithm")
        public String algorithm;

        /**
         * <strong>example:</strong>
         * <p>21589515-cn-hangzhou</p>
         */
        @NameInMap("CertIdentifier")
        public String certIdentifier;

        /**
         * <strong>example:</strong>
         * <p>17281539</p>
         */
        @NameInMap("CertificateId")
        public String certificateId;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("CertificateName")
        public String certificateName;

        /**
         * <strong>example:</strong>
         * <p>BUY</p>
         */
        @NameInMap("CertificateSource")
        public String certificateSource;

        /**
         * <strong>example:</strong>
         * <p>issued</p>
         */
        @NameInMap("CertificateStatus")
        public String certificateStatus;

        /**
         * <strong>example:</strong>
         * <p>aliyun.com</p>
         */
        @NameInMap("CommonName")
        public String commonName;

        /**
         * <strong>example:</strong>
         * <p>test.com</p>
         */
        @NameInMap("Domain")
        public String domain;

        /**
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ExistPrivateKey")
        public Boolean existPrivateKey;

        /**
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("FingerPrint")
        public String fingerPrint;

        /**
         * <strong>example:</strong>
         * <p>cas-cn-v***</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <strong>example:</strong>
         * <p>DigiCert</p>
         */
        @NameInMap("Issuer")
        public String issuer;

        /**
         * <strong>example:</strong>
         * <p>2048</p>
         */
        @NameInMap("KeySize")
        public Integer keySize;

        /**
         * <strong>example:</strong>
         * <p>1749580567000</p>
         */
        @NameInMap("NotAfter")
        public Long notAfter;

        /**
         * <strong>example:</strong>
         * <p>1760745600000</p>
         */
        @NameInMap("NotBefore")
        public Long notBefore;

        /**
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("Serial")
        public String serial;

        @NameInMap("SubjectAlternativeNames")
        public java.util.List<String> subjectAlternativeNames;

        @NameInMap("UsingProductList")
        public java.util.List<String> usingProductList;

        public static ListCertificatesResponseBodyCertificateList build(java.util.Map<String, ?> map) throws Exception {
            ListCertificatesResponseBodyCertificateList self = new ListCertificatesResponseBodyCertificateList();
            return TeaModel.build(map, self);
        }

        public ListCertificatesResponseBodyCertificateList setAlgorithm(String algorithm) {
            this.algorithm = algorithm;
            return this;
        }
        public String getAlgorithm() {
            return this.algorithm;
        }

        public ListCertificatesResponseBodyCertificateList setCertIdentifier(String certIdentifier) {
            this.certIdentifier = certIdentifier;
            return this;
        }
        public String getCertIdentifier() {
            return this.certIdentifier;
        }

        public ListCertificatesResponseBodyCertificateList setCertificateId(String certificateId) {
            this.certificateId = certificateId;
            return this;
        }
        public String getCertificateId() {
            return this.certificateId;
        }

        public ListCertificatesResponseBodyCertificateList setCertificateName(String certificateName) {
            this.certificateName = certificateName;
            return this;
        }
        public String getCertificateName() {
            return this.certificateName;
        }

        public ListCertificatesResponseBodyCertificateList setCertificateSource(String certificateSource) {
            this.certificateSource = certificateSource;
            return this;
        }
        public String getCertificateSource() {
            return this.certificateSource;
        }

        public ListCertificatesResponseBodyCertificateList setCertificateStatus(String certificateStatus) {
            this.certificateStatus = certificateStatus;
            return this;
        }
        public String getCertificateStatus() {
            return this.certificateStatus;
        }

        public ListCertificatesResponseBodyCertificateList setCommonName(String commonName) {
            this.commonName = commonName;
            return this;
        }
        public String getCommonName() {
            return this.commonName;
        }

        public ListCertificatesResponseBodyCertificateList setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public ListCertificatesResponseBodyCertificateList setExistPrivateKey(Boolean existPrivateKey) {
            this.existPrivateKey = existPrivateKey;
            return this;
        }
        public Boolean getExistPrivateKey() {
            return this.existPrivateKey;
        }

        public ListCertificatesResponseBodyCertificateList setFingerPrint(String fingerPrint) {
            this.fingerPrint = fingerPrint;
            return this;
        }
        public String getFingerPrint() {
            return this.fingerPrint;
        }

        public ListCertificatesResponseBodyCertificateList setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public ListCertificatesResponseBodyCertificateList setIssuer(String issuer) {
            this.issuer = issuer;
            return this;
        }
        public String getIssuer() {
            return this.issuer;
        }

        public ListCertificatesResponseBodyCertificateList setKeySize(Integer keySize) {
            this.keySize = keySize;
            return this;
        }
        public Integer getKeySize() {
            return this.keySize;
        }

        public ListCertificatesResponseBodyCertificateList setNotAfter(Long notAfter) {
            this.notAfter = notAfter;
            return this;
        }
        public Long getNotAfter() {
            return this.notAfter;
        }

        public ListCertificatesResponseBodyCertificateList setNotBefore(Long notBefore) {
            this.notBefore = notBefore;
            return this;
        }
        public Long getNotBefore() {
            return this.notBefore;
        }

        public ListCertificatesResponseBodyCertificateList setSerial(String serial) {
            this.serial = serial;
            return this;
        }
        public String getSerial() {
            return this.serial;
        }

        public ListCertificatesResponseBodyCertificateList setSubjectAlternativeNames(java.util.List<String> subjectAlternativeNames) {
            this.subjectAlternativeNames = subjectAlternativeNames;
            return this;
        }
        public java.util.List<String> getSubjectAlternativeNames() {
            return this.subjectAlternativeNames;
        }

        public ListCertificatesResponseBodyCertificateList setUsingProductList(java.util.List<String> usingProductList) {
            this.usingProductList = usingProductList;
            return this;
        }
        public java.util.List<String> getUsingProductList() {
            return this.usingProductList;
        }

    }

}
