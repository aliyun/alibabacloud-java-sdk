// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDnsProductInstanceResponseBody extends TeaModel {
    @NameInMap("BindCount")
    public Long bindCount;

    @NameInMap("BindDomainCount")
    public Long bindDomainCount;

    @NameInMap("BindDomainUsedCount")
    public Long bindDomainUsedCount;

    @NameInMap("BindUsedCount")
    public Long bindUsedCount;

    @NameInMap("DDosDefendFlow")
    public Long DDosDefendFlow;

    @NameInMap("DDosDefendQuery")
    public Long DDosDefendQuery;

    @NameInMap("DnsSLBCount")
    public Long dnsSLBCount;

    @NameInMap("DnsSecurity")
    public String dnsSecurity;

    @NameInMap("DnsServers")
    public DescribeDnsProductInstanceResponseBodyDnsServers dnsServers;

    @NameInMap("Domain")
    public String domain;

    @NameInMap("DomainType")
    public String domainType;

    @NameInMap("EndTime")
    public String endTime;

    @NameInMap("EndTimestamp")
    public Long endTimestamp;

    @NameInMap("Gslb")
    public Boolean gslb;

    @NameInMap("ISPLines")
    public String ISPLines;

    @NameInMap("ISPRegionLines")
    public String ISPRegionLines;

    @NameInMap("InBlackHole")
    public Boolean inBlackHole;

    @NameInMap("InClean")
    public Boolean inClean;

    @NameInMap("InstanceId")
    public String instanceId;

    @NameInMap("MonitorFrequency")
    public Long monitorFrequency;

    @NameInMap("MonitorNodeCount")
    public Long monitorNodeCount;

    @NameInMap("MonitorTaskCount")
    public Long monitorTaskCount;

    @NameInMap("OverseaDDosDefendFlow")
    public Long overseaDDosDefendFlow;

    @NameInMap("OverseaLine")
    public String overseaLine;

    @NameInMap("PaymentType")
    public String paymentType;

    @NameInMap("RegionLines")
    public Boolean regionLines;

    @NameInMap("RequestId")
    public String requestId;

    @NameInMap("SearchEngineLines")
    public String searchEngineLines;

    @NameInMap("StartTime")
    public String startTime;

    @NameInMap("StartTimestamp")
    public Long startTimestamp;

    @NameInMap("SubDomainLevel")
    public Long subDomainLevel;

    @NameInMap("TTLMinValue")
    public Long TTLMinValue;

    @NameInMap("URLForwardCount")
    public Long URLForwardCount;

    @NameInMap("VersionCode")
    public String versionCode;

    @NameInMap("VersionName")
    public String versionName;

    public static DescribeDnsProductInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDnsProductInstanceResponseBody self = new DescribeDnsProductInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDnsProductInstanceResponseBody setBindCount(Long bindCount) {
        this.bindCount = bindCount;
        return this;
    }
    public Long getBindCount() {
        return this.bindCount;
    }

    public DescribeDnsProductInstanceResponseBody setBindDomainCount(Long bindDomainCount) {
        this.bindDomainCount = bindDomainCount;
        return this;
    }
    public Long getBindDomainCount() {
        return this.bindDomainCount;
    }

    public DescribeDnsProductInstanceResponseBody setBindDomainUsedCount(Long bindDomainUsedCount) {
        this.bindDomainUsedCount = bindDomainUsedCount;
        return this;
    }
    public Long getBindDomainUsedCount() {
        return this.bindDomainUsedCount;
    }

    public DescribeDnsProductInstanceResponseBody setBindUsedCount(Long bindUsedCount) {
        this.bindUsedCount = bindUsedCount;
        return this;
    }
    public Long getBindUsedCount() {
        return this.bindUsedCount;
    }

    public DescribeDnsProductInstanceResponseBody setDDosDefendFlow(Long DDosDefendFlow) {
        this.DDosDefendFlow = DDosDefendFlow;
        return this;
    }
    public Long getDDosDefendFlow() {
        return this.DDosDefendFlow;
    }

    public DescribeDnsProductInstanceResponseBody setDDosDefendQuery(Long DDosDefendQuery) {
        this.DDosDefendQuery = DDosDefendQuery;
        return this;
    }
    public Long getDDosDefendQuery() {
        return this.DDosDefendQuery;
    }

    public DescribeDnsProductInstanceResponseBody setDnsSLBCount(Long dnsSLBCount) {
        this.dnsSLBCount = dnsSLBCount;
        return this;
    }
    public Long getDnsSLBCount() {
        return this.dnsSLBCount;
    }

    public DescribeDnsProductInstanceResponseBody setDnsSecurity(String dnsSecurity) {
        this.dnsSecurity = dnsSecurity;
        return this;
    }
    public String getDnsSecurity() {
        return this.dnsSecurity;
    }

    public DescribeDnsProductInstanceResponseBody setDnsServers(DescribeDnsProductInstanceResponseBodyDnsServers dnsServers) {
        this.dnsServers = dnsServers;
        return this;
    }
    public DescribeDnsProductInstanceResponseBodyDnsServers getDnsServers() {
        return this.dnsServers;
    }

    public DescribeDnsProductInstanceResponseBody setDomain(String domain) {
        this.domain = domain;
        return this;
    }
    public String getDomain() {
        return this.domain;
    }

    public DescribeDnsProductInstanceResponseBody setDomainType(String domainType) {
        this.domainType = domainType;
        return this;
    }
    public String getDomainType() {
        return this.domainType;
    }

    public DescribeDnsProductInstanceResponseBody setEndTime(String endTime) {
        this.endTime = endTime;
        return this;
    }
    public String getEndTime() {
        return this.endTime;
    }

    public DescribeDnsProductInstanceResponseBody setEndTimestamp(Long endTimestamp) {
        this.endTimestamp = endTimestamp;
        return this;
    }
    public Long getEndTimestamp() {
        return this.endTimestamp;
    }

    public DescribeDnsProductInstanceResponseBody setGslb(Boolean gslb) {
        this.gslb = gslb;
        return this;
    }
    public Boolean getGslb() {
        return this.gslb;
    }

    public DescribeDnsProductInstanceResponseBody setISPLines(String ISPLines) {
        this.ISPLines = ISPLines;
        return this;
    }
    public String getISPLines() {
        return this.ISPLines;
    }

    public DescribeDnsProductInstanceResponseBody setISPRegionLines(String ISPRegionLines) {
        this.ISPRegionLines = ISPRegionLines;
        return this;
    }
    public String getISPRegionLines() {
        return this.ISPRegionLines;
    }

    public DescribeDnsProductInstanceResponseBody setInBlackHole(Boolean inBlackHole) {
        this.inBlackHole = inBlackHole;
        return this;
    }
    public Boolean getInBlackHole() {
        return this.inBlackHole;
    }

    public DescribeDnsProductInstanceResponseBody setInClean(Boolean inClean) {
        this.inClean = inClean;
        return this;
    }
    public Boolean getInClean() {
        return this.inClean;
    }

    public DescribeDnsProductInstanceResponseBody setInstanceId(String instanceId) {
        this.instanceId = instanceId;
        return this;
    }
    public String getInstanceId() {
        return this.instanceId;
    }

    public DescribeDnsProductInstanceResponseBody setMonitorFrequency(Long monitorFrequency) {
        this.monitorFrequency = monitorFrequency;
        return this;
    }
    public Long getMonitorFrequency() {
        return this.monitorFrequency;
    }

    public DescribeDnsProductInstanceResponseBody setMonitorNodeCount(Long monitorNodeCount) {
        this.monitorNodeCount = monitorNodeCount;
        return this;
    }
    public Long getMonitorNodeCount() {
        return this.monitorNodeCount;
    }

    public DescribeDnsProductInstanceResponseBody setMonitorTaskCount(Long monitorTaskCount) {
        this.monitorTaskCount = monitorTaskCount;
        return this;
    }
    public Long getMonitorTaskCount() {
        return this.monitorTaskCount;
    }

    public DescribeDnsProductInstanceResponseBody setOverseaDDosDefendFlow(Long overseaDDosDefendFlow) {
        this.overseaDDosDefendFlow = overseaDDosDefendFlow;
        return this;
    }
    public Long getOverseaDDosDefendFlow() {
        return this.overseaDDosDefendFlow;
    }

    public DescribeDnsProductInstanceResponseBody setOverseaLine(String overseaLine) {
        this.overseaLine = overseaLine;
        return this;
    }
    public String getOverseaLine() {
        return this.overseaLine;
    }

    public DescribeDnsProductInstanceResponseBody setPaymentType(String paymentType) {
        this.paymentType = paymentType;
        return this;
    }
    public String getPaymentType() {
        return this.paymentType;
    }

    public DescribeDnsProductInstanceResponseBody setRegionLines(Boolean regionLines) {
        this.regionLines = regionLines;
        return this;
    }
    public Boolean getRegionLines() {
        return this.regionLines;
    }

    public DescribeDnsProductInstanceResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDnsProductInstanceResponseBody setSearchEngineLines(String searchEngineLines) {
        this.searchEngineLines = searchEngineLines;
        return this;
    }
    public String getSearchEngineLines() {
        return this.searchEngineLines;
    }

    public DescribeDnsProductInstanceResponseBody setStartTime(String startTime) {
        this.startTime = startTime;
        return this;
    }
    public String getStartTime() {
        return this.startTime;
    }

    public DescribeDnsProductInstanceResponseBody setStartTimestamp(Long startTimestamp) {
        this.startTimestamp = startTimestamp;
        return this;
    }
    public Long getStartTimestamp() {
        return this.startTimestamp;
    }

    public DescribeDnsProductInstanceResponseBody setSubDomainLevel(Long subDomainLevel) {
        this.subDomainLevel = subDomainLevel;
        return this;
    }
    public Long getSubDomainLevel() {
        return this.subDomainLevel;
    }

    public DescribeDnsProductInstanceResponseBody setTTLMinValue(Long TTLMinValue) {
        this.TTLMinValue = TTLMinValue;
        return this;
    }
    public Long getTTLMinValue() {
        return this.TTLMinValue;
    }

    public DescribeDnsProductInstanceResponseBody setURLForwardCount(Long URLForwardCount) {
        this.URLForwardCount = URLForwardCount;
        return this;
    }
    public Long getURLForwardCount() {
        return this.URLForwardCount;
    }

    public DescribeDnsProductInstanceResponseBody setVersionCode(String versionCode) {
        this.versionCode = versionCode;
        return this;
    }
    public String getVersionCode() {
        return this.versionCode;
    }

    public DescribeDnsProductInstanceResponseBody setVersionName(String versionName) {
        this.versionName = versionName;
        return this;
    }
    public String getVersionName() {
        return this.versionName;
    }

    public static class DescribeDnsProductInstanceResponseBodyDnsServers extends TeaModel {
        @NameInMap("DnsServer")
        public java.util.List<String> dnsServer;

        public static DescribeDnsProductInstanceResponseBodyDnsServers build(java.util.Map<String, ?> map) throws Exception {
            DescribeDnsProductInstanceResponseBodyDnsServers self = new DescribeDnsProductInstanceResponseBodyDnsServers();
            return TeaModel.build(map, self);
        }

        public DescribeDnsProductInstanceResponseBodyDnsServers setDnsServer(java.util.List<String> dnsServer) {
            this.dnsServer = dnsServer;
            return this;
        }
        public java.util.List<String> getDnsServer() {
            return this.dnsServer;
        }

    }

}
