// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class ListListenersResponseBody extends TeaModel {
    // 监听列表
    @NameInMap("Listeners")
    public java.util.List<ListListenersResponseBodyListeners> listeners;

    // 本次请求所返回的最大记录条数。
    @NameInMap("MaxResults")
    public Integer maxResults;

    // 用来表示当前调用返回读取到的位置，空代表数据已经读取完毕。
    @NameInMap("NextToken")
    public String nextToken;

    // Id of the request
    @NameInMap("RequestId")
    public String requestId;

    // 本次请求条件下的数据总量。
    @NameInMap("TotalCount")
    public Integer totalCount;

    public static ListListenersResponseBody build(java.util.Map<String, ?> map) throws Exception {
        ListListenersResponseBody self = new ListListenersResponseBody();
        return TeaModel.build(map, self);
    }

    public ListListenersResponseBody setListeners(java.util.List<ListListenersResponseBodyListeners> listeners) {
        this.listeners = listeners;
        return this;
    }
    public java.util.List<ListListenersResponseBodyListeners> getListeners() {
        return this.listeners;
    }

    public ListListenersResponseBody setMaxResults(Integer maxResults) {
        this.maxResults = maxResults;
        return this;
    }
    public Integer getMaxResults() {
        return this.maxResults;
    }

    public ListListenersResponseBody setNextToken(String nextToken) {
        this.nextToken = nextToken;
        return this;
    }
    public String getNextToken() {
        return this.nextToken;
    }

    public ListListenersResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public ListListenersResponseBody setTotalCount(Integer totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Integer getTotalCount() {
        return this.totalCount;
    }

    public static class ListListenersResponseBodyListenersDefaultActionsForwardGroupConfigServerGroupTuples extends TeaModel {
        // 服务器组ID
        @NameInMap("ServerGroupId")
        public String serverGroupId;

        public static ListListenersResponseBodyListenersDefaultActionsForwardGroupConfigServerGroupTuples build(java.util.Map<String, ?> map) throws Exception {
            ListListenersResponseBodyListenersDefaultActionsForwardGroupConfigServerGroupTuples self = new ListListenersResponseBodyListenersDefaultActionsForwardGroupConfigServerGroupTuples();
            return TeaModel.build(map, self);
        }

        public ListListenersResponseBodyListenersDefaultActionsForwardGroupConfigServerGroupTuples setServerGroupId(String serverGroupId) {
            this.serverGroupId = serverGroupId;
            return this;
        }
        public String getServerGroupId() {
            return this.serverGroupId;
        }

    }

    public static class ListListenersResponseBodyListenersDefaultActionsForwardGroupConfig extends TeaModel {
        // 服务器组列表
        @NameInMap("ServerGroupTuples")
        public java.util.List<ListListenersResponseBodyListenersDefaultActionsForwardGroupConfigServerGroupTuples> serverGroupTuples;

        public static ListListenersResponseBodyListenersDefaultActionsForwardGroupConfig build(java.util.Map<String, ?> map) throws Exception {
            ListListenersResponseBodyListenersDefaultActionsForwardGroupConfig self = new ListListenersResponseBodyListenersDefaultActionsForwardGroupConfig();
            return TeaModel.build(map, self);
        }

        public ListListenersResponseBodyListenersDefaultActionsForwardGroupConfig setServerGroupTuples(java.util.List<ListListenersResponseBodyListenersDefaultActionsForwardGroupConfigServerGroupTuples> serverGroupTuples) {
            this.serverGroupTuples = serverGroupTuples;
            return this;
        }
        public java.util.List<ListListenersResponseBodyListenersDefaultActionsForwardGroupConfigServerGroupTuples> getServerGroupTuples() {
            return this.serverGroupTuples;
        }

    }

    public static class ListListenersResponseBodyListenersDefaultActions extends TeaModel {
        // 转发到服务器组
        @NameInMap("ForwardGroupConfig")
        public ListListenersResponseBodyListenersDefaultActionsForwardGroupConfig forwardGroupConfig;

        // 类型
        @NameInMap("Type")
        public String type;

        public static ListListenersResponseBodyListenersDefaultActions build(java.util.Map<String, ?> map) throws Exception {
            ListListenersResponseBodyListenersDefaultActions self = new ListListenersResponseBodyListenersDefaultActions();
            return TeaModel.build(map, self);
        }

        public ListListenersResponseBodyListenersDefaultActions setForwardGroupConfig(ListListenersResponseBodyListenersDefaultActionsForwardGroupConfig forwardGroupConfig) {
            this.forwardGroupConfig = forwardGroupConfig;
            return this;
        }
        public ListListenersResponseBodyListenersDefaultActionsForwardGroupConfig getForwardGroupConfig() {
            return this.forwardGroupConfig;
        }

        public ListListenersResponseBodyListenersDefaultActions setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class ListListenersResponseBodyListenersLogConfigAccessLogTracingConfig extends TeaModel {
        // Xtrace功能状态
        @NameInMap("TracingEnabled")
        public Boolean tracingEnabled;

        // Xtrace功能状态
        @NameInMap("TracingSample")
        public Integer tracingSample;

        // xtrace的类型
        @NameInMap("TracingType")
        public String tracingType;

        public static ListListenersResponseBodyListenersLogConfigAccessLogTracingConfig build(java.util.Map<String, ?> map) throws Exception {
            ListListenersResponseBodyListenersLogConfigAccessLogTracingConfig self = new ListListenersResponseBodyListenersLogConfigAccessLogTracingConfig();
            return TeaModel.build(map, self);
        }

        public ListListenersResponseBodyListenersLogConfigAccessLogTracingConfig setTracingEnabled(Boolean tracingEnabled) {
            this.tracingEnabled = tracingEnabled;
            return this;
        }
        public Boolean getTracingEnabled() {
            return this.tracingEnabled;
        }

        public ListListenersResponseBodyListenersLogConfigAccessLogTracingConfig setTracingSample(Integer tracingSample) {
            this.tracingSample = tracingSample;
            return this;
        }
        public Integer getTracingSample() {
            return this.tracingSample;
        }

        public ListListenersResponseBodyListenersLogConfigAccessLogTracingConfig setTracingType(String tracingType) {
            this.tracingType = tracingType;
            return this;
        }
        public String getTracingType() {
            return this.tracingType;
        }

    }

    public static class ListListenersResponseBodyListenersLogConfig extends TeaModel {
        // 访问日志是否开启携带自定义Header
        @NameInMap("AccessLogRecordCustomizedHeadersEnabled")
        public Boolean accessLogRecordCustomizedHeadersEnabled;

        // 访问日志Xtrace相关的配置
        @NameInMap("AccessLogTracingConfig")
        public ListListenersResponseBodyListenersLogConfigAccessLogTracingConfig accessLogTracingConfig;

        public static ListListenersResponseBodyListenersLogConfig build(java.util.Map<String, ?> map) throws Exception {
            ListListenersResponseBodyListenersLogConfig self = new ListListenersResponseBodyListenersLogConfig();
            return TeaModel.build(map, self);
        }

        public ListListenersResponseBodyListenersLogConfig setAccessLogRecordCustomizedHeadersEnabled(Boolean accessLogRecordCustomizedHeadersEnabled) {
            this.accessLogRecordCustomizedHeadersEnabled = accessLogRecordCustomizedHeadersEnabled;
            return this;
        }
        public Boolean getAccessLogRecordCustomizedHeadersEnabled() {
            return this.accessLogRecordCustomizedHeadersEnabled;
        }

        public ListListenersResponseBodyListenersLogConfig setAccessLogTracingConfig(ListListenersResponseBodyListenersLogConfigAccessLogTracingConfig accessLogTracingConfig) {
            this.accessLogTracingConfig = accessLogTracingConfig;
            return this;
        }
        public ListListenersResponseBodyListenersLogConfigAccessLogTracingConfig getAccessLogTracingConfig() {
            return this.accessLogTracingConfig;
        }

    }

    public static class ListListenersResponseBodyListenersQuicConfig extends TeaModel {
        // 需要关联的QUIC监听ID，HTTPS监听时有效，QuicUpgradeEnabled为true时必选
        @NameInMap("QuicListenerId")
        public String quicListenerId;

        // 是否开启quic升级，HTTPS监听时有效
        @NameInMap("QuicUpgradeEnabled")
        public Boolean quicUpgradeEnabled;

        public static ListListenersResponseBodyListenersQuicConfig build(java.util.Map<String, ?> map) throws Exception {
            ListListenersResponseBodyListenersQuicConfig self = new ListListenersResponseBodyListenersQuicConfig();
            return TeaModel.build(map, self);
        }

        public ListListenersResponseBodyListenersQuicConfig setQuicListenerId(String quicListenerId) {
            this.quicListenerId = quicListenerId;
            return this;
        }
        public String getQuicListenerId() {
            return this.quicListenerId;
        }

        public ListListenersResponseBodyListenersQuicConfig setQuicUpgradeEnabled(Boolean quicUpgradeEnabled) {
            this.quicUpgradeEnabled = quicUpgradeEnabled;
            return this;
        }
        public Boolean getQuicUpgradeEnabled() {
            return this.quicUpgradeEnabled;
        }

    }

    public static class ListListenersResponseBodyListenersXForwardedForConfig extends TeaModel {
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

        public static ListListenersResponseBodyListenersXForwardedForConfig build(java.util.Map<String, ?> map) throws Exception {
            ListListenersResponseBodyListenersXForwardedForConfig self = new ListListenersResponseBodyListenersXForwardedForConfig();
            return TeaModel.build(map, self);
        }

        public ListListenersResponseBodyListenersXForwardedForConfig setXForwardedForClientCertClientVerifyAlias(String XForwardedForClientCertClientVerifyAlias) {
            this.XForwardedForClientCertClientVerifyAlias = XForwardedForClientCertClientVerifyAlias;
            return this;
        }
        public String getXForwardedForClientCertClientVerifyAlias() {
            return this.XForwardedForClientCertClientVerifyAlias;
        }

        public ListListenersResponseBodyListenersXForwardedForConfig setXForwardedForClientCertClientVerifyEnabled(Boolean XForwardedForClientCertClientVerifyEnabled) {
            this.XForwardedForClientCertClientVerifyEnabled = XForwardedForClientCertClientVerifyEnabled;
            return this;
        }
        public Boolean getXForwardedForClientCertClientVerifyEnabled() {
            return this.XForwardedForClientCertClientVerifyEnabled;
        }

        public ListListenersResponseBodyListenersXForwardedForConfig setXForwardedForClientCertFingerprintAlias(String XForwardedForClientCertFingerprintAlias) {
            this.XForwardedForClientCertFingerprintAlias = XForwardedForClientCertFingerprintAlias;
            return this;
        }
        public String getXForwardedForClientCertFingerprintAlias() {
            return this.XForwardedForClientCertFingerprintAlias;
        }

        public ListListenersResponseBodyListenersXForwardedForConfig setXForwardedForClientCertFingerprintEnabled(Boolean XForwardedForClientCertFingerprintEnabled) {
            this.XForwardedForClientCertFingerprintEnabled = XForwardedForClientCertFingerprintEnabled;
            return this;
        }
        public Boolean getXForwardedForClientCertFingerprintEnabled() {
            return this.XForwardedForClientCertFingerprintEnabled;
        }

        public ListListenersResponseBodyListenersXForwardedForConfig setXForwardedForClientCertIssuerDNAlias(String XForwardedForClientCertIssuerDNAlias) {
            this.XForwardedForClientCertIssuerDNAlias = XForwardedForClientCertIssuerDNAlias;
            return this;
        }
        public String getXForwardedForClientCertIssuerDNAlias() {
            return this.XForwardedForClientCertIssuerDNAlias;
        }

        public ListListenersResponseBodyListenersXForwardedForConfig setXForwardedForClientCertIssuerDNEnabled(Boolean XForwardedForClientCertIssuerDNEnabled) {
            this.XForwardedForClientCertIssuerDNEnabled = XForwardedForClientCertIssuerDNEnabled;
            return this;
        }
        public Boolean getXForwardedForClientCertIssuerDNEnabled() {
            return this.XForwardedForClientCertIssuerDNEnabled;
        }

        public ListListenersResponseBodyListenersXForwardedForConfig setXForwardedForClientCertSubjectDNAlias(String XForwardedForClientCertSubjectDNAlias) {
            this.XForwardedForClientCertSubjectDNAlias = XForwardedForClientCertSubjectDNAlias;
            return this;
        }
        public String getXForwardedForClientCertSubjectDNAlias() {
            return this.XForwardedForClientCertSubjectDNAlias;
        }

        public ListListenersResponseBodyListenersXForwardedForConfig setXForwardedForClientCertSubjectDNEnabled(Boolean XForwardedForClientCertSubjectDNEnabled) {
            this.XForwardedForClientCertSubjectDNEnabled = XForwardedForClientCertSubjectDNEnabled;
            return this;
        }
        public Boolean getXForwardedForClientCertSubjectDNEnabled() {
            return this.XForwardedForClientCertSubjectDNEnabled;
        }

        public ListListenersResponseBodyListenersXForwardedForConfig setXForwardedForClientSrcPortEnabled(Boolean XForwardedForClientSrcPortEnabled) {
            this.XForwardedForClientSrcPortEnabled = XForwardedForClientSrcPortEnabled;
            return this;
        }
        public Boolean getXForwardedForClientSrcPortEnabled() {
            return this.XForwardedForClientSrcPortEnabled;
        }

        public ListListenersResponseBodyListenersXForwardedForConfig setXForwardedForEnabled(Boolean XForwardedForEnabled) {
            this.XForwardedForEnabled = XForwardedForEnabled;
            return this;
        }
        public Boolean getXForwardedForEnabled() {
            return this.XForwardedForEnabled;
        }

        public ListListenersResponseBodyListenersXForwardedForConfig setXForwardedForProtoEnabled(Boolean XForwardedForProtoEnabled) {
            this.XForwardedForProtoEnabled = XForwardedForProtoEnabled;
            return this;
        }
        public Boolean getXForwardedForProtoEnabled() {
            return this.XForwardedForProtoEnabled;
        }

        public ListListenersResponseBodyListenersXForwardedForConfig setXForwardedForSLBIdEnabled(Boolean XForwardedForSLBIdEnabled) {
            this.XForwardedForSLBIdEnabled = XForwardedForSLBIdEnabled;
            return this;
        }
        public Boolean getXForwardedForSLBIdEnabled() {
            return this.XForwardedForSLBIdEnabled;
        }

        public ListListenersResponseBodyListenersXForwardedForConfig setXForwardedForSLBPortEnabled(Boolean XForwardedForSLBPortEnabled) {
            this.XForwardedForSLBPortEnabled = XForwardedForSLBPortEnabled;
            return this;
        }
        public Boolean getXForwardedForSLBPortEnabled() {
            return this.XForwardedForSLBPortEnabled;
        }

    }

    public static class ListListenersResponseBodyListeners extends TeaModel {
        // 默认动作
        @NameInMap("DefaultActions")
        public java.util.List<ListListenersResponseBodyListenersDefaultActions> defaultActions;

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
        public ListListenersResponseBodyListenersLogConfig logConfig;

        // HTTPS启用QUIC时相关属性
        @NameInMap("QuicConfig")
        public ListListenersResponseBodyListenersQuicConfig quicConfig;

        // 请求超时时间
        @NameInMap("RequestTimeout")
        public Integer requestTimeout;

        // 安全策略
        @NameInMap("SecurityPolicyId")
        public String securityPolicyId;

        // XForward字段相关的配置
        @NameInMap("XForwardedForConfig")
        public ListListenersResponseBodyListenersXForwardedForConfig XForwardedForConfig;

        public static ListListenersResponseBodyListeners build(java.util.Map<String, ?> map) throws Exception {
            ListListenersResponseBodyListeners self = new ListListenersResponseBodyListeners();
            return TeaModel.build(map, self);
        }

        public ListListenersResponseBodyListeners setDefaultActions(java.util.List<ListListenersResponseBodyListenersDefaultActions> defaultActions) {
            this.defaultActions = defaultActions;
            return this;
        }
        public java.util.List<ListListenersResponseBodyListenersDefaultActions> getDefaultActions() {
            return this.defaultActions;
        }

        public ListListenersResponseBodyListeners setGzipEnabled(Boolean gzipEnabled) {
            this.gzipEnabled = gzipEnabled;
            return this;
        }
        public Boolean getGzipEnabled() {
            return this.gzipEnabled;
        }

        public ListListenersResponseBodyListeners setHttp2Enabled(Boolean http2Enabled) {
            this.http2Enabled = http2Enabled;
            return this;
        }
        public Boolean getHttp2Enabled() {
            return this.http2Enabled;
        }

        public ListListenersResponseBodyListeners setIdleTimeout(Integer idleTimeout) {
            this.idleTimeout = idleTimeout;
            return this;
        }
        public Integer getIdleTimeout() {
            return this.idleTimeout;
        }

        public ListListenersResponseBodyListeners setListenerDescription(String listenerDescription) {
            this.listenerDescription = listenerDescription;
            return this;
        }
        public String getListenerDescription() {
            return this.listenerDescription;
        }

        public ListListenersResponseBodyListeners setListenerId(String listenerId) {
            this.listenerId = listenerId;
            return this;
        }
        public String getListenerId() {
            return this.listenerId;
        }

        public ListListenersResponseBodyListeners setListenerPort(Integer listenerPort) {
            this.listenerPort = listenerPort;
            return this;
        }
        public Integer getListenerPort() {
            return this.listenerPort;
        }

        public ListListenersResponseBodyListeners setListenerProtocol(String listenerProtocol) {
            this.listenerProtocol = listenerProtocol;
            return this;
        }
        public String getListenerProtocol() {
            return this.listenerProtocol;
        }

        public ListListenersResponseBodyListeners setListenerStatus(String listenerStatus) {
            this.listenerStatus = listenerStatus;
            return this;
        }
        public String getListenerStatus() {
            return this.listenerStatus;
        }

        public ListListenersResponseBodyListeners setLoadBalancerId(String loadBalancerId) {
            this.loadBalancerId = loadBalancerId;
            return this;
        }
        public String getLoadBalancerId() {
            return this.loadBalancerId;
        }

        public ListListenersResponseBodyListeners setLogConfig(ListListenersResponseBodyListenersLogConfig logConfig) {
            this.logConfig = logConfig;
            return this;
        }
        public ListListenersResponseBodyListenersLogConfig getLogConfig() {
            return this.logConfig;
        }

        public ListListenersResponseBodyListeners setQuicConfig(ListListenersResponseBodyListenersQuicConfig quicConfig) {
            this.quicConfig = quicConfig;
            return this;
        }
        public ListListenersResponseBodyListenersQuicConfig getQuicConfig() {
            return this.quicConfig;
        }

        public ListListenersResponseBodyListeners setRequestTimeout(Integer requestTimeout) {
            this.requestTimeout = requestTimeout;
            return this;
        }
        public Integer getRequestTimeout() {
            return this.requestTimeout;
        }

        public ListListenersResponseBodyListeners setSecurityPolicyId(String securityPolicyId) {
            this.securityPolicyId = securityPolicyId;
            return this;
        }
        public String getSecurityPolicyId() {
            return this.securityPolicyId;
        }

        public ListListenersResponseBodyListeners setXForwardedForConfig(ListListenersResponseBodyListenersXForwardedForConfig XForwardedForConfig) {
            this.XForwardedForConfig = XForwardedForConfig;
            return this;
        }
        public ListListenersResponseBodyListenersXForwardedForConfig getXForwardedForConfig() {
            return this.XForwardedForConfig;
        }

    }

}
