// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDnsProductInstanceResponseBody extends TeaModel {
    /**
     * <p>The number of times that you can change the domain names that are bound to the paid Alibaba Cloud DNS instance. This parameter applies to Alibaba Cloud DNS instances of the custom edition.</p>
     */
    @NameInMap("BindCount")
    public Long bindCount;

    /**
     * <p>The number of domain names that can be bound to the paid Alibaba Cloud DNS instance. This parameter applies to Alibaba Cloud DNS instances of Personal Edition, Enterprise Standard Edition, and Enterprise Ultimate Edition.</p>
     */
    @NameInMap("BindDomainCount")
    public Long bindDomainCount;

    /**
     * <p>The number of domain names that are bound to the paid Alibaba Cloud DNS instance. This parameter applies to Alibaba Cloud DNS instances of Personal Edition, Enterprise Standard Edition, and Enterprise Ultimate Edition.</p>
     */
    @NameInMap("BindDomainUsedCount")
    public Long bindDomainUsedCount;

    /**
     * <p>The number of times that you have changed the domain names that are bound to the paid Alibaba Cloud DNS instance. This parameter applies to Alibaba Cloud DNS instances of the custom edition.</p>
     */
    @NameInMap("BindUsedCount")
    public Long bindUsedCount;

    /**
     * <p>The DDoS protection traffic. Unit: GB.</p>
     */
    @NameInMap("DDosDefendFlow")
    public Long DDosDefendFlow;

    /**
     * <p>The DDoS protection frequency. Unit: 10,000 QPS. This parameter applies to Alibaba Cloud DNS instances of the custom edition.</p>
     */
    @NameInMap("DDosDefendQuery")
    public Long DDosDefendQuery;

    /**
     * <p>The maximum number of IP addresses that are used for load balancing in a single line of a domain name.</p>
     */
    @NameInMap("DnsSLBCount")
    public Long dnsSLBCount;

    /**
     * <p>The DNS protection level. Valid values:</p>
     * <br>
     * <p>*   **no**: DNS protection is not provided.</p>
     * <p>*   **basic**: Basic DNS attack defense is provided.</p>
     * <p>*   **advanced**: Advanced DNS attack defense is provided.</p>
     */
    @NameInMap("DnsSecurity")
    public String dnsSecurity;

    /**
     * <p>The DNS servers configured for the domain names.</p>
     */
    @NameInMap("DnsServers")
    public DescribeDnsProductInstanceResponseBodyDnsServers dnsServers;

    /**
     * <p>The domain name that is bound to the paid instance.</p>
     * <br>
     * <p>If no value is returned for this parameter, no domain name is bound to the paid instance.</p>
     */
    @NameInMap("Domain")
    public String domain;

    /**
     * <p>The type of the instance. Valid values:</p>
     * <br>
     * <p>*   PUBLIC: authoritative domain name</p>
     * <p>*   CACHE: cache-accelerated domain name</p>
     */
    @NameInMap("DomainType")
    public String domainType;

    /**
     * <p>The time when the instance expired. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The time when the instance expired. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
     */
    @NameInMap("EndTimestamp")
    public Long endTimestamp;

    /**
     * <p>Indicates whether global server load balancing (GSLB) is supported.</p>
     */
    @NameInMap("Gslb")
    public Boolean gslb;

    /**
     * <p>The Internet service provider (ISP) lines for DNS resolution.</p>
     */
    @NameInMap("ISPLines")
    public String ISPLines;

    /**
     * <p>The regional ISP lines for DNS resolution.</p>
     */
    @NameInMap("ISPRegionLines")
    public String ISPRegionLines;

    /**
     * <p>Indicates whether the Domain Name System (DNS) servers stopped responding to all requests sent to the domain names.</p>
     */
    @NameInMap("InBlackHole")
    public Boolean inBlackHole;

    /**
     * <p>Indicates whether the DNS servers stopped responding to abnormal requests sent to the domain names.</p>
     */
    @NameInMap("InClean")
    public Boolean inClean;

    /**
     * <p>The ID of the Alibaba Cloud DNS instance.</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The interval at which the instance is monitored. Unit: minutes.</p>
     */
    @NameInMap("MonitorFrequency")
    public Long monitorFrequency;

    /**
     * <p>The number of monitoring nodes.</p>
     */
    @NameInMap("MonitorNodeCount")
    public Long monitorNodeCount;

    /**
     * <p>The number of monitoring tasks.</p>
     */
    @NameInMap("MonitorTaskCount")
    public Long monitorTaskCount;

    /**
     * <p>The DDoS protection traffic outside the Chinese mainland. Unit: GB.</p>
     */
    @NameInMap("OverseaDDosDefendFlow")
    public Long overseaDDosDefendFlow;

    /**
     * <p>The line outside the Chinese mainland.</p>
     */
    @NameInMap("OverseaLine")
    public String overseaLine;

    /**
     * <p>The billing method.</p>
     */
    @NameInMap("PaymentType")
    public String paymentType;

    /**
     * <p>Indicates whether regional lines are supported.</p>
     */
    @NameInMap("RegionLines")
    public Boolean regionLines;

    /**
     * <p>The request ID.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The search engine lines for DNS resolution.</p>
     */
    @NameInMap("SearchEngineLines")
    public String searchEngineLines;

    /**
     * <p>The time when the instance was purchased. The time follows the ISO 8601 standard in the yyyy-MM-ddTHH:mm:ssZ format. The time is displayed in UTC.</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The time when the instance was purchased. This value is a UNIX timestamp representing the number of milliseconds that have elapsed since January 1, 1970, 00:00:00 UTC.</p>
     */
    @NameInMap("StartTimestamp")
    public Long startTimestamp;

    /**
     * <p>The number of subdomain name levels.</p>
     */
    @NameInMap("SubDomainLevel")
    public Long subDomainLevel;

    /**
     * <p>The minimum time-to-live (TTL) period. Unit: seconds.</p>
     */
    @NameInMap("TTLMinValue")
    public Long TTLMinValue;

    /**
     * <p>The number of the forwarded URLs.</p>
     */
    @NameInMap("URLForwardCount")
    public Long URLForwardCount;

    /**
     * <p>The version code of Alibaba Cloud DNS.</p>
     */
    @NameInMap("VersionCode")
    public String versionCode;

    /**
     * <p>The edition of Alibaba Cloud DNS.</p>
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
