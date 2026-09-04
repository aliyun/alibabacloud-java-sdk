// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class UpdateListenerAttributeRequest extends TeaModel {
    /**
     * <p>The CA certificate list. Only one CA certificate is supported.</p>
     */
    @NameInMap("CaCertificates")
    public java.util.List<UpdateListenerAttributeRequestCaCertificates> caCertificates;

    /**
     * <p>Specifies whether to enable mutual authentication. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: enabled.</li>
     * <li><strong>false</strong>: disabled.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("CaEnabled")
    public Boolean caEnabled;

    /**
     * <p>The certificate list.</p>
     */
    @NameInMap("Certificates")
    public java.util.List<UpdateListenerAttributeRequestCertificates> certificates;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.</p>
     * <blockquote>
     * <p>If you do not specify this parameter, the system automatically uses the <strong>RequestId</strong> as the <strong>ClientToken</strong>. The <strong>RequestId</strong> may be different for each API request.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>5A2CFF0E-5718-45B5-9D4D-70B******</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The list of default rule actions.</p>
     */
    @NameInMap("DefaultActions")
    public java.util.List<UpdateListenerAttributeRequestDefaultActions> defaultActions;

    /**
     * <p>Specifies whether to perform only a dry run, without performing the actual request. Valid values:</p>
     * <ul>
     * <li><p><strong>true</strong>: performs only a dry run. The system checks the request for potential issues, including missing parameter values, incorrect request syntax, and service limits. If the request fails the dry run, an error code is returned. If the request passes the dry run, the <code>DryRunOperation</code> error code is returned.</p>
     * </li>
     * <li><p><strong>false</strong> (default): performs a dry run and performs the actual request. If the request passes the dry run, an <code>HTTP 2xx</code> status code is returned and the operation is performed.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>Specifies whether to enable Gzip compression to compress specific types of files. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: enabled.</li>
     * <li><strong>false</strong>: disabled.</li>
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
     * <li><strong>true</strong>: enabled.</li>
     * <li><strong>false</strong>: disabled.</li>
     * </ul>
     * <blockquote>
     * <p>Only HTTPS listeners support this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Http2Enabled")
    public Boolean http2Enabled;

    /**
     * <p>The idle connection timeout period. Unit: seconds. Valid values: <strong>1 to 600</strong>.</p>
     * <p>If no access request is received within the timeout period, load balancing temporarily breaks the current connection and restores the connection when the next request arrives.</p>
     * 
     * <strong>example:</strong>
     * <p>15</p>
     */
    @NameInMap("IdleTimeout")
    public Integer idleTimeout;

    /**
     * <p>The custom listener name.</p>
     * <p>The name must be 2 to 256 characters in length, and can contain letters, digits, Chinese characters, commas (,), periods (.), semicolons (;), forward slashes (/), at signs (@), underscores (_), and hyphens (-).</p>
     * 
     * <strong>example:</strong>
     * <p>HTTP_80</p>
     */
    @NameInMap("ListenerDescription")
    public String listenerDescription;

    /**
     * <p>The listener ID of the Application Load Balancing (ALB) instance.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>lsn-o4u54y73wq7b******</p>
     */
    @NameInMap("ListenerId")
    public String listenerId;

    /**
     * <p>The configuration information when an associated QUIC listener is enabled.</p>
     */
    @NameInMap("QuicConfig")
    public UpdateListenerAttributeRequestQuicConfig quicConfig;

    /**
     * <p>The request timeout period. Unit: seconds. Valid values: <strong>1 to 600</strong>.</p>
     * <p>If no response is received from the backend server within the timeout period, load balancing returns an <code>HTTP 504</code> error code to the client.</p>
     * 
     * <strong>example:</strong>
     * <p>60</p>
     */
    @NameInMap("RequestTimeout")
    public Integer requestTimeout;

    /**
     * <p>The security policy. System security policies and custom security policies are supported.</p>
     * <blockquote>
     * <p>Only HTTPS listeners support this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>tls_cipher_policy_1_0</p>
     */
    @NameInMap("SecurityPolicyId")
    public String securityPolicyId;

    /**
     * <p>The configuration of the XForwardedFor feature.</p>
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
         * <p>The CA certificate ID.</p>
         * <blockquote>
         * <p>This parameter is required when <strong>CaEnabled</strong> is set to <strong>true</strong>.</p>
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
         * <p>The default certificate ID. Only one default server certificate is supported.</p>
         * <blockquote>
         * <ul>
         * <li>This parameter is required when the listener protocol type is <strong>HTTPS</strong> or <strong>QUIC</strong>.</li>
         * <li>To add more server certificates, invoke <a href="https://help.aliyun.com/document_detail/2254830.html">AssociateAdditionalCertificatesWithListener</a> to configure extension certificates after the listener is created.</li>
         * </ul>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>123157******</p>
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
         * <p>The ID of the destination server group to which requests are forwarded.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>sgp-i5qt20******</p>
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
         * <p>The list of forwarding destination server group tuples.</p>
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
         * <p>The forwarding configuration for the action. This parameter is required and valid only when <strong>Type</strong> is set to <strong>ForwardGroup</strong>. You can add up to 20 forwarding action configurations.</p>
         */
        @NameInMap("ForwardGroupConfig")
        public UpdateListenerAttributeRequestDefaultActionsForwardGroupConfig forwardGroupConfig;

        /**
         * <p>The action type. You can add up to one action type.</p>
         * <p>Valid values: <strong>ForwardGroup</strong>, which indicates that requests are forwarded to multiple server groups.</p>
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
         * <p>The ID of the QUIC listener to be associated. This parameter is required when <strong>QuicUpgradeEnabled</strong> is set to <strong>true</strong>. This parameter is valid only for HTTPS listeners.</p>
         * <blockquote>
         * <p>The original listener and the associated QUIC listener must belong to the same ALB instance, and the QUIC listener must not have been previously associated.</p>
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
         * <li><strong>true</strong>: enabled.</li>
         * <li><strong>false</strong>: disabled.</li>
         * </ul>
         * <blockquote>
         * <p>This parameter is valid only for HTTPS listeners.</p>
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
         * <p>The custom header field name. This parameter takes effect only when <strong>XForwardedForClientCertClientVerifyEnabled</strong> is set to <strong>true</strong>.</p>
         * <p>The name must be 1 to 40 characters in length, and can contain lowercase letters a to z, hyphens (-), underscores (_), and digits.</p>
         * <blockquote>
         * <p>Only HTTPS listeners support this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>test_client-verify-alias_123456</p>
         */
        @NameInMap("XForwardedForClientCertClientVerifyAlias")
        public String XForwardedForClientCertClientVerifyAlias;

        /**
         * <p>Specifies whether to use the <code>X-Forwarded-Clientcert-clientverify</code> header field to retrieve the verification result of the client certificate that accesses the load balancing instance. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: enabled.</li>
         * <li><strong>false</strong>: disabled.</li>
         * </ul>
         * <blockquote>
         * <p>Only HTTPS listeners support this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("XForwardedForClientCertClientVerifyEnabled")
        public Boolean XForwardedForClientCertClientVerifyEnabled;

        /**
         * <p>The custom header field name. This parameter takes effect only when <strong>XForwardedForClientCertFingerprintEnabled</strong> is set to <strong>true</strong>.</p>
         * <p>The name must be 1 to 40 characters in length, and can contain lowercase letters a to z, hyphens (-), underscores (_), and digits.</p>
         * <blockquote>
         * <p>Only HTTPS listeners support this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>test_finger-print-alias_123456</p>
         */
        @NameInMap("XForwardedForClientCertFingerprintAlias")
        public String XForwardedForClientCertFingerprintAlias;

        /**
         * <p>Specifies whether to use the <code>X-Forwarded-Clientcert-fingerprint</code> header field to retrieve the fingerprint of the client certificate that accesses the load balancing instance. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: enabled.</li>
         * <li><strong>false</strong>: disabled.</li>
         * </ul>
         * <blockquote>
         * <p>Only HTTPS listeners support this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("XForwardedForClientCertFingerprintEnabled")
        public Boolean XForwardedForClientCertFingerprintEnabled;

        /**
         * <p>The custom header field name. This parameter takes effect only when <strong>XForwardedForClientCertIssuerDNEnabled</strong> is set to <strong>true</strong>.</p>
         * <p>The name must be 1 to 40 characters in length, and can contain lowercase letters a to z, hyphens (-), underscores (_), and digits.</p>
         * <blockquote>
         * <p>Only HTTPS listeners support this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>test_issue-dn-alias_123456</p>
         */
        @NameInMap("XForwardedForClientCertIssuerDNAlias")
        public String XForwardedForClientCertIssuerDNAlias;

        /**
         * <p>Specifies whether to use the <code>X-Forwarded-Clientcert-issuerdn</code> header field to retrieve the issuer information of the client certificate that accesses the load balancing instance. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: enabled.</li>
         * <li><strong>false</strong>: disabled.</li>
         * </ul>
         * <blockquote>
         * <p>Only HTTPS listeners support this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("XForwardedForClientCertIssuerDNEnabled")
        public Boolean XForwardedForClientCertIssuerDNEnabled;

        /**
         * <p>The custom header field name. This parameter takes effect only when <strong>XForwardedForClientCertSubjectDNEnabled</strong> is set to <strong>true</strong>.</p>
         * <p>The name must be 1 to 40 characters in length, and can contain lowercase letters a to z, hyphens (-), underscores (_), and digits.</p>
         * <blockquote>
         * <p>Only HTTPS listeners support this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>test_subject-dn-alias_123456</p>
         */
        @NameInMap("XForwardedForClientCertSubjectDNAlias")
        public String XForwardedForClientCertSubjectDNAlias;

        /**
         * <p>Specifies whether to use the <code>X-Forwarded-Clientcert-subjectdn</code> header field to retrieve the owner information of the client certificate that accesses the load balancing instance. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: enabled.</li>
         * <li><strong>false</strong>: disabled.</li>
         * </ul>
         * <blockquote>
         * <p>Only HTTPS listeners support this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("XForwardedForClientCertSubjectDNEnabled")
        public Boolean XForwardedForClientCertSubjectDNEnabled;

        /**
         * <p>Specifies whether to allow ALB to retrieve the real client IP address from the X-Forwarded-For header field. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: enabled.</li>
         * <li><strong>false</strong>: disabled.</li>
         * </ul>
         * <blockquote>
         * <p>HTTP and HTTPS listeners support this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("XForwardedForClientSourceIpsEnabled")
        public Boolean XForwardedForClientSourceIpsEnabled;

        /**
         * <p>The trusted proxy IP addresses.</p>
         * <p>Application Load Balancing (ALB) traverses the <code>X-Forwarded-For</code> header field from right to left and selects the first IP address that is not in the trusted IP list as the real client IP address. This IP address is used for source IP-based rate limiting.</p>
         * 
         * <strong>example:</strong>
         * <p>10.1.1.0/24</p>
         */
        @NameInMap("XForwardedForClientSourceIpsTrusted")
        public String XForwardedForClientSourceIpsTrusted;

        /**
         * <p>Specifies whether to use the <code>X-Forwarded-Client-srcport</code> header field to retrieve the port of the client that accesses the load balancing instance. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: enabled.</li>
         * <li><strong>false</strong>: disabled.</li>
         * </ul>
         * <blockquote>
         * <p>HTTP and HTTPS listeners support this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("XForwardedForClientSrcPortEnabled")
        public Boolean XForwardedForClientSrcPortEnabled;

        /**
         * <p>Specifies whether to use the <code>X-Forwarded-For</code> header field to retrieve the real IP address of the client. Valid values:</p>
         * <ul>
         * <li><strong>true</strong> (default): enabled.</li>
         * <li><strong>false</strong>: disabled.</li>
         * </ul>
         * <blockquote>
         * <ol>
         * <li>If you set this parameter to <strong>true</strong>, <strong>XForwardedForProcessingMode</strong> defaults to <strong>append</strong> and can be changed to <strong>remove</strong>.</li>
         * <li>If you set this parameter to <strong>false</strong>, the <code>X-Forwarded-For</code> header field is retained without additional processing before the request is sent to the backend server.</li>
         * <li>HTTP and HTTPS listeners support this parameter.</li>
         * </ol>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("XForwardedForEnabled")
        public Boolean XForwardedForEnabled;

        /**
         * <p>Specifies whether to use the <code>X-Forwarded-Host</code> header field to retrieve the domain name of the client that accesses the load balancing instance. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: enabled.</li>
         * <li><strong>false</strong> (default): disabled.</li>
         * </ul>
         * <blockquote>
         * <p>HTTP, HTTPS, and QUIC listeners support this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("XForwardedForHostEnabled")
        public Boolean XForwardedForHostEnabled;

        /**
         * <p>The processing mode for the <code>X-Forwarded-For</code> header field. This parameter takes effect only when <strong>XForwardedForEnabled</strong> is set to <strong>true</strong>. Valid values:</p>
         * <ul>
         * <li><strong>append</strong> (default): append.</li>
         * <li><strong>remove</strong>: remove.</li>
         * </ul>
         * <blockquote>
         * <ol>
         * <li>If you set this parameter to <strong>append</strong>, the last-hop IP address is appended to the <code>X-Forwarded-For</code> header field before the request is sent to the backend server.</li>
         * <li>If you set this parameter to <strong>remove</strong>, the <code>X-Forwarded-For</code> header is removed before the request is sent to the backend server, regardless of whether the request contains the <code>X-Forwarded-For</code> header field.</li>
         * <li>HTTP and HTTPS listeners support this parameter.</li>
         * </ol>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>append</p>
         */
        @NameInMap("XForwardedForProcessingMode")
        public String XForwardedForProcessingMode;

        /**
         * <p>Specifies whether to use the <code>X-Forwarded-Proto</code> header field to retrieve the listener protocol of the load balancing instance. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: enabled.</li>
         * <li><strong>false</strong>: disabled.</li>
         * </ul>
         * <blockquote>
         * <p>HTTP, HTTPS, and QUIC listeners support this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("XForwardedForProtoEnabled")
        public Boolean XForwardedForProtoEnabled;

        /**
         * <p>Specifies whether to use the <code>SLB-ID</code> header field to retrieve the load balancing instance ID. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: enabled.</li>
         * <li><strong>false</strong>: disabled.</li>
         * </ul>
         * <blockquote>
         * <p>HTTP, HTTPS, and QUIC listeners support this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("XForwardedForSLBIdEnabled")
        public Boolean XForwardedForSLBIdEnabled;

        /**
         * <p>Specifies whether to use the <code>X-Forwarded-Port</code> header field to retrieve the listener port of the load balancing instance. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: enabled.</li>
         * <li><strong>false</strong>: disabled.</li>
         * </ul>
         * <blockquote>
         * <p>HTTP, HTTPS, and QUIC listeners support this parameter.</p>
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

        public UpdateListenerAttributeRequestXForwardedForConfig setXForwardedForHostEnabled(Boolean XForwardedForHostEnabled) {
            this.XForwardedForHostEnabled = XForwardedForHostEnabled;
            return this;
        }
        public Boolean getXForwardedForHostEnabled() {
            return this.XForwardedForHostEnabled;
        }

        public UpdateListenerAttributeRequestXForwardedForConfig setXForwardedForProcessingMode(String XForwardedForProcessingMode) {
            this.XForwardedForProcessingMode = XForwardedForProcessingMode;
            return this;
        }
        public String getXForwardedForProcessingMode() {
            return this.XForwardedForProcessingMode;
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
