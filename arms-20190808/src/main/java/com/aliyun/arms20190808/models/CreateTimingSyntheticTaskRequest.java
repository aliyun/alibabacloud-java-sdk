// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class CreateTimingSyntheticTaskRequest extends TeaModel {
    @NameInMap("AvailableAssertions")
    public java.util.List<CreateTimingSyntheticTaskRequestAvailableAssertions> availableAssertions;

    @NameInMap("CommonSetting")
    public CreateTimingSyntheticTaskRequestCommonSetting commonSetting;

    @NameInMap("CustomPeriod")
    public CreateTimingSyntheticTaskRequestCustomPeriod customPeriod;

    @NameInMap("Frequency")
    public String frequency;

    @NameInMap("MonitorCategory")
    public Integer monitorCategory;

    @NameInMap("MonitorConf")
    public CreateTimingSyntheticTaskRequestMonitorConf monitorConf;

    @NameInMap("Monitors")
    public java.util.List<CreateTimingSyntheticTaskRequestMonitors> monitors;

    @NameInMap("Name")
    public String name;

    @NameInMap("RegionId")
    public String regionId;

    @NameInMap("ResourceGroupId")
    public String resourceGroupId;

    @NameInMap("Tags")
    public java.util.List<CreateTimingSyntheticTaskRequestTags> tags;

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
        @NameInMap("Expect")
        public String expect;

        @NameInMap("Operator")
        public String operator;

        @NameInMap("Target")
        public String target;

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
        @NameInMap("Domain")
        public String domain;

        @NameInMap("IpType")
        public Integer ipType;

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
        @NameInMap("Hosts")
        public java.util.List<CreateTimingSyntheticTaskRequestCommonSettingCustomHostHosts> hosts;

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

    public static class CreateTimingSyntheticTaskRequestCommonSetting extends TeaModel {
        @NameInMap("CustomHost")
        public CreateTimingSyntheticTaskRequestCommonSettingCustomHost customHost;

        @NameInMap("IpType")
        public Integer ipType;

        @NameInMap("MonitorSamples")
        public Integer monitorSamples;

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

        public CreateTimingSyntheticTaskRequestCommonSetting setIpType(Integer ipType) {
            this.ipType = ipType;
            return this;
        }
        public Integer getIpType() {
            return this.ipType;
        }

        public CreateTimingSyntheticTaskRequestCommonSetting setMonitorSamples(Integer monitorSamples) {
            this.monitorSamples = monitorSamples;
            return this;
        }
        public Integer getMonitorSamples() {
            return this.monitorSamples;
        }

    }

    public static class CreateTimingSyntheticTaskRequestCustomPeriod extends TeaModel {
        @NameInMap("EndHour")
        public Integer endHour;

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
        @NameInMap("Content")
        public String content;

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
        @NameInMap("ConnectTimeout")
        public Long connectTimeout;

        @NameInMap("Method")
        public String method;

        @NameInMap("RequestBody")
        public CreateTimingSyntheticTaskRequestMonitorConfApiHTTPRequestBody requestBody;

        @NameInMap("RequestHeaders")
        public java.util.Map<String, String> requestHeaders;

        @NameInMap("TargetUrl")
        public String targetUrl;

        @NameInMap("Timeout")
        public Long timeout;

        public static CreateTimingSyntheticTaskRequestMonitorConfApiHTTP build(java.util.Map<String, ?> map) throws Exception {
            CreateTimingSyntheticTaskRequestMonitorConfApiHTTP self = new CreateTimingSyntheticTaskRequestMonitorConfApiHTTP();
            return TeaModel.build(map, self);
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

        @NameInMap("ValidateKeywords")
        public String validateKeywords;

        @NameInMap("VerifyWay")
        public Integer verifyWay;

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
        @NameInMap("CustomHeaderContent")
        public java.util.Map<String, String> customHeaderContent;

        @NameInMap("PlayerType")
        public Integer playerType;

        @NameInMap("StreamAddressType")
        public Integer streamAddressType;

        @NameInMap("StreamMonitorTimeout")
        public Integer streamMonitorTimeout;

        @NameInMap("StreamType")
        public Integer streamType;

        @NameInMap("TargetUrl")
        public String targetUrl;

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
        @NameInMap("AutomaticScrolling")
        public Integer automaticScrolling;

        @NameInMap("CustomHeader")
        public Integer customHeader;

        @NameInMap("CustomHeaderContent")
        public java.util.Map<String, String> customHeaderContent;

        @NameInMap("DNSHijackWhitelist")
        public String DNSHijackWhitelist;

        @NameInMap("DisableCache")
        public Integer disableCache;

        @NameInMap("DisableCompression")
        public Integer disableCompression;

        @NameInMap("ElementBlacklist")
        public String elementBlacklist;

        @NameInMap("FilterInvalidIP")
        public Integer filterInvalidIP;

        @NameInMap("FlowHijackJumpTimes")
        public Integer flowHijackJumpTimes;

        @NameInMap("FlowHijackLogo")
        public String flowHijackLogo;

        @NameInMap("IgnoreCertificateError")
        public Integer ignoreCertificateError;

        @NameInMap("MonitorTimeout")
        public Long monitorTimeout;

        @NameInMap("PageTamper")
        public String pageTamper;

        @NameInMap("Redirection")
        public Integer redirection;

        @NameInMap("SlowElementThreshold")
        public Long slowElementThreshold;

        @NameInMap("TargetUrl")
        public String targetUrl;

        @NameInMap("VerifyStringBlacklist")
        public String verifyStringBlacklist;

        @NameInMap("VerifyStringWhitelist")
        public String verifyStringWhitelist;

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
        @NameInMap("ApiHTTP")
        public CreateTimingSyntheticTaskRequestMonitorConfApiHTTP apiHTTP;

        @NameInMap("FileDownload")
        public CreateTimingSyntheticTaskRequestMonitorConfFileDownload fileDownload;

        @NameInMap("NetDNS")
        public CreateTimingSyntheticTaskRequestMonitorConfNetDNS netDNS;

        @NameInMap("NetICMP")
        public CreateTimingSyntheticTaskRequestMonitorConfNetICMP netICMP;

        @NameInMap("NetTCP")
        public CreateTimingSyntheticTaskRequestMonitorConfNetTCP netTCP;

        @NameInMap("Stream")
        public CreateTimingSyntheticTaskRequestMonitorConfStream stream;

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
        @NameInMap("CityCode")
        public String cityCode;

        @NameInMap("ClientType")
        public Integer clientType;

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
        @NameInMap("Key")
        public String key;

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
