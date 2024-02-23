// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alb20200616.models;

import com.aliyun.tea.*;

public class ListListenersResponseBody extends TeaModel {
    /**
     * <p>The listeners.</p>
     */
    @NameInMap("Listeners")
    public java.util.List<ListListenersResponseBodyListeners> listeners;

    /**
     * <p>The maximum number of entries returned.</p>
     */
    @NameInMap("MaxResults")
    public Integer maxResults;

    /**
     * <p>The position where the query stopped. If this parameter is not returned, all data is queried.</p>
     */
    @NameInMap("NextToken")
    public String nextToken;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of entries returned.</p>
     */
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
        /**
         * <p>The ID of the server group to which requests are forwarded.</p>
         */
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
        /**
         * <p>The server groups to which requests are forwarded.</p>
         */
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
        /**
         * <p>The configuration of the forwarding rule action. This parameter is required and takes effect only if the type of the action is **ForwardGroup**.</p>
         */
        @NameInMap("ForwardGroupConfig")
        public ListListenersResponseBodyListenersDefaultActionsForwardGroupConfig forwardGroupConfig;

        /**
         * <p>The type of the action. If **ForwardGroup** is returned, requests are forwarded to multiple vServer groups.</p>
         */
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
        /**
         * <p>Indicates whether Xtrace is enabled. Valid values:</p>
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false**</p>
         * <br>
         * <p>>  This parameter can be set to **true** only if **AccessLogEnabled** is set to true.</p>
         */
        @NameInMap("TracingEnabled")
        public Boolean tracingEnabled;

        /**
         * <p>The sampling rate of Xtrace. Valid values: **1 to 10000**.</p>
         * <br>
         * <p>>  This parameter takes effect only if **TracingEnabled** is set to **true**.</p>
         */
        @NameInMap("TracingSample")
        public Integer tracingSample;

        /**
         * <p>The Xtrace type. Only **Zipkin** may be returned.</p>
         * <br>
         * <p>>  This parameter takes effect only if **TracingEnabled** is set to **true**.</p>
         */
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
        /**
         * <p>Indicates whether custom headers are carried in the access log. Valid values:</p>
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false**</p>
         */
        @NameInMap("AccessLogRecordCustomizedHeadersEnabled")
        public Boolean accessLogRecordCustomizedHeadersEnabled;

        /**
         * <p>The configuration of Xtrace. Xtrace is used to record the requests that are sent to ALB.</p>
         */
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
        /**
         * <p>The ID of the QUIC listener. This parameter is required when **QuicUpgradeEnabled** is set to **true**. Only HTTPS listeners support this parameter.</p>
         * <br>
         * <p>>  The HTTPS listener and the associated QUIC listener must belong to the same ALB instance. The QUIC listener cannot be associated with another listener.</p>
         */
        @NameInMap("QuicListenerId")
        public String quicListenerId;

        /**
         * <p>Indicates whether QUIC upgrade is enabled. Valid values:</p>
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false**</p>
         * <br>
         * <p>>  This parameter takes effect only for HTTPS listeners.</p>
         */
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

    public static class ListListenersResponseBodyListenersTags extends TeaModel {
        /**
         * <p>The tag key.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The tag value.</p>
         */
        @NameInMap("Value")
        public String value;

        public static ListListenersResponseBodyListenersTags build(java.util.Map<String, ?> map) throws Exception {
            ListListenersResponseBodyListenersTags self = new ListListenersResponseBodyListenersTags();
            return TeaModel.build(map, self);
        }

        public ListListenersResponseBodyListenersTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public ListListenersResponseBodyListenersTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class ListListenersResponseBodyListenersXForwardedForConfig extends TeaModel {
        /**
         * <p>The name of the custom header. This parameter takes effect only if **XForwardedForClientCertClientVerifyEnabled** is set to **true**.</p>
         * <br>
         * <p>The name is 1 to 40 characters in length, and can contain letters, digits, hyphens (-), and underscores (\_).</p>
         * <br>
         * <p>>  This parameter is returned only for HTTPS listeners.</p>
         */
        @NameInMap("XForwardedForClientCertClientVerifyAlias")
        public String XForwardedForClientCertClientVerifyAlias;

        /**
         * <p>Indicates whether the `X-Forwarded-Clientcert-clientverify` header is used to obtain the verification result of the client certificate. Valid values:</p>
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false**</p>
         * <br>
         * <p>>  This parameter is returned only for HTTPS listeners.</p>
         */
        @NameInMap("XForwardedForClientCertClientVerifyEnabled")
        public Boolean XForwardedForClientCertClientVerifyEnabled;

        /**
         * <p>The name of the custom header. This parameter takes effect only if **XForwardedForClientCertFingerprintEnabled** is set to **true**.</p>
         * <br>
         * <p>The name is 1 to 40 characters in length, and can contain letters, digits, hyphens (-), and underscores (\_).</p>
         * <br>
         * <p>>  This parameter is returned only for HTTPS listeners.</p>
         */
        @NameInMap("XForwardedForClientCertFingerprintAlias")
        public String XForwardedForClientCertFingerprintAlias;

        /**
         * <p>Indicates whether the `X-Forwarded-Clientcert-fingerprint` header is used to retrieve the fingerprint of the client certificate. Valid values:</p>
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false**</p>
         * <br>
         * <p>>  This parameter is returned only for HTTPS listeners.</p>
         */
        @NameInMap("XForwardedForClientCertFingerprintEnabled")
        public Boolean XForwardedForClientCertFingerprintEnabled;

        /**
         * <p>The name of the custom header. This parameter takes effect only if **XForwardedForClientCertIssuerDNEnabled** is set to **true**.</p>
         * <br>
         * <p>The name is 1 to 40 characters in length, and can contain letters, digits, hyphens (-), and underscores (\_).</p>
         * <br>
         * <p>>  This parameter is returned only for HTTPS listeners.</p>
         */
        @NameInMap("XForwardedForClientCertIssuerDNAlias")
        public String XForwardedForClientCertIssuerDNAlias;

        /**
         * <p>Indicates whether the `X-Forwarded-Clientcert-issuerdn` header is used to retrieve information about the authority that issues the client certificate. Valid values:</p>
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false**</p>
         * <br>
         * <p>>  This parameter is returned only for HTTPS listeners.</p>
         */
        @NameInMap("XForwardedForClientCertIssuerDNEnabled")
        public Boolean XForwardedForClientCertIssuerDNEnabled;

        /**
         * <p>The name of the custom header. This parameter takes effect only if **XForwardedForClientCertSubjectDNEnabled** is set to **true**.</p>
         * <br>
         * <p>The name is 1 to 40 characters in length, and can contain letters, digits, hyphens (-), and underscores (\_).</p>
         * <br>
         * <p>>  This parameter is returned only for HTTPS listeners.</p>
         */
        @NameInMap("XForwardedForClientCertSubjectDNAlias")
        public String XForwardedForClientCertSubjectDNAlias;

        /**
         * <p>Indicates whether the `X-Forwarded-Clientcert-subjectdn` header is used to retrieve information about the owner of the client certificate. Valid values:</p>
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false**</p>
         * <br>
         * <p>>  This parameter is returned only for HTTPS listeners.</p>
         */
        @NameInMap("XForwardedForClientCertSubjectDNEnabled")
        public Boolean XForwardedForClientCertSubjectDNEnabled;

        /**
         * <p>Indicates whether the `X-Forwarded-Client-Ip` header is used to retrieve the source port of the ALB instance. Valid values:</p>
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false**</p>
         * <br>
         * <p>>  HTTP, HTTPS, and QUIC listeners support this parameter.</p>
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
         * <p>>  This parameter is returned only for HTTP and HTTPS listeners.</p>
         */
        @NameInMap("XForwardedForClientSrcPortEnabled")
        public Boolean XForwardedForClientSrcPortEnabled;

        /**
         * <p>Indicates whether the `X-Forwarded-For` header is used to retrieve the client IP address. Valid values:</p>
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false**</p>
         * <br>
         * <p>>  This parameter is returned only for HTTP and HTTPS listeners.</p>
         */
        @NameInMap("XForwardedForEnabled")
        public Boolean XForwardedForEnabled;

        /**
         * <p>Indicates whether the `X-Forwarded-Proto` header is used to retrieve the listener protocol. Valid values:</p>
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false**</p>
         * <br>
         * <p>>  HTTP, HTTPS, and QUIC listeners support this parameter.</p>
         */
        @NameInMap("XForwardedForProtoEnabled")
        public Boolean XForwardedForProtoEnabled;

        /**
         * <p>Indicates whether the `SLB-ID` header is used to retrieve the ID of the ALB instance. Valid values:</p>
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false**</p>
         * <br>
         * <p>>  HTTP, HTTPS, and QUIC listeners support this parameter.</p>
         */
        @NameInMap("XForwardedForSLBIdEnabled")
        public Boolean XForwardedForSLBIdEnabled;

        /**
         * <p>Indicates whether the `X-Forwarded-Port` header is used to retrieve the listener port of the ALB instance. Valid values:</p>
         * <br>
         * <p>*   **true**</p>
         * <p>*   **false**</p>
         * <br>
         * <p>>  HTTP, HTTPS, and QUIC listeners support this parameter.</p>
         */
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
        /**
         * <p>The default actions in the forwarding rules.</p>
         */
        @NameInMap("DefaultActions")
        public java.util.List<ListListenersResponseBodyListenersDefaultActions> defaultActions;

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
         * <p>>  This parameter is returned only for HTTPS listeners.</p>
         */
        @NameInMap("Http2Enabled")
        public Boolean http2Enabled;

        /**
         * <p>The timeout period of an idle connection. Unit: seconds. Valid values: **1 to 60**.</p>
         * <br>
         * <p>If no request is received within the specified timeout period, ALB closes the connection. ALB re-establishes the connection when a new connection request is received.</p>
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
         * <p>The frontend port that is used by the ALB instance. Valid values: **1 to 65535**.</p>
         */
        @NameInMap("ListenerPort")
        public Integer listenerPort;

        /**
         * <p>The listener protocol. Valid values:</p>
         * <br>
         * <p>*   **HTTP**</p>
         * <p>*   **HTTPS**</p>
         * <p>*   **QUIC**</p>
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
         * <p>The ID of the ALB instance.</p>
         */
        @NameInMap("LoadBalancerId")
        public String loadBalancerId;

        /**
         * <p>The configuration of logs.</p>
         */
        @NameInMap("LogConfig")
        public ListListenersResponseBodyListenersLogConfig logConfig;

        /**
         * <p>The configuration information when the listener is associated with a QUIC listener.</p>
         */
        @NameInMap("QuicConfig")
        public ListListenersResponseBodyListenersQuicConfig quicConfig;

        /**
         * <p>The timeout period of a request. Unit: seconds. Valid values: **1 to 180**.</p>
         * <br>
         * <p>If no responses are received from the backend server within the specified timeout period, ALB returns an `HTTP 504` error code to the client.</p>
         */
        @NameInMap("RequestTimeout")
        public Integer requestTimeout;

        /**
         * <p>The security policy.</p>
         * <br>
         * <p>>  This parameter is returned only for HTTPS listeners.</p>
         */
        @NameInMap("SecurityPolicyId")
        public String securityPolicyId;

        /**
         * <p>The tags.</p>
         */
        @NameInMap("Tags")
        public java.util.List<ListListenersResponseBodyListenersTags> tags;

        /**
         * <p>The configuration of the `XForward` headers.</p>
         */
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

        public ListListenersResponseBodyListeners setTags(java.util.List<ListListenersResponseBodyListenersTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<ListListenersResponseBodyListenersTags> getTags() {
            return this.tags;
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
