// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class UpdateListenerAttributeRequest extends TeaModel {
    /**
     * <p>The information about the CA certificate.</p>
     */
    @NameInMap("CaCertificates")
    public java.util.List<UpdateListenerAttributeRequestCaCertificates> caCertificates;

    /**
     * <p>Specifies whether to enable mutual authentication. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("CaEnabled")
    public Boolean caEnabled;

    /**
     * <p>The details about the certificates.</p>
     */
    @NameInMap("Certificates")
    public java.util.List<UpdateListenerAttributeRequestCertificates> certificates;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.</p>
     * <blockquote>
     * <p> If you do not specify this parameter, the system automatically uses the <strong>request ID</strong> as the <strong>client token</strong>. The <strong>request ID</strong> may be different for each request.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>5A2CFF0E-5718-45B5-9D4D-70B3FF3898</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The actions of the default forwarding rule.</p>
     */
    @NameInMap("DefaultActions")
    public java.util.List<UpdateListenerAttributeRequestDefaultActions> defaultActions;

    /**
     * <p>Specifies whether to perform only a dry run, without performing the actual request. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: performs only a dry run. The system checks the request for potential issues, including missing parameter values, incorrect request syntax, and service limits. If the request fails the dry run, an error message is returned. If the request passes the dry run, the <code>DryRunOperation</code> error code is returned.</li>
     * <li><strong>false</strong> (default): performs a dry run and performs the actual request. If the request passes the dry run, a <code>2xx HTTP</code> status code is returned and the operation is performed.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>Specifies whether to enable GZIP compression for specific types of files. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("GzipEnabled")
    public Boolean gzipEnabled;

    /**
     * <p>Specifies whether to enable HTTP/2. Valid values:</p>
     * <ul>
     * <li><strong>true</strong></li>
     * <li><strong>false</strong></li>
     * </ul>
     * <blockquote>
     * <p>This parameter is available only when you create an HTTPS listener.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Http2Enabled")
    public Boolean http2Enabled;

    /**
     * <p>The timeout period of an idle connection. Unit: seconds. Valid values: <strong>1 to 60</strong>.</p>
     * <p>If no request is received within the specified timeout period, ALB closes the current connection. When another request is received, ALB establishes a new connection.</p>
     * 
     * <strong>example:</strong>
     * <p>15</p>
     */
    @NameInMap("IdleTimeout")
    public Integer idleTimeout;

    /**
     * <p>The name of the listener.</p>
     * <p>The name must be 2 to 256 characters in length, and can contain letters, digits, and the following special characters: , . ; / @ _ -.</p>
     * 
     * <strong>example:</strong>
     * <p>HTTP_80</p>
     */
    @NameInMap("ListenerDescription")
    public String listenerDescription;

    /**
     * <p>The ID of the Application Load Balancer (ALB) instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>lsr-bp1bpn0kn908w4nbw****</p>
     */
    @NameInMap("ListenerId")
    public String listenerId;

    /**
     * <p>The configuration information when the listener is associated with a QUIC listener.</p>
     */
    @NameInMap("QuicConfig")
    public UpdateListenerAttributeRequestQuicConfig quicConfig;

    /**
     * <p>The timeout period of a request. Unit: seconds. Valid values: <strong>1 to 180</strong>.</p>
     * <p>If no response is received from the backend server within the specified timeout period, ALB returns an <code>HTTP 504</code> error code to the client.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("RequestTimeout")
    public Integer requestTimeout;

    /**
     * <p>The security policy ID. System security policies and custom security policies are supported.</p>
     * <blockquote>
     * <p>This parameter is available only when you create an HTTPS listener.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>tls_cipher_policy_1_0</p>
     */
    @NameInMap("SecurityPolicyId")
    public String securityPolicyId;

    /**
     * <p>The configurations of the X-Forwarded-For header.</p>
     */
    @NameInMap("XForwardedForConfig")
    public UpdateListenerAttributeRequestXForwardedForConfig XForwardedForConfig;

    public static UpdateListenerAttributeRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateListenerAttributeRequest self = new UpdateListenerAttributeRequest();
        return TeaModel.build(map, self);
    }

    public UpdateListenerAttributeRequest setCaCertificates(java.util.List<UpdateListenerAttributeRequestCaCertificates> caCertificates) {
        this.caCertificates = caCertificates;
        return this;
    }
    public java.util.List<UpdateListenerAttributeRequestCaCertificates> getCaCertificates() {
        return this.caCertificates;
    }

    public UpdateListenerAttributeRequest setCaEnabled(Boolean caEnabled) {
        this.caEnabled = caEnabled;
        return this;
    }
    public Boolean getCaEnabled() {
        return this.caEnabled;
    }

    public UpdateListenerAttributeRequest setCertificates(java.util.List<UpdateListenerAttributeRequestCertificates> certificates) {
        this.certificates = certificates;
        return this;
    }
    public java.util.List<UpdateListenerAttributeRequestCertificates> getCertificates() {
        return this.certificates;
    }

    public UpdateListenerAttributeRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public UpdateListenerAttributeRequest setDefaultActions(java.util.List<UpdateListenerAttributeRequestDefaultActions> defaultActions) {
        this.defaultActions = defaultActions;
        return this;
    }
    public java.util.List<UpdateListenerAttributeRequestDefaultActions> getDefaultActions() {
        return this.defaultActions;
    }

    public UpdateListenerAttributeRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public UpdateListenerAttributeRequest setGzipEnabled(Boolean gzipEnabled) {
        this.gzipEnabled = gzipEnabled;
        return this;
    }
    public Boolean getGzipEnabled() {
        return this.gzipEnabled;
    }

    public UpdateListenerAttributeRequest setHttp2Enabled(Boolean http2Enabled) {
        this.http2Enabled = http2Enabled;
        return this;
    }
    public Boolean getHttp2Enabled() {
        return this.http2Enabled;
    }

    public UpdateListenerAttributeRequest setIdleTimeout(Integer idleTimeout) {
        this.idleTimeout = idleTimeout;
        return this;
    }
    public Integer getIdleTimeout() {
        return this.idleTimeout;
    }

    public UpdateListenerAttributeRequest setListenerDescription(String listenerDescription) {
        this.listenerDescription = listenerDescription;
        return this;
    }
    public String getListenerDescription() {
        return this.listenerDescription;
    }

    public UpdateListenerAttributeRequest setListenerId(String listenerId) {
        this.listenerId = listenerId;
        return this;
    }
    public String getListenerId() {
        return this.listenerId;
    }

    public UpdateListenerAttributeRequest setQuicConfig(UpdateListenerAttributeRequestQuicConfig quicConfig) {
        this.quicConfig = quicConfig;
        return this;
    }
    public UpdateListenerAttributeRequestQuicConfig getQuicConfig() {
        return this.quicConfig;
    }

    public UpdateListenerAttributeRequest setRequestTimeout(Integer requestTimeout) {
        this.requestTimeout = requestTimeout;
        return this;
    }
    public Integer getRequestTimeout() {
        return this.requestTimeout;
    }

    public UpdateListenerAttributeRequest setSecurityPolicyId(String securityPolicyId) {
        this.securityPolicyId = securityPolicyId;
        return this;
    }
    public String getSecurityPolicyId() {
        return this.securityPolicyId;
    }

    public UpdateListenerAttributeRequest setXForwardedForConfig(UpdateListenerAttributeRequestXForwardedForConfig XForwardedForConfig) {
        this.XForwardedForConfig = XForwardedForConfig;
        return this;
    }
    public UpdateListenerAttributeRequestXForwardedForConfig getXForwardedForConfig() {
        return this.XForwardedForConfig;
    }

    public static class UpdateListenerAttributeRequestCaCertificates extends TeaModel {
        /**
         * <p>The ID of the CA certificate. You can specify only one CA certificate.</p>
         * <blockquote>
         * <p> This parameter is required if <strong>CaEnabled</strong> is set to <strong>true</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>123359******</p>
         */
        @NameInMap("CertificateId")
        public String certificateId;

        public static UpdateListenerAttributeRequestCaCertificates build(java.util.Map<String, ?> map) throws Exception {
            UpdateListenerAttributeRequestCaCertificates self = new UpdateListenerAttributeRequestCaCertificates();
            return TeaModel.build(map, self);
        }

        public UpdateListenerAttributeRequestCaCertificates setCertificateId(String certificateId) {
            this.certificateId = certificateId;
            return this;
        }
        public String getCertificateId() {
            return this.certificateId;
        }

    }

    public static class UpdateListenerAttributeRequestCertificates extends TeaModel {
        /**
         * <p>The ID of the certificate. Only server certificates are supported. You can specify at most 20 certificate IDs.</p>
         * 
         * <strong>example:</strong>
         * <p>12315790212_166f8204689_1714763408_70998****</p>
         */
        @NameInMap("CertificateId")
        public String certificateId;

        public static UpdateListenerAttributeRequestCertificates build(java.util.Map<String, ?> map) throws Exception {
            UpdateListenerAttributeRequestCertificates self = new UpdateListenerAttributeRequestCertificates();
            return TeaModel.build(map, self);
        }

        public UpdateListenerAttributeRequestCertificates setCertificateId(String certificateId) {
            this.certificateId = certificateId;
            return this;
        }
        public String getCertificateId() {
            return this.certificateId;
        }

    }

    public static class UpdateListenerAttributeRequestDefaultActionsForwardGroupConfigServerGroupTuples extends TeaModel {
        /**
         * <p>The ID of the server group to which requests are forwarded.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>rsp-cige6j5e7p****</p>
         */
        @NameInMap("ServerGroupId")
        public String serverGroupId;

        public static UpdateListenerAttributeRequestDefaultActionsForwardGroupConfigServerGroupTuples build(java.util.Map<String, ?> map) throws Exception {
            UpdateListenerAttributeRequestDefaultActionsForwardGroupConfigServerGroupTuples self = new UpdateListenerAttributeRequestDefaultActionsForwardGroupConfigServerGroupTuples();
            return TeaModel.build(map, self);
        }

        public UpdateListenerAttributeRequestDefaultActionsForwardGroupConfigServerGroupTuples setServerGroupId(String serverGroupId) {
            this.serverGroupId = serverGroupId;
            return this;
        }
        public String getServerGroupId() {
            return this.serverGroupId;
        }

    }

    public static class UpdateListenerAttributeRequestDefaultActionsForwardGroupConfig extends TeaModel {
        /**
         * <p>The server groups to which requests are forwarded.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("ServerGroupTuples")
        public java.util.List<UpdateListenerAttributeRequestDefaultActionsForwardGroupConfigServerGroupTuples> serverGroupTuples;

        public static UpdateListenerAttributeRequestDefaultActionsForwardGroupConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateListenerAttributeRequestDefaultActionsForwardGroupConfig self = new UpdateListenerAttributeRequestDefaultActionsForwardGroupConfig();
            return TeaModel.build(map, self);
        }

        public UpdateListenerAttributeRequestDefaultActionsForwardGroupConfig setServerGroupTuples(java.util.List<UpdateListenerAttributeRequestDefaultActionsForwardGroupConfigServerGroupTuples> serverGroupTuples) {
            this.serverGroupTuples = serverGroupTuples;
            return this;
        }
        public java.util.List<UpdateListenerAttributeRequestDefaultActionsForwardGroupConfigServerGroupTuples> getServerGroupTuples() {
            return this.serverGroupTuples;
        }

    }

    public static class UpdateListenerAttributeRequestDefaultActions extends TeaModel {
        /**
         * <p>The forwarding action. This parameter takes effect only when you set <strong>Type</strong> to <strong>ForwardGroup</strong>. You can specify at most 20 actions.</p>
         */
        @NameInMap("ForwardGroupConfig")
        public UpdateListenerAttributeRequestDefaultActionsForwardGroupConfig forwardGroupConfig;

        /**
         * <p>The action type. You can specify only one type.</p>
         * <p>Set the value to <strong>ForwardGroup</strong>, which specifies that requests are forwarded to multiple server groups.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>ForwardGroup</p>
         */
        @NameInMap("Type")
        public String type;

        public static UpdateListenerAttributeRequestDefaultActions build(java.util.Map<String, ?> map) throws Exception {
            UpdateListenerAttributeRequestDefaultActions self = new UpdateListenerAttributeRequestDefaultActions();
            return TeaModel.build(map, self);
        }

        public UpdateListenerAttributeRequestDefaultActions setForwardGroupConfig(UpdateListenerAttributeRequestDefaultActionsForwardGroupConfig forwardGroupConfig) {
            this.forwardGroupConfig = forwardGroupConfig;
            return this;
        }
        public UpdateListenerAttributeRequestDefaultActionsForwardGroupConfig getForwardGroupConfig() {
            return this.forwardGroupConfig;
        }

        public UpdateListenerAttributeRequestDefaultActions setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class UpdateListenerAttributeRequestQuicConfig extends TeaModel {
        /**
         * <p>The QUIC listener ID. This parameter is required if <strong>QuicUpgradeEnabled</strong> is set to <strong>true</strong>. Only HTTPS listeners support this parameter.</p>
         * <blockquote>
         * <p>You must add the HTTPS listener and the QUIC listener to the same ALB instance. In addition, make sure that the QUIC listener has never been associated with another listener.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>lsn-333</p>
         */
        @NameInMap("QuicListenerId")
        public String quicListenerId;

        /**
         * <p>Specifies whether to enable QUIC upgrade. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * <blockquote>
         * <p>Only HTTPS listeners support this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("QuicUpgradeEnabled")
        public Boolean quicUpgradeEnabled;

        public static UpdateListenerAttributeRequestQuicConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateListenerAttributeRequestQuicConfig self = new UpdateListenerAttributeRequestQuicConfig();
            return TeaModel.build(map, self);
        }

        public UpdateListenerAttributeRequestQuicConfig setQuicListenerId(String quicListenerId) {
            this.quicListenerId = quicListenerId;
            return this;
        }
        public String getQuicListenerId() {
            return this.quicListenerId;
        }

        public UpdateListenerAttributeRequestQuicConfig setQuicUpgradeEnabled(Boolean quicUpgradeEnabled) {
            this.quicUpgradeEnabled = quicUpgradeEnabled;
            return this;
        }
        public Boolean getQuicUpgradeEnabled() {
            return this.quicUpgradeEnabled;
        }

    }

    public static class UpdateListenerAttributeRequestXForwardedForConfig extends TeaModel {
        /**
         * <p>The name of the custom header. The header takes effect only when you set <strong>XForwardedForClientCertClientVerifyEnabled</strong> to <strong>true</strong>.</p>
         * <p>The name must be 1 to 40 characters in length. The name can contain lowercase letters, digits, hyphens (-), and underscores (-).</p>
         * <blockquote>
         * <p> Only HTTPS listeners support this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>test_client-verify-alias_123456</p>
         */
        @NameInMap("XForwardedForClientCertClientVerifyAlias")
        public String XForwardedForClientCertClientVerifyAlias;

        /**
         * <p>Specifies whether to use the <code>X-Forwarded-Clientcert-clientverify</code> header to retrieve the verification result of the client certificate. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * <blockquote>
         * <p> Only HTTPS listeners support this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("XForwardedForClientCertClientVerifyEnabled")
        public Boolean XForwardedForClientCertClientVerifyEnabled;

        /**
         * <p>The name of the custom header. The header takes effect only when you set <strong>XForwardedForClientCertFingerprintEnabled</strong> to <strong>true</strong>.</p>
         * <p>The name must be 1 to 40 characters in length. The name can contain lowercase letters, digits, hyphens (-), and underscores (-).</p>
         * <blockquote>
         * <p> Only HTTPS listeners support this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>test_finger-print-alias_123456</p>
         */
        @NameInMap("XForwardedForClientCertFingerprintAlias")
        public String XForwardedForClientCertFingerprintAlias;

        /**
         * <p>Specifies whether to use the <code>X-Forwarded-Clientcert-fingerprint</code> header to retrieve the fingerprint of the client certificate. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * <blockquote>
         * <p> Only HTTPS listeners support this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("XForwardedForClientCertFingerprintEnabled")
        public Boolean XForwardedForClientCertFingerprintEnabled;

        /**
         * <p>The name of the custom header. The header takes effect only when you set <strong>XForwardedForClientCertIssuerDNEnabled</strong> to <strong>true</strong>.</p>
         * <p>The name must be 1 to 40 characters in length. The name can contain lowercase letters, digits, hyphens (-), and underscores (-).</p>
         * <blockquote>
         * <p> Only HTTPS listeners support this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>test_issue-dn-alias_123456</p>
         */
        @NameInMap("XForwardedForClientCertIssuerDNAlias")
        public String XForwardedForClientCertIssuerDNAlias;

        /**
         * <p>Specifies whether to use the <code>X-Forwarded-Clientcert-issuerdn</code> header to retrieve information about the authority that issues the client certificate. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * <blockquote>
         * <p> Only HTTPS listeners support this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("XForwardedForClientCertIssuerDNEnabled")
        public Boolean XForwardedForClientCertIssuerDNEnabled;

        /**
         * <p>The name of the custom header. This parameter is valid only if the <strong>XForwardedForClientCertSubjectDNEnabled</strong> parameter is set to true.****</p>
         * <p>The name must be 1 to 40 characters in length, The name can contain lowercase letters, digits, hyphens (-), and underscores (-).</p>
         * <blockquote>
         * <p> Only HTTPS listeners support this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>test_subject-dn-alias_123456</p>
         */
        @NameInMap("XForwardedForClientCertSubjectDNAlias")
        public String XForwardedForClientCertSubjectDNAlias;

        /**
         * <p>Specifies whether to use the <code>X-Forwarded-Clientcert-subjectdn</code> header to retrieve information about the owner of the client certificate. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * <blockquote>
         * <p> Only HTTPS listeners support this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("XForwardedForClientCertSubjectDNEnabled")
        public Boolean XForwardedForClientCertSubjectDNEnabled;

        /**
         * <p>Specifies whether to use the X-Forwarded-For header to preserve client IP addresses. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * <blockquote>
         * <p> This parameter is returned only for HTTP and HTTPS listeners.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("XForwardedForClientSourceIpsEnabled")
        public Boolean XForwardedForClientSourceIpsEnabled;

        /**
         * <p>The trusted proxy IP address.</p>
         * <p>ALB instances traverse the IP addresses in the <code>X-Forwarded-For</code> header from the rightmost IP address to the leftmost IP address. The first IP address that is not on the trusted IP address list is considered the client IP address. Requests from the client IP address are throttled.</p>
         * 
         * <strong>example:</strong>
         * <p>10.1.1.0/24</p>
         */
        @NameInMap("XForwardedForClientSourceIpsTrusted")
        public String XForwardedForClientSourceIpsTrusted;

        /**
         * <p>Specifies whether to use the <code>X-Forwarded-Client-Port</code> header to retrieve the client port. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * <blockquote>
         * <p> This parameter is returned only for HTTP and HTTPS listeners.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("XForwardedForClientSrcPortEnabled")
        public Boolean XForwardedForClientSrcPortEnabled;

        /**
         * <p>Specifies whether to use the <code>X-Forwarded-For</code> header to retrieve client IP addresses. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * <blockquote>
         * <p> This parameter is returned only for HTTP and HTTPS listeners.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("XForwardedForEnabled")
        public Boolean XForwardedForEnabled;

        /**
         * <p>Specifies whether to use the <code>X-Forwarded-Proto</code> header to retrieve the listener protocol. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * <blockquote>
         * <p> This parameter is supported by HTTP, HTTPS, and QUIC listeners.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("XForwardedForProtoEnabled")
        public Boolean XForwardedForProtoEnabled;

        /**
         * <p>Specifies whether to use the <code>SLB-ID</code> header to retrieve the ID of the ALB instance. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * <blockquote>
         * <p> This parameter is supported by HTTP, HTTPS, and QUIC listeners.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("XForwardedForSLBIdEnabled")
        public Boolean XForwardedForSLBIdEnabled;

        /**
         * <p>Specifies whether to use the <code>X-Forwarded-Port</code> header to retrieve the listener port of the ALB instance. Valid values:</p>
         * <ul>
         * <li><strong>true</strong></li>
         * <li><strong>false</strong></li>
         * </ul>
         * <blockquote>
         * <p> This parameter is supported by HTTP, HTTPS, and QUIC listeners.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("XForwardedForSLBPortEnabled")
        public Boolean XForwardedForSLBPortEnabled;

        public static UpdateListenerAttributeRequestXForwardedForConfig build(java.util.Map<String, ?> map) throws Exception {
            UpdateListenerAttributeRequestXForwardedForConfig self = new UpdateListenerAttributeRequestXForwardedForConfig();
            return TeaModel.build(map, self);
        }

        public UpdateListenerAttributeRequestXForwardedForConfig setXForwardedForClientCertClientVerifyAlias(String XForwardedForClientCertClientVerifyAlias) {
            this.XForwardedForClientCertClientVerifyAlias = XForwardedForClientCertClientVerifyAlias;
            return this;
        }
        public String getXForwardedForClientCertClientVerifyAlias() {
            return this.XForwardedForClientCertClientVerifyAlias;
        }

        public UpdateListenerAttributeRequestXForwardedForConfig setXForwardedForClientCertClientVerifyEnabled(Boolean XForwardedForClientCertClientVerifyEnabled) {
            this.XForwardedForClientCertClientVerifyEnabled = XForwardedForClientCertClientVerifyEnabled;
            return this;
        }
        public Boolean getXForwardedForClientCertClientVerifyEnabled() {
            return this.XForwardedForClientCertClientVerifyEnabled;
        }

        public UpdateListenerAttributeRequestXForwardedForConfig setXForwardedForClientCertFingerprintAlias(String XForwardedForClientCertFingerprintAlias) {
            this.XForwardedForClientCertFingerprintAlias = XForwardedForClientCertFingerprintAlias;
            return this;
        }
        public String getXForwardedForClientCertFingerprintAlias() {
            return this.XForwardedForClientCertFingerprintAlias;
        }

        public UpdateListenerAttributeRequestXForwardedForConfig setXForwardedForClientCertFingerprintEnabled(Boolean XForwardedForClientCertFingerprintEnabled) {
            this.XForwardedForClientCertFingerprintEnabled = XForwardedForClientCertFingerprintEnabled;
            return this;
        }
        public Boolean getXForwardedForClientCertFingerprintEnabled() {
            return this.XForwardedForClientCertFingerprintEnabled;
        }

        public UpdateListenerAttributeRequestXForwardedForConfig setXForwardedForClientCertIssuerDNAlias(String XForwardedForClientCertIssuerDNAlias) {
            this.XForwardedForClientCertIssuerDNAlias = XForwardedForClientCertIssuerDNAlias;
            return this;
        }
        public String getXForwardedForClientCertIssuerDNAlias() {
            return this.XForwardedForClientCertIssuerDNAlias;
        }

        public UpdateListenerAttributeRequestXForwardedForConfig setXForwardedForClientCertIssuerDNEnabled(Boolean XForwardedForClientCertIssuerDNEnabled) {
            this.XForwardedForClientCertIssuerDNEnabled = XForwardedForClientCertIssuerDNEnabled;
            return this;
        }
        public Boolean getXForwardedForClientCertIssuerDNEnabled() {
            return this.XForwardedForClientCertIssuerDNEnabled;
        }

        public UpdateListenerAttributeRequestXForwardedForConfig setXForwardedForClientCertSubjectDNAlias(String XForwardedForClientCertSubjectDNAlias) {
            this.XForwardedForClientCertSubjectDNAlias = XForwardedForClientCertSubjectDNAlias;
            return this;
        }
        public String getXForwardedForClientCertSubjectDNAlias() {
            return this.XForwardedForClientCertSubjectDNAlias;
        }

        public UpdateListenerAttributeRequestXForwardedForConfig setXForwardedForClientCertSubjectDNEnabled(Boolean XForwardedForClientCertSubjectDNEnabled) {
            this.XForwardedForClientCertSubjectDNEnabled = XForwardedForClientCertSubjectDNEnabled;
            return this;
        }
        public Boolean getXForwardedForClientCertSubjectDNEnabled() {
            return this.XForwardedForClientCertSubjectDNEnabled;
        }

        public UpdateListenerAttributeRequestXForwardedForConfig setXForwardedForClientSourceIpsEnabled(Boolean XForwardedForClientSourceIpsEnabled) {
            this.XForwardedForClientSourceIpsEnabled = XForwardedForClientSourceIpsEnabled;
            return this;
        }
        public Boolean getXForwardedForClientSourceIpsEnabled() {
            return this.XForwardedForClientSourceIpsEnabled;
        }

        public UpdateListenerAttributeRequestXForwardedForConfig setXForwardedForClientSourceIpsTrusted(String XForwardedForClientSourceIpsTrusted) {
            this.XForwardedForClientSourceIpsTrusted = XForwardedForClientSourceIpsTrusted;
            return this;
        }
        public String getXForwardedForClientSourceIpsTrusted() {
            return this.XForwardedForClientSourceIpsTrusted;
        }

        public UpdateListenerAttributeRequestXForwardedForConfig setXForwardedForClientSrcPortEnabled(Boolean XForwardedForClientSrcPortEnabled) {
            this.XForwardedForClientSrcPortEnabled = XForwardedForClientSrcPortEnabled;
            return this;
        }
        public Boolean getXForwardedForClientSrcPortEnabled() {
            return this.XForwardedForClientSrcPortEnabled;
        }

        public UpdateListenerAttributeRequestXForwardedForConfig setXForwardedForEnabled(Boolean XForwardedForEnabled) {
            this.XForwardedForEnabled = XForwardedForEnabled;
            return this;
        }
        public Boolean getXForwardedForEnabled() {
            return this.XForwardedForEnabled;
        }

        public UpdateListenerAttributeRequestXForwardedForConfig setXForwardedForProtoEnabled(Boolean XForwardedForProtoEnabled) {
            this.XForwardedForProtoEnabled = XForwardedForProtoEnabled;
            return this;
        }
        public Boolean getXForwardedForProtoEnabled() {
            return this.XForwardedForProtoEnabled;
        }

        public UpdateListenerAttributeRequestXForwardedForConfig setXForwardedForSLBIdEnabled(Boolean XForwardedForSLBIdEnabled) {
            this.XForwardedForSLBIdEnabled = XForwardedForSLBIdEnabled;
            return this;
        }
        public Boolean getXForwardedForSLBIdEnabled() {
            return this.XForwardedForSLBIdEnabled;
        }

        public UpdateListenerAttributeRequestXForwardedForConfig setXForwardedForSLBPortEnabled(Boolean XForwardedForSLBPortEnabled) {
            this.XForwardedForSLBPortEnabled = XForwardedForSLBPortEnabled;
            return this;
        }
        public Boolean getXForwardedForSLBPortEnabled() {
            return this.XForwardedForSLBPortEnabled;
        }

    }

}
