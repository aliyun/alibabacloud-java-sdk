// This file is auto-generated, don't edit it. Thanks.
package com.aliyun.alidns20150109.models;

import com.aliyun.tea.*;

public class DescribeDnsProductInstancesResponse extends TeaModel {
    @NameInMap("RequestId")
    @Validation(required = true)
    public String requestId;

    @NameInMap("TotalCount")
    @Validation(required = true)
    public Long totalCount;

    @NameInMap("PageNumber")
    @Validation(required = true)
    public Long pageNumber;

    @NameInMap("PageSize")
    @Validation(required = true)
    public Long pageSize;

    @NameInMap("DomainType")
    @Validation(required = true)
    public String domainType;

    @NameInMap("DnsProducts")
    @Validation(required = true)
    public DescribeDnsProductInstancesResponseDnsProducts dnsProducts;

    public static DescribeDnsProductInstancesResponse build(java.util.Map<String, ?> map) throws Exception {
        DescribeDnsProductInstancesResponse self = new DescribeDnsProductInstancesResponse();
        return TeaModel.build(map, self);
    }

    public DescribeDnsProductInstancesResponse setRequestId(String requestId) {
        this.requestId = requestId;
        return this;
    }
    public String getRequestId() {
        return this.requestId;
    }

    public DescribeDnsProductInstancesResponse setTotalCount(Long totalCount) {
        this.totalCount = totalCount;
        return this;
    }
    public Long getTotalCount() {
        return this.totalCount;
    }

    public DescribeDnsProductInstancesResponse setPageNumber(Long pageNumber) {
        this.pageNumber = pageNumber;
        return this;
    }
    public Long getPageNumber() {
        return this.pageNumber;
    }

    public DescribeDnsProductInstancesResponse setPageSize(Long pageSize) {
        this.pageSize = pageSize;
        return this;
    }
    public Long getPageSize() {
        return this.pageSize;
    }

    public DescribeDnsProductInstancesResponse setDomainType(String domainType) {
        this.domainType = domainType;
        return this;
    }
    public String getDomainType() {
        return this.domainType;
    }

    public DescribeDnsProductInstancesResponse setDnsProducts(DescribeDnsProductInstancesResponseDnsProducts dnsProducts) {
        this.dnsProducts = dnsProducts;
        return this;
    }
    public DescribeDnsProductInstancesResponseDnsProducts getDnsProducts() {
        return this.dnsProducts;
    }

    public static class DescribeDnsProductInstancesResponseDnsProductsDnsProduct extends TeaModel {
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

        @NameInMap("EndTime")
        @Validation(required = true)
        public String endTime;

        @NameInMap("StartTimestamp")
        @Validation(required = true)
        public Long startTimestamp;

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

        public static DescribeDnsProductInstancesResponseDnsProductsDnsProduct build(java.util.Map<String, ?> map) throws Exception {
            DescribeDnsProductInstancesResponseDnsProductsDnsProduct self = new DescribeDnsProductInstancesResponseDnsProductsDnsProduct();
            return TeaModel.build(map, self);
        }

        public DescribeDnsProductInstancesResponseDnsProductsDnsProduct setInstanceId(String instanceId) {
            this.instanceId = instanceId;
            return this;
        }
        public String getInstanceId() {
            return this.instanceId;
        }

        public DescribeDnsProductInstancesResponseDnsProductsDnsProduct setVersionCode(String versionCode) {
            this.versionCode = versionCode;
            return this;
        }
        public String getVersionCode() {
            return this.versionCode;
        }

        public DescribeDnsProductInstancesResponseDnsProductsDnsProduct setVersionName(String versionName) {
            this.versionName = versionName;
            return this;
        }
        public String getVersionName() {
            return this.versionName;
        }

        public DescribeDnsProductInstancesResponseDnsProductsDnsProduct setStartTime(String startTime) {
            this.startTime = startTime;
            return this;
        }
        public String getStartTime() {
            return this.startTime;
        }

        public DescribeDnsProductInstancesResponseDnsProductsDnsProduct setEndTime(String endTime) {
            this.endTime = endTime;
            return this;
        }
        public String getEndTime() {
            return this.endTime;
        }

