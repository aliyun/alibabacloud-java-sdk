// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.esa20240910.models;

import com.aliyun.tea.*;

public class GetClientCaCertificateResponseBody extends TeaModel {
    /**
     * <strong>example:</strong>
     * <p>-----BEGIN CERTIFICATE-----</p>
     */
    @NameInMap("Certificate")
    public String certificate;

    /**
     * <strong>example:</strong>
     * <p>0AEDAF20-4DDF-4165-8750-47FF9C1929C9</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("Result")
    public GetClientCaCertificateResponseBodyResult result;

    /**
     * <strong>example:</strong>
     * <p>1234567890123</p>
     */
    @NameInMap("SiteId")
    public Long siteId;

    /**
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("SiteName")
    public String siteName;

    /**
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Status")
    public String status;

    public static GetClientCaCertificateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetClientCaCertificateResponseBody self = new GetClientCaCertificateResponseBody();
        return TeaModel.build(map, self);
    }

    public GetClientCaCertificateResponseBody setCertificate(String certificate) {
        this.certificate = certificate;
        return this;
    }
    public String getCertificate() {
        return this.certificate;
    }

    public GetClientCaCertificateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetClientCaCertificateResponseBody setResult(GetClientCaCertificateResponseBodyResult result) {
        this.result = result;
        return this;
    }
    public GetClientCaCertificateResponseBodyResult getResult() {
        return this.result;
    }

    public GetClientCaCertificateResponseBody setSiteId(Long siteId) {
        this.siteId = siteId;
        return this;
    }
    public Long getSiteId() {
        return this.siteId;
    }

    public GetClientCaCertificateResponseBody setSiteName(String siteName) {
        this.siteName = siteName;
        return this;
    }
    public String getSiteName() {
        return this.siteName;
    }

    public GetClientCaCertificateResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public static class GetClientCaCertificateResponseBodyResult extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p><a href="http://www.example.com">www.example.com</a></p>
         */
        @NameInMap("CommonName")
        public String commonName;

        /**
         * <strong>example:</strong>
         * <p>2024-03-05 18:24:04</p>
         */
        @NameInMap("CreateTime")
        public String createTime;

        /**
         * <strong>example:</strong>
         * <p>babab9db65ee5efcca9f3d41d4b5****</p>
         */
        @NameInMap("Id")
        public String id;

        /**
         * <strong>example:</strong>
         * <p>GlobalSign nv-sa</p>
         */
        @NameInMap("Issuer")
        public String issuer;

        /**
         * <strong>example:</strong>
         * <p>yourCertName</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <strong>example:</strong>
         * <p>2024-03-31 02:08:00</p>
         */
        @NameInMap("NotAfter")
        public String notAfter;

        /**
         * <strong>example:</strong>
         * <p>2023-03-31 02:08:00</p>
         */
        @NameInMap("NotBefore")
        public String notBefore;

        /**
         * <strong>example:</strong>
         * <p>RSA</p>
         */
        @NameInMap("PubkeyAlgorithm")
        public String pubkeyAlgorithm;

        /**
         * <strong>example:</strong>
         * <p><a href="http://www.example.com,*.example.com">www.example.com,*.example.com</a></p>
         */
        @NameInMap("SAN")
        public String SAN;

        /**
         * <strong>example:</strong>
         * <p>SHA256-RSA</p>
         */
        @NameInMap("SignatureAlgorithm")
        public String signatureAlgorithm;

        /**
         * <strong>example:</strong>
         * <p>OK</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <strong>example:</strong>
         * <p>upload</p>
         */
        @NameInMap("Type")
        public String type;

        /**
         * <strong>example:</strong>
         * <p>2024-03-05 18:24:04</p>
         */
        @NameInMap("UpdateTime")
        public String updateTime;

        public static GetClientCaCertificateResponseBodyResult build(java.util.Map<String, ?> map) throws Exception {
            GetClientCaCertificateResponseBodyResult self = new GetClientCaCertificateResponseBodyResult();
            return TeaModel.build(map, self);
        }

        public GetClientCaCertificateResponseBodyResult setCommonName(String commonName) {
            this.commonName = commonName;
            return this;
        }
        public String getCommonName() {
            return this.commonName;
        }

        public GetClientCaCertificateResponseBodyResult setCreateTime(String createTime) {
            this.createTime = createTime;
            return this;
        }
        public String getCreateTime() {
            return this.createTime;
        }

        public GetClientCaCertificateResponseBodyResult setId(String id) {
            this.id = id;
            return this;
        }
        public String getId() {
            return this.id;
        }

        public GetClientCaCertificateResponseBodyResult setIssuer(String issuer) {
            this.issuer = issuer;
            return this;
        }
        public String getIssuer() {
            return this.issuer;
        }

        public GetClientCaCertificateResponseBodyResult setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetClientCaCertificateResponseBodyResult setNotAfter(String notAfter) {
            this.notAfter = notAfter;
            return this;
        }
        public String getNotAfter() {
            return this.notAfter;
        }

        public GetClientCaCertificateResponseBodyResult setNotBefore(String notBefore) {
            this.notBefore = notBefore;
            return this;
        }
        public String getNotBefore() {
            return this.notBefore;
        }

        public GetClientCaCertificateResponseBodyResult setPubkeyAlgorithm(String pubkeyAlgorithm) {
            this.pubkeyAlgorithm = pubkeyAlgorithm;
            return this;
        }
        public String getPubkeyAlgorithm() {
            return this.pubkeyAlgorithm;
        }

        public GetClientCaCertificateResponseBodyResult setSAN(String SAN) {
            this.SAN = SAN;
            return this;
        }
        public String getSAN() {
            return this.SAN;
        }

        public GetClientCaCertificateResponseBodyResult setSignatureAlgorithm(String signatureAlgorithm) {
            this.signatureAlgorithm = signatureAlgorithm;
            return this;
        }
        public String getSignatureAlgorithm() {
            return this.signatureAlgorithm;
        }

        public GetClientCaCertificateResponseBodyResult setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetClientCaCertificateResponseBodyResult setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

        public GetClientCaCertificateResponseBodyResult setUpdateTime(String updateTime) {
            this.updateTime = updateTime;
            return this;
        }
        public String getUpdateTime() {
            return this.updateTime;
        }

    }

}
