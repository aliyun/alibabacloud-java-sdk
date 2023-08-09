// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class UpdateTimingSyntheticTaskRequest extends TeaModel {
    @NameInMap("AvailableAssertions")
    public java.util.List<UpdateTimingSyntheticTaskRequestAvailableAssertions> availableAssertions;

    @NameInMap("CommonSetting")
    public UpdateTimingSyntheticTaskRequestCommonSetting commonSetting;

    @NameInMap("CustomPeriod")
    public UpdateTimingSyntheticTaskRequestCustomPeriod customPeriod;

    @NameInMap("Frequency")
    public String frequency;

    @NameInMap("MonitorCategory")
    public Integer monitorCategory;

    @NameInMap("MonitorConf")
    public UpdateTimingSyntheticTaskRequestMonitorConf monitorConf;

    @NameInMap("Monitors")
    public java.util.List<UpdateTimingSyntheticTaskRequestMonitors> monitors;

    @NameInMap("Name")
    public String name;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("Tags")
    public java.util.List<UpdateTimingSyntheticTaskRequestTags> tags;

    @NameInMap("TaskId")
    public String taskId;

    @NameInMap("TaskType")
    public Integer taskType;

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

    public UpdateTimingSyntheticTaskRequest setMonitorCategory(Integer monitorCategory) {
        this.monitorCategory = monitorCategory;
        return this;
    }
    public Integer getMonitorCategory() {
        return this.monitorCategory;
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

    public UpdateTimingSyntheticTaskRequest setTaskType(Integer taskType) {
        this.taskType = taskType;
        return this;
    }
    public Integer getTaskType() {
        return this.taskType;
    }

    public static class UpdateTimingSyntheticTaskRequestAvailableAssertions extends TeaModel {
        @NameInMap("Expect")
        public String expect;

        @NameInMap("Operator")
        public String operator;

        @NameInMap("Target")
        public String target;

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
        @NameInMap("Domain")
        public String domain;

        @NameInMap("IpType")
        public Integer ipType;

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
        @NameInMap("Hosts")
        public java.util.List<UpdateTimingSyntheticTaskRequestCommonSettingCustomHostHosts> hosts;

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
        @NameInMap("CustomHost")
        public UpdateTimingSyntheticTaskRequestCommonSettingCustomHost customHost;

        @NameInMap("IpType")
        public Integer ipType;

        @NameInMap("MonitorSamples")
        public Integer monitorSamples;

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

        public UpdateTimingSyntheticTaskRequestCommonSetting setMonitorSamples(Integer monitorSamples) {
            this.monitorSamples = monitorSamples;
            return this;
        }
        public Integer getMonitorSamples() {
            return this.monitorSamples;
        }

    }

    public static class UpdateTimingSyntheticTaskRequestCustomPeriod extends TeaModel {
        @NameInMap("EndHour")
        public Integer endHour;

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
        @NameInMap("Content")
        public String content;

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
        @NameInMap("ConnectTimeout")
        public Long connectTimeout;

        @NameInMap("Method")
        public String method;

        @NameInMap("RequestBody")
        public UpdateTimingSyntheticTaskRequestMonitorConfApiHTTPRequestBody requestBody;

        @NameInMap("RequestHeaders")
        public java.util.Map<String, String> requestHeaders;

        @NameInMap("TargetUrl")
        public String targetUrl;

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
        @NameInMap("ConnectionTimeout")
        public Long connectionTimeout;

        @NameInMap("CustomHeaderContent")
        public java.util.Map<String, String> customHeaderContent;

        @NameInMap("DownloadKernel")
        public Integer downloadKernel;

        @NameInMap("IgnoreCertificateAuthError")
        public Integer ignoreCertificateAuthError;

        @NameInMap("IgnoreCertificateCanceledError")
        public Integer ignoreCertificateCanceledError;

        @NameInMap("IgnoreCertificateOutOfDateError")
        public Integer ignoreCertificateOutOfDateError;

        @NameInMap("IgnoreCertificateStatusError")
        public Integer ignoreCertificateStatusError;

        @NameInMap("IgnoreCertificateUntrustworthyError")
        public Integer ignoreCertificateUntrustworthyError;

        @NameInMap("IgnoreCertificateUsingError")
        public Integer ignoreCertificateUsingError;

        @NameInMap("IgnoreInvalidHostError")
        public Integer ignoreInvalidHostError;

        @NameInMap("MonitorTimeout")
        public Long monitorTimeout;

        @NameInMap("QuickProtocol")
        public Integer quickProtocol;

        @NameInMap("Redirection")
        public Integer redirection;

        @NameInMap("TargetUrl")
        public String targetUrl;

        @NameInMap("TransmissionSize")
        public Long transmissionSize;

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

    }

    public static class UpdateTimingSyntheticTaskRequestMonitorConfNetDNS extends TeaModel {
        @NameInMap("Dig")
        public Integer dig;

        @NameInMap("DnsServerIpType")
        public Integer dnsServerIpType;

        @NameInMap("NsServer")
        public String nsServer;

        @NameInMap("QueryMethod")
        public Integer queryMethod;

        @NameInMap("TargetUrl")
        public String targetUrl;

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
        @NameInMap("Interval")
        public Long interval;

        @NameInMap("PackageNum")
        public Integer packageNum;

        @NameInMap("PackageSize")
        public Integer packageSize;

        @NameInMap("SplitPackage")
        public Boolean splitPackage;

        @NameInMap("TargetUrl")
        public String targetUrl;

        @NameInMap("Timeout")
        public Long timeout;

        @NameInMap("TracertEnable")
        public Boolean tracertEnable;

        @NameInMap("TracertNumMax")
        public Integer tracertNumMax;

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
        @NameInMap("ConnectTimes")
        public Integer connectTimes;

        @NameInMap("Interval")
        public Long interval;

        @NameInMap("TargetUrl")
        public String targetUrl;

        @NameInMap("Timeout")
        public Long timeout;

        @NameInMap("TracertEnable")
        public Boolean tracertEnable;

        @NameInMap("TracertNumMax")
        public Integer tracertNumMax;

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

    public static class UpdateTimingSyntheticTaskRequestMonitorConfWebsite extends TeaModel {
        @NameInMap("AutomaticScrolling")
        public Integer automaticScrolling;

        @NameInMap("CustomHeader")
        public Integer customHeader;

        @NameInMap("CustomHeaderContent")
        public java.util.Map<String, String> customHeaderContent;

        @NameInMap("DisableCache")
        public Integer disableCache;

        @NameInMap("DisableCompression")
        public Integer disableCompression;

        @NameInMap("FilterInvalidIP")
        public Integer filterInvalidIP;

        @NameInMap("IgnoreCertificateError")
        public Integer ignoreCertificateError;

        @NameInMap("MonitorTimeout")
        public Long monitorTimeout;

        @NameInMap("Redirection")
        public Integer redirection;

        @NameInMap("SlowElementThreshold")
        public Long slowElementThreshold;

        @NameInMap("TargetUrl")
        public String targetUrl;

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

        public UpdateTimingSyntheticTaskRequestMonitorConfWebsite setFilterInvalidIP(Integer filterInvalidIP) {
            this.filterInvalidIP = filterInvalidIP;
            return this;
        }
        public Integer getFilterInvalidIP() {
            return this.filterInvalidIP;
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

        public UpdateTimingSyntheticTaskRequestMonitorConfWebsite setWaitCompletionTime(Long waitCompletionTime) {
            this.waitCompletionTime = waitCompletionTime;
            return this;
        }
        public Long getWaitCompletionTime() {
            return this.waitCompletionTime;
        }

    }

    public static class UpdateTimingSyntheticTaskRequestMonitorConf extends TeaModel {
        @NameInMap("ApiHTTP")
        public UpdateTimingSyntheticTaskRequestMonitorConfApiHTTP apiHTTP;

        @NameInMap("FileDownload")
        public UpdateTimingSyntheticTaskRequestMonitorConfFileDownload fileDownload;

        @NameInMap("NetDNS")
        public UpdateTimingSyntheticTaskRequestMonitorConfNetDNS netDNS;

        @NameInMap("NetICMP")
        public UpdateTimingSyntheticTaskRequestMonitorConfNetICMP netICMP;

        @NameInMap("NetTCP")
        public UpdateTimingSyntheticTaskRequestMonitorConfNetTCP netTCP;

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

        public UpdateTimingSyntheticTaskRequestMonitorConf setWebsite(UpdateTimingSyntheticTaskRequestMonitorConfWebsite website) {
            this.website = website;
            return this;
        }
        public UpdateTimingSyntheticTaskRequestMonitorConfWebsite getWebsite() {
            return this.website;
        }

    }

    public static class UpdateTimingSyntheticTaskRequestMonitors extends TeaModel {
        @NameInMap("CityCode")
        public String cityCode;

        @NameInMap("ClientType")
        public Integer clientType;

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
        @NameInMap("Key")
        public String key;

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