        public DescribeDnsProductInstancesResponseDnsProductsDnsProduct setStartTimestamp(Long startTimestamp) {
            this.startTimestamp = startTimestamp;
            return this;
        }
        public Long getStartTimestamp() {
            return this.startTimestamp;
        }

        public DescribeDnsProductInstancesResponseDnsProductsDnsProduct setEndTimestamp(Long endTimestamp) {
            this.endTimestamp = endTimestamp;
            return this;
        }
        public Long getEndTimestamp() {
            return this.endTimestamp;
        }

        public DescribeDnsProductInstancesResponseDnsProductsDnsProduct setDomain(String domain) {
            this.domain = domain;
            return this;
        }
        public String getDomain() {
            return this.domain;
        }

        public DescribeDnsProductInstancesResponseDnsProductsDnsProduct setBindCount(Long bindCount) {
            this.bindCount = bindCount;
            return this;
        }
        public Long getBindCount() {
            return this.bindCount;
        }

        public DescribeDnsProductInstancesResponseDnsProductsDnsProduct setBindUsedCount(Long bindUsedCount) {
            this.bindUsedCount = bindUsedCount;
            return this;
        }
        public Long getBindUsedCount() {
            return this.bindUsedCount;
        }

        public DescribeDnsProductInstancesResponseDnsProductsDnsProduct setTTLMinValue(Long TTLMinValue) {
            this.TTLMinValue = TTLMinValue;
            return this;
        }
        public Long getTTLMinValue() {
            return this.TTLMinValue;
        }

        public DescribeDnsProductInstancesResponseDnsProductsDnsProduct setSubDomainLevel(Long subDomainLevel) {
            this.subDomainLevel = subDomainLevel;
            return this;
        }
        public Long getSubDomainLevel() {
            return this.subDomainLevel;
        }

        public DescribeDnsProductInstancesResponseDnsProductsDnsProduct setDnsSLBCount(Long dnsSLBCount) {
            this.dnsSLBCount = dnsSLBCount;
            return this;
        }
        public Long getDnsSLBCount() {
            return this.dnsSLBCount;
        }

        public DescribeDnsProductInstancesResponseDnsProductsDnsProduct setURLForwardCount(Long URLForwardCount) {
            this.URLForwardCount = URLForwardCount;
            return this;
        }
        public Long getURLForwardCount() {
            return this.URLForwardCount;
        }

        public DescribeDnsProductInstancesResponseDnsProductsDnsProduct setDDosDefendFlow(Long DDosDefendFlow) {
            this.DDosDefendFlow = DDosDefendFlow;
            return this;
        }
        public Long getDDosDefendFlow() {
            return this.DDosDefendFlow;
        }

        public DescribeDnsProductInstancesResponseDnsProductsDnsProduct setDDosDefendQuery(Long DDosDefendQuery) {
            this.DDosDefendQuery = DDosDefendQuery;
            return this;
        }
        public Long getDDosDefendQuery() {
            return this.DDosDefendQuery;
        }

        public DescribeDnsProductInstancesResponseDnsProductsDnsProduct setOverseaDDosDefendFlow(Long overseaDDosDefendFlow) {
            this.overseaDDosDefendFlow = overseaDDosDefendFlow;
            return this;
        }
        public Long getOverseaDDosDefendFlow() {
            return this.overseaDDosDefendFlow;
        }

        public DescribeDnsProductInstancesResponseDnsProductsDnsProduct setSearchEngineLines(String searchEngineLines) {
            this.searchEngineLines = searchEngineLines;
            return this;
        }
        public String getSearchEngineLines() {
            return this.searchEngineLines;
        }

        public DescribeDnsProductInstancesResponseDnsProductsDnsProduct setISPLines(String ISPLines) {
            this.ISPLines = ISPLines;
            return this;
        }
        public String getISPLines() {
            return this.ISPLines;
        }

        public DescribeDnsProductInstancesResponseDnsProductsDnsProduct setISPRegionLines(String ISPRegionLines) {
            this.ISPRegionLines = ISPRegionLines;
            return this;
        }
        public String getISPRegionLines() {
            return this.ISPRegionLines;
        }

