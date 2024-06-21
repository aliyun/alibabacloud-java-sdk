// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetTimingSyntheticTaskResponseBody extends TeaModel {
    /**
     * <p>The status code returned. The status code 200 indicates that the request was successful.</p>
     * 
     * <strong>example:</strong>
     * <p>200</p>
     */
    @NameInMap("Code")
    public Long code;

    /**
     * <p>The struct returned.</p>
     */
    @NameInMap("Data")
    public GetTimingSyntheticTaskResponseBodyData data;

    /**
     * <p>The message returned.</p>
     * 
     * <strong>example:</strong>
     * <p>success</p>
     */
    @NameInMap("Message")
    public String message;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>E13430A6-57A9-56E9-9D8D-28FE8DEBCA40</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    public static GetTimingSyntheticTaskResponseBody build(java.util.Map<String, ?> map) throws Exception {
        GetTimingSyntheticTaskResponseBody self = new GetTimingSyntheticTaskResponseBody();
        return TeaModel.build(map, self);
    }

    public GetTimingSyntheticTaskResponseBody setCode(Long code) {
        this.code = code;
        return this;
    }
    public Long getCode() {
        return this.code;
    }

    public GetTimingSyntheticTaskResponseBody setData(GetTimingSyntheticTaskResponseBodyData data) {
        this.data = data;
        return this;
    }
    public GetTimingSyntheticTaskResponseBodyData getData() {
        return this.data;
    }

    public GetTimingSyntheticTaskResponseBody setMessage(String message) {
        this.message = message;
        return this;
    }
    public String getMessage() {
        return this.message;
    }

    public GetTimingSyntheticTaskResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public static class GetTimingSyntheticTaskResponseBodyDataAvailableAssertions extends TeaModel {
        /**
         * <p>The expected value.</p>
         * 
         * <strong>example:</strong>
         * <p>100</p>
         */
        @NameInMap("Expect")
        public String expect;

        /**
         * <p>The condition. gt: greater than. gte: greater than or equal to. lt: less than. lte: less than or equal to. eq: equal to. neq: not equal to. ctn: contain. nctn: does not contain. exist: exist. n_exist: does not exist. belong: belong to. n_belong: does not belong to. reg_match: regular expression.</p>
         * 
         * <strong>example:</strong>
         * <p>gt</p>
         */
        @NameInMap("Operator")
        public String operator;

        /**
         * <p>The check target. If you set the type parameter to HttpResCode, HttpResBody, or HttpResponseTime, you do not need to set the target parameter. If you set the type parameter to HttpResHead, you must specify the key in the header. If you set the type parameter to HttpResBodyJson, use jsonPath.</p>
         * 
         * <strong>example:</strong>
         * <p>key</p>
         */
        @NameInMap("Target")
        public String target;

        /**
         * <p>The assertion type. Valid values: HttpResCode, HttpResHead, HttpResBody, HttpResBodyJson, HttpResponseTime, IcmpPackLoss (packet loss rate), IcmpPackMaxLatency (maximum packet latency), IcmpPackAvgLatency (average packet latency), TraceRouteHops (number of hops), DnsARecord (A record), DnsCName (CNAME), websiteTTFB (time to first packet), websiteTTLB (time to last packet), websiteFST (first paint time), websiteFFST (first meaningful paint), websiteOnload (full loaded time). For more information, see the following description.</p>
         * 
         * <strong>example:</strong>
         * <p>websiteTTLB</p>
         */
        @NameInMap("Type")
        public String type;

        public static GetTimingSyntheticTaskResponseBodyDataAvailableAssertions build(java.util.Map<String, ?> map) throws Exception {
            GetTimingSyntheticTaskResponseBodyDataAvailableAssertions self = new GetTimingSyntheticTaskResponseBodyDataAvailableAssertions();
            return TeaModel.build(map, self);
        }

        public GetTimingSyntheticTaskResponseBodyDataAvailableAssertions setExpect(String expect) {
            this.expect = expect;
            return this;
        }
        public String getExpect() {
            return this.expect;
        }

        public GetTimingSyntheticTaskResponseBodyDataAvailableAssertions setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public GetTimingSyntheticTaskResponseBodyDataAvailableAssertions setTarget(String target) {
            this.target = target;
            return this;
        }
        public String getTarget() {
            return this.target;
        }

        public GetTimingSyntheticTaskResponseBodyDataAvailableAssertions setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetTimingSyntheticTaskResponseBodyDataCommonSettingCustomHostHosts extends TeaModel {
        /**
         * <p>The domain name.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.aliyun.com">www.aliyun.com</a></p>
         */
        @NameInMap("Domain")
        public String domain;

        /**
         * <p>The IP version. Valid values:</p>
         * <ul>
         * <li>0: A version is automatically selected.</li>
         * <li>1: IPv4</li>
         * <li>2: IPv6</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("IpType")
        public Integer ipType;

        /**
         * <p>The list of IP addresses.</p>
         */
        @NameInMap("Ips")
        public java.util.List<String> ips;

        public static GetTimingSyntheticTaskResponseBodyDataCommonSettingCustomHostHosts build(java.util.Map<String, ?> map) throws Exception {
            GetTimingSyntheticTaskResponseBodyDataCommonSettingCustomHostHosts self = new GetTimingSyntheticTaskResponseBodyDataCommonSettingCustomHostHosts();
            return TeaModel.build(map, self);
        }

        public GetTimingSyntheticTaskResponseBodyDataCommonSettingCustomHostHosts setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public GetTimingSyntheticTaskResponseBodyDataCommonSettingCustomHostHosts setIpType(Integer ipType) {
            this.ipType = ipType;
            return this;
        }
        public Integer getIpType() {
            return this.ipType;
        }

        public GetTimingSyntheticTaskResponseBodyDataCommonSettingCustomHostHosts setIps(java.util.List<String> ips) {
            this.ips = ips;
            return this;
        }
        public java.util.List<String> getIps() {
            return this.ips;
        }

    }

    public static class GetTimingSyntheticTaskResponseBodyDataCommonSettingCustomHost extends TeaModel {
        /**
         * <p>The list of hosts.</p>
         */
        @NameInMap("Hosts")
        public java.util.List<GetTimingSyntheticTaskResponseBodyDataCommonSettingCustomHostHosts> hosts;

        /**
         * <p>The selection mode. 0: Random. 1: Polling.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("SelectType")
        public Integer selectType;

        public static GetTimingSyntheticTaskResponseBodyDataCommonSettingCustomHost build(java.util.Map<String, ?> map) throws Exception {
            GetTimingSyntheticTaskResponseBodyDataCommonSettingCustomHost self = new GetTimingSyntheticTaskResponseBodyDataCommonSettingCustomHost();
            return TeaModel.build(map, self);
        }

        public GetTimingSyntheticTaskResponseBodyDataCommonSettingCustomHost setHosts(java.util.List<GetTimingSyntheticTaskResponseBodyDataCommonSettingCustomHostHosts> hosts) {
            this.hosts = hosts;
            return this;
        }
        public java.util.List<GetTimingSyntheticTaskResponseBodyDataCommonSettingCustomHostHosts> getHosts() {
            return this.hosts;
        }

        public GetTimingSyntheticTaskResponseBodyDataCommonSettingCustomHost setSelectType(Integer selectType) {
            this.selectType = selectType;
            return this;
        }
        public Integer getSelectType() {
            return this.selectType;
        }

    }

    public static class GetTimingSyntheticTaskResponseBodyDataCommonSettingCustomPrometheusSetting extends TeaModel {
        @NameInMap("PrometheusClusterId")
        public String prometheusClusterId;

        @NameInMap("PrometheusClusterRegion")
        public String prometheusClusterRegion;

        @NameInMap("PrometheusLabels")
        public java.util.Map<String, String> prometheusLabels;

        public static GetTimingSyntheticTaskResponseBodyDataCommonSettingCustomPrometheusSetting build(java.util.Map<String, ?> map) throws Exception {
            GetTimingSyntheticTaskResponseBodyDataCommonSettingCustomPrometheusSetting self = new GetTimingSyntheticTaskResponseBodyDataCommonSettingCustomPrometheusSetting();
            return TeaModel.build(map, self);
        }

        public GetTimingSyntheticTaskResponseBodyDataCommonSettingCustomPrometheusSetting setPrometheusClusterId(String prometheusClusterId) {
            this.prometheusClusterId = prometheusClusterId;
            return this;
        }
        public String getPrometheusClusterId() {
            return this.prometheusClusterId;
        }

        public GetTimingSyntheticTaskResponseBodyDataCommonSettingCustomPrometheusSetting setPrometheusClusterRegion(String prometheusClusterRegion) {
            this.prometheusClusterRegion = prometheusClusterRegion;
            return this;
        }
        public String getPrometheusClusterRegion() {
            return this.prometheusClusterRegion;
        }

        public GetTimingSyntheticTaskResponseBodyDataCommonSettingCustomPrometheusSetting setPrometheusLabels(java.util.Map<String, String> prometheusLabels) {
            this.prometheusLabels = prometheusLabels;
            return this;
        }
        public java.util.Map<String, String> getPrometheusLabels() {
            return this.prometheusLabels;
        }

    }

    public static class GetTimingSyntheticTaskResponseBodyDataCommonSettingCustomVPCSetting extends TeaModel {
        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("SecureGroupId")
        public String secureGroupId;

        @NameInMap("VSwitchId")
        public String vSwitchId;

        @NameInMap("VpcId")
        public String vpcId;

        public static GetTimingSyntheticTaskResponseBodyDataCommonSettingCustomVPCSetting build(java.util.Map<String, ?> map) throws Exception {
            GetTimingSyntheticTaskResponseBodyDataCommonSettingCustomVPCSetting self = new GetTimingSyntheticTaskResponseBodyDataCommonSettingCustomVPCSetting();
            return TeaModel.build(map, self);
        }

        public GetTimingSyntheticTaskResponseBodyDataCommonSettingCustomVPCSetting setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetTimingSyntheticTaskResponseBodyDataCommonSettingCustomVPCSetting setSecureGroupId(String secureGroupId) {
            this.secureGroupId = secureGroupId;
            return this;
        }
        public String getSecureGroupId() {
            return this.secureGroupId;
        }

        public GetTimingSyntheticTaskResponseBodyDataCommonSettingCustomVPCSetting setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public GetTimingSyntheticTaskResponseBodyDataCommonSettingCustomVPCSetting setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

    public static class GetTimingSyntheticTaskResponseBodyDataCommonSetting extends TeaModel {
        /**
         * <p>The custom host.</p>
         */
        @NameInMap("CustomHost")
        public GetTimingSyntheticTaskResponseBodyDataCommonSettingCustomHost customHost;

        @NameInMap("CustomPrometheusSetting")
        public GetTimingSyntheticTaskResponseBodyDataCommonSettingCustomPrometheusSetting customPrometheusSetting;

        @NameInMap("CustomVPCSetting")
        public GetTimingSyntheticTaskResponseBodyDataCommonSettingCustomVPCSetting customVPCSetting;

        /**
         * <p>The IP version. Valid values:</p>
         * <ul>
         * <li>0: A version is automatically selected.</li>
         * <li>1: IPv4</li>
         * <li>2: IPv6</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("IpType")
        public Integer ipType;

        /**
         * <p>是否开启链路追踪。</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsOpenTrace")
        public Boolean isOpenTrace;

        /**
         * <p>Specifies whether to evenly distribute monitoring samples. Valid values:</p>
         * <ul>
         * <li>0: No</li>
         * <li>1: Yes</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("MonitorSamples")
        public Integer monitorSamples;

        /**
         * <p>链路追踪客户端类型：</p>
         * <ul>
         * <li>0：ARMS Agent</li>
         * <li>1：OpenTelemetry</li>
         * <li>2：Jaeger</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TraceClientType")
        public Integer traceClientType;

        /**
         * <p>链路数据上报region。</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("XtraceRegion")
        public String xtraceRegion;

        public static GetTimingSyntheticTaskResponseBodyDataCommonSetting build(java.util.Map<String, ?> map) throws Exception {
            GetTimingSyntheticTaskResponseBodyDataCommonSetting self = new GetTimingSyntheticTaskResponseBodyDataCommonSetting();
            return TeaModel.build(map, self);
        }

        public GetTimingSyntheticTaskResponseBodyDataCommonSetting setCustomHost(GetTimingSyntheticTaskResponseBodyDataCommonSettingCustomHost customHost) {
            this.customHost = customHost;
            return this;
        }
        public GetTimingSyntheticTaskResponseBodyDataCommonSettingCustomHost getCustomHost() {
            return this.customHost;
        }

        public GetTimingSyntheticTaskResponseBodyDataCommonSetting setCustomPrometheusSetting(GetTimingSyntheticTaskResponseBodyDataCommonSettingCustomPrometheusSetting customPrometheusSetting) {
            this.customPrometheusSetting = customPrometheusSetting;
            return this;
        }
        public GetTimingSyntheticTaskResponseBodyDataCommonSettingCustomPrometheusSetting getCustomPrometheusSetting() {
            return this.customPrometheusSetting;
        }

        public GetTimingSyntheticTaskResponseBodyDataCommonSetting setCustomVPCSetting(GetTimingSyntheticTaskResponseBodyDataCommonSettingCustomVPCSetting customVPCSetting) {
            this.customVPCSetting = customVPCSetting;
            return this;
        }
        public GetTimingSyntheticTaskResponseBodyDataCommonSettingCustomVPCSetting getCustomVPCSetting() {
            return this.customVPCSetting;
        }

        public GetTimingSyntheticTaskResponseBodyDataCommonSetting setIpType(Integer ipType) {
            this.ipType = ipType;
            return this;
        }
        public Integer getIpType() {
            return this.ipType;
        }

        public GetTimingSyntheticTaskResponseBodyDataCommonSetting setIsOpenTrace(Boolean isOpenTrace) {
            this.isOpenTrace = isOpenTrace;
            return this;
        }
        public Boolean getIsOpenTrace() {
            return this.isOpenTrace;
        }

        public GetTimingSyntheticTaskResponseBodyDataCommonSetting setMonitorSamples(Integer monitorSamples) {
            this.monitorSamples = monitorSamples;
            return this;
        }
        public Integer getMonitorSamples() {
            return this.monitorSamples;
        }

        public GetTimingSyntheticTaskResponseBodyDataCommonSetting setTraceClientType(Integer traceClientType) {
            this.traceClientType = traceClientType;
            return this;
        }
        public Integer getTraceClientType() {
            return this.traceClientType;
        }

        public GetTimingSyntheticTaskResponseBodyDataCommonSetting setXtraceRegion(String xtraceRegion) {
            this.xtraceRegion = xtraceRegion;
            return this;
        }
        public String getXtraceRegion() {
            return this.xtraceRegion;
        }

    }

    public static class GetTimingSyntheticTaskResponseBodyDataCustomPeriod extends TeaModel {
        /**
         * <p>The hour at which the test ends. Valid values: 0 to 24.</p>
         * 
         * <strong>example:</strong>
         * <p>22</p>
         */
        @NameInMap("EndHour")
        public Long endHour;

        /**
         * <p>The hour at which the test starts. Valid values: 0 to 24.</p>
         * 
         * <strong>example:</strong>
         * <p>14</p>
         */
        @NameInMap("StartHour")
        public Long startHour;

        public static GetTimingSyntheticTaskResponseBodyDataCustomPeriod build(java.util.Map<String, ?> map) throws Exception {
            GetTimingSyntheticTaskResponseBodyDataCustomPeriod self = new GetTimingSyntheticTaskResponseBodyDataCustomPeriod();
            return TeaModel.build(map, self);
        }

        public GetTimingSyntheticTaskResponseBodyDataCustomPeriod setEndHour(Long endHour) {
            this.endHour = endHour;
            return this;
        }
        public Long getEndHour() {
            return this.endHour;
        }

        public GetTimingSyntheticTaskResponseBodyDataCustomPeriod setStartHour(Long startHour) {
            this.startHour = startHour;
            return this;
        }
        public Long getStartHour() {
            return this.startHour;
        }

    }

    public static class GetTimingSyntheticTaskResponseBodyDataMonitorConfApiHTTPRequestBody extends TeaModel {
        /**
         * <p>The content of the request body. Format: JSON string. The parameter is required if the type parameter is set to text/plain, application/json, application/xml, or text/html. Format: JSON string.</p>
         * 
         * <strong>example:</strong>
         * <p>text/plain</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The type of the request body. Valid values: text/plain, application/json, application/x-www-form-urlencoded, multipart/form-data, application/xml, and text/html.</p>
         * 
         * <strong>example:</strong>
         * <p>multipart/form-data</p>
         */
        @NameInMap("Type")
        public String type;

        public static GetTimingSyntheticTaskResponseBodyDataMonitorConfApiHTTPRequestBody build(java.util.Map<String, ?> map) throws Exception {
            GetTimingSyntheticTaskResponseBodyDataMonitorConfApiHTTPRequestBody self = new GetTimingSyntheticTaskResponseBodyDataMonitorConfApiHTTPRequestBody();
            return TeaModel.build(map, self);
        }

        public GetTimingSyntheticTaskResponseBodyDataMonitorConfApiHTTPRequestBody setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public GetTimingSyntheticTaskResponseBodyDataMonitorConfApiHTTPRequestBody setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class GetTimingSyntheticTaskResponseBodyDataMonitorConfApiHTTP extends TeaModel {
        @NameInMap("CheckCert")
        public Boolean checkCert;

        /**
         * <p>The connection timeout period. Unit: milliseconds. Default value: 5000. Minimum value: 1000. Maximum value: 300000.</p>
         * 
         * <strong>example:</strong>
         * <p>5000</p>
         */
        @NameInMap("ConnectTimeout")
        public Long connectTimeout;

        /**
         * <p>The request method.</p>
         * <ul>
         * <li>POST</li>
         * <li>GET</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>POST</p>
         */
        @NameInMap("Method")
        public String method;

        @NameInMap("ProtocolAlpnProtocol")
        public Integer protocolAlpnProtocol;

        /**
         * <p>The HTTP request body.</p>
         */
        @NameInMap("RequestBody")
        public GetTimingSyntheticTaskResponseBodyDataMonitorConfApiHTTPRequestBody requestBody;

        /**
         * <p>The HTTP request header.</p>
         */
        @NameInMap("RequestHeaders")
        public java.util.Map<String, String> requestHeaders;

        /**
         * <p>The URL for synthetic monitoring.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://127.0.0.1:8090/api/list">http://127.0.0.1:8090/api/list</a></p>
         */
        @NameInMap("TargetUrl")
        public String targetUrl;

        /**
         * <p>The timeout period. Unit: milliseconds. Default value: 10000. Minimum value: 1000. Maximum value: 300000.</p>
         * 
         * <strong>example:</strong>
         * <p>10000</p>
         */
        @NameInMap("Timeout")
        public Long timeout;

        public static GetTimingSyntheticTaskResponseBodyDataMonitorConfApiHTTP build(java.util.Map<String, ?> map) throws Exception {
            GetTimingSyntheticTaskResponseBodyDataMonitorConfApiHTTP self = new GetTimingSyntheticTaskResponseBodyDataMonitorConfApiHTTP();
            return TeaModel.build(map, self);
        }

        public GetTimingSyntheticTaskResponseBodyDataMonitorConfApiHTTP setCheckCert(Boolean checkCert) {
            this.checkCert = checkCert;
            return this;
        }
        public Boolean getCheckCert() {
            return this.checkCert;
        }

        public GetTimingSyntheticTaskResponseBodyDataMonitorConfApiHTTP setConnectTimeout(Long connectTimeout) {
            this.connectTimeout = connectTimeout;
            return this;
        }
        public Long getConnectTimeout() {
            return this.connectTimeout;
        }

        public GetTimingSyntheticTaskResponseBodyDataMonitorConfApiHTTP setMethod(String method) {
            this.method = method;
            return this;
        }
        public String getMethod() {
            return this.method;
        }

        public GetTimingSyntheticTaskResponseBodyDataMonitorConfApiHTTP setProtocolAlpnProtocol(Integer protocolAlpnProtocol) {
            this.protocolAlpnProtocol = protocolAlpnProtocol;
            return this;
        }
        public Integer getProtocolAlpnProtocol() {
            return this.protocolAlpnProtocol;
        }

        public GetTimingSyntheticTaskResponseBodyDataMonitorConfApiHTTP setRequestBody(GetTimingSyntheticTaskResponseBodyDataMonitorConfApiHTTPRequestBody requestBody) {
            this.requestBody = requestBody;
            return this;
        }
        public GetTimingSyntheticTaskResponseBodyDataMonitorConfApiHTTPRequestBody getRequestBody() {
            return this.requestBody;
        }

        public GetTimingSyntheticTaskResponseBodyDataMonitorConfApiHTTP setRequestHeaders(java.util.Map<String, String> requestHeaders) {
            this.requestHeaders = requestHeaders;
            return this;
        }
        public java.util.Map<String, String> getRequestHeaders() {
            return this.requestHeaders;
        }

        public GetTimingSyntheticTaskResponseBodyDataMonitorConfApiHTTP setTargetUrl(String targetUrl) {
            this.targetUrl = targetUrl;
            return this;
        }
        public String getTargetUrl() {
            return this.targetUrl;
        }

        public GetTimingSyntheticTaskResponseBodyDataMonitorConfApiHTTP setTimeout(Long timeout) {
            this.timeout = timeout;
            return this;
        }
        public Long getTimeout() {
            return this.timeout;
        }

    }

    public static class GetTimingSyntheticTaskResponseBodyDataMonitorConfFileDownload extends TeaModel {
        /**
         * <p>The connection timeout period. Unit: milliseconds. Minimum value: 1000. Maximum value: 120000. Default value: 5000.</p>
         * 
         * <strong>example:</strong>
         * <p>5000</p>
         */
        @NameInMap("ConnectionTimeout")
        public Long connectionTimeout;

        /**
         * <p>The content of the custom request header.</p>
         */
        @NameInMap("CustomHeaderContent")
        public java.util.Map<String, String> customHeaderContent;

        /**
         * <p>The kernel type.</p>
         * <ul>
         * <li>1: curl</li>
         * <li>0: WinInet</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("DownloadKernel")
        public Long downloadKernel;

        /**
         * <p>Specifies whether to ignore CA certificate authentication errors. 0: No. 1: Yes. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("IgnoreCertificateAuthError")
        public Integer ignoreCertificateAuthError;

        /**
         * <p>Specifies whether to ignore certificate revocation errors. 0: No. 1: Yes. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("IgnoreCertificateCanceledError")
        public Integer ignoreCertificateCanceledError;

        /**
         * <p>Specifies whether to ignore certificate invalidity. 0: No. 1: Yes. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("IgnoreCertificateOutOfDateError")
        public Integer ignoreCertificateOutOfDateError;

        /**
         * <p>Specifies whether to ignore certificate status errors. 0: No. 1: Yes. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("IgnoreCertificateStatusError")
        public Integer ignoreCertificateStatusError;

        /**
         * <p>Specifies whether to ignore certificate incredibility. 0: No. 1: Yes. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("IgnoreCertificateUntrustworthyError")
        public Integer ignoreCertificateUntrustworthyError;

        /**
         * <p>Specifies whether to ignore certificate usage errors. 0: No. 1: Yes. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("IgnoreCertificateUsingError")
        public Integer ignoreCertificateUsingError;

        /**
         * <p>Specifies whether to ignore host invalidity. 0: No. 1: Yes. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("IgnoreInvalidHostError")
        public Integer ignoreInvalidHostError;

        /**
         * <p>The monitoring timeout period. Unit: milliseconds. Minimum value: 1000. Maximum value: 120000. Default value: 60000.</p>
         * 
         * <strong>example:</strong>
         * <p>6000</p>
         */
        @NameInMap("MonitorTimeout")
        public Long monitorTimeout;

        /**
         * <p>The QUIC protocol type.</p>
         * <ul>
         * <li>1: http1</li>
         * <li>2: http2</li>
         * <li>3: http3</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("QuickProtocol")
        public Long quickProtocol;

        /**
         * <p>Specifies whether to support redirection. 0: No. 1: Yes. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Redirection")
        public Integer redirection;

        /**
         * <p>The file download URL.</p>
         * 
         * <strong>example:</strong>
         * <p>https://********</p>
         */
        @NameInMap("TargetUrl")
        public String targetUrl;

        /**
         * <p>The maximum file size of a single transfer. Unit: KB. Minimum value: 1. Maximum value: 20480. Valid values: 2048.</p>
         * 
         * <strong>example:</strong>
         * <p>2048</p>
         */
        @NameInMap("TransmissionSize")
        public Long transmissionSize;

        /**
         * <p>验证关键词。</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("ValidateKeywords")
        public String validateKeywords;

        /**
         * <p>验证方式。</p>
         * <ul>
         * <li>0：不验证 </li>
         * <li>1：验证字符串 </li>
         * <li>2：MD5验证</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("VerifyWay")
        public Integer verifyWay;

        /**
         * <p>DNS劫持白名单。匹配规则支持IP、IP通配符、子网掩码和CNAME，可以填写多个匹配规则，多个匹配规则以竖线（|）隔开。例如：<a href="http://www.aliyun.com:203.0.3.55%7C203.3.44.67%EF%BC%8C%E8%A1%A8%E7%A4%BAwww.aliyun.com%E5%9F%9F%E5%90%8D%E4%B8%8B%E9%99%A4203.0.3.55%E5%92%8C203.3.44.67%E4%B9%8B%E5%A4%96%E7%9A%84%E5%85%B6%E4%BB%96IP%E9%83%BD%E6%98%AF%E8%A2%AB%E5%8A%AB%E6%8C%81%E7%9A%84%E3%80%82">www.aliyun.com:203.0.3.55|203.3.44.67，表示www.aliyun.com域名下除203.0.3.55和203.3.44.67之外的其他IP都是被劫持的。</a></p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.aliyun.com:203.0.3.55%7C203.3.44.67">www.aliyun.com:203.0.3.55|203.3.44.67</a></p>
         */
        @NameInMap("WhiteList")
        public String whiteList;

        public static GetTimingSyntheticTaskResponseBodyDataMonitorConfFileDownload build(java.util.Map<String, ?> map) throws Exception {
            GetTimingSyntheticTaskResponseBodyDataMonitorConfFileDownload self = new GetTimingSyntheticTaskResponseBodyDataMonitorConfFileDownload();
            return TeaModel.build(map, self);
        }

        public GetTimingSyntheticTaskResponseBodyDataMonitorConfFileDownload setConnectionTimeout(Long connectionTimeout) {
            this.connectionTimeout = connectionTimeout;
            return this;
        }
        public Long getConnectionTimeout() {
            return this.connectionTimeout;
        }

        public GetTimingSyntheticTaskResponseBodyDataMonitorConfFileDownload setCustomHeaderContent(java.util.Map<String, String> customHeaderContent) {
            this.customHeaderContent = customHeaderContent;
            return this;
        }
        public java.util.Map<String, String> getCustomHeaderContent() {
            return this.customHeaderContent;
        }

        public GetTimingSyntheticTaskResponseBodyDataMonitorConfFileDownload setDownloadKernel(Long downloadKernel) {
            this.downloadKernel = downloadKernel;
            return this;
        }
        public Long getDownloadKernel() {
            return this.downloadKernel;
        }

        public GetTimingSyntheticTaskResponseBodyDataMonitorConfFileDownload setIgnoreCertificateAuthError(Integer ignoreCertificateAuthError) {
            this.ignoreCertificateAuthError = ignoreCertificateAuthError;
            return this;
        }
        public Integer getIgnoreCertificateAuthError() {
            return this.ignoreCertificateAuthError;
        }

        public GetTimingSyntheticTaskResponseBodyDataMonitorConfFileDownload setIgnoreCertificateCanceledError(Integer ignoreCertificateCanceledError) {
            this.ignoreCertificateCanceledError = ignoreCertificateCanceledError;
            return this;
        }
        public Integer getIgnoreCertificateCanceledError() {
            return this.ignoreCertificateCanceledError;
        }

        public GetTimingSyntheticTaskResponseBodyDataMonitorConfFileDownload setIgnoreCertificateOutOfDateError(Integer ignoreCertificateOutOfDateError) {
            this.ignoreCertificateOutOfDateError = ignoreCertificateOutOfDateError;
            return this;
        }
        public Integer getIgnoreCertificateOutOfDateError() {
            return this.ignoreCertificateOutOfDateError;
        }

        public GetTimingSyntheticTaskResponseBodyDataMonitorConfFileDownload setIgnoreCertificateStatusError(Integer ignoreCertificateStatusError) {
            this.ignoreCertificateStatusError = ignoreCertificateStatusError;
            return this;
        }
        public Integer getIgnoreCertificateStatusError() {
            return this.ignoreCertificateStatusError;
        }

        public GetTimingSyntheticTaskResponseBodyDataMonitorConfFileDownload setIgnoreCertificateUntrustworthyError(Integer ignoreCertificateUntrustworthyError) {
            this.ignoreCertificateUntrustworthyError = ignoreCertificateUntrustworthyError;
            return this;
        }
        public Integer getIgnoreCertificateUntrustworthyError() {
            return this.ignoreCertificateUntrustworthyError;
        }

        public GetTimingSyntheticTaskResponseBodyDataMonitorConfFileDownload setIgnoreCertificateUsingError(Integer ignoreCertificateUsingError) {
            this.ignoreCertificateUsingError = ignoreCertificateUsingError;
            return this;
        }
        public Integer getIgnoreCertificateUsingError() {
            return this.ignoreCertificateUsingError;
        }

        public GetTimingSyntheticTaskResponseBodyDataMonitorConfFileDownload setIgnoreInvalidHostError(Integer ignoreInvalidHostError) {
            this.ignoreInvalidHostError = ignoreInvalidHostError;
            return this;
        }
        public Integer getIgnoreInvalidHostError() {
            return this.ignoreInvalidHostError;
        }

        public GetTimingSyntheticTaskResponseBodyDataMonitorConfFileDownload setMonitorTimeout(Long monitorTimeout) {
            this.monitorTimeout = monitorTimeout;
            return this;
        }
        public Long getMonitorTimeout() {
            return this.monitorTimeout;
        }

        public GetTimingSyntheticTaskResponseBodyDataMonitorConfFileDownload setQuickProtocol(Long quickProtocol) {
            this.quickProtocol = quickProtocol;
            return this;
        }
        public Long getQuickProtocol() {
            return this.quickProtocol;
        }

        public GetTimingSyntheticTaskResponseBodyDataMonitorConfFileDownload setRedirection(Integer redirection) {
            this.redirection = redirection;
            return this;
        }
        public Integer getRedirection() {
            return this.redirection;
        }

        public GetTimingSyntheticTaskResponseBodyDataMonitorConfFileDownload setTargetUrl(String targetUrl) {
            this.targetUrl = targetUrl;
            return this;
        }
        public String getTargetUrl() {
            return this.targetUrl;
        }

        public GetTimingSyntheticTaskResponseBodyDataMonitorConfFileDownload setTransmissionSize(Long transmissionSize) {
            this.transmissionSize = transmissionSize;
            return this;
        }
        public Long getTransmissionSize() {
            return this.transmissionSize;
        }

        public GetTimingSyntheticTaskResponseBodyDataMonitorConfFileDownload setValidateKeywords(String validateKeywords) {
            this.validateKeywords = validateKeywords;
            return this;
        }
        public String getValidateKeywords() {
            return this.validateKeywords;
        }

        public GetTimingSyntheticTaskResponseBodyDataMonitorConfFileDownload setVerifyWay(Integer verifyWay) {
            this.verifyWay = verifyWay;
            return this;
        }
        public Integer getVerifyWay() {
            return this.verifyWay;
        }

        public GetTimingSyntheticTaskResponseBodyDataMonitorConfFileDownload setWhiteList(String whiteList) {
            this.whiteList = whiteList;
            return this;
        }
        public String getWhiteList() {
            return this.whiteList;
        }

    }

    public static class GetTimingSyntheticTaskResponseBodyDataMonitorConfNetDNS extends TeaModel {
        /**
         * <p>The IP version of the DNS server. 0: IPv4. 1: IPv6. 2: A version is automatically selected. Default value: 0.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("DnsServerIpType")
        public Integer dnsServerIpType;

        /**
         * <p>The IP address of the DNS server. Default value: 114.114.114.114.</p>
         * 
         * <strong>example:</strong>
         * <p>114.114.114.114</p>
         */
        @NameInMap("NsServer")
        public String nsServer;

        /**
         * <p>The DNS query. 0: recursive, 1: iterative. Default value: 0.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("QueryMethod")
        public Integer queryMethod;

        /**
         * <p>The destination domain name.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.aliyun.com">www.aliyun.com</a></p>
         */
        @NameInMap("TargetUrl")
        public String targetUrl;

        /**
         * <p>The timeout period for the DNS synthetic test. Unit: milliseconds. The minimum value is 1000 and the maximum value is 45000. Default value: 5000.</p>
         * 
         * <strong>example:</strong>
         * <p>5000</p>
         */
        @NameInMap("Timeout")
        public Long timeout;

        public static GetTimingSyntheticTaskResponseBodyDataMonitorConfNetDNS build(java.util.Map<String, ?> map) throws Exception {
            GetTimingSyntheticTaskResponseBodyDataMonitorConfNetDNS self = new GetTimingSyntheticTaskResponseBodyDataMonitorConfNetDNS();
            return TeaModel.build(map, self);
        }

        public GetTimingSyntheticTaskResponseBodyDataMonitorConfNetDNS setDnsServerIpType(Integer dnsServerIpType) {
            this.dnsServerIpType = dnsServerIpType;
            return this;
        }
        public Integer getDnsServerIpType() {
            return this.dnsServerIpType;
        }

        public GetTimingSyntheticTaskResponseBodyDataMonitorConfNetDNS setNsServer(String nsServer) {
            this.nsServer = nsServer;
            return this;
        }
        public String getNsServer() {
            return this.nsServer;
        }

        public GetTimingSyntheticTaskResponseBodyDataMonitorConfNetDNS setQueryMethod(Integer queryMethod) {
            this.queryMethod = queryMethod;
            return this;
        }
        public Integer getQueryMethod() {
            return this.queryMethod;
        }

        public GetTimingSyntheticTaskResponseBodyDataMonitorConfNetDNS setTargetUrl(String targetUrl) {
            this.targetUrl = targetUrl;
            return this;
        }
        public String getTargetUrl() {
            return this.targetUrl;
        }

        public GetTimingSyntheticTaskResponseBodyDataMonitorConfNetDNS setTimeout(Long timeout) {
            this.timeout = timeout;
            return this;
        }
        public Long getTimeout() {
            return this.timeout;
        }

    }

    public static class GetTimingSyntheticTaskResponseBodyDataMonitorConfNetICMP extends TeaModel {
        /**
         * <p>The interval at which ICMP packets are sent. Unit: milliseconds. Minimum value: 200. Maximum value: 2000. Default value: 200.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("Interval")
        public Integer interval;

        /**
         * <p>The number of ICMP packets that are sent. Minimum value: 1. Maximum value: 50. Default value: 4.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("PackageNum")
        public Integer packageNum;

        /**
         * <p>The size of each ICMP packet. Unit: bytes. Valid values: 32, 64, 128, 256, 512, 1024.</p>
         * 
         * <strong>example:</strong>
         * <p>1024</p>
         */
        @NameInMap("PackageSize")
        public Integer packageSize;

        /**
         * <p>Specifies whether to split ICMP packets. Default value: true.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("SplitPackage")
        public Boolean splitPackage;

        /**
         * <p>The destination host IP address or domain name</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.aliyun.com">www.aliyun.com</a></p>
         */
        @NameInMap("TargetUrl")
        public String targetUrl;

        /**
         * <p>The timeout period for the TCP synthetic test. Unit: milliseconds. Minimum value: 1000. Maximum value: 300000. Default value: 20000.</p>
         * 
         * <strong>example:</strong>
         * <p>2000</p>
         */
        @NameInMap("Timeout")
        public Long timeout;

        /**
         * <p>Specifies whether to enable the tracert command. Default value: true.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("TracertEnable")
        public Boolean tracertEnable;

        /**
         * <p>The maximum number of hops for tracert. Minimum value: 1. Maximum value: 128. Default value: 64.</p>
         * 
         * <strong>example:</strong>
         * <p>64</p>
         */
        @NameInMap("TracertNumMax")
        public Integer tracertNumMax;

        /**
         * <p>The timeout period of tracert. Unit: milliseconds. Minimum value: 1000. Maximum value: 300000. Default value: 60000.</p>
         * 
         * <strong>example:</strong>
         * <p>60000</p>
         */
        @NameInMap("TracertTimeout")
        public Long tracertTimeout;

        public static GetTimingSyntheticTaskResponseBodyDataMonitorConfNetICMP build(java.util.Map<String, ?> map) throws Exception {
            GetTimingSyntheticTaskResponseBodyDataMonitorConfNetICMP self = new GetTimingSyntheticTaskResponseBodyDataMonitorConfNetICMP();
            return TeaModel.build(map, self);
        }

        public GetTimingSyntheticTaskResponseBodyDataMonitorConfNetICMP setInterval(Integer interval) {
            this.interval = interval;
            return this;
        }
        public Integer getInterval() {
            return this.interval;
        }

        public GetTimingSyntheticTaskResponseBodyDataMonitorConfNetICMP setPackageNum(Integer packageNum) {
            this.packageNum = packageNum;
            return this;
        }
        public Integer getPackageNum() {
            return this.packageNum;
        }

        public GetTimingSyntheticTaskResponseBodyDataMonitorConfNetICMP setPackageSize(Integer packageSize) {
            this.packageSize = packageSize;
            return this;
        }
        public Integer getPackageSize() {
            return this.packageSize;
        }

        public GetTimingSyntheticTaskResponseBodyDataMonitorConfNetICMP setSplitPackage(Boolean splitPackage) {
            this.splitPackage = splitPackage;
            return this;
        }
        public Boolean getSplitPackage() {
            return this.splitPackage;
        }

        public GetTimingSyntheticTaskResponseBodyDataMonitorConfNetICMP setTargetUrl(String targetUrl) {
            this.targetUrl = targetUrl;
            return this;
        }
        public String getTargetUrl() {
            return this.targetUrl;
        }

        public GetTimingSyntheticTaskResponseBodyDataMonitorConfNetICMP setTimeout(Long timeout) {
            this.timeout = timeout;
            return this;
        }
        public Long getTimeout() {
            return this.timeout;
        }

        public GetTimingSyntheticTaskResponseBodyDataMonitorConfNetICMP setTracertEnable(Boolean tracertEnable) {
            this.tracertEnable = tracertEnable;
            return this;
        }
        public Boolean getTracertEnable() {
            return this.tracertEnable;
        }

        public GetTimingSyntheticTaskResponseBodyDataMonitorConfNetICMP setTracertNumMax(Integer tracertNumMax) {
            this.tracertNumMax = tracertNumMax;
            return this;
        }
        public Integer getTracertNumMax() {
            return this.tracertNumMax;
        }

        public GetTimingSyntheticTaskResponseBodyDataMonitorConfNetICMP setTracertTimeout(Long tracertTimeout) {
            this.tracertTimeout = tracertTimeout;
            return this;
        }
        public Long getTracertTimeout() {
            return this.tracertTimeout;
        }

    }

    public static class GetTimingSyntheticTaskResponseBodyDataMonitorConfNetTCP extends TeaModel {
        /**
         * <p>The number of TCP connections that are established in a test. Minimum value: 1. Maximum value: 16. Default value: 4.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("ConnectTimes")
        public Integer connectTimes;

        /**
         * <p>The interval at which TCP connections are established. Unit: milliseconds. Minimum value: 200. Maximum value: 10000. Default value: 200.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("Interval")
        public Long interval;

        /**
         * <p>The destination host IP address.</p>
         * 
         * <strong>example:</strong>
         * <p>127.0.0.1:8888</p>
         */
        @NameInMap("TargetUrl")
        public String targetUrl;

        /**
         * <p>The timeout period for the TCP synthetic test. Unit: milliseconds. Minimum value: 1000. Maximum value: 300000. Default value: 20000.</p>
         * 
         * <strong>example:</strong>
         * <p>20000</p>
         */
        @NameInMap("Timeout")
        public Long timeout;

        /**
         * <p>Specifies whether to enable the tracert command. Default value: true.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("TracertEnable")
        public Boolean tracertEnable;

        /**
         * <p>The maximum number of hops for tracert. Minimum value: 1. Maximum value: 128. Default value: 20.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("TracertNumMax")
        public Integer tracertNumMax;

        /**
         * <p>The timeout period of tracert. Unit: milliseconds. Minimum value: 1000. Maximum value: 300000. Default value: 60000.</p>
         * 
         * <strong>example:</strong>
         * <p>60000</p>
         */
        @NameInMap("TracertTimeout")
        public Long tracertTimeout;

        public static GetTimingSyntheticTaskResponseBodyDataMonitorConfNetTCP build(java.util.Map<String, ?> map) throws Exception {
            GetTimingSyntheticTaskResponseBodyDataMonitorConfNetTCP self = new GetTimingSyntheticTaskResponseBodyDataMonitorConfNetTCP();
            return TeaModel.build(map, self);
        }

        public GetTimingSyntheticTaskResponseBodyDataMonitorConfNetTCP setConnectTimes(Integer connectTimes) {
            this.connectTimes = connectTimes;
            return this;
        }
        public Integer getConnectTimes() {
            return this.connectTimes;
        }

        public GetTimingSyntheticTaskResponseBodyDataMonitorConfNetTCP setInterval(Long interval) {
            this.interval = interval;
            return this;
        }
        public Long getInterval() {
            return this.interval;
        }

        public GetTimingSyntheticTaskResponseBodyDataMonitorConfNetTCP setTargetUrl(String targetUrl) {
            this.targetUrl = targetUrl;
            return this;
        }
        public String getTargetUrl() {
            return this.targetUrl;
        }

        public GetTimingSyntheticTaskResponseBodyDataMonitorConfNetTCP setTimeout(Long timeout) {
            this.timeout = timeout;
            return this;
        }
        public Long getTimeout() {
            return this.timeout;
        }

        public GetTimingSyntheticTaskResponseBodyDataMonitorConfNetTCP setTracertEnable(Boolean tracertEnable) {
            this.tracertEnable = tracertEnable;
            return this;
        }
        public Boolean getTracertEnable() {
            return this.tracertEnable;
        }

        public GetTimingSyntheticTaskResponseBodyDataMonitorConfNetTCP setTracertNumMax(Integer tracertNumMax) {
            this.tracertNumMax = tracertNumMax;
            return this;
        }
        public Integer getTracertNumMax() {
            return this.tracertNumMax;
        }

        public GetTimingSyntheticTaskResponseBodyDataMonitorConfNetTCP setTracertTimeout(Long tracertTimeout) {
            this.tracertTimeout = tracertTimeout;
            return this;
        }
        public Long getTracertTimeout() {
            return this.tracertTimeout;
        }

    }

    public static class GetTimingSyntheticTaskResponseBodyDataMonitorConfStream extends TeaModel {
        /**
         * <p>自定义header，JSON Map格式。</p>
         */
        @NameInMap("CustomHeaderContent")
        public java.util.Map<String, String> customHeaderContent;

        /**
         * <p>播放器，不传默认12。</p>
         * <ul>
         * <li>12：VLC</li>
         * <li>2：FlashPlayer</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>12</p>
         */
        @NameInMap("PlayerType")
        public Integer playerType;

        /**
         * <p>资源地址类型：</p>
         * <ul>
         * <li>1：资源地址。</li>
         * <li>0：页面地址。不传默认0。</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("StreamAddressType")
        public Integer streamAddressType;

        /**
         * <p>监测时长，单位秒，最长支持60s，不传默认60。</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("StreamMonitorTimeout")
        public Integer streamMonitorTimeout;

        /**
         * <p>音视频标志：0-视频，1-音频。</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("StreamType")
        public Integer streamType;

        /**
         * <p>流媒体资源地址。</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.aliyun.com/stream/test.mp4">http://www.aliyun.com/stream/test.mp4</a></p>
         */
        @NameInMap("TargetUrl")
        public String targetUrl;

        /**
         * <p>DNS劫持白名单。匹配规则支持IP、IP通配符、子网掩码和CNAME，可以填写多个匹配规则，多个匹配规则以竖线（|）隔开。例如：<a href="http://www.aliyun.com:203.0.3.55%7C203.3.44.67%EF%BC%8C%E8%A1%A8%E7%A4%BAwww.aliyun.com%E5%9F%9F%E5%90%8D%E4%B8%8B%E9%99%A4203.0.3.55%E5%92%8C203.3.44.67%E4%B9%8B%E5%A4%96%E7%9A%84%E5%85%B6%E4%BB%96IP%E9%83%BD%E6%98%AF%E8%A2%AB%E5%8A%AB%E6%8C%81%E7%9A%84%E3%80%82">www.aliyun.com:203.0.3.55|203.3.44.67，表示www.aliyun.com域名下除203.0.3.55和203.3.44.67之外的其他IP都是被劫持的。</a></p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.aliyun.com:203.0.3.55%7C203.3.44.67">www.aliyun.com:203.0.3.55|203.3.44.67</a></p>
         */
        @NameInMap("WhiteList")
        public String whiteList;

        public static GetTimingSyntheticTaskResponseBodyDataMonitorConfStream build(java.util.Map<String, ?> map) throws Exception {
            GetTimingSyntheticTaskResponseBodyDataMonitorConfStream self = new GetTimingSyntheticTaskResponseBodyDataMonitorConfStream();
            return TeaModel.build(map, self);
        }

        public GetTimingSyntheticTaskResponseBodyDataMonitorConfStream setCustomHeaderContent(java.util.Map<String, String> customHeaderContent) {
            this.customHeaderContent = customHeaderContent;
            return this;
        }
        public java.util.Map<String, String> getCustomHeaderContent() {
            return this.customHeaderContent;
        }

        public GetTimingSyntheticTaskResponseBodyDataMonitorConfStream setPlayerType(Integer playerType) {
            this.playerType = playerType;
            return this;
        }
        public Integer getPlayerType() {
            return this.playerType;
        }

        public GetTimingSyntheticTaskResponseBodyDataMonitorConfStream setStreamAddressType(Integer streamAddressType) {
            this.streamAddressType = streamAddressType;
            return this;
        }
        public Integer getStreamAddressType() {
            return this.streamAddressType;
        }

        public GetTimingSyntheticTaskResponseBodyDataMonitorConfStream setStreamMonitorTimeout(Integer streamMonitorTimeout) {
            this.streamMonitorTimeout = streamMonitorTimeout;
            return this;
        }
        public Integer getStreamMonitorTimeout() {
            return this.streamMonitorTimeout;
        }

        public GetTimingSyntheticTaskResponseBodyDataMonitorConfStream setStreamType(Integer streamType) {
            this.streamType = streamType;
            return this;
        }
        public Integer getStreamType() {
            return this.streamType;
        }

        public GetTimingSyntheticTaskResponseBodyDataMonitorConfStream setTargetUrl(String targetUrl) {
            this.targetUrl = targetUrl;
            return this;
        }
        public String getTargetUrl() {
            return this.targetUrl;
        }

        public GetTimingSyntheticTaskResponseBodyDataMonitorConfStream setWhiteList(String whiteList) {
            this.whiteList = whiteList;
            return this;
        }
        public String getWhiteList() {
            return this.whiteList;
        }

    }

    public static class GetTimingSyntheticTaskResponseBodyDataMonitorConfWebsite extends TeaModel {
        /**
         * <p>Specifies whether to automatically scroll up and down the screen to load a page. 0: No. 1: Yes. Default value: 0.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AutomaticScrolling")
        public Integer automaticScrolling;

        /**
         * <p>Specifies whether to create a custom header. 0: No. 1: The first packet is modified. 2: All packets are modified. Default value: 0.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("CustomHeader")
        public Integer customHeader;

        /**
         * <p>The custom header. Format: JSON map.</p>
         */
        @NameInMap("CustomHeaderContent")
        public java.util.Map<String, String> customHeaderContent;

        /**
         * <p>域名（例如<a href="http://www.aliyun.com%EF%BC%89%E8%A7%A3%E6%9E%90%E6%97%B6%EF%BC%8C%E8%A7%A3%E6%9E%90%E5%87%BA%E7%9A%84IP%E5%9C%B0%E5%9D%80%E6%88%96%E8%80%85CNAME%E4%B8%8D%E5%9C%A8DNS%E5%8A%AB%E6%8C%81%E7%99%BD%E5%90%8D%E5%8D%95%E5%86%85%EF%BC%8C%E7%94%A8%E6%88%B7%E5%B0%B1%E4%BC%9A%E8%AE%BF%E9%97%AE%E5%A4%B1%E8%B4%A5%E6%88%96%E8%80%85%E8%BF%94%E5%9B%9E%E4%B8%80%E4%B8%AA%E9%9D%9EAliyun%E7%9A%84%E7%9B%AE%E6%A0%87IP%EF%BC%9B%E8%8B%A5%E8%A7%A3%E6%9E%90%E7%BB%93%E6%9E%9C%E4%B8%AD%E7%9A%84IP%E6%88%96%E8%80%85CNAME%E5%9C%A8DNS%E7%99%BD%E5%90%8D%E5%8D%95%E5%86%85%EF%BC%8C%E5%88%99%E4%BC%9A%E8%A2%AB%E8%AE%A4%E5%AE%9A%E4%B8%BA%E6%B2%A1%E6%9C%89%E5%8F%91%E7%94%9FDNS%E5%8A%AB%E6%8C%81%E3%80%82">www.aliyun.com）解析时，解析出的IP地址或者CNAME不在DNS劫持白名单内，用户就会访问失败或者返回一个非Aliyun的目标IP；若解析结果中的IP或者CNAME在DNS白名单内，则会被认定为没有发生DNS劫持。</a></p>
         * <p>填写格式：域名:匹配规则。匹配规则支持IP、IP通配符、子网掩码和CNAME，可以填写多个匹配规则，多个匹配规则以竖线（|）隔开。例如：<a href="http://www.aliyun.com:203.0.3.55%7C203.3.44.67%EF%BC%8C%E8%A1%A8%E7%A4%BAwww.aliyun.com%E5%9F%9F%E5%90%8D%E4%B8%8B%E9%99%A4203.0.3.55%E5%92%8C203.3.44.67%E4%B9%8B%E5%A4%96%E7%9A%84%E5%85%B6%E4%BB%96IP%E9%83%BD%E6%98%AF%E8%A2%AB%E5%8A%AB%E6%8C%81%E7%9A%84%E3%80%82">www.aliyun.com:203.0.3.55|203.3.44.67，表示www.aliyun.com域名下除203.0.3.55和203.3.44.67之外的其他IP都是被劫持的。</a></p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.aliyun.com:203.0.3.55%7C203.3.44.67">www.aliyun.com:203.0.3.55|203.3.44.67</a></p>
         */
        @NameInMap("DNSHijackWhitelist")
        public String DNSHijackWhitelist;

        /**
         * <p>Specifies whether to disable the cache. 0: No. 1: Yes. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("DisableCache")
        public Integer disableCache;

        /**
         * <p>Specifies whether to accept compressed files based on the HTTP Accept-Encoding request header. 0: No. 1: Yes. Default value: 0.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("DisableCompression")
        public Integer disableCompression;

        /**
         * <p>在页面加载过程中如果出现元素黑名单中配置的元素，不会请求加载该元素 。</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.example.com/a.jpg">www.example.com/a.jpg</a></p>
         */
        @NameInMap("ElementBlacklist")
        public String elementBlacklist;

        /**
         * <p>Specifies whether to exclude invalid IP addresses.</p>
         * <ul>
         * <li>1: No</li>
         * <li>0: Yes</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("FilterInvalidIP")
        public Integer filterInvalidIP;

        /**
         * <p>识别元素：设置浏览页面元素总个数。</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("FlowHijackJumpTimes")
        public Integer flowHijackJumpTimes;

        /**
         * <p>劫持标识：设置匹配的关键信息。填写劫持判断关键字或关键元素，允许带星号（*）。</p>
         * 
         * <strong>example:</strong>
         * <p>aliyun</p>
         */
        @NameInMap("FlowHijackLogo")
        public String flowHijackLogo;

        /**
         * <p>Specifies whether to ignore SSL certificate errors during browsing. 0: No. 1: Yes. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("IgnoreCertificateError")
        public Integer ignoreCertificateError;

        /**
         * <p>The monitoring timeout period. Unit: milliseconds. Default value: 20000. Minimum value: 5000. Maximum value: 300000.</p>
         * 
         * <strong>example:</strong>
         * <p>20000</p>
         */
        @NameInMap("MonitorTimeout")
        public Integer monitorTimeout;

        /**
         * <p>监测页面出现了域名设置之外的元素都属于页面被篡改。常见的表现形式为弹出广告、浮动广告、跳转等。</p>
         * <p>填写格式：域名:元素。元素支持填写通配符，可以填写多个元素，多个元素以竖线（|）隔开。例如：<a href="http://www.aliyun.com:%7C/cc/bb/a.gif%7C/vv/bb/cc.jpg%EF%BC%8C%E8%A1%A8%E7%A4%BAwww.aliyun.com%E5%9F%9F%E5%90%8D%E4%B8%8B%E9%99%A4%E5%9F%BA%E7%A1%80%E6%96%87%E6%A1%A3%E3%80%81/cc/bb/a.gif%E5%92%8C/vv/bb/cc.jpg%E4%B9%8B%E5%A4%96%E7%9A%84%E5%85%B6%E4%BB%96%E5%85%83%E7%B4%A0%E9%83%BD%E5%B1%9E%E4%BA%8E%E9%A1%B5%E9%9D%A2%E8%A2%AB%E7%AF%A1%E6%94%B9%E3%80%82">www.aliyun.com:|/cc/bb/a.gif|/vv/bb/cc.jpg，表示www.aliyun.com域名下除基础文档、/cc/bb/a.gif和/vv/bb/cc.jpg之外的其他元素都属于页面被篡改。</a></p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.aliyun.com:%7C/cc/bb/a.gif%7C/vv/bb/cc.jpg">www.aliyun.com:|/cc/bb/a.gif|/vv/bb/cc.jpg</a></p>
         */
        @NameInMap("PageTamper")
        public String pageTamper;

        /**
         * <p>Specifies whether to continue browsing after redirection. 0: No, 1:Yes. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Redirection")
        public Integer redirection;

        /**
         * <p>The time threshold that is used to define a slow element. Unit: milliseconds. Default value: 5000. Minimum value: 1. Maximum value: 300000.</p>
         * 
         * <strong>example:</strong>
         * <p>5000</p>
         */
        @NameInMap("SlowElementThreshold")
        public Long slowElementThreshold;

        /**
         * <p>The destination URL.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.aliyun.com">http://www.aliyun.com</a></p>
         */
        @NameInMap("TargetUrl")
        public String targetUrl;

        /**
         * <p>验证字符串即监测页面源代码中的某个任意字符串。若客户端返回的源码中包含任一黑名单中的字符串则报650验证字符串失败的错误。多个字符串以竖线（|）隔开。</p>
         * 
         * <strong>example:</strong>
         * <p>error</p>
         */
        @NameInMap("VerifyStringBlacklist")
        public String verifyStringBlacklist;

        /**
         * <p>验证字符串即监测页面源代码中的某个任意字符串。客户端返回的源码必须包含所有白名单中的字符串，否则报650验证字符串失败的错误。多个字符串以竖线（|）隔开。</p>
         * 
         * <strong>example:</strong>
         * <p>success</p>
         */
        @NameInMap("VerifyStringWhitelist")
        public String verifyStringWhitelist;

        /**
         * <p>The maximum waiting time. Unit: milliseconds. Default value: 5000. Minimum value: 5000. Maximum value: 300000.</p>
         * 
         * <strong>example:</strong>
         * <p>5000</p>
         */
        @NameInMap("WaitCompletionTime")
        public Long waitCompletionTime;

        public static GetTimingSyntheticTaskResponseBodyDataMonitorConfWebsite build(java.util.Map<String, ?> map) throws Exception {
            GetTimingSyntheticTaskResponseBodyDataMonitorConfWebsite self = new GetTimingSyntheticTaskResponseBodyDataMonitorConfWebsite();
            return TeaModel.build(map, self);
        }

        public GetTimingSyntheticTaskResponseBodyDataMonitorConfWebsite setAutomaticScrolling(Integer automaticScrolling) {
            this.automaticScrolling = automaticScrolling;
            return this;
        }
        public Integer getAutomaticScrolling() {
            return this.automaticScrolling;
        }

        public GetTimingSyntheticTaskResponseBodyDataMonitorConfWebsite setCustomHeader(Integer customHeader) {
            this.customHeader = customHeader;
            return this;
        }
        public Integer getCustomHeader() {
            return this.customHeader;
        }

        public GetTimingSyntheticTaskResponseBodyDataMonitorConfWebsite setCustomHeaderContent(java.util.Map<String, String> customHeaderContent) {
            this.customHeaderContent = customHeaderContent;
            return this;
        }
        public java.util.Map<String, String> getCustomHeaderContent() {
            return this.customHeaderContent;
        }

        public GetTimingSyntheticTaskResponseBodyDataMonitorConfWebsite setDNSHijackWhitelist(String DNSHijackWhitelist) {
            this.DNSHijackWhitelist = DNSHijackWhitelist;
            return this;
        }
        public String getDNSHijackWhitelist() {
            return this.DNSHijackWhitelist;
        }

        public GetTimingSyntheticTaskResponseBodyDataMonitorConfWebsite setDisableCache(Integer disableCache) {
            this.disableCache = disableCache;
            return this;
        }
        public Integer getDisableCache() {
            return this.disableCache;
        }

        public GetTimingSyntheticTaskResponseBodyDataMonitorConfWebsite setDisableCompression(Integer disableCompression) {
            this.disableCompression = disableCompression;
            return this;
        }
        public Integer getDisableCompression() {
            return this.disableCompression;
        }

        public GetTimingSyntheticTaskResponseBodyDataMonitorConfWebsite setElementBlacklist(String elementBlacklist) {
            this.elementBlacklist = elementBlacklist;
            return this;
        }
        public String getElementBlacklist() {
            return this.elementBlacklist;
        }

        public GetTimingSyntheticTaskResponseBodyDataMonitorConfWebsite setFilterInvalidIP(Integer filterInvalidIP) {
            this.filterInvalidIP = filterInvalidIP;
            return this;
        }
        public Integer getFilterInvalidIP() {
            return this.filterInvalidIP;
        }

        public GetTimingSyntheticTaskResponseBodyDataMonitorConfWebsite setFlowHijackJumpTimes(Integer flowHijackJumpTimes) {
            this.flowHijackJumpTimes = flowHijackJumpTimes;
            return this;
        }
        public Integer getFlowHijackJumpTimes() {
            return this.flowHijackJumpTimes;
        }

        public GetTimingSyntheticTaskResponseBodyDataMonitorConfWebsite setFlowHijackLogo(String flowHijackLogo) {
            this.flowHijackLogo = flowHijackLogo;
            return this;
        }
        public String getFlowHijackLogo() {
            return this.flowHijackLogo;
        }

        public GetTimingSyntheticTaskResponseBodyDataMonitorConfWebsite setIgnoreCertificateError(Integer ignoreCertificateError) {
            this.ignoreCertificateError = ignoreCertificateError;
            return this;
        }
        public Integer getIgnoreCertificateError() {
            return this.ignoreCertificateError;
        }

        public GetTimingSyntheticTaskResponseBodyDataMonitorConfWebsite setMonitorTimeout(Integer monitorTimeout) {
            this.monitorTimeout = monitorTimeout;
            return this;
        }
        public Integer getMonitorTimeout() {
            return this.monitorTimeout;
        }

        public GetTimingSyntheticTaskResponseBodyDataMonitorConfWebsite setPageTamper(String pageTamper) {
            this.pageTamper = pageTamper;
            return this;
        }
        public String getPageTamper() {
            return this.pageTamper;
        }

        public GetTimingSyntheticTaskResponseBodyDataMonitorConfWebsite setRedirection(Integer redirection) {
            this.redirection = redirection;
            return this;
        }
        public Integer getRedirection() {
            return this.redirection;
        }

        public GetTimingSyntheticTaskResponseBodyDataMonitorConfWebsite setSlowElementThreshold(Long slowElementThreshold) {
            this.slowElementThreshold = slowElementThreshold;
            return this;
        }
        public Long getSlowElementThreshold() {
            return this.slowElementThreshold;
        }

        public GetTimingSyntheticTaskResponseBodyDataMonitorConfWebsite setTargetUrl(String targetUrl) {
            this.targetUrl = targetUrl;
            return this;
        }
        public String getTargetUrl() {
            return this.targetUrl;
        }

        public GetTimingSyntheticTaskResponseBodyDataMonitorConfWebsite setVerifyStringBlacklist(String verifyStringBlacklist) {
            this.verifyStringBlacklist = verifyStringBlacklist;
            return this;
        }
        public String getVerifyStringBlacklist() {
            return this.verifyStringBlacklist;
        }

        public GetTimingSyntheticTaskResponseBodyDataMonitorConfWebsite setVerifyStringWhitelist(String verifyStringWhitelist) {
            this.verifyStringWhitelist = verifyStringWhitelist;
            return this;
        }
        public String getVerifyStringWhitelist() {
            return this.verifyStringWhitelist;
        }

        public GetTimingSyntheticTaskResponseBodyDataMonitorConfWebsite setWaitCompletionTime(Long waitCompletionTime) {
            this.waitCompletionTime = waitCompletionTime;
            return this;
        }
        public Long getWaitCompletionTime() {
            return this.waitCompletionTime;
        }

    }

    public static class GetTimingSyntheticTaskResponseBodyDataMonitorConf extends TeaModel {
        /**
         * <p>The HTTP(S) synthetic test parameters.</p>
         */
        @NameInMap("ApiHTTP")
        public GetTimingSyntheticTaskResponseBodyDataMonitorConfApiHTTP apiHTTP;

        /**
         * <p>The file download parameters.</p>
         */
        @NameInMap("FileDownload")
        public GetTimingSyntheticTaskResponseBodyDataMonitorConfFileDownload fileDownload;

        /**
         * <p>The DNS synthetic test parameters. This parameter is required if the TaskType parameter is set to 3.</p>
         */
        @NameInMap("NetDNS")
        public GetTimingSyntheticTaskResponseBodyDataMonitorConfNetDNS netDNS;

        /**
         * <p>The ICMP synthetic test parameters. This parameter is required if the TaskType parameter is set to 1.</p>
         */
        @NameInMap("NetICMP")
        public GetTimingSyntheticTaskResponseBodyDataMonitorConfNetICMP netICMP;

        /**
         * <p>The TCP synthetic tests parameters. This parameter is required if the TaskType parameter is set to 2.</p>
         */
        @NameInMap("NetTCP")
        public GetTimingSyntheticTaskResponseBodyDataMonitorConfNetTCP netTCP;

        /**
         * <p>流媒体拨测配置。</p>
         */
        @NameInMap("Stream")
        public GetTimingSyntheticTaskResponseBodyDataMonitorConfStream stream;

        /**
         * <p>The website-speed measurement parameters.</p>
         */
        @NameInMap("Website")
        public GetTimingSyntheticTaskResponseBodyDataMonitorConfWebsite website;

        public static GetTimingSyntheticTaskResponseBodyDataMonitorConf build(java.util.Map<String, ?> map) throws Exception {
            GetTimingSyntheticTaskResponseBodyDataMonitorConf self = new GetTimingSyntheticTaskResponseBodyDataMonitorConf();
            return TeaModel.build(map, self);
        }

        public GetTimingSyntheticTaskResponseBodyDataMonitorConf setApiHTTP(GetTimingSyntheticTaskResponseBodyDataMonitorConfApiHTTP apiHTTP) {
            this.apiHTTP = apiHTTP;
            return this;
        }
        public GetTimingSyntheticTaskResponseBodyDataMonitorConfApiHTTP getApiHTTP() {
            return this.apiHTTP;
        }

        public GetTimingSyntheticTaskResponseBodyDataMonitorConf setFileDownload(GetTimingSyntheticTaskResponseBodyDataMonitorConfFileDownload fileDownload) {
            this.fileDownload = fileDownload;
            return this;
        }
        public GetTimingSyntheticTaskResponseBodyDataMonitorConfFileDownload getFileDownload() {
            return this.fileDownload;
        }

        public GetTimingSyntheticTaskResponseBodyDataMonitorConf setNetDNS(GetTimingSyntheticTaskResponseBodyDataMonitorConfNetDNS netDNS) {
            this.netDNS = netDNS;
            return this;
        }
        public GetTimingSyntheticTaskResponseBodyDataMonitorConfNetDNS getNetDNS() {
            return this.netDNS;
        }

        public GetTimingSyntheticTaskResponseBodyDataMonitorConf setNetICMP(GetTimingSyntheticTaskResponseBodyDataMonitorConfNetICMP netICMP) {
            this.netICMP = netICMP;
            return this;
        }
        public GetTimingSyntheticTaskResponseBodyDataMonitorConfNetICMP getNetICMP() {
            return this.netICMP;
        }

        public GetTimingSyntheticTaskResponseBodyDataMonitorConf setNetTCP(GetTimingSyntheticTaskResponseBodyDataMonitorConfNetTCP netTCP) {
            this.netTCP = netTCP;
            return this;
        }
        public GetTimingSyntheticTaskResponseBodyDataMonitorConfNetTCP getNetTCP() {
            return this.netTCP;
        }

        public GetTimingSyntheticTaskResponseBodyDataMonitorConf setStream(GetTimingSyntheticTaskResponseBodyDataMonitorConfStream stream) {
            this.stream = stream;
            return this;
        }
        public GetTimingSyntheticTaskResponseBodyDataMonitorConfStream getStream() {
            return this.stream;
        }

        public GetTimingSyntheticTaskResponseBodyDataMonitorConf setWebsite(GetTimingSyntheticTaskResponseBodyDataMonitorConfWebsite website) {
            this.website = website;
            return this;
        }
        public GetTimingSyntheticTaskResponseBodyDataMonitorConfWebsite getWebsite() {
            return this.website;
        }

    }

    public static class GetTimingSyntheticTaskResponseBodyDataMonitors extends TeaModel {
        /**
         * <p>The city code.</p>
         * 
         * <strong>example:</strong>
         * <p>110100</p>
         */
        @NameInMap("CityCode")
        public String cityCode;

        /**
         * <p>The client type of the monitoring point. Valid values: 1: data center. 2: Internet. 3: mobile device. 4: ECS instance.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ClientType")
        public Integer clientType;

        /**
         * <p>The carrier code.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("OperatorCode")
        public String operatorCode;

        public static GetTimingSyntheticTaskResponseBodyDataMonitors build(java.util.Map<String, ?> map) throws Exception {
            GetTimingSyntheticTaskResponseBodyDataMonitors self = new GetTimingSyntheticTaskResponseBodyDataMonitors();
            return TeaModel.build(map, self);
        }

        public GetTimingSyntheticTaskResponseBodyDataMonitors setCityCode(String cityCode) {
            this.cityCode = cityCode;
            return this;
        }
        public String getCityCode() {
            return this.cityCode;
        }

        public GetTimingSyntheticTaskResponseBodyDataMonitors setClientType(Integer clientType) {
            this.clientType = clientType;
            return this;
        }
        public Integer getClientType() {
            return this.clientType;
        }

        public GetTimingSyntheticTaskResponseBodyDataMonitors setOperatorCode(String operatorCode) {
            this.operatorCode = operatorCode;
            return this;
        }
        public String getOperatorCode() {
            return this.operatorCode;
        }

    }

    public static class GetTimingSyntheticTaskResponseBodyDataTags extends TeaModel {
        /**
         * <p>The key of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>user1</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>myweb</p>
         */
        @NameInMap("Value")
        public String value;

        public static GetTimingSyntheticTaskResponseBodyDataTags build(java.util.Map<String, ?> map) throws Exception {
            GetTimingSyntheticTaskResponseBodyDataTags self = new GetTimingSyntheticTaskResponseBodyDataTags();
            return TeaModel.build(map, self);
        }

        public GetTimingSyntheticTaskResponseBodyDataTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public GetTimingSyntheticTaskResponseBodyDataTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

    public static class GetTimingSyntheticTaskResponseBodyData extends TeaModel {
        /**
         * <p>The list of assertions.</p>
         */
        @NameInMap("AvailableAssertions")
        public java.util.List<GetTimingSyntheticTaskResponseBodyDataAvailableAssertions> availableAssertions;

        /**
         * <p>The general settings.</p>
         */
        @NameInMap("CommonSetting")
        public GetTimingSyntheticTaskResponseBodyDataCommonSetting commonSetting;

        /**
         * <p>The custom cycle.</p>
         */
        @NameInMap("CustomPeriod")
        public GetTimingSyntheticTaskResponseBodyDataCustomPeriod customPeriod;

        /**
         * <p>The detection frequency. Valid values: 1m, 5m, 10m, 15m, 20m, 30m, 1h, 2h, 3h, 4h, 6h, 8h, 12h, and 24h.</p>
         * 
         * <strong>example:</strong>
         * <p>5m</p>
         */
        @NameInMap("Frequency")
        public String frequency;

        /**
         * <p>The detection point type. 1: PC. 2: mobile device.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("MonitorCategory")
        public Long monitorCategory;

        /**
         * <p>The monitoring configurations.</p>
         */
        @NameInMap("MonitorConf")
        public GetTimingSyntheticTaskResponseBodyDataMonitorConf monitorConf;

        /**
         * <p>The list of monitoring points.</p>
         */
        @NameInMap("Monitors")
        public java.util.List<GetTimingSyntheticTaskResponseBodyDataMonitors> monitors;

        /**
         * <p>The name of the task.</p>
         * 
         * <strong>example:</strong>
         * <p>AlibabaCloud DNS Task</p>
         */
        @NameInMap("Name")
        public String name;

        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The ID of the resource group.</p>
         * 
         * <strong>example:</strong>
         * <p>default</p>
         */
        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        /**
         * <p>CREATING: The task is being created. RUNNING: The task is running. PARTIAL_RUNNING: The task is partially running. STOP: The task is stopped. LIMIT_STOP: The task is stopped due to quota insufficiency. EXCEPTION: The task is abnormal. DELETE: The task is deleted. DELETE_EXCEPTION: The task failed to be deleted.</p>
         * 
         * <strong>example:</strong>
         * <p>RUNNING</p>
         */
        @NameInMap("Status")
        public String status;

        /**
         * <p>The tag.</p>
         */
        @NameInMap("Tags")
        public java.util.List<GetTimingSyntheticTaskResponseBodyDataTags> tags;

        /**
         * <p>The ID of the synthetic monitoring task.</p>
         * 
         * <strong>example:</strong>
         * <p>5308a2691f59422c8c3b7aeccec9cd3b</p>
         */
        @NameInMap("TaskId")
        public String taskId;

        /**
         * <p>The type of the task. Valid values:</p>
         * <p>ICMP TCP DNS HTTP Website speed measurement File download</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("TaskType")
        public Integer taskType;

        public static GetTimingSyntheticTaskResponseBodyData build(java.util.Map<String, ?> map) throws Exception {
            GetTimingSyntheticTaskResponseBodyData self = new GetTimingSyntheticTaskResponseBodyData();
            return TeaModel.build(map, self);
        }

        public GetTimingSyntheticTaskResponseBodyData setAvailableAssertions(java.util.List<GetTimingSyntheticTaskResponseBodyDataAvailableAssertions> availableAssertions) {
            this.availableAssertions = availableAssertions;
            return this;
        }
        public java.util.List<GetTimingSyntheticTaskResponseBodyDataAvailableAssertions> getAvailableAssertions() {
            return this.availableAssertions;
        }

        public GetTimingSyntheticTaskResponseBodyData setCommonSetting(GetTimingSyntheticTaskResponseBodyDataCommonSetting commonSetting) {
            this.commonSetting = commonSetting;
            return this;
        }
        public GetTimingSyntheticTaskResponseBodyDataCommonSetting getCommonSetting() {
            return this.commonSetting;
        }

        public GetTimingSyntheticTaskResponseBodyData setCustomPeriod(GetTimingSyntheticTaskResponseBodyDataCustomPeriod customPeriod) {
            this.customPeriod = customPeriod;
            return this;
        }
        public GetTimingSyntheticTaskResponseBodyDataCustomPeriod getCustomPeriod() {
            return this.customPeriod;
        }

        public GetTimingSyntheticTaskResponseBodyData setFrequency(String frequency) {
            this.frequency = frequency;
            return this;
        }
        public String getFrequency() {
            return this.frequency;
        }

        public GetTimingSyntheticTaskResponseBodyData setMonitorCategory(Long monitorCategory) {
            this.monitorCategory = monitorCategory;
            return this;
        }
        public Long getMonitorCategory() {
            return this.monitorCategory;
        }

        public GetTimingSyntheticTaskResponseBodyData setMonitorConf(GetTimingSyntheticTaskResponseBodyDataMonitorConf monitorConf) {
            this.monitorConf = monitorConf;
            return this;
        }
        public GetTimingSyntheticTaskResponseBodyDataMonitorConf getMonitorConf() {
            return this.monitorConf;
        }

        public GetTimingSyntheticTaskResponseBodyData setMonitors(java.util.List<GetTimingSyntheticTaskResponseBodyDataMonitors> monitors) {
            this.monitors = monitors;
            return this;
        }
        public java.util.List<GetTimingSyntheticTaskResponseBodyDataMonitors> getMonitors() {
            return this.monitors;
        }

        public GetTimingSyntheticTaskResponseBodyData setName(String name) {
            this.name = name;
            return this;
        }
        public String getName() {
            return this.name;
        }

        public GetTimingSyntheticTaskResponseBodyData setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public GetTimingSyntheticTaskResponseBodyData setResourceGroupId(String resourceGroupId) {
            this.resourceGroupId = resourceGroupId;
            return this;
        }
        public String getResourceGroupId() {
            return this.resourceGroupId;
        }

        public GetTimingSyntheticTaskResponseBodyData setStatus(String status) {
            this.status = status;
            return this;
        }
        public String getStatus() {
            return this.status;
        }

        public GetTimingSyntheticTaskResponseBodyData setTags(java.util.List<GetTimingSyntheticTaskResponseBodyDataTags> tags) {
            this.tags = tags;
            return this;
        }
        public java.util.List<GetTimingSyntheticTaskResponseBodyDataTags> getTags() {
            return this.tags;
        }

        public GetTimingSyntheticTaskResponseBodyData setTaskId(String taskId) {
            this.taskId = taskId;
            return this;
        }
        public String getTaskId() {
            return this.taskId;
        }

        public GetTimingSyntheticTaskResponseBodyData setTaskType(Integer taskType) {
            this.taskType = taskType;
            return this;
        }
        public Integer getTaskType() {
            return this.taskType;
        }

    }

}
