// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class CreateListenerRequest extends TeaModel {
    /**
     * <p>A list of certificates.</p>
     */
    @NameInMap("CaCertificates")
    public java.util.List<CreateListenerRequestCaCertificates> caCertificates;

    /**
     * <p>Specifies whether to enable mutual authentication. Valid values:</p>
     * <br>
     * <p>*   **true**</p>
     * <p>*   **false** (default):</p>
     */
    @NameInMap("CaEnabled")
    public Boolean caEnabled;

    /**
     * <p>A list of certificates.</p>
     */
    @NameInMap("Certificates")
    public java.util.List<CreateListenerRequestCertificates> certificates;

    /**
     * <p>The client token that is used to ensure the idempotence of the request.</p>
     * <br>
     * <p>You can use the client to generate the token, but you must make sure that the token is unique among different requests. The token can contain only ASCII characters.</p>
     * <br>
     * <p>> If you do not specify this parameter, the system automatically uses the **request ID** as the **client token**. The **request ID** may be different for each request.</p>
     */
    @NameInMap("ClientToken")
    public String clientToken;

    /**
     * <p>The actions of the forwarding rule.</p>
     */
    @NameInMap("DefaultActions")
    public java.util.List<CreateListenerRequestDefaultActions> defaultActions;

    /**
     * <p>Specifies whether to perform only a dry run, without performing the actual request. Valid values:</p>
     * <br>
     * <p>*   **true**: performs only a dry run. The system checks the request for potential issues, including missing parameter values, incorrect request syntax, and service limits. If the request fails the dry run, an error code is returned. If the request passes the dry run, the `DryRunOperation` error code is returned.</p>
     * <p>*   **false** (default): performs a dry run and performs the actual request. If the request passes the dry run, a 2xx HTTP status code is returned and the operation is performed.</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>Specifies whether to enable `GZIP` compression to compress specific types of files. Valid values:</p>
     * <br>
     * <p>*   **true** (default)</p>
     * <p>*   **false**</p>
     */
    @NameInMap("GzipEnabled")
    public Boolean gzipEnabled;

    /**
     * <p>Specifies whether to enable `HTTP/2`. Valid values:</p>
     * <br>
     * <p>*   **true** (default)</p>
     * <p>*   **false**</p>
     * <br>
     * <p>> This parameter is available only when you create an HTTPS listener.</p>
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
     * <p>The description must be 2 to 256 characters in length, and can contain letters, digits, hyphens (-), forward slashes (/), periods (.), and underscores (\_). Regular expressions are supported.</p>
     */
    @NameInMap("ListenerDescription")
    public String listenerDescription;

    /**
     * <p>The frontend port that is used by the ALB instance.</p>
     * <br>
     * <p>Valid values: **1 to 65535**.</p>
     */
    @NameInMap("ListenerPort")
    public Integer listenerPort;

    /**
     * <p>The listener protocol.</p>
     * <br>
     * <p>Valid values: **HTTP**, **HTTPS**, and **QUIC**.</p>
     */
    @NameInMap("ListenerProtocol")
    public String listenerProtocol;

    /**
     * <p>The ALB instance ID.</p>
     */
    @NameInMap("LoadBalancerId")
    public String loadBalancerId;

    /**
     * <p>Selects a QUIC listener and associates it with the HTTPS listener of the ALB instance.</p>
     */
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
     * <p>The ID of the security policy. System and custom security policies are supported.</p>
     * <br>
     * <p>Default value: **tls_cipher_policy\_1\_0** (system security policy).</p>
     * <br>
     * <p>> This parameter is available only when you create an HTTPS listener.</p>
     */
    @NameInMap("SecurityPolicyId")
    public String securityPolicyId;

    @NameInMap("Tag")
    public java.util.List<CreateListenerRequestTag> tag;

    /**
     * <p>The configuration of the XForward header.</p>
     */
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
         * <p>The ID of the certificate. Only server certificates are supported. You can specify a maximum of 20 certificate IDs.</p>
         * <br>
         * <p>> This parameter is required if **ListenerProtocol** is set to **HTTPS** or **QUIC**.</p>
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
         * <p>The server group to which requests are forwarded.</p>
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
         * <p>Specifies the configurations of the forwarding action. You can specify a maximum of 20 configurations.</p>
         */
        @NameInMap("ForwardGroupConfig")
        public CreateListenerRequestDefaultActionsForwardGroupConfig forwardGroupConfig;

        /**
         * <p>The type of the action. You can specify only one action type.</p>
         * <br>
         * <p>Set the value to **ForwardGroup** to forward requests to multiple vServer groups.</p>
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
         * <p>> You must add the HTTPS listener and the QUIC listener to the same ALB instance. In addition, make sure that the QUIC listener has never been associated with another listener.</p>
         */
        @NameInMap("QuicListenerId")
        public String quicListenerId;

        /**
         * <p>Specifies whether to enable QUIC upgrade. Valid values:</p>
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false** (default)</p>
         * <br>
         * <p>> This parameter is available only when you create an HTTPS listener.</p>
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
        @NameInMap("Key")
        public String key;

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
         * <p>The name must be 1 to 40 characters in length, and can contain letters, hyphens (-), underscores (\_), and digits.</p>
         * <br>
         * <p>> This parameter is available only when you create an HTTPS listener.</p>
         */
        @NameInMap("XForwardedForClientCertClientVerifyAlias")
        public String XForwardedForClientCertClientVerifyAlias;

        /**
         * <p>Specifies whether to use the `X-Forwarded-Clientcert-clientverify` header to retrieve the verification result of the client certificate. Valid values:</p>
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false** (default)</p>
         * <br>
         * <p>> This parameter is available only when you create an HTTPS listener.</p>
         */
        @NameInMap("XForwardedForClientCertClientVerifyEnabled")
        public Boolean XForwardedForClientCertClientVerifyEnabled;

        /**
         * <p>The name of the custom header. This parameter takes effect only when **XForwardedForClientCertFingerprintEnabled** is set to **true**.</p>
         * <br>
         * <p>The name must be 1 to 40 characters in length, and can contain letters, hyphens (-), underscores (\_), and digits.</p>
         * <br>
         * <p>> This parameter is available only when you create an HTTPS listener.</p>
         */
        @NameInMap("XForwardedForClientCertFingerprintAlias")
        public String XForwardedForClientCertFingerprintAlias;

        /**
         * <p>Specifies whether to use the `X-Forwarded-Clientcert-fingerprint` header to retrieve the fingerprint of the client certificate. Valid values:</p>
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false** (default)</p>
         * <br>
         * <p>> This parameter is available only when you create an HTTPS listener.</p>
         */
        @NameInMap("XForwardedForClientCertFingerprintEnabled")
        public Boolean XForwardedForClientCertFingerprintEnabled;

        /**
         * <p>The name of the custom header. This parameter takes effect only when **XForwardedForClientCertIssuerDNEnabled** is set to **true**.</p>
         * <br>
         * <p>The name must be 1 to 40 characters in length, and can contain letters, hyphens (-), underscores (\_), and digits.</p>
         * <br>
         * <p>> This parameter is available only when you create an HTTPS listener.</p>
         */
        @NameInMap("XForwardedForClientCertIssuerDNAlias")
        public String XForwardedForClientCertIssuerDNAlias;

        /**
         * <p>Specifies whether to use the `X-Forwarded-Clientcert-issuerdn` header to retrieve information about the authority that issues the client certificate. Valid values:</p>
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false** (default)</p>
         * <br>
         * <p>> This parameter is available only when you create an HTTPS listener.</p>
         */
        @NameInMap("XForwardedForClientCertIssuerDNEnabled")
        public Boolean XForwardedForClientCertIssuerDNEnabled;

        /**
         * <p>The name of the custom header. This parameter takes effect only when **XForwardedForClientCertSubjectDNEnabled** is set to **true**.</p>
         * <br>
         * <p>The name must be 1 to 40 characters in length, and can contain letters, hyphens (-), underscores (\_), and digits.</p>
         * <br>
         * <p>> This parameter is available only when you create an HTTPS listener.</p>
         */
        @NameInMap("XForwardedForClientCertSubjectDNAlias")
        public String XForwardedForClientCertSubjectDNAlias;

        /**
         * <p>Specifies whether to use the `X-Forwarded-Clientcert-subjectdn` header to retrieve information about the owner of the client certificate. Valid values:</p>
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false** (default)</p>
         * <br>
         * <p>> This parameter is available only when you create an HTTPS listener.</p>
         */
        @NameInMap("XForwardedForClientCertSubjectDNEnabled")
        public Boolean XForwardedForClientCertSubjectDNEnabled;

        /**
         * <p>Specifies whether to use the `X-Forwarded-Client-Ip` header to obtain the source IP address of the ALB instance. Valid values:</p>
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false** (default)</p>
         * <br>
         * <p>> This parameter is available only when you create an HTTP, HTTPS, or QUIC listener. The feature specified by this parameter is unavailable by default. To use the feature, contact your account manager.</p>
         */
        @NameInMap("XForwardedForClientSourceIpsEnabled")
        public Boolean XForwardedForClientSourceIpsEnabled;

        /**
         * <p>The trusted proxy IP address.</p>
         * <br>
         * <p>ALB traverses `X-Forwarded-For` backward and selects the first IP address that is not in the trusted IP address list as the real IP address of the client. The IP address is used in source IP address throttling.</p>
         */
        @NameInMap("XForwardedForClientSourceIpsTrusted")
        public String XForwardedForClientSourceIpsTrusted;

        /**
         * <p>Specifies whether to use the `X-Forwarded-Client-Port` header to retrieve the client port. Valid values:</p>
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false** (default)</p>
         * <br>
         * <p>> This parameter is available only when you create an HTTP or HTTPS listener.</p>
         */
        @NameInMap("XForwardedForClientSrcPortEnabled")
        public Boolean XForwardedForClientSrcPortEnabled;

        /**
         * <p>Specifies whether to use the `X-Forwarded-For` header to retrieve client IP addresses. Valid values:</p>
         * <br>
         * <p>*   **true** (default)</p>
         * <p>*   **false**</p>
         * <br>
         * <p>> This parameter is available only when you create an HTTP or HTTPS listener.</p>
         */
        @NameInMap("XForwardedForEnabled")
        public Boolean XForwardedForEnabled;

        /**
         * <p>Specifies whether to use the `X-Forwarded-Proto` header to retrieve the listener protocol. Valid values:</p>
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false** (default)</p>
         * <br>
         * <p>> This parameter is available only when you create an HTTP, HTTPS, or QUIC listener.</p>
         */
        @NameInMap("XForwardedForProtoEnabled")
        public Boolean XForwardedForProtoEnabled;

        /**
         * <p>Specifies whether to use the `SLB-ID` header to retrieve the ID of the CLB instance. Valid values:</p>
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false** (default)</p>
         * <br>
         * <p>> This parameter is available only when you create an HTTP, HTTPS, or QUIC listener.</p>
         */
        @NameInMap("XForwardedForSLBIdEnabled")
        public Boolean XForwardedForSLBIdEnabled;

        /**
         * <p>Specifies whether to use the `X-Forwarded-Port` header to retrieve the listener port of the ALB instance. Valid values:</p>
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false** (default)</p>
         * <br>
         * <p>> This parameter is available only when you create an HTTP, HTTPS, or QUIC listener.</p>
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
