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
     * 
     * <strong>example:</strong>
     * <p>5m</p>
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
     * <p>The resource group ID.</p>
     * 
     * <strong>example:</strong>
     * <p>rg-acfmxyexli2****</p>
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
     * 
     * <strong>example:</strong>
     * <p>5308a2691f59422c8c3b7aeccxxxxxxx</p>
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
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("Expect")
        public String expect;

        /**
         * <p>The condition. gt: greater than. gte: greater than or equal to. lt: less than. lte: less than or equal to. eq: equal to. neq: not equal to. ctn: contain. nctn: does not contain. exist: exist. n_exist: does not exist. belong: belong to. n_belong: does not belong to. reg_match: regular expression.</p>
         * 
         * <strong>example:</strong>
         * <p>eq</p>
         */
        @NameInMap("Operator")
        public String operator;

        /**
         * <p>The check target. If you set the type parameter to HttpResCode, HttpResBody, or HttpResponseTime, you do not need to set the target parameter. If you set the type parameter to HttpResHead, you must specify the key in the header. If you set the type parameter to HttpResBodyJson, use jsonPath.</p>
         * 
         * <strong>example:</strong>
         * <p>HttpResponseTime</p>
         */
        @NameInMap("Target")
        public String target;

        /**
         * <p>The assertion type. Valid values: HttpResCode, HttpResHead, HttpResBody, HttpResBodyJson, HttpResponseTime, IcmpPackLoss (packet loss rate), IcmpPackMaxLatency (maximum packet latency), IcmpPackAvgLatency (average packet latency), TraceRouteHops (number of hops), DnsARecord (A record), DnsCName (CNAME), websiteTTFB (time to first packet), websiteTTLB (time to last packet), websiteFST (first paint time), websiteFFST (first meaningful paint), websiteOnload (full loaded time). For more information, see the following description.</p>
         * 
         * <strong>example:</strong>
         * <p>TraceRouteHops</p>
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
         * <p>The selection mode. Valid values:</p>
         * <ul>
         * <li>0: random</li>
         * <li>1: polling</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
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

    public static class UpdateTimingSyntheticTaskRequestCommonSettingCustomPrometheusSetting extends TeaModel {
        @NameInMap("PrometheusClusterId")
        public String prometheusClusterId;

        @NameInMap("PrometheusClusterRegion")
        public String prometheusClusterRegion;

        @NameInMap("PrometheusLabels")
        public java.util.Map<String, String> prometheusLabels;

        public static UpdateTimingSyntheticTaskRequestCommonSettingCustomPrometheusSetting build(java.util.Map<String, ?> map) throws Exception {
            UpdateTimingSyntheticTaskRequestCommonSettingCustomPrometheusSetting self = new UpdateTimingSyntheticTaskRequestCommonSettingCustomPrometheusSetting();
            return TeaModel.build(map, self);
        }

        public UpdateTimingSyntheticTaskRequestCommonSettingCustomPrometheusSetting setPrometheusClusterId(String prometheusClusterId) {
            this.prometheusClusterId = prometheusClusterId;
            return this;
        }
        public String getPrometheusClusterId() {
            return this.prometheusClusterId;
        }

        public UpdateTimingSyntheticTaskRequestCommonSettingCustomPrometheusSetting setPrometheusClusterRegion(String prometheusClusterRegion) {
            this.prometheusClusterRegion = prometheusClusterRegion;
            return this;
        }
        public String getPrometheusClusterRegion() {
            return this.prometheusClusterRegion;
        }

        public UpdateTimingSyntheticTaskRequestCommonSettingCustomPrometheusSetting setPrometheusLabels(java.util.Map<String, String> prometheusLabels) {
            this.prometheusLabels = prometheusLabels;
            return this;
        }
        public java.util.Map<String, String> getPrometheusLabels() {
            return this.prometheusLabels;
        }

    }

    public static class UpdateTimingSyntheticTaskRequestCommonSettingCustomVPCSetting extends TeaModel {
        /**
         * <p>The region ID.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
         */
        @NameInMap("RegionId")
        public String regionId;

        /**
         * <p>The ID of the security group to which the client belongs. The security group specifies the inbound and outbound rules of the client for the VPC. You need to allow the security group to which the client belongs to access the security group to which the VPC belongs. Otherwise, the client cannot access resources in the VPC.</p>
         * 
         * <strong>example:</strong>
         * <p>sg-xxxxxxxx</p>
         */
        @NameInMap("SecureGroupId")
        public String secureGroupId;

        /**
         * <p>The vSwitch ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-2zevek6r3mpny7wxxxxxv</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>VPC ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp15bjtubjytclwxxxxxx</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        public static UpdateTimingSyntheticTaskRequestCommonSettingCustomVPCSetting build(java.util.Map<String, ?> map) throws Exception {
            UpdateTimingSyntheticTaskRequestCommonSettingCustomVPCSetting self = new UpdateTimingSyntheticTaskRequestCommonSettingCustomVPCSetting();
            return TeaModel.build(map, self);
        }

        public UpdateTimingSyntheticTaskRequestCommonSettingCustomVPCSetting setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public UpdateTimingSyntheticTaskRequestCommonSettingCustomVPCSetting setSecureGroupId(String secureGroupId) {
            this.secureGroupId = secureGroupId;
            return this;
        }
        public String getSecureGroupId() {
            return this.secureGroupId;
        }

        public UpdateTimingSyntheticTaskRequestCommonSettingCustomVPCSetting setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public UpdateTimingSyntheticTaskRequestCommonSettingCustomVPCSetting setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

    public static class UpdateTimingSyntheticTaskRequestCommonSetting extends TeaModel {
        /**
         * <p>The custom host settings.</p>
         */
        @NameInMap("CustomHost")
        public UpdateTimingSyntheticTaskRequestCommonSettingCustomHost customHost;

        @NameInMap("CustomPrometheusSetting")
        public UpdateTimingSyntheticTaskRequestCommonSettingCustomPrometheusSetting customPrometheusSetting;

        /**
         * <p>The information about the virtual private cloud (VPC). If the destination URL is an Alibaba Cloud internal endpoint, you need to configure a VPC.</p>
         */
        @NameInMap("CustomVPCSetting")
        public UpdateTimingSyntheticTaskRequestCommonSettingCustomVPCSetting customVPCSetting;

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
         * <p>Specifies whether to enable tracing.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("IsOpenTrace")
        public Boolean isOpenTrace;

        /**
         * <p>Specifies whether to evenly distribute monitoring samples. Valid values:</p>
         * <ul>
         * <li>0: no.</li>
         * <li>1: yes.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("MonitorSamples")
        public Integer monitorSamples;

        /**
         * <p>The type of the client for tracing. Valid values:</p>
         * <ul>
         * <li>0: ARMS agent</li>
         * <li>1: OpenTelemetry</li>
         * <li>2: Jaeger</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("TraceClientType")
        public Integer traceClientType;

        /**
         * <p>The region to which trace data is reported.</p>
         * 
         * <strong>example:</strong>
         * <p>cn-hangzhou</p>
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

        public UpdateTimingSyntheticTaskRequestCommonSetting setCustomPrometheusSetting(UpdateTimingSyntheticTaskRequestCommonSettingCustomPrometheusSetting customPrometheusSetting) {
            this.customPrometheusSetting = customPrometheusSetting;
            return this;
        }
        public UpdateTimingSyntheticTaskRequestCommonSettingCustomPrometheusSetting getCustomPrometheusSetting() {
            return this.customPrometheusSetting;
        }

        public UpdateTimingSyntheticTaskRequestCommonSetting setCustomVPCSetting(UpdateTimingSyntheticTaskRequestCommonSettingCustomVPCSetting customVPCSetting) {
            this.customVPCSetting = customVPCSetting;
            return this;
        }
        public UpdateTimingSyntheticTaskRequestCommonSettingCustomVPCSetting getCustomVPCSetting() {
            return this.customVPCSetting;
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
         * 
         * <strong>example:</strong>
         * <p>22</p>
         */
        @NameInMap("EndHour")
        public Integer endHour;

        /**
         * <p>The hour at which the test starts. Valid values: 0 to 24.</p>
         * 
         * <strong>example:</strong>
         * <p>14</p>
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
         * <p>The content of the request body. Format: JSON string. The parameter is required if the type parameter is set to text/plain, application/json, application/xml, or text/html.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *       &quot;key1&quot;: &quot;value1&quot;,
         *       &quot;key2&quot;: &quot;value2&quot;
         * }</p>
         */
        @NameInMap("Content")
        public String content;

        /**
         * <p>The type of the request body. Valid values: text/plain, application/json, application/x-www-form-urlencoded, multipart/form-data, application/xml, and text/html.</p>
         * 
         * <strong>example:</strong>
         * <p>application/json</p>
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
         * <p>Specifies whether to verify the certificate. Default value: No.</p>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
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

        /**
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("ProtocolAlpnProtocol")
        public Integer protocolAlpnProtocol;

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
         * 
         * <strong>example:</strong>
         * <p>https://********</p>
         */
        @NameInMap("TargetUrl")
        public String targetUrl;

        /**
         * <p>The timeout period. Unit: milliseconds. Default value: 10000. Minimum value: 1000. Maximum value: 300000.</p>
         * 
         * <strong>example:</strong>
         * <p>5000</p>
         */
        @NameInMap("Timeout")
        public Long timeout;

        public static UpdateTimingSyntheticTaskRequestMonitorConfApiHTTP build(java.util.Map<String, ?> map) throws Exception {
            UpdateTimingSyntheticTaskRequestMonitorConfApiHTTP self = new UpdateTimingSyntheticTaskRequestMonitorConfApiHTTP();
            return TeaModel.build(map, self);
        }

        public UpdateTimingSyntheticTaskRequestMonitorConfApiHTTP setCheckCert(Boolean checkCert) {
            this.checkCert = checkCert;
            return this;
        }
        public Boolean getCheckCert() {
            return this.checkCert;
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

        public UpdateTimingSyntheticTaskRequestMonitorConfApiHTTP setProtocolAlpnProtocol(Integer protocolAlpnProtocol) {
            this.protocolAlpnProtocol = protocolAlpnProtocol;
            return this;
        }
        public Integer getProtocolAlpnProtocol() {
            return this.protocolAlpnProtocol;
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
         * <p>Unit: milliseconds. Minimum value: 1000. Maximum value: 120000. Default value: 5000.</p>
         * 
         * <strong>example:</strong>
         * <p>5000</p>
         */
        @NameInMap("ConnectionTimeout")
        public Long connectionTimeout;

        /**
         * <p>The content of the custom request header. Format: JSON map.</p>
         */
        @NameInMap("CustomHeaderContent")
        public java.util.Map<String, String> customHeaderContent;

        /**
         * <p>The kernel type. Valid values:</p>
         * <ul>
         * <li>1: curl</li>
         * <li>0: WinInet</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("DownloadKernel")
        public Integer downloadKernel;

        /**
         * <p>Specifies whether to ignore CA certificate authentication errors. Valid values: 0: No. 1: Yes. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("IgnoreCertificateAuthError")
        public Integer ignoreCertificateAuthError;

        /**
         * <p>Specifies whether to ignore certificate revocation errors. Valid values: 0: No. 1: Yes. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("IgnoreCertificateCanceledError")
        public Integer ignoreCertificateCanceledError;

        /**
         * <p>Specifies whether to ignore certificate invalidity. Valid values: 0: No. 1: Yes. Default value: 1.</p>
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
         * <p>Specifies whether to ignore certificate incredibility. Valid values: 0: No. 1: Yes. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("IgnoreCertificateUntrustworthyError")
        public Integer ignoreCertificateUntrustworthyError;

        /**
         * <p>Specifies whether to ignore certificate usage errors. Valid values: 0: No. 1: Yes. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("IgnoreCertificateUsingError")
        public Integer ignoreCertificateUsingError;

        /**
         * <p>Specifies whether to ignore host invalidity. Valid values: 0: No. 1: Yes. Default value: 1.</p>
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
         * <p>60000</p>
         */
        @NameInMap("MonitorTimeout")
        public Long monitorTimeout;

        /**
         * <p>The QUIC protocol type. Valid values:</p>
         * <ul>
         * <li>1: HTTP/1</li>
         * <li>2: HTTP/2</li>
         * <li>3: HTTP/3</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("QuickProtocol")
        public Integer quickProtocol;

        /**
         * <p>Specifies whether to support redirection. Valid values: 0: No. 1: Yes. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Redirection")
        public Integer redirection;

        /**
         * <p>The URL that is used to download the file.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://img.alicdn.com/tfs/TB13DzOjXP7gK0jSZFjXXc5aXXa-212-48.png">https://img.alicdn.com/tfs/TB13DzOjXP7gK0jSZFjXXc5aXXa-212-48.png</a></p>
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
         * <p>The keyword that is used in verification.</p>
         * 
         * <strong>example:</strong>
         * <p>aliyun</p>
         */
        @NameInMap("ValidateKeywords")
        public String validateKeywords;

        /**
         * <p>The verification method. Valid values:</p>
         * <ul>
         * <li>0: no verification</li>
         * <li>1: string verification</li>
         * <li>2: MD5 verification</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("VerifyWay")
        public Integer verifyWay;

        /**
         * <p>The whitelisted objects that are used to avoid DNS hijacking. The objects can be IP addresses, wildcard mask, subnet mask, or CNAME records. Separate multiple objects with vertical bars (|). Example: <a href="http://www.aliyun.com:203.0.3.55%7C203.3.44.67">www.aliyun.com:203.0.3.55|203.3.44.67</a>. It indicates that all IP addresses that belong to the <a href="http://www.aliyun.com">www.aliyun.com</a> domain name except 203.0.3.55 and 203.3.44.67 are hijacked.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.aliyun.com:203.0.3.55%7C203.3.44.67">www.aliyun.com:203.0.3.55|203.3.44.67</a></p>
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
         * <p>Specifies whether to use the dig command to display the data. Valid values: 0: No. 1: Yes.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("Dig")
        public Integer dig;

        /**
         * <p>The IP version of the DNS server. Valid values: 0: IPv4. 1: IPv6. 2: A version is automatically selected. Default value: 0.</p>
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
         * <p>The DNS query method. Valid values: 0: recursive. 1: iterative. Default value: 0.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("QueryMethod")
        public Integer queryMethod;

        /**
         * <p>The domain name.</p>
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
         * <p>1000</p>
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
         * 
         * <strong>example:</strong>
         * <p>300</p>
         */
        @NameInMap("Interval")
        public Long interval;

        /**
         * <p>The number of ICMP packets that are sent. Minimum value: 1. Maximum value: 50. Default value: 4.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
         */
        @NameInMap("PackageNum")
        public Integer packageNum;

        /**
         * <p>The size of each ICMP packet. Unit: bytes. Valid values: 32, 64, 128, 256, 512, 1024, 1080, and 1450.</p>
         * 
         * <strong>example:</strong>
         * <p>32</p>
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
         * <p>The IP address or domain name of the destination host. The value cannot contain port numbers, protocol headers, or request paths.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.aliyun.com">www.aliyun.com</a></p>
         */
        @NameInMap("TargetUrl")
        public String targetUrl;

        /**
         * <p>The timeout period for the ICMP synthetic test. Unit: milliseconds. Minimum value: 1000. Maximum value: 300000. Default value: 20000.</p>
         * 
         * <strong>example:</strong>
         * <p>5000</p>
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
         * <p>The maximum number of hops for the tracert command. Minimum value: 1. Maximum value: 128. Default value: 20.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("TracertNumMax")
        public Integer tracertNumMax;

        /**
         * <p>The timeout period of the tracert command. Unit: milliseconds. Minimum value: 1000. Maximum value: 300000. Default value: 60000.</p>
         * 
         * <strong>example:</strong>
         * <p>60000</p>
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
         * <p>The number of TCP connections that are established. Minimum value: 1. Maximum value: 16. Default value: 4.</p>
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
         * <p>300</p>
         */
        @NameInMap("Interval")
        public Long interval;

        /**
         * <p>The IP address of the destination host.</p>
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
         * <p>1000</p>
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
         * <p>The maximum number of hops for the tracert command. Minimum value: 1. Maximum value: 128. Default value: 20.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("TracertNumMax")
        public Integer tracertNumMax;

        /**
         * <p>The timeout period of the tracert command. Unit: milliseconds. Minimum value: 1000. Maximum value: 300000. Default value: 60000.</p>
         * 
         * <strong>example:</strong>
         * <p>1000</p>
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
         * <p>The custom header. Format: JSON map.</p>
         */
        @NameInMap("CustomHeaderContent")
        public java.util.Map<String, String> customHeaderContent;

        /**
         * <p>The player. Default value: 12. Valid values:</p>
         * <ul>
         * <li>12: VLC</li>
         * <li>2: Flash Player</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("PlayerType")
        public Integer playerType;

        /**
         * <p>The address type of the resource. Valid values:</p>
         * <ul>
         * <li>1: resource URL</li>
         * <li>0: page URL Default value: 0.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("StreamAddressType")
        public Integer streamAddressType;

        /**
         * <p>The monitoring duration. Unit: seconds. Maximum and default value: 60.</p>
         * 
         * <strong>example:</strong>
         * <p>30</p>
         */
        @NameInMap("StreamMonitorTimeout")
        public Integer streamMonitorTimeout;

        /**
         * <p>Specifies whether the resource is a video or audio. Valid values: 0: video. 1: audio.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("StreamType")
        public Integer streamType;

        /**
         * <p>The resource URL of the streaming media.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.aliyun.com/stream/test.mp4">http://www.aliyun.com/stream/test.mp4</a></p>
         */
        @NameInMap("TargetUrl")
        public String targetUrl;

        /**
         * <p>The whitelisted objects that are used to avoid DNS hijacking. The objects can be IP addresses, wildcard mask, subnet mask, or CNAME records. Separate multiple objects with vertical bars (|). Example: <a href="http://www.aliyun.com:203.0.3.55%7C203.3.44.67">www.aliyun.com:203.0.3.55|203.3.44.67</a>. It indicates that all IP addresses that belong to the <a href="http://www.aliyun.com">www.aliyun.com</a> domain name except 203.0.3.55 and 203.3.44.67 are hijacked.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.aliyun.com:203.0.3.55%7C203.3.44.67">www.aliyun.com:203.0.3.55|203.3.44.67</a></p>
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
         * <p>Specifies whether to automatically scroll up and down the screen to load a page. Valid values: 0: No. 1: Yes. Default value: 0.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AutomaticScrolling")
        public Integer automaticScrolling;

        /**
         * <p>Specifies whether to create a custom header. Valid values: 0: No. 1: The first packet is modified. 2: All packets are modified. Default value: 0.</p>
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
         * <p>If the IP address or CNAME record resolved from a domain name is not included in the DNS whitelist, you cannot access the domain name, or an IP address that belongs to a different domain name is returned. If the IP address or CNAME record is included in the DNS whitelist, DNS hijacking does not occur.</p>
         * <p>Format: \<domain name>:\<objects>. The objects can be IP addresses, wildcard mask, subnet mask, or CNAME records. Separate multiple objects with vertical bars (|). Example: <a href="http://www.aliyun.com:203.0.3.55%7C203.3.44.67">www.aliyun.com:203.0.3.55|203.3.44.67</a>. It indicates that all IP addresses that belong to the <a href="http://www.aliyun.com">www.aliyun.com</a> domain name except 203.0.3.55 and 203.3.44.67 are hijacked.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.aliyun.com:203.0.3.55%7C203.3.44.67">www.aliyun.com:203.0.3.55|203.3.44.67</a></p>
         */
        @NameInMap("DNSHijackWhitelist")
        public String DNSHijackWhitelist;

        /**
         * <p>Specifies whether to disable the cache. Valid values: 0: No. 1: Yes. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("DisableCache")
        public Integer disableCache;

        /**
         * <p>Specifies whether to accept compressed files based on the HTTP Accept-Encoding request header. Valid values: 0: No. 1: Yes. Default value: 0.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("DisableCompression")
        public Integer disableCompression;

        /**
         * <p>The elements not to be loaded in the page loading process.</p>
         * 
         * <strong>example:</strong>
         * <p>a.jpg</p>
         */
        @NameInMap("ElementBlacklist")
        public String elementBlacklist;

        /**
         * <p>Specifies whether to exclude invalid IP addresses. Valid values:</p>
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
         * <p>The total number of elements on the page.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("FlowHijackJumpTimes")
        public Integer flowHijackJumpTimes;

        /**
         * <p>The keyword that is used to identify hijacking. Asterisks (\*) are allowed.</p>
         * 
         * <strong>example:</strong>
         * <p>aliyun</p>
         */
        @NameInMap("FlowHijackLogo")
        public String flowHijackLogo;

        /**
         * <p>Specifies whether to ignore SSL certificate errors during browsing. Valid values: 0: No. 1: Yes. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("IgnoreCertificateError")
        public Integer ignoreCertificateError;

        /**
         * <p>The monitoring timeout period. Unit: milliseconds. Minimum value: 5000. Maximum value: 300000. Default value: 40000.</p>
         * 
         * <strong>example:</strong>
         * <p>20000</p>
         */
        @NameInMap("MonitorTimeout")
        public Long monitorTimeout;

        /**
         * <p>Elements that are not included in the whitelist and appear on the page are manipulated. These elements can be pop-up ads, floating ads, and page redirection.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.aliyun.com:%7C/cc/bb/a.gif%7C/vv/bb/cc.jpg">www.aliyun.com:|/cc/bb/a.gif|/vv/bb/cc.jpg</a></p>
         */
        @NameInMap("PageTamper")
        public String pageTamper;

        /**
         * <p>Specifies whether to continue browsing after redirection. Valid values: 0: No. 1:Yes. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
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
         * <p>The URL of the website.</p>
         * 
         * <strong>example:</strong>
         * <p>https://********</p>
         */
        @NameInMap("TargetUrl")
        public String targetUrl;

        /**
         * <p>An arbitrary string in the source code of the page for verification. If the source code returned by the client contains a string that is in the blacklist, the 650 error code is reported, which indicates that the string fails to be verified. Separate multiple strings with vertical bars (|).</p>
         * 
         * <strong>example:</strong>
         * <p>error</p>
         */
        @NameInMap("VerifyStringBlacklist")
        public String verifyStringBlacklist;

        /**
         * <p>An arbitrary string in the source code of the page for verification. If the source code returned by the client contains a string that is not in the whitelist, the 650 error code is reported, which indicates that the string fails to be verified. Separate multiple strings with vertical bars (|).</p>
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
         * <p>The parameters of the HTTP(S) synthetic test.</p>
         */
        @NameInMap("ApiHTTP")
        public UpdateTimingSyntheticTaskRequestMonitorConfApiHTTP apiHTTP;

        /**
         * <p>The parameters of file downloading.</p>
         */
        @NameInMap("FileDownload")
        public UpdateTimingSyntheticTaskRequestMonitorConfFileDownload fileDownload;

        /**
         * <p>The parameters of the DNS synthetic test.</p>
         */
        @NameInMap("NetDNS")
        public UpdateTimingSyntheticTaskRequestMonitorConfNetDNS netDNS;

        /**
         * <p>The parameters of the ICMP synthetic test.</p>
         */
        @NameInMap("NetICMP")
        public UpdateTimingSyntheticTaskRequestMonitorConfNetICMP netICMP;

        /**
         * <p>The parameters of the TCP synthetic test. This parameter is required if the TaskType parameter is set to 2.</p>
         */
        @NameInMap("NetTCP")
        public UpdateTimingSyntheticTaskRequestMonitorConfNetTCP netTCP;

        /**
         * <p>The parameters of the streaming-media synthetic test.</p>
         */
        @NameInMap("Stream")
        public UpdateTimingSyntheticTaskRequestMonitorConfStream stream;

        /**
         * <p>The parameters of the website speed measurement.</p>
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
         * 
         * <strong>example:</strong>
         * <p>100001</p>
         */
        @NameInMap("CityCode")
        public String cityCode;

        /**
         * <p>The client type of the monitoring point. Valid values: 1: data center. 2: Internet. 3: mobile device. 4: ECS instance.</p>
         * 
         * <strong>example:</strong>
         * <p>4</p>
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
         * 
         * <strong>example:</strong>
         * <p>key</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <p>The value of the tag.</p>
         * 
         * <strong>example:</strong>
         * <p>value</p>
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
