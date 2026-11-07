// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.mse20190531.models;

import com.aliyun.tea.*;

public class GetGatewayConfigResponseBody extends TeaModel {
    /**
     * <p>The code used to synchronize with the success field.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Integer code;

    /**
     * <p>The data overview.</p>
     */
    @NameInMap("Data")
    public GetGatewayConfigResponseBodyData data;

    /**
     * <p>This field is not used. Ignore this field.</p>
     * 
     * <strong>example:</strong>
     * <p>code</p>
     */
    @NameInMap("DynamicCode")
    public String dynamicCode;

    /**
     * <p>This field is not used. Ignore this field.</p>
     * 
     * <strong>example:</strong>
     * <p>The specified parameter is invalid.</p>
     */
    @NameInMap("DynamicMessage")
    public String dynamicMessage;

    /**
     * <p>The error code.</p>
     * 
     * <strong>example:</strong>
     * <p>Success</p>
     */
    @NameInMap("ErrorCode")
    public String errorCode;

    /**
     * <p>The HTTP status code.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("HttpStatusCode")
    public Integer httpStatusCode;

    /**
     * <p>The response message.</p>
     * 
     * <strong>example:</strong>
     * <p>OK</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>F6092602-C357-4750-89D9-E572FBEA****</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The request result. Valid values:</p>
     * <ul>
     * <li><code>true</code>: The request is successful.</li>
     * <li><code>false</code>: The request fails.</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Success")
    public Boolean success;

    public static GetGatewayConfigResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetGatewayConfigResponseBody self = new GetGatewayConfigResponseBody();
        return TeaModel.build(map, self);
    }

    public GetGatewayConfigResponseBody setCode(Integer code) {
        this.code = code;
        return this;
    }
    public Integer getCode() {
        return this.code;
    }

    public GetGatewayConfigResponseBody setData(GetGatewayConfigResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetGatewayConfigResponseBodyData getData() {
        return this.data;
    }

    public GetGatewayConfigResponseBody setDynamicCode(String dynamicCode) {
        this.dynamicCode = dynamicCode;
        return this;
    }
    public String getDynamicCode() {
        return this.dynamicCode;
    }

    public GetGatewayConfigResponseBody setDynamicMessage(String dynamicMessage) {
        this.dynamicMessage = dynamicMessage;
        return this;
    }
    public String getDynamicMessage() {
        return this.dynamicMessage;
    }

    public GetGatewayConfigResponseBody setErrorCode(String errorCode) {
        this.errorCode = errorCode;
        return this;
    }
    public String getErrorCode() {
        return this.errorCode;
    }

    public GetGatewayConfigResponseBody setHttpStatusCode(Integer httpStatusCode) {
        this.httpStatusCode = httpStatusCode;
        return this;
    }
    public Integer getHttpStatusCode() {
        return this.httpStatusCode;
    }

    public GetGatewayConfigResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetGatewayConfigResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public GetGatewayConfigResponseBody setSuccess(Boolean success) {
        this.success = success;
        return this;
    }
    public Boolean getSuccess() {
        return this.success;
    }

    public static class GetGatewayConfigResponseBodyDataEnableK8sSourceWorkloadFilter extends TeaModel {
        /**
         * <p>Specifies whether to enable tag filtering for Kubernetes service source workloads.</p>
         */
        @NameInMap("Enable")
        public Boolean enable;

        /**
         * <p>The tag filtering method. Valid values: EQUAL (matches the specified tag) and NOT_EQUAL (excludes the specified tag).</p>
         * 
         * <strong>example:</strong>
         * <p>EQUAL</p>
         */
        @NameInMap("FilterOpt")
        public String filterOpt;

        /**
         * <p>The tag key used to filter Kubernetes workloads.</p>
         * 
         * <strong>example:</strong>
         * <p>key</p>
         */
        @NameInMap("LabelKey")
        public String labelKey;

        /**
         * <p>The tag value used to filter Kubernetes workloads.</p>
         * 
         * <strong>example:</strong>
         * <p>value</p>
         */
        @NameInMap("LabelValue")
        public String labelValue;

        public static GetGatewayConfigResponseBodyDataEnableK8sSourceWorkloadFilter build(java.util.Map<String, ?> map) throws Exception {
            GetGatewayConfigResponseBodyDataEnableK8sSourceWorkloadFilter self = new GetGatewayConfigResponseBodyDataEnableK8sSourceWorkloadFilter();
            return TeaModel.build(map, self);
        }

