// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class GetListenerAttributeResponseBody extends TeaModel {
    // ACL相关配置信息
    @NameInMap("AclConfig")
    public GetListenerAttributeResponseBodyAclConfig aclConfig;

    // 监听默认服务器证书列表，N当前取值范围为1
    @NameInMap("Certificates")
    public java.util.List<GetListenerAttributeResponseBodyCertificates> certificates;

    // 是否开启双向认证
    @NameInMap("CaEnabled")
    public Boolean caEnabled;

    // 默认动作
    @NameInMap("DefaultActions")
    public java.util.List<GetListenerAttributeResponseBodyDefaultActions> defaultActions;

    // 是否开启Gzip压缩
    @NameInMap("GzipEnabled")
    public Boolean gzipEnabled;

    // 是否开启HTTP/2特性
    @NameInMap("Http2Enabled")
    public Boolean http2Enabled;

    // 连接空闲超时时间
    @NameInMap("IdleTimeout")
    public Integer idleTimeout;

    // 监听描述
    @NameInMap("ListenerDescription")
    public String listenerDescription;

    // 监听标识
    @NameInMap("ListenerId")
    public String listenerId;

    // 监听端口
    @NameInMap("ListenerPort")
    public Integer listenerPort;

    // 监听协议
    @NameInMap("ListenerProtocol")
    public String listenerProtocol;

    // 监听状态
    @NameInMap("ListenerStatus")
    public String listenerStatus;

    // 负载均衡标识
    @NameInMap("LoadBalancerId")
    public String loadBalancerId;

    // 监听访问日志相关配置
    @NameInMap("LogConfig")
    public GetListenerAttributeResponseBodyLogConfig logConfig;

    // HTTPS启用QUIC时相关属性
    @NameInMap("QuicConfig")
    public GetListenerAttributeResponseBodyQuicConfig quicConfig;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    // 请求超时时间
    @NameInMap("RequestTimeout")
    public Integer requestTimeout;

    // 安全策略
    @NameInMap("SecurityPolicyId")
    public String securityPolicyId;

    // XForward字段相关的配置
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

    public GetListenerAttributeResponseBody setCertificates(java.util.List<GetListenerAttributeResponseBodyCertificates> certificates) {
        this.certificates = certificates;
        return this;
    }
    public java.util.List<GetListenerAttributeResponseBodyCertificates> getCertificates() {
        return this.certificates;
    }

    public GetListenerAttributeResponseBody setCaEnabled(Boolean caEnabled) {
        this.caEnabled = caEnabled;
        return this;
    }
    public Boolean getCaEnabled() {
        return this.caEnabled;
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
        // ACL标识
        @NameInMap("AclId")
        public String aclId;

        // ACL与监听关联的状态
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
        // 监听绑定的访问策略组
        @NameInMap("AclRelations")
        public java.util.List<GetListenerAttributeResponseBodyAclConfigAclRelations> aclRelations;

        // 访问控制类型
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
        // 正式标识
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
        // 服务器组ID
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
        // 服务器组列表
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
        // 转发到服务器组
        @NameInMap("ForwardGroupConfig")
        public GetListenerAttributeResponseBodyDefaultActionsForwardGroupConfig forwardGroupConfig;

        // 类型
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
        // Xtrace功能状态
        @NameInMap("TracingEnabled")
        public Boolean tracingEnabled;

        // Xtrace功能状态
        @NameInMap("TracingSample")
        public Integer tracingSample;

        // xtrace的类型
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
        // 访问日志是否开启携带自定义Header
        @NameInMap("AccessLogRecordCustomizedHeadersEnabled")
        public Boolean accessLogRecordCustomizedHeadersEnabled;

        // 访问日志Xtrace相关的配置
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
        // 需要关联的QUIC监听ID，HTTPS监听时有效，QuicUpgradeEnabled为true时必选
        @NameInMap("QuicListenerId")
        public String quicListenerId;

        // 是否开启quic升级，HTTPS监听时有效
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
        // 自定义HEADER头名称，只有当XForwardedForClientCertClientVerifyEnabled的值为true的时候，此值才会生效；否则该值不会生效。HTTPS监听有效
        @NameInMap("XForwardedForClientCertClientVerifyAlias")
        public String XForwardedForClientCertClientVerifyAlias;

        // 是否通过X-Forwarded-Clientcert-clientverify  头字段获取对访问负载均衡实例客户端证书的校验结果。HTTPS监听有效。
        @NameInMap("XForwardedForClientCertClientVerifyEnabled")
        public Boolean XForwardedForClientCertClientVerifyEnabled;

        // 自定义HEADER头名称，只有当XForwardedForClientCertFingerprintEnabled的值为true的时候，此值才会生效；否则该值不会生效。HTTPS监听有效
        @NameInMap("XForwardedForClientCertFingerprintAlias")
        public String XForwardedForClientCertFingerprintAlias;

        // 是否通过X-Forwarded-Clientcert-fingerprint 头字段获取访问负载均衡实例客户端证书的指纹取值，HTTPS监听有效。
        @NameInMap("XForwardedForClientCertFingerprintEnabled")
        public Boolean XForwardedForClientCertFingerprintEnabled;

        // 自定义HEADER头名称，只有当XForwardedForClientCertIssuerDNEnabled的值为‘On’的时候，此值才会生效；否则该值不会生效。HTTPS监听有效
        @NameInMap("XForwardedForClientCertIssuerDNAlias")
        public String XForwardedForClientCertIssuerDNAlias;

        // 是否通过 X-Forwarded-Clientcert-issuerdn 头字段获取访问负载均衡实例客户端证书的发行者信息。HTTPS监听有效。
        @NameInMap("XForwardedForClientCertIssuerDNEnabled")
        public Boolean XForwardedForClientCertIssuerDNEnabled;

        // 自定义HEADER头名称，只有当XForwardedForClientCertSubjectDNEnabled的值为true的时候，此值才会生效；否则该值不会生效。HTTPS监听有效
        @NameInMap("XForwardedForClientCertSubjectDNAlias")
        public String XForwardedForClientCertSubjectDNAlias;

        // 是否通过X-Forwarded-Clientcert-subjectdn  头字段获取访问负载均衡实例客户端证书的所有者信息。HTTPS监听有效。
        @NameInMap("XForwardedForClientCertSubjectDNEnabled")
        public Boolean XForwardedForClientCertSubjectDNEnabled;

        // 是否通过X-Forwarded-Client-Port 头字段获取访问负载均衡实例客户端的端口。HTTPS监听有效。
        @NameInMap("XForwardedForClientSrcPortEnabled")
        public Boolean XForwardedForClientSrcPortEnabled;

        // 是否开启通过X-Forwarded-For头字段获取来访者真实 IP
        @NameInMap("XForwardedForEnabled")
        public Boolean XForwardedForEnabled;

        // 是否通过X-Forwarded-Proto头字段获取负载均衡实例的监听协议。
        @NameInMap("XForwardedForProtoEnabled")
        public Boolean XForwardedForProtoEnabled;

        // 是否通过SLB-ID头字段获取负载均衡实例ID。
        @NameInMap("XForwardedForSLBIdEnabled")
        public Boolean XForwardedForSLBIdEnabled;

        // 是否通过X-Forwarded-Port 头字段获取负载均衡实例的监听端口。HTTPS监听有效。
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
