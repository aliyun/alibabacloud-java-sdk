// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class CreateTimingSyntheticTaskRequest extends TeaModel {
    @NameInMap("AvailableAssertions")
    public java.util.List<CreateTimingSyntheticTaskRequestAvailableAssertions> availableAssertions;

    /**
     * <p>The general settings.</p>
     */
    @NameInMap("CommonSetting")
    public CreateTimingSyntheticTaskRequestCommonSetting commonSetting;

    @NameInMap("CustomPeriod")
    public CreateTimingSyntheticTaskRequestCustomPeriod customPeriod;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>5m</p>
     */
    @NameInMap("Frequency")
    public String frequency;

    /**
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("MonitorCategory")
    public Integer monitorCategory;

    /**
     * <p>The monitoring configurations.</p>
     * <p>This parameter is required.</p>
     */
    @NameInMap("MonitorConf")
    public CreateTimingSyntheticTaskRequestMonitorConf monitorConf;

    /**
     * <p>This parameter is required.</p>
     */
    @NameInMap("Monitors")
    public java.util.List<CreateTimingSyntheticTaskRequestMonitors> monitors;

    /**
     * <p>The name of the task.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>demo-test</p>
     */
    @NameInMap("Name")
    public String name;

    /**
     * <p>The region ID.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>cn-hangzhou</p>
     */
    @NameInMap("RegionId")
    public String regionId;

    /**
     * <strong>example:</strong>
     * <p>xxxx</p>
     */
    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("Tags")
    public java.util.List<CreateTimingSyntheticTaskRequestTags> tags;

    /**
     * <p>The type of the task. Valid values:</p>
     * <p>1: ICMP. 2: TCP. 3: DNS. 4: HTTP. 5: website speed measurement. 6: file download.</p>
     * <p>This parameter is required.</p>
     * 
     * <strong>example:</strong>
     * <p>4</p>
     */
    @NameInMap("TaskType")
    public Integer taskType;

    public static CreateTimingSyntheticTaskRequest build(java.util.Map<String, ?> map) throws Exception {
        CreateTimingSyntheticTaskRequest self = new CreateTimingSyntheticTaskRequest();
        return TeaModel.build(map, self);
    }

    public CreateTimingSyntheticTaskRequest setAvailableAssertions(java.util.List<CreateTimingSyntheticTaskRequestAvailableAssertions> availableAssertions) {
        this.availableAssertions = availableAssertions;
        return this;
    }
    public java.util.List<CreateTimingSyntheticTaskRequestAvailableAssertions> getAvailableAssertions() {
        return this.availableAssertions;
    }

    public CreateTimingSyntheticTaskRequest setCommonSetting(CreateTimingSyntheticTaskRequestCommonSetting commonSetting) {
        this.commonSetting = commonSetting;
        return this;
    }
    public CreateTimingSyntheticTaskRequestCommonSetting getCommonSetting() {
        return this.commonSetting;
    }

    public CreateTimingSyntheticTaskRequest setCustomPeriod(CreateTimingSyntheticTaskRequestCustomPeriod customPeriod) {
        this.customPeriod = customPeriod;
        return this;
    }
    public CreateTimingSyntheticTaskRequestCustomPeriod getCustomPeriod() {
        return this.customPeriod;
    }

    public CreateTimingSyntheticTaskRequest setFrequency(String frequency) {
        this.frequency = frequency;
        return this;
    }
    public String getFrequency() {
        return this.frequency;
    }

    public CreateTimingSyntheticTaskRequest setMonitorCategory(Integer monitorCategory) {
        this.monitorCategory = monitorCategory;
        return this;
    }
    public Integer getMonitorCategory() {
        return this.monitorCategory;
    }

    public CreateTimingSyntheticTaskRequest setMonitorConf(CreateTimingSyntheticTaskRequestMonitorConf monitorConf) {
        this.monitorConf = monitorConf;
        return this;
    }
    public CreateTimingSyntheticTaskRequestMonitorConf getMonitorConf() {
        return this.monitorConf;
    }

    public CreateTimingSyntheticTaskRequest setMonitors(java.util.List<CreateTimingSyntheticTaskRequestMonitors> monitors) {
        this.monitors = monitors;
        return this;
    }
    public java.util.List<CreateTimingSyntheticTaskRequestMonitors> getMonitors() {
        return this.monitors;
    }

    public CreateTimingSyntheticTaskRequest setName(String name) {
        this.name = name;
        return this;
    }
    public String getName() {
        return this.name;
    }

    public CreateTimingSyntheticTaskRequest setRegionId(String regionId) {
        this.regionId = regionId;
        return this;
    }
    public String getRegionId() {
        return this.regionId;
    }

    public CreateTimingSyntheticTaskRequest setResourceGroupId(String resourceGroupId) {
        this.resourceGroupId = resourceGroupId;
        return this;
    }
    public String getResourceGroupId() {
        return this.resourceGroupId;
    }

    public CreateTimingSyntheticTaskRequest setTags(java.util.List<CreateTimingSyntheticTaskRequestTags> tags) {
        this.tags = tags;
        return this;
    }
    public java.util.List<CreateTimingSyntheticTaskRequestTags> getTags() {
        return this.tags;
    }

    public CreateTimingSyntheticTaskRequest setTaskType(Integer taskType) {
        this.taskType = taskType;
        return this;
    }
    public Integer getTaskType() {
        return this.taskType;
    }

    public static class CreateTimingSyntheticTaskRequestAvailableAssertions extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
         */
        @NameInMap("Expect")
        public String expect;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>eq</p>
         */
        @NameInMap("Operator")
        public String operator;

        /**
         * <strong>example:</strong>
         * <p>key</p>
         */
        @NameInMap("Target")
        public String target;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>DnsARecord</p>
         */
        @NameInMap("Type")
        public String type;

        public static CreateTimingSyntheticTaskRequestAvailableAssertions build(java.util.Map<String, ?> map) throws Exception {
            CreateTimingSyntheticTaskRequestAvailableAssertions self = new CreateTimingSyntheticTaskRequestAvailableAssertions();
            return TeaModel.build(map, self);
        }

        public CreateTimingSyntheticTaskRequestAvailableAssertions setExpect(String expect) {
            this.expect = expect;
            return this;
        }
        public String getExpect() {
            return this.expect;
        }

        public CreateTimingSyntheticTaskRequestAvailableAssertions setOperator(String operator) {
            this.operator = operator;
            return this;
        }
        public String getOperator() {
            return this.operator;
        }

        public CreateTimingSyntheticTaskRequestAvailableAssertions setTarget(String target) {
            this.target = target;
            return this;
        }
        public String getTarget() {
            return this.target;
        }

        public CreateTimingSyntheticTaskRequestAvailableAssertions setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class CreateTimingSyntheticTaskRequestCommonSettingCustomHostHosts extends TeaModel {
        /**
         * <p>The domain name</p>
         * <p>This parameter is required.</p>
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
         * <li>1: IPv4.</li>
         * <li>2: IPv6.</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("IpType")
        public Integer ipType;

        /**
         * <p>The list of IP addresses.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("Ips")
        public java.util.List<String> ips;

        public static CreateTimingSyntheticTaskRequestCommonSettingCustomHostHosts build(java.util.Map<String, ?> map) throws Exception {
            CreateTimingSyntheticTaskRequestCommonSettingCustomHostHosts self = new CreateTimingSyntheticTaskRequestCommonSettingCustomHostHosts();
            return TeaModel.build(map, self);
        }

        public CreateTimingSyntheticTaskRequestCommonSettingCustomHostHosts setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public CreateTimingSyntheticTaskRequestCommonSettingCustomHostHosts setIpType(Integer ipType) {
            this.ipType = ipType;
            return this;
        }
        public Integer getIpType() {
            return this.ipType;
        }

        public CreateTimingSyntheticTaskRequestCommonSettingCustomHostHosts setIps(java.util.List<String> ips) {
            this.ips = ips;
            return this;
        }
        public java.util.List<String> getIps() {
            return this.ips;
        }

    }

    public static class CreateTimingSyntheticTaskRequestCommonSettingCustomHost extends TeaModel {
        /**
         * <p>The list of hosts.</p>
         * <p>This parameter is required.</p>
         */
        @NameInMap("Hosts")
        public java.util.List<CreateTimingSyntheticTaskRequestCommonSettingCustomHostHosts> hosts;

        /**
         * <p>The selection mode. Valid values:</p>
         * <ul>
         * <li>0: random</li>
         * <li>1: polling</li>
         * </ul>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("SelectType")
        public Integer selectType;

        public static CreateTimingSyntheticTaskRequestCommonSettingCustomHost build(java.util.Map<String, ?> map) throws Exception {
            CreateTimingSyntheticTaskRequestCommonSettingCustomHost self = new CreateTimingSyntheticTaskRequestCommonSettingCustomHost();
            return TeaModel.build(map, self);
        }

        public CreateTimingSyntheticTaskRequestCommonSettingCustomHost setHosts(java.util.List<CreateTimingSyntheticTaskRequestCommonSettingCustomHostHosts> hosts) {
            this.hosts = hosts;
            return this;
        }
        public java.util.List<CreateTimingSyntheticTaskRequestCommonSettingCustomHostHosts> getHosts() {
            return this.hosts;
        }

        public CreateTimingSyntheticTaskRequestCommonSettingCustomHost setSelectType(Integer selectType) {
            this.selectType = selectType;
            return this;
        }
        public Integer getSelectType() {
            return this.selectType;
        }

    }

    public static class CreateTimingSyntheticTaskRequestCommonSettingCustomPrometheusSetting extends TeaModel {
        @NameInMap("PrometheusClusterId")
        public String prometheusClusterId;

        @NameInMap("PrometheusClusterRegion")
        public String prometheusClusterRegion;

        @NameInMap("PrometheusLabels")
        public java.util.Map<String, String> prometheusLabels;

        public static CreateTimingSyntheticTaskRequestCommonSettingCustomPrometheusSetting build(java.util.Map<String, ?> map) throws Exception {
            CreateTimingSyntheticTaskRequestCommonSettingCustomPrometheusSetting self = new CreateTimingSyntheticTaskRequestCommonSettingCustomPrometheusSetting();
            return TeaModel.build(map, self);
        }

        public CreateTimingSyntheticTaskRequestCommonSettingCustomPrometheusSetting setPrometheusClusterId(String prometheusClusterId) {
            this.prometheusClusterId = prometheusClusterId;
            return this;
        }
        public String getPrometheusClusterId() {
            return this.prometheusClusterId;
        }

        public CreateTimingSyntheticTaskRequestCommonSettingCustomPrometheusSetting setPrometheusClusterRegion(String prometheusClusterRegion) {
            this.prometheusClusterRegion = prometheusClusterRegion;
            return this;
        }
        public String getPrometheusClusterRegion() {
            return this.prometheusClusterRegion;
        }

        public CreateTimingSyntheticTaskRequestCommonSettingCustomPrometheusSetting setPrometheusLabels(java.util.Map<String, String> prometheusLabels) {
            this.prometheusLabels = prometheusLabels;
            return this;
        }
        public java.util.Map<String, String> getPrometheusLabels() {
            return this.prometheusLabels;
        }

    }

    public static class CreateTimingSyntheticTaskRequestCommonSettingCustomVPCSetting extends TeaModel {
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
         * <p>sg-bp13wzf9vuwegmpxxxxx</p>
         */
        @NameInMap("SecureGroupId")
        public String secureGroupId;

        /**
         * <p>The vSwitch ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vsw-bp14crq29vpycxp8xxxxx</p>
         */
        @NameInMap("VSwitchId")
        public String vSwitchId;

        /**
         * <p>VPC ID.</p>
         * 
         * <strong>example:</strong>
         * <p>vpc-bp1muectbr8f90vjxxxxx</p>
         */
        @NameInMap("VpcId")
        public String vpcId;

        public static CreateTimingSyntheticTaskRequestCommonSettingCustomVPCSetting build(java.util.Map<String, ?> map) throws Exception {
            CreateTimingSyntheticTaskRequestCommonSettingCustomVPCSetting self = new CreateTimingSyntheticTaskRequestCommonSettingCustomVPCSetting();
            return TeaModel.build(map, self);
        }

        public CreateTimingSyntheticTaskRequestCommonSettingCustomVPCSetting setRegionId(String regionId) {
            this.regionId = regionId;
            return this;
        }
        public String getRegionId() {
            return this.regionId;
        }

        public CreateTimingSyntheticTaskRequestCommonSettingCustomVPCSetting setSecureGroupId(String secureGroupId) {
            this.secureGroupId = secureGroupId;
            return this;
        }
        public String getSecureGroupId() {
            return this.secureGroupId;
        }

        public CreateTimingSyntheticTaskRequestCommonSettingCustomVPCSetting setVSwitchId(String vSwitchId) {
            this.vSwitchId = vSwitchId;
            return this;
        }
        public String getVSwitchId() {
            return this.vSwitchId;
        }

        public CreateTimingSyntheticTaskRequestCommonSettingCustomVPCSetting setVpcId(String vpcId) {
            this.vpcId = vpcId;
            return this;
        }
        public String getVpcId() {
            return this.vpcId;
        }

    }

    public static class CreateTimingSyntheticTaskRequestCommonSetting extends TeaModel {
        /**
         * <p>The custom host settings.</p>
         */
        @NameInMap("CustomHost")
        public CreateTimingSyntheticTaskRequestCommonSettingCustomHost customHost;

        @NameInMap("CustomPrometheusSetting")
        public CreateTimingSyntheticTaskRequestCommonSettingCustomPrometheusSetting customPrometheusSetting;

        /**
         * <p>The information about the virtual private cloud (VPC). If the destination URL is an Alibaba Cloud internal endpoint, you need to configure a VPC.</p>
         */
        @NameInMap("CustomVPCSetting")
        public CreateTimingSyntheticTaskRequestCommonSettingCustomVPCSetting customVPCSetting;

        /**
         * <p>The IP version. Valid values:</p>
         * <ul>
         * <li>0: A version is automatically selected.</li>
         * <li>1: IPv4.</li>
         * <li>2: IPv6.</li>
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
         * <li>0: no</li>
         * <li>1: yes</li>
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

        public static CreateTimingSyntheticTaskRequestCommonSetting build(java.util.Map<String, ?> map) throws Exception {
            CreateTimingSyntheticTaskRequestCommonSetting self = new CreateTimingSyntheticTaskRequestCommonSetting();
            return TeaModel.build(map, self);
        }

        public CreateTimingSyntheticTaskRequestCommonSetting setCustomHost(CreateTimingSyntheticTaskRequestCommonSettingCustomHost customHost) {
            this.customHost = customHost;
            return this;
        }
        public CreateTimingSyntheticTaskRequestCommonSettingCustomHost getCustomHost() {
            return this.customHost;
        }

        public CreateTimingSyntheticTaskRequestCommonSetting setCustomPrometheusSetting(CreateTimingSyntheticTaskRequestCommonSettingCustomPrometheusSetting customPrometheusSetting) {
            this.customPrometheusSetting = customPrometheusSetting;
            return this;
        }
        public CreateTimingSyntheticTaskRequestCommonSettingCustomPrometheusSetting getCustomPrometheusSetting() {
            return this.customPrometheusSetting;
        }

        public CreateTimingSyntheticTaskRequestCommonSetting setCustomVPCSetting(CreateTimingSyntheticTaskRequestCommonSettingCustomVPCSetting customVPCSetting) {
            this.customVPCSetting = customVPCSetting;
            return this;
        }
        public CreateTimingSyntheticTaskRequestCommonSettingCustomVPCSetting getCustomVPCSetting() {
            return this.customVPCSetting;
        }

        public CreateTimingSyntheticTaskRequestCommonSetting setIpType(Integer ipType) {
            this.ipType = ipType;
            return this;
        }
        public Integer getIpType() {
            return this.ipType;
        }

        public CreateTimingSyntheticTaskRequestCommonSetting setIsOpenTrace(Boolean isOpenTrace) {
            this.isOpenTrace = isOpenTrace;
            return this;
        }
        public Boolean getIsOpenTrace() {
            return this.isOpenTrace;
        }

        public CreateTimingSyntheticTaskRequestCommonSetting setMonitorSamples(Integer monitorSamples) {
            this.monitorSamples = monitorSamples;
            return this;
        }
        public Integer getMonitorSamples() {
            return this.monitorSamples;
        }

        public CreateTimingSyntheticTaskRequestCommonSetting setTraceClientType(Integer traceClientType) {
            this.traceClientType = traceClientType;
            return this;
        }
        public Integer getTraceClientType() {
            return this.traceClientType;
        }

        public CreateTimingSyntheticTaskRequestCommonSetting setXtraceRegion(String xtraceRegion) {
            this.xtraceRegion = xtraceRegion;
            return this;
        }
        public String getXtraceRegion() {
            return this.xtraceRegion;
        }

    }

    public static class CreateTimingSyntheticTaskRequestCustomPeriod extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>22</p>
         */
        @NameInMap("EndHour")
        public Integer endHour;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>8</p>
         */
        @NameInMap("StartHour")
        public Integer startHour;

        public static CreateTimingSyntheticTaskRequestCustomPeriod build(java.util.Map<String, ?> map) throws Exception {
            CreateTimingSyntheticTaskRequestCustomPeriod self = new CreateTimingSyntheticTaskRequestCustomPeriod();
            return TeaModel.build(map, self);
        }

        public CreateTimingSyntheticTaskRequestCustomPeriod setEndHour(Integer endHour) {
            this.endHour = endHour;
            return this;
        }
        public Integer getEndHour() {
            return this.endHour;
        }

        public CreateTimingSyntheticTaskRequestCustomPeriod setStartHour(Integer startHour) {
            this.startHour = startHour;
            return this;
        }
        public Integer getStartHour() {
            return this.startHour;
        }

    }

    public static class CreateTimingSyntheticTaskRequestMonitorConfApiHTTPRequestBody extends TeaModel {
        /**
         * <p>The content of the request body. Format: JSON string. The parameter is required if the Type parameter is set to text/plain, application/json, application/xml, or text/html. Format: JSON string.</p>
         * 
         * <strong>example:</strong>
         * <p>{
         *   &quot;key1&quot;: &quot;value1&quot;,
         *   &quot;key2&quot;: &quot;value2&quot;
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

        public static CreateTimingSyntheticTaskRequestMonitorConfApiHTTPRequestBody build(java.util.Map<String, ?> map) throws Exception {
            CreateTimingSyntheticTaskRequestMonitorConfApiHTTPRequestBody self = new CreateTimingSyntheticTaskRequestMonitorConfApiHTTPRequestBody();
            return TeaModel.build(map, self);
        }

        public CreateTimingSyntheticTaskRequestMonitorConfApiHTTPRequestBody setContent(String content) {
            this.content = content;
            return this;
        }
        public String getContent() {
            return this.content;
        }

        public CreateTimingSyntheticTaskRequestMonitorConfApiHTTPRequestBody setType(String type) {
            this.type = type;
            return this;
        }
        public String getType() {
            return this.type;
        }

    }

    public static class CreateTimingSyntheticTaskRequestMonitorConfApiHTTP extends TeaModel {
        /**
         * <p>Specifies whether to verify the certificate. Default value: no.</p>
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
         * <p>The request method. Valid values: GET and POST.</p>
         * 
         * <strong>example:</strong>
         * <p>GET</p>
         */
        @NameInMap("Method")
        public String method;

        /**
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ProtocolAlpnProtocol")
        public Integer protocolAlpnProtocol;

        /**
         * <p>The HTTP request body.</p>
         */
        @NameInMap("RequestBody")
        public CreateTimingSyntheticTaskRequestMonitorConfApiHTTPRequestBody requestBody;

        /**
         * <p>The HTTP request header.</p>
         */
        @NameInMap("RequestHeaders")
        public java.util.Map<String, String> requestHeaders;

        /**
         * <p>The URL or request path for synthetic monitoring.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.demo.com/api/list">http://www.demo.com/api/list</a></p>
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

        public static CreateTimingSyntheticTaskRequestMonitorConfApiHTTP build(java.util.Map<String, ?> map) throws Exception {
            CreateTimingSyntheticTaskRequestMonitorConfApiHTTP self = new CreateTimingSyntheticTaskRequestMonitorConfApiHTTP();
            return TeaModel.build(map, self);
        }

        public CreateTimingSyntheticTaskRequestMonitorConfApiHTTP setCheckCert(Boolean checkCert) {
            this.checkCert = checkCert;
            return this;
        }
        public Boolean getCheckCert() {
            return this.checkCert;
        }

        public CreateTimingSyntheticTaskRequestMonitorConfApiHTTP setConnectTimeout(Long connectTimeout) {
            this.connectTimeout = connectTimeout;
            return this;
        }
        public Long getConnectTimeout() {
            return this.connectTimeout;
        }

        public CreateTimingSyntheticTaskRequestMonitorConfApiHTTP setMethod(String method) {
            this.method = method;
            return this;
        }
        public String getMethod() {
            return this.method;
        }

        public CreateTimingSyntheticTaskRequestMonitorConfApiHTTP setProtocolAlpnProtocol(Integer protocolAlpnProtocol) {
            this.protocolAlpnProtocol = protocolAlpnProtocol;
            return this;
        }
        public Integer getProtocolAlpnProtocol() {
            return this.protocolAlpnProtocol;
        }

        public CreateTimingSyntheticTaskRequestMonitorConfApiHTTP setRequestBody(CreateTimingSyntheticTaskRequestMonitorConfApiHTTPRequestBody requestBody) {
            this.requestBody = requestBody;
            return this;
        }
        public CreateTimingSyntheticTaskRequestMonitorConfApiHTTPRequestBody getRequestBody() {
            return this.requestBody;
        }

        public CreateTimingSyntheticTaskRequestMonitorConfApiHTTP setRequestHeaders(java.util.Map<String, String> requestHeaders) {
            this.requestHeaders = requestHeaders;
            return this;
        }
        public java.util.Map<String, String> getRequestHeaders() {
            return this.requestHeaders;
        }

        public CreateTimingSyntheticTaskRequestMonitorConfApiHTTP setTargetUrl(String targetUrl) {
            this.targetUrl = targetUrl;
            return this;
        }
        public String getTargetUrl() {
            return this.targetUrl;
        }

        public CreateTimingSyntheticTaskRequestMonitorConfApiHTTP setTimeout(Long timeout) {
            this.timeout = timeout;
            return this;
        }
        public Long getTimeout() {
            return this.timeout;
        }

    }

    public static class CreateTimingSyntheticTaskRequestMonitorConfFileDownload extends TeaModel {
        /**
         * <p>Unit: milliseconds. Minimum value: 1000. Maximum value: 120000. Default value: 5000.</p>
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
         * <p>The kernel type. Valid values:</p>
         * <ul>
         * <li>1: curl</li>
         * <li>0: WinInet</li>
         * </ul>
         * <p>Default value: 1</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("DownloadKernel")
        public Integer downloadKernel;

        /**
         * <p>Specifies whether to ignore CA certificate authentication errors. Valid values: 0: no. 1: yes. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("IgnoreCertificateAuthError")
        public Integer ignoreCertificateAuthError;

        /**
         * <p>Specifies whether to ignore certificate revocation errors. Valid values: 0: no. 1: yes. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("IgnoreCertificateCanceledError")
        public Integer ignoreCertificateCanceledError;

        /**
         * <p>Specifies whether to ignore certificate invalidity. Valid values: 0: no. 1: yes. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("IgnoreCertificateOutOfDateError")
        public Integer ignoreCertificateOutOfDateError;

        /**
         * <p>Specifies whether to ignore certificate status errors. Valid values: 0: no. 1: yes. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("IgnoreCertificateStatusError")
        public Integer ignoreCertificateStatusError;

        /**
         * <p>Specifies whether to ignore certificate incredibility. Valid values: 0: no. 1: yes. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("IgnoreCertificateUntrustworthyError")
        public Integer ignoreCertificateUntrustworthyError;

        /**
         * <p>Specifies whether to ignore certificate usage errors. Valid values: 0: no. 1: yes. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("IgnoreCertificateUsingError")
        public Integer ignoreCertificateUsingError;

        /**
         * <p>Specifies whether to ignore host invalidity. Valid values: 0: no. 1: yes. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
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
         * <p>Default value: 1</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("QuickProtocol")
        public Integer quickProtocol;

        /**
         * <p>Specifies whether to support redirection. Valid values: 0: no. 1: yes. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("Redirection")
        public Integer redirection;

        /**
         * <p>The URL that is used to download the file.</p>
         * <p>This parameter is required.</p>
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

        public static CreateTimingSyntheticTaskRequestMonitorConfFileDownload build(java.util.Map<String, ?> map) throws Exception {
            CreateTimingSyntheticTaskRequestMonitorConfFileDownload self = new CreateTimingSyntheticTaskRequestMonitorConfFileDownload();
            return TeaModel.build(map, self);
        }

        public CreateTimingSyntheticTaskRequestMonitorConfFileDownload setConnectionTimeout(Long connectionTimeout) {
            this.connectionTimeout = connectionTimeout;
            return this;
        }
        public Long getConnectionTimeout() {
            return this.connectionTimeout;
        }

        public CreateTimingSyntheticTaskRequestMonitorConfFileDownload setCustomHeaderContent(java.util.Map<String, String> customHeaderContent) {
            this.customHeaderContent = customHeaderContent;
            return this;
        }
        public java.util.Map<String, String> getCustomHeaderContent() {
            return this.customHeaderContent;
        }

        public CreateTimingSyntheticTaskRequestMonitorConfFileDownload setDownloadKernel(Integer downloadKernel) {
            this.downloadKernel = downloadKernel;
            return this;
        }
        public Integer getDownloadKernel() {
            return this.downloadKernel;
        }

        public CreateTimingSyntheticTaskRequestMonitorConfFileDownload setIgnoreCertificateAuthError(Integer ignoreCertificateAuthError) {
            this.ignoreCertificateAuthError = ignoreCertificateAuthError;
            return this;
        }
        public Integer getIgnoreCertificateAuthError() {
            return this.ignoreCertificateAuthError;
        }

        public CreateTimingSyntheticTaskRequestMonitorConfFileDownload setIgnoreCertificateCanceledError(Integer ignoreCertificateCanceledError) {
            this.ignoreCertificateCanceledError = ignoreCertificateCanceledError;
            return this;
        }
        public Integer getIgnoreCertificateCanceledError() {
            return this.ignoreCertificateCanceledError;
        }

        public CreateTimingSyntheticTaskRequestMonitorConfFileDownload setIgnoreCertificateOutOfDateError(Integer ignoreCertificateOutOfDateError) {
            this.ignoreCertificateOutOfDateError = ignoreCertificateOutOfDateError;
            return this;
        }
        public Integer getIgnoreCertificateOutOfDateError() {
            return this.ignoreCertificateOutOfDateError;
        }

        public CreateTimingSyntheticTaskRequestMonitorConfFileDownload setIgnoreCertificateStatusError(Integer ignoreCertificateStatusError) {
            this.ignoreCertificateStatusError = ignoreCertificateStatusError;
            return this;
        }
        public Integer getIgnoreCertificateStatusError() {
            return this.ignoreCertificateStatusError;
        }

        public CreateTimingSyntheticTaskRequestMonitorConfFileDownload setIgnoreCertificateUntrustworthyError(Integer ignoreCertificateUntrustworthyError) {
            this.ignoreCertificateUntrustworthyError = ignoreCertificateUntrustworthyError;
            return this;
        }
        public Integer getIgnoreCertificateUntrustworthyError() {
            return this.ignoreCertificateUntrustworthyError;
        }

        public CreateTimingSyntheticTaskRequestMonitorConfFileDownload setIgnoreCertificateUsingError(Integer ignoreCertificateUsingError) {
            this.ignoreCertificateUsingError = ignoreCertificateUsingError;
            return this;
        }
        public Integer getIgnoreCertificateUsingError() {
            return this.ignoreCertificateUsingError;
        }

        public CreateTimingSyntheticTaskRequestMonitorConfFileDownload setIgnoreInvalidHostError(Integer ignoreInvalidHostError) {
            this.ignoreInvalidHostError = ignoreInvalidHostError;
            return this;
        }
        public Integer getIgnoreInvalidHostError() {
            return this.ignoreInvalidHostError;
        }

        public CreateTimingSyntheticTaskRequestMonitorConfFileDownload setMonitorTimeout(Long monitorTimeout) {
            this.monitorTimeout = monitorTimeout;
            return this;
        }
        public Long getMonitorTimeout() {
            return this.monitorTimeout;
        }

        public CreateTimingSyntheticTaskRequestMonitorConfFileDownload setQuickProtocol(Integer quickProtocol) {
            this.quickProtocol = quickProtocol;
            return this;
        }
        public Integer getQuickProtocol() {
            return this.quickProtocol;
        }

        public CreateTimingSyntheticTaskRequestMonitorConfFileDownload setRedirection(Integer redirection) {
            this.redirection = redirection;
            return this;
        }
        public Integer getRedirection() {
            return this.redirection;
        }

        public CreateTimingSyntheticTaskRequestMonitorConfFileDownload setTargetUrl(String targetUrl) {
            this.targetUrl = targetUrl;
            return this;
        }
        public String getTargetUrl() {
            return this.targetUrl;
        }

        public CreateTimingSyntheticTaskRequestMonitorConfFileDownload setTransmissionSize(Long transmissionSize) {
            this.transmissionSize = transmissionSize;
            return this;
        }
        public Long getTransmissionSize() {
            return this.transmissionSize;
        }

        public CreateTimingSyntheticTaskRequestMonitorConfFileDownload setValidateKeywords(String validateKeywords) {
            this.validateKeywords = validateKeywords;
            return this;
        }
        public String getValidateKeywords() {
            return this.validateKeywords;
        }

        public CreateTimingSyntheticTaskRequestMonitorConfFileDownload setVerifyWay(Integer verifyWay) {
            this.verifyWay = verifyWay;
            return this;
        }
        public Integer getVerifyWay() {
            return this.verifyWay;
        }

        public CreateTimingSyntheticTaskRequestMonitorConfFileDownload setWhiteList(String whiteList) {
            this.whiteList = whiteList;
            return this;
        }
        public String getWhiteList() {
            return this.whiteList;
        }

    }

    public static class CreateTimingSyntheticTaskRequestMonitorConfNetDNS extends TeaModel {
        /**
         * <p>The IP version of the DNS server.</p>
         * <ul>
         * <li>0 (default value): IPv4.</li>
         * <li>1: IPv6.</li>
         * <li>2: A version is automatically selected.</li>
         * </ul>
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
         * <p>The DNS query method. Valid values:</p>
         * <ul>
         * <li>0 (default value): recursive</li>
         * <li>1: iterative</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("QueryMethod")
        public Integer queryMethod;

        /**
         * <p>The destination domain name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.aliyun.com">www.aliyun.com</a></p>
         */
        @NameInMap("TargetUrl")
        public String targetUrl;

        /**
         * <p>The timeout period for the DNS synthetic test. Unit: milliseconds. Minimum value: 1000. Maximum value: 45000. Default value: 5000.</p>
         * 
         * <strong>example:</strong>
         * <p>5000</p>
         */
        @NameInMap("Timeout")
        public Long timeout;

        public static CreateTimingSyntheticTaskRequestMonitorConfNetDNS build(java.util.Map<String, ?> map) throws Exception {
            CreateTimingSyntheticTaskRequestMonitorConfNetDNS self = new CreateTimingSyntheticTaskRequestMonitorConfNetDNS();
            return TeaModel.build(map, self);
        }

        public CreateTimingSyntheticTaskRequestMonitorConfNetDNS setDnsServerIpType(Integer dnsServerIpType) {
            this.dnsServerIpType = dnsServerIpType;
            return this;
        }
        public Integer getDnsServerIpType() {
            return this.dnsServerIpType;
        }

        public CreateTimingSyntheticTaskRequestMonitorConfNetDNS setNsServer(String nsServer) {
            this.nsServer = nsServer;
            return this;
        }
        public String getNsServer() {
            return this.nsServer;
        }

        public CreateTimingSyntheticTaskRequestMonitorConfNetDNS setQueryMethod(Integer queryMethod) {
            this.queryMethod = queryMethod;
            return this;
        }
        public Integer getQueryMethod() {
            return this.queryMethod;
        }

        public CreateTimingSyntheticTaskRequestMonitorConfNetDNS setTargetUrl(String targetUrl) {
            this.targetUrl = targetUrl;
            return this;
        }
        public String getTargetUrl() {
            return this.targetUrl;
        }

        public CreateTimingSyntheticTaskRequestMonitorConfNetDNS setTimeout(Long timeout) {
            this.timeout = timeout;
            return this;
        }
        public Long getTimeout() {
            return this.timeout;
        }

    }

    public static class CreateTimingSyntheticTaskRequestMonitorConfNetICMP extends TeaModel {
        /**
         * <p>The interval at which ICMP packets are sent. Unit: milliseconds. Minimum value: 200. Maximum value: 2000. Default value: 200.</p>
         * 
         * <strong>example:</strong>
         * <p>200</p>
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
         * <p>The destination IP address or domain name.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.example.com">www.example.com</a></p>
         */
        @NameInMap("TargetUrl")
        public String targetUrl;

        /**
         * <p>The timeout period for the ICMP synthetic test. Unit: milliseconds. Minimum value: 1000. Maximum value: 300000. Default value: 20000.</p>
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

        public static CreateTimingSyntheticTaskRequestMonitorConfNetICMP build(java.util.Map<String, ?> map) throws Exception {
            CreateTimingSyntheticTaskRequestMonitorConfNetICMP self = new CreateTimingSyntheticTaskRequestMonitorConfNetICMP();
            return TeaModel.build(map, self);
        }

        public CreateTimingSyntheticTaskRequestMonitorConfNetICMP setInterval(Long interval) {
            this.interval = interval;
            return this;
        }
        public Long getInterval() {
            return this.interval;
        }

        public CreateTimingSyntheticTaskRequestMonitorConfNetICMP setPackageNum(Integer packageNum) {
            this.packageNum = packageNum;
            return this;
        }
        public Integer getPackageNum() {
            return this.packageNum;
        }

        public CreateTimingSyntheticTaskRequestMonitorConfNetICMP setPackageSize(Integer packageSize) {
            this.packageSize = packageSize;
            return this;
        }
        public Integer getPackageSize() {
            return this.packageSize;
        }

        public CreateTimingSyntheticTaskRequestMonitorConfNetICMP setSplitPackage(Boolean splitPackage) {
            this.splitPackage = splitPackage;
            return this;
        }
        public Boolean getSplitPackage() {
            return this.splitPackage;
        }

        public CreateTimingSyntheticTaskRequestMonitorConfNetICMP setTargetUrl(String targetUrl) {
            this.targetUrl = targetUrl;
            return this;
        }
        public String getTargetUrl() {
            return this.targetUrl;
        }

        public CreateTimingSyntheticTaskRequestMonitorConfNetICMP setTimeout(Long timeout) {
            this.timeout = timeout;
            return this;
        }
        public Long getTimeout() {
            return this.timeout;
        }

        public CreateTimingSyntheticTaskRequestMonitorConfNetICMP setTracertEnable(Boolean tracertEnable) {
            this.tracertEnable = tracertEnable;
            return this;
        }
        public Boolean getTracertEnable() {
            return this.tracertEnable;
        }

        public CreateTimingSyntheticTaskRequestMonitorConfNetICMP setTracertNumMax(Integer tracertNumMax) {
            this.tracertNumMax = tracertNumMax;
            return this;
        }
        public Integer getTracertNumMax() {
            return this.tracertNumMax;
        }

        public CreateTimingSyntheticTaskRequestMonitorConfNetICMP setTracertTimeout(Long tracertTimeout) {
            this.tracertTimeout = tracertTimeout;
            return this;
        }
        public Long getTracertTimeout() {
            return this.tracertTimeout;
        }

    }

    public static class CreateTimingSyntheticTaskRequestMonitorConfNetTCP extends TeaModel {
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
         * <p>200</p>
         */
        @NameInMap("Interval")
        public Long interval;

        /**
         * <p>The IP address of the destination host.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.example.com">www.example.com</a></p>
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

        public static CreateTimingSyntheticTaskRequestMonitorConfNetTCP build(java.util.Map<String, ?> map) throws Exception {
            CreateTimingSyntheticTaskRequestMonitorConfNetTCP self = new CreateTimingSyntheticTaskRequestMonitorConfNetTCP();
            return TeaModel.build(map, self);
        }

        public CreateTimingSyntheticTaskRequestMonitorConfNetTCP setConnectTimes(Integer connectTimes) {
            this.connectTimes = connectTimes;
            return this;
        }
        public Integer getConnectTimes() {
            return this.connectTimes;
        }

        public CreateTimingSyntheticTaskRequestMonitorConfNetTCP setInterval(Long interval) {
            this.interval = interval;
            return this;
        }
        public Long getInterval() {
            return this.interval;
        }

        public CreateTimingSyntheticTaskRequestMonitorConfNetTCP setTargetUrl(String targetUrl) {
            this.targetUrl = targetUrl;
            return this;
        }
        public String getTargetUrl() {
            return this.targetUrl;
        }

        public CreateTimingSyntheticTaskRequestMonitorConfNetTCP setTimeout(Long timeout) {
            this.timeout = timeout;
            return this;
        }
        public Long getTimeout() {
            return this.timeout;
        }

        public CreateTimingSyntheticTaskRequestMonitorConfNetTCP setTracertEnable(Boolean tracertEnable) {
            this.tracertEnable = tracertEnable;
            return this;
        }
        public Boolean getTracertEnable() {
            return this.tracertEnable;
        }

        public CreateTimingSyntheticTaskRequestMonitorConfNetTCP setTracertNumMax(Integer tracertNumMax) {
            this.tracertNumMax = tracertNumMax;
            return this;
        }
        public Integer getTracertNumMax() {
            return this.tracertNumMax;
        }

        public CreateTimingSyntheticTaskRequestMonitorConfNetTCP setTracertTimeout(Long tracertTimeout) {
            this.tracertTimeout = tracertTimeout;
            return this;
        }
        public Long getTracertTimeout() {
            return this.tracertTimeout;
        }

    }

    public static class CreateTimingSyntheticTaskRequestMonitorConfStream extends TeaModel {
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
         * <p>12</p>
         */
        @NameInMap("PlayerType")
        public Integer playerType;

        /**
         * <p>The address type of the resource. Valid values:</p>
         * <ul>
         * <li>1: resource URL</li>
         * <li>0 (default value): page URL</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
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

        public static CreateTimingSyntheticTaskRequestMonitorConfStream build(java.util.Map<String, ?> map) throws Exception {
            CreateTimingSyntheticTaskRequestMonitorConfStream self = new CreateTimingSyntheticTaskRequestMonitorConfStream();
            return TeaModel.build(map, self);
        }

        public CreateTimingSyntheticTaskRequestMonitorConfStream setCustomHeaderContent(java.util.Map<String, String> customHeaderContent) {
            this.customHeaderContent = customHeaderContent;
            return this;
        }
        public java.util.Map<String, String> getCustomHeaderContent() {
            return this.customHeaderContent;
        }

        public CreateTimingSyntheticTaskRequestMonitorConfStream setPlayerType(Integer playerType) {
            this.playerType = playerType;
            return this;
        }
        public Integer getPlayerType() {
            return this.playerType;
        }

        public CreateTimingSyntheticTaskRequestMonitorConfStream setStreamAddressType(Integer streamAddressType) {
            this.streamAddressType = streamAddressType;
            return this;
        }
        public Integer getStreamAddressType() {
            return this.streamAddressType;
        }

        public CreateTimingSyntheticTaskRequestMonitorConfStream setStreamMonitorTimeout(Integer streamMonitorTimeout) {
            this.streamMonitorTimeout = streamMonitorTimeout;
            return this;
        }
        public Integer getStreamMonitorTimeout() {
            return this.streamMonitorTimeout;
        }

        public CreateTimingSyntheticTaskRequestMonitorConfStream setStreamType(Integer streamType) {
            this.streamType = streamType;
            return this;
        }
        public Integer getStreamType() {
            return this.streamType;
        }

        public CreateTimingSyntheticTaskRequestMonitorConfStream setTargetUrl(String targetUrl) {
            this.targetUrl = targetUrl;
            return this;
        }
        public String getTargetUrl() {
            return this.targetUrl;
        }

        public CreateTimingSyntheticTaskRequestMonitorConfStream setWhiteList(String whiteList) {
            this.whiteList = whiteList;
            return this;
        }
        public String getWhiteList() {
            return this.whiteList;
        }

    }

    public static class CreateTimingSyntheticTaskRequestMonitorConfWebsite extends TeaModel {
        /**
         * <p>Specifies whether to automatically scroll up and down the screen to load a page.</p>
         * <ul>
         * <li>0 (default value): no</li>
         * <li>1: yes</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>0</p>
         */
        @NameInMap("AutomaticScrolling")
        public Integer automaticScrolling;

        /**
         * <p>Specifies whether to create a custom header.</p>
         * <ul>
         * <li>0 (default value): No custom header is created.</li>
         * <li>1: A custom header is created for the first packet.</li>
         * <li>2: A custom header is created for all packets.</li>
         * </ul>
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
         * <p>Specifies whether to disable caching.</p>
         * <ul>
         * <li>0: no</li>
         * <li>1 (default value): yes</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("DisableCache")
        public Integer disableCache;

        /**
         * <p>Specifies whether to accept compressed files based on the HTTP Accept-Encoding request header. Valid values: 0: no. 1: yes. Default value: 0.</p>
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
         * <p><a href="http://www.example.com/a.jpg">www.example.com/a.jpg</a></p>
         */
        @NameInMap("ElementBlacklist")
        public String elementBlacklist;

        /**
         * <p>Specifies whether to exclude invalid IP addresses. Valid values: 0: yes. 1: no. Default value: 0.</p>
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
         * <p>10</p>
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
         * <p>Specifies whether to ignore certificate errors during certificate verification in the SSL handshake process and continue browsing. Valid values: 0: no. 1: yes. Default value: 1.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("IgnoreCertificateError")
        public Integer ignoreCertificateError;

        /**
         * <p>The monitoring timeout period. Unit: milliseconds. This parameter is optional. Default value: 20000.</p>
         * 
         * <strong>example:</strong>
         * <p>20000</p>
         */
        @NameInMap("MonitorTimeout")
        public Long monitorTimeout;

        /**
         * <p>Elements that are not included in the whitelist and appear on the page are tampered with. These elements can be pop-up ads, floating ads, and page redirection.</p>
         * <p>Format: \<domain name>:\<elements>. The elements can be wildcard masks. Separate multiple elements with vertical bars (|). Example: <a href="http://www.aliyun.com:%7C/cc/bb/a.gif%7C/vv/bb/cc.jpg">www.aliyun.com:|/cc/bb/a.gif|/vv/bb/cc.jpg</a>. It indicates that all elements that belong to the <a href="http://www.aliyun.com">www.aliyun.com</a> domain name except the basic documents, /cc/bb/a.gif, and /vv/bb/cc.jpg are tampered with.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="http://www.aliyun.com:%7C/cc/bb/a.gif%7C/vv/bb/cc.jpg">www.aliyun.com:|/cc/bb/a.gif|/vv/bb/cc.jpg</a></p>
         */
        @NameInMap("PageTamper")
        public String pageTamper;

        /**
         * <p>Specifies whether to continue browsing after redirection. Valid values: 0: no. 1: yes. Default value: 1.</p>
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
         * <p>The URL of the website.</p>
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p><a href="https://www.aliyun.com">https://www.aliyun.com</a></p>
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

        public static CreateTimingSyntheticTaskRequestMonitorConfWebsite build(java.util.Map<String, ?> map) throws Exception {
            CreateTimingSyntheticTaskRequestMonitorConfWebsite self = new CreateTimingSyntheticTaskRequestMonitorConfWebsite();
            return TeaModel.build(map, self);
        }

        public CreateTimingSyntheticTaskRequestMonitorConfWebsite setAutomaticScrolling(Integer automaticScrolling) {
            this.automaticScrolling = automaticScrolling;
            return this;
        }
        public Integer getAutomaticScrolling() {
            return this.automaticScrolling;
        }

        public CreateTimingSyntheticTaskRequestMonitorConfWebsite setCustomHeader(Integer customHeader) {
            this.customHeader = customHeader;
            return this;
        }
        public Integer getCustomHeader() {
            return this.customHeader;
        }

        public CreateTimingSyntheticTaskRequestMonitorConfWebsite setCustomHeaderContent(java.util.Map<String, String> customHeaderContent) {
            this.customHeaderContent = customHeaderContent;
            return this;
        }
        public java.util.Map<String, String> getCustomHeaderContent() {
            return this.customHeaderContent;
        }

        public CreateTimingSyntheticTaskRequestMonitorConfWebsite setDNSHijackWhitelist(String DNSHijackWhitelist) {
            this.DNSHijackWhitelist = DNSHijackWhitelist;
            return this;
        }
        public String getDNSHijackWhitelist() {
            return this.DNSHijackWhitelist;
        }

        public CreateTimingSyntheticTaskRequestMonitorConfWebsite setDisableCache(Integer disableCache) {
            this.disableCache = disableCache;
            return this;
        }
        public Integer getDisableCache() {
            return this.disableCache;
        }

        public CreateTimingSyntheticTaskRequestMonitorConfWebsite setDisableCompression(Integer disableCompression) {
            this.disableCompression = disableCompression;
            return this;
        }
        public Integer getDisableCompression() {
            return this.disableCompression;
        }

        public CreateTimingSyntheticTaskRequestMonitorConfWebsite setElementBlacklist(String elementBlacklist) {
            this.elementBlacklist = elementBlacklist;
            return this;
        }
        public String getElementBlacklist() {
            return this.elementBlacklist;
        }

        public CreateTimingSyntheticTaskRequestMonitorConfWebsite setFilterInvalidIP(Integer filterInvalidIP) {
            this.filterInvalidIP = filterInvalidIP;
            return this;
        }
        public Integer getFilterInvalidIP() {
            return this.filterInvalidIP;
        }

        public CreateTimingSyntheticTaskRequestMonitorConfWebsite setFlowHijackJumpTimes(Integer flowHijackJumpTimes) {
            this.flowHijackJumpTimes = flowHijackJumpTimes;
            return this;
        }
        public Integer getFlowHijackJumpTimes() {
            return this.flowHijackJumpTimes;
        }

        public CreateTimingSyntheticTaskRequestMonitorConfWebsite setFlowHijackLogo(String flowHijackLogo) {
            this.flowHijackLogo = flowHijackLogo;
            return this;
        }
        public String getFlowHijackLogo() {
            return this.flowHijackLogo;
        }

        public CreateTimingSyntheticTaskRequestMonitorConfWebsite setIgnoreCertificateError(Integer ignoreCertificateError) {
            this.ignoreCertificateError = ignoreCertificateError;
            return this;
        }
        public Integer getIgnoreCertificateError() {
            return this.ignoreCertificateError;
        }

        public CreateTimingSyntheticTaskRequestMonitorConfWebsite setMonitorTimeout(Long monitorTimeout) {
            this.monitorTimeout = monitorTimeout;
            return this;
        }
        public Long getMonitorTimeout() {
            return this.monitorTimeout;
        }

        public CreateTimingSyntheticTaskRequestMonitorConfWebsite setPageTamper(String pageTamper) {
            this.pageTamper = pageTamper;
            return this;
        }
        public String getPageTamper() {
            return this.pageTamper;
        }

        public CreateTimingSyntheticTaskRequestMonitorConfWebsite setRedirection(Integer redirection) {
            this.redirection = redirection;
            return this;
        }
        public Integer getRedirection() {
            return this.redirection;
        }

        public CreateTimingSyntheticTaskRequestMonitorConfWebsite setSlowElementThreshold(Long slowElementThreshold) {
            this.slowElementThreshold = slowElementThreshold;
            return this;
        }
        public Long getSlowElementThreshold() {
            return this.slowElementThreshold;
        }

        public CreateTimingSyntheticTaskRequestMonitorConfWebsite setTargetUrl(String targetUrl) {
            this.targetUrl = targetUrl;
            return this;
        }
        public String getTargetUrl() {
            return this.targetUrl;
        }

        public CreateTimingSyntheticTaskRequestMonitorConfWebsite setVerifyStringBlacklist(String verifyStringBlacklist) {
            this.verifyStringBlacklist = verifyStringBlacklist;
            return this;
        }
        public String getVerifyStringBlacklist() {
            return this.verifyStringBlacklist;
        }

        public CreateTimingSyntheticTaskRequestMonitorConfWebsite setVerifyStringWhitelist(String verifyStringWhitelist) {
            this.verifyStringWhitelist = verifyStringWhitelist;
            return this;
        }
        public String getVerifyStringWhitelist() {
            return this.verifyStringWhitelist;
        }

        public CreateTimingSyntheticTaskRequestMonitorConfWebsite setWaitCompletionTime(Long waitCompletionTime) {
            this.waitCompletionTime = waitCompletionTime;
            return this;
        }
        public Long getWaitCompletionTime() {
            return this.waitCompletionTime;
        }

    }

    public static class CreateTimingSyntheticTaskRequestMonitorConf extends TeaModel {
        /**
         * <p>The parameters of the HTTP(S) synthetic test.</p>
         */
        @NameInMap("ApiHTTP")
        public CreateTimingSyntheticTaskRequestMonitorConfApiHTTP apiHTTP;

        /**
         * <p>The parameters of file downloading.</p>
         */
        @NameInMap("FileDownload")
        public CreateTimingSyntheticTaskRequestMonitorConfFileDownload fileDownload;

        /**
         * <p>The parameters of the DNS synthetic test. This parameter is required if the TaskType parameter is set to 3.</p>
         */
        @NameInMap("NetDNS")
        public CreateTimingSyntheticTaskRequestMonitorConfNetDNS netDNS;

        /**
         * <p>The parameters of the ICMP synthetic test. This parameter is required if the TaskType parameter is set to 1.</p>
         */
        @NameInMap("NetICMP")
        public CreateTimingSyntheticTaskRequestMonitorConfNetICMP netICMP;

        /**
         * <p>The parameters of the TCP synthetic test. This parameter is required if the TaskType parameter is set to 2.</p>
         */
        @NameInMap("NetTCP")
        public CreateTimingSyntheticTaskRequestMonitorConfNetTCP netTCP;

        /**
         * <p>The parameters of the streaming-media synthetic test.</p>
         */
        @NameInMap("Stream")
        public CreateTimingSyntheticTaskRequestMonitorConfStream stream;

        /**
         * <p>The parameters of the website speed measurement.</p>
         */
        @NameInMap("Website")
        public CreateTimingSyntheticTaskRequestMonitorConfWebsite website;

        public static CreateTimingSyntheticTaskRequestMonitorConf build(java.util.Map<String, ?> map) throws Exception {
            CreateTimingSyntheticTaskRequestMonitorConf self = new CreateTimingSyntheticTaskRequestMonitorConf();
            return TeaModel.build(map, self);
        }

        public CreateTimingSyntheticTaskRequestMonitorConf setApiHTTP(CreateTimingSyntheticTaskRequestMonitorConfApiHTTP apiHTTP) {
            this.apiHTTP = apiHTTP;
            return this;
        }
        public CreateTimingSyntheticTaskRequestMonitorConfApiHTTP getApiHTTP() {
            return this.apiHTTP;
        }

        public CreateTimingSyntheticTaskRequestMonitorConf setFileDownload(CreateTimingSyntheticTaskRequestMonitorConfFileDownload fileDownload) {
            this.fileDownload = fileDownload;
            return this;
        }
        public CreateTimingSyntheticTaskRequestMonitorConfFileDownload getFileDownload() {
            return this.fileDownload;
        }

        public CreateTimingSyntheticTaskRequestMonitorConf setNetDNS(CreateTimingSyntheticTaskRequestMonitorConfNetDNS netDNS) {
            this.netDNS = netDNS;
            return this;
        }
        public CreateTimingSyntheticTaskRequestMonitorConfNetDNS getNetDNS() {
            return this.netDNS;
        }

        public CreateTimingSyntheticTaskRequestMonitorConf setNetICMP(CreateTimingSyntheticTaskRequestMonitorConfNetICMP netICMP) {
            this.netICMP = netICMP;
            return this;
        }
        public CreateTimingSyntheticTaskRequestMonitorConfNetICMP getNetICMP() {
            return this.netICMP;
        }

        public CreateTimingSyntheticTaskRequestMonitorConf setNetTCP(CreateTimingSyntheticTaskRequestMonitorConfNetTCP netTCP) {
            this.netTCP = netTCP;
            return this;
        }
        public CreateTimingSyntheticTaskRequestMonitorConfNetTCP getNetTCP() {
            return this.netTCP;
        }

        public CreateTimingSyntheticTaskRequestMonitorConf setStream(CreateTimingSyntheticTaskRequestMonitorConfStream stream) {
            this.stream = stream;
            return this;
        }
        public CreateTimingSyntheticTaskRequestMonitorConfStream getStream() {
            return this.stream;
        }

        public CreateTimingSyntheticTaskRequestMonitorConf setWebsite(CreateTimingSyntheticTaskRequestMonitorConfWebsite website) {
            this.website = website;
            return this;
        }
        public CreateTimingSyntheticTaskRequestMonitorConfWebsite getWebsite() {
            return this.website;
        }

    }

    public static class CreateTimingSyntheticTaskRequestMonitors extends TeaModel {
        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>100023</p>
         */
        @NameInMap("CityCode")
        public String cityCode;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("ClientType")
        public Integer clientType;

        /**
         * <p>This parameter is required.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("OperatorCode")
        public String operatorCode;

        public static CreateTimingSyntheticTaskRequestMonitors build(java.util.Map<String, ?> map) throws Exception {
            CreateTimingSyntheticTaskRequestMonitors self = new CreateTimingSyntheticTaskRequestMonitors();
            return TeaModel.build(map, self);
        }

        public CreateTimingSyntheticTaskRequestMonitors setCityCode(String cityCode) {
            this.cityCode = cityCode;
            return this;
        }
        public String getCityCode() {
            return this.cityCode;
        }

        public CreateTimingSyntheticTaskRequestMonitors setClientType(Integer clientType) {
            this.clientType = clientType;
            return this;
        }
        public Integer getClientType() {
            return this.clientType;
        }

        public CreateTimingSyntheticTaskRequestMonitors setOperatorCode(String operatorCode) {
            this.operatorCode = operatorCode;
            return this;
        }
        public String getOperatorCode() {
            return this.operatorCode;
        }

    }

    public static class CreateTimingSyntheticTaskRequestTags extends TeaModel {
        /**
         * <strong>example:</strong>
         * <p>Key</p>
         */
        @NameInMap("Key")
        public String key;

        /**
         * <strong>example:</strong>
         * <p>500</p>
         */
        @NameInMap("Value")
        public String value;

        public static CreateTimingSyntheticTaskRequestTags build(java.util.Map<String, ?> map) throws Exception {
            CreateTimingSyntheticTaskRequestTags self = new CreateTimingSyntheticTaskRequestTags();
            return TeaModel.build(map, self);
        }

        public CreateTimingSyntheticTaskRequestTags setKey(String key) {
            this.key = key;
            return this;
        }
        public String getKey() {
            return this.key;
        }

        public CreateTimingSyntheticTaskRequestTags setValue(String value) {
            this.value = value;
            return this;
        }
        public String getValue() {
            return this.value;
        }

    }

}
