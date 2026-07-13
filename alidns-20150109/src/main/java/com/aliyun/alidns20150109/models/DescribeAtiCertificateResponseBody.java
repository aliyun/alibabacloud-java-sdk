// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeAtiCertificateResponseBody extends TeaModel {
    /**
     * <p>The access denied details. This field is returned only when RAM authentication fails.</p>
     */
    @NameInMap("AccessDeniedDetail")
    public DescribeAtiCertificateResponseBodyAccessDeniedDetail accessDeniedDetail;

    /**
     * <p>The agent host address.</p>
     * 
     * <strong>example:</strong>
     * <p><a href="http://www.example.com">www.example.com</a></p>
     */
    @NameInMap("AgentHost")
    public String agentHost;

    /**
     * <p>The agent ID. After CNNIC real-name authentication, CNNIC assigns a unified agent ID. The agent ID serves as the unique identifier that binds the agent to the real-name authenticated registrant.</p>
     * 
     * <strong>example:</strong>
     * <p>csp01860716@5e0964fd-951c-4e45-b518-d09d4d2db8ca</p>
     */
    @NameInMap("AgentId")
    public String agentId;

    /**
     * <p>The encryption algorithm of the certificate.</p>
     * 
     * <strong>example:</strong>
     * <p>RSA-2048</p>
     */
    @NameInMap("Algorithm")
    public String algorithm;

    /**
     * <p>The certificate file in PEM format.</p>
     * 
     * <strong>example:</strong>
     * <p>-----BEGIN CERTIFICATE-----
     * MIIDrzCCApegAwIBAgIQCDvgVpBCRrGhdWrJWZHHSjANBgkqhkiG9w0BAQUFAD...
     * （中间是一长串经过 Base64 编码的数据）
     * ...
     * -----END CERTIFICATE-----</p>
     */
    @NameInMap("CertPem")
    public String certPem;

    /**
     * <p>The certificate type. Valid values:</p>
     * <ul>
     * <li>Server: server certificate.</li>
     * <li>Identity: identity certificate.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Server</p>
     */
    @NameInMap("CertType")
    public String certType;

    /**
     * <p>The creation time of the health check template (timestamp).</p>
     * 
     * <strong>example:</strong>
     * <p>1527690629357</p>
     */
    @NameInMap("CreateTimestamp")
    public Long createTimestamp;

    /**
     * <p>The issuer information of the certificate, identified in Distinguished Names (DN) format.</p>
     * 
     * <strong>example:</strong>
     * <p>DigiCert Inc</p>
     */
    @NameInMap("Issuer")
    public String issuer;

    /**
     * <p>The end time of the certificate validity period.</p>
     * 
     * <strong>example:</strong>
     * <p>2027-05-09 02:19:49</p>
     */
    @NameInMap("NotAfter")
    public String notAfter;

    /**
     * <p>The start time of the certificate validity period.</p>
     * 
     * <strong>example:</strong>
     * <p>2026-01-26 02:16:38</p>
     */
    @NameInMap("NotBefore")
    public String notBefore;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>29D0F8F8-5499-4F6C-9FDC-1EE13BF55925</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The Subject Alternative Name (SAN), which specifies additional identities for the certificate subject.</p>
     * 
     * <strong>example:</strong>
     * <p>&quot;dNSName: example.com, dNSName: <a href="http://www.example.com">www.example.com</a>&quot;,</p>
     */
    @NameInMap("San")
    public String san;

    /**
     * <p>The serial number that indicates the priority of the returned address. A smaller value indicates a higher priority.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("SerialNumber")
    public String serialNumber;

    /**
     * <p>The certificate source.</p>
     * 
     * <strong>example:</strong>
     * <p>BYOC</p>
     */
    @NameInMap("Source")
    public String source;

    /**
     * <p>The validity status of the certificate. Valid values:</p>
     * <ul>
     * <li>Valid</li>
     * <li>Invalid</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Valid</p>
     */
    @NameInMap("Status")
    public String status;

    /**
     * <p>The certificate subject (owner), identified in DN format.</p>
     * 
     * <strong>example:</strong>
     * <p>acs:eventbridge:cn-hangzhou:1825725063814405:eventstreaming/dsadsad123213-trigger1</p>
     */
    @NameInMap("Subject")
    public String subject;

    /**
     * <p>The DNS TLSA record value that stores the certificate public key fingerprint.</p>
     * 
     * <strong>example:</strong>
     * <p>3 1 1 2ea103e8c5ba3466ff7f94cc28336b40ce7432e55a2fc37e86b65e55737c45662</p>
     */
    @NameInMap("TlsaFingerprint")
    public String tlsaFingerprint;

    /**
     * <p>The update time (timestamp).</p>
     * 
     * <strong>example:</strong>
     * <p>1527690629357</p>
     */
    @NameInMap("UpdateTimestamp")
    public Long updateTimestamp;

    public static DescribeAtiCertificateResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeAtiCertificateResponseBody self = new DescribeAtiCertificateResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeAtiCertificateResponseBody setAccessDeniedDetail(DescribeAtiCertificateResponseBodyAccessDeniedDetail accessDeniedDetail) {
        this.accessDeniedDetail = accessDeniedDetail;
        return this;
    }
    public DescribeAtiCertificateResponseBodyAccessDeniedDetail getAccessDeniedDetail() {
        return this.accessDeniedDetail;
    }

    public DescribeAtiCertificateResponseBody setAgentHost(String agentHost) {
        this.agentHost = agentHost;
        return this;
    }
    public String getAgentHost() {
        return this.agentHost;
    }

    public DescribeAtiCertificateResponseBody setAgentId(String agentId) {
        this.agentId = agentId;
        return this;
    }
    public String getAgentId() {
        return this.agentId;
    }

    public DescribeAtiCertificateResponseBody setAlgorithm(String algorithm) {
        this.algorithm = algorithm;
        return this;
    }
    public String getAlgorithm() {
        return this.algorithm;
    }

    public DescribeAtiCertificateResponseBody setCertPem(String certPem) {
        this.certPem = certPem;
        return this;
    }
    public String getCertPem() {
        return this.certPem;
    }

    public DescribeAtiCertificateResponseBody setCertType(String certType) {
        this.certType = certType;
        return this;
    }
    public String getCertType() {
        return this.certType;
    }

    public DescribeAtiCertificateResponseBody setCreateTimestamp(Long createTimestamp) {
        this.createTimestamp = createTimestamp;
        return this;
    }
    public Long getCreateTimestamp() {
        return this.createTimestamp;
    }

    public DescribeAtiCertificateResponseBody setIssuer(String issuer) {
        this.issuer = issuer;
        return this;
    }
    public String getIssuer() {
        return this.issuer;
    }

    public DescribeAtiCertificateResponseBody setNotAfter(String notAfter) {
        this.notAfter = notAfter;
        return this;
    }
    public String getNotAfter() {
        return this.notAfter;
    }

    public DescribeAtiCertificateResponseBody setNotBefore(String notBefore) {
        this.notBefore = notBefore;
        return this;
    }
    public String getNotBefore() {
        return this.notBefore;
    }

    public DescribeAtiCertificateResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeAtiCertificateResponseBody setSan(String san) {
        this.san = san;
        return this;
    }
    public String getSan() {
        return this.san;
    }

    public DescribeAtiCertificateResponseBody setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
        return this;
    }
    public String getSerialNumber() {
        return this.serialNumber;
    }

    public DescribeAtiCertificateResponseBody setSource(String source) {
        this.source = source;
        return this;
    }
    public String getSource() {
        return this.source;
    }

    public DescribeAtiCertificateResponseBody setStatus(String status) {
        this.status = status;
        return this;
    }
    public String getStatus() {
        return this.status;
    }

    public DescribeAtiCertificateResponseBody setSubject(String subject) {
        this.subject = subject;
        return this;
    }
    public String getSubject() {
        return this.subject;
    }

    public DescribeAtiCertificateResponseBody setTlsaFingerprint(String tlsaFingerprint) {
        this.tlsaFingerprint = tlsaFingerprint;
        return this;
    }
    public String getTlsaFingerprint() {
        return this.tlsaFingerprint;
    }

    public DescribeAtiCertificateResponseBody setUpdateTimestamp(Long updateTimestamp) {
        this.updateTimestamp = updateTimestamp;
        return this;
    }
    public Long getUpdateTimestamp() {
        return this.updateTimestamp;
    }

    public static class DescribeAtiCertificateResponseBodyAccessDeniedDetail extends TeaModel {
        /**
         * <p>The unauthorized operation that was attempted.</p>
         * 
         * <strong>example:</strong>
         * <p>CreateUser</p>
         */
        @NameInMap("AuthAction")
        public String authAction;

        /**
         * <p>The display name of the authorization principal.</p>
         * 
         * <strong>example:</strong>
         * <p>2015555733387XXXX</p>
         */
        @NameInMap("AuthPrincipalDisplayName")
        public String authPrincipalDisplayName;

        /**
         * <p>The owner ID of the authorization principal.</p>
         * 
         * <strong>example:</strong>
         * <p>10469733312XXX</p>
         */
        @NameInMap("AuthPrincipalOwnerId")
        public String authPrincipalOwnerId;

        /**
         * <p>The identity type.</p>
         * 
         * <strong>example:</strong>
         * <p>SubUser</p>
         */
        @NameInMap("AuthPrincipalType")
        public String authPrincipalType;

        /**
         * <p>The encrypted complete diagnostic message.</p>
         * 
         * <strong>example:</strong>
         * <p>AQEAAAAAaNIARXXXXUQwNjE0LUQzN0XXXXVEQy1BQzExLTMzXXXXNTkxRjk1Ng==</p>
         */
        @NameInMap("EncodedDiagnosticMessage")
        public String encodedDiagnosticMessage;

        /**
         * <p>The reason for the authentication failure. Valid values:</p>
         * <ul>
         * <li>ExplicitDeny: Explicit deny.</li>
         * <li>ImplicitDeny: Implicit deny.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>ImplicitDeny</p>
         */
        @NameInMap("NoPermissionType")
        public String noPermissionType;

        /**
         * <p>The policy type.</p>
         * 
         * <strong>example:</strong>
         * <p>DlpSend</p>
         */
        @NameInMap("PolicyType")
        public String policyType;

        public static DescribeAtiCertificateResponseBodyAccessDeniedDetail build(java.util.Map<String, ?> map) throws Exception {
            DescribeAtiCertificateResponseBodyAccessDeniedDetail self = new DescribeAtiCertificateResponseBodyAccessDeniedDetail();
            return TeaModel.build(map, self);
        }

        public DescribeAtiCertificateResponseBodyAccessDeniedDetail setAuthAction(String authAction) {
            this.authAction = authAction;
            return this;
        }
        public String getAuthAction() {
            return this.authAction;
        }

        public DescribeAtiCertificateResponseBodyAccessDeniedDetail setAuthPrincipalDisplayName(String authPrincipalDisplayName) {
            this.authPrincipalDisplayName = authPrincipalDisplayName;
            return this;
        }
        public String getAuthPrincipalDisplayName() {
            return this.authPrincipalDisplayName;
        }

        public DescribeAtiCertificateResponseBodyAccessDeniedDetail setAuthPrincipalOwnerId(String authPrincipalOwnerId) {
            this.authPrincipalOwnerId = authPrincipalOwnerId;
            return this;
        }
        public String getAuthPrincipalOwnerId() {
            return this.authPrincipalOwnerId;
        }

        public DescribeAtiCertificateResponseBodyAccessDeniedDetail setAuthPrincipalType(String authPrincipalType) {
            this.authPrincipalType = authPrincipalType;
            return this;
        }
        public String getAuthPrincipalType() {
            return this.authPrincipalType;
        }

        public DescribeAtiCertificateResponseBodyAccessDeniedDetail setEncodedDiagnosticMessage(String encodedDiagnosticMessage) {
            this.encodedDiagnosticMessage = encodedDiagnosticMessage;
            return this;
        }
        public String getEncodedDiagnosticMessage() {
            return this.encodedDiagnosticMessage;
        }

        public DescribeAtiCertificateResponseBodyAccessDeniedDetail setNoPermissionType(String noPermissionType) {
            this.noPermissionType = noPermissionType;
            return this;
        }
        public String getNoPermissionType() {
            return this.noPermissionType;
        }

        public DescribeAtiCertificateResponseBodyAccessDeniedDetail setPolicyType(String policyType) {
            this.policyType = policyType;
            return this;
        }
        public String getPolicyType() {
            return this.policyType;
        }

    }

}
