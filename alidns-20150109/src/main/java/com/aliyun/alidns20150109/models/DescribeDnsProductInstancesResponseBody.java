// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDnsProductInstancesResponseBody extends TeaModel {
    @NameInMap("DnsProducts")
    public DescribeDnsProductInstancesResponseBodyDnsProducts dnsProducts;

    @NameInMap("DomainType")
    public String domainType;

    @NameInMap("PageNumber")
    public Long pageNumber;

    @NameInMap("PageSize")
    public Long pageSize;

    @NameInMap("RequestId")
    public String requestId;

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

        @NameInMap("Domain")
        public String domain;

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
