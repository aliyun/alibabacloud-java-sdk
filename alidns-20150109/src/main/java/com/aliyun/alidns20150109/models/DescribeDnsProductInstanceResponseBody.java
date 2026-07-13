// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDnsProductInstanceResponseBody extends TeaModel {
    /**
     * <p>Indicates whether auto-renewal is enabled for the instance.</p>
     * <ul>
     * <li><p>true: Auto-renewal is enabled.</p>
     * </li>
     * <li><p>false: Auto-renewal is disabled.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("AutoRenewal")
    public Boolean autoRenewal;

    /**
     * <p>The number of times the domain name can be changed for the paid DNS instance. This parameter is available for the Custom Edition.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("BindCount")
    public Long bindCount;

    /**
     * <p>The number of domain names that can be attached to the paid DNS instance. This parameter is available for the Personal and Ultimate editions.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("BindDomainCount")
    public Long bindDomainCount;

    /**
     * <p>The number of domain names that are attached to the paid DNS instance. This parameter is available for the Personal and Ultimate editions.</p>
     * 
     * <strong>example:</strong>
     * <p>3</p>
     */
    @NameInMap("BindDomainUsedCount")
    public Long bindDomainUsedCount;

    /**
     * <p>The number of times the domain name has been changed for the paid DNS instance. This parameter is available for the Custom Edition.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("BindUsedCount")
    public Long bindUsedCount;

    /**
     * <p>The DDoS protection bandwidth. Unit: Gbit/s.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("DDosDefendFlow")
    public Long DDosDefendFlow;

    /**
     * <p>The DDoS protection capacity in queries per second (QPS). The unit is 10,000 QPS. This parameter is available for the Custom Edition.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("DDosDefendQuery")
    public Long DDosDefendQuery;

    /**
     * <p>The Server Load Balancer (SLB) capacity. This is the number of IP addresses that can be configured for a domain name on a single line.</p>
     * 
     * <strong>example:</strong>
     * <p>15</p>
     */
    @NameInMap("DnsSLBCount")
    public Long dnsSLBCount;

    /**
     * <p>The DNS security level. Valid values:</p>
     * <ul>
     * <li><p>no: Not required</p>
     * </li>
     * <li><p>basic: Basic DNS attack protection</p>
     * </li>
     * <li><p>advanced: Advanced DNS attack protection</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>advanced</p>
     */
    @NameInMap("DnsSecurity")
    public String dnsSecurity;

    @NameInMap("DnsServers")
    public DescribeDnsProductInstanceResponseBodyDnsServers dnsServers;

    /**
     * <p>The attached domain name.</p>
     * <p>If this parameter is empty, no domain name is attached.</p>
     * 
     * <strong>example:</strong>
     * <p>example.com</p>
     */
    @NameInMap("Domain")
    public String domain;

    /**
     * <p>The type of the instance:</p>
     * <ul>
     * <li><p>PUBLIC: An instance for an authoritative domain name.</p>
     * </li>
     * <li><p>CACHE: An instance for a recursive DNS proxy.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PUBLIC</p>
     */
    @NameInMap("DomainType")
    public String domainType;

    /**
     * <p>The time when the instance expires.</p>
     * 
     * <strong>example:</strong>
     * <p>2015-12-12T09:23Z</p>
     */
    @NameInMap("EndTime")
    public String endTime;

    /**
     * <p>The time when the instance expires. This is a UNIX timestamp.</p>
     * 
     * <strong>example:</strong>
     * <p>1474335170000</p>
     */
    @NameInMap("EndTimestamp")
    public Long endTimestamp;

    /**
     * <p>Indicates whether Global Server Load Balancer (GSLB) is allowed.</p>
     * <ul>
     * <li><p>true: Allowed</p>
     * </li>
     * <li><p>false: Not allowed</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("Gslb")
    public Boolean gslb;

    /**
     * <p>The carrier line from which the DNS request was initiated. Valid values:</p>
     * <ul>
     * <li><p>China Telecom</p>
     * </li>
     * <li><p>China Mobile</p>
     * </li>
     * <li><p>China Unicom</p>
     * </li>
     * <li><p>China Education and Research Network</p>
     * </li>
     * <li><p>China Broadcasting Network</p>
     * </li>
     * <li><p>Dr. Peng Group</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>中国电信</p>
     */
    @NameInMap("ISPLines")
    public String ISPLines;

    /**
     * <p>The carrier line and province from which the DNS request was initiated. Valid values:</p>
     * <ul>
     * <li><p>China Telecom (by province)</p>
     * </li>
     * <li><p>China Mobile (by province)</p>
     * </li>
     * <li><p>China Unicom (by province)</p>
     * </li>
     * <li><p>China Education and Research Network (by province)</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>电信_浙江</p>
     */
    @NameInMap("ISPRegionLines")
    public String ISPRegionLines;

    /**
     * <p>Indicates whether the domain name is in a blackhole filtering status.</p>
     * <ul>
     * <li><p>true: The domain name is in a blackhole filtering status.</p>
     * </li>
     * <li><p>false: The domain name is not in a blackhole filtering status.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("InBlackHole")
    public Boolean inBlackHole;

    /**
     * <p>Indicates whether the domain name is undergoing traffic scrubbing.</p>
     * <ul>
     * <li><p>true: Traffic scrubbing is in progress.</p>
     * </li>
     * <li><p>false: Traffic scrubbing is not in progress.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>false</p>
     */
    @NameInMap("InClean")
    public Boolean inClean;

    /**
     * <p>The ID of the Alibaba Cloud DNS instance.</p>
     * 
     * <strong>example:</strong>
     * <p>i-8fxxx</p>
     */
    @NameInMap("InstanceId")
    public String instanceId;

    /**
     * <p>The monitoring frequency. Unit: minutes.</p>
     * 
     * <strong>example:</strong>
     * <p>50</p>
     */
    @NameInMap("MonitorFrequency")
    public Long monitorFrequency;

    /**
     * <p>The number of monitoring nodes.</p>
     * 
     * <strong>example:</strong>
     * <p>5</p>
     */
    @NameInMap("MonitorNodeCount")
    public Long monitorNodeCount;

    /**
     * <p>The number of monitoring jobs.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("MonitorTaskCount")
    public Long monitorTaskCount;

    /**
     * <p>The DDoS protection bandwidth for regions outside China. Unit: Gbit/s.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("OverseaDDosDefendFlow")
    public Long overseaDDosDefendFlow;

    /**
     * <p>The line for regions outside China.</p>
     * 
     * <strong>example:</strong>
     * <p>海外大洲</p>
     */
    @NameInMap("OverseaLine")
    public String overseaLine;

    /**
     * <p>The billing method.</p>
     * 
     * <strong>example:</strong>
     * <p>Subscription</p>
     */
    @NameInMap("PaymentType")
    public String paymentType;

    /**
     * <p>Indicates whether regional lines are used.</p>
     * <ul>
     * <li><p>true: Regional lines are used.</p>
     * </li>
     * <li><p>false: Regional lines are not used.</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>true</p>
     */
    @NameInMap("RegionLines")
    public Boolean regionLines;

    /**
     * <p>The unique ID of the request.</p>
     * 
     * <strong>example:</strong>
     * <p>536E9CAD-DB30-4647-AC87-xxxxxxx</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The search engine line. Valid values:</p>
     * <ul>
     * <li><p>Google</p>
     * </li>
     * <li><p>Baidu</p>
     * </li>
     * <li><p>Bing</p>
     * </li>
     * <li><p>Youdao</p>
     * </li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>谷歌</p>
     */
    @NameInMap("SearchEngineLines")
    public String searchEngineLines;

    /**
     * <p>The time when the instance was purchased.</p>
     * 
     * <strong>example:</strong>
     * <p>2015-12-12T09:23Z</p>
     */
    @NameInMap("StartTime")
    public String startTime;

    /**
     * <p>The time when the instance was purchased. This is a UNIX timestamp.</p>
     * 
     * <strong>example:</strong>
     * <p>1474335170000</p>
     */
    @NameInMap("StartTimestamp")
    public Long startTimestamp;

    /**
     * <p>The number of subdomain levels.</p>
     * 
     * <strong>example:</strong>
     * <p>6</p>
     */
    @NameInMap("SubDomainLevel")
    public Long subDomainLevel;

    /**
     * <p>The minimum Time to Live (TTL) value. Unit: seconds.</p>
     * 
     * <strong>example:</strong>
     * <p>10</p>
     */
    @NameInMap("TTLMinValue")
    public Long TTLMinValue;

    /**
     * <p>The number of URL forwards.</p>
     * 
     * <strong>example:</strong>
     * <p>20</p>
     */
    @NameInMap("URLForwardCount")
    public Long URLForwardCount;

    /**
     * <p>The code of the Alibaba Cloud DNS edition.</p>
     * 
     * <strong>example:</strong>
     * <p>version1</p>
     */
    @NameInMap("VersionCode")
    public String versionCode;

    /**
     * <p>The name of the Alibaba Cloud DNS edition.</p>
     * 
     * <strong>example:</strong>
     * <p>企业旗舰版</p>
     */
    @NameInMap("VersionName")
    public String versionName;

    public static DescribeDnsProductInstanceResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDnsProductInstanceResponseBody self = new DescribeDnsProductInstanceResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDnsProductInstanceResponseBody setAutoRenewal(Boolean autoRenewal) {
        this.autoRenewal = autoRenewal;
        return this;
    }
    public Boolean getAutoRenewal() {
        return this.autoRenewal;
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
