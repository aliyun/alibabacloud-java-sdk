// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDnsProductInstancesResponseBody extends TeaModel {
    /**
     * <p>The paid Alibaba Cloud DNS instances.</p>
     */
    @NameInMap("DnsProducts")
    public DescribeDnsProductInstancesResponseBodyDnsProducts dnsProducts;

    /**
     * <p>The type of the domain name. Valid values:</p>
     * <ul>
     * <li>PUBLIC (default): hosted public domain name</li>
     * <li>CACHE: cached public domain name</li>
     * </ul>
     * 
     * <strong>example:</strong>
     * <p>PUBLIC</p>
     */
    @NameInMap("DomainType")
    public String domainType;

    /**
     * <p>The page number of the returned page.</p>
     * 
     * <strong>example:</strong>
     * <p>1</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The number of entries returned per page.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The request ID.</p>
     * 
     * <strong>example:</strong>
     * <p>536E9CAD-DB30-4647-AC87-AA5CC38C5382</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The total number of domain names.</p>
     * 
     * <strong>example:</strong>
     * <p>2</p>
     */
    @NameInMap("TotalCount")
    public Long totalCount;

    public static DescribeDnsProductInstancesResponseBody build(java.util.Map<String, ?> map) throws Exception {
        DescribeDnsProductInstancesResponseBody self = new DescribeDnsProductInstancesResponseBody();
        return TeaModel.build(map, self);
    }

    public DescribeDnsProductInstancesResponseBody setDnsProducts(DescribeDnsProductInstancesResponseBodyDnsProducts dnsProducts) {
        this.dnsProducts = dnsProducts;
        return this;
    }
    public DescribeDnsProductInstancesResponseBodyDnsProducts getDnsProducts() {
        return this.dnsProducts;
    }

    public DescribeDnsProductInstancesResponseBody setDomainType(String domainType) {
        this.domainType = domainType;
        return this;
    }
    public String getDomainType() {
        return this.domainType;
    }

    public DescribeDnsProductInstancesResponseBody setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDnsProductInstancesResponseBody setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeDnsProductInstancesResponseBody setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDnsProductInstancesResponseBody setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public static class DescribeDnsProductInstancesResponseBodyDnsProductsDnsProduct extends TeaModel {
        /**
         * <p>Indicates whether auto-renewal was enabled. Valid values:</p>
         * <ul>
         * <li>true: Auto-renewal was enabled.</li>
         * <li>false: Auto-renewal was not enabled.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("AutoRenewal")
        public Boolean autoRenewal;

        /**
         * <p>The number of times you can change domain names that are bound to the DNS instance. It can be specified by the user who uses Alibaba Cloud DNS of the custom version.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("BindCount")
        public Long bindCount;

        /**
         * <p>The number of domain names that can be bound to the DNS instance.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("BindDomainCount")
        public Long bindDomainCount;

        /**
         * <p>The number of domain names that have been bound to the DNS instance.</p>
         * 
         * <strong>example:</strong>
         * <p>3</p>
         */
        @NameInMap("BindDomainUsedCount")
        public Long bindDomainUsedCount;

        /**
         * <p>The number of times you have changed domain names that are bound to the DNS instance. It can be specified by the user who uses Alibaba Cloud DNS of the custom version.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("BindUsedCount")
        public Long bindUsedCount;

        /**
         * <p>The DDoS protection traffic. Unit: GB.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("DDosDefendFlow")
        public Long DDosDefendFlow;

        /**
         * <p>The DDoS protection frequency. Unit: 10,000 QPS.</p>
         * 
         * <strong>example:</strong>
         * <p>50</p>
         */
        @NameInMap("DDosDefendQuery")
        public Long DDosDefendQuery;

        /**
         * <p>The number of IP addresses supported by a domain name or line.</p>
         * 
         * <strong>example:</strong>
         * <p>15</p>
         */
        @NameInMap("DnsSLBCount")
        public Long dnsSLBCount;

        /**
         * <p>The level of DNS protection. Valid values:</p>
         * <ul>
         * <li>no: No DNS protection is provided.</li>
         * <li>basic: Basic DNS protection is provided.</li>
         * <li>advanced: Advanced DNS protection is provided.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>no</p>
         */
        @NameInMap("DnsSecurity")
        public String dnsSecurity;

        /**
         * <p>The bound domain name.</p>
         * 
         * <strong>example:</strong>
         * <p>example.com</p>
         */
        @NameInMap("Domain")
        public String domain;

        /**
         * <p>The time at which the instance expired.</p>
         * 
         * <strong>example:</strong>
         * <p>2015-12-12T00:00Z</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The UNIX timestamp representing the expiration time of the instance.</p>
         * 
         * <strong>example:</strong>
         * <p>1474335170000</p>
         */
        @NameInMap("EndTimestamp")
        public Long endTimestamp;

        /**
         * <p>Indicates whether global server load balancing (GSLB) is supported.</p>
         * <ul>
         * <li>true: GSLB is supported.</li>
         * <li>false: GSLB is not supported.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("Gslb")
        public Boolean gslb;

        /**
         * <p>The ISP resolution lines.</p>
         * <ul>
         * <li>China Telecom</li>
         * <li>China Mobile</li>
         * <li>China Unicom</li>
         * <li>CERNET</li>
         * <li>China Broadcasting Network (CBN)</li>
         * <li>Dr Peng Telecom &amp; Media Group</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>China Mobile,China Unicom,China Telecom,China Edu</p>
         */
        @NameInMap("ISPLines")
        public String ISPLines;

        /**
         * <p>The regional ISP resolution lines. Valid values:</p>
         * <ul>
         * <li>China Telecom (province)</li>
         * <li>China Mobile (province)</li>
         * <li>China Unicom (province)</li>
         * <li>China Education and Research Network (CERNET) (province)</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Telecom (Province), Mobile (Province), Unicom (Province), Education Network (Province)</p>
         */
        @NameInMap("ISPRegionLines")
        public String ISPRegionLines;

        /**
         * <p>Indicates whether the Domain Name System (DNS) servers stopped responding to all requests. Valid values:</p>
         * <ul>
         * <li>true: The DNS servers stopped responding to all requests.</li>
         * <li>false: The DNS servers did not stop responding to all requests.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>false</p>
         */
        @NameInMap("InBlackHole")
        public Boolean inBlackHole;

        /**
         * <p>Indicates whether the request for domain name resolution was being cleared.</p>
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
         * <p>i-8fj</p>
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
         * <p>The number of monitored nodes.</p>
         * 
         * <strong>example:</strong>
         * <p>5</p>
         */
        @NameInMap("MonitorNodeCount")
        public Long monitorNodeCount;

        /**
         * <p>The number of monitoring tasks.</p>
         * 
         * <strong>example:</strong>
         * <p>2</p>
         */
        @NameInMap("MonitorTaskCount")
        public Long monitorTaskCount;

        /**
         * <p>DDoS protection traffic outside China. Unit: GB.</p>
         * 
         * <strong>example:</strong>
         * <p>1</p>
         */
        @NameInMap("OverseaDDosDefendFlow")
        public Long overseaDDosDefendFlow;

        /**
         * <p>The type of the overseas line.</p>
         * 
         * <strong>example:</strong>
         * <p>Countries</p>
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
         * <p>Indicates whether the DNS request lines are regional lines.</p>
         * <ul>
         * <li>true: The DNS request lines are regional lines.</li>
         * <li>false: The DNS request lines are not regional lines.</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>true</p>
         */
        @NameInMap("RegionLines")
        public Boolean regionLines;

        /**
         * <p>The search engine resolution lines. Valid values:</p>
         * <ul>
         * <li>Google</li>
         * <li>Baidu</li>
         * <li>Bing</li>
         * <li>Youdao</li>
         * </ul>
         * 
         * <strong>example:</strong>
         * <p>Search Engine Robots,Google Robots,Baidu Robots,Bing Robots</p>
         */
        @NameInMap("SearchEngineLines")
        public String searchEngineLines;

        /**
         * <p>The time when the DNS instance was purchased.</p>
         * 
         * <strong>example:</strong>
         * <p>2015-11-12T09:23Z</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The UNIX timestamp representing when the DNS instance was purchased.</p>
         * 
         * <strong>example:</strong>
         * <p>1474335170000</p>
         */
        @NameInMap("StartTimestamp")
        public Long startTimestamp;

        /**
         * <p>The number of subdomain name levels.</p>
         * 
         * <strong>example:</strong>
         * <p>6</p>
         */
        @NameInMap("SubDomainLevel")
        public Long subDomainLevel;

        /**
         * <p>The minimum TTL. Unit: seconds.</p>
         * 
         * <strong>example:</strong>
         * <p>10</p>
         */
        @NameInMap("TTLMinValue")
        public Long TTLMinValue;

        /**
         * <p>The URL forwarding quantity.</p>
         * 
         * <strong>example:</strong>
         * <p>20</p>
         */
        @NameInMap("URLForwardCount")
        public Long URLForwardCount;

        /**
         * <p>The version code of the Alibaba Cloud DNS instance.</p>
         * 
         * <strong>example:</strong>
         * <p>version1</p>
         */
        @NameInMap("VersionCode")
        public String versionCode;

        /**
         * <p>The version name of the Alibaba Cloud DNS instance.</p>
         * 
         * <strong>example:</strong>
         * <p>Alibaba Cloud DNS</p>
         */
        @NameInMap("VersionName")
        public String versionName;

        public static DescribeDnsProductInstancesResponseBodyDnsProductsDnsProduct build(java.util.Map<String, ?> map) throws Exception {
            DescribeDnsProductInstancesResponseBodyDnsProductsDnsProduct self = new DescribeDnsProductInstancesResponseBodyDnsProductsDnsProduct();
            return TeaModel.build(map, self);
        }

        public DescribeDnsProductInstancesResponseBodyDnsProductsDnsProduct setAutoRenewal(Boolean autoRenewal) {
            this.autoRenewal = autoRenewal;
            return this;
        }
        public Boolean getAutoRenewal() {
            return this.autoRenewal;
        }

        public DescribeDnsProductInstancesResponseBodyDnsProductsDnsProduct setBindCount(Long bindCount) {
            this.bindCount = bindCount;
            return this;
        }
        public Long getBindCount() {
            return this.bindCount;
        }

        public DescribeDnsProductInstancesResponseBodyDnsProductsDnsProduct setBindDomainCount(Long bindDomainCount) {
            this.bindDomainCount = bindDomainCount;
            return this;
        }
        public Long getBindDomainCount() {
            return this.bindDomainCount;
        }

        public DescribeDnsProductInstancesResponseBodyDnsProductsDnsProduct setBindDomainUsedCount(Long bindDomainUsedCount) {
            this.bindDomainUsedCount = bindDomainUsedCount;
            return this;
        }
        public Long getBindDomainUsedCount() {
            return this.bindDomainUsedCount;
        }

        public DescribeDnsProductInstancesResponseBodyDnsProductsDnsProduct setBindUsedCount(Long bindUsedCount) {
            this.bindUsedCount = bindUsedCount;
            return this;
        }
        public Long getBindUsedCount() {
            return this.bindUsedCount;
        }

        public DescribeDnsProductInstancesResponseBodyDnsProductsDnsProduct setDDosDefendFlow(Long DDosDefendFlow) {
            this.DDosDefendFlow = DDosDefendFlow;
            return this;
        }
        public Long getDDosDefendFlow() {
            return this.DDosDefendFlow;
        }

        public DescribeDnsProductInstancesResponseBodyDnsProductsDnsProduct setDDosDefendQuery(Long DDosDefendQuery) {
            this.DDosDefendQuery = DDosDefendQuery;
            return this;
        }
        public Long getDDosDefendQuery() {
            return this.DDosDefendQuery;
        }

        public DescribeDnsProductInstancesResponseBodyDnsProductsDnsProduct setDnsSLBCount(Long dnsSLBCount) {
            this.dnsSLBCount = dnsSLBCount;
            return this;
        }
        public Long getDnsSLBCount() {
            return this.dnsSLBCount;
        }

        public DescribeDnsProductInstancesResponseBodyDnsProductsDnsProduct setDnsSecurity(String dnsSecurity) {
            this.dnsSecurity = dnsSecurity;
            return this;
        }
        public String getDnsSecurity() {
            return this.dnsSecurity;
        }

        public DescribeDnsProductInstancesResponseBodyDnsProductsDnsProduct setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public DescribeDnsProductInstancesResponseBodyDnsProductsDnsProduct setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribeDnsProductInstancesResponseBodyDnsProductsDnsProduct setEndTimestamp(Long endTimestamp) {
            this.endTimestamp = endTimestamp;
            return this;
        }
        public Long getEndTimestamp() {
            return this.endTimestamp;
        }

        public DescribeDnsProductInstancesResponseBodyDnsProductsDnsProduct setGslb(Boolean gslb) {
            this.gslb = gslb;
            return this;
        }
        public Boolean getGslb() {
            return this.gslb;
        }

        public DescribeDnsProductInstancesResponseBodyDnsProductsDnsProduct setISPLines(String ISPLines) {
            this.ISPLines = ISPLines;
            return this;
        }
        public String getISPLines() {
            return this.ISPLines;
        }

        public DescribeDnsProductInstancesResponseBodyDnsProductsDnsProduct setISPRegionLines(String ISPRegionLines) {
            this.ISPRegionLines = ISPRegionLines;
            return this;
        }
        public String getISPRegionLines() {
            return this.ISPRegionLines;
        }

        public DescribeDnsProductInstancesResponseBodyDnsProductsDnsProduct setInBlackHole(Boolean inBlackHole) {
            this.inBlackHole = inBlackHole;
            return this;
        }
        public Boolean getInBlackHole() {
            return this.inBlackHole;
        }

        public DescribeDnsProductInstancesResponseBodyDnsProductsDnsProduct setInClean(Boolean inClean) {
            this.inClean = inClean;
            return this;
        }
        public Boolean getInClean() {
            return this.inClean;
        }

        public DescribeDnsProductInstancesResponseBodyDnsProductsDnsProduct setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeDnsProductInstancesResponseBodyDnsProductsDnsProduct setMonitorFrequency(Long monitorFrequency) {
            this.monitorFrequency = monitorFrequency;
            return this;
        }
        public Long getMonitorFrequency() {
            return this.monitorFrequency;
        }

        public DescribeDnsProductInstancesResponseBodyDnsProductsDnsProduct setMonitorNodeCount(Long monitorNodeCount) {
            this.monitorNodeCount = monitorNodeCount;
            return this;
        }
        public Long getMonitorNodeCount() {
            return this.monitorNodeCount;
        }

        public DescribeDnsProductInstancesResponseBodyDnsProductsDnsProduct setMonitorTaskCount(Long monitorTaskCount) {
            this.monitorTaskCount = monitorTaskCount;
            return this;
        }
        public Long getMonitorTaskCount() {
            return this.monitorTaskCount;
        }

        public DescribeDnsProductInstancesResponseBodyDnsProductsDnsProduct setOverseaDDosDefendFlow(Long overseaDDosDefendFlow) {
            this.overseaDDosDefendFlow = overseaDDosDefendFlow;
            return this;
        }
        public Long getOverseaDDosDefendFlow() {
            return this.overseaDDosDefendFlow;
        }

        public DescribeDnsProductInstancesResponseBodyDnsProductsDnsProduct setOverseaLine(String overseaLine) {
            this.overseaLine = overseaLine;
            return this;
        }
        public String getOverseaLine() {
            return this.overseaLine;
        }

        public DescribeDnsProductInstancesResponseBodyDnsProductsDnsProduct setPaymentType(String paymentType) {
            this.paymentType = paymentType;
            return this;
        }
        public String getPaymentType() {
            return this.paymentType;
        }

        public DescribeDnsProductInstancesResponseBodyDnsProductsDnsProduct setRegionLines(Boolean regionLines) {
            this.regionLines = regionLines;
            return this;
        }
        public Boolean getRegionLines() {
            return this.regionLines;
        }

        public DescribeDnsProductInstancesResponseBodyDnsProductsDnsProduct setSearchEngineLines(String searchEngineLines) {
            this.searchEngineLines = searchEngineLines;
            return this;
        }
        public String getSearchEngineLines() {
            return this.searchEngineLines;
        }

        public DescribeDnsProductInstancesResponseBodyDnsProductsDnsProduct setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeDnsProductInstancesResponseBodyDnsProductsDnsProduct setStartTimestamp(Long startTimestamp) {
            this.startTimestamp = startTimestamp;
            return this;
        }
        public Long getStartTimestamp() {
            return this.startTimestamp;
        }

        public DescribeDnsProductInstancesResponseBodyDnsProductsDnsProduct setSubDomainLevel(Long subDomainLevel) {
            this.subDomainLevel = subDomainLevel;
            return this;
        }
        public Long getSubDomainLevel() {
            return this.subDomainLevel;
        }

        public DescribeDnsProductInstancesResponseBodyDnsProductsDnsProduct setTTLMinValue(Long TTLMinValue) {
            this.TTLMinValue = TTLMinValue;
            return this;
        }
        public Long getTTLMinValue() {
            return this.TTLMinValue;
        }

        public DescribeDnsProductInstancesResponseBodyDnsProductsDnsProduct setURLForwardCount(Long URLForwardCount) {
            this.URLForwardCount = URLForwardCount;
            return this;
        }
        public Long getURLForwardCount() {
            return this.URLForwardCount;
        }

        public DescribeDnsProductInstancesResponseBodyDnsProductsDnsProduct setVersionCode(String versionCode) {
            this.versionCode = versionCode;
            return this;
        }
        public String getVersionCode() {
            return this.versionCode;
        }

        public DescribeDnsProductInstancesResponseBodyDnsProductsDnsProduct setVersionName(String versionName) {
            this.versionName = versionName;
            return this;
        }
        public String getVersionName() {
            return this.versionName;
        }

    }

    public static class DescribeDnsProductInstancesResponseBodyDnsProducts extends TeaModel {
        @NameInMap("DnsProduct")
        public java.util.List<DescribeDnsProductInstancesResponseBodyDnsProductsDnsProduct> dnsProduct;

        public static DescribeDnsProductInstancesResponseBodyDnsProducts build(java.util.Map<String, ?> map) throws Exception {
            DescribeDnsProductInstancesResponseBodyDnsProducts self = new DescribeDnsProductInstancesResponseBodyDnsProducts();
            return TeaModel.build(map, self);
        }

        public DescribeDnsProductInstancesResponseBodyDnsProducts setDnsProduct(java.util.List<DescribeDnsProductInstancesResponseBodyDnsProductsDnsProduct> dnsProduct) {
            this.dnsProduct = dnsProduct;
            return this;
        }
        public java.util.List<DescribeDnsProductInstancesResponseBodyDnsProductsDnsProduct> getDnsProduct() {
            return this.dnsProduct;
        }

    }

}
