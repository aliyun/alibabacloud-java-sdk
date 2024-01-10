// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class UpdateTimingSyntheticTaskRequest extends TeaModel {
    /**
     * <p>The list of assertions.</p>
     */
    @NameInMap("AvailableAssertions")
    public java.util.List<UpdateTimingSyntheticTaskRequestAvailableAssertions> availableAssertions;

    /**
     * <p>The general settings.</p>
     */
    @NameInMap("CommonSetting")
    public UpdateTimingSyntheticTaskRequestCommonSetting commonSetting;

    /**
     * <p>The custom cycle.</p>
     */
    @NameInMap("CustomPeriod")
    public UpdateTimingSyntheticTaskRequestCustomPeriod customPeriod;

    /**
     * <p>The detection frequency. Valid values: 1m, 5m, 10m, 15m, 20m, 30m, 1h, 2h, 3h, 4h, 6h, 8h, 12h, and 24h.</p>
     */
    @NameInMap("Frequency")
    public String frequency;

    /**
     * <p>The monitoring configurations.</p>
     */
    @NameInMap("MonitorConf")
    public UpdateTimingSyntheticTaskRequestMonitorConf monitorConf;

    /**
     * <p>The list of monitoring points.</p>
     */
    @NameInMap("Monitors")
    public java.util.List<UpdateTimingSyntheticTaskRequestMonitors> monitors;

    /**
     * <p>The name of the task.</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The region ID.</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <p>The resource group ID.</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    /**
     * <p>The list of tags.</p>
     */
    @NameInMap("Tags")
    public java.util.List<UpdateTimingSyntheticTaskRequestTags> tags;

    /**
     * <p>The ID of the synthetic monitoring task.</p>
     */
    @NameInMap("TaskId")
    public String taskId;

    public static UpdateTimingSyntheticTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        UpdateTimingSyntheticTaskRequest self = new UpdateTimingSyntheticTaskRequest();
        return TeaModel.build(map, self);
    }

    public UpdateTimingSyntheticTaskRequest setAvailableAssertions(java.util.List<UpdateTimingSyntheticTaskRequestAvailableAssertions> availableAssertions) {
        this.availableAssertions = availableAssertions;
        return this;
    }
    public java.util.List<UpdateTimingSyntheticTaskRequestAvailableAssertions> getAvailableAssertions() {
        return this.availableAssertions;
    }

    public UpdateTimingSyntheticTaskRequest setCommonSetting(UpdateTimingSyntheticTaskRequestCommonSetting commonSetting) {
        this.commonSetting = commonSetting;
        return this;
    }
    public UpdateTimingSyntheticTaskRequestCommonSetting getCommonSetting() {
        return this.commonSetting;
    }

    public UpdateTimingSyntheticTaskRequest setCustomPeriod(UpdateTimingSyntheticTaskRequestCustomPeriod customPeriod) {
        this.customPeriod = customPeriod;
        return this;
    }
    public UpdateTimingSyntheticTaskRequestCustomPeriod getCustomPeriod() {
        return this.customPeriod;
    }

    public UpdateTimingSyntheticTaskRequest setFrequency(String frequency) {
        this.frequency = frequency;
        return this;
    }
    public String getFrequency() {
        return this.frequency;
    }

    public UpdateTimingSyntheticTaskRequest setMonitorConf(UpdateTimingSyntheticTaskRequestMonitorConf monitorConf) {
        this.monitorConf = monitorConf;
        return this;
    }
    public UpdateTimingSyntheticTaskRequestMonitorConf getMonitorConf() {
        return this.monitorConf;
    }

    public UpdateTimingSyntheticTaskRequest setMonitors(java.util.List<UpdateTimingSyntheticTaskRequestMonitors> monitors) {
        this.monitors = monitors;
        return this;
    }
    public java.util.List<UpdateTimingSyntheticTaskRequestMonitors> getMonitors() {
        return this.monitors;
    }

    public UpdateTimingSyntheticTaskRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public UpdateTimingSyntheticTaskRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public UpdateTimingSyntheticTaskRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public UpdateTimingSyntheticTaskRequest setTags(java.util.List<UpdateTimingSyntheticTaskRequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<UpdateTimingSyntheticTaskRequestTags> getTags() {
        return this.tags;
    }

    public UpdateTimingSyntheticTaskRequest setTaskId(String taskId) {
        this.taskId = taskId;
        return this;
    }
    public String getTaskId() {
        return this.taskId;
    }

    public static class UpdateTimingSyntheticTaskRequestAvailableAssertions extends TeaModel {
        /**
         * <p>The expected value.</p>
         */
        @NameInMap("Expect")
        public String expect;

        /**
         * <p>The condition. gt: greater than. gte: greater than or equal to. lt: less than. lte: less than or equal to. eq: equal to. neq: not equal to. ctn: contain. nctn: does not contain. exist: exist. n_exist: does not exist. belong: belong to. n_belong: does not belong to. reg_match: regular expression.</p>
         */
        @NameInMap("Operator")
        public String operator;

        /**
         * <p>The check target. If you set the type parameter to HttpResCode, HttpResBody, or HttpResponseTime, you do not need to set the target parameter. If you set the type parameter to HttpResHead, you must specify the key in the header. If you set the type parameter to HttpResBodyJson, use jsonPath.</p>
         */
        @NameInMap("Target")
        public String target;

        /**
         * <p>The assertion type. Valid values: HttpResCode, HttpResHead, HttpResBody, HttpResBodyJson, HttpResponseTime, IcmpPackLoss (packet loss rate), IcmpPackMaxLatency (maximum packet latency), IcmpPackAvgLatency (average packet latency), TraceRouteHops (number of hops), DnsARecord (A record), DnsCName (CNAME), websiteTTFB (time to first packet), websiteTTLB (time to last packet), websiteFST (first paint time), websiteFFST (first meaningful paint), websiteOnload (full loaded time). For more information, see the following description.</p>
         */
        @NameInMap("Type")
        public String type;

        public static UpdateTimingSyntheticTaskRequestAvailableAssertions build(java.util.Map<String, ?> map) throws Exception {
            UpdateTimingSyntheticTaskRequestAvailableAssertions self = new UpdateTimingSyntheticTaskRequestAvailableAssertions();
            return TeaModel.build(map, self);
        }

        public UpdateTimingSyntheticTaskRequestAvailableAssertions setExpect(String expect) {
            this.expect = expect;
            return this;
        }
        public String getExpect() {
            return this.expect;
        }

        public UpdateTimingSyntheticTaskRequestAvailableAssertions setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public UpdateTimingSyntheticTaskRequestAvailableAssertions setTarget(String target) {
            this.target = target;
            return this;
        }
        public String getTarget() {
            return this.target;
        }

        public UpdateTimingSyntheticTaskRequestAvailableAssertions setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class UpdateTimingSyntheticTaskRequestCommonSettingCustomHostHosts extends TeaModel {
        /**
         * <p>The domain name.</p>
         */
        @NameInMap("Domain")
        public String domain;

        /**
         * <p>The IP version. Valid values:</p>
         * <br>
         * <p>*   0: A version is automatically selected.</p>
         * <p>*   1: IPv4</p>
         * <p>*   2: IPv6</p>
         */
        @NameInMap("IpType")
        public Integer ipType;

        /**
         * <p>The list of IP addresses.</p>
         */
        @NameInMap("Ips")
        public java.util.List<String> ips;

        public static UpdateTimingSyntheticTaskRequestCommonSettingCustomHostHosts build(java.util.Map<String, ?> map) throws Exception {
            UpdateTimingSyntheticTaskRequestCommonSettingCustomHostHosts self = new UpdateTimingSyntheticTaskRequestCommonSettingCustomHostHosts();
            return TeaModel.build(map, self);
        }

        public UpdateTimingSyntheticTaskRequestCommonSettingCustomHostHosts setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public UpdateTimingSyntheticTaskRequestCommonSettingCustomHostHosts setIpType(Integer ipType) {
            this.ipType = ipType;
            return this;
        }
        public Integer getIpType() {
            return this.ipType;
        }

        public UpdateTimingSyntheticTaskRequestCommonSettingCustomHostHosts setIps(java.util.List<String> ips) {
            this.ips = ips;
            return this;
        }
        public java.util.List<String> getIps() {
            return this.ips;
        }

    }

    public static class UpdateTimingSyntheticTaskRequestCommonSettingCustomHost extends TeaModel {
        /**
         * <p>The list of hosts.</p>
         */
        @NameInMap("Hosts")
        public java.util.List<UpdateTimingSyntheticTaskRequestCommonSettingCustomHostHosts> hosts;

        /**
         * <p>The selection mode. 0: Random. 1: Polling.</p>
         */
        @NameInMap("SelectType")
        public Integer selectType;

        public static UpdateTimingSyntheticTaskRequestCommonSettingCustomHost build(java.util.Map<String, ?> map) throws Exception {
            UpdateTimingSyntheticTaskRequestCommonSettingCustomHost self = new UpdateTimingSyntheticTaskRequestCommonSettingCustomHost();
            return TeaModel.build(map, self);
        }

        public UpdateTimingSyntheticTaskRequestCommonSettingCustomHost setHosts(java.util.List<UpdateTimingSyntheticTaskRequestCommonSettingCustomHostHosts> hosts) {
            this.hosts = hosts;
            return this;
        }
        public java.util.List<UpdateTimingSyntheticTaskRequestCommonSettingCustomHostHosts> getHosts() {
            return this.hosts;
        }

        public UpdateTimingSyntheticTaskRequestCommonSettingCustomHost setSelectType(Integer selectType) {
            this.selectType = selectType;
            return this;
        }
        public Integer getSelectType() {
            return this.selectType;
        }

    }

    public static class UpdateTimingSyntheticTaskRequestCommonSetting extends TeaModel {
        /**
         * <p>The custom host.</p>
         */
        @NameInMap("CustomHost")
        public UpdateTimingSyntheticTaskRequestCommonSettingCustomHost customHost;

        /**
         * <p>The IP version. Valid values:</p>
         * <br>
         * <p>*   0: A version is automatically selected.</p>
         * <p>*   1: IPv4</p>
         * <p>*   2: IPv6</p>
         */
        @NameInMap("IpType")
        public Integer ipType;

        /**
         * <p>是否开启链路追踪。</p>
         */
        @NameInMap("IsOpenTrace")
        public Boolean isOpenTrace;

        /**
         * <p>Specifies whether to evenly distribute monitoring samples. Valid values:</p>
         * <br>
         * <p>*   0: No</p>
         * <p>*   1: Yes</p>
         */
        @NameInMap("MonitorSamples")
        public Integer monitorSamples;

        /**
         * <p>链路追踪客户端类型：</p>
         * <br>
         * <p>- 0：ARMS Agent</p>
         * <p>- 1：OpenTelemetry</p>
         * <p>- 2：Jaeger</p>
         */
        @NameInMap("TraceClientType")
        public Integer traceClientType;

        /**
         * <p>链路数据上报region。</p>
         */
        @NameInMap("XtraceRegion")
        public String xtraceRegion;

        public static UpdateTimingSyntheticTaskRequestCommonSetting build(java.util.Map<String, ?> map) throws Exception {
            UpdateTimingSyntheticTaskRequestCommonSetting self = new UpdateTimingSyntheticTaskRequestCommonSetting();
            return TeaModel.build(map, self);
        }

        public UpdateTimingSyntheticTaskRequestCommonSetting setCustomHost(UpdateTimingSyntheticTaskRequestCommonSettingCustomHost customHost) {
            this.customHost = customHost;
            return this;
        }
        public UpdateTimingSyntheticTaskRequestCommonSettingCustomHost getCustomHost() {
            return this.customHost;
        }

        public UpdateTimingSyntheticTaskRequestCommonSetting setIpType(Integer ipType) {
            this.ipType = ipType;
            return this;
        }
        public Integer getIpType() {
            return this.ipType;
        }

        public UpdateTimingSyntheticTaskRequestCommonSetting setIsOpenTrace(Boolean isOpenTrace) {
            this.isOpenTrace = isOpenTrace;
            return this;
        }
        public Boolean getIsOpenTrace() {
            return this.isOpenTrace;
        }

        public UpdateTimingSyntheticTaskRequestCommonSetting setMonitorSamples(Integer monitorSamples) {
            this.monitorSamples = monitorSamples;
            return this;
        }
        public Integer getMonitorSamples() {
            return this.monitorSamples;
        }

        public UpdateTimingSyntheticTaskRequestCommonSetting setTraceClientType(Integer traceClientType) {
            this.traceClientType = traceClientType;
            return this;
        }
        public Integer getTraceClientType() {
            return this.traceClientType;
        }

        public UpdateTimingSyntheticTaskRequestCommonSetting setXtraceRegion(String xtraceRegion) {
            this.xtraceRegion = xtraceRegion;
            return this;
        }
        public String getXtraceRegion() {
            return this.xtraceRegion;
        }

    }

    public static class UpdateTimingSyntheticTaskRequestCustomPeriod extends TeaModel {
        /**
         * <p>The hour at which the test ends. Valid values: 0 to 24.</p>
         */
        @NameInMap("EndHour")
        public Integer endHour;

        /**
         * <p>The hour at which the test starts. Valid values: 0 to 24.</p>
         */
        @NameInMap("StartHour")
        public Integer startHour;

        public static UpdateTimingSyntheticTaskRequestCustomPeriod build(java.util.Map<String, ?> map) throws Exception {
            UpdateTimingSyntheticTaskRequestCustomPeriod self = new UpdateTimingSyntheticTaskRequestCustomPeriod();
            return TeaModel.build(map, self);
        }

        public UpdateTimingSyntheticTaskRequestCustomPeriod setEndHour(Integer endHour) {
            this.endHour = endHour;
            return this;
        }
        public Integer getEndHour() {
            return this.endHour;
        }

        public UpdateTimingSyntheticTaskRequestCustomPeriod setStartHour(Integer startHour) {
            this.startHour = startHour;
            return this;
        }
        public Integer getStartHour() {
            return this.startHour;
        }

    }

    public static class UpdateTimingSyntheticTaskRequestMonitorConfApiHTTPRequestBody extends TeaModel {
        /**
         * <p>The content of the request body. Format: JSON string. The parameter is required if the type parameter is set to text/plain, application/json, application/xml, or text/html. Format: JSON string.</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The type of the request body. Valid values: text/plain, application/json, application/x-www-form-urlencoded, multipart/form-data, application/xml, and text/html.</p>
         */
        @NameInMap("Type")
        public String type;

        public static UpdateTimingSyntheticTaskRequestMonitorConfApiHTTPRequestBody build(java.util.Map<String, ?> map) throws Exception {
            UpdateTimingSyntheticTaskRequestMonitorConfApiHTTPRequestBody self = new UpdateTimingSyntheticTaskRequestMonitorConfApiHTTPRequestBody();
            return TeaModel.build(map, self);
        }

        public UpdateTimingSyntheticTaskRequestMonitorConfApiHTTPRequestBody setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public UpdateTimingSyntheticTaskRequestMonitorConfApiHTTPRequestBody setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class UpdateTimingSyntheticTaskRequestMonitorConfApiHTTP extends TeaModel {
        /**
         * <p>The connection timeout period. Unit: milliseconds. Default value: 5000. Minimum value: 1000. Maximum value: 300000.</p>
         */
        @NameInMap("ConnectTimeout")
        public Long connectTimeout;

        /**
         * <p>The request method.</p>
         * <br>
         * <p>*   POST</p>
         * <p>*   GET</p>
         */
        @NameInMap("Method")
        public String method;

        /**
         * <p>The HTTP request body.</p>
         */
        @NameInMap("RequestBody")
        public UpdateTimingSyntheticTaskRequestMonitorConfApiHTTPRequestBody requestBody;

        /**
         * <p>The custom header field.</p>
         */
        @NameInMap("RequestHeaders")
        public java.util.Map<String, String> requestHeaders;

        /**
         * <p>The URL or request path for synthetic monitoring.</p>
         */
        @NameInMap("TargetUrl")
        public String targetUrl;

        /**
         * <p>The timeout period. Unit: milliseconds. Default value: 10000. Minimum value: 1000. Maximum value: 300000.</p>
         */
        @NameInMap("Timeout")
        public Long timeout;

        public static UpdateTimingSyntheticTaskRequestMonitorConfApiHTTP build(java.util.Map<String, ?> map) throws Exception {
            UpdateTimingSyntheticTaskRequestMonitorConfApiHTTP self = new UpdateTimingSyntheticTaskRequestMonitorConfApiHTTP();
            return TeaModel.build(map, self);
        }

        public UpdateTimingSyntheticTaskRequestMonitorConfApiHTTP setConnectTimeout(Long connectTimeout) {
            this.connectTimeout = connectTimeout;
            return this;
        }
        public Long getConnectTimeout() {
            return this.connectTimeout;
        }

        public UpdateTimingSyntheticTaskRequestMonitorConfApiHTTP setMethod(String method) {
            this.method = method;
            return this;
        }
        public String getMethod() {
            return this.method;
        }

        public UpdateTimingSyntheticTaskRequestMonitorConfApiHTTP setRequestBody(UpdateTimingSyntheticTaskRequestMonitorConfApiHTTPRequestBody requestBody) {
            this.requestBody = requestBody;
            return this;
        }
        public UpdateTimingSyntheticTaskRequestMonitorConfApiHTTPRequestBody getRequestBody() {
            return this.requestBody;
        }

        public UpdateTimingSyntheticTaskRequestMonitorConfApiHTTP setRequestHeaders(java.util.Map<String, String> requestHeaders) {
            this.requestHeaders = requestHeaders;
            return this;
        }
        public java.util.Map<String, String> getRequestHeaders() {
            return this.requestHeaders;
        }

        public UpdateTimingSyntheticTaskRequestMonitorConfApiHTTP setTargetUrl(String targetUrl) {
            this.targetUrl = targetUrl;
            return this;
        }
        public String getTargetUrl() {
            return this.targetUrl;
        }

        public UpdateTimingSyntheticTaskRequestMonitorConfApiHTTP setTimeout(Long timeout) {
            this.timeout = timeout;
            return this;
        }
        public Long getTimeout() {
            return this.timeout;
        }

    }

    public static class UpdateTimingSyntheticTaskRequestMonitorConfFileDownload extends TeaModel {
        /**
         * <p>The connection timeout period. Unit: milliseconds. Minimum value: 1000. Maximum value: 120000. Default value: 5000.</p>
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
         * <br>
         * <p>*   1: curl</p>
         * <p>*   0: WinInet</p>
         */
        @NameInMap("DownloadKernel")
        public Integer downloadKernel;

        /**
         * <p>Specifies whether to ignore CA certificate authentication errors. 0: No. 1: Yes. Default value: 1.</p>
         */
        @NameInMap("IgnoreCertificateAuthError")
        public Integer ignoreCertificateAuthError;

        /**
         * <p>Specifies whether to ignore certificate revocation errors. 0: No. 1: Yes. Default value: 1.</p>
         */
        @NameInMap("IgnoreCertificateCanceledError")
        public Integer ignoreCertificateCanceledError;

        /**
         * <p>Specifies whether to ignore certificate invalidity. 0: No. 1: Yes. Default value: 1.</p>
         */
        @NameInMap("IgnoreCertificateOutOfDateError")
        public Integer ignoreCertificateOutOfDateError;

        /**
         * <p>Specifies whether to ignore certificate status errors. 0: No. 1: Yes. Default value: 1.</p>
         */
        @NameInMap("IgnoreCertificateStatusError")
        public Integer ignoreCertificateStatusError;

        /**
         * <p>Specifies whether to ignore certificate incredibility. 0: No. 1: Yes. Default value: 1.</p>
         */
        @NameInMap("IgnoreCertificateUntrustworthyError")
        public Integer ignoreCertificateUntrustworthyError;

        /**
         * <p>Specifies whether to ignore certificate usage errors. 0: No. 1: Yes. Default value: 1.</p>
         */
        @NameInMap("IgnoreCertificateUsingError")
        public Integer ignoreCertificateUsingError;

        /**
         * <p>Specifies whether to ignore host invalidity. 0: No. 1: Yes. Default value: 1.</p>
         */
        @NameInMap("IgnoreInvalidHostError")
        public Integer ignoreInvalidHostError;

        /**
         * <p>The monitoring timeout period. Unit: milliseconds. Minimum value: 1000. Maximum value: 120000. Default value: 60000.</p>
         */
        @NameInMap("MonitorTimeout")
        public Long monitorTimeout;

        /**
         * <p>The QUIC protocol type.</p>
         * <br>
         * <p>*   1: http1</p>
         * <p>*   2: http2</p>
         * <p>*   3: http3</p>
         */
        @NameInMap("QuickProtocol")
        public Integer quickProtocol;

        /**
         * <p>Specifies whether to support redirection. 0: No. 1: Yes. Default value: 1.</p>
         */
        @NameInMap("Redirection")
        public Integer redirection;

        /**
         * <p>The file download URL.</p>
         */
        @NameInMap("TargetUrl")
        public String targetUrl;

        /**
         * <p>The maximum file size of a single transfer. Unit: KB. Minimum value: 1. Maximum value: 20480. Valid values: 2048.</p>
         */
        @NameInMap("TransmissionSize")
        public Long transmissionSize;

        /**
         * <p>验证关键词。</p>
         */
        @NameInMap("ValidateKeywords")
        public String validateKeywords;

        /**
         * <p>验证方式。</p>
         * <br>
         * <p>- 0：不验证 </p>
         * <p>- 1：验证字符串 </p>
         * <p>- 2：MD5验证</p>
         */
        @NameInMap("VerifyWay")
        public Integer verifyWay;

        /**
         * <p>DNS劫持白名单。匹配规则支持IP、IP通配符、子网掩码和CNAME，可以填写多个匹配规则，多个匹配规则以竖线（|）隔开。例如：www.aliyun.com:203.0.3.55|203.3.44.67，表示www.aliyun.com域名下除203.0.3.55和203.3.44.67之外的其他IP都是被劫持的。</p>
         */
        @NameInMap("WhiteList")
        public String whiteList;

        public static UpdateTimingSyntheticTaskRequestMonitorConfFileDownload build(java.util.Map<String, ?> map) throws Exception {
            UpdateTimingSyntheticTaskRequestMonitorConfFileDownload self = new UpdateTimingSyntheticTaskRequestMonitorConfFileDownload();
            return TeaModel.build(map, self);
        }

        public UpdateTimingSyntheticTaskRequestMonitorConfFileDownload setConnectionTimeout(Long connectionTimeout) {
            this.connectionTimeout = connectionTimeout;
            return this;
        }
        public Long getConnectionTimeout() {
            return this.connectionTimeout;
        }

        public UpdateTimingSyntheticTaskRequestMonitorConfFileDownload setCustomHeaderContent(java.util.Map<String, String> customHeaderContent) {
            this.customHeaderContent = customHeaderContent;
            return this;
        }
        public java.util.Map<String, String> getCustomHeaderContent() {
            return this.customHeaderContent;
        }

        public UpdateTimingSyntheticTaskRequestMonitorConfFileDownload setDownloadKernel(Integer downloadKernel) {
            this.downloadKernel = downloadKernel;
            return this;
        }
        public Integer getDownloadKernel() {
            return this.downloadKernel;
        }

        public UpdateTimingSyntheticTaskRequestMonitorConfFileDownload setIgnoreCertificateAuthError(Integer ignoreCertificateAuthError) {
            this.ignoreCertificateAuthError = ignoreCertificateAuthError;
            return this;
        }
        public Integer getIgnoreCertificateAuthError() {
            return this.ignoreCertificateAuthError;
        }

        public UpdateTimingSyntheticTaskRequestMonitorConfFileDownload setIgnoreCertificateCanceledError(Integer ignoreCertificateCanceledError) {
            this.ignoreCertificateCanceledError = ignoreCertificateCanceledError;
            return this;
        }
        public Integer getIgnoreCertificateCanceledError() {
            return this.ignoreCertificateCanceledError;
        }

        public UpdateTimingSyntheticTaskRequestMonitorConfFileDownload setIgnoreCertificateOutOfDateError(Integer ignoreCertificateOutOfDateError) {
            this.ignoreCertificateOutOfDateError = ignoreCertificateOutOfDateError;
            return this;
        }
        public Integer getIgnoreCertificateOutOfDateError() {
            return this.ignoreCertificateOutOfDateError;
        }

        public UpdateTimingSyntheticTaskRequestMonitorConfFileDownload setIgnoreCertificateStatusError(Integer ignoreCertificateStatusError) {
            this.ignoreCertificateStatusError = ignoreCertificateStatusError;
            return this;
        }
        public Integer getIgnoreCertificateStatusError() {
            return this.ignoreCertificateStatusError;
        }

        public UpdateTimingSyntheticTaskRequestMonitorConfFileDownload setIgnoreCertificateUntrustworthyError(Integer ignoreCertificateUntrustworthyError) {
            this.ignoreCertificateUntrustworthyError = ignoreCertificateUntrustworthyError;
            return this;
        }
        public Integer getIgnoreCertificateUntrustworthyError() {
            return this.ignoreCertificateUntrustworthyError;
        }

        public UpdateTimingSyntheticTaskRequestMonitorConfFileDownload setIgnoreCertificateUsingError(Integer ignoreCertificateUsingError) {
            this.ignoreCertificateUsingError = ignoreCertificateUsingError;
            return this;
        }
        public Integer getIgnoreCertificateUsingError() {
            return this.ignoreCertificateUsingError;
        }

        public UpdateTimingSyntheticTaskRequestMonitorConfFileDownload setIgnoreInvalidHostError(Integer ignoreInvalidHostError) {
            this.ignoreInvalidHostError = ignoreInvalidHostError;
            return this;
        }
        public Integer getIgnoreInvalidHostError() {
            return this.ignoreInvalidHostError;
        }

        public UpdateTimingSyntheticTaskRequestMonitorConfFileDownload setMonitorTimeout(Long monitorTimeout) {
            this.monitorTimeout = monitorTimeout;
            return this;
        }
        public Long getMonitorTimeout() {
            return this.monitorTimeout;
        }

        public UpdateTimingSyntheticTaskRequestMonitorConfFileDownload setQuickProtocol(Integer quickProtocol) {
            this.quickProtocol = quickProtocol;
            return this;
        }
        public Integer getQuickProtocol() {
            return this.quickProtocol;
        }

        public UpdateTimingSyntheticTaskRequestMonitorConfFileDownload setRedirection(Integer redirection) {
            this.redirection = redirection;
            return this;
        }
        public Integer getRedirection() {
            return this.redirection;
        }

        public UpdateTimingSyntheticTaskRequestMonitorConfFileDownload setTargetUrl(String targetUrl) {
            this.targetUrl = targetUrl;
            return this;
        }
        public String getTargetUrl() {
            return this.targetUrl;
        }

        public UpdateTimingSyntheticTaskRequestMonitorConfFileDownload setTransmissionSize(Long transmissionSize) {
            this.transmissionSize = transmissionSize;
            return this;
        }
        public Long getTransmissionSize() {
            return this.transmissionSize;
        }

        public UpdateTimingSyntheticTaskRequestMonitorConfFileDownload setValidateKeywords(String validateKeywords) {
            this.validateKeywords = validateKeywords;
            return this;
        }
        public String getValidateKeywords() {
            return this.validateKeywords;
        }

        public UpdateTimingSyntheticTaskRequestMonitorConfFileDownload setVerifyWay(Integer verifyWay) {
            this.verifyWay = verifyWay;
            return this;
        }
        public Integer getVerifyWay() {
            return this.verifyWay;
        }

        public UpdateTimingSyntheticTaskRequestMonitorConfFileDownload setWhiteList(String whiteList) {
            this.whiteList = whiteList;
            return this;
        }
        public String getWhiteList() {
            return this.whiteList;
        }

    }

    public static class UpdateTimingSyntheticTaskRequestMonitorConfNetDNS extends TeaModel {
        /**
         * <p>Specifies whether to use dig to display the data. 0: No. 1: Yes.</p>
         */
        @NameInMap("Dig")
        public Integer dig;

        /**
         * <p>The IP version of the DNS server. 0: IPv4. 1: IPv6. 2: A version is automatically selected. Default value: 0.</p>
         */
        @NameInMap("DnsServerIpType")
        public Integer dnsServerIpType;

        /**
         * <p>The IP address of the DNS server. Default value: 114.114.114.114.</p>
         */
        @NameInMap("NsServer")
        public String nsServer;

        /**
         * <p>The DNS query. 0: recursive, 1: iterative. Default value: 0.</p>
         */
        @NameInMap("QueryMethod")
        public Integer queryMethod;

        /**
         * <p>The destination domain name.</p>
         */
        @NameInMap("TargetUrl")
        public String targetUrl;

        /**
         * <p>The timeout period for the DNS synthetic test. Unit: milliseconds. The minimum value is 1000 and the maximum value is 45000. Default value: 5000.</p>
         */
        @NameInMap("Timeout")
        public Long timeout;

        public static UpdateTimingSyntheticTaskRequestMonitorConfNetDNS build(java.util.Map<String, ?> map) throws Exception {
            UpdateTimingSyntheticTaskRequestMonitorConfNetDNS self = new UpdateTimingSyntheticTaskRequestMonitorConfNetDNS();
            return TeaModel.build(map, self);
        }

        public UpdateTimingSyntheticTaskRequestMonitorConfNetDNS setDig(Integer dig) {
            this.dig = dig;
            return this;
        }
        public Integer getDig() {
            return this.dig;
        }

        public UpdateTimingSyntheticTaskRequestMonitorConfNetDNS setDnsServerIpType(Integer dnsServerIpType) {
            this.dnsServerIpType = dnsServerIpType;
            return this;
        }
        public Integer getDnsServerIpType() {
            return this.dnsServerIpType;
        }

        public UpdateTimingSyntheticTaskRequestMonitorConfNetDNS setNsServer(String nsServer) {
            this.nsServer = nsServer;
            return this;
        }
        public String getNsServer() {
            return this.nsServer;
        }

        public UpdateTimingSyntheticTaskRequestMonitorConfNetDNS setQueryMethod(Integer queryMethod) {
            this.queryMethod = queryMethod;
            return this;
        }
        public Integer getQueryMethod() {
            return this.queryMethod;
        }

        public UpdateTimingSyntheticTaskRequestMonitorConfNetDNS setTargetUrl(String targetUrl) {
            this.targetUrl = targetUrl;
            return this;
        }
        public String getTargetUrl() {
            return this.targetUrl;
        }

        public UpdateTimingSyntheticTaskRequestMonitorConfNetDNS setTimeout(Long timeout) {
            this.timeout = timeout;
            return this;
        }
        public Long getTimeout() {
            return this.timeout;
        }

    }

    public static class UpdateTimingSyntheticTaskRequestMonitorConfNetICMP extends TeaModel {
        /**
         * <p>The interval at which ICMP packets are sent. Unit: milliseconds. Minimum value: 200. Maximum value: 10000.</p>
         */
        @NameInMap("Interval")
        public Long interval;

        /**
         * <p>The number of ICMP packets that are sent. Minimum value: 1. Maximum value: 50. Default value: 4.</p>
         */
        @NameInMap("PackageNum")
        public Integer packageNum;

        /**
         * <p>The size of each ICMP packet. Unit: bytes. Valid values: 32, 64, 128, 256, 512, 1024.</p>
         */
        @NameInMap("PackageSize")
        public Integer packageSize;

        /**
         * <p>Specifies whether to split ICMP packets. Default value: true.</p>
         */
        @NameInMap("SplitPackage")
        public Boolean splitPackage;

        /**
         * <p>The destination host IP address or domain name. Port numbers, protocol headers, or request paths are not supported.</p>
         */
        @NameInMap("TargetUrl")
        public String targetUrl;

        /**
         * <p>The timeout period for the TCP synthetic test. Unit: milliseconds. Minimum value: 1000. Maximum value: 300000. Default value: 20000.</p>
         */
        @NameInMap("Timeout")
        public Long timeout;

        /**
         * <p>Specifies whether to enable the tracert command. Default value: true.</p>
         */
        @NameInMap("TracertEnable")
        public Boolean tracertEnable;

        /**
         * <p>The maximum number of hops for tracert. Minimum value: 1. Maximum value: 128. Default value: 64.</p>
         */
        @NameInMap("TracertNumMax")
        public Integer tracertNumMax;

        /**
         * <p>The timeout period of tracert. Unit: milliseconds. Minimum value: 1000. Maximum value: 300000. Default value: 60000.</p>
         */
        @NameInMap("TracertTimeout")
        public Long tracertTimeout;

        public static UpdateTimingSyntheticTaskRequestMonitorConfNetICMP build(java.util.Map<String, ?> map) throws Exception {
            UpdateTimingSyntheticTaskRequestMonitorConfNetICMP self = new UpdateTimingSyntheticTaskRequestMonitorConfNetICMP();
            return TeaModel.build(map, self);
        }

        public UpdateTimingSyntheticTaskRequestMonitorConfNetICMP setInterval(Long interval) {
            this.interval = interval;
            return this;
        }
        public Long getInterval() {
            return this.interval;
        }

        public UpdateTimingSyntheticTaskRequestMonitorConfNetICMP setPackageNum(Integer packageNum) {
            this.packageNum = packageNum;
            return this;
        }
        public Integer getPackageNum() {
            return this.packageNum;
        }

        public UpdateTimingSyntheticTaskRequestMonitorConfNetICMP setPackageSize(Integer packageSize) {
            this.packageSize = packageSize;
            return this;
        }
        public Integer getPackageSize() {
            return this.packageSize;
        }

        public UpdateTimingSyntheticTaskRequestMonitorConfNetICMP setSplitPackage(Boolean splitPackage) {
            this.splitPackage = splitPackage;
            return this;
        }
        public Boolean getSplitPackage() {
            return this.splitPackage;
        }

        public UpdateTimingSyntheticTaskRequestMonitorConfNetICMP setTargetUrl(String targetUrl) {
            this.targetUrl = targetUrl;
            return this;
        }
        public String getTargetUrl() {
            return this.targetUrl;
        }

        public UpdateTimingSyntheticTaskRequestMonitorConfNetICMP setTimeout(Long timeout) {
            this.timeout = timeout;
            return this;
        }
        public Long getTimeout() {
            return this.timeout;
        }

        public UpdateTimingSyntheticTaskRequestMonitorConfNetICMP setTracertEnable(Boolean tracertEnable) {
            this.tracertEnable = tracertEnable;
            return this;
        }
        public Boolean getTracertEnable() {
            return this.tracertEnable;
        }

        public UpdateTimingSyntheticTaskRequestMonitorConfNetICMP setTracertNumMax(Integer tracertNumMax) {
            this.tracertNumMax = tracertNumMax;
            return this;
        }
        public Integer getTracertNumMax() {
            return this.tracertNumMax;
        }

        public UpdateTimingSyntheticTaskRequestMonitorConfNetICMP setTracertTimeout(Long tracertTimeout) {
            this.tracertTimeout = tracertTimeout;
            return this;
        }
        public Long getTracertTimeout() {
            return this.tracertTimeout;
        }

    }

    public static class UpdateTimingSyntheticTaskRequestMonitorConfNetTCP extends TeaModel {
        /**
         * <p>The number of TCP connections that are established in a test. Minimum value: 1. Maximum value: 16. Default value: 4.</p>
         */
        @NameInMap("ConnectTimes")
        public Integer connectTimes;

        /**
         * <p>The interval at which TCP connections are established. Unit: milliseconds. Minimum value: 200. Maximum value: 10000. Default value: 200.</p>
         */
        @NameInMap("Interval")
        public Long interval;

        /**
         * <p>The destination host IP address.</p>
         */
        @NameInMap("TargetUrl")
        public String targetUrl;

        /**
         * <p>The timeout period for the TCP synthetic test. Unit: milliseconds. Minimum value: 1000. Maximum value: 300000. Default value: 20000.</p>
         */
        @NameInMap("Timeout")
        public Long timeout;

        /**
         * <p>Specifies whether to enable the tracert command. Default value: true.</p>
         */
        @NameInMap("TracertEnable")
        public Boolean tracertEnable;

        /**
         * <p>The maximum number of hops for tracert. Minimum value: 1. Maximum value: 128. Default value: 20.</p>
         */
        @NameInMap("TracertNumMax")
        public Integer tracertNumMax;

        /**
         * <p>The timeout period of tracert. Unit: milliseconds. Minimum value: 1000. Maximum value: 300000. Default value: 60000.</p>
         */
        @NameInMap("TracertTimeout")
        public Long tracertTimeout;

        public static UpdateTimingSyntheticTaskRequestMonitorConfNetTCP build(java.util.Map<String, ?> map) throws Exception {
            UpdateTimingSyntheticTaskRequestMonitorConfNetTCP self = new UpdateTimingSyntheticTaskRequestMonitorConfNetTCP();
            return TeaModel.build(map, self);
        }

        public UpdateTimingSyntheticTaskRequestMonitorConfNetTCP setConnectTimes(Integer connectTimes) {
            this.connectTimes = connectTimes;
            return this;
        }
        public Integer getConnectTimes() {
            return this.connectTimes;
        }

        public UpdateTimingSyntheticTaskRequestMonitorConfNetTCP setInterval(Long interval) {
            this.interval = interval;
            return this;
        }
        public Long getInterval() {
            return this.interval;
        }

        public UpdateTimingSyntheticTaskRequestMonitorConfNetTCP setTargetUrl(String targetUrl) {
            this.targetUrl = targetUrl;
            return this;
        }
        public String getTargetUrl() {
            return this.targetUrl;
        }

        public UpdateTimingSyntheticTaskRequestMonitorConfNetTCP setTimeout(Long timeout) {
            this.timeout = timeout;
            return this;
        }
        public Long getTimeout() {
            return this.timeout;
        }

        public UpdateTimingSyntheticTaskRequestMonitorConfNetTCP setTracertEnable(Boolean tracertEnable) {
            this.tracertEnable = tracertEnable;
            return this;
        }
        public Boolean getTracertEnable() {
            return this.tracertEnable;
        }

        public UpdateTimingSyntheticTaskRequestMonitorConfNetTCP setTracertNumMax(Integer tracertNumMax) {
            this.tracertNumMax = tracertNumMax;
            return this;
        }
        public Integer getTracertNumMax() {
            return this.tracertNumMax;
        }

        public UpdateTimingSyntheticTaskRequestMonitorConfNetTCP setTracertTimeout(Long tracertTimeout) {
            this.tracertTimeout = tracertTimeout;
            return this;
        }
        public Long getTracertTimeout() {
            return this.tracertTimeout;
        }

    }

    public static class UpdateTimingSyntheticTaskRequestMonitorConfStream extends TeaModel {
        /**
         * <p>自定义header，JSON Map格式。</p>
         */
        @NameInMap("CustomHeaderContent")
        public java.util.Map<String, String> customHeaderContent;

        /**
         * <p>播放器，不传默认12。</p>
         * <br>
         * <p>- 12：VLC</p>
         * <p>- 2：FlashPlayer</p>
         */
        @NameInMap("PlayerType")
        public Integer playerType;

        /**
         * <p>资源地址类型：</p>
         * <br>
         * <p>- 1：资源地址。</p>
         * <p>- 0：页面地址。不传默认0。</p>
         */
        @NameInMap("StreamAddressType")
        public Integer streamAddressType;

        /**
         * <p>监测时长，单位秒，最长支持60s，不传默认60。</p>
         */
        @NameInMap("StreamMonitorTimeout")
        public Integer streamMonitorTimeout;

        /**
         * <p>音视频标志：0-视频，1-音频。</p>
         */
        @NameInMap("StreamType")
        public Integer streamType;

        /**
         * <p>流媒体地址。</p>
         */
        @NameInMap("TargetUrl")
        public String targetUrl;

        /**
         * <p>DNS劫持白名单。匹配规则支持IP、IP通配符、子网掩码和CNAME，可以填写多个匹配规则，多个匹配规则以竖线（|）隔开。例如：www.aliyun.com:203.0.3.55|203.3.44.67，表示www.aliyun.com域名下除203.0.3.55和203.3.44.67之外的其他IP都是被劫持的。</p>
         */
        @NameInMap("WhiteList")
        public String whiteList;

        public static UpdateTimingSyntheticTaskRequestMonitorConfStream build(java.util.Map<String, ?> map) throws Exception {
            UpdateTimingSyntheticTaskRequestMonitorConfStream self = new UpdateTimingSyntheticTaskRequestMonitorConfStream();
            return TeaModel.build(map, self);
        }

        public UpdateTimingSyntheticTaskRequestMonitorConfStream setCustomHeaderContent(java.util.Map<String, String> customHeaderContent) {
            this.customHeaderContent = customHeaderContent;
            return this;
        }
        public java.util.Map<String, String> getCustomHeaderContent() {
            return this.customHeaderContent;
        }

        public UpdateTimingSyntheticTaskRequestMonitorConfStream setPlayerType(Integer playerType) {
            this.playerType = playerType;
            return this;
        }
        public Integer getPlayerType() {
            return this.playerType;
        }

        public UpdateTimingSyntheticTaskRequestMonitorConfStream setStreamAddressType(Integer streamAddressType) {
            this.streamAddressType = streamAddressType;
            return this;
        }
        public Integer getStreamAddressType() {
            return this.streamAddressType;
        }

        public UpdateTimingSyntheticTaskRequestMonitorConfStream setStreamMonitorTimeout(Integer streamMonitorTimeout) {
            this.streamMonitorTimeout = streamMonitorTimeout;
            return this;
        }
        public Integer getStreamMonitorTimeout() {
            return this.streamMonitorTimeout;
        }

        public UpdateTimingSyntheticTaskRequestMonitorConfStream setStreamType(Integer streamType) {
            this.streamType = streamType;
            return this;
        }
        public Integer getStreamType() {
            return this.streamType;
        }

        public UpdateTimingSyntheticTaskRequestMonitorConfStream setTargetUrl(String targetUrl) {
            this.targetUrl = targetUrl;
            return this;
        }
        public String getTargetUrl() {
            return this.targetUrl;
        }

        public UpdateTimingSyntheticTaskRequestMonitorConfStream setWhiteList(String whiteList) {
            this.whiteList = whiteList;
            return this;
        }
        public String getWhiteList() {
            return this.whiteList;
        }

    }

    public static class UpdateTimingSyntheticTaskRequestMonitorConfWebsite extends TeaModel {
        /**
         * <p>Specifies whether to automatically scroll up and down the screen to load a page. 0: No. 1: Yes. Default value: 0.</p>
         */
        @NameInMap("AutomaticScrolling")
        public Integer automaticScrolling;

        /**
         * <p>Specifies whether to create a custom header. 0: No. 1: The first packet is modified. 2: All packets are modified. Default value: 0.</p>
         */
        @NameInMap("CustomHeader")
        public Integer customHeader;

        /**
         * <p>The custom header. Format: JSON map.</p>
         */
        @NameInMap("CustomHeaderContent")
        public java.util.Map<String, String> customHeaderContent;

        /**
         * <p>域名（例如www.aliyun.com）解析时，解析出的IP地址或者CNAME不在DNS劫持白名单内，用户就会访问失败或者返回一个非Aliyun的目标IP；若解析结果中的IP或者CNAME在DNS白名单内，则会被认定为没有发生DNS劫持。</p>
         * <br>
         * <p>填写格式：域名:匹配规则。匹配规则支持IP、IP通配符、子网掩码和CNAME，可以填写多个匹配规则，多个匹配规则以竖线（|）隔开。例如：www.aliyun.com:203.0.3.55|203.3.44.67，表示www.aliyun.com域名下除203.0.3.55和203.3.44.67之外的其他IP都是被劫持的。</p>
         */
        @NameInMap("DNSHijackWhitelist")
        public String DNSHijackWhitelist;

        /**
         * <p>Specifies whether to disable the cache. 0: No. 1: Yes. Default value: 1.</p>
         */
        @NameInMap("DisableCache")
        public Integer disableCache;

        /**
         * <p>Specifies whether to accept compressed files based on the HTTP Accept-Encoding request header. 0: No. 1: Yes. Default value: 0.</p>
         */
        @NameInMap("DisableCompression")
        public Integer disableCompression;

        /**
         * <p>在页面加载过程中如果出现元素黑名单中配置的元素，不会请求加载该元素 。</p>
         */
        @NameInMap("ElementBlacklist")
        public String elementBlacklist;

        /**
         * <p>Specifies whether to filter invalid IP addresses.</p>
         * <br>
         * <p>*   1: No</p>
         * <p>*   0: Yes</p>
         */
        @NameInMap("FilterInvalidIP")
        public Integer filterInvalidIP;

        /**
         * <p>识别元素：设置浏览页面元素总个数。</p>
         */
        @NameInMap("FlowHijackJumpTimes")
        public Integer flowHijackJumpTimes;

        /**
         * <p>劫持标识：设置匹配的关键信息。填写劫持判断关键字或关键元素，允许带星号（*）。</p>
         */
        @NameInMap("FlowHijackLogo")
        public String flowHijackLogo;

        /**
         * <p>Specifies whether to ignore SSL certificate errors during browsing. 0: No. 1: Yes. Default value: 1.</p>
         */
        @NameInMap("IgnoreCertificateError")
        public Integer ignoreCertificateError;

        /**
         * <p>The monitoring timeout period. Unit: milliseconds. Minimum value: 5000. Maximum value: 300000. Default value: 40000.</p>
         */
        @NameInMap("MonitorTimeout")
        public Long monitorTimeout;

        /**
         * <p>监测页面出现了域名设置之外的元素都属于页面被篡改。常见的表现形式为弹出广告、浮动广告、跳转等。</p>
         */
        @NameInMap("PageTamper")
        public String pageTamper;

        /**
         * <p>Specifies whether to continue browsing after redirection. 0: No, 1:Yes. Default value: 1.</p>
         */
        @NameInMap("Redirection")
        public Integer redirection;

        /**
         * <p>The time threshold that is used to define a slow element. Unit: milliseconds. Default value: 5000. Minimum value: 1. Maximum value: 300000.</p>
         */
        @NameInMap("SlowElementThreshold")
        public Long slowElementThreshold;

        /**
         * <p>The destination URL.</p>
         */
        @NameInMap("TargetUrl")
        public String targetUrl;

        /**
         * <p>验证字符串即监测页面源代码中的某个任意字符串。若客户端返回的源码中包含任一黑名单中的字符串则报650验证字符串失败的错误。多个字符串以竖线（|）隔开。</p>
         */
        @NameInMap("VerifyStringBlacklist")
        public String verifyStringBlacklist;

        /**
         * <p>验证字符串即监测页面源代码中的某个任意字符串。客户端返回的源码必须包含所有白名单中的字符串，否则报650验证字符串失败的错误。多个字符串以竖线（|）隔开。</p>
         */
        @NameInMap("VerifyStringWhitelist")
        public String verifyStringWhitelist;

        /**
         * <p>The maximum waiting time. Unit: milliseconds. Default value: 5000. Minimum value: 5000. Maximum value: 300000.</p>
         */
        @NameInMap("WaitCompletionTime")
        public Long waitCompletionTime;

        public static UpdateTimingSyntheticTaskRequestMonitorConfWebsite build(java.util.Map<String, ?> map) throws Exception {
            UpdateTimingSyntheticTaskRequestMonitorConfWebsite self = new UpdateTimingSyntheticTaskRequestMonitorConfWebsite();
            return TeaModel.build(map, self);
        }

        public UpdateTimingSyntheticTaskRequestMonitorConfWebsite setAutomaticScrolling(Integer automaticScrolling) {
            this.automaticScrolling = automaticScrolling;
            return this;
        }
        public Integer getAutomaticScrolling() {
            return this.automaticScrolling;
        }

        public UpdateTimingSyntheticTaskRequestMonitorConfWebsite setCustomHeader(Integer customHeader) {
            this.customHeader = customHeader;
            return this;
        }
        public Integer getCustomHeader() {
            return this.customHeader;
        }

        public UpdateTimingSyntheticTaskRequestMonitorConfWebsite setCustomHeaderContent(java.util.Map<String, String> customHeaderContent) {
            this.customHeaderContent = customHeaderContent;
            return this;
        }
        public java.util.Map<String, String> getCustomHeaderContent() {
            return this.customHeaderContent;
        }

        public UpdateTimingSyntheticTaskRequestMonitorConfWebsite setDNSHijackWhitelist(String DNSHijackWhitelist) {
            this.DNSHijackWhitelist = DNSHijackWhitelist;
            return this;
        }
        public String getDNSHijackWhitelist() {
            return this.DNSHijackWhitelist;
        }

        public UpdateTimingSyntheticTaskRequestMonitorConfWebsite setDisableCache(Integer disableCache) {
            this.disableCache = disableCache;
            return this;
        }
        public Integer getDisableCache() {
            return this.disableCache;
        }

        public UpdateTimingSyntheticTaskRequestMonitorConfWebsite setDisableCompression(Integer disableCompression) {
            this.disableCompression = disableCompression;
            return this;
        }
        public Integer getDisableCompression() {
            return this.disableCompression;
        }

        public UpdateTimingSyntheticTaskRequestMonitorConfWebsite setElementBlacklist(String elementBlacklist) {
            this.elementBlacklist = elementBlacklist;
            return this;
        }
        public String getElementBlacklist() {
            return this.elementBlacklist;
        }

        public UpdateTimingSyntheticTaskRequestMonitorConfWebsite setFilterInvalidIP(Integer filterInvalidIP) {
            this.filterInvalidIP = filterInvalidIP;
            return this;
        }
        public Integer getFilterInvalidIP() {
            return this.filterInvalidIP;
        }

        public UpdateTimingSyntheticTaskRequestMonitorConfWebsite setFlowHijackJumpTimes(Integer flowHijackJumpTimes) {
            this.flowHijackJumpTimes = flowHijackJumpTimes;
            return this;
        }
        public Integer getFlowHijackJumpTimes() {
            return this.flowHijackJumpTimes;
        }

        public UpdateTimingSyntheticTaskRequestMonitorConfWebsite setFlowHijackLogo(String flowHijackLogo) {
            this.flowHijackLogo = flowHijackLogo;
            return this;
        }
        public String getFlowHijackLogo() {
            return this.flowHijackLogo;
        }

        public UpdateTimingSyntheticTaskRequestMonitorConfWebsite setIgnoreCertificateError(Integer ignoreCertificateError) {
            this.ignoreCertificateError = ignoreCertificateError;
            return this;
        }
        public Integer getIgnoreCertificateError() {
            return this.ignoreCertificateError;
        }

        public UpdateTimingSyntheticTaskRequestMonitorConfWebsite setMonitorTimeout(Long monitorTimeout) {
            this.monitorTimeout = monitorTimeout;
            return this;
        }
        public Long getMonitorTimeout() {
            return this.monitorTimeout;
        }

        public UpdateTimingSyntheticTaskRequestMonitorConfWebsite setPageTamper(String pageTamper) {
            this.pageTamper = pageTamper;
            return this;
        }
        public String getPageTamper() {
            return this.pageTamper;
        }

        public UpdateTimingSyntheticTaskRequestMonitorConfWebsite setRedirection(Integer redirection) {
            this.redirection = redirection;
            return this;
        }
        public Integer getRedirection() {
            return this.redirection;
        }

        public UpdateTimingSyntheticTaskRequestMonitorConfWebsite setSlowElementThreshold(Long slowElementThreshold) {
            this.slowElementThreshold = slowElementThreshold;
            return this;
        }
        public Long getSlowElementThreshold() {
            return this.slowElementThreshold;
        }

        public UpdateTimingSyntheticTaskRequestMonitorConfWebsite setTargetUrl(String targetUrl) {
            this.targetUrl = targetUrl;
            return this;
        }
        public String getTargetUrl() {
            return this.targetUrl;
        }

        public UpdateTimingSyntheticTaskRequestMonitorConfWebsite setVerifyStringBlacklist(String verifyStringBlacklist) {
            this.verifyStringBlacklist = verifyStringBlacklist;
            return this;
        }
        public String getVerifyStringBlacklist() {
            return this.verifyStringBlacklist;
        }

        public UpdateTimingSyntheticTaskRequestMonitorConfWebsite setVerifyStringWhitelist(String verifyStringWhitelist) {
            this.verifyStringWhitelist = verifyStringWhitelist;
            return this;
        }
        public String getVerifyStringWhitelist() {
            return this.verifyStringWhitelist;
        }

        public UpdateTimingSyntheticTaskRequestMonitorConfWebsite setWaitCompletionTime(Long waitCompletionTime) {
            this.waitCompletionTime = waitCompletionTime;
            return this;
        }
        public Long getWaitCompletionTime() {
            return this.waitCompletionTime;
        }

    }

    public static class UpdateTimingSyntheticTaskRequestMonitorConf extends TeaModel {
        /**
         * <p>The HTTP(S) synthetic test parameters.</p>
         */
        @NameInMap("ApiHTTP")
        public UpdateTimingSyntheticTaskRequestMonitorConfApiHTTP apiHTTP;

        /**
         * <p>The file download parameters.</p>
         */
        @NameInMap("FileDownload")
        public UpdateTimingSyntheticTaskRequestMonitorConfFileDownload fileDownload;

        /**
         * <p>The DNS synthetic test parameters.</p>
         */
        @NameInMap("NetDNS")
        public UpdateTimingSyntheticTaskRequestMonitorConfNetDNS netDNS;

        /**
         * <p>The ICMP synthetic test parameters.</p>
         */
        @NameInMap("NetICMP")
        public UpdateTimingSyntheticTaskRequestMonitorConfNetICMP netICMP;

        /**
         * <p>The TCP synthetic tests parameters. This parameter is required if the TaskType parameter is set to 2.</p>
         */
        @NameInMap("NetTCP")
        public UpdateTimingSyntheticTaskRequestMonitorConfNetTCP netTCP;

        /**
         * <p>流媒体拨测配置。</p>
         */
        @NameInMap("Stream")
        public UpdateTimingSyntheticTaskRequestMonitorConfStream stream;

        /**
         * <p>The website-speed measurement parameters.</p>
         */
        @NameInMap("Website")
        public UpdateTimingSyntheticTaskRequestMonitorConfWebsite website;

        public static UpdateTimingSyntheticTaskRequestMonitorConf build(java.util.Map<String, ?> map) throws Exception {
            UpdateTimingSyntheticTaskRequestMonitorConf self = new UpdateTimingSyntheticTaskRequestMonitorConf();
            return TeaModel.build(map, self);
        }

        public UpdateTimingSyntheticTaskRequestMonitorConf setApiHTTP(UpdateTimingSyntheticTaskRequestMonitorConfApiHTTP apiHTTP) {
            this.apiHTTP = apiHTTP;
            return this;
        }
        public UpdateTimingSyntheticTaskRequestMonitorConfApiHTTP getApiHTTP() {
            return this.apiHTTP;
        }

        public UpdateTimingSyntheticTaskRequestMonitorConf setFileDownload(UpdateTimingSyntheticTaskRequestMonitorConfFileDownload fileDownload) {
            this.fileDownload = fileDownload;
            return this;
        }
        public UpdateTimingSyntheticTaskRequestMonitorConfFileDownload getFileDownload() {
            return this.fileDownload;
        }

        public UpdateTimingSyntheticTaskRequestMonitorConf setNetDNS(UpdateTimingSyntheticTaskRequestMonitorConfNetDNS netDNS) {
            this.netDNS = netDNS;
            return this;
        }
        public UpdateTimingSyntheticTaskRequestMonitorConfNetDNS getNetDNS() {
            return this.netDNS;
        }

        public UpdateTimingSyntheticTaskRequestMonitorConf setNetICMP(UpdateTimingSyntheticTaskRequestMonitorConfNetICMP netICMP) {
            this.netICMP = netICMP;
            return this;
        }
        public UpdateTimingSyntheticTaskRequestMonitorConfNetICMP getNetICMP() {
            return this.netICMP;
        }

        public UpdateTimingSyntheticTaskRequestMonitorConf setNetTCP(UpdateTimingSyntheticTaskRequestMonitorConfNetTCP netTCP) {
            this.netTCP = netTCP;
            return this;
        }
        public UpdateTimingSyntheticTaskRequestMonitorConfNetTCP getNetTCP() {
            return this.netTCP;
        }

        public UpdateTimingSyntheticTaskRequestMonitorConf setStream(UpdateTimingSyntheticTaskRequestMonitorConfStream stream) {
            this.stream = stream;
            return this;
        }
        public UpdateTimingSyntheticTaskRequestMonitorConfStream getStream() {
            return this.stream;
        }

        public UpdateTimingSyntheticTaskRequestMonitorConf setWebsite(UpdateTimingSyntheticTaskRequestMonitorConfWebsite website) {
            this.website = website;
            return this;
        }
        public UpdateTimingSyntheticTaskRequestMonitorConfWebsite getWebsite() {
            return this.website;
        }

    }

    public static class UpdateTimingSyntheticTaskRequestMonitors extends TeaModel {
        /**
         * <p>The city code.</p>
         */
        @NameInMap("CityCode")
        public String cityCode;

        /**
         * <p>The client type of the monitoring point. Valid values: 1: data center. 2: Internet. 3: mobile device. 4: ECS instance.</p>
         */
        @NameInMap("ClientType")
        public Integer clientType;

        /**
         * <p>The carrier code.</p>
         */
        @NameInMap("OperatorCode")
        public String operatorCode;

        public static UpdateTimingSyntheticTaskRequestMonitors build(java.util.Map<String, ?> map) throws Exception {
            UpdateTimingSyntheticTaskRequestMonitors self = new UpdateTimingSyntheticTaskRequestMonitors();
            return TeaModel.build(map, self);
        }

        public UpdateTimingSyntheticTaskRequestMonitors setCityCode(String cityCode) {
            this.cityCode = cityCode;
            return this;
        }
        public String getCityCode() {
            return this.cityCode;
        }

        public UpdateTimingSyntheticTaskRequestMonitors setClientType(Integer clientType) {
            this.clientType = clientType;
            return this;
        }
        public Integer getClientType() {
            return this.clientType;
        }

        public UpdateTimingSyntheticTaskRequestMonitors setOperatorCode(String operatorCode) {
            this.operatorCode = operatorCode;
            return this;
        }
        public String getOperatorCode() {
            return this.operatorCode;
        }

    }

    public static class UpdateTimingSyntheticTaskRequestTags extends TeaModel {
        /**
         * <p>The key of the tag.</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the tag.</p>
         */
        @NameInMap("Value")
        public String value;

        public static UpdateTimingSyntheticTaskRequestTags build(java.util.Map<String, ?> map) throws Exception {
            UpdateTimingSyntheticTaskRequestTags self = new UpdateTimingSyntheticTaskRequestTags();
            return TeaModel.build(map, self);
        }

        public UpdateTimingSyntheticTaskRequestTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public UpdateTimingSyntheticTaskRequestTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
