// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class ListListenersResponseBody extends TeaModel {
    @NameInMap("Listeners")
    public java.util.List<ListListenersResponseBodyListeners> listeners;

    @NameInMap("MaxResults")
    public Integer maxResults;

    @NameInMap("NextToken")
    public String nextToken;

    @NameInMap("RequestId")
    public String requestId;

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
        @NameInMap("ForwardGroupConfig")
        public ListListenersResponseBodyListenersDefaultActionsForwardGroupConfig forwardGroupConfig;

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
        @NameInMap("TracingEnabled")
        public Boolean tracingEnabled;

        @NameInMap("TracingSample")
        public Integer tracingSample;

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
        @NameInMap("AccessLogRecordCustomizedHeadersEnabled")
        public Boolean accessLogRecordCustomizedHeadersEnabled;

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
        @NameInMap("QuicListenerId")
        public String quicListenerId;

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

        public ListListenersResponseBodyListenersXForwardedForConfig setXForwardedForClientSourceIpsEnabled(Boolean XForwardedForClientSourceIpsEnabled) {
            this.XForwardedForClientSourceIpsEnabled = XForwardedForClientSourceIpsEnabled;
            return this;
        }
        public Boolean getXForwardedForClientSourceIpsEnabled() {
            return this.XForwardedForClientSourceIpsEnabled;
        }

        public ListListenersResponseBodyListenersXForwardedForConfig setXForwardedForClientSourceIpsTrusted(String XForwardedForClientSourceIpsTrusted) {
            this.XForwardedForClientSourceIpsTrusted = XForwardedForClientSourceIpsTrusted;
            return this;
        }
        public String getXForwardedForClientSourceIpsTrusted() {
            return this.XForwardedForClientSourceIpsTrusted;
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
        @NameInMap("DefaultActions")
        public java.util.List<ListListenersResponseBodyListenersDefaultActions> defaultActions;

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
        public ListListenersResponseBodyListenersLogConfig logConfig;

        @NameInMap("QuicConfig")
        public ListListenersResponseBodyListenersQuicConfig quicConfig;

        @NameInMap("RequestTimeout")
        public Integer requestTimeout;

        @NameInMap("SecurityPolicyId")
        public String securityPolicyId;

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
