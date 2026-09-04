// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class GetListenerAttributeResponseBody extends TeaModel {
    /**
     * <p>The ACL configuration.</p>
     */
    @NameInMap("AclConfig")
    public GetListenerAttributeResponseBodyAclConfig aclConfig;

    /**
     * <p>The list of CA certificates.</p>
     */
    @NameInMap("CaCertificates")
    public java.util.List<GetListenerAttributeResponseBodyCaCertificates> caCertificates;

    /**
     * <p>Indicates whether mutual authentication is enabled. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Yes.</li>
     * <li><strong>false</strong>: No.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("CaEnabled")
    public Boolean caEnabled;

    /**
     * <p>The list of certificates.</p>
     */
    @NameInMap("Certificates")
    public java.util.List<GetListenerAttributeResponseBodyCertificates> certificates;

    /**
     * <p>The list of default rule actions.</p>
     */
    @NameInMap("DefaultActions")
    public java.util.List<GetListenerAttributeResponseBodyDefaultActions> defaultActions;

    /**
     * <p>Indicates whether Gzip compression is enabled to compress specific types of files. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Yes.</li>
     * <li><strong>false</strong>: No.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("GzipEnabled")
    public Boolean gzipEnabled;

    /**
     * <p>Indicates whether HTTP/2 is enabled. Valid values:</p>
     * <ul>
     * <li><strong>true</strong>: Yes.</li>
     * <li><strong>false</strong>: No.</li>
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
     * <p>The idle connection timeout period. Unit: seconds.</p>
     * <p>If no access request is received within the timeout period, the load balancing instance temporarily breaks the current connection and restores the connection when the next request arrives.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("IdleTimeout")
    public Integer idleTimeout;

    /**
     * <p>The custom listener name.</p>
     * 
     * <strong>example:</strong>
     * <p>HTTP_80</p>
     */
    @NameInMap("ListenerDescription")
    public String listenerDescription;

    /**
     * <p>The listener ID.</p>
     * 
     * <strong>example:</strong>
     * <p>lsn-o4u54y73wq7b******</p>
     */
    @NameInMap("ListenerId")
    public String listenerId;

    /**
     * <p>The frontend port used by the load balancing instance.</p>
     * 
     * <strong>example:</strong>
     * <p>80</p>
     */
    @NameInMap("ListenerPort")
    public Integer listenerPort;

    /**
     * <p>The listener protocol. Valid values: <strong>HTTP</strong>, <strong>HTTPS</strong>, and <strong>QUIC</strong>.</p>
     * 
     * <strong>example:</strong>
     * <p>HTTP</p>
     */
    @NameInMap("ListenerProtocol")
    public String listenerProtocol;

    /**
     * <p>The status of the listener. Valid values:</p>
     * <ul>
     * <li><p><strong>Provisioning</strong>: The listener is being created.</p>
     * </li>
     * <li><p><strong>Running</strong>: The listener is running.</p>
     * </li>
     * <li><p><strong>Configuring</strong>: The listener is being configured.</p>
     * </li>
     * <li><p><strong>Stopped</strong>: The listener is stopped.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>Running</p>
     */
    @NameInMap("ListenerStatus")
    public String listenerStatus;

    /**
     * <p>The load balancing instance ID.</p>
     * 
     * <strong>example:</strong>
     * <p>alb-bd6oylbckp6k9x****</p>
     */
    @NameInMap("LoadBalancerId")
    public String loadBalancerId;

    /**
     * <p>The log configuration information.</p>
     */
    @NameInMap("LogConfig")
    public GetListenerAttributeResponseBodyLogConfig logConfig;

    /**
     * <p>The configuration information when the associated QUIC listener is enabled.</p>
     */
    @NameInMap("QuicConfig")
    public GetListenerAttributeResponseBodyQuicConfig quicConfig;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>365F4154-92F6-4AE4-92F8-7FF******</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The request timeout period. Unit: seconds.</p>
     * <p>If the backend server does not provide a response within the timeout period, the load balancing instance stops waiting and returns an <code>HTTP 504</code> error code to the client.</p>
     * 
     * <strong>example:</strong>
     * <p>34</p>
     */
    @NameInMap("RequestTimeout")
    public Integer requestTimeout;

    /**
     * <p>The security policy.</p>
     * <blockquote>
     * <p>Only HTTPS listeners support this parameter.</p>
     * </blockquote>
     * 
     * <strong>example:</strong>
     * <p>tls_cipher_policy_1_1</p>
     */
    @NameInMap("SecurityPolicyId")
    public String securityPolicyId;

    /**
     * <p>The tags.</p>
     */
    @NameInMap("Tags")
    public java.util.List<GetListenerAttributeResponseBodyTags> tags;

    /**
     * <p>The XForward field configuration.</p>
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
         * <p>The ID of the access control group associated with the listener.</p>
         * 
         * <strong>example:</strong>
         * <p>acl-doc****</p>
         */
        @NameInMap("AclId")
        public String aclId;

        /**
         * <p>The status of the ACL-listener association. Valid values:</p>
         * <ul>
         * <li><p><strong>Associating</strong>: The ACL is being associated.</p>
         * </li>
         * <li><p><strong>Associated</strong>: The ACL is associated.</p>
         * </li>
         * <li><p><strong>Dissociating</strong>: The ACL is being disassociated.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Associating</p>
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
         * <p>The list of access control group IDs associated with the listener.</p>
         */
        @NameInMap("AclRelations")
        public java.util.List<GetListenerAttributeResponseBodyAclConfigAclRelations> aclRelations;

        /**
         * <p>The type of access control. Valid values:</p>
         * <ul>
         * <li><p><strong>White</strong>: Only requests from the IP addresses or CIDR blocks settings in the selected access control policy group are forwarded. Whitelists are applicable to scenarios in which you want to allow only specific IP addresses to access your application. Enabling a whitelist poses some risks. After a whitelist is enabled, only the IP addresses in the whitelist can access the load balancing listener.</p>
         * <p> If a whitelist is enabled but no IP address is added to the access control policy group, the load balancing listener forwards all requests.</p>
         * </li>
         * <li><p><strong>Black</strong>: All requests from the IP addresses or CIDR blocks settings in the selected access control policy group are blocked. Blacklists are applicable to scenarios in which you want to block access from specific IP addresses.</p>
         * <p>If a blacklist is enabled but no IP address is added to the access control policy group, the load balancing listener forwards all requests.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>White</p>
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
         * <p>The CA certificate ID.</p>
         * 
         * <strong>example:</strong>
         * <p>139a00*****</p>
         */
        @NameInMap("CertificateId")
        public String certificateId;

        /**
         * <p>Indicates whether the certificate is the default certificate. Valid values:</p>
         * <ul>
         * <li><p><strong>true</strong>: Yes.</p>
         * </li>
         * <li><p><strong>false</strong>: No.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsDefault")
        public Boolean isDefault;

        /**
         * <p>The certificate status.</p>
         * 
         * <strong>example:</strong>
         * <p>Associated</p>
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
         * <p>The certificate ID. Only server certificates are supported.</p>
         * 
         * <strong>example:</strong>
         * <p>123157*******</p>
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
         * <p>The ID of the destination server group to which requests are forwarded.</p>
         * 
         * <strong>example:</strong>
         * <p>sgp-i5qt20******</p>
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
         * <p>The destination server groups to which requests are forwarded.</p>
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
         * <p>The configuration of the forwarding action. This parameter is valid when the type is <strong>ForwardGroup</strong>.</p>
         */
        @NameInMap("ForwardGroupConfig")
        public GetListenerAttributeResponseBodyDefaultActionsForwardGroupConfig forwardGroupConfig;

        /**
         * <p>The action type.</p>
         * <p>Valid values: <strong>ForwardGroup</strong>, which indicates that requests are forwarded to multiple server groups.</p>
         * 
         * <strong>example:</strong>
         * <p>ForwardGroup</p>
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
         * <p>The Xtrace feature status. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Yes.</li>
         * <li><strong>false</strong>: No.</li>
         * </ul>
         * <blockquote>
         * <p>This parameter can be set to <strong>true</strong> only when the instance access log switch (AccessLogEnabled) is turned on.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("TracingEnabled")
        public Boolean tracingEnabled;

        /**
         * <p>The sampling rate of Xtrace. Valid values: 1 to 10000.</p>
         * <blockquote>
         * <p>This parameter takes effect only when <strong>TracingEnabled</strong> is set to <strong>true</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("TracingSample")
        public Integer tracingSample;

        /**
         * <p>The type of Xtrace. Valid values: <strong>Zipkin</strong>.</p>
         * <blockquote>
         * <p>This parameter takes effect only when <strong>TracingEnabled</strong> is set to <strong>true</strong>.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>Zipkin</p>
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
         * <p>Indicates whether access logs contain custom header fields. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Yes.</li>
         * <li><strong>false</strong>: No.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("AccessLogRecordCustomizedHeadersEnabled")
        public Boolean accessLogRecordCustomizedHeadersEnabled;

        /**
         * <p>The Xtrace configuration information for access logs.</p>
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
         * <p>The ID of the QUIC listener to be associated. This parameter is required when <strong>QuicUpgradeEnabled</strong> is set to <strong>true</strong>. This parameter is valid only for HTTPS listeners.</p>
         * <blockquote>
         * <p>The original listener and the associated QUIC listener must belong to the same ALB instance, and the QUIC listener must not have been previously associated.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>lsn-ek6ad66t****</p>
         */
        @NameInMap("QuicListenerId")
        public String quicListenerId;

        /**
         * <p>Indicates whether QUIC upgrade is enabled. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Yes.</li>
         * <li><strong>false</strong>: No.</li>
         * </ul>
         * <blockquote>
         * <p>This parameter is valid only for HTTPS listeners.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
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
         * <p>The tag key. The tag key can be up to 128 characters in length and cannot start with <code>aliyun</code> or <code>acs:</code>. It cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>env</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value. The tag value can be up to 128 characters in length and cannot start with <code>aliyun</code> or <code>acs:</code>. It cannot contain <code>http://</code> or <code>https://</code>.</p>
         * 
         * <strong>example:</strong>
         * <p>product</p>
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
         * <p>The custom header name. This value takes effect only when <strong>XForwardedForClientCertClientVerifyEnabled</strong> is set to <strong>true</strong>.</p>
         * <p>The value must be 1 to 40 characters in length and can contain lowercase letters a to z, hyphens (-), underscores (_), and digits.</p>
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
         * <p>Indicates whether the <code>X-Forwarded-Clientcert-clientverify</code> header field is used to obtain the verification result of the client certificate that accesses the load balancing instance. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Yes.</li>
         * <li><strong>false</strong>: No.</li>
         * </ul>
         * <blockquote>
         * <p>Only HTTPS listeners support this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("XForwardedForClientCertClientVerifyEnabled")
        public Boolean XForwardedForClientCertClientVerifyEnabled;

        /**
         * <p>The custom header name. This value takes effect only when <strong>XForwardedForClientCertFingerprintEnabled</strong> is set to <strong>true</strong>.</p>
         * <p>The value must be 1 to 40 characters in length and can contain lowercase letters a to z, hyphens (-), underscores (_), and digits.</p>
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
         * <p>Indicates whether the <code>X-Forwarded-Clientcert-fingerprint</code> header field is used to obtain the fingerprint of the client certificate that accesses the load balancing instance. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Yes.</li>
         * <li><strong>false</strong>: No.</li>
         * </ul>
         * <blockquote>
         * <p>Only HTTPS listeners support this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("XForwardedForClientCertFingerprintEnabled")
        public Boolean XForwardedForClientCertFingerprintEnabled;

        /**
         * <p>The custom header name. This value takes effect only when <strong>XForwardedForClientCertIssuerDNEnabled</strong> is set to <strong>true</strong>.</p>
         * <p>The value must be 1 to 40 characters in length and can contain lowercase letters a to z, hyphens (-), underscores (_), and digits.</p>
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
         * <p>Indicates whether the <code>X-Forwarded-Clientcert-issuerdn</code> header field is used to obtain the issuer information of the client certificate that accesses the load balancing instance. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Yes.</li>
         * <li><strong>false</strong>: No.</li>
         * </ul>
         * <blockquote>
         * <p>Only HTTPS listeners support this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("XForwardedForClientCertIssuerDNEnabled")
        public Boolean XForwardedForClientCertIssuerDNEnabled;

        /**
         * <p>The custom header name. This value takes effect only when <strong>XForwardedForClientCertSubjectDNEnabled</strong> is set to <strong>true</strong>.</p>
         * <p>The value must be 1 to 40 characters in length and can contain lowercase letters a to z, hyphens (-), underscores (_), and digits.</p>
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
         * <p>Indicates whether the <code>X-Forwarded-Clientcert-subjectdn</code> header field is used to obtain the owner information of the client certificate that accesses the load balancing instance. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Yes.</li>
         * <li><strong>false</strong>: No.</li>
         * </ul>
         * <blockquote>
         * <p>Only HTTPS listeners support this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("XForwardedForClientCertSubjectDNEnabled")
        public Boolean XForwardedForClientCertSubjectDNEnabled;

        /**
         * <p>Indicates whether ALB is allowed to look up the originating client IP address from the X-Forwarded-For header field. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Yes.</li>
         * <li><strong>false</strong>: No.</li>
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
         * <p>Application Load Balancer (ALB) traverses the <code>X-Forwarded-For</code> header from right to left and selects the first IP address that is not in the trusted IP list as the originating client IP address. This IP address is used for source IP-based rate limiting.</p>
         * 
         * <strong>example:</strong>
         * <p>10.1.1.0/24</p>
         */
        @NameInMap("XForwardedForClientSourceIpsTrusted")
        public String XForwardedForClientSourceIpsTrusted;

        /**
         * <p>Indicates whether the <code>X-Forwarded-Client-Port</code> header field is used to obtain the port of the client that accesses the load balancing instance. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Yes.</li>
         * <li><strong>false</strong>: No.</li>
         * </ul>
         * <blockquote>
         * <p>HTTP and HTTPS listeners support this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("XForwardedForClientSrcPortEnabled")
        public Boolean XForwardedForClientSrcPortEnabled;

        /**
         * <p>Indicates whether the <code>X-Forwarded-For</code> header field is used to obtain the originating IP address of the client. Valid values:</p>
         * <ul>
         * <li><strong>true</strong> (default): Yes.</li>
         * <li><strong>false</strong>: No.</li>
         * </ul>
         * <blockquote>
         * <ol>
         * <li>If set to <strong>true</strong>, <strong>XForwardedForProcessingMode</strong> defaults to <strong>append</strong> and can be changed to <strong>remove</strong>.</li>
         * <li>If set to <strong>false</strong>, the <code>X-Forwarded-For</code> header field is preserved without additional processing before the request is sent to the backend server.</li>
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
         * <p>Indicates whether the <code>X-Forwarded-Host</code> header field is used to obtain the domain name of the client that accesses the load balancing instance. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Yes.</li>
         * <li><strong>false</strong> (default): No.</li>
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
         * <p>The mode for processing the <code>X-Forwarded-For</code> header field. This value takes effect only when <strong>XForwardedForEnabled</strong> is set to <strong>true</strong>. Valid values:</p>
         * <ul>
         * <li><strong>append</strong> (default): Append.</li>
         * <li><strong>remove</strong>: Remove.</li>
         * </ul>
         * <blockquote>
         * <ol>
         * <li>If set to <strong>append</strong>, the last-hop IP address is appended to the <code>X-Forwarded-For</code> header field before the request is sent to the backend server.</li>
         * <li>If set to <strong>remove</strong>, the <code>X-Forwarded-For</code> header is removed before the request is sent to the backend server, regardless of whether the request contains the <code>X-Forwarded-For</code> header field.</li>
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
         * <p>Indicates whether the <code>X-Forwarded-Proto</code> header field is used to obtain the listener protocol of the load balancing instance. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Yes.</li>
         * <li><strong>false</strong>: No.</li>
         * </ul>
         * <blockquote>
         * <p>HTTP, HTTPS, and QUIC listeners support this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("XForwardedForProtoEnabled")
        public Boolean XForwardedForProtoEnabled;

        /**
         * <p>Indicates whether the <code>SLB-ID</code> header field is used to obtain the load balancing instance ID. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Yes.</li>
         * <li><strong>false</strong>: No.</li>
         * </ul>
         * <blockquote>
         * <p>HTTP, HTTPS, and QUIC listeners support this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("XForwardedForSLBIdEnabled")
        public Boolean XForwardedForSLBIdEnabled;

        /**
         * <p>Indicates whether the <code>X-Forwarded-Port</code> header field is used to obtain the listener port of the load balancing instance. Valid values:</p>
         * <ul>
         * <li><strong>true</strong>: Yes.</li>
         * <li><strong>false</strong>: No.</li>
         * </ul>
         * <blockquote>
         * <p>HTTP, HTTPS, and QUIC listeners support this parameter.</p>
         * </blockquote>
         * 
         * <strong>example:</strong>
         * <p>true</p>
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

        public GetListenerAttributeResponseBodyXForwardedForConfig setXForwardedForHostEnabled(Boolean XForwardedForHostEnabled) {
            this.XForwardedForHostEnabled = XForwardedForHostEnabled;
            return this;
        }
        public Boolean getXForwardedForHostEnabled() {
            return this.XForwardedForHostEnabled;
        }

        public GetListenerAttributeResponseBodyXForwardedForConfig setXForwardedForProcessingMode(String XForwardedForProcessingMode) {
            this.XForwardedForProcessingMode = XForwardedForProcessingMode;
            return this;
        }
        public String getXForwardedForProcessingMode() {
            return this.XForwardedForProcessingMode;
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
