// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class CreateListenerRequest extends TeaModel {
    @NameInMap("CaCertificates")
    public java.util.List<CreateListenerRequestCaCertificates> caCertificates;

    /**
     * <p>Specifies whether to enable mutual authentication. Valid values:</p>
     * <br>
     * <p>*   **true**: enables mutual authentication.</p>
     * <p>*   **false** (default): disables mutual authentication.</p>
     */
    @NameInMap("CaEnabled")
    public Boolean caEnabled;

    @NameInMap("Certificates")
    public java.util.List<CreateListenerRequestCertificates> certificates;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <br>
     * <p>You can use the client to generate the value, but you must make sure that it is unique among all requests. The token can contain only ASCII characters.</p>
     * <br>
     * <p>>  If you do not set this parameter, the system automatically uses the value of **RequestId** as the value of **ClientToken**. **RequestId** may be different for each API request.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("DefaultActions")
    public java.util.List<CreateListenerRequestDefaultActions> defaultActions;

    /**
     * <p>Specifies whether to perform only a precheck. Valid values:</p>
     * <br>
     * <p>*   **true**: prechecks the request without creating a listener. The system checks the required parameters, request syntax, and limits. If the request fails the precheck, an error code is returned based on the cause of the failure. If the request passes the precheck, the `DryRunOperation` error code is returned.</p>
     * <p>*   **false** (default): sends the API request. If the request passes the precheck, a 2xx HTTP status code is returned and the system proceeds to create a listener.</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>Specifies whether to enable `Gzip` compression to compress specific types of files. Valid values:</p>
     * <br>
     * <p>*   **true** (default): enables Gzip compression.</p>
     * <p>*   **false**: disables Gzip compression.</p>
     */
    @NameInMap("GzipEnabled")
    public Boolean gzipEnabled;

    /**
     * <p>Specifies whether to enable `HTTP/2`. Valid values:</p>
     * <br>
     * <p>*   **true** (default): enables HTTP/2.</p>
     * <p>*   **false**: disables HTTP/2.</p>
     * <br>
     * <p>>  Only HTTPS listeners support this parameter.</p>
     */
    @NameInMap("Http2Enabled")
    public Boolean http2Enabled;

    /**
     * <p>The timeout period of an idle connection. Unit: seconds.</p>
     * <br>
     * <p>Valid values: **1 to 60**.</p>
     * <br>
     * <p>Default value: **15**.</p>
     * <br>
     * <p>If no requests are received within the specified timeout period, ALB closes the current connection. When a new request is received, ALB establishes a new connection.</p>
     */
    @NameInMap("IdleTimeout")
    public Integer idleTimeout;

    /**
     * <p>The name of the listener.</p>
     * <br>
     * <p>The description must be 2 to 256 characters in length, and can contain letters, digits, hyphens (-), forward slashes (/), periods (.), and underscores (_). Regular expressions are supported.</p>
     */
    @NameInMap("ListenerDescription")
    public String listenerDescription;

    /**
     * <p>The frontend port that is used by the ALB instance.</p>
     * <br>
     * <p>Valid values: **1 to 65535**.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ListenerPort")
    public Integer listenerPort;

    /**
     * <p>The listener protocol.</p>
     * <br>
     * <p>Valid values: **HTTP**, **HTTPS**, and **QUIC**.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("ListenerProtocol")
    public String listenerProtocol;

    /**
     * <p>The ID of the ALB instance.</p>
     * <br>
     * <p>This parameter is required.</p>
     */
    @NameInMap("LoadBalancerId")
    public String loadBalancerId;

    @NameInMap("QuicConfig")
    public CreateListenerRequestQuicConfig quicConfig;

    /**
     * <p>The timeout period of a request. Unit: seconds.</p>
     * <br>
     * <p>Valid values: **1 to 180**.</p>
     * <br>
     * <p>Default value: **60**.</p>
     * <br>
     * <p>If no response is received from the backend server during the request timeout period, ALB sends an `HTTP 504` error code to the client.</p>
     */
    @NameInMap("RequestTimeout")
    public Integer requestTimeout;

    /**
     * <p>The ID of the security policy. System security policies and custom security policies are supported.</p>
     * <br>
     * <p>Default value: **tls_cipher_policy_1_0** (system security policy).</p>
     * <br>
     * <p>>  Only HTTPS listeners support this parameter.</p>
     */
    @NameInMap("SecurityPolicyId")
    public String securityPolicyId;

    /**
     * <p>The tags.</p>
     */
    @NameInMap("Tag")
    public java.util.List<CreateListenerRequestTag> tag;

    @NameInMap("XForwardedForConfig")
    public CreateListenerRequestXForwardedForConfig XForwardedForConfig;

    public static CreateListenerRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateListenerRequest self = new CreateListenerRequest();
        return TeaModel.build(map, self);
    }

    public CreateListenerRequest setCaCertificates(java.util.List<CreateListenerRequestCaCertificates> caCertificates) {
        this.caCertificates = caCertificates;
        return this;
    }
    public java.util.List<CreateListenerRequestCaCertificates> getCaCertificates() {
        return this.caCertificates;
    }

    public CreateListenerRequest setCaEnabled(Boolean caEnabled) {
        this.caEnabled = caEnabled;
        return this;
    }
    public Boolean getCaEnabled() {
        return this.caEnabled;
    }

    public CreateListenerRequest setCertificates(java.util.List<CreateListenerRequestCertificates> certificates) {
        this.certificates = certificates;
        return this;
    }
    public java.util.List<CreateListenerRequestCertificates> getCertificates() {
        return this.certificates;
    }

    public CreateListenerRequest setClientToken(String clientToken) {
        this.clientToken = clientToken;
        return this;
    }
    public String getClientToken() {
        return this.clientToken;
    }

    public CreateListenerRequest setDefaultActions(java.util.List<CreateListenerRequestDefaultActions> defaultActions) {
        this.defaultActions = defaultActions;
        return this;
    }
    public java.util.List<CreateListenerRequestDefaultActions> getDefaultActions() {
        return this.defaultActions;
    }

    public CreateListenerRequest setDryRun(Boolean dryRun) {
        this.dryRun = dryRun;
        return this;
    }
    public Boolean getDryRun() {
        return this.dryRun;
    }

    public CreateListenerRequest setGzipEnabled(Boolean gzipEnabled) {
        this.gzipEnabled = gzipEnabled;
        return this;
    }
    public Boolean getGzipEnabled() {
        return this.gzipEnabled;
    }

    public CreateListenerRequest setHttp2Enabled(Boolean http2Enabled) {
        this.http2Enabled = http2Enabled;
        return this;
    }
    public Boolean getHttp2Enabled() {
        return this.http2Enabled;
    }

    public CreateListenerRequest setIdleTimeout(Integer idleTimeout) {
        this.idleTimeout = idleTimeout;
        return this;
    }
    public Integer getIdleTimeout() {
        return this.idleTimeout;
    }

    public CreateListenerRequest setListenerDescription(String listenerDescription) {
        this.listenerDescription = listenerDescription;
        return this;
    }
    public String getListenerDescription() {
        return this.listenerDescription;
    }

    public CreateListenerRequest setListenerPort(Integer listenerPort) {
        this.listenerPort = listenerPort;
        return this;
    }
    public Integer getListenerPort() {
        return this.listenerPort;
    }

    public CreateListenerRequest setListenerProtocol(String listenerProtocol) {
        this.listenerProtocol = listenerProtocol;
        return this;
    }
    public String getListenerProtocol() {
        return this.listenerProtocol;
    }

    public CreateListenerRequest setLoadBalancerId(String loadBalancerId) {
        this.loadBalancerId = loadBalancerId;
        return this;
    }
    public String getLoadBalancerId() {
        return this.loadBalancerId;
    }

    public CreateListenerRequest setQuicConfig(CreateListenerRequestQuicConfig quicConfig) {
        this.quicConfig = quicConfig;
        return this;
    }
    public CreateListenerRequestQuicConfig getQuicConfig() {
        return this.quicConfig;
    }

    public CreateListenerRequest setRequestTimeout(Integer requestTimeout) {
        this.requestTimeout = requestTimeout;
        return this;
    }
    public Integer getRequestTimeout() {
        return this.requestTimeout;
    }

    public CreateListenerRequest setSecurityPolicyId(String securityPolicyId) {
        this.securityPolicyId = securityPolicyId;
        return this;
    }
    public String getSecurityPolicyId() {
        return this.securityPolicyId;
    }

    public CreateListenerRequest setTag(java.util.List<CreateListenerRequestTag> tag) {
        this.tag = tag;
        return this;
    }
    public java.util.List<CreateListenerRequestTag> getTag() {
        return this.tag;
    }

    public CreateListenerRequest setXForwardedForConfig(CreateListenerRequestXForwardedForConfig XForwardedForConfig) {
        this.XForwardedForConfig = XForwardedForConfig;
        return this;
    }
    public CreateListenerRequestXForwardedForConfig getXForwardedForConfig() {
        return this.XForwardedForConfig;
    }

    public static class CreateListenerRequestCaCertificates extends TeaModel {
        @NameInMap("CertificateId")
        public String certificateId;

        public static CreateListenerRequestCaCertificates build(java.util.Map<String, ?> map) throws Exception {
            CreateListenerRequestCaCertificates self = new CreateListenerRequestCaCertificates();
            return TeaModel.build(map, self);
        }

        public CreateListenerRequestCaCertificates setCertificateId(String certificateId) {
            this.certificateId = certificateId;
            return this;
        }
        public String getCertificateId() {
            return this.certificateId;
        }

    }

    public static class CreateListenerRequestCertificates extends TeaModel {
        /**
         * <p>The ID of the certificate. Only server certificates are supported. You can specify up to 20 certificate IDs.</p>
         */
        @NameInMap("CertificateId")
        public String certificateId;

        public static CreateListenerRequestCertificates build(java.util.Map<String, ?> map) throws Exception {
            CreateListenerRequestCertificates self = new CreateListenerRequestCertificates();
            return TeaModel.build(map, self);
        }

        public CreateListenerRequestCertificates setCertificateId(String certificateId) {
            this.certificateId = certificateId;
            return this;
        }
        public String getCertificateId() {
            return this.certificateId;
        }

    }

    public static class CreateListenerRequestDefaultActionsForwardGroupConfigServerGroupTuples extends TeaModel {
        /**
         * <p>The ID of the server group to which requests are forwarded.</p>
         * <br>
         * <p>This parameter is required.</p>
         */
        @NameInMap("ServerGroupId")
        public String serverGroupId;

        public static CreateListenerRequestDefaultActionsForwardGroupConfigServerGroupTuples build(java.util.Map<String, ?> map) throws Exception {
            CreateListenerRequestDefaultActionsForwardGroupConfigServerGroupTuples self = new CreateListenerRequestDefaultActionsForwardGroupConfigServerGroupTuples();
            return TeaModel.build(map, self);
        }

        public CreateListenerRequestDefaultActionsForwardGroupConfigServerGroupTuples setServerGroupId(String serverGroupId) {
            this.serverGroupId = serverGroupId;
            return this;
        }
        public String getServerGroupId() {
            return this.serverGroupId;
        }

    }

    public static class CreateListenerRequestDefaultActionsForwardGroupConfig extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("ServerGroupTuples")
        public java.util.List<CreateListenerRequestDefaultActionsForwardGroupConfigServerGroupTuples> serverGroupTuples;

        public static CreateListenerRequestDefaultActionsForwardGroupConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateListenerRequestDefaultActionsForwardGroupConfig self = new CreateListenerRequestDefaultActionsForwardGroupConfig();
            return TeaModel.build(map, self);
        }

        public CreateListenerRequestDefaultActionsForwardGroupConfig setServerGroupTuples(java.util.List<CreateListenerRequestDefaultActionsForwardGroupConfigServerGroupTuples> serverGroupTuples) {
            this.serverGroupTuples = serverGroupTuples;
            return this;
        }
        public java.util.List<CreateListenerRequestDefaultActionsForwardGroupConfigServerGroupTuples> getServerGroupTuples() {
            return this.serverGroupTuples;
        }

    }

    public static class CreateListenerRequestDefaultActions extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         */
        @NameInMap("ForwardGroupConfig")
        public CreateListenerRequestDefaultActionsForwardGroupConfig forwardGroupConfig;

        /**
         * <p>The action type. You can specify only one action type. Valid value:</p>
         * <br>
         * <p>**ForwardGroup**: forwards requests to multiple vServer groups.</p>
         * <br>
         * <p>This parameter is required.</p>
         */
        @NameInMap("Type")
        public String type;

        public static CreateListenerRequestDefaultActions build(java.util.Map<String, ?> map) throws Exception {
            CreateListenerRequestDefaultActions self = new CreateListenerRequestDefaultActions();
            return TeaModel.build(map, self);
        }

        public CreateListenerRequestDefaultActions setForwardGroupConfig(CreateListenerRequestDefaultActionsForwardGroupConfig forwardGroupConfig) {
            this.forwardGroupConfig = forwardGroupConfig;
            return this;
        }
        public CreateListenerRequestDefaultActionsForwardGroupConfig getForwardGroupConfig() {
            return this.forwardGroupConfig;
        }

        public CreateListenerRequestDefaultActions setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class CreateListenerRequestQuicConfig extends TeaModel {
        /**
         * <p>The ID of the QUIC listener that you want to associate with the HTTPS listener. Only HTTPS listeners support this parameter. This parameter is required when **QuicUpgradeEnabled** is set to **true**.</p>
         * <br>
         * <p>>  The HTTPS listener and the QUIC listener must be added to the same ALB instance. Make sure that the QUIC listener is not associated with any other listeners.</p>
         */
        @NameInMap("QuicListenerId")
        public String quicListenerId;

        /**
         * <p>Specifies whether to enable QUIC upgrade. Valid values:</p>
         * <br>
         * <p>*   **true**: enables QUIC upgrade.</p>
         * <p>*   **false** (default): disables QUIC upgrade.</p>
         * <br>
         * <p>>  Only HTTPS listeners support this parameter.</p>
         */
        @NameInMap("QuicUpgradeEnabled")
        public Boolean quicUpgradeEnabled;

        public static CreateListenerRequestQuicConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateListenerRequestQuicConfig self = new CreateListenerRequestQuicConfig();
            return TeaModel.build(map, self);
        }

        public CreateListenerRequestQuicConfig setQuicListenerId(String quicListenerId) {
            this.quicListenerId = quicListenerId;
            return this;
        }
        public String getQuicListenerId() {
            return this.quicListenerId;
        }

        public CreateListenerRequestQuicConfig setQuicUpgradeEnabled(Boolean quicUpgradeEnabled) {
            this.quicUpgradeEnabled = quicUpgradeEnabled;
            return this;
        }
        public Boolean getQuicUpgradeEnabled() {
            return this.quicUpgradeEnabled;
        }

    }

    public static class CreateListenerRequestTag extends TeaModel {
        /**
         * <p>The tag key. The tag key can be up to 128 characters in length and cannot start with `acs:` or `aliyun`. It cannot contain `http://` or `https://`.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value. The tag value can be up to 128 characters in length and cannot start with `acs:` or `aliyun`. It cannot contain `http://` or `https://`.</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateListenerRequestTag build(java.util.Map<String, ?> map) throws Exception {
            CreateListenerRequestTag self = new CreateListenerRequestTag();
            return TeaModel.build(map, self);
        }

        public CreateListenerRequestTag setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateListenerRequestTag setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class CreateListenerRequestXForwardedForConfig extends TeaModel {
        /**
         * <p>The name of the custom header. This parameter takes effect only when **XForwardedForClientCertClientVerifyEnabled** is set to **true**.</p>
         * <br>
         * <p>The name must be 1 to 40 characters in length, and can contain lowercase letters, hyphens (-), underscores (_), and digits.</p>
         * <br>
         * <p>>  Only HTTPS listeners support this parameter.</p>
         */
        @NameInMap("XForwardedForClientCertClientVerifyAlias")
        public String XForwardedForClientCertClientVerifyAlias;

        /**
         * <p>Specifies whether to use the `X-Forwarded-Clientcert-clientverify` header to retrieve the verification result of the client certificate. Valid values:</p>
         * <br>
         * <p>*   **true**: uses the X-Forwarded-Clientcert-clientverify header.</p>
         * <p>*   **false** (default): does not use the X-Forwarded-Clientcert-clientverify header.</p>
         * <br>
         * <p>>  Only HTTPS listeners support this parameter.</p>
         */
        @NameInMap("XForwardedForClientCertClientVerifyEnabled")
        public Boolean XForwardedForClientCertClientVerifyEnabled;

        /**
         * <p>The name of the custom header. This parameter takes effect only when **XForwardedForClientCertFingerprintEnabled** is set to **true**.</p>
         * <br>
         * <p>The name must be 1 to 40 characters in length, and can contain lowercase letters, hyphens (-), underscores (_), and digits.</p>
         * <br>
         * <p>>  Only HTTPS listeners support this parameter.</p>
         */
        @NameInMap("XForwardedForClientCertFingerprintAlias")
        public String XForwardedForClientCertFingerprintAlias;

        /**
         * <p>Specifies whether to use the `X-Forwarded-Clientcert-fingerprint` header to retrieve the fingerprint of the client certificate. Valid values:</p>
         * <br>
         * <p>*   **true**: uses the X-Forwarded-Clientcert-fingerprint header.</p>
         * <p>*   **false** (default): does not use the X-Forwarded-Clientcert-fingerprint header.</p>
         * <br>
         * <p>>  Only HTTPS listeners support this parameter.</p>
         */
        @NameInMap("XForwardedForClientCertFingerprintEnabled")
        public Boolean XForwardedForClientCertFingerprintEnabled;

        /**
         * <p>The name of the custom header. This parameter takes effect only when **XForwardedForClientCertIssuerDNEnabled** is set to **true**.</p>
         * <br>
         * <p>The name must be 1 to 40 characters in length, and can contain lowercase letters, hyphens (-), underscores (_), and digits.</p>
         * <br>
         * <p>>  Only HTTPS listeners support this parameter.</p>
         */
        @NameInMap("XForwardedForClientCertIssuerDNAlias")
        public String XForwardedForClientCertIssuerDNAlias;

        /**
         * <p>Specifies whether to use the `X-Forwarded-Clientcert-issuerdn` header to retrieve information about the authority that issues the client certificate. Valid values:</p>
         * <br>
         * <p>*   **true**: uses the X-Forwarded-Clientcert-issuerdn header.</p>
         * <p>*   **false** (default): does not use the X-Forwarded-Clientcert-issuerdn header.</p>
         * <br>
         * <p>>  Only HTTPS listeners support this parameter.</p>
         */
        @NameInMap("XForwardedForClientCertIssuerDNEnabled")
        public Boolean XForwardedForClientCertIssuerDNEnabled;

        /**
         * <p>The name of the custom header. This parameter takes effect only when **XForwardedForClientCertSubjectDNEnabled** is set to **true**.</p>
         * <br>
         * <p>The name must be 1 to 40 characters in length, and can contain lowercase letters, hyphens (-), underscores (_), and digits.</p>
         * <br>
         * <p>>  Only HTTPS listeners support this parameter.</p>
         */
        @NameInMap("XForwardedForClientCertSubjectDNAlias")
        public String XForwardedForClientCertSubjectDNAlias;

        /**
         * <p>Specifies whether to use the `X-Forwarded-Clientcert-subjectdn` header to retrieve information about the owner of the client certificate. Valid values:</p>
         * <br>
         * <p>*   **true**: uses the X-Forwarded-Clientcert-subjectdn header.</p>
         * <p>*   **false** (default): does not use the X-Forwarded-Clientcert-subjectdn header.</p>
         * <br>
         * <p>>  Only HTTPS listeners support this parameter.</p>
         */
        @NameInMap("XForwardedForClientCertSubjectDNEnabled")
        public Boolean XForwardedForClientCertSubjectDNEnabled;

        /**
         * <p>Specifies whether to use the `X-Forwarded-Client-Ip` header to obtain the source IP address of the ALB instance. Valid values:</p>
         * <br>
         * <p>*   **true**: uses the X-Forwarded-Client-Ip header.</p>
         * <p>*   **false** (default): does not use the X-Forwarded-Client-Ip header.</p>
         * <br>
         * <p>>  HTTP, HTTPS, and QUIC listeners support this parameter. The feature corresponding to this parameter is not available by default. If you want to use this feature, submit a ticket.</p>
         */
        @NameInMap("XForwardedForClientSourceIpsEnabled")
        public Boolean XForwardedForClientSourceIpsEnabled;

        /**
         * <p>The trusted proxy IP address.</p>
         * <br>
         * <p>ALB traverses `X-Forwarded-For` backwards and selects the first IP address that is not in the trusted IP list as the originating IP address of the client, which will be throttled if source IP address throttling is enabled.</p>
         */
        @NameInMap("XForwardedForClientSourceIpsTrusted")
        public String XForwardedForClientSourceIpsTrusted;

        /**
         * <p>Specifies whether to use the `X-Forwarded-Client-Port` header to retrieve the client port. Valid values:</p>
         * <br>
         * <p>*   **true**: uses the X-Forwarded-Client-Port header.</p>
         * <p>*   **false** (default): does not use the X-Forwarded-Client-Port header.</p>
         * <br>
         * <p>>  HTTP and HTTPS listeners support this parameter.</p>
         */
        @NameInMap("XForwardedForClientSrcPortEnabled")
        public Boolean XForwardedForClientSrcPortEnabled;

        /**
         * <p>Specifies whether to use the `X-Forwarded-For` header to retrieve client IP addresses. Valid values:</p>
         * <br>
         * <p>*   **true** (default): uses the X-Forwarded-For header.</p>
         * <p>*   **false**: does not use the X-Forwarded-For header.</p>
         * <br>
         * <p>>  HTTP and HTTPS listeners support this parameter.</p>
         */
        @NameInMap("XForwardedForEnabled")
        public Boolean XForwardedForEnabled;

        /**
         * <p>Specifies whether to use the `X-Forwarded-Proto` header to retrieve the listening protocol of the ALB instance. Valid values:</p>
         * <br>
         * <p>*   **true**: uses the X-Forwarded-Proto header.</p>
         * <p>*   **false** (default): does not use the X-Forwarded-Proto header.</p>
         * <br>
         * <p>>  HTTP, HTTPS, and QUIC listeners support this parameter.</p>
         */
        @NameInMap("XForwardedForProtoEnabled")
        public Boolean XForwardedForProtoEnabled;

        /**
         * <p>Specifies whether to use the `SLB-ID` header to retrieve the ID of the ALB instance. Valid values:</p>
         * <br>
         * <p>*   **true**: uses the SLB-ID header.</p>
         * <p>*   **false** (default): does not use the SLB-ID header.</p>
         * <br>
         * <p>>  HTTP, HTTPS, and QUIC listeners support this parameter.</p>
         */
        @NameInMap("XForwardedForSLBIdEnabled")
        public Boolean XForwardedForSLBIdEnabled;

        /**
         * <p>Specifies whether to use the `X-Forwarded-Port` header to retrieve the listening port of the ALB instance. Valid values:</p>
         * <br>
         * <p>*   **true**: uses the X-Forwarded-Port header.</p>
         * <p>*   **false** (default): does not use the X-Forwarded-Port header.</p>
         * <br>
         * <p>>  HTTP, HTTPS, and QUIC listeners support this parameter.</p>
         */
        @NameInMap("XForwardedForSLBPortEnabled")
        public Boolean XForwardedForSLBPortEnabled;

        public static CreateListenerRequestXForwardedForConfig build(java.util.Map<String, ?> map) throws Exception {
            CreateListenerRequestXForwardedForConfig self = new CreateListenerRequestXForwardedForConfig();
            return TeaModel.build(map, self);
        }

        public CreateListenerRequestXForwardedForConfig setXForwardedForClientCertClientVerifyAlias(String XForwardedForClientCertClientVerifyAlias) {
            this.XForwardedForClientCertClientVerifyAlias = XForwardedForClientCertClientVerifyAlias;
            return this;
        }
        public String getXForwardedForClientCertClientVerifyAlias() {
            return this.XForwardedForClientCertClientVerifyAlias;
        }

        public CreateListenerRequestXForwardedForConfig setXForwardedForClientCertClientVerifyEnabled(Boolean XForwardedForClientCertClientVerifyEnabled) {
            this.XForwardedForClientCertClientVerifyEnabled = XForwardedForClientCertClientVerifyEnabled;
            return this;
        }
        public Boolean getXForwardedForClientCertClientVerifyEnabled() {
            return this.XForwardedForClientCertClientVerifyEnabled;
        }

        public CreateListenerRequestXForwardedForConfig setXForwardedForClientCertFingerprintAlias(String XForwardedForClientCertFingerprintAlias) {
            this.XForwardedForClientCertFingerprintAlias = XForwardedForClientCertFingerprintAlias;
            return this;
        }
        public String getXForwardedForClientCertFingerprintAlias() {
            return this.XForwardedForClientCertFingerprintAlias;
        }

        public CreateListenerRequestXForwardedForConfig setXForwardedForClientCertFingerprintEnabled(Boolean XForwardedForClientCertFingerprintEnabled) {
            this.XForwardedForClientCertFingerprintEnabled = XForwardedForClientCertFingerprintEnabled;
            return this;
        }
        public Boolean getXForwardedForClientCertFingerprintEnabled() {
            return this.XForwardedForClientCertFingerprintEnabled;
        }

        public CreateListenerRequestXForwardedForConfig setXForwardedForClientCertIssuerDNAlias(String XForwardedForClientCertIssuerDNAlias) {
            this.XForwardedForClientCertIssuerDNAlias = XForwardedForClientCertIssuerDNAlias;
            return this;
        }
        public String getXForwardedForClientCertIssuerDNAlias() {
            return this.XForwardedForClientCertIssuerDNAlias;
        }

        public CreateListenerRequestXForwardedForConfig setXForwardedForClientCertIssuerDNEnabled(Boolean XForwardedForClientCertIssuerDNEnabled) {
            this.XForwardedForClientCertIssuerDNEnabled = XForwardedForClientCertIssuerDNEnabled;
            return this;
        }
        public Boolean getXForwardedForClientCertIssuerDNEnabled() {
            return this.XForwardedForClientCertIssuerDNEnabled;
        }

        public CreateListenerRequestXForwardedForConfig setXForwardedForClientCertSubjectDNAlias(String XForwardedForClientCertSubjectDNAlias) {
            this.XForwardedForClientCertSubjectDNAlias = XForwardedForClientCertSubjectDNAlias;
            return this;
        }
        public String getXForwardedForClientCertSubjectDNAlias() {
            return this.XForwardedForClientCertSubjectDNAlias;
        }

        public CreateListenerRequestXForwardedForConfig setXForwardedForClientCertSubjectDNEnabled(Boolean XForwardedForClientCertSubjectDNEnabled) {
            this.XForwardedForClientCertSubjectDNEnabled = XForwardedForClientCertSubjectDNEnabled;
            return this;
        }
        public Boolean getXForwardedForClientCertSubjectDNEnabled() {
            return this.XForwardedForClientCertSubjectDNEnabled;
        }

        public CreateListenerRequestXForwardedForConfig setXForwardedForClientSourceIpsEnabled(Boolean XForwardedForClientSourceIpsEnabled) {
            this.XForwardedForClientSourceIpsEnabled = XForwardedForClientSourceIpsEnabled;
            return this;
        }
        public Boolean getXForwardedForClientSourceIpsEnabled() {
            return this.XForwardedForClientSourceIpsEnabled;
        }

        public CreateListenerRequestXForwardedForConfig setXForwardedForClientSourceIpsTrusted(String XForwardedForClientSourceIpsTrusted) {
            this.XForwardedForClientSourceIpsTrusted = XForwardedForClientSourceIpsTrusted;
            return this;
        }
        public String getXForwardedForClientSourceIpsTrusted() {
            return this.XForwardedForClientSourceIpsTrusted;
        }

        public CreateListenerRequestXForwardedForConfig setXForwardedForClientSrcPortEnabled(Boolean XForwardedForClientSrcPortEnabled) {
            this.XForwardedForClientSrcPortEnabled = XForwardedForClientSrcPortEnabled;
            return this;
        }
        public Boolean getXForwardedForClientSrcPortEnabled() {
            return this.XForwardedForClientSrcPortEnabled;
        }

        public CreateListenerRequestXForwardedForConfig setXForwardedForEnabled(Boolean XForwardedForEnabled) {
            this.XForwardedForEnabled = XForwardedForEnabled;
            return this;
        }
        public Boolean getXForwardedForEnabled() {
            return this.XForwardedForEnabled;
        }

        public CreateListenerRequestXForwardedForConfig setXForwardedForProtoEnabled(Boolean XForwardedForProtoEnabled) {
            this.XForwardedForProtoEnabled = XForwardedForProtoEnabled;
            return this;
        }
        public Boolean getXForwardedForProtoEnabled() {
            return this.XForwardedForProtoEnabled;
        }

        public CreateListenerRequestXForwardedForConfig setXForwardedForSLBIdEnabled(Boolean XForwardedForSLBIdEnabled) {
            this.XForwardedForSLBIdEnabled = XForwardedForSLBIdEnabled;
            return this;
        }
        public Boolean getXForwardedForSLBIdEnabled() {
            return this.XForwardedForSLBIdEnabled;
        }

        public CreateListenerRequestXForwardedForConfig setXForwardedForSLBPortEnabled(Boolean XForwardedForSLBPortEnabled) {
            this.XForwardedForSLBPortEnabled = XForwardedForSLBPortEnabled;
            return this;
        }
        public Boolean getXForwardedForSLBPortEnabled() {
            return this.XForwardedForSLBPortEnabled;
        }

    }

}
