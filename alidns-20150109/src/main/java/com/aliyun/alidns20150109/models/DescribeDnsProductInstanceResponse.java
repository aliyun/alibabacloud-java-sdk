// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDnsProductInstanceResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("InstanceId")
    @Validation(required = true)
    public String instanceId;

    @NameInMap("VersionCode")
    @Validation(required = true)
    public String versionCode;

    @NameInMap("VersionName")
    @Validation(required = true)
    public String versionName;

    @NameInMap("StartTime")
    @Validation(required = true)
    public String startTime;

    @NameInMap("StartTimestamp")
    @Validation(required = true)
    public Long startTimestamp;

    @NameInMap("EndTime")
    @Validation(required = true)
    public String endTime;

    @NameInMap("EndTimestamp")
    @Validation(required = true)
    public Long endTimestamp;

    @NameInMap("Domain")
    @Validation(required = true)
    public String domain;

    @NameInMap("BindCount")
    @Validation(required = true)
    public Long bindCount;

    @NameInMap("BindUsedCount")
    @Validation(required = true)
    public Long bindUsedCount;

    @NameInMap("TTLMinValue")
    @Validation(required = true)
    public Long TTLMinValue;

    @NameInMap("SubDomainLevel")
    @Validation(required = true)
    public Long subDomainLevel;

    @NameInMap("DnsSLBCount")
    @Validation(required = true)
    public Long dnsSLBCount;

    @NameInMap("URLForwardCount")
    @Validation(required = true)
    public Long URLForwardCount;

    @NameInMap("DDosDefendFlow")
    @Validation(required = true)
    public Long DDosDefendFlow;

    @NameInMap("DDosDefendQuery")
    @Validation(required = true)
    public Long DDosDefendQuery;

    @NameInMap("OverseaDDosDefendFlow")
    @Validation(required = true)
    public Long overseaDDosDefendFlow;

    @NameInMap("SearchEngineLines")
    @Validation(required = true)
    public String searchEngineLines;

    @NameInMap("ISPLines")
    @Validation(required = true)
    public String ISPLines;

    @NameInMap("ISPRegionLines")
    @Validation(required = true)
    public String ISPRegionLines;

    @NameInMap("OverseaLine")
    @Validation(required = true)
    public String overseaLine;

    @NameInMap("MonitorNodeCount")
    @Validation(required = true)
    public Long monitorNodeCount;

    @NameInMap("MonitorFrequency")
    @Validation(required = true)
    public Long monitorFrequency;

    @NameInMap("MonitorTaskCount")
    @Validation(required = true)
    public Long monitorTaskCount;

    @NameInMap("RegionLines")
    @Validation(required = true)
    public Boolean regionLines;

    @NameInMap("Gslb")
    @Validation(required = true)
    public Boolean gslb;

    @NameInMap("InClean")
    @Validation(required = true)
    public Boolean inClean;

    @NameInMap("InBlackHole")
    @Validation(required = true)
    public Boolean inBlackHole;

    @NameInMap("BindDomainCount")
    @Validation(required = true)
    public Long bindDomainCount;

    @NameInMap("BindDomainUsedCount")
    @Validation(required = true)
    public Long bindDomainUsedCount;

    @NameInMap("DnsSecurity")
    @Validation(required = true)
    public String dnsSecurity;

    @NameInMap("PaymentType")
    @Validation(required = true)
    public String paymentType;

    @NameInMap("DomainType")
    @Validation(required = true)
    public String domainType;

    @NameInMap("DnsServers")
    @Validation(required = true)
    public DescribeDnsProductInstanceResponseDnsServers dnsServers;

    public static DescribeDnsProductInstanceResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDnsProductInstanceResponse self = new DescribeDnsProductInstanceResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDnsProductInstanceResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDnsProductInstanceResponse setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeDnsProductInstanceResponse setVersionCode(String versionCode) {
        this.versionCode = versionCode;
        return this;
    }
    public String getVersionCode() {
        return this.versionCode;
    }

    public DescribeDnsProductInstanceResponse setVersionName(String versionName) {
        this.versionName = versionName;
        return this;
    }
    public String getVersionName() {
        return this.versionName;
    }

    public DescribeDnsProductInstanceResponse setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeDnsProductInstanceResponse setStartTimestamp(Long startTimestamp) {
        this.startTimestamp = startTimestamp;
        return this;
    }
    public Long getStartTimestamp() {
        return this.startTimestamp;
    }

    public DescribeDnsProductInstanceResponse setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeDnsProductInstanceResponse setEndTimestamp(Long endTimestamp) {
        this.endTimestamp = endTimestamp;
        return this;
    }
    public Long getEndTimestamp() {
        return this.endTimestamp;
    }

    public DescribeDnsProductInstanceResponse setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public DescribeDnsProductInstanceResponse setBindCount(Long bindCount) {
        this.bindCount = bindCount;
        return this;
    }
    public Long getBindCount() {
        return this.bindCount;
    }

    public DescribeDnsProductInstanceResponse setBindUsedCount(Long bindUsedCount) {
        this.bindUsedCount = bindUsedCount;
        return this;
    }
    public Long getBindUsedCount() {
        return this.bindUsedCount;
    }

    public DescribeDnsProductInstanceResponse setTTLMinValue(Long TTLMinValue) {
        this.TTLMinValue = TTLMinValue;
        return this;
    }
    public Long getTTLMinValue() {
        return this.TTLMinValue;
    }

    public DescribeDnsProductInstanceResponse setSubDomainLevel(Long subDomainLevel) {
        this.subDomainLevel = subDomainLevel;
        return this;
    }
    public Long getSubDomainLevel() {
        return this.subDomainLevel;
    }

    public DescribeDnsProductInstanceResponse setDnsSLBCount(Long dnsSLBCount) {
        this.dnsSLBCount = dnsSLBCount;
        return this;
    }
    public Long getDnsSLBCount() {
        return this.dnsSLBCount;
    }

    public DescribeDnsProductInstanceResponse setURLForwardCount(Long URLForwardCount) {
        this.URLForwardCount = URLForwardCount;
        return this;
    }
    public Long getURLForwardCount() {
        return this.URLForwardCount;
    }

    public DescribeDnsProductInstanceResponse setDDosDefendFlow(Long DDosDefendFlow) {
        this.DDosDefendFlow = DDosDefendFlow;
        return this;
    }
    public Long getDDosDefendFlow() {
        return this.DDosDefendFlow;
    }

    public DescribeDnsProductInstanceResponse setDDosDefendQuery(Long DDosDefendQuery) {
        this.DDosDefendQuery = DDosDefendQuery;
        return this;
    }
    public Long getDDosDefendQuery() {
        return this.DDosDefendQuery;
    }

    public DescribeDnsProductInstanceResponse setOverseaDDosDefendFlow(Long overseaDDosDefendFlow) {
        this.overseaDDosDefendFlow = overseaDDosDefendFlow;
        return this;
    }
    public Long getOverseaDDosDefendFlow() {
        return this.overseaDDosDefendFlow;
    }

    public DescribeDnsProductInstanceResponse setSearchEngineLines(String searchEngineLines) {
        this.searchEngineLines = searchEngineLines;
        return this;
    }
    public String getSearchEngineLines() {
        return this.searchEngineLines;
    }

    public DescribeDnsProductInstanceResponse setISPLines(String ISPLines) {
        this.ISPLines = ISPLines;
        return this;
    }
    public String getISPLines() {
        return this.ISPLines;
    }

    public DescribeDnsProductInstanceResponse setISPRegionLines(String ISPRegionLines) {
        this.ISPRegionLines = ISPRegionLines;
        return this;
    }
    public String getISPRegionLines() {
        return this.ISPRegionLines;
    }

    public DescribeDnsProductInstanceResponse setOverseaLine(String overseaLine) {
        this.overseaLine = overseaLine;
        return this;
    }
    public String getOverseaLine() {
        return this.overseaLine;
    }

    public DescribeDnsProductInstanceResponse setMonitorNodeCount(Long monitorNodeCount) {
        this.monitorNodeCount = monitorNodeCount;
        return this;
    }
    public Long getMonitorNodeCount() {
        return this.monitorNodeCount;
    }

    public DescribeDnsProductInstanceResponse setMonitorFrequency(Long monitorFrequency) {
        this.monitorFrequency = monitorFrequency;
        return this;
    }
    public Long getMonitorFrequency() {
        return this.monitorFrequency;
    }

    public DescribeDnsProductInstanceResponse setMonitorTaskCount(Long monitorTaskCount) {
        this.monitorTaskCount = monitorTaskCount;
        return this;
    }
    public Long getMonitorTaskCount() {
        return this.monitorTaskCount;
    }

    public DescribeDnsProductInstanceResponse setRegionLines(Boolean regionLines) {
        this.regionLines = regionLines;
        return this;
    }
    public Boolean getRegionLines() {
        return this.regionLines;
    }

    public DescribeDnsProductInstanceResponse setGslb(Boolean gslb) {
        this.gslb = gslb;
        return this;
    }
    public Boolean getGslb() {
        return this.gslb;
    }

    public DescribeDnsProductInstanceResponse setInClean(Boolean inClean) {
        this.inClean = inClean;
        return this;
    }
    public Boolean getInClean() {
        return this.inClean;
    }

    public DescribeDnsProductInstanceResponse setInBlackHole(Boolean inBlackHole) {
        this.inBlackHole = inBlackHole;
        return this;
    }
    public Boolean getInBlackHole() {
        return this.inBlackHole;
    }

    public DescribeDnsProductInstanceResponse setBindDomainCount(Long bindDomainCount) {
        this.bindDomainCount = bindDomainCount;
        return this;
    }
    public Long getBindDomainCount() {
        return this.bindDomainCount;
    }

    public DescribeDnsProductInstanceResponse setBindDomainUsedCount(Long bindDomainUsedCount) {
        this.bindDomainUsedCount = bindDomainUsedCount;
        return this;
    }
    public Long getBindDomainUsedCount() {
        return this.bindDomainUsedCount;
    }

    public DescribeDnsProductInstanceResponse setDnsSecurity(String dnsSecurity) {
        this.dnsSecurity = dnsSecurity;
        return this;
    }
    public String getDnsSecurity() {
        return this.dnsSecurity;
    }

    public DescribeDnsProductInstanceResponse setPaymentType(String paymentType) {
        this.paymentType = paymentType;
        return this;
    }
    public String getPaymentType() {
        return this.paymentType;
    }

    public DescribeDnsProductInstanceResponse setDomainType(String domainType) {
        this.domainType = domainType;
        return this;
    }
    public String getDomainType() {
        return this.domainType;
    }

    public DescribeDnsProductInstanceResponse setDnsServers(DescribeDnsProductInstanceResponseDnsServers dnsServers) {
        this.dnsServers = dnsServers;
        return this;
    }
    public DescribeDnsProductInstanceResponseDnsServers getDnsServers() {
        return this.dnsServers;
    }

    public static class DescribeDnsProductInstanceResponseDnsServers extends TeaModel {
        @NameInMap("DnsServer")
        @Validation(required = true)
        public java.util.List<String> dnsServer;

        public static DescribeDnsProductInstanceResponseDnsServers build(java.util.Map<String, ?> map) throws Exception {
            DescribeDnsProductInstanceResponseDnsServers self = new DescribeDnsProductInstanceResponseDnsServers();
            return TeaModel.build(map, self);
        }

        public DescribeDnsProductInstanceResponseDnsServers setDnsServer(java.util.List<String> dnsServer) {
            this.dnsServer = dnsServer;
            return this;
        }
        public java.util.List<String> getDnsServer() {
            return this.dnsServer;
        }

    }

}