        public DescribeDnsProductInstancesResponseDnsProductsDnsProduct setOverseaLine(String overseaLine) {
            this.overseaLine = overseaLine;
            return this;
        }
        public String getOverseaLine() {
            return this.overseaLine;
        }

        public DescribeDnsProductInstancesResponseDnsProductsDnsProduct setMonitorNodeCount(Long monitorNodeCount) {
            this.monitorNodeCount = monitorNodeCount;
            return this;
        }
        public Long getMonitorNodeCount() {
            return this.monitorNodeCount;
        }

        public DescribeDnsProductInstancesResponseDnsProductsDnsProduct setMonitorFrequency(Long monitorFrequency) {
            this.monitorFrequency = monitorFrequency;
            return this;
        }
        public Long getMonitorFrequency() {
            return this.monitorFrequency;
        }

        public DescribeDnsProductInstancesResponseDnsProductsDnsProduct setMonitorTaskCount(Long monitorTaskCount) {
            this.monitorTaskCount = monitorTaskCount;
            return this;
        }
        public Long getMonitorTaskCount() {
            return this.monitorTaskCount;
        }

        public DescribeDnsProductInstancesResponseDnsProductsDnsProduct setRegionLines(Boolean regionLines) {
            this.regionLines = regionLines;
            return this;
        }
        public Boolean getRegionLines() {
            return this.regionLines;
        }

        public DescribeDnsProductInstancesResponseDnsProductsDnsProduct setGslb(Boolean gslb) {
            this.gslb = gslb;
            return this;
        }
        public Boolean getGslb() {
            return this.gslb;
        }

        public DescribeDnsProductInstancesResponseDnsProductsDnsProduct setInClean(Boolean inClean) {
            this.inClean = inClean;
            return this;
        }
        public Boolean getInClean() {
            return this.inClean;
        }

        public DescribeDnsProductInstancesResponseDnsProductsDnsProduct setInBlackHole(Boolean inBlackHole) {
            this.inBlackHole = inBlackHole;
            return this;
        }
        public Boolean getInBlackHole() {
            return this.inBlackHole;
        }

        public DescribeDnsProductInstancesResponseDnsProductsDnsProduct setBindDomainCount(Long bindDomainCount) {
            this.bindDomainCount = bindDomainCount;
            return this;
        }
        public Long getBindDomainCount() {
            return this.bindDomainCount;
        }

        public DescribeDnsProductInstancesResponseDnsProductsDnsProduct setBindDomainUsedCount(Long bindDomainUsedCount) {
            this.bindDomainUsedCount = bindDomainUsedCount;
            return this;
        }
        public Long getBindDomainUsedCount() {
            return this.bindDomainUsedCount;
        }

        public DescribeDnsProductInstancesResponseDnsProductsDnsProduct setDnsSecurity(String dnsSecurity) {
            this.dnsSecurity = dnsSecurity;
            return this;
        }
        public String getDnsSecurity() {
            return this.dnsSecurity;
        }

        public DescribeDnsProductInstancesResponseDnsProductsDnsProduct setPaymentType(String paymentType) {
            this.paymentType = paymentType;
            return this;
        }
        public String getPaymentType() {
            return this.paymentType;
        }

    }

    public static class DescribeDnsProductInstancesResponseDnsProducts extends TeaModel {
        @NameInMap("DnsProduct")
        @Validation(required = true)
        public java.util.List<DescribeDnsProductInstancesResponseDnsProductsDnsProduct> dnsProduct;

        public static DescribeDnsProductInstancesResponseDnsProducts build(java.util.Map<String, ?> map) throws Exception {
            DescribeDnsProductInstancesResponseDnsProducts self = new DescribeDnsProductInstancesResponseDnsProducts();
            return TeaModel.build(map, self);
        }

        public DescribeDnsProductInstancesResponseDnsProducts setDnsProduct(java.util.List<DescribeDnsProductInstancesResponseDnsProductsDnsProduct> dnsProduct) {
            this.dnsProduct = dnsProduct;
            return this;
        }
        public java.util.List<DescribeDnsProductInstancesResponseDnsProductsDnsProduct> getDnsProduct() {
            return this.dnsProduct;
        }

    }

}
