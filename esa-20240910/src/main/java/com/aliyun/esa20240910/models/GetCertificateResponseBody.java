// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetCertificateResponseBody extends TeaModel {
    /**
     * <p>Certificate content.</p>
     * 
     * <strong>example:</strong>
     * <p>-----BEGIN CERTIFICATE-----</p>
     */
    @NameInMap("Certificate")
    public String certificate;

    /**
     * <p>Request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>04F0F334-1335-436C-A1D7-6C044FE73368</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The certificate information.</p>
     */
    @NameInMap("Result")
    public GetCertificateResponseBodyResult result;

    /**
     * <p>Site ID.</p>
     * 
     * <strong>example:</strong>
     * <p>1234567890123</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    /**
     * <p>Site name.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("SiteName")
    public String siteName;

    /**
     * <p>Certificate status.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Status")
    public String status;

    public static GetCertificateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetCertificateResponseBody self = new GetCertificateResponseBody();
        return TeaModel.build(map, self);
    }

    public GetCertificateResponseBody setCertificate(String certificate) {
        this.certificate = certificate;
        return this;
    }
    public String getCertificate() {
        return this.certificate;
    }

    public GetCertificateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetCertificateResponseBody setResult(GetCertificateResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetCertificateResponseBodyResult getResult() {
        return this.result;
    }

    public GetCertificateResponseBody setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

    public GetCertificateResponseBody setSiteName(String siteName) {
        this.siteName = siteName;
        return this;
    }
    public String getSiteName() {
        return this.siteName;
    }

    public GetCertificateResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public static class GetCertificateResponseBodyResultDCV extends TeaModel {
        /**
         * <p>The DCV ID.</p>
         * 
         * <strong>example:</strong>
         * <p>bababf7cdd1546a2ad04c0def1f4c980</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>The DCV name. It is a TXT record name if Type is DNS or URL if Type is HTTP.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.example.com/.well-known/acme-challenge/pH20CqwS5L3ZnvkhI436DCzadKFuG7QcUcvB_4KsAow">http://www.example.com/.well-known/acme-challenge/pH20CqwS5L3ZnvkhI436DCzadKFuG7QcUcvB_4KsAow</a></p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The verification status.</p>
         * 
         * <strong>example:</strong>
         * <p>pending</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The DCV type. Valid values: DNS and HTTP.</p>
         * 
         * <strong>example:</strong>
         * <p>HTTP</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>The DCV content.</p>
         * 
         * <strong>example:</strong>
         * <p>pH20CqwS5L3ZnvkhI436DCzadKFuG7QcUcvB_4KsAow.KfzYo4LH3EgOt7a73G-RqZkbR0eYtLfEUmtmqGmr4FQ</p>
         */
        @NameInMap("Value")
        public String value;

        public static GetCertificateResponseBodyResultDCV build(java.util.Map<String, ?> map) throws Exception {
            GetCertificateResponseBodyResultDCV self = new GetCertificateResponseBodyResultDCV();
            return TeaModel.build(map, self);
        }

        public GetCertificateResponseBodyResultDCV setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetCertificateResponseBodyResultDCV setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetCertificateResponseBodyResultDCV setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetCertificateResponseBodyResultDCV setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetCertificateResponseBodyResultDCV setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetCertificateResponseBodyResult extends TeaModel {
        /**
         * <p>The error code returned for certificate application.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("ApplyCode")
        public Long applyCode;

        /**
         * <p>The error message returned for certificate application.</p>
         * 
         * <strong>example:</strong>
         * <p>canceled</p>
         */
        @NameInMap("ApplyMessage")
        public String applyMessage;

        /**
         * <p>Cloud certificate ID.</p>
         * 
         * <strong>example:</strong>
         * <p>30000478</p>
         */
        @NameInMap("CasId")
        public String casId;

        /**
         * <p>Common Name (CN) field of the certificate.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.example.com">www.example.com</a></p>
         */
        @NameInMap("CommonName")
        public String commonName;

        /**
         * <p>Creation time.</p>
         * 
         * <strong>example:</strong>
         * <p>2020-05-12 02:00:53</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <p>The Domain Control Validation (DCV) information.</p>
         */
        @NameInMap("DCV")
        public java.util.List<GetCertificateResponseBodyResultDCV> DCV;

        /**
         * <p>SHA256 fingerprint of the certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>1dc5fc9af4eead2570c70d94b416130baeb6d4429b51fd3557379588456aca66</p>
         */
        @NameInMap("FingerprintSha256")
        public String fingerprintSha256;

        /**
         * <p>Certificate ID.</p>
         * 
         * <strong>example:</strong>
         * <p>babaded901474b9693acf530e0fb1d95</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <p>Certificate issuer.</p>
         * 
         * <strong>example:</strong>
         * <p>DigiCert</p>
         */
        @NameInMap("Issuer")
        public String issuer;

        /**
         * <p>Certificate issuing authority.</p>
         * 
         * <strong>example:</strong>
         * <p>DigiCert Global Root CA</p>
         */
        @NameInMap("IssuerCN")
        public String issuerCN;

        @NameInMap("KeyServerId")
        public String keyServerId;

        /**
         * <p>Certificate name.</p>
         * 
         * <strong>example:</strong>
         * <p>yourCertName</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>End time of the certificate validity period.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-11-26T16:00:00Z</p>
         */
        @NameInMap("NotAfter")
        public String notAfter;

        /**
         * <p>Start time of the certificate validity period.</p>
         * 
         * <strong>example:</strong>
         * <p>2023-11-26T16:00:00Z</p>
         */
        @NameInMap("NotBefore")
        public String notBefore;

        /**
         * <p>Certificate public key algorithm.</p>
         * 
         * <strong>example:</strong>
         * <p>ECDSA</p>
         */
        @NameInMap("PubAlg")
        public String pubAlg;

        /**
         * <p>Region.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("Region")
        public String region;

        /**
         * <p>Subject Alternative Name (SAN) of the certificate.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.example.com,*.example.com">www.example.com,*.example.com</a></p>
         */
        @NameInMap("SAN")
        public String SAN;

        /**
         * <p>Serial number of the certificate.</p>
         * 
         * <strong>example:</strong>
         * <p>babaded901474b9693acf530e0fb1daa</p>
         */
        @NameInMap("SerialNumber")
        public String serialNumber;

        /**
         * <p>Certificate signature algorithm.</p>
         * 
         * <strong>example:</strong>
         * <p>ECDSA-SHA1</p>
         */
        @NameInMap("SigAlg")
        public String sigAlg;

        /**
         * <p>Certificate status.</p>
         * 
         * <strong>example:</strong>
         * <p>OK</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>Certificate type.</p>
         * 
         * <strong>example:</strong>
         * <p>free</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <p>Update time.</p>
         * 
         * <strong>example:</strong>
         * <p>2022-09-22 05:33:13</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        public static GetCertificateResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetCertificateResponseBodyResult self = new GetCertificateResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetCertificateResponseBodyResult setApplyCode(Long applyCode) {
            this.applyCode = applyCode;
            return this;
        }
        public Long getApplyCode() {
            return this.applyCode;
        }

        public GetCertificateResponseBodyResult setApplyMessage(String applyMessage) {
            this.applyMessage = applyMessage;
            return this;
        }
        public String getApplyMessage() {
            return this.applyMessage;
        }

        public GetCertificateResponseBodyResult setCasId(String casId) {
            this.casId = casId;
            return this;
        }
        public String getCasId() {
            return this.casId;
        }

        public GetCertificateResponseBodyResult setCommonName(String commonName) {
            this.commonName = commonName;
            return this;
        }
        public String getCommonName() {
            return this.commonName;
        }

        public GetCertificateResponseBodyResult setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetCertificateResponseBodyResult setDCV(java.util.List<GetCertificateResponseBodyResultDCV> DCV) {
            this.DCV = DCV;
            return this;
        }
        public java.util.List<GetCertificateResponseBodyResultDCV> getDCV() {
            return this.DCV;
        }

        public GetCertificateResponseBodyResult setFingerprintSha256(String fingerprintSha256) {
            this.fingerprintSha256 = fingerprintSha256;
            return this;
        }
        public String getFingerprintSha256() {
            return this.fingerprintSha256;
        }

        public GetCertificateResponseBodyResult setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetCertificateResponseBodyResult setIssuer(String issuer) {
            this.issuer = issuer;
            return this;
        }
        public String getIssuer() {
            return this.issuer;
        }

        public GetCertificateResponseBodyResult setIssuerCN(String issuerCN) {
            this.issuerCN = issuerCN;
            return this;
        }
        public String getIssuerCN() {
            return this.issuerCN;
        }

        public GetCertificateResponseBodyResult setKeyServerId(String keyServerId) {
            this.keyServerId = keyServerId;
            return this;
        }
        public String getKeyServerId() {
            return this.keyServerId;
        }

        public GetCertificateResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetCertificateResponseBodyResult setNotAfter(String notAfter) {
            this.notAfter = notAfter;
            return this;
        }
        public String getNotAfter() {
            return this.notAfter;
        }

        public GetCertificateResponseBodyResult setNotBefore(String notBefore) {
            this.notBefore = notBefore;
            return this;
        }
        public String getNotBefore() {
            return this.notBefore;
        }

        public GetCertificateResponseBodyResult setPubAlg(String pubAlg) {
            this.pubAlg = pubAlg;
            return this;
        }
        public String getPubAlg() {
            return this.pubAlg;
        }

        public GetCertificateResponseBodyResult setRegion(String region) {
            this.region = region;
            return this;
        }
        public String getRegion() {
            return this.region;
        }

        public GetCertificateResponseBodyResult setSAN(String SAN) {
            this.SAN = SAN;
            return this;
        }
        public String getSAN() {
            return this.SAN;
        }

        public GetCertificateResponseBodyResult setSerialNumber(String serialNumber) {
            this.serialNumber = serialNumber;
            return this;
        }
        public String getSerialNumber() {
            return this.serialNumber;
        }

        public GetCertificateResponseBodyResult setSigAlg(String sigAlg) {
            this.sigAlg = sigAlg;
            return this;
        }
        public String getSigAlg() {
            return this.sigAlg;
        }

        public GetCertificateResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetCertificateResponseBodyResult setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetCertificateResponseBodyResult setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
