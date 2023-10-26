// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.arms20190808.models;

import com.aliyun.tea.*;

public class GetTimingSyntheticTaskResponseBody extends TeaModel {
    @NameInMap("Code")
    public Long code;

    @NameInMap("Data")
    public GetTimingSyntheticTaskResponseBodyData data;

    @NameInMap("Message")
    public String message;

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
        @NameInMap("Expect")
        public String expect;

        @NameInMap("Operator")
        public String operator;

        @NameInMap("Target")
        public String target;

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
        @NameInMap("Domain")
        public String domain;

        @NameInMap("IpType")
        public Integer ipType;

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
        @NameInMap("Hosts")
        public java.util.List<GetTimingSyntheticTaskResponseBodyDataCommonSettingCustomHostHosts> hosts;

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

    public static class GetTimingSyntheticTaskResponseBodyDataCommonSetting extends TeaModel {
        @NameInMap("CustomHost")
        public GetTimingSyntheticTaskResponseBodyDataCommonSettingCustomHost customHost;

        @NameInMap("IpType")
        public Integer ipType;

        @NameInMap("IsOpenTrace")
        public Boolean isOpenTrace;

        @NameInMap("MonitorSamples")
        public Integer monitorSamples;

        @NameInMap("TraceClientType")
        public Integer traceClientType;

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
        @NameInMap("EndHour")
        public Long endHour;

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
        @NameInMap("Content")
        public String content;

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
        @NameInMap("ConnectTimeout")
        public Long connectTimeout;

        @NameInMap("Method")
        public String method;

        @NameInMap("RequestBody")
        public GetTimingSyntheticTaskResponseBodyDataMonitorConfApiHTTPRequestBody requestBody;

        @NameInMap("RequestHeaders")
        public java.util.Map<String, String> requestHeaders;

        @NameInMap("TargetUrl")
        public String targetUrl;

        @NameInMap("Timeout")
        public Long timeout;

        public static GetTimingSyntheticTaskResponseBodyDataMonitorConfApiHTTP build(java.util.Map<String, ?> map) throws Exception {
            GetTimingSyntheticTaskResponseBodyDataMonitorConfApiHTTP self = new GetTimingSyntheticTaskResponseBodyDataMonitorConfApiHTTP();
            return TeaModel.build(map, self);
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
        @NameInMap("ConnectionTimeout")
        public Long connectionTimeout;

        @NameInMap("CustomHeaderContent")
        public java.util.Map<String, String> customHeaderContent;

        @NameInMap("DownloadKernel")
        public Long downloadKernel;

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
        public Long quickProtocol;

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
        @NameInMap("Interval")
        public Integer interval;

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
        public Integer monitorTimeout;

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
        @NameInMap("ApiHTTP")
        public GetTimingSyntheticTaskResponseBodyDataMonitorConfApiHTTP apiHTTP;

        @NameInMap("FileDownload")
        public GetTimingSyntheticTaskResponseBodyDataMonitorConfFileDownload fileDownload;

        @NameInMap("NetDNS")
        public GetTimingSyntheticTaskResponseBodyDataMonitorConfNetDNS netDNS;

        @NameInMap("NetICMP")
        public GetTimingSyntheticTaskResponseBodyDataMonitorConfNetICMP netICMP;

        @NameInMap("NetTCP")
        public GetTimingSyntheticTaskResponseBodyDataMonitorConfNetTCP netTCP;

        @NameInMap("Stream")
        public GetTimingSyntheticTaskResponseBodyDataMonitorConfStream stream;

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
        @NameInMap("CityCode")
        public String cityCode;

        @NameInMap("ClientType")
        public Integer clientType;

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
        @NameInMap("Key")
        public String key;

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
        @NameInMap("AvailableAssertions")
        public java.util.List<GetTimingSyntheticTaskResponseBodyDataAvailableAssertions> availableAssertions;

        @NameInMap("CommonSetting")
        public GetTimingSyntheticTaskResponseBodyDataCommonSetting commonSetting;

        @NameInMap("CustomPeriod")
        public GetTimingSyntheticTaskResponseBodyDataCustomPeriod customPeriod;

        @NameInMap("Frequency")
        public String frequency;

        @NameInMap("MonitorCategory")
        public Long monitorCategory;

        @NameInMap("MonitorConf")
        public GetTimingSyntheticTaskResponseBodyDataMonitorConf monitorConf;

        @NameInMap("Monitors")
        public java.util.List<GetTimingSyntheticTaskResponseBodyDataMonitors> monitors;

        @NameInMap("Name")
        public String name;

        @NameInMap("RegionId")
        public String regionId;

        @NameInMap("ResourceGroupId")
        public String resourceGroupId;

        @NameInMap("Status")
        public String status;

        @NameInMap("Tags")
        public java.util.List<GetTimingSyntheticTaskResponseBodyDataTags> tags;

        @NameInMap("TaskId")
        public String taskId;

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
