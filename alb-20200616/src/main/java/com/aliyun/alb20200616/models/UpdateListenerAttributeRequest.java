// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class UpdateListenerAttributeRequest extends TeaModel {
    /**
     * <p>The certificate authority (CA) certificates.</p>
     */
    @NameInMap("CaCertificates")
    public java.util.List<UpdateListenerAttributeRequestCaCertificates> caCertificates;

    /**
     * <p>Specifies whether to enable mutual authentication. Valid values:</p>
     * <br>
     * <p>*   **true**</p>
     * <p>*   **false**</p>
     */
    @NameInMap("CaEnabled")
    public Boolean caEnabled;

    /**
     * <p>The certificates.</p>
     */
    @NameInMap("Certificates")
    public java.util.List<UpdateListenerAttributeRequestCertificates> certificates;

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
     * <p>The default actions in the forwarding rules.</p>
     */
    @NameInMap("DefaultActions")
    public java.util.List<UpdateListenerAttributeRequestDefaultActions> defaultActions;

    /**
     * <p>Specifies whether to perform only a dry run, without performing the actual request. Valid values:</p>
     * <br>
     * <p>*   **true**: performs only a dry run. The system checks the request for potential issues, including missing parameter values, incorrect request syntax, and service limits. If the request fails the dry run, an error message is returned. If the request passes the dry run, the `DryRunOperation` error code is returned.</p>
     * <p>*   **false** (default): performs a dry run and performs the actual request. If the request passes the dry run, a `2xx HTTP` status code is returned and the operation is performed.</p>
     */
    @NameInMap("DryRun")
    public Boolean dryRun;

    /**
     * <p>Specifies whether to enable GZIP compression for specific types of files. Valid values:</p>
     * <br>
     * <p>*   **true**</p>
     * <p>*   **false**</p>
     */
    @NameInMap("GzipEnabled")
    public Boolean gzipEnabled;

    /**
     * <p>Specifies whether to enable HTTP/2. Valid values:</p>
     * <br>
     * <p>*   **true**</p>
     * <p>*   **false**</p>
     * <br>
     * <p>> This parameter is available only when you create an HTTPS listener.</p>
     */
    @NameInMap("Http2Enabled")
    public Boolean http2Enabled;

    /**
     * <p>The timeout period of an idle connection. Unit: seconds. Valid values: **1 to 60**.</p>
     * <br>
     * <p>If no request is received within the specified timeout period, ALB closes the current connection. When another request is received, ALB establishes a new connection.</p>
     */
    @NameInMap("IdleTimeout")
    public Integer idleTimeout;

    /**
     * <p>The name of the listener.</p>
     * <br>
     * <p>The name must be 2 to 256 characters in length, and can contain letters, digits, and the following special characters: , . ; / @ \_ -.</p>
     */
    @NameInMap("ListenerDescription")
    public String listenerDescription;

    /**
     * <p>The ID of the Application Load Balancer (ALB) listener.</p>
     */
    @NameInMap("ListenerId")
    public String listenerId;

    /**
     * <p>The configuration information when the listener is associated with a QUIC listener.</p>
     */
    @NameInMap("QuicConfig")
    public UpdateListenerAttributeRequestQuicConfig quicConfig;

    /**
     * <p>The timeout period of a request. Unit: seconds. Valid values: **1 to 180**.</p>
     * <br>
     * <p>If no response is received from the backend server within the specified timeout period, ALB returns an `HTTP 504` error code to the client.</p>
     */
    @NameInMap("RequestTimeout")
    public Integer requestTimeout;

    /**
     * <p>The security policy ID. System security policies and custom security policies are supported.</p>
     * <br>
     * <p>> This parameter is available only when you create an HTTPS listener.</p>
     */
    @NameInMap("SecurityPolicyId")
    public String securityPolicyId;

    /**
     * <p>The configuration of the XForwardFor headers.</p>
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
        public static UpdateListenerAttributeRequestCaCertificates build(java.util.Map<String, ?> map) throws Exception {
            UpdateListenerAttributeRequestCaCertificates self = new UpdateListenerAttributeRequestCaCertificates();
            return TeaModel.build(map, self);
        }

    }

    public static class UpdateListenerAttributeRequestCertificates extends TeaModel {
        /**
         * <p>The certificate ID. Only server certificates are supported. You can specify up to 20 certificate IDs.</p>
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
         * <p>The server group to which requests are forwarded.</p>
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
         * <p>The configuration of the action. This parameter is required and takes effect when the **Type** parameter is set to **FowardGroup**. You can specify configurations for up to 20 forwarding actions.</p>
         */
        @NameInMap("ForwardGroupConfig")
        public UpdateListenerAttributeRequestDefaultActionsForwardGroupConfig forwardGroupConfig;

        /**
         * <p>The type of the action. You can specify only one action type.</p>
         * <br>
         * <p>Set the value to **ForwardGroup** to forward requests to multiple vServer groups.</p>
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
         * <p>The QUIC listener ID. This parameter is required if **QuicUpgradeEnabled** is set to **true**. Only HTTPS listeners support this parameter.</p>
         * <br>
         * <p>> You must add the HTTPS listener and the QUIC listener to the same ALB instance. In addition, make sure that the QUIC listener has never been associated with another listener.</p>
         */
        @NameInMap("QuicListenerId")
        public String quicListenerId;

        /**
         * <p>Specifies whether to enable QUIC upgrade. Valid values:</p>
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false**</p>
         * <br>
         * <p>> Only HTTPS listeners support this parameter.</p>
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
         * <p>The name of the custom header. This parameter takes effect only when the **XForwardedForClientCertClientVerifyEnabled** parameter is set to **true**.</p>
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
         * <p>*   **false**</p>
         * <br>
         * <p>> This parameter is available only when you create an HTTPS listener.</p>
         */
        @NameInMap("XForwardedForClientCertClientVerifyEnabled")
        public Boolean XForwardedForClientCertClientVerifyEnabled;

        /**
         * <p>The name of the custom header. This parameter takes effect only when the **XForwardedForClientCertFingerprintEnabled** parameter is set to **true**.</p>
         * <br>
         * <p>The name must be 1 to 40 characters in length, and can contain letters, hyphens (-), underscores (\_), and digits.</p>
         * <br>
         * <p>> This parameter is available only when you create an HTTPS listener.</p>
         */
        @NameInMap("XForwardedForClientCertFingerprintAlias")
        public String XForwardedForClientCertFingerprintAlias;

        /**
         * <p>Indicates whether the `X-Forwarded-Clientcert-fingerprint` header is used to retrieve the fingerprint of the client certificate. Valid values:</p>
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false**</p>
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
         * <p>Indicates whether the `X-Forwarded-Clientcert-issuerdn` header is used to retrieve information about the authority that issues the client certificate. Valid values:</p>
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false**</p>
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
         * <p>Indicates whether the `X-Forwarded-Clientcert-subjectdn` header is used to retrieve information about the owner of the client certificate. Valid values:</p>
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false**</p>
         * <br>
         * <p>> This parameter is available only when you create an HTTPS listener.</p>
         */
        @NameInMap("XForwardedForClientCertSubjectDNEnabled")
        public Boolean XForwardedForClientCertSubjectDNEnabled;

        /**
         * <p>Specifies whether to use the `X-Forwarded-Client-Ip` header to retrieve the source IP addresses. Valid values:</p>
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false**</p>
         * <br>
         * <p>> HTTP, HTTPS, and QUIC listeners support this parameter. By default, the feature that corresponds to this parameter is unavailable. If you want to use this feature, contact your account manager.</p>
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
         * <p>Indicates whether the `X-Forwarded-Client-Port` header is used to retrieve the client port. Valid values:</p>
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false**</p>
         * <br>
         * <p>> This parameter is available only when you create an HTTP or HTTPS listener.</p>
         */
        @NameInMap("XForwardedForClientSrcPortEnabled")
        public Boolean XForwardedForClientSrcPortEnabled;

        /**
         * <p>Indicates whether the `X-Forwarded-For` header is used to retrieve the client IP address. Valid values:</p>
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false**</p>
         * <br>
         * <p>> This parameter is available only when you create an HTTP or HTTPS listener.</p>
         */
        @NameInMap("XForwardedForEnabled")
        public Boolean XForwardedForEnabled;

        /**
         * <p>Specifies whether to use the `X-Forwarded-Proto` header to retrieve the listener protocol of the ALB instance. Valid values:</p>
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false**</p>
         * <br>
         * <p>> HTTP, HTTPS, and QUIC listeners support this parameter.</p>
         */
        @NameInMap("XForwardedForProtoEnabled")
        public Boolean XForwardedForProtoEnabled;

        /**
         * <p>Specifies whether to use the `SLB-ID` header to retrieve the ID of the ALB instance. Valid values:</p>
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false**</p>
         * <br>
         * <p>> HTTP, HTTPS, and QUIC listeners support this parameter.</p>
         */
        @NameInMap("XForwardedForSLBIdEnabled")
        public Boolean XForwardedForSLBIdEnabled;

        /**
         * <p>Specifies whether to use the `X-Forwarded-Port` header to retrieve the listening port. Valid values:</p>
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false**</p>
         * <br>
         * <p>> HTTP, HTTPS, and QUIC listeners support this parameter.</p>
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
