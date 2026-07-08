// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class ListCertificatesResponseBody extends TeaModel {
    /**
     * <p>The list of certificates.</p>
     */
    @NameInMap("CertificateList")
    public java.util.List<ListCertificatesResponseBodyCertificateList> certificateList;

    /**
     * <p>The current page number. Default value: 1.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("CurrentPage")
    public Integer currentPage;

    /**
     * <p>The ID of the request. Alibaba Cloud generates a unique ID for each request. You can use the ID to troubleshoot issues.</p>
     * 
     * <strong>example:</strong>
     * <p>CBF1E9B7-D6A0-4E9E-AD3E-2B47E6C2837D</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The number of entries returned on each page.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("ShowSize")
    public Integer showSize;

    /**
     * <p>The total number of entries.</p>
     * 
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
         * <p>The encryption algorithm of the certificate. Valid values:</p>
         * <ul>
         * <li><p><strong>RSA</strong></p>
         * </li>
         * <li><p><strong>ECC</strong></p>
         * </li>
         * <li><p><strong>SM2</strong></p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>RSA</p>
         */
        @NameInMap("Algorithm")
        public String algorithm;

        /**
         * <p>The global ID of the certificate. This ID is used across Alibaba Cloud services and is in the <code>Certificate ID-Region ID</code> format. For example, if a certificate ID is <code>123</code>, the <code>CertIdentifier</code> is <code>123-cn-hangzhou</code> for the Alibaba Cloud China site and <code>123-ap-southeast-1</code> for the Alibaba Cloud International site (www\.alibabacloud.com).</p>
         * <ul>
         * <li><p>For the Alibaba Cloud China website, the format is certificate ID + &quot;-cn-hangzhou&quot;.</p>
         * </li>
         * <li><p>For the Alibaba Cloud International website (www\.alibabacloud.com), the format is certificate ID + &quot;-ap-southeast-1&quot;.</p>
         * </li>
         * </ul>
         * <p>For example, if the certificate ID is 123, the CertIdentifier is &quot;123-cn-hangzhou&quot; for the China site and &quot;123-ap-southeast-1&quot; for the International site.</p>
         * 
         * <strong>example:</strong>
         * <p>21589515-cn-hangzhou</p>
         */
        @NameInMap("CertIdentifier")
        public String certIdentifier;

        /**
         * <p>The ID of the certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>17281539</p>
         */
        @NameInMap("CertificateId")
        public String certificateId;

        /**
         * <p>The name of the certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("CertificateName")
        public String certificateName;

        /**
         * <p>The source of the certificate.</p>
         * <ul>
         * <li><p>BUY: A purchased certificate.</p>
         * </li>
         * <li><p>TEST: A test certificate.</p>
         * </li>
         * <li><p>UPLOAD: An uploaded certificate.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>BUY</p>
         */
        @NameInMap("CertificateSource")
        public String certificateSource;

        /**
         * <p>The status of the certificate.</p>
         * <ul>
         * <li><p><strong>issued</strong>: The certificate is issued.</p>
         * </li>
         * <li><p><strong>revoked</strong>: The certificate is revoked.</p>
         * </li>
         * <li><p><strong>willExpire</strong>: The certificate is about to expire.</p>
         * </li>
         * <li><p><strong>expired</strong>: The certificate has expired.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>issued</p>
         */
        @NameInMap("CertificateStatus")
        public String certificateStatus;

        /**
         * <p>The common name of the certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>aliyun.com</p>
         */
        @NameInMap("CommonName")
        public String commonName;

        /**
         * <p>The domain names that are bound to the certificate. Multiple domain names are separated by commas.</p>
         * 
         * <strong>example:</strong>
         * <p>test.com</p>
         */
        @NameInMap("Domain")
        public String domain;

        /**
         * <p>Indicates whether a private key is available. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: A private key is available.</p>
         * </li>
         * <li><p><strong>false</strong>: A private key is not available.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("ExistPrivateKey")
        public Boolean existPrivateKey;

        /**
         * <p>The fingerprint of the public key.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("FingerPrint")
        public String fingerPrint;

        /**
         * <p>The ID of the certificate instance.</p>
         * 
         * <strong>example:</strong>
         * <p>cas-cn-v***</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>The certification authority.</p>
         * 
         * <strong>example:</strong>
         * <p>DigiCert</p>
         */
        @NameInMap("Issuer")
        public String issuer;

        /**
         * <p>The key size, in bits.</p>
         * <ul>
         * <li><p>For RSA keys, typical sizes are 2048, 3072, or 4096.</p>
         * </li>
         * <li><p>For ECC or SM2 keys, the typical size is 256.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2048</p>
         */
        @NameInMap("KeySize")
        public Integer keySize;

        /**
         * <p>The end of the certificate validity period.</p>
         * 
         * <strong>example:</strong>
         * <p>1749580567000</p>
         */
        @NameInMap("NotAfter")
        public Long notAfter;

        /**
         * <p>The beginning of the certificate validity period.</p>
         * 
         * <strong>example:</strong>
         * <p>1760745600000</p>
         */
        @NameInMap("NotBefore")
        public Long notBefore;

        /**
         * <p>The serial number of the certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>123</p>
         */
        @NameInMap("Serial")
        public String serial;

        /**
         * <p>An array that contains the alternative domain names of the certificate. This parameter corresponds to the <code>Subject Alternative Name</code> field of the certificate.</p>
         */
        @NameInMap("SubjectAlternativeNames")
        public java.util.List<String> subjectAlternativeNames;

        /**
         * <p>The list of Alibaba Cloud products in which the certificate is deployed.</p>
         */
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