        public GetGatewayConfigResponseBodyDataEnableK8sSourceWorkloadFilter setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public GetGatewayConfigResponseBodyDataEnableK8sSourceWorkloadFilter setFilterOpt(String filterOpt) {
            this.filterOpt = filterOpt;
            return this;
        }
        public String getFilterOpt() {
            return this.filterOpt;
        }

        public GetGatewayConfigResponseBodyDataEnableK8sSourceWorkloadFilter setLabelKey(String labelKey) {
            this.labelKey = labelKey;
            return this;
        }
        public String getLabelKey() {
            return this.labelKey;
        }

        public GetGatewayConfigResponseBodyDataEnableK8sSourceWorkloadFilter setLabelValue(String labelValue) {
            this.labelValue = labelValue;
            return this;
        }
        public String getLabelValue() {
            return this.labelValue;
        }

    }

    public static class GetGatewayConfigResponseBodyDataEnableXffTrustedCidrs extends TeaModel {
        /**
         * <p>Specifies whether to enable the configuration for trusted X-Forwarded-For source CIDR blocks.</p>
         */
        @NameInMap("Enable")
        public Boolean enable;

        /**
         * <p>The list of trusted source IP addresses or CIDR blocks.</p>
         * 
         * <strong>example:</strong>
         * <p>10.0.0.0/8</p>
         */
        @NameInMap("IpListContent")
        public String ipListContent;

        public static GetGatewayConfigResponseBodyDataEnableXffTrustedCidrs build(java.util.Map<String, ?> map) throws Exception {
            GetGatewayConfigResponseBodyDataEnableXffTrustedCidrs self = new GetGatewayConfigResponseBodyDataEnableXffTrustedCidrs();
            return TeaModel.build(map, self);
        }

        public GetGatewayConfigResponseBodyDataEnableXffTrustedCidrs setEnable(Boolean enable) {
            this.enable = enable;
            return this;
        }
        public Boolean getEnable() {
            return this.enable;
        }

        public GetGatewayConfigResponseBodyDataEnableXffTrustedCidrs setIpListContent(String ipListContent) {
            this.ipListContent = ipListContent;
            return this;
        }
        public String getIpListContent() {
            return this.ipListContent;
        }

    }

    public static class GetGatewayConfigResponseBodyDataSlsConfigDetails extends TeaModel {
        /**
         * <p>The gateway ID.</p>
         * 
         * <strong>example:</strong>
         * <p>500</p>
         */
        @NameInMap("GatewayId")
        public Long gatewayId;

        /**
         * <p>The unique ID of the gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>gw-61f465fa2dd044069e2208c4912*****</p>
         */
        @NameInMap("GatewayUniqueId")
        public String gatewayUniqueId;

        /**
         * <p>Not available for use.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>Not available for use.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>Not available for use.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>Specifies whether log delivery is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("LogOn")
        public Boolean logOn;

        /**
         * <p>The destination Logstore for log delivery. Valid values:</p>
         * <ul>
         * <li><p>mse_gw_access_log: Nginx Ingress compatibility is disabled.</p>
         * </li>
         * <li><p>nginx-ingress: Nginx Ingress compatibility is enabled.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>mse_gw_access_log</p>
         */
        @NameInMap("LogStoreName")
        public String logStoreName;

        /**
         * <p>Specifies whether Nginx Ingress compatibility is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("NginxCompatible")
        public Boolean nginxCompatible;

        /**
         * <p>The destination Simple Log Service project for log delivery.</p>
         * 
         * <strong>example:</strong>
         * <p>test</p>
         */
        @NameInMap("ProjectName")
        public String projectName;

        public static GetGatewayConfigResponseBodyDataSlsConfigDetails build(java.util.Map<String, ?> map) throws Exception {
            GetGatewayConfigResponseBodyDataSlsConfigDetails self = new GetGatewayConfigResponseBodyDataSlsConfigDetails();
            return TeaModel.build(map, self);
        }

        public GetGatewayConfigResponseBodyDataSlsConfigDetails setGatewayId(Long gatewayId) {
            this.gatewayId = gatewayId;
            return this;
        }
        public Long getGatewayId() {
            return this.gatewayId;
        }

        public GetGatewayConfigResponseBodyDataSlsConfigDetails setGatewayUniqueId(String gatewayUniqueId) {
            this.gatewayUniqueId = gatewayUniqueId;
            return this;
        }
        public String getGatewayUniqueId() {
            return this.gatewayUniqueId;
        }

        public GetGatewayConfigResponseBodyDataSlsConfigDetails setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetGatewayConfigResponseBodyDataSlsConfigDetails setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetGatewayConfigResponseBodyDataSlsConfigDetails setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetGatewayConfigResponseBodyDataSlsConfigDetails setLogOn(Boolean logOn) {
            this.logOn = logOn;
            return this;
        }
        public Boolean getLogOn() {
            return this.logOn;
        }

        public GetGatewayConfigResponseBodyDataSlsConfigDetails setLogStoreName(String logStoreName) {
            this.logStoreName = logStoreName;
            return this;
        }
        public String getLogStoreName() {
            return this.logStoreName;
        }

        public GetGatewayConfigResponseBodyDataSlsConfigDetails setNginxCompatible(Boolean nginxCompatible) {
            this.nginxCompatible = nginxCompatible;
            return this;
        }
        public Boolean getNginxCompatible() {
            return this.nginxCompatible;
        }

        public GetGatewayConfigResponseBodyDataSlsConfigDetails setProjectName(String projectName) {
            this.projectName = projectName;
            return this;
        }
        public String getProjectName() {
            return this.projectName;
        }

    }

    public static class GetGatewayConfigResponseBodyDataXtraceDetails extends TeaModel {
        /**
         * <p>The gateway ID.</p>
         * 
         * <strong>example:</strong>
         * <p>500</p>
         */
        @NameInMap("GatewayId")
        public Long gatewayId;

        /**
         * <p>The unique ID of the gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>gw-61f465fa2dd044069e2208c4912*****</p>
         */
        @NameInMap("GatewayUniqueId")
        public String gatewayUniqueId;

        /**
         * <p>The time when the Tracing Analysis information was created.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-08-12T09:39:07.000+0000</p>
         */
        @NameInMap("GmtCreate")
        public String gmtCreate;

        /**
         * <p>The time when the Tracing Analysis information was modified.</p>
         * 
         * <strong>example:</strong>
         * <p>2024-08-12T09:39:07.000+0000</p>
         */
        @NameInMap("GmtModified")
        public String gmtModified;

        /**
         * <p>The ID of the Tracing Analysis information.</p>
         * 
         * <strong>example:</strong>
         * <p>255</p>
         */
        @NameInMap("Id")
        public Long id;

        /**
         * <p>The sampling rate (%).</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Sample")
        public Integer sample;

        /**
         * <p>The SkyWalking service ID for self-managed SkyWalking.</p>
         * 
         * <strong>example:</strong>
         * <p>333</p>
         */
        @NameInMap("ServiceId")
        public Long serviceId;

        /**
         * <p>The SkyWalking service port for self-managed SkyWalking.</p>
         * 
         * <strong>example:</strong>
         * <p>8888</p>
         */
        @NameInMap("ServicePort")
        public String servicePort;

        /**
         * <p>Specifies whether Tracing Analysis is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("TraceOn")
        public Boolean traceOn;

        /**
         * <p>The Tracing Analysis type. Valid values:</p>
         * <ul>
         * <li><p>XTRACE: Managed Service for OpenTelemetry with the Zipkin Tracing Analysis protocol.</p>
         * </li>
         * <li><p>SKYWALKING: Self-managed SkyWalking.</p>
         * </li>
         * <li><p>OPENTELEMETRY: Managed Service for OpenTelemetry with the OpenTelemetry Tracing Analysis protocol.</p>
         * </li>
         * <li><p>OTSKYWALKING: Managed Service for OpenTelemetry with the SkyWalking Tracing Analysis protocol.</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>OPENTELEMETRY</p>
         */
        @NameInMap("TraceType")
        public String traceType;

        public static GetGatewayConfigResponseBodyDataXtraceDetails build(java.util.Map<String, ?> map) throws Exception {
            GetGatewayConfigResponseBodyDataXtraceDetails self = new GetGatewayConfigResponseBodyDataXtraceDetails();
            return TeaModel.build(map, self);
        }

        public GetGatewayConfigResponseBodyDataXtraceDetails setGatewayId(Long gatewayId) {
            this.gatewayId = gatewayId;
            return this;
        }
        public Long getGatewayId() {
            return this.gatewayId;
        }

        public GetGatewayConfigResponseBodyDataXtraceDetails setGatewayUniqueId(String gatewayUniqueId) {
            this.gatewayUniqueId = gatewayUniqueId;
            return this;
        }
        public String getGatewayUniqueId() {
            return this.gatewayUniqueId;
        }

        public GetGatewayConfigResponseBodyDataXtraceDetails setGmtCreate(String gmtCreate) {
            this.gmtCreate = gmtCreate;
            return this;
        }
        public String getGmtCreate() {
            return this.gmtCreate;
        }

        public GetGatewayConfigResponseBodyDataXtraceDetails setGmtModified(String gmtModified) {
            this.gmtModified = gmtModified;
            return this;
        }
        public String getGmtModified() {
            return this.gmtModified;
        }

        public GetGatewayConfigResponseBodyDataXtraceDetails setId(Long id) {
            this.id = id;
            return this;
        }
        public Long getId() {
            return this.id;
        }

        public GetGatewayConfigResponseBodyDataXtraceDetails setSample(Integer sample) {
            this.sample = sample;
            return this;
        }
        public Integer getSample() {
            return this.sample;
        }

        public GetGatewayConfigResponseBodyDataXtraceDetails setServiceId(Long serviceId) {
            this.serviceId = serviceId;
            return this;
        }
        public Long getServiceId() {
            return this.serviceId;
        }

        public GetGatewayConfigResponseBodyDataXtraceDetails setServicePort(String servicePort) {
            this.servicePort = servicePort;
            return this;
        }
        public String getServicePort() {
            return this.servicePort;
        }

        public GetGatewayConfigResponseBodyDataXtraceDetails setTraceOn(Boolean traceOn) {
            this.traceOn = traceOn;
            return this;
        }
        public Boolean getTraceOn() {
            return this.traceOn;
        }

        public GetGatewayConfigResponseBodyDataXtraceDetails setTraceType(String traceType) {
            this.traceType = traceType;
            return this;
        }
        public String getTraceType() {
            return this.traceType;
        }

    }

    public static class GetGatewayConfigResponseBodyData extends TeaModel {
        /**
         * <p>The custom log format.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;requestMetadata&quot;:[],&quot;responseHeaders&quot;:[],&quot;requestHeaders&quot;:[&quot;x-test&quot;],&quot;responseMetadata&quot;:[]}</p>
         */
        @NameInMap("AccessLogHeader")
        public String accessLogHeader;

        /**
         * <p>The buffer size for a single gateway connection. Configuring this parameter affects throughput and gateway memory usage. Unit: bytes.</p>
         * 
         * <strong>example:</strong>
         * <p>32768</p>
         */
        @NameInMap("DownstreamConnectionBufferLimits")
        public Integer downstreamConnectionBufferLimits;

        /**
         * <p>The maximum number of concurrent streams on a single connection when the client uses HTTP/2. This parameter takes effect at the request level.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("DownstreamHttp2MaxConcurrentStream")
        public Integer downstreamHttp2MaxConcurrentStream;

        /**
         * <p>The idle timeout period for connections from the client to the gateway. Unit: seconds. If no request is received within the specified period, the gateway disconnects the connection. Valid values: 0 to 600.</p>
         * 
         * <strong>example:</strong>
         * <p>180</p>
         */
        @NameInMap("DownstreamIdleTime")
        public Integer downstreamIdleTime;

        /**
         * <p>Specifies whether to enable custom authentication configuration push for self-managed authentication services. When enabled, changes to authentication rules do not cause connection interruptions. This feature is applicable to WebSocket and online business scenarios.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("EnableCustomAuthConfigPush")
        public String enableCustomAuthConfigPush;

        /**
         * <p>Specifies whether to generate a request ID in the request header for request tracking. This parameter takes effect at the request level.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableGenerateRequestId")
        public Boolean enableGenerateRequestId;

        /**
         * <p>Specifies whether to enable Gzip compression for requests and responses. Enabling this feature reduces gateway traffic but increases gateway CPU consumption.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("EnableGzip")
        public Boolean enableGzip;

        /**
         * <p>Specifies whether to enable Gzip hardware acceleration.</p>
         */
        @NameInMap("EnableGzipHardwareAccelerate")
        public Boolean enableGzipHardwareAccelerate;

        /**
         * <p>Specifies whether to enable hardware acceleration. This configuration fails if the region does not support hardware acceleration at the underlying layer or if hardware acceleration was not specified during purchase.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableHardwareAccelerate")
        public Boolean enableHardwareAccelerate;

        /**
         * <p>Specifies whether to use HTTP/2 during negotiation between the server and the client. This parameter takes effect at the request level. Changes take effect after 1 to 2 minutes.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("EnableHttp2")
        public Boolean enableHttp2;

        /**
         * <p>Specifies whether the HTTP/3 protocol is supported.</p>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("EnableHttp3")
        public Boolean enableHttp3;

        /**
         * <p>The tag filtering configuration for Kubernetes service source workloads.</p>
         */
        @NameInMap("EnableK8sSourceWorkloadFilter")
        public GetGatewayConfigResponseBodyDataEnableK8sSourceWorkloadFilter enableK8sSourceWorkloadFilter;

        /**
         * <p>Specifies whether to enable the PROXY protocol. If the gateway ingress traffic is routed through a Network Load Balancer (NLB) and this feature is disabled, the real IP address of the client cannot be obtained. Enabling this feature does not affect non-PROXY protocol requests.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableProxyProtocol")
        public Boolean enableProxyProtocol;

        /**
         * <p>Specifies whether to merge consecutive slashes in a request URL. For example, if this feature is enabled, the extra slash in <code>www.a.com//b</code> is merged, making it equivalent to <code>www.a.com/b</code>. This parameter takes effect at the request level.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableSlashMerge")
        public Boolean enableSlashMerge;

        /**
         * <p>Specifies whether WAF is enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("EnableWaf")
        public Boolean enableWaf;

        /**
         * <p>The configuration for trusted X-Forwarded-For source CIDR blocks.</p>
         */
        @NameInMap("EnableXffTrustedCidrs")
        public GetGatewayConfigResponseBodyDataEnableXffTrustedCidrs enableXffTrustedCidrs;

        /**
         * <p>The unique ID of the gateway.</p>
         * 
         * <strong>example:</strong>
         * <p>gw-61f465fa2dd044069e2208c4912*****</p>
         */
        @NameInMap("GatewayUniqueId")
        public String gatewayUniqueId;

        /**
         * <p>The initial connection-level window size negotiated between the gateway and the client when HTTP/2 is used. Unit: bytes. This parameter takes effect at the request level.</p>
         * 
         * <strong>example:</strong>
         * <p>1048576</p>
         */
        @NameInMap("InitialConnectionWindowSize")
        public Integer initialConnectionWindowSize;

        /**
         * <p>The initial stream window size negotiated between the gateway and the client when HTTP/2 is used. Unit: bytes. This parameter takes effect at the request level.</p>
         * 
         * <strong>example:</strong>
         * <p>65535</p>
         */
        @NameInMap("InitialStreamWindowSize")
        public Integer initialStreamWindowSize;

        /**
         * <p>The keep-alive time in the Keep-Alive response header. Unit: seconds. If this parameter is set to 0, the response header is not returned.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("KeepaliveHeaderTimeout")
        public Integer keepaliveHeaderTimeout;

        /**
         * <p>Indicates whether lightweight metric collection is enabled.</p>
         */
        @NameInMap("LiteMetrics")
        public Boolean liteMetrics;

        /**
         * <p>Not available for use.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;&quot;</p>
         */
        @NameInMap("LogFilterConfig")
        public String logFilterConfig;

        /**
         * <p>The log collection configuration for request and response headers and bodies. The content is a JSON string.</p>
         * 
         * <strong>example:</strong>
         * <p>{&quot;request&quot;:{&quot;headers&quot;:{&quot;enabled&quot;:true}}}</p>
         */
        @NameInMap("LogRequestResponseConfig")
        public String logRequestResponseConfig;

        /**
         * <p>The list of unsupported configurations.</p>
         * 
         * <strong>example:</strong>
         * <p>&quot;EnableProxyProtocol,EnableCustomAuthConfigPush&quot;</p>
         */
        @NameInMap("NoSupportedConfigList")
        public String noSupportedConfigList;

        /**
         * <p>The action to take when a URI path contains escaped slashes such as %2F, %2f, %5C, or %5c. Default value: KEEP_UNCHANGED. Valid values:</p>
         * <ul>
         * <li><p>KEEP_UNCHANGED</p>
         * </li>
         * <li><p>REJECT_REQUEST</p>
         * </li>
         * <li><p>UNESCAPE_AND_REDIRECT</p>
         * </li>
         * <li><p>UNESCAPE_AND_FORWARD</p>
         * </li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>KEEP_UNCHANGED</p>
         */
        @NameInMap("PathWithEscapedSlashes")
        public String pathWithEscapedSlashes;

        /**
         * <p>Specifies whether to preserve the request ID passed by the client.</p>
         */
        @NameInMap("PreserveExternalRequestID")
        public Boolean preserveExternalRequestID;

        /**
         * <p>Specifies whether to preserve the original case of request and response headers. In HTTP/1.1, headers are case-insensitive. To ensure compatibility with HTTP/2, headers are converted to lowercase by default.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("PreserveHeaderFormat")
        public Boolean preserveHeaderFormat;

        /**
         * <p>The log delivery information.</p>
         */
        @NameInMap("SlsConfigDetails")
        public GetGatewayConfigResponseBodyDataSlsConfigDetails slsConfigDetails;

        /**
         * <p>Indicates whether the gateway supports Web Application Firewall (WAF).</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("SupportWaf")
        public Boolean supportWaf;

        /**
         * <p>The default idle timeout period for upstream connections.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("UpstreamIdleTimeout")
        public Integer upstreamIdleTimeout;

        /**
         * <p>The keep-alive time maintained for WebSocket connections when connections must be closed during gateway instance upgrades or restarts. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("WebsocketTermGracePeriod")
        public Integer websocketTermGracePeriod;

        /**
         * <p>The number of trusted proxies in front of the gateway. This parameter affects whether the gateway uses request headers such as X-Forwarded-For and X-Request-ID generated by the client. This parameter takes effect at the request level.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("XffTrustedNum")
        public Integer xffTrustedNum;

        /**
         * <p>The Tracing Analysis information.</p>
         */
        @NameInMap("XtraceDetails")
        public GetGatewayConfigResponseBodyDataXtraceDetails xtraceDetails;

        /**
         * <p>The compression algorithm used when compression is enabled. Valid values: brotli and gzip. If this parameter is set and EnableGzip is disabled, EnableGzip is automatically enabled.</p>
         * 
         * <strong>example:</strong>
         * <p>[&quot;gzip&quot;]</p>
         */
        @NameInMap("ZipAlgorithm")
        public String zipAlgorithm;

        public static GetGatewayConfigResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetGatewayConfigResponseBodyData self = new GetGatewayConfigResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetGatewayConfigResponseBodyData setAccessLogHeader(String accessLogHeader) {
            this.accessLogHeader = accessLogHeader;
            return this;
        }
        public String getAccessLogHeader() {
            return this.accessLogHeader;
        }

        public GetGatewayConfigResponseBodyData setDownstreamConnectionBufferLimits(Integer downstreamConnectionBufferLimits) {
            this.downstreamConnectionBufferLimits = downstreamConnectionBufferLimits;
            return this;
        }
        public Integer getDownstreamConnectionBufferLimits() {
            return this.downstreamConnectionBufferLimits;
        }

        public GetGatewayConfigResponseBodyData setDownstreamHttp2MaxConcurrentStream(Integer downstreamHttp2MaxConcurrentStream) {
            this.downstreamHttp2MaxConcurrentStream = downstreamHttp2MaxConcurrentStream;
            return this;
        }
        public Integer getDownstreamHttp2MaxConcurrentStream() {
            return this.downstreamHttp2MaxConcurrentStream;
        }

        public GetGatewayConfigResponseBodyData setDownstreamIdleTime(Integer downstreamIdleTime) {
            this.downstreamIdleTime = downstreamIdleTime;
            return this;
        }
        public Integer getDownstreamIdleTime() {
            return this.downstreamIdleTime;
        }

        public GetGatewayConfigResponseBodyData setEnableCustomAuthConfigPush(String enableCustomAuthConfigPush) {
            this.enableCustomAuthConfigPush = enableCustomAuthConfigPush;
            return this;
        }
        public String getEnableCustomAuthConfigPush() {
            return this.enableCustomAuthConfigPush;
        }

        public GetGatewayConfigResponseBodyData setEnableGenerateRequestId(Boolean enableGenerateRequestId) {
            this.enableGenerateRequestId = enableGenerateRequestId;
            return this;
        }
        public Boolean getEnableGenerateRequestId() {
            return this.enableGenerateRequestId;
        }

        public GetGatewayConfigResponseBodyData setEnableGzip(Boolean enableGzip) {
            this.enableGzip = enableGzip;
            return this;
        }
        public Boolean getEnableGzip() {
            return this.enableGzip;
        }

        public GetGatewayConfigResponseBodyData setEnableGzipHardwareAccelerate(Boolean enableGzipHardwareAccelerate) {
            this.enableGzipHardwareAccelerate = enableGzipHardwareAccelerate;
            return this;
        }
        public Boolean getEnableGzipHardwareAccelerate() {
            return this.enableGzipHardwareAccelerate;
        }

        public GetGatewayConfigResponseBodyData setEnableHardwareAccelerate(Boolean enableHardwareAccelerate) {
            this.enableHardwareAccelerate = enableHardwareAccelerate;
            return this;
        }
        public Boolean getEnableHardwareAccelerate() {
            return this.enableHardwareAccelerate;
        }

        public GetGatewayConfigResponseBodyData setEnableHttp2(Boolean enableHttp2) {
            this.enableHttp2 = enableHttp2;
            return this;
        }
        public Boolean getEnableHttp2() {
            return this.enableHttp2;
        }

        public GetGatewayConfigResponseBodyData setEnableHttp3(Boolean enableHttp3) {
            this.enableHttp3 = enableHttp3;
            return this;
        }
        public Boolean getEnableHttp3() {
            return this.enableHttp3;
        }

        public GetGatewayConfigResponseBodyData setEnableK8sSourceWorkloadFilter(GetGatewayConfigResponseBodyDataEnableK8sSourceWorkloadFilter enableK8sSourceWorkloadFilter) {
            this.enableK8sSourceWorkloadFilter = enableK8sSourceWorkloadFilter;
            return this;
        }
        public GetGatewayConfigResponseBodyDataEnableK8sSourceWorkloadFilter getEnableK8sSourceWorkloadFilter() {
            return this.enableK8sSourceWorkloadFilter;
        }

        public GetGatewayConfigResponseBodyData setEnableProxyProtocol(Boolean enableProxyProtocol) {
            this.enableProxyProtocol = enableProxyProtocol;
            return this;
        }
        public Boolean getEnableProxyProtocol() {
            return this.enableProxyProtocol;
        }

        public GetGatewayConfigResponseBodyData setEnableSlashMerge(Boolean enableSlashMerge) {
            this.enableSlashMerge = enableSlashMerge;
            return this;
        }
        public Boolean getEnableSlashMerge() {
            return this.enableSlashMerge;
        }

        public GetGatewayConfigResponseBodyData setEnableWaf(Boolean enableWaf) {
            this.enableWaf = enableWaf;
            return this;
        }
        public Boolean getEnableWaf() {
            return this.enableWaf;
        }

        public GetGatewayConfigResponseBodyData setEnableXffTrustedCidrs(GetGatewayConfigResponseBodyDataEnableXffTrustedCidrs enableXffTrustedCidrs) {
            this.enableXffTrustedCidrs = enableXffTrustedCidrs;
            return this;
        }
        public GetGatewayConfigResponseBodyDataEnableXffTrustedCidrs getEnableXffTrustedCidrs() {
            return this.enableXffTrustedCidrs;
        }

        public GetGatewayConfigResponseBodyData setGatewayUniqueId(String gatewayUniqueId) {
            this.gatewayUniqueId = gatewayUniqueId;
            return this;
        }
        public String getGatewayUniqueId() {
            return this.gatewayUniqueId;
        }

        public GetGatewayConfigResponseBodyData setInitialConnectionWindowSize(Integer initialConnectionWindowSize) {
            this.initialConnectionWindowSize = initialConnectionWindowSize;
            return this;
        }
        public Integer getInitialConnectionWindowSize() {
            return this.initialConnectionWindowSize;
        }

        public GetGatewayConfigResponseBodyData setInitialStreamWindowSize(Integer initialStreamWindowSize) {
            this.initialStreamWindowSize = initialStreamWindowSize;
            return this;
        }
        public Integer getInitialStreamWindowSize() {
            return this.initialStreamWindowSize;
        }

        public GetGatewayConfigResponseBodyData setKeepaliveHeaderTimeout(Integer keepaliveHeaderTimeout) {
            this.keepaliveHeaderTimeout = keepaliveHeaderTimeout;
            return this;
        }
        public Integer getKeepaliveHeaderTimeout() {
            return this.keepaliveHeaderTimeout;
        }

        public GetGatewayConfigResponseBodyData setLiteMetrics(Boolean liteMetrics) {
            this.liteMetrics = liteMetrics;
            return this;
        }
        public Boolean getLiteMetrics() {
            return this.liteMetrics;
        }

        public GetGatewayConfigResponseBodyData setLogFilterConfig(String logFilterConfig) {
            this.logFilterConfig = logFilterConfig;
            return this;
        }
        public String getLogFilterConfig() {
            return this.logFilterConfig;
        }

        public GetGatewayConfigResponseBodyData setLogRequestResponseConfig(String logRequestResponseConfig) {
            this.logRequestResponseConfig = logRequestResponseConfig;
            return this;
        }
        public String getLogRequestResponseConfig() {
            return this.logRequestResponseConfig;
        }

        public GetGatewayConfigResponseBodyData setNoSupportedConfigList(String noSupportedConfigList) {
            this.noSupportedConfigList = noSupportedConfigList;
            return this;
        }
        public String getNoSupportedConfigList() {
            return this.noSupportedConfigList;
        }

        public GetGatewayConfigResponseBodyData setPathWithEscapedSlashes(String pathWithEscapedSlashes) {
            this.pathWithEscapedSlashes = pathWithEscapedSlashes;
            return this;
        }
        public String getPathWithEscapedSlashes() {
            return this.pathWithEscapedSlashes;
        }

        public GetGatewayConfigResponseBodyData setPreserveExternalRequestID(Boolean preserveExternalRequestID) {
            this.preserveExternalRequestID = preserveExternalRequestID;
            return this;
        }
        public Boolean getPreserveExternalRequestID() {
            return this.preserveExternalRequestID;
        }

        public GetGatewayConfigResponseBodyData setPreserveHeaderFormat(Boolean preserveHeaderFormat) {
            this.preserveHeaderFormat = preserveHeaderFormat;
            return this;
        }
        public Boolean getPreserveHeaderFormat() {
            return this.preserveHeaderFormat;
        }

        public GetGatewayConfigResponseBodyData setSlsConfigDetails(GetGatewayConfigResponseBodyDataSlsConfigDetails slsConfigDetails) {
            this.slsConfigDetails = slsConfigDetails;
            return this;
        }
        public GetGatewayConfigResponseBodyDataSlsConfigDetails getSlsConfigDetails() {
            return this.slsConfigDetails;
        }

        public GetGatewayConfigResponseBodyData setSupportWaf(Boolean supportWaf) {
            this.supportWaf = supportWaf;
            return this;
        }
        public Boolean getSupportWaf() {
            return this.supportWaf;
        }

        public GetGatewayConfigResponseBodyData setUpstreamIdleTimeout(Integer upstreamIdleTimeout) {
            this.upstreamIdleTimeout = upstreamIdleTimeout;
            return this;
        }
        public Integer getUpstreamIdleTimeout() {
            return this.upstreamIdleTimeout;
        }

        public GetGatewayConfigResponseBodyData setWebsocketTermGracePeriod(Integer websocketTermGracePeriod) {
            this.websocketTermGracePeriod = websocketTermGracePeriod;
            return this;
        }
        public Integer getWebsocketTermGracePeriod() {
            return this.websocketTermGracePeriod;
        }

        public GetGatewayConfigResponseBodyData setXffTrustedNum(Integer xffTrustedNum) {
            this.xffTrustedNum = xffTrustedNum;
            return this;
        }
        public Integer getXffTrustedNum() {
            return this.xffTrustedNum;
        }

        public GetGatewayConfigResponseBodyData setXtraceDetails(GetGatewayConfigResponseBodyDataXtraceDetails xtraceDetails) {
            this.xtraceDetails = xtraceDetails;
            return this;
        }
        public GetGatewayConfigResponseBodyDataXtraceDetails getXtraceDetails() {
            return this.xtraceDetails;
        }

        public GetGatewayConfigResponseBodyData setZipAlgorithm(String zipAlgorithm) {
            this.zipAlgorithm = zipAlgorithm;
            return this;
        }
        public String getZipAlgorithm() {
            return this.zipAlgorithm;
        }

    }

}
