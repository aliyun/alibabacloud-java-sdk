// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class GetListenerAttributeResponseBody extends TeaModel {
    @NameInMap("AclConfig")
    public GetListenerAttributeResponseBodyAclConfig aclConfig;

    @NameInMap("CaEnabled")
    public Boolean caEnabled;

    @NameInMap("Certificates")
    public java.util.List<GetListenerAttributeResponseBodyCertificates> certificates;

    @NameInMap("DefaultActions")
    public java.util.List<GetListenerAttributeResponseBodyDefaultActions> defaultActions;

    @NameInMap("GzipEnabled")
    public Boolean gzipEnabled;

    @NameInMap("Http2Enabled")
    public Boolean http2Enabled;

    @NameInMap("IdleTimeout")
    public Integer idleTimeout;

    @NameInMap("ListenerDescription")
    public String listenerDescription;

    @NameInMap("ListenerId")
    public String listenerId;

    @NameInMap("ListenerPort")
    public Integer listenerPort;

    @NameInMap("ListenerProtocol")
    public String listenerProtocol;

    @NameInMap("ListenerStatus")
    public String listenerStatus;

    @NameInMap("LoadBalancerId")
    public String loadBalancerId;

    @NameInMap("LogConfig")
    public GetListenerAttributeResponseBodyLogConfig logConfig;

    @NameInMap("QuicConfig")
    public GetListenerAttributeResponseBodyQuicConfig quicConfig;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("RequestTimeout")
    public Integer requestTimeout;

    @NameInMap("SecurityPolicyId")
    public String securityPolicyId;

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

    public GetListenerAttributeResponseBody setXForwardedForConfig(GetListenerAttributeResponseBodyXForwardedForConfig XForwardedForConfig) {
        this.XForwardedForConfig = XForwardedForConfig;
        return this;
    }
    public GetListenerAttributeResponseBodyXForwardedForConfig getXForwardedForConfig() {
        return this.XForwardedForConfig;
    }

    public static class GetListenerAttributeResponseBodyAclConfigAclRelations extends TeaModel {
        @NameInMap("AclId")
        public String aclId;

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
        @NameInMap("AclRelations")
        public java.util.List<GetListenerAttributeResponseBodyAclConfigAclRelations> aclRelations;

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

    public static class GetListenerAttributeResponseBodyCertificates extends TeaModel {
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
        @NameInMap("ForwardGroupConfig")
        public GetListenerAttributeResponseBodyDefaultActionsForwardGroupConfig forwardGroupConfig;

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
        @NameInMap("TracingEnabled")
        public Boolean tracingEnabled;

        @NameInMap("TracingSample")
        public Integer tracingSample;

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
        @NameInMap("AccessLogRecordCustomizedHeadersEnabled")
        public Boolean accessLogRecordCustomizedHeadersEnabled;

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
        @NameInMap("QuicListenerId")
        public String quicListenerId;

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

    public static class GetListenerAttributeResponseBodyXForwardedForConfig extends TeaModel {
        @NameInMap("XForwardedForClientCertClientVerifyAlias")
        public String XForwardedForClientCertClientVerifyAlias;

        @NameInMap("XForwardedForClientCertClientVerifyEnabled")
        public Boolean XForwardedForClientCertClientVerifyEnabled;

        @NameInMap("XForwardedForClientCertFingerprintAlias")
        public String XForwardedForClientCertFingerprintAlias;

        @NameInMap("XForwardedForClientCertFingerprintEnabled")
        public Boolean XForwardedForClientCertFingerprintEnabled;

        @NameInMap("XForwardedForClientCertIssuerDNAlias")
        public String XForwardedForClientCertIssuerDNAlias;

        @NameInMap("XForwardedForClientCertIssuerDNEnabled")
        public Boolean XForwardedForClientCertIssuerDNEnabled;

        @NameInMap("XForwardedForClientCertSubjectDNAlias")
        public String XForwardedForClientCertSubjectDNAlias;

        @NameInMap("XForwardedForClientCertSubjectDNEnabled")
        public Boolean XForwardedForClientCertSubjectDNEnabled;

        @NameInMap("XForwardedForClientSourceIpsEnabled")
        public Boolean XForwardedForClientSourceIpsEnabled;

        @NameInMap("XForwardedForClientSourceIpsTrusted")
        public String XForwardedForClientSourceIpsTrusted;

        @NameInMap("XForwardedForClientSrcPortEnabled")
        public Boolean XForwardedForClientSrcPortEnabled;

        @NameInMap("XForwardedForEnabled")
        public Boolean XForwardedForEnabled;

        @NameInMap("XForwardedForProtoEnabled")
        public Boolean XForwardedForProtoEnabled;

        @NameInMap("XForwardedForSLBIdEnabled")
        public Boolean XForwardedForSLBIdEnabled;

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
