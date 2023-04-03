// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDnsProductInstanceResponseBody extends TeaModel {
    /**
     * <p>The number of times you can change domain names that are bound to the DNS instance. It can be specified by the user who uses Alibaba Cloud DNS of the custom version.</p>
     */
    @NameInMap("BindCount")
    public Long bindCount;

    /**
     * <p>The number of domain names that you can bind to the DNS instance.</p>
     */
    @NameInMap("BindDomainCount")
    public Long bindDomainCount;

    /**
     * <p>The number of domain names that have been bound to the DNS instance.</p>
     */
    @NameInMap("BindDomainUsedCount")
    public Long bindDomainUsedCount;

    /**
     * <p>The number of times you have changed domain names that are bound to the DNS instance. It can be specified by the user who uses Alibaba Cloud DNS of the custom version.</p>
     */
    @NameInMap("BindUsedCount")
    public Long bindUsedCount;

    /**
     * <p>The DDoS protection traffic. Unit: GB.</p>
     */
    @NameInMap("DDosDefendFlow")
    public Long DDosDefendFlow;

    /**
     * <p>The DDoS protection frequency. Unit: 10,000 QPS.</p>
     */
    @NameInMap("DDosDefendQuery")
    public Long DDosDefendQuery;

    /**
     * <p>The number of IP addresses supported by a domain name or line.</p>
     */
    @NameInMap("DnsSLBCount")
    public Long dnsSLBCount;

    /**
     * <p>The DNS security policy. Valid values:</p>
     * <br>
     * <p>*   **no**: not required.</p>
     * <p>*   **basic**: anti-DDoS basic.</p>
     * <p>*   **advanced**: anti-DDoS advanced.</p>
     */
    @NameInMap("DnsSecurity")
    public String dnsSecurity;

    /**
     * <p>The list of DNS servers.</p>
     */
    @NameInMap("DnsServers")
    public DescribeDnsProductInstanceResponseBodyDnsServers dnsServers;

    /**
     * <p>The bound domain name.</p>
     * <br>
     * <p>If this parameter is not specified, no domain name is bound.</p>
     */
    @NameInMap("Domain")
    public String domain;

    @NameInMap("DomainType")
    public String domainType;

    /**
     * <p>The time at which the instance expired.</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The UNIX timestamp representing the expiration time of the instance.</p>
     */
    @NameInMap("EndTimestamp")
    public Long endTimestamp;

    /**
     * <p>Indicates whether GSLB was allowed.</p>
     */
    @NameInMap("Gslb")
    public Boolean gslb;

    /**
     * <p>The list of ISP lines.</p>
     */
    @NameInMap("ISPLines")
    public String ISPLines;

    /**
     * <p>The list of ISP line subdivisions.</p>
     */
    @NameInMap("ISPRegionLines")
    public String ISPRegionLines;

    /**
     * <p>Indicates whether the request for domain name resolution was in the black hole.</p>
     */
    @NameInMap("InBlackHole")
    public Boolean inBlackHole;

    /**
     * <p>Indicates whether the request for domain name resolution was being cleared.</p>
     */
    @NameInMap("InClean")
    public Boolean inClean;

    /**
     * <p>The ID of the Alibaba Cloud DNS instance.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The monitoring frequency. Unit: minutes.</p>
     */
    @NameInMap("MonitorFrequency")
    public Long monitorFrequency;

    /**
     * <p>The number of monitored nodes.</p>
     */
    @NameInMap("MonitorNodeCount")
    public Long monitorNodeCount;

    /**
     * <p>The number of monitoring tasks.</p>
     */
    @NameInMap("MonitorTaskCount")
    public Long monitorTaskCount;

    /**
     * <p>DDoS protection traffic outside China. Unit: GB.</p>
     */
    @NameInMap("OverseaDDosDefendFlow")
    public Long overseaDDosDefendFlow;

    /**
     * <p>The type of the overseas line.</p>
     */
    @NameInMap("OverseaLine")
    public String overseaLine;

    @NameInMap("PaymentType")
    public String paymentType;

    /**
     * <p>Indicates whether regional lines were allowed.</p>
     */
    @NameInMap("RegionLines")
    public Boolean regionLines;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The list of search engine lines.</p>
     */
    @NameInMap("SearchEngineLines")
    public String searchEngineLines;

    /**
     * <p>The time when the DNS instance was purchased.</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The UNIX timestamp representing when the DNS instance was purchased.</p>
     */
    @NameInMap("StartTimestamp")
    public Long startTimestamp;

    /**
     * <p>The number of subdomain name levels.</p>
     */
    @NameInMap("SubDomainLevel")
    public Long subDomainLevel;

    /**
     * <p>The minimum TTL. Unit: seconds.</p>
     */
    @NameInMap("TTLMinValue")
    public Long TTLMinValue;

    /**
     * <p>The URL forwarding quantity.</p>
     */
    @NameInMap("URLForwardCount")
    public Long URLForwardCount;

    /**
     * <p>The version code of the Alibaba Cloud DNS instance.</p>
     */
    @NameInMap("VersionCode")
    public String versionCode;

    /**
     * <p>The version name of the Alibaba Cloud DNS instance.</p>
     */
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
