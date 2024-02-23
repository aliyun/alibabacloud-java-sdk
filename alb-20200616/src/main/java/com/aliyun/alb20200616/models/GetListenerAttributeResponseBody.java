// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class GetListenerAttributeResponseBody extends TeaModel {
    /**
     * <p>The configurations of the access control lists (ACLs).</p>
     */
    @NameInMap("AclConfig")
    public GetListenerAttributeResponseBodyAclConfig aclConfig;

    /**
     * <p>A list of default CA certificates.</p>
     */
    @NameInMap("CaCertificates")
    public java.util.List<GetListenerAttributeResponseBodyCaCertificates> caCertificates;

    /**
     * <p>Indicates whether mutual authentication is enabled. Valid values:</p>
     * <br>
     * <p>*   **true**</p>
     * <p>*   **false**</p>
     */
    @NameInMap("CaEnabled")
    public Boolean caEnabled;

    /**
     * <p>A list of certificates.</p>
     */
    @NameInMap("Certificates")
    public java.util.List<GetListenerAttributeResponseBodyCertificates> certificates;

    /**
     * <p>The actions of the default forwarding rule.</p>
     */
    @NameInMap("DefaultActions")
    public java.util.List<GetListenerAttributeResponseBodyDefaultActions> defaultActions;

    /**
     * <p>Indicates whether GZIP compression is enabled to compress specific types of files. Valid values:</p>
     * <br>
     * <p>*   **true**</p>
     * <p>*   **false**</p>
     */
    @NameInMap("GzipEnabled")
    public Boolean gzipEnabled;

    /**
     * <p>Indicates whether HTTP/2 is enabled. Valid values:</p>
     * <br>
     * <p>*   **true**</p>
     * <p>*   **false**</p>
     * <br>
     * <p>> This parameter is available only when you create an HTTPS listener.</p>
     */
    @NameInMap("Http2Enabled")
    public Boolean http2Enabled;

    /**
     * <p>The timeout period of an idle connection. Unit: seconds.</p>
     * <br>
     * <p>If no requests are received within the specified timeout period, Application Load Balancer (ALB) closes the current connection. When a request is received, ALB establishes a new connection.</p>
     */
    @NameInMap("IdleTimeout")
    public Integer idleTimeout;

    /**
     * <p>The name of the listener.</p>
     */
    @NameInMap("ListenerDescription")
    public String listenerDescription;

    /**
     * <p>The ID of the listener.</p>
     */
    @NameInMap("ListenerId")
    public String listenerId;

    /**
     * <p>The frontend port that is used by the ALB instance.</p>
     */
    @NameInMap("ListenerPort")
    public Integer listenerPort;

    /**
     * <p>The listener protocol. Valid values: **HTTP**, **HTTPS**, and **QUIC**.</p>
     */
    @NameInMap("ListenerProtocol")
    public String listenerProtocol;

    /**
     * <p>The status of the listener. Valid values:</p>
     * <br>
     * <p>*   **Provisioning**</p>
     * <p>*   **Running**</p>
     * <p>*   **Configuring**</p>
     * <p>*   **Stopped**</p>
     */
    @NameInMap("ListenerStatus")
    public String listenerStatus;

    /**
     * <p>The ALB instance ID.</p>
     */
    @NameInMap("LoadBalancerId")
    public String loadBalancerId;

    /**
     * <p>The logging configuration.</p>
     */
    @NameInMap("LogConfig")
    public GetListenerAttributeResponseBodyLogConfig logConfig;

    /**
     * <p>The configuration information when the listener is associated with a QUIC listener.</p>
     */
    @NameInMap("QuicConfig")
    public GetListenerAttributeResponseBodyQuicConfig quicConfig;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The timeout period of a request. Unit: seconds.</p>
     * <br>
     * <p>If no responses are received from the backend server within the specified timeout period, ALB returns an `HTTP 504` error code to the client.</p>
     */
    @NameInMap("RequestTimeout")
    public Integer requestTimeout;

    /**
     * <p>The security policy.</p>
     * <br>
     * <p>> This parameter is available only when you create an HTTPS listener.</p>
     */
    @NameInMap("SecurityPolicyId")
    public String securityPolicyId;

    /**
     * <p>The tags.</p>
     */
    @NameInMap("Tags")
    public java.util.List<GetListenerAttributeResponseBodyTags> tags;

    /**
     * <p>The configuration of the XForward headers.</p>
     */
    @NameInMap("XForwardedForConfig")
    public GetListenerAttributeResponseBodyXForwardedForConfig XForwardedForConfig;

    public static GetListenerAttributeResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetListenerAttributeResponseBody self = new GetListenerAttributeResponseBody();
        return TeaModel.build(map, self);
    }

    public GetListenerAttributeResponseBody setAclConfig(GetListenerAttributeResponseBodyAclConfig aclConfig) {
        this.aclConfig = aclConfig;
        return this;
    }
    public GetListenerAttributeResponseBodyAclConfig getAclConfig() {
        return this.aclConfig;
    }

    public GetListenerAttributeResponseBody setCaCertificates(java.util.List<GetListenerAttributeResponseBodyCaCertificates> caCertificates) {
        this.caCertificates = caCertificates;
        return this;
    }
    public java.util.List<GetListenerAttributeResponseBodyCaCertificates> getCaCertificates() {
        return this.caCertificates;
    }

    public GetListenerAttributeResponseBody setCaEnabled(Boolean caEnabled) {
        this.caEnabled = caEnabled;
        return this;
    }
    public Boolean getCaEnabled() {
        return this.caEnabled;
    }

    public GetListenerAttributeResponseBody setCertificates(java.util.List<GetListenerAttributeResponseBodyCertificates> certificates) {
        this.certificates = certificates;
        return this;
    }
    public java.util.List<GetListenerAttributeResponseBodyCertificates> getCertificates() {
        return this.certificates;
    }

    public GetListenerAttributeResponseBody setDefaultActions(java.util.List<GetListenerAttributeResponseBodyDefaultActions> defaultActions) {
        this.defaultActions = defaultActions;
        return this;
    }
    public java.util.List<GetListenerAttributeResponseBodyDefaultActions> getDefaultActions() {
        return this.defaultActions;
    }

    public GetListenerAttributeResponseBody setGzipEnabled(Boolean gzipEnabled) {
        this.gzipEnabled = gzipEnabled;
        return this;
    }
    public Boolean getGzipEnabled() {
        return this.gzipEnabled;
    }

    public GetListenerAttributeResponseBody setHttp2Enabled(Boolean http2Enabled) {
        this.http2Enabled = http2Enabled;
        return this;
    }
    public Boolean getHttp2Enabled() {
        return this.http2Enabled;
    }

    public GetListenerAttributeResponseBody setIdleTimeout(Integer idleTimeout) {
        this.idleTimeout = idleTimeout;
        return this;
    }
    public Integer getIdleTimeout() {
        return this.idleTimeout;
    }

    public GetListenerAttributeResponseBody setListenerDescription(String listenerDescription) {
        this.listenerDescription = listenerDescription;
        return this;
    }
    public String getListenerDescription() {
        return this.listenerDescription;
    }

    public GetListenerAttributeResponseBody setListenerId(String listenerId) {
        this.listenerId = listenerId;
        return this;
    }
    public String getListenerId() {
        return this.listenerId;
    }

    public GetListenerAttributeResponseBody setListenerPort(Integer listenerPort) {
        this.listenerPort = listenerPort;
        return this;
    }
    public Integer getListenerPort() {
        return this.listenerPort;
    }

    public GetListenerAttributeResponseBody setListenerProtocol(String listenerProtocol) {
        this.listenerProtocol = listenerProtocol;
        return this;
    }
    public String getListenerProtocol() {
        return this.listenerProtocol;
    }

    public GetListenerAttributeResponseBody setListenerStatus(String listenerStatus) {
        this.listenerStatus = listenerStatus;
        return this;
    }
    public String getListenerStatus() {
        return this.listenerStatus;
    }

    public GetListenerAttributeResponseBody setLoadBalancerId(String loadBalancerId) {
        this.loadBalancerId = loadBalancerId;
        return this;
    }
    public String getLoadBalancerId() {
        return this.loadBalancerId;
    }

    public GetListenerAttributeResponseBody setLogConfig(GetListenerAttributeResponseBodyLogConfig logConfig) {
        this.logConfig = logConfig;
        return this;
    }
    public GetListenerAttributeResponseBodyLogConfig getLogConfig() {
        return this.logConfig;
    }

    public GetListenerAttributeResponseBody setQuicConfig(GetListenerAttributeResponseBodyQuicConfig quicConfig) {
        this.quicConfig = quicConfig;
        return this;
    }
    public GetListenerAttributeResponseBodyQuicConfig getQuicConfig() {
        return this.quicConfig;
    }

    public GetListenerAttributeResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetListenerAttributeResponseBody setRequestTimeout(Integer requestTimeout) {
        this.requestTimeout = requestTimeout;
        return this;
    }
    public Integer getRequestTimeout() {
        return this.requestTimeout;
    }

    public GetListenerAttributeResponseBody setSecurityPolicyId(String securityPolicyId) {
        this.securityPolicyId = securityPolicyId;
        return this;
    }
    public String getSecurityPolicyId() {
        return this.securityPolicyId;
    }

    public GetListenerAttributeResponseBody setTags(java.util.List<GetListenerAttributeResponseBodyTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<GetListenerAttributeResponseBodyTags> getTags() {
        return this.tags;
    }

    public GetListenerAttributeResponseBody setXForwardedForConfig(GetListenerAttributeResponseBodyXForwardedForConfig XForwardedForConfig) {
        this.XForwardedForConfig = XForwardedForConfig;
        return this;
    }
    public GetListenerAttributeResponseBodyXForwardedForConfig getXForwardedForConfig() {
        return this.XForwardedForConfig;
    }

    public static class GetListenerAttributeResponseBodyAclConfigAclRelations extends TeaModel {
        /**
         * <p>The ID of the ACL that is associated with the listener.</p>
         */
        @NameInMap("AclId")
        public String aclId;

        /**
         * <p>Indicates whether the ACL is associated with the listener. Valid values:</p>
         * <br>
         * <p>*   **Associating**</p>
         * <p>*   **Associated**</p>
         * <p>*   **Dissociating**</p>
         */
        @NameInMap("Status")
        public String status;

        public static GetListenerAttributeResponseBodyAclConfigAclRelations build(java.util.Map<String, ?> map) throws Exception {
            GetListenerAttributeResponseBodyAclConfigAclRelations self = new GetListenerAttributeResponseBodyAclConfigAclRelations();
            return TeaModel.build(map, self);
        }

        public GetListenerAttributeResponseBodyAclConfigAclRelations setAclId(String aclId) {
            this.aclId = aclId;
            return this;
        }
        public String getAclId() {
            return this.aclId;
        }

        public GetListenerAttributeResponseBodyAclConfigAclRelations setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class GetListenerAttributeResponseBodyAclConfig extends TeaModel {
        /**
         * <p>The IDs of the ACLs that are associated with the listener.</p>
         */
        @NameInMap("AclRelations")
        public java.util.List<GetListenerAttributeResponseBodyAclConfigAclRelations> aclRelations;

        /**
         * <p>The type of the ACL. Valid values:</p>
         * <br>
         * <p>*   **White**: a whitelist. Only requests from the IP addresses or CIDR blocks in the network ACL are forwarded. Whitelists are applicable to scenarios in which you want to allow only specific IP addresses to access an application. Your service may be adversely affected if the whitelist is not properly configured. If a whitelist is configured for a listener, only requests from IP addresses that are on the whitelist are forwarded by the listener.</p>
         * <br>
         * <p>    If you enable a whitelist but do not add an IP address to the whitelist, the listener forwards all requests.</p>
         * <br>
         * <p>*   **Black**: a blacklist. Requests from the IP addresses or CIDR blocks in the network ACL are denied. Blacklists are suitable for scenarios in which you want to deny access from specific IP addresses or CIDR blocks to an application.</p>
         * <br>
         * <p>    If a blacklist is configured for a listener but no IP addresses are added to the blacklist, the listener forwards all requests.</p>
         */
        @NameInMap("AclType")
        public String aclType;

        public static GetListenerAttributeResponseBodyAclConfig build(java.util.Map<String, ?> map) throws Exception {
            GetListenerAttributeResponseBodyAclConfig self = new GetListenerAttributeResponseBodyAclConfig();
            return TeaModel.build(map, self);
        }

        public GetListenerAttributeResponseBodyAclConfig setAclRelations(java.util.List<GetListenerAttributeResponseBodyAclConfigAclRelations> aclRelations) {
            this.aclRelations = aclRelations;
            return this;
        }
        public java.util.List<GetListenerAttributeResponseBodyAclConfigAclRelations> getAclRelations() {
            return this.aclRelations;
        }

        public GetListenerAttributeResponseBodyAclConfig setAclType(String aclType) {
            this.aclType = aclType;
            return this;
        }
        public String getAclType() {
            return this.aclType;
        }

    }

    public static class GetListenerAttributeResponseBodyCaCertificates extends TeaModel {
        /**
         * <p>The ID of the default CA certificate.</p>
         */
        @NameInMap("CertificateId")
        public String certificateId;

        /**
         * <p>Indicates whether the certificate is a default certificate: Valid values:</p>
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false**</p>
         */
        @NameInMap("IsDefault")
        public Boolean isDefault;

        /**
         * <p>The status of the certificate.</p>
         */
        @NameInMap("Status")
        public String status;

        public static GetListenerAttributeResponseBodyCaCertificates build(java.util.Map<String, ?> map) throws Exception {
            GetListenerAttributeResponseBodyCaCertificates self = new GetListenerAttributeResponseBodyCaCertificates();
            return TeaModel.build(map, self);
        }

        public GetListenerAttributeResponseBodyCaCertificates setCertificateId(String certificateId) {
            this.certificateId = certificateId;
            return this;
        }
        public String getCertificateId() {
            return this.certificateId;
        }

        public GetListenerAttributeResponseBodyCaCertificates setIsDefault(Boolean isDefault) {
            this.isDefault = isDefault;
            return this;
        }
        public Boolean getIsDefault() {
            return this.isDefault;
        }

        public GetListenerAttributeResponseBodyCaCertificates setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

    }

    public static class GetListenerAttributeResponseBodyCertificates extends TeaModel {
        /**
         * <p>The ID of the certificate. Only server certificates are supported.</p>
         */
        @NameInMap("CertificateId")
        public String certificateId;

        public static GetListenerAttributeResponseBodyCertificates build(java.util.Map<String, ?> map) throws Exception {
            GetListenerAttributeResponseBodyCertificates self = new GetListenerAttributeResponseBodyCertificates();
            return TeaModel.build(map, self);
        }

        public GetListenerAttributeResponseBodyCertificates setCertificateId(String certificateId) {
            this.certificateId = certificateId;
            return this;
        }
        public String getCertificateId() {
            return this.certificateId;
        }

    }

    public static class GetListenerAttributeResponseBodyDefaultActionsForwardGroupConfigServerGroupTuples extends TeaModel {
        /**
         * <p>The ID of the server group to which requests are forwarded.</p>
         */
        @NameInMap("ServerGroupId")
        public String serverGroupId;

        public static GetListenerAttributeResponseBodyDefaultActionsForwardGroupConfigServerGroupTuples build(java.util.Map<String, ?> map) throws Exception {
            GetListenerAttributeResponseBodyDefaultActionsForwardGroupConfigServerGroupTuples self = new GetListenerAttributeResponseBodyDefaultActionsForwardGroupConfigServerGroupTuples();
            return TeaModel.build(map, self);
        }

        public GetListenerAttributeResponseBodyDefaultActionsForwardGroupConfigServerGroupTuples setServerGroupId(String serverGroupId) {
            this.serverGroupId = serverGroupId;
            return this;
        }
        public String getServerGroupId() {
            return this.serverGroupId;
        }

    }

    public static class GetListenerAttributeResponseBodyDefaultActionsForwardGroupConfig extends TeaModel {
        /**
         * <p>The server group to which requests are forwarded.</p>
         */
        @NameInMap("ServerGroupTuples")
        public java.util.List<GetListenerAttributeResponseBodyDefaultActionsForwardGroupConfigServerGroupTuples> serverGroupTuples;

        public static GetListenerAttributeResponseBodyDefaultActionsForwardGroupConfig build(java.util.Map<String, ?> map) throws Exception {
            GetListenerAttributeResponseBodyDefaultActionsForwardGroupConfig self = new GetListenerAttributeResponseBodyDefaultActionsForwardGroupConfig();
            return TeaModel.build(map, self);
        }

        public GetListenerAttributeResponseBodyDefaultActionsForwardGroupConfig setServerGroupTuples(java.util.List<GetListenerAttributeResponseBodyDefaultActionsForwardGroupConfigServerGroupTuples> serverGroupTuples) {
            this.serverGroupTuples = serverGroupTuples;
            return this;
        }
        public java.util.List<GetListenerAttributeResponseBodyDefaultActionsForwardGroupConfigServerGroupTuples> getServerGroupTuples() {
            return this.serverGroupTuples;
        }

    }

    public static class GetListenerAttributeResponseBodyDefaultActions extends TeaModel {
        /**
         * <p>The configuration of the ForwardGroup action. This parameter is returned and takes effect when Type is set to **ForwardGroup**.</p>
         */
        @NameInMap("ForwardGroupConfig")
        public GetListenerAttributeResponseBodyDefaultActionsForwardGroupConfig forwardGroupConfig;

        /**
         * <p>The type of the action.</p>
         * <br>
         * <p>If **ForwardGroup** is returned, requests are forwarded to multiple vServer groups.</p>
         */
        @NameInMap("Type")
        public String type;

        public static GetListenerAttributeResponseBodyDefaultActions build(java.util.Map<String, ?> map) throws Exception {
            GetListenerAttributeResponseBodyDefaultActions self = new GetListenerAttributeResponseBodyDefaultActions();
            return TeaModel.build(map, self);
        }

        public GetListenerAttributeResponseBodyDefaultActions setForwardGroupConfig(GetListenerAttributeResponseBodyDefaultActionsForwardGroupConfig forwardGroupConfig) {
            this.forwardGroupConfig = forwardGroupConfig;
            return this;
        }
        public GetListenerAttributeResponseBodyDefaultActionsForwardGroupConfig getForwardGroupConfig() {
            return this.forwardGroupConfig;
        }

        public GetListenerAttributeResponseBodyDefaultActions setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetListenerAttributeResponseBodyLogConfigAccessLogTracingConfig extends TeaModel {
        /**
         * <p>Indicates whether Xtrace is enabled. Valid values:</p>
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false**</p>
         * <br>
         * <p>> You can set this parameter to **true** only if the AccessLogEnabled parameter is set to true.</p>
         */
        @NameInMap("TracingEnabled")
        public Boolean tracingEnabled;

        /**
         * <p>The sampling rate of Xtrace. Valid values: 1 to 10000.</p>
         * <br>
         * <p>> If **TracingEnabled** is set to **true**, this parameter is valid.</p>
         */
        @NameInMap("TracingSample")
        public Integer tracingSample;

        /**
         * <p>The Xtrace type. Supported Xtrace type: **Zipkin**.</p>
         * <br>
         * <p>> If **TracingEnabled** is set to **true**, this parameter is valid.</p>
         */
        @NameInMap("TracingType")
        public String tracingType;

        public static GetListenerAttributeResponseBodyLogConfigAccessLogTracingConfig build(java.util.Map<String, ?> map) throws Exception {
            GetListenerAttributeResponseBodyLogConfigAccessLogTracingConfig self = new GetListenerAttributeResponseBodyLogConfigAccessLogTracingConfig();
            return TeaModel.build(map, self);
        }

        public GetListenerAttributeResponseBodyLogConfigAccessLogTracingConfig setTracingEnabled(Boolean tracingEnabled) {
            this.tracingEnabled = tracingEnabled;
            return this;
        }
        public Boolean getTracingEnabled() {
            return this.tracingEnabled;
        }

        public GetListenerAttributeResponseBodyLogConfigAccessLogTracingConfig setTracingSample(Integer tracingSample) {
            this.tracingSample = tracingSample;
            return this;
        }
        public Integer getTracingSample() {
            return this.tracingSample;
        }

        public GetListenerAttributeResponseBodyLogConfigAccessLogTracingConfig setTracingType(String tracingType) {
            this.tracingType = tracingType;
            return this;
        }
        public String getTracingType() {
            return this.tracingType;
        }

    }

    public static class GetListenerAttributeResponseBodyLogConfig extends TeaModel {
        /**
         * <p>Indicates whether custom headers are recorded in the access log. Valid values:</p>
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false**</p>
         */
        @NameInMap("AccessLogRecordCustomizedHeadersEnabled")
        public Boolean accessLogRecordCustomizedHeadersEnabled;

        /**
         * <p>The configuration of Xtrace. Xtrace is used to record requests sent to ALB.</p>
         */
        @NameInMap("AccessLogTracingConfig")
        public GetListenerAttributeResponseBodyLogConfigAccessLogTracingConfig accessLogTracingConfig;

        public static GetListenerAttributeResponseBodyLogConfig build(java.util.Map<String, ?> map) throws Exception {
            GetListenerAttributeResponseBodyLogConfig self = new GetListenerAttributeResponseBodyLogConfig();
            return TeaModel.build(map, self);
        }

        public GetListenerAttributeResponseBodyLogConfig setAccessLogRecordCustomizedHeadersEnabled(Boolean accessLogRecordCustomizedHeadersEnabled) {
            this.accessLogRecordCustomizedHeadersEnabled = accessLogRecordCustomizedHeadersEnabled;
            return this;
        }
        public Boolean getAccessLogRecordCustomizedHeadersEnabled() {
            return this.accessLogRecordCustomizedHeadersEnabled;
        }

        public GetListenerAttributeResponseBodyLogConfig setAccessLogTracingConfig(GetListenerAttributeResponseBodyLogConfigAccessLogTracingConfig accessLogTracingConfig) {
            this.accessLogTracingConfig = accessLogTracingConfig;
            return this;
        }
        public GetListenerAttributeResponseBodyLogConfigAccessLogTracingConfig getAccessLogTracingConfig() {
            return this.accessLogTracingConfig;
        }

    }

    public static class GetListenerAttributeResponseBodyQuicConfig extends TeaModel {
        /**
         * <p>The ID of the QUIC listener. This parameter is returned when **QuicUpgradeEnabled** is set to **true**. Only HTTPS listeners support this parameter.</p>
         * <br>
         * <p>> You must associate the HTTPS listener and the QUIC listener with the same ALB instance. In addition, make sure that the QUIC listener has never been associated with another listener.</p>
         */
        @NameInMap("QuicListenerId")
        public String quicListenerId;

        /**
         * <p>Indicates whether QUIC upgrade is enabled. Valid values:</p>
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false**</p>
         * <br>
         * <p>> Only HTTPS listeners support this parameter.</p>
         */
        @NameInMap("QuicUpgradeEnabled")
        public Boolean quicUpgradeEnabled;

        public static GetListenerAttributeResponseBodyQuicConfig build(java.util.Map<String, ?> map) throws Exception {
            GetListenerAttributeResponseBodyQuicConfig self = new GetListenerAttributeResponseBodyQuicConfig();
            return TeaModel.build(map, self);
        }

        public GetListenerAttributeResponseBodyQuicConfig setQuicListenerId(String quicListenerId) {
            this.quicListenerId = quicListenerId;
            return this;
        }
        public String getQuicListenerId() {
            return this.quicListenerId;
        }

        public GetListenerAttributeResponseBodyQuicConfig setQuicUpgradeEnabled(Boolean quicUpgradeEnabled) {
            this.quicUpgradeEnabled = quicUpgradeEnabled;
            return this;
        }
        public Boolean getQuicUpgradeEnabled() {
            return this.quicUpgradeEnabled;
        }

    }

    public static class GetListenerAttributeResponseBodyTags extends TeaModel {
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

        public static GetListenerAttributeResponseBodyTags build(java.util.Map<String, ?> map) throws Exception {
            GetListenerAttributeResponseBodyTags self = new GetListenerAttributeResponseBodyTags();
            return TeaModel.build(map, self);
        }

        public GetListenerAttributeResponseBodyTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetListenerAttributeResponseBodyTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetListenerAttributeResponseBodyXForwardedForConfig extends TeaModel {
        /**
         * <p>The name of the custom header. This parameter takes effect only when **XForwardedForClientCertClientVerifyEnabled** is set to **true**.</p>
         * <br>
         * <p>The name is 1 to 40 characters in length, and can contain lowercase letters, hyphens (-), underscores (\_), and digits.</p>
         * <br>
         * <p>> This parameter is available only when you create an HTTPS listener.</p>
         */
        @NameInMap("XForwardedForClientCertClientVerifyAlias")
        public String XForwardedForClientCertClientVerifyAlias;

        /**
         * <p>Indicates whether the `X-Forwarded-Clientcert-clientverify` header is used to retrieve the verification result of the client certificate. Valid values:</p>
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false**</p>
         * <br>
         * <p>> This parameter is available only when you create an HTTPS listener.</p>
         */
        @NameInMap("XForwardedForClientCertClientVerifyEnabled")
        public Boolean XForwardedForClientCertClientVerifyEnabled;

        /**
         * <p>The name of the custom header. This parameter takes effect only when **XForwardedForClientCertFingerprintEnabled** is set to **true**.</p>
         * <br>
         * <p>The name is 1 to 40 characters in length, and can contain lowercase letters, hyphens (-), underscores (\_), and digits.</p>
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
         * <p>The name is 1 to 40 characters in length, and can contain lowercase letters, hyphens (-), underscores (\_), and digits.</p>
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
         * <p>The name is 1 to 40 characters in length, and can contain lowercase letters, hyphens (-), underscores (\_), and digits.</p>
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
         * <p>Indicates whether the `X-Forwarded-Client-Ip` header is used to retrieve the source port of the ALB instance. Valid values:</p>
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false**</p>
         * <br>
         * <p>> This parameter is available only when you create an HTTP, HTTPS, or QUIC listener.</p>
         */
        @NameInMap("XForwardedForClientSourceIpsEnabled")
        public Boolean XForwardedForClientSourceIpsEnabled;

        /**
         * <p>The trusted proxy IP address.</p>
         * <br>
         * <p>ALB traverses `X-Forwarded-For` backward and selects the first IP address that is not on the trusted IP address list as the real IP address of the client. The IP address is used in source IP address throttling.</p>
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
         * <p>Indicates whether the `X-Forwarded-Proto` header is used to retrieve the listening protocol. Valid values:</p>
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false**</p>
         * <br>
         * <p>> This parameter is available only when you create an HTTP, HTTPS, or QUIC listener.</p>
         */
        @NameInMap("XForwardedForProtoEnabled")
        public Boolean XForwardedForProtoEnabled;

        /**
         * <p>Indicates whether the `SLB-ID` header is used to retrieve the ID of the CLB instance. Valid values:</p>
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false**</p>
         * <br>
         * <p>> This parameter is available only when you create an HTTP, HTTPS, or QUIC listener.</p>
         */
        @NameInMap("XForwardedForSLBIdEnabled")
        public Boolean XForwardedForSLBIdEnabled;

        /**
         * <p>Indicates whether the `X-Forwarded-Port` header is used to retrieve the listening port of the ALB instance. Valid values:</p>
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false**</p>
         * <br>
         * <p>> This parameter is available only when you create an HTTP, HTTPS, or QUIC listener.</p>
         */
        @NameInMap("XForwardedForSLBPortEnabled")
        public Boolean XForwardedForSLBPortEnabled;

        public static GetListenerAttributeResponseBodyXForwardedForConfig build(java.util.Map<String, ?> map) throws Exception {
            GetListenerAttributeResponseBodyXForwardedForConfig self = new GetListenerAttributeResponseBodyXForwardedForConfig();
            return TeaModel.build(map, self);
        }

        public GetListenerAttributeResponseBodyXForwardedForConfig setXForwardedForClientCertClientVerifyAlias(String XForwardedForClientCertClientVerifyAlias) {
            this.XForwardedForClientCertClientVerifyAlias = XForwardedForClientCertClientVerifyAlias;
            return this;
        }
        public String getXForwardedForClientCertClientVerifyAlias() {
            return this.XForwardedForClientCertClientVerifyAlias;
        }

        public GetListenerAttributeResponseBodyXForwardedForConfig setXForwardedForClientCertClientVerifyEnabled(Boolean XForwardedForClientCertClientVerifyEnabled) {
            this.XForwardedForClientCertClientVerifyEnabled = XForwardedForClientCertClientVerifyEnabled;
            return this;
        }
        public Boolean getXForwardedForClientCertClientVerifyEnabled() {
            return this.XForwardedForClientCertClientVerifyEnabled;
        }

        public GetListenerAttributeResponseBodyXForwardedForConfig setXForwardedForClientCertFingerprintAlias(String XForwardedForClientCertFingerprintAlias) {
            this.XForwardedForClientCertFingerprintAlias = XForwardedForClientCertFingerprintAlias;
            return this;
        }
        public String getXForwardedForClientCertFingerprintAlias() {
            return this.XForwardedForClientCertFingerprintAlias;
        }

        public GetListenerAttributeResponseBodyXForwardedForConfig setXForwardedForClientCertFingerprintEnabled(Boolean XForwardedForClientCertFingerprintEnabled) {
            this.XForwardedForClientCertFingerprintEnabled = XForwardedForClientCertFingerprintEnabled;
            return this;
        }
        public Boolean getXForwardedForClientCertFingerprintEnabled() {
            return this.XForwardedForClientCertFingerprintEnabled;
        }

        public GetListenerAttributeResponseBodyXForwardedForConfig setXForwardedForClientCertIssuerDNAlias(String XForwardedForClientCertIssuerDNAlias) {
            this.XForwardedForClientCertIssuerDNAlias = XForwardedForClientCertIssuerDNAlias;
            return this;
        }
        public String getXForwardedForClientCertIssuerDNAlias() {
            return this.XForwardedForClientCertIssuerDNAlias;
        }

        public GetListenerAttributeResponseBodyXForwardedForConfig setXForwardedForClientCertIssuerDNEnabled(Boolean XForwardedForClientCertIssuerDNEnabled) {
            this.XForwardedForClientCertIssuerDNEnabled = XForwardedForClientCertIssuerDNEnabled;
            return this;
        }
        public Boolean getXForwardedForClientCertIssuerDNEnabled() {
            return this.XForwardedForClientCertIssuerDNEnabled;
        }

        public GetListenerAttributeResponseBodyXForwardedForConfig setXForwardedForClientCertSubjectDNAlias(String XForwardedForClientCertSubjectDNAlias) {
            this.XForwardedForClientCertSubjectDNAlias = XForwardedForClientCertSubjectDNAlias;
            return this;
        }
        public String getXForwardedForClientCertSubjectDNAlias() {
            return this.XForwardedForClientCertSubjectDNAlias;
        }

        public GetListenerAttributeResponseBodyXForwardedForConfig setXForwardedForClientCertSubjectDNEnabled(Boolean XForwardedForClientCertSubjectDNEnabled) {
            this.XForwardedForClientCertSubjectDNEnabled = XForwardedForClientCertSubjectDNEnabled;
            return this;
        }
        public Boolean getXForwardedForClientCertSubjectDNEnabled() {
            return this.XForwardedForClientCertSubjectDNEnabled;
        }

        public GetListenerAttributeResponseBodyXForwardedForConfig setXForwardedForClientSourceIpsEnabled(Boolean XForwardedForClientSourceIpsEnabled) {
            this.XForwardedForClientSourceIpsEnabled = XForwardedForClientSourceIpsEnabled;
            return this;
        }
        public Boolean getXForwardedForClientSourceIpsEnabled() {
            return this.XForwardedForClientSourceIpsEnabled;
        }

        public GetListenerAttributeResponseBodyXForwardedForConfig setXForwardedForClientSourceIpsTrusted(String XForwardedForClientSourceIpsTrusted) {
            this.XForwardedForClientSourceIpsTrusted = XForwardedForClientSourceIpsTrusted;
            return this;
        }
        public String getXForwardedForClientSourceIpsTrusted() {
            return this.XForwardedForClientSourceIpsTrusted;
        }

        public GetListenerAttributeResponseBodyXForwardedForConfig setXForwardedForClientSrcPortEnabled(Boolean XForwardedForClientSrcPortEnabled) {
            this.XForwardedForClientSrcPortEnabled = XForwardedForClientSrcPortEnabled;
            return this;
        }
        public Boolean getXForwardedForClientSrcPortEnabled() {
            return this.XForwardedForClientSrcPortEnabled;
        }

        public GetListenerAttributeResponseBodyXForwardedForConfig setXForwardedForEnabled(Boolean XForwardedForEnabled) {
            this.XForwardedForEnabled = XForwardedForEnabled;
            return this;
        }
        public Boolean getXForwardedForEnabled() {
            return this.XForwardedForEnabled;
        }

        public GetListenerAttributeResponseBodyXForwardedForConfig setXForwardedForProtoEnabled(Boolean XForwardedForProtoEnabled) {
            this.XForwardedForProtoEnabled = XForwardedForProtoEnabled;
            return this;
        }
        public Boolean getXForwardedForProtoEnabled() {
            return this.XForwardedForProtoEnabled;
        }

        public GetListenerAttributeResponseBodyXForwardedForConfig setXForwardedForSLBIdEnabled(Boolean XForwardedForSLBIdEnabled) {
            this.XForwardedForSLBIdEnabled = XForwardedForSLBIdEnabled;
            return this;
        }
        public Boolean getXForwardedForSLBIdEnabled() {
            return this.XForwardedForSLBIdEnabled;
        }

        public GetListenerAttributeResponseBodyXForwardedForConfig setXForwardedForSLBPortEnabled(Boolean XForwardedForSLBPortEnabled) {
            this.XForwardedForSLBPortEnabled = XForwardedForSLBPortEnabled;
            return this;
        }
        public Boolean getXForwardedForSLBPortEnabled() {
            return this.XForwardedForSLBPortEnabled;
        }

    }

}
