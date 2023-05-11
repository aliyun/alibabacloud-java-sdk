// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDnsProductInstancesResponseBody extends TeaModel {
    /**
     * <p>The type of the overseas line.</p>
     */
    @NameInMap("DnsProducts")
    public DescribeDnsProductInstancesResponseBodyDnsProducts dnsProducts;

    @NameInMap("DomainType")
    public String domainType;

    /**
     * <p>The list of Alibaba Cloud DNS instances obtained by this operation.</p>
     */
    @NameInMap("PageNumber")
    public Long pageNumber;

    /**
     * <p>The ID of the request.</p>
     */
    @NameInMap("PageSize")
    public Long pageSize;

    /**
     * <p>The page number of the returned page.</p>
     */
    @NameInMap("RequestId")
    public String requestId;

    /**
     * <p>The number of entries returned per page.</p>
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
         * <p>The number of subdomain name levels.</p>
         */
        @NameInMap("BindCount")
        public Long bindCount;

        /**
         * <p>The time at which the instance expired.</p>
         */
        @NameInMap("BindDomainCount")
        public Long bindDomainCount;

        /**
         * <p>The list of ISP line subdivisions.</p>
         */
        @NameInMap("BindDomainUsedCount")
        public Long bindDomainUsedCount;

        /**
         * <p>The bound domain name.</p>
         */
        @NameInMap("BindUsedCount")
        public Long bindUsedCount;

        /**
         * <p>The number of times you can change domain names that are bound to the DNS instance. It can be specified by the user who uses Alibaba Cloud DNS of the custom version.</p>
         */
        @NameInMap("DDosDefendFlow")
        public Long DDosDefendFlow;

        /**
         * <p>The ID of the Alibaba Cloud DNS instance.</p>
         */
        @NameInMap("DDosDefendQuery")
        public Long DDosDefendQuery;

        @NameInMap("DnsSLBCount")
        public Long dnsSLBCount;

        /**
         * <p>The number of IP addresses supported by a domain name or line.</p>
         */
        @NameInMap("DnsSecurity")
        public String dnsSecurity;

        /**
         * <p>The monitoring frequency. Unit: minutes.</p>
         */
        @NameInMap("Domain")
        public String domain;

        /**
         * <p>The time when the DNS instance was purchased.</p>
         */
        @NameInMap("EndTime")
        public String endTime;

        /**
         * <p>The version name of the Alibaba Cloud DNS instance.</p>
         */
        @NameInMap("EndTimestamp")
        public Long endTimestamp;

        /**
         * <p>The DNS security policy. Valid values:</p>
         * <br>
         * <p>*   **no**: not required.</p>
         * <p>*   **basic**: anti-DDoS basic.</p>
         * <p>*   **advanced**: anti-DDoS advanced.</p>
         */
        @NameInMap("Gslb")
        public Boolean gslb;

        /**
         * <p>The list of search engine lines.</p>
         */
        @NameInMap("ISPLines")
        public String ISPLines;

        /**
         * <p>The minimum TTL. Unit: seconds.</p>
         */
        @NameInMap("ISPRegionLines")
        public String ISPRegionLines;

        /**
         * <p>The number of domain names that have been bound to the DNS instance.</p>
         */
        @NameInMap("InBlackHole")
        public Boolean inBlackHole;

        /**
         * <p>The URL forwarding quantity.</p>
         */
        @NameInMap("InClean")
        public Boolean inClean;

        /**
         * <p>The DDoS protection traffic. Unit: GB.</p>
         */
        @NameInMap("InstanceId")
        public String instanceId;

        /**
         * <p>Indicates whether the request for domain name resolution was being cleared.</p>
         */
        @NameInMap("MonitorFrequency")
        public Long monitorFrequency;

        /**
         * <p>Indicates whether the request for domain name resolution was in the black hole.</p>
         */
        @NameInMap("MonitorNodeCount")
        public Long monitorNodeCount;

        /**
         * <p>The number of times you have changed domain names that are bound to the DNS instance. It can be specified by the user who uses Alibaba Cloud DNS of the custom version.</p>
         */
        @NameInMap("MonitorTaskCount")
        public Long monitorTaskCount;

        /**
         * <p>Indicates whether regional lines were allowed.</p>
         */
        @NameInMap("OverseaDDosDefendFlow")
        public Long overseaDDosDefendFlow;

        /**
         * <p>The number of monitored nodes.</p>
         */
        @NameInMap("OverseaLine")
        public String overseaLine;

        @NameInMap("PaymentType")
        public String paymentType;

        /**
         * <p>Indicates whether global server load balancing (GSLB) was allowed.</p>
         */
        @NameInMap("RegionLines")
        public Boolean regionLines;

        /**
         * <p>The UNIX timestamp representing the expiration time of the instance.</p>
         */
        @NameInMap("SearchEngineLines")
        public String searchEngineLines;

        /**
         * <p>DDoS protection traffic outside China. Unit: GB.</p>
         */
        @NameInMap("StartTime")
        public String startTime;

        /**
         * <p>The DDoS protection frequency. Unit: 10,000 QPS.</p>
         */
        @NameInMap("StartTimestamp")
        public Long startTimestamp;

        /**
         * <p>The number of domain names that can be bound to the DNS instance.</p>
         */
        @NameInMap("SubDomainLevel")
        public Long subDomainLevel;

        /**
         * <p>The list of ISP lines.</p>
         */
        @NameInMap("TTLMinValue")
        public Long TTLMinValue;

        /**
         * <p>The UNIX timestamp representing when the DNS instance was purchased.</p>
         */
        @NameInMap("URLForwardCount")
        public Long URLForwardCount;

        /**
         * <p>The number of monitoring tasks.</p>
         */
        @NameInMap("VersionCode")
        public String versionCode;

        /**
         * <p>The version code of the Alibaba Cloud DNS instance.</p>
         */
        @NameInMap("VersionName")
        public String versionName;

        public static DescribeDnsProductInstancesResponseBodyDnsProductsDnsProduct build(java.util.Map<String, ?> map) throws Exception {
            DescribeDnsProductInstancesResponseBodyDnsProductsDnsProduct self = new DescribeDnsProductInstancesResponseBodyDnsProductsDnsProduct();
            return TeaModel.build(map, self);
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
