// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.cas20200407.models;

import com.aliyun.tea.*;

public class GetCertificateDetailResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>RSA</p>
     */
    @NameInMap("Algorithm")
    public String algorithm;

    /**
     * <strong>example:</strong>
     * <p>21912069-cn-hangzhou</p>
     */
    @NameInMap("CertIdentifier")
    public String certIdentifier;

    @NameInMap("CertificateChainList")
    public java.util.List<GetCertificateDetailResponseBodyCertificateChainList> certificateChainList;

    /**
     * <strong>example:</strong>
     * <p>22559621</p>
     */
    @NameInMap("CertificateId")
    public Integer certificateId;

    /**
     * <strong>example:</strong>
     * <p>123</p>
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
     * <p><a href="http://www.example.com">www.example.com</a></p>
     */
    @NameInMap("CommonName")
    public String commonName;

    /**
     * <strong>example:</strong>
     * <p>aliyundoc.com,example.aliyundoc.com</p>
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
     * <p>cas_dv-cn-123</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <strong>example:</strong>
     * <p>Digicert</p>
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
     * <p>17326613180000</p>
     */
    @NameInMap("NotAfter")
    public Long notAfter;

    /**
     * <strong>example:</strong>
     * <p>17321613180000</p>
     */
    @NameInMap("NotBefore")
    public Long notBefore;

    /**
     * <strong>example:</strong>
     * <p>5979d897-d69f-4fc9-87dd-f3bb73c40b80</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <strong>example:</strong>
     * <p>123</p>
     */
    @NameInMap("Serial")
    public String serial;

    @NameInMap("SubjectAlternativeNames")
    public java.util.List<String> subjectAlternativeNames;

    @NameInMap("Tags")
    public java.util.List<GetCertificateDetailResponseBodyTags> tags;

    @NameInMap("UsingProductList")
    public java.util.List<String> usingProductList;

    public static GetCertificateDetailResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCertificateDetailResponseBody self = new GetCertificateDetailResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCertificateDetailResponseBody setAlgorithm(String algorithm) {
        this.algorithm = algorithm;
        return this;
    }
    public String getAlgorithm() {
        return this.algorithm;
    }

    public GetCertificateDetailResponseBody setCertIdentifier(String certIdentifier) {
        this.certIdentifier = certIdentifier;
        return this;
    }
    public String getCertIdentifier() {
        return this.certIdentifier;
    }

    public GetCertificateDetailResponseBody setCertificateChainList(java.util.List<GetCertificateDetailResponseBodyCertificateChainList> certificateChainList) {
        this.certificateChainList = certificateChainList;
        return this;
    }
    public java.util.List<GetCertificateDetailResponseBodyCertificateChainList> getCertificateChainList() {
        return this.certificateChainList;
    }

    public GetCertificateDetailResponseBody setCertificateId(Integer certificateId) {
        this.certificateId = certificateId;
        return this;
    }
    public Integer getCertificateId() {
        return this.certificateId;
    }

    public GetCertificateDetailResponseBody setCertificateName(String certificateName) {
        this.certificateName = certificateName;
        return this;
    }
    public String getCertificateName() {
        return this.certificateName;
    }

    public GetCertificateDetailResponseBody setCertificateSource(String certificateSource) {
        this.certificateSource = certificateSource;
        return this;
    }
    public String getCertificateSource() {
        return this.certificateSource;
    }

    public GetCertificateDetailResponseBody setCertificateStatus(String certificateStatus) {
        this.certificateStatus = certificateStatus;
        return this;
    }
    public String getCertificateStatus() {
        return this.certificateStatus;
    }

    public GetCertificateDetailResponseBody setCommonName(String commonName) {
        this.commonName = commonName;
        return this;
    }
    public String getCommonName() {
        return this.commonName;
    }

    public GetCertificateDetailResponseBody setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public GetCertificateDetailResponseBody setExistPrivateKey(Boolean existPrivateKey) {
        this.existPrivateKey = existPrivateKey;
        return this;
    }
    public Boolean getExistPrivateKey() {
        return this.existPrivateKey;
    }

    public GetCertificateDetailResponseBody setFingerPrint(String fingerPrint) {
        this.fingerPrint = fingerPrint;
        return this;
    }
    public String getFingerPrint() {
        return this.fingerPrint;
    }

    public GetCertificateDetailResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public GetCertificateDetailResponseBody setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }
    public String getIssuer() {
        return this.issuer;
    }

    public GetCertificateDetailResponseBody setKeySize(Integer keySize) {
        this.keySize = keySize;
        return this;
    }
    public Integer getKeySize() {
        return this.keySize;
    }

    public GetCertificateDetailResponseBody setNotAfter(Long notAfter) {
        this.notAfter = notAfter;
        return this;
    }
    public Long getNotAfter() {
        return this.notAfter;
    }

    public GetCertificateDetailResponseBody setNotBefore(Long notBefore) {
        this.notBefore = notBefore;
        return this;
    }
    public Long getNotBefore() {
        return this.notBefore;
    }

    public GetCertificateDetailResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetCertificateDetailResponseBody setSerial(String serial) {
        this.serial = serial;
        return this;
    }
    public String getSerial() {
        return this.serial;
    }

    public GetCertificateDetailResponseBody setSubjectAlternativeNames(java.util.List<String> subjectAlternativeNames) {
        this.subjectAlternativeNames = subjectAlternativeNames;
        return this;
    }
    public java.util.List<String> getSubjectAlternativeNames() {
        return this.subjectAlternativeNames;
    }

    public GetCertificateDetailResponseBody setTags(java.util.List<GetCertificateDetailResponseBodyTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<GetCertificateDetailResponseBodyTags> getTags() {
        return this.tags;
    }

    public GetCertificateDetailResponseBody setUsingProductList(java.util.List<String> usingProductList) {
        this.usingProductList = usingProductList;
        return this;
    }
    public java.util.List<String> getUsingProductList() {
        return this.usingProductList;
    }

    public static class GetCertificateDetailResponseBodyCertificateChainList extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>Digicert</p>
         */
        @NameInMap("Issuer")
        public String issuer;

        /**
         * <strong>example:</strong>
         * <p>17326613180000</p>
         */
        @NameInMap("NotAfter")
        public Long notAfter;

        /**
         * <strong>example:</strong>
         * <p>17321613180000</p>
         */
        @NameInMap("NotBefore")
        public Long notBefore;

        /**
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("RemainDay")
        public Integer remainDay;

        /**
         * <strong>example:</strong>
         * <p>Digicert</p>
         */
        @NameInMap("Subject")
        public String subject;

        public static GetCertificateDetailResponseBodyCertificateChainList build(java.util.Map<String, ?> map) throws Exception {
            GetCertificateDetailResponseBodyCertificateChainList self = new GetCertificateDetailResponseBodyCertificateChainList();
            return TeaModel.build(map, self);
        }

        public GetCertificateDetailResponseBodyCertificateChainList setIssuer(String issuer) {
            this.issuer = issuer;
            return this;
        }
        public String getIssuer() {
            return this.issuer;
        }

        public GetCertificateDetailResponseBodyCertificateChainList setNotAfter(Long notAfter) {
            this.notAfter = notAfter;
            return this;
        }
        public Long getNotAfter() {
            return this.notAfter;
        }

        public GetCertificateDetailResponseBodyCertificateChainList setNotBefore(Long notBefore) {
            this.notBefore = notBefore;
            return this;
        }
        public Long getNotBefore() {
            return this.notBefore;
        }

        public GetCertificateDetailResponseBodyCertificateChainList setRemainDay(Integer remainDay) {
            this.remainDay = remainDay;
            return this;
        }
        public Integer getRemainDay() {
            return this.remainDay;
        }

        public GetCertificateDetailResponseBodyCertificateChainList setSubject(String subject) {
            this.subject = subject;
            return this;
        }
        public String getSubject() {
            return this.subject;
        }

    }

    public static class GetCertificateDetailResponseBodyTags extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("TagKey")
        public String tagKey;

        /**
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("TagValue")
        public String tagValue;

        public static GetCertificateDetailResponseBodyTags build(java.util.Map<String, ?> map) throws Exception {
            GetCertificateDetailResponseBodyTags self = new GetCertificateDetailResponseBodyTags();
            return TeaModel.build(map, self);
        }

        public GetCertificateDetailResponseBodyTags setTagKey(String tagKey) {
            this.tagKey = tagKey;
            return this;
        }
        public String getTagKey() {
            return this.tagKey;
        }

        public GetCertificateDetailResponseBodyTags setTagValue(String tagValue) {
            this.tagValue = tagValue;
            return this;
        }
        public String getTagValue() {
            return this.tagValue;
        }

    }

}
